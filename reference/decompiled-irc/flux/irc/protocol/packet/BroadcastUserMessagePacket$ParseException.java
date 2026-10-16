/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class BroadcastUserMessagePacket$ParseException
extends RuntimeException {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (BroadcastUserMessagePacket$ParseException.b() == null) {
            BroadcastUserMessagePacket$ParseException.b(new String[2]);
        }
    }
}

