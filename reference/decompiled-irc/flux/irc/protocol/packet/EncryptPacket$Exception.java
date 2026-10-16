/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

public class EncryptPacket$Exception
extends RuntimeException {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    static {
        if (EncryptPacket$Exception.b() != null) {
            EncryptPacket$Exception.b(new int[4]);
        }
    }
}

