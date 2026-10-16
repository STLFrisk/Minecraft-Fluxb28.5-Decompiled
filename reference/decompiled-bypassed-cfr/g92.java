/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.base.Objects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g92 {
    private static final Joiner xfq;
    private static final Function we5;
    private final e0x v1_;
    private final ImmutableList _xg;
    private final ImmutableList gf6;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public g92(e0x e0x2, xny[] xnyArray) {
        block9: {
            Object object;
            Iterator<Object> iterator;
            ArrayList arrayList;
            int n;
            LinkedHashMap linkedHashMap;
            block8: {
                this.v1_ = e0x2;
                Arrays.sort(xnyArray, new g92$2(this));
                this._xg = ImmutableList.copyOf((Object[])xnyArray);
                linkedHashMap = Maps.newLinkedHashMap();
                n = t9d.c();
                arrayList = Lists.newArrayList();
                iterator = hdl.ud4(this.fgr()).iterator();
                while (iterator.hasNext()) {
                    object = (List)iterator.next();
                    Map map = bpf.pwj((Iterable)this._xg, (Iterable)object);
                    g92$tt8 g92$tt8 = new g92$tt8(e0x2, ImmutableMap.copyOf((Map)map), null);
                    try {
                        linkedHashMap.put(map, g92$tt8);
                        arrayList.add(g92$tt8);
                        if (n == 0) {
                            if (n == 0) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (oov oov2) {
                        throw g92.a(oov2);
                    }
                }
                iterator = arrayList.iterator();
            }
            while (iterator.hasNext()) {
                object = (g92$tt8)iterator.next();
                try {
                    ((g92$tt8)object).ugw(linkedHashMap);
                    if (n == 0) {
                        if (n == 0) continue;
                        break;
                    }
                    break block9;
                }
                catch (oov oov3) {
                    throw g92.a(oov3);
                }
            }
            this.gf6 = ImmutableList.copyOf((Collection)arrayList);
        }
    }

    public ImmutableList k64() {
        return this.gf6;
    }

    private List fgr() {
        ArrayList arrayList;
        block4: {
            ArrayList arrayList2 = Lists.newArrayList();
            int n = t9d.b();
            for (int i = 0; i < this._xg.size(); ++i) {
                try {
                    arrayList = arrayList2;
                    if (n != 0) {
                        arrayList.add(((xny)this._xg.get(i)).isr());
                        if (n != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw g92.a(oov2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public zfz c32() {
        return (zfz)this.gf6.get(0);
    }

    public e0x m68() {
        return this.v1_;
    }

    public Collection o0r() {
        return this._xg;
    }

    public String toString() {
        long l = a ^ 0x44E2DC263FCBL;
        return Objects.toStringHelper((Object)this).add((String)((Object)g92.a("k", (int)17220, (long)(0x180A211331A145DCL ^ l))), e0x.db8.csx(this.v1_)).add((String)((Object)g92.a("k", (int)20090, (long)(0x65D2B2653F9548E3L ^ l))), (Object)Iterables.transform((Iterable)this._xg, (Function)we5)).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(-1757165737058708452L, -5926559562580882108L, MethodHandles.lookup().lookupClass()).a(34606649924262L);
        long l = a ^ 0x3B7A01BB83ABL;
        d = new HashMap(13);
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
        String string = "\u00c2U\u00f1\u0093\u00ec\u00cf\u00f4\u00b4Ym\u00e6\u0013\u00e1\u009e\u00a5\u00ab\u00e2\u00dc\u00e2\u00ae4\u00e89\u00ef\u0014NQ:'\u00e4.\u00f9\u0010}\u00fdvF\u00fcCz\u0016\u00ad\u00e1\t>\u0082\u000e\u00c86\u0010\u00d4\u009a\u00a4\u001c}\u00d7F\u00f5\u00d7\u0099\u00c0\u00f9\t\u00e7';";
        int n2 = "\u00c2U\u00f1\u0093\u00ec\u00cf\u00f4\u00b4Ym\u00e6\u0013\u00e1\u009e\u00a5\u00ab\u00e2\u00dc\u00e2\u00ae4\u00e89\u00ef\u0014NQ:'\u00e4.\u00f9\u0010}\u00fdvF\u00fcCz\u0016\u00ad\u00e1\t>\u0082\u000e\u00c86\u0010\u00d4\u009a\u00a4\u001c}\u00d7F\u00f5\u00d7\u0099\u00c0\u00f9\t\u00e7';".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = g92.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                xfq = Joiner.on((String)((Object)g92.a("k", (int)26016, (long)(0x43549304D0375F5BL ^ l))));
                we5 = new g92$1();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2920;
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
                throw new RuntimeException("g92", exception);
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
            g92.c[n2] = g92.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g92.a(n, l);
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
            throw new RuntimeException("g92" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g92.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

