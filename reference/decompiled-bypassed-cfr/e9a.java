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
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;

public class e9a
extends j1s {
    private static final long a = c.a(7089578104858239720L, -8881781200459353197L, MethodHandles.lookup().lookupClass()).a(280208454964715L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public e9a() {
        long l = a ^ 0x4CEAA50B285DL;
        super((String)((Object)e9a.a("c", (int)12381, (long)(0x403FF96A7ED1EB3CL ^ l))), (String)((Object)e9a.a("c", (int)23467, (long)(0x7008B91CDDA580CBL ^ l))));
    }

    @jev
    public void riy(q8e q8e2) {
        block15: {
            double d;
            double d2;
            double d3;
            C03PacketPlayer$C04PacketPlayerPosition c03PacketPlayer$C04PacketPlayerPosition;
            C03PacketPlayer$C04PacketPlayerPosition c03PacketPlayer$C04PacketPlayerPosition2;
            p_k p_k2;
            l86 l862;
            double d4;
            double d5;
            block17: {
                boolean bl;
                block16: {
                    int n;
                    block14: {
                        double d6 = 0.3;
                        double d7 = Math.cos(Math.toRadians(this.wyl.vg8.x5k + 90.0f));
                        n = t9d.b();
                        double d8 = Math.sin(Math.toRadians(this.wyl.vg8.x5k + 90.0f));
                        d5 = (double)this.wyl.vg8.g9g._mw * d6 * d7 + (double)this.wyl.vg8.g9g.lrp * d6 * d8;
                        d4 = (double)this.wyl.vg8.g9g._mw * d6 * d8 - (double)this.wyl.vg8.g9g.lrp * d6 * d7;
                        try {
                            try {
                                bl = this.wyl.vg8.cbi;
                                if (n == 0) break block14;
                                if (!bl) break block15;
                            }
                            catch (oov oov2) {
                                throw e9a.a(oov2);
                            }
                            bl = this.wyl.vg8.z2m();
                        }
                        catch (oov oov3) {
                            throw e9a.a(oov3);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block16;
                                if (bl) break block15;
                            }
                            catch (oov oov4) {
                                throw e9a.a(oov4);
                            }
                            l862 = this.wyl.vg8;
                            if (n == 0) break block17;
                        }
                        catch (oov oov5) {
                            throw e9a.a(oov5);
                        }
                        bl = l862.hzv();
                    }
                    catch (oov oov6) {
                        throw e9a.a(oov6);
                    }
                }
                try {
                    if (!bl) break block15;
                    this.wyl.vg8.lq7.sxi(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v + d5, this.wyl.vg8.kfp, this.wyl.vg8.vbd + d4, false));
                    l862 = this.wyl.vg8;
                }
                catch (oov oov7) {
                    throw e9a.a(oov7);
                }
            }
            double d9 = l862.o2v;
            double d10 = this.wyl.vg8.kfp;
            try {
                C03PacketPlayer$C04PacketPlayerPosition c03PacketPlayer$C04PacketPlayerPosition3;
                p_k2 = this.wyl.vg8.lq7;
                c03PacketPlayer$C04PacketPlayerPosition2 = c03PacketPlayer$C04PacketPlayerPosition3;
                c03PacketPlayer$C04PacketPlayerPosition = c03PacketPlayer$C04PacketPlayerPosition3;
                d3 = d9;
                d2 = d10;
                d = bk4.qq4() ? 9000.0 : 0.09;
            }
            catch (oov oov8) {
                throw e9a.a(oov8);
            }
            c03PacketPlayer$C04PacketPlayerPosition2(d3, d2 - d, this.wyl.vg8.vbd, false);
            p_k2.sxi(c03PacketPlayer$C04PacketPlayerPosition);
            this.wyl.vg8.m6_(this.wyl.vg8.o2v + d5, this.wyl.vg8.kfp, this.wyl.vg8.vbd + d4);
        }
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
        long l = a ^ 0x6E78139F6A73L;
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
        String string = "\u000bi\u0080\u0088)n\u00df_K\r\u0015$mG\u00fe\n\u0010\u0007\f*.i[n\u00f9S\u00a9\u00f3I\u0086J\u007f$";
        int n2 = "\u000bi\u0080\u0088)n\u00df_K\r\u0015$mG\u00fe\n\u0010\u0007\f*.i[n\u00f9S\u00a9\u00f3I\u0086J\u007f$".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e9a.b(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x78DF;
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
                throw new RuntimeException("e9a", exception);
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
            e9a.e[n2] = e9a.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e9a.a(n, l);
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
            throw new RuntimeException("e9a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e9a.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

