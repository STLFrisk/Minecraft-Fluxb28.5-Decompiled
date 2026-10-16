import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

anchor = '''    public static void sync(Object module) {'''
add = '''    private static Object lastWorld;

    /**
     * Re-apply the saved config once per world.
     *
     * szk is a lazy singleton and _k4() opens with
     *
     *     if (c05.vz1().tij == null) return;
     *
     * so if szk happens to be created before a world exists, the config is never
     * applied - and because the singleton is never recreated, it never retries.
     * The visible symptom is that settings land or do not land depending on
     * timing: Mode read Switch on one launch and Single on the next, with the same
     * config file.
     *
     * Called from the per-tick client hook, this re-issues the load as soon as a
     * world object appears, and again for every new world.
     */
    public static void ensureConfig() {
        try {
            Class<?> c05 = Class.forName("c05");
            java.lang.reflect.Method vz1 = c05.getDeclaredMethod("vz1");
            vz1.setAccessible(true);
            Object mc = vz1.invoke(null);
            if (mc == null) {
                return;
            }
            java.lang.reflect.Field tf = findField(mc.getClass(), "tij");
            if (tf == null) {
                return;
            }
            Object tij = tf.get(mc);
            if (tij == null) {
                lastWorld = null;
                return;
            }
            if (tij == lastWorld) {
                return;
            }
            lastWorld = tij;

            Class<?> zwr = Class.forName("zwr");
            java.lang.reflect.Field qkk = findFieldStatic(zwr, "qkk");
            if (qkk == null) {
                return;
            }
            Object z = qkk.get(null);
            if (z == null) {
                return;
            }
            // force the module registry first: kgt.<init> touches every module's
            // static field, which is what makes all their settings exist before the
            // loader tries to match config lines against them by name
            java.lang.reflect.Method zj2 = zwr.getDeclaredMethod("zj2");
            zj2.setAccessible(true);
            zj2.invoke(z);

            java.lang.reflect.Method up0 = zwr.getDeclaredMethod("up0");
            up0.setAccessible(true);
            Object szk = up0.invoke(z);
            if (szk == null) {
                return;
            }
            String[] order = { "a2k", "_k4" };
            for (int i = 0; i < order.length; i++) {
                java.lang.reflect.Method m = szk.getClass().getDeclaredMethod(order[i]);
                m.setAccessible(true);
                m.invoke(szk);
            }
        } catch (Throwable t) {
            // bookkeeping only; never disturb the client
        }
    }

    private static java.lang.reflect.Field findFieldStatic(Class<?> c, String name) {
        return findField(c, name);
    }

    public static void sync(Object module) {'''

if anchor not in s:
    raise SystemExit('sync anchor not found')
s = s.replace(anchor, add, 1)
io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxBus.java: added ensureConfig()')
