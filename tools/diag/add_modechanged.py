import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

anchor = '''    public static void sync(Object module) {'''
add = '''    /**
     * Re-dispatch a module after its Mode dropdown changed.
     *
     * The whole Switch/Single mechanism is ar7.asw(boolean), and asw only runs
     * from ron()/ne2() - that is, when the module is switched on or off:
     *
     *     if (tb8(this.isg.d7c()))
     *         for (j1s sub : this._w6)
     *             if (sub.zkf().equalsIgnoreCase(this.isg.d7c())) sub.qza();
     *
     * So picking a different entry in the dropdown stored the new value but left
     * the previously chosen engine running - KillAura stayed on Switch after the
     * dropdown said Single.
     *
     * c_3.n1j(String) is the setter that validates and stores the value, and dzm
     * (its base) carries the owning module name in rn2, so the setter can hand the
     * module straight back to sync() and the engines switch immediately.
     */
    public static void modeChanged(Object setting) {
        if (setting == null) {
            return;
        }
        try {
            Object moduleName = findField(setting.getClass(), "rn2") != null
                ? findField(setting.getClass(), "rn2").get(setting) : null;
            if (!(moduleName instanceof String)) {
                return;
            }
            Class<?> zwr = Class.forName("zwr");
            java.lang.reflect.Field qkk = findField(zwr, "qkk");
            Object z = qkk == null ? null : qkk.get(null);
            if (z == null) {
                return;
            }
            java.lang.reflect.Method zj2 = zwr.getDeclaredMethod("zj2");
            zj2.setAccessible(true);
            Object kgt = zj2.invoke(z);
            java.lang.reflect.Method wau = kgt.getClass().getDeclaredMethod("wau");
            wau.setAccessible(true);
            Object mods = wau.invoke(kgt);
            if (!(mods instanceof java.util.List)) {
                return;
            }
            java.util.List list = (java.util.List) mods;
            for (int i = 0; i < list.size(); i++) {
                Object mod = list.get(i);
                if (mod == null) {
                    continue;
                }
                java.lang.reflect.Field rb6 = findField(mod.getClass(), "rb6");
                if (rb6 == null) {
                    continue;
                }
                if (moduleName.equals(rb6.get(mod))) {
                    sync(mod);
                    return;
                }
            }
        } catch (Throwable t) {
            // bookkeeping only; never disturb the client
        }
    }

    public static void sync(Object module) {'''

if anchor not in s:
    raise SystemExit('sync anchor not found')
s = s.replace(anchor, add, 1)
io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxBus.java: added modeChanged(Object)')
