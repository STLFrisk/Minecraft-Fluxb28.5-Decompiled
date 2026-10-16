#!/usr/bin/env python3
"""Zelix KlassMaster 12.x "Stringer" call-site extractor.

For every class in the tree it:
  * parses the full class file (constant pool, fields, methods, Code attributes),
  * finds the ZKM string-decryption bootstrap (a static method on the same class whose
    call-site descriptor returns java.lang.String from (I,J) - or a subset),
  * scans every method's bytecode for invokedynamic call sites that use it,
  * backward-resolves the two dynamic arguments (int n, long lExpression),
  * reduces lExpression to  l = (classKeyField) XOR accum   or   l = accum,
  * writes a TSV the Java dumper can consume.

Nothing is guessed silently: a call site that cannot be reduced is written to the
"unresolved" file with the exact opcode that stopped the reduction.
"""
import os
import sys
import json
import struct

# ---------------------------------------------------------------- opcode lengths
# JVM opcodes -> operand byte count (operands follow the opcode).
_LEN = {i: 0 for i in range(256)}
for _i in (0x10, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0xbc,
           0x36, 0x37, 0x38, 0x39, 0x3a, 0xa9):
    _LEN[_i] = 1
for _i in (0x11, 0x84, 0x99, 0x9a, 0x9b, 0x9c, 0x9d, 0x9e, 0x9f,
           0xa0, 0xa1, 0xa2, 0xa3, 0xa4, 0xa5, 0xa6, 0xa7, 0xa8, 0xb2,
           0xb3, 0xb4, 0xb5, 0xb6, 0xb7, 0xb8, 0xbb, 0xbd, 0xc0, 0xc1,
           0xc6, 0xc7):
    _LEN[_i] = 2
_LEN[0x13] = 2
_LEN[0x14] = 2
_LEN[0xb9] = 4          # invokeinterface: index(2) + count(1) + 0(1)
_LEN[0xba] = 4          # invokedynamic: index(2) + 0 + 0
_LEN[0xc5] = 3          # multianewarray: index(2) + dims(1)
_LEN[0xc8] = 4          # goto_w
_LEN[0xc9] = 4          # jsr_w
_LEN[0xc4] = -2         # wide: handled specially in decode_instructions
for _i in (0xaa, 0xab):  # tableswitch / lookupswitch need 4-byte alignment padding
    _LEN[_i] = -1

CONST_UTF8, CONST_INT, CONST_FLOAT = 1, 3, 4
CONST_LONG, CONST_DOUBLE, CONST_CLASS = 5, 6, 7
CONST_STRING, CONST_FIELDREF, CONST_METHODREF = 8, 9, 10
CONST_IFACEMETHODREF, CONST_NAMEANDTYPE = 11, 12
CONST_METHODHANDLE, CONST_METHODTYPE = 15, 16
CONST_DYNAMIC, CONST_INVOKEDYNAMIC = 17, 18
CONST_MODULE, CONST_PACKAGE = 19, 20


class Reader:
    def __init__(self, blob, off=0):
        self.b = blob
        self.o = off

    def u1(self):
        v = self.b[self.o]
        self.o += 1
        return v

    def u2(self):
        v = struct.unpack_from('>H', self.b, self.o)[0]
        self.o += 2
        return v

    def u4(self):
        v = struct.unpack_from('>I', self.b, self.o)[0]
        self.o += 4
        return v

    def s1(self):
        v = struct.unpack_from('>b', self.b, self.o)[0]
        self.o += 1
        return v

    def s2(self):
        v = struct.unpack_from('>h', self.b, self.o)[0]
        self.o += 2
        return v

    def s4(self):
        v = struct.unpack_from('>i', self.b, self.o)[0]
        self.o += 4
        return v

    def s8(self):
        v = struct.unpack_from('>q', self.b, self.o)[0]
        self.o += 8
        return v

    def take(self, n):
        v = self.b[self.o:self.o + n]
        self.o += n
        return v


def parse_constant_pool(r):
    count = r.u2()
    pool = [None] * count
    i = 1
    while i < count:
        tag = r.u1()
        if tag == CONST_UTF8:
            pool[i] = (tag, r.take(r.u2()).decode('utf-8', 'surrogateescape'))
        elif tag in (CONST_INT, CONST_FLOAT):
            pool[i] = (tag, r.s4())
        elif tag in (CONST_LONG, CONST_DOUBLE):
            pool[i] = (tag, r.s8())
            i += 1
        elif tag in (CONST_CLASS, CONST_STRING, CONST_METHODTYPE,
                     CONST_MODULE, CONST_PACKAGE):
            pool[i] = (tag, r.u2())
        elif tag in (CONST_FIELDREF, CONST_METHODREF, CONST_IFACEMETHODREF,
                     CONST_NAMEANDTYPE, CONST_DYNAMIC, CONST_INVOKEDYNAMIC):
            pool[i] = (tag, (r.u2(), r.u2()))
        elif tag == CONST_METHODHANDLE:
            pool[i] = (tag, (r.u1(), r.u2()))
        else:
            raise ValueError('unknown constant tag %d' % tag)
        i += 1
    return pool


def utf(pool, idx):
    if not idx or idx >= len(pool) or pool[idx] is None:
        return None
    return pool[idx][1] if pool[idx][0] == CONST_UTF8 else None


def class_name(pool, idx):
    if not idx or idx >= len(pool) or pool[idx] is None or pool[idx][0] != CONST_CLASS:
        return None
    return (utf(pool, pool[idx][1]) or '').replace('/', '.')


def ref_name(pool, idx):
    """FIELDREF/METHODREF -> 'owner.name'."""
    if not idx or idx >= len(pool) or pool[idx] is None:
        return None
    tag, (cls_i, nat_i) = pool[idx]
    owner = class_name(pool, cls_i)
    name = None
    if nat_i and nat_i < len(pool) and pool[nat_i]:
        name = utf(pool, pool[nat_i][1][0])
    return '%s.%s' % (owner, name) if owner else name


def nat_desc(pool, idx):
    if not idx or idx >= len(pool) or pool[idx] is None:
        return None
    _tag, (_n, d) = pool[idx]
    return utf(pool, d)


# ------------------------------------------------------------ expression values
# A long value is represented as a XOR-accumulation over at most one symbolic key
# field plus a 64-bit constant:   value = (KEY_field if keys else 0) ^ acc
MASK64 = (1 << 64) - 1


class Val:
    __slots__ = ('keys', 'acc', 'unknown')

    def __init__(self, keys=frozenset(), acc=0, unknown=None):
        self.keys = keys
        self.acc = acc & MASK64
        self.unknown = unknown

    @staticmethod
    def const(v):
        return Val(frozenset(), v)

    @staticmethod
    def key(field):
        return Val(frozenset([field]), 0)

    @staticmethod
    def bad(reason):
        return Val(unknown=reason)

    def xor(self, other):
        if self.unknown:
            return self
        if other.unknown:
            return other
        keys = self.keys ^ other.keys
        if len(keys) > 1:
            return Val.bad('xor of two distinct key fields: %s' % sorted(keys))
        return Val(keys, self.acc ^ other.acc)

    def known(self):
        return self.unknown is None


def decode_instructions(code):
    """Linear decode -> list of (offset, opcode, operands, size)."""
    out = []
    i = 0
    n = len(code)
    while i < n:
        op = code[i]
        ln = _LEN.get(op, 0)
        if ln == -1:                                   # tableswitch / lookupswitch
            pad = (4 - ((i + 1) % 4)) % 4
            j = i + 1 + pad
            if op == 0xaa:
                lo = struct.unpack_from('>i', code, j + 4)[0]
                hi = struct.unpack_from('>i', code, j + 8)[0]
                ln = 1 + pad + 12 + 4 * max(0, hi - lo + 1)
            else:
                npairs = struct.unpack_from('>i', code, j + 4)[0]
                ln = 1 + pad + 8 + 8 * max(0, npairs)
        elif ln == -2:                                 # wide
            sub = code[i + 1]
            ln = 5 if sub == 0x84 else 3
        out.append((i, op, code[i + 1:i + 1 + ln], ln))
        i += 1 + ln
    return out


class MethodScanner:
    """Backward operand resolver over one method's instruction stream."""

    def __init__(self, insns, pool, class_long_fields):
        self.insns = insns
        self.at = {off: k for k, (off, _op, _o, _s) in enumerate(insns)}
        self.pool = pool
        self.long_fields = class_long_fields
        self.unresolved = []

    # ---- individual operand producers -------------------------------------
    def long_start(self, k):
        """Index of the first instruction that produces the long value ending at k."""
        if k < 0:
            return -1
        if self.insns[k][1] == 0x83:                    # lxor
            left_start = self.long_start(k - 1)
            return self.long_start(left_start - 1)
        return k

    def long_at(self, k):
        """Resolve the long operand whose producer ends just before index k."""
        off, op, o, _s = self.insns[k]
        if op == 0x83:                                  # lxor
            a = self.long_at(k - 1)
            left_start = self.long_start(k - 1)
            b = self.long_at(left_start - 1)
            return a.xor(b)
        if op == 0x14:                                  # ldc2_w
            idx = struct.unpack_from('>H', o, 0)[0]
            if self.pool[idx] and self.pool[idx][0] == CONST_LONG:
                return Val.const(self.pool[idx][1])
            return Val.bad('ldc2_w not a long constant')
        if op in (0x09, 0x0a):                          # lconst_0 / lconst_1
            return Val.const(op - 0x09)
        if op == 0x16:                                  # lload
            return self.local_long(o[0], off)
        if 0x1e <= op <= 0x21:                          # lload_0..3
            return self.local_long(op - 0x1e, off)
        if op == 0xb2:                                  # getstatic
            idx = struct.unpack_from('>H', o, 0)[0]
            name = ref_name(self.pool, idx)
            desc = None
            if self.pool[idx] and self.pool[idx][0] == CONST_FIELDREF:
                desc = nat_desc(self.pool, self.pool[idx][1][1])
            if desc == 'J':
                # ZKM may keep the per-class key in another class; the field
                # reference itself is enough, the value is read at runtime.
                return Val.key(name)
            return Val.bad('getstatic %s is not a long (%s)' % (name, desc))
        return Val.bad('opcode 0x%02x cannot produce a long' % op)

    def int_at(self, k):
        off, op, o, _s = self.insns[k]
        if 0x02 <= op <= 0x08:
            return Val.const(op - 0x03)
        if op == 0x10:                                  # bipush
            return Val.const(struct.unpack_from('>b', o, 0)[0] & MASK64)
        if op == 0x11:                                  # sipush
            return Val.const(struct.unpack_from('>h', o, 0)[0] & MASK64)
        if op in (0x12, 0x13):                          # ldc / ldc_w
            idx = o[0] if op == 0x12 else struct.unpack_from('>H', o, 0)[0]
            if self.pool[idx] and self.pool[idx][0] == CONST_INT:
                return Val.const(self.pool[idx][1] & MASK64)
            return Val.bad('ldc not an int constant')
        if op == 0x15:                                  # iload
            v, _ok = self.local_simple(o[0], off)
            return v
        if 0x1a <= op <= 0x1d:
            v, _ok = self.local_simple(op - 0x1a, off)
            return v
        if op == 0x84:                                  # iinc (does not push)
            return Val.bad('iinc cannot produce a pushed int')
        return Val.bad('opcode 0x%02x cannot produce an int' % op)

    def _width(self, k, kind):
        return 1

    def local_long(self, slot, before):
        """Find the last lstore to `slot` before offset `before` and resolve it."""
        best = None
        for k, (off, op, o, _s) in enumerate(self.insns):
            if off >= before:
                break
            if op == 0x37 and o[0] == slot:
                best = k
            elif 0x3f <= op <= 0x42 and (op - 0x3f) == slot:
                best = k
        if best is None:
            return Val.bad('lload %d has no preceding lstore' % slot)
        return self.long_at(best - 1)

    def local_simple(self, slot, before):
        best = None
        for k, (off, op, o, _s) in enumerate(self.insns):
            if off >= before:
                break
            if op == 0x36 and o[0] == slot:
                best = k
            elif 0x3b <= op <= 0x3e and (op - 0x3b) == slot:
                best = k
        if best is None:
            return Val.bad('iload %d has no preceding istore' % slot), False
        return self.int_at(best - 1), True


def zkm_string_descriptor(desc):
    """(I...)Ljava/lang/String; with only I/J params -> ZKM string call site."""
    if not desc or not desc.endswith(')Ljava/lang/String;'):
        return False
    params = desc[1:desc.index(')')]
    if not params:
        return False
    i = 0
    while i < len(params):
        if params[i] in 'IJ':
            i += 1
        elif params[i] == '[':
            while i < len(params) and params[i] == '[':
                i += 1
            if i < len(params) and params[i] in 'BCDFIJSZ':
                i += 1
            elif i < len(params) and params[i] == 'L':
                i = params.index(';', i) + 1
            else:
                return False
        else:
            return False
    return True


def parse_class(path):
    with open(path, 'rb') as fh:
        blob = fh.read()
    if len(blob) < 10 or struct.unpack_from('>I', blob, 0)[0] != 0xCAFEBABE:
        return None
    r = Reader(blob, 8)
    pool = parse_constant_pool(r)
    r.u2(); r.u2()                                      # access, this
    r.u2()                                              # super
    for _ in range(r.u2()):
        r.u2()
    fields = []
    for _ in range(r.u2()):
        acc, name_i, desc_i = r.u2(), r.u2(), r.u2()
        attrs = []
        for _ in range(r.u2()):
            an = utf(pool, r.u2())
            alen = r.u4()
            attrs.append((an, r.take(alen)))
        fields.append((acc, utf(pool, name_i), utf(pool, desc_i), attrs))
    methods = []
    for _ in range(r.u2()):
        acc, name_i, desc_i = r.u2(), r.u2(), r.u2()
        attrs = []
        for _ in range(r.u2()):
            an = utf(pool, r.u2())
            alen = r.u4()
            attrs.append((an, r.take(alen)))
        methods.append((acc, utf(pool, name_i), utf(pool, desc_i), attrs))
    return pool, fields, methods


def extract(path, cls_name):
    parsed = parse_class(path)
    if parsed is None:
        return None
    pool, fields, methods = parsed

    long_fields = set()
    for acc, name, desc, _a in fields:
        if desc == 'J' and (acc & 0x0008):              # static long
            long_fields.add('%s.%s' % (cls_name, name))

    calls, unresolved = [], []
    for _acc, mname, mdesc, attrs in methods:
        for aname, abytes in attrs:
            if aname != 'Code':
                continue
            cr = Reader(abytes)
            cr.u2(); cr.u2()
            code = cr.take(cr.u4())
            try:
                insns = decode_instructions(code)
            except Exception as exc:
                unresolved.append((mname, -1, 'decode failed: %s' % exc))
                continue
            sc = MethodScanner(insns, pool, long_fields)
            for k, (off, op, o, _s) in enumerate(insns):
                if op != 0xba:                          # invokedynamic
                    continue
                cp_i = struct.unpack_from('>H', o, 0)[0]
                if not pool[cp_i] or pool[cp_i][0] != CONST_INVOKEDYNAMIC:
                    continue
                nat_i = pool[cp_i][1][1]
                desc = nat_desc(pool, nat_i)
                if not zkm_string_descriptor(desc):
                    continue
                # dynamic args were pushed left-to-right; long is on top
                lv = sc.long_at(k - 1)
                lstart = sc.long_start(k - 1)
                if lstart < 0:
                    unresolved.append((mname, off, 'long operand start not found'))
                    continue
                iv = sc.int_at(lstart - 1)
                if not lv.known() or not iv.known():
                    unresolved.append((mname, off, (lv.unknown or iv.unknown)))
                    continue
                key = sorted(lv.keys)[0] if lv.keys else ''
                calls.append((cls_name, key, iv.acc, lv.acc, 1 if lv.keys else 0,
                              desc, mname, off))
    return calls, unresolved


def main():
    root, out_dir = sys.argv[1], sys.argv[2]
    os.makedirs(out_dir, exist_ok=True)
    all_calls, all_unres, failures = [], [], []
    files = []
    for dp, _dn, fns in os.walk(root):
        for fn in fns:
            if fn.endswith('.class'):
                files.append(os.path.join(dp, fn))
    files.sort()
    for p in files:
        cls = os.path.relpath(p, root)[:-6].replace('\\', '/').replace('/', '.')
        try:
            res = extract(p, cls)
        except Exception as exc:
            failures.append((cls, repr(exc)))
            continue
        if res is None:
            continue
        calls, unres = res
        all_calls.extend(calls)
        for m, off, reason in unres:
            all_unres.append((cls, m, off, reason))

    with open(os.path.join(out_dir, 'callsites.tsv'), 'w', encoding='utf-8') as fh:
        for row in all_calls:
            fh.write('\t'.join(str(x) for x in row) + '\n')
    with open(os.path.join(out_dir, 'unresolved.tsv'), 'w', encoding='utf-8') as fh:
        for row in all_unres:
            fh.write('\t'.join(str(x) for x in row) + '\n')
    with open(os.path.join(out_dir, 'scan_failures.tsv'), 'w', encoding='utf-8') as fh:
        for row in failures:
            fh.write('\t'.join(row) + '\n')

    print('classes scanned      :', len(files))
    print('string call sites    :', len(all_calls))
    print('unresolved call sites:', len(all_unres))
    print('class parse failures :', len(failures))


if __name__ == '__main__':
    main()
