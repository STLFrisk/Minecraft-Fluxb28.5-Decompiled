/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cn9
implements y99 {
    private static final Logger b23;
    public final List i2c = Lists.newArrayList();
    private final if1 ilc;
    private static final long a;
    private static final String b;

    public cn9(if1 if12) {
        this.ilc = if12;
    }

    public void vu1(g68 g682) {
        this.i2c.add(g682);
    }

    @Override
    public Set ugj() {
        return null;
    }

    @Override
    public yaa td5(gdz gdz2) {
        g68 g682 = null;
        gdz gdz3 = cn9.uoi(gdz2);
        int n = t9d.b();
        for (int i = this.i2c.size() - 1; i >= 0; --i) {
            boolean bl;
            g68 g683;
            block10: {
                g68 g684;
                block8: {
                    block9: {
                        g683 = (g68)this.i2c.get(i);
                        try {
                            try {
                                try {
                                    g684 = g682;
                                    if (n == 0) break block8;
                                    if (g684 != null) break block9;
                                }
                                catch (oov oov2) {
                                    throw cn9.a(oov2);
                                }
                                bl = g683.g1w(gdz3);
                                if (n == 0) break block10;
                            }
                            catch (oov oov3) {
                                throw cn9.a(oov3);
                            }
                            if (!bl) break block9;
                        }
                        catch (oov oov4) {
                            throw cn9.a(oov4);
                        }
                        g682 = g683;
                    }
                    g684 = g683;
                }
                bl = g684.g1w(gdz2);
            }
            if (!bl) continue;
            InputStream inputStream = null;
            if (g682 != null) {
                inputStream = this.xpr(gdz3, g682);
            }
            return new ay1(g683.qw5(), gdz2, this.xpr(gdz2, g683), inputStream, this.ilc);
        }
        throw new FileNotFoundException(gdz2.toString());
    }

    public InputStream xpr(gdz gdz2, g68 g682) {
        InputStream inputStream;
        InputStream inputStream2 = g682.e77(gdz2);
        try {
            inputStream = b23.isDebugEnabled() ? new cn9$zw7(inputStream2, gdz2, g682.qw5()) : inputStream2;
        }
        catch (oov oov2) {
            throw cn9.a(oov2);
        }
        return inputStream;
    }

    @Override
    public List gc4(gdz gdz2) {
        ArrayList arrayList;
        block17: {
            boolean bl;
            ArrayList arrayList2;
            block14: {
                arrayList2 = Lists.newArrayList();
                gdz gdz3 = cn9.uoi(gdz2);
                int n = t9d.b();
                for (g68 g682 : this.i2c) {
                    block16: {
                        InputStream inputStream;
                        boolean bl2;
                        block15: {
                            try {
                                try {
                                    try {
                                        bl = g682.g1w(gdz2);
                                        if (n == 0) break block14;
                                        if (n == 0) break block15;
                                    }
                                    catch (oov oov2) {
                                        throw cn9.a(oov2);
                                    }
                                    if (!bl) break block16;
                                }
                                catch (oov oov3) {
                                    throw cn9.a(oov3);
                                }
                                bl2 = g682.g1w(gdz3);
                            }
                            catch (oov oov4) {
                                throw cn9.a(oov4);
                            }
                        }
                        try {
                            inputStream = bl2 ? this.xpr(gdz3, g682) : null;
                        }
                        catch (oov oov5) {
                            throw cn9.a(oov5);
                        }
                        InputStream inputStream2 = inputStream;
                        arrayList2.add(new ay1(g682.qw5(), gdz2, this.xpr(gdz2, g682), inputStream2, this.ilc));
                    }
                    if (n != 0) continue;
                }
                try {
                    arrayList = arrayList2;
                    if (n == 0) break block17;
                    bl = arrayList.isEmpty();
                }
                catch (oov oov6) {
                    throw cn9.a(oov6);
                }
            }
            try {
                if (bl) {
                    throw new FileNotFoundException(gdz2.toString());
                }
            }
            catch (oov oov7) {
                throw cn9.a(oov7);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public static gdz uoi(gdz gdz2) {
        long l = a ^ 0x3E1BF89F0B7EL;
        return new gdz(gdz2._a7(), gdz2.xyp() + b);
    }

    public static Logger nyj() {
        return b23;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(1464116052314292361L, 7880215991569639171L, MethodHandles.lookup().lookupClass()).a(266651469506152L);
        long l = a ^ 0x5B36460E5456L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0019\u001c5\u00f51\u00e2\u00c2\u00fc".getBytes("ISO-8859-1"));
                b = cn9.a(byArray3).intern();
                b23 = LogManager.getLogger();
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

