/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.client.network.pipeline.packet;

public class LoggedPacketHandler$NullPointerException
extends RuntimeException {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        boolean bl = LoggedPacketHandler$NullPointerException.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (LoggedPacketHandler$NullPointerException loggedPacketHandler$NullPointerException) {
            throw LoggedPacketHandler$NullPointerException.a(loggedPacketHandler$NullPointerException);
        }
        return false;
    }

    private static LoggedPacketHandler$NullPointerException a(LoggedPacketHandler$NullPointerException loggedPacketHandler$NullPointerException) {
        return loggedPacketHandler$NullPointerException;
    }

    static {
        if (!LoggedPacketHandler$NullPointerException.b()) {
            LoggedPacketHandler$NullPointerException.b(true);
        }
    }
}

