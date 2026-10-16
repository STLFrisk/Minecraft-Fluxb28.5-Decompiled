#!/usr/bin/env python3
"""Measure what the decompilation actually gives us, and what it does not.

Answers "we already decompiled it, so why is this hard?" with counts instead of
opinions: how much of the logic is native-only, how much control flow carries an
opaque predicate, and how many string literals had to be recovered at runtime
because they do not exist in the file.
"""
import io
import os
import re
import sys

# Derived from this script's location so the checkout can live anywhere:
#   <repo>/tools/measure_obfuscation.py  ->  <repo>  ->  parent of <repo>
HERE = os.path.dirname(os.path.abspath(__file__))
REPO = os.path.dirname(HERE)
WS = os.path.dirname(REPO)

JAVA = os.path.join(REPO, 'reference', 'decompiled-bypassed-vineflower')
PRISTINE = os.path.join(WS, 'work', 'pristine')
STRINGS = os.path.join(REPO, 'evidence', 'decrypted_strings.tsv')

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan
import patch_login


def count_java():
    files = 0
    total = 0
    native = 0
    opaque = 0
    indy_tables = 0
    for dp, _, fns in os.walk(JAVA):
        for fn in fns:
            if not fn.endswith('.java'):
                continue
            files += 1
            p = os.path.join(dp, fn)
            total += os.path.getsize(p)
            try:
                s = io.open(p, encoding='utf-8', errors='replace').read()
            except Exception:
                continue
            native += len(re.findall(r'\bnative\s+[\w\[\]<>., ]+\s+\w+\s*\(', s))
            opaque += s.count('t9d.b()') + s.count('t9d.c()')
            indy_tables += s.count('private static final java.lang.String[]')
    return files, total, native, opaque, indy_tables


def count_bytecode():
    classes = 0
    methods = 0
    indy = 0
    for fn in os.listdir(PRISTINE):
        if not fn.endswith('.class'):
            continue
        classes += 1
        try:
            blob = open(os.path.join(PRISTINE, fn), 'rb').read()
        except Exception:
            continue
        try:
            for mn, md, cfo, code, pool in patch_login.code_arrays(blob):
                methods += 1
                for off, op, ops, ln in callscan.decode_instructions(code):
                    if op == 0xBA:
                        indy += 1
        except Exception:
            pass
    return classes, methods, indy


def main():
    files, total, native, opaque, tables = count_java()
    print('反编译源码')
    print('  .java 文件          %d' % files)
    print('  总大小              %.1f MB' % (total / 1048576.0))
    print('  native 方法声明     %d      <- 这一部分只有签名，逻辑在 WinLicense 虚拟化层里' % native)
    print('  t9d.b()/c() 调用点  %d      <- 不透明谓词：每个都是一处被混淆的控制流' % opaque)
    print('  ZKM 字符串数组字段  %d 组' % tables)
    print()
    classes, methods, indy = count_bytecode()
    n = 0
    if os.path.exists(STRINGS):
        for _ in io.open(STRINGS, encoding='utf-8'):
            n += 1
    print('字节码')
    print('  类                  %d' % classes)
    print('  方法                %d' % methods)
    print('  invokedynamic 调用点 %d     <- 每个都是一处【运行时解密】的字符串字面量' % indy)
    print('  已恢复的明文字符串   %d      <- 文件里根本不存在，必须跑解密器才有' % n)


if __name__ == '__main__':
    main()
