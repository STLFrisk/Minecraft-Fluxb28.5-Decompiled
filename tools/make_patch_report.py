#!/usr/bin/env python3
"""Assemble the combined patch report for the delivered Flux bypass."""
import io
import json
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import patch_login
import patch_welcome

WORK = sys.argv[1]
OUT = sys.argv[2]

base = json.load(io.open(os.path.join(WORK, 'patch_out', 'patch_report.json'), encoding='utf-8'))
q = base['q08']['q08_drawScreen']
j = base['jiz']['<init>']

# detect the P3 sites on the pre-P3 build (patch_out), where the call chains still exist
blob = io.open(os.path.join(WORK, 'patch_out', 'q08.class'), 'rb').read()
triples = patch_welcome.find_triples(blob)

rep = {
    'target': {
        'file': 'Flux.jar',
        'sha256': '506D7B5659846F4F440CC6CB2BAB69D0A38262A213A4C7F43521C5DF1964FE2E',
        'obfuscator': 'Zelix KlassMaster 12.0.4',
    },
    'patches': [
        {
            'id': 'P1',
            'class': 'q08',
            'method': 'drawScreen(IIF)V',
            'purpose': 'login gate: the only qih instantiation in the jar; make it unreachable',
            'sites': [
                {'code_offset': s['offset'], 'kind': s['kind'],
                 'before_hex': s['before_hex'], 'after_hex': s['after_hex']}
                for s in q['sites']
            ],
            'login_block': {'entry_offset': q['login_block_entry'],
                            'new_qih_offset': q['login_block_offset']},
            'menu_path_offset': q['menu_path_offset'],
        },
        {
            'id': 'P2',
            'class': 'jiz',
            'method': '<init>',
            'purpose': 'remove the deliberate Unsafe.putAddress(0,0) JVM-crash anti-tamper',
            'sites': [
                {'code_offset': s['offset'], 'before_hex': s['before_hex'],
                 'after_hex': s['after_hex'], 'note': 'pop2; pop2; pop'}
                for s in j['sites']
            ],
        },
        {
            'id': 'P3',
            'class': 'q08',
            'method': 'drawScreen(IIF)V',
            'purpose': 'null-guard the unauthenticated welcome-text session lookup '
                       '(zwr.ooi().qr2().getUserName()); zwr.tgs is null until login',
            'constant_pool': 'appended CONSTANT_Utf8 + CONSTANT_String (empty); '
                             'no existing pool index is renumbered',
            'sites': [
                {'code_offset': off, 'before_hex': before.hex(' '),
                 'after_hex': 'ldc_w <empty String> + nop x6'}
                for (_m, _d, _c, off, before) in triples
            ],
        },
    ],
    'verification': {
        'reachability': 'login block unreachable; every menu-path hop reachable; '
                        'roots = method entry + all exception handler PCs',
        'jvm_bytecode_verification': 'all patched classes link successfully; '
                                     'a deliberately corrupted patch is rejected with VerifyError',
        'dynamic_control': 'original build throws inside qih.<init> (login screen reached)',
        'dynamic_patched': 'patched build never resolves/instantiates qih (menu path reached)',
    },
}

with io.open(os.path.join(OUT, 'patch_report.json'), 'w', encoding='utf-8') as fh:
    fh.write(json.dumps(rep, indent=2, ensure_ascii=False) + '\n')

print('patch_report.json written:', len(rep['patches']), 'patches')
for p in rep['patches']:
    print('  %s %-6s %-18s %d site(s)' % (p['id'], p['class'], p['method'], len(p['sites'])))
