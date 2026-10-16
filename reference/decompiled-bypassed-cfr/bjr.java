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

public class bjr
extends ar7 {
    public static final float lxd = 0.75f;
    private /* synthetic */ Map dj1;
    private static final long a = c.a(-1391938691506185622L, -6225945705602076854L, MethodHandles.lookup().lookupClass()).a(37018935255201L);
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public bjr() {
        long l = a ^ 0x3DEF4951D079L;
        super((String)((Object)bjr.b("m", (int)8935, (long)(0xFB5A965F8158803L ^ l))), _aj.sxc, false, new j1s[0]);
        if (this.dj1 == null) {
            this.dj1 = ((orn)bjr.ek1.yrr).xlg();
        }
        try {
            if (!this.dj1.containsKey(bjr.b("m", (int)12003, (long)(0x3EA766E7286C8405L ^ l)))) {
                this.dj1.put(bjr.b("m", (int)5654, (long)(0x7301620C91933CF1L ^ l)), new s2w());
            }
        }
        catch (oov oov2) {
            throw bjr.a(oov2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void ron() {
        v3i v3i2;
        long l;
        block4: {
            block5: {
                l = a ^ 0x733935BE15D2L;
                super.ron();
                int n = t9d.b();
                try {
                    try {
                        v3i2 = bjr.ek1.x0p;
                        if (n == 0) break block4;
                        if (v3i2.oqr() == null) break block5;
                    }
                    catch (oov oov2) {
                        throw bjr.a(oov2);
                    }
                    bjr.ek1.x0p.oqr().fzs();
                }
                catch (oov oov3) {
                    throw bjr.a(oov3);
                }
            }
            v3i2 = bjr.ek1.x0p;
        }
        v3i2.uyd(new gdz((String)((Object)bjr.b("m", (int)5654, (long)(0x73012CDAED7CF95AL ^ l))), (String)((Object)bjr.b("m", (int)5654, (long)(0x73012CDAED7CF95AL ^ l)))));
    }

    @Override
    public void ne2() {
        super.ne2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @jev
    public void dxf(ccn ccn2) {
        v3i v3i2;
        long l;
        block16: {
            c05 c052;
            int n;
            block14: {
                block13: {
                    l = a ^ 0xFE002186CBEL;
                    n = t9d.b();
                    try {
                        try {
                            c052 = ek1;
                            if (n == 0) break block13;
                            if (c052.vg8 == null) return;
                        }
                        catch (oov oov2) {
                            throw bjr.a(oov2);
                        }
                        c052 = ek1;
                    }
                    catch (oov oov3) {
                        throw bjr.a(oov3);
                    }
                }
                try {
                    try {
                        if (n == 0) break block14;
                        if (c052.tij == null) {
                            return;
                        }
                    }
                    catch (oov oov4) {
                        throw bjr.a(oov4);
                    }
                }
                catch (oov oov5) {
                    throw bjr.a(oov5);
                }
                c052 = ek1;
            }
            try {
                try {
                    v3i2 = c052.x0p;
                    if (n == 0) break block16;
                    if (v3i2.oqr() != null) return;
                }
                catch (oov oov6) {
                    throw bjr.a(oov6);
                }
                v3i2 = bjr.ek1.x0p;
            }
            catch (oov oov7) {
                throw bjr.a(oov7);
            }
        }
        v3i2.uyd(new gdz((String)((Object)bjr.b("m", (int)5654, (long)(0x73015003DADA8036L ^ l))), (String)((Object)bjr.b("m", (int)5654, (long)(0x73015003DADA8036L ^ l)))));
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
        long l = a ^ 0x30E8D6410B4BL;
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
        String string = "u\u00f48`F\u0019Y\u00d3\u00faUN\u001c\u0087\u0007D\u008cxY\u00cc\u0000\u00fa\u00a9kw \u00bd\u000f\u00df\u00b5\u00efl\b\u0086\u00cbv\u00c8\u00ac\u0002\u00c3\u0085W\u0018\u0016\u00ba~\u00a7i\u0005H\u00bc\u001fC&\u00d4Q<\u00ab \u00bd\u00e5\u00d7t\u00d4\u00e1:\u00a33\u00d33\u00ab\u0084\u00fe\u0016\u0097j6\r\u00c6\u0085\u00c5\u00e8\u0017\u00a8zi\u000fS\u00c2G\u00de";
        int n2 = "u\u00f48`F\u0019Y\u00d3\u00faUN\u001c\u0087\u0007D\u008cxY\u00cc\u0000\u00fa\u00a9kw \u00bd\u000f\u00df\u00b5\u00efl\b\u0086\u00cbv\u00c8\u00ac\u0002\u00c3\u0085W\u0018\u0016\u00ba~\u00a7i\u0005H\u00bc\u001fC&\u00d4Q<\u00ab \u00bd\u00e5\u00d7t\u00d4\u00e1:\u00a33\u00d33\u00ab\u0084\u00fe\u0016\u0097j6\r\u00c6\u0085\u00c5\u00e8\u0017\u00a8zi\u000fS\u00c2G\u00de".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bjr.b(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x14C8;
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
                throw new RuntimeException("bjr", exception);
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
            bjr.g[n2] = bjr.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bjr.b(n, l);
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
            throw new RuntimeException("bjr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bjr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

