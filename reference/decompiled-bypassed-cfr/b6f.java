/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b6f
extends cjm {
    private /* synthetic */ k9a t6g;
    private /* synthetic */ g_3 md8;
    public t9d owp;
    private /* synthetic */ double uy1;
    private /* synthetic */ p8a wp6;
    private /* synthetic */ int z7a;
    public float yf2;
    public float cw5;
    private /* synthetic */ boolean r_8;
    private static final long a = c.a(7194665209353165314L, 7817188170874638245L, MethodHandles.lookup().lookupClass()).a(153005746132201L);
    private static final String b;

    public b6f(k9a k9a2, double d, float f, float f2) {
        long l = a ^ 0x15E6AA7EC10BL;
        this.t6g = k9a2;
        this.owp = k9a2.oay;
        this.uy1 = d;
        this.wp6 = k9a2.zq2();
        this.cw5 = f;
        this.yf2 = f2;
        this.k23(3);
        if (!(k9a2.zq2() instanceof zvv)) {
            throw new IllegalArgumentException(b);
        }
    }

    @Override
    public boolean vle() {
        boolean bl;
        block26: {
            g_3 g_32;
            block27: {
                int n;
                block24: {
                    block25: {
                        block22: {
                            block23: {
                                g_3 g_33;
                                block20: {
                                    block21: {
                                        n = t9d.b();
                                        g_32 = this.t6g.ifk();
                                        try {
                                            try {
                                                g_33 = g_32;
                                                if (n == 0) break block20;
                                                if (g_33 != null) break block21;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw b6f.a(illegalArgumentException);
                                            }
                                            return false;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw b6f.a(illegalArgumentException);
                                        }
                                    }
                                    g_33 = g_32;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = g_33 instanceof ha9;
                                                if (n == 0) break block22;
                                                if (!bl) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw b6f.a(illegalArgumentException);
                                            }
                                            bl = ((ha9)g_32).myu();
                                            if (n == 0) break block22;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw b6f.a(illegalArgumentException);
                                        }
                                        if (!bl) break block23;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw b6f.a(illegalArgumentException);
                                    }
                                    return false;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw b6f.a(illegalArgumentException);
                                }
                            }
                            bl = this.t6g.ird();
                        }
                        try {
                            try {
                                if (n == 0) break block24;
                                if (!bl) break block25;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw b6f.a(illegalArgumentException);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw b6f.a(illegalArgumentException);
                        }
                    }
                    double d = this.t6g.wxg(g_32) - (double)(this.cw5 * this.cw5);
                    bl = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                }
                try {
                    try {
                        if (n == 0) break block26;
                        if (bl >= false) break block27;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw b6f.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw b6f.a(illegalArgumentException);
                }
            }
            this.md8 = g_32;
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean wh3() {
        int n;
        block13: {
            block11: {
                int n2;
                block12: {
                    block10: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = this.wp6.j07();
                                if (n2 == 0) break block10;
                                if (n != 0) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw b6f.a(illegalArgumentException);
                            }
                            double d = this.t6g.wxg(this.md8) - (double)(this.yf2 * this.yf2);
                            n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw b6f.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (n2 == 0) break block12;
                            if (n <= 0) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw b6f.a(illegalArgumentException);
                        }
                        n = this.t6g.ird() ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw b6f.a(illegalArgumentException);
                    }
                }
                try {
                    if (n2 == 0) break block13;
                    if (n != 0) break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw b6f.a(illegalArgumentException);
                }
                n = 1;
                break block13;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void mnp() {
        this.z7a = 0;
        this.r_8 = ((zvv)this.t6g.zq2()).cb4();
        ((zvv)this.t6g.zq2()).uuq(false);
    }

    @Override
    public void zly() {
        this.md8 = null;
        this.wp6.pj2();
        ((zvv)this.t6g.zq2()).uuq(true);
    }

    private boolean s8e(mew mew2) {
        boolean bl;
        block8: {
            block9: {
                e0x e0x2;
                int n;
                block6: {
                    e0x e0x3;
                    block7: {
                        zfz zfz2 = this.owp.getBlockState(mew2);
                        e0x3 = zfz2.r_y();
                        n = t9d.c();
                        try {
                            try {
                                e0x2 = e0x3;
                                if (n != 0) break block6;
                                if (e0x2 != ox_.ibw) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw b6f.a(illegalArgumentException);
                            }
                            bl = true;
                            break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw b6f.a(illegalArgumentException);
                        }
                    }
                    e0x2 = e0x3;
                }
                try {
                    bl = e0x2.gck();
                    if (n != 0) break block8;
                    if (bl) break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw b6f.a(illegalArgumentException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void iad() {
        block52: {
            int n;
            int n2;
            block56: {
                block55: {
                    block54: {
                        block53: {
                            block51: {
                                n2 = t9d.c();
                                try {
                                    try {
                                        this.t6g.ph8().rz3(this.md8, 10.0f, this.t6g.d1r());
                                        n = this.t6g.ird();
                                        if (n2 != 0) break block51;
                                        if (n != 0) break block52;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw b6f.a(illegalArgumentException);
                                    }
                                    n = this.z7a = this.z7a - 1;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw b6f.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    if (n2 != 0) break block53;
                                    if (n > 0) break block52;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw b6f.a(illegalArgumentException);
                                }
                                this.z7a = 10;
                                n = this.wp6.p6m(this.md8, this.uy1) ? 1 : 0;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw b6f.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (n2 != 0) break block54;
                                if (n != 0) break block52;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw b6f.a(illegalArgumentException);
                            }
                            n = this.t6g.hk3() ? 1 : 0;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw b6f.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (n2 != 0) break block55;
                            if (n != 0) break block52;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw b6f.a(illegalArgumentException);
                        }
                        double d = this.t6g.wxg(this.md8) - 144.0;
                        n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw b6f.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (n2 != 0) break block56;
                        if (n < 0) break block52;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw b6f.a(illegalArgumentException);
                    }
                    n = fe6.jqf(this.md8.o2v) - 2;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw b6f.a(illegalArgumentException);
                }
            }
            int n3 = n;
            int n4 = fe6.jqf(this.md8.vbd) - 2;
            int n5 = fe6.jqf(this.md8.aaw().bx_);
            int n6 = 0;
            block48: while (true) {
                int n7 = n6;
                int n8 = 4;
                block49: while (n7 <= n8) {
                    for (int i = 0; i <= 4; ++i) {
                        b6f b6f2;
                        block61: {
                            int n9;
                            block60: {
                                block59: {
                                    block57: {
                                        try {
                                            n9 = n6;
                                            if (n2 != 0) break block57;
                                            n8 = 1;
                                            if (n2 != 0) continue block49;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw b6f.a(illegalArgumentException);
                                        }
                                        try {
                                            block58: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n9 < n8) break block58;
                                                                        n9 = i;
                                                                        if (n2 != 0) break block57;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw b6f.a(illegalArgumentException);
                                                                    }
                                                                    if (n9 < 1) break block58;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw b6f.a(illegalArgumentException);
                                                                }
                                                                n9 = n6;
                                                                if (n2 != 0) break block57;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw b6f.a(illegalArgumentException);
                                                            }
                                                            if (n9 > 3) break block58;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw b6f.a(illegalArgumentException);
                                                        }
                                                        n9 = i;
                                                        if (n2 != 0) break block57;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw b6f.a(illegalArgumentException);
                                                    }
                                                    if (n9 <= 3) continue;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw b6f.a(illegalArgumentException);
                                                }
                                            }
                                            n9 = t9d.r3_(this.owp, new mew(n3 + n6, n5 - 1, n4 + i)) ? 1 : 0;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw b6f.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (n2 != 0) break block59;
                                            if (n9 == 0) continue;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw b6f.a(illegalArgumentException);
                                        }
                                        n9 = this.s8e(new mew(n3 + n6, n5, n4 + i)) ? 1 : 0;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw b6f.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n2 != 0) break block60;
                                            if (n9 == 0) continue;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw b6f.a(illegalArgumentException);
                                        }
                                        b6f2 = this;
                                        if (n2 != 0) break block61;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw b6f.a(illegalArgumentException);
                                    }
                                    n9 = b6f2.s8e(new mew(n3 + n6, n5 + 1, n4 + i)) ? 1 : 0;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw b6f.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (n9 == 0) continue;
                                this.t6g.x24((float)(n3 + n6) + 0.5f, n5, (float)(n4 + i) + 0.5f, this.t6g.x5k, this.t6g.y2i);
                                b6f2 = this;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw b6f.a(illegalArgumentException);
                            }
                        }
                        b6f2.wp6.pj2();
                        return;
                    }
                    ++n6;
                    if (n2 == 0) continue block48;
                }
                break;
            }
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
        long l = a ^ 0x4C5725A70EA8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u008b\u0005i\u00c7\u00db\u00cfL\u00f7$\u00ae\u00f7\u0019w1F\u00d6\u001d\u0012-,^o6\u0092\u001b\u00a4\u00f40\u00c6\u00b3\u009f\u0011B\u001d\u00f1o\u000b\u00bcfs\u0013\u00da\u00d7\u00c9wkG\u00eb".getBytes("ISO-8859-1"));
                b = b6f.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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

