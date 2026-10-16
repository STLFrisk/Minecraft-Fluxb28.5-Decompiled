#!/usr/bin/env python3
"""How much real logic lives in the Java module classes vs the native layer?"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import patch_login
from patch_qih import Pool
from scan_kgt_modules import fields_of, super_chain

ROOT = sys.argv[1]
MODULE_BASE = 'ar7'


def method_stats(path):
    blob = open(path, 'rb').read()
    pool = Pool(blob)
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
    total, n, natives = 0, 0, 0
    for _ in range(mc):
        acc = struct.unpack_from('>H', blob, off)[0]
        ac = struct.unpack_from('>H', blob, off + 6)[0]
        if acc & 0x0100:
            natives += 1
        o = off + 8
        for _ in range(ac):
            an = pool.utf8.get(struct.unpack_from('>H', blob, o)[0])
            ln = struct.unpack_from('>I', blob, o + 2)[0]
            if an == 'Code':
                total += struct.unpack_from('>I', blob, o + 6)[0]
                n += 1
            o += 6 + ln
        off = o
    return total, n, natives


def main():
    kgt = os.path.join(ROOT, 'kgt.class')
    mods = []
    for acc, name, desc in fields_of(kgt):
        if not (acc & 0x0008) or not desc.startswith('L') or not desc.endswith(';'):
            continue
        cls = desc[1:-1]
        chain, _c = super_chain(ROOT, cls)
        if MODULE_BASE in chain:
            mods.append((name, cls))

    rows = []
    for name, cls in mods:
        p = os.path.join(ROOT, cls + '.class')
        if not os.path.isfile(p):
            continue
        try:
            total, n, natives = method_stats(p)
        except Exception:
            continue
        rows.append((total, name, cls, n, natives))

    rows.sort(reverse=True)
    print('modules with Java code, largest first:')
    print('  %-8s %-8s %-7s %-6s %s' % ('bytes', 'field', 'class', 'methods', 'native'))
    for total, name, cls, n, natives in rows[:25]:
        print('  %-8d %-8s %-7s %-7d %d' % (total, name, cls, n, natives))
    print('  ...')
    grand = sum(r[0] for r in rows)
    print()
    print('  module classes: %d' % len(rows))
    print('  total Java bytecode across modules: %d bytes' % grand)
    print('  modules with ZERO Java code: %d'
          % sum(1 for r in rows if r[0] == 0))
    print('  modules under 200 bytes: %d' % sum(1 for r in rows if r[0] < 200))


if __name__ == '__main__':
    main()
