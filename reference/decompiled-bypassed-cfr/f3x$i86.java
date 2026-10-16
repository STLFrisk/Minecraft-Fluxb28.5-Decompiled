/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
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

public class f3x$i86
extends ed7 {
    private final List eh1;
    public final f3x qss;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public f3x$i86(f3x f3x2, c05 c052) {
        this.qss = f3x2;
        int n = t9d.c();
        super(c052, f3x2.dt7, f3x2.o1e, 32, f3x2.o1e - 64, f3x.uw2((f3x)f3x2).rr7 * 4);
        this.eh1 = Lists.newArrayList();
        int n2 = n;
        this.fai(false);
        for (y65$p2a y65$p2a : y65._n6.values()) {
            block9: {
                try {
                    int n3;
                    block10: {
                        try {
                            try {
                                try {
                                    n3 = f3x.h5z(f3x2).zgq(y65$p2a.ke4);
                                    if (n2 != 0) break block9;
                                    if (n3 > 0) break block10;
                                }
                                catch (oov oov2) {
                                    throw f3x$i86.a(oov2);
                                }
                                n3 = f3x.h5z(f3x2).zgq(y65$p2a.qsl);
                                if (n2 != 0) break block9;
                            }
                            catch (oov oov3) {
                                throw f3x$i86.a(oov3);
                            }
                            if (n3 <= 0) break block9;
                        }
                        catch (oov oov4) {
                            throw f3x$i86.a(oov4);
                        }
                    }
                    n3 = this.eh1.add(y65$p2a) ? 1 : 0;
                }
                catch (oov oov5) {
                    throw f3x$i86.a(oov5);
                }
            }
            if (n2 == 0) continue;
        }
    }

    @Override
    public int getSize() {
        return this.eh1.size();
    }

    @Override
    public void elementClicked(int n, boolean bl, int n2, int n3) {
    }

    @Override
    public boolean isSelected(int n) {
        return false;
    }

    @Override
    public int getContentHeight() {
        return this.getSize() * f3x.bu9((f3x)this.qss).rr7 * 4;
    }

    @Override
    public void drawBackground() {
        this.qss.xmz();
    }

    @Override
    public void drawSlot(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        String string;
        owt owt2;
        f3x f3x2;
        block15: {
            block16: {
                int n10;
                int n11;
                int n12;
                String string2;
                owt owt3;
                f3x f3x3;
                int n13;
                String string3;
                int n14;
                block13: {
                    block14: {
                        int n15;
                        String string4;
                        int n16;
                        String string5;
                        long l;
                        block11: {
                            block12: {
                                l = a ^ 0x7DBDE67F4994L;
                                y65$p2a y65$p2a = (y65$p2a)this.eh1.get(n);
                                string5 = fc1.gx1((String)((Object)f3x$i86.a("a", (int)9498, (long)(0x588BAB3A4338A947L ^ l))) + y65.jue(y65$p2a.hgl) + (String)((Object)f3x$i86.a("a", (int)3586, (long)(0x5BE45F88C66A825EL ^ l))), new Object[0]);
                                n16 = f3x.h5z(this.qss).zgq(y65$p2a.ke4);
                                n14 = f3x.h5z(this.qss).zgq(y65$p2a.qsl);
                                string4 = fc1.gx1((String)((Object)f3x$i86.a("a", (int)8181, (long)(0x45BAFA820FBA93AEL ^ l))), new Object[]{n16, string5});
                                string3 = fc1.gx1((String)((Object)f3x$i86.a("a", (int)1137, (long)(0x484AE62CC2AE882BL ^ l))), new Object[]{string5, n14});
                                n13 = t9d.c();
                                try {
                                    n15 = n16;
                                    if (n13 != 0) break block11;
                                    if (n15 != 0) break block12;
                                }
                                catch (oov oov2) {
                                    throw f3x$i86.a(oov2);
                                }
                                string4 = fc1.gx1((String)((Object)f3x$i86.a("a", (int)12564, (long)(0x4E48259A8099BD4BL ^ l))), new Object[]{string5});
                            }
                            n15 = n14;
                        }
                        if (n15 == 0) {
                            string3 = fc1.gx1((String)((Object)f3x$i86.a("a", (int)11253, (long)(0x775828B3B9427ABL ^ l))), new Object[]{string5});
                        }
                        try {
                            try {
                                this.qss.c_t(f3x.z2i(this.qss), string5, n2 + 2 - 10, n3 + 1, 0xFFFFFF);
                                f3x3 = this.qss;
                                owt3 = f3x.nqw(this.qss);
                                string2 = string4;
                                n12 = n2 + 2;
                                n11 = n3 + 1 + f3x.cq3((f3x)this.qss).rr7;
                                n10 = n16;
                                if (n13 != 0) break block13;
                                if (n10 != 0) break block14;
                            }
                            catch (oov oov3) {
                                throw f3x$i86.a(oov3);
                            }
                            n10 = 0x606060;
                            break block13;
                        }
                        catch (oov oov4) {
                            throw f3x$i86.a(oov4);
                        }
                    }
                    n10 = 0x909090;
                }
                try {
                    try {
                        f3x3.c_t(owt3, string2, n12, n11, n10);
                        f3x2 = this.qss;
                        owt2 = f3x.gou(this.qss);
                        string = string3;
                        n9 = n2 + 2;
                        n8 = n3 + 1 + f3x.z6d((f3x)this.qss).rr7 * 2;
                        n7 = n14;
                        if (n13 != 0) break block15;
                        if (n7 != 0) break block16;
                    }
                    catch (oov oov5) {
                        throw f3x$i86.a(oov5);
                    }
                    n7 = 0x606060;
                    break block15;
                }
                catch (oov oov6) {
                    throw f3x$i86.a(oov6);
                }
            }
            n7 = 0x909090;
        }
        f3x2.c_t(owt2, string, n9, n8, n7);
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

                f3x$i86.a = c.a(-806076076715388394L, 7199503056909440585L, MethodHandles.lookup().lookupClass()).a(135595409046466L);
                f3x$i86.d = new HashMap<K, V>(13);
                var0 = f3x$i86.a ^ 127422695374584L;
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
                var6_5 = "\u0011oF\u0003\u00a9\u0098i\u00c2\u00c03\u0096\u00c4\u00bf\u0014\u0094\u0016$D\u0012\u00d5F\u00c7\u00af\u008b\f\u00f2v\u00ed\u00d3J\u0091b\u00d4\u008c\u00c3!\u00f0\u00a6\u009b\u00da\u0086\u009c\u00bf\u0090\u00cb3:N(\u00a2\u009d\u0093\u00d4f\u0086\u00937D~\u008a\u001b\u00b1\u00c3L\u00e7W\u0005x\u00c1\u008b-\u0090Y\u00ed\r\u00a0.>:}`;dc\u0088\u0080\u009d\u0085N\u00104\u0003\u00f0(\u00c6\u0089\u00b6\u00b0\u0013\u008b/,)z\u00be\u00db\u0010G)C^\u00a5}\u00e6j\u001b~\u00b0\u00ec\u00a3\n\u00e8W";
                var8_6 = "\u0011oF\u0003\u00a9\u0098i\u00c2\u00c03\u0096\u00c4\u00bf\u0014\u0094\u0016$D\u0012\u00d5F\u00c7\u00af\u008b\f\u00f2v\u00ed\u00d3J\u0091b\u00d4\u008c\u00c3!\u00f0\u00a6\u009b\u00da\u0086\u009c\u00bf\u0090\u00cb3:N(\u00a2\u009d\u0093\u00d4f\u0086\u00937D~\u008a\u001b\u00b1\u00c3L\u00e7W\u0005x\u00c1\u008b-\u0090Y\u00ed\r\u00a0.>:}`;dc\u0088\u0080\u009d\u0085N\u00104\u0003\u00f0(\u00c6\u0089\u00b6\u00b0\u0013\u008b/,)z\u00be\u00db\u0010G)C^\u00a5}\u00e6j\u001b~\u00b0\u00ec\u00a3\n\u00e8W".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = f3x$i86.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "r+;\u00e4M]\u00e3\u0000\u00111Nrp\u0006g\u00180\u0080\u0081\u00d9\u00c3w\u0014\u00e3R\u00d3\u0004/\u00cf\u008dN'\u009d\u00f5\u00a3\u0090E\u00d0\u00ce$(\u0099_o\u00c0O\u00ae\f\u0088p\u00dd\u00ef\u0013\u0081\u00f7\u00ba=\u0093\u00036\u00f1\u0090\u00b4=\u00b4\u0004\u001e\u0097(\u00ab\u0090\u0003HE_\u001c\u009f\u00c2a\u00f7\u00d9";
                    var8_6 = "r+;\u00e4M]\u00e3\u0000\u00111Nrp\u0006g\u00180\u0080\u0081\u00d9\u00c3w\u0014\u00e3R\u00d3\u0004/\u00cf\u008dN'\u009d\u00f5\u00a3\u0090E\u00d0\u00ce$(\u0099_o\u00c0O\u00ae\f\u0088p\u00dd\u00ef\u0013\u0081\u00f7\u00ba=\u0093\u00036\u00f1\u0090\u00b4=\u00b4\u0004\u001e\u0097(\u00ab\u0090\u0003HE_\u001c\u009f\u00c2a\u00f7\u00d9".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = f3x$i86.a(var10_9).intern();
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
        f3x$i86.b = var9_3;
        f3x$i86.c = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C8F;
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
                throw new RuntimeException("f3x$i86", exception);
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
            f3x$i86.c[n2] = f3x$i86.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f3x$i86.a(n, l);
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
            throw new RuntimeException("f3x$i86" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f3x$i86.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

