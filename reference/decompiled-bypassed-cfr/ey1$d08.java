/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.network.play.server.S22PacketMultiBlockChange;
import net.minecraft.network.play.server.S23PacketBlockChange;

public class ey1$d08 {
    private final List yvc;
    private final h2f n_a;
    private short[] jcw;
    private int f7n;
    private int zgk;
    private long n5i;
    public final ey1 wu2;
    private static final long a = c.a(4442148362835269484L, -7406862075370843507L, MethodHandles.lookup().lookupClass()).a(248261355767823L);
    private static final String b;

    public ey1$d08(ey1 ey12, int n, int n2) {
        this.wu2 = ey12;
        this.yvc = Lists.newArrayList();
        this.jcw = new short[64];
        this.n_a = new h2f(n, n2);
        ey12.g37().kil.xw9(n, n2);
    }

    public void n82(z96 z962) {
        block12: {
            boolean bl;
            block13: {
                int n;
                block10: {
                    long l = a ^ 0x3EC4B3E94092L;
                    n = t9d.b();
                    try {
                        block11: {
                            try {
                                try {
                                    bl = this.yvc.contains(z962);
                                    if (n == 0) break block10;
                                    if (!bl) break block11;
                                }
                                catch (oov oov2) {
                                    throw ey1$d08.a(oov2);
                                }
                                ey1.srl().debug(b, new Object[]{z962, this.n_a.jnd, this.n_a.km5});
                                if (n != 0) break block12;
                            }
                            catch (oov oov3) {
                                throw ey1$d08.a(oov3);
                            }
                        }
                        bl = this.yvc.isEmpty();
                    }
                    catch (oov oov4) {
                        throw ey1$d08.a(oov4);
                    }
                }
                try {
                    try {
                        if (n == 0) break block12;
                        if (!bl) break block13;
                    }
                    catch (oov oov5) {
                        throw ey1$d08.a(oov5);
                    }
                    this.n5i = ey1.u4y(this.wu2).p2b();
                }
                catch (oov oov6) {
                    throw ey1$d08.a(oov6);
                }
            }
            this.yvc.add(z962);
            bl = z962.u8j.add(this.n_a);
        }
    }

    public void fwh(z96 z962) {
        block17: {
            ey1$d08 ey1$d08;
            block21: {
                block22: {
                    int n;
                    tts tts2;
                    int n2;
                    block20: {
                        block18: {
                            block19: {
                                ey1$d08 ey1$d082;
                                block16: {
                                    n2 = t9d.b();
                                    try {
                                        try {
                                            ey1$d082 = this;
                                            if (n2 == 0) break block16;
                                            if (!ey1$d082.yvc.contains(z962)) break block17;
                                        }
                                        catch (oov oov2) {
                                            throw ey1$d08.a(oov2);
                                        }
                                        ey1$d082 = this;
                                    }
                                    catch (oov oov3) {
                                        throw ey1$d08.a(oov3);
                                    }
                                }
                                tts2 = ey1.u4y(ey1$d082.wu2).o5h(this.n_a.jnd, this.n_a.km5);
                                try {
                                    try {
                                        n = tts2.sac();
                                        if (n2 == 0) break block18;
                                        if (n == 0) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw ey1$d08.a(oov4);
                                    }
                                    z962.rhh.vnf(new S21PacketChunkData(tts2, true, 0));
                                }
                                catch (oov oov5) {
                                    throw ey1$d08.a(oov5);
                                }
                            }
                            this.yvc.remove(z962);
                            z962.u8j.remove(this.n_a);
                            n = this.yvc.isEmpty() ? 1 : 0;
                        }
                        try {
                            try {
                                if (n2 == 0) break block20;
                                if (n == 0) break block17;
                            }
                            catch (oov oov6) {
                                throw ey1$d08.a(oov6);
                            }
                            n = this.n_a.jnd;
                        }
                        catch (oov oov7) {
                            throw ey1$d08.a(oov7);
                        }
                    }
                    long l = (long)n + Integer.MAX_VALUE | (long)this.n_a.km5 + Integer.MAX_VALUE << 32;
                    try {
                        try {
                            this._1r(tts2);
                            ey1.tq6(this.wu2).wsz(l);
                            ey1.xsj(this.wu2).remove(this);
                            ey1$d08 = this;
                            if (n2 == 0) break block21;
                            if (ey1$d08.f7n <= 0) break block22;
                        }
                        catch (oov oov8) {
                            throw ey1$d08.a(oov8);
                        }
                        ey1.h7m(this.wu2).remove(this);
                    }
                    catch (oov oov9) {
                        throw ey1$d08.a(oov9);
                    }
                }
                ey1$d08 = this;
            }
            ey1$d08.wu2.g37().kil.ztg(this.n_a.jnd, this.n_a.km5);
        }
    }

    public void bii() {
        this._1r(ey1.u4y(this.wu2).o5h(this.n_a.jnd, this.n_a.km5));
    }

    private void _1r(tts tts2) {
        tts2.tgk(tts2.zuf() + ey1.u4y(this.wu2).p2b() - this.n5i);
        this.n5i = ey1.u4y(this.wu2).p2b();
    }

    public void gma(int n, int n2, int n3) {
        block16: {
            short s;
            block17: {
                int n4;
                short[] sArray;
                int n5;
                int n6;
                int n7;
                block15: {
                    block13: {
                        block14: {
                            n7 = t9d.c();
                            try {
                                try {
                                    n6 = this.f7n;
                                    if (n7 != 0) break block13;
                                    if (n6 != 0) break block14;
                                }
                                catch (oov oov2) {
                                    throw ey1$d08.a(oov2);
                                }
                                ey1.h7m(this.wu2).add(this);
                            }
                            catch (oov oov3) {
                                throw ey1$d08.a(oov3);
                            }
                        }
                        this.zgk |= 1 << (n2 >> 4);
                        n6 = this.f7n;
                    }
                    try {
                        try {
                            n5 = 64;
                            if (n7 != 0) break block15;
                            if (n6 >= n5) break block16;
                        }
                        catch (oov oov4) {
                            throw ey1$d08.a(oov4);
                        }
                        n6 = n << 12 | n3 << 8;
                        n5 = n2;
                    }
                    catch (oov oov5) {
                        throw ey1$d08.a(oov5);
                    }
                }
                s = (short)(n6 | n5);
                int n8 = 0;
                while (n8 < this.f7n) {
                    block18: {
                        try {
                            try {
                                sArray = this.jcw;
                                n4 = n8++;
                                if (n7 != 0) break block17;
                                if (sArray[n4] != s) break block18;
                            }
                            catch (oov oov6) {
                                throw ey1$d08.a(oov6);
                            }
                            return;
                        }
                        catch (oov oov7) {
                            throw ey1$d08.a(oov7);
                        }
                    }
                    if (n7 == 0) continue;
                }
                sArray = this.jcw;
                int n9 = this.f7n;
                n4 = n9;
                this.f7n = n9 + 1;
            }
            sArray[n4] = s;
        }
    }

    public void aak(mz2 mz22) {
        int n = t9d.b();
        int n2 = 0;
        while (n2 < this.yvc.size()) {
            block5: {
                block6: {
                    z96 z962 = (z96)this.yvc.get(n2);
                    try {
                        try {
                            if (n == 0) break block5;
                            if (z962.u8j.contains(this.n_a)) break block6;
                        }
                        catch (oov oov2) {
                            throw ey1$d08.a(oov2);
                        }
                        z962.rhh.vnf(mz22);
                    }
                    catch (oov oov3) {
                        throw ey1$d08.a(oov3);
                    }
                }
                ++n2;
            }
            if (n != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void q84() {
        block37: {
            block44: {
                block41: {
                    block42: {
                        block38: {
                            block40: {
                                block39: {
                                    block36: {
                                        var1_1 = t9d.c();
                                        try {
                                            try {
                                                v0 = this.f7n;
                                                if (var1_1 != 0) break block36;
                                                if (v0 == 0) break block37;
                                            }
                                            catch (oov v1) {
                                                throw ey1$d08.a(v1);
                                            }
                                            v0 = this.f7n;
                                        }
                                        catch (oov v2) {
                                            throw ey1$d08.a(v2);
                                        }
                                    }
                                    try {
                                        v3 = 1;
                                        if (var1_1 != 0) break block38;
                                        if (v0 == v3) {
                                        }
                                        ** GOTO lbl45
                                    }
                                    catch (oov v4) {
                                        throw ey1$d08.a(v4);
                                    }
                                    var2_2 = (this.jcw[0] >> 12 & 15) + this.n_a.jnd * 16;
                                    var3_3 = this.jcw[0] & 255;
                                    var4_4 = (this.jcw[0] >> 8 & 15) + this.n_a.km5 * 16;
                                    var5_5 = new mew(var2_2, var3_3, var4_4);
                                    try {
                                        try {
                                            this.aak(new S23PacketBlockChange(ey1.u4y(this.wu2), var5_5));
                                            v5 = this;
                                            if (var1_1 != 0) break block39;
                                            if (!ey1.u4y(v5.wu2).getBlockState(var5_5).r_y().caz()) break block40;
                                        }
                                        catch (oov v6) {
                                            throw ey1$d08.a(v6);
                                        }
                                        v5 = this;
                                    }
                                    catch (oov v7) {
                                        throw ey1$d08.a(v7);
                                    }
                                }
                                v5.gg4(ey1.u4y(this.wu2).getTileEntity(var5_5));
                            }
                            try {
                                if (var1_1 == 0) break block41;
lbl45:
                                // 2 sources

                                v0 = this.f7n;
                                v3 = 64;
                            }
                            catch (oov v8) {
                                throw ey1$d08.a(v8);
                            }
                        }
                        try {
                            if (var1_1 != 0) break block42;
                            if (v0 != v3) {
                            }
                            ** GOTO lbl88
                        }
                        catch (oov v9) {
                            throw ey1$d08.a(v9);
                        }
                        this.aak(new S22PacketMultiBlockChange(this.f7n, this.jcw, ey1.u4y(this.wu2).o5h(this.n_a.jnd, this.n_a.km5)));
                        var2_2 = 0;
                        while (var2_2 < this.f7n) {
                            block43: {
                                block45: {
                                    var3_3 = (this.jcw[var2_2] >> 12 & 15) + this.n_a.jnd * 16;
                                    var4_4 = this.jcw[var2_2] & 255;
                                    var5_6 = (this.jcw[var2_2] >> 8 & 15) + this.n_a.km5 * 16;
                                    var6_8 = new mew(var3_3, var4_4, var5_6);
                                    try {
                                        try {
                                            try {
                                                if (var1_1 != 0) break block43;
                                                v10 = this;
                                                if (var1_1 != 0) break block44;
                                            }
                                            catch (oov v11) {
                                                throw ey1$d08.a(v11);
                                            }
                                            if (!ey1.u4y(v10.wu2).getBlockState((mew)var6_8).r_y().caz()) break block45;
                                        }
                                        catch (oov v12) {
                                            throw ey1$d08.a(v12);
                                        }
                                        this.gg4(ey1.u4y(this.wu2).getTileEntity((mew)var6_8));
                                    }
                                    catch (oov v13) {
                                        throw ey1$d08.a(v13);
                                    }
                                }
                                ++var2_2;
                            }
                            if (var1_1 == 0) continue;
                        }
                        try {
                            if (var1_1 == 0) break block41;
lbl88:
                            // 2 sources

                            v0 = this.n_a.jnd;
                            v3 = 16;
                        }
                        catch (oov v14) {
                            throw ey1$d08.a(v14);
                        }
                    }
                    var2_2 = v0 * v3;
                    var3_3 = this.n_a.km5 * 16;
                    this.aak(new S21PacketChunkData(ey1.u4y(this.wu2).o5h(this.n_a.jnd, this.n_a.km5), false, this.zgk));
                    var4_4 = 0;
                    while (var4_4 < 16) {
                        block48: {
                            block47: {
                                block46: {
                                    try {
                                        try {
                                            try {
                                                v10 = this;
                                                if (var1_1 != 0) break block44;
                                                v15 = v10.zgk & 1 << var4_4;
                                                if (var1_1 != 0) break block46;
                                            }
                                            catch (oov v16) {
                                                throw ey1$d08.a(v16);
                                            }
                                            if (v15 == 0) break block47;
                                        }
                                        catch (oov v17) {
                                            throw ey1$d08.a(v17);
                                        }
                                        v15 = var4_4 << 4;
                                    }
                                    catch (oov v18) {
                                        throw ey1$d08.a(v18);
                                    }
                                }
                                var5_7 = v15;
                                var6_8 = ey1.u4y(this.wu2)._12(var2_2, var5_7, var3_3, var2_2 + 16, var5_7 + 16, var3_3 + 16);
                                for (var7_9 = 0; var7_9 < var6_8.size(); ++var7_9) {
                                    try {
                                        this.gg4((pyk)var6_8.get(var7_9));
                                        if (var1_1 == 0) {
                                            if (var1_1 == 0) continue;
                                            break;
                                        }
                                        break block48;
                                    }
                                    catch (oov v19) {
                                        throw ey1$d08.a(v19);
                                    }
                                }
                            }
                            ++var4_4;
                        }
                        if (var1_1 == 0) continue;
                    }
                }
                this.f7n = 0;
                v10 = this;
            }
            v10.zgk = 0;
        }
    }

    private void gg4(pyk pyk2) {
        block6: {
            pyk pyk3;
            block5: {
                int n = t9d.b();
                try {
                    pyk3 = pyk2;
                    if (n == 0) break block5;
                    if (pyk3 == null) break block6;
                }
                catch (oov oov2) {
                    throw ey1$d08.a(oov2);
                }
                pyk3 = pyk2;
            }
            mz2 mz22 = pyk3.ptb();
            try {
                if (mz22 != null) {
                    this.aak(mz22);
                }
            }
            catch (oov oov3) {
                throw ey1$d08.a(oov3);
            }
        }
    }

    public static h2f cbu(ey1$d08 ey1$d08) {
        return ey1$d08.n_a;
    }

    public static List sz3(ey1$d08 ey1$d08) {
        return ey1$d08.yvc;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x708D546195BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("F\\*\u00b9\u00dft\u00e2D\u0007\u009cc\u00fd]\u0000\u00daa\u009e\u00f51\u00e6\u0006\u009d\u00cf|\u00e5Q\u00c5\u00c9\u00c7\u00c1b\u00a4\u009f^\u0097\u0095\u00f0wq\u00de\u00f8d\u00bcU\u00e5TV\u0087\u00b7\u00056\u00de%8O^".getBytes("ISO-8859-1"));
                b = ey1$d08.a(byArray3).intern();
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

