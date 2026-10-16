/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _h2
extends Logger {
    private final /* synthetic */ org.apache.logging.log4j.Logger u3f;
    private static final long a = c.a(8302705637926717851L, -8935032207508999849L, MethodHandles.lookup().lookupClass()).a(102121988380049L);
    private static final String b;

    public _h2(org.apache.logging.log4j.Logger logger) {
        long l = a ^ 0x372F7483991L;
        super(b, null);
        this.u3f = logger;
    }

    @Override
    public void log(LogRecord logRecord) {
        this.log(logRecord.getLevel(), logRecord.getMessage());
    }

    @Override
    public void log(Level level, String string) {
        block24: {
            Level level2;
            Level level3;
            int n;
            block27: {
                block25: {
                    block22: {
                        n = t9d.c();
                        try {
                            block23: {
                                try {
                                    try {
                                        level3 = level;
                                        level2 = Level.FINE;
                                        if (n != 0) break block22;
                                        if (level3 != level2) break block23;
                                    }
                                    catch (oov oov2) {
                                        throw _h2.a(oov2);
                                    }
                                    this.u3f.debug(string);
                                    if (n == 0) break block24;
                                }
                                catch (oov oov3) {
                                    throw _h2.a(oov3);
                                }
                            }
                            level3 = level;
                            level2 = Level.WARNING;
                        }
                        catch (oov oov4) {
                            throw _h2.a(oov4);
                        }
                    }
                    try {
                        block26: {
                            try {
                                try {
                                    if (n != 0) break block25;
                                    if (level3 != level2) break block26;
                                }
                                catch (oov oov5) {
                                    throw _h2.a(oov5);
                                }
                                this.u3f.warn(string);
                                if (n == 0) break block24;
                            }
                            catch (oov oov6) {
                                throw _h2.a(oov6);
                            }
                        }
                        level3 = level;
                        level2 = Level.SEVERE;
                    }
                    catch (oov oov7) {
                        throw _h2.a(oov7);
                    }
                }
                try {
                    block28: {
                        try {
                            try {
                                if (n != 0) break block27;
                                if (level3 != level2) break block28;
                            }
                            catch (oov oov8) {
                                throw _h2.a(oov8);
                            }
                            this.u3f.error(string);
                            if (n == 0) break block24;
                        }
                        catch (oov oov9) {
                            throw _h2.a(oov9);
                        }
                    }
                    level3 = level;
                    level2 = Level.INFO;
                }
                catch (oov oov10) {
                    throw _h2.a(oov10);
                }
            }
            try {
                block29: {
                    try {
                        if (level3 != level2) break block29;
                        this.u3f.info(string);
                        if (n == 0) break block24;
                    }
                    catch (oov oov11) {
                        throw _h2.a(oov11);
                    }
                }
                this.u3f.trace(string);
            }
            catch (oov oov12) {
                throw _h2.a(oov12);
            }
        }
    }

    @Override
    public void log(Level level, String string, Object object) {
        block24: {
            Level level2;
            Level level3;
            int n;
            block27: {
                block25: {
                    block22: {
                        n = t9d.b();
                        try {
                            block23: {
                                try {
                                    try {
                                        level3 = level;
                                        level2 = Level.FINE;
                                        if (n == 0) break block22;
                                        if (level3 != level2) break block23;
                                    }
                                    catch (oov oov2) {
                                        throw _h2.a(oov2);
                                    }
                                    this.u3f.debug(string, object);
                                    if (n != 0) break block24;
                                }
                                catch (oov oov3) {
                                    throw _h2.a(oov3);
                                }
                            }
                            level3 = level;
                            level2 = Level.WARNING;
                        }
                        catch (oov oov4) {
                            throw _h2.a(oov4);
                        }
                    }
                    try {
                        block26: {
                            try {
                                try {
                                    if (n == 0) break block25;
                                    if (level3 != level2) break block26;
                                }
                                catch (oov oov5) {
                                    throw _h2.a(oov5);
                                }
                                this.u3f.warn(string, object);
                                if (n != 0) break block24;
                            }
                            catch (oov oov6) {
                                throw _h2.a(oov6);
                            }
                        }
                        level3 = level;
                        level2 = Level.SEVERE;
                    }
                    catch (oov oov7) {
                        throw _h2.a(oov7);
                    }
                }
                try {
                    block28: {
                        try {
                            try {
                                if (n == 0) break block27;
                                if (level3 != level2) break block28;
                            }
                            catch (oov oov8) {
                                throw _h2.a(oov8);
                            }
                            this.u3f.error(string, object);
                            if (n != 0) break block24;
                        }
                        catch (oov oov9) {
                            throw _h2.a(oov9);
                        }
                    }
                    level3 = level;
                    level2 = Level.INFO;
                }
                catch (oov oov10) {
                    throw _h2.a(oov10);
                }
            }
            try {
                block29: {
                    try {
                        if (level3 != level2) break block29;
                        this.u3f.info(string, object);
                        if (n != 0) break block24;
                    }
                    catch (oov oov11) {
                        throw _h2.a(oov11);
                    }
                }
                this.u3f.trace(string, object);
            }
            catch (oov oov12) {
                throw _h2.a(oov12);
            }
        }
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        this.log(level, MessageFormat.format(string, objectArray));
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        block24: {
            Level level2;
            Level level3;
            int n;
            block27: {
                block25: {
                    block22: {
                        n = t9d.c();
                        try {
                            block23: {
                                try {
                                    try {
                                        level3 = level;
                                        level2 = Level.FINE;
                                        if (n != 0) break block22;
                                        if (level3 != level2) break block23;
                                    }
                                    catch (oov oov2) {
                                        throw _h2.a(oov2);
                                    }
                                    this.u3f.debug(string, throwable);
                                    if (n == 0) break block24;
                                }
                                catch (oov oov3) {
                                    throw _h2.a(oov3);
                                }
                            }
                            level3 = level;
                            level2 = Level.WARNING;
                        }
                        catch (oov oov4) {
                            throw _h2.a(oov4);
                        }
                    }
                    try {
                        block26: {
                            try {
                                try {
                                    if (n != 0) break block25;
                                    if (level3 != level2) break block26;
                                }
                                catch (oov oov5) {
                                    throw _h2.a(oov5);
                                }
                                this.u3f.warn(string, throwable);
                                if (n == 0) break block24;
                            }
                            catch (oov oov6) {
                                throw _h2.a(oov6);
                            }
                        }
                        level3 = level;
                        level2 = Level.SEVERE;
                    }
                    catch (oov oov7) {
                        throw _h2.a(oov7);
                    }
                }
                try {
                    block28: {
                        try {
                            try {
                                if (n != 0) break block27;
                                if (level3 != level2) break block28;
                            }
                            catch (oov oov8) {
                                throw _h2.a(oov8);
                            }
                            this.u3f.error(string, throwable);
                            if (n == 0) break block24;
                        }
                        catch (oov oov9) {
                            throw _h2.a(oov9);
                        }
                    }
                    level3 = level;
                    level2 = Level.INFO;
                }
                catch (oov oov10) {
                    throw _h2.a(oov10);
                }
            }
            try {
                block29: {
                    try {
                        if (level3 != level2) break block29;
                        this.u3f.info(string, throwable);
                        if (n == 0) break block24;
                    }
                    catch (oov oov11) {
                        throw _h2.a(oov11);
                    }
                }
                this.u3f.trace(string, throwable);
            }
            catch (oov oov12) {
                throw _h2.a(oov12);
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
        long l = a ^ 0x4E4946E76E73L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00a85w|lZ\u00e0\u0011".getBytes("ISO-8859-1"));
                b = _h2.a(byArray3).intern();
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

