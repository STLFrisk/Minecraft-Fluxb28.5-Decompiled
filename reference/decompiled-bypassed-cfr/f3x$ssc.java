/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Mouse;

public abstract class f3x$ssc
extends ed7 {
    public int d4i;
    public List _1h;
    public Comparator otn;
    public int c9s;
    public int uh5;
    public final f3x gw_;
    private static final long b = c.a(2417605254302032756L, -5563795385313032329L, MethodHandles.lookup().lookupClass()).a(49378974354022L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    public f3x$ssc(f3x f3x2, c05 c052) {
        this.gw_ = f3x2;
        super(c052, f3x2.dt7, f3x2.o1e, 32, f3x2.o1e - 64, 20);
        this.d4i = -1;
        this.c9s = -1;
        this.fai(false);
        this.lfu(true, 20);
    }

    @Override
    public void elementClicked(int n, boolean bl, int n2, int n3) {
    }

    @Override
    public boolean isSelected(int n) {
        return false;
    }

    @Override
    public void drawBackground() {
        this.gw_.xmz();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void xwh(int var1_1, int var2_2, jom var3_3) {
        block48: {
            block52: {
                block51: {
                    block50: {
                        block49: {
                            block47: {
                                block46: {
                                    block44: {
                                        block43: {
                                            block41: {
                                                block40: {
                                                    block38: {
                                                        block36: {
                                                            block37: {
                                                                var4_4 = t9d.b();
                                                                try {
                                                                    try {
                                                                        v0 = Mouse.isButtonDown((int)0);
                                                                        if (var4_4 == 0) break block36;
                                                                        if (v0 != 0) break block37;
                                                                    }
                                                                    catch (oov v1) {
                                                                        throw f3x$ssc.c(v1);
                                                                    }
                                                                    this.d4i = -1;
                                                                }
                                                                catch (oov v2) {
                                                                    throw f3x$ssc.c(v2);
                                                                }
                                                            }
                                                            try {
                                                                v3 = this;
                                                                if (var4_4 == 0) break block38;
                                                                v0 = v3.d4i;
                                                            }
                                                            catch (oov v4) {
                                                                throw f3x$ssc.c(v4);
                                                            }
                                                        }
                                                        try {
                                                            block39: {
                                                                try {
                                                                    if (v0 != 0) break block39;
                                                                    f3x._e5(this.gw_, var1_1 + 115 - 18, var2_2 + 1, 0, 0);
                                                                    if (var4_4 != 0) break block40;
                                                                }
                                                                catch (oov v5) {
                                                                    throw f3x$ssc.c(v5);
                                                                }
                                                            }
                                                            v3 = this;
                                                        }
                                                        catch (oov v6) {
                                                            throw f3x$ssc.c(v6);
                                                        }
                                                    }
                                                    f3x._e5(v3.gw_, var1_1 + 115 - 18, var2_2 + 1, 0, 18);
                                                }
                                                try {
                                                    block42: {
                                                        try {
                                                            try {
                                                                v7 = this;
                                                                if (var4_4 == 0) break block41;
                                                                if (v7.d4i != 1) break block42;
                                                            }
                                                            catch (oov v8) {
                                                                throw f3x$ssc.c(v8);
                                                            }
                                                            f3x._e5(this.gw_, var1_1 + 165 - 18, var2_2 + 1, 0, 0);
                                                            if (var4_4 != 0) break block43;
                                                        }
                                                        catch (oov v9) {
                                                            throw f3x$ssc.c(v9);
                                                        }
                                                    }
                                                    v7 = this;
                                                }
                                                catch (oov v10) {
                                                    throw f3x$ssc.c(v10);
                                                }
                                            }
                                            f3x._e5(v7.gw_, var1_1 + 165 - 18, var2_2 + 1, 0, 18);
                                        }
                                        try {
                                            block45: {
                                                try {
                                                    try {
                                                        v11 = this;
                                                        if (var4_4 == 0) break block44;
                                                        if (v11.d4i != 2) break block45;
                                                    }
                                                    catch (oov v12) {
                                                        throw f3x$ssc.c(v12);
                                                    }
                                                    f3x._e5(this.gw_, var1_1 + 215 - 18, var2_2 + 1, 0, 0);
                                                    if (var4_4 != 0) break block46;
                                                }
                                                catch (oov v13) {
                                                    throw f3x$ssc.c(v13);
                                                }
                                            }
                                            v11 = this;
                                        }
                                        catch (oov v14) {
                                            throw f3x$ssc.c(v14);
                                        }
                                    }
                                    f3x._e5(v11.gw_, var1_1 + 215 - 18, var2_2 + 1, 0, 18);
                                }
                                try {
                                    try {
                                        v15 = this.c9s;
                                        if (var4_4 == 0) break block47;
                                        if (v15 == -1) break block48;
                                    }
                                    catch (oov v16) {
                                        throw f3x$ssc.c(v16);
                                    }
                                    v15 = 79;
                                }
                                catch (oov v17) {
                                    throw f3x$ssc.c(v17);
                                }
                            }
                            var5_5 = v15;
                            var6_6 = 18;
                            try {
                                v18 = this.c9s;
                                v19 = 1;
                                if (var4_4 == 0) break block49;
                                if (v18 == v19) {
                                }
                                ** GOTO lbl110
                            }
                            catch (oov v20) {
                                throw f3x$ssc.c(v20);
                            }
                            var5_5 = 129;
                            try {
                                if (var4_4 != 0) break block50;
lbl110:
                                // 2 sources

                                v18 = this.c9s;
                                v19 = 2;
                            }
                            catch (oov v21) {
                                throw f3x$ssc.c(v21);
                            }
                        }
                        try {
                            if (var4_4 == 0) break block51;
                            if (v18 != v19) break block50;
                        }
                        catch (oov v22) {
                            throw f3x$ssc.c(v22);
                        }
                        var5_5 = 179;
                    }
                    try {
                        v23 = this;
                        if (var4_4 == 0) break block52;
                        v18 = v23.uh5;
                        v19 = 1;
                    }
                    catch (oov v24) {
                        throw f3x$ssc.c(v24);
                    }
                }
                if (v18 == v19) {
                    var6_6 = 36;
                }
                v23 = this;
            }
            f3x._e5(v23.gw_, var1_1 + var5_5, var2_2 + 1, var6_6, 0);
        }
    }

    @Override
    public void n_7(int n, int n2) {
        block40: {
            f3x$ssc f3x$ssc;
            long l;
            block39: {
                int n3;
                block38: {
                    int n4;
                    block35: {
                        int n5;
                        block36: {
                            block33: {
                                l = b ^ 0x3ACC7868152DL;
                                n4 = t9d.b();
                                try {
                                    block34: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        this.d4i = -1;
                                                        n3 = n;
                                                        n5 = 79;
                                                        if (n4 == 0) break block33;
                                                        if (n3 < n5) break block34;
                                                    }
                                                    catch (oov oov2) {
                                                        throw f3x$ssc.c(oov2);
                                                    }
                                                    n3 = n;
                                                    n5 = 115;
                                                    if (n4 == 0) break block33;
                                                }
                                                catch (oov oov3) {
                                                    throw f3x$ssc.c(oov3);
                                                }
                                                if (n3 >= n5) break block34;
                                            }
                                            catch (oov oov4) {
                                                throw f3x$ssc.c(oov4);
                                            }
                                            this.d4i = 0;
                                            if (n4 != 0) break block35;
                                        }
                                        catch (oov oov5) {
                                            throw f3x$ssc.c(oov5);
                                        }
                                    }
                                    n3 = n;
                                    n5 = 129;
                                }
                                catch (oov oov6) {
                                    throw f3x$ssc.c(oov6);
                                }
                            }
                            try {
                                try {
                                    block37: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n4 == 0) break block36;
                                                        if (n3 < n5) break block37;
                                                    }
                                                    catch (oov oov7) {
                                                        throw f3x$ssc.c(oov7);
                                                    }
                                                    n3 = n;
                                                    n5 = 165;
                                                    if (n4 == 0) break block36;
                                                }
                                                catch (oov oov8) {
                                                    throw f3x$ssc.c(oov8);
                                                }
                                                if (n3 >= n5) break block37;
                                            }
                                            catch (oov oov9) {
                                                throw f3x$ssc.c(oov9);
                                            }
                                            this.d4i = 1;
                                            if (n4 != 0) break block35;
                                        }
                                        catch (oov oov10) {
                                            throw f3x$ssc.c(oov10);
                                        }
                                    }
                                    n3 = n;
                                    if (n4 == 0) break block38;
                                }
                                catch (oov oov11) {
                                    throw f3x$ssc.c(oov11);
                                }
                                n5 = 179;
                            }
                            catch (oov oov12) {
                                throw f3x$ssc.c(oov12);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n3 < n5) break block35;
                                    n3 = n;
                                    if (n4 == 0) break block38;
                                }
                                catch (oov oov13) {
                                    throw f3x$ssc.c(oov13);
                                }
                                if (n3 >= 215) break block35;
                            }
                            catch (oov oov14) {
                                throw f3x$ssc.c(oov14);
                            }
                            this.d4i = 2;
                        }
                        catch (oov oov15) {
                            throw f3x$ssc.c(oov15);
                        }
                    }
                    try {
                        f3x$ssc = this;
                        if (n4 == 0) break block39;
                        n3 = f3x$ssc.d4i;
                    }
                    catch (oov oov16) {
                        throw f3x$ssc.c(oov16);
                    }
                }
                try {
                    if (n3 >= 0) {
                        this.arl(this.d4i);
                        f3x$ssc = this;
                    }
                    break block40;
                }
                catch (oov oov17) {
                    throw f3x$ssc.c(oov17);
                }
            }
            f3x$ssc.gk_.yp9().mak(vs1._e_(new gdz((String)((Object)f3x$ssc.a("p", (int)16056, (long)(0x6CD667383E18DFDL ^ l)))), 1.0f));
        }
    }

    @Override
    public final int getSize() {
        return this._1h.size();
    }

    public final rlk ak8(int n) {
        return (rlk)this._1h.get(n);
    }

    public abstract String g30(int var1);

    public void v4c(_ss _ss2, int n, int n2, boolean n3) {
        block17: {
            int n4;
            int n5;
            int n6;
            String string;
            owt owt2;
            f3x f3x2;
            block15: {
                block16: {
                    String string2;
                    int n7;
                    block12: {
                        int n8;
                        int n9;
                        int n10;
                        String string3;
                        owt owt3;
                        f3x f3x3;
                        block13: {
                            block14: {
                                _ss _ss3;
                                block11: {
                                    n7 = t9d.c();
                                    try {
                                        _ss3 = _ss2;
                                        if (n7 != 0) break block11;
                                        if (_ss3 == null) break block12;
                                    }
                                    catch (oov oov2) {
                                        throw f3x$ssc.c(oov2);
                                    }
                                    _ss3 = _ss2;
                                }
                                string2 = _ss3.rbf(f3x.h5z(this.gw_).zgq(_ss2));
                                try {
                                    try {
                                        f3x3 = this.gw_;
                                        owt3 = f3x.xj2(this.gw_);
                                        string3 = string2;
                                        n10 = n - f3x.qpj(this.gw_).ezt(string2);
                                        n9 = n2 + 5;
                                        n8 = n3;
                                        if (n7 != 0) break block13;
                                        if (n8 == 0) break block14;
                                    }
                                    catch (oov oov3) {
                                        throw f3x$ssc.c(oov3);
                                    }
                                    n8 = 0xFFFFFF;
                                    break block13;
                                }
                                catch (oov oov4) {
                                    throw f3x$ssc.c(oov4);
                                }
                            }
                            n8 = 0x909090;
                        }
                        f3x3.c_t(owt3, string3, n10, n9, n8);
                        if (n7 == 0) break block17;
                    }
                    string2 = "-";
                    try {
                        try {
                            f3x2 = this.gw_;
                            owt2 = f3x.k8c(this.gw_);
                            string = string2;
                            n6 = n - f3x._bu(this.gw_).ezt(string2);
                            n5 = n2 + 5;
                            n4 = n3;
                            if (n7 != 0) break block15;
                            if (n4 == 0) break block16;
                        }
                        catch (oov oov5) {
                            throw f3x$ssc.c(oov5);
                        }
                        n4 = 0xFFFFFF;
                        break block15;
                    }
                    catch (oov oov6) {
                        throw f3x$ssc.c(oov6);
                    }
                }
                n4 = 0x909090;
            }
            f3x2.c_t(owt2, string, n6, n5, n4);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void fbo(int var1_1, int var2_2) {
        block51: {
            block62: {
                block58: {
                    block64: {
                        block61: {
                            block60: {
                                block59: {
                                    block57: {
                                        block54: {
                                            block63: {
                                                block56: {
                                                    block55: {
                                                        block53: {
                                                            block52: {
                                                                block50: {
                                                                    var3_3 = t9d.c();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v0 = var2_2;
                                                                                v1 = this.vem;
                                                                                if (var3_3 != 0) break block50;
                                                                                if (v0 < v1) break block51;
                                                                            }
                                                                            catch (oov v2) {
                                                                                throw f3x$ssc.c(v2);
                                                                            }
                                                                            v0 = var2_2;
                                                                            if (var3_3 != 0) break block52;
                                                                        }
                                                                        catch (oov v3) {
                                                                            throw f3x$ssc.c(v3);
                                                                        }
                                                                        v1 = this.chj;
                                                                    }
                                                                    catch (oov v4) {
                                                                        throw f3x$ssc.c(v4);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v0 > v1) break block51;
                                                                    v0 = this.dwe(var1_1, var2_2);
                                                                }
                                                                catch (oov v5) {
                                                                    throw f3x$ssc.c(v5);
                                                                }
                                                            }
                                                            var4_4 = v0;
                                                            var5_5 = this.wde / 2 - 92 - 16;
                                                            try {
                                                                v6 = var4_4;
                                                                if (var3_3 != 0) break block53;
                                                                if (v6 < 0) break block54;
                                                            }
                                                            catch (oov v7) {
                                                                throw f3x$ssc.c(v7);
                                                            }
                                                            v6 = var1_1;
                                                        }
                                                        try {
                                                            try {
                                                                v8 = var5_5 + 40;
                                                                if (var3_3 != 0) break block55;
                                                                if (v6 < v8) break block56;
                                                            }
                                                            catch (oov v9) {
                                                                throw f3x$ssc.c(v9);
                                                            }
                                                            v6 = var1_1;
                                                            v8 = var5_5 + 40 + 20;
                                                        }
                                                        catch (oov v10) {
                                                            throw f3x$ssc.c(v10);
                                                        }
                                                    }
                                                    if (v6 <= v8) break block63;
                                                }
                                                return;
                                            }
                                            var6_6 = this.ak8(var4_4);
                                            this.nl7((rlk)var6_6, var1_1, var2_2);
                                            if (var3_3 == 0) break block51;
                                        }
                                        var6_6 = "";
                                        try {
                                            try {
                                                try {
                                                    v11 = var1_1;
                                                    v12 = var5_5 + 115 - 18;
                                                    if (var3_3 != 0) break block57;
                                                    if (v11 >= v12) {
                                                    }
                                                    ** GOTO lbl89
                                                }
                                                catch (oov v13) {
                                                    throw f3x$ssc.c(v13);
                                                }
                                                v11 = var1_1;
                                                v12 = var5_5 + 115;
                                                if (var3_3 != 0) break block57;
                                            }
                                            catch (oov v14) {
                                                throw f3x$ssc.c(v14);
                                            }
                                            if (v11 <= v12) {
                                            }
                                            ** GOTO lbl89
                                        }
                                        catch (oov v15) {
                                            throw f3x$ssc.c(v15);
                                        }
                                        var6_6 = this.g30(0);
                                        try {
                                            if (var3_3 == 0) break block58;
lbl89:
                                            // 3 sources

                                            v11 = var1_1;
                                            v12 = var5_5 + 165 - 18;
                                        }
                                        catch (oov v16) {
                                            throw f3x$ssc.c(v16);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var3_3 != 0) break block59;
                                                if (v11 >= v12) {
                                                }
                                                ** GOTO lbl118
                                            }
                                            catch (oov v17) {
                                                throw f3x$ssc.c(v17);
                                            }
                                            v11 = var1_1;
                                            v12 = var5_5 + 165;
                                            if (var3_3 != 0) break block59;
                                        }
                                        catch (oov v18) {
                                            throw f3x$ssc.c(v18);
                                        }
                                        if (v11 <= v12) {
                                        }
                                        ** GOTO lbl118
                                    }
                                    catch (oov v19) {
                                        throw f3x$ssc.c(v19);
                                    }
                                    var6_6 = this.g30(1);
                                    try {
                                        if (var3_3 == 0) break block58;
lbl118:
                                        // 3 sources

                                        v11 = var1_1;
                                        v12 = var5_5 + 215 - 18;
                                    }
                                    catch (oov v20) {
                                        throw f3x$ssc.c(v20);
                                    }
                                }
                                try {
                                    try {
                                        if (var3_3 != 0) break block60;
                                        if (v11 < v12) break block61;
                                    }
                                    catch (oov v21) {
                                        throw f3x$ssc.c(v21);
                                    }
                                    v11 = var1_1;
                                    v12 = var5_5 + 215;
                                }
                                catch (oov v22) {
                                    throw f3x$ssc.c(v22);
                                }
                            }
                            if (v11 <= v12) break block64;
                        }
                        return;
                    }
                    var6_6 = this.g30(2);
                }
                var6_6 = ("" + fc1.gx1((String)var6_6, new Object[0])).trim();
                try {
                    try {
                        v23 = var6_6.length();
                        if (var3_3 != 0) break block62;
                        if (v23 <= 0) break block51;
                    }
                    catch (oov v24) {
                        throw f3x$ssc.c(v24);
                    }
                    v23 = var1_1 + 12;
                }
                catch (oov v25) {
                    throw f3x$ssc.c(v25);
                }
            }
            var7_7 = v23;
            var8_8 = var2_2 - 12;
            var9_9 = f3x.p8s(this.gw_).ezt((String)var6_6);
            this.gw_.flp(var7_7 - 3, var8_8 - 3, var7_7 + var9_9 + 3, var8_8 + 8 + 3, -1073741824, -1073741824);
            f3x.z4q(this.gw_).km1((String)var6_6, var7_7, var8_8, -1);
        }
    }

    public void nl7(rlk rlk2, int n, int n2) {
        block7: {
            int n3;
            String string;
            block8: {
                rlk rlk3;
                int n4;
                long l;
                block6: {
                    l = b ^ 0x78D81026BED2L;
                    n4 = t9d.b();
                    try {
                        rlk3 = rlk2;
                        if (n4 == 0) break block6;
                        if (rlk3 == null) break block7;
                    }
                    catch (oov oov2) {
                        throw f3x$ssc.c(oov2);
                    }
                    rlk3 = rlk2;
                }
                u7m u7m2 = rlk3.u3i();
                erg erg2 = new erg(u7m2);
                String string2 = erg2.ozi();
                string = ("" + fc1.gx1(string2 + (String)((Object)f3x$ssc.a("p", (int)19106, (long)(0x527D01E436B0D219L ^ l))), new Object[0])).trim();
                try {
                    try {
                        n3 = string.length();
                        if (n4 == 0) break block8;
                        if (n3 <= 0) break block7;
                    }
                    catch (oov oov3) {
                        throw f3x$ssc.c(oov3);
                    }
                    n3 = n + 12;
                }
                catch (oov oov4) {
                    throw f3x$ssc.c(oov4);
                }
            }
            int n5 = n3;
            int n6 = n2 - 12;
            int n7 = f3x.pl3(this.gw_).ezt(string);
            this.gw_.flp(n5 - 3, n6 - 3, n5 + n7 + 3, n6 + 8 + 3, -1073741824, -1073741824);
            f3x.esu(this.gw_).km1(string, n5, n6, -1);
        }
    }

    public void arl(int n) {
        block14: {
            block15: {
                f3x$ssc f3x$ssc;
                int n2;
                int n3;
                int n4;
                block12: {
                    n4 = t9d.b();
                    try {
                        try {
                            block13: {
                                try {
                                    try {
                                        n3 = n;
                                        n2 = this.c9s;
                                        if (n4 == 0) break block12;
                                        if (n3 == n2) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw f3x$ssc.c(oov2);
                                    }
                                    this.c9s = n;
                                    this.uh5 = -1;
                                    if (n4 != 0) break block14;
                                }
                                catch (oov oov3) {
                                    throw f3x$ssc.c(oov3);
                                }
                            }
                            f3x$ssc = this;
                            if (n4 == 0) break block15;
                        }
                        catch (oov oov4) {
                            throw f3x$ssc.c(oov4);
                        }
                        n3 = f3x$ssc.uh5;
                        n2 = -1;
                    }
                    catch (oov oov5) {
                        throw f3x$ssc.c(oov5);
                    }
                }
                try {
                    block16: {
                        try {
                            if (n3 != n2) break block16;
                            this.uh5 = 1;
                            if (n4 != 0) break block14;
                        }
                        catch (oov oov6) {
                            throw f3x$ssc.c(oov6);
                        }
                    }
                    this.c9s = -1;
                    f3x$ssc = this;
                }
                catch (oov oov7) {
                    throw f3x$ssc.c(oov7);
                }
            }
            f3x$ssc.uh5 = 0;
        }
        Collections.sort(this._1h, this.otn);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        e = new HashMap(13);
        long l = b ^ 0x16E7D3960388L;
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
        String string = "\u009b*\u0080\u00b8\u00a47\u00b9\u00fb\u00a5\u00fb\u00bct\\\u00dcZ\u00d5(\u00f6\u00f6\u00e9X\u007f9\u00bdk\u00cf\u001fM\u00a7\u009a\u00a1\u0012\u00a2\u0018j\u00b4s\u0099\u00b1\u00b3\u00bd>\u00a6\u008f-=\u0085\t*\u000e\u00a5\"\u00df\u00a0\u008e8\u00e0";
        int n2 = "\u009b*\u0080\u00b8\u00a47\u00b9\u00fb\u00a5\u00fb\u00bct\\\u00dcZ\u00d5(\u00f6\u00f6\u00e9X\u007f9\u00bdk\u00cf\u001fM\u00a7\u009a\u00a1\u0012\u00a2\u0018j\u00b4s\u0099\u00b1\u00b3\u00bd>\u00a6\u008f-=\u0085\t*\u000e\u00a5\"\u00df\u00a0\u008e8\u00e0".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = f3x$ssc.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov c(oov oov2) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x21C2;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("f3x$ssc", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            f3x$ssc.d[n2] = f3x$ssc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f3x$ssc.a(n, l);
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
            throw new RuntimeException("f3x$ssc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f3x$ssc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

