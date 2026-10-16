/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class akr
extends b0t
implements eqe {
    private static final /* synthetic */ gdz wdc;
    public static final gdz _rg;
    private final /* synthetic */ c05 er6;
    private /* synthetic */ long nmo;
    private /* synthetic */ al9 f8j;

    public akr(c05 c052) {
        this.er6 = c052;
    }

    public void gm7(int n) {
        block8: {
            block6: {
                int n2 = t9d.c();
                try {
                    akr akr2;
                    block7: {
                        try {
                            try {
                                this.nmo = c05.qgs();
                                akr2 = this;
                                if (n2 != 0) break block6;
                                if (akr2.f8j == null) break block7;
                            }
                            catch (oov oov2) {
                                throw akr.a(oov2);
                            }
                            this.f8j.o4o(n);
                            if (n2 == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw akr.a(oov3);
                        }
                    }
                    akr2 = this;
                }
                catch (oov oov4) {
                    throw akr.a(oov4);
                }
            }
            akr2.f8j = new al9(this);
        }
    }

    private float ij7() {
        long l = this.nmo - c05.qgs() + 5000L;
        return fe6._f3((float)l / 2000.0f, 0.0f, 1.0f);
    }

    public void f0m(eka eka2, float f) {
        block11: {
            float f2;
            float f3;
            block12: {
                akr akr2;
                int n;
                block10: {
                    n = t9d.c();
                    try {
                        try {
                            akr2 = this;
                            if (n != 0) break block10;
                            if (akr2.f8j == null) break block11;
                        }
                        catch (oov oov2) {
                            throw akr.a(oov2);
                        }
                        akr2 = this;
                    }
                    catch (oov oov3) {
                        throw akr.a(oov3);
                    }
                }
                f3 = akr2.ij7();
                try {
                    block13: {
                        try {
                            try {
                                float f4 = f3 - 0.0f;
                                f2 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                                if (n != 0) break block12;
                                if (f2 > 0) break block13;
                            }
                            catch (oov oov4) {
                                throw akr.a(oov4);
                            }
                            this.f8j.kh4();
                            if (n == 0) break block11;
                        }
                        catch (oov oov5) {
                            throw akr.a(oov5);
                        }
                    }
                    f2 = eka2.x05() / 2;
                }
                catch (oov oov6) {
                    throw akr.a(oov6);
                }
            }
            float f5 = f2;
            float f6 = this.o3s;
            this.o3s = -90.0f;
            float f7 = (float)eka2.lrx() - 22.0f * f3;
            h61 h612 = this.f8j.zrh();
            this._dw(eka2, f3, (int)f5, f7, h612);
            this.o3s = f6;
        }
    }

    public void _dw(eka eka2, float f, int n, float f2, h61 h612) {
        block10: {
            int n2;
            int n3;
            block8: {
                int n4;
                block9: {
                    hzu.ixc();
                    hzu.spd();
                    hzu.u39(770, 771, 1, 0);
                    hzu.wn0(1.0f, 1.0f, 1.0f, f);
                    int n5 = t9d.c();
                    this.er6.l22().anl(wdc);
                    n3 = n5;
                    try {
                        try {
                            this.j7o(n - 91, f2, 0, 0, 182, 22);
                            n4 = h612.hys();
                            if (n3 != 0) break block8;
                            if (n4 < 0) break block9;
                        }
                        catch (oov oov2) {
                            throw akr.a(oov2);
                        }
                        this.j7o(n - 91 - 1 + h612.hys() * 20, f2 - 1.0f, 0, 22, 24, 22);
                    }
                    catch (oov oov3) {
                        throw akr.a(oov3);
                    }
                }
                qpm.gdb();
                n4 = n2 = 0;
            }
            while (n2 < 9) {
                try {
                    this.r8e(n2, eka2.x05() / 2 - 90 + n2 * 20 + 2, f2 + 3.0f, f, h612.m3g(n2));
                    ++n2;
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                        break;
                    }
                    break block10;
                }
                catch (oov oov4) {
                    throw akr.a(oov4);
                }
            }
            qpm.cng();
            hzu.eiq();
            hzu.ux6();
        }
    }

    private void r8e(int n, int n2, float f, float f2, sjk sjk2) {
        block16: {
            int n3 = t9d.c();
            this.er6.l22().anl(_rg);
            if (sjk2 != al9._du) {
                int n4;
                String string;
                int n5;
                block15: {
                    float f3;
                    block13: {
                        block14: {
                            n5 = (int)(f2 * 255.0f);
                            try {
                                try {
                                    hzu.dp2();
                                    f3 = n2;
                                    if (n3 != 0) break block13;
                                    hzu.a4k(f3, f, 0.0f);
                                    if (!sjk2.v4p()) break block14;
                                }
                                catch (oov oov2) {
                                    throw akr.a(oov2);
                                }
                                f3 = 1.0f;
                                break block13;
                            }
                            catch (oov oov3) {
                                throw akr.a(oov3);
                            }
                        }
                        f3 = 0.25f;
                    }
                    float f4 = f3;
                    hzu.wn0(f4, f4, f4, f2);
                    sjk2.b6x(f4, n5);
                    hzu.x3w();
                    string = String.valueOf(moh.wx5(this.er6.oxn.m85[n].xbs()));
                    try {
                        try {
                            n4 = n5;
                            if (n3 != 0) break block15;
                            if (n4 <= 3) break block16;
                        }
                        catch (oov oov4) {
                            throw akr.a(oov4);
                        }
                        n4 = sjk2.v4p() ? 1 : 0;
                    }
                    catch (oov oov5) {
                        throw akr.a(oov5);
                    }
                }
                try {
                    try {
                        if (n3 != 0 || n4 == 0) break block16;
                    }
                    catch (oov oov6) {
                        throw akr.a(oov6);
                    }
                    n4 = this.er6.tx1.km1(string, n2 + 19 - 2 - this.er6.tx1.ezt(string), f + 6.0f + 3.0f, 0xFFFFFF + (n5 << 24));
                }
                catch (oov oov7) {
                    throw akr.a(oov7);
                }
            }
        }
    }

    public void gdx(eka eka2) {
        block11: {
            String string;
            int n;
            block15: {
                String string2;
                block14: {
                    sjk sjk2;
                    block13: {
                        al9 al92;
                        int n2;
                        block12: {
                            n2 = t9d.b();
                            n = (int)(this.ij7() * 255.0f);
                            try {
                                try {
                                    try {
                                        if (n <= 3) break block11;
                                        al92 = this.f8j;
                                        if (n2 == 0) break block12;
                                    }
                                    catch (oov oov2) {
                                        throw akr.a(oov2);
                                    }
                                    if (al92 == null) break block11;
                                }
                                catch (oov oov3) {
                                    throw akr.a(oov3);
                                }
                                al92 = this.f8j;
                            }
                            catch (oov oov4) {
                                throw akr.a(oov4);
                            }
                        }
                        sjk sjk3 = al92.by8();
                        try {
                            try {
                                sjk2 = sjk3;
                                if (n2 == 0) break block13;
                                if (sjk2 == al9._du) break block14;
                            }
                            catch (oov oov5) {
                                throw akr.a(oov5);
                            }
                            sjk2 = sjk3;
                        }
                        catch (oov oov6) {
                            throw akr.a(oov6);
                        }
                    }
                    string2 = sjk2.s34()._2o();
                    break block15;
                }
                string2 = string = this.f8j.sr4().iuh()._2o();
            }
            if (string != null) {
                int n3 = (eka2.x05() - this.er6.tx1.ezt(string)) / 2;
                int n4 = eka2.lrx() - 35;
                hzu.dp2();
                hzu.spd();
                hzu.u39(770, 771, 1, 0);
                this.er6.tx1.km1(string, n3, n4, 0xFFFFFF + (n << 24));
                hzu.ux6();
                hzu.x3w();
            }
        }
    }

    @Override
    public void b67(al9 al92) {
        this.f8j = null;
        this.nmo = 0L;
    }

    public boolean e1e() {
        boolean bl;
        try {
            bl = this.f8j != null;
        }
        catch (oov oov2) {
            throw akr.a(oov2);
        }
        return bl;
    }

    public void ou8(int n) {
        block23: {
            int n2;
            int n3;
            int n4;
            block20: {
                block22: {
                    int n5;
                    block19: {
                        n5 = t9d.b();
                        for (n4 = this.f8j.q_4() + n; n4 >= 0; n4 += n) {
                            sjk sjk2;
                            block21: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n3 = n4;
                                                    if (n5 == 0) break block19;
                                                    n2 = 8;
                                                    if (n5 == 0) break block20;
                                                }
                                                catch (oov oov2) {
                                                    throw akr.a(oov2);
                                                }
                                                if (n3 > n2) break;
                                            }
                                            catch (oov oov3) {
                                                throw akr.a(oov3);
                                            }
                                            sjk2 = this.f8j.i37(n4);
                                            if (n5 == 0) break block21;
                                        }
                                        catch (oov oov4) {
                                            throw akr.a(oov4);
                                        }
                                        if (sjk2 == al9._du) continue;
                                    }
                                    catch (oov oov5) {
                                        throw akr.a(oov5);
                                    }
                                    sjk2 = this.f8j.i37(n4);
                                }
                                catch (oov oov6) {
                                    throw akr.a(oov6);
                                }
                            }
                            try {
                                n3 = sjk2.v4p() ? 1 : 0;
                                if (n5 != 0) {
                                    if (n3 != 0) break;
                                    continue;
                                }
                                break block19;
                            }
                            catch (oov oov7) {
                                throw akr.a(oov7);
                            }
                        }
                        n3 = n4;
                    }
                    try {
                        if (n5 == 0) break block22;
                        if (n3 < 0) break block23;
                    }
                    catch (oov oov8) {
                        throw akr.a(oov8);
                    }
                    n3 = n4;
                }
                n2 = 8;
            }
            try {
                if (n3 <= n2) {
                    this.f8j.o4o(n4);
                    this.nmo = c05.qgs();
                }
            }
            catch (oov oov9) {
                throw akr.a(oov9);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void wrb() {
        block9: {
            block8: {
                var1_1 = t9d.c();
                try {
                    this.nmo = c05.qgs();
                    v0 = this;
                    if (var1_1 != 0) break block8;
                    if (v0.e1e()) {
                    }
                    ** GOTO lbl20
                }
                catch (oov v1) {
                    throw akr.a(v1);
                }
                var2_2 = this.f8j.q_4();
                try {
                    if (var2_2 != -1) {
                        this.f8j.o4o(var2_2);
                    }
                }
                catch (oov v2) {
                    throw akr.a(v2);
                }
                try {
                    if (var1_1 == 0) break block9;
lbl20:
                    // 2 sources

                    v0 = this;
                }
                catch (oov v3) {
                    throw akr.a(v3);
                }
            }
            v0.f8j = new al9(this);
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
        long l = c.a(-4244161520472991969L, 6754370860738977570L, MethodHandles.lookup().lookupClass()).a(140159059394865L) ^ 0x3277F3B0F5FDL;
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
        String string = "D\u00de\u00cc\u0084\u0096\u0087\u0094\u00f7\u00c2\u0003\f\u00e0\u00bf\u00fdYL4+\u00bf\u00d7\u0018\\\\\u00d0c\u00beeO^\r\u0088\u0096\u00908\u00f7(\u00de\n0\u00c5 D\u00de\u00cc\u0084\u0096\u0087\u0094\u00f7E\u008dn\u0090\u00fa\u00d0\u00cba\u0015\u00c2L\u00b6\u00f5\u00c5\u009c\u00ef\u008d\u00cb\u00e3\u0001r\u00d7\u00a9\u0005";
        int n2 = "D\u00de\u00cc\u0084\u0096\u0087\u0094\u00f7\u00c2\u0003\f\u00e0\u00bf\u00fdYL4+\u00bf\u00d7\u0018\\\\\u00d0c\u00beeO^\r\u0088\u0096\u00908\u00f7(\u00de\n0\u00c5 D\u00de\u00cc\u0084\u0096\u0087\u0094\u00f7E\u008dn\u0090\u00fa\u00d0\u00cba\u0015\u00c2L\u00b6\u00f5\u00c5\u009c\u00ef\u008d\u00cb\u00e3\u0001r\u00d7\u00a9\u0005".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = akr.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                wdc = new gdz(stringArray2[1]);
                _rg = new gdz(stringArray2[0]);
                return;
            }
            n3 = string.charAt(n4);
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

