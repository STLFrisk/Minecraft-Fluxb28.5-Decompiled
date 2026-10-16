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

public final class blv$mau
extends Enum {
    public static final blv$mau k_k;
    public static final blv$mau lis;
    private final String bw0;
    private final String ela;
    private final int vh2;
    private final Map vtq = Maps.newHashMap();
    private static final blv$mau[] rfh;

    public static blv$mau[] values() {
        return (blv$mau[])rfh.clone();
    }

    public static blv$mau valueOf(String string) {
        return Enum.valueOf(blv$mau.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private blv$mau(int n) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.bw0 = (String)n;
        this.ela = var4_2;
        this.vh2 = var5_3;
    }

    public String zvr() {
        return this.bw0;
    }

    public String f8h() {
        return this.ela;
    }

    public int bl8() {
        return this.vh2;
    }

    public Map hup() {
        return this.vtq;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                var10 = c.a(7005551660501974651L, -7092841836734232790L, MethodHandles.lookup().lookupClass()).a(9601371204968L) ^ 62218275758767L;
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
                var8_3 = new String[6];
                var6_4 = 0;
                var5_5 = "\u00ce\u00fdh&(\u00b8o\u009c\u0010\b\u00a8\u00be4\u00a0l\u0098\u0086\u00de\u00bb\u0091\u00a0F(\u00c2b\u0010?\u00e9\u00e1\u00153\u00c2A\u00e7\u008b\u00ebuv\u00c5\u00a3C\u00a0\b K\u008aD<\u00e5\u00ad\u00dd";
                var7_6 = "\u00ce\u00fdh&(\u00b8o\u009c\u0010\b\u00a8\u00be4\u00a0l\u0098\u0086\u00de\u00bb\u0091\u00a0F(\u00c2b\u0010?\u00e9\u00e1\u00153\u00c2A\u00e7\u008b\u00ebuv\u00c5\u00a3C\u00a0\b K\u008aD<\u00e5\u00ad\u00dd".length();
                var4_7 = 8;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = blv$mau.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0087\u00d0\u00c3Bi\u00c7\u00c6\u00e9\b]\u0098HKq*B`";
                    var7_6 = "\u0087\u00d0\u00c3Bi\u00c7\u00c6\u00e9\b]\u0098HKq*B`".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = blv$mau.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
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
        blv$mau.k_k = new blv$mau(var0_10[4], 0, var0_10[0], var0_10[3], gis.fuz);
        blv$mau.lis = new blv$mau(var0_10[2], 1, var0_10[1], var0_10[5], gis.ezr);
        blv$mau.rfh = new blv$mau[]{blv$mau.k_k, blv$mau.lis};
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

