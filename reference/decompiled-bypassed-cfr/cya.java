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

public class cya
extends gbe {
    private final ggv avs;
    private pss jfy = pss.qk_();
    private String bwh;
    private String scq;
    private String t4j;
    private cya$ga4 dic;
    private gt4 _3f;
    private gt4 k9a;
    private gt4 pgr;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public cya(ggv ggv2, String string) {
        this.avs = ggv2;
        this.oua(string);
    }

    public String u58() {
        return this.jfy.toString();
    }

    public void oua(String string) {
        this.jfy = pss.ggu(string);
    }

    @Override
    public void initGui() {
        long l = a ^ 0x3353E757B78BL;
        this.khf.clear();
        this.bwh = fc1.gx1((String)((Object)cya.b("j", (int)31179, (long)(0x4AB0B33F1594F1CEL ^ l))), new Object[0]);
        this.scq = fc1.gx1((String)((Object)cya.b("j", (int)25712, (long)(0x67EBF9F18F18EC7FL ^ l))), new Object[0]);
        this.t4j = fc1.gx1((String)((Object)cya.b("j", (int)23382, (long)(0x4469790AAD31535DL ^ l))), new Object[0]);
        this.dic = new cya$ga4(this);
        this._3f = new gt4(2, this.dt7 / 2 - 154, this.o1e - 52, 100, 20, fc1.gx1((String)((Object)cya.b("j", (int)15566, (long)(0x6ED2804959ADB4C0L ^ l))), new Object[0]) + (String)((Object)cya.b("j", (int)31918, (long)(0x14AD57BA974D74A6L ^ l))));
        this.khf.add(this._3f);
        this.k9a = new gt4(3, this.dt7 / 2 - 50, this.o1e - 52, 100, 20, fc1.gx1((String)((Object)cya.b("j", (int)22335, (long)(0x5676A0382E03DF36L ^ l))), new Object[0]) + (String)((Object)cya.b("j", (int)18195, (long)(0x23C70208CEF74F14L ^ l))));
        this.khf.add(this.k9a);
        this.pgr = new gt4(4, this.dt7 / 2 - 155, this.o1e - 52, 150, 20, fc1.gx1((String)((Object)cya.b("j", (int)11371, (long)(0x5778F937743A2467L ^ l))), new Object[0]));
        this.khf.add(this.pgr);
        this.khf.add(new gt4(0, this.dt7 / 2 - 155, this.o1e - 28, 150, 20, fc1.gx1((String)((Object)cya.b("j", (int)10869, (long)(0x553AC26D42C2271L ^ l))), new Object[0])));
        this.khf.add(new gt4(5, this.dt7 / 2 + 5, this.o1e - 52, 150, 20, fc1.gx1((String)((Object)cya.b("j", (int)3552, (long)(0x45A5C590396085EDL ^ l))), new Object[0])));
        this.khf.add(new gt4(1, this.dt7 / 2 + 5, this.o1e - 28, 150, 20, fc1.gx1((String)((Object)cya.b("j", (int)31365, (long)(0x33B9FA987ED1F28FL ^ l))), new Object[0])));
        this.k9a.c1s = false;
        this._3f.c1s = false;
        this.jfy.sy0();
        this.iop();
    }

    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        this.dic.gzb();
    }

    @Override
    public void actionPerformed(gt4 gt42) {
        cya cya2;
        block35: {
            block29: {
                int n;
                int n2;
                block34: {
                    int n3;
                    int n4;
                    block32: {
                        block30: {
                            block27: {
                                n4 = t9d.b();
                                n2 = this.jfy.t48().size() - this.dic.xqg - 1;
                                try {
                                    block28: {
                                        try {
                                            try {
                                                n = gt42._me;
                                                if (n4 == 0) break block27;
                                                if (n != 1) break block28;
                                            }
                                            catch (oov oov2) {
                                                throw cya.a(oov2);
                                            }
                                            this.f41.z2i(this.avs);
                                            if (n4 != 0) break block29;
                                        }
                                        catch (oov oov3) {
                                            throw cya.a(oov3);
                                        }
                                    }
                                    n = gt42._me;
                                }
                                catch (oov oov4) {
                                    throw cya.a(oov4);
                                }
                            }
                            try {
                                block31: {
                                    try {
                                        try {
                                            if (n4 == 0) break block30;
                                            if (n != 0) break block31;
                                        }
                                        catch (oov oov5) {
                                            throw cya.a(oov5);
                                        }
                                        this.avs.ud2 = this.u58();
                                        this.f41.z2i(this.avs);
                                        if (n4 != 0) break block29;
                                    }
                                    catch (oov oov6) {
                                        throw cya.a(oov6);
                                    }
                                }
                                n = gt42._me;
                            }
                            catch (oov oov7) {
                                throw cya.a(oov7);
                            }
                        }
                        try {
                            try {
                                block33: {
                                    try {
                                        try {
                                            n3 = 5;
                                            if (n4 == 0) break block32;
                                            if (n != n3) break block33;
                                        }
                                        catch (oov oov8) {
                                            throw cya.a(oov8);
                                        }
                                        this.f41.z2i(new wir(this));
                                        if (n4 != 0) break block29;
                                    }
                                    catch (oov oov9) {
                                        throw cya.a(oov9);
                                    }
                                }
                                n = gt42._me;
                                if (n4 == 0) break block34;
                            }
                            catch (oov oov10) {
                                throw cya.a(oov10);
                            }
                            n3 = 4;
                        }
                        catch (oov oov11) {
                            throw cya.a(oov11);
                        }
                    }
                    try {
                        try {
                            if (n != n3) break block29;
                            cya2 = this;
                            if (n4 == 0) break block35;
                        }
                        catch (oov oov12) {
                            throw cya.a(oov12);
                        }
                        n = cya2.qsh() ? 1 : 0;
                    }
                    catch (oov oov13) {
                        throw cya.a(oov13);
                    }
                }
                try {
                    if (n != 0) {
                        this.jfy.t48().remove(n2);
                        this.dic.xqg = Math.min(this.dic.xqg, this.jfy.t48().size() - 1);
                    }
                }
                catch (oov oov14) {
                    throw cya.a(oov14);
                }
            }
            this.jfy.sy0();
            cya2 = this;
        }
        cya2.iop();
    }

    public void iop() {
        boolean bl;
        this.pgr.c9a = bl = this.qsh();
        this.k9a.c9a = bl;
        this.k9a.c9a = false;
        this._3f.c9a = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean qsh() {
        int n;
        int n2;
        block6: {
            int n3 = t9d.c();
            try {
                try {
                    try {
                        n2 = this.dic.xqg;
                        n = -1;
                        if (n3 != 0) break block6;
                        if (n2 <= n) return 0 != 0;
                    }
                    catch (oov oov2) {
                        throw cya.a(oov2);
                    }
                    n2 = this.dic.xqg;
                    if (n3 != 0) return n2 != 0;
                }
                catch (oov oov3) {
                    throw cya.a(oov3);
                }
                n = this.jfy.t48().size();
            }
            catch (oov oov4) {
                throw cya.a(oov4);
            }
        }
        if (n2 >= n) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        this.xmz();
        this.dic.j46(n, n2, f);
        this.poi(this.fex, this.bwh, this.dt7 / 2, 8, 0xFFFFFF);
        int n3 = this.dt7 / 2 - 92 - 16;
        this.c_t(this.fex, this.scq, n3, 32, 0xFFFFFF);
        this.c_t(this.fex, this.t4j, n3 + 2 + 213 - this.fex.ezt(this.t4j), 32, 0xFFFFFF);
        super.drawScreen(n, n2, f);
    }

    public static pss w72(cya cya2) {
        return cya2.jfy;
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

                cya.a = c.a(644537642303081004L, 4780881525340628152L, MethodHandles.lookup().lookupClass()).a(123227347894671L);
                cya.h = new HashMap<K, V>(13);
                var0 = cya.a ^ 129610837165698L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "\u00a58T\u00d0T\u00baoF\u00acWU9'm'\u00955\u00dd,9J\u00e3\u009b\u00c9\u00a3\u0019$\u001a^\u00c6\u00f1\u000bL\u00eb\u00d5\u00f4\u0095v\u0011\u00f9\u00fd{+U\u0094\u00e5\u00f0\u0086@'Y\u00f1\u0018\u00c8E}ZB\u00e2\u00b4\u0015wpd/\u0083\u00ca/\u0099M\u008aq\u0091\u00b0\u00c1\u00b0\u00ddo\u00b2\u0081\u001e\u0091\u00c3\u0095ZZ\u00e9S\u00b0^\u00ca\u008e\u0005\u00c4/\u00b0's\u00b9$9\u00a2\u00ce^\u00fa\u00d91\u00ca\u00e5Z\u00fe\u00feT8\u00f7I\u00b6Q>\u0084\u00d0\u009e\u0093-\u0095Hn\u000e\u00d8\u0099\u00d0\u00d2\u00acb\u0004\u008d@\u00cc\u000f\u009f\u001e\u00a6q\u001d\u00a2\u00b7\u00e8\u001c\u00cb9J\u00a9R\u00b5\u00ba\u00aeB~!\u00b9\u00c8\u00d9}O1\u001a\u000f\u008a\\\u009fH\u008d\u00dc\u00f3\u0087X\u000e\u00feI:Ez\u00bb\u0013\u00d7\u009fNFH\u00be\u00164^\u001a\u00a1Tt\u00fd\t\u0088\u009d\u00fb~sN\u0012\u00c9\u0084x\u00b9K\u000b\u00cf4\u00baC@\u0086\u0004\u0086Ry\u00a5\u00ab\u00c8\u00a8\u00a6\u00b4\u00a8\u0091\u00bc%\b~\u00f5\u00a9\u00cf\u0003\u00958;\u0001\u00c2@e\u00d8\u00be\u00a9\u00166\u0005\f8\u0014\u0093C\u00fe\u00d7\u00ed\u0002\u00ad~\u00e2\u00fc\u008f\u0004\u00afl\u009dz\u00b1Q:\u00ef\u00c9\u00d7\u0081\u00c6DKx\u0003\u00ccQY\u00e09G\u00f5\u001eu\u0093\u00ddp\u0087S+\u00050r\b_\t\u007f&\u00f8^\u00ec\u00103\u00923\u00ee\u00a5\u0017\u00c3\u0088T\u00ec\u00e9\u00ca\u00ac\u00cdp\u00f8H=\u00b1\u00ba\u00e2\u009a\u00c9\u000f\u00c1\u0012k9$\u00a2)\bH\u00d6>\u0000\u001e6\u0003d\u0085?+\u00daDh\u00e9\u00d7fw\u00feTbv\u00fd\u00ad\u00ae\u00dd\u000e\u007f\u00d0\u00bd\u00bbkH\u00b0\u0012\u00f7\u00df\u00df\u00bc\u00ab\u0014\u00a0\u00b8>\u00fd\u00cc`(\u0012\u00ba\u000b'B\u008br\u00db\u0011 1\u00aa]\u00a6\u009c7/\u00f9\u00f2bo\u00b0\u0007\u00a9(\u000f\u001d1\u000f\u00e3\u00f1\u00d0\u00a9\u00a4\u00c94q\u00a5\u0015\u00ceWKH\u00f09F&\u00c5|w\u0094\u008b\u00e5\u008cO\u009fl\u0001\u0006)\u00f1\u00f64\u00f6\u00e7H\u00ce\u00aa\u008e\u0000\u009d\n\u00fb\u00c1\u00fd\u00c1\u00c8\u001ayV\u00e4o\u00e8\u0080\u00ee\u009b\u0097\u0096\u0094\u00df\u00e8\u00f2\u0003\u0012\u0006\u0016x?b\n'\u00dfN\u0099$Q\u00fe/\u00e9(\u00f4g\u00fa\u001d\u00fe";
                var8_6 = "\u00a58T\u00d0T\u00baoF\u00acWU9'm'\u00955\u00dd,9J\u00e3\u009b\u00c9\u00a3\u0019$\u001a^\u00c6\u00f1\u000bL\u00eb\u00d5\u00f4\u0095v\u0011\u00f9\u00fd{+U\u0094\u00e5\u00f0\u0086@'Y\u00f1\u0018\u00c8E}ZB\u00e2\u00b4\u0015wpd/\u0083\u00ca/\u0099M\u008aq\u0091\u00b0\u00c1\u00b0\u00ddo\u00b2\u0081\u001e\u0091\u00c3\u0095ZZ\u00e9S\u00b0^\u00ca\u008e\u0005\u00c4/\u00b0's\u00b9$9\u00a2\u00ce^\u00fa\u00d91\u00ca\u00e5Z\u00fe\u00feT8\u00f7I\u00b6Q>\u0084\u00d0\u009e\u0093-\u0095Hn\u000e\u00d8\u0099\u00d0\u00d2\u00acb\u0004\u008d@\u00cc\u000f\u009f\u001e\u00a6q\u001d\u00a2\u00b7\u00e8\u001c\u00cb9J\u00a9R\u00b5\u00ba\u00aeB~!\u00b9\u00c8\u00d9}O1\u001a\u000f\u008a\\\u009fH\u008d\u00dc\u00f3\u0087X\u000e\u00feI:Ez\u00bb\u0013\u00d7\u009fNFH\u00be\u00164^\u001a\u00a1Tt\u00fd\t\u0088\u009d\u00fb~sN\u0012\u00c9\u0084x\u00b9K\u000b\u00cf4\u00baC@\u0086\u0004\u0086Ry\u00a5\u00ab\u00c8\u00a8\u00a6\u00b4\u00a8\u0091\u00bc%\b~\u00f5\u00a9\u00cf\u0003\u00958;\u0001\u00c2@e\u00d8\u00be\u00a9\u00166\u0005\f8\u0014\u0093C\u00fe\u00d7\u00ed\u0002\u00ad~\u00e2\u00fc\u008f\u0004\u00afl\u009dz\u00b1Q:\u00ef\u00c9\u00d7\u0081\u00c6DKx\u0003\u00ccQY\u00e09G\u00f5\u001eu\u0093\u00ddp\u0087S+\u00050r\b_\t\u007f&\u00f8^\u00ec\u00103\u00923\u00ee\u00a5\u0017\u00c3\u0088T\u00ec\u00e9\u00ca\u00ac\u00cdp\u00f8H=\u00b1\u00ba\u00e2\u009a\u00c9\u000f\u00c1\u0012k9$\u00a2)\bH\u00d6>\u0000\u001e6\u0003d\u0085?+\u00daDh\u00e9\u00d7fw\u00feTbv\u00fd\u00ad\u00ae\u00dd\u000e\u007f\u00d0\u00bd\u00bbkH\u00b0\u0012\u00f7\u00df\u00df\u00bc\u00ab\u0014\u00a0\u00b8>\u00fd\u00cc`(\u0012\u00ba\u000b'B\u008br\u00db\u0011 1\u00aa]\u00a6\u009c7/\u00f9\u00f2bo\u00b0\u0007\u00a9(\u000f\u001d1\u000f\u00e3\u00f1\u00d0\u00a9\u00a4\u00c94q\u00a5\u0015\u00ceWKH\u00f09F&\u00c5|w\u0094\u008b\u00e5\u008cO\u009fl\u0001\u0006)\u00f1\u00f64\u00f6\u00e7H\u00ce\u00aa\u008e\u0000\u009d\n\u00fb\u00c1\u00fd\u00c1\u00c8\u001ayV\u00e4o\u00e8\u0080\u00ee\u009b\u0097\u0096\u0094\u00df\u00e8\u00f2\u0003\u0012\u0006\u0016x?b\n'\u00dfN\u0099$Q\u00fe/\u00e9(\u00f4g\u00fa\u001d\u00fe".length();
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
                    var9_3[var7_4++] = cya.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "2\u00e5\u0097q\u0085\u00f3\u00acp\u0016\r\u00fc\u001e\u00c6\u00d2.\r9*\u00a1\u00e9\u00f5M\u009d\u00fd\u00fa&\u00aa\u0095\u0012\u00e3\u00b7\u00fe\u0010\u00cd\u00c4\u00a69\u009b\u00d6k\u00c6=\u008f\u00ed@Gp?\u00d0";
                    var8_6 = "2\u00e5\u0097q\u0085\u00f3\u00acp\u0016\r\u00fc\u001e\u00c6\u00d2.\r9*\u00a1\u00e9\u00f5M\u009d\u00fd\u00fa&\u00aa\u0095\u0012\u00e3\u00b7\u00fe\u0010\u00cd\u00c4\u00a69\u009b\u00d6k\u00c6=\u008f\u00ed@Gp?\u00d0".length();
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
                    var9_3[var7_4++] = cya.a(var10_9).intern();
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
        cya.b = var9_3;
        cya.g = new String[11];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7300;
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
                throw new RuntimeException("cya", exception);
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
            cya.g[n2] = cya.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cya.b(n, l);
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
            throw new RuntimeException("cya" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cya.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

