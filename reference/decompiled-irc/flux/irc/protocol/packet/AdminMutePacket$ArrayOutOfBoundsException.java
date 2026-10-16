/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class AdminMutePacket$ArrayOutOfBoundsException
extends RuntimeException {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        boolean bl = AdminMutePacket$ArrayOutOfBoundsException.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (AdminMutePacket$ArrayOutOfBoundsException adminMutePacket$ArrayOutOfBoundsException) {
            throw AdminMutePacket$ArrayOutOfBoundsException.a(adminMutePacket$ArrayOutOfBoundsException);
        }
        return false;
    }

    private static AdminMutePacket$ArrayOutOfBoundsException a(AdminMutePacket$ArrayOutOfBoundsException adminMutePacket$ArrayOutOfBoundsException) {
        return adminMutePacket$ArrayOutOfBoundsException;
    }

    static {
        if (!AdminMutePacket$ArrayOutOfBoundsException.a()) {
            AdminMutePacket$ArrayOutOfBoundsException.b(true);
        }
    }
}

