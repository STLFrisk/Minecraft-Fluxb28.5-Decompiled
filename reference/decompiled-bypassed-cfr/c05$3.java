/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c05$3
implements Callable {
    public final c05 dsl;

    public c05$3(c05 c052) {
        this.dsl = c052;
    }

    public String call() {
        return this.dsl.u0y.getClass().getCanonicalName();
    }

    public Object call() {
        return this.call();
    }
}

