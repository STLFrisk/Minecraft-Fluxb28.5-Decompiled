/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cia
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x36EA3E5C846DL;
        return cia.b("i", (int)25259, (long)(0x238C3A32E4FC6E55L ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x38147DCBD8EBL;
        return cia.b("i", (int)29981, (long)(0xA674F052B1257AL ^ l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block187: {
            block155: {
                block159: {
                    block185: {
                        block184: {
                            block183: {
                                block182: {
                                    block176: {
                                        block188: {
                                            block166: {
                                                block162: {
                                                    block165: {
                                                        block164: {
                                                            block163: {
                                                                block161: {
                                                                    block160: {
                                                                        block158: {
                                                                            block157: {
                                                                                block156: {
                                                                                    block154: {
                                                                                        block152: {
                                                                                            block153: {
                                                                                                block150: {
                                                                                                    block151: {
                                                                                                        block148: {
                                                                                                            block146: {
                                                                                                                block147: {
                                                                                                                    var3_3 = cia.a ^ 55978516377896L;
                                                                                                                    var5_4 = t9d.b();
                                                                                                                    try {
                                                                                                                        if (var2_2.length < 9) {
                                                                                                                            throw new w57((String)cia.b("i", (int)31940, (long)(4602136334850884964L ^ var3_3)), new Object[0]);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    catch (oov v0) {
                                                                                                                        throw cia.a(v0);
                                                                                                                    }
                                                                                                                    var1_1.io9(n_k$pbp.f1s, 0);
                                                                                                                    var6_5 = cia.tiq(var1_1, var2_2, 0, false);
                                                                                                                    var7_6 = cia.tiq(var1_1, var2_2, 3, false);
                                                                                                                    var8_7 = cia.tiq(var1_1, var2_2, 6, false);
                                                                                                                    var9_8 = new yve(var6_5, var7_6);
                                                                                                                    var10_9 = new yve(var8_7, var8_7.m2c(var9_8.mtu()));
                                                                                                                    var11_10 = var9_8.num() * var9_8.v8b() * var9_8.ut6();
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v1 = var11_10;
                                                                                                                            if (var5_4 == 0) break block146;
                                                                                                                            if (v1 > 32768) {
                                                                                                                            }
                                                                                                                            break block147;
                                                                                                                        }
                                                                                                                        catch (oov v2) {
                                                                                                                            throw cia.a(v2);
                                                                                                                        }
                                                                                                                        v3 = new Object[2];
                                                                                                                        v3[0] = var11_10;
                                                                                                                        v3[1] = 32768;
                                                                                                                        throw new uvb((String)cia.b("i", (int)3042, (long)(5925143872723186253L ^ var3_3)), v3);
                                                                                                                    }
                                                                                                                    catch (oov v4) {
                                                                                                                        throw cia.a(v4);
                                                                                                                    }
                                                                                                                }
                                                                                                                v1 = 0;
                                                                                                            }
                                                                                                            var12_11 = v1;
                                                                                                            var13_12 = null;
                                                                                                            var14_13 = -1;
                                                                                                            try {
                                                                                                                block149: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v5 = var2_2.length;
                                                                                                                                        if (var5_4 == 0) break block148;
                                                                                                                                        if (v5 < 11) break block149;
                                                                                                                                    }
                                                                                                                                    catch (oov v6) {
                                                                                                                                        throw cia.a(v6);
                                                                                                                                    }
                                                                                                                                    v5 = (int)var2_2[10].equals(cia.b("i", (int)13504, (long)(3230780499139448169L ^ var3_3)));
                                                                                                                                    if (var5_4 == 0) break block150;
                                                                                                                                }
                                                                                                                                catch (oov v7) {
                                                                                                                                    throw cia.a(v7);
                                                                                                                                }
                                                                                                                                if (v5 != 0) break block151;
                                                                                                                            }
                                                                                                                            catch (oov v8) {
                                                                                                                                throw cia.a(v8);
                                                                                                                            }
                                                                                                                            v5 = (int)var2_2[10].equals(cia.b("i", (int)2128, (long)(524266778821751286L ^ var3_3)));
                                                                                                                            if (var5_4 == 0) break block150;
                                                                                                                        }
                                                                                                                        catch (oov v9) {
                                                                                                                            throw cia.a(v9);
                                                                                                                        }
                                                                                                                        if (v5 != 0) break block151;
                                                                                                                    }
                                                                                                                    catch (oov v10) {
                                                                                                                        throw cia.a(v10);
                                                                                                                    }
                                                                                                                }
                                                                                                                v5 = (int)var9_8.fsa(var10_9);
                                                                                                            }
                                                                                                            catch (oov v11) {
                                                                                                                throw cia.a(v11);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var5_4 == 0) break block150;
                                                                                                                if (v5 != 0) {
                                                                                                                }
                                                                                                                break block151;
                                                                                                            }
                                                                                                            catch (oov v12) {
                                                                                                                throw cia.a(v12);
                                                                                                            }
                                                                                                            throw new uvb((String)cia.b("i", (int)22646, (long)(5985833327008555480L ^ var3_3)), new Object[0]);
                                                                                                        }
                                                                                                        catch (oov v13) {
                                                                                                            throw cia.a(v13);
                                                                                                        }
                                                                                                    }
                                                                                                    v5 = var2_2.length;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var5_4 == 0) break block152;
                                                                                                            if (v5 < 11) break block153;
                                                                                                        }
                                                                                                        catch (oov v14) {
                                                                                                            throw cia.a(v14);
                                                                                                        }
                                                                                                        v5 = (int)var2_2[10].equals(cia.b("i", (int)2128, (long)(524266778821751286L ^ var3_3)));
                                                                                                        if (var5_4 == 0) break block152;
                                                                                                    }
                                                                                                    catch (oov v15) {
                                                                                                        throw cia.a(v15);
                                                                                                    }
                                                                                                    if (v5 == 0) break block153;
                                                                                                }
                                                                                                catch (oov v16) {
                                                                                                    throw cia.a(v16);
                                                                                                }
                                                                                                var12_11 = 1;
                                                                                            }
                                                                                            v5 = var9_8._3o;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var5_4 == 0) break block154;
                                                                                                if (v5 < 0) break block155;
                                                                                            }
                                                                                            catch (oov v17) {
                                                                                                throw cia.a(v17);
                                                                                            }
                                                                                            v5 = var9_8.ixv;
                                                                                        }
                                                                                        catch (oov v18) {
                                                                                            throw cia.a(v18);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var5_4 == 0) break block156;
                                                                                            if (v5 >= 256) break block155;
                                                                                        }
                                                                                        catch (oov v19) {
                                                                                            throw cia.a(v19);
                                                                                        }
                                                                                        v5 = var10_9._3o;
                                                                                    }
                                                                                    catch (oov v20) {
                                                                                        throw cia.a(v20);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var5_4 == 0) break block157;
                                                                                        if (v5 < 0) break block155;
                                                                                    }
                                                                                    catch (oov v21) {
                                                                                        throw cia.a(v21);
                                                                                    }
                                                                                    v5 = var10_9.ixv;
                                                                                }
                                                                                catch (oov v22) {
                                                                                    throw cia.a(v22);
                                                                                }
                                                                            }
                                                                            if (v5 >= 256) break block155;
                                                                            var15_14 = var1_1.qha();
                                                                            try {
                                                                                try {
                                                                                    v23 = var15_14.zz0(var9_8);
                                                                                    if (var5_4 == 0) break block158;
                                                                                    if (!v23) break block159;
                                                                                }
                                                                                catch (oov v24) {
                                                                                    throw cia.a(v24);
                                                                                }
                                                                                v23 = var15_14.zz0(var10_9);
                                                                            }
                                                                            catch (oov v25) {
                                                                                throw cia.a(v25);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var5_4 == 0) break block160;
                                                                            if (!v23) break block159;
                                                                        }
                                                                        catch (oov v26) {
                                                                            throw cia.a(v26);
                                                                        }
                                                                        v23 = false;
                                                                    }
                                                                    var16_15 = v23;
                                                                    try {
                                                                        try {
                                                                            v27 = var2_2.length;
                                                                            if (var5_4 == 0) break block161;
                                                                            if (v27 < 10) break block162;
                                                                        }
                                                                        catch (oov v28) {
                                                                            throw cia.a(v28);
                                                                        }
                                                                        v27 = (int)var2_2[9].equals(cia.b("i", (int)18394, (long)(7186715236860280440L ^ var3_3)));
                                                                    }
                                                                    catch (oov v29) {
                                                                        throw cia.a(v29);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var5_4 == 0) break block163;
                                                                    if (v27 != 0) {
                                                                    }
                                                                    ** GOTO lbl195
                                                                }
                                                                catch (oov v30) {
                                                                    throw cia.a(v30);
                                                                }
                                                                var16_15 = true;
                                                                try {
                                                                    if (var5_4 != 0) break block162;
lbl195:
                                                                    // 2 sources

                                                                    v27 = (int)var2_2[9].equals(cia.b("i", (int)21056, (long)(8156957092242828268L ^ var3_3)));
                                                                }
                                                                catch (oov v31) {
                                                                    throw cia.a(v31);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var5_4 == 0) break block164;
                                                                    if (v27 == 0) break block162;
                                                                }
                                                                catch (oov v32) {
                                                                    throw cia.a(v32);
                                                                }
                                                                v27 = var2_2.length;
                                                            }
                                                            catch (oov v33) {
                                                                throw cia.a(v33);
                                                            }
                                                        }
                                                        try {
                                                            if (v27 < 12) {
                                                                throw new w57((String)cia.b("i", (int)31940, (long)(4602136334850884964L ^ var3_3)), new Object[0]);
                                                            }
                                                        }
                                                        catch (oov v34) {
                                                            throw cia.a(v34);
                                                        }
                                                        var13_12 = cia.dde(var1_1, var2_2[11]);
                                                        try {
                                                            try {
                                                                v35 = var2_2.length;
                                                                if (var5_4 == 0) break block165;
                                                                if (v35 < 13) break block162;
                                                            }
                                                            catch (oov v36) {
                                                                throw cia.a(v36);
                                                            }
                                                            v35 = cia.fzm(var2_2[12], 0, 15);
                                                        }
                                                        catch (oov v37) {
                                                            throw cia.a(v37);
                                                        }
                                                    }
                                                    var14_13 = v35;
                                                }
                                                var17_16 = Lists.newArrayList();
                                                var18_17 = Lists.newArrayList();
                                                var19_18 = Lists.newArrayList();
                                                var20_19 = Lists.newLinkedList();
                                                var21_20 = new mew(var10_9.gdj - var9_8.gdj, var10_9._3o - var9_8._3o, var10_9.ob0 - var9_8.ob0);
                                                var22_21 = var9_8.ob0;
                                                block124: while (true) {
                                                    v38 = var22_21;
                                                    block125: while (v38 <= var9_8.nwc) {
                                                        v39 = var9_8._3o;
                                                        if (var5_4 == 0) break block166;
                                                        var23_24 = v39;
                                                        block126: while (true) {
                                                            v40 = var23_24;
                                                            block127: while (v40 <= var9_8.ixv) {
                                                                v38 = var9_8.gdj;
                                                                if (var5_4 == 0) continue block125;
                                                                for (var24_29 = v823484; var24_29 <= var9_8.kwp; ++var24_29) {
                                                                    block172: {
                                                                        block170: {
                                                                            block171: {
                                                                                block169: {
                                                                                    block168: {
                                                                                        var25_33 = new mew(var24_29, var23_24, var22_21);
                                                                                        var26_34 = var25_33.m2c(var21_20);
                                                                                        var27_35 = var15_14.getBlockState((mew)var25_33);
                                                                                        v40 = (int)var16_15;
                                                                                        if (var5_4 == 0) continue block127;
                                                                                        try {
                                                                                            block167: {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (v40 == 0) break block167;
                                                                                                        v41 = var27_35.r_y();
                                                                                                        if (var5_4 == 0) break block168;
                                                                                                    }
                                                                                                    catch (oov v42) {
                                                                                                        throw cia.a(v42);
                                                                                                    }
                                                                                                    if (v41 == ox_.ibw) continue;
                                                                                                }
                                                                                                catch (oov v43) {
                                                                                                    throw cia.a(v43);
                                                                                                }
                                                                                            }
                                                                                            v41 = var13_12;
                                                                                        }
                                                                                        catch (oov v44) {
                                                                                            throw cia.a(v44);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var5_4 == 0) break block169;
                                                                                            if (v41 == null) break block170;
                                                                                        }
                                                                                        catch (oov v45) {
                                                                                            throw cia.a(v45);
                                                                                        }
                                                                                        v41 = var27_35.r_y();
                                                                                    }
                                                                                    catch (oov v46) {
                                                                                        throw cia.a(v46);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (v41 != var13_12) continue;
                                                                                            v47 = var14_13;
                                                                                            if (var5_4 == 0) break block171;
                                                                                        }
                                                                                        catch (oov v48) {
                                                                                            throw cia.a(v48);
                                                                                        }
                                                                                        if (v47 < 0) break block170;
                                                                                    }
                                                                                    catch (oov v49) {
                                                                                        throw cia.a(v49);
                                                                                    }
                                                                                    v47 = var27_35.r_y().hvp((zfz)var27_35);
                                                                                }
                                                                                catch (oov v50) {
                                                                                    throw cia.a(v50);
                                                                                }
                                                                            }
                                                                            if (v47 != var14_13) continue;
                                                                        }
                                                                        if ((var28_36 = var15_14.getTileEntity((mew)var25_33)) == null) ** GOTO lbl322
                                                                        var29_37 = new bdo();
                                                                        try {
                                                                            block173: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    var28_36.m2a(var29_37);
                                                                                                    var18_17.add(new cia$trw((mew)var26_34, (zfz)var27_35, var29_37));
                                                                                                    var20_19.addLast(var25_33);
                                                                                                    if (var5_4 != 0) continue;
lbl322:
                                                                                                    // 2 sources

                                                                                                    v51 = var27_35.r_y().z4c();
                                                                                                    if (var5_4 == 0) break block172;
                                                                                                }
                                                                                                catch (oov v52) {
                                                                                                    throw cia.a(v52);
                                                                                                }
                                                                                                if (v51) break block173;
                                                                                            }
                                                                                            catch (oov v53) {
                                                                                                throw cia.a(v53);
                                                                                            }
                                                                                            v51 = var27_35.r_y().gck();
                                                                                            if (var5_4 == 0) break block172;
                                                                                        }
                                                                                        catch (oov v54) {
                                                                                            throw cia.a(v54);
                                                                                        }
                                                                                        if (v51) break block173;
                                                                                    }
                                                                                    catch (oov v55) {
                                                                                        throw cia.a(v55);
                                                                                    }
                                                                                    var19_18.add(new cia$trw((mew)var26_34, (zfz)var27_35, null));
                                                                                    var20_19.addFirst(var25_33);
                                                                                    if (var5_4 != 0) continue;
                                                                                }
                                                                                catch (oov v56) {
                                                                                    throw cia.a(v56);
                                                                                }
                                                                            }
                                                                            v51 = var17_16.add(new cia$trw((mew)var26_34, (zfz)var27_35, null));
                                                                        }
                                                                        catch (oov v57) {
                                                                            throw cia.a(v57);
                                                                        }
                                                                    }
                                                                    var20_19.addLast(var25_33);
                                                                    if (var5_4 != 0) continue;
                                                                }
                                                                ++var23_24;
                                                                if (var5_4 != 0) continue block126;
                                                            }
                                                            break;
                                                        }
                                                        ++var22_21;
                                                        if (var5_4 != 0) continue block124;
                                                    }
                                                    break;
                                                }
                                                v39 = var12_11;
                                            }
                                            if (v39 == 0) break block188;
                                            var22_22 = var20_19.iterator();
                                            while (var22_22.hasNext()) {
                                                block174: {
                                                    block175: {
                                                        var23_26 = (mew)var22_22.next();
                                                        var24_31 = var15_14.getTileEntity(var23_26);
                                                        try {
                                                            try {
                                                                try {
                                                                    v58 = var24_31 instanceof rsi;
                                                                    if (var5_4 != 0) {
                                                                        if (var5_4 == 0) break block174;
                                                                    }
                                                                    ** GOTO lbl392
                                                                }
                                                                catch (oov v59) {
                                                                    throw cia.a(v59);
                                                                }
                                                                if (!v58) break block175;
                                                            }
                                                            catch (oov v60) {
                                                                throw cia.a(v60);
                                                            }
                                                            ((rsi)var24_31).nec();
                                                        }
                                                        catch (oov v61) {
                                                            throw cia.a(v61);
                                                        }
                                                    }
                                                    var15_14.vct(var23_26, ox_.c28.l4i(), 2);
                                                }
                                                if (var5_4 != 0) continue;
                                            }
                                            var22_22 = var20_19.iterator();
                                            do {
                                                v58 = var22_22.hasNext();
lbl392:
                                                // 2 sources

                                                if (!v58) break;
                                                var23_27 = (mew)var22_22.next();
                                                var15_14.vct(var23_27, ox_.ibw.l4i(), 3);
                                            } while (var5_4 != 0);
                                        }
                                        var22_23 = Lists.newArrayList();
                                        var22_23.addAll(var17_16);
                                        var22_23.addAll(var18_17);
                                        var22_23.addAll(var19_18);
                                        var23_28 = Lists.reverse((List)var22_23);
                                        for (Iterator<E> var25_33 : var23_28) {
                                            block177: {
                                                block178: {
                                                    var26_34 = var15_14.getTileEntity(var25_33.iqu);
                                                    try {
                                                        try {
                                                            try {
                                                                v62 = var26_34 instanceof rsi;
                                                                if (var5_4 == 0) break block176;
                                                                if (var5_4 == 0) break block177;
                                                            }
                                                            catch (oov v63) {
                                                                throw cia.a(v63);
                                                            }
                                                            if (v62 == 0) break block178;
                                                        }
                                                        catch (oov v64) {
                                                            throw cia.a(v64);
                                                        }
                                                        ((rsi)var26_34).nec();
                                                    }
                                                    catch (oov v65) {
                                                        throw cia.a(v65);
                                                    }
                                                }
                                                var15_14.vct(var25_33.iqu, ox_.c28.l4i(), 2);
                                            }
                                            if (var5_4 != 0) continue;
                                        }
                                        v62 = 0;
                                    }
                                    var11_10 = v62;
                                    var24_32 = var22_23.iterator();
                                    while (var24_32.hasNext()) {
                                        block179: {
                                            var25_33 = (cia$trw)var24_32.next();
                                            try {
                                                v66 = var15_14.vct(var25_33.iqu, var25_33.l6n, 2);
                                                if (var5_4 != 0) {
                                                    if (!v66) break block179;
                                                }
                                                ** GOTO lbl450
                                            }
                                            catch (oov v67) {
                                                throw cia.a(v67);
                                            }
                                            ++var11_10;
                                        }
                                        if (var5_4 != 0) continue;
                                    }
                                    var24_32 = var18_17.iterator();
                                    do {
                                        block180: {
                                            block181: {
                                                v66 = var24_32.hasNext();
lbl450:
                                                // 2 sources

                                                if (!v66) break;
                                                var25_33 = (cia$trw)var24_32.next();
                                                var26_34 = var15_14.getTileEntity(var25_33.iqu);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var5_4 == 0) continue;
                                                                    v68 /* !! */  = var25_33.d28;
                                                                    if (var5_4 != 0) {
                                                                    }
                                                                    ** GOTO lbl-1000
                                                                }
                                                                catch (oov v69) {
                                                                    throw cia.a(v69);
                                                                }
                                                                if (v68 /* !! */  == null) break block180;
                                                            }
                                                            catch (oov v70) {
                                                                throw cia.a(v70);
                                                            }
                                                            v71 = var26_34;
                                                            if (var5_4 == 0) break block181;
                                                        }
                                                        catch (oov v72) {
                                                            throw cia.a(v72);
                                                        }
                                                        if (v71 == null) break block180;
                                                    }
                                                    catch (oov v73) {
                                                        throw cia.a(v73);
                                                    }
                                                    var25_33.d28.iin("x", var25_33.iqu.getX());
                                                    var25_33.d28.iin("y", var25_33.iqu.getY());
                                                    var25_33.d28.iin("z", var25_33.iqu.getZ());
                                                    var26_34.agl(var25_33.d28);
                                                    v71 = var26_34;
                                                }
                                                catch (oov v74) {
                                                    throw cia.a(v74);
                                                }
                                            }
                                            v71.r5t();
                                        }
                                        var15_14.vct(var25_33.iqu, var25_33.l6n, 2);
                                    } while (var5_4 != 0);
                                    for (E v68 : var23_28) lbl-1000:
                                    // 2 sources

                                    {
                                        var25_33 = (cia$trw)v68 /* !! */ ;
                                        try {
                                            v75 = var15_14;
                                            if (var5_4 != 0) {
                                                v75.cdo(var25_33.iqu, var25_33.l6n.r_y());
                                                if (var5_4 != 0) continue;
                                                break;
                                            }
                                            break block182;
                                        }
                                        catch (oov v76) {
                                            throw cia.a(v76);
                                        }
                                    }
                                    v75 = var15_14;
                                }
                                var24_32 = v75.m9p(var9_8, false);
                                try {
                                    v77 = var24_32;
                                    if (var5_4 == 0) break block183;
                                    if (v77 == null) break block184;
                                }
                                catch (oov v78) {
                                    throw cia.a(v78);
                                }
                                v77 = var24_32;
                            }
                            var25_33 = v77.iterator();
                            while (var25_33.hasNext()) {
                                block186: {
                                    var26_34 = (rty)var25_33.next();
                                    try {
                                        v79 = (int)var9_8.vwy(var26_34.weq);
                                        if (var5_4 == 0) break block185;
                                        if (v79 == 0) break block186;
                                    }
                                    catch (oov v80) {
                                        throw cia.a(v80);
                                    }
                                    var27_35 = var26_34.weq.m2c(var21_20);
                                    var15_14.jf5((mew)var27_35, var26_34.qny(), (int)(var26_34.pjb - var15_14.r7d().zex()), var26_34.afq);
                                }
                                if (var5_4 != 0) continue;
                            }
                        }
                        v79 = var11_10;
                    }
                    try {
                        if (v79 <= 0) {
                            throw new uvb((String)cia.b("i", (int)8713, (long)(7653908488494832554L ^ var3_3)), new Object[0]);
                        }
                        break block187;
                    }
                    catch (oov v81) {
                        throw cia.a(v81);
                    }
                }
                throw new uvb((String)cia.b("i", (int)29366, (long)(1238997406695721758L ^ var3_3)), new Object[0]);
            }
            throw new uvb((String)cia.b("i", (int)15446, (long)(2862948851585500655L ^ var3_3)), new Object[0]);
        }
        var1_1.io9(n_k$pbp.f1s, var11_10);
        cia.wxl(var1_1, this, (String)cia.b("i", (int)20089, (long)(8830809137555388355L ^ var3_3)), new Object[]{var11_10});
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block41: {
            block51: {
                int n;
                block50: {
                    int n2;
                    long l;
                    block48: {
                        int n3;
                        block49: {
                            block46: {
                                block47: {
                                    block44: {
                                        block45: {
                                            block42: {
                                                block43: {
                                                    block40: {
                                                        block38: {
                                                            block39: {
                                                                l = a ^ 0x1E1F01D02CD8L;
                                                                n3 = t9d.b();
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                n = stringArray.length;
                                                                                if (n3 == 0) break block38;
                                                                                if (n <= 0) break block39;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw cia.a(oov2);
                                                                            }
                                                                            n = stringArray.length;
                                                                            n2 = 3;
                                                                            if (n3 == 0) break block40;
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw cia.a(oov3);
                                                                        }
                                                                        if (n > n2) break block39;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw cia.a(oov4);
                                                                    }
                                                                    list = cia.aqt(stringArray, 0, mew2);
                                                                    break block41;
                                                                }
                                                                catch (oov oov5) {
                                                                    throw cia.a(oov5);
                                                                }
                                                            }
                                                            n = stringArray.length;
                                                        }
                                                        n2 = 3;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n3 == 0) break block42;
                                                                    if (n <= n2) break block43;
                                                                }
                                                                catch (oov oov6) {
                                                                    throw cia.a(oov6);
                                                                }
                                                                n = stringArray.length;
                                                                n2 = 6;
                                                                if (n3 == 0) break block42;
                                                            }
                                                            catch (oov oov7) {
                                                                throw cia.a(oov7);
                                                            }
                                                            if (n > n2) break block43;
                                                        }
                                                        catch (oov oov8) {
                                                            throw cia.a(oov8);
                                                        }
                                                        list = cia.aqt(stringArray, 3, mew2);
                                                        break block41;
                                                    }
                                                    catch (oov oov9) {
                                                        throw cia.a(oov9);
                                                    }
                                                }
                                                n = stringArray.length;
                                                n2 = 6;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n3 == 0) break block44;
                                                            if (n <= n2) break block45;
                                                        }
                                                        catch (oov oov10) {
                                                            throw cia.a(oov10);
                                                        }
                                                        n = stringArray.length;
                                                        n2 = 9;
                                                        if (n3 == 0) break block44;
                                                    }
                                                    catch (oov oov11) {
                                                        throw cia.a(oov11);
                                                    }
                                                    if (n > n2) break block45;
                                                }
                                                catch (oov oov12) {
                                                    throw cia.a(oov12);
                                                }
                                                list = cia.aqt(stringArray, 6, mew2);
                                                break block41;
                                            }
                                            catch (oov oov13) {
                                                throw cia.a(oov13);
                                            }
                                        }
                                        n = stringArray.length;
                                        n2 = 10;
                                    }
                                    try {
                                        try {
                                            if (n3 == 0) break block46;
                                            if (n != n2) break block47;
                                        }
                                        catch (oov oov14) {
                                            throw cia.a(oov14);
                                        }
                                        String[] stringArray2 = new String[3];
                                        stringArray2[0] = cia.b("i", (int)13498, (long)(0x2167736FA22E90EDL ^ l));
                                        stringArray2[1] = cia.b("i", (int)1063, (long)(0x28C66416497D207DL ^ l));
                                        stringArray2[2] = cia.b("i", (int)6998, (long)(0x4295279638E53F03L ^ l));
                                        list = cia.cqo(stringArray, stringArray2);
                                        break block41;
                                    }
                                    catch (oov oov15) {
                                        throw cia.a(oov15);
                                    }
                                }
                                n = stringArray.length;
                                n2 = 11;
                            }
                            try {
                                try {
                                    if (n3 == 0) break block48;
                                    if (n != n2) break block49;
                                }
                                catch (oov oov16) {
                                    throw cia.a(oov16);
                                }
                                String[] stringArray3 = new String[3];
                                stringArray3[0] = cia.b("i", (int)30752, (long)(0xB4207E274C6DC7BL ^ l));
                                stringArray3[1] = cia.b("i", (int)4144, (long)(0x627340FFE09CB461L ^ l));
                                stringArray3[2] = cia.b("i", (int)26179, (long)(0x3CF826F0407CC21EL ^ l));
                                list = cia.cqo(stringArray, stringArray3);
                                break block41;
                            }
                            catch (oov oov17) {
                                throw cia.a(oov17);
                            }
                        }
                        try {
                            n = stringArray.length;
                            if (n3 == 0) break block50;
                            n2 = 12;
                        }
                        catch (oov oov18) {
                            throw cia.a(oov18);
                        }
                    }
                    try {
                        if (n != n2) break block51;
                        n = ((String)((Object)cia.b("i", (int)21056, (long)(0x713379B48979F61CL ^ l)))).equals(stringArray[9]) ? 1 : 0;
                    }
                    catch (oov oov19) {
                        throw cia.a(oov19);
                    }
                }
                try {
                    if (n == 0) break block51;
                    list = cia.d79(stringArray, e0x.db8.kqi());
                    break block41;
                }
                catch (oov oov20) {
                    throw cia.a(oov20);
                }
            }
            list = null;
        }
        return list;
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

                cia.a = c.a(4798527723890993953L, -1241547208770451524L, MethodHandles.lookup().lookupClass()).a(60637152074143L);
                cia.h = new HashMap<K, V>(13);
                var0 = cia.a ^ 65628633633389L;
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
                var9_3 = new String[19];
                var7_4 = 0;
                var6_5 = "\u00d8\u007f\u00e4\u00a3\u00d5b\u00fb`p#\u007f\u001b\u00ea\u00ed\u00aa\u00eb\u0010\u00cd0\u001d.\u00a7Y\u001e\u00c6wW\n\u00f7\u00c0\u00ab\u00feF\u0010\u00ea(\u000eYs\u00c5\u00d7Xb\u008f\u00b1,7\u00b0\u0098\u00de8\u007f:\u0098\u00f4:,\u00ad4\u00f6\u00f1\u001e\u00bf\u008a\u00ee\u0019\u00e7\u00e0\u001a\u009a/u\u00a8\u00caEE!j&=s]I%\u0018#\u00d7\u00a1\u00b8\u0085\u001a@c]\u00db?@k#\u008b\u00a1\u00c7\u00fc\u00f6f\u00fbs0$\u00eftZIi\u001b\u00a4\u0005O\u00f2\u00b4\u00fe\u0084u\u00e8\u00b4\u0095\u00ca\u00bb\u00ff\u00bf\u00dc\u00eb\u0013\u00cf\u00cca]\u0004B/\bH\u00df\u00da\b\u00ec\u00a8z\u00fb3\u001e\u00f8\u0085\u0082\u0005\u00e08m\u00ae\u00f2\u00a2\u001b\b\u00bc\u00dc\u0004\u009e/\u00c5a\u00b17<\u00e1e\u0018a\u00fd5\u008f\u0003#\u0090\u0081\u008c\u00c7\"6\u0016;\u00f0\u00cd\u00bb~\u00da\"g\u001a\u00b7f\u0087\u00194\"'n\u00e7I\u000ejJS\u00a7\u0010\u00fc\u009fF\u00ed\u0013\u00f8\u00de\r\u00ef\u00cf\u00c4\u0089\u008e\u0006\u00cea \u00c3\u00da\u00fe6+a\u00dd/\u00c3\u00a3\u001e\u00b8\u00b3\u0091m\u00de)\u00c8\u0096\u00be\u007f\u00c2\u00b1f\u00b6D\u009cx\u00b8q\u00d0,(y\u00a7\u0083\u00ef\u00f4\u00aeow\u0014\u00cb|d\u00d6\u0088l\u00bd\u00c4\u00c0\u00ec\u0000+\u00aa\u0000.\u00b5S;\u00c4\u00c8\u00a4\u00e4\u00bb\u0004\u00e0\u0002\u00f0\u001e\u000f^\u00bc\u0010\u00f7\u007fCw\u00cf\u00ed>2\u00b0\u0007\u00a89\u0016\u00d2q\u00cc\u0010\u00e1\\\u0088=\u00a8\u00d5_0\u0085\u007f\u008e\u00fe&A\u00fa\u00c1(\u00b7\u0017h\u001b\u00f4\u0081\u00fd/\u00b6Bo\u008e\u00e4\u00ba\u008b\u00eee\u00b6\u0005\u00c2D\u0003*\u00a0\b<+\u00d0+\u00dd\u00d8\u00ea\u00b1\u0018\u0080\u000bt\u00ac\u00e1\u00a9\u0010O%%w\f`\u0086\u00c0\u001f\u00e5\u00d9\nX\b\u007f\u00da\u0010\u00a8\u00ddF\u000f*\u008a\u009c|\u00b8\u00d9\u0004v=0.\u00bb\u0018\u0004\u008fTa\u00a9'\u00aa5A\u00a0\u00f3\u009b\u00a7r\u0012\u00f2\u0001Ua>\u00b8\u00feb\u00150\u00d3\u00df}\u00b7\u00ab\u00f6J\u008c=\\\u00ce\u00f3\u009c+\u001eh\u00b7\u00b28\u00f2\u0006a\b2f\u009d\u00b7\u00b4F\u00c1\u009c\u0012\u00daS\u00ec\u0090z\u00a0V~\u0005_\u0098\u0092\u0005\u00cdW\u000e\u0010]j4(\u0084\u0088\u00b9\u00e6\u0003\u0012\u00dc\u00ad\u0006\u00f4\u001c\u00cd";
                var8_6 = "\u00d8\u007f\u00e4\u00a3\u00d5b\u00fb`p#\u007f\u001b\u00ea\u00ed\u00aa\u00eb\u0010\u00cd0\u001d.\u00a7Y\u001e\u00c6wW\n\u00f7\u00c0\u00ab\u00feF\u0010\u00ea(\u000eYs\u00c5\u00d7Xb\u008f\u00b1,7\u00b0\u0098\u00de8\u007f:\u0098\u00f4:,\u00ad4\u00f6\u00f1\u001e\u00bf\u008a\u00ee\u0019\u00e7\u00e0\u001a\u009a/u\u00a8\u00caEE!j&=s]I%\u0018#\u00d7\u00a1\u00b8\u0085\u001a@c]\u00db?@k#\u008b\u00a1\u00c7\u00fc\u00f6f\u00fbs0$\u00eftZIi\u001b\u00a4\u0005O\u00f2\u00b4\u00fe\u0084u\u00e8\u00b4\u0095\u00ca\u00bb\u00ff\u00bf\u00dc\u00eb\u0013\u00cf\u00cca]\u0004B/\bH\u00df\u00da\b\u00ec\u00a8z\u00fb3\u001e\u00f8\u0085\u0082\u0005\u00e08m\u00ae\u00f2\u00a2\u001b\b\u00bc\u00dc\u0004\u009e/\u00c5a\u00b17<\u00e1e\u0018a\u00fd5\u008f\u0003#\u0090\u0081\u008c\u00c7\"6\u0016;\u00f0\u00cd\u00bb~\u00da\"g\u001a\u00b7f\u0087\u00194\"'n\u00e7I\u000ejJS\u00a7\u0010\u00fc\u009fF\u00ed\u0013\u00f8\u00de\r\u00ef\u00cf\u00c4\u0089\u008e\u0006\u00cea \u00c3\u00da\u00fe6+a\u00dd/\u00c3\u00a3\u001e\u00b8\u00b3\u0091m\u00de)\u00c8\u0096\u00be\u007f\u00c2\u00b1f\u00b6D\u009cx\u00b8q\u00d0,(y\u00a7\u0083\u00ef\u00f4\u00aeow\u0014\u00cb|d\u00d6\u0088l\u00bd\u00c4\u00c0\u00ec\u0000+\u00aa\u0000.\u00b5S;\u00c4\u00c8\u00a4\u00e4\u00bb\u0004\u00e0\u0002\u00f0\u001e\u000f^\u00bc\u0010\u00f7\u007fCw\u00cf\u00ed>2\u00b0\u0007\u00a89\u0016\u00d2q\u00cc\u0010\u00e1\\\u0088=\u00a8\u00d5_0\u0085\u007f\u008e\u00fe&A\u00fa\u00c1(\u00b7\u0017h\u001b\u00f4\u0081\u00fd/\u00b6Bo\u008e\u00e4\u00ba\u008b\u00eee\u00b6\u0005\u00c2D\u0003*\u00a0\b<+\u00d0+\u00dd\u00d8\u00ea\u00b1\u0018\u0080\u000bt\u00ac\u00e1\u00a9\u0010O%%w\f`\u0086\u00c0\u001f\u00e5\u00d9\nX\b\u007f\u00da\u0010\u00a8\u00ddF\u000f*\u008a\u009c|\u00b8\u00d9\u0004v=0.\u00bb\u0018\u0004\u008fTa\u00a9'\u00aa5A\u00a0\u00f3\u009b\u00a7r\u0012\u00f2\u0001Ua>\u00b8\u00feb\u00150\u00d3\u00df}\u00b7\u00ab\u00f6J\u008c=\\\u00ce\u00f3\u009c+\u001eh\u00b7\u00b28\u00f2\u0006a\b2f\u009d\u00b7\u00b4F\u00c1\u009c\u0012\u00daS\u00ec\u0090z\u00a0V~\u0005_\u0098\u0092\u0005\u00cdW\u000e\u0010]j4(\u0084\u0088\u00b9\u00e6\u0003\u0012\u00dc\u00ad\u0006\u00f4\u001c\u00cd".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = cia.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0093\u00a4w\u00a1\u00b4\u00a2\u0017+\u00e2\u00a8\u00c6\u00dd\u00d0+*\u00a2\b}\u000e\u00a66\u00a094\u0090\u00b3\f=\u00ccIF\u00d5_G\u00cd<\u0017,\u00e1\u00cb8\u00b3\u00bd\u00c4x\u00bb\u00c8\u00a6@#h\u00e1\u00f8\u0001\u00fdl\bDGo\"\u00d1'+\u009b\u00d8\u0014\u00dc[\u001e6\f\u00a5H\u00ae\u0089\u00c6\u00e0\u0019 -\u00e1\b\u001f\u00a88x\u009c\u00d3\u0096\u001a_v!\u00c6\u00e9\u00c2";
                    var8_6 = "\u0093\u00a4w\u00a1\u00b4\u00a2\u0017+\u00e2\u00a8\u00c6\u00dd\u00d0+*\u00a2\b}\u000e\u00a66\u00a094\u0090\u00b3\f=\u00ccIF\u00d5_G\u00cd<\u0017,\u00e1\u00cb8\u00b3\u00bd\u00c4x\u00bb\u00c8\u00a6@#h\u00e1\u00f8\u0001\u00fdl\bDGo\"\u00d1'+\u009b\u00d8\u0014\u00dc[\u001e6\f\u00a5H\u00ae\u0089\u00c6\u00e0\u0019 -\u00e1\b\u001f\u00a88x\u009c\u00d3\u0096\u001a_v!\u00c6\u00e9\u00c2".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = cia.b(var10_9).intern();
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
        cia.c = var9_3;
        cia.g = new String[19];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55F5;
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
                throw new RuntimeException("cia", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            cia.g[n2] = cia.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cia.b(n, l);
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
            throw new RuntimeException("cia" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cia.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

