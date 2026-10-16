/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cog$3
implements Callable {
    public final cog k42;

    public cog$3(cog cog2) {
        this.k42 = cog2;
    }

    public String call() {
        return cog.vfl(this.k42);
    }

    public Object call() {
        return this.call();
    }
}

