/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bdo$2
implements Callable {
    public final int wo2;
    public final bdo xur;

    public bdo$2(bdo bdo2, int n) {
        this.xur = bdo2;
        this.wo2 = n;
    }

    public String call() {
        return gdw.msg[this.wo2];
    }

    public Object call() {
        return this.call();
    }
}

