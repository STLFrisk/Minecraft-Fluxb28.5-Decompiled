/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cu3
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x99A6BE0D328L;
        return cu3.b("o", (int)27886, (long)(0x29CAA2DF490EAFB1L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x76428778FAEL;
        return cu3.b("o", (int)24010, (long)(0x4008CB869A75C21BL ^ l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block84: {
            block82: {
                block83: {
                    block81: {
                        block79: {
                            block80: {
                                block77: {
                                    block78: {
                                        block76: {
                                            block75: {
                                                block73: {
                                                    block74: {
                                                        block72: {
                                                            block71: {
                                                                block66: {
                                                                    block67: {
                                                                        block68: {
                                                                            block86: {
                                                                                block85: {
                                                                                    var3_3 = cu3.a ^ 14954374178413L;
                                                                                    var5_4 = t9d.b();
                                                                                    try {
                                                                                        if (var2_2.length < 2) {
                                                                                            throw new w57((String)cu3.b("o", (int)10742, (long)(7104193708108980206L ^ var3_3)), new Object[0]);
                                                                                        }
                                                                                    }
                                                                                    catch (cco v0) {
                                                                                        throw cu3.a(v0);
                                                                                    }
                                                                                    var6_5 = (g_3)cu3.arm(var1_1, var2_2[0], g_3.class);
                                                                                    v1 = var2_2[1].equals(cu3.b("o", (int)30553, (long)(8424490796467601743L ^ var3_3)));
                                                                                    if (var5_4 == 0) ** GOTO lbl47
                                                                                    if (v1 == 0) break block66;
                                                                                    break block85;
                                                                                    catch (cco v2) {
                                                                                        throw cu3.a(v2);
                                                                                    }
                                                                                }
                                                                                v3 /* !! */  = var6_5;
                                                                                if (var5_4 == 0) break block67;
                                                                                break block86;
                                                                                catch (cco v4) {
                                                                                    throw cu3.a(v4);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block87: {
                                                                                    if (!v3 /* !! */ .g5i().isEmpty()) break block68;
                                                                                    break block87;
                                                                                    catch (cco v5) {
                                                                                        throw cu3.a(v5);
                                                                                    }
                                                                                }
                                                                                throw new uvb((String)cu3.b("o", (int)19882, (long)(7274033719964728250L ^ var3_3)), new Object[]{var6_5.noc()});
                                                                            }
                                                                            catch (cco v6) {
                                                                                throw cu3.a(v6);
                                                                            }
                                                                        }
                                                                        var6_5.ldj();
                                                                        v3 /* !! */  = var1_1;
                                                                    }
                                                                    cu3.wxl(v3 /* !! */ , this, (String)cu3.b("o", (int)4853, (long)(5648045191814849762L ^ var3_3)), new Object[]{var6_5.noc()});
                                                                    if (var5_4 != 0) break block84;
                                                                }
                                                                try {
                                                                    v1 = cu3.o_t(var2_2[1], 1);
lbl47:
                                                                    // 2 sources

                                                                    var7_6 = v1;
                                                                }
                                                                catch (cco var8_7) {
                                                                    block69: {
                                                                        block70: {
                                                                            var9_9 = mcs.znv(var2_2[1]);
                                                                            try {
                                                                                try {
                                                                                    v7 = var9_9;
                                                                                    if (var5_4 == 0) break block69;
                                                                                    if (v7 != null) break block70;
                                                                                }
                                                                                catch (cco v8) {
                                                                                    throw cu3.a(v8);
                                                                                }
                                                                                throw var8_7;
                                                                            }
                                                                            catch (cco v9) {
                                                                                throw cu3.a(v9);
                                                                            }
                                                                        }
                                                                        v7 = var9_9;
                                                                    }
                                                                    var7_6 = v7.zr9;
                                                                }
                                                                var8_8 = 600;
                                                                var9_10 = 30;
                                                                var10_11 = 0;
                                                                try {
                                                                    v10 = var7_6;
                                                                    if (var5_4 == 0) break block71;
                                                                    if (v10 >= 0) {
                                                                    }
                                                                    ** GOTO lbl223
                                                                }
                                                                catch (cco v11) {
                                                                    throw cu3.a(v11);
                                                                }
                                                                v10 = var7_6;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (v10 < mcs.ip9.length) {
                                                                            v12 = mcs.ip9[var7_6];
                                                                            if (var5_4 == 0) break block72;
                                                                        }
                                                                        ** GOTO lbl223
                                                                    }
                                                                    catch (cco v13) {
                                                                        throw cu3.a(v13);
                                                                    }
                                                                    if (v12 != null) {
                                                                    }
                                                                    ** GOTO lbl223
                                                                }
                                                                catch (cco v14) {
                                                                    throw cu3.a(v14);
                                                                }
                                                                v12 = mcs.ip9[var7_6];
                                                            }
                                                            catch (cco v15) {
                                                                throw cu3.a(v15);
                                                            }
                                                        }
                                                        var11_12 = v12;
                                                        try {
                                                            v16 = var2_2.length;
                                                            if (var5_4 == 0) break block73;
                                                            if (v16 >= 3 != 0) {
                                                            }
                                                            ** GOTO lbl128
                                                        }
                                                        catch (cco v17) {
                                                            throw cu3.a(v17);
                                                        }
                                                        var9_10 = cu3.fzm(var2_2[2], 0, 1000000);
                                                        try {
                                                            v18 = var11_12.jee();
                                                            if (var5_4 == 0) break block74;
                                                            if (v18 != 0) {
                                                            }
                                                            ** GOTO lbl120
                                                        }
                                                        catch (cco v19) {
                                                            throw cu3.a(v19);
                                                        }
                                                        var8_8 = var9_10;
                                                        try {
                                                            if (var5_4 != 0) break block75;
lbl120:
                                                            // 2 sources

                                                            v18 = var9_10 * 20;
                                                        }
                                                        catch (cco v20) {
                                                            throw cu3.a(v20);
                                                        }
                                                    }
                                                    var8_8 = v18;
                                                    try {
                                                        if (var5_4 != 0) break block75;
lbl128:
                                                        // 2 sources

                                                        v16 = var11_12.jee();
                                                    }
                                                    catch (cco v21) {
                                                        throw cu3.a(v21);
                                                    }
                                                }
                                                try {
                                                    if (var5_4 == 0) break block76;
                                                    if (!v16) break block75;
                                                }
                                                catch (cco v22) {
                                                    throw cu3.a(v22);
                                                }
                                                var8_8 = 1;
                                            }
                                            v16 = var2_2.length;
                                        }
                                        try {
                                            if (var5_4 == 0) break block77;
                                            if (v16 < 4 != 0) break block78;
                                        }
                                        catch (cco v23) {
                                            throw cu3.a(v23);
                                        }
                                        var10_11 = cu3.fzm(var2_2[3], 0, 255);
                                    }
                                    v16 = true;
                                }
                                var12_13 = v16;
                                try {
                                    try {
                                        try {
                                            v24 = var2_2.length;
                                            if (var5_4 == 0) break block79;
                                            if (v24 < 5) break block80;
                                        }
                                        catch (cco v25) {
                                            throw cu3.a(v25);
                                        }
                                        v24 = (int)cu3.b("o", (int)6162, (long)(7453416685034384897L ^ var3_3)).equalsIgnoreCase(var2_2[4]);
                                        if (var5_4 == 0) break block79;
                                    }
                                    catch (cco v26) {
                                        throw cu3.a(v26);
                                    }
                                    if (v24 == 0) break block80;
                                }
                                catch (cco v27) {
                                    throw cu3.a(v27);
                                }
                                var12_13 = false;
                            }
                            v24 = var9_10;
                        }
                        try {
                            if (var5_4 == 0) break block81;
                            if (v24 > 0) {
                            }
                            ** GOTO lbl190
                        }
                        catch (cco v28) {
                            throw cu3.a(v28);
                        }
                        var13_14 = new sdj(var7_6, var8_8, var10_11, false, var12_13);
                        try {
                            try {
                                var6_5.gmn(var13_14);
                                cu3.wxl(var1_1, this, (String)cu3.b("o", (int)19251, (long)(4748669356589022498L ^ var3_3)), new Object[]{new hsu(var13_14.imc(), new Object[0]), var7_6, var10_11, var6_5.noc(), var9_10});
                                if (var5_4 != 0) break block82;
lbl190:
                                // 2 sources

                                v29 = var6_5;
                                v30 = var7_6;
                                if (var5_4 == 0) break block83;
                            }
                            catch (cco v31) {
                                throw cu3.a(v31);
                            }
                            v24 = (int)v29.vx3(v30);
                        }
                        catch (cco v32) {
                            throw cu3.a(v32);
                        }
                    }
                    try {
                        if (v24 != 0) {
                            v29 = var6_5;
                            v30 = var7_6;
                        }
                        ** GOTO lbl216
                    }
                    catch (cco v33) {
                        throw cu3.a(v33);
                    }
                }
                try {
                    v29.zu8(v30);
                    cu3.wxl(var1_1, this, (String)cu3.b("o", (int)13210, (long)(2733080596939572609L ^ var3_3)), new Object[]{new hsu(var11_12.zs1(), new Object[0]), var6_5.noc()});
                    if (var5_4 != 0) break block82;
lbl216:
                    // 2 sources

                    throw new uvb((String)cu3.b("o", (int)5281, (long)(7109431481116893880L ^ var3_3)), new Object[]{new hsu(var11_12.zs1(), new Object[0]), var6_5.noc()});
                }
                catch (cco v34) {
                    throw cu3.a(v34);
                }
            }
            try {
                if (var5_4 != 0) break block84;
lbl223:
                // 4 sources

                throw new cco((String)cu3.b("o", (int)9916, (long)(2372360554515173536L ^ var3_3)), new Object[]{var7_6});
            }
            catch (cco v35) {
                throw cu3.a(v35);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        String[] stringArray2;
        List list;
        long l;
        block14: {
            int n;
            int n2;
            block12: {
                int n3;
                block13: {
                    block10: {
                        block11: {
                            l = a ^ 0x216F546C7B9DL;
                            n3 = t9d.c();
                            try {
                                try {
                                    n2 = stringArray.length;
                                    n = 1;
                                    if (n3 != 0) break block10;
                                    if (n2 != n) break block11;
                                }
                                catch (oov oov2) {
                                    throw cu3.a(oov2);
                                }
                                list = cu3.cqo(stringArray, this.e4b());
                                return list;
                            }
                            catch (oov oov3) {
                                throw cu3.a(oov3);
                            }
                        }
                        n2 = stringArray.length;
                        n = 2;
                    }
                    try {
                        try {
                            if (n3 != 0) break block12;
                            if (n2 != n) break block13;
                        }
                        catch (oov oov4) {
                            throw cu3.a(oov4);
                        }
                        list = cu3.d79(stringArray, mcs.byl());
                        return list;
                    }
                    catch (oov oov5) {
                        throw cu3.a(oov5);
                    }
                }
                try {
                    stringArray2 = stringArray;
                    if (n3 != 0) break block14;
                    n2 = stringArray2.length;
                    n = 5;
                }
                catch (oov oov6) {
                    throw cu3.a(oov6);
                }
            }
            if (n2 != n) return null;
            stringArray2 = stringArray;
        }
        String[] stringArray3 = new String[2];
        stringArray3[0] = cu3.b("o", (int)14881, (long)(0x9F274991233D1C4L ^ l));
        stringArray3[1] = cu3.b("o", (int)24893, (long)(0x2BE84CFEE5C00AD9L ^ l));
        list = cu3.cqo(stringArray2, stringArray3);
        return list;
    }

    public String[] e4b() {
        return vr1._0v().p14();
    }

    @Override
    public boolean mp9(String[] stringArray, int n) {
        boolean bl;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    bl = n;
                    if (n2 == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw cu3.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                cu3.a = c.a(-7072784373447614573L, -5792505513085695229L, MethodHandles.lookup().lookupClass()).a(220493810334898L);
                cu3.h = new HashMap<K, V>(13);
                var0 = cu3.a ^ 43209273187558L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u001a(\u009d\u00a7\u00fb\u0080\u00a1n9\u0083\u00c2c\u0090\u0081\u0086\u00b9\u00ac\u00f9\u00e3)b\u00fe\u00daEz0\u0004\u00ebF\u001e{\u00979\u00f9\u00f6\u00d9|y\u0083\u0002;wm\u008f\u00c8R\u00e1p#\u00f9\\Im\u0096\u00c0\u00a8\u0088\u001d\u00e4\u00abW2\u00fb^(\u00b3\u0016\u0011\u0099\u00e3\u00f93_\u0090\u0013\u00de\u00baze\u00f4d\u00d0g}\u00d7\u00af8/M\u00cb[\n\u00d8\u00c4\u00d5\u00fc.\u00a4\u0000\u00dbyY\u00a6D\u0019(\u0006<\u0084x+\u00c0\u00886\u00ec\u009cPc$/b\u00d9\u00a7\u0099i\u00b7q\u00e0;\u00ed\u00d1Rqo\u0091\u00b7]\u0005V\u00a0\u00b8\u00a6\u00ac\\\u00a3\u00aa\u0010\"\u00cc\u00c2v\u009c\u0010\\\u00ae%\u00fb\u0088{\u00a2\u0086\u0086\u000b\u0010\u00e3G\u0002y\u00c3\u00d4l\u0002R\u00a9N.Ag\u00b7#\u0010v[\u00e5\u00e0\u00aa\u00ae7\u00a8L\u00ba\u00ce\u009fO.3\u008a\u0010\u008d\u0018\u00c2\u00aa<\u008a\u0012\u00b4\u008fO5\u00e1\u00aa\u00af\u00f2\u00a6@)\u00ff\u00eb\u001bH`\u00e81\u00e4\u009f\u0083!Hs/\u0093\u0096\u00ca\u00b5R\u0094H\u000f\u0097$\u00b9%v\u00ae|\u0080\u00d6\u0087\u00e7I\u009fK\u001ao\u00c42\u00bbl\u00f0\u00dc\u001d\u00ffk\u00c9\u001d\t\u0019\u0018\u0007\u008dS\u00d4\u00d8\u00a7bD\u00fa\u00f0^(6\u00ba\u0085ybiU\u0098\u00c6\u00f6\u00da-&Z\u0085\tX-8\u00d1\u00e8\u00ff\u00b6\u0094\u0007B\tdq\u00dbY\u00db\u00e2'\u0098\u0093\u0013\u0086\u00181@R\u000e\u008a\u00fd\u009d\u00af\u0080\u00f1a\u00de\u0080+PN`\u00191|^\u008a\u008fV\u00f6\u00dbS}M\u0099\u00d6\u00ecy\u008dX\u00fa\u00c8\u0083\u00e7(\u00a7\u0007`\n\u00dc\u0098\u00cef\u00d6K\u00daI\u007f]\u00d46~e\u00a9\u008e\u00c5c\u008c\u00fa\u00db5\u0010\u00f3;\u000e\u00e8\u00dc\u00eaN\u00c9\u00ed\u00a6\u00b0\u0092\u0014\u00ab\u00b7\u0099";
                var8_6 = "\u001a(\u009d\u00a7\u00fb\u0080\u00a1n9\u0083\u00c2c\u0090\u0081\u0086\u00b9\u00ac\u00f9\u00e3)b\u00fe\u00daEz0\u0004\u00ebF\u001e{\u00979\u00f9\u00f6\u00d9|y\u0083\u0002;wm\u008f\u00c8R\u00e1p#\u00f9\\Im\u0096\u00c0\u00a8\u0088\u001d\u00e4\u00abW2\u00fb^(\u00b3\u0016\u0011\u0099\u00e3\u00f93_\u0090\u0013\u00de\u00baze\u00f4d\u00d0g}\u00d7\u00af8/M\u00cb[\n\u00d8\u00c4\u00d5\u00fc.\u00a4\u0000\u00dbyY\u00a6D\u0019(\u0006<\u0084x+\u00c0\u00886\u00ec\u009cPc$/b\u00d9\u00a7\u0099i\u00b7q\u00e0;\u00ed\u00d1Rqo\u0091\u00b7]\u0005V\u00a0\u00b8\u00a6\u00ac\\\u00a3\u00aa\u0010\"\u00cc\u00c2v\u009c\u0010\\\u00ae%\u00fb\u0088{\u00a2\u0086\u0086\u000b\u0010\u00e3G\u0002y\u00c3\u00d4l\u0002R\u00a9N.Ag\u00b7#\u0010v[\u00e5\u00e0\u00aa\u00ae7\u00a8L\u00ba\u00ce\u009fO.3\u008a\u0010\u008d\u0018\u00c2\u00aa<\u008a\u0012\u00b4\u008fO5\u00e1\u00aa\u00af\u00f2\u00a6@)\u00ff\u00eb\u001bH`\u00e81\u00e4\u009f\u0083!Hs/\u0093\u0096\u00ca\u00b5R\u0094H\u000f\u0097$\u00b9%v\u00ae|\u0080\u00d6\u0087\u00e7I\u009fK\u001ao\u00c42\u00bbl\u00f0\u00dc\u001d\u00ffk\u00c9\u001d\t\u0019\u0018\u0007\u008dS\u00d4\u00d8\u00a7bD\u00fa\u00f0^(6\u00ba\u0085ybiU\u0098\u00c6\u00f6\u00da-&Z\u0085\tX-8\u00d1\u00e8\u00ff\u00b6\u0094\u0007B\tdq\u00dbY\u00db\u00e2'\u0098\u0093\u0013\u0086\u00181@R\u000e\u008a\u00fd\u009d\u00af\u0080\u00f1a\u00de\u0080+PN`\u00191|^\u008a\u008fV\u00f6\u00dbS}M\u0099\u00d6\u00ecy\u008dX\u00fa\u00c8\u0083\u00e7(\u00a7\u0007`\n\u00dc\u0098\u00cef\u00d6K\u00daI\u007f]\u00d46~e\u00a9\u008e\u00c5c\u008c\u00fa\u00db5\u0010\u00f3;\u000e\u00e8\u00dc\u00eaN\u00c9\u00ed\u00a6\u00b0\u0092\u0014\u00ab\u00b7\u0099".length();
                var5_7 = 64;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = cu3.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0003Gf\u00ef\u00e3[\t:}t\u0019\u00dbd\u00b7\u00ce\u0002;8\u00bb\u00c0\u009c\u00dcu\u00feKi\r\u00bf1\u00e5\u00adE2\u0098\u00b1y\u00d1D\u00ce\u00d4v\u00e8\u00d4\u0089\u0083j\u00b6\u0098\u00e5\b\u00a50+\u00dc\u00c8x8H\u0015\u00e4\u00e6\u00f6q\u00a6rc\u0012\u0080L\u00cd\u0088\u00d8M\u00ab\u00cbf\u00fc'\u00011s\u00f5\u0013\u00af\u001b\u00e6<\u000bhOX?\u00fd\u00bf\u0019\u00b1\u00f55\u0093\u00de\u00eb\u001d\u00ed\u0097\u008bQ\u0090.\u0016O\u0019%P";
                    var8_6 = "\u0003Gf\u00ef\u00e3[\t:}t\u0019\u00dbd\u00b7\u00ce\u0002;8\u00bb\u00c0\u009c\u00dcu\u00feKi\r\u00bf1\u00e5\u00adE2\u0098\u00b1y\u00d1D\u00ce\u00d4v\u00e8\u00d4\u0089\u0083j\u00b6\u0098\u00e5\b\u00a50+\u00dc\u00c8x8H\u0015\u00e4\u00e6\u00f6q\u00a6rc\u0012\u0080L\u00cd\u0088\u00d8M\u00ab\u00cbf\u00fc'\u00011s\u00f5\u0013\u00af\u001b\u00e6<\u000bhOX?\u00fd\u00bf\u0019\u00b1\u00f55\u0093\u00de\u00eb\u001d\u00ed\u0097\u008bQ\u0090.\u0016O\u0019%P".length();
                    var5_7 = 56;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = cu3.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        cu3.c = var9_3;
        cu3.g = new String[13];
    }

    private static Exception a(Exception exception) {
        return exception;
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A4E;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("cu3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            cu3.g[n2] = cu3.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cu3.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("cu3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cu3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

