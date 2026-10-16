/*
 * Decompiled with CFR 0.152.
 */
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

public class dqh
extends _f3 {
    private int qbu = -1;
    private static final long c;
    private static final String[] d;
    private static final String[] i;
    private static final Map m;

    public dqh(t9d t9d2) {
        super(t9d2);
    }

    public dqh(t9d t9d2, double d, double d2, double d3) {
        super(t9d2, d, d2, d3);
    }

    @Override
    public _f3$c3d x38() {
        return _f3$c3d.qut;
    }

    @Override
    public zfz hcw() {
        return ox_.od1.l4i();
    }

    @Override
    public void xx_() {
        block23: {
            dqh dqh2;
            block22: {
                int n;
                block21: {
                    int n2;
                    block20: {
                        block18: {
                            n2 = t9d.c();
                            try {
                                block19: {
                                    try {
                                        try {
                                            super.xx_();
                                            n = this.qbu--;
                                            if (n2 != 0) break block18;
                                            if (n <= 0) break block19;
                                        }
                                        catch (oov oov2) {
                                            throw dqh.b(oov2);
                                        }
                                        this.oay.zvy(w_0.bac, this.o2v, this.kfp + 0.5, this.vbd, 0.0, 0.0, 0.0, new int[0]);
                                        if (n2 == 0) break block20;
                                    }
                                    catch (oov oov3) {
                                        throw dqh.b(oov3);
                                    }
                                }
                                n = this.qbu;
                            }
                            catch (oov oov4) {
                                throw dqh.b(oov4);
                            }
                        }
                        try {
                            try {
                                if (n2 != 0) break block21;
                                if (n != 0) break block20;
                            }
                            catch (oov oov5) {
                                throw dqh.b(oov5);
                            }
                            this.uc4(this.icv * this.icv + this.bw4 * this.bw4);
                        }
                        catch (oov oov6) {
                            throw dqh.b(oov6);
                        }
                    }
                    try {
                        dqh2 = this;
                        if (n2 != 0) break block22;
                        n = dqh2.cbi ? 1 : 0;
                    }
                    catch (oov oov7) {
                        throw dqh.b(oov7);
                    }
                }
                if (n == 0) break block23;
                dqh2 = this;
            }
            double d = dqh2.icv * this.icv + this.bw4 * this.bw4;
            try {
                if (d >= (double)0.01f) {
                    this.uc4(d);
                }
            }
            catch (oov oov8) {
                throw dqh.b(oov8);
            }
        }
    }

    @Override
    public boolean m1t(ofh ofh2, float f) {
        boolean bl;
        block6: {
            block7: {
                int n = t9d.b();
                i2h i2h2 = ofh2.f8d();
                try {
                    bl = i2h2 instanceof hy9;
                    if (n == 0) break block6;
                    if (!bl) break block7;
                }
                catch (oov oov2) {
                    throw dqh.b(oov2);
                }
                hy9 hy92 = (hy9)i2h2;
                try {
                    try {
                        bl = hy92.agj();
                        if (n == 0) break block6;
                        if (!bl) break block7;
                    }
                    catch (oov oov3) {
                        throw dqh.b(oov3);
                    }
                    this.uc4(hy92.icv * hy92.icv + hy92.mop * hy92.mop + hy92.bw4 * hy92.bw4);
                }
                catch (oov oov4) {
                    throw dqh.b(oov4);
                }
            }
            bl = super.m1t(ofh2, f);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void szd(ofh var1_1) {
        block25: {
            block24: {
                block23: {
                    block21: {
                        block22: {
                            var2_2 = dqh.c ^ 9483493800509L;
                            super.szd(var1_1);
                            var5_3 = this.icv * this.icv + this.bw4 * this.bw4;
                            var4_4 = t9d.c();
                            try {
                                try {
                                    try {
                                        try {
                                            v0 = var1_1.yto();
                                            if (var4_4 != 0) break block21;
                                            if (v0 != 0) break block22;
                                        }
                                        catch (oov v1) {
                                            throw dqh.b(v1);
                                        }
                                        v0 = (int)this.oay.eir()._s0((String)dqh.c("z", (int)12372, (long)(6199224590095166542L ^ var2_2)));
                                        if (var4_4 != 0) break block21;
                                    }
                                    catch (oov v2) {
                                        throw dqh.b(v2);
                                    }
                                    if (v0 == 0) break block22;
                                }
                                catch (oov v3) {
                                    throw dqh.b(v3);
                                }
                                this.qji(new erg(ox_.od1, 1), 0.0f);
                            }
                            catch (oov v4) {
                                throw dqh.b(v4);
                            }
                        }
                        v0 = var1_1.i0l();
                    }
                    try {
                        try {
                            if (var4_4 != 0) break block23;
                            if (v0 == 0) {
                            }
                            ** GOTO lbl61
                        }
                        catch (oov v5) {
                            throw dqh.b(v5);
                        }
                        v0 = var1_1.yto();
                    }
                    catch (oov v6) {
                        throw dqh.b(v6);
                    }
                }
                try {
                    try {
                        if (var4_4 != 0) break block24;
                        if (v0 == 0) {
                        }
                        ** GOTO lbl61
                    }
                    catch (oov v7) {
                        throw dqh.b(v7);
                    }
                    cfr_temp_0 = var5_3 - 0.009999999776482582;
                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                }
                catch (oov v8) {
                    throw dqh.b(v8);
                }
            }
            try {
                if (v0 < 0) break block25;
lbl61:
                // 3 sources

                this.uc4(var5_3);
            }
            catch (oov v9) {
                throw dqh.b(v9);
            }
        }
    }

    public void uc4(double d) {
        int n = t9d.b();
        if (!this.oay.v0f) {
            block3: {
                double d2;
                block4: {
                    d2 = Math.sqrt(d);
                    try {
                        if (n == 0) break block3;
                        if (!(d2 > 5.0)) break block4;
                    }
                    catch (oov oov2) {
                        throw dqh.b(oov2);
                    }
                    d2 = 5.0;
                }
                this.oay.s1r(this, this.o2v, this.kfp, this.vbd, (float)(4.0 + this.z2d.nextDouble() * 1.5 * d2), true);
            }
            this._kl();
        }
    }

    @Override
    public void ibc(float f, float f2) {
        block5: {
            float f3;
            float f4;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        f4 = f;
                        f3 = 3.0f;
                        if (n != 0) break block4;
                        if (!(f4 >= f3)) break block5;
                    }
                    catch (oov oov2) {
                        throw dqh.b(oov2);
                    }
                    f4 = f;
                    f3 = 10.0f;
                }
                catch (oov oov3) {
                    throw dqh.b(oov3);
                }
            }
            float f5 = f4 / f3;
            this.uc4(f5 * f5);
        }
        super.ibc(f, f2);
    }

    @Override
    public void xr9(int n, int n2, int n3, boolean n4) {
        block9: {
            dqh dqh2;
            block10: {
                int n5;
                block8: {
                    int n6 = t9d.b();
                    try {
                        try {
                            try {
                                n5 = n4;
                                if (n6 == 0) break block8;
                                if (n5 == 0) break block9;
                            }
                            catch (oov oov2) {
                                throw dqh.b(oov2);
                            }
                            dqh2 = this;
                            if (n6 == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw dqh.b(oov3);
                        }
                        n5 = dqh2.qbu;
                    }
                    catch (oov oov4) {
                        throw dqh.b(oov4);
                    }
                }
                if (n5 >= 0) break block9;
                dqh2 = this;
            }
            dqh2.dpi();
        }
    }

    @Override
    public void ptf(byte by) {
        block5: {
            int n = t9d.c();
            try {
                block4: {
                    try {
                        if (by != 10) break block4;
                        this.dpi();
                        if (n == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw dqh.b(oov2);
                    }
                }
                super.ptf(by);
            }
            catch (oov oov3) {
                throw dqh.b(oov3);
            }
        }
    }

    public void dpi() {
        block9: {
            dqh dqh2;
            long l;
            block10: {
                boolean bl;
                block8: {
                    l = c ^ 0x3EDEBA3CA407L;
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                this.qbu = 80;
                                bl = this.oay.v0f;
                                if (n == 0) break block8;
                                if (bl) break block9;
                            }
                            catch (oov oov2) {
                                throw dqh.b(oov2);
                            }
                            this.oay.qyn(this, (byte)10);
                            dqh2 = this;
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw dqh.b(oov3);
                        }
                        bl = dqh2.o3x();
                    }
                    catch (oov oov4) {
                        throw dqh.b(oov4);
                    }
                }
                if (bl) break block9;
                dqh2 = this;
            }
            dqh2.oay.yfq(this, (String)((Object)dqh.c("z", (int)25421, (long)(0x3D5DFF71DA92216CL ^ l))), 1.0f, 1.0f);
        }
    }

    public int sb5() {
        return this.qbu;
    }

    public boolean a18() {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = this.qbu;
                        if (n != 0) break block4;
                        if (bl <= -1 != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw dqh.b(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw dqh.b(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float sx1(vu6 vu62, t9d t9d2, mew mew2, zfz zfz2) {
        dqh dqh2;
        block8: {
            block9: {
                boolean bl;
                block10: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                try {
                                    dqh2 = this;
                                    if (n != 0) break block8;
                                    if (!dqh2.a18()) break block9;
                                }
                                catch (oov oov2) {
                                    throw dqh.b(oov2);
                                }
                                bl = y0y.al_(zfz2);
                                if (n != 0) break block10;
                            }
                            catch (oov oov3) {
                                throw dqh.b(oov3);
                            }
                            if (bl) return 0.0f;
                        }
                        catch (oov oov4) {
                            throw dqh.b(oov4);
                        }
                        bl = y0y.slf(t9d2, mew2.nuv());
                    }
                    catch (oov oov5) {
                        throw dqh.b(oov5);
                    }
                }
                if (bl) return 0.0f;
            }
            dqh2 = this;
        }
        float f = super.sx1(vu62, t9d2, mew2, zfz2);
        return f;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean kli(vu6 var1_1, t9d var2_2, mew var3_3, zfz var4_4, float var5_5) {
        block13: {
            block15: {
                block14: {
                    var6_6 = t9d.b();
                    try {
                        try {
                            try {
                                try {
                                    v0 = this.a18();
                                    if (var6_6 == 0) break block13;
                                    if (v0) {
                                    }
                                    ** GOTO lbl34
                                }
                                catch (oov v1) {
                                    throw dqh.b(v1);
                                }
                                v0 = y0y.al_(var4_4);
                                if (var6_6 == 0) break block14;
                            }
                            catch (oov v2) {
                                throw dqh.b(v2);
                            }
                            if (v0) break block15;
                        }
                        catch (oov v3) {
                            throw dqh.b(v3);
                        }
                        v0 = y0y.slf(var2_2, var3_3.nuv());
                    }
                    catch (oov v4) {
                        throw dqh.b(v4);
                    }
                }
                try {
                    try {
                        if (var6_6 == 0) break block13;
                        if (v0) break block15;
                    }
                    catch (oov v5) {
                        throw dqh.b(v5);
                    }
lbl34:
                    // 2 sources

                    v0 = super.kli(var1_1, var2_2, var3_3, var4_4, var5_5);
                    break block13;
                }
                catch (oov v6) {
                    throw dqh.b(v6);
                }
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public void cjb(bdo bdo2) {
        block5: {
            bdo bdo3;
            long l;
            block4: {
                l = c ^ 0x40BE9A24744EL;
                int n = t9d.c();
                try {
                    dqh dqh2;
                    try {
                        dqh2 = this;
                        bdo3 = bdo2;
                        if (n != 0) break block4;
                        super.cjb(bdo3);
                        if (!bdo2.inh((String)((Object)dqh.c("z", (int)7777, (long)(0x5784F8C3F3E60C0AL ^ l))), 99)) break block5;
                    }
                    catch (oov oov2) {
                        throw dqh.b(oov2);
                    }
                    dqh2 = this;
                    bdo3 = bdo2;
                }
                catch (oov oov3) {
                    throw dqh.b(oov3);
                }
            }
            dqh2.qbu = bdo3.uz7((String)((Object)dqh.c("z", (int)7777, (long)(0x5784F8C3F3E60C0AL ^ l))));
        }
    }

    @Override
    public void srs(bdo bdo2) {
        long l = c ^ 0x3610DF7B18E5L;
        super.srs(bdo2);
        bdo2.iin((String)((Object)dqh.c("z", (int)30988, (long)(0x64A703E60C5B07CDL ^ l))), this.qbu);
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

                dqh.c = c.a(8556790111516358623L, -9162506149111651204L, MethodHandles.lookup().lookupClass()).a(135661969430987L);
                dqh.m = new HashMap<K, V>(13);
                var0 = dqh.c ^ 113336504950088L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u000b\u00fa\u00b9Tp|\u009e\u00a4v6\u00ce\u00c5\u00e4\u0085\u0085=\u00c6\u0092\u0096\u00ca\u0087#\u0090\n\u00dc\u0017R5hk\u00d4U \u0087\u001a\u009b(\u00e1\u00a4\u001b\u00fe*(\u00e8\u0099\u00bc_\u00dfJ\u0011\u00ff\u00ecg)\u0014~\u00f9\u00d7\u00be\"\u00f65` \t";
                var8_6 = "\u000b\u00fa\u00b9Tp|\u009e\u00a4v6\u00ce\u00c5\u00e4\u0085\u0085=\u00c6\u0092\u0096\u00ca\u0087#\u0090\n\u00dc\u0017R5hk\u00d4U \u0087\u001a\u009b(\u00e1\u00a4\u001b\u00fe*(\u00e8\u0099\u00bc_\u00dfJ\u0011\u00ff\u00ecg)\u0014~\u00f9\u00d7\u00be\"\u00f65` \t".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = dqh.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00edT\u00f3\u00d7\u0096\u00d9P\u00dc\u00b6\u000e\u00c4\u0081\u0007\u00ee\u00c4\u00b0\u0010m\u0090\u0093+lQ'r\u00016\u0081\u001b\u00fa\u007f\u00b3\u00ee";
                    var8_6 = "\u00edT\u00f3\u00d7\u0096\u00d9P\u00dc\u00b6\u000e\u00c4\u0081\u0007\u00ee\u00c4\u00b0\u0010m\u0090\u0093+lQ'r\u00016\u0081\u001b\u00fa\u007f\u00b3\u00ee".length();
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
                    var9_3[var7_4++] = dqh.c(var10_9).intern();
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
        dqh.d = var9_3;
        dqh.i = new String[4];
    }

    private static oov b(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x42AE;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dqh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            dqh.i[n2] = dqh.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dqh.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dqh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dqh.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

