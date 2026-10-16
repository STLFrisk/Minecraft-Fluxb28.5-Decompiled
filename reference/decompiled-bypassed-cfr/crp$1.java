/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class crp$1
implements Callable {
    public final double n85;
    public final double jdi;
    public final double v9p;
    public final crp vgb;

    public crp$1(crp crp2, double d, double d2, double d3) {
        this.vgb = crp2;
        this.n85 = d;
        this.jdi = d2;
        this.v9p = d3;
    }

    public String call() {
        return wsc.elx(this.n85, this.jdi, this.v9p);
    }

    public Object call() {
        return this.call();
    }
}

