#!/usr/bin/env python3
"""Flux: make the startup auto-load use the same loader the ClickGUI uses.

Observed behaviour
------------------
Selecting a config in the ClickGUI works: modules get enabled and the TabGUI
appears.  Starting the game does not: nothing is loaded.

The two paths use different loaders.  `szk._k4()`, which an earlier patch hooked
into `szk.<init>`, runs

    ux_(zwr.bxb.d7c() ? "" : yn6.w40());
    bxh(); kvr(); ece(); ss8(); ax1(); j02(); mw6(); tev();

and none of those is `szk.t8a(String)` - the method that owns the
"Loaded config [" / "Generated config file [" strings, i.e. the one the GUI
drives.  So the automatic path never called the loader that actually applies a
config.

Patch
-----
Append to `szk.<init>`, right before its return:

    this.t8a(yn6.w40());

`t8a` is private but the call is intra-class, so `invokespecial` is correct and
the Methodref for it already exists (szk.gqz uses it).  The `yn6.w40()` Methodref
is added if absent.  `szk.<init>` is straight-line code with no branch, no
exception table and no stack map table, so appending cannot move anything.

Usage: patch_autoload.py <in/szk.class> <out/szk.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool, find_class, find_ref, append_utf8

BRANCHES = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
            0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xAA, 0xAB)


def build_ref(pb, pool, count, owner, name, desc, tag):
    r = find_ref(pool, owner, name, desc, tags=(tag,))
    if r:
        return pb, count, r, None

    def utf8(t):
        nonlocal pb, count
        for i, v in pool.utf8.items():
            if v == t:
                return i
        pb, _ = append_utf8(pb, t)
        i = count
        count += 1
        return i

    n = utf8(name)
    d = utf8(desc)
    pb += bytes([12]) + struct.pack('>H', n) + struct.pack('>H', d)
    nt = count
    count += 1
    c = find_class(pool, owner)
    if c is None:
        u = utf8(owner)
        pb += bytes([7]) + struct.pack('>H', u)
        c = count
        count += 1
    pb += bytes([tag]) + struct.pack('>H', c) + struct.pack('>H', nt)
    i = count
    count += 1
    return pb, count, i, '%s.%s = #%d' % (owner, name, i)


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    pb = blob[:pool.end]
    count = pool.count
    added = []

    pb, count, w40, a1 = build_ref(pb, pool, count, 'yn6', 'w40',
                                   '()Ljava/lang/String;', 10)
    if a1:
        added.append(a1)
    pb, count, t8a, a2 = build_ref(pb, pool, count, 'szk', 't8a',
                                   '(Ljava/lang/String;)V', 10)
    if a2:
        added.append(a2)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    hit = None
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn == '<init>' and md == '()V':
            hit = (cfo, code)
            break
    if hit is None:
        raise SystemExit('FAIL-CLOSED: szk.<init> not found')
    cfo, code = hit
    if code[-1] != 0xB1:
        raise SystemExit('FAIL-CLOSED: szk.<init> does not end with return')
    for off, op, ops, ln in callscan.decode_instructions(code):
        if op in BRANCHES:
            raise SystemExit('FAIL-CLOSED: szk.<init> has a branch; cannot append')

    inject = (
        bytes([0x2A]) +                                   # aload_0
        bytes([0xB8]) + struct.pack('>H', w40) +          # invokestatic yn6.w40()
        bytes([0xB7]) + struct.pack('>H', t8a) +          # invokespecial szk.t8a(String)
        bytes([0xB1])                                     # return
    )
    at = cfo + len(code) - 1
    out = bytearray(new[:at]) + bytearray(inject) + bytearray(new[at + 1:])
    delta = len(inject) - 1
    attr_len = struct.unpack_from('>I', new, cfo - 12)[0]
    struct.pack_into('>I', out, cfo - 12, attr_len + delta)
    struct.pack_into('>I', out, cfo - 4, len(code) + delta)

    io.open(dst, 'wb').write(bytes(out))
    print('  szk.<init>: %d -> %d 字节, 追加 this.t8a(yn6.w40())'
          % (len(code), len(code) + delta))
    print('  启动时的自动加载现在走 GUI 同一条 t8a 路径')
    for a in added:
        print('  pool: %s' % a)


if __name__ == '__main__':
    main()
