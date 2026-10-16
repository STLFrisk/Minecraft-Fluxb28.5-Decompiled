/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c05$5
implements Callable {
    public final c05 yiv;

    public c05$5(c05 c052) {
        this.yiv = c052;
    }

    public String call() {
        return c05.ttd(this.yiv);
    }

    public Object call() {
        return this.call();
    }
}

