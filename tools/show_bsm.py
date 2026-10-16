#!/usr/bin/env python3
"""Show kgt's BootstrapMethods so we know what the Comparator.comparing lambda needs."""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from patch_qih import Pool

path = sys.argv[1]
blob = open(path, 'rb').read()
pool = Pool(blob)

# --- find the BootstrapMethods attribute
off = pool.end + 6
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
for _ in range(mc):
    ac = struct.unpack_from('>H', blob, off + 6)[0]
    o = off + 8
    for _ in range(ac):
        ln = struct.unpack_from('>I', blob, o + 2)[0]
        o += 6 + ln
    off = o
cac = struct.unpack_from('>H', blob, off)[0]
off += 2
for _ in range(cac):
    an = pool.utf8.get(struct.unpack_from('>H', blob, off)[0])
    alen = struct.unpack_from('>I', blob, off + 2)[0]
    body = off + 6
    if an == 'BootstrapMethods':
        n = struct.unpack_from('>H', blob, body)[0]
        print('BootstrapMethods: %d' % n)
        p = body + 2
        for i in range(n):
            mh = struct.unpack_from('>H', blob, p)[0]
            na = struct.unpack_from('>H', blob, p + 2)[0]
            p += 4
            args = []
            for _ in range(na):
                args.append(struct.unpack_from('>H', blob, p)[0])
                p += 2
            def nm(i):
                return pool.ref.get(i) or ('const#%d' % i,)
            print('  #%-3d %-40s args=%s' % (i, nm(mh), [nm(a) for a in args]))
    off = body + alen
