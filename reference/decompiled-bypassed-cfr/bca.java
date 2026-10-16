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
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C02PacketUseEntity$_y6;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;

public class bca
extends ar7 {
    public static crk tfk;
    private nhs rin;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public bca() {
        long l = a ^ 0x21D03E895CC8L;
        super((String)((Object)bca.b("t", (int)10276, (long)(0x2E2534DB43C4B75AL ^ l))), _aj.twm, false, new j1s[0]);
        this.rin = new nhs();
    }

    @jev
    public void lcq(b4u b4u2) {
        block37: {
            l86 l862;
            block38: {
                boolean bl;
                int n;
                block36: {
                    block34: {
                        block35: {
                            block32: {
                                block33: {
                                    block31: {
                                        c05 c052;
                                        block30: {
                                            n = t9d.b();
                                            try {
                                                try {
                                                    c052 = ek1;
                                                    if (n == 0) break block30;
                                                    if (c052.tij != null) {
                                                    }
                                                    break block31;
                                                }
                                                catch (oov oov2) {
                                                    throw bca.a(oov2);
                                                }
                                                c052 = ek1;
                                            }
                                            catch (oov oov3) {
                                                throw bca.a(oov3);
                                            }
                                        }
                                        try {
                                            try {
                                                if (c052.dzk.sc8 == null) break block31;
                                                bl = kgt.nd5.klu();
                                                if (n == 0) break block32;
                                            }
                                            catch (oov oov4) {
                                                throw bca.a(oov4);
                                            }
                                            if (!bl) break block33;
                                        }
                                        catch (oov oov5) {
                                            throw bca.a(oov5);
                                        }
                                    }
                                    return;
                                }
                                bl = bca.ek1.dzk.sc8 instanceof ha9;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block34;
                                                if (!bl) break block35;
                                            }
                                            catch (oov oov6) {
                                                throw bca.a(oov6);
                                            }
                                            bl = zwr.o1s.d7c();
                                            if (n == 0) break block34;
                                        }
                                        catch (oov oov7) {
                                            throw bca.a(oov7);
                                        }
                                        if (bl) {
                                        }
                                        break block35;
                                    }
                                    catch (oov oov8) {
                                        throw bca.a(oov8);
                                    }
                                    bl = f62.a92((ha9)bca.ek1.dzk.sc8);
                                    if (n == 0) break block34;
                                }
                                catch (oov oov9) {
                                    throw bca.a(oov9);
                                }
                                if (!bl) break block35;
                            }
                            catch (oov oov10) {
                                throw bca.a(oov10);
                            }
                            return;
                        }
                        bl = this.rin.yrv(1000.0f / tfk.d7c().floatValue());
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block36;
                                if (!bl) break block37;
                            }
                            catch (oov oov11) {
                                throw bca.a(oov11);
                            }
                            l862 = bca.ek1.vg8;
                            if (n == 0) break block38;
                        }
                        catch (oov oov12) {
                            throw bca.a(oov12);
                        }
                        bl = l862.kqk();
                    }
                    catch (oov oov13) {
                        throw bca.a(oov13);
                    }
                }
                try {
                    block39: {
                        try {
                            if (!bl) break block39;
                            bca.ek1.vg8.lq7.sxi(new C07PacketPlayerDigging(C07PacketPlayerDigging$pl2.md_, new mew(0, 0, 0), vt2.rf3));
                            bca.ek1.vg8.hgb();
                            bca.ek1.vg8.lq7.sxi(new C02PacketUseEntity(bca.ek1.dzk.sc8, C02PacketUseEntity$_y6.cb5));
                            this.rin.zay();
                            if (n != 0) break block37;
                        }
                        catch (oov oov14) {
                            throw bca.a(oov14);
                        }
                    }
                    bca.ek1.vg8.hgb();
                    l862 = bca.ek1.vg8;
                }
                catch (oov oov15) {
                    throw bca.a(oov15);
                }
            }
            l862.lq7.sxi(new C02PacketUseEntity(bca.ek1.dzk.sc8, C02PacketUseEntity$_y6.cb5));
            this.rin.zay();
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
        a = c.a(-8759222137614476133L, 3400302268899665212L, MethodHandles.lookup().lookupClass()).a(12173683694261L);
        long l = a ^ 0x12AC62ED989BL;
        h = new HashMap(13);
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
        String string = "5\u00ef<\u00ed\u001f\u00e2\u008a\t\u00f4Xo\u0012|4T3\u00a78\u00b7\u00d3\u00a1\u00e2\u00b1d\u000b\u00f5]\u00fba\u0018\u00f3\u00bd :\u00da\u00b2\u00fe?RL:\u00ba#O)\u00df\u000b$\u0016\u0005\u00a1\u00ed\u00faq\u00beXa\u00da=2\u00bab\u00a6\nA\u0010\u00a9\u008e\u00ee\"~\u00a5\u0083\u0088\u0093_;\u0005\u001eW\u00974";
        int n2 = "5\u00ef<\u00ed\u001f\u00e2\u008a\t\u00f4Xo\u0012|4T3\u00a78\u00b7\u00d3\u00a1\u00e2\u00b1d\u000b\u00f5]\u00fba\u0018\u00f3\u00bd :\u00da\u00b2\u00fe?RL:\u00ba#O)\u00df\u000b$\u0016\u0005\u00a1\u00ed\u00faq\u00beXa\u00da=2\u00bab\u00a6\nA\u0010\u00a9\u008e\u00ee\"~\u00a5\u0083\u0088\u0093_;\u0005\u001eW\u00974".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = bca.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                f = stringArray;
                g = new String[3];
                tfk = new crk((String)((Object)bca.b("t", (int)26761, (long)(0x5CFB412EDFBDB3A5L ^ l))), (String)((Object)bca.b("t", (int)31462, (long)(0xC5D5213D19321C8L ^ l))), 10.0f, 1.0f, 20.0f, 1.0f);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x498F;
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
                throw new RuntimeException("bca", exception);
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
            bca.g[n2] = bca.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bca.b(n, l);
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
            throw new RuntimeException("bca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bca.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

