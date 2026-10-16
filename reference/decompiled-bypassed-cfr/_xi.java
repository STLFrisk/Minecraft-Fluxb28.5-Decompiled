/*
 * Decompiled with CFR 0.152.
 */
public class _xi {
    public static final char[] wu_ = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean _m2(char c2) {
        int n;
        int n2;
        block11: {
            int n3;
            block10: {
                n3 = t9d.c();
                try {
                    try {
                        n2 = c2;
                        n = 167;
                        if (n3 != 0) break block10;
                        if (n2 == n) return 0 != 0;
                    }
                    catch (oov oov2) {
                        throw _xi.a(oov2);
                    }
                    n2 = c2;
                    n = 32;
                }
                catch (oov oov3) {
                    throw _xi.a(oov3);
                }
            }
            try {
                try {
                    try {
                        if (n3 != 0) break block11;
                        if (n2 < n) return 0 != 0;
                    }
                    catch (oov oov4) {
                        throw _xi.a(oov4);
                    }
                    n2 = c2;
                    if (n3 != 0) return n2 != 0;
                }
                catch (oov oov5) {
                    throw _xi.a(oov5);
                }
                n = 127;
            }
            catch (oov oov6) {
                throw _xi.a(oov6);
            }
        }
        if (n2 == n) return 0 != 0;
        return 1 != 0;
    }

    public static String _dn(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string.toCharArray();
        int n = cArray.length;
        int n2 = 0;
        int n3 = t9d.b();
        while (n2 < n) {
            block5: {
                block6: {
                    char c2 = cArray[n2];
                    try {
                        try {
                            if (n3 == 0) break block5;
                            if (!_xi._m2(c2)) break block6;
                        }
                        catch (oov oov2) {
                            throw _xi.a(oov2);
                        }
                        stringBuilder.append(c2);
                    }
                    catch (oov oov3) {
                        throw _xi.a(oov3);
                    }
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
        return stringBuilder.toString();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

