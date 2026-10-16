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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cdp {
    private /* synthetic */ ttt jsf;
    private /* synthetic */ ttt g6u;
    private /* synthetic */ nv3 eyc;
    private /* synthetic */ List unb;
    private /* synthetic */ String ufp;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cdp() {
        this.eyc = new nv3(this);
        this.ufp = "";
        this.unb = Lists.newArrayList();
        this.unb.add(gyu.yo0);
        this.unb.add(gyu.wqh);
        this.unb.add(gyu.u3o);
        this.unb.add(gyu.hqg);
        this.unb.add(gyu.v8p);
        this.unb.add(gyu.bli);
        this.unb.add(gyu.tlt);
    }

    public cdp(long l, gxq gxq2, String string) {
        this();
        this.ufp = string;
        ttt[] tttArray = ttt.wdj(l, gxq2, string);
        this.jsf = tttArray[0];
        this.g6u = tttArray[1];
    }

    public cdp(t9d t9d2) {
        this(t9d2.x2p(), t9d2.r7d().z28(), t9d2.r7d().g9p());
    }

    public List l7g() {
        return this.unb;
    }

    public gyu owx(mew mew2) {
        return this.gwg(mew2, null);
    }

    public gyu gwg(mew mew2, gyu gyu2) {
        return this.eyc.f1i(mew2.getX(), mew2.getZ(), gyu2);
    }

    /*
     * Unable to fully structure code
     */
    public float[] u2e(float[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block15: {
            block13: {
                block14: {
                    block18: {
                        block17: {
                            var6_6 = cdp.a ^ 32523790875908L;
                            var8_7 = t9d.c();
                            z97.fuw();
                            v0 = var1_1;
                            if (var8_7 != 0) break block13;
                            if (v0 == null) ** GOTO lbl26
                            break block17;
                            catch (Throwable v1) {
                                throw cdp.a(v1);
                            }
                        }
                        v2 = var1_1.length;
                        v3 = var4_4 * var5_5;
                        if (var8_7 != 0) break block14;
                        break block18;
                        catch (Throwable v4) {
                            throw cdp.a(v4);
                        }
                    }
                    try {
                        block19: {
                            if (v2 >= v3) break block15;
                            break block19;
                            catch (Throwable v5) {
                                throw cdp.a(v5);
                            }
                        }
                        v2 = var4_4;
                        v3 = var5_5;
                    }
                    catch (Throwable v6) {
                        throw cdp.a(v6);
                    }
                }
                v0 = new float[v2 * v3];
            }
            var1_1 = v0;
        }
        var9_8 = this.g6u.ub9(var2_2, var3_3, var4_4, var5_5);
        for (var10_9 = 0; var10_9 < var4_4 * var5_5; ++var10_9) {
            try {
                block16: {
                    var11_10 = (float)gyu.vm1(var9_8[var10_9], gyu.bt0).l94() / 65536.0f;
                    try {
                        if (var8_7 != 0) continue;
                        if (!(var11_10 > 1.0f)) break block16;
                    }
                    catch (Throwable v7) {
                        throw cdp.a(v7);
                    }
                    var11_10 = 1.0f;
                }
                var1_1[var10_9] = var11_10;
                continue;
            }
            catch (Throwable var11_11) {
                var12_12 = e1i.cor(var11_11, (String)cdp.a("b", (int)1409, (long)(8570012530717805065L ^ var6_6)));
                var13_13 = var12_12.i_r((String)cdp.a("b", (int)18911, (long)(8622224306348918352L ^ var6_6)));
                var13_13._0p((String)cdp.a("b", (int)7937, (long)(7239994233504911500L ^ var6_6)), var10_9);
                var13_13._0p((String)cdp.a("b", (int)15816, (long)(8397985857640493638L ^ var6_6)), var1_1.length);
                var13_13._0p("x", var2_2);
                var13_13._0p("z", var3_3);
                var13_13._0p("w", var4_4);
                var13_13._0p("h", var5_5);
                throw new oov(var12_12);
            }
        }
        return var1_1;
    }

    public float m2f(float f, int n) {
        return f;
    }

    /*
     * Unable to fully structure code
     */
    public gyu[] f8i(gyu[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block16: {
            block14: {
                block15: {
                    block19: {
                        block18: {
                            var6_6 = cdp.a ^ 75802578285913L;
                            var8_7 = t9d.b();
                            z97.fuw();
                            v0 = var1_1;
                            if (var8_7 == 0) break block14;
                            if (v0 == null) ** GOTO lbl26
                            break block18;
                            catch (Throwable v1) {
                                throw cdp.a(v1);
                            }
                        }
                        v2 = var1_1.length;
                        v3 = var4_4 * var5_5;
                        if (var8_7 == 0) break block15;
                        break block19;
                        catch (Throwable v4) {
                            throw cdp.a(v4);
                        }
                    }
                    try {
                        block20: {
                            if (v2 >= v3) break block16;
                            break block20;
                            catch (Throwable v5) {
                                throw cdp.a(v5);
                            }
                        }
                        v2 = var4_4;
                        v3 = var5_5;
                    }
                    catch (Throwable v6) {
                        throw cdp.a(v6);
                    }
                }
                v0 = new gyu[v2 * v3];
            }
            var1_1 = v0;
        }
        var9_8 = this.jsf.ub9(var2_2, var3_3, var4_4, var5_5);
        try {
            block17: {
                for (var10_9 = 0; var10_9 < var4_4 * var5_5; ++var10_9) {
                    try {
                        v7 = var1_1;
                        if (var8_7 != 0) {
                            v7[var10_9] = gyu.vm1(var9_8[var10_9], gyu.bt0);
                            if (var8_7 != 0) continue;
                            break;
                        }
                        break block17;
                    }
                    catch (Throwable v8) {
                        throw cdp.a(v8);
                    }
                }
                v7 = var1_1;
            }
            return v7;
        }
        catch (Throwable var10_10) {
            var11_11 = e1i.cor(var10_10, (String)cdp.a("b", (int)6145, (long)(2336682916461043679L ^ var6_6)));
            var12_12 = var11_11.i_r((String)cdp.a("b", (int)1952, (long)(6650664242323046524L ^ var6_6)));
            var12_12._0p((String)cdp.a("b", (int)26849, (long)(7969907753013915445L ^ var6_6)), var1_1.length);
            var12_12._0p("x", var2_2);
            var12_12._0p("z", var3_3);
            var12_12._0p("w", var4_4);
            var12_12._0p("h", var5_5);
            throw new oov(var11_11);
        }
    }

    public gyu[] twf(gyu[] gyuArray, int n, int n2, int n3, int n4) {
        return this.jbk(gyuArray, n, n2, n3, n4, true);
    }

    public gyu[] jbk(gyu[] gyuArray, int n, int n2, int n3, int n4, boolean n5) {
        gyu[] gyuArray2;
        block36: {
            int n6;
            block32: {
                int n7;
                block35: {
                    int n8;
                    int n9;
                    block34: {
                        block33: {
                            block31: {
                                block29: {
                                    block30: {
                                        gyu[] gyuArray3;
                                        block27: {
                                            n6 = t9d.c();
                                            try {
                                                block28: {
                                                    try {
                                                        try {
                                                            try {
                                                                z97.fuw();
                                                                gyuArray3 = gyuArray;
                                                                if (n6 != 0) break block27;
                                                                if (gyuArray3 == null) break block28;
                                                            }
                                                            catch (oov oov2) {
                                                                throw cdp.a(oov2);
                                                            }
                                                            n9 = gyuArray.length;
                                                            if (n6 != 0) break block29;
                                                        }
                                                        catch (oov oov3) {
                                                            throw cdp.a(oov3);
                                                        }
                                                        if (n9 >= n3 * n4) break block30;
                                                    }
                                                    catch (oov oov4) {
                                                        throw cdp.a(oov4);
                                                    }
                                                }
                                                gyuArray3 = new gyu[n3 * n4];
                                            }
                                            catch (oov oov5) {
                                                throw cdp.a(oov5);
                                            }
                                        }
                                        gyuArray = gyuArray3;
                                    }
                                    n9 = n5;
                                }
                                try {
                                    if (n6 != 0) break block31;
                                    if (n9 == 0) break block32;
                                }
                                catch (oov oov6) {
                                    throw cdp.a(oov6);
                                }
                                n9 = n3;
                            }
                            try {
                                try {
                                    n8 = 16;
                                    if (n6 != 0) break block33;
                                    if (n9 != n8) break block32;
                                }
                                catch (oov oov7) {
                                    throw cdp.a(oov7);
                                }
                                n9 = n4;
                                n8 = 16;
                            }
                            catch (oov oov8) {
                                throw cdp.a(oov8);
                            }
                        }
                        try {
                            try {
                                if (n6 != 0) break block34;
                                if (n9 != n8) break block32;
                            }
                            catch (oov oov9) {
                                throw cdp.a(oov9);
                            }
                            n9 = n;
                            n8 = 15;
                        }
                        catch (oov oov10) {
                            throw cdp.a(oov10);
                        }
                    }
                    try {
                        try {
                            n7 = n9 & n8;
                            if (n6 != 0) break block35;
                            if (n7 != 0) break block32;
                        }
                        catch (oov oov11) {
                            throw cdp.a(oov11);
                        }
                        n7 = n2 & 0xF;
                    }
                    catch (oov oov12) {
                        throw cdp.a(oov12);
                    }
                }
                if (n7 == 0) {
                    gyu[] gyuArray4 = this.eyc.nr7(n, n2);
                    System.arraycopy(gyuArray4, 0, gyuArray, 0, n3 * n4);
                    return gyuArray;
                }
            }
            int[] nArray = this.g6u.ub9(n, n2, n3, n4);
            for (int i = 0; i < n3 * n4; ++i) {
                try {
                    gyuArray2 = gyuArray;
                    if (n6 == 0) {
                        gyuArray2[i] = gyu.vm1(nArray[i], gyu.bt0);
                        if (n6 == 0) continue;
                        break;
                    }
                    break block36;
                }
                catch (oov oov13) {
                    throw cdp.a(oov13);
                }
            }
            gyuArray2 = gyuArray;
        }
        return gyuArray2;
    }

    /*
     * Loose catch block
     */
    public boolean h4l(int n, int n2, int n3, List list) {
        long l = a ^ 0x1F1778A865E7L;
        z97.fuw();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = t9d.c();
        int n7 = n + n3 >> 2;
        int n8 = n2 + n3 >> 2;
        int n9 = n7 - n4 + 1;
        int n10 = n8 - n5 + 1;
        int[] nArray = this.jsf.ub9(n4, n5, n9, n10);
        try {
            boolean bl;
            block7: {
                int n11 = 0;
                while (n11 < n9 * n10) {
                    block9: {
                        block8: {
                            gyu gyu2 = gyu.lxy(nArray[n11]);
                            if (n6 != 0) break block9;
                            try {
                                block10: {
                                    bl = list.contains(gyu2);
                                    if (n6 != 0) break block7;
                                    break block10;
                                    catch (Throwable throwable) {
                                        throw cdp.a(throwable);
                                    }
                                }
                                if (bl) break block8;
                            }
                            catch (Throwable throwable) {
                                throw cdp.a(throwable);
                            }
                            return false;
                        }
                        ++n11;
                    }
                    if (n6 == 0) continue;
                }
                bl = true;
            }
            return bl;
        }
        catch (Throwable throwable) {
            e1i e1i2 = e1i.cor(throwable, (String)((Object)cdp.a("b", (int)6145, (long)(0x206DCB5D250A4F61L ^ l))));
            wsc wsc2 = e1i2.i_r((String)((Object)cdp.a("b", (int)6438, (long)(0x3AD7E486460A4E45L ^ l))));
            wsc2._0p((String)((Object)cdp.a("b", (int)28412, (long)(0x64D4FEA0E574B995L ^ l))), this.jsf.toString());
            wsc2._0p("x", n);
            wsc2._0p("z", n2);
            wsc2._0p((String)((Object)cdp.a("b", (int)20253, (long)(0x5D19FD03BA329875L ^ l))), n3);
            wsc2._0p((String)((Object)cdp.a("b", (int)24900, (long)(0xCECF6F96D7BB62BL ^ l))), list);
            throw new oov(e1i2);
        }
    }

    public mew rc6(int n, int n2, int n3, List list, Random random) {
        z97.fuw();
        int n4 = n - n3 >> 2;
        int n5 = t9d.b();
        int n6 = n2 - n3 >> 2;
        int n7 = n + n3 >> 2;
        int n8 = n2 + n3 >> 2;
        int n9 = n7 - n4 + 1;
        int n10 = n8 - n6 + 1;
        int[] nArray = this.jsf.ub9(n4, n6, n9, n10);
        mew mew2 = null;
        int n11 = 0;
        int n12 = 0;
        while (n12 < n9 * n10) {
            block11: {
                block12: {
                    mew mew3;
                    block13: {
                        int n13 = n4 + n12 % n9 << 2;
                        int n14 = n6 + n12 / n9 << 2;
                        gyu gyu2 = gyu.lxy(nArray[n12]);
                        try {
                            block14: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n5 == 0) break block11;
                                                if (!list.contains(gyu2)) break block12;
                                            }
                                            catch (oov oov2) {
                                                throw cdp.a(oov2);
                                            }
                                            mew3 = mew2;
                                            if (n5 == 0) break block13;
                                        }
                                        catch (oov oov3) {
                                            throw cdp.a(oov3);
                                        }
                                        if (mew3 == null) break block14;
                                    }
                                    catch (oov oov4) {
                                        throw cdp.a(oov4);
                                    }
                                    if (random.nextInt(n11 + 1) != 0) break block12;
                                }
                                catch (oov oov5) {
                                    throw cdp.a(oov5);
                                }
                            }
                            mew3 = new mew(n13, 0, n14);
                        }
                        catch (oov oov6) {
                            throw cdp.a(oov6);
                        }
                    }
                    mew2 = mew3;
                    ++n11;
                }
                ++n12;
            }
            if (n5 != 0) continue;
        }
        return mew2;
    }

    public void f65() {
        this.eyc.q35();
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

                cdp.a = c.a(6918760592903260481L, -2357440722394920319L, MethodHandles.lookup().lookupClass()).a(249393617456949L);
                cdp.d = new HashMap<K, V>(13);
                var0 = cdp.a ^ 128166750065153L;
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
                var6_5 = "\u00fdo\u00db\u00ca\u0083\u001bJ\u00e2\u0011~\u00abM|XX`\u00967?|<\u00f2\u00fb\u00f4.\u00f0\u001e\u00f9\u008d\u0010\u00dc\u00b8(TA\u00a0\u00a0m\bF\u00a2\u0019}\u00c7|D\u00fd\u00e7hur\u001e\u00fc\u00d3}\u00ec\u00cb8Z\r\u0096$6\u00d1_\u0000\u0088\u00b5t\u00f5F\u00f7\u00f6\u0010\u00fbLxu\\=x\u00db\u0098N{\u00db\u0099\u00e6\u00be#\u0010\u00fd\u00c2P\u0093\u00feOU\u00dd\u00a3~\u001b\u0010\u0002\u0085\u00c0\u00cc ge\u0082\u00e5\u00ca\u00cd\u00b6\u00dc\u00f5\u008a\u009f\u0090\u00e3\u00b0\u00fa\u00c2\u00b4\u0003X\u00bd)Km\u001ei2\u00db\u00b4*Q\u0018{\u001075OG\"\u00da\u00ec\u0089G>\u00b6\u00a0\u0019\u0003\u00ee\u00b7 \u008b\u00f7L\u0088\u00bfgpI2\u0085\th\u00a7\u00b2\u00ce\u0006w\u009dW\u0090\u00c2\u0086b\u0004\u0016\u00c7\u0019\u00b2gP\u00f3\u00ec(O\u009e?\u00ee0\nai>\u00f0x\u001a}f\u001a\r\b\u0087\t\u0085\u0086\u0012\u0087J\u00b4\u00c3F\u0097\u0005FZ\u00d7\u0011\u00e5!\u00f5?\u00fe)O \u00e70\u00ba\u00c4s\u00d7&/\u00f9\u0006\u0087\u00e7\u001d\u00be|\u00c8g\u00a6t\u0007$\u00c2-\u00bc\u00f6<\u001c$c\u0014\u009d\u00ad";
                var8_6 = "\u00fdo\u00db\u00ca\u0083\u001bJ\u00e2\u0011~\u00abM|XX`\u00967?|<\u00f2\u00fb\u00f4.\u00f0\u001e\u00f9\u008d\u0010\u00dc\u00b8(TA\u00a0\u00a0m\bF\u00a2\u0019}\u00c7|D\u00fd\u00e7hur\u001e\u00fc\u00d3}\u00ec\u00cb8Z\r\u0096$6\u00d1_\u0000\u0088\u00b5t\u00f5F\u00f7\u00f6\u0010\u00fbLxu\\=x\u00db\u0098N{\u00db\u0099\u00e6\u00be#\u0010\u00fd\u00c2P\u0093\u00feOU\u00dd\u00a3~\u001b\u0010\u0002\u0085\u00c0\u00cc ge\u0082\u00e5\u00ca\u00cd\u00b6\u00dc\u00f5\u008a\u009f\u0090\u00e3\u00b0\u00fa\u00c2\u00b4\u0003X\u00bd)Km\u001ei2\u00db\u00b4*Q\u0018{\u001075OG\"\u00da\u00ec\u0089G>\u00b6\u00a0\u0019\u0003\u00ee\u00b7 \u008b\u00f7L\u0088\u00bfgpI2\u0085\th\u00a7\u00b2\u00ce\u0006w\u009dW\u0090\u00c2\u0086b\u0004\u0016\u00c7\u0019\u00b2gP\u00f3\u00ec(O\u009e?\u00ee0\nai>\u00f0x\u001a}f\u001a\r\b\u0087\t\u0085\u0086\u0012\u0087J\u00b4\u00c3F\u0097\u0005FZ\u00d7\u0011\u00e5!\u00f5?\u00fe)O \u00e70\u00ba\u00c4s\u00d7&/\u00f9\u0006\u0087\u00e7\u001d\u00be|\u00c8g\u00a6t\u0007$\u00c2-\u00bc\u00f6<\u001c$c\u0014\u009d\u00ad".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = cdp.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ce0\u0005'\u00b4\\]\u00da\u00e8t>\u0014\u0087'\u009b\u00e8(q\u0011\u00b6X\u009b\u00df\u00a5\u00d6\u00c39B\u00cf\u00ba\u00ff\u0015V\u00c5\u00e94R\u0098\u0083\u00f0\u008av\u00af,nGs\u0087\u00ddC\u00ea\u00dcLN}Z\u0011";
                    var8_6 = "\u00ce0\u0005'\u00b4\\]\u00da\u00e8t>\u0014\u0087'\u009b\u00e8(q\u0011\u00b6X\u009b\u00df\u00a5\u00d6\u00c39B\u00cf\u00ba\u00ff\u0015V\u00c5\u00e94R\u0098\u0083\u00f0\u008av\u00af,nGs\u0087\u00ddC\u00ea\u00dcLN}Z\u0011".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = cdp.a(var10_9).intern();
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
        cdp.b = var9_3;
        cdp.c = new String[11];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3464;
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
                throw new RuntimeException("cdp", exception);
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
            cdp.c[n2] = cdp.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cdp.a(n, l);
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
            throw new RuntimeException("cdp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cdp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

