/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _f3$c3d
extends Enum {
    public static final _f3$c3d g3j;
    public static final _f3$c3d bum;
    public static final _f3$c3d j2j;
    public static final _f3$c3d qut;
    public static final _f3$c3d bir;
    public static final _f3$c3d o4g;
    public static final _f3$c3d sfv;
    private static final Map leq;
    private final int q9c;
    private final String htg;
    private static final _f3$c3d[] vla;

    public static _f3$c3d[] values() {
        return (_f3$c3d[])vla.clone();
    }

    public static _f3$c3d valueOf(String string) {
        return Enum.valueOf(_f3$c3d.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private _f3$c3d() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.q9c = var3_1;
        this.htg = var4_2;
    }

    public int ydn() {
        return this.q9c;
    }

    public String eob() {
        return this.htg;
    }

    public static _f3$c3d ja1(int n) {
        _f3$c3d _f3$c3d;
        block2: {
            _f3$c3d _f3$c3d2;
            block3: {
                int n2 = t9d.b();
                _f3$c3d2 = (_f3$c3d)((Object)leq.get(n));
                try {
                    _f3$c3d = _f3$c3d2;
                    if (n2 == 0) break block2;
                    if (_f3$c3d != null) break block3;
                }
                catch (oov oov2) {
                    throw _f3$c3d.a(oov2);
                }
                _f3$c3d = g3j;
                break block2;
            }
            _f3$c3d = _f3$c3d2;
        }
        return _f3$c3d;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                var10 = c.a(-4647706949656548284L, 5121045512156551206L, MethodHandles.lookup().lookupClass()).a(197910225920246L) ^ 78134112042316L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var10 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var10 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new String[14];
                var6_4 = 0;
                var5_5 = "\"\u008e:\u00b9\u0093)%P\u009f\u00c8A\u00cd\u000b\u00dd\u00a2\u00a8\u00a3L\u00cf\u0097\u0081\u0095\u001c\u00f9\u0010\"\u008e:\u00b9\u0093)%P\u008e\u00c7J\u00b4\u009e#\u00dee\u0010J\u008c\u0081\u00f0\u00e7\u00c0\u00b3\u00ea\u00ee\u0085F\u00cf\u00ecfL\u00fc\b9\u0082\u00d6\u00e7\u0080\u007f\u0015i\u0010\u00ac\u00c5\rA\u0015s0W+\u00dbV~,4\u007f\u00bd\b\u00955\" \u00acD\u00ca]\u0010\"\u008e:\u00b9\u0093)%P\u00f9\u00cb/\u00c8^\bb\u00af\u0010\"\u008e:\u00b9\u0093)%P*\u0081\u0088\u008cG\u00a9\u00dfl\b\u000eZ\u0098\u00d6?\u00d0\u001d\u00e1\u0010\"\u008e:\u00b9\u0093)%PuY\u00ac\u0001U\u00b1\u00c6!\b\u00fd\u00bc\u00cbKJ\u00e4\u00e2\u00e7\u0018\"\u008e:\u00b9\u0093)%P\u00f0q\u001d\u00a0\u00d3\u0014/LqN%C\u00c4\u008br\u00be";
                var7_6 = "\"\u008e:\u00b9\u0093)%P\u009f\u00c8A\u00cd\u000b\u00dd\u00a2\u00a8\u00a3L\u00cf\u0097\u0081\u0095\u001c\u00f9\u0010\"\u008e:\u00b9\u0093)%P\u008e\u00c7J\u00b4\u009e#\u00dee\u0010J\u008c\u0081\u00f0\u00e7\u00c0\u00b3\u00ea\u00ee\u0085F\u00cf\u00ecfL\u00fc\b9\u0082\u00d6\u00e7\u0080\u007f\u0015i\u0010\u00ac\u00c5\rA\u0015s0W+\u00dbV~,4\u007f\u00bd\b\u00955\" \u00acD\u00ca]\u0010\"\u008e:\u00b9\u0093)%P\u00f9\u00cb/\u00c8^\bb\u00af\u0010\"\u008e:\u00b9\u0093)%P*\u0081\u0088\u008cG\u00a9\u00dfl\b\u000eZ\u0098\u00d6?\u00d0\u001d\u00e1\u0010\"\u008e:\u00b9\u0093)%PuY\u00ac\u0001U\u00b1\u00c6!\b\u00fd\u00bc\u00cbKJ\u00e4\u00e2\u00e7\u0018\"\u008e:\u00b9\u0093)%P\u00f0q\u001d\u00a0\u00d3\u0014/LqN%C\u00c4\u008br\u00be".length();
                var4_7 = 24;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block12;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = _f3$c3d.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\"\u008e:\u00b9\u0093)%P;@\u009d`\u009a\u0098\u008c\u0095\b\u000f\u00bf\u00c2\u00e3\u00a8\u00b9e.";
                    var7_6 = "\"\u008e:\u00b9\u0093)%P;@\u009d`\u009a\u0098\u008c\u0095\b\u000f\u00bf\u00c2\u00e3\u00a8\u00b9e.".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block12;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = _f3$c3d.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block13;
                    break;
                }
            }
            var9_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        var0_10 = var8_3;
        _f3$c3d.g3j = new _f3$c3d(var0_10[4], 0, 0, var0_10[0]);
        _f3$c3d.bum = new _f3$c3d(var0_10[13], 1, 1, var0_10[1]);
        _f3$c3d.j2j = new _f3$c3d(var0_10[3], 2, 2, var0_10[7]);
        _f3$c3d.qut = new _f3$c3d(var0_10[10], 3, 3, var0_10[6]);
        _f3$c3d.bir = new _f3$c3d(var0_10[5], 4, 4, var0_10[9]);
        _f3$c3d.o4g = new _f3$c3d(var0_10[8], 5, 5, var0_10[12]);
        _f3$c3d.sfv = new _f3$c3d(var0_10[2], 6, 6, var0_10[11]);
        _f3$c3d.vla = new _f3$c3d[]{_f3$c3d.g3j, _f3$c3d.bum, _f3$c3d.j2j, _f3$c3d.qut, _f3$c3d.bir, _f3$c3d.o4g, _f3$c3d.sfv};
        _f3$c3d.leq = Maps.newHashMap();
        for (_f3$c3d var15_14 : _f3$c3d.values()) {
            _f3$c3d.leq.put(var15_14.ydn(), var15_14);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }
}

