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

public class cxp
extends u7m {
    private static final long a = c.a(2130992571210169744L, -3065702306070720080L, MethodHandles.lookup().lookupClass()).a(19139278306622L);
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public cxp() {
        this.qfy(uja.kdm);
    }

    @Override
    public boolean ghw(erg erg2, ha9 ha92, t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block66: {
            block67: {
                int n;
                block77: {
                    block72: {
                        int n2;
                        mew mew3;
                        vt2 vt23;
                        int n3;
                        int n4;
                        vt2 vt24;
                        int n5;
                        block82: {
                            int n6;
                            block78: {
                                Object object;
                                Comparable comparable;
                                block71: {
                                    int n7;
                                    zfz zfz2;
                                    block69: {
                                        int n8;
                                        block70: {
                                            zfz zfz3;
                                            block68: {
                                                n5 = t9d.b();
                                                zfz2 = t9d2.getBlockState(mew2);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                bl = ha92.dzh(mew2.offset(vt22), vt22, erg2);
                                                                if (n5 == 0) break block66;
                                                                if (!bl) break block67;
                                                            }
                                                            catch (oov oov2) {
                                                                throw cxp.a(oov2);
                                                            }
                                                            zfz3 = zfz2;
                                                            if (n5 == 0) break block68;
                                                        }
                                                        catch (oov oov3) {
                                                            throw cxp.a(oov3);
                                                        }
                                                        if (zfz3.r_y() != ox_.e0w) break block67;
                                                    }
                                                    catch (oov oov4) {
                                                        throw cxp.a(oov4);
                                                    }
                                                    zfz3 = zfz2;
                                                }
                                                catch (oov oov5) {
                                                    throw cxp.a(oov5);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            bl = (Boolean)zfz3.dil(bjx.i1i);
                                                            if (n5 == 0) break block66;
                                                            if (bl) break block67;
                                                        }
                                                        catch (oov oov6) {
                                                            throw cxp.a(oov6);
                                                        }
                                                        n8 = t9d2.v0f;
                                                        if (n5 == 0) break block69;
                                                    }
                                                    catch (oov oov7) {
                                                        throw cxp.a(oov7);
                                                    }
                                                    if (n8 == 0) break block70;
                                                }
                                                catch (oov oov8) {
                                                    throw cxp.a(oov8);
                                                }
                                                return true;
                                            }
                                            catch (oov oov9) {
                                                throw cxp.a(oov9);
                                            }
                                        }
                                        t9d2.vct(mew2, zfz2.zvi(bjx.i1i, Boolean.valueOf(true)), 2);
                                        t9d2.lw8(mew2, ox_.e0w);
                                        --erg2.qd2;
                                        n8 = n7 = 0;
                                    }
                                    while (n7 < 16) {
                                        double d = (float)mew2.getX() + (5.0f + pq6.nextFloat() * 6.0f) / 16.0f;
                                        double d2 = (float)mew2.getY() + 0.8125f;
                                        comparable = mew2;
                                        if (n5 != 0) {
                                            double d3 = (float)((wgo)comparable).getZ() + (5.0f + pq6.nextFloat() * 6.0f) / 16.0f;
                                            double d4 = 0.0;
                                            double d5 = 0.0;
                                            double d6 = 0.0;
                                            t9d2.zvy(w_0.bac, d, d2, d3, d4, d5, d6, new int[0]);
                                            ++n7;
                                            if (n5 != 0) continue;
                                        }
                                        break block71;
                                    }
                                    comparable = zfz2.dil(bjx.d0q);
                                }
                                vt24 = (vt2)((Object)comparable);
                                n4 = 0;
                                n3 = 0;
                                boolean bl2 = false;
                                n6 = 1;
                                vt23 = vt24.drv();
                                int n9 = -2;
                                while (n9 <= 2) {
                                    block73: {
                                        block74: {
                                            boolean bl3;
                                            block75: {
                                                block76: {
                                                    mew mew4 = mew2.offset(vt23, n9);
                                                    object = t9d2.getBlockState(mew4);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n5 == 0) break block72;
                                                                    if (n5 == 0) break block73;
                                                                }
                                                                catch (oov oov10) {
                                                                    throw cxp.a(oov10);
                                                                }
                                                                if (object.r_y() != ox_.e0w) break block74;
                                                            }
                                                            catch (oov oov11) {
                                                                throw cxp.a(oov11);
                                                            }
                                                            bl3 = (Boolean)object.dil(bjx.i1i);
                                                            if (n5 == 0) break block75;
                                                        }
                                                        catch (oov oov12) {
                                                            throw cxp.a(oov12);
                                                        }
                                                        if (bl3) break block76;
                                                    }
                                                    catch (oov oov13) {
                                                        throw cxp.a(oov13);
                                                    }
                                                    n6 = 0;
                                                    if (n5 != 0) break;
                                                }
                                                n3 = n9;
                                                try {
                                                    if (n5 == 0) break block73;
                                                    bl3 = bl2;
                                                }
                                                catch (oov oov14) {
                                                    throw cxp.a(oov14);
                                                }
                                            }
                                            if (!bl3) {
                                                n4 = n9;
                                                bl2 = true;
                                            }
                                        }
                                        ++n9;
                                    }
                                    if (n5 != 0) continue;
                                }
                                try {
                                    try {
                                        try {
                                            n = n6;
                                            if (n5 == 0) break block77;
                                            if (n == 0) break block72;
                                        }
                                        catch (oov oov15) {
                                            throw cxp.a(oov15);
                                        }
                                        n = n3;
                                        if (n5 == 0) break block77;
                                    }
                                    catch (oov oov16) {
                                        throw cxp.a(oov16);
                                    }
                                    if (n != n4 + 2) break block72;
                                }
                                catch (oov oov17) {
                                    throw cxp.a(oov17);
                                }
                                mew3 = mew2.offset(vt24, 4);
                                for (n2 = n4; n2 <= n3; ++n2) {
                                    block79: {
                                        int n10;
                                        block81: {
                                            block80: {
                                                object = mew3.offset(vt23, n2);
                                                zfz zfz4 = t9d2.getBlockState((mew)object);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n5 == 0) break block78;
                                                                if (n5 == 0) break block79;
                                                            }
                                                            catch (oov oov18) {
                                                                throw cxp.a(oov18);
                                                            }
                                                            if (zfz4.r_y() != ox_.e0w) break block80;
                                                        }
                                                        catch (oov oov19) {
                                                            throw cxp.a(oov19);
                                                        }
                                                        n10 = ((Boolean)zfz4.dil(bjx.i1i)).booleanValue() ? 1 : 0;
                                                        if (n5 == 0) break block81;
                                                    }
                                                    catch (oov oov20) {
                                                        throw cxp.a(oov20);
                                                    }
                                                    if (n10 != 0) continue;
                                                }
                                                catch (oov oov21) {
                                                    throw cxp.a(oov21);
                                                }
                                            }
                                            n10 = 0;
                                        }
                                        n6 = n10;
                                    }
                                    try {
                                        if (n5 != 0) break;
                                        if (n5 != 0) continue;
                                        break;
                                    }
                                    catch (oov oov22) {
                                        throw cxp.a(oov22);
                                    }
                                }
                                n2 = n4 - 1;
                            }
                            while (n2 <= n3 + 1) {
                                block83: {
                                    mew3 = mew2.offset(vt23, n2);
                                    n = 1;
                                    if (n5 == 0) break block82;
                                    for (int i = v966661; i <= 3; ++i) {
                                        block84: {
                                            int n11;
                                            block86: {
                                                block85: {
                                                    mew mew5 = mew3.offset(vt24, i);
                                                    zfz zfz5 = t9d2.getBlockState(mew5);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n5 == 0) break block83;
                                                                    if (n5 == 0) break block84;
                                                                }
                                                                catch (oov oov23) {
                                                                    throw cxp.a(oov23);
                                                                }
                                                                if (zfz5.r_y() != ox_.e0w) break block85;
                                                            }
                                                            catch (oov oov24) {
                                                                throw cxp.a(oov24);
                                                            }
                                                            n11 = ((Boolean)zfz5.dil(bjx.i1i)).booleanValue() ? 1 : 0;
                                                            if (n5 == 0) break block86;
                                                        }
                                                        catch (oov oov25) {
                                                            throw cxp.a(oov25);
                                                        }
                                                        if (n11 != 0) continue;
                                                    }
                                                    catch (oov oov26) {
                                                        throw cxp.a(oov26);
                                                    }
                                                }
                                                n11 = 0;
                                            }
                                            n6 = n11;
                                        }
                                        try {
                                            if (n5 != 0) break;
                                            if (n5 != 0) continue;
                                            break;
                                        }
                                        catch (oov oov27) {
                                            throw cxp.a(oov27);
                                        }
                                    }
                                    n2 += 4;
                                }
                                if (n5 != 0) continue;
                            }
                            n = n6;
                        }
                        try {
                            if (n5 == 0) break block77;
                            if (n == 0) break block72;
                        }
                        catch (oov oov28) {
                            throw cxp.a(oov28);
                        }
                        n2 = n4;
                        while (n2 <= n3) {
                            block87: {
                                mew3 = mew2.offset(vt23, n2);
                                n = 1;
                                if (n5 == 0) break block77;
                                for (int i = v966661; i <= 3; ++i) {
                                    mew mew6 = mew3.offset(vt24, i);
                                    try {
                                        t9d2.vct(mew6, ox_.ce3.l4i(), 2);
                                        if (n5 != 0) {
                                            if (n5 != 0) continue;
                                            break;
                                        }
                                        break block87;
                                    }
                                    catch (oov oov29) {
                                        throw cxp.a(oov29);
                                    }
                                }
                                ++n2;
                            }
                            if (n5 != 0) continue;
                        }
                    }
                    n = 1;
                }
                return n != 0;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public erg r__(erg erg2, t9d t9d2, ha9 ha92) {
        block21: {
            t9d t9d3;
            int n;
            long l;
            block20: {
                block19: {
                    block18: {
                        akm akm2;
                        akm akm3;
                        block17: {
                            l = a ^ 0x279183F8DB7EL;
                            n = t9d.c();
                            akm3 = this.tbt(t9d2, ha92, false);
                            try {
                                akm2 = akm3;
                                if (n != 0) break block17;
                                if (akm2 == null) break block18;
                            }
                            catch (oov oov2) {
                                throw cxp.a(oov2);
                            }
                            akm2 = akm3;
                        }
                        try {
                            try {
                                try {
                                    if (akm2.oyz != akm$qs6.i4l) break block18;
                                    t9d3 = t9d2;
                                    if (n != 0) break block19;
                                }
                                catch (oov oov3) {
                                    throw cxp.a(oov3);
                                }
                                if (t9d3.getBlockState(akm3._uf()).r_y() != ox_.e0w) break block18;
                            }
                            catch (oov oov4) {
                                throw cxp.a(oov4);
                            }
                            return erg2;
                        }
                        catch (oov oov5) {
                            throw cxp.a(oov5);
                        }
                    }
                    t9d3 = t9d2;
                }
                try {
                    try {
                        if (n != 0) break block20;
                        if (t9d3.v0f) break block21;
                    }
                    catch (oov oov6) {
                        throw cxp.a(oov6);
                    }
                    t9d3 = t9d2;
                }
                catch (oov oov7) {
                    throw cxp.a(oov7);
                }
            }
            mew mew2 = t9d3.vj_((String)((Object)cxp.b("p", (int)4988, (long)(0x58F2724581D1557FL ^ l))), new mew(ha92));
            if (mew2 != null) {
                ha9 ha93;
                block22: {
                    block23: {
                        db9 db92 = new db9(t9d2, ha92.o2v, ha92.kfp, ha92.vbd);
                        try {
                            try {
                                db92.s00(mew2);
                                t9d2.xzq(db92);
                                t9d2.yfq(ha92, (String)((Object)cxp.b("p", (int)24488, (long)(0x71C4B917F6B499AAL ^ l))), 0.5f, 0.4f / (pq6.nextFloat() * 0.4f + 0.8f));
                                t9d2.pbs(null, 1002, new mew(ha92), 0);
                                ha93 = ha92;
                                if (n != 0) break block22;
                                if (ha93.lls.g40) break block23;
                            }
                            catch (oov oov8) {
                                throw cxp.a(oov8);
                            }
                            --erg2.qd2;
                        }
                        catch (oov oov9) {
                            throw cxp.a(oov9);
                        }
                    }
                    ha93 = ha92;
                }
                ha93.aex(l9p.foo[u7m._lo(this)]);
            }
        }
        return erg2;
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
        long l = a ^ 0x4F022D05E01BL;
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
        String string = "H|\u00cf~\u0086\u00a8\u00cbf\u00fd\u0003\u00e5\u00d4\u00a0I_'\u00c1\u00f9O-*\u00fe#\u00daF\u0003\u001c\u00a7\u0082\u001a\u00e6&\u0018\u00d6\u00c8\u0000\u00cf\u00f8\u0011O\u00b8\u00d1\u009f|\u001c%\u008f=%Z\u00a3\u00c9\u00cc\u00a2$f%";
        int n2 = "H|\u00cf~\u0086\u00a8\u00cbf\u00fd\u0003\u00e5\u00d4\u00a0I_'\u00c1\u00f9O-*\u00fe#\u00daF\u0003\u001c\u00a7\u0082\u001a\u00e6&\u0018\u00d6\u00c8\u0000\u00cf\u00f8\u0011O\u00b8\u00d1\u009f|\u001c%\u008f=%Z\u00a3\u00c9\u00cc\u00a2$f%".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cxp.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                g = new String[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x18E9;
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
                throw new RuntimeException("cxp", exception);
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
            cxp.g[n2] = cxp.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cxp.b(n, l);
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
            throw new RuntimeException("cxp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cxp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

