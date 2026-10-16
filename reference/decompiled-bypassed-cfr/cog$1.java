/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cog$1
implements Callable {
    public final cog fpl;

    public cog$1(cog cog2) {
        this.fpl = cog2;
    }

    public String call() {
        return String.valueOf(this.fpl._oa());
    }

    public Object call() {
        return this.call();
    }
}

