/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class bzt
implements ji7 {
    private /* synthetic */ int[] _ce;
    private /* synthetic */ int bsx;
    private /* synthetic */ int gt8;

    /*
     * Unable to fully structure code
     */
    @Override
    public BufferedImage parseUserSkin(BufferedImage var1_1) {
        block18: {
            block19: {
                block15: {
                    block16: {
                        var2_2 = t9d.b();
                        try {
                            try {
                                v0 = var1_1;
                                if (var2_2 == 0) break block15;
                                if (v0 != null) break block16;
                            }
                            catch (oov v1) {
                                throw bzt.a(v1);
                            }
                            return null;
                        }
                        catch (oov v2) {
                            throw bzt.a(v2);
                        }
                    }
                    this.bsx = 64;
                    this.gt8 = 64;
                    v0 = var1_1;
                }
                var3_3 = v0.getWidth();
                var4_4 = var1_1.getHeight();
                var5_5 = 1;
                do {
                    block17: {
                        if (this.bsx < var3_3) ** GOTO lbl36
                        try {
                            try {
                                try {
                                    v3 = this.gt8;
                                    v4 = var4_4;
                                    if (var2_2 == 0 || var2_2 == 0) break block17;
                                }
                                catch (oov v5) {
                                    throw bzt.a(v5);
                                }
                                if (v3 >= v4) break;
                            }
                            catch (oov v6) {
                                throw bzt.a(v6);
                            }
lbl36:
                            // 2 sources

                            this.bsx *= 2;
                            this.gt8 *= 2;
                            v3 = var5_5;
                            v4 = 2;
                        }
                        catch (oov v7) {
                            throw bzt.a(v7);
                        }
                    }
                    var5_5 = v3 * v4;
                } while (var2_2 != 0);
                var6_6 = new BufferedImage(this.bsx, this.gt8, 2);
                var7_7 = var6_6.getGraphics();
                try {
                    try {
                        var7_7.drawImage(var1_1, 0, 0, null);
                        v8 = var1_1;
                        if (var2_2 == 0) break block18;
                        if (v8.getHeight() != 32 * var5_5) break block19;
                    }
                    catch (oov v9) {
                        throw bzt.a(v9);
                    }
                    var7_7.drawImage(var6_6, 24 * var5_5, 48 * var5_5, 20 * var5_5, 52 * var5_5, 4 * var5_5, 16 * var5_5, 8 * var5_5, 20 * var5_5, null);
                    var7_7.drawImage(var6_6, 28 * var5_5, 48 * var5_5, 24 * var5_5, 52 * var5_5, 8 * var5_5, 16 * var5_5, 12 * var5_5, 20 * var5_5, null);
                    var7_7.drawImage(var6_6, 20 * var5_5, 52 * var5_5, 16 * var5_5, 64 * var5_5, 8 * var5_5, 20 * var5_5, 12 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 24 * var5_5, 52 * var5_5, 20 * var5_5, 64 * var5_5, 4 * var5_5, 20 * var5_5, 8 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 28 * var5_5, 52 * var5_5, 24 * var5_5, 64 * var5_5, 0 * var5_5, 20 * var5_5, 4 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 32 * var5_5, 52 * var5_5, 28 * var5_5, 64 * var5_5, 12 * var5_5, 20 * var5_5, 16 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 40 * var5_5, 48 * var5_5, 36 * var5_5, 52 * var5_5, 44 * var5_5, 16 * var5_5, 48 * var5_5, 20 * var5_5, null);
                    var7_7.drawImage(var6_6, 44 * var5_5, 48 * var5_5, 40 * var5_5, 52 * var5_5, 48 * var5_5, 16 * var5_5, 52 * var5_5, 20 * var5_5, null);
                    var7_7.drawImage(var6_6, 36 * var5_5, 52 * var5_5, 32 * var5_5, 64 * var5_5, 48 * var5_5, 20 * var5_5, 52 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 40 * var5_5, 52 * var5_5, 36 * var5_5, 64 * var5_5, 44 * var5_5, 20 * var5_5, 48 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 44 * var5_5, 52 * var5_5, 40 * var5_5, 64 * var5_5, 40 * var5_5, 20 * var5_5, 44 * var5_5, 32 * var5_5, null);
                    var7_7.drawImage(var6_6, 48 * var5_5, 52 * var5_5, 44 * var5_5, 64 * var5_5, 52 * var5_5, 20 * var5_5, 56 * var5_5, 32 * var5_5, null);
                }
                catch (oov v10) {
                    throw bzt.a(v10);
                }
            }
            var7_7.dispose();
            this._ce = ((DataBufferInt)var6_6.getRaster().getDataBuffer()).getData();
            this.ob6(0 * var5_5, 0 * var5_5, 32 * var5_5, 16 * var5_5);
            this.ybu(32 * var5_5, 0 * var5_5, 64 * var5_5, 32 * var5_5);
            this.ob6(0 * var5_5, 16 * var5_5, 64 * var5_5, 32 * var5_5);
            this.ybu(0 * var5_5, 32 * var5_5, 16 * var5_5, 48 * var5_5);
            this.ybu(16 * var5_5, 32 * var5_5, 40 * var5_5, 48 * var5_5);
            this.ybu(40 * var5_5, 32 * var5_5, 56 * var5_5, 48 * var5_5);
            this.ybu(0 * var5_5, 48 * var5_5, 16 * var5_5, 64 * var5_5);
            this.ob6(16 * var5_5, 48 * var5_5, 48 * var5_5, 64 * var5_5);
            this.ybu(48 * var5_5, 48 * var5_5, 64 * var5_5, 64 * var5_5);
            v8 = var6_6;
        }
        return v8;
    }

    @Override
    public void skinAvailable() {
    }

    private void ybu(int n, int n2, int n3, int n4) {
        block8: {
            int n5;
            int n6;
            block7: {
                int n7;
                n6 = t9d.b();
                try {
                    n7 = this.qtk(n, n2, n3, n4);
                    if (n6 == 0) break block7;
                    if (n7 != 0) break block8;
                }
                catch (oov oov2) {
                    throw bzt.a(oov2);
                }
                n7 = n5 = n;
            }
            while (n5 < n3) {
                block9: {
                    for (int i = n2; i < n4; ++i) {
                        try {
                            int n8 = n5 + i * this.bsx;
                            this._ce[n8] = this._ce[n8] & 0xFFFFFF;
                            if (n6 != 0) {
                                if (n6 != 0) continue;
                                break;
                            }
                            break block9;
                        }
                        catch (oov oov3) {
                            throw bzt.a(oov3);
                        }
                    }
                    ++n5;
                }
                if (n6 != 0) continue;
            }
        }
    }

    private void ob6(int n, int n2, int n3, int n4) {
        int n5 = t9d.b();
        int n6 = n;
        while (n6 < n3) {
            block5: {
                for (int i = n2; i < n4; ++i) {
                    try {
                        int n7 = n6 + i * this.bsx;
                        this._ce[n7] = this._ce[n7] | 0xFF000000;
                        if (n5 != 0) {
                            if (n5 != 0) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (oov oov2) {
                        throw bzt.a(oov2);
                    }
                }
                ++n6;
            }
            if (n5 != 0) continue;
        }
    }

    private boolean qtk(int n, int n2, int n3, int n4) {
        int n5;
        block8: {
            int n6 = t9d.b();
            int n7 = n;
            block4: while (true) {
                int n8 = n7;
                int n9 = n3;
                block5: while (n8 < n9) {
                    n5 = n2;
                    if (n6 == 0) break block8;
                    int n10 = n5;
                    while (n10 < n4) {
                        block9: {
                            int n11 = this._ce[n7 + n10 * this.bsx];
                            try {
                                if (n6 == 0) break block9;
                                n8 = n11 >> 24 & 0xFF;
                                n9 = 128;
                                if (n6 == 0) continue block5;
                            }
                            catch (oov oov2) {
                                throw bzt.a(oov2);
                            }
                            try {
                                if (n8 < n9) {
                                    return true;
                                }
                            }
                            catch (oov oov3) {
                                throw bzt.a(oov3);
                            }
                            ++n10;
                        }
                        if (n6 != 0) continue;
                    }
                    ++n7;
                    if (n6 != 0) continue block4;
                }
                break;
            }
            n5 = 0;
        }
        return n5 != 0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

