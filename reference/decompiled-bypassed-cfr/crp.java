/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityChest;
import net.optifine.CustomColors;
import net.optifine.CustomSky;
import net.optifine.DynamicLights;
import net.optifine.Lagometer;
import net.optifine.RandomEntities;
import net.optifine.SmartAnimations;
import net.optifine.model.BlockModelUtils;
import net.optifine.reflect.Reflector;
import net.optifine.render.ChunkVisibility;
import net.optifine.render.CloudRenderer;
import net.optifine.render.RenderEnv;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersRender;
import net.optifine.shaders.ShadowUtils;
import net.optifine.util.ChunkUtils;
import net.optifine.util.RenderChunkUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class crp
implements u60,
lv1 {
    private static final Logger h7c;
    private static final gdz zbm;
    private static final gdz jnk;
    private static final gdz fda;
    private static final gdz kr7;
    private static final gdz s2a;
    public final c05 j0u;
    private final lc5 nr3;
    private final hr_ h3f;
    private kh3 t6z;
    private Set l0i;
    private List eq2;
    private final Set h7f;
    private c1s o6x;
    private int jsw;
    private int ul_;
    private int cj4;
    private be7 u2p;
    private fab uu2;
    private fab o50;
    private fab i65;
    private int s0f;
    public final Map sz2;
    private final Map kgn;
    private final sla[] _qh;
    private oru h5t;
    private qn4 vrx;
    private double gxe;
    private double ex0;
    private double rv_;
    private int ivg;
    private int bg4;
    private int o3i;
    private double o6f;
    private double okd;
    private double tq1;
    private double p5b;
    private double udn;
    private final tbt isn;
    private ofj f9a;
    private int bsi;
    private int me1;
    private int z1b;
    private int yoz;
    private int ofr;
    private boolean i1y;
    private uka hyu;
    private final Vector4f[] s1u;
    private final zxu c2_;
    private boolean emi;
    public eg6 a3o;
    private double qe9;
    private double tag;
    private double hr6;
    public boolean jli;
    private CloudRenderer sae;
    public i2h qgm;
    public Set atw;
    public Set th7;
    private Deque a46;
    private List fo5;
    private List ea4;
    private List ds4;
    private List i5v;
    private List m2h;
    private List qow;
    private List dp7;
    private List f6f;
    private int ez1;
    private int qn7;
    private static final Set mgk;
    private int obc;
    private g6k ips;
    private yo9 jgu;
    private int _t5;
    private RenderEnv pop;
    public boolean sy_;
    public boolean oun;
    private boolean f4x;
    private static int pp5;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public crp(c05 c052) {
        block8: {
            block6: {
                this.l0i = Sets.newLinkedHashSet();
                this.eq2 = Lists.newArrayListWithCapacity((int)69696);
                this.h7f = Sets.newHashSet();
                this.jsw = -1;
                int n = t9d.b();
                try {
                    crp crp2;
                    block7: {
                        try {
                            try {
                                this.ul_ = -1;
                                this.cj4 = -1;
                                this.sz2 = Maps.newHashMap();
                                this.kgn = Maps.newHashMap();
                                this._qh = new sla[10];
                                this.gxe = Double.MIN_VALUE;
                                this.ex0 = Double.MIN_VALUE;
                                this.rv_ = Double.MIN_VALUE;
                                this.ivg = Integer.MIN_VALUE;
                                this.bg4 = Integer.MIN_VALUE;
                                this.o3i = Integer.MIN_VALUE;
                                this.o6f = Double.MIN_VALUE;
                                this.okd = Double.MIN_VALUE;
                                this.tq1 = Double.MIN_VALUE;
                                this.p5b = Double.MIN_VALUE;
                                this.udn = Double.MIN_VALUE;
                                this.isn = new tbt();
                                this.bsi = -1;
                                this.me1 = 2;
                                this.i1y = false;
                                this.s1u = new Vector4f[8];
                                this.c2_ = new zxu();
                                this.emi = false;
                                this.jli = true;
                                this.atw = new LinkedHashSet();
                                this.th7 = new LinkedHashSet();
                                this.a46 = new ArrayDeque();
                                this.fo5 = new ArrayList(1024);
                                this.ea4 = new ArrayList(1024);
                                this.ds4 = new ArrayList(1024);
                                this.i5v = new ArrayList(1024);
                                this.m2h = new ArrayList(1024);
                                this.qow = new ArrayList(1024);
                                this.dp7 = new ArrayList(1024);
                                this.f6f = new ArrayList(1024);
                                this.ez1 = 0;
                                this.qn7 = 0;
                                this.ips = null;
                                this.jgu = null;
                                this._t5 = 0;
                                this.pop = new RenderEnv(ox_.ibw.l4i(), new mew(0, 0, 0));
                                this.sy_ = false;
                                this.oun = false;
                                this.f4x = false;
                                this.sae = new CloudRenderer(c052);
                                this.j0u = c052;
                                this.h3f = c052.ibs();
                                this.nr3 = c052.l22();
                                this.nr3.anl(s2a);
                                GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
                                GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
                                hzu.t30(0);
                                this.f12();
                                this.emi = gis.eyg();
                                crp2 = this;
                                if (n == 0) break block6;
                                if (!crp2.emi) break block7;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            this.f9a = new m21();
                            this.a3o = new cum();
                            if (n != 0) break block8;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    this.f9a = new ko7();
                    crp2 = this;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            crp2.a3o = new b00();
        }
        this.u2p = new be7();
        this.u2p.cmt(new n0i(0, n0i$p_w.hz0, n0i$pto.rrf, 3));
        this.nlt();
        this.vho();
        this.xkn();
    }

    @Override
    public void onResourceManagerReload(y99 y992) {
        this.f12();
    }

    private void f12() {
        long l = a ^ 0x94CB9B4B3C5L;
        yu2 yu22 = this.j0u.dd_();
        int n = t9d.b();
        for (int i = 0; i < this._qh.length; ++i) {
            this._qh[i] = yu22.brw((String)((Object)crp.a("j", (int)16016, (long)(0x242626DB75FA5F8CL ^ l))) + i);
            if (n != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void otl() {
        block11: {
            block10: {
                var1_1 = crp.a ^ 92137355758479L;
                var3_2 = t9d.c();
                if (!gis.jap) ** GOTO lbl36
                try {
                    block12: {
                        if (q38.x7d() != null) break block10;
                        break block12;
                        catch (IOException v0) {
                            throw crp.a(v0);
                        }
                    }
                    q38.xhu();
                }
                catch (IOException v1) {
                    throw crp.a(v1);
                }
            }
            var4_3 = new gdz((String)crp.a("j", (int)29417, (long)(7518617282936040338L ^ var1_1)));
            try {
                this.vrx = new qn4(this.j0u.l22(), this.j0u.mpf(), this.j0u._d2(), var4_3);
                this.vrx.s_6(this.j0u.pfr, this.j0u.ry7);
                this.h5t = this.vrx.hvg((String)crp.a("j", (int)32239, (long)(2363611462415377547L ^ var1_1)));
            }
            catch (IOException var5_4) {
                crp.h7c.warn((String)crp.a("j", (int)1536, (long)(7531965147388518262L ^ var1_1)) + var4_3, (Throwable)var5_4);
                this.vrx = null;
                this.h5t = null;
            }
            catch (JsonSyntaxException var5_5) {
                crp.h7c.warn((String)crp.a("j", (int)24858, (long)(263720250254653524L ^ var1_1)) + var4_3, (Throwable)var5_5);
                this.vrx = null;
                this.h5t = null;
            }
            try {
                if (var3_2 == 0) break block11;
lbl36:
                // 2 sources

                this.vrx = null;
                this.h5t = null;
            }
            catch (IOException v2) {
                throw crp.a(v2);
            }
        }
    }

    public void vnv() {
        block5: {
            int n;
            block4: {
                int n2 = t9d.c();
                try {
                    try {
                        n = this._53();
                        if (n2 != 0) break block4;
                        if (n == 0) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    hzu.spd();
                    n = 770;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            hzu.u39(n, 771, 0, 1);
            this.h5t.mk8(this.j0u.pfr, this.j0u.ry7, false);
            hzu.ux6();
        }
    }

    public boolean _53() {
        boolean bl;
        block33: {
            block27: {
                block30: {
                    l86 l862;
                    int n;
                    block32: {
                        crp crp2;
                        block31: {
                            block29: {
                                boolean bl2;
                                block28: {
                                    block26: {
                                        n = t9d.b();
                                        try {
                                            bl2 = hxt.veb();
                                            if (n == 0) break block26;
                                            if (bl2) break block27;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                        bl2 = hxt.ly3();
                                    }
                                    try {
                                        if (n == 0) break block28;
                                        if (bl2) break block27;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    bl2 = hxt.b4a();
                                }
                                try {
                                    try {
                                        try {
                                            if (bl2) break block27;
                                            crp2 = this;
                                            if (n == 0) break block29;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                        if (crp2.h5t == null) break block30;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    crp2 = this;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            try {
                                try {
                                    if (n == 0) break block31;
                                    if (crp2.vrx == null) break block30;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                crp2 = this;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                        }
                        try {
                            try {
                                l862 = crp2.j0u.vg8;
                                if (n == 0) break block32;
                                if (l862 == null) break block30;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            l862 = this.j0u.vg8;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    bl = l862.myu();
                                    if (n == 0) break block33;
                                    if (!bl) break block30;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                bl = this.j0u.oxn.nw4.t9w();
                                if (n == 0) break block33;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            if (!bl) break block30;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        bl = true;
                        break block33;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                bl = false;
                break block33;
            }
            bl = false;
        }
        return bl;
    }

    private void xkn() {
        block20: {
            int n;
            q3g q3g2;
            jom jom2;
            block18: {
                int n2;
                block16: {
                    block17: {
                        crp crp2;
                        block14: {
                            block15: {
                                jom2 = jom.yut();
                                q3g2 = jom2.zuq();
                                n2 = t9d.c();
                                try {
                                    try {
                                        crp2 = this;
                                        if (n2 != 0) break block14;
                                        if (crp2.i65 == null) break block15;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    this.i65.v24();
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            crp2 = this;
                        }
                        try {
                            try {
                                n = crp2.cj4;
                                if (n2 != 0) break block16;
                                if (n < 0) break block17;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            nkx.vqm(this.cj4);
                            this.cj4 = -1;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n = this.emi ? 1 : 0;
                }
                try {
                    block19: {
                        try {
                            try {
                                if (n2 != 0) break block18;
                                if (n == 0) break block19;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            this.i65 = new fab(this.u2p);
                            this.pyn(q3g2, -16.0f, true);
                            q3g2.xku();
                            q3g2.wcp();
                            this.i65.err(q3g2.m24());
                            if (n2 == 0) break block20;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n = this.cj4 = nkx.ux1(1);
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            GL11.glNewList((int)n, (int)4864);
            this.pyn(q3g2, -16.0f, true);
            jom2.q7g();
            GL11.glEndList();
        }
    }

    private void vho() {
        block20: {
            int n;
            q3g q3g2;
            jom jom2;
            block18: {
                int n2;
                block16: {
                    block17: {
                        crp crp2;
                        block14: {
                            block15: {
                                jom2 = jom.yut();
                                q3g2 = jom2.zuq();
                                n2 = t9d.c();
                                try {
                                    try {
                                        crp2 = this;
                                        if (n2 != 0) break block14;
                                        if (crp2.o50 == null) break block15;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    this.o50.v24();
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            crp2 = this;
                        }
                        try {
                            try {
                                n = crp2.ul_;
                                if (n2 != 0) break block16;
                                if (n < 0) break block17;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            nkx.vqm(this.ul_);
                            this.ul_ = -1;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n = this.emi ? 1 : 0;
                }
                try {
                    block19: {
                        try {
                            try {
                                if (n2 != 0) break block18;
                                if (n == 0) break block19;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            this.o50 = new fab(this.u2p);
                            this.pyn(q3g2, 16.0f, false);
                            q3g2.xku();
                            q3g2.wcp();
                            this.o50.err(q3g2.m24());
                            if (n2 == 0) break block20;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n = this.ul_ = nkx.ux1(1);
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            GL11.glNewList((int)n, (int)4864);
            this.pyn(q3g2, 16.0f, false);
            jom2.q7g();
            GL11.glEndList();
        }
    }

    private void pyn(q3g q3g2, float f, boolean bl) {
        int n = 64;
        int n2 = t9d.b();
        int n3 = 6;
        q3g2.ezr(7, gnl.gx3);
        int n4 = (this.ez1 / 64 + 1) * 64 + 64;
        int n5 = -n4;
        int n6 = n2;
        block2: while (true) {
            int n7 = n5;
            block3: while (n7 <= n4) {
                int n8 = -n4;
                while (n8 <= n4) {
                    block6: {
                        float f2 = n5;
                        float f3 = n5 + 64;
                        try {
                            if (n6 == 0) break block6;
                            n7 = bl ? 1 : 0;
                            if (n6 == 0) continue block3;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        if (n7 != 0) {
                            f3 = n5;
                            f2 = n5 + 64;
                        }
                        q3g2.g5o(f2, f, n8).pzw();
                        q3g2.g5o(f3, f, n8).pzw();
                        q3g2.g5o(f3, f, n8 + 64).pzw();
                        q3g2.g5o(f2, f, n8 + 64).pzw();
                        n8 += 64;
                    }
                    if (n6 != 0) continue;
                }
                n5 += 64;
                if (n6 != 0) continue block2;
            }
            break;
        }
    }

    private void nlt() {
        block20: {
            int n;
            q3g q3g2;
            jom jom2;
            block18: {
                int n2;
                block16: {
                    block17: {
                        crp crp2;
                        block14: {
                            block15: {
                                jom2 = jom.yut();
                                q3g2 = jom2.zuq();
                                n2 = t9d.c();
                                try {
                                    try {
                                        crp2 = this;
                                        if (n2 != 0) break block14;
                                        if (crp2.uu2 == null) break block15;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    this.uu2.v24();
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            crp2 = this;
                        }
                        try {
                            try {
                                n = crp2.jsw;
                                if (n2 != 0) break block16;
                                if (n < 0) break block17;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            nkx.vqm(this.jsw);
                            this.jsw = -1;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n = this.emi ? 1 : 0;
                }
                try {
                    block19: {
                        try {
                            try {
                                if (n2 != 0) break block18;
                                if (n == 0) break block19;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            this.uu2 = new fab(this.u2p);
                            this.h4n(q3g2);
                            q3g2.xku();
                            q3g2.wcp();
                            this.uu2.err(q3g2.m24());
                            if (n2 == 0) break block20;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    this.jsw = nkx.ux1(1);
                    hzu.dp2();
                    n = this.jsw;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            GL11.glNewList((int)n, (int)4864);
            this.h4n(q3g2);
            jom2.q7g();
            GL11.glEndList();
            hzu.x3w();
        }
    }

    private void h4n(q3g q3g2) {
        Random random = new Random(10842L);
        q3g2.ezr(7, gnl.gx3);
        int n = 0;
        int n2 = t9d.c();
        while (n < 1500) {
            block11: {
                block12: {
                    double d;
                    double d2;
                    double d3;
                    double d4;
                    double d5;
                    double d6;
                    block13: {
                        d6 = random.nextFloat() * 2.0f - 1.0f;
                        d5 = random.nextFloat() * 2.0f - 1.0f;
                        d4 = random.nextFloat() * 2.0f - 1.0f;
                        d3 = 0.15f + random.nextFloat() * 0.1f;
                        double d7 = d6 * d6 + d5 * d5 + d4 * d4;
                        try {
                            try {
                                try {
                                    if (n2 != 0) break block11;
                                    if (!(d7 < 1.0)) break block12;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                d2 = d7;
                                d = 0.01;
                                if (n2 != 0) break block13;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            if (!(d2 > d)) break block12;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        d7 = 1.0 / Math.sqrt(d7);
                        d5 *= d7;
                        d4 *= d7;
                        d2 = d6 *= d7;
                        d = 100.0;
                    }
                    double d8 = d2 * d;
                    double d9 = d5 * 100.0;
                    double d10 = d4 * 100.0;
                    double d11 = Math.atan2(d6, d4);
                    double d12 = Math.sin(d11);
                    double d13 = Math.cos(d11);
                    double d14 = Math.atan2(Math.sqrt(d6 * d6 + d4 * d4), d5);
                    double d15 = Math.sin(d14);
                    double d16 = Math.cos(d14);
                    double d17 = random.nextDouble() * Math.PI * 2.0;
                    double d18 = Math.sin(d17);
                    double d19 = Math.cos(d17);
                    for (int i = 0; i < 4; ++i) {
                        double d20 = 0.0;
                        double d21 = (double)((i & 2) - 1) * d3;
                        double d22 = (double)((i + 1 & 2) - 1) * d3;
                        double d23 = 0.0;
                        double d24 = d21 * d19 - d22 * d18;
                        double d25 = d22 * d19 + d21 * d18;
                        double d27 = d24 * d15 + 0.0 * d16;
                        double d28 = 0.0 * d15 - d24 * d16;
                        double d29 = d28 * d12 - d25 * d13;
                        double d30 = d25 * d12 + d28 * d13;
                        try {
                            q3g2.g5o(d8 + d29, d9 + d27, d10 + d30).pzw();
                            if (n2 == 0) {
                                if (n2 == 0) continue;
                                break;
                            }
                            break block11;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
    }

    public void t_5(kh3 kh32) {
        block24: {
            block25: {
                crp crp2;
                block26: {
                    int n;
                    block22: {
                        block20: {
                            block21: {
                                block18: {
                                    crp crp3;
                                    block19: {
                                        n = t9d.c();
                                        try {
                                            try {
                                                crp3 = this;
                                                if (n != 0) break block18;
                                                if (crp3.t6z == null) break block19;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            this.t6z.ysd(this);
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                    }
                                    this.gxe = Double.MIN_VALUE;
                                    this.ex0 = Double.MIN_VALUE;
                                    this.rv_ = Double.MIN_VALUE;
                                    this.ivg = Integer.MIN_VALUE;
                                    this.bg4 = Integer.MIN_VALUE;
                                    this.o3i = Integer.MIN_VALUE;
                                    this.h3f.coo(kh32);
                                    crp3 = this;
                                }
                                try {
                                    try {
                                        crp3.t6z = kh32;
                                        if (n != 0) break block20;
                                        if (!hxt.csr()) break block21;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    DynamicLights.clear();
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            ChunkVisibility.reset();
                            this.ips = null;
                            this.jgu = null;
                            this.pop.reset(null, null);
                            Shaders.checkWorldChanged(this.t6z);
                        }
                        try {
                            block23: {
                                try {
                                    try {
                                        if (n != 0) break block22;
                                        if (kh32 == null) break block23;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    kh32.wox(this);
                                    this.f9n();
                                    if (n == 0) break block24;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            this.l0i.clear();
                            this.ixl();
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    try {
                        try {
                            crp2 = this;
                            if (n != 0) break block25;
                            if (crp2.o6x == null) break block26;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        this.o6x.dfb();
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                crp2 = this;
            }
            crp2.o6x = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void f9n() {
        block55: {
            block54: {
                block43: {
                    block44: {
                        block52: {
                            block53: {
                                block64: {
                                    block51: {
                                        block50: {
                                            block48: {
                                                block49: {
                                                    block62: {
                                                        block47: {
                                                            block60: {
                                                                block59: {
                                                                    block58: {
                                                                        block45: {
                                                                            block46: {
                                                                                block56: {
                                                                                    var1_1 = t9d.b();
                                                                                    v0 = this;
                                                                                    if (var1_1 == 0) break block43;
                                                                                    if (v0.t6z == null) break block44;
                                                                                    break block56;
                                                                                    catch (JsonSyntaxException v1) {
                                                                                        throw crp.a(v1);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block57: {
                                                                                        this.jli = true;
                                                                                        ox_.rwl.gku(hxt.hmy());
                                                                                        ox_.x_c.gku(hxt.hmy());
                                                                                        g_x.o20();
                                                                                        v2 = hxt.csr();
                                                                                        if (var1_1 == 0) break block45;
                                                                                        break block57;
                                                                                        catch (JsonSyntaxException v3) {
                                                                                            throw crp.a(v3);
                                                                                        }
                                                                                    }
                                                                                    if (!v2) break block46;
                                                                                }
                                                                                catch (JsonSyntaxException v4) {
                                                                                    throw crp.a(v4);
                                                                                }
                                                                                DynamicLights.clear();
                                                                            }
                                                                            SmartAnimations.update();
                                                                            this.bsi = this.j0u.oxn.gcj;
                                                                            this.ez1 = this.bsi * 16;
                                                                            this.qn7 = this.ez1 * this.ez1;
                                                                            v2 = this.emi;
                                                                        }
                                                                        var2_2 = v2;
                                                                        this.emi = gis.eyg();
                                                                        v5 = var2_2;
                                                                        if (var1_1 == 0) break block47;
                                                                        if (!v5) ** GOTO lbl65
                                                                        break block58;
                                                                        catch (JsonSyntaxException v6) {
                                                                            throw crp.a(v6);
                                                                        }
                                                                    }
                                                                    v5 = this.emi;
                                                                    if (var1_1 == 0) break block47;
                                                                    break block59;
                                                                    catch (JsonSyntaxException v7) {
                                                                        throw crp.a(v7);
                                                                    }
                                                                }
                                                                if (v5) ** GOTO lbl65
                                                                break block60;
                                                                catch (JsonSyntaxException v8) {
                                                                    throw crp.a(v8);
                                                                }
                                                            }
                                                            try {
                                                                block61: {
                                                                    this.f9a = new ko7();
                                                                    this.a3o = new b00();
                                                                    if (var1_1 != 0) break block48;
                                                                    break block61;
                                                                    catch (JsonSyntaxException v9) {
                                                                        throw crp.a(v9);
                                                                    }
                                                                }
                                                                v5 = var2_2;
                                                            }
                                                            catch (JsonSyntaxException v10) {
                                                                throw crp.a(v10);
                                                            }
                                                        }
                                                        if (var1_1 == 0) break block49;
                                                        if (v5) break block48;
                                                        break block62;
                                                        catch (JsonSyntaxException v11) {
                                                            throw crp.a(v11);
                                                        }
                                                    }
                                                    try {
                                                        block63: {
                                                            v12 = this;
                                                            if (var1_1 == 0) break block50;
                                                            break block63;
                                                            catch (JsonSyntaxException v13) {
                                                                throw crp.a(v13);
                                                            }
                                                        }
                                                        v5 = v12.emi;
                                                    }
                                                    catch (JsonSyntaxException v14) {
                                                        throw crp.a(v14);
                                                    }
                                                }
                                                try {
                                                    if (v5) {
                                                        this.f9a = new m21();
                                                        this.a3o = new cum();
                                                    }
                                                }
                                                catch (JsonSyntaxException v15) {
                                                    throw crp.a(v15);
                                                }
                                            }
                                            this.nlt();
                                            this.vho();
                                            this.xkn();
                                            v12 = this;
                                        }
                                        if (var1_1 == 0) break block64;
                                        try {
                                            block65: {
                                                if (v12.o6x == null) break block51;
                                                break block65;
                                                catch (JsonSyntaxException v16) {
                                                    throw crp.a(v16);
                                                }
                                            }
                                            this.o6x.dfb();
                                        }
                                        catch (JsonSyntaxException v17) {
                                            throw crp.a(v17);
                                        }
                                    }
                                    this.cm5();
                                    v12 = this;
                                }
                                var3_3 = v12.h7f;
                                synchronized (var3_3) {
                                    this.h7f.clear();
                                }
                                try {
                                    try {
                                        this.o6x = new c1s(this.t6z, this.j0u.oxn.gcj, this, this.a3o);
                                        v18 = this;
                                        if (var1_1 == 0) break block52;
                                        if (v18.t6z == null) break block53;
                                    }
                                    catch (JsonSyntaxException v19) {
                                        throw crp.a(v19);
                                    }
                                    v18 = this;
                                    if (var1_1 == 0) break block52;
                                }
                                catch (JsonSyntaxException v20) {
                                    throw crp.a(v20);
                                }
                                var3_3 = v18.j0u.nsd();
                                try {
                                    if (var3_3 != null) {
                                        this.o6x.b4a(var3_3.o2v, var3_3.vbd);
                                    }
                                }
                                catch (JsonSyntaxException v21) {
                                    throw crp.a(v21);
                                }
                            }
                            v18 = this;
                        }
                        v18.me1 = 2;
                    }
                    v0 = this;
                }
                try {
                    try {
                        if (var1_1 == 0) break block54;
                        if (v0.j0u.vg8 != null) break block55;
                    }
                    catch (JsonSyntaxException v22) {
                        throw crp.a(v22);
                    }
                    v0 = this;
                }
                catch (JsonSyntaxException v23) {
                    throw crp.a(v23);
                }
            }
            v0.f4x = true;
        }
    }

    public void cm5() {
        this.l0i.clear();
        this.isn.nq2();
    }

    public void w4e(int n, int n2) {
        block6: {
            qn4 qn42;
            block7: {
                int n3 = t9d.c();
                try {
                    try {
                        try {
                            if (!gis.jap) break block6;
                            qn42 = this.vrx;
                            if (n3 != 0) break block7;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        if (qn42 == null) break block6;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    qn42 = this.vrx;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            qn42.s_6(n, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void _q6(i2h var1_1, _aq var2_2, float var3_3) {
        block296: {
            block294: {
                block295: {
                    block274: {
                        block272: {
                            block273: {
                                block259: {
                                    block260: {
                                        block261: {
                                            block255: {
                                                block253: {
                                                    block254: {
                                                        block323: {
                                                            block251: {
                                                                block252: {
                                                                    block320: {
                                                                        block250: {
                                                                            block249: {
                                                                                block248: {
                                                                                    block246: {
                                                                                        block247: {
                                                                                            var4_4 = crp.a ^ 109297251977793L;
                                                                                            var6_5 = t9d.b();
                                                                                            var7_6 = 0;
                                                                                            try {
                                                                                                v0 = Reflector.MinecraftForgeClient_getRenderPass.exists();
                                                                                                if (var6_5 == 0) break block246;
                                                                                                if (v0 == 0) break block247;
                                                                                            }
                                                                                            catch (JsonSyntaxException v1) {
                                                                                                throw crp.a(v1);
                                                                                            }
                                                                                            var7_6 = Reflector.callInt(Reflector.MinecraftForgeClient_getRenderPass, new Object[0]);
                                                                                        }
                                                                                        v0 = this.me1;
                                                                                    }
                                                                                    try {
                                                                                        if (var6_5 == 0) break block248;
                                                                                        if (v0 <= 0) break block249;
                                                                                    }
                                                                                    catch (JsonSyntaxException v2) {
                                                                                        throw crp.a(v2);
                                                                                    }
                                                                                    v0 = var7_6;
                                                                                }
                                                                                if (v0 > 0) {
                                                                                    return;
                                                                                }
                                                                                --this.me1;
                                                                                if (var6_5 != 0) ** GOTO lbl965
                                                                            }
                                                                            var8_7 = var1_1.bc1 + (var1_1.o2v - var1_1.bc1) * (double)var3_3;
                                                                            var10_8 = var1_1.o_z + (var1_1.kfp - var1_1.o_z) * (double)var3_3;
                                                                            var12_9 = var1_1.a4d + (var1_1.vbd - var1_1.a4d) * (double)var3_3;
                                                                            this.t6z.e8t.qek((String)crp.a("j", (int)30800, (long)(2529473194406224083L ^ var4_4)));
                                                                            xv4.b2r.udj(this.t6z, this.j0u.l22(), this.j0u.tx1, this.j0u.nsd(), var3_3);
                                                                            v3 = this;
                                                                            if (var6_5 == 0) break block320;
                                                                            try {
                                                                                block321: {
                                                                                    v3.h3f.gvh(this.t6z, this.j0u.tx1, this.j0u.nsd(), this.j0u.p3_, this.j0u.oxn, var3_3);
                                                                                    ++crp.pp5;
                                                                                    if (var7_6 != 0) break block250;
                                                                                    break block321;
                                                                                    catch (JsonSyntaxException v4) {
                                                                                        throw crp.a(v4);
                                                                                    }
                                                                                }
                                                                                this.z1b = 0;
                                                                                this.yoz = 0;
                                                                                this.ofr = 0;
                                                                                this.obc = 0;
                                                                            }
                                                                            catch (JsonSyntaxException v5) {
                                                                                throw crp.a(v5);
                                                                            }
                                                                        }
                                                                        v3 = this;
                                                                    }
                                                                    var14_10 = v3.j0u.nsd();
                                                                    var15_11 = var14_10.ivp + (var14_10.o2v - var14_10.ivp) * (double)var3_3;
                                                                    var17_12 = var14_10.c54 + (var14_10.kfp - var14_10.c54) * (double)var3_3;
                                                                    var19_13 = var14_10.e2b + (var14_10.vbd - var14_10.e2b) * (double)var3_3;
                                                                    xv4.pia = var15_11;
                                                                    xv4.i9n = var17_12;
                                                                    xv4.ltj = var19_13;
                                                                    this.h3f.ojk(var15_11, var17_12, var19_13);
                                                                    this.j0u.x0p.u_c();
                                                                    this.t6z.e8t.v2l((String)crp.a("j", (int)5280, (long)(6656305559610805276L ^ var4_4)));
                                                                    var21_14 = this.t6z.xa0();
                                                                    v6 = var7_6;
                                                                    if (var6_5 == 0) break block251;
                                                                    try {
                                                                        block322: {
                                                                            if (v6 != 0) break block252;
                                                                            break block322;
                                                                            catch (JsonSyntaxException v7) {
                                                                                throw crp.a(v7);
                                                                            }
                                                                        }
                                                                        this.z1b = var21_14.size();
                                                                    }
                                                                    catch (JsonSyntaxException v8) {
                                                                        throw crp.a(v8);
                                                                    }
                                                                }
                                                                v6 = (int)hxt.o2a();
                                                            }
                                                            if (var6_5 == 0) break block253;
                                                            if (v6 == 0) break block254;
                                                            break block323;
                                                            catch (JsonSyntaxException v9) {
                                                                throw crp.a(v9);
                                                            }
                                                        }
                                                        try {
                                                            block324: {
                                                                v6 = (int)this.j0u.x0p.ndn;
                                                                if (var6_5 == 0) break block253;
                                                                break block324;
                                                                catch (JsonSyntaxException v10) {
                                                                    throw crp.a(v10);
                                                                }
                                                            }
                                                            if (v6 == 0) break block254;
                                                        }
                                                        catch (JsonSyntaxException v11) {
                                                            throw crp.a(v11);
                                                        }
                                                        hzu.gcp();
                                                    }
                                                    v6 = (int)Reflector.ForgeEntity_shouldRenderInPass.exists();
                                                }
                                                var22_15 = v6;
                                                var23_16 = Reflector.ForgeTileEntity_shouldRenderInPass.exists();
                                                var24_17 = 0;
                                                while (var24_17 < this.t6z.u80.size()) {
                                                    block258: {
                                                        block257: {
                                                            block256: {
                                                                block328: {
                                                                    block327: {
                                                                        block326: {
                                                                            block325: {
                                                                                var25_18 = (i2h)this.t6z.u80.get(var24_17);
                                                                                v12 = var22_15;
                                                                                if (var6_5 == 0) break block255;
                                                                                if (var6_5 == 0) break block256;
                                                                                break block325;
                                                                                catch (JsonSyntaxException v13) {
                                                                                    throw crp.a(v13);
                                                                                }
                                                                            }
                                                                            if (v12 == 0) ** GOTO lbl138
                                                                            break block326;
                                                                            catch (JsonSyntaxException v14) {
                                                                                throw crp.a(v14);
                                                                            }
                                                                        }
                                                                        v15 = Reflector.callBoolean(var25_18, Reflector.ForgeEntity_shouldRenderInPass, new Object[]{var7_6});
                                                                        if (var6_5 == 0) break block256;
                                                                        break block327;
                                                                        catch (JsonSyntaxException v16) {
                                                                            throw crp.a(v16);
                                                                        }
                                                                    }
                                                                    if (!v15) break block257;
                                                                    break block328;
                                                                    catch (JsonSyntaxException v17) {
                                                                        throw crp.a(v17);
                                                                    }
                                                                }
                                                                try {
                                                                    block329: {
                                                                        ++this.yoz;
                                                                        if (var6_5 == 0) break block258;
                                                                        break block329;
                                                                        catch (JsonSyntaxException v18) {
                                                                            throw crp.a(v18);
                                                                        }
                                                                    }
                                                                    v15 = var25_18.e4f(var8_7, var10_8, var12_9);
                                                                }
                                                                catch (JsonSyntaxException v19) {
                                                                    throw crp.a(v19);
                                                                }
                                                            }
                                                            try {
                                                                if (v15) {
                                                                    this.h3f.dxc(var25_18, var3_3);
                                                                }
                                                            }
                                                            catch (JsonSyntaxException v20) {
                                                                throw crp.a(v20);
                                                            }
                                                        }
                                                        ++var24_17;
                                                    }
                                                    if (var6_5 != 0) continue;
                                                }
                                                v12 = this._53();
                                            }
                                            try {
                                                if (var6_5 == 0) break block259;
                                                if (v12 == 0) break block260;
                                            }
                                            catch (JsonSyntaxException v21) {
                                                throw crp.a(v21);
                                            }
                                            hzu.d14(519);
                                            hzu.gcp();
                                            this.h5t.xix();
                                            this.h5t.mou(false);
                                            this.t6z.e8t.v2l((String)crp.a("j", (int)4763, (long)(4395903895571581480L ^ var4_4)));
                                            qpm.cng();
                                            this.h3f.n8u(true);
                                            for (var24_17 = 0; var24_17 < var21_14.size(); ++var24_17) {
                                                block270: {
                                                    block271: {
                                                        block339: {
                                                            block338: {
                                                                block269: {
                                                                    block266: {
                                                                        block267: {
                                                                            block268: {
                                                                                block336: {
                                                                                    block335: {
                                                                                        block334: {
                                                                                            block333: {
                                                                                                block265: {
                                                                                                    block264: {
                                                                                                        block263: {
                                                                                                            block262: {
                                                                                                                block330: {
                                                                                                                    var25_18 = (i2h)var21_14.get(var24_17);
                                                                                                                    v22 = this.j0u.nsd() instanceof g_3;
                                                                                                                    if (var6_5 == 0) break block261;
                                                                                                                    if (var6_5 == 0) break block262;
                                                                                                                    break block330;
                                                                                                                    catch (JsonSyntaxException v23) {
                                                                                                                        throw crp.a(v23);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    block331: {
                                                                                                                        if (v22 == 0) break block263;
                                                                                                                        break block331;
                                                                                                                        catch (JsonSyntaxException v24) {
                                                                                                                            throw crp.a(v24);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v25 = ((g_3)this.j0u.nsd()).ofg();
                                                                                                                }
                                                                                                                catch (JsonSyntaxException v26) {
                                                                                                                    throw crp.a(v26);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var6_5 == 0) break block264;
                                                                                                                if (v25 == 0) break block263;
                                                                                                            }
                                                                                                            catch (JsonSyntaxException v27) {
                                                                                                                throw crp.a(v27);
                                                                                                            }
                                                                                                            v25 = 1;
                                                                                                            break block264;
                                                                                                        }
                                                                                                        v25 = 0;
                                                                                                    }
                                                                                                    var26_20 = v25;
                                                                                                    v28 = var25_18.e4f(var8_7, var10_8, var12_9);
                                                                                                    if (var6_5 == 0) break block265;
                                                                                                    try {
                                                                                                        block332: {
                                                                                                            if (v28 == 0) break block266;
                                                                                                            break block332;
                                                                                                            catch (JsonSyntaxException v29) {
                                                                                                                throw crp.a(v29);
                                                                                                            }
                                                                                                        }
                                                                                                        v28 = var25_18.k50;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException v30) {
                                                                                                        throw crp.a(v30);
                                                                                                    }
                                                                                                }
                                                                                                if (var6_5 == 0) break block267;
                                                                                                if (v28 != 0) ** GOTO lbl259
                                                                                                break block333;
                                                                                                catch (JsonSyntaxException v31) {
                                                                                                    throw crp.a(v31);
                                                                                                }
                                                                                            }
                                                                                            v28 = var2_2.n2v(var25_18.aaw());
                                                                                            if (var6_5 == 0) break block267;
                                                                                            break block334;
                                                                                            catch (JsonSyntaxException v32) {
                                                                                                throw crp.a(v32);
                                                                                            }
                                                                                        }
                                                                                        if (v28 != 0) ** GOTO lbl259
                                                                                        break block335;
                                                                                        catch (JsonSyntaxException v33) {
                                                                                            throw crp.a(v33);
                                                                                        }
                                                                                    }
                                                                                    v34 = var25_18.wgv;
                                                                                    if (var6_5 == 0) break block268;
                                                                                    break block336;
                                                                                    catch (JsonSyntaxException v35) {
                                                                                        throw crp.a(v35);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block337: {
                                                                                        if (v34 != this.j0u.vg8) break block266;
                                                                                        break block337;
                                                                                        catch (JsonSyntaxException v36) {
                                                                                            throw crp.a(v36);
                                                                                        }
                                                                                    }
                                                                                    v34 = var25_18;
                                                                                }
                                                                                catch (JsonSyntaxException v37) {
                                                                                    throw crp.a(v37);
                                                                                }
                                                                            }
                                                                            v28 = v34 instanceof ha9;
                                                                        }
                                                                        try {
                                                                            if (var6_5 == 0) break block269;
                                                                            if (v28 == 0) break block266;
                                                                        }
                                                                        catch (JsonSyntaxException v38) {
                                                                            throw crp.a(v38);
                                                                        }
                                                                        v28 = 1;
                                                                        break block269;
                                                                    }
                                                                    v28 = 0;
                                                                }
                                                                var27_22 = v28;
                                                                if (var25_18 != this.j0u.nsd()) break block271;
                                                                v39 = this.j0u.oxn.i_y;
                                                                if (var6_5 == 0) break block270;
                                                                break block338;
                                                                catch (JsonSyntaxException v40) {
                                                                    throw crp.a(v40);
                                                                }
                                                            }
                                                            if (v39 != 0) break block271;
                                                            break block339;
                                                            catch (JsonSyntaxException v41) {
                                                                throw crp.a(v41);
                                                            }
                                                        }
                                                        try {
                                                            block340: {
                                                                v39 = var26_20;
                                                                if (var6_5 == 0) break block270;
                                                                break block340;
                                                                catch (JsonSyntaxException v42) {
                                                                    throw crp.a(v42);
                                                                }
                                                            }
                                                            if (v39 == 0) continue;
                                                        }
                                                        catch (JsonSyntaxException v43) {
                                                            throw crp.a(v43);
                                                        }
                                                    }
                                                    v39 = var27_22;
                                                }
                                                if (var6_5 == 0) continue;
                                                try {
                                                    block341: {
                                                        if (v39 == 0) continue;
                                                        break block341;
                                                        catch (JsonSyntaxException v44) {
                                                            throw crp.a(v44);
                                                        }
                                                    }
                                                    v39 = (int)this.h3f.dxc(var25_18, var3_3);
                                                    continue;
                                                }
                                                catch (JsonSyntaxException v45) {
                                                    throw crp.a(v45);
                                                }
                                            }
                                            this.h3f.n8u(false);
                                            qpm.ne_();
                                            hzu.jun(false);
                                            this.vrx.hii(var3_3);
                                            hzu.s7q();
                                            hzu.jun(true);
                                            this.j0u._d2().mou(false);
                                            hzu.xmh();
                                            hzu.spd();
                                            hzu.avm();
                                            v22 = 515;
                                        }
                                        hzu.d14(v22);
                                        hzu.m45();
                                        hzu.if9();
                                    }
                                    this.t6z.e8t.v2l((String)crp.a("j", (int)26728, (long)(6163349108156805356L ^ var4_4)));
                                    v12 = var24_17 = (int)hxt.ly3();
                                }
                                try {
                                    if (var6_5 == 0) break block272;
                                    if (v12 == 0) break block273;
                                }
                                catch (JsonSyntaxException v46) {
                                    throw crp.a(v46);
                                }
                                Shaders.beginEntities();
                            }
                            wo8.adh();
                            v12 = (int)this.j0u.oxn.i37;
                        }
                        var25_19 = v12;
                        this.j0u.oxn.i37 = hxt.d34();
                        block225: for (E var27_23 : this.fo5) {
                            block342: {
                                var28_25 = ((crp$j3h)var27_23).xvr.v5v();
                                var29_26 = var28_25.qfq()[((crp$j3h)var27_23).xvr.a7g().getY() / 16];
                                v47 = var29_26;
                                if (var6_5 == 0) break block342;
                                try {
                                    block343: {
                                        v48 = (int)v47.isEmpty();
                                        if (var6_5 == 0) break block274;
                                        break block343;
                                        catch (JsonSyntaxException v49) {
                                            throw crp.a(v49);
                                        }
                                    }
                                    if (v48 == 0) {
                                    }
                                    ** GOTO lbl615
                                }
                                catch (JsonSyntaxException v50) {
                                    throw crp.a(v50);
                                }
                                v47 = var29_26;
                            }
                            for (Object var31_28 : v47) {
                                block290: {
                                    block293: {
                                        block292: {
                                            block363: {
                                                block362: {
                                                    block361: {
                                                        block291: {
                                                            block289: {
                                                                block281: {
                                                                    block287: {
                                                                        block288: {
                                                                            block286: {
                                                                                block357: {
                                                                                    block356: {
                                                                                        block355: {
                                                                                            block354: {
                                                                                                block284: {
                                                                                                    block349: {
                                                                                                        block285: {
                                                                                                            block352: {
                                                                                                                block351: {
                                                                                                                    block350: {
                                                                                                                        block282: {
                                                                                                                            block283: {
                                                                                                                                block279: {
                                                                                                                                    block280: {
                                                                                                                                        block277: {
                                                                                                                                            block278: {
                                                                                                                                                block346: {
                                                                                                                                                    block275: {
                                                                                                                                                        block276: {
                                                                                                                                                            block344: {
                                                                                                                                                                v51 = var22_15;
                                                                                                                                                                if (var6_5 == 0) break block275;
                                                                                                                                                                if (v51 == 0) break block276;
                                                                                                                                                                break block344;
                                                                                                                                                                catch (JsonSyntaxException v52) {
                                                                                                                                                                    throw crp.a(v52);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                block345: {
                                                                                                                                                                    v51 = (int)Reflector.callBoolean(var31_28, Reflector.ForgeEntity_shouldRenderInPass, new Object[]{var7_6});
                                                                                                                                                                    if (var6_5 == 0) break block275;
                                                                                                                                                                    break block345;
                                                                                                                                                                    catch (JsonSyntaxException v53) {
                                                                                                                                                                        throw crp.a(v53);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                if (v51 == 0) continue;
                                                                                                                                                            }
                                                                                                                                                            catch (JsonSyntaxException v54) {
                                                                                                                                                                throw crp.a(v54);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v51 = (int)this.h3f.pgp((i2h)var31_28, var2_2, var8_7, var10_8, var12_9);
                                                                                                                                                    }
                                                                                                                                                    if (var6_5 == 0) break block277;
                                                                                                                                                    if (v51 != 0) ** GOTO lbl410
                                                                                                                                                    break block346;
                                                                                                                                                    catch (JsonSyntaxException v55) {
                                                                                                                                                        throw crp.a(v55);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    block347: {
                                                                                                                                                        if (var31_28.wgv != this.j0u.vg8) break block278;
                                                                                                                                                        break block347;
                                                                                                                                                        catch (JsonSyntaxException v56) {
                                                                                                                                                            throw crp.a(v56);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v51 = 1;
                                                                                                                                                    break block277;
                                                                                                                                                }
                                                                                                                                                catch (JsonSyntaxException v57) {
                                                                                                                                                    throw crp.a(v57);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v51 = 0;
                                                                                                                                        }
                                                                                                                                        var32_30 = v51;
                                                                                                                                        try {
                                                                                                                                            v58 = var32_30;
                                                                                                                                            if (var6_5 == 0) break block279;
                                                                                                                                            if (v58 != 0) break block280;
                                                                                                                                            break block281;
                                                                                                                                        }
                                                                                                                                        catch (JsonSyntaxException v59) {
                                                                                                                                            throw crp.a(v59);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v58 = this.j0u.nsd() instanceof g_3;
                                                                                                                                }
                                                                                                                                if (var6_5 == 0) break block282;
                                                                                                                                try {
                                                                                                                                    block348: {
                                                                                                                                        if (v58 == 0) break block283;
                                                                                                                                        break block348;
                                                                                                                                        catch (JsonSyntaxException v60) {
                                                                                                                                            throw crp.a(v60);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v58 = (int)((g_3)this.j0u.nsd()).ofg();
                                                                                                                                    break block282;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException v61) {
                                                                                                                                    throw crp.a(v61);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v58 = 0;
                                                                                                                        }
                                                                                                                        var33_33 = v58;
                                                                                                                        v62 = var31_28;
                                                                                                                        if (var6_5 == 0) break block349;
                                                                                                                        if (v62 != this.j0u.nsd()) break block285;
                                                                                                                        break block350;
                                                                                                                        catch (JsonSyntaxException v63) {
                                                                                                                            throw crp.a(v63);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v64 = this.j0u.oxn.i_y;
                                                                                                                    if (var6_5 == 0) break block284;
                                                                                                                    break block351;
                                                                                                                    catch (JsonSyntaxException v65) {
                                                                                                                        throw crp.a(v65);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (v64 != false) break block285;
                                                                                                                break block352;
                                                                                                                catch (JsonSyntaxException v66) {
                                                                                                                    throw crp.a(v66);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                block353: {
                                                                                                                    v64 = var33_33;
                                                                                                                    if (var6_5 == 0) break block284;
                                                                                                                    break block353;
                                                                                                                    catch (JsonSyntaxException v67) {
                                                                                                                        throw crp.a(v67);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (v64 != false) {
                                                                                                                }
                                                                                                                ** GOTO lbl544
                                                                                                            }
                                                                                                            catch (JsonSyntaxException v68) {
                                                                                                                throw crp.a(v68);
                                                                                                            }
                                                                                                        }
                                                                                                        v62 = var31_28;
                                                                                                    }
                                                                                                    v64 = (cfr_temp_0 = v62.kfp - 0.0) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                                }
                                                                                                if (var6_5 == 0) break block286;
                                                                                                if (v64 < 0) ** GOTO lbl518
                                                                                                break block354;
                                                                                                catch (JsonSyntaxException v69) {
                                                                                                    throw crp.a(v69);
                                                                                                }
                                                                                            }
                                                                                            cfr_temp_1 = var31_28.kfp - 256.0;
                                                                                            v64 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                            if (var6_5 == 0) break block286;
                                                                                            break block355;
                                                                                            catch (JsonSyntaxException v70) {
                                                                                                throw crp.a(v70);
                                                                                            }
                                                                                        }
                                                                                        if (v64 >= 0) ** GOTO lbl518
                                                                                        break block356;
                                                                                        catch (JsonSyntaxException v71) {
                                                                                            throw crp.a(v71);
                                                                                        }
                                                                                    }
                                                                                    v64 = (double)this.t6z.xjm(new mew((i2h)var31_28));
                                                                                    if (var6_5 == 0) break block286;
                                                                                    break block357;
                                                                                    catch (JsonSyntaxException v72) {
                                                                                        throw crp.a(v72);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block358: {
                                                                                        if (v64 == false) ** GOTO lbl544
                                                                                        break block358;
                                                                                        catch (JsonSyntaxException v73) {
                                                                                            throw crp.a(v73);
                                                                                        }
                                                                                    }
                                                                                    ++this.yoz;
                                                                                    this.qgm = var31_28;
                                                                                    v64 = var24_17;
                                                                                }
                                                                                catch (JsonSyntaxException v74) {
                                                                                    throw crp.a(v74);
                                                                                }
                                                                            }
                                                                            if (var6_5 == 0) break block287;
                                                                            try {
                                                                                block359: {
                                                                                    if (v64 == false) break block288;
                                                                                    break block359;
                                                                                    catch (JsonSyntaxException v75) {
                                                                                        throw crp.a(v75);
                                                                                    }
                                                                                }
                                                                                Shaders.nextEntity((i2h)var31_28);
                                                                            }
                                                                            catch (JsonSyntaxException v76) {
                                                                                throw crp.a(v76);
                                                                            }
                                                                        }
                                                                        v64 = (double)this.h3f.dxc((i2h)var31_28, var3_3);
                                                                    }
                                                                    try {
                                                                        this.qgm = null;
                                                                        if (var6_5 != 0) break block281;
lbl544:
                                                                        // 3 sources

                                                                        if (var6_5 != 0) continue;
                                                                    }
                                                                    catch (JsonSyntaxException v77) {
                                                                        throw crp.a(v77);
                                                                    }
                                                                }
                                                                v78 = var32_30;
                                                                if (var6_5 == 0) break block289;
                                                                try {
                                                                    block360: {
                                                                        if (v78 != 0) break block290;
                                                                        break block360;
                                                                        catch (JsonSyntaxException v79) {
                                                                            throw crp.a(v79);
                                                                        }
                                                                    }
                                                                    v78 = var31_28 instanceof k7p;
                                                                }
                                                                catch (JsonSyntaxException v80) {
                                                                    throw crp.a(v80);
                                                                }
                                                            }
                                                            try {
                                                                if (var6_5 == 0) break block291;
                                                                if (v78 == 0) break block290;
                                                            }
                                                            catch (JsonSyntaxException v81) {
                                                                throw crp.a(v81);
                                                            }
                                                            v78 = var22_15;
                                                        }
                                                        if (var6_5 == 0) break block292;
                                                        if (v78 == 0) ** GOTO lbl591
                                                        break block361;
                                                        catch (JsonSyntaxException v82) {
                                                            throw crp.a(v82);
                                                        }
                                                    }
                                                    v78 = (int)Reflector.callBoolean(var31_28, Reflector.ForgeEntity_shouldRenderInPass, new Object[]{var7_6});
                                                    if (var6_5 == 0) break block292;
                                                    break block362;
                                                    catch (JsonSyntaxException v83) {
                                                        throw crp.a(v83);
                                                    }
                                                }
                                                if (v78 == 0) break block290;
                                                break block363;
                                                catch (JsonSyntaxException v84) {
                                                    throw crp.a(v84);
                                                }
                                            }
                                            try {
                                                block364: {
                                                    this.qgm = var31_28;
                                                    if (var6_5 == 0) break block293;
                                                    break block364;
                                                    catch (JsonSyntaxException v85) {
                                                        throw crp.a(v85);
                                                    }
                                                }
                                                v78 = var24_17;
                                            }
                                            catch (JsonSyntaxException v86) {
                                                throw crp.a(v86);
                                            }
                                        }
                                        try {
                                            if (v78 != 0) {
                                                Shaders.nextEntity((i2h)var31_28);
                                            }
                                        }
                                        catch (JsonSyntaxException v87) {
                                            throw crp.a(v87);
                                        }
                                        this.j0u.ibs().xm5((i2h)var31_28, var3_3);
                                    }
                                    this.qgm = null;
                                }
                                if (var6_5 != 0) continue;
lbl615:
                                // 2 sources

                                if (var6_5 != 0) continue block225;
                            }
                        }
                        this.j0u.oxn.i37 = var25_19;
                        v48 = var24_17;
                    }
                    if (var6_5 == 0) break block294;
                    try {
                        block365: {
                            if (v48 == 0) break block295;
                            break block365;
                            catch (JsonSyntaxException v88) {
                                throw crp.a(v88);
                            }
                        }
                        Shaders.endEntities();
                        Shaders.beginBlockEntities();
                    }
                    catch (JsonSyntaxException v89) {
                        throw crp.a(v89);
                    }
                }
                try {
                    this.t6z.e8t.v2l((String)crp.a("j", (int)16438, (long)(2418106374102456505L ^ var4_4)));
                    qpm.ne_();
                    if (var6_5 == 0) break block296;
                    v48 = (int)Reflector.ForgeTileEntity_hasFastRenderer.exists();
                }
                catch (JsonSyntaxException v90) {
                    throw crp.a(v90);
                }
            }
            try {
                if (v48 != 0) {
                    xv4.b2r.nfb();
                }
            }
            catch (JsonSyntaxException v91) {
                throw crp.a(v91);
            }
            ca8._2n();
        }
        var26_21 = this.ea4.iterator();
        block227: while (var26_21.hasNext()) {
            block366: {
                var27_24 = var26_21.next();
                var28_25 = (crp$j3h)var27_24;
                var29_26 = var28_25.xvr.fw8().pf7();
                v92 = var29_26;
                if (var6_5 == 0) break block366;
                try {
                    block367: {
                        v93 = v92.isEmpty();
                        if (var6_5 == 0) ** GOTO lbl782
                        break block367;
                        catch (JsonSyntaxException v94) {
                            throw crp.a(v94);
                        }
                    }
                    if (!v93) {
                    }
                    ** GOTO lbl722
                }
                catch (JsonSyntaxException v95) {
                    throw crp.a(v95);
                }
                v92 = var29_26;
            }
            for (Object var31_28 : v92) {
                block299: {
                    block301: {
                        block300: {
                            block297: {
                                block298: {
                                    try {
                                        v96 = var23_16;
                                        if (var6_5 == 0) break block297;
                                        if (v96 != 0) break block298;
                                        break block299;
                                    }
                                    catch (JsonSyntaxException v97) {
                                        throw crp.a(v97);
                                    }
                                }
                                try {
                                    v98 = var31_28;
                                    v99 = Reflector.ForgeTileEntity_shouldRenderInPass;
                                    v100 = new Object[1];
                                    v101 = v100;
                                    v100[0] = var7_6;
                                    if (var6_5 == 0) break block300;
                                    v96 = Reflector.callBoolean(v98, v99, v101);
                                }
                                catch (JsonSyntaxException v102) {
                                    throw crp.a(v102);
                                }
                            }
                            if (v96 == 0) continue;
                            v98 = var31_28;
                            v99 = Reflector.ForgeTileEntity_getRenderBoundingBox;
                            v101 = new Object[]{};
                        }
                        var32_31 = (nh4)Reflector.call(v98, v99, v101);
                        if (var32_31 == null) break block299;
                        try {
                            if (!var2_2.n2v(var32_31)) break block301;
                            break block299;
                            catch (JsonSyntaxException v103) {
                                throw crp.a(v103);
                            }
                        }
                        catch (JsonSyntaxException v104) {
                            throw crp.a(v104);
                        }
                    }
                    if (var6_5 != 0) continue;
                }
                try {
                    if (var24_17 != 0) {
                        Shaders.nextBlockEntity((pyk)var31_28);
                    }
                }
                catch (JsonSyntaxException v105) {
                    throw crp.a(v105);
                }
                xv4.b2r.c4z((pyk)var31_28, var3_3, -1);
                ++this.obc;
                if (var6_5 != 0) continue;
lbl722:
                // 2 sources

                if (var6_5 != 0) continue block227;
            }
        }
        var26_21 = this.h7f;
        synchronized (var26_21) {
            for (Object var28_25 : this.h7f) {
                block304: {
                    block303: {
                        block369: {
                            block370: {
                                block368: {
                                    v106 = var23_16;
                                    if (var6_5 == 0) ** break block302
                                    if (var6_5 == 0) break block303;
                                    break block368;
                                    catch (JsonSyntaxException v107) {
                                        throw crp.a(v107);
                                    }
                                }
                                if (v106 == 0) break block369;
                                break block370;
                                catch (JsonSyntaxException v108) {
                                    throw crp.a(v108);
                                }
                            }
                            try {
                                block371: {
                                    v109 = (int)Reflector.callBoolean(var28_25, Reflector.ForgeTileEntity_shouldRenderInPass, new Object[]{var7_6});
                                    if (var6_5 == 0) break block303;
                                    break block371;
                                    catch (JsonSyntaxException v110) {
                                        throw crp.a(v110);
                                    }
                                }
                                if (v109 == 0) break block304;
                            }
                            catch (JsonSyntaxException v111) {
                                throw crp.a(v111);
                            }
                        }
                        v109 = var24_17;
                    }
                    try {
                        if (v109 != 0) {
                            Shaders.nextBlockEntity((pyk)var28_25);
                        }
                    }
                    catch (JsonSyntaxException v112) {
                        throw crp.a(v112);
                    }
                    xv4.b2r.c4z((pyk)var28_25, var3_3, -1);
                }
                if (var6_5 != 0) continue;
            }
        }
        v106 = Reflector.ForgeTileEntity_hasFastRenderer.exists();
        {
            block318: {
                block319: {
                    block306: {
                        try {
                            if (v106 != 0) {
                                xv4.b2r._im(var7_6);
                            }
                        }
                        catch (JsonSyntaxException v113) {
                            throw crp.a(v113);
                        }
                        this.sy_ = true;
                        this.g2q();
                        var26_21 = this.sz2.values().iterator();
                        do {
                            block317: {
                                block313: {
                                    block312: {
                                        block315: {
                                            block314: {
                                                block316: {
                                                    block311: {
                                                        block310: {
                                                            block307: {
                                                                block309: {
                                                                    block308: {
                                                                        block305: {
                                                                            v93 = var26_21.hasNext();
lbl782:
                                                                            // 2 sources

                                                                            if (!v93) break;
                                                                            var27_24 = (ax_)var26_21.next();
                                                                            var28_25 = var27_24.q6p();
                                                                            var29_26 = this.t6z.getTileEntity((mew)var28_25);
                                                                            try {
                                                                                try {
                                                                                    v114 = var29_26;
                                                                                    if (var6_5 == 0) break block305;
                                                                                    v115 = v114 instanceof TileEntityChest;
                                                                                    if (var6_5 == 0) break block306;
                                                                                }
                                                                                catch (JsonSyntaxException v116) {
                                                                                    throw crp.a(v116);
                                                                                }
                                                                                if (v115 == 0) break block307;
                                                                            }
                                                                            catch (JsonSyntaxException v117) {
                                                                                throw crp.a(v117);
                                                                            }
                                                                            v114 = var29_26;
                                                                        }
                                                                        var30_27 = (TileEntityChest)v114;
                                                                        try {
                                                                            v118 /* !! */  = var30_27.af8;
                                                                            if (var6_5 == 0) break block308;
                                                                            if (v118 /* !! */  != null) {
                                                                            }
                                                                            ** GOTO lbl814
                                                                        }
                                                                        catch (JsonSyntaxException v119) {
                                                                            throw crp.a(v119);
                                                                        }
                                                                        var28_25 = var28_25.offset(vt2.te4);
                                                                        var29_26 = this.t6z.getTileEntity((mew)var28_25);
                                                                        try {
                                                                            if (var6_5 != 0) break block307;
lbl814:
                                                                            // 2 sources

                                                                            v118 /* !! */  = var30_27.sgw;
                                                                        }
                                                                        catch (JsonSyntaxException v120) {
                                                                            throw crp.a(v120);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (var6_5 == 0) break block309;
                                                                        if (v118 /* !! */  == null) break block307;
                                                                    }
                                                                    catch (JsonSyntaxException v121) {
                                                                        throw crp.a(v121);
                                                                    }
                                                                    var28_25 = var28_25.offset(vt2.z9q);
                                                                    v118 /* !! */  = this.t6z.getTileEntity((mew)var28_25);
                                                                }
                                                                var29_26 = v118 /* !! */ ;
                                                            }
                                                            var30_27 = this.t6z.getBlockState((mew)var28_25).r_y();
                                                            try {
                                                                v122 = var23_16;
                                                                if (var6_5 == 0) break block310;
                                                                if (v122 != 0) {
                                                                }
                                                                ** GOTO lbl882
                                                            }
                                                            catch (JsonSyntaxException v123) {
                                                                throw crp.a(v123);
                                                            }
                                                            v122 = 0;
                                                        }
                                                        var31_29 = v122;
                                                        try {
                                                            v124 = var29_26;
                                                            if (var6_5 == 0) break block311;
                                                            if (v124 == null) break block312;
                                                        }
                                                        catch (JsonSyntaxException v125) {
                                                            throw crp.a(v125);
                                                        }
                                                        v124 = var29_26;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                v126 = (int)Reflector.callBoolean(v124, Reflector.ForgeTileEntity_shouldRenderInPass, new Object[]{var7_6});
                                                                if (var6_5 == 0) break block313;
                                                                if (v126 == 0) break block312;
                                                            }
                                                            catch (JsonSyntaxException v127) {
                                                                throw crp.a(v127);
                                                            }
                                                            v126 = (int)Reflector.callBoolean(var29_26, Reflector.ForgeTileEntity_canRenderBreaking, new Object[0]);
                                                            if (var6_5 == 0) break block313;
                                                        }
                                                        catch (JsonSyntaxException v128) {
                                                            throw crp.a(v128);
                                                        }
                                                        if (v126 == 0) break block312;
                                                    }
                                                    catch (JsonSyntaxException v129) {
                                                        throw crp.a(v129);
                                                    }
                                                    var32_32 = (nh4)Reflector.call(var29_26, Reflector.ForgeTileEntity_getRenderBoundingBox, new Object[0]);
                                                    if (var32_32 != null) {
                                                        var31_29 = (int)var2_2.n2v(var32_32);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var6_5 != 0) break block312;
lbl882:
                                                                                        // 2 sources

                                                                                        if (var29_26 == null) break block314;
                                                                                    }
                                                                                    catch (JsonSyntaxException v130) {
                                                                                        throw crp.a(v130);
                                                                                    }
                                                                                    v131 = var30_27 instanceof hrd;
                                                                                    if (var6_5 == 0) break block315;
                                                                                }
                                                                                catch (JsonSyntaxException v132) {
                                                                                    throw crp.a(v132);
                                                                                }
                                                                                if (v131 != 0) break block316;
                                                                            }
                                                                            catch (JsonSyntaxException v133) {
                                                                                throw crp.a(v133);
                                                                            }
                                                                            v131 = var30_27 instanceof u5i;
                                                                            if (var6_5 == 0) break block315;
                                                                        }
                                                                        catch (JsonSyntaxException v134) {
                                                                            throw crp.a(v134);
                                                                        }
                                                                        if (v131 != 0) break block316;
                                                                    }
                                                                    catch (JsonSyntaxException v135) {
                                                                        throw crp.a(v135);
                                                                    }
                                                                    v131 = var30_27 instanceof m54;
                                                                    if (var6_5 == 0) break block315;
                                                                }
                                                                catch (JsonSyntaxException v136) {
                                                                    throw crp.a(v136);
                                                                }
                                                                if (v131 != 0) break block316;
                                                            }
                                                            catch (JsonSyntaxException v137) {
                                                                throw crp.a(v137);
                                                            }
                                                            v131 = var30_27 instanceof pld;
                                                            if (var6_5 == 0) break block315;
                                                        }
                                                        catch (JsonSyntaxException v138) {
                                                            throw crp.a(v138);
                                                        }
                                                        if (v131 == 0) break block314;
                                                    }
                                                    catch (JsonSyntaxException v139) {
                                                        throw crp.a(v139);
                                                    }
                                                }
                                                v131 = 1;
                                                break block315;
                                            }
                                            v131 = 0;
                                        }
                                        var31_29 = v131;
                                    }
                                    v126 = var31_29;
                                }
                                try {
                                    if (var6_5 == 0) break block317;
                                    if (v126 == 0) continue;
                                }
                                catch (JsonSyntaxException v140) {
                                    throw crp.a(v140);
                                }
                                v126 = var24_17;
                            }
                            try {
                                if (v126 != 0) {
                                    Shaders.nextBlockEntity((pyk)var29_26);
                                }
                            }
                            catch (JsonSyntaxException v141) {
                                throw crp.a(v141);
                            }
                            xv4.b2r.c4z((pyk)var29_26, var3_3, var27_24.fll());
                        } while (var6_5 != 0);
                        this.zwv();
                        this.sy_ = false;
                        v115 = var24_17;
                    }
                    try {
                        if (var6_5 == 0) break block318;
                        if (v115 == 0) break block319;
                    }
                    catch (JsonSyntaxException v142) {
                        throw crp.a(v142);
                    }
                    Shaders.endBlockEntities();
                }
                v115 = crp.pp5 - 1;
            }
            crp.pp5 = v115;
            this.j0u.x0p.yvz();
            this.j0u.ba0.uio();
lbl965:
            // 2 sources

            return;
        }
    }

    public String kb1() {
        Object object;
        Object[] objectArray;
        CallSite callSite;
        block13: {
            block12: {
                long l = a ^ 0x54FD0FE0D16BL;
                int n = this.o6x.mzt.length;
                int n2 = 0;
                int n3 = t9d.c();
                for (crp$j3h crp$j3h : this.eq2) {
                    block11: {
                        cbc cbc2;
                        block10: {
                            cbc cbc3 = crp$j3h.xvr.ltn;
                            try {
                                try {
                                    cbc2 = cbc3;
                                    if (n3 != 0) break block10;
                                    if (cbc2 == cbc.ays) break block11;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                cbc2 = cbc3;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                        }
                        try {
                            if (!cbc2.ra6()) {
                                ++n2;
                            }
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    if (n3 == 0) continue;
                }
                try {
                    callSite = crp.a("j", (int)17160, (long)(0x10AE951425424093L ^ l));
                    Object[] objectArray2 = new Object[5];
                    objectArray2[0] = n2;
                    objectArray2[1] = n;
                    Object[] objectArray3 = objectArray2;
                    objectArray = objectArray2;
                    int n4 = 2;
                    if (!this.j0u.qul) break block12;
                    object = crp.a("j", (int)7025, (long)(0x73CA9AE0C0D18C6L ^ l));
                    break block13;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            object = "";
        }
        objectArray3[n4] = object;
        objectArray[3] = this.bsi;
        objectArray[4] = this.isn.hjm();
        return String.format((String)((Object)callSite), objectArray);
    }

    public String jda() {
        long l = a ^ 0x4ECE726E56D2L;
        return (String)((Object)crp.a("j", (int)9296, (long)(0x1D41BA5268F22053L ^ l))) + this.yoz + "/" + this.z1b + (String)((Object)crp.a("j", (int)24315, (long)(0x12300E976CA5ADAL ^ l))) + this.ofr + (String)((Object)crp.a("j", (int)9363, (long)(0x1B43003797BDA085L ^ l))) + (this.z1b - this.ofr - this.yoz) + (String)((Object)crp.a("j", (int)2988, (long)(0x5CC752B71B7E8F93L ^ l))) + hxt._cs();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void dvx(i2h var1_1, double var2_2, _aq var4_3, int var5_4, boolean var6_5) {
        block321: {
            block323: {
                block319: {
                    block317: {
                        block318: {
                            block284: {
                                block285: {
                                    block299: {
                                        block296: {
                                            block297: {
                                                block298: {
                                                    block287: {
                                                        block294: {
                                                            block295: {
                                                                block292: {
                                                                    block290: {
                                                                        block291: {
                                                                            block288: {
                                                                                block289: {
                                                                                    block286: {
                                                                                        block272: {
                                                                                            block273: {
                                                                                                block271: {
                                                                                                    block274: {
                                                                                                        block275: {
                                                                                                            block269: {
                                                                                                                block268: {
                                                                                                                    block270: {
                                                                                                                        block267: {
                                                                                                                            block265: {
                                                                                                                                block266: {
                                                                                                                                    block263: {
                                                                                                                                        block264: {
                                                                                                                                            block261: {
                                                                                                                                                block258: {
                                                                                                                                                    block259: {
                                                                                                                                                        block256: {
                                                                                                                                                            block257: {
                                                                                                                                                                block254: {
                                                                                                                                                                    block252: {
                                                                                                                                                                        block253: {
                                                                                                                                                                            var7_6 = crp.a ^ 87339110215501L;
                                                                                                                                                                            var9_7 = t9d.c();
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    v0 = this;
                                                                                                                                                                                    if (var9_7 != 0) break block252;
                                                                                                                                                                                    if (v0.j0u.oxn.gcj == this.bsi) break block253;
                                                                                                                                                                                }
                                                                                                                                                                                catch (JsonSyntaxException v1) {
                                                                                                                                                                                    throw crp.a(v1);
                                                                                                                                                                                }
                                                                                                                                                                                this.f9n();
                                                                                                                                                                            }
                                                                                                                                                                            catch (JsonSyntaxException v2) {
                                                                                                                                                                                throw crp.a(v2);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v0 = this;
                                                                                                                                                                    }
                                                                                                                                                                    v0.t6z.e8t.qek((String)crp.a("j", (int)21436, (long)(6626665874687962685L ^ var7_6)));
                                                                                                                                                                    var10_8 = var1_1.o2v - this.gxe;
                                                                                                                                                                    var12_9 = var1_1.kfp - this.ex0;
                                                                                                                                                                    var14_10 = var1_1.vbd - this.rv_;
                                                                                                                                                                    try {
                                                                                                                                                                        block255: {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        v3 = this;
                                                                                                                                                                                                        if (var9_7 != 0) break block254;
                                                                                                                                                                                                        if (v3.ivg != var1_1.jw4) break block255;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (JsonSyntaxException v4) {
                                                                                                                                                                                                        throw crp.a(v4);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v3 = this;
                                                                                                                                                                                                    if (var9_7 != 0) break block254;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (JsonSyntaxException v5) {
                                                                                                                                                                                                    throw crp.a(v5);
                                                                                                                                                                                                }
                                                                                                                                                                                                if (v3.bg4 != var1_1.cub) break block255;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (JsonSyntaxException v6) {
                                                                                                                                                                                                throw crp.a(v6);
                                                                                                                                                                                            }
                                                                                                                                                                                            v3 = this;
                                                                                                                                                                                            if (var9_7 != 0) break block254;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (JsonSyntaxException v7) {
                                                                                                                                                                                            throw crp.a(v7);
                                                                                                                                                                                        }
                                                                                                                                                                                        if (v3.o3i != var1_1.e6l) break block255;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (JsonSyntaxException v8) {
                                                                                                                                                                                        throw crp.a(v8);
                                                                                                                                                                                    }
                                                                                                                                                                                    cfr_temp_0 = var10_8 * var10_8 + var12_9 * var12_9 + var14_10 * var14_10 - 16.0;
                                                                                                                                                                                    v9 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                                                                                                    if (var9_7 != 0) break block256;
                                                                                                                                                                                }
                                                                                                                                                                                catch (JsonSyntaxException v10) {
                                                                                                                                                                                    throw crp.a(v10);
                                                                                                                                                                                }
                                                                                                                                                                                if (v9 <= 0) break block257;
                                                                                                                                                                            }
                                                                                                                                                                            catch (JsonSyntaxException v11) {
                                                                                                                                                                                throw crp.a(v11);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        this.gxe = var1_1.o2v;
                                                                                                                                                                        this.ex0 = var1_1.kfp;
                                                                                                                                                                        this.rv_ = var1_1.vbd;
                                                                                                                                                                        this.ivg = var1_1.jw4;
                                                                                                                                                                        this.bg4 = var1_1.cub;
                                                                                                                                                                        this.o3i = var1_1.e6l;
                                                                                                                                                                        v3 = this;
                                                                                                                                                                    }
                                                                                                                                                                    catch (JsonSyntaxException v12) {
                                                                                                                                                                        throw crp.a(v12);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v3.o6x.b4a(var1_1.o2v, var1_1.vbd);
                                                                                                                                                            }
                                                                                                                                                            v9 = hxt.csr();
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (v9 != 0) {
                                                                                                                                                                DynamicLights.update(this);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        catch (JsonSyntaxException v13) {
                                                                                                                                                            throw crp.a(v13);
                                                                                                                                                        }
                                                                                                                                                        this.t6z.e8t.v2l((String)crp.a("j", (int)8998, (long)(453593892025720453L ^ var7_6)));
                                                                                                                                                        var16_11 = var1_1.ivp + (var1_1.o2v - var1_1.ivp) * var2_2;
                                                                                                                                                        var18_12 = var1_1.c54 + (var1_1.kfp - var1_1.c54) * var2_2;
                                                                                                                                                        var20_13 = var1_1.e2b + (var1_1.vbd - var1_1.e2b) * var2_2;
                                                                                                                                                        try {
                                                                                                                                                            this.f9a.wyf(var16_11, var18_12, var20_13);
                                                                                                                                                            this.t6z.e8t.v2l((String)crp.a("j", (int)9607, (long)(4417217594645895186L ^ var7_6)));
                                                                                                                                                            v14 = this;
                                                                                                                                                            if (var9_7 != 0) break block258;
                                                                                                                                                            if (v14.hyu == null) break block259;
                                                                                                                                                        }
                                                                                                                                                        catch (JsonSyntaxException v15) {
                                                                                                                                                            throw crp.a(v15);
                                                                                                                                                        }
                                                                                                                                                        var22_14 = new grx(this.hyu);
                                                                                                                                                        var22_14._wl(this.c2_.kvw, this.c2_.cdu, this.c2_.lji);
                                                                                                                                                        var4_3 = var22_14;
                                                                                                                                                    }
                                                                                                                                                    v14 = this;
                                                                                                                                                }
                                                                                                                                                v14.j0u.ba0.v2l((String)crp.a("j", (int)3785, (long)(2236362100678652739L ^ var7_6)));
                                                                                                                                                var22_14 = new mew(var16_11, var18_12 + (double)var1_1.c5y(), var20_13);
                                                                                                                                                var23_15 = this.o6x.bes((mew)var22_14);
                                                                                                                                                new mew(fe6.jqf(var16_11 / 16.0) * 16, fe6.jqf(var18_12 / 16.0) * 16, fe6.jqf(var20_13 / 16.0) * 16);
                                                                                                                                                v16 = this.jli;
                                                                                                                                                if (var9_7 == 0) {
                                                                                                                                                    block262: {
                                                                                                                                                        block260: {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (v16) break block260;
                                                                                                                                                                                                            v16 = this.l0i.isEmpty();
                                                                                                                                                                                                            if (var9_7 != 0) break block261;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (JsonSyntaxException v17) {
                                                                                                                                                                                                            throw crp.a(v17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!v16) break block260;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (JsonSyntaxException v18) {
                                                                                                                                                                                                        throw crp.a(v18);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    cfr_temp_1 = var1_1.o2v - this.o6f;
                                                                                                                                                                                                    v16 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                                                                                                                                    if (var9_7 != 0) break block261;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (JsonSyntaxException v19) {
                                                                                                                                                                                                    throw crp.a(v19);
                                                                                                                                                                                                }
                                                                                                                                                                                                if (v16) break block260;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (JsonSyntaxException v20) {
                                                                                                                                                                                                throw crp.a(v20);
                                                                                                                                                                                            }
                                                                                                                                                                                            cfr_temp_2 = var1_1.kfp - this.okd;
                                                                                                                                                                                            v16 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                                                                                                                                            if (var9_7 != 0) break block261;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (JsonSyntaxException v21) {
                                                                                                                                                                                            throw crp.a(v21);
                                                                                                                                                                                        }
                                                                                                                                                                                        if (v16) break block260;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (JsonSyntaxException v22) {
                                                                                                                                                                                        throw crp.a(v22);
                                                                                                                                                                                    }
                                                                                                                                                                                    cfr_temp_3 = var1_1.vbd - this.tq1;
                                                                                                                                                                                    v16 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                                                                                                                                                    if (var9_7 != 0) break block261;
                                                                                                                                                                                }
                                                                                                                                                                                catch (JsonSyntaxException v23) {
                                                                                                                                                                                    throw crp.a(v23);
                                                                                                                                                                                }
                                                                                                                                                                                if (v16) break block260;
                                                                                                                                                                            }
                                                                                                                                                                            catch (JsonSyntaxException v24) {
                                                                                                                                                                                throw crp.a(v24);
                                                                                                                                                                            }
                                                                                                                                                                            cfr_temp_4 = (double)var1_1.y2i - this.p5b;
                                                                                                                                                                            v16 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                                                                                                            if (var9_7 != 0) break block261;
                                                                                                                                                                        }
                                                                                                                                                                        catch (JsonSyntaxException v25) {
                                                                                                                                                                            throw crp.a(v25);
                                                                                                                                                                        }
                                                                                                                                                                        if (v16) break block260;
                                                                                                                                                                    }
                                                                                                                                                                    catch (JsonSyntaxException v26) {
                                                                                                                                                                        throw crp.a(v26);
                                                                                                                                                                    }
                                                                                                                                                                    cfr_temp_5 = (double)var1_1.x5k - this.udn;
                                                                                                                                                                    v16 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                                                                                                                                    if (var9_7 != 0) break block261;
                                                                                                                                                                }
                                                                                                                                                                catch (JsonSyntaxException v27) {
                                                                                                                                                                    throw crp.a(v27);
                                                                                                                                                                }
                                                                                                                                                                if (!v16) break block262;
                                                                                                                                                            }
                                                                                                                                                            catch (JsonSyntaxException v28) {
                                                                                                                                                                throw crp.a(v28);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v16 = true;
                                                                                                                                                        break block261;
                                                                                                                                                    }
                                                                                                                                                    v16 = false;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                this.jli = v16;
                                                                                                                                                this.o6f = var1_1.o2v;
                                                                                                                                                this.okd = var1_1.kfp;
                                                                                                                                                this.tq1 = var1_1.vbd;
                                                                                                                                                this.p5b = var1_1.y2i;
                                                                                                                                                this.udn = var1_1.x5k;
                                                                                                                                                v29 = this.hyu != null;
                                                                                                                                            }
                                                                                                                                            catch (JsonSyntaxException v30) {
                                                                                                                                                throw crp.a(v30);
                                                                                                                                            }
                                                                                                                                            var24_16 = v29;
                                                                                                                                            this.j0u.ba0.v2l((String)crp.a("j", (int)22512, (long)(5953766524039703166L ^ var7_6)));
                                                                                                                                            Lagometer.timerVisibility.start();
                                                                                                                                            var25_17 = this.wpv();
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v31 = var25_17;
                                                                                                                                                    if (var9_7 != 0) break block263;
                                                                                                                                                    if (v31 == this._t5) break block264;
                                                                                                                                                }
                                                                                                                                                catch (JsonSyntaxException v32) {
                                                                                                                                                    throw crp.a(v32);
                                                                                                                                                }
                                                                                                                                                this._t5 = var25_17;
                                                                                                                                                this.jli = true;
                                                                                                                                            }
                                                                                                                                            catch (JsonSyntaxException v33) {
                                                                                                                                                throw crp.a(v33);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v31 = 256;
                                                                                                                                    }
                                                                                                                                    var26_18 = v31;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v34 = ChunkVisibility.isFinished();
                                                                                                                                            if (var9_7 != 0) break block265;
                                                                                                                                            if (v34) break block266;
                                                                                                                                        }
                                                                                                                                        catch (JsonSyntaxException v35) {
                                                                                                                                            throw crp.a(v35);
                                                                                                                                        }
                                                                                                                                        this.jli = true;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException v36) {
                                                                                                                                        throw crp.a(v36);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v34 = var24_16;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var9_7 != 0) break block267;
                                                                                                                                        if (v34) break block268;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException v37) {
                                                                                                                                        throw crp.a(v37);
                                                                                                                                    }
                                                                                                                                    v38 = this;
                                                                                                                                    if (var9_7 != 0) break block269;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException v39) {
                                                                                                                                    throw crp.a(v39);
                                                                                                                                }
                                                                                                                                v34 = v38.jli;
                                                                                                                            }
                                                                                                                            catch (JsonSyntaxException v40) {
                                                                                                                                throw crp.a(v40);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (!v34) break block268;
                                                                                                                                    v41 = hxt.uv_();
                                                                                                                                    if (var9_7 != 0) break block270;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException v42) {
                                                                                                                                    throw crp.a(v42);
                                                                                                                                }
                                                                                                                                if (v41 == 0) break block268;
                                                                                                                            }
                                                                                                                            catch (JsonSyntaxException v43) {
                                                                                                                                throw crp.a(v43);
                                                                                                                            }
                                                                                                                            v41 = ChunkVisibility.getMaxChunkY(this.t6z, var1_1, this.bsi);
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException v44) {
                                                                                                                            throw crp.a(v44);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var26_18 = v41;
                                                                                                                }
                                                                                                                v38 = this;
                                                                                                            }
                                                                                                            var27_19 = v38.o6x.bes(new mew(var1_1.o2v, var1_1.kfp, var1_1.vbd));
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (var9_7 != 0) break block271;
                                                                                                                                                    if (Shaders.isShadowPass) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl430
                                                                                                                                                }
                                                                                                                                                catch (JsonSyntaxException v45) {
                                                                                                                                                    throw crp.a(v45);
                                                                                                                                                }
                                                                                                                                                this.eq2 = this.qow;
                                                                                                                                                this.fo5 = this.dp7;
                                                                                                                                                this.ea4 = this.f6f;
                                                                                                                                                v46 = var24_16;
                                                                                                                                                if (var9_7 != 0) break block272;
                                                                                                                                            }
                                                                                                                                            catch (JsonSyntaxException v47) {
                                                                                                                                                throw crp.a(v47);
                                                                                                                                            }
                                                                                                                                            if (v46) break block273;
                                                                                                                                        }
                                                                                                                                        catch (JsonSyntaxException v48) {
                                                                                                                                            throw crp.a(v48);
                                                                                                                                        }
                                                                                                                                        v46 = this.jli;
                                                                                                                                        if (var9_7 != 0) break block272;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException v49) {
                                                                                                                                        throw crp.a(v49);
                                                                                                                                    }
                                                                                                                                    if (!v46) break block273;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException v50) {
                                                                                                                                    throw crp.a(v50);
                                                                                                                                }
                                                                                                                                v51 = this;
                                                                                                                                if (var9_7 != 0) break block274;
                                                                                                                            }
                                                                                                                            catch (JsonSyntaxException v52) {
                                                                                                                                throw crp.a(v52);
                                                                                                                            }
                                                                                                                            v51.ixl();
                                                                                                                            if (var27_19 == null) break block275;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException v53) {
                                                                                                                            throw crp.a(v53);
                                                                                                                        }
                                                                                                                        v54 = var27_19.a7g().getY();
                                                                                                                        if (var9_7 != 0) break block275;
                                                                                                                    }
                                                                                                                    catch (JsonSyntaxException v55) {
                                                                                                                        throw crp.a(v55);
                                                                                                                    }
                                                                                                                    if (v54 <= var26_18) break block275;
                                                                                                                }
                                                                                                                catch (JsonSyntaxException v56) {
                                                                                                                    throw crp.a(v56);
                                                                                                                }
                                                                                                                v54 = (int)this.fo5.add(var27_19.fcl());
                                                                                                            }
                                                                                                            catch (JsonSyntaxException v57) {
                                                                                                                throw crp.a(v57);
                                                                                                            }
                                                                                                        }
                                                                                                        v51 = this;
                                                                                                    }
                                                                                                    var28_20 = ShadowUtils.makeShadowChunkIterator(v51.t6z, var2_2, var1_1, this.bsi, this.o6x);
                                                                                                    while (var28_20.hasNext()) {
                                                                                                        block277: {
                                                                                                            block282: {
                                                                                                                block283: {
                                                                                                                    block281: {
                                                                                                                        block279: {
                                                                                                                            block278: {
                                                                                                                                block276: {
                                                                                                                                    var29_21 = (kqk)var28_20.next();
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (var9_7 != 0) break block273;
                                                                                                                                            v58 = var29_21;
                                                                                                                                            if (var9_7 != 0) break block276;
                                                                                                                                        }
                                                                                                                                        catch (JsonSyntaxException v59) {
                                                                                                                                            throw crp.a(v59);
                                                                                                                                        }
                                                                                                                                        if (v58 == null) break block277;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException v60) {
                                                                                                                                        throw crp.a(v60);
                                                                                                                                    }
                                                                                                                                    v58 = var29_21;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var9_7 != 0) break block278;
                                                                                                                                        if (v58.a7g().getY() > var26_18) break block277;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException v61) {
                                                                                                                                        throw crp.a(v61);
                                                                                                                                    }
                                                                                                                                    v58 = var29_21;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException v62) {
                                                                                                                                    throw crp.a(v62);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var30_23 = v58.fcl();
                                                                                                                            try {
                                                                                                                                block280: {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v63 = var29_21.ltn.ra6();
                                                                                                                                                if (var9_7 != 0) break block279;
                                                                                                                                                if (!v63) break block280;
                                                                                                                                            }
                                                                                                                                            catch (JsonSyntaxException v64) {
                                                                                                                                                throw crp.a(v64);
                                                                                                                                            }
                                                                                                                                            v65 = var29_21.tbo();
                                                                                                                                            if (var9_7 != 0) break block281;
                                                                                                                                        }
                                                                                                                                        catch (JsonSyntaxException v66) {
                                                                                                                                            throw crp.a(v66);
                                                                                                                                        }
                                                                                                                                        if (v65 == 0) break block279;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException v67) {
                                                                                                                                        throw crp.a(v67);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v63 = this.eq2.add(var30_23);
                                                                                                                            }
                                                                                                                            catch (JsonSyntaxException v68) {
                                                                                                                                throw crp.a(v68);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v65 = ChunkUtils.hasEntities(var29_21.v5v());
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var9_7 != 0) break block282;
                                                                                                                            if (v65 == 0) break block283;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException v69) {
                                                                                                                            throw crp.a(v69);
                                                                                                                        }
                                                                                                                        this.fo5.add(var30_23);
                                                                                                                    }
                                                                                                                    catch (JsonSyntaxException v70) {
                                                                                                                        throw crp.a(v70);
                                                                                                                    }
                                                                                                                }
                                                                                                                v65 = var29_21.fw8().pf7().size();
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var9_7 != 0 || v65 <= 0) break block277;
                                                                                                                }
                                                                                                                catch (JsonSyntaxException v71) {
                                                                                                                    throw crp.a(v71);
                                                                                                                }
                                                                                                                v65 = (int)this.ea4.add(var30_23);
                                                                                                            }
                                                                                                            catch (JsonSyntaxException v72) {
                                                                                                                throw crp.a(v72);
                                                                                                            }
                                                                                                        }
                                                                                                        if (var9_7 == 0) continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var9_7 == 0) break block273;
lbl430:
                                                                                                        // 2 sources

                                                                                                        this.eq2 = this.ds4;
                                                                                                        this.fo5 = this.i5v;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException v73) {
                                                                                                        throw crp.a(v73);
                                                                                                    }
                                                                                                }
                                                                                                this.ea4 = this.m2h;
                                                                                            }
                                                                                            v46 = var24_16;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var9_7 != 0) break block284;
                                                                                                            if (v46) break block285;
                                                                                                        }
                                                                                                        catch (JsonSyntaxException v74) {
                                                                                                            throw crp.a(v74);
                                                                                                        }
                                                                                                        v46 = this.jli;
                                                                                                        if (var9_7 != 0) break block284;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException v75) {
                                                                                                        throw crp.a(v75);
                                                                                                    }
                                                                                                    if (!v46) break block285;
                                                                                                }
                                                                                                catch (JsonSyntaxException v76) {
                                                                                                    throw crp.a(v76);
                                                                                                }
                                                                                                v46 = Shaders.isShadowPass;
                                                                                                if (var9_7 != 0) break block284;
                                                                                            }
                                                                                            catch (JsonSyntaxException v77) {
                                                                                                throw crp.a(v77);
                                                                                            }
                                                                                            if (v46) break block285;
                                                                                        }
                                                                                        catch (JsonSyntaxException v78) {
                                                                                            throw crp.a(v78);
                                                                                        }
                                                                                        this.jli = false;
                                                                                        this.ixl();
                                                                                        this.a46.clear();
                                                                                        var28_20 = this.a46;
                                                                                        var29_22 = this.j0u.qul;
                                                                                        try {
                                                                                            v79 = var23_15;
                                                                                            if (var9_7 != 0) break block286;
                                                                                            if (v79 != null) {
                                                                                            }
                                                                                            ** GOTO lbl574
                                                                                        }
                                                                                        catch (JsonSyntaxException v80) {
                                                                                            throw crp.a(v80);
                                                                                        }
                                                                                        v79 = var23_15;
                                                                                    }
                                                                                    try {
                                                                                        v81 = v79.a7g().getY();
                                                                                        if (var9_7 != 0) break block287;
                                                                                        if (v81 <= var26_18) {
                                                                                        }
                                                                                        ** GOTO lbl574
                                                                                    }
                                                                                    catch (JsonSyntaxException v82) {
                                                                                        throw crp.a(v82);
                                                                                    }
                                                                                    var30_24 = 0;
                                                                                    var31_26 = new crp$j3h(var23_15, null, 0);
                                                                                    var32_30 = crp.mgk;
                                                                                    try {
                                                                                        v83 = var32_30.size();
                                                                                        if (var9_7 != 0) break block288;
                                                                                        if (v83 != 1) break block289;
                                                                                    }
                                                                                    catch (JsonSyntaxException v84) {
                                                                                        throw crp.a(v84);
                                                                                    }
                                                                                    var33_34 = this.di3(var1_1, var2_2);
                                                                                    var34_36 = vt2.lib(var33_34.x, var33_34.y, var33_34.z).b4b();
                                                                                    var32_30.remove(var34_36);
                                                                                }
                                                                                v83 = (int)var32_30.isEmpty();
                                                                            }
                                                                            try {
                                                                                if (var9_7 != 0) break block290;
                                                                                if (v83 == 0) break block291;
                                                                            }
                                                                            catch (JsonSyntaxException v85) {
                                                                                throw crp.a(v85);
                                                                            }
                                                                            var30_24 = 1;
                                                                        }
                                                                        v83 = var30_24;
                                                                    }
                                                                    try {
                                                                        block293: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var9_7 != 0) break block292;
                                                                                            if (v83 == 0) break block293;
                                                                                        }
                                                                                        catch (JsonSyntaxException v86) {
                                                                                            throw crp.a(v86);
                                                                                        }
                                                                                        v83 = (int)var6_5;
                                                                                        if (var9_7 != 0) break block292;
                                                                                    }
                                                                                    catch (JsonSyntaxException v87) {
                                                                                        throw crp.a(v87);
                                                                                    }
                                                                                    if (v83 != 0) break block293;
                                                                                }
                                                                                catch (JsonSyntaxException v88) {
                                                                                    throw crp.a(v88);
                                                                                }
                                                                                this.eq2.add(var31_26);
                                                                                if (var9_7 == 0) break block294;
                                                                            }
                                                                            catch (JsonSyntaxException v89) {
                                                                                throw crp.a(v89);
                                                                            }
                                                                        }
                                                                        v83 = (int)var6_5;
                                                                    }
                                                                    catch (JsonSyntaxException v90) {
                                                                        throw crp.a(v90);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var9_7 != 0) break block294;
                                                                            if (v83 == 0) break block295;
                                                                        }
                                                                        catch (JsonSyntaxException v91) {
                                                                            throw crp.a(v91);
                                                                        }
                                                                        v83 = (int)this.t6z.getBlockState((mew)var22_14).r_y().ko5();
                                                                        if (var9_7 != 0) break block294;
                                                                    }
                                                                    catch (JsonSyntaxException v92) {
                                                                        throw crp.a(v92);
                                                                    }
                                                                    if (v83 == 0) break block295;
                                                                }
                                                                catch (JsonSyntaxException v93) {
                                                                    throw crp.a(v93);
                                                                }
                                                                var29_22 = false;
                                                            }
                                                            var23_15.yhg(var5_4);
                                                            v83 = (int)var28_20.add(var31_26);
                                                        }
                                                        try {
                                                            if (var9_7 == 0) break block296;
lbl574:
                                                            // 3 sources

                                                            v81 = var22_14.getY();
                                                        }
                                                        catch (JsonSyntaxException v94) {
                                                            throw crp.a(v94);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var9_7 != 0) break block297;
                                                            if (v81 <= 0) break block298;
                                                        }
                                                        catch (JsonSyntaxException v95) {
                                                            throw crp.a(v95);
                                                        }
                                                        v81 = Math.min(var26_18, 248);
                                                        break block297;
                                                    }
                                                    catch (JsonSyntaxException v96) {
                                                        throw crp.a(v96);
                                                    }
                                                }
                                                v81 = 8;
                                            }
                                            var30_24 = v81;
                                            try {
                                                if (var27_19 != null) {
                                                    this.fo5.add(var27_19.fcl());
                                                }
                                            }
                                            catch (JsonSyntaxException v97) {
                                                throw crp.a(v97);
                                            }
                                            for (var31_27 = -this.bsi; var31_27 <= this.bsi; ++var31_27) {
                                                v98 = -this.bsi;
                                                if (var9_7 != 0) break block299;
                                                var32_31 = v98;
                                                while (var32_31 <= this.bsi) {
                                                    block300: {
                                                        block301: {
                                                            block302: {
                                                                var33_34 = this.o6x.bes(new mew((var31_27 << 4) + 8, var30_24, (var32_31 << 4) + 8));
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var9_7 != 0) break block300;
                                                                                    v99 /* !! */  = var33_34;
                                                                                    if (var9_7 == 0) {
                                                                                    }
                                                                                    ** GOTO lbl657
                                                                                }
                                                                                catch (JsonSyntaxException v100) {
                                                                                    throw crp.a(v100);
                                                                                }
                                                                                if (v99 /* !! */  == null) break block301;
                                                                            }
                                                                            catch (JsonSyntaxException v101) {
                                                                                throw crp.a(v101);
                                                                            }
                                                                            v102 = var33_34.k4g((_aq)var4_3, var5_4);
                                                                            if (var9_7 != 0) break block302;
                                                                        }
                                                                        catch (JsonSyntaxException v103) {
                                                                            throw crp.a(v103);
                                                                        }
                                                                        if (!v102) break block301;
                                                                    }
                                                                    catch (JsonSyntaxException v104) {
                                                                        throw crp.a(v104);
                                                                    }
                                                                    v102 = var33_34.yhg(var5_4);
                                                                }
                                                                catch (JsonSyntaxException v105) {
                                                                    throw crp.a(v105);
                                                                }
                                                            }
                                                            var34_36 = var33_34.fcl();
                                                            crp$j3h.u1n((crp$j3h)var34_36, null, 0);
                                                            var28_20.add(var34_36);
                                                        }
                                                        ++var32_31;
                                                    }
                                                    if (var9_7 == 0) continue;
                                                }
                                                if (var9_7 == 0) continue;
                                                break;
                                            }
                                        }
                                        this.j0u.ba0.qek((String)crp.a("j", (int)4967, (long)(635084125698944753L ^ var7_6)));
                                        v98 = (int)hxt.l76();
                                    }
                                    var30_24 = v98;
                                    block241: while (true) {
                                        v106 = var28_20.isEmpty();
                                        block242: while (!v106) {
                                            block332: {
                                                block311: {
                                                    block310: {
                                                        block308: {
                                                            block309: {
                                                                block306: {
                                                                    block307: {
                                                                        block305: {
                                                                            block303: {
                                                                                v99 /* !! */  = var28_20.poll();
lbl657:
                                                                                // 2 sources

                                                                                var31_28 = (crp$j3h)v99 /* !! */ ;
                                                                                var32_32 = var31_28.xvr;
                                                                                var33_34 = var31_28.rkx;
                                                                                var34_36 = var32_32.ltn;
                                                                                try {
                                                                                    block304: {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v46 = var34_36.ra6();
                                                                                                        if (var9_7 != 0) break block284;
                                                                                                        if (var9_7 != 0) break block303;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException v107) {
                                                                                                        throw crp.a(v107);
                                                                                                    }
                                                                                                    if (!v46) break block304;
                                                                                                }
                                                                                                catch (JsonSyntaxException v108) {
                                                                                                    throw crp.a(v108);
                                                                                                }
                                                                                                v109 = var32_32.tbo();
                                                                                                if (var9_7 != 0) break block305;
                                                                                            }
                                                                                            catch (JsonSyntaxException v110) {
                                                                                                throw crp.a(v110);
                                                                                            }
                                                                                            if (v109 == 0) break block303;
                                                                                        }
                                                                                        catch (JsonSyntaxException v111) {
                                                                                            throw crp.a(v111);
                                                                                        }
                                                                                    }
                                                                                    this.eq2.add(var31_28);
                                                                                }
                                                                                catch (JsonSyntaxException v112) {
                                                                                    throw crp.a(v112);
                                                                                }
                                                                            }
                                                                            v109 = ChunkUtils.hasEntities(var32_32.v5v());
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var9_7 != 0) break block306;
                                                                                if (v109 == 0) break block307;
                                                                            }
                                                                            catch (JsonSyntaxException v113) {
                                                                                throw crp.a(v113);
                                                                            }
                                                                            this.fo5.add(var31_28);
                                                                        }
                                                                        catch (JsonSyntaxException v114) {
                                                                            throw crp.a(v114);
                                                                        }
                                                                    }
                                                                    v109 = var34_36.pf7().size();
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var9_7 != 0) break block308;
                                                                        if (v109 <= 0) break block309;
                                                                    }
                                                                    catch (JsonSyntaxException v115) {
                                                                        throw crp.a(v115);
                                                                    }
                                                                    this.ea4.add(var31_28);
                                                                }
                                                                catch (JsonSyntaxException v116) {
                                                                    throw crp.a(v116);
                                                                }
                                                            }
                                                            v109 = (int)var29_22;
                                                        }
                                                        try {
                                                            try {
                                                                if (var9_7 != 0) break block310;
                                                                if (v109 == 0) break block311;
                                                            }
                                                            catch (JsonSyntaxException v117) {
                                                                throw crp.a(v117);
                                                            }
                                                            v109 = var31_28.b3g;
                                                        }
                                                        catch (JsonSyntaxException v118) {
                                                            throw crp.a(v118);
                                                        }
                                                    }
                                                    v119 = ChunkVisibility.getFacingsNotOpposite(v109);
                                                    break block332;
                                                }
                                                v119 = vt2.vbu;
                                            }
                                            var35_37 = v119;
                                            var36_38 = var35_37.length;
                                            var37_39 = 0;
                                            while (var37_39 < var36_38) {
                                                block314: {
                                                    block313: {
                                                        block316: {
                                                            block315: {
                                                                block312: {
                                                                    var38_40 = var35_37[var37_39];
                                                                    v106 = var29_22;
                                                                    if (var9_7 != 0) continue block242;
                                                                    try {
                                                                        try {
                                                                            if (!v106 || var33_34 == null) break block312;
                                                                        }
                                                                        catch (JsonSyntaxException v120) {
                                                                            throw crp.a(v120);
                                                                        }
                                                                        if (!var34_36.spn(var33_34.b4b(), var38_40)) break block313;
                                                                    }
                                                                    catch (JsonSyntaxException v121) {
                                                                        throw crp.a(v121);
                                                                    }
                                                                }
                                                                var39_41 = this.z9d((mew)var22_14, var32_32, var38_40, (boolean)var30_24, var26_18);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var9_7 != 0) break block314;
                                                                                if (var39_41 == null) break block313;
                                                                            }
                                                                            catch (JsonSyntaxException v122) {
                                                                                throw crp.a(v122);
                                                                            }
                                                                            v123 = var39_41.yhg(var5_4);
                                                                            if (var9_7 != 0) break block315;
                                                                        }
                                                                        catch (JsonSyntaxException v124) {
                                                                            throw crp.a(v124);
                                                                        }
                                                                        if (v123 == 0) break block313;
                                                                    }
                                                                    catch (JsonSyntaxException v125) {
                                                                        throw crp.a(v125);
                                                                    }
                                                                    v123 = var39_41.k4g((_aq)var4_3, var5_4);
                                                                }
                                                                catch (JsonSyntaxException v126) {
                                                                    throw crp.a(v126);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var9_7 != 0) break block316;
                                                                    if (v123 == 0) break block313;
                                                                }
                                                                catch (JsonSyntaxException v127) {
                                                                    throw crp.a(v127);
                                                                }
                                                                v123 = var31_28.b3g | 1 << var38_40.ordinal();
                                                            }
                                                            catch (JsonSyntaxException v128) {
                                                                throw crp.a(v128);
                                                            }
                                                        }
                                                        var40_42 = v123;
                                                        var41_43 = var39_41.fcl();
                                                        crp$j3h.u1n(var41_43, var38_40, var40_42);
                                                        var28_20.add(var41_43);
                                                    }
                                                    ++var37_39;
                                                }
                                                if (var9_7 == 0) continue;
                                            }
                                            if (var9_7 == 0) continue block241;
                                        }
                                        break;
                                    }
                                    this.j0u.ba0.uio();
                                }
                                this.j0u.ba0.v2l((String)crp.a("j", (int)13009, (long)(5214816704257314625L ^ var7_6)));
                                v46 = this.i1y;
                            }
                            try {
                                try {
                                    if (var9_7 != 0) break block317;
                                    if (!v46) break block318;
                                }
                                catch (JsonSyntaxException v129) {
                                    throw crp.a(v129);
                                }
                                this.n3h(var16_11, var18_12, var20_13);
                                this.i1y = false;
                            }
                            catch (JsonSyntaxException v130) {
                                throw crp.a(v130);
                            }
                        }
                        try {
                            Lagometer.timerVisibility.end();
                            if (var9_7 != 0) break block319;
                            v46 = Shaders.isShadowPass;
                        }
                        catch (JsonSyntaxException v131) {
                            throw crp.a(v131);
                        }
                    }
                    try {
                        block320: {
                            try {
                                if (!v46) break block320;
                                Shaders.mcProfilerEndSection();
                                if (var9_7 == 0) break block321;
                            }
                            catch (JsonSyntaxException v132) {
                                throw crp.a(v132);
                            }
                        }
                        this.j0u.ba0.v2l((String)crp.a("j", (int)5824, (long)(1127151057967180649L ^ var7_6)));
                        this.isn.oqw();
                    }
                    catch (JsonSyntaxException v133) {
                        throw crp.a(v133);
                    }
                }
                var28_20 = this.l0i;
                this.l0i = Sets.newLinkedHashSet();
                Lagometer.timerChunkUpdate.start();
                for (crp$j3h var30_25 : this.eq2) {
                    block325: {
                        block330: {
                            block328: {
                                block326: {
                                    block327: {
                                        block322: {
                                            var31_29 = var30_25.xvr;
                                            try {
                                                block324: {
                                                    try {
                                                        try {
                                                            try {
                                                                v134 = var31_29;
                                                                if (var9_7 != 0) break block322;
                                                                v135 = v134.tbo();
                                                                if (var9_7 != 0) break block323;
                                                            }
                                                            catch (JsonSyntaxException v136) {
                                                                throw crp.a(v136);
                                                            }
                                                            if (v135) break block324;
                                                        }
                                                        catch (JsonSyntaxException v137) {
                                                            throw crp.a(v137);
                                                        }
                                                        if (!var28_20.contains(var31_29)) break block325;
                                                    }
                                                    catch (JsonSyntaxException v138) {
                                                        throw crp.a(v138);
                                                    }
                                                }
                                                this.jli = true;
                                                v134 = var31_29;
                                            }
                                            catch (JsonSyntaxException v139) {
                                                throw crp.a(v139);
                                            }
                                        }
                                        var32_33 = v134.a7g();
                                        try {
                                            cfr_temp_6 = var22_14.p4e(var32_33.getX() + 8, var32_33.getY() + 8, var32_33.getZ() + 8) - 768.0;
                                            v140 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                                            if (var9_7 != 0) break block326;
                                            if (v140 >= 0) break block327;
                                        }
                                        catch (JsonSyntaxException v141) {
                                            throw crp.a(v141);
                                        }
                                        v140 = (double)true;
                                        break block326;
                                    }
                                    v140 = (double)false;
                                }
                                var33_35 = v140;
                                try {
                                    block329: {
                                        try {
                                            try {
                                                v142 = var33_35;
                                                if (var9_7 != 0) break block328;
                                                if (v142 != false) break block329;
                                            }
                                            catch (JsonSyntaxException v143) {
                                                throw crp.a(v143);
                                            }
                                            this.l0i.add(var31_29);
                                            if (var9_7 == 0) break block325;
                                        }
                                        catch (JsonSyntaxException v144) {
                                            throw crp.a(v144);
                                        }
                                    }
                                    v142 = (double)var31_29.f76();
                                }
                                catch (JsonSyntaxException v145) {
                                    throw crp.a(v145);
                                }
                            }
                            try {
                                block331: {
                                    try {
                                        try {
                                            if (var9_7 != 0) break block330;
                                            if (v142 != false) break block331;
                                        }
                                        catch (JsonSyntaxException v146) {
                                            throw crp.a(v146);
                                        }
                                        this.th7.add(var31_29);
                                        if (var9_7 == 0) break block325;
                                    }
                                    catch (JsonSyntaxException v147) {
                                        throw crp.a(v147);
                                    }
                                }
                                this.j0u.ba0.qek((String)crp.a("j", (int)12150, (long)(5880661198564545221L ^ var7_6)));
                                v142 = (double)this.isn.fzf(var31_29);
                            }
                            catch (JsonSyntaxException v148) {
                                throw crp.a(v148);
                            }
                        }
                        var31_29.sf6(false);
                        this.j0u.ba0.uio();
                    }
                    if (var9_7 == 0) continue;
                }
                Lagometer.timerChunkUpdate.end();
                v135 = this.l0i.addAll(var28_20);
            }
            this.j0u.ba0.uio();
        }
    }

    private boolean tm7(mew mew2, kqk kqk2) {
        int n;
        block12: {
            int n2;
            block13: {
                mew mew3;
                int n3;
                block14: {
                    block10: {
                        block11: {
                            n3 = t9d.b();
                            mew3 = kqk2.a7g();
                            try {
                                try {
                                    n = fe6.z1m(mew2.getX() - mew3.getX());
                                    n2 = 16;
                                    if (n3 == 0) break block10;
                                    if (n <= n2) break block11;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                n = 0;
                                break block12;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                        }
                        n = fe6.z1m(mew2.getY() - mew3.getY());
                        n2 = 16;
                    }
                    try {
                        try {
                            if (n3 == 0) break block13;
                            if (n <= n2) break block14;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        n = 0;
                        break block12;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                try {
                    n = fe6.z1m(mew2.getZ() - mew3.getZ());
                    if (n3 == 0) break block12;
                    n2 = 16;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            n = n <= n2 ? 1 : 0;
        }
        return n != 0;
    }

    private Set rld(mew mew2) {
        zy2 zy22 = new zy2();
        mew mew3 = new mew(mew2.getX() >> 4 << 4, mew2.getY() >> 4 << 4, mew2.getZ() >> 4 << 4);
        int n = t9d.b();
        tts tts2 = this.t6z.pxs(mew3);
        for (mew$mix mew$mix : mew.getAllInBoxMutable(mew3, mew3.ec4(15, 15, 15))) {
            try {
                if (tts2.mgt(mew$mix).ko5()) {
                    zy22.fzu(mew$mix);
                }
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw crp.a(jsonSyntaxException);
            }
            if (n != 0) continue;
        }
        return zy22.ehq(mew2);
    }

    private kqk z9d(mew mew2, kqk kqk2, vt2 vt22, boolean bl, int n) {
        kqk kqk3;
        block18: {
            kqk kqk4;
            block17: {
                int n2;
                int n3;
                block15: {
                    block16: {
                        kqk kqk5;
                        block13: {
                            block14: {
                                n3 = t9d.b();
                                kqk4 = kqk2.ckf(vt22);
                                try {
                                    try {
                                        kqk5 = kqk4;
                                        if (n3 == 0) break block13;
                                        if (kqk5 != null) break block14;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    return null;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            kqk5 = kqk4;
                        }
                        try {
                            try {
                                n2 = kqk5.a7g().getY();
                                if (n3 == 0) break block15;
                                if (n2 <= n) break block16;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            return null;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n2 = bl ? 1 : 0;
                }
                try {
                    if (n2 == 0) break block17;
                    kqk3 = kqk4;
                    if (n3 == 0) break block18;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
                mew mew3 = kqk3.a7g();
                int n4 = mew2.getX() - mew3.getX();
                int n5 = mew2.getZ() - mew3.getZ();
                int n6 = n4 * n4 + n5 * n5;
                try {
                    if (n6 > this.qn7) {
                        return null;
                    }
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            kqk3 = kqk4;
        }
        return kqk3;
    }

    private void n3h(double d, double d2, double d3) {
        this.hyu = new g2u();
        ((g2u)this.hyu).pte();
        y6e y6e2 = new y6e(this.hyu.ovy);
        y6e2.transpose();
        y6e y6e3 = new y6e(this.hyu.e1v);
        y6e3.transpose();
        y6e y6e4 = new y6e();
        y6e.mul((Matrix4f)y6e3, (Matrix4f)y6e2, (Matrix4f)y6e4);
        int n = t9d.c();
        y6e4.invert();
        this.c2_.kvw = d;
        this.c2_.cdu = d2;
        int n2 = n;
        this.c2_.lji = d3;
        this.s1u[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.s1u[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.s1u[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.s1u[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.s1u[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.s1u[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.s1u[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.s1u[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < 8; ++i) {
            y6e.transform((Matrix4f)y6e4, (Vector4f)this.s1u[i], (Vector4f)this.s1u[i]);
            this.s1u[i].x /= this.s1u[i].w;
            this.s1u[i].y /= this.s1u[i].w;
            this.s1u[i].z /= this.s1u[i].w;
            this.s1u[i].w = 1.0f;
            if (n2 == 0) continue;
        }
    }

    public Vector3f di3(i2h i2h2, double d) {
        float f = (float)((double)i2h2.j25 + (double)(i2h2.y2i - i2h2.j25) * d);
        float f2 = (float)((double)i2h2.p3h + (double)(i2h2.x5k - i2h2.p3h) * d);
        if (c05.vz1().oxn.i_y == 2) {
            f += 180.0f;
        }
        float f3 = fe6.ssk(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = fe6.rtn(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -fe6.ssk(-f * ((float)Math.PI / 180));
        float f6 = fe6.rtn(-f * ((float)Math.PI / 180));
        return new Vector3f(f4 * f5, f6, f3 * f5);
    }

    public int g_w(w51 w512, double d, int n, i2h i2h2) {
        int n2;
        block66: {
            int n3;
            long l;
            block67: {
                int n4;
                block64: {
                    block65: {
                        block61: {
                            int n5;
                            int n6;
                            int n7;
                            block59: {
                                block60: {
                                    int n8;
                                    int n9;
                                    block57: {
                                        block58: {
                                            int n10;
                                            block55: {
                                                block56: {
                                                    int n11;
                                                    int n12;
                                                    block50: {
                                                        block48: {
                                                            block49: {
                                                                block52: {
                                                                    double d2;
                                                                    block51: {
                                                                        l = a ^ 0x1FBC1CA57CC0L;
                                                                        n4 = t9d.b();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    qpm.cng();
                                                                                    if (n4 == 0) break block48;
                                                                                    if (w512 != w51.mem) break block49;
                                                                                }
                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                    throw crp.a(jsonSyntaxException);
                                                                                }
                                                                                n12 = Shaders.isShadowPass;
                                                                                if (n4 == 0) break block50;
                                                                            }
                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                throw crp.a(jsonSyntaxException);
                                                                            }
                                                                            if (n12 != 0) break block49;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                        this.j0u.ba0.qek((String)((Object)crp.a("j", (int)14781, (long)(0x5D241CD8239F9786L ^ l))));
                                                                        double d3 = i2h2.o2v - this.qe9;
                                                                        double d4 = i2h2.kfp - this.tag;
                                                                        double d5 = i2h2.vbd - this.hr6;
                                                                        try {
                                                                            try {
                                                                                double d2 = d3 * d3 + d4 * d4 + d5 * d5 - 1.0;
                                                                                d2 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                                                                                if (n4 == 0) break block51;
                                                                                if (d2 <= 0) break block52;
                                                                            }
                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                throw crp.a(jsonSyntaxException);
                                                                            }
                                                                            this.qe9 = i2h2.o2v;
                                                                            this.tag = i2h2.kfp;
                                                                            this.hr6 = i2h2.vbd;
                                                                            d2 = 0.0;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                    }
                                                                    double d7 = d2;
                                                                    this.atw.clear();
                                                                    for (crp$j3h crp$j3h : this.eq2) {
                                                                        block54: {
                                                                            double d8;
                                                                            block53: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            n12 = crp$j3h.xvr.ltn.g4s(w512) ? 1 : 0;
                                                                                            if (n4 == 0) break block50;
                                                                                            if (n4 == 0) break block53;
                                                                                        }
                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                            throw crp.a(jsonSyntaxException);
                                                                                        }
                                                                                        if (n12 == 0) break block54;
                                                                                    }
                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                        throw crp.a(jsonSyntaxException);
                                                                                    }
                                                                                    d8 = d7++;
                                                                                }
                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                    throw crp.a(jsonSyntaxException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (n4 == 0 || d8 >= 15) break block54;
                                                                                }
                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                    throw crp.a(jsonSyntaxException);
                                                                                }
                                                                                d8 = (double)this.atw.add(crp$j3h.xvr);
                                                                            }
                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                throw crp.a(jsonSyntaxException);
                                                                            }
                                                                        }
                                                                        if (n4 != 0) continue;
                                                                    }
                                                                }
                                                                this.j0u.ba0.uio();
                                                            }
                                                            this.j0u.ba0.qek((String)((Object)crp.a("j", (int)20481, (long)(0x1AA64068C617FE09L ^ l))));
                                                        }
                                                        n12 = 0;
                                                    }
                                                    n3 = n12;
                                                    try {
                                                        n11 = w512 == w51.mem ? 1 : 0;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                    n9 = n11;
                                                    try {
                                                        try {
                                                            n10 = n9;
                                                            if (n4 == 0) break block55;
                                                            if (n10 == 0) break block56;
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw crp.a(jsonSyntaxException);
                                                        }
                                                        n10 = this.eq2.size() - 1;
                                                        break block55;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                }
                                                n10 = 0;
                                            }
                                            n7 = n10;
                                            try {
                                                n8 = n9;
                                                if (n4 == 0) break block57;
                                                if (n8 == 0) break block58;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            n8 = -1;
                                            break block57;
                                        }
                                        n8 = this.eq2.size();
                                    }
                                    n6 = n8;
                                    try {
                                        n5 = n9;
                                        if (n4 == 0) break block59;
                                        if (n5 == 0) break block60;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    n5 = -1;
                                    break block59;
                                }
                                n5 = 1;
                            }
                            int n13 = n5;
                            int n14 = n7;
                            while (n14 != n6) {
                                block62: {
                                    block63: {
                                        kqk kqk2 = ((crp$j3h)this.eq2.get((int)n14)).xvr;
                                        try {
                                            try {
                                                try {
                                                    n2 = kqk2.fw8().jo2(w512) ? 1 : 0;
                                                    if (n4 == 0) break block61;
                                                    if (n4 == 0) break block62;
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw crp.a(jsonSyntaxException);
                                                }
                                                if (n2 != 0) break block63;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            ++n3;
                                            this.f9a.j6c(kqk2, w512);
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                    }
                                    int n15 = n14 = n14 + n13;
                                }
                                if (n4 != 0) continue;
                            }
                            n2 = n3;
                        }
                        try {
                            try {
                                if (n4 == 0) break block64;
                                if (n2 != 0) break block65;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            this.j0u.ba0.uio();
                            return n3;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    n2 = hxt.o2a();
                }
                try {
                    try {
                        try {
                            if (n4 == 0) break block66;
                            if (n2 == 0) break block67;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        n2 = this.j0u.x0p.ndn ? 1 : 0;
                        if (n4 == 0) break block66;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    if (n2 == 0) break block67;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
                hzu.gcp();
            }
            this.j0u.ba0.v2l((String)((Object)crp.a("j", (int)20809, (long)(0x77FB0BB007F7F7FL ^ l))) + (Object)((Object)w512));
            this.m47(w512);
            this.j0u.ba0.uio();
            n2 = n3;
        }
        return n2;
    }

    /*
     * Exception decompiling
     */
    private void m47(w51 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 11[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private void ttj(Iterator iterator) {
        int n = t9d.c();
        while (iterator.hasNext()) {
            ax_ ax_2 = (ax_)iterator.next();
            int n2 = ax_2.y69();
            try {
                if (this.s0f - n2 > 400) {
                    iterator.remove();
                }
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw crp.a(jsonSyntaxException);
            }
            if (n == 0) continue;
        }
    }

    public void dhi() {
        block19: {
            crp crp2;
            block18: {
                int n;
                block16: {
                    int n2;
                    block17: {
                        n2 = t9d.b();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                n = hxt.ly3();
                                                if (n2 == 0) break block16;
                                                if (n == 0) break block17;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            n = Keyboard.isKeyDown((int)61);
                                            if (n2 == 0) break block16;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                        if (n == 0) break block17;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    n = Keyboard.isKeyDown((int)19);
                                    if (n2 == 0) break block16;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                if (n == 0) break block17;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            Shaders.uninit();
                            Shaders.loadShaderPack();
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                    }
                    try {
                        ++this.s0f;
                        crp2 = this;
                        if (n2 == 0) break block18;
                        n = crp2.s0f % 20;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                if (n != 0) break block19;
                crp2 = this;
            }
            crp2.ttj(this.sz2.values().iterator());
        }
    }

    private void _c8() {
        block31: {
            int n;
            block32: {
                boolean bl;
                int n2;
                block30: {
                    n2 = t9d.c();
                    try {
                        try {
                            bl = hxt.imn();
                            if (n2 != 0) break block30;
                            if (!bl) break block31;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        hzu.gcp();
                        hzu.vtj();
                        hzu.spd();
                        hzu.u39(770, 771, 1, 0);
                        qpm.cng();
                        bl = false;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                hzu.jun(bl);
                this.nr3.anl(kr7);
                jom jom2 = jom.yut();
                q3g q3g2 = jom2.zuq();
                int n3 = 0;
                while (n3 < 6) {
                    block42: {
                        int n4;
                        int n5;
                        int n6;
                        block43: {
                            int n7;
                            block41: {
                                int n8;
                                block39: {
                                    block40: {
                                        block37: {
                                            block38: {
                                                block35: {
                                                    block36: {
                                                        block33: {
                                                            block34: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            hzu.dp2();
                                                                            n = n3;
                                                                            if (n2 != 0) break block32;
                                                                            n8 = 1;
                                                                            if (n2 != 0) break block33;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                        if (n != n8) break block34;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                    hzu.a2h(90.0f, 1.0f, 0.0f, 0.0f);
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                            }
                                                            n7 = n3;
                                                            n8 = 2;
                                                        }
                                                        try {
                                                            try {
                                                                if (n2 != 0) break block35;
                                                                if (n7 != n8) break block36;
                                                            }
                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                throw crp.a(jsonSyntaxException);
                                                            }
                                                            hzu.a2h(-90.0f, 1.0f, 0.0f, 0.0f);
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw crp.a(jsonSyntaxException);
                                                        }
                                                    }
                                                    n7 = n3;
                                                    n8 = 3;
                                                }
                                                try {
                                                    try {
                                                        if (n2 != 0) break block37;
                                                        if (n7 != n8) break block38;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                    hzu.a2h(180.0f, 1.0f, 0.0f, 0.0f);
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw crp.a(jsonSyntaxException);
                                                }
                                            }
                                            n7 = n3;
                                            n8 = 4;
                                        }
                                        try {
                                            try {
                                                if (n2 != 0) break block39;
                                                if (n7 != n8) break block40;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            hzu.a2h(90.0f, 0.0f, 0.0f, 1.0f);
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                    }
                                    try {
                                        n7 = n3;
                                        if (n2 != 0) break block41;
                                        n8 = 5;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                }
                                try {
                                    if (n7 == n8) {
                                        hzu.a2h(-90.0f, 0.0f, 0.0f, 1.0f);
                                    }
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                q3g2.ezr(7, gnl.rad);
                                n7 = 40;
                            }
                            n6 = n7;
                            n5 = 40;
                            n4 = 40;
                            try {
                                if (n2 != 0) break block42;
                                if (!hxt.xe2()) break block43;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            fqr fqr2 = new fqr((double)n6 / 255.0, (double)n5 / 255.0, (double)n4 / 255.0);
                            fqr2 = CustomColors.getWorldSkyColor(fqr2, this.t6z, this.j0u.nsd(), 0.0f);
                            n6 = (int)(fqr2.lvi * 255.0);
                            n5 = (int)(fqr2.gn5 * 255.0);
                            n4 = (int)(fqr2.bn2 * 255.0);
                        }
                        q3g2.g5o(-100.0, -100.0, -100.0).h0a(0.0, 0.0).fje(n6, n5, n4, 255).pzw();
                        q3g2.g5o(-100.0, -100.0, 100.0).h0a(0.0, 16.0).fje(n6, n5, n4, 255).pzw();
                        q3g2.g5o(100.0, -100.0, 100.0).h0a(16.0, 16.0).fje(n6, n5, n4, 255).pzw();
                        q3g2.g5o(100.0, -100.0, -100.0).h0a(16.0, 0.0).fje(n6, n5, n4, 255).pzw();
                        jom2.q7g();
                        hzu.x3w();
                        ++n3;
                    }
                    if (n2 == 0) continue;
                }
                n = 1;
            }
            hzu.jun(n != 0);
            hzu.rqj();
            hzu.if9();
            hzu.ux6();
        }
    }

    public void j2_(float f, int n) {
        block132: {
            boolean bl;
            block185: {
                block186: {
                    int n2;
                    block181: {
                        boolean bl2;
                        block182: {
                            int n3;
                            block183: {
                                block179: {
                                    double d;
                                    block180: {
                                        block178: {
                                            double d2;
                                            float f2;
                                            float f3;
                                            float f4;
                                            block172: {
                                                block173: {
                                                    float f5;
                                                    float f6;
                                                    float f7;
                                                    q3g q3g2;
                                                    jom jom2;
                                                    block176: {
                                                        int n4;
                                                        block174: {
                                                            block171: {
                                                                float f8;
                                                                block169: {
                                                                    block170: {
                                                                        block165: {
                                                                            block166: {
                                                                                int n5;
                                                                                block167: {
                                                                                    boolean bl3;
                                                                                    float f9;
                                                                                    block163: {
                                                                                        block164: {
                                                                                            int n6;
                                                                                            int n7;
                                                                                            float f10;
                                                                                            block161: {
                                                                                                block162: {
                                                                                                    float f11;
                                                                                                    block160: {
                                                                                                        boolean bl4;
                                                                                                        block158: {
                                                                                                            block159: {
                                                                                                                boolean bl5;
                                                                                                                block156: {
                                                                                                                    block157: {
                                                                                                                        block148: {
                                                                                                                            block146: {
                                                                                                                                block147: {
                                                                                                                                    block155: {
                                                                                                                                        int n8;
                                                                                                                                        float[] fArray;
                                                                                                                                        block153: {
                                                                                                                                            float f12;
                                                                                                                                            block154: {
                                                                                                                                                float f13;
                                                                                                                                                block151: {
                                                                                                                                                    block152: {
                                                                                                                                                        boolean bl6;
                                                                                                                                                        block149: {
                                                                                                                                                            block150: {
                                                                                                                                                                boolean bl7;
                                                                                                                                                                block144: {
                                                                                                                                                                    block145: {
                                                                                                                                                                        block140: {
                                                                                                                                                                            block141: {
                                                                                                                                                                                int n9;
                                                                                                                                                                                block142: {
                                                                                                                                                                                    block138: {
                                                                                                                                                                                        block139: {
                                                                                                                                                                                            block136: {
                                                                                                                                                                                                block137: {
                                                                                                                                                                                                    block134: {
                                                                                                                                                                                                        block135: {
                                                                                                                                                                                                            Object object;
                                                                                                                                                                                                            boolean bl8;
                                                                                                                                                                                                            block133: {
                                                                                                                                                                                                                block130: {
                                                                                                                                                                                                                    block128: {
                                                                                                                                                                                                                        upn upn2;
                                                                                                                                                                                                                        block187: {
                                                                                                                                                                                                                            block129: {
                                                                                                                                                                                                                                upn upn3;
                                                                                                                                                                                                                                n2 = t9d.b();
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    bl8 = Reflector.ForgeWorldProvider_getSkyRenderer.exists();
                                                                                                                                                                                                                                    if (n2 == 0) break block128;
                                                                                                                                                                                                                                    if (!bl8) break block129;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                upn2 = upn3 = this.j0u.tij.vzz;
                                                                                                                                                                                                                                if (n2 != 0) {
                                                                                                                                                                                                                                    object = Reflector.call(upn2, Reflector.ForgeWorldProvider_getSkyRenderer, new Object[0]);
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        if (object != null) {
                                                                                                                                                                                                                                            Reflector.callVoid(object, Reflector.IRenderHandler_render, new Object[]{Float.valueOf(f), this.t6z, this.j0u});
                                                                                                                                                                                                                                            return;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                break block187;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            upn2 = this.j0u.tij.vzz;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        bl8 = upn2.gs_();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        block131: {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    if (n2 == 0) break block130;
                                                                                                                                                                                                                                    if (!bl8) break block131;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                this._c8();
                                                                                                                                                                                                                                if (n2 != 0) break block132;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        bl8 = this.j0u.tij.vzz.cws();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        if (n2 == 0) break block133;
                                                                                                                                                                                                                        if (!bl8) break block132;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    hzu.m_1();
                                                                                                                                                                                                                    bl8 = hxt.ly3();
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            bl2 = bl8;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (bl2) {
                                                                                                                                                                                                                    Shaders.disableTexture2D();
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            object = this.t6z.ez1(this.j0u.nsd(), f);
                                                                                                                                                                                                            Object object2 = CustomColors.getSkyColor((fqr)object, this.j0u.tij, this.j0u.nsd().o2v, this.j0u.nsd().kfp + 1.0, this.j0u.nsd().vbd);
                                                                                                                                                                                                            if (n2 != 0) {
                                                                                                                                                                                                                object = object2;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    if (bl2) {
                                                                                                                                                                                                                        Shaders.setSkyColor((fqr)object);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                object2 = object;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            f4 = (float)((fqr)object2).lvi;
                                                                                                                                                                                                            f3 = (float)((fqr)object).gn5;
                                                                                                                                                                                                            f2 = (float)((fqr)object).bn2;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (n2 == 0) break block134;
                                                                                                                                                                                                                if (n == 2) break block135;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            float f14 = (f4 * 30.0f + f3 * 59.0f + f2 * 11.0f) / 100.0f;
                                                                                                                                                                                                            float f15 = (f4 * 30.0f + f3 * 70.0f) / 100.0f;
                                                                                                                                                                                                            float f16 = (f4 * 30.0f + f2 * 70.0f) / 100.0f;
                                                                                                                                                                                                            f4 = f14;
                                                                                                                                                                                                            f3 = f15;
                                                                                                                                                                                                            f2 = f16;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        hzu.oxa(f4, f3, f2);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    jom2 = jom.yut();
                                                                                                                                                                                                    q3g2 = jom2.zuq();
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        hzu.jun(false);
                                                                                                                                                                                                        hzu.xmh();
                                                                                                                                                                                                        bl7 = bl2;
                                                                                                                                                                                                        if (n2 == 0) break block136;
                                                                                                                                                                                                        if (!bl7) break block137;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    Shaders.enableFog();
                                                                                                                                                                                                }
                                                                                                                                                                                                hzu.oxa(f4, f3, f2);
                                                                                                                                                                                                bl7 = bl2;
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (n2 == 0) break block138;
                                                                                                                                                                                                if (!bl7) break block139;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                            }
                                                                                                                                                                                            Shaders.preSkyList();
                                                                                                                                                                                        }
                                                                                                                                                                                        bl7 = hxt.imn();
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        block143: {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (n2 == 0) break block140;
                                                                                                                                                                                                            if (!bl7) break block141;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n9 = this.emi;
                                                                                                                                                                                                        if (n2 == 0) break block142;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (n9 == 0) break block143;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                }
                                                                                                                                                                                                this.o50.qez();
                                                                                                                                                                                                GL11.glEnableClientState((int)32884);
                                                                                                                                                                                                GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                                                                                                                                                                                                this.o50.stg(7);
                                                                                                                                                                                                this.o50.hk8();
                                                                                                                                                                                                GL11.glDisableClientState((int)32884);
                                                                                                                                                                                                if (n2 != 0) break block141;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        n9 = this.ul_;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                hzu.bcf(n9);
                                                                                                                                                                            }
                                                                                                                                                                            hzu.gcp();
                                                                                                                                                                            bl7 = bl2;
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            if (n2 == 0) break block144;
                                                                                                                                                                            if (!bl7) break block145;
                                                                                                                                                                        }
                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                        }
                                                                                                                                                                        Shaders.disableFog();
                                                                                                                                                                    }
                                                                                                                                                                    hzu.vtj();
                                                                                                                                                                    hzu.spd();
                                                                                                                                                                    bl7 = 770 != 0;
                                                                                                                                                                }
                                                                                                                                                                hzu.u39(bl7 ? 1 : 0, 771, 1, 0);
                                                                                                                                                                qpm.cng();
                                                                                                                                                                fArray = this.t6z.vzz.sjt(this.t6z.icw(f), f);
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    if (n2 == 0) break block146;
                                                                                                                                                                                    if (fArray == null) break block147;
                                                                                                                                                                                }
                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                }
                                                                                                                                                                                bl5 = hxt.kbg();
                                                                                                                                                                                if (n2 == 0) break block148;
                                                                                                                                                                            }
                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                            }
                                                                                                                                                                            if (!bl5) break block147;
                                                                                                                                                                        }
                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                        }
                                                                                                                                                                        hzu.m_1();
                                                                                                                                                                        bl6 = bl2;
                                                                                                                                                                        if (n2 == 0) break block149;
                                                                                                                                                                    }
                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                    }
                                                                                                                                                                    if (!bl6) break block150;
                                                                                                                                                                }
                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                }
                                                                                                                                                                Shaders.disableTexture2D();
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                hzu.nn9(7425);
                                                                                                                                                                hzu.dp2();
                                                                                                                                                                hzu.a2h(90.0f, 1.0f, 0.0f, 0.0f);
                                                                                                                                                                f13 = fe6.rtn(this.t6z.v6p(f));
                                                                                                                                                                if (n2 == 0) break block151;
                                                                                                                                                                float f14 = f13 - 0.0f;
                                                                                                                                                                bl6 = (f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) != 0;
                                                                                                                                                            }
                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (bl6 >= false) break block152;
                                                                                                                                                            f13 = 180.0f;
                                                                                                                                                            break block151;
                                                                                                                                                        }
                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    f13 = 0.0f;
                                                                                                                                                }
                                                                                                                                                hzu.a2h(f13, 0.0f, 0.0f, 1.0f);
                                                                                                                                                hzu.a2h(90.0f, 0.0f, 0.0f, 1.0f);
                                                                                                                                                f9 = fArray[0];
                                                                                                                                                f10 = fArray[1];
                                                                                                                                                f12 = fArray[2];
                                                                                                                                                try {
                                                                                                                                                    n8 = n;
                                                                                                                                                    if (n2 == 0) break block153;
                                                                                                                                                    if (n8 == 2) break block154;
                                                                                                                                                }
                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                }
                                                                                                                                                float f18 = (f9 * 30.0f + f10 * 59.0f + f12 * 11.0f) / 100.0f;
                                                                                                                                                float f19 = (f9 * 30.0f + f10 * 70.0f) / 100.0f;
                                                                                                                                                f7 = (f9 * 30.0f + f12 * 70.0f) / 100.0f;
                                                                                                                                                f9 = f18;
                                                                                                                                                f10 = f19;
                                                                                                                                                f12 = f7;
                                                                                                                                            }
                                                                                                                                            q3g2.ezr(6, gnl.gec);
                                                                                                                                            q3g2.g5o(0.0, 100.0, 0.0).gs4(f9, f10, f12, fArray[3]).pzw();
                                                                                                                                            n8 = 16;
                                                                                                                                        }
                                                                                                                                        n7 = n8;
                                                                                                                                        for (n6 = 0; n6 <= 16; ++n6) {
                                                                                                                                            f7 = (float)n6 * (float)Math.PI * 2.0f / 16.0f;
                                                                                                                                            f6 = fe6.rtn(f7);
                                                                                                                                            f5 = fe6.ssk(f7);
                                                                                                                                            try {
                                                                                                                                                q3g2.g5o(f6 * 120.0f, f5 * 120.0f, -f5 * 40.0f * fArray[3]).gs4(fArray[0], fArray[1], fArray[2], 0.0f).pzw();
                                                                                                                                                if (n2 != 0) {
                                                                                                                                                    if (n2 != 0) continue;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break block155;
                                                                                                                                            }
                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        jom2.q7g();
                                                                                                                                        hzu.x3w();
                                                                                                                                    }
                                                                                                                                    hzu.nn9(7424);
                                                                                                                                }
                                                                                                                                hzu.rqj();
                                                                                                                            }
                                                                                                                            bl5 = bl2;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (n2 == 0) break block156;
                                                                                                                            if (!bl5) break block157;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                        }
                                                                                                                        Shaders.enableTexture2D();
                                                                                                                    }
                                                                                                                    bl5 = 770 != 0;
                                                                                                                }
                                                                                                                hzu.u39(bl5 ? 1 : 0, 1, 1, 0);
                                                                                                                hzu.dp2();
                                                                                                                f9 = 1.0f - this.t6z.bne(f);
                                                                                                                try {
                                                                                                                    hzu.wn0(1.0f, 1.0f, 1.0f, f9);
                                                                                                                    hzu.a2h(-90.0f, 0.0f, 1.0f, 0.0f);
                                                                                                                    CustomSky.renderSky(this.t6z, this.nr3, f);
                                                                                                                    bl4 = bl2;
                                                                                                                    if (n2 == 0) break block158;
                                                                                                                    if (!bl4) break block159;
                                                                                                                }
                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                }
                                                                                                                Shaders.preCelestialRotate();
                                                                                                            }
                                                                                                            try {
                                                                                                                f11 = this.t6z.icw(f) * 360.0f;
                                                                                                                if (n2 == 0) break block160;
                                                                                                                hzu.a2h(f11, 1.0f, 0.0f, 0.0f);
                                                                                                                bl4 = bl2;
                                                                                                            }
                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                            }
                                                                                                        }
                                                                                                        if (bl4) {
                                                                                                            Shaders.postCelestialRotate();
                                                                                                        }
                                                                                                        f11 = 30.0f;
                                                                                                    }
                                                                                                    f10 = f11;
                                                                                                    try {
                                                                                                        try {
                                                                                                            bl3 = hxt.p9a();
                                                                                                            if (n2 == 0) break block161;
                                                                                                            if (!bl3) break block162;
                                                                                                        }
                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                        }
                                                                                                        this.nr3.anl(jnk);
                                                                                                        q3g2.ezr(7, gnl._r5);
                                                                                                        q3g2.g5o(-f10, 100.0, -f10).h0a(0.0, 0.0).pzw();
                                                                                                        q3g2.g5o(f10, 100.0, -f10).h0a(1.0, 0.0).pzw();
                                                                                                        q3g2.g5o(f10, 100.0, f10).h0a(1.0, 1.0).pzw();
                                                                                                        q3g2.g5o(-f10, 100.0, f10).h0a(0.0, 1.0).pzw();
                                                                                                        jom2.q7g();
                                                                                                    }
                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                    }
                                                                                                }
                                                                                                f10 = 20.0f;
                                                                                                bl3 = hxt.jt1();
                                                                                            }
                                                                                            try {
                                                                                                if (n2 == 0) break block163;
                                                                                                if (!bl3) break block164;
                                                                                            }
                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                throw crp.a(jsonSyntaxException);
                                                                                            }
                                                                                            this.nr3.anl(zbm);
                                                                                            int n10 = this.t6z._mu();
                                                                                            n7 = n10 % 4;
                                                                                            n6 = n10 / 4 % 2;
                                                                                            f7 = (float)(n7 + 0) / 4.0f;
                                                                                            f6 = (float)(n6 + 0) / 2.0f;
                                                                                            f5 = (float)(n7 + 1) / 4.0f;
                                                                                            float f20 = (float)(n6 + 1) / 2.0f;
                                                                                            q3g2.ezr(7, gnl._r5);
                                                                                            q3g2.g5o(-f10, -100.0, f10).h0a(f5, f20).pzw();
                                                                                            q3g2.g5o(f10, -100.0, f10).h0a(f7, f20).pzw();
                                                                                            q3g2.g5o(f10, -100.0, -f10).h0a(f7, f6).pzw();
                                                                                            q3g2.g5o(-f10, -100.0, -f10).h0a(f5, f6).pzw();
                                                                                            jom2.q7g();
                                                                                        }
                                                                                        hzu.m_1();
                                                                                        bl3 = bl2;
                                                                                    }
                                                                                    if (bl3) {
                                                                                        Shaders.disableTexture2D();
                                                                                    }
                                                                                    float f21 = this.t6z.qp_(f) * f9;
                                                                                    try {
                                                                                        block168: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            float f8 = f21 - 0.0f;
                                                                                                                            f8 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                                                                                                            if (n2 == 0) break block165;
                                                                                                                            if (f8 <= 0) break block166;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                        }
                                                                                                                        f8 = (float)hxt.ose();
                                                                                                                        if (n2 == 0) break block165;
                                                                                                                    }
                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                    }
                                                                                                                    if (f8 == false) break block166;
                                                                                                                }
                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                }
                                                                                                                f8 = (float)CustomSky.hasSkyLayers(this.t6z);
                                                                                                                if (n2 == 0) break block165;
                                                                                                            }
                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                            }
                                                                                                            if (f8 != false) break block166;
                                                                                                        }
                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                        }
                                                                                                        hzu.wn0(f21, f21, f21, f21);
                                                                                                        n5 = this.emi;
                                                                                                        if (n2 == 0) break block167;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                    }
                                                                                                    if (n5 == 0) break block168;
                                                                                                }
                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                }
                                                                                                this.uu2.qez();
                                                                                                GL11.glEnableClientState((int)32884);
                                                                                                GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                                                                                                this.uu2.stg(7);
                                                                                                this.uu2.hk8();
                                                                                                GL11.glDisableClientState((int)32884);
                                                                                                if (n2 != 0) break block166;
                                                                                            }
                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                throw crp.a(jsonSyntaxException);
                                                                                            }
                                                                                        }
                                                                                        n5 = this.jsw;
                                                                                    }
                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                        throw crp.a(jsonSyntaxException);
                                                                                    }
                                                                                }
                                                                                hzu.bcf(n5);
                                                                            }
                                                                            hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                                                                            hzu.ux6();
                                                                            hzu.if9();
                                                                            hzu.xmh();
                                                                            f8 = (float)bl2;
                                                                        }
                                                                        try {
                                                                            if (n2 == 0) break block169;
                                                                            if (f8 == false) break block170;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                        Shaders.enableFog();
                                                                    }
                                                                    try {
                                                                        hzu.x3w();
                                                                        hzu.m_1();
                                                                        if (n2 == 0) break block171;
                                                                        f8 = (float)bl2;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                }
                                                                if (f8 != false) {
                                                                    Shaders.disableTexture2D();
                                                                }
                                                                hzu.oxa(0.0f, 0.0f, 0.0f);
                                                            }
                                                            d = this.j0u.vg8.tib((float)f).gn5 - this.t6z.ss4();
                                                            try {
                                                                block175: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    double d2 = d - 0.0;
                                                                                    d2 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                                                                    if (n2 == 0) break block172;
                                                                                    if (d2 >= 0) break block173;
                                                                                }
                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                    throw crp.a(jsonSyntaxException);
                                                                                }
                                                                                hzu.dp2();
                                                                                hzu.a4k(0.0f, 12.0f, 0.0f);
                                                                                n4 = this.emi;
                                                                                if (n2 == 0) break block174;
                                                                            }
                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                throw crp.a(jsonSyntaxException);
                                                                            }
                                                                            if (n4 == 0) break block175;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                        this.i65.qez();
                                                                        GL11.glEnableClientState((int)32884);
                                                                        GL11.glVertexPointer((int)3, (int)5126, (int)12, (long)0L);
                                                                        this.i65.stg(7);
                                                                        this.i65.hk8();
                                                                        GL11.glDisableClientState((int)32884);
                                                                        if (n2 != 0) break block176;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                }
                                                                n4 = this.cj4;
                                                            }
                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                throw crp.a(jsonSyntaxException);
                                                            }
                                                        }
                                                        hzu.bcf(n4);
                                                    }
                                                    hzu.x3w();
                                                    f7 = 1.0f;
                                                    f6 = -((float)(d + 65.0));
                                                    f5 = -1.0f;
                                                    q3g2.ezr(7, gnl.gec);
                                                    q3g2.g5o(-1.0, f6, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, f6, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, -1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, -1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, -1.0, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, -1.0, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, f6, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, f6, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, -1.0, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, -1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, f6, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, f6, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, f6, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, f6, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, -1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, -1.0, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, -1.0, -1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(-1.0, -1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, -1.0, 1.0).fje(0, 0, 0, 255).pzw();
                                                    q3g2.g5o(1.0, -1.0, -1.0).fje(0, 0, 0, 255).pzw();
                                                    jom2.q7g();
                                                }
                                                d2 = (double)this.t6z.vzz.t8l();
                                            }
                                            try {
                                                block177: {
                                                    try {
                                                        if (d2 == false) break block177;
                                                        hzu.oxa(f4 * 0.2f + 0.04f, f3 * 0.2f + 0.04f, f2 * 0.6f + 0.1f);
                                                        if (n2 != 0) break block178;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                }
                                                hzu.oxa(f4, f3, f2);
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                        }
                                        try {
                                            try {
                                                bl = this.j0u.oxn.gcj;
                                                if (n2 == 0) break block179;
                                                if (bl > 4 != 0) break block180;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            hzu.oxa(this.j0u.x0p.h0i, this.j0u.x0p.qy4, this.j0u.x0p.ai5);
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                    }
                                    hzu.dp2();
                                    hzu.a4k(0.0f, -((float)(d - 16.0)), 0.0f);
                                    bl = hxt.imn();
                                }
                                try {
                                    block184: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n2 == 0) break block181;
                                                        if (!bl) break block182;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                    n3 = this.emi;
                                                    if (n2 == 0) break block183;
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw crp.a(jsonSyntaxException);
                                                }
                                                if (n3 == 0) break block184;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            this.i65.qez();
                                            hzu.k4h(32884);
                                            hzu.x4r(3, 5126, 12, 0);
                                            this.i65.stg(7);
                                            this.i65.hk8();
                                            hzu.cwt(32884);
                                            if (n2 != 0) break block182;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                    }
                                    n3 = this.cj4;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                            }
                            hzu.bcf(n3);
                        }
                        hzu.x3w();
                        hzu.rqj();
                        bl = bl2;
                    }
                    try {
                        if (n2 == 0) break block185;
                        if (!bl) break block186;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    Shaders.enableTexture2D();
                }
                bl = true;
            }
            hzu.jun(bl);
        }
    }

    public void pui(float f, int n) {
        block27: {
            int n2;
            block38: {
                block34: {
                    CloudRenderer cloudRenderer;
                    block35: {
                        block36: {
                            float f2;
                            float f3;
                            float f4;
                            float f5;
                            q3g q3g2;
                            jom jom2;
                            float f6;
                            int n3;
                            block37: {
                                block33: {
                                    boolean bl;
                                    block31: {
                                        block32: {
                                            block30: {
                                                block28: {
                                                    upn upn2;
                                                    block40: {
                                                        block29: {
                                                            upn upn3;
                                                            block26: {
                                                                n3 = t9d.b();
                                                                try {
                                                                    try {
                                                                        bl = hxt.mdq();
                                                                        if (n3 == 0) break block26;
                                                                        if (bl) break block27;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                    bl = Reflector.ForgeWorldProvider_getCloudRenderer.exists();
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                            }
                                                            try {
                                                                if (n3 == 0) break block28;
                                                                if (!bl) break block29;
                                                            }
                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                throw crp.a(jsonSyntaxException);
                                                            }
                                                            upn2 = upn3 = this.j0u.tij.vzz;
                                                            if (n3 != 0) {
                                                                Object object = Reflector.call(upn2, Reflector.ForgeWorldProvider_getCloudRenderer, new Object[0]);
                                                                try {
                                                                    if (object != null) {
                                                                        Reflector.callVoid(object, Reflector.IRenderHandler_render, new Object[]{Float.valueOf(f), this.t6z, this.j0u});
                                                                        return;
                                                                    }
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                            }
                                                            break block40;
                                                        }
                                                        upn2 = this.j0u.tij.vzz;
                                                    }
                                                    bl = upn2.cws();
                                                }
                                                try {
                                                    if (n3 == 0) break block30;
                                                    if (!bl) break block27;
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw crp.a(jsonSyntaxException);
                                                }
                                                bl = hxt.ly3();
                                            }
                                            try {
                                                if (n3 == 0) break block31;
                                                if (!bl) break block32;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            Shaders.beginClouds();
                                        }
                                        bl = hxt.heh();
                                    }
                                    try {
                                        if (!bl) break block33;
                                        this.wj5(f, n);
                                        if (n3 != 0) break block34;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                }
                                float f7 = f;
                                f = 0.0f;
                                hzu.o1b();
                                f6 = (float)(this.j0u.nsd().c54 + (this.j0u.nsd().kfp - this.j0u.nsd().c54) * (double)f);
                                int n4 = 32;
                                int n5 = 8;
                                jom2 = jom.yut();
                                q3g2 = jom2.zuq();
                                this.nr3.anl(fda);
                                hzu.spd();
                                hzu.u39(770, 771, 1, 0);
                                fqr fqr2 = this.t6z.l86(f);
                                f5 = (float)fqr2.lvi;
                                f4 = (float)fqr2.gn5;
                                f3 = (float)fqr2.bn2;
                                try {
                                    try {
                                        this.sae.prepareToRender(false, this.s0f, f7, fqr2);
                                        cloudRenderer = this.sae;
                                        if (n3 == 0) break block35;
                                        if (!cloudRenderer.shouldUpdateGlList()) break block36;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    this.sae.startUpdateGlList();
                                    if (n == 2) break block37;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                f2 = (f5 * 30.0f + f4 * 59.0f + f3 * 11.0f) / 100.0f;
                                float f8 = (f5 * 30.0f + f4 * 70.0f) / 100.0f;
                                float f9 = (f5 * 30.0f + f3 * 70.0f) / 100.0f;
                                f5 = f2;
                                f4 = f8;
                                f3 = f9;
                            }
                            f2 = 4.8828125E-4f;
                            double d = (float)this.s0f + f;
                            double d2 = this.j0u.nsd().bc1 + (this.j0u.nsd().o2v - this.j0u.nsd().bc1) * (double)f + d * (double)0.03f;
                            double d3 = this.j0u.nsd().a4d + (this.j0u.nsd().vbd - this.j0u.nsd().a4d) * (double)f;
                            int n6 = fe6.jqf(d2 / 2048.0);
                            int n7 = fe6.jqf(d3 / 2048.0);
                            d2 -= (double)(n6 * 2048);
                            d3 -= (double)(n7 * 2048);
                            float f10 = this.t6z.vzz.x66() - f6 + 0.33f;
                            f10 += this.j0u.oxn.dg1 * 128.0f;
                            float f11 = (float)(d2 * 4.8828125E-4);
                            float f12 = (float)(d3 * 4.8828125E-4);
                            q3g2.ezr(7, gnl.rad);
                            int n8 = -256;
                            while (n8 < 256) {
                                block39: {
                                    n2 = -256;
                                    if (n3 == 0) break block38;
                                    for (int i = v905774; i < 256; i += 32) {
                                        try {
                                            q3g2.g5o(n8 + 0, f10, i + 32).h0a((float)(n8 + 0) * 4.8828125E-4f + f11, (float)(i + 32) * 4.8828125E-4f + f12).gs4(f5, f4, f3, 0.8f).pzw();
                                            q3g2.g5o(n8 + 32, f10, i + 32).h0a((float)(n8 + 32) * 4.8828125E-4f + f11, (float)(i + 32) * 4.8828125E-4f + f12).gs4(f5, f4, f3, 0.8f).pzw();
                                            q3g2.g5o(n8 + 32, f10, i + 0).h0a((float)(n8 + 32) * 4.8828125E-4f + f11, (float)(i + 0) * 4.8828125E-4f + f12).gs4(f5, f4, f3, 0.8f).pzw();
                                            q3g2.g5o(n8 + 0, f10, i + 0).h0a((float)(n8 + 0) * 4.8828125E-4f + f11, (float)(i + 0) * 4.8828125E-4f + f12).gs4(f5, f4, f3, 0.8f).pzw();
                                            if (n3 != 0) {
                                                if (n3 != 0) continue;
                                                break;
                                            }
                                            break block39;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                    }
                                    n8 += 32;
                                }
                                if (n3 != 0) continue;
                            }
                            jom2.q7g();
                            this.sae.endUpdateGlList();
                        }
                        cloudRenderer = this.sae;
                    }
                    cloudRenderer.renderGlList();
                    hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                    hzu.ux6();
                    hzu.gp4();
                }
                n2 = hxt.ly3();
            }
            if (n2 != 0) {
                Shaders.endClouds();
            }
        }
    }

    public boolean wdv(double d, double d2, double d3, float f) {
        return false;
    }

    /*
     * Exception decompiling
     */
    private void wj5(float var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
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

    /*
     * Unable to fully structure code
     */
    public void rrc(long var1_1) {
        block43: {
            block42: {
                block40: {
                    block41: {
                        block39: {
                            block36: {
                                block37: {
                                    var1_1 = (long)((double)var1_1 + 1.0E8);
                                    this.jli |= this.isn.n67(var1_1);
                                    var3_2 = t9d.c();
                                    try {
                                        v0 = this.th7.size();
                                        if (var3_2 != 0) break block36;
                                        if (v0 <= 0) break block37;
                                    }
                                    catch (JsonSyntaxException v1) {
                                        throw crp.a(v1);
                                    }
                                    var4_3 = this.th7.iterator();
                                    while (var4_3.hasNext()) {
                                        block38: {
                                            var5_5 = (kqk)var4_3.next();
                                            try {
                                                try {
                                                    v0 = (int)this.isn.m52(var5_5);
                                                    if (var3_2 != 0) break block36;
                                                    if (var3_2 != 0) break block38;
                                                }
                                                catch (JsonSyntaxException v2) {
                                                    throw crp.a(v2);
                                                }
                                                if (v0 == 0) {
                                                    break;
                                                }
                                            }
                                            catch (JsonSyntaxException v3) {
                                                throw crp.a(v3);
                                            }
                                            var5_5.sf6(false);
                                            var4_3.remove();
                                            this.l0i.remove(var5_5);
                                            this.atw.remove(var5_5);
                                        }
                                        if (var3_2 == 0) continue;
                                    }
                                }
                                try {
                                    v4 = this.atw;
                                    if (var3_2 != 0) break block39;
                                    v0 = v4.size();
                                }
                                catch (JsonSyntaxException v5) {
                                    throw crp.a(v5);
                                }
                            }
                            try {
                                if (v0 <= 0) break block40;
                                v4 = this.atw;
                            }
                            catch (JsonSyntaxException v6) {
                                throw crp.a(v6);
                            }
                        }
                        var4_3 = v4.iterator();
                        try {
                            try {
                                v7 = var4_3;
                                if (var3_2 != 0) break block41;
                                if (!v7.hasNext()) break block40;
                            }
                            catch (JsonSyntaxException v8) {
                                throw crp.a(v8);
                            }
                            v7 = var4_3.next();
                        }
                        catch (JsonSyntaxException v9) {
                            throw crp.a(v9);
                        }
                    }
                    var5_5 = (kqk)v7;
                    try {
                        if (this.isn.wkc(var5_5)) {
                            var4_3.remove();
                        }
                    }
                    catch (JsonSyntaxException v10) {
                        throw crp.a(v10);
                    }
                }
                var4_4 = 0.0;
                var6_6 = hxt.k45();
                try {
                    try {
                        v11 = this.l0i;
                        if (var3_2 != 0) break block42;
                        if (v11.isEmpty()) break block43;
                    }
                    catch (JsonSyntaxException v12) {
                        throw crp.a(v12);
                    }
                    v11 = this.l0i;
                }
                catch (JsonSyntaxException v13) {
                    throw crp.a(v13);
                }
            }
            var7_7 = v11.iterator();
            while (var7_7.hasNext()) {
                block46: {
                    block45: {
                        block44: {
                            var8_8 = (kqk)var7_7.next();
                            var9_9 = var8_8._sw();
                            try {
                                v14 = var9_9;
                                if (var3_2 != 0) break block44;
                                if (v14) {
                                }
                                ** GOTO lbl103
                            }
                            catch (JsonSyntaxException v15) {
                                throw crp.a(v15);
                            }
                            var10_10 = this.isn.fzf(var8_8);
                            try {
                                if (var3_2 == 0) break block45;
lbl103:
                                // 2 sources

                                v14 = this.isn.m52(var8_8);
                            }
                            catch (JsonSyntaxException v16) {
                                throw crp.a(v16);
                            }
                        }
                        var10_10 = v14;
                    }
                    try {
                        v17 = var10_10;
                        if (var3_2 != 0) break block46;
                        if (!v17) {
                            break;
                        }
                    }
                    catch (JsonSyntaxException v18) {
                        throw crp.a(v18);
                    }
                    var8_8.sf6(false);
                    var7_7.remove();
                    v17 = var9_9;
                }
                if (!v17) {
                    var11_11 = 2.0 * RenderChunkUtils.getRelativeBufferSize(var8_8);
                    var4_4 += var11_11;
                    try {
                        if (var4_4 > (double)var6_6) {
                            break;
                        }
                    }
                    catch (JsonSyntaxException v19) {
                        throw crp.a(v19);
                    }
                }
                if (var3_2 == 0) continue;
            }
        }
    }

    public void byj(i2h i2h2, float f) {
        block42: {
            double d;
            block51: {
                block50: {
                    q3g q3g2;
                    jom jom2;
                    block52: {
                        float f2;
                        double d2;
                        double d3;
                        float f3;
                        double d4;
                        double d5;
                        float f4;
                        int n;
                        w5i w5i2;
                        block48: {
                            double d6;
                            double d7;
                            double d8;
                            block49: {
                                block46: {
                                    double d9;
                                    block45: {
                                        double d10;
                                        block47: {
                                            block43: {
                                                double d11;
                                                block44: {
                                                    double d12;
                                                    double d13;
                                                    block40: {
                                                        jom2 = jom.yut();
                                                        q3g2 = jom2.zuq();
                                                        w5i2 = this.t6z.fve();
                                                        d8 = this.j0u.oxn.gcj * 16;
                                                        n = t9d.c();
                                                        try {
                                                            block41: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            d13 = i2h2.o2v;
                                                                                            d12 = w5i2.mb9() - d8;
                                                                                            if (n != 0) break block40;
                                                                                            if (d13 >= d12) break block41;
                                                                                        }
                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                            throw crp.a(jsonSyntaxException);
                                                                                        }
                                                                                        d13 = i2h2.o2v;
                                                                                        d12 = w5i2.rt1() + d8;
                                                                                        if (n != 0) break block40;
                                                                                    }
                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                        throw crp.a(jsonSyntaxException);
                                                                                    }
                                                                                    if (d13 <= d12) break block41;
                                                                                }
                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                    throw crp.a(jsonSyntaxException);
                                                                                }
                                                                                d13 = i2h2.vbd;
                                                                                d12 = w5i2.ah4() - d8;
                                                                                if (n != 0) break block40;
                                                                            }
                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                throw crp.a(jsonSyntaxException);
                                                                            }
                                                                            if (d13 >= d12) break block41;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                        d13 = i2h2.vbd;
                                                                        d12 = w5i2.jbu() + d8;
                                                                        if (n != 0) break block40;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                    if (!(d13 <= d12)) break block42;
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                            }
                                                            d13 = 1.0;
                                                            d12 = w5i2.uhq(i2h2) / d8;
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw crp.a(jsonSyntaxException);
                                                        }
                                                    }
                                                    double d14 = d13 - d12;
                                                    d14 = Math.pow(d14, 4.0);
                                                    d10 = i2h2.ivp + (i2h2.o2v - i2h2.ivp) * (double)f;
                                                    double d15 = i2h2.c54 + (i2h2.kfp - i2h2.c54) * (double)f;
                                                    d7 = i2h2.e2b + (i2h2.vbd - i2h2.e2b) * (double)f;
                                                    hzu.spd();
                                                    hzu.u39(770, 1, 1, 0);
                                                    this.nr3.anl(s2a);
                                                    hzu.jun(false);
                                                    hzu.dp2();
                                                    int n2 = w5i2.wmn().nqg();
                                                    float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                                                    float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                                                    float f7 = (float)(n2 & 0xFF) / 255.0f;
                                                    hzu.wn0(f5, f6, f7, (float)d14);
                                                    hzu.fex(-3.0f, -3.0f);
                                                    hzu.ktr();
                                                    hzu.fak(516, 0.1f);
                                                    hzu.if9();
                                                    hzu.o1b();
                                                    f4 = (float)(c05.qgs() % 3000L) / 3000.0f;
                                                    float f8 = 0.0f;
                                                    float f9 = 0.0f;
                                                    float f10 = 128.0f;
                                                    q3g2.ezr(7, gnl._r5);
                                                    q3g2.nbz(-d10, -d15, -d7);
                                                    d5 = Math.max((double)fe6.jqf(d7 - d8), w5i2.jbu());
                                                    d4 = Math.min((double)fe6.hxe(d7 + d8), w5i2.ah4());
                                                    try {
                                                        double d16 = d10 - (w5i2.mb9() - d8);
                                                        d = d16 == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                                                        if (n != 0) break block43;
                                                        if (d <= 0) break block44;
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                    f3 = 0.0f;
                                                    d3 = d5;
                                                    while (d3 < d4) {
                                                        d2 = Math.min(1.0, d4 - d3);
                                                        f2 = (float)d2 * 0.5f;
                                                        q3g2.g5o(w5i2.mb9(), 256.0, d3).h0a(f4 + f3, f4 + 0.0f).pzw();
                                                        q3g2.g5o(w5i2.mb9(), 256.0, d3 + d2).h0a(f4 + f2 + f3, f4 + 0.0f).pzw();
                                                        q3g2.g5o(w5i2.mb9(), 0.0, d3 + d2).h0a(f4 + f2 + f3, f4 + 128.0f).pzw();
                                                        q3g2.g5o(w5i2.mb9(), 0.0, d3).h0a(f4 + f3, f4 + 128.0f).pzw();
                                                        d3 += 1.0;
                                                        f3 += 0.5f;
                                                        try {
                                                            if (n == 0) {
                                                                if (n == 0) continue;
                                                                break;
                                                            }
                                                            break block45;
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw crp.a(jsonSyntaxException);
                                                        }
                                                    }
                                                }
                                                d = (d11 = d10 - (w5i2.rt1() + d8)) == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                            }
                                            try {
                                                if (n != 0) break block46;
                                                if (d >= 0) break block47;
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                            f3 = 0.0f;
                                            d3 = d5;
                                            while (d3 < d4) {
                                                d2 = Math.min(1.0, d4 - d3);
                                                f2 = (float)d2 * 0.5f;
                                                q3g2.g5o(w5i2.rt1(), 256.0, d3).h0a(f4 + f3, f4 + 0.0f).pzw();
                                                q3g2.g5o(w5i2.rt1(), 256.0, d3 + d2).h0a(f4 + f2 + f3, f4 + 0.0f).pzw();
                                                q3g2.g5o(w5i2.rt1(), 0.0, d3 + d2).h0a(f4 + f2 + f3, f4 + 128.0f).pzw();
                                                q3g2.g5o(w5i2.rt1(), 0.0, d3).h0a(f4 + f3, f4 + 128.0f).pzw();
                                                d3 += 1.0;
                                                f3 += 0.5f;
                                                try {
                                                    if (n == 0) {
                                                        if (n == 0) continue;
                                                        break;
                                                    }
                                                    break block45;
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw crp.a(jsonSyntaxException);
                                                }
                                            }
                                        }
                                        d5 = Math.max((double)fe6.jqf(d10 - d8), w5i2.rt1());
                                        d4 = Math.min((double)fe6.hxe(d10 + d8), w5i2.mb9());
                                    }
                                    d = (d9 = d7 - (w5i2.ah4() - d8)) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                                }
                                try {
                                    if (n != 0) break block48;
                                    if (d <= 0) break block49;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                f3 = 0.0f;
                                d3 = d5;
                                while (d3 < d4) {
                                    d2 = Math.min(1.0, d4 - d3);
                                    f2 = (float)d2 * 0.5f;
                                    q3g2.g5o(d3, 256.0, w5i2.ah4()).h0a(f4 + f3, f4 + 0.0f).pzw();
                                    q3g2.g5o(d3 + d2, 256.0, w5i2.ah4()).h0a(f4 + f2 + f3, f4 + 0.0f).pzw();
                                    q3g2.g5o(d3 + d2, 0.0, w5i2.ah4()).h0a(f4 + f2 + f3, f4 + 128.0f).pzw();
                                    q3g2.g5o(d3, 0.0, w5i2.ah4()).h0a(f4 + f3, f4 + 128.0f).pzw();
                                    d3 += 1.0;
                                    f3 += 0.5f;
                                    try {
                                        if (n == 0) {
                                            if (n == 0) continue;
                                            break;
                                        }
                                        break block50;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                }
                            }
                            d = (d6 = d7 - (w5i2.jbu() + d8)) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                        }
                        try {
                            if (n != 0) break block51;
                            if (d >= 0) break block52;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        f3 = 0.0f;
                        d3 = d5;
                        while (d3 < d4) {
                            d2 = Math.min(1.0, d4 - d3);
                            f2 = (float)d2 * 0.5f;
                            q3g2.g5o(d3, 256.0, w5i2.jbu()).h0a(f4 + f3, f4 + 0.0f).pzw();
                            q3g2.g5o(d3 + d2, 256.0, w5i2.jbu()).h0a(f4 + f2 + f3, f4 + 0.0f).pzw();
                            q3g2.g5o(d3 + d2, 0.0, w5i2.jbu()).h0a(f4 + f2 + f3, f4 + 128.0f).pzw();
                            q3g2.g5o(d3, 0.0, w5i2.jbu()).h0a(f4 + f3, f4 + 128.0f).pzw();
                            d3 += 1.0;
                            f3 += 0.5f;
                            try {
                                if (n == 0) {
                                    if (n == 0) continue;
                                    break;
                                }
                                break block50;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                        }
                    }
                    jom2.q7g();
                    q3g2.nbz(0.0, 0.0, 0.0);
                    hzu.gp4();
                    hzu.vtj();
                    hzu.fex(0.0f, 0.0f);
                    hzu.q6d();
                    hzu.if9();
                    hzu.u39(770, 771, 1, 0);
                    hzu.ux6();
                    hzu.x3w();
                }
                d = 1.0;
            }
            hzu.jun((boolean)d);
        }
    }

    private void g2q() {
        try {
            hzu.u39(774, 768, 1, 0);
            hzu.spd();
            hzu.wn0(1.0f, 1.0f, 1.0f, 0.5f);
            hzu.fex(-1.0f, -10.0f);
            hzu.ktr();
            hzu.fak(516, 0.1f);
            hzu.if9();
            hzu.dp2();
            if (hxt.ly3()) {
                ShadersRender.beginBlockDamage();
            }
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            throw crp.a(jsonSyntaxException);
        }
    }

    private void zwv() {
        try {
            hzu.vtj();
            hzu.fex(0.0f, 0.0f);
            hzu.q6d();
            hzu.if9();
            hzu.jun(true);
            hzu.x3w();
            if (hxt.ly3()) {
                ShadersRender.endBlockDamage();
            }
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            throw crp.a(jsonSyntaxException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void aai(jom var1_1, q3g var2_2, i2h var3_3, float var4_4) {
        block56: {
            block57: {
                block55: {
                    var6_5 = var3_3.ivp + (var3_3.o2v - var3_3.ivp) * (double)var4_4;
                    var8_6 = var3_3.c54 + (var3_3.kfp - var3_3.c54) * (double)var4_4;
                    var10_7 = var3_3.e2b + (var3_3.vbd - var3_3.e2b) * (double)var4_4;
                    var5_8 = t9d.c();
                    try {
                        try {
                            v0 = this.sz2;
                            if (var5_8 != 0) break block55;
                            if (v0.isEmpty()) break block56;
                        }
                        catch (JsonSyntaxException v1) {
                            throw crp.a(v1);
                        }
                        this.nr3.anl(yu2.nu_);
                        this.g2q();
                        var2_2.ezr(7, gnl.n6w);
                        var2_2.nbz(-var6_5, -var8_6, -var10_7);
                        var2_2.ndp();
                        v0 = this.sz2;
                    }
                    catch (JsonSyntaxException v2) {
                        throw crp.a(v2);
                    }
                }
                var12_9 = v0.values().iterator();
                while (var12_9.hasNext()) {
                    block74: {
                        block75: {
                            block73: {
                                block67: {
                                    block72: {
                                        block69: {
                                            block71: {
                                                block70: {
                                                    block68: {
                                                        block58: {
                                                            block65: {
                                                                block66: {
                                                                    block62: {
                                                                        block63: {
                                                                            block64: {
                                                                                block59: {
                                                                                    block61: {
                                                                                        block60: {
                                                                                            var13_10 = (ax_)var12_9.next();
                                                                                            var14_11 = var13_10.q6p();
                                                                                            var15_12 = (double)var14_11.getX() - var6_5;
                                                                                            var17_13 = (double)var14_11.getY() - var8_6;
                                                                                            var19_14 = (double)var14_11.getZ() - var10_7;
                                                                                            var21_15 = this.t6z.getBlockState(var14_11).r_y();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var5_8 != 0) break block57;
                                                                                                                                    v3 = Reflector.ForgeTileEntity_canRenderBreaking.exists();
                                                                                                                                    if (var5_8 != 0) break block58;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException v4) {
                                                                                                                                    throw crp.a(v4);
                                                                                                                                }
                                                                                                                                if (v3 != 0) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl130
                                                                                                                            }
                                                                                                                            catch (JsonSyntaxException v5) {
                                                                                                                                throw crp.a(v5);
                                                                                                                            }
                                                                                                                            v6 = var21_15 instanceof hrd;
                                                                                                                            if (var5_8 != 0) break block59;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException v7) {
                                                                                                                            throw crp.a(v7);
                                                                                                                        }
                                                                                                                        if (v6 != 0) break block60;
                                                                                                                    }
                                                                                                                    catch (JsonSyntaxException v8) {
                                                                                                                        throw crp.a(v8);
                                                                                                                    }
                                                                                                                    v6 = var21_15 instanceof u5i;
                                                                                                                    if (var5_8 != 0) break block59;
                                                                                                                }
                                                                                                                catch (JsonSyntaxException v9) {
                                                                                                                    throw crp.a(v9);
                                                                                                                }
                                                                                                                if (v6 != 0) break block60;
                                                                                                            }
                                                                                                            catch (JsonSyntaxException v10) {
                                                                                                                throw crp.a(v10);
                                                                                                            }
                                                                                                            v6 = var21_15 instanceof m54;
                                                                                                            if (var5_8 != 0) break block59;
                                                                                                        }
                                                                                                        catch (JsonSyntaxException v11) {
                                                                                                            throw crp.a(v11);
                                                                                                        }
                                                                                                        if (v6 != 0) break block60;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException v12) {
                                                                                                        throw crp.a(v12);
                                                                                                    }
                                                                                                    v6 = var21_15 instanceof pld;
                                                                                                    if (var5_8 != 0) break block59;
                                                                                                }
                                                                                                catch (JsonSyntaxException v13) {
                                                                                                    throw crp.a(v13);
                                                                                                }
                                                                                                if (v6 == 0) break block61;
                                                                                            }
                                                                                            catch (JsonSyntaxException v14) {
                                                                                                throw crp.a(v14);
                                                                                            }
                                                                                        }
                                                                                        v6 = 1;
                                                                                        break block59;
                                                                                    }
                                                                                    v6 = 0;
                                                                                }
                                                                                var23_17 = v6;
                                                                                try {
                                                                                    v15 = var23_17;
                                                                                    if (var5_8 != 0) break block62;
                                                                                    if (v15 != 0) break block63;
                                                                                }
                                                                                catch (JsonSyntaxException v16) {
                                                                                    throw crp.a(v16);
                                                                                }
                                                                                var24_19 = this.t6z.getTileEntity(var14_11);
                                                                                try {
                                                                                    v17 = var24_19;
                                                                                    if (var5_8 != 0) break block64;
                                                                                    if (v17 == null) break block63;
                                                                                }
                                                                                catch (JsonSyntaxException v18) {
                                                                                    throw crp.a(v18);
                                                                                }
                                                                                v17 = var24_19;
                                                                            }
                                                                            var23_17 = (int)Reflector.callBoolean(v17, Reflector.ForgeTileEntity_canRenderBreaking, new Object[0]);
                                                                        }
                                                                        v15 = var23_17;
                                                                    }
                                                                    try {
                                                                        if (var5_8 != 0) break block65;
                                                                        if (v15 != 0) break block66;
                                                                    }
                                                                    catch (JsonSyntaxException v19) {
                                                                        throw crp.a(v19);
                                                                    }
                                                                    v15 = 1;
                                                                    break block65;
                                                                }
                                                                v15 = 0;
                                                            }
                                                            var22_16 = v15;
                                                            try {
                                                                if (var5_8 == 0) break block67;
lbl130:
                                                                // 2 sources

                                                                v3 = var21_15 instanceof hrd;
                                                            }
                                                            catch (JsonSyntaxException v20) {
                                                                throw crp.a(v20);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var5_8 != 0) break block68;
                                                                if (v3 != 0) break block69;
                                                            }
                                                            catch (JsonSyntaxException v21) {
                                                                throw crp.a(v21);
                                                            }
                                                            v3 = var21_15 instanceof u5i;
                                                        }
                                                        catch (JsonSyntaxException v22) {
                                                            throw crp.a(v22);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var5_8 != 0) break block70;
                                                            if (v3 != 0) break block69;
                                                        }
                                                        catch (JsonSyntaxException v23) {
                                                            throw crp.a(v23);
                                                        }
                                                        v3 = var21_15 instanceof m54;
                                                    }
                                                    catch (JsonSyntaxException v24) {
                                                        throw crp.a(v24);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var5_8 != 0) break block71;
                                                        if (v3 != 0) break block69;
                                                    }
                                                    catch (JsonSyntaxException v25) {
                                                        throw crp.a(v25);
                                                    }
                                                    v3 = var21_15 instanceof pld;
                                                }
                                                catch (JsonSyntaxException v26) {
                                                    throw crp.a(v26);
                                                }
                                            }
                                            try {
                                                if (var5_8 != 0) break block72;
                                                if (v3 != 0) break block69;
                                            }
                                            catch (JsonSyntaxException v27) {
                                                throw crp.a(v27);
                                            }
                                            v3 = 1;
                                            break block72;
                                        }
                                        v3 = 0;
                                    }
                                    var22_16 = v3;
                                }
                                try {
                                    try {
                                        v28 = var22_16;
                                        if (var5_8 != 0) break block73;
                                        if (v28 == 0) break block74;
                                    }
                                    catch (JsonSyntaxException v29) {
                                        throw crp.a(v29);
                                    }
                                    cfr_temp_0 = var15_12 * var15_12 + var17_13 * var17_13 + var19_14 * var19_14 - 1024.0;
                                    v28 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                }
                                catch (JsonSyntaxException v30) {
                                    throw crp.a(v30);
                                }
                            }
                            try {
                                if (v28 <= 0) break block75;
                                var12_9.remove();
                                if (var5_8 == 0) break block74;
                            }
                            catch (JsonSyntaxException v31) {
                                throw crp.a(v31);
                            }
                        }
                        if ((var23_18 = this.t6z.getBlockState(var14_11)).r_y().p1r() != p3y.cei) {
                            var24_20 = var13_10.fll();
                            var25_21 = this._qh[var24_20];
                            var26_22 = this.j0u.dwz();
                            var26_22.bgf(var23_18, var14_11, var25_21, this.t6z);
                        }
                    }
                    if (var5_8 == 0) continue;
                }
                var1_1.q7g();
                var2_2.nbz(0.0, 0.0, 0.0);
            }
            this.zwv();
        }
    }

    public void rq6(ha9 ha92, akm akm2, int n, float f) {
        block14: {
            boolean bl;
            block19: {
                block17: {
                    block18: {
                        boolean bl2;
                        int n2;
                        block15: {
                            block16: {
                                n2 = t9d.c();
                                try {
                                    try {
                                        try {
                                            if (n != 0 || akm2.oyz != akm$qs6.i4l) break block14;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                        hzu.spd();
                                        hzu.u39(770, 771, 1, 0);
                                        hzu.wn0(0.0f, 0.0f, 0.0f, 0.4f);
                                        GL11.glLineWidth((float)2.0f);
                                        hzu.m_1();
                                        bl2 = hxt.ly3();
                                        if (n2 != 0) break block15;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                    if (!bl2) break block16;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                Shaders.disableTexture2D();
                            }
                            bl2 = false;
                        }
                        hzu.jun(bl2);
                        float f2 = 0.002f;
                        mew mew2 = akm2._uf();
                        e0x e0x2 = this.t6z.getBlockState(mew2).r_y();
                        try {
                            try {
                                try {
                                    if (n2 != 0) break block17;
                                    if (e0x2.p1r() == p3y.cei) break block18;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                bl = this.t6z.fve().hka(mew2);
                                if (n2 != 0) break block19;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                            if (!bl) break block18;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        e0x2.c7i(this.t6z, mew2);
                        double d = ha92.ivp + (ha92.o2v - ha92.ivp) * (double)f;
                        double d2 = ha92.c54 + (ha92.kfp - ha92.c54) * (double)f;
                        double d3 = ha92.e2b + (ha92.vbd - ha92.e2b) * (double)f;
                        nh4 nh42 = e0x2.j54(this.t6z, mew2);
                        e0x$hep e0x$hep = e0x2.jkr();
                        if (e0x$hep != e0x$hep.j0y) {
                            nh42 = BlockModelUtils.getOffsetBoundingBox(nh42, e0x$hep, mew2);
                        }
                        crp.uja(nh42.c2h(0.002f, 0.002f, 0.002f).sy_(-d, -d2, -d3));
                    }
                    hzu.jun(true);
                    hzu.rqj();
                }
                bl = hxt.ly3();
            }
            if (bl) {
                Shaders.enableTexture2D();
            }
            hzu.ux6();
        }
    }

    public static void uja(nh4 nh42) {
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(3, gnl.gx3);
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.oqj).pzw();
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.oqj).pzw();
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.t8n).pzw();
        jom2.q7g();
        q3g2.ezr(3, gnl.gx3);
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.oqj).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.oqj).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.t8n).pzw();
        jom2.q7g();
        q3g2.ezr(1, gnl.gx3);
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.t8n).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.t8n).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.oqj).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.oqj).pzw();
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.oqj).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.oqj).pzw();
        jom2.q7g();
    }

    public static void h_0(nh4 nh42, int n, int n2, int n3, int n4) {
        jom jom2 = jom.yut();
        q3g q3g2 = jom2.zuq();
        q3g2.ezr(3, gnl.gec);
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.t8n).fje(n, n2, n3, n4).pzw();
        jom2.q7g();
        q3g2.ezr(3, gnl.gec);
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.t8n).fje(n, n2, n3, n4).pzw();
        jom2.q7g();
        q3g2.ezr(1, gnl.gec);
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.t8n).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.bx_, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.t_2, nh42.i2c, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.bx_, nh42.oqj).fje(n, n2, n3, n4).pzw();
        q3g2.g5o(nh42.rlc, nh42.i2c, nh42.oqj).fje(n, n2, n3, n4).pzw();
        jom2.q7g();
    }

    private void y4r(int n, int n2, int n3, int n4, int n5, int n6) {
        this.o6x.rid(n, n2, n3, n4, n5, n6);
    }

    @Override
    public void vsk(mew mew2) {
        int n = mew2.getX();
        int n2 = mew2.getY();
        int n3 = mew2.getZ();
        this.y4r(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public void xyy(mew mew2) {
        int n = mew2.getX();
        int n2 = mew2.getY();
        int n3 = mew2.getZ();
        this.y4r(n - 1, n2 - 1, n3 - 1, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public void cy9(int n, int n2, int n3, int n4, int n5, int n6) {
        this.y4r(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1);
    }

    @Override
    public void bs4(String string, mew mew2) {
        block11: {
            String string2;
            block10: {
                int n;
                block9: {
                    n = t9d.b();
                    jp4 jp42 = (jp4)this.kgn.get(mew2);
                    try {
                        jp4 jp43;
                        try {
                            jp43 = jp42;
                            if (n == 0 || jp43 == null) break block9;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        this.j0u.yp9().o81(jp42);
                        jp43 = this.kgn.remove(mew2);
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                try {
                    string2 = string;
                    if (n == 0) break block10;
                    if (string2 == null) break block11;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
                string2 = string;
            }
            jrs jrs2 = jrs.bjz(string2);
            try {
                if (jrs2 != null) {
                    this.j0u.t43.lx1(jrs2.dr5());
                }
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw crp.a(jsonSyntaxException);
            }
            vs1 vs12 = vs1.sag(new gdz(string), mew2.getX(), mew2.getY(), mew2.getZ());
            this.kgn.put(mew2, vs12);
            this.j0u.yp9().mak(vs12);
        }
    }

    @Override
    public void z24(String string, double d, double d2, double d3, float f, float f2) {
    }

    @Override
    public void jdq(ha9 ha92, String string, double d, double d2, double d3, float f, float f2) {
    }

    @Override
    public void t0e(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        long l = a ^ 0x4B059049EF6FL;
        int n2 = t9d.c();
        try {
            this.n_v(n, bl, d, d2, d3, d4, d5, d6, nArray);
        }
        catch (Throwable throwable) {
            e1i e1i2;
            block6: {
                wsc wsc2;
                block7: {
                    e1i2 = e1i.cor(throwable, (String)((Object)crp.a("j", (int)25207, (long)(0x5C35ED0421D15FD3L ^ l))));
                    wsc2 = e1i2.i_r((String)((Object)crp.a("j", (int)13309, (long)(0x7581D4A7E3098E48L ^ l))));
                    try {
                        try {
                            wsc2._0p((String)((Object)crp.a("j", (int)27432, (long)(0x445EB47D1B556BFL ^ l))), n);
                            if (n2 != 0) break block6;
                            if (nArray == null) break block7;
                        }
                        catch (Throwable throwable2) {
                            throw crp.a(throwable2);
                        }
                        wsc2._0p((String)((Object)crp.a("j", (int)21029, (long)(0x44953A891488EF8CL ^ l))), nArray);
                    }
                    catch (Throwable throwable3) {
                        throw crp.a(throwable3);
                    }
                }
                wsc2.h1o((String)((Object)crp.a("j", (int)20807, (long)(0x5C75E518736F6CFBL ^ l))), new crp$1(this, d, d2, d3));
            }
            throw new oov(e1i2);
        }
    }

    private void agu(w_0 w_02, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        this.t0e(w_02.ewe(), w_02._gn(), d, d2, d3, d4, d5, d6, nArray);
    }

    private flo n_v(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        block197: {
            int n2;
            int n3;
            flo flo2;
            block268: {
                block269: {
                    int n4;
                    block266: {
                        block267: {
                            block264: {
                                block265: {
                                    block262: {
                                        block263: {
                                            block260: {
                                                block261: {
                                                    int n5;
                                                    double d7;
                                                    double d8;
                                                    double d9;
                                                    int n6;
                                                    block254: {
                                                        block255: {
                                                            int n7;
                                                            block251: {
                                                                block253: {
                                                                    block252: {
                                                                        block248: {
                                                                            block250: {
                                                                                block249: {
                                                                                    block245: {
                                                                                        block247: {
                                                                                            block246: {
                                                                                                block242: {
                                                                                                    block244: {
                                                                                                        block243: {
                                                                                                            block239: {
                                                                                                                block241: {
                                                                                                                    block240: {
                                                                                                                        block236: {
                                                                                                                            block238: {
                                                                                                                                block237: {
                                                                                                                                    block233: {
                                                                                                                                        block235: {
                                                                                                                                            block234: {
                                                                                                                                                block230: {
                                                                                                                                                    block232: {
                                                                                                                                                        block231: {
                                                                                                                                                            block227: {
                                                                                                                                                                block229: {
                                                                                                                                                                    block228: {
                                                                                                                                                                        block224: {
                                                                                                                                                                            block226: {
                                                                                                                                                                                block225: {
                                                                                                                                                                                    block221: {
                                                                                                                                                                                        block223: {
                                                                                                                                                                                            block222: {
                                                                                                                                                                                                block218: {
                                                                                                                                                                                                    block220: {
                                                                                                                                                                                                        block219: {
                                                                                                                                                                                                            block215: {
                                                                                                                                                                                                                block217: {
                                                                                                                                                                                                                    block216: {
                                                                                                                                                                                                                        block212: {
                                                                                                                                                                                                                            block214: {
                                                                                                                                                                                                                                block213: {
                                                                                                                                                                                                                                    block209: {
                                                                                                                                                                                                                                        block211: {
                                                                                                                                                                                                                                            block210: {
                                                                                                                                                                                                                                                block206: {
                                                                                                                                                                                                                                                    block208: {
                                                                                                                                                                                                                                                        block207: {
                                                                                                                                                                                                                                                            block203: {
                                                                                                                                                                                                                                                                block205: {
                                                                                                                                                                                                                                                                    block204: {
                                                                                                                                                                                                                                                                        crp crp2;
                                                                                                                                                                                                                                                                        block202: {
                                                                                                                                                                                                                                                                            block201: {
                                                                                                                                                                                                                                                                                int n8;
                                                                                                                                                                                                                                                                                block200: {
                                                                                                                                                                                                                                                                                    c05 c052;
                                                                                                                                                                                                                                                                                    block199: {
                                                                                                                                                                                                                                                                                        block198: {
                                                                                                                                                                                                                                                                                            block196: {
                                                                                                                                                                                                                                                                                                n4 = t9d.b();
                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                                        c052 = this.j0u;
                                                                                                                                                                                                                                                                                                        if (n4 == 0) break block196;
                                                                                                                                                                                                                                                                                                        if (c052 == null) break block197;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    c052 = this.j0u;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                                    if (n4 == 0) break block198;
                                                                                                                                                                                                                                                                                                    if (c052.nsd() == null) break block197;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                c052 = this.j0u;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                if (n4 == 0) break block199;
                                                                                                                                                                                                                                                                                                if (c052.i4p == null) break block197;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            c052 = this.j0u;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    n6 = c052.oxn.ysd;
                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                n8 = n6;
                                                                                                                                                                                                                                                                                                if (n4 == 0) break block200;
                                                                                                                                                                                                                                                                                                if (n8 != 1) break block201;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            crp2 = this;
                                                                                                                                                                                                                                                                                            if (n4 == 0) break block202;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        n8 = crp2.t6z.fsy.nextInt(3);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (n8 == 0) {
                                                                                                                                                                                                                                                                                    n6 = 2;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            crp2 = this;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        d9 = crp2.j0u.nsd().o2v - d;
                                                                                                                                                                                                                                                                        d8 = this.j0u.nsd().kfp - d2;
                                                                                                                                                                                                                                                                        d7 = this.j0u.nsd().vbd - d3;
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                                        n5 = n;
                                                                                                                                                                                                                                                                                        n7 = w_0.ezk.ewe();
                                                                                                                                                                                                                                                                                        if (n4 == 0) break block203;
                                                                                                                                                                                                                                                                                        if (n5 != n7) break block204;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    n5 = hxt.ch8() ? 1 : 0;
                                                                                                                                                                                                                                                                                    if (n4 == 0) break block205;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (n5 != 0) break block204;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            return null;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    n5 = n;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                n7 = w_0.tmu.ewe();
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                            if (n4 == 0) break block206;
                                                                                                                                                                                                                                                                            if (n5 != n7) break block207;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        n5 = hxt.ch8() ? 1 : 0;
                                                                                                                                                                                                                                                                        if (n4 == 0) break block208;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (n5 != 0) break block207;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                return null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        n5 = n;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    n7 = w_0.aiv.ewe();
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                if (n4 == 0) break block209;
                                                                                                                                                                                                                                                                if (n5 != n7) break block210;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            n5 = hxt.ch8() ? 1 : 0;
                                                                                                                                                                                                                                                            if (n4 == 0) break block211;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (n5 != 0) break block210;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            n5 = n;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        n7 = w_0.ahz.ewe();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    if (n4 == 0) break block212;
                                                                                                                                                                                                                                                    if (n5 != n7) break block213;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                n5 = hxt.ss5() ? 1 : 0;
                                                                                                                                                                                                                                                if (n4 == 0) break block214;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (n5 != 0) break block213;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n5 = n;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            n7 = w_0.rwy.ewe();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        if (n4 == 0) break block215;
                                                                                                                                                                                                                                        if (n5 != n7) break block216;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    n5 = hxt.jon() ? 1 : 0;
                                                                                                                                                                                                                                    if (n4 == 0) break block217;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (n5 != 0) break block216;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    n5 = n;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                n7 = w_0.bac.ewe();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            if (n4 == 0) break block218;
                                                                                                                                                                                                                            if (n5 != n7) break block219;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        n5 = hxt.zio() ? 1 : 0;
                                                                                                                                                                                                                        if (n4 == 0) break block220;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (n5 != 0) break block219;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n5 = n;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    n7 = w_0.vby.ewe();
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                if (n4 == 0) break block221;
                                                                                                                                                                                                                if (n5 != n7) break block222;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            n5 = hxt.zio() ? 1 : 0;
                                                                                                                                                                                                            if (n4 == 0) break block223;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (n5 != 0) break block222;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return null;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            n5 = n;
                                                                                                                                                                                        }
                                                                                                                                                                                        n7 = w_0.hg8.ewe();
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    if (n4 == 0) break block224;
                                                                                                                                                                                                    if (n5 != n7) break block225;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                                }
                                                                                                                                                                                                n5 = hxt.aok() ? 1 : 0;
                                                                                                                                                                                                if (n4 == 0) break block226;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (n5 != 0) break block225;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                                        }
                                                                                                                                                                                        return null;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                n5 = n;
                                                                                                                                                                            }
                                                                                                                                                                            n7 = w_0.s7d.ewe();
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        if (n4 == 0) break block227;
                                                                                                                                                                                        if (n5 != n7) break block228;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                                    }
                                                                                                                                                                                    n5 = hxt.aok() ? 1 : 0;
                                                                                                                                                                                    if (n4 == 0) break block229;
                                                                                                                                                                                }
                                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                                }
                                                                                                                                                                                if (n5 != 0) break block228;
                                                                                                                                                                            }
                                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                                            }
                                                                                                                                                                            return null;
                                                                                                                                                                        }
                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    n5 = n;
                                                                                                                                                                }
                                                                                                                                                                n7 = w_0.ycr.ewe();
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            if (n4 == 0) break block230;
                                                                                                                                                                            if (n5 != n7) break block231;
                                                                                                                                                                        }
                                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                                        }
                                                                                                                                                                        n5 = hxt.aok() ? 1 : 0;
                                                                                                                                                                        if (n4 == 0) break block232;
                                                                                                                                                                    }
                                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                                    }
                                                                                                                                                                    if (n5 != 0) break block231;
                                                                                                                                                                }
                                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                                }
                                                                                                                                                                return null;
                                                                                                                                                            }
                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        n5 = n;
                                                                                                                                                    }
                                                                                                                                                    n7 = w_0.cle.ewe();
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (n4 == 0) break block233;
                                                                                                                                                                if (n5 != n7) break block234;
                                                                                                                                                            }
                                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                                            }
                                                                                                                                                            n5 = hxt.aok() ? 1 : 0;
                                                                                                                                                            if (n4 == 0) break block235;
                                                                                                                                                        }
                                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                                        }
                                                                                                                                                        if (n5 != 0) break block234;
                                                                                                                                                    }
                                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                                    }
                                                                                                                                                    return null;
                                                                                                                                                }
                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            n5 = n;
                                                                                                                                        }
                                                                                                                                        n7 = w_0.c0z.ewe();
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (n4 == 0) break block236;
                                                                                                                                                    if (n5 != n7) break block237;
                                                                                                                                                }
                                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                                }
                                                                                                                                                n5 = hxt.aok() ? 1 : 0;
                                                                                                                                                if (n4 == 0) break block238;
                                                                                                                                            }
                                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                                            }
                                                                                                                                            if (n5 != 0) break block237;
                                                                                                                                        }
                                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                                        }
                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                n5 = n;
                                                                                                                            }
                                                                                                                            n7 = w_0.t9k.ewe();
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (n4 == 0) break block239;
                                                                                                                                        if (n5 != n7) break block240;
                                                                                                                                    }
                                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                                    }
                                                                                                                                    n5 = hxt._9o() ? 1 : 0;
                                                                                                                                    if (n4 == 0) break block241;
                                                                                                                                }
                                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                                }
                                                                                                                                if (n5 != 0) break block240;
                                                                                                                            }
                                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                                            }
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n5 = n;
                                                                                                                }
                                                                                                                n7 = w_0.jnp.ewe();
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (n4 == 0) break block242;
                                                                                                                            if (n5 != n7) break block243;
                                                                                                                        }
                                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                                        }
                                                                                                                        n5 = hxt.sos() ? 1 : 0;
                                                                                                                        if (n4 == 0) break block244;
                                                                                                                    }
                                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                                    }
                                                                                                                    if (n5 != 0) break block243;
                                                                                                                }
                                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                                }
                                                                                                                return null;
                                                                                                            }
                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                            }
                                                                                                        }
                                                                                                        n5 = n;
                                                                                                    }
                                                                                                    n7 = w_0.dyc.ewe();
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (n4 == 0) break block245;
                                                                                                                if (n5 != n7) break block246;
                                                                                                            }
                                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                                throw crp.a(jsonSyntaxException);
                                                                                                            }
                                                                                                            n5 = hxt.g17() ? 1 : 0;
                                                                                                            if (n4 == 0) break block247;
                                                                                                        }
                                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                            throw crp.a(jsonSyntaxException);
                                                                                                        }
                                                                                                        if (n5 != 0) break block246;
                                                                                                    }
                                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                        throw crp.a(jsonSyntaxException);
                                                                                                    }
                                                                                                    return null;
                                                                                                }
                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                }
                                                                                            }
                                                                                            n5 = n;
                                                                                        }
                                                                                        n7 = w_0.cde.ewe();
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (n4 == 0) break block248;
                                                                                                    if (n5 != n7) break block249;
                                                                                                }
                                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                    throw crp.a(jsonSyntaxException);
                                                                                                }
                                                                                                n5 = hxt.dhi() ? 1 : 0;
                                                                                                if (n4 == 0) break block250;
                                                                                            }
                                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                                throw crp.a(jsonSyntaxException);
                                                                                            }
                                                                                            if (n5 != 0) break block249;
                                                                                        }
                                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                                            throw crp.a(jsonSyntaxException);
                                                                                        }
                                                                                        return null;
                                                                                    }
                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                        throw crp.a(jsonSyntaxException);
                                                                                    }
                                                                                }
                                                                                n5 = n;
                                                                            }
                                                                            n7 = w_0.fpv.ewe();
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (n4 == 0) break block251;
                                                                                        if (n5 != n7) break block252;
                                                                                    }
                                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                                        throw crp.a(jsonSyntaxException);
                                                                                    }
                                                                                    n5 = hxt.dhi() ? 1 : 0;
                                                                                    if (n4 == 0) break block253;
                                                                                }
                                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                                    throw crp.a(jsonSyntaxException);
                                                                                }
                                                                                if (n5 != 0) break block252;
                                                                            }
                                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                                throw crp.a(jsonSyntaxException);
                                                                            }
                                                                            return null;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                    }
                                                                    n5 = n;
                                                                }
                                                                try {
                                                                    if (n4 == 0) break block254;
                                                                    n7 = w_0.dj0.ewe();
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n5 != n7) break block255;
                                                                        n5 = hxt.s5i() ? 1 : 0;
                                                                        if (n4 == 0) break block254;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                    if (n5 != 0) break block255;
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                                return null;
                                                            }
                                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                                throw crp.a(jsonSyntaxException);
                                                            }
                                                        }
                                                        n5 = bl ? 1 : 0;
                                                    }
                                                    if (n5 == 0) {
                                                        int n9;
                                                        block258: {
                                                            block259: {
                                                                block256: {
                                                                    double d10;
                                                                    double d11;
                                                                    block257: {
                                                                        d11 = 1024.0;
                                                                        try {
                                                                            n9 = n;
                                                                            if (n4 == 0) break block256;
                                                                            if (n9 != w_0.fzw.ewe()) break block257;
                                                                        }
                                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                                            throw crp.a(jsonSyntaxException);
                                                                        }
                                                                        d11 = 38416.0;
                                                                    }
                                                                    n9 = (d10 = d9 * d9 + d8 * d8 + d7 * d7 - d11) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (n4 == 0) break block258;
                                                                        if (n9 <= 0) break block259;
                                                                    }
                                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                                        throw crp.a(jsonSyntaxException);
                                                                    }
                                                                    return null;
                                                                }
                                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                                    throw crp.a(jsonSyntaxException);
                                                                }
                                                            }
                                                            n9 = n6;
                                                        }
                                                        try {
                                                            if (n9 > 1) {
                                                                return null;
                                                            }
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw crp.a(jsonSyntaxException);
                                                        }
                                                    }
                                                    flo2 = this.j0u.i4p.tve(n, d, d2, d3, d4, d5, d6, nArray);
                                                    try {
                                                        try {
                                                            n3 = n;
                                                            n2 = w_0.w_h.ewe();
                                                            if (n4 == 0) break block260;
                                                            if (n3 != n2) break block261;
                                                        }
                                                        catch (JsonSyntaxException jsonSyntaxException) {
                                                            throw crp.a(jsonSyntaxException);
                                                        }
                                                        CustomColors.updateWaterFX(flo2, this.t6z, d, d2, d3, this.pop);
                                                    }
                                                    catch (JsonSyntaxException jsonSyntaxException) {
                                                        throw crp.a(jsonSyntaxException);
                                                    }
                                                }
                                                n3 = n;
                                                n2 = w_0.eiu.ewe();
                                            }
                                            try {
                                                try {
                                                    if (n4 == 0) break block262;
                                                    if (n3 != n2) break block263;
                                                }
                                                catch (JsonSyntaxException jsonSyntaxException) {
                                                    throw crp.a(jsonSyntaxException);
                                                }
                                                CustomColors.updateWaterFX(flo2, this.t6z, d, d2, d3, this.pop);
                                            }
                                            catch (JsonSyntaxException jsonSyntaxException) {
                                                throw crp.a(jsonSyntaxException);
                                            }
                                        }
                                        n3 = n;
                                        n2 = w_0.nfs.ewe();
                                    }
                                    try {
                                        try {
                                            if (n4 == 0) break block264;
                                            if (n3 != n2) break block265;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                        CustomColors.updateWaterFX(flo2, this.t6z, d, d2, d3, this.pop);
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                }
                                n3 = n;
                                n2 = w_0.n2e.ewe();
                            }
                            try {
                                try {
                                    if (n4 == 0) break block266;
                                    if (n3 != n2) break block267;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                CustomColors.updateMyceliumFX(flo2);
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                        }
                        n3 = n;
                        n2 = w_0.t9k.ewe();
                    }
                    try {
                        try {
                            if (n4 == 0) break block268;
                            if (n3 != n2) break block269;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        CustomColors.updatePortalFX(flo2);
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                n3 = n;
                n2 = w_0.dyc.ewe();
            }
            try {
                if (n3 == n2) {
                    CustomColors.updateReddustFX(flo2, this.t6z, d, d2, d3);
                }
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw crp.a(jsonSyntaxException);
            }
            return flo2;
        }
        return null;
    }

    @Override
    public void m4f(i2h i2h2) {
        block5: {
            crp crp2;
            i2h i2h3;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        i2h3 = i2h2;
                        crp2 = this;
                        if (n != 0) break block4;
                        RandomEntities.entityLoaded(i2h3, crp2.t6z);
                        if (!hxt.csr()) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    i2h3 = i2h2;
                    crp2 = this;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            DynamicLights.entityAdded(i2h3, crp2);
        }
    }

    @Override
    public void fbz(i2h i2h2) {
        block5: {
            crp crp2;
            i2h i2h3;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        i2h3 = i2h2;
                        crp2 = this;
                        if (n == 0) break block4;
                        RandomEntities.entityUnloaded(i2h3, crp2.t6z);
                        if (!hxt.csr()) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    i2h3 = i2h2;
                    crp2 = this;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            DynamicLights.entityRemoved(i2h3, crp2);
        }
    }

    public void xxm() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a60(int n, mew mew2, int n2) {
        double d;
        double d2;
        double d3;
        double d4;
        int n3;
        long l;
        block13: {
            block14: {
                l = a ^ 0x341C1D6D2316L;
                n3 = t9d.b();
                try {
                    switch (n) {
                        case 1013: 
                        case 1018: {
                            if (this.j0u.nsd() == null) return;
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
                double d5 = (double)mew2.getX() - this.j0u.nsd().o2v;
                double d6 = (double)mew2.getY() - this.j0u.nsd().kfp;
                double d7 = (double)mew2.getZ() - this.j0u.nsd().vbd;
                double d8 = Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7);
                d4 = this.j0u.nsd().o2v;
                d3 = this.j0u.nsd().kfp;
                d2 = this.j0u.nsd().vbd;
                try {
                    double d9 = d8 - 0.0;
                    d = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                    if (n3 == 0) break block13;
                    if (d <= 0) break block14;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
                d4 += d5 / d8 * 2.0;
                d3 += d6 / d8 * 2.0;
                d2 += d7 / d8 * 2.0;
            }
            d = n;
        }
        try {
            try {
                if (d == 1013) {
                    this.t6z.wd_(d4, d3, d2, (String)((Object)crp.a("j", (int)2601, (long)(0x3ACD5DD1B7937BE8L ^ l))), 1.0f, 1.0f, false);
                    if (n3 != 0) return;
                }
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw crp.a(jsonSyntaxException);
            }
            this.t6z.wd_(d4, d3, d2, (String)((Object)crp.a("j", (int)4425, (long)(0x682329F6A0EE0A5L ^ l))), 5.0f, 1.0f, false);
            return;
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            throw crp.a(jsonSyntaxException);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void ifl(ha9 var1_1, int var2_2, mew var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Unable to fully structure code
     */
    @Override
    public void tag(int var1_1, mew var2_2, int var3_3) {
        block24: {
            block23: {
                block21: {
                    block22: {
                        block20: {
                            var4_4 = t9d.c();
                            try {
                                v0 = var3_3;
                                if (var4_4 != 0) break block20;
                                if (v0 >= 0) {
                                }
                                ** GOTO lbl64
                            }
                            catch (JsonSyntaxException v1) {
                                throw crp.a(v1);
                            }
                            v0 = var3_3;
                        }
                        if (v0 >= 10) ** GOTO lbl64
                        var5_5 = (ax_)this.sz2.get(var1_1);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v2 = var5_5;
                                                    if (var4_4 != 0) break block21;
                                                    if (v2 == null) break block22;
                                                }
                                                catch (JsonSyntaxException v3) {
                                                    throw crp.a(v3);
                                                }
                                                v2 = var5_5.q6p();
                                                if (var4_4 != 0) break block21;
                                            }
                                            catch (JsonSyntaxException v4) {
                                                throw crp.a(v4);
                                            }
                                            if (v2.getX() != var2_2.getX()) break block22;
                                        }
                                        catch (JsonSyntaxException v5) {
                                            throw crp.a(v5);
                                        }
                                        v2 = var5_5.q6p();
                                        if (var4_4 != 0) break block21;
                                    }
                                    catch (JsonSyntaxException v6) {
                                        throw crp.a(v6);
                                    }
                                    if (v2.getY() != var2_2.getY()) break block22;
                                }
                                catch (JsonSyntaxException v7) {
                                    throw crp.a(v7);
                                }
                                v8 = var5_5;
                                if (var4_4 != 0) break block23;
                            }
                            catch (JsonSyntaxException v9) {
                                throw crp.a(v9);
                            }
                            if (v8.q6p().getZ() == var2_2.getZ()) break block21;
                        }
                        catch (JsonSyntaxException v10) {
                            throw crp.a(v10);
                        }
                    }
                    var5_5 = new ax_(var1_1, var2_2);
                    v2 = this.sz2.put(var1_1, var5_5);
                }
                var5_5.fhs(var3_3);
                v8 = var5_5;
            }
            try {
                v8.p8t(this.s0f);
                if (var4_4 == 0) break block24;
lbl64:
                // 3 sources

                this.sz2.remove(var1_1);
            }
            catch (JsonSyntaxException v11) {
                throw crp.a(v11);
            }
        }
    }

    public void rdb() {
        this.jli = true;
    }

    public boolean w3m() {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.c();
                    try {
                        try {
                            bl = this.l0i.isEmpty();
                            if (n != 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        bl = this.isn.vle();
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (!bl) break block7;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public void u5e() {
        this.sae.reset();
    }

    public int ccu() {
        return this.o6x.mzt.length;
    }

    public int zpi() {
        return this.eq2.size();
    }

    public int q22() {
        return this.yoz;
    }

    public int tc4() {
        return this.obc;
    }

    public int wpv() {
        int n;
        block21: {
            yo9 yo92;
            block19: {
                block20: {
                    g6k g6k2;
                    g6k g6k3;
                    int n2;
                    block17: {
                        block18: {
                            kh3 kh32;
                            block15: {
                                block16: {
                                    n2 = t9d.b();
                                    try {
                                        try {
                                            kh32 = this.t6z;
                                            if (n2 == 0) break block15;
                                            if (kh32 != null) break block16;
                                        }
                                        catch (JsonSyntaxException jsonSyntaxException) {
                                            throw crp.a(jsonSyntaxException);
                                        }
                                        return 0;
                                    }
                                    catch (JsonSyntaxException jsonSyntaxException) {
                                        throw crp.a(jsonSyntaxException);
                                    }
                                }
                                kh32 = this.t6z;
                            }
                            g6k3 = kh32.sj7();
                            try {
                                try {
                                    g6k2 = g6k3;
                                    if (n2 == 0) break block17;
                                    if (g6k2 != null) break block18;
                                }
                                catch (JsonSyntaxException jsonSyntaxException) {
                                    throw crp.a(jsonSyntaxException);
                                }
                                return 0;
                            }
                            catch (JsonSyntaxException jsonSyntaxException) {
                                throw crp.a(jsonSyntaxException);
                            }
                        }
                        g6k2 = g6k3;
                    }
                    try {
                        if (g6k2 != this.ips) {
                            this.ips = g6k3;
                            this.jgu = (yo9)Reflector.getFieldValue(g6k3, Reflector.ChunkProviderClient_chunkMapping);
                        }
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    try {
                        try {
                            yo92 = this.jgu;
                            if (n2 == 0) break block19;
                            if (yo92 != null) break block20;
                        }
                        catch (JsonSyntaxException jsonSyntaxException) {
                            throw crp.a(jsonSyntaxException);
                        }
                        n = 0;
                        break block21;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                yo92 = this.jgu;
            }
            n = yo92.iz6();
        }
        return n;
    }

    public int oy0() {
        return this.l0i.size();
    }

    public kqk x93(mew mew2) {
        return this.o6x.bes(mew2);
    }

    public kh3 t6q() {
        return this.t6z;
    }

    private void ixl() {
        block5: {
            int n = t9d.c();
            try {
                block4: {
                    try {
                        if (pp5 <= 0) break block4;
                        this.eq2 = new ArrayList(this.eq2.size() + 16);
                        this.fo5 = new ArrayList(this.fo5.size() + 16);
                        this.ea4 = new ArrayList(this.ea4.size() + 16);
                        if (n == 0) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                }
                this.eq2.clear();
                this.fo5.clear();
                this.ea4.clear();
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                throw crp.a(jsonSyntaxException);
            }
        }
    }

    public void guk() {
        block5: {
            block4: {
                int n = t9d.b();
                try {
                    crp crp2;
                    try {
                        crp2 = this;
                        if (n == 0) break block4;
                        if (!crp2.f4x) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    this.f9n();
                    crp2 = this;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            crp2.f4x = false;
        }
    }

    public void zgs() {
        block5: {
            tbt tbt2;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        tbt2 = this.isn;
                        if (n == 0) break block4;
                        if (tbt2 == null) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    tbt2 = this.isn;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            tbt2.o2c();
        }
    }

    public void eue() {
        block5: {
            tbt tbt2;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        tbt2 = this.isn;
                        if (n == 0) break block4;
                        if (tbt2 == null) break block5;
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        throw crp.a(jsonSyntaxException);
                    }
                    tbt2 = this.isn;
                }
                catch (JsonSyntaxException jsonSyntaxException) {
                    throw crp.a(jsonSyntaxException);
                }
            }
            tbt2._ot();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ri6(Collection collection, Collection collection2) {
        Set set = this.h7f;
        synchronized (set) {
            this.h7f.removeAll(collection);
            this.h7f.addAll(collection2);
        }
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

                crp.a = c.a(4009785463163921068L, 2721813367243870744L, MethodHandles.lookup().lookupClass()).a(97375504260410L);
                var9 = crp.a ^ 22657549043108L;
                crp.d = new HashMap<K, V>(13);
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
                var7_3 = new String[61];
                var5_4 = 0;
                var4_5 = "\u0092\u0003\u00c8l\u00a7j{\u0014B\u000fA\u00cb\u009ft{<0\\\u00cc\u0085\u00e6k\u00f6\u00c2\u0000B\u00e22d^\u0093\u00fbY2=\u0087k_\u0089\u00eb\u00d1D\u00a1RrDU,G\u0012\u00efI'=G\u0094d1\n\u007f\u007f\u009c\u00f4\u00ba\u009a(\u00e0\u00f5\u0083\u0095s\u008e\u00f5G\u0013\u00c3\u00df\u000b8\u00c9\u009d\u00aa-`\u00be4Z5\u0004-N\u00b7\u0084q8)\u000b\u001c\u001f\u00d3 \u00ff\u0085\u001f\u0097\u008b\u00188\u00ea\u00f0!;\u008emcw\u0081zu\u00d7\u0092\u0096\u00fa\u00ce\u00cd1\u00e5\u00ccb\u00ea\u001a\u0010%\u00f6tf\u00d8\u00b5\u00ce\u00d7I\u00f2\u00cd\u0095\u0010\u009f\u00f1\u00ed\u0018\u0011\u0083\u0097l25lc\u0090Zo\u008e\u0097\u007f\u00ec\u00c1\u00c1O\tz\u0086RE?(\u00acT\u00e4 ?}\u00f9\u00c9=1\u00a2\u00c6\"\f\u008e\u0001\u0006\u00e7\u00a3!\u0013\u00caf}\u00b2\u001e/\u0006\u00d5AV\u00aa\u00d7\u00d1\u00cf\u0094\u001b\u0080Y\u0080(\u00eb\u009b\u00b9!0\u00bc\u00f9\f\u007f\u00a6\u009a\u00f3\u0081{\u00d5\u00d1\u00eb\u00ce=\\D^C\u001f}\u001b~_P `\u00e8\u0006{YL\u00fa\u008ag\u0080(\u0016\u00c8\u00b60\u0090]W\u00b0\u00ae\u00996\u00c8\u00d0\u0099\u00188*\n\u0014\u0090\u00aa*\u00af\t0\u007f#\u0098\u0015\u0089?\u00d6\u00b3\u00c8A \u009cC\u0019B\u0010u\u0085\u00f7;\u0016\u00bb\u00a7\u00f2au\f\f\u00f7\u0001m\u00d4\u0018\u009c\u00bb\u00ae\u0007\u00dc\u00d4\u00ad(\u00cf\"3\u008c4E\u0082r\u001e]\u00c4t\u009cD\u00b6}\u0018L\u00ad\u00b0\u0004\u00ad\u000f\u0094\u00d0\u008f\u00f9\u00ca\u0097B\u00a5\u0090\u00f2\u00b5^\u0094yh\u00b2\u00b8\u00ac\u0018\u00e3\u0098m\u00bbR\u0088\u0000M\u0094\u00b9\u00aep\u0087\u00af\u00cfP\u00a9BBEP\u00cb\u00a6A(Jwb\u00ec\u0011a\u00f8\u00f6@T\u00f7\u00b2):\u0092|\u00b5\u00d33\u0005\u0095\"\u00f2P>\u00ff\u00ca~\u00f4\u001d\u0097:M\u00b1\u00e8R\u00f5L\u00a6\u00dd(\u0092Ne:1\u00ac\u00a9\u00c6u\u00d0\n(\u0014\u00b0\u00fe\u000e\u0083\u000f\u00cd\u00f9\u00e0\u000f\u00fdxoHz\u00a5\u00d1\u00eboK\u00b1\u00d3\u0018)`M\u00b1\u00b3(=\u00d7\u00c1\u0001\u00d5[\u00f7T\u00f0\u001ai\u009f;{\u00c8\u00d1H\u00b7\u0084\u009b\u0006@H\u00b2\u00d0\u00a7\u0091\u0096\u00d8r\u00e3\u0095N\u00adx\u00e3)\u009c`\u001f\u0018\r,\u00b1\u008c\u00cd\u0080C*=\u00f9\u00d8aM\u008f\u009bwX\\\u00cf)@-\u00ec\u009a0h\\\u0011\u00d5fU\u00f0\u0096\u00cdUV\u0016{\u00f1\u0081F\u00b4^\u00ab\u00d23\u00aaGa\u00a5\u0085\u0016g\u00f3\u008c\u00ab\u0084\u00b4E\u0014b\u0017\u00c2\u00dae5\u0012\u00b5\u00b4C$o;(}H\u009e\u00ae\u008a,Z\u00ce\u0003\n\u0013Qu\u00bf\u00c1\u00fd\u008d\u00bd\u00f2o%\u00cc'Ig\u00ad\u008d\u00d8\u00f1\u00e3\u001a\u00dajiN\u00a7\u00ab\u000fG\u00950\u00c6\u0088$\u008e\u000b\u00d0\u008b\u0015j\u008c\u0096`\u009c\u00e5*(\u00b12\u0097\u00f8y\u00f3a\u00f3\u00d6\r^R\u0019a\u008ct\u00b0\u00e5A\u00ff\u00e1=\u00a8\u00bc\u0004\u00e4\u00d9xu&A>\u0010*g\u00e5\u00caaK\u00bd[\u0098E\u00b7\u0010\u00e6\u00f4\u00d4\u0000(\u00abM,\u008eE%%\u00fa\u001e\u00b2\u00d0\u00bf\u00c9\u00df.P\u00c1Hhg\u001e\u00f4\u00e7\u001d\u00ba\u00b1\u008a\u00a2\u0010hH>\u0016!\u00e7'4\u0082\u009b\u0090 \u0094%\u0003\u00bf\b\u0084\u00fb\u00ef \u00caK\u00ab)\u00a2\u0005\u0092V\u00ea\u0093\u00b3\u001a\u00a0X\u0017\f\u00fd\u0013\u009a\u00be\u0016P\u00d0({\u00f6\u00b8_d\u00e6]\u001ao\u0085\u00b3\u001f\u00a0T\u00cf\u00aaY\u0094u\u00f1\u00f0v\u00eb`\u00a5\u00f2\u00ef\u00c2\u0084\u00cb{2Z6fq\u0005.\u008dX \u00d0xVG\u00eb\u001f`\u000e\u00b3\u0098\u00b5\u0013L\u00df\u00ce\u008b2\u00e6\u00ddB\u00dfdyo\u0084\u00e5\u00ce^\u009eW.\u00e9(\u00ed-`Pp\u00f8\u00ff\u00f2(\u00ca\u0014$\u009a\u001d\"\u0015\u00fa9\u007f )\u008b\u00e7n\u008e;yT\u00a9\u0018\u00a9N\u00c1\u00e6U\u000f\u0099\u00db\u0086E\u0010V\u0098#\u000f\u00f2KD\u009f<\u00bd g\u00f7\u00a0\u0001Z\u0010m\u0084S_\u00b0\u00f8F\u00acO\u0081=)\u00f8\u0098\u00f6\u00d2\u0010qA\u00ee\u00f1\u009d\u00eb6\u009b\u00db\u00de\u0012\u00fb\u00fb]#\u0092 \u0096\u001f}\u00f8'\u00ec\u00b2co\u0092>\u00fe\u00a8\u00f6\u00e2\u00ae\u0001\u0097\u00aeg\u00a4\u00ab\u00c2\u0010\u00c4\u00ed)>\u00e7\u0017\u008fV \u00b8\u00b4\u00a7\u00df\u00f4\u0091\u0019\u00f5*\u009f\u00bd\u008b|\u00c7\u00b5\u00b0Q\u00ea\u000b\u001c\u00ce\u00bc\u00e5w\u001at\u00af\u00b1\u00b4,\u00b2a\u0010[\u00b1\u00e0\u009f\u0004\u00aa\u0019p\u009dvq#\u00be=s\u00c8\u0010NW\u0002\u00e8X\u00bc\u008a\u00d2\u00ea\u008a0\u00cc<\u00ab\u0090|(sw\u00b2\u009aA\u0094K\u00b1\u00d4s\u00f5\u00e2c\u0086\u00d1X\u0013\u00e0>\u0080p\u0083\u00b0\u0086\u0002\u0001g\u00c5M\u00af\u00ac]\u0014\u00d3\u00b7u\u00b8\u00958Q(\u0016Icw\u0090\u00ebF\u00d7\u00b0mH_S\u00b0\u00f8-\u00c5\u00cb=z!\u0012\u00cc\u0097\u00a6\u0080bi\u00c0r.-h\u0097@\u008c\u0086\u00f2}R(^o\u00d1\u00b9*/\u00a3\u00bc\u0004#\u00df\\b\u00b2\u00d8\u00e8\u00bem\u00b6\u00c4%u\u00ca\u001e3{`%\u00f0\u0081\u009b\u00e3\u00dc\u00e4\u00ef\u001c\u009e\u00b0\u00ef@ \u00b2\u00ecUe\u00d5JC\u0097\u00ca\u00c1xY\u0003\u0083j\u001b\u00e9\u0012\u00b3\u00a0\u00cb\u0095\u00cepk\u00b5\u00ef\u001e\u00c3\u00b9JN\u0010g%+S\u0015\u001cuW>\u0012\u0086e\u00a5?2\u00f8\u0018\u00da7T\u0090\u0003\u00e0\n\u00f9g\u00f3L;\u00bc\\v\u0012\u009b2L\u00ac\u00a7p\u00d8\u00fe(\u00bb\t9\u00e0\"\"Z!\u0001\u00fd\u00b0\u0004\u00a8\u00dc\u00a3\u0097mp\u00d48\u00e7\u00f5%\u00da\u007f\u00b8\u008d\u00b5<\u00b8IT\u00af\u00e8>\u00be-\\\u00d1\u0003(\u00ff\u00abf/3*\u001ap\u0005\u00a9\u00d3\u001c\u0010z\u0094\u00f3v\u00fd\u001bN\u00b6\u00eb:\u00f6\u00e1\u00b8\\P\u00baU\u00a9Uz\u00f6X\u001d7E \u00bd \u0081L\u0082\u00b7\u008eew\u00d2,k\u00f0L\u00bc\u009e\"C_\u00ed\u00f0\u0007\u0017U\ry\u0007\u009e\u00c3\u00e3\u001c\u00c9\u00c9\u0088 h\u00ed\u0091\u00ca\u00b6\u00c3\u0017J` \u0088y\u0097\u00c21\u009e\u00ca\b\u001c\u00cf\u0094;&\u00c8j\u007f\u00e0kE\u00b6\u00c0\u00b1\u0010\u00a50\t\u007f\u0010\u00c6B\u0000\u00a2-\u00f4\u00bb\u00fc\u00cc<\u00aa8\u0082x\\\u00efz\u00fb5\u0096\u00e4c\u00f3\b\u00afuk\u0085a4\u00d7UXj\u00f1,\u00c2\u0018\u0019\u00fb\u00e5\u0003\u00e4\u0085\u00cf\u00dd\u00c0\u00d3\nTgZ\u00a8\u00ccI\u001c|\u008b\u00d7>\u00e4\u00a1^>\u001ac\u00bf\u00c38\u00aa\u0007(\u00ad\u0006\u00aa\u00a3ON\u0014\u0081lsV\u009a\u0096\u00bf\u00af\u00c2\u00fc\u000f\u00d6\u008e\u0091@y\u0014\u00d6f[\u00bc\u0080=Z\u00cc\u00b1\u00fa\u0000l\u00ea\u00daw\u009b\u00d0l]'\u00eb)}\u00c4D\u00c5\u00e3\u00b3\u00f9\u0010\u00d5\u0084V!\u00b0-j:\u00e7}\u00db5\u00af\u00c9\u00ea\u00d2(\u00e7\u00ed\u00ddI\r\\?\u0014\u00d9;E\u00c8\u00ad\u00df\u000f?\u0018u2Gz\u00ff\u00b0\u001e\\\u008a\u009c\u00e1T\u00b0\u00e1Z\u00f5\u00a7\u0013(\u009a\u0017&\u009a(\u00db)\u00ca\u0084\u009b^\u008b\u00e5\u000e0\u0016\u00e2,X|\u009f\u0087\u00f5\u00fa \u00a5r: \u008e\u0096u\u00ac\u00a9\u0011\u00d3W}$7m%\u001a\u00df\u00e38\u00d5\u0007\u00fc\u00e3\u00c1%\u00c1\u0081\u00ec?\u00d8\u00fb\u00e1\u009fq\u008a\u00e3P#\u00de\n\u00fc\u0089\u0088G\u0084\u00c3j\u0000\u00c9\u0001JlC\u00ae\u00134\u00e4E\u00cf:?D\u0006[\u001f\u00cb\u0013&O\u0085\u00fcX`\u00aa\u00df \u0088'\u00f5q\u00f1!<Wdt\u00d6(\u0013K\u009bA\u00c27\u008f\u00c3\u001eb\\K\u0094\u001a\u00f2\u008a\u00f1d\u00af\u001c\u0010\u00d2\u00e8s\u0097N\u00a0\u00e9o'\u00af>\u00f2\u00d1B\u00bf3 \u00dd\u00abiU\u00dcU'\u009f\u0085~2\u0098\u00df'\u0001J|\u000b\u00f3\u00d1\u0007\u001c\u00c8<\u0011\u0096\u00a1\"\u00bb\u00ear\u00d0\u0010\u00c2\\\u00eef\n\u0093{\u00fc\u00e5@\u0005T\u00b7Q`\u000e0_c\u008f\u00fa\u00b1\u00ea'\u0080\u00d9\u0092\u0081}\u00c7\u0004\u00e3\u00c3h\"\u009aZy)\u00cb\u00eam\u0085\u00f7\u00c1\\\u00c6\n!C\u0081`&\u0014K\u000e:\u00e2G\u0087M\t\u00d5\u00d5\u0002(\u00b1\r\u00ff.r\u00f6\u00bb\u00fa\u0005\u00e9Y dg\u00fc\u00bc+\u0010\u00feA\u00daq\u00b5\u00fb\u008a\u0005\"`\u0088xyPC\u009e\u00c8>%A,\u00de(:=r\u00ab7B\u00fe\u00b4 ;4\u00ac\u00da\u00ca\u00ccp\u009b\u00f9w\u0083\u00d0\u00f8G'$\u00fbr\u009aB\f\u0083p<\u00c0$vB\u00c1L?0\u00e5\u00faj\u0098\u009d\u00c9\u00bc\u00a1a\u00930\u0007\u00d1\u00bf)\u00bb@YbE!E\u00c8\u00ce\u00b1\u0096r\u000f\u00e0\u001c=\u00ee\u0083\u00ecO\u00e1|\u00e0\u00cb\u00c6H\u00ec3\u00a9\u0003\u0085]\u0089@\u0093\u00a5K\\I<\u0007\u0089\u00b2\u00d5>gE\u00c4l\u00b5c\u001e\t\u009a\u00ec9a?\u00e5+\u00a6j\u0081C\nn\u000e\u00cf\u00f7\u007f\u00f4~\u009e\u00ea\u00b9\u0095\u00f4\u00e6\u0013y\u00de\u00c24l\u008b-\u00a3\u00c0\u0006-\u00ef>&\u00b0\u0007W\u00cb\u0089";
                var6_6 = "\u0092\u0003\u00c8l\u00a7j{\u0014B\u000fA\u00cb\u009ft{<0\\\u00cc\u0085\u00e6k\u00f6\u00c2\u0000B\u00e22d^\u0093\u00fbY2=\u0087k_\u0089\u00eb\u00d1D\u00a1RrDU,G\u0012\u00efI'=G\u0094d1\n\u007f\u007f\u009c\u00f4\u00ba\u009a(\u00e0\u00f5\u0083\u0095s\u008e\u00f5G\u0013\u00c3\u00df\u000b8\u00c9\u009d\u00aa-`\u00be4Z5\u0004-N\u00b7\u0084q8)\u000b\u001c\u001f\u00d3 \u00ff\u0085\u001f\u0097\u008b\u00188\u00ea\u00f0!;\u008emcw\u0081zu\u00d7\u0092\u0096\u00fa\u00ce\u00cd1\u00e5\u00ccb\u00ea\u001a\u0010%\u00f6tf\u00d8\u00b5\u00ce\u00d7I\u00f2\u00cd\u0095\u0010\u009f\u00f1\u00ed\u0018\u0011\u0083\u0097l25lc\u0090Zo\u008e\u0097\u007f\u00ec\u00c1\u00c1O\tz\u0086RE?(\u00acT\u00e4 ?}\u00f9\u00c9=1\u00a2\u00c6\"\f\u008e\u0001\u0006\u00e7\u00a3!\u0013\u00caf}\u00b2\u001e/\u0006\u00d5AV\u00aa\u00d7\u00d1\u00cf\u0094\u001b\u0080Y\u0080(\u00eb\u009b\u00b9!0\u00bc\u00f9\f\u007f\u00a6\u009a\u00f3\u0081{\u00d5\u00d1\u00eb\u00ce=\\D^C\u001f}\u001b~_P `\u00e8\u0006{YL\u00fa\u008ag\u0080(\u0016\u00c8\u00b60\u0090]W\u00b0\u00ae\u00996\u00c8\u00d0\u0099\u00188*\n\u0014\u0090\u00aa*\u00af\t0\u007f#\u0098\u0015\u0089?\u00d6\u00b3\u00c8A \u009cC\u0019B\u0010u\u0085\u00f7;\u0016\u00bb\u00a7\u00f2au\f\f\u00f7\u0001m\u00d4\u0018\u009c\u00bb\u00ae\u0007\u00dc\u00d4\u00ad(\u00cf\"3\u008c4E\u0082r\u001e]\u00c4t\u009cD\u00b6}\u0018L\u00ad\u00b0\u0004\u00ad\u000f\u0094\u00d0\u008f\u00f9\u00ca\u0097B\u00a5\u0090\u00f2\u00b5^\u0094yh\u00b2\u00b8\u00ac\u0018\u00e3\u0098m\u00bbR\u0088\u0000M\u0094\u00b9\u00aep\u0087\u00af\u00cfP\u00a9BBEP\u00cb\u00a6A(Jwb\u00ec\u0011a\u00f8\u00f6@T\u00f7\u00b2):\u0092|\u00b5\u00d33\u0005\u0095\"\u00f2P>\u00ff\u00ca~\u00f4\u001d\u0097:M\u00b1\u00e8R\u00f5L\u00a6\u00dd(\u0092Ne:1\u00ac\u00a9\u00c6u\u00d0\n(\u0014\u00b0\u00fe\u000e\u0083\u000f\u00cd\u00f9\u00e0\u000f\u00fdxoHz\u00a5\u00d1\u00eboK\u00b1\u00d3\u0018)`M\u00b1\u00b3(=\u00d7\u00c1\u0001\u00d5[\u00f7T\u00f0\u001ai\u009f;{\u00c8\u00d1H\u00b7\u0084\u009b\u0006@H\u00b2\u00d0\u00a7\u0091\u0096\u00d8r\u00e3\u0095N\u00adx\u00e3)\u009c`\u001f\u0018\r,\u00b1\u008c\u00cd\u0080C*=\u00f9\u00d8aM\u008f\u009bwX\\\u00cf)@-\u00ec\u009a0h\\\u0011\u00d5fU\u00f0\u0096\u00cdUV\u0016{\u00f1\u0081F\u00b4^\u00ab\u00d23\u00aaGa\u00a5\u0085\u0016g\u00f3\u008c\u00ab\u0084\u00b4E\u0014b\u0017\u00c2\u00dae5\u0012\u00b5\u00b4C$o;(}H\u009e\u00ae\u008a,Z\u00ce\u0003\n\u0013Qu\u00bf\u00c1\u00fd\u008d\u00bd\u00f2o%\u00cc'Ig\u00ad\u008d\u00d8\u00f1\u00e3\u001a\u00dajiN\u00a7\u00ab\u000fG\u00950\u00c6\u0088$\u008e\u000b\u00d0\u008b\u0015j\u008c\u0096`\u009c\u00e5*(\u00b12\u0097\u00f8y\u00f3a\u00f3\u00d6\r^R\u0019a\u008ct\u00b0\u00e5A\u00ff\u00e1=\u00a8\u00bc\u0004\u00e4\u00d9xu&A>\u0010*g\u00e5\u00caaK\u00bd[\u0098E\u00b7\u0010\u00e6\u00f4\u00d4\u0000(\u00abM,\u008eE%%\u00fa\u001e\u00b2\u00d0\u00bf\u00c9\u00df.P\u00c1Hhg\u001e\u00f4\u00e7\u001d\u00ba\u00b1\u008a\u00a2\u0010hH>\u0016!\u00e7'4\u0082\u009b\u0090 \u0094%\u0003\u00bf\b\u0084\u00fb\u00ef \u00caK\u00ab)\u00a2\u0005\u0092V\u00ea\u0093\u00b3\u001a\u00a0X\u0017\f\u00fd\u0013\u009a\u00be\u0016P\u00d0({\u00f6\u00b8_d\u00e6]\u001ao\u0085\u00b3\u001f\u00a0T\u00cf\u00aaY\u0094u\u00f1\u00f0v\u00eb`\u00a5\u00f2\u00ef\u00c2\u0084\u00cb{2Z6fq\u0005.\u008dX \u00d0xVG\u00eb\u001f`\u000e\u00b3\u0098\u00b5\u0013L\u00df\u00ce\u008b2\u00e6\u00ddB\u00dfdyo\u0084\u00e5\u00ce^\u009eW.\u00e9(\u00ed-`Pp\u00f8\u00ff\u00f2(\u00ca\u0014$\u009a\u001d\"\u0015\u00fa9\u007f )\u008b\u00e7n\u008e;yT\u00a9\u0018\u00a9N\u00c1\u00e6U\u000f\u0099\u00db\u0086E\u0010V\u0098#\u000f\u00f2KD\u009f<\u00bd g\u00f7\u00a0\u0001Z\u0010m\u0084S_\u00b0\u00f8F\u00acO\u0081=)\u00f8\u0098\u00f6\u00d2\u0010qA\u00ee\u00f1\u009d\u00eb6\u009b\u00db\u00de\u0012\u00fb\u00fb]#\u0092 \u0096\u001f}\u00f8'\u00ec\u00b2co\u0092>\u00fe\u00a8\u00f6\u00e2\u00ae\u0001\u0097\u00aeg\u00a4\u00ab\u00c2\u0010\u00c4\u00ed)>\u00e7\u0017\u008fV \u00b8\u00b4\u00a7\u00df\u00f4\u0091\u0019\u00f5*\u009f\u00bd\u008b|\u00c7\u00b5\u00b0Q\u00ea\u000b\u001c\u00ce\u00bc\u00e5w\u001at\u00af\u00b1\u00b4,\u00b2a\u0010[\u00b1\u00e0\u009f\u0004\u00aa\u0019p\u009dvq#\u00be=s\u00c8\u0010NW\u0002\u00e8X\u00bc\u008a\u00d2\u00ea\u008a0\u00cc<\u00ab\u0090|(sw\u00b2\u009aA\u0094K\u00b1\u00d4s\u00f5\u00e2c\u0086\u00d1X\u0013\u00e0>\u0080p\u0083\u00b0\u0086\u0002\u0001g\u00c5M\u00af\u00ac]\u0014\u00d3\u00b7u\u00b8\u00958Q(\u0016Icw\u0090\u00ebF\u00d7\u00b0mH_S\u00b0\u00f8-\u00c5\u00cb=z!\u0012\u00cc\u0097\u00a6\u0080bi\u00c0r.-h\u0097@\u008c\u0086\u00f2}R(^o\u00d1\u00b9*/\u00a3\u00bc\u0004#\u00df\\b\u00b2\u00d8\u00e8\u00bem\u00b6\u00c4%u\u00ca\u001e3{`%\u00f0\u0081\u009b\u00e3\u00dc\u00e4\u00ef\u001c\u009e\u00b0\u00ef@ \u00b2\u00ecUe\u00d5JC\u0097\u00ca\u00c1xY\u0003\u0083j\u001b\u00e9\u0012\u00b3\u00a0\u00cb\u0095\u00cepk\u00b5\u00ef\u001e\u00c3\u00b9JN\u0010g%+S\u0015\u001cuW>\u0012\u0086e\u00a5?2\u00f8\u0018\u00da7T\u0090\u0003\u00e0\n\u00f9g\u00f3L;\u00bc\\v\u0012\u009b2L\u00ac\u00a7p\u00d8\u00fe(\u00bb\t9\u00e0\"\"Z!\u0001\u00fd\u00b0\u0004\u00a8\u00dc\u00a3\u0097mp\u00d48\u00e7\u00f5%\u00da\u007f\u00b8\u008d\u00b5<\u00b8IT\u00af\u00e8>\u00be-\\\u00d1\u0003(\u00ff\u00abf/3*\u001ap\u0005\u00a9\u00d3\u001c\u0010z\u0094\u00f3v\u00fd\u001bN\u00b6\u00eb:\u00f6\u00e1\u00b8\\P\u00baU\u00a9Uz\u00f6X\u001d7E \u00bd \u0081L\u0082\u00b7\u008eew\u00d2,k\u00f0L\u00bc\u009e\"C_\u00ed\u00f0\u0007\u0017U\ry\u0007\u009e\u00c3\u00e3\u001c\u00c9\u00c9\u0088 h\u00ed\u0091\u00ca\u00b6\u00c3\u0017J` \u0088y\u0097\u00c21\u009e\u00ca\b\u001c\u00cf\u0094;&\u00c8j\u007f\u00e0kE\u00b6\u00c0\u00b1\u0010\u00a50\t\u007f\u0010\u00c6B\u0000\u00a2-\u00f4\u00bb\u00fc\u00cc<\u00aa8\u0082x\\\u00efz\u00fb5\u0096\u00e4c\u00f3\b\u00afuk\u0085a4\u00d7UXj\u00f1,\u00c2\u0018\u0019\u00fb\u00e5\u0003\u00e4\u0085\u00cf\u00dd\u00c0\u00d3\nTgZ\u00a8\u00ccI\u001c|\u008b\u00d7>\u00e4\u00a1^>\u001ac\u00bf\u00c38\u00aa\u0007(\u00ad\u0006\u00aa\u00a3ON\u0014\u0081lsV\u009a\u0096\u00bf\u00af\u00c2\u00fc\u000f\u00d6\u008e\u0091@y\u0014\u00d6f[\u00bc\u0080=Z\u00cc\u00b1\u00fa\u0000l\u00ea\u00daw\u009b\u00d0l]'\u00eb)}\u00c4D\u00c5\u00e3\u00b3\u00f9\u0010\u00d5\u0084V!\u00b0-j:\u00e7}\u00db5\u00af\u00c9\u00ea\u00d2(\u00e7\u00ed\u00ddI\r\\?\u0014\u00d9;E\u00c8\u00ad\u00df\u000f?\u0018u2Gz\u00ff\u00b0\u001e\\\u008a\u009c\u00e1T\u00b0\u00e1Z\u00f5\u00a7\u0013(\u009a\u0017&\u009a(\u00db)\u00ca\u0084\u009b^\u008b\u00e5\u000e0\u0016\u00e2,X|\u009f\u0087\u00f5\u00fa \u00a5r: \u008e\u0096u\u00ac\u00a9\u0011\u00d3W}$7m%\u001a\u00df\u00e38\u00d5\u0007\u00fc\u00e3\u00c1%\u00c1\u0081\u00ec?\u00d8\u00fb\u00e1\u009fq\u008a\u00e3P#\u00de\n\u00fc\u0089\u0088G\u0084\u00c3j\u0000\u00c9\u0001JlC\u00ae\u00134\u00e4E\u00cf:?D\u0006[\u001f\u00cb\u0013&O\u0085\u00fcX`\u00aa\u00df \u0088'\u00f5q\u00f1!<Wdt\u00d6(\u0013K\u009bA\u00c27\u008f\u00c3\u001eb\\K\u0094\u001a\u00f2\u008a\u00f1d\u00af\u001c\u0010\u00d2\u00e8s\u0097N\u00a0\u00e9o'\u00af>\u00f2\u00d1B\u00bf3 \u00dd\u00abiU\u00dcU'\u009f\u0085~2\u0098\u00df'\u0001J|\u000b\u00f3\u00d1\u0007\u001c\u00c8<\u0011\u0096\u00a1\"\u00bb\u00ear\u00d0\u0010\u00c2\\\u00eef\n\u0093{\u00fc\u00e5@\u0005T\u00b7Q`\u000e0_c\u008f\u00fa\u00b1\u00ea'\u0080\u00d9\u0092\u0081}\u00c7\u0004\u00e3\u00c3h\"\u009aZy)\u00cb\u00eam\u0085\u00f7\u00c1\\\u00c6\n!C\u0081`&\u0014K\u000e:\u00e2G\u0087M\t\u00d5\u00d5\u0002(\u00b1\r\u00ff.r\u00f6\u00bb\u00fa\u0005\u00e9Y dg\u00fc\u00bc+\u0010\u00feA\u00daq\u00b5\u00fb\u008a\u0005\"`\u0088xyPC\u009e\u00c8>%A,\u00de(:=r\u00ab7B\u00fe\u00b4 ;4\u00ac\u00da\u00ca\u00ccp\u009b\u00f9w\u0083\u00d0\u00f8G'$\u00fbr\u009aB\f\u0083p<\u00c0$vB\u00c1L?0\u00e5\u00faj\u0098\u009d\u00c9\u00bc\u00a1a\u00930\u0007\u00d1\u00bf)\u00bb@YbE!E\u00c8\u00ce\u00b1\u0096r\u000f\u00e0\u001c=\u00ee\u0083\u00ecO\u00e1|\u00e0\u00cb\u00c6H\u00ec3\u00a9\u0003\u0085]\u0089@\u0093\u00a5K\\I<\u0007\u0089\u00b2\u00d5>gE\u00c4l\u00b5c\u001e\t\u009a\u00ec9a?\u00e5+\u00a6j\u0081C\nn\u000e\u00cf\u00f7\u007f\u00f4~\u009e\u00ea\u00b9\u0095\u00f4\u00e6\u0013y\u00de\u00c24l\u008b-\u00a3\u00c0\u0006-\u00ef>&\u00b0\u0007W\u00cb\u0089".length();
                var3_7 = 16;
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
                    var7_3[var5_4++] = crp.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00bb\u0086\u00b4\u0005\u00c2\u00a7K\u00ce\u00b8\u00a8\u009bq9\u0082\u0013f./\u00c1\u00b0\u008cA\u00bc\u00ce f\u00df\u0018jL\u00d9\u00b6-@B\u00ad\u0089\u0019\u00887\f\u00b7\u00a4H6\u000b+\u00ee\u00aa\u00d9\n\u00f1\u00fa\u00a0\u0097\u00e0v\u000e\u0087\u00df|\u00fc\u0089\u00b5 \u0081\u0082H\u0006\u0085\u0086\u0018K\u001d\u00a7=\u00d9\u00d1\u00c5\u00c85\tg\u0000\u0014\u00ba\u0083\u00f4X\u00bc\u00fbbm\u00f4\u00c7\u0014%";
                    var6_6 = "\u00bb\u0086\u00b4\u0005\u00c2\u00a7K\u00ce\u00b8\u00a8\u009bq9\u0082\u0013f./\u00c1\u00b0\u008cA\u00bc\u00ce f\u00df\u0018jL\u00d9\u00b6-@B\u00ad\u0089\u0019\u00887\f\u00b7\u00a4H6\u000b+\u00ee\u00aa\u00d9\n\u00f1\u00fa\u00a0\u0097\u00e0v\u000e\u0087\u00df|\u00fc\u0089\u00b5 \u0081\u0082H\u0006\u0085\u0086\u0018K\u001d\u00a7=\u00d9\u00d1\u00c5\u00c85\tg\u0000\u0014\u00ba\u0083\u00f4X\u00bc\u00fbbm\u00f4\u00c7\u0014%".length();
                    var3_7 = 64;
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
                    var7_3[var5_4++] = crp.a(var8_9).intern();
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
        crp.b = var7_3;
        crp.c = new String[61];
        crp.h7c = LogManager.getLogger();
        crp.zbm = new gdz((String)crp.a("j", (int)23366, (long)(6156436209004907521L ^ var9)));
        crp.jnk = new gdz((String)crp.a("j", (int)13232, (long)(2749163778414535933L ^ var9)));
        crp.fda = new gdz((String)crp.a("j", (int)24805, (long)(8430560245304833928L ^ var9)));
        crp.kr7 = new gdz((String)crp.a("j", (int)24445, (long)(3441770236636432443L ^ var9)));
        crp.s2a = new gdz((String)crp.a("j", (int)22349, (long)(2856051921312317468L ^ var9)));
        crp.mgk = Collections.unmodifiableSet(new HashSet<vt2>(Arrays.asList(vt2.vbu)));
        crp.pp5 = 0;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3124;
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
                throw new RuntimeException("crp", exception);
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
            crp.c[n2] = crp.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = crp.a(n, l);
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
            throw new RuntimeException("crp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(crp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

