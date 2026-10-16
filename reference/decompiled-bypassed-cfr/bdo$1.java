/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bdo$1
implements Callable {
    public final String xyg;
    public final bdo p9b;

    public bdo$1(bdo bdo2, String string) {
        this.p9b = bdo2;
        this.xyg = string;
    }

    public String call() {
        return gdw.msg[((gdw)bdo._m3(this.p9b).get(this.xyg)).ky0()];
    }

    public Object call() {
        return this.call();
    }
}

