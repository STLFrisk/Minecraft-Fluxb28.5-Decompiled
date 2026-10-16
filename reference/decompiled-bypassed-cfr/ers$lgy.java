/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import org.lwjgl.input.Mouse;

public class ers$lgy {
    public boolean lxx;
    private int fc6;
    public final ers dep;

    public ers$lgy(ers ers2, int n) {
        this.dep = ers2;
        this.fc6 = n;
    }

    public boolean z0p() {
        boolean bl;
        block10: {
            block11: {
                block8: {
                    ers$lgy ers$lgy;
                    block9: {
                        int n = t9d.c();
                        try {
                            try {
                                try {
                                    try {
                                        ers$lgy = this;
                                        if (n != 0) break block8;
                                        if (!Mouse.isButtonDown((int)ers$lgy.fc6)) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw ers$lgy.a(oov2);
                                    }
                                    bl = this.lxx;
                                    if (n != 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw ers$lgy.a(oov3);
                                }
                                if (bl) break block11;
                            }
                            catch (oov oov4) {
                                throw ers$lgy.a(oov4);
                            }
                            this.lxx = true;
                            return true;
                        }
                        catch (oov oov5) {
                            throw ers$lgy.a(oov5);
                        }
                    }
                    ers$lgy = this;
                }
                ers$lgy.lxx = false;
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

