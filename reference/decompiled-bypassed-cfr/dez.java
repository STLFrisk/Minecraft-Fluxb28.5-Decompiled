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
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C0BPacketEntityAction;

public class dez
extends ar7 {
    public static crk r2q;
    private /* synthetic */ double z5e;
    private /* synthetic */ double jsb;
    private /* synthetic */ double xru;
    private /* synthetic */ float ozy;
    private /* synthetic */ float awe;
    private /* synthetic */ hpk k1k;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public dez() {
        long l = a ^ 0x4C50AADAC61DL;
        super((String)((Object)dez.b("g", (int)28877, (long)(0x9570924E70A2165L ^ l))), _aj.sxc, false, new j1s[0]);
    }

    @Override
    public void ron() {
        kh3 kh32;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        kh32 = dez.ek1.tij;
                        if (n == 0) break block4;
                        if (kh32 != null) break block5;
                    }
                    catch (oov oov2) {
                        throw dez.a(oov2);
                    }
                    this.yse(false);
                    return;
                }
                catch (oov oov3) {
                    throw dez.a(oov3);
                }
            }
            dez.ek1.vg8.kvx = true;
            this.z5e = dez.ek1.vg8.o2v;
            this.jsb = dez.ek1.vg8.kfp;
            this.xru = dez.ek1.vg8.vbd;
            this.ozy = dez.ek1.vg8.x5k;
            this.awe = dez.ek1.vg8.y2i;
            this.k1k = new hpk(dez.ek1.tij, dez.ek1.vg8.x6l());
            this.k1k.moc(dez.ek1.vg8, true);
            this.k1k.m6_(dez.ek1.vg8.o2v, dez.ek1.vg8.kfp, dez.ek1.vg8.vbd);
            this.k1k.q6c = dez.ek1.vg8.x5k;
            this.k1k.y2i = dez.ek1.vg8.y2i;
            this.k1k.rh_(dez.ek1.vg8.hzv());
            kh32 = dez.ek1.tij;
        }
        kh32.fih(-1337, this.k1k);
        zwr.qkk.w34().fu7(this.k1k.noc());
        super.ron();
    }

    @Override
    public void ne2() {
        dez.ek1.vg8.kvx = false;
        dez.ek1.vg8.lls.wzx = false;
        dez.ek1.vg8.xe8(this.z5e, this.jsb, this.xru, this.ozy, this.awe);
        dez.ek1.tij.rqa(this.k1k);
        zwr.qkk.w34().vca(this.k1k.noc());
        super.ne2();
    }

    @jev
    public void dun(w1x w1x2) {
        w1x2.o04 = null;
    }

    @jev
    public void k1k(ihr ihr2) {
        block26: {
            ihr ihr3;
            block24: {
                int n = t9d.b();
                try {
                    block25: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    ihr3 = ihr2;
                                                                    if (n == 0) break block24;
                                                                    if (ihr3.bbi() instanceof C03PacketPlayer) break block25;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw dez.a(oov2);
                                                                }
                                                                ihr3 = ihr2;
                                                                if (n == 0) break block24;
                                                            }
                                                            catch (oov oov3) {
                                                                throw dez.a(oov3);
                                                            }
                                                            if (ihr3.bbi() instanceof C0BPacketEntityAction) break block25;
                                                        }
                                                        catch (oov oov4) {
                                                            throw dez.a(oov4);
                                                        }
                                                        ihr3 = ihr2;
                                                        if (n == 0) break block24;
                                                    }
                                                    catch (oov oov5) {
                                                        throw dez.a(oov5);
                                                    }
                                                    if (ihr3.bbi() instanceof C0APacketAnimation) break block25;
                                                }
                                                catch (oov oov6) {
                                                    throw dez.a(oov6);
                                                }
                                                ihr3 = ihr2;
                                                if (n == 0) break block24;
                                            }
                                            catch (oov oov7) {
                                                throw dez.a(oov7);
                                            }
                                            if (ihr3.bbi() instanceof C02PacketUseEntity) break block25;
                                        }
                                        catch (oov oov8) {
                                            throw dez.a(oov8);
                                        }
                                        ihr3 = ihr2;
                                        if (n == 0) break block24;
                                    }
                                    catch (oov oov9) {
                                        throw dez.a(oov9);
                                    }
                                    if (ihr3.bbi() instanceof C09PacketHeldItemChange) break block25;
                                }
                                catch (oov oov10) {
                                    throw dez.a(oov10);
                                }
                                ihr3 = ihr2;
                                if (n == 0) break block24;
                            }
                            catch (oov oov11) {
                                throw dez.a(oov11);
                            }
                            if (!(ihr3.bbi() instanceof C07PacketPlayerDigging)) break block26;
                        }
                        catch (oov oov12) {
                            throw dez.a(oov12);
                        }
                    }
                    ihr3 = ihr2;
                }
                catch (oov oov13) {
                    throw dez.a(oov13);
                }
            }
            ihr3.wxi(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @jev
    public void jh_(_qa _qa2) {
        block14: {
            block13: {
                boolean bl;
                block11: {
                    dez.ek1.vg8.kvx = true;
                    _qa2.c6l = 0.0;
                    _qa2.wam = 0.0;
                    _qa2.faq = 0.0;
                    int n = t9d.b();
                    try {
                        try {
                            block12: {
                                try {
                                    try {
                                        bl = dez.ek1.oxn.e5o.m7n;
                                        if (n == 0) break block11;
                                        if (!bl) break block12;
                                    }
                                    catch (oov oov2) {
                                        throw dez.a(oov2);
                                    }
                                    _qa2.wam = -1.0;
                                    if (n != 0) break block13;
                                }
                                catch (oov oov3) {
                                    throw dez.a(oov3);
                                }
                            }
                            if (n == 0) break block14;
                        }
                        catch (oov oov4) {
                            throw dez.a(oov4);
                        }
                        bl = dez.ek1.oxn.nfb.m7n;
                    }
                    catch (oov oov5) {
                        throw dez.a(oov5);
                    }
                }
                try {
                    if (bl) {
                        _qa2.wam = 1.0;
                    }
                }
                catch (oov oov6) {
                    throw dez.a(oov6);
                }
            }
            ohv.qjs(_qa2, r2q.d7c().floatValue());
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
        a = c.a(2678898250686397800L, -3663238311266618104L, MethodHandles.lookup().lookupClass()).a(139499468536551L);
        long l = a ^ 0x3F1173854B75L;
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
        String string = "\u00ffk$\u00be\u00b8h\u0006\u0013:\u007f\u0007\u00f09}7\u0085\u0010r(8\n>\u0081\u00d8\u0001~\u00ec\u00d6\u00a0\u00f7mI\u00c1\u0010\u0013\u000b^^\u00b7\u00b6X\u00d7\u009d1>\u0004\u00050\u00a7\u0016";
        int n2 = "\u00ffk$\u00be\u00b8h\u0006\u0013:\u007f\u0007\u00f09}7\u0085\u0010r(8\n>\u0081\u00d8\u0001~\u00ec\u00d6\u00a0\u00f7mI\u00c1\u0010\u0013\u000b^^\u00b7\u00b6X\u00d7\u009d1>\u0004\u00050\u00a7\u0016".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dez.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                f = stringArray;
                g = new String[3];
                r2q = new crk((String)((Object)dez.b("g", (int)13112, (long)(0x3366E143A1156FF9L ^ l))), (String)((Object)dez.b("g", (int)13924, (long)(0x716D1C817EF7EAA7L ^ l))), 1.0f, 0.1f, 3.0f, 0.1f);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x72F2;
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
                throw new RuntimeException("dez", exception);
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
            dez.g[n2] = dez.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dez.b(n, l);
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
            throw new RuntimeException("dez" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dez.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

