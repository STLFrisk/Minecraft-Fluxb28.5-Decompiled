/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import net.optifine.render.VboRange;
import net.optifine.render.VboRegion;
import org.lwjgl.opengl.GL11;

public class fab {
    private /* synthetic */ int cnu;
    private final /* synthetic */ be7 oi4;
    private /* synthetic */ int nx5;
    private /* synthetic */ VboRegion eht;
    private /* synthetic */ VboRange za6;
    private /* synthetic */ int dqh;

    public fab(be7 be72) {
        this.oi4 = be72;
        this.cnu = gis.q58();
    }

    public void qez() {
        gis.h99(gis.m0a, this.cnu);
    }

    public void err(ByteBuffer byteBuffer) {
        block8: {
            block6: {
                int n = t9d.c();
                try {
                    fab fab2;
                    block7: {
                        try {
                            try {
                                fab2 = this;
                                if (n != 0) break block6;
                                if (fab2.eht == null) break block7;
                            }
                            catch (oov oov2) {
                                throw fab.a(oov2);
                            }
                            this.eht.bufferData(byteBuffer, this.za6);
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw fab.a(oov3);
                        }
                    }
                    this.qez();
                    gis._3z(gis.m0a, byteBuffer, 35044);
                    this.hk8();
                    fab2 = this;
                }
                catch (oov oov4) {
                    throw fab.a(oov4);
                }
            }
            fab2.nx5 = byteBuffer.limit() / this.oi4.vy7();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void stg(int var1_1) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var2_2 = t9d.b();
                        try {
                            v0 = this;
                            if (var2_2 == 0) break block10;
                            if (v0.dqh <= 0) break block11;
                        }
                        catch (oov v1) {
                            throw fab.a(v1);
                        }
                        var1_1 = this.dqh;
                    }
                    v0 = this;
                }
                try {
                    try {
                        v2 = v0.eht;
                        if (var2_2 == 0) break block12;
                        if (v2 != null) {
                        }
                        ** GOTO lbl30
                    }
                    catch (oov v3) {
                        throw fab.a(v3);
                    }
                    v2 = this.eht;
                }
                catch (oov v4) {
                    throw fab.a(v4);
                }
            }
            try {
                v2.drawArrays(var1_1, this.za6);
                if (var2_2 != 0) break block13;
lbl30:
                // 2 sources

                GL11.glDrawArrays((int)var1_1, (int)0, (int)this.nx5);
            }
            catch (oov v5) {
                throw fab.a(v5);
            }
        }
    }

    public void hk8() {
        gis.h99(gis.m0a, 0);
    }

    public void v24() {
        block5: {
            int n;
            block4: {
                int n2 = t9d.b();
                try {
                    try {
                        n = this.cnu;
                        if (n2 == 0) break block4;
                        if (n < 0) break block5;
                    }
                    catch (oov oov2) {
                        throw fab.a(oov2);
                    }
                    n = this.cnu;
                }
                catch (oov oov3) {
                    throw fab.a(oov3);
                }
            }
            gis.a0f(n);
            this.cnu = -1;
        }
    }

    public void fb5(VboRegion vboRegion) {
        try {
            if (vboRegion != null) {
                this.v24();
                this.eht = vboRegion;
                this.za6 = new VboRange();
            }
        }
        catch (oov oov2) {
            throw fab.a(oov2);
        }
    }

    public VboRegion qb8() {
        return this.eht;
    }

    public VboRange ox9() {
        return this.za6;
    }

    public int kw2() {
        return this.dqh;
    }

    public void b9v(int n) {
        this.dqh = n;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

