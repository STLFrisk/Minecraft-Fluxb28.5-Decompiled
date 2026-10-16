/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbk
extends gbe {
    private static final Logger kmy;
    private static final gdz zcg;
    private static final gdz _oq;
    private int dse;
    private List r_6;
    private int a_l;
    private float eim = 0.5f;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    @Override
    public void updateScreen() {
        block11: {
            bbk bbk2;
            block10: {
                int n;
                int n2;
                block8: {
                    dbu dbu2;
                    block9: {
                        xw1 xw12 = this.f41.ail();
                        dbu2 = this.f41.yp9();
                        n2 = t9d.c();
                        try {
                            try {
                                n = this.dse;
                                if (n2 != 0) break block8;
                                if (n != 0) break block9;
                            }
                            catch (oov oov2) {
                                throw bbk.a(oov2);
                            }
                            xw12.jnm();
                            xw12.jjv(xw1$ial.k0h);
                            dbu2.llt();
                        }
                        catch (oov oov3) {
                            throw bbk.a(oov3);
                        }
                    }
                    dbu2._21();
                    ++this.dse;
                    n = this.a_l + this.o1e + this.o1e + 24;
                }
                float f = (float)n / this.eim;
                try {
                    try {
                        bbk2 = this;
                        if (n2 != 0) break block10;
                        if (!((float)bbk2.dse > f)) break block11;
                    }
                    catch (oov oov4) {
                        throw bbk.a(oov4);
                    }
                    bbk2 = this;
                }
                catch (oov oov5) {
                    throw bbk.a(oov5);
                }
            }
            bbk2.op2();
        }
    }

    @Override
    public void dig(char c2, int n) {
        try {
            if (n == 1) {
                this.op2();
            }
        }
        catch (oov oov2) {
            throw bbk.a(oov2);
        }
    }

    private void op2() {
        this.f41.vg8.lq7.sxi(new C16PacketClientStatus(C16PacketClientStatus$v78.ggv));
        this.f41.z2i(null);
    }

    @Override
    public boolean a99() {
        return true;
    }

    /*
     * Loose catch block
     */
    @Override
    public void initGui() {
        block20: {
            int n;
            long l;
            block19: {
                l = a ^ 0x10A33958CBA4L;
                n = t9d.b();
                bbk bbk2 = this;
                if (n == 0) break block19;
                try {
                    block23: {
                        if (bbk2.r_6 != null) break block20;
                        break block23;
                        catch (Exception exception) {
                            throw bbk.a(exception);
                        }
                    }
                    bbk2 = this;
                }
                catch (Exception exception) {
                    throw bbk.a(exception);
                }
            }
            bbk2.r_6 = Lists.newArrayList();
            try {
                BufferedReader bufferedReader;
                InputStream inputStream;
                int n2;
                String string;
                block22: {
                    string = "";
                    String string2 = "" + (Object)((Object)syo.rl1) + (Object)((Object)syo.sxj) + (Object)((Object)syo.qjc) + (Object)((Object)syo.c8f);
                    n2 = 274;
                    inputStream = this.f41.mpf().td5(new gdz((String)((Object)bbk.b("n", (int)1230, (long)(0x7507AB6B5B120AFFL ^ l))))).f_4();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                    Random random = new Random(8124371L);
                    while ((string = bufferedReader.readLine()) != null) {
                        block21: {
                            string = string.replaceAll((String)((Object)bbk.b("n", (int)6658, (long)(0x25D00520674D943CL ^ l))), this.f41.ee0().z2u());
                            while (string.contains(string2)) {
                                int n3 = string.indexOf(string2);
                                String string3 = string.substring(0, n3);
                                String string4 = string.substring(n3 + string2.length());
                                string = string3 + (Object)((Object)syo.rl1) + (Object)((Object)syo.sxj) + ((String)((Object)bbk.b("n", (int)18863, (long)(0x65DCF97239904792L ^ l)))).substring(0, random.nextInt(4) + 3) + string4;
                                try {
                                    if (n != 0) {
                                        if (n != 0) continue;
                                        break;
                                    }
                                    break block21;
                                }
                                catch (Exception exception) {
                                    throw bbk.a(exception);
                                }
                            }
                            this.r_6.addAll(this.f41.tx1.g8u(string, n2));
                            this.r_6.add("");
                        }
                        if (n != 0) continue;
                    }
                    inputStream.close();
                    for (int i = 0; i < 8; ++i) {
                        try {
                            this.r_6.add("");
                            if (n != 0) {
                                if (n != 0) continue;
                                break;
                            }
                            break block22;
                        }
                        catch (Exception exception) {
                            throw bbk.a(exception);
                        }
                    }
                    inputStream = this.f41.mpf().td5(new gdz((String)((Object)bbk.b("n", (int)16801, (long)(0x5AA0E75E21C1CF9DL ^ l))))).f_4();
                }
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
                while ((string = bufferedReader.readLine()) != null) {
                    string = string.replaceAll((String)((Object)bbk.b("n", (int)24332, (long)(0x7C0EF566409B5135L ^ l))), this.f41.ee0().z2u());
                    string = string.replaceAll("\t", (String)((Object)bbk.b("n", (int)11609, (long)(0x28E300BDBF41A362L ^ l))));
                    try {
                        this.r_6.addAll(this.f41.tx1.g8u(string, n2));
                        this.r_6.add("");
                        if (n != 0) {
                            if (n != 0) continue;
                            break;
                        }
                        break block20;
                    }
                    catch (Exception exception) {
                        throw bbk.a(exception);
                    }
                }
                inputStream.close();
                this.a_l = this.r_6.size() * 12;
            }
            catch (Exception exception) {
                kmy.error((String)((Object)bbk.b("n", (int)11204, (long)(0x36522314B7C525FBL ^ l))), (Throwable)exception);
            }
        }
    }

    private void dvl(int n, int n2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int n3;
        q3g q3g2;
        jom jom2;
        block7: {
            float f8;
            block5: {
                int n4;
                block6: {
                    jom2 = jom.yut();
                    q3g2 = jom2.zuq();
                    this.f41.l22().anl(b0t.yby);
                    int n5 = t9d.b();
                    q3g2.ezr(7, gnl.rad);
                    n4 = n5;
                    n3 = this.dt7;
                    f7 = 0.0f - ((float)this.dse + f) * 0.5f * this.eim;
                    f6 = (float)this.o1e - ((float)this.dse + f) * 0.5f * this.eim;
                    f5 = 0.015625f;
                    f4 = ((float)this.dse + f - 0.0f) * 0.02f;
                    float f9 = (float)(this.a_l + this.o1e + this.o1e + 24) / this.eim;
                    float f10 = (f9 - 20.0f - ((float)this.dse + f)) * 0.005f;
                    try {
                        f8 = f10 == f4 ? 0 : (f10 < f4 ? -1 : 1);
                        if (n4 == 0) break block5;
                        if (f8 >= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw bbk.a(oov2);
                    }
                    f4 = f10;
                }
                try {
                    f3 = f4;
                    f2 = 1.0f;
                    if (n4 == 0) break block7;
                    float f11 = f3 - f2;
                    f8 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                }
                catch (oov oov3) {
                    throw bbk.a(oov3);
                }
            }
            if (f8 > 0) {
                f4 = 1.0f;
            }
            f4 *= f4;
            f3 = f4 * 96.0f;
            f2 = 255.0f;
        }
        f4 = f3 / f2;
        q3g2.g5o(0.0, this.o1e, this.o3s).h0a(0.0, f7 * f5).gs4(f4, f4, f4, 1.0f).pzw();
        q3g2.g5o(n3, this.o1e, this.o3s).h0a((float)n3 * f5, f7 * f5).gs4(f4, f4, f4, 1.0f).pzw();
        q3g2.g5o(n3, 0.0, this.o3s).h0a((float)n3 * f5, f6 * f5).gs4(f4, f4, f4, 1.0f).pzw();
        q3g2.g5o(0.0, 0.0, this.o3s).h0a(0.0, f6 * f5).gs4(f4, f4, f4, 1.0f).pzw();
        jom2.q7g();
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        int n3;
        int n4;
        int n5;
        q3g q3g2;
        jom jom2;
        block21: {
            long l = a ^ 0x8F96704109BL;
            this.dvl(n, n2, f);
            jom2 = jom.yut();
            int n6 = t9d.b();
            q3g2 = jom2.zuq();
            int n7 = 274;
            int n8 = this.dt7 / 2 - n7 / 2;
            int n9 = this.o1e + 50;
            float f2 = -((float)this.dse + f) * this.eim;
            hzu.dp2();
            hzu.a4k(0.0f, f2, 0.0f);
            this.f41.l22().anl(zcg);
            hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
            this.mt4(n8, n9, 0, 0, 155, 44);
            this.mt4(n8 + 155, n9, 0, 45, 155, 44);
            int n10 = n9 + 200;
            for (n5 = 0; n5 < this.r_6.size(); ++n5) {
                block24: {
                    int n11;
                    block23: {
                        block20: {
                            float f3;
                            block22: {
                                try {
                                    try {
                                        n11 = n5;
                                        if (n6 == 0) break block20;
                                        n4 = this.r_6.size() - 1;
                                        if (n6 == 0) break block21;
                                    }
                                    catch (oov oov2) {
                                        throw bbk.a(oov2);
                                    }
                                    if (n11 != n4) break block22;
                                }
                                catch (oov oov3) {
                                    throw bbk.a(oov3);
                                }
                                float f4 = (float)n10 + f2 - (float)(this.o1e / 2 - 6);
                                try {
                                    try {
                                        float f5 = f4 - 0.0f;
                                        n11 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                                        if (n6 == 0) break block20;
                                        if (n11 >= 0) break block22;
                                    }
                                    catch (oov oov4) {
                                        throw bbk.a(oov4);
                                    }
                                    hzu.a4k(0.0f, -f4, 0.0f);
                                }
                                catch (oov oov5) {
                                    throw bbk.a(oov5);
                                }
                            }
                            n11 = (f3 = (float)n10 + f2 + 12.0f + 8.0f - 0.0f) == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                        }
                        try {
                            try {
                                if (n6 == 0) break block23;
                                if (n11 <= 0) break block24;
                            }
                            catch (oov oov6) {
                                throw bbk.a(oov6);
                            }
                            float f6 = (float)n10 + f2 - (float)this.o1e;
                            n11 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                        }
                        catch (oov oov7) {
                            throw bbk.a(oov7);
                        }
                    }
                    if (n11 < 0) {
                        String string = (String)this.r_6.get(n5);
                        try {
                            int n12;
                            block25: {
                                try {
                                    try {
                                        n12 = string.startsWith((String)((Object)bbk.b("n", (int)6565, (long)(0x6E65F74F6559CCAAL ^ l))));
                                        if (n6 == 0) break block24;
                                        if (n12 == 0) break block25;
                                    }
                                    catch (oov oov8) {
                                        throw bbk.a(oov8);
                                    }
                                    this.fex.km1(string.substring(3), n8 + (n7 - this.fex.ezt(string.substring(3))) / 2, n10, 0xFFFFFF);
                                    if (n6 != 0) break block24;
                                }
                                catch (oov oov9) {
                                    throw bbk.a(oov9);
                                }
                            }
                            this.fex.l0s.setSeed((long)n5 * 4238972211L + (long)(this.dse / 4));
                            n12 = this.fex.km1(string, n8, n10, 0xFFFFFF);
                        }
                        catch (oov oov10) {
                            throw bbk.a(oov10);
                        }
                    }
                }
                n10 += 12;
                if (n6 != 0) continue;
            }
            hzu.x3w();
            this.f41.l22().anl(_oq);
            hzu.spd();
            n3 = 0;
            n4 = 769;
        }
        hzu.ru7(n3, n4);
        n5 = this.dt7;
        int n13 = this.o1e;
        q3g2.ezr(7, gnl.rad);
        q3g2.g5o(0.0, n13, this.o3s).h0a(0.0, 1.0).gs4(1.0f, 1.0f, 1.0f, 1.0f).pzw();
        q3g2.g5o(n5, n13, this.o3s).h0a(1.0, 1.0).gs4(1.0f, 1.0f, 1.0f, 1.0f).pzw();
        q3g2.g5o(n5, 0.0, this.o3s).h0a(1.0, 0.0).gs4(1.0f, 1.0f, 1.0f, 1.0f).pzw();
        q3g2.g5o(0.0, 0.0, this.o3s).h0a(0.0, 0.0).gs4(1.0f, 1.0f, 1.0f, 1.0f).pzw();
        jom2.q7g();
        hzu.ux6();
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

                bbk.a = c.a(1146452377443368703L, 251458952407923802L, MethodHandles.lookup().lookupClass()).a(19873698816536L);
                var9 = bbk.a ^ 77929218395157L;
                bbk.h = new HashMap<K, V>(13);
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
                var7_3 = new String[10];
                var5_4 = 0;
                var4_5 = "j\u008b\u00e9*\u00ac\u00c1\u00f5\u00f1R\u00b6\u00de\u00a3\u008b\u0010\u00f3\u00a0\u00d5\u00b8\u00ab\u00e5\u0097\u00a8\u00f4\u00ab@\u00bc\u00b9\u00aao~\u0018)\u001b\u00a2\u00cd\u00d5\f!\u000e\u00d7\u00a0\u00be\u009f\u00f8\u0094\u0081\u0091\u00cf\u0015\u008a\u0094\u00bd\u00ebC\u00f3\u0018w]\u0084R\u00ea\u008b\u0083\u0000]\u0016\u00ad\u00a0\u00efZC\u000fKU\u0001\u00d0\u00db\u008a{\u0019?\u00dc\u00aa\u000b\u00ee{\u00c8\u009c\u00b5\u0010\u008frBM(CP\u0093\u00fcs\u00a3\u00a8\u001d\u00c0\u00d6>0\u00e1\u00c6\u000e\u001c2[\u00b4)\u00c3\u00a4\u001e\t\u00b7}\u00a9\u00fc\u00e2\u00b6\t\u00f19EPq\u00ce`\u00f4\u00a7`X\u00b3\u0085a\u00c4\u00e9\u00b4\u00a0\u008a\u0000\u001b\u00fd\u00c9\u0098e\u0084(=+ \u00a3\u00c9\u00a3\u0000\u0002\u0002\u00ec<1\u0003\u0087\u00b9)k\u0099\u00ea)\u0089\u00feLt|\u009c\u000e\u00d3\u00bb\u0018\u00a4\u0015\u001ed\u00f7(\u0006\u009b>\u00a8\u00c4:>\u00ca/\u00e7pp\u00f77\u00c4\u00f2Zz)\u0007\u00f5=\u00ac\u0099i\u001dp*{\u00bd\u0099\u00ab[\u00c0\u00b6\u00d7\u0010K\u009f4(\u00e0f<.`\u00cb\u00f9\u00a1>\u00db\u00ac}\u0085VY\u0097+\u00c9\u00d5\u0000\u0015\u00ad\u00e6\u0099\u0082I\u0090\u00f2\u0081i8\u00b0\u0002{\u00a7\u000e\u00fe\u00cd\u009f\u00bd\u0018d\u0088$\u008d\u00f8\u00cb~\u0086\u0082\u00a5M\u001bp0\u00ff\u008e|\u00b9\u00d5\u00d1\u0015\u001c\u00cf\u008c";
                var6_6 = "j\u008b\u00e9*\u00ac\u00c1\u00f5\u00f1R\u00b6\u00de\u00a3\u008b\u0010\u00f3\u00a0\u00d5\u00b8\u00ab\u00e5\u0097\u00a8\u00f4\u00ab@\u00bc\u00b9\u00aao~\u0018)\u001b\u00a2\u00cd\u00d5\f!\u000e\u00d7\u00a0\u00be\u009f\u00f8\u0094\u0081\u0091\u00cf\u0015\u008a\u0094\u00bd\u00ebC\u00f3\u0018w]\u0084R\u00ea\u008b\u0083\u0000]\u0016\u00ad\u00a0\u00efZC\u000fKU\u0001\u00d0\u00db\u008a{\u0019?\u00dc\u00aa\u000b\u00ee{\u00c8\u009c\u00b5\u0010\u008frBM(CP\u0093\u00fcs\u00a3\u00a8\u001d\u00c0\u00d6>0\u00e1\u00c6\u000e\u001c2[\u00b4)\u00c3\u00a4\u001e\t\u00b7}\u00a9\u00fc\u00e2\u00b6\t\u00f19EPq\u00ce`\u00f4\u00a7`X\u00b3\u0085a\u00c4\u00e9\u00b4\u00a0\u008a\u0000\u001b\u00fd\u00c9\u0098e\u0084(=+ \u00a3\u00c9\u00a3\u0000\u0002\u0002\u00ec<1\u0003\u0087\u00b9)k\u0099\u00ea)\u0089\u00feLt|\u009c\u000e\u00d3\u00bb\u0018\u00a4\u0015\u001ed\u00f7(\u0006\u009b>\u00a8\u00c4:>\u00ca/\u00e7pp\u00f77\u00c4\u00f2Zz)\u0007\u00f5=\u00ac\u0099i\u001dp*{\u00bd\u0099\u00ab[\u00c0\u00b6\u00d7\u0010K\u009f4(\u00e0f<.`\u00cb\u00f9\u00a1>\u00db\u00ac}\u0085VY\u0097+\u00c9\u00d5\u0000\u0015\u00ad\u00e6\u0099\u0082I\u0090\u00f2\u0081i8\u00b0\u0002{\u00a7\u000e\u00fe\u00cd\u009f\u00bd\u0018d\u0088$\u008d\u00f8\u00cb~\u0086\u0082\u00a5M\u001bp0\u00ff\u008e|\u00b9\u00d5\u00d1\u0015\u001c\u00cf\u008c".length();
                var3_7 = 24;
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
                    var7_3[var5_4++] = bbk.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "3\u008eR\u00cct\u00b8{\u001b\u00b6G\u00f3`\n\u00e7\u00d4hUD)M\u0015w\u009fW\u00e3`\u0081\u0006.\u00ff=\u00e0\u0010\u00dc\u001ao\u00ce;#\u00f1\u00fea\u001e3\u00c5Q\u00beh\u00d3";
                    var6_6 = "3\u008eR\u00cct\u00b8{\u001b\u00b6G\u00f3`\n\u00e7\u00d4hUD)M\u0015w\u009fW\u00e3`\u0081\u0006.\u00ff=\u00e0\u0010\u00dc\u001ao\u00ce;#\u00f1\u00fea\u001e3\u00c5Q\u00beh\u00d3".length();
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
                    var7_3[var5_4++] = bbk.a(var8_9).intern();
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
        bbk.b = var7_3;
        bbk.g = new String[10];
        bbk.kmy = LogManager.getLogger();
        bbk.zcg = new gdz((String)bbk.b("n", (int)21675, (long)(769868574304951586L ^ var9)));
        bbk._oq = new gdz((String)bbk.b("n", (int)2165, (long)(732938464288637438L ^ var9)));
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7534;
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
                throw new RuntimeException("bbk", exception);
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
            bbk.g[n2] = bbk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bbk.b(n, l);
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
            throw new RuntimeException("bbk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bbk.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

