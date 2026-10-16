#!/usr/bin/env python3
"""Flux: trigger the config load, so module settings actually take effect.

Finding
-------
`szk` is the config manager.  Its load routine is `szk._k4()`:

    void _k4() {
        if (c05.vz1().tij == null) return;          // nothing to apply yet
        ux_(zwr.bxb.d7c() ? "" : yn6.w40());        // config name
        bxh(); kvr(); ece(); ss8(); ax1(); j02(); mw6(); tev();
    }

and `_k4` has **zero Java call sites** - the native layer was the only caller, on
world join.  Without it every module setting stays at its default, which is why the
feature handlers that DO run (`fyk.__1(axn)` starts with `getstatic sy_; cn7.d7c();
booleanValue(); ifeq ...`) fall straight through and do nothing.

The config really is on disk:

    versions/Flux/flux/lastConfig              -> "hypixel_best_config"
    versions/Flux/flux/prs-hypixel_best_config.txt   (9,010 bytes, "m#AntiBots" ...)

Patch
-----
`szk.<init>` is 36 bytes of straight-line code with no branch, no exception table
and no stack map table, so code can be appended before its final `return` without
moving anything.  It becomes:

    ... 31: aload_0
        32: invokestatic mtl.__x(Object)V
        35: aload_0
        36: invokespecial szk._k4()V      <-- added
        39: return

`zwr.fge` (the `szk` singleton the client uses) is created lazily, so the first
construction happens once the client is actually running; `_k4`'s own guard handles
the case where no world exists yet.

Usage: patch_config.py <in/szk.class> <out/szk.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref, append_utf8

LOAD = '_k4'
LOAD_DESC = '()V'


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)

    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
        if mn == '<init>' and md == '()V':
            hit = (cfo, code, mp)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: szk.<init>()V not found')
    cfo, code, mp = hit

    if code[-1] != 0xB1:
        raise SystemExit('FAIL-CLOSED: szk.<init> does not end with return')
    insns = callscan.decode_instructions(code)
    last = insns[-1]
    if last[1] != 0xB1 or last[0] != len(code) - 1:
        raise SystemExit('FAIL-CLOSED: unexpected tail in szk.<init>')
    for off, op, ops, ln in insns:
        if op in (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                  0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xC8, 0xC9,
                  0xAA, 0xAB):
            raise SystemExit('FAIL-CLOSED: szk.<init> contains a branch; '
                             'appending would need a stack map table')

    # a Methodref to the private loader has to exist (nothing calls it today)
    ref = find_ref(pool, 'szk', LOAD, LOAD_DESC)
    count = pool.count
    pb = blob[:pool.end]
    tail = blob[pool.end:]
    added = []
    if ref is None:
        cls_i = find_class(pool, 'szk')
        if cls_i is None:
            raise SystemExit('FAIL-CLOSED: Class szk not in its own pool')
        name_i = desc_i = None
        for i, v in pool.utf8.items():
            if v == LOAD:
                name_i = i
            if v == LOAD_DESC:
                desc_i = i
        if name_i is None:
            pb, _ = append_utf8(pb, LOAD)
            name_i = count
            count += 1
            added.append('Utf8 %s = #%d' % (LOAD, name_i))
        if desc_i is None:
            pb, _ = append_utf8(pb, LOAD_DESC)
            desc_i = count
            count += 1
            added.append('Utf8 %s = #%d' % (LOAD_DESC, desc_i))
        pb += bytes([12]) + struct.pack('>H', name_i) + struct.pack('>H', desc_i)
        nt = count
        count += 1
        pb += bytes([10]) + struct.pack('>H', cls_i) + struct.pack('>H', nt)
        ref = count
        count += 1
        added.append('Methodref szk.%s%s = #%d' % (LOAD, LOAD_DESC, ref))

    new = bytearray(pb) + bytearray(tail)
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    # the pool grew, so every offset after it shifted: re-locate the method
    hit2 = None
    for mn, md, cfo2, code2, mp2 in patch_login.code_arrays(new):
        if mn == '<init>' and md == '()V':
            hit2 = (cfo2, code2)
            break
    if hit2 is None:
        raise SystemExit('FAIL-CLOSED: szk.<init> lost after the pool append')
    cfo, code = hit2
    if len(code) != 36 or code[-1] != 0xB1:
        raise SystemExit('FAIL-CLOSED: szk.<init> changed shape (%d bytes)' % len(code))

    # append `aload_0 ; invokespecial szk._k4()` before the trailing return.
    # Both length fields must grow: the Code attribute carries its own
    # attribute_length at cfo-12 in addition to code_length at cfo-4.
    inject = bytes([0x2A]) + bytes([0xB7]) + struct.pack('>H', ref)
    at = cfo + len(code) - 1
    out = bytearray(new[:at]) + bytearray(inject) + bytearray(new[at:])
    attr_len = struct.unpack_from('>I', new, cfo - 12)[0]
    struct.pack_into('>I', out, cfo - 12, attr_len + len(inject))       # attribute_length
    struct.pack_into('>I', out, cfo - 4, len(code) + len(inject))       # code_length

    io.open(dst, 'wb').write(bytes(out))
    print('szk.<init>: appended %s  (%d -> %d bytes)'
          % ('aload_0; invokespecial szk._k4()', len(code), len(code) + len(inject)))
    print('   the config load now runs once, when the config manager is created')
    if added:
        print('   appended to pool: %s' % added)


if __name__ == '__main__':
    main()
