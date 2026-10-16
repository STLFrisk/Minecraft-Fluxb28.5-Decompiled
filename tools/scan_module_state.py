#!/usr/bin/env python3
"""Where does a module's enabled state (`ar7.iio`) live, and is the cheat logic Java?"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool

ROOT = sys.argv[1]


def walk(ROOT, want):
    for dp, _d, fns in os.walk(ROOT):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            p = os.path.join(dp, fn)
            cls = os.path.relpath(p, ROOT)[:-6].replace(os.sep, '.')
            try:
                blob = open(p, 'rb').read()
            except Exception:
                continue
            try:
                for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
                    for off, op, ops, ln in callscan.decode_instructions(code):
                        if op not in (0xB2, 0xB3, 0xB4, 0xB5):
                            continue
                        r = callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0]) or ''
                        if r == want:
                            yield (cls, mname, off, op)
            except Exception:
                pass


def main():
    print('=== ar7.iio (module enabled flag) ===')
    w, r = [], []
    for cls, m, off, op in walk(ROOT, 'ar7.iio'):
        (w if op in (0xB3, 0xB5) else r).append('%s.%s@%d' % (cls, m, off))
    print('  writers %d: %s' % (len(w), w[:20]))
    print('  readers %d: %s' % (len(r), r[:12]))

    print()
    print('=== native methods and their Java call sites (top 20 by count) ===')
    natives = set()
    for dp, _d, fns in os.walk(ROOT):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            p = os.path.join(dp, fn)
            cls = fn[:-6]
            try:
                blob = open(p, 'rb').read()
                pool = Pool(blob)
            except Exception:
                continue
            # field/method table scan for ACC_NATIVE
            try:
                off = pool.end + 6
                ifc = struct.unpack_from('>H', blob, off)[0]
                off += 2 + 2 * ifc
                fc = struct.unpack_from('>H', blob, off)[0]
                off += 2
                for _ in range(fc):
                    off += 6
                    ac = struct.unpack_from('>H', blob, off)[0]
                    off += 2
                    for _ in range(ac):
                        ln = struct.unpack_from('>I', blob, off + 2)[0]
                        off += 6 + ln
                mc = struct.unpack_from('>H', blob, off)[0]
                off += 2
                for _ in range(mc):
                    acc = struct.unpack_from('>H', blob, off)[0]
                    nm = pool.utf8.get(struct.unpack_from('>H', blob, off + 2)[0])
                    de = pool.utf8.get(struct.unpack_from('>H', blob, off + 4)[0])
                    ac = struct.unpack_from('>H', blob, off + 6)[0]
                    if acc & 0x0100:
                        natives.add('%s.%s%s' % (cls, nm, de))
                    o = off + 8
                    for _ in range(ac):
                        ln = struct.unpack_from('>I', blob, o + 2)[0]
                        o += 6 + ln
                    off = o
            except Exception:
                pass
    print('  total native methods: %d' % len(natives))
    for n in sorted(natives)[:40]:
        print('     %s' % n)


if __name__ == '__main__':
    main()
