import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

# 1) extend ensureConfig to also poll the mode dropdowns on a slow cadence
old = '''            String[] order = { "a2k", "_k4" };
            for (int i = 0; i < order.length; i++) {
                java.lang.reflect.Method m = szk.getClass().getDeclaredMethod(order[i]);
                m.setAccessible(true);
                m.invoke(szk);
            }
        } catch (Throwable t) {
            // bookkeeping only; never disturb the client
        }
    }'''
new = '''            String[] order = { "a2k", "_k4" };
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
    }'''
if old not in s:
    raise SystemExit('ensureConfig anchor not found')
s = s.replace(old, new, 1)

io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxBus.java: ensureConfig now polls Mode changes via pollModes()')
