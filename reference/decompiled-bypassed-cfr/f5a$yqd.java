/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f5a$yqd {
    private final ucr phw;
    private final p9u o8y;
    private final gdz u4n;
    private final int[] pg1;
    public final f5a _be;
    private static final long a = c.a(3458943056153684817L, -7606159347806217584L, MethodHandles.lookup().lookupClass()).a(8437959129902L);
    private static final String b;

    private f5a$yqd(f5a f5a2, ucr ucr2) {
        long l = a ^ 0x2F9468C05C72L;
        this._be = f5a2;
        this.phw = ucr2;
        this.o8y = new p9u(128, 128);
        int n = t9d.b();
        this.pg1 = this.o8y.k8b();
        this.u4n = f5a.y66(f5a2).v5m(b + ucr2.tg4, this.o8y);
        for (int i = 0; i < this.pg1.length; ++i) {
            this.pg1[i] = 0;
            if (n != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void eht() {
        block10: {
            var1_1 = t9d.c();
            for (var2_2 = 0; var2_2 < 16384; ++var2_2) {
                block11: {
                    var3_3 = this.phw.quz[var2_2] & 255;
                    try {
                        try {
                            try {
                                if (var1_1 != 0) break block10;
                                if (var1_1 != 0) break block11;
                            }
                            catch (oov v0) {
                                throw f5a$yqd.a(v0);
                            }
                            if (var3_3 / 4 == 0) {
                            }
                            ** GOTO lbl24
                        }
                        catch (oov v1) {
                            throw f5a$yqd.a(v1);
                        }
                        this.pg1[var2_2] = (var2_2 + var2_2 / 128 & 1) * 8 + 16 << 24;
                    }
                    catch (oov v2) {
                        throw f5a$yqd.a(v2);
                    }
                }
                try {
                    if (var1_1 == 0) continue;
lbl24:
                    // 2 sources

                    this.pg1[var2_2] = _mi.ijo[var3_3 / 4].ghu(var3_3 & 3);
                    continue;
                }
                catch (oov v3) {
                    throw f5a$yqd.a(v3);
                }
            }
            this.o8y.oj6();
        }
    }

    private void oaw(boolean bl) {
        block11: {
            int n = 0;
            int n2 = 0;
            jom jom2 = jom.yut();
            q3g q3g2 = jom2.zuq();
            float f = 0.0f;
            int n3 = t9d.b();
            f5a.y66(this._be).anl(this.u4n);
            hzu.spd();
            hzu.u39(1, 771, 0, 1);
            hzu.vtj();
            q3g2.ezr(7, gnl._r5);
            q3g2.g5o((float)(n + 0) + f, (float)(n2 + 128) - f, -0.01f).h0a(0.0, 1.0).pzw();
            q3g2.g5o((float)(n + 128) - f, (float)(n2 + 128) - f, -0.01f).h0a(1.0, 1.0).pzw();
            q3g2.g5o((float)(n + 128) - f, (float)(n2 + 0) + f, -0.01f).h0a(1.0, 0.0).pzw();
            q3g2.g5o((float)(n + 0) + f, (float)(n2 + 0) + f, -0.01f).h0a(0.0, 0.0).pzw();
            int n4 = n3;
            jom2.q7g();
            hzu.if9();
            hzu.ux6();
            f5a.y66(this._be).anl(f5a.zix());
            int n5 = 0;
            for (lib lib2 : this.phw.xoj.values()) {
                block15: {
                    int n6;
                    block12: {
                        int n7;
                        int n8;
                        block14: {
                            try {
                                block13: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n4 == 0) break block11;
                                                    n6 = bl;
                                                    if (n4 == 0) break block12;
                                                }
                                                catch (oov oov2) {
                                                    throw f5a$yqd.a(oov2);
                                                }
                                                if (n6 == 0) break block13;
                                            }
                                            catch (oov oov3) {
                                                throw f5a$yqd.a(oov3);
                                            }
                                            int n7 = lib2.c0r();
                                            n7 = 1;
                                            if (n4 == 0) break block14;
                                        }
                                        catch (oov oov4) {
                                            throw f5a$yqd.a(oov4);
                                        }
                                        if (n8 != n7) break block15;
                                    }
                                    catch (oov oov5) {
                                        throw f5a$yqd.a(oov5);
                                    }
                                }
                                hzu.dp2();
                                hzu.a4k((float)n + (float)lib2.fr4() / 2.0f + 64.0f, (float)n2 + (float)lib2.rxw() / 2.0f + 64.0f, -0.02f);
                                int n7 = lib2.txm();
                                n7 = 360;
                            }
                            catch (oov oov6) {
                                throw f5a$yqd.a(oov6);
                            }
                        }
                        hzu.a2h((float)(n8 * n7) / 16.0f, 0.0f, 0.0f, 1.0f);
                        hzu.syc(4.0f, 4.0f, 3.0f);
                        hzu.a4k(-0.125f, 0.125f, 0.0f);
                        n6 = lib2.c0r();
                    }
                    int n9 = n6;
                    float f2 = (float)(n9 % 4 + 0) / 4.0f;
                    float f3 = (float)(n9 / 4 + 0) / 4.0f;
                    float f4 = (float)(n9 % 4 + 1) / 4.0f;
                    float f5 = (float)(n9 / 4 + 1) / 4.0f;
                    q3g2.ezr(7, gnl._r5);
                    float f6 = -0.001f;
                    q3g2.g5o(-1.0, 1.0, (float)n5 * -0.001f).h0a(f2, f3).pzw();
                    q3g2.g5o(1.0, 1.0, (float)n5 * -0.001f).h0a(f4, f3).pzw();
                    q3g2.g5o(1.0, -1.0, (float)n5 * -0.001f).h0a(f4, f5).pzw();
                    q3g2.g5o(-1.0, -1.0, (float)n5 * -0.001f).h0a(f2, f5).pzw();
                    jom2.q7g();
                    hzu.x3w();
                    ++n5;
                }
                if (n4 != 0) continue;
            }
            hzu.dp2();
            hzu.a4k(0.0f, 0.0f, -0.04f);
            hzu.syc(1.0f, 1.0f, 1.0f);
            hzu.x3w();
        }
    }

    public static void ogj(f5a$yqd f5a$yqd) {
        f5a$yqd.eht();
    }

    public static void toe(f5a$yqd f5a$yqd, boolean bl) {
        f5a$yqd.oaw(bl);
    }

    public f5a$yqd(f5a f5a2, ucr ucr2, f5a$1 f5a$1) {
        this(f5a2, ucr2);
    }

    public static gdz uxl(f5a$yqd f5a$yqd) {
        return f5a$yqd.u4n;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x587D60A0CAC7L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0097\u00b3\u00e9\u00df\u00b7\u00fe+F".getBytes("ISO-8859-1"));
                b = f5a$yqd.a(byArray3).intern();
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

