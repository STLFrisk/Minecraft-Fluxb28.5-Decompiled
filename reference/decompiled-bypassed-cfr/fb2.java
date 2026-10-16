/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Type;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fb2
extends _6f {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Exception decompiling
     */
    public yvh deserialize(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [1, 0, 5 : 172->178)] java.lang.NumberFormatException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
    public String xtu() {
        long l = a ^ 0x7A87B108094BL;
        return fb2.a("q", (int)8468, (long)(0x9B6427080933B78L ^ l));
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.deserialize(jsonElement, type, jsonDeserializationContext);
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

                fb2.a = c.a(6952463349624809250L, -4522266574176820817L, MethodHandles.lookup().lookupClass()).a(145223154438614L);
                fb2.d = new HashMap<K, V>(13);
                var0 = fb2.a ^ 87428555501486L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u00c0\u001d\u0003g\u00fen\u00cb\u00dd&\u0000\u00f2:50\u00e9\u00bf\u0010G\u00f6\u00d9\u00a8-\u008eM\u00fc\\+\u00f6\u00eb\u00deV\u00a2\u00f1\u0010M\u0086\u00e5\u008fds\u00b87\u00db\u0081\u00a4S\t\u008a\u0002\u00e7(<\u000fv\u00ba\u00d3e\u00db\u007fh\u00ca\u00a3\u00e8u\u00e4\u00cc[s\u008aW\u0017\u001a)z\u0085!\u00de\t(\u0088l7\u0007\u0018\u0000\u00bb\u0099\u00f8r\u0094\u0096P\u00d4\b[x\u00d5\u00e2\u0014\u0017\u0087\u00f4\u00c1\u00a7\u00cc\u00cfwV\"&\u009b\u00c3\u00b4t\u008c[\u009a\u00c2\u009c\u00c6\u00d6\u0091\u0090-~\u0017\u001a\u0099;n\u0002=C\u00a3\u0003<|\u00fd\u0085\u00a0\u00058Qq\u00d2S;TL|\u00e0nR>\u001f\u0085h\u0090\u00da\u009e$\u00daG\u00a9\u00ff$\u0011\u00d6\u00baI\u009e\u0083(^9x6\u00d8bHGYP\u00b0\u00a5\u00b5\u00c0Q\u00e4\u00a1N\u0086\u001f>\u00e4Li\u001e\u00190\u0093\u0098\u00cf\u009b\u0003c1\u00e0\u0011&\u00c65\u0084\u00107\u00bb\u00d5\u001b\u0088\u00adi6\u00f750L\u00f4H\u00d3\u00a5\u0010f\u00f9\u00f6\u001dl\u00e3\u00b1\u0011_ \u00d8D\u0092\u0083\u00e3q";
                var8_6 = "\u00c0\u001d\u0003g\u00fen\u00cb\u00dd&\u0000\u00f2:50\u00e9\u00bf\u0010G\u00f6\u00d9\u00a8-\u008eM\u00fc\\+\u00f6\u00eb\u00deV\u00a2\u00f1\u0010M\u0086\u00e5\u008fds\u00b87\u00db\u0081\u00a4S\t\u008a\u0002\u00e7(<\u000fv\u00ba\u00d3e\u00db\u007fh\u00ca\u00a3\u00e8u\u00e4\u00cc[s\u008aW\u0017\u001a)z\u0085!\u00de\t(\u0088l7\u0007\u0018\u0000\u00bb\u0099\u00f8r\u0094\u0096P\u00d4\b[x\u00d5\u00e2\u0014\u0017\u0087\u00f4\u00c1\u00a7\u00cc\u00cfwV\"&\u009b\u00c3\u00b4t\u008c[\u009a\u00c2\u009c\u00c6\u00d6\u0091\u0090-~\u0017\u001a\u0099;n\u0002=C\u00a3\u0003<|\u00fd\u0085\u00a0\u00058Qq\u00d2S;TL|\u00e0nR>\u001f\u0085h\u0090\u00da\u009e$\u00daG\u00a9\u00ff$\u0011\u00d6\u00baI\u009e\u0083(^9x6\u00d8bHGYP\u00b0\u00a5\u00b5\u00c0Q\u00e4\u00a1N\u0086\u001f>\u00e4Li\u001e\u00190\u0093\u0098\u00cf\u009b\u0003c1\u00e0\u0011&\u00c65\u0084\u00107\u00bb\u00d5\u001b\u0088\u00adi6\u00f750L\u00f4H\u00d3\u00a5\u0010f\u00f9\u00f6\u001dl\u00e3\u00b1\u0011_ \u00d8D\u0092\u0083\u00e3q".length();
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
                    var9_3[var7_4++] = fb2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "1\u009em\u00c8y\u00d2NJ\u0018\\\u0094;\u00bd\u009a\u00a9\u001a\fQ_\u00dbjg\u000f\u00d5\\\u0092\u00b1M\u00e5htJ\u00a7\u0010\u00af\u00f2\u00cd\u008d\u00f0\u0091\u00d0eT\u0094xG\u00db48\u001b\u00e61\u00f3\b\u001aw6K\u00ba\u00c2vyyH\u00d4\u00e1\u00e0\u0095\u0092\u00cbcn\u0090\u00c9\u00f8\u0001\u00c7W\u00ff\u00ce@(\u00a5'\u0089\u00a9\u00e5\u009c\u00f7\u008d\u00af\u00da\u00c8%\u00ed\u001b,\u0003\r\u00ab\u001bXeg\u00d3";
                    var8_6 = "1\u009em\u00c8y\u00d2NJ\u0018\\\u0094;\u00bd\u009a\u00a9\u001a\fQ_\u00dbjg\u000f\u00d5\\\u0092\u00b1M\u00e5htJ\u00a7\u0010\u00af\u00f2\u00cd\u008d\u00f0\u0091\u00d0eT\u0094xG\u00db48\u001b\u00e61\u00f3\b\u001aw6K\u00ba\u00c2vyyH\u00d4\u00e1\u00e0\u0095\u0092\u00cbcn\u0090\u00c9\u00f8\u0001\u00c7W\u00ff\u00ce@(\u00a5'\u0089\u00a9\u00e5\u009c\u00f7\u008d\u00af\u00da\u00c8%\u00ed\u001b,\u0003\r\u00ab\u001bXeg\u00d3".length();
                    var5_7 = 48;
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
                    var9_3[var7_4++] = fb2.a(var10_9).intern();
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
        fb2.b = var9_3;
        fb2.c = new String[10];
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A43;
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
                throw new RuntimeException("fb2", exception);
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
            fb2.c[n2] = fb2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fb2.a(n, l);
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
            throw new RuntimeException("fb2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fb2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

