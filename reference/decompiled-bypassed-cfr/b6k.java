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
import java.net.InetSocketAddress;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;

public class b6k
extends gbe {
    public static InetSocketAddress hjm;
    private /* synthetic */ gbe j0c;
    private /* synthetic */ jqk nru;
    private /* synthetic */ String sr3;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public b6k(gbe gbe2) {
        this.j0c = gbe2;
    }

    @Override
    public void initGui() {
        long l = a ^ 0x129CE2511985L;
        this.khf.clear();
        this.nru = new jqk(0, c05.vz1().tx1, this.dt7 / 2 - 100, this.o1e / 4 + 20, 200, 20);
        this.nru.z5t(250);
        this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 70, (String)((Object)b6k.b("s", (int)18472, (long)(0xCC1135807DAD668L ^ l)))));
        this.khf.add(new gt4(2, this.dt7 / 2 - 100, this.o1e / 4 + 95, (String)((Object)b6k.b("s", (int)20729, (long)(0x11478122B945CEBFL ^ l)))));
        Keyboard.enableRepeatEvents((boolean)true);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void actionPerformed(gt4 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 2[TRYBLOCK]
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
    public void dig(char c2, int n) {
        block5: {
            b6k b6k2;
            block4: {
                int n2 = t9d.c();
                try {
                    try {
                        b6k2 = this;
                        if (n2 != 0) break block4;
                        b6k2.nru.pst(c2, n);
                        if (n != 1) break block5;
                    }
                    catch (oov oov2) {
                        throw b6k.a(oov2);
                    }
                    b6k2 = this;
                }
                catch (oov oov3) {
                    throw b6k.a(oov3);
                }
            }
            b6k2.f41.z2i(this.j0c);
        }
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        this.nru.elk(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }

    @Override
    public void updateScreen() {
        this.nru.zf9();
        super.updateScreen();
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        b6k b6k2;
        block8: {
            block9: {
                Object object;
                long l = a ^ 0xAC6BC0DC2BAL;
                this.xmz();
                int n3 = t9d.c();
                this.poi(c05.vz1().tx1, (String)((Object)b6k.b("s", (int)9535, (long)(0x61F1116E96EE6041L ^ l))), this.dt7 / 2, 48, -1);
                int n4 = n3;
                try {
                    this.nru.dy2();
                    this.c_t(c05.vz1().tx1, (String)((Object)b6k.b("s", (int)8194, (long)(0x5E79B0DE27AEE57AL ^ l))), this.dt7 / 2 - 100, this.o1e / 4 + 8, -1);
                    if (hjm == null) {
                        object = b6k.b("s", (int)22280, (long)(0x1EA03B022BDA9274L ^ l));
                    }
                }
                catch (oov oov2) {
                    throw b6k.a(oov2);
                }
                object = hjm.getHostString() + ":" + hjm.getPort();
                CallSite callSite = object;
                try {
                    try {
                        this.poi(c05.vz1().tx1, (String)((Object)b6k.b("s", (int)10261, (long)(0x373204A6A53C6D68L ^ l))) + (String)((Object)callSite), this.dt7 / 2, 12, -1);
                        b6k2 = this;
                        if (n4 != 0) break block8;
                        if (jfy.hez(b6k2.sr3)) break block9;
                    }
                    catch (oov oov3) {
                        throw b6k.a(oov3);
                    }
                    this.poi(c05.vz1().tx1, this.sr3, this.dt7 / 2, 24, 0xFF0000);
                }
                catch (oov oov4) {
                    throw b6k.a(oov4);
                }
            }
            b6k2 = this;
        }
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

                b6k.a = c.a(5460021618912408782L, 4906817706083025125L, MethodHandles.lookup().lookupClass()).a(239520593228957L);
                b6k.h = new HashMap<K, V>(13);
                var0 = b6k.a ^ 1431990701826L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u00165\u00db5_\u0002\u00b9]\u00e5O\u00a1\u008c\u00f7\u00a1<\u00c2(\u00cd\u00b5\u0019\u0017\u008f;0\u0081\u008a8\u0084\u0006\u00a8?\u00ad\u00fbo\u000e\u009d9\u0098\u00f2\u00ce\u00ab\u00c5t\u0007\u00a2O^\u0090e\u00b0\u00c3\u009a)[e070?\u00cd\u00fb\u009f\u00afB\u0010A\u00d1:3\u00e54\u00a7E\u00a1\u00fal\u00d0\u00b20ne]0\u00c3\u00e1\u00a2I<Y\u00c6\u0005\u0091\u00ff@\n0\u0003\u00b5\u0096\u00ff\u00dfD\r\u0015\u00dd\u0089\u0010\u000b\u00e5Z\u00bf\u00fa\u00b3\u0082\u001e\u00c6\u0001Y\u00af\u009c\u00df\u00c1\u008a";
                var8_6 = "\u00165\u00db5_\u0002\u00b9]\u00e5O\u00a1\u008c\u00f7\u00a1<\u00c2(\u00cd\u00b5\u0019\u0017\u008f;0\u0081\u008a8\u0084\u0006\u00a8?\u00ad\u00fbo\u000e\u009d9\u0098\u00f2\u00ce\u00ab\u00c5t\u0007\u00a2O^\u0090e\u00b0\u00c3\u009a)[e070?\u00cd\u00fb\u009f\u00afB\u0010A\u00d1:3\u00e54\u00a7E\u00a1\u00fal\u00d0\u00b20ne]0\u00c3\u00e1\u00a2I<Y\u00c6\u0005\u0091\u00ff@\n0\u0003\u00b5\u0096\u00ff\u00dfD\r\u0015\u00dd\u0089\u0010\u000b\u00e5Z\u00bf\u00fa\u00b3\u0082\u001e\u00c6\u0001Y\u00af\u009c\u00df\u00c1\u008a".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = b6k.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "D!\u0015\u00d1\u00e7\u0095\u00bf\u00c9H\u009e\u00f9\u00be\u00f7\b\u009b\u008c\u0010\u008c\u008f}\u00dd\u00a9\u00b7l-\u00a7A\u0092\u00d5\u00e7 ;\u0016";
                    var8_6 = "D!\u0015\u00d1\u00e7\u0095\u00bf\u00c9H\u009e\u00f9\u00be\u00f7\b\u009b\u008c\u0010\u008c\u008f}\u00dd\u00a9\u00b7l-\u00a7A\u0092\u00d5\u00e7 ;\u0016".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = b6k.a(var10_9).intern();
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
        b6k.b = var9_3;
        b6k.g = new String[6];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x654E;
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
                throw new RuntimeException("b6k", exception);
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
            b6k.g[n2] = b6k.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b6k.b(n, l);
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
            throw new RuntimeException("b6k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b6k.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

