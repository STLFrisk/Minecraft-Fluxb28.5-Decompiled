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
import net.minecraft.network.play.server.S2BPacketChangeGameState;

public class ego
extends rsh {
    private /* synthetic */ boolean fdl;
    private /* synthetic */ boolean yub;
    private /* synthetic */ int nbm;
    private /* synthetic */ int b0d;
    private static final long a = c.a(4930345785388305091L, 3109082369812088316L, MethodHandles.lookup().lookupClass()).a(36169801848384L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ego(t9d t9d2) {
        super(t9d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void gwt() {
        block61: {
            block67: {
                block62: {
                    block65: {
                        block63: {
                            block59: {
                                block57: {
                                    block58: {
                                        block55: {
                                            block56: {
                                                block53: {
                                                    block54: {
                                                        var1_1 = ego.a ^ 5669039876261L;
                                                        super.gwt();
                                                        ++this.b0d;
                                                        var3_2 = t9d.c();
                                                        var4_3 = this.bk1.p2b();
                                                        var6_4 = var4_3 / 24000L + 1L;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v0 = this;
                                                                        if (var3_2 != 0) break block53;
                                                                        if (v0.fdl) break block54;
                                                                    }
                                                                    catch (oov v1) {
                                                                        throw ego.a(v1);
                                                                    }
                                                                    v0 = this;
                                                                    if (var3_2 != 0) break block53;
                                                                }
                                                                catch (oov v2) {
                                                                    throw ego.a(v2);
                                                                }
                                                                if (v0.b0d <= 20) break block54;
                                                            }
                                                            catch (oov v3) {
                                                                throw ego.a(v3);
                                                            }
                                                            this.fdl = true;
                                                            this.rpl.rhh.vnf(new S2BPacketChangeGameState(5, 0.0f));
                                                        }
                                                        catch (oov v4) {
                                                            throw ego.a(v4);
                                                        }
                                                    }
                                                    v0 = this;
                                                }
                                                try {
                                                    cfr_temp_0 = var4_3 - 120500L;
                                                    v5 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                    if (var3_2 != 0) break block55;
                                                    if (v5 <= 0) break block56;
                                                }
                                                catch (oov v6) {
                                                    throw ego.a(v6);
                                                }
                                                v5 = 1;
                                                break block55;
                                            }
                                            v5 = 0;
                                        }
                                        try {
                                            try {
                                                v0.yub = v5;
                                                v7 = this.yub;
                                                if (var3_2 != 0) break block57;
                                                if (!v7) break block58;
                                            }
                                            catch (oov v8) {
                                                throw ego.a(v8);
                                            }
                                            ++this.nbm;
                                        }
                                        catch (oov v9) {
                                            throw ego.a(v9);
                                        }
                                    }
                                    v7 = (cfr_temp_1 = var4_3 % 24000L - 500L) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                }
                                try {
                                    block60: {
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 != 0) break block59;
                                                    if (v7) break block60;
                                                }
                                                catch (oov v10) {
                                                    throw ego.a(v10);
                                                }
                                                if (var6_4 <= 6L) {
                                                }
                                                break block61;
                                            }
                                            catch (oov v11) {
                                                throw ego.a(v11);
                                            }
                                            this.rpl.a0d(new hsu((String)ego.a("w", (int)3474, (long)(6709841402517011638L ^ var1_1)) + var6_4, new Object[0]));
                                            if (var3_2 == 0) break block61;
                                        }
                                        catch (oov v12) {
                                            throw ego.a(v12);
                                        }
                                    }
                                    v7 = (cfr_temp_2 = var6_4 - 1L) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                }
                                catch (oov v13) {
                                    throw ego.a(v13);
                                }
                            }
                            try {
                                block64: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var3_2 != 0) break block62;
                                                    if (!v7) {
                                                    }
                                                    ** GOTO lbl150
                                                }
                                                catch (oov v14) {
                                                    throw ego.a(v14);
                                                }
                                                cfr_temp_3 = var4_3 - 100L;
                                                v15 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                                if (var3_2 != 0) break block63;
                                            }
                                            catch (oov v16) {
                                                throw ego.a(v16);
                                            }
                                            if (v15 == false) {
                                            }
                                            break block64;
                                        }
                                        catch (oov v17) {
                                            throw ego.a(v17);
                                        }
                                        this.rpl.rhh.vnf(new S2BPacketChangeGameState(5, 101.0f));
                                        if (var3_2 == 0) break block61;
                                    }
                                    catch (oov v18) {
                                        throw ego.a(v18);
                                    }
                                }
                                v15 = (cfr_temp_4 = var4_3 - 175L) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                            }
                            catch (oov v19) {
                                throw ego.a(v19);
                            }
                        }
                        try {
                            block66: {
                                try {
                                    try {
                                        if (var3_2 != 0) break block65;
                                        if (v15 == false) {
                                        }
                                        break block66;
                                    }
                                    catch (oov v20) {
                                        throw ego.a(v20);
                                    }
                                    this.rpl.rhh.vnf(new S2BPacketChangeGameState(5, 102.0f));
                                    if (var3_2 == 0) break block61;
                                }
                                catch (oov v21) {
                                    throw ego.a(v21);
                                }
                            }
                            v15 = (cfr_temp_5 = var4_3 - 250L) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                        }
                        catch (oov v22) {
                            throw ego.a(v22);
                        }
                    }
                    try {
                        try {
                            if (v15 != false) break block61;
                            this.rpl.rhh.vnf(new S2BPacketChangeGameState(5, 103.0f));
                            if (var3_2 == 0) break block61;
                        }
                        catch (oov v23) {
                            throw ego.a(v23);
                        }
lbl150:
                        // 2 sources

                        v7 = (cfr_temp_6 = var6_4 - 5L) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1);
                    }
                    catch (oov v24) {
                        throw ego.a(v24);
                    }
                }
                try {
                    try {
                        if (var3_2 != 0) break block67;
                        if (v7) break block61;
                    }
                    catch (oov v25) {
                        throw ego.a(v25);
                    }
                    cfr_temp_7 = var4_3 % 24000L - 22000L;
                    v7 = cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1);
                }
                catch (oov v26) {
                    throw ego.a(v26);
                }
            }
            try {
                if (!v7) {
                    this.rpl.a0d(new hsu((String)ego.a("w", (int)18923, (long)(2929586226487589070L ^ var1_1)), new Object[0]));
                }
            }
            catch (oov v27) {
                throw ego.a(v27);
            }
        }
    }

    private void f95() {
        block6: {
            block5: {
                long l = a ^ 0x43AAE8DF8184L;
                int n = t9d.b();
                try {
                    ego ego2;
                    try {
                        ego2 = this;
                        if (n == 0) break block5;
                        if (ego2.nbm > 100) {
                        }
                        break block6;
                    }
                    catch (oov oov2) {
                        throw ego.a(oov2);
                    }
                    this.rpl.a0d(new hsu((String)((Object)ego.a("w", (int)23366, (long)(0x5D4D01EA2616C340L ^ l))), new Object[0]));
                    ego2 = this;
                }
                catch (oov oov3) {
                    throw ego.a(oov3);
                }
            }
            ego2.nbm = 0;
        }
    }

    @Override
    public void o29(mew mew2, vt2 vt22) {
        block8: {
            ego ego2;
            block6: {
                int n = t9d.c();
                try {
                    block7: {
                        try {
                            try {
                                ego2 = this;
                                if (n != 0) break block6;
                                if (!ego2.yub) break block7;
                            }
                            catch (oov oov2) {
                                throw ego.a(oov2);
                            }
                            this.f95();
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw ego.a(oov3);
                        }
                    }
                    ego2 = this;
                }
                catch (oov oov4) {
                    throw ego.a(oov4);
                }
            }
            super.o29(mew2, vt22);
        }
    }

    @Override
    public void z8m(mew mew2) {
        block5: {
            ego ego2;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        ego2 = this;
                        if (n == 0) break block4;
                        if (ego2.yub) break block5;
                    }
                    catch (oov oov2) {
                        throw ego.a(oov2);
                    }
                    ego2 = this;
                }
                catch (oov oov3) {
                    throw ego.a(oov3);
                }
            }
            super.z8m(mew2);
        }
    }

    @Override
    public boolean s4o(mew mew2) {
        boolean bl;
        block6: {
            ego ego2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            ego2 = this;
                            if (n != 0) break block4;
                            if (!ego2.yub) break block5;
                        }
                        catch (oov oov2) {
                            throw ego.a(oov2);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw ego.a(oov3);
                    }
                }
                ego2 = this;
            }
            bl = super.s4o(mew2);
        }
        return bl;
    }

    @Override
    public boolean mn_(ha9 ha92, t9d t9d2, erg erg2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.yub;
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw ego.a(oov2);
                    }
                    this.f95();
                    return false;
                }
                catch (oov oov3) {
                    throw ego.a(oov3);
                }
            }
            bl = super.mn_(ha92, t9d2, erg2);
        }
        return bl;
    }

    @Override
    public boolean nh0(ha9 ha92, t9d t9d2, erg erg2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.yub;
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw ego.a(oov2);
                    }
                    this.f95();
                    return false;
                }
                catch (oov oov3) {
                    throw ego.a(oov3);
                }
            }
            bl = super.nh0(ha92, t9d2, erg2, mew2, vt22, f, f2, f3);
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x3A73D3335068L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "j7\u00da\u001a\u0010\u00bc%\u00aa\u00fd\u00b7\u00e6\u00e8\u0014\u00d21\u0007\"\u0001\u00e8*\u00f4\n9\u0006\u00f9P\u00b5\u00f2\u0099\u00ae\u001dL\t\u00d9\u00881\u0081.\"o T\u00d6\u00c0\u00f4\u00e2\u009f\u0099\u008d2\u00dd\u00d2\u001f`\u0004D\u00a50_\u008c\u00b8\u009b\u008d\u000e\u009f2\u00ff\u0089g}\u00fc{\u00c3 \u00c3I\u0011V\r\u00a7\u00ff]\u0004\u00cf\u0004\u00ae\u00bf\u008a\u00ec^=\u009a\u0002H\u00b3\u009b\u00c0(\u000ef\u00e9\u0089\u00a0\u00fe\u00c8T";
        int n2 = "j7\u00da\u001a\u0010\u00bc%\u00aa\u00fd\u00b7\u00e6\u00e8\u0014\u00d21\u0007\"\u0001\u00e8*\u00f4\n9\u0006\u00f9P\u00b5\u00f2\u0099\u00ae\u001dL\t\u00d9\u00881\u0081.\"o T\u00d6\u00c0\u00f4\u00e2\u009f\u0099\u008d2\u00dd\u00d2\u001f`\u0004D\u00a50_\u008c\u00b8\u009b\u008d\u000e\u009f2\u00ff\u0089g}\u00fc{\u00c3 \u00c3I\u0011V\r\u00a7\u00ff]\u0004\u00cf\u0004\u00ae\u00bf\u008a\u00ec^=\u009a\u0002H\u00b3\u009b\u00c0(\u000ef\u00e9\u0089\u00a0\u00fe\u00c8T".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ego.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2810;
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
                throw new RuntimeException("ego", exception);
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
            ego.c[n2] = ego.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ego.a(n, l);
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
            throw new RuntimeException("ego" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ego.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

