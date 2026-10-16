/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cny
extends gdw {
    private /* synthetic */ byte[] r5a;
    private static final long a = c.a(-1366031217344774458L, -792567667730663282L, MethodHandles.lookup().lookupClass()).a(17463166491401L);
    private static final String b;

    public cny() {
    }

    public cny(byte[] byArray) {
        this.r5a = byArray;
    }

    @Override
    public void b_8(DataOutput dataOutput) {
        dataOutput.writeInt(this.r5a.length);
        dataOutput.write(this.r5a);
    }

    @Override
    public void zwk(DataInput dataInput, int n, btc btc2) {
        btc2.es9(192L);
        int n2 = dataInput.readInt();
        btc2.es9(8 * n2);
        this.r5a = new byte[n2];
        dataInput.readFully(this.r5a);
    }

    @Override
    public byte ky0() {
        return 7;
    }

    @Override
    public String toString() {
        long l = a ^ 0x31D3CCC646EEL;
        return "[" + this.r5a.length + b;
    }

    @Override
    public gdw h33() {
        byte[] byArray = new byte[this.r5a.length];
        System.arraycopy(this.r5a, 0, byArray, 0, this.r5a.length);
        return new cny(byArray);
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = super.equals(object);
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw cny.a(oov2);
                    }
                    bl = Arrays.equals(this.r5a, ((cny)object).r5a);
                    break block4;
                }
                catch (oov oov3) {
                    throw cny.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.r5a);
    }

    public byte[] uov() {
        return this.r5a;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x68230F533FB6L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u001c\u00a2k>\u00ac\u00b3\u00a3\"".getBytes("ISO-8859-1"));
                b = cny.b(byArray3).intern();
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

    private static String b(byte[] byArray) {
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

