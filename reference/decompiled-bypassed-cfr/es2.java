/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class es2
extends hmv {
    private static final long b = c.a(-8867299812893571598L, 430305561248944863L, MethodHandles.lookup().lookupClass()).a(137662354223248L);
    private static final String k;

    public es2(p3y p3y2) {
        int n = t9d.b();
        super(p3y2);
        e0x e0x2 = this._p_(false);
        if (n != 0) {
            try {
                if (p3y2 == p3y.e1s) {
                    e0x2 = this._p_(true);
                }
            }
            catch (oov oov2) {
                throw es2.a(oov2);
            }
        }
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block5: {
            zfz zfz3;
            mew mew3;
            t9d t9d3;
            es2 es22;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        es22 = this;
                        t9d3 = t9d2;
                        mew3 = mew2;
                        zfz3 = zfz2;
                        if (n == 0) break block4;
                        if (es22.umq(t9d3, mew3, zfz3)) break block5;
                    }
                    catch (oov oov2) {
                        throw es2.a(oov2);
                    }
                    es22 = this;
                    t9d3 = t9d2;
                    mew3 = mew2;
                    zfz3 = zfz2;
                }
                catch (oov oov3) {
                    throw es2.a(oov3);
                }
            }
            es22.n37(t9d3, mew3, zfz3);
        }
    }

    private void n37(t9d t9d2, mew mew2, zfz zfz2) {
        _13 _132 = es2.cvb(this.kgd);
        t9d2.vct(mew2, _132.l4i().zvi(nfg, zfz2.dil(nfg)), 2);
        t9d2.cjk(mew2, _132, this.odp(t9d2));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void zvy(t9d var1_1, mew var2_2, zfz var3_3, Random var4_4) {
        block33: {
            block35: {
                block34: {
                    var5_5 = es2.b ^ 120393158652375L;
                    var7_6 = t9d.b();
                    try {
                        try {
                            try {
                                if (this.kgd != p3y.e1s) break block33;
                                v0 = var1_1.eir()._s0(es2.k);
                                if (var7_6 == 0) break block34;
                            }
                            catch (oov v1) {
                                throw es2.a(v1);
                            }
                            if (v0 == 0) break block33;
                        }
                        catch (oov v2) {
                            throw es2.a(v2);
                        }
                        v0 = var4_4.nextInt(3);
                    }
                    catch (oov v3) {
                        throw es2.a(v3);
                    }
                }
                var8_7 = v0;
                try {
                    v4 = var8_7;
                    if (var7_6 == 0) break block35;
                    if (v4 > 0) {
                    }
                    ** GOTO lbl75
                }
                catch (oov v5) {
                    throw es2.a(v5);
                }
                var9_8 = var2_2;
                for (var10_10 = 0; var10_10 < var8_7; ++var10_10) {
                    block36: {
                        block37: {
                            block38: {
                                var9_8 = var9_8.ec4(var4_4.nextInt(3) - 1, 1, var4_4.nextInt(3) - 1);
                                var11_12 = var1_1.getBlockState(var9_8).r_y();
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var7_6 == 0) break block33;
                                                    v6 = var11_12.kgd;
                                                    if (var7_6 == 0) break block36;
                                                }
                                                catch (oov v7) {
                                                    throw es2.a(v7);
                                                }
                                                if (v6 != p3y.cei) break block37;
                                            }
                                            catch (oov v8) {
                                                throw es2.a(v8);
                                            }
                                            v9 = this.deq(var1_1, var9_8);
                                            if (var7_6 == 0) break block38;
                                        }
                                        catch (oov v10) {
                                            throw es2.a(v10);
                                        }
                                        if (!v9) continue;
                                    }
                                    catch (oov v11) {
                                        throw es2.a(v11);
                                    }
                                    v9 = var1_1.gfy(var9_8, ox_._0u.l4i());
                                }
                                catch (oov v12) {
                                    throw es2.a(v12);
                                }
                            }
                            return;
                        }
                        v6 = var11_12.kgd;
                    }
                    try {
                        if (!v6.c3t()) continue;
                        return;
                    }
                    catch (oov v13) {
                        throw es2.a(v13);
                    }
                }
                try {
                    if (var7_6 != 0) break block33;
lbl75:
                    // 2 sources

                    v4 = 0;
                }
                catch (oov v14) {
                    throw es2.a(v14);
                }
            }
            var9_9 = v4;
            while (var9_9 < 3) {
                block39: {
                    block40: {
                        var10_11 = var2_2.ec4(var4_4.nextInt(3) - 1, 0, var4_4.nextInt(3) - 1);
                        try {
                            try {
                                try {
                                    try {
                                        if (var7_6 == 0) break block39;
                                        if (!var1_1.isAirBlock(var10_11.nuv())) break block40;
                                    }
                                    catch (oov v15) {
                                        throw es2.a(v15);
                                    }
                                    v16 = this.wea(var1_1, var10_11);
                                    if (var7_6 == 0) break block40;
                                }
                                catch (oov v17) {
                                    throw es2.a(v17);
                                }
                                if (!v16) break block40;
                            }
                            catch (oov v18) {
                                throw es2.a(v18);
                            }
                            v16 = var1_1.gfy(var10_11.nuv(), ox_._0u.l4i());
                        }
                        catch (oov v19) {
                            throw es2.a(v19);
                        }
                    }
                    ++var9_9;
                }
                if (var7_6 != 0) continue;
            }
        }
    }

    public boolean deq(t9d t9d2, mew mew2) {
        boolean bl;
        block8: {
            vt2[] vt2Array = vt2.values();
            int n = vt2Array.length;
            int n2 = 0;
            int n3 = t9d.c();
            while (n2 < n) {
                block7: {
                    block9: {
                        vt2 vt22 = vt2Array[n2];
                        try {
                            try {
                                try {
                                    if (n3 != 0) break block7;
                                    bl = this.wea(t9d2, mew2.offset(vt22));
                                    if (n3 != 0) break block8;
                                }
                                catch (oov oov2) {
                                    throw es2.a(oov2);
                                }
                                if (!bl) break block9;
                            }
                            catch (oov oov3) {
                                throw es2.a(oov3);
                            }
                            return true;
                        }
                        catch (oov oov4) {
                            throw es2.a(oov4);
                        }
                    }
                    ++n2;
                }
                if (n3 == 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    private boolean wea(t9d t9d2, mew mew2) {
        return t9d2.getBlockState(mew2).r_y().p1r().z6u();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = b ^ 0x7E2340E6F01CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("E\u00c5\u00fc\u00e9(\u00e6\u00adl\u008c\u00a4/\u00fe\u0006\u00b5\u001f\u000b".getBytes("ISO-8859-1"));
                k = es2.c(byArray3).intern();
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

    private static String c(byte[] byArray) {
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

