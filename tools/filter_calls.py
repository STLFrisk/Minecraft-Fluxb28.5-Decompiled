#!/usr/bin/env python3
"""Filter callsites.tsv down to a chosen set of classes (CLI args) or a --sample N."""
import sys
import io

src, dst = sys.argv[1], sys.argv[2]
want = set(sys.argv[3:])
n = 0
with io.open(src, encoding='utf-8') as fh, io.open(dst, 'w', encoding='utf-8') as out:
    for ln in fh:
        if ln.split('\t')[0] in want:
            out.write(ln)
            n += 1
print('rows written', n, 'classes', len(want))
