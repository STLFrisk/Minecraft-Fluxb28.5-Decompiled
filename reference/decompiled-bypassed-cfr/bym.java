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

public class bym
extends ar7 {
    public long s95;
    public nhs yth;
    private /* synthetic */ nhs im2;
    public static crk kva;
    public static cn7 tyq;
    public static boolean m8n;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public bym() {
        long l = a ^ 0x69B340478891L;
        super((String)((Object)bym.b("v", (int)22891, (long)(0x20905408CF3169E6L ^ l))), _aj.p3z, false, new j1s[0]);
        this.s95 = 0L;
        this.yth = new nhs();
        this.im2 = new nhs();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @jev
    public void fsj(ccn ccn2) {
        int n;
        block51: {
            boolean bl;
            block48: {
                block49: {
                    block47: {
                        block44: {
                            bym bym2;
                            block45: {
                                block46: {
                                    block42: {
                                        gbe gbe2;
                                        block43: {
                                            n = t9d.c();
                                            try {
                                                try {
                                                    try {
                                                        if (!tyq.d7c().booleanValue()) break block42;
                                                        gbe2 = bym.ek1.u0y;
                                                        if (n != 0) break block43;
                                                    }
                                                    catch (oov oov2) {
                                                        throw bym.a(oov2);
                                                    }
                                                    if (gbe2 == null) return;
                                                }
                                                catch (oov oov3) {
                                                    throw bym.a(oov3);
                                                }
                                                gbe2 = bym.ek1.u0y;
                                            }
                                            catch (oov oov4) {
                                                throw bym.a(oov4);
                                            }
                                        }
                                        try {
                                            if (!(gbe2 instanceof w4v)) {
                                                return;
                                            }
                                            break block44;
                                        }
                                        catch (oov oov5) {
                                            throw bym.a(oov5);
                                        }
                                    }
                                    try {
                                        try {
                                            bym2 = this;
                                            if (n != 0) break block45;
                                            if (bym.ek1.u0y == null) break block46;
                                        }
                                        catch (oov oov6) {
                                            throw bym.a(oov6);
                                        }
                                        this.im2.zay();
                                    }
                                    catch (oov oov7) {
                                        throw bym.a(oov7);
                                    }
                                }
                                bym2 = this;
                            }
                            try {
                                if (!bym2.im2.yrv(300.0)) {
                                    return;
                                }
                            }
                            catch (oov oov8) {
                                throw bym.a(oov8);
                            }
                        }
                        try {
                            if (fyk.kfa != null) {
                                return;
                            }
                        }
                        catch (oov oov9) {
                            throw bym.a(oov9);
                        }
                        try {
                            try {
                                bl = this.yth.yrv(this.s95);
                                if (n != 0) break block47;
                                if (!bl) return;
                            }
                            catch (oov oov10) {
                                throw bym.a(oov10);
                            }
                            bl = kgt.l12.a66.us_(650.0);
                        }
                        catch (oov oov11) {
                            throw bym.a(oov11);
                        }
                    }
                    try {
                        if (n != 0) break block48;
                        if (bl) break block49;
                        return;
                    }
                    catch (oov oov12) {
                        throw bym.a(oov12);
                    }
                }
                try {
                    this.s95 = (long)(kva.u7t() + fyk.mmr(-50.0, 150.0));
                    if (n != 0) return;
                    bl = bym.ek1.vg8.lls.g40;
                }
                catch (oov oov13) {
                    throw bym.a(oov13);
                }
            }
            try {
                block50: {
                    try {
                        try {
                            if (bl) break block50;
                            if (bym.ek1.u0y == null) break block51;
                        }
                        catch (oov oov14) {
                            throw bym.a(oov14);
                        }
                        if (tyq.d7c().booleanValue()) break block51;
                    }
                    catch (oov oov15) {
                        throw bym.a(oov15);
                    }
                }
                this.yth.zay();
                return;
            }
            catch (oov oov16) {
                throw bym.a(oov16);
            }
        }
        for (pca pca2 : pca.values()) {
            int n2;
            block52: {
                block53: {
                    int n3;
                    block54: {
                        n2 = this.p89(pca2, amb.my2(bym.ek1.vg8.up_.tjd(pca2.ordinal())));
                        try {
                            try {
                                try {
                                    try {
                                        if (n != 0) break block52;
                                        if (n2 == -1) break block53;
                                    }
                                    catch (oov oov17) {
                                        throw bym.a(oov17);
                                    }
                                    m8n = false;
                                    if (n != 0) return;
                                }
                                catch (oov oov18) {
                                    throw bym.a(oov18);
                                }
                                if (bym.ek1.vg8.up_.tjd(pca2.ordinal()) == null) break block54;
                            }
                            catch (oov oov19) {
                                throw bym.a(oov19);
                            }
                            this.vj1(pca2.ordinal());
                            this.yth.zay();
                            return;
                        }
                        catch (oov oov20) {
                            throw bym.a(oov20);
                        }
                    }
                    this.ia3(n3);
                    this.yth.zay();
                    return;
                }
                n2 = 1;
            }
            m8n = n2;
            if (n == 0) continue;
        }
    }

    private int p89(pca pca2, float f) {
        int n;
        block17: {
            float f2 = 0.0f;
            int n2 = -1;
            int n3 = t9d.b();
            int n4 = 0;
            do {
                block18: {
                    float f3;
                    block21: {
                        erg erg2;
                        block22: {
                            block20: {
                                block19: {
                                    if (n4 >= bym.ek1.vg8.up_.c41.length) break;
                                    erg2 = bym.ek1.vg8.up_.c41[n4];
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n3 == 0) continue;
                                                        float f4 = amb.my2(erg2) - 0.0f;
                                                        n = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                                                        if (n3 == 0) break block17;
                                                    }
                                                    catch (oov oov2) {
                                                        throw bym.a(oov2);
                                                    }
                                                    if (n < 0) break block18;
                                                }
                                                catch (oov oov3) {
                                                    throw bym.a(oov3);
                                                }
                                                float f5 = amb.my2(erg2) - f;
                                                f3 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                                                if (n3 == 0) break block19;
                                            }
                                            catch (oov oov4) {
                                                throw bym.a(oov4);
                                            }
                                            if (f3 <= 0) break block18;
                                        }
                                        catch (oov oov5) {
                                            throw bym.a(oov5);
                                        }
                                        float f6 = amb.my2(erg2) - f2;
                                        f3 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                                    }
                                    catch (oov oov6) {
                                        throw bym.a(oov6);
                                    }
                                }
                                try {
                                    try {
                                        if (n3 == 0) break block20;
                                        if (f3 < 0) break block18;
                                    }
                                    catch (oov oov7) {
                                        throw bym.a(oov7);
                                    }
                                    f3 = (float)this.qpx(pca2, erg2);
                                }
                                catch (oov oov8) {
                                    throw bym.a(oov8);
                                }
                            }
                            try {
                                if (n3 == 0) break block21;
                                if (f3 != false) break block22;
                                break block18;
                            }
                            catch (oov oov9) {
                                throw bym.a(oov9);
                            }
                        }
                        f2 = amb.my2(erg2);
                        f3 = n4;
                    }
                    n2 = (int)f3;
                }
                ++n4;
            } while (n3 != 0);
            n = n2;
        }
        return n;
    }

    private boolean qpx(pca pca2, erg erg2) {
        int n;
        block44: {
            block43: {
                pca pca3;
                pca pca4;
                jpt jpt2;
                int n2;
                block40: {
                    block41: {
                        int n3;
                        block42: {
                            block37: {
                                block38: {
                                    boolean bl;
                                    block39: {
                                        block34: {
                                            block35: {
                                                boolean bl2;
                                                block36: {
                                                    u7m u7m2;
                                                    block32: {
                                                        block33: {
                                                            n2 = t9d.c();
                                                            try {
                                                                try {
                                                                    u7m2 = erg2.gn1();
                                                                    if (n2 != 0) break block32;
                                                                    if (u7m2 instanceof jpt) break block33;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw bym.a(oov2);
                                                                }
                                                                return false;
                                                            }
                                                            catch (oov oov3) {
                                                                throw bym.a(oov3);
                                                            }
                                                        }
                                                        u7m2 = erg2.gn1();
                                                    }
                                                    jpt2 = (jpt)u7m2;
                                                    try {
                                                        try {
                                                            try {
                                                                pca pca3 = pca2;
                                                                pca3 = pca.dfm;
                                                                if (n2 != 0) break block34;
                                                                if (pca4 != pca3) break block35;
                                                            }
                                                            catch (oov oov4) {
                                                                throw bym.a(oov4);
                                                            }
                                                            bl2 = jpt2.nbs;
                                                            if (n2 != 0) break block36;
                                                        }
                                                        catch (oov oov5) {
                                                            throw bym.a(oov5);
                                                        }
                                                        if (bl2) break block35;
                                                    }
                                                    catch (oov oov6) {
                                                        throw bym.a(oov6);
                                                    }
                                                    bl2 = true;
                                                }
                                                return bl2;
                                            }
                                            pca pca3 = pca2;
                                            pca3 = pca._km;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n2 != 0) break block37;
                                                        if (pca4 != pca3) break block38;
                                                    }
                                                    catch (oov oov7) {
                                                        throw bym.a(oov7);
                                                    }
                                                    bl = jpt2.nbs;
                                                    if (n2 != 0) break block39;
                                                }
                                                catch (oov oov8) {
                                                    throw bym.a(oov8);
                                                }
                                                if (!bl) break block38;
                                            }
                                            catch (oov oov9) {
                                                throw bym.a(oov9);
                                            }
                                            bl = true;
                                        }
                                        catch (oov oov10) {
                                            throw bym.a(oov10);
                                        }
                                    }
                                    return bl;
                                }
                                pca pca3 = pca2;
                                pca3 = pca.zql;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (n2 != 0) break block40;
                                            if (pca4 != pca3) break block41;
                                        }
                                        catch (oov oov11) {
                                            throw bym.a(oov11);
                                        }
                                        n3 = jpt2.nbs;
                                        if (n2 != 0) break block42;
                                    }
                                    catch (oov oov12) {
                                        throw bym.a(oov12);
                                    }
                                    if (n3 != 2) break block41;
                                }
                                catch (oov oov13) {
                                    throw bym.a(oov13);
                                }
                                n3 = 1;
                            }
                            catch (oov oov14) {
                                throw bym.a(oov14);
                            }
                        }
                        return n3 != 0;
                    }
                    pca pca3 = pca2;
                    pca3 = pca.nqa;
                }
                try {
                    try {
                        try {
                            if (pca4 != pca3) break block43;
                            n = jpt2.nbs;
                            if (n2 != 0) break block44;
                        }
                        catch (oov oov15) {
                            throw bym.a(oov15);
                        }
                        if (n != 3) break block43;
                    }
                    catch (oov oov16) {
                        throw bym.a(oov16);
                    }
                    return true;
                }
                catch (oov oov17) {
                    throw bym.a(oov17);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    private void ia3(int var1_1) {
        block9: {
            block7: {
                var2_2 = t9d.c();
                try {
                    v0 = var1_1;
                    if (var2_2 != 0) break block7;
                    if (v0 >= 0) {
                    }
                    ** GOTO lbl20
                }
                catch (oov v1) {
                    throw bym.a(v1);
                }
                v0 = var1_1;
            }
            try {
                block8: {
                    try {
                        if (v0 > 8) break block8;
                        this.lxa(var1_1 + 36, 0, true);
                        if (var2_2 == 0) break block9;
                    }
                    catch (oov v2) {
                        throw bym.a(v2);
                    }
                }
                this.lxa(var1_1, 0, true);
            }
            catch (oov v3) {
                throw bym.a(v3);
            }
        }
    }

    private void lxa(int n, int n2, boolean bl) {
        int n3;
        int n4;
        int n5;
        int n6;
        hh6 hh62;
        block2: {
            block3: {
                int n7 = t9d.b();
                try {
                    hh62 = bym.ek1.l7q;
                    int n3 = bym.ek1.vg8.fv9.h7l;
                    n3 = n;
                    n3 = n2;
                    n3 = bl;
                    if (n7 == 0) break block2;
                    if (n3 == 0) break block3;
                }
                catch (oov oov2) {
                    throw bym.a(oov2);
                }
                n3 = 1;
                break block2;
            }
            n3 = 0;
        }
        hh62.efg(n6, n5, n4, n3, bym.ek1.vg8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void vj1(int n) {
        block7: {
            int n2;
            block6: {
                int n3 = t9d.b();
                n2 = amb.uew(n);
                try {
                    try {
                        try {
                            if (n3 == 0 || amb.sxg()) break block6;
                        }
                        catch (oov oov2) {
                            throw bym.a(oov2);
                        }
                        this.lxa(n2, 0, true);
                        if (n3 != 0) break block7;
                    }
                    catch (oov oov3) {
                        throw bym.a(oov3);
                    }
                }
                catch (oov oov4) {
                    throw bym.a(oov4);
                }
            }
            bym.ek1.l7q.efg(bym.ek1.vg8.fv9.h7l, n2, 1, 4, bym.ek1.vg8);
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

                bym.a = c.a(-6000132332558267727L, 3595341598632408710L, MethodHandles.lookup().lookupClass()).a(226226718234493L);
                var9 = bym.a ^ 120001887590582L;
                bym.h = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[5];
                var5_4 = 0;
                var4_5 = "\u0093\rli@k&u\u00e3.\tcw\u00de\u00bf\u00a7\u0017\u00cb\u00cd\u00b1\u0096\u00b0\u007fN !\u0093`\u0010\u00e9@\u009e=w\u00a8\u001eBD\u0010\b*\u001f\u00b5\u000e\u00ed\u0006\u00d0\u00ae\u00c1\u00c0\u00ee\u0087\u00e5\u00b5\u0006\u00a1\u0082\u0018d\u00f5\u00e8\u00e7a\b\u00b7\u00c7\u00b9\u00fdg\u0092(O\u009fw\u00b4\u00c0V}\u00f5`gi";
                var6_6 = "\u0093\rli@k&u\u00e3.\tcw\u00de\u00bf\u00a7\u0017\u00cb\u00cd\u00b1\u0096\u00b0\u007fN !\u0093`\u0010\u00e9@\u009e=w\u00a8\u001eBD\u0010\b*\u001f\u00b5\u000e\u00ed\u0006\u00d0\u00ae\u00c1\u00c0\u00ee\u0087\u00e5\u00b5\u0006\u00a1\u0082\u0018d\u00f5\u00e8\u00e7a\b\u00b7\u00c7\u00b9\u00fdg\u0092(O\u009fw\u00b4\u00c0V}\u00f5`gi".length();
                var3_7 = 24;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = bym.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0091T\u00feR\u00b7iS<\u0092\u00d9\u00f6Ns\u00b5\u00e1&\u0010(\u00af\u0097t(\u001d~\u00b5)D1!\b\u00b8{\u00f7";
                    var6_6 = "\u0091T\u00feR\u00b7iS<\u0092\u00d9\u00f6Ns\u00b5\u00e1&\u0010(\u00af\u0097t(\u001d~\u00b5)D1!\b\u00b8{\u00f7".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = bym.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        bym.f = var7_3;
        bym.g = new String[5];
        bym.kva = new crk((String)bym.b("v", (int)18156, (long)(6398665722609018436L ^ var9)), (String)bym.b("v", (int)10800, (long)(8449609958954912412L ^ var9)), 150.0f, 100.0f, 500.0f, 50.0f, (String)bym.b("v", (int)549, (long)(4095169164943647374L ^ var9)));
        bym.tyq = new cn7((String)bym.b("v", (int)18156, (long)(6398665722609018436L ^ var9)), (String)bym.b("v", (int)22906, (long)(1704708734362565075L ^ var9)), false);
        bym.m8n = false;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C15;
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
                throw new RuntimeException("bym", exception);
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
            bym.g[n2] = bym.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bym.b(n, l);
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
            throw new RuntimeException("bym" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bym.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

