/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cog$8
implements Callable {
    public final cog i08;
    private static final long a = c.a(8497989146366637580L, -2118531726934836293L, MethodHandles.lookup().lookupClass()).a(46911209278275L);
    private static final String b;

    public cog$8(cog cog2) {
        this.i08 = cog2;
    }

    public String call() {
        long l = a ^ 0xB740D49B801L;
        return String.format(b, cog.yw_(this.i08), cog.po1(this.i08), cog.glo(this.i08), cog.ktm(this.i08));
    }

    public Object call() {
        return this.call();
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x7F2009EE9242L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("%\u00d1\u000b\\\u00eb\u0087\u00f7\u007fE\u00b6mZ\u00be\u0013v\u00ef\u0083\u00ab\u0098mJX\u00a1\u00e8L\u008c\u00ca\u000e\u00a4B\u0081\u00cc0-\u0015\u00c8\u008d\u00df\u00b5\u00e3\u00eaZ\b\u00a3\u00a7\u00c0\u0091\r\u0088<\u00eda\u00bb\u00b1\u00cc\u0095".getBytes("ISO-8859-1"));
                b = cog$8.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

