/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class MessagePacket$Exception
extends RuntimeException {
    private static int b;

    public static void b(int n2) {
        b = n2;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        int n2 = MessagePacket$Exception.b();
        try {
            if (n2 == 0) {
                return 54;
            }
        }
        catch (MessagePacket$Exception messagePacket$Exception) {
            throw MessagePacket$Exception.a(messagePacket$Exception);
        }
        return 0;
    }

    private static MessagePacket$Exception a(MessagePacket$Exception messagePacket$Exception) {
        return messagePacket$Exception;
    }

    static {
        if (MessagePacket$Exception.b() == 0) {
            MessagePacket$Exception.b(106);
        }
    }
}

