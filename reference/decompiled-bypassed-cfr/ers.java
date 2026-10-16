/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.FileUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class ers {
    public fkf usm;
    public c05 kkd;
    public ers$lgy d4s;
    public CopyOnWriteArrayList dye;
    public CopyOnWriteArrayList fv1;
    public String gn0;
    public boolean gu1;
    public float pof;
    public float _88;
    public float _oo;
    public float i0e;
    public boolean f9q;
    public int jky;
    public int mom;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ers(fkf fkf2) {
        long l = a ^ 0x62121C408E00L;
        this.kkd = c05.vz1();
        this.d4s = new ers$lgy(this, 0);
        this.dye = new CopyOnWriteArrayList();
        this.fv1 = new CopyOnWriteArrayList();
        this.gn0 = ers.a("i", (int)7213, (long)(0x5490A6C556A8CF5CL ^ l));
        this.gu1 = false;
        this.pof = -100.0f;
        this._oo = 0.0f;
        this.i0e = 0.0f;
        this.f9q = false;
        this.jky = 0;
        this.mom = 0;
        this.usm = fkf2;
        try {
            this.rup();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void dvt() {
        this.rup();
    }

    /*
     * Unable to fully structure code
     */
    public void jet(eka var1_1, int var2_2, int var3_3, float var4_4) {
        block113: {
            block117: {
                block115: {
                    block116: {
                        block114: {
                            block112: {
                                block103: {
                                    block104: {
                                        block109: {
                                            block105: {
                                                block106: {
                                                    block102: {
                                                        block100: {
                                                            block99: {
                                                                block94: {
                                                                    block98: {
                                                                        block96: {
                                                                            block97: {
                                                                                block95: {
                                                                                    block92: {
                                                                                        block93: {
                                                                                            block90: {
                                                                                                block91: {
                                                                                                    block89: {
                                                                                                        block88: {
                                                                                                            var5_5 = ers.a ^ 120192829330963L;
                                                                                                            var8_6 = var1_1.x05();
                                                                                                            var9_7 = var1_1.lrx();
                                                                                                            var7_8 = t9d.c();
                                                                                                            try {
                                                                                                                if (!this.f9q) break block88;
                                                                                                                v0 = 100.0f;
                                                                                                                break block89;
                                                                                                            }
                                                                                                            catch (oov v1) {
                                                                                                                throw ers.a(v1);
                                                                                                            }
                                                                                                        }
                                                                                                        v0 = 0.0f;
                                                                                                    }
                                                                                                    var10_9 = v0;
                                                                                                    try {
                                                                                                        try {
                                                                                                            this.i0e = ybv.lvf(this.i0e, var10_9, Math.max(10.0f, Math.abs(this.i0e - var10_9) * 40.0f) * 0.3f);
                                                                                                            v2 = this;
                                                                                                            v3 = zwr.gki.d7c().equals(ers.a("i", (int)26775, (long)(2949462996834001912L ^ var5_5)));
                                                                                                            if (var7_8 != 0) break block90;
                                                                                                            if (v3 == 0) break block91;
                                                                                                        }
                                                                                                        catch (oov v4) {
                                                                                                            throw ers.a(v4);
                                                                                                        }
                                                                                                        v3 = -12565429;
                                                                                                        break block90;
                                                                                                    }
                                                                                                    catch (oov v5) {
                                                                                                        throw ers.a(v5);
                                                                                                    }
                                                                                                }
                                                                                                v3 = -1184787;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v2.jky = v3;
                                                                                                    v6 = this;
                                                                                                    v7 = zwr.gki.d7c().equals(ers.a("i", (int)15309, (long)(8043077522281623718L ^ var5_5)));
                                                                                                    if (var7_8 != 0) break block92;
                                                                                                    if (v7 == 0) break block93;
                                                                                                }
                                                                                                catch (oov v8) {
                                                                                                    throw ers.a(v8);
                                                                                                }
                                                                                                v7 = -3289651;
                                                                                                break block92;
                                                                                            }
                                                                                            catch (oov v9) {
                                                                                                throw ers.a(v9);
                                                                                            }
                                                                                        }
                                                                                        v7 = -11514032;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v6.mom = v7;
                                                                                                    v10 = this;
                                                                                                    if (var7_8 != 0) break block94;
                                                                                                    if (v10.f9q) {
                                                                                                    }
                                                                                                    ** GOTO lbl128
                                                                                                }
                                                                                                catch (oov v11) {
                                                                                                    throw ers.a(v11);
                                                                                                }
                                                                                                v12 = hhf.md3(var2_2, var3_3, var8_6 - 95.0f, var9_7 - 5.0f - this.i0e, var8_6 - 5.0f, var9_7 - 5.0f);
                                                                                                if (var7_8 != 0) break block95;
                                                                                            }
                                                                                            catch (oov v13) {
                                                                                                throw ers.a(v13);
                                                                                            }
                                                                                            if (v12 != 0) {
                                                                                            }
                                                                                            ** GOTO lbl123
                                                                                        }
                                                                                        catch (oov v14) {
                                                                                            throw ers.a(v14);
                                                                                        }
                                                                                        this.gu1 = true;
                                                                                        cfr_temp_0 = this._88 - this.pof;
                                                                                        v12 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                    }
                                                                                    catch (oov v15) {
                                                                                        throw ers.a(v15);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var7_8 != 0) break block96;
                                                                                        if (v12 > 0) break block97;
                                                                                    }
                                                                                    catch (oov v16) {
                                                                                        throw ers.a(v16);
                                                                                    }
                                                                                    this._88 = this.pof;
                                                                                }
                                                                                catch (oov v17) {
                                                                                    throw ers.a(v17);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v18 = this;
                                                                                if (var7_8 != 0) break block98;
                                                                                cfr_temp_1 = v18._88 - 0.0f;
                                                                                v12 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                            }
                                                                            catch (oov v19) {
                                                                                throw ers.a(v19);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v12 >= 0) {
                                                                                this._88 = 0.0f;
                                                                            }
                                                                        }
                                                                        catch (oov v20) {
                                                                            throw ers.a(v20);
                                                                        }
                                                                        this._oo = ybv.lvf(this._oo, this._88, (float)((double)Math.max(10.0f, Math.abs(this._oo - this._88) * 40.0f) * 0.3));
                                                                        v18 = this;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v18.pof = 100.0f;
                                                                            if (var7_8 == 0) break block99;
lbl123:
                                                                            // 2 sources

                                                                            this.gu1 = false;
                                                                            if (var7_8 == 0) break block99;
                                                                        }
                                                                        catch (oov v21) {
                                                                            throw ers.a(v21);
                                                                        }
lbl128:
                                                                        // 2 sources

                                                                        this.gu1 = false;
                                                                        this._oo = 0.0f;
                                                                        v10 = this;
                                                                    }
                                                                    catch (oov v22) {
                                                                        throw ers.a(v22);
                                                                    }
                                                                }
                                                                v10._88 = 0.0f;
                                                            }
                                                            try {
                                                                block101: {
                                                                    try {
                                                                        try {
                                                                            hhf.cuu(var8_6 - 95.0f, var9_7 - 25.0f - this.i0e, var8_6 - 5.0f, var9_7 - 23.0f, -12417291);
                                                                            GL11.glPushMatrix();
                                                                            GL11.glEnable((int)3089);
                                                                            v23 = this.i0e;
                                                                            v24 = 0.0f;
                                                                            if (var7_8 != 0) break block100;
                                                                            if (!(v23 > v24)) break block101;
                                                                        }
                                                                        catch (oov v25) {
                                                                            throw ers.a(v25);
                                                                        }
                                                                        hhf.xbo(var8_6 - 195.0f, var9_7 - 123.0f, 190.0f, 118.0f);
                                                                        if (var7_8 == 0) break block102;
                                                                    }
                                                                    catch (oov v26) {
                                                                        throw ers.a(v26);
                                                                    }
                                                                }
                                                                v23 = var8_6 - 95.0f;
                                                                v24 = var9_7 - 23.0f;
                                                            }
                                                            catch (oov v27) {
                                                                throw ers.a(v27);
                                                            }
                                                        }
                                                        hhf.xbo(v23, v24, 90.0f, 18.0f);
                                                    }
                                                    try {
                                                        hhf.cuu(var8_6 - 95.0f, var9_7 - 23.0f - this.i0e, var8_6 - 5.0f, var9_7 - 5.0f, this.jky);
                                                        cfr_temp_2 = this.i0e - 0.0f;
                                                        v28 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                        if (var7_8 != 0) break block103;
                                                        if (v28 <= 0) break block104;
                                                    }
                                                    catch (oov v29) {
                                                        throw ers.a(v29);
                                                    }
                                                    var11_10 = var9_7 - this.i0e + this._oo + 20.0f;
                                                    var12_12 = 0.0f;
                                                    try {
                                                        v30 = this.dye.size();
                                                        if (var7_8 != 0) break block105;
                                                        if (v30 <= 0) break block106;
                                                    }
                                                    catch (oov v31) {
                                                        throw ers.a(v31);
                                                    }
                                                    for (cqt var14_14 : this.dye) {
                                                        block107: {
                                                            block108: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v32 = var11_10;
                                                                                    v33 = var9_7 - 115.0f;
                                                                                    if (var7_8 != 0) break block107;
                                                                                    cfr_temp_3 = v32 - v33;
                                                                                    v30 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                                                    if (var7_8 != 0) break block105;
                                                                                }
                                                                                catch (oov v34) {
                                                                                    throw ers.a(v34);
                                                                                }
                                                                                if (v30 <= 0) break block108;
                                                                            }
                                                                            catch (oov v35) {
                                                                                throw ers.a(v35);
                                                                            }
                                                                            v32 = var11_10;
                                                                            v33 = var9_7 + 20.0f;
                                                                            if (var7_8 != 0) break block107;
                                                                        }
                                                                        catch (oov v36) {
                                                                            throw ers.a(v36);
                                                                        }
                                                                        if (!(v32 < v33)) break block108;
                                                                    }
                                                                    catch (oov v37) {
                                                                        throw ers.a(v37);
                                                                    }
                                                                    var14_14.ej_(var8_6 - 95.0f, var11_10);
                                                                }
                                                                catch (oov v38) {
                                                                    throw ers.a(v38);
                                                                }
                                                            }
                                                            var12_12 += 20.0f;
                                                            v32 = var11_10;
                                                            v33 = 20.0f;
                                                        }
                                                        var11_10 = v32 + v33;
                                                        if (var7_8 == 0) continue;
                                                    }
                                                }
                                                try {
                                                    v39 = this;
                                                    if (var7_8 != 0) break block109;
                                                    v30 = v39.fv1.size();
                                                }
                                                catch (oov v40) {
                                                    throw ers.a(v40);
                                                }
                                            }
                                            if (v30 > 0) {
                                                for (cqt var14_14 : this.fv1) {
                                                    block110: {
                                                        block111: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v41 = var11_10;
                                                                                v42 = var9_7 - 115.0f;
                                                                                if (var7_8 != 0) break block110;
                                                                                cfr_temp_4 = v41 - v42;
                                                                                v28 = cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                                                                if (var7_8 != 0) break block103;
                                                                            }
                                                                            catch (oov v43) {
                                                                                throw ers.a(v43);
                                                                            }
                                                                            if (v28 <= 0) break block111;
                                                                        }
                                                                        catch (oov v44) {
                                                                            throw ers.a(v44);
                                                                        }
                                                                        v41 = var11_10;
                                                                        v42 = var9_7 + 20.0f;
                                                                        if (var7_8 != 0) break block110;
                                                                    }
                                                                    catch (oov v45) {
                                                                        throw ers.a(v45);
                                                                    }
                                                                    if (!(v41 < v42)) break block111;
                                                                }
                                                                catch (oov v46) {
                                                                    throw ers.a(v46);
                                                                }
                                                                var14_14.ej_(var8_6 - 95.0f, var11_10);
                                                            }
                                                            catch (oov v47) {
                                                                throw ers.a(v47);
                                                            }
                                                        }
                                                        var12_12 += 20.0f;
                                                        v41 = var11_10;
                                                        v42 = 20.0f;
                                                    }
                                                    var11_10 = v41 + v42;
                                                    if (var7_8 == 0) continue;
                                                }
                                            }
                                            v39 = this;
                                        }
                                        v39.pof -= var12_12;
                                    }
                                    hhf.cuu(var8_6 - 95.0f, var9_7 - 23.0f - this.i0e, var8_6 - 5.0f, var9_7 - 5.0f - this.i0e, this.jky);
                                    this.vp5(var8_6 - 95.0f, var9_7 - 5.0f - this.i0e, var8_6 - 5.0f, var9_7 - this.i0e, hhf.kjo(z7e.ret.k0y, 0.25f), hhf.kjo(z7e.ret.k0y, 0.0f));
                                    jsr.rfr.fzf(this.gn0, var8_6 - 80.0f, var9_7 - 20.0f - this.i0e, this.mom);
                                    jsr.tyz.fzf("v", var8_6 - 90.0f, var9_7 - 18.0f - this.i0e, this.mom);
                                    this.ps0(var8_6 - 40.0f, var9_7 - 23.0f - this.i0e, var8_6 - 22.0f, var9_7 - 5.0f - this.i0e, hhf.kjo(this.jky, 0.0f), this.jky);
                                    hhf.cuu(var8_6 - 22.0f, var9_7 - 23.0f - this.i0e, var8_6 - 5.0f, var9_7 - 5.0f - this.i0e, this.jky);
                                    jsr.mxa.fzf("u", var8_6 - 18.0f, var9_7 - 18.0f - this.i0e, this.mom);
                                    GL11.glDisable((int)3089);
                                    GL11.glPopMatrix();
                                    v28 = (float)this.f9q;
                                }
                                try {
                                    try {
                                        if (var7_8 != 0) break block112;
                                        if (v28 == false) break block113;
                                    }
                                    catch (oov v48) {
                                        throw ers.a(v48);
                                    }
                                    v28 = (float)hhf.md3(var2_2, var3_3, var8_6 - 95.0f, var9_7 - 5.0f - this.i0e, var8_6 - 5.0f, var9_7 - 5.0f);
                                }
                                catch (oov v49) {
                                    throw ers.a(v49);
                                }
                            }
                            try {
                                try {
                                    if (var7_8 != 0) break block114;
                                    if (v28 == false) break block113;
                                }
                                catch (oov v50) {
                                    throw ers.a(v50);
                                }
                                v28 = Mouse.getDWheel() / 2;
                            }
                            catch (oov v51) {
                                throw ers.a(v51);
                            }
                        }
                        var11_11 = v28;
                        try {
                            try {
                                this._88 += (float)var11_11;
                                cfr_temp_5 = this._88 - this.pof;
                                v52 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1);
                                if (var7_8 != 0) break block115;
                                if (v52 > 0) break block116;
                            }
                            catch (oov v53) {
                                throw ers.a(v53);
                            }
                            this._88 = this.pof;
                        }
                        catch (oov v54) {
                            throw ers.a(v54);
                        }
                    }
                    try {
                        v55 = this;
                        if (var7_8 != 0) break block117;
                        cfr_temp_6 = v55._88 - 0.0f;
                        v52 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                    }
                    catch (oov v56) {
                        throw ers.a(v56);
                    }
                }
                if (v52 < 0) break block113;
                v55 = this;
            }
            v55._88 = 0.0f;
        }
    }

    public void cpq(int n, int n2, int n3) {
        block33: {
            CopyOnWriteArrayList copyOnWriteArrayList;
            int n4;
            block37: {
                int n5;
                block35: {
                    block36: {
                        block34: {
                            block32: {
                                float f;
                                float f2;
                                block27: {
                                    float f3;
                                    block28: {
                                        boolean bl;
                                        block30: {
                                            block31: {
                                                block29: {
                                                    eka eka2 = new eka(this.kkd);
                                                    f2 = eka2.x05();
                                                    n4 = t9d.b();
                                                    f = eka2.lrx();
                                                    try {
                                                        try {
                                                            try {
                                                                n5 = hhf.md3(n, n2, f2 - 95.0f, f - 23.0f - this.i0e, f2 - 5.0f, f - 5.0f - this.i0e);
                                                                if (n4 == 0) break block27;
                                                                if (n5 == 0) break block28;
                                                            }
                                                            catch (oov oov2) {
                                                                throw ers.a(oov2);
                                                            }
                                                            if (!hhf.md3(n, n2, f2 - 20.0f, f - 20.0f - this.i0e, f2 - 8.0f, f - 8.0f - this.i0e)) break block29;
                                                        }
                                                        catch (oov oov3) {
                                                            throw ers.a(oov3);
                                                        }
                                                        this.kkd.z2i(new yod(this.usm));
                                                        return;
                                                    }
                                                    catch (oov oov4) {
                                                        throw ers.a(oov4);
                                                    }
                                                }
                                                try {
                                                    ers ers2 = this;
                                                    bl = this.f9q;
                                                    if (n4 == 0) break block30;
                                                    if (bl) break block31;
                                                }
                                                catch (oov oov5) {
                                                    throw ers.a(oov5);
                                                }
                                                bl = true;
                                                break block30;
                                            }
                                            bl = false;
                                        }
                                        ers2.f9q = bl;
                                    }
                                    n5 = (f3 = this.i0e - 0.0f) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                }
                                try {
                                    try {
                                        if (n4 == 0) break block32;
                                        if (n5 <= 0) break block33;
                                    }
                                    catch (oov oov6) {
                                        throw ers.a(oov6);
                                    }
                                    n5 = hhf.md3(n, n2, f2 - 95.0f, f - 5.0f - this.i0e, f2 - 5.0f, f - 5.0f) ? 1 : 0;
                                }
                                catch (oov oov7) {
                                    throw ers.a(oov7);
                                }
                            }
                            try {
                                try {
                                    if (n4 == 0) break block34;
                                    if (n5 == 0) break block33;
                                }
                                catch (oov oov8) {
                                    throw ers.a(oov8);
                                }
                                n5 = this.dye.size();
                            }
                            catch (oov oov9) {
                                throw ers.a(oov9);
                            }
                        }
                        try {
                            if (n4 == 0) break block35;
                            if (n5 <= 0) break block36;
                        }
                        catch (oov oov10) {
                            throw ers.a(oov10);
                        }
                        for (cqt cqt2 : this.dye) {
                            try {
                                cqt2.nvy(n, n2, n3);
                                if (n4 != 0) {
                                    if (n4 != 0) continue;
                                    break;
                                }
                                break block33;
                            }
                            catch (oov oov11) {
                                throw ers.a(oov11);
                            }
                        }
                    }
                    try {
                        copyOnWriteArrayList = this.fv1;
                        if (n4 == 0) break block37;
                        n5 = copyOnWriteArrayList.size();
                    }
                    catch (oov oov12) {
                        throw ers.a(oov12);
                    }
                }
                try {
                    if (n5 <= 0) break block33;
                    copyOnWriteArrayList = this.fv1;
                }
                catch (oov oov13) {
                    throw ers.a(oov13);
                }
            }
            for (cqt cqt2 : copyOnWriteArrayList) {
                cqt2.nvy(n, n2, n3);
                if (n4 != 0) continue;
            }
        }
    }

    public void _ql() {
        cqt cqt2;
        Iterator iterator;
        int n;
        block5: {
            n = t9d.b();
            iterator = this.dye.iterator();
            while (iterator.hasNext()) {
                cqt2 = (cqt)iterator.next();
                try {
                    cqt2.ylh = false;
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block5;
                }
                catch (oov oov2) {
                    throw ers.a(oov2);
                }
            }
            iterator = this.fv1.iterator();
        }
        while (iterator.hasNext()) {
            cqt2 = (cqt)iterator.next();
            cqt2.ylh = false;
            if (n != 0) continue;
        }
    }

    /*
     * Loose catch block
     */
    public void rup() {
        block14: {
            List list;
            int n;
            long l;
            block12: {
                block13: {
                    l = a ^ 0x1BB66313FB5BL;
                    n = t9d.b();
                    list = this.dye;
                    if (n == 0) break block12;
                    try {
                        block15: {
                            if (list.isEmpty()) break block13;
                            break block15;
                            catch (Exception exception) {
                                throw ers.a(exception);
                            }
                        }
                        this.dye.clear();
                    }
                    catch (Exception exception) {
                        throw ers.a(exception);
                    }
                }
                list = b4o.zq1();
            }
            for (hrs hrs2 : list) {
                try {
                    this.dye.add(new cqt(this, hrs2.thb().replace("#", ""), hrs2.thb().startsWith("#")));
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block14;
                }
                catch (Exception exception) {
                    throw ers.a(exception);
                }
            }
            try {
                this.gn0 = FileUtils.readFileToString((File)new File(String.valueOf(this.kkd.glh.toPath().resolve((String)((Object)ers.a("i", (int)9171, (long)(0x5D5240E636D505F7L ^ l)))).resolve((String)((Object)ers.a("i", (int)18644, (long)(0x6CF5AE34F7C76EF4L ^ l)))))));
            }
            catch (Exception exception) {
                try {
                    FileUtils.write((File)new File(String.valueOf(this.kkd.glh.toPath().resolve((String)((Object)ers.a("i", (int)9171, (long)(0x5D5240E636D505F7L ^ l)))).resolve((String)((Object)ers.a("i", (int)18644, (long)(0x6CF5AE34F7C76EF4L ^ l)))))), (CharSequence)((Object)ers.a("i", (int)29463, (long)(0xC95520A36E5531L ^ l))), (String)((Object)ers.a("i", (int)19861, (long)(0x44D3729E946FEBBEL ^ l))));
                }
                catch (Exception exception2) {
                    // empty catch block
                }
            }
        }
    }

    public void car(String string) {
        long l = a ^ 0x3C5E59142A97L;
        this.gn0 = string;
        try {
            FileUtils.write((File)new File(String.valueOf(this.kkd.glh.toPath().resolve((String)((Object)ers.a("i", (int)29718, (long)(0xA33EE7B548103F8L ^ l)))).resolve((String)((Object)ers.a("i", (int)15416, (long)(0x4B38D97535044BD5L ^ l)))))), (CharSequence)string, (String)((Object)ers.a("i", (int)27045, (long)(0x3F3C6FB1B2979E4CL ^ l))));
        }
        catch (Exception exception) {
            // empty catch block
        }
        b4o.c1p(string);
        this.rup();
    }

    public void thf(String string) {
        b4o.xim(string);
        this.rup();
    }

    public void ps0(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        float f9 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n2 & 0xFF) / 255.0f;
        hzu.m_1();
        hzu.spd();
        hzu.vtj();
        hzu.u39(770, 771, 1, 0);
        hzu.nn9(7425);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl.gec);
        q3g2.g5o(f3, f2, 0.0).gs4(f10, f11, f12, f9).pzw();
        q3g2.g5o(f, f2, 0.0).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f, f4, 0.0).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f3, f4, 0.0).gs4(f10, f11, f12, f9).pzw();
        jom.yut().q7g();
        hzu.nn9(7424);
        hzu.ux6();
        hzu.if9();
        hzu.rqj();
    }

    public void vp5(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        float f9 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n2 & 0xFF) / 255.0f;
        hzu.m_1();
        hzu.spd();
        hzu.vtj();
        hzu.u39(770, 771, 1, 0);
        hzu.nn9(7425);
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(7, gnl.gec);
        q3g2.g5o(f3, f2, 0.0).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f, f2, 0.0).gs4(f6, f7, f8, f5).pzw();
        q3g2.g5o(f, f4, 0.0).gs4(f10, f11, f12, f9).pzw();
        q3g2.g5o(f3, f4, 0.0).gs4(f10, f11, f12, f9).pzw();
        jom2.q7g();
        hzu.nn9(7424);
        hzu.ux6();
        hzu.if9();
        hzu.rqj();
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

                ers.a = c.a(-3376280237838403334L, 4578019059929299542L, MethodHandles.lookup().lookupClass()).a(77947740608750L);
                ers.d = new HashMap<K, V>(13);
                var0 = ers.a ^ 28231314352771L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "h\u009f\u00a4\u00aa\u00ff\\hux\u00a9s\u00e8\u00ca\u0086\u0004\u0010\u00104{aL[/\u00ddi\u00b2\u00deC\u0004\u00c0\u00f9H`\u0018m\u00d3]u\u0012\u00a6\u00ec\u00c5\u00b2U\u00d4}\u00edr\u0017,tR\bn\u00af\r\r\u0003\u0018\u0096\u00a4\u00e6;\u00c8\u00a8#\u001fN\u0001\u0096\u00bd \u00bf\u00e6\u0093(\u00f9\u00a7>\u009e\u00c7\u00b0\u0081\u0010\u001ccN\u0089b\u00c23\u000e\u00f0V_\u0081\u0005@\u00a7(\u0010\u00c6\u00c5\u00ce/\u0094V\u000b\u00e2\u0007\u00b8\u00e3\u0085=\u00830\u00b6\u0010#T\r\u00f6\fk\u00d2\u008c\u0093\u00fd\u00f9C;H\u00a6\u00c5\u0010x\u00cdJqv\u00dbX\u00cd\u000f\u00a4\u008fs!-\u0098\u00ff";
                var8_6 = "h\u009f\u00a4\u00aa\u00ff\\hux\u00a9s\u00e8\u00ca\u0086\u0004\u0010\u00104{aL[/\u00ddi\u00b2\u00deC\u0004\u00c0\u00f9H`\u0018m\u00d3]u\u0012\u00a6\u00ec\u00c5\u00b2U\u00d4}\u00edr\u0017,tR\bn\u00af\r\r\u0003\u0018\u0096\u00a4\u00e6;\u00c8\u00a8#\u001fN\u0001\u0096\u00bd \u00bf\u00e6\u0093(\u00f9\u00a7>\u009e\u00c7\u00b0\u0081\u0010\u001ccN\u0089b\u00c23\u000e\u00f0V_\u0081\u0005@\u00a7(\u0010\u00c6\u00c5\u00ce/\u0094V\u000b\u00e2\u0007\u00b8\u00e3\u0085=\u00830\u00b6\u0010#T\r\u00f6\fk\u00d2\u008c\u0093\u00fd\u00f9C;H\u00a6\u00c5\u0010x\u00cdJqv\u00dbX\u00cd\u000f\u00a4\u008fs!-\u0098\u00ff".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = ers.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00da;\u00efu0\u0087IJD\u00d4z\u00f1\u00a1\u008b\\\u00c9\u0010\u0011\u009du0\u00d1\u0004> }>\u0099\u00e6\u0007s\u00cf\u0092";
                    var8_6 = "\u00da;\u00efu0\u0087IJD\u00d4z\u00f1\u00a1\u008b\\\u00c9\u0010\u0011\u009du0\u00d1\u0004> }>\u0099\u00e6\u0007s\u00cf\u0092".length();
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
                    var9_3[var7_4++] = ers.a(var10_9).intern();
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
        ers.b = var9_3;
        ers.c = new String[10];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B5D;
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
                throw new RuntimeException("ers", exception);
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
            ers.c[n2] = ers.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ers.a(n, l);
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
            throw new RuntimeException("ers" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ers.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

