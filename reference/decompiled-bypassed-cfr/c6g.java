/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  io.netty.util.internal.ThreadLocalRandom
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import io.netty.util.internal.ThreadLocalRandom;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class c6g {
    private static final Marker brq;
    private static final Logger so4;
    private final dbu xfu;
    private final moh ue1;
    private c6g$p0f tli;
    private boolean q70;
    private int jm5;
    private final Map khm;
    private final Map eel;
    private Map wlh;
    private final Multimap qh8;
    private final List q8v;
    private final Map ift;
    private final Map mi5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public c6g(dbu dbu2, moh moh2) {
        long l = a ^ 0x6F24928FE26FL;
        this.jm5 = 0;
        this.khm = HashBiMap.create();
        this.eel = ((BiMap)this.khm).inverse();
        this.wlh = Maps.newHashMap();
        this.qh8 = HashMultimap.create();
        this.q8v = Lists.newArrayList();
        this.ift = Maps.newHashMap();
        this.mi5 = Maps.newHashMap();
        this.xfu = dbu2;
        this.ue1 = moh2;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec((String)((Object)c6g.a("h", (int)3034, (long)(0x74AD5A507A27A4BL ^ l))), CodecJOrbis.class);
        }
        catch (SoundSystemException soundSystemException) {
            so4.error(brq, (String)((Object)c6g.a("h", (int)22501, (long)(0x6F7071E9C1E7A67EL ^ l))), (Throwable)soundSystemException);
        }
    }

    public void x6t() {
        this.vg1();
        this.__v();
    }

    private synchronized void __v() {
        long l = a ^ 0x35838276DEFCL;
        if (!this.q70) {
            try {
                new Thread((Runnable)new c6g$1(this), (String)((Object)c6g.a("h", (int)6261, (long)(0x15315062DED1D57CL ^ l)))).start();
            }
            catch (RuntimeException runtimeException) {
                so4.error(brq, (String)((Object)c6g.a("h", (int)884, (long)(0x1B2C83454C46CE7FL ^ l))), (Throwable)runtimeException);
                this.ue1.sr7(xdt.adu, 0.0f);
                this.ue1.cmo();
            }
        }
    }

    private float j6s(xdt xdt2) {
        float f;
        block6: {
            block5: {
                xdt xdt3;
                block4: {
                    int n = t9d.c();
                    try {
                        xdt3 = xdt2;
                        if (n != 0) break block4;
                        if (xdt3 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                    xdt3 = xdt2;
                }
                try {
                    if (xdt3 == xdt.adu) break block5;
                    f = this.ue1.a8l(xdt2);
                    break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw c6g.a(runtimeException);
                }
            }
            f = 1.0f;
        }
        return f;
    }

    /*
     * Unable to fully structure code
     */
    public void zdh(xdt var1_1, float var2_2) {
        block13: {
            block14: {
                var3_3 = t9d.b();
                try {
                    try {
                        if (!this.q70) break block13;
                        if (var1_1 != xdt.adu) break block14;
                    }
                    catch (RuntimeException v0) {
                        throw c6g.a(v0);
                    }
                    this.tli.setMasterVolume(var2_2);
                    if (var3_3 != 0) break block13;
                }
                catch (RuntimeException v1) {
                    throw c6g.a(v1);
                }
            }
            for (String var5_5 : this.qh8.get((Object)var1_1)) {
                block16: {
                    block15: {
                        var6_6 = (jp4)this.khm.get(var5_5);
                        var7_7 = this.vvn(var6_6, (vas)this.wlh.get(var6_6), var1_1);
                        try {
                            try {
                                if (var3_3 == 0) break block15;
                                if (var7_7 <= 0.0f) {
                                }
                                ** GOTO lbl33
                            }
                            catch (RuntimeException v2) {
                                throw c6g.a(v2);
                            }
                            this.voc(var6_6);
                        }
                        catch (RuntimeException v3) {
                            throw c6g.a(v3);
                        }
                    }
                    try {
                        if (var3_3 != 0) break block16;
lbl33:
                        // 2 sources

                        this.tli.setVolume(var5_5, var7_7);
                    }
                    catch (RuntimeException v4) {
                        throw c6g.a(v4);
                    }
                }
                if (var3_3 != 0) continue;
            }
        }
    }

    public void vg1() {
        block5: {
            block4: {
                int n = t9d.b();
                try {
                    c6g c6g2;
                    try {
                        c6g2 = this;
                        if (n == 0) break block4;
                        if (!c6g2.q70) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                    this.u5s();
                    this.tli.cleanup();
                    c6g2 = this;
                }
                catch (RuntimeException runtimeException) {
                    throw c6g.a(runtimeException);
                }
            }
            c6g2.q70 = false;
        }
    }

    public void u5s() {
        block9: {
            block10: {
                c6g c6g2;
                int n;
                block8: {
                    n = t9d.b();
                    try {
                        try {
                            c6g2 = this;
                            if (n == 0) break block8;
                            if (!c6g2.q70) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw c6g.a(runtimeException);
                        }
                        c6g2 = this;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                }
                for (String string : c6g2.khm.keySet()) {
                    try {
                        this.tli.stop(string);
                        if (n != 0) {
                            if (n != 0) continue;
                            break;
                        }
                        break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                }
                this.khm.clear();
                this.ift.clear();
                this.q8v.clear();
                this.qh8.clear();
                this.wlh.clear();
            }
            this.mi5.clear();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void nf4() {
        block54: {
            var1_1 = c6g.a ^ 11259196203101L;
            var3_2 = t9d.c();
            try {
                block49: {
                    ++this.jm5;
                    var4_3 = this.q8v.iterator();
                    while (var4_3.hasNext()) {
                        block48: {
                            block47: {
                                block60: {
                                    block59: {
                                        var5_5 = (jzl)var4_3.next();
                                        var5_5._21();
                                        v0 /* !! */  = var5_5;
                                        if (var3_2 != 0) break block47;
                                        v1 = v0 /* !! */ .hku();
                                        if (var3_2 != 0) ** GOTO lbl46
                                        break block59;
                                        catch (RuntimeException v2) {
                                            throw c6g.a(v2);
                                        }
                                    }
                                    if (!v1) ** GOTO lbl31
                                    break block60;
                                    catch (RuntimeException v3) {
                                        throw c6g.a(v3);
                                    }
                                }
                                try {
                                    block61: {
                                        this.voc((jp4)var5_5);
                                        if (var3_2 == 0) break block48;
                                        break block61;
                                        catch (RuntimeException v4) {
                                            throw c6g.a(v4);
                                        }
                                    }
                                    v0 /* !! */  = this.eel.get(var5_5);
                                }
                                catch (RuntimeException v5) {
                                    throw c6g.a(v5);
                                }
                            }
                            var6_6 = (String)v0 /* !! */ ;
                            this.tli.setVolume((String)var6_6, this.vvn((jp4)var5_5, (vas)this.wlh.get(var5_5), this.xfu.q79(var5_5.nbp()).w1m()));
                            this.tli.setPitch((String)var6_6, this.guc((jp4)var5_5, (vas)this.wlh.get(var5_5)));
                            this.tli.setPosition((String)var6_6, var5_5.wq_(), var5_5.rh5(), var5_5.tm3());
                        }
                        if (var3_2 == 0) continue;
                    }
                    var4_3 = this.khm.entrySet().iterator();
                    do {
                        block52: {
                            block53: {
                                block66: {
                                    block65: {
                                        block51: {
                                            block50: {
                                                block62: {
                                                    v1 = var4_3.hasNext();
lbl46:
                                                    // 2 sources

                                                    if (!v1) break;
                                                    var5_5 = (Map.Entry)var4_3.next();
                                                    var6_6 = (String)var5_5.getKey();
                                                    var7_7 = (jp4)var5_5.getValue();
                                                    v6 = this;
                                                    if (var3_2 != 0) break block49;
                                                    v7 = v6.tli.playing((String)var6_6);
                                                    if (var3_2 != 0) break block50;
                                                    break block62;
                                                    catch (RuntimeException v8) {
                                                        throw c6g.a(v8);
                                                    }
                                                }
                                                try {
                                                    block63: {
                                                        if (v7 != 0) continue;
                                                        break block63;
                                                        catch (RuntimeException v9) {
                                                            throw c6g.a(v9);
                                                        }
                                                    }
                                                    v7 = (Integer)this.mi5.get(var6_6);
                                                }
                                                catch (RuntimeException v10) {
                                                    throw c6g.a(v10);
                                                }
                                            }
                                            var8_8 = v7;
                                            v11 = var8_8;
                                            if (var3_2 != 0) break block51;
                                            try {
                                                block64: {
                                                    if (v11 > this.jm5) continue;
                                                    break block64;
                                                    catch (RuntimeException v12) {
                                                        throw c6g.a(v12);
                                                    }
                                                }
                                                v11 = var7_7.n_s();
                                            }
                                            catch (RuntimeException v13) {
                                                throw c6g.a(v13);
                                            }
                                        }
                                        var9_9 = v11;
                                        v14 = var7_7.ozu();
                                        if (var3_2 != 0) break block52;
                                        if (v14 == 0) break block53;
                                        break block65;
                                        catch (RuntimeException v15) {
                                            throw c6g.a(v15);
                                        }
                                    }
                                    v14 = var9_9;
                                    if (var3_2 != 0) break block52;
                                    break block66;
                                    catch (RuntimeException v16) {
                                        throw c6g.a(v16);
                                    }
                                }
                                try {
                                    block67: {
                                        if (v14 <= 0) break block53;
                                        break block67;
                                        catch (RuntimeException v17) {
                                            throw c6g.a(v17);
                                        }
                                    }
                                    this.ift.put(var7_7, this.jm5 + var9_9);
                                }
                                catch (RuntimeException v18) {
                                    throw c6g.a(v18);
                                }
                            }
                            var4_3.remove();
                            c6g.so4.debug(c6g.brq, (String)c6g.a("h", (int)9413, (long)(3061080951046821737L ^ var1_1)), new Object[]{var6_6});
                            this.tli.removeSource((String)var6_6);
                            this.mi5.remove(var6_6);
                            this.wlh.remove(var7_7);
                            try {
                                v14 = (int)this.qh8.remove((Object)this.xfu.q79(var7_7.nbp()).w1m(), var6_6);
                            }
                            catch (RuntimeException var10_10) {
                                // empty catch block
                            }
                        }
                        v19 = var7_7 instanceof jzl;
                        if (var3_2 != 0) continue;
                        try {
                            block68: {
                                if (!v19) continue;
                                break block68;
                                catch (RuntimeException v20) {
                                    throw c6g.a(v20);
                                }
                            }
                            v19 = this.q8v.remove(var7_7);
                        }
                        catch (RuntimeException v21) {
                            throw c6g.a(v21);
                        }
                    } while (var3_2 == 0);
                    v6 = this;
                }
                var5_5 = v6.ift.entrySet().iterator();
                while (var5_5.hasNext()) {
                    block56: {
                        block57: {
                            block58: {
                                block55: {
                                    block69: {
                                        var6_6 = var5_5.next();
                                        if (var3_2 != 0) break block54;
                                        v22 /* !! */  = this;
                                        if (var3_2 != 0) break block55;
                                        break block69;
                                        catch (RuntimeException v23) {
                                            throw c6g.a(v23);
                                        }
                                    }
                                    try {
                                        block70: {
                                            if (v22 /* !! */ .jm5 < (Integer)var6_6.getValue()) break block56;
                                            break block70;
                                            catch (RuntimeException v24) {
                                                throw c6g.a(v24);
                                            }
                                        }
                                        v22 /* !! */  = var6_6.getKey();
                                    }
                                    catch (RuntimeException v25) {
                                        throw c6g.a(v25);
                                    }
                                }
                                var7_7 = (jp4)v22 /* !! */ ;
                                if (var3_2 != 0) break block57;
                                try {
                                    block71: {
                                        if (!(var7_7 instanceof jzl)) break block58;
                                        break block71;
                                        catch (RuntimeException v26) {
                                            throw c6g.a(v26);
                                        }
                                    }
                                    ((jzl)var7_7)._21();
                                }
                                catch (RuntimeException v27) {
                                    throw c6g.a(v27);
                                }
                            }
                            this.pnz(var7_7);
                        }
                        var5_5.remove();
                    }
                    if (var3_2 == 0) continue;
                    break;
                }
            }
            catch (Exception var4_4) {
                var4_4.printStackTrace();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean cr5(jp4 jp42) {
        int n;
        int n2;
        block21: {
            c6g c6g2;
            block19: {
                block20: {
                    n2 = t9d.b();
                    try {
                        try {
                            c6g2 = this;
                            if (n2 == 0) break block19;
                            if (c6g2.q70) break block20;
                            return false;
                        }
                        catch (RuntimeException runtimeException) {
                            throw c6g.a(runtimeException);
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                }
                c6g2 = this.eel.get(jp42);
            }
            String string = (String)((Object)c6g2);
            try {
                if (string == null) {
                    return 0 != 0;
                }
            }
            catch (RuntimeException runtimeException) {
                throw c6g.a(runtimeException);
            }
            try {
                try {
                    try {
                        try {
                            n = this.tli.playing(string);
                            if (n2 == 0) return n != 0;
                            if (n != 0) return 1 != 0;
                        }
                        catch (RuntimeException runtimeException) {
                            throw c6g.a(runtimeException);
                        }
                        n = this.mi5.containsKey(string);
                        if (n2 == 0) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                    if (n == 0) return 0 != 0;
                }
                catch (RuntimeException runtimeException) {
                    throw c6g.a(runtimeException);
                }
                n = (Integer)this.mi5.get(string);
            }
            catch (RuntimeException runtimeException) {
                throw c6g.a(runtimeException);
            }
        }
        try {
            try {
                if (n2 == 0) return n != 0;
                if (n > this.jm5) return 0 != 0;
                return 1 != 0;
            }
            catch (RuntimeException runtimeException) {
                throw c6g.a(runtimeException);
            }
        }
        catch (RuntimeException runtimeException) {
            throw c6g.a(runtimeException);
        }
    }

    public void voc(jp4 jp42) {
        block8: {
            c6g c6g2;
            block7: {
                int n = t9d.b();
                try {
                    try {
                        c6g2 = this;
                        if (n == 0) break block7;
                        if (!c6g2.q70) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                    c6g2 = this.eel.get(jp42);
                }
                catch (RuntimeException runtimeException) {
                    throw c6g.a(runtimeException);
                }
            }
            String string = (String)((Object)c6g2);
            try {
                if (string != null) {
                    this.tli.stop(string);
                }
            }
            catch (RuntimeException runtimeException) {
                throw c6g.a(runtimeException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void pnz(jp4 var1_1) {
        block53: {
            block70: {
                block69: {
                    block68: {
                        block67: {
                            block66: {
                                block65: {
                                    block64: {
                                        block62: {
                                            block61: {
                                                block60: {
                                                    block59: {
                                                        block58: {
                                                            block56: {
                                                                block54: {
                                                                    block52: {
                                                                        var2_2 = c6g.a ^ 131701048017884L;
                                                                        var4_3 = t9d.c();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v0 = this.q70;
                                                                                    if (var4_3 != 0) break block52;
                                                                                    if (v0 == 0) break block53;
                                                                                }
                                                                                catch (RuntimeException v1) {
                                                                                    throw c6g.a(v1);
                                                                                }
                                                                                v2 = this;
                                                                                if (var4_3 != 0) break block54;
                                                                            }
                                                                            catch (RuntimeException v3) {
                                                                                throw c6g.a(v3);
                                                                            }
                                                                            cfr_temp_0 = v2.tli.getMasterVolume() - 0.0f;
                                                                            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                        }
                                                                        catch (RuntimeException v4) {
                                                                            throw c6g.a(v4);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block55: {
                                                                            try {
                                                                                if (v0 > 0) break block55;
                                                                                c6g.so4.debug(c6g.brq, (String)c6g.a("h", (int)26178, (long)(8741557713011766892L ^ var2_2)), new Object[]{var1_1.nbp()});
                                                                                if (var4_3 == 0) break block53;
                                                                            }
                                                                            catch (RuntimeException v5) {
                                                                                throw c6g.a(v5);
                                                                            }
                                                                        }
                                                                        v2 = this;
                                                                    }
                                                                    catch (RuntimeException v6) {
                                                                        throw c6g.a(v6);
                                                                    }
                                                                }
                                                                var5_4 = v2.xfu.q79(var1_1.nbp());
                                                                try {
                                                                    block57: {
                                                                        try {
                                                                            try {
                                                                                v7 = var5_4;
                                                                                if (var4_3 != 0) break block56;
                                                                                if (v7 != null) break block57;
                                                                            }
                                                                            catch (RuntimeException v8) {
                                                                                throw c6g.a(v8);
                                                                            }
                                                                            c6g.so4.warn(c6g.brq, (String)c6g.a("h", (int)25605, (long)(6547770876145890336L ^ var2_2)), new Object[]{var1_1.nbp()});
                                                                            if (var4_3 == 0) break block53;
                                                                        }
                                                                        catch (RuntimeException v9) {
                                                                            throw c6g.a(v9);
                                                                        }
                                                                    }
                                                                    v7 = var5_4;
                                                                }
                                                                catch (RuntimeException v10) {
                                                                    throw c6g.a(v10);
                                                                }
                                                            }
                                                            var6_5 = v7.npr();
                                                            try {
                                                                try {
                                                                    if (var4_3 != 0) break block58;
                                                                    if (var6_5 != dbu.e5c) break block59;
                                                                }
                                                                catch (RuntimeException v11) {
                                                                    throw c6g.a(v11);
                                                                }
                                                                c6g.so4.warn(c6g.brq, (String)c6g.a("h", (int)10871, (long)(992226750983354961L ^ var2_2)), new Object[]{var5_4.b0n()});
                                                            }
                                                            catch (RuntimeException v12) {
                                                                throw c6g.a(v12);
                                                            }
                                                        }
                                                        if (var4_3 == 0) break block53;
                                                    }
                                                    var7_6 = var1_1.p4p();
                                                    var8_7 = 16.0f;
                                                    try {
                                                        try {
                                                            v13 = var7_6;
                                                            v14 = 1.0f;
                                                            if (var4_3 != 0) break block60;
                                                            if (!(v13 > v14)) break block61;
                                                        }
                                                        catch (RuntimeException v15) {
                                                            throw c6g.a(v15);
                                                        }
                                                        v13 = var8_7;
                                                        v14 = var7_6;
                                                    }
                                                    catch (RuntimeException v16) {
                                                        throw c6g.a(v16);
                                                    }
                                                }
                                                var8_7 = v13 * v14;
                                            }
                                            var9_8 = var5_4.w1m();
                                            var10_9 = this.vvn(var1_1, var6_5, var9_8);
                                            var11_10 = this.guc(var1_1, var6_5);
                                            var13_11 = var6_5._23();
                                            try {
                                                block63: {
                                                    try {
                                                        try {
                                                            cfr_temp_1 = var10_9 - 0.0f;
                                                            v17 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                            if (var4_3 != 0) break block62;
                                                            if (v17 != false) break block63;
                                                        }
                                                        catch (RuntimeException v18) {
                                                            throw c6g.a(v18);
                                                        }
                                                        c6g.so4.debug(c6g.brq, (String)c6g.a("h", (int)29024, (long)(8923609220168573252L ^ var2_2)), new Object[]{var13_11});
                                                        if (var4_3 == 0) break block53;
                                                    }
                                                    catch (RuntimeException v19) {
                                                        throw c6g.a(v19);
                                                    }
                                                }
                                                v17 = (float)var1_1.ozu();
                                            }
                                            catch (RuntimeException v20) {
                                                throw c6g.a(v20);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var4_3 != 0) break block64;
                                                if (v17 == false) break block65;
                                            }
                                            catch (RuntimeException v21) {
                                                throw c6g.a(v21);
                                            }
                                            v17 = var1_1.n_s();
                                        }
                                        catch (RuntimeException v22) {
                                            throw c6g.a(v22);
                                        }
                                    }
                                    try {
                                        if (var4_3 != 0) break block66;
                                        if (v17 != false) break block65;
                                    }
                                    catch (RuntimeException v23) {
                                        throw c6g.a(v23);
                                    }
                                    v17 = (float)true;
                                    break block66;
                                }
                                v17 = (float)false;
                            }
                            var14_12 = v17;
                            var15_13 = fe6._g4((Random)ThreadLocalRandom.current()).toString();
                            try {
                                try {
                                    if (var4_3 != 0) break block67;
                                    if (var6_5.m7k()) {
                                    }
                                    ** GOTO lbl159
                                }
                                catch (RuntimeException v24) {
                                    throw c6g.a(v24);
                                }
                                this.tli.newStreamingSource(false, var15_13, c6g.uu1(var13_11), var13_11.toString(), (boolean)var14_12, var1_1.wq_(), var1_1.rh5(), var1_1.tm3(), var1_1.iyl().kgd(), var8_7);
                            }
                            catch (RuntimeException v25) {
                                throw c6g.a(v25);
                            }
                        }
                        try {
                            if (var4_3 == 0) break block68;
lbl159:
                            // 2 sources

                            this.tli.newSource(false, var15_13, c6g.uu1(var13_11), var13_11.toString(), (boolean)var14_12, var1_1.wq_(), var1_1.rh5(), var1_1.tm3(), var1_1.iyl().kgd(), var8_7);
                        }
                        catch (RuntimeException v26) {
                            throw c6g.a(v26);
                        }
                    }
                    try {
                        try {
                            c6g.so4.debug(c6g.brq, (String)c6g.a("h", (int)14326, (long)(3107299850501203932L ^ var2_2)), new Object[]{var6_5._23(), var5_4.b0n(), var15_13});
                            this.tli.setPitch(var15_13, (float)var11_10);
                            this.tli.setVolume(var15_13, var10_9);
                            this.tli.play(var15_13);
                            this.mi5.put(var15_13, this.jm5 + 20);
                            this.khm.put(var15_13, var1_1);
                            v27 = this;
                            if (var4_3 != 0) break block69;
                            v27.wlh.put(var1_1, var6_5);
                            if (var9_8 == xdt.adu) break block70;
                        }
                        catch (RuntimeException v28) {
                            throw c6g.a(v28);
                        }
                        v27 = this;
                    }
                    catch (RuntimeException v29) {
                        throw c6g.a(v29);
                    }
                }
                v27.qh8.put((Object)var9_8, (Object)var15_13);
            }
            try {
                try {
                    v30 = var1_1 instanceof jzl;
                    if (var4_3 != 0 || !v30) break block53;
                }
                catch (RuntimeException v31) {
                    throw c6g.a(v31);
                }
                v30 = this.q8v.add((jzl)var1_1);
            }
            catch (RuntimeException v32) {
                throw c6g.a(v32);
            }
        }
    }

    private float guc(jp4 jp42, vas vas2) {
        return (float)fe6.lft((double)jp42.uei() * vas2.bjy(), 0.5, 2.0);
    }

    private float vvn(jp4 jp42, vas vas2, xdt xdt2) {
        return (float)fe6.lft((double)jp42.p4p() * vas2.z3o(), 0.0, 1.0) * this.j6s(xdt2);
    }

    public void p3x() {
        long l = a ^ 0x21B7F0D070EFL;
        int n = t9d.c();
        for (String string : this.khm.keySet()) {
            so4.debug(brq, (String)((Object)c6g.a("h", (int)9125, (long)(0x74DC65A53BA840B1L ^ l))), new Object[]{string});
            this.tli.pause(string);
            if (n == 0) continue;
        }
    }

    public void szs() {
        long l = a ^ 0x6FF1937E8765L;
        int n = t9d.c();
        for (String string : this.khm.keySet()) {
            so4.debug(brq, (String)((Object)c6g.a("h", (int)802, (long)(0x574DCB17BEC97B4L ^ l))), new Object[]{string});
            this.tli.play(string);
            if (n == 0) continue;
        }
    }

    public void syd(jp4 jp42, int n) {
        this.ift.put(jp42, this.jm5 + n);
    }

    private static URL uu1(gdz gdz2) {
        long l = a ^ 0x525D6C510E18L;
        Object[] objectArray = new Object[3];
        objectArray[0] = c6g.a("h", (int)29212, (long)(0x45C99D7402E76FF4L ^ l));
        objectArray[1] = gdz2._a7();
        objectArray[2] = gdz2.xyp();
        String string = String.format((String)((Object)c6g.a("h", (int)5593, (long)(0x3D642521803B083EL ^ l))), objectArray);
        c6g$2 c6g$2 = new c6g$2(gdz2);
        try {
            return new URL((URL)null, string, c6g$2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error((String)((Object)c6g.a("h", (int)9885, (long)(0x510094C778A3BB78L ^ l))));
        }
    }

    public void xvu(ha9 ha92, float f) {
        block4: {
            ha9 ha93;
            block5: {
                int n = t9d.c();
                try {
                    try {
                        if (!this.q70) break block4;
                        ha93 = ha92;
                        if (n != 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw c6g.a(runtimeException);
                    }
                    if (ha93 == null) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw c6g.a(runtimeException);
                }
                ha93 = ha92;
            }
            float f2 = ha93.j25 + (ha92.y2i - ha92.j25) * f;
            float f3 = ha92.p3h + (ha92.x5k - ha92.p3h) * f;
            double d = ha92.bc1 + (ha92.o2v - ha92.bc1) * (double)f;
            double d2 = ha92.o_z + (ha92.kfp - ha92.o_z) * (double)f + (double)ha92.c5y();
            double d3 = ha92.a4d + (ha92.vbd - ha92.a4d) * (double)f;
            float f4 = fe6.ssk((f3 + 90.0f) * ((float)Math.PI / 180));
            float f5 = fe6.rtn((f3 + 90.0f) * ((float)Math.PI / 180));
            float f6 = fe6.ssk(-f2 * ((float)Math.PI / 180));
            float f7 = fe6.rtn(-f2 * ((float)Math.PI / 180));
            float f8 = fe6.ssk((-f2 + 90.0f) * ((float)Math.PI / 180));
            float f9 = fe6.rtn((-f2 + 90.0f) * ((float)Math.PI / 180));
            float f10 = f4 * f6;
            float f11 = f5 * f6;
            float f12 = f4 * f8;
            float f13 = f5 * f8;
            this.tli.setListenerPosition((float)d, (float)d2, (float)d3);
            this.tli.setListenerOrientation(f10, f7, f11, f12, f9, f13);
        }
    }

    public static Logger s4b() {
        return so4;
    }

    public static c6g$p0f xys(c6g c6g2, c6g$p0f c6g$p0f) {
        c6g2.tli = c6g$p0f;
        return c6g2.tli;
    }

    public static boolean oic(c6g c6g2, boolean bl) {
        c6g2.q70 = bl;
        return c6g2.q70;
    }

    public static moh yo_(c6g c6g2) {
        return c6g2.ue1;
    }

    public static c6g$p0f b7d(c6g c6g2) {
        return c6g2.tli;
    }

    public static Marker n1u() {
        return brq;
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

                c6g.a = c.a(638478651511827815L, -9111673334028698599L, MethodHandles.lookup().lookupClass()).a(85304018209430L);
                var9 = c6g.a ^ 43767243702877L;
                c6g.d = new HashMap<K, V>(13);
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
                var7_3 = new String[16];
                var5_4 = 0;
                var4_5 = "h\u001a\u00896\u0097\u0083\u000eX\u00c4f\u00fd\u00b2\u00d6\"\u00c5O\u0001^J\u00baE\u0090\u00ec\u00e9\u00f1\u00b7f\t&z\u00c20\u00f5\u0091\u00ac7^\u00aa\u009e?m?%\u00c6\u00b3\u009cQ\u000e\nT\u0090-\u0084J6B\u008a,t\u00c2\u00cb?\u00f5K\u00dc\u008a\u00d3\u00ea]\u00ea\u0093\u00fcvr\u00f0*r\u000f\u00bf\u00c0\f\u0087\u0010\u00a0\u008f=\u00fc\u00f5H\u00b9\u0084l\u009b\u00c0k\u00bc;\u0097\u00a0\u0091\u00c6w\u00f9yD\u00e9r\u00cd\u009c\u0014 Rd\u00b7|`D\u0007\u001e\u00b9s\u00fer\u00ad\u00b1\u00ed\u00dfh\u0097\u009f}\u00de`\u00b7\u00d3\u00d0\u00b8|=Bj\u00a9\fM\f\u00d8|\u00b6d\u0016\u00ffj\u00ed\u001b\u00e7\u0014\"\u00d6K\u00f1\u00f80\u0095'H\u001f?\u00f9\u00ca\u009f4U8\u00e5\u009cR8M\u00e4$z\u000f\u0015\u00c5M~\u00d17&8\u00ed\u00cd\u00b4W\u0000c\u000f)+\u001ci6\u0092\u00c4``\u0003\u00df`SPH\u00bc/\u00fe\u0018\u00b3\u00c1\u00c0\u00f9e\u00b7\u00ef\u00d5\u0083\u00b0\u0086\u00cc\u00d0\u00f0\u0089\u00db\n\u0095\u00e8 \u00b2J\u00a1|\u00d9\u00eap\u000f$\u00c0@) \u00bd@\u0084Ue\u0019cV\u00c0(\u00f0>\u009d\u0004\u0099\u00ed\u00f1\u00caS\u00e0\u00887\u00a1\u00ffm!Q\u00a9\u00e4\u00cb\u0000\u00e6Vl\u00a6\u00195\u00ab\u0098\u00bc\u0016\u0082 \u00d2n\u00b5fj\u0086\u008e\u00c2~I\n1\u00e7\u00f6\u008f\u001d\u00c2\u00ba!N\u00b9\u0003\u0001b\u0090e\u00a7^\u00ff\b\u009f^X\u009c\u00c9`\u001e\u00a6\u009f\u00c8\u00ab\u00a6Q\u00abT\u0002\u0099\u0081{\u0004\u000f\u00f4\u00d3\u007f\u0084q\u00b6\u0090\u00d1\u0085\f@i\u00bd\u00b7\u00eb\u00b4\u00baq5\u00d7\u0005)q!n\u00da\u00a5\u00e8\u00b4\u00fc=\u00b3_\u009aO\u00f0*\u00b8\u0094b\u009a\u00db<\u009a0\u00a7\u000b\u0091@\u001f\u00c0A\u00d9\u009eP+\u00e0\u00b6\u001a%_T.\u0087h\u00b1?\u0083\u00ecBX/\u00f3fo\u00caCs\u00f9\u00a9\u00ce7\u00f3\u0012~\u00a4t;\u00c5\u0011\u00ec\u001a\u0085\"\u00f4\u00aeG\u00ce\u00ba\u0095uz\u0015v<\u00f5\u00d1\u00afs\u00c9\u008b2\u00e4\u0096\u00e1v?\u0003\u0006@\u0001\u00d1Eg\u00004\u0084,Y\u008b\u00ee\u00cf\u00d1\u00b5\u0002\u00aaP\u00eb\u00dbpn\u00e0;\u00db\u00a3\u0082\u00d8\u000e~\u0019Fi\u00a6\u00d3\u00e7-\u00eb\u00ea% |\u00ee\u009d\u00ca\u00dc\u00da\u00ee?f\u008b{\u00d4\u00c2\u00d5\u00ff\u00aetc\u00af\u00fc\u0089\u0010\u0088S\u00bc@\u0011Gm&\u00d3[\u0018)5\b\u0004\u00ca\u00b8n\u000b:\u001f\u008a\u00f5Q\u00cc\u0087\u00ec\u001e\u0095V\f\u00a8\u00d9\u008c=\u0010\n\u0094%\u0086\u00ec \u000f\u00af\u00bfYTM\u0095\u00c4\u00a7s@\u000f\u00e6{\u009e\u00bed\u0014~\n\u0017\u00ab#\u00ee\u00b7\u00a8\u00ce,\u00e7\u0015/XQ\u0081\u0084\u00fa{6j,\"E,\u000b.g>\u00a1p\u00bf\u00d0\u00b7\u00f9l{\u008f\u00f2\u008eC\u00ca\u0002\u0081\u00d3\"\u0019\u008c\u00ee\n\u0001a\u00d9V\u000fA0\u0010`fDR\u000396\u00eelqi\u00cf8\u00d8F\u0007(\u00ac\u0084\u00fb\u00cb\u00d5\u008ck#p/\u00c8`\u00b5g\u0091F\u0003%=\u00ea\u008e`\u00ff\u0080&\u00ef\u00acB\u00a6\u001d-\u0010\u00f32A\u0000h$9\u00f8H\u00b1\u0082\u00d8\t\u0000\u00e2\u00c513\u0007y^N\u00d3\u0099\u00b5\u00d2\u00bbc\u0080\u0007y*\u00e6\u0082\u00a1e{\u00d6\u00b0a\r\u0081\u00ae\u00f5d\u0088\u009f\u00b4\u00ef\u00ed\u000ep<\u00abg\u008b'(\u000f?c\u00ef({Q\u00f5\u0092\u00848\u0093$\u00f3\u00edb.\u008b\u00fe#\u00cd3\u007f";
                var6_6 = "h\u001a\u00896\u0097\u0083\u000eX\u00c4f\u00fd\u00b2\u00d6\"\u00c5O\u0001^J\u00baE\u0090\u00ec\u00e9\u00f1\u00b7f\t&z\u00c20\u00f5\u0091\u00ac7^\u00aa\u009e?m?%\u00c6\u00b3\u009cQ\u000e\nT\u0090-\u0084J6B\u008a,t\u00c2\u00cb?\u00f5K\u00dc\u008a\u00d3\u00ea]\u00ea\u0093\u00fcvr\u00f0*r\u000f\u00bf\u00c0\f\u0087\u0010\u00a0\u008f=\u00fc\u00f5H\u00b9\u0084l\u009b\u00c0k\u00bc;\u0097\u00a0\u0091\u00c6w\u00f9yD\u00e9r\u00cd\u009c\u0014 Rd\u00b7|`D\u0007\u001e\u00b9s\u00fer\u00ad\u00b1\u00ed\u00dfh\u0097\u009f}\u00de`\u00b7\u00d3\u00d0\u00b8|=Bj\u00a9\fM\f\u00d8|\u00b6d\u0016\u00ffj\u00ed\u001b\u00e7\u0014\"\u00d6K\u00f1\u00f80\u0095'H\u001f?\u00f9\u00ca\u009f4U8\u00e5\u009cR8M\u00e4$z\u000f\u0015\u00c5M~\u00d17&8\u00ed\u00cd\u00b4W\u0000c\u000f)+\u001ci6\u0092\u00c4``\u0003\u00df`SPH\u00bc/\u00fe\u0018\u00b3\u00c1\u00c0\u00f9e\u00b7\u00ef\u00d5\u0083\u00b0\u0086\u00cc\u00d0\u00f0\u0089\u00db\n\u0095\u00e8 \u00b2J\u00a1|\u00d9\u00eap\u000f$\u00c0@) \u00bd@\u0084Ue\u0019cV\u00c0(\u00f0>\u009d\u0004\u0099\u00ed\u00f1\u00caS\u00e0\u00887\u00a1\u00ffm!Q\u00a9\u00e4\u00cb\u0000\u00e6Vl\u00a6\u00195\u00ab\u0098\u00bc\u0016\u0082 \u00d2n\u00b5fj\u0086\u008e\u00c2~I\n1\u00e7\u00f6\u008f\u001d\u00c2\u00ba!N\u00b9\u0003\u0001b\u0090e\u00a7^\u00ff\b\u009f^X\u009c\u00c9`\u001e\u00a6\u009f\u00c8\u00ab\u00a6Q\u00abT\u0002\u0099\u0081{\u0004\u000f\u00f4\u00d3\u007f\u0084q\u00b6\u0090\u00d1\u0085\f@i\u00bd\u00b7\u00eb\u00b4\u00baq5\u00d7\u0005)q!n\u00da\u00a5\u00e8\u00b4\u00fc=\u00b3_\u009aO\u00f0*\u00b8\u0094b\u009a\u00db<\u009a0\u00a7\u000b\u0091@\u001f\u00c0A\u00d9\u009eP+\u00e0\u00b6\u001a%_T.\u0087h\u00b1?\u0083\u00ecBX/\u00f3fo\u00caCs\u00f9\u00a9\u00ce7\u00f3\u0012~\u00a4t;\u00c5\u0011\u00ec\u001a\u0085\"\u00f4\u00aeG\u00ce\u00ba\u0095uz\u0015v<\u00f5\u00d1\u00afs\u00c9\u008b2\u00e4\u0096\u00e1v?\u0003\u0006@\u0001\u00d1Eg\u00004\u0084,Y\u008b\u00ee\u00cf\u00d1\u00b5\u0002\u00aaP\u00eb\u00dbpn\u00e0;\u00db\u00a3\u0082\u00d8\u000e~\u0019Fi\u00a6\u00d3\u00e7-\u00eb\u00ea% |\u00ee\u009d\u00ca\u00dc\u00da\u00ee?f\u008b{\u00d4\u00c2\u00d5\u00ff\u00aetc\u00af\u00fc\u0089\u0010\u0088S\u00bc@\u0011Gm&\u00d3[\u0018)5\b\u0004\u00ca\u00b8n\u000b:\u001f\u008a\u00f5Q\u00cc\u0087\u00ec\u001e\u0095V\f\u00a8\u00d9\u008c=\u0010\n\u0094%\u0086\u00ec \u000f\u00af\u00bfYTM\u0095\u00c4\u00a7s@\u000f\u00e6{\u009e\u00bed\u0014~\n\u0017\u00ab#\u00ee\u00b7\u00a8\u00ce,\u00e7\u0015/XQ\u0081\u0084\u00fa{6j,\"E,\u000b.g>\u00a1p\u00bf\u00d0\u00b7\u00f9l{\u008f\u00f2\u008eC\u00ca\u0002\u0081\u00d3\"\u0019\u008c\u00ee\n\u0001a\u00d9V\u000fA0\u0010`fDR\u000396\u00eelqi\u00cf8\u00d8F\u0007(\u00ac\u0084\u00fb\u00cb\u00d5\u008ck#p/\u00c8`\u00b5g\u0091F\u0003%=\u00ea\u008e`\u00ff\u0080&\u00ef\u00acB\u00a6\u001d-\u0010\u00f32A\u0000h$9\u00f8H\u00b1\u0082\u00d8\t\u0000\u00e2\u00c513\u0007y^N\u00d3\u0099\u00b5\u00d2\u00bbc\u0080\u0007y*\u00e6\u0082\u00a1e{\u00d6\u00b0a\r\u0081\u00ae\u00f5d\u0088\u009f\u00b4\u00ef\u00ed\u000ep<\u00abg\u008b'(\u000f?c\u00ef({Q\u00f5\u0092\u00848\u0093$\u00f3\u00edb.\u008b\u00fe#\u00cd3\u007f".length();
                var3_7 = 88;
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
                    var7_3[var5_4++] = c6g.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00e6\u00a1TZu\b\u001arf\u000b\u00f6\u001c\u0081+\u0092\u00a8\u00de{\u00fcS\u00aeDw\u00bf\u00d0\u00f1+\u00d9\u009f?T^\u00a0S\u00b8\u00e5<X\u00d8\u00c4\u0010\u00ce\u001d\u009d\u0017\u0097\u00a13\u007f\u00ac\u0001\u00d5\u00d4oD\u0087=\u00c1\u00f8\u00d6I\u00e3I0\u0092\u00dd\u0083\u00b6\u00cc\u00c6\u0006\u00fdH\n\u0006 \u00a1y\u00fc\u00ca\u00b4\u00cf\f\u00c4\u00cf\u0012\u00bd\u0093n.h\u00d2\u0013\u00ef2u\u001c\u00abiQ\u00f1\u001f=\u00f1\u00f4|A\u0019\u00a9\u00bc\u0012\u0005T\u00f1\u0011\u00b4\u00f5v\u00c2(\u00fb\u00faGg\u00c2R\u00e9e\"\u001e?&!\u0010\u0006\u00f2I\u0012+\u00d7)A$)\u00ef";
                    var6_6 = "\u00e6\u00a1TZu\b\u001arf\u000b\u00f6\u001c\u0081+\u0092\u00a8\u00de{\u00fcS\u00aeDw\u00bf\u00d0\u00f1+\u00d9\u009f?T^\u00a0S\u00b8\u00e5<X\u00d8\u00c4\u0010\u00ce\u001d\u009d\u0017\u0097\u00a13\u007f\u00ac\u0001\u00d5\u00d4oD\u0087=\u00c1\u00f8\u00d6I\u00e3I0\u0092\u00dd\u0083\u00b6\u00cc\u00c6\u0006\u00fdH\n\u0006 \u00a1y\u00fc\u00ca\u00b4\u00cf\f\u00c4\u00cf\u0012\u00bd\u0093n.h\u00d2\u0013\u00ef2u\u001c\u00abiQ\u00f1\u001f=\u00f1\u00f4|A\u0019\u00a9\u00bc\u0012\u0005T\u00f1\u0011\u00b4\u00f5v\u00c2(\u00fb\u00faGg\u00c2R\u00e9e\"\u001e?&!\u0010\u0006\u00f2I\u0012+\u00d7)A$)\u00ef".length();
                    var3_7 = 72;
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
                    var7_3[var5_4++] = c6g.a(var8_9).intern();
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
        c6g.b = var7_3;
        c6g.c = new String[16];
        c6g.brq = MarkerManager.getMarker((String)c6g.a("h", (int)27354, (long)(4104002480813439867L ^ var9)));
        c6g.so4 = LogManager.getLogger();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x954;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("c6g", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            c6g.c[n2] = c6g.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c6g.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("c6g" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c6g.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

