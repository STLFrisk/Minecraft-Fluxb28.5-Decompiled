/*
 * Decompiled with CFR 0.152.
 */
public class flk {
    public static final flk i7m = new flk();
    public static float mzw = 0.0f;
    public static float s34 = 0.0f;
    public static float pij = 0.0f;
    public static float ja3 = 0.0f;
    public static float hl8 = 0.0f;
    public static float q_i = 0.0f;
    public static float hxb = 0.0f;
    public static float p2n = 0.0f;
    public static float tg8 = 0.0f;
    public final hej pgd;
    public final hej x6y;
    public final hej tvs;
    public final hej q31;
    public final hej pj2;
    public final hej c8l;

    private flk() {
        this(hej.i26, hej.i26, hej.i26, hej.i26, hej.i26, hej.i26);
    }

    public flk(flk flk2) {
        this.pgd = flk2.pgd;
        this.x6y = flk2.x6y;
        this.tvs = flk2.tvs;
        this.q31 = flk2.q31;
        this.pj2 = flk2.pj2;
        this.c8l = flk2.c8l;
    }

    public flk(hej hej2, hej hej3, hej hej4, hej hej5, hej hej6, hej hej7) {
        this.pgd = hej2;
        this.x6y = hej3;
        this.tvs = hej4;
        this.q31 = hej5;
        this.pj2 = hej6;
        this.c8l = hej7;
    }

    public void vqs(flk$gbm flk$gbm) {
        block5: {
            hej hej2;
            hej hej3;
            block4: {
                int n = t9d.b();
                hej3 = this.zem(flk$gbm);
                try {
                    try {
                        hej2 = hej3;
                        if (n == 0) break block4;
                        if (hej2 == hej.i26) break block5;
                    }
                    catch (oov oov2) {
                        throw flk.a(oov2);
                    }
                    hzu.a4k(hej3.tas.x + mzw, hej3.tas.y + s34, hej3.tas.z + pij);
                    hzu.a2h(hej3.eip.y + hl8, 0.0f, 1.0f, 0.0f);
                    hzu.a2h(hej3.eip.x + ja3, 1.0f, 0.0f, 0.0f);
                    hzu.a2h(hej3.eip.z + q_i, 0.0f, 0.0f, 1.0f);
                    hej2 = hej3;
                }
                catch (oov oov3) {
                    throw flk.a(oov3);
                }
            }
            hzu.syc(hej2.vsl.x + hxb, hej3.vsl.y + p2n, hej3.vsl.z + tg8);
        }
    }

    /*
     * Exception decompiling
     */
    public hej zem(flk$gbm var1_1) {
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

    public boolean qgt(flk$gbm flk$gbm) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.zem(flk$gbm).equals(hej.i26);
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw flk.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

