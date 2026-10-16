/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
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
import org.lwjgl.input.Mouse;

public abstract class ak9 {
    public int koa;
    public int mff;
    public int vms;
    public int c1c;
    public int lze;
    public int ijd;
    public String vy4;
    public boolean yu6;
    private /* synthetic */ boolean g7x;
    public boolean u_u;
    public nm6 loa;
    public String bqh;
    public boolean n0w;
    public String q4d;
    private /* synthetic */ boolean jfr;
    public tne git;
    private static final long b = c.a(-7794397690904024803L, -3141104594050792597L, MethodHandles.lookup().lookupClass()).a(27831155937295L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public ak9(nm6 nm62, int n, int n2, String string) {
        long l = b ^ 0x5AA6E8BDD38CL;
        this.g7x = true;
        this.bqh = ak9.a("q", (int)15041, (long)(0x47E6332A5D8C3080L ^ l));
        this.n0w = true;
        this.q4d = ak9.a("q", (int)29974, (long)(0x53128DF800FB7F54L ^ l));
        this.jfr = true;
        this.git = null;
        this.loa = nm62;
        this.lze = n;
        this.ijd = n2;
        this.vy4 = string;
    }

    public void q_0() {
        block8: {
            block6: {
                int n = t9d.b();
                try {
                    ak9 ak92;
                    block7: {
                        try {
                            try {
                                ak92 = this.git;
                                if (n == 0) break block6;
                                if (ak92 == null) break block7;
                            }
                            catch (oov oov2) {
                                throw ak9.b(oov2);
                            }
                            this.mff -= this.loa.mut;
                            if (n != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw ak9.b(oov3);
                        }
                    }
                    this.koa = this.loa.ait + this.lze;
                    ak92 = this;
                }
                catch (oov oov4) {
                    throw ak9.b(oov4);
                }
            }
            ak92.mff = this.loa.po6 + this.ijd - this.loa.mut;
        }
    }

    public boolean nxv(int n, int n2) {
        float f;
        block3: {
            block2: {
                long l = b ^ 0x2502B1EEACCFL;
                try {
                    if (!this.q4d.contains((CharSequence)((Object)ak9.a("q", (int)13975, (long)(0x6081101C9B4E4397L ^ l))))) break block2;
                    f = 5.0f;
                    break block3;
                }
                catch (oov oov2) {
                    throw ak9.b(oov2);
                }
            }
            f = 0.0f;
        }
        float f2 = f;
        return rak.c38(n, n2, (float)this.koa + f2, this.mff, (float)(this.koa + this.vms) - f2, this.mff + this.c1c);
    }

    public void vx9() {
        this.yu6 = false;
        this.u_u = Mouse.isButtonDown((int)0);
    }

    public void fc9(boolean bl) {
        block9: {
            block10: {
                ak9 ak92;
                boolean bl2;
                block8: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                this.jfr = bl;
                                bl2 = bl;
                                if (n != 0) break block8;
                                if (bl2) break block9;
                            }
                            catch (oov oov2) {
                                throw ak9.b(oov2);
                            }
                            ak92 = this;
                            if (n != 0) break block10;
                        }
                        catch (oov oov3) {
                            throw ak9.b(oov3);
                        }
                        bl2 = ak92 instanceof tne;
                    }
                    catch (oov oov4) {
                        throw ak9.b(oov4);
                    }
                }
                if (!bl2) break block9;
                ak92 = this;
            }
            ak92.c1c = 0;
        }
    }

    public void c2n(int n, int n2) {
        this.q_0();
    }

    public void ta0(int n, int n2) {
        ak9 ak92;
        block4: {
            block5: {
                int n3 = t9d.b();
                try {
                    try {
                        ak92 = this;
                        if (n3 == 0) break block4;
                        if (ak92.jfr) break block5;
                    }
                    catch (oov oov2) {
                        throw ak9.b(oov2);
                    }
                    return;
                }
                catch (oov oov3) {
                    throw ak9.b(oov3);
                }
            }
            ak92 = this;
        }
        ak92.g1p(n, n2);
    }

    public abstract void g1p(int var1, int var2);

    public abstract void x6o(int var1, int var2, boolean var3);

    public boolean kt6() {
        return this.g7x;
    }

    public void ez7(boolean bl) {
        this.g7x = bl;
    }

    public boolean eke() {
        return this.jfr;
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
        long l = b ^ 0xFA471F64A26L;
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
        String string = "^h\u00a8\u00b3\u008c>\u00bd\u00b5\u001f\u00ceL)M^\u00baE`\u00ef\u00c4\u00db\u00ce2P?\u00bb\u00c8\u0082F\u00ff,\u0012\u00c0\u0010[\u0096Q\u00fc$\u00b1qx\n\u00c3z\u00ad<\u00fb\u0096s \u00d3&\u00fcs\u0083d:\u00bd=/\u00f9\u00d8{=a\u00beW\u0084\u00e5\u00bf\u00cf\u009c$Kx^\u00fc\u0082E'O\u0006";
        int n2 = "^h\u00a8\u00b3\u008c>\u00bd\u00b5\u001f\u00ceL)M^\u00baE`\u00ef\u00c4\u00db\u00ce2P?\u00bb\u00c8\u0082F\u00ff,\u0012\u00c0\u0010[\u0096Q\u00fc$\u00b1qx\n\u00c3z\u00ad<\u00fb\u0096s \u00d3&\u00fcs\u0083d:\u00bd=/\u00f9\u00d8{=a\u00beW\u0084\u00e5\u00bf\u00cf\u009c$Kx^\u00fc\u0082E'O\u0006".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ak9.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov b(oov oov2) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5EDE;
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
                throw new RuntimeException("ak9", exception);
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
            ak9.e[n2] = ak9.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ak9.a(n, l);
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
            throw new RuntimeException("ak9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ak9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

