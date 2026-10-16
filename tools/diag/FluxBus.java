/**
 * Helper that lets a module register or unregister every sub-object it owns.
 *
 * ar7 holds its sub-objects (the KillAura engine xbs is one: it extends j1s, not
 * ar7) in the private list ar7._w6, filled by ar7.jpe(j1s).  But ar7.ron() and
 * ar7.ne2() only ever touch themselves:
 *
 *     public void ron() { if (vlm == 1) mtl.__x(this);  ... }
 *     public void ne2() { if (vlm == 1) mtl.mn9(this); ... }
 *
 * so a sub-object is never registered - the native layer used to do it - and,
 * once registered by other means, it is never removed either.  That is why
 * disabling KillAura left the aura attacking.
 *
 * Passing one of these two singletons to java.util.List.forEach iterates the list
 * entirely inside the JDK, so the patched method needs no loop, no branch and no
 * new stack map frame:
 *
 *     this._w6.forEach(FluxBus.REG);     // ron()
 *     this._w6.forEach(FluxBus.UNREG);   // ne2()
 *
 * mtl is reached reflectively, so this class needs no compile-time knowledge of
 * the obfuscated client and can be built with a bare javac.  No inner classes:
 * shipping only the outer class would break its static initialiser.
 */
public final class FluxBus implements java.util.function.Consumer {

    public static final FluxBus REG = new FluxBus(true);
    public static final FluxBus UNREG = new FluxBus(false);

    private final boolean reg;
    private static java.lang.reflect.Method add;
    private static java.lang.reflect.Method remove;

    private FluxBus(boolean registering) {
        this.reg = registering;
    }

    /**
     * Register or unregister one module according to its own enabled flag.
     *
     * Module toggling and the config loader reach ar7 through several different
     * setters, and each one used to be patched to call ron() unconditionally, so
     * switching a module OFF still registered it and KillAura kept attacking.
     * Routing every setter through this method makes ron() run only while the
     * module is on and ne2() run when it goes off - and ne2() is what also
     * unregisters the sub-objects held in ar7._w6.
     */
    private static Object lastWorld;

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
        pollModes();
    }

    private static int ticks;
    private static final java.util.Map modeCache = new java.util.HashMap();

    /**
     * Notice a Mode dropdown change and re-dispatch that module.
     *
     * ar7.asw(boolean) picks the engine by comparing each sub-object's name with
     * the current mode, and asw only runs from ron()/ne2().  Storing a new
     * dropdown value therefore did nothing until the module was toggled off and on:
     * KillAura kept running the Switch engine after the dropdown said Single.
     *
     * c_3.n1j(String) cannot be extended - its trailing return is a branch target,
     * so appending there would land a jump inside the injected code.  Polling the
     * value from the tick hook that is already installed avoids touching it at all.
     * Called about once a second, over 98 modules, so the reflective cost is nil.
     */
    private static void pollModes() {
        ticks++;
        if (ticks % 20 != 0) {
            return;
        }
        try {
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
                java.lang.reflect.Field fi = findField(mod.getClass(), "isg");
                if (fi == null) {
                    continue;
                }
                Object isg = fi.get(mod);
                if (isg == null) {
                    continue;
                }
                java.lang.reflect.Method d7c = isg.getClass().getMethod("d7c");
                Object now = d7c.invoke(isg);
                String val = String.valueOf(now);
                Object prev = modeCache.get(mod);
                if (prev == null) {
                    modeCache.put(mod, val);
                    continue;
                }
                if (!prev.equals(val)) {
                    modeCache.put(mod, val);
                    sync(mod);
                }
            }
        } catch (Throwable t) {
            // bookkeeping only; never disturb the client
        }
    }

    private static java.lang.reflect.Field findFieldStatic(Class<?> c, String name) {
        return findField(c, name);
    }

    /**
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
            }
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

    public void accept(Object o) {
        if (o == null) {
            return;
        }
        try {
            java.lang.reflect.Method m = reg ? add() : remove();
            if (m != null) {
                m.invoke(null, o);
            }
        } catch (Throwable t) {
            // never let bookkeeping break the client
        }
    }

    private static synchronized java.lang.reflect.Method add() {
        if (add == null) {
            add = lookup("__x");
        }
        return add;
    }

    private static synchronized java.lang.reflect.Method remove() {
        if (remove == null) {
            remove = lookup("mn9");
        }
        return remove;
    }

    private static java.lang.reflect.Method lookup(String name) {
        try {
            java.lang.reflect.Method m =
                Class.forName("mtl").getDeclaredMethod(name, Object.class);
            m.setAccessible(true);
            return m;
        } catch (Throwable t) {
            return null;
        }
    }
}
