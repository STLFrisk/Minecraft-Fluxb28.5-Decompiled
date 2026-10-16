/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class aby
extends liu {
    private static final gdz aye;

    public aby(hr_ hr_2) {
        super(hr_2);
    }

    public void u7d(n0_ n0_2, double d, double d2, double d3, float f, float f2) {
        hzu.dp2();
        hzu.hsv(d, d2, d3);
        hzu.a2h(180.0f - f, 0.0f, 1.0f, 0.0f);
        hzu.ixc();
        this.sat(n0_2);
        n0_$kmh n0_$kmh = n0_2.u16;
        float f3 = 0.0625f;
        hzu.syc(f3, f3, f3);
        this.bxs(n0_2, n0_$kmh.ons, n0_$kmh.zbf, n0_$kmh.bol, n0_$kmh.pe5);
        hzu.eiq();
        hzu.x3w();
        super.apl(n0_2, d, d2, d3, f, f2);
    }

    public gdz edr(n0_ n0_2) {
        return aye;
    }

    private void bxs(n0_ n0_2, int n, int n2, int n3, int n4) {
        float f = (float)(-n) / 2.0f;
        float f2 = (float)(-n2) / 2.0f;
        float f3 = 0.5f;
        float f4 = 0.75f;
        float f5 = 0.8125f;
        float f6 = 0.0f;
        float f7 = 0.0625f;
        float f8 = 0.75f;
        float f9 = 0.8125f;
        int n5 = t9d.b();
        float f10 = 0.001953125f;
        float f11 = 0.001953125f;
        float f12 = 0.7519531f;
        float f13 = 0.7519531f;
        float f14 = 0.0f;
        float f15 = 0.0625f;
        int n6 = 0;
        while (n6 < n / 16) {
            block5: {
                for (int i = 0; i < n2 / 16; ++i) {
                    float f16 = f + (float)((n6 + 1) * 16);
                    float f17 = f + (float)(n6 * 16);
                    float f18 = f2 + (float)((i + 1) * 16);
                    float f19 = f2 + (float)(i * 16);
                    this.s3a(n0_2, (f16 + f17) / 2.0f, (f18 + f19) / 2.0f);
                    float f20 = (float)(n3 + n - n6 * 16) / 256.0f;
                    float f21 = (float)(n3 + n - (n6 + 1) * 16) / 256.0f;
                    float f22 = (float)(n4 + n2 - i * 16) / 256.0f;
                    float f23 = (float)(n4 + n2 - (i + 1) * 16) / 256.0f;
                    jom jom2 = jom.yut();
                    q3g q3g2 = jom2.zuq();
                    try {
                        q3g2.ezr(7, gnl.c03);
                        q3g2.g5o(f16, f19, -f3).h0a(f21, f22).h3y(0.0f, 0.0f, -1.0f).pzw();
                        q3g2.g5o(f17, f19, -f3).h0a(f20, f22).h3y(0.0f, 0.0f, -1.0f).pzw();
                        q3g2.g5o(f17, f18, -f3).h0a(f20, f23).h3y(0.0f, 0.0f, -1.0f).pzw();
                        q3g2.g5o(f16, f18, -f3).h0a(f21, f23).h3y(0.0f, 0.0f, -1.0f).pzw();
                        q3g2.g5o(f16, f18, f3).h0a(f4, f6).h3y(0.0f, 0.0f, 1.0f).pzw();
                        q3g2.g5o(f17, f18, f3).h0a(f5, f6).h3y(0.0f, 0.0f, 1.0f).pzw();
                        q3g2.g5o(f17, f19, f3).h0a(f5, f7).h3y(0.0f, 0.0f, 1.0f).pzw();
                        q3g2.g5o(f16, f19, f3).h0a(f4, f7).h3y(0.0f, 0.0f, 1.0f).pzw();
                        q3g2.g5o(f16, f18, -f3).h0a(f8, f10).h3y(0.0f, 1.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f18, -f3).h0a(f9, f10).h3y(0.0f, 1.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f18, f3).h0a(f9, f11).h3y(0.0f, 1.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f18, f3).h0a(f8, f11).h3y(0.0f, 1.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f19, f3).h0a(f8, f10).h3y(0.0f, -1.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f19, f3).h0a(f9, f10).h3y(0.0f, -1.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f19, -f3).h0a(f9, f11).h3y(0.0f, -1.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f19, -f3).h0a(f8, f11).h3y(0.0f, -1.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f18, f3).h0a(f13, f14).h3y(-1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f19, f3).h0a(f13, f15).h3y(-1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f19, -f3).h0a(f12, f15).h3y(-1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f16, f18, -f3).h0a(f12, f14).h3y(-1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f18, -f3).h0a(f13, f14).h3y(1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f19, -f3).h0a(f13, f15).h3y(1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f19, f3).h0a(f12, f15).h3y(1.0f, 0.0f, 0.0f).pzw();
                        q3g2.g5o(f17, f18, f3).h0a(f12, f14).h3y(1.0f, 0.0f, 0.0f).pzw();
                        jom2.q7g();
                        if (n5 != 0) {
                            if (n5 != 0) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (oov oov2) {
                        throw aby.a(oov2);
                    }
                }
                ++n6;
            }
            if (n5 != 0) continue;
        }
    }

    private void s3a(n0_ n0_2, float f, float f2) {
        vt2 vt22;
        vt2 vt23;
        int n;
        int n2;
        int n3;
        block11: {
            vt2 vt24;
            block12: {
                int n4;
                block9: {
                    block10: {
                        block7: {
                            block8: {
                                n3 = fe6.jqf(n0_2.o2v);
                                n2 = fe6.jqf(n0_2.kfp + (double)(f2 / 16.0f));
                                n = fe6.jqf(n0_2.vbd);
                                vt24 = n0_2.vv_;
                                n4 = t9d.c();
                                try {
                                    vt23 = vt24;
                                    vt22 = vt2.z9q;
                                    if (n4 != 0) break block7;
                                    if (vt23 != vt22) break block8;
                                }
                                catch (oov oov2) {
                                    throw aby.a(oov2);
                                }
                                n3 = fe6.jqf(n0_2.o2v + (double)(f / 16.0f));
                            }
                            vt23 = vt24;
                            vt22 = vt2.te4;
                        }
                        try {
                            if (n4 != 0) break block9;
                            if (vt23 != vt22) break block10;
                        }
                        catch (oov oov3) {
                            throw aby.a(oov3);
                        }
                        n = fe6.jqf(n0_2.vbd - (double)(f / 16.0f));
                    }
                    vt23 = vt24;
                    vt22 = vt2.mxp;
                }
                try {
                    if (n4 != 0) break block11;
                    if (vt23 != vt22) break block12;
                }
                catch (oov oov4) {
                    throw aby.a(oov4);
                }
                n3 = fe6.jqf(n0_2.o2v - (double)(f / 16.0f));
            }
            vt23 = vt24;
            vt22 = vt2.zk4;
        }
        if (vt23 == vt22) {
            n = fe6.jqf(n0_2.vbd + (double)(f / 16.0f));
        }
        int n5 = this.l0g.kzr.getCombinedLight(new mew(n3, n2, n), 0);
        int n6 = n5 % 65536;
        int n7 = n5 / 65536;
        gis.w9e(gis.exn, n6, n7);
        hzu.oxa(1.0f, 1.0f, 1.0f);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.edr((n0_)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.u7d((n0_)i2h2, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-7883152829296092361L, -5765452482038249375L, MethodHandles.lookup().lookupClass()).a(267450906376163L) ^ 0x411813BD3306L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("P\u0092\u0086\u00d1\u00f9\u00cc\u000eC\u00d6\\\u00b0\u00af \u00ac\u001e\u00ac\u0093\u00d5H\u00c8O\u00df\u00d6,\u0081\u00c4<\u00d7\u00b8\u00fa\u0013`\u0088O&\u008d\u00eb\u0019\u00d1\u00b1\u00d1D}\u008d\u00cbQ6\u0012\u00d1\u00e5P\u00ada\u001f\u00f2\u00b6".getBytes("ISO-8859-1"));
                String string = aby.b(byArray3).intern();
                aye = new gdz(string);
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

