/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;

public class cmg
extends vef {
    public cmg(int n, gdz gdz2, int n2) {
        super(n, gdz2, n2, bn1.j3b);
        this.wr5("arrowKnockback");
    }

    @Override
    public int qwk(int n) {
        return 12 + (n - 1) * 20;
    }

    @Override
    public int fnu(int n) {
        return this.qwk(n) + 25;
    }

    @Override
    public int ehp() {
        return 2;
    }

    static {
        synchronized (c.g()) {
            long l = c.a(-8222345147321962354L, -8529309960991900993L, MethodHandles.lookup().lookupClass()).a(221298574284166L);
            return;
        }
    }
}

