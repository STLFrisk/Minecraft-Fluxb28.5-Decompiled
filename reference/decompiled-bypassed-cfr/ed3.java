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

public abstract class ed3
extends gbe {
    public gbe bnx;
    public oon ezi;
    public String cqv;
    private static final long b = c.a(-4688917894616909574L, 2278972805991764920L, MethodHandles.lookup().lookupClass()).a(249760148025470L);
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    public ed3(gbe gbe2) {
        this.bnx = gbe2;
    }

    @Override
    public void updateScreen() {
        this.ezi.p8v();
    }

    public abstract String o9u();

    public abstract String _ey();

    @Override
    public void initGui() {
        long l = b ^ 0x4F5B42330855L;
        Keyboard.enableRepeatEvents((boolean)true);
        this.khf.clear();
        this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 72 + 12, this.o9u()));
        this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e / 4 + 110, (String)((Object)ed3.b("v", (int)5277, (long)(0x2E95EDE03D76CCCBL ^ l)))));
        this.ezi = new oon(0, this.fex, this.dt7 / 2 - 100, 85, 200, 20);
        this.ezi.m4g(true);
        this.ezi.lg5(Integer.MAX_VALUE);
        this.ezi.ihf(this._ey());
    }

    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    public abstract void dgw(gt4 var1);

    @Override
    public void actionPerformed(gt4 gt42) {
        block14: {
            int n;
            block15: {
                int n2;
                block13: {
                    n2 = t9d.c();
                    try {
                        try {
                            n = gt42.c9a;
                            if (n2 != 0) break block13;
                            if (n == 0) break block14;
                        }
                        catch (oov oov2) {
                            throw ed3.c(oov2);
                        }
                        n = gt42._me;
                    }
                    catch (oov oov3) {
                        throw ed3.c(oov3);
                    }
                }
                try {
                    block16: {
                        try {
                            try {
                                if (n2 != 0) break block15;
                                if (n != 1) break block16;
                            }
                            catch (oov oov4) {
                                throw ed3.c(oov4);
                            }
                            this.f41.z2i(this.bnx);
                            if (n2 == 0) break block14;
                        }
                        catch (oov oov5) {
                            throw ed3.c(oov5);
                        }
                    }
                    n = gt42._me;
                }
                catch (oov oov6) {
                    throw ed3.c(oov6);
                }
            }
            try {
                if (n == 0) {
                    this.dgw(gt42);
                }
            }
            catch (oov oov7) {
                throw ed3.c(oov7);
            }
        }
    }

    @Override
    public void dig(char c2, int n) {
        block8: {
            ed3 ed32;
            block6: {
                int n2 = t9d.c();
                try {
                    block7: {
                        try {
                            try {
                                ed32 = this;
                                if (n2 != 0) break block6;
                                ed32.ezi.ir1(c2, n);
                                if (n == 28) break block7;
                            }
                            catch (oov oov2) {
                                throw ed3.c(oov2);
                            }
                            if (n != 156) break block8;
                        }
                        catch (oov oov3) {
                            throw ed3.c(oov3);
                        }
                    }
                    ed32 = this;
                }
                catch (oov oov4) {
                    throw ed3.c(oov4);
                }
            }
            ed32.actionPerformed((gt4)this.khf.get(0));
        }
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        super.mouseClicked(n, n2, n3);
        this.ezi.pzs(n, n2, n3);
    }

    public abstract String a79();

    @Override
    public void drawScreen(int n, int n2, float f) {
        ed3 ed32;
        block5: {
            long l;
            block6: {
                l = b ^ 0x57011C6FD36AL;
                this.xmz();
                int n3 = t9d.c();
                this.poi(this.fex, this.a79(), this.dt7 / 2, 20, 0xFFFFFF);
                int n4 = n3;
                try {
                    try {
                        ed32 = this;
                        if (n4 != 0) break block5;
                        if (ed32.cqv != null) {
                        }
                        break block6;
                    }
                    catch (oov oov2) {
                        throw ed3.c(oov2);
                    }
                    this.poi(this.fex, (String)((Object)ed3.b("v", (int)13610, (long)(0x2873AA8009EB3641L ^ l))) + this.cqv, this.dt7 / 2, 45, 0xFFFFFF);
                }
                catch (oov oov3) {
                    throw ed3.c(oov3);
                }
            }
            this.c_t(this.fex, (String)((Object)ed3.b("v", (int)2976, (long)(0x32712331EFDE08C8L ^ l))), this.dt7 / 2 - 100, 70, 0xA0A0A0);
            this.ezi.j_6();
            ed32 = this;
        }
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
        i = new HashMap(13);
        long l = b ^ 0x1C85E8F18C19L;
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
        String string = "k\u00b1j5\u008a5\u0095G\u00fb\u00f0\u00e2s\u00e3]\u00da\u00cf(\u00c6\u0083\u00cc\u00a5\u0013\u00f6\u00d7K\u00f3!\u00be\u00bc\u00cdH\u00deI^\u009c\u009f\u00e5\u0090\u00a0.\u00e3m\u0086D\u00e7\u001a\u00aa\u00feRF\u00ceM\u00beca2\u00b0\u0010\u00bf~\u0006\u000e\u001b\u0081\u001b\u00fbZ%(\u0099PQO\u0011";
        int n2 = "k\u00b1j5\u008a5\u0095G\u00fb\u00f0\u00e2s\u00e3]\u00da\u00cf(\u00c6\u0083\u00cc\u00a5\u0013\u00f6\u00d7K\u00f3!\u00be\u00bc\u00cdH\u00deI^\u009c\u009f\u00e5\u0090\u00a0.\u00e3m\u0086D\u00e7\u001a\u00aa\u00feRF\u00ceM\u00beca2\u00b0\u0010\u00bf~\u0006\u000e\u001b\u0081\u001b\u00fbZ%(\u0099PQO\u0011".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ed3.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                g = stringArray;
                h = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov c(oov oov2) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x235B;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ed3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            ed3.h[n2] = ed3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ed3.b(n, l);
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
            throw new RuntimeException("ed3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ed3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

