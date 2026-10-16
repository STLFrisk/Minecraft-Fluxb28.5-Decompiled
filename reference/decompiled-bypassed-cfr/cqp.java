/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cqp {
    private /* synthetic */ mux[] s2r;
    private /* synthetic */ int b92;
    private static final long a = c.a(-6346184569594041919L, -3336901885156153465L, MethodHandles.lookup().lookupClass()).a(200112230599821L);
    private static final String b;

    public cqp() {
        this.s2r = new mux[1024];
    }

    public mux h4k(mux mux2) {
        cqp cqp2;
        block10: {
            int n;
            block8: {
                int n2;
                block9: {
                    long l = a ^ 0x7252D559F616L;
                    n2 = t9d.b();
                    try {
                        try {
                            n = mux2.cy6;
                            if (n2 == 0) break block8;
                            if (n >= 0) {
                            }
                            break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw cqp.a(illegalStateException);
                        }
                        throw new IllegalStateException(b);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw cqp.a(illegalStateException);
                    }
                }
                try {
                    cqp2 = this;
                    if (n2 == 0) break block10;
                    n = cqp2.b92;
                }
                catch (IllegalStateException illegalStateException) {
                    throw cqp.a(illegalStateException);
                }
            }
            if (n == this.s2r.length) {
                mux[] muxArray = new mux[this.b92 << 1];
                System.arraycopy(this.s2r, 0, muxArray, 0, this.b92);
                this.s2r = muxArray;
            }
            this.s2r[this.b92] = mux2;
            mux2.cy6 = this.b92;
            cqp2 = this;
        }
        cqp2.s1z(this.b92++);
        return mux2;
    }

    public void md6() {
        this.b92 = 0;
    }

    public mux qgk() {
        mux mux2;
        block4: {
            block5: {
                mux2 = this.s2r[0];
                this.s2r[0] = this.s2r[--this.b92];
                int n = t9d.b();
                try {
                    try {
                        this.s2r[this.b92] = null;
                        if (n == 0) break block4;
                        if (this.b92 <= 0) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw cqp.a(illegalStateException);
                    }
                    this.me6(0);
                }
                catch (IllegalStateException illegalStateException) {
                    throw cqp.a(illegalStateException);
                }
            }
            mux2.cy6 = -1;
        }
        return mux2;
    }

    /*
     * Unable to fully structure code
     */
    public void ukf(mux var1_1, float var2_2) {
        block9: {
            block8: {
                var3_3 = t9d.c();
                var4_4 = var1_1.ujv;
                try {
                    try {
                        var1_1.ujv = var2_2;
                        if (var3_3 != 0) break block8;
                        if (var2_2 < var4_4) {
                        }
                        ** GOTO lbl19
                    }
                    catch (IllegalStateException v0) {
                        throw cqp.a(v0);
                    }
                    this.s1z(var1_1.cy6);
                }
                catch (IllegalStateException v1) {
                    throw cqp.a(v1);
                }
            }
            try {
                if (var3_3 == 0) break block9;
lbl19:
                // 2 sources

                this.me6(var1_1.cy6);
            }
            catch (IllegalStateException v2) {
                throw cqp.a(v2);
            }
        }
    }

    private void s1z(int n) {
        block6: {
            mux mux2 = this.s2r[n];
            float f = mux2.ujv;
            int n2 = t9d.c();
            while (n > 0) {
                float f2;
                block7: {
                    int n3 = n - 1 >> 1;
                    mux mux3 = this.s2r[n3];
                    try {
                        try {
                            if (n2 != 0) break block6;
                            float f3 = f - mux3.ujv;
                            f2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                            if (n2 != 0) break block7;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw cqp.a(illegalStateException);
                        }
                        if (f2 >= 0) {
                            break;
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw cqp.a(illegalStateException);
                    }
                    this.s2r[n] = mux3;
                    mux3.cy6 = n;
                    f2 = n3;
                }
                n = (int)f2;
                if (n2 == 0) continue;
            }
            this.s2r[n] = mux2;
            mux2.cy6 = n;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void me6(int var1_1) {
        var3_2 = this.s2r[var1_1];
        var4_3 = var3_2.ujv;
        var2_4 = t9d.b();
        do {
            block22: {
                block20: {
                    block21: {
                        block24: {
                            block23: {
                                var5_5 = 1 + (var1_1 << 1);
                                var6_6 = var5_5 + 1;
                                if (var5_5 >= this.b92) break;
                                var7_7 = this.s2r[var5_5];
                                var8_8 = var7_7.ujv;
                                if (var6_6 < this.b92) break block23;
                                var9_9 = null;
                                var10_10 = Infinityf;
                                if (var2_4 != 0) break block24;
                            }
                            var9_9 = this.s2r[var6_6];
                            var10_10 = var9_9.ujv;
                        }
                        try {
                            try {
                                try {
                                    v0 = var8_8 == var10_10 ? 0 : (var8_8 < var10_10 ? -1 : 1);
                                    if (var2_4 == 0) break block20;
                                    if (v0 < 0) {
                                    }
                                    ** GOTO lbl46
                                }
                                catch (IllegalStateException v1) {
                                    throw cqp.a(v1);
                                }
                                v2 = var8_8 == var4_3 ? 0 : (var8_8 > var4_3 ? 1 : -1);
                                if (var2_4 == 0) break block21;
                            }
                            catch (IllegalStateException v3) {
                                throw cqp.a(v3);
                            }
                            if (v2 >= 0) {
                                break;
                            }
                        }
                        catch (IllegalStateException v4) {
                            throw cqp.a(v4);
                        }
                        this.s2r[var1_1] = var7_7;
                        var7_7.cy6 = var1_1;
                        v2 = var5_5;
                    }
                    var1_1 = (int)v2;
                    try {
                        if (var2_4 != 0) continue;
lbl46:
                        // 2 sources

                        v0 = var10_10 == var4_3 ? 0 : (var10_10 > var4_3 ? 1 : -1);
                    }
                    catch (IllegalStateException v5) {
                        throw cqp.a(v5);
                    }
                }
                try {
                    if (var2_4 == 0) break block22;
                    if (v0 >= 0) {
                        break;
                    }
                }
                catch (IllegalStateException v6) {
                    throw cqp.a(v6);
                }
                this.s2r[var1_1] = var9_9;
                var9_9.cy6 = var1_1;
                v0 = var6_6;
            }
            var1_1 = (int)v0;
        } while (var2_4 != 0);
        this.s2r[var1_1] = var3_2;
        var3_2.cy6 = var1_1;
    }

    public boolean a1s() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.b92;
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw cqp.a(illegalStateException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x66F36CFA7E78L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("7\u001fbK\u0013Z\u00f7Ld\u00aaMG\u00bd\u008f\u00a2\u0003".getBytes("ISO-8859-1"));
                b = cqp.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
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

