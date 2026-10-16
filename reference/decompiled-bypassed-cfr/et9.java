/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;

public class et9 {
    public static int fpm = Integer.MIN_VALUE;

    public static void hqd(mz2 mz22, yw3 yw32, lg9 lg92) {
        block5: {
            lg9 lg93;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        lg93 = lg92;
                        if (n == 0) break block4;
                        if (lg93.xii()) break block5;
                    }
                    catch (v1f v1f2) {
                        throw et9.a(v1f2);
                    }
                    lg93 = lg92;
                }
                catch (v1f v1f3) {
                    throw et9.a(v1f3);
                }
            }
            lg93.acd(new et9$1(mz22, yw32));
            throw v1f.ln6;
        }
        et9.adc(mz22);
    }

    /*
     * Unable to fully structure code
     */
    public static void adc(mz2 var0) {
        block17: {
            block18: {
                block16: {
                    block14: {
                        block15: {
                            var1_1 = t9d.b();
                            try {
                                try {
                                    v0 = var0 instanceof S08PacketPlayerPosLook;
                                    if (var1_1 == 0) break block14;
                                    if (v0 == 0) break block15;
                                }
                                catch (v1f v1) {
                                    throw et9.a(v1);
                                }
                                hxt.hm6().guk();
                            }
                            catch (v1f v2) {
                                throw et9.a(v2);
                            }
                        }
                        v0 = var0 instanceof S07PacketRespawn;
                    }
                    try {
                        if (var1_1 == 0) break block16;
                        if (v0 != 0) {
                        }
                        ** GOTO lbl28
                    }
                    catch (v1f v3) {
                        throw et9.a(v3);
                    }
                    var2_2 = (S07PacketRespawn)var0;
                    try {
                        et9.fpm = var2_2.qti();
                        if (var1_1 != 0) break block17;
lbl28:
                        // 2 sources

                        v0 = var0 instanceof S01PacketJoinGame;
                    }
                    catch (v1f v4) {
                        throw et9.a(v4);
                    }
                }
                try {
                    if (var1_1 == 0) break block18;
                    if (v0 != 0) {
                    }
                    ** GOTO lbl44
                }
                catch (v1f v5) {
                    throw et9.a(v5);
                }
                var2_2 = (S01PacketJoinGame)var0;
                try {
                    et9.fpm = var2_2.z6k();
                    if (var1_1 != 0) break block17;
lbl44:
                    // 2 sources

                    v0 = -2147483648;
                }
                catch (v1f v6) {
                    throw et9.a(v6);
                }
            }
            et9.fpm = v0;
        }
    }

    private static v1f a(v1f v1f2) {
        return v1f2;
    }
}

