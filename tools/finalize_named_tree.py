#!/usr/bin/env python3
"""Finish the renamed tree: file names follow class names, resources are carried over.

Vineflower writes one file per class using the ZKM token (ar7.java), so the rename
has to reach the file system too, otherwise Module.java does not exist under that
name.  The raw tree also holds 4,000+ non-Java resources (models, textures, lang
files, shaders, the two pinned .der certificates) - carrying them over makes the
named tree a complete, self-consistent source tree rather than Java only.
"""
import io
import os
import re
import shutil
import sys

RAW = sys.argv[1]
NAMED = sys.argv[2]

DECL = re.compile(r'^\s*(?:public\s+|final\s+|abstract\s+)*(class|interface|enum)\s+([A-Za-z_$][\w$]*)',
                  re.M)


def target_name(path):
    """The class the file declares, or None when it cannot be determined."""
    try:
        head = io.open(path, encoding='utf-8', errors='replace').read(200000)
    except Exception:
        return None
    m = DECL.search(head)
    if not m:
        return None
    name = m.group(2)
    # a file may declare several types; only rename when the declared name is a
    # plausible rename of the current stem, so anonymous/numbered files stay put
    stem = os.path.basename(path)[:-5]
    if name == stem:
        return None
    if re.fullmatch(r'[\w$]+', name):
        return name
    return None


def main():
    renamed = 0
    for dp, _, fns in os.walk(NAMED):
        for fn in list(fns):
            if not fn.endswith('.java'):
                continue
            p = os.path.join(dp, fn)
            t = target_name(p)
            if not t:
                continue
            dst = os.path.join(dp, t + '.java')
            if os.path.exists(dst):
                continue
            os.rename(p, dst)
            renamed += 1
    print('  按类名重命名文件: %d 个' % renamed)

    copied = 0
    for dp, _, fns in os.walk(RAW):
        for fn in fns:
            if fn.endswith('.java'):
                continue
            src = os.path.join(dp, fn)
            rel = os.path.relpath(src, RAW)
            dst = os.path.join(NAMED, rel)
            d = os.path.dirname(dst)
            if d and not os.path.isdir(d):
                os.makedirs(d)
            if not os.path.exists(dst):
                shutil.copy2(src, dst)
                copied += 1
    print('  复制资源文件: %d 个' % copied)

    total = sum(len(f) for _, _, f in os.walk(NAMED))
    size = sum(os.path.getsize(os.path.join(dp, f))
               for dp, _, fs in os.walk(NAMED) for f in fs)
    print('  最终: %d 个文件, %.1f MB' % (total, size / 1048576.0))


if __name__ == '__main__':
    main()
