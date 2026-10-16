/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public final class d3x
extends Enum {
    public static final d3x jg8;
    public Map dc7 = new HashMap();
    private static final /* synthetic */ d3x[] ora;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static d3x[] values() {
        return (d3x[])ora.clone();
    }

    public static d3x valueOf(String string) {
        return Enum.valueOf(d3x.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ d3x() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    public void gp3(c05 var1_1) {
        block147: {
            var2_2 = d3x.a ^ 126374909708791L;
            hzu.dp2();
            var5_3 = new eka(var1_1);
            var6_4 = (double)var5_3._0s() / Math.pow(var5_3._0s(), 2.0);
            v0 = t9d.b();
            hzu.bvy(var6_4, var6_4, var6_4);
            var4_5 = v0;
            for (i2h var9_7 : this.dc7.keySet()) {
                block170: {
                    block171: {
                        block168: {
                            block169: {
                                block220: {
                                    block167: {
                                        block165: {
                                            block166: {
                                                block218: {
                                                    block164: {
                                                        block149: {
                                                            block163: {
                                                                block162: {
                                                                    block161: {
                                                                        block160: {
                                                                            block159: {
                                                                                block158: {
                                                                                    block157: {
                                                                                        block156: {
                                                                                            block155: {
                                                                                                block154: {
                                                                                                    block153: {
                                                                                                        block152: {
                                                                                                            block151: {
                                                                                                                block150: {
                                                                                                                    block148: {
                                                                                                                        block202: {
                                                                                                                            var11_9 = (ha9)var9_7;
                                                                                                                            var12_10 = (double[])this.dc7.get(var9_7);
                                                                                                                            var13_11 = new double[]{var12_10[4], var12_10[5], var12_10[6]};
                                                                                                                            var14_12 = new double[]{var12_10[7], var12_10[8], var12_10[9]};
                                                                                                                            var15_13 = new double[]{var12_10[10], var12_10[11], var12_10[12]};
                                                                                                                            var16_14 = new double[]{var12_10[13], var12_10[14], var12_10[15]};
                                                                                                                            var17_15 = new double[]{var12_10[16], var12_10[17], var12_10[18]};
                                                                                                                            var18_16 = new double[]{var12_10[19], var12_10[20], var12_10[21]};
                                                                                                                            var19_17 = new double[]{var12_10[22], var12_10[23], var12_10[24]};
                                                                                                                            if (var4_5 == 0) break block147;
                                                                                                                            cfr_temp_0 = var12_10[3] - 0.0;
                                                                                                                            v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                                            if (var4_5 == 0) break block148;
                                                                                                                            break block202;
                                                                                                                            catch (ArrayIndexOutOfBoundsException v2) {
                                                                                                                                throw d3x.a(v2);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block203: {
                                                                                                                                if (v1 <= 0) break block149;
                                                                                                                                break block203;
                                                                                                                                catch (ArrayIndexOutOfBoundsException v3) {
                                                                                                                                    throw d3x.a(v3);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            cfr_temp_1 = var12_10[3] - 1.0;
                                                                                                                            v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                                                        }
                                                                                                                        catch (ArrayIndexOutOfBoundsException v4) {
                                                                                                                            throw d3x.a(v4);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (var4_5 == 0) break block150;
                                                                                                                    try {
                                                                                                                        block204: {
                                                                                                                            if (v1 > 0) break block149;
                                                                                                                            break block204;
                                                                                                                            catch (ArrayIndexOutOfBoundsException v5) {
                                                                                                                                throw d3x.a(v5);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        cfr_temp_2 = var13_11[2] - 0.0;
                                                                                                                        v1 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                                                                    }
                                                                                                                    catch (ArrayIndexOutOfBoundsException v6) {
                                                                                                                        throw d3x.a(v6);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (var4_5 == 0) break block151;
                                                                                                                try {
                                                                                                                    block205: {
                                                                                                                        if (v1 <= 0) break block149;
                                                                                                                        break block205;
                                                                                                                        catch (ArrayIndexOutOfBoundsException v7) {
                                                                                                                            throw d3x.a(v7);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cfr_temp_3 = var13_11[2] - 1.0;
                                                                                                                    v1 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                                                                                }
                                                                                                                catch (ArrayIndexOutOfBoundsException v8) {
                                                                                                                    throw d3x.a(v8);
                                                                                                                }
                                                                                                            }
                                                                                                            if (var4_5 == 0) break block152;
                                                                                                            try {
                                                                                                                block206: {
                                                                                                                    if (v1 > 0) break block149;
                                                                                                                    break block206;
                                                                                                                    catch (ArrayIndexOutOfBoundsException v9) {
                                                                                                                        throw d3x.a(v9);
                                                                                                                    }
                                                                                                                }
                                                                                                                cfr_temp_4 = var14_12[2] - 0.0;
                                                                                                                v1 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                                            }
                                                                                                            catch (ArrayIndexOutOfBoundsException v10) {
                                                                                                                throw d3x.a(v10);
                                                                                                            }
                                                                                                        }
                                                                                                        if (var4_5 == 0) break block153;
                                                                                                        try {
                                                                                                            block207: {
                                                                                                                if (v1 <= 0) break block149;
                                                                                                                break block207;
                                                                                                                catch (ArrayIndexOutOfBoundsException v11) {
                                                                                                                    throw d3x.a(v11);
                                                                                                                }
                                                                                                            }
                                                                                                            cfr_temp_5 = var14_12[2] - 1.0;
                                                                                                            v1 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
                                                                                                        }
                                                                                                        catch (ArrayIndexOutOfBoundsException v12) {
                                                                                                            throw d3x.a(v12);
                                                                                                        }
                                                                                                    }
                                                                                                    if (var4_5 == 0) break block154;
                                                                                                    try {
                                                                                                        block208: {
                                                                                                            if (v1 > 0) break block149;
                                                                                                            break block208;
                                                                                                            catch (ArrayIndexOutOfBoundsException v13) {
                                                                                                                throw d3x.a(v13);
                                                                                                            }
                                                                                                        }
                                                                                                        cfr_temp_6 = var15_13[2] - 0.0;
                                                                                                        v1 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                                                                                    }
                                                                                                    catch (ArrayIndexOutOfBoundsException v14) {
                                                                                                        throw d3x.a(v14);
                                                                                                    }
                                                                                                }
                                                                                                if (var4_5 == 0) break block155;
                                                                                                try {
                                                                                                    block209: {
                                                                                                        if (v1 <= 0) break block149;
                                                                                                        break block209;
                                                                                                        catch (ArrayIndexOutOfBoundsException v15) {
                                                                                                            throw d3x.a(v15);
                                                                                                        }
                                                                                                    }
                                                                                                    cfr_temp_7 = var15_13[2] - 1.0;
                                                                                                    v1 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 < 0.0 ? -1 : 1);
                                                                                                }
                                                                                                catch (ArrayIndexOutOfBoundsException v16) {
                                                                                                    throw d3x.a(v16);
                                                                                                }
                                                                                            }
                                                                                            if (var4_5 == 0) break block156;
                                                                                            try {
                                                                                                block210: {
                                                                                                    if (v1 > 0) break block149;
                                                                                                    break block210;
                                                                                                    catch (ArrayIndexOutOfBoundsException v17) {
                                                                                                        throw d3x.a(v17);
                                                                                                    }
                                                                                                }
                                                                                                cfr_temp_8 = var16_14[2] - 0.0;
                                                                                                v1 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
                                                                                            }
                                                                                            catch (ArrayIndexOutOfBoundsException v18) {
                                                                                                throw d3x.a(v18);
                                                                                            }
                                                                                        }
                                                                                        if (var4_5 == 0) break block157;
                                                                                        try {
                                                                                            block211: {
                                                                                                if (v1 <= 0) break block149;
                                                                                                break block211;
                                                                                                catch (ArrayIndexOutOfBoundsException v19) {
                                                                                                    throw d3x.a(v19);
                                                                                                }
                                                                                            }
                                                                                            cfr_temp_9 = var16_14[2] - 1.0;
                                                                                            v1 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 < 0.0 ? -1 : 1);
                                                                                        }
                                                                                        catch (ArrayIndexOutOfBoundsException v20) {
                                                                                            throw d3x.a(v20);
                                                                                        }
                                                                                    }
                                                                                    if (var4_5 == 0) break block158;
                                                                                    try {
                                                                                        block212: {
                                                                                            if (v1 > 0) break block149;
                                                                                            break block212;
                                                                                            catch (ArrayIndexOutOfBoundsException v21) {
                                                                                                throw d3x.a(v21);
                                                                                            }
                                                                                        }
                                                                                        cfr_temp_10 = var17_15[2] - 0.0;
                                                                                        v1 = cfr_temp_10 == 0.0 ? 0 : (cfr_temp_10 > 0.0 ? 1 : -1);
                                                                                    }
                                                                                    catch (ArrayIndexOutOfBoundsException v22) {
                                                                                        throw d3x.a(v22);
                                                                                    }
                                                                                }
                                                                                if (var4_5 == 0) break block159;
                                                                                try {
                                                                                    block213: {
                                                                                        if (v1 <= 0) break block149;
                                                                                        break block213;
                                                                                        catch (ArrayIndexOutOfBoundsException v23) {
                                                                                            throw d3x.a(v23);
                                                                                        }
                                                                                    }
                                                                                    cfr_temp_11 = var17_15[2] - 1.0;
                                                                                    v1 = cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 < 0.0 ? -1 : 1);
                                                                                }
                                                                                catch (ArrayIndexOutOfBoundsException v24) {
                                                                                    throw d3x.a(v24);
                                                                                }
                                                                            }
                                                                            if (var4_5 == 0) break block160;
                                                                            try {
                                                                                block214: {
                                                                                    if (v1 > 0) break block149;
                                                                                    break block214;
                                                                                    catch (ArrayIndexOutOfBoundsException v25) {
                                                                                        throw d3x.a(v25);
                                                                                    }
                                                                                }
                                                                                cfr_temp_12 = var18_16[2] - 0.0;
                                                                                v1 = cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                                                                            }
                                                                            catch (ArrayIndexOutOfBoundsException v26) {
                                                                                throw d3x.a(v26);
                                                                            }
                                                                        }
                                                                        if (var4_5 == 0) break block161;
                                                                        try {
                                                                            block215: {
                                                                                if (v1 <= 0) break block149;
                                                                                break block215;
                                                                                catch (ArrayIndexOutOfBoundsException v27) {
                                                                                    throw d3x.a(v27);
                                                                                }
                                                                            }
                                                                            cfr_temp_13 = var18_16[2] - 1.0;
                                                                            v1 = cfr_temp_13 == 0.0 ? 0 : (cfr_temp_13 < 0.0 ? -1 : 1);
                                                                        }
                                                                        catch (ArrayIndexOutOfBoundsException v28) {
                                                                            throw d3x.a(v28);
                                                                        }
                                                                    }
                                                                    if (var4_5 == 0) break block162;
                                                                    try {
                                                                        block216: {
                                                                            if (v1 > 0) break block149;
                                                                            break block216;
                                                                            catch (ArrayIndexOutOfBoundsException v29) {
                                                                                throw d3x.a(v29);
                                                                            }
                                                                        }
                                                                        cfr_temp_14 = var19_17[2] - 0.0;
                                                                        v1 = cfr_temp_14 == 0.0 ? 0 : (cfr_temp_14 > 0.0 ? 1 : -1);
                                                                    }
                                                                    catch (ArrayIndexOutOfBoundsException v30) {
                                                                        throw d3x.a(v30);
                                                                    }
                                                                }
                                                                if (var4_5 == 0) break block163;
                                                                try {
                                                                    block217: {
                                                                        if (v1 <= 0) break block149;
                                                                        break block217;
                                                                        catch (ArrayIndexOutOfBoundsException v31) {
                                                                            throw d3x.a(v31);
                                                                        }
                                                                    }
                                                                    cfr_temp_15 = var19_17[2] - 1.0;
                                                                    v1 = cfr_temp_15 == 0.0 ? 0 : (cfr_temp_15 < 0.0 ? -1 : 1);
                                                                }
                                                                catch (ArrayIndexOutOfBoundsException v32) {
                                                                    throw d3x.a(v32);
                                                                }
                                                            }
                                                            try {
                                                                if (var4_5 == 0) break block164;
                                                                if (v1 > 0) break block149;
                                                            }
                                                            catch (ArrayIndexOutOfBoundsException v33) {
                                                                throw d3x.a(v33);
                                                            }
                                                            v1 = (double)true;
                                                            break block164;
                                                        }
                                                        v1 = (double)false;
                                                    }
                                                    var10_8 = v1;
                                                    cfr_temp_16 = (double)var1_1.vg8.tm6(var11_9) - 2.5;
                                                    v34 = cfr_temp_16 == 0.0 ? 0 : (cfr_temp_16 < 0.0 ? -1 : 1);
                                                    if (var4_5 == 0) break block165;
                                                    if (v34 >= 0) break block166;
                                                    break block218;
                                                    catch (ArrayIndexOutOfBoundsException v35) {
                                                        throw d3x.a(v35);
                                                    }
                                                }
                                                try {
                                                    block219: {
                                                        cfr_temp_17 = var18_16[1] - 0.0;
                                                        v34 = cfr_temp_17 == 0.0 ? 0 : (cfr_temp_17 < 0.0 ? -1 : 1);
                                                        if (var4_5 == 0) break block165;
                                                        break block219;
                                                        catch (ArrayIndexOutOfBoundsException v36) {
                                                            throw d3x.a(v36);
                                                        }
                                                    }
                                                    if (v34 >= 0) break block166;
                                                }
                                                catch (ArrayIndexOutOfBoundsException v37) {
                                                    throw d3x.a(v37);
                                                }
                                                var10_8 = (double)false;
                                            }
                                            v34 = var10_8;
                                        }
                                        try {
                                            if (var4_5 == 0) break block167;
                                            if (v34 == false) {
                                                continue;
                                            }
                                        }
                                        catch (ArrayIndexOutOfBoundsException v38) {
                                            throw d3x.a(v38);
                                        }
                                        v34 = (double)y3e.hrx.g7m();
                                    }
                                    if (var4_5 == 0) break block168;
                                    if (v34 != false) break block169;
                                    break block220;
                                    catch (ArrayIndexOutOfBoundsException v39) {
                                        throw d3x.a(v39);
                                    }
                                }
                                try {
                                    block221: {
                                        v34 = (double)var11_9.h5u();
                                        if (var4_5 == 0) break block168;
                                        break block221;
                                        catch (ArrayIndexOutOfBoundsException v40) {
                                            throw d3x.a(v40);
                                        }
                                    }
                                    if (v34 != false) {
                                        continue;
                                    }
                                }
                                catch (ArrayIndexOutOfBoundsException v41) {
                                    throw d3x.a(v41);
                                }
                            }
                            try {
                                hzu.dp2();
                                if (var4_5 == 0) break block170;
                                v34 = (double)(var11_9 instanceof ha9);
                            }
                            catch (ArrayIndexOutOfBoundsException v42) {
                                throw d3x.a(v42);
                            }
                        }
                        if (v34 == false) break block171;
                        try {
                            block222: {
                                v43 = var11_9 instanceof l86;
                                if (var4_5 == 0) ** GOTO lbl330
                                break block222;
                                catch (ArrayIndexOutOfBoundsException v44) {
                                    throw d3x.a(v44);
                                }
                            }
                            if (v43 != 0) break block171;
                        }
                        catch (ArrayIndexOutOfBoundsException v45) {
                            throw d3x.a(v45);
                        }
                        try {
                            block201: {
                                block199: {
                                    block200: {
                                        block197: {
                                            block198: {
                                                block195: {
                                                    block196: {
                                                        block194: {
                                                            block193: {
                                                                block191: {
                                                                    block192: {
                                                                        block189: {
                                                                            block190: {
                                                                                block183: {
                                                                                    block179: {
                                                                                        block175: {
                                                                                            block173: {
                                                                                                GL11.glEnable((int)3042);
                                                                                                GL11.glDisable((int)3553);
                                                                                                this.frl(0.0, 0.0, 0.0, 0.0, this.nt4(0, 0));
                                                                                                v43 = 8;
lbl330:
                                                                                                // 2 sources

                                                                                                v46 = new double[v43];
                                                                                                v46[0] = var12_10[0];
                                                                                                v46[1] = var13_11[0];
                                                                                                v46[2] = var14_12[0];
                                                                                                v46[3] = var15_13[0];
                                                                                                v46[4] = var16_14[0];
                                                                                                v46[5] = var17_15[0];
                                                                                                v46[6] = var18_16[0];
                                                                                                v46[7] = var19_17[0];
                                                                                                var20_18 = v46;
                                                                                                var21_20 = new double[]{var12_10[1], var13_11[1], var14_12[1], var15_13[1], var16_14[1], var17_15[1], var18_16[1], var19_17[1]};
                                                                                                var22_21 = var12_10[0];
                                                                                                var24_22 = var12_10[1];
                                                                                                var26_23 = var13_11[0];
                                                                                                var28_24 = var13_11[1];
                                                                                                var30_26 = var20_18;
                                                                                                var31_28 = var30_26.length;
                                                                                                for (var32_30 = 0; var32_30 < var31_28; ++var32_30) {
                                                                                                    block172: {
                                                                                                        var33_32 = var30_26[var32_30];
                                                                                                        v47 = var33_32;
                                                                                                        if (var4_5 == 0) break block172;
                                                                                                        try {
                                                                                                            block223: {
                                                                                                                cfr_temp_18 = v47 - var22_21;
                                                                                                                v48 = cfr_temp_18 == 0.0 ? 0 : (cfr_temp_18 < 0.0 ? -1 : 1);
                                                                                                                if (var4_5 == 0) break block173;
                                                                                                                break block223;
                                                                                                                catch (ArrayIndexOutOfBoundsException v49) {
                                                                                                                    throw d3x.a(v49);
                                                                                                                }
                                                                                                            }
                                                                                                            if (v48 >= 0) {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        catch (ArrayIndexOutOfBoundsException v50) {
                                                                                                            throw d3x.a(v50);
                                                                                                        }
                                                                                                        v47 = var33_32;
                                                                                                    }
                                                                                                    var22_21 = v47;
                                                                                                    if (var4_5 != 0) continue;
                                                                                                }
                                                                                                var30_26 = var20_18;
                                                                                                var31_28 = var30_26.length;
                                                                                                v48 = var32_30 = 0;
                                                                                            }
                                                                                            while (var32_30 < var31_28) {
                                                                                                block177: {
                                                                                                    block174: {
                                                                                                        block176: {
                                                                                                            var33_32 = var30_26[var32_30];
                                                                                                            v51 = var33_32;
                                                                                                            if (var4_5 == 0) break block174;
                                                                                                            try {
                                                                                                                block224: {
                                                                                                                    cfr_temp_19 = v51 - var26_23;
                                                                                                                    v52 = cfr_temp_19 == 0.0 ? 0 : (cfr_temp_19 > 0.0 ? 1 : -1);
                                                                                                                    if (var4_5 == 0) break block175;
                                                                                                                    break block224;
                                                                                                                    catch (ArrayIndexOutOfBoundsException v53) {
                                                                                                                        throw d3x.a(v53);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (v52 > 0) break block176;
                                                                                                                break block177;
                                                                                                            }
                                                                                                            catch (ArrayIndexOutOfBoundsException v54) {
                                                                                                                throw d3x.a(v54);
                                                                                                            }
                                                                                                        }
                                                                                                        v51 = var33_32;
                                                                                                    }
                                                                                                    var26_23 = v51;
                                                                                                }
                                                                                                ++var32_30;
                                                                                                if (var4_5 != 0) continue;
                                                                                            }
                                                                                            var30_26 = var21_20;
                                                                                            var31_28 = var30_26.length;
                                                                                            v52 = var32_30 = 0;
                                                                                        }
                                                                                        while (var32_30 < var31_28) {
                                                                                            block181: {
                                                                                                block178: {
                                                                                                    block180: {
                                                                                                        var33_32 = var30_26[var32_30];
                                                                                                        v55 = var33_32;
                                                                                                        if (var4_5 == 0) break block178;
                                                                                                        try {
                                                                                                            block225: {
                                                                                                                cfr_temp_20 = v55 - var24_22;
                                                                                                                v56 = cfr_temp_20 == 0.0 ? 0 : (cfr_temp_20 < 0.0 ? -1 : 1);
                                                                                                                if (var4_5 == 0) break block179;
                                                                                                                break block225;
                                                                                                                catch (ArrayIndexOutOfBoundsException v57) {
                                                                                                                    throw d3x.a(v57);
                                                                                                                }
                                                                                                            }
                                                                                                            if (v56 < 0) break block180;
                                                                                                            break block181;
                                                                                                        }
                                                                                                        catch (ArrayIndexOutOfBoundsException v58) {
                                                                                                            throw d3x.a(v58);
                                                                                                        }
                                                                                                    }
                                                                                                    v55 = var33_32;
                                                                                                }
                                                                                                var24_22 = v55;
                                                                                            }
                                                                                            ++var32_30;
                                                                                            if (var4_5 != 0) continue;
                                                                                        }
                                                                                        var30_26 = var21_20;
                                                                                        var31_28 = var30_26.length;
                                                                                        v56 = var32_30 = 0;
                                                                                    }
                                                                                    while (var32_30 < var31_28) {
                                                                                        block185: {
                                                                                            block182: {
                                                                                                block184: {
                                                                                                    var33_32 = var30_26[var32_30];
                                                                                                    v59 = var33_32;
                                                                                                    if (var4_5 == 0) break block182;
                                                                                                    try {
                                                                                                        block226: {
                                                                                                            cfr_temp_21 = v59 - var28_24;
                                                                                                            v60 = cfr_temp_21 == 0.0 ? 0 : (cfr_temp_21 > 0.0 ? 1 : -1);
                                                                                                            if (var4_5 == 0) break block183;
                                                                                                            break block226;
                                                                                                            catch (ArrayIndexOutOfBoundsException v61) {
                                                                                                                throw d3x.a(v61);
                                                                                                            }
                                                                                                        }
                                                                                                        if (v60 > 0) break block184;
                                                                                                        break block185;
                                                                                                    }
                                                                                                    catch (ArrayIndexOutOfBoundsException v62) {
                                                                                                        throw d3x.a(v62);
                                                                                                    }
                                                                                                }
                                                                                                v59 = var33_32;
                                                                                            }
                                                                                            var28_24 = v59;
                                                                                        }
                                                                                        ++var32_30;
                                                                                        if (var4_5 != 0) continue;
                                                                                    }
                                                                                    v60 = z7e.a2_.k0y;
                                                                                }
                                                                                var30_25 = v60;
                                                                                var31_27 = var11_9.xyw()._2o();
                                                                                var32_30 = 0;
                                                                                block139: while (true) {
                                                                                    v63 = var32_30;
                                                                                    v64 = var31_27.length();
                                                                                    while (v63 < v64) {
                                                                                        block187: {
                                                                                            block188: {
                                                                                                block186: {
                                                                                                    block227: {
                                                                                                        v63 = var31_27.charAt(var32_30);
                                                                                                        v64 = 167;
                                                                                                        if (var4_5 == 0) continue;
                                                                                                        if (var4_5 == 0) break block186;
                                                                                                        if (v63 != v64) break block187;
                                                                                                        break block227;
                                                                                                        catch (ArrayIndexOutOfBoundsException v65) {
                                                                                                            throw d3x.a(v65);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        block228: {
                                                                                                            v66 = var32_30 + 1;
                                                                                                            if (var4_5 == 0) break block188;
                                                                                                            break block228;
                                                                                                            catch (ArrayIndexOutOfBoundsException v67) {
                                                                                                                throw d3x.a(v67);
                                                                                                            }
                                                                                                        }
                                                                                                        v68 = var31_27.length();
                                                                                                    }
                                                                                                    catch (ArrayIndexOutOfBoundsException v69) {
                                                                                                        throw d3x.a(v69);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (v66 >= v68) break block187;
                                                                                                    v66 = Character.toLowerCase(var31_27.charAt(var32_30 + 1));
                                                                                                }
                                                                                                catch (ArrayIndexOutOfBoundsException v70) {
                                                                                                    throw d3x.a(v70);
                                                                                                }
                                                                                            }
                                                                                            var33_33 = v66;
                                                                                            var34_35 = d3x.a("r", (int)17606, (long)(1779234855928739073L ^ var2_2)).indexOf(var33_33);
                                                                                            try {
                                                                                                if (var4_5 == 0) continue block139;
                                                                                                if (var34_35 >= 16) break block187;
                                                                                            }
                                                                                            catch (ArrayIndexOutOfBoundsException v71) {
                                                                                                throw d3x.a(v71);
                                                                                            }
                                                                                            try {
                                                                                                var35_37 = new Color(var1_1.tx1.fgp[var34_35]);
                                                                                                var30_25 = this.jup(var35_37.getRed(), var35_37.getGreen(), var35_37.getBlue(), 255);
                                                                                            }
                                                                                            catch (ArrayIndexOutOfBoundsException var35_38) {
                                                                                                // empty catch block
                                                                                            }
                                                                                        }
                                                                                        ++var32_30;
                                                                                        if (var4_5 != 0) continue block139;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                try {
                                                                                    v72 = var11_9;
                                                                                    if (var4_5 == 0) break block189;
                                                                                    if (!v72.h5u()) break block190;
                                                                                }
                                                                                catch (ArrayIndexOutOfBoundsException v73) {
                                                                                    throw d3x.a(v73);
                                                                                }
                                                                                var30_25 = z7e.jqn.k0y;
                                                                            }
                                                                            this.wof(var22_21 + 0.5, var24_22 + 0.5, var26_23 - 0.5, var28_24 - 0.5, 1.0, this.jup(0, 0, 0, 0), var30_25);
                                                                            this.wof(var22_21 - 0.5, var24_22 - 0.5, var26_23 + 0.5, var28_24 + 0.5, 1.0, this.nt4(0, 0), this.nt4(0, 150));
                                                                            this.wof(var22_21 + 1.5, var24_22 + 1.5, var26_23 - 1.5, var28_24 - 1.5, 1.0, this.nt4(0, 0), this.nt4(0, 150));
                                                                            v72 = var11_9;
                                                                        }
                                                                        var32_29 = v72.i55();
                                                                        v74 = new float[3];
                                                                        v74[0] = 0.0f;
                                                                        v74[1] = 0.5f;
                                                                        v74[2] = 1.0f;
                                                                        var33_31 = v74;
                                                                        var34_34 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
                                                                        var35_36 = var32_29 / var11_9.axb();
                                                                        try {
                                                                            v75 = var32_29 >= 0.0f ? this._xp(var33_31, var34_34, var35_36).brighter() : Color.RED;
                                                                        }
                                                                        catch (ArrayIndexOutOfBoundsException v76) {
                                                                            throw d3x.a(v76);
                                                                        }
                                                                        var36_39 = v75;
                                                                        var37_40 = var24_22 - var28_24 + 0.5;
                                                                        var39_41 = var28_24 + var37_40 * (double)var35_36;
                                                                        var41_42 = var28_24 - 5.0 + var37_40 * (double)var35_36;
                                                                        try {
                                                                            this.wof(var22_21 - 6.5, var24_22 - 0.5, var22_21 - 2.5, var28_24, 1.0, this.nt4(0, 100), this.nt4(0, 150));
                                                                            this.frl(var22_21 - 5.5, var28_24 - 1.0, var22_21 - 3.5, var39_41, var36_39.getRGB());
                                                                            cfr_temp_22 = -var37_40 - 50.0;
                                                                            v77 = cfr_temp_22 == 0.0 ? 0 : (cfr_temp_22 > 0.0 ? 1 : -1);
                                                                            if (var4_5 == 0) break block191;
                                                                            if (v77 <= 0) break block192;
                                                                        }
                                                                        catch (ArrayIndexOutOfBoundsException v78) {
                                                                            throw d3x.a(v78);
                                                                        }
                                                                        for (var43_44 = 1; var43_44 < 10; ++var43_44) {
                                                                            var44_47 = var37_40 / 10.0 * (double)var43_44;
                                                                            try {
                                                                                this.frl(var22_21 - 6.5, var28_24 - 0.5 + var44_47, var22_21 - 2.5, var28_24 - 0.5 + var44_47 - 1.0, this.ed_(0));
                                                                                if (var4_5 != 0) {
                                                                                    if (var4_5 != 0) continue;
                                                                                    break;
                                                                                }
                                                                                break block193;
                                                                            }
                                                                            catch (ArrayIndexOutOfBoundsException v79) {
                                                                                throw d3x.a(v79);
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        v80 = this.fxl(var35_36 * 100.0f, 1.0);
                                                                        if (var4_5 == 0) break block194;
                                                                        v77 = (int)v80;
                                                                    }
                                                                    catch (ArrayIndexOutOfBoundsException v81) {
                                                                        throw d3x.a(v81);
                                                                    }
                                                                }
                                                                if (v77 <= 100) {
                                                                    hzu.dp2();
                                                                    hzu.syc(2.0f, 2.0f, 2.0f);
                                                                    var43_45 = (int)this.fxl(var32_29 * 5.0f, 1.0) + (String)d3x.a("r", (int)14218, (long)(621602083991963209L ^ var2_2));
                                                                    jsr.wgd.fzf(var43_45, (float)(var22_21 - (double)(jsr.wgd.ax2(var43_45) * 2.0f)) / 2.0f - 5.0f, ((float)var41_42 + jsr.wgd.pvv() / 2.0f) / 2.0f - 2.0f, -1);
                                                                    jsr.wgd.kkl(var43_45, (float)(var22_21 - (double)(jsr.wgd.ax2(var43_45) * 2.0f)) / 2.0f - 5.0f, ((float)var41_42 + jsr.wgd.pvv() / 2.0f) / 2.0f - 2.0f, -1);
                                                                    hzu.x3w();
                                                                }
                                                            }
                                                            v80 = (var28_24 - var24_22) / 4.0;
                                                        }
                                                        var43_43 = (float)v80;
                                                        var44_46 = var11_9.rnq(4);
                                                        try {
                                                            v82 = var44_46;
                                                            if (var4_5 == 0) break block195;
                                                            if (v82 == null) break block196;
                                                        }
                                                        catch (ArrayIndexOutOfBoundsException v83) {
                                                            throw d3x.a(v83);
                                                        }
                                                        this.wof(var26_23 + 1.0, var24_22 + 1.0, var26_23 + 6.0, var24_22 + (double)var43_43, 1.0, this.jup(28, 156, 179, 100), this.nt4(0, 255));
                                                        var45_49 = (float)(var24_22 + (double)var43_43 - 1.0 - (var24_22 + 2.0));
                                                        var46_51 = 1.0 - (double)var44_46.dzj() / (double)var44_46.mg5();
                                                        this.frl(var26_23 + 2.0, var24_22 + (double)var43_43 - 1.0, var26_23 + 5.0, var24_22 + (double)var43_43 - 1.0 - (double)var45_49 * var46_51, this.qm9(78, 206, 229));
                                                        this.jyd(var44_46.mg5() - var44_46.dzj() + "", var26_23 + 7.0, var24_22 + (double)var43_43 - 1.0 - (double)(var45_49 / 2.0f) - (double)(var1_1.tx1.rr7 / 2), -1);
                                                    }
                                                    v82 = var11_9.rnq(3);
                                                }
                                                var45_48 = v82;
                                                try {
                                                    v84 = var45_48;
                                                    if (var4_5 == 0) break block197;
                                                    if (v84 == null) break block198;
                                                }
                                                catch (ArrayIndexOutOfBoundsException v85) {
                                                    throw d3x.a(v85);
                                                }
                                                this.wof(var26_23 + 1.0, var24_22 + (double)var43_43, var26_23 + 6.0, var24_22 + (double)(var43_43 * 2.0f), 1.0, this.jup(28, 156, 179, 100), this.nt4(0, 255));
                                                var46_52 = (float)(var24_22 + (double)(var43_43 * 2.0f) - (var24_22 + (double)var43_43 + 2.0));
                                                var47_54 = 1.0 - (double)var45_48.dzj() * 1.0 / (double)var45_48.mg5();
                                                this.frl(var26_23 + 2.0, var24_22 + (double)(var43_43 * 2.0f), var26_23 + 5.0, var24_22 + (double)(var43_43 * 2.0f) - (double)var46_52 * var47_54, this.qm9(78, 206, 229));
                                                this.jyd(var45_48.mg5() - var45_48.dzj() + "", var26_23 + 7.0, var24_22 + (double)(var43_43 * 2.0f) - (double)(var46_52 / 2.0f) - (double)(var1_1.tx1.rr7 / 2), -1);
                                            }
                                            v84 = var11_9.rnq(2);
                                        }
                                        var46_50 = v84;
                                        try {
                                            v86 = var46_50;
                                            if (var4_5 == 0) break block199;
                                            if (v86 == null) break block200;
                                        }
                                        catch (ArrayIndexOutOfBoundsException v87) {
                                            throw d3x.a(v87);
                                        }
                                        this.wof(var26_23 + 1.0, var24_22 + (double)(var43_43 * 2.0f), var26_23 + 6.0, var24_22 + (double)(var43_43 * 3.0f), 1.0, this.jup(28, 156, 179, 100), this.nt4(0, 255));
                                        var47_55 = (float)(var24_22 + (double)(var43_43 * 3.0f) - (var24_22 + (double)(var43_43 * 2.0f) + 2.0));
                                        var48_56 = 1.0 - (double)var46_50.dzj() * 1.0 / (double)var46_50.mg5();
                                        this.frl(var26_23 + 2.0, var24_22 + (double)(var43_43 * 3.0f), var26_23 + 5.0, var24_22 + (double)(var43_43 * 3.0f) - (double)var47_55 * var48_56, this.qm9(78, 206, 229));
                                        this.jyd(var46_50.mg5() - var46_50.dzj() + "", var26_23 + 7.0, var24_22 + (double)(var43_43 * 3.0f) - (double)(var47_55 / 2.0f) - (double)(var1_1.tx1.rr7 / 2), -1);
                                    }
                                    v86 = var11_9.rnq(1);
                                }
                                var47_53 = v86;
                                if (var4_5 == 0) break block201;
                                try {
                                    block229: {
                                        if (var47_53 == null) break block171;
                                        break block229;
                                        catch (ArrayIndexOutOfBoundsException v88) {
                                            throw d3x.a(v88);
                                        }
                                    }
                                    this.wof(var26_23 + 1.0, var24_22 + (double)(var43_43 * 3.0f), var26_23 + 6.0, var24_22 + (double)(var43_43 * 4.0f), 1.0, this.jup(28, 156, 179, 100), this.nt4(0, 255));
                                }
                                catch (ArrayIndexOutOfBoundsException v89) {
                                    throw d3x.a(v89);
                                }
                            }
                            var48_57 = (float)(var24_22 + (double)(var43_43 * 4.0f) - (var24_22 + (double)(var43_43 * 3.0f) + 2.0));
                            var49_58 = 1.0 - (double)var47_53.dzj() * 1.0 / (double)var47_53.mg5();
                            this.frl(var26_23 + 2.0, var24_22 + (double)(var43_43 * 4.0f) - 1.0, var26_23 + 5.0, var24_22 + (double)(var43_43 * 4.0f) - (double)var48_57 * var49_58, this.qm9(78, 206, 229));
                            this.jyd(var47_53.mg5() - var47_53.dzj() + "", var26_23 + 7.0, var24_22 + (double)(var43_43 * 4.0f) - (double)(var48_57 / 2.0f) - (double)(var1_1.tx1.rr7 / 2), -1);
                        }
                        catch (Exception var20_19) {
                            // empty catch block
                        }
                    }
                    hzu.x3w();
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
                if (var4_5 != 0) continue;
            }
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            hzu.x3w();
            this.frl(0.0, 0.0, 0.0, 0.0, -1);
        }
    }

    public void jyd(String string, double d, double d2, int n) {
        c05.vz1().tx1.km1(string, (float)d, (float)d2, n);
    }

    public double fxl(double d, double d2) {
        double d3 = 1.0 / d2;
        return (double)Math.round(d * d3) / d3;
    }

    public Color _xp(float[] fArray, Color[] colorArray, float f) {
        long l = a ^ 0x41BA052BDF68L;
        try {
            if (fArray == null) {
                throw new IllegalArgumentException((String)((Object)d3x.a("r", (int)7281, (long)(0xB4699FA9363BB2EL ^ l))));
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw d3x.a(arrayIndexOutOfBoundsException);
        }
        try {
            if (colorArray == null) {
                throw new IllegalArgumentException((String)((Object)d3x.a("r", (int)22173, (long)(0x271573E9C4FF71C6L ^ l))));
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw d3x.a(arrayIndexOutOfBoundsException);
        }
        try {
            if (fArray.length != colorArray.length) {
                throw new IllegalArgumentException((String)((Object)d3x.a("r", (int)32724, (long)(0x662F9066CBC0588AL ^ l))));
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw d3x.a(arrayIndexOutOfBoundsException);
        }
        int[] nArray = this._8u(fArray, f);
        float[] fArray2 = new float[]{fArray[nArray[0]], fArray[nArray[1]]};
        Color[] colorArray2 = new Color[]{colorArray[nArray[0]], colorArray[nArray[1]]};
        float f2 = fArray2[1] - fArray2[0];
        float f3 = f - fArray2[0];
        float f4 = f3 / f2;
        return this.vlv(colorArray2[0], colorArray2[1], 1.0f - f4);
    }

    public int[] _8u(float[] fArray, float f) {
        int n;
        int[] nArray;
        block13: {
            int n2;
            int n3;
            block12: {
                int n4;
                block11: {
                    nArray = new int[2];
                    n4 = t9d.b();
                    for (n = 0; n < fArray.length; ++n) {
                        try {
                            try {
                                try {
                                    float f2 = fArray[n] - f;
                                    n3 = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                                    if (n4 == 0 || n4 == 0) break block11;
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                    throw d3x.a(arrayIndexOutOfBoundsException);
                                }
                                if (n3 > 0) break;
                                continue;
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw d3x.a(arrayIndexOutOfBoundsException);
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            throw d3x.a(arrayIndexOutOfBoundsException);
                        }
                    }
                    n3 = n;
                }
                try {
                    try {
                        n2 = fArray.length;
                        if (n4 == 0) break block12;
                        if (n3 < n2) break block13;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw d3x.a(arrayIndexOutOfBoundsException);
                    }
                    n3 = fArray.length;
                    n2 = 1;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw d3x.a(arrayIndexOutOfBoundsException);
                }
            }
            n = n3 - n2;
        }
        nArray[0] = n - 1;
        nArray[1] = n;
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    public Color vlv(Color var1_1, Color var2_2, double var3_3) {
        block32: {
            block33: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            var5_4 = d3x.a ^ 111875857012023L;
                                            var8_5 = (float)var3_3;
                                            var9_6 = 1.0f - var8_5;
                                            var10_7 = new float[3];
                                            v0 = t9d.b();
                                            var11_8 = new float[3];
                                            var1_1.getColorComponents(var10_7);
                                            var2_2.getColorComponents(var11_8);
                                            var12_9 = var10_7[0] * var8_5 + var11_8[0] * var9_6;
                                            var13_10 = var10_7[1] * var8_5 + var11_8[1] * var9_6;
                                            var7_11 = v0;
                                            var14_12 = var10_7[2] * var8_5 + var11_8[2] * var9_6;
                                            try {
                                                cfr_temp_0 = var12_9 - 0.0f;
                                                v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                if (var7_11 == 0) break block25;
                                                if (v1 < 0) {
                                                }
                                                ** GOTO lbl28
                                            }
                                            catch (IllegalArgumentException v2) {
                                                throw d3x.a(v2);
                                            }
                                            var12_9 = 0.0f;
                                            try {
                                                if (var7_11 != 0) break block26;
lbl28:
                                                // 2 sources

                                                v1 = (cfr_temp_1 = var12_9 - 255.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                            }
                                            catch (IllegalArgumentException v3) {
                                                throw d3x.a(v3);
                                            }
                                        }
                                        try {
                                            if (var7_11 == 0) break block27;
                                            if (v1 <= 0) break block26;
                                        }
                                        catch (IllegalArgumentException v4) {
                                            throw d3x.a(v4);
                                        }
                                        var12_9 = 255.0f;
                                    }
                                    v1 = (cfr_temp_2 = var13_10 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                }
                                try {
                                    if (var7_11 == 0) break block28;
                                    if (v1 < 0) {
                                    }
                                    ** GOTO lbl54
                                }
                                catch (IllegalArgumentException v5) {
                                    throw d3x.a(v5);
                                }
                                var13_10 = 0.0f;
                                try {
                                    if (var7_11 != 0) break block29;
lbl54:
                                    // 2 sources

                                    v1 = (cfr_temp_3 = var13_10 - 255.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                }
                                catch (IllegalArgumentException v6) {
                                    throw d3x.a(v6);
                                }
                            }
                            try {
                                if (var7_11 == 0) break block30;
                                if (v1 <= 0) break block29;
                            }
                            catch (IllegalArgumentException v7) {
                                throw d3x.a(v7);
                            }
                            var13_10 = 255.0f;
                        }
                        v1 = (cfr_temp_4 = var14_12 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                    }
                    try {
                        if (var7_11 == 0) break block31;
                        if (v1 < 0) {
                        }
                        ** GOTO lbl79
                    }
                    catch (IllegalArgumentException v8) {
                        throw d3x.a(v8);
                    }
                    var14_12 = 0.0f;
                    if (var7_11 != 0) break block32;
lbl79:
                    // 2 sources

                    try {
                        block34: {
                            v9 = var14_12;
                            if (var7_11 == 0) break block33;
                            break block34;
                            catch (IllegalArgumentException v10) {
                                throw d3x.a(v10);
                            }
                        }
                        cfr_temp_5 = v9 - 255.0f;
                        v1 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                    }
                    catch (IllegalArgumentException v11) {
                        throw d3x.a(v11);
                    }
                }
                try {
                    if (v1 <= 0) break block32;
                    v9 = 255.0f;
                }
                catch (IllegalArgumentException v12) {
                    throw d3x.a(v12);
                }
            }
            var14_12 = v9;
        }
        var15_13 = null;
        try {
            var15_13 = new Color(var12_9, var13_10, var14_12);
        }
        catch (IllegalArgumentException var16_14) {
            var17_15 = NumberFormat.getNumberInstance();
            System.out.println(var17_15.format(var12_9) + (String)d3x.a("r", (int)26691, (long)(8414560606203004229L ^ var5_4)) + var17_15.format(var13_10) + (String)d3x.a("r", (int)29068, (long)(738758996980784265L ^ var5_4)) + var17_15.format(var14_12));
            var16_14.printStackTrace();
        }
        return var15_13;
    }

    public void yy5(c05 c052) {
        this.dc7.clear();
        float f = c052.gze.au3;
        int n = t9d.b();
        for (Object e : c052.tij.xa0()) {
            double d;
            double d2;
            double d3;
            double[] dArray;
            double d4;
            double d5;
            double d6;
            double d7;
            ha9 ha92;
            block34: {
                double d8;
                block33: {
                    ha9 ha93;
                    block32: {
                        block30: {
                            boolean bl;
                            block31: {
                                block29: {
                                    Object e2;
                                    block28: {
                                        try {
                                            e2 = e;
                                            if (n == 0) break block28;
                                            if (!(e2 instanceof ha9)) continue;
                                        }
                                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                            throw d3x.a(arrayIndexOutOfBoundsException);
                                        }
                                        e2 = e;
                                    }
                                    ha92 = (ha9)e2;
                                    try {
                                        if (ha92 == c052.vg8) {
                                            continue;
                                        }
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw d3x.a(arrayIndexOutOfBoundsException);
                                    }
                                    try {
                                        try {
                                            bl = kgt.irb.klu();
                                            if (n == 0) break block29;
                                            if (bl) {
                                            }
                                            break block30;
                                        }
                                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                            throw d3x.a(arrayIndexOutOfBoundsException);
                                        }
                                        bl = f5k.pje.g7m();
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw d3x.a(arrayIndexOutOfBoundsException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block31;
                                            if (!bl) break block30;
                                        }
                                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                            throw d3x.a(arrayIndexOutOfBoundsException);
                                        }
                                        ha93 = ha92;
                                        if (n == 0) break block32;
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw d3x.a(arrayIndexOutOfBoundsException);
                                    }
                                    bl = ha93 instanceof ha9;
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                    throw d3x.a(arrayIndexOutOfBoundsException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (!bl) break block30;
                                        ha93 = ha92;
                                        if (n == 0) break block32;
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw d3x.a(arrayIndexOutOfBoundsException);
                                    }
                                    if (ha93 != c052.vg8) {
                                        continue;
                                    }
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                    throw d3x.a(arrayIndexOutOfBoundsException);
                                }
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw d3x.a(arrayIndexOutOfBoundsException);
                            }
                        }
                        ha93 = ha92;
                    }
                    d7 = ha93.ivp + (ha92.o2v - ha92.ivp) * (double)f - c052.ibs()._3y + 0.36;
                    d6 = ha92.c54 + (ha92.kfp - ha92.c54) * (double)f - c052.ibs().b7y;
                    d5 = ha92.e2b + (ha92.vbd - ha92.e2b) * (double)f - c052.ibs().xdg + 0.36;
                    d4 = d6 += (double)ha92.ikl + 0.15;
                    dArray = this.k22(d7, d6, d5);
                    double[] dArray2 = this.k22(d7 - 0.36, d6, d5 - 0.36);
                    d3 = 0.0;
                    try {
                        double d9 = dArray2[2] - 0.0;
                        d8 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                        if (n == 0) break block33;
                        if (d8 < 0) continue;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw d3x.a(arrayIndexOutOfBoundsException);
                    }
                    try {
                        d2 = dArray2[2];
                        d = 1.0;
                        if (n == 0) break block34;
                        double d10 = d2 - d;
                        d8 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw d3x.a(arrayIndexOutOfBoundsException);
                    }
                }
                if (d8 >= 0) continue;
                d7 = ha92.ivp + (ha92.o2v - ha92.ivp) * (double)f - c052.ibs()._3y - 0.36;
                d2 = ha92.e2b + (ha92.vbd - ha92.e2b) * (double)f - c052.ibs().xdg;
                d = 0.36;
            }
            d5 = d2 - d;
            double[] dArray3 = this.k22(d7, d6, d5);
            d6 = ha92.c54 + (ha92.kfp - ha92.c54) * (double)f - c052.ibs().b7y - 0.05;
            double[] dArray4 = this.k22(d7, d6, d5);
            d7 = ha92.ivp + (ha92.o2v - ha92.ivp) * (double)f - c052.ibs()._3y - 0.36;
            d5 = ha92.e2b + (ha92.vbd - ha92.e2b) * (double)f - c052.ibs().xdg + 0.36;
            double[] dArray5 = this.k22(d7, d4, d5);
            double[] dArray6 = this.k22(d7, d6, d5);
            d7 = ha92.ivp + (ha92.o2v - ha92.ivp) * (double)f - c052.ibs()._3y + 0.36;
            d5 = ha92.e2b + (ha92.vbd - ha92.e2b) * (double)f - c052.ibs().xdg + 0.36;
            double[] dArray7 = this.k22(d7, d6, d5);
            d7 = ha92.ivp + (ha92.o2v - ha92.ivp) * (double)f - c052.ibs()._3y + 0.36;
            d5 = ha92.e2b + (ha92.vbd - ha92.e2b) * (double)f - c052.ibs().xdg - 0.36;
            double[] dArray8 = this.k22(d7, d4, d5);
            double[] dArray9 = this.k22(d7, d6, d5);
            this.dc7.put(ha92, new double[]{dArray[0], dArray[1], d3, dArray[2], dArray3[0], dArray3[1], dArray3[2], dArray4[0], dArray4[1], dArray4[2], dArray6[0], dArray6[1], dArray6[2], dArray7[0], dArray7[1], dArray7[2], dArray9[0], dArray9[1], dArray9[2], dArray5[0], dArray5[1], dArray5[2], dArray8[0], dArray8[1], dArray8[2]});
            if (n != 0) continue;
        }
    }

    public double[] k22(double d, double d2, double d3) {
        double[] dArray = this.bay(d, d2, d3);
        return dArray;
    }

    public double[] bay(double d, double d2, double d3) {
        double[] dArray;
        block4: {
            block3: {
                int n;
                FloatBuffer floatBuffer;
                block2: {
                    floatBuffer = BufferUtils.createFloatBuffer((int)3);
                    IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
                    int n2 = t9d.b();
                    FloatBuffer floatBuffer2 = BufferUtils.createFloatBuffer((int)16);
                    FloatBuffer floatBuffer3 = BufferUtils.createFloatBuffer((int)16);
                    GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer2);
                    int n3 = n2;
                    GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer3);
                    GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
                    int n4 = GLU.gluProject((float)((float)d), (float)((float)d2), (float)((float)d3), (FloatBuffer)floatBuffer2, (FloatBuffer)floatBuffer3, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer);
                    try {
                        n = n4;
                        if (n3 == 0) break block2;
                        if (n == 0) break block3;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw d3x.a(arrayIndexOutOfBoundsException);
                    }
                    n = 3;
                }
                double[] dArray2 = new double[n];
                dArray2[0] = floatBuffer.get(0);
                dArray2[1] = (float)Display.getHeight() - floatBuffer.get(1);
                dArray = dArray2;
                dArray2[2] = floatBuffer.get(2);
                break block4;
            }
            dArray = null;
        }
        return dArray;
    }

    public void wof(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        this.frl(d + d5, d2 + d5, d3 - d5, d4 - d5, n);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        this.frl(d + d5, d2, d3 - d5, d2 + d5, n2);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        this.frl(d, d2, d + d5, d4, n2);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        this.frl(d3 - d5, d2, d3, d4, n2);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        this.frl(d + d5, d4 - d5, d3 - d5, d4, n2);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public void frl(double d, double d2, double d3, double d4, int n) {
        double d5;
        block6: {
            block7: {
                double d6;
                int n2;
                block4: {
                    block5: {
                        n2 = t9d.c();
                        try {
                            d5 = d == d3 ? 0 : (d < d3 ? -1 : 1);
                            if (n2 != 0) break block4;
                            if (d5 >= 0) break block5;
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            throw d3x.a(arrayIndexOutOfBoundsException);
                        }
                        d6 = d;
                        d = d3;
                        d3 = d6;
                    }
                    d5 = d2 == d4 ? 0 : (d2 < d4 ? -1 : 1);
                }
                try {
                    if (n2 != 0) break block6;
                    if (d5 >= 0) break block7;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw d3x.a(arrayIndexOutOfBoundsException);
                }
                d6 = d2;
                d2 = d4;
                d4 = d6;
            }
            d5 = n >> 24 & 0xFF;
        }
        float f = (float)d5 / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        q3g q3g2 = jom.yut().zuq();
        hzu.spd();
        hzu.m_1();
        hzu.u39(770, 771, 1, 0);
        hzu.wn0(f2, f3, f4, f);
        q3g2.ezr(7, gnl.gx3);
        q3g2.g5o(d, d4, 0.0).pzw();
        q3g2.g5o(d3, d4, 0.0).pzw();
        q3g2.g5o(d3, d2, 0.0).pzw();
        q3g2.g5o(d, d2, 0.0).pzw();
        jom.yut().q7g();
        hzu.rqj();
        hzu.ux6();
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public int jup(int n, int n2, int n3, int n4) {
        int n5 = fe6.faa(n4, 0, 255) << 24;
        n5 |= fe6.faa(n, 0, 255) << 16;
        n5 |= fe6.faa(n2, 0, 255) << 8;
        return n5 |= fe6.faa(n3, 0, 255);
    }

    public int qm9(int n, int n2, int n3) {
        return this.jup(n, n2, n3, 255);
    }

    public int ed_(int n) {
        return this.jup(n, n, n, 255);
    }

    public int nt4(int n, int n2) {
        return this.jup(n, n, n, n2);
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

                d3x.a = c.a(4541102825790404814L, 3668431349179133233L, MethodHandles.lookup().lookupClass()).a(271427633172182L);
                var9 = d3x.a ^ 109838833222905L;
                d3x.d = new HashMap<K, V>(13);
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
                var7_3 = new String[8];
                var5_4 = 0;
                var4_5 = "\u001a\u00ec\u00b0\u00138\u00e1\u00b4\u00c9\u0080\u00d4+\u0087\u00a8\u0019\u00d3@\u00cb\u00b2\u00b2\u00c7\u00aa\u0097\u0091bw\u00ae\u00d17\u00c7Hk\u008a\u0095\u00eawp,\u00ab\u00ec\u00f4\u0010\u0098\u0006i.\u00a4\u0007{A\u00cfP\u00b9\u00c4\u00ad\u00011\u001e\u0010\u000e\u00a0\u00f9\u00bbAe\u00aa\u0018\u00e6\u008a\u009534\u00d5\u00a36(\u001d\u00a5\u00c2Q\u001f\u001c\u0097\u0086\t\u0099\u00c3\u00deP&PF\u00c2\u001e\u00f4\u00d28fq\u00c8?\u0099\u00c2\u00eb3l\u009a\u0086M\u0080|\u0081\u0084\u00d4\u00d5x\u0010K\u00b3\u0015\u00e6\u00f7W\u008c|O\u00af\u00caq\u0095X\u000b\u0015 \u0007 9\u00b3\u0015\u001d\u0084)\u0092\u0098d\u0010\u00f6|\u00cf\u00bd;U\u008f\t\u00eb|\u0083\u00bao\u000b\u008d,e\u0099\u00a4f";
                var6_6 = "\u001a\u00ec\u00b0\u00138\u00e1\u00b4\u00c9\u0080\u00d4+\u0087\u00a8\u0019\u00d3@\u00cb\u00b2\u00b2\u00c7\u00aa\u0097\u0091bw\u00ae\u00d17\u00c7Hk\u008a\u0095\u00eawp,\u00ab\u00ec\u00f4\u0010\u0098\u0006i.\u00a4\u0007{A\u00cfP\u00b9\u00c4\u00ad\u00011\u001e\u0010\u000e\u00a0\u00f9\u00bbAe\u00aa\u0018\u00e6\u008a\u009534\u00d5\u00a36(\u001d\u00a5\u00c2Q\u001f\u001c\u0097\u0086\t\u0099\u00c3\u00deP&PF\u00c2\u001e\u00f4\u00d28fq\u00c8?\u0099\u00c2\u00eb3l\u009a\u0086M\u0080|\u0081\u0084\u00d4\u00d5x\u0010K\u00b3\u0015\u00e6\u00f7W\u008c|O\u00af\u00caq\u0095X\u000b\u0015 \u0007 9\u00b3\u0015\u001d\u0084)\u0092\u0098d\u0010\u00f6|\u00cf\u00bd;U\u008f\t\u00eb|\u0083\u00bao\u000b\u008d,e\u0099\u00a4f".length();
                var3_7 = 40;
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
                    var7_3[var5_4++] = d3x.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00ae\u000eE\u00fb\u0005\u00ad:\u00d5\u00e4\u00e1\u008e\u0082\u00b6\u00ea\u0089\u0088\u00a5\u0017\u0006\u00c0\u00f2\u00bf\u0013f\u0093\u00cd\u00dc\u00ca9R>\u000b\u00c8\u00b2\u0097\u00acuA\u00b9\u009d\u00fbb?\u009c\u00b0\u00acF\u00baj\u00da\u00c4\u001c\u0098\u0088H}\u001e\u00f1?\u00cd\u008e\u001f\u00b1)\u00111.\u00f8?jPX\u00b9x\u00a3\u0005\u00ab9r\u00b7-\u00e5\u007ff\u00d9W\u00a7_\u00b6y\u00aa\u00b38\u00de{^(\u001a\u0089\u0093l\u00aaJ\u0092|\u0015v;\u00dc\u00dbN\u00cd\u00c3+\u00c2\u0012O\u0099\u009f^\\\n'\u00c2L\u00abCW\u00a7\u00a6\u00b7]H9\u001d(\u00e0";
                    var6_6 = "\u00ae\u000eE\u00fb\u0005\u00ad:\u00d5\u00e4\u00e1\u008e\u0082\u00b6\u00ea\u0089\u0088\u00a5\u0017\u0006\u00c0\u00f2\u00bf\u0013f\u0093\u00cd\u00dc\u00ca9R>\u000b\u00c8\u00b2\u0097\u00acuA\u00b9\u009d\u00fbb?\u009c\u00b0\u00acF\u00baj\u00da\u00c4\u001c\u0098\u0088H}\u001e\u00f1?\u00cd\u008e\u001f\u00b1)\u00111.\u00f8?jPX\u00b9x\u00a3\u0005\u00ab9r\u00b7-\u00e5\u007ff\u00d9W\u00a7_\u00b6y\u00aa\u00b38\u00de{^(\u001a\u0089\u0093l\u00aaJ\u0092|\u0015v;\u00dc\u00dbN\u00cd\u00c3+\u00c2\u0012O\u0099\u009f^\\\n'\u00c2L\u00abCW\u00a7\u00a6\u00b7]H9\u001d(\u00e0".length();
                    var3_7 = 96;
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
                    var7_3[var5_4++] = d3x.a(var8_9).intern();
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
        d3x.b = var7_3;
        d3x.c = new String[8];
        d3x.jg8 = new d3x((String)d3x.a("r", (int)1049, (long)(7010641392827431125L ^ var9)), 0);
        d3x.ora = new d3x[]{d3x.jg8};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7504;
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
                throw new RuntimeException("d3x", exception);
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
            d3x.c[n2] = d3x.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = d3x.a(n, l);
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
            throw new RuntimeException("d3x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d3x.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

