#!/usr/bin/env python3
"""Flux: drive the per-world config re-apply from the client's own tick hook.

szk._k4() begins with `if (c05.vz1().tij == null) return;` and szk is a lazy
singleton that is never recreated, so if szk is first built before a world exists
the config is silently never applied - permanently for that session.

That produced the observed instability: with an unchanged config file, Mode read
`Switch` on one launch and `Single` (the default) on the next.  The re-apply had
been living in the diagnostic probe, which is not part of the client.

This appends one call to the existing per-tick hook:

    invokestatic FluxBus.ensureConfig()V

FluxBus.ensureConfig() remembers the last world object it saw and, whenever a new
one appears, forces the module registry (so every setting exists) and then runs
szk.a2k() + szk._k4() to apply the config.  Nothing happens on the other ticks.

c05.tur ends in return and has no branch that targets the end, so appending
before that return moves no offset and needs no stack map frame.

Usage: patch_ensurecfg.py <in/c05.class> <out/c05.class>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
import patch_autoload
from patch_qih import Pool

TARGET = ('tur', '()V')
JUST_RETURN = (0xB1,)


def main():
    src, dst = sys.argv[1], sys.argv[2]
    blob = io.open(src, 'rb').read()
    pool = Pool(blob)
    count = pool.count
    pb = blob[:pool.end]
    pb, count, ensure, note = patch_autoload.build_ref(
        pb, pool, count, 'FluxBus', 'ensureConfig', '()V', 10)

    new = bytearray(pb) + bytearray(blob[pool.end:])
    struct.pack_into('>H', new, 8, count)
    new = bytes(new)

    for mn, md, cfo, code, mp in patch_login.code_arrays(new):
        if mn != TARGET[0] or md != TARGET[1]:
            continue
        if code[-1] != 0xB1:
            raise SystemExit('FAIL-CLOSED: c05.tur does not end with return')
        # refuse if any branch lands exactly on the trailing return
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op == 0x00:
                continue
            if op in (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                      0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xA8, 0xA9,
                      0xAA, 0xAB, 0xAC, 0xAD, 0xAE, 0xAF, 0xB0):
                if off + struct.unpack_from('>h', ops, 0)[0] == len(code) - 1:
                    raise SystemExit('FAIL-CLOSED: a branch targets the trailing '
                                     'return of c05.tur')
        inject = bytes([0xB8]) + struct.pack('>H', ensure)
        at = cfo + len(code) - 1
        buf = bytearray(new)
        attr = struct.unpack_from('>I', new, cfo - 12)[0]
        struct.pack_into('>I', buf, cfo - 12, attr + len(inject))
        struct.pack_into('>I', buf, cfo - 4, len(code) + len(inject))
        out = bytes(bytearray(buf[:at]) + bytearray(inject) + bytearray(buf[at:]))
        io.open(dst, 'wb').write(out)
        print('  c05.tur: %d -> %d bytes  (+ invokestatic FluxBus.ensureConfig)' % (len(code), len(code) + len(inject)))
        if note:
            print('  pool: %s' % note)
        print('  效果: 每个新世界出现时重新应用配置, 不再依赖创建顺序')
        return
    raise SystemExit('FAIL-CLOSED: c05.tur not found')


if __name__ == '__main__':
    main()
