/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fln$3
implements Callable {
    public final fln k_c;

    public fln$3(fln fln2) {
        this.k_c = fln2;
    }

    public String call() {
        return this.k_c.getClass().getCanonicalName();
    }

    public Object call() {
        return this.call();
    }
}

