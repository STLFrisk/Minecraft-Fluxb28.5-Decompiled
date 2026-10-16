#!/usr/bin/env python3
"""Neutralise the ZKM native anti-tamper call `v6ma.Ex(int)` in every class.

Many classes call `invokestatic v6ma.Ex:(I)V` inside <clinit>. That method lives in
the dropped `libsoter.dll` (META-INF/Soter), so in an analysis JVM it throws
UnsatisfiedLinkError and aborts initialization *after* the ZKM string table has been
built, which blocks offline string recovery for ~440 classes.

`invokestatic Ex(I)V` pops exactly one int and pushes nothing. Replacing the three
bytes with `pop; nop; nop` (0x57 0x00 0x00) is therefore operand-stack neutral, so the
patched class still verifies; it just no longer consults the native component.

Input : source tree of .class files
Output: patched copy of that tree, plus a report of every patched site
"""
import io
import os
import struct
import sys

CONST_UTF8, CONST_CLASS, CONST_NAMEANDTYPE = 1, 7, 12
CONST_METHODREF, CONST_INTERFACEMETHODREF = 10, 11


def parse_pool(blob, off):
    count = struct.unpack_from('>H', blob, off)[0]
    off += 2
    pool = [None] * count
    i = 1
    while i < count:
        tag = blob[off]
        off += 1
        if tag == CONST_UTF8:
            ln = struct.unpack_from('>H', blob, off)[0]
            off += 2
            pool[i] = (tag, blob[off:off + ln].decode('utf-8', 'surrogateescape'))
            off += ln
        elif tag in (3, 4):
            pool[i] = (tag, struct.unpack_from('>i', blob, off)[0])
            off += 4
        elif tag in (5, 6):
            pool[i] = (tag, struct.unpack_from('>q', blob, off)[0])
            off += 8
            i += 1
        elif tag in (7, 8, 16, 19, 20):
            pool[i] = (tag, struct.unpack_from('>H', blob, off)[0])
            off += 2
        elif tag in (9, 10, 11, 12, 17, 18):
            pool[i] = (tag, struct.unpack_from('>HH', blob, off))
            off += 4
        elif tag == 15:
            pool[i] = (tag, struct.unpack_from('>BH', blob, off))
            off += 3
        else:
            raise ValueError('bad constant tag %d' % tag)
        i += 1
    return pool, off


def utf(pool, idx):
    if not idx or idx >= len(pool) or pool[idx] is None:
        return None
    return pool[idx][1] if pool[idx][0] == CONST_UTF8 else None


def methodref_name(pool, idx):
    """(owner_dotted, name, descriptor) for a Methodref/InterfaceMethodref."""
    if not idx or idx >= len(pool) or pool[idx] is None:
        return None
    tag, (cls_i, nat_i) = pool[idx]
    if tag not in (CONST_METHODREF, CONST_INTERFACEMETHODREF):
        return None
    owner = utf(pool, pool[cls_i][1]) if pool[cls_i] else None
    name = desc = None
    if nat_i and pool[nat_i]:
        name = utf(pool, pool[nat_i][1][0])
        desc = utf(pool, pool[nat_i][1][1])
    return (owner or '').replace('/', '.'), name, desc


def skip_attributes(blob, off, count):
    for _ in range(count):
        _ni = struct.unpack_from('>H', blob, off)[0]
        ln = struct.unpack_from('>I', blob, off + 2)[0]
        off += 6 + ln
    return off


def patch_class(blob, target_cls, target_name, target_desc, report):
    """Return patched bytes (or the original if nothing matched)."""
    pool, off = parse_pool(blob, 8)
    off += 6                                     # access_flags, this, super
    ifc = struct.unpack_from('>H', blob, off)[0]
    off += 2 + 2 * ifc
    nfields = struct.unpack_from('>H', blob, off)[0]
    off += 2
    for _ in range(nfields):
        off += 6
        na = struct.unpack_from('>H', blob, off)[0]
        off += 2
        off = skip_attributes(blob, off, na)
    nmethods = struct.unpack_from('>H', blob, off)[0]
    off += 2
    buf = bytearray(blob)
    patched = 0
    for _ in range(nmethods):
        acc, name_i, desc_i = struct.unpack_from('>HHH', blob, off)
        mname = utf(pool, name_i)
        na = struct.unpack_from('>H', blob, off + 6)[0]
        aoff = off + 8
        for _a in range(na):
            an = utf(pool, struct.unpack_from('>H', blob, aoff)[0])
            alen = struct.unpack_from('>I', blob, aoff + 2)[0]
            body = aoff + 6
            if an == 'Code':
                code_len = struct.unpack_from('>I', blob, body + 4)[0]
                code_off = body + 8
                j = 0
                while j < code_len:
                    op = blob[code_off + j]
                    if op == 0xB8:               # invokestatic
                        idx = struct.unpack_from('>H', blob, code_off + j + 1)[0]
                        ref = methodref_name(pool, idx)
                        if ref and ref[0] == target_cls and ref[1] == target_name \
                                and ref[2] == target_desc:
                            buf[code_off + j] = 0x57          # pop
                            buf[code_off + j + 1] = 0x00      # nop
                            buf[code_off + j + 2] = 0x00      # nop
                            patched += 1
                            report.append((mname, j, idx))
                    j += 1 + OP_LEN.get(op, 0)
            aoff += 6 + alen
        off = aoff
    return bytes(buf) if patched else None, patched


# operand byte counts for the opcodes that can appear before the call in <clinit>
OP_LEN = {}
for _i in (0x10, 0x12, 0x15, 0x16, 0x17, 0x18, 0x19, 0x36, 0x37, 0x38,
           0x39, 0x3a, 0xa9, 0xbc):
    OP_LEN[_i] = 1
for _i in (0x11, 0x84, 0x99, 0x9a, 0x9b, 0x9c, 0x9d, 0x9e, 0x9f, 0xa0, 0xa1,
           0xa2, 0xa3, 0xa4, 0xa5, 0xa6, 0xa7, 0xa8, 0xb2, 0xb3, 0xb4, 0xb5,
           0xb6, 0xb7, 0xb8, 0xbb, 0xbd, 0xc0, 0xc1, 0xc6, 0xc7):
    OP_LEN[_i] = 2
OP_LEN[0x13] = 2
OP_LEN[0x14] = 2
OP_LEN[0xb9] = 4
OP_LEN[0xba] = 4
OP_LEN[0xc5] = 3
OP_LEN[0xc8] = 4
OP_LEN[0xc9] = 4


def main():
    src, dst = sys.argv[1], sys.argv[2]
    tcls, tname, tdesc = sys.argv[3], sys.argv[4], sys.argv[5]
    total = 0
    classes = 0
    lines = []
    for dp, _dn, fns in os.walk(src):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            p = os.path.join(dp, fn)
            rel = os.path.relpath(p, src)
            out = os.path.join(dst, rel)
            os.makedirs(os.path.dirname(out), exist_ok=True)
            blob = io.open(p, 'rb').read()
            report = []
            try:
                res, n = patch_class(blob, tcls, tname, tdesc, report)
            except Exception as exc:
                io.open(out, 'wb').write(blob)
                lines.append('%s\tERROR\t%r' % (rel, exc))
                continue
            io.open(out, 'wb').write(res if res is not None else blob)
            if n:
                classes += 1
                total += n
                for m, o, idx in report:
                    lines.append('%s\t%s\t%d\t%d' % (rel[:-6].replace(os.sep, '.'), m, o, idx))
    io.open(os.path.join(dst, '_patch_report.tsv'), 'w', encoding='utf-8').write('\n'.join(lines))
    print('patched call sites :', total)
    print('classes patched    :', classes)
    print('sites reported     :', len(lines))


if __name__ == '__main__':
    main()
