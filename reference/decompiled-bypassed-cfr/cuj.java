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

public class cuj
extends gyu {
    private cdu ieo = new m1q(ox_._q8.l4i().zvi(x4j.lke, (Comparable)((Object)x4j$y3_.i43)), 9);
    private lkp nej = new lkp(false);
    private int at4 = 0;
    private int q0s = 1;
    private int qfg = 2;
    private int m6l = this.at4;
    private static final long a = c.a(-4152919345722601430L, -2178286152605778131L, MethodHandles.lookup().lookupClass()).a(165170057543597L);
    private static final String f;

    public cuj(int n, boolean bl) {
        super(n);
        if (bl) {
            this.dmv.c10 = 3;
            this.m6l = this.q0s;
        }
    }

    @Override
    public e9q jk9(Random random) {
        e9q e9q2;
        try {
            e9q2 = random.nextInt(3) > 0 ? this.nej : super.jk9(random);
        }
        catch (oov oov2) {
            throw cuj.a(oov2);
        }
        return e9q2;
    }

    @Override
    public void u0r(t9d t9d2, Random random, mew mew2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        block8: {
            super.u0r(t9d2, random, mew2);
            n5 = 3 + random.nextInt(6);
            n4 = 0;
            n3 = t9d.b();
            while (n4 < n5) {
                block9: {
                    block10: {
                        n2 = random.nextInt(16);
                        n = random.nextInt(28) + 4;
                        int n6 = random.nextInt(16);
                        mew mew3 = mew2.ec4(n2, n, n6);
                        try {
                            try {
                                try {
                                    if (n3 == 0) break block8;
                                    if (n3 == 0) break block9;
                                }
                                catch (oov oov2) {
                                    throw cuj.a(oov2);
                                }
                                if (t9d2.getBlockState(mew3).r_y() != ox_.pu8) break block10;
                            }
                            catch (oov oov3) {
                                throw cuj.a(oov3);
                            }
                            t9d2.vct(mew3, ox_.aiy.l4i(), 2);
                        }
                        catch (oov oov4) {
                            throw cuj.a(oov4);
                        }
                    }
                    ++n4;
                }
                if (n3 != 0) continue;
            }
            n5 = 0;
        }
        while (n5 < 7) {
            n4 = random.nextInt(16);
            n2 = random.nextInt(64);
            n = random.nextInt(16);
            this.ieo.v3g(t9d2, random, mew2.ec4(n4, n2, n));
            ++n5;
            if (n3 != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void rci(t9d var1_1, Random var2_2, lno var3_3, int var4_4, int var5_5, double var6_6) {
        block30: {
            block28: {
                block29: {
                    block26: {
                        block24: {
                            this.ke4 = ox_.l11.l4i();
                            this.kro = ox_.kqk.l4i();
                            var8_7 = t9d.b();
                            try {
                                block25: {
                                    try {
                                        try {
                                            try {
                                                cfr_temp_0 = var6_6 - -1.0;
                                                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                if (var8_7 == 0) break block24;
                                                if (v0 < 0) break block25;
                                            }
                                            catch (oov v1) {
                                                throw cuj.a(v1);
                                            }
                                            cfr_temp_1 = var6_6 - 2.0;
                                            v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                            if (var8_7 == 0) break block26;
                                        }
                                        catch (oov v2) {
                                            throw cuj.a(v2);
                                        }
                                        if (v0 > 0) {
                                        }
                                        ** GOTO lbl46
                                    }
                                    catch (oov v3) {
                                        throw cuj.a(v3);
                                    }
                                }
                                v0 = this.m6l;
                            }
                            catch (oov v4) {
                                throw cuj.a(v4);
                            }
                        }
                        try {
                            block27: {
                                try {
                                    try {
                                        if (var8_7 == 0) break block26;
                                        if (v0 != this.qfg) break block27;
                                    }
                                    catch (oov v5) {
                                        throw cuj.a(v5);
                                    }
                                    this.ke4 = ox_.bqn.l4i();
                                    this.kro = ox_.bqn.l4i();
                                    if (var8_7 != 0) break block28;
                                }
                                catch (oov v6) {
                                    throw cuj.a(v6);
                                }
                            }
                            v0 = (cfr_temp_2 = var6_6 - 1.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (oov v7) {
                            throw cuj.a(v7);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var8_7 == 0) break block29;
                                if (v0 <= 0) break block28;
                            }
                            catch (oov v8) {
                                throw cuj.a(v8);
                            }
                            v9 = this;
                            if (var8_7 == 0) break block30;
                        }
                        catch (oov v10) {
                            throw cuj.a(v10);
                        }
                        v0 = v9.m6l;
                    }
                    catch (oov v11) {
                        throw cuj.a(v11);
                    }
                }
                try {
                    if (v0 != this.q0s) {
                        this.ke4 = ox_.pu8.l4i();
                        this.kro = ox_.pu8.l4i();
                    }
                }
                catch (oov v12) {
                    throw cuj.a(v12);
                }
            }
            v9 = this;
        }
        v9.mj9(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
    }

    private cuj csi(gyu gyu2) {
        long l = a ^ 0x1DEE47A51C55L;
        this.m6l = this.qfg;
        this.cq8(gyu2.np2, true);
        this.cb4(gyu2.jcq + f);
        this.wzy(new gyu$ekk(gyu2.f6x, gyu2.yeh));
        this.j10(gyu2.rm7, gyu2.plx);
        return this;
    }

    @Override
    public gyu hiq(int n) {
        return new cuj(n, false).csi(this);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x224F6625EDFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d8DFi\u00bb%\u00a5\u00fc".getBytes("ISO-8859-1"));
                f = cuj.b(byArray3).intern();
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

