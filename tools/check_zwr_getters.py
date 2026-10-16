#!/usr/bin/env python3
"""Check the 7 native-only zwr getters and whether their types are safely constructible."""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

ROOT = sys.argv[1]

PAIRS = [
    ('up0', 'fge', 'szk'),
    ('up6', 'e6f', '_x3'),
    ('dlc', 'em8', 'txz'),
    ('pev', 'fji', 'b4o'),
    ('zr7', 'j76', 'az4'),
    ('w34', 'kly', 'f62'),
    ('gt2', 'pfn', 'lxj'),
]


def code_of(path, want_name, want_desc=None):
    blob = open(path, 'rb').read()
    for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
        if mname == want_name and (want_desc is None or mdesc == want_desc):
            return cfo, code, pool
    return None


def main():
    print('=== zwr getters ===')
    for getter, field, typ in PAIRS:
        hit = code_of(os.path.join(ROOT, 'zwr.class'), getter, '()L%s;' % typ)
        if hit is None:
            print('  zwr.%-5s  NOT FOUND as ()L%s;' % (getter, typ))
            continue
        cfo, code, pool = hit
        print('  zwr.%-5s -> %-6s  field=%-5s  code[0:8]=%s'
              % (getter, typ, field, code[:8].hex(' ')))

    print()
    print('=== constructors of the target types ===')
    for _g, _f, typ in PAIRS:
        p = os.path.join(ROOT, typ + '.class')
        if not os.path.isfile(p):
            p2 = os.path.join(ROOT, typ.replace('/', os.sep) + '.class')
            p = p2 if os.path.isfile(p2) else None
        if p is None:
            print('  %-6s  class file not found' % typ)
            continue
        hit = code_of(p, '<init>', '()V')
        if hit is None:
            print('  %-6s  NO no-arg constructor' % typ)
            continue
        cfo, code, pool = hit
        calls = []
        for off, op, ops, ln in callscan.decode_instructions(code):
            if op in (0xB6, 0xB7, 0xB8, 0xB9):
                calls.append(callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0]) or '?')
        native = [c for c in calls if c and '.Ex' in c]
        print('  %-6s  <init>()V %4d bytes ; calls: %s%s'
              % (typ, len(code), ', '.join(calls[:6]) or 'none',
                 '   [NATIVE-PATH: %s]' % native if native else ''))


if __name__ == '__main__':
    main()
