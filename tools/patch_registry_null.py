#!/usr/bin/env python3
"""Flux: keep null module instances out of kgt.vuo.

`kgt.<init>` is rebuilt by P9 as 399 straight-line instructions of

    kgt.vuo.add(kgt.dej);      // getstatic vuo; getstatic <module>; ArrayList.add; pop
    kgt.vuo.add(kgt.nd5);
    ... 98 of them ...
    kgt.vuo.sort(Comparator.comparing(<lambda>));

with no null check anywhere.  Any module whose static field is still null - the
same "native was supposed to fill this in" pattern as c05.ezu and the zwr
singletons - therefore lands in the list, and the keybind dispatcher in c05.tur

    for (ar7 m : zwr.qkk.zj2().wau()) { if (m.x_i() == key) m.tp_(); }

dereferences it.  That is the whole-method NPE the client reports at c05.tur
with no callee frame, and it matches "any key press crashes".

Patch
-----
The registration call site is three bytes:

    b6 04 1a    invokevirtual java/util/ArrayList.add

and a static helper taking the same (List, Object) pair is also three bytes:

    b8 XX XX    invokestatic kgt.fluxAdd

so the swap is entirely in place: no offset moves, no stack map frame is added,
and `kgt.<init>` keeps its branch-free shape.  The helper drops nulls and logs
the list index, which identifies the offending module because the registration
order is fixed.

Usage: patch_registry_null.py <in/kgt.class> <out/kgt.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref, append_utf8

ADD_OWNER = 'java/util/ArrayList'
ADD_NAME = 'add'
ADD_DESC = '(Ljava/lang/Object;)Z'
HELPER = 'fluxAdd'
HELPER_DESC = '(Ljava/util/List;Ljava/lang/Object;)V'
LOGGER = 'FluxDiag'
MSG = 'FLUX-DIAG null module in kgt.vuo, index='


def count_pool_entries(pb):
    """constant_pool_count for a class header whose pool ends at len(pb).

    Manual `count += 1` bookkeeping drifts as soon as a helper appends more than
    one entry, which corrupts the header and makes the pool parser walk into the
    field table.  Scanning the bytes is authoritative.
    """
    p = 8                                   # magic, minor, major
    n = 1                                   # constant_pool_count is entries + 1
    end = len(pb)
    while p < end:
        tag = pb[p]
        p += 1
        if tag == 1:
            ln = struct.unpack_from('>H', pb, p)[0]
            p += 2 + ln
        elif tag in (3, 4):
            p += 4
        elif tag in (5, 6):
            p += 8
            n += 1                          # long/double occupy two slots
        elif tag in (7, 8, 16, 19, 20):
            p += 2
        elif tag == 15:
            p += 3                          # MethodHandle: u1 kind + u2 index
        elif tag in (9, 10, 11, 12, 17, 18):
            p += 4
        else:
            raise ValueError('unknown constant tag %d at %d' % (tag, p - 1))
        n += 1
    if p != end:
        raise ValueError('pool scan overshot: %d != %d' % (p, end))
    return n


def build_helper(blob):
    """Return (new_blob, report) with kgt.fluxAdd appended and call sites swapped."""
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    tail = blob[pool.end:]
    added = []

    def utf8(t):
        nonlocal pb, count
        for i, v in pool.utf8.items():
            if v == t:
                return i
        pb, _ = append_utf8(pb, t)
        i = count
        count += 1
        added.append('Utf8 "%s" = #%d' % (t, i))
        return i

    def cls(owner):
        nonlocal pb, count
        for i, (tag, val) in pool.entries.items():
            if tag == 7 and pool.utf8.get(val) == owner:
                return i
        u = utf8(owner)
        pb += bytes([7]) + struct.pack('>H', u)
        i = count
        count += 1
        added.append('Class %s = #%d' % (owner, i))
        return i

    def ref(owner, name, desc, tag):
        nonlocal pb, count
        r = find_ref(pool, owner, name, desc, tags=(tag,))
        if r:
            return r
        n = utf8(name)
        d = utf8(desc)
        pb += bytes([12]) + struct.pack('>H', n) + struct.pack('>H', d)
        nt = count
        count += 1
        c = cls(owner)
        pb += bytes([tag]) + struct.pack('>H', c) + struct.pack('>H', nt)
        i = count
        count += 1
        added.append('%s.%s = #%d' % (owner, name, i))
        return i

    def string(t):
        nonlocal pb, count
        for i, (tag, val) in pool.entries.items():
            if tag == 8 and pool.utf8.get(val) == t:
                return i
        u = utf8(t)
        pb += bytes([8]) + struct.pack('>H', u)
        i = count
        count += 1
        added.append('String "%s" = #%d' % (t, i))
        return i

    list_cls = cls('java/util/List')
    get_logger = ref('org/apache/logging/log4j/LogManager', 'getLogger',
                     '(Ljava/lang/String;)Lorg/apache/logging/log4j/Logger;', 10)
    warn_str = ref('org/apache/logging/log4j/Logger', 'warn', '(Ljava/lang/String;)V', 11)
    warn_obj = ref('org/apache/logging/log4j/Logger', 'warn', '(Ljava/lang/Object;)V', 11)
    list_add = ref('java/util/List', 'add', ADD_DESC, 11)
    list_size = ref('java/util/List', 'size', '()I', 11)
    int_value = ref('java/lang/Integer', 'valueOf', '(I)Ljava/lang/Integer;', 10)
    obj_init = ref('java/lang/Object', '<init>', '()V', 7)
    code_name = utf8('Code')
    name_i = utf8(HELPER)
    desc_i = utf8(HELPER_DESC)
    logger_ref = string(LOGGER)
    msg_ref = string(MSG)
    # the helper's own Methodref, so the swapped call sites can reference it
    helper_ref = ref('kgt', HELPER, HELPER_DESC, 10)

    def iface(idx, desc):
        args = desc[desc.index('(') + 1:desc.index(')')]
        slots = 1
        i = 0
        while i < len(args):
            c = args[i]
            if c == '[':
                while args[i] == '[':
                    i += 1
                if args[i] == 'L':
                    i = args.index(';', i)
                slots += 1
            elif c == 'L':
                i = args.index(';', i)
                slots += 1
            elif c in 'JD':
                slots += 2
            else:
                slots += 1
            i += 1
        return bytes([0xB9]) + struct.pack('>H', idx) + bytes([slots, 0])

    def ldcw(i):
        return bytes([0x13]) + struct.pack('>H', i)

    body = (
        bytes([0x2B]) + bytes([0xC6]) + struct.pack('>H', 31) +      # aload_1; ifnull 31
        bytes([0x2A]) + bytes([0x2B]) +                              # aload_0; aload_1
        iface(list_add, ADD_DESC) + bytes([0x57]) +                  # List.add; pop
        bytes([0xB1]) +                                              # return
        ldcw(logger_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +
        ldcw(msg_ref) + iface(warn_str, '(Ljava/lang/String;)V') +
        ldcw(logger_ref) + bytes([0xB8]) + struct.pack('>H', get_logger) +
        bytes([0x2A]) + iface(list_size, '()I') +
        bytes([0xB8]) + struct.pack('>H', int_value) +
        iface(warn_obj, '(Ljava/lang/Object;)V') +
        bytes([0xB1])
    )
    code = (
        struct.pack('>HH', 2, 2) + struct.pack('>I', len(body)) + body +
        struct.pack('>H', 0) +            # exception_table_length
        struct.pack('>H', 0)              # attributes_count
    )
    method_info = (struct.pack('>HHH', 0x0009, name_i, desc_i) +
                   struct.pack('>H', 1) +
                   struct.pack('>H', code_name) + struct.pack('>I', len(code)) + code)

    # the header count is derived from the bytes, not from bookkeeping
    truth = count_pool_entries(pb)
    if truth != count:
        added.append('count corrected %d -> %d' % (count, truth))
    count = truth
    new = bytearray(pb) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # locate the end of the methods table so the new method can be appended
    p = Pool(new).end + 6
    ifc = struct.unpack_from('>H', new, p)[0]
    p += 2 + 2 * ifc
    fc = struct.unpack_from('>H', new, p)[0]
    p += 2
    for _ in range(fc):
        p += 6
        ac = struct.unpack_from('>H', new, p)[0]
        p += 2
        for _ in range(ac):
            p += 6 + struct.unpack_from('>I', new, p + 2)[0]
    mc = struct.unpack_from('>H', new, p)[0]
    q = p + 2
    for _ in range(mc):
        nac = struct.unpack_from('>H', new, q + 6)[0]
        q += 8
        for _ in range(nac):
            q += 6 + struct.unpack_from('>I', new, q + 2)[0]
    struct.pack_into('>H', new, p, mc + 1)
    out = bytearray(new[:q]) + bytearray(method_info) + bytearray(new[q:])
    assert count_pool_entries(pb) == count, 'FAIL-CLOSED: pool count drifted' 

    # swap every ArrayList.add in <init> for the guarded helper
    swapped = 0
    for mn, md, cfo, mcode, mp in patch_login.code_arrays(bytes(out)):
        if mn != '<init>':
            continue
        for off, op, ops, ln in callscan.decode_instructions(mcode):
            if op != 0xB6:
                continue
            nm = callscan.ref_name(mp, struct.unpack_from('>H', ops, 0)[0]) or ''
            if nm in ('java.util.ArrayList.add', 'java.util.List.add'):
                struct.pack_into('>H', out, cfo + off + 1, helper_ref)
                out[cfo + off] = 0xB8
                swapped += 1
        break
    if not swapped:
        raise SystemExit('FAIL-CLOSED: no ArrayList.add call sites found in kgt.<init>')

    return bytes(out), {
        'helper': 'kgt.%s%s' % (HELPER, HELPER_DESC),
        'swapped': swapped,
        'methods': '%d -> %d' % (mc, mc + 1),
        'pool_added': added,
    }


if __name__ == '__main__':
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    out, rep = build_helper(blob)
    io.open(dst, 'wb').write(out)
    print('  helper  : %s' % rep['helper'])
    print('  swapped : %d 个 ArrayList.add -> kgt.fluxAdd' % rep['swapped'])
    print('  methods : %s' % rep['methods'])
    for a in rep['pool_added']:
        print('  pool    : %s' % a)
