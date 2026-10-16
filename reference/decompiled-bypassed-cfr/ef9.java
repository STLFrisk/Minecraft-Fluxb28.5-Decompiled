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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ef9 {
    private TreeMap rx_;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ef9() {
        long l = a ^ 0xF6E238A24AEL;
        this.rx_ = new TreeMap();
        this.omr((String)((Object)ef9.a("j", (int)2834, (long)(0x2E4774313B2AE7E2L ^ l))), (String)((Object)ef9.a("j", (int)3038, (long)(0x4D1AF77B9172E728L ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)24556, (long)(0x604A9234C9183311L ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)28642, (long)(0x15CD38BF3677831AL ^ l))), (String)((Object)ef9.a("j", (int)13268, (long)(0x6A37478443AD5F21L ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)9527, (long)(0x172E3FBA5187C9CEL ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)30143, (long)(0x77C4A9EC2AEF9945L ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)25331, (long)(0x13E4E46EE3A88E12L ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)14530, (long)(0x5CEEFDE744CDD433L ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)11540, (long)(0x43E81101A3F6C1EAL ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)4095, (long)(0x630D9050D887E31DL ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)23287, (long)(0x11146ED7BE093604L ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)5817, (long)(0x53CD24C6D78A7A4EL ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)2683, (long)(0x5D6DAF9E8855E68FL ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)26239, (long)(0x3B142B830C5F8A9FL ^ l))), "3", ef9$nbw.rt_);
        this.omr((String)((Object)ef9.a("j", (int)16024, (long)(0x5B086222BAECD264L ^ l))), (String)((Object)ef9.a("j", (int)32308, (long)(0x55A9112D586E92CFL ^ l))), ef9$nbw.blk);
        this.omr((String)((Object)ef9.a("j", (int)31945, (long)(0x398B4342E691103BL ^ l))), (String)((Object)ef9.a("j", (int)12257, (long)(0x49283845FE56431EL ^ l))), ef9$nbw.blk);
    }

    public void omr(String string, String string2, ef9$nbw ef9$nbw) {
        this.rx_.put(string, new ef9$e53(string2, ef9$nbw));
    }

    /*
     * Unable to fully structure code
     */
    public void iqg(String var1_1, String var2_2) {
        block7: {
            block6: {
                var3_3 = t9d.b();
                var4_4 = (ef9$e53)this.rx_.get(var1_1);
                try {
                    v0 = var4_4;
                    if (var3_3 == 0) break block6;
                    if (v0 != null) {
                    }
                    ** GOTO lbl16
                }
                catch (oov v1) {
                    throw ef9.a(v1);
                }
                v0 = var4_4;
            }
            try {
                v0.ck4(var2_2);
                if (var3_3 != 0) break block7;
lbl16:
                // 2 sources

                this.omr(var1_1, var2_2, ef9$nbw.u8y);
            }
            catch (oov v2) {
                throw ef9.a(v2);
            }
        }
    }

    public String x3n(String string) {
        String string2;
        block4: {
            block3: {
                ef9$e53 ef9$e53;
                block2: {
                    int n = t9d.c();
                    ef9$e53 ef9$e532 = (ef9$e53)this.rx_.get(string);
                    try {
                        ef9$e53 = ef9$e532;
                        if (n != 0) break block2;
                        if (ef9$e53 == null) break block3;
                    }
                    catch (oov oov2) {
                        throw ef9.a(oov2);
                    }
                    ef9$e53 = ef9$e532;
                }
                string2 = ef9$e53.fzk();
                break block4;
            }
            string2 = "";
        }
        return string2;
    }

    public boolean _s0(String string) {
        boolean bl;
        block4: {
            block3: {
                ef9$e53 ef9$e53;
                block2: {
                    int n = t9d.b();
                    ef9$e53 ef9$e532 = (ef9$e53)this.rx_.get(string);
                    try {
                        ef9$e53 = ef9$e532;
                        if (n == 0) break block2;
                        if (ef9$e53 == null) break block3;
                    }
                    catch (oov oov2) {
                        throw ef9.a(oov2);
                    }
                    ef9$e53 = ef9$e532;
                }
                bl = ef9$e53.c8x();
                break block4;
            }
            bl = false;
        }
        return bl;
    }

    public int sh0(String string) {
        int n;
        block4: {
            block3: {
                ef9$e53 ef9$e53;
                block2: {
                    int n2 = t9d.c();
                    ef9$e53 ef9$e532 = (ef9$e53)this.rx_.get(string);
                    try {
                        ef9$e53 = ef9$e532;
                        if (n2 != 0) break block2;
                        if (ef9$e53 == null) break block3;
                    }
                    catch (oov oov2) {
                        throw ef9.a(oov2);
                    }
                    ef9$e53 = ef9$e532;
                }
                n = ef9$e53.k9u();
                break block4;
            }
            n = 0;
        }
        return n;
    }

    public bdo dve() {
        bdo bdo2;
        block4: {
            bdo bdo3 = new bdo();
            Iterator iterator = this.rx_.keySet().iterator();
            int n = t9d.c();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                ef9$e53 ef9$e53 = (ef9$e53)this.rx_.get(string);
                try {
                    bdo2 = bdo3;
                    if (n == 0) {
                        bdo2.rjq(string, ef9$e53.fzk());
                        if (n == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw ef9.a(oov2);
                }
            }
            bdo2 = bdo3;
        }
        return bdo2;
    }

    public void xki(bdo bdo2) {
        int n = t9d.c();
        for (String string : bdo2.bo9()) {
            String string2 = bdo2.u14(string);
            this.iqg(string, string2);
            if (n == 0) continue;
        }
    }

    public String[] pmi() {
        Set set = this.rx_.keySet();
        return set.toArray(new String[set.size()]);
    }

    public boolean xit(String string) {
        return this.rx_.containsKey(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t_x(String string, ef9$nbw ef9$nbw) {
        ef9$nbw ef9$nbw2;
        ef9$nbw ef9$nbw3;
        block9: {
            ef9$e53 ef9$e53;
            int n;
            block8: {
                n = t9d.b();
                ef9$e53 ef9$e532 = (ef9$e53)this.rx_.get(string);
                try {
                    ef9$e53 = ef9$e532;
                    if (n == 0) break block8;
                    if (ef9$e53 == null) return false;
                }
                catch (oov oov2) {
                    throw ef9.a(oov2);
                }
                ef9$e53 = ef9$e532;
            }
            try {
                try {
                    ef9$nbw3 = ef9$e53.yxm();
                    ef9$nbw2 = ef9$nbw;
                    if (n == 0) break block9;
                    if (ef9$nbw3 == ef9$nbw2) return true;
                }
                catch (oov oov3) {
                    throw ef9.a(oov3);
                }
                ef9$nbw3 = ef9$nbw;
                ef9$nbw2 = ef9$nbw.u8y;
            }
            catch (oov oov4) {
                throw ef9.a(oov4);
            }
        }
        try {
            if (ef9$nbw3 != ef9$nbw2) return false;
            return true;
        }
        catch (oov oov5) {
            throw ef9.a(oov5);
        }
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

                ef9.a = c.a(-6250593613867074025L, -6462150747052923009L, MethodHandles.lookup().lookupClass()).a(59807083160296L);
                ef9.d = new HashMap<K, V>(13);
                var0 = ef9.a ^ 33359279157370L;
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
                var9_3 = new String[19];
                var7_4 = 0;
                var6_5 = "\u00a2Ub\u0000\u00da\u00bf\u00e9}\u00f7\u0019\u00b9\u00b7\u008a\nq[C\u00e3\u008a\u000e\b\u008dRs\u0018`,\u00df>\u00bcB\u00dc\u00e2|\u008e\n\u00c7\u0084\u001c\u0011Q\u00ce\u00a4\u00cfCfY\u00b5\u00ad0_|\u00e3\u0080\u00b2\u00ce\u008a\u00f5P:\u00172\u0097\u001fw\u009aN|\u0017\u008fyy.\u00ec\u009a\u0093~\u0080\u008a\u00e8j<X\u0080\u0015*R\u00db\u0015\u00e4\u00b2\t~8@9\u000e\u00b1 \u009d7o\u00d8WgT,\u008e\u000e\u00e0\u008aR\u009d\u00e1\u0000\u00a4\u00d2\u00da\u0095\u00e7\u00f4\u00e6rRo\u00dee\u0004` n(\u00f0\u00d4\u008a8^\u00b2\u001ce\u00f3\u00eb\u00ae\u00ba\u00ee<\u00956Yn\u008a\u00b7\u00cd6\u00a4\u00fd\u001a\u00f9v\u007f\u00c1M0\u000b\u00c35\u00a8\u00e9\u001e\u00f23\u00d2\u0010\u00derNTw\u00dd\u00b2\u00c2\u00fd\u00b0s\u00b1\f\u0097|\u0097\u0010\u009f\u00c1\u0014(3~\u00bf\u00f9\u0007k\u00cf\u00d5\u001d{\u00d78(}\u0087\u00bf\u0099\u00ed\u0091^F%N\u009b\u00daN\u009f\u00a6\u0004\u0013\u00dbD\u00e4}>\u0094\u0088F\u00f2\u00e4H\u001d\u0095\u00bb\u0090\u008d\u00c4\u0013\u00ff\u00ca`\u0081\u0004\u0018\u0004\u00a7{\u00e2\u008c\u00abHG`\u009f/\u00ab\u00e7\u0015\u00aa`\u008cWL\u0094\u0085\u0013\u00d8\t\u0018Q\u00d6\u00f3\u008dY~\u00e4\u00b3\t\u00da\u00ab|\u0088\u008a|\u008d\u009e5\\\u00a5\u00b1\u0080l\r\u0018\u009b\u00ea{)\u00ce\u00b1C\u00bf\u00b0\u001ea\u00adJ\u0096\u00c0\u00c7.\u00e87>\u000bE9\u0087\u0010\u00c1\u00cb$\u00d3b\u00b9\u00dc\u00e4\u001e\u00ac\u00ae\u00c5\u00d0\u00b0\u00eeJ(\u00cd\u0096\u00f4\u001d\u00fb\u00abkww\u00da$A\u00a6\u0083\u001fMa\u001d\u00ec\u00a8\n4\u00d9B[\u00ed!\u00dd\u00c3\u008d(\u0093\u00d2\u00bcF\u00ae\u00d3\u00a2Aa \u0015\u0081\u00bby\u0097I\u00aa\u00992\u00fe\u00b8\u00f9\u00bc\u0007pez\u00f9\u008c\u0002<N\u001d\u00d0{e?\u0086\u0089&\u00f4C(\t(;\u0091\u00bc\u00e58\u001d\u00de\u00e9Q6J\u00b5QLXN\u00ede\u0091n\u00f1\u00f95l\u0087A;8|\u00bck\u009a\u008c\n\u00b8\u00de\u009d\u0085\u0010\u0013+\u00e0\u00e9\u0004;=\u00ba\u00fc\u00f1\u00c8\u00d3\u0082$\u00d0Q\u0018\u0089xB\u00e2\u0085\u00ec\u00ef&\u0096\u008e\u00f7o\u00f3Z\u00c1.0oxK\u00adH5\u008d";
                var8_6 = "\u00a2Ub\u0000\u00da\u00bf\u00e9}\u00f7\u0019\u00b9\u00b7\u008a\nq[C\u00e3\u008a\u000e\b\u008dRs\u0018`,\u00df>\u00bcB\u00dc\u00e2|\u008e\n\u00c7\u0084\u001c\u0011Q\u00ce\u00a4\u00cfCfY\u00b5\u00ad0_|\u00e3\u0080\u00b2\u00ce\u008a\u00f5P:\u00172\u0097\u001fw\u009aN|\u0017\u008fyy.\u00ec\u009a\u0093~\u0080\u008a\u00e8j<X\u0080\u0015*R\u00db\u0015\u00e4\u00b2\t~8@9\u000e\u00b1 \u009d7o\u00d8WgT,\u008e\u000e\u00e0\u008aR\u009d\u00e1\u0000\u00a4\u00d2\u00da\u0095\u00e7\u00f4\u00e6rRo\u00dee\u0004` n(\u00f0\u00d4\u008a8^\u00b2\u001ce\u00f3\u00eb\u00ae\u00ba\u00ee<\u00956Yn\u008a\u00b7\u00cd6\u00a4\u00fd\u001a\u00f9v\u007f\u00c1M0\u000b\u00c35\u00a8\u00e9\u001e\u00f23\u00d2\u0010\u00derNTw\u00dd\u00b2\u00c2\u00fd\u00b0s\u00b1\f\u0097|\u0097\u0010\u009f\u00c1\u0014(3~\u00bf\u00f9\u0007k\u00cf\u00d5\u001d{\u00d78(}\u0087\u00bf\u0099\u00ed\u0091^F%N\u009b\u00daN\u009f\u00a6\u0004\u0013\u00dbD\u00e4}>\u0094\u0088F\u00f2\u00e4H\u001d\u0095\u00bb\u0090\u008d\u00c4\u0013\u00ff\u00ca`\u0081\u0004\u0018\u0004\u00a7{\u00e2\u008c\u00abHG`\u009f/\u00ab\u00e7\u0015\u00aa`\u008cWL\u0094\u0085\u0013\u00d8\t\u0018Q\u00d6\u00f3\u008dY~\u00e4\u00b3\t\u00da\u00ab|\u0088\u008a|\u008d\u009e5\\\u00a5\u00b1\u0080l\r\u0018\u009b\u00ea{)\u00ce\u00b1C\u00bf\u00b0\u001ea\u00adJ\u0096\u00c0\u00c7.\u00e87>\u000bE9\u0087\u0010\u00c1\u00cb$\u00d3b\u00b9\u00dc\u00e4\u001e\u00ac\u00ae\u00c5\u00d0\u00b0\u00eeJ(\u00cd\u0096\u00f4\u001d\u00fb\u00abkww\u00da$A\u00a6\u0083\u001fMa\u001d\u00ec\u00a8\n4\u00d9B[\u00ed!\u00dd\u00c3\u008d(\u0093\u00d2\u00bcF\u00ae\u00d3\u00a2Aa \u0015\u0081\u00bby\u0097I\u00aa\u00992\u00fe\u00b8\u00f9\u00bc\u0007pez\u00f9\u008c\u0002<N\u001d\u00d0{e?\u0086\u0089&\u00f4C(\t(;\u0091\u00bc\u00e58\u001d\u00de\u00e9Q6J\u00b5QLXN\u00ede\u0091n\u00f1\u00f95l\u0087A;8|\u00bck\u009a\u008c\n\u00b8\u00de\u009d\u0085\u0010\u0013+\u00e0\u00e9\u0004;=\u00ba\u00fc\u00f1\u00c8\u00d3\u0082$\u00d0Q\u0018\u0089xB\u00e2\u0085\u00ec\u00ef&\u0096\u008e\u00f7o\u00f3Z\u00c1.0oxK\u00adH5\u008d".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = ef9.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00dc\u00d8\u001f\u00b2\u001a\u00d1\u00ea\u00bd\u0001\u00fc\n\u00011\u0007\u00f1}\u00b7\u00b2\u001d\u0080zw/\u00a1\u00e5\u0098`\u00c0N\u00c8\u00d1\u00ae(\u00e1\u001d\u00d7\u00ed\u00bdF\u00ebX\b`Le\u00d7\u0088\u0087\u00a3i{\u00922O*j\u00be\u00f5Mrn=\u00bf>nT\u001e\u00cb\u00ef\u0002\u00f6P ";
                    var8_6 = "\u00dc\u00d8\u001f\u00b2\u001a\u00d1\u00ea\u00bd\u0001\u00fc\n\u00011\u0007\u00f1}\u00b7\u00b2\u001d\u0080zw/\u00a1\u00e5\u0098`\u00c0N\u00c8\u00d1\u00ae(\u00e1\u001d\u00d7\u00ed\u00bdF\u00ebX\b`Le\u00d7\u0088\u0087\u00a3i{\u00922O*j\u00be\u00f5Mrn=\u00bf>nT\u001e\u00cb\u00ef\u0002\u00f6P ".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = ef9.a(var10_9).intern();
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
        ef9.b = var9_3;
        ef9.c = new String[19];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C3D;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ef9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            ef9.c[n2] = ef9.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ef9.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("ef9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ef9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

