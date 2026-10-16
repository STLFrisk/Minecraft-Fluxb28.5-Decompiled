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

public class frs
extends ar7 {
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public frs() {
        long l = a ^ 0x5D2964488B63L;
        super((String)((Object)frs.b("p", (int)17709, (long)(0x2AEE89DD46F93E21L ^ l))), _aj.y49, false, new j1s[0]);
    }

    @jev
    public void ab2(ccn ccn2) {
        long l = a ^ 0x5CB59904CB55L;
        int n = t9d.b();
        for (i2h i2h2 : frs.ek1.tij.guf) {
            block69: {
                block87: {
                    ftj ftj2;
                    double d;
                    ha9 ha92;
                    block86: {
                        int n2;
                        block83: {
                            block85: {
                                block84: {
                                    block80: {
                                        block82: {
                                            block81: {
                                                block78: {
                                                    block79: {
                                                        double d2;
                                                        int n3;
                                                        block75: {
                                                            block77: {
                                                                block76: {
                                                                    int n4;
                                                                    block72: {
                                                                        block74: {
                                                                            block73: {
                                                                                i2h i2h3;
                                                                                block70: {
                                                                                    block68: {
                                                                                        try {
                                                                                            try {
                                                                                                i2h3 = i2h2;
                                                                                                if (n == 0) break block68;
                                                                                                if (!(i2h3 instanceof ha9)) break block69;
                                                                                            }
                                                                                            catch (oov oov2) {
                                                                                                throw frs.a(oov2);
                                                                                            }
                                                                                            i2h3 = i2h2;
                                                                                        }
                                                                                        catch (oov oov3) {
                                                                                            throw frs.a(oov3);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (n == 0) break block70;
                                                                                            if (i2h3 == frs.ek1.vg8) {
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                        catch (oov oov4) {
                                                                                            throw frs.a(oov4);
                                                                                        }
                                                                                    }
                                                                                    catch (oov oov5) {
                                                                                        throw frs.a(oov5);
                                                                                    }
                                                                                    i2h3 = i2h2;
                                                                                }
                                                                                ha92 = (ha9)i2h3;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            n4 = p_c.tuy(ha92, 0.01);
                                                                                            if (n == 0) break block72;
                                                                                            if (n4 != 0) break block73;
                                                                                        }
                                                                                        catch (oov oov6) {
                                                                                            throw frs.a(oov6);
                                                                                        }
                                                                                        double d3 = ha92.gce() - 0.1;
                                                                                        n4 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                                                                                        if (n == 0) break block72;
                                                                                    }
                                                                                    catch (oov oov7) {
                                                                                        throw frs.a(oov7);
                                                                                    }
                                                                                    if (n4 >= 0) break block74;
                                                                                }
                                                                                catch (oov oov8) {
                                                                                    throw frs.a(oov8);
                                                                                }
                                                                            }
                                                                            n4 = 1;
                                                                            break block72;
                                                                        }
                                                                        n4 = 0;
                                                                    }
                                                                    n3 = n4;
                                                                    double d4 = ha92.kfp - (double)((int)ha92.kfp);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                double d5 = Math.abs(d4 - 0.40625) - 5.0E-4;
                                                                                                d2 = d5 == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1);
                                                                                                if (n == 0) break block75;
                                                                                                if (d2 < 0) break block76;
                                                                                            }
                                                                                            catch (oov oov9) {
                                                                                                throw frs.a(oov9);
                                                                                            }
                                                                                            double d6 = Math.abs(d4 - 0.75) - 5.0E-4;
                                                                                            d2 = d6 == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                                                                            if (n == 0) break block75;
                                                                                        }
                                                                                        catch (oov oov10) {
                                                                                            throw frs.a(oov10);
                                                                                        }
                                                                                        if (d2 < 0) break block76;
                                                                                    }
                                                                                    catch (oov oov11) {
                                                                                        throw frs.a(oov11);
                                                                                    }
                                                                                    double d7 = Math.abs(d4 - 0.3125) - 5.0E-4;
                                                                                    d2 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                                                                                    if (n == 0) break block75;
                                                                                }
                                                                                catch (oov oov12) {
                                                                                    throw frs.a(oov12);
                                                                                }
                                                                                if (d2 < 0) break block76;
                                                                            }
                                                                            catch (oov oov13) {
                                                                                throw frs.a(oov13);
                                                                            }
                                                                            double d8 = Math.abs(d4 - 0.65625) - 5.0E-4;
                                                                            d2 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                                                            if (n == 0) break block75;
                                                                        }
                                                                        catch (oov oov14) {
                                                                            throw frs.a(oov14);
                                                                        }
                                                                        if (d2 >= 0) break block77;
                                                                    }
                                                                    catch (oov oov15) {
                                                                        throw frs.a(oov15);
                                                                    }
                                                                }
                                                                d2 = 1.0;
                                                                break block75;
                                                            }
                                                            d2 = 0.0;
                                                        }
                                                        double d9 = d2;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                d = d9;
                                                                                if (n == 0) break block78;
                                                                                if (d == false) break block79;
                                                                            }
                                                                            catch (oov oov16) {
                                                                                throw frs.a(oov16);
                                                                            }
                                                                            d = n3;
                                                                            if (n == 0) break block78;
                                                                        }
                                                                        catch (oov oov17) {
                                                                            throw frs.a(oov17);
                                                                        }
                                                                        if (d != false) break block79;
                                                                    }
                                                                    catch (oov oov18) {
                                                                        throw frs.a(oov18);
                                                                    }
                                                                    double d10 = ha92.gce() - ha92.tde() * 3.0;
                                                                    d = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                                                    if (n == 0) break block78;
                                                                }
                                                                catch (oov oov19) {
                                                                    throw frs.a(oov19);
                                                                }
                                                                if (d <= 0) break block79;
                                                            }
                                                            catch (oov oov20) {
                                                                throw frs.a(oov20);
                                                            }
                                                            ++ha92.zy5.r_e;
                                                            ncl.zpu(ha92.noc() + (String)((Object)frs.b("p", (int)18961, (long)(0x506F0BB04C38F12EL ^ l))) + ha92.zy5.r_e);
                                                        }
                                                        catch (oov oov21) {
                                                            throw frs.a(oov21);
                                                        }
                                                    }
                                                    d = ha92.zy5.r_e;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                n2 = 3;
                                                                if (n == 0) break block80;
                                                                if (d < n2) break block81;
                                                            }
                                                            catch (oov oov22) {
                                                                throw frs.a(oov22);
                                                            }
                                                            d = (double)ha92.zy5.r04;
                                                            if (n == 0) break block82;
                                                        }
                                                        catch (oov oov23) {
                                                            throw frs.a(oov23);
                                                        }
                                                        if (d == false) {
                                                        }
                                                        break block81;
                                                    }
                                                    catch (oov oov24) {
                                                        throw frs.a(oov24);
                                                    }
                                                    zet.gn0((String)((Object)frs.b("p", (int)32294, (long)(0x57CEC4346946451AL ^ l))), ha92.noc() + (String)((Object)frs.b("p", (int)17043, (long)(0x271B8E91FED679ADL ^ l))), jgv$vro.ak0);
                                                    ha92.zy5.r04 = true;
                                                }
                                                catch (oov oov25) {
                                                    throw frs.a(oov25);
                                                }
                                            }
                                            d = ha92.zy5.ubl;
                                        }
                                        n2 = 5;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n == 0) break block83;
                                                    if (d < n2) break block84;
                                                }
                                                catch (oov oov26) {
                                                    throw frs.a(oov26);
                                                }
                                                d = (double)ha92.zy5.ijd;
                                                if (n == 0) break block85;
                                            }
                                            catch (oov oov27) {
                                                throw frs.a(oov27);
                                            }
                                            if (d == false) {
                                            }
                                            break block84;
                                        }
                                        catch (oov oov28) {
                                            throw frs.a(oov28);
                                        }
                                        zet.gn0((String)((Object)frs.b("p", (int)7308, (long)(0x2D824BF6093AA7B5L ^ l))), ha92.noc() + (String)((Object)frs.b("p", (int)23341, (long)(0x25194B31BA61E016L ^ l))), jgv$vro.ak0);
                                        ha92.zy5.ijd = true;
                                    }
                                    catch (oov oov29) {
                                        throw frs.a(oov29);
                                    }
                                }
                                d = ha92.zy5.n4o;
                            }
                            try {
                                if (n == 0) break block86;
                                n2 = 5;
                            }
                            catch (oov oov30) {
                                throw frs.a(oov30);
                            }
                        }
                        try {
                            try {
                                if (d < n2) break block69;
                                ftj2 = ha92.zy5;
                                if (n == 0) break block87;
                            }
                            catch (oov oov31) {
                                throw frs.a(oov31);
                            }
                            d = (double)ftj2.lj8;
                        }
                        catch (oov oov32) {
                            throw frs.a(oov32);
                        }
                    }
                    try {
                        if (d != false) break block69;
                        zet.gn0((String)((Object)frs.b("p", (int)7308, (long)(0x2D824BF6093AA7B5L ^ l))), ha92.noc() + (String)((Object)frs.b("p", (int)7568, (long)(0x5A89F87C2ABE26A8L ^ l))), jgv$vro.ak0);
                        ftj2 = ha92.zy5;
                    }
                    catch (oov oov33) {
                        throw frs.a(oov33);
                    }
                }
                ftj2.lj8 = true;
            }
            if (n != 0) continue;
        }
    }

    public static boolean b0y(ha9 ha92) {
        boolean bl;
        block10: {
            block12: {
                block11: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        bl = ha92.zy5.r04;
                                        if (n != 0) break block10;
                                        if (bl) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw frs.a(oov2);
                                    }
                                    bl = ha92.zy5.ijd;
                                    if (n != 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw frs.a(oov3);
                                }
                                if (bl) break block11;
                            }
                            catch (oov oov4) {
                                throw frs.a(oov4);
                            }
                            bl = ha92.zy5.lj8;
                            if (n != 0) break block10;
                        }
                        catch (oov oov5) {
                            throw frs.a(oov5);
                        }
                        if (!bl) break block12;
                    }
                    catch (oov oov6) {
                        throw frs.a(oov6);
                    }
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        return bl;
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

                frs.a = c.a(7424600996706199349L, -7640329512968549128L, MethodHandles.lookup().lookupClass()).a(112803737339769L);
                frs.h = new HashMap<K, V>(13);
                var0 = frs.a ^ 61273869857265L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "A\u0086\u009d+\u00d7=\u00b8K\u0005)\u00a0\u00da\u0013\u00e5\u0013\u0087D\u00b3\u00c0R\u00dc\u0004\u00b7N9`\u00c35\u00e77\u0001s\u0018\u00e6\u00deV\u0080\u00ba$]&\u00d1\u0099\u0095\u00b1 6OF`\u00ec#jcR\u00d4\u0085 ?\u00b6\u0003?%\u0002\u00e9\u0099\u00bd\u00aa\u00e6\u00d2}Iay/\u00aa\u00c3\u00ed\u0087h\u00b6i\u001a\u00b3\u00af_\u0000\u00d0J>\u0018\u00cf\":3\u00b0\u0083v\u0004J\u00ed\u0000\u0006\u0095\u0086-!\u001dH\u00f8\u008e\u00b3\u00a1\u00a1\u00ba\u0010n\u0092~\u0094\u00a2\u00b1\u0002\u00ce\u00e3z\u0003\u00a5L\bw\u0097";
                var8_6 = "A\u0086\u009d+\u00d7=\u00b8K\u0005)\u00a0\u00da\u0013\u00e5\u0013\u0087D\u00b3\u00c0R\u00dc\u0004\u00b7N9`\u00c35\u00e77\u0001s\u0018\u00e6\u00deV\u0080\u00ba$]&\u00d1\u0099\u0095\u00b1 6OF`\u00ec#jcR\u00d4\u0085 ?\u00b6\u0003?%\u0002\u00e9\u0099\u00bd\u00aa\u00e6\u00d2}Iay/\u00aa\u00c3\u00ed\u0087h\u00b6i\u001a\u00b3\u00af_\u0000\u00d0J>\u0018\u00cf\":3\u00b0\u0083v\u0004J\u00ed\u0000\u0006\u0095\u0086-!\u001dH\u00f8\u008e\u00b3\u00a1\u00a1\u00ba\u0010n\u0092~\u0094\u00a2\u00b1\u0002\u00ce\u00e3z\u0003\u00a5L\bw\u0097".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = frs.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "c9\u00e4\u00ca\"\u00dd2:\u0082f\u00be2\u00e2h\u00a6\u0000p\u00b0|G\u0002\u00b3ku\u0080\u00fc=\u008bsc\u00ec\n 'mY\fI\u00c4\u00af\u00d8\u0098\u00e0\u00a5\u0018\u00a6L3T\u007fX0b\u00a6\u00a6+B<\u0017\u0085(s\u0016\u00b9\u00f7";
                    var8_6 = "c9\u00e4\u00ca\"\u00dd2:\u0082f\u00be2\u00e2h\u00a6\u0000p\u00b0|G\u0002\u00b3ku\u0080\u00fc=\u008bsc\u00ec\n 'mY\fI\u00c4\u00af\u00d8\u0098\u00e0\u00a5\u0018\u00a6L3T\u007fX0b\u00a6\u00a6+B<\u0017\u0085(s\u0016\u00b9\u00f7".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = frs.b(var10_9).intern();
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
        frs.f = var9_3;
        frs.g = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xECC;
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
                throw new RuntimeException("frs", exception);
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
            frs.g[n2] = frs.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = frs.b(n, l);
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
            throw new RuntimeException("frs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(frs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

