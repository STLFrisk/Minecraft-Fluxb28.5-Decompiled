/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.File;
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

public class fh6 {
    private static final /* synthetic */ Logger a7t;
    private final /* synthetic */ c05 so8;
    private final /* synthetic */ List qk2;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public fh6(c05 c052) {
        this.qk2 = Lists.newArrayList();
        this.so8 = c052;
        this.rrd();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void rrd() {
        long l = a ^ 0x51E04A1D8C35L;
        int n = t9d.b();
        try {
            bdo bdo2;
            block7: {
                bdo bdo3;
                block8: {
                    this.qk2.clear();
                    bdo3 = g62.zgm(new File(this.so8.glh, (String)((Object)fh6.a("x", (int)23786, (long)(0x1AFE007748F823A0L ^ l)))));
                    try {
                        bdo2 = bdo3;
                        if (n == 0) break block7;
                        if (bdo2 != null) break block8;
                        return;
                    }
                    catch (Exception exception) {
                        throw fh6.a(exception);
                    }
                }
                bdo2 = bdo3;
            }
            qhg qhg2 = bdo2.bzb((String)((Object)fh6.a("x", (int)16630, (long)(0x602C2C8FD3D73FBDL ^ l))), 10);
            for (int i = 0; i < qhg2.vek(); ++i) {
                try {
                    this.qk2.add(r1l.tx7(qhg2.kd6(i)));
                    if (n != 0 && n != 0) continue;
                    return;
                }
                catch (Exception exception) {
                    throw fh6.a(exception);
                    return;
                }
            }
        }
        catch (Exception exception) {
            a7t.error((String)((Object)fh6.a("x", (int)16635, (long)(0x30EA7E841C8BFB6L ^ l))), (Throwable)exception);
        }
    }

    public void _ju() {
        block6: {
            long l = a ^ 0x438037FF24EL;
            int n = t9d.c();
            try {
                qhg qhg2 = new qhg();
                for (r1l r1l2 : this.qk2) {
                    try {
                        qhg2.w2j(r1l2.gsy());
                        if (n == 0) {
                            if (n == 0) continue;
                            break;
                        }
                        break block6;
                    }
                    catch (Exception exception) {
                        throw fh6.a(exception);
                    }
                }
                bdo bdo2 = new bdo();
                bdo2.rzm((String)((Object)fh6.a("x", (int)16799, (long)(0x3858884916EC0ABL ^ l))), qhg2);
                g62.uhp(bdo2, new File(this.so8.glh, (String)((Object)fh6.a("x", (int)29798, (long)(0x13D0EBA51467553L ^ l)))));
            }
            catch (Exception exception) {
                a7t.error((String)((Object)fh6.a("x", (int)10661, (long)(0x4FB1411C9A34A892L ^ l))), (Throwable)exception);
            }
        }
    }

    public r1l da_(int n) {
        return (r1l)this.qk2.get(n);
    }

    public void d8v(int n) {
        this.qk2.remove(n);
    }

    public void jlh(r1l r1l2) {
        this.qk2.add(r1l2);
    }

    public int aik() {
        return this.qk2.size();
    }

    public void j7y(int n, int n2) {
        r1l r1l2 = this.da_(n);
        this.qk2.set(n, this.da_(n2));
        this.qk2.set(n2, r1l2);
        this._ju();
    }

    public void asw(int n, r1l r1l2) {
        this.qk2.set(n, r1l2);
    }

    public static void tav(r1l r1l2) {
        block11: {
            fh6 fh62 = new fh6(c05.vz1());
            int n = t9d.c();
            fh62.rrd();
            int n2 = n;
            int n3 = 0;
            while (n3 < fh62.aik()) {
                block12: {
                    r1l r1l3 = fh62.da_(n3);
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n2 != 0) break block11;
                                            if (n2 != 0) break block12;
                                        }
                                        catch (oov oov2) {
                                            throw fh6.a(oov2);
                                        }
                                        if (!r1l3.bx0.equals(r1l2.bx0)) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw fh6.a(oov3);
                                    }
                                    if (!r1l3.s4c.equals(r1l2.s4c)) break block13;
                                }
                                catch (oov oov4) {
                                    throw fh6.a(oov4);
                                }
                                fh62.asw(n3, r1l2);
                                if (n2 == 0) break;
                            }
                            catch (oov oov5) {
                                throw fh6.a(oov5);
                            }
                        }
                        ++n3;
                    }
                    catch (oov oov6) {
                        throw fh6.a(oov6);
                    }
                }
                if (n2 == 0) continue;
            }
            fh62._ju();
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

                fh6.a = c.a(-1275480752683047103L, -5665442010638316192L, MethodHandles.lookup().lookupClass()).a(14254949606307L);
                fh6.d = new HashMap<K, V>(13);
                var0 = fh6.a ^ 29204761537635L;
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
                var6_5 = ",\u008f\u008e\u0085\u001a\u00f2Ga\u00b0\u00cf!\u00bd\u0012\u008e\u00ec\\\u0018\u00bd\u00db\u0093\u00dc\u009c\u00ab\u00cf\u00e55\n\f\u00eem\u00c3v\u00b4^\u00f1\u0080\r6\u0002\u00fd\u00ca8\u0099g\u009a\u00dea\u0090\u008e\u0095#\u00f1\u00ca\u0086\u001ar\u0090\u00d4*2\u0096L\u0002\u00e4N\u0086\u00da\u00ca\u00fc\u00c3\u001d0=\u00a7A\n\u00c0\u0001f\u009e`\u00d0\u000b$\u008e\u00d1\b\u00a1\u0010!\u00bb/'P\u00bd\u0094\u00f8\u00ec0\u0019\u00d6\u008a\u0006E$0N\u008f\u0092\u00abNc\u00a8\u00f5\u00a1\u0005?\u00cf\u00b7s\u00ceQ#pQ(!\u0015~\u00a4\u00f6\u00e32\u008eT\u00d3|\u0000\u0099\u00e5!\u007f7s-\u0081+";
                var8_6 = ",\u008f\u008e\u0085\u001a\u00f2Ga\u00b0\u00cf!\u00bd\u0012\u008e\u00ec\\\u0018\u00bd\u00db\u0093\u00dc\u009c\u00ab\u00cf\u00e55\n\f\u00eem\u00c3v\u00b4^\u00f1\u0080\r6\u0002\u00fd\u00ca8\u0099g\u009a\u00dea\u0090\u008e\u0095#\u00f1\u00ca\u0086\u001ar\u0090\u00d4*2\u0096L\u0002\u00e4N\u0086\u00da\u00ca\u00fc\u00c3\u001d0=\u00a7A\n\u00c0\u0001f\u009e`\u00d0\u000b$\u008e\u00d1\b\u00a1\u0010!\u00bb/'P\u00bd\u0094\u00f8\u00ec0\u0019\u00d6\u008a\u0006E$0N\u008f\u0092\u00abNc\u00a8\u00f5\u00a1\u0005?\u00cf\u00b7s\u00ceQ#pQ(!\u0015~\u00a4\u00f6\u00e32\u008eT\u00d3|\u0000\u0099\u00e5!\u007f7s-\u0081+".length();
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
                    var9_3[var7_4++] = fh6.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ba\u00f7:\b\u0016\u008b\u008a\u0005\u008d\u00eb&\u008cvw\u00d8\u0085 \u00c0\u00f9d*IY\u00d9m:\u00a1\u0016\u0092=D&\u00ce\u00f9\u00a1\u00b0\\3r?\u00b2M\u00fb\u0091\u0085^O\u0011\u00e8";
                    var8_6 = "\u00ba\u00f7:\b\u0016\u008b\u008a\u0005\u008d\u00eb&\u008cvw\u00d8\u0085 \u00c0\u00f9d*IY\u00d9m:\u00a1\u0016\u0092=D&\u00ce\u00f9\u00a1\u00b0\\3r?\u00b2M\u00fb\u0091\u0085^O\u0011\u00e8".length();
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
                    var9_3[var7_4++] = fh6.a(var10_9).intern();
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
        fh6.b = var9_3;
        fh6.c = new String[6];
        fh6.a7t = LogManager.getLogger();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3FA7;
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
                throw new RuntimeException("fh6", exception);
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
            fh6.c[n2] = fh6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fh6.a(n, l);
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
            throw new RuntimeException("fh6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fh6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

