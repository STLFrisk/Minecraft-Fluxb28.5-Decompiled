/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class crb {
    public static final ListeningExecutorService wki;
    private static final AtomicInteger yb7;
    private static final Logger smn;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Loose catch block
     */
    public static String m89(Map map) {
        StringBuilder stringBuilder;
        block13: {
            long l = a ^ 0x32E98F97C7AL;
            StringBuilder stringBuilder2 = new StringBuilder();
            Iterator iterator = map.entrySet().iterator();
            int n = t9d.b();
            while (iterator.hasNext()) {
                block16: {
                    Map.Entry entry;
                    block14: {
                        block15: {
                            block17: {
                                entry = iterator.next();
                                stringBuilder = stringBuilder2;
                                if (n == 0) break block13;
                                if (n == 0) break block14;
                                break block17;
                                catch (UnsupportedEncodingException unsupportedEncodingException) {
                                    throw crb.a(unsupportedEncodingException);
                                }
                            }
                            try {
                                block18: {
                                    if (stringBuilder.length() <= 0) break block15;
                                    break block18;
                                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                                        throw crb.a(unsupportedEncodingException);
                                    }
                                }
                                stringBuilder2.append('&');
                            }
                            catch (UnsupportedEncodingException unsupportedEncodingException) {
                                throw crb.a(unsupportedEncodingException);
                            }
                        }
                        try {
                            stringBuilder2.append(URLEncoder.encode((String)entry.getKey(), (String)((Object)crb.a("c", (int)25900, (long)(0x7E7306AD3B4CB6F0L ^ l)))));
                        }
                        catch (UnsupportedEncodingException unsupportedEncodingException) {
                            unsupportedEncodingException.printStackTrace();
                        }
                    }
                    try {
                        if (entry.getValue() == null) break block16;
                        stringBuilder2.append('=');
                        stringBuilder2.append(URLEncoder.encode(entry.getValue().toString(), (String)((Object)crb.a("c", (int)4400, (long)(0x7DFF9CA84B20C2E2L ^ l)))));
                        break block16;
                    }
                    catch (oov oov2) {
                        throw crb.a(oov2);
                    }
                    {
                        catch (UnsupportedEncodingException unsupportedEncodingException) {
                            unsupportedEncodingException.printStackTrace();
                        }
                    }
                }
                if (n != 0) continue;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public static String zv4(URL uRL, Map map, boolean bl) {
        return crb.oc_(uRL, crb.m89(map), bl);
    }

    /*
     * Loose catch block
     */
    private static String oc_(URL uRL, String string, boolean bl) {
        long l = a ^ 0x2B6AF234802BL;
        int n = t9d.b();
        try {
            StringBuffer stringBuffer;
            block20: {
                String string2;
                Proxy proxy;
                block19: {
                    Proxy proxy2;
                    block18: {
                        Proxy proxy3;
                        block17: {
                            vr1 vr12;
                            block15: {
                                block16: {
                                    vr12 = vr1._0v();
                                    if (n == 0) break block15;
                                    try {
                                        block21: {
                                            if (vr12 != null) break block16;
                                            break block21;
                                            catch (Exception exception) {
                                                throw crb.a(exception);
                                            }
                                        }
                                        proxy3 = null;
                                        break block17;
                                    }
                                    catch (Exception exception) {
                                        throw crb.a(exception);
                                    }
                                }
                                vr12 = vr1._0v();
                            }
                            proxy3 = vr12.m0e();
                        }
                        proxy = proxy3;
                        try {
                            proxy2 = proxy;
                            if (n == 0) break block18;
                            if (proxy2 != null) break block19;
                        }
                        catch (Exception exception) {
                            throw crb.a(exception);
                        }
                        proxy2 = Proxy.NO_PROXY;
                    }
                    proxy = proxy2;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
                httpURLConnection.setRequestMethod((String)((Object)crb.a("c", (int)19263, (long)(0x335D638D531264B8L ^ l))));
                httpURLConnection.setRequestProperty((String)((Object)crb.a("c", (int)4831, (long)(0x7CACA1BD52D73D5AL ^ l))), (String)((Object)crb.a("c", (int)3931, (long)(0x2315FA7357120DDL ^ l))));
                httpURLConnection.setRequestProperty((String)((Object)crb.a("c", (int)16220, (long)(0x2855A72F263C90D0L ^ l))), "" + string.getBytes().length);
                httpURLConnection.setRequestProperty((String)((Object)crb.a("c", (int)23229, (long)(0x5733CE693DB3753FL ^ l))), (String)((Object)crb.a("c", (int)16167, (long)(0x6D4A40C4038590A3L ^ l))));
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(string);
                dataOutputStream.flush();
                dataOutputStream.close();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                stringBuffer = new StringBuffer();
                while ((string2 = bufferedReader.readLine()) != null) {
                    try {
                        stringBuffer.append(string2);
                        stringBuffer.append('\r');
                        if (n != 0) {
                            if (n != 0) continue;
                            break;
                        }
                        break block20;
                    }
                    catch (Exception exception) {
                        throw crb.a(exception);
                    }
                }
                bufferedReader.close();
            }
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            try {
                if (!bl) {
                    smn.error((String)((Object)crb.a("c", (int)11998, (long)(0x2DE97D73E3088150L ^ l))) + uRL, (Throwable)exception);
                }
            }
            catch (Exception exception2) {
                throw crb.a(exception2);
            }
            return "";
        }
    }

    public static ListenableFuture xni(File file, String string, Map map, int n, sw6 sw62, Proxy proxy) {
        ListenableFuture listenableFuture = wki.submit((Runnable)new crb$1(sw62, string, proxy, map, file, n));
        return listenableFuture;
    }

    public static int rtp() {
        int n;
        block11: {
            ServerSocket serverSocket = null;
            n = -1;
            int n2 = t9d.b();
            try {
                serverSocket = new ServerSocket(0);
                n = serverSocket.getLocalPort();
            }
            catch (Throwable throwable) {
                block13: {
                    try {
                        ServerSocket serverSocket2;
                        block12: {
                            try {
                                serverSocket2 = serverSocket;
                                if (n2 == 0) break block12;
                                if (serverSocket2 == null) break block13;
                            }
                            catch (IOException iOException) {
                                throw crb.a(iOException);
                            }
                            serverSocket2 = serverSocket;
                        }
                        serverSocket2.close();
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
            try {
                ServerSocket serverSocket3;
                block10: {
                    try {
                        serverSocket3 = serverSocket;
                        if (n2 == 0) break block10;
                        if (serverSocket3 == null) break block11;
                    }
                    catch (IOException iOException) {
                        throw crb.a(iOException);
                    }
                    serverSocket3 = serverSocket;
                }
                serverSocket3.close();
            }
            catch (IOException iOException) {}
        }
        return n;
    }

    public static String qq0(URL uRL) {
        StringBuilder stringBuilder;
        block4: {
            String string;
            long l = a ^ 0x158EFAD0590FL;
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod((String)((Object)crb.a("c", (int)19408, (long)(0x47FEBD9F8A55BD75L ^ l))));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            stringBuilder = new StringBuilder();
            int n = t9d.b();
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    stringBuilder.append(string);
                    stringBuilder.append('\r');
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw crb.a(oov2);
                }
            }
            bufferedReader.close();
        }
        return stringBuilder.toString();
    }

    public static Logger yzg() {
        return smn;
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

                crb.a = c.a(-7534500093400532619L, -591838651340445602L, MethodHandles.lookup().lookupClass()).a(110560248342868L);
                var9 = crb.a ^ 70068602682722L;
                crb.d = new HashMap<K, V>(13);
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
                var7_3 = new String[11];
                var5_4 = 0;
                var4_5 = "\u00f8\u00b5sg\u00e7\u0004\u00f7:\u007f\u0004lNp$\u0013\u00dd\u0018\u00a2\u00ff\u00e4\u00a3\u00a5E\u00f7\u000b\u007f\u0098a;\u00890\u008b\u0095\u0015z\u0099\u00a3\u00db\u00db\u001bi@I\u0006\u00ee\u00ae\u0084\u00f4\u00c2\u008b\u0003\u00aeO\u009b\u00b7\u009b\u00dfh\u00030\u001f\fV\u00f3Cv\u00f4Be\u0088C\u00a3U\u0082\u0081L\u0015Re=\u009f\u00ed\u001f/\u00ce\u00cd$\u00a4g\u00de\u00ba\u00c3cq/\u00b6\u0093\u0005Lb\u00e3\u0088\u00d4\u00fdh\u00f7\u0010K\u00c5\u00e01n\u00b9\u00a1\"W\u00d2\u0006\u00d7\u0081\u00f1+\u00ab \f\u00b4\u0013\u00b6a\u00f9\u00b14\u00ef\u00a8sM\u009b\u000f\u00e1\u00e2 \u00ea\u00c3Y\u0004\u009a9%-)a}[\u00bb\u00e0o\u0010\u0019\u00cf/\u00e8S\u008c\u00c0T\u00ee\u00f8Rt\u00d9\u0019\u0016P(\u00e7Q\u00ab\u009eX\u000e\u00eb\u0018b\u00a7j\u00c3HR\u0005\u00c3\u00f7\u00dbT\u0010o\u0085\u0095\u00f29\u0085n\u00a6\u00b5\u0019\u0003\u00c4d\u00fd\u0016\u00c9\u00f0\u00fed\u0080\u0010\u00b1\u00f8\b\u008c\u00b6@[\u009cB|\u00a0\u0086\u008f]\u00fa\u00c8\u0018\u00de\u00ff\u00ab;\u0081\u0011\u00a5]\u001e\u0091^\u00fc&\u0080\u0017\n\u00aa\u00b7\u00a5>&\u0080e\u00aa";
                var6_6 = "\u00f8\u00b5sg\u00e7\u0004\u00f7:\u007f\u0004lNp$\u0013\u00dd\u0018\u00a2\u00ff\u00e4\u00a3\u00a5E\u00f7\u000b\u007f\u0098a;\u00890\u008b\u0095\u0015z\u0099\u00a3\u00db\u00db\u001bi@I\u0006\u00ee\u00ae\u0084\u00f4\u00c2\u008b\u0003\u00aeO\u009b\u00b7\u009b\u00dfh\u00030\u001f\fV\u00f3Cv\u00f4Be\u0088C\u00a3U\u0082\u0081L\u0015Re=\u009f\u00ed\u001f/\u00ce\u00cd$\u00a4g\u00de\u00ba\u00c3cq/\u00b6\u0093\u0005Lb\u00e3\u0088\u00d4\u00fdh\u00f7\u0010K\u00c5\u00e01n\u00b9\u00a1\"W\u00d2\u0006\u00d7\u0081\u00f1+\u00ab \f\u00b4\u0013\u00b6a\u00f9\u00b14\u00ef\u00a8sM\u009b\u000f\u00e1\u00e2 \u00ea\u00c3Y\u0004\u009a9%-)a}[\u00bb\u00e0o\u0010\u0019\u00cf/\u00e8S\u008c\u00c0T\u00ee\u00f8Rt\u00d9\u0019\u0016P(\u00e7Q\u00ab\u009eX\u000e\u00eb\u0018b\u00a7j\u00c3HR\u0005\u00c3\u00f7\u00dbT\u0010o\u0085\u0095\u00f29\u0085n\u00a6\u00b5\u0019\u0003\u00c4d\u00fd\u0016\u00c9\u00f0\u00fed\u0080\u0010\u00b1\u00f8\b\u008c\u00b6@[\u009cB|\u00a0\u0086\u008f]\u00fa\u00c8\u0018\u00de\u00ff\u00ab;\u0081\u0011\u00a5]\u001e\u0091^\u00fc&\u0080\u0017\n\u00aa\u00b7\u00a5>&\u0080e\u00aa".length();
                var3_7 = 16;
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
                    var7_3[var5_4++] = crb.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "*V\u00e6\u00e3\u0016\u00b9\u00df\f\u00cc$D\u0003V~\u009a\u0096(\u00b7\u0019\u00e5}\r\u00ef%\u0088\u00055Ky%.\u00ee\u00ae\u00a6\u0002\u0017\u00fa\u00a2\u008e\u00caoy\u0088\u00db\u00a2\u0006\u00edB9\u00d3?\u00b9\u009f\u00c85\u000bY";
                    var6_6 = "*V\u00e6\u00e3\u0016\u00b9\u00df\f\u00cc$D\u0003V~\u009a\u0096(\u00b7\u0019\u00e5}\r\u00ef%\u0088\u00055Ky%.\u00ee\u00ae\u00a6\u0002\u0017\u00fa\u00a2\u008e\u00caoy\u0088\u00db\u00a2\u0006\u00edB9\u00d3?\u00b9\u009f\u00c85\u000bY".length();
                    var3_7 = 16;
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
                    var7_3[var5_4++] = crb.a(var8_9).intern();
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
        crb.b = var7_3;
        crb.c = new String[11];
        crb.wki = MoreExecutors.listeningDecorator((ExecutorService)Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat((String)crb.a("c", (int)8810, (long)(4201737998379462819L ^ var9))).build()));
        crb.yb7 = new AtomicInteger(0);
        crb.smn = LogManager.getLogger();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2DA2;
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
                throw new RuntimeException("crb", exception);
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
            crb.c[n2] = crb.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = crb.a(n, l);
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
            throw new RuntimeException("crb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(crb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

