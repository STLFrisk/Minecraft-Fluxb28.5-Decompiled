/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g92$tt8
extends j0s {
    private final e0x k_n;
    private final ImmutableMap h_x;
    private ImmutableTable dyi;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    private g92$tt8(e0x e0x2, ImmutableMap immutableMap) {
        this.k_n = e0x2;
        this.h_x = immutableMap;
    }

    @Override
    public Collection ku2() {
        return Collections.unmodifiableCollection(this.h_x.keySet());
    }

    @Override
    public Comparable dil(xny xny2) {
        Object object;
        block5: {
            block6: {
                long l = a ^ 0x2BEB33889E32L;
                int n = t9d.c();
                try {
                    try {
                        object = this.h_x;
                        if (n != 0) break block5;
                        if (!object.containsKey((Object)xny2)) {
                        }
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw g92$tt8.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)g92$tt8.a("s", (int)29695, (long)(0xE04DEC80C758146L ^ l))) + xny2 + (String)((Object)g92$tt8.a("s", (int)332, (long)(0x38700CEE6AEF73F3L ^ l))) + this.k_n.w_4());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw g92$tt8.a(illegalArgumentException);
                }
            }
            object = xny2.pn7().cast(this.h_x.get((Object)xny2));
        }
        return (Comparable)object;
    }

    @Override
    public zfz zvi(xny xny2, Comparable comparable) {
        zfz zfz2;
        block19: {
            Object object;
            block17: {
                block18: {
                    Comparable comparable2;
                    block16: {
                        boolean bl;
                        int n;
                        long l;
                        block14: {
                            block15: {
                                l = a ^ 0x31AC98C3F131L;
                                n = t9d.c();
                                try {
                                    try {
                                        bl = this.h_x.containsKey((Object)xny2);
                                        if (n != 0) break block14;
                                        if (!bl) {
                                        }
                                        break block15;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw g92$tt8.a(illegalArgumentException);
                                    }
                                    throw new IllegalArgumentException((String)((Object)g92$tt8.a("s", (int)9356, (long)(0x5DEE9CFB8A75B933L ^ l))) + xny2 + (String)((Object)g92$tt8.a("s", (int)22596, (long)(0x7163BE8EF64B45FFL ^ l))) + this.k_n.w_4());
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw g92$tt8.a(illegalArgumentException);
                                }
                            }
                            try {
                                object = xny2.isr();
                                comparable2 = comparable;
                                if (n != 0) break block16;
                                bl = object.contains(comparable2);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw g92$tt8.a(illegalArgumentException);
                            }
                        }
                        try {
                            if (!bl) {
                                throw new IllegalArgumentException((String)((Object)g92$tt8.a("s", (int)28378, (long)(0x3EFF8565975EF362L ^ l))) + xny2 + (String)((Object)g92$tt8.a("s", (int)25129, (long)(0x4ACE315F624D7F97L ^ l))) + comparable + (String)((Object)g92$tt8.a("s", (int)26115, (long)(0x3FFE20A7D58A7BBAL ^ l))) + e0x.db8.csx(this.k_n) + (String)((Object)g92$tt8.a("s", (int)18395, (long)(0x2F33CB8638115A66L ^ l))));
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw g92$tt8.a(illegalArgumentException);
                        }
                        try {
                            object = this.h_x.get((Object)xny2);
                            if (n != 0) break block17;
                            comparable2 = comparable;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw g92$tt8.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (object != comparable2) break block18;
                        zfz2 = this;
                        break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw g92$tt8.a(illegalArgumentException);
                    }
                }
                object = this.dyi.get((Object)xny2, (Object)comparable);
            }
            zfz2 = (zfz)object;
        }
        return zfz2;
    }

    @Override
    public ImmutableMap q2y() {
        return this.h_x;
    }

    @Override
    public e0x r_y() {
        return this.k_n;
    }

    public boolean equals(Object object) {
        boolean bl;
        try {
            bl = this == object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw g92$tt8.a(illegalArgumentException);
        }
        return bl;
    }

    public int hashCode() {
        return this.h_x.hashCode();
    }

    public void ugw(Map map) {
        block10: {
            int n = t9d.c();
            try {
                if (this.dyi != null) {
                    throw new IllegalStateException();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw g92$tt8.a(illegalArgumentException);
            }
            HashBasedTable hashBasedTable = HashBasedTable.create();
            for (Object object : this.h_x.keySet()) {
                block7: while (true) {
                    xny xny2 = (xny)object;
                    if (n != 0) break block10;
                    for (Comparable comparable : xny2.isr()) {
                        block11: {
                            object = comparable;
                            if (n != 0) continue block7;
                            try {
                                try {
                                    if (n != 0 || object == this.h_x.get((Object)xny2)) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw g92$tt8.a(illegalArgumentException);
                                }
                                hashBasedTable.put((Object)xny2, (Object)comparable, map.get(this.l9k(xny2, comparable)));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw g92$tt8.a(illegalArgumentException);
                            }
                        }
                        if (n == 0) continue;
                    }
                    break;
                }
                if (n == 0) continue;
            }
            this.dyi = ImmutableTable.copyOf((Table)hashBasedTable);
        }
    }

    private Map l9k(xny xny2, Comparable comparable) {
        HashMap hashMap = Maps.newHashMap((Map)this.h_x);
        hashMap.put(xny2, comparable);
        return hashMap;
    }

    public g92$tt8(e0x e0x2, ImmutableMap immutableMap, g92$1 g92$1) {
        this(e0x2, immutableMap);
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

                g92$tt8.a = c.a(1366878326504131623L, -8816546604470379817L, MethodHandles.lookup().lookupClass()).a(164841399566332L);
                g92$tt8.d = new HashMap<K, V>(13);
                var0 = g92$tt8.a ^ 46545909576470L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "s\u00cdMu\u00e3\u0004\u00d7\u00cb\u0088<\u001fC\u0010y\u00a9:\u00c5bB\u00ff\u008a\u00f3\u00dd\u00a6\u0011\u0004\u0090b\u009d:w\u00b0M\u0088\u00cc\u00ffz`\u001f\u00ae+\u00f0G\u007fn\u00d3\u000f\u00d6(\u000b\u00ed\u009f\u00d6\u00b4\u00c7\u00967D\u00ae\u0018'\u0006\u009b\u0005.<g\u0082mC\u00cb\u00f2B\u0082K\u00ad\u000e\u000e\u00bb3\u0098\u0088\u0099w\u00cfL\u00d2\u00ba\u0013 \u00d6cU\u0081\u00c9k\u00ae\u0080?\u0082a\u00161Ms\u0089\u00a7i\u00a3!\u00db\u00c0\u00d9\u0086]\u00d4\u00945\u00ee\u00ae]\u00d8(C\u008f\u0018\u0098\u0086\u0081\u00c2\u00c1\r\u0004\t\u00e4\u00e9\u009d\u001e\u0087\u00bf\u000e\u0006\u00c3&\u0088>\u00e9\u00adP\u00aa\u00b5M\u00b5)\u00d4RD\u00fb\u00e8\n\u009a\u00b7\u00d1(R\u001d\u008eq\u00e7s\u0013\u00bf\u00b3\u00f4\u00d7\u007f\u001b\u00b9\u00af\u00e8\u009c^\u00a2\u0003E\u00dd;\u001e\u00c3j\u0011e~\u0085\ra\u009f^\u00bc\u00aa\u009eQ\u00e4\u001f\u0010W\u001b/\u00c4\u00e3\u00c2\u00a0d\u0082L4\u00ddw\u0085Wk";
                var8_6 = "s\u00cdMu\u00e3\u0004\u00d7\u00cb\u0088<\u001fC\u0010y\u00a9:\u00c5bB\u00ff\u008a\u00f3\u00dd\u00a6\u0011\u0004\u0090b\u009d:w\u00b0M\u0088\u00cc\u00ffz`\u001f\u00ae+\u00f0G\u007fn\u00d3\u000f\u00d6(\u000b\u00ed\u009f\u00d6\u00b4\u00c7\u00967D\u00ae\u0018'\u0006\u009b\u0005.<g\u0082mC\u00cb\u00f2B\u0082K\u00ad\u000e\u000e\u00bb3\u0098\u0088\u0099w\u00cfL\u00d2\u00ba\u0013 \u00d6cU\u0081\u00c9k\u00ae\u0080?\u0082a\u00161Ms\u0089\u00a7i\u00a3!\u00db\u00c0\u00d9\u0086]\u00d4\u00945\u00ee\u00ae]\u00d8(C\u008f\u0018\u0098\u0086\u0081\u00c2\u00c1\r\u0004\t\u00e4\u00e9\u009d\u001e\u0087\u00bf\u000e\u0006\u00c3&\u0088>\u00e9\u00adP\u00aa\u00b5M\u00b5)\u00d4RD\u00fb\u00e8\n\u009a\u00b7\u00d1(R\u001d\u008eq\u00e7s\u0013\u00bf\u00b3\u00f4\u00d7\u007f\u001b\u00b9\u00af\u00e8\u009c^\u00a2\u0003E\u00dd;\u001e\u00c3j\u0011e~\u0085\ra\u009f^\u00bc\u00aa\u009eQ\u00e4\u001f\u0010W\u001b/\u00c4\u00e3\u00c2\u00a0d\u0082L4\u00ddw\u0085Wk".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = g92$tt8.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "8r\u00d3/\u00c0A*Y\u00c9\u00e1{\u001fl\u00c4`\u00a6S\u0010\u00ba\u0081\u0015\u00e9\u00b0\u00eb\u00a1BY\u0097a\u0085\u0017|}c\u00abI\u0004\u00ccu\u001a\u00c6\u00f8\u00f0\u0010\u00e1\u00f7\u00f4\u00b6Y\u00b5\u009e\u00f9\u000b\u0001WN0?\u00ee\u00cb\u0013\u0013\u001d\u007f\u00ba\u00de2\u00bd\u00bce1\u009ej4SYXA\u00ff\u0013\u00d3\u0099\u00ceB2\u0093\u00bb\u0088\u00ec\u00d9\u00e8\r\u00ec;{\u0083\u00ea\u0097\u00cb\u0002\u00f8\u0015d`\u00a6";
                    var8_6 = "8r\u00d3/\u00c0A*Y\u00c9\u00e1{\u001fl\u00c4`\u00a6S\u0010\u00ba\u0081\u0015\u00e9\u00b0\u00eb\u00a1BY\u0097a\u0085\u0017|}c\u00abI\u0004\u00ccu\u001a\u00c6\u00f8\u00f0\u0010\u00e1\u00f7\u00f4\u00b6Y\u00b5\u009e\u00f9\u000b\u0001WN0?\u00ee\u00cb\u0013\u0013\u001d\u007f\u00ba\u00de2\u00bd\u00bce1\u009ej4SYXA\u00ff\u0013\u00d3\u0099\u00ceB2\u0093\u00bb\u0088\u00ec\u00d9\u00e8\r\u00ec;{\u0083\u00ea\u0097\u00cb\u0002\u00f8\u0015d`\u00a6".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = g92$tt8.a(var10_9).intern();
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
        g92$tt8.b = var9_3;
        g92$tt8.c = new String[8];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44D8;
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
                throw new RuntimeException("g92$tt8", exception);
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
            g92$tt8.c[n2] = g92$tt8.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g92$tt8.a(n, l);
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
            throw new RuntimeException("g92$tt8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g92$tt8.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

