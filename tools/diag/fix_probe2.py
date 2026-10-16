import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

a = '                    Object mi = fieldAny(w, "tss");'
b = '                    Object mi = call(w, "tss");'
if a not in s:
    raise SystemExit('tss anchor not found')
s = s.replace(a, b)

c = '                    Object inst = fieldAny(w, "_5a");'
d = '                    Object inst = call(w, "_5a");'
if c not in s:
    raise SystemExit('_5a anchor not found')
s = s.replace(c, d)

io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxDiag.java: tss/_5a now read through their accessor methods')
