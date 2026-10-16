/*
 * Decompiled with CFR 0.152.
 */
public class esx$v28
extends esx {
    public esx$v28() {
        this.y8l(this._8_.c32().zvi(enk, (Comparable)((Object)vt2.z9q)));
    }

    /*
     * Exception decompiling
     */
    @Override
    public void c7i(m5n var1_1, mew var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 5[SWITCH]
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
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block4: {
            block5: {
                int n = t9d.b();
                vt2 vt22 = (vt2)((Object)zfz2.dil(enk));
                try {
                    try {
                        if (n == 0) break block4;
                        if (t9d2.getBlockState(mew2.offset(vt22.b4b())).r_y().p1r().gk6()) break block5;
                    }
                    catch (oov oov2) {
                        throw esx$v28.b(oov2);
                    }
                    this.lf0(t9d2, mew2, zfz2, 0);
                    t9d2.i6x(mew2);
                }
                catch (oov oov3) {
                    throw esx$v28.b(oov3);
                }
            }
            super.z3l(t9d2, mew2, zfz2, e0x2);
        }
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
                        throw esx$v28.b(oov2);
                    }
                    vt23 = vt2.z9q;
                }
                catch (oov oov3) {
                    throw esx$v28.b(oov3);
                }
            }
            vt22 = vt23;
        }
        return this.l4i().zvi(enk, (Comparable)((Object)vt22));
    }

    @Override
    public int hvp(zfz zfz2) {
        return ((vt2)((Object)zfz2.dil(enk))).c3s();
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{enk});
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

