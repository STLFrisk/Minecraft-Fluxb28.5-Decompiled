/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class RespondMessagePacket$ArrayOutOfBoundsException
extends RuntimeException {
    private static String b;

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (RespondMessagePacket$ArrayOutOfBoundsException.b() != null) {
            RespondMessagePacket$ArrayOutOfBoundsException.b("iBTT4");
        }
    }
}

