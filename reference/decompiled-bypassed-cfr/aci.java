/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class aci {
    private /* synthetic */ Object[][] jmx;
    private static final long a = c.a(825717425229880600L, 7750842789769331545L, MethodHandles.lookup().lookupClass()).a(25994270370610L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public aci() {
        this.jmx = new Object[][]{{ox_.pkt, new erg(xbr.jtr, 9)}, {ox_.rq4, new erg(xbr.icz, 9)}, {ox_.fad, new erg(xbr.exg, 9)}, {ox_.mo3, new erg(xbr.cu7, 9)}, {ox_.tok, new erg(xbr.nnn, 9, qvg.o71.b9d())}, {ox_.i1p, new erg(xbr.deg, 9)}, {ox_.orh, new erg(xbr.thr, 9, 0)}, {ox_.cap, new erg(xbr.iqq, 9)}, {ox_.ehh, new erg(xbr.g77, 9)}};
    }

    public void h24(opt opt2) {
        long l = a ^ 0xE4022995025L;
        for (int i = 0; i < this.jmx.length; ++i) {
            e0x e0x2 = (e0x)this.jmx[i][0];
            erg erg2 = (erg)this.jmx[i][1];
            Object[] objectArray = new Object[5];
            objectArray[0] = aci.a("m", (int)1130, (long)(0x5C89C915FDE25B8FL ^ l));
            objectArray[1] = aci.a("m", (int)2961, (long)(0x7D3CA4F4D8E9D475L ^ l));
            objectArray[2] = aci.a("m", (int)2961, (long)(0x7D3CA4F4D8E9D475L ^ l));
            objectArray[3] = Character.valueOf('#');
            objectArray[4] = erg2;
            opt2.q01(new erg(e0x2), objectArray);
            Object[] objectArray2 = new Object[3];
            objectArray2[0] = "#";
            objectArray2[1] = Character.valueOf('#');
            objectArray2[2] = e0x2;
            opt2.q01(erg2, objectArray2);
        }
        Object[] objectArray = new Object[5];
        objectArray[0] = aci.a("m", (int)2961, (long)(0x7D3CA4F4D8E9D475L ^ l));
        objectArray[1] = aci.a("m", (int)2961, (long)(0x7D3CA4F4D8E9D475L ^ l));
        objectArray[2] = aci.a("m", (int)2961, (long)(0x7D3CA4F4D8E9D475L ^ l));
        objectArray[3] = Character.valueOf('#');
        objectArray[4] = xbr.mzp;
        opt2.q01(new erg(xbr.jtr), objectArray);
        Object[] objectArray3 = new Object[3];
        objectArray3[0] = "#";
        objectArray3[1] = Character.valueOf('#');
        objectArray3[2] = xbr.jtr;
        opt2.q01(new erg(xbr.mzp, 9), objectArray3);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x6CD79D33F3EBL;
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
        String string = "\u001e\u00a1K.\u00a7\u00da\u00ce\u008d\u000b?\u00b3)\u009e5\u00f7\u00da\u0010\u000f0H\u009eN\u000fZ,\u00ca\u00b7/\u00fa\u00a7\u0016\u0084\u0089";
        int n2 = "\u001e\u00a1K.\u00a7\u00da\u00ce\u008d\u000b?\u00b3)\u009e5\u00f7\u00da\u0010\u000f0H\u009eN\u000fZ,\u00ca\u00b7/\u00fa\u00a7\u0016\u0084\u0089".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = aci.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x200C;
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
                throw new RuntimeException("aci", exception);
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
            aci.c[n2] = aci.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = aci.a(n, l);
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
            throw new RuntimeException("aci" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(aci.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

