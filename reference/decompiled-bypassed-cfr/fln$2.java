/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fln$2
implements Callable {
    public final int hob;
    public final int oxx;
    public final fln wb_;

    public fln$2(fln fln2, int n, int n2) {
        this.wb_ = fln2;
        this.hob = n;
        this.oxx = n2;
    }

    public String call() {
        return String.valueOf(h2f.fcz(this.hob, this.oxx));
    }

    public Object call() {
        return this.call();
    }
}

