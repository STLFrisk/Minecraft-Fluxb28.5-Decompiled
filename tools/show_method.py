#!/usr/bin/env python3
"""Disassemble one method of a class file, with resolved constant-pool references.

Usage: show_method.py <class-file> <method-name> <descriptor> [start] [end]
"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool


def main():
    path, want, desc = sys.argv[1], sys.argv[2], sys.argv[3]
    lo = int(sys.argv[4]) if len(sys.argv) > 4 else 0
    hi = int(sys.argv[5]) if len(sys.argv) > 5 else 10 ** 9

    blob = open(path, 'rb').read()
    pool = Pool(blob)
    for mname, mdesc, cfo, code, mp in patch_login.code_arrays(blob):
        if mname != want or mdesc != desc:
            continue
        print('%s%s  code_length=%d' % (want, desc, len(code)))
        for off, op, ops, ln in callscan.decode_instructions(code):
            if off < lo or off > hi:
                continue
            ref = ''
            if op in (0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9):
                ref = callscan.ref_name(pool, struct.unpack_from('>H', ops, 0)[0]) or ''
            elif op == 0xBB:
                ref = 'new ' + (callscan.class_name(pool, struct.unpack_from('>H', ops, 0)[0]) or '?')
            elif op == 0xBA:
                ref = 'invokedynamic'
            elif op in (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
                        0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xC8, 0xC9):
                ref = '-> %d' % (off + struct.unpack_from('>h', ops, 0)[0])
            elif op in (0x10, 0x11):
                v = ops[0] if op == 0x10 else struct.unpack_from('>h', ops, 0)[0]
                ref = '#%d' % v
            elif op == 0x12:
                p = struct.unpack_from('>H', ops, 0)[0] if False else ops[0]
                ref = 'const #%d' % p
            elif op == 0x13 or op == 0x14:
                ref = 'const #%d' % struct.unpack_from('>H', ops, 0)[0]
            print('  %-6d %-14s %-14s %s' % (off, callscan.OPNAMES.get(op, '%02x' % op),
                                             ops.hex(' '), ref))
        return
    print('method %s%s not found' % (want, desc))


if __name__ == '__main__':
    main()
