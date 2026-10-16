/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Cursor
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class fkf
extends gbe {
    public static int e0a;
    public static int a3o;
    public static float m2e;
    public static float bq1;
    public int geu;
    public int y6q;
    public int kfn;
    public int qqg;
    public boolean zyj;
    public boolean euy;
    public boolean gnd;
    private fkf$m01 ap4;
    public float ipy;
    public float bf9;
    public float nn1;
    public float nh5;
    public ar7 sin;
    public fkf$r79 h6q;
    public ar7 vi0;
    public ArrayList z4w;
    public ArrayList yjc;
    public ers tvz;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public fkf() {
        block4: {
            this.geu = -1;
            this.y6q = -1;
            this.zyj = false;
            this.euy = false;
            this.gnd = false;
            this.ap4 = new fkf$m01(0);
            this.ipy = -1.0f;
            this.bf9 = -1.0f;
            this.nn1 = -1.0f;
            this.nh5 = 0.0f;
            this.sin = null;
            this.h6q = null;
            this.vi0 = null;
            this.z4w = new ArrayList();
            this.yjc = new ArrayList();
            _aj[] _ajArray = _aj.values();
            int n = _ajArray.length;
            int n2 = t9d.b();
            for (int i = 0; i < n; ++i) {
                _aj _aj2 = _ajArray[i];
                fkf$r79 fkf$r79 = new fkf$r79(this, _aj2);
                this.z4w.add(fkf$r79);
                fkf$afe fkf$afe = new fkf$afe(this, _aj2);
                try {
                    this.yjc.add(fkf$afe);
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw fkf.a(oov2);
                }
            }
            this.tvz = new ers(this);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void initGui() {
        block46: {
            block48: {
                block47: {
                    block59: {
                        block58: {
                            block42: {
                                block43: {
                                    block45: {
                                        block44: {
                                            block56: {
                                                block55: {
                                                    block38: {
                                                        block39: {
                                                            block41: {
                                                                block40: {
                                                                    block53: {
                                                                        block52: {
                                                                            block34: {
                                                                                block35: {
                                                                                    block37: {
                                                                                        block36: {
                                                                                            block50: {
                                                                                                block49: {
                                                                                                    var1_1 = t9d.b();
                                                                                                    var2_2 = new eka(this.f41);
                                                                                                    cfr_temp_0 = this.ipy - 270.0f;
                                                                                                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                                    if (var1_1 == 0) break block34;
                                                                                                    if (v0 >= 0) break block35;
                                                                                                    break block49;
                                                                                                    catch (Exception v1) {
                                                                                                        throw fkf.a(v1);
                                                                                                    }
                                                                                                }
                                                                                                v2 = fkf.m2e;
                                                                                                if (var1_1 == 0) break block36;
                                                                                                break block50;
                                                                                                catch (Exception v3) {
                                                                                                    throw fkf.a(v3);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                block51: {
                                                                                                    if (!(v2 < 270.0f)) break block37;
                                                                                                    break block51;
                                                                                                    catch (Exception v4) {
                                                                                                        throw fkf.a(v4);
                                                                                                    }
                                                                                                }
                                                                                                v2 = 395.0f;
                                                                                            }
                                                                                            catch (Exception v5) {
                                                                                                throw fkf.a(v5);
                                                                                            }
                                                                                        }
                                                                                        fkf.m2e = v2;
                                                                                    }
                                                                                    this.ipy = fkf.m2e;
                                                                                }
                                                                                v0 = (cfr_temp_1 = this.bf9 - 250.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                            }
                                                                            if (var1_1 == 0) break block38;
                                                                            if (v0 >= 0) break block39;
                                                                            break block52;
                                                                            catch (Exception v6) {
                                                                                throw fkf.a(v6);
                                                                            }
                                                                        }
                                                                        v7 = fkf.bq1;
                                                                        if (var1_1 == 0) break block40;
                                                                        break block53;
                                                                        catch (Exception v8) {
                                                                            throw fkf.a(v8);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block54: {
                                                                            if (!(v7 < 250.0f)) break block41;
                                                                            break block54;
                                                                            catch (Exception v9) {
                                                                                throw fkf.a(v9);
                                                                            }
                                                                        }
                                                                        v7 = 280.0f;
                                                                    }
                                                                    catch (Exception v10) {
                                                                        throw fkf.a(v10);
                                                                    }
                                                                }
                                                                fkf.bq1 = v7;
                                                            }
                                                            this.bf9 = fkf.bq1;
                                                        }
                                                        v0 = this.geu;
                                                    }
                                                    if (var1_1 == 0) break block42;
                                                    if (v0 >= 0) break block43;
                                                    break block55;
                                                    catch (Exception v11) {
                                                        throw fkf.a(v11);
                                                    }
                                                }
                                                v12 = fkf.e0a;
                                                if (var1_1 == 0) break block44;
                                                break block56;
                                                catch (Exception v13) {
                                                    throw fkf.a(v13);
                                                }
                                            }
                                            try {
                                                block57: {
                                                    if (v12 >= 0) break block45;
                                                    break block57;
                                                    catch (Exception v14) {
                                                        throw fkf.a(v14);
                                                    }
                                                }
                                                v12 = (int)(((float)var2_2.x05() - this.ipy) / 2.0f);
                                            }
                                            catch (Exception v15) {
                                                throw fkf.a(v15);
                                            }
                                        }
                                        fkf.e0a = v12;
                                    }
                                    this.geu = fkf.e0a;
                                }
                                v0 = this.y6q;
                            }
                            if (var1_1 == 0) ** GOTO lbl139
                            if (v0 >= 0) break block46;
                            break block58;
                            catch (Exception v16) {
                                throw fkf.a(v16);
                            }
                        }
                        v17 = fkf.a3o;
                        if (var1_1 == 0) break block47;
                        break block59;
                        catch (Exception v18) {
                            throw fkf.a(v18);
                        }
                    }
                    try {
                        block60: {
                            if (v17 >= 0) break block48;
                            break block60;
                            catch (Exception v19) {
                                throw fkf.a(v19);
                            }
                        }
                        v17 = (int)(((float)var2_2.lrx() - this.bf9) / 2.0f);
                    }
                    catch (Exception v20) {
                        throw fkf.a(v20);
                    }
                }
                fkf.a3o = v17;
            }
            this.y6q = fkf.a3o;
        }
        try {
            v0 = Cursor.getMinCursorSize();
lbl139:
            // 2 sources

            var3_3 = v0;
            var4_5 = BufferUtils.createIntBuffer((int)(var3_3 * var3_3));
            var5_6 = new Cursor((int)var3_3, (int)var3_3, (int)(var3_3 / 2), (int)(var3_3 / 2), 1, var4_5, null);
            Mouse.setNativeCursor((Cursor)var5_6);
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
        }
        this.tvz.dvt();
    }

    /*
     * Exception decompiling
     */
    public static void i90(int var0, int var1_1, float var2_2, float var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 1[TRYBLOCK]
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
    @Override
    public void drawScreen(int var1_1, int var2_2, float var3_3) {
        block104: {
            block103: {
                block102: {
                    block101: {
                        block100: {
                            block99: {
                                block98: {
                                    block97: {
                                        block96: {
                                            block95: {
                                                block94: {
                                                    block93: {
                                                        block92: {
                                                            block89: {
                                                                block88: {
                                                                    block87: {
                                                                        block86: {
                                                                            block85: {
                                                                                block83: {
                                                                                    block81: {
                                                                                        block82: {
                                                                                            block79: {
                                                                                                block80: {
                                                                                                    block77: {
                                                                                                        block78: {
                                                                                                            block75: {
                                                                                                                block76: {
                                                                                                                    block73: {
                                                                                                                        block74: {
                                                                                                                            block71: {
                                                                                                                                block72: {
                                                                                                                                    block70: {
                                                                                                                                        block69: {
                                                                                                                                            var4_4 = fkf.a ^ 45397676818244L;
                                                                                                                                            var7_5 = zwr.gki.wyk((String)fkf.b("p", (int)15744, (long)(3083325741928364784L ^ var4_4)));
                                                                                                                                            var6_6 = t9d.b();
                                                                                                                                            try {
                                                                                                                                                v0 = zwr.cdn.g7m();
                                                                                                                                                if (var6_6 == 0) break block69;
                                                                                                                                                if (v0) break block70;
                                                                                                                                            }
                                                                                                                                            catch (oov v1) {
                                                                                                                                                throw fkf.a(v1);
                                                                                                                                            }
                                                                                                                                            v0 = hxt.veb();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (!v0) {
                                                                                                                                                hmp.f43(zwr.hg9.d7c().floatValue());
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        catch (oov v2) {
                                                                                                                                            throw fkf.a(v2);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    var8_7 = new eka(this.f41);
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            this.tvz.jet(var8_7, var1_1, var2_2, var3_3);
                                                                                                                                            v3 = this.geu;
                                                                                                                                            v4 = this.y6q;
                                                                                                                                            v5 = (float)this.geu + this.ipy;
                                                                                                                                            v6 = (float)this.y6q + this.bf9;
                                                                                                                                            v7 = var7_5;
                                                                                                                                            if (var6_6 == 0) break block71;
                                                                                                                                            if (v7 == 0) break block72;
                                                                                                                                        }
                                                                                                                                        catch (oov v8) {
                                                                                                                                            throw fkf.a(v8);
                                                                                                                                        }
                                                                                                                                        v7 = -13486789;
                                                                                                                                        break block71;
                                                                                                                                    }
                                                                                                                                    catch (oov v9) {
                                                                                                                                        throw fkf.a(v9);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v7 = -921103;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    hhf.hxa(v3, v4, v5, v6, v7);
                                                                                                                                    v10 = this;
                                                                                                                                    v11 = this.geu;
                                                                                                                                    v12 = this.y6q;
                                                                                                                                    v13 = this.geu + 100;
                                                                                                                                    v14 = (float)this.y6q + this.bf9;
                                                                                                                                    v15 = var7_5;
                                                                                                                                    if (var6_6 == 0) break block73;
                                                                                                                                    if (v15 == 0) break block74;
                                                                                                                                }
                                                                                                                                catch (oov v16) {
                                                                                                                                    throw fkf.a(v16);
                                                                                                                                }
                                                                                                                                v15 = -13684426;
                                                                                                                                break block73;
                                                                                                                            }
                                                                                                                            catch (oov v17) {
                                                                                                                                throw fkf.a(v17);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v15 = -1;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v10.h05(v11, v12, v13, v14, v15);
                                                                                                                            v18 = jsr.qla;
                                                                                                                            v19 = "q";
                                                                                                                            v20 = (float)this.geu + 8.0f;
                                                                                                                            v21 = (float)this.y6q + 11.0f;
                                                                                                                            v22 = var7_5;
                                                                                                                            if (var6_6 == 0) break block75;
                                                                                                                            if (v22 == 0) break block76;
                                                                                                                        }
                                                                                                                        catch (oov v23) {
                                                                                                                            throw fkf.a(v23);
                                                                                                                        }
                                                                                                                        v22 = new Color(255, 255, 255).getRGB();
                                                                                                                        break block75;
                                                                                                                    }
                                                                                                                    catch (oov v24) {
                                                                                                                        throw fkf.a(v24);
                                                                                                                    }
                                                                                                                }
                                                                                                                v22 = -12165889;
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v18.fzf(v19, v20, v21, v22);
                                                                                                                    v25 = jsr.cz0;
                                                                                                                    v26 = fkf.b("p", (int)21557, (long)(1540803509852164934L ^ var4_4)).toUpperCase();
                                                                                                                    v27 = (float)this.geu + 24.0f;
                                                                                                                    v28 = (float)this.y6q + 10.0f;
                                                                                                                    v29 = var7_5;
                                                                                                                    if (var6_6 == 0) break block77;
                                                                                                                    if (v29 == 0) break block78;
                                                                                                                }
                                                                                                                catch (oov v30) {
                                                                                                                    throw fkf.a(v30);
                                                                                                                }
                                                                                                                v29 = new Color(255, 255, 255).getRGB();
                                                                                                                break block77;
                                                                                                            }
                                                                                                            catch (oov v31) {
                                                                                                                throw fkf.a(v31);
                                                                                                            }
                                                                                                        }
                                                                                                        v29 = -12165889;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            v25.fzf(v26, v27, v28, v29);
                                                                                                            v32 = jsr.rs4;
                                                                                                            v33 = fkf.b("p", (int)24798, (long)(4210395653319747503L ^ var4_4));
                                                                                                            v34 = (float)this.geu + 62.0f;
                                                                                                            v35 = (float)this.y6q + 13.5f;
                                                                                                            v36 = var7_5;
                                                                                                            if (var6_6 == 0) break block79;
                                                                                                            if (v36 == 0) break block80;
                                                                                                        }
                                                                                                        catch (oov v37) {
                                                                                                            throw fkf.a(v37);
                                                                                                        }
                                                                                                        v36 = new Color(220, 221, 222).getRGB();
                                                                                                        break block79;
                                                                                                    }
                                                                                                    catch (oov v38) {
                                                                                                        throw fkf.a(v38);
                                                                                                    }
                                                                                                }
                                                                                                v36 = -3881788;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v32.fzf((String)v33, v34, v35, v36);
                                                                                                    this._ty(this.geu + 100, (float)this.y6q - 0.5f, this.geu + 110, (float)this.y6q + this.bf9 + 0.5f, hhf.kjo(z7e.ret.k0y, 0.15f), hhf.kjo(z7e.ret.k0y, 0.0f));
                                                                                                    v39 = this;
                                                                                                    if (var6_6 == 0) break block81;
                                                                                                    if (v39.h6q != null) break block82;
                                                                                                }
                                                                                                catch (oov v40) {
                                                                                                    throw fkf.a(v40);
                                                                                                }
                                                                                                this.h6q = (fkf$r79)this.z4w.get(0);
                                                                                            }
                                                                                            catch (oov v41) {
                                                                                                throw fkf.a(v41);
                                                                                            }
                                                                                        }
                                                                                        v39 = this;
                                                                                    }
                                                                                    try {
                                                                                        block84: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var6_6 == 0) break block83;
                                                                                                        if (v39.zyj) break block84;
                                                                                                    }
                                                                                                    catch (oov v42) {
                                                                                                        throw fkf.a(v42);
                                                                                                    }
                                                                                                    v43 = this;
                                                                                                    if (var6_6 == 0) break block85;
                                                                                                }
                                                                                                catch (oov v44) {
                                                                                                    throw fkf.a(v44);
                                                                                                }
                                                                                                if (v43.nn1 <= -1.0f) {
                                                                                                }
                                                                                                ** GOTO lbl190
                                                                                            }
                                                                                            catch (oov v45) {
                                                                                                throw fkf.a(v45);
                                                                                            }
                                                                                        }
                                                                                        v39 = this;
                                                                                    }
                                                                                    catch (oov v46) {
                                                                                        throw fkf.a(v46);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v39.nn1 = this.h6q.rbx;
                                                                                    if (var6_6 != 0) break block86;
lbl190:
                                                                                    // 2 sources

                                                                                    v43 = this;
                                                                                }
                                                                                catch (oov v47) {
                                                                                    throw fkf.a(v47);
                                                                                }
                                                                            }
                                                                            v43.nn1 = ybv.lvf(this.nn1, this.h6q.rbx, (float)((double)Math.max(10.0f, Math.abs(this.nn1 - this.h6q.rbx) * 35.0f) * 0.3));
                                                                        }
                                                                        hhf.cuu((float)this.geu - 0.5f, this.nn1, (float)this.geu + 100.0f, this.nn1 + 25.0f, -12417291);
                                                                        var9_8 = this.y6q + 35;
                                                                        for (Iterator<E> var11_11 : this.z4w) {
                                                                            var11_11.g2i(this.geu, var9_8);
                                                                            v48 = var9_8 + 25.0f;
                                                                            if (var6_6 != 0) {
                                                                                var9_8 = v48;
                                                                                if (var6_6 != 0) continue;
                                                                            }
                                                                            break block87;
                                                                        }
                                                                        v48 = this.y6q + 35;
                                                                    }
                                                                    var10_10 = v48;
                                                                    GL11.glPushMatrix();
                                                                    GL11.glEnable((int)3089);
                                                                    fkf.i90(this.geu, (int)this.nn1, 99.0f, 25.0f);
                                                                    for (Object var12_13 : this.z4w) {
                                                                        var12_13.tmz(this.geu, var10_10);
                                                                        var10_10 += 25.0f;
                                                                        try {
                                                                            if (var6_6 != 0) {
                                                                                if (var6_6 != 0) continue;
                                                                                break;
                                                                            }
                                                                            break block88;
                                                                        }
                                                                        catch (oov v49) {
                                                                            throw fkf.a(v49);
                                                                        }
                                                                    }
                                                                    GL11.glDisable((int)3089);
                                                                    GL11.glPopMatrix();
                                                                    GL11.glPushMatrix();
                                                                    GL11.glEnable((int)3089);
                                                                    fkf.i90(this.geu - 1, this.y6q, this.ipy, this.bf9);
                                                                }
                                                                for (Object var12_13 : this.yjc) {
                                                                    block91: {
                                                                        block90: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var6_6 == 0) break block89;
                                                                                        v50 = var12_13;
                                                                                        if (var6_6 == 0) break block90;
                                                                                    }
                                                                                    catch (oov v51) {
                                                                                        throw fkf.a(v51);
                                                                                    }
                                                                                    if (v50.f4b != this.h6q.bv5) break block91;
                                                                                }
                                                                                catch (oov v52) {
                                                                                    throw fkf.a(v52);
                                                                                }
                                                                                v50 = var12_13;
                                                                            }
                                                                            catch (oov v53) {
                                                                                throw fkf.a(v53);
                                                                            }
                                                                        }
                                                                        v50.g71(this.geu + 100, this.y6q, var1_1, var2_2);
                                                                    }
                                                                    if (var6_6 != 0) continue;
                                                                }
                                                                GL11.glDisable((int)3089);
                                                                GL11.glPopMatrix();
                                                                this.r01(var1_1, var2_2);
                                                            }
                                                            var11_12 = var8_7.x05();
                                                            var12_14 = var8_7.lrx();
                                                            var13_15 = (float)Mouse.getX() * var11_12 / (float)this.f41.pfr - 0.5f;
                                                            var14_16 = var12_14 - (float)Mouse.getY() * var12_14 / (float)this.f41.ry7 - 0.5f;
                                                            try {
                                                                if (!this.gnd) break block92;
                                                                v54 = var13_15 - 1.8f - 1.0f;
                                                                break block93;
                                                            }
                                                            catch (oov v55) {
                                                                throw fkf.a(v55);
                                                            }
                                                        }
                                                        v54 = var13_15 + 0.8f - 1.0f;
                                                    }
                                                    var15_17 = v54;
                                                    try {
                                                        if (!this.gnd) break block94;
                                                        v56 = var14_16 - 4.5f;
                                                        break block95;
                                                    }
                                                    catch (oov v57) {
                                                        throw fkf.a(v57);
                                                    }
                                                }
                                                v56 = var14_16 + 0.5f;
                                            }
                                            var16_18 = v56;
                                            try {
                                                if (!this.gnd) break block96;
                                                v58 = var13_15 - 4.0f;
                                                break block97;
                                            }
                                            catch (oov v59) {
                                                throw fkf.a(v59);
                                            }
                                        }
                                        v58 = var13_15 - 1.0f;
                                    }
                                    var17_19 = v58;
                                    try {
                                        if (!this.gnd) break block98;
                                        v60 = var14_16 - 5.0f;
                                        break block99;
                                    }
                                    catch (oov v61) {
                                        throw fkf.a(v61);
                                    }
                                }
                                v60 = var14_16;
                            }
                            var18_20 = v60;
                            try {
                                v62 = jsr.kq6;
                                if (!this.gnd) break block100;
                                v63 = "o";
                                break block101;
                            }
                            catch (oov v64) {
                                throw fkf.a(v64);
                            }
                        }
                        v63 = "p";
                    }
                    try {
                        v62.fzf(v63, var15_17, var16_18, hhf.kjo(-16777216, 0.45f));
                        v65 = jsr.kq6;
                        if (!this.gnd) break block102;
                        v66 = "o";
                        break block103;
                    }
                    catch (oov v67) {
                        throw fkf.a(v67);
                    }
                }
                v66 = "p";
            }
            try {
                try {
                    v68 = var17_19;
                    v69 = var18_20;
                    v70 = ib3.vll.g7m();
                    if (var6_6 == 0) ** GOTO lbl357
                    if (v70 == 0) break block104;
                }
                catch (oov v71) {
                    throw fkf.a(v71);
                }
                v70 = this.kfo(200);
            }
            catch (oov v72) {
                throw fkf.a(v72);
            }
        }
        v70 = new Color((float)ib3.fvr.u7t() / 255.0f, (float)ib3.t3o.u7t() / 255.0f, (float)ib3.jv9.u7t() / 255.0f).getRGB();
lbl357:
        // 3 sources

        v65.fzf(v66, v68, v69, v70);
    }

    public int kfo(int n) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 10.0);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), 0.35f, 1.0f).getRGB();
    }

    private void r01(int n, int n2) {
        block68: {
            block67: {
                fkf fkf2;
                boolean bl;
                block65: {
                    int n3;
                    block66: {
                        block58: {
                            block59: {
                                block63: {
                                    block62: {
                                        block60: {
                                            block56: {
                                                block57: {
                                                    int n4;
                                                    block54: {
                                                        fkf fkf3;
                                                        boolean bl2;
                                                        block50: {
                                                            block51: {
                                                                block52: {
                                                                    n3 = t9d.c();
                                                                    try {
                                                                        fkf fkf4;
                                                                        block53: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                bl2 = Mouse.isButtonDown((int)0);
                                                                                                if (n3 != 0) break block50;
                                                                                                if (bl2) break block51;
                                                                                            }
                                                                                            catch (oov oov2) {
                                                                                                throw fkf.a(oov2);
                                                                                            }
                                                                                            fkf4 = this;
                                                                                            if (n3 != 0) break block52;
                                                                                        }
                                                                                        catch (oov oov3) {
                                                                                            throw fkf.a(oov3);
                                                                                        }
                                                                                        if (fkf4.zyj) break block53;
                                                                                    }
                                                                                    catch (oov oov4) {
                                                                                        throw fkf.a(oov4);
                                                                                    }
                                                                                    bl2 = this.euy;
                                                                                    if (n3 != 0) break block50;
                                                                                }
                                                                                catch (oov oov5) {
                                                                                    throw fkf.a(oov5);
                                                                                }
                                                                                if (!bl2) break block51;
                                                                            }
                                                                            catch (oov oov6) {
                                                                                throw fkf.a(oov6);
                                                                            }
                                                                        }
                                                                        this.zyj = false;
                                                                        fkf4 = this;
                                                                    }
                                                                    catch (oov oov7) {
                                                                        throw fkf.a(oov7);
                                                                    }
                                                                }
                                                                fkf4.euy = false;
                                                                zwr.qkk.up0().ax1();
                                                            }
                                                            try {
                                                                jsr.q6n.fzf("l", (float)this.geu + this.ipy - 6.0f, (float)this.y6q + this.bf9 - 6.0f, z7e.kks.k0y);
                                                                fkf3 = this;
                                                                n4 = n;
                                                                if (n3 != 0) break block54;
                                                                bl2 = fkf3.imv(n4, n2, (float)this.geu + this.ipy - 6.0f, (float)this.y6q + this.bf9 - 6.0f, (float)this.geu + this.ipy, (float)this.y6q + this.bf9);
                                                            }
                                                            catch (oov oov8) {
                                                                throw fkf.a(oov8);
                                                            }
                                                        }
                                                        try {
                                                            block55: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (!bl2) break block55;
                                                                            this.gnd = true;
                                                                            bl = this.ap4.mxf();
                                                                            if (n3 != 0) break block56;
                                                                        }
                                                                        catch (oov oov9) {
                                                                            throw fkf.a(oov9);
                                                                        }
                                                                        if (!bl) break block57;
                                                                    }
                                                                    catch (oov oov10) {
                                                                        throw fkf.a(oov10);
                                                                    }
                                                                    this.euy = true;
                                                                    this.kfn = n;
                                                                    this.qqg = n2;
                                                                    if (n3 == 0) break block57;
                                                                }
                                                                catch (oov oov11) {
                                                                    throw fkf.a(oov11);
                                                                }
                                                            }
                                                            fkf3 = this;
                                                            n4 = 0;
                                                        }
                                                        catch (oov oov12) {
                                                            throw fkf.a(oov12);
                                                        }
                                                    }
                                                    fkf3.gnd = n4;
                                                }
                                                bl = this.euy;
                                            }
                                            try {
                                                fkf fkf5;
                                                block61: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n3 != 0) break block58;
                                                                    if (!bl) break block59;
                                                                }
                                                                catch (oov oov13) {
                                                                    throw fkf.a(oov13);
                                                                }
                                                                this.gnd = true;
                                                                this.ipy += (float)(n - this.kfn);
                                                                fkf5 = this;
                                                                if (n3 != 0) break block60;
                                                            }
                                                            catch (oov oov14) {
                                                                throw fkf.a(oov14);
                                                            }
                                                            if (!(fkf5.ipy < 270.0f)) break block61;
                                                        }
                                                        catch (oov oov15) {
                                                            throw fkf.a(oov15);
                                                        }
                                                        this.ipy = 270.0f;
                                                        if (n3 == 0) break block62;
                                                    }
                                                    catch (oov oov16) {
                                                        throw fkf.a(oov16);
                                                    }
                                                }
                                                fkf5 = this;
                                            }
                                            catch (oov oov17) {
                                                throw fkf.a(oov17);
                                            }
                                        }
                                        fkf5.kfn = n;
                                    }
                                    try {
                                        fkf fkf6;
                                        block64: {
                                            try {
                                                try {
                                                    this.bf9 += (float)(n2 - this.qqg);
                                                    fkf6 = this;
                                                    if (n3 != 0) break block63;
                                                    if (!(fkf6.bf9 < 250.0f)) break block64;
                                                }
                                                catch (oov oov18) {
                                                    throw fkf.a(oov18);
                                                }
                                                this.bf9 = 250.0f;
                                                if (n3 == 0) break block59;
                                            }
                                            catch (oov oov19) {
                                                throw fkf.a(oov19);
                                            }
                                        }
                                        fkf6 = this;
                                    }
                                    catch (oov oov20) {
                                        throw fkf.a(oov20);
                                    }
                                }
                                fkf6.qqg = n2;
                            }
                            bl = this.imv(n, n2, this.geu, this.y6q, this.geu + 99, this.y6q + 34);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n3 != 0) break block65;
                                        if (!bl) break block66;
                                    }
                                    catch (oov oov21) {
                                        throw fkf.a(oov21);
                                    }
                                    bl = this.ap4.mxf();
                                    if (n3 != 0) break block65;
                                }
                                catch (oov oov22) {
                                    throw fkf.a(oov22);
                                }
                                if (!bl) break block66;
                            }
                            catch (oov oov23) {
                                throw fkf.a(oov23);
                            }
                            this.zyj = true;
                            this.kfn = n - this.geu;
                            this.qqg = n2 - this.y6q;
                        }
                        catch (oov oov24) {
                            throw fkf.a(oov24);
                        }
                    }
                    try {
                        fkf2 = this;
                        if (n3 != 0) break block67;
                        bl = fkf2.zyj;
                    }
                    catch (oov oov25) {
                        throw fkf.a(oov25);
                    }
                }
                try {
                    if (!bl) break block68;
                    this.geu = n - this.kfn;
                    fkf2 = this;
                }
                catch (oov oov26) {
                    throw fkf.a(oov26);
                }
            }
            fkf2.y6q = n2 - this.qqg;
        }
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        block4: {
            int n4 = t9d.b();
            for (fkf$r79 fkf$r79 : this.z4w) {
                try {
                    fkf$r79.x5_(n, n2);
                    if (n4 != 0) {
                        if (n4 != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw fkf.a(oov2);
                }
            }
            this.tvz.cpq(n, n2, n3);
            super.mouseClicked(n, n2, n3);
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
    }

    @Override
    public void onGuiClosed() {
        try {
            Mouse.setNativeCursor(null);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.tvz._ql();
        zwr.qkk.up0().t0k();
        super.onGuiClosed();
    }

    @Override
    public boolean a99() {
        return false;
    }

    public void h05(float f, float f2, float f3, float f4, int n) {
        hhf.cuu(f - 0.5f, f2 + 0.5f, f, f4 - 0.5f, n);
        hhf.cuu(f + 0.5f, f2 + 0.5f, f3 - 0.5f, f2, n);
        hhf.cuu(f + 0.5f, f4, f3 - 0.5f, f4 + 0.5f, n);
        hhf.cuu(f, f2, f3, f4, n);
    }

    public boolean imv(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        block38: {
            block31: {
                int n;
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    block32: {
                                        block30: {
                                            n = t9d.c();
                                            try {
                                                try {
                                                    float f8 = f - (float)this.geu;
                                                    f7 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                                    if (n != 0) break block30;
                                                    if (f7 <= 0) break block31;
                                                }
                                                catch (oov oov2) {
                                                    throw fkf.a(oov2);
                                                }
                                                float f9 = f - ((float)this.geu + this.ipy);
                                                f7 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                            }
                                            catch (oov oov3) {
                                                throw fkf.a(oov3);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block32;
                                                if (f7 >= 0) break block31;
                                            }
                                            catch (oov oov4) {
                                                throw fkf.a(oov4);
                                            }
                                            float f10 = f2 - (float)this.y6q;
                                            f7 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                        }
                                        catch (oov oov5) {
                                            throw fkf.a(oov5);
                                        }
                                    }
                                    try {
                                        try {
                                            if (n != 0) break block33;
                                            if (f7 <= 0) break block31;
                                        }
                                        catch (oov oov6) {
                                            throw fkf.a(oov6);
                                        }
                                        float f11 = f2 - ((float)this.y6q + this.bf9);
                                        f7 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                    }
                                    catch (oov oov7) {
                                        throw fkf.a(oov7);
                                    }
                                }
                                try {
                                    try {
                                        if (n != 0) break block34;
                                        if (f7 >= 0) break block31;
                                    }
                                    catch (oov oov8) {
                                        throw fkf.a(oov8);
                                    }
                                    f7 = f == f3 ? 0 : (f > f3 ? 1 : -1);
                                }
                                catch (oov oov9) {
                                    throw fkf.a(oov9);
                                }
                            }
                            try {
                                try {
                                    if (n != 0) break block35;
                                    if (f7 <= 0) break block31;
                                }
                                catch (oov oov10) {
                                    throw fkf.a(oov10);
                                }
                                f7 = f == f5 ? 0 : (f < f5 ? -1 : 1);
                            }
                            catch (oov oov11) {
                                throw fkf.a(oov11);
                            }
                        }
                        try {
                            try {
                                if (n != 0) break block36;
                                if (f7 >= 0) break block31;
                            }
                            catch (oov oov12) {
                                throw fkf.a(oov12);
                            }
                            f7 = f2 == f4 ? 0 : (f2 > f4 ? 1 : -1);
                        }
                        catch (oov oov13) {
                            throw fkf.a(oov13);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block37;
                            if (f7 <= 0) break block31;
                        }
                        catch (oov oov14) {
                            throw fkf.a(oov14);
                        }
                        f7 = f2 == f6 ? 0 : (f2 < f6 ? -1 : 1);
                    }
                    catch (oov oov15) {
                        throw fkf.a(oov15);
                    }
                }
                try {
                    if (n != 0) break block38;
                    if (f7 >= 0) break block31;
                }
                catch (oov oov16) {
                    throw fkf.a(oov16);
                }
                f7 = 1.0f;
                break block38;
            }
            f7 = 0.0f;
        }
        return (boolean)f7;
    }

    public void _ty(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        float f9 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n2 & 0xFF) / 255.0f;
        hzu.m_1();
        hzu.spd();
        hzu.vtj();
        hzu.u39(770, 771, 1, 0);
        hzu.nn9(7425);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl.gec);
        q3g2.g5o(f3, f2, this.o3s).gs4(f10, f11, f12, f9).pzw();
        q3g2.g5o(f, f2, this.o3s).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f, f4, this.o3s).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f3, f4, this.o3s).gs4(f10, f11, f12, f9).pzw();
        jom2.q7g();
        hzu.nn9(7424);
        hzu.ux6();
        hzu.if9();
        hzu.rqj();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(4089433234938232591L, 4411539728531826525L, MethodHandles.lookup().lookupClass()).a(32116872030607L);
        h = new HashMap(13);
        long l = a ^ 0x3B8E2178A32L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\n\u00af\u00a96iz\n\u00b9|\u000b\u00a1M\u00ad\u00ab\u00c0\u0002\u0010\u008d\u00c9K\u00a4\u00c9\u0082\u0004\u009b\u0006?\u00c8, \u00d9\u008dX\u0010H\u000f\u0000EG7\u00fc2\u00b2\u0011\u008f\r\u00142R\u0001";
        int n2 = "\n\u00af\u00a96iz\n\u00b9|\u000b\u00a1M\u00ad\u00ab\u00c0\u0002\u0010\u008d\u00c9K\u00a4\u00c9\u0082\u0004\u009b\u0006?\u00c8, \u00d9\u008dX\u0010H\u000f\u0000EG7\u00fc2\u00b2\u0011\u008f\r\u00142R\u0001".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fkf.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                g = new String[3];
                e0a = -1;
                a3o = -1;
                m2e = -1.0f;
                bq1 = -1.0f;
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2743;
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
                throw new RuntimeException("fkf", exception);
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
            fkf.g[n2] = fkf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fkf.b(n, l);
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
            throw new RuntimeException("fkf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fkf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

