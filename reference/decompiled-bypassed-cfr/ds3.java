/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
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
import org.lwjgl.input.Keyboard;

public class ds3
extends gbe {
    private /* synthetic */ gbe o9h;
    private /* synthetic */ jqk zsw;
    private final /* synthetic */ String h28;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public ds3(gbe gbe2, String string) {
        this.o9h = gbe2;
        this.h28 = string;
    }

    @Override
    public void updateScreen() {
        this.zsw.zf9();
    }

    @Override
    public void initGui() {
        long l = a ^ 0x2F36553E901AL;
        Keyboard.enableRepeatEvents((boolean)true);
        this.khf.clear();
        this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 96 + 12, fc1.gx1((String)((Object)ds3.b("e", (int)6603, (long)(0x3938AC32F0FB445DL ^ l))), new Object[0])));
        this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e / 4 + 120 + 12, fc1.gx1((String)((Object)ds3.b("e", (int)11654, (long)(0x2A788F4744D7013L ^ l))), new Object[0])));
        l6n l6n2 = this.f41.pwt();
        cog cog2 = l6n2.h1n(this.h28);
        String string = cog2.fln();
        this.zsw = new jqk(2, this.fex, this.dt7 / 2 - 100, 60, 200, 20);
        this.zsw._c6(true);
        this.zsw.nrl(string);
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void actionPerformed(gt4 gt42) {
        block12: {
            int n;
            block13: {
                int n2;
                block11: {
                    n2 = t9d.c();
                    try {
                        try {
                            n = gt42.c9a;
                            if (n2 != 0) break block11;
                            if (n == 0) break block12;
                        }
                        catch (oov oov2) {
                            throw ds3.a(oov2);
                        }
                        n = gt42._me;
                    }
                    catch (oov oov3) {
                        throw ds3.a(oov3);
                    }
                }
                try {
                    block14: {
                        try {
                            try {
                                if (n2 != 0) break block13;
                                if (n != 1) break block14;
                            }
                            catch (oov oov4) {
                                throw ds3.a(oov4);
                            }
                            this.f41.z2i(this.o9h);
                            if (n2 == 0) break block12;
                        }
                        catch (oov oov5) {
                            throw ds3.a(oov5);
                        }
                    }
                    n = gt42._me;
                }
                catch (oov oov6) {
                    throw ds3.a(oov6);
                }
            }
            if (n == 0) {
                l6n l6n2 = this.f41.pwt();
                l6n2.tdg(this.h28, this.zsw.xct().trim());
                this.f41.z2i(this.o9h);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void dig(char var1_1, int var2_2) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var3_3 = t9d.c();
                        try {
                            this.zsw.pst(var1_1, var2_2);
                            v0 = (gt4)this.khf.get(0);
                            v1 = this.zsw.xct().trim().length();
                            if (var3_3 != 0) break block10;
                            if (v1 <= 0) break block11;
                        }
                        catch (oov v2) {
                            throw ds3.a(v2);
                        }
                        v1 = 1;
                        break block10;
                    }
                    v1 = 0;
                }
                try {
                    try {
                        v0.c9a = v1;
                        v3 = var2_2;
                        v4 = 28;
                        if (var3_3 != 0) break block12;
                        if (v3 != v4) {
                        }
                        ** GOTO lbl36
                    }
                    catch (oov v5) {
                        throw ds3.a(v5);
                    }
                    v3 = var2_2;
                    v4 = 156;
                }
                catch (oov v6) {
                    throw ds3.a(v6);
                }
            }
            try {
                if (v3 != v4) break block13;
lbl36:
                // 2 sources

                this.actionPerformed((gt4)this.khf.get(0));
            }
            catch (oov v7) {
                throw ds3.a(v7);
            }
        }
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        super.mouseClicked(n, n2, n3);
        this.zsw.elk(n, n2, n3);
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        long l = a ^ 0x376C0B624B25L;
        this.xmz();
        this.poi(this.fex, fc1.gx1((String)((Object)ds3.b("e", (int)12896, (long)(0x44360472672634C8L ^ l))), new Object[0]), this.dt7 / 2, 20, 0xFFFFFF);
        this.c_t(this.fex, fc1.gx1((String)((Object)ds3.b("e", (int)21281, (long)(0x1C7E4AC51975D58AL ^ l))), new Object[0]), this.dt7 / 2 - 100, 47, 0xA0A0A0);
        this.zsw.dy2();
        super.drawScreen(n, n2, f);
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

                ds3.a = c.a(-627136021494096765L, -356417863062711977L, MethodHandles.lookup().lookupClass()).a(189828956021053L);
                ds3.h = new HashMap<K, V>(13);
                var0 = ds3.a ^ 136576124493667L;
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
                var6_5 = "\u00b0\u00e4\u00b8\u00ab\u00d7=.\u00ea\u00cf\u00a8&\u0087\u0002\u0083\u001dT\u00cfW\u0092U\u00ea2\u00a8U\u0003\u00b48\u00a8O\u0090\u0007\u00cdS?\u00deg\u000f\u00b2x\u0014u\u00e7>z;\u00ae\u00dd\u00f00(o\u00celV\u00fd\u00cb`w o'6J\u00ec\u0083\u00a9+@\u0087\u0081\u00eb[\u0001\u00c7\u0097\u00b6\u0094\u009ff\u00a2\u00b1O\u0090\u0002\u00ddH`d$\\\u00adQ<\u0011\u0014\u00a2\u00c2";
                var8_6 = "\u00b0\u00e4\u00b8\u00ab\u00d7=.\u00ea\u00cf\u00a8&\u0087\u0002\u0083\u001dT\u00cfW\u0092U\u00ea2\u00a8U\u0003\u00b48\u00a8O\u0090\u0007\u00cdS?\u00deg\u000f\u00b2x\u0014u\u00e7>z;\u00ae\u00dd\u00f00(o\u00celV\u00fd\u00cb`w o'6J\u00ec\u0083\u00a9+@\u0087\u0081\u00eb[\u0001\u00c7\u0097\u00b6\u0094\u009ff\u00a2\u00b1O\u0090\u0002\u00ddH`d$\\\u00adQ<\u0011\u0014\u00a2\u00c2".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = ds3.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00bb\u0003f\u008b\u0096N\u00ce\u00b8\u008ej\u0091?e\u007fb\u00c9\u00cd\u0004\u00adL\u00af\u00a6\u008b\u0087t\u00abP\u0003\u00b3\u0090\u00dc\u0012(mH\rq\u0017\u00ben7\u00eb\u00b9\u00e7I\u00bf\u00a4\u00a4!\u0094\u0082\nu\u00cal\u00e6\u00f7\u0091\u00e0d9\u0097\u00c8\u00a4\fyz\u00c6\u00edx\u00ae\u0085T";
                    var8_6 = "\u00bb\u0003f\u008b\u0096N\u00ce\u00b8\u008ej\u0091?e\u007fb\u00c9\u00cd\u0004\u00adL\u00af\u00a6\u008b\u0087t\u00abP\u0003\u00b3\u0090\u00dc\u0012(mH\rq\u0017\u00ben7\u00eb\u00b9\u00e7I\u00bf\u00a4\u00a4!\u0094\u0082\nu\u00cal\u00e6\u00f7\u0091\u00e0d9\u0097\u00c8\u00a4\fyz\u00c6\u00edx\u00ae\u0085T".length();
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
                    var9_3[var7_4++] = ds3.a(var10_9).intern();
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
        ds3.b = var9_3;
        ds3.g = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x269A;
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
                throw new RuntimeException("ds3", exception);
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
            ds3.g[n2] = ds3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ds3.b(n, l);
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
            throw new RuntimeException("ds3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ds3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

