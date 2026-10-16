import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

old = '''    private static String name(Object o) {
        return o == null ? "null" : o.getClass().getName();
    }'''
new = '''    private static String name(Object o) {
        if (o == null) {
            return "null";
        }
        if (o instanceof Class) {
            return ((Class<?>) o).getName();
        }
        return o.getClass().getName();
    }'''
assert old in s, 'name() anchor not found'
s = s.replace(old, new)

old2 = '            Object key = call(mod, "x_i");'
new2 = ('            Object key = call(mod, "x_i");\n'
        '            Object keyField = fieldAny(mod, "pl_");')
assert old2 in s, 'x_i anchor not found'
s = s.replace(old2, new2)

old3 = '              .append("  key=").append(key)'
new3 = ('              .append("  key=").append(key)\n'
        '              .append("  pl_=").append(keyField)')
assert old3 in s, 'key anchor not found'
s = s.replace(old3, new3)

io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxDiag.java updated: event class names + pl_ field')
