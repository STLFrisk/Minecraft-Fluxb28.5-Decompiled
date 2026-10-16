/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

import today.flux.irc.client.network.ClientNetwork;

public class LoginPacket$ParseException
extends RuntimeException {
    private static ClientNetwork.Companion[] b;

    public static void b(ClientNetwork.Companion[] companionArray) {
        b = companionArray;
    }

    public static ClientNetwork.Companion[] b() {
        return b;
    }

    static {
        if (LoginPacket$ParseException.b() != null) {
            LoginPacket$ParseException.b(new ClientNetwork.Companion[2]);
        }
    }
}

