#!/usr/bin/env python3
"""Audit the staged tree for anything that should not leave this machine.

Categories, in rough order of how damaging a leak would be:

  credentials   tokens, passwords, API keys, session strings
  identity      the operator's own account names, UUIDs, HWID material
  location      absolute paths that disclose the machine layout
  third-party   addresses or personal data belonging to other people

Absolute machine paths are the most likely finding here: this project is full of
build commands, tool invocations and diagnostic output, and every one of them was
written with a concrete local path in it.
"""
import collections
import io
import os
import re
import subprocess
import sys

TREE = sys.argv[1]

CHECKS = [
    ('credential',   re.compile(r'(?i)\b(password|passwd|secret|api[_-]?key|access[_-]?token|'
                                r'refresh[_-]?token|bearer|authorization|session[_-]?token|'
                                r'private[_-]?key|client[_-]?secret)\b\s*[:=]\s*\S{6,}')),
    ('key-block',    re.compile(r'-----BEGIN [A-Z ]*PRIVATE KEY-----')),
    ('jwt',          re.compile(r'\beyJ[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}')),
    ('email',        re.compile(r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}\b')),
    ('win-path',     re.compile(r'[A-Za-z]:\\\\?Users\\\\?[^\\\s"\']+|'
                                r'[A-Za-z]:\\Users\\[^\\\s"\']+|'
                                r'[A-Za-z]:/Users/[^/\s"\']+')),
    ('any-abs-path', re.compile(r'[A-Za-z]:\\[A-Za-z][^\\\s"\']*\\|\b/home/[a-z][\w.-]*/')),
    ('mc-dir',       re.compile(r'[A-Za-z]:\\Minecraft\\|\b\.minecraft\\versions\\')),
    ('hwid-hint',    re.compile(r'(?i)\b(hwid|hardware[_-]?id|machine[_-]?guid|serial)\b\s*[:=]\s*\S{4,}')),
    ('ipv4',         re.compile(r'\b(?!0\.|127\.|255\.|10\.|192\.168\.)(\d{1,3}\.){3}\d{1,3}\b')),
    ('uuid',         re.compile(r'\b[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-'
                                r'[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\b')),
]

SKIP_EXT = {'.png', '.ttf', '.otf', '.jpg', '.jpeg', '.gif', '.dll', '.so', '.dylib',
            '.jar', '.class', '.zip', '.der', '.ogg', '.wav', '.nbt', '.dat'}


def staged(root):
    out = subprocess.run(['git', '-C', root, 'ls-files', '--cached'],
                         capture_output=True, text=True, encoding='utf-8', errors='replace')
    return [l for l in out.stdout.splitlines() if l.strip()]


def main():
    files = staged(TREE)
    print('  索引中 %d 个文件' % len(files))
    hits = collections.defaultdict(list)
    scanned = 0
    for rel in files:
        p = os.path.join(TREE, rel.replace('/', os.sep))
        if not os.path.isfile(p):
            continue
        if os.path.splitext(p)[1].lower() in SKIP_EXT:
            continue
        try:
            if os.path.getsize(p) > 4 * 1024 * 1024:
                continue
            text = io.open(p, encoding='utf-8', errors='replace').read()
        except Exception:
            continue
        scanned += 1
        for name, rx in CHECKS:
            for m in rx.finditer(text):
                line = text.count('\n', 0, m.start()) + 1
                hits[name].append((rel, line, m.group(0)[:110]))
    print('  已扫描 %d 个文本文件' % scanned)
    print()
    for name, _ in CHECKS:
        rows = hits.get(name, [])
        if not rows:
            continue
        byfile = collections.Counter(r[0] for r in rows)
        print('  [%s] %d 处，涉及 %d 个文件' % (name, len(rows), len(byfile)))
        for f, c in byfile.most_common(6):
            print('      %-64s %d' % (f, c))
        for rel, line, s in rows[:3]:
            print('        e.g. %s:%d  %s' % (rel, line, s))
        print()


if __name__ == '__main__':
    main()
