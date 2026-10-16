import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

old = '''            boolean on = f.getBoolean(module);
            java.lang.reflect.Method m = on ? add() : remove();
            if (m == null) {
                return;
            }
            java.lang.reflect.Method target = Class.forName("ar7")
                .getDeclaredMethod(on ? "ron" : "ne2");
            target.setAccessible(true);
            target.invoke(module);'''

new = '''            boolean on = f.getBoolean(module);

            // Always clear first, then re-enable.
            //
            // ar7.asw(boolean) is asymmetric: switching off calls j1s.d2z(false) on
            // every sub-object, but switching on only calls j1s.qza() on the one
            // sub-object whose name matches the current mode.  It never disables the
            // others, so a mode change left the previously selected engine running
            // and the new one merely started alongside it - which is why picking
            // Single, or any other Fly mode, looked like it did nothing at all.
            //
            // ne2() then ron() is exactly the sequence a manual off/on toggle
            // produces, and that was the only thing that ever applied a mode change.
            java.lang.reflect.Method off = Class.forName("ar7").getDeclaredMethod("ne2");
            off.setAccessible(true);
            off.invoke(module);

            if (on) {
                java.lang.reflect.Method onM = Class.forName("ar7").getDeclaredMethod("ron");
                onM.setAccessible(true);
                onM.invoke(module);
            }'''

if old not in s:
    raise SystemExit('sync body anchor not found')
s = s.replace(old, new, 1)
io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxBus.sync: now always ne2() then ron() - old engine is disabled first')
