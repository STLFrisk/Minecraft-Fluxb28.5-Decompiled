/*
 * Decompiled with CFR 0.152.
 */
public class fkf$r79 {
    public _aj bv5;
    public float fcm;
    public float rbx;
    public final fkf a07;

    public fkf$r79(fkf fkf2, _aj _aj2) {
        this.a07 = fkf2;
        this.bv5 = _aj2;
    }

    public void tmz(float f, float f2) {
        jsr.rs4.fzf(this.bv5.name(), f + 25.0f, f2 + 6.5f, z7e.a2_.k0y);
        jsr.mxa.fzf(this.bv5.h2b, f + 10.0f, f2 + 8.0f, z7e.a2_.k0y);
    }

    public void g2i(float f, float f2) {
        this.fcm = f;
        this.rbx = f2;
        jsr.rs4.fzf(this.bv5.name(), f + 25.0f, f2 + 6.5f, z7e.kks.k0y);
        jsr.mxa.fzf(this.bv5.h2b, f + 10.0f, f2 + 8.0f, z7e.kks.k0y);
    }

    public void x5_(int n, int n2) {
        block12: {
            int n3;
            block13: {
                fkf fkf2;
                block11: {
                    n3 = t9d.b();
                    try {
                        try {
                            fkf2 = this.a07;
                            if (n3 == 0) break block11;
                            if (!fkf2.imv(n, n2, this.fcm - 0.5f, this.rbx, this.fcm + 99.5f, this.rbx + 25.0f)) break block12;
                        }
                        catch (oov oov2) {
                            throw fkf$r79.a(oov2);
                        }
                        fkf2 = zwr.qkk.ch4();
                    }
                    catch (oov oov3) {
                        throw fkf$r79.a(oov3);
                    }
                }
                try {
                    try {
                        if (n3 == 0) break block13;
                        if (fkf2.h6q == this) break block12;
                    }
                    catch (oov oov4) {
                        throw fkf$r79.a(oov4);
                    }
                    fkf2 = zwr.qkk.ch4();
                }
                catch (oov oov5) {
                    throw fkf$r79.a(oov5);
                }
            }
            fkf2.h6q = this;
            for (ar7 ar72 : kgt.vuo) {
                float f;
                block15: {
                    block14: {
                        try {
                            ar7 ar73 = ar72;
                            if (!ar72.klu()) break block14;
                            f = 218.0f;
                            break block15;
                        }
                        catch (oov oov6) {
                            throw fkf$r79.a(oov6);
                        }
                    }
                    f = 222.0f;
                }
                ar73.l7d = f;
                ar72.abe.lna(0.0f);
                if (n3 != 0) continue;
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

