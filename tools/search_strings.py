#!/usr/bin/env python3
"""Search the decrypted ZKM string table for security-relevant indicators."""
import collections
import io
import re
import sys

path = sys.argv[1]
rows = []
with io.open(path, encoding='utf-8') as fh:
    for ln in fh:
        p = ln.rstrip('\n').split('\t')
        if len(p) >= 5:
            rows.append((p[0], p[1], p[3], p[4]))

print('decrypted string rows:', len(rows))
by_class = collections.Counter(r[0] for r in rows)
print('classes represented  :', len(by_class))

GROUPS = [
    ('URL / host',        r'https?://|://|\bwww\.|\.com|\.net\b|\.cn\b|\.ru\b|\.org\b|\.io\b|localhost|127\.0\.0\.1|:\d{2,5}/'),
    ('HTTP verbs/API',    r'\b(GET|POST|PUT|DELETE)\b|/api/|api\.|Authorization|Bearer|Content-Type|User-Agent|application/json|x-www-form'),
    ('auth tokens',       r'(?i)\b(auth|token|session|access_?token|refresh|jwt|bearer|oauth|credential)\b'),
    ('HWID / machine',    r'(?i)\b(hwid|hardware|machine|device|serial|uuid|fingerprint|mac|volume|disk|smbios|wmic|processor)\b'),
    ('license / account', r'(?i)\b(licen[cs]e|serial|activation|expire|expiry|subscri|premium|account|password|passwd|username|register|verif)\b'),
    ('errors / dialogs',  r'(?i)\b(error|fail|invalid|denied|banned|kick|expired|unauthor|forbidden|success|welcome)\b'),
    ('crypto',            r'(?i)\b(AES|DES|RSA|MD5|SHA-?1|SHA-?256|HMAC|Base64|encrypt|decrypt|salt|IV)\b'),
    ('chinese text',      r'[\u4e00-\u9fff]'),
    ('soter / netease',   r'(?i)soter|netease|网易|MLv5|yggdrasil|mc\.163|16163'),
    ('files / registry',  r'(?i)\.(dll|exe|jar|txt|json|dat|cfg|ini|log)\b|HKEY|Software\\\\|AppData|%s|%appdata%'),
    ('java/runtime',      r'(?i)os\.name|java\.version|user\.home|sun\.|getProperty|System\.getenv'),
    ('class/service refs', r'(?i)flux|irc|cheat|module|command|bypass|anticheat|ncp'),
]

for title, pat in GROUPS:
    rx = re.compile(pat)
    hits = [r for r in rows if rx.search(r[3])]
    uniq = sorted(set(h[3] for h in hits))
    print('\n=== %-18s %5d rows / %4d distinct literals' % (title, len(hits), len(uniq)))
    for u in uniq[:48]:
        owners = sorted(set(h[0] for h in hits if h[3] == u))[:3]
        print('    %-88s @ %s' % (repr(u)[:88], owners))
