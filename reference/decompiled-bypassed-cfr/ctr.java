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
import net.minecraft.tileentity.TileEntityEnderChest;

public class ctr
extends goq {
    private /* synthetic */ TileEntityEnderChest qi4;
    private static final long a = c.a(3152990950573582589L, -6136988611277512803L, MethodHandles.lookup().lookupClass()).a(113385553199964L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ctr() {
        long l = a ^ 0x216F96106E13L;
        super((String)((Object)ctr.a("z", (int)19797, (long)(0x504FE0D6A2732BCL ^ l))), false, 27);
    }

    public void rzk(TileEntityEnderChest tileEntityEnderChest) {
        this.qi4 = tileEntityEnderChest;
    }

    public void cj6(qhg qhg2) {
        int n;
        int n2;
        long l;
        block11: {
            l = a ^ 0x4C240BB68F2AL;
            n2 = t9d.c();
            for (n = 0; n < this.opt(); ++n) {
                try {
                    this.cxl(n, null);
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                        break;
                    }
                    break block11;
                }
                catch (oov oov2) {
                    throw ctr.a(oov2);
                }
            }
            n = 0;
        }
        while (n < qhg2.vek()) {
            block12: {
                block13: {
                    bdo bdo2 = qhg2.kd6(n);
                    int n3 = bdo2.r_t((String)((Object)ctr.a("z", (int)19776, (long)(0x2F6633B64952D393L ^ l)))) & 0xFF;
                    try {
                        try {
                            try {
                                if (n2 != 0) break block12;
                                if (n3 < 0) break block13;
                            }
                            catch (oov oov3) {
                                throw ctr.a(oov3);
                            }
                            if (n3 >= this.opt()) break block13;
                        }
                        catch (oov oov4) {
                            throw ctr.a(oov4);
                        }
                        this.cxl(n3, erg.qog(bdo2));
                    }
                    catch (oov oov5) {
                        throw ctr.a(oov5);
                    }
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
    }

    public qhg _1u() {
        long l = a ^ 0x687718A83803L;
        qhg qhg2 = new qhg();
        int n = 0;
        int n2 = t9d.c();
        while (n < this.opt()) {
            block3: {
                block4: {
                    erg erg2 = this.ibn(n);
                    try {
                        if (n2 != 0) break block3;
                        if (erg2 == null) break block4;
                    }
                    catch (oov oov2) {
                        throw ctr.a(oov2);
                    }
                    bdo bdo2 = new bdo();
                    bdo2.atr((String)((Object)ctr.a("z", (int)21586, (long)(0x26E976228B95FDAAL ^ l))), (byte)n);
                    erg2.zy4(bdo2);
                    qhg2.w2j(bdo2);
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
        return qhg2;
    }

    @Override
    public boolean dnv(ha9 ha92) {
        boolean bl;
        block10: {
            ctr ctr2;
            block8: {
                block9: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                try {
                                    ctr2 = this;
                                    if (n == 0) break block8;
                                    if (ctr2.qi4 == null) break block9;
                                }
                                catch (oov oov2) {
                                    throw ctr.a(oov2);
                                }
                                ctr2 = this;
                                if (n == 0) break block8;
                            }
                            catch (oov oov3) {
                                throw ctr.a(oov3);
                            }
                            if (ctr2.qi4.cue(ha92)) break block9;
                        }
                        catch (oov oov4) {
                            throw ctr.a(oov4);
                        }
                        bl = false;
                        break block10;
                    }
                    catch (oov oov5) {
                        throw ctr.a(oov5);
                    }
                }
                ctr2 = this;
            }
            bl = super.dnv(ha92);
        }
        return bl;
    }

    @Override
    public void dk0(ha9 ha92) {
        ctr ctr2;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        ctr2 = this;
                        if (n != 0) break block4;
                        if (ctr2.qi4 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw ctr.a(oov2);
                    }
                    this.qi4.o7o();
                }
                catch (oov oov3) {
                    throw ctr.a(oov3);
                }
            }
            ctr2 = this;
        }
        super.dk0(ha92);
    }

    @Override
    public void vhz(ha9 ha92) {
        block4: {
            ctr ctr2;
            block5: {
                int n = t9d.b();
                try {
                    try {
                        ctr2 = this;
                        if (n == 0) break block4;
                        if (ctr2.qi4 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw ctr.a(oov2);
                    }
                    this.qi4.cb_();
                }
                catch (oov oov3) {
                    throw ctr.a(oov3);
                }
            }
            super.vhz(ha92);
            ctr2 = this;
        }
        ctr2.qi4 = null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x41250F0DDD15L;
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
        String string = "c\u00d5\u00d4\u008fd\u00ac-]*\u00d7\u00b3Z\u0090\u001f?\u00e2([\u00ee\u00f54\u00fb\u000bA\u0095\u00a7>\u009f\u0085\u00b5\u0012\u00cc*\u00a7\u00a8!\ra\u008f\u00e51-\u00fd\u0093,+\u001f\u009f\u008abU\u00cf\\\u0094\u00f1\u0080\u00c1\u0010R\r\u00d7P\u00ae\u000bt\u00b7\u00c4W\u00bbM\u00e4\n\u0081\u0088";
        int n2 = "c\u00d5\u00d4\u008fd\u00ac-]*\u00d7\u00b3Z\u0090\u001f?\u00e2([\u00ee\u00f54\u00fb\u000bA\u0095\u00a7>\u009f\u0085\u00b5\u0012\u00cc*\u00a7\u00a8!\ra\u008f\u00e51-\u00fd\u0093,+\u001f\u009f\u008abU\u00cf\\\u0094\u00f1\u0080\u00c1\u0010R\r\u00d7P\u00ae\u000bt\u00b7\u00c4W\u00bbM\u00e4\n\u0081\u0088".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ctr.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x75A6;
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
                throw new RuntimeException("ctr", exception);
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
            ctr.c[n2] = ctr.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ctr.a(n, l);
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
            throw new RuntimeException("ctr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ctr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

