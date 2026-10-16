/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.IChatAPIListener
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
import tv.twitch.ErrorCode;
import tv.twitch.chat.IChatAPIListener;

public class _r7$1
implements IChatAPIListener {
    public final _r7 al7;
    private static final long a = c.a(396713655902656245L, -6706832084065502209L, MethodHandles.lookup().lookupClass()).a(43728358758956L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public _r7$1(_r7 _r72) {
        this.al7 = _r72;
    }

    /*
     * Unable to fully structure code
     */
    public void chatInitializationCallback(ErrorCode var1_1) {
        block15: {
            block14: {
                block13: {
                    var2_2 = t9d.c();
                    v0 = var1_1;
                    if (var2_2 != 0) break block13;
                    try {
                        block16: {
                            if (!ErrorCode.succeeded((ErrorCode)v0)) ** GOTO lbl22
                            break block16;
                            catch (Exception v1) {
                                throw _r7$1.a(v1);
                            }
                        }
                        this.al7.j35.setMessageFlushInterval(this.al7.m1i);
                        v0 = this.al7.j35.setUserChangeEventInterval(this.al7._na);
                    }
                    catch (Exception v2) {
                        throw _r7$1.a(v2);
                    }
                }
                try {
                    this.al7._ct();
                    this.al7.feh(_r7$lw7.g2t);
                    if (var2_2 == 0) break block14;
lbl22:
                    // 2 sources

                    this.al7.feh(_r7$lw7.hec);
                }
                catch (Exception v3) {
                    throw _r7$1.a(v3);
                }
            }
            try {
                block17: {
                    v4 = this.al7.n0t;
                    if (var2_2 != 0) break block17;
                    try {
                        block18: {
                            if (v4 == null) break block15;
                            break block18;
                            catch (Exception v5) {
                                throw _r7$1.a(v5);
                            }
                        }
                        v4 = this.al7.n0t;
                    }
                    catch (Exception v6) {
                        throw _r7$1.a(v6);
                    }
                }
                v4.y87(var1_1);
            }
            catch (Exception var3_3) {
                this.al7.djt(var3_3.toString());
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void chatShutdownCallback(ErrorCode var1_1) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        block15: {
                            var2_2 = _r7$1.a ^ 131120473021820L;
                            var4_3 = t9d.b();
                            v0 = var1_1;
                            if (var4_3 == 0) break block15;
                            try {
                                block20: {
                                    if (!ErrorCode.succeeded((ErrorCode)v0)) ** GOTO lbl32
                                    break block20;
                                    catch (Exception v1) {
                                        throw _r7$1.a(v1);
                                    }
                                }
                                v0 = this.al7.rco.shutdown();
                            }
                            catch (Exception v2) {
                                throw _r7$1.a(v2);
                            }
                        }
                        var5_4 = v0;
                        try {
                            if (var4_3 == 0) break block16;
                            if (!ErrorCode.failed((ErrorCode)var5_4)) break block17;
                        }
                        catch (Exception v3) {
                            throw _r7$1.a(v3);
                        }
                        var6_6 = ErrorCode.getString((ErrorCode)var5_4);
                        this.al7.djt(String.format((String)_r7$1.a("o", (int)1022, (long)(3665344403139013186L ^ var2_2)), new Object[]{var6_6}));
                    }
                    this.al7.feh(_r7$lw7.hec);
                }
                try {
                    if (var4_3 != 0) break block18;
lbl32:
                    // 2 sources

                    this.al7.feh(_r7$lw7.g2t);
                    this.al7.djt(String.format((String)_r7$1.a("o", (int)21133, (long)(7813566959331310384L ^ var2_2)), new Object[]{var1_1}));
                }
                catch (Exception v4) {
                    throw _r7$1.a(v4);
                }
            }
            try {
                block21: {
                    v5 = this.al7.n0t;
                    if (var4_3 == 0) break block21;
                    try {
                        block22: {
                            if (v5 == null) break block19;
                            break block22;
                            catch (Exception v6) {
                                throw _r7$1.a(v6);
                            }
                        }
                        v5 = this.al7.n0t;
                    }
                    catch (Exception v7) {
                        throw _r7$1.a(v7);
                    }
                }
                v5._g0(var1_1);
            }
            catch (Exception var5_5) {
                this.al7.djt(var5_5.toString());
            }
        }
    }

    public void chatEmoticonDataDownloadCallback(ErrorCode errorCode) {
        try {
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                this.al7.kng();
            }
        }
        catch (oov oov2) {
            throw _r7$1.a(oov2);
        }
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
        long l = a ^ 0x6FEC8381583BL;
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
        String string = "EG\u008d\u00e8P\u00e1\u00bc#$T\u0005\u00f5|\u00be\u00ba\u0005s\u00c1\u0011\u00eb\n\u0001+<&\u0099\u001d2\u0083/4\u009e\u00eetV#\u00c9\u00ab\u00ee=\u00fd\u007f\u00ab\u00bd\u00bfs\u00b5*\u00e3\u00db\u00ce\u008f\u00b8'\u00e8\u00f2\u0002\u00d1\u009a\u00bc=\u00f3\u00e3\u00fb@w\u0012m\u00ad\u000f\"jn)Js\u00d7\u0000L\u00d7]u\u00c5r4k\u00d4\u0085\u00a9\u00ed1_\u00c7_\u00ee\u00a2\u0014\u0088zT\u0095\u00eae)\u00a0\u00d2\u00e1d\u00db:*\u00a3\u00b5D\u00a6\u00b6W\u00a8=\u00a2J\u00bah(\u00acdA\u00f8\"";
        int n2 = "EG\u008d\u00e8P\u00e1\u00bc#$T\u0005\u00f5|\u00be\u00ba\u0005s\u00c1\u0011\u00eb\n\u0001+<&\u0099\u001d2\u0083/4\u009e\u00eetV#\u00c9\u00ab\u00ee=\u00fd\u007f\u00ab\u00bd\u00bfs\u00b5*\u00e3\u00db\u00ce\u008f\u00b8'\u00e8\u00f2\u0002\u00d1\u009a\u00bc=\u00f3\u00e3\u00fb@w\u0012m\u00ad\u000f\"jn)Js\u00d7\u0000L\u00d7]u\u00c5r4k\u00d4\u0085\u00a9\u00ed1_\u00c7_\u00ee\u00a2\u0014\u0088zT\u0095\u00eae)\u00a0\u00d2\u00e1d\u00db:*\u00a3\u00b5D\u00a6\u00b6W\u00a8=\u00a2J\u00bah(\u00acdA\u00f8\"".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _r7$1.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3305;
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
                throw new RuntimeException("_r7$1", exception);
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
            _r7$1.c[n2] = _r7$1.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = _r7$1.a(n, l);
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
            throw new RuntimeException("_r7$1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(_r7$1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

