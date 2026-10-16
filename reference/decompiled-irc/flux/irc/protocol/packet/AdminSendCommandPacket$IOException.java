/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class AdminSendCommandPacket$IOException
extends RuntimeException {
    private static int b;

    public static void b(int n2) {
        b = n2;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        int n2 = AdminSendCommandPacket$IOException.b();
        try {
            if (n2 == 0) {
                return 76;
            }
        }
        catch (AdminSendCommandPacket$IOException adminSendCommandPacket$IOException) {
            throw AdminSendCommandPacket$IOException.a(adminSendCommandPacket$IOException);
        }
        return 0;
    }

    private static AdminSendCommandPacket$IOException a(AdminSendCommandPacket$IOException adminSendCommandPacket$IOException) {
        return adminSendCommandPacket$IOException;
    }

    static {
        if (AdminSendCommandPacket$IOException.c() == 0) {
            AdminSendCommandPacket$IOException.b(36);
        }
    }
}

