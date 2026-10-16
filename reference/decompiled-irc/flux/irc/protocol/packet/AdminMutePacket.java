/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.protocol.packet;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import today.flux.irc.client.network.ClientNetwork;
import today.flux.irc.protocol.c;
import today.flux.irc.protocol.e;
import today.flux.irc.protocol.packet.AdminMutePacket$ArrayOutOfBoundsException;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0014"}, d2={"Ltoday/flux/irc/protocol/packet/AdminMutePacket;", "Ltoday/flux/irc/protocol/e;", "Ltoday/flux/irc/protocol/c;", "()V", "minuteDuration", "", "getMinuteDuration", "()I", "setMinuteDuration", "(I)V", "target", "", "getTarget", "()Ljava/lang/String;", "setTarget", "(Ljava/lang/String;)V", "token", "getToken", "setToken", "pid", "IRCProtocol"})
public final class AdminMutePacket
extends e
implements c {
    @NotNull
    private String target;
    private int minuteDuration;
    @NotNull
    private String token;
    private static ClientNetwork.Companion[] f;
    private static final String[] i;
    private static final String[] j;
    private static final Object[] k;
    private static final String[] n;

    @NotNull
    public final String getTarget() {
        return AdminMutePacket.b("y", (AdminMutePacket)this, (long)962850723898622L);
    }

    public final void setTarget(@NotNull String string) {
        try {
            AdminMutePacket.b("\u00ce", string, (String)((Object)AdminMutePacket.b("\u00ce", AdminMutePacket.b(28948, -6969), (int)59, (long)866048729800579L)), (long)699818304134061L);
            AdminMutePacket.b("\u00d6", (AdminMutePacket)this, (String)string, (long)962850723898622L);
            return;
        }
        catch (AdminMutePacket$ArrayOutOfBoundsException adminMutePacket$ArrayOutOfBoundsException) {
            return;
        }
    }

    public final int getMinuteDuration() {
        return (int)AdminMutePacket.b("y", (AdminMutePacket)this, (long)606418407631325L);
    }

    public final void setMinuteDuration(int n2) {
        try {
            AdminMutePacket.b("\u00d6", (AdminMutePacket)this, (int)n2, (long)606418407631325L);
            return;
        }
        catch (AdminMutePacket$ArrayOutOfBoundsException adminMutePacket$ArrayOutOfBoundsException) {
            return;
        }
    }

    @NotNull
    public final String getToken() {
        return AdminMutePacket.b("y", (AdminMutePacket)this, (long)727326004220346L);
    }

    public final void setToken(@NotNull String string) {
        try {
            AdminMutePacket.b("\u00ce", string, (String)((Object)AdminMutePacket.b("\u00ce", (int)113, (String)AdminMutePacket.b(28949, 2707), (long)815704318131555L)), (long)699818304134061L);
            AdminMutePacket.b("\u00d6", (AdminMutePacket)this, (String)string, (long)727326004220346L);
            return;
        }
        catch (AdminMutePacket$ArrayOutOfBoundsException adminMutePacket$ArrayOutOfBoundsException) {
            return;
        }
    }

    @Override
    public int pid() {
        return 11;
    }

    public AdminMutePacket() {
        AdminMutePacket.b("\u00d6", (AdminMutePacket)this, (String)"", (long)962850723898622L);
        AdminMutePacket.b("\u00d6", (AdminMutePacket)this, (String)"", (long)727326004220346L);
    }

    public static void b(ClientNetwork.Companion[] companionArray) {
        f = companionArray;
    }

    public static ClientNetwork.Companion[] a() {
        return f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            AdminMutePacket.k = new Object[14];
            AdminMutePacket.n = new String[14];
            AdminMutePacket.h();
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u0084,\u00e9\u00a6#\u00ad\u00da\u0007\u0001\u00d9\u0014\u00d5Q\u00d6\u0081";
            var4_3 = "\u0084,\u00e9\u00a6#\u00ad\u00da\u0007\u0001\u00d9\u0014\u00d5Q\u00d6\u0081".length();
            AdminMutePacket.b(null);
            var1_4 = 7;
            var0_5 = -1;
lbl11:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl13:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 57;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl71
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 103;
                            break;
                        }
                        case 1: {
                            v11 = 26;
                            break;
                        }
                        case 2: {
                            v11 = 125;
                            break;
                        }
                        case 3: {
                            v11 = 91;
                            break;
                        }
                        case 4: {
                            v11 = 39;
                            break;
                        }
                        case 5: {
                            v11 = 65;
                            break;
                        }
                        default: {
                            v11 = 90;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl71:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        AdminMutePacket.i = var5;
        AdminMutePacket.j = new String[2];
    }

    private static String b(int n2, int n3) {
        int n4 = (n2 ^ 0x7115) & 0xFFFF;
        if (j[n4] == null) {
            int n5;
            int n6;
            char[] cArray = i[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n6 = 235;
                    break;
                }
                case 1: {
                    n6 = 66;
                    break;
                }
                case 2: {
                    n6 = 252;
                    break;
                }
                case 3: {
                    n6 = 176;
                    break;
                }
                case 4: {
                    n6 = 128;
                    break;
                }
                case 5: {
                    n6 = 95;
                    break;
                }
                case 6: {
                    n6 = 142;
                    break;
                }
                case 7: {
                    n6 = 127;
                    break;
                }
                case 8: {
                    n6 = 41;
                    break;
                }
                case 9: {
                    n6 = 69;
                    break;
                }
                case 10: {
                    n6 = 219;
                    break;
                }
                case 11: {
                    n6 = 160;
                    break;
                }
                case 12: {
                    n6 = 98;
                    break;
                }
                case 13: {
                    n6 = 227;
                    break;
                }
                case 14: {
                    n6 = 133;
                    break;
                }
                case 15: {
                    n6 = 222;
                    break;
                }
                case 16: {
                    n6 = 62;
                    break;
                }
                case 17: {
                    n6 = 47;
                    break;
                }
                case 18: {
                    n6 = 143;
                    break;
                }
                case 19: {
                    n6 = 74;
                    break;
                }
                case 20: {
                    n6 = 225;
                    break;
                }
                case 21: {
                    n6 = 185;
                    break;
                }
                case 22: {
                    n6 = 237;
                    break;
                }
                case 23: {
                    n6 = 148;
                    break;
                }
                case 24: {
                    n6 = 188;
                    break;
                }
                case 25: {
                    n6 = 191;
                    break;
                }
                case 26: {
                    n6 = 124;
                    break;
                }
                case 27: {
                    n6 = 86;
                    break;
                }
                case 28: {
                    n6 = 197;
                    break;
                }
                case 29: {
                    n6 = 155;
                    break;
                }
                case 30: {
                    n6 = 147;
                    break;
                }
                case 31: {
                    n6 = 212;
                    break;
                }
                case 32: {
                    n6 = 51;
                    break;
                }
                case 33: {
                    n6 = 144;
                    break;
                }
                case 34: {
                    n6 = 130;
                    break;
                }
                case 35: {
                    n6 = 132;
                    break;
                }
                case 36: {
                    n6 = 248;
                    break;
                }
                case 37: {
                    n6 = 244;
                    break;
                }
                case 38: {
                    n6 = 3;
                    break;
                }
                case 39: {
                    n6 = 103;
                    break;
                }
                case 40: {
                    n6 = 247;
                    break;
                }
                case 41: {
                    n6 = 57;
                    break;
                }
                case 42: {
                    n6 = 123;
                    break;
                }
                case 43: {
                    n6 = 234;
                    break;
                }
                case 44: {
                    n6 = 203;
                    break;
                }
                case 45: {
                    n6 = 163;
                    break;
                }
                case 46: {
                    n6 = 93;
                    break;
                }
                case 47: {
                    n6 = 210;
                    break;
                }
                case 48: {
                    n6 = 36;
                    break;
                }
                case 49: {
                    n6 = 23;
                    break;
                }
                case 50: {
                    n6 = 50;
                    break;
                }
                case 51: {
                    n6 = 40;
                    break;
                }
                case 52: {
                    n6 = 129;
                    break;
                }
                case 53: {
                    n6 = 90;
                    break;
                }
                case 54: {
                    n6 = 112;
                    break;
                }
                case 55: {
                    n6 = 119;
                    break;
                }
                case 56: {
                    n6 = 174;
                    break;
                }
                case 57: {
                    n6 = 180;
                    break;
                }
                case 58: {
                    n6 = 154;
                    break;
                }
                case 59: {
                    n6 = 39;
                    break;
                }
                case 60: {
                    n6 = 68;
                    break;
                }
                case 61: {
                    n6 = 172;
                    break;
                }
                case 62: {
                    n6 = 88;
                    break;
                }
                case 63: {
                    n6 = 99;
                    break;
                }
                case 64: {
                    n6 = 22;
                    break;
                }
                case 65: {
                    n6 = 251;
                    break;
                }
                case 66: {
                    n6 = 0;
                    break;
                }
                case 67: {
                    n6 = 189;
                    break;
                }
                case 68: {
                    n6 = 33;
                    break;
                }
                case 69: {
                    n6 = 178;
                    break;
                }
                case 70: {
                    n6 = 232;
                    break;
                }
                case 71: {
                    n6 = 6;
                    break;
                }
                case 72: {
                    n6 = 117;
                    break;
                }
                case 73: {
                    n6 = 175;
                    break;
                }
                case 74: {
                    n6 = 19;
                    break;
                }
                case 75: {
                    n6 = 126;
                    break;
                }
                case 76: {
                    n6 = 209;
                    break;
                }
                case 77: {
                    n6 = 240;
                    break;
                }
                case 78: {
                    n6 = 156;
                    break;
                }
                case 79: {
                    n6 = 92;
                    break;
                }
                case 80: {
                    n6 = 137;
                    break;
                }
                case 81: {
                    n6 = 145;
                    break;
                }
                case 82: {
                    n6 = 76;
                    break;
                }
                case 83: {
                    n6 = 167;
                    break;
                }
                case 84: {
                    n6 = 59;
                    break;
                }
                case 85: {
                    n6 = 100;
                    break;
                }
                case 86: {
                    n6 = 18;
                    break;
                }
                case 87: {
                    n6 = 139;
                    break;
                }
                case 88: {
                    n6 = 101;
                    break;
                }
                case 89: {
                    n6 = 115;
                    break;
                }
                case 90: {
                    n6 = 84;
                    break;
                }
                case 91: {
                    n6 = 201;
                    break;
                }
                case 92: {
                    n6 = 230;
                    break;
                }
                case 93: {
                    n6 = 217;
                    break;
                }
                case 94: {
                    n6 = 194;
                    break;
                }
                case 95: {
                    n6 = 79;
                    break;
                }
                case 96: {
                    n6 = 246;
                    break;
                }
                case 97: {
                    n6 = 8;
                    break;
                }
                case 98: {
                    n6 = 49;
                    break;
                }
                case 99: {
                    n6 = 110;
                    break;
                }
                case 100: {
                    n6 = 242;
                    break;
                }
                case 101: {
                    n6 = 17;
                    break;
                }
                case 102: {
                    n6 = 15;
                    break;
                }
                case 103: {
                    n6 = 83;
                    break;
                }
                case 104: {
                    n6 = 114;
                    break;
                }
                case 105: {
                    n6 = 199;
                    break;
                }
                case 106: {
                    n6 = 87;
                    break;
                }
                case 107: {
                    n6 = 238;
                    break;
                }
                case 108: {
                    n6 = 116;
                    break;
                }
                case 109: {
                    n6 = 28;
                    break;
                }
                case 110: {
                    n6 = 223;
                    break;
                }
                case 111: {
                    n6 = 75;
                    break;
                }
                case 112: {
                    n6 = 5;
                    break;
                }
                case 113: {
                    n6 = 108;
                    break;
                }
                case 114: {
                    n6 = 207;
                    break;
                }
                case 115: {
                    n6 = 73;
                    break;
                }
                case 116: {
                    n6 = 97;
                    break;
                }
                case 117: {
                    n6 = 241;
                    break;
                }
                case 118: {
                    n6 = 45;
                    break;
                }
                case 119: {
                    n6 = 239;
                    break;
                }
                case 120: {
                    n6 = 245;
                    break;
                }
                case 121: {
                    n6 = 190;
                    break;
                }
                case 122: {
                    n6 = 44;
                    break;
                }
                case 123: {
                    n6 = 61;
                    break;
                }
                case 124: {
                    n6 = 168;
                    break;
                }
                case 125: {
                    n6 = 72;
                    break;
                }
                case 126: {
                    n6 = 37;
                    break;
                }
                case 127: {
                    n6 = 211;
                    break;
                }
                case 128: {
                    n6 = 58;
                    break;
                }
                case 129: {
                    n6 = 146;
                    break;
                }
                case 130: {
                    n6 = 121;
                    break;
                }
                case 131: {
                    n6 = 4;
                    break;
                }
                case 132: {
                    n6 = 135;
                    break;
                }
                case 133: {
                    n6 = 134;
                    break;
                }
                case 134: {
                    n6 = 26;
                    break;
                }
                case 135: {
                    n6 = 218;
                    break;
                }
                case 136: {
                    n6 = 94;
                    break;
                }
                case 137: {
                    n6 = 162;
                    break;
                }
                case 138: {
                    n6 = 43;
                    break;
                }
                case 139: {
                    n6 = 13;
                    break;
                }
                case 140: {
                    n6 = 184;
                    break;
                }
                case 141: {
                    n6 = 70;
                    break;
                }
                case 142: {
                    n6 = 82;
                    break;
                }
                case 143: {
                    n6 = 56;
                    break;
                }
                case 144: {
                    n6 = 177;
                    break;
                }
                case 145: {
                    n6 = 151;
                    break;
                }
                case 146: {
                    n6 = 16;
                    break;
                }
                case 147: {
                    n6 = 60;
                    break;
                }
                case 148: {
                    n6 = 25;
                    break;
                }
                case 149: {
                    n6 = 159;
                    break;
                }
                case 150: {
                    n6 = 250;
                    break;
                }
                case 151: {
                    n6 = 7;
                    break;
                }
                case 152: {
                    n6 = 226;
                    break;
                }
                case 153: {
                    n6 = 183;
                    break;
                }
                case 154: {
                    n6 = 229;
                    break;
                }
                case 155: {
                    n6 = 253;
                    break;
                }
                case 156: {
                    n6 = 34;
                    break;
                }
                case 157: {
                    n6 = 255;
                    break;
                }
                case 158: {
                    n6 = 89;
                    break;
                }
                case 159: {
                    n6 = 131;
                    break;
                }
                case 160: {
                    n6 = 213;
                    break;
                }
                case 161: {
                    n6 = 208;
                    break;
                }
                case 162: {
                    n6 = 231;
                    break;
                }
                case 163: {
                    n6 = 67;
                    break;
                }
                case 164: {
                    n6 = 216;
                    break;
                }
                case 165: {
                    n6 = 2;
                    break;
                }
                case 166: {
                    n6 = 165;
                    break;
                }
                case 167: {
                    n6 = 179;
                    break;
                }
                case 168: {
                    n6 = 136;
                    break;
                }
                case 169: {
                    n6 = 150;
                    break;
                }
                case 170: {
                    n6 = 149;
                    break;
                }
                case 171: {
                    n6 = 54;
                    break;
                }
                case 172: {
                    n6 = 31;
                    break;
                }
                case 173: {
                    n6 = 122;
                    break;
                }
                case 174: {
                    n6 = 52;
                    break;
                }
                case 175: {
                    n6 = 233;
                    break;
                }
                case 176: {
                    n6 = 141;
                    break;
                }
                case 177: {
                    n6 = 1;
                    break;
                }
                case 178: {
                    n6 = 198;
                    break;
                }
                case 179: {
                    n6 = 173;
                    break;
                }
                case 180: {
                    n6 = 102;
                    break;
                }
                case 181: {
                    n6 = 170;
                    break;
                }
                case 182: {
                    n6 = 106;
                    break;
                }
                case 183: {
                    n6 = 24;
                    break;
                }
                case 184: {
                    n6 = 204;
                    break;
                }
                case 185: {
                    n6 = 80;
                    break;
                }
                case 186: {
                    n6 = 12;
                    break;
                }
                case 187: {
                    n6 = 35;
                    break;
                }
                case 188: {
                    n6 = 65;
                    break;
                }
                case 189: {
                    n6 = 195;
                    break;
                }
                case 190: {
                    n6 = 46;
                    break;
                }
                case 191: {
                    n6 = 42;
                    break;
                }
                case 192: {
                    n6 = 152;
                    break;
                }
                case 193: {
                    n6 = 202;
                    break;
                }
                case 194: {
                    n6 = 166;
                    break;
                }
                case 195: {
                    n6 = 140;
                    break;
                }
                case 196: {
                    n6 = 9;
                    break;
                }
                case 197: {
                    n6 = 91;
                    break;
                }
                case 198: {
                    n6 = 200;
                    break;
                }
                case 199: {
                    n6 = 32;
                    break;
                }
                case 200: {
                    n6 = 205;
                    break;
                }
                case 201: {
                    n6 = 169;
                    break;
                }
                case 202: {
                    n6 = 107;
                    break;
                }
                case 203: {
                    n6 = 48;
                    break;
                }
                case 204: {
                    n6 = 158;
                    break;
                }
                case 205: {
                    n6 = 104;
                    break;
                }
                case 206: {
                    n6 = 20;
                    break;
                }
                case 207: {
                    n6 = 96;
                    break;
                }
                case 208: {
                    n6 = 85;
                    break;
                }
                case 209: {
                    n6 = 77;
                    break;
                }
                case 210: {
                    n6 = 254;
                    break;
                }
                case 211: {
                    n6 = 71;
                    break;
                }
                case 212: {
                    n6 = 181;
                    break;
                }
                case 213: {
                    n6 = 29;
                    break;
                }
                case 214: {
                    n6 = 113;
                    break;
                }
                case 215: {
                    n6 = 78;
                    break;
                }
                case 216: {
                    n6 = 120;
                    break;
                }
                case 217: {
                    n6 = 11;
                    break;
                }
                case 218: {
                    n6 = 220;
                    break;
                }
                case 219: {
                    n6 = 14;
                    break;
                }
                case 220: {
                    n6 = 21;
                    break;
                }
                case 221: {
                    n6 = 192;
                    break;
                }
                case 222: {
                    n6 = 171;
                    break;
                }
                case 223: {
                    n6 = 243;
                    break;
                }
                case 224: {
                    n6 = 206;
                    break;
                }
                case 225: {
                    n6 = 193;
                    break;
                }
                case 226: {
                    n6 = 157;
                    break;
                }
                case 227: {
                    n6 = 224;
                    break;
                }
                case 228: {
                    n6 = 64;
                    break;
                }
                case 229: {
                    n6 = 138;
                    break;
                }
                case 230: {
                    n6 = 81;
                    break;
                }
                case 231: {
                    n6 = 214;
                    break;
                }
                case 232: {
                    n6 = 164;
                    break;
                }
                case 233: {
                    n6 = 153;
                    break;
                }
                case 234: {
                    n6 = 215;
                    break;
                }
                case 235: {
                    n6 = 249;
                    break;
                }
                case 236: {
                    n6 = 118;
                    break;
                }
                case 237: {
                    n6 = 186;
                    break;
                }
                case 238: {
                    n6 = 161;
                    break;
                }
                case 239: {
                    n6 = 236;
                    break;
                }
                case 240: {
                    n6 = 10;
                    break;
                }
                case 241: {
                    n6 = 187;
                    break;
                }
                case 242: {
                    n6 = 228;
                    break;
                }
                case 243: {
                    n6 = 182;
                    break;
                }
                case 244: {
                    n6 = 38;
                    break;
                }
                case 245: {
                    n6 = 221;
                    break;
                }
                case 246: {
                    n6 = 125;
                    break;
                }
                case 247: {
                    n6 = 63;
                    break;
                }
                case 248: {
                    n6 = 109;
                    break;
                }
                case 249: {
                    n6 = 196;
                    break;
                }
                case 250: {
                    n6 = 53;
                    break;
                }
                case 251: {
                    n6 = 27;
                    break;
                }
                case 252: {
                    n6 = 30;
                    break;
                }
                case 253: {
                    n6 = 55;
                    break;
                }
                case 254: {
                    n6 = 105;
                    break;
                }
                default: {
                    n6 = 111;
                }
            }
            int n7 = n6;
            int n8 = (n3 & 0xFF) - n7;
            if (n8 < 0) {
                n8 += 256;
            }
            if ((n5 = ((n3 & 0xFFFF) >>> 8) - n7) < 0) {
                n5 += 256;
            }
            int n9 = 0;
            while (n9 < cArray.length) {
                int n10 = n9 % 2;
                int n11 = n9;
                char[] cArray2 = cArray;
                char c2 = cArray[n11];
                if (n10 == 0) {
                    cArray2[n11] = (char)(c2 ^ n8);
                    n8 = ((n8 >>> 3 | n8 << 5) ^ cArray[n9]) & 0xFF;
                } else {
                    cArray2[n11] = (char)(c2 ^ n5);
                    n5 = ((n5 >>> 3 | n5 << 5) ^ cArray[n9]) & 0xFF;
                }
                ++n9;
            }
            AdminMutePacket.j[n4] = new String(cArray).intern();
        }
        return j[n4];
    }

    private static int e(long l2) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)(l2 >>> 46);
        if (n[n5] != null) {
            return n5;
        }
        Object object = k[n5];
        int n6 = 0;
        switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 14;
                break;
            }
            case 1: {
                n4 = 3;
                break;
            }
            case 2: {
                n4 = 4;
                break;
            }
            case 3: {
                n4 = 1;
                break;
            }
            case 4: {
                n4 = 35;
                break;
            }
            case 5: {
                n4 = 44;
                break;
            }
            case 6: {
                n4 = 25;
                break;
            }
            case 7: {
                n4 = 2;
                break;
            }
            case 8: {
                n4 = 19;
                break;
            }
            case 9: {
                n4 = 37;
                break;
            }
            case 10: {
                n4 = 48;
                break;
            }
            case 11: {
                n4 = 60;
                break;
            }
            case 12: {
                n4 = 46;
                break;
            }
            case 13: {
                n4 = 30;
                break;
            }
            case 14: {
                n4 = 16;
                break;
            }
            case 15: {
                n4 = 42;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 54;
                break;
            }
            case 18: {
                n4 = 61;
                break;
            }
            case 19: {
                n4 = 56;
                break;
            }
            case 20: {
                n4 = 45;
                break;
            }
            case 21: {
                n4 = 26;
                break;
            }
            case 22: {
                n4 = 58;
                break;
            }
            case 23: {
                n4 = 32;
                break;
            }
            case 24: {
                n4 = 24;
                break;
            }
            case 25: {
                n4 = 6;
                break;
            }
            case 26: {
                n4 = 27;
                break;
            }
            case 27: {
                n4 = 23;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 10;
                break;
            }
            case 30: {
                n4 = 28;
                break;
            }
            case 31: {
                n4 = 63;
                break;
            }
            case 32: {
                n4 = 15;
                break;
            }
            case 33: {
                n4 = 51;
                break;
            }
            case 34: {
                n4 = 41;
                break;
            }
            case 35: {
                n4 = 34;
                break;
            }
            case 36: {
                n4 = 22;
                break;
            }
            case 37: {
                n4 = 52;
                break;
            }
            case 38: {
                n4 = 38;
                break;
            }
            case 39: {
                n4 = 62;
                break;
            }
            case 40: {
                n4 = 7;
                break;
            }
            case 41: {
                n4 = 17;
                break;
            }
            case 42: {
                n4 = 21;
                break;
            }
            case 43: {
                n4 = 55;
                break;
            }
            case 44: {
                n4 = 13;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 8;
                break;
            }
            case 47: {
                n4 = 0;
                break;
            }
            case 48: {
                n4 = 50;
                break;
            }
            case 49: {
                n4 = 36;
                break;
            }
            case 50: {
                n4 = 49;
                break;
            }
            case 51: {
                n4 = 39;
                break;
            }
            case 52: {
                n4 = 43;
                break;
            }
            case 53: {
                n4 = 12;
                break;
            }
            case 54: {
                n4 = 5;
                break;
            }
            case 55: {
                n4 = 9;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 29;
                break;
            }
            case 58: {
                n4 = 20;
                break;
            }
            case 59: {
                n4 = 11;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 59;
                break;
            }
            case 62: {
                n4 = 33;
                break;
            }
            default: {
                n4 = 31;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l2 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        AdminMutePacket.n[n5] = new String(cArray);
        return n5;
    }

    private static void h() {
        Object[] objectArray = k;
        k[0] = "6nj\u007f\u0011=skh~V:3u{a\u001621/W}\f!4omz\u001b ";
        objectArray[1] = "\u0007\u000bR\u0011/p\f\u0004C^N~\u0007\u000fG\u0004";
        objectArray[2] = "YU\t\u000bqMRZ\u0018D\fUA]\u0011\r";
        objectArray[3] = Void.TYPE;
        AdminMutePacket.n[3] = "java/lang/Void";
        objectArray[4] = "\u0012\u0019QLFh\u0000\u001a@U\u0011/\u0014\u0015\u001b]M)\u0012\u0019VBSh\u0016\u0017VFZ2H7Q@V(+\u0003AHo'\u0005\u001dPY";
        objectArray[5] = "%0.>@\u000e27s>K\f2q\tGu-#-*vH\u001e4{r";
        objectArray[6] = Integer.TYPE;
        AdminMutePacket.n[6] = "java/lang/Integer";
        objectArray[7] = "S+\u001c=f\u000bD,A=m\tDj\u0010\u007f`\u0011B-\u0005{j\r\u001e\u0005\u001dth\fY0\u0019~#O";
        objectArray[8] = "\u007f\u0006XH\u0017P>\u0005H\u0002&U%\t\\\u0005K|9\u0015H\u0005GW\"o\u001d\u0019[\f|^H\u001dX@";
        objectArray[9] = "e\u0007\u0000\u0017MW=B\u000b|\u001b\u00065\u0010\u0007$\u0019\u001c1\u001e\t\u0000\u001d\u001c\u0019\u0000\"\u001b\f %\u001f\u0000|\t\u0016:\u0005\u001aM\u0013\u0000={]\u000eH_3\u001e[\u0003\u0002YXA\t\u0004I^:C\u0014\u0011\bf";
        objectArray[10] = "H)}}Vn\t*m7gr\u0014#i*g7\u0001x='\u00021\f2;";
        objectArray[11] = "*\u0010\"Te4}\u0014w\u0004U/q\u0016v\u0019\u0012 \u0017F{\u0014iv&\u0013\u007f\u0017%N.\b#P>+(\u0005iVUweB\"\u00020qh\b$i";
        objectArray[12] = "am'\u0012+\rft?\f\u0014\t<t1\u0006hhc}dE\u007f\rep.C\u0014T:r`D%\u0001>q,|-\u001ab67\u0019+\u0017(0\\";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "hVnf\u0017\u000b)U~,&\u0017:Ex:ZkjM/nM\u000el@eh";
    }

    private static Class f(long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = AdminMutePacket.e(l2);
            object = k[n2];
            try {
                if (!(object instanceof String)) break block2;
                AdminMutePacket.k[n2] = clazz = Class.forName(n[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AdminMutePacket.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i2 = 0; i2 < classArray.length; ++i2) {
                field = AdminMutePacket.d(classArray[i2], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field g(long l2) {
        int n2 = AdminMutePacket.e(l2);
        Object object = k[n2];
        if (object instanceof String) {
            String string = n[n2];
            int n3 = string.indexOf(8);
            Class clazz = AdminMutePacket.f(Long.parseLong(string.substring(0, n3), 36));
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = AdminMutePacket.f(Long.parseLong(string.substring(++n4), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdminMutePacket.c(clazz3, string2, clazz2)) != null) {
                    AdminMutePacket.k[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i2 = 0; i2 < classArray.length; ++i2) {
                        field = AdminMutePacket.d(classArray[i2], string2, clazz2);
                        if (field == null) continue;
                        AdminMutePacket.k[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdminMutePacket.f(75978160839634L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (classArray2[i2] != classArray[i2]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = AdminMutePacket.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i2 = 0; i2 < classArray2.length; ++i2) {
                method = AdminMutePacket.d(classArray2[i2], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l2) {
        int n2 = AdminMutePacket.e(l2);
        Object object = k[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = n[n2];
                int n4 = string2.indexOf(8);
                clazz3 = AdminMutePacket.f(Long.parseLong(string2.substring(0, n4), 36));
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i2 = 0; i2 < n6; ++i2) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = AdminMutePacket.f(Long.parseLong(string2.substring(n7, n8), 36));
                    if (i2 < n3) {
                        classArray2[i2] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdminMutePacket.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        AdminMutePacket.k[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdminMutePacket.f(75978160839634L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i3 = 0; i3 < classArray.length; ++i3) {
                        Method method = AdminMutePacket.d(classArray[i3], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        AdminMutePacket.k[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdminMutePacket.f(75978160839634L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2) {
        char c2 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c2 == 'y' || c2 == '\u00d6' || c2 == '\u00e8' || c2 == '\u00ef') {
                field = AdminMutePacket.g(l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c2 == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c2 == '\u00d6' ? lookup.findSetter(clazz, string2, clazz2) : (c2 == '\u00e8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdminMutePacket.h(l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c2 == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c2 == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 1;
        long l2 = (Long)objectArray[n2];
        MethodHandle methodHandle = AdminMutePacket.b(lookup, mutableCallSite, string, methodType, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("today/flux/irc/protocol/packet/AdminMutePacket" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdminMutePacket.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

