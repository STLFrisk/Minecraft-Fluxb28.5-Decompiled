/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbv
implements dxd$v9l {
    private static final Logger _3c;
    private static final ThreadPoolExecutor vgs;
    private static final gdz g9w;
    private static final gdz co8;
    private final s9r f8i;
    private final c05 yf_;
    private final r1l zb7;
    private final gdz huf;
    private String k0g;
    private p9u uw6;
    private long llq;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public bbv(s9r s9r2, r1l r1l2) {
        long l = a ^ 0x334587A8D242L;
        this.f8i = s9r2;
        this.zb7 = r1l2;
        this.yf_ = c05.vz1();
        this.huf = new gdz((String)((Object)bbv.a("p", (int)22597, (long)(0x3AD6A9E70ABE854BL ^ l))) + r1l2.s4c + (String)((Object)bbv.a("p", (int)2187, (long)(0x5A1C979A7CF55587L ^ l))));
        this.uw6 = (p9u)this.yf_.l22().dry(this.huf);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void is9(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, boolean var8_8) {
        block200: {
            block210: {
                block209: {
                    block205: {
                        block206: {
                            block207: {
                                block201: {
                                    block202: {
                                        block203: {
                                            block198: {
                                                block197: {
                                                    block196: {
                                                        block193: {
                                                            block195: {
                                                                block192: {
                                                                    block190: {
                                                                        block188: {
                                                                            block189: {
                                                                                block212: {
                                                                                    block187: {
                                                                                        block186: {
                                                                                            block178: {
                                                                                                block179: {
                                                                                                    block213: {
                                                                                                        block181: {
                                                                                                            block185: {
                                                                                                                block184: {
                                                                                                                    block183: {
                                                                                                                        block182: {
                                                                                                                            block180: {
                                                                                                                                block174: {
                                                                                                                                    block175: {
                                                                                                                                        block177: {
                                                                                                                                            block176: {
                                                                                                                                                block173: {
                                                                                                                                                    block172: {
                                                                                                                                                        block169: {
                                                                                                                                                            block171: {
                                                                                                                                                                block170: {
                                                                                                                                                                    block167: {
                                                                                                                                                                        block168: {
                                                                                                                                                                            block165: {
                                                                                                                                                                                block166: {
                                                                                                                                                                                    block163: {
                                                                                                                                                                                        block164: {
                                                                                                                                                                                            var9_9 = bbv.a ^ 81434781518596L;
                                                                                                                                                                                            var11_10 = t9d.c();
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v0 = this.zb7.mu_;
                                                                                                                                                                                                    if (var11_10 != 0) break block163;
                                                                                                                                                                                                    if (v0 != 0) break block164;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (oov v1) {
                                                                                                                                                                                                    throw bbv.a(v1);
                                                                                                                                                                                                }
                                                                                                                                                                                                this.zb7.mu_ = true;
                                                                                                                                                                                                this.zb7.zab = -2L;
                                                                                                                                                                                                this.zb7.o_g = "";
                                                                                                                                                                                                this.zb7.y17 = "";
                                                                                                                                                                                                bbv.vgs.submit(new bbv$1(this));
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (oov v2) {
                                                                                                                                                                                                throw bbv.a(v2);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        v0 = this.zb7.e39;
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            if (var11_10 != 0) break block165;
                                                                                                                                                                                            if (v0 <= 47) break block166;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (oov v3) {
                                                                                                                                                                                            throw bbv.a(v3);
                                                                                                                                                                                        }
                                                                                                                                                                                        v0 = 1;
                                                                                                                                                                                        break block165;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v4) {
                                                                                                                                                                                        throw bbv.a(v4);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                v0 = 0;
                                                                                                                                                                            }
                                                                                                                                                                            var12_11 = v0;
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    v5 = this.zb7.e39;
                                                                                                                                                                                    if (var11_10 != 0) break block167;
                                                                                                                                                                                    if (v5 >= 47) break block168;
                                                                                                                                                                                }
                                                                                                                                                                                catch (oov v6) {
                                                                                                                                                                                    throw bbv.a(v6);
                                                                                                                                                                                }
                                                                                                                                                                                v5 = 1;
                                                                                                                                                                                break block167;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v7) {
                                                                                                                                                                                throw bbv.a(v7);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        v5 = 0;
                                                                                                                                                                    }
                                                                                                                                                                    var13_12 = v5;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                v8 = var12_11;
                                                                                                                                                                                if (var11_10 != 0) break block169;
                                                                                                                                                                                if (v8 != 0) break block170;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v9) {
                                                                                                                                                                                throw bbv.a(v9);
                                                                                                                                                                            }
                                                                                                                                                                            v8 = var13_12;
                                                                                                                                                                            if (var11_10 != 0) break block169;
                                                                                                                                                                        }
                                                                                                                                                                        catch (oov v10) {
                                                                                                                                                                            throw bbv.a(v10);
                                                                                                                                                                        }
                                                                                                                                                                        if (v8 == 0) break block171;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov v11) {
                                                                                                                                                                        throw bbv.a(v11);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v8 = 1;
                                                                                                                                                                break block169;
                                                                                                                                                            }
                                                                                                                                                            v8 = 0;
                                                                                                                                                        }
                                                                                                                                                        var14_13 = v8;
                                                                                                                                                        this.yf_.tx1.eh6(this.zb7.bx0, var2_2 + 32 + 3, var3_3 + 1, 0xFFFFFF);
                                                                                                                                                        var15_14 = this.yf_.tx1.g8u(this.zb7.o_g, var4_4 - 32 - 2);
                                                                                                                                                        for (var16_15 = 0; var16_15 < Math.min(var15_14.size(), 2); ++var16_15) {
                                                                                                                                                            try {
                                                                                                                                                                this.yf_.tx1.eh6((String)var15_14.get(var16_15), var2_2 + 32 + 3, var3_3 + 12 + this.yf_.tx1.rr7 * var16_15, 0x808080);
                                                                                                                                                                if (var11_10 == 0) {
                                                                                                                                                                    if (var11_10 == 0) continue;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                break block172;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v12) {
                                                                                                                                                                throw bbv.a(v12);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (var14_13 == 0) break block172;
                                                                                                                                                            v13 = (Object)syo.id3 + this.zb7.o5_;
                                                                                                                                                            break block173;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v14) {
                                                                                                                                                            throw bbv.a(v14);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v13 = this.zb7.y17;
                                                                                                                                                }
                                                                                                                                                var16_16 = v13;
                                                                                                                                                var17_17 = this.yf_.tx1.ezt(var16_16);
                                                                                                                                                this.yf_.tx1.eh6(var16_16, var2_2 + var4_4 - var17_17 - 15 - 2, var3_3 + 1, 0x808080);
                                                                                                                                                var18_18 = 0;
                                                                                                                                                var19_19 = null;
                                                                                                                                                try {
                                                                                                                                                    v15 = var14_13;
                                                                                                                                                    if (var11_10 != 0) break block174;
                                                                                                                                                    if (v15 == 0) break block175;
                                                                                                                                                }
                                                                                                                                                catch (oov v16) {
                                                                                                                                                    throw bbv.a(v16);
                                                                                                                                                }
                                                                                                                                                var20_20 = 5;
                                                                                                                                                try {
                                                                                                                                                    if (var12_11 == 0) break block176;
                                                                                                                                                    v17 = bbv.a("p", (int)21286, (long)(2658335982246123369L ^ var9_9));
                                                                                                                                                    break block177;
                                                                                                                                                }
                                                                                                                                                catch (oov v18) {
                                                                                                                                                    throw bbv.a(v18);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v17 = bbv.a("p", (int)24545, (long)(7264470152318376874L ^ var9_9));
                                                                                                                                        }
                                                                                                                                        var21_21 = v17;
                                                                                                                                        var19_19 = this.zb7.pmw;
                                                                                                                                        break block212;
                                                                                                                                    }
                                                                                                                                    v15 = (int)this.zb7.mu_;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (var11_10 != 0) break block178;
                                                                                                                                                    if (v15 == 0) break block179;
                                                                                                                                                }
                                                                                                                                                catch (oov v19) {
                                                                                                                                                    throw bbv.a(v19);
                                                                                                                                                }
                                                                                                                                                cfr_temp_0 = this.zb7.zab - -2L;
                                                                                                                                                v15 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                                                                if (var11_10 != 0) break block178;
                                                                                                                                            }
                                                                                                                                            catch (oov v20) {
                                                                                                                                                throw bbv.a(v20);
                                                                                                                                            }
                                                                                                                                            if (v15 == 0) break block179;
                                                                                                                                        }
                                                                                                                                        catch (oov v21) {
                                                                                                                                            throw bbv.a(v21);
                                                                                                                                        }
                                                                                                                                        cfr_temp_1 = this.zb7.zab - 0L;
                                                                                                                                        v22 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                                                                                        if (var11_10 != 0) break block180;
                                                                                                                                    }
                                                                                                                                    catch (oov v23) {
                                                                                                                                        throw bbv.a(v23);
                                                                                                                                    }
                                                                                                                                    if (v22 < 0) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl171
                                                                                                                                }
                                                                                                                                catch (oov v24) {
                                                                                                                                    throw bbv.a(v24);
                                                                                                                                }
                                                                                                                                var20_20 = 5;
                                                                                                                                try {
                                                                                                                                    if (var11_10 == 0) break block181;
lbl171:
                                                                                                                                    // 2 sources

                                                                                                                                    v22 = (cfr_temp_2 = this.zb7.zab - 150L) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                                                                                                }
                                                                                                                                catch (oov v25) {
                                                                                                                                    throw bbv.a(v25);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (var11_10 != 0) break block182;
                                                                                                                                if (v22 < 0) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl186
                                                                                                                            }
                                                                                                                            catch (oov v26) {
                                                                                                                                throw bbv.a(v26);
                                                                                                                            }
                                                                                                                            var20_20 = 0;
                                                                                                                            try {
                                                                                                                                if (var11_10 == 0) break block181;
lbl186:
                                                                                                                                // 2 sources

                                                                                                                                v22 = (cfr_temp_3 = this.zb7.zab - 300L) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                                                                                                            }
                                                                                                                            catch (oov v27) {
                                                                                                                                throw bbv.a(v27);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (var11_10 != 0) break block183;
                                                                                                                            if (v22 < 0) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl201
                                                                                                                        }
                                                                                                                        catch (oov v28) {
                                                                                                                            throw bbv.a(v28);
                                                                                                                        }
                                                                                                                        var20_20 = 1;
                                                                                                                        try {
                                                                                                                            if (var11_10 == 0) break block181;
lbl201:
                                                                                                                            // 2 sources

                                                                                                                            v22 = (cfr_temp_4 = this.zb7.zab - 600L) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                                                                                                                        }
                                                                                                                        catch (oov v29) {
                                                                                                                            throw bbv.a(v29);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var11_10 != 0) break block184;
                                                                                                                        if (v22 < 0) {
                                                                                                                        }
                                                                                                                        ** GOTO lbl216
                                                                                                                    }
                                                                                                                    catch (oov v30) {
                                                                                                                        throw bbv.a(v30);
                                                                                                                    }
                                                                                                                    var20_20 = 2;
                                                                                                                    try {
                                                                                                                        if (var11_10 == 0) break block181;
lbl216:
                                                                                                                        // 2 sources

                                                                                                                        v22 = (cfr_temp_5 = this.zb7.zab - 1000L) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                                                                                                                    }
                                                                                                                    catch (oov v31) {
                                                                                                                        throw bbv.a(v31);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (var11_10 != 0) break block185;
                                                                                                                    if (v22 < 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl231
                                                                                                                }
                                                                                                                catch (oov v32) {
                                                                                                                    throw bbv.a(v32);
                                                                                                                }
                                                                                                                var20_20 = 3;
                                                                                                                try {
                                                                                                                    if (var11_10 == 0) break block181;
lbl231:
                                                                                                                    // 2 sources

                                                                                                                    v22 = 4;
                                                                                                                }
                                                                                                                catch (oov v33) {
                                                                                                                    throw bbv.a(v33);
                                                                                                                }
                                                                                                            }
                                                                                                            var20_20 = (int)v22;
                                                                                                        }
                                                                                                        if (this.zb7.zab >= 0L) break block213;
                                                                                                        var21_21 = bbv.a("p", (int)32240, (long)(2252025287454947767L ^ var9_9));
                                                                                                        if (var11_10 == 0) break block212;
                                                                                                    }
                                                                                                    var21_21 = this.zb7.zab + (String)bbv.a("p", (int)7303, (long)(8103519599286163658L ^ var9_9));
                                                                                                    var19_19 = this.zb7.pmw;
                                                                                                    break block212;
                                                                                                }
                                                                                                var18_18 = 1;
                                                                                                v15 = (int)(c05.qgs() / 100L + (long)(var1_1 * 2) & 7L);
                                                                                            }
                                                                                            var20_20 = v15;
                                                                                            try {
                                                                                                try {
                                                                                                    v34 = var20_20;
                                                                                                    v35 = 4;
                                                                                                    if (var11_10 != 0) break block186;
                                                                                                    if (v34 <= v35) break block187;
                                                                                                }
                                                                                                catch (oov v36) {
                                                                                                    throw bbv.a(v36);
                                                                                                }
                                                                                                v34 = 8;
                                                                                                v35 = var20_20;
                                                                                            }
                                                                                            catch (oov v37) {
                                                                                                throw bbv.a(v37);
                                                                                            }
                                                                                        }
                                                                                        var20_20 = v34 - v35;
                                                                                    }
                                                                                    var21_21 = bbv.a("p", (int)31537, (long)(4554704201016147825L ^ var9_9));
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                this.yf_.l22().anl(b0t.rt2);
                                                                                                b0t.vfo(var2_2 + var4_4 - 15, var3_3, var18_18 * 10, 176 + var20_20 * 8, 10, 8, 256.0f, 256.0f);
                                                                                                v38 = this;
                                                                                                if (var11_10 != 0) break block188;
                                                                                                if (v38.zb7.lry() == null) break block189;
                                                                                            }
                                                                                            catch (oov v39) {
                                                                                                throw bbv.a(v39);
                                                                                            }
                                                                                            v38 = this;
                                                                                            if (var11_10 != 0) break block188;
                                                                                        }
                                                                                        catch (oov v40) {
                                                                                            throw bbv.a(v40);
                                                                                        }
                                                                                        if (v38.zb7.lry().equals(this.k0g)) break block189;
                                                                                    }
                                                                                    catch (oov v41) {
                                                                                        throw bbv.a(v41);
                                                                                    }
                                                                                    this.k0g = this.zb7.lry();
                                                                                    this.ufo();
                                                                                    this.f8i.ww1()._ju();
                                                                                }
                                                                                catch (oov v42) {
                                                                                    throw bbv.a(v42);
                                                                                }
                                                                            }
                                                                            v38 = this;
                                                                        }
                                                                        try {
                                                                            block191: {
                                                                                try {
                                                                                    try {
                                                                                        if (var11_10 != 0) break block190;
                                                                                        if (v38.uw6 == null) break block191;
                                                                                    }
                                                                                    catch (oov v43) {
                                                                                        throw bbv.a(v43);
                                                                                    }
                                                                                    this.vo9(var2_2, var3_3, this.huf);
                                                                                    if (var11_10 == 0) break block192;
                                                                                }
                                                                                catch (oov v44) {
                                                                                    throw bbv.a(v44);
                                                                                }
                                                                            }
                                                                            v38 = this;
                                                                        }
                                                                        catch (oov v45) {
                                                                            throw bbv.a(v45);
                                                                        }
                                                                    }
                                                                    v38.vo9(var2_2, var3_3, bbv.g9w);
                                                                }
                                                                var22_22 = var6_6 - var2_2;
                                                                var23_23 = var7_7 - var3_3;
                                                                try {
                                                                    block194: {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v46 = var22_22;
                                                                                                        v47 = var4_4 - 15;
                                                                                                        if (var11_10 != 0) break block193;
                                                                                                        if (v46 < v47) break block194;
                                                                                                    }
                                                                                                    catch (oov v48) {
                                                                                                        throw bbv.a(v48);
                                                                                                    }
                                                                                                    v46 = var22_22;
                                                                                                    v47 = var4_4 - 5;
                                                                                                    if (var11_10 != 0) break block193;
                                                                                                }
                                                                                                catch (oov v49) {
                                                                                                    throw bbv.a(v49);
                                                                                                }
                                                                                                if (v46 > v47) break block194;
                                                                                            }
                                                                                            catch (oov v50) {
                                                                                                throw bbv.a(v50);
                                                                                            }
                                                                                            v46 = var23_23;
                                                                                            if (var11_10 != 0) break block195;
                                                                                        }
                                                                                        catch (oov v51) {
                                                                                            throw bbv.a(v51);
                                                                                        }
                                                                                        if (v46 < 0) break block194;
                                                                                    }
                                                                                    catch (oov v52) {
                                                                                        throw bbv.a(v52);
                                                                                    }
                                                                                    v46 = var23_23;
                                                                                    v47 = 8;
                                                                                    if (var11_10 != 0) break block193;
                                                                                }
                                                                                catch (oov v53) {
                                                                                    throw bbv.a(v53);
                                                                                }
                                                                                if (v46 > v47) break block194;
                                                                            }
                                                                            catch (oov v54) {
                                                                                throw bbv.a(v54);
                                                                            }
                                                                            this.f8i.nz8((String)var21_21);
                                                                            if (var11_10 == 0) break block196;
                                                                        }
                                                                        catch (oov v55) {
                                                                            throw bbv.a(v55);
                                                                        }
                                                                    }
                                                                    v46 = var22_22;
                                                                }
                                                                catch (oov v56) {
                                                                    throw bbv.a(v56);
                                                                }
                                                            }
                                                            try {
                                                                if (var11_10 != 0) break block197;
                                                                v47 = var4_4 - var17_17 - 15 - 2;
                                                            }
                                                            catch (oov v57) {
                                                                throw bbv.a(v57);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (v46 < v47) break block196;
                                                                                    v46 = var22_22;
                                                                                    if (var11_10 != 0) break block197;
                                                                                }
                                                                                catch (oov v58) {
                                                                                    throw bbv.a(v58);
                                                                                }
                                                                                if (v46 > var4_4 - 15 - 2) break block196;
                                                                            }
                                                                            catch (oov v59) {
                                                                                throw bbv.a(v59);
                                                                            }
                                                                            v46 = var23_23;
                                                                            if (var11_10 != 0) break block197;
                                                                        }
                                                                        catch (oov v60) {
                                                                            throw bbv.a(v60);
                                                                        }
                                                                        if (v46 < 0) break block196;
                                                                    }
                                                                    catch (oov v61) {
                                                                        throw bbv.a(v61);
                                                                    }
                                                                    v46 = var23_23;
                                                                    if (var11_10 != 0) break block197;
                                                                }
                                                                catch (oov v62) {
                                                                    throw bbv.a(v62);
                                                                }
                                                                if (v46 > 8) break block196;
                                                            }
                                                            catch (oov v63) {
                                                                throw bbv.a(v63);
                                                            }
                                                            this.f8i.nz8(var19_19);
                                                        }
                                                        catch (oov v64) {
                                                            throw bbv.a(v64);
                                                        }
                                                    }
                                                    v46 = (int)this.yf_.oxn.mg8;
                                                }
                                                try {
                                                    block199: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var11_10 != 0) break block198;
                                                                    if (v46 != 0) break block199;
                                                                }
                                                                catch (oov v65) {
                                                                    throw bbv.a(v65);
                                                                }
                                                                v46 = (int)var8_8;
                                                                if (var11_10 != 0) break block198;
                                                            }
                                                            catch (oov v66) {
                                                                throw bbv.a(v66);
                                                            }
                                                            if (v46 == 0) break block200;
                                                        }
                                                        catch (oov v67) {
                                                            throw bbv.a(v67);
                                                        }
                                                    }
                                                    this.yf_.l22().anl(bbv.co8);
                                                    b0t.df9(var2_2, var3_3, var2_2 + 32, var3_3 + 32, -1601138544);
                                                    hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
                                                    v46 = var6_6 - var2_2;
                                                }
                                                catch (oov v68) {
                                                    throw bbv.a(v68);
                                                }
                                            }
                                            var24_24 = v46;
                                            var25_25 = var7_7 - var3_3;
                                            try {
                                                block204: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v69 = this.xmu();
                                                                            if (var11_10 != 0) break block201;
                                                                            if (v69 == 0) break block202;
                                                                        }
                                                                        catch (oov v70) {
                                                                            throw bbv.a(v70);
                                                                        }
                                                                        v71 = var24_24;
                                                                        v72 = 32;
                                                                        if (var11_10 != 0) break block203;
                                                                    }
                                                                    catch (oov v73) {
                                                                        throw bbv.a(v73);
                                                                    }
                                                                    if (v71 >= v72) break block204;
                                                                }
                                                                catch (oov v74) {
                                                                    throw bbv.a(v74);
                                                                }
                                                                v71 = var24_24;
                                                                v72 = 16;
                                                                if (var11_10 != 0) break block203;
                                                            }
                                                            catch (oov v75) {
                                                                throw bbv.a(v75);
                                                            }
                                                            if (v71 <= v72) break block204;
                                                        }
                                                        catch (oov v76) {
                                                            throw bbv.a(v76);
                                                        }
                                                        b0t.vfo(var2_2, var3_3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                                                        if (var11_10 == 0) break block202;
                                                    }
                                                    catch (oov v77) {
                                                        throw bbv.a(v77);
                                                    }
                                                }
                                                v71 = var2_2;
                                                v72 = var3_3;
                                            }
                                            catch (oov v78) {
                                                throw bbv.a(v78);
                                            }
                                        }
                                        b0t.vfo(v71, v72, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                                    }
                                    v69 = this.f8i.rlg(this, var1_1);
                                }
                                try {
                                    block208: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var11_10 != 0) break block205;
                                                                if (v69 == 0) break block206;
                                                            }
                                                            catch (oov v79) {
                                                                throw bbv.a(v79);
                                                            }
                                                            v80 = var24_24;
                                                            v81 = 16;
                                                            if (var11_10 != 0) break block207;
                                                        }
                                                        catch (oov v82) {
                                                            throw bbv.a(v82);
                                                        }
                                                        if (v80 >= v81) break block208;
                                                    }
                                                    catch (oov v83) {
                                                        throw bbv.a(v83);
                                                    }
                                                    v80 = var25_25;
                                                    v81 = 16;
                                                    if (var11_10 != 0) break block207;
                                                }
                                                catch (oov v84) {
                                                    throw bbv.a(v84);
                                                }
                                                if (v80 >= v81) break block208;
                                            }
                                            catch (oov v85) {
                                                throw bbv.a(v85);
                                            }
                                            b0t.vfo(var2_2, var3_3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                                            if (var11_10 == 0) break block206;
                                        }
                                        catch (oov v86) {
                                            throw bbv.a(v86);
                                        }
                                    }
                                    v80 = var2_2;
                                    v81 = var3_3;
                                }
                                catch (oov v87) {
                                    throw bbv.a(v87);
                                }
                            }
                            b0t.vfo(v80, v81, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                        }
                        v69 = this.f8i.fb6(this, var1_1);
                    }
                    try {
                        if (var11_10 != 0) break block209;
                        if (v69 == 0) break block200;
                    }
                    catch (oov v88) {
                        throw bbv.a(v88);
                    }
                    v69 = var24_24;
                }
                try {
                    block211: {
                        try {
                            try {
                                try {
                                    try {
                                        v89 = 16;
                                        if (var11_10 != 0) break block210;
                                        if (v69 >= v89) break block211;
                                    }
                                    catch (oov v90) {
                                        throw bbv.a(v90);
                                    }
                                    v69 = var25_25;
                                    v89 = 16;
                                    if (var11_10 != 0) break block210;
                                }
                                catch (oov v91) {
                                    throw bbv.a(v91);
                                }
                                if (v69 <= v89) break block211;
                            }
                            catch (oov v92) {
                                throw bbv.a(v92);
                            }
                            b0t.vfo(var2_2, var3_3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                            if (var11_10 == 0) break block200;
                        }
                        catch (oov v93) {
                            throw bbv.a(v93);
                        }
                    }
                    v69 = var2_2;
                    v89 = var3_3;
                }
                catch (oov v94) {
                    throw bbv.a(v94);
                }
            }
            b0t.vfo(v69, v89, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
        }
    }

    public void vo9(int n, int n2, gdz gdz2) {
        this.yf_.l22().anl(gdz2);
        hzu.spd();
        b0t.vfo(n, n2, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        hzu.ux6();
    }

    private boolean xmu() {
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void ufo() {
        block24: {
            block31: {
                block32: {
                    block29: {
                        block23: {
                            block33: {
                                var1_1 = bbv.a ^ 70676999273062L;
                                var3_2 = t9d.b();
                                v0 = this.zb7.lry();
                                if (var3_2 == 0) break block23;
                                if (v0 != null) ** GOTO lbl19
                                break block33;
                                catch (Throwable v1) {
                                    throw bbv.a(v1);
                                }
                            }
                            try {
                                block34: {
                                    this.yf_.l22().cez(this.huf);
                                    this.uw6 = null;
                                    if (var3_2 != 0) break block24;
                                    break block34;
                                    catch (Throwable v2) {
                                        throw bbv.a(v2);
                                    }
                                }
                                v0 = this.zb7.lry();
                            }
                            catch (Throwable v3) {
                                throw bbv.a(v3);
                            }
                        }
                        var4_3 = Unpooled.copiedBuffer((CharSequence)v0, (Charset)Charsets.UTF_8);
                        var5_4 = Base64.decode((ByteBuf)var4_3);
                        try {
                            block27: {
                                block28: {
                                    block25: {
                                        block26: {
                                            var6_5 = p9t.h3z((InputStream)new ByteBufInputStream(var5_4));
                                            v4 = var6_5.getWidth();
                                            if (var3_2 == 0) break block25;
                                            try {
                                                block35: {
                                                    if (v4 != 64 != 0) break block26;
                                                    break block35;
                                                    catch (Throwable v5) {
                                                        throw bbv.a(v5);
                                                    }
                                                }
                                                v4 = true;
                                                break block25;
                                            }
                                            catch (Throwable v6) {
                                                throw bbv.a(v6);
                                            }
                                        }
                                        v4 = false;
                                    }
                                    Validate.validState((boolean)v4, (String)bbv.a("p", (int)24115, (long)(6475102162819328789L ^ var1_1)), (Object[])new Object[0]);
                                    v7 = var6_5.getHeight();
                                    if (var3_2 == 0) break block27;
                                    try {
                                        block36: {
                                            if (v7 != 64 != 0) break block28;
                                            break block36;
                                            catch (Throwable v8) {
                                                throw bbv.a(v8);
                                            }
                                        }
                                        v7 = true;
                                        break block27;
                                    }
                                    catch (Throwable v9) {
                                        throw bbv.a(v9);
                                    }
                                }
                                v7 = false;
                            }
                            Validate.validState((boolean)v7, (String)bbv.a("p", (int)19742, (long)(1871586657624176688L ^ var1_1)), (Object[])new Object[0]);
                            break block29;
                        }
                        catch (Throwable var7_6) {
                            bbv._3c.error((String)bbv.a("p", (int)22848, (long)(7950912705056648300L ^ var1_1)) + this.zb7.bx0 + (String)bbv.a("p", (int)26511, (long)(2659651965364212396L ^ var1_1)) + this.zb7.s4c + ")", var7_6);
                            this.zb7.nla(null);
                        }
                        finally {
                            var4_3.release();
                            var5_4.release();
                        }
                        return;
                    }
                    try {
                        try {
                            v10 = this.uw6;
                            if (var3_2 == 0) break block31;
                            if (v10 != null) break block32;
                        }
                        catch (Throwable v11) {
                            throw bbv.a(v11);
                        }
                        this.uw6 = new p9u(var6_5.getWidth(), var6_5.getHeight());
                        this.yf_.l22().pc2(this.huf, this.uw6);
                    }
                    catch (Throwable v12) {
                        throw bbv.a(v12);
                    }
                }
                var6_5.getRGB(0, 0, var6_5.getWidth(), var6_5.getHeight(), this.uw6.k8b(), 0, var6_5.getWidth());
                v10 = this.uw6;
            }
            v10.oj6();
        }
    }

    @Override
    public boolean r6b(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        block52: {
            block53: {
                int n8;
                block44: {
                    block45: {
                        int n9;
                        block49: {
                            block51: {
                                block50: {
                                    block46: {
                                        block48: {
                                            block47: {
                                                n8 = t9d.c();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                n7 = n5;
                                                                                if (n8 != 0) break block44;
                                                                                if (n7 > 32) break block45;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw bbv.a(oov2);
                                                                            }
                                                                            n7 = n5;
                                                                            n9 = 32;
                                                                            if (n8 != 0) break block46;
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw bbv.a(oov3);
                                                                        }
                                                                        if (n7 >= n9) break block47;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw bbv.a(oov4);
                                                                    }
                                                                    n7 = n5;
                                                                    n9 = 16;
                                                                    if (n8 != 0) break block46;
                                                                }
                                                                catch (oov oov5) {
                                                                    throw bbv.a(oov5);
                                                                }
                                                                if (n7 <= n9) break block47;
                                                            }
                                                            catch (oov oov6) {
                                                                throw bbv.a(oov6);
                                                            }
                                                            n7 = this.xmu() ? 1 : 0;
                                                            if (n8 != 0) break block48;
                                                        }
                                                        catch (oov oov7) {
                                                            throw bbv.a(oov7);
                                                        }
                                                        if (n7 == 0) break block47;
                                                    }
                                                    catch (oov oov8) {
                                                        throw bbv.a(oov8);
                                                    }
                                                    this.f8i.gzd(n);
                                                    this.f8i.s5e();
                                                    return true;
                                                }
                                                catch (oov oov9) {
                                                    throw bbv.a(oov9);
                                                }
                                            }
                                            n7 = n5;
                                        }
                                        n9 = 16;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n8 != 0) break block49;
                                                            if (n7 >= n9) break block50;
                                                        }
                                                        catch (oov oov10) {
                                                            throw bbv.a(oov10);
                                                        }
                                                        n7 = n6;
                                                        n9 = 16;
                                                        if (n8 != 0) break block49;
                                                    }
                                                    catch (oov oov11) {
                                                        throw bbv.a(oov11);
                                                    }
                                                    if (n7 >= n9) break block50;
                                                }
                                                catch (oov oov12) {
                                                    throw bbv.a(oov12);
                                                }
                                                n7 = this.f8i.rlg(this, n) ? 1 : 0;
                                                if (n8 != 0) break block51;
                                            }
                                            catch (oov oov13) {
                                                throw bbv.a(oov13);
                                            }
                                            if (n7 == 0) break block50;
                                        }
                                        catch (oov oov14) {
                                            throw bbv.a(oov14);
                                        }
                                        this.f8i.etp(this, n, gbe.dmk());
                                        return true;
                                    }
                                    catch (oov oov15) {
                                        throw bbv.a(oov15);
                                    }
                                }
                                n7 = n5;
                            }
                            try {
                                if (n8 != 0) break block44;
                                n9 = 16;
                            }
                            catch (oov oov16) {
                                throw bbv.a(oov16);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n7 >= n9) break block45;
                                            n7 = n6;
                                            if (n8 != 0) break block44;
                                        }
                                        catch (oov oov17) {
                                            throw bbv.a(oov17);
                                        }
                                        if (n7 <= 16) break block45;
                                    }
                                    catch (oov oov18) {
                                        throw bbv.a(oov18);
                                    }
                                    n7 = this.f8i.fb6(this, n) ? 1 : 0;
                                    if (n8 != 0) break block44;
                                }
                                catch (oov oov19) {
                                    throw bbv.a(oov19);
                                }
                                if (n7 == 0) break block45;
                            }
                            catch (oov oov20) {
                                throw bbv.a(oov20);
                            }
                            this.f8i.pfh(this, n, gbe.dmk());
                            return true;
                        }
                        catch (oov oov21) {
                            throw bbv.a(oov21);
                        }
                    }
                    this.f8i.gzd(n);
                    long l = c05.qgs() - this.llq - 250L;
                    n7 = l == 0L ? 0 : (l < 0L ? -1 : 1);
                }
                try {
                    try {
                        if (n8 != 0) break block52;
                        if (n7 >= 0) break block53;
                    }
                    catch (oov oov22) {
                        throw bbv.a(oov22);
                    }
                    this.f8i.s5e();
                }
                catch (oov oov23) {
                    throw bbv.a(oov23);
                }
            }
            this.llq = c05.qgs();
            n7 = 0;
        }
        return n7 != 0;
    }

    @Override
    public void _at(int n, int n2, int n3) {
    }

    @Override
    public void l_a(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public r1l tc3() {
        return this.zb7;
    }

    public static r1l tcw(bbv bbv2) {
        return bbv2.zb7;
    }

    public static s9r la_(bbv bbv2) {
        return bbv2.f8i;
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

                bbv.a = c.a(7364713588973621506L, -3479939966717751609L, MethodHandles.lookup().lookupClass()).a(97264934233026L);
                var9 = bbv.a ^ 50840581987178L;
                bbv.d = new HashMap<K, V>(13);
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
                var7_3 = new String[14];
                var5_4 = 0;
                var4_5 = "\u0087\u00e0\u00e2\u00cfe\u00c7mdQ!T\u00c5\u00e1\u00e3\u009f\f0\u00aa\u008d\u00b9\u00eb\u001d\u0013\u0093\u00e9\u00ad\u00f6\u00ecf\u0084\u00bd\u00c6\u00d1\u00fc\u00f7\u0019\u00b7\u00e3;\u008f\u0010`oe\u001a\u0010`\u00dc7\u008d%\u00c6\u0086+\u00ac:\u00b58\u0000\u00ec]\\\"\u001d\u00fc\u000f!\u00ec\u00d7\u00f2n\u00de\u007f\u0014\u0089\u00bd\u0003\u00c8\u00e2r\u0005uL\u00f8\u00f3-<Ba\u0098t\u00f3\u009du\\\u00c7\u008b\u00bd\u008e\u00fc,h\u00ed\u001f\u0086\u00a4\u00efG\u0098\u00f4\u00a4\u00ee\u00f1\u0014(\u0005\u0095=\u00cbH6J\u000e\u00e2\u0092\u00b6?\u0016\u00d1z\f;\u0098-\u00e95*\u0005y+\u0098\\\u00ec\u00df\u009f\u00fe\u00c8pM/\u0000\u00ba\u0087\u00c9\u00d9 \u0097\u00b2\u0018\u00a0\u00f5\tEA\u0015\u00b2 \t\u00af\u00da+;\u0006zN\u00ea'\u00e2\u00c1\bZ!\u00f2\u00973\u0001CK(\u000eXP\u00e2\u00cfl\u001a\u001a\u001bh\u00e2\u0016\u00daj\u00ca-/(\u008d\u0085\u001a\u00b4\u009e\u00f4ZH\u00cco\u0096hf\u00a4\u00d0\u001aj\u001e\u00aa0\u0090\u00c1\u0010\u00c1\u00d6j\u00ea`,d\u0087\u00d4\u0018K \u0010y\u00118(#9u\u00d6xl\u00af\u0081\u00ca\u0086\u0087>A^,k\u00a4w\u00e3\u00a8\u00f8\u00df\u0003\u0095\u00b9\u000f\u009b\u00c7L\u00ddj\u00fa\u00dc\u0005'1\u0093\u0088\u00cb\u00d6 \u00a2S\u00f8\u0084\u0000\u00c9q\u00df1\u0011E\u001d\t\u0000 \u0086(\u00eb\u00dc)\u00be\u00c5\u00f2M\u00b2\u001c\u00c5\u0098\u0089j\u00b1G@\u00ae^\u000b`\u0013\u0011L\u009f\u0098p\u00bd\u00c5^]\u00ee`\u008c\u00af\u00a1\u00c9\u00bc\u00b7'4Z\u00c70\u00e16\u00b5\u0016\u0096^=d\u0093\u00a3S\u00aa7RW\u00134;\u0093\u00a6\u00e0\u008b']s\u0003fF\u00a9\u00df\u0081\u009e\u008c\bf\u0080HH\u00e7\u00cc\u0010\u0004\u00c3G!\u008dq=\u00e5\u00ec\u00c9sx\u00ca\u00e3\u00c4\u0013\u0018\t$RB\u00e4\t)\u00d4\u00b1\u0084ML\u000bC\u009b~\u00ee\u00ea_\u00e9>\u008c\u0095\u0001\u0015`lj\u00b4\u00a8Ew]\u00ccs\u001d^\"\u00f4\u00fb\b\u00c4l\"\u009fT\u00f7\u007f\u0007\u00d4\f) \u00a1\u0000\",<\u00c4hEyQD\u00052oO>\u00d0P\u00b1\u00b3\u00d3\u0097\u0010\u00fbj\u00d3\rY@[\u00d6J";
                var6_6 = "\u0087\u00e0\u00e2\u00cfe\u00c7mdQ!T\u00c5\u00e1\u00e3\u009f\f0\u00aa\u008d\u00b9\u00eb\u001d\u0013\u0093\u00e9\u00ad\u00f6\u00ecf\u0084\u00bd\u00c6\u00d1\u00fc\u00f7\u0019\u00b7\u00e3;\u008f\u0010`oe\u001a\u0010`\u00dc7\u008d%\u00c6\u0086+\u00ac:\u00b58\u0000\u00ec]\\\"\u001d\u00fc\u000f!\u00ec\u00d7\u00f2n\u00de\u007f\u0014\u0089\u00bd\u0003\u00c8\u00e2r\u0005uL\u00f8\u00f3-<Ba\u0098t\u00f3\u009du\\\u00c7\u008b\u00bd\u008e\u00fc,h\u00ed\u001f\u0086\u00a4\u00efG\u0098\u00f4\u00a4\u00ee\u00f1\u0014(\u0005\u0095=\u00cbH6J\u000e\u00e2\u0092\u00b6?\u0016\u00d1z\f;\u0098-\u00e95*\u0005y+\u0098\\\u00ec\u00df\u009f\u00fe\u00c8pM/\u0000\u00ba\u0087\u00c9\u00d9 \u0097\u00b2\u0018\u00a0\u00f5\tEA\u0015\u00b2 \t\u00af\u00da+;\u0006zN\u00ea'\u00e2\u00c1\bZ!\u00f2\u00973\u0001CK(\u000eXP\u00e2\u00cfl\u001a\u001a\u001bh\u00e2\u0016\u00daj\u00ca-/(\u008d\u0085\u001a\u00b4\u009e\u00f4ZH\u00cco\u0096hf\u00a4\u00d0\u001aj\u001e\u00aa0\u0090\u00c1\u0010\u00c1\u00d6j\u00ea`,d\u0087\u00d4\u0018K \u0010y\u00118(#9u\u00d6xl\u00af\u0081\u00ca\u0086\u0087>A^,k\u00a4w\u00e3\u00a8\u00f8\u00df\u0003\u0095\u00b9\u000f\u009b\u00c7L\u00ddj\u00fa\u00dc\u0005'1\u0093\u0088\u00cb\u00d6 \u00a2S\u00f8\u0084\u0000\u00c9q\u00df1\u0011E\u001d\t\u0000 \u0086(\u00eb\u00dc)\u00be\u00c5\u00f2M\u00b2\u001c\u00c5\u0098\u0089j\u00b1G@\u00ae^\u000b`\u0013\u0011L\u009f\u0098p\u00bd\u00c5^]\u00ee`\u008c\u00af\u00a1\u00c9\u00bc\u00b7'4Z\u00c70\u00e16\u00b5\u0016\u0096^=d\u0093\u00a3S\u00aa7RW\u00134;\u0093\u00a6\u00e0\u008b']s\u0003fF\u00a9\u00df\u0081\u009e\u008c\bf\u0080HH\u00e7\u00cc\u0010\u0004\u00c3G!\u008dq=\u00e5\u00ec\u00c9sx\u00ca\u00e3\u00c4\u0013\u0018\t$RB\u00e4\t)\u00d4\u00b1\u0084ML\u000bC\u009b~\u00ee\u00ea_\u00e9>\u008c\u0095\u0001\u0015`lj\u00b4\u00a8Ew]\u00ccs\u001d^\"\u00f4\u00fb\b\u00c4l\"\u009fT\u00f7\u007f\u0007\u00d4\f) \u00a1\u0000\",<\u00c4hEyQD\u00052oO>\u00d0P\u00b1\u00b3\u00d3\u0097\u0010\u00fbj\u00d3\rY@[\u00d6J".length();
                var3_7 = 40;
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
                    var7_3[var5_4++] = bbv.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u008dt\u00dc\u0003\u00fa\u00d9@\t\u001f\u0002\u00d3\u00f5\u00a4\u0006,\u00f5\u000b\u008fZ\"\u00bc\u00e2\u00f3\u0094\u00a3MDS\u0019-(0\u0010\u00863\u00a4\u00ebx\u00c0\u00f3C\u0088\u00ab\u0001Y\u00fd\u00d3\u0081\u00b4";
                    var6_6 = "\u008dt\u00dc\u0003\u00fa\u00d9@\t\u001f\u0002\u00d3\u00f5\u00a4\u0006,\u00f5\u000b\u008fZ\"\u00bc\u00e2\u00f3\u0094\u00a3MDS\u0019-(0\u0010\u00863\u00a4\u00ebx\u00c0\u00f3C\u0088\u00ab\u0001Y\u00fd\u00d3\u0081\u00b4".length();
                    var3_7 = 32;
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
                    var7_3[var5_4++] = bbv.a(var8_9).intern();
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
        bbv.b = var7_3;
        bbv.c = new String[14];
        bbv._3c = LogManager.getLogger();
        bbv.vgs = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat((String)bbv.a("p", (int)29214, (long)(7845665378518017593L ^ var9))).setDaemon(true).build());
        bbv.g9w = new gdz((String)bbv.a("p", (int)30268, (long)(6731012426231915031L ^ var9)));
        bbv.co8 = new gdz((String)bbv.a("p", (int)3387, (long)(2525165520307706131L ^ var9)));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x560A;
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
                throw new RuntimeException("bbv", exception);
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
            bbv.c[n2] = bbv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bbv.a(n, l);
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
            throw new RuntimeException("bbv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bbv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

