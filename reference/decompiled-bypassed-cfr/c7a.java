/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S08PacketPlayerPosLook$bdv;

public class c7a
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0xCBDA913C31FL;
        return c7a.b("c", (int)21803, (long)(0x71EFD855F4E89610L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x243EA849F99L;
        return c7a.b("c", (int)8908, (long)(0x657F5C0A78023D75L ^ l));
    }

    @Override
    public void l3z(e7r e7r2, String[] stringArray) {
        block123: {
            i2h i2h2;
            i2h i2h3;
            long l;
            block121: {
                i2h i2h4;
                block119: {
                    int n;
                    block117: {
                        block118: {
                            block92: {
                                bc_$fod bc_$fod;
                                bc_$fod bc_$fod2;
                                bc_$fod bc_$fod3;
                                block127: {
                                    float f;
                                    float f2;
                                    block116: {
                                        float f3;
                                        float f4;
                                        block114: {
                                            block115: {
                                                bc_$fod bc_$fod4;
                                                bc_$fod bc_$fod5;
                                                block126: {
                                                    float f5;
                                                    EnumSet<S08PacketPlayerPosLook$bdv> enumSet;
                                                    block113: {
                                                        float f6;
                                                        float f7;
                                                        block111: {
                                                            block112: {
                                                                int n2;
                                                                block109: {
                                                                    block110: {
                                                                        bc_$fod bc_$fod6;
                                                                        block107: {
                                                                            block108: {
                                                                                bc_$fod bc_$fod7;
                                                                                block106: {
                                                                                    boolean bl;
                                                                                    block104: {
                                                                                        block105: {
                                                                                            block102: {
                                                                                                block103: {
                                                                                                    block100: {
                                                                                                        block101: {
                                                                                                            block98: {
                                                                                                                block99: {
                                                                                                                    String string;
                                                                                                                    double d;
                                                                                                                    block125: {
                                                                                                                        block97: {
                                                                                                                            String[] stringArray2;
                                                                                                                            int n3;
                                                                                                                            block96: {
                                                                                                                                String string2;
                                                                                                                                double d2;
                                                                                                                                block124: {
                                                                                                                                    block95: {
                                                                                                                                        String[] stringArray3;
                                                                                                                                        block94: {
                                                                                                                                            int n4;
                                                                                                                                            int n5;
                                                                                                                                            int n6;
                                                                                                                                            block93: {
                                                                                                                                                block91: {
                                                                                                                                                    block122: {
                                                                                                                                                        block89: {
                                                                                                                                                            int n7;
                                                                                                                                                            int n8;
                                                                                                                                                            block90: {
                                                                                                                                                                block88: {
                                                                                                                                                                    int n9;
                                                                                                                                                                    block86: {
                                                                                                                                                                        block87: {
                                                                                                                                                                            l = a ^ 0x8BE14DA365AL;
                                                                                                                                                                            n = t9d.b();
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    n9 = stringArray.length;
                                                                                                                                                                                    if (n == 0) break block86;
                                                                                                                                                                                    if (n9 < 1) {
                                                                                                                                                                                    }
                                                                                                                                                                                    break block87;
                                                                                                                                                                                }
                                                                                                                                                                                catch (oov oov2) {
                                                                                                                                                                                    throw c7a.a(oov2);
                                                                                                                                                                                }
                                                                                                                                                                                throw new w57((String)((Object)c7a.b("c", (int)3218, (long)(0x26F125958E7BBAE9L ^ l))), new Object[0]);
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov oov3) {
                                                                                                                                                                                throw c7a.a(oov3);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        n9 = 0;
                                                                                                                                                                    }
                                                                                                                                                                    n6 = n9;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            n8 = stringArray.length;
                                                                                                                                                                            n7 = 2;
                                                                                                                                                                            if (n == 0) break block88;
                                                                                                                                                                            if (n8 == n7) break block89;
                                                                                                                                                                        }
                                                                                                                                                                        catch (oov oov4) {
                                                                                                                                                                            throw c7a.a(oov4);
                                                                                                                                                                        }
                                                                                                                                                                        n8 = stringArray.length;
                                                                                                                                                                        n7 = 4;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov oov5) {
                                                                                                                                                                        throw c7a.a(oov5);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        if (n == 0) break block90;
                                                                                                                                                                        if (n8 == n7) break block89;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov oov6) {
                                                                                                                                                                        throw c7a.a(oov6);
                                                                                                                                                                    }
                                                                                                                                                                    n8 = stringArray.length;
                                                                                                                                                                    n7 = 6;
                                                                                                                                                                }
                                                                                                                                                                catch (oov oov7) {
                                                                                                                                                                    throw c7a.a(oov7);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            if (n8 == n7) break block89;
                                                                                                                                                            i2h3 = c7a.cfc(e7r2);
                                                                                                                                                            if (n != 0) break block122;
                                                                                                                                                        }
                                                                                                                                                        i2h3 = c7a.kot(e7r2, stringArray[0]);
                                                                                                                                                        n6 = 1;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            n5 = stringArray.length;
                                                                                                                                                            n4 = 1;
                                                                                                                                                            if (n == 0) break block91;
                                                                                                                                                            if (n5 == n4) break block92;
                                                                                                                                                        }
                                                                                                                                                        catch (oov oov8) {
                                                                                                                                                            throw c7a.a(oov8);
                                                                                                                                                        }
                                                                                                                                                        n5 = stringArray.length;
                                                                                                                                                        n4 = 2;
                                                                                                                                                    }
                                                                                                                                                    catch (oov oov9) {
                                                                                                                                                        throw c7a.a(oov9);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (n == 0) break block93;
                                                                                                                                                        if (n5 == n4) break block92;
                                                                                                                                                    }
                                                                                                                                                    catch (oov oov10) {
                                                                                                                                                        throw c7a.a(oov10);
                                                                                                                                                    }
                                                                                                                                                    n5 = stringArray.length;
                                                                                                                                                    n4 = n6 + 3;
                                                                                                                                                }
                                                                                                                                                catch (oov oov11) {
                                                                                                                                                    throw c7a.a(oov11);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (n5 < n4) {
                                                                                                                                                    throw new w57((String)((Object)c7a.b("c", (int)8908, (long)(0x657F56F7865C94B6L ^ l))), new Object[0]);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            catch (oov oov12) {
                                                                                                                                                throw c7a.a(oov12);
                                                                                                                                            }
                                                                                                                                            if (i2h3.oay == null) break block123;
                                                                                                                                            n3 = n6 + 1;
                                                                                                                                            bc_$fod3 = c7a.x3v(i2h3.o2v, stringArray[n6], true);
                                                                                                                                            bc_$fod2 = c7a.xz0(i2h3.kfp, stringArray[n3++], 0, 0, false);
                                                                                                                                            bc_$fod = c7a.x3v(i2h3.vbd, stringArray[n3++], true);
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    d2 = i2h3.x5k;
                                                                                                                                                    stringArray3 = stringArray;
                                                                                                                                                    if (n == 0) break block94;
                                                                                                                                                    if (stringArray3.length <= n3) break block95;
                                                                                                                                                }
                                                                                                                                                catch (oov oov13) {
                                                                                                                                                    throw c7a.a(oov13);
                                                                                                                                                }
                                                                                                                                                stringArray3 = stringArray;
                                                                                                                                            }
                                                                                                                                            catch (oov oov14) {
                                                                                                                                                throw c7a.a(oov14);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        string2 = stringArray3[n3++];
                                                                                                                                        break block124;
                                                                                                                                    }
                                                                                                                                    string2 = "~";
                                                                                                                                }
                                                                                                                                bc_$fod5 = c7a.x3v(d2, string2, false);
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        d = i2h3.y2i;
                                                                                                                                        stringArray2 = stringArray;
                                                                                                                                        if (n == 0) break block96;
                                                                                                                                        if (stringArray2.length <= n3) break block97;
                                                                                                                                    }
                                                                                                                                    catch (oov oov15) {
                                                                                                                                        throw c7a.a(oov15);
                                                                                                                                    }
                                                                                                                                    stringArray2 = stringArray;
                                                                                                                                }
                                                                                                                                catch (oov oov16) {
                                                                                                                                    throw c7a.a(oov16);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            string = stringArray2[n3];
                                                                                                                            break block125;
                                                                                                                        }
                                                                                                                        string = "~";
                                                                                                                    }
                                                                                                                    bc_$fod4 = c7a.x3v(d, string, false);
                                                                                                                    if (!(i2h3 instanceof z96)) break block126;
                                                                                                                    enumSet = EnumSet.noneOf(S08PacketPlayerPosLook$bdv.class);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            bl = bc_$fod3.yee();
                                                                                                                            if (n == 0) break block98;
                                                                                                                            if (!bl) break block99;
                                                                                                                        }
                                                                                                                        catch (oov oov17) {
                                                                                                                            throw c7a.a(oov17);
                                                                                                                        }
                                                                                                                        enumSet.add(S08PacketPlayerPosLook$bdv.uws);
                                                                                                                    }
                                                                                                                    catch (oov oov18) {
                                                                                                                        throw c7a.a(oov18);
                                                                                                                    }
                                                                                                                }
                                                                                                                bl = bc_$fod2.yee();
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (n == 0) break block100;
                                                                                                                    if (!bl) break block101;
                                                                                                                }
                                                                                                                catch (oov oov19) {
                                                                                                                    throw c7a.a(oov19);
                                                                                                                }
                                                                                                                enumSet.add(S08PacketPlayerPosLook$bdv.yu5);
                                                                                                            }
                                                                                                            catch (oov oov20) {
                                                                                                                throw c7a.a(oov20);
                                                                                                            }
                                                                                                        }
                                                                                                        bl = bc_$fod.yee();
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (n == 0) break block102;
                                                                                                            if (!bl) break block103;
                                                                                                        }
                                                                                                        catch (oov oov21) {
                                                                                                            throw c7a.a(oov21);
                                                                                                        }
                                                                                                        enumSet.add(S08PacketPlayerPosLook$bdv.qh1);
                                                                                                    }
                                                                                                    catch (oov oov22) {
                                                                                                        throw c7a.a(oov22);
                                                                                                    }
                                                                                                }
                                                                                                bl = bc_$fod4.yee();
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (n == 0) break block104;
                                                                                                    if (!bl) break block105;
                                                                                                }
                                                                                                catch (oov oov23) {
                                                                                                    throw c7a.a(oov23);
                                                                                                }
                                                                                                enumSet.add(S08PacketPlayerPosLook$bdv.ybj);
                                                                                            }
                                                                                            catch (oov oov24) {
                                                                                                throw c7a.a(oov24);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            bc_$fod7 = bc_$fod5;
                                                                                            if (n == 0) break block106;
                                                                                            bl = bc_$fod7.yee();
                                                                                        }
                                                                                        catch (oov oov25) {
                                                                                            throw c7a.a(oov25);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (bl) {
                                                                                            enumSet.add(S08PacketPlayerPosLook$bdv.a76);
                                                                                        }
                                                                                    }
                                                                                    catch (oov oov26) {
                                                                                        throw c7a.a(oov26);
                                                                                    }
                                                                                    bc_$fod7 = bc_$fod5;
                                                                                }
                                                                                f2 = (float)bc_$fod7.mqk();
                                                                                try {
                                                                                    bc_$fod6 = bc_$fod5;
                                                                                    if (n == 0) break block107;
                                                                                    if (bc_$fod6.yee()) break block108;
                                                                                }
                                                                                catch (oov oov27) {
                                                                                    throw c7a.a(oov27);
                                                                                }
                                                                                f2 = fe6.qsy(f2);
                                                                            }
                                                                            bc_$fod6 = bc_$fod4;
                                                                        }
                                                                        f5 = (float)bc_$fod6.mqk();
                                                                        try {
                                                                            n2 = bc_$fod4.yee();
                                                                            if (n == 0) break block109;
                                                                            if (n2 != 0) break block110;
                                                                        }
                                                                        catch (oov oov28) {
                                                                            throw c7a.a(oov28);
                                                                        }
                                                                        f5 = fe6.qsy(f5);
                                                                    }
                                                                    try {
                                                                        f7 = f5;
                                                                        f6 = 90.0f;
                                                                        if (n == 0) break block111;
                                                                        float f8 = f7 - f6;
                                                                        n2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                                                    }
                                                                    catch (oov oov29) {
                                                                        throw c7a.a(oov29);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (n2 > 0) break block112;
                                                                        f7 = f5;
                                                                        f6 = -90.0f;
                                                                        if (n == 0) break block111;
                                                                    }
                                                                    catch (oov oov30) {
                                                                        throw c7a.a(oov30);
                                                                    }
                                                                    if (!(f7 < f6)) break block113;
                                                                }
                                                                catch (oov oov31) {
                                                                    throw c7a.a(oov31);
                                                                }
                                                            }
                                                            f5 = fe6.qsy(180.0f - f5);
                                                            f7 = f2;
                                                            f6 = 180.0f;
                                                        }
                                                        f2 = fe6.qsy(f7 + f6);
                                                    }
                                                    i2h3.nw9(null);
                                                    ((z96)i2h3).rhh.imd(bc_$fod3.mqk(), bc_$fod2.mqk(), bc_$fod.mqk(), f2, f5, enumSet);
                                                    i2h3.jo1(f2);
                                                    if (n != 0) break block127;
                                                }
                                                f = (float)fe6.lrs(bc_$fod5.bz1());
                                                f2 = (float)fe6.lrs(bc_$fod4.bz1());
                                                try {
                                                    try {
                                                        try {
                                                            f4 = f2;
                                                            f3 = 90.0f;
                                                            if (n == 0) break block114;
                                                            if (f4 > f3) break block115;
                                                        }
                                                        catch (oov oov32) {
                                                            throw c7a.a(oov32);
                                                        }
                                                        f4 = f2;
                                                        f3 = -90.0f;
                                                        if (n == 0) break block114;
                                                    }
                                                    catch (oov oov33) {
                                                        throw c7a.a(oov33);
                                                    }
                                                    if (!(f4 < f3)) break block116;
                                                }
                                                catch (oov oov34) {
                                                    throw c7a.a(oov34);
                                                }
                                            }
                                            f2 = fe6.qsy(180.0f - f2);
                                            f4 = f;
                                            f3 = 180.0f;
                                        }
                                        f = fe6.qsy(f4 + f3);
                                    }
                                    i2h3.x24(bc_$fod3.bz1(), bc_$fod2.bz1(), bc_$fod.bz1(), f, f2);
                                    i2h3.jo1(f);
                                }
                                c7a.wxl(e7r2, this, (String)((Object)c7a.b("c", (int)29078, (long)(0x5FD8B0A53FD047E9L ^ l))), new Object[]{i2h3.noc(), bc_$fod3.bz1(), bc_$fod2.bz1(), bc_$fod.bz1()});
                                if (n != 0) break block123;
                            }
                            i2h2 = c7a.kot(e7r2, stringArray[stringArray.length - 1]);
                            try {
                                try {
                                    i2h4 = i2h2;
                                    if (n == 0) break block117;
                                    if (i2h4.oay != i2h3.oay) {
                                    }
                                    break block118;
                                }
                                catch (oov oov35) {
                                    throw c7a.a(oov35);
                                }
                                throw new uvb((String)((Object)c7a.b("c", (int)32376, (long)(0x2F35ADE13D1BC804L ^ l))), new Object[0]);
                            }
                            catch (oov oov36) {
                                throw c7a.a(oov36);
                            }
                        }
                        i2h3.nw9(null);
                        i2h4 = i2h3;
                    }
                    try {
                        block120: {
                            try {
                                try {
                                    if (n == 0) break block119;
                                    if (!(i2h4 instanceof z96)) break block120;
                                }
                                catch (oov oov37) {
                                    throw c7a.a(oov37);
                                }
                                ((z96)i2h3).rhh.ymx(i2h2.o2v, i2h2.kfp, i2h2.vbd, i2h2.x5k, i2h2.y2i);
                                if (n != 0) break block121;
                            }
                            catch (oov oov38) {
                                throw c7a.a(oov38);
                            }
                        }
                        i2h4 = i2h3;
                    }
                    catch (oov oov39) {
                        throw c7a.a(oov39);
                    }
                }
                i2h4.x24(i2h2.o2v, i2h2.kfp, i2h2.vbd, i2h2.x5k, i2h2.y2i);
            }
            c7a.wxl(e7r2, this, (String)((Object)c7a.b("c", (int)20794, (long)(0x3E929656DAC66747L ^ l))), new Object[]{i2h3.noc(), i2h2.noc()});
        }
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block10: {
            String[] stringArray2;
            block8: {
                block9: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                try {
                                    stringArray2 = stringArray;
                                    if (n == 0) break block8;
                                    if (stringArray2.length == 1) break block9;
                                }
                                catch (oov oov2) {
                                    throw c7a.a(oov2);
                                }
                                stringArray2 = stringArray;
                                if (n == 0) break block8;
                            }
                            catch (oov oov3) {
                                throw c7a.a(oov3);
                            }
                            if (stringArray2.length == 2) break block9;
                        }
                        catch (oov oov4) {
                            throw c7a.a(oov4);
                        }
                        list = null;
                        break block10;
                    }
                    catch (oov oov5) {
                        throw c7a.a(oov5);
                    }
                }
                stringArray2 = stringArray;
            }
            list = c7a.cqo(stringArray2, vr1._0v().p14());
        }
        return list;
    }

    @Override
    public boolean mp9(String[] stringArray, int n) {
        boolean bl;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    bl = n;
                    if (n2 != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw c7a.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                c7a.a = c.a(2442408963741847649L, 7315376809407608480L, MethodHandles.lookup().lookupClass()).a(82836020605505L);
                c7a.h = new HashMap<K, V>(13);
                var0 = c7a.a ^ 63184835507692L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "d\"o\u0011\u00df\u00cd\u00e4\u0094b\u0005\u00c5\r%\u00feN\u00a4\u00a0\u00c1\u00b1h\u00c5\u001dE\u009e\u00a6CTSe\u008ab\u008aLX\u008dnq\u009e<c\u00e5t\u001d\u0016T^KD\u0010\u000e\u00d0\u0094\u00ef\u00cc\u009b\u0010\u00e1\u00f3\u00d0\u00e9B\u0007\u00da>9(=\u0002\u0085Z^\u007fA\u0000\u0001\u0006Q\u001e\u00a4\u0090\u00b5\u00f4\u009dV\u00a00\u00b4\u00e8\u00bcS!\u0090dd\u00c82\u0004\u00cc\u0010z/\u00c0/\u00bd^R0\u0085\u00fb\u0096\u00e5\"*\u00eb\u008e4\u00b4\u00b7\u0084`1\u0016\u008c\u00e6D\u0091P@\u00de\u00c3\u00e2A\u00056\u0002\u0080\u0003k+\u0011\u0016\u0099J\u00d0\u00b2{\u00b6\u00d8\u008e\u00bd\u00c4\u00ace\u00c7p";
                var8_6 = "d\"o\u0011\u00df\u00cd\u00e4\u0094b\u0005\u00c5\r%\u00feN\u00a4\u00a0\u00c1\u00b1h\u00c5\u001dE\u009e\u00a6CTSe\u008ab\u008aLX\u008dnq\u009e<c\u00e5t\u001d\u0016T^KD\u0010\u000e\u00d0\u0094\u00ef\u00cc\u009b\u0010\u00e1\u00f3\u00d0\u00e9B\u0007\u00da>9(=\u0002\u0085Z^\u007fA\u0000\u0001\u0006Q\u001e\u00a4\u0090\u00b5\u00f4\u009dV\u00a00\u00b4\u00e8\u00bcS!\u0090dd\u00c82\u0004\u00cc\u0010z/\u00c0/\u00bd^R0\u0085\u00fb\u0096\u00e5\"*\u00eb\u008e4\u00b4\u00b7\u0084`1\u0016\u008c\u00e6D\u0091P@\u00de\u00c3\u00e2A\u00056\u0002\u0080\u0003k+\u0011\u0016\u0099J\u00d0\u00b2{\u00b6\u00d8\u008e\u00bd\u00c4\u00ace\u00c7p".length();
                var5_7 = 48;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = c7a.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0082\u009f\u00af\u00be\u0093\u00d2\r\u00e23?\u001a\u0083J\u00c0\u0095\u00e9\u00f0\u000b\u0094\u00db\u00c3\u00e7\u0002\u009a\u00c3\u00abcv\u0001\u008a\u0086`\u00fc$N\u0081\u00f9\u009d<\u00ba(\u008b2\u00ca\r\u00d2\u00f3\u00bf\u0081\u00eel\u00a34\u00fdpj\u00feMd\u00cf\u00f6\u00c2\u00f2U=\u00ac\u00fd\u00d0\u00ee\u00af\u000f\u00eb\u00d2\u00a20\u00ef\u0090\u00b3\u0014\u00b6X";
                    var8_6 = "\u0082\u009f\u00af\u00be\u0093\u00d2\r\u00e23?\u001a\u0083J\u00c0\u0095\u00e9\u00f0\u000b\u0094\u00db\u00c3\u00e7\u0002\u009a\u00c3\u00abcv\u0001\u008a\u0086`\u00fc$N\u0081\u00f9\u009d<\u00ba(\u008b2\u00ca\r\u00d2\u00f3\u00bf\u0081\u00eel\u00a34\u00fdpj\u00feMd\u00cf\u00f6\u00c2\u00f2U=\u00ac\u00fd\u00d0\u00ee\u00af\u000f\u00eb\u00d2\u00a20\u00ef\u0090\u00b3\u0014\u00b6X".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = c7a.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        c7a.c = var9_3;
        c7a.g = new String[6];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A21;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("c7a", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            c7a.g[n2] = c7a.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c7a.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("c7a" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c7a.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

