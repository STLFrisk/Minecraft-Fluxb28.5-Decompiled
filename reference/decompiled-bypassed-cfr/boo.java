/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.util.vector.Matrix4f
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class boo {
    private static final /* synthetic */ Logger prm;
    private /* synthetic */ int u71;
    private final /* synthetic */ int dl8;
    private final /* synthetic */ int zf1;
    private final /* synthetic */ IntBuffer ka2;
    private final /* synthetic */ FloatBuffer _x6;
    private final /* synthetic */ String s84;
    private /* synthetic */ boolean bq1;
    private final /* synthetic */ jn3 doy;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public boo(String string, int n, int n2, jn3 jn32) {
        this.s84 = string;
        this.dl8 = n2;
        this.zf1 = n;
        this.doy = jn32;
        if (n <= 3) {
            this.ka2 = BufferUtils.createIntBuffer((int)n2);
            this._x6 = null;
        } else {
            this.ka2 = null;
            this._x6 = BufferUtils.createFloatBuffer((int)n2);
        }
        this.u71 = -1;
        this.c0r();
    }

    private void c0r() {
        try {
            this.bq1 = true;
            if (this.doy != null) {
                this.doy.ade();
            }
        }
        catch (oov oov2) {
            throw boo.a(oov2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static int he4(String var0) {
        block29: {
            block27: {
                block31: {
                    block30: {
                        block28: {
                            block26: {
                                var1_1 = boo.a ^ 125738781220310L;
                                var3_2 = t9d.b();
                                var4_3 = -1;
                                try {
                                    v0 = var0.equals(boo.a("w", (int)2540, (long)(5405765408238530903L ^ var1_1)));
                                    if (var3_2 == 0) break block26;
                                    if (v0 != 0) {
                                    }
                                    ** GOTO lbl17
                                }
                                catch (oov v1) {
                                    throw boo.a(v1);
                                }
                                var4_3 = 0;
                                try {
                                    if (var3_2 != 0) break block27;
lbl17:
                                    // 2 sources

                                    v0 = (int)var0.equals(boo.a("w", (int)26626, (long)(1660820252264501435L ^ var1_1)));
                                }
                                catch (oov v2) {
                                    throw boo.a(v2);
                                }
                            }
                            try {
                                if (var3_2 == 0) break block28;
                                if (v0 != 0) {
                                }
                                ** GOTO lbl33
                            }
                            catch (oov v3) {
                                throw boo.a(v3);
                            }
                            var4_3 = 4;
                            try {
                                if (var3_2 != 0) break block27;
lbl33:
                                // 2 sources

                                v0 = (int)var0.startsWith((String)boo.a("w", (int)3020, (long)(6681849008380605298L ^ var1_1)));
                            }
                            catch (oov v4) {
                                throw boo.a(v4);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var3_2 == 0) break block29;
                                    if (v0 == 0) break block27;
                                }
                                catch (oov v5) {
                                    throw boo.a(v5);
                                }
                                v0 = (int)var0.endsWith((String)boo.a("w", (int)25718, (long)(7178016023927921858L ^ var1_1)));
                                if (var3_2 == 0) break block30;
                            }
                            catch (oov v6) {
                                throw boo.a(v6);
                            }
                            if (v0 != 0) {
                            }
                            ** GOTO lbl60
                        }
                        catch (oov v7) {
                            throw boo.a(v7);
                        }
                        var4_3 = 8;
                        try {
                            if (var3_2 != 0) break block27;
lbl60:
                            // 2 sources

                            v0 = (int)var0.endsWith((String)boo.a("w", (int)26186, (long)(7175214111642427120L ^ var1_1)));
                        }
                        catch (oov v8) {
                            throw boo.a(v8);
                        }
                    }
                    try {
                        if (var3_2 == 0) break block31;
                        if (v0 != 0) {
                        }
                        ** GOTO lbl76
                    }
                    catch (oov v9) {
                        throw boo.a(v9);
                    }
                    var4_3 = 9;
                    try {
                        if (var3_2 != 0) break block27;
lbl76:
                        // 2 sources

                        v0 = (int)var0.endsWith((String)boo.a("w", (int)14127, (long)(1497021830696161178L ^ var1_1)));
                    }
                    catch (oov v10) {
                        throw boo.a(v10);
                    }
                }
                try {
                    if (var3_2 == 0) break block29;
                    if (v0 == 0) break block27;
                }
                catch (oov v11) {
                    throw boo.a(v11);
                }
                var4_3 = 10;
            }
            v0 = var4_3;
        }
        return v0;
    }

    public void ubi(int n) {
        this.u71 = n;
    }

    public String hg_() {
        return this.s84;
    }

    public void scn(float f) {
        this._x6.position(0);
        this._x6.put(0, f);
        this.c0r();
    }

    public void utn(float f, float f2) {
        this._x6.position(0);
        this._x6.put(0, f);
        this._x6.put(1, f2);
        this.c0r();
    }

    public void otp(float f, float f2, float f3) {
        this._x6.position(0);
        this._x6.put(0, f);
        this._x6.put(1, f2);
        this._x6.put(2, f3);
        this.c0r();
    }

    public void hej(float f, float f2, float f3, float f4) {
        this._x6.position(0);
        this._x6.put(f);
        this._x6.put(f2);
        this._x6.put(f3);
        this._x6.put(f4);
        this._x6.flip();
        this.c0r();
    }

    public void ipu(float f, float f2, float f3, float f4) {
        boo boo2;
        block23: {
            int n;
            int n2;
            block21: {
                int n3;
                block22: {
                    block19: {
                        block20: {
                            block17: {
                                block18: {
                                    n3 = t9d.c();
                                    try {
                                        try {
                                            this._x6.position(0);
                                            n2 = this.zf1;
                                            n = 4;
                                            if (n3 != 0) break block17;
                                            if (n2 < n) break block18;
                                        }
                                        catch (oov oov2) {
                                            throw boo.a(oov2);
                                        }
                                        this._x6.put(0, f);
                                    }
                                    catch (oov oov3) {
                                        throw boo.a(oov3);
                                    }
                                }
                                n2 = this.zf1;
                                n = 5;
                            }
                            try {
                                try {
                                    if (n3 != 0) break block19;
                                    if (n2 < n) break block20;
                                }
                                catch (oov oov4) {
                                    throw boo.a(oov4);
                                }
                                this._x6.put(1, f2);
                            }
                            catch (oov oov5) {
                                throw boo.a(oov5);
                            }
                        }
                        n2 = this.zf1;
                        n = 6;
                    }
                    try {
                        try {
                            if (n3 != 0) break block21;
                            if (n2 < n) break block22;
                        }
                        catch (oov oov6) {
                            throw boo.a(oov6);
                        }
                        this._x6.put(2, f3);
                    }
                    catch (oov oov7) {
                        throw boo.a(oov7);
                    }
                }
                try {
                    boo2 = this;
                    if (n3 != 0) break block23;
                    n2 = boo2.zf1;
                    n = 7;
                }
                catch (oov oov8) {
                    throw boo.a(oov8);
                }
            }
            try {
                if (n2 >= n) {
                    this._x6.put(3, f4);
                }
            }
            catch (oov oov9) {
                throw boo.a(oov9);
            }
            boo2 = this;
        }
        boo2.c0r();
    }

    public void kr1(int n, int n2, int n3, int n4) {
        boo boo2;
        block23: {
            int n5;
            int n6;
            block21: {
                int n7;
                block22: {
                    block19: {
                        block20: {
                            block17: {
                                block18: {
                                    n7 = t9d.c();
                                    try {
                                        try {
                                            this.ka2.position(0);
                                            n6 = this.zf1;
                                            if (n7 != 0) break block17;
                                            if (n6 < 0) break block18;
                                        }
                                        catch (oov oov2) {
                                            throw boo.a(oov2);
                                        }
                                        this.ka2.put(0, n);
                                    }
                                    catch (oov oov3) {
                                        throw boo.a(oov3);
                                    }
                                }
                                n6 = this.zf1;
                            }
                            try {
                                try {
                                    n5 = 1;
                                    if (n7 != 0) break block19;
                                    if (n6 < n5) break block20;
                                }
                                catch (oov oov4) {
                                    throw boo.a(oov4);
                                }
                                this.ka2.put(1, n2);
                            }
                            catch (oov oov5) {
                                throw boo.a(oov5);
                            }
                        }
                        n6 = this.zf1;
                        n5 = 2;
                    }
                    try {
                        try {
                            if (n7 != 0) break block21;
                            if (n6 < n5) break block22;
                        }
                        catch (oov oov6) {
                            throw boo.a(oov6);
                        }
                        this.ka2.put(2, n3);
                    }
                    catch (oov oov7) {
                        throw boo.a(oov7);
                    }
                }
                try {
                    boo2 = this;
                    if (n7 != 0) break block23;
                    n6 = boo2.zf1;
                    n5 = 3;
                }
                catch (oov oov8) {
                    throw boo.a(oov8);
                }
            }
            try {
                if (n6 >= n5) {
                    this.ka2.put(3, n4);
                }
            }
            catch (oov oov9) {
                throw boo.a(oov9);
            }
            boo2 = this;
        }
        boo2.c0r();
    }

    public void l4a(float[] fArray) {
        block5: {
            long l = a ^ 0x104E6C7404DDL;
            int n = t9d.c();
            try {
                block4: {
                    try {
                        if (fArray.length >= this.dl8) break block4;
                        prm.warn((String)((Object)boo.a("w", (int)19285, (long)(0x37255F0F8C63AAEEL ^ l))) + this.dl8 + (String)((Object)boo.a("w", (int)30126, (long)(0x34E3F9FA51159412L ^ l))) + fArray.length + (String)((Object)boo.a("w", (int)16136, (long)(0x3CB273D1250ADEBBL ^ l))));
                        if (n == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw boo.a(oov2);
                    }
                }
                this._x6.position(0);
                this._x6.put(fArray);
                this._x6.position(0);
                this.c0r();
            }
            catch (oov oov3) {
                throw boo.a(oov3);
            }
        }
    }

    public void jd2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this._x6.position(0);
        this._x6.put(0, f);
        this._x6.put(1, f2);
        this._x6.put(2, f3);
        this._x6.put(3, f4);
        this._x6.put(4, f5);
        this._x6.put(5, f6);
        this._x6.put(6, f7);
        this._x6.put(7, f8);
        this._x6.put(8, f9);
        this._x6.put(9, f10);
        this._x6.put(10, f11);
        this._x6.put(11, f12);
        this._x6.put(12, f13);
        this._x6.put(13, f14);
        this._x6.put(14, f15);
        this._x6.put(15, f16);
        this.c0r();
    }

    public void i9w(Matrix4f matrix4f) {
        this.jd2(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }

    public void hr6() {
        block20: {
            boo boo2;
            block23: {
                int n;
                int n2;
                long l;
                block21: {
                    int n3;
                    block18: {
                        l = a ^ 0x4E917A591FF6L;
                        n3 = t9d.c();
                        if (!this.bq1) {
                            // empty if block
                        }
                        try {
                            block19: {
                                try {
                                    try {
                                        this.bq1 = false;
                                        n2 = this.zf1;
                                        n = 3;
                                        if (n3 != 0) break block18;
                                        if (n2 > n) break block19;
                                    }
                                    catch (oov oov2) {
                                        throw boo.a(oov2);
                                    }
                                    this.wps();
                                    if (n3 == 0) break block20;
                                }
                                catch (oov oov3) {
                                    throw boo.a(oov3);
                                }
                            }
                            n2 = this.zf1;
                            n = 7;
                        }
                        catch (oov oov4) {
                            throw boo.a(oov4);
                        }
                    }
                    try {
                        try {
                            block22: {
                                try {
                                    try {
                                        if (n3 != 0) break block21;
                                        if (n2 > n) break block22;
                                    }
                                    catch (oov oov5) {
                                        throw boo.a(oov5);
                                    }
                                    this.x2z();
                                    if (n3 == 0) break block20;
                                }
                                catch (oov oov6) {
                                    throw boo.a(oov6);
                                }
                            }
                            boo2 = this;
                            if (n3 != 0) break block23;
                        }
                        catch (oov oov7) {
                            throw boo.a(oov7);
                        }
                        n2 = boo2.zf1;
                        n = 10;
                    }
                    catch (oov oov8) {
                        throw boo.a(oov8);
                    }
                }
                try {
                    if (n2 > n) {
                        prm.warn((String)((Object)boo.a("w", (int)5106, (long)(0x1032A245FC6696DL ^ l))) + this.zf1 + (String)((Object)boo.a("w", (int)9124, (long)(0x6996C3273386D938L ^ l))));
                        return;
                    }
                }
                catch (oov oov9) {
                    throw boo.a(oov9);
                }
                boo2 = this;
            }
            boo2.o3x();
        }
    }

    /*
     * Exception decompiling
     */
    private void wps() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
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
     * Exception decompiling
     */
    private void x2z() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
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
     * Exception decompiling
     */
    private void o3x() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                boo.a = c.a(5958543052833688990L, -6255259880255978736L, MethodHandles.lookup().lookupClass()).a(9391020076441L);
                boo.e = new HashMap<K, V>(13);
                var0 = boo.a ^ 58805122315552L;
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
                var9_3 = new String[15];
                var7_4 = 0;
                var6_5 = "\u0082(a\u00bf\u00af\u00ac\u0016\u0013\u00c4\u00e9 \u0013\u0098\u00e3\u00afQ\u0093b\u0082\u00d3\u00ff\u009a\u00fc\u0013W\u00ca\u00de5#\u00a2<UN[\u00b1\u00f7\u0080M\u00ee*Q\u001c\u0080\u00d0\u0080\b\u00b2\u00d6\u009f9\r\u00c1\u00fa\u00009\r\u0011o\u0004\u0080\u00b07H\u00c7\u008b\u009b\u00dc\u00a4\u00b4\u00ac\u0096\u00af\u00cc=p\u000b\u0005oV\u00e2Hc\u00e2I\u00af\u00a1\u00f3/5:4\u00e9G\u00f5]\u00ab\u00d3\u00bb\u00b1\u00d1I\u00bf\u00e0\r\u00f3\u00a5\u00cfgK\u00f6\u0089\u00a7\u0093\u0090\u00fbP\u00996\u00c4\u00a8D\u00c4\u0099\u008bZ\u00d2_g\u00924\u00c3\u00ab\u00e6\u00dc\u0080l\u009a\u0010\u0002\u008f\u00f3\u0096g\u0019\u0002\u0081\u00e7&ve\u00b2*\u009c@\"\u0093zyZ\u00c0\u000e\u00bb<:dl/Z\u0014\u00e1{C\u008e\u009aWcG{\u0091\u00a0\u000f\u0001\u00dbL\u00f1\u009c;\u00dc\t\u0099\u00fb-\u00a5\u00c9)\u00c9\u00c0T\u00b1\u001bd\"R\u00f5>\u00bbe\u00e8~\u00e5\u00cf\u001a\u009f\u00e5\\\u0091\u00b6\u001d\u0010\u00d3\u00a9\u00c3_\u00f9\u0083LU\u008d@\u00fd\u00d0\u0096\u008e\u00a2R\u0010\u00c6\u00aa\u00cd\u0007p\u00bd\u0092\u00e6q\u00a4\u00faF\u008f\u0092\u00bbS\u0018(\u009a*\u00cb\u0005{=\u0001Ar\u00bbb\u000eM\f\u00da\u0002F\u0002Ee\u00ec\u00a5\u00dc\u0010\u00e6\u00df\u00c8\u009f\u0014r\u0084\u00f72\u008bi'\u0099\u00edz\u0011\u0010\u00b79\u00a9\u00e7\u0000\u00ee=>\u00d2q:KW\u00a8=7\u00109\u00f9xDd\u009eL\u00c8:v\u00cd\u001f\u00cd\u00c5\u00f6>\u0010\u0014Q\u00e1\u00e2\u009b/g\u0086\u00b7\u00a8\u0005\u00d3@\u00a4s\u009e\u0010\u00efSv\u0086l\u0012_\u00dd\u0092k\u000bD8(\u0085jH\u0086\u0004\u00d9\u00adr^Co\u0017c\u00d9\u00ad\t\u0003\u00b0\u00a6\u0095\u00fdcL0\u00a9\u000b\u001d>\u0092\u00b2Z\u00feoH>T\u00fb\u00cdew^\u00aa\u0097\u0094m#\u00d7\u00a1j\u0082b\u009em\u00ed\u00bd\u00d6\u00de\u00d8\u00d8\u00c9Fq\u0095\u00b1\u00d6\u00e1u\u0083u\u0015\"lp#\u00edP\u0013\u001d\u0099\u00f2\u00840l9\u00ef\u009d0\u0095\u00c5\u00be\u00a9\u009b.D\u001b\u00af\u00c9\u0083\u0081\u00f1G\u00b6\u008b\u0086\u0006j\u00b7s\u00be\u00d1Z\u00df\u0006\u001b\u0011\u008e\u00ea\u0080\"B(}\u00d5\u001a$\u008f\u00b2IZ\u00e7R\u00c3\u00fc\u00b9\u0092&\u00fa)T8I\u00cb\u00df\u00b07\u00e4]a\u0019\u0015\u0086\u008f!85S";
                var8_6 = "\u0082(a\u00bf\u00af\u00ac\u0016\u0013\u00c4\u00e9 \u0013\u0098\u00e3\u00afQ\u0093b\u0082\u00d3\u00ff\u009a\u00fc\u0013W\u00ca\u00de5#\u00a2<UN[\u00b1\u00f7\u0080M\u00ee*Q\u001c\u0080\u00d0\u0080\b\u00b2\u00d6\u009f9\r\u00c1\u00fa\u00009\r\u0011o\u0004\u0080\u00b07H\u00c7\u008b\u009b\u00dc\u00a4\u00b4\u00ac\u0096\u00af\u00cc=p\u000b\u0005oV\u00e2Hc\u00e2I\u00af\u00a1\u00f3/5:4\u00e9G\u00f5]\u00ab\u00d3\u00bb\u00b1\u00d1I\u00bf\u00e0\r\u00f3\u00a5\u00cfgK\u00f6\u0089\u00a7\u0093\u0090\u00fbP\u00996\u00c4\u00a8D\u00c4\u0099\u008bZ\u00d2_g\u00924\u00c3\u00ab\u00e6\u00dc\u0080l\u009a\u0010\u0002\u008f\u00f3\u0096g\u0019\u0002\u0081\u00e7&ve\u00b2*\u009c@\"\u0093zyZ\u00c0\u000e\u00bb<:dl/Z\u0014\u00e1{C\u008e\u009aWcG{\u0091\u00a0\u000f\u0001\u00dbL\u00f1\u009c;\u00dc\t\u0099\u00fb-\u00a5\u00c9)\u00c9\u00c0T\u00b1\u001bd\"R\u00f5>\u00bbe\u00e8~\u00e5\u00cf\u001a\u009f\u00e5\\\u0091\u00b6\u001d\u0010\u00d3\u00a9\u00c3_\u00f9\u0083LU\u008d@\u00fd\u00d0\u0096\u008e\u00a2R\u0010\u00c6\u00aa\u00cd\u0007p\u00bd\u0092\u00e6q\u00a4\u00faF\u008f\u0092\u00bbS\u0018(\u009a*\u00cb\u0005{=\u0001Ar\u00bbb\u000eM\f\u00da\u0002F\u0002Ee\u00ec\u00a5\u00dc\u0010\u00e6\u00df\u00c8\u009f\u0014r\u0084\u00f72\u008bi'\u0099\u00edz\u0011\u0010\u00b79\u00a9\u00e7\u0000\u00ee=>\u00d2q:KW\u00a8=7\u00109\u00f9xDd\u009eL\u00c8:v\u00cd\u001f\u00cd\u00c5\u00f6>\u0010\u0014Q\u00e1\u00e2\u009b/g\u0086\u00b7\u00a8\u0005\u00d3@\u00a4s\u009e\u0010\u00efSv\u0086l\u0012_\u00dd\u0092k\u000bD8(\u0085jH\u0086\u0004\u00d9\u00adr^Co\u0017c\u00d9\u00ad\t\u0003\u00b0\u00a6\u0095\u00fdcL0\u00a9\u000b\u001d>\u0092\u00b2Z\u00feoH>T\u00fb\u00cdew^\u00aa\u0097\u0094m#\u00d7\u00a1j\u0082b\u009em\u00ed\u00bd\u00d6\u00de\u00d8\u00d8\u00c9Fq\u0095\u00b1\u00d6\u00e1u\u0083u\u0015\"lp#\u00edP\u0013\u001d\u0099\u00f2\u00840l9\u00ef\u009d0\u0095\u00c5\u00be\u00a9\u009b.D\u001b\u00af\u00c9\u0083\u0081\u00f1G\u00b6\u008b\u0086\u0006j\u00b7s\u00be\u00d1Z\u00df\u0006\u001b\u0011\u008e\u00ea\u0080\"B(}\u00d5\u001a$\u008f\u00b2IZ\u00e7R\u00c3\u00fc\u00b9\u0092&\u00fa)T8I\u00cb\u00df\u00b07\u00e4]a\u0019\u0015\u0086\u008f!85S".length();
                var5_7 = 80;
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
                    var9_3[var7_4++] = boo.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "9\u00d7<LZ&\u00e9~\u00b3y-|\u00b5,Z\u00dc\u00bb\u00e4r$\u00f8qNE\u00a8AUj\u00aeg\u009bA\u00dc\u001a$\u0088\u0001\u0092\u0098b\"\u00de\u0091`\u00c2A;{T\r\u0013\u0082 \u00fa:M[@l\u00dd\u008b|!d\u00f9#\u0018\u00d8\u0001A\u008f\u00f6L\u00eb\u00dah\u00028\u008a\u00e3E\u0001OW\u00c3G|S+\u0088!\u0096+\u00ee\u00d1\u0007\u0014F\u00d2\u0099\u00d0C\u00b5|H\u00cf\u00e6\u00eb\u008d\u00d5@\u00a8\n\u0098Y\u0088\u00b1\u00c6\u0085,t\u008fI\u00bd\u00fd\u00b2\"\u0099/\u0005;b\u001e\u00bbe\u00f3\u00e7\u00dc\u0085\u00d5\u0084\u00ab\u00ean5\u00f0p\u00e1\u00b5\u00f5\u0096)T\u0002\u00d2\u00e2\u0096\u00f1\u00ba0\u00fd\u00c8\u009c0%ksX\u00b8\u00a6A\u00d1\u0081B\u00d8:\u00ad";
                    var8_6 = "9\u00d7<LZ&\u00e9~\u00b3y-|\u00b5,Z\u00dc\u00bb\u00e4r$\u00f8qNE\u00a8AUj\u00aeg\u009bA\u00dc\u001a$\u0088\u0001\u0092\u0098b\"\u00de\u0091`\u00c2A;{T\r\u0013\u0082 \u00fa:M[@l\u00dd\u008b|!d\u00f9#\u0018\u00d8\u0001A\u008f\u00f6L\u00eb\u00dah\u00028\u008a\u00e3E\u0001OW\u00c3G|S+\u0088!\u0096+\u00ee\u00d1\u0007\u0014F\u00d2\u0099\u00d0C\u00b5|H\u00cf\u00e6\u00eb\u008d\u00d5@\u00a8\n\u0098Y\u0088\u00b1\u00c6\u0085,t\u008fI\u00bd\u00fd\u00b2\"\u0099/\u0005;b\u001e\u00bbe\u00f3\u00e7\u00dc\u0085\u00d5\u0084\u00ab\u00ean5\u00f0p\u00e1\u00b5\u00f5\u0096)T\u0002\u00d2\u00e2\u0096\u00f1\u00ba0\u00fd\u00c8\u009c0%ksX\u00b8\u00a6A\u00d1\u0081B\u00d8:\u00ad".length();
                    var5_7 = 104;
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
                    var9_3[var7_4++] = boo.a(var10_9).intern();
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
        boo.c = var9_3;
        boo.d = new String[15];
        boo.prm = LogManager.getLogger();
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3936;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("boo", exception);
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
            boo.d[n2] = boo.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = boo.a(n, l);
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
            throw new RuntimeException("boo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(boo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

