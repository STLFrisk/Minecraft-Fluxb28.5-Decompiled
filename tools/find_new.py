#!/usr/bin/env python3
"""Find every bytecode site instantiating (new/dup/invokespecial) or referencing a class.

Usage: find_new.py <class-tree-root> <dotted.class.Name>
      reports 'new' sites and every method that references the class at all.
"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan

NEW = 0xBB
CHECKCAST, INSTANCEOF, ANEWARRAY = 0xC0, 0xC1, 0xBD


def main():
    root, target = sys.argv[1], sys.argv[2]
    news, refs = [], []
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
                        if op in (NEW, CHECKCAST, INSTANCEOF, ANEWARRAY):
                            idx = struct.unpack_from('>H', o, 0)[0]
                            cn = callscan.class_name(pool, idx)
                            if cn == target:
                                (news if op == NEW else refs).append((rel, mname, off))
    print('=== new %s ===' % target)
    for h in sorted(news):
        print('   %-30s %-26s offset=%d' % h)
    print('=== other class-literal references ===')
    for h in sorted(refs):
        print('   %-30s %-26s offset=%d' % h)


if __name__ == '__main__':
    main()
