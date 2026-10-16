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

public class co7
extends rdv {
    private /* synthetic */ float nes;
    private static final long b;
    private static final String[] h;
    private static final String[] i;
    private static final Map m;

    public co7(t9d t9d2) {
        super(t9d2);
        this.nes = 1.0f;
    }

    public co7(t9d t9d2, mew mew2, vt2 vt22) {
        super(t9d2, mew2);
        this.nes = 1.0f;
        this.qht(vt22);
    }

    @Override
    public void tbj() {
        this.a0c()._i_(8, 5);
        this.a0c().kp2(9, (byte)0);
    }

    @Override
    public float npl() {
        return 0.0f;
    }

    @Override
    public boolean m1t(ofh ofh2, float f) {
        boolean bl;
        block18: {
            co7 co72;
            block20: {
                block19: {
                    boolean bl2;
                    block21: {
                        block22: {
                            int n;
                            block16: {
                                block17: {
                                    n = t9d.b();
                                    try {
                                        try {
                                            bl = this.nss(ofh2);
                                            if (n == 0) break block16;
                                            if (!bl) break block17;
                                        }
                                        catch (oov oov2) {
                                            throw co7.a(oov2);
                                        }
                                        return false;
                                    }
                                    catch (oov oov3) {
                                        throw co7.a(oov3);
                                    }
                                }
                                bl = ofh2.yto();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n == 0) break block18;
                                                    if (bl) break block19;
                                                }
                                                catch (oov oov4) {
                                                    throw co7.a(oov4);
                                                }
                                                co72 = this;
                                                if (n == 0) break block20;
                                            }
                                            catch (oov oov5) {
                                                throw co7.a(oov5);
                                            }
                                            if (co72.t9o() == null) break block19;
                                        }
                                        catch (oov oov6) {
                                            throw co7.a(oov6);
                                        }
                                        bl2 = this.oay.v0f;
                                        if (n == 0) break block21;
                                    }
                                    catch (oov oov7) {
                                        throw co7.a(oov7);
                                    }
                                    if (bl2) break block22;
                                }
                                catch (oov oov8) {
                                    throw co7.a(oov8);
                                }
                                this.b4q(ofh2.nra(), false);
                                this.cid(null);
                            }
                            catch (oov oov9) {
                                throw co7.a(oov9);
                            }
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                co72 = this;
            }
            bl = super.m1t(ofh2, f);
        }
        return bl;
    }

    @Override
    public int bli() {
        return 12;
    }

    @Override
    public int cgb() {
        return 12;
    }

    @Override
    public boolean xvv(double d) {
        double d2;
        block2: {
            block3: {
                double d3 = 16.0;
                d3 = d3 * 64.0 * this.y33;
                int n = t9d.b();
                try {
                    double d4 = d - d3 * d3;
                    d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                    if (n == 0) break block2;
                    if (d2 >= 0) break block3;
                }
                catch (oov oov2) {
                    throw co7.a(oov2);
                }
                d2 = 1.0;
                break block2;
            }
            d2 = 0.0;
        }
        return (boolean)d2;
    }

    @Override
    public void r4_(i2h i2h2) {
        this.b4q(i2h2, true);
    }

    public void b4q(i2h i2h2, boolean bl) {
        block18: {
            co7 co72;
            erg erg2;
            block21: {
                boolean bl2;
                int n;
                block19: {
                    block20: {
                        co7 co73;
                        block17: {
                            long l = b ^ 0x4077B3FBFF6FL;
                            n = t9d.c();
                            try {
                                try {
                                    co73 = this;
                                    if (n != 0) break block17;
                                    if (!co73.oay.eir()._s0((String)((Object)co7.c("k", (int)12157, (long)(0x76DA4DCDE5DABC23L ^ l))))) break block18;
                                }
                                catch (oov oov2) {
                                    throw co7.a(oov2);
                                }
                                co73 = this;
                            }
                            catch (oov oov3) {
                                throw co7.a(oov3);
                            }
                        }
                        erg2 = co73.t9o();
                        try {
                            bl2 = i2h2 instanceof ha9;
                            if (n != 0) break block19;
                            if (!bl2) break block20;
                        }
                        catch (oov oov4) {
                            throw co7.a(oov4);
                        }
                        ha9 ha92 = (ha9)i2h2;
                        try {
                            try {
                                bl2 = ha92.lls.g40;
                                if (n != 0) break block19;
                                if (!bl2) break block20;
                            }
                            catch (oov oov5) {
                                throw co7.a(oov5);
                            }
                            this.luu(erg2);
                            return;
                        }
                        catch (oov oov6) {
                            throw co7.a(oov6);
                        }
                    }
                    bl2 = bl;
                }
                try {
                    if (bl2) {
                        this.qji(new erg(xbr.hqq), 0.0f);
                    }
                }
                catch (oov oov7) {
                    throw co7.a(oov7);
                }
                try {
                    try {
                        if (erg2 == null) break block18;
                        co72 = this;
                        if (n != 0) break block21;
                    }
                    catch (oov oov8) {
                        throw co7.a(oov8);
                    }
                    if (!(co72.z2d.nextFloat() < this.nes)) break block18;
                }
                catch (oov oov9) {
                    throw co7.a(oov9);
                }
                erg2 = erg2.yaq();
                this.luu(erg2);
                co72 = this;
            }
            co72.qji(erg2, 0.0f);
        }
    }

    private void luu(erg erg2) {
        block5: {
            erg erg3;
            block6: {
                block7: {
                    int n;
                    long l;
                    block4: {
                        l = b ^ 0x354A896EF733L;
                        n = t9d.b();
                        try {
                            erg3 = erg2;
                            if (n == 0) break block4;
                            if (erg3 == null) break block5;
                        }
                        catch (oov oov2) {
                            throw co7.a(oov2);
                        }
                        erg3 = erg2;
                    }
                    try {
                        if (n == 0) break block6;
                        if (erg3.gn1() != xbr.kdv) break block7;
                    }
                    catch (oov oov3) {
                        throw co7.a(oov3);
                    }
                    ucr ucr2 = ((f58)erg2.gn1()).h9y(erg2, this.oay);
                    ucr2.xoj.remove((String)((Object)co7.c("k", (int)9563, (long)(0x5DC16DD3CF7ABE5AL ^ l))) + this.jwu());
                }
                erg3 = erg2;
            }
            erg3.s2k(null);
        }
    }

    public erg t9o() {
        return this.a0c().qh4(8);
    }

    public void cid(erg erg2) {
        this.ncg(erg2, true);
    }

    private void ncg(erg erg2, boolean bl) {
        block13: {
            co7 co72;
            block14: {
                int n;
                block12: {
                    block11: {
                        erg erg3;
                        block10: {
                            n = t9d.c();
                            try {
                                erg3 = erg2;
                                if (n != 0) break block10;
                                if (erg3 == null) break block11;
                            }
                            catch (oov oov2) {
                                throw co7.a(oov2);
                            }
                            erg2 = erg2.yaq();
                            erg2.qd2 = 1;
                            erg3 = erg2;
                        }
                        erg3.s2k(this);
                    }
                    try {
                        try {
                            this.a0c().c66(8, erg2);
                            co72 = this;
                            if (n != 0) break block12;
                            co72.a0c().pqa(8);
                            if (!bl) break block13;
                        }
                        catch (oov oov3) {
                            throw co7.a(oov3);
                        }
                        co72 = this;
                    }
                    catch (oov oov4) {
                        throw co7.a(oov4);
                    }
                }
                try {
                    try {
                        if (n != 0) break block14;
                        if (co72.aie == null) break block13;
                    }
                    catch (oov oov5) {
                        throw co7.a(oov5);
                    }
                    co72 = this;
                }
                catch (oov oov6) {
                    throw co7.a(oov6);
                }
            }
            co72.oay.lw8(this.aie, ox_.ibw);
        }
    }

    public int fsp() {
        return this.a0c().miz(9);
    }

    public void kgt(int n) {
        this.mq4(n, true);
    }

    private void mq4(int n, boolean bl) {
        block9: {
            co7 co72;
            block10: {
                int n2;
                block8: {
                    n2 = t9d.b();
                    try {
                        try {
                            co72 = this;
                            if (n2 == 0) break block8;
                            co72.a0c().c66(9, (byte)(n % 8));
                            if (!bl) break block9;
                        }
                        catch (oov oov2) {
                            throw co7.a(oov2);
                        }
                        co72 = this;
                    }
                    catch (oov oov3) {
                        throw co7.a(oov3);
                    }
                }
                try {
                    try {
                        if (n2 == 0) break block10;
                        if (co72.aie == null) break block9;
                    }
                    catch (oov oov4) {
                        throw co7.a(oov4);
                    }
                    co72 = this;
                }
                catch (oov oov5) {
                    throw co7.a(oov5);
                }
            }
            co72.oay.lw8(this.aie, ox_.ibw);
        }
    }

    @Override
    public void srs(bdo bdo2) {
        co7 co72;
        block4: {
            block5: {
                long l = b ^ 0x63D08F5720FAL;
                int n = t9d.c();
                try {
                    try {
                        co72 = this;
                        if (n != 0) break block4;
                        if (co72.t9o() == null) break block5;
                    }
                    catch (oov oov2) {
                        throw co7.a(oov2);
                    }
                    bdo2.rzm((String)((Object)co7.c("k", (int)4104, (long)(0x70A19996F8F0DCC6L ^ l))), this.t9o().zy4(new bdo()));
                    bdo2.atr((String)((Object)co7.c("k", (int)24372, (long)(0x68E060E4D4FE93FDL ^ l))), (byte)this.fsp());
                    bdo2._i9((String)((Object)co7.c("k", (int)14574, (long)(0x7D91336FE3B67422L ^ l))), this.nes);
                }
                catch (oov oov3) {
                    throw co7.a(oov3);
                }
            }
            co72 = this;
        }
        super.srs(bdo2);
    }

    @Override
    public void cjb(bdo bdo2) {
        block15: {
            block16: {
                boolean bl;
                block18: {
                    long l;
                    block19: {
                        int n;
                        block17: {
                            l = b ^ 0x157ECA084C51L;
                            n = t9d.c();
                            bdo bdo3 = bdo2.b__((String)((Object)co7.c("k", (int)7274, (long)(0x7A0FCE0D73903C0CL ^ l))));
                            try {
                                try {
                                    try {
                                        try {
                                            if (n != 0) break block15;
                                            if (bdo3 == null) break block16;
                                        }
                                        catch (oov oov2) {
                                            throw co7.a(oov2);
                                        }
                                        bl = bdo3.dq5();
                                        if (n != 0) break block17;
                                    }
                                    catch (oov oov3) {
                                        throw co7.a(oov3);
                                    }
                                    if (bl) break block16;
                                }
                                catch (oov oov4) {
                                    throw co7.a(oov4);
                                }
                                this.ncg(erg.qog(bdo3), false);
                                this.mq4(bdo2.r_t((String)((Object)co7.c("k", (int)30342, (long)(0x52C5DD8E7F6E56E2L ^ l)))), false);
                                bl = bdo2.inh((String)((Object)co7.c("k", (int)19891, (long)(0x4D694B3C50C46DD2L ^ l))), 99);
                            }
                            catch (oov oov5) {
                                throw co7.a(oov5);
                            }
                        }
                        try {
                            try {
                                if (n != 0) break block18;
                                if (!bl) break block19;
                            }
                            catch (oov oov6) {
                                throw co7.a(oov6);
                            }
                            this.nes = bdo2.blg((String)((Object)co7.c("k", (int)14574, (long)(0x7D9145C1A6E91889L ^ l))));
                        }
                        catch (oov oov7) {
                            throw co7.a(oov7);
                        }
                    }
                    bl = bdo2.dmw((String)((Object)co7.c("k", (int)4184, (long)(0x267F03EAD8C3B037L ^ l))));
                }
                try {
                    if (bl) {
                        this.mq4(this.fsp() * 2, false);
                    }
                }
                catch (oov oov8) {
                    throw co7.a(oov8);
                }
            }
            super.cjb(bdo2);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean k25(ha9 var1_1) {
        block27: {
            block26: {
                block22: {
                    block23: {
                        block25: {
                            block24: {
                                var2_2 = t9d.c();
                                try {
                                    v0 = this;
                                    if (var2_2 != 0) break block22;
                                    if (v0.t9o() == null) {
                                    }
                                    ** GOTO lbl51
                                }
                                catch (oov v1) {
                                    throw co7.a(v1);
                                }
                                var3_3 = var1_1.tsc();
                                try {
                                    try {
                                        try {
                                            if (var3_3 == null) break block23;
                                            v2 = this.oay.v0f;
                                            if (var2_2 != 0) break block24;
                                        }
                                        catch (oov v3) {
                                            throw co7.a(v3);
                                        }
                                        if (v2 != 0) break block23;
                                    }
                                    catch (oov v4) {
                                        throw co7.a(v4);
                                    }
                                    this.cid(var3_3);
                                    v2 = (int)var1_1.lls.g40;
                                }
                                catch (oov v5) {
                                    throw co7.a(v5);
                                }
                            }
                            try {
                                try {
                                    if (var2_2 != 0) break block25;
                                    if (v2 != 0) break block23;
                                }
                                catch (oov v6) {
                                    throw co7.a(v6);
                                }
                                v2 = var3_3.qd2 = var3_3.qd2 - 1;
                            }
                            catch (oov v7) {
                                throw co7.a(v7);
                            }
                        }
                        try {
                            if (v2 <= 0) {
                                var1_1.up_.cxl(var1_1.up_.nb5, null);
                            }
                        }
                        catch (oov v8) {
                            throw co7.a(v8);
                        }
                    }
                    try {
                        if (var2_2 == 0) break block26;
lbl51:
                        // 2 sources

                        v0 = this;
                    }
                    catch (oov v9) {
                        throw co7.a(v9);
                    }
                }
                try {
                    try {
                        v10 = v0.oay.v0f;
                        if (var2_2 != 0) break block27;
                        if (v10) break block26;
                    }
                    catch (oov v11) {
                        throw co7.a(v11);
                    }
                    this.kgt(this.fsp() + 1);
                }
                catch (oov v12) {
                    throw co7.a(v12);
                }
            }
            v10 = true;
        }
        return v10;
    }

    public int mqa() {
        int n;
        block6: {
            co7 co72;
            block4: {
                block5: {
                    int n2 = t9d.b();
                    try {
                        try {
                            co72 = this;
                            if (n2 == 0) break block4;
                            if (co72.t9o() != null) break block5;
                        }
                        catch (oov oov2) {
                            throw co7.a(oov2);
                        }
                        n = 0;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw co7.a(oov3);
                    }
                }
                co72 = this;
            }
            n = co72.fsp() % 8 + 1;
        }
        return n;
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

                co7.b = c.a(-2896318338168551686L, -5599022023077905723L, MethodHandles.lookup().lookupClass()).a(181628083541021L);
                co7.m = new HashMap<K, V>(13);
                var0 = co7.b ^ 121716054580609L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "\u00cdECG\u00ce\u0001h\u00fb\u0096V\u0006\u00f2\u00da\u0010\u00df\u00fd\u00dd\u00ad\u00b1t\u0016\u00d6\u0089p\u00ff\u00a8\u00e9\b\u00c4\u00cch\u00df\u0010B\u00c3\u00cfg\u00ac1CD\u00a5P\u00bc\u00d1b&\u00c7\u0089\u0010\u00f7\u00ed\u00cft\u00938\u00e5\u0081\u0095\u00db\u00e6\u00a1\u0094\u00c3m\u00cd \u00f1'\u008e\u00cd{\u0089\u00b5\u00bf\u00cf\u009f`\u0000\u00d3q\u00e1\u0007\u00e0\u00ec\u0005a\u00b4/j>\u00ebeZh\u001f\u00ac;h\u0010)\u009d$\u0080'\u009cH\u008c\u00bd^\u00e9av8\u0089\u0006 V\u000ei\u00d3\u00e5K\u00b2<\u00fdi\u00ad\u00da4C\u000e\u00b5\u00bde*\u00bf\u0007\u00c2\u00a8\u00c7D\u00fa<a\u00ab\u00ef\u0014\u00b3 o\u00907\u00f7\f\u00c1\u00f0\u0002\u00a3m\u007f\u00f6'?Z\u00eb87N!!\u00d0+=~\u00fa\u00c5_'\u00ee\u001f\u00c9";
                var8_6 = "\u00cdECG\u00ce\u0001h\u00fb\u0096V\u0006\u00f2\u00da\u0010\u00df\u00fd\u00dd\u00ad\u00b1t\u0016\u00d6\u0089p\u00ff\u00a8\u00e9\b\u00c4\u00cch\u00df\u0010B\u00c3\u00cfg\u00ac1CD\u00a5P\u00bc\u00d1b&\u00c7\u0089\u0010\u00f7\u00ed\u00cft\u00938\u00e5\u0081\u0095\u00db\u00e6\u00a1\u0094\u00c3m\u00cd \u00f1'\u008e\u00cd{\u0089\u00b5\u00bf\u00cf\u009f`\u0000\u00d3q\u00e1\u0007\u00e0\u00ec\u0005a\u00b4/j>\u00ebeZh\u001f\u00ac;h\u0010)\u009d$\u0080'\u009cH\u008c\u00bd^\u00e9av8\u0089\u0006 V\u000ei\u00d3\u00e5K\u00b2<\u00fdi\u00ad\u00da4C\u000e\u00b5\u00bde*\u00bf\u0007\u00c2\u00a8\u00c7D\u00fa<a\u00ab\u00ef\u0014\u00b3 o\u00907\u00f7\f\u00c1\u00f0\u0002\u00a3m\u007f\u00f6'?Z\u00eb87N!!\u00d0+=~\u00fa\u00c5_'\u00ee\u001f\u00c9".length();
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
                    var9_3[var7_4++] = co7.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0095\u00d9\u00199\u00d2\u0005\u0086\u0099@\u0085x\"\u0012\u00ec\u00d0\u0095\u00efU\u00dd\n\u00bb\u00a4\u00aa\u00e0Z1\u00df\u0084QL\u000ec\u0018\u0092\u00c7R\u00c0]\u00aa\u0006\u00d8G\u00b4\n\u00bc\u001c#X\u00ff7\u00b9j\u00a4\u00d3\u001bV\u001d";
                    var8_6 = "\u0095\u00d9\u00199\u00d2\u0005\u0086\u0099@\u0085x\"\u0012\u00ec\u00d0\u0095\u00efU\u00dd\n\u00bb\u00a4\u00aa\u00e0Z1\u00df\u0084QL\u000ec\u0018\u0092\u00c7R\u00c0]\u00aa\u0006\u00d8G\u00b4\n\u00bc\u001c#X\u00ff7\u00b9j\u00a4\u00d3\u001bV\u001d".length();
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
                    var9_3[var7_4++] = co7.c(var10_9).intern();
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
        co7.h = var9_3;
        co7.i = new String[9];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x70A0;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("co7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            co7.i[n2] = co7.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = co7.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("co7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(co7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

