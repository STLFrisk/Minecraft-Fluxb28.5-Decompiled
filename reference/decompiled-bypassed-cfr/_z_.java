/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class _z_
extends cjm {
    private static final Logger dlm;
    private yqv mcs;
    private final Predicate a4r;
    private final s24$tx3 ds8;
    private g_3 nj7;
    private Class tnr;
    private static final long a;
    private static final String b;

    public _z_(yqv yqv2, Class clazz) {
        block4: {
            block5: {
                long l = a ^ 0x4812782AD61BL;
                this.mcs = yqv2;
                int n = t9d.b();
                try {
                    try {
                        this.tnr = clazz;
                        if (n == 0) break block4;
                        if (!(yqv2 instanceof laq)) break block5;
                    }
                    catch (oov oov2) {
                        throw _z_.a(oov2);
                    }
                    dlm.warn(b);
                }
                catch (oov oov3) {
                    throw _z_.a(oov3);
                }
            }
            this.a4r = new _z_$1(this);
            this.ds8 = new s24$tx3(yqv2);
        }
    }

    @Override
    public boolean vle() {
        boolean bl;
        block4: {
            List list;
            block5: {
                double d = this.f_m();
                list = this.mcs.oay.vie(this.tnr, this.mcs.aaw().c2h(d, 4.0, d), this.a4r);
                int n = t9d.b();
                try {
                    try {
                        Collections.sort(list, this.ds8);
                        bl = list.isEmpty();
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw _z_.a(oov2);
                    }
                    return false;
                }
                catch (oov oov3) {
                    throw _z_.a(oov3);
                }
            }
            this.nj7 = (g_3)list.get(0);
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean wh3() {
        double d;
        block22: {
            block24: {
                block23: {
                    g_3 g_32;
                    int n;
                    block20: {
                        block21: {
                            block19: {
                                boolean bl;
                                block18: {
                                    g_3 g_33;
                                    block16: {
                                        block17: {
                                            n = t9d.c();
                                            g_32 = this.mcs.q4v();
                                            try {
                                                try {
                                                    g_33 = g_32;
                                                    if (n != 0) break block16;
                                                    if (g_33 != null) break block17;
                                                }
                                                catch (oov oov2) {
                                                    throw _z_.a(oov2);
                                                }
                                                return false;
                                            }
                                            catch (oov oov3) {
                                                throw _z_.a(oov3);
                                            }
                                        }
                                        g_33 = g_32;
                                    }
                                    try {
                                        bl = g_33.gzr();
                                        if (n != 0) break block18;
                                        if (bl) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw _z_.a(oov4);
                                    }
                                    bl = false;
                                }
                                return bl;
                            }
                            double d2 = this.f_m();
                            try {
                                try {
                                    double d3 = this.mcs.wxg(g_32) - d2 * d2;
                                    d = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                    if (n != 0) break block20;
                                    if (d <= 0) break block21;
                                }
                                catch (oov oov5) {
                                    throw _z_.a(oov5);
                                }
                                d = 0.0;
                                break block22;
                            }
                            catch (oov oov6) {
                                throw _z_.a(oov6);
                            }
                        }
                        d = (double)(g_32 instanceof z96);
                    }
                    try {
                        try {
                            try {
                                if (n != 0) break block22;
                                if (d == false) break block23;
                            }
                            catch (oov oov7) {
                                throw _z_.a(oov7);
                            }
                            d = (double)((z96)g_32)._am.u7c();
                            if (n != 0) break block22;
                        }
                        catch (oov oov8) {
                            throw _z_.a(oov8);
                        }
                        if (d != false) break block24;
                    }
                    catch (oov oov9) {
                        throw _z_.a(oov9);
                    }
                }
                d = 1.0;
                break block22;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    @Override
    public void mnp() {
        this.mcs.ux8(this.nj7);
        super.mnp();
    }

    @Override
    public void zly() {
        this.mcs.ux8(null);
        super.mnp();
    }

    public double f_m() {
        double d;
        block6: {
            _4o _4o2;
            block4: {
                _4o _4o3;
                block5: {
                    int n = t9d.b();
                    _4o3 = this.mcs.dgt(m6d.wg4);
                    try {
                        try {
                            _4o2 = _4o3;
                            if (n == 0) break block4;
                            if (_4o2 != null) break block5;
                        }
                        catch (oov oov2) {
                            throw _z_.a(oov2);
                        }
                        d = 16.0;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw _z_.a(oov3);
                    }
                }
                _4o2 = _4o3;
            }
            d = _4o2.nz5();
        }
        return d;
    }

    public static yqv g3s(_z_ _z_2) {
        return _z_2.mcs;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(6336870331157789699L, -8380893016918023416L, MethodHandles.lookup().lookupClass()).a(143299901190546L);
        long l = a ^ 0xC1C9F08F05L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f4\u00a5$\u0001\u0018A\u00b2$7\u00d9\u00f5\u00b3\u00f8\u001f\u00a8\u0096\u008cG\u00fc\u00bfZ\u00199i\u00a43\u00bci\u00adE&qT\u00b1\u00ab\u0013\u00fa$\u00ce\u0099\u00c4\u0085&\u00d4\u00f3\u0006,6\u0013-J\fsRB\u00b3\"j\u00ccy\u00b8jXX".getBytes("ISO-8859-1"));
                b = _z_.a(byArray3).intern();
                dlm = LogManager.getLogger();
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

