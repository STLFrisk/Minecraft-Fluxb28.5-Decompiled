/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dfh
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x644426F38561L;
        return dfh.b("t", (int)9463, (long)(0x448D2E191FBBB1D5L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x6ABA6564D9E7L;
        return dfh.b("t", (int)30661, (long)(0x554CA967B7B9BE6CL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block98: {
            block97: {
                block87: {
                    block88: {
                        block86: {
                            block85: {
                                block84: {
                                    block83: {
                                        block82: {
                                            block80: {
                                                block81: {
                                                    var3_3 = dfh.a ^ 105860663242788L;
                                                    var5_4 = t9d.c();
                                                    try {
                                                        if (var2_2.length < 9) {
                                                            throw new w57((String)dfh.b("t", (int)8274, (long)(2217427101419913276L ^ var3_3)), new Object[0]);
                                                        }
                                                    }
                                                    catch (oov v0) {
                                                        throw dfh.a(v0);
                                                    }
                                                    var1_1.io9(n_k$pbp.f1s, 0);
                                                    var6_5 = dfh.tiq(var1_1, var2_2, 0, false);
                                                    var7_6 = dfh.tiq(var1_1, var2_2, 3, false);
                                                    var8_7 = dfh.tiq(var1_1, var2_2, 6, false);
                                                    var9_8 = new yve(var6_5, var7_6);
                                                    var10_9 = new yve(var8_7, var8_7.m2c(var9_8.mtu()));
                                                    var11_10 = var9_8.num() * var9_8.v8b() * var9_8.ut6();
                                                    try {
                                                        try {
                                                            v1 = var11_10;
                                                            if (var5_4 != 0) break block80;
                                                            if (v1 > 524288) {
                                                            }
                                                            break block81;
                                                        }
                                                        catch (oov v2) {
                                                            throw dfh.a(v2);
                                                        }
                                                        v3 = new Object[2];
                                                        v3[0] = var11_10;
                                                        v3[1] = 524288;
                                                        throw new uvb((String)dfh.b("t", (int)28767, (long)(8865399907455799348L ^ var3_3)), v3);
                                                    }
                                                    catch (oov v4) {
                                                        throw dfh.a(v4);
                                                    }
                                                }
                                                v1 = var9_8._3o;
                                            }
                                            try {
                                                try {
                                                    if (var5_4 != 0) break block82;
                                                    if (v1 >= 0) {
                                                    }
                                                    ** GOTO lbl264
                                                }
                                                catch (oov v5) {
                                                    throw dfh.a(v5);
                                                }
                                                v1 = var9_8.ixv;
                                            }
                                            catch (oov v6) {
                                                throw dfh.a(v6);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var5_4 != 0) break block83;
                                                if (v1 < 256) {
                                                }
                                                ** GOTO lbl264
                                            }
                                            catch (oov v7) {
                                                throw dfh.a(v7);
                                            }
                                            v1 = var10_9._3o;
                                        }
                                        catch (oov v8) {
                                            throw dfh.a(v8);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var5_4 != 0) break block84;
                                            if (v1 >= 0) {
                                            }
                                            ** GOTO lbl264
                                        }
                                        catch (oov v9) {
                                            throw dfh.a(v9);
                                        }
                                        v1 = var10_9.ixv;
                                    }
                                    catch (oov v10) {
                                        throw dfh.a(v10);
                                    }
                                }
                                if (v1 >= 256) ** GOTO lbl264
                                var12_11 = var1_1.qha();
                                try {
                                    try {
                                        v11 = var12_11.zz0(var9_8);
                                        if (var5_4 != 0) break block85;
                                        if (v11) {
                                        }
                                        ** GOTO lbl257
                                    }
                                    catch (oov v12) {
                                        throw dfh.a(v12);
                                    }
                                    v11 = var12_11.zz0(var10_9);
                                }
                                catch (oov v13) {
                                    throw dfh.a(v13);
                                }
                            }
                            try {
                                if (var5_4 != 0) break block86;
                                if (v11) {
                                }
                                ** GOTO lbl257
                            }
                            catch (oov v14) {
                                throw dfh.a(v14);
                            }
                            v11 = false;
                        }
                        var13_12 = v11;
                        try {
                            try {
                                try {
                                    v15 = var2_2.length;
                                    if (var5_4 != 0) break block87;
                                    if (v15 <= 9) break block88;
                                }
                                catch (oov v16) {
                                    throw dfh.a(v16);
                                }
                                v15 = (int)var2_2[9].equals(dfh.b("t", (int)12662, (long)(8489037712257011999L ^ var3_3)));
                                if (var5_4 != 0) break block87;
                            }
                            catch (oov v17) {
                                throw dfh.a(v17);
                            }
                            if (v15 == 0) break block88;
                        }
                        catch (oov v18) {
                            throw dfh.a(v18);
                        }
                        var13_12 = true;
                    }
                    v15 = 0;
                }
                var11_10 = v15;
                var14_13 = new mew(var10_9.gdj - var9_8.gdj, var10_9._3o - var9_8._3o, var10_9.ob0 - var9_8.ob0);
                var15_14 = new mew$mix();
                var16_15 = new mew$mix();
                var17_16 = var9_8.ob0;
                block54: while (true) {
                    v19 = var17_16;
                    block55: while (v19 <= var9_8.nwc) {
                        var18_17 = var9_8._3o;
                        block56: while (true) {
                            v20 = var18_17;
                            block57: while (v20 <= var9_8.ixv) {
                                v19 = var9_8.gdj;
                                if (var5_4 != 0) continue block55;
                                var19_18 = v19;
                                while (var19_18 <= var9_8.kwp) {
                                    block96: {
                                        block91: {
                                            block100: {
                                                block99: {
                                                    block95: {
                                                        block92: {
                                                            block94: {
                                                                block93: {
                                                                    block90: {
                                                                        var15_14.bj0(var19_18, var18_17, var17_16);
                                                                        var16_15.bj0(var19_18 + var14_13.getX(), var18_17 + var14_13.getY(), var17_16 + var14_13.getZ());
                                                                        var20_19 = false;
                                                                        var21_20 = var12_11.getBlockState(var15_14);
                                                                        v20 = (int)var13_12;
                                                                        if (var5_4 != 0) continue block57;
                                                                        try {
                                                                            block89: {
                                                                                try {
                                                                                    try {
                                                                                        if (v20 == 0) break block89;
                                                                                        v21 = var21_20;
                                                                                        if (var5_4 != 0) break block90;
                                                                                    }
                                                                                    catch (oov v22) {
                                                                                        throw dfh.a(v22);
                                                                                    }
                                                                                    if (v21.r_y() == ox_.ibw) break block91;
                                                                                }
                                                                                catch (oov v23) {
                                                                                    throw dfh.a(v23);
                                                                                }
                                                                            }
                                                                            v21 = var21_20;
                                                                        }
                                                                        catch (oov v24) {
                                                                            throw dfh.a(v24);
                                                                        }
                                                                    }
                                                                    if (v21 != var12_11.getBlockState(var16_15)) break block99;
                                                                    var22_21 = var12_11.getTileEntity(var15_14);
                                                                    var23_22 = var12_11.getTileEntity(var16_15);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v25 = var22_21;
                                                                                if (var5_4 != 0) break block92;
                                                                                if (v25 != null) {
                                                                                }
                                                                                ** GOTO lbl219
                                                                            }
                                                                            catch (oov v26) {
                                                                                throw dfh.a(v26);
                                                                            }
                                                                            v25 = var23_22;
                                                                            if (var5_4 != 0) break block92;
                                                                        }
                                                                        catch (oov v27) {
                                                                            throw dfh.a(v27);
                                                                        }
                                                                        if (v25 != null) {
                                                                        }
                                                                        ** GOTO lbl219
                                                                    }
                                                                    catch (oov v28) {
                                                                        throw dfh.a(v28);
                                                                    }
                                                                    var24_23 = new bdo();
                                                                    var22_21.m2a(var24_23);
                                                                    var24_23.bkn("x");
                                                                    var24_23.bkn("y");
                                                                    var24_23.bkn("z");
                                                                    var25_24 = new bdo();
                                                                    try {
                                                                        var23_22.m2a(var25_24);
                                                                        var25_24.bkn("x");
                                                                        var25_24.bkn("y");
                                                                        var25_24.bkn("z");
                                                                        v29 = var24_23.equals(var25_24);
                                                                        if (var5_4 != 0) break block93;
                                                                        if (v29) break block94;
                                                                    }
                                                                    catch (oov v30) {
                                                                        throw dfh.a(v30);
                                                                    }
                                                                    v29 = true;
                                                                }
                                                                var20_19 = v29;
                                                            }
                                                            try {
                                                                if (var5_4 == 0) break block95;
lbl219:
                                                                // 3 sources

                                                                v25 = var22_21;
                                                            }
                                                            catch (oov v31) {
                                                                throw dfh.a(v31);
                                                            }
                                                        }
                                                        if (v25 != null) {
                                                            var20_19 = true;
                                                        }
                                                    }
                                                    if (var5_4 == 0) break block100;
                                                }
                                                var20_19 = true;
                                            }
                                            try {
                                                try {
                                                    ++var11_10;
                                                    if (var5_4 != 0) break block96;
                                                    if (var20_19) {
                                                    }
                                                    break block91;
                                                }
                                                catch (oov v32) {
                                                    throw dfh.a(v32);
                                                }
                                                throw new uvb((String)dfh.b("t", (int)22509, (long)(1593933515264374664L ^ var3_3)), new Object[0]);
                                            }
                                            catch (oov v33) {
                                                throw dfh.a(v33);
                                            }
                                        }
                                        ++var19_18;
                                    }
                                    if (var5_4 == 0) continue;
                                }
                                ++var18_17;
                                if (var5_4 == 0) continue block56;
                            }
                            break;
                        }
                        ++var17_16;
                        if (var5_4 == 0) continue block54;
                    }
                    break;
                }
                try {
                    var1_1.io9(n_k$pbp.f1s, var11_10);
                    dfh.wxl(var1_1, this, (String)dfh.b("t", (int)13620, (long)(3881344058808718674L ^ var3_3)), new Object[]{var11_10});
                    if (var5_4 == 0) break block97;
lbl257:
                    // 3 sources

                    throw new uvb((String)dfh.b("t", (int)18846, (long)(1703473184361163249L ^ var3_3)), new Object[0]);
                }
                catch (oov v34) {
                    throw dfh.a(v34);
                }
            }
            try {
                if (var5_4 == 0) break block98;
lbl264:
                // 5 sources

                throw new uvb((String)dfh.b("t", (int)23989, (long)(5056811693335494109L ^ var3_3)), new Object[0]);
            }
            catch (oov v35) {
                throw dfh.a(v35);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        String[] stringArray2;
        List list;
        long l;
        block33: {
            int n;
            int n2;
            block31: {
                int n3;
                block32: {
                    block29: {
                        block30: {
                            block28: {
                                block26: {
                                    block27: {
                                        l = a ^ 0x4CB1197F2DD4L;
                                        n3 = t9d.c();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n2 = stringArray.length;
                                                        if (n3 != 0) break block26;
                                                        if (n2 <= 0) break block27;
                                                    }
                                                    catch (oov oov2) {
                                                        throw dfh.a(oov2);
                                                    }
                                                    n2 = stringArray.length;
                                                    n = 3;
                                                    if (n3 != 0) break block28;
                                                }
                                                catch (oov oov3) {
                                                    throw dfh.a(oov3);
                                                }
                                                if (n2 > n) break block27;
                                            }
                                            catch (oov oov4) {
                                                throw dfh.a(oov4);
                                            }
                                            list = dfh.aqt(stringArray, 0, mew2);
                                            return list;
                                        }
                                        catch (oov oov5) {
                                            throw dfh.a(oov5);
                                        }
                                    }
                                    n2 = stringArray.length;
                                }
                                n = 3;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (n3 != 0) break block29;
                                            if (n2 <= n) break block30;
                                        }
                                        catch (oov oov6) {
                                            throw dfh.a(oov6);
                                        }
                                        n2 = stringArray.length;
                                        n = 6;
                                        if (n3 != 0) break block29;
                                    }
                                    catch (oov oov7) {
                                        throw dfh.a(oov7);
                                    }
                                    if (n2 > n) break block30;
                                }
                                catch (oov oov8) {
                                    throw dfh.a(oov8);
                                }
                                list = dfh.aqt(stringArray, 3, mew2);
                                return list;
                            }
                            catch (oov oov9) {
                                throw dfh.a(oov9);
                            }
                        }
                        n2 = stringArray.length;
                        n = 6;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (n3 != 0) break block31;
                                    if (n2 <= n) break block32;
                                }
                                catch (oov oov10) {
                                    throw dfh.a(oov10);
                                }
                                n2 = stringArray.length;
                                n = 9;
                                if (n3 != 0) break block31;
                            }
                            catch (oov oov11) {
                                throw dfh.a(oov11);
                            }
                            if (n2 > n) break block32;
                        }
                        catch (oov oov12) {
                            throw dfh.a(oov12);
                        }
                        list = dfh.aqt(stringArray, 6, mew2);
                        return list;
                    }
                    catch (oov oov13) {
                        throw dfh.a(oov13);
                    }
                }
                try {
                    stringArray2 = stringArray;
                    if (n3 != 0) break block33;
                    n2 = stringArray2.length;
                    n = 10;
                }
                catch (oov oov14) {
                    throw dfh.a(oov14);
                }
            }
            if (n2 != n) return null;
            stringArray2 = stringArray;
        }
        String[] stringArray3 = new String[2];
        stringArray3[0] = dfh.b("t", (int)5826, (long)(0x35E9074CB371AB5FL ^ l));
        stringArray3[1] = dfh.b("t", (int)3890, (long)(0x53C89DA71A0B32AEL ^ l));
        list = dfh.cqo(stringArray2, stringArray3);
        return list;
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

                dfh.a = c.a(-6452998973030517638L, -7990098659924062739L, MethodHandles.lookup().lookupClass()).a(203989289781091L);
                dfh.h = new HashMap<K, V>(13);
                var0 = dfh.a ^ 39041190053660L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "3\u00c4\u00ab\u00a4\u00f54\u0018\u001a\t\u00c6*\u00c8\r\u00af\u00b3\u00df\u00d1\f\u00d7\u00ee\u00a6\u00bdB\u009b\u00ec\u00b4\u0081\u00f6\u007f\u00e3\u0015{1\u00d1r\u0080\u00e6t\u00a0yT\u00d2\u001e,\u008f\u008b[\u0087\u0001k\u00b6\u009a\u00b1\u0083]\u009e(\\\u00fc\u00eb\u00ca\u009f\u001a'a\u00d5\u00ae\u00c8g\u00ba\u0097<G\u00b6\u00b8R\u00b6\u00fa\u00a1\u00fe\u0000<A\u009f\u00d9!x\u00006\u00f0\u00e7C\u00f5\u00a0\u001c`\u0098\u0010\u00c6\u00a9\u0097\u00eaP\u00be\u0013\u0086s\u00c6\u00b0\u00e8\u00e9\u009ew\u00b6\u0010QB\u00a5\u00d2\u009f~R\u00b4\u00b5\u00cc\u00d5L\u00d4\u00eeC;0k\u008eSH\u00a3F\u00e7\\\u0082\u00eew\u008e\u000b`\u00876\u0012k\u00c6\u009eI\u000b\u00e3\u0084\u008eG\u00c9\u00f5\u00bc\u008a\u00e3Gg\\\u0098K^a\f\u00fdpX<Am{\u0016\u000f(\u0087B\u00f7\u00e0n\u000f\b\u00e9s\u008a\u00ce\u00edk]\u009e\u00daR[\u000fI\u00ac\u000f\u0097\u00f5X\u0006.\u0014\u00c3Q\u0016L\u009cw[a\u00c9H1E\u0010\u00e1\u00e3\u0086\u0004We\u00e8\u00f6=f\u00eb\b R\u00e2\u00168\u00eds\u0002ksH\u00b5\u00e2\u008e\u00bd\u00b5K\u00cc\u00b0C\u0012X\u0015)\u00b7\u001b\u0086\u0082\u00fa\u00fa\u00f1,zj\u0086\u009aI\u00bc\u00b8\nZ\u00fbV\u00af\u0003\u0081L\u0082MI)\u00f5\u0094]n\u0084g\u0085\r\\\u009d\u0018\u00ea\u0012\u0014\u009aq\u008f\u00aa\u009cL\u009eA\u0085\u00ce\u001c\u00d5\u001c_\u00de \u00eaC\u00faI\u00cd";
                var8_6 = "3\u00c4\u00ab\u00a4\u00f54\u0018\u001a\t\u00c6*\u00c8\r\u00af\u00b3\u00df\u00d1\f\u00d7\u00ee\u00a6\u00bdB\u009b\u00ec\u00b4\u0081\u00f6\u007f\u00e3\u0015{1\u00d1r\u0080\u00e6t\u00a0yT\u00d2\u001e,\u008f\u008b[\u0087\u0001k\u00b6\u009a\u00b1\u0083]\u009e(\\\u00fc\u00eb\u00ca\u009f\u001a'a\u00d5\u00ae\u00c8g\u00ba\u0097<G\u00b6\u00b8R\u00b6\u00fa\u00a1\u00fe\u0000<A\u009f\u00d9!x\u00006\u00f0\u00e7C\u00f5\u00a0\u001c`\u0098\u0010\u00c6\u00a9\u0097\u00eaP\u00be\u0013\u0086s\u00c6\u00b0\u00e8\u00e9\u009ew\u00b6\u0010QB\u00a5\u00d2\u009f~R\u00b4\u00b5\u00cc\u00d5L\u00d4\u00eeC;0k\u008eSH\u00a3F\u00e7\\\u0082\u00eew\u008e\u000b`\u00876\u0012k\u00c6\u009eI\u000b\u00e3\u0084\u008eG\u00c9\u00f5\u00bc\u008a\u00e3Gg\\\u0098K^a\f\u00fdpX<Am{\u0016\u000f(\u0087B\u00f7\u00e0n\u000f\b\u00e9s\u008a\u00ce\u00edk]\u009e\u00daR[\u000fI\u00ac\u000f\u0097\u00f5X\u0006.\u0014\u00c3Q\u0016L\u009cw[a\u00c9H1E\u0010\u00e1\u00e3\u0086\u0004We\u00e8\u00f6=f\u00eb\b R\u00e2\u00168\u00eds\u0002ksH\u00b5\u00e2\u008e\u00bd\u00b5K\u00cc\u00b0C\u0012X\u0015)\u00b7\u001b\u0086\u0082\u00fa\u00fa\u00f1,zj\u0086\u009aI\u00bc\u00b8\nZ\u00fbV\u00af\u0003\u0081L\u0082MI)\u00f5\u0094]n\u0084g\u0085\r\\\u009d\u0018\u00ea\u0012\u0014\u009aq\u008f\u00aa\u009cL\u009eA\u0085\u00ce\u001c\u00d5\u001c_\u00de \u00eaC\u00faI\u00cd".length();
                var5_7 = 56;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dfh.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e3\u00b7\u00f78cX\u00a4\u0018k.\u0096\u00f1\u00f2\u007fr\u00c4\u00c6\u00f4\u0087\u00e2\u00d5\u00fbTK\u00f8\u00bc5\u009e\u00f6\u001a\u00a5_X\u00de\u00efg\u0088C\u00b6F\u00d1\u00d4\u0088\u00d6\u0085\u00f3\"\u00b0(X\u00cf\u00815\u00fc]OO\u0002\u00da\u00d9\u00b1$\u00ecx0\u0082\b@\u008e\u00b17\u0085\u0016\u00f5\u00d1+\u00e7jrr\u00bf\u0098U\u00efZ\u0098\u00e3\u00ef\u00d0";
                    var8_6 = "\u00e3\u00b7\u00f78cX\u00a4\u0018k.\u0096\u00f1\u00f2\u007fr\u00c4\u00c6\u00f4\u0087\u00e2\u00d5\u00fbTK\u00f8\u00bc5\u009e\u00f6\u001a\u00a5_X\u00de\u00efg\u0088C\u00b6F\u00d1\u00d4\u0088\u00d6\u0085\u00f3\"\u00b0(X\u00cf\u00815\u00fc]OO\u0002\u00da\u00d9\u00b1$\u00ecx0\u0082\b@\u008e\u00b17\u0085\u0016\u00f5\u00d1+\u00e7jrr\u00bf\u0098U\u00efZ\u0098\u00e3\u00ef\u00d0".length();
                    var5_7 = 48;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dfh.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        dfh.c = var9_3;
        dfh.g = new String[11];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C31;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dfh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            dfh.g[n2] = dfh.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dfh.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dfh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dfh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

