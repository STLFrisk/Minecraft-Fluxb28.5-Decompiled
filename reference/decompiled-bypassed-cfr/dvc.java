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

public class dvc
extends gbe {
    private static final moh$_ru[] ofj;
    private final gbe y5k;
    private final moh xf2;
    private String xgh;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public dvc(gbe gbe2, moh moh2) {
        this.y5k = gbe2;
        this.xf2 = moh2;
    }

    @Override
    public void initGui() {
        block9: {
            boolean bl;
            long l = a ^ 0x5CBF6D6A8292L;
            int n = 0;
            this.xgh = fc1.gx1((String)((Object)dvc.b("r", (int)14698, (long)(0x7EF80083360FA194L ^ l))), new Object[0]);
            moh$_ru[] moh$_ruArray = ofj;
            int n2 = moh$_ruArray.length;
            int n3 = t9d.c();
            for (int i = 0; i < n2; ++i) {
                block10: {
                    moh$_ru moh$_ru = moh$_ruArray[i];
                    try {
                        block11: {
                            try {
                                try {
                                    try {
                                        bl = moh$_ru.on0();
                                        if (n3 != 0) break block9;
                                        if (n3 != 0) break block10;
                                    }
                                    catch (oov oov2) {
                                        throw dvc.a(oov2);
                                    }
                                    if (!bl) break block11;
                                }
                                catch (oov oov3) {
                                    throw dvc.a(oov3);
                                }
                                this.khf.add(new kkh(moh$_ru.ehz(), this.dt7 / 2 - 155 + n % 2 * 160, this.o1e / 6 + 24 * (n >> 1), moh$_ru));
                                if (n3 == 0) break block10;
                            }
                            catch (oov oov4) {
                                throw dvc.a(oov4);
                            }
                        }
                        this.khf.add(new cm_(moh$_ru.ehz(), this.dt7 / 2 - 155 + n % 2 * 160, this.o1e / 6 + 24 * (n >> 1), moh$_ru, this.xf2.ycx(moh$_ru)));
                    }
                    catch (oov oov5) {
                        throw dvc.a(oov5);
                    }
                }
                ++n;
                if (n3 == 0) continue;
            }
            bl = this.khf.add(new gt4(200, this.dt7 / 2 - 100, this.o1e / 6 + 120, fc1.gx1((String)((Object)dvc.b("r", (int)8148, (long)(0x26354F38DBF5072BL ^ l))), new Object[0])));
        }
    }

    @Override
    public void actionPerformed(gt4 gt42) {
        block16: {
            int n;
            int n2;
            block17: {
                block19: {
                    block18: {
                        int n3;
                        block15: {
                            n3 = t9d.b();
                            try {
                                try {
                                    n2 = gt42.c9a;
                                    if (n3 == 0) break block15;
                                    if (n2 == 0) break block16;
                                }
                                catch (oov oov2) {
                                    throw dvc.a(oov2);
                                }
                                n2 = gt42._me;
                            }
                            catch (oov oov3) {
                                throw dvc.a(oov3);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        n = 100;
                                        if (n3 == 0) break block17;
                                        if (n2 >= n) break block18;
                                    }
                                    catch (oov oov4) {
                                        throw dvc.a(oov4);
                                    }
                                    n2 = gt42 instanceof cm_;
                                    if (n3 == 0) break block19;
                                }
                                catch (oov oov5) {
                                    throw dvc.a(oov5);
                                }
                                if (n2 == 0) break block18;
                            }
                            catch (oov oov6) {
                                throw dvc.a(oov6);
                            }
                            this.xf2.d13(((cm_)gt42).t4j(), 1);
                            gt42.frg = this.xf2.ycx(moh$_ru.jit(gt42._me));
                        }
                        catch (oov oov7) {
                            throw dvc.a(oov7);
                        }
                    }
                    n2 = gt42._me;
                }
                n = 200;
            }
            try {
                if (n2 == n) {
                    this.f41.oxn.cmo();
                    this.f41.z2i(this.y5k);
                }
            }
            catch (oov oov8) {
                throw dvc.a(oov8);
            }
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.xmz();
        this.poi(this.fex, this.xgh, this.dt7 / 2, 20, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-9050505523244471475L, -6374397672753786372L, MethodHandles.lookup().lookupClass()).a(205426886437127L);
        h = new HashMap(13);
        long l = a ^ 0x1F573A52E4FDL;
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
        String string = "4?\u0014\u00d1\u00be$\u00f8d\u00caF\u0088on\u008e\u00b2\u009b\u00b9\u00ebd,\u00e3\u00b9\u001c\u00af&:,\u007fl\u00fb.\u00a3(\u0086O\u0013>\u00a0\u00ea\u00b3\u0095\u00dd\u00cf\u0097\u00f0\u00b0&\n\u00c4{\u00a4\u00cf\u0083\u0000\u00b0X\u00c6\u00d3\u00e1\u00f2~\u009b\u0014\u00a2|24\r;\b\b\u00b5\u0011";
        int n2 = "4?\u0014\u00d1\u00be$\u00f8d\u00caF\u0088on\u008e\u00b2\u009b\u00b9\u00ebd,\u00e3\u00b9\u001c\u00af&:,\u007fl\u00fb.\u00a3(\u0086O\u0013>\u00a0\u00ea\u00b3\u0095\u00dd\u00cf\u0097\u00f0\u00b0&\n\u00c4{\u00a4\u00cf\u0083\u0000\u00b0X\u00c6\u00d3\u00e1\u00f2~\u009b\u0014\u00a2|24\r;\b\b\u00b5\u0011".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dvc.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                g = new String[2];
                ofj = new moh$_ru[]{moh$_ru.sdf, moh$_ru.xtm, moh$_ru.dm2, moh$_ru.o_c, moh$_ru.zef, moh$_ru.re8, moh$_ru.mzt, moh$_ru.lvc, moh$_ru.zro, moh$_ru.jqz};
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63F2;
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
                throw new RuntimeException("dvc", exception);
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
            dvc.g[n2] = dvc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dvc.b(n, l);
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
            throw new RuntimeException("dvc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dvc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

