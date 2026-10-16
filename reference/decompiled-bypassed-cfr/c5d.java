/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class c5d {
    /*
     * Unable to fully structure code
     */
    public static void _xi(String var0, int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        var6_6 = t9d.b();
        try {
            block10: {
                block9: {
                    x0l.m1h(x0l.to8(var0), var0).loadTexture(c05.vz1().mpf());
                    c05.vz1().l22().anl(x0l.to8(var0));
                    var7_7 = jom.yut();
                    var8_9 = var7_7.zuq();
                    GL11.glEnable((int)3042);
                    if (var6_6 == 0) break block9;
                    try {
                        block11: {
                            if (!var5_5) ** GOTO lbl26
                            break block11;
                            catch (Exception v0) {
                                throw c5d.a(v0);
                            }
                        }
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    }
                    catch (Exception v1) {
                        throw c5d.a(v1);
                    }
                }
                try {
                    if (var6_6 != 0) break block10;
lbl26:
                    // 2 sources

                    GL11.glColor4f((float)0.9f, (float)0.9f, (float)0.9f, (float)1.0f);
                }
                catch (Exception v2) {
                    throw c5d.a(v2);
                }
            }
            var9_10 = 32.0;
            var11_11 = 32.0;
            var13_12 = 32.0;
            var15_13 = 32.0;
            var8_9.ezr(7, gnl._r5);
            var8_9.g5o((double)var1_1 + 0.0, (double)var2_2 + (double)var4_4, 0.0).h0a((float)(var13_12 + 0.0) * 0.00390625f, (float)(var15_13 + var11_11) * 0.00390625f).pzw();
            var8_9.g5o((double)var1_1 + (double)var3_3, (double)var2_2 + (double)var4_4, 0.0).h0a((float)(var13_12 + var9_10) * 0.00390625f, (float)(var15_13 + var11_11) * 0.00390625f).pzw();
            var8_9.g5o((double)var1_1 + (double)var3_3, (double)var2_2 + 0.0, 0.0).h0a((float)(var13_12 + var9_10) * 0.00390625f, (float)(var15_13 + 0.0) * 0.00390625f).pzw();
            var8_9.g5o((double)var1_1 + 0.0, (double)var2_2 + 0.0, 0.0).h0a((float)(var13_12 + 0.0) * 0.00390625f, (float)(var15_13 + 0.0) * 0.00390625f).pzw();
            var7_7.q7g();
            var9_10 = 32.0;
            var11_11 = 32.0;
            var13_12 = 160.0;
            var15_13 = 32.0;
            var8_9.ezr(7, gnl._r5);
            var8_9.g5o((double)var1_1 + 0.0, (double)var2_2 + (double)var4_4, 0.0).h0a((float)(var13_12 + 0.0) * 0.00390625f, (float)(var15_13 + var11_11) * 0.00390625f).pzw();
            var8_9.g5o((double)var1_1 + (double)var3_3, (double)var2_2 + (double)var4_4, 0.0).h0a((float)(var13_12 + var9_10) * 0.00390625f, (float)(var15_13 + var11_11) * 0.00390625f).pzw();
            var8_9.g5o((double)var1_1 + (double)var3_3, (double)var2_2 + 0.0, 0.0).h0a((float)(var13_12 + var9_10) * 0.00390625f, (float)(var15_13 + 0.0) * 0.00390625f).pzw();
            var8_9.g5o((double)var1_1 + 0.0, (double)var2_2 + 0.0, 0.0).h0a((float)(var13_12 + 0.0) * 0.00390625f, (float)(var15_13 + 0.0) * 0.00390625f).pzw();
            var7_7.q7g();
            GL11.glDisable((int)3042);
        }
        catch (Exception var7_8) {
            var7_8.printStackTrace();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

