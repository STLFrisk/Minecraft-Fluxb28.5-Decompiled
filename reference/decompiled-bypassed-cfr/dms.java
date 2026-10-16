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

public abstract class dms
extends laq {
    public int mp6;
    public int qv8;
    public int j78;
    private /* synthetic */ float nf8;
    private /* synthetic */ float mav;
    private static final long d;
    private static final String[] s;
    private static final String[] t;
    private static final Map u;

    public dms(t9d t9d2) {
        super(t9d2);
        this.nf8 = -1.0f;
    }

    public abstract dms kv0(dms var1);

    @Override
    public boolean hp6(ha9 ha92) {
        block31: {
            int n;
            block32: {
                block33: {
                    erg erg2;
                    int n2;
                    block36: {
                        block37: {
                            dms dms2;
                            dms dms3;
                            block35: {
                                dms dms4;
                                block34: {
                                    erg erg3;
                                    block30: {
                                        n2 = t9d.b();
                                        erg2 = ha92.up_.dxs();
                                        try {
                                            erg3 = erg2;
                                            if (n2 == 0) break block30;
                                            if (erg3 == null) break block31;
                                        }
                                        catch (oov oov2) {
                                            throw dms.b(oov2);
                                        }
                                        erg3 = erg2;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (erg3.gn1() != xbr.pb_) break block31;
                                                n = this.oay.v0f;
                                                if (n2 == 0) break block32;
                                            }
                                            catch (oov oov3) {
                                                throw dms.b(oov3);
                                            }
                                            if (n != 0) break block33;
                                        }
                                        catch (oov oov4) {
                                            throw dms.b(oov4);
                                        }
                                        n = erg2.j6_();
                                        if (n2 == 0) break block32;
                                    }
                                    catch (oov oov5) {
                                        throw dms.b(oov5);
                                    }
                                    Class clazz = y65.p1u(n);
                                    try {
                                        try {
                                            try {
                                                if (clazz == null) break block33;
                                                dms4 = this;
                                                if (n2 == 0) break block34;
                                            }
                                            catch (oov oov6) {
                                                throw dms.b(oov6);
                                            }
                                            if (dms4.getClass() != clazz) break block33;
                                        }
                                        catch (oov oov7) {
                                            throw dms.b(oov7);
                                        }
                                        dms4 = this.kv0(this);
                                    }
                                    catch (oov oov8) {
                                        throw dms.b(oov8);
                                    }
                                }
                                dms3 = dms4;
                                try {
                                    try {
                                        dms2 = dms3;
                                        if (n2 == 0) break block35;
                                        if (dms2 == null) break block33;
                                    }
                                    catch (oov oov9) {
                                        throw dms.b(oov9);
                                    }
                                    dms3.mr2(-24000);
                                    dms3.x24(this.o2v, this.kfp, this.vbd, 0.0f, 0.0f);
                                    dms2 = this;
                                }
                                catch (oov oov10) {
                                    throw dms.b(oov10);
                                }
                            }
                            try {
                                try {
                                    dms2.oay.xzq(dms3);
                                    n = erg2.x4w() ? 1 : 0;
                                    if (n2 == 0) break block36;
                                    if (n == 0) break block37;
                                }
                                catch (oov oov11) {
                                    throw dms.b(oov11);
                                }
                                dms3.x84(erg2.zow());
                            }
                            catch (oov oov12) {
                                throw dms.b(oov12);
                            }
                        }
                        n = ha92.lls.g40 ? 1 : 0;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (n2 == 0) break block32;
                                    if (n != 0) break block33;
                                }
                                catch (oov oov13) {
                                    throw dms.b(oov13);
                                }
                                n = --erg2.qd2;
                                if (n2 == 0) break block32;
                            }
                            catch (oov oov14) {
                                throw dms.b(oov14);
                            }
                            if (n > 0) break block33;
                        }
                        catch (oov oov15) {
                            throw dms.b(oov15);
                        }
                        ha92.up_.cxl(ha92.up_.nb5, null);
                    }
                    catch (oov oov16) {
                        throw dms.b(oov16);
                    }
                }
                n = 1;
            }
            return n != 0;
        }
        return false;
    }

    @Override
    public void tbj() {
        super.tbj();
        this.oit.kp2(12, (byte)0);
    }

    public int ktm() {
        int n;
        block6: {
            dms dms2;
            block4: {
                block5: {
                    int n2 = t9d.c();
                    try {
                        try {
                            dms2 = this;
                            if (n2 != 0) break block4;
                            if (!dms2.oay.v0f) break block5;
                        }
                        catch (oov oov2) {
                            throw dms.b(oov2);
                        }
                        n = this.oit.miz(12);
                        break block6;
                    }
                    catch (oov oov3) {
                        throw dms.b(oov3);
                    }
                }
                dms2 = this;
            }
            n = dms2.mp6;
        }
        return n;
    }

    public void uj6(int n, boolean n2) {
        block23: {
            dms dms2;
            block22: {
                int n3;
                block20: {
                    int n4;
                    block21: {
                        int n5;
                        int n6;
                        block18: {
                            int n7;
                            block19: {
                                n7 = n6 = this.ktm();
                                n6 += n * 20;
                                n4 = t9d.b();
                                try {
                                    n5 = n6;
                                    if (n4 == 0) break block18;
                                    if (n5 <= 0) break block19;
                                }
                                catch (oov oov2) {
                                    throw dms.b(oov2);
                                }
                                n6 = 0;
                                try {
                                    try {
                                        n5 = n7;
                                        if (n4 == 0) break block18;
                                        if (n5 >= 0) break block19;
                                    }
                                    catch (oov oov3) {
                                        throw dms.b(oov3);
                                    }
                                    this.qkm();
                                }
                                catch (oov oov4) {
                                    throw dms.b(oov4);
                                }
                            }
                            n5 = n6 - n7;
                        }
                        int n8 = n5;
                        try {
                            try {
                                try {
                                    try {
                                        this.mr2(n6);
                                        n3 = n2;
                                        if (n4 == 0) break block20;
                                        if (n3 == 0) break block21;
                                    }
                                    catch (oov oov5) {
                                        throw dms.b(oov5);
                                    }
                                    this.qv8 += n8;
                                    n3 = this.j78;
                                    if (n4 == 0) break block20;
                                }
                                catch (oov oov6) {
                                    throw dms.b(oov6);
                                }
                                if (n3 != 0) break block21;
                            }
                            catch (oov oov7) {
                                throw dms.b(oov7);
                            }
                            this.j78 = 40;
                        }
                        catch (oov oov8) {
                            throw dms.b(oov8);
                        }
                    }
                    try {
                        dms2 = this;
                        if (n4 == 0) break block22;
                        n3 = dms2.ktm();
                    }
                    catch (oov oov9) {
                        throw dms.b(oov9);
                    }
                }
                if (n3 != 0) break block23;
                dms2 = this;
            }
            dms2.mr2(this.qv8);
        }
    }

    public void z23(int n) {
        this.uj6(n, false);
    }

    public void mr2(int n) {
        this.oit.c66(12, (byte)fe6.faa(n, -1, 1));
        this.mp6 = n;
        this.c_k(this.ejl());
    }

    @Override
    public void srs(bdo bdo2) {
        long l = d ^ 0x78DA3B67D6EDL;
        super.srs(bdo2);
        bdo2.iin((String)((Object)dms.d("t", (int)31795, (long)(0x73E824EA69EF70FDL ^ l))), this.ktm());
        bdo2.iin((String)((Object)dms.d("t", (int)27945, (long)(0x57FD5CD846B4E1E6L ^ l))), this.qv8);
    }

    @Override
    public void cjb(bdo bdo2) {
        long l = d ^ 0xE747E38BA46L;
        super.cjb(bdo2);
        this.mr2(bdo2.uz7((String)((Object)dms.d("t", (int)10561, (long)(0x2514900538C3C926L ^ l)))));
        this.qv8 = bdo2.uz7((String)((Object)dms.d("t", (int)15747, (long)(0x13CEC661DC775DE5L ^ l))));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void e_a() {
        block34: {
            block35: {
                block36: {
                    block29: {
                        block30: {
                            block31: {
                                block32: {
                                    block33: {
                                        var1_1 = t9d.c();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                super.e_a();
                                                                v0 = this.oay.v0f;
                                                                if (var1_1 != 0) break block29;
                                                                if (v0 != 0) {
                                                                }
                                                                ** GOTO lbl48
                                                            }
                                                            catch (oov v1) {
                                                                throw dms.b(v1);
                                                            }
                                                            v2 = this;
                                                            if (var1_1 != 0) break block30;
                                                        }
                                                        catch (oov v3) {
                                                            throw dms.b(v3);
                                                        }
                                                        if (v2.j78 <= 0) break block31;
                                                    }
                                                    catch (oov v4) {
                                                        throw dms.b(v4);
                                                    }
                                                    v5 = this;
                                                    if (var1_1 != 0) break block32;
                                                }
                                                catch (oov v6) {
                                                    throw dms.b(v6);
                                                }
                                                if (v5.j78 % 4 != 0) break block33;
                                            }
                                            catch (oov v7) {
                                                throw dms.b(v7);
                                            }
                                            this.oay.zvy(w_0.z1q, this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0f) - (double)this.uo6, this.kfp + 0.5 + (double)(this.z2d.nextFloat() * this.ikl), this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0f) - (double)this.uo6, 0.0, 0.0, 0.0, new int[0]);
                                        }
                                        catch (oov v8) {
                                            throw dms.b(v8);
                                        }
                                    }
                                    v5 = this;
                                }
                                --v5.j78;
                            }
                            v2 = this;
                        }
                        try {
                            v2.c_k(this.ejl());
                            if (var1_1 == 0) break block34;
lbl48:
                            // 2 sources

                            v0 = this.ktm();
                        }
                        catch (oov v9) {
                            throw dms.b(v9);
                        }
                    }
                    var2_2 = v0;
                    try {
                        try {
                            try {
                                try {
                                    v10 = var2_2++;
                                    if (var1_1 != 0) break block35;
                                    if (v10 < 0) {
                                    }
                                    ** GOTO lbl81
                                }
                                catch (oov v11) {
                                    throw dms.b(v11);
                                }
                                this.mr2(var2_2);
                                if (var1_1 != 0) break block36;
                            }
                            catch (oov v12) {
                                throw dms.b(v12);
                            }
                            if (var2_2 != 0) break block34;
                        }
                        catch (oov v13) {
                            throw dms.b(v13);
                        }
                        this.qkm();
                    }
                    catch (oov v14) {
                        throw dms.b(v14);
                    }
                }
                try {
                    if (var1_1 == 0) break block34;
lbl81:
                    // 2 sources

                    v10 = var2_2;
                }
                catch (oov v15) {
                    throw dms.b(v15);
                }
            }
            try {
                if (v10 > 0) {
                    this.mr2(--var2_2);
                }
            }
            catch (oov v16) {
                throw dms.b(v16);
            }
        }
    }

    public void qkm() {
    }

    @Override
    public boolean ejl() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.ktm();
                    if (n == 0) break block2;
                    if (bl >= false) break block3;
                }
                catch (oov oov2) {
                    throw dms.b(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void c_k(boolean bl) {
        float f;
        dms dms2;
        block3: {
            block2: {
                try {
                    dms2 = this;
                    if (!bl) break block2;
                    f = 0.5f;
                    break block3;
                }
                catch (oov oov2) {
                    throw dms.b(oov2);
                }
            }
            f = 1.0f;
        }
        dms2.pcv(f);
    }

    @Override
    public final void yxc(float f, float f2) {
        block9: {
            float f3;
            dms dms2;
            block8: {
                float f4;
                int n;
                block6: {
                    block7: {
                        n = t9d.c();
                        try {
                            float f5 = this.nf8 - 0.0f;
                            f4 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                            if (n != 0) break block6;
                            if (f4 <= 0) break block7;
                        }
                        catch (oov oov2) {
                            throw dms.b(oov2);
                        }
                        f4 = 1.0f;
                        break block6;
                    }
                    f4 = 0.0f;
                }
                float f6 = f4;
                try {
                    try {
                        this.nf8 = f;
                        dms2 = this;
                        f3 = f2;
                        if (n != 0) break block8;
                        dms2.mav = f3;
                        if (f6 != false) break block9;
                    }
                    catch (oov oov3) {
                        throw dms.b(oov3);
                    }
                    dms2 = this;
                    f3 = 1.0f;
                }
                catch (oov oov4) {
                    throw dms.b(oov4);
                }
            }
            dms2.pcv(f3);
        }
    }

    public final void pcv(float f) {
        super.yxc(this.nf8 * f, this.mav * f);
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

                dms.d = c.a(-7042093923786800060L, 7051623855488268160L, MethodHandles.lookup().lookupClass()).a(72877130422157L);
                dms.u = new HashMap<K, V>(13);
                var0 = dms.d ^ 139171482269673L;
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
                var6_5 = "\u00dat7\u00f99\u0085`$\u00d4\u00f1\u00bd\u000f\u00887~\u0089($\u009c\u00db\u00d0\u00eb\u00d7b\u0010[{\u00c3v\u00c0\u0015\u0005\u0015J\u008b\u007f\u000f\u00e4\u00fa\u00b39";
                var8_6 = "\u00dat7\u00f99\u0085`$\u00d4\u00f1\u00bd\u000f\u00887~\u0089($\u009c\u00db\u00d0\u00eb\u00d7b\u0010[{\u00c3v\u00c0\u0015\u0005\u0015J\u008b\u007f\u000f\u00e4\u00fa\u00b39".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = dms.e(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "B6\u00dds\u00c8\u00cb\u009d\u0087\u0092F\\F\"(\u00ce\u00e8\u00cb\u00f9A\u00ab^y:\u00d9\u009e#?\u00ac\u00ad\u000b\u0090\u00ee\u0010'\u00e2+\u0005\u00b3\u00aa\u0082\u00aa\u00b60\u008cY\\g\u00e3\u0099";
                    var8_6 = "B6\u00dds\u00c8\u00cb\u009d\u0087\u0092F\\F\"(\u00ce\u00e8\u00cb\u00f9A\u00ab^y:\u00d9\u009e#?\u00ac\u00ad\u000b\u0090\u00ee\u0010'\u00e2+\u0005\u00b3\u00aa\u0082\u00aa\u00b60\u008cY\\g\u00e3\u0099".length();
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
                    var9_3[var7_4++] = dms.e(var10_9).intern();
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
        dms.s = var9_3;
        dms.t = new String[4];
    }

    private static oov b(oov oov2) {
        return oov2;
    }

    private static String e(byte[] byArray) {
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

    private static String d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x30A1;
        if (t[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])u.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dms", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = s[n2].getBytes("ISO-8859-1");
            dms.t[n2] = dms.e(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return t[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dms.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dms" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dms.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

