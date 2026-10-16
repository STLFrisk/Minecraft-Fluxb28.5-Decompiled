/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.Proxy;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import net.optifine.http.HttpPipeline;
import net.optifine.http.HttpRequest;
import net.optifine.http.HttpResponse;
import net.optifine.player.CapeImageBuffer;
import net.optifine.shaders.ShadersTex;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bhs
extends xfj {
    private static final Logger u9t;
    private static final AtomicInteger txl;
    private final File h2_;
    private final String go9;
    private final ji7 i25;
    private BufferedImage a9h;
    private Thread y_9;
    private boolean v_6;
    public Boolean shl = null;
    public boolean sfs = false;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public bhs(File file, String string, gdz gdz2, ji7 ji72) {
        super(gdz2);
        this.h2_ = file;
        this.go9 = string;
        this.i25 = ji72;
    }

    private void c4q() {
        block19: {
            int n;
            block22: {
                bhs bhs2;
                block21: {
                    block20: {
                        block18: {
                            n = t9d.c();
                            try {
                                try {
                                    bhs2 = this;
                                    if (n != 0) break block18;
                                    if (bhs2.v_6) break block19;
                                }
                                catch (oov oov2) {
                                    throw bhs.a(oov2);
                                }
                                bhs2 = this;
                            }
                            catch (oov oov3) {
                                throw bhs.a(oov3);
                            }
                        }
                        try {
                            try {
                                if (n != 0) break block20;
                                if (bhs2.a9h == null) break block19;
                            }
                            catch (oov oov4) {
                                throw bhs.a(oov4);
                            }
                            this.v_6 = true;
                            bhs2 = this;
                        }
                        catch (oov oov5) {
                            throw bhs.a(oov5);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block21;
                            if (bhs2.h9l == null) break block22;
                        }
                        catch (oov oov6) {
                            throw bhs.a(oov6);
                        }
                        bhs2 = this;
                    }
                    catch (oov oov7) {
                        throw bhs.a(oov7);
                    }
                }
                bhs2.wo5();
            }
            try {
                int n2;
                block23: {
                    try {
                        try {
                            n2 = hxt.ly3();
                            if (n != 0) break block19;
                            if (n2 == 0) break block23;
                        }
                        catch (oov oov8) {
                            throw bhs.a(oov8);
                        }
                        ShadersTex.loadSimpleTexture(super.getGlTextureId(), this.a9h, false, false, hxt.q5m(), this.h9l, this.getMultiTexID());
                        if (n == 0) break block19;
                    }
                    catch (oov oov9) {
                        throw bhs.a(oov9);
                    }
                }
                n2 = p9t.xr5(super.getGlTextureId(), this.a9h);
            }
            catch (oov oov10) {
                throw bhs.a(oov10);
            }
        }
    }

    @Override
    public int getGlTextureId() {
        this.c4q();
        return super.getGlTextureId();
    }

    public void asj(BufferedImage bufferedImage) {
        boolean bl;
        block6: {
            bhs bhs2;
            block7: {
                int n = t9d.b();
                try {
                    try {
                        this.a9h = bufferedImage;
                        bhs2 = this;
                        if (n == 0) break block6;
                        if (bhs2.i25 == null) break block7;
                    }
                    catch (oov oov2) {
                        throw bhs.a(oov2);
                    }
                    this.i25.skinAvailable();
                }
                catch (oov oov3) {
                    throw bhs.a(oov3);
                }
            }
            bhs2 = this;
        }
        try {
            bl = this.a9h != null;
        }
        catch (oov oov4) {
            throw bhs.a(oov4);
        }
        bhs2.shl = bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void loadTexture(y99 var1_1) {
        block30: {
            block31: {
                block36: {
                    block29: {
                        block27: {
                            block28: {
                                block33: {
                                    block32: {
                                        var2_2 = bhs.a ^ 8689458704783L;
                                        var4_3 = t9d.c();
                                        v0 = this;
                                        if (var4_3 != 0) break block27;
                                        if (v0.a9h != null) break block28;
                                        break block32;
                                        catch (IOException v1) {
                                            throw bhs.a(v1);
                                        }
                                    }
                                    v0 = this;
                                    if (var4_3 != 0) break block27;
                                    break block33;
                                    catch (IOException v2) {
                                        throw bhs.a(v2);
                                    }
                                }
                                try {
                                    block34: {
                                        if (v0.h9l == null) break block28;
                                        break block34;
                                        catch (IOException v3) {
                                            throw bhs.a(v3);
                                        }
                                    }
                                    super.loadTexture(var1_1);
                                }
                                catch (IOException v4) {
                                    throw bhs.a(v4);
                                }
                            }
                            v0 = this;
                        }
                        if (var4_3 != 0) break block29;
                        try {
                            block35: {
                                if (v0.y_9 != null) break block30;
                                break block35;
                                catch (IOException v5) {
                                    throw bhs.a(v5);
                                }
                            }
                            v0 = this;
                        }
                        catch (IOException v6) {
                            throw bhs.a(v6);
                        }
                    }
                    if (var4_3 != 0) break block31;
                    if (v0.h2_ == null) ** GOTO lbl85
                    break block36;
                    catch (IOException v7) {
                        throw bhs.a(v7);
                    }
                }
                try {
                    block37: {
                        v0 = this;
                        if (var4_3 != 0) break block31;
                        break block37;
                        catch (IOException v8) {
                            throw bhs.a(v8);
                        }
                    }
                    if (v0.h2_.isFile()) {
                    }
                    ** GOTO lbl85
                }
                catch (IOException v9) {
                    throw bhs.a(v9);
                }
                bhs.u9t.debug((String)bhs.b("l", (int)12553, (long)(6947985997053597522L ^ var2_2)), new Object[]{this.h2_});
                try {
                    this.a9h = ImageIO.read(this.h2_);
                    v10 = this;
                    if (var4_3 == 0) {
                        try {
                            if (v10.i25 != null) {
                                this.asj(this.i25.parseUserSkin(this.a9h));
                            }
                        }
                        catch (IOException v11) {
                            throw bhs.a(v11);
                        }
                        v10 = this;
                    }
                    v10.c_e();
                    break block30;
                }
                catch (IOException var5_4) {
                    try {
                        bhs.u9t.error((String)bhs.b("l", (int)5577, (long)(7719202272055505815L ^ var2_2)) + this.h2_, (Throwable)var5_4);
                        this.ojr();
                        if (var4_3 == 0) break block30;
lbl85:
                        // 3 sources

                        v0 = this;
                    }
                    catch (IOException v12) {
                        throw bhs.a(v12);
                    }
                }
            }
            v0.ojr();
        }
    }

    public void ojr() {
        long l = a ^ 0x77F014DA1385L;
        this.y_9 = new bhs$1(this, (String)((Object)bhs.b("l", (int)30040, (long)(0x5152E2FBC52AB10FL ^ l))) + txl.incrementAndGet());
        this.y_9.setDaemon(true);
        this.y_9.start();
    }

    private boolean orc() {
        boolean bl;
        block12: {
            long l;
            block11: {
                Proxy.Type type;
                Proxy.Type type2;
                block10: {
                    int n;
                    block9: {
                        boolean bl2;
                        block8: {
                            l = a ^ 0x7E77B6516782L;
                            n = t9d.b();
                            try {
                                bl2 = this.sfs;
                                if (n == 0) break block8;
                                if (bl2) break block9;
                            }
                            catch (oov oov2) {
                                throw bhs.a(oov2);
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    Proxy proxy = c05.vz1().snb();
                    try {
                        try {
                            type2 = proxy.type();
                            type = Proxy.Type.DIRECT;
                            if (n == 0) break block10;
                            if (type2 == type) break block11;
                        }
                        catch (oov oov3) {
                            throw bhs.a(oov3);
                        }
                        type2 = proxy.type();
                        type = Proxy.Type.SOCKS;
                    }
                    catch (oov oov4) {
                        throw bhs.a(oov4);
                    }
                }
                try {
                    if (type2 == type) break block11;
                    bl = false;
                    break block12;
                }
                catch (oov oov5) {
                    throw bhs.a(oov5);
                }
            }
            bl = this.go9.startsWith((String)((Object)bhs.b("l", (int)2537, (long)(0x179D5C0E8F8B9BBL ^ l))));
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private void r5l() {
        long l = a ^ 0x7CDDDFF749ECL;
        int n = t9d.c();
        try {
            bhs bhs2;
            block20: {
                BufferedImage bufferedImage;
                block21: {
                    block24: {
                        ByteArrayInputStream byteArrayInputStream;
                        block19: {
                            File file;
                            block18: {
                                HttpResponse httpResponse;
                                block16: {
                                    HttpResponse httpResponse2;
                                    block17: {
                                        HttpRequest httpRequest = HttpPipeline.makeRequest(this.go9, c05.vz1().snb());
                                        httpResponse2 = HttpPipeline.executeRequest(httpRequest);
                                        try {
                                            httpResponse = httpResponse2;
                                            if (n != 0) break block16;
                                            if (httpResponse.getStatus() / 100 == 2) break block17;
                                        }
                                        catch (Exception exception) {
                                            throw bhs.a(exception);
                                        }
                                        return;
                                    }
                                    httpResponse = httpResponse2;
                                }
                                byte[] byArray = httpResponse.getBody();
                                byteArrayInputStream = new ByteArrayInputStream(byArray);
                                file = this.h2_;
                                if (n != 0) break block18;
                                try {
                                    block23: {
                                        if (file == null) break block19;
                                        break block23;
                                        catch (Exception exception) {
                                            throw bhs.a(exception);
                                        }
                                    }
                                    FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, (File)this.h2_);
                                    file = this.h2_;
                                }
                                catch (Exception exception) {
                                    throw bhs.a(exception);
                                }
                            }
                            bufferedImage = ImageIO.read(file);
                            if (n == 0) break block24;
                        }
                        bufferedImage = p9t.h3z(byteArrayInputStream);
                    }
                    try {
                        bhs2 = this;
                        if (n != 0) break block20;
                        if (bhs2.i25 == null) break block21;
                    }
                    catch (Exception exception) {
                        throw bhs.a(exception);
                    }
                    bufferedImage = this.i25.parseUserSkin(bufferedImage);
                }
                this.asj(bufferedImage);
                bhs2 = this;
            }
            bhs2.c_e();
        }
        catch (Exception exception) {
            u9t.error((String)((Object)bhs.b("l", (int)13161, (long)(0x3323BECC35D32D50L ^ l))) + exception.getClass().getName() + (String)((Object)bhs.b("l", (int)23126, (long)(0x3AA57DA73B984469L ^ l))) + exception.getMessage());
            return;
        }
        finally {
            this.c_e();
        }
    }

    private void c_e() {
        block7: {
            ji7 ji72;
            block6: {
                boolean bl;
                int n = t9d.b();
                try {
                    bhs bhs2 = this;
                    bl = this.a9h != null;
                }
                catch (oov oov2) {
                    throw bhs.a(oov2);
                }
                try {
                    try {
                        bhs2.shl = bl;
                        ji72 = this.i25;
                        if (n == 0) break block6;
                        if (!(ji72 instanceof CapeImageBuffer)) break block7;
                    }
                    catch (oov oov3) {
                        throw bhs.a(oov3);
                    }
                    ji72 = this.i25;
                }
                catch (oov oov4) {
                    throw bhs.a(oov4);
                }
            }
            CapeImageBuffer capeImageBuffer = (CapeImageBuffer)ji72;
            capeImageBuffer.cleanup();
        }
    }

    public ji7 hi6() {
        return this.i25;
    }

    public static String cfu(bhs bhs2) {
        return bhs2.go9;
    }

    public static File bvz(bhs bhs2) {
        return bhs2.h2_;
    }

    public static Logger beq() {
        return u9t;
    }

    public static boolean w3b(bhs bhs2) {
        return bhs2.orc();
    }

    public static void qi7(bhs bhs2) {
        bhs2.r5l();
    }

    public static ji7 ef_(bhs bhs2) {
        return bhs2.i25;
    }

    public static void snf(bhs bhs2) {
        bhs2.c_e();
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

                bhs.a = c.a(-3912961265673666428L, -8390100536238309226L, MethodHandles.lookup().lookupClass()).a(15926184614955L);
                bhs.h = new HashMap<K, V>(13);
                var0 = bhs.a ^ 14986452723501L;
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
                var6_5 = ",^7\u00bc\u00d9Oh\f\u001c\u0012\u00fa\u0091\u00ce0\u00ae\u00e5r\t\u009ah\u00cb%\u00ea\u00aa\u0017\u00db\\\u0096\u0011\u00f5\u00c7-\f\u00df\u00e3\u00f2\n\u0015Z&\u0010u?\u00dd\u00c9\u00c3\u0096\u0005\u0085\u00ad\u009a\u00c9\u00ed\u00efY*\u0090\u0010k#\u00e0+P\u00b5\u008d\u00a0a\r\u00a9\u00ca\u008c\u00e7\u001b\u00a6(Q\u009e\u008a\u0003\u00f36S\u0015j\u00cbI\u0014\u00a8(\u0087\u00b0&-\u00f4\u00ca\n\u008a<D\u00a0\u0086\u000eM\u009d\u0084\u00addL\u001cIs\u0080\u00c2$3";
                var8_6 = ",^7\u00bc\u00d9Oh\f\u001c\u0012\u00fa\u0091\u00ce0\u00ae\u00e5r\t\u009ah\u00cb%\u00ea\u00aa\u0017\u00db\\\u0096\u0011\u00f5\u00c7-\f\u00df\u00e3\u00f2\n\u0015Z&\u0010u?\u00dd\u00c9\u00c3\u0096\u0005\u0085\u00ad\u009a\u00c9\u00ed\u00efY*\u0090\u0010k#\u00e0+P\u00b5\u008d\u00a0a\r\u00a9\u00ca\u008c\u00e7\u001b\u00a6(Q\u009e\u008a\u0003\u00f36S\u0015j\u00cbI\u0014\u00a8(\u0087\u00b0&-\u00f4\u00ca\n\u008a<D\u00a0\u0086\u000eM\u009d\u0084\u00addL\u001cIs\u0080\u00c2$3".length();
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
                    var9_3[var7_4++] = bhs.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0084\u0011\u0091\u008e\u00d2\u008f\b\u008cr\u00b7\u00a7\u00db\u00e2e8\u0003\u0093\u0015\u0082\u0095j\u00a8\u0084\u0014a\u009a\u0096!F}kF\u00b6\u00ca\u00fc\u000e%\u00a6\tkz=j\u00f1t\u00ba\u00f0\u009bC@\u00cc\"\u00f4K\u00e2|\u00fc<\u00fb\u0017\u00be\u0092\u007f\u00bdP\u00f8l\u0017\u0086\u00b2\u0083#\u001d\u00d3\u00d21\u00f3R\n\u00a7\u000eg\u009b\u000e<\u00e0\\\u00bd,2\u008f\u00aa\u00a5q\u001eAd\u0092RJ^\u0016M\u0099-\u00bc\u00de\u00eax\u00d5>\u0011\u00bb\"\u00bb\u00bcs7\u00de\u00b3\u00b4$\u00b6\u008d\"\u0093\u00ff\u001d\u00f9\"\u00ae\u00cf\u00e5\u00c4\u0012m\u000fT\u00f5\u00b9\u00af\u00ec\n\u00f0N";
                    var8_6 = "\u0084\u0011\u0091\u008e\u00d2\u008f\b\u008cr\u00b7\u00a7\u00db\u00e2e8\u0003\u0093\u0015\u0082\u0095j\u00a8\u0084\u0014a\u009a\u0096!F}kF\u00b6\u00ca\u00fc\u000e%\u00a6\tkz=j\u00f1t\u00ba\u00f0\u009bC@\u00cc\"\u00f4K\u00e2|\u00fc<\u00fb\u0017\u00be\u0092\u007f\u00bdP\u00f8l\u0017\u0086\u00b2\u0083#\u001d\u00d3\u00d21\u00f3R\n\u00a7\u000eg\u009b\u000e<\u00e0\\\u00bd,2\u008f\u00aa\u00a5q\u001eAd\u0092RJ^\u0016M\u0099-\u00bc\u00de\u00eax\u00d5>\u0011\u00bb\"\u00bb\u00bcs7\u00de\u00b3\u00b4$\u00b6\u008d\"\u0093\u00ff\u001d\u00f9\"\u00ae\u00cf\u00e5\u00c4\u0012m\u000fT\u00f5\u00b9\u00af\u00ec\n\u00f0N".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = bhs.b(var10_9).intern();
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
        bhs.f = var9_3;
        bhs.g = new String[6];
        bhs.u9t = LogManager.getLogger();
        bhs.txl = new AtomicInteger(0);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x244E;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("bhs", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            bhs.g[n2] = bhs.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bhs.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("bhs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bhs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

