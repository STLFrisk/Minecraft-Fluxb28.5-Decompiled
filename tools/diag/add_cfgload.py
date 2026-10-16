import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

anchor = '''    private static void loop() {
        for (int i = 0; i < ROUNDS; i++) {'''
new = '''    private static Object lastWorld;

    /**
     * Apply the saved config as soon as a world exists.
     *
     * szk is the lazy singleton behind zwr.up0(), and szk.<init> is what runs the
     * loader (a2k for the keybinds, then _k4 for the settings).  The first caller
     * of zwr.up0() is ar7.tp_, i.e. the first module toggle - so on a fresh launch
     * every cn7 setting is still at its default until the player toggles something.
     * That is why KillAura ignored Mob on the very first run and only honoured it
     * after a toggle.
     *
     * _k4() deliberately no-ops while c05.vz1().tij is null, and szk is a singleton
     * that will not retry, so the load has to be re-issued once the world appears.
     */
    private static void ensureConfigLoaded() {
        try {
            Class<?> zwr = Class.forName("zwr");
            Object c05 = Class.forName("c05");
            java.lang.reflect.Method vz1 = c05.getDeclaredMethod("vz1");
            vz1.setAccessible(true);
            Object mc = vz1.invoke(null);
            Object tij = fieldAny(mc, "tij");
            if (tij == null) {
                lastWorld = null;
                return;
            }
            if (tij == lastWorld) {
                return;
            }
            lastWorld = tij;
            Object szk = call(staticObj(zwr, "qkk"), "up0");
            if (szk == null) {
                return;
            }
            for (int pass = 0; pass < 2; pass++) {
                String name = pass == 0 ? "a2k" : "_k4";
                java.lang.reflect.Method m = szk.getClass().getDeclaredMethod(name);
                m.setAccessible(true);
                m.invoke(szk);
            }
            write("* config re-applied for a new world: a2k() then _k4()\\n");
        } catch (Throwable t) {
            try {
                write("* config re-apply failed: " + t + "\\n");
            } catch (Throwable ignored) {
                // nothing else to do
            }
        }
    }

    private static void loop() {
        for (int i = 0; i < ROUNDS; i++) {'''

if anchor not in s:
    raise SystemExit('loop anchor not found')
s = s.replace(anchor, new, 1)

anchor2 = '''            try {
                dump(sb);
            } catch (Throwable t) {'''
new2 = '''            try {
                dump(sb);
                ensureConfigLoaded();
            } catch (Throwable t) {'''
if anchor2 not in s:
    raise SystemExit('dump anchor not found')
s = s.replace(anchor2, new2, 1)

io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxDiag.java: added ensureConfigLoaded()')
