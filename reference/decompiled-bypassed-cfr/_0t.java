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

public class _0t
extends e0x {
    public static final zb_ b1t;
    public static final h76 cle;
    private static final long b;
    private static final String[] d;
    private static final String[] h;
    private static final Map i;

    public _0t() {
        super(p3y.f20);
        this.y8l(this._8_.c32().zvi(b1t, (Comparable)((Object)_0t$fty.d5e)).zvi(cle, Boolean.valueOf(false)));
        this.i3l(uja.yj_);
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        return null;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean d9o(t9d t9d2, mew mew2, vt2 vt22) {
        return _0t.g1d(t9d2, mew2, vt22.b4b());
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block8: {
            vt2[] vt2Array = vt2.values();
            int n = vt2Array.length;
            int n2 = t9d.b();
            int n3 = 0;
            while (n3 < n) {
                block7: {
                    block9: {
                        vt2 vt22 = vt2Array[n3];
                        try {
                            try {
                                try {
                                    if (n2 == 0) break block7;
                                    bl = _0t.g1d(t9d2, mew2, vt22);
                                    if (n2 == 0) break block8;
                                }
                                catch (oov oov2) {
                                    throw _0t.a(oov2);
                                }
                                if (!bl) break block9;
                            }
                            catch (oov oov3) {
                                throw _0t.a(oov3);
                            }
                            return true;
                        }
                        catch (oov oov4) {
                            throw _0t.a(oov4);
                        }
                    }
                    ++n3;
                }
                if (n2 != 0) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean g1d(t9d t9d2, mew mew2, vt2 vt22) {
        return wzi.bnn(t9d2, mew2, vt22);
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        zfz zfz2;
        block13: {
            int n2 = t9d.c();
            zfz2 = this.l4i().zvi(cle, Boolean.valueOf(false));
            try {
                if (_0t.g1d(t9d2, mew2, vt22.b4b())) {
                    return zfz2.zvi(b1t, (Comparable)((Object)_0t$fty._h_(vt22, g_32.u0f())));
                }
            }
            catch (oov oov2) {
                throw _0t.a(oov2);
            }
            for (vt2 vt23 : vt2$unz.fzl) {
                block14: {
                    try {
                        try {
                            try {
                                if (n2 != 0) break block13;
                                if (vt23 == vt22) break block14;
                            }
                            catch (oov oov3) {
                                throw _0t.a(oov3);
                            }
                            if (!_0t.g1d(t9d2, mew2, vt23.b4b())) break block14;
                        }
                        catch (oov oov4) {
                            throw _0t.a(oov4);
                        }
                        return zfz2.zvi(b1t, (Comparable)((Object)_0t$fty._h_(vt23, g_32.u0f())));
                    }
                    catch (oov oov5) {
                        throw _0t.a(oov5);
                    }
                }
                if (n2 == 0) continue;
            }
            try {
                if (t9d.r3_(t9d2, mew2.eve())) {
                    return zfz2.zvi(b1t, (Comparable)((Object)_0t$fty._h_(vt2.rf3, g_32.u0f())));
                }
            }
            catch (oov oov6) {
                throw _0t.a(oov6);
            }
        }
        return zfz2;
    }

    /*
     * Exception decompiling
     */
    public static int o2_(vt2 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block9: {
            boolean bl;
            int n;
            block8: {
                n = t9d.b();
                try {
                    try {
                        bl = this.ogk(t9d2, mew2, zfz2);
                        if (n == 0) break block8;
                        if (!bl) break block9;
                    }
                    catch (oov oov2) {
                        throw _0t.a(oov2);
                    }
                    bl = _0t.g1d(t9d2, mew2, ((_0t$fty)((Object)zfz2.dil(b1t))).pt5().b4b());
                }
                catch (oov oov3) {
                    throw _0t.a(oov3);
                }
            }
            try {
                try {
                    if (n == 0 || bl) break block9;
                }
                catch (oov oov4) {
                    throw _0t.a(oov4);
                }
                this.lf0(t9d2, mew2, zfz2, 0);
                bl = t9d2.i6x(mew2);
            }
            catch (oov oov5) {
                throw _0t.a(oov5);
            }
        }
    }

    private boolean ogk(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.ctq(t9d2, mew2);
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw _0t.a(oov2);
                    }
                    return true;
                }
                catch (oov oov3) {
                    throw _0t.a(oov3);
                }
            }
            this.lf0(t9d2, mew2, zfz2, 0);
            t9d2.i6x(mew2);
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void c7i(m5n var1_1, mew var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        float f4;
        float f5;
        CallSite callSite;
        double d;
        double d2;
        double d3;
        t9d t9d3;
        block9: {
            block8: {
                long l;
                block6: {
                    boolean bl;
                    block7: {
                        l = b ^ 0x7A293CE72194L;
                        int n = t9d.b();
                        try {
                            try {
                                bl = t9d2.v0f;
                                if (n == 0) break block6;
                                if (!bl) break block7;
                            }
                            catch (oov oov2) {
                                throw _0t.a(oov2);
                            }
                            return true;
                        }
                        catch (oov oov3) {
                            throw _0t.a(oov3);
                        }
                    }
                    zfz2 = zfz2.dm4(cle);
                    bl = t9d2.vct(mew2, zfz2, 3);
                }
                try {
                    t9d3 = t9d2;
                    d3 = (double)mew2.getX() + 0.5;
                    d2 = (double)mew2.getY() + 0.5;
                    d = (double)mew2.getZ() + 0.5;
                    callSite = _0t.b("d", (int)4427, (long)(0x15EB5B89363D2F62L ^ l));
                    f5 = 0.3f;
                    if (!((Boolean)zfz2.dil(cle)).booleanValue()) break block8;
                    f4 = 0.6f;
                    break block9;
                }
                catch (oov oov4) {
                    throw _0t.a(oov4);
                }
            }
            f4 = 0.5f;
        }
        t9d3.amg(d3, d2, d, (String)((Object)callSite), f5, f4);
        t9d2._0o(mew2, this);
        vt2 vt23 = ((_0t$fty)((Object)zfz2.dil(b1t))).pt5();
        t9d2._0o(mew2.offset(vt23.b4b()), this);
        return true;
    }

    @Override
    public void b8f(t9d t9d2, mew mew2, zfz zfz2) {
        block5: {
            Comparable<Boolean> comparable;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        comparable = (Boolean)zfz2.dil(cle);
                        if (n != 0) break block4;
                        if (!comparable.booleanValue()) break block5;
                    }
                    catch (oov oov2) {
                        throw _0t.a(oov2);
                    }
                    t9d2._0o(mew2, this);
                    comparable = zfz2.dil(b1t);
                }
                catch (oov oov3) {
                    throw _0t.a(oov3);
                }
            }
            vt2 vt22 = ((_0t$fty)((Object)comparable)).pt5();
            t9d2._0o(mew2.offset(vt22.b4b()), this);
        }
        super.b8f(t9d2, mew2, zfz2);
    }

    @Override
    public int gpi(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        int n;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    n = ((Boolean)zfz2.dil(cle)).booleanValue();
                    if (n2 == 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw _0t.a(oov2);
                }
                n = 15;
                break block2;
            }
            n = 0;
        }
        return n;
    }

    @Override
    public int sqt(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        int n;
        block8: {
            Comparable<Boolean> comparable;
            block6: {
                block7: {
                    int n2 = t9d.c();
                    try {
                        try {
                            comparable = (Boolean)zfz2.dil(cle);
                            if (n2 != 0) break block6;
                            if (comparable.booleanValue()) break block7;
                        }
                        catch (oov oov2) {
                            throw _0t.a(oov2);
                        }
                        n = 0;
                        break block8;
                    }
                    catch (oov oov3) {
                        throw _0t.a(oov3);
                    }
                }
                comparable = zfz2.dil(b1t);
            }
            try {
                n = ((_0t$fty)((Object)comparable)).pt5() == vt22 ? 15 : 0;
            }
            catch (oov oov4) {
                throw _0t.a(oov4);
            }
        }
        return n;
    }

    @Override
    public boolean scl() {
        return true;
    }

    @Override
    public zfz kig(int n) {
        boolean bl;
        h76 h762;
        zfz zfz2;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    zfz2 = this.l4i().zvi(b1t, (Comparable)((Object)_0t$fty.v1t(n & 7)));
                    h762 = cle;
                    bl = n & 8;
                    if (n2 == 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw _0t.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return zfz2.zvi(h762, Boolean.valueOf(bl));
    }

    @Override
    public int hvp(zfz zfz2) {
        int n;
        block2: {
            int n2;
            block3: {
                n2 = 0;
                n2 |= ((_0t$fty)((Object)zfz2.dil(b1t))).yg6();
                int n3 = t9d.b();
                try {
                    n = ((Boolean)zfz2.dil(cle)).booleanValue();
                    if (n3 == 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw _0t.a(oov2);
                }
                n2 |= 8;
            }
            n = n2;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{b1t, cle});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        b = c.a(3655551642961472064L, 4463243177752196135L, MethodHandles.lookup().lookupClass()).a(235221438173312L);
        long l = b ^ 0x2B06A7A7F136L;
        i = new HashMap(13);
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
        String string = "\u00d2-\u00eb\u0002\u00ec\u009a3i\u00dc\u008d\u00ad\u00a4\u00caO\u00cf\u00f1\u0010\u00c3\u008a\u00cf'$\u0093E\u0012\u0014\u00d5u\u009d=\u0005\u00b2e\u0018NY\u0016f\u00f3v\u0093\u00d3\u00b1)T6\u0095\n\u00b4#\u00ca\u00a3\u00cc|\u0011\u0002\u00e0\u0092";
        int n2 = "\u00d2-\u00eb\u0002\u00ec\u009a3i\u00dc\u008d\u00ad\u00a4\u00caO\u00cf\u00f1\u0010\u00c3\u008a\u00cf'$\u0093E\u0012\u0014\u00d5u\u009d=\u0005\u00b2e\u0018NY\u0016f\u00f3v\u0093\u00d3\u00b1)T6\u0095\n\u00b4#\u00ca\u00a3\u00cc|\u0011\u0002\u00e0\u0092".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0t.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                h = new String[3];
                b1t = zb_.pq4((String)((Object)_0t.b("d", (int)11399, (long)(0x7436002A3DC5420EL ^ l))), _0t$fty.class);
                cle = h76.d_1((String)((Object)_0t.b("d", (int)11388, (long)(0x741AB03DF27A42F4L ^ l))));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x169E;
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
                throw new RuntimeException("_0t", exception);
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
            _0t.h[n2] = _0t.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _0t.b(n, l);
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
            throw new RuntimeException("_0t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0t.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

