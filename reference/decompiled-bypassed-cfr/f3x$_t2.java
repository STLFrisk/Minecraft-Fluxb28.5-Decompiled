/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
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

public class f3x$_t2
extends f3x$ssc {
    public final f3x o75;
    private static final long a = c.a(3103637812204104076L, 4286486343038967264L, MethodHandles.lookup().lookupClass()).a(62492916255930L);
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    /*
     * Unable to fully structure code
     */
    public f3x$_t2(f3x var1_1, c05 var2_2) {
        block26: {
            this.o75 = var1_1;
            v0 = t9d.b();
            super(var1_1, var2_2);
            var3_3 = v0;
            this._1h = Lists.newArrayList();
            for (rlk var5_5 : l9p.qlf) {
                block32: {
                    block31: {
                        block28: {
                            block29: {
                                block30: {
                                    block27: {
                                        var6_6 = 0;
                                        var7_7 = u7m._lo(var5_5.u3i());
                                        try {
                                            try {
                                                if (var3_3 == 0) break block26;
                                                v1 = f3x.h5z(var1_1).zgq(var5_5);
                                                if (var3_3 == 0) break block27;
                                            }
                                            catch (oov v2) {
                                                throw f3x$_t2.a(v2);
                                            }
                                            if (v1 > 0) {
                                            }
                                            ** GOTO lbl30
                                        }
                                        catch (oov v3) {
                                            throw f3x$_t2.a(v3);
                                        }
                                        v1 = 1;
                                    }
                                    var6_6 = v1;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var3_3 != 0) break block28;
lbl30:
                                                    // 2 sources

                                                    v4 = l9p.ysy[var7_7];
                                                    if (var3_3 == 0) break block29;
                                                }
                                                catch (oov v5) {
                                                    throw f3x$_t2.a(v5);
                                                }
                                                if (v4 != null) {
                                                }
                                                ** GOTO lbl55
                                            }
                                            catch (oov v6) {
                                                throw f3x$_t2.a(v6);
                                            }
                                            v7 = f3x.h5z(var1_1).zgq(l9p.ysy[var7_7]);
                                            if (var3_3 == 0) break block30;
                                        }
                                        catch (oov v8) {
                                            throw f3x$_t2.a(v8);
                                        }
                                        if (v7 > 0) {
                                        }
                                        ** GOTO lbl55
                                    }
                                    catch (oov v9) {
                                        throw f3x$_t2.a(v9);
                                    }
                                    v7 = 1;
                                }
                                var6_6 = v7;
                                try {
                                    if (var3_3 != 0) break block28;
lbl55:
                                    // 3 sources

                                    v4 = l9p._ee[var7_7];
                                }
                                catch (oov v10) {
                                    throw f3x$_t2.a(v10);
                                }
                            }
                            try {
                                try {
                                    if (v4 == null) break block28;
                                    v11 = f3x.h5z(var1_1).zgq(l9p._ee[var7_7]);
                                    if (var3_3 == 0) break block31;
                                }
                                catch (oov v12) {
                                    throw f3x$_t2.a(v12);
                                }
                                if (v11 <= 0) break block28;
                            }
                            catch (oov v13) {
                                throw f3x$_t2.a(v13);
                            }
                            var6_6 = 1;
                        }
                        v11 = var6_6;
                    }
                    try {
                        try {
                            if (var3_3 == 0 || v11 == 0) break block32;
                        }
                        catch (oov v14) {
                            throw f3x$_t2.a(v14);
                        }
                        v11 = (int)this._1h.add(var5_5);
                    }
                    catch (oov v15) {
                        throw f3x$_t2.a(v15);
                    }
                }
                if (var3_3 != 0) continue;
            }
            this.otn = new f3x$_t2$1(this, var1_1);
        }
    }

    @Override
    public void xwh(int n, int n2, jom jom2) {
        block26: {
            f3x$_t2 f3x$_t2;
            block24: {
                int n3;
                block23: {
                    f3x$_t2 f3x$_t22;
                    block21: {
                        block20: {
                            f3x$_t2 f3x$_t23;
                            block18: {
                                n3 = t9d.b();
                                try {
                                    block19: {
                                        try {
                                            try {
                                                super.xwh(n, n2, jom2);
                                                f3x$_t23 = this;
                                                if (n3 == 0) break block18;
                                                if (f3x$_t23.d4i != 0) break block19;
                                            }
                                            catch (oov oov2) {
                                                throw f3x$_t2.a(oov2);
                                            }
                                            f3x._e5(this.o75, n + 115 - 18 + 1, n2 + 1 + 1, 72, 18);
                                            if (n3 != 0) break block20;
                                        }
                                        catch (oov oov3) {
                                            throw f3x$_t2.a(oov3);
                                        }
                                    }
                                    f3x$_t23 = this;
                                }
                                catch (oov oov4) {
                                    throw f3x$_t2.a(oov4);
                                }
                            }
                            f3x._e5(f3x$_t23.o75, n + 115 - 18, n2 + 1, 72, 18);
                        }
                        try {
                            block22: {
                                try {
                                    try {
                                        f3x$_t22 = this;
                                        if (n3 == 0) break block21;
                                        if (f3x$_t22.d4i != 1) break block22;
                                    }
                                    catch (oov oov5) {
                                        throw f3x$_t2.a(oov5);
                                    }
                                    f3x._e5(this.o75, n + 165 - 18 + 1, n2 + 1 + 1, 18, 18);
                                    if (n3 != 0) break block23;
                                }
                                catch (oov oov6) {
                                    throw f3x$_t2.a(oov6);
                                }
                            }
                            f3x$_t22 = this;
                        }
                        catch (oov oov7) {
                            throw f3x$_t2.a(oov7);
                        }
                    }
                    f3x._e5(f3x$_t22.o75, n + 165 - 18, n2 + 1, 18, 18);
                }
                try {
                    block25: {
                        try {
                            try {
                                f3x$_t2 = this;
                                if (n3 == 0) break block24;
                                if (f3x$_t2.d4i != 2) break block25;
                            }
                            catch (oov oov8) {
                                throw f3x$_t2.a(oov8);
                            }
                            f3x._e5(this.o75, n + 215 - 18 + 1, n2 + 1 + 1, 36, 18);
                            if (n3 != 0) break block26;
                        }
                        catch (oov oov9) {
                            throw f3x$_t2.a(oov9);
                        }
                    }
                    f3x$_t2 = this;
                }
                catch (oov oov10) {
                    throw f3x$_t2.a(oov10);
                }
            }
            f3x._e5(f3x$_t2.o75, n + 215 - 18, n2 + 1, 36, 18);
        }
    }

    @Override
    public void drawSlot(int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl;
        int n7;
        int n8;
        rlk rlk2;
        f3x$_t2 f3x$_t2;
        block10: {
            block11: {
                boolean bl2;
                int n9;
                int n10;
                _ss _ss2;
                f3x$_t2 f3x$_t22;
                int n11;
                rlk rlk3;
                block8: {
                    block9: {
                        boolean bl3;
                        int n12;
                        int n13;
                        _ss _ss3;
                        f3x$_t2 f3x$_t23;
                        int n14;
                        block6: {
                            block7: {
                                rlk3 = this.ak8(n);
                                u7m u7m2 = rlk3.u3i();
                                int n15 = t9d.c();
                                f3x.y8f(this.o75, n2 + 40, n3, u7m2);
                                n14 = u7m._lo(u7m2);
                                n11 = n15;
                                try {
                                    f3x$_t23 = this;
                                    _ss3 = l9p.ysy[n14];
                                    int n12 = n2 + 115;
                                    n12 = n3;
                                    bl3 = n % 2;
                                    if (n11 != 0) break block6;
                                    if (bl3) break block7;
                                }
                                catch (oov oov2) {
                                    throw f3x$_t2.a(oov2);
                                }
                                bl3 = true;
                                break block6;
                            }
                            bl3 = false;
                        }
                        try {
                            f3x$_t23.v4c(_ss3, n13, n12, bl3);
                            f3x$_t22 = this;
                            _ss2 = l9p._ee[n14];
                            int n9 = n2 + 165;
                            n9 = n3;
                            bl2 = n % 2;
                            if (n11 != 0) break block8;
                            if (bl2) break block9;
                        }
                        catch (oov oov3) {
                            throw f3x$_t2.a(oov3);
                        }
                        bl2 = true;
                        break block8;
                    }
                    bl2 = false;
                }
                try {
                    f3x$_t22.v4c(_ss2, n10, n9, bl2);
                    f3x$_t2 = this;
                    rlk2 = rlk3;
                    int n7 = n2 + 215;
                    n7 = n3;
                    bl = n % 2;
                    if (n11 != 0) break block10;
                    if (bl) break block11;
                }
                catch (oov oov4) {
                    throw f3x$_t2.a(oov4);
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        f3x$_t2.v4c(rlk2, n8, n7, bl);
    }

    @Override
    public String g30(int n) {
        CallSite callSite;
        block8: {
            long l;
            block9: {
                int n2;
                int n3;
                block6: {
                    block7: {
                        l = a ^ 0x14B5C1C89FB9L;
                        int n4 = t9d.b();
                        try {
                            try {
                                n3 = n;
                                n2 = 1;
                                if (n4 == 0) break block6;
                                if (n3 != n2) break block7;
                            }
                            catch (oov oov2) {
                                throw f3x$_t2.a(oov2);
                            }
                            callSite = f3x$_t2.b("h", (int)20639, (long)(0x6100743546F197A9L ^ l));
                            break block8;
                        }
                        catch (oov oov3) {
                            throw f3x$_t2.a(oov3);
                        }
                    }
                    n3 = n;
                    n2 = 2;
                }
                try {
                    if (n3 != n2) break block9;
                    callSite = f3x$_t2.b("h", (int)27177, (long)(0x7936ACA590C2D1DL ^ l));
                    break block8;
                }
                catch (oov oov4) {
                    throw f3x$_t2.a(oov4);
                }
            }
            callSite = f3x$_t2.b("h", (int)22952, (long)(0x5994523006FB1E9DL ^ l));
        }
        return callSite;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        h = new HashMap(13);
        long l = a ^ 0x28079CE83917L;
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
        String string = "\b@\u001b\u00f6\u00ba\u00b6^S\u0097n\u009a@\u00a0-\u009cgO\u0004\u00adK\u00b5\u00d8\u000bH\u0018\u0099\u00fa/\u00e9\u0011\b\u008c\r\u00f7\u00cd\u0086\u009f\u009a(\u00df\t\u00d8*U\u00b2\u0010\u000f\nB \u001c\u0018\u000e.\u008f\u00e2\u00a6]\u009c\u00f3\u0019\u00ba!\u00dd\u00b9\u00fe\u00fb\u00f4\u00d2g\u00f2\u0013\u00c3o\u0011\u00cf\u00fa\u00e2A\u001d\u00bb\u0007";
        int n2 = "\b@\u001b\u00f6\u00ba\u00b6^S\u0097n\u009a@\u00a0-\u009cgO\u0004\u00adK\u00b5\u00d8\u000bH\u0018\u0099\u00fa/\u00e9\u0011\b\u008c\r\u00f7\u00cd\u0086\u009f\u009a(\u00df\t\u00d8*U\u00b2\u0010\u000f\nB \u001c\u0018\u000e.\u008f\u00e2\u00a6]\u009c\u00f3\u0019\u00ba!\u00dd\u00b9\u00fe\u00fb\u00f4\u00d2g\u00f2\u0013\u00c3o\u0011\u00cf\u00fa\u00e2A\u001d\u00bb\u0007".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = f3x$_t2.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                f = stringArray;
                g = new String[3];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36D6;
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
                throw new RuntimeException("f3x$_t2", exception);
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
            f3x$_t2.g[n2] = f3x$_t2.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f3x$_t2.b(n, l);
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
            throw new RuntimeException("f3x$_t2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f3x$_t2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

