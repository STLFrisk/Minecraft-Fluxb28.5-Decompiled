/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  us.myles.ViaVersion.api.protocol.ProtocolVersion
 */
import us.myles.ViaVersion.api.protocol.ProtocolVersion;

public class a2d {
    public static String sb9(int n) {
        int n2;
        block4: {
            block5: {
                int n3 = t9d.c();
                try {
                    try {
                        n2 = ProtocolVersion.isRegistered((int)n);
                        if (n3 != 0) break block4;
                        if (n2 != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw a2d.a(oov2);
                    }
                    return Integer.toString(n);
                }
                catch (oov oov3) {
                    throw a2d.a(oov3);
                }
            }
            n2 = n;
        }
        return ProtocolVersion.getProtocol((int)n2).getName();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

