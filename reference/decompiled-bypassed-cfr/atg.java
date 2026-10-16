/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
import net.optifine.model.BlockModelUtils;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorMethod;
import net.optifine.shaders.Shaders;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class atg {
    private static final float t61 = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
    private static final float itv = 1.0f / (float)Math.cos(0.7853981633974483) - 1.0f;

    public oa4 pvr(Vector3f vector3f, Vector3f vector3f2, e97 e972, sla sla2, vt2 vt22, yct yct2, qoi qoi2, boolean bl, boolean bl2) {
        vt2 vt23;
        int[] nArray;
        block10: {
            nArray = this.ujn(e972, sla2, vt22, this.tg_(vector3f, vector3f2), yct2, qoi2, bl, bl2);
            vt23 = atg.g9d(nArray);
            int n = t9d.b();
            try {
                if (bl) {
                    this.oxk(nArray, vt23, e972.hi7, sla2);
                }
            }
            catch (oov oov2) {
                throw atg.a(oov2);
            }
            try {
                if (qoi2 == null) {
                    this.zrz(nArray, vt23);
                }
            }
            catch (oov oov3) {
                throw atg.a(oov3);
            }
            try {
                Object object;
                try {
                    object = Reflector.ForgeHooksClient_fillNormal;
                    if (n == 0 || !((ReflectorMethod)object).exists()) break block10;
                }
                catch (oov oov4) {
                    throw atg.a(oov4);
                }
                object = Reflector.call(Reflector.ForgeHooksClient_fillNormal, new Object[]{nArray, vt23});
            }
            catch (oov oov5) {
                throw atg.a(oov5);
            }
        }
        return new oa4(nArray, e972.tho, vt23);
    }

    private int[] ujn(e97 e972, sla sla2, vt2 vt22, float[] fArray, yct yct2, qoi qoi2, boolean bl, boolean bl2) {
        int n;
        int n2;
        block3: {
            int n3;
            block4: {
                n2 = t9d.c();
                n3 = 28;
                try {
                    n = hxt.ly3();
                    if (n2 != 0) break block3;
                    if (n == 0) break block4;
                }
                catch (oov oov2) {
                    throw atg.a(oov2);
                }
                n3 = 56;
            }
            n = n3;
        }
        int[] nArray = new int[n];
        for (int i = 0; i < 4; ++i) {
            this.i6g(nArray, i, vt22, e972, fArray, sla2, yct2, qoi2, bl, bl2);
            if (n2 == 0) continue;
        }
        return nArray;
    }

    private int iug(vt2 vt22) {
        float f = atg.o3p(vt22);
        int n = fe6.faa((int)(f * 255.0f), 0, 255);
        return 0xFF000000 | n << 16 | n << 8 | n;
    }

    /*
     * Unable to fully structure code
     */
    public static float o3p(vt2 var0) {
        var1_1 = t9d.c();
        try {
            v0 = atg$1.xvk[var0.ordinal()];
            if (var1_1 == 0) {
            }
            ** GOTO lbl12
        }
        catch (oov v1) {
            throw atg.a(v1);
        }
        {
            ** switch (v0)
        }
lbl-1000:
        // 1 sources

        {
            case 1: {
                v0 = (int)hxt.ly3();
lbl12:
                // 2 sources

                try {
                    if (v0 != 0) {
                        return Shaders.blockLightLevel05;
                    }
                }
                catch (oov v2) {
                    throw atg.a(v2);
                }
                return 0.5f;
            }
lbl19:
            // 1 sources

            case 2: {
                return 1.0f;
            }
lbl21:
            // 1 sources

            case 3: 
            case 4: {
                try {
                    if (hxt.ly3()) {
                        return Shaders.blockLightLevel08;
                    }
                }
                catch (oov v3) {
                    throw atg.a(v3);
                }
                return 0.8f;
            }
lbl29:
            // 1 sources

            case 5: 
            case 6: {
                try {
                    if (hxt.ly3()) {
                        return Shaders.blockLightLevel06;
                    }
                }
                catch (oov v4) {
                    throw atg.a(v4);
                }
                return 0.6f;
            }
        }
lbl37:
        // 1 sources

        return 1.0f;
    }

    private float[] tg_(Vector3f vector3f, Vector3f vector3f2) {
        float[] fArray = new float[vt2.values().length];
        fArray[jw8$bre.hw2] = vector3f.x / 16.0f;
        fArray[jw8$bre.qnb] = vector3f.y / 16.0f;
        fArray[jw8$bre.ul3] = vector3f.z / 16.0f;
        fArray[jw8$bre.uky] = vector3f2.x / 16.0f;
        fArray[jw8$bre.ip2] = vector3f2.y / 16.0f;
        fArray[jw8$bre.mxd] = vector3f2.z / 16.0f;
        return fArray;
    }

    private void i6g(int[] nArray, int n, vt2 vt22, e97 e972, float[] fArray, sla sla2, yct yct2, qoi qoi2, boolean bl, boolean n2) {
        int n3;
        block4: {
            block5: {
                int n4 = t9d.b();
                vt2 vt23 = yct2.g7r(vt22);
                try {
                    try {
                        n3 = n2;
                        if (n4 == 0) break block4;
                        if (n3 == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw atg.a(oov2);
                    }
                    n3 = this.iug(vt23);
                    break block4;
                }
                catch (oov oov3) {
                    throw atg.a(oov3);
                }
            }
            n3 = -1;
        }
        int n5 = n3;
        jw8$uh0 jw8$uh0 = jw8.hbs(vt22).y3x(n);
        Vector3f vector3f = new Vector3f(fArray[jw8$uh0.mr5], fArray[jw8$uh0.yht], fArray[jw8$uh0.mbu]);
        this.rt0(vector3f, qoi2);
        int n6 = this.jl1(vector3f, vt22, n, yct2, bl);
        BlockModelUtils.snapVertexPosition(vector3f);
        this._wg(nArray, n6, n, vector3f, n5, sla2, e972.hi7);
    }

    private void _wg(int[] nArray, int n, int n2, Vector3f vector3f, int n3, sla sla2, y3k y3k2) {
        int n4 = nArray.length / 4;
        int n5 = n * n4;
        nArray[n5] = Float.floatToRawIntBits(vector3f.x);
        nArray[n5 + 1] = Float.floatToRawIntBits(vector3f.y);
        nArray[n5 + 2] = Float.floatToRawIntBits(vector3f.z);
        nArray[n5 + 3] = n3;
        nArray[n5 + 4] = Float.floatToRawIntBits(sla2.oon((double)y3k2.f81(n2) * 0.999 + (double)y3k2.f81((n2 + 2) % 4) * 0.001));
        nArray[n5 + 4 + 1] = Float.floatToRawIntBits(sla2.h0c((double)y3k2.tek(n2) * 0.999 + (double)y3k2.tek((n2 + 2) % 4) * 0.001));
    }

    /*
     * Exception decompiling
     */
    private void rt0(Vector3f var1_1, qoi var2_2) {
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

    public int wg6(Vector3f vector3f, vt2 vt22, int n, xup xup2, boolean bl) {
        return this.wg6(vector3f, vt22, n, xup2, bl);
    }

    /*
     * Unable to fully structure code
     */
    public int jl1(Vector3f var1_1, vt2 var2_2, int var3_3, yct var4_4, boolean var5_5) {
        block12: {
            block11: {
                var6_6 = t9d.c();
                try {
                    if (var4_4 == xup.qjk) {
                        return var3_3;
                    }
                }
                catch (oov v0) {
                    throw atg.a(v0);
                }
                try {
                    try {
                        v1 = Reflector.ForgeHooksClient_transform;
                        if (var6_6 != 0) break block11;
                        if (v1.exists()) {
                        }
                        ** GOTO lbl27
                    }
                    catch (oov v2) {
                        throw atg.a(v2);
                    }
                    v1 = Reflector.call(Reflector.ForgeHooksClient_transform, new Object[]{var1_1, var4_4.e5c()});
                }
                catch (oov v3) {
                    throw atg.a(v3);
                }
            }
            try {
                if (var6_6 == 0) break block12;
lbl27:
                // 2 sources

                this.q2r(var1_1, new Vector3f(0.5f, 0.5f, 0.5f), ((xup)var4_4).hz2(), new Vector3f(1.0f, 1.0f, 1.0f));
            }
            catch (oov v4) {
                throw atg.a(v4);
            }
        }
        return var4_4.b8i(var2_2, var3_3);
    }

    private void q2r(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        Matrix4f.transform((Matrix4f)matrix4f, (Vector4f)vector4f, (Vector4f)vector4f);
        vector4f.x *= vector3f3.x;
        vector4f.y *= vector3f3.y;
        vector4f.z *= vector3f3.z;
        vector3f.set(vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }

    private Matrix4f u0t() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }

    public static vt2 g9d(int[] nArray) {
        vt2 vt22;
        block19: {
            vt2 vt23;
            block15: {
                int n = nArray.length / 4;
                int n2 = n * 2;
                int n3 = n * 3;
                Vector3f vector3f = new Vector3f(Float.intBitsToFloat(nArray[0]), Float.intBitsToFloat(nArray[1]), Float.intBitsToFloat(nArray[2]));
                Vector3f vector3f2 = new Vector3f(Float.intBitsToFloat(nArray[n]), Float.intBitsToFloat(nArray[n + 1]), Float.intBitsToFloat(nArray[n + 2]));
                Vector3f vector3f3 = new Vector3f(Float.intBitsToFloat(nArray[n2]), Float.intBitsToFloat(nArray[n2 + 1]), Float.intBitsToFloat(nArray[n2 + 2]));
                Vector3f vector3f4 = new Vector3f();
                Vector3f vector3f5 = new Vector3f();
                Vector3f vector3f6 = new Vector3f();
                Vector3f.sub((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f4);
                Vector3f.sub((Vector3f)vector3f3, (Vector3f)vector3f2, (Vector3f)vector3f5);
                Vector3f.cross((Vector3f)vector3f5, (Vector3f)vector3f4, (Vector3f)vector3f6);
                float f = (float)Math.sqrt(vector3f6.x * vector3f6.x + vector3f6.y * vector3f6.y + vector3f6.z * vector3f6.z);
                vector3f6.x /= f;
                vector3f6.y /= f;
                vector3f6.z /= f;
                vt23 = null;
                float f2 = 0.0f;
                int n4 = t9d.c();
                vt2[] vt2Array = vt2.values();
                int n5 = vt2Array.length;
                int n6 = 0;
                while (n6 < n5) {
                    block16: {
                        block17: {
                            float f3;
                            vt2 vt24;
                            block18: {
                                vt24 = vt2Array[n6];
                                wgo wgo2 = vt24.et1();
                                Vector3f vector3f7 = new Vector3f((float)wgo2.getX(), (float)wgo2.getY(), (float)wgo2.getZ());
                                float f4 = Vector3f.dot((Vector3f)vector3f6, (Vector3f)vector3f7);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n4 != 0) break block15;
                                                    if (n4 != 0) break block16;
                                                }
                                                catch (oov oov2) {
                                                    throw atg.a(oov2);
                                                }
                                                if (!(f4 >= 0.0f)) break block17;
                                            }
                                            catch (oov oov3) {
                                                throw atg.a(oov3);
                                            }
                                            f3 = f4;
                                            if (n4 != 0) break block18;
                                        }
                                        catch (oov oov4) {
                                            throw atg.a(oov4);
                                        }
                                        if (!(f3 > f2)) break block17;
                                    }
                                    catch (oov oov5) {
                                        throw atg.a(oov5);
                                    }
                                    f3 = f4;
                                }
                                catch (oov oov6) {
                                    throw atg.a(oov6);
                                }
                            }
                            f2 = f3;
                            vt23 = vt24;
                        }
                        ++n6;
                    }
                    if (n4 == 0) continue;
                }
                try {
                    try {
                        vt22 = vt23;
                        if (n4 != 0) break block19;
                        if (vt22 != null) break block15;
                    }
                    catch (oov oov7) {
                        throw atg.a(oov7);
                    }
                    return vt2.rf3;
                }
                catch (oov oov8) {
                    throw atg.a(oov8);
                }
            }
            vt22 = vt23;
        }
        return vt22;
    }

    public void oxk(int[] nArray, vt2 vt22, y3k y3k2, sla sla2) {
        int n = t9d.c();
        for (int i = 0; i < 4; ++i) {
            this.k_5(i, nArray, vt22, y3k2, sla2);
            if (n == 0) continue;
        }
    }

    private void zrz(int[] nArray, vt2 vt22) {
        float f;
        int n;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        float[] fArray = new float[vt2.values().length];
        fArray[jw8$bre.hw2] = 999.0f;
        fArray[jw8$bre.qnb] = 999.0f;
        int n2 = t9d.c();
        fArray[jw8$bre.ul3] = 999.0f;
        fArray[jw8$bre.uky] = -999.0f;
        fArray[jw8$bre.ip2] = -999.0f;
        fArray[jw8$bre.mxd] = -999.0f;
        int n3 = nArray.length / 4;
        for (int i = 0; i < 4; ++i) {
            float f2;
            block45: {
                float f3;
                block46: {
                    float f4;
                    block43: {
                        float f5;
                        block44: {
                            float f6;
                            block41: {
                                float f7;
                                block42: {
                                    block39: {
                                        float f8;
                                        block40: {
                                            block37: {
                                                float f9;
                                                block38: {
                                                    n = n3 * i;
                                                    f6 = Float.intBitsToFloat(nArray2[n]);
                                                    f4 = Float.intBitsToFloat(nArray2[n + 1]);
                                                    f = Float.intBitsToFloat(nArray2[n + 2]);
                                                    try {
                                                        try {
                                                            float f10 = f6 - fArray[jw8$bre.hw2];
                                                            f2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                                            if (n2 != 0) break block37;
                                                            if (f2 >= 0) break block38;
                                                        }
                                                        catch (oov oov2) {
                                                            throw atg.a(oov2);
                                                        }
                                                        fArray[jw8$bre.hw2] = f6;
                                                    }
                                                    catch (oov oov3) {
                                                        throw atg.a(oov3);
                                                    }
                                                }
                                                f2 = (f9 = f4 - fArray[jw8$bre.qnb]) == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                            }
                                            try {
                                                try {
                                                    if (n2 != 0) break block39;
                                                    if (f2 >= 0) break block40;
                                                }
                                                catch (oov oov4) {
                                                    throw atg.a(oov4);
                                                }
                                                fArray[jw8$bre.qnb] = f4;
                                            }
                                            catch (oov oov5) {
                                                throw atg.a(oov5);
                                            }
                                        }
                                        f2 = (f8 = f - fArray[jw8$bre.ul3]) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                                    }
                                    try {
                                        try {
                                            if (n2 != 0) break block41;
                                            if (f2 >= 0) break block42;
                                        }
                                        catch (oov oov6) {
                                            throw atg.a(oov6);
                                        }
                                        fArray[jw8$bre.ul3] = f;
                                    }
                                    catch (oov oov7) {
                                        throw atg.a(oov7);
                                    }
                                }
                                f2 = (f7 = f6 - fArray[jw8$bre.uky]) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                            }
                            try {
                                try {
                                    if (n2 != 0) break block43;
                                    if (f2 <= 0) break block44;
                                }
                                catch (oov oov8) {
                                    throw atg.a(oov8);
                                }
                                fArray[jw8$bre.uky] = f6;
                            }
                            catch (oov oov9) {
                                throw atg.a(oov9);
                            }
                        }
                        f2 = (f5 = f4 - fArray[jw8$bre.ip2]) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                    }
                    try {
                        try {
                            if (n2 != 0) break block45;
                            if (f2 <= 0) break block46;
                        }
                        catch (oov oov10) {
                            throw atg.a(oov10);
                        }
                        fArray[jw8$bre.ip2] = f4;
                    }
                    catch (oov oov11) {
                        throw atg.a(oov11);
                    }
                }
                f2 = (f3 = f - fArray[jw8$bre.mxd]) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
            }
            try {
                if (f2 <= 0) continue;
                fArray[jw8$bre.mxd] = f;
                continue;
            }
            catch (oov oov12) {
                throw atg.a(oov12);
            }
        }
        jw8 jw82 = jw8.hbs(vt22);
        n = 0;
        block33: while (true) {
            int n4 = n;
            block34: while (n4 < 4) {
                int n5 = n3 * n;
                jw8$uh0 jw8$uh0 = jw82.y3x(n);
                f = fArray[jw8$uh0.mr5];
                float f11 = fArray[jw8$uh0.yht];
                float f12 = fArray[jw8$uh0.mbu];
                nArray[n5] = Float.floatToRawIntBits(f);
                nArray[n5 + 1] = Float.floatToRawIntBits(f11);
                nArray[n5 + 2] = Float.floatToRawIntBits(f12);
                int n6 = 0;
                while (n6 < 4) {
                    block47: {
                        block48: {
                            boolean bl;
                            int n7;
                            block49: {
                                n7 = n3 * n6;
                                float f13 = Float.intBitsToFloat(nArray2[n7]);
                                float f14 = Float.intBitsToFloat(nArray2[n7 + 1]);
                                float f15 = Float.intBitsToFloat(nArray2[n7 + 2]);
                                try {
                                    if (n2 != 0) break block47;
                                    n4 = fe6.fa2(f, f13) ? 1 : 0;
                                    if (n2 != 0) continue block34;
                                }
                                catch (oov oov13) {
                                    throw atg.a(oov13);
                                }
                                try {
                                    try {
                                        try {
                                            if (n4 == 0) break block48;
                                            bl = fe6.fa2(f11, f14);
                                            if (n2 != 0) break block49;
                                        }
                                        catch (oov oov14) {
                                            throw atg.a(oov14);
                                        }
                                        if (!bl) break block48;
                                    }
                                    catch (oov oov15) {
                                        throw atg.a(oov15);
                                    }
                                    bl = fe6.fa2(f12, f15);
                                }
                                catch (oov oov16) {
                                    throw atg.a(oov16);
                                }
                            }
                            try {
                                if (bl) {
                                    nArray[n5 + 4] = nArray2[n7 + 4];
                                    nArray[n5 + 4 + 1] = nArray2[n7 + 4 + 1];
                                }
                            }
                            catch (oov oov17) {
                                throw atg.a(oov17);
                            }
                        }
                        ++n6;
                    }
                    if (n2 == 0) continue;
                }
                ++n;
                if (n2 == 0) continue block33;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void k_5(int var1_1, int[] var2_2, vt2 var3_3, y3k var4_4, sla var5_5) {
        block46: {
            block44: {
                block45: {
                    block42: {
                        block40: {
                            block41: {
                                block38: {
                                    block36: {
                                        block37: {
                                            block34: {
                                                var7_6 = var2_2.length / 4;
                                                var8_7 = var7_6 * var1_1;
                                                var9_8 = Float.intBitsToFloat(var2_2[var8_7]);
                                                var10_9 = Float.intBitsToFloat(var2_2[var8_7 + 1]);
                                                var11_10 = Float.intBitsToFloat(var2_2[var8_7 + 2]);
                                                var6_11 = t9d.c();
                                                try {
                                                    block35: {
                                                        try {
                                                            try {
                                                                try {
                                                                    v0 = var9_8;
                                                                    v1 = -0.1f;
                                                                    if (var6_11 != 0) break block34;
                                                                    if (v0 < v1) break block35;
                                                                }
                                                                catch (oov v2) {
                                                                    throw atg.a(v2);
                                                                }
                                                                cfr_temp_0 = var9_8 - 1.1f;
                                                                v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                if (var6_11 != 0) break block36;
                                                            }
                                                            catch (oov v4) {
                                                                throw atg.a(v4);
                                                            }
                                                            if (v3 < 0) break block37;
                                                        }
                                                        catch (oov v5) {
                                                            throw atg.a(v5);
                                                        }
                                                    }
                                                    v0 = var9_8;
                                                    v1 = fe6.tpk(var9_8);
                                                }
                                                catch (oov v6) {
                                                    throw atg.a(v6);
                                                }
                                            }
                                            var9_8 = v0 - v1;
                                        }
                                        try {
                                            v7 = var10_9;
                                            v8 = -0.1f;
                                            if (var6_11 != 0) break block38;
                                            cfr_temp_1 = v7 - v8;
                                            v3 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                        }
                                        catch (oov v9) {
                                            throw atg.a(v9);
                                        }
                                    }
                                    try {
                                        block39: {
                                            try {
                                                try {
                                                    if (v3 < 0) break block39;
                                                    cfr_temp_2 = var10_9 - 1.1f;
                                                    v10 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                    if (var6_11 != 0) break block40;
                                                }
                                                catch (oov v11) {
                                                    throw atg.a(v11);
                                                }
                                                if (v10 < 0) break block41;
                                            }
                                            catch (oov v12) {
                                                throw atg.a(v12);
                                            }
                                        }
                                        v7 = var10_9;
                                        v8 = fe6.tpk(var10_9);
                                    }
                                    catch (oov v13) {
                                        throw atg.a(v13);
                                    }
                                }
                                var10_9 = v7 - v8;
                            }
                            try {
                                v14 = var11_10;
                                v15 = -0.1f;
                                if (var6_11 != 0) break block42;
                                cfr_temp_3 = v14 - v15;
                                v10 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                            }
                            catch (oov v16) {
                                throw atg.a(v16);
                            }
                        }
                        try {
                            block43: {
                                try {
                                    try {
                                        if (v10 < 0) break block43;
                                        v17 = var11_10;
                                        if (var6_11 != 0) break block44;
                                    }
                                    catch (oov v18) {
                                        throw atg.a(v18);
                                    }
                                    if (!(v17 >= 1.1f)) break block45;
                                }
                                catch (oov v19) {
                                    throw atg.a(v19);
                                }
                            }
                            v14 = var11_10;
                            v15 = fe6.tpk(var11_10);
                        }
                        catch (oov v20) {
                            throw atg.a(v20);
                        }
                    }
                    var11_10 = v14 - v15;
                }
                v17 = 0.0f;
            }
            var12_12 = v17;
            var13_13 = 0.0f;
            try {
                v21 = atg$1.xvk[var3_3.ordinal()];
                if (var6_11 != 0) break block46;
            }
            catch (oov v22) {
                throw atg.a(v22);
            }
            {
                ** switch (v21)
            }
lbl-1000:
            // 1 sources

            {
                case 1: {
                    var12_12 = var9_8 * 16.0f;
                    var13_13 = (1.0f - var11_10) * 16.0f;
                    if (var6_11 == 0) break;
                }
lbl123:
                // 2 sources

                case 2: {
                    var12_12 = var9_8 * 16.0f;
                    var13_13 = var11_10 * 16.0f;
                    if (var6_11 == 0) break;
                }
lbl129:
                // 2 sources

                case 3: {
                    var12_12 = (1.0f - var9_8) * 16.0f;
                    var13_13 = (1.0f - var10_9) * 16.0f;
                    if (var6_11 == 0) break;
                }
lbl135:
                // 2 sources

                case 4: {
                    var12_12 = var9_8 * 16.0f;
                    var13_13 = (1.0f - var10_9) * 16.0f;
                    if (var6_11 == 0) break;
                }
lbl141:
                // 2 sources

                case 5: {
                    var12_12 = var11_10 * 16.0f;
                    var13_13 = (1.0f - var10_9) * 16.0f;
                    if (var6_11 == 0) break;
                }
lbl147:
                // 2 sources

                case 6: {
                    var12_12 = (1.0f - var11_10) * 16.0f;
                    var13_13 = (1.0f - var10_9) * 16.0f;
                }
            }
lbl152:
            // 7 sources

            v21 = var4_4.tg7(var1_1) * var7_6;
        }
        var14_14 = v21;
        var2_2[var14_14 + 4] = Float.floatToRawIntBits(var5_5.oon(var12_12));
        var2_2[var14_14 + 4 + 1] = Float.floatToRawIntBits(var5_5.h0c(var13_13));
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

