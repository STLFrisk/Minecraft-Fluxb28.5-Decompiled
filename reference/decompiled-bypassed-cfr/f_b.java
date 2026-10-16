/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f_b
extends e0x {
    public static final qx_ ibr;

    public f_b() {
        super(p3y.f20);
        this.y8l(this._8_.c32().zvi(ibr, (Comparable)((Object)vt2.z9q)));
        this.i3l(uja.qqf);
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        this.c7i(t9d2, mew2);
        return super.m__(t9d2, mew2, zfz2);
    }

    @Override
    public nh4 j54(t9d t9d2, mew mew2) {
        this.c7i(t9d2, mew2);
        return super.j54(t9d2, mew2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void c7i(m5n var1_1, mew var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block14: {
            e0x e0x2;
            block17: {
                block18: {
                    boolean bl2;
                    block15: {
                        int n;
                        block16: {
                            block12: {
                                block13: {
                                    n = t9d.c();
                                    try {
                                        try {
                                            bl2 = t9d2.getBlockState(mew2.y8e()).r_y().y0n();
                                            if (n != 0) break block12;
                                            if (!bl2) break block13;
                                        }
                                        catch (oov oov2) {
                                            throw f_b.a(oov2);
                                        }
                                        bl = true;
                                        break block14;
                                    }
                                    catch (oov oov3) {
                                        throw f_b.a(oov3);
                                    }
                                }
                                bl2 = t9d2.getBlockState(mew2.o_8()).r_y().y0n();
                            }
                            try {
                                try {
                                    if (n != 0) break block15;
                                    if (!bl2) break block16;
                                }
                                catch (oov oov4) {
                                    throw f_b.a(oov4);
                                }
                                bl = true;
                                break block14;
                            }
                            catch (oov oov5) {
                                throw f_b.a(oov5);
                            }
                        }
                        try {
                            e0x2 = t9d2.getBlockState(mew2.idu()).r_y();
                            if (n != 0) break block17;
                            bl2 = e0x2.y0n();
                        }
                        catch (oov oov6) {
                            throw f_b.a(oov6);
                        }
                    }
                    try {
                        if (!bl2) break block18;
                        bl = true;
                        break block14;
                    }
                    catch (oov oov7) {
                        throw f_b.a(oov7);
                    }
                }
                e0x2 = t9d2.getBlockState(mew2.z6x()).r_y();
            }
            bl = e0x2.y0n();
        }
        return bl;
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        f_b f_b2;
        block18: {
            int n2;
            block16: {
                f_b f_b3;
                block17: {
                    boolean bl;
                    block15: {
                        n2 = t9d.b();
                        try {
                            try {
                                try {
                                    bl = vt22.e30().pyt();
                                    if (n2 == 0) break block15;
                                    if (!bl) break block16;
                                }
                                catch (oov oov2) {
                                    throw f_b.a(oov2);
                                }
                                f_b3 = this;
                                if (n2 == 0) break block17;
                            }
                            catch (oov oov3) {
                                throw f_b.a(oov3);
                            }
                            bl = f_b3.v61(t9d2, mew2, vt22);
                        }
                        catch (oov oov4) {
                            throw f_b.a(oov4);
                        }
                    }
                    if (!bl) break block16;
                    f_b3 = this;
                }
                return f_b3.l4i().zvi(ibr, (Comparable)((Object)vt22));
            }
            for (vt2 vt23 : vt2$unz.fzl) {
                block20: {
                    f_b f_b4;
                    block19: {
                        try {
                            try {
                                try {
                                    f_b2 = this;
                                    if (n2 == 0) break block18;
                                    if (n2 == 0) break block19;
                                }
                                catch (oov oov5) {
                                    throw f_b.a(oov5);
                                }
                                if (!f_b2.v61(t9d2, mew2, vt23)) break block20;
                            }
                            catch (oov oov6) {
                                throw f_b.a(oov6);
                            }
                            f_b4 = this;
                        }
                        catch (oov oov7) {
                            throw f_b.a(oov7);
                        }
                    }
                    return f_b4.l4i().zvi(ibr, (Comparable)((Object)vt23));
                }
                if (n2 != 0) continue;
            }
            f_b2 = this;
        }
        return f_b2.l4i();
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        mew mew3;
        t9d t9d3;
        f_b f_b2;
        block4: {
            block5: {
                int n = t9d.c();
                vt2 vt22 = (vt2)((Object)zfz2.dil(ibr));
                try {
                    try {
                        f_b2 = this;
                        t9d3 = t9d2;
                        mew3 = mew2;
                        if (n != 0) break block4;
                        if (f_b2.v61(t9d3, mew3, vt22)) break block5;
                    }
                    catch (oov oov2) {
                        throw f_b.a(oov2);
                    }
                    this.lf0(t9d2, mew2, zfz2, 0);
                    t9d2.i6x(mew2);
                }
                catch (oov oov3) {
                    throw f_b.a(oov3);
                }
            }
            f_b2 = this;
            t9d3 = t9d2;
            mew3 = mew2;
        }
        super.z3l(t9d3, mew3, zfz2, e0x2);
    }

    public boolean v61(t9d t9d2, mew mew2, vt2 vt22) {
        return t9d2.getBlockState(mew2.offset(vt22.b4b())).r_y().y0n();
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    @Override
    public zfz kig(int n) {
        vt2 vt22;
        block5: {
            vt2 vt23;
            block4: {
                int n2 = t9d.b();
                vt22 = vt2.jw6(n);
                try {
                    try {
                        vt23 = vt22;
                        if (n2 == 0) break block4;
                        if (vt23.e30() != vt2$y0s.abn) break block5;
                    }
                    catch (oov oov2) {
                        throw f_b.a(oov2);
                    }
                    vt23 = vt2.z9q;
                }
                catch (oov oov3) {
                    throw f_b.a(oov3);
                }
            }
            vt22 = vt23;
        }
        return this.l4i().zvi(ibr, (Comparable)((Object)vt22));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((vt2)((Object)zfz2.dil(ibr))).c3s();
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{ibr});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(9216265114058385519L, -8593603982357879382L, MethodHandles.lookup().lookupClass()).a(184083060581131L) ^ 0x21EB3ECD9A20L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ba\u0091\u000e\u00ec\u00c3U<y".getBytes("ISO-8859-1"));
                String string = f_b.b(byArray3).intern();
                ibr = qx_.q0o(string, vt2$unz.fzl);
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

