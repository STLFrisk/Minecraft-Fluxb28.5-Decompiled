#!/usr/bin/env python3
"""Locate every bytecode write to a named field: putstatic/putfield of <owner>.<name>.

Usage: find_field_writes.py <class-tree-root> <owner.dotted> <fieldname>
"""
import io
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan  # reuse its class-file parser and opcode table

PUTSTATIC, PUTFIELD = 0xB3, 0xB5


def main():
    root, owner, field = sys.argv[1], sys.argv[2], sys.argv[3]
    hits = []
    for dp, _dn, fns in os.walk(root):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            p = os.path.join(dp, fn)
            rel = os.path.relpath(p, root)[:-6].replace(os.sep, '.').replace('/', '.')
            try:
                parsed = callscan.parse_class(p)
            except Exception:
                continue
            if parsed is None:
                continue
            pool, _fields, methods = parsed
            for _acc, mname, _mdesc, attrs in methods:
                for aname, abytes in attrs:
                    if aname != 'Code':
                        continue
                    r = callscan.Reader(abytes)
                    r.u2(); r.u2()
                    code = r.take(r.u4())
                    try:
                        insns = callscan.decode_instructions(code)
                    except Exception:
                        continue
                    for off, op, o, _s in insns:
                        if op not in (PUTSTATIC, PUTFIELD):
                            continue
                        idx = struct.unpack_from('>H', o, 0)[0]
                        ref = callscan.ref_name(pool, idx)
                        if ref == '%s.%s' % (owner, field):
                            desc = None
                            if pool[idx] and pool[idx][0] in (9,):
                                desc = callscan.nat_desc(pool, pool[idx][1][1])
                            hits.append((rel, mname, off, desc,
                                         'putstatic' if op == PUTSTATIC else 'putfield'))
    for h in sorted(hits):
        print('%-28s %-24s offset=%-6d %-9s %s' % h[:5])


if __name__ == '__main__':
    main()
