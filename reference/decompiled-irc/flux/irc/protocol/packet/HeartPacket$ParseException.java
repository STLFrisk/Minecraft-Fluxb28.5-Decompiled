/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class HeartPacket$ParseException
extends RuntimeException {
    private static int b;

    public static void b(int n2) {
        b = n2;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        int n2 = HeartPacket$ParseException.b();
        try {
            if (n2 == 0) {
                return 5;
            }
        }
        catch (HeartPacket$ParseException heartPacket$ParseException) {
            throw HeartPacket$ParseException.a(heartPacket$ParseException);
        }
        return 0;
    }

    private static HeartPacket$ParseException a(HeartPacket$ParseException heartPacket$ParseException) {
        return heartPacket$ParseException;
    }

    static {
        if (HeartPacket$ParseException.c() == 0) {
            HeartPacket$ParseException.b(43);
        }
    }
}

