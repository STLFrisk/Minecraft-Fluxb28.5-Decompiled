/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.Proxy;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class crb$1
implements Runnable {
    public final sw6 a91;
    public final String _qg;
    public final Proxy mt6;
    public final Map q75;
    public final File nvk;
    public final int qw_;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public crb$1(sw6 sw62, String string, Proxy proxy, Map map, File file, int n) {
        this.a91 = sw62;
        this._qg = string;
        this.mt6 = proxy;
        this.q75 = map;
        this.nvk = file;
        this.qw_ = n;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[TRYBLOCK]], but top level block is 86[WHILELOOP]
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

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                crb$1.a = c.a(1043834787515899762L, 1793575851216026010L, MethodHandles.lookup().lookupClass()).a(166036901833832L);
                crb$1.d = new HashMap<K, V>(13);
                var0 = crb$1.a ^ 19850429477999L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "\u00fd\u001cK\u0014\\\u00d6\u0010\u00ee\u001b\u000e\u00b7\u00fe\u0093\u009aD<%\u0092D9\u00a0\u00d1\u001f\u00ac5\u00d8\u0092%\u00d2\u00c1\u00b1\u0098 \u0081,\u00aa\u001a\u00a2u\u008f\u00c3\u0017\u00e5\u00d4kT\u0096\u00de\u00ad/\u00d0S3]\u0082\u00d6\u0016~\u00aePIF`4G\u0010\u00f5\u009dJ\u00ee\u00d1.\u00cdo\u001b\u001b\u00c3z\u00a7Y\u008b\u00dcP\u00e9\u00be\u001d\u009b\u0094\u00d0b\u00ba;\u00df\u00b5\u00e0\u00cf:\u001f1\u0000z@\u00f8m\u00a4\u00c4$\u00e3?\u0013I\u0013X\u001d\u0000\u00ae]\u00da\u00b5\u001d*\b|\u00e1\u008c\u009d\u00b1\u00ac/\u00bbz\u00dc\u00dc\u000f\u0003\u00fe\u00b3\u008b*,\t3\u0019\u0087;\u00f5\u0092D\u00a8*B\u0017\u0097.M]\u009f\u000b\u001e`QM\u00e4 \u00c8\u00e9\u00ef(\u00ae\u008dA%\u007f\u00dc\u001a\u0018;\u0087}(g\u001e1\u0001\u00e3\u008c~\u009d\u00b61<\u009b\u001fL\b\u001bP\u0015\u0005\u00aenZ\u009a\u00e7\u00c4\u00a8R\u009e\u0015\u00d1\u00e6\u00baeG;~W\u00c8\u00a2\b\u009do\u001f\u00cc\u00c9\u0090\u00f7\u00af=\u00b6~Q\u009c\u0005\u00b1\u0005E\u00b7s`\u0096\u001bC\u0016\u009e\u00165\u0015\u0089\u00a4\u00ca\r\u00fe\u00d6\u001e\u0014\u00bc\u00dfmV\u00ef&g\u00e0\u00fc\u00d5r%\u0017\u00c5\u00ee\u001e\t\u0005\u00c9\u00fe\u001b \u0098\u00cb\u00d0\u00d8\u00f6\u0016<\u0085\u00ebl\u0091\u00a3\u00f4z\u00bc\u0011Pj\u000b\u009b\u0093\u0018\f\u0090Y\u00d4\u0002\u009b;\u00f9\u009f\u00a48Q\u0099\u00f9\u00f2V\u00ce/\u00bf\u008e\u0003\u001e[5\u00a9?\u0097\u00d5\u0091\u001f\u0014\u008c\u000e\f\u009e\u00b9\u00ab\u00ef\u00ef\u00a1R\u009bt{2\u00f9\u00f6\u00d7\u00e4\u00a5\u0083\u0019\u000eK\u00e0\t%\u008bv\u00a8\u00c6B\u0000\u009agB\u00bcX \u00b5/\u008d\u00ad\u00bc\u00cd\u00e7\u0015c\u00c5&\u00a50\u00a8{|M\u00ac\u00b3\u0000;\u00b3\u00e9\u00d4\u00da\u00b3\u0087\u0096t\u00f4U\u009bq?\u00e2\u001a\u00d9\u00d3_\u00ea\u00b5N\r\u00d4\u00b0\u00f2k7\u00e7]\u00c1\\\u00f9\u0015xp\u0016\u00a0\u00cb \u00c5)\u00f8\u00ec\u00b6\u0096b\u0000;\u00ceA\u00d0|\u0090\u00f6\n\u00b51\u00a2jc\u009eN\u0018\u00c7\u00ee\u00ef0\u00d9\u00e3\u000fJ\u00b6D\u0003\u00e6\u00f3s\u00b1-\u00b3}\r3fS\u00aa\u00eaM_}\u00c4\u00e8\u0003~\u00e0\u0080g\u0081s4\u00e4\u00ca\u00bc'\u0094\u0085\f_\u0084\u00a1d\u00a1\u0084S\u001d";
                var8_6 = "\u00fd\u001cK\u0014\\\u00d6\u0010\u00ee\u001b\u000e\u00b7\u00fe\u0093\u009aD<%\u0092D9\u00a0\u00d1\u001f\u00ac5\u00d8\u0092%\u00d2\u00c1\u00b1\u0098 \u0081,\u00aa\u001a\u00a2u\u008f\u00c3\u0017\u00e5\u00d4kT\u0096\u00de\u00ad/\u00d0S3]\u0082\u00d6\u0016~\u00aePIF`4G\u0010\u00f5\u009dJ\u00ee\u00d1.\u00cdo\u001b\u001b\u00c3z\u00a7Y\u008b\u00dcP\u00e9\u00be\u001d\u009b\u0094\u00d0b\u00ba;\u00df\u00b5\u00e0\u00cf:\u001f1\u0000z@\u00f8m\u00a4\u00c4$\u00e3?\u0013I\u0013X\u001d\u0000\u00ae]\u00da\u00b5\u001d*\b|\u00e1\u008c\u009d\u00b1\u00ac/\u00bbz\u00dc\u00dc\u000f\u0003\u00fe\u00b3\u008b*,\t3\u0019\u0087;\u00f5\u0092D\u00a8*B\u0017\u0097.M]\u009f\u000b\u001e`QM\u00e4 \u00c8\u00e9\u00ef(\u00ae\u008dA%\u007f\u00dc\u001a\u0018;\u0087}(g\u001e1\u0001\u00e3\u008c~\u009d\u00b61<\u009b\u001fL\b\u001bP\u0015\u0005\u00aenZ\u009a\u00e7\u00c4\u00a8R\u009e\u0015\u00d1\u00e6\u00baeG;~W\u00c8\u00a2\b\u009do\u001f\u00cc\u00c9\u0090\u00f7\u00af=\u00b6~Q\u009c\u0005\u00b1\u0005E\u00b7s`\u0096\u001bC\u0016\u009e\u00165\u0015\u0089\u00a4\u00ca\r\u00fe\u00d6\u001e\u0014\u00bc\u00dfmV\u00ef&g\u00e0\u00fc\u00d5r%\u0017\u00c5\u00ee\u001e\t\u0005\u00c9\u00fe\u001b \u0098\u00cb\u00d0\u00d8\u00f6\u0016<\u0085\u00ebl\u0091\u00a3\u00f4z\u00bc\u0011Pj\u000b\u009b\u0093\u0018\f\u0090Y\u00d4\u0002\u009b;\u00f9\u009f\u00a48Q\u0099\u00f9\u00f2V\u00ce/\u00bf\u008e\u0003\u001e[5\u00a9?\u0097\u00d5\u0091\u001f\u0014\u008c\u000e\f\u009e\u00b9\u00ab\u00ef\u00ef\u00a1R\u009bt{2\u00f9\u00f6\u00d7\u00e4\u00a5\u0083\u0019\u000eK\u00e0\t%\u008bv\u00a8\u00c6B\u0000\u009agB\u00bcX \u00b5/\u008d\u00ad\u00bc\u00cd\u00e7\u0015c\u00c5&\u00a50\u00a8{|M\u00ac\u00b3\u0000;\u00b3\u00e9\u00d4\u00da\u00b3\u0087\u0096t\u00f4U\u009bq?\u00e2\u001a\u00d9\u00d3_\u00ea\u00b5N\r\u00d4\u00b0\u00f2k7\u00e7]\u00c1\\\u00f9\u0015xp\u0016\u00a0\u00cb \u00c5)\u00f8\u00ec\u00b6\u0096b\u0000;\u00ceA\u00d0|\u0090\u00f6\n\u00b51\u00a2jc\u009eN\u0018\u00c7\u00ee\u00ef0\u00d9\u00e3\u000fJ\u00b6D\u0003\u00e6\u00f3s\u00b1-\u00b3}\r3fS\u00aa\u00eaM_}\u00c4\u00e8\u0003~\u00e0\u0080g\u0081s4\u00e4\u00ca\u00bc'\u0094\u0085\f_\u0084\u00a1d\u00a1\u0084S\u001d".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = crb$1.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "r\u0012\u00b8~\u0004b\u001c\u009c>r$\u00f8]&\u0091\u00b5\u001f\u00b1x\u00ff\u00c3\u00d5nx\u0015Q_\u00d4\u00dd\u0006\u00b2\u00a1\u00cew\u00c0P\u00dfuT# \t\u0085\"{B*\u0006\u00a0<\ts\u0018Qs\u00ac)T\u00a3\u00de\u00f5\u0092\u00a4\u00b2/\"a\u008e;\u00df;\u00a7\u00d2";
                    var8_6 = "r\u0012\u00b8~\u0004b\u001c\u009c>r$\u00f8]&\u0091\u00b5\u001f\u00b1x\u00ff\u00c3\u00d5nx\u0015Q_\u00d4\u00dd\u0006\u00b2\u00a1\u00cew\u00c0P\u00dfuT# \t\u0085\"{B*\u0006\u00a0<\ts\u0018Qs\u00ac)T\u00a3\u00de\u00f5\u0092\u00a4\u00b2/\"a\u008e;\u00df;\u00a7\u00d2".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = crb$1.a(var10_9).intern();
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
        crb$1.b = var9_3;
        crb$1.c = new String[12];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E7F;
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
                throw new RuntimeException("crb$1", exception);
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
            crb$1.c[n2] = crb$1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = crb$1.a(n, l);
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
            throw new RuntimeException("crb$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(crb$1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

