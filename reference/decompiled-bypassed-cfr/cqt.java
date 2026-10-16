/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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

public class cqt {
    public String ypu;
    public ers l27;
    public boolean r12;
    public float emz = 0.0f;
    public boolean jz6 = false;
    public boolean ylh = false;
    public float yr_;
    public float q3h;
    private static final long a = c.a(-2343965584012797521L, 1368330435156209609L, MethodHandles.lookup().lookupClass()).a(47266090637354L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cqt(ers ers2, String string, boolean bl) {
        this.l27 = ers2;
        this.ypu = string;
        this.r12 = bl;
    }

    public void ej_(float f, float f2) {
        String string;
        cyb cyb2;
        block23: {
            block22: {
                String string2;
                cyb cyb3;
                block20: {
                    block21: {
                        boolean bl;
                        block18: {
                            block19: {
                                float f3;
                                int n;
                                block24: {
                                    block15: {
                                        int n2;
                                        block16: {
                                            block17: {
                                                block14: {
                                                    this.yr_ = f;
                                                    this.q3h = f2;
                                                    n = t9d.b();
                                                    try {
                                                        try {
                                                            n2 = this.ylh;
                                                            if (n == 0) break block14;
                                                            if (n2 == 0) break block15;
                                                        }
                                                        catch (oov oov2) {
                                                            throw cqt.a(oov2);
                                                        }
                                                        n2 = this.r12;
                                                    }
                                                    catch (oov oov3) {
                                                        throw cqt.a(oov3);
                                                    }
                                                }
                                                try {
                                                    if (n == 0) break block16;
                                                    if (n2 != 0) break block17;
                                                }
                                                catch (oov oov4) {
                                                    throw cqt.a(oov4);
                                                }
                                                n2 = 15;
                                                break block16;
                                            }
                                            n2 = 0;
                                        }
                                        f3 = n2;
                                        break block24;
                                    }
                                    f3 = 0.0f;
                                }
                                float f4 = f3;
                                try {
                                    try {
                                        this.emz = ybv.lvf(this.emz, f4, Math.max(10.0f, Math.abs(this.emz - f4) * 40.0f) * 0.3f);
                                        jsr.rfr.fzf(this.ypu, f + 15.0f, f2 - 20.0f, this.l27.mom);
                                        hhf.cuu(f + 88.0f - this.emz, f2 - 23.0f, f + 90.0f, f2 - 5.0f, this.l27.jky);
                                        this.l27.ps0(f + 68.0f - this.emz, f2 - 23.0f, f + 88.0f - this.emz, f2 - 5.0f, hhf.kjo(this.l27.jky, 0.0f), hhf.kjo(this.l27.jky, 1.0f));
                                        cyb3 = jsr.tyz;
                                        bl = this.ypu.equalsIgnoreCase(this.l27.gn0);
                                        if (n == 0) break block18;
                                        if (!bl) break block19;
                                    }
                                    catch (oov oov5) {
                                        throw cqt.a(oov5);
                                    }
                                    string2 = "v";
                                    break block20;
                                }
                                catch (oov oov6) {
                                    throw cqt.a(oov6);
                                }
                            }
                            bl = this.r12;
                        }
                        try {
                            if (!bl) break block21;
                            string2 = "y";
                            break block20;
                        }
                        catch (oov oov7) {
                            throw cqt.a(oov7);
                        }
                    }
                    string2 = "x";
                }
                try {
                    cyb3.fzf(string2, f + 5.0f, f2 - 18.0f, this.l27.mom);
                    cyb2 = jsr.tyz;
                    if (this.r12) break block22;
                    string = "w";
                    break block23;
                }
                catch (oov oov8) {
                    throw cqt.a(oov8);
                }
            }
            string = "";
        }
        cyb2.fzf(string, f + 91.5f - this.emz, f2 - 18.0f, this.l27.mom);
    }

    /*
     * Unable to fully structure code
     */
    public void nvy(float var1_1, float var2_2, float var3_3) {
        block35: {
            block36: {
                block37: {
                    block34: {
                        block29: {
                            block30: {
                                block31: {
                                    block33: {
                                        block32: {
                                            var4_4 = cqt.a ^ 31662311423896L;
                                            var6_5 = t9d.c();
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        cfr_temp_0 = var3_3 - 0.0f;
                                                                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                        if (var6_5 != 0) break block29;
                                                                        if (v0 != false) break block30;
                                                                    }
                                                                    catch (oov v1) {
                                                                        throw cqt.a(v1);
                                                                    }
                                                                    v0 = (float)hhf.md3(var1_1, var2_2, this.yr_ + 15.0f, this.q3h - 23.0f, this.yr_ + 90.0f, this.q3h - 5.0f);
                                                                    if (var6_5 != 0) break block29;
                                                                }
                                                                catch (oov v2) {
                                                                    throw cqt.a(v2);
                                                                }
                                                                if (v0 == false) break block30;
                                                            }
                                                            catch (oov v3) {
                                                                throw cqt.a(v3);
                                                            }
                                                            v4 = this;
                                                            if (var6_5 != 0) break block31;
                                                        }
                                                        catch (oov v5) {
                                                            throw cqt.a(v5);
                                                        }
                                                        if (!v4.ylh) {
                                                        }
                                                        ** GOTO lbl57
                                                    }
                                                    catch (oov v6) {
                                                        throw cqt.a(v6);
                                                    }
                                                    v7 = this.l27;
                                                    v8 = new StringBuilder();
                                                    if (!this.r12) break block32;
                                                }
                                                catch (oov v9) {
                                                    throw cqt.a(v9);
                                                }
                                                v10 = "#";
                                                break block33;
                                            }
                                            catch (oov v11) {
                                                throw cqt.a(v11);
                                            }
                                        }
                                        v10 = "";
                                    }
                                    try {
                                        v7.car(v8.append(v10).append(this.ypu).toString());
                                        if (var6_5 == 0) break block30;
lbl57:
                                        // 2 sources

                                        c05.vz1().z2i(new kf9((ha_)LambdaMetafactory.metafactory(null, null, null, (ZI)V, kgj(boolean int ), (ZI)V)((cqt)this), (String)cqt.a("l", (int)15816, (long)(7204096656140712153L ^ var4_4)) + (Object)syo.iyk + this.ypu + (Object)syo.w29 + (String)cqt.a("l", (int)1872, (long)(8869202401196606016L ^ var4_4)), "", 0));
                                        v4 = this;
                                    }
                                    catch (oov v12) {
                                        throw cqt.a(v12);
                                    }
                                }
                                v4.ylh = false;
                            }
                            v0 = (cfr_temp_1 = var3_3 - 1.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                        }
                        try {
                            try {
                                if (var6_5 != 0) break block34;
                                if (v0 != false) break block35;
                            }
                            catch (oov v13) {
                                throw cqt.a(v13);
                            }
                            v0 = (float)hhf.md3(var1_1, var2_2, this.yr_ + 15.0f, this.q3h - 23.0f, this.yr_ + 90.0f, this.q3h - 5.0f);
                        }
                        catch (oov v14) {
                            throw cqt.a(v14);
                        }
                    }
                    try {
                        try {
                            if (v0 != false) {
                                v15 = this;
                                v16 = this.ylh;
                                if (var6_5 != 0) break block36;
                            }
                            ** GOTO lbl101
                        }
                        catch (oov v17) {
                            throw cqt.a(v17);
                        }
                        if (v16) break block37;
                    }
                    catch (oov v18) {
                        throw cqt.a(v18);
                    }
                    v16 = true;
                    break block36;
                }
                v16 = false;
            }
            try {
                v15.ylh = v16;
                if (var6_5 == 0) break block35;
lbl101:
                // 2 sources

                this.ylh = false;
            }
            catch (oov v19) {
                throw cqt.a(v19);
            }
        }
    }

    private void kgj(boolean bl, int n) {
        try {
            if (bl) {
                this.l27.thf(this.ypu);
            }
        }
        catch (oov oov2) {
            throw cqt.a(oov2);
        }
        c05.vz1().z2i(this.l27.usm);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x374875F52D6EL;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u007f\u008c>\u0000#d&\u00f9/M\u00b5^\u008eb\u00f6\u00fc\u0090vEw>\u00b7\u00cf\u00f6\u00a2S\u00b7\u00f9\u000b\u00b1\u00ca\u0000L\u00d6i.\u0014\u00b7\u00c4\u008c\u00e1\u00b0~\u00bb\u0080\u008f\u00afC\u0080_\\\u00ea\u00dbgg9\u0000\u00de\u00dcb~?-\u00e5\u0095\u0004\u00cc\n\u00ea\u00eb_^\u0083\u00cdT\u00e4A\u0083\u001f\u00de\u0010\u00ab\u00ab\u009b\u000e\u00ac-\u0014LK&\u00aeXwVA2";
        int n2 = "\u007f\u008c>\u0000#d&\u00f9/M\u00b5^\u008eb\u00f6\u00fc\u0090vEw>\u00b7\u00cf\u00f6\u00a2S\u00b7\u00f9\u000b\u00b1\u00ca\u0000L\u00d6i.\u0014\u00b7\u00c4\u008c\u00e1\u00b0~\u00bb\u0080\u008f\u00afC\u0080_\\\u00ea\u00dbgg9\u0000\u00de\u00dcb~?-\u00e5\u0095\u0004\u00cc\n\u00ea\u00eb_^\u0083\u00cdT\u00e4A\u0083\u001f\u00de\u0010\u00ab\u00ab\u009b\u000e\u00ac-\u0014LK&\u00aeXwVA2".length();
        int n3 = 80;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cqt.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x59FD;
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
                throw new RuntimeException("cqt", exception);
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
            cqt.c[n2] = cqt.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cqt.a(n, l);
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
            throw new RuntimeException("cqt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cqt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

