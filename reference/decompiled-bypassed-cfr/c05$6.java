/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.Sys
 */
import java.util.concurrent.Callable;
import org.lwjgl.Sys;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c05$6
implements Callable {
    public final c05 euy;

    public c05$6(c05 c052) {
        this.euy = c052;
    }

    public String call() {
        return Sys.getVersion();
    }

    public Object call() {
        return this.call();
    }
}

