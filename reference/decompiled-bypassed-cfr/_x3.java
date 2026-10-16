/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _x3 {
    public static ArrayList wig;
    private static final long a;
    private static final String b;

    public static dzm xki(String string) {
        int n = t9d.b();
        for (dzm dzm2 : wig) {
            block6: {
                dzm dzm3;
                block5: {
                    try {
                        try {
                            dzm3 = dzm2;
                            if (n == 0) break block5;
                            if (!dzm3.o7h().equalsIgnoreCase(string)) break block6;
                        }
                        catch (oov oov2) {
                            throw _x3.a(oov2);
                        }
                        dzm3 = dzm2;
                    }
                    catch (oov oov3) {
                        throw _x3.a(oov3);
                    }
                }
                return dzm3;
            }
            if (n != 0) continue;
        }
        return null;
    }

    public static dzm sbx(String string) {
        long l = a ^ 0x79096C9ED57AL;
        int n = t9d.c();
        for (dzm dzm2 : wig) {
            try {
                if (string.toLowerCase().equals(dzm2.l08().toLowerCase() + b + dzm2.o7h().toLowerCase())) {
                    return dzm2;
                }
            }
            catch (oov oov2) {
                throw _x3.a(oov2);
            }
            if (n == 0) continue;
        }
        return null;
    }

    public static void d7l() {
    }

    public static List faw(String string) {
        ArrayList<dzm> arrayList = new ArrayList<dzm>();
        Iterator iterator = wig.iterator();
        int n = t9d.c();
        while (iterator.hasNext()) {
            block5: {
                dzm dzm2 = (dzm)iterator.next();
                try {
                    boolean bl;
                    try {
                        bl = dzm2.l08().equalsIgnoreCase(string);
                        if (n != 0 || !bl) break block5;
                    }
                    catch (oov oov2) {
                        throw _x3.a(oov2);
                    }
                    bl = arrayList.add(dzm2);
                }
                catch (oov oov3) {
                    throw _x3.a(oov3);
                }
            }
            if (n == 0) continue;
        }
        return arrayList;
    }

    public static dzm fv0(String string, String string2) {
        int n = t9d.c();
        for (dzm dzm2 : wig) {
            block10: {
                dzm dzm3;
                block11: {
                    boolean bl;
                    block9: {
                        try {
                            try {
                                try {
                                    bl = dzm2.l08().equalsIgnoreCase(string);
                                    if (n != 0) break block9;
                                    if (!bl) break block10;
                                }
                                catch (oov oov2) {
                                    throw _x3.a(oov2);
                                }
                                dzm3 = dzm2;
                                if (n != 0) break block11;
                            }
                            catch (oov oov3) {
                                throw _x3.a(oov3);
                            }
                            bl = dzm3.o7h().equals(string2);
                        }
                        catch (oov oov4) {
                            throw _x3.a(oov4);
                        }
                    }
                    if (!bl) break block10;
                    dzm3 = dzm2;
                }
                return dzm3;
            }
            if (n == 0) continue;
        }
        return null;
    }

    public static List hgl(String string) {
        ArrayList<dzm> arrayList = new ArrayList<dzm>();
        Iterator iterator = wig.iterator();
        int n = t9d.c();
        while (iterator.hasNext()) {
            block5: {
                dzm dzm2 = (dzm)iterator.next();
                try {
                    boolean bl;
                    try {
                        bl = dzm2.l08().equals(string);
                        if (n != 0 || !bl) break block5;
                    }
                    catch (oov oov2) {
                        throw _x3.a(oov2);
                    }
                    bl = arrayList.add(dzm2);
                }
                catch (oov oov3) {
                    throw _x3.a(oov3);
                }
            }
            if (n == 0) continue;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(5835994299124956870L, 7308642608608209740L, MethodHandles.lookup().lookupClass()).a(253934133698783L);
        long l = a ^ 0x289835F6A256L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("e\u0019W\u001c$\u0002.\u008c".getBytes("ISO-8859-1"));
                b = _x3.a(byArray3).intern();
                wig = new ArrayList();
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

