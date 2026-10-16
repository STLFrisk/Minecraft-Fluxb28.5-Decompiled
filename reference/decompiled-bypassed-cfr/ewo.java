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
import net.minecraft.network.play.server.S02PacketChat;

public class ewo
extends j1s {
    private int qxq;
    private static final long a = c.a(7564401688318625076L, 4764161629604835484L, MethodHandles.lookup().lookupClass()).a(81963348875418L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public ewo() {
        long l = a ^ 0x38E0BBACABCCL;
        super((String)((Object)ewo.a("h", (int)4804, (long)(0xC4FE96EB7CD548L ^ l))), (String)((Object)ewo.a("h", (int)14711, (long)(0x5D62906434B77EFAL ^ l))));
    }

    @jev
    public void __v(ccn ccn2) {
        block20: {
            ewo ewo2;
            block19: {
                int n;
                block18: {
                    l86 l862;
                    block15: {
                        block17: {
                            block16: {
                                n = t9d.b();
                                try {
                                    try {
                                        try {
                                            try {
                                                l862 = this.wyl.vg8;
                                                if (n == 0) break block15;
                                                if (l862 == null) break block16;
                                            }
                                            catch (oov oov2) {
                                                throw ewo.a(oov2);
                                            }
                                            ewo2 = this;
                                            if (n == 0) break block17;
                                        }
                                        catch (oov oov3) {
                                            throw ewo.a(oov3);
                                        }
                                        if (ewo2.qxq != 1) break block16;
                                    }
                                    catch (oov oov4) {
                                        throw ewo.a(oov4);
                                    }
                                    this.wyl.vg8.lq7._m3().k7f(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v, this.wyl.vg8.kfp - 2.0, this.wyl.vg8.vbd, false));
                                    this.wyl.vg8.lq7._m3().k7f(new C03PacketPlayer$C04PacketPlayerPosition(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, true));
                                    this.qxq = 0;
                                }
                                catch (oov oov5) {
                                    throw ewo.a(oov5);
                                }
                            }
                            ewo2 = this;
                        }
                        try {
                            if (n == 0) break block18;
                            l862 = ewo2.wyl.vg8;
                        }
                        catch (oov oov6) {
                            throw ewo.a(oov6);
                        }
                    }
                    if (l862 == null) break block20;
                    ewo2 = this;
                }
                try {
                    try {
                        if (n == 0) break block19;
                        if (ewo2.qxq != 1488) break block20;
                    }
                    catch (oov oov7) {
                        throw ewo.a(oov7);
                    }
                    ewo2 = this;
                }
                catch (oov oov8) {
                    throw ewo.a(oov8);
                }
            }
            double d = -Math.sin(Math.toRadians(ewo2.wyl.vg8.x5k));
            double d2 = Math.cos(Math.toRadians(this.wyl.vg8.x5k));
            double d3 = (double)this.wyl.vg8.g9g._mw * d + (double)this.wyl.vg8.g9g.lrp * d2;
            double d4 = (double)this.wyl.vg8.g9g._mw * d2 - (double)this.wyl.vg8.g9g.lrp * d;
            this.wyl.vg8.lq7._m3().k7f(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v + d3, this.wyl.vg8.kfp, this.wyl.vg8.vbd + d4, false));
            this.wyl.vg8.lq7._m3().k7f(new C03PacketPlayer$C04PacketPlayerPosition(Double.NEGATIVE_INFINITY, this.wyl.vg8.kfp, Double.NEGATIVE_INFINITY, true));
            this.qxq = 0;
        }
    }

    public static boolean ibt() {
        int n;
        block20: {
            l86 l862 = q0r.hhm.vg8;
            kh3 kh32 = q0r.hhm.tij;
            nh4 nh42 = l862.aaw();
            int n2 = t9d.c();
            int n3 = fe6.jqf(nh42.rlc);
            block16: while (true) {
                int n4 = n3;
                block17: while (n4 < fe6.jqf(nh42.t_2) + 1) {
                    n = fe6.jqf(nh42.bx_);
                    if (n2 != 0) break block20;
                    int n5 = n;
                    while (n5 < fe6.jqf(nh42.i2c) + 1) {
                        block21: {
                            n4 = fe6.jqf(nh42.t8n);
                            if (n2 != 0) continue block17;
                            int n6 = n4;
                            while (n6 < fe6.jqf(nh42.oqj) + 1) {
                                block22: {
                                    block23: {
                                        boolean bl;
                                        block26: {
                                            nh4 nh43;
                                            block25: {
                                                e0x e0x2;
                                                block24: {
                                                    e0x e0x3 = kh32.getBlockState(new mew(n3, n5, n6)).r_y();
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n2 != 0) break block21;
                                                                        if (n2 != 0) break block22;
                                                                    }
                                                                    catch (oov oov2) {
                                                                        throw ewo.a(oov2);
                                                                    }
                                                                    if (e0x3 == null) break block23;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw ewo.a(oov3);
                                                                }
                                                                e0x2 = e0x3;
                                                                if (n2 != 0) break block24;
                                                            }
                                                            catch (oov oov4) {
                                                                throw ewo.a(oov4);
                                                            }
                                                            if (e0x2 instanceof n47) break block23;
                                                        }
                                                        catch (oov oov5) {
                                                            throw ewo.a(oov5);
                                                        }
                                                        e0x2 = e0x3;
                                                    }
                                                    catch (oov oov6) {
                                                        throw ewo.a(oov6);
                                                    }
                                                }
                                                nh43 = e0x2.m__(kh32, new mew(n3, n5, n6), kh32.getBlockState(new mew(n3, n5, n6)));
                                                try {
                                                    try {
                                                        if (n2 != 0) break block25;
                                                        if (nh43 == null) break block23;
                                                    }
                                                    catch (oov oov7) {
                                                        throw ewo.a(oov7);
                                                    }
                                                    nh43 = l862.aaw();
                                                }
                                                catch (oov oov8) {
                                                    throw ewo.a(oov8);
                                                }
                                            }
                                            try {
                                                nh4 nh44;
                                                bl = nh43.epq(nh44);
                                                if (n2 != 0) break block26;
                                                if (!bl) break block23;
                                            }
                                            catch (oov oov9) {
                                                throw ewo.a(oov9);
                                            }
                                            bl = true;
                                        }
                                        return bl;
                                    }
                                    ++n6;
                                }
                                if (n2 == 0) continue;
                            }
                            ++n5;
                        }
                        if (n2 == 0) continue;
                    }
                    ++n3;
                    if (n2 == 0) continue block16;
                }
                break;
            }
            n = 0;
        }
        return n != 0;
    }

    @jev
    public void z8o(w1x w1x2) {
        try {
            if (ewo.ibt()) {
                w1x2.wfu(null);
            }
        }
        catch (oov oov2) {
            throw ewo.a(oov2);
        }
    }

    public void s42(c7q c7q2) {
        c7q2.wxi(true);
    }

    @jev
    public void odj(fz2 fz22) {
        block13: {
            double d;
            double d2;
            int n;
            block14: {
                int n2;
                block12: {
                    double d3 = 0.3;
                    double d4 = -Math.sin(Math.toRadians(this.wyl.vg8.x5k));
                    double d5 = Math.cos(Math.toRadians(this.wyl.vg8.x5k));
                    n = t9d.b();
                    d2 = (double)this.wyl.vg8.g9g._mw * 0.3 * d4 + (double)this.wyl.vg8.g9g.lrp * 0.3 * d5;
                    d = (double)this.wyl.vg8.g9g._mw * 0.3 * d5 - (double)this.wyl.vg8.g9g.lrp * 0.3 * d4;
                    try {
                        try {
                            n2 = this.wyl.vg8.cbi;
                            if (n == 0) break block12;
                            if (n2 == 0) break block13;
                        }
                        catch (oov oov2) {
                            throw ewo.a(oov2);
                        }
                        n2 = this.wyl.vg8.z2m();
                    }
                    catch (oov oov3) {
                        throw ewo.a(oov3);
                    }
                }
                try {
                    try {
                        if (n == 0) break block14;
                        if (n2 != 0) break block13;
                    }
                    catch (oov oov4) {
                        throw ewo.a(oov4);
                    }
                    this.wyl.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v + d2, this.wyl.vg8.kfp + 0.001, this.wyl.vg8.vbd + d, false));
                    n2 = 1;
                }
                catch (oov oov5) {
                    throw ewo.a(oov5);
                }
            }
            for (int i = v1406532; i < 10; ++i) {
                try {
                    this.wyl.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v, this.wyl.vg8.kfp - 0.22, this.wyl.vg8.vbd, false));
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block13;
                }
                catch (oov oov6) {
                    throw ewo.a(oov6);
                }
            }
            this.wyl.vg8.m6_(this.wyl.vg8.o2v + d2, this.wyl.vg8.kfp, this.wyl.vg8.vbd + d);
        }
    }

    @jev
    public void c33(wbh wbh2) {
        block8: {
            mz2 mz22;
            long l;
            block7: {
                l = a ^ 0x281F90B258A2L;
                int n = t9d.c();
                try {
                    try {
                        mz22 = wbh2.nlg();
                        if (n != 0) break block7;
                        if (!(mz22 instanceof S02PacketChat)) break block8;
                    }
                    catch (oov oov2) {
                        throw ewo.a(oov2);
                    }
                    mz22 = wbh2.nlg();
                }
                catch (oov oov3) {
                    throw ewo.a(oov3);
                }
            }
            S02PacketChat s02PacketChat = (S02PacketChat)mz22;
            try {
                if (s02PacketChat.m4c().rnh().contains((CharSequence)((Object)ewo.a("h", (int)25393, (long)(0x17B0863B213B57D0L ^ l))))) {
                    wbh2.wxi(true);
                }
            }
            catch (oov oov4) {
                throw ewo.a(oov4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void qjz(_qa var1_1) {
        block16: {
            block20: {
                block18: {
                    block19: {
                        block17: {
                            block15: {
                                var2_2 = t9d.b();
                                try {
                                    try {
                                        v0 = ewo.ibt();
                                        if (var2_2 == 0) break block15;
                                        if (!v0) break block16;
                                    }
                                    catch (oov v1) {
                                        throw ewo.a(v1);
                                    }
                                    v0 = this.wyl.oxn.nfb.t9w();
                                }
                                catch (oov v2) {
                                    throw ewo.a(v2);
                                }
                            }
                            try {
                                if (var2_2 == 0) break block17;
                                if (v0) {
                                }
                                ** GOTO lbl29
                            }
                            catch (oov v3) {
                                throw ewo.a(v3);
                            }
                            var3_3 = this.wyl.vg8;
                            var4_4 = var3_3.mop + 0.09000000357627869;
                            try {
                                try {
                                    var3_3.mop = var4_4;
                                    var1_1.wam = var4_4;
                                    if (var2_2 != 0) break block18;
lbl29:
                                    // 2 sources

                                    v4 = this.wyl;
                                    if (var2_2 == 0) break block19;
                                }
                                catch (oov v5) {
                                    throw ewo.a(v5);
                                }
                                v0 = v4.oxn.e5o.t9w();
                            }
                            catch (oov v6) {
                                throw ewo.a(v6);
                            }
                        }
                        if (!v0) ** GOTO lbl46
                        var3_3 = this.wyl.vg8;
                        var4_4 = var3_3.mop - 0.0;
                        try {
                            var3_3.mop = var4_4;
                            var1_1.wam = var4_4;
                            if (var2_2 != 0) break block18;
lbl46:
                            // 2 sources

                            v4 = this.wyl;
                        }
                        catch (oov v7) {
                            throw ewo.a(v7);
                        }
                    }
                    var3_3 = v4.vg8;
                    var4_4 = 0.0;
                    var3_3.mop = 0.0;
                    var1_1.wam = 0.0;
                }
                try {
                    q0r.a8n(0.3);
                    v8 = this.wyl.vg8;
                    if (var2_2 == 0) break block20;
                    if (v8.g25 % 2 != 0) break block16;
                }
                catch (oov v9) {
                    throw ewo.a(v9);
                }
                var3_3 = this.wyl.vg8;
                var4_4 = var3_3.mop + 0.09000000357627869;
                v8 = var3_3;
            }
            v8.mop = var4_4;
            var1_1.wam = var4_4;
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
        long l = a ^ 0x2A35A4AA812BL;
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
        String string = "\u00db\u00c44\u0013\u00cdU\u0088s\u00e7}V\u00d3\u0098\u0001(0\u0010\rb\u000f\u00c5m\u00b1\rv\u008c\u0081\u0002\u00bc\u00f5-\u00db-0;\u00f0-/3\u00a1\u00ff\u00ceR;D\u00ba\u00bfWyaW\t\u00bd\u00cds\u00e6\u00d5\u00e4\u0003\u00a6\u00d2\u000f6w\u00fb6\u00f3\\\u0011~\u00d7\\\u008f\u009d=\u00b7\u0012u\u001b\u00b3\u000f6";
        int n2 = "\u00db\u00c44\u0013\u00cdU\u0088s\u00e7}V\u00d3\u0098\u0001(0\u0010\rb\u000f\u00c5m\u00b1\rv\u008c\u0081\u0002\u00bc\u00f5-\u00db-0;\u00f0-/3\u00a1\u00ff\u00ceR;D\u00ba\u00bfWyaW\t\u00bd\u00cds\u00e6\u00d5\u00e4\u0003\u00a6\u00d2\u000f6w\u00fb6\u00f3\\\u0011~\u00d7\\\u008f\u009d=\u00b7\u0012u\u001b\u00b3\u000f6".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ewo.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3631;
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
                throw new RuntimeException("ewo", exception);
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
            ewo.e[n2] = ewo.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ewo.a(n, l);
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
            throw new RuntimeException("ewo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ewo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

