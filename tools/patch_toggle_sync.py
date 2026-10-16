#!/usr/bin/env python3
"""Flux: route every module setter through FluxBus.sync so OFF really unregisters.

ar7.tp_ is the toggle the keybind dispatcher calls (c05.tur@1876).  An earlier
patch injected an unconditional

    aload_0 ; invokevirtual ar7.ron()

into it, and the same into z5z()/dv9(boolean).  That made switching a module OFF
call ron() - register - instead of ne2() - unregister -, so KillAura kept attacking
after its hotkey turned it off, while the ClickGUI path (which reaches ne2()) did
stop it.

mtl.__x and mtl.mn9 are the same width of call as ron/ne2 (invokevirtual and
invokestatic are both three bytes), so this is a pure in-place swap:

    b6 <ron>          invokevirtual ar7.ron()          -> register
    b8 <FluxBus.sync> invokestatic  FluxBus.sync(Object) -> dispatch on iio

and kkj() (the explicit "disable" setter, still six bytes) gains an appended call.

Applying the swap in place moves no offset, so the existing branch targets, the
exception tables and the eight stack map frames of ron/ne2 all stay valid.

Usage: patch_toggle_sync.py <in/ar7.class> <out/ar7.class>
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
SWAP = ('tp_', 'z5z', 'dv9')      # already carry an injected ron() call
APPEND = ('kkj',)                 # six bytes, needs the call added


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]

    ron = find_ref(pool, 'ar7', 'ron', '()V')
    if ron is None:
        raise SystemExit('FAIL-CLOSED: ar7.ron not in pool')
    pb, count, sync, note = patch_autoload.build_ref(
        pb, pool, count, 'FluxBus', 'sync', '(Ljava/lang/Object;)V', 10)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    swapped = []
    appended = []
    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn in SWAP:
            hits = []
            for off, op, ops, ln in callscan.decode_instructions(code):
                if op == 0xB6 and struct.unpack_from('>H', ops, 0)[0] == ron:
                    hits.append(off)
            if len(hits) != 1:
                raise SystemExit('FAIL-CLOSED: ar7.%s has %d ron() calls'
                                 % (mn, len(hits)))
            swapped.append((cfo + hits[0], mn, md))
        elif mn in APPEND:
            if code[-1] != 0xB1:
                raise SystemExit('FAIL-CLOSED: ar7.%s does not end with return' % mn)
            for off, op, ops, ln in callscan.decode_instructions(code):
                if op in BRANCHES:
                    raise SystemExit('FAIL-CLOSED: ar7.%s has a branch' % mn)
            appended.append((cfo, mn, md, len(code)))

    out = bytearray(new)
    for at, mn, md in swapped:
        struct.pack_into('>BH', out, at, 0xB8, sync)
        print('  ar7.%s%s : b6 <ron> -> b8 <FluxBus.sync>  (in place)' % (mn, md))
    for cfo, mn, md, clen in sorted(appended, key=lambda e: -e[0]):
        inject = bytes([0x2A, 0xB8]) + struct.pack('>H', sync)
        at = cfo + clen - 1
        attr = struct.unpack_from('>I', out, cfo - 12)[0]
        struct.pack_into('>I', out, cfo - 12, attr + len(inject))
        struct.pack_into('>I', out, cfo - 4, clen + len(inject))
        out = bytearray(out[:at]) + bytearray(inject) + bytearray(out[at:])
        print('  ar7.%s%s : %d -> %d bytes (+ FluxBus.sync)' % (mn, md, clen, clen + len(inject)))

    io.open(dst, 'wb').write(bytes(out))
    if note:
        print('  pool: %s' % note)
    print('  效果: 快捷键/配置/GUI 三条路径统一按 iio 分派 ron()/ne2()')


if __name__ == '__main__':
    main()
