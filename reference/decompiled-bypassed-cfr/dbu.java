/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dbu
implements lv1,
xcy {
    private static final Logger k4h;
    private static final Gson rqo;
    private static final ParameterizedType k44;
    public static final vas e5c;
    private final zlg br4 = new zlg();
    private final c6g ke1;
    private final y99 s93;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public dbu(y99 y992, moh moh2) {
        this.s93 = y992;
        this.ke1 = new c6g(this, moh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onResourceManagerReload(y99 y992) {
        long l = a ^ 0x7F15D3D80FA0L;
        this.ke1.x6t();
        int n = t9d.b();
        this.br4.s5_();
        int n2 = n;
        Iterator iterator = y992.ugj().iterator();
        block6: while (true) {
            Iterator<Object> iterator2 = iterator;
            block7: while (iterator2.hasNext()) {
                String string = (String)iterator.next();
                try {
                    for (yaa yaa2 : y992.gc4(new gdz(string, (String)((Object)dbu.a("y", (int)16051, (long)(0x4F0AC5192FCEA4C6L ^ l)))))) {
                        try {
                            Map map = this.z_f(yaa2.f_4());
                            iterator2 = map.entrySet().iterator();
                            if (n2 == 0) continue block7;
                            Iterator<Object> iterator3 = iterator2;
                            while (iterator3.hasNext()) {
                                Map.Entry entry = (Map.Entry)iterator3.next();
                                try {
                                    this.kr5(new gdz(string, (String)entry.getKey()), (rv2)entry.getValue());
                                    if (n2 != 0 && n2 != 0) continue;
                                    break;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw dbu.a(runtimeException);
                                }
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            k4h.warn((String)((Object)dbu.a("y", (int)9694, (long)(0x635E61A511A33FADL ^ l))), (Throwable)runtimeException);
                        }
                        if (n2 != 0) continue;
                        continue block6;
                    }
                    continue block6;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                if (n2 != 0) continue block6;
            }
            break;
        }
    }

    public Map z_f(InputStream inputStream) {
        Map map;
        try {
            map = (Map)rqo.fromJson((Reader)new InputStreamReader(inputStream), (Type)k44);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return map;
    }

    /*
     * Exception decompiling
     */
    private void kr5(gdz var1_1, rv2 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[CASE]], but top level block is 11[TRYBLOCK]
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

    public z7p q79(gdz gdz2) {
        return (z7p)this.br4._gz(gdz2);
    }

    public void mak(jp4 jp42) {
        this.ke1.pnz(jp42);
    }

    public void xnf(jp4 jp42, int n) {
        this.ke1.syd(jp42, n);
    }

    public void aic(ha9 ha92, float f) {
        this.ke1.xvu(ha92, f);
    }

    public void epr() {
        this.ke1.p3x();
    }

    public void by1() {
        this.ke1.u5s();
    }

    public void pp7() {
        this.ke1.vg1();
    }

    @Override
    public void _21() {
        this.ke1.nf4();
    }

    public void llt() {
        this.ke1.szs();
    }

    public void vqz(xdt xdt2, float f) {
        block4: {
            try {
                try {
                    if (xdt2 != xdt.adu || !(f <= 0.0f)) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw dbu.a(runtimeException);
                }
                this.by1();
            }
            catch (RuntimeException runtimeException) {
                throw dbu.a(runtimeException);
            }
        }
        this.ke1.zdh(xdt2, f);
    }

    public void o81(jp4 jp42) {
        this.ke1.voc(jp42);
    }

    public z7p rjv(xdt[] xdtArray) {
        ArrayList arrayList;
        block14: {
            boolean bl;
            ArrayList arrayList2;
            block12: {
                arrayList2 = Lists.newArrayList();
                Iterator iterator = this.br4.kqi().iterator();
                int n = t9d.b();
                while (iterator.hasNext()) {
                    block13: {
                        gdz gdz2 = (gdz)iterator.next();
                        z7p z7p2 = (z7p)this.br4._gz(gdz2);
                        try {
                            try {
                                try {
                                    bl = ArrayUtils.contains((Object[])xdtArray, (Object)((Object)z7p2.w1m()));
                                    if (n == 0) break block12;
                                    if (n == 0) break block13;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw dbu.a(runtimeException);
                                }
                                if (!bl) break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw dbu.a(runtimeException);
                            }
                            arrayList2.add(z7p2);
                        }
                        catch (RuntimeException runtimeException) {
                            throw dbu.a(runtimeException);
                        }
                    }
                    if (n != 0) continue;
                }
                try {
                    arrayList = arrayList2;
                    if (n == 0) break block14;
                    bl = arrayList.isEmpty();
                }
                catch (RuntimeException runtimeException) {
                    throw dbu.a(runtimeException);
                }
            }
            try {
                if (bl) {
                    return null;
                }
            }
            catch (RuntimeException runtimeException) {
                throw dbu.a(runtimeException);
            }
            arrayList = arrayList2.get(new Random().nextInt(arrayList2.size()));
        }
        return (z7p)((Object)arrayList);
    }

    public boolean pxc(jp4 jp42) {
        return this.ke1.cr5(jp42);
    }

    public c6g _kg() {
        return this.ke1;
    }

    public static zlg gl0(dbu dbu2) {
        return dbu2.br4;
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

                dbu.a = c.a(-6688557044236067153L, -8253734656902860752L, MethodHandles.lookup().lookupClass()).a(253282105415704L);
                var9 = dbu.a ^ 62051887604313L;
                dbu.d = new HashMap<K, V>(13);
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
                var7_3 = new String[10];
                var5_4 = 0;
                var4_5 = "x\u00f3\u00d4\u00de\u00f5E\u0086\u00c8\u00e3\"\u00c2C\u00a4l\u007f\\\u00d1\u00b4\u00ebK\u0016\u00f7\u00a6\u0098(\u00a28\u00b4\u00edR\u00075\u009d\f\u00c2\u00e2\u00a5\u0097\u00e0(f\u00cd=\u00f5\u00f3!\u0011\u00f2\u00b6#\u0011\u00e1\u00dd!\u00bb\u008eG\u008e4\u00d0(?\u00f9\u00a2\u00968\u00d4\u00c5\u00fehD\u0004\u0099\u0007\u00c4\u00b7\b\u00ebF\u0090\u00fd%\u00b3,\u008d\u000ex\u00a4Ny{\u00b9#\u00bf[\u00f8\u0005}\u0019<\u0015\u00b0\r\u00cfX[9t\u00ca\u0006o\u0080%\u0006f\u00d0\u001a^hQ\u0019\u00b2(y\u00ba\u0091\u00de,o\u0094R\u00bf\u00f2\u00dbs\u00fa\u00c2\u0019\u00fcTM \u00b4-l\u00ffx\u00cbs\u00f8lL\u00c0\u00ba\u00b7F\u00c0\u00f9?\u00c25}\u00d8\u0010\u009c\u00d4\u00e25\u00b54\u00c2Ezn~$\u0084\u00f5\u00c7sP\u001c\u0014\u0005\u0081O\u00f9\u00ee\u00d0OHO\u008e\bi\fC`_\u00d9E\u00ed\u00c0\u00f7\u008c\nz\u00eb\u00c3D\u0080Z\u001d\u00ee\u0096\u000f\u00d8!\u00f1\u009a[\u00da2\u0013\u007f\u00c5\u0010\u00b9\u00e6# \u00c5\u00cdH\u00daC?bc\u0013\u00ad\u00be\u0018X\u00ba\u0006\u00eds\u0002\u0099\u008f\u00bd\u00fc\u00d3\u00f1`\u00b14\u00cd\u0005\u00a4\u0010\u00a9\u00ce\u00e6\u00b1\u00e97<\u00f0 \u00f4T\u00a2\u0094X<\u00a3 \u00a4\u0094Op\u00e2j\u00af\u00f9\u00ec\u0080\u00da+\u00f5\u00e6\u0004\b\u00cd%qa@\u00fe\u00a0\u001aQZ\u00b3|\u0000\u00a2\u0092\u00e6";
                var6_6 = "x\u00f3\u00d4\u00de\u00f5E\u0086\u00c8\u00e3\"\u00c2C\u00a4l\u007f\\\u00d1\u00b4\u00ebK\u0016\u00f7\u00a6\u0098(\u00a28\u00b4\u00edR\u00075\u009d\f\u00c2\u00e2\u00a5\u0097\u00e0(f\u00cd=\u00f5\u00f3!\u0011\u00f2\u00b6#\u0011\u00e1\u00dd!\u00bb\u008eG\u008e4\u00d0(?\u00f9\u00a2\u00968\u00d4\u00c5\u00fehD\u0004\u0099\u0007\u00c4\u00b7\b\u00ebF\u0090\u00fd%\u00b3,\u008d\u000ex\u00a4Ny{\u00b9#\u00bf[\u00f8\u0005}\u0019<\u0015\u00b0\r\u00cfX[9t\u00ca\u0006o\u0080%\u0006f\u00d0\u001a^hQ\u0019\u00b2(y\u00ba\u0091\u00de,o\u0094R\u00bf\u00f2\u00dbs\u00fa\u00c2\u0019\u00fcTM \u00b4-l\u00ffx\u00cbs\u00f8lL\u00c0\u00ba\u00b7F\u00c0\u00f9?\u00c25}\u00d8\u0010\u009c\u00d4\u00e25\u00b54\u00c2Ezn~$\u0084\u00f5\u00c7sP\u001c\u0014\u0005\u0081O\u00f9\u00ee\u00d0OHO\u008e\bi\fC`_\u00d9E\u00ed\u00c0\u00f7\u008c\nz\u00eb\u00c3D\u0080Z\u001d\u00ee\u0096\u000f\u00d8!\u00f1\u009a[\u00da2\u0013\u007f\u00c5\u0010\u00b9\u00e6# \u00c5\u00cdH\u00daC?bc\u0013\u00ad\u00be\u0018X\u00ba\u0006\u00eds\u0002\u0099\u008f\u00bd\u00fc\u00d3\u00f1`\u00b14\u00cd\u0005\u00a4\u0010\u00a9\u00ce\u00e6\u00b1\u00e97<\u00f0 \u00f4T\u00a2\u0094X<\u00a3 \u00a4\u0094Op\u00e2j\u00af\u00f9\u00ec\u0080\u00da+\u00f5\u00e6\u0004\b\u00cd%qa@\u00fe\u00a0\u001aQZ\u00b3|\u0000\u00a2\u0092\u00e6".length();
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
                    var7_3[var5_4++] = dbu.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00f5JU\u0084\u00ee\u00f0@_\u00d7\u00b7u\u00a4\u00b3%\u00bf\u00a3\u00c6rc<,\u007f2\u00ef\u00cf\u00c5\u0015\u00fb68\u00deC\u00bd\u008c\u008c\u001a\u00d3)K\f\u0002\u00b6\u008a\u00c9\u00b3!\u00aa\u000e\u00cf`\u0003\u00c7\u008b$\u00ff\u00bf\u00f9S\u00e9\u00c5\u0091\u00ac,\u008e0\u00fdm\u0019z\u00a1Z\u00892\u00db\u0094}\u00c8\u001d\u00db\u00cc\u00bf),\u00c0q>\u00df\u0081\u00b2\u00e8\u00ad%\n\u0011Y\u00ca\u009aCy>\u0096X\u00df=[\u00d6S\u00d2Vz\u00c3)\u00d6";
                    var6_6 = "\u00f5JU\u0084\u00ee\u00f0@_\u00d7\u00b7u\u00a4\u00b3%\u00bf\u00a3\u00c6rc<,\u007f2\u00ef\u00cf\u00c5\u0015\u00fb68\u00deC\u00bd\u008c\u008c\u001a\u00d3)K\f\u0002\u00b6\u008a\u00c9\u00b3!\u00aa\u000e\u00cf`\u0003\u00c7\u008b$\u00ff\u00bf\u00f9S\u00e9\u00c5\u0091\u00ac,\u008e0\u00fdm\u0019z\u00a1Z\u00892\u00db\u0094}\u00c8\u001d\u00db\u00cc\u00bf),\u00c0q>\u00df\u0081\u00b2\u00e8\u00ad%\n\u0011Y\u00ca\u009aCy>\u0096X\u00df=[\u00d6S\u00d2Vz\u00c3)\u00d6".length();
                    var3_7 = 64;
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
                    var7_3[var5_4++] = dbu.a(var8_9).intern();
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
        dbu.b = var7_3;
        dbu.c = new String[10];
        dbu.k4h = LogManager.getLogger();
        dbu.rqo = new GsonBuilder().registerTypeAdapter(rv2.class, (Object)new dae()).create();
        dbu.k44 = new dbu$1();
        dbu.e5c = new vas(new gdz((String)dbu.a("y", (int)1327, (long)(7008986030265856679L ^ var9))), 0.0, 0.0, false);
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x69D;
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
                throw new RuntimeException("dbu", exception);
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
            dbu.c[n2] = dbu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dbu.a(n, l);
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
            throw new RuntimeException("dbu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dbu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

