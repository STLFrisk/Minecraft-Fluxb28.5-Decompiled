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

public class f2j
extends j1s {
    private /* synthetic */ int fbt;
    private /* synthetic */ double le4;
    private /* synthetic */ double c9d;
    private /* synthetic */ double jwd;
    private /* synthetic */ boolean hsi;
    private static final long a = c.a(395415027277346707L, 2306066043379857992L, MethodHandles.lookup().lookupClass()).a(24342971044657L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public f2j() {
        long l = a ^ 0xE04A895E89BL;
        super((String)((Object)f2j.a("m", (int)7414, (long)(0x73741ECA8D6FE2FDL ^ l))), (String)((Object)f2j.a("m", (int)5126, (long)(0x52E607422CE5EA0CL ^ l))));
        this.jwd = 6.5;
        this.fbt = 1;
        this.le4 = 0.1873;
    }

    @Override
    public void w4v() {
        super.w4v();
        this.fbt = 1;
        this.le4 = 0.1873;
        this.hsi = false;
        this.wyl.z8v().qeu = 1.0f;
    }

    @Override
    public void i__() {
        super.i__();
        this.wyl.gze.qeu = 1.0f;
        this.le4 = 0.1873;
        this.c9d = 0.0;
        this.fbt = 4;
        this.hsi = false;
        this.wyl.z8v().qeu = 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void qs5(_qa var1_1) {
        block92: {
            block87: {
                block83: {
                    block90: {
                        block91: {
                            block88: {
                                block86: {
                                    block84: {
                                        block78: {
                                            block81: {
                                                block79: {
                                                    block76: {
                                                        block77: {
                                                            block74: {
                                                                block75: {
                                                                    block72: {
                                                                        block73: {
                                                                            var2_2 = t9d.b();
                                                                            try {
                                                                                try {
                                                                                    this.wyl.z8v().qeu = 1.0f;
                                                                                    cfr_temp_0 = rak.meb(this.wyl.vg8.kfp - (double)((int)this.wyl.vg8.kfp), 3) - rak.meb(0.41, 3);
                                                                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                    if (var2_2 == 0) break block72;
                                                                                    if (v0 != false) break block73;
                                                                                }
                                                                                catch (oov v1) {
                                                                                    throw f2j.a(v1);
                                                                                }
                                                                                this.wyl.vg8.mop = 0.0;
                                                                            }
                                                                            catch (oov v2) {
                                                                                throw f2j.a(v2);
                                                                            }
                                                                        }
                                                                        v0 = (cfr_temp_1 = this.wyl.vg8.z66 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var2_2 == 0) break block74;
                                                                                    if (v0 >= 0) break block75;
                                                                                }
                                                                                catch (oov v3) {
                                                                                    throw f2j.a(v3);
                                                                                }
                                                                                cfr_temp_2 = this.wyl.vg8.ooc - 0.0f;
                                                                                v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                                                                if (var2_2 == 0) break block74;
                                                                            }
                                                                            catch (oov v4) {
                                                                                throw f2j.a(v4);
                                                                            }
                                                                            if (v0 >= 0) break block75;
                                                                        }
                                                                        catch (oov v5) {
                                                                            throw f2j.a(v5);
                                                                        }
                                                                        this.fbt = 1;
                                                                    }
                                                                    catch (oov v6) {
                                                                        throw f2j.a(v6);
                                                                    }
                                                                }
                                                                v0 = (cfr_temp_3 = rak.b5b(this.wyl.vg8.kfp - (double)((int)this.wyl.vg8.kfp), 3) - rak.b5b(0.943, 3)) == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                            }
                                                            try {
                                                                try {
                                                                    if (var2_2 == 0) break block76;
                                                                    if (v0 != false) break block77;
                                                                }
                                                                catch (oov v7) {
                                                                    throw f2j.a(v7);
                                                                }
                                                                this.wyl.vg8.mop = 0.0;
                                                            }
                                                            catch (oov v8) {
                                                                throw f2j.a(v8);
                                                            }
                                                        }
                                                        v0 = this.fbt;
                                                    }
                                                    try {
                                                        block80: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v9 = 1;
                                                                                if (var2_2 == 0) break block78;
                                                                                if (v0 == v9) {
                                                                                }
                                                                                ** GOTO lbl117
                                                                            }
                                                                            catch (oov v10) {
                                                                                throw f2j.a(v10);
                                                                            }
                                                                            cfr_temp_4 = this.wyl.vg8.ooc - 0.0f;
                                                                            v0 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                                                            if (var2_2 == 0) break block79;
                                                                        }
                                                                        catch (oov v11) {
                                                                            throw f2j.a(v11);
                                                                        }
                                                                        if (v0 != false) break block80;
                                                                    }
                                                                    catch (oov v12) {
                                                                        throw f2j.a(v12);
                                                                    }
                                                                    cfr_temp_5 = this.wyl.vg8.z66 - 0.0f;
                                                                    v0 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                                                                    if (var2_2 == 0) break block81;
                                                                }
                                                                catch (oov v13) {
                                                                    throw f2j.a(v13);
                                                                }
                                                                if (v0 != false) {
                                                                }
                                                                ** GOTO lbl117
                                                            }
                                                            catch (oov v14) {
                                                                throw f2j.a(v14);
                                                            }
                                                        }
                                                        v0 = (double)this.wyl.vg8.fcv;
                                                    }
                                                    catch (oov v15) {
                                                        throw f2j.a(v15);
                                                    }
                                                }
                                                try {
                                                    block82: {
                                                        try {
                                                            try {
                                                                if (var2_2 == 0) break block81;
                                                                if (v0 == false) break block82;
                                                            }
                                                            catch (oov v16) {
                                                                throw f2j.a(v16);
                                                            }
                                                            this.fbt = 2;
                                                            this.le4 = this.jwd * 0.1873 - 0.01;
                                                            this.wyl.z8v().qeu = 0.1f;
                                                            opd.de2(70);
                                                            this.wyl.z8v().qeu = 1.0f;
                                                            if (var2_2 != 0) break block83;
                                                        }
                                                        catch (oov v17) {
                                                            throw f2j.a(v17);
                                                        }
                                                    }
                                                    v0 = this.fbt;
                                                }
                                                catch (oov v18) {
                                                    throw f2j.a(v18);
                                                }
                                            }
                                            v9 = 2;
                                        }
                                        try {
                                            block85: {
                                                try {
                                                    try {
                                                        if (var2_2 == 0) break block84;
                                                        if (v0 != v9) break block85;
                                                    }
                                                    catch (oov v19) {
                                                        throw f2j.a(v19);
                                                    }
                                                    this.fbt = 3;
                                                    this.wyl.vg8.mop = 0.399;
                                                    var1_1.wam = 0.399;
                                                    this.le4 *= 2.149802;
                                                    this.hsi = true;
                                                    if (var2_2 != 0) break block83;
                                                }
                                                catch (oov v20) {
                                                    throw f2j.a(v20);
                                                }
                                            }
                                            v0 = this.fbt;
                                            v9 = 3;
                                        }
                                        catch (oov v21) {
                                            throw f2j.a(v21);
                                        }
                                    }
                                    try {
                                        if (var2_2 == 0) break block86;
                                        if (v0 == v9) {
                                        }
                                        ** GOTO lbl162
                                    }
                                    catch (oov v22) {
                                        throw f2j.a(v22);
                                    }
                                    this.fbt = 4;
                                    var3_3 = 0.66 * (this.c9d - 0.1873);
                                    try {
                                        try {
                                            this.le4 = this.c9d - var3_3;
                                            if (var2_2 != 0) break block83;
lbl162:
                                            // 2 sources

                                            v23 = this;
                                            if (var2_2 == 0) break block87;
                                        }
                                        catch (oov v24) {
                                            throw f2j.a(v24);
                                        }
                                        v0 = v23.fbt;
                                        v9 = 4;
                                    }
                                    catch (oov v25) {
                                        throw f2j.a(v25);
                                    }
                                }
                                try {
                                    block89: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (v0 != v9) break block83;
                                                        this.le4 = this.c9d - this.c9d / 159.0;
                                                        v26 = this.wyl.tij.bb4(this.wyl.vg8, this.wyl.vg8.aaw().sy_(0.0, this.wyl.vg8.mop, 0.0)).size();
                                                        if (var2_2 == 0) break block88;
                                                    }
                                                    catch (oov v27) {
                                                        throw f2j.a(v27);
                                                    }
                                                    if (v26 > 0) break block89;
                                                }
                                                catch (oov v28) {
                                                    throw f2j.a(v28);
                                                }
                                                v23 = this;
                                                if (var2_2 == 0) break block87;
                                            }
                                            catch (oov v29) {
                                                throw f2j.a(v29);
                                            }
                                            if (!v23.wyl.vg8.fcv) break block83;
                                        }
                                        catch (oov v30) {
                                            throw f2j.a(v30);
                                        }
                                    }
                                    this.fbt = 1;
                                    v26 = (int)iri.o89.d7c().booleanValue();
                                }
                                catch (oov v31) {
                                    throw f2j.a(v31);
                                }
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var2_2 == 0) break block90;
                                            if (v26 == 0) break block91;
                                        }
                                        catch (oov v32) {
                                            throw f2j.a(v32);
                                        }
                                        v26 = (int)this.hsi;
                                        if (var2_2 == 0) break block90;
                                    }
                                    catch (oov v33) {
                                        throw f2j.a(v33);
                                    }
                                    if (v26 == 0) break block91;
                                }
                                catch (oov v34) {
                                    throw f2j.a(v34);
                                }
                                kgt.ce6.tp_();
                            }
                            catch (oov v35) {
                                throw f2j.a(v35);
                            }
                        }
                        try {
                            v36 = var1_1;
                            if (var2_2 == 0) break block92;
                            cfr_temp_6 = v36.wam - 0.0;
                            v26 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                        }
                        catch (oov v37) {
                            throw f2j.a(v37);
                        }
                    }
                    try {
                        if (v26 < 0) {
                            var1_1.wam *= 0.2;
                        }
                    }
                    catch (oov v38) {
                        throw f2j.a(v38);
                    }
                }
                v23 = this;
            }
            v23.le4 = Math.max(this.le4, 0.1873);
            v36 = var1_1;
        }
        ohv.qjs(v36, this.le4);
    }

    @jev
    public void mb9(q8e q8e2) {
        double d = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
        double d2 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
        this.c9d = Math.sqrt(d * d + d2 * d2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        f = new HashMap(13);
        long l = a ^ 0x279C975B7315L;
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
        String string = "e;\u009a\u00c52\u00e8\u008c\u00d92%Xj5\u0016$! 0:\u00cd\u00e9n\u00f9\"\u009b<MQ\u00e5\u001d\u00c5\u00ad\u00dcS\u00f4\u0006\u009du\u00e2\u00d5\u0087Y\u000e\u000b%\u00c4\u00f3\u009c\u008a";
        int n2 = "e;\u009a\u00c52\u00e8\u008c\u00d92%Xj5\u0016$! 0:\u00cd\u00e9n\u00f9\"\u009b<MQ\u00e5\u001d\u00c5\u00ad\u00dcS\u00f4\u0006\u009du\u00e2\u00d5\u0087Y\u000e\u000b%\u00c4\u00f3\u009c\u008a".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = f2j.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xF47;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("f2j", exception);
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
            f2j.e[n2] = f2j.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f2j.a(n, l);
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
            throw new RuntimeException("f2j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f2j.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

