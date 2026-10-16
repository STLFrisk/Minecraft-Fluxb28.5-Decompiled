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
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;

public class f3x
extends gbe
implements yxa {
    public gbe gpj;
    public String g0x;
    private f3x$mti i9v;
    private f3x$_t2 _te;
    private f3x$uzf rg7;
    private f3x$i86 l7w;
    private ik0 xjz;
    private ed7 _3r;
    private boolean lfx;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public f3x(gbe gbe2, ik0 ik02) {
        long l = a ^ 0x27E409D86057L;
        this.g0x = f3x.b("v", (int)4871, (long)(0x2BC5A69C06448531L ^ l));
        this.lfx = true;
        this.gpj = gbe2;
        this.xjz = ik02;
    }

    @Override
    public void initGui() {
        long l = a ^ 0x67D50DED93AAL;
        this.g0x = fc1.gx1((String)((Object)f3x.b("v", (int)11242, (long)(0x35A26C2DEF5D4E27L ^ l))), new Object[0]);
        this.lfx = true;
        this.f41.c02().sxi(new C16PacketClientStatus(C16PacketClientStatus$v78.gfl));
    }

    @Override
    public void handleMouseInput() {
        block5: {
            ed7 ed72;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        super.handleMouseInput();
                        ed72 = this._3r;
                        if (n == 0) break block4;
                        if (ed72 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw f3x.a(oov2);
                    }
                    ed72 = this._3r;
                }
                catch (oov oov3) {
                    throw f3x.a(oov3);
                }
            }
            ed72.gzb();
        }
    }

    public void ceu() {
        this.i9v = new f3x$mti(this, this.f41);
        this.i9v.x9x(1, 1);
        this._te = new f3x$_t2(this, this.f41);
        this._te.x9x(1, 1);
        this.rg7 = new f3x$uzf(this, this.f41);
        this.rg7.x9x(1, 1);
        this.l7w = new f3x$i86(this, this.f41);
        this.l7w.x9x(1, 1);
    }

    public void xox() {
        int n;
        block13: {
            block14: {
                int n2;
                block11: {
                    block12: {
                        long l = a ^ 0xBE88E7E43B4L;
                        this.khf.add(new gt4(0, this.dt7 / 2 + 4, this.o1e - 28, 150, 20, fc1.gx1((String)((Object)f3x.b("v", (int)30283, (long)(0x3FB277A47941439FL ^ l))), new Object[0])));
                        this.khf.add(new gt4(1, this.dt7 / 2 - 160, this.o1e - 52, 80, 20, fc1.gx1((String)((Object)f3x.b("v", (int)25918, (long)(0x1F606B70113F50E9L ^ l))), new Object[0])));
                        gt4 gt42 = new gt4(2, this.dt7 / 2 - 80, this.o1e - 52, 80, 20, fc1.gx1((String)((Object)f3x.b("v", (int)10798, (long)(0x3BAF2CD7BA319FFFL ^ l))), new Object[0]));
                        this.khf.add(gt42);
                        gt4 gt43 = new gt4(3, this.dt7 / 2, this.o1e - 52, 80, 20, fc1.gx1((String)((Object)f3x.b("v", (int)11403, (long)(0x2FEC621C32BD995DL ^ l))), new Object[0]));
                        this.khf.add(gt43);
                        int n3 = t9d.c();
                        gt4 gt44 = new gt4(4, this.dt7 / 2 + 80, this.o1e - 52, 80, 20, fc1.gx1((String)((Object)f3x.b("v", (int)6735, (long)(0x23924F96BBF72F9FL ^ l))), new Object[0]));
                        this.khf.add(gt44);
                        n2 = n3;
                        try {
                            try {
                                n = this.rg7.getSize();
                                if (n2 != 0) break block11;
                                if (n != 0) break block12;
                            }
                            catch (oov oov2) {
                                throw f3x.a(oov2);
                            }
                            gt42.c9a = false;
                        }
                        catch (oov oov3) {
                            throw f3x.a(oov3);
                        }
                    }
                    n = this._te.getSize();
                }
                try {
                    try {
                        if (n2 != 0) break block13;
                        if (n != 0) break block14;
                    }
                    catch (oov oov4) {
                        throw f3x.a(oov4);
                    }
                    gt43.c9a = false;
                }
                catch (oov oov5) {
                    throw f3x.a(oov5);
                }
            }
            n = this.l7w.getSize();
        }
        try {
            if (n == 0) {
                gt44.c9a = false;
            }
        }
        catch (oov oov6) {
            throw f3x.a(oov6);
        }
    }

    @Override
    public void actionPerformed(gt4 gt42) {
        block33: {
            int n;
            int n2;
            int n3;
            block40: {
                block38: {
                    block36: {
                        block34: {
                            block32: {
                                n3 = t9d.b();
                                try {
                                    try {
                                        n2 = gt42.c9a;
                                        if (n3 == 0) break block32;
                                        if (n2 == 0) break block33;
                                    }
                                    catch (oov oov2) {
                                        throw f3x.a(oov2);
                                    }
                                    n2 = gt42._me;
                                }
                                catch (oov oov3) {
                                    throw f3x.a(oov3);
                                }
                            }
                            try {
                                block35: {
                                    try {
                                        try {
                                            if (n3 == 0) break block34;
                                            if (n2 != 0) break block35;
                                        }
                                        catch (oov oov4) {
                                            throw f3x.a(oov4);
                                        }
                                        this.f41.z2i(this.gpj);
                                        if (n3 != 0) break block33;
                                    }
                                    catch (oov oov5) {
                                        throw f3x.a(oov5);
                                    }
                                }
                                n2 = gt42._me;
                            }
                            catch (oov oov6) {
                                throw f3x.a(oov6);
                            }
                        }
                        try {
                            block37: {
                                try {
                                    try {
                                        n = 1;
                                        if (n3 == 0) break block36;
                                        if (n2 != n) break block37;
                                    }
                                    catch (oov oov7) {
                                        throw f3x.a(oov7);
                                    }
                                    this._3r = this.i9v;
                                    if (n3 != 0) break block33;
                                }
                                catch (oov oov8) {
                                    throw f3x.a(oov8);
                                }
                            }
                            n2 = gt42._me;
                            n = 3;
                        }
                        catch (oov oov9) {
                            throw f3x.a(oov9);
                        }
                    }
                    try {
                        block39: {
                            try {
                                try {
                                    if (n3 == 0) break block38;
                                    if (n2 != n) break block39;
                                }
                                catch (oov oov10) {
                                    throw f3x.a(oov10);
                                }
                                this._3r = this._te;
                                if (n3 != 0) break block33;
                            }
                            catch (oov oov11) {
                                throw f3x.a(oov11);
                            }
                        }
                        n2 = gt42._me;
                        n = 2;
                    }
                    catch (oov oov12) {
                        throw f3x.a(oov12);
                    }
                }
                try {
                    block41: {
                        try {
                            try {
                                if (n3 == 0) break block40;
                                if (n2 != n) break block41;
                            }
                            catch (oov oov13) {
                                throw f3x.a(oov13);
                            }
                            this._3r = this.rg7;
                            if (n3 != 0) break block33;
                        }
                        catch (oov oov14) {
                            throw f3x.a(oov14);
                        }
                    }
                    n2 = gt42._me;
                    n = 4;
                }
                catch (oov oov15) {
                    throw f3x.a(oov15);
                }
            }
            try {
                block42: {
                    try {
                        if (n2 != n) break block42;
                        this._3r = this.l7w;
                        if (n3 != 0) break block33;
                    }
                    catch (oov oov16) {
                        throw f3x.a(oov16);
                    }
                }
                this._3r.ncl(gt42);
            }
            catch (oov oov17) {
                throw f3x.a(oov17);
            }
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        block8: {
            f3x f3x2;
            block6: {
                long l = a ^ 0x7F8F53B14895L;
                int n3 = t9d.b();
                try {
                    block7: {
                        try {
                            try {
                                f3x2 = this;
                                if (n3 == 0) break block6;
                                if (!f3x2.lfx) break block7;
                            }
                            catch (oov oov2) {
                                throw f3x.a(oov2);
                            }
                            this.xmz();
                            this.poi(this.fex, fc1.gx1((String)((Object)f3x.b("v", (int)16640, (long)(0xEB1CAA5A4827FF3L ^ l))), new Object[0]), this.dt7 / 2, this.o1e / 2, 0xFFFFFF);
                            this.poi(this.fex, x8o[(int)(c05.qgs() / 150L % (long)x8o.length)], this.dt7 / 2, this.o1e / 2 + this.fex.rr7 * 2, 0xFFFFFF);
                            if (n3 != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw f3x.a(oov3);
                        }
                    }
                    this._3r.j46(n, n2, f);
                    this.poi(this.fex, this.g0x, this.dt7 / 2, 20, 0xFFFFFF);
                    f3x2 = this;
                }
                catch (oov oov4) {
                    throw f3x.a(oov4);
                }
            }
            super.drawScreen(n, n2, f);
        }
    }

    @Override
    public void fyj() {
        block5: {
            block4: {
                int n = t9d.c();
                try {
                    f3x f3x2;
                    try {
                        f3x2 = this;
                        if (n != 0) break block4;
                        if (!f3x2.lfx) break block5;
                    }
                    catch (oov oov2) {
                        throw f3x.a(oov2);
                    }
                    this.ceu();
                    this.xox();
                    this._3r = this.i9v;
                    f3x2 = this;
                }
                catch (oov oov3) {
                    throw f3x.a(oov3);
                }
            }
            f3x2.lfx = false;
        }
    }

    @Override
    public boolean a99() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.lfx;
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw f3x.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private void g38(int n, int n2, u7m u7m2) {
        this.dlt(n + 1, n2 + 1);
        hzu.ixc();
        qpm.gdb();
        this.vs5.s3g(new erg(u7m2, 1, 0), n + 2, n2 + 2);
        qpm.cng();
        hzu.eiq();
    }

    private void dlt(int n, int n2) {
        this.afb(n, n2, 0, 0);
    }

    private void afb(int n, int n2, int n3, int n4) {
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
        this.f41.l22().anl(p24);
        float f = 0.0078125f;
        float f2 = 0.0078125f;
        int n5 = 18;
        int n6 = 18;
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl._r5);
        q3g2.g5o(n + 0, n2 + 18, this.o3s).h0a((float)(n3 + 0) * 0.0078125f, (float)(n4 + 18) * 0.0078125f).pzw();
        q3g2.g5o(n + 18, n2 + 18, this.o3s).h0a((float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f).pzw();
        q3g2.g5o(n + 18, n2 + 0, this.o3s).h0a((float)(n3 + 18) * 0.0078125f, (float)(n4 + 0) * 0.0078125f).pzw();
        q3g2.g5o(n + 0, n2 + 0, this.o3s).h0a((float)(n3 + 0) * 0.0078125f, (float)(n4 + 0) * 0.0078125f).pzw();
        jom2.q7g();
    }

    public static void _e5(f3x f3x2, int n, int n2, int n3, int n4) {
        f3x2.afb(n, n2, n3, n4);
    }

    public static ik0 h5z(f3x f3x2) {
        return f3x2.xjz;
    }

    public static owt xj2(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt qpj(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt k8c(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt _bu(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt p8s(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt z4q(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt pl3(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt esu(f3x f3x2) {
        return f3x2.fex;
    }

    public static void y8f(f3x f3x2, int n, int n2, u7m u7m2) {
        f3x2.g38(n, n2, u7m2);
    }

    public static owt _vs(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt lp6(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt xsr(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt uw2(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt bu9(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt z2i(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt nqw(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt cq3(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt gou(f3x f3x2) {
        return f3x2.fex;
    }

    public static owt z6d(f3x f3x2) {
        return f3x2.fex;
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

                f3x.a = c.a(980225801699037113L, -1078548721628626908L, MethodHandles.lookup().lookupClass()).a(19141886136625L);
                f3x.h = new HashMap<K, V>(13);
                var0 = f3x.a ^ 49375487522650L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u00b5\u009c^\u00a8\u001e\u000e\u00ce\u00c0\u00e5d\u00ee\u00f0\u00ff\u00fb\u0080\u00d4\u00f0\u00ac-\u00a8\u001a-\u00e8Z\u0087\u00d1Tb\u0096\u00e2\u009c\u00d0\u00d5LZ\u00f0\u0010w\u00a1F \u00e9\u00ec\u00da+\u001bJ\u0000\u00bc\u0088\u00f4s$d\u0094\u00c9O\u00d9\u00ab\u00b7;p\u00cb\u00df`\u00e9n\u00c2vB|<\u00ed >+\u00bf\u009b#XG.\u008c\n\u00a8\u0016{\u00c0y\u0095\u00de\u00e5\u0093S\u0018\u009d\u001b\u0089\u0014\u0090\u00a8i\u00fa\b\u00f8\u00f48N\u001c\u00c3u\u00fd\u00a4\u0002\u00c9E\u00b7\b\u00aa\u00efRK\u00c2T\u000e\u00bf]\u001e\u00fd\u00b6\u00ae\u00eb\u0016\u001b=\u0004*\u0084\u00bc\u00ae\u0013\u00e0\u0092\u00a9\u000fK%\u00b9e\u0083\u0005\u00a2\u009a\u009cg\u0093\u00df\u0015\u00c8vGm\u00ad \u00cd\u0096I\u00d2\u00e8\u0006/\u00a3H\u0012K+\u0087\u00e6\u00ad\u00adE\u00f7\u00faT\u00f8ynHD\u00bb%\\l}\u00a4H\u0018\u00970\u00c8d\u0098+\u00abM\u00b1\u0087\u001a\u0017Z\u0016\u0089I\u00d3o\u00fe\u00d4\u00d1_+\u0090";
                var8_6 = "\u00b5\u009c^\u00a8\u001e\u000e\u00ce\u00c0\u00e5d\u00ee\u00f0\u00ff\u00fb\u0080\u00d4\u00f0\u00ac-\u00a8\u001a-\u00e8Z\u0087\u00d1Tb\u0096\u00e2\u009c\u00d0\u00d5LZ\u00f0\u0010w\u00a1F \u00e9\u00ec\u00da+\u001bJ\u0000\u00bc\u0088\u00f4s$d\u0094\u00c9O\u00d9\u00ab\u00b7;p\u00cb\u00df`\u00e9n\u00c2vB|<\u00ed >+\u00bf\u009b#XG.\u008c\n\u00a8\u0016{\u00c0y\u0095\u00de\u00e5\u0093S\u0018\u009d\u001b\u0089\u0014\u0090\u00a8i\u00fa\b\u00f8\u00f48N\u001c\u00c3u\u00fd\u00a4\u0002\u00c9E\u00b7\b\u00aa\u00efRK\u00c2T\u000e\u00bf]\u001e\u00fd\u00b6\u00ae\u00eb\u0016\u001b=\u0004*\u0084\u00bc\u00ae\u0013\u00e0\u0092\u00a9\u000fK%\u00b9e\u0083\u0005\u00a2\u009a\u009cg\u0093\u00df\u0015\u00c8vGm\u00ad \u00cd\u0096I\u00d2\u00e8\u0006/\u00a3H\u0012K+\u0087\u00e6\u00ad\u00adE\u00f7\u00faT\u00f8ynHD\u00bb%\\l}\u00a4H\u0018\u00970\u00c8d\u0098+\u00abM\u00b1\u0087\u001a\u0017Z\u0016\u0089I\u00d3o\u00fe\u00d4\u00d1_+\u0090".length();
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
                    var9_3[var7_4++] = f3x.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00adL\u008cEh\u00f9\u008c}7B\u00b3\u00ee\u00c6\u00cc\u00ac\u00e6_\u00a2\u00b6[r\u00e3\u00d6Q\u00e1\u00c3\u0084P\u00d9\u00e1mz\u00ea\u0082\u0087{\u00a2\u00e97w(\u008f%\u00d9\u00cc\u00aba6\u009d{\u00b6\u00aa^\u0016\u00b6h\u00917\u009c\u0081O\u00e2\u00ca\u007fwb\u001a\u00d5\u0010\u00ec\u00e8\u00b4\u00edGp\u0002F\u00e7\rO\u009e";
                    var8_6 = "\u00adL\u008cEh\u00f9\u008c}7B\u00b3\u00ee\u00c6\u00cc\u00ac\u00e6_\u00a2\u00b6[r\u00e3\u00d6Q\u00e1\u00c3\u0084P\u00d9\u00e1mz\u00ea\u0082\u0087{\u00a2\u00e97w(\u008f%\u00d9\u00cc\u00aba6\u009d{\u00b6\u00aa^\u0016\u00b6h\u00917\u009c\u0081O\u00e2\u00ca\u007fwb\u001a\u00d5\u0010\u00ec\u00e8\u00b4\u00edGp\u0002F\u00e7\rO\u009e".length();
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
                    var9_3[var7_4++] = f3x.d(var10_9).intern();
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
        f3x.b = var9_3;
        f3x.g = new String[8];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String d(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1EC2;
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
                throw new RuntimeException("f3x", exception);
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
            f3x.g[n2] = f3x.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f3x.b(n, l);
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
            throw new RuntimeException("f3x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f3x.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

