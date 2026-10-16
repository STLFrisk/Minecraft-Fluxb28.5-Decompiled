/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dak {
    private static final Logger vlr;
    private List bhz = Lists.newArrayList();
    private List dan = Lists.newArrayList();
    private final uan jhw;
    private int adc;
    private int rii = 3;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public dak(uan uan2) {
        this.jhw = uan2;
    }

    public void tn8(int n, cjm cjm2) {
        this.bhz.add(new dak$a7s(this, n, cjm2));
    }

    public void hmq(cjm cjm2) {
        int n = t9d.c();
        Iterator iterator = this.bhz.iterator();
        while (iterator.hasNext()) {
            block7: {
                block8: {
                    dak$a7s dak$a7s = (dak$a7s)iterator.next();
                    cjm cjm3 = dak$a7s.rhd;
                    try {
                        boolean bl;
                        try {
                            try {
                                if (cjm3 != cjm2) break block7;
                                bl = this.dan.contains(dak$a7s);
                                if (n != 0) break block8;
                            }
                            catch (oov oov2) {
                                throw dak.a(oov2);
                            }
                            if (!bl) break block8;
                        }
                        catch (oov oov3) {
                            throw dak.a(oov3);
                        }
                        cjm3.zly();
                        bl = this.dan.remove(dak$a7s);
                    }
                    catch (oov oov4) {
                        throw dak.a(oov4);
                    }
                }
                iterator.remove();
            }
            if (n == 0) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public void eo0() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [34[DOLOOP]], but top level block is 15[TRYBLOCK]
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

    private boolean tq7(dak$a7s dak$a7s) {
        boolean bl = dak$a7s.rhd.wh3();
        return bl;
    }

    private boolean zpt(dak$a7s dak$a7s) {
        int n = t9d.c();
        for (dak$a7s dak$a7s2 : this.bhz) {
            block22: {
                boolean bl;
                block28: {
                    block27: {
                        block23: {
                            block24: {
                                boolean bl2;
                                block26: {
                                    block25: {
                                        dak$a7s dak$a7s3;
                                        block21: {
                                            try {
                                                try {
                                                    dak$a7s3 = dak$a7s2;
                                                    if (n != 0) break block21;
                                                    if (dak$a7s3 == dak$a7s) break block22;
                                                }
                                                catch (oov oov2) {
                                                    throw dak.a(oov2);
                                                }
                                                dak$a7s3 = dak$a7s;
                                            }
                                            catch (oov oov3) {
                                                throw dak.a(oov3);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = dak$a7s3.pjj;
                                                        if (n != 0) break block23;
                                                        if (bl < dak$a7s2.pjj) break block24;
                                                    }
                                                    catch (oov oov4) {
                                                        throw dak.a(oov4);
                                                    }
                                                    bl2 = this.b1n(dak$a7s, dak$a7s2);
                                                    if (n != 0) break block25;
                                                }
                                                catch (oov oov5) {
                                                    throw dak.a(oov5);
                                                }
                                                if (bl2) break block22;
                                            }
                                            catch (oov oov6) {
                                                throw dak.a(oov6);
                                            }
                                            bl2 = this.dan.contains(dak$a7s2);
                                        }
                                        catch (oov oov7) {
                                            throw dak.a(oov7);
                                        }
                                    }
                                    try {
                                        if (n != 0) break block26;
                                        if (!bl2) break block22;
                                    }
                                    catch (oov oov8) {
                                        throw dak.a(oov8);
                                    }
                                    bl2 = false;
                                }
                                return bl2;
                            }
                            bl = dak$a7s2.rhd.d75();
                        }
                        try {
                            try {
                                if (n != 0) break block27;
                                if (bl) break block22;
                            }
                            catch (oov oov9) {
                                throw dak.a(oov9);
                            }
                            bl = this.dan.contains(dak$a7s2);
                        }
                        catch (oov oov10) {
                            throw dak.a(oov10);
                        }
                    }
                    try {
                        if (n != 0) break block28;
                        if (!bl) break block22;
                    }
                    catch (oov oov11) {
                        throw dak.a(oov11);
                    }
                    bl = false;
                }
                return bl;
            }
            if (n == 0) continue;
        }
        return true;
    }

    private boolean b1n(dak$a7s dak$a7s, dak$a7s dak$a7s2) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = dak$a7s.rhd.db5() & dak$a7s2.rhd.db5();
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw dak.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(7495326246608713748L, 5060965043441356833L, MethodHandles.lookup().lookupClass()).a(162411561693431L);
        d = new HashMap(13);
        long l = a ^ 0x38A6583B5D0FL;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u001c\u009d\u0011PK\u000f\u008f\u007f\u000e\u00e6\u00c6\u0098%\u009dwi2\u0004M3\u0003(\u00c4\u00d8\u00ddG\\\u0002\u00e5\u00ad`R\u0018\u00b2k\u00ff\u00f84o\u00e4\u00f9\t\u0081>N\u00fd&\u001f\u00c9EBsDj\u00a1\u008b\u00c2";
        int n2 = "\u001c\u009d\u0011PK\u000f\u008f\u007f\u000e\u00e6\u00c6\u0098%\u009dwi2\u0004M3\u0003(\u00c4\u00d8\u00ddG\\\u0002\u00e5\u00ad`R\u0018\u00b2k\u00ff\u00f84o\u00e4\u00f9\t\u0081>N\u00fd&\u001f\u00c9EBsDj\u00a1\u008b\u00c2".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dak.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                vlr = LogManager.getLogger();
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4581;
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
                throw new RuntimeException("dak", exception);
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
            dak.c[n2] = dak.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dak.a(n, l);
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
            throw new RuntimeException("dak" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dak.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

