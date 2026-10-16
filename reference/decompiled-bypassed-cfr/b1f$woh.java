/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class b1f$woh {
    private List w0z = Lists.newArrayList();
    public boolean uiv;

    public synchronized boolean _t3() {
        return this.uiv;
    }

    public synchronized void acf() {
        this.uiv = false;
    }

    public synchronized List kka() {
        return Collections.unmodifiableList(this.w0z);
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void kig(String var1_1, InetAddress var2_2) {
        block20: {
            block23: {
                block21: {
                    block19: {
                        var4_3 = o80.zmu(var1_1);
                        var5_4 = o80.ja3(var1_1);
                        var3_5 = t9d.b();
                        try {
                            try {
                                v0 = var5_4;
                                if (var3_5 == 0) break block19;
                                if (v0 != null) {
                                }
                                break block20;
                            }
                            catch (oov v1) {
                                throw b1f$woh.a(v1);
                            }
                            v0 = var2_2.getHostAddress() + ":" + var5_4;
                        }
                        catch (oov v2) {
                            throw b1f$woh.a(v2);
                        }
                    }
                    var5_4 = v0;
                    var6_6 = false;
                    for (b1f$pll var8_8 : this.w0z) {
                        block22: {
                            try {
                                try {
                                    try {
                                        v3 = var8_8.tqj().equals(var5_4);
                                        if (var3_5 == 0) break block21;
                                        if (var3_5 == 0) break block22;
                                    }
                                    catch (oov v4) {
                                        throw b1f$woh.a(v4);
                                    }
                                    if (v3) {
                                    }
                                    ** GOTO lbl44
                                }
                                catch (oov v5) {
                                    throw b1f$woh.a(v5);
                                }
                                var8_8.l0x();
                                v6 = true;
                            }
                            catch (oov v7) {
                                throw b1f$woh.a(v7);
                            }
                        }
                        var6_6 = v6;
                        try {
                            if (var3_5 != 0) break;
lbl44:
                            // 2 sources

                            if (var3_5 != 0) continue;
                            break;
                        }
                        catch (oov v8) {
                            throw b1f$woh.a(v8);
                        }
                    }
                    v3 = var6_6;
                }
                try {
                    try {
                        if (var3_5 == 0) break block23;
                        if (v3) break block20;
                    }
                    catch (oov v9) {
                        throw b1f$woh.a(v9);
                    }
                    v3 = this.w0z.add(new b1f$pll(var4_3, var5_4));
                }
                catch (oov v10) {
                    throw b1f$woh.a(v10);
                }
            }
            this.uiv = true;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

