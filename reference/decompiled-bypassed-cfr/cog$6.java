/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cog$6
implements Callable {
    public final cog qxf;

    public cog$6(cog cog2) {
        this.qxf = cog2;
    }

    public String call() {
        return String.valueOf(cog.o1q(this.qxf));
    }

    public Object call() {
        return this.call();
    }
}

