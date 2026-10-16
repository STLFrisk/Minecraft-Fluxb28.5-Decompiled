/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
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
import org.lwjgl.opengl.GL11;

public class a9_
extends ar7 {
    public static c_3 a0x;
    public static cn7 l36;
    public static cn7 bn9;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public a9_() {
        long l = a ^ 0x698722BFC383L;
        super((String)((Object)a9_.b("z", (int)4978, (long)(0x1C059C339018C3ACL ^ l))), _aj.sxc, a0x);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @jev
    public void e3i(dxp var1_1) {
        block63: {
            block80: {
                block79: {
                    block64: {
                        block65: {
                            block82: {
                                block62: {
                                    var2_2 = a9_.a ^ 101162784380611L;
                                    var4_3 = t9d.c();
                                    v0 = var1_1;
                                    if (var4_3 != 0) break block62;
                                    try {
                                        block81: {
                                            if (v0.oxg() == a9_.ek1.vg8) break block63;
                                            break block81;
                                            catch (ArrayIndexOutOfBoundsException v1) {
                                                throw a9_.a(v1);
                                            }
                                        }
                                        v0 = var1_1;
                                    }
                                    catch (ArrayIndexOutOfBoundsException v2) {
                                        throw a9_.a(v2);
                                    }
                                }
                                v3 = v0.ike();
                                if (var4_3 != 0) break block64;
                                if (v3 == 0) ** GOTO lbl219
                                break block82;
                                catch (ArrayIndexOutOfBoundsException v4) {
                                    throw a9_.a(v4);
                                }
                            }
                            try {
                                block83: {
                                    v5 = a9_.a0x.wyk((String)a9_.b("z", (int)19620, (long)(7368785220895836473L ^ var2_2)));
                                    if (var4_3 != 0) break block65;
                                    break block83;
                                    catch (ArrayIndexOutOfBoundsException v6) {
                                        throw a9_.a(v6);
                                    }
                                }
                                if (v5 != 0) {
                                }
                                ** GOTO lbl207
                            }
                            catch (ArrayIndexOutOfBoundsException v7) {
                                throw a9_.a(v7);
                            }
                            var1_1.wxi(true);
                            try {
                                block77: {
                                    block78: {
                                        block76: {
                                            block75: {
                                                block69: {
                                                    block74: {
                                                        block87: {
                                                            block67: {
                                                                block68: {
                                                                    block66: {
                                                                        block85: {
                                                                            block84: {
                                                                                var5_4 = a9_.ek1.ibs().ihn(var1_1.oxg());
                                                                                if (var5_4 == null) break block63;
                                                                                if (a9_.ek1.ibs().ewh == null) break block63;
                                                                                break block84;
                                                                                catch (ArrayIndexOutOfBoundsException v8) {
                                                                                    throw a9_.a(v8);
                                                                                }
                                                                            }
                                                                            v9 = var5_4 instanceof gmu;
                                                                            if (var4_3 != 0) break block66;
                                                                            break block85;
                                                                            catch (ArrayIndexOutOfBoundsException v10) {
                                                                                throw a9_.a(v10);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block86: {
                                                                                if (v9 == 0) break block63;
                                                                                break block86;
                                                                                catch (ArrayIndexOutOfBoundsException v11) {
                                                                                    throw a9_.a(v11);
                                                                                }
                                                                            }
                                                                            GL11.glPushMatrix();
                                                                            GL11.glDisable((int)2929);
                                                                            GL11.glBlendFunc((int)770, (int)771);
                                                                            GL11.glDisable((int)3553);
                                                                            v9 = 3042;
                                                                        }
                                                                        catch (ArrayIndexOutOfBoundsException v12) {
                                                                            throw a9_.a(v12);
                                                                        }
                                                                    }
                                                                    GL11.glEnable((int)v9);
                                                                    var6_6 = null;
                                                                    try {
                                                                        v13 = a9_.l36.g7m();
                                                                        if (var4_3 != 0) break block67;
                                                                        if (!v13) break block68;
                                                                    }
                                                                    catch (ArrayIndexOutOfBoundsException v14) {
                                                                        throw a9_.a(v14);
                                                                    }
                                                                    hzu.fpt();
                                                                }
                                                                v13 = a9_.bn9.g7m();
                                                            }
                                                            if (!v13) break block87;
                                                            var7_7 = var1_1.oxg().xyw()._2o();
                                                            var8_8 = 0;
                                                            while (var8_8 < var7_7.length()) {
                                                                block73: {
                                                                    block71: {
                                                                        block72: {
                                                                            block70: {
                                                                                block89: {
                                                                                    block88: {
                                                                                        v15 = var7_7.charAt(var8_8);
                                                                                        if (var4_3 != 0) break block69;
                                                                                        v16 = 167;
                                                                                        if (var4_3 != 0) break block70;
                                                                                        break block88;
                                                                                        catch (ArrayIndexOutOfBoundsException v17) {
                                                                                            throw a9_.a(v17);
                                                                                        }
                                                                                    }
                                                                                    if (v15 != v16) break block71;
                                                                                    break block89;
                                                                                    catch (ArrayIndexOutOfBoundsException v18) {
                                                                                        throw a9_.a(v18);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block90: {
                                                                                        v19 = var8_8 + 1;
                                                                                        if (var4_3 != 0) break block72;
                                                                                        break block90;
                                                                                        catch (ArrayIndexOutOfBoundsException v20) {
                                                                                            throw a9_.a(v20);
                                                                                        }
                                                                                    }
                                                                                    v16 = var7_7.length();
                                                                                }
                                                                                catch (ArrayIndexOutOfBoundsException v21) {
                                                                                    throw a9_.a(v21);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (v19 >= v16) break block71;
                                                                                v19 = Character.toLowerCase(var7_7.charAt(var8_8 + 1));
                                                                            }
                                                                            catch (ArrayIndexOutOfBoundsException v22) {
                                                                                throw a9_.a(v22);
                                                                            }
                                                                        }
                                                                        var9_9 = v19;
                                                                        var10_10 = a9_.b("z", (int)1249, (long)(9057703067817001336L ^ var2_2)).indexOf(var9_9);
                                                                        try {
                                                                            if (var4_3 != 0) break block73;
                                                                            if (var10_10 >= 16) break block71;
                                                                        }
                                                                        catch (ArrayIndexOutOfBoundsException v23) {
                                                                            throw a9_.a(v23);
                                                                        }
                                                                        try {
                                                                            var11_11 = var6_6 = new Color(a9_.ek1.tx1.fgp[var10_10]);
                                                                            GL11.glColor4f((float)((float)var11_11.getRed() / 255.0f), (float)((float)var11_11.getGreen() / 255.0f), (float)((float)var11_11.getBlue() / 255.0f), (float)1.0f);
                                                                        }
                                                                        catch (ArrayIndexOutOfBoundsException var11_12) {
                                                                            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                                                                        }
                                                                    }
                                                                    ++var8_8;
                                                                }
                                                                if (var4_3 == 0) continue;
                                                                break block74;
                                                            }
                                                            break block74;
                                                        }
                                                        GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                                                    }
                                                    ((gmu)var5_4).o7f(var1_1.oxg(), var1_1.bnh(), var1_1.h94(), var1_1.o_d(), var1_1.vqe(), var1_1.uva(), var1_1.nch());
                                                    GL11.glEnable((int)2929);
                                                    v15 = (int)a9_.bn9.g7m();
                                                }
                                                if (v15 == 0) ** GOTO lbl177
                                                try {
                                                    block91: {
                                                        v24 = var6_6;
                                                        if (var4_3 != 0) break block75;
                                                        break block91;
                                                        catch (ArrayIndexOutOfBoundsException v25) {
                                                            throw a9_.a(v25);
                                                        }
                                                    }
                                                    if (v24 != null) {
                                                    }
                                                    ** GOTO lbl177
                                                }
                                                catch (ArrayIndexOutOfBoundsException v26) {
                                                    throw a9_.a(v26);
                                                }
                                                v24 = var6_6;
                                            }
                                            try {
                                                GL11.glColor4f((float)((float)v24.getRed() / 255.0f), (float)((float)var6_6.getGreen() / 255.0f), (float)((float)var6_6.getBlue() / 255.0f), (float)1.0f);
                                                if (var4_3 == 0) break block76;
lbl177:
                                                // 3 sources

                                                GL11.glColor4f((float)0.0f, (float)1.0f, (float)0.0f, (float)1.0f);
                                            }
                                            catch (ArrayIndexOutOfBoundsException v27) {
                                                throw a9_.a(v27);
                                            }
                                        }
                                        ((gmu)var5_4).o7f(var1_1.oxg(), var1_1.bnh(), var1_1.h94(), var1_1.o_d(), var1_1.vqe(), var1_1.uva(), var1_1.nch());
                                        GL11.glEnable((int)3553);
                                        GL11.glDisable((int)3042);
                                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                        if (var4_3 != 0) break block77;
                                        try {
                                            block92: {
                                                if (!a9_.l36.g7m()) break block78;
                                                break block92;
                                                catch (ArrayIndexOutOfBoundsException v28) {
                                                    throw a9_.a(v28);
                                                }
                                            }
                                            hzu.s7q();
                                        }
                                        catch (ArrayIndexOutOfBoundsException v29) {
                                            throw a9_.a(v29);
                                        }
                                    }
                                    GL11.glPopMatrix();
                                    ((gmu)var5_4).x50(var1_1.oxg(), var1_1.bnh(), var1_1.h94(), a9_.ek1.gze.au3, var1_1.o_d(), var1_1.vqe(), var1_1.uva(), var1_1.nch());
                                }
                                GL11.glPopMatrix();
                                break block63;
                            }
                            catch (Exception var5_5) {
                                try {
                                    if (var4_3 == 0) break block63;
lbl207:
                                    // 2 sources

                                    v5 = 32823;
                                }
                                catch (ArrayIndexOutOfBoundsException v30) {
                                    throw a9_.a(v30);
                                }
                            }
                        }
                        try {
                            GL11.glEnable((int)v5);
                            GL11.glPolygonOffset((float)1.0f, (float)-1100000.0f);
                            if (var4_3 == 0) break block63;
lbl219:
                            // 2 sources

                            v3 = (int)a9_.a0x.wyk((String)a9_.b("z", (int)23449, (long)(2668999783924964867L ^ var2_2)));
                        }
                        catch (ArrayIndexOutOfBoundsException v31) {
                            throw a9_.a(v31);
                        }
                    }
                    try {
                        try {
                            if (var4_3 != 0) break block79;
                            if (v3 != 0) break block63;
                        }
                        catch (ArrayIndexOutOfBoundsException v32) {
                            throw a9_.a(v32);
                        }
                        v3 = var1_1.ypz();
                    }
                    catch (ArrayIndexOutOfBoundsException v33) {
                        throw a9_.a(v33);
                    }
                }
                try {
                    try {
                        if (var4_3 != 0) break block80;
                        if (v3 == 0) break block63;
                    }
                    catch (ArrayIndexOutOfBoundsException v34) {
                        throw a9_.a(v34);
                    }
                    v3 = 32823;
                }
                catch (ArrayIndexOutOfBoundsException v35) {
                    throw a9_.a(v35);
                }
            }
            GL11.glDisable((int)v3);
            GL11.glPolygonOffset((float)1.0f, (float)1100000.0f);
        }
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

                a9_.a = c.a(-4147614426553556156L, -7894421008528039886L, MethodHandles.lookup().lookupClass()).a(45492379105827L);
                var9 = a9_.a ^ 117028295364956L;
                a9_.h = new HashMap<K, V>(13);
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
                var7_3 = new String[10];
                var5_4 = 0;
                var4_5 = "5'T\u008c#kx\u00c2z\u00f6\u00e6H\u00db\u00d9\u00b1@\u0010\u00c5\u0015I0\u00c5%\u001d\u00e1\u00a8\u00e9\u00cd\u00e0\u00c2\u0017\u00b1\u0017\u0010\u00a4\u0015\u00caL(\u00c7\u00996\u00e4\u00f0\u00ecL\u0001\u00a5\u00ae[ U\u008c\u0013;\bf\u008c\u00e6\u0081\u00efB\u0081\u00fe\u001fd\u00e3?p)\u00d7\u0095\u00ceO\u0095\u0018\u0016&\u008a\u0090\u00a2\u0000\u001f(\u0097\u0007p\u0092c\u00b1VY\t\u008d\u00c1\u00a3\u008c\u00f6\u00ad\u00ba\u00d4\u0006\t8\u00f6}l$\u00f9\u00ff\u00ca\u0012\"s\u00fe7R \u00e3\u00d7\u00a0\u00cc\u00f36\u0018<\u00e1\u00e0[/d\u00f8\u00e8\u00ba\u009d)\u000ey\u0081 D6\u008d\u00f7\u00de\u00f1kG0 `\u00bbpA\u007f\u00b7y#\u0082\u0093M\u00d6a]\u0081\u00b5jwA\u00b3\u00c8Y\u0085\"\u0010\u00e9\u00e5\u00d8'\u00e8\u00d10\u0010a\u00a2n\u00b0\u00d5\u00faF$&\u00d5\u009ci-\u00f8\u0080\u00df";
                var6_6 = "5'T\u008c#kx\u00c2z\u00f6\u00e6H\u00db\u00d9\u00b1@\u0010\u00c5\u0015I0\u00c5%\u001d\u00e1\u00a8\u00e9\u00cd\u00e0\u00c2\u0017\u00b1\u0017\u0010\u00a4\u0015\u00caL(\u00c7\u00996\u00e4\u00f0\u00ecL\u0001\u00a5\u00ae[ U\u008c\u0013;\bf\u008c\u00e6\u0081\u00efB\u0081\u00fe\u001fd\u00e3?p)\u00d7\u0095\u00ceO\u0095\u0018\u0016&\u008a\u0090\u00a2\u0000\u001f(\u0097\u0007p\u0092c\u00b1VY\t\u008d\u00c1\u00a3\u008c\u00f6\u00ad\u00ba\u00d4\u0006\t8\u00f6}l$\u00f9\u00ff\u00ca\u0012\"s\u00fe7R \u00e3\u00d7\u00a0\u00cc\u00f36\u0018<\u00e1\u00e0[/d\u00f8\u00e8\u00ba\u009d)\u000ey\u0081 D6\u008d\u00f7\u00de\u00f1kG0 `\u00bbpA\u007f\u00b7y#\u0082\u0093M\u00d6a]\u0081\u00b5jwA\u00b3\u00c8Y\u0085\"\u0010\u00e9\u00e5\u00d8'\u00e8\u00d10\u0010a\u00a2n\u00b0\u00d5\u00faF$&\u00d5\u009ci-\u00f8\u0080\u00df".length();
                var3_7 = 16;
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
                    var7_3[var5_4++] = a9_.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "E\u0083\u00ffn\u00a4.G\u00fb\u00c7\u001bTVq\u00c7\u00b3a\u0010Z\f\u00d4s\u0096\u0001Vk\u00aa(\u00bfp\u008a\u00d1\u00ac\u00c6";
                    var6_6 = "E\u0083\u00ffn\u00a4.G\u00fb\u00c7\u001bTVq\u00c7\u00b3a\u0010Z\f\u00d4s\u0096\u0001Vk\u00aa(\u00bfp\u008a\u00d1\u00ac\u00c6".length();
                    var3_7 = 16;
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
                    var7_3[var5_4++] = a9_.b(var8_9).intern();
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
        a9_.f = var7_3;
        a9_.g = new String[10];
        v7 = new String[2];
        v7[0] = a9_.b("z", (int)27160, (long)(8115555957564647448L ^ var9));
        v7[1] = a9_.b("z", (int)23449, (long)(2668953733183543708L ^ var9));
        a9_.a0x = new c_3((String)a9_.b("z", (int)11716, (long)(1789442707319025600L ^ var9)), (String)a9_.b("z", (int)20076, (long)(7662236713901952102L ^ var9)), (String)a9_.b("z", (int)479, (long)(8956728202250175452L ^ var9)), v7);
        a9_.l36 = new cn7((String)a9_.b("z", (int)4978, (long)(2019195772894859635L ^ var9)), (String)a9_.b("z", (int)15681, (long)(6712640280287772490L ^ var9)), false);
        a9_.bn9 = new cn7((String)a9_.b("z", (int)4978, (long)(2019195772894859635L ^ var9)), (String)a9_.b("z", (int)10829, (long)(1203982739682388042L ^ var9)), false);
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E87;
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
                throw new RuntimeException("a9_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            a9_.g[n2] = a9_.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a9_.b(n, l);
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
            throw new RuntimeException("a9_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a9_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

