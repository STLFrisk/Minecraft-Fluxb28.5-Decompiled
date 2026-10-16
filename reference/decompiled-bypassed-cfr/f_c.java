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

public class f_c {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public void f9u(opt opt2) {
        int n;
        long l = a ^ 0xC2F5C1435D7L;
        try {
            for (n = 0; n < 16; ++n) {
                opt2.liy(new erg(ox_.lpo, 1, n), new Object[]{new erg(xbr.nnn, 1, 15 - n), new erg(u7m.gfm(ox_.lpo), 1, 0)});
                Object[] objectArray = new Object[7];
                objectArray[0] = f_c.a("q", (int)1200, (long)(0x7DE8C283085A794CL ^ l));
                objectArray[1] = f_c.a("q", (int)5931, (long)(0x35445372B091EAD0L ^ l));
                objectArray[2] = f_c.a("q", (int)30314, (long)(0x106167800EFE8B90L ^ l));
                objectArray[3] = Character.valueOf('#');
                objectArray[4] = new erg(ox_.o45);
                objectArray[5] = Character.valueOf('X');
                objectArray[6] = new erg(xbr.nnn, 1, n);
                opt2.q01(new erg(ox_.f6z, 8, 15 - n), objectArray);
                Object[] objectArray2 = new Object[7];
                objectArray2[0] = f_c.a("q", (int)30314, (long)(0x106167800EFE8B90L ^ l));
                objectArray2[1] = f_c.a("q", (int)6972, (long)(0x474E0B143084E6C5L ^ l));
                objectArray2[2] = f_c.a("q", (int)30314, (long)(0x106167800EFE8B90L ^ l));
                objectArray2[3] = Character.valueOf('#');
                objectArray2[4] = new erg(ox_.fzi);
                objectArray2[5] = Character.valueOf('X');
                objectArray2[6] = new erg(xbr.nnn, 1, n);
                opt2.q01(new erg(ox_.dh_, 8, 15 - n), objectArray2);
                Object[] objectArray3 = new Object[4];
                objectArray3[0] = f_c.a("q", (int)30314, (long)(0x106167800EFE8B90L ^ l));
                objectArray3[1] = f_c.a("q", (int)30314, (long)(0x106167800EFE8B90L ^ l));
                objectArray3[2] = Character.valueOf('#');
                objectArray3[3] = new erg(ox_.dh_, 1, n);
                opt2.q01(new erg(ox_.pse, 16, n), objectArray3);
            }
        }
        catch (oov oov2) {
            throw f_c.a(oov2);
        }
        opt2.liy(new erg(xbr.nnn, 1, qvg.byr.b9d()), new Object[]{new erg(ox_.qmk, 1, u5m$cco.r1p.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.y7l.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.gye.uzp())});
        opt2.liy(new erg(xbr.nnn, 3, qvg.ft3.b9d()), new Object[]{xbr.pl_});
        opt2.liy(new erg(xbr.nnn, 2, qvg.uqr.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.y0w.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.byr.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.w98.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.u1l.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg._p6.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.qn4.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.i_s.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg._p6.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 3, qvg.i_s.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.qn4.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.pyj.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.wms.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.u1l.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.a32.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.is_.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.a32.b9d()), new erg(xbr.nnn, 1, qvg.uqr.b9d())});
        opt2.liy(new erg(xbr.nnn, 3, qvg.is_.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.uqr.b9d())});
        opt2.liy(new erg(xbr.nnn, 4, qvg.is_.b9d()), new Object[]{new erg(xbr.nnn, 1, qvg.o71.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.y7l.b9d()), new erg(xbr.nnn, 1, qvg.ft3.b9d())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.pyj.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.i9o.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.is_.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.poz.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.i_s.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.g5b.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.y7l.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.k5h.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.y0w.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.lam.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.i_s.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.q_1.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.uqr.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.ph9.uzp())});
        opt2.liy(new erg(xbr.nnn, 1, qvg.i_s.b9d()), new Object[]{new erg(ox_.xq2, 1, u5m$cco.eet.uzp())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.byr.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.abu.gp7())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.is_.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.pnm.gp7())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.y7l.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.sp9.gp7())});
        opt2.liy(new erg(xbr.nnn, 2, qvg.uqr.b9d()), new Object[]{new erg(ox_.s4_, 1, ldj$vn8.mal.gp7())});
        try {
            for (n = 0; n < 16; ++n) {
                Object[] objectArray = new Object[3];
                objectArray[0] = f_c.a("q", (int)31096, (long)(0x3CA5D149CED48480L ^ l));
                objectArray[1] = Character.valueOf('#');
                objectArray[2] = new erg(ox_.lpo, 1, n);
                opt2.q01(new erg(ox_.cj9, 3, n), objectArray);
            }
        }
        catch (oov oov3) {
            throw f_c.a(oov3);
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

                f_c.a = c.a(4346318500063247363L, -6535494303580084956L, MethodHandles.lookup().lookupClass()).a(171832858009896L);
                f_c.d = new HashMap<K, V>(13);
                var0 = f_c.a ^ 32076171685419L;
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
                var6_5 = "\u0012\u0094\u00c5=\u008a?\u00a8\u00b3=\u00c1\u00ae\u00e5\u00b8\u00c9-\u0014\u0010\u00ca\u00aaK\u00a9\u001a]\u00cfQ\u00d9\u00dd\u00bb|?\u0080\u00e2\u00df\u0010\u000f\u000b\u00f8\u0019%\u00ba\u00d0\u00ded\u0096Y\u00d7\u00a6D\u009c\u0010";
                var8_6 = "\u0012\u0094\u00c5=\u008a?\u00a8\u00b3=\u00c1\u00ae\u00e5\u00b8\u00c9-\u0014\u0010\u00ca\u00aaK\u00a9\u001a]\u00cfQ\u00d9\u00dd\u00bb|?\u0080\u00e2\u00df\u0010\u000f\u000b\u00f8\u0019%\u00ba\u00d0\u00ded\u0096Y\u00d7\u00a6D\u009c\u0010".length();
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
                    var9_3[var7_4++] = f_c.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c2\u00c4`\u00de\u00ed\u0095\u00efd\u00a3~oW\u00a0\u00a9-\u008a\u0010\u00f3\u00f30N\u001cT\u001duP\u001a_m*\b\u0094\u0089";
                    var8_6 = "\u00c2\u00c4`\u00de\u00ed\u0095\u00efd\u00a3~oW\u00a0\u00a9-\u008a\u0010\u00f3\u00f30N\u001cT\u001duP\u001a_m*\b\u0094\u0089".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = f_c.a(var10_9).intern();
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
        f_c.b = var9_3;
        f_c.c = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xA04;
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
                throw new RuntimeException("f_c", exception);
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
            f_c.c[n2] = f_c.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f_c.a(n, l);
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
            throw new RuntimeException("f_c" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f_c.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

