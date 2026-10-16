#!/usr/bin/env python3
"""List every method carrying RuntimeVisibleAnnotations that reference a given class.

Usage: scan_annotations.py <class-dir> <annotation-class-name>
"""
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from patch_qih import Pool


def scan(path, want):
    blob = open(path, 'rb').read()
    pool = Pool(blob)
    # class name of the annotation we are looking for
    want_idx = None
    for i, (tag, val) in pool.entries.items():
        if tag == 7 and pool.utf8.get(val) == want:
            want_idx = i
    if want_idx is None:
        return []
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
            off += 6 + struct.unpack_from('>I', blob, off + 2)[0]
    mc = struct.unpack_from('>H', blob, off)[0]
    off += 2
    found = []
    for _ in range(mc):
        acc = struct.unpack_from('>H', blob, off)[0]
        nm = pool.utf8.get(struct.unpack_from('>H', blob, off + 2)[0])
        de = pool.utf8.get(struct.unpack_from('>H', blob, off + 4)[0])
        ac = struct.unpack_from('>H', blob, off + 6)[0]
        o = off + 8
        for _ in range(ac):
            an = pool.utf8.get(struct.unpack_from('>H', blob, o)[0])
            ln = struct.unpack_from('>I', blob, o + 2)[0]
            if an == 'RuntimeVisibleAnnotations':
                body = blob[o + 6:o + 6 + ln]
                n = struct.unpack_from('>H', body, 0)[0]
                p = 2
                for _ in range(n):
                    # annotation: type_index u2, num_pairs u2, pairs...
                    tidx = struct.unpack_from('>H', body, p)[0]
                    if tidx == want_idx:
                        found.append((nm, de, 'ref'))
                    p += 2
                    npairs = struct.unpack_from('>H', body, p)[0]
                    p += 2
                    for _ in range(npairs):
                        p += 2                                  # element_name_index
                        tagc = body[p:p + 1]
                        p += 1
                        if tagc in (b'B', b'C', b'I', b'S', b'Z'):
                            p += 2
                        elif tagc in (b'D', b'F', b'J'):
                            p += 4
                        elif tagc in (b'e',):
                            p += 4
                        elif tagc in (b'c',):
                            p += 2
                        elif tagc in (b's',):
                            p += 2
                        elif tagc in (b'@',):
                            raise SystemExit('nested annotation not handled')
                        elif tagc in (b'['):
                            cnt = struct.unpack_from('>H', body, p)[0]
                            p += 2 + 2 * cnt
            o += 6 + ln
        off = o
    return found


def main():
    root, want = sys.argv[1], sys.argv[2]
    total = 0
    classes = 0
    for dp, _d, fns in os.walk(root):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            try:
                hits = scan(os.path.join(dp, fn), want)
            except Exception:
                continue
            if hits:
                classes += 1
                total += len(hits)
                cls = os.path.relpath(os.path.join(dp, fn), root)[:-6].replace(os.sep, '.')
                if classes <= 25:
                    print('  %-28s %d 个方法: %s'
                          % (cls, len(hits), [h[0] for h in hits[:6]]))
    print()
    print('  带 @%s 的类 %d 个，方法共 %d 个' % (want, classes, total))


if __name__ == '__main__':
    main()
