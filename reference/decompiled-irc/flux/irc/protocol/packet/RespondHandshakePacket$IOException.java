/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

import today.flux.irc.client.network.ClientNetwork;

public class RespondHandshakePacket$IOException
extends RuntimeException {
    private static ClientNetwork.Companion[] b;

    public static void b(ClientNetwork.Companion[] companionArray) {
        b = companionArray;
    }

    public static ClientNetwork.Companion[] b() {
        return b;
    }

    static {
        if (RespondHandshakePacket$IOException.b() == null) {
            RespondHandshakePacket$IOException.b(new ClientNetwork.Companion[2]);
        }
    }
}

