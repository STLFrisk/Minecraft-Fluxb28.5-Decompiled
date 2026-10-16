#!/usr/bin/env python3
"""Enumerate kgt's static fields and classify them as feature modules (ar7 subclasses)."""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from patch_qih import Pool

ROOT = sys.argv[1]
MODULE_BASE = 'ar7'


def super_chain(root, cls):
    """Walk the superclass chain of cls inside root; return the list of names."""
    seen = []
    cur = cls
    while cur and cur not in ('java/lang/Object', 'java/lang/Enum'):
        seen.append(cur)
        p = os.path.join(root, cur.replace('/', os.sep) + '.class')
        if not os.path.isfile(p):
            p2 = os.path.join(root, cur + '.class')
            if os.path.isfile(p2):
                p = p2
            else:
                return seen, False
        try:
            blob = open(p, 'rb').read()
        except Exception:
            return seen, False
        pool = Pool(blob)
        off = pool.end
        this_i, super_i = struct.unpack_from('>HH', blob, off + 2)
        cur = pool.cls.get(super_i)
    return seen, True


def fields_of(path):
    blob = open(path, 'rb').read()
    pool = Pool(blob)
    off = pool.end + 6
    ifc = struct.unpack_from('>H', blob, off)[0]
    off += 2 + 2 * ifc
    fc = struct.unpack_from('>H', blob, off)[0]
    off += 2
    out = []
    for _ in range(fc):
        acc, ni, di = struct.unpack_from('>HHH', blob, off)
        name = pool.utf8.get(ni)
        desc = pool.utf8.get(di)
        ac = struct.unpack_from('>H', blob, off + 6)[0]
        o = off + 8
        for _ in range(ac):
            ln = struct.unpack_from('>I', blob, o + 2)[0]
            o += 6 + ln
        out.append((acc, name, desc))
        off = o
    return out


def main():
    path = os.path.join(ROOT, 'kgt.class')
    statics = [(n, d) for a, n, d in fields_of(path) if a & 0x0008]
    print('kgt static fields: %d' % len(statics))
    print()
    modules, other = [], []
    for name, desc in statics:
        if not desc.startswith('L') or desc.endswith(';') is False:
            other.append((name, desc, 'not a class type'))
            continue
        cls = desc[1:-1]
        chain, complete = super_chain(ROOT, cls)
        if MODULE_BASE in chain:
            modules.append((name, cls))
        else:
            other.append((name, desc, 'chain=' + '->'.join(chain[:3]) + ('...' if len(chain) > 3 else '')))
    print('=== feature modules (ar7 subclasses): %d ===' % len(modules))
    for n, c in modules:
        print('   kgt.%-8s : %s' % (n, c))
    print()
    print('=== other statics: %d ===' % len(other))
    for n, d, why in other:
        print('   kgt.%-8s : %-24s %s' % (n, d, why))


if __name__ == '__main__':
    main()
