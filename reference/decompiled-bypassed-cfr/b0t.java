/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b0t {
    public static final gdz yby;
    public static final gdz p24;
    public static final gdz rt2;
    public float o3s;

    public void yaj(int n, int n2, int n3, int n4) {
        int n5;
        block2: {
            block3: {
                int n6 = t9d.b();
                try {
                    n5 = n2;
                    if (n6 == 0) break block2;
                    if (n5 >= n) break block3;
                }
                catch (oov oov2) {
                    throw b0t.b(oov2);
                }
                int n7 = n;
                n = n2;
                n2 = n7;
            }
            n5 = n;
        }
        b0t.df9(n5, n3, n2 + 1, n3 + 1, n4);
    }

    public void x3f(int n, int n2, int n3, int n4) {
        int n5;
        block2: {
            block3: {
                int n6 = t9d.b();
                try {
                    n5 = n3;
                    if (n6 == 0) break block2;
                    if (n5 >= n2) break block3;
                }
                catch (oov oov2) {
                    throw b0t.b(oov2);
                }
                int n7 = n2;
                n2 = n3;
                n3 = n7;
            }
            n5 = n;
        }
        b0t.df9(n5, n2 + 1, n + 1, n3, n4);
    }

    public static void df9(float f, float f2, float f3, float f4, int n) {
        float f5;
        float f6;
        block6: {
            block7: {
                int n2;
                block4: {
                    block5: {
                        n2 = t9d.c();
                        try {
                            f6 = f == f3 ? 0 : (f < f3 ? -1 : 1);
                            if (n2 != 0) break block4;
                            if (f6 >= 0) break block5;
                        }
                        catch (oov oov2) {
                            throw b0t.b(oov2);
                        }
                        f5 = f;
                        f = f3;
                        f3 = f5;
                    }
                    f6 = f2 == f4 ? 0 : (f2 < f4 ? -1 : 1);
                }
                try {
                    if (n2 != 0) break block6;
                    if (f6 >= 0) break block7;
                }
                catch (oov oov3) {
                    throw b0t.b(oov3);
                }
                f5 = f2;
                f2 = f4;
                f4 = f5;
            }
            f6 = n >> 24 & 0xFF;
        }
        f5 = (float)f6 / 255.0f;
        float f7 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n & 0xFF) / 255.0f;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        hzu.spd();
        hzu.m_1();
        hzu.u39(770, 771, 1, 0);
        hzu.wn0(f7, f8, f9, f5);
        q3g2.ezr(7, gnl.gx3);
        q3g2.g5o(f, f4, 0.0).pzw();
        q3g2.g5o(f3, f4, 0.0).pzw();
        q3g2.g5o(f3, f2, 0.0).pzw();
        q3g2.g5o(f, f2, 0.0).pzw();
        jom2.q7g();
        hzu.rqj();
        hzu.ux6();
    }

    public void flp(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        float f5 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n6 & 0xFF) / 255.0f;
        hzu.m_1();
        hzu.spd();
        hzu.vtj();
        hzu.u39(770, 771, 1, 0);
        hzu.nn9(7425);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl.gec);
        q3g2.g5o(n3, n2, this.o3s).gs4(f2, f3, f4, f).pzw();
        q3g2.g5o(n, n2, this.o3s).gs4(f2, f3, f4, f).pzw();
        q3g2.g5o(n, n4, this.o3s).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(n3, n4, this.o3s).gs4(f6, f7, f8, f5).pzw();
        jom2.q7g();
        hzu.nn9(7424);
        hzu.ux6();
        hzu.if9();
        hzu.rqj();
    }

    public void ls_(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        float f9 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n2 & 0xFF) / 255.0f;
        hzu.m_1();
        hzu.spd();
        hzu.vtj();
        hzu.u39(770, 771, 1, 0);
        hzu.nn9(7425);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl.gec);
        q3g2.g5o(f3, f2, this.o3s).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f, f2, this.o3s).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f, f4, this.o3s).gs4(f10, f11, f12, f9).pzw();
        q3g2.g5o(f3, f4, this.o3s).gs4(f10, f11, f12, f9).pzw();
        jom2.q7g();
        hzu.nn9(7424);
        hzu.ux6();
        hzu.if9();
        hzu.rqj();
    }

    public void poi(owt owt2, String string, int n, int n2, int n3) {
        owt2.km1(string, n - owt2.ezt(string) / 2, n2, n3);
    }

    public void c_t(owt owt2, String string, int n, int n2, int n3) {
        owt2.km1(string, n, n2, n3);
    }

    public void mt4(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(n + 0, n2 + n6, this.o3s).h0a((float)(n3 + 0) * f, (float)(n4 + n6) * f2).pzw();
        q3g2.g5o(n + n5, n2 + n6, this.o3s).h0a((float)(n3 + n5) * f, (float)(n4 + n6) * f2).pzw();
        q3g2.g5o(n + n5, n2 + 0, this.o3s).h0a((float)(n3 + n5) * f, (float)(n4 + 0) * f2).pzw();
        q3g2.g5o(n + 0, n2 + 0, this.o3s).h0a((float)(n3 + 0) * f, (float)(n4 + 0) * f2).pzw();
        jom2.q7g();
    }

    public void j7o(float f, float f2, int n, int n2, int n3, int n4) {
        float f3 = 0.00390625f;
        float f4 = 0.00390625f;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(f + 0.0f, f2 + (float)n4, this.o3s).h0a((float)(n + 0) * f3, (float)(n2 + n4) * f4).pzw();
        q3g2.g5o(f + (float)n3, f2 + (float)n4, this.o3s).h0a((float)(n + n3) * f3, (float)(n2 + n4) * f4).pzw();
        q3g2.g5o(f + (float)n3, f2 + 0.0f, this.o3s).h0a((float)(n + n3) * f3, (float)(n2 + 0) * f4).pzw();
        q3g2.g5o(f + 0.0f, f2 + 0.0f, this.o3s).h0a((float)(n + 0) * f3, (float)(n2 + 0) * f4).pzw();
        jom2.q7g();
    }

    public void _29(int n, int n2, sla sla2, int n3, int n4) {
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(n + 0, n2 + n4, this.o3s).h0a(sla2.l3u(), sla2.e8_()).pzw();
        q3g2.g5o(n + n3, n2 + n4, this.o3s).h0a(sla2.w2b(), sla2.e8_()).pzw();
        q3g2.g5o(n + n3, n2 + 0, this.o3s).h0a(sla2.w2b(), sla2.bhi()).pzw();
        q3g2.g5o(n + 0, n2 + 0, this.o3s).h0a(sla2.l3u(), sla2.bhi()).pzw();
        jom2.q7g();
    }

    public static void vfo(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(n, n2 + n4, 0.0).h0a(f * f5, (f2 + (float)n4) * f6).pzw();
        q3g2.g5o(n + n3, n2 + n4, 0.0).h0a((f + (float)n3) * f5, (f2 + (float)n4) * f6).pzw();
        q3g2.g5o(n + n3, n2, 0.0).h0a((f + (float)n3) * f5, f2 * f6).pzw();
        q3g2.g5o(n, n2, 0.0).h0a(f * f5, f2 * f6).pzw();
        jom2.q7g();
    }

    public static void byz(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = 1.0f / f7;
        float f10 = 1.0f / f8;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(f, f2 + f6, 0.0).h0a(f3 * f9, (f4 + f6) * f10).pzw();
        q3g2.g5o(f + f5, f2 + f6, 0.0).h0a((f3 + f5) * f9, (f4 + f6) * f10).pzw();
        q3g2.g5o(f + f5, f2, 0.0).h0a((f3 + f5) * f9, f4 * f10).pzw();
        q3g2.g5o(f, f2, 0.0).h0a(f3 * f9, f4 * f10).pzw();
        jom2.q7g();
    }

    public static void oc3(float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, float f5, float f6) {
        float f7 = 1.0f / f5;
        float f8 = 1.0f / f6;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(f, f2 + (float)n4, 0.0).h0a(f3 * f7, (f4 + (float)n2) * f8).pzw();
        q3g2.g5o(f + (float)n3, f2 + (float)n4, 0.0).h0a((f3 + (float)n) * f7, (f4 + (float)n2) * f8).pzw();
        q3g2.g5o(f + (float)n3, f2, 0.0).h0a((f3 + (float)n) * f7, f4 * f8).pzw();
        q3g2.g5o(f, f2, 0.0).h0a(f3 * f7, f4 * f8).pzw();
        jom2.q7g();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-4487797001734764875L, 6324518574576053292L, MethodHandles.lookup().lookupClass()).a(60856023376279L) ^ 0x12FC65FADB4EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\f\u009a\u0083\u000f\u000f\u0014\u0000\u00ab\u000e\u0099%\u00d3\u00ces@qI\u00d9\u008c\u00be\u00d8+\u00f6 \u0097g7\u00bb\u008e\u00bd\u00a4\u008ex\u00e9Ebs\u00ae\u00b7\u0091\u0018\f\u009a\u0083\u000f\u000f\u0014\u0000\u00ab\u00db\u00cdG\u001a\u00f6\u00b6G\u00f1\u0084\u00a4\u00ddN\u00d8\b#[(\f\u009a\u0083\u000f\u000f\u0014\u0000\u00ab\u00a6 \u00a1`\u0091\u00ab}\u0087\u00fb?g\u00ae@\u0006\u0019:a\u00ae{\u008b\u0083\u00ff\u008c\u00cc\u0093\u00e9\u00b6S%\u0097yf";
        int n2 = "\f\u009a\u0083\u000f\u000f\u0014\u0000\u00ab\u000e\u0099%\u00d3\u00ces@qI\u00d9\u008c\u00be\u00d8+\u00f6 \u0097g7\u00bb\u008e\u00bd\u00a4\u008ex\u00e9Ebs\u00ae\u00b7\u0091\u0018\f\u009a\u0083\u000f\u000f\u0014\u0000\u00ab\u00db\u00cdG\u001a\u00f6\u00b6G\u00f1\u0084\u00a4\u00ddN\u00d8\b#[(\f\u009a\u0083\u000f\u000f\u0014\u0000\u00ab\u00a6 \u00a1`\u0091\u00ab}\u0087\u00fb?g\u00ae@\u0006\u0019:a\u00ae{\u008b\u0083\u00ff\u008c\u00cc\u0093\u00e9\u00b6S%\u0097yf".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = b0t.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                yby = new gdz(stringArray2[2]);
                p24 = new gdz(stringArray2[0]);
                rt2 = new gdz(stringArray2[1]);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov b(oov oov2) {
        return oov2;
    }

    private static String b(byte[] byArray) {
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

