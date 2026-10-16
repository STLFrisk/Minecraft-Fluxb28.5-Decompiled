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

public class egi
extends j1s {
    private /* synthetic */ double tn6;
    private /* synthetic */ int b3a;
    private /* synthetic */ double vke;
    private final /* synthetic */ double c4c = 2.1;
    private static final long a = c.a(-5977738835412158294L, -3295065748666919234L, MethodHandles.lookup().lookupClass()).a(240226874871898L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public egi() {
        long l = a ^ 0x5BA3AEE3ED94L;
        super((String)((Object)egi.a("v", (int)7577, (long)(0x4A62F67CB196E6C5L ^ l))), (String)((Object)egi.a("v", (int)18468, (long)(0x52CD298135FFB379L ^ l))));
        this.c4c = 2.1;
    }

    @Override
    public void w4v() {
        super.w4v();
        this.wyl.gze.qeu = 1.0f;
        this.tn6 = 0.0;
        this.b3a = 2;
        this.vke = 0.0;
    }

    @Override
    public void i__() {
        super.i__();
        this.wyl.gze.qeu = 1.0f;
        this.vke = ohv.reg();
    }

    @jev
    public void wwq(q8e q8e2) {
        l86 l862;
        block10: {
            block11: {
                block8: {
                    int n = t9d.b();
                    try {
                        c05 c052;
                        block9: {
                            try {
                                try {
                                    try {
                                        c052 = this.wyl;
                                        if (n == 0) break block8;
                                        if (c052.vg8.mwv()) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw egi.a(oov2);
                                    }
                                    l862 = this.wyl.vg8;
                                    if (n == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw egi.a(oov3);
                                }
                                if (!l862.b2u()) break block11;
                            }
                            catch (oov oov4) {
                                throw egi.a(oov4);
                            }
                        }
                        c052 = this.wyl;
                    }
                    catch (oov oov5) {
                        throw egi.a(oov5);
                    }
                }
                c052.gze.qeu = 1.0f;
                this.tn6 = 0.0;
                return;
            }
            l862 = this.wyl.vg8;
        }
        double d = l862.o2v - this.wyl.vg8.bc1;
        double d2 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
        this.tn6 = Math.sqrt(d * d + d2 * d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @jev
    public void th5(_qa var1_1) {
        block87: {
            block80: {
                block76: {
                    block83: {
                        block84: {
                            block85: {
                                block86: {
                                    block81: {
                                        block77: {
                                            block79: {
                                                block78: {
                                                    block74: {
                                                        block72: {
                                                            block73: {
                                                                block70: {
                                                                    block71: {
                                                                        block68: {
                                                                            block69: {
                                                                                block66: {
                                                                                    var2_2 = t9d.b();
                                                                                    try {
                                                                                        block67: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v0 = this.wyl;
                                                                                                                if (var2_2 == 0) break block66;
                                                                                                                if (v0.vg8.mwv()) break block67;
                                                                                                            }
                                                                                                            catch (oov v1) {
                                                                                                                throw egi.a(v1);
                                                                                                            }
                                                                                                            v0 = this.wyl;
                                                                                                            if (var2_2 == 0) break block66;
                                                                                                        }
                                                                                                        catch (oov v2) {
                                                                                                            throw egi.a(v2);
                                                                                                        }
                                                                                                        if (v0.vg8.b2u()) break block67;
                                                                                                    }
                                                                                                    catch (oov v3) {
                                                                                                        throw egi.a(v3);
                                                                                                    }
                                                                                                    v4 = this.wyl.vg8.lls.wzx;
                                                                                                    if (var2_2 == 0) break block68;
                                                                                                }
                                                                                                catch (oov v5) {
                                                                                                    throw egi.a(v5);
                                                                                                }
                                                                                                if (v4 == 0) break block69;
                                                                                            }
                                                                                            catch (oov v6) {
                                                                                                throw egi.a(v6);
                                                                                            }
                                                                                        }
                                                                                        v0 = this.wyl;
                                                                                    }
                                                                                    catch (oov v7) {
                                                                                        throw egi.a(v7);
                                                                                    }
                                                                                }
                                                                                v0.gze.qeu = 1.0f;
                                                                                return;
                                                                            }
                                                                            v4 = this.wyl.vg8.lfk;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var2_2 == 0) break block70;
                                                                                        if (v4 == 0) break block71;
                                                                                    }
                                                                                    catch (oov v8) {
                                                                                        throw egi.a(v8);
                                                                                    }
                                                                                    v4 = this.wyl.vg8.fcv;
                                                                                    if (var2_2 == 0) break block70;
                                                                                }
                                                                                catch (oov v9) {
                                                                                    throw egi.a(v9);
                                                                                }
                                                                                if (v4 == 0) break block71;
                                                                            }
                                                                            catch (oov v10) {
                                                                                throw egi.a(v10);
                                                                            }
                                                                            this.vke = q0r.ibc();
                                                                            this.b3a = 2;
                                                                            this.wyl.gze.qeu = 1.0f;
                                                                        }
                                                                        catch (oov v11) {
                                                                            throw egi.a(v11);
                                                                        }
                                                                    }
                                                                    v4 = (cfr_temp_0 = rak.b5b(this.wyl.vg8.kfp - (double)((int)this.wyl.vg8.kfp), 3) - rak.b5b(0.138, 3)) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var2_2 == 0) break block72;
                                                                        if (v4 != 0) break block73;
                                                                    }
                                                                    catch (oov v12) {
                                                                        throw egi.a(v12);
                                                                    }
                                                                    this.wyl.vg8.mop -= 1.0;
                                                                    var1_1.ziq(var1_1.op7() - 0.0931);
                                                                    this.wyl.vg8.kfp -= 0.0931;
                                                                }
                                                                catch (oov v13) {
                                                                    throw egi.a(v13);
                                                                }
                                                            }
                                                            v4 = this.b3a;
                                                        }
                                                        try {
                                                            try {
                                                                block75: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v14 = 2;
                                                                                        if (var2_2 == 0) break block74;
                                                                                        if (v4 != v14) break block75;
                                                                                    }
                                                                                    catch (oov v15) {
                                                                                        throw egi.a(v15);
                                                                                    }
                                                                                    cfr_temp_1 = this.wyl.vg8.ooc - 0.0f;
                                                                                    v16 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                                    if (var2_2 == 0) break block76;
                                                                                }
                                                                                catch (oov v17) {
                                                                                    throw egi.a(v17);
                                                                                }
                                                                                if (v16 == false) {
                                                                                }
                                                                                ** GOTO lbl202
                                                                            }
                                                                            catch (oov v18) {
                                                                                throw egi.a(v18);
                                                                            }
                                                                            cfr_temp_2 = this.wyl.vg8.z66 - 0.0f;
                                                                            v16 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                            if (var2_2 == 0) break block76;
                                                                        }
                                                                        catch (oov v19) {
                                                                            throw egi.a(v19);
                                                                        }
                                                                        if (v16 == false) {
                                                                        }
                                                                        ** GOTO lbl202
                                                                    }
                                                                    catch (oov v20) {
                                                                        throw egi.a(v20);
                                                                    }
                                                                }
                                                                v4 = this.b3a;
                                                                if (var2_2 == 0) break block77;
                                                            }
                                                            catch (oov v21) {
                                                                throw egi.a(v21);
                                                            }
                                                            v14 = 3;
                                                        }
                                                        catch (oov v22) {
                                                            throw egi.a(v22);
                                                        }
                                                    }
                                                    if (v4 != v14) ** GOTO lbl153
                                                    var3_3 = 0.66 * (this.tn6 - ohv.reg());
                                                    try {
                                                        try {
                                                            this.vke = this.tn6 - var3_3;
                                                            v23 = this;
                                                            if (var2_2 == 0) break block78;
                                                            if (!(v23.vke < 0.3)) break block79;
                                                        }
                                                        catch (oov v24) {
                                                            throw egi.a(v24);
                                                        }
                                                        v23 = this;
                                                    }
                                                    catch (oov v25) {
                                                        throw egi.a(v25);
                                                    }
                                                }
                                                v23.vke = 0.3;
                                            }
                                            try {
                                                try {
                                                    if (var2_2 != 0) break block80;
lbl153:
                                                    // 2 sources

                                                    v26 = this;
                                                    if (var2_2 == 0) break block81;
                                                }
                                                catch (oov v27) {
                                                    throw egi.a(v27);
                                                }
                                                v4 = v26.wyl.tij.bb4(this.wyl.vg8, this.wyl.vg8.aaw().sy_(0.0, this.wyl.vg8.mop, 0.0)).size();
                                            }
                                            catch (oov v28) {
                                                throw egi.a(v28);
                                            }
                                        }
                                        try {
                                            block82: {
                                                try {
                                                    try {
                                                        if (v4 > 0) break block82;
                                                        v29 = this;
                                                        if (var2_2 == 0) break block83;
                                                    }
                                                    catch (oov v30) {
                                                        throw egi.a(v30);
                                                    }
                                                    if (!v29.wyl.vg8.lfk) break block84;
                                                }
                                                catch (oov v31) {
                                                    throw egi.a(v31);
                                                }
                                            }
                                            v26 = this;
                                        }
                                        catch (oov v32) {
                                            throw egi.a(v32);
                                        }
                                    }
                                    try {
                                        v33 = q0r.f2f();
                                        if (var2_2 == 0) break block85;
                                        if (!v33) break block86;
                                    }
                                    catch (oov v34) {
                                        throw egi.a(v34);
                                    }
                                    v33 = true;
                                    break block85;
                                }
                                v33 = false;
                            }
                            v26.b3a = (int)v33;
                        }
                        v29 = this;
                    }
                    try {
                        try {
                            v29.vke = this.tn6 - this.tn6 / 159.0;
                            if (var2_2 != 0) break block80;
lbl202:
                            // 3 sources

                            v35 = this;
                            if (var2_2 == 0) break block87;
                        }
                        catch (oov v36) {
                            throw egi.a(v36);
                        }
                        v16 = (float)v35.wyl.vg8.lfk;
                    }
                    catch (oov v37) {
                        throw egi.a(v37);
                    }
                }
                try {
                    try {
                        try {
                            if (v16 == false) break block80;
                            v35 = this;
                            if (var2_2 == 0) break block87;
                        }
                        catch (oov v38) {
                            throw egi.a(v38);
                        }
                        if (!v35.wyl.vg8.fcv) break block80;
                    }
                    catch (oov v39) {
                        throw egi.a(v39);
                    }
                    this.wyl.vg8.mop = 0.415;
                    var1_1.ziq(0.415);
                    this.vke *= 1.9;
                    this.wyl.gze.qeu = 1.08f;
                }
                catch (oov v40) {
                    throw egi.a(v40);
                }
            }
            this.vke = Math.max(this.vke, ohv.reg());
            ohv.qjs(var1_1, this.vke);
            v35 = this;
        }
        ++v35.b3a;
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
        long l = a ^ 0x102A9629D82FL;
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
        String string = "\u00dc\u009b\u00f0\u00cb\u00e2\u0082}\"U\u00f1\u001dy\u00a9\u009d\u000be\u0010\u009c\u007f[m\u00ea\t\u00e1.#\u0014S\u00bfv\u00e6\u00e1\u009c";
        int n2 = "\u00dc\u009b\u00f0\u00cb\u00e2\u0082}\"U\u00f1\u001dy\u00a9\u009d\u000be\u0010\u009c\u007f[m\u00ea\t\u00e1.#\u0014S\u00bfv\u00e6\u00e1\u009c".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = egi.b(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7360;
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
                throw new RuntimeException("egi", exception);
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
            egi.e[n2] = egi.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = egi.a(n, l);
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
            throw new RuntimeException("egi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(egi.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

