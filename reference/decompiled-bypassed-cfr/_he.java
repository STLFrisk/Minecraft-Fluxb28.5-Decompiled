/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityEnderChest;

public class _he
extends q9h {
    private static final /* synthetic */ gdz rcu;
    private /* synthetic */ vu3 uml;

    public _he() {
        this.uml = new vu3();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void qhm(TileEntityEnderChest var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6) {
        block60: {
            block59: {
                block58: {
                    block57: {
                        block56: {
                            block55: {
                                block54: {
                                    block53: {
                                        block52: {
                                            block50: {
                                                block51: {
                                                    block48: {
                                                        block49: {
                                                            block46: {
                                                                block47: {
                                                                    block45: {
                                                                        block44: {
                                                                            block42: {
                                                                                block43: {
                                                                                    var10_7 = t9d.c();
                                                                                    var11_8 = 0;
                                                                                    try {
                                                                                        v0 = var1_1.g8i();
                                                                                        if (var10_7 != 0) break block42;
                                                                                        if (v0 == 0) break block43;
                                                                                    }
                                                                                    catch (oov v1) {
                                                                                        throw _he.a(v1);
                                                                                    }
                                                                                    var11_8 = var1_1.hvh();
                                                                                }
                                                                                v0 = var9_6;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var10_7 != 0) break block44;
                                                                                    if (v0 >= 0) {
                                                                                    }
                                                                                    ** GOTO lbl40
                                                                                }
                                                                                catch (oov v2) {
                                                                                    throw _he.a(v2);
                                                                                }
                                                                                this.g3j(_he._oj[var9_6]);
                                                                                hzu.ah8(5890);
                                                                                hzu.dp2();
                                                                                hzu.syc(4.0f, 4.0f, 1.0f);
                                                                                hzu.a4k(0.0625f, 0.0625f, 0.0625f);
                                                                                v0 = 5888;
                                                                            }
                                                                            catch (oov v3) {
                                                                                throw _he.a(v3);
                                                                            }
                                                                        }
                                                                        try {
                                                                            hzu.ah8(v0);
                                                                            if (var10_7 == 0) break block45;
lbl40:
                                                                            // 2 sources

                                                                            this.g3j(_he.rcu);
                                                                        }
                                                                        catch (oov v4) {
                                                                            throw _he.a(v4);
                                                                        }
                                                                    }
                                                                    hzu.dp2();
                                                                    hzu.ixc();
                                                                    hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                                                                    hzu.a4k((float)var2_2, (float)var4_3 + 1.0f, (float)var6_4 + 1.0f);
                                                                    hzu.syc(1.0f, -1.0f, -1.0f);
                                                                    hzu.a4k(0.5f, 0.5f, 0.5f);
                                                                    var12_9 = 0;
                                                                    try {
                                                                        v5 = var11_8;
                                                                        v6 = 2;
                                                                        if (var10_7 != 0) break block46;
                                                                        if (v5 != v6) break block47;
                                                                    }
                                                                    catch (oov v7) {
                                                                        throw _he.a(v7);
                                                                    }
                                                                    var12_9 = 180;
                                                                }
                                                                v5 = var11_8;
                                                                v6 = 3;
                                                            }
                                                            try {
                                                                if (var10_7 != 0) break block48;
                                                                if (v5 != v6) break block49;
                                                            }
                                                            catch (oov v8) {
                                                                throw _he.a(v8);
                                                            }
                                                            var12_9 = 0;
                                                        }
                                                        v5 = var11_8;
                                                        v6 = 4;
                                                    }
                                                    try {
                                                        if (var10_7 != 0) break block50;
                                                        if (v5 != v6) break block51;
                                                    }
                                                    catch (oov v9) {
                                                        throw _he.a(v9);
                                                    }
                                                    var12_9 = 90;
                                                }
                                                try {
                                                    v5 = var11_8;
                                                    if (var10_7 != 0) break block52;
                                                    v6 = 5;
                                                }
                                                catch (oov v10) {
                                                    throw _he.a(v10);
                                                }
                                            }
                                            if (v5 == v6) {
                                                var12_9 = -90;
                                            }
                                            v5 = var12_9;
                                        }
                                        hzu.a2h(v5, 0.0f, 1.0f, 0.0f);
                                        hzu.a4k(-0.5f, -0.5f, -0.5f);
                                        var13_10 = var1_1.p4f + (var1_1.bmi - var1_1.p4f) * var8_5;
                                        var13_10 = 1.0f - var13_10;
                                        var13_10 = 1.0f - var13_10 * var13_10 * var13_10;
                                        try {
                                            try {
                                                this.uml.e0v.pod = -(var13_10 * 3.1415927f / 2.0f);
                                                v11 = kgt.qt1.klu();
                                                if (var10_7 != 0) break block53;
                                                if (v11 == 0) break block54;
                                            }
                                            catch (oov v12) {
                                                throw _he.a(v12);
                                            }
                                            v11 = vvu.exr.d7c().booleanValue();
                                        }
                                        catch (oov v13) {
                                            throw _he.a(v13);
                                        }
                                    }
                                    try {
                                        if (var10_7 != 0) break block55;
                                        if (v11 == 0) break block54;
                                    }
                                    catch (oov v14) {
                                        throw _he.a(v14);
                                    }
                                    v11 = 1;
                                    break block55;
                                }
                                v11 = 0;
                            }
                            var14_11 = v11;
                            try {
                                try {
                                    v15 = var14_11;
                                    if (var10_7 != 0) break block56;
                                    if (v15 != 0) {
                                    }
                                    ** GOTO lbl174
                                }
                                catch (oov v16) {
                                    throw _he.a(v16);
                                }
                                v15 = var1_1.g8i();
                            }
                            catch (oov v17) {
                                throw _he.a(v17);
                            }
                        }
                        try {
                            try {
                                if (var10_7 != 0) break block57;
                                if (v15 != 0) {
                                }
                                ** GOTO lbl174
                            }
                            catch (oov v18) {
                                throw _he.a(v18);
                            }
                            this.uml.znj();
                            iyr.itn();
                            this.uml.znj();
                            iyr.e3_();
                            this.uml.znj();
                            iyr.xby();
                            v15 = new Color(26, 129, 112).getRGB();
                        }
                        catch (oov v19) {
                            throw _he.a(v19);
                        }
                    }
                    try {
                        iyr.zt6(v15);
                        this.uml.znj();
                        iyr._nz();
                        if (var10_7 == 0) break block58;
lbl174:
                        // 3 sources

                        this.uml.znj();
                    }
                    catch (oov v20) {
                        throw _he.a(v20);
                    }
                }
                try {
                    try {
                        hzu.eiq();
                        hzu.x3w();
                        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                        v21 = var9_6;
                        if (var10_7 != 0) break block59;
                        if (v21 < 0) break block60;
                    }
                    catch (oov v22) {
                        throw _he.a(v22);
                    }
                    hzu.ah8(5890);
                    hzu.x3w();
                    v21 = 5888;
                }
                catch (oov v23) {
                    throw _he.a(v23);
                }
            }
            hzu.ah8(v21);
        }
    }

    @Override
    public void _ny(pyk pyk2, double d, double d2, double d3, float f, int n) {
        this.qhm((TileEntityEnderChest)pyk2, d, d2, d3, f, n);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(8747258586234049L, 844699934658258483L, MethodHandles.lookup().lookupClass()).a(269189338465079L) ^ 0x1148DECCA2F6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0011\u00a9\u001d\u008c\u0002\u00cc\u00ceB\u0003G\u0011Q\u00c4\u00ce\u0013\u0099v\u00cb\u00fb\u00bc\u0005\u00e4\u009b\u0094\u00bd\u0005\u001fj4I\u00far".getBytes("ISO-8859-1"));
                String string = _he.b(byArray3).intern();
                rcu = new gdz(string);
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

