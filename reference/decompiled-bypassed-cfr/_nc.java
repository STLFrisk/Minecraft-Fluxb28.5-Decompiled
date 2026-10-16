/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.awt.Color;
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
import org.lwjgl.input.Mouse;

public class _nc
extends sdu {
    public ar7 lu7;
    private /* synthetic */ boolean qwd;
    private /* synthetic */ boolean sq7;
    private /* synthetic */ boolean slj;
    private /* synthetic */ sbi lv3;
    private static final long a = c.a(-1141194151631307593L, -3329862134794245523L, MethodHandles.lookup().lookupClass()).a(58588447940604L);
    private static final String[] h;
    private static final String[] i;
    private static final Map j;

    public _nc(nm6 nm62, int n, int n2, String string, String string2, ar7 ar72) {
        boolean bl;
        long l;
        block6: {
            block8: {
                block7: {
                    l = a ^ 0x26AE1FB85CB2L;
                    super(nm62, n, n2, string);
                    this.lv3 = new sbi(15);
                    int n3 = t9d.c();
                    try {
                        try {
                            try {
                                _nc _nc2 = this;
                                bl = ar72.gbf();
                                if (n3 != 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw _nc.a(oov2);
                            }
                            bl = _x3.hgl(ar72.m2d()).isEmpty();
                            if (n3 != 0) break block6;
                        }
                        catch (oov oov3) {
                            throw _nc.a(oov3);
                        }
                        if (bl) break block8;
                    }
                    catch (oov oov4) {
                        throw _nc.a(oov4);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        _nc2.qwd = bl;
        this.vms = Math.max(jvy.s15, nm62.oe7);
        this.c1c = jvy.cec;
        this.lu7 = ar72;
        this.bqh = _nc.b("m", (int)26490, (long)(0x6EE0CC5E0CF04D66L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void g1p(int n, int n2) {
        int n3;
        block32: {
            block34: {
                int n4;
                block30: {
                    block31: {
                        block33: {
                            block26: {
                                block27: {
                                    int n5;
                                    int n6;
                                    block28: {
                                        block29: {
                                            int n7;
                                            long l;
                                            block24: {
                                                block25: {
                                                    l = a ^ 0x63B0B9BC8968L;
                                                    n4 = t9d.c();
                                                    try {
                                                        try {
                                                            n7 = jvy.ck5;
                                                            if (n4 != 0) break block24;
                                                            if (n7 == 0) break block25;
                                                        }
                                                        catch (oov oov2) {
                                                            throw _nc.a(oov2);
                                                        }
                                                        n7 = new Color(z7e.kks.k0y).brighter().getRGB();
                                                        break block24;
                                                    }
                                                    catch (oov oov3) {
                                                        throw _nc.a(oov3);
                                                    }
                                                }
                                                n7 = new Color(0xD5D5D5).getRGB();
                                            }
                                            n6 = n7;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            this.lv3.qtk(zwr.qkk.e6d().k7u(this.lu7.m2d() + (String)((Object)_nc.b("m", (int)15169, (long)(0x2CC51B907FC54486L ^ l)))));
                                                            n3 = this.qwd;
                                                            if (n4 != 0) break block26;
                                                            if (n3 == 0) break block27;
                                                        }
                                                        catch (oov oov4) {
                                                            throw _nc.a(oov4);
                                                        }
                                                        n5 = this.slj;
                                                        if (n4 != 0) break block28;
                                                    }
                                                    catch (oov oov5) {
                                                        throw _nc.a(oov5);
                                                    }
                                                    if (n5 == 0) break block29;
                                                }
                                                catch (oov oov6) {
                                                    throw _nc.a(oov6);
                                                }
                                                n5 = mkt.kgs(n6, 30);
                                                break block28;
                                            }
                                            catch (oov oov7) {
                                                throw _nc.a(oov7);
                                            }
                                        }
                                        n5 = n6;
                                    }
                                    n6 = n5;
                                    float f = (float)this.koa + 6.5f;
                                    float f2 = (float)this.mff + (float)this.c1c / 2.0f;
                                    hzu.dp2();
                                    hzu.a4k(f, f2, 0.0f);
                                    hzu.a2h((float)this.lv3.ds7() * 90.0f, 0.0f, 0.0f, 1.0f);
                                    mkt.dit(-1.0, -2.0, 1.0, 0.0, 1.0f, n6);
                                    mkt.dit(-1.0, 2.0, 1.0, 0.0, 1.0f, n6);
                                    hzu.a4k(-f, -f2, 0.0f);
                                    hzu.x3w();
                                }
                                n3 = this.lu7.klu();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (n4 != 0) break block30;
                                            if (n3 == 0) break block31;
                                        }
                                        catch (oov oov8) {
                                            throw _nc.a(oov8);
                                        }
                                        n3 = jvy.ck5;
                                        if (n4 != 0) break block32;
                                    }
                                    catch (oov oov9) {
                                        throw _nc.a(oov9);
                                    }
                                    if (n3 == 0) break block33;
                                }
                                catch (oov oov10) {
                                    throw _nc.a(oov10);
                                }
                                n3 = jvy.ts6;
                                break block32;
                            }
                            catch (oov oov11) {
                                throw _nc.a(oov11);
                            }
                        }
                        n3 = new Color(206, 89, 255).getRGB();
                        break block32;
                    }
                    n3 = jvy.ck5;
                }
                try {
                    try {
                        if (n4 != 0) break block32;
                        if (n3 == 0) break block34;
                    }
                    catch (oov oov12) {
                        throw _nc.a(oov12);
                    }
                    n3 = z7e.kks.k0y;
                    break block32;
                }
                catch (oov oov13) {
                    throw _nc.a(oov13);
                }
            }
            n3 = 0xFFFFFF;
        }
        int n8 = n3;
        mkt.v_1(n8);
        jsr.eum.fzf(this.vy4, this.koa + 12, (float)(this.mff + this.c1c / 2) - jsr.eum.wni(this.vy4) / 2.0f + 1.0f, n8);
    }

    @Override
    public void c2n(int n, int n2) {
        block8: {
            block6: {
                int n3 = t9d.b();
                try {
                    _nc _nc2;
                    block7: {
                        try {
                            try {
                                super.c2n(n, n2);
                                _nc2 = this;
                                if (n3 == 0) break block6;
                                if (_nc2.lu7 == null) break block7;
                            }
                            catch (oov oov2) {
                                throw _nc.a(oov2);
                            }
                            this.umr = this.lu7.klu();
                            if (n3 != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw _nc.a(oov3);
                        }
                    }
                    _nc2 = this;
                }
                catch (oov oov4) {
                    throw _nc.a(oov4);
                }
            }
            _nc2.umr = false;
        }
    }

    @Override
    public void p4o() {
        block31: {
            block35: {
                String string;
                jvy jvy2;
                block33: {
                    boolean bl;
                    int n;
                    long l;
                    block32: {
                        block30: {
                            block26: {
                                _nc _nc2;
                                block28: {
                                    block27: {
                                        l = a ^ 0x8BBF1D45832L;
                                        n = t9d.c();
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    bl = this.sq7;
                                                                    if (n != 0) break block26;
                                                                    if (!bl) break block27;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw _nc.a(oov2);
                                                                }
                                                                _nc2 = this;
                                                                if (n != 0) break block28;
                                                            }
                                                            catch (oov oov3) {
                                                                throw _nc.a(oov3);
                                                            }
                                                            if (_nc2.lu7 == null) break block27;
                                                        }
                                                        catch (oov oov4) {
                                                            throw _nc.a(oov4);
                                                        }
                                                        if (!Mouse.isButtonDown((int)1)) break block29;
                                                    }
                                                    catch (oov oov5) {
                                                        throw _nc.a(oov5);
                                                    }
                                                    c05.vz1().z2i(new cdv(this.lu7, zwr.qkk.e6d()));
                                                    if (n == 0) break block27;
                                                }
                                                catch (oov oov6) {
                                                    throw _nc.a(oov6);
                                                }
                                            }
                                            this.lu7.tp_();
                                        }
                                        catch (oov oov7) {
                                            throw _nc.a(oov7);
                                        }
                                    }
                                    _nc2 = this;
                                }
                                bl = _nc2.slj;
                            }
                            try {
                                try {
                                    if (n != 0) break block30;
                                    if (!bl) break block31;
                                }
                                catch (oov oov8) {
                                    throw _nc.a(oov8);
                                }
                                bl = this.qwd;
                            }
                            catch (oov oov9) {
                                throw _nc.a(oov9);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n != 0) break block32;
                                    if (!bl) break block31;
                                }
                                catch (oov oov10) {
                                    throw _nc.a(oov10);
                                }
                                jvy2 = zwr.qkk.e6d();
                                string = this.lu7.m2d() + (String)((Object)_nc.b("m", (int)13249, (long)(0x3E8F074B4F029D5EL ^ l)));
                                if (n != 0) break block33;
                            }
                            catch (oov oov11) {
                                throw _nc.a(oov11);
                            }
                            bl = jvy2.k7u(string);
                        }
                        catch (oov oov12) {
                            throw _nc.a(oov12);
                        }
                    }
                    try {
                        block34: {
                            try {
                                if (bl) break block34;
                                zwr.qkk.e6d().ia8(this.lu7.m2d() + (String)((Object)_nc.b("m", (int)15169, (long)(0x2CC5709B37AD95DCL ^ l))), true);
                                if (n == 0) break block35;
                            }
                            catch (oov oov13) {
                                throw _nc.a(oov13);
                            }
                        }
                        jvy2 = zwr.qkk.e6d();
                        string = this.lu7.m2d() + (String)((Object)_nc.b("m", (int)15169, (long)(0x2CC5709B37AD95DCL ^ l)));
                    }
                    catch (oov oov14) {
                        throw _nc.a(oov14);
                    }
                }
                jvy2.ia8(string, false);
            }
            this.loa.met();
        }
    }

    @Override
    public void x6o(int n, int n2, boolean bl) {
        boolean bl2;
        block27: {
            block25: {
                int n3;
                block26: {
                    block24: {
                        boolean bl3;
                        block23: {
                            block21: {
                                block22: {
                                    block20: {
                                        n3 = t9d.b();
                                        try {
                                            try {
                                                _nc _nc2 = this;
                                                bl3 = this.p4h(n, n2);
                                                if (n3 == 0) break block20;
                                                if (!bl3) break block21;
                                            }
                                            catch (oov oov2) {
                                                throw _nc.a(oov2);
                                            }
                                            bl3 = this.loa.au1(n, n2);
                                        }
                                        catch (oov oov3) {
                                            throw _nc.a(oov3);
                                        }
                                    }
                                    try {
                                        try {
                                            if (n3 == 0) break block22;
                                            if (!bl3) break block21;
                                        }
                                        catch (oov oov4) {
                                            throw _nc.a(oov4);
                                        }
                                        bl3 = this.yu6;
                                    }
                                    catch (oov oov5) {
                                        throw _nc.a(oov5);
                                    }
                                }
                                try {
                                    if (n3 == 0) break block23;
                                    if (!bl3) break block21;
                                }
                                catch (oov oov6) {
                                    throw _nc.a(oov6);
                                }
                                bl3 = true;
                                break block23;
                            }
                            bl3 = false;
                        }
                        try {
                            try {
                                _nc2.sq7 = bl3;
                                _nc _nc3 = this;
                                bl2 = this.tzd(n, n2);
                                if (n3 == 0) break block24;
                                if (!bl2) break block25;
                            }
                            catch (oov oov7) {
                                throw _nc.a(oov7);
                            }
                            bl2 = this.loa.au1(n, n2);
                        }
                        catch (oov oov8) {
                            throw _nc.a(oov8);
                        }
                    }
                    try {
                        try {
                            if (n3 == 0) break block26;
                            if (!bl2) break block25;
                        }
                        catch (oov oov9) {
                            throw _nc.a(oov9);
                        }
                        bl2 = this.yu6;
                    }
                    catch (oov oov10) {
                        throw _nc.a(oov10);
                    }
                }
                try {
                    if (n3 == 0) break block27;
                    if (!bl2) break block25;
                }
                catch (oov oov11) {
                    throw _nc.a(oov11);
                }
                bl2 = true;
                break block27;
            }
            bl2 = false;
        }
        _nc3.slj = bl2;
        super.x6o(n, n2, bl);
    }

    private boolean p4h(int n, int n2) {
        return rak.c38(n, n2, this.koa + 11, this.mff, this.koa + this.vms, this.mff + this.c1c);
    }

    private boolean tzd(int n, int n2) {
        return rak.c38(n, n2, this.koa, this.mff, this.koa + 10, this.mff + this.c1c);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        j = new HashMap(13);
        long l = a ^ 0x744BEB39B22FL;
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
        String string = "\u00c6=H\u00daSkxDZk-}\u00ee\u00dc\u00cb\u00adUt\u0013\u00de\u00ba4\u0099\f\u0018\u0000-\u00dd+\u00ad^\t\u00d8\u00c9T\u0084+\u00e0\u00a1]\u00b7\u0099fg\u00df\u001c\u00a9\u0019\u001b\u0018\u00adc?a\u0094\u0006H\u00bc\u00e2\u0011\u00c8\u000b1\u00e8\u0097\u00fc\u00deh1O\u0016.\u008f\u00b7";
        int n2 = "\u00c6=H\u00daSkxDZk-}\u00ee\u00dc\u00cb\u00adUt\u0013\u00de\u00ba4\u0099\f\u0018\u0000-\u00dd+\u00ad^\t\u00d8\u00c9T\u0084+\u00e0\u00a1]\u00b7\u0099fg\u00df\u001c\u00a9\u0019\u001b\u0018\u00adc?a\u0094\u0006H\u00bc\u00e2\u0011\u00c8\u000b1\u00e8\u0097\u00fc\u00deh1O\u0016.\u008f\u00b7".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _nc.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                h = stringArray;
                i = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A3C;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_nc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            _nc.i[n2] = _nc.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _nc.b(n, l);
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
            throw new RuntimeException("_nc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_nc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

