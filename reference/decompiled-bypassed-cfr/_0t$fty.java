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

public final class _0t$fty
extends Enum
implements v4k {
    public static final _0t$fty usm;
    public static final _0t$fty ewf;
    public static final _0t$fty cqa;
    public static final _0t$fty p2o;
    public static final _0t$fty d5e;
    public static final _0t$fty hnr;
    public static final _0t$fty q5b;
    public static final _0t$fty zoq;
    private static final _0t$fty[] q_m;
    private final int g4_;
    private final String ty5;
    private final vt2 f7n;
    private static final _0t$fty[] zk8;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static _0t$fty[] values() {
        return (_0t$fty[])zk8.clone();
    }

    public static _0t$fty valueOf(String string) {
        return Enum.valueOf(_0t$fty.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _0t$fty(vt2 vt22) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.g4_ = (int)vt22;
        this.ty5 = var4_2;
        this.f7n = var5_3;
    }

    public int yg6() {
        return this.g4_;
    }

    public vt2 pt5() {
        return this.f7n;
    }

    public String toString() {
        return this.ty5;
    }

    public static _0t$fty v1t(int n) {
        block10: {
            int n2;
            block8: {
                int n3 = t9d.b();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n2 = n;
                                    if (n3 == 0) break block8;
                                    if (n2 < 0) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw _0t$fty.a(illegalArgumentException);
                                }
                                n2 = n;
                                if (n3 == 0) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw _0t$fty.a(illegalArgumentException);
                            }
                            if (n2 < q_m.length) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _0t$fty.a(illegalArgumentException);
                        }
                    }
                    n2 = 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _0t$fty.a(illegalArgumentException);
                }
            }
            n = n2;
        }
        return q_m[n];
    }

    /*
     * Exception decompiling
     */
    public static _0t$fty _h_(vt2 var0, vt2 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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
    public String mo3() {
        return this.ty5;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                _0t$fty.a = c.a(-7322326776306692959L, -2253783713769446894L, MethodHandles.lookup().lookupClass()).a(64564581784500L);
                var9 = _0t$fty.a ^ 128822936336515L;
                _0t$fty.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[21];
                var5_4 = 0;
                var4_5 = "\u00d4\u00aa<X\u00e2\u00c5\u00d0:\b\u001eg\u001ai\u00852f(\u00bb\u0085\u0089P\u0001*U\u00f2&\u009bC\u0080E\u00d7\u00f1\u0010jGy\u00bf\u00ec\u0014\u008cL\u00c9\u000fbw*a0}\u0091\u00f6>dC\u0017\u00df\u001a(X\u0090\u0084\u00cc\u00c9\u0093\u00c7\u00e6X+\u00f8\u00fbG}3<o\u00db\u00d6\u00c9=\u00a2W\u00a1\u009dh\u00f8Z\u00dalD\u0013;\u00aa\u00ce\u00bc\u00b9\u00cc>F\u0010*\u00e0\u00f7y\u00aeDa\u0095\u00e7\u00d6=\u00ed\u00ee\u00beId\u0010\u008f\u000b\u009c\u00adH\u00da\u009b\u00cdB\u0011hh\u00d1\u00f4\u0003r\u0010\u00f4E\u00bdJ\u00c2w=l(\u008b\u00b8\u00a5\t$^\u00e4\u0010)\u00c0\u00cf\u0095[m\u009a\u007f\u0005\u007f\u00b0p\u00b4S\u00ed\u00b8\u0010\u00ac\u008c\u00c5Q\u008f\"\t>C\f\u00bd\u008b\u00fe\u0081t\u001b\u0010\u0099'\r\u00d5}\f\u0097\u00900\u0091\u000f5X\u0084\u00a8|(\u00ff\u00ac\u0084\u0091\u00ac\u00d9\u00ff^E;\u00ae\u00d7\u008e~\u00f3\u00a6+o\u00f6{\u00d3F\u00a4\u00f5\u00f7\u008f\u00c8Ogf\u00d1\u00ba\u0006\u00b8\u00c0pfm.k\u0010\u000b\u0001\u0097\u00dd\u00d0\u00f2s\u0012\t\u0016@$\u001a\u00f2\b\u00d7\u0018~\u008a\u0082c\u00f9u\u0017Rx[\u00a9\u00b7\u0018\u00ce{\n\u00f3\u009f\u00b2Fc\u00a3\u0089\u00b9\u0010\u00c5w\u00b1\u0083\u0004pJ6]\u00d7\u00a6\u00bc\u00a3\u0003`\u00e7\u0010\u00cc\u00d9~L\u00ba\u0082\u00dd\u0015V4I9M\u00e0\u00f4\u00b8\u0010\u0086\u0005j&\u0010r\u0007\u00be~\u00e1\u0097\u00b4X\u00d6\u00ea\u0017\u0010]\u00aetF\b\u0081H\u00f4\u00c0h\u00d3D\u00aat\u00cc\u00ec\u0010\u00d1Nyl\u0083\u00d1{A\u00a8\u0001M\u008f\u000b<\u00ab#\u0010\u009b{\u00a6\u00e0\u00c7\u00ce\u008a\u0005\u00027.\u00b3\re'V\u0018\u00b5\u00f8:Q\u00d3R\u00b7\u00cb *\u00c3\u008cU\u00a0/h\u0082/\u00e4\f\u00dd.L3";
                var6_6 = "\u00d4\u00aa<X\u00e2\u00c5\u00d0:\b\u001eg\u001ai\u00852f(\u00bb\u0085\u0089P\u0001*U\u00f2&\u009bC\u0080E\u00d7\u00f1\u0010jGy\u00bf\u00ec\u0014\u008cL\u00c9\u000fbw*a0}\u0091\u00f6>dC\u0017\u00df\u001a(X\u0090\u0084\u00cc\u00c9\u0093\u00c7\u00e6X+\u00f8\u00fbG}3<o\u00db\u00d6\u00c9=\u00a2W\u00a1\u009dh\u00f8Z\u00dalD\u0013;\u00aa\u00ce\u00bc\u00b9\u00cc>F\u0010*\u00e0\u00f7y\u00aeDa\u0095\u00e7\u00d6=\u00ed\u00ee\u00beId\u0010\u008f\u000b\u009c\u00adH\u00da\u009b\u00cdB\u0011hh\u00d1\u00f4\u0003r\u0010\u00f4E\u00bdJ\u00c2w=l(\u008b\u00b8\u00a5\t$^\u00e4\u0010)\u00c0\u00cf\u0095[m\u009a\u007f\u0005\u007f\u00b0p\u00b4S\u00ed\u00b8\u0010\u00ac\u008c\u00c5Q\u008f\"\t>C\f\u00bd\u008b\u00fe\u0081t\u001b\u0010\u0099'\r\u00d5}\f\u0097\u00900\u0091\u000f5X\u0084\u00a8|(\u00ff\u00ac\u0084\u0091\u00ac\u00d9\u00ff^E;\u00ae\u00d7\u008e~\u00f3\u00a6+o\u00f6{\u00d3F\u00a4\u00f5\u00f7\u008f\u00c8Ogf\u00d1\u00ba\u0006\u00b8\u00c0pfm.k\u0010\u000b\u0001\u0097\u00dd\u00d0\u00f2s\u0012\t\u0016@$\u001a\u00f2\b\u00d7\u0018~\u008a\u0082c\u00f9u\u0017Rx[\u00a9\u00b7\u0018\u00ce{\n\u00f3\u009f\u00b2Fc\u00a3\u0089\u00b9\u0010\u00c5w\u00b1\u0083\u0004pJ6]\u00d7\u00a6\u00bc\u00a3\u0003`\u00e7\u0010\u00cc\u00d9~L\u00ba\u0082\u00dd\u0015V4I9M\u00e0\u00f4\u00b8\u0010\u0086\u0005j&\u0010r\u0007\u00be~\u00e1\u0097\u00b4X\u00d6\u00ea\u0017\u0010]\u00aetF\b\u0081H\u00f4\u00c0h\u00d3D\u00aat\u00cc\u00ec\u0010\u00d1Nyl\u0083\u00d1{A\u00a8\u0001M\u008f\u000b<\u00ab#\u0010\u009b{\u00a6\u00e0\u00c7\u00ce\u008a\u0005\u00027.\u00b3\re'V\u0018\u00b5\u00f8:Q\u00d3R\u00b7\u00cb *\u00c3\u008cU\u00a0/h\u0082/\u00e4\f\u00dd.L3".length();
                var3_7 = 16;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block12;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = _0t$fty.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00a7I\u0091\u00b5L\u00b1u\u008d\u0094\u00f4\u0019\u008d\u00e0>o`\u0010\u001d\u00b0\n\u0090V\u007f\u001cF\u00c3\u008cD\u0019\u00c2&]\u0097";
                    var6_6 = "\u00a7I\u0091\u00b5L\u00b1u\u008d\u0094\u00f4\u0019\u008d\u00e0>o`\u0010\u001d\u00b0\n\u0090V\u007f\u001cF\u00c3\u008cD\u0019\u00c2&]\u0097".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block12;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = _0t$fty.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block13;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        _0t$fty.b = var7_3;
        _0t$fty.c = new String[21];
        _0t$fty.usm = new _0t$fty((String)_0t$fty.a("h", (int)12378, (long)(4748448670892309738L ^ var9)), 0, 0, (String)_0t$fty.a("h", (int)30266, (long)(740489272187386521L ^ var9)), vt2.m3r);
        _0t$fty.ewf = new _0t$fty((String)_0t$fty.a("h", (int)1313, (long)(7447604327815907713L ^ var9)), 1, 1, (String)_0t$fty.a("h", (int)15337, (long)(7364576702058968904L ^ var9)), vt2.zk4);
        _0t$fty.cqa = new _0t$fty((String)_0t$fty.a("h", (int)25692, (long)(6802251425048652006L ^ var9)), 2, 2, (String)_0t$fty.a("h", (int)22113, (long)(8210588815901121238L ^ var9)), vt2.te4);
        _0t$fty.p2o = new _0t$fty((String)_0t$fty.a("h", (int)1207, (long)(4497615290304497683L ^ var9)), 3, 3, (String)_0t$fty.a("h", (int)14986, (long)(4405724488079291959L ^ var9)), vt2.mxp);
        _0t$fty.d5e = new _0t$fty((String)_0t$fty.a("h", (int)31535, (long)(2536249539680466843L ^ var9)), 4, 4, (String)_0t$fty.a("h", (int)15992, (long)(5073694584466715334L ^ var9)), vt2.z9q);
        _0t$fty.hnr = new _0t$fty((String)_0t$fty.a("h", (int)27579, (long)(4646518732084635395L ^ var9)), 5, 5, (String)_0t$fty.a("h", (int)31662, (long)(5986524781818279707L ^ var9)), vt2.rf3);
        _0t$fty.q5b = new _0t$fty((String)_0t$fty.a("h", (int)26903, (long)(7966217374161626536L ^ var9)), 6, 6, (String)_0t$fty.a("h", (int)933, (long)(6029235231537893139L ^ var9)), vt2.rf3);
        _0t$fty.zoq = new _0t$fty((String)_0t$fty.a("h", (int)14431, (long)(3233041284186518755L ^ var9)), 7, 7, (String)_0t$fty.a("h", (int)3652, (long)(9051017857084228343L ^ var9)), vt2.m3r);
        _0t$fty.zk8 = new _0t$fty[]{_0t$fty.usm, _0t$fty.ewf, _0t$fty.cqa, _0t$fty.p2o, _0t$fty.d5e, _0t$fty.hnr, _0t$fty.q5b, _0t$fty.zoq};
        _0t$fty.q_m = new _0t$fty[_0t$fty.values().length];
        var11_10 = _0t$fty.values();
        var12_11 = var11_10.length;
        for (var13_12 = 0; var13_12 < var12_11; ++var13_12) {
            _0t$fty.q_m[var14_13.yg6()] = var14_13 = var11_10[var13_12];
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBFA;
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
                throw new RuntimeException("_0t$fty", exception);
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
            _0t$fty.c[n2] = _0t$fty.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _0t$fty.a(n, l);
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
            throw new RuntimeException("_0t$fty" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_0t$fty.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

