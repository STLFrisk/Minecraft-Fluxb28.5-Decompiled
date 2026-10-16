/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_t$f0b
extends s24 {
    private ha9 _76;
    private int pw6;
    private int z_f;
    private a_t zuw;
    private static final long a = c.a(8494190583850477662L, 555381450258209908L, MethodHandles.lookup().lookupClass()).a(228498355153274L);
    private static final String b;

    public a_t$f0b(a_t a_t2) {
        super((laq)a_t2, ha9.class, true);
        this.zuw = a_t2;
    }

    @Override
    public boolean vle() {
        boolean bl;
        block4: {
            List list;
            block5: {
                double d = this.uyl();
                list = this.pf7.oay.vie(ha9.class, this.pf7.aaw().c2h(d, 4.0, d), this.p6x);
                int n = t9d.c();
                try {
                    try {
                        Collections.sort(list, this.q3q);
                        bl = list.isEmpty();
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw a_t$f0b.a(oov2);
                    }
                    return false;
                }
                catch (oov oov3) {
                    throw a_t$f0b.a(oov3);
                }
            }
            this._76 = (ha9)list.get(0);
            bl = true;
        }
        return bl;
    }

    @Override
    public void mnp() {
        this.pw6 = 5;
        this.z_f = 0;
    }

    @Override
    public void zly() {
        this._76 = null;
        this.zuw.tjx(false);
        _4o _4o2 = this.zuw.dgt(m6d.w7i);
        _4o2.se8(a_t.s6z());
        super.zly();
    }

    @Override
    public boolean wh3() {
        a_t$f0b a_t$f0b;
        block8: {
            block9: {
                boolean bl;
                block10: {
                    block11: {
                        int n = t9d.b();
                        try {
                            try {
                                try {
                                    try {
                                        a_t$f0b = this;
                                        if (n == 0) break block8;
                                        if (a_t$f0b._76 == null) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw a_t$f0b.a(oov2);
                                    }
                                    bl = a_t.hm1(this.zuw, this._76);
                                    if (n == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw a_t$f0b.a(oov3);
                                }
                                if (bl) break block11;
                            }
                            catch (oov oov4) {
                                throw a_t$f0b.a(oov4);
                            }
                            return false;
                        }
                        catch (oov oov5) {
                            throw a_t$f0b.a(oov5);
                        }
                    }
                    a_t.vwt(this.zuw, true);
                    this.zuw.fm3(this._76, 10.0f, 10.0f);
                    bl = true;
                }
                return bl;
            }
            a_t$f0b = this;
        }
        return super.wh3();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void iad() {
        block45: {
            block46: {
                block47: {
                    block48: {
                        block49: {
                            block50: {
                                block43: {
                                    block44: {
                                        var1_1 = a_t$f0b.a ^ 103369543258250L;
                                        var3_2 = t9d.b();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 /* !! */  = this._76;
                                                        if (var3_2 == 0) break block43;
                                                        if (v0 /* !! */  != null) {
                                                        }
                                                        ** GOTO lbl43
                                                    }
                                                    catch (oov v1) {
                                                        throw a_t$f0b.a(v1);
                                                    }
                                                    v2 = this;
                                                    v3 = v2;
                                                    v4 = v2;
                                                    if (var3_2 == 0) break block44;
                                                }
                                                catch (oov v5) {
                                                    throw a_t$f0b.a(v5);
                                                }
                                                v4.pw6 = v3.pw6 - 1;
                                                if (v4.pw6 > 0) break block45;
                                            }
                                            catch (oov v6) {
                                                throw a_t$f0b.a(v6);
                                            }
                                            v4 = this;
                                            v3 = this;
                                        }
                                        catch (oov v7) {
                                            throw a_t$f0b.a(v7);
                                        }
                                    }
                                    v4.h94 = v3._76;
                                    this._76 = null;
                                    super.mnp();
                                    this.zuw.lhu(a_t$f0b.b, 1.0f, 1.0f);
                                    this.zuw.tjx(true);
                                    var4_3 = this.zuw.dgt(m6d.w7i);
                                    try {
                                        try {
                                            var4_3.vcr(a_t.s6z());
                                            if (var3_2 != 0) break block45;
lbl43:
                                            // 2 sources

                                            v8 = this;
                                            if (var3_2 == 0) break block46;
                                        }
                                        catch (oov v9) {
                                            throw a_t$f0b.a(v9);
                                        }
                                        v0 /* !! */  = v8.h94;
                                    }
                                    catch (oov v10) {
                                        throw a_t$f0b.a(v10);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (v0 /* !! */  == null) break block47;
                                                            v11 = this.h94 instanceof ha9;
                                                            if (var3_2 == 0) break block48;
                                                        }
                                                        catch (oov v12) {
                                                            throw a_t$f0b.a(v12);
                                                        }
                                                        if (v11 != 0) {
                                                        }
                                                        ** GOTO lbl102
                                                    }
                                                    catch (oov v13) {
                                                        throw a_t$f0b.a(v13);
                                                    }
                                                    v11 = (int)a_t.hm1(this.zuw, (ha9)this.h94);
                                                    if (var3_2 == 0) break block48;
                                                }
                                                catch (oov v14) {
                                                    throw a_t$f0b.a(v14);
                                                }
                                                if (v11 != 0) {
                                                }
                                                ** GOTO lbl102
                                            }
                                            catch (oov v15) {
                                                throw a_t$f0b.a(v15);
                                            }
                                            v16 = this;
                                            if (var3_2 == 0) break block49;
                                        }
                                        catch (oov v17) {
                                            throw a_t$f0b.a(v17);
                                        }
                                        if (!(v16.h94.wxg(this.zuw) < 16.0)) break block50;
                                    }
                                    catch (oov v18) {
                                        throw a_t$f0b.a(v18);
                                    }
                                    this.zuw.plc();
                                }
                                catch (oov v19) {
                                    throw a_t$f0b.a(v19);
                                }
                            }
                            v16 = this;
                        }
                        try {
                            try {
                                v16.z_f = 0;
                                if (var3_2 != 0) break block47;
lbl102:
                                // 3 sources

                                v8 = this;
                                if (var3_2 == 0) break block46;
                            }
                            catch (oov v20) {
                                throw a_t$f0b.a(v20);
                            }
                            cfr_temp_0 = v8.h94.wxg(this.zuw) - 256.0;
                            v11 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                        }
                        catch (oov v21) {
                            throw a_t$f0b.a(v21);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (v11 <= 0) break block47;
                                        v8 = this;
                                        if (var3_2 == 0) break block46;
                                    }
                                    catch (oov v22) {
                                        throw a_t$f0b.a(v22);
                                    }
                                    if (v8.z_f++ < 30) break block47;
                                }
                                catch (oov v23) {
                                    throw a_t$f0b.a(v23);
                                }
                                v8 = this;
                                if (var3_2 == 0) break block46;
                            }
                            catch (oov v24) {
                                throw a_t$f0b.a(v24);
                            }
                            if (!v8.zuw.i2r(this.h94)) break block47;
                        }
                        catch (oov v25) {
                            throw a_t$f0b.a(v25);
                        }
                        this.z_f = 0;
                    }
                    catch (oov v26) {
                        throw a_t$f0b.a(v26);
                    }
                }
                v8 = this;
            }
            super.iad();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0xF16B8FC626L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("/\u00fav\u00a2N*s8T\t\u00acF\u00c2\u0085\u00cf\u00b2\u00c4\u0000R\u00c3\u009dy$\u00dc".getBytes("ISO-8859-1"));
                b = a_t$f0b.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}

