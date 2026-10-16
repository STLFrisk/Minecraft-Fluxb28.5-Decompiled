/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ku
extends ev3 {
    private final /* synthetic */ ImmutableSet lvs;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public _ku(String string, int n, int n2) {
        long l = a ^ 0x7BBD4EBF5528L;
        super(string, Integer.class);
        if (n < 0) {
            throw new IllegalArgumentException((String)((Object)_ku.b("e", (int)3627, (long)(0x5530D56A668DDB90L ^ l))) + string + (String)((Object)_ku.b("e", (int)4980, (long)(0x1CE4A59A25E3C6CCL ^ l))));
        }
        try {
            if (n2 <= n) {
                throw new IllegalArgumentException((String)((Object)_ku.b("e", (int)4856, (long)(0xAA80D02F39C4741L ^ l))) + string + (String)((Object)_ku.b("e", (int)28031, (long)(0x15CEBACB14DFB8C5L ^ l))) + n + ")");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _ku.a(illegalArgumentException);
        }
        HashSet hashSet = Sets.newHashSet();
        try {
            for (int i = n; i <= n2; ++i) {
                hashSet.add(i);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _ku.a(illegalArgumentException);
        }
        this.lvs = ImmutableSet.copyOf((Collection)hashSet);
    }

    @Override
    public Collection isr() {
        return this.lvs;
    }

    @Override
    public boolean equals(Object object) {
        block16: {
            _ku _ku2;
            block18: {
                block19: {
                    int n;
                    block17: {
                        Object object2;
                        block14: {
                            block15: {
                                n = t9d.c();
                                try {
                                    try {
                                        object2 = this;
                                        if (n != 0) break block14;
                                        if (object2 != object) break block15;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw _ku.a(illegalArgumentException);
                                    }
                                    return true;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw _ku.a(illegalArgumentException);
                                }
                            }
                            object2 = object;
                        }
                        try {
                            try {
                                try {
                                    if (object2 == null) break block16;
                                    _ku2 = this;
                                    if (n != 0) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw _ku.a(illegalArgumentException);
                                }
                                if (_ku2.getClass() != object.getClass()) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw _ku.a(illegalArgumentException);
                            }
                            _ku2 = this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _ku.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block18;
                            if (super.equals(object)) break block19;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _ku.a(illegalArgumentException);
                        }
                        return false;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw _ku.a(illegalArgumentException);
                    }
                }
                _ku2 = (_ku)object;
            }
            _ku _ku3 = _ku2;
            return this.lvs.equals((Object)_ku3.lvs);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.lvs.hashCode();
        return n;
    }

    public static _ku wgl(String string, int n, int n2) {
        return new _ku(string, n, n2);
    }

    public String vpp(Integer n) {
        return n.toString();
    }

    @Override
    public String _lf(Comparable comparable) {
        return this.vpp((Integer)comparable);
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

                _ku.a = c.a(-7843965105894675237L, -5674146622996556179L, MethodHandles.lookup().lookupClass()).a(263251872242118L);
                _ku.h = new HashMap<K, V>(13);
                var0 = _ku.a ^ 113133220954492L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u0007\u00fe\u00c0e\u0004\f\u00f1\u00f58\u00b2\u00f1\u00f5\u0011\u00b6HV3\u00be\u0096f]7E$\u0007i\u0086\u001b|\u00e6\u0086\u008fvs\u00e9\u00a5:7R\u00d0\u0018\u0015\u00c4!|\u00cc\u00bb\u00df\u0019=&\u001e\u00f9\u00b4s\u00ac\u0013z\u0090G\r\u00f8'0\u00cf";
                var8_6 = "\u0007\u00fe\u00c0e\u0004\f\u00f1\u00f58\u00b2\u00f1\u00f5\u0011\u00b6HV3\u00be\u0096f]7E$\u0007i\u0086\u001b|\u00e6\u0086\u008fvs\u00e9\u00a5:7R\u00d0\u0018\u0015\u00c4!|\u00cc\u00bb\u00df\u0019=&\u001e\u00f9\u00b4s\u00ac\u0013z\u0090G\r\u00f8'0\u00cf".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = _ku.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "T\u008fI]5\u00bd\\W\u007f\u00b45,\u00e4\u00c2\u0089\u00a8\u00df\u00c2\u00cb~T\u00cc\u00bf(\u00c8t\u0007\u008d\u009f\u00da\u000eGCk\u008b\\\u007f\u000b\u00fa\u00a5\u0082p\u00ecT\u00cb\u00c5\u00f99 D\u00ed\u00a8Y(a}%$q\u00aemL\u001fD-b\u0016\u0017\t\u00c7\u00ea\u0096\u000f\u00dc\u00b8\u00f3$\u00ea1\u0087\u00be";
                    var8_6 = "T\u008fI]5\u00bd\\W\u007f\u00b45,\u00e4\u00c2\u0089\u00a8\u00df\u00c2\u00cb~T\u00cc\u00bf(\u00c8t\u0007\u008d\u009f\u00da\u000eGCk\u008b\\\u007f\u000b\u00fa\u00a5\u0082p\u00ecT\u00cb\u00c5\u00f99 D\u00ed\u00a8Y(a}%$q\u00aemL\u001fD-b\u0016\u0017\t\u00c7\u00ea\u0096\u000f\u00dc\u00b8\u00f3$\u00ea1\u0087\u00be".length();
                    var5_7 = 48;
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
                    var9_3[var7_4++] = _ku.b(var10_9).intern();
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
        _ku.f = var9_3;
        _ku.g = new String[4];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x299B;
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
                throw new RuntimeException("_ku", exception);
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
            _ku.g[n2] = _ku.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _ku.b(n, l);
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
            throw new RuntimeException("_ku" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_ku.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

