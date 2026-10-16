/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c05$4
implements Callable {
    public final c05 brs;

    public c05$4(c05 c052) {
        this.brs = c052;
    }

    public String call() {
        return this.brs.u0y.getClass().getCanonicalName();
    }

    public Object call() {
        return this.call();
    }
}

