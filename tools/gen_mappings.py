#!/usr/bin/env python3
"""Generate the `mappings/` tree of the Flux-RE project from analysis output.

Inputs (produced by tools/harvest.py + tools/callscan.py + tools/DumpStrings.java):
    <work>/index/classes.json         per-class strings / refs / member refs
    <work>/index/member_index.json    member -> calling classes
    <work>/index/class_index.json     class -> referencing classes
    <work>/plain2/strings_plain.tsv   decrypted literals
    <work>/FluxClasses/               extracted .class files (for native flags)

Outputs:
    mappings/strings.tsv              decrypted literal table
    mappings/class-index.tsv          every class with role hints
    mappings/native.yaml              every native method + its callers
    mappings/strings-by-category.md   curated literal overview
"""
import collections
import io
import json
import os
import re
import struct
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import callscan

# A class counts as "interesting" when it owns literals that look like real
# behaviour rather than Mojang/OptiFine i18n keys.
I18N_KEY = re.compile(r'^[a-z][a-z0-9_]*(\.[a-z0-9_]+)+$')

CATEGORIES = [
    ('endpoint',        re.compile(r'https?://|://|\bsessions?server\b|\bauthserver\b')),
    ('auth',            re.compile(r'(?i)\b(login|logout|token|password|username|hwid|licen[cs]e|'
                                   r'credential|session|verify|register|forgot)\b')),
    ('native-bridge',   re.compile(r'(?i)META-INF/Soter|\.dll|\.so|\.dylib|loadLibrary')),
    ('account-vendor',  re.compile(r'(?i)thealtening|netease|yggdrasil|mojang|mlv5|hypixel|killaura|'
                                   r'xinchen|mcbaozi|flux\.today|enalts')),
    ('ui-label',        re.compile(r'^[A-Z][A-Za-z0-9 ./+%\-]{2,40}$')),
    ('cjk',             re.compile(r'[\u4e00-\u9fff]')),
    ('legacy-key',      re.compile(r'^[a-z][a-z0-9_.]+$')),
]


def load(work):
    idx = os.path.join(work, 'index')
    with io.open(os.path.join(idx, 'classes.json'), encoding='utf-8') as fh:
        classes = json.load(fh)
    with io.open(os.path.join(idx, 'member_index.json'), encoding='utf-8') as fh:
        members = json.load(fh)
    with io.open(os.path.join(idx, 'class_index.json'), encoding='utf-8') as fh:
        refs = json.load(fh)
    strings = collections.defaultdict(dict)     # class -> (method, offset) -> text
    with io.open(os.path.join(work, 'plain2', 'strings_plain.tsv'), encoding='utf-8') as fh:
        for ln in fh:
            p = ln.rstrip('\n').split('\t')
            if len(p) >= 5:
                strings[p[0]][(p[1], p[2])] = p[4]
    return classes, members, refs, strings


def native_inventory(tree):
    """class -> [(method, descriptor)] for every ACC_NATIVE method."""
    out = collections.defaultdict(list)
    for dp, _dn, fns in os.walk(tree):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            p = os.path.join(dp, fn)
            try:
                parsed = callscan.parse_class(p)
            except Exception:
                continue
            if parsed is None:
                continue
            _pool, _fields, methods = parsed
            cls = os.path.relpath(p, tree)[:-6].replace(os.sep, '.').replace('/', '.')
            for acc, mname, mdesc, _attrs in methods:
                if acc & 0x0100:
                    out[cls].append((mname, mdesc))
    return out


def classify(text):
    for name, rx in CATEGORIES:
        if rx.search(text):
            return name
    return 'other'


def main():
    work, tree, outdir = sys.argv[1], sys.argv[2], sys.argv[3]
    os.makedirs(outdir, exist_ok=True)
    classes, members, refs, strings = load(work)
    natives = native_inventory(tree)

    # ---------------------------------------------------------------- strings.tsv
    with io.open(os.path.join(outdir, 'strings.tsv'), 'w', encoding='utf-8') as fh:
        fh.write('# decrypted ZKM string literals\n')
        fh.write('# class\tmethod\tcode_offset\tn\tliteral\n')
        total = 0
        for cls in sorted(strings):
            for (m, off), text in sorted(strings[cls].items(), key=lambda kv: int(kv[0][1])):
                fh.write('%s\t%s\t%s\t\t%s\n' % (cls, m, off, text.replace('\t', '\\t')))
                total += 1
    print('strings.tsv           :', total, 'literals,', len(strings), 'classes')

    # ------------------------------------------------------------ class-index.tsv
    rows = []
    for cls, v in classes.items():
        owned = strings.get(cls, {})
        interesting = [t for t in owned.values() if not I18N_KEY.match(t)]
        callers = refs.get(cls, [])
        nats = natives.get(cls, [])
        hint = ''
        for cand in interesting:
            if classify(cand) in ('endpoint', 'auth', 'native-bridge', 'account-vendor'):
                hint = cand
                break
        if not hint and interesting:
            hint = sorted(interesting, key=len)[0]
        rows.append((cls, len(owned), len(interesting), len(callers), len(nats), hint))
    rows.sort(key=lambda r: (-r[3], -r[2], r[0]))
    with io.open(os.path.join(outdir, 'class-index.tsv'), 'w', encoding='utf-8') as fh:
        fh.write('# class\tliterals\tinteresting_literals\treferenced_by\tnative_methods\thint\n')
        for r in rows:
            fh.write('%s\t%d\t%d\t%d\t%d\t%s\n' % (r[0], r[1], r[2], r[3], r[4],
                                                   r[5].replace('\t', ' ')))
    print('class-index.tsv       :', len(rows), 'classes')

    # ---------------------------------------------------------------- native.yaml
    with io.open(os.path.join(outdir, 'native.yaml'), 'w', encoding='utf-8') as fh:
        fh.write('# Classes declaring ACC_NATIVE methods.\n'
                 '# The Flux.jar ships exactly one native library — META-INF/Soter\n'
                 '# (libsoter.dll, 50,531,856 bytes, export JNI_OnLoad only) — loaded by v6ma,\n'
                 '# so every entry below is served by that single module via RegisterNatives.\n')
        fh.write('native_library:\n'
                 '  container_entry: META-INF/Soter\n'
                 '  pe_sha256: 7bf3b5a135152a6ecba93d275aa817e7070217e855d15de543e27222364f1404\n'
                 '  kind: PE32+ x86-64 DLL\n'
                 '  exports: [JNI_OnLoad]\n'
                 '  imports: [kernel32!GetModuleHandleA, msvcrt!__iob_func]\n'
                 '  loaded_by: v6ma\n'
                 '  notes: >-\n'
                 '    Heavily packed: the .boot section (49,501,184 bytes) holds the real code and\n'
                 '    .winlice is 82,329,600 bytes of virtual size with zero bytes on disk.\n'
                 '    Ghidra auto-analysis over 600s recovers only 4 functions.\n'
                 'classes:\n')
        for cls in sorted(natives):
            callers = refs.get(cls, [])
            fh.write('  - class: %s\n' % cls)
            fh.write('    referenced_by: %d\n' % len(callers))
            fh.write('    methods:\n')
            for mname, mdesc in sorted(natives[cls]):
                jcallers = sorted(members.get('%s.%s' % (cls, mname), []))
                fh.write('      - name: %s\n' % mname)
                fh.write('        descriptor: "%s"\n' % mdesc)
                fh.write('        java_callers: %s\n'
                         % ('[]' if not jcallers else '["%s"]' % '", "'.join(jcallers[:8])))
    print('native.yaml           :', len(natives), 'classes,',
          sum(len(v) for v in natives.values()), 'native methods')

    # ------------------------------------------------- strings-by-category.md
    all_lit = collections.Counter()
    owner = {}
    for cls, d in strings.items():
        for text in d.values():
            all_lit[text] += 1
            owner.setdefault(text, cls)
    bycat = collections.defaultdict(list)
    for text in all_lit:
        bycat[classify(text)].append(text)
    with io.open(os.path.join(outdir, 'strings-by-category.md'), 'w', encoding='utf-8') as fh:
        fh.write('# Decrypted literals by category\n\n')
        fh.write('Generated by `tools/gen_mappings.py`. '
                 'Full machine-readable table: `strings.tsv`.\n\n')
        for name, _rx in CATEGORIES:
            items = sorted(set(bycat.get(name, [])))
            fh.write('## %s (%d distinct)\n\n' % (name, len(items)))
            if name == 'legacy-key':
                fh.write('_i18n / resource keys — listed only as a count; see strings.tsv._\n\n')
                continue
            for t in items[:60]:
                fh.write('- `%s`  <sub>%s</sub>\n' % (t.replace('|', '\\|')[:160], owner.get(t, '?')))
            if len(items) > 60:
                fh.write('- … and %d more\n' % (len(items) - 60))
            fh.write('\n')
    print('strings-by-category.md:', sum(len(v) for v in bycat.values()), 'occurrences')


if __name__ == '__main__':
    main()
