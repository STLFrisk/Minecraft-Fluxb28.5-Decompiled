/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S24PacketBlockAction;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dug
extends t9d
implements lg9 {
    private static final Logger qa4;
    private final vr1 s4x;
    private final qpc clb;
    private final ey1 qka;
    private final Set d5o = Sets.newHashSet();
    private final TreeSet js1 = new TreeSet();
    private final Map iqq = Maps.newHashMap();
    public gvi kil;
    public boolean b4a;
    private boolean f65;
    private int d4b;
    private final ooh _kf;
    private final v7y zyw = new v7y();
    public final tvx lxr = new tvx(this);
    private dug$mdz[] ojm = new dug$mdz[]{new dug$mdz(null), new dug$mdz(null)};
    private int egn;
    private static final List hsf;
    private List xa7 = Lists.newArrayList();
    private static final long b;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    public dug(vr1 vr12, he6 he62, cog cog2, int n, uan uan2) {
        super(he62, cog2, upn.mkz(n), uan2, false);
        this.s4x = vr12;
        this.clb = new qpc(this);
        this.qka = new ey1(this);
        this.vzz.d9i(this);
        this.jro = this.qya();
        this._kf = new ooh(this);
        this.lhz();
        this.td1();
        this.fve().lth(vr12.aq4());
    }

    @Override
    public t9d ufh() {
        block21: {
            dug dug2;
            block19: {
                a16 a162;
                a16 a163;
                int n;
                block17: {
                    block18: {
                        long l;
                        block16: {
                            bg8 bg82;
                            block14: {
                                l = b ^ 0x471C3D9DC9A1L;
                                this.hqr = new _ie(this.ujg);
                                String string = bg8.m28(this.vzz);
                                n = t9d.c();
                                bg8 bg83 = (bg8)this.hqr.ym5(bg8.class, string);
                                try {
                                    block15: {
                                        try {
                                            try {
                                                bg82 = bg83;
                                                if (n != 0) break block14;
                                                if (bg82 != null) break block15;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            this.sw1 = new bg8(this);
                                            this.hqr.vex(string, this.sw1);
                                            if (n == 0) break block16;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                    }
                                    bg82 = this.sw1 = bg83;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                            }
                            bg82.kyu(this);
                        }
                        this.t7i = new z3y(this.s4x);
                        a163 = (a16)this.hqr.ym5(a16.class, (String)((Object)dug.b("w", (int)3663, (long)(0x71B05E158B38A313L ^ l))));
                        try {
                            a162 = a163;
                            if (n != 0) break block17;
                            if (a162 != null) break block18;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        a163 = new a16();
                        this.hqr.vex((String)((Object)dug.b("w", (int)2451, (long)(0x6A1D0BD1B47524DFL ^ l))), a163);
                    }
                    a162 = a163;
                }
                try {
                    block20: {
                        try {
                            try {
                                a162.at3(this.t7i);
                                ((z3y)this.t7i).wh5(a163);
                                this.fve().bfn(this.t9z.xlo(), this.t9z.j4s());
                                this.fve().byt(this.t9z.dro());
                                this.fve().y4p(this.t9z.r7_());
                                this.fve().n3z(this.t9z.h9b());
                                this.fve().ilo(this.t9z.huj());
                                dug2 = this;
                                if (n != 0) break block19;
                                if (dug2.t9z.hgc() <= 0L) break block20;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            this.fve()._03(this.t9z.hlq(), this.t9z.fud(), this.t9z.hgc());
                            if (n == 0) break block21;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    dug2 = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            dug2.fve().w37(this.t9z.hlq());
        }
        return this;
    }

    @Override
    public void aoj() {
        long l;
        block46: {
            int n;
            block47: {
                int n2;
                block44: {
                    block45: {
                        int n3;
                        block39: {
                            dug dug2;
                            block41: {
                                block40: {
                                    long l2;
                                    boolean bl;
                                    boolean bl2;
                                    dug dug3;
                                    v7y v7y2;
                                    block42: {
                                        block43: {
                                            block35: {
                                                block36: {
                                                    dug dug4;
                                                    block37: {
                                                        block38: {
                                                            block32: {
                                                                dug dug5;
                                                                block34: {
                                                                    block33: {
                                                                        l = b ^ 0x842ED5FACE7L;
                                                                        n2 = t9d.c();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        super.aoj();
                                                                                        n3 = this.r7d().lce();
                                                                                        if (n2 != 0) break block32;
                                                                                        if (n3 == 0) break block33;
                                                                                    }
                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                        throw dug.a(illegalStateException);
                                                                                    }
                                                                                    dug5 = this;
                                                                                    if (n2 != 0) break block34;
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    throw dug.a(illegalStateException);
                                                                                }
                                                                                if (dug5.rbk() == v66.csg) break block33;
                                                                            }
                                                                            catch (IllegalStateException illegalStateException) {
                                                                                throw dug.a(illegalStateException);
                                                                            }
                                                                            this.r7d().jbe(v66.csg);
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            throw dug.a(illegalStateException);
                                                                        }
                                                                    }
                                                                    this.vzz.wvm().f65();
                                                                    dug5 = this;
                                                                }
                                                                n3 = dug5.ly4();
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n2 != 0) break block35;
                                                                        if (n3 == 0) break block36;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        throw dug.a(illegalStateException);
                                                                    }
                                                                    dug4 = this;
                                                                    if (n2 != 0) break block37;
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    throw dug.a(illegalStateException);
                                                                }
                                                                if (!dug4.eir()._s0((String)((Object)dug.b("w", (int)3414, (long)(0x3A9355F7C7334556L ^ l))))) break block38;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw dug.a(illegalStateException);
                                                            }
                                                            long l3 = this.t9z.y9w() + 24000L;
                                                            this.t9z.l5d(l3 - l3 % 24000L);
                                                        }
                                                        dug4 = this;
                                                    }
                                                    dug4.t4e();
                                                }
                                                this.e8t.qek((String)((Object)dug.b("w", (int)28164, (long)(0x32DC8B67F893A615L ^ l))));
                                                n3 = this.eir()._s0((String)((Object)dug.b("w", (int)14560, (long)(0x5AB2D49F317270EBL ^ l)))) ? 1 : 0;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n2 != 0) break block39;
                                                                if (n3 == 0) break block40;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw dug.a(illegalStateException);
                                                            }
                                                            dug2 = this;
                                                            if (n2 != 0) break block41;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                        if (dug2.t9z.z28() == gxq.gl_) break block40;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    v7y2 = this.zyw;
                                                    dug3 = this;
                                                    boolean bl = this.gwn;
                                                    bl = this.wdp;
                                                    long l2 = this.t9z.zex() % 400L - 0L;
                                                    l2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                                    if (n2 != 0) break block42;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                if (l2 != false) break block43;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            l2 = 1;
                                            break block42;
                                        }
                                        l2 = 0;
                                    }
                                    v7y2.pkz(dug3, bl2, bl, (boolean)l2);
                                }
                                this.e8t.v2l((String)((Object)dug.b("w", (int)16656, (long)(0x35D8A9ED295A8913L ^ l))));
                                this.jro.p68();
                                dug2 = this;
                            }
                            n3 = dug2.vvh(1.0f);
                        }
                        int n4 = n3;
                        try {
                            try {
                                n = n4;
                                if (n2 != 0) break block44;
                                if (n == this.e76()) break block45;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            this.kc3(n4);
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    this.t9z.ncq(this.t9z.zex() + 1L);
                    n = this.eir()._s0((String)((Object)dug.b("w", (int)25591, (long)(0x5C9FC899B0F0ABFBL ^ l)))) ? 1 : 0;
                }
                try {
                    try {
                        if (n2 != 0) break block46;
                        if (n == 0) break block47;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    this.t9z.l5d(this.t9z.y9w() + 1L);
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            this.e8t.v2l((String)((Object)dug.b("w", (int)2255, (long)(0x37A19D2A8639C0C2L ^ l))));
            n = this.ud3(false) ? 1 : 0;
        }
        this.e8t.v2l((String)((Object)dug.b("w", (int)9216, (long)(0x79B5765E824B6C04L ^ l))));
        this.b1d();
        this.e8t.v2l((String)((Object)dug.b("w", (int)6211, (long)(0x2336EFAAC3DB504AL ^ l))));
        this.qka.d6c();
        this.e8t.v2l((String)((Object)dug.b("w", (int)12781, (long)(0x635E99C26AB0F9FDL ^ l))));
        this.sw1.o09();
        this.lxr.hid();
        this.e8t.v2l((String)((Object)dug.b("w", (int)20538, (long)(0x1A7FE312CA259835L ^ l))));
        this._kf.e0g(this.p2b());
        this.e8t.uio();
        this.hqw();
    }

    public gyu$dwn mso(ek6 ek62, mew mew2) {
        gyu$dwn gyu$dwn;
        block6: {
            block5: {
                List list;
                List list2;
                block4: {
                    int n = t9d.c();
                    list2 = this.sj7().sbk(ek62, mew2);
                    try {
                        list = list2;
                        if (n != 0) break block4;
                        if (list == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    list = list2;
                }
                try {
                    if (list.isEmpty()) break block5;
                    gyu$dwn = (gyu$dwn)zfj.h82(this.fsy, list2);
                    break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            gyu$dwn = null;
        }
        return gyu$dwn;
    }

    public boolean kjx(ek6 ek62, gyu$dwn gyu$dwn, mew mew2) {
        boolean bl;
        block8: {
            block7: {
                List list;
                List list2;
                int n;
                block6: {
                    n = t9d.c();
                    list2 = this.sj7().sbk(ek62, mew2);
                    try {
                        list = list2;
                        if (n != 0) break block6;
                        if (list == null) break block7;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    list = list2;
                }
                try {
                    try {
                        bl = list.isEmpty();
                        if (n != 0) break block8;
                        if (bl) break block7;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    bl = list2.contains(gyu$dwn);
                    break block8;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void vz4() {
        block19: {
            int n;
            block25: {
                block24: {
                    int n2;
                    int n3;
                    block23: {
                        int n4;
                        block18: {
                            n3 = t9d.b();
                            try {
                                this.f65 = false;
                                n4 = this.rpk.isEmpty();
                                if (n3 == 0) break block18;
                                if (n4 != 0) break block19;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            n4 = 0;
                        }
                        n2 = n4;
                        int n5 = 0;
                        for (ha9 ha92 : this.rpk) {
                            block22: {
                                boolean bl;
                                block20: {
                                    try {
                                        block21: {
                                            try {
                                                try {
                                                    try {
                                                        if (n3 == 0) break block19;
                                                        bl = ha92.myu();
                                                        if (n3 == 0) break block20;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    if (!bl) break block21;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                ++n2;
                                                if (n3 != 0) break block22;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                        }
                                        bl = ha92.ofg();
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                }
                                if (bl) {
                                    ++n5;
                                }
                            }
                            if (n3 != 0) continue;
                        }
                        try {
                            dug dug2 = this;
                            n = n5;
                            if (n3 == 0) break block23;
                            if (n <= 0) break block24;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        n = n5;
                    }
                    try {
                        try {
                            if (n3 == 0) break block25;
                            if (n < this.rpk.size() - n2) break block24;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        n = 1;
                        break block25;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                n = 0;
            }
            dug2.f65 = n;
        }
    }

    public void t4e() {
        block7: {
            this.f65 = false;
            Iterator iterator = this.rpk.iterator();
            int n = t9d.b();
            while (iterator.hasNext()) {
                block9: {
                    ha9 ha92;
                    block8: {
                        ha9 ha93 = (ha9)iterator.next();
                        try {
                            try {
                                try {
                                    if (n == 0) break block7;
                                    ha92 = ha93;
                                    if (n == 0) break block8;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                if (!ha92.ofg()) break block9;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            ha92 = ha93;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    ha92.thu(false, false, true);
                }
                if (n != 0) continue;
            }
            this.dao();
        }
    }

    private void dao() {
        this.t9z.o_f(0);
        this.t9z.do3(false);
        this.t9z.zsa(0);
        this.t9z.kcj(false);
    }

    public boolean ly4() {
        boolean bl;
        block15: {
            block16: {
                boolean bl2;
                block17: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                bl = this.f65;
                                if (n != 0) break block15;
                                if (!bl) break block16;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            bl = this.v0f;
                            if (n != 0) break block15;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        if (bl) break block16;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    for (ha9 ha92 : this.rpk) {
                        block20: {
                            boolean bl3;
                            block18: {
                                block19: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    bl2 = ha92.myu();
                                                    if (n != 0) break block17;
                                                    if (n != 0) break block18;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                if (bl2) break block19;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            bl3 = ha92.bl4();
                                            if (n != 0) break block18;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        if (bl3) break block20;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                }
                                bl3 = false;
                            }
                            return bl3;
                        }
                        if (n == 0) continue;
                    }
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void lgm() {
        int n;
        block5: {
            block6: {
                int n2 = t9d.b();
                try {
                    try {
                        n = this.t9z._9h();
                        if (n2 == 0) break block5;
                        if (n > 0) break block6;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    this.t9z.owd(this._s3() + 1);
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            n = this.t9z.c21();
        }
        int n3 = n;
        int n4 = this.t9z.ans();
        int n5 = 0;
        while (this.koz(new mew(n3, 0, n4)).p1r() == p3y.cei) {
            n3 += this.fsy.nextInt(8) - this.fsy.nextInt(8);
            n4 += this.fsy.nextInt(8) - this.fsy.nextInt(8);
            if (++n5 != 10000) continue;
        }
        this.t9z.yc4(n3);
        this.t9z.i3b(n4);
    }

    @Override
    public void b1d() {
        block65: {
            int n;
            long l;
            block64: {
                dug dug2;
                block63: {
                    l = b ^ 0x43E312C9EEF9L;
                    n = t9d.c();
                    try {
                        try {
                            super.b1d();
                            dug2 = this;
                            if (n != 0) break block63;
                            if (dug2.t9z.z28() != gxq.gl_) break block64;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        dug2 = this;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                for (h2f h2f2 : dug2.auv) {
                    try {
                        this.o5h(h2f2.jnd, h2f2.km5).o7u(false);
                        if (n == 0) {
                            if (n == 0) continue;
                            break;
                        }
                        break block65;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                if (n == 0) break block65;
            }
            int n2 = 0;
            int n3 = 0;
            for (Object object : this.auv) {
                block75: {
                    block54: while (true) {
                        int n4;
                        Object object2;
                        int n5;
                        tts tts2;
                        int n6;
                        int n7;
                        block74: {
                            int n8;
                            block68: {
                                block69: {
                                    mew mew2;
                                    block72: {
                                        block73: {
                                            block70: {
                                                block71: {
                                                    block67: {
                                                        h2f h2f3 = (h2f)object;
                                                        n7 = h2f3.jnd * 16;
                                                        n6 = h2f3.km5 * 16;
                                                        this.e8t.qek((String)((Object)dug.b("w", (int)19774, (long)(0x30A46A02D9D4C735L ^ l))));
                                                        tts2 = this.o5h(h2f3.jnd, h2f3.km5);
                                                        this.ev3(n7, n6, tts2);
                                                        this.e8t.v2l((String)((Object)dug.b("w", (int)14955, (long)(0x36D523AC5ED73061L ^ l))));
                                                        tts2.o7u(false);
                                                        this.e8t.v2l((String)((Object)dug.b("w", (int)29731, (long)(0x4A828830A4AFFE35L ^ l))));
                                                        n8 = this.fsy.nextInt(100000);
                                                        if (n == 0) {
                                                            block66: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (n8 != 0) break block66;
                                                                                n8 = this.xqu() ? 1 : 0;
                                                                                if (n != 0) break block67;
                                                                            }
                                                                            catch (IllegalStateException illegalStateException) {
                                                                                throw dug.a(illegalStateException);
                                                                            }
                                                                            if (n8 == 0) break block66;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            throw dug.a(illegalStateException);
                                                                        }
                                                                        n8 = this.aq0() ? 1 : 0;
                                                                        if (n != 0) break block67;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        throw dug.a(illegalStateException);
                                                                    }
                                                                    if (n8 == 0) break block66;
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    throw dug.a(illegalStateException);
                                                                }
                                                                this.jf7 = this.jf7 * 3 + 1013904223;
                                                                n5 = this.jf7 >> 2;
                                                                object2 = this.m9q(new mew(n7 + (n5 & 0xF), 0, n6 + (n5 >> 8 & 0xF)));
                                                                try {
                                                                    try {
                                                                        n8 = this.eyz((mew)object2) ? 1 : 0;
                                                                        if (n != 0) break block67;
                                                                        if (n8 == 0) break block66;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        throw dug.a(illegalStateException);
                                                                    }
                                                                    this._b8(new _6b(this, ((wgo)object2).getX(), ((wgo)object2).getY(), ((wgo)object2).getZ()));
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    throw dug.a(illegalStateException);
                                                                }
                                                            }
                                                            this.e8t.v2l((String)((Object)dug.b("w", (int)7370, (long)(0x2AA804357D4016C3L ^ l))));
                                                            n8 = this.fsy.nextInt(16);
                                                        }
                                                    }
                                                    try {
                                                        if (n != 0) break block68;
                                                        if (n8 != 0) break block69;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    this.jf7 = this.jf7 * 3 + 1013904223;
                                                    n5 = this.jf7 >> 2;
                                                    object2 = this.k62(new mew(n7 + (n5 & 0xF), 0, n6 + (n5 >> 8 & 0xF)));
                                                    mew2 = ((mew)object2).eve();
                                                    try {
                                                        try {
                                                            n4 = this.hcn(mew2) ? 1 : 0;
                                                            if (n != 0) break block70;
                                                            if (n4 == 0) break block71;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                        this.gfy(mew2, ox_.f02.l4i());
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                }
                                                n4 = this.xqu() ? 1 : 0;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n != 0) break block72;
                                                            if (n4 == 0) break block73;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                        n4 = this.l2a((mew)object2, true) ? 1 : 0;
                                                        if (n != 0) break block72;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    if (n4 == 0) break block73;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                this.gfy((mew)object2, ox_.dxo.l4i());
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                        }
                                        n4 = this.xqu() ? 1 : 0;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n != 0) break block74;
                                                    if (n4 == 0) break block69;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                n4 = this.getBiomeGenForCoords(mew2).ziq() ? 1 : 0;
                                                if (n != 0) break block74;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            if (n4 == 0) break block69;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        this.getBlockState(mew2).r_y().val(this, mew2);
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                }
                                this.e8t.v2l((String)((Object)dug.b("w", (int)3465, (long)(0x4472FD964548795L ^ l))));
                                n8 = this.eir().sh0((String)((Object)dug.b("w", (int)2159, (long)(0x70602C5BE3A38277L ^ l))));
                            }
                            n5 = n8;
                            try {
                                if (n != 0) break block75;
                                n4 = n5;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                        }
                        if (n4 <= 0) break;
                        object2 = tts2.azq();
                        int n9 = ((k7x[])object2).length;
                        int n10 = 0;
                        block55: while (true) {
                            int n11 = n10;
                            block56: while (n11 < n9) {
                                block76: {
                                    int n12;
                                    k7x k7x2;
                                    block77: {
                                        int n13;
                                        k7x2 = object2[n10];
                                        try {
                                            if (n != 0) continue block55;
                                            object = k7x2;
                                            if (n != 0) continue block54;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        try {
                                            try {
                                                if (object == null) break block76;
                                                n13 = k7x2.dls();
                                                if (n != 0) break block77;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            if (n13 == 0) break block76;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        n13 = n12 = 0;
                                    }
                                    while (n12 < n5) {
                                        block78: {
                                            this.jf7 = this.jf7 * 3 + 1013904223;
                                            int n14 = this.jf7 >> 2;
                                            int n15 = n14 & 0xF;
                                            int n16 = n14 >> 8 & 0xF;
                                            int n17 = n14 >> 16 & 0xF;
                                            ++n3;
                                            zfz zfz2 = k7x2.py5(n15, n17, n16);
                                            e0x e0x2 = zfz2.r_y();
                                            try {
                                                if (n != 0) break block78;
                                                n11 = e0x2.qk0() ? 1 : 0;
                                                if (n != 0) continue block56;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            try {
                                                if (n11 != 0) {
                                                    ++n2;
                                                    e0x2.ff3(this, new mew(n15 + n7, n17 + k7x2.l3s(), n16 + n6), zfz2, this.fsy);
                                                }
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            ++n12;
                                        }
                                        if (n == 0) continue;
                                    }
                                }
                                ++n10;
                                if (n == 0) continue block55;
                            }
                            break block54;
                            break;
                        }
                        break;
                    }
                    this.e8t.uio();
                }
                if (n == 0) continue;
            }
        }
    }

    public mew m9q(mew mew2) {
        mew mew3;
        block6: {
            mew mew4;
            block5: {
                List list;
                block4: {
                    mew4 = this.k62(mew2);
                    nh4 nh42 = new nh4(mew4, new mew(mew4.getX(), this._1d(), mew4.getZ())).c2h(3.0, 3.0, 3.0);
                    int n = t9d.c();
                    List list2 = this.vie(g_3.class, nh42, new dug$1(this));
                    try {
                        try {
                            list = list2;
                            if (n != 0) break block4;
                            if (list.isEmpty()) break block5;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        list = list2.get(this.fsy.nextInt(list2.size()));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                mew3 = ((g_3)((Object)list)).d3d();
                break block6;
            }
            mew3 = mew4;
        }
        return mew3;
    }

    @Override
    public boolean h11(mew mew2, e0x e0x2) {
        rty rty2 = new rty(mew2, e0x2);
        return this.xa7.contains(rty2);
    }

    @Override
    public void cjk(mew mew2, e0x e0x2, int n) {
        this.hba(mew2, e0x2, n, 0);
    }

    @Override
    public void hba(mew mew2, e0x e0x2, int n, int n2) {
        block39: {
            int n3;
            rty rty2;
            block40: {
                boolean bl;
                block30: {
                    int n4;
                    block31: {
                        boolean bl2;
                        block33: {
                            block34: {
                                block36: {
                                    e0x e0x3;
                                    zfz zfz2;
                                    block38: {
                                        block37: {
                                            mew mew3;
                                            dug dug2;
                                            block35: {
                                                e0x e0x4;
                                                block32: {
                                                    rty2 = new rty(mew2, e0x2);
                                                    n4 = 0;
                                                    n3 = t9d.c();
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    bl = this.mw3;
                                                                    if (n3 != 0) break block30;
                                                                    if (!bl) break block31;
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    throw dug.a(illegalStateException);
                                                                }
                                                                e0x4 = e0x2;
                                                                if (n3 != 0) break block32;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw dug.a(illegalStateException);
                                                            }
                                                            if (e0x4.p1r() == p3y.cei) break block31;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                        e0x4 = e0x2;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                }
                                                try {
                                                    bl2 = e0x4.jsj();
                                                    if (n3 != 0) break block33;
                                                    if (!bl2) break block34;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                n4 = 8;
                                                try {
                                                    try {
                                                        dug2 = this;
                                                        mew3 = rty2.weq.ec4(-n4, -n4, -n4);
                                                        if (n3 != 0) break block35;
                                                        if (!dug2.o2i(mew3, rty2.weq.ec4(n4, n4, n4))) break block36;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    dug2 = this;
                                                    mew3 = rty2.weq;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                            }
                                            zfz2 = dug2.getBlockState(mew3);
                                            try {
                                                try {
                                                    e0x3 = zfz2.r_y();
                                                    if (n3 != 0) break block37;
                                                    if (e0x3.p1r() == p3y.cei) break block36;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                e0x3 = zfz2.r_y();
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n3 != 0) break block38;
                                                if (e0x3 != rty2.qny()) break block36;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            e0x3 = zfz2.r_y();
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                    }
                                    e0x3.zvy(this, rty2.weq, zfz2, this.fsy);
                                }
                                return;
                            }
                            bl2 = true;
                        }
                        n = bl2 ? 1 : 0;
                    }
                    bl = this.o2i(mew2.ec4(-n4, -n4, -n4), mew2.ec4(n4, n4, n4));
                }
                try {
                    try {
                        if (!bl) break block39;
                        if (e0x2.p1r() == p3y.cei) break block40;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    rty2.wsc((long)n + this.t9z.zex());
                    rty2.pep(n2);
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            try {
                boolean bl;
                try {
                    bl = this.d5o.contains(rty2);
                    if (n3 != 0 || bl) break block39;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
                this.d5o.add(rty2);
                bl = this.js1.add(rty2);
            }
            catch (IllegalStateException illegalStateException) {
                throw dug.a(illegalStateException);
            }
        }
    }

    @Override
    public void jf5(mew mew2, e0x e0x2, int n, int n2) {
        block10: {
            rty rty2;
            int n3;
            block9: {
                int n4;
                rty rty3;
                block8: {
                    n3 = t9d.c();
                    rty2 = new rty(mew2, e0x2);
                    try {
                        try {
                            rty3 = rty2;
                            n4 = n2;
                            if (n3 != 0) break block8;
                            rty3.pep(n4);
                            if (e0x2.p1r() == p3y.cei) break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        rty3 = rty2;
                        n4 = n;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                rty3.wsc((long)n4 + this.t9z.zex());
            }
            try {
                boolean bl;
                try {
                    bl = this.d5o.contains(rty2);
                    if (n3 != 0 || bl) break block10;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
                this.d5o.add(rty2);
                bl = this.js1.add(rty2);
            }
            catch (IllegalStateException illegalStateException) {
                throw dug.a(illegalStateException);
            }
        }
    }

    @Override
    public void y8h() {
        dug dug2;
        block10: {
            block11: {
                dug dug3;
                block8: {
                    block9: {
                        int n = t9d.c();
                        try {
                            try {
                                try {
                                    try {
                                        dug3 = this;
                                        if (n != 0) break block8;
                                        if (!dug3.rpk.isEmpty()) break block9;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                    dug2 = this;
                                    if (n != 0) break block10;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                if (dug2.d4b++ < 1200) break block11;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            return;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    dug3 = this;
                }
                dug3.ko8();
            }
            dug2 = this;
        }
        super.y8h();
    }

    public void ko8() {
        this.d4b = 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean ud3(boolean var1_1) {
        block51: {
            block52: {
                block47: {
                    block44: {
                        block43: {
                            block41: {
                                block42: {
                                    block53: {
                                        block40: {
                                            var2_2 = dug.b ^ 132390837550248L;
                                            var4_3 = t9d.b();
                                            v0 = this;
                                            if (var4_3 == 0) break block53;
                                            try {
                                                block54: {
                                                    if (v0.t9z.z28() != gxq.gl_) break block40;
                                                    break block54;
                                                    catch (Throwable v1) {
                                                        throw dug.a(v1);
                                                    }
                                                }
                                                return false;
                                            }
                                            catch (Throwable v2) {
                                                throw dug.a(v2);
                                            }
                                        }
                                        v0 = this;
                                    }
                                    var5_4 = v0.js1.size();
                                    v3 = var5_4;
                                    v4 = this.d5o.size();
                                    if (var4_3 == 0) break block41;
                                    try {
                                        block55: {
                                            if (v3 == v4) break block42;
                                            break block55;
                                            catch (Throwable v5) {
                                                throw dug.a(v5);
                                            }
                                        }
                                        throw new IllegalStateException((String)dug.b("w", (int)21862, (long)(740624056721460520L ^ var2_2)));
                                    }
                                    catch (Throwable v6) {
                                        throw dug.a(v6);
                                    }
                                }
                                try {
                                    v3 = var5_4;
                                    if (var4_3 == 0) break block43;
                                    v4 = 1000;
                                }
                                catch (Throwable v7) {
                                    throw dug.a(v7);
                                }
                            }
                            if (v3 > v4) {
                                var5_4 = 1000;
                            }
                            this.e8t.qek((String)dug.b("w", (int)4524, (long)(7207502484371376621L ^ var2_2)));
                            v3 = var6_5 = 0;
                        }
                        while (var6_5 < var5_4) {
                            block45: {
                                block57: {
                                    block58: {
                                        block56: {
                                            var7_7 = (rty)this.js1.first();
                                            if (var4_3 == 0) break block44;
                                            v8 = var1_1;
                                            if (var4_3 == 0) break block45;
                                            break block56;
                                            catch (Throwable v9) {
                                                throw dug.a(v9);
                                            }
                                        }
                                        if (v8 != 0) break block57;
                                        break block58;
                                        catch (Throwable v10) {
                                            throw dug.a(v10);
                                        }
                                    }
                                    try {
                                        block59: {
                                            cfr_temp_0 = var7_7.pjb - this.t9z.zex();
                                            v8 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                            if (var4_3 == 0) break block45;
                                            break block59;
                                            catch (Throwable v11) {
                                                throw dug.a(v11);
                                            }
                                        }
                                        if (v8 > 0) {
                                            break;
                                        }
                                    }
                                    catch (Throwable v12) {
                                        throw dug.a(v12);
                                    }
                                }
                                this.js1.remove(var7_7);
                                this.d5o.remove(var7_7);
                                v8 = (int)this.xa7.add(var7_7);
                            }
                            ++var6_5;
                            if (var4_3 != 0) continue;
                        }
                        this.e8t.uio();
                        this.e8t.qek((String)dug.b("w", (int)9880, (long)(8391426880520928978L ^ var2_2)));
                    }
                    var6_6 = this.xa7.iterator();
                    while (var6_6.hasNext()) {
                        block50: {
                            block46: {
                                block49: {
                                    block48: {
                                        var7_7 = (rty)var6_6.next();
                                        var6_6.remove();
                                        var8_8 = 0;
                                        v13 = this;
                                        v14 = var7_7.weq.ec4(-var8_8, -var8_8, -var8_8);
                                        v15 = var7_7;
                                        if (var4_3 == 0) break block46;
                                        try {
                                            block60: {
                                                v16 = v13.o2i(v14, v15.weq.ec4(var8_8, var8_8, var8_8));
                                                if (var4_3 == 0) break block47;
                                                break block60;
                                                catch (Throwable v17) {
                                                    throw dug.a(v17);
                                                }
                                            }
                                            if (v16) {
                                            }
                                            ** GOTO lbl148
                                        }
                                        catch (Throwable v18) {
                                            throw dug.a(v18);
                                        }
                                        var9_9 = this.getBlockState(var7_7.weq);
                                        v19 = var9_9.r_y();
                                        if (var4_3 == 0) break block48;
                                        try {
                                            block61: {
                                                if (v19.p1r() == p3y.cei) break block49;
                                                break block61;
                                                catch (Throwable v20) {
                                                    throw dug.a(v20);
                                                }
                                            }
                                            v19 = var9_9.r_y();
                                        }
                                        catch (Throwable v21) {
                                            throw dug.a(v21);
                                        }
                                    }
                                    try {
                                        if (var4_3 != 0) {
                                            if (!e0x.wma(v19, var7_7.qny())) break block49;
                                        }
                                        ** GOTO lbl136
                                    }
                                    catch (Throwable v22) {
                                        throw dug.a(v22);
                                    }
                                    try {
                                        v19 = var9_9.r_y();
lbl136:
                                        // 2 sources

                                        v19.zvy(this, var7_7.weq, var9_9, this.fsy);
                                    }
                                    catch (Throwable var10_10) {
                                        var11_11 = e1i.cor(var10_10, (String)dug.b("w", (int)24790, (long)(7083667131559377039L ^ var2_2)));
                                        var12_12 = var11_11.i_r((String)dug.b("w", (int)5937, (long)(4610646659886649196L ^ var2_2)));
                                        wsc.uxq(var12_12, var7_7.weq, var9_9);
                                        throw new oov(var11_11);
                                    }
                                }
                                try {
                                    if (var4_3 != 0) break block50;
lbl148:
                                    // 2 sources

                                    v13 = this;
                                    v14 = var7_7.weq;
                                    v15 = var7_7;
                                }
                                catch (Throwable v23) {
                                    throw dug.a(v23);
                                }
                            }
                            v13.cjk(v14, v15.qny(), 0);
                        }
                        if (var4_3 != 0) continue;
                    }
                    this.e8t.uio();
                    this.xa7.clear();
                    v16 = this.js1.isEmpty();
                }
                try {
                    if (var4_3 == 0) break block51;
                    if (v16) break block52;
                }
                catch (Throwable v24) {
                    throw dug.a(v24);
                }
                v16 = true;
                break block51;
            }
            v16 = false;
        }
        return v16;
    }

    @Override
    public List n1l(tts tts2, boolean bl) {
        h2f h2f2 = tts2.iu_();
        int n = (h2f2.jnd << 4) - 2;
        int n2 = n + 16 + 2;
        int n3 = (h2f2.km5 << 4) - 2;
        int n4 = n3 + 16 + 2;
        return this.m9p(new yve(n, 0, n3, n2, 256, n4), bl);
    }

    @Override
    public List m9p(yve yve2, boolean bl) {
        List list = null;
        int n = 0;
        int n2 = t9d.c();
        block20: while (true) {
            int n3 = n;
            int n4 = 2;
            block21: while (n3 < n4) {
                Iterator iterator;
                block36: {
                    block35: {
                        if (n != 0) break block35;
                        iterator = this.js1.iterator();
                        if (n2 == 0) break block36;
                    }
                    iterator = this.xa7.iterator();
                }
                while (iterator.hasNext()) {
                    block27: {
                        List list2;
                        rty rty2;
                        block33: {
                            block34: {
                                block32: {
                                    block31: {
                                        int n5;
                                        block30: {
                                            int n6;
                                            block29: {
                                                mew mew2;
                                                block28: {
                                                    block26: {
                                                        rty2 = (rty)iterator.next();
                                                        mew2 = rty2.weq;
                                                        n3 = mew2.getX();
                                                        n4 = yve2.gdj;
                                                        if (n2 != 0) continue block21;
                                                        try {
                                                            try {
                                                                if (n2 != 0) break block26;
                                                                if (n3 < n4) break block27;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw dug.a(illegalStateException);
                                                            }
                                                            n5 = mew2.getX();
                                                            n6 = yve2.kwp;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (n2 != 0) break block28;
                                                            if (n5 >= n6) break block27;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                        n5 = mew2.getZ();
                                                        n6 = yve2.ob0;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (n2 != 0) break block29;
                                                            if (n5 < n6) break block27;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw dug.a(illegalStateException);
                                                        }
                                                        n5 = mew2.getZ();
                                                        if (n2 != 0) break block30;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    n6 = yve2.nwc;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                            }
                                            if (n5 >= n6) break block27;
                                            n5 = bl ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                if (n2 != 0) break block31;
                                                if (n5 == 0) break block32;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            n5 = this.d5o.remove(rty2) ? 1 : 0;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                    }
                                    iterator.remove();
                                }
                                try {
                                    list2 = list;
                                    if (n2 != 0) break block33;
                                    if (list2 != null) break block34;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                list = Lists.newArrayList();
                            }
                            list2 = list;
                        }
                        list2.add(rty2);
                    }
                    if (n2 == 0) continue;
                }
                ++n;
                if (n2 == 0) continue block20;
            }
            break;
        }
        return list;
    }

    @Override
    public void wu1(i2h i2h2, boolean bl) {
        dug dug2;
        block22: {
            block23: {
                i2h i2h3;
                block24: {
                    boolean bl2;
                    int n;
                    block18: {
                        block19: {
                            i2h i2h4;
                            block20: {
                                block21: {
                                    n = t9d.b();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl2 = this.dtu();
                                                        if (n == 0) break block18;
                                                        if (bl2) break block19;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        throw dug.a(illegalStateException);
                                                    }
                                                    i2h4 = i2h2;
                                                    if (n == 0) break block20;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                if (i2h4 instanceof j37) break block21;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            bl2 = i2h2 instanceof jd3;
                                            if (n == 0) break block18;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        if (!bl2) break block19;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                }
                                i2h4 = i2h2;
                            }
                            i2h4._kl();
                        }
                        try {
                            dug2 = this;
                            if (n == 0) break block22;
                            bl2 = dug2.m5r();
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (bl2) break block23;
                                i2h3 = i2h2;
                                if (n == 0) break block24;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            if (!(i2h3 instanceof mbf)) break block23;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        i2h3 = i2h2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                i2h3._kl();
            }
            dug2 = this;
        }
        super.wu1(i2h2, bl);
    }

    private boolean m5r() {
        return this.s4x.utb();
    }

    private boolean dtu() {
        return this.s4x.o3m();
    }

    @Override
    public g6k qya() {
        oza oza2 = this.ujg.kmb(this.vzz);
        this.kil = new gvi(this, oza2, this.vzz.ska());
        return this.kil;
    }

    public List _12(int n, int n2, int n3, int n4, int n5, int n6) {
        ArrayList arrayList = Lists.newArrayList();
        int n7 = 0;
        int n8 = t9d.b();
        while (n7 < this.cn6.size()) {
            block26: {
                block27: {
                    int n9;
                    int n10;
                    pyk pyk2;
                    block31: {
                        mew mew2;
                        block30: {
                            block29: {
                                block28: {
                                    pyk2 = (pyk)this.cn6.get(n7);
                                    mew2 = pyk2.y8_();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n8 == 0) break block26;
                                                    if (mew2.getX() < n) break block27;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw dug.a(illegalStateException);
                                                }
                                                n10 = mew2.getY();
                                                n9 = n2;
                                                if (n8 == 0) break block28;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw dug.a(illegalStateException);
                                            }
                                            if (n10 < n9) break block27;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        n10 = mew2.getZ();
                                        n9 = n3;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                }
                                try {
                                    try {
                                        if (n8 == 0) break block29;
                                        if (n10 < n9) break block27;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                    n10 = mew2.getX();
                                    n9 = n4;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                            }
                            try {
                                try {
                                    if (n8 == 0) break block30;
                                    if (n10 >= n9) break block27;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                n10 = mew2.getY();
                                n9 = n5;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n8 == 0) break block31;
                                    if (n10 >= n9) break block27;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                n10 = mew2.getZ();
                                if (n8 == 0) break block27;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            n9 = n6;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    try {
                        if (n10 < n9) {
                            n10 = arrayList.add(pyk2) ? 1 : 0;
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                ++n7;
            }
            if (n8 != 0) continue;
        }
        return arrayList;
    }

    @Override
    public boolean q2p(ha9 ha92, mew mew2) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            bl = this.s4x.pbe(this, mew2, ha92);
                            if (n == 0) break block6;
                            if (bl) break block7;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        bl = this.fve().hka(mew2);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
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
    @Override
    public void _kk(h50 var1_1) {
        block12: {
            var2_2 = dug.b ^ 87228563251096L;
            var4_3 = t9d.b();
            try {
                v0 = this.t9z;
                if (var4_3 != 0) {
                    if (v0.utc()) break block12;
                }
                ** GOTO lbl20
            }
            catch (Throwable v1) {
                throw dug.a(v1);
            }
            try {
                block13: {
                    try {
                        this.gwl(var1_1);
                        v2 = this;
                        if (var4_3 == 0) break block13;
                        v0 = v2.t9z;
                    }
                    catch (Throwable v3) {
                        throw dug.a(v3);
                    }
lbl20:
                    // 2 sources

                    try {
                        if (v0.z28() == gxq.gl_) {
                            this.twv();
                        }
                    }
                    catch (Throwable v4) {
                        throw dug.a(v4);
                    }
                    v2 = this;
                }
                super._kk(var1_1);
            }
            catch (Throwable var5_4) {
                var6_5 = e1i.cor(var5_4, (String)dug.b("w", (int)650, (long)(3773724720096459246L ^ var2_2)));
                try {
                    this.utr(var6_5);
                }
                catch (Throwable var7_6) {
                    // empty catch block
                }
                throw new oov(var6_5);
            }
            this.t9z.hk8(true);
        }
    }

    private void twv() {
        long l = b ^ 0x29338ABD2C87L;
        this.t9z.mfq(false);
        this.t9z.j0i(true);
        this.t9z.do3(false);
        this.t9z.kcj(false);
        this.t9z.rik(1000000000);
        this.t9z.l5d(6000L);
        this.t9z.vg1(h50$f05.l18);
        this.t9z.uo1(false);
        this.t9z.jbe(v66.na2);
        this.t9z.mik(true);
        this.eir().iqg((String)((Object)dug.b("w", (int)25591, (long)(0x5C9FE9E8D7122B9BL ^ l))), (String)((Object)dug.b("w", (int)16655, (long)(0x48D3893FC5B00968L ^ l))));
    }

    /*
     * Unable to fully structure code
     */
    private void gwl(h50 var1_1) {
        block25: {
            block30: {
                block29: {
                    block28: {
                        block26: {
                            block23: {
                                var2_2 = dug.b ^ 10326463420706L;
                                var4_3 = t9d.c();
                                try {
                                    block24: {
                                        try {
                                            try {
                                                v0 = this;
                                                if (var4_3 != 0) break block23;
                                                if (v0.vzz.vm6()) break block24;
                                            }
                                            catch (IllegalStateException v1) {
                                                throw dug.a(v1);
                                            }
                                            this.t9z.d2x(mew._9b.z89(this.vzz.z9e()));
                                            if (var4_3 == 0) break block25;
                                        }
                                        catch (IllegalStateException v2) {
                                            throw dug.a(v2);
                                        }
                                    }
                                    v0 = this;
                                }
                                catch (IllegalStateException v3) {
                                    throw dug.a(v3);
                                }
                            }
                            try {
                                block27: {
                                    try {
                                        try {
                                            if (var4_3 != 0) break block26;
                                            if (v0.t9z.z28() != gxq.gl_) break block27;
                                        }
                                        catch (IllegalStateException v4) {
                                            throw dug.a(v4);
                                        }
                                        this.t9z.d2x(mew._9b.nuv());
                                        if (var4_3 == 0) break block25;
                                    }
                                    catch (IllegalStateException v5) {
                                        throw dug.a(v5);
                                    }
                                }
                                this.ka0 = true;
                                v0 = this;
                            }
                            catch (IllegalStateException v6) {
                                throw dug.a(v6);
                            }
                        }
                        var5_4 = v0.vzz.wvm();
                        var6_5 = var5_4.l7g();
                        var7_6 = new Random(this.x2p());
                        var8_7 = var5_4.rc6(0, 0, 256, var6_5, var7_6);
                        var9_8 = 0;
                        var10_9 = this.vzz.z9e();
                        var11_10 = 0;
                        try {
                            v7 = var8_7;
                            if (var4_3 != 0) break block28;
                            if (v7 != null) {
                            }
                            ** GOTO lbl65
                        }
                        catch (IllegalStateException v8) {
                            throw dug.a(v8);
                        }
                        var9_8 = var8_7.getX();
                        v7 = var8_7;
                    }
                    var11_10 = v7.getZ();
                    try {
                        if (var4_3 == 0) break block29;
lbl65:
                        // 2 sources

                        dug.qa4.warn((String)dug.b("w", (int)31181, (long)(7505606049614464017L ^ var2_2)));
                    }
                    catch (IllegalStateException v9) {
                        throw dug.a(v9);
                    }
                }
                var12_11 = 0;
                while (!this.vzz.au7(var9_8, var11_10)) {
                    var9_8 += var7_6.nextInt(64) - var7_6.nextInt(64);
                    var11_10 += var7_6.nextInt(64) - var7_6.nextInt(64);
                    if (++var12_11 != 1000) continue;
                }
                try {
                    try {
                        this.t9z.d2x(new mew(var9_8, var10_9, var11_10));
                        v10 = this;
                        if (var4_3 != 0) break block30;
                        v10.ka0 = false;
                        if (!var1_1.r12()) break block25;
                    }
                    catch (IllegalStateException v11) {
                        throw dug.a(v11);
                    }
                    v10 = this;
                }
                catch (IllegalStateException v12) {
                    throw dug.a(v12);
                }
            }
            v10.hlp();
        }
    }

    public void hlp() {
        vqp vqp2 = new vqp(hsf, 10);
        int n = 0;
        int n2 = t9d.b();
        while (n < 10) {
            block6: {
                int n3 = this.t9z.c21() + this.fsy.nextInt(6) - this.fsy.nextInt(6);
                int n4 = this.t9z.ans() + this.fsy.nextInt(6) - this.fsy.nextInt(6);
                mew mew2 = this.pnv(new mew(n3, 0, n4)).nuv();
                try {
                    try {
                        if (n2 == 0) break block6;
                        if (vqp2.v3g(this, this.fsy, mew2)) {
                            break;
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
                ++n;
            }
            if (n2 != 0) continue;
        }
    }

    public mew tk1() {
        return this.vzz.iw9();
    }

    public void w3w(boolean bl, sw6 sw62) {
        block18: {
            int n;
            block21: {
                sw6 sw63;
                long l;
                block19: {
                    block20: {
                        l = b ^ 0x5292B31E3792L;
                        n = t9d.c();
                        try {
                            try {
                                try {
                                    if (!this.jro.pj4()) break block18;
                                    sw63 = sw62;
                                    if (n != 0) break block19;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                if (sw63 == null) break block20;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            sw62.pg4((String)((Object)dug.b("w", (int)20746, (long)(0x51585E659520267L ^ l))));
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    try {
                        this.u54();
                        if (n != 0) break block21;
                        sw63 = sw62;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                try {
                    if (sw63 != null) {
                        sw62.an6((String)((Object)dug.b("w", (int)18793, (long)(0xFC07284DD2B9A0FL ^ l))));
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
                this.jro.va4(bl, sw62);
            }
            for (tts tts2 : Lists.newArrayList((Iterable)this.kil.vrp())) {
                block22: {
                    dug dug2;
                    block23: {
                        try {
                            try {
                                try {
                                    if (tts2 == null) break block22;
                                    dug2 = this;
                                    if (n != 0) break block23;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                if (dug2.qka.cwk(tts2.nzx, tts2.yxl)) break block22;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            dug2 = this;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    dug2.kil.ztg(tts2.nzx, tts2.yxl);
                }
                if (n == 0) continue;
            }
        }
    }

    public void bt7() {
        block5: {
            g6k g6k2;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        g6k2 = this.jro;
                        if (n != 0) break block4;
                        if (!g6k2.pj4()) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    g6k2 = this.jro;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            g6k2.hua();
        }
    }

    public void u54() {
        this.f_u();
        this.t9z.hum(this.fve().cuf());
        this.t9z.fbt(this.fve().nf3());
        this.t9z.bfu(this.fve().ad0());
        this.t9z.ftb(this.fve().x5x());
        this.t9z._lr(this.fve().k98());
        this.t9z.eqk(this.fve().skm());
        this.t9z.c7e(this.fve().xyx());
        this.t9z.v4w(this.fve().uz5());
        this.t9z.z1o(this.fve().a2z());
        this.ujg.oh5(this.t9z, this.s4x.wh3().u2u());
        this.hqr._0a();
    }

    @Override
    public void m8m(i2h i2h2) {
        super.m8m(i2h2);
        int n = t9d.c();
        this.twi.yfe(i2h2.jwu(), i2h2);
        this.iqq.put(i2h2.b_q(), i2h2);
        int n2 = n;
        i2h[] i2hArray = i2h2.u_g();
        if (i2hArray != null) {
            for (int i = 0; i < i2hArray.length; ++i) {
                this.twi.yfe(i2hArray[i].jwu(), i2hArray[i]);
                if (n2 == 0) continue;
            }
        }
    }

    @Override
    public void cvm(i2h i2h2) {
        super.cvm(i2h2);
        int n = t9d.b();
        this.twi.un9(i2h2.jwu());
        int n2 = n;
        this.iqq.remove(i2h2.b_q());
        i2h[] i2hArray = i2h2.u_g();
        if (i2hArray != null) {
            for (int i = 0; i < i2hArray.length; ++i) {
                this.twi.un9(i2hArray[i].jwu());
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public boolean _b8(i2h i2h2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = super._b8(i2h2);
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    this.s4x.wh3().dyz(i2h2.o2v, i2h2.kfp, i2h2.vbd, 512.0, this.vzz.gs_(), new S2CPacketSpawnGlobalEntity(i2h2));
                    return true;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void qyn(i2h i2h2, byte by) {
        this.fp4().wru(i2h2, new S19PacketEntityStatus(i2h2, by));
    }

    @Override
    public vu6 dta(i2h i2h2, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        int n;
        vu6 vu62;
        block10: {
            vu6 vu63;
            block9: {
                vu62 = new vu6(this, i2h2, d, d2, d3, f, bl, bl2);
                int n2 = t9d.b();
                vu62.zj7();
                n = n2;
                try {
                    try {
                        vu63 = vu62;
                        if (n == 0) break block9;
                        vu63.vw3(false);
                        if (bl2) break block10;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    vu63 = vu62;
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            vu63.cvs();
        }
        for (ha9 ha92 : this.rpk) {
            block12: {
                ha9 ha93;
                block11: {
                    try {
                        try {
                            ha93 = ha92;
                            if (n == 0) break block11;
                            if (!(ha93.p53(d, d2, d3) < 4096.0)) break block12;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        ha93 = ha92;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                ((z96)ha93).rhh.vnf(new S27PacketExplosion(d, d2, d3, f, vu62.egt(), (fqr)vu62.xpv().get(ha92)));
            }
            if (n != 0) continue;
        }
        return vu62;
    }

    @Override
    public void dfj(mew mew2, e0x e0x2, int n, int n2) {
        block3: {
            boolean bl;
            mr_ mr_2 = new mr_(mew2, e0x2, n, n2);
            Iterator iterator = this.ojm[this.egn].iterator();
            int n3 = t9d.b();
            while (iterator.hasNext()) {
                block4: {
                    mr_ mr_3 = (mr_)iterator.next();
                    try {
                        bl = mr_3.equals(mr_2);
                        if (n3 == 0) break block3;
                        if (!bl) break block4;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                    return;
                }
                if (n3 != 0) continue;
            }
            bl = this.ojm[this.egn].add(mr_2);
        }
    }

    private void hqw() {
        int n = t9d.b();
        block2: while (true) {
            boolean bl = this.ojm[this.egn].isEmpty();
            block3: while (!bl) {
                int n2 = this.egn;
                this.egn ^= 1;
                for (mr_ mr_2 : this.ojm[n2]) {
                    block8: {
                        dug dug2;
                        block7: {
                            try {
                                dug2 = this;
                                if (n == 0) break block7;
                                bl = dug2.cqp(mr_2);
                                if (n == 0) continue block3;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                            if (!bl) break block8;
                            dug2 = this;
                        }
                        dug2.s4x.wh3().dyz(mr_2.fi2().getX(), mr_2.fi2().getY(), mr_2.fi2().getZ(), 64.0, this.vzz.gs_(), new S24PacketBlockAction(mr_2.fi2(), mr_2.mqh(), mr_2.w0v(), mr_2._l4()));
                    }
                    if (n != 0) continue;
                }
                this.ojm[n2].clear();
                if (n != 0) continue block2;
            }
            break;
        }
    }

    private boolean cqp(mr_ mr_2) {
        boolean bl;
        block6: {
            block5: {
                e0x e0x2;
                zfz zfz2;
                block4: {
                    int n = t9d.b();
                    zfz2 = this.getBlockState(mr_2.fi2());
                    try {
                        try {
                            e0x2 = zfz2.r_y();
                            if (n == 0) break block4;
                            if (e0x2 != mr_2.mqh()) break block5;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        e0x2 = zfz2.r_y();
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                bl = e0x2.ng5(this, mr_2.fi2(), zfz2, mr_2.w0v(), mr_2._l4());
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public void wo7() {
        this.ujg.vpx();
    }

    @Override
    public void hk_() {
        block21: {
            block23: {
                float f;
                int n;
                block20: {
                    boolean bl;
                    block18: {
                        block19: {
                            block16: {
                                float f2;
                                block17: {
                                    bl = this.xqu();
                                    int n2 = t9d.b();
                                    super.hk_();
                                    n = n2;
                                    try {
                                        try {
                                            float f3 = this.n28 - this.wni;
                                            f = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                            if (n == 0) break block16;
                                            if (f == false) break block17;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw dug.a(illegalStateException);
                                        }
                                        this.s4x.wh3().qvv(new S2BPacketChangeGameState(7, this.wni), this.vzz.gs_());
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw dug.a(illegalStateException);
                                    }
                                }
                                f = (f2 = this.o2u - this.dqw) == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                            }
                            try {
                                try {
                                    if (n == 0) break block18;
                                    if (f == false) break block19;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw dug.a(illegalStateException);
                                }
                                this.s4x.wh3().qvv(new S2BPacketChangeGameState(8, this.dqw), this.vzz.gs_());
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw dug.a(illegalStateException);
                            }
                        }
                        f = (float)bl;
                    }
                    try {
                        try {
                            if (n == 0) break block20;
                            if (f == this.xqu()) break block21;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                        f = (float)bl;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw dug.a(illegalStateException);
                    }
                }
                try {
                    block22: {
                        try {
                            if (f == false) break block22;
                            this.s4x.wh3().v3l(new S2BPacketChangeGameState(2, 0.0f));
                            if (n != 0) break block23;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw dug.a(illegalStateException);
                        }
                    }
                    this.s4x.wh3().v3l(new S2BPacketChangeGameState(1, 0.0f));
                }
                catch (IllegalStateException illegalStateException) {
                    throw dug.a(illegalStateException);
                }
            }
            this.s4x.wh3().v3l(new S2BPacketChangeGameState(7, this.wni));
            this.s4x.wh3().v3l(new S2BPacketChangeGameState(8, this.dqw));
        }
    }

    @Override
    public int _hl() {
        return this.s4x.wh3().pci();
    }

    public vr1 ve6() {
        return this.s4x;
    }

    public qpc fp4() {
        return this.clb;
    }

    public ey1 gez() {
        return this.qka;
    }

    public ooh i4a() {
        return this._kf;
    }

    public void zra(w_0 w_02, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int[] nArray) {
        this.zza(w_02, false, d, d2, d3, n, d4, d5, d6, d7, nArray);
    }

    /*
     * Unable to fully structure code
     */
    public void zza(w_0 var1_1, boolean var2_2, double var3_3, double var5_4, double var7_5, int var9_6, double var10_7, double var12_8, double var14_9, double var16_10, int[] var18_11) {
        var20_12 = new S2APacketParticles(var1_1, var2_2, (float)var3_3, (float)var5_4, (float)var7_5, (float)var10_7, (float)var12_8, (float)var14_9, (float)var16_10, var9_6, var18_11);
        var19_14 = t9d.b();
        for (var21_13 = 0; var21_13 < this.rpk.size(); ++var21_13) {
            block11: {
                block10: {
                    var22_15 = (z96)this.rpk.get(var21_13);
                    var23_16 = var22_15.d3d();
                    var24_17 = var23_16.p4e(var3_3, var5_4, var7_5);
                    try {
                        cfr_temp_0 = var24_17 - 256.0;
                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                        if (var19_14 == 0) break block10;
                        if (v0 > 0) {
                        }
                        ** GOTO lbl33
                    }
                    catch (IllegalStateException v1) {
                        throw dug.a(v1);
                    }
                    v0 = (double)var2_2;
                }
                try {
                    try {
                        if (var19_14 == 0) break block11;
                        if (v0 == false) continue;
                    }
                    catch (IllegalStateException v2) {
                        throw dug.a(v2);
                    }
                    cfr_temp_1 = var24_17 - 65536.0;
                    v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                }
                catch (IllegalStateException v3) {
                    throw dug.a(v3);
                }
            }
            try {
                if (v0 > 0) continue;
lbl33:
                // 2 sources

                var22_15.rhh.vnf(var20_12);
                continue;
            }
            catch (IllegalStateException v4) {
                throw dug.a(v4);
            }
        }
    }

    public i2h yzl(UUID uUID) {
        return (i2h)this.iqq.get(uUID);
    }

    @Override
    public ListenableFuture acd(Runnable runnable) {
        return this.s4x.acd(runnable);
    }

    @Override
    public boolean xii() {
        return this.s4x.xii();
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

                dug.b = c.a(-6699295493992522405L, 8505391361870021511L, MethodHandles.lookup().lookupClass()).a(124353805651614L);
                dug.i = new HashMap<K, V>(13);
                var0 = dug.b ^ 120099264745633L;
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
                var9_3 = new String[28];
                var7_4 = 0;
                var6_5 = "\u00ca\u00af\u00d9\u00f1^\u00a0\u0010\u00bf\u00cc\u000e'TD\u00a6\u001428\u00b3[zT\u00028N\u00a0\u00f5\u00c5\u0002[\u008d\u00aa\u00a9\u00efl|ma\u000b<\u00af\u0081Y\u00e3\u00fa\u00a9%\u00e1u w\u00a0w\u00f0\u009b'\u00cf\u0005\u0086\u00be\u0096\u00eb\u00fd\u0001UC\u00ec\u0084\u0011)@7\u00ba!_6\u0087'NNOx ;\u00aa\u00f6<f|\u00fd\u00cf\u00a8\u00b4\u009b\u00fcny\u00de\u008b\u0094\u00ect\u00df\u0007\u0095U\u0087\u0085<\u00d6\u00a7`\u00a8\u0097\u00bb \u000f\u00e4\u008aPR\u00b2\u00b2\u00f2\u0002\u0084]\u00a9\u00b6\u00c8\u00d3-\u00c3\u0010\u00ca\u00ddq\u00e6\u009c\u00fd\u0098\u00a2\u00cbX\u00d2\u00be\u00e1.\u0010\u00ca\u00bfH\u000b\u00e9\u009f|\u0080\u00e7\u0007\u00ad\u00d2\u00fd`[\u00e6\u0018\u0004\u0015\u0093\u00a14\u0015\u00f3\u00bb\u0085b\u00e3O\u00f01\u00d6\u0001q\u00c51J\bBr\u0015\u0010\u00b1@\u00df\u00fcb\u00ae%'?52^\u0011\u00b9\u0098\u00e2\u0018\u0010P\u0090\u00a96\u00d7\u0006\u0005\u00fc#\u00fdDA\u008fz)\u00cb\u00a0Cc\u00f0\u00a3\u000b\u0082 \u000e2KS\u0099\u00aa\u0006p\u00a6\n).S\u00ea/V\\\u00f5\u00ad\u00e04(\n\u00d7\u00cf\u0094\u0019\u008c\u00f4\u00d5\u00f8\u00c3\u0010\u00f6\u00eeF\u0019b\u00b4\u00f7\u00f0\u00a0Le\u008d\u008c!\u00d1&\u0018s[\u00f3\u008fq \u00e8:M*\u00c3\u00b3\u00dc\u00b0e.\u00e7\u00f0\u00d4\u009e!}\u0095m P\u000e\u00df|\u0082\u0086@\u00a6\u0083\u0013\u00adf*\u00e4lX\u009b\u00ea\u009d\u00a7\u00b1>\u0018\u0013D\u00db\r\u009f\u008d\u00f8}\u0095 \u00d85\u0082a&6'\u0084\u00d3>3\u00f6\u00ea]0\"^\u00ee\u008a\u0097,\u001c\u0010KL&I\u0098\u00b3MSY !rZ\u00e5\u00a8\u00ca\u00c4\u00f0\u008e\u0082\u00d7\u00ab\\s?\u00f4\u00cdDH\u0099\u00b3nQ\u00fa\u007ff\u00edT\u009a\u008d+\u008c \u00e8\u0016fqBo\u0084\b\u00f6\u0005\u00b2O4,\u00c8\u008fS\u00a3W\u0004=\u0090\u00bc~\u00d5\u0083\u0000\u00ad\u00a1\u00d8\u008f\u0016\u0018G\u00cf\u0092\u0084\u009f\u00dd\u00bc\u00cc9\u00f6\u00c67p\u0086\u009d>\u008bQ\u00d3\u009c\u00cb%O\u00c7 \u000e\u00b6P%\u00d0\u00f4\u00d5\u00a9\u00c4{\u00b2\u00c1m\u00ba\u0007&M4^\u00df_aq?\u008b*m\u001d\u00ee\u007fn\u00e1\u0010\u00f3\u0084h\u0014*\u0094\u00b7\u00de=\u00ef\u00c7\u0014\u0019\u00a2\u00d9O \u0090go\u00c4hE\u00b7tW\u00f8\u0014\u00dc\n\u00b9\rjs4y\u001e\u0012\u0099\b\u0018\\\u00f0\u008b_}^\u0083\u0084(\u0091\u00a2X\u008a\u00be\u009c\u00fcxS\u00fau\u008e\u0010\u00a6P\u00fa!\u00c0\u00f00,\u008ep\u008e<\u00a4\u00b0\u0086\u000f\u00b9\u00d7%Y\u00a3\u000b\u0083,\f\u009e\u0093\u0018\u0014\u00ae\u0081\u0092\u00cc\u0015\u00afh\u00a5N\u00f5Ys\u0010\u0080\u001a\u00e2\u00bd\u0085\u00c1\u00cd\u00ea\u0000\\\u0018,\u00c3&\u00d9\u00e7\u00d7\u0096\u00af\u00c4\u00caJ*\u0086u\u00fe\u00fb\u00cd\u000b\u009b\u00f9'\u00f9\b\u0087 \u001d\u00ff\u009c S\u00c0\u00d2\u00aac\u00bb\u00c4\u00cdL\u0091\u00ff_quC\u00a9y\u00bb\u009d>\u00e0.\u0012vG\r${8W\u00a6\u00fc\u00dfFx\u00e7\u00ef\u00d0*s\u0099#\u00d8\u00f73X\u00ae\u00e4\u00ff\u00eb\u00c3\u00ecb\u00e3\u00ae\u00b8x\u0084\u00b4%\u0085\u00ae~\u0082\u00c8\u00f5\u0013\u0097\u0015c\u00d8+\u00cc\u00ac\u00d9G\u00c9={\u00fe\u00e3\\$-\u00ff8\u00dc7;\u008e\u000f\u008c\u0006\u00a8\u00bc\u00fc\u00b4\f\u00b8\u0083\u00ba\u008a|\u0095\u00d2H\u00d4I\u00e0\u00b6\u008d>\u00efr\u00c3r\u0012\u00b8\u0007\u00b1\u00e8\u009b\u0016\u0000\u00c4\u00c3\u00f6x_\u001d\u0089;\u001b\u00dbh\u00ca\u00a6\u00d9\r\u00f3\u00a5\u00b9 \u0016\u00b1$\u009b\u00db\u009f;%_\u00eb\u00bd\u009am\u001e\u0007\u00ea\u00f3\u0016\u00a7\u0001\f\u00c3\u00f9y\u009b\u00ab\r-\u00efKg\u00de";
                var8_6 = "\u00ca\u00af\u00d9\u00f1^\u00a0\u0010\u00bf\u00cc\u000e'TD\u00a6\u001428\u00b3[zT\u00028N\u00a0\u00f5\u00c5\u0002[\u008d\u00aa\u00a9\u00efl|ma\u000b<\u00af\u0081Y\u00e3\u00fa\u00a9%\u00e1u w\u00a0w\u00f0\u009b'\u00cf\u0005\u0086\u00be\u0096\u00eb\u00fd\u0001UC\u00ec\u0084\u0011)@7\u00ba!_6\u0087'NNOx ;\u00aa\u00f6<f|\u00fd\u00cf\u00a8\u00b4\u009b\u00fcny\u00de\u008b\u0094\u00ect\u00df\u0007\u0095U\u0087\u0085<\u00d6\u00a7`\u00a8\u0097\u00bb \u000f\u00e4\u008aPR\u00b2\u00b2\u00f2\u0002\u0084]\u00a9\u00b6\u00c8\u00d3-\u00c3\u0010\u00ca\u00ddq\u00e6\u009c\u00fd\u0098\u00a2\u00cbX\u00d2\u00be\u00e1.\u0010\u00ca\u00bfH\u000b\u00e9\u009f|\u0080\u00e7\u0007\u00ad\u00d2\u00fd`[\u00e6\u0018\u0004\u0015\u0093\u00a14\u0015\u00f3\u00bb\u0085b\u00e3O\u00f01\u00d6\u0001q\u00c51J\bBr\u0015\u0010\u00b1@\u00df\u00fcb\u00ae%'?52^\u0011\u00b9\u0098\u00e2\u0018\u0010P\u0090\u00a96\u00d7\u0006\u0005\u00fc#\u00fdDA\u008fz)\u00cb\u00a0Cc\u00f0\u00a3\u000b\u0082 \u000e2KS\u0099\u00aa\u0006p\u00a6\n).S\u00ea/V\\\u00f5\u00ad\u00e04(\n\u00d7\u00cf\u0094\u0019\u008c\u00f4\u00d5\u00f8\u00c3\u0010\u00f6\u00eeF\u0019b\u00b4\u00f7\u00f0\u00a0Le\u008d\u008c!\u00d1&\u0018s[\u00f3\u008fq \u00e8:M*\u00c3\u00b3\u00dc\u00b0e.\u00e7\u00f0\u00d4\u009e!}\u0095m P\u000e\u00df|\u0082\u0086@\u00a6\u0083\u0013\u00adf*\u00e4lX\u009b\u00ea\u009d\u00a7\u00b1>\u0018\u0013D\u00db\r\u009f\u008d\u00f8}\u0095 \u00d85\u0082a&6'\u0084\u00d3>3\u00f6\u00ea]0\"^\u00ee\u008a\u0097,\u001c\u0010KL&I\u0098\u00b3MSY !rZ\u00e5\u00a8\u00ca\u00c4\u00f0\u008e\u0082\u00d7\u00ab\\s?\u00f4\u00cdDH\u0099\u00b3nQ\u00fa\u007ff\u00edT\u009a\u008d+\u008c \u00e8\u0016fqBo\u0084\b\u00f6\u0005\u00b2O4,\u00c8\u008fS\u00a3W\u0004=\u0090\u00bc~\u00d5\u0083\u0000\u00ad\u00a1\u00d8\u008f\u0016\u0018G\u00cf\u0092\u0084\u009f\u00dd\u00bc\u00cc9\u00f6\u00c67p\u0086\u009d>\u008bQ\u00d3\u009c\u00cb%O\u00c7 \u000e\u00b6P%\u00d0\u00f4\u00d5\u00a9\u00c4{\u00b2\u00c1m\u00ba\u0007&M4^\u00df_aq?\u008b*m\u001d\u00ee\u007fn\u00e1\u0010\u00f3\u0084h\u0014*\u0094\u00b7\u00de=\u00ef\u00c7\u0014\u0019\u00a2\u00d9O \u0090go\u00c4hE\u00b7tW\u00f8\u0014\u00dc\n\u00b9\rjs4y\u001e\u0012\u0099\b\u0018\\\u00f0\u008b_}^\u0083\u0084(\u0091\u00a2X\u008a\u00be\u009c\u00fcxS\u00fau\u008e\u0010\u00a6P\u00fa!\u00c0\u00f00,\u008ep\u008e<\u00a4\u00b0\u0086\u000f\u00b9\u00d7%Y\u00a3\u000b\u0083,\f\u009e\u0093\u0018\u0014\u00ae\u0081\u0092\u00cc\u0015\u00afh\u00a5N\u00f5Ys\u0010\u0080\u001a\u00e2\u00bd\u0085\u00c1\u00cd\u00ea\u0000\\\u0018,\u00c3&\u00d9\u00e7\u00d7\u0096\u00af\u00c4\u00caJ*\u0086u\u00fe\u00fb\u00cd\u000b\u009b\u00f9'\u00f9\b\u0087 \u001d\u00ff\u009c S\u00c0\u00d2\u00aac\u00bb\u00c4\u00cdL\u0091\u00ff_quC\u00a9y\u00bb\u009d>\u00e0.\u0012vG\r${8W\u00a6\u00fc\u00dfFx\u00e7\u00ef\u00d0*s\u0099#\u00d8\u00f73X\u00ae\u00e4\u00ff\u00eb\u00c3\u00ecb\u00e3\u00ae\u00b8x\u0084\u00b4%\u0085\u00ae~\u0082\u00c8\u00f5\u0013\u0097\u0015c\u00d8+\u00cc\u00ac\u00d9G\u00c9={\u00fe\u00e3\\$-\u00ff8\u00dc7;\u008e\u000f\u008c\u0006\u00a8\u00bc\u00fc\u00b4\f\u00b8\u0083\u00ba\u008a|\u0095\u00d2H\u00d4I\u00e0\u00b6\u008d>\u00efr\u00c3r\u0012\u00b8\u0007\u00b1\u00e8\u009b\u0016\u0000\u00c4\u00c3\u00f6x_\u001d\u0089;\u001b\u00dbh\u00ca\u00a6\u00d9\r\u00f3\u00a5\u00b9 \u0016\u00b1$\u009b\u00db\u009f;%_\u00eb\u00bd\u009am\u001e\u0007\u00ea\u00f3\u0016\u00a7\u0001\f\u00c3\u00f9y\u009b\u00ab\r-\u00efKg\u00de".length();
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
                    var9_3[var7_4++] = dug.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0004\u00e5\u00e6\u0003\u0080\u009c\u008c]\u00d1\u00c0\u009c\u00c5\u00b0X\u00c8\u00c40^1k\\C\u00c8d\u00acY\u0016\u008cz\u00c2J\u00a0]I3\u00f251']\u009e{\u00cb\u00c9\r;\u0011\u00c1o*0`\u00ef?\u00f1\u00ee \u00cck\u00e6\u0085\u00fb$\u00ea\u00d0)\u00ca1\u00b3(\u00e9\u0007\u0014\u001d\u00e1qHB\u00ce\u008a\u00e9\u00b9\u0086>\\\u000e\u00e0XF";
                    var8_6 = "\u0004\u00e5\u00e6\u0003\u0080\u009c\u008c]\u00d1\u00c0\u009c\u00c5\u00b0X\u00c8\u00c40^1k\\C\u00c8d\u00acY\u0016\u008cz\u00c2J\u00a0]I3\u00f251']\u009e{\u00cb\u00c9\r;\u0011\u00c1o*0`\u00ef?\u00f1\u00ee \u00cck\u00e6\u0085\u00fb$\u00ea\u00d0)\u00ca1\u00b3(\u00e9\u0007\u0014\u001d\u00e1qHB\u00ce\u008a\u00e9\u00b9\u0086>\\\u000e\u00e0XF".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = dug.b(var10_9).intern();
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
        dug.g = var9_3;
        dug.h = new String[28];
        dug.qa4 = LogManager.getLogger();
        dug.hsf = Lists.newArrayList((Object[])new ypi[]{new ypi(xbr.t1j, 0, 1, 3, 10), new ypi(u7m.gfm(ox_.wb7), 0, 1, 3, 10), new ypi(u7m.gfm(ox_.uom), 0, 1, 3, 10), new ypi(xbr.u_x, 0, 1, 1, 3), new ypi(xbr.l_0, 0, 1, 1, 5), new ypi(xbr.cp_, 0, 1, 1, 3), new ypi(xbr.xcf, 0, 1, 1, 5), new ypi(xbr.lym, 0, 2, 3, 5), new ypi(xbr.nfb, 0, 2, 3, 3), new ypi(u7m.gfm(ox_.a4y), 0, 1, 3, 10)});
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63AB;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dug", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            dug.h[n2] = dug.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dug.b(n, l);
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
            throw new RuntimeException("dug" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dug.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

