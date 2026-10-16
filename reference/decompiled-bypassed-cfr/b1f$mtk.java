/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b1f$mtk
extends Thread {
    private final b1f$woh xtr;
    private final InetAddress cj1;
    private final MulticastSocket ay7;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public b1f$mtk(b1f$woh woh2) {
        long l = a ^ 0x357C969A4084L;
        super((String)((Object)b1f$mtk.a("n", (int)20164, (long)(0x32A178F31F655C9DL ^ l))) + b1f.ymx().incrementAndGet());
        this.xtr = woh2;
        this.setDaemon(true);
        this.ay7 = new MulticastSocket(4445);
        this.cj1 = InetAddress.getByName((String)((Object)b1f$mtk.a("n", (int)28265, (long)(0x2D3BAD92F9DA7C32L ^ l))));
        this.ay7.setSoTimeout(5000);
        this.ay7.joinGroup(this.cj1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        block8: {
            long l = a ^ 0x47FD576530F0L;
            int n = t9d.b();
            byte[] byArray = new byte[1024];
            while (!this.isInterrupted()) {
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
                try {
                    try {
                        this.ay7.receive(datagramPacket);
                        if (n == 0) break block8;
                    }
                    catch (SocketTimeoutException socketTimeoutException) {
                        continue;
                    }
                    catch (IOException iOException) {
                        b1f.udl().error((String)((Object)b1f$mtk.a("n", (int)25458, (long)(0x61BF51D66FC015CL ^ l))), (Throwable)iOException);
                        if (n != 0) break;
                    }
                }
                catch (oov oov2) {
                    throw b1f$mtk.a(oov2);
                }
                String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                b1f.udl().debug(datagramPacket.getAddress() + (String)((Object)b1f$mtk.a("n", (int)8638, (long)(0x492D87F9C48B4392L ^ l))) + string);
                this.xtr.kig(string, datagramPacket.getAddress());
                if (n != 0) continue;
            }
            try {
                this.ay7.leaveGroup(this.cj1);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.ay7.close();
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

                b1f$mtk.a = c.a(-728125193306476878L, -4086719606743492136L, MethodHandles.lookup().lookupClass()).a(171518241557296L);
                b1f$mtk.d = new HashMap<K, V>(13);
                var0 = b1f$mtk.a ^ 77401804564588L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "3\u00c9\u0007]\u00bb6\u0085\u00e2\\\u00bb\u0001\u00a5\u008eJ\u00ddW_\u00e2{\u0001\u00e4\u009f\u00ff\u00dbX\rj\u00b5\u00d8y\u00de\u00fbx\u00820\u0006\u00feI\u00a3\u00df\u0010\u0016d&\u00d0\u0083X\u000f?\u007f\f\u00d4|y\u00d8\u008c\u0005";
                var8_6 = "3\u00c9\u0007]\u00bb6\u0085\u00e2\\\u00bb\u0001\u00a5\u008eJ\u00ddW_\u00e2{\u0001\u00e4\u009f\u00ff\u00dbX\rj\u00b5\u00d8y\u00de\u00fbx\u00820\u0006\u00feI\u00a3\u00df\u0010\u0016d&\u00d0\u0083X\u000f?\u007f\f\u00d4|y\u00d8\u008c\u0005".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = b1f$mtk.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e6c\u0097\u00dd\u00a2\u0012ss\u00e4\u00cf\u00da\u00a1%[w\u001fyn\u009a\u00d6\u00fe}->\u007f\u00ba\u00ceI+\u00a5\u0090\u00e2(\u00d6\u009a\u00cb\u008f\u00c5\u00f4\u00bc\u00e1R\u00e4\u00a5\u00e6\u00f9R\u00be\u00b5\u00e5\u00a7\u0091;\u008e\u00f6]\u000b'\u008f\u00d4\u00cf\u00cfl\u00b9\u00c7\u00c6\u00bb\b\u00e4\u008b\u00c4\u00ed\u00d9";
                    var8_6 = "\u00e6c\u0097\u00dd\u00a2\u0012ss\u00e4\u00cf\u00da\u00a1%[w\u001fyn\u009a\u00d6\u00fe}->\u007f\u00ba\u00ceI+\u00a5\u0090\u00e2(\u00d6\u009a\u00cb\u008f\u00c5\u00f4\u00bc\u00e1R\u00e4\u00a5\u00e6\u00f9R\u00be\u00b5\u00e5\u00a7\u0091;\u008e\u00f6]\u000b'\u008f\u00d4\u00cf\u00cfl\u00b9\u00c7\u00c6\u00bb\b\u00e4\u008b\u00c4\u00ed\u00d9".length();
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
                    var9_3[var7_4++] = b1f$mtk.a(var10_9).intern();
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
        b1f$mtk.b = var9_3;
        b1f$mtk.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x756;
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
                throw new RuntimeException("b1f$mtk", exception);
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
            b1f$mtk.c[n2] = b1f$mtk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b1f$mtk.a(n, l);
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
            throw new RuntimeException("b1f$mtk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b1f$mtk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

