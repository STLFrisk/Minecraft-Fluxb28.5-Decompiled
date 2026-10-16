/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

import kotlin.Metadata;
import today.flux.irc.protocol.c;
import today.flux.irc.protocol.e;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2={"Ltoday/flux/irc/protocol/packet/RespondMessagePacket;", "Ltoday/flux/irc/protocol/e;", "Ltoday/flux/irc/protocol/c;", "()V", "pid", "", "IRCProtocol"})
public final class RespondMessagePacket
extends e
implements c {
    private static String f;

    @Override
    public int pid() {
        return 7;
    }

    public static void b(String string) {
        f = string;
    }

    public static String a() {
        return f;
    }

    static {
        if (RespondMessagePacket.a() != null) {
            RespondMessagePacket.b("I0awt");
        }
    }
}

