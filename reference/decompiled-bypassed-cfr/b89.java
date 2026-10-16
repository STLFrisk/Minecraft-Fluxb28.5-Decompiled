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

public class b89
extends gbe {
    private static final moh$_ru[] qmp;
    private static final moh$_ru[] urg;
    private final gbe sna;
    private final moh euy;
    private String don;
    private String mj0;
    private int acp;
    private boolean je9 = false;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public b89(gbe gbe2, moh moh2) {
        this.sna = gbe2;
        this.euy = moh2;
    }

    @Override
    public void initGui() {
        int n;
        gt4 gt42;
        block40: {
            block42: {
                block41: {
                    int n2;
                    block38: {
                        long l;
                        block35: {
                            boolean bl;
                            int n3;
                            int n4;
                            int n5;
                            block33: {
                                block34: {
                                    block30: {
                                        l = a ^ 0x7C6EAF3141F1L;
                                        n5 = 0;
                                        this.don = fc1.gx1((String)((Object)b89.b("t", (int)9161, (long)(0x1DF9C8E6D048C91CL ^ l))), new Object[0]);
                                        this.mj0 = fc1.gx1((String)((Object)b89.b("t", (int)5997, (long)(0x437F8AA5B305FDBDL ^ l))), new Object[0]);
                                        moh$_ru[] object = qmp;
                                        n2 = t9d.c();
                                        for (moh$_ru moh$_ru : object) {
                                            block31: {
                                                try {
                                                    block32: {
                                                        try {
                                                            try {
                                                                try {
                                                                    n4 = moh$_ru.on0() ? 1 : 0;
                                                                    if (n2 != 0) break block30;
                                                                    if (n2 != 0) break block31;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw b89.a(oov2);
                                                                }
                                                                if (n4 == 0) break block32;
                                                            }
                                                            catch (oov oov3) {
                                                                throw b89.a(oov3);
                                                            }
                                                            this.khf.add(new kkh(moh$_ru.ehz(), this.dt7 / 2 - 155 + n5 % 2 * 160, this.o1e / 6 + 24 * (n5 >> 1), moh$_ru));
                                                            if (n2 == 0) break block31;
                                                        }
                                                        catch (oov oov4) {
                                                            throw b89.a(oov4);
                                                        }
                                                    }
                                                    this.khf.add(new cm_(moh$_ru.ehz(), this.dt7 / 2 - 155 + n5 % 2 * 160, this.o1e / 6 + 24 * (n5 >> 1), moh$_ru, this.euy.ycx(moh$_ru)));
                                                }
                                                catch (oov oov5) {
                                                    throw b89.a(oov5);
                                                }
                                            }
                                            ++n5;
                                            if (n2 == 0) continue;
                                        }
                                        n4 = n5 % 2;
                                    }
                                    try {
                                        n3 = 1;
                                        if (n2 != 0) break block33;
                                        if (n4 != n3) break block34;
                                    }
                                    catch (oov oov6) {
                                        throw b89.a(oov6);
                                    }
                                    ++n5;
                                }
                                this.acp = this.o1e / 6 + 24 * (n5 >> 1) + 6;
                                int n3 = n5;
                                n3 = 2;
                            }
                            n5 = n4 + n3;
                            for (moh$_ru moh$_ru : urg) {
                                block36: {
                                    try {
                                        block37: {
                                            try {
                                                try {
                                                    try {
                                                        bl = moh$_ru.on0();
                                                        if (n2 != 0) break block35;
                                                        if (n2 != 0) break block36;
                                                    }
                                                    catch (oov oov7) {
                                                        throw b89.a(oov7);
                                                    }
                                                    if (!bl) break block37;
                                                }
                                                catch (oov oov8) {
                                                    throw b89.a(oov8);
                                                }
                                                this.khf.add(new kkh(moh$_ru.ehz(), this.dt7 / 2 - 155 + n5 % 2 * 160, this.o1e / 6 + 24 * (n5 >> 1), moh$_ru));
                                                if (n2 == 0) break block36;
                                            }
                                            catch (oov oov9) {
                                                throw b89.a(oov9);
                                            }
                                        }
                                        this.khf.add(new cm_(moh$_ru.ehz(), this.dt7 / 2 - 155 + n5 % 2 * 160, this.o1e / 6 + 24 * (n5 >> 1), moh$_ru, this.euy.ycx(moh$_ru)));
                                    }
                                    catch (oov oov10) {
                                        throw b89.a(oov10);
                                    }
                                }
                                ++n5;
                                if (n2 == 0) continue;
                            }
                            bl = this.khf.add(new gt4(200, this.dt7 / 2 - 155, this.o1e / 6 + 168, 150, 20, fc1.gx1((String)((Object)b89.b("t", (int)17566, (long)(0x1CA323086584AE48L ^ l))), new Object[0])));
                        }
                        gt42 = new gt4(201, this.dt7 / 2 + 5, this.o1e / 6 + 168, 150, 20, fc1.gx1((String)((Object)b89.b("t", (int)13490, (long)(0x24D7785B8E4DE65L ^ l))), new Object[0]));
                        try {
                            block39: {
                                try {
                                    try {
                                        try {
                                            gt4 gt43 = gt42;
                                            n = this.f41.vnk().s45();
                                            if (n2 != 0) break block38;
                                            if (n == 0) break block39;
                                        }
                                        catch (oov oov11) {
                                            throw b89.a(oov11);
                                        }
                                        n = this.f41.vnk().pjx().length;
                                        if (n2 != 0) break block40;
                                    }
                                    catch (oov oov12) {
                                        throw b89.a(oov12);
                                    }
                                    if (n > 0) break block41;
                                }
                                catch (oov oov13) {
                                    throw b89.a(oov13);
                                }
                            }
                            n = this.f41.vnk().xy0();
                        }
                        catch (oov oov14) {
                            throw b89.a(oov14);
                        }
                    }
                    try {
                        if (n2 != 0) break block40;
                        if (n == 0) break block42;
                    }
                    catch (oov oov15) {
                        throw b89.a(oov15);
                    }
                }
                n = 1;
                break block40;
            }
            n = 0;
        }
        gt43.c9a = n;
        this.khf.add(gt42);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(gt4 var1_1) {
        block53: {
            block63: {
                block58: {
                    block57: {
                        block61: {
                            block59: {
                                block54: {
                                    block55: {
                                        block56: {
                                            block52: {
                                                var2_2 = t9d.b();
                                                try {
                                                    try {
                                                        v0 = var1_1.c9a;
                                                        if (var2_2 == 0) break block52;
                                                        if (v0 == 0) break block53;
                                                    }
                                                    catch (oov v1) {
                                                        throw b89.a(v1);
                                                    }
                                                    v0 = var1_1._me;
                                                }
                                                catch (oov v2) {
                                                    throw b89.a(v2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var2_2 == 0) break block54;
                                                        if (v0 < 100) {
                                                        }
                                                        ** GOTO lbl66
                                                    }
                                                    catch (oov v3) {
                                                        throw b89.a(v3);
                                                    }
                                                    v0 = var1_1 instanceof cm_;
                                                    if (var2_2 == 0) break block54;
                                                }
                                                catch (oov v4) {
                                                    throw b89.a(v4);
                                                }
                                                if (v0 != 0) {
                                                }
                                                ** GOTO lbl66
                                            }
                                            catch (oov v5) {
                                                throw b89.a(v5);
                                            }
                                            var3_3 = ((cm_)var1_1).t4j();
                                            try {
                                                try {
                                                    try {
                                                        this.euy.d13(var3_3, 1);
                                                        var1_1.frg = this.euy.ycx(moh$_ru.jit(var1_1._me));
                                                        if (!this.f41.vnk().tvw()) break block55;
                                                        v6 = var3_3;
                                                        v7 = moh$_ru.sys;
                                                        if (var2_2 == 0) break block56;
                                                    }
                                                    catch (oov v8) {
                                                        throw b89.a(v8);
                                                    }
                                                    if (v6 == v7) break block55;
                                                }
                                                catch (oov v9) {
                                                    throw b89.a(v9);
                                                }
                                                v6 = var3_3;
                                                v7 = moh$_ru.sag;
                                            }
                                            catch (oov v10) {
                                                throw b89.a(v10);
                                            }
                                        }
                                        try {
                                            if (v6 != v7) {
                                                this.je9 = true;
                                            }
                                        }
                                        catch (oov v11) {
                                            throw b89.a(v11);
                                        }
                                    }
                                    try {
                                        if (var2_2 != 0) break block57;
lbl66:
                                        // 3 sources

                                        v0 = var1_1 instanceof kkh;
                                    }
                                    catch (oov v12) {
                                        throw b89.a(v12);
                                    }
                                }
                                try {
                                    try {
                                        block60: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var2_2 == 0) break block58;
                                                            if (v0 == 0) break block57;
                                                        }
                                                        catch (oov v13) {
                                                            throw b89.a(v13);
                                                        }
                                                        v0 = var1_1._me;
                                                        v14 = moh$_ru.buz.ehz();
                                                        if (var2_2 == 0) break block59;
                                                    }
                                                    catch (oov v15) {
                                                        throw b89.a(v15);
                                                    }
                                                    if (v0 != v14) break block60;
                                                }
                                                catch (oov v16) {
                                                    throw b89.a(v16);
                                                }
                                                this.f41.vnk().h1g();
                                                if (var2_2 != 0) break block57;
                                            }
                                            catch (oov v17) {
                                                throw b89.a(v17);
                                            }
                                        }
                                        v0 = var1_1._me;
                                        if (var2_2 == 0) break block61;
                                    }
                                    catch (oov v18) {
                                        throw b89.a(v18);
                                    }
                                    v14 = moh$_ru.lz2.ehz();
                                }
                                catch (oov v19) {
                                    throw b89.a(v19);
                                }
                            }
                            try {
                                block62: {
                                    try {
                                        if (v0 != v14) break block62;
                                        this.f41.vnk().h1g();
                                        if (var2_2 != 0) break block57;
                                    }
                                    catch (oov v20) {
                                        throw b89.a(v20);
                                    }
                                }
                                v0 = (int)this.f41.vnk().tvw();
                            }
                            catch (oov v21) {
                                throw b89.a(v21);
                            }
                        }
                        try {
                            try {
                                if (var2_2 == 0) break block58;
                                if (v0 == 0) break block57;
                            }
                            catch (oov v22) {
                                throw b89.a(v22);
                            }
                            this.je9 = true;
                        }
                        catch (oov v23) {
                            throw b89.a(v23);
                        }
                    }
                    v0 = var1_1._me;
                }
                try {
                    block64: {
                        try {
                            try {
                                v24 = 200;
                                if (var2_2 == 0) break block63;
                                if (v0 != v24) break block64;
                            }
                            catch (oov v25) {
                                throw b89.a(v25);
                            }
                            this.f41.oxn.cmo();
                            this.f41.z2i(this.sna);
                            if (var2_2 != 0) break block53;
                        }
                        catch (oov v26) {
                            throw b89.a(v26);
                        }
                    }
                    v0 = var1_1._me;
                    v24 = 201;
                }
                catch (oov v27) {
                    throw b89.a(v27);
                }
            }
            try {
                if (v0 == v24) {
                    this.f41.oxn.cmo();
                    this.f41.z2i(new p2v(this));
                }
            }
            catch (oov v28) {
                throw b89.a(v28);
            }
        }
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        b89 b892;
        block5: {
            block6: {
                long l = a ^ 0x6434F16D9ACEL;
                this.xmz();
                int n3 = t9d.c();
                this.poi(this.fex, this.don, this.dt7 / 2, 20, 0xFFFFFF);
                this.poi(this.fex, this.mj0, this.dt7 / 2, this.acp, 0xFFFFFF);
                int n4 = n3;
                try {
                    try {
                        b892 = this;
                        if (n4 != 0) break block5;
                        if (b892.je9) {
                        }
                        break block6;
                    }
                    catch (oov oov2) {
                        throw b89.a(oov2);
                    }
                    this.poi(this.fex, (Object)((Object)syo.aez) + fc1.gx1((String)((Object)b89.b("t", (int)32520, (long)(0x363906F6A5B5CEE3L ^ l))), new Object[0]), this.dt7 / 2, 20 + this.fex.rr7, 0xFFFFFF);
                }
                catch (oov oov3) {
                    throw b89.a(oov3);
                }
            }
            b892 = this;
        }
        super.drawScreen(n, n2, f);
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

                b89.a = c.a(7892424066911507344L, 4247185746618324224L, MethodHandles.lookup().lookupClass()).a(123399193147527L);
                b89.h = new HashMap<K, V>(13);
                var0 = b89.a ^ 77487900756910L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u009cV\u0002\u00ebx\u00e5\u00b1\u00107sZy\u00f4\u00f8f(d@\u00a3?}\u00a8\u0017\u00cde\u0003\u00ba\u00b6QU\u009ar}\u0098\u00e0n\u008a\u00b3\u00c4~(\u00d2\u001c\u00f8\u0019\u000e\u00e0\u00fb%\u00fek\u001fi\u00cd\u00ec\u009dz2\u00bfD\u00d3A\u00a0\u001a\u00f9\u00cb\u00c0D\u00fd\u00cbl\u0094\b\u00101\u009f\u00f6\u0084\u00e0\u00b8\u00c7\u0018\u0081\u00b68\u00f5\u007f\u0013\u00bf\u00dajq\u0091\u00ac\u00e2\u000b\u0000\u0081\u001el?\u000f\u00ae2J#";
                var8_6 = "\u009cV\u0002\u00ebx\u00e5\u00b1\u00107sZy\u00f4\u00f8f(d@\u00a3?}\u00a8\u0017\u00cde\u0003\u00ba\u00b6QU\u009ar}\u0098\u00e0n\u008a\u00b3\u00c4~(\u00d2\u001c\u00f8\u0019\u000e\u00e0\u00fb%\u00fek\u001fi\u00cd\u00ec\u009dz2\u00bfD\u00d3A\u00a0\u001a\u00f9\u00cb\u00c0D\u00fd\u00cbl\u0094\b\u00101\u009f\u00f6\u0084\u00e0\u00b8\u00c7\u0018\u0081\u00b68\u00f5\u007f\u0013\u00bf\u00dajq\u0091\u00ac\u00e2\u000b\u0000\u0081\u001el?\u000f\u00ae2J#".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = b89.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f2/O\u00eb5\u0085I\u00b3\u00a6!\u00c1\u00b0\u0007\u00b2\u00d9\u00a8A\u000e@\u00f0h~!\u0017\u00b1\u00eb\u00a2f\u00ab\u00d8\"\u00c1\u00de\u00e0\u00cd\u00d6-\u0089\u0013\u00a6:\u00e7u\u00f9\u0084\u00fa[\u0018\u0096\u00f2\u00d6\u001d,\u00fd)\u00d78\u0096\u000b\u00d3n\u00d0Z\u008e\u00cb\u00ad\u00df\u00e2\u0018R\u0098\u0011\u001aV\u001c \u008fU\u000f'\u0015\r\u00d2-x5\u0012\u0013q$\tI=%\u00a3\u00e3\u009ab\u00da*\u008c\n\u00e0@\f\u00be}\u00e5\u0015\u0015\u009c\u00c6\u00f8";
                    var8_6 = "\u00f2/O\u00eb5\u0085I\u00b3\u00a6!\u00c1\u00b0\u0007\u00b2\u00d9\u00a8A\u000e@\u00f0h~!\u0017\u00b1\u00eb\u00a2f\u00ab\u00d8\"\u00c1\u00de\u00e0\u00cd\u00d6-\u0089\u0013\u00a6:\u00e7u\u00f9\u0084\u00fa[\u0018\u0096\u00f2\u00d6\u001d,\u00fd)\u00d78\u0096\u000b\u00d3n\u00d0Z\u008e\u00cb\u00ad\u00df\u00e2\u0018R\u0098\u0011\u001aV\u001c \u008fU\u000f'\u0015\r\u00d2-x5\u0012\u0013q$\tI=%\u00a3\u00e3\u009ab\u00da*\u008c\n\u00e0@\f\u00be}\u00e5\u0015\u0015\u009c\u00c6\u00f8".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = b89.a(var10_9).intern();
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
        b89.b = var9_3;
        b89.g = new String[5];
        b89.qmp = new moh$_ru[]{moh$_ru.qki, moh$_ru.egw, moh$_ru.rwj, moh$_ru.bpk, moh$_ru.buz, moh$_ru.lz2, moh$_ru.hnb, moh$_ru.q98};
        b89.urg = new moh$_ru[]{moh$_ru.sys, moh$_ru.sag};
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x11D9;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("b89", exception);
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
            b89.g[n2] = b89.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b89.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("b89" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b89.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

