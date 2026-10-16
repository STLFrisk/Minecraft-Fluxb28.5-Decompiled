/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d9p
extends so9 {
    private static final /* synthetic */ gdz rqz;
    private static final /* synthetic */ gdz rfa;
    private static final /* synthetic */ gdz rj3;
    private static final /* synthetic */ gdz cox;

    public d9p(hr_ hr_2, g6r g6r2, float f) {
        super(hr_2, g6r2, f);
    }

    /*
     * Exception decompiling
     */
    public gdz e3r(hu3 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void ar7(hu3 hu32, float f) {
        try {
            super.e2w(hu32, f);
            if (hu32.j1j()) {
                hzu.syc(0.8f, 0.8f, 0.8f);
            }
        }
        catch (oov oov2) {
            throw d9p.a(oov2);
        }
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.ar7((hu3)g_32, f);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.e3r((hu3)i2h2);
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

                var10 = c.a(7371618715140482491L, -8827833080422906290L, MethodHandles.lookup().lookupClass()).a(183021915639512L) ^ 56485867579201L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var10 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var10 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new String[4];
                var6_4 = 0;
                var5_5 = "P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004G\u008c.4\u00d5\u00f5\u00ac\u00db\u0011.\u00ac\u00c2\u00d0\u00f5\u00a48\u0018 P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004G\u0019\u00c6\u00d5\u0095t.\n\u0096\u00c0R\u009d\u001b3{2\u00fe";
                var7_6 = "P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004G\u008c.4\u00d5\u00f5\u00ac\u00db\u0011.\u00ac\u00c2\u00d0\u00f5\u00a48\u0018 P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004G\u0019\u00c6\u00d5\u0095t.\n\u0096\u00c0R\u009d\u001b3{2\u00fe".length();
                var4_7 = 32;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = d9p.c(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004G\u0084:I\u0017k\u0097,\u00f21\u00fct\u00d9\fLd\u00e7 P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004Gm\u00d7\u00e2\u0016\u0086\u000e\u00cc\u001c\u00e8\u0088\u00cc\u00ec\r\u00f19M";
                    var7_6 = "P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004G\u0084:I\u0017k\u0097,\u00f21\u00fct\u00d9\fLd\u00e7 P\u00b0\u0095\u00f9\u009f\u009d\u0011bmE\u008e\u008a\u0096\u00c3\u0004Gm\u00d7\u00e2\u0016\u0086\u000e\u00cc\u001c\u00e8\u0088\u00cc\u00ec\r\u00f19M".length();
                    var4_7 = 32;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = d9p.c(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var9_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        var0_10 = var8_3;
        d9p.rqz = new gdz(var0_10[1]);
        d9p.rfa = new gdz(var0_10[3]);
        d9p.rj3 = new gdz(var0_10[2]);
        d9p.cox = new gdz(var0_10[0]);
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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

