/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class _ie {
    private /* synthetic */ he6 q2z;
    public Map qc7 = Maps.newHashMap();
    private /* synthetic */ List lkc;
    private /* synthetic */ Map bgt;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public _ie(he6 he62) {
        this.lkc = Lists.newArrayList();
        this.bgt = Maps.newHashMap();
        this.q2z = he62;
        this.yei();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public wob ym5(Class var1_1, String var2_2) {
        block22: {
            block23: {
                block20: {
                    block19: {
                        block18: {
                            var3_3 = _ie.a ^ 8265374132731L;
                            var5_4 = t9d.b();
                            var6_5 = (wob)this.qc7.get(var2_2);
                            try {
                                v0 = var6_5;
                                if (var5_4 == 0) break block18;
                                if (v0 == null) break block19;
                            }
                            catch (Exception v1) {
                                throw _ie.a(v1);
                            }
                            v0 = var6_5;
                        }
                        return v0;
                    }
                    try {
                        v2 = this.q2z;
                        if (var5_4 != 0) {
                            if (v2 == null) break block20;
                        }
                        ** GOTO lbl25
                    }
                    catch (Exception v3) {
                        throw _ie.a(v3);
                    }
                    try {
                        block21: {
                            v2 = this.q2z;
lbl25:
                            // 2 sources

                            var7_6 = v2.tmg(var2_2);
                            try {
                                v4 /* !! */  = var7_6;
                                if (var5_4 == 0) break block21;
                                if (v4 /* !! */  == null) break block20;
                            }
                            catch (Exception v5) {
                                throw _ie.a(v5);
                            }
                            v4 /* !! */  = var7_6;
                        }
                        try {
                            if (var5_4 != 0) {
                                if (!v4 /* !! */ .exists()) break block20;
                            }
                            ** GOTO lbl47
                        }
                        catch (Exception v6) {
                            throw _ie.a(v6);
                        }
                        try {
                            v7 = new Class[1];
                            v7[0] = String.class;
                            v4 /* !! */  = var1_1.getConstructor(v7).newInstance(new Object[]{var2_2});
lbl47:
                            // 2 sources

                            var6_5 = (wob)v4 /* !! */ ;
                        }
                        catch (Exception var8_8) {
                            throw new RuntimeException((String)_ie.a("x", (int)4044, (long)(680423745936342831L ^ var3_3)) + var1_1.toString(), var8_8);
                        }
                        var8_9 = new FileInputStream(var7_6);
                        var9_10 = g62.xe6(var8_9);
                        var8_9.close();
                        var6_5.oo1(var9_10.b__((String)_ie.a("x", (int)8437, (long)(6389841526480703509L ^ var3_3))));
                    }
                    catch (Exception var7_7) {
                        var7_7.printStackTrace();
                    }
                }
                try {
                    try {
                        v8 = var6_5;
                        if (var5_4 == 0) break block22;
                        if (v8 == null) break block23;
                    }
                    catch (Exception v9) {
                        throw _ie.a(v9);
                    }
                    this.qc7.put(var2_2, var6_5);
                    this.lkc.add(var6_5);
                }
                catch (Exception v10) {
                    throw _ie.a(v10);
                }
            }
            v8 = var6_5;
        }
        return v8;
    }

    public void vex(String string, wob wob2) {
        block4: {
            boolean bl;
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.qc7.containsKey(string);
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _ie.a(runtimeException);
                    }
                    this.lkc.remove(this.qc7.remove(string));
                }
                catch (RuntimeException runtimeException) {
                    throw _ie.a(runtimeException);
                }
            }
            this.qc7.put(string, wob2);
            bl = this.lkc.add(wob2);
        }
    }

    public void _0a() {
        int n = t9d.c();
        int n2 = 0;
        while (n2 < this.lkc.size()) {
            block5: {
                block6: {
                    wob wob2 = (wob)this.lkc.get(n2);
                    try {
                        try {
                            if (n != 0) break block5;
                            if (!wob2.jnb()) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _ie.a(runtimeException);
                        }
                        this.fp5(wob2);
                        wob2.w27(false);
                    }
                    catch (RuntimeException runtimeException) {
                        throw _ie.a(runtimeException);
                    }
                }
                ++n2;
            }
            if (n == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void fp5(wob var1_1) {
        block6: {
            var2_2 = _ie.a ^ 98299817283235L;
            var4_3 = t9d.c();
            try {
                v0 = this.q2z;
                if (var4_3 == 0) {
                    if (v0 == null) break block6;
                }
                ** GOTO lbl13
            }
            catch (Exception v1) {
                throw _ie.a(v1);
            }
            try {
                v0 = this.q2z;
lbl13:
                // 2 sources

                if ((var5_4 = v0.tmg(var1_1.tg4)) != null) {
                    var6_6 = new bdo();
                    var1_1._j9(var6_6);
                    var7_7 = new bdo();
                    var7_7.rzm((String)_ie.a("x", (int)12568, (long)(1298880065696736929L ^ var2_2)), var6_6);
                    var8_8 = new FileOutputStream(var5_4);
                    g62.bhd(var7_7, var8_8);
                    var8_8.close();
                }
            }
            catch (Exception var5_5) {
                var5_5.printStackTrace();
            }
        }
    }

    /*
     * Loose catch block
     */
    private void yei() {
        block14: {
            long l = a ^ 0xE06F942D8DBL;
            int n = t9d.b();
            try {
                File file;
                File file2;
                block13: {
                    this.bgt.clear();
                    he6 he62 = this.q2z;
                    if (n != 0) {
                        if (he62 == null) {
                            return;
                        }
                        he62 = this.q2z;
                    }
                    file2 = he62.tmg((String)((Object)_ie.a("x", (int)18305, (long)(0x482EB23FD0074645L ^ l))));
                    try {
                        file = file2;
                        if (n == 0) break block13;
                        if (file == null) break block14;
                    }
                    catch (Exception exception) {
                        throw _ie.a(exception);
                    }
                    file = file2;
                }
                if (!file.exists()) break block14;
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                bdo bdo2 = g62.za6(dataInputStream);
                dataInputStream.close();
                for (String string : bdo2.bo9()) {
                    block16: {
                        gdw gdw2;
                        block15: {
                            gdw gdw3;
                            block17: {
                                gdw3 = bdo2.e2o(string);
                                if (n == 0) break block14;
                                gdw2 = gdw3;
                                if (n == 0) break block15;
                                break block17;
                                catch (Exception exception) {
                                    throw _ie.a(exception);
                                }
                            }
                            try {
                                block18: {
                                    if (!(gdw2 instanceof wmr)) break block16;
                                    break block18;
                                    catch (Exception exception) {
                                        throw _ie.a(exception);
                                    }
                                }
                                gdw2 = gdw3;
                            }
                            catch (Exception exception) {
                                throw _ie.a(exception);
                            }
                        }
                        wmr wmr2 = (wmr)gdw2;
                        short s = wmr2.sgm();
                        this.bgt.put(string, s);
                    }
                    if (n != 0) continue;
                    break;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public int hv3(String var1_1) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        var2_2 = _ie.a ^ 63934349508794L;
                        var4_3 = t9d.b();
                        var5_4 = (Short)this.bgt.get(var1_1);
                        try {
                            v0 = var5_4;
                            if (var4_3 == 0) break block15;
                            if (v0 == null) {
                            }
                            ** GOTO lbl15
                        }
                        catch (Exception v1) {
                            throw _ie.a(v1);
                        }
                        var5_4 = (short)0;
                        try {
                            if (var4_3 != 0) break block16;
lbl15:
                            // 2 sources

                            v0 = (short)(var5_4 + 1);
                        }
                        catch (Exception v2) {
                            throw _ie.a(v2);
                        }
                    }
                    var5_4 = v0;
                }
                this.bgt.put(var1_1, var5_4);
                v3 = this.q2z;
                if (var4_3 == 0) ** GOTO lbl40
                try {
                    block19: {
                        if (v3 != null) break block17;
                        break block19;
                        catch (Exception v4) {
                            throw _ie.a(v4);
                        }
                    }
                    return var5_4.shortValue();
                }
                catch (Exception v5) {
                    throw _ie.a(v5);
                }
            }
            try {
                v3 = this.q2z;
lbl40:
                // 2 sources

                var6_5 = v3.tmg((String)_ie.a("x", (int)27372, (long)(3877969797829014351L ^ var2_2)));
                if (var6_5 == null) break block18;
                var7_7 = new bdo();
                for (String var9_9 : this.bgt.keySet()) {
                    var10_10 = (Short)this.bgt.get(var9_9);
                    try {
                        var7_7.ge7(var9_9, var10_10);
                        if (var4_3 != 0) {
                            if (var4_3 != 0) continue;
                            break;
                        }
                        break block18;
                    }
                    catch (Exception v6) {
                        throw _ie.a(v6);
                    }
                }
                var8_8 = new DataOutputStream(new FileOutputStream(var6_5));
                g62.ehq(var7_7, var8_8);
                var8_8.close();
            }
            catch (Exception var6_6) {
                var6_6.printStackTrace();
            }
        }
        return var5_4.shortValue();
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

                _ie.a = c.a(902167403148458164L, -3487569556193864439L, MethodHandles.lookup().lookupClass()).a(124388100635799L);
                _ie.d = new HashMap<K, V>(13);
                var0 = _ie.a ^ 1381713693353L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u0011<\u00ed\u0005I\u00e8\u0083w\\\u0099{3\u00b0>\u00ab\u00a4\u0010\u00c2\u0011\u0083\u00f6\u0087\u0018vu\u00e3\u0012#K\u0096\u00aa\u0000\u00f7 c\n\u007f\u00b8\u00bf\u000b\u00d6$\u00e9\u00c5\u00d0\u00aco\u00b6\u00db\u00f6\u00c5\u00f5>\u008e9T\u00ed\u00a2\u00f8d\u0017\u00e2\u00a8\u009fx\u00d7";
                var8_6 = "\u0011<\u00ed\u0005I\u00e8\u0083w\\\u0099{3\u00b0>\u00ab\u00a4\u0010\u00c2\u0011\u0083\u00f6\u0087\u0018vu\u00e3\u0012#K\u0096\u00aa\u0000\u00f7 c\n\u007f\u00b8\u00bf\u000b\u00d6$\u00e9\u00c5\u00d0\u00aco\u00b6\u00db\u00f6\u00c5\u00f5>\u008e9T\u00ed\u00a2\u00f8d\u0017\u00e2\u00a8\u009fx\u00d7".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = _ie.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c6\u00c1\u00df\u009f\u00f8\tmV+\u00b42\u00df\u00b6$\u0084> a\u008d\u009d\u008e\u00e4\t4\u00e4\u008bn*\u0095\u00f0q\u009f\u00d9s|\u00ce\u0002\u00ef\u00f9\u00e6\u0018/\u008a\u0099\u00db\u00df\u001f\u00ac\u00b2\u008b:\u00ac\u0082m\u00f5\u00fe{\u0099\u009f\u00d0\u00dc\"KDp";
                    var8_6 = "\u00c6\u00c1\u00df\u009f\u00f8\tmV+\u00b42\u00df\u00b6$\u0084> a\u008d\u009d\u008e\u00e4\t4\u00e4\u008bn*\u0095\u00f0q\u009f\u00d9s|\u00ce\u0002\u00ef\u00f9\u00e6\u0018/\u008a\u0099\u00db\u00df\u001f\u00ac\u00b2\u008b:\u00ac\u0082m\u00f5\u00fe{\u0099\u009f\u00d0\u00dc\"KDp".length();
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
                    var9_3[var7_4++] = _ie.a(var10_9).intern();
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
        _ie.b = var9_3;
        _ie.c = new String[5];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5327;
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
                throw new RuntimeException("_ie", exception);
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
            _ie.c[n2] = _ie.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _ie.a(n, l);
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
            throw new RuntimeException("_ie" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_ie.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

