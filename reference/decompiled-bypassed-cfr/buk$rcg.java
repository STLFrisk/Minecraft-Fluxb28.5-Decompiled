/*
 * Decompiled with CFR 0.152.
 */
public class buk$rcg
extends gt4 {
    private final ulc m4q;
    public final buk blq;

    private buk$rcg(buk buk2, int n, int n2, int n3, int n4, int n5, ulc ulc2) {
        this.blq = buk2;
        super(n, n2, n3, n4, n5, buk.p0r(buk2, ulc2));
        this.m4q = ulc2;
    }

    public buk$rcg(buk buk2, int n, int n2, int n3, int n4, int n5, ulc ulc2, buk$1 buk$1) {
        this(buk2, n, n2, n3, n4, n5, ulc2);
    }

    public static ulc py7(buk$rcg buk$rcg) {
        return buk$rcg.m4q;
    }
}

