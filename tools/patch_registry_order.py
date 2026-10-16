#!/usr/bin/env python3
"""Flux: build the module registry BEFORE the config is applied.

This is the one-line ordering fix that made every Mode dropdown start working,
promoted out of the diagnostic probe and into the client itself.

Why order matters
-----------------
szk is the lazy singleton behind zwr.up0(), and szk.<init> is what applies the
config (a2k for keybinds, then _k4 for the settings).  _k4 matches each config line
against a live setting object BY NAME.

Those setting objects are created in each module's <clinit> and registered at
construction time.  kgt.<init> references every module's static field, so building
kgt forces all 98 <clinit>s; building szk does not.

The first caller of zwr.up0() is ar7.tp_ - i.e. the first module toggle, which can
easily happen before anything touched kgt.  Observing the damage:

    config file : s#KillAura:Mode:Switch
    live object : fyk.isg = c_3[Mode]=Single     <- the default, never overwritten

Nothing in the aura logic reads isg; the whole Switch/Single mechanism lives in
ar7.asw, which does

    if (tb8(this.isg.d7c()))
        for (j1s sub : this._w6)
            if (sub.zkf().equalsIgnoreCase(this.isg.d7c())) sub.qza();

so a dropdown left at its default silently selects the wrong engine.  Forcing kgt
first makes the setting exist when the loader runs, and the value is applied.

This is a pure prepend inside szk.<init> - a straight-line constructor with no
branch, no exception table and no stack map table - so the shift is harmless.

Usage: patch_registry_order.py <in/szk.class> <out/szk.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
import patch_autoload
from patch_qih import Pool, find_ref

BRANCHES = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
            0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6)


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    notes = []

    qkk = find_ref(pool, 'zwr', 'qkk', 'Lzwr;', tags=(9,))
    if qkk is None:
        raise SystemExit('FAIL-CLOSED: Fieldref zwr.qkk not found')
    pb, count, zj2, n = patch_autoload.build_ref(
        pb, pool, count, 'zwr', 'zj2', '()Lkgt;', 10)
    if n:
        notes.append(n)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn != '<init>':
            continue
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op in BRANCHES:
                raise SystemExit('FAIL-CLOSED: szk.<init> has a branch; '
                                 'cannot prepend safely')
        # prepend: zwr.qkk.zj2() -> forces new kgt() -> all module <clinit>s
        inject = (bytes([0xB2]) + struct.pack('>H', qkk) +
                  bytes([0xB6]) + struct.pack('>H', zj2) +
                  bytes([0x57]))
        buf = bytearray(new)
        attr = struct.unpack_from('>I', new, cfo - 12)[0]
        struct.pack_into('>I', buf, cfo - 12, attr + len(inject))
        struct.pack_into('>I', buf, cfo - 4, len(code) + len(inject))
        out = bytes(bytearray(buf[:cfo]) + bytearray(inject) + bytearray(buf[cfo:]))

        io.open(dst, 'wb').write(out)
        print('  szk.<init>: %d -> %d bytes' % (len(code), len(code) + len(inject)))
        print('  前置: getstatic zwr.qkk; invokevirtual zwr.zj2(); pop')
        print('  效果: 配置应用前先强制建立模块注册表, 所有下拉框(Mode)才能拿到配置值')
        for x in notes:
            print('  pool: %s' % x)
        return
    raise SystemExit('FAIL-CLOSED: szk.<init> not found')


if __name__ == '__main__':
    main()
