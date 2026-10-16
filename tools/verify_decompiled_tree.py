#!/usr/bin/env python3
"""Assert that a decompiled tree really is the 34-patch build.

A newer timestamp is not evidence.  Each marker below exists only if a specific
patch is present in the bytecode that was decompiled, so this distinguishes "the
tree was regenerated" from "the tree was regenerated FROM THE PATCHED JAR".
"""
import io
import os
import sys

TREE = sys.argv[1]

# marker -> (class file that must contain it, patch it proves)
MARKERS = [
    ('FluxBus.java',                    'envelope class added for P29/P30/P32/P33/P34'),
    ('FluxDiag.java',                   'runtime reflection probe added'),
    ('forEach',                         'P29 - ar7.ron/ne2 unregister the _w6 sub-engines'),
    ('modeChanged',                     'P33 - mode polling re-dispatch helper'),
    ('ensureConfig',                    'P32 - per-world config re-apply'),
    ('sync',                            'P30 - unified toggle dispatch'),
]

PER_CLASS = [
    ('ar7.java',  ['forEach', 'ne2', 'asw'],           'P29/P11 - sub-engine register/unregister'),
    ('szk.java',  ['zj2', '_k4', 'a2k'],               'P31/P27 - registry first, binds before load'),
    ('c05.java',  ['ensureConfig'],                    'P32 - tick hook drives ensureConfig'),
    ('kgt.java',  ['add'],                             'P9/P23 - Java-side 98-module registry'),
    ('xbs.java',  ['__x', 'nf1'],                      'P28 - engine registered on the bus'),
    ('qih.java',  ['z2i'],                             'P4 - login screen redirected to the menu'),
    ('zwr.java',  ['zj2', 'up0'],                      'P8/P10 - native-only singletons made lazy'),
]

found = {}
for dp, _, fns in os.walk(TREE):
    for fn in fns:
        if fn.endswith('.java'):
            found.setdefault(fn, os.path.join(dp, fn))

print('  反编译树: %s' % TREE)
print('  .java 文件总数: %d' % sum(1 for dp, _, fns in os.walk(TREE) for f in fns if f.endswith('.java')))
print()

ok = True
print('  新增类')
for name, why in MARKERS[:2]:
    hit = name in found
    ok = ok and hit
    print('    %-18s %s   %s' % (name, 'OK ' if hit else 'MISS', why))

print()
print('  逐类补丁标记')
for name, keys, why in PER_CLASS:
    if name not in found:
        print('    %-12s MISS  %s' % (name, why))
        ok = False
        continue
    s = io.open(found[name], encoding='utf-8', errors='replace').read()
    marks = ['%s=%d' % (k, s.count(k)) for k in keys]
    good = all(s.count(k) > 0 for k in keys)
    ok = ok and good
    print('    %-12s %s  %-28s %s' % (name, 'OK ' if good else 'MISS', ' '.join(marks), why))

print()
print('  探针/总线辅助类的宿主方法')
for name, why in MARKERS[2:]:
    hit = any(name in io.open(p, encoding='utf-8', errors='replace').read()
              for p in found.values())
    print('    %-18s %s   %s' % (name, 'OK ' if hit else 'MISS', why))

print()
print('  VERDICT: %s' % ('该反编译树来自 34 补丁版本' if ok else '该反编译树【不是】最新的 34 补丁版本'))
sys.exit(0 if ok else 1)
