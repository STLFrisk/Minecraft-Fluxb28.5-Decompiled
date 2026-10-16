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
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordUser;

public class c7u
extends Thread {
    public static final String dim;
    public boolean k3k = false;
    public String wjd;
    public String trp;
    public q6h nh1 = new q6h();
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public int wq_() {
        return (int)kgt.vuo.stream().filter(ar7::klu).count();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [26[DOLOOP]], but top level block is 11[TRYBLOCK]
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

    private void rpv(DiscordUser discordUser) {
        long l = a ^ 0x632FFE17CEBDL;
        System.out.println((String)((Object)c7u.a("i", (int)8445, (long)(0x563CD261A0948D1BL ^ l))) + discordUser.username + "#" + discordUser.discriminator + ".");
        this.k3k = true;
    }

    private void w8_() {
        long l = a ^ 0x3F954B3D55BEL;
        System.out.println((String)((Object)c7u.a("i", (int)22139, (long)(0x1574DF879268E09DL ^ l))));
        this.k3k = false;
        DiscordRPC.discordShutdown();
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

                c7u.a = c.a(-8032813046990449091L, -4813903177468052867L, MethodHandles.lookup().lookupClass()).a(61942373803159L);
                c7u.d = new HashMap<K, V>(13);
                var0 = c7u.a ^ 113868116681577L;
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
                var9_3 = new String[14];
                var7_4 = 0;
                var6_5 = "\u00ceH\u00f0e+U\u000e\u00ceJ\u00f2\u00b7@\u00b4z/\\&\u00f0\u00e6Q)\u0095\u00d2l\u0001,\u00cb\u00f3\u00ed\u00b7\u00ee\u001c\u0018\u00b3-kn{E\u00c5\u0017R\u00e2k\u0083\n\u0099\u00d2?\u00f3UD$\u0094\u00ad\u00ab_ i\u00d5\u00d3\u00b0P+%~]\u0097\u00db\u00b6\u00c9\u00b3\u001c\u001d\u00d6\u00bb\u0004IDt\u0012\u00d5;r\u00a4\u00c2TM\u00af\u009e(\u00ea\u00b8 \u00f4V\u0018'\u00e3\u00f0\u00fb\u0007\u00ff\u00c0\u00de{\u009c#$\u0011R\u00f6^\u00fa\u0016\u0000/r\u00edI\u00b7V\u00feX\u00ddk\u00e3\u0012\u00f6\u00c9~(a\u001a~\u007fW\u0085\u008ed\u00a5\u00bf\u00ee\u0014X\u0001\\\u008eo\u000bD\u009aT\u00f43\u000b\u00cc\u00e3\u008f\u00e7Kc\u00e9\u0013\u0090]\u0012\u00aa]Q]\u00aa\u0018\u00feV\u0098\u00f1\u0086eG\t\u00ea\u00ca\u00a9^N\u009c\u00f7\u008ey\u00b5T\u00e2\u00b4\u00abQ\u0001(ua\u009f\u00d1X\u00bd\u00bf!:\u0087\u00balvy)N\u00dd\u00c4\u00e4f\u00bc-\u00e14Y\u00ffF\u00b30\b\u00e3\u0088`\u00dc\u00f7\u000e\u0083\rW\u009a \u008fx\u0087\u00c2s\u009f3n\u0085,zS\u0083*\u0097[|\u00eb\u00f0\u00e9l\u009f\u00ed\u007fz\u00c0Yo\"\u00d8\t\u00e9\u0010\u00c3\u00d9\u00a2Z\u00fd\\\u0098\u00c1`T|\u008e\u001d\u00b2J\u000b\u0010^\u0085\u0082J\u00a1\u00e8\u00eb`\u00f6)]\u001bV\u001a.G(\u001b\u001bL2\u008fTS\u00049\u00b2\u0081\u00e3*\u0015\u00fd~\u0083\u0012\u00e8\u0016f\u0019\u0001\u00ac\u00d4\u00e8\u00bc\u00f9\u00a04\u00c6\u0086\u00f5\u00b27\u001d\u001d\b2\u009b\u0018\u00f2\u00e4\u0080H\u001a\u001c\u00e7\u00c2\b9\u00a2\u00cfq\u009b]\u0082,\u0096\u00cbd\u00c5H!\u00ec";
                var8_6 = "\u00ceH\u00f0e+U\u000e\u00ceJ\u00f2\u00b7@\u00b4z/\\&\u00f0\u00e6Q)\u0095\u00d2l\u0001,\u00cb\u00f3\u00ed\u00b7\u00ee\u001c\u0018\u00b3-kn{E\u00c5\u0017R\u00e2k\u0083\n\u0099\u00d2?\u00f3UD$\u0094\u00ad\u00ab_ i\u00d5\u00d3\u00b0P+%~]\u0097\u00db\u00b6\u00c9\u00b3\u001c\u001d\u00d6\u00bb\u0004IDt\u0012\u00d5;r\u00a4\u00c2TM\u00af\u009e(\u00ea\u00b8 \u00f4V\u0018'\u00e3\u00f0\u00fb\u0007\u00ff\u00c0\u00de{\u009c#$\u0011R\u00f6^\u00fa\u0016\u0000/r\u00edI\u00b7V\u00feX\u00ddk\u00e3\u0012\u00f6\u00c9~(a\u001a~\u007fW\u0085\u008ed\u00a5\u00bf\u00ee\u0014X\u0001\\\u008eo\u000bD\u009aT\u00f43\u000b\u00cc\u00e3\u008f\u00e7Kc\u00e9\u0013\u0090]\u0012\u00aa]Q]\u00aa\u0018\u00feV\u0098\u00f1\u0086eG\t\u00ea\u00ca\u00a9^N\u009c\u00f7\u008ey\u00b5T\u00e2\u00b4\u00abQ\u0001(ua\u009f\u00d1X\u00bd\u00bf!:\u0087\u00balvy)N\u00dd\u00c4\u00e4f\u00bc-\u00e14Y\u00ffF\u00b30\b\u00e3\u0088`\u00dc\u00f7\u000e\u0083\rW\u009a \u008fx\u0087\u00c2s\u009f3n\u0085,zS\u0083*\u0097[|\u00eb\u00f0\u00e9l\u009f\u00ed\u007fz\u00c0Yo\"\u00d8\t\u00e9\u0010\u00c3\u00d9\u00a2Z\u00fd\\\u0098\u00c1`T|\u008e\u001d\u00b2J\u000b\u0010^\u0085\u0082J\u00a1\u00e8\u00eb`\u00f6)]\u001bV\u001a.G(\u001b\u001bL2\u008fTS\u00049\u00b2\u0081\u00e3*\u0015\u00fd~\u0083\u0012\u00e8\u0016f\u0019\u0001\u00ac\u00d4\u00e8\u00bc\u00f9\u00a04\u00c6\u0086\u00f5\u00b27\u001d\u001d\b2\u009b\u0018\u00f2\u00e4\u0080H\u001a\u001c\u00e7\u00c2\b9\u00a2\u00cfq\u009b]\u0082,\u0096\u00cbd\u00c5H!\u00ec".length();
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
                    var9_3[var7_4++] = c7u.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ec\u001a\u00f0@\u00f4\u00d0\u00a0s-f\u0085k\u00c8Q\u0091q`\u00df\u00bcd*jU\u0085\u0016\u00f4\u00cf\u00a7\u00e7u+\u00c9]?M\u00baO\u008a\u000b\u00cal\u001e/n\u0098\u00f5F\u00efq\n}&L^<\u0001 B\u00f9\u0002\u0018\u00ea\u00ff\\\u00c6~|\u00bf5\u0019\u00a6\u00cfp~\u008f\u0000\u0091\u009c|\u00ef\u0090\u00be\u00f0\u00ca\u00c0_\u00e3\u00bb\u009f\u00e7\u00e7^\u00fa\u00fa\u00e7\u00e5jw\u00e7H\u00de\u00c2\u00a9\u00ce\u001fX\u00fa\u00f8\u0019\u0000\u0013\u0096\u00fa";
                    var8_6 = "\u00ec\u001a\u00f0@\u00f4\u00d0\u00a0s-f\u0085k\u00c8Q\u0091q`\u00df\u00bcd*jU\u0085\u0016\u00f4\u00cf\u00a7\u00e7u+\u00c9]?M\u00baO\u008a\u000b\u00cal\u001e/n\u0098\u00f5F\u00efq\n}&L^<\u0001 B\u00f9\u0002\u0018\u00ea\u00ff\\\u00c6~|\u00bf5\u0019\u00a6\u00cfp~\u008f\u0000\u0091\u009c|\u00ef\u0090\u00be\u00f0\u00ca\u00c0_\u00e3\u00bb\u009f\u00e7\u00e7^\u00fa\u00fa\u00e7\u00e5jw\u00e7H\u00de\u00c2\u00a9\u00ce\u001fX\u00fa\u00f8\u0019\u0000\u0013\u0096\u00fa".length();
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
                    var9_3[var7_4++] = c7u.a(var10_9).intern();
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
        c7u.b = var9_3;
        c7u.c = new String[14];
        c7u.dim = c7u.a("i", (int)4313, (long)(6039478631525421295L ^ var0));
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5CFE;
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
                throw new RuntimeException("c7u", exception);
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
            c7u.c[n2] = c7u.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c7u.a(n, l);
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
            throw new RuntimeException("c7u" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c7u.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

