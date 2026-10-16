/*
 * Decompiled with CFR 0.152.
 */
public class d1x
extends u7m {
    public u7m$vz9 lr8;

    public d1x(u7m$vz9 u7m$vz9) {
        this.lr8 = u7m$vz9;
        this.vgp = 1;
        this.rlr(u7m$vz9.sqv());
        this.qfy(uja.zip);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean ghw(erg var1_1, ha9 var2_2, t9d var3_3, mew var4_4, vt2 var5_5, float var6_6, float var7_7, float var8_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 9[SWITCH]
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

    public boolean pv_(erg erg2, ha9 ha92, t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        t9d2.amg((float)mew2.getX() + 0.5f, (float)mew2.getY() + 0.5f, (float)mew2.getZ() + 0.5f, zfz2.r_y().zu6.i3r(), (zfz2.r_y().zu6.dnt() + 1.0f) / 2.0f, zfz2.r_y().zu6.kjj() * 0.8f);
                        bl = t9d2.v0f;
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw d1x.a(oov2);
                    }
                    return true;
                }
                catch (oov oov3) {
                    throw d1x.a(oov3);
                }
            }
            t9d2.gfy(mew2, zfz2);
            erg2.ybw(1, ha92);
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean t0m() {
        return true;
    }

    public String zjw() {
        return this.lr8.toString();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

