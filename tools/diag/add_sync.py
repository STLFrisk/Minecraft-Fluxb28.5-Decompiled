import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

anchor = '''    public void accept(Object o) {'''
add = '''    /**
     * Register or unregister one module according to its own enabled flag.
     *
     * Module toggling and the config loader reach ar7 through several different
     * setters, and each one used to be patched to call ron() unconditionally, so
     * switching a module OFF still registered it and KillAura kept attacking.
     * Routing every setter through this method makes ron() run only while the
     * module is on and ne2() run when it goes off - and ne2() is what also
     * unregisters the sub-objects held in ar7._w6.
     */
    public static void sync(Object module) {
        if (module == null) {
            return;
        }
        try {
            java.lang.reflect.Field f = findField(module.getClass(), "iio");
            if (f == null) {
                return;
            }
            boolean on = f.getBoolean(module);
            java.lang.reflect.Method m = on ? add() : remove();
            if (m == null) {
                return;
            }
            java.lang.reflect.Method target = Class.forName("ar7")
                .getDeclaredMethod(on ? "ron" : "ne2");
            target.setAccessible(true);
            target.invoke(module);
        } catch (Throwable t) {
            // never let bookkeeping break the client
        }
    }

    private static java.lang.reflect.Field findField(Class<?> c, String name) {
        for (Class<?> k = c; k != null; k = k.getSuperclass()) {
            try {
                java.lang.reflect.Field f = k.getDeclaredField(name);
                f.setAccessible(true);
                return f;
            } catch (Throwable t) {
                // keep walking up
            }
        }
        return null;
    }

    public void accept(Object o) {'''

if anchor not in s:
    raise SystemExit('anchor not found')
s = s.replace(anchor, add, 1)
io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxBus.java: added sync(Object)')
