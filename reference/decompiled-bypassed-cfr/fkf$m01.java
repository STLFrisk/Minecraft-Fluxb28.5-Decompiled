/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import org.lwjgl.input.Mouse;

public class fkf$m01 {
    public boolean rhh;
    private int y03;

    public fkf$m01(int n) {
        this.y03 = n;
    }

    public boolean mxf() {
        boolean bl;
        block10: {
            block11: {
                block8: {
                    fkf$m01 fkf$m01;
                    block9: {
                        int n = t9d.c();
                        try {
                            try {
                                try {
                                    try {
                                        fkf$m01 = this;
                                        if (n != 0) break block8;
                                        if (!Mouse.isButtonDown((int)fkf$m01.y03)) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw fkf$m01.a(oov2);
                                    }
                                    bl = this.rhh;
                                    if (n != 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw fkf$m01.a(oov3);
                                }
                                if (bl) break block11;
                            }
                            catch (oov oov4) {
                                throw fkf$m01.a(oov4);
                            }
                            this.rhh = true;
                            return true;
                        }
                        catch (oov oov5) {
                            throw fkf$m01.a(oov5);
                        }
                    }
                    fkf$m01 = this;
                }
                fkf$m01.rhh = false;
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

