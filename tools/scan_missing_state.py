#!/usr/bin/env python3
"""List every field that is READ but never WRITTEN from Java.

That set is exactly the state the native layer (libsoter, WinLicense-virtualised
and not analysable) was responsible for filling in.  The auth server is gone, so
the native side never runs its login-time initialisation and every one of these
stays at its default - almost always null.

This is the "what is missing" inventory used to explain why a module can be
enabled, its settings loaded, its hooks registered and dispatched every tick, and
the feature still do nothing.

Usage: scan_missing_state.py <class-dir> [min-readers]
"""
import os
import struct
import sys
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login


def main():
    root = sys.argv[1]
    minread = int(sys.argv[2]) if len(sys.argv) > 2 else 1

    readers = defaultdict(list)
    writers = set()
    types = {}

    for fn in sorted(os.listdir(root)):
        if not fn.endswith('.class'):
            continue
        cls = fn[:-6]
        path = os.path.join(root, fn)
        try:
            blob = open(path, 'rb').read()
            for mn, md, cfo, code, pool in patch_login.code_arrays(blob):
                for off, op, ops, ln in callscan.decode_instructions(code):
                    if op not in (0xB2, 0xB3, 0xB4, 0xB5):
                        continue
                    nm = callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0])
                    if not nm or '.' not in nm:
                        continue
                    if op in (0xB3, 0xB5):
                        writers.add(nm)
                    else:
                        readers[nm].append('%s.%s@%d' % (cls, mn, off))
        except Exception:
            continue

    missing = []
    for f, rs in readers.items():
        if f in writers:
            continue
        if len(rs) < minread:
            continue
        missing.append((len(rs), f, rs[:3]))

    missing.sort(reverse=True)
    print('  %d 个字段只有读取者、没有任何 Java 写入者（读取点 >= %d）' % (len(missing), minread))
    print()
    print('  %-6s %-22s %s' % ('读取点', '字段', '示例'))
    for n, f, rs in missing:
        print('  %-6d %-22s %s' % (n, f, rs[0]))


if __name__ == '__main__':
    main()
