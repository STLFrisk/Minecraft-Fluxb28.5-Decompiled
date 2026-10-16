/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ss {
    public final String yr5;
    private final ekw z83;
    public boolean qy7;
    private final bx6 _9v;
    private final z0w o3u;
    private Class il3;
    private static NumberFormat vyn;
    public static bx6 zrz;
    private static DecimalFormat ed5;
    public static bx6 ttm;
    public static bx6 d2j;
    public static bx6 eal;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public _ss(String string, ekw ekw2, bx6 bx62) {
        this.yr5 = string;
        this.z83 = ekw2;
        this._9v = bx62;
        this.o3u = new e6p(this);
        z0w.wwc.put(this.o3u.ofv(), this.o3u);
    }

    public _ss(String string, ekw ekw2) {
        this(string, ekw2, zrz);
    }

    public _ss rem() {
        this.qy7 = true;
        return this;
    }

    public _ss ft0() {
        long l = a ^ 0x2FA74B365DD7L;
        try {
            if (l9p.zmx.containsKey(this.yr5)) {
                throw new RuntimeException((String)((Object)_ss.a("v", (int)17379, (long)(0x39D93E7DB48F5F6CL ^ l))) + ((_ss)l9p.zmx.get((Object)this.yr5)).z83 + (String)((Object)_ss.a("v", (int)13172, (long)(0x7BF9D9CD12E3AFFCL ^ l))) + this.z83 + (String)((Object)_ss.a("v", (int)26891, (long)(0x9D9B4C73A4C7585L ^ l))) + this.yr5);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _ss.a(runtimeException);
        }
        l9p._cg.add(this);
        l9p.zmx.put(this.yr5, this);
        return this;
    }

    public boolean koi() {
        return false;
    }

    public String rbf(int n) {
        return this._9v.dg6(n);
    }

    public ekw xn7() {
        ekw ekw2 = this.z83.qy8();
        ekw2.f4q().vyb(syo.qiz);
        ekw2.f4q().zn_(new xq3(xq3$e6b.igw, new tao(this.yr5)));
        return ekw2;
    }

    public ekw zv4() {
        ekw ekw2 = this.xn7();
        ekw ekw3 = new tao("[").vha(ekw2).lt8("]");
        ekw3.di5(ekw2.f4q());
        return ekw3;
    }

    public boolean equals(Object object) {
        block12: {
            Object object2;
            block13: {
                Object object3;
                int n;
                block10: {
                    block11: {
                        n = t9d.b();
                        try {
                            try {
                                object3 = this;
                                if (n == 0) break block10;
                                if (object3 != object) break block11;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _ss.a(runtimeException);
                            }
                            return true;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _ss.a(runtimeException);
                        }
                    }
                    object3 = object;
                }
                try {
                    try {
                        try {
                            if (object3 == null) break block12;
                            object2 = this.getClass();
                            if (n == 0) break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _ss.a(runtimeException);
                        }
                        if (object2 != object.getClass()) break block12;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _ss.a(runtimeException);
                    }
                    object2 = object;
                }
                catch (RuntimeException runtimeException) {
                    throw _ss.a(runtimeException);
                }
            }
            _ss _ss2 = (_ss)object2;
            return this.yr5.equals(_ss2.yr5);
        }
        return false;
    }

    public int hashCode() {
        return this.yr5.hashCode();
    }

    public String toString() {
        long l = a ^ 0x3B7753C923C7L;
        return (String)((Object)_ss.a("v", (int)21282, (long)(0x45AA9B3A6D9431BBL ^ l))) + this.yr5 + (String)((Object)_ss.a("v", (int)4273, (long)(0x33C4209D9DD2722BL ^ l))) + this.z83 + (String)((Object)_ss.a("v", (int)21052, (long)(0x3D8D51246BC1B0AEL ^ l))) + this.qy7 + (String)((Object)_ss.a("v", (int)6898, (long)(0x456DBBEF90A6786FL ^ l))) + this._9v + (String)((Object)_ss.a("v", (int)28339, (long)(0x22842CCE257F8C28L ^ l))) + this.o3u + '}';
    }

    public z0w ihd() {
        return this.o3u;
    }

    public Class yjl() {
        return this.il3;
    }

    public _ss en2(Class clazz) {
        this.il3 = clazz;
        return this;
    }

    public static NumberFormat q0x() {
        return vyn;
    }

    public static DecimalFormat esp() {
        return ed5;
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

                _ss.a = c.a(-1532220871050805750L, 4750396815362362539L, MethodHandles.lookup().lookupClass()).a(97005239504097L);
                var9 = _ss.a ^ 97637996146411L;
                _ss.e = new HashMap<K, V>(13);
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
                var7_3 = new String[9];
                var5_4 = 0;
                var4_5 = "\u00bb{\u00ef\u00daQ\u00d9ZR\u0000C\u000274\u00d2b\u0093\u000f\u00cf\b\u009f\u00d5`\u0010\u0099\u00c9w=\u0007~\u00b0\u00b7\u00a0(U\u00ecz\u0098\u00fb\u0085\u00fd\u0091yLe$\u00bc_1\u00c7s\u00b5B>\u00e1\u00f5\u0091;\u00a6\u0088w\u008a\u00b7'm\u00b1\u009f{IYr\u00e94y\u0010;\u008fMO&}\u008c\u0005/\u00d8\u001bLPL\u00b2\u00b6 \u00b0\u0093\u0099\u0090XK`\u0010\u001f\u0084A\u00d7\u009e&\u009b\u009do\u00e6<h\u00b4\u00c4\u00dc\u0001\u009f\u00a6\u009c\u00f2\u00d55\u0013\u00cb r\u001e\u009f]&,\u00b5\u00b1\u00d6\u00ec\u00ad4\u0000\u00f0\u00a5\u00e3\u00bb(\u00e58\n\u008c\u0014j\u00a9\u00c9~\u00cb\u008b\u00f9\u00f4\u0014 \u00c5vH&\u00f7 \u00d3\u0002I\u0085\u00ad\u00e9\u00d5\u0095\u00e4\u008a9\u001e\u00a2\u000f\u0085R\u00d5,\u00a7y\u00b2q\\u3\u00bc\u0018C9?\u00b7|D\u00cb\u0015\u00a5\u00e5u\u00b4s\u00deR\u00e8\u00f4\u0099\u0000\u00a8)\u00f2\u0006\u009c";
                var6_6 = "\u00bb{\u00ef\u00daQ\u00d9ZR\u0000C\u000274\u00d2b\u0093\u000f\u00cf\b\u009f\u00d5`\u0010\u0099\u00c9w=\u0007~\u00b0\u00b7\u00a0(U\u00ecz\u0098\u00fb\u0085\u00fd\u0091yLe$\u00bc_1\u00c7s\u00b5B>\u00e1\u00f5\u0091;\u00a6\u0088w\u008a\u00b7'm\u00b1\u009f{IYr\u00e94y\u0010;\u008fMO&}\u008c\u0005/\u00d8\u001bLPL\u00b2\u00b6 \u00b0\u0093\u0099\u0090XK`\u0010\u001f\u0084A\u00d7\u009e&\u009b\u009do\u00e6<h\u00b4\u00c4\u00dc\u0001\u009f\u00a6\u009c\u00f2\u00d55\u0013\u00cb r\u001e\u009f]&,\u00b5\u00b1\u00d6\u00ec\u00ad4\u0000\u00f0\u00a5\u00e3\u00bb(\u00e58\n\u008c\u0014j\u00a9\u00c9~\u00cb\u008b\u00f9\u00f4\u0014 \u00c5vH&\u00f7 \u00d3\u0002I\u0085\u00ad\u00e9\u00d5\u0095\u00e4\u008a9\u001e\u00a2\u000f\u0085R\u00d5,\u00a7y\u00b2q\\u3\u00bc\u0018C9?\u00b7|D\u00cb\u0015\u00a5\u00e5u\u00b4s\u00deR\u00e8\u00f4\u0099\u0000\u00a8)\u00f2\u0006\u009c".length();
                var3_7 = 32;
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
                    var7_3[var5_4++] = _ss.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00e5\u00df\u001f\u000b\u00dd\u00d5\u00c4Y\u00d3\u0084\u00c7\u001e\u00adhy^Z\u00b3\u0095\u00d3\u0080\u0001\u0088\u008c\u00f7\u00b5\u008dP\bS\u00a9\u000b(\u00ae\u0099yb\u0019G\u0017\u00dd )\u00ff^9\u0087\u0000~A\r\u009a\u00a48c\u0081\u00d2S\u00a5_\u0016\u008885\u0089?\u008d\u0017\u00c6\u0093%\u00f2\u00d5";
                    var6_6 = "\u00e5\u00df\u001f\u000b\u00dd\u00d5\u00c4Y\u00d3\u0084\u00c7\u001e\u00adhy^Z\u00b3\u0095\u00d3\u0080\u0001\u0088\u008c\u00f7\u00b5\u008dP\bS\u00a9\u000b(\u00ae\u0099yb\u0019G\u0017\u00dd )\u00ff^9\u0087\u0000~A\r\u009a\u00a48c\u0081\u00d2S\u00a5_\u0016\u008885\u0089?\u008d\u0017\u00c6\u0093%\u00f2\u00d5".length();
                    var3_7 = 32;
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
                    var7_3[var5_4++] = _ss.a(var8_9).intern();
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
        _ss.c = var7_3;
        _ss.d = new String[9];
        _ss.vyn = NumberFormat.getIntegerInstance(Locale.US);
        _ss.zrz = new _ss$1();
        _ss.ed5 = new DecimalFormat((String)_ss.a("v", (int)10963, (long)(5489143959223158115L ^ var9)));
        _ss.ttm = new _ss$2();
        _ss.d2j = new _ss$3();
        _ss.eal = new _ss$4();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x73D5;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("_ss", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            _ss.d[n2] = _ss.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _ss.a(n, l);
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
            throw new RuntimeException("_ss" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_ss.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

