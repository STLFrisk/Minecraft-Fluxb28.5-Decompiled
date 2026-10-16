#!/usr/bin/env python3
"""Check whether a proposed obfuscated-name -> readable-name map is globally safe.

A ZKM name is a short opaque token.  Renaming it across the whole tree is only
correct if every class that DECLARES that name means the same thing by it - for
example d7c is declared by cn7 / crk / c_3 / dzm and is "get the value" in all of
them, so one global rename is fine.  If two unrelated classes both declare `ron`,
a global rename would silently merge two different methods.

This enumerates declaring classes straight from the bytecode, so the decision is
evidence-based rather than a guess about the decompiled text.
"""
import collections
import os
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan

# class constant-pool section after access/this/super/interfaces
def parse_class(blob):
    """Return (this_class, {method names}, {field names})."""
    n = struct.unpack_from('>H', blob, 8)[0]
    off = 10
    utf8 = {}
    cls = {}
    nat = {}
    entries = {}
    i = 1
    while i < n:
        tag = blob[off]
        if tag == 1:
            ln = struct.unpack_from('>H', blob, off + 1)[0]
            utf8[i] = blob[off + 3:off + 3 + ln].decode('utf-8', 'replace')
            off += 3 + ln
        elif tag in (7, 8, 16, 19, 20):
            entries[i] = (tag, blob[off + 1:off + 3])
            off += 3
        elif tag == 12:
            nat[i] = struct.unpack_from('>HH', blob, off + 1)
            off += 5
        elif tag in (9, 10, 11, 17, 18):
            entries[i] = (tag, blob[off + 1:off + 5])
            off += 5
        elif tag in (3, 4):
            off += 5
        elif tag in (5, 6):
            off += 9
            i += 1
        elif tag == 15:
            off += 4
        else:
            raise ValueError('tag %d' % tag)
        i += 1
    off += 2                      # access_flags
    this_idx = struct.unpack_from('>H', blob, off)[0]
    off += 2
    off += 2                      # super
    ifc = struct.unpack_from('>H', blob, off)[0]
    off += 2 + 2 * ifc
    this = utf8.get(entries.get(this_idx, (0, b'\x00\x00'))[1] and
                    struct.unpack_from('>H', entries[this_idx][1], 0)[0], '?')

    def members():
        nonlocal off
        cnt = struct.unpack_from('>H', blob, off)[0]
        off += 2
        names = set()
        for _ in range(cnt):
            off += 2                                   # access
            ni = struct.unpack_from('>H', blob, off)[0]
            off += 2
            off += 2                                   # descriptor
            ac = struct.unpack_from('>H', blob, off)[0]
            off += 2
            for _ in range(ac):
                ln = struct.unpack_from('>I', blob, off + 2)[0]
                off += 6 + ln
            names.add(utf8.get(ni, '?'))
        return names

    fields = members()
    methods = members()
    return this, methods, fields


def main():
    roots = sys.argv[1:]
    decl_method = collections.defaultdict(set)
    decl_field = collections.defaultdict(set)
    for root in roots:
        for dp, _, fns in os.walk(root):
            for fn in fns:
                if not fn.endswith('.class'):
                    continue
                try:
                    blob = open(os.path.join(dp, fn), 'rb').read()
                    this, ms, fs = parse_class(blob)
                except Exception:
                    continue
                for m in ms:
                    decl_method[m].add(this)
                for f in fs:
                    decl_field[f].add(this)
    print('  方法名总数 %d   字段名总数 %d' % (len(decl_method), len(decl_field)))
    print()
    watch = sys.argv[0] and [
        'ron', 'ne2', 'asw', 'tp_', 'z5z', 'kkj', 'dv9', 'yse', 'jpe', 'tb8',
        'zkf', 'qza', 'd2z', 'w4v', 'i__', 'a8n', 'ixy',
        'd7c', 'n1j', 'aze', 'wyk', 'ms1',
        '__x', 'mn9', 'esg', 'vpm', 'nnj', 'a65',
        'zj2', 'up0', 'zj2', 'zj2', 'qkk',
        '_k4', 'a2k', 'j02', 't8a', 'gqz', '_x3', 'bxh',
        'nf1', 'o_a', 'rzy', 'rxj', 'y6j', 'x9y', 'u57', 'a3o', 'o1r', 'q1i',
        'b6k', 'k27', 'ohn', '__1', 'cag', 'h1s', 'lgc',
        'Ex', 'b', 'c', 'klu',
    ]
    print('  %-8s %-6s %s' % ('名字', '声明类', '涉及的类'))
    for w in watch:
        cs = decl_method.get(w)
        if not cs:
            continue
        tag = '唯一' if len(cs) == 1 else '多云'
        print('  %-8s %-6d %s' % (w, len(cs), ' '.join(sorted(cs)[:12])))
    print()
    print('  --- 与类名同名的字段/方法（会导致类重命名误伤）---')
    clashes = []
    for name in sorted(decl_field):
        if name in decl_method or len(name) == 3:
            clashes.append(name)
    print('    3 字符字段名 %d 个（类重命名时必须用词边界）' % len(clashes))


if __name__ == '__main__':
    main()
