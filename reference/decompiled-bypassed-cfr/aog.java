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
import net.minecraft.tileentity.TileEntityPiston;

public class aog
extends e0x {
    public static final qx_ kx4;
    public static final h76 cv2;
    private final boolean _pp;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public aog(boolean bl) {
        super(p3y.f41);
        this.y8l(this._8_.c32().zvi(kx4, (Comparable)((Object)vt2.z9q)).zvi(cv2, Boolean.valueOf(false)));
        this._pp = bl;
        this.t4k(nsz);
        this.q6h(0.5f);
        this.i3l(uja.yj_);
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public void qh0(t9d t9d2, mew mew2, zfz zfz2, g_3 g_32, erg erg2) {
        try {
            t9d2.vct(mew2, zfz2.zvi(kx4, (Comparable)((Object)aog.wf_(t9d2, mew2, g_32))), 2);
            if (!t9d2.v0f) {
                this._9w(t9d2, mew2, zfz2);
            }
        }
        catch (oov oov2) {
            throw aog.a(oov2);
        }
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        try {
            if (!t9d2.v0f) {
                this._9w(t9d2, mew2, zfz2);
            }
        }
        catch (oov oov2) {
            throw aog.a(oov2);
        }
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        block8: {
            t9d t9d3;
            block7: {
                int n = t9d.b();
                try {
                    try {
                        t9d3 = t9d2;
                        if (n == 0) break block7;
                        if (t9d3.v0f) break block8;
                    }
                    catch (oov oov2) {
                        throw aog.a(oov2);
                    }
                    t9d3 = t9d2;
                }
                catch (oov oov3) {
                    throw aog.a(oov3);
                }
            }
            try {
                if (t9d3.getTileEntity(mew2) == null) {
                    this._9w(t9d2, mew2, zfz2);
                }
            }
            catch (oov oov4) {
                throw aog.a(oov4);
            }
        }
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        return this.l4i().zvi(kx4, (Comparable)((Object)aog.wf_(t9d2, mew2, g_32))).zvi(cv2, Boolean.valueOf(false));
    }

    /*
     * Unable to fully structure code
     */
    private void _9w(t9d var1_1, mew var2_2, zfz var3_3) {
        block21: {
            block23: {
                block22: {
                    block20: {
                        var5_4 = (vt2)var3_3.dil(aog.kx4);
                        var6_5 = this.r3j(var1_1, var2_2, var5_4);
                        var4_6 = t9d.c();
                        try {
                            try {
                                try {
                                    try {
                                        v0 = var6_5;
                                        if (var4_6 != 0) break block20;
                                        if (v0) {
                                        }
                                        ** GOTO lbl32
                                    }
                                    catch (oov v1) {
                                        throw aog.a(v1);
                                    }
                                    v0 = (Boolean)var3_3.dil(aog.cv2);
                                    if (var4_6 != 0) break block20;
                                }
                                catch (oov v2) {
                                    throw aog.a(v2);
                                }
                                if (!v0) {
                                }
                                ** GOTO lbl32
                            }
                            catch (oov v3) {
                                throw aog.a(v3);
                            }
                            if (!new cz3(var1_1, var2_2, var5_4, true).h2m()) break block21;
                        }
                        catch (oov v4) {
                            throw aog.a(v4);
                        }
                        try {
                            var1_1.dfj(var2_2, this, 0, var5_4.c3s());
                            if (var4_6 == 0) break block21;
lbl32:
                            // 3 sources

                            v0 = var6_5;
                        }
                        catch (oov v5) {
                            throw aog.a(v5);
                        }
                    }
                    try {
                        try {
                            if (var4_6 != 0) break block22;
                            if (v0) break block21;
                        }
                        catch (oov v6) {
                            throw aog.a(v6);
                        }
                        v0 = (Boolean)var3_3.dil(aog.cv2);
                    }
                    catch (oov v7) {
                        throw aog.a(v7);
                    }
                }
                try {
                    try {
                        if (var4_6 != 0) break block23;
                        if (!v0) break block21;
                    }
                    catch (oov v8) {
                        throw aog.a(v8);
                    }
                    v0 = var1_1.vct(var2_2, var3_3.zvi(aog.cv2, Boolean.valueOf(false)), 2);
                }
                catch (oov v9) {
                    throw aog.a(v9);
                }
            }
            var1_1.dfj(var2_2, this, 1, var5_4.c3s());
        }
    }

    private boolean r3j(t9d t9d2, mew mew2, vt2 vt22) {
        int n;
        int n2;
        Object object;
        block18: {
            boolean bl;
            block22: {
                object = vt2.values();
                int n3 = ((vt2[])object).length;
                n2 = 0;
                n = t9d.c();
                while (n2 < n3) {
                    block19: {
                        block20: {
                            boolean bl2;
                            block21: {
                                vt2 vt23 = object[n2];
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n != 0) break block18;
                                                if (n != 0) break block19;
                                            }
                                            catch (oov oov2) {
                                                throw aog.a(oov2);
                                            }
                                            if (vt23 == vt22) break block20;
                                        }
                                        catch (oov oov3) {
                                            throw aog.a(oov3);
                                        }
                                        bl2 = t9d2.rjp(mew2.offset(vt23), vt23);
                                        if (n != 0) break block21;
                                    }
                                    catch (oov oov4) {
                                        throw aog.a(oov4);
                                    }
                                    if (!bl2) break block20;
                                }
                                catch (oov oov5) {
                                    throw aog.a(oov5);
                                }
                                bl2 = true;
                            }
                            return bl2;
                        }
                        ++n2;
                    }
                    if (n == 0) continue;
                }
                try {
                    bl = t9d2.rjp(mew2, vt2.m3r);
                    if (n != 0) break block22;
                    if (!bl) break block18;
                }
                catch (oov oov6) {
                    throw aog.a(oov6);
                }
                bl = true;
            }
            return bl;
        }
        object = mew2.nuv();
        vt2[] vt2Array = vt2.values();
        n2 = vt2Array.length;
        int n4 = 0;
        while (n4 < n2) {
            block23: {
                block24: {
                    boolean bl;
                    block25: {
                        vt2 vt24 = vt2Array[n4];
                        try {
                            try {
                                try {
                                    if (n != 0) break block23;
                                    if (vt24 == vt2.m3r) break block24;
                                }
                                catch (oov oov7) {
                                    throw aog.a(oov7);
                                }
                                bl = t9d2.rjp(((mew)object).offset(vt24), vt24);
                                if (n != 0) break block25;
                            }
                            catch (oov oov8) {
                                throw aog.a(oov8);
                            }
                            if (!bl) break block24;
                        }
                        catch (oov oov9) {
                            throw aog.a(oov9);
                        }
                        bl = true;
                    }
                    return bl;
                }
                ++n4;
            }
            if (n == 0) continue;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean ng5(t9d var1_1, mew var2_2, zfz var3_3, int var4_4, int var5_5) {
        block82: {
            block81: {
                block85: {
                    block89: {
                        block92: {
                            block91: {
                                block90: {
                                    block86: {
                                        block87: {
                                            block84: {
                                                block83: {
                                                    block78: {
                                                        block79: {
                                                            block80: {
                                                                block74: {
                                                                    block75: {
                                                                        block76: {
                                                                            block77: {
                                                                                var6_6 = aog.b ^ 135954197870552L;
                                                                                var8_7 = t9d.b();
                                                                                var9_8 = (vt2)var3_3.dil(aog.kx4);
                                                                                try {
                                                                                    v0 = var1_1.v0f;
                                                                                    if (var8_7 == 0) break block74;
                                                                                    if (v0 != 0) break block75;
                                                                                }
                                                                                catch (oov v1) {
                                                                                    throw aog.a(v1);
                                                                                }
                                                                                var10_9 = this.r3j(var1_1, var2_2, var9_8);
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v0 = (int)var10_9;
                                                                                                if (var8_7 == 0) break block76;
                                                                                                if (v0 == 0) break block77;
                                                                                            }
                                                                                            catch (oov v2) {
                                                                                                throw aog.a(v2);
                                                                                            }
                                                                                            v0 = var4_4;
                                                                                            if (var8_7 == 0) break block76;
                                                                                        }
                                                                                        catch (oov v3) {
                                                                                            throw aog.a(v3);
                                                                                        }
                                                                                        if (v0 != 1) break block77;
                                                                                    }
                                                                                    catch (oov v4) {
                                                                                        throw aog.a(v4);
                                                                                    }
                                                                                    var1_1.vct(var2_2, var3_3.zvi(aog.cv2, Boolean.valueOf(true)), 2);
                                                                                    return false;
                                                                                }
                                                                                catch (oov v5) {
                                                                                    throw aog.a(v5);
                                                                                }
                                                                            }
                                                                            v0 = (int)var10_9;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var8_7 == 0) break block74;
                                                                                        if (v0 != 0) break block75;
                                                                                    }
                                                                                    catch (oov v6) {
                                                                                        throw aog.a(v6);
                                                                                    }
                                                                                    v0 = var4_4;
                                                                                    if (var8_7 == 0) break block74;
                                                                                }
                                                                                catch (oov v7) {
                                                                                    throw aog.a(v7);
                                                                                }
                                                                                if (v0 != 0) break block75;
                                                                            }
                                                                            catch (oov v8) {
                                                                                throw aog.a(v8);
                                                                            }
                                                                            return false;
                                                                        }
                                                                        catch (oov v9) {
                                                                            throw aog.a(v9);
                                                                        }
                                                                    }
                                                                    v0 = var4_4;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var8_7 == 0) break block78;
                                                                                if (v0 == 0) {
                                                                                }
                                                                                ** GOTO lbl95
                                                                            }
                                                                            catch (oov v10) {
                                                                                throw aog.a(v10);
                                                                            }
                                                                            v11 = this.s8e(var1_1, var2_2, var9_8, true);
                                                                            if (var8_7 == 0) break block79;
                                                                        }
                                                                        catch (oov v12) {
                                                                            throw aog.a(v12);
                                                                        }
                                                                        if (v11) break block80;
                                                                    }
                                                                    catch (oov v13) {
                                                                        throw aog.a(v13);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (oov v14) {
                                                                    throw aog.a(v14);
                                                                }
                                                            }
                                                            v11 = var1_1.vct(var2_2, var3_3.zvi(aog.cv2, Boolean.valueOf(true)), 2);
                                                        }
                                                        try {
                                                            var1_1.amg((double)var2_2.getX() + 0.5, (double)var2_2.getY() + 0.5, (double)var2_2.getZ() + 0.5, (String)aog.b("b", (int)16784, (long)(8493326567002650660L ^ var6_6)), 0.5f, var1_1.fsy.nextFloat() * 0.25f + 0.6f);
                                                            if (var8_7 != 0) break block81;
lbl95:
                                                            // 2 sources

                                                            v0 = var4_4;
                                                        }
                                                        catch (oov v15) {
                                                            throw aog.a(v15);
                                                        }
                                                    }
                                                    try {
                                                        if (var8_7 == 0) break block82;
                                                        if (v0 != 1) break block81;
                                                    }
                                                    catch (oov v16) {
                                                        throw aog.a(v16);
                                                    }
                                                    var10_10 = var1_1.getTileEntity(var2_2.offset(var9_8));
                                                    try {
                                                        try {
                                                            v17 = var10_10;
                                                            if (var8_7 == 0) break block83;
                                                            if (!(v17 instanceof TileEntityPiston)) break block84;
                                                        }
                                                        catch (oov v18) {
                                                            throw aog.a(v18);
                                                        }
                                                        v17 = var10_10;
                                                    }
                                                    catch (oov v19) {
                                                        throw aog.a(v19);
                                                    }
                                                }
                                                ((TileEntityPiston)v17).jm_();
                                            }
                                            try {
                                                v20 = var1_1;
                                                v21 = var2_2;
                                                v22 = ox_.bn4.l4i().zvi(myw.lw_, (Comparable)var9_8);
                                                v23 = myw._yy;
                                                v24 = this._pp != false ? u4_$vxa.voo : u4_$vxa.ek6;
                                            }
                                            catch (oov v25) {
                                                throw aog.a(v25);
                                            }
                                            try {
                                                v20.vct(v21, v22.zvi(v23, (Comparable)v24), 3);
                                                var1_1.a_h(var2_2, myw.ck1(this.kig(var5_5), var9_8, false, true));
                                                v26 = this._pp;
                                                if (var8_7 == 0) break block85;
                                                if (v26) {
                                                }
                                                ** GOTO lbl246
                                            }
                                            catch (oov v27) {
                                                throw aog.a(v27);
                                            }
                                            var11_11 = var2_2.ec4(var9_8.n67() * 2, var9_8.g5t() * 2, var9_8.ozy() * 2);
                                            var12_12 = var1_1.getBlockState(var11_11).r_y();
                                            var13_13 = false;
                                            if (var12_12 == ox_.bn4) {
                                                block88: {
                                                    var14_14 = var1_1.getTileEntity(var11_11);
                                                    try {
                                                        v28 = var14_14 instanceof TileEntityPiston;
                                                        if (var8_7 == 0) break block86;
                                                        if (!v28) break block87;
                                                    }
                                                    catch (oov v29) {
                                                        throw aog.a(v29);
                                                    }
                                                    var15_15 = (TileEntityPiston)var14_14;
                                                    try {
                                                        try {
                                                            v30 = var15_15;
                                                            if (var8_7 == 0) break block88;
                                                            if (v30.mja() != var9_8) break block87;
                                                        }
                                                        catch (oov v31) {
                                                            throw aog.a(v31);
                                                        }
                                                        v30 = var15_15;
                                                    }
                                                    catch (oov v32) {
                                                        throw aog.a(v32);
                                                    }
                                                }
                                                try {
                                                    v28 = v30._2v();
                                                    if (var8_7 == 0) break block86;
                                                    if (!v28) break block87;
                                                }
                                                catch (oov v33) {
                                                    throw aog.a(v33);
                                                }
                                                var15_15.jm_();
                                                var13_13 = true;
                                            }
                                        }
                                        v28 = var13_13;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (v28) break block89;
                                                v34 = var12_12;
                                                if (var8_7 == 0) break block90;
                                            }
                                            catch (oov v35) {
                                                throw aog.a(v35);
                                            }
                                            if (v34.p1r() == p3y.cei) break block89;
                                        }
                                        catch (oov v36) {
                                            throw aog.a(v36);
                                        }
                                        v34 = var12_12;
                                    }
                                    catch (oov v37) {
                                        throw aog.a(v37);
                                    }
                                }
                                try {
                                    try {
                                        v38 = aog.eh5(v34, var1_1, var11_11, var9_8.b4b(), false);
                                        if (var8_7 == 0) break block91;
                                        if (v38 == 0) break block89;
                                    }
                                    catch (oov v39) {
                                        throw aog.a(v39);
                                    }
                                    v38 = var12_12.quv();
                                }
                                catch (oov v40) {
                                    throw aog.a(v40);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var8_7 == 0) break block89;
                                            if (v38 != 0) {
                                            }
                                            ** GOTO lbl239
                                        }
                                        catch (oov v41) {
                                            throw aog.a(v41);
                                        }
                                        v42 = var12_12;
                                        v43 = ox_.nc0;
                                        if (var8_7 == 0) break block92;
                                    }
                                    catch (oov v44) {
                                        throw aog.a(v44);
                                    }
                                    if (v42 != v43) {
                                    }
                                    ** GOTO lbl239
                                }
                                catch (oov v45) {
                                    throw aog.a(v45);
                                }
                                v42 = var12_12;
                                v43 = ox_.wdk;
                            }
                            catch (oov v46) {
                                throw aog.a(v46);
                            }
                        }
                        try {
                            if (v42 != v43) break block89;
lbl239:
                            // 3 sources

                            v38 = (int)this.s8e(var1_1, var2_2, var9_8, false);
                        }
                        catch (oov v47) {
                            throw aog.a(v47);
                        }
                    }
                    try {
                        if (var8_7 != 0) ** GOTO lbl250
lbl246:
                        // 2 sources

                        v26 = var1_1.i6x(var2_2.offset(var9_8));
                    }
                    catch (oov v48) {
                        throw aog.a(v48);
                    }
                }
                var1_1.amg((double)var2_2.getX() + 0.5, (double)var2_2.getY() + 0.5, (double)var2_2.getZ() + 0.5, (String)aog.b("b", (int)30262, (long)(2115906724059058048L ^ var6_6)), 0.5f, var1_1.fsy.nextFloat() * 0.15f + 0.6f);
            }
            v0 = 1;
        }
        return (boolean)v0;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void c7i(m5n var1_1, mew var2_2) {
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

    @Override
    public void bf6() {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void c76(t9d t9d2, mew mew2, zfz zfz2, nh4 nh42, List list, i2h i2h2) {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.c76(t9d2, mew2, zfz2, nh42, list, i2h2);
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        this.c7i(t9d2, mew2);
        return super.m__(t9d2, mew2, zfz2);
    }

    @Override
    public boolean gck() {
        return false;
    }

    public static vt2 p19(int n) {
        vt2 vt22;
        block6: {
            int n2;
            block4: {
                int n3;
                block5: {
                    int n4 = t9d.b();
                    n3 = n & 7;
                    try {
                        try {
                            n2 = n3;
                            if (n4 == 0) break block4;
                            if (n2 <= 5) break block5;
                        }
                        catch (oov oov2) {
                            throw aog.a(oov2);
                        }
                        vt22 = null;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw aog.a(oov3);
                    }
                }
                n2 = n3;
            }
            vt22 = vt2.jw6(n2);
        }
        return vt22;
    }

    public static vt2 wf_(t9d t9d2, mew mew2, g_3 g_32) {
        g_3 g_33;
        block13: {
            block14: {
                double d;
                block15: {
                    double d2;
                    block16: {
                        int n = t9d.c();
                        try {
                            try {
                                try {
                                    g_33 = g_32;
                                    if (n != 0) break block13;
                                    if (!(fe6.sqg((float)g_33.o2v - (float)mew2.getX()) < 2.0f)) break block14;
                                }
                                catch (oov oov2) {
                                    throw aog.a(oov2);
                                }
                                g_33 = g_32;
                                if (n != 0) break block13;
                            }
                            catch (oov oov3) {
                                throw aog.a(oov3);
                            }
                            if (!(fe6.sqg((float)g_33.vbd - (float)mew2.getZ()) < 2.0f)) break block14;
                        }
                        catch (oov oov4) {
                            throw aog.a(oov4);
                        }
                        d2 = g_32.kfp + (double)g_32.c5y();
                        try {
                            try {
                                double d3 = d2 - (double)mew2.getY() - 2.0;
                                d = d3 == 0.0 ? false : (d3 > 0.0 ? true : -1 != 0);
                                if (n != 0) break block15;
                                if (d <= 0) break block16;
                            }
                            catch (oov oov5) {
                                throw aog.a(oov5);
                            }
                            return vt2.rf3;
                        }
                        catch (oov oov6) {
                            throw aog.a(oov6);
                        }
                    }
                    double d4 = (double)mew2.getY() - d2 - 0.0;
                    d = d4 == 0.0 ? false : (d4 > 0.0 ? true : -1 != 0);
                }
                try {
                    if (d > 0) {
                        return vt2.m3r;
                    }
                }
                catch (oov oov7) {
                    throw aog.a(oov7);
                }
            }
            g_33 = g_32;
        }
        return g_33.u0f().b4b();
    }

    public static boolean eh5(e0x e0x2, t9d t9d2, mew mew2, vt2 vt22, boolean bl) {
        int n;
        block58: {
            block59: {
                boolean n2;
                block61: {
                    block62: {
                        float f;
                        block75: {
                            block76: {
                                int n3;
                                block71: {
                                    block72: {
                                        block65: {
                                            boolean bl2;
                                            block73: {
                                                block74: {
                                                    int n4;
                                                    block69: {
                                                        block70: {
                                                            block67: {
                                                                block68: {
                                                                    e0x e0x3;
                                                                    block66: {
                                                                        aog aog2;
                                                                        block64: {
                                                                            block56: {
                                                                                block57: {
                                                                                    n3 = t9d.b();
                                                                                    try {
                                                                                        if (e0x2 == ox_.j4y) {
                                                                                            return false;
                                                                                        }
                                                                                    }
                                                                                    catch (oov oov2) {
                                                                                        throw aog.a(oov2);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            n = t9d2.fve().hka(mew2);
                                                                                            if (n3 == 0) break block56;
                                                                                            if (n != 0) break block57;
                                                                                        }
                                                                                        catch (oov oov3) {
                                                                                            throw aog.a(oov3);
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    catch (oov oov4) {
                                                                                        throw aog.a(oov4);
                                                                                    }
                                                                                }
                                                                                n = mew2.getY();
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            block63: {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    block60: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (n3 == 0) break block58;
                                                                                                                                        if (n < 0) break block59;
                                                                                                                                    }
                                                                                                                                    catch (oov oov5) {
                                                                                                                                        throw aog.a(oov5);
                                                                                                                                    }
                                                                                                                                    if (vt22 != vt2.m3r) break block60;
                                                                                                                                }
                                                                                                                                catch (oov oov6) {
                                                                                                                                    throw aog.a(oov6);
                                                                                                                                }
                                                                                                                                n = mew2.getY();
                                                                                                                                if (n3 == 0) break block58;
                                                                                                                            }
                                                                                                                            catch (oov oov7) {
                                                                                                                                throw aog.a(oov7);
                                                                                                                            }
                                                                                                                            if (n == 0) break block59;
                                                                                                                        }
                                                                                                                        catch (oov oov8) {
                                                                                                                            throw aog.a(oov8);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n2 = mew2.getY();
                                                                                                                    if (n3 == 0) break block61;
                                                                                                                }
                                                                                                                catch (oov oov9) {
                                                                                                                    throw aog.a(oov9);
                                                                                                                }
                                                                                                                if (n2 > t9d2._1d() - 1) break block62;
                                                                                                            }
                                                                                                            catch (oov oov10) {
                                                                                                                throw aog.a(oov10);
                                                                                                            }
                                                                                                            if (vt22 != vt2.rf3) break block63;
                                                                                                        }
                                                                                                        catch (oov oov11) {
                                                                                                            throw aog.a(oov11);
                                                                                                        }
                                                                                                        n2 = mew2.getY();
                                                                                                        if (n3 == 0) break block61;
                                                                                                    }
                                                                                                    catch (oov oov12) {
                                                                                                        throw aog.a(oov12);
                                                                                                    }
                                                                                                    if (n2 == t9d2._1d() - 1) break block62;
                                                                                                }
                                                                                                catch (oov oov13) {
                                                                                                    throw aog.a(oov13);
                                                                                                }
                                                                                            }
                                                                                            e0x3 = e0x2;
                                                                                            aog2 = ox_.nc0;
                                                                                            if (n3 == 0) break block64;
                                                                                        }
                                                                                        catch (oov oov14) {
                                                                                            throw aog.a(oov14);
                                                                                        }
                                                                                        if (e0x3 == aog2) break block65;
                                                                                    }
                                                                                    catch (oov oov15) {
                                                                                        throw aog.a(oov15);
                                                                                    }
                                                                                    e0x3 = e0x2;
                                                                                    if (n3 == 0) break block66;
                                                                                }
                                                                                catch (oov oov16) {
                                                                                    throw aog.a(oov16);
                                                                                }
                                                                                aog2 = ox_.wdk;
                                                                            }
                                                                            catch (oov oov17) {
                                                                                throw aog.a(oov17);
                                                                            }
                                                                        }
                                                                        if (e0x3 == aog2) break block65;
                                                                        e0x3 = e0x2;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            float f2 = e0x3.wnt(t9d2, mew2) - -1.0f;
                                                                            f = f2 == 0.0f ? false : (f2 > 0.0f ? true : -1 != 0);
                                                                            if (n3 == 0) break block67;
                                                                            if (f != false) break block68;
                                                                        }
                                                                        catch (oov oov18) {
                                                                            throw aog.a(oov18);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (oov oov19) {
                                                                        throw aog.a(oov19);
                                                                    }
                                                                }
                                                                f = e0x2.quv();
                                                            }
                                                            try {
                                                                try {
                                                                    n4 = 2;
                                                                    if (n3 == 0) break block69;
                                                                    if (f != n4) break block70;
                                                                }
                                                                catch (oov oov20) {
                                                                    throw aog.a(oov20);
                                                                }
                                                                return false;
                                                            }
                                                            catch (oov oov21) {
                                                                throw aog.a(oov21);
                                                            }
                                                        }
                                                        try {
                                                            f = e0x2.quv();
                                                            if (n3 == 0) break block71;
                                                            n4 = 1;
                                                        }
                                                        catch (oov oov22) {
                                                            throw aog.a(oov22);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (f != n4) break block72;
                                                                bl2 = bl;
                                                                if (n3 == 0) break block73;
                                                            }
                                                            catch (oov oov23) {
                                                                throw aog.a(oov23);
                                                            }
                                                            if (bl2) break block74;
                                                        }
                                                        catch (oov oov24) {
                                                            throw aog.a(oov24);
                                                        }
                                                        return false;
                                                    }
                                                    catch (oov oov25) {
                                                        throw aog.a(oov25);
                                                    }
                                                }
                                                bl2 = true;
                                            }
                                            return bl2;
                                        }
                                        try {
                                            try {
                                                f = (float)((Boolean)t9d2.getBlockState(mew2).dil(cv2)).booleanValue();
                                                if (n3 == 0) break block71;
                                                if (f == false) break block72;
                                            }
                                            catch (oov oov26) {
                                                throw aog.a(oov26);
                                            }
                                            return false;
                                        }
                                        catch (oov oov27) {
                                            throw aog.a(oov27);
                                        }
                                    }
                                    f = (float)(e0x2 instanceof adf);
                                }
                                try {
                                    if (n3 == 0) break block75;
                                    if (f != false) break block76;
                                }
                                catch (oov oov28) {
                                    throw aog.a(oov28);
                                }
                                f = 1.0f;
                                break block75;
                            }
                            f = 0.0f;
                        }
                        return (boolean)f;
                    }
                    n2 = false;
                }
                return n2 != false;
            }
            n = 0;
        }
        return n != false;
    }

    private boolean s8e(t9d t9d2, mew mew2, vt2 vt22, boolean n) {
        boolean bl;
        block50: {
            block49: {
                boolean n2;
                mew mew3;
                e0x[] e0xArray;
                int n3;
                List list;
                int n4;
                block47: {
                    List list2;
                    block43: {
                        boolean bl2;
                        block44: {
                            u4_$vxa u4_$vxa;
                            zb_ zb_2;
                            zfz zfz2;
                            u4_$vxa u4_$vxa2;
                            Object object;
                            Object object2;
                            Object object3;
                            block46: {
                                block45: {
                                    mew mew4;
                                    block42: {
                                        int n6;
                                        vt2 vt23;
                                        block41: {
                                            vt2 vt24;
                                            int n5;
                                            block39: {
                                                block40: {
                                                    block38: {
                                                        n4 = t9d.b();
                                                        try {
                                                            boolean bl3;
                                                            try {
                                                                bl3 = n;
                                                                if (n4 == 0 || bl3) break block38;
                                                            }
                                                            catch (oov oov2) {
                                                                throw aog.a(oov2);
                                                            }
                                                            bl3 = t9d2.i6x(mew2.offset(vt22));
                                                        }
                                                        catch (oov oov3) {
                                                            throw aog.a(oov3);
                                                        }
                                                    }
                                                    cz3 cz32 = new cz3(t9d2, mew2, vt22, n);
                                                    list = cz32.sxx();
                                                    list2 = cz32._h2();
                                                    try {
                                                        try {
                                                            n5 = cz32.h2m();
                                                            if (n4 == 0) break block39;
                                                            if (n5 != 0) break block40;
                                                        }
                                                        catch (oov oov4) {
                                                            throw aog.a(oov4);
                                                        }
                                                        return false;
                                                    }
                                                    catch (oov oov5) {
                                                        throw aog.a(oov5);
                                                    }
                                                }
                                                n5 = list.size() + list2.size();
                                            }
                                            n3 = n5;
                                            e0xArray = new e0x[n3];
                                            try {
                                                vt24 = n ? vt22 : vt22.b4b();
                                            }
                                            catch (oov oov6) {
                                                throw aog.a(oov6);
                                            }
                                            vt23 = vt24;
                                            for (n6 = list2.size() - 1; n6 >= 0; --n6) {
                                                object3 = (mew)list2.get(n6);
                                                object2 = t9d2.getBlockState((mew)object3).r_y();
                                                try {
                                                    ((e0x)object2).lf0(t9d2, (mew)object3, t9d2.getBlockState((mew)object3), 0);
                                                    t9d2.i6x((mew)object3);
                                                    e0xArray[--n3] = object2;
                                                    if (n4 != 0) {
                                                        if (n4 != 0) continue;
                                                        break;
                                                    }
                                                    break block41;
                                                }
                                                catch (oov oov7) {
                                                    throw aog.a(oov7);
                                                }
                                            }
                                            n6 = list.size() - 1;
                                        }
                                        while (n6 >= 0) {
                                            object3 = (mew)list.get(n6);
                                            object2 = t9d2.getBlockState((mew)object3);
                                            object = object2.r_y();
                                            ((e0x)object).hvp((zfz)object2);
                                            t9d2.i6x((mew)object3);
                                            mew4 = ((mew)object3).offset(vt23);
                                            if (n4 != 0) {
                                                object3 = mew4;
                                                t9d2.vct((mew)object3, ox_.bn4.l4i().zvi(kx4, (Comparable)((Object)vt22)), 4);
                                                t9d2.a_h((mew)object3, myw.ck1((zfz)object2, vt22, n, false));
                                                e0xArray[--n3] = object;
                                                --n6;
                                                if (n4 != 0) continue;
                                            }
                                            break block42;
                                        }
                                        mew4 = mew2.offset(vt22);
                                    }
                                    mew3 = mew4;
                                    try {
                                        try {
                                            try {
                                                bl2 = n;
                                                if (n4 == 0) break block43;
                                                if (!bl2) break block44;
                                            }
                                            catch (oov oov8) {
                                                throw aog.a(oov8);
                                            }
                                            if (!this._pp) break block45;
                                        }
                                        catch (oov oov9) {
                                            throw aog.a(oov9);
                                        }
                                        u4_$vxa2 = u4_$vxa.voo;
                                        break block46;
                                    }
                                    catch (oov oov10) {
                                        throw aog.a(oov10);
                                    }
                                }
                                u4_$vxa2 = u4_$vxa.ek6;
                            }
                            object3 = u4_$vxa2;
                            object2 = ox_.e1u.l4i().zvi(u4_.dju, (Comparable)((Object)vt22)).zvi(u4_.x38, (Comparable)object3);
                            try {
                                zfz2 = ox_.bn4.l4i().zvi(myw.lw_, (Comparable)((Object)vt22));
                                zb_2 = myw._yy;
                                u4_$vxa = this._pp ? u4_$vxa.voo : u4_$vxa.ek6;
                            }
                            catch (oov oov11) {
                                throw aog.a(oov11);
                            }
                            object = zfz2.zvi(zb_2, (Comparable)((Object)u4_$vxa));
                            t9d2.vct(mew3, (zfz)object, 4);
                            t9d2.a_h(mew3, myw.ck1((zfz)object2, vt22, true, false));
                        }
                        bl2 = n2 = list2.size() - 1;
                    }
                    while (n2 >= false) {
                        try {
                            t9d2._0o((mew)list2.get((int)(n2 ? true : false)), e0xArray[n3++]);
                            n2 -= 1;
                            if (n4 != 0) {
                                if (n4 != 0) continue;
                                break;
                            }
                            break block47;
                        }
                        catch (oov oov12) {
                            throw aog.a(oov12);
                        }
                    }
                    n2 = list.size() - 1;
                }
                try {
                    do {
                        try {
                            if (n2 < false) break;
                            t9d2._0o((mew)list.get((int)(n2 ? true : false)), e0xArray[n3++]);
                            n2 -= 1;
                            if (n4 != 0) {
                                continue;
                            }
                            break block49;
                        }
                        catch (oov oov13) {
                            throw aog.a(oov13);
                        }
                    } while (n4 != 0);
                }
                catch (oov oov14) {
                    throw aog.a(oov14);
                }
                try {
                    try {
                        bl = n;
                        if (n4 == 0) break block50;
                        if (!bl) break block49;
                    }
                    catch (oov oov15) {
                        throw aog.a(oov15);
                    }
                    t9d2._0o(mew3, ox_.e1u);
                    t9d2._0o(mew2, this);
                }
                catch (oov oov16) {
                    throw aog.a(oov16);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public zfz v1x(zfz zfz2) {
        return this.l4i().zvi(kx4, (Comparable)((Object)vt2.rf3));
    }

    @Override
    public zfz kig(int n) {
        boolean bl;
        h76 h762;
        zfz zfz2;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    zfz2 = this.l4i().zvi(kx4, (Comparable)((Object)aog.p19(n)));
                    h762 = cv2;
                    bl = n & 8;
                    if (n2 == 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw aog.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return zfz2.zvi(h762, Boolean.valueOf(bl));
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block2: {
            int n2;
            block3: {
                n2 = 0;
                n2 |= ((vt2)((Object)zfz2.dil(kx4))).c3s();
                int n3 = t9d.b();
                try {
                    n = ((Boolean)zfz2.dil(cv2)).booleanValue();
                    if (n3 == 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw aog.a(oov2);
                }
                n2 |= 8;
            }
            n = n2;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{kx4, cv2});
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

                aog.b = c.a(5183264899592318165L, -577049282287462341L, MethodHandles.lookup().lookupClass()).a(261075975107434L);
                var9 = aog.b ^ 3010262905474L;
                aog.i = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[4];
                var5_4 = 0;
                var4_5 = "\u008e-\u00e7\u00bb[2\u00f9\u00a2\u00ef\u00f7\u00e3\u00bd&\u00e7Fe\u0094\u000b\u0096\u001fd\u008fL\u00db\u0010\u00c5Xl\u000b\u0099\u008by;\u0012\u0019\u00fd>1.\u00ea/";
                var6_6 = "\u008e-\u00e7\u00bb[2\u00f9\u00a2\u00ef\u00f7\u00e3\u00bd&\u00e7Fe\u0094\u000b\u0096\u001fd\u008fL\u00db\u0010\u00c5Xl\u000b\u0099\u008by;\u0012\u0019\u00fd>1.\u00ea/".length();
                var3_7 = 24;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = aog.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "_\u00ea?\rgr\u0010\u0084\u009eE\u0001*q\u0006\u00b4\u000e\u00ce89\u00b3\u00e1uT\u00f0\u00d3\u00c2-\u0087\u0094\u00d71F {(\u001a\u00e8\u00c0/4\u00f8\u00e1\u0011fI{G\u00c9\u00da&\u009c\u00a9M\u00f0\u00cd\u00b8I\u0087\u00c5\u00ab\u00b3p\u00ac\u00d0K";
                    var6_6 = "_\u00ea?\rgr\u0010\u0084\u009eE\u0001*q\u0006\u00b4\u000e\u00ce89\u00b3\u00e1uT\u00f0\u00d3\u00c2-\u0087\u0094\u00d71F {(\u001a\u00e8\u00c0/4\u00f8\u00e1\u0011fI{G\u00c9\u00da&\u009c\u00a9M\u00f0\u00cd\u00b8I\u0087\u00c5\u00ab\u00b3p\u00ac\u00d0K".length();
                    var3_7 = 32;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = aog.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        aog.d = var7_3;
        aog.h = new String[4];
        aog.kx4 = qx_.jap((String)aog.b("b", (int)29917, (long)(3716045046983411760L ^ var9)));
        aog.cv2 = h76.d_1((String)aog.b("b", (int)4413, (long)(4322934590262586834L ^ var9)));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E8B;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("aog", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            aog.h[n2] = aog.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aog.b(n, l);
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
            throw new RuntimeException("aog" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aog.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

