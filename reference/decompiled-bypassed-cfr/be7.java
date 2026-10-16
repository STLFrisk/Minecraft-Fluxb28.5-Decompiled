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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class be7 {
    private static final Logger tu0;
    private final List dkr;
    private final List jdj;
    private int sij;
    private int b3v;
    private List sqx;
    private int c6r;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public be7(be7 be72) {
        block4: {
            this();
            int n = t9d.c();
            for (int i = 0; i < be72.pua(); ++i) {
                try {
                    this.cmt(be72.c8h(i));
                    if (n == 0) {
                        if (n == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw be7.a(oov2);
                }
            }
            this.sij = be72.vy7();
        }
    }

    public be7() {
        this.dkr = Lists.newArrayList();
        this.jdj = Lists.newArrayList();
        this.sij = 0;
        this.b3v = -1;
        this.sqx = Lists.newArrayList();
        this.c6r = -1;
    }

    public void y1h() {
        this.dkr.clear();
        this.jdj.clear();
        this.b3v = -1;
        this.sqx.clear();
        this.c6r = -1;
        this.sij = 0;
    }

    /*
     * Exception decompiling
     */
    public be7 cmt(n0i var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 3[SWITCH]
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

    public boolean lhz() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.c6r;
                    if (n == 0) break block2;
                    if (bl < false) break block3;
                }
                catch (oov oov2) {
                    throw be7.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public int tab() {
        return this.c6r;
    }

    public boolean giz() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.b3v;
                    if (n == 0) break block2;
                    if (bl < false) break block3;
                }
                catch (oov oov2) {
                    throw be7.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public int t3m() {
        return this.b3v;
    }

    public boolean p74(int n) {
        boolean bl;
        block4: {
            block5: {
                int n2 = t9d.c();
                try {
                    try {
                        bl = this.sqx.size() - 1;
                        if (n2 != 0) break block4;
                        if (bl < n) break block5;
                    }
                    catch (oov oov2) {
                        throw be7.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw be7.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int _b0(int n) {
        return (Integer)this.sqx.get(n);
    }

    public String toString() {
        String string;
        block4: {
            long l = a ^ 0xB8D794140C7L;
            String string2 = (String)((Object)be7.a("a", (int)31784, (long)(0x324FD34F66FAFBA1L ^ l))) + this.dkr.size() + (String)((Object)be7.a("a", (int)18097, (long)(0x6BA4C1DE5591C13BL ^ l)));
            int n = 0;
            int n2 = t9d.b();
            while (n < this.dkr.size()) {
                block5: {
                    block6: {
                        string = string2 + ((n0i)this.dkr.get(n)).toString();
                        if (n2 == 0) break block4;
                        string2 = string;
                        try {
                            if (n2 == 0) break block5;
                            if (n != this.dkr.size() - 1) {
                            }
                            break block6;
                        }
                        catch (oov oov2) {
                            throw be7.a(oov2);
                        }
                        string2 = string2 + " ";
                    }
                    ++n;
                }
                if (n2 != 0) continue;
            }
            string = string2;
        }
        return string;
    }

    private boolean i44() {
        int n = this.dkr.size();
        for (int i = 0; i < n; ++i) {
            n0i n0i2 = (n0i)this.dkr.get(i);
            try {
                if (!n0i2.gqv()) continue;
                return true;
            }
            catch (oov oov2) {
                throw be7.a(oov2);
            }
        }
        return false;
    }

    public int olc() {
        return this.vy7() / 4;
    }

    public int vy7() {
        return this.sij;
    }

    public List utn() {
        return this.dkr;
    }

    public int pua() {
        return this.dkr.size();
    }

    public n0i c8h(int n) {
        return (n0i)this.dkr.get(n);
    }

    public int ydd(int n) {
        return (Integer)this.jdj.get(n);
    }

    public boolean equals(Object object) {
        block20: {
            boolean bl;
            block24: {
                List list;
                List list2;
                block25: {
                    be7 be72;
                    block26: {
                        int n;
                        block22: {
                            int n2;
                            block23: {
                                Object object2;
                                block21: {
                                    Object object3;
                                    block18: {
                                        block19: {
                                            n2 = t9d.c();
                                            try {
                                                try {
                                                    object3 = this;
                                                    if (n2 != 0) break block18;
                                                    if (object3 != object) break block19;
                                                }
                                                catch (oov oov2) {
                                                    throw be7.a(oov2);
                                                }
                                                return true;
                                            }
                                            catch (oov oov3) {
                                                throw be7.a(oov3);
                                            }
                                        }
                                        object3 = object;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (object3 == null) break block20;
                                                object2 = this.getClass();
                                                if (n2 != 0) break block21;
                                            }
                                            catch (oov oov4) {
                                                throw be7.a(oov4);
                                            }
                                            if (object2 != object.getClass()) break block20;
                                        }
                                        catch (oov oov5) {
                                            throw be7.a(oov5);
                                        }
                                        object2 = object;
                                    }
                                    catch (oov oov6) {
                                        throw be7.a(oov6);
                                    }
                                }
                                be72 = (be7)object2;
                                try {
                                    try {
                                        n = this.sij;
                                        if (n2 != 0) break block22;
                                        if (n == be72.sij) break block23;
                                    }
                                    catch (oov oov7) {
                                        throw be7.a(oov7);
                                    }
                                    bl = false;
                                    break block24;
                                }
                                catch (oov oov8) {
                                    throw be7.a(oov8);
                                }
                            }
                            try {
                                list2 = this.dkr;
                                list = be72.dkr;
                                if (n2 != 0) break block25;
                                n = list2.equals(list) ? 1 : 0;
                            }
                            catch (oov oov9) {
                                throw be7.a(oov9);
                            }
                        }
                        try {
                            if (n != 0) break block26;
                            bl = false;
                            break block24;
                        }
                        catch (oov oov10) {
                            throw be7.a(oov10);
                        }
                    }
                    list2 = this.jdj;
                    list = be72.jdj;
                }
                bl = list2.equals(list);
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        int n = this.dkr.hashCode();
        n = 31 * n + this.jdj.hashCode();
        n = 31 * n + this.sij;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-1391509991934737836L, -7698810726023514896L, MethodHandles.lookup().lookupClass()).a(228751707763806L);
        d = new HashMap(13);
        long l = a ^ 0x1AF5F4FC29E2L;
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
        String string = "~\u00b0Q,\n\u00efM\u0017J{/\u00d1\u00df\u00df\u00fc\u00cd\u0095X\u0006\"\u0086<H(\u00ad\u00fc\u00c4\u0096:\u001b\u00d7\u0001\u00a7A\u00ad1\u00b6\u00e6\u00df\u00a9\u008f\u0095\u00ca\u0097\u009a\b]\u00cf\u0084\u00e0\u00e9t\u009f\u008dy\u00c1\u00cbJ\u00ec\u00b2\u001f )\u00de\u00b4^\u0091\u00f3\u00c9\u00ffeP\u0080\u00b2\u00b8\u00ef\u00ce\u00ceN\u00ec\u00fbLk\u00ba\u00ea\u00ee\u00c7\u0082\u00ab\u00bd.\u0083\u008f\u00e1\u009d\u00dan\u0081\u00ef\u00fe\u0096\u00fcZ\u001e\u00d9[\u00de\u00b2\u00c16\u00c7\u00b5r\u0093\u0086\u000eqd\u00cd\u00ffT\u0089\u00e2K\u00d8\u0010\u00c7\u009a\u00c0z?\u00dd\u00189~\u0080\u0095?\u00a4\f\u0096\u000b\u00ac\u00a2[#\u001a\u0006\u00f0mT&\u00e8M\u00a2\u00b7\u00a2\u0000\u009c\u001a\u0018\u00ecT\u008a\u0010sA]k\u008fn\u00d4\u00ee\u00eeV=mx\u00fd$\u00cc\t\u00ec\u00a2\u00af \u00e2j[?\u00db`\b\u00f5\u00fc\u00a1\u0095_?\u00c0\u0098(\u0092\u001e^\u00f9\u00cb\u0088\u001c\u00b8\u00ef\u009b\u00b1\u009f\u00e5\u00bb0<";
        int n2 = "~\u00b0Q,\n\u00efM\u0017J{/\u00d1\u00df\u00df\u00fc\u00cd\u0095X\u0006\"\u0086<H(\u00ad\u00fc\u00c4\u0096:\u001b\u00d7\u0001\u00a7A\u00ad1\u00b6\u00e6\u00df\u00a9\u008f\u0095\u00ca\u0097\u009a\b]\u00cf\u0084\u00e0\u00e9t\u009f\u008dy\u00c1\u00cbJ\u00ec\u00b2\u001f )\u00de\u00b4^\u0091\u00f3\u00c9\u00ffeP\u0080\u00b2\u00b8\u00ef\u00ce\u00ceN\u00ec\u00fbLk\u00ba\u00ea\u00ee\u00c7\u0082\u00ab\u00bd.\u0083\u008f\u00e1\u009d\u00dan\u0081\u00ef\u00fe\u0096\u00fcZ\u001e\u00d9[\u00de\u00b2\u00c16\u00c7\u00b5r\u0093\u0086\u000eqd\u00cd\u00ffT\u0089\u00e2K\u00d8\u0010\u00c7\u009a\u00c0z?\u00dd\u00189~\u0080\u0095?\u00a4\f\u0096\u000b\u00ac\u00a2[#\u001a\u0006\u00f0mT&\u00e8M\u00a2\u00b7\u00a2\u0000\u009c\u001a\u0018\u00ecT\u008a\u0010sA]k\u008fn\u00d4\u00ee\u00eeV=mx\u00fd$\u00cc\t\u00ec\u00a2\u00af \u00e2j[?\u00db`\b\u00f5\u00fc\u00a1\u0095_?\u00c0\u0098(\u0092\u001e^\u00f9\u00cb\u0088\u001c\u00b8\u00ef\u009b\u00b1\u009f\u00e5\u00bb0<".length();
        int n3 = 160;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = be7.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                tu0 = LogManager.getLogger();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4202;
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
                throw new RuntimeException("be7", exception);
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
            be7.c[n2] = be7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = be7.a(n, l);
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
            throw new RuntimeException("be7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(be7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

