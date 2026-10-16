/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class CommandPacket$Exception
extends RuntimeException {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        boolean bl = CommandPacket$Exception.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CommandPacket$Exception commandPacket$Exception) {
            throw CommandPacket$Exception.a(commandPacket$Exception);
        }
        return false;
    }

    private static CommandPacket$Exception a(CommandPacket$Exception commandPacket$Exception) {
        return commandPacket$Exception;
    }

    static {
        if (CommandPacket$Exception.a()) {
            CommandPacket$Exception.b(true);
        }
    }
}

