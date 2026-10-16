/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;

public class c5k
extends vef {
    public c5k(int n, gdz gdz2, int n2) {
        super(n, gdz2, n2, bn1.j3b);
        this.wr5("arrowDamage");
    }

    @Override
    public int qwk(int n) {
        return 1 + (n - 1) * 10;
    }

    @Override
    public int fnu(int n) {
        return this.qwk(n) + 15;
    }

    @Override
    public int ehp() {
        return 5;
    }

    static {
        synchronized (c.g()) {
            long l = c.a(-1385734761906095662L, -6946408819196970823L, MethodHandles.lookup().lookupClass()).a(94467861212749L);
            return;
        }
    }
}

