/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cmk
extends zg9 {
    private static final /* synthetic */ gdz l5k;
    private final /* synthetic */ jnq luq;
    private /* synthetic */ rsi ve8;

    public cmk(jnq jnq2, rsi rsi2) {
        super(new gem(jnq2, rsi2));
        this.luq = jnq2;
        this.ve8 = rsi2;
    }

    @Override
    public void qw3(int n, int n2) {
        String string = this.ve8.xyw().rnh();
        this.fex.eh6(string, this.poy / 2 - this.fex.ezt(string) / 2, 6.0f, 0x404040);
        this.fex.eh6(this.luq.xyw().rnh(), 8.0f, this.g6l - 96 + 2, 0x404040);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cft(float var1_1, int var2_2, int var3_3) {
        block23: {
            block26: {
                block24: {
                    block25: {
                        block22: {
                            hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                            this.f41.l22().anl(cmk.l5k);
                            v0 = t9d.c();
                            var5_4 = (this.dt7 - this.poy) / 2;
                            var6_5 = (this.o1e - this.g6l) / 2;
                            this.mt4(var5_4, var6_5, 0, 0, this.poy, this.g6l);
                            var7_6 = this.ve8.czu(0);
                            var4_7 = v0;
                            try {
                                try {
                                    v1 = var7_6;
                                    if (var4_7 != 0) break block22;
                                    if (v1 <= 0) break block23;
                                }
                                catch (oov v2) {
                                    throw cmk.a(v2);
                                }
                                v1 = (int)(28.0f * (1.0f - (float)var7_6 / 400.0f));
                            }
                            catch (oov v3) {
                                throw cmk.a(v3);
                            }
                        }
                        var8_8 = v1;
                        try {
                            try {
                                v4 = var8_8;
                                if (var4_7 != 0) break block24;
                                if (v4 <= 0) break block25;
                            }
                            catch (oov v5) {
                                throw cmk.a(v5);
                            }
                            this.mt4(var5_4 + 97, var6_5 + 16, 176, 0, 9, var8_8);
                        }
                        catch (oov v6) {
                            throw cmk.a(v6);
                        }
                    }
                    v4 = var7_6 / 2 % 7;
                }
                var9_9 = v4;
                try {
                    v7 = var9_9;
                    if (var4_7 != 0) break block26;
                }
                catch (oov v8) {
                    throw cmk.a(v8);
                }
                {
                    ** switch (v7)
                }
lbl-1000:
                // 1 sources

                {
                    case 0: {
                        var8_8 = 29;
                        if (var4_7 == 0) break;
                    }
lbl49:
                    // 2 sources

                    case 1: {
                        var8_8 = 24;
                        if (var4_7 == 0) break;
                    }
lbl52:
                    // 2 sources

                    case 2: {
                        var8_8 = 20;
                        if (var4_7 == 0) break;
                    }
lbl55:
                    // 2 sources

                    case 3: {
                        var8_8 = 16;
                        if (var4_7 == 0) break;
                    }
lbl58:
                    // 2 sources

                    case 4: {
                        var8_8 = 11;
                        if (var4_7 == 0) break;
                    }
lbl61:
                    // 2 sources

                    case 5: {
                        var8_8 = 6;
                        if (var4_7 == 0) break;
                    }
lbl64:
                    // 2 sources

                    case 6: {
                        var8_8 = 0;
                    }
                }
lbl66:
                // 8 sources

                v7 = var8_8;
            }
            try {
                if (v7 > 0) {
                    this.mt4(var5_4 + 65, var6_5 + 14 + 29 - var8_8, 185, 29 - var8_8, 12, var8_8);
                }
            }
            catch (oov v9) {
                throw cmk.a(v9);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-337666981955413073L, -2063276991567822590L, MethodHandles.lookup().lookupClass()).a(101874691886285L) ^ 0x3DAE2FD65A06L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0085/\u0004\u00b7,\u00f7\u00fb0\u00f4\u00cd\u0017\u0093\u00d45?\u00cf=\u00fd(\u0087T3pb\u00f7-T\u00e3\u009b\u00bfx\u00e0\u00ebC\u000eq\u008d\u00c7\u0080\u00c5\u0005\u00ac\u008f\u0094\u008ad\u00a9P".getBytes("ISO-8859-1"));
                String string = cmk.d(byArray3).intern();
                l5k = new gdz(string);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String d(byte[] byArray) {
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

