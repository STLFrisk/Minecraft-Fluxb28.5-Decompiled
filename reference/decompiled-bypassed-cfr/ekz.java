/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ekz {
    private final Map mix;
    private final Map i4q;
    private final String ifu;
    private final URL z6s;
    private final zgw we4;
    private final Timer oiz;
    private final Object elw;
    private final long b5s;
    private boolean bza;
    private int txo;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ekz(String string, zgw zgw2, long l) {
        long l2 = a ^ 0x12C9938E587CL;
        this.mix = Maps.newHashMap();
        this.i4q = Maps.newHashMap();
        this.ifu = UUID.randomUUID().toString();
        this.oiz = new Timer((String)((Object)ekz.a("t", (int)21463, (long)(0x89B1DCE593ABDFL ^ l2))), true);
        this.elw = new Object();
        try {
            this.z6s = new URL((String)((Object)ekz.a("t", (int)13539, (long)(0x3B28A361454BCCF3L ^ l2))) + string + (String)((Object)ekz.a("t", (int)17072, (long)(0x4F045F09AC3FBAB2L ^ l2))) + 2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException();
        }
        this.we4 = zgw2;
        this.b5s = l;
    }

    public void iby() {
        block5: {
            ekz ekz2;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        ekz2 = this;
                        if (n != 0) break block4;
                        if (ekz2.bza) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ekz.a(illegalArgumentException);
                    }
                    this.bza = true;
                    this.jb8();
                    ekz2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ekz.a(illegalArgumentException);
                }
            }
            ekz2.oiz.schedule((TimerTask)new ekz$1(this), 0L, 900000L);
        }
    }

    private void jb8() {
        long l = a ^ 0x238BE360C330L;
        this.kaq();
        this.vgd((String)((Object)ekz.a("t", (int)18430, (long)(0x25EAF236D65FA4A3L ^ l))), this.ifu);
        this.etq((String)((Object)ekz.a("t", (int)7026, (long)(0x196E37FF856B7837L ^ l))), this.ifu);
        this.etq((String)((Object)ekz.a("t", (int)23156, (long)(0x4FB0A951CB273932L ^ l))), System.getProperty((String)((Object)ekz.a("t", (int)10582, (long)(0x7ED3387F3B364A0DL ^ l)))));
        this.etq((String)((Object)ekz.a("t", (int)8411, (long)(0x5C9E27E0E2DC390L ^ l))), System.getProperty((String)((Object)ekz.a("t", (int)8404, (long)(0x50FD58AD774E4397L ^ l)))));
        this.etq((String)((Object)ekz.a("t", (int)27676, (long)(0x52E9CA8E1268F46L ^ l))), System.getProperty((String)((Object)ekz.a("t", (int)5230, (long)(0x2F143ACC0460F722L ^ l)))));
        this.etq((String)((Object)ekz.a("t", (int)2834, (long)(0x7D1A06B72E89E850L ^ l))), System.getProperty((String)((Object)ekz.a("t", (int)9047, (long)(0x3D1CAE80B1B3C01EL ^ l)))));
        this.vgd((String)((Object)ekz.a("t", (int)31034, (long)(0x1A9B8B8504DB1A77L ^ l))), ekz.a("t", (int)27103, (long)(0x75359B35530E8A98L ^ l)));
        this.we4.w78(this);
    }

    private void kaq() {
        block6: {
            long l = a ^ 0x449222FE385BL;
            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
            List<String> list = runtimeMXBean.getInputArguments();
            int n = t9d.c();
            int n2 = 0;
            for (String string : list) {
                block7: {
                    try {
                        try {
                            if (n != 0) break block6;
                            if (string.startsWith((String)((Object)ekz.a("t", (int)4832, (long)(0x597CC589DA3D8ACBL ^ l))))) {
                            }
                            break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ekz.a(illegalArgumentException);
                        }
                        int n3 = n2++;
                        this.vgd((String)((Object)ekz.a("t", (int)19307, (long)(0x2EAEA113E883534FL ^ l))) + n3 + "]", string);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ekz.a(illegalArgumentException);
                    }
                }
                if (n == 0) continue;
                break;
            }
            this.vgd((String)((Object)ekz.a("t", (int)14780, (long)(0x7E118E51AC242189L ^ l))), n2);
        }
    }

    public void rr_() {
        long l = a ^ 0x4A1081F8483DL;
        this.etq((String)((Object)ekz.a("t", (int)30134, (long)(0xC4F4F3162AD9DFAL ^ l))), Runtime.getRuntime().totalMemory());
        this.etq((String)((Object)ekz.a("t", (int)14616, (long)(0x7A1B19768AF8D15FL ^ l))), Runtime.getRuntime().maxMemory());
        this.etq((String)((Object)ekz.a("t", (int)30768, (long)(0x5486B0E9FA1C1075L ^ l))), Runtime.getRuntime().freeMemory());
        this.etq((String)((Object)ekz.a("t", (int)9061, (long)(0x272E2AC73FEE4B37L ^ l))), Runtime.getRuntime().availableProcessors());
        this.we4.o2l(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void vgd(String string, Object object) {
        Object object2 = this.elw;
        synchronized (object2) {
            this.i4q.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void etq(String string, Object object) {
        Object object2 = this.elw;
        synchronized (object2) {
            this.mix.put(string, object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map cph() {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        Object object = this.elw;
        synchronized (object) {
            LinkedHashMap linkedHashMap2;
            block12: {
                Object object2;
                Map.Entry entry;
                Iterator iterator;
                int n;
                block11: {
                    n = t9d.c();
                    this.rr_();
                    iterator = this.mix.entrySet().iterator();
                    while (iterator.hasNext()) {
                        entry = iterator.next();
                        try {
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                            if (n == 0) {
                                if (n == 0) continue;
                                break;
                            }
                            break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ekz.a(illegalArgumentException);
                        }
                    }
                    iterator = this.i4q.entrySet().iterator();
                }
                while (iterator.hasNext()) {
                    entry = iterator.next();
                    try {
                        linkedHashMap2 = linkedHashMap;
                        object2 = entry.getKey();
                        if (n == 0) {
                            linkedHashMap2.put(object2, entry.getValue().toString());
                            if (n == 0) continue;
                            break;
                        }
                        break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ekz.a(illegalArgumentException);
                    }
                }
                linkedHashMap2 = linkedHashMap;
                object2 = object;
            }
            // ** MonitorExit[v2] (shouldn't be in output)
            return linkedHashMap2;
        }
    }

    public boolean rav() {
        return this.bza;
    }

    public void fne() {
        this.oiz.cancel();
    }

    public String imb() {
        return this.ifu;
    }

    public long ggn() {
        return this.b5s;
    }

    public static zgw p0l(ekz ekz2) {
        return ekz2.we4;
    }

    public static Object y0h(ekz ekz2) {
        return ekz2.elw;
    }

    public static Map uyh(ekz ekz2) {
        return ekz2.i4q;
    }

    public static int a_g(ekz ekz2) {
        return ekz2.txo;
    }

    public static Map nh0(ekz ekz2) {
        return ekz2.mix;
    }

    public static int wl1(ekz ekz2) {
        return ekz2.txo++;
    }

    public static String byx(ekz ekz2) {
        return ekz2.ifu;
    }

    public static URL wrk(ekz ekz2) {
        return ekz2.z6s;
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

                ekz.a = c.a(-4962872172885092375L, 4426475169912022598L, MethodHandles.lookup().lookupClass()).a(29406131368990L);
                ekz.d = new HashMap<K, V>(13);
                var0 = ekz.a ^ 113994554762526L;
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
                var9_3 = new String[22];
                var7_4 = 0;
                var6_5 = ".\u008f\u00e2\u00b3\u00b7\u00f2yE`a\u00cc\u0006\u00e0\u00a6\u001a\u00f5\u00adqe\u00e99\b?y\u0018\u00e6!\u0015\u00a8\u00c51g\u00d1\u0082\u00afX\u0083o8jz;\u00ee\u00c6\u00fb\u0087e\u00cb%\u0010\u00a6\u00b1O1>w\u00cc\u0088\u00f6\u00c8\u00ce\u0018\u00a3\u0092\u00c1,\u0010P\u0013$\u000e\u00fe{\u008e\u00bcH\tKqX>\u00f3\u0018 L\u00c4i\u00e8U\u00ff}\u001dy,\u0091\u009a\u000b\u00f9\u00b6K\u0017\u00e1\u0082\u00fem\u00edS\u00dd`r^\u00b6\u00df\u001d\u00fb^ \u008be\u0017^4\u00ca)D\u00d3\u00a3\u009dH\u008b\u00c78PG\u00d3\u00ca\u00d8CV\u0083A\u00e9)\u0080Y\n\u00cf>+ \u00d0\u0082\u00c9~\u00a5*\u0001\u00905x\u00f1S`#\u0012\u00e9\u00e1\u00ad\u001b\u00ae}\u00b5\u00e7\u0096r\u00ee\u00ba\u00f3\u00d65\u0018:\u0018\u00b4/\u00f9+*\"\u00f1JK\u00a1\u0085\u0091\u00b5\b\u00d3\u00a8\u008blr\u008d\u00b3\u0013xb\u0010\u00d9d\u00d7\t=\u008dY\u001bu\u00acE\u00fa\u00b5\u0098\u0014\u00ad\u0010\u00f1\u00af\u0010rG\u00cdXs\u00a6\u00161\u0080\u0086M\u0083\u00c8 \u0012\u001dL\u00ec\u00c9Z\u00eb\u00c0\u0000\u00939XX\u0095\b\u00c8/\u00aaE\u00c4J\u00a4Z\u00bb\u0092\u0088\u00ef\u000e\u00c2l\u00b3\u00b4 \u00c3%q\u0095\u00fb\u00c6\u00d8@\u0099\u0005+\u00b5;\u00d13\u00d9\u00fa\u00e6\u0016\u00bf\u0018F\u008c\u00bc+\u0014N\u0081\u00bf\u009e\u00a0, #\u00e1T\u00f3\u00d5\u00c0\u008eY\u00f3\u0000A\u0099\u0004\u0097rb\u0083\u00ca\u00b5-?\u00f1\u00banVx\u00aaPkX\u0015\u00e8 MH/\u0086\u0019\u007f@\u00e9\u00f8\u0004\u00b8\r\u00ea\"m\u0003\u00cd\u00ab\u00c0\u0017=\u00be/\rB(]\u00197\u0084\u00d7>\u0010i\u00e8\u00ae4\u0093\u00dcaQ\u00c6\u00d1\u00d0\n\u00e7\u008b\u00c1{\u0018\u00f85\u00e6\u00c8\\\u0010\u00d2\u00c6NIw\u00d90\u0012rg;\u00bb\u00e0<\u0097\u0019\u0083\u00d0\u0018>\u008cU8<\u00bd4_\u00db\u00a8fn\u00fc\u00fc\u009f\u00c3\u00bdVn\u00d5\u0091IG:\u0018\u0094\u008fQ\u001b+\u009a\u000f\u0095Qi\u00d9l\u007f&bM\u00c9T\u000e\u008a\u00dd\u00a4Y\u00a80fF\u00b3T\u00c5P\u0093\u00b5\u00d54\u00ac\u0094D\u008ex\u00b8n\u00c7;\u00b4\u00e4\u0011\u00acnw\u0003\u0012\u00aaJ}K\u00e6\u00bd\u0003\u00a8\u00aa\u0005\u00cd\u00d8\u001a\u00b7D\u00a7\u0010\u00f5\u008e`j\u0018\u0087\u00f1\u00d3\u00b3RC\u00a9\u001f\u0099\u00cai\u00e6(\u00ce\\\u00da\u00e9%\u00aa<\u00cc\u0089h'";
                var8_6 = ".\u008f\u00e2\u00b3\u00b7\u00f2yE`a\u00cc\u0006\u00e0\u00a6\u001a\u00f5\u00adqe\u00e99\b?y\u0018\u00e6!\u0015\u00a8\u00c51g\u00d1\u0082\u00afX\u0083o8jz;\u00ee\u00c6\u00fb\u0087e\u00cb%\u0010\u00a6\u00b1O1>w\u00cc\u0088\u00f6\u00c8\u00ce\u0018\u00a3\u0092\u00c1,\u0010P\u0013$\u000e\u00fe{\u008e\u00bcH\tKqX>\u00f3\u0018 L\u00c4i\u00e8U\u00ff}\u001dy,\u0091\u009a\u000b\u00f9\u00b6K\u0017\u00e1\u0082\u00fem\u00edS\u00dd`r^\u00b6\u00df\u001d\u00fb^ \u008be\u0017^4\u00ca)D\u00d3\u00a3\u009dH\u008b\u00c78PG\u00d3\u00ca\u00d8CV\u0083A\u00e9)\u0080Y\n\u00cf>+ \u00d0\u0082\u00c9~\u00a5*\u0001\u00905x\u00f1S`#\u0012\u00e9\u00e1\u00ad\u001b\u00ae}\u00b5\u00e7\u0096r\u00ee\u00ba\u00f3\u00d65\u0018:\u0018\u00b4/\u00f9+*\"\u00f1JK\u00a1\u0085\u0091\u00b5\b\u00d3\u00a8\u008blr\u008d\u00b3\u0013xb\u0010\u00d9d\u00d7\t=\u008dY\u001bu\u00acE\u00fa\u00b5\u0098\u0014\u00ad\u0010\u00f1\u00af\u0010rG\u00cdXs\u00a6\u00161\u0080\u0086M\u0083\u00c8 \u0012\u001dL\u00ec\u00c9Z\u00eb\u00c0\u0000\u00939XX\u0095\b\u00c8/\u00aaE\u00c4J\u00a4Z\u00bb\u0092\u0088\u00ef\u000e\u00c2l\u00b3\u00b4 \u00c3%q\u0095\u00fb\u00c6\u00d8@\u0099\u0005+\u00b5;\u00d13\u00d9\u00fa\u00e6\u0016\u00bf\u0018F\u008c\u00bc+\u0014N\u0081\u00bf\u009e\u00a0, #\u00e1T\u00f3\u00d5\u00c0\u008eY\u00f3\u0000A\u0099\u0004\u0097rb\u0083\u00ca\u00b5-?\u00f1\u00banVx\u00aaPkX\u0015\u00e8 MH/\u0086\u0019\u007f@\u00e9\u00f8\u0004\u00b8\r\u00ea\"m\u0003\u00cd\u00ab\u00c0\u0017=\u00be/\rB(]\u00197\u0084\u00d7>\u0010i\u00e8\u00ae4\u0093\u00dcaQ\u00c6\u00d1\u00d0\n\u00e7\u008b\u00c1{\u0018\u00f85\u00e6\u00c8\\\u0010\u00d2\u00c6NIw\u00d90\u0012rg;\u00bb\u00e0<\u0097\u0019\u0083\u00d0\u0018>\u008cU8<\u00bd4_\u00db\u00a8fn\u00fc\u00fc\u009f\u00c3\u00bdVn\u00d5\u0091IG:\u0018\u0094\u008fQ\u001b+\u009a\u000f\u0095Qi\u00d9l\u007f&bM\u00c9T\u000e\u008a\u00dd\u00a4Y\u00a80fF\u00b3T\u00c5P\u0093\u00b5\u00d54\u00ac\u0094D\u008ex\u00b8n\u00c7;\u00b4\u00e4\u0011\u00acnw\u0003\u0012\u00aaJ}K\u00e6\u00bd\u0003\u00a8\u00aa\u0005\u00cd\u00d8\u001a\u00b7D\u00a7\u0010\u00f5\u008e`j\u0018\u0087\u00f1\u00d3\u00b3RC\u00a9\u001f\u0099\u00cai\u00e6(\u00ce\\\u00da\u00e9%\u00aa<\u00cc\u0089h'".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = ekz.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u009b\u00aeK\u0080\u00bci\u000f\u00bd`n\u0001\u00e5/\u00e0~B\u00d5n;q\u00d7M)l8\u00fdS\u00c2\u0017\u00a65\u0092\u0010Z+\u008f\u008bL\u00d1D@u\u008a\u00ff\u00fb.\u00a8\u00d9\u00a2";
                    var8_6 = "\u009b\u00aeK\u0080\u00bci\u000f\u00bd`n\u0001\u00e5/\u00e0~B\u00d5n;q\u00d7M)l8\u00fdS\u00c2\u0017\u00a65\u0092\u0010Z+\u008f\u008bL\u00d1D@u\u008a\u00ff\u00fb.\u00a8\u00d9\u00a2".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = ekz.a(var10_9).intern();
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
        ekz.b = var9_3;
        ekz.c = new String[22];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26A6;
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
                throw new RuntimeException("ekz", exception);
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
            ekz.c[n2] = ekz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ekz.a(n, l);
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
            throw new RuntimeException("ekz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ekz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

