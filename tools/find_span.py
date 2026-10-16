#!/usr/bin/env python3
"""Find spans in a method that are free of branch targets, handlers and protection."""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login
from patch_qih import Pool

BRANCH = (0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0xA7, 0xC6, 0xC7,
          0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6)


def main():
    path, cls_method, desc = sys.argv[1], sys.argv[2], sys.argv[3]
    minlen = int(sys.argv[4]) if len(sys.argv) > 4 else 11
    blob = open(path, 'rb').read()
    p0 = Pool(blob)

    for mn, md, cfo, code, mp in patch_login.code_arrays(blob):
        if mn != cls_method or md != desc:
            continue

        # locate the Code attribute to read the exception table
        off = p0.end + 6
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
        table = None
        for _ in range(mc):
            nm = p0.utf8.get(struct.unpack_from('>H', blob, off + 2)[0])
            ac = struct.unpack_from('>H', blob, off + 6)[0]
            o = off + 8
            for _ in range(ac):
                an = p0.utf8.get(struct.unpack_from('>H', blob, o)[0])
                ln = struct.unpack_from('>I', blob, o + 2)[0]
                if nm == cls_method and an == 'Code':
                    b = o + 6
                    cl = struct.unpack_from('>I', blob, b + 4)[0]
                    q = b + 8 + cl
                    etl = struct.unpack_from('>H', blob, q)[0]
                    q += 2
                    table = [struct.unpack_from('>HHHH', blob, q + 8 * i) for i in range(etl)]
                o += 6 + ln
            off = o

        print('%s%s  code_length=%d  exception entries=%d'
              % (cls_method, desc, len(code), len(table or [])))
        for s, e, h, t in (table or []):
            print('   protected [%3d,%3d) -> handler %3d' % (s, e, h))

        protected = set()
        for s, e, h, t in (table or []):
            for x in range(s, e):
                protected.add(x)
        handlers = {h for _s, _e, h, _t in (table or [])}

        targets = set()
        for off2, op, ops, ln2 in callscan.decode_instructions(code):
            if op in BRANCH:
                targets.add(off2 + struct.unpack_from('>h', ops, 0)[0])
            elif op in (0xAA, 0xAB):
                targets.add(off2)

        bounds = [off2 for off2, _o, _p, _l in callscan.decode_instructions(code)]
        print()
        print('free spans >= %d bytes (no branch target, no handler, unprotected):' % minlen)
        # walk instruction starts only - byte-by-byte walking breaks on every
        # operand byte and can never see a span longer than one instruction.
        run = []
        for x in bounds:
            if x not in protected and x not in targets and x not in handlers:
                run.append(x)
            else:
                if run and run[-1] + 1 - run[0] >= minlen:
                    print('   [%d, %d)  %d bytes' % (run[0], run[-1], run[-1] + 1 - run[0]))
                run = []
        if run and run[-1] + 1 - run[0] >= minlen:
            print('   [%d, %d)  %d bytes' % (run[0], run[-1], run[-1] + 1 - run[0]))


if __name__ == '__main__':
    main()
