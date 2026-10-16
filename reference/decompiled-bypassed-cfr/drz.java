/*
 * Decompiled with CFR 0.152.
 */
public class drz {
    public static final String h2z;
    public static final String bkr;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var6 = new String[2];
            var4_1 = 0;
            var3_2 = ":q@mf$\u0001#|D2\u000b:q@mg/\u0001#|D2";
            var5_3 = ":q@mf$\u0001#|D2\u000b:q@mg/\u0001#|D2".length();
            var2_4 = 11;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var6[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var7_6 = 0;
            v4 = 14;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var7_6;
                while (true) {
                    switch (var7_6 % 7) {
                        case 0: {
                            v11 = 66;
                            break;
                        }
                        case 1: {
                            v11 = 22;
                            break;
                        }
                        case 2: {
                            v11 = 47;
                            break;
                        }
                        case 3: {
                            v11 = 78;
                            break;
                        }
                        case 4: {
                            v11 = 12;
                            break;
                        }
                        case 5: {
                            v11 = 79;
                            break;
                        }
                        default: {
                            v11 = 108;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var7_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var7_6);
            ** while (true)
        }
        var0_7 = var6;
        drz.bkr = var0_7[1];
        drz.h2z = var0_7[0];
    }
}

