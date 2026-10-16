/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class fyk$r1f {
    public final c05 hgl;
    public final ha9 noj;
    public float q5z;
    public final fyk j0h;
    private static final long a = c.a(-3258349813654006444L, 6406803969108597290L, MethodHandles.lookup().lookupClass()).a(80347242556718L);
    private static final String b;

    public fyk$r1f(fyk fyk2, ha9 ha92) {
        this.j0h = fyk2;
        this.hgl = c05.vz1();
        this.q5z = 0.0f;
        this.noj = ha92;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cag(float var1_1, float var2_2) {
        block38: {
            block36: {
                block37: {
                    block34: {
                        block35: {
                            block32: {
                                block33: {
                                    block30: {
                                        block31: {
                                            var3_3 = fyk$r1f.a ^ 11943240696518L;
                                            GL11.glPushMatrix();
                                            GL11.glTranslatef((float)var1_1, (float)var2_2, (float)0.0f);
                                            var6_4 = this.noj.noc();
                                            var7_5 = fyk$r1f.b + (double)Math.round(this.noj.i55() * 10.0f) / 10.0;
                                            var8_6 = jsr.yk7.ax2(var6_4) + 4.0f;
                                            var9_7 = jsr.zva.ax2(var7_5) + 4.0f;
                                            var5_8 = t9d.c();
                                            var10_9 = Math.max(var8_6, var9_7);
                                            mkt.o8m(0.0f, 0.0f, 26.0f + var10_9, 40.0f, 2.0f, hhf.kjo(-14539477, 0.85f), 1.0f, hhf.kjo(z7e.ret.k0y, 0.0f));
                                            jsr.yk7.fzf(var6_4, 26.0f, 2.0f, z7e.a2_.k0y);
                                            jsr.zva.fzf(var7_5, 26.0f, 14.0f, z7e.a2_.k0y);
                                            var11_10 = this.noj.i55();
                                            var12_11 = this.noj.axb();
                                            var13_12 = rak.wtd(var11_10 / var12_11, 0.0f, 1.0f);
                                            var14_13 = (16.5f + var10_9 - 2.0f) / 100.0f * (var13_12 * 100.0f);
                                            try {
                                                try {
                                                    cfr_temp_0 = this.q5z - 0.0f;
                                                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                    if (var5_8 != 0) break block30;
                                                    if (v0 > 0) break block31;
                                                }
                                                catch (oov v1) {
                                                    throw fyk$r1f.a(v1);
                                                }
                                                this.q5z = var14_13;
                                            }
                                            catch (oov v2) {
                                                throw fyk$r1f.a(v2);
                                            }
                                        }
                                        v0 = (cfr_temp_1 = this.q5z - (25.5f + var10_9 - 2.0f)) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                    }
                                    try {
                                        try {
                                            if (var5_8 != 0) break block32;
                                            if (v0 <= 0) break block33;
                                        }
                                        catch (oov v3) {
                                            throw fyk$r1f.a(v3);
                                        }
                                        this.q5z = var14_13;
                                    }
                                    catch (oov v4) {
                                        throw fyk$r1f.a(v4);
                                    }
                                }
                                v0 = this.noj.gx0;
                            }
                            try {
                                try {
                                    if (var5_8 != 0) break block34;
                                    if (v0 > 6) break block35;
                                }
                                catch (oov v5) {
                                    throw fyk$r1f.a(v5);
                                }
                                this.q5z = ybv.lvf(this.q5z, var14_13, (float)Math.max(10.0, (double)(Math.abs(this.q5z - var14_13) * 30.0f) * 0.4));
                            }
                            catch (oov v6) {
                                throw fyk$r1f.a(v6);
                            }
                        }
                        hhf.cuu(10.0f, 27.5f, 25.5f + var10_9 - 2.0f, 29.5f, hhf.kjo(z7e.ret.k0y, 0.35f));
                        cfr_temp_2 = var14_13 - 0.0f;
                        v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                    }
                    try {
                        if (var5_8 != 0) break block36;
                        if (v0 <= 0) break block37;
                    }
                    catch (oov v7) {
                        throw fyk$r1f.a(v7);
                    }
                    var15_14 = Math.max(10.0f + this.q5z - 1.0f, 10.0f);
                    var16_15 = Math.max(10.0f + var14_13 - 1.0f, 10.0f);
                    hhf.cuu(10.0f, 27.5f, var15_14, 29.5f, hhf.kjo(-84409, 0.95f));
                    hhf.cuu(10.0f, 27.5f, var16_15, 29.5f, hhf.kjo(-16723585, 0.95f));
                }
                jsr.q6n.fzf("s", 2.5f, 26.0f, z7e.a2_.k0y);
                v0 = jsr.q6n.fzf("r", 2.5f, 33.0f, z7e.a2_.k0y);
            }
            var15_14 = Math.max(10.0f + (16.5f + var10_9 - 2.0f) / 100.0f * (float)(this.noj.y5z() * 5) - 1.0f, 10.0f);
            try {
                hhf.cuu(10.0f, 34.5f, 25.5f + var10_9 - 2.0f, 36.5f, hhf.kjo(z7e.ret.k0y, 0.35f));
                hhf.cuu(10.0f, 34.5f, var15_14, 36.5f, -12417291);
                v8 = d3x.jg8;
                v9 = 1.5;
                v10 = 1.5;
                v11 = 24.5;
                v12 = 24.5;
                v13 = 0.5;
                v14 = 0;
                v15 = fyk.kfa == this.noj ? z7e.gwi.k0y : -1;
            }
            catch (oov v16) {
                throw fyk$r1f.a(v16);
            }
            v8.wof(v9, v10, v11, v12, v13, v14, v15);
            hzu.u49();
            for (hv2 var17_17 : vg2.kq6.sortedCopy((Iterable)this.hgl.c02().l0e())) {
                block40: {
                    block41: {
                        block39: {
                            try {
                                try {
                                    try {
                                        if (var5_8 != 0) break block38;
                                        v17 = this.hgl.tij.hlz(var17_17.pbs().getId());
                                        if (var5_8 != 0) break block39;
                                    }
                                    catch (oov v18) {
                                        throw fyk$r1f.a(v18);
                                    }
                                    if (v17 == this.noj) {
                                    }
                                    ** GOTO lbl189
                                }
                                catch (oov v19) {
                                    throw fyk$r1f.a(v19);
                                }
                                this.hgl.l22().anl(var17_17.dq7());
                                this.j0h.z57(2.0f, 2.0f, 8.0f, 8.0f, 8.0f, 8.0f, 22.0f, 22.0f, 64.0f, 64.0f);
                                v17 = this.noj;
                            }
                            catch (oov v20) {
                                throw fyk$r1f.a(v20);
                            }
                        }
                        try {
                            try {
                                v21 = v17.cuw(ulc.gn8);
                                if (var5_8 != 0) break block40;
                                if (v21 == 0) break block41;
                            }
                            catch (oov v22) {
                                throw fyk$r1f.a(v22);
                            }
                            this.j0h.z57(2.0f, 2.0f, 40.0f, 8.0f, 8.0f, 8.0f, 22.0f, 22.0f, 64.0f, 64.0f);
                        }
                        catch (oov v23) {
                            throw fyk$r1f.a(v23);
                        }
                    }
                    v21 = 0;
                }
                try {
                    hzu.t30(v21);
                    if (var5_8 == 0) break;
lbl189:
                    // 2 sources

                    if (var5_8 == 0) continue;
                    break;
                }
                catch (oov v24) {
                    throw fyk$r1f.a(v24);
                }
            }
            GL11.glPopMatrix();
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
        long l = a ^ 0x7D60A8C248F4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("r\u00bf|\u00ca\u0016\u007f\u008b\u00fc1*i\u00ba\u009b\u00e8\b\u0098".getBytes("ISO-8859-1"));
                b = fyk$r1f.a(byArray3).intern();
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

