#!/usr/bin/env python3
"""Dump the target-selection filter of Flux's KillAura (fyk$r1f).

fyk.k27(fha) walks c05.tij.guf and, for each entity, gets or creates a per-entity
filter at ha9.pwz, then calls filter.cag(...).  The filter reads the static
fyk.kfa (the current target) and decides whether the entity qualifies, and
xbs.nf1 is what ultimately stores the chosen target.  If fyk.kfa stays null the
aura has no target at all.

Usage: dump_filter.py <class-dir>
"""
import os
import struct
import subprocess
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login

JAVAP = r'C:\Program Files\Java\jdk-17.0.19\bin\javap.exe'

BRANCH = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
          0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6)


def label(pool, op, ops, off):
    if op in (0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9):
        return callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0]) or ''
    if op == 0xBB:
        return 'new ' + (callscan.class_name(pool, struct.unpack_from('>H', ops, 0)[0]) or '?')
    if op in BRANCH:
        return '-> %d' % (off + struct.unpack_from('>h', ops, 0)[0])
    if op == 0xC0:
        return 'checkcast ' + (callscan.class_name(pool, struct.unpack_from('>H', ops, 0)[0]) or '?')
    if op == 0xC1:
        return 'instanceof ' + (callscan.class_name(pool, struct.unpack_from('>H', ops, 0)[0]) or '?')
    if op in (0x03, 0x04, 0x05):
        return str(op - 3)
    return ''


def main():
    root = sys.argv[1]
    want_cls = sys.argv[2] if len(sys.argv) > 2 else 'fyk$r1f'
    want_m = sys.argv[3] if len(sys.argv) > 3 else 'cag'
    limit = int(sys.argv[4]) if len(sys.argv) > 4 else 60

    path = os.path.join(root, want_cls + '.class')
    if not os.path.exists(path):
        raise SystemExit('FAIL-CLOSED: %s missing' % path)

    print('=== %s ===' % want_cls)
    out = subprocess.run([JAVAP, '-p', path], capture_output=True, text=True,
                         encoding='utf-8', errors='replace').stdout
    for ln in out.splitlines()[:40]:
        print('  ' + ln.rstrip())

    blob = open(path, 'rb').read()
    found = False
    for mn, md, cfo, code, pool in patch_login.code_arrays(blob):
        if mn != want_m:
            continue
        found = True
        print()
        print('=== %s.%s%s  %d bytes ===' % (want_cls, mn, md, len(code)))
        n = 0
        for off, op, ops, ln in callscan.decode_instructions(code):
            if n > limit:
                print('  ...')
                break
            n += 1
            print('    %-5d %-3s %-16s %s' % (off, '%02x' % op, ops.hex(' '),
                                              label(pool, op, ops, off)))
    if not found:
        print('  (method %s not present)' % want_m)


if __name__ == '__main__':
    main()
