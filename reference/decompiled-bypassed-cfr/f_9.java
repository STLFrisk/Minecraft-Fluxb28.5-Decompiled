/*
 * Decompiled with CFR 0.152.
 */
public class f_9
extends vrx {
    private /* synthetic */ ha9 mq7;
    private /* synthetic */ int ode;

    public f_9(ha9 ha92, rsi rsi2, int n, int n2, int n3) {
        super(rsi2, n, n2, n3);
        this.mq7 = ha92;
    }

    @Override
    public boolean xvl(erg erg2) {
        return false;
    }

    @Override
    public erg xtx(int n) {
        f_9 f_92;
        block4: {
            block5: {
                int n2 = t9d.b();
                try {
                    try {
                        f_92 = this;
                        if (n2 == 0) break block4;
                        if (!f_92.hf8()) break block5;
                    }
                    catch (oov oov2) {
                        throw f_9.a(oov2);
                    }
                    this.ode += Math.min(n, this.x4s().qd2);
                }
                catch (oov oov3) {
                    throw f_9.a(oov3);
                }
            }
            f_92 = this;
        }
        return super.xtx(n);
    }

    @Override
    public void g1d(ha9 ha92, erg erg2) {
        this.erq(erg2);
        super.g1d(ha92, erg2);
    }

    @Override
    public void f2o(erg erg2, int n) {
        this.ode += n;
        this.erq(erg2);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void erq(erg var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[DOLOOP]], but top level block is 7[TRYBLOCK]
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

    private static oov a(oov oov2) {
        return oov2;
    }
}

