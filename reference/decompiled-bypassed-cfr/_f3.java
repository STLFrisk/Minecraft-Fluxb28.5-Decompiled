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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _f3
extends i2h
implements j9i {
    private boolean qas;
    private String gmn;
    private static final int[][][] nnc;
    private int sty;
    private double nmj;
    private double gpf;
    private double dx5;
    private double w2n;
    private double f68;
    private double hai;
    private double cry;
    private double hwp;
    private static final long b;
    private static final String[] e;
    private static final String[] g;
    private static final Map h;

    public _f3(t9d t9d2) {
        super(t9d2);
        this.gz8 = true;
        this.yxc(0.98f, 0.7f);
    }

    /*
     * Exception decompiling
     */
    public static _f3 _cl(t9d var0, double var1_1, double var3_2, double var5_3, _f3$c3d var7_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    @Override
    public boolean _p9() {
        return false;
    }

    @Override
    public void tbj() {
        this.oit.kp2(17, new Integer(0));
        this.oit.kp2(18, new Integer(1));
        this.oit.kp2(19, new Float(0.0f));
        this.oit.kp2(20, new Integer(0));
        this.oit.kp2(21, new Integer(6));
        this.oit.kp2(22, (byte)0);
    }

    @Override
    public nh4 tjo(i2h i2h2) {
        nh4 nh42;
        block6: {
            block5: {
                i2h i2h3;
                block4: {
                    int n = t9d.b();
                    try {
                        try {
                            i2h3 = i2h2;
                            if (n == 0) break block4;
                            if (!i2h3.tfh()) break block5;
                        }
                        catch (oov oov2) {
                            throw _f3.a(oov2);
                        }
                        i2h3 = i2h2;
                    }
                    catch (oov oov3) {
                        throw _f3.a(oov3);
                    }
                }
                nh42 = i2h3.aaw();
                break block6;
            }
            nh42 = null;
        }
        return nh42;
    }

    @Override
    public nh4 q3r() {
        return null;
    }

    @Override
    public boolean tfh() {
        return true;
    }

    public _f3(t9d t9d2, double d, double d2, double d3) {
        this(t9d2);
        this.m6_(d, d2, d3);
        this.icv = 0.0;
        this.mop = 0.0;
        this.bw4 = 0.0;
        this.bc1 = d;
        this.o_z = d2;
        this.a4d = d3;
    }

    @Override
    public double yyb() {
        return 0.0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean m1t(ofh var1_1, float var2_2) {
        block42: {
            block43: {
                block50: {
                    block51: {
                        block55: {
                            block54: {
                                block53: {
                                    block52: {
                                        block49: {
                                            block48: {
                                                block47: {
                                                    block46: {
                                                        block44: {
                                                            block45: {
                                                                var3_3 = t9d.b();
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v0 = this.oay.v0f;
                                                                                        if (var3_3 == 0) break block42;
                                                                                        if (v0) break block43;
                                                                                    }
                                                                                    catch (oov v1) {
                                                                                        throw _f3.a(v1);
                                                                                    }
                                                                                    v0 = this.ma9;
                                                                                    if (var3_3 == 0) break block42;
                                                                                }
                                                                                catch (oov v2) {
                                                                                    throw _f3.a(v2);
                                                                                }
                                                                                if (v0) break block43;
                                                                            }
                                                                            catch (oov v3) {
                                                                                throw _f3.a(v3);
                                                                            }
                                                                            v4 = this.nss(var1_1);
                                                                            if (var3_3 == 0) break block44;
                                                                        }
                                                                        catch (oov v5) {
                                                                            throw _f3.a(v5);
                                                                        }
                                                                        if (!v4) break block45;
                                                                    }
                                                                    catch (oov v6) {
                                                                        throw _f3.a(v6);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (oov v7) {
                                                                    throw _f3.a(v7);
                                                                }
                                                            }
                                                            this.leq(-this.ov7());
                                                            this.iux(10);
                                                            this.dxm();
                                                            this.xbf(this._3r() + var2_2 * 10.0f);
                                                            v4 = var1_1.nra() instanceof ha9;
                                                        }
                                                        try {
                                                            try {
                                                                if (var3_3 == 0) break block46;
                                                                if (!v4) break block47;
                                                            }
                                                            catch (oov v8) {
                                                                throw _f3.a(v8);
                                                            }
                                                            v4 = ((ha9)var1_1.nra()).lls.g40;
                                                        }
                                                        catch (oov v9) {
                                                            throw _f3.a(v9);
                                                        }
                                                    }
                                                    try {
                                                        if (var3_3 == 0) break block48;
                                                        if (!v4) break block47;
                                                    }
                                                    catch (oov v10) {
                                                        throw _f3.a(v10);
                                                    }
                                                    v4 = true;
                                                    break block48;
                                                }
                                                v4 = false;
                                            }
                                            var4_4 = v4;
                                            try {
                                                try {
                                                    v11 = var4_4;
                                                    if (var3_3 == 0) break block49;
                                                    if (!v11) {
                                                    }
                                                    ** GOTO lbl91
                                                }
                                                catch (oov v12) {
                                                    throw _f3.a(v12);
                                                }
                                                cfr_temp_0 = this._3r() - 40.0f;
                                                v11 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            }
                                            catch (oov v13) {
                                                throw _f3.a(v13);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var3_3 == 0) break block50;
                                                        if (v11 <= false) break block51;
                                                    }
                                                    catch (oov v14) {
                                                        throw _f3.a(v14);
                                                    }
lbl91:
                                                    // 2 sources

                                                    v15 = this.wgv;
                                                    if (var3_3 == 0) break block52;
                                                }
                                                catch (oov v16) {
                                                    throw _f3.a(v16);
                                                }
                                                if (v15 == null) break block53;
                                            }
                                            catch (oov v17) {
                                                throw _f3.a(v17);
                                            }
                                            v15 = this.wgv;
                                        }
                                        catch (oov v18) {
                                            throw _f3.a(v18);
                                        }
                                    }
                                    v15.nw9(null);
                                }
                                try {
                                    try {
                                        try {
                                            v19 = var4_4;
                                            if (var3_3 == 0) break block54;
                                            if (v19) {
                                            }
                                            ** GOTO lbl135
                                        }
                                        catch (oov v20) {
                                            throw _f3.a(v20);
                                        }
                                        v21 = this;
                                        if (var3_3 == 0) break block55;
                                    }
                                    catch (oov v22) {
                                        throw _f3.a(v22);
                                    }
                                    v19 = v21.qrh();
                                }
                                catch (oov v23) {
                                    throw _f3.a(v23);
                                }
                            }
                            try {
                                block56: {
                                    try {
                                        if (v19) break block56;
                                        this._kl();
                                        if (var3_3 != 0) break block51;
                                    }
                                    catch (oov v24) {
                                        throw _f3.a(v24);
                                    }
                                }
                                v21 = this;
                            }
                            catch (oov v25) {
                                throw _f3.a(v25);
                            }
                        }
                        v21.szd(var1_1);
                    }
                    v11 = true;
                }
                return v11;
            }
            v0 = true;
        }
        return v0;
    }

    public void szd(ofh ofh2) {
        long l = b ^ 0x203B5F822681L;
        int n = t9d.b();
        this._kl();
        if (this.oay.eir()._s0((String)((Object)_f3.b("e", (int)12560, (long)(0xA61FA46751641CCL ^ l))))) {
            _f3 _f32;
            erg erg2;
            block5: {
                block6: {
                    erg2 = new erg(xbr.__n, 1);
                    try {
                        try {
                            _f32 = this;
                            if (n == 0) break block5;
                            if (_f32.gmn == null) break block6;
                        }
                        catch (oov oov2) {
                            throw _f3.a(oov2);
                        }
                        erg2.dou(this.gmn);
                    }
                    catch (oov oov3) {
                        throw _f3.a(oov3);
                    }
                }
                _f32 = this;
            }
            _f32.qji(erg2, 0.0f);
        }
    }

    @Override
    public void h38() {
        this.leq(-this.ov7());
        this.iux(10);
        this.xbf(this._3r() + this._3r() * 10.0f);
    }

    @Override
    public boolean mzu() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.ma9;
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw _f3.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void _kl() {
        super._kl();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void xx_() {
        block152: {
            block168: {
                block169: {
                    block170: {
                        block164: {
                            block160: {
                                block161: {
                                    block162: {
                                        block159: {
                                            block156: {
                                                block158: {
                                                    block157: {
                                                        block154: {
                                                            block155: {
                                                                block153: {
                                                                    block150: {
                                                                        block151: {
                                                                            block137: {
                                                                                block138: {
                                                                                    block149: {
                                                                                        block140: {
                                                                                            block141: {
                                                                                                block147: {
                                                                                                    block148: {
                                                                                                        block139: {
                                                                                                            block144: {
                                                                                                                block142: {
                                                                                                                    block143: {
                                                                                                                        block146: {
                                                                                                                            block145: {
                                                                                                                                block135: {
                                                                                                                                    block136: {
                                                                                                                                        block133: {
                                                                                                                                            block134: {
                                                                                                                                                block131: {
                                                                                                                                                    block132: {
                                                                                                                                                        var1_1 = _f3.b ^ 4587746649463L;
                                                                                                                                                        var3_2 = t9d.b();
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v0 = this.hg2();
                                                                                                                                                                if (var3_2 == 0) break block131;
                                                                                                                                                                if (v0 <= 0) break block132;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v1) {
                                                                                                                                                                throw _f3.a(v1);
                                                                                                                                                            }
                                                                                                                                                            this.iux(this.hg2() - 1);
                                                                                                                                                        }
                                                                                                                                                        catch (oov v2) {
                                                                                                                                                            throw _f3.a(v2);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v0 = (cfr_temp_0 = this._3r() - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (var3_2 == 0) break block133;
                                                                                                                                                        if (v0 <= 0) break block134;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v3) {
                                                                                                                                                        throw _f3.a(v3);
                                                                                                                                                    }
                                                                                                                                                    this.xbf(this._3r() - 1.0f);
                                                                                                                                                }
                                                                                                                                                catch (oov v4) {
                                                                                                                                                    throw _f3.a(v4);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v0 = (cfr_temp_1 = this.kfp - -64.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (var3_2 == 0) break block135;
                                                                                                                                                if (v0 >= 0) break block136;
                                                                                                                                            }
                                                                                                                                            catch (oov v5) {
                                                                                                                                                throw _f3.a(v5);
                                                                                                                                            }
                                                                                                                                            this.d0m();
                                                                                                                                        }
                                                                                                                                        catch (oov v6) {
                                                                                                                                            throw _f3.a(v6);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v0 = (int)this.oay.v0f;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (var3_2 == 0) break block137;
                                                                                                                                            if (v0 != 0) break block138;
                                                                                                                                        }
                                                                                                                                        catch (oov v7) {
                                                                                                                                            throw _f3.a(v7);
                                                                                                                                        }
                                                                                                                                        v0 = this.oay instanceof dug;
                                                                                                                                        if (var3_2 == 0) break block137;
                                                                                                                                    }
                                                                                                                                    catch (oov v8) {
                                                                                                                                        throw _f3.a(v8);
                                                                                                                                    }
                                                                                                                                    if (v0 == 0) break block138;
                                                                                                                                }
                                                                                                                                catch (oov v9) {
                                                                                                                                    throw _f3.a(v9);
                                                                                                                                }
                                                                                                                                this.oay.e8t.qek((String)_f3.b("e", (int)3932, (long)(5376615455966641275L ^ var1_1)));
                                                                                                                                var4_3 = ((dug)this.oay).ve6();
                                                                                                                                var5_6 = this.cu2();
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    v10 = this.jjl;
                                                                                                                                                                    if (var3_2 == 0) break block139;
                                                                                                                                                                    if (v10 != 0) {
                                                                                                                                                                    }
                                                                                                                                                                    ** GOTO lbl143
                                                                                                                                                                }
                                                                                                                                                                catch (oov v11) {
                                                                                                                                                                    throw _f3.a(v11);
                                                                                                                                                                }
                                                                                                                                                                v10 = (int)var4_3.ksh();
                                                                                                                                                                if (var3_2 == 0) break block140;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v12) {
                                                                                                                                                                throw _f3.a(v12);
                                                                                                                                                            }
                                                                                                                                                            if (v10 == 0) break block141;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v13) {
                                                                                                                                                            throw _f3.a(v13);
                                                                                                                                                        }
                                                                                                                                                        v14 = this;
                                                                                                                                                        if (var3_2 == 0) break block142;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v15) {
                                                                                                                                                        throw _f3.a(v15);
                                                                                                                                                    }
                                                                                                                                                    if (v14.hzp != null) break block143;
                                                                                                                                                }
                                                                                                                                                catch (oov v16) {
                                                                                                                                                    throw _f3.a(v16);
                                                                                                                                                }
                                                                                                                                                v17 = this;
                                                                                                                                                v14 = v17;
                                                                                                                                                v18 = v17.cyu;
                                                                                                                                                if (var3_2 == 0) break block144;
                                                                                                                                            }
                                                                                                                                            catch (oov v19) {
                                                                                                                                                throw _f3.a(v19);
                                                                                                                                            }
                                                                                                                                            v14.cyu = v18 + 1;
                                                                                                                                            if (v18 < var5_6) break block143;
                                                                                                                                        }
                                                                                                                                        catch (oov v20) {
                                                                                                                                            throw _f3.a(v20);
                                                                                                                                        }
                                                                                                                                        this.cyu = var5_6;
                                                                                                                                        this.rr6 = this.k0g();
                                                                                                                                        v21 = this.oay.vzz.gs_();
                                                                                                                                        if (var3_2 == 0) break block145;
                                                                                                                                    }
                                                                                                                                    catch (oov v22) {
                                                                                                                                        throw _f3.a(v22);
                                                                                                                                    }
                                                                                                                                    if (v21 == -1) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl127
                                                                                                                                }
                                                                                                                                catch (oov v23) {
                                                                                                                                    throw _f3.a(v23);
                                                                                                                                }
                                                                                                                                var6_7 = 0;
                                                                                                                                try {
                                                                                                                                    if (var3_2 != 0) break block146;
lbl127:
                                                                                                                                    // 2 sources

                                                                                                                                    v21 = -1;
                                                                                                                                }
                                                                                                                                catch (oov v24) {
                                                                                                                                    throw _f3.a(v24);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var6_7 = v21;
                                                                                                                        }
                                                                                                                        this.zye(var6_7);
                                                                                                                    }
                                                                                                                    v14 = this;
                                                                                                                }
                                                                                                                v18 = 0;
                                                                                                            }
                                                                                                            try {
                                                                                                                v14.jjl = v18;
                                                                                                                if (var3_2 != 0) break block141;
lbl143:
                                                                                                                // 2 sources

                                                                                                                v10 = this.cyu;
                                                                                                            }
                                                                                                            catch (oov v25) {
                                                                                                                throw _f3.a(v25);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var3_2 == 0) break block147;
                                                                                                                if (v10 <= 0) break block148;
                                                                                                            }
                                                                                                            catch (oov v26) {
                                                                                                                throw _f3.a(v26);
                                                                                                            }
                                                                                                            this.cyu -= 4;
                                                                                                        }
                                                                                                        catch (oov v27) {
                                                                                                            throw _f3.a(v27);
                                                                                                        }
                                                                                                    }
                                                                                                    v10 = this.cyu;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var3_2 == 0) break block140;
                                                                                                        if (v10 >= 0) break block141;
                                                                                                    }
                                                                                                    catch (oov v28) {
                                                                                                        throw _f3.a(v28);
                                                                                                    }
                                                                                                    this.cyu = 0;
                                                                                                }
                                                                                                catch (oov v29) {
                                                                                                    throw _f3.a(v29);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                v30 = this;
                                                                                                if (var3_2 == 0) break block149;
                                                                                                v10 = v30.rr6;
                                                                                            }
                                                                                            catch (oov v31) {
                                                                                                throw _f3.a(v31);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (v10 > 0) {
                                                                                                --this.rr6;
                                                                                            }
                                                                                        }
                                                                                        catch (oov v32) {
                                                                                            throw _f3.a(v32);
                                                                                        }
                                                                                        v30 = this;
                                                                                    }
                                                                                    v30.oay.e8t.uio();
                                                                                }
                                                                                v0 = (int)this.oay.v0f;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var3_2 == 0) break block150;
                                                                                        if (v0 != 0) {
                                                                                        }
                                                                                        ** GOTO lbl233
                                                                                    }
                                                                                    catch (oov v33) {
                                                                                        throw _f3.a(v33);
                                                                                    }
                                                                                    v34 = this;
                                                                                    if (var3_2 == 0) break block151;
                                                                                }
                                                                                catch (oov v35) {
                                                                                    throw _f3.a(v35);
                                                                                }
                                                                                if (v34.sty > 0) {
                                                                                }
                                                                                ** GOTO lbl224
                                                                            }
                                                                            catch (oov v36) {
                                                                                throw _f3.a(v36);
                                                                            }
                                                                            var4_4 = this.o2v + (this.nmj - this.o2v) / (double)this.sty;
                                                                            var6_8 = this.kfp + (this.gpf - this.kfp) / (double)this.sty;
                                                                            var8_9 = this.vbd + (this.dx5 - this.vbd) / (double)this.sty;
                                                                            var10_11 = fe6.lrs(this.w2n - (double)this.x5k);
                                                                            try {
                                                                                this.x5k = (float)((double)this.x5k + var10_11 / (double)this.sty);
                                                                                this.y2i = (float)((double)this.y2i + (this.f68 - (double)this.y2i) / (double)this.sty);
                                                                                --this.sty;
                                                                                this.m6_(var4_4, var6_8, var8_9);
                                                                                this.iym(this.x5k, this.y2i);
                                                                                if (var3_2 != 0) break block152;
lbl224:
                                                                                // 2 sources

                                                                                this.m6_(this.o2v, this.kfp, this.vbd);
                                                                                v34 = this;
                                                                            }
                                                                            catch (oov v37) {
                                                                                throw _f3.a(v37);
                                                                            }
                                                                        }
                                                                        try {
                                                                            v34.iym(this.x5k, this.y2i);
                                                                            if (var3_2 != 0) break block152;
lbl233:
                                                                            // 2 sources

                                                                            this.bc1 = this.o2v;
                                                                            this.o_z = this.kfp;
                                                                            this.a4d = this.vbd;
                                                                            this.mop -= 0.03999999910593033;
                                                                            v0 = fe6.jqf(this.o2v);
                                                                        }
                                                                        catch (oov v38) {
                                                                            throw _f3.a(v38);
                                                                        }
                                                                    }
                                                                    var4_5 = v0;
                                                                    var5_6 = fe6.jqf(this.kfp);
                                                                    var6_7 = fe6.jqf(this.vbd);
                                                                    try {
                                                                        if (y0y.slf(this.oay, new mew(var4_5, var5_6 - 1, var6_7))) {
                                                                            --var5_6;
                                                                        }
                                                                    }
                                                                    catch (oov v39) {
                                                                        throw _f3.a(v39);
                                                                    }
                                                                    var7_12 = new mew(var4_5, var5_6, var6_7);
                                                                    var8_10 = this.oay.getBlockState(var7_12);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v40 = var8_10;
                                                                                if (var3_2 == 0) break block153;
                                                                                if (y0y.al_(v40)) {
                                                                                }
                                                                                ** GOTO lbl281
                                                                            }
                                                                            catch (oov v41) {
                                                                                throw _f3.a(v41);
                                                                            }
                                                                            this.dfm(var7_12, var8_10);
                                                                            if (var3_2 == 0) break block154;
                                                                        }
                                                                        catch (oov v42) {
                                                                            throw _f3.a(v42);
                                                                        }
                                                                        v40 = var8_10;
                                                                    }
                                                                    catch (oov v43) {
                                                                        throw _f3.a(v43);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (v40.r_y() != ox_.c0r) break block155;
                                                                        this.xr9(var4_5, var5_6, var6_7, (Boolean)var8_10.dil(gsz.t0z));
                                                                        if (var3_2 != 0) break block155;
                                                                    }
                                                                    catch (oov v44) {
                                                                        throw _f3.a(v44);
                                                                    }
lbl281:
                                                                    // 2 sources

                                                                    this.brq();
                                                                }
                                                                catch (oov v45) {
                                                                    throw _f3.a(v45);
                                                                }
                                                            }
                                                            this.urw();
                                                            this.y2i = 0.0f;
                                                        }
                                                        var9_13 = this.bc1 - this.o2v;
                                                        var11_14 = this.a4d - this.vbd;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v46 = var9_13 * var9_13 + var11_14 * var11_14;
                                                                        if (var3_2 == 0) break block156;
                                                                        if (!(v46 > 0.001)) break block157;
                                                                    }
                                                                    catch (oov v47) {
                                                                        throw _f3.a(v47);
                                                                    }
                                                                    this.x5k = (float)(fe6.yr8(var11_14, var9_13) * 180.0 / 3.141592653589793);
                                                                    v48 = this;
                                                                    if (var3_2 == 0) break block158;
                                                                }
                                                                catch (oov v49) {
                                                                    throw _f3.a(v49);
                                                                }
                                                                if (v48.qas) {
                                                                }
                                                                break block157;
                                                            }
                                                            catch (oov v50) {
                                                                throw _f3.a(v50);
                                                            }
                                                            this.x5k += 180.0f;
                                                        }
                                                        catch (oov v51) {
                                                            throw _f3.a(v51);
                                                        }
                                                    }
                                                    v48 = this;
                                                }
                                                v46 = fe6.qsy(v48.x5k - this.p3h);
                                            }
                                            var13_15 = v46;
                                            try {
                                                try {
                                                    try {
                                                        if (var3_2 == 0) break block159;
                                                        if (var13_15 < -170.0) ** GOTO lbl335
                                                    }
                                                    catch (oov v52) {
                                                        throw _f3.a(v52);
                                                    }
                                                    if (var13_15 >= 170.0) {
                                                    }
                                                    break block160;
                                                }
                                                catch (oov v53) {
                                                    throw _f3.a(v53);
                                                }
lbl335:
                                                // 2 sources

                                                this.x5k += 180.0f;
                                            }
                                            catch (oov v54) {
                                                throw _f3.a(v54);
                                            }
                                        }
                                        try {
                                            v55 = this;
                                            v56 = this.qas;
                                            if (var3_2 == 0) break block161;
                                            if (v56) break block162;
                                        }
                                        catch (oov v57) {
                                            throw _f3.a(v57);
                                        }
                                        v56 = true;
                                        break block161;
                                    }
                                    v56 = false;
                                }
                                v55.qas = v56;
                            }
                            this.iym(this.x5k, this.y2i);
                            for (i2h var16_17 : this.oay.p05(this, this.aaw().c2h(0.20000000298023224, 0.0, 0.20000000298023224))) {
                                block165: {
                                    block167: {
                                        block166: {
                                            block163: {
                                                try {
                                                    try {
                                                        try {
                                                            v58 = var16_17;
                                                            if (var3_2 == 0) break block163;
                                                            v59 = this;
                                                            if (var3_2 == 0) break block164;
                                                        }
                                                        catch (oov v60) {
                                                            throw _f3.a(v60);
                                                        }
                                                        if (v58 == v59.wgv) break block165;
                                                    }
                                                    catch (oov v61) {
                                                        throw _f3.a(v61);
                                                    }
                                                    v58 = var16_17;
                                                }
                                                catch (oov v62) {
                                                    throw _f3.a(v62);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v63 = v58.tfh();
                                                        if (var3_2 == 0) break block166;
                                                        if (!v63) break block165;
                                                    }
                                                    catch (oov v64) {
                                                        throw _f3.a(v64);
                                                    }
                                                    v65 = var16_17;
                                                    if (var3_2 == 0) break block167;
                                                }
                                                catch (oov v66) {
                                                    throw _f3.a(v66);
                                                }
                                                v63 = v65 instanceof _f3;
                                            }
                                            catch (oov v67) {
                                                throw _f3.a(v67);
                                            }
                                        }
                                        if (!v63) break block165;
                                        v65 = var16_17;
                                    }
                                    v65.u_w(this);
                                }
                                if (var3_2 != 0) continue;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v68 = this;
                                                if (var3_2 == 0) break block168;
                                                if (v68.wgv == null) break block169;
                                            }
                                            catch (oov v69) {
                                                throw _f3.a(v69);
                                            }
                                            v70 = this.wgv.ma9;
                                            if (var3_2 == 0) break block152;
                                        }
                                        catch (oov v71) {
                                            throw _f3.a(v71);
                                        }
                                        if (!v70) break block169;
                                    }
                                    catch (oov v72) {
                                        throw _f3.a(v72);
                                    }
                                    v73 = this;
                                    if (var3_2 == 0) break block170;
                                }
                                catch (oov v74) {
                                    throw _f3.a(v74);
                                }
                                v75 = v73.wgv.hzp;
                                v59 = this;
                            }
                            catch (oov v76) {
                                throw _f3.a(v76);
                            }
                        }
                        try {
                            if (v75 == v59) {
                                this.wgv.hzp = null;
                            }
                        }
                        catch (oov v77) {
                            throw _f3.a(v77);
                        }
                        v73 = this;
                    }
                    v73.wgv = null;
                }
                v68 = this;
            }
            v70 = v68.r24();
        }
    }

    public double db_() {
        return 0.4;
    }

    public void xr9(int n, int n2, int n3, boolean bl) {
    }

    public void brq() {
        block11: {
            block10: {
                _f3 _f32;
                boolean bl;
                block8: {
                    int n;
                    block9: {
                        double d = this.db_();
                        this.icv = fe6.lft(this.icv, -d, d);
                        this.bw4 = fe6.lft(this.bw4, -d, d);
                        n = t9d.b();
                        try {
                            try {
                                bl = this.lfk;
                                if (n == 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw _f3.a(oov2);
                            }
                            this.icv *= 0.5;
                            this.mop *= 0.5;
                            this.bw4 *= 0.5;
                        }
                        catch (oov oov3) {
                            throw _f3.a(oov3);
                        }
                    }
                    try {
                        this.vjj(this.icv, this.mop, this.bw4);
                        _f32 = this;
                        if (n == 0) break block10;
                        bl = _f32.lfk;
                    }
                    catch (oov oov4) {
                        throw _f3.a(oov4);
                    }
                }
                try {
                    if (bl) break block11;
                    this.icv *= (double)0.95f;
                    this.mop *= (double)0.95f;
                    _f32 = this;
                }
                catch (oov oov5) {
                    throw _f3.a(oov5);
                }
            }
            _f32.bw4 *= (double)0.95f;
        }
    }

    /*
     * Exception decompiling
     */
    public void dfm(mew var1_1, zfz var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    public void zye() {
        block8: {
            block6: {
                int n = t9d.c();
                try {
                    _f3 _f32;
                    block7: {
                        try {
                            try {
                                _f32 = this;
                                if (n != 0) break block6;
                                if (_f32.wgv == null) break block7;
                            }
                            catch (oov oov2) {
                                throw _f3.a(oov2);
                            }
                            this.icv *= (double)0.997f;
                            this.mop *= 0.0;
                            this.bw4 *= (double)0.997f;
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw _f3.a(oov3);
                        }
                    }
                    this.icv *= (double)0.96f;
                    this.mop *= 0.0;
                    _f32 = this;
                }
                catch (oov oov4) {
                    throw _f3.a(oov4);
                }
            }
            _f32.bw4 *= (double)0.96f;
        }
    }

    @Override
    public void m6_(double d, double d2, double d3) {
        this.o2v = d;
        this.kfp = d2;
        this.vbd = d3;
        float f = this.uo6 / 2.0f;
        float f2 = this.ikl;
        this.qq7(new nh4(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    /*
     * Unable to fully structure code
     */
    public fqr zou(double var1_1, double var3_2, double var5_3, double var7_4) {
        block42: {
            block46: {
                block49: {
                    block48: {
                        block47: {
                            block45: {
                                block44: {
                                    block43: {
                                        block41: {
                                            block39: {
                                                block40: {
                                                    var10_5 = fe6.jqf(var1_1);
                                                    var11_6 = fe6.jqf(var3_2);
                                                    var9_7 = t9d.c();
                                                    var12_8 = fe6.jqf(var5_3);
                                                    try {
                                                        try {
                                                            v0 = this.oay;
                                                            v1 = new mew(var10_5, var11_6 - 1, var12_8);
                                                            if (var9_7 != 0) break block39;
                                                            if (!y0y.slf(v0, v1)) break block40;
                                                        }
                                                        catch (oov v2) {
                                                            throw _f3.a(v2);
                                                        }
                                                        --var11_6;
                                                    }
                                                    catch (oov v3) {
                                                        throw _f3.a(v3);
                                                    }
                                                }
                                                v0 = this.oay;
                                                v1 = new mew(var10_5, var11_6, var12_8);
                                            }
                                            var13_9 = v0.getBlockState(v1);
                                            try {
                                                try {
                                                    v4 = var13_9;
                                                    if (var9_7 != 0) break block41;
                                                    if (!y0y.al_(v4)) break block42;
                                                }
                                                catch (oov v5) {
                                                    throw _f3.a(v5);
                                                }
                                                v4 = var13_9;
                                            }
                                            catch (oov v6) {
                                                throw _f3.a(v6);
                                            }
                                        }
                                        var14_10 = (y0y$_zr)v4.dil(((y0y)var13_9.r_y()).fvr());
                                        var3_2 = var11_6;
                                        try {
                                            try {
                                                v7 = var14_10.t1s();
                                                if (var9_7 != 0) break block43;
                                                if (v7 == 0) break block44;
                                            }
                                            catch (oov v8) {
                                                throw _f3.a(v8);
                                            }
                                            v7 = var11_6 + 1;
                                        }
                                        catch (oov v9) {
                                            throw _f3.a(v9);
                                        }
                                    }
                                    var3_2 = v7;
                                }
                                var15_11 = _f3.nnc[var14_10.g_6()];
                                var16_12 = var15_11[1][0] - var15_11[0][0];
                                var18_13 = var15_11[1][2] - var15_11[0][2];
                                var20_14 = Math.sqrt(var16_12 * var16_12 + var18_13 * var18_13);
                                var1_1 += (var16_12 /= var20_14) * var7_4;
                                var5_3 += (var18_13 /= var20_14) * var7_4;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v10 = var15_11[0][1];
                                                    if (var9_7 != 0) break block45;
                                                    if (v10 != 0) {
                                                    }
                                                    ** GOTO lbl94
                                                }
                                                catch (oov v11) {
                                                    throw _f3.a(v11);
                                                }
                                                v10 = fe6.jqf(var1_1) - var10_5;
                                                if (var9_7 != 0) break block45;
                                            }
                                            catch (oov v12) {
                                                throw _f3.a(v12);
                                            }
                                            if (v10 == var15_11[0][0]) {
                                            }
                                            ** GOTO lbl94
                                        }
                                        catch (oov v13) {
                                            throw _f3.a(v13);
                                        }
                                        v10 = fe6.jqf(var5_3) - var12_8;
                                        if (var9_7 != 0) break block45;
                                    }
                                    catch (oov v14) {
                                        throw _f3.a(v14);
                                    }
                                    if (v10 == var15_11[0][2]) {
                                    }
                                    ** GOTO lbl94
                                }
                                catch (oov v15) {
                                    throw _f3.a(v15);
                                }
                                var3_2 += (double)var15_11[0][1];
                                try {
                                    if (var9_7 == 0) break block46;
lbl94:
                                    // 4 sources

                                    v10 = var15_11[1][1];
                                }
                                catch (oov v16) {
                                    throw _f3.a(v16);
                                }
                            }
                            try {
                                try {
                                    if (var9_7 != 0) break block47;
                                    if (v10 == 0) break block46;
                                }
                                catch (oov v17) {
                                    throw _f3.a(v17);
                                }
                                v10 = fe6.jqf(var1_1) - var10_5;
                            }
                            catch (oov v18) {
                                throw _f3.a(v18);
                            }
                        }
                        try {
                            try {
                                try {
                                    v19 = var15_11[1][0];
                                    if (var9_7 != 0) break block48;
                                    if (v10 != v19) break block46;
                                }
                                catch (oov v20) {
                                    throw _f3.a(v20);
                                }
                                v21 = var5_3;
                                if (var9_7 != 0) break block49;
                            }
                            catch (oov v22) {
                                throw _f3.a(v22);
                            }
                            v10 = fe6.jqf(v21) - var12_8;
                            v19 = var15_11[1][2];
                        }
                        catch (oov v23) {
                            throw _f3.a(v23);
                        }
                    }
                    try {
                        if (v10 != v19) break block46;
                        v21 = var3_2 + (double)var15_11[1][1];
                    }
                    catch (oov v24) {
                        throw _f3.a(v24);
                    }
                }
                var3_2 = v21;
            }
            return this.vag(var1_1, var3_2, var5_3);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public fqr vag(double var1_1, double var3_2, double var5_3) {
        block26: {
            block33: {
                block32: {
                    block30: {
                        block31: {
                            block28: {
                                block29: {
                                    block27: {
                                        block25: {
                                            block23: {
                                                block24: {
                                                    var8_4 = fe6.jqf(var1_1);
                                                    var9_5 = fe6.jqf(var3_2);
                                                    var7_6 = t9d.b();
                                                    var10_7 = fe6.jqf(var5_3);
                                                    try {
                                                        try {
                                                            v0 = this.oay;
                                                            v1 = new mew(var8_4, var9_5 - 1, var10_7);
                                                            if (var7_6 == 0) break block23;
                                                            if (!y0y.slf(v0, v1)) break block24;
                                                        }
                                                        catch (oov v2) {
                                                            throw _f3.a(v2);
                                                        }
                                                        --var9_5;
                                                    }
                                                    catch (oov v3) {
                                                        throw _f3.a(v3);
                                                    }
                                                }
                                                v0 = this.oay;
                                                v1 = new mew(var8_4, var9_5, var10_7);
                                            }
                                            var11_8 = v0.getBlockState(v1);
                                            try {
                                                try {
                                                    v4 = var11_8;
                                                    if (var7_6 == 0) break block25;
                                                    if (!y0y.al_(v4)) break block26;
                                                }
                                                catch (oov v5) {
                                                    throw _f3.a(v5);
                                                }
                                                v4 = var11_8;
                                            }
                                            catch (oov v6) {
                                                throw _f3.a(v6);
                                            }
                                        }
                                        var12_9 = (y0y$_zr)v4.dil(((y0y)var11_8.r_y()).fvr());
                                        var13_10 = _f3.nnc[var12_9.g_6()];
                                        var14_11 = 0.0;
                                        var16_12 = (double)var8_4 + 0.5 + (double)var13_10[0][0] * 0.5;
                                        var18_13 = (double)var9_5 + 0.0625 + (double)var13_10[0][1] * 0.5;
                                        var20_14 = (double)var10_7 + 0.5 + (double)var13_10[0][2] * 0.5;
                                        var22_15 = (double)var8_4 + 0.5 + (double)var13_10[1][0] * 0.5;
                                        var24_16 = (double)var9_5 + 0.0625 + (double)var13_10[1][1] * 0.5;
                                        var26_17 = (double)var10_7 + 0.5 + (double)var13_10[1][2] * 0.5;
                                        var28_18 = var22_15 - var16_12;
                                        var30_19 = (var24_16 - var18_13) * 2.0;
                                        var32_20 = var26_17 - var20_14;
                                        try {
                                            cfr_temp_0 = var28_18 - 0.0;
                                            v7 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                            if (var7_6 == 0) break block27;
                                            if (v7 == false) {
                                            }
                                            ** GOTO lbl62
                                        }
                                        catch (oov v8) {
                                            throw _f3.a(v8);
                                        }
                                        var1_1 = (double)var8_4 + 0.5;
                                        var14_11 = var5_3 - (double)var10_7;
                                        try {
                                            try {
                                                if (var7_6 != 0) break block28;
lbl62:
                                                // 2 sources

                                                v9 = var32_20;
                                                v10 = 0.0;
                                                if (var7_6 == 0) break block29;
                                            }
                                            catch (oov v11) {
                                                throw _f3.a(v11);
                                            }
                                            cfr_temp_1 = v9 - v10;
                                            v7 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                        }
                                        catch (oov v12) {
                                            throw _f3.a(v12);
                                        }
                                    }
                                    if (v7 != false) ** GOTO lbl79
                                    var5_3 = (double)var10_7 + 0.5;
                                    var14_11 = var1_1 - (double)var8_4;
                                    try {
                                        if (var7_6 != 0) break block28;
lbl79:
                                        // 2 sources

                                        v9 = var1_1;
                                        v10 = var16_12;
                                    }
                                    catch (oov v13) {
                                        throw _f3.a(v13);
                                    }
                                }
                                var34_21 = v9 - v10;
                                var36_22 = var5_3 - var20_14;
                                var14_11 = (var34_21 * var28_18 + var36_22 * var32_20) * 2.0;
                            }
                            var1_1 = var16_12 + var28_18 * var14_11;
                            var3_2 = var18_13 + var30_19 * var14_11;
                            var5_3 = var20_14 + var32_20 * var14_11;
                            try {
                                cfr_temp_2 = var30_19 - 0.0;
                                v14 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                if (var7_6 == 0) break block30;
                                if (v14 >= 0) break block31;
                            }
                            catch (oov v15) {
                                throw _f3.a(v15);
                            }
                            var3_2 += 1.0;
                        }
                        try {
                            v16 = var30_19;
                            v17 = 0.0;
                            if (var7_6 == 0) break block32;
                            cfr_temp_3 = v16 - v17;
                            v14 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                        }
                        catch (oov v18) {
                            throw _f3.a(v18);
                        }
                    }
                    try {
                        if (v14 <= 0) break block33;
                        v16 = var3_2;
                        v17 = 0.5;
                    }
                    catch (oov v19) {
                        throw _f3.a(v19);
                    }
                }
                var3_2 = v16 + v17;
            }
            return new fqr(var1_1, var3_2, var5_3);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void cjb(bdo var1_1) {
        block38: {
            block37: {
                block30: {
                    block31: {
                        block35: {
                            block36: {
                                block32: {
                                    block34: {
                                        block33: {
                                            var2_2 = _f3.b ^ 114511510055154L;
                                            var4_3 = t9d.c();
                                            try {
                                                v0 = var1_1.dvl((String)_f3.b("e", (int)16124, (long)(2303595920650092625L ^ var2_2)));
                                                if (var4_3 != 0) break block30;
                                                if (v0 == 0) break block31;
                                            }
                                            catch (oov v1) {
                                                throw _f3.a(v1);
                                            }
                                            var5_4 = var1_1.uz7((String)_f3.b("e", (int)11476, (long)(6288157011055497841L ^ var2_2)));
                                            try {
                                                v2 = var1_1.inh((String)_f3.b("e", (int)236, (long)(8082801712640949834L ^ var2_2)), 8);
                                                if (var4_3 != 0) break block32;
                                                if (v2 != 0) {
                                                }
                                                ** GOTO lbl45
                                            }
                                            catch (oov v3) {
                                                throw _f3.a(v3);
                                            }
                                            var6_5 = e0x.mdd(var1_1.u14((String)_f3.b("e", (int)236, (long)(8082801712640949834L ^ var2_2))));
                                            try {
                                                try {
                                                    if (var4_3 != 0) break block33;
                                                    if (var6_5 == null) {
                                                    }
                                                    ** GOTO lbl37
                                                }
                                                catch (oov v4) {
                                                    throw _f3.a(v4);
                                                }
                                                this.t5j(ox_.ibw.l4i());
                                            }
                                            catch (oov v5) {
                                                throw _f3.a(v5);
                                            }
                                        }
                                        try {
                                            if (var4_3 == 0) break block34;
lbl37:
                                            // 2 sources

                                            this.t5j(var6_5.kig(var5_4));
                                        }
                                        catch (oov v6) {
                                            throw _f3.a(v6);
                                        }
                                    }
                                    try {
                                        if (var4_3 == 0) break block35;
lbl45:
                                        // 2 sources

                                        v2 = var1_1.uz7((String)_f3.b("e", (int)236, (long)(8082801712640949834L ^ var2_2)));
                                    }
                                    catch (oov v7) {
                                        throw _f3.a(v7);
                                    }
                                }
                                var6_5 = e0x.csc(v2);
                                try {
                                    try {
                                        if (var4_3 != 0) break block36;
                                        if (var6_5 == null) {
                                        }
                                        ** GOTO lbl66
                                    }
                                    catch (oov v8) {
                                        throw _f3.a(v8);
                                    }
                                    this.t5j(ox_.ibw.l4i());
                                }
                                catch (oov v9) {
                                    throw _f3.a(v9);
                                }
                            }
                            try {
                                if (var4_3 == 0) break block35;
lbl66:
                                // 2 sources

                                this.t5j(var6_5.kig(var5_4));
                            }
                            catch (oov v10) {
                                throw _f3.a(v10);
                            }
                        }
                        this.y69(var1_1.uz7((String)_f3.b("e", (int)9537, (long)(3037928665410132960L ^ var2_2))));
                    }
                    v0 = (int)var1_1.inh((String)_f3.b("e", (int)32573, (long)(6119865768790884766L ^ var2_2)), 8);
                }
                try {
                    try {
                        if (var4_3 != 0) break block37;
                        if (v0 == 0) break block38;
                    }
                    catch (oov v11) {
                        throw _f3.a(v11);
                    }
                    v0 = var1_1.u14((String)_f3.b("e", (int)32573, (long)(6119865768790884766L ^ var2_2))).length();
                }
                catch (oov v12) {
                    throw _f3.a(v12);
                }
            }
            try {
                if (v0 > 0) {
                    this.gmn = var1_1.u14((String)_f3.b("e", (int)32573, (long)(6119865768790884766L ^ var2_2)));
                }
            }
            catch (oov v13) {
                throw _f3.a(v13);
            }
        }
    }

    @Override
    public void srs(bdo bdo2) {
        block19: {
            String string;
            long l;
            block18: {
                _f3 _f32;
                int n;
                block13: {
                    block14: {
                        String string2;
                        CallSite callSite;
                        bdo bdo3;
                        zfz zfz2;
                        block17: {
                            gdz gdz2;
                            block15: {
                                gdz gdz3;
                                block16: {
                                    l = b ^ 0x1E8B8CBE4459L;
                                    n = t9d.c();
                                    try {
                                        _f32 = this;
                                        if (n != 0) break block13;
                                        if (!_f32.v3h()) break block14;
                                    }
                                    catch (oov oov2) {
                                        throw _f3.a(oov2);
                                    }
                                    bdo2.zyu((String)((Object)_f3.b("e", (int)13077, (long)(0x32485ADD8671A110L ^ l))), true);
                                    zfz2 = this.joa();
                                    gdz3 = (gdz)e0x.db8.csx(zfz2.r_y());
                                    try {
                                        try {
                                            bdo3 = bdo2;
                                            callSite = _f3.b("e", (int)4201, (long)(0x67551A9DF3208262L ^ l));
                                            gdz2 = gdz3;
                                            if (n != 0) break block15;
                                            if (gdz2 != null) break block16;
                                        }
                                        catch (oov oov3) {
                                            throw _f3.a(oov3);
                                        }
                                        string2 = "";
                                        break block17;
                                    }
                                    catch (oov oov4) {
                                        throw _f3.a(oov4);
                                    }
                                }
                                gdz2 = gdz3;
                            }
                            string2 = gdz2.toString();
                        }
                        bdo3.rjq((String)((Object)callSite), string2);
                        bdo2.iin((String)((Object)_f3.b("e", (int)30294, (long)(0x683A567F87A7E459L ^ l))), zfz2.r_y().hvp(zfz2));
                        bdo2.iin((String)((Object)_f3.b("e", (int)2643, (long)(0x2455886789F0185FL ^ l))), this.qxx());
                    }
                    _f32 = this;
                }
                try {
                    try {
                        string = _f32.gmn;
                        if (n != 0) break block18;
                        if (string == null) break block19;
                    }
                    catch (oov oov5) {
                        throw _f3.a(oov5);
                    }
                    string = this.gmn;
                }
                catch (oov oov6) {
                    throw _f3.a(oov6);
                }
            }
            try {
                if (string.length() > 0) {
                    bdo2.rjq((String)((Object)_f3.b("e", (int)23016, (long)(0x7E6E32E6C12CCBEFL ^ l))), this.gmn);
                }
            }
            catch (oov oov7) {
                throw _f3.a(oov7);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void u_w(i2h var1_1) {
        block73: {
            block83: {
                block88: {
                    block89: {
                        block90: {
                            block86: {
                                block84: {
                                    block85: {
                                        block81: {
                                            block82: {
                                                block80: {
                                                    block79: {
                                                        block77: {
                                                            block78: {
                                                                block76: {
                                                                    block75: {
                                                                        block74: {
                                                                            block72: {
                                                                                var2_2 = t9d.b();
                                                                                try {
                                                                                    try {
                                                                                        v0 = this.oay.v0f;
                                                                                        if (var2_2 == 0) break block72;
                                                                                        if (v0) break block73;
                                                                                    }
                                                                                    catch (oov v1) {
                                                                                        throw _f3.a(v1);
                                                                                    }
                                                                                    v0 = var1_1.kvx;
                                                                                }
                                                                                catch (oov v2) {
                                                                                    throw _f3.a(v2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var2_2 == 0) break block74;
                                                                                        if (v0) break block73;
                                                                                    }
                                                                                    catch (oov v3) {
                                                                                        throw _f3.a(v3);
                                                                                    }
                                                                                    v4 = this;
                                                                                    if (var2_2 == 0) break block75;
                                                                                }
                                                                                catch (oov v5) {
                                                                                    throw _f3.a(v5);
                                                                                }
                                                                                v0 = v4.kvx;
                                                                            }
                                                                            catch (oov v6) {
                                                                                throw _f3.a(v6);
                                                                            }
                                                                        }
                                                                        if (v0) break block73;
                                                                        v4 = var1_1;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var2_2 == 0) break block76;
                                                                            if (v4 == this.wgv) break block73;
                                                                        }
                                                                        catch (oov v7) {
                                                                            throw _f3.a(v7);
                                                                        }
                                                                        v4 = var1_1;
                                                                    }
                                                                    catch (oov v8) {
                                                                        throw _f3.a(v8);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (var2_2 == 0) break block77;
                                                                                                                        if (!(v4 instanceof g_3)) break block78;
                                                                                                                    }
                                                                                                                    catch (oov v9) {
                                                                                                                        throw _f3.a(v9);
                                                                                                                    }
                                                                                                                    v4 = var1_1;
                                                                                                                    if (var2_2 == 0) break block77;
                                                                                                                }
                                                                                                                catch (oov v10) {
                                                                                                                    throw _f3.a(v10);
                                                                                                                }
                                                                                                                if (v4 instanceof ha9) break block78;
                                                                                                            }
                                                                                                            catch (oov v11) {
                                                                                                                throw _f3.a(v11);
                                                                                                            }
                                                                                                            v4 = var1_1;
                                                                                                            if (var2_2 == 0) break block77;
                                                                                                        }
                                                                                                        catch (oov v12) {
                                                                                                            throw _f3.a(v12);
                                                                                                        }
                                                                                                        if (v4 instanceof osf) break block78;
                                                                                                    }
                                                                                                    catch (oov v13) {
                                                                                                        throw _f3.a(v13);
                                                                                                    }
                                                                                                    v4 = this;
                                                                                                    if (var2_2 == 0) break block77;
                                                                                                }
                                                                                                catch (oov v14) {
                                                                                                    throw _f3.a(v14);
                                                                                                }
                                                                                                if (v4.x38() != _f3$c3d.g3j) break block78;
                                                                                            }
                                                                                            catch (oov v15) {
                                                                                                throw _f3.a(v15);
                                                                                            }
                                                                                            v16 = this.icv * this.icv + this.bw4 * this.bw4;
                                                                                            v17 = 0.01;
                                                                                            if (var2_2 == 0) break block79;
                                                                                        }
                                                                                        catch (oov v18) {
                                                                                            throw _f3.a(v18);
                                                                                        }
                                                                                        if (!(v16 > v17)) break block78;
                                                                                    }
                                                                                    catch (oov v19) {
                                                                                        throw _f3.a(v19);
                                                                                    }
                                                                                    v4 = this.wgv;
                                                                                    if (var2_2 == 0) break block77;
                                                                                }
                                                                                catch (oov v20) {
                                                                                    throw _f3.a(v20);
                                                                                }
                                                                                if (v4 != null) break block78;
                                                                            }
                                                                            catch (oov v21) {
                                                                                throw _f3.a(v21);
                                                                            }
                                                                            v4 = var1_1.hzp;
                                                                            if (var2_2 == 0) break block77;
                                                                        }
                                                                        catch (oov v22) {
                                                                            throw _f3.a(v22);
                                                                        }
                                                                        if (v4 != null) break block78;
                                                                    }
                                                                    catch (oov v23) {
                                                                        throw _f3.a(v23);
                                                                    }
                                                                    var1_1.nw9(this);
                                                                }
                                                                catch (oov v24) {
                                                                    throw _f3.a(v24);
                                                                }
                                                            }
                                                            v4 = var1_1;
                                                        }
                                                        v16 = v4.o2v;
                                                        v17 = this.o2v;
                                                    }
                                                    var3_3 = v16 - v17;
                                                    var5_4 = var1_1.vbd - this.vbd;
                                                    var7_5 = var3_3 * var3_3 + var5_4 * var5_4;
                                                    try {
                                                        v25 = var7_5;
                                                        v26 = 9.999999747378752E-5;
                                                        if (var2_2 == 0) break block80;
                                                        if (!(v25 >= v26)) break block73;
                                                    }
                                                    catch (oov v27) {
                                                        throw _f3.a(v27);
                                                    }
                                                    var7_5 = fe6.dii(var7_5);
                                                    var3_3 /= var7_5;
                                                    var5_4 /= var7_5;
                                                    v25 = 1.0;
                                                    v26 = var7_5;
                                                }
                                                var9_6 = v25 / v26;
                                                try {
                                                    cfr_temp_0 = var9_6 - 1.0;
                                                    v28 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                    if (var2_2 == 0) break block81;
                                                    if (v28 <= 0) break block82;
                                                }
                                                catch (oov v29) {
                                                    throw _f3.a(v29);
                                                }
                                                var9_6 = 1.0;
                                            }
                                            var3_3 *= var9_6;
                                            var5_4 *= var9_6;
                                            var3_3 *= 0.10000000149011612;
                                            var5_4 *= 0.10000000149011612;
                                            var3_3 *= (double)(1.0f - this.u5z);
                                            var5_4 *= (double)(1.0f - this.u5z);
                                            var3_3 *= 0.5;
                                            var5_4 *= 0.5;
                                            try {
                                                v30 = var1_1;
                                                if (var2_2 == 0) break block83;
                                                v28 = (double)(v30 instanceof _f3);
                                            }
                                            catch (oov v31) {
                                                throw _f3.a(v31);
                                            }
                                        }
                                        if (v28 == false) ** GOTO lbl282
                                        var11_7 = var1_1.o2v - this.o2v;
                                        var13_8 = var1_1.vbd - this.vbd;
                                        var15_9 = new fqr(var11_7, 0.0, var13_8).kec();
                                        var16_10 = new fqr(fe6.ssk(this.x5k * 3.1415927f / 180.0f), 0.0, fe6.rtn(this.x5k * 3.1415927f / 180.0f)).kec();
                                        var17_11 = Math.abs(var15_9.xvl(var16_10));
                                        try {
                                            try {
                                                v32 = var17_11;
                                                v33 = 0.800000011920929;
                                                if (var2_2 == 0) break block84;
                                                if (!(v32 < v33)) break block85;
                                            }
                                            catch (oov v34) {
                                                throw _f3.a(v34);
                                            }
                                            return;
                                        }
                                        catch (oov v35) {
                                            throw _f3.a(v35);
                                        }
                                    }
                                    v32 = var1_1.icv;
                                    v33 = this.icv;
                                }
                                var19_12 = v32 + v33;
                                var21_13 = var1_1.bw4 + this.bw4;
                                try {
                                    try {
                                        block87: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v36 = ((_f3)var1_1).x38();
                                                            v37 = _f3$c3d.j2j;
                                                            if (var2_2 == 0) break block86;
                                                            if (v36 != v37) break block87;
                                                        }
                                                        catch (oov v38) {
                                                            throw _f3.a(v38);
                                                        }
                                                        v36 = this.x38();
                                                        v37 = _f3$c3d.j2j;
                                                        if (var2_2 == 0) break block86;
                                                    }
                                                    catch (oov v39) {
                                                        throw _f3.a(v39);
                                                    }
                                                    if (v36 == v37) break block87;
                                                }
                                                catch (oov v40) {
                                                    throw _f3.a(v40);
                                                }
                                                this.icv *= 0.20000000298023224;
                                                this.bw4 *= 0.20000000298023224;
                                                this.w7w(var1_1.icv - var3_3, 0.0, var1_1.bw4 - var5_4);
                                                var1_1.icv *= 0.949999988079071;
                                                var1_1.bw4 *= 0.949999988079071;
                                                if (var2_2 != 0) break block88;
                                            }
                                            catch (oov v41) {
                                                throw _f3.a(v41);
                                            }
                                        }
                                        v42 /* !! */  = (_f3)var1_1;
                                        if (var2_2 == 0) break block89;
                                    }
                                    catch (oov v43) {
                                        throw _f3.a(v43);
                                    }
                                    v36 = v42 /* !! */ .x38();
                                    v37 = _f3$c3d.j2j;
                                }
                                catch (oov v44) {
                                    throw _f3.a(v44);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (v36 == v37) break block90;
                                        v42 /* !! */  = this;
                                        if (var2_2 == 0) break block89;
                                    }
                                    catch (oov v45) {
                                        throw _f3.a(v45);
                                    }
                                    if (v42 /* !! */ .x38() != _f3$c3d.j2j) break block90;
                                }
                                catch (oov v46) {
                                    throw _f3.a(v46);
                                }
                                var1_1.icv *= 0.20000000298023224;
                                var1_1.bw4 *= 0.20000000298023224;
                                var1_1.w7w(this.icv + var3_3, 0.0, this.bw4 + var5_4);
                                this.icv *= 0.949999988079071;
                                this.bw4 *= 0.949999988079071;
                                if (var2_2 != 0) break block88;
                            }
                            catch (oov v47) {
                                throw _f3.a(v47);
                            }
                        }
                        this.icv *= 0.20000000298023224;
                        this.bw4 *= 0.20000000298023224;
                        this.w7w((var19_12 /= 2.0) - var3_3, 0.0, (var21_13 /= 2.0) - var5_4);
                        var1_1.icv *= 0.20000000298023224;
                        var1_1.bw4 *= 0.20000000298023224;
                        v42 /* !! */  = var1_1;
                    }
                    v42 /* !! */ .w7w(var19_12 + var3_3, 0.0, var21_13 + var5_4);
                }
                try {
                    if (var2_2 != 0) break block73;
lbl282:
                    // 2 sources

                    this.w7w(-var3_3, 0.0, -var5_4);
                    v30 = var1_1;
                }
                catch (oov v48) {
                    throw _f3.a(v48);
                }
            }
            v30.w7w(var3_3 / 4.0, 0.0, var5_4 / 4.0);
        }
    }

    @Override
    public void ltu(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.nmj = d;
        this.gpf = d2;
        this.dx5 = d3;
        this.w2n = f;
        this.f68 = f2;
        this.sty = n + 2;
        this.icv = this.hai;
        this.mop = this.cry;
        this.bw4 = this.hwp;
    }

    @Override
    public void lmm(double d, double d2, double d3) {
        this.hai = this.icv = d;
        this.cry = this.mop = d2;
        this.hwp = this.bw4 = d3;
    }

    public void xbf(float f) {
        this.oit.c66(19, Float.valueOf(f));
    }

    public float _3r() {
        return this.oit.ig2(19);
    }

    public void iux(int n) {
        this.oit.c66(17, n);
    }

    public int hg2() {
        return this.oit.zwc(17);
    }

    public void leq(int n) {
        this.oit.c66(18, n);
    }

    public int ov7() {
        return this.oit.zwc(18);
    }

    public abstract _f3$c3d x38();

    public zfz joa() {
        zfz zfz2;
        block6: {
            int n;
            block4: {
                block5: {
                    int n2 = t9d.c();
                    try {
                        try {
                            n = this.v3h();
                            if (n2 != 0) break block4;
                            if (n != 0) break block5;
                        }
                        catch (oov oov2) {
                            throw _f3.a(oov2);
                        }
                        zfz2 = this.hcw();
                        break block6;
                    }
                    catch (oov oov3) {
                        throw _f3.a(oov3);
                    }
                }
                n = this.a0c().zwc(20);
            }
            zfz2 = e0x.v1b(n);
        }
        return zfz2;
    }

    public zfz hcw() {
        return ox_.ibw.l4i();
    }

    public int qxx() {
        int n;
        block6: {
            _f3 _f32;
            block4: {
                block5: {
                    int n2 = t9d.b();
                    try {
                        try {
                            _f32 = this;
                            if (n2 == 0) break block4;
                            if (_f32.v3h()) break block5;
                        }
                        catch (oov oov2) {
                            throw _f3.a(oov2);
                        }
                        n = this.a45();
                        break block6;
                    }
                    catch (oov oov3) {
                        throw _f3.a(oov3);
                    }
                }
                _f32 = this;
            }
            n = _f32.a0c().zwc(21);
        }
        return n;
    }

    public int a45() {
        return 6;
    }

    public void t5j(zfz zfz2) {
        this.a0c().c66(20, e0x.r2y(zfz2));
        this.gbv(true);
    }

    public void y69(int n) {
        this.a0c().c66(21, n);
        this.gbv(true);
    }

    public boolean v3h() {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.a0c().miz(22);
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw _f3.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw _f3.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void gbv(boolean bl) {
        boolean bl2;
        int n;
        wl1 wl12;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    wl12 = this.a0c();
                    n = 22;
                    bl2 = bl;
                    if (n2 == 0) break block2;
                    if (!bl2) break block3;
                }
                catch (oov oov2) {
                    throw _f3.a(oov2);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        wl12.c66(n, (byte)(bl2 ? 1 : 0));
    }

    @Override
    public void x84(String string) {
        this.gmn = string;
    }

    @Override
    public String noc() {
        String string;
        block6: {
            _f3 _f32;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            _f32 = this;
                            if (n != 0) break block4;
                            if (_f32.gmn == null) break block5;
                        }
                        catch (oov oov2) {
                            throw _f3.a(oov2);
                        }
                        string = this.gmn;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw _f3.a(oov3);
                    }
                }
                _f32 = this;
            }
            string = super.noc();
        }
        return string;
    }

    @Override
    public boolean qrh() {
        boolean bl;
        try {
            bl = this.gmn != null;
        }
        catch (oov oov2) {
            throw _f3.a(oov2);
        }
        return bl;
    }

    @Override
    public String hei() {
        return this.gmn;
    }

    @Override
    public ekw xyw() {
        if (this.qrh()) {
            tao tao2 = new tao(this.gmn);
            tao2.f4q().zn_(this.c7n());
            tao2.f4q().o7m(this.b_q().toString());
            return tao2;
        }
        hsu hsu2 = new hsu(this.noc(), new Object[0]);
        hsu2.f4q().zn_(this.c7n());
        hsu2.f4q().o7m(this.b_q().toString());
        return hsu2;
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

                _f3.b = c.a(776480250156913939L, -432021612753520387L, MethodHandles.lookup().lookupClass()).a(258110839588814L);
                _f3.h = new HashMap<K, V>(13);
                var0 = _f3.b ^ 55614933401647L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "{\u00f4L7o\u0011\u00db\u0006\u00a1\u00d4^\u0096\u00b7@\u00d2>\u00a3^\"1?\u0012\u00d8\u00e1 \n\b\u00e8\u00bc\u009b\u000e\u00aa\u008dec&\u00db\u0095\u0017\b\\\u0007\u008e\u008di\u008cb\u00dc\u0083\u00a3\u008d\u00b2sX\u00f6X\u00a2 ]\u00bd\u00bag\u008a\u009c\u00cdHq\u0000\u00c1\u00c6\u00c34{\u00b2\u0091\u00027,\u00b7\u00bdI\u00a4\u0093n\\D\u007f\u00c9\u00b0\u00f0 \u0098\u00c7\u000fb\u0017\u00a4\u0015` \u0003\u00bc\u0085\u00c0z\u001e\u00af\u0098\u0091\u0015\u0095c\u00ca\u0007\u00f74\u00e7z\u00ac\u001e/\u008ea \u000b\u00180\u00e8\u00d4A\u00ce\u00d3\u0000\u0012\u00a8\bE\u00d5\u0091\u00b8\u00bd\u0014\u007f\u00ae\u00eb\u00e4\u00137\b\u0002)O9j\u00d7x\u0018$\u00bdv\u008c\u00f9\u00a7E\u00b1\u00c1\u001a\fd\u00fb\u00bd\u00f4\u00cbJ\u00c6\u00d0\u0094\u009f\u00c7d\u0001\u0010\u00fa\u00ca+\u001a\u00ad&\u00bc\u001e\u0010\u00e4Z\u00cc\u008d\u0096\u001e\u00f1 A\u008a1Vyg\u00f5\u001c\u00f7\u00d6a\u00a1\u00cc1iT\u0001I\u0007F'\u00b6\b\u0001k.\u008c\u00b2\u00ec\u00ee%\u00f9 \u00ce\u0089\u0000\u0082\u00e6V\u00aa\u00ca\u00dd\u0096\u00f3\u00c5\u00beei\u000e\u0003cY\u00f7q\u00e5\u0011[\u00cc\u0018D\u00bd\u00a0\u00a3\b\u0007(/B$\u0095\u009c\u0091\u00ca,\u00c4\u00dd\u0003\u00fc\\\u00f7\u00dd\u00f7\u00e1\u00cc\u00f9\u00a7\u007fl\u0095!\u00fd\u00f3\u00e7\u0094\u001bq\u00dde-M\u00e6K\u00db\u00a9]\u00a1";
                var8_6 = "{\u00f4L7o\u0011\u00db\u0006\u00a1\u00d4^\u0096\u00b7@\u00d2>\u00a3^\"1?\u0012\u00d8\u00e1 \n\b\u00e8\u00bc\u009b\u000e\u00aa\u008dec&\u00db\u0095\u0017\b\\\u0007\u008e\u008di\u008cb\u00dc\u0083\u00a3\u008d\u00b2sX\u00f6X\u00a2 ]\u00bd\u00bag\u008a\u009c\u00cdHq\u0000\u00c1\u00c6\u00c34{\u00b2\u0091\u00027,\u00b7\u00bdI\u00a4\u0093n\\D\u007f\u00c9\u00b0\u00f0 \u0098\u00c7\u000fb\u0017\u00a4\u0015` \u0003\u00bc\u0085\u00c0z\u001e\u00af\u0098\u0091\u0015\u0095c\u00ca\u0007\u00f74\u00e7z\u00ac\u001e/\u008ea \u000b\u00180\u00e8\u00d4A\u00ce\u00d3\u0000\u0012\u00a8\bE\u00d5\u0091\u00b8\u00bd\u0014\u007f\u00ae\u00eb\u00e4\u00137\b\u0002)O9j\u00d7x\u0018$\u00bdv\u008c\u00f9\u00a7E\u00b1\u00c1\u001a\fd\u00fb\u00bd\u00f4\u00cbJ\u00c6\u00d0\u0094\u009f\u00c7d\u0001\u0010\u00fa\u00ca+\u001a\u00ad&\u00bc\u001e\u0010\u00e4Z\u00cc\u008d\u0096\u001e\u00f1 A\u008a1Vyg\u00f5\u001c\u00f7\u00d6a\u00a1\u00cc1iT\u0001I\u0007F'\u00b6\b\u0001k.\u008c\u00b2\u00ec\u00ee%\u00f9 \u00ce\u0089\u0000\u0082\u00e6V\u00aa\u00ca\u00dd\u0096\u00f3\u00c5\u00beei\u000e\u0003cY\u00f7q\u00e5\u0011[\u00cc\u0018D\u00bd\u00a0\u00a3\b\u0007(/B$\u0095\u009c\u0091\u00ca,\u00c4\u00dd\u0003\u00fc\\\u00f7\u00dd\u00f7\u00e1\u00cc\u00f9\u00a7\u007fl\u0095!\u00fd\u00f3\u00e7\u0094\u001bq\u00dde-M\u00e6K\u00db\u00a9]\u00a1".length();
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
                    var9_3[var7_4++] = _f3.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008d(\u00d31\u00c1\u00b6J\u00dbx(\u0083m\u0019\u0080\u008b\u00e5>\u008a\u0001\u00ed\u008f&/\u00dc6\u00e8?f^\u00b8;\u00a4$\u00b2!\u009f\u00f3\u0087\u0011\u00ad \u0016,\u00ba\u0007\u00cb\u00a6\u00b1\u00ee\u00a1\",\u00b3%'\u00bep95\u00b2A\u009eOz\u0014\u00bd\u00da\u00e4\u00c95\u00b8\u00a7b";
                    var8_6 = "\u008d(\u00d31\u00c1\u00b6J\u00dbx(\u0083m\u0019\u0080\u008b\u00e5>\u008a\u0001\u00ed\u008f&/\u00dc6\u00e8?f^\u00b8;\u00a4$\u00b2!\u009f\u00f3\u0087\u0011\u00ad \u0016,\u00ba\u0007\u00cb\u00a6\u00b1\u00ee\u00a1\",\u00b3%'\u00bep95\u00b2A\u009eOz\u0014\u00bd\u00da\u00e4\u00c95\u00b8\u00a7b".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = _f3.b(var10_9).intern();
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
        _f3.e = var9_3;
        _f3.g = new String[12];
        _f3.nnc = new int[][][]{new int[][]{{0, 0, -1}, {0, 0, 1}}, new int[][]{{-1, 0, 0}, {1, 0, 0}}, new int[][]{{-1, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {1, -1, 0}}, new int[][]{{0, 0, -1}, {0, -1, 1}}, new int[][]{{0, -1, -1}, {0, 0, 1}}, new int[][]{{0, 0, 1}, {1, 0, 0}}, new int[][]{{0, 0, 1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {-1, 0, 0}}, new int[][]{{0, 0, -1}, {1, 0, 0}}};
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2E63;
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
                throw new RuntimeException("_f3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            _f3.g[n2] = _f3.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _f3.b(n, l);
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
            throw new RuntimeException("_f3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_f3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

