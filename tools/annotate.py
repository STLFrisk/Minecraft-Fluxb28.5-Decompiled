#!/usr/bin/env python3
"""Turn CFR output into readable source by substituting decrypted ZKM literals.

The ZKM call site is always

    Class.a("<bsm arg>", (int)N, (long)(<expr> ^ <var>))

and the plaintext is a pure function of (declaring class, N) in practice
(8 / 8688 keys are ambiguous and are left untouched and reported).

Usage: annotate.py <plain.tsv> <outdir> <file.java> [file.java ...]
"""
import io
import json
import os
import re
import sys

CALL_START = re.compile(
    r'\b(?P<cls>[A-Za-z_$][A-Za-z0-9_$]*(?:\.[A-Za-z_$][A-Za-z0-9_$]*)*)\.'
    r'(?P<m>[A-Za-z_$][A-Za-z0-9_$]*)\('
    r'\s*"(?P<bsm>[^"]*)"\s*,\s*\(int\)\s*(?P<n>\d+)\s*,\s*\(long\)\s*\(')


def load_map(path):
    m = {}
    ambiguous = set()
    with io.open(path, encoding='utf-8') as fh:
        for ln in fh:
            p = ln.rstrip('\n').split('\t')
            if len(p) < 5:
                continue
            key = (p[0], p[3])
            if key in m and m[key] != p[4]:
                ambiguous.add(key)
            m[key] = p[4]
    return m, ambiguous


def java_literal(s):
    out = ['"']
    for ch in s:
        o = ord(ch)
        if ch == '"':
            out.append('\\"')
        elif ch == '\\':
            out.append('\\\\')
        elif ch == '\n':
            out.append('\\n')
        elif ch == '\r':
            out.append('\\r')
        elif ch == '\t':
            out.append('\\t')
        elif o < 0x20 or o == 0x7f:
            out.append('\\u%04x' % o)
        else:
            out.append(ch)
    out.append('"')
    return ''.join(out)


def find_close(src, open_idx):
    """Index just past the ')' matching src[open_idx]=='('."""
    depth = 0
    i = open_idx
    n = len(src)
    while i < n:
        c = src[i]
        if c == '"':
            i += 1
            while i < n:
                if src[i] == '\\':
                    i += 2
                    continue
                if src[i] == '"':
                    break
                i += 1
        elif c == '(':
            depth += 1
        elif c == ')':
            depth -= 1
            if depth == 0:
                return i + 1
        i += 1
    return -1


def annotate(src, table, ambiguous, stats):
    out = []
    i = 0
    n = len(src)
    while True:
        m = CALL_START.search(src, i)
        if not m:
            out.append(src[i:])
            break
        # the whole call: Class.a(...) -> need the '(' after '.a'
        paren = src.index('(', m.end('n')) if False else None
        start = m.start()
        cls = m.group('cls').split('.')[-1]
        nval = m.group('n')
        # locate the '(' that opens the argument list of .a(
        aparen = src.index('(', m.start() + len(m.group('cls')) + 1)
        end = find_close(src, aparen)
        if end < 0:
            out.append(src[i:start + 1])
            i = start + 1
            continue
        key = (cls, nval)
        if key in ambiguous or key not in table:
            stats['skipped'] += 1
            out.append(src[i:end])
            i = end
            continue
        out.append(src[i:start])
        out.append(java_literal(table[key]))
        stats['replaced'] += 1
        i = end
    return ''.join(out)


def main():
    plain, outdir = sys.argv[1], sys.argv[2]
    files = sys.argv[3:]
    table, ambiguous = load_map(plain)
    os.makedirs(outdir, exist_ok=True)
    for f in files:
        cls = os.path.splitext(os.path.basename(f))[0]
        src = io.open(f, encoding='utf-8', errors='replace').read()
        stats = {'replaced': 0, 'skipped': 0}
        res = annotate(src, table, ambiguous, stats)
        dest = os.path.join(outdir, os.path.basename(f))
        with io.open(dest, 'w', encoding='utf-8') as fh:
            fh.write(res)
        print('%-12s replaced=%-5d unchanged-callsites=%-5d' % (cls, stats['replaced'],
                                                                stats['skipped']))


if __name__ == '__main__':
    main()
