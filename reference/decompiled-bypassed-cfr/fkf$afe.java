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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Mouse;

public class fkf$afe {
    public boolean lwk;
    public crk jq6;
    public _aj f4b;
    public float fe1;
    public float jxt;
    public float wp4;
    public float gad;
    public lva bh1;
    public final fkf qxv;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public fkf$afe(fkf fkf2, _aj _aj2) {
        this.qxv = fkf2;
        this.lwk = true;
        this.jq6 = null;
        this.wp4 = -100.0f;
        this.gad = 0.0f;
        this.bh1 = new lva(0.0f);
        this.f4b = _aj2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void g71(float var1_1, float var2_2, float var3_3, float var4_4) {
        block243: {
            block248: {
                block249: {
                    block246: {
                        block247: {
                            block244: {
                                block245: {
                                    block242: {
                                        block241: {
                                            var5_5 = fkf$afe.a ^ 26919166951218L;
                                            var7_6 = t9d.b();
                                            var8_7 = zwr.gki.wyk((String)fkf$afe.a("o", (int)10736, (long)(3745860852619242450L ^ var5_5)));
                                            try {
                                                try {
                                                    if (var7_6 == 0) break block241;
                                                    if (Mouse.isButtonDown((int)0)) break block242;
                                                }
                                                catch (oov v0) {
                                                    throw fkf$afe.a(v0);
                                                }
                                                this.jq6 = null;
                                            }
                                            catch (oov v1) {
                                                throw fkf$afe.a(v1);
                                            }
                                        }
                                        this.lwk = true;
                                    }
                                    var9_8 = jsr.rs4;
                                    try {
                                        this.fe1 = var1_1;
                                        this.jxt = var2_2;
                                        v2 = hhf.md3(var3_3, var4_4, var1_1, var2_2, var1_1 + (this.qxv.ipy - 100.0f), var2_2 + this.qxv.bf9);
                                        if (var7_6 == 0) break block243;
                                        if (v2 != 0) {
                                        }
                                        ** GOTO lbl80
                                    }
                                    catch (oov v3) {
                                        throw fkf$afe.a(v3);
                                    }
                                    var10_9 = Mouse.getDWheel() / 2;
                                    try {
                                        try {
                                            this.gad += (float)var10_9;
                                            cfr_temp_0 = this.gad - this.wp4;
                                            v4 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                            if (var7_6 == 0) break block244;
                                            if (v4 > 0) break block245;
                                        }
                                        catch (oov v5) {
                                            throw fkf$afe.a(v5);
                                        }
                                        this.gad = this.wp4;
                                    }
                                    catch (oov v6) {
                                        throw fkf$afe.a(v6);
                                    }
                                }
                                v4 = (cfr_temp_1 = this.gad - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                            }
                            try {
                                try {
                                    if (var7_6 == 0) break block246;
                                    if (v4 < 0) break block247;
                                }
                                catch (oov v7) {
                                    throw fkf$afe.a(v7);
                                }
                                this.gad = 0.0f;
                            }
                            catch (oov v8) {
                                throw fkf$afe.a(v8);
                            }
                        }
                        this.wp4 = this.qxv.bf9 - 10.0f;
                        this.bh1.vej(this.gad);
                        v4 = (float)this.bh1.ry0(true);
                    }
                    try {
                        if (var7_6 == 0) break block248;
                        if (v4 != false) break block249;
                    }
                    catch (oov v9) {
                        throw fkf$afe.a(v9);
                    }
                    v4 = (float)true;
                    break block248;
                }
                v4 = (float)false;
            }
            var11_11 = v4;
            try {
                if (var7_6 != 0) ** GOTO lbl84
lbl80:
                // 2 sources

                v2 = Mouse.getDWheel();
            }
            catch (oov v10) {
                throw fkf$afe.a(v10);
            }
        }
        var1_1 += 30.0f;
        var2_2 += 25.0f + this.bh1.o7r();
        var10_10 = kgt.vuo.iterator();
        block220: while (true) {
            v11 = var10_10.hasNext();
            block221: while (v11) {
                block331: {
                    block338: {
                        block339: {
                            block340: {
                                block341: {
                                    block336: {
                                        block337: {
                                            block334: {
                                                block335: {
                                                    block332: {
                                                        block333: {
                                                            block329: {
                                                                block330: {
                                                                    block327: {
                                                                        block328: {
                                                                            block313: {
                                                                                block311: {
                                                                                    block310: {
                                                                                        block295: {
                                                                                            block293: {
                                                                                                block292: {
                                                                                                    block282: {
                                                                                                        block281: {
                                                                                                            block273: {
                                                                                                                block274: {
                                                                                                                    block279: {
                                                                                                                        block280: {
                                                                                                                            block277: {
                                                                                                                                block278: {
                                                                                                                                    block275: {
                                                                                                                                        block276: {
                                                                                                                                            block271: {
                                                                                                                                                block272: {
                                                                                                                                                    block269: {
                                                                                                                                                        block270: {
                                                                                                                                                            block267: {
                                                                                                                                                                block268: {
                                                                                                                                                                    block266: {
                                                                                                                                                                        block265: {
                                                                                                                                                                            block264: {
                                                                                                                                                                                block263: {
                                                                                                                                                                                    block258: {
                                                                                                                                                                                        block254: {
                                                                                                                                                                                            block261: {
                                                                                                                                                                                                block260: {
                                                                                                                                                                                                    block259: {
                                                                                                                                                                                                        block257: {
                                                                                                                                                                                                            block256: {
                                                                                                                                                                                                                block255: {
                                                                                                                                                                                                                    block253: {
                                                                                                                                                                                                                        block252: {
                                                                                                                                                                                                                            block251: {
                                                                                                                                                                                                                                block250: {
                                                                                                                                                                                                                                    var11_12 = (ar7)var10_10.next();
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                v12 = var11_12.oxx();
                                                                                                                                                                                                                                                v13 = this.f4b;
                                                                                                                                                                                                                                                if (var7_6 == 0) break block250;
                                                                                                                                                                                                                                                if (v12 == v13) break block251;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (oov v14) {
                                                                                                                                                                                                                                                throw fkf$afe.a(v14);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            v15 = this;
                                                                                                                                                                                                                                            if (var7_6 == 0) break block252;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (oov v16) {
                                                                                                                                                                                                                                            throw fkf$afe.a(v16);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        v12 = v15.f4b;
                                                                                                                                                                                                                                        v13 = _aj.il8;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (oov v17) {
                                                                                                                                                                                                                                        throw fkf$afe.a(v17);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (v12 != v13) continue block220;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v15 = this;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v18 = v15.qxv.imv(var3_3, var4_4, var1_1 - 10.0f, var2_2 - 12.5f, var1_1 + this.qxv.ipy - 150.0f, var2_2 + 12.5f);
                                                                                                                                                                                                                                if (var7_6 == 0) break block253;
                                                                                                                                                                                                                                if (!v18) break block254;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (oov v19) {
                                                                                                                                                                                                                                throw fkf$afe.a(v19);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v18 = this.qxv.imv(var3_3, var4_4, var1_1 + this.qxv.ipy - 400.0f + 216.0f, var2_2 - 5.0f, var1_1 + this.qxv.ipy - 400.0f + 232.0f, var2_2 + 5.0f);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (oov v20) {
                                                                                                                                                                                                                            throw fkf$afe.a(v20);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            if (var7_6 == 0) break block255;
                                                                                                                                                                                                                            if (v18) break block254;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (oov v21) {
                                                                                                                                                                                                                            throw fkf$afe.a(v21);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v18 = Mouse.isButtonDown((int)0);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (oov v22) {
                                                                                                                                                                                                                        throw fkf$afe.a(v22);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            if (var7_6 == 0) break block256;
                                                                                                                                                                                                                            if (!v18) break block254;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (oov v23) {
                                                                                                                                                                                                                            throw fkf$afe.a(v23);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v24 = this;
                                                                                                                                                                                                                        if (var7_6 == 0) break block257;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (oov v25) {
                                                                                                                                                                                                                        throw fkf$afe.a(v25);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v18 = v24.lwk;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (oov v26) {
                                                                                                                                                                                                                    throw fkf$afe.a(v26);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!v18) break block254;
                                                                                                                                                                                                            v24 = this;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        v27 = v24.qxv.vi0;
                                                                                                                                                                                                                        v28 = var11_12;
                                                                                                                                                                                                                        if (var7_6 == 0) break block258;
                                                                                                                                                                                                                        if (v27 == v28) break block254;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (oov v29) {
                                                                                                                                                                                                                        throw fkf$afe.a(v29);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v30 = this;
                                                                                                                                                                                                                    if (var7_6 == 0) break block259;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (oov v31) {
                                                                                                                                                                                                                    throw fkf$afe.a(v31);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (v30.f4b == _aj.il8) break block254;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (oov v32) {
                                                                                                                                                                                                                throw fkf$afe.a(v32);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.lwk = false;
                                                                                                                                                                                                            this.qxv.vi0 = var11_12;
                                                                                                                                                                                                            v30 = this;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (oov v33) {
                                                                                                                                                                                                            throw fkf$afe.a(v33);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            v34 = v30.qxv.vi0.smu();
                                                                                                                                                                                                            if (var7_6 == 0) break block260;
                                                                                                                                                                                                            if (v34 == null) break block261;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (oov v35) {
                                                                                                                                                                                                            throw fkf$afe.a(v35);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v34 = this.qxv.vi0.smu();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (oov v36) {
                                                                                                                                                                                                        throw fkf$afe.a(v36);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                v34.rxi().lna(0.0f);
                                                                                                                                                                                            }
                                                                                                                                                                                            for (dzm var13_15 : _x3.wig) {
                                                                                                                                                                                                block342: {
                                                                                                                                                                                                    block262: {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            v37 = var13_15;
                                                                                                                                                                                                            if (var7_6 == 0) break block262;
                                                                                                                                                                                                            v11 = v37 instanceof crk;
                                                                                                                                                                                                            if (var7_6 == 0) continue block221;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (oov v38) {
                                                                                                                                                                                                            throw fkf$afe.a(v38);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!v11) break block342;
                                                                                                                                                                                                        v37 = var13_15;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    ((crk)v37).rpv().lna(0.0f);
                                                                                                                                                                                                }
                                                                                                                                                                                                if (var7_6 != 0) continue;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        v27 = var11_12;
                                                                                                                                                                                        v28 = var11_12;
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        v39 = v28.l7d;
                                                                                                                                                                                        if (!var11_12.klu()) break block263;
                                                                                                                                                                                        v40 = 222.0f;
                                                                                                                                                                                        break block264;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v41) {
                                                                                                                                                                                        throw fkf$afe.a(v41);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                v40 = 218.0f;
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                v42 = 10.0f;
                                                                                                                                                                                v43 = var11_12.l7d;
                                                                                                                                                                                if (!var11_12.klu()) break block265;
                                                                                                                                                                                v44 = 222.0f;
                                                                                                                                                                                break block266;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v45) {
                                                                                                                                                                                throw fkf$afe.a(v45);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v44 = 218.0f;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        v27.l7d = ybv.lvf(v39, v40, (float)((double)Math.max(v42, Math.abs(v43 - v44) * 35.0f) * 0.3));
                                                                                                                                                                        if (var11_12 == this.qxv.vi0 || this.f4b == _aj.il8) {
                                                                                                                                                                        }
                                                                                                                                                                        ** GOTO lbl1000
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov v46) {
                                                                                                                                                                        throw fkf$afe.a(v46);
                                                                                                                                                                    }
                                                                                                                                                                    var12_14 = 0.0f;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            if (var7_6 == 0) break block267;
                                                                                                                                                                            if (var11_12 == this.qxv.sin) break block268;
                                                                                                                                                                        }
                                                                                                                                                                        catch (oov v47) {
                                                                                                                                                                            throw fkf$afe.a(v47);
                                                                                                                                                                        }
                                                                                                                                                                        this.qxv.nh5 = 0.0f;
                                                                                                                                                                        this.qxv.sin = var11_12;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov v48) {
                                                                                                                                                                        throw fkf$afe.a(v48);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                hhf.hxa(var1_1 - 10.5f, var2_2 - 13.0f, var1_1 + this.qxv.ipy - 149.5f, var2_2 + 13.0f + var11_12.abe.o7r(), -12417291);
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    v49 = var1_1 - 10.0f;
                                                                                                                                                                    v50 = var2_2 - 12.5f;
                                                                                                                                                                    v51 = var1_1 + this.qxv.ipy - 150.0f;
                                                                                                                                                                    v52 = var2_2 + 12.5f + var11_12.abe.o7r();
                                                                                                                                                                    v53 = var8_7;
                                                                                                                                                                    if (var7_6 == 0) break block269;
                                                                                                                                                                    if (v53 == 0) break block270;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v54) {
                                                                                                                                                                    throw fkf$afe.a(v54);
                                                                                                                                                                }
                                                                                                                                                                v53 = -12565429;
                                                                                                                                                                break block269;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v55) {
                                                                                                                                                                throw fkf$afe.a(v55);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v53 = -1;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            hhf.hxa(v49, v50, v51, v52, v53);
                                                                                                                                                            v56 = jsr.q6n;
                                                                                                                                                            v57 = "n";
                                                                                                                                                            if (var7_6 == 0) break block271;
                                                                                                                                                            v56.fzf((String)v57, var1_1, var2_2 - 3.0f, -12417291);
                                                                                                                                                            v56 = var9_8;
                                                                                                                                                            if (this.f4b != _aj.il8) break block272;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v58) {
                                                                                                                                                            throw fkf$afe.a(v58);
                                                                                                                                                        }
                                                                                                                                                        v57 = fkf$afe.a("o", (int)14024, (long)(7483235625284924648L ^ var5_5));
                                                                                                                                                        break block271;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v59) {
                                                                                                                                                        throw fkf$afe.a(v59);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v57 = var11_12.m2d();
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            v56.fzf((String)v57, var1_1 + 10.0f, var2_2 - 6.0f, -12417291);
                                                                                                                                                            v60 = jsr.mxa.fzf("h", var1_1 + this.qxv.ipy - 150.0f - 12.0f, var2_2 - 4.0f, -12417291);
                                                                                                                                                            if (var7_6 == 0) break block273;
                                                                                                                                                            if (this.f4b == _aj.il8) break block274;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v61) {
                                                                                                                                                            throw fkf$afe.a(v61);
                                                                                                                                                        }
                                                                                                                                                        hhf.htg(var1_1 + this.qxv.ipy - 400.0f + 218.0f, var2_2 - 3.0f, var1_1 + this.qxv.ipy - 400.0f + 230.0f, var2_2 + 3.0f, 2.5f, -1710619);
                                                                                                                                                        v62 = var1_1 + this.qxv.ipy - 400.0f + var11_12.l7d;
                                                                                                                                                        v63 = var2_2 - 4.0f;
                                                                                                                                                        v64 = 8.0f;
                                                                                                                                                        v65 = 8.0f;
                                                                                                                                                        v66 = 360.0f;
                                                                                                                                                        v67 = var11_12.klu();
                                                                                                                                                        if (var7_6 == 0) break block275;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v68) {
                                                                                                                                                        throw fkf$afe.a(v68);
                                                                                                                                                    }
                                                                                                                                                    if (v67 == 0) break block276;
                                                                                                                                                }
                                                                                                                                                catch (oov v69) {
                                                                                                                                                    throw fkf$afe.a(v69);
                                                                                                                                                }
                                                                                                                                                v67 = -12417291;
                                                                                                                                                break block275;
                                                                                                                                            }
                                                                                                                                            catch (oov v70) {
                                                                                                                                                throw fkf$afe.a(v70);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v67 = -1;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v71 = 1.0f;
                                                                                                                                            v72 = var11_12.klu();
                                                                                                                                            if (var7_6 == 0) break block277;
                                                                                                                                            if (v72 == 0) break block278;
                                                                                                                                        }
                                                                                                                                        catch (oov v73) {
                                                                                                                                            throw fkf$afe.a(v73);
                                                                                                                                        }
                                                                                                                                        v72 = -12417291;
                                                                                                                                        break block277;
                                                                                                                                    }
                                                                                                                                    catch (oov v74) {
                                                                                                                                        throw fkf$afe.a(v74);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v72 = -6316129;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        mkt.o8m(v62, v63, v64, v65, v66, v67, v71, v72);
                                                                                                                                                        v60 = (int)this.qxv.imv(var3_3, var4_4, var1_1 + this.qxv.ipy - 400.0f + 216.0f, var2_2 - 5.0f, var1_1 + this.qxv.ipy - 400.0f + 232.0f, var2_2 + 5.0f);
                                                                                                                                                        if (var7_6 == 0) break block273;
                                                                                                                                                        if (v60 == 0) break block274;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v75) {
                                                                                                                                                        throw fkf$afe.a(v75);
                                                                                                                                                    }
                                                                                                                                                    v60 = (int)Mouse.isButtonDown((int)0);
                                                                                                                                                    if (var7_6 == 0) break block273;
                                                                                                                                                }
                                                                                                                                                catch (oov v76) {
                                                                                                                                                    throw fkf$afe.a(v76);
                                                                                                                                                }
                                                                                                                                                if (v60 == 0) break block274;
                                                                                                                                            }
                                                                                                                                            catch (oov v77) {
                                                                                                                                                throw fkf$afe.a(v77);
                                                                                                                                            }
                                                                                                                                            v60 = (int)this.lwk;
                                                                                                                                            if (var7_6 == 0) break block273;
                                                                                                                                        }
                                                                                                                                        catch (oov v78) {
                                                                                                                                            throw fkf$afe.a(v78);
                                                                                                                                        }
                                                                                                                                        if (v60 == 0) break block274;
                                                                                                                                    }
                                                                                                                                    catch (oov v79) {
                                                                                                                                        throw fkf$afe.a(v79);
                                                                                                                                    }
                                                                                                                                    this.lwk = false;
                                                                                                                                    v80 = var11_12;
                                                                                                                                    v81 = var11_12.klu();
                                                                                                                                    if (var7_6 == 0) break block279;
                                                                                                                                }
                                                                                                                                catch (oov v82) {
                                                                                                                                    throw fkf$afe.a(v82);
                                                                                                                                }
                                                                                                                                if (v81) break block280;
                                                                                                                            }
                                                                                                                            catch (oov v83) {
                                                                                                                                throw fkf$afe.a(v83);
                                                                                                                            }
                                                                                                                            v81 = true;
                                                                                                                            break block279;
                                                                                                                        }
                                                                                                                        v81 = false;
                                                                                                                    }
                                                                                                                    v80.yse(v81);
                                                                                                                }
                                                                                                                v60 = 0;
                                                                                                            }
                                                                                                            var13_16 = v60;
                                                                                                            var14_17 = 0;
                                                                                                            var15_18 = 0;
                                                                                                            var16_19 = 5;
                                                                                                            try {
                                                                                                                if (this.f4b != _aj.il8) break block281;
                                                                                                                v84 = fkf$afe.a("o", (int)15802, (long)(1911448011957763993L ^ var5_5));
                                                                                                                break block282;
                                                                                                            }
                                                                                                            catch (oov v85) {
                                                                                                                throw fkf$afe.a(v85);
                                                                                                            }
                                                                                                        }
                                                                                                        v84 = var11_12.m2d();
                                                                                                    }
                                                                                                    var17_20 = _x3.faw((String)v84).iterator();
                                                                                                    while (var17_20.hasNext()) {
                                                                                                        block284: {
                                                                                                            block285: {
                                                                                                                block283: {
                                                                                                                    var18_21 = (dzm)var17_20.next();
                                                                                                                    var19_22 = 5;
                                                                                                                    var20_25 = 0;
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v86 = var18_21;
                                                                                                                            if (var7_6 == 0) break block283;
                                                                                                                            v87 = v86 instanceof c_3;
                                                                                                                            if (var7_6 != 0) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl621
                                                                                                                        }
                                                                                                                        catch (oov v88) {
                                                                                                                            throw fkf$afe.a(v88);
                                                                                                                        }
                                                                                                                        if (!v87) break block284;
                                                                                                                    }
                                                                                                                    catch (oov v89) {
                                                                                                                        throw fkf$afe.a(v89);
                                                                                                                    }
                                                                                                                    var12_14 += 10.0f;
                                                                                                                    v86 = var18_21;
                                                                                                                }
                                                                                                                var21_27 = (c_3)v86;
                                                                                                                var9_8.fzf(var18_21.o7h(), var1_1 - 1.0f, var2_2 + var12_14, -12417291);
                                                                                                                for (String var25_35 : var21_27.dyh()) {
                                                                                                                    block290: {
                                                                                                                        block291: {
                                                                                                                            block288: {
                                                                                                                                block289: {
                                                                                                                                    block286: {
                                                                                                                                        block287: {
                                                                                                                                            var26_37 = var21_27.wyk(var25_35);
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    cfr_temp_2 = (float)var19_22 + var9_8.ax2(var25_35) + 20.0f - (this.qxv.ipy - 140.0f);
                                                                                                                                                    v90 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                                                                                                    if (var7_6 == 0) break block285;
                                                                                                                                                    if (var7_6 == 0) break block286;
                                                                                                                                                }
                                                                                                                                                catch (oov v91) {
                                                                                                                                                    throw fkf$afe.a(v91);
                                                                                                                                                }
                                                                                                                                                if (v90 < 0) break block287;
                                                                                                                                            }
                                                                                                                                            catch (oov v92) {
                                                                                                                                                throw fkf$afe.a(v92);
                                                                                                                                            }
                                                                                                                                            var19_22 = 5;
                                                                                                                                            var12_14 += 15.0f;
                                                                                                                                            var20_25 = 0;
                                                                                                                                        }
                                                                                                                                        v93 = this.qxv.imv(var3_3, var4_4, var1_1 + (float)var19_22 - 3.0f, var2_2 + var12_14 + 8.0f, var1_1 + (float)var19_22 + var9_8.ax2(var25_35) + 5.0f, var2_2 + var12_14 + 23.0f);
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (var7_6 == 0) break block288;
                                                                                                                                                                    if (!v93) break block289;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v94) {
                                                                                                                                                                    throw fkf$afe.a(v94);
                                                                                                                                                                }
                                                                                                                                                                v93 = Mouse.isButtonDown((int)0);
                                                                                                                                                                if (var7_6 == 0) break block288;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v95) {
                                                                                                                                                                throw fkf$afe.a(v95);
                                                                                                                                                            }
                                                                                                                                                            if (!v93) break block289;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v96) {
                                                                                                                                                            throw fkf$afe.a(v96);
                                                                                                                                                        }
                                                                                                                                                        v93 = this.lwk;
                                                                                                                                                        if (var7_6 == 0) break block288;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v97) {
                                                                                                                                                        throw fkf$afe.a(v97);
                                                                                                                                                    }
                                                                                                                                                    if (!v93) break block289;
                                                                                                                                                }
                                                                                                                                                catch (oov v98) {
                                                                                                                                                    throw fkf$afe.a(v98);
                                                                                                                                                }
                                                                                                                                                v93 = var26_37;
                                                                                                                                                if (var7_6 == 0) break block288;
                                                                                                                                            }
                                                                                                                                            catch (oov v99) {
                                                                                                                                                throw fkf$afe.a(v99);
                                                                                                                                            }
                                                                                                                                            if (v93) break block289;
                                                                                                                                        }
                                                                                                                                        catch (oov v100) {
                                                                                                                                            throw fkf$afe.a(v100);
                                                                                                                                        }
                                                                                                                                        this.lwk = false;
                                                                                                                                        var21_27.n1j(var25_35);
                                                                                                                                        var21_27.rxi().lna(0.0f);
                                                                                                                                    }
                                                                                                                                    catch (oov v101) {
                                                                                                                                        throw fkf$afe.a(v101);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v93 = var21_27.rxi().ry0(true);
                                                                                                                            }
                                                                                                                            var27_39 = var1_1 + (float)var19_22;
                                                                                                                            var28_40 = var2_2 + var12_14;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    jsr.mxa.fzf("n", var27_39 - 6.0f, var28_40 + 12.0f, -12417291);
                                                                                                                                    v102 = var26_37;
                                                                                                                                    if (var7_6 == 0) break block290;
                                                                                                                                    if (v102 == false) break block291;
                                                                                                                                }
                                                                                                                                catch (oov v103) {
                                                                                                                                    throw fkf$afe.a(v103);
                                                                                                                                }
                                                                                                                                this.qxv.nh5 = ybv.lvf(this.qxv.nh5, 2.1f, (float)((double)Math.max(1.0f, Math.abs(this.qxv.nh5 - 2.1f) * 25.0f) * 0.3));
                                                                                                                                hhf.kvl(var27_39 - 2.2f, var28_40 + 16.1f, 0, 360, this.qxv.nh5, -12417291);
                                                                                                                            }
                                                                                                                            catch (oov v104) {
                                                                                                                                throw fkf$afe.a(v104);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var9_8.fzf(var25_35, var1_1 + (float)var19_22 + 4.0f, var2_2 + var12_14 + 10.0f, -12417291);
                                                                                                                        ++var20_25;
                                                                                                                        v102 = (int)((float)var19_22 + (var9_8.ax2(var25_35) + 20.0f));
                                                                                                                    }
                                                                                                                    var19_22 = v102;
                                                                                                                    if (var7_6 != 0) continue;
                                                                                                                }
                                                                                                                v90 = var20_25;
                                                                                                            }
                                                                                                            if (v90 >= 1) {
                                                                                                                var12_14 += 15.0f;
                                                                                                            }
                                                                                                        }
                                                                                                        if (var7_6 != 0) continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (this.f4b != _aj.il8) break block292;
                                                                                                        v105 = fkf$afe.a("o", (int)15802, (long)(1911448011957763993L ^ var5_5));
                                                                                                        break block293;
                                                                                                    }
                                                                                                    catch (oov v106) {
                                                                                                        throw fkf$afe.a(v106);
                                                                                                    }
                                                                                                }
                                                                                                v105 = var11_12.m2d();
                                                                                            }
                                                                                            var17_20 = _x3.faw((String)v105).iterator();
                                                                                            do {
                                                                                                block309: {
                                                                                                    block302: {
                                                                                                        block303: {
                                                                                                            block304: {
                                                                                                                block301: {
                                                                                                                    block299: {
                                                                                                                        block300: {
                                                                                                                            block298: {
                                                                                                                                block296: {
                                                                                                                                    block297: {
                                                                                                                                        block294: {
                                                                                                                                            v87 = var17_20.hasNext();
lbl621:
                                                                                                                                            // 2 sources

                                                                                                                                            if (!v87) break;
                                                                                                                                            var18_21 = (dzm)var17_20.next();
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v107 = var18_21;
                                                                                                                                                    if (var7_6 == 0) break block294;
                                                                                                                                                    v108 = v107 instanceof crk;
                                                                                                                                                    if (var7_6 == 0) break block295;
                                                                                                                                                }
                                                                                                                                                catch (oov v109) {
                                                                                                                                                    throw fkf$afe.a(v109);
                                                                                                                                                }
                                                                                                                                                if (v108 == 0) continue;
                                                                                                                                            }
                                                                                                                                            catch (oov v110) {
                                                                                                                                                throw fkf$afe.a(v110);
                                                                                                                                            }
                                                                                                                                            v107 = var18_21;
                                                                                                                                        }
                                                                                                                                        var19_23 = (crk)v107;
                                                                                                                                        var20_26 = var1_1 + (float)var14_17;
                                                                                                                                        var21_28 = 110.0f;
                                                                                                                                        var22_30 = (float)((var19_23.u7t() - (double)var19_23.q9v()) / (double)(var19_23.uof() - var19_23.q9v()));
                                                                                                                                        var19_23.rpv().vej(var22_30 * 10.0f);
                                                                                                                                        var19_23.rpv().ry0(true);
                                                                                                                                        var23_32 = var19_23.rpv().o7r() / 10.0f;
                                                                                                                                        var24_34 = var2_2 + var12_14 + 23.0f;
                                                                                                                                        var25_36 = var2_2 + var12_14 + 24.0f;
                                                                                                                                        var9_8.fzf(var18_21.o7h(), var1_1 + (float)var14_17, var2_2 + 9.0f + var12_14, -6447715);
                                                                                                                                        var26_38 = (float)Math.round(var19_23.u7t() * 100.0) / 100.0f + "";
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v111 = var9_8;
                                                                                                                                                v112 = new StringBuilder().append(var26_38);
                                                                                                                                                v113 = var19_23;
                                                                                                                                                if (var7_6 == 0) break block296;
                                                                                                                                                if (v113.fht() != null) break block297;
                                                                                                                                            }
                                                                                                                                            catch (oov v114) {
                                                                                                                                                throw fkf$afe.a(v114);
                                                                                                                                            }
                                                                                                                                            v115 = "";
                                                                                                                                            break block298;
                                                                                                                                        }
                                                                                                                                        catch (oov v116) {
                                                                                                                                            throw fkf$afe.a(v116);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v113 = var19_23;
                                                                                                                                }
                                                                                                                                v115 = v113.fht();
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v117 = v112.append(v115).toString();
                                                                                                                                    v118 = var1_1 + (float)var14_17 + var21_28;
                                                                                                                                    v119 = var9_8;
                                                                                                                                    v120 = new StringBuilder().append(var26_38);
                                                                                                                                    v121 = var19_23;
                                                                                                                                    if (var7_6 == 0) break block299;
                                                                                                                                    if (v121.fht() != null) break block300;
                                                                                                                                }
                                                                                                                                catch (oov v122) {
                                                                                                                                    throw fkf$afe.a(v122);
                                                                                                                                }
                                                                                                                                v123 = "";
                                                                                                                                break block301;
                                                                                                                            }
                                                                                                                            catch (oov v124) {
                                                                                                                                throw fkf$afe.a(v124);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v121 = var19_23;
                                                                                                                    }
                                                                                                                    v123 = v121.fht();
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v111.fzf(v117, v118 - v119.ax2(v120.append(v123).toString()), var2_2 + 9.0f + var12_14, -6447715);
                                                                                                                                    hhf.cuu(var20_26, var24_34, var20_26 + var21_28, var25_36, -1842205);
                                                                                                                                    hhf.cuu(var20_26, var24_34, var20_26 + var21_28 * var23_32, var25_36, -12417291);
                                                                                                                                    hhf.fdt(var20_26 + var21_28 * var23_32, (var24_34 + var25_36) / 2.0f, 2.0f, -12417291);
                                                                                                                                    v125 = this;
                                                                                                                                    if (var7_6 == 0) break block302;
                                                                                                                                    if (!v125.qxv.imv(var3_3, var4_4, var20_26, var24_34 - 4.0f, var20_26 + var21_28, var25_36 + 4.0f)) break block303;
                                                                                                                                }
                                                                                                                                catch (oov v126) {
                                                                                                                                    throw fkf$afe.a(v126);
                                                                                                                                }
                                                                                                                                v127 = Mouse.isButtonDown((int)0);
                                                                                                                                if (var7_6 == 0) break block304;
                                                                                                                            }
                                                                                                                            catch (oov v128) {
                                                                                                                                throw fkf$afe.a(v128);
                                                                                                                            }
                                                                                                                            if (!v127) break block303;
                                                                                                                        }
                                                                                                                        catch (oov v129) {
                                                                                                                            throw fkf$afe.a(v129);
                                                                                                                        }
                                                                                                                        v125 = this;
                                                                                                                        if (var7_6 == 0) break block302;
                                                                                                                    }
                                                                                                                    catch (oov v130) {
                                                                                                                        throw fkf$afe.a(v130);
                                                                                                                    }
                                                                                                                    v127 = v125.lwk;
                                                                                                                }
                                                                                                                catch (oov v131) {
                                                                                                                    throw fkf$afe.a(v131);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (v127) {
                                                                                                                    this.lwk = false;
                                                                                                                    this.jq6 = var19_23;
                                                                                                                }
                                                                                                            }
                                                                                                            catch (oov v132) {
                                                                                                                throw fkf$afe.a(v132);
                                                                                                            }
                                                                                                        }
                                                                                                        v125 = this;
                                                                                                    }
                                                                                                    if (v125.jq6 == var19_23) {
                                                                                                        block307: {
                                                                                                            block308: {
                                                                                                                block305: {
                                                                                                                    block306: {
                                                                                                                        var27_39 = var3_3 - var20_26;
                                                                                                                        try {
                                                                                                                            cfr_temp_3 = var27_39 - 110.0f;
                                                                                                                            v133 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                                                                                            if (var7_6 == 0) break block305;
                                                                                                                            if (v133 <= 0) break block306;
                                                                                                                        }
                                                                                                                        catch (oov v134) {
                                                                                                                            throw fkf$afe.a(v134);
                                                                                                                        }
                                                                                                                        var27_39 = 110.0f;
                                                                                                                    }
                                                                                                                    v133 = (cfr_temp_4 = var27_39 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (var7_6 == 0) break block307;
                                                                                                                    if (v133 >= 0) break block308;
                                                                                                                }
                                                                                                                catch (oov v135) {
                                                                                                                    throw fkf$afe.a(v135);
                                                                                                                }
                                                                                                                var27_39 = 0.0f;
                                                                                                            }
                                                                                                            v133 = Math.round((var27_39 / 110.0f * (var19_23.uof() - var19_23.q9v()) + var19_23.q9v()) / var19_23.t99());
                                                                                                        }
                                                                                                        var28_40 = (float)v133 * var19_23.t99();
                                                                                                        var19_23.ms1(var28_40);
                                                                                                    }
                                                                                                    try {
                                                                                                        ++var13_16;
                                                                                                        cfr_temp_5 = (float)(var14_17 += 125) + var21_28 - (this.qxv.ipy - 150.0f);
                                                                                                        v136 = cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                                                                                                        if (var7_6 == 0) break block309;
                                                                                                        if (v136 < 0) continue;
                                                                                                    }
                                                                                                    catch (oov v137) {
                                                                                                        throw fkf$afe.a(v137);
                                                                                                    }
                                                                                                    var12_14 += 20.0f;
                                                                                                    var13_16 = 0;
                                                                                                    v136 = (float)false;
                                                                                                }
                                                                                                var14_17 = (int)v136;
                                                                                            } while (var7_6 != 0);
                                                                                            v108 = var13_16;
                                                                                        }
                                                                                        if (v108 > 0) {
                                                                                            var12_14 += 25.0f;
                                                                                        }
                                                                                        try {
                                                                                            if (this.f4b != _aj.il8) break block310;
                                                                                            v138 = fkf$afe.a("o", (int)15802, (long)(1911448011957763993L ^ var5_5));
                                                                                            break block311;
                                                                                        }
                                                                                        catch (oov v139) {
                                                                                            throw fkf$afe.a(v139);
                                                                                        }
                                                                                    }
                                                                                    v138 = var11_12.m2d();
                                                                                }
                                                                                for (dzm var18_21 : _x3.faw((String)v138)) {
                                                                                    block314: {
                                                                                        block325: {
                                                                                            block326: {
                                                                                                block323: {
                                                                                                    block324: {
                                                                                                        block318: {
                                                                                                            block321: {
                                                                                                                block322: {
                                                                                                                    block320: {
                                                                                                                        block319: {
                                                                                                                            block317: {
                                                                                                                                block315: {
                                                                                                                                    block316: {
                                                                                                                                        block312: {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v140 = var18_21;
                                                                                                                                                    if (var7_6 == 0) break block312;
                                                                                                                                                    v141 = v140 instanceof cn7;
                                                                                                                                                    if (var7_6 == 0) break block313;
                                                                                                                                                }
                                                                                                                                                catch (oov v142) {
                                                                                                                                                    throw fkf$afe.a(v142);
                                                                                                                                                }
                                                                                                                                                if (v141 == 0) break block314;
                                                                                                                                            }
                                                                                                                                            catch (oov v143) {
                                                                                                                                                throw fkf$afe.a(v143);
                                                                                                                                            }
                                                                                                                                            v140 = var18_21;
                                                                                                                                        }
                                                                                                                                        var19_24 = (cn7)v140;
                                                                                                                                        try {
                                                                                                                                            cfr_temp_6 = (float)var16_19 + var9_8.ax2(var19_24.o7h()) + 20.0f - (this.qxv.ipy - 140.0f);
                                                                                                                                            v144 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1);
                                                                                                                                            if (var7_6 == 0) break block315;
                                                                                                                                            if (v144 < 0) break block316;
                                                                                                                                        }
                                                                                                                                        catch (oov v145) {
                                                                                                                                            throw fkf$afe.a(v145);
                                                                                                                                        }
                                                                                                                                        var16_19 = 5;
                                                                                                                                        var12_14 += 15.0f;
                                                                                                                                        var15_18 = 0;
                                                                                                                                    }
                                                                                                                                    v144 = (float)var19_24.g7m();
                                                                                                                                }
                                                                                                                                var20_25 = v144;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v146 = this.qxv.imv(var3_3, var4_4, var1_1 + (float)var16_19 - 3.0f, var2_2 + var12_14 + 8.0f, var1_1 + (float)var16_19 + var9_8.ax2(var19_24.o7h()) + 5.0f, var2_2 + var12_14 + 23.0f);
                                                                                                                                        if (var7_6 == 0) break block317;
                                                                                                                                        if (!v146) break block318;
                                                                                                                                    }
                                                                                                                                    catch (oov v147) {
                                                                                                                                        throw fkf$afe.a(v147);
                                                                                                                                    }
                                                                                                                                    v146 = Mouse.isButtonDown((int)0);
                                                                                                                                }
                                                                                                                                catch (oov v148) {
                                                                                                                                    throw fkf$afe.a(v148);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var7_6 == 0) break block319;
                                                                                                                                        if (!v146) break block318;
                                                                                                                                    }
                                                                                                                                    catch (oov v149) {
                                                                                                                                        throw fkf$afe.a(v149);
                                                                                                                                    }
                                                                                                                                    v150 = this;
                                                                                                                                    if (var7_6 == 0) break block320;
                                                                                                                                }
                                                                                                                                catch (oov v151) {
                                                                                                                                    throw fkf$afe.a(v151);
                                                                                                                                }
                                                                                                                                v146 = v150.lwk;
                                                                                                                            }
                                                                                                                            catch (oov v152) {
                                                                                                                                throw fkf$afe.a(v152);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (!v146) break block318;
                                                                                                                        v150 = this;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v150.lwk = false;
                                                                                                                        v153 = var19_24;
                                                                                                                        v154 = var19_24.g7m();
                                                                                                                        if (var7_6 == 0) break block321;
                                                                                                                        if (v154) break block322;
                                                                                                                    }
                                                                                                                    catch (oov v155) {
                                                                                                                        throw fkf$afe.a(v155);
                                                                                                                    }
                                                                                                                    v154 = true;
                                                                                                                    break block321;
                                                                                                                }
                                                                                                                v154 = false;
                                                                                                            }
                                                                                                            v153.aze(v154);
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                v156 = jsr.mxa;
                                                                                                                v157 = "j";
                                                                                                                v158 = var1_1 + (float)var16_19 - 5.0f;
                                                                                                                v159 = var2_2 + var12_14 + 11.5f;
                                                                                                                v160 = var20_25;
                                                                                                                if (var7_6 == 0) break block323;
                                                                                                                if (v160 == 0) break block324;
                                                                                                            }
                                                                                                            catch (oov v161) {
                                                                                                                throw fkf$afe.a(v161);
                                                                                                            }
                                                                                                            v160 = -12417291;
                                                                                                            break block323;
                                                                                                        }
                                                                                                        catch (oov v162) {
                                                                                                            throw fkf$afe.a(v162);
                                                                                                        }
                                                                                                    }
                                                                                                    v160 = -3289651;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        v156.fzf(v157, v158, v159, v160);
                                                                                                        v163 = var9_8;
                                                                                                        v164 = var19_24.o7h();
                                                                                                        v165 = var1_1 + (float)var16_19 + 4.0f;
                                                                                                        v166 = var2_2 + 10.0f + var12_14;
                                                                                                        v167 = var20_25;
                                                                                                        if (var7_6 == 0) break block325;
                                                                                                        if (v167 == 0) break block326;
                                                                                                    }
                                                                                                    catch (oov v168) {
                                                                                                        throw fkf$afe.a(v168);
                                                                                                    }
                                                                                                    v167 = -12417291;
                                                                                                    break block325;
                                                                                                }
                                                                                                catch (oov v169) {
                                                                                                    throw fkf$afe.a(v169);
                                                                                                }
                                                                                            }
                                                                                            v167 = -6513508;
                                                                                        }
                                                                                        v163.fzf(v164, v165, v166, v167);
                                                                                        ++var15_18;
                                                                                        var16_19 = (int)((float)var16_19 + (var9_8.ax2(var19_24.o7h()) + 20.0f));
                                                                                    }
                                                                                    if (var7_6 != 0) continue;
                                                                                }
                                                                                v141 = var15_18;
                                                                            }
                                                                            try {
                                                                                if (var7_6 == 0) break block327;
                                                                                if (v141 < true) break block328;
                                                                            }
                                                                            catch (oov v170) {
                                                                                throw fkf$afe.a(v170);
                                                                            }
                                                                            var12_14 += 15.0f;
                                                                        }
                                                                        v141 = (cfr_temp_7 = var12_14 - 0.0f) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
                                                                    }
                                                                    try {
                                                                        if (var7_6 == 0) break block329;
                                                                        if (v141 != 0) break block330;
                                                                    }
                                                                    catch (oov v171) {
                                                                        throw fkf$afe.a(v171);
                                                                    }
                                                                    var12_14 = 15.0f;
                                                                    var9_8.fzf((String)fkf$afe.a("o", (int)31622, (long)(7853932709856983463L ^ var5_5)), var1_1, var2_2 + 12.0f, -6447715);
                                                                }
                                                                var11_12.abe.vej(var12_14);
                                                                v141 = var11_12.abe.ry0(true);
                                                            }
                                                            var2_2 += var11_12.abe.o7r();
                                                            try {
                                                                this.wp4 -= var12_14 + 40.0f;
                                                                if (this.f4b == _aj.il8) {
                                                                    break block220;
                                                                }
                                                            }
                                                            catch (oov v172) {
                                                                throw fkf$afe.a(v172);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var7_6 != 0) break block331;
lbl1000:
                                                                        // 2 sources

                                                                        v173 = var1_1 - 10.0f;
                                                                        v174 = var2_2 - 12.5f;
                                                                        v175 = var1_1 + this.qxv.ipy - 150.0f;
                                                                        v176 = var2_2 + 12.5f + var11_12.abe.o7r();
                                                                        v177 = var8_7;
                                                                        if (var7_6 == 0) break block332;
                                                                    }
                                                                    catch (oov v178) {
                                                                        throw fkf$afe.a(v178);
                                                                    }
                                                                    if (v177 == 0) break block333;
                                                                }
                                                                catch (oov v179) {
                                                                    throw fkf$afe.a(v179);
                                                                }
                                                                v177 = -12565429;
                                                                break block332;
                                                            }
                                                            catch (oov v180) {
                                                                throw fkf$afe.a(v180);
                                                            }
                                                        }
                                                        v177 = -1;
                                                    }
                                                    try {
                                                        try {
                                                            hhf.hxa(v173, v174, v175, v176, v177);
                                                            jsr.q6n.fzf("k", var1_1, var2_2 - 3.0f, -2960686);
                                                            jsr.rs4.fzf(var11_12.m2d(), var1_1 + 10.0f, var2_2 - 6.0f, -6447715);
                                                            jsr.mxa.fzf("i", var1_1 + this.qxv.ipy - 150.0f - 12.0f, var2_2 - 4.0f, -6447715);
                                                            hhf.htg(var1_1 + this.qxv.ipy - 400.0f + 218.0f, var2_2 - 3.0f, var1_1 + this.qxv.ipy - 400.0f + 230.0f, var2_2 + 3.0f, 2.5f, -1710619);
                                                            v181 = var1_1 + this.qxv.ipy - 400.0f + var11_12.l7d;
                                                            v182 = var2_2 - 4.0f;
                                                            v183 = 8.0f;
                                                            v184 = 8.0f;
                                                            v185 = 360.0f;
                                                            v186 = var11_12.klu();
                                                            if (var7_6 == 0) break block334;
                                                            if (v186 == 0) break block335;
                                                        }
                                                        catch (oov v187) {
                                                            throw fkf$afe.a(v187);
                                                        }
                                                        v186 = -12417291;
                                                        break block334;
                                                    }
                                                    catch (oov v188) {
                                                        throw fkf$afe.a(v188);
                                                    }
                                                }
                                                v186 = -1;
                                            }
                                            try {
                                                try {
                                                    v189 = 1.0f;
                                                    v190 = var11_12.klu();
                                                    if (var7_6 == 0) break block336;
                                                    if (v190 == 0) break block337;
                                                }
                                                catch (oov v191) {
                                                    throw fkf$afe.a(v191);
                                                }
                                                v190 = -12417291;
                                                break block336;
                                            }
                                            catch (oov v192) {
                                                throw fkf$afe.a(v192);
                                            }
                                        }
                                        v190 = -6316129;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                mkt.o8m(v181, v182, v183, v184, v185, v186, v189, v190);
                                                                v193 = this.qxv.imv(var3_3, var4_4, var1_1 + this.qxv.ipy - 400.0f + 216.0f, var2_2 - 5.0f, var1_1 + this.qxv.ipy - 400.0f + 232.0f, var2_2 + 5.0f);
                                                                if (var7_6 == 0) break block338;
                                                                if (!v193) break block339;
                                                            }
                                                            catch (oov v194) {
                                                                throw fkf$afe.a(v194);
                                                            }
                                                            v193 = Mouse.isButtonDown((int)0);
                                                            if (var7_6 == 0) break block338;
                                                        }
                                                        catch (oov v195) {
                                                            throw fkf$afe.a(v195);
                                                        }
                                                        if (!v193) break block339;
                                                    }
                                                    catch (oov v196) {
                                                        throw fkf$afe.a(v196);
                                                    }
                                                    v193 = this.lwk;
                                                    if (var7_6 == 0) break block338;
                                                }
                                                catch (oov v197) {
                                                    throw fkf$afe.a(v197);
                                                }
                                                if (!v193) break block339;
                                            }
                                            catch (oov v198) {
                                                throw fkf$afe.a(v198);
                                            }
                                            this.lwk = false;
                                            v199 = var11_12;
                                            v200 = var11_12.klu();
                                            if (var7_6 == 0) break block340;
                                        }
                                        catch (oov v201) {
                                            throw fkf$afe.a(v201);
                                        }
                                        if (v200) break block341;
                                    }
                                    catch (oov v202) {
                                        throw fkf$afe.a(v202);
                                    }
                                    v200 = true;
                                    break block340;
                                }
                                v200 = false;
                            }
                            v199.yse(v200);
                        }
                        v193 = var11_12.abe.ry0(false);
                    }
                    var2_2 += var11_12.abe.o7r();
                    this.wp4 -= 40.0f;
                }
                var2_2 += 40.0f;
                if (var7_6 != 0) continue block220;
            }
            break;
        }
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

                fkf$afe.a = c.a(2990855124322036977L, 4500743027797919699L, MethodHandles.lookup().lookupClass()).a(241164265759014L);
                fkf$afe.d = new HashMap<K, V>(13);
                var0 = fkf$afe.a ^ 19171114426417L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u0083z\u00cf\u001a\b\u00bd\u000b\u00b8xl\u0006\u00eeO\u00a8)\"\u0010\t\u00e5\u00bbfB\u00f7|)\u0002\u009a4\u00b6\u00de\u00ac\u0019%";
                var8_6 = "\u0083z\u00cf\u001a\b\u00bd\u000b\u00b8xl\u0006\u00eeO\u00a8)\"\u0010\t\u00e5\u00bbfB\u00f7|)\u0002\u009a4\u00b6\u00de\u00ac\u0019%".length();
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
                    var9_3[var7_4++] = fkf$afe.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "l\u00e6Mu\u00cc\u00d7O\u00f2\u00a5`\u0091dgq\u00f9\u008b \u00d6\u0090{I\u0010X\u00e7E\u00fd\u00d9\u00e2\u0094X\u009d\u007f\u00a3\u00ec\u00bc0\u00e9\u00ec\u00d7i\u0096\u001e\u00e6*\u0000\u00e2T%\u00f3";
                    var8_6 = "l\u00e6Mu\u00cc\u00d7O\u00f2\u00a5`\u0091dgq\u00f9\u008b \u00d6\u0090{I\u0010X\u00e7E\u00fd\u00d9\u00e2\u0094X\u009d\u007f\u00a3\u00ec\u00bc0\u00e9\u00ec\u00d7i\u0096\u001e\u00e6*\u0000\u00e2T%\u00f3".length();
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
                    var9_3[var7_4++] = fkf$afe.a(var10_9).intern();
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
        fkf$afe.b = var9_3;
        fkf$afe.c = new String[4];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BE1;
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
                throw new RuntimeException("fkf$afe", exception);
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
            fkf$afe.c[n2] = fkf$afe.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fkf$afe.a(n, l);
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
            throw new RuntimeException("fkf$afe" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fkf$afe.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

