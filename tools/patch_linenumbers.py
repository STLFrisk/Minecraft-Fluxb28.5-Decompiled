#!/usr/bin/env python3
"""Flux: give c05.tur a LineNumberTable so the JVM reports the failing offset.

The crash is a whole-method NPE:

    java.lang.NullPointerException
        at c05.tur(Unknown Source) ~[Flux.jar:?]

with no callee frame, so some instruction inside c05.tur dereferences null.  ZKM
stripped SourceFile, so the trace says "Unknown Source" and gives no position.
A LineNumberTable does not need SourceFile to be useful: HotSpot renders it as
`c05.tur(Unknown Source:1905)`, which is exactly the bytecode offset.

This only adds a Code sub-attribute; no bytecode changes, no branches, so nothing
about verification or behaviour changes.

Usage: patch_linenumbers.py <in/c05.class> <out/c05.class> [method] [desc]
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, append_utf8

LNT = 'LineNumberTable'


def main():
    src, dst = sys.argv[1], sys.argv[2]
    want = sys.argv[3] if len(sys.argv) > 3 else 'tur'
    want_desc = sys.argv[4] if len(sys.argv) > 4 else '()V'

    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]

    name_i = None
    for i, v in pool.utf8.items():
        if v == LNT:
            name_i = i
            break
    added = []
    if name_i is None:
        pb, _ = append_utf8(pb, LNT)
        name_i = count
        count += 1
        added.append('Utf8 %s = #%d' % (LNT, name_i))

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # locate the method
    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn == want and md == want_desc:
            hit = (cfo, code)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: %s%s not found' % (want, want_desc))
    cfo, code = hit

    # Code attribute header: attribute_name_index u2, attribute_length u4,
    # max_stack u2, max_locals u2, code_length u4, code...
    attr_start = cfo - 14
    attr_len = struct.unpack_from('>I', new, attr_start + 2)[0]
    code_len = struct.unpack_from('>I', new, cfo - 4)[0]

    p = cfo + code_len
    etl = struct.unpack_from('>H', new, p)[0]
    p += 2 + 8 * etl
    nac = struct.unpack_from('>H', new, p)[0]
    p += 2
    attrs = []
    have_lnt = False
    for _ in range(nac):
        an = struct.unpack_from('>H', new, p)[0]
        al = struct.unpack_from('>I', new, p + 2)[0]
        nm = Pool(new).utf8.get(an)
        if nm == LNT:
            have_lnt = True
        else:
            attrs.append(new[p:p + 6 + al])
        p += 6 + al

    # one entry per instruction: line number == bytecode offset
    insns = list(callscan.decode_instructions(code))
    offs = []
    seen = set()
    for off, op, ops, ln in insns:
        if off not in seen:
            seen.add(off)
            offs.append(off)
        # callscan reports ln == 0 for a few opcodes, so derive the next offset
        # from the following instruction rather than trusting ln
    offs = sorted(seen)
    offs = [o for o in offs if o < code_len]

    table = struct.pack('>H', len(offs))
    for o in offs:
        table += struct.pack('>HH', o, o)
    lnt_attr = struct.pack('>H', name_i) + struct.pack('>I', len(table)) + table

    body = new[cfo:cfo + code_len]
    exc = new[cfo + code_len + 2:cfo + code_len + 2 + 8 * etl]
    max_stack = struct.unpack_from('>H', new, attr_start + 6)[0]
    max_locals = struct.unpack_from('>H', new, attr_start + 8)[0]
    new_attr = (
        struct.pack('>HH', max_stack, max_locals) +
        struct.pack('>I', code_len) + body +
        struct.pack('>H', etl) + exc +
        struct.pack('>H', len(attrs) + 1) + b''.join(attrs) + lnt_attr
    )

    out = bytearray(new[:attr_start])
    out += struct.pack('>H', struct.unpack_from('>H', new, attr_start)[0])
    out += struct.pack('>I', len(new_attr))
    out += new_attr
    out += new[attr_start + 6 + attr_len:]

    io.open(dst, 'wb').write(bytes(out))
    print('  %s%s : %d 指令, LineNumberTable %d 条 (行号 = 字节码偏移)'
          % (want, want_desc, len(offs), len(offs)))
    print('  替换已有的 LineNumberTable: %s' % have_lnt)
    print('  崩溃栈将显示 c05.tur(Unknown Source:<偏移>)')
    for a in added:
        print('  pool: %s' % a)


def add_source_file(blob, filename):
    """Add a class-level SourceFile attribute.

    StackTraceElement.toString() prints "(Unknown Source)" whenever fileName is
    null, WITHOUT the line number - so a LineNumberTable alone is invisible.  The
    SourceFile attribute is what makes "(Flux.java:1905)" appear.
    """
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    added = []
    name_i = file_i = None
    for i, v in pool.utf8.items():
        if v == 'SourceFile':
            name_i = i
        if v == filename:
            file_i = i
    if name_i is None:
        pb, _ = append_utf8(pb, 'SourceFile')
        name_i = count
        count += 1
        added.append('Utf8 SourceFile = #%d' % name_i)
    if file_i is None:
        pb, _ = append_utf8(pb, filename)
        file_i = count
        count += 1
        added.append('Utf8 %s = #%d' % (filename, file_i))

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # walk to the class attributes (after the methods table)
    pp = Pool(new)
    p = pp.end + 6
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
    nac = struct.unpack_from('>H', new, q)[0]
    attr = struct.pack('>H', name_i) + struct.pack('>I', 2) + struct.pack('>H', file_i)
    out = bytearray(new[:q]) + struct.pack('>H', nac + 1) + bytearray(attr) + new[q + 2:]
    return bytes(out), added


if __name__ == '__main__':
    main()
    # second pass: make the line numbers actually visible
    import io as _io
    dst = sys.argv[2]
    blob = _io.open(dst, 'rb').read()
    out, added = add_source_file(blob, 'Flux.java')
    _io.open(dst, 'wb').write(out)
    print('  SourceFile 已加入; 栈里将显示 (Flux.java:<偏移>)')
    for a in added:
        print('  pool: %s' % a)
