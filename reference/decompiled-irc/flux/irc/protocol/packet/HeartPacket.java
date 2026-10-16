/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

import kotlin.Metadata;
import today.flux.irc.protocol.e;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Ltoday/flux/irc/protocol/packet/HeartPacket;", "Ltoday/flux/irc/protocol/e;", "()V", "pid", "", "IRCProtocol"})
public final class HeartPacket
extends e {
    private static int[] f;

    @Override
    public int pid() {
        return 10;
    }

    public static void a(int[] nArray) {
        f = nArray;
    }

    public static int[] a() {
        return f;
    }

    static {
        if (HeartPacket.a() != null) {
            HeartPacket.a(new int[2]);
        }
    }
}

