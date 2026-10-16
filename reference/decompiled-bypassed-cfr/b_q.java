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
import net.optifine.Lang;
import net.optifine.gui.GuiAnimationSettingsOF;
import net.optifine.gui.GuiDetailSettingsOF;
import net.optifine.gui.GuiOptionButtonOF;
import net.optifine.gui.GuiOptionSliderOF;
import net.optifine.gui.GuiOtherSettingsOF;
import net.optifine.gui.GuiPerformanceSettingsOF;
import net.optifine.gui.GuiQualitySettingsOF;
import net.optifine.gui.GuiScreenOF;
import net.optifine.gui.TooltipManager;
import net.optifine.gui.TooltipProviderOptions;
import net.optifine.shaders.gui.GuiShaders;

public class b_q
extends GuiScreenOF {
    private gbe ooc;
    public String b4c;
    private moh hj3;
    private static moh$_ru[] l5f;
    private TooltipManager kbl;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public b_q(gbe gbe2, moh moh2) {
        long l = a ^ 0x5C897FD86821L;
        this.b4c = b_q.b("n", (int)31994, (long)(0x6B3CBAADF5FF9A4BL ^ l));
        this.kbl = new TooltipManager(this, new TooltipProviderOptions());
        this.ooc = gbe2;
        this.hj3 = moh2;
    }

    @Override
    public void initGui() {
        int n;
        long l;
        block11: {
            l = a ^ 0x2DEDEA9122FBL;
            this.b4c = fc1.gx1((String)((Object)b_q.b("n", (int)4713, (long)(0x6AA4E49EDD10BE0DL ^ l))), new Object[0]);
            int n2 = t9d.b();
            this.khf.clear();
            int n3 = n2;
            n = 0;
            while (n < l5f.length) {
                block12: {
                    block13: {
                        moh$_ru moh$_ru = l5f[n];
                        try {
                            try {
                                if (n3 == 0) break block11;
                                if (n3 == 0) break block12;
                            }
                            catch (oov oov2) {
                                throw b_q.a(oov2);
                            }
                            if (moh$_ru == null) break block13;
                        }
                        catch (oov oov3) {
                            throw b_q.a(oov3);
                        }
                        int n4 = this.dt7 / 2 - 155 + n % 2 * 160;
                        int n5 = this.o1e / 6 + 21 * (n / 2) - 12;
                        try {
                            boolean bl;
                            block14: {
                                try {
                                    try {
                                        bl = moh$_ru.on0();
                                        if (n3 == 0) break block13;
                                        if (!bl) break block14;
                                    }
                                    catch (oov oov4) {
                                        throw b_q.a(oov4);
                                    }
                                    this.khf.add(new GuiOptionSliderOF(moh$_ru.ehz(), n4, n5, moh$_ru));
                                    if (n3 != 0) break block13;
                                }
                                catch (oov oov5) {
                                    throw b_q.a(oov5);
                                }
                            }
                            bl = this.khf.add(new GuiOptionButtonOF(moh$_ru.ehz(), n4, n5, moh$_ru, this.hj3.ycx(moh$_ru)));
                        }
                        catch (oov oov6) {
                            throw b_q.a(oov6);
                        }
                    }
                    ++n;
                }
                if (n3 != 0) continue;
            }
            n = this.o1e / 6 + 21 * (l5f.length / 2) - 12;
        }
        int n6 = 0;
        n6 = this.dt7 / 2 - 155 + 0;
        this.khf.add(new cm_(231, n6, n, Lang.get((String)((Object)b_q.b("n", (int)15481, (long)(0x18317B8943D9101FL ^ l))))));
        n6 = this.dt7 / 2 - 155 + 160;
        this.khf.add(new cm_(202, n6, n, Lang.get((String)((Object)b_q.b("n", (int)25495, (long)(0x3C6F32A91DC1CFFDL ^ l))))));
        n6 = this.dt7 / 2 - 155 + 0;
        this.khf.add(new cm_(201, n6, n += 21, Lang.get((String)((Object)b_q.b("n", (int)24064, (long)(0x7CAB04B9A6C37261L ^ l))))));
        n6 = this.dt7 / 2 - 155 + 160;
        this.khf.add(new cm_(212, n6, n, Lang.get((String)((Object)b_q.b("n", (int)20886, (long)(0x3DB9B81003D7FDFFL ^ l))))));
        n6 = this.dt7 / 2 - 155 + 0;
        this.khf.add(new cm_(211, n6, n += 21, Lang.get((String)((Object)b_q.b("n", (int)6279, (long)(0x50DC86C75DDB34EFL ^ l))))));
        n6 = this.dt7 / 2 - 155 + 160;
        this.khf.add(new cm_(222, n6, n, Lang.get((String)((Object)b_q.b("n", (int)15486, (long)(0x3A79E91218D61011L ^ l))))));
        n += 21;
        this.khf.add(new gt4(200, this.dt7 / 2 - 100, this.o1e / 6 + 168 + 11, fc1.gx1((String)((Object)b_q.b("n", (int)15288, (long)(0x5428333EFFD797CBL ^ l))), new Object[0])));
    }

    @Override
    public void actionPerformed(gt4 gt42) {
        this.t7z(gt42, 1);
    }

    @Override
    public void actionPerformedRightClick(gt4 gt42) {
        try {
            if (gt42._me == moh$_ru.daj.ordinal()) {
                this.t7z(gt42, -1);
            }
        }
        catch (oov oov2) {
            throw b_q.a(oov2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void t7z(gt4 var1_1, int var2_2) {
        block51: {
            block77: {
                block75: {
                    block76: {
                        block73: {
                            block74: {
                                block71: {
                                    block72: {
                                        block70: {
                                            block69: {
                                                block67: {
                                                    block68: {
                                                        block65: {
                                                            block66: {
                                                                block63: {
                                                                    block64: {
                                                                        block61: {
                                                                            block62: {
                                                                                block59: {
                                                                                    block60: {
                                                                                        block57: {
                                                                                            block58: {
                                                                                                block55: {
                                                                                                    block56: {
                                                                                                        block52: {
                                                                                                            block54: {
                                                                                                                block53: {
                                                                                                                    block50: {
                                                                                                                        var3_3 = b_q.a ^ 102189617524026L;
                                                                                                                        var5_4 = t9d.c();
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v0 = var1_1.c9a;
                                                                                                                                if (var5_4 != 0) break block50;
                                                                                                                                if (v0 == 0) break block51;
                                                                                                                            }
                                                                                                                            catch (oov v1) {
                                                                                                                                throw b_q.a(v1);
                                                                                                                            }
                                                                                                                            v0 = this.hj3.ysd;
                                                                                                                        }
                                                                                                                        catch (oov v2) {
                                                                                                                            throw b_q.a(v2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var6_5 = v0;
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v3 = var1_1._me;
                                                                                                                                    v4 = 200;
                                                                                                                                    if (var5_4 != 0) break block52;
                                                                                                                                    if (v3 >= v4) break block53;
                                                                                                                                }
                                                                                                                                catch (oov v5) {
                                                                                                                                    throw b_q.a(v5);
                                                                                                                                }
                                                                                                                                v3 = var1_1 instanceof cm_;
                                                                                                                                if (var5_4 != 0) break block54;
                                                                                                                            }
                                                                                                                            catch (oov v6) {
                                                                                                                                throw b_q.a(v6);
                                                                                                                            }
                                                                                                                            if (v3 == 0) break block53;
                                                                                                                        }
                                                                                                                        catch (oov v7) {
                                                                                                                            throw b_q.a(v7);
                                                                                                                        }
                                                                                                                        this.hj3.d13(((cm_)var1_1).t4j(), var2_2);
                                                                                                                        var1_1.frg = this.hj3.ycx(moh$_ru.jit(var1_1._me));
                                                                                                                    }
                                                                                                                    catch (oov v8) {
                                                                                                                        throw b_q.a(v8);
                                                                                                                    }
                                                                                                                }
                                                                                                                v3 = var1_1._me;
                                                                                                            }
                                                                                                            v4 = 200;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var5_4 != 0) break block55;
                                                                                                                if (v3 != v4) break block56;
                                                                                                            }
                                                                                                            catch (oov v9) {
                                                                                                                throw b_q.a(v9);
                                                                                                            }
                                                                                                            this.f41.oxn.cmo();
                                                                                                            this.f41.z2i(this.ooc);
                                                                                                        }
                                                                                                        catch (oov v10) {
                                                                                                            throw b_q.a(v10);
                                                                                                        }
                                                                                                    }
                                                                                                    v3 = this.hj3.ysd;
                                                                                                    v4 = var6_5;
                                                                                                }
                                                                                                try {
                                                                                                    if (var5_4 != 0) break block57;
                                                                                                    if (v3 == v4) break block58;
                                                                                                }
                                                                                                catch (oov v11) {
                                                                                                    throw b_q.a(v11);
                                                                                                }
                                                                                                var7_6 = new eka(this.f41);
                                                                                                var8_7 = var7_6.x05();
                                                                                                var9_8 = var7_6.lrx();
                                                                                                this.kky(this.f41, var8_7, var9_8);
                                                                                            }
                                                                                            v3 = var1_1._me;
                                                                                            v4 = 201;
                                                                                        }
                                                                                        try {
                                                                                            if (var5_4 != 0) break block59;
                                                                                            if (v3 != v4) break block60;
                                                                                        }
                                                                                        catch (oov v12) {
                                                                                            throw b_q.a(v12);
                                                                                        }
                                                                                        this.f41.oxn.cmo();
                                                                                        var7_6 = new GuiDetailSettingsOF(this, this.hj3);
                                                                                        this.f41.z2i((gbe)var7_6);
                                                                                    }
                                                                                    v3 = var1_1._me;
                                                                                    v4 = 202;
                                                                                }
                                                                                try {
                                                                                    if (var5_4 != 0) break block61;
                                                                                    if (v3 != v4) break block62;
                                                                                }
                                                                                catch (oov v13) {
                                                                                    throw b_q.a(v13);
                                                                                }
                                                                                this.f41.oxn.cmo();
                                                                                var7_6 = new GuiQualitySettingsOF(this, this.hj3);
                                                                                this.f41.z2i((gbe)var7_6);
                                                                            }
                                                                            v3 = var1_1._me;
                                                                            v4 = 211;
                                                                        }
                                                                        try {
                                                                            if (var5_4 != 0) break block63;
                                                                            if (v3 != v4) break block64;
                                                                        }
                                                                        catch (oov v14) {
                                                                            throw b_q.a(v14);
                                                                        }
                                                                        this.f41.oxn.cmo();
                                                                        var7_6 = new GuiAnimationSettingsOF(this, this.hj3);
                                                                        this.f41.z2i((gbe)var7_6);
                                                                    }
                                                                    v3 = var1_1._me;
                                                                    v4 = 212;
                                                                }
                                                                try {
                                                                    if (var5_4 != 0) break block65;
                                                                    if (v3 != v4) break block66;
                                                                }
                                                                catch (oov v15) {
                                                                    throw b_q.a(v15);
                                                                }
                                                                this.f41.oxn.cmo();
                                                                var7_6 = new GuiPerformanceSettingsOF(this, this.hj3);
                                                                this.f41.z2i((gbe)var7_6);
                                                            }
                                                            v3 = var1_1._me;
                                                            v4 = 222;
                                                        }
                                                        try {
                                                            if (var5_4 != 0) break block67;
                                                            if (v3 != v4) break block68;
                                                        }
                                                        catch (oov v16) {
                                                            throw b_q.a(v16);
                                                        }
                                                        this.f41.oxn.cmo();
                                                        var7_6 = new GuiOtherSettingsOF(this, this.hj3);
                                                        this.f41.z2i((gbe)var7_6);
                                                    }
                                                    try {
                                                        v3 = var1_1._me;
                                                        if (var5_4 != 0) break block69;
                                                        v4 = 231;
                                                    }
                                                    catch (oov v17) {
                                                        throw b_q.a(v17);
                                                    }
                                                }
                                                if (v3 != v4) break block51;
                                                v3 = (int)hxt.b4a();
                                            }
                                            try {
                                                if (var5_4 != 0) break block70;
                                                if (v3 == 0) {
                                                }
                                                ** GOTO lbl166
                                            }
                                            catch (oov v18) {
                                                throw b_q.a(v18);
                                            }
                                            v3 = (int)hxt.yfx();
                                        }
                                        try {
                                            try {
                                                if (var5_4 != 0) break block71;
                                                if (v3 == 0) break block72;
                                            }
                                            catch (oov v19) {
                                                throw b_q.a(v19);
                                            }
lbl166:
                                            // 2 sources

                                            hxt.vuo(Lang.get((String)b_q.b("n", (int)31783, (long)(2198814030674124688L ^ var3_3))), Lang.get((String)b_q.b("n", (int)16113, (long)(829398260627742046L ^ var3_3))));
                                            return;
                                        }
                                        catch (oov v20) {
                                            throw b_q.a(v20);
                                        }
                                    }
                                    v3 = (int)hxt.y_u();
                                }
                                try {
                                    try {
                                        if (var5_4 != 0) break block73;
                                        if (v3 == 0) break block74;
                                    }
                                    catch (oov v21) {
                                        throw b_q.a(v21);
                                    }
                                    hxt.vuo(Lang.get((String)b_q.b("n", (int)6870, (long)(4491985778282019191L ^ var3_3))), Lang.get((String)b_q.b("n", (int)3818, (long)(6252347033931197788L ^ var3_3))));
                                    return;
                                }
                                catch (oov v22) {
                                    throw b_q.a(v22);
                                }
                            }
                            v3 = (int)hxt.veb();
                        }
                        try {
                            try {
                                if (var5_4 != 0) break block75;
                                if (v3 == 0) break block76;
                            }
                            catch (oov v23) {
                                throw b_q.a(v23);
                            }
                            hxt.vuo(Lang.get((String)b_q.b("n", (int)15938, (long)(7947009070507892209L ^ var3_3))), Lang.get((String)b_q.b("n", (int)23622, (long)(6337003829128200162L ^ var3_3))));
                            return;
                        }
                        catch (oov v24) {
                            throw b_q.a(v24);
                        }
                    }
                    try {
                        v25 = hxt.d9p();
                        if (var5_4 != 0) break block77;
                        v3 = (int)v25.rdb;
                    }
                    catch (oov v26) {
                        throw b_q.a(v26);
                    }
                }
                try {
                    if (v3 != 0) {
                        hxt.vuo(Lang.get((String)b_q.b("n", (int)25460, (long)(4895002223825502401L ^ var3_3))), Lang.get((String)b_q.b("n", (int)8576, (long)(15924939194860067L ^ var3_3))));
                        return;
                    }
                }
                catch (oov v27) {
                    throw b_q.a(v27);
                }
                v25 = this.f41.oxn;
            }
            v25.cmo();
            var7_6 = new GuiShaders(this, this.hj3);
            this.f41.z2i((gbe)var7_6);
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        CallSite callSite;
        block11: {
            boolean bl;
            Object object;
            long l;
            block9: {
                int n3;
                CallSite callSite2;
                block10: {
                    block7: {
                        block8: {
                            l = a ^ 0x35B7B4CDF9C4L;
                            this.xmz();
                            this.poi(this.fex, this.b4c, this.dt7 / 2, 15, 0xFFFFFF);
                            object = hxt._yw();
                            callSite2 = b_q.b("n", (int)21533, (long)(0x6953CE94C1A9A34EL ^ l));
                            n3 = t9d.b();
                            try {
                                bl = ((String)((Object)callSite2)).equals(b_q.b("n", (int)11588, (long)(0xB751EDC5022DA18L ^ l)));
                                if (n3 == 0) break block7;
                                if (!bl) break block8;
                            }
                            catch (oov oov2) {
                                throw b_q.a(oov2);
                            }
                            object = b_q.b("n", (int)28457, (long)(0x61DB8DFBA07F1866L ^ l));
                        }
                        bl = ((String)((Object)callSite2)).equals(b_q.b("n", (int)16746, (long)(0x1653377DD4333638L ^ l)));
                    }
                    try {
                        if (n3 == 0) break block9;
                        if (!bl) break block10;
                    }
                    catch (oov oov3) {
                        throw b_q.a(oov3);
                    }
                    object = b_q.b("n", (int)12147, (long)(0x3B226D8C3B2FD82BL ^ l));
                }
                try {
                    callSite = callSite2;
                    if (n3 == 0) break block11;
                    bl = ((String)((Object)callSite)).equals("L");
                }
                catch (oov oov4) {
                    throw b_q.a(oov4);
                }
            }
            if (bl) {
                object = b_q.b("n", (int)27915, (long)(0x39D9AA2E5F09A45L ^ l));
            }
            this.c_t(this.fex, (String)object, 2, this.o1e - 10, 0x808080);
            callSite = b_q.b("n", (int)9136, (long)(0x4DC0BCE47E2254FAL ^ l));
        }
        CallSite callSite3 = callSite;
        int n4 = this.fex.ezt((String)((Object)callSite3));
        this.c_t(this.fex, (String)((Object)callSite3), this.dt7 - n4 - 2, this.o1e - 10, 0x808080);
        super.drawScreen(n, n2, f);
        this.kbl.drawTooltips(n, n2, this.khf);
    }

    public static int v0j(gt4 gt42) {
        return gt42.s22;
    }

    public static int qp0(gt4 gt42) {
        return gt42.gqs;
    }

    public static void lml(gbe gbe2, int n, int n2, int n3, int n4, int n5, int n6) {
        gbe2.flp(n, n2, n3, n4, n5, n6);
    }

    public static String ah3(_ov _ov2) {
        return _ov2.i7w.xct();
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

                b_q.a = c.a(-157528345057441998L, -7527442082948655745L, MethodHandles.lookup().lookupClass()).a(233003976279610L);
                b_q.h = new HashMap<K, V>(13);
                var0 = b_q.a ^ 98823510473585L;
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
                var9_3 = new String[24];
                var7_4 = 0;
                var6_5 = "!bB\u00a3\u00ef\u00c2\u00a8\u00e4\u00ef\u0080\u00bf|\u00d91\u00bf\"\u00d64\u00a2\u00d5\u00acs\u00abH\u00fb\u00925h\u00cf\u00fb\u00dd6\u00f7\u00da\u00adPz\u009e\u00a8u\u0010\u00be\u00f4\u00f56v}\u00920\u0089|\u009a\u00a2\u0089\u00b8\u009b\u00a3(\u00ablE\u0085\r\u00cf\u0092\u00d0\u0083\u0017-\u00e8\u00abK\u00c3<\u00db\u00c5\u00f3\u00a9F\u0081\u008dhL{\u00dd\u00f5\u00a2\u00cd\u000f\u0088\u00fc\u0081\u00c7*tN\u00e5\u00e8 \u0095?mX\u00a7H\u00f6a\u00c5B%\u00e1\u00f0_\u00eeo\u00ca\u00c1\u00be\u00afw2\u009a}0\u001e\u0012\u00c4\u00d2\u0092\u00ab\u0019 \u00d9\u00d4\u00e49 \u00dc\u009a\u00f6\u00f6\u00ee\u00f0\u0096\u0018\b\u00ac\u00a0\u009bx\u0087\u00b0`zBP\u00fd/-\u00d3\u00dc#@p(-\u00af\u00c6\u001bP\u00eb\u001e\u00f4\u0014_\u008f\u0014\u00f8B)8\u00b9'\f2&'\u00b8l\u0097\u00aeu\u0095\u00d7t\u00db\u00b3;\u001b\u00e5) \u00c4:\u0093(\u00d2c\u000ep\u0093\u00d4\u00c4\u00ed\u0090\u00fc\u00d6\u0005\u00f8\u0005F9\u008f\u00da+\u00a4\u0002\u008dV\u00bc\u0012SsZ\u001a\u00d6H\u00d8\u0099\u0019u\u00a9\u0089{:*(\u0087\u0013\u00f39:\u00e7a5\u00bc\u0096\u00c9xMe\u00c2\u00afyI\u00d1>$\u001bw\u00ff\u00ad,lJ\u001dC|\f\u0093\u00eb\u00b3\u00b4\u00f8\u00a5\u0013\u0089(\u0004O\u00b4\u0087\u00d1\u008b\u001a\u0098P\u00dc\u00fbf\u0082c\u0015\u00bfn\u0000\u00da\u00d4o\u0084\u00f38Fu\u00c3\u00df\u0018\u00b5\u0087\u0011gyX\u00e1\u00a3RD, \u00e7P\u00908K\u001f\u001e\u00ac\u0018[\u00bb\u00c9y\u0084W\u00d5\u00dc\bQ\u00baB\u001e{\u00f2\u00d7R\u0011\u0083i\u00ccK\u00af0\u00b1\u00c7T\u00d4\u00bf\u00a9\u0089Q-\u00b5)\u00fb\u00fd\u00f86\u00bf\u00b6Ed\u00f6\u0005pk\u00aa\u00dd\u00b5\u0098\u008b\u0012Yy\u009f\u00e7`\u00d2\u0093^\u001f\u00c1q\u00c1g\u0081Q\u0018\u008a\u001cm(U\u00e3d!\u00c4\u0087?\u001eR\u00b5\u0002K\u00fa=\u008e\u0081\u0014\u0005\u0010\u00cf\u00d9\u0080\u0091\u008d\u0013W4/S\u009a\u00f0?&\u00d7\u0081b4\u0099\u00eak0i\u00f1\u00c4`KIK\u00e4F`\u00b4\u00e6\u001f\u0014I\u00cb\u00a7\u00fc\u00a1\u0005\u00eb\u00cc\u0086}\u0090\u00fd\u00db\u000f\u00d3\u0018\u0087\u009cU\u00fcx\u00c6\u00cf@\u0087\u00d8\u0082rm\u00c5\u0085f\u00cbK(\u00be\u00d6\u00e3\u00dd\u0092W\u00fe\u0017\u001d`\u009e\u00fb\u00e7\u00fb\u00df\u009a\u00a8m\u00cb\u009dZ\u00ae\u00ea\u008e\u00ea`z\u00a1v\u00a5\u00a2v\bn\u0000\u00a9\u0087Q\u0011\u00e7\u0010\u00d4\u00b7\u00e9\u00d6\u00e1\u0016\u00cd\u0017\u00a2\u0088\u001c\u009a\u0089\u001e\u00ca\n\u00104\u00b5T_\u00e7]\u0092\u008a\u00da\u00dfP\u00cdk\u0090\u009aE(sUV5R\u0006\u001d=\u00ed\u0087\u00ef\u0000\u0003\u00c6)\u0086SF}\u00fe\u00e4\u00b6f:*\t\u00cbow2\u00d7\u00ff\u00cb\u0095\u00b4\u00cf|x[\u00e6 Z\u00a1st\u0003\u008dm\u0018\u00ee\u00e8\u00e8\u00b8Zz\u0018&\u00bd~\u00b6Ll\u00bc\u00f0t\u001c\u00f9\u008e)\u00e1\u009b\u00c4E\u0018\u00b0~\u00b7w\u00a7\u00f3\u00c5L\u00ff\u00b5\u009e\u0007\u00cc\u00d0pm?\u00df\u00ad\b$8b\u00b3(\u00f9\u00d2\u00c4\u00e7\u00c8n\u00bf\u0011\u009e\u008d\u00c2\u0088\u00bf\u00e4\u0013\u0087=;]\u0095\u00034)\u0003j\u00ed\u00e7J\u00c9\u00c5\u0093\u00ffqQ9\u001d\u00a9u\u008b\u00e4(-\u001bD\u0096v\u00b6Q\u00d5\u008f\u00c0L\u00d8\r\u0080\u0014\u00a1>\u0002\u00cbL\u000e5\u00c4\u0090\u0006?\u00a5\u00f6f\u0011\u00f8\u0087\u0000\u00ebq\u007f\u00c5\u00d46H(\u00a1L\u00b2#F\u00a5\u0000\u00b8\u00d8\u0081\u0016\u00c1\u00a8%`|\u00b6\u00d4\u0080\u00e8\u00a2yR\u00822O\u0090R\u0012F\b\"X\u00cardY8c9";
                var8_6 = "!bB\u00a3\u00ef\u00c2\u00a8\u00e4\u00ef\u0080\u00bf|\u00d91\u00bf\"\u00d64\u00a2\u00d5\u00acs\u00abH\u00fb\u00925h\u00cf\u00fb\u00dd6\u00f7\u00da\u00adPz\u009e\u00a8u\u0010\u00be\u00f4\u00f56v}\u00920\u0089|\u009a\u00a2\u0089\u00b8\u009b\u00a3(\u00ablE\u0085\r\u00cf\u0092\u00d0\u0083\u0017-\u00e8\u00abK\u00c3<\u00db\u00c5\u00f3\u00a9F\u0081\u008dhL{\u00dd\u00f5\u00a2\u00cd\u000f\u0088\u00fc\u0081\u00c7*tN\u00e5\u00e8 \u0095?mX\u00a7H\u00f6a\u00c5B%\u00e1\u00f0_\u00eeo\u00ca\u00c1\u00be\u00afw2\u009a}0\u001e\u0012\u00c4\u00d2\u0092\u00ab\u0019 \u00d9\u00d4\u00e49 \u00dc\u009a\u00f6\u00f6\u00ee\u00f0\u0096\u0018\b\u00ac\u00a0\u009bx\u0087\u00b0`zBP\u00fd/-\u00d3\u00dc#@p(-\u00af\u00c6\u001bP\u00eb\u001e\u00f4\u0014_\u008f\u0014\u00f8B)8\u00b9'\f2&'\u00b8l\u0097\u00aeu\u0095\u00d7t\u00db\u00b3;\u001b\u00e5) \u00c4:\u0093(\u00d2c\u000ep\u0093\u00d4\u00c4\u00ed\u0090\u00fc\u00d6\u0005\u00f8\u0005F9\u008f\u00da+\u00a4\u0002\u008dV\u00bc\u0012SsZ\u001a\u00d6H\u00d8\u0099\u0019u\u00a9\u0089{:*(\u0087\u0013\u00f39:\u00e7a5\u00bc\u0096\u00c9xMe\u00c2\u00afyI\u00d1>$\u001bw\u00ff\u00ad,lJ\u001dC|\f\u0093\u00eb\u00b3\u00b4\u00f8\u00a5\u0013\u0089(\u0004O\u00b4\u0087\u00d1\u008b\u001a\u0098P\u00dc\u00fbf\u0082c\u0015\u00bfn\u0000\u00da\u00d4o\u0084\u00f38Fu\u00c3\u00df\u0018\u00b5\u0087\u0011gyX\u00e1\u00a3RD, \u00e7P\u00908K\u001f\u001e\u00ac\u0018[\u00bb\u00c9y\u0084W\u00d5\u00dc\bQ\u00baB\u001e{\u00f2\u00d7R\u0011\u0083i\u00ccK\u00af0\u00b1\u00c7T\u00d4\u00bf\u00a9\u0089Q-\u00b5)\u00fb\u00fd\u00f86\u00bf\u00b6Ed\u00f6\u0005pk\u00aa\u00dd\u00b5\u0098\u008b\u0012Yy\u009f\u00e7`\u00d2\u0093^\u001f\u00c1q\u00c1g\u0081Q\u0018\u008a\u001cm(U\u00e3d!\u00c4\u0087?\u001eR\u00b5\u0002K\u00fa=\u008e\u0081\u0014\u0005\u0010\u00cf\u00d9\u0080\u0091\u008d\u0013W4/S\u009a\u00f0?&\u00d7\u0081b4\u0099\u00eak0i\u00f1\u00c4`KIK\u00e4F`\u00b4\u00e6\u001f\u0014I\u00cb\u00a7\u00fc\u00a1\u0005\u00eb\u00cc\u0086}\u0090\u00fd\u00db\u000f\u00d3\u0018\u0087\u009cU\u00fcx\u00c6\u00cf@\u0087\u00d8\u0082rm\u00c5\u0085f\u00cbK(\u00be\u00d6\u00e3\u00dd\u0092W\u00fe\u0017\u001d`\u009e\u00fb\u00e7\u00fb\u00df\u009a\u00a8m\u00cb\u009dZ\u00ae\u00ea\u008e\u00ea`z\u00a1v\u00a5\u00a2v\bn\u0000\u00a9\u0087Q\u0011\u00e7\u0010\u00d4\u00b7\u00e9\u00d6\u00e1\u0016\u00cd\u0017\u00a2\u0088\u001c\u009a\u0089\u001e\u00ca\n\u00104\u00b5T_\u00e7]\u0092\u008a\u00da\u00dfP\u00cdk\u0090\u009aE(sUV5R\u0006\u001d=\u00ed\u0087\u00ef\u0000\u0003\u00c6)\u0086SF}\u00fe\u00e4\u00b6f:*\t\u00cbow2\u00d7\u00ff\u00cb\u0095\u00b4\u00cf|x[\u00e6 Z\u00a1st\u0003\u008dm\u0018\u00ee\u00e8\u00e8\u00b8Zz\u0018&\u00bd~\u00b6Ll\u00bc\u00f0t\u001c\u00f9\u008e)\u00e1\u009b\u00c4E\u0018\u00b0~\u00b7w\u00a7\u00f3\u00c5L\u00ff\u00b5\u009e\u0007\u00cc\u00d0pm?\u00df\u00ad\b$8b\u00b3(\u00f9\u00d2\u00c4\u00e7\u00c8n\u00bf\u0011\u009e\u008d\u00c2\u0088\u00bf\u00e4\u0013\u0087=;]\u0095\u00034)\u0003j\u00ed\u00e7J\u00c9\u00c5\u0093\u00ffqQ9\u001d\u00a9u\u008b\u00e4(-\u001bD\u0096v\u00b6Q\u00d5\u008f\u00c0L\u00d8\r\u0080\u0014\u00a1>\u0002\u00cbL\u000e5\u00c4\u0090\u0006?\u00a5\u00f6f\u0011\u00f8\u0087\u0000\u00ebq\u007f\u00c5\u00d46H(\u00a1L\u00b2#F\u00a5\u0000\u00b8\u00d8\u0081\u0016\u00c1\u00a8%`|\u00b6\u00d4\u0080\u00e8\u00a2yR\u00822O\u0090R\u0012F\b\"X\u00cardY8c9".length();
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
                    var9_3[var7_4++] = b_q.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008c\u00cd\u00a4]\u00ca]\u00edx'D\u001f\u00ebY\u00cd\u009a_)\u00d7\u008b,\u0082\u0087R\u00f9\u0081Y\u00c8\u0005~\u00f8::\u00cbuq03,\u00bc^ \u00d8r\u0098\u00a6\t<\u0007\u008e\u00e2\u00c1vH!\u00c9CKa{\u00ae\u0096+\u00ac\u00fbR(\u00ed\u0087B\u0012\u00d6\u00a3I";
                    var8_6 = "\u008c\u00cd\u00a4]\u00ca]\u00edx'D\u001f\u00ebY\u00cd\u009a_)\u00d7\u008b,\u0082\u0087R\u00f9\u0081Y\u00c8\u0005~\u00f8::\u00cbuq03,\u00bc^ \u00d8r\u0098\u00a6\t<\u0007\u008e\u00e2\u00c1vH!\u00c9CKa{\u00ae\u0096+\u00ac\u00fbR(\u00ed\u0087B\u0012\u00d6\u00a3I".length();
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
                    var9_3[var7_4++] = b_q.a(var10_9).intern();
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
        b_q.b = var9_3;
        b_q.g = new String[24];
        b_q.l5f = new moh$_ru[]{moh$_ru.yeb, moh$_ru.xby, moh$_ru.trw, moh$_ru.w6a, moh$_ru.b8t, moh$_ru.ql7, moh$_ru.daj, moh$_ru.x1y, moh$_ru.jfu, moh$_ru.jgg, moh$_ru._ll, moh$_ru.oes};
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x576F;
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
                throw new RuntimeException("b_q", exception);
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
            b_q.g[n2] = b_q.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b_q.b(n, l);
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
            throw new RuntimeException("b_q" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b_q.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

