/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ar9
extends ar7 {
    public static c_3 yeh;
    private HashMap hr0;
    private HashMap vr7;
    private List xaq;
    private List ym0;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public ar9() {
        long l = a ^ 0x341629EAFD4AL;
        super((String)((Object)ar9.b("q", (int)7176, (long)(0x7D999D29731F33E8L ^ l))), _aj.p3z, yeh);
        this.hr0 = new HashMap();
        this.vr7 = new HashMap();
        this.xaq = new ArrayList();
        this.ym0 = new ArrayList();
        this.yse(true);
    }

    public static boolean uxl(g_3 g_32) {
        int n = t9d.c();
        for (Object e : ek1.c02().l0e()) {
            block10: {
                boolean bl;
                block12: {
                    GameProfile gameProfile;
                    block11: {
                        hv2 hv22;
                        hv2 hv23;
                        block9: {
                            hv23 = (hv2)e;
                            try {
                                hv22 = hv23;
                                if (n != 0) break block9;
                                if (hv22 == null) break block10;
                            }
                            catch (oov oov2) {
                                throw ar9.a(oov2);
                            }
                            hv22 = hv23;
                        }
                        try {
                            try {
                                gameProfile = hv22.pbs();
                                if (n != 0) break block11;
                                if (gameProfile == null) break block10;
                            }
                            catch (oov oov3) {
                                throw ar9.a(oov3);
                            }
                            gameProfile = hv23.pbs();
                        }
                        catch (oov oov4) {
                            throw ar9.a(oov4);
                        }
                    }
                    try {
                        bl = gameProfile.getName().contains(g_32.noc());
                        if (n != 0) break block12;
                        if (!bl) break block10;
                    }
                    catch (oov oov5) {
                        throw ar9.a(oov5);
                    }
                    bl = true;
                }
                return bl;
            }
            if (n == 0) continue;
        }
        return false;
    }

    private boolean sf6(ha9 ha92) {
        int n;
        block14: {
            boolean bl;
            block13: {
                n = t9d.b();
                try {
                    bl = ha92.h5u();
                    if (n == 0) break block13;
                    if (!bl) break block14;
                }
                catch (oov oov2) {
                    throw ar9.a(oov2);
                }
                bl = false;
            }
            return bl;
        }
        for (ha9 ha93 : uj3.o1c()) {
            block16: {
                boolean bl;
                block18: {
                    block17: {
                        ha9 ha94;
                        block15: {
                            try {
                                try {
                                    ha94 = ha93;
                                    if (n == 0) break block15;
                                    if (ha94 == ha92) break block16;
                                }
                                catch (oov oov3) {
                                    throw ar9.a(oov3);
                                }
                                ha94 = ha93;
                            }
                            catch (oov oov4) {
                                throw ar9.a(oov4);
                            }
                        }
                        try {
                            try {
                                bl = ha94.h5u();
                                if (n == 0) break block17;
                                if (!bl) break block16;
                            }
                            catch (oov oov5) {
                                throw ar9.a(oov5);
                            }
                            double d = (double)ha92.tm6(ha93) - 3.0;
                            bl = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                        }
                        catch (oov oov6) {
                            throw ar9.a(oov6);
                        }
                    }
                    try {
                        if (n == 0) break block18;
                        if (bl >= false) break block16;
                    }
                    catch (oov oov7) {
                        throw ar9.a(oov7);
                    }
                    bl = true;
                }
                return bl;
            }
            if (n != 0) continue;
        }
        return false;
    }

    @jev
    public void qx_(ccn ccn2) {
        long l = a ^ 0x541B77BE15EAL;
        this.n5o(this.m2d() + (String)((Object)ar9.b("q", (int)16039, (long)(0x73CCF318ADA4F9FDL ^ l))) + yeh.d7c());
        Iterator iterator = uj3.o1c().iterator();
        int n = t9d.c();
        while (iterator.hasNext()) {
            block12: {
                int n2;
                String string;
                block11: {
                    block9: {
                        ha9 ha92;
                        block10: {
                            ha92 = (ha9)iterator.next();
                            string = syo.fan(ha92.noc());
                            try {
                                try {
                                    n2 = this.hr0.containsKey(string);
                                    if (n != 0) break block9;
                                    if (n2 != 0) break block10;
                                }
                                catch (oov oov2) {
                                    throw ar9.a(oov2);
                                }
                                this.hr0.put(string, 0);
                            }
                            catch (oov oov3) {
                                throw ar9.a(oov3);
                            }
                        }
                        n2 = ar9.uxl(ha92);
                    }
                    try {
                        try {
                            if (n != 0) break block11;
                            if (n2 == 0) break block12;
                        }
                        catch (oov oov4) {
                            throw ar9.a(oov4);
                        }
                        n2 = (Integer)this.hr0.get(string);
                    }
                    catch (oov oov5) {
                        throw ar9.a(oov5);
                    }
                }
                int n3 = n2;
                this.hr0.remove(string);
                this.hr0.put(string, n3 + 1);
            }
            if (n == 0) continue;
        }
    }

    @jev
    public void vic(axn axn2) {
        this.hr0.clear();
        this.xaq.clear();
        this.vr7.clear();
        this.ym0.clear();
    }

    public boolean kh5(g_3 g_32) {
        int n;
        block118: {
            block119: {
                int n2;
                block116: {
                    long l;
                    block117: {
                        block114: {
                            block115: {
                                block112: {
                                    block113: {
                                        block110: {
                                            block108: {
                                                block109: {
                                                    block106: {
                                                        block104: {
                                                            block105: {
                                                                block102: {
                                                                    block103: {
                                                                        block100: {
                                                                            block101: {
                                                                                block98: {
                                                                                    block99: {
                                                                                        block96: {
                                                                                            block97: {
                                                                                                block94: {
                                                                                                    block95: {
                                                                                                        block92: {
                                                                                                            block93: {
                                                                                                                g_3 g_33;
                                                                                                                block90: {
                                                                                                                    block91: {
                                                                                                                        block88: {
                                                                                                                            block89: {
                                                                                                                                l = a ^ 0x114A294B5C41L;
                                                                                                                                n2 = t9d.b();
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        g_33 = g_32;
                                                                                                                                        if (n2 == 0) break block88;
                                                                                                                                        if (g_33 != null) break block89;
                                                                                                                                    }
                                                                                                                                    catch (oov oov2) {
                                                                                                                                        throw ar9.a(oov2);
                                                                                                                                    }
                                                                                                                                    return true;
                                                                                                                                }
                                                                                                                                catch (oov oov3) {
                                                                                                                                    throw ar9.a(oov3);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            g_33 = g_32;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (n2 == 0) break block90;
                                                                                                                                if (g_33 != ar9.ek1.vg8) break block91;
                                                                                                                            }
                                                                                                                            catch (oov oov4) {
                                                                                                                                throw ar9.a(oov4);
                                                                                                                            }
                                                                                                                            return true;
                                                                                                                        }
                                                                                                                        catch (oov oov5) {
                                                                                                                            throw ar9.a(oov5);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    g_33 = g_32;
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        n = g_33 instanceof ha9;
                                                                                                                        if (n2 == 0) break block92;
                                                                                                                        if (n != 0) break block93;
                                                                                                                    }
                                                                                                                    catch (oov oov6) {
                                                                                                                        throw ar9.a(oov6);
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                                catch (oov oov7) {
                                                                                                                    throw ar9.a(oov7);
                                                                                                                }
                                                                                                            }
                                                                                                            n = g_32.qur;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (n2 == 0) break block94;
                                                                                                                if (n <= 0) break block95;
                                                                                                            }
                                                                                                            catch (oov oov8) {
                                                                                                                throw ar9.a(oov8);
                                                                                                            }
                                                                                                            return true;
                                                                                                        }
                                                                                                        catch (oov oov9) {
                                                                                                            throw ar9.a(oov9);
                                                                                                        }
                                                                                                    }
                                                                                                    n = g_32.gzr() ? 1 : 0;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        if (n2 == 0) break block96;
                                                                                                        if (n != 0) break block97;
                                                                                                    }
                                                                                                    catch (oov oov10) {
                                                                                                        throw ar9.a(oov10);
                                                                                                    }
                                                                                                    return true;
                                                                                                }
                                                                                                catch (oov oov11) {
                                                                                                    throw ar9.a(oov11);
                                                                                                }
                                                                                            }
                                                                                            float f = g_32.i55() - 0.0f;
                                                                                            n = (f == 0.0f ? 0 : (f < 0.0f ? -1 : 1)) ? 1 : 0;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (n2 == 0) break block98;
                                                                                                if (n >= 0) break block99;
                                                                                            }
                                                                                            catch (oov oov12) {
                                                                                                throw ar9.a(oov12);
                                                                                            }
                                                                                            return true;
                                                                                        }
                                                                                        catch (oov oov13) {
                                                                                            throw ar9.a(oov13);
                                                                                        }
                                                                                    }
                                                                                    n = g_32.ma9 ? 1 : 0;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (n2 == 0) break block100;
                                                                                        if (n == 0) break block101;
                                                                                    }
                                                                                    catch (oov oov14) {
                                                                                        throw ar9.a(oov14);
                                                                                    }
                                                                                    return true;
                                                                                }
                                                                                catch (oov oov15) {
                                                                                    throw ar9.a(oov15);
                                                                                }
                                                                            }
                                                                            n = g_32.ofg() ? 1 : 0;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (n2 == 0) break block102;
                                                                                if (n == 0) break block103;
                                                                            }
                                                                            catch (oov oov16) {
                                                                                throw ar9.a(oov16);
                                                                            }
                                                                            return true;
                                                                        }
                                                                        catch (oov oov17) {
                                                                            throw ar9.a(oov17);
                                                                        }
                                                                    }
                                                                    n = yeh.d7c().equals(ar9.b("q", (int)7312, (long)(0x57820FA9ADBF927EL ^ l))) ? 1 : 0;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (n2 == 0) break block104;
                                                                                if (n == 0) break block105;
                                                                            }
                                                                            catch (oov oov18) {
                                                                                throw ar9.a(oov18);
                                                                            }
                                                                            n = g_32.jwu();
                                                                            if (n2 == 0) break block104;
                                                                        }
                                                                        catch (oov oov19) {
                                                                            throw ar9.a(oov19);
                                                                        }
                                                                        if (n <= 1000000) break block105;
                                                                    }
                                                                    catch (oov oov20) {
                                                                        throw ar9.a(oov20);
                                                                    }
                                                                    return true;
                                                                }
                                                                catch (oov oov21) {
                                                                    throw ar9.a(oov21);
                                                                }
                                                            }
                                                            n = yeh.d7c().equals(ar9.b("q", (int)32384, (long)(0x2F322BA33855F061L ^ l))) ? 1 : 0;
                                                        }
                                                        try {
                                                            block107: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n2 == 0) break block106;
                                                                            if (n != 0) break block107;
                                                                        }
                                                                        catch (oov oov22) {
                                                                            throw ar9.a(oov22);
                                                                        }
                                                                        n = yeh.d7c().equals(ar9.b("q", (int)2079, (long)(0x4353E9180B786F7L ^ l))) ? 1 : 0;
                                                                        if (n2 == 0) break block108;
                                                                    }
                                                                    catch (oov oov23) {
                                                                        throw ar9.a(oov23);
                                                                    }
                                                                    if (n == 0) break block109;
                                                                }
                                                                catch (oov oov24) {
                                                                    throw ar9.a(oov24);
                                                                }
                                                            }
                                                            n = ar9.uxl(g_32) ? 1 : 0;
                                                        }
                                                        catch (oov oov25) {
                                                            throw ar9.a(oov25);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (n2 == 0) break block108;
                                                            if (n != 0) break block109;
                                                        }
                                                        catch (oov oov26) {
                                                            throw ar9.a(oov26);
                                                        }
                                                        return true;
                                                    }
                                                    catch (oov oov27) {
                                                        throw ar9.a(oov27);
                                                    }
                                                }
                                                n = yeh.d7c().equals(ar9.b("q", (int)2079, (long)(0x4353E9180B786F7L ^ l))) ? 1 : 0;
                                            }
                                            try {
                                                block111: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n2 == 0) break block110;
                                                                if (n != 0) break block111;
                                                            }
                                                            catch (oov oov28) {
                                                                throw ar9.a(oov28);
                                                            }
                                                            n = yeh.d7c().equals(ar9.b("q", (int)14504, (long)(0x49AFC118F564B65AL ^ l))) ? 1 : 0;
                                                            if (n2 == 0) break block112;
                                                        }
                                                        catch (oov oov29) {
                                                            throw ar9.a(oov29);
                                                        }
                                                        if (n == 0) break block113;
                                                    }
                                                    catch (oov oov30) {
                                                        throw ar9.a(oov30);
                                                    }
                                                }
                                                n = ((ha9)g_32).g25;
                                            }
                                            catch (oov oov31) {
                                                throw ar9.a(oov31);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n2 == 0) break block112;
                                                if (n > 80) break block113;
                                            }
                                            catch (oov oov32) {
                                                throw ar9.a(oov32);
                                            }
                                            return true;
                                        }
                                        catch (oov oov33) {
                                            throw ar9.a(oov33);
                                        }
                                    }
                                    n = yeh.d7c().equals(ar9.b("q", (int)14504, (long)(0x49AFC118F564B65AL ^ l))) ? 1 : 0;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n2 == 0) break block114;
                                                if (n == 0) break block115;
                                            }
                                            catch (oov oov34) {
                                                throw ar9.a(oov34);
                                            }
                                            n = this.xaq.contains(g_32.jwu()) ? 1 : 0;
                                            if (n2 == 0) break block114;
                                        }
                                        catch (oov oov35) {
                                            throw ar9.a(oov35);
                                        }
                                        if (n != 0) break block115;
                                    }
                                    catch (oov oov36) {
                                        throw ar9.a(oov36);
                                    }
                                    return true;
                                }
                                catch (oov oov37) {
                                    throw ar9.a(oov37);
                                }
                            }
                            n = yeh.d7c().equals(ar9.b("q", (int)16196, (long)(0x36D4A5385A0831A7L ^ l))) ? 1 : 0;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n2 == 0) break block116;
                                        if (n == 0) break block117;
                                    }
                                    catch (oov oov38) {
                                        throw ar9.a(oov38);
                                    }
                                    n = this.sf6((ha9)g_32) ? 1 : 0;
                                    if (n2 == 0) break block116;
                                }
                                catch (oov oov39) {
                                    throw ar9.a(oov39);
                                }
                                if (n == 0) break block117;
                            }
                            catch (oov oov40) {
                                throw ar9.a(oov40);
                            }
                            return true;
                        }
                        catch (oov oov41) {
                            throw ar9.a(oov41);
                        }
                    }
                    n = yeh.d7c().equals(ar9.b("q", (int)32384, (long)(0x2F322BA33855F061L ^ l))) ? 1 : 0;
                }
                try {
                    try {
                        try {
                            try {
                                if (n2 == 0) break block118;
                                if (n == 0) break block119;
                            }
                            catch (oov oov42) {
                                throw ar9.a(oov42);
                            }
                            n = this.ym0.contains(g_32.jwu()) ? 1 : 0;
                            if (n2 == 0) break block118;
                        }
                        catch (oov oov43) {
                            throw ar9.a(oov43);
                        }
                        if (n == 0) break block119;
                    }
                    catch (oov oov44) {
                        throw ar9.a(oov44);
                    }
                    return true;
                }
                catch (oov oov45) {
                    throw ar9.a(oov45);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public static List ej6() {
        p_k p_k2 = ar9.ek1.vg8.lq7;
        ArrayList<ha9> arrayList = new ArrayList<ha9>();
        int n = t9d.c();
        new vg2(ek1, ar9.ek1.t43);
        List list = vg2.kq6.sortedCopy((Iterable)p_k2.l0e());
        for (Object e : list) {
            block6: {
                hv2 hv22 = (hv2)e;
                try {
                    try {
                        if (n != 0) break block6;
                        if (hv22 == null) {
                            continue;
                        }
                    }
                    catch (oov oov2) {
                        throw ar9.a(oov2);
                    }
                }
                catch (oov oov3) {
                    throw ar9.a(oov3);
                }
                arrayList.add(ar9.ek1.tij.aev(hv22.pbs().getName()));
            }
            if (n == 0) continue;
        }
        return arrayList;
    }

    public static boolean nqw(i2h i2h2) {
        boolean bl;
        block23: {
            block24: {
                int n;
                block21: {
                    String string;
                    long l;
                    block22: {
                        block20: {
                            boolean bl2;
                            block18: {
                                block19: {
                                    l = a ^ 0x786C5BB3E824L;
                                    n = t9d.c();
                                    try {
                                        try {
                                            try {
                                                bl2 = kgt.p71.klu();
                                                if (n != 0) break block18;
                                                if (!bl2) break block19;
                                            }
                                            catch (oov oov2) {
                                                throw ar9.a(oov2);
                                            }
                                            bl2 = yeh.wyk((String)((Object)ar9.b("q", (int)30441, (long)(0xAD7F9E1F27CC69L ^ l))));
                                            if (n != 0) break block18;
                                        }
                                        catch (oov oov3) {
                                            throw ar9.a(oov3);
                                        }
                                        if (bl2) break block20;
                                    }
                                    catch (oov oov4) {
                                        throw ar9.a(oov4);
                                    }
                                }
                                bl2 = false;
                            }
                            return bl2;
                        }
                        string = i2h2.xyw()._2o();
                        String string2 = i2h2.hei();
                        try {
                            try {
                                try {
                                    try {
                                        bl = string.startsWith("\u00a7");
                                        if (n != 0) break block21;
                                        if (bl) break block22;
                                    }
                                    catch (oov oov5) {
                                        throw ar9.a(oov5);
                                    }
                                    bl = string.endsWith((String)((Object)ar9.b("q", (int)18913, (long)(0x56FD6C54C1A7F36BL ^ l))));
                                    if (n != 0) break block21;
                                }
                                catch (oov oov6) {
                                    throw ar9.a(oov6);
                                }
                                if (!bl) break block22;
                            }
                            catch (oov oov7) {
                                throw ar9.a(oov7);
                            }
                            return true;
                        }
                        catch (oov oov8) {
                            throw ar9.a(oov8);
                        }
                    }
                    bl = string.contains((CharSequence)((Object)ar9.b("q", (int)5774, (long)(0x3002FA59D1F3AC0FL ^ l))));
                }
                try {
                    try {
                        if (n != 0) break block23;
                        if (!bl) break block24;
                    }
                    catch (oov oov9) {
                        throw ar9.a(oov9);
                    }
                    return true;
                }
                catch (oov oov10) {
                    throw ar9.a(oov10);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    @jev
    public void y8x(ccn var1_1) {
        block75: {
            block76: {
                block70: {
                    block71: {
                        var2_2 = ar9.a ^ 31305545870837L;
                        var4_3 = t9d.b();
                        try {
                            v0 = ar9.yeh.d7c().equals(ar9.b("q", (int)32384, (long)(3400823076905959893L ^ var2_2)));
                            if (var4_3 == 0) break block70;
                            if (!v0) break block71;
                        }
                        catch (oov v1) {
                            throw ar9.a(v1);
                        }
                        for (ha9 var6_5 : uj3.o1c()) {
                            block73: {
                                block74: {
                                    block72: {
                                        try {
                                            try {
                                                try {
                                                    v0 = this.vr7.containsKey(var6_5.jwu());
                                                    if (var4_3 == 0) break block70;
                                                    if (var4_3 == 0) break block72;
                                                }
                                                catch (oov v2) {
                                                    throw ar9.a(v2);
                                                }
                                                if (!v0) break block73;
                                            }
                                            catch (oov v3) {
                                                throw ar9.a(v3);
                                            }
                                            v4 = (Integer)this.vr7.get(var6_5.jwu());
                                        }
                                        catch (oov v5) {
                                            throw ar9.a(v5);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_3 == 0) break block74;
                                            if (v4 <= 40) break block73;
                                        }
                                        catch (oov v6) {
                                            throw ar9.a(v6);
                                        }
                                        v4 = opd.hfn(var6_5);
                                    }
                                    catch (oov v7) {
                                        throw ar9.a(v7);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_3 == 0) ** GOTO lbl53
                                        if (v4 == 0) break block73;
                                    }
                                    catch (oov v8) {
                                        throw ar9.a(v8);
                                    }
                                    v4 = (int)this.ym0.add(var6_5.jwu());
                                }
                                catch (oov v9) {
                                    throw ar9.a(v9);
                                }
lbl53:
                                // 2 sources

                                ncl.zpu((String)ar9.b("q", (int)24049, (long)(5876251222053741218L ^ var2_2)) + var6_5.xyw()._2o() + ")");
                            }
                            if (var4_3 != 0) continue;
                            break;
                        }
                    }
                    v0 = ar9.yeh.d7c().equals(ar9.b("q", (int)30441, (long)(48725453298780600L ^ var2_2)));
                }
                try {
                    if (var4_3 == 0) break block75;
                    if (!v0) break block76;
                }
                catch (oov v10) {
                    throw ar9.a(v10);
                }
                var5_4 = ar9.ek1.tij.rpk.iterator();
                while (var5_4.hasNext()) {
                    block78: {
                        block84: {
                            block83: {
                                block82: {
                                    block81: {
                                        block80: {
                                            block79: {
                                                block77: {
                                                    var6_5 = (ha9)var5_4.next();
                                                    try {
                                                        try {
                                                            try {
                                                                v11 = var6_5;
                                                                if (var4_3 != 0) {
                                                                    if (var4_3 == 0) break block77;
                                                                }
                                                                ** GOTO lbl-1000
                                                            }
                                                            catch (oov v12) {
                                                                throw ar9.a(v12);
                                                            }
                                                            if (v11 == ar9.ek1.vg8) break block78;
                                                        }
                                                        catch (oov v13) {
                                                            throw ar9.a(v13);
                                                        }
                                                        v14 = var6_5;
                                                    }
                                                    catch (oov v15) {
                                                        throw ar9.a(v15);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (v14 == null) break block78;
                                                            v16 = this.ej6().contains(var6_5);
                                                            if (var4_3 == 0) break block79;
                                                        }
                                                        catch (oov v17) {
                                                            throw ar9.a(v17);
                                                        }
                                                        if (v16) break block78;
                                                    }
                                                    catch (oov v18) {
                                                        throw ar9.a(v18);
                                                    }
                                                    v16 = var6_5.xyw()._2o().toLowerCase().contains((CharSequence)ar9.b("q", (int)19461, (long)(7448771076565496663L ^ var2_2)));
                                                }
                                                catch (oov v19) {
                                                    throw ar9.a(v19);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_3 == 0) break block80;
                                                    if (v16) break block78;
                                                }
                                                catch (oov v20) {
                                                    throw ar9.a(v20);
                                                }
                                                v16 = var6_5.xyw()._2o().startsWith("\u00a7");
                                            }
                                            catch (oov v21) {
                                                throw ar9.a(v21);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var4_3 == 0) break block81;
                                                if (!v16) break block78;
                                            }
                                            catch (oov v22) {
                                                throw ar9.a(v22);
                                            }
                                            v16 = var6_5.gzr();
                                        }
                                        catch (oov v23) {
                                            throw ar9.a(v23);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var4_3 == 0) break block82;
                                            if (!v16) break block78;
                                        }
                                        catch (oov v24) {
                                            throw ar9.a(v24);
                                        }
                                        v16 = ar9.nqw(var6_5);
                                    }
                                    catch (oov v25) {
                                        throw ar9.a(v25);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var4_3 == 0) break block83;
                                            if (v16) break block78;
                                        }
                                        catch (oov v26) {
                                            throw ar9.a(v26);
                                        }
                                        v27 = var6_5;
                                        if (var4_3 == 0) break block84;
                                    }
                                    catch (oov v28) {
                                        throw ar9.a(v28);
                                    }
                                    v16 = v27.h5u();
                                }
                                catch (oov v29) {
                                    throw ar9.a(v29);
                                }
                            }
                            if (!v16) break block78;
                            v27 = var6_5;
                        }
                        ncl.zpu(v27);
                        ar9.ek1.tij.rqa(var6_5);
                    }
                    if (var4_3 != 0) continue;
                }
            }
            v0 = this.xaq.addAll((Collection)uj3.o1c().stream().filter((Predicate<ha9>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, b8_(ha9 ), (Lha9;)Z)((ar9)this)).map((Function<ha9, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, jwu(), (Lha9;)Ljava/lang/Integer;)()).collect(Collectors.toList()));
        }
        for (ha9 v11 : uj3.o1c()) lbl-1000:
        // 2 sources

        {
            block87: {
                block85: {
                    block86: {
                        var6_5 = v11;
                        try {
                            try {
                                v30 = this.vr7.containsKey(var6_5.jwu());
                                if (var4_3 == 0) break block85;
                                if (v30) break block86;
                            }
                            catch (oov v31) {
                                throw ar9.a(v31);
                            }
                            this.vr7.put(var6_5.jwu(), 0);
                        }
                        catch (oov v32) {
                            throw ar9.a(v32);
                        }
                    }
                    try {
                        v33 = var6_5;
                        if (var4_3 == 0) break block87;
                        v30 = v33.h5u();
                    }
                    catch (oov v34) {
                        throw ar9.a(v34);
                    }
                }
                try {
                    block88: {
                        try {
                            try {
                                try {
                                    if (!v30) break block88;
                                    v33 = var6_5;
                                    if (var4_3 == 0) break block87;
                                }
                                catch (oov v35) {
                                    throw ar9.a(v35);
                                }
                                if (!opd.hfn((g_3)v33)) break block88;
                            }
                            catch (oov v36) {
                                throw ar9.a(v36);
                            }
                            this.vr7.put(var6_5.jwu(), (Integer)this.vr7.get(var6_5.jwu()) + 1);
                            if (var4_3 != 0) break block87;
                        }
                        catch (oov v37) {
                            throw ar9.a(v37);
                        }
                    }
                    v33 = this.vr7.put(var6_5.jwu(), 0);
                }
                catch (oov v38) {
                    throw ar9.a(v38);
                }
            }
            if (var4_3 != 0) continue;
        }
    }

    private boolean rpb(ha9 ha92) {
        int n;
        block13: {
            block14: {
                m2j m2j2 = new m2j(ar9.ek1.vg8.o2v, ar9.ek1.vg8.kfp, ar9.ek1.vg8.vbd);
                m2j m2j3 = new m2j(ha92.o2v, ha92.kfp, ha92.vbd);
                int n2 = t9d.c();
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        n = ha92.g25;
                                        if (n2 != 0) break block13;
                                        if (n <= 20) {
                                        }
                                        break block14;
                                    }
                                    catch (oov oov2) {
                                        throw ar9.a(oov2);
                                    }
                                    double d = ha92.kfp - ar9.ek1.vg8.kfp - 8.0;
                                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                    if (n2 != 0) break block13;
                                }
                                catch (oov oov3) {
                                    throw ar9.a(oov3);
                                }
                                if (n <= 0) break block14;
                            }
                            catch (oov oov4) {
                                throw ar9.a(oov4);
                            }
                            double d = m2j2.w9e(m2j3) - 3.5;
                            n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                            if (n2 != 0) break block13;
                        }
                        catch (oov oov5) {
                            throw ar9.a(oov5);
                        }
                        if (n >= 0) break block14;
                    }
                    catch (oov oov6) {
                        throw ar9.a(oov6);
                    }
                    return true;
                }
                catch (oov oov7) {
                    throw ar9.a(oov7);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    private boolean b8_(ha9 ha92) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            bl = ha92.lfk;
                            if (n == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw ar9.a(oov2);
                        }
                        bl = this.xaq.contains(ha92.jwu());
                    }
                    catch (oov oov3) {
                        throw ar9.a(oov3);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (bl) break block7;
                }
                catch (oov oov4) {
                    throw ar9.a(oov4);
                }
                bl = true;
                break block8;
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

                ar9.a = c.a(-5414567387106008062L, 5255770735402904106L, MethodHandles.lookup().lookupClass()).a(9370370706258L);
                var9 = ar9.a ^ 5750290282680L;
                ar9.h = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[20];
                var5_4 = 0;
                var4_5 = "\u0018\u00de\u00d2~z\u00b3\u00d0V@q\u00ec \u00c2\u00ae\u00dbd\u008a\u00f2\u0018m\u00d0\u00db\u0084S\u00d3\u0092\u009f\u00c9\u00ec\u00e0\u0015\u0014\u0010\u0091\u00c4\u009d\u00fbJo%\u00b5<\u00acdw\u00d4\u00b9\u0001\u009a\u0010W9\u00f9\u007f\u00ae13\u00e0c\u00d9\u00d86-t\u00b1o U\u00c5\u00d6\u00a1R\u00d5\u009c\u00dc\u00e6\u00d5\u00bb\\\u00d8\u00c8\u0092\u00bb\u00e1\u00171\u00173\u00e8\u008a\u0015\u0002#\u00f8\u00bc\u00ec\u00d91\u00f7\u0010s\u0084\u0081\u00c0!\u0005\u00d1ah\u0004\u0084[\u00c1\u00823M0o\u00c9\u00a9\u0010\u00ab\u0095\u00ac\r\u0007\u00a1\u009c&\u00d2u\u00b3f\u00e9B\t7D\u0006\u00b6\u00b2\u00db\u00a4\u00a3\u00fdF7g\b/\u0097\u00c4w\u008aT9s\u00b5B>vu\u001c\u00a61\u0010\u00c9\u00a2\u00d3\u00ac:\u00ab\u00e5\u00c4b\u00c0\u0016y\u00d9\u00db\u0080\u0018\u0010\u00f4\u00a5\u00e5\u00d4\u0081N\u00b3^\u00d6\u00fd\u00d3L\u00ed'\r/\u0018\u00f6\u0005\u00e4\u00f5o\u000b\u00d3/9$]T{r\u00abI\u00d3>Y\u00b3P\u00ecl\u0001 EWJ\u00d4\u0097Z\u001ch\u000f)\u00c5\u00b0\u00ce(\u00ab\u0013\u0001w\u00b5\u008a\u00bdO\u0012=VB\u0093\u00c6\u00ae\u00d2\"\u00f8\u0010\u0018\u0080\u00cb3\u001e1\u001cR\u00c2 \u00db4\u00ca\u0081(\f\u0010\u0017\u00f8\u00ec\u00ee5C\u00e0\u00f0\u00f4$+\u0090\u00cd\u00cf\u00ce\u0005\u0018\u00b4\u0000C\u00ea\u00f2\u0098y\u00e4y\u0098\u0087J\u00abs\u0015\u00f8\u008b\u0006\u00e9\u00b8q-\u0091N\u0010G\t\u00c6<-\u001dM/K\u0084\u00c9\u00c1\u00f2n\u0014\u00fe \u00e1L\u00d9\u009a\u00e4\u00day\u00f51\u00f3\u0083\u00ea\n\u0000_\u00fb~Pr_T1B*.j\u0081\r\u00a0\u009c}\u00d7\u0010\u00ed\u00b1\u0005\u001a\u009c3\u0004[\u00c03\u00f7g\u00a1\"\u00e0C q:\u00a7o\u00d7\u00e4l\u0001\u0097\u00eciy\u00ef,7\u00e7\u0098\r\u00db\u0011\u00b2\u008d\u00ff\u00c1z\u00b7(^p\\#5\u0018\"/\u00d6\u00f1\u00dc\u0011R\u00d6\u00ea\u00c0)\u00ca\u00b7\u0005\u0010\u00fc<\u00d0m0\u00ae\"\u00b3S";
                var6_6 = "\u0018\u00de\u00d2~z\u00b3\u00d0V@q\u00ec \u00c2\u00ae\u00dbd\u008a\u00f2\u0018m\u00d0\u00db\u0084S\u00d3\u0092\u009f\u00c9\u00ec\u00e0\u0015\u0014\u0010\u0091\u00c4\u009d\u00fbJo%\u00b5<\u00acdw\u00d4\u00b9\u0001\u009a\u0010W9\u00f9\u007f\u00ae13\u00e0c\u00d9\u00d86-t\u00b1o U\u00c5\u00d6\u00a1R\u00d5\u009c\u00dc\u00e6\u00d5\u00bb\\\u00d8\u00c8\u0092\u00bb\u00e1\u00171\u00173\u00e8\u008a\u0015\u0002#\u00f8\u00bc\u00ec\u00d91\u00f7\u0010s\u0084\u0081\u00c0!\u0005\u00d1ah\u0004\u0084[\u00c1\u00823M0o\u00c9\u00a9\u0010\u00ab\u0095\u00ac\r\u0007\u00a1\u009c&\u00d2u\u00b3f\u00e9B\t7D\u0006\u00b6\u00b2\u00db\u00a4\u00a3\u00fdF7g\b/\u0097\u00c4w\u008aT9s\u00b5B>vu\u001c\u00a61\u0010\u00c9\u00a2\u00d3\u00ac:\u00ab\u00e5\u00c4b\u00c0\u0016y\u00d9\u00db\u0080\u0018\u0010\u00f4\u00a5\u00e5\u00d4\u0081N\u00b3^\u00d6\u00fd\u00d3L\u00ed'\r/\u0018\u00f6\u0005\u00e4\u00f5o\u000b\u00d3/9$]T{r\u00abI\u00d3>Y\u00b3P\u00ecl\u0001 EWJ\u00d4\u0097Z\u001ch\u000f)\u00c5\u00b0\u00ce(\u00ab\u0013\u0001w\u00b5\u008a\u00bdO\u0012=VB\u0093\u00c6\u00ae\u00d2\"\u00f8\u0010\u0018\u0080\u00cb3\u001e1\u001cR\u00c2 \u00db4\u00ca\u0081(\f\u0010\u0017\u00f8\u00ec\u00ee5C\u00e0\u00f0\u00f4$+\u0090\u00cd\u00cf\u00ce\u0005\u0018\u00b4\u0000C\u00ea\u00f2\u0098y\u00e4y\u0098\u0087J\u00abs\u0015\u00f8\u008b\u0006\u00e9\u00b8q-\u0091N\u0010G\t\u00c6<-\u001dM/K\u0084\u00c9\u00c1\u00f2n\u0014\u00fe \u00e1L\u00d9\u009a\u00e4\u00day\u00f51\u00f3\u0083\u00ea\n\u0000_\u00fb~Pr_T1B*.j\u0081\r\u00a0\u009c}\u00d7\u0010\u00ed\u00b1\u0005\u001a\u009c3\u0004[\u00c03\u00f7g\u00a1\"\u00e0C q:\u00a7o\u00d7\u00e4l\u0001\u0097\u00eciy\u00ef,7\u00e7\u0098\r\u00db\u0011\u00b2\u008d\u00ff\u00c1z\u00b7(^p\\#5\u0018\"/\u00d6\u00f1\u00dc\u0011R\u00d6\u00ea\u00c0)\u00ca\u00b7\u0005\u0010\u00fc<\u00d0m0\u00ae\"\u00b3S".length();
                var3_7 = 32;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = ar9.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "x\u00cb\u0080\u001aN\u00b3\n\u00c9|\u00c2\u0014\u00c4(1\u00d0\u00a6\u0010\u00a4QIV\u009bdA\u00c4d\u00f2X\u00d6X\u0091\u008db";
                    var6_6 = "x\u00cb\u0080\u001aN\u00b3\n\u00c9|\u00c2\u0014\u00c4(1\u00d0\u00a6\u0010\u00a4QIV\u009bdA\u00c4d\u00f2X\u00d6X\u0091\u008db".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = ar9.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        ar9.f = var7_3;
        ar9.g = new String[20];
        v7 = new String[6];
        v7[0] = ar9.b("q", (int)2079, (long)(303195697685897742L ^ var9));
        v7[1] = ar9.b("q", (int)31010, (long)(662879271820907313L ^ var9));
        v7[2] = ar9.b("q", (int)28740, (long)(7600265254699031124L ^ var9));
        v7[3] = ar9.b("q", (int)3566, (long)(7401801331245590517L ^ var9));
        v7[4] = ar9.b("q", (int)28640, (long)(41649110203745781L ^ var9));
        v7[5] = ar9.b("q", (int)3135, (long)(4563551251397387819L ^ var9));
        ar9.yeh = new c_3((String)ar9.b("q", (int)12319, (long)(2181446930000878101L ^ var9)), (String)ar9.b("q", (int)1774, (long)(1801691640781155559L ^ var9)), (String)ar9.b("q", (int)25068, (long)(1979425455354563573L ^ var9)), v7);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x23B7;
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
                throw new RuntimeException("ar9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            ar9.g[n2] = ar9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ar9.b(n, l);
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
            throw new RuntimeException("ar9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ar9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

