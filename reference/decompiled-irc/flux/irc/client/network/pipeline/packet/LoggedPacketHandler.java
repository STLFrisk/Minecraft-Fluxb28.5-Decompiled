/*
 * Decompiled with CFR 0.152.
 */
package today.flux.irc.client.network.pipeline.packet;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import today.flux.irc.client.network.pipeline.ProtocolId;
import today.flux.irc.client.network.pipeline.packet.LoggedPacketHandler$NullPointerException;
import today.flux.irc.protocol.packet.LoggedPacket;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2={"Ltoday/flux/irc/client/network/pipeline/packet/LoggedPacketHandler;", "Lio/netty/channel/SimpleChannelInboundHandler;", "Ltoday/flux/irc/protocol/packet/LoggedPacket;", "Ltoday/flux/irc/client/network/pipeline/ProtocolId;", "()V", "channelRead0", "", "ctx", "Lio/netty/channel/ChannelHandlerContext;", "msg", "pid", "", "IRClient"})
public final class LoggedPacketHandler
extends SimpleChannelInboundHandler<LoggedPacket>
implements ProtocolId {
    public static final LoggedPacketHandler INSTANCE;
    private static boolean b;
    private static final String[] a;
    private static final String[] c;
    private static final Object[] d;
    private static final String[] e;

    @Override
    public int pid() {
        return 4;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void channelRead0(@NotNull ChannelHandlerContext var1_1, @NotNull LoggedPacket var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private LoggedPacketHandler() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            LoggedPacketHandler.d = new Object[27];
            LoggedPacketHandler.e = new String[27];
            LoggedPacketHandler.c();
            var5 = new String[2];
            var3_1 = 0;
            LoggedPacketHandler.b(true);
            var2_2 = "\u00bc\u0004\u00be\u0003\u001e\u00c2\u00ca";
            var4_3 = "\u00bc\u0004\u00be\u0003\u001e\u00c2\u00ca".length();
            var1_4 = 3;
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
                break block15;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 66;
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
                            v11 = 8;
                            break;
                        }
                        case 1: {
                            v11 = 84;
                            break;
                        }
                        case 2: {
                            v11 = 12;
                            break;
                        }
                        case 3: {
                            v11 = 6;
                            break;
                        }
                        case 4: {
                            v11 = 119;
                            break;
                        }
                        case 5: {
                            v11 = 71;
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
        LoggedPacketHandler.a = var5;
        LoggedPacketHandler.c = new String[2];
        try {
            LoggedPacketHandler.INSTANCE = var7_7 = new LoggedPacketHandler();
        }
        catch (LoggedPacketHandler$NullPointerException var7_8) {}
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        boolean bl = LoggedPacketHandler.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (LoggedPacketHandler$NullPointerException loggedPacketHandler$NullPointerException) {
            throw LoggedPacketHandler.a(loggedPacketHandler$NullPointerException);
        }
        return false;
    }

    private static LoggedPacketHandler$NullPointerException a(LoggedPacketHandler$NullPointerException loggedPacketHandler$NullPointerException) {
        return loggedPacketHandler$NullPointerException;
    }

    private static String a(int n2, int n3) {
        int n4 = (n2 ^ 0xFFFFFA8D) & 0xFFFF;
        if (c[n4] == null) {
            int n5;
            int n6;
            char[] cArray = a[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n6 = 231;
                    break;
                }
                case 1: {
                    n6 = 204;
                    break;
                }
                case 2: {
                    n6 = 101;
                    break;
                }
                case 3: {
                    n6 = 241;
                    break;
                }
                case 4: {
                    n6 = 55;
                    break;
                }
                case 5: {
                    n6 = 224;
                    break;
                }
                case 6: {
                    n6 = 199;
                    break;
                }
                case 7: {
                    n6 = 221;
                    break;
                }
                case 8: {
                    n6 = 166;
                    break;
                }
                case 9: {
                    n6 = 41;
                    break;
                }
                case 10: {
                    n6 = 214;
                    break;
                }
                case 11: {
                    n6 = 134;
                    break;
                }
                case 12: {
                    n6 = 244;
                    break;
                }
                case 13: {
                    n6 = 24;
                    break;
                }
                case 14: {
                    n6 = 176;
                    break;
                }
                case 15: {
                    n6 = 144;
                    break;
                }
                case 16: {
                    n6 = 9;
                    break;
                }
                case 17: {
                    n6 = 107;
                    break;
                }
                case 18: {
                    n6 = 147;
                    break;
                }
                case 19: {
                    n6 = 174;
                    break;
                }
                case 20: {
                    n6 = 62;
                    break;
                }
                case 21: {
                    n6 = 212;
                    break;
                }
                case 22: {
                    n6 = 220;
                    break;
                }
                case 23: {
                    n6 = 251;
                    break;
                }
                case 24: {
                    n6 = 136;
                    break;
                }
                case 25: {
                    n6 = 129;
                    break;
                }
                case 26: {
                    n6 = 149;
                    break;
                }
                case 27: {
                    n6 = 179;
                    break;
                }
                case 28: {
                    n6 = 86;
                    break;
                }
                case 29: {
                    n6 = 222;
                    break;
                }
                case 30: {
                    n6 = 202;
                    break;
                }
                case 31: {
                    n6 = 50;
                    break;
                }
                case 32: {
                    n6 = 70;
                    break;
                }
                case 33: {
                    n6 = 89;
                    break;
                }
                case 34: {
                    n6 = 192;
                    break;
                }
                case 35: {
                    n6 = 237;
                    break;
                }
                case 36: {
                    n6 = 51;
                    break;
                }
                case 37: {
                    n6 = 228;
                    break;
                }
                case 38: {
                    n6 = 156;
                    break;
                }
                case 39: {
                    n6 = 247;
                    break;
                }
                case 40: {
                    n6 = 17;
                    break;
                }
                case 41: {
                    n6 = 21;
                    break;
                }
                case 42: {
                    n6 = 167;
                    break;
                }
                case 43: {
                    n6 = 38;
                    break;
                }
                case 44: {
                    n6 = 34;
                    break;
                }
                case 45: {
                    n6 = 73;
                    break;
                }
                case 46: {
                    n6 = 189;
                    break;
                }
                case 47: {
                    n6 = 226;
                    break;
                }
                case 48: {
                    n6 = 61;
                    break;
                }
                case 49: {
                    n6 = 255;
                    break;
                }
                case 50: {
                    n6 = 15;
                    break;
                }
                case 51: {
                    n6 = 186;
                    break;
                }
                case 52: {
                    n6 = 194;
                    break;
                }
                case 53: {
                    n6 = 164;
                    break;
                }
                case 54: {
                    n6 = 190;
                    break;
                }
                case 55: {
                    n6 = 40;
                    break;
                }
                case 56: {
                    n6 = 236;
                    break;
                }
                case 57: {
                    n6 = 45;
                    break;
                }
                case 58: {
                    n6 = 127;
                    break;
                }
                case 59: {
                    n6 = 32;
                    break;
                }
                case 60: {
                    n6 = 151;
                    break;
                }
                case 61: {
                    n6 = 49;
                    break;
                }
                case 62: {
                    n6 = 182;
                    break;
                }
                case 63: {
                    n6 = 119;
                    break;
                }
                case 64: {
                    n6 = 112;
                    break;
                }
                case 65: {
                    n6 = 57;
                    break;
                }
                case 66: {
                    n6 = 47;
                    break;
                }
                case 67: {
                    n6 = 178;
                    break;
                }
                case 68: {
                    n6 = 191;
                    break;
                }
                case 69: {
                    n6 = 33;
                    break;
                }
                case 70: {
                    n6 = 120;
                    break;
                }
                case 71: {
                    n6 = 245;
                    break;
                }
                case 72: {
                    n6 = 76;
                    break;
                }
                case 73: {
                    n6 = 243;
                    break;
                }
                case 74: {
                    n6 = 115;
                    break;
                }
                case 75: {
                    n6 = 155;
                    break;
                }
                case 76: {
                    n6 = 68;
                    break;
                }
                case 77: {
                    n6 = 150;
                    break;
                }
                case 78: {
                    n6 = 31;
                    break;
                }
                case 79: {
                    n6 = 110;
                    break;
                }
                case 80: {
                    n6 = 11;
                    break;
                }
                case 81: {
                    n6 = 188;
                    break;
                }
                case 82: {
                    n6 = 146;
                    break;
                }
                case 83: {
                    n6 = 114;
                    break;
                }
                case 84: {
                    n6 = 43;
                    break;
                }
                case 85: {
                    n6 = 65;
                    break;
                }
                case 86: {
                    n6 = 168;
                    break;
                }
                case 87: {
                    n6 = 138;
                    break;
                }
                case 88: {
                    n6 = 205;
                    break;
                }
                case 89: {
                    n6 = 30;
                    break;
                }
                case 90: {
                    n6 = 121;
                    break;
                }
                case 91: {
                    n6 = 153;
                    break;
                }
                case 92: {
                    n6 = 99;
                    break;
                }
                case 93: {
                    n6 = 218;
                    break;
                }
                case 94: {
                    n6 = 74;
                    break;
                }
                case 95: {
                    n6 = 29;
                    break;
                }
                case 96: {
                    n6 = 201;
                    break;
                }
                case 97: {
                    n6 = 118;
                    break;
                }
                case 98: {
                    n6 = 6;
                    break;
                }
                case 99: {
                    n6 = 71;
                    break;
                }
                case 100: {
                    n6 = 37;
                    break;
                }
                case 101: {
                    n6 = 90;
                    break;
                }
                case 102: {
                    n6 = 102;
                    break;
                }
                case 103: {
                    n6 = 12;
                    break;
                }
                case 104: {
                    n6 = 229;
                    break;
                }
                case 105: {
                    n6 = 122;
                    break;
                }
                case 106: {
                    n6 = 159;
                    break;
                }
                case 107: {
                    n6 = 69;
                    break;
                }
                case 108: {
                    n6 = 187;
                    break;
                }
                case 109: {
                    n6 = 173;
                    break;
                }
                case 110: {
                    n6 = 169;
                    break;
                }
                case 111: {
                    n6 = 208;
                    break;
                }
                case 112: {
                    n6 = 161;
                    break;
                }
                case 113: {
                    n6 = 72;
                    break;
                }
                case 114: {
                    n6 = 104;
                    break;
                }
                case 115: {
                    n6 = 27;
                    break;
                }
                case 116: {
                    n6 = 117;
                    break;
                }
                case 117: {
                    n6 = 2;
                    break;
                }
                case 118: {
                    n6 = 7;
                    break;
                }
                case 119: {
                    n6 = 59;
                    break;
                }
                case 120: {
                    n6 = 172;
                    break;
                }
                case 121: {
                    n6 = 198;
                    break;
                }
                case 122: {
                    n6 = 238;
                    break;
                }
                case 123: {
                    n6 = 240;
                    break;
                }
                case 124: {
                    n6 = 253;
                    break;
                }
                case 125: {
                    n6 = 83;
                    break;
                }
                case 126: {
                    n6 = 123;
                    break;
                }
                case 127: {
                    n6 = 39;
                    break;
                }
                case 128: {
                    n6 = 143;
                    break;
                }
                case 129: {
                    n6 = 232;
                    break;
                }
                case 130: {
                    n6 = 44;
                    break;
                }
                case 131: {
                    n6 = 109;
                    break;
                }
                case 132: {
                    n6 = 94;
                    break;
                }
                case 133: {
                    n6 = 77;
                    break;
                }
                case 134: {
                    n6 = 25;
                    break;
                }
                case 135: {
                    n6 = 137;
                    break;
                }
                case 136: {
                    n6 = 66;
                    break;
                }
                case 137: {
                    n6 = 206;
                    break;
                }
                case 138: {
                    n6 = 22;
                    break;
                }
                case 139: {
                    n6 = 0;
                    break;
                }
                case 140: {
                    n6 = 158;
                    break;
                }
                case 141: {
                    n6 = 148;
                    break;
                }
                case 142: {
                    n6 = 139;
                    break;
                }
                case 143: {
                    n6 = 140;
                    break;
                }
                case 144: {
                    n6 = 132;
                    break;
                }
                case 145: {
                    n6 = 10;
                    break;
                }
                case 146: {
                    n6 = 8;
                    break;
                }
                case 147: {
                    n6 = 246;
                    break;
                }
                case 148: {
                    n6 = 80;
                    break;
                }
                case 149: {
                    n6 = 79;
                    break;
                }
                case 150: {
                    n6 = 219;
                    break;
                }
                case 151: {
                    n6 = 106;
                    break;
                }
                case 152: {
                    n6 = 175;
                    break;
                }
                case 153: {
                    n6 = 48;
                    break;
                }
                case 154: {
                    n6 = 54;
                    break;
                }
                case 155: {
                    n6 = 216;
                    break;
                }
                case 156: {
                    n6 = 250;
                    break;
                }
                case 157: {
                    n6 = 184;
                    break;
                }
                case 158: {
                    n6 = 225;
                    break;
                }
                case 159: {
                    n6 = 91;
                    break;
                }
                case 160: {
                    n6 = 233;
                    break;
                }
                case 161: {
                    n6 = 58;
                    break;
                }
                case 162: {
                    n6 = 130;
                    break;
                }
                case 163: {
                    n6 = 108;
                    break;
                }
                case 164: {
                    n6 = 154;
                    break;
                }
                case 165: {
                    n6 = 93;
                    break;
                }
                case 166: {
                    n6 = 162;
                    break;
                }
                case 167: {
                    n6 = 67;
                    break;
                }
                case 168: {
                    n6 = 3;
                    break;
                }
                case 169: {
                    n6 = 185;
                    break;
                }
                case 170: {
                    n6 = 165;
                    break;
                }
                case 171: {
                    n6 = 234;
                    break;
                }
                case 172: {
                    n6 = 20;
                    break;
                }
                case 173: {
                    n6 = 19;
                    break;
                }
                case 174: {
                    n6 = 85;
                    break;
                }
                case 175: {
                    n6 = 177;
                    break;
                }
                case 176: {
                    n6 = 52;
                    break;
                }
                case 177: {
                    n6 = 145;
                    break;
                }
                case 178: {
                    n6 = 95;
                    break;
                }
                case 179: {
                    n6 = 14;
                    break;
                }
                case 180: {
                    n6 = 254;
                    break;
                }
                case 181: {
                    n6 = 113;
                    break;
                }
                case 182: {
                    n6 = 211;
                    break;
                }
                case 183: {
                    n6 = 239;
                    break;
                }
                case 184: {
                    n6 = 103;
                    break;
                }
                case 185: {
                    n6 = 249;
                    break;
                }
                case 186: {
                    n6 = 42;
                    break;
                }
                case 187: {
                    n6 = 135;
                    break;
                }
                case 188: {
                    n6 = 75;
                    break;
                }
                case 189: {
                    n6 = 163;
                    break;
                }
                case 190: {
                    n6 = 126;
                    break;
                }
                case 191: {
                    n6 = 210;
                    break;
                }
                case 192: {
                    n6 = 141;
                    break;
                }
                case 193: {
                    n6 = 88;
                    break;
                }
                case 194: {
                    n6 = 81;
                    break;
                }
                case 195: {
                    n6 = 23;
                    break;
                }
                case 196: {
                    n6 = 46;
                    break;
                }
                case 197: {
                    n6 = 111;
                    break;
                }
                case 198: {
                    n6 = 170;
                    break;
                }
                case 199: {
                    n6 = 235;
                    break;
                }
                case 200: {
                    n6 = 242;
                    break;
                }
                case 201: {
                    n6 = 183;
                    break;
                }
                case 202: {
                    n6 = 16;
                    break;
                }
                case 203: {
                    n6 = 181;
                    break;
                }
                case 204: {
                    n6 = 97;
                    break;
                }
                case 205: {
                    n6 = 4;
                    break;
                }
                case 206: {
                    n6 = 100;
                    break;
                }
                case 207: {
                    n6 = 84;
                    break;
                }
                case 208: {
                    n6 = 26;
                    break;
                }
                case 209: {
                    n6 = 252;
                    break;
                }
                case 210: {
                    n6 = 18;
                    break;
                }
                case 211: {
                    n6 = 157;
                    break;
                }
                case 212: {
                    n6 = 213;
                    break;
                }
                case 213: {
                    n6 = 209;
                    break;
                }
                case 214: {
                    n6 = 28;
                    break;
                }
                case 215: {
                    n6 = 105;
                    break;
                }
                case 216: {
                    n6 = 125;
                    break;
                }
                case 217: {
                    n6 = 152;
                    break;
                }
                case 218: {
                    n6 = 195;
                    break;
                }
                case 219: {
                    n6 = 64;
                    break;
                }
                case 220: {
                    n6 = 207;
                    break;
                }
                case 221: {
                    n6 = 5;
                    break;
                }
                case 222: {
                    n6 = 230;
                    break;
                }
                case 223: {
                    n6 = 53;
                    break;
                }
                case 224: {
                    n6 = 133;
                    break;
                }
                case 225: {
                    n6 = 142;
                    break;
                }
                case 226: {
                    n6 = 56;
                    break;
                }
                case 227: {
                    n6 = 87;
                    break;
                }
                case 228: {
                    n6 = 180;
                    break;
                }
                case 229: {
                    n6 = 223;
                    break;
                }
                case 230: {
                    n6 = 128;
                    break;
                }
                case 231: {
                    n6 = 63;
                    break;
                }
                case 232: {
                    n6 = 227;
                    break;
                }
                case 233: {
                    n6 = 96;
                    break;
                }
                case 234: {
                    n6 = 36;
                    break;
                }
                case 235: {
                    n6 = 98;
                    break;
                }
                case 236: {
                    n6 = 200;
                    break;
                }
                case 237: {
                    n6 = 215;
                    break;
                }
                case 238: {
                    n6 = 82;
                    break;
                }
                case 239: {
                    n6 = 35;
                    break;
                }
                case 240: {
                    n6 = 171;
                    break;
                }
                case 241: {
                    n6 = 92;
                    break;
                }
                case 242: {
                    n6 = 78;
                    break;
                }
                case 243: {
                    n6 = 203;
                    break;
                }
                case 244: {
                    n6 = 131;
                    break;
                }
                case 245: {
                    n6 = 248;
                    break;
                }
                case 246: {
                    n6 = 196;
                    break;
                }
                case 247: {
                    n6 = 160;
                    break;
                }
                case 248: {
                    n6 = 193;
                    break;
                }
                case 249: {
                    n6 = 124;
                    break;
                }
                case 250: {
                    n6 = 1;
                    break;
                }
                case 251: {
                    n6 = 13;
                    break;
                }
                case 252: {
                    n6 = 60;
                    break;
                }
                case 253: {
                    n6 = 116;
                    break;
                }
                case 254: {
                    n6 = 197;
                    break;
                }
                default: {
                    n6 = 217;
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
            LoggedPacketHandler.c[n4] = new String(cArray).intern();
        }
        return c[n4];
    }

    private static int a(long l2) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)(l2 >>> 46);
        if (e[n5] != null) {
            return n5;
        }
        Object object = d[n5];
        int n6 = 0;
        switch ((int)(l2 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 20;
                break;
            }
            case 1: {
                n4 = 42;
                break;
            }
            case 2: {
                n4 = 38;
                break;
            }
            case 3: {
                n4 = 49;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 16;
                break;
            }
            case 6: {
                n4 = 2;
                break;
            }
            case 7: {
                n4 = 51;
                break;
            }
            case 8: {
                n4 = 19;
                break;
            }
            case 9: {
                n4 = 3;
                break;
            }
            case 10: {
                n4 = 14;
                break;
            }
            case 11: {
                n4 = 48;
                break;
            }
            case 12: {
                n4 = 45;
                break;
            }
            case 13: {
                n4 = 41;
                break;
            }
            case 14: {
                n4 = 31;
                break;
            }
            case 15: {
                n4 = 39;
                break;
            }
            case 16: {
                n4 = 28;
                break;
            }
            case 17: {
                n4 = 32;
                break;
            }
            case 18: {
                n4 = 47;
                break;
            }
            case 19: {
                n4 = 35;
                break;
            }
            case 20: {
                n4 = 50;
                break;
            }
            case 21: {
                n4 = 26;
                break;
            }
            case 22: {
                n4 = 9;
                break;
            }
            case 23: {
                n4 = 1;
                break;
            }
            case 24: {
                n4 = 53;
                break;
            }
            case 25: {
                n4 = 10;
                break;
            }
            case 26: {
                n4 = 62;
                break;
            }
            case 27: {
                n4 = 5;
                break;
            }
            case 28: {
                n4 = 27;
                break;
            }
            case 29: {
                n4 = 13;
                break;
            }
            case 30: {
                n4 = 59;
                break;
            }
            case 31: {
                n4 = 7;
                break;
            }
            case 32: {
                n4 = 40;
                break;
            }
            case 33: {
                n4 = 11;
                break;
            }
            case 34: {
                n4 = 21;
                break;
            }
            case 35: {
                n4 = 56;
                break;
            }
            case 36: {
                n4 = 6;
                break;
            }
            case 37: {
                n4 = 60;
                break;
            }
            case 38: {
                n4 = 63;
                break;
            }
            case 39: {
                n4 = 55;
                break;
            }
            case 40: {
                n4 = 33;
                break;
            }
            case 41: {
                n4 = 15;
                break;
            }
            case 42: {
                n4 = 57;
                break;
            }
            case 43: {
                n4 = 24;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 44;
                break;
            }
            case 46: {
                n4 = 52;
                break;
            }
            case 47: {
                n4 = 22;
                break;
            }
            case 48: {
                n4 = 8;
                break;
            }
            case 49: {
                n4 = 0;
                break;
            }
            case 50: {
                n4 = 36;
                break;
            }
            case 51: {
                n4 = 43;
                break;
            }
            case 52: {
                n4 = 37;
                break;
            }
            case 53: {
                n4 = 4;
                break;
            }
            case 54: {
                n4 = 12;
                break;
            }
            case 55: {
                n4 = 54;
                break;
            }
            case 56: {
                n4 = 34;
                break;
            }
            case 57: {
                n4 = 17;
                break;
            }
            case 58: {
                n4 = 58;
                break;
            }
            case 59: {
                n4 = 29;
                break;
            }
            case 60: {
                n4 = 25;
                break;
            }
            case 61: {
                n4 = 18;
                break;
            }
            case 62: {
                n4 = 30;
                break;
            }
            default: {
                n4 = 46;
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
        LoggedPacketHandler.e[n5] = new String(cArray);
        return n5;
    }

    private static void c() {
        Object[] objectArray = d;
        d[0] = "SF\u0000\\\u001e\u0019NP\u0000Q\u0013\fTGK^U.RH@\\\u001e\u0001rH@V\u0017\bHjA\\\u000f\bB]";
        objectArray[1] = "_xM\u0001.qBnM\f#dXy\u0006\u0003eF^v\r\u0001.i";
        objectArray[2] = "u z_'\u0004g#kFpCs,0]2Cd!j\u00100Ou8qL5\u0004B#w[0^O*jI1Xj";
        objectArray[3] = "a\u0017u\u0017q\nj\u0018dX\f\u0012y\u001fm\u0011";
        objectArray[4] = Void.TYPE;
        LoggedPacketHandler.e[4] = "java/lang/Void";
        objectArray[5] = "r\u0002\u001d/\u007f(l\n\u0007`\u0019<k\u000b&/!";
        objectArray[6] = "E'bQW\u0017N(s\u001e6\u0019E#wD";
        objectArray[7] = "eEs<\u001f~ @q=Xy`^b\"\u0018qb\u0004N>\u0002bgDt9\u0015c";
        objectArray[8] = "\u001atCEo\u0013\bwR\\8T\u001cx\tTdR\u001atDKz\u0013\u001ezDOsI@WHCqX\nKFG}X\u001a";
        objectArray[9] = "uO\u001eD7lbHCD<nb\u000e\u0016\u00125|fT\u001a\u00058j8s\u001a\r8xbU\u0001\u000f\u0011|xE\u0001\u000b\"pyN6\u00125|fT\u001a\u00058='";
        objectArray[10] = Integer.TYPE;
        LoggedPacketHandler.e[10] = "java/lang/Integer";
        objectArray[11] = "2QGMG{ RVT\u0010<4]\rOR<#PW\u0002P02IL^U{\u0005RJIP!\b[W[Q'-\u001a`CS%'PJCP";
        objectArray[12] = "\r\u0019C\ne4\u001f\u001aR\u00132s\u000b\u0015\t\bps\u001c\u0018SEyl\u001c\u0018SEUH:3Q\u000ern4\u0017I\n{\u007f\u0014\u0013I\u001f";
        objectArray[13] = "Y'\u0016F7[R(\u0007\tPYG#\u0007Bk";
        objectArray[14] = "d(>=\u00029v+/$U~b$t?\u0017~u).r\u0015rd05.\u00109`.*9\u0017~~\"t,\u001at{\".r7xw ?8+vs,?(3v~#69\t";
        objectArray[15] = "Bo\f\u0014\u0006F\f?I\u001b8L\u0014F\u0017\u001fWF\u001eO\u000e\u001d^Wr<IJZB\u0010:L\f@+I<JI\u0005\u0013B`\u0001\u00118";
        objectArray[16] = "$aN/Ul*(\u0007ED1}\u007f\u0019(KQf#\u0010|H>n(\u0006E";
        objectArray[17] = ".\u0005kN',e\u0002(@@6v\u0012(F\u0001(chiH/0r\f*J'u\u001fW2B;wbYiO2N";
        objectArray[18] = "GD\nnn}@\u0002Qi\u001cj\u0010\u000156\u007f|\u001b}S2so\u0010\u0019\u00100{*}FWk%,EM\u000b }\u0011";
        objectArray[19] = ").B\u0016hH/+\bM\n\u001c\u007f33Hr\u0014usM\u0016f\n*O\u000f\fm\u0014.1Q\u0018sK\u0012";
        objectArray[20] = "\"YrB\u001bwt\u001bo@'\u007f~IgD\u007f}dMiJ[ydewa@hXYhC'(fCk\u001bYvr]4'\u001dwqZaC^uy\u001f\f\u001c\u0019.'\u00194\u0017Ee\u007f$";
        objectArray[21] = "\"oz\u0012Gt$j<\b.yq*\u001c\u0017M{zVz\u0013Ahq29\u0011I-\u001c";
        objectArray[22] = "\n\u001a=\r\r>_I>\u0010de\u0003\u001ad\u0014\tj9\u001ek\u001e\\\u000eS\u000b3\u0018\u001e3]BzrZ7Y\u0011k\u0010\\2\u001f\u000b\u0002IZ4ZN:B\u0006\u007f\u0002s";
        objectArray[23] = "\u001c6(F\u0019\u0015Tc%Gv\u001eA{\rA\u0017\u001cJ{\u0000H\n\u000eK}%`\u001f\t,<'T\u0014\u0013\u0017:\"\u001eOq";
        objectArray[24] = "6\u0013\u001ag\u000f\\xC_h1p@%:JwzK~VnMU8\u0013\u0018>\bZ";
        objectArray[25] = "c^g\u000fb\u001d<\rp\u0001\u0006\u001d$Lp\u000f}pbPp\u0010?\rl\u000b}\u0019\u0006O<XbR{AgUkk<\u00132Ot\u000f\u007f\u0011:\n\u0019Qe\u001f#\\}\u0012g\u0017f1";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "3(\u0006l\u0002\u00164n]kp1nt\u001d:\u0016\u001bnwecA\u0014j~\u0001+\u0014\u0019k";
    }

    private static Class b(long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = LoggedPacketHandler.a(l2);
            object = d[n2];
            try {
                if (!(object instanceof String)) break block2;
                LoggedPacketHandler.d[n2] = clazz = Class.forName(e[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = LoggedPacketHandler.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i2 = 0; i2 < classArray.length; ++i2) {
                field = LoggedPacketHandler.b(classArray[i2], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l2) {
        int n2 = LoggedPacketHandler.a(l2);
        Object object = d[n2];
        if (object instanceof String) {
            String string = e[n2];
            int n3 = string.indexOf(8);
            Class clazz = LoggedPacketHandler.b(Long.parseLong(string.substring(0, n3), 36));
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = LoggedPacketHandler.b(Long.parseLong(string.substring(++n4), 36));
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = LoggedPacketHandler.a(clazz3, string2, clazz2)) != null) {
                    LoggedPacketHandler.d[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i2 = 0; i2 < classArray.length; ++i2) {
                        field = LoggedPacketHandler.b(classArray[i2], string2, clazz2);
                        if (field == null) continue;
                        LoggedPacketHandler.d[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = LoggedPacketHandler.b(478700851911480L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = LoggedPacketHandler.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i2 = 0; i2 < classArray2.length; ++i2) {
                method = LoggedPacketHandler.b(classArray2[i2], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l2) {
        int n2 = LoggedPacketHandler.a(l2);
        Object object = d[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n2];
                int n4 = string2.indexOf(8);
                clazz3 = LoggedPacketHandler.b(Long.parseLong(string2.substring(0, n4), 36));
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
                    clazz2 = LoggedPacketHandler.b(Long.parseLong(string2.substring(n7, n8), 36));
                    if (i2 < n3) {
                        classArray2[i2] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = LoggedPacketHandler.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        LoggedPacketHandler.d[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = LoggedPacketHandler.b(478700851911480L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i3 = 0; i3 < classArray.length; ++i3) {
                        Method method = LoggedPacketHandler.b(classArray[i3], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        LoggedPacketHandler.d[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = LoggedPacketHandler.b(478700851911480L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l2) {
        char c2 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c2 == '\u00db' || c2 == '\u00eb' || c2 == '\u00f2' || c2 == 'u') {
                field = LoggedPacketHandler.c(l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c2 == '\u00db' ? lookup.findGetter(clazz, string2, clazz2) : (c2 == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c2 == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = LoggedPacketHandler.d(l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c2 == '\u00ee' ? lookup.findVirtual(clazz, string3, methodType2) : (c2 == '$' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 1, new Class[]{Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 1;
        long l2 = (Long)objectArray[n2];
        MethodHandle methodHandle = LoggedPacketHandler.a(lookup, mutableCallSite, string, methodType, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("today/flux/irc/client/network/pipeline/packet/LoggedPacketHandler" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(LoggedPacketHandler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

