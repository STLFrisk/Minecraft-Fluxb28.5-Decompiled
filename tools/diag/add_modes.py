import io
import sys

p = sys.argv[1]
s = io.open(p, encoding='utf-8').read()

anchor = '''    private static void loop() {'''
add = '''    private static boolean modesApplied;

    /**
     * Apply the Mode dropdown values straight from the config file.
     *
     * The evidence that the loader skips them: the file says
     * `s#KillAura:Mode:Switch` while the live object reports
     * `fyk.isg = c_3[Mode]=Single`.  Priority happens to agree, which is exactly
     * what a dropdown left at its default would look like.
     *
     * ar7.asw(boolean) is the whole mode mechanism:
     *
     *     for (j1s sub : this._w6)
     *         if (sub.zkf().equalsIgnoreCase(this.isg.d7c())) sub.qza();
     *
     * so writing c_3.n1j(value) and then re-running the enable path is enough to
     * switch engines - j1s.qza()/d2z() are the only native parts.
     */
    private static void applyModesOnce() {
        if (modesApplied) {
            return;
        }
        StringBuilder log = new StringBuilder();
        try {
            java.io.File f = new java.io.File("flux/prs-hypixel_best_config.txt");
            if (!f.exists()) {
                f = new java.io.File("prs-hypixel_best_config.txt");
            }
            if (!f.exists()) {
                return;
            }
            java.io.BufferedReader r = new java.io.BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(f), "UTF-8"));
            java.util.List lines = new java.util.ArrayList();
            String line;
            while ((line = r.readLine()) != null) {
                lines.add(line);
            }
            r.close();
            Object zwr = staticObj(Class.forName("zwr"), "qkk");
            Object kgt = call(zwr, "zj2");
            Object mods = call(kgt, "wau");
            if (!(mods instanceof java.util.List)) {
                return;
            }
            java.util.List list = (java.util.List) mods;
            for (int i = 0; i < list.size(); i++) {
                Object mod = list.get(i);
                if (mod == null) {
                    continue;
                }
                Object name = fieldAny(mod, "rb6");
                Object isg = fieldAny(mod, "isg");
                if (name == null || isg == null) {
                    continue;
                }
                String prefix = "s#" + name + ":Mode:";
                for (int k = 0; k < lines.size(); k++) {
                    String l = (String) lines.get(k);
                    if (!l.startsWith(prefix)) {
                        continue;
                    }
                    String want = l.substring(prefix.length());
                    Object have = call(isg, "d7c");
                    log.append("* mode ").append(name).append(": ")
                       .append(have).append(" -> ").append(want).append('\\n');
                    if (!want.equals(String.valueOf(have))) {
                        java.lang.reflect.Method set =
                            isg.getClass().getDeclaredMethod("n1j", String.class);
                        set.setAccessible(true);
                        set.invoke(isg, want);
                        // re-run the enable path so asw() picks the matching engine
                        Object szk = call(zwr, "up0");
                        if (szk != null) {
                            java.lang.reflect.Method k4 =
                                szk.getClass().getDeclaredMethod("_k4");
                            k4.setAccessible(true);
                            k4.invoke(szk);
                        }
                    }
                }
            }
            modesApplied = true;
        } catch (Throwable t) {
            log.append("* applyModes failed: ").append(t).append('\\n');
        }
        write(log.toString());
    }

    private static void loop() {'''

if anchor not in s:
    raise SystemExit('loop anchor not found')
s = s.replace(anchor, add, 1)

anchor2 = '''                dump(sb);
                ensureConfigLoaded();'''
new2 = '''                applyModesOnce();
                dump(sb);
                ensureConfigLoaded();'''
if anchor2 not in s:
    raise SystemExit('dump anchor not found')
s = s.replace(anchor2, new2, 1)

io.open(p, 'w', encoding='utf-8').write(s)
print('  FluxDiag.java: added applyModesOnce()')
