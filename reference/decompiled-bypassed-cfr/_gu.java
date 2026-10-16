/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class _gu
implements oza,
e76 {
    private static final /* synthetic */ Logger x7e;
    private /* synthetic */ Map _z3;
    private /* synthetic */ Set a27;
    private final /* synthetic */ File ukg;
    private /* synthetic */ boolean cy7;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public _gu(File file) {
        this._z3 = new ConcurrentHashMap();
        this.a27 = Collections.newSetFromMap(new ConcurrentHashMap());
        this.cy7 = false;
        this.ukg = file;
    }

    @Override
    public tts mx5(t9d t9d2, int n, int n2) {
        h2f h2f2 = new h2f(n, n2);
        bdo bdo2 = (bdo)this._z3.get(h2f2);
        int n3 = t9d.b();
        if (bdo2 == null) {
            DataInputStream dataInputStream;
            block5: {
                DataInputStream dataInputStream2;
                block6: {
                    dataInputStream2 = bfw.p1f(this.ukg, n, n2);
                    try {
                        try {
                            dataInputStream = dataInputStream2;
                            if (n3 == 0) break block5;
                            if (dataInputStream != null) break block6;
                        }
                        catch (oov oov2) {
                            throw _gu.a(oov2);
                        }
                        return null;
                    }
                    catch (oov oov3) {
                        throw _gu.a(oov3);
                    }
                }
                dataInputStream = dataInputStream2;
            }
            bdo2 = g62.za6(dataInputStream);
        }
        return this.cik(t9d2, n, n2, bdo2);
    }

    public tts cik(t9d t9d2, int n, int n2, bdo bdo2) {
        tts tts2;
        block17: {
            tts tts3;
            block18: {
                bdo bdo3;
                int n3;
                long l;
                block16: {
                    block15: {
                        CallSite callSite;
                        bdo bdo4;
                        block13: {
                            block14: {
                                l = a ^ 0x3F374698BA8BL;
                                n3 = t9d.b();
                                try {
                                    try {
                                        bdo4 = bdo2;
                                        callSite = _gu.a("h", (int)14817, (long)(0x1A28FB39F427D472L ^ l));
                                        if (n3 == 0) break block13;
                                        if (!bdo4.inh((String)((Object)callSite), 10)) {
                                        }
                                        break block14;
                                    }
                                    catch (oov oov2) {
                                        throw _gu.a(oov2);
                                    }
                                    x7e.error((String)((Object)_gu.a("h", (int)11163, (long)(0x6824F71C79DA462EL ^ l))) + n + "," + n2 + (String)((Object)_gu.a("h", (int)15375, (long)(0x2E8BFCE22D69D194L ^ l))));
                                    return null;
                                }
                                catch (oov oov3) {
                                    throw _gu.a(oov3);
                                }
                            }
                            bdo4 = bdo2;
                            callSite = _gu.a("h", (int)9045, (long)(0xC76B64BFD70CEFEL ^ l));
                        }
                        bdo3 = bdo4.b__((String)((Object)callSite));
                        try {
                            try {
                                if (n3 == 0) break block15;
                                if (!bdo3.inh((String)((Object)_gu.a("h", (int)30108, (long)(0x14894C4DA7451831L ^ l))), 9)) {
                                }
                                break block16;
                            }
                            catch (oov oov4) {
                                throw _gu.a(oov4);
                            }
                            x7e.error((String)((Object)_gu.a("h", (int)21539, (long)(0x6E4BF317BA07B98CL ^ l))) + n + "," + n2 + (String)((Object)_gu.a("h", (int)7419, (long)(0x9472873A029F151L ^ l))));
                        }
                        catch (oov oov5) {
                            throw _gu.a(oov5);
                        }
                    }
                    return null;
                }
                tts3 = this.lrf(t9d2, bdo3);
                try {
                    tts2 = tts3;
                    if (n3 == 0) break block17;
                    if (!tts2.bkm(n, n2)) {
                    }
                    break block18;
                }
                catch (oov oov6) {
                    throw _gu.a(oov6);
                }
                x7e.error((String)((Object)_gu.a("h", (int)21539, (long)(0x6E4BF317BA07B98CL ^ l))) + n + "," + n2 + (String)((Object)_gu.a("h", (int)1469, (long)(0x62057F561EAF680DL ^ l))) + n + (String)((Object)_gu.a("h", (int)17721, (long)(0x2FDF3D759014A8A9L ^ l))) + n2 + (String)((Object)_gu.a("h", (int)17035, (long)(0x7D18EF22377FAF3AL ^ l))) + tts3.nzx + (String)((Object)_gu.a("h", (int)11861, (long)(0x2B8403533283C3F2L ^ l))) + tts3.yxl + ")");
                bdo3.iin((String)((Object)_gu.a("h", (int)29874, (long)(0x1C311D6BF3B81923L ^ l))), n);
                bdo3.iin((String)((Object)_gu.a("h", (int)23857, (long)(0x8B6475DE89E30ACL ^ l))), n2);
                tts3 = this.lrf(t9d2, bdo3);
            }
            tts2 = tts3;
        }
        return tts2;
    }

    @Override
    public void _2n(t9d t9d2, tts tts2) {
        long l = a ^ 0x10A634A9D0DEL;
        t9d2.f_u();
        try {
            bdo bdo2 = new bdo();
            bdo bdo3 = new bdo();
            bdo2.rzm((String)((Object)_gu.a("h", (int)9045, (long)(0xC7699DA8F41A4ABL ^ l))), bdo3);
            this.noo(tts2, t9d2, bdo3);
            this.xn6(tts2.iu_(), bdo2);
        }
        catch (Exception exception) {
            x7e.error((String)((Object)_gu.a("h", (int)27041, (long)(0x4837B9CA80DA6E43L ^ l))), (Throwable)exception);
        }
    }

    public void xn6(h2f h2f2, bdo bdo2) {
        block4: {
            int n = t9d.b();
            try {
                Object object;
                try {
                    object = this.a27;
                    if (n == 0 || object.contains(h2f2)) break block4;
                }
                catch (oov oov2) {
                    throw _gu.a(oov2);
                }
                object = this._z3.put(h2f2, bdo2);
            }
            catch (oov oov3) {
                throw _gu.a(oov3);
            }
        }
        zt9.qxh().ifj(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public boolean vbg() {
        boolean bl;
        Map map;
        int n;
        long l;
        block15: {
            block16: {
                boolean bl2;
                block17: {
                    block18: {
                        block22: {
                            block21: {
                                l = a ^ 0x36CE225BF151L;
                                n = t9d.b();
                                map = this._z3;
                                if (n == 0) break block15;
                                if (!map.isEmpty()) break block16;
                                break block21;
                                catch (Exception exception) {
                                    throw _gu.a(exception);
                                }
                            }
                            bl2 = this.cy7;
                            if (n == 0) break block17;
                            break block22;
                            catch (Exception exception) {
                                throw _gu.a(exception);
                            }
                        }
                        try {
                            block23: {
                                if (!bl2) break block18;
                                break block23;
                                catch (Exception exception) {
                                    throw _gu.a(exception);
                                }
                            }
                            x7e.info((String)((Object)_gu.a("h", (int)31218, (long)(0x585E7AF8D3645F8CL ^ l))), new Object[]{this.ukg.getName()});
                        }
                        catch (Exception exception) {
                            throw _gu.a(exception);
                        }
                    }
                    bl2 = false;
                }
                return bl2;
            }
            map = this._z3.keySet().iterator().next();
        }
        h2f h2f2 = (h2f)((Object)map);
        try {
            block19: {
                this.a27.add(h2f2);
                bdo bdo2 = (bdo)this._z3.remove(h2f2);
                try {
                    if (n == 0 || bdo2 == null) break block19;
                }
                catch (Exception exception) {
                    throw _gu.a(exception);
                }
                try {
                    this.w2p(h2f2, bdo2);
                }
                catch (Exception exception) {
                    x7e.error((String)((Object)_gu.a("h", (int)30679, (long)(0x2D084FFFA6BC519FL ^ l))), (Throwable)exception);
                }
            }
            bl = true;
        }
        finally {
            this.a27.remove(h2f2);
        }
        return bl;
    }

    private void w2p(h2f h2f2, bdo bdo2) {
        DataOutputStream dataOutputStream = bfw.ay4(this.ukg, h2f2.jnd, h2f2.km5);
        g62.ehq(bdo2, dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void fq8(t9d t9d2, tts tts2) {
    }

    @Override
    public void w26() {
    }

    @Override
    public void kap() {
        try {
            this.cy7 = true;
            try {
                while (true) {
                    if (this.vbg()) continue;
                }
            }
            catch (oov oov2) {
                throw _gu.a(oov2);
            }
        }
        catch (Throwable throwable) {
            this.cy7 = false;
            throw throwable;
        }
    }

    /*
     * Exception decompiling
     */
    private void noo(tts var1_1, t9d var2_2, bdo var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [38[DOLOOP]], but top level block is 39[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private tts lrf(t9d var1_1, bdo var2_2) {
        block64: {
            block67: {
                block58: {
                    block60: {
                        block59: {
                            block57: {
                                block50: {
                                    block48: {
                                        block49: {
                                            var3_3 = _gu.a ^ 85766037618720L;
                                            var6_4 = var2_2.uz7((String)_gu.a("h", (int)361, (long)(3489835954878453354L ^ var3_3)));
                                            var7_5 = var2_2.uz7((String)_gu.a("h", (int)11781, (long)(8498658334554077492L ^ var3_3)));
                                            v0 = t9d.c();
                                            var8_6 = new tts(var1_1, var6_4, var7_5);
                                            var8_6.dsi(var2_2.hkr((String)_gu.a("h", (int)3846, (long)(3260169951597402123L ^ var3_3))));
                                            var8_6.exl(var2_2.dvl((String)_gu.a("h", (int)23675, (long)(4180985497086610252L ^ var3_3))));
                                            var5_7 = v0;
                                            var8_6.kbd(var2_2.dvl((String)_gu.a("h", (int)30264, (long)(5207944780302606639L ^ var3_3))));
                                            var8_6.tgk(var2_2.yn0((String)_gu.a("h", (int)26249, (long)(1203441755466101175L ^ var3_3))));
                                            var9_8 = var2_2.bzb((String)_gu.a("h", (int)1, (long)(3696132029837809461L ^ var3_3)), 10);
                                            var10_9 = 16;
                                            var11_10 = new k7x[var10_9];
                                            try {
                                                v1 = var1_1.vzz.qyc();
                                                if (var5_7 != 0) break block48;
                                                if (v1) break block49;
                                            }
                                            catch (oov v2) {
                                                throw _gu.a(v2);
                                            }
                                            v1 = true;
                                            break block48;
                                        }
                                        v1 = false;
                                    }
                                    var12_11 = v1;
                                    var13_12 = 0;
                                    while (var13_12 < var9_8.vek()) {
                                        block55: {
                                            block56: {
                                                var14_14 = var9_8.kd6(var13_12);
                                                var15_16 = var14_14.r_t("Y");
                                                var16_20 = new k7x(var15_16 << 4, var12_11);
                                                var17_22 = var14_14.waz((String)_gu.a("h", (int)1259, (long)(7600866461403812841L ^ var3_3)));
                                                v3 = new s46(var14_14.waz((String)_gu.a("h", (int)20613, (long)(6808560218110773144L ^ var3_3))));
                                                block37: while (true) {
                                                    block52: {
                                                        block51: {
                                                            var18_23 = v3;
                                                            v4 = var14_14.inh((String)_gu.a("h", (int)26102, (long)(965830820511544046L ^ var3_3)), 7);
                                                            if (var5_7 != 0) break block50;
                                                            try {
                                                                if (!v4) break block51;
                                                                v5 = new s46(var14_14.waz((String)_gu.a("h", (int)30450, (long)(3881908762481779179L ^ var3_3))));
                                                                break block52;
                                                            }
                                                            catch (oov v6) {
                                                                throw _gu.a(v6);
                                                            }
                                                        }
                                                        v5 = null;
                                                    }
                                                    var19_24 = v5;
                                                    var20_25 = new char[((byte[])var17_22).length];
                                                    for (var21_26 = 0; var21_26 < var20_25.length; ++var21_26) {
                                                        block70: {
                                                            block54: {
                                                                block53: {
                                                                    var22_27 = var21_26 & 15;
                                                                    var23_28 = var21_26 >> 8 & 15;
                                                                    var24_29 = var21_26 >> 4 & 15;
                                                                    v3 = var19_24;
                                                                    if (var5_7 != 0) continue block37;
                                                                    try {
                                                                        if (var5_7 != 0) break block53;
                                                                        if (v3 == null) break block54;
                                                                    }
                                                                    catch (oov v7) {
                                                                        throw _gu.a(v7);
                                                                    }
                                                                    v8 = var19_24;
                                                                }
                                                                v9 = v8.n3s(var22_27, var23_28, var24_29);
                                                                break block70;
                                                            }
                                                            v9 = 0;
                                                        }
                                                        var25_30 = v9;
                                                        var20_25[var21_26] = (char)(var25_30 << 12 | (var17_22[var21_26] & 255) << 4 | var18_23.n3s(var22_27, var23_28, var24_29));
                                                        if (var5_7 == 0) continue;
                                                    }
                                                    break;
                                                }
                                                try {
                                                    try {
                                                        var16_20.x5w(var20_25);
                                                        var16_20.cbu(new s46(var14_14.waz((String)_gu.a("h", (int)897, (long)(8585852440448767121L ^ var3_3)))));
                                                        if (var5_7 != 0) break block55;
                                                        if (var12_11) {
                                                        }
                                                        break block56;
                                                    }
                                                    catch (oov v10) {
                                                        throw _gu.a(v10);
                                                    }
                                                    var16_20.qr6(new s46(var14_14.waz((String)_gu.a("h", (int)20113, (long)(7492408736954341787L ^ var3_3)))));
                                                }
                                                catch (oov v11) {
                                                    throw _gu.a(v11);
                                                }
                                            }
                                            var16_20.cfs();
                                            var11_10[var15_16] = var16_20;
                                            ++var13_12;
                                        }
                                        if (var5_7 == 0) continue;
                                    }
                                    try {
                                        var8_6.i6f(var11_10);
                                        v12 = var2_2;
                                        v13 = _gu.a("h", (int)12017, (long)(2292178679434033602L ^ var3_3));
                                        v14 = 7;
                                        if (var5_7 != 0) break block57;
                                        v4 = v12.inh((String)v13, v14);
                                    }
                                    catch (oov v15) {
                                        throw _gu.a(v15);
                                    }
                                }
                                try {
                                    if (v4) {
                                        var8_6.f4w(var2_2.waz((String)_gu.a("h", (int)6626, (long)(3559570032603696869L ^ var3_3))));
                                    }
                                }
                                catch (oov v16) {
                                    throw _gu.a(v16);
                                }
                                v12 = var2_2;
                                v13 = _gu.a("h", (int)24587, (long)(5386210262761076506L ^ var3_3));
                                v14 = 10;
                            }
                            var13_13 = v12.bzb((String)v13, v14);
                            try {
                                v17 = var13_13;
                                if (var5_7 != 0) break block58;
                                if (v17 == null) break block59;
                            }
                            catch (oov v18) {
                                throw _gu.a(v18);
                            }
                            var14_15 = 0;
                            while (var14_15 < var13_13.vek()) {
                                block61: {
                                    v19 = var15_17 = var13_13.kd6(var14_15);
                                    if (var5_7 != 0) break block60;
                                    var16_20 = y65._lj(v19, var1_1);
                                    try {
                                        var8_6.m1b(true);
                                        if (var5_7 != 0) break block61;
                                        v20 = var16_20;
                                    }
                                    catch (oov v21) {
                                        throw _gu.a(v21);
                                    }
                                    block40: while (v20 != null) {
                                        var8_6._3_((i2h)var16_20);
                                        var17_22 = var16_20;
                                        var18_23 = var15_17;
                                        while (var18_23.inh((String)_gu.a("h", (int)18942, (long)(5508371921404747458L ^ var3_3)), 10)) {
                                            block62: {
                                                block63: {
                                                    v20 = var19_24 = y65._lj(var18_23.b__((String)_gu.a("h", (int)16222, (long)(8200617062251604076L ^ var3_3))), var1_1);
                                                    if (var5_7 != 0) continue block40;
                                                    try {
                                                        try {
                                                            if (var5_7 != 0) break block62;
                                                            if (v20 == null) break block63;
                                                        }
                                                        catch (oov v22) {
                                                            throw _gu.a(v22);
                                                        }
                                                        var8_6._3_((i2h)var19_24);
                                                        var17_22.nw9((i2h)var19_24);
                                                    }
                                                    catch (oov v23) {
                                                        throw _gu.a(v23);
                                                    }
                                                }
                                                v24 = var19_24;
                                            }
                                            var17_22 = v24;
                                            var18_23 = var18_23.b__((String)_gu.a("h", (int)16222, (long)(8200617062251604076L ^ var3_3)));
                                            if (var5_7 == 0) continue;
                                        }
                                        break block40;
                                    }
                                    ++var14_15;
                                }
                                if (var5_7 == 0) continue;
                            }
                        }
                        v19 = var2_2;
                    }
                    v17 = v19.bzb((String)_gu.a("h", (int)27689, (long)(3240337663504841531L ^ var3_3)), 10);
                }
                if ((var14_14 = v17) != null) {
                    var15_18 = 0;
                    while (var15_18 < var14_14.vek()) {
                        block65: {
                            block66: {
                                var16_20 = var14_14.kd6(var15_18);
                                var17_22 = pyk.nq2((bdo)var16_20);
                                try {
                                    try {
                                        try {
                                            if (var5_7 != 0) break block64;
                                            if (var5_7 != 0) break block65;
                                        }
                                        catch (oov v25) {
                                            throw _gu.a(v25);
                                        }
                                        if (var17_22 == null) break block66;
                                    }
                                    catch (oov v26) {
                                        throw _gu.a(v26);
                                    }
                                    var8_6.k7k((pyk)var17_22);
                                }
                                catch (oov v27) {
                                    throw _gu.a(v27);
                                }
                            }
                            ++var15_18;
                        }
                        if (var5_7 == 0) continue;
                    }
                }
                try {
                    try {
                        v28 = var2_2;
                        v29 = _gu.a("h", (int)22619, (long)(2748609693027028804L ^ var3_3));
                        v30 = 9;
                        if (var5_7 != 0) break block67;
                        if (!v28.inh((String)v29, v30)) break block64;
                    }
                    catch (oov v31) {
                        throw _gu.a(v31);
                    }
                    v28 = var2_2;
                    v29 = _gu.a("h", (int)26820, (long)(3823704138332602361L ^ var3_3));
                    v30 = 10;
                }
                catch (oov v32) {
                    throw _gu.a(v32);
                }
            }
            if ((var15_19 = v28.bzb((String)v29, v30)) == null) break block64;
            for (var16_21 = 0; var16_21 < var15_19.vek(); ++var16_21) {
                block69: {
                    block68: {
                        var17_22 = var15_19.kd6(var16_21);
                        try {
                            v33 = var17_22.inh("i", 8);
                            if (var5_7 != 0) break block68;
                            if (v33 != 0) {
                            }
                            ** GOTO lbl245
                        }
                        catch (oov v34) {
                            throw _gu.a(v34);
                        }
                        var18_23 = e0x.mdd(var17_22.u14("i"));
                        try {
                            if (var5_7 == 0) break block69;
lbl245:
                            // 2 sources

                            v33 = var17_22.uz7("i");
                        }
                        catch (oov v35) {
                            throw _gu.a(v35);
                        }
                    }
                    var18_23 = e0x.csc(v33);
                }
                var1_1.jf5(new mew(var17_22.uz7("x"), var17_22.uz7("y"), var17_22.uz7("z")), (e0x)var18_23, var17_22.uz7("t"), var17_22.uz7("p"));
                if (var5_7 == 0) continue;
            }
        }
        return var8_6;
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

                _gu.a = c.a(-6436583717420621982L, 7970262089120267419L, MethodHandles.lookup().lookupClass()).a(256121350062472L);
                _gu.d = new HashMap<K, V>(13);
                var0 = _gu.a ^ 80418753414390L;
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
                var9_3 = new String[48];
                var7_4 = 0;
                var6_5 = "\u008d\u00f3\u008e\u00da\u0080X\u0004\u00e3\u00e6\u00ed@\u00dcz\u000f\t\u009c\u00ae\u001f&\u0085-#P\u00b7\u0018\t\u00f3.\u0088\u0003\u00e4\u00cf\u008a\u00bcS\u00ee\u0097\u009e\u00f2\u00eb\u00c7\u00b4\u00d0\u00d0\u0015NFv\u00ea\u0018\u0098\u00f8\u00ad\u001c\rt\r@\u00cd1\u00f3bF\u00fa=X\u00ceA\u00f3\u00ae\u00b3\u00b8\u00cd\u00d8 \u0082\u00c4}\u00b9B\u00f9y\u00c3\u00afA\\\u00d5Qm\u00f9V\u0014\u00c6\u00b4\u0013\u001b\u0092\u00e5Cm\u0006\u00cd#_\u00b6D\u008d\u0018i\u00c42\u0090\u00d4\u00dc\u00a9\u00f0?Y=\u00acyr\u00df 1c\u00f8C\u00aaO\u0099\u008e\u0010u-\u0096\\\u00bc\u00c9:\u0085\u0018\\\u0018\u007f\f\u00b8\u00a7\u0088 \u00f2\u00cav\u00d59.\u00972\u0013D\u00b6\u0000g\u0000\u008e\u0080\f\u00eb\u001d\u00e4ms\u00fa\u00d6\u001a\u0019.\u00f4\u00fb4\u00fd\u00a9\u0018I\u0004\u0005\u0015\u00d6a[\u0093\u0004\u00e9\u0000\u00f7\u00ca\u000b\u00012\u00be\u00eb\t\u001d!\u009c\u00a8w\u0010\u00f2\u00f0\u000e~\u00f4bi\u00ef\u008br[\u0012\u0014U\u00fd#\u0010O}\u0019\u00b7 L2\u000b\u00ea\u0083\u00c1\u00b0Mqx\u00ceP\u00dc\u00edb[\u0014\u00f7\u00e2\u0004\u00af\u00cf ,1\u008e\u008e\u00d1\u00c4\u0092\u00c7\t\u00e5m\u00fb\u00a4\u00caW\u00f0\u00a4\u0010H\u0084\u001e\u008a\u00fe\u00cb\u00f6\u00d1^\u00e3\u00c6}4E\u00dd\u0097u\u00cdb\u0083?\u0005\u00bc?\u00ab\u00ccd\u00f0E\u00cdo\u00ba\u00bc\t\u0095u\u00d3\u00a9EG S\u007f'\u00ce\u008bO-\u0019\u00c4\u009f\u0010)%/\u00f9%\u008a\u00cf\u00a1\u0096\u0014D\u00e7t&\u001c\u00c3\u0010\u001ciq\u00cft\u008b\u00953 \u0098\u0093\u00d0\u00eb\u00cd\r\u00c4(S#\\8:\u00eb\u00e1\t\u00eb\u00b4\u00dc7\u00a7\u001e\u00fa\u008a\u00d5\u0095\u00a7\u00ac\u00cd\u00c4^5g\u00f9\u00a9\u00a1s@\u00b0&\u00f8\u00ab\u001e\u00b0\u00e1$\u0006H\u0018G\u00b8m\u000br6f \u00dbA{!#\u00e6\u00cb=\u0005R\u00f4(\u00da\u00c1dA\u0018y\u00d9S\u00d8O\u00c8\u0093\u00c7\u00fa\u0095)VQ\u009f\u00d48\u0091\u00a2\u00faW\"\b\u00f8]@\u00d1\u00bc<}8oc\u00c9\u009e\u00a4I\u009fP1\u0007\u00c6Py\u00e8\u0087'rl\u00e8\u001d\u00f7\u0086\u00deh)]\u0019\u00db\u0090\u00d1\u00a3\u00d1\u00b7\u00b5o\u00db\u00a5\u009e\u001a\u000f\u00c9R\u00b5;\u00f1\u0017}\u0015Uz\u00ce*\u0083\u00c0g@y\u009b\u0094\u0010\u00c1\u001cs\u00ced;*\u00d5\u00ddm\u0093O\u0085\u00bf\u00bd\u0088\u0010\u00d5{@A\u00adcB\u00d0j\u00da\u0089\u00da\u00dd\u0081o\u00f0\u0010\u001b\u0095\u009a\u001d\u000b\u0084gF\u00c6l\u0002\u00a9\u00cbR\u00bb\u0004(\u00bd\u001fR\u00d4\u00881\u000fE\u00e6\u0006\u0004\u0085\u009d\u00caA\u00afz\u0018\u0096\u0088\u00eb\u0000\u00c6|1B$v\u00d0J\u00e9\u00c7\u00b7mT\u00bcdy'\u00fa\u0018\u0083~\u0017\u0013\u00f3\u0093\u0007E\u00f1\u0011\u00e4E\u00ed8\u00bd\u00196`\u00d4\u00c9\u00fa\u00bdZ0\u0010\u00d7W\u0012<\u009d+Yv\u000e\u001b\u0013x\u0006\u001e\u00da\u0003\u0018H*\u0096 c=w\u00fd-\u0018\u0097\u0016\u00df\u0096x\u0015,(\u0005\u00da5hB\u00f5 \u00ce^\u00c6C(-\u00ebA\u0000\u001aN\u0085\u001e\u00e1c4E\u009a\u00af\u0080]j\u00fd\u00c3y\u00cd\u0006\u00e4\u00a2Z\u0090W\u0010&g\u00eaP\u00fc\u0094\u00cfX\u00f3\u00b25)H\u008aw\u00d5 e\u00e5H\u00e3S\u008d6`*LD]\u00c1\u00b9s\u00cf\u00f96\u00c7\u0004\u00f8\u008f\u0092\u0082\u00a8<*\u0015\u00e5\u00dd\u009b\u00f3\u0018\u00e2\u00ee\u00de\u0082\u0007\u0019\u009a\u00db$\u00b0\u0088EO\u0007\u009f\u00e0b\u001c\u00cd\u00ea\u008d\u0005`\u000b \u00b5i\u00d3wy\u00ba\u00a9\u00efU\u0010\f\u001f\u00c2\u00cc9r\u00d7\u00c9Q\u0093+CU\u0007\u00f4X\u0018\u00dci\u00ac!\u0089\u0010\u00b3t\u00ae\u00f3\u00fbR.:\u00a7p\u0018\u001c\u00c1l\u0080GX\u0014\u00c5\u00b5\u00a1\n\u00d7\u00af6\u0013\u0016\u00adN\f\u00b41\u00df\u00e1\u00d9R\u001fUO\u00ca\u00ed\u0004\u00a8I\\dk\u000f\u00a0\u0002n\u0018|\u00bagW\u00cdg\u00b0\u00f3\b\u00e2\u00a1\u0089X(\u00f3\u00f4\u0087\u00f5\u00e8\u00f3\u001c_\u00c9(}\u00d5\u00d4\u00ec\u0005\u00d0W\u0097\u00bf\u00c4\u00af\u00bd\u0011\u00c0\u00e4\u00b2\u00bc\t}\u00f58?\",[\u008bI\u0086\u00e5\u0018\u00937\u00b5\u00f7&\u00b6\u008d\u0097\u00dfa\u00df\u00b5\u0082\\\u00a0Q\u00ae\u00aa\u00ad\u00b0\u0012#U.\u0010\u0017&\u00e8\u009d\u00820\u0087\u009eK\u00a1Y\u00ff\u00b5N\u00af_@\u00b9\u0004\u00f5WX\u00eav\u00ab\u00f1\u009e\u008d\u000f=\u00a3\u0002:\u001c\u001fM\u00df.\u00f4\u0002\u0013\u009f\u00d4d\u00d4\u0019^\tcd\u009dm2\u001d\rQ\u0081\u00ad\b\u0016\u00ed\u0083LA\u0098T\u00c7.\u00ae\u00fb\u00c1Y$\u00b5\u008au\u008bJ\u00e9\u0010\u00a4\u0010t\u00b5\u00fc\u00ec\u00c6 n\u00d2\u0081\u00f8\u00d7\u00db\u001b\u0087\u00a0+\u0010\u00cb^\u00aa\u00ee;\u00b2\u00ed\u00d0eZ~\"\u0015\u0017\u00cb1\u00181\u00f7$\nX\u0001\u00be\u00b6\u0090{fzi\u00e6\u0093N\u0086\u00dcI\u00da2\u0092d\u0004 \u00ca\u00d7I\u0082/\u00aaWYP\u00e1\u00d7#\u008f\u00b7\u00bbc\u001e\u00cf\u00a1\u00c4\u000e\u00d5H\u00d6V\nd\u0086\u00a6\fEY(\u00a6\u00c7\u0004jm\u0093\u001ch\u00ce\u00df\u00efZ1~H\f\u00a9\u008a\u00db\u00bd\u00b3_\u000e}\u00cf>@\u00c3CBRE[\u00e9\u00a6\u00fc=\u0095Vn\u0010\u00b9\u0006\u0012;\u00bd\u0093e\u0082\u00f0\u00a5Mtw5\u00f9\u00ac(4KN^b\u00e0\u0003\u0006!`y\u00f4m\u00a7\u00ba\u00f4\u000f\u0000)\u00d5K\u00c0\u00d1y\u008fD\u0097\u001f\u008e\u00f1\u0094\u00e14\u0098E\u00d3\u00ecFD\u0016\u0010\u0091t\u00db\u00bd\u008e\u00bb\u00aeaF\u009f\u00a2bza\u00b4\u00e1\u0010\u00df\u00b3q\u00ee\u008e\u00d6\u0091\u0082\u00857\u0087C\u0093\u00be\u00f5]\u0010`\u00d3@\u0087\u00d0>\u00b8\u00b9\u00bbR\u008eu\u00cf u[ 6P\u00d5\u00b7\u00c4W\u00d2f\u00f9\u009a\u00fe\u0086]K'\u00b8D\u00c5\u00f4\u009b1\u00c498E\u00df'\u00b4\u00b4c\u000f\u001a\u0010Z\u0004\f\u00f0e\u00bc\u00fb\u0015\u0018\u00bf\u0084\u0085\u008b)#h";
                var8_6 = "\u008d\u00f3\u008e\u00da\u0080X\u0004\u00e3\u00e6\u00ed@\u00dcz\u000f\t\u009c\u00ae\u001f&\u0085-#P\u00b7\u0018\t\u00f3.\u0088\u0003\u00e4\u00cf\u008a\u00bcS\u00ee\u0097\u009e\u00f2\u00eb\u00c7\u00b4\u00d0\u00d0\u0015NFv\u00ea\u0018\u0098\u00f8\u00ad\u001c\rt\r@\u00cd1\u00f3bF\u00fa=X\u00ceA\u00f3\u00ae\u00b3\u00b8\u00cd\u00d8 \u0082\u00c4}\u00b9B\u00f9y\u00c3\u00afA\\\u00d5Qm\u00f9V\u0014\u00c6\u00b4\u0013\u001b\u0092\u00e5Cm\u0006\u00cd#_\u00b6D\u008d\u0018i\u00c42\u0090\u00d4\u00dc\u00a9\u00f0?Y=\u00acyr\u00df 1c\u00f8C\u00aaO\u0099\u008e\u0010u-\u0096\\\u00bc\u00c9:\u0085\u0018\\\u0018\u007f\f\u00b8\u00a7\u0088 \u00f2\u00cav\u00d59.\u00972\u0013D\u00b6\u0000g\u0000\u008e\u0080\f\u00eb\u001d\u00e4ms\u00fa\u00d6\u001a\u0019.\u00f4\u00fb4\u00fd\u00a9\u0018I\u0004\u0005\u0015\u00d6a[\u0093\u0004\u00e9\u0000\u00f7\u00ca\u000b\u00012\u00be\u00eb\t\u001d!\u009c\u00a8w\u0010\u00f2\u00f0\u000e~\u00f4bi\u00ef\u008br[\u0012\u0014U\u00fd#\u0010O}\u0019\u00b7 L2\u000b\u00ea\u0083\u00c1\u00b0Mqx\u00ceP\u00dc\u00edb[\u0014\u00f7\u00e2\u0004\u00af\u00cf ,1\u008e\u008e\u00d1\u00c4\u0092\u00c7\t\u00e5m\u00fb\u00a4\u00caW\u00f0\u00a4\u0010H\u0084\u001e\u008a\u00fe\u00cb\u00f6\u00d1^\u00e3\u00c6}4E\u00dd\u0097u\u00cdb\u0083?\u0005\u00bc?\u00ab\u00ccd\u00f0E\u00cdo\u00ba\u00bc\t\u0095u\u00d3\u00a9EG S\u007f'\u00ce\u008bO-\u0019\u00c4\u009f\u0010)%/\u00f9%\u008a\u00cf\u00a1\u0096\u0014D\u00e7t&\u001c\u00c3\u0010\u001ciq\u00cft\u008b\u00953 \u0098\u0093\u00d0\u00eb\u00cd\r\u00c4(S#\\8:\u00eb\u00e1\t\u00eb\u00b4\u00dc7\u00a7\u001e\u00fa\u008a\u00d5\u0095\u00a7\u00ac\u00cd\u00c4^5g\u00f9\u00a9\u00a1s@\u00b0&\u00f8\u00ab\u001e\u00b0\u00e1$\u0006H\u0018G\u00b8m\u000br6f \u00dbA{!#\u00e6\u00cb=\u0005R\u00f4(\u00da\u00c1dA\u0018y\u00d9S\u00d8O\u00c8\u0093\u00c7\u00fa\u0095)VQ\u009f\u00d48\u0091\u00a2\u00faW\"\b\u00f8]@\u00d1\u00bc<}8oc\u00c9\u009e\u00a4I\u009fP1\u0007\u00c6Py\u00e8\u0087'rl\u00e8\u001d\u00f7\u0086\u00deh)]\u0019\u00db\u0090\u00d1\u00a3\u00d1\u00b7\u00b5o\u00db\u00a5\u009e\u001a\u000f\u00c9R\u00b5;\u00f1\u0017}\u0015Uz\u00ce*\u0083\u00c0g@y\u009b\u0094\u0010\u00c1\u001cs\u00ced;*\u00d5\u00ddm\u0093O\u0085\u00bf\u00bd\u0088\u0010\u00d5{@A\u00adcB\u00d0j\u00da\u0089\u00da\u00dd\u0081o\u00f0\u0010\u001b\u0095\u009a\u001d\u000b\u0084gF\u00c6l\u0002\u00a9\u00cbR\u00bb\u0004(\u00bd\u001fR\u00d4\u00881\u000fE\u00e6\u0006\u0004\u0085\u009d\u00caA\u00afz\u0018\u0096\u0088\u00eb\u0000\u00c6|1B$v\u00d0J\u00e9\u00c7\u00b7mT\u00bcdy'\u00fa\u0018\u0083~\u0017\u0013\u00f3\u0093\u0007E\u00f1\u0011\u00e4E\u00ed8\u00bd\u00196`\u00d4\u00c9\u00fa\u00bdZ0\u0010\u00d7W\u0012<\u009d+Yv\u000e\u001b\u0013x\u0006\u001e\u00da\u0003\u0018H*\u0096 c=w\u00fd-\u0018\u0097\u0016\u00df\u0096x\u0015,(\u0005\u00da5hB\u00f5 \u00ce^\u00c6C(-\u00ebA\u0000\u001aN\u0085\u001e\u00e1c4E\u009a\u00af\u0080]j\u00fd\u00c3y\u00cd\u0006\u00e4\u00a2Z\u0090W\u0010&g\u00eaP\u00fc\u0094\u00cfX\u00f3\u00b25)H\u008aw\u00d5 e\u00e5H\u00e3S\u008d6`*LD]\u00c1\u00b9s\u00cf\u00f96\u00c7\u0004\u00f8\u008f\u0092\u0082\u00a8<*\u0015\u00e5\u00dd\u009b\u00f3\u0018\u00e2\u00ee\u00de\u0082\u0007\u0019\u009a\u00db$\u00b0\u0088EO\u0007\u009f\u00e0b\u001c\u00cd\u00ea\u008d\u0005`\u000b \u00b5i\u00d3wy\u00ba\u00a9\u00efU\u0010\f\u001f\u00c2\u00cc9r\u00d7\u00c9Q\u0093+CU\u0007\u00f4X\u0018\u00dci\u00ac!\u0089\u0010\u00b3t\u00ae\u00f3\u00fbR.:\u00a7p\u0018\u001c\u00c1l\u0080GX\u0014\u00c5\u00b5\u00a1\n\u00d7\u00af6\u0013\u0016\u00adN\f\u00b41\u00df\u00e1\u00d9R\u001fUO\u00ca\u00ed\u0004\u00a8I\\dk\u000f\u00a0\u0002n\u0018|\u00bagW\u00cdg\u00b0\u00f3\b\u00e2\u00a1\u0089X(\u00f3\u00f4\u0087\u00f5\u00e8\u00f3\u001c_\u00c9(}\u00d5\u00d4\u00ec\u0005\u00d0W\u0097\u00bf\u00c4\u00af\u00bd\u0011\u00c0\u00e4\u00b2\u00bc\t}\u00f58?\",[\u008bI\u0086\u00e5\u0018\u00937\u00b5\u00f7&\u00b6\u008d\u0097\u00dfa\u00df\u00b5\u0082\\\u00a0Q\u00ae\u00aa\u00ad\u00b0\u0012#U.\u0010\u0017&\u00e8\u009d\u00820\u0087\u009eK\u00a1Y\u00ff\u00b5N\u00af_@\u00b9\u0004\u00f5WX\u00eav\u00ab\u00f1\u009e\u008d\u000f=\u00a3\u0002:\u001c\u001fM\u00df.\u00f4\u0002\u0013\u009f\u00d4d\u00d4\u0019^\tcd\u009dm2\u001d\rQ\u0081\u00ad\b\u0016\u00ed\u0083LA\u0098T\u00c7.\u00ae\u00fb\u00c1Y$\u00b5\u008au\u008bJ\u00e9\u0010\u00a4\u0010t\u00b5\u00fc\u00ec\u00c6 n\u00d2\u0081\u00f8\u00d7\u00db\u001b\u0087\u00a0+\u0010\u00cb^\u00aa\u00ee;\u00b2\u00ed\u00d0eZ~\"\u0015\u0017\u00cb1\u00181\u00f7$\nX\u0001\u00be\u00b6\u0090{fzi\u00e6\u0093N\u0086\u00dcI\u00da2\u0092d\u0004 \u00ca\u00d7I\u0082/\u00aaWYP\u00e1\u00d7#\u008f\u00b7\u00bbc\u001e\u00cf\u00a1\u00c4\u000e\u00d5H\u00d6V\nd\u0086\u00a6\fEY(\u00a6\u00c7\u0004jm\u0093\u001ch\u00ce\u00df\u00efZ1~H\f\u00a9\u008a\u00db\u00bd\u00b3_\u000e}\u00cf>@\u00c3CBRE[\u00e9\u00a6\u00fc=\u0095Vn\u0010\u00b9\u0006\u0012;\u00bd\u0093e\u0082\u00f0\u00a5Mtw5\u00f9\u00ac(4KN^b\u00e0\u0003\u0006!`y\u00f4m\u00a7\u00ba\u00f4\u000f\u0000)\u00d5K\u00c0\u00d1y\u008fD\u0097\u001f\u008e\u00f1\u0094\u00e14\u0098E\u00d3\u00ecFD\u0016\u0010\u0091t\u00db\u00bd\u008e\u00bb\u00aeaF\u009f\u00a2bza\u00b4\u00e1\u0010\u00df\u00b3q\u00ee\u008e\u00d6\u0091\u0082\u00857\u0087C\u0093\u00be\u00f5]\u0010`\u00d3@\u0087\u00d0>\u00b8\u00b9\u00bbR\u008eu\u00cf u[ 6P\u00d5\u00b7\u00c4W\u00d2f\u00f9\u009a\u00fe\u0086]K'\u00b8D\u00c5\u00f4\u009b1\u00c498E\u00df'\u00b4\u00b4c\u000f\u001a\u0010Z\u0004\f\u00f0e\u00bc\u00fb\u0015\u0018\u00bf\u0084\u0085\u008b)#h".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = _gu.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00898\u0011\u00dc\u00d3,I\r1\u0086\u008a\u00dcZk\u00d6\u00d6\"B}\u001e(\u001a\u00c8)\u00c1DH\u009d\u0082\u0012\u0001\u00b5 r\u0014\u001f\u00c8\u00d4\u008f\u00b1\u00e7T\u00a2\u00d2z\u00b9\u00c0\u00cc\u007f\u00a8\u00b1md[<<\u00d6?\u0091\u008d\u00aa\u00c0\u00e5\u00ed7";
                    var8_6 = "\u00898\u0011\u00dc\u00d3,I\r1\u0086\u008a\u00dcZk\u00d6\u00d6\"B}\u001e(\u001a\u00c8)\u00c1DH\u009d\u0082\u0012\u0001\u00b5 r\u0014\u001f\u00c8\u00d4\u008f\u00b1\u00e7T\u00a2\u00d2z\u00b9\u00c0\u00cc\u007f\u00a8\u00b1md[<<\u00d6?\u0091\u008d\u00aa\u00c0\u00e5\u00ed7".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = _gu.a(var10_9).intern();
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
        _gu.b = var9_3;
        _gu.c = new String[48];
        _gu.x7e = LogManager.getLogger();
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7724;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_gu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            _gu.c[n2] = _gu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _gu.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("_gu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_gu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

