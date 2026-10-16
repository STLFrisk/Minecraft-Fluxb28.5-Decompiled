#!/usr/bin/env python3
"""Where does kgt.vuo (the feature registry) actually get populated?"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

ROOT = sys.argv[1] if len(sys.argv) > 1 else r'work\pristine'

targets = {
    ('c7u', 'run'): 143,
    ('c7u', 'wq_'): 0,
    ('fkf$afe', 'g71'): 320,
    ('fkf$r79', 'x5_'): 105,
    ('kgt', '<init>'): 8,
    ('kgt', 'vc3'): 0,
    ('kgt', 'wau'): 0,
    ('smq', 'w0y'): 60,
}

for dp, _d, fns in os.walk(ROOT):
    for fn in fns:
        if not fn.endswith('.class'):
            continue
        p = os.path.join(dp, fn)
        try:
            blob = open(p, 'rb').read()
        except Exception:
            continue
        try:
            for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
                key = (fn[:-6], mname)
                if key not in targets:
                    continue
                insns = callscan.decode_instructions(code)
                for i, (off, op, ops, ln) in enumerate(insns):
                    if op != 0xB2:
                        continue
                    if (callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0]) or '') != 'kgt.vuo':
                        continue
                    print('=== %s.%s @%d ===' % (fn[:-6], mname, off))
                    for j in range(i, min(i + 6, len(insns))):
                        o2, op2, ops2, ln2 = insns[j]
                        r = ''
                        if op2 in (0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9):
                            r = callscan.ref_name(pool, struct.unpack_from('>H', ops2, 0)[0]) or ''
                        elif op2 == 0xBB:
                            r = 'new ' + (callscan.class_name(pool, struct.unpack_from('>H', ops2, 0)[0]) or '')
                        print('     %-5d op=0x%02x %-24s %s' % (o2, op2, ops2.hex(' '), r))
                    print()
        except Exception:
            pass
