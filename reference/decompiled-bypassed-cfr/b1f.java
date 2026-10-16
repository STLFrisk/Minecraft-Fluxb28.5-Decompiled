/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b1f {
    private static final AtomicInteger gqj = new AtomicInteger(0);
    private static final Logger z35 = LogManager.getLogger();

    public static AtomicInteger ymx() {
        return gqj;
    }

    public static Logger udl() {
        return z35;
    }
}

