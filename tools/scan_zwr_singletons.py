#!/usr/bin/env python3
"""Enumerate zwr's singleton getters and classify which are Java-initialised.

Pattern under investigation: `zwr.qkk.<getter>()` returns an instance field that
only the native layer ever assigns, so every caller NPEs once login is bypassed.
"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool

ROOT = sys.argv[1]


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
        desc = pool.utf8.get(di)
        ac = struct.unpack_from('>H', blob, off + 6)[0]
        o = off + 8
        for _ in range(ac):
            ln = struct.unpack_from('>I', blob, o + 2)[0]
            o += 6 + ln
        out.append((acc, pool.utf8.get(ni), desc))
        off = o
    return out


def main():
    zpath = os.path.join(ROOT, 'zwr.class')
    all_fields = fields_of(zpath)
    instance = {n: d for a, n, d in all_fields
                if not (a & 0x0008) and d.startswith('L') and d.endswith(';')}
    print('zwr instance fields holding objects: %d' % len(instance))

    # every putfield/putstatic of zwr.<field> across the tree
    writers = {n: [] for n in instance}
    readers = {n: [] for n in instance}
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
                        if not r.startswith('zwr.'):
                            continue
                        f = r[4:]
                        if f not in instance:
                            continue
                        if op in (0xB3, 0xB5):      # putstatic / putfield
                            writers[f].append((cls, mname, off))
                        else:
                            readers[f].append((cls, mname, off))
            except Exception:
                pass

    print()
    print('%-10s %-26s %s' % ('field', 'type', 'java writers'))
    native_only = []
    for n, d in sorted(instance.items()):
        w = writers[n]
        tag = ''
        if not w:
            native_only.append((n, d))
            tag = '   <-- NO JAVA WRITER'
        print('%-10s %-26s %d%s' % (n, d[:26], len(w), tag))

    print()
    print('=== native-only singletons: %d ===' % len(native_only))
    for n, d in native_only:
        print('   zwr.%-8s : %-24s readers=%d  e.g. %s'
              % (n, d, len(readers[n]), sorted(readers[n])[:3]))


if __name__ == '__main__':
    main()
