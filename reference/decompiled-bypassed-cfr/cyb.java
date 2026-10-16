/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class cyb {
    public float jek;
    private final /* synthetic */ h16 t8f;
    private final /* synthetic */ int[] ze9;
    private /* synthetic */ float r6j;
    public HashMap p98;
    public HashMap d8o;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public cyb(String string, int n, int n2, boolean bl) {
        this(string, n, n2, 0, bl);
    }

    public cyb(String string, int n, int n2, int n3, boolean bl) {
        this(string, n, n2, n3, bl, 0);
    }

    public cyb(String string, int n, int n2, int n3, boolean bl, int n4) {
        long l = a ^ 0x2D8E43076F4L;
        this.jek = 0.0f;
        this.ze9 = new int[32];
        this.p98 = new HashMap();
        this.d8o = new HashMap();
        this.t8f = new h16(this.amo(string, n, n2), true, n3, bl, n4);
        this.r6j = 0.0f;
        for (int i = 0; i < 32; ++i) {
            int n5 = (i >> 3 & 1) * 85;
            int n6 = (i >> 2 & 1) * 170 + n5;
            int n7 = (i >> 1 & 1) * 170 + n5;
            int n8 = (i & 1) * 170 + n5;
            try {
                if (i == 6) {
                    n6 += 85;
                }
            }
            catch (oov oov2) {
                throw cyb.a(oov2);
            }
            if (i >= 16) {
                n6 /= 4;
                n7 /= 4;
                n8 /= 4;
            }
            this.ze9[i] = (n6 & 0xFF) << 16 | (n7 & 0xFF) << 8 | n8 & 0xFF;
        }
        this.jek = this.wni((String)((Object)cyb.a("l", (int)18969, (long)(0x2980DD37698F3B36L ^ l))));
    }

    private Font amo(String string, int n, int n2) {
        long l = a ^ 0x242EFCDE356DL;
        Font font = null;
        try {
            InputStream inputStream = c05.vz1().mpf().td5(new gdz((String)((Object)cyb.a("l", (int)459, (long)(0x16A6973FFC75B379L ^ l))) + string)).f_4();
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(n, n2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.err.println((String)((Object)cyb.a("l", (int)32598, (long)(0x242DDCFA55BBCDE2L ^ l))));
        }
        return font;
    }

    public int fzf(String string, float f, float f2, int n) {
        int n2;
        block2: {
            block3: {
                int n3 = t9d.c();
                try {
                    n2 = n;
                    if (n3 != 0) break block2;
                    if (n2 != 0xFFFFFF) break block3;
                }
                catch (oov oov2) {
                    throw cyb.a(oov2);
                }
                n = z7e.a2_.k0y;
            }
            n2 = this.r5d(string, f, f2, n, (float)(n >> 24 & 0xFF) / 255.0f);
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int r5d(String var1_1, float var2_2, float var3_3, int var4_4, float var5_5) {
        block76: {
            block77: {
                block58: {
                    var6_6 = cyb.a ^ 84726581967608L;
                    var1_1 = this.c2h(var1_1);
                    var3_3 *= 2.0f;
                    var8_7 = t9d.b();
                    var9_8 = var2_2 *= 2.0f;
                    GL11.glPushMatrix();
                    GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
                    var10_9 = GL11.glGetBoolean((int)3042);
                    hzu.if9();
                    GL11.glEnable((int)3042);
                    GL11.glBlendFunc((int)770, (int)771);
                    GL11.glEnable((int)3553);
                    var11_10 = var4_4;
                    var12_11 = var1_1.toCharArray();
                    var13_12 = '\u0000';
                    for (char var17_16 : var12_11) {
                        block69: {
                            block75: {
                                block74: {
                                    block73: {
                                        block72: {
                                            block71: {
                                                block70: {
                                                    block63: {
                                                        block68: {
                                                            block67: {
                                                                block66: {
                                                                    block64: {
                                                                        block65: {
                                                                            block61: {
                                                                                block62: {
                                                                                    block59: {
                                                                                        block60: {
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = var17_16;
                                                                                                    if (var8_7 == 0) break block58;
                                                                                                    v1 = '\r';
                                                                                                    if (var8_7 == 0) break block59;
                                                                                                }
                                                                                                catch (oov v2) {
                                                                                                    throw cyb.a(v2);
                                                                                                }
                                                                                                if (v0 != v1) break block60;
                                                                                            }
                                                                                            catch (oov v3) {
                                                                                                throw cyb.a(v3);
                                                                                            }
                                                                                            var2_2 = var9_8;
                                                                                        }
                                                                                        v4 = var17_16;
                                                                                        v1 = '\n';
                                                                                    }
                                                                                    try {
                                                                                        if (var8_7 == 0) break block61;
                                                                                        if (v4 != v1) break block62;
                                                                                    }
                                                                                    catch (oov v5) {
                                                                                        throw cyb.a(v5);
                                                                                    }
                                                                                    var3_3 += this.wni(Character.toString(var17_16)) * 2.0f;
                                                                                }
                                                                                v4 = var17_16;
                                                                                v1 = '\u00a7';
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var8_7 == 0) break block63;
                                                                                                        if (v4 != v1) {
                                                                                                        }
                                                                                                        ** GOTO lbl115
                                                                                                    }
                                                                                                    catch (oov v6) {
                                                                                                        throw cyb.a(v6);
                                                                                                    }
                                                                                                    v7 = var13_12;
                                                                                                    if (var8_7 == 0) break block64;
                                                                                                }
                                                                                                catch (oov v8) {
                                                                                                    throw cyb.a(v8);
                                                                                                }
                                                                                                if (v7 == '\u0000') break block65;
                                                                                            }
                                                                                            catch (oov v9) {
                                                                                                throw cyb.a(v9);
                                                                                            }
                                                                                            v7 = var13_12;
                                                                                            v10 = var12_11.length - 1;
                                                                                            if (var8_7 == 0) break block66;
                                                                                        }
                                                                                        catch (oov v11) {
                                                                                            throw cyb.a(v11);
                                                                                        }
                                                                                        if (v7 == v10) break block65;
                                                                                    }
                                                                                    catch (oov v12) {
                                                                                        throw cyb.a(v12);
                                                                                    }
                                                                                    v4 = var12_11[var13_12 - 1];
                                                                                    v1 = '\u00a7';
                                                                                    if (var8_7 == 0) break block63;
                                                                                }
                                                                                catch (oov v13) {
                                                                                    throw cyb.a(v13);
                                                                                }
                                                                                if (v4 != v1) {
                                                                                }
                                                                                ** GOTO lbl115
                                                                            }
                                                                            catch (oov v14) {
                                                                                throw cyb.a(v14);
                                                                            }
                                                                        }
                                                                        v7 = var13_12;
                                                                    }
                                                                    v10 = '\u0001';
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var8_7 == 0) break block67;
                                                                        if (v7 < v10) break block68;
                                                                    }
                                                                    catch (oov v15) {
                                                                        throw cyb.a(v15);
                                                                    }
                                                                    v7 = var12_11[var13_12 - 1];
                                                                    v10 = '\u00a7';
                                                                }
                                                                catch (oov v16) {
                                                                    throw cyb.a(v16);
                                                                }
                                                            }
                                                            if (v7 == v10) continue;
                                                        }
                                                        GL11.glPushMatrix();
                                                        this.t8f.ckt(Character.toString(var17_16), var2_2, var3_3, hhf.kjo(var11_10, var5_5), false);
                                                        GL11.glPopMatrix();
                                                        var2_2 += this.ax2(Character.toString(var17_16)) * 2.0f;
                                                        try {
                                                            if (var8_7 != 0) break block69;
lbl115:
                                                            // 3 sources

                                                            v4 = var17_16;
                                                            v1 = ' ';
                                                        }
                                                        catch (oov v17) {
                                                            throw cyb.a(v17);
                                                        }
                                                    }
                                                    try {
                                                        if (var8_7 == 0) break block70;
                                                        if (v4 == v1) {
                                                        }
                                                        ** GOTO lbl131
                                                    }
                                                    catch (oov v18) {
                                                        throw cyb.a(v18);
                                                    }
                                                    var2_2 += (float)this.t8f.p3e(" ");
                                                    try {
                                                        if (var8_7 != 0) break block69;
lbl131:
                                                        // 2 sources

                                                        v4 = var17_16;
                                                        v1 = '\u00a7';
                                                    }
                                                    catch (oov v19) {
                                                        throw cyb.a(v19);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (var8_7 == 0) break block71;
                                                            if (v4 != v1) break block69;
                                                        }
                                                        catch (oov v20) {
                                                            throw cyb.a(v20);
                                                        }
                                                        v4 = var13_12;
                                                        if (var8_7 == 0) break block72;
                                                    }
                                                    catch (oov v21) {
                                                        throw cyb.a(v21);
                                                    }
                                                    v1 = var12_11.length - 1;
                                                }
                                                catch (oov v22) {
                                                    throw cyb.a(v22);
                                                }
                                            }
                                            try {
                                                if (v4 == v1) break block69;
                                                v4 = cyb.a("l", (int)28938, (long)(6564687491406416943L ^ var6_6)).indexOf(var1_1.charAt(var13_12 + 1));
                                            }
                                            catch (oov v23) {
                                                throw cyb.a(v23);
                                            }
                                        }
                                        var18_17 = v4;
                                        try {
                                            v24 = var18_17;
                                            if (var8_7 == 0) break block73;
                                            if (v24 < '\u0000') {
                                                continue;
                                            }
                                        }
                                        catch (oov v25) {
                                            throw cyb.a(v25);
                                        }
                                        v24 = var18_17;
                                    }
                                    try {
                                        v26 = '\u0010';
                                        if (var8_7 == 0) break block74;
                                        if (v24 < v26) {
                                        }
                                        ** GOTO lbl186
                                    }
                                    catch (oov v27) {
                                        throw cyb.a(v27);
                                    }
                                    var11_10 = this.ze9[var18_17];
                                    try {
                                        try {
                                            if (var8_7 != 0) break block69;
lbl186:
                                            // 2 sources

                                            v24 = var18_17;
                                            if (var8_7 == 0) break block75;
                                        }
                                        catch (oov v28) {
                                            throw cyb.a(v28);
                                        }
                                        v26 = '\u0015';
                                    }
                                    catch (oov v29) {
                                        throw cyb.a(v29);
                                    }
                                }
                                try {
                                    if (v24 != v26) break block69;
                                    v24 = Color.WHITE.getRGB();
                                }
                                catch (oov v30) {
                                    throw cyb.a(v30);
                                }
                            }
                            var11_10 = v24;
                        }
                        ++var13_12;
                        if (var8_7 != 0) continue;
                    }
                    v0 = var10_9;
                }
                try {
                    try {
                        if (var8_7 == 0) break block76;
                        if (v0 != '\u0000') break block77;
                    }
                    catch (oov v31) {
                        throw cyb.a(v31);
                    }
                    GL11.glDisable((int)3042);
                }
                catch (oov v32) {
                    throw cyb.a(v32);
                }
            }
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            v0 = (int)var2_2;
        }
        return v0;
    }

    private String c2h(String string) {
        block11: {
            long l = a ^ 0x1C4DBA64EF40L;
            String string2 = "";
            char[] cArray = string.toCharArray();
            int n = cArray.length;
            int n2 = t9d.b();
            for (int i = 0; i < n; ++i) {
                char c2;
                char c3;
                char c4;
                block12: {
                    c4 = cArray[i];
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n2 == 0) break block11;
                                            c3 = c4;
                                            c2 = '\uc350';
                                            if (n2 == 0) break block12;
                                        }
                                        catch (oov oov2) {
                                            throw cyb.a(oov2);
                                        }
                                        if (c3 < c2) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw cyb.a(oov3);
                                    }
                                    c3 = c4;
                                    c2 = '\uea60';
                                    if (n2 == 0) break block12;
                                }
                                catch (oov oov4) {
                                    throw cyb.a(oov4);
                                }
                                if (c3 <= c2) continue;
                            }
                            catch (oov oov5) {
                                throw cyb.a(oov5);
                            }
                        }
                        c3 = c4;
                        c2 = '\u26bd';
                    }
                    catch (oov oov6) {
                        throw cyb.a(oov6);
                    }
                }
                if (c3 == c2) continue;
                string2 = string2 + c4;
                if (n2 != 0) continue;
                break;
            }
            string = string2.replace((CharSequence)((Object)cyb.a("l", (int)18421, (long)(0x2B6454179388AF6DL ^ l))), "").replace('\u25ac', '=').replace('\u2764', '\u2665').replace('\u22c6', '\u2606').replace('\u2620', '\u2606').replace('\u2730', '\u2606').replace("\u272b", "\u2606").replace("\u2719", "+");
            string = string.replace('\u2b05', '\u2190').replace('\u2b06', '\u2191').replace('\u2b07', '\u2193').replace('\u27a1', '\u2192').replace('\u2b08', '\u2197').replace('\u2b0b', '\u2199').replace('\u2b09', '\u2196').replace('\u2b0a', '\u2198');
        }
        return string;
    }

    public int e18(String string, float f, float f2, int n) {
        this.fzf(jfy.i95(string), f + 0.8f, f2 + 0.8f, hhf.kjo(z7e.ret.k0y, 0.75f));
        return this.fzf(string, f, f2, n);
    }

    public int unm(String string, float f, float f2, int n) {
        this.fzf(jfy.i95(string), f + 0.8f, f2 + 0.8f, hhf.kjo(z7e.ret.k0y, Math.min(0.85f, (float)(n >> 24 & 0xFF) / 255.0f)));
        return this.fzf(string, f, f2, n);
    }

    public int kkl(String string, float f, float f2, int n) {
        this.r5d(jfy.i95(string), f + 0.5f, f2 + 0.5f, 0, (float)(n >> 24 & 0xFF) / 255.0f);
        return this.fzf(string, f, f2, n);
    }

    public int ayi(String string, float f, float f2, int n) {
        this.r5d(jfy.i95(string), f + 0.8f, f2 + 0.8f, 0, (float)(n >> 24 & 0xFF) / 255.0f);
        return this.fzf(string, f, f2, n);
    }

    public int lt2(String string, float f, float f2, int n) {
        return this.fzf(string, f - (float)((int)this.ax2(string) / 2), f2, n);
    }

    public void amd(String string, float f, float f2, int n, float f3) {
        this.r5d(string, f - (float)((int)this.ax2(string) / 2), f2, n, f3);
    }

    public void os_(String string, float f, float f2, int n) {
        this.lt2(jfy.i95(string), f + 0.5f, f2 + 0.5f, -16777216);
        this.lt2(string, f, f2, n);
    }

    public void lh8(String string, float f, float f2, int n, int n2) {
        this.fzf(string, f - this.ax2(string) / 2.0f - 0.5f, f2, n2);
        this.fzf(string, f - this.ax2(string) / 2.0f + 0.5f, f2, n2);
        this.fzf(string, f - this.ax2(string) / 2.0f, f2 - 0.5f, n2);
        this.fzf(string, f - this.ax2(string) / 2.0f, f2 + 0.5f, n2);
        this.fzf(string, f - this.ax2(string) / 2.0f, f2, n);
    }

    public float ax2(String string) {
        try {
            if (this.p98.containsKey(string)) {
                return ((Float)this.p98.get(string)).floatValue();
            }
        }
        catch (oov oov2) {
            throw cyb.a(oov2);
        }
        float f = 0.0f;
        String string2 = jfy.i95(string);
        for (char c2 : string2.toCharArray()) {
            f += (float)this.t8f.p3e(Character.toString(c2)) + this.r6j;
        }
        this.p98.put(string, Float.valueOf(f / 2.0f));
        return f / 2.0f;
    }

    public float pa9(char c2) {
        return this.t8f.p3e(String.valueOf(c2));
    }

    public float wni(String string) {
        try {
            if (this.d8o.containsKey(string)) {
                return ((Float)this.d8o.get(string)).floatValue();
            }
        }
        catch (oov oov2) {
            throw cyb.a(oov2);
        }
        float f = (float)this.t8f.lwd(string) / 2.0f;
        this.d8o.put(string, Float.valueOf(f));
        return f;
    }

    public float pvv() {
        long l = a ^ 0xD9839E8EDA3L;
        return (float)this.t8f.lwd((String)((Object)cyb.a("l", (int)29731, (long)(0x3DC1F691CF9D1E5AL ^ l)))) / 2.0f;
    }

    public h16 xj9() {
        return this.t8f;
    }

    public String rt4(String string, int n) {
        return this.abn(string, n, false);
    }

    /*
     * Unable to fully structure code
     */
    public String abn(String var1_1, int var2_2, boolean var3_3) {
        block58: {
            block59: {
                block56: {
                    block57: {
                        var4_4 = cyb.a ^ 131702595769734L;
                        var1_1 = this.c2h(var1_1);
                        var7_5 = new StringBuilder();
                        var6_6 = t9d.c();
                        var8_7 = 0.0f;
                        try {
                            try {
                                v0 = var3_3;
                                if (var6_6 != 0) break block56;
                                if (v0 == 0) break block57;
                            }
                            catch (oov v1) {
                                throw cyb.a(v1);
                            }
                            v0 = var1_1.length() - 1;
                            break block56;
                        }
                        catch (oov v2) {
                            throw cyb.a(v2);
                        }
                    }
                    v0 = 0;
                }
                var9_8 = v0;
                try {
                    v3 = var3_3;
                    if (var6_6 != 0) break block58;
                    if (v3 == 0) break block59;
                }
                catch (oov v4) {
                    throw cyb.a(v4);
                }
                v3 = -1;
                break block58;
            }
            v3 = 1;
        }
        var10_9 = v3;
        var11_10 = 0;
        var12_11 = 0;
        for (var13_12 = var9_8; var13_12 >= 0; var13_12 += var10_9) {
            block69: {
                block66: {
                    block67: {
                        block68: {
                            block62: {
                                block63: {
                                    block64: {
                                        block61: {
                                            block60: {
                                                try {
                                                    try {
                                                        v5 = var13_12;
                                                        if (var6_6 != 0) break block60;
                                                        if (v5 >= var1_1.length()) break;
                                                    }
                                                    catch (oov v6) {
                                                        throw cyb.a(v6);
                                                    }
                                                    cfr_temp_0 = var8_7 - (float)var2_2;
                                                    v5 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                }
                                                catch (oov v7) {
                                                    throw cyb.a(v7);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var6_6 != 0) break block61;
                                                    if (v5 >= 0) break;
                                                }
                                                catch (oov v8) {
                                                    throw cyb.a(v8);
                                                }
                                                v5 = var1_1.charAt(var13_12);
                                            }
                                            catch (oov v9) {
                                                throw cyb.a(v9);
                                            }
                                        }
                                        var14_13 = v5;
                                        var15_14 = this.pa9((char)var14_13);
                                        try {
                                            v10 = var11_10;
                                            if (var6_6 != 0) break block62;
                                            if (v10 != 0) {
                                            }
                                            ** GOTO lbl136
                                        }
                                        catch (oov v11) {
                                            throw cyb.a(v11);
                                        }
                                        var11_10 = 0;
                                        try {
                                            block65: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v12 = var14_13;
                                                                            if (var6_6 != 0) break block63;
                                                                            if (v12 != 108) {
                                                                            }
                                                                            ** GOTO lbl127
                                                                        }
                                                                        catch (oov v13) {
                                                                            throw cyb.a(v13);
                                                                        }
                                                                        v12 = var14_13;
                                                                        if (var6_6 != 0) break block63;
                                                                    }
                                                                    catch (oov v14) {
                                                                        throw cyb.a(v14);
                                                                    }
                                                                    if (v12 != 76) {
                                                                    }
                                                                    ** GOTO lbl127
                                                                }
                                                                catch (oov v15) {
                                                                    throw cyb.a(v15);
                                                                }
                                                                v16 = var14_13;
                                                                if (var6_6 != 0) break block64;
                                                            }
                                                            catch (oov v17) {
                                                                throw cyb.a(v17);
                                                            }
                                                            if (v16 == 114) break block65;
                                                        }
                                                        catch (oov v18) {
                                                            throw cyb.a(v18);
                                                        }
                                                        v19 = var14_13;
                                                        if (var6_6 != 0) break block66;
                                                    }
                                                    catch (oov v20) {
                                                        throw cyb.a(v20);
                                                    }
                                                    if (v19 != 82) break block67;
                                                }
                                                catch (oov v21) {
                                                    throw cyb.a(v21);
                                                }
                                            }
                                            v16 = 0;
                                        }
                                        catch (oov v22) {
                                            throw cyb.a(v22);
                                        }
                                    }
                                    var12_11 = v16;
                                    try {
                                        if (var6_6 == 0) break block67;
lbl127:
                                        // 3 sources

                                        v12 = 1;
                                    }
                                    catch (oov v23) {
                                        throw cyb.a(v23);
                                    }
                                }
                                var12_11 = v12;
                                try {
                                    try {
                                        if (var6_6 == 0) break block67;
lbl136:
                                        // 2 sources

                                        v24 = var15_14;
                                        if (var6_6 != 0) break block68;
                                    }
                                    catch (oov v25) {
                                        throw cyb.a(v25);
                                    }
                                    cfr_temp_1 = v24 - 0.0f;
                                    v10 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                }
                                catch (oov v26) {
                                    throw cyb.a(v26);
                                }
                            }
                            if (v10 >= 0) ** GOTO lbl151
                            var11_10 = 1;
                            try {
                                if (var6_6 == 0) break block67;
lbl151:
                                // 2 sources

                                v24 = var8_7;
                            }
                            catch (oov v27) {
                                throw cyb.a(v27);
                            }
                        }
                        try {
                            v28 = v24;
                            v29 = var15_14;
                            v30 = var1_1.contains((CharSequence)cyb.a("l", (int)7747, (long)(6849895634892016665L ^ var4_4))) != false ? 2.2 : 2.0;
                        }
                        catch (oov v31) {
                            throw cyb.a(v31);
                        }
                        var8_7 = (float)(v28 + v29 / v30);
                        try {
                            v19 = var12_11;
                            if (var6_6 != 0) break block66;
                            if (v19 == false) break block67;
                        }
                        catch (oov v32) {
                            throw cyb.a(v32);
                        }
                        var8_7 += 1.0f;
                    }
                    v19 = (cfr_temp_2 = var8_7 - (float)var2_2) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                }
                try {
                    if (var6_6 != 0) break block69;
                    if (v19 > 0) {
                        break;
                    }
                }
                catch (oov v33) {
                    throw cyb.a(v33);
                }
                v19 = var3_3;
            }
            try {
                try {
                    if (v19 != false) {
                        var7_5.insert(0, (char)var14_13);
                        if (var6_6 == 0) continue;
                    }
                }
                catch (oov v34) {
                    throw cyb.a(v34);
                }
                var7_5.append((char)var14_13);
                continue;
            }
            catch (oov v35) {
                throw cyb.a(v35);
            }
        }
        return var7_5.toString();
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

                cyb.a = c.a(-6776527586774953043L, 5986738704977795947L, MethodHandles.lookup().lookupClass()).a(63196893167041L);
                cyb.d = new HashMap<K, V>(13);
                var0 = cyb.a ^ 57693818551997L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u0010\u00f8\u00c8\u001d\u008e\u00c2\u00b3l\u00a4>\u0014:\u00f0\u00d1\nb_\u00c4\u00b5\u009a\u00d1\u00f3\u00a7yH\u00a8\u0007T\u00b3Le\u00d5\u00d7|\u00b5\u00e9U\u0099`\u0086$\u00b4f\u00c1\u008c\u0085t\u00d4\u008a\u0097\u00b3B\u00ed\u0015B\u00fa\u0010\u0001K\u00ec\u00fe\u0093\u00a8\u001c\u00eeJ\u00a0CI\u0014\u00fd\u009d\u00c6`v\u00f1\u0018\f\u0011\b\u00a9\u00fa\u00e5B\u00b1\u00aa\u00c6\u00d4J\u008d\u00cdpN_\u00b7&irS\u00e3\u008aX\u00f3\u0084\u00b7'\u0013.\u00c6P\u001dk\u00f9\u00e7}3\u0017q-,\u0001\u00fb\u00ad\u00e3LTp\u00c8\u00828\u00bdF\u000f\u00ee\u00d4\u00c5\f\u00f5%\u009ca\u00a6\u00d2\u00baw\u000b\u00c4\u008eND\b\u00be\u0083\u00e8&\u0015\u00b5\u0090\u009d3,X6\u0016\u00c3Oc\u00d2\u00e8-8\u00f5lye\u0016\f\u00d1r\u00af\u0006\u0013\u0089\"\u00da\u00e3f\u00b5k\u00ccE\u00a6\u00f9\u0012\f\u00df\u00ca\u0006\u00cb\u009d\u008fn\u00d3\u00a3i\u00ce\u00fe{\u009e\u0097Y\u00f6\u001cn\u00a2\u00d2BU'\u00d5\u00faT\\N\u00ce\u00ffV(\u008a=\u00d7e\u00de\u00eb\u00cd\u00dfz\u00e0\u0086\u0093\u00eft\u0096'*A\u00ba\u00ec\\_%d\u00fabT\u00cf\u00d7n\u00a4\u00eb\u0013\u008ex\u00cd\u000f\u00d0u=";
                var8_6 = "\u0010\u00f8\u00c8\u001d\u008e\u00c2\u00b3l\u00a4>\u0014:\u00f0\u00d1\nb_\u00c4\u00b5\u009a\u00d1\u00f3\u00a7yH\u00a8\u0007T\u00b3Le\u00d5\u00d7|\u00b5\u00e9U\u0099`\u0086$\u00b4f\u00c1\u008c\u0085t\u00d4\u008a\u0097\u00b3B\u00ed\u0015B\u00fa\u0010\u0001K\u00ec\u00fe\u0093\u00a8\u001c\u00eeJ\u00a0CI\u0014\u00fd\u009d\u00c6`v\u00f1\u0018\f\u0011\b\u00a9\u00fa\u00e5B\u00b1\u00aa\u00c6\u00d4J\u008d\u00cdpN_\u00b7&irS\u00e3\u008aX\u00f3\u0084\u00b7'\u0013.\u00c6P\u001dk\u00f9\u00e7}3\u0017q-,\u0001\u00fb\u00ad\u00e3LTp\u00c8\u00828\u00bdF\u000f\u00ee\u00d4\u00c5\f\u00f5%\u009ca\u00a6\u00d2\u00baw\u000b\u00c4\u008eND\b\u00be\u0083\u00e8&\u0015\u00b5\u0090\u009d3,X6\u0016\u00c3Oc\u00d2\u00e8-8\u00f5lye\u0016\f\u00d1r\u00af\u0006\u0013\u0089\"\u00da\u00e3f\u00b5k\u00ccE\u00a6\u00f9\u0012\f\u00df\u00ca\u0006\u00cb\u009d\u008fn\u00d3\u00a3i\u00ce\u00fe{\u009e\u0097Y\u00f6\u001cn\u00a2\u00d2BU'\u00d5\u00faT\\N\u00ce\u00ffV(\u008a=\u00d7e\u00de\u00eb\u00cd\u00dfz\u00e0\u0086\u0093\u00eft\u0096'*A\u00ba\u00ec\\_%d\u00fabT\u00cf\u00d7n\u00a4\u00eb\u0013\u008ex\u00cd\u000f\u00d0u=".length();
                var5_7 = 56;
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
                    var9_3[var7_4++] = cyb.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00daB\u00d4\u001d\u00d4\b\u00a7\n\u00b2\u007f\u0002\u00e0\u00d6\u00f0\u001eS\u0018\u0088\u00f2\u00f5d\u0012m\u00f0\u00c6\u00ff\u00f9\u0004\u00cfT\u009b\u00f5\u00c6^\u00cf\u00b6\u00d4N*\u0084\u00d2";
                    var8_6 = "\u00daB\u00d4\u001d\u00d4\b\u00a7\n\u00b2\u007f\u0002\u00e0\u00d6\u00f0\u001eS\u0018\u0088\u00f2\u00f5d\u0012m\u00f0\u00c6\u00ff\u00f9\u0004\u00cfT\u009b\u00f5\u00c6^\u00cf\u00b6\u00d4N*\u0084\u00d2".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = cyb.a(var10_9).intern();
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
        cyb.b = var9_3;
        cyb.c = new String[7];
    }

    private static oov a(oov oov2) {
        return oov2;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7DC2;
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
                throw new RuntimeException("cyb", exception);
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
            cyb.c[n2] = cyb.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cyb.a(n, l);
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
            throw new RuntimeException("cyb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cyb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

