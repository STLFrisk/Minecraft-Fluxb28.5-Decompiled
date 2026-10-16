/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class ay5 {
    private static final /* synthetic */ Splitter p6u;
    private static final /* synthetic */ Pattern t_j;
    public Map a59 = Maps.newHashMap();
    private /* synthetic */ boolean a9y;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public synchronized void at8(y99 y992, List list) {
        block4: {
            long l = a ^ 0x5718F45DDD96L;
            this.a59.clear();
            Iterator iterator = list.iterator();
            int n = t9d.b();
            block2: while (iterator.hasNext()) {
                String string = (String)iterator.next();
                String string2 = String.format((String)((Object)ay5.a("a", (int)15480, (long)(0x17A32138759DBDC3L ^ l))), string);
                if (n == 0) break block4;
                for (String string3 : y992.ugj()) {
                    try {
                        this.yzo(y992.gc4(new gdz(string3, string2)));
                        if (n == 0) continue block2;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    if (n != 0) continue;
                }
                if (n != 0) continue;
            }
            this.gi7();
        }
    }

    public boolean qzf() {
        return this.a9y;
    }

    /*
     * Exception decompiling
     */
    private void gi7() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 5[SIMPLE_IF_TAKEN]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void yzo(List list) {
        int n = t9d.c();
        for (yaa yaa2 : list) {
            InputStream inputStream = yaa2.f_4();
            try {
                this.l6n(inputStream);
            }
            finally {
                IOUtils.closeQuietly((InputStream)inputStream);
            }
            if (n == 0) continue;
        }
    }

    private void l6n(InputStream inputStream) {
        long l = a ^ 0x2D7C00A536FDL;
        int n = t9d.b();
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            block13: {
                int n2;
                block12: {
                    try {
                        try {
                            n2 = string.isEmpty();
                            if (n == 0) break block12;
                            if (n2 != 0) break block13;
                        }
                        catch (IllegalFormatException illegalFormatException) {
                            throw ay5.a(illegalFormatException);
                        }
                        n2 = string.charAt(0);
                    }
                    catch (IllegalFormatException illegalFormatException) {
                        throw ay5.a(illegalFormatException);
                    }
                }
                if (n2 != 35) {
                    String[] stringArray;
                    String[] stringArray2;
                    block15: {
                        block14: {
                            stringArray2 = (String[])Iterables.toArray((Iterable)p6u.split((CharSequence)string), String.class);
                            try {
                                stringArray = stringArray2;
                                if (n == 0) break block14;
                                if (stringArray == null) break block13;
                            }
                            catch (IllegalFormatException illegalFormatException) {
                                throw ay5.a(illegalFormatException);
                            }
                            stringArray = stringArray2;
                        }
                        try {
                            try {
                                if (n == 0) break block15;
                                if (stringArray.length != 2) break block13;
                            }
                            catch (IllegalFormatException illegalFormatException) {
                                throw ay5.a(illegalFormatException);
                            }
                            stringArray = stringArray2;
                        }
                        catch (IllegalFormatException illegalFormatException) {
                            throw ay5.a(illegalFormatException);
                        }
                    }
                    String string2 = stringArray[0];
                    String string3 = t_j.matcher(stringArray2[1]).replaceAll((String)((Object)ay5.a("a", (int)5670, (long)(0x5A7C9A2021647CF4L ^ l))));
                    this.a59.put(string2, string3);
                }
            }
            if (n != 0) continue;
        }
    }

    private String _ic(String string) {
        String string2;
        String string3 = (String)this.a59.get(string);
        try {
            string2 = string3 == null ? string : string3;
        }
        catch (IllegalFormatException illegalFormatException) {
            throw ay5.a(illegalFormatException);
        }
        return string2;
    }

    public String ew8(String string, Object[] objectArray) {
        long l = a ^ 0x34F14DC8EF6BL;
        String string2 = this._ic(string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return (String)((Object)ay5.a("a", (int)6276, (long)(0x494A06C4B562ABC3L ^ l))) + string2;
        }
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

                ay5.a = c.a(-592013215431665326L, 6159072169418329278L, MethodHandles.lookup().lookupClass()).a(109997820463410L);
                var9 = ay5.a ^ 80784359096321L;
                ay5.d = new HashMap<K, V>(13);
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
                var7_3 = new String[4];
                var5_4 = 0;
                var4_5 = "\u00c0\u0091^y\u00c5M\u0007q\u00e8>\u00b0\u00f4^\u001aObiu_\u00a1\u0093\u009e\u0003\u008d\u0018;m\u0093\u0099q\u0080\u001b\u00d7\u00c5B{\u00a5\u0010G\u00f5c\u0002n\u0091(\u00c8\u00ed\u00fe\u0094";
                var6_6 = "\u00c0\u0091^y\u00c5M\u0007q\u00e8>\u00b0\u00f4^\u001aObiu_\u00a1\u0093\u009e\u0003\u008d\u0018;m\u0093\u0099q\u0080\u001b\u00d7\u00c5B{\u00a5\u0010G\u00f5c\u0002n\u0091(\u00c8\u00ed\u00fe\u0094".length();
                var3_7 = 24;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = ay5.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0017\u00827H\u00aea'\u00a2\u009f\u00a6(I\u00ad!\u00c9Z(\u009c\u009e\u00b0\u0019\u00b7\u00f7\u0004\u0090\u00f2(X?\u00e7\u001a\u00bc\u0016\u00aec\u00cd\u00a2\u00b6\u00e0\u00d5\u00895s\u00a4\u0090\u00e3\u0003\u0003 \u00c8\u0014\u00ab\u00b0f(\u0013+";
                    var6_6 = "\u0017\u00827H\u00aea'\u00a2\u009f\u00a6(I\u00ad!\u00c9Z(\u009c\u009e\u00b0\u0019\u00b7\u00f7\u0004\u0090\u00f2(X?\u00e7\u001a\u00bc\u0016\u00aec\u00cd\u00a2\u00b6\u00e0\u00d5\u00895s\u00a4\u0090\u00e3\u0003\u0003 \u00c8\u0014\u00ab\u00b0f(\u0013+".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = ay5.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
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
        ay5.b = var7_3;
        ay5.c = new String[4];
        ay5.p6u = Splitter.on((char)'=').limit(2);
        ay5.t_j = Pattern.compile((String)ay5.a("a", (int)22214, (long)(2285956645453761257L ^ var9)));
    }

    private static IllegalFormatException a(IllegalFormatException illegalFormatException) {
        return illegalFormatException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7984;
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
                throw new RuntimeException("ay5", exception);
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
            ay5.c[n2] = ay5.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ay5.a(n, l);
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
            throw new RuntimeException("ay5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ay5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

