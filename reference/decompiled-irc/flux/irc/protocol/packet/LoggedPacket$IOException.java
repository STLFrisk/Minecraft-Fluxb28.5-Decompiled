/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class LoggedPacket$IOException
extends RuntimeException {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        boolean bl = LoggedPacket$IOException.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (LoggedPacket$IOException loggedPacket$IOException) {
            throw LoggedPacket$IOException.a(loggedPacket$IOException);
        }
        return false;
    }

    private static LoggedPacket$IOException a(LoggedPacket$IOException loggedPacket$IOException) {
        return loggedPacket$IOException;
    }

    static {
        if (LoggedPacket$IOException.b()) {
            LoggedPacket$IOException.b(true);
        }
    }
}

