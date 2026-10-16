/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f58
extends wdh {
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public f58() {
        this.oml(true);
    }

    public static ucr mam(int n, t9d t9d2) {
        ucr ucr2;
        block2: {
            ucr ucr3;
            block3: {
                long l = a ^ 0x4649A69E252DL;
                String string = (String)((Object)f58.b("j", (int)2082, (long)(0x41125B8012502BD6L ^ l))) + n;
                ucr3 = (ucr)t9d2.hyf(ucr.class, string);
                int n2 = t9d.c();
                try {
                    ucr2 = ucr3;
                    if (n2 != 0) break block2;
                    if (ucr2 != null) break block3;
                }
                catch (oov oov2) {
                    throw f58.a(oov2);
                }
                ucr3 = new ucr(string);
                t9d2.m5k(string, ucr3);
            }
            ucr2 = ucr3;
        }
        return ucr2;
    }

    public ucr h9y(erg erg2, t9d t9d2) {
        ucr ucr2;
        block6: {
            ucr ucr3;
            block7: {
                t9d t9d3;
                String string;
                block8: {
                    long l = a ^ 0x115D8EE2FF9L;
                    string = (String)((Object)f58.b("j", (int)15841, (long)(0x3E316BBCFAE114C4L ^ l))) + erg2.j6_();
                    ucr3 = (ucr)t9d2.hyf(ucr.class, string);
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                ucr2 = ucr3;
                                if (n != 0) break block6;
                                if (ucr2 != null) break block7;
                            }
                            catch (oov oov2) {
                                throw f58.a(oov2);
                            }
                            t9d3 = t9d2;
                            if (n != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw f58.a(oov3);
                        }
                        if (t9d3.v0f) break block7;
                    }
                    catch (oov oov4) {
                        throw f58.a(oov4);
                    }
                    erg2.awe(t9d2.xbc((String)((Object)f58.b("j", (int)12868, (long)(0x454323552D781B60L ^ l)))));
                    string = (String)((Object)f58.b("j", (int)15841, (long)(0x3E316BBCFAE114C4L ^ l))) + erg2.j6_();
                    ucr3 = new ucr(string);
                    ucr3.rqi = (byte)3;
                    ucr3.snl(t9d2.r7d().c21(), t9d2.r7d().ans(), ucr3.rqi);
                    ucr3.d_r = (byte)t9d2.vzz.gs_();
                    ucr3.hcs();
                    t9d3 = t9d2;
                }
                t9d3.m5k(string, ucr3);
            }
            ucr2 = ucr3;
        }
        return ucr2;
    }

    public void pzt(t9d t9d2, i2h i2h2, ucr ucr2) {
        block98: {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            block101: {
                int n8;
                block100: {
                    int n9;
                    block99: {
                        block97: {
                            n7 = t9d.c();
                            try {
                                try {
                                    n9 = t9d2.vzz.gs_();
                                    if (n7 != 0) break block97;
                                    if (n9 != ucr2.d_r) break block98;
                                }
                                catch (oov oov2) {
                                    throw f58.a(oov2);
                                }
                                n9 = i2h2 instanceof ha9;
                            }
                            catch (oov oov3) {
                                throw f58.a(oov3);
                            }
                        }
                        try {
                            try {
                                if (n7 != 0) break block99;
                                if (n9 == 0) break block98;
                            }
                            catch (oov oov4) {
                                throw f58.a(oov4);
                            }
                            n9 = 1 << ucr2.rqi;
                        }
                        catch (oov oov5) {
                            throw f58.a(oov5);
                        }
                    }
                    n6 = n9;
                    n5 = ucr2.ukq;
                    n4 = ucr2.od8;
                    n3 = fe6.jqf(i2h2.o2v - (double)n5) / n6 + 64;
                    n2 = fe6.jqf(i2h2.vbd - (double)n4) / n6 + 64;
                    n = 128 / n6;
                    try {
                        try {
                            n8 = t9d2.vzz.qyc();
                            if (n7 != 0) break block100;
                            if (n8 == 0) break block101;
                        }
                        catch (oov oov6) {
                            throw f58.a(oov6);
                        }
                        n8 = n / 2;
                    }
                    catch (oov oov7) {
                        throw f58.a(oov7);
                    }
                }
                n = n8;
            }
            ucr$qah ucr$qah = ucr2._5y((ha9)i2h2);
            ++ucr$qah.x5y;
            int n10 = 0;
            int n11 = n3 - n + 1;
            block86: while (true) {
                int n12 = n11;
                block87: while (n12 < n3 + n) {
                    block104: {
                        int n13;
                        block102: {
                            block103: {
                                try {
                                    try {
                                        try {
                                            n13 = n11 & 0xF;
                                            if (n7 != 0) break block102;
                                            if (n13 == (ucr$qah.x5y & 0xF)) break block103;
                                        }
                                        catch (oov oov8) {
                                            throw f58.a(oov8);
                                        }
                                        n13 = n10;
                                        if (n7 != 0) break block102;
                                    }
                                    catch (oov oov9) {
                                        throw f58.a(oov9);
                                    }
                                    if (n13 == 0) break block104;
                                }
                                catch (oov oov10) {
                                    throw f58.a(oov10);
                                }
                            }
                            n13 = 0;
                        }
                        n10 = n13;
                        double d = 0.0;
                        int n14 = n2 - n - 1;
                        while (n14 < n2 + n) {
                            block112: {
                                block106: {
                                    int n15;
                                    _mi _mi2;
                                    int n16;
                                    int n17;
                                    block129: {
                                        block128: {
                                            int n18;
                                            int n19;
                                            int n20;
                                            int n21;
                                            block127: {
                                                block123: {
                                                    double d2;
                                                    block124: {
                                                        block125: {
                                                            double d3;
                                                            double d4;
                                                            block126: {
                                                                int n22;
                                                                HashMultiset hashMultiset;
                                                                block122: {
                                                                    double d5;
                                                                    block121: {
                                                                        block119: {
                                                                            double d6;
                                                                            block120: {
                                                                                int n23;
                                                                                block117: {
                                                                                    block131: {
                                                                                        int n24;
                                                                                        int n25;
                                                                                        tts tts2;
                                                                                        block114: {
                                                                                            block115: {
                                                                                                int n26;
                                                                                                block113: {
                                                                                                    int n27;
                                                                                                    block110: {
                                                                                                        block111: {
                                                                                                            int n28;
                                                                                                            int n29;
                                                                                                            block109: {
                                                                                                                block108: {
                                                                                                                    block107: {
                                                                                                                        block105: {
                                                                                                                            n12 = n11;
                                                                                                                            if (n7 != 0) continue block87;
                                                                                                                            try {
                                                                                                                                if (n7 != 0) break block105;
                                                                                                                                if (n12 < 0) break block106;
                                                                                                                            }
                                                                                                                            catch (oov oov11) {
                                                                                                                                throw f58.a(oov11);
                                                                                                                            }
                                                                                                                            n29 = n14;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                n28 = -1;
                                                                                                                                if (n7 != 0) break block107;
                                                                                                                                if (n29 < n28) break block106;
                                                                                                                            }
                                                                                                                            catch (oov oov12) {
                                                                                                                                throw f58.a(oov12);
                                                                                                                            }
                                                                                                                            int n28 = n11;
                                                                                                                            n28 = 128;
                                                                                                                        }
                                                                                                                        catch (oov oov13) {
                                                                                                                            throw f58.a(oov13);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (n7 != 0) break block108;
                                                                                                                            if (n29 >= n28) break block106;
                                                                                                                        }
                                                                                                                        catch (oov oov14) {
                                                                                                                            throw f58.a(oov14);
                                                                                                                        }
                                                                                                                        int n28 = n14;
                                                                                                                        n28 = 128;
                                                                                                                    }
                                                                                                                    catch (oov oov15) {
                                                                                                                        throw f58.a(oov15);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (n7 != 0) break block109;
                                                                                                                        if (n29 >= n28) break block106;
                                                                                                                    }
                                                                                                                    catch (oov oov16) {
                                                                                                                        throw f58.a(oov16);
                                                                                                                    }
                                                                                                                    int n28 = n11;
                                                                                                                    n28 = n3;
                                                                                                                }
                                                                                                                catch (oov oov17) {
                                                                                                                    throw f58.a(oov17);
                                                                                                                }
                                                                                                            }
                                                                                                            n21 = n29 - n28;
                                                                                                            n20 = n14 - n2;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    n27 = n21 * n21 + n20 * n20;
                                                                                                                    if (n7 != 0) break block110;
                                                                                                                    if (n27 <= (n - 2) * (n - 2)) break block111;
                                                                                                                }
                                                                                                                catch (oov oov18) {
                                                                                                                    throw f58.a(oov18);
                                                                                                                }
                                                                                                                n27 = 1;
                                                                                                                break block110;
                                                                                                            }
                                                                                                            catch (oov oov19) {
                                                                                                                throw f58.a(oov19);
                                                                                                            }
                                                                                                        }
                                                                                                        n27 = 0;
                                                                                                    }
                                                                                                    n19 = n27;
                                                                                                    int n30 = (n5 / n6 + n11 - 64) * n6;
                                                                                                    int n31 = (n4 / n6 + n14 - 64) * n6;
                                                                                                    hashMultiset = HashMultiset.create();
                                                                                                    tts2 = t9d2.pxs(new mew(n30, 0, n31));
                                                                                                    try {
                                                                                                        if (n7 != 0) break block112;
                                                                                                        if (tts2.col()) break block106;
                                                                                                    }
                                                                                                    catch (oov oov20) {
                                                                                                        throw f58.a(oov20);
                                                                                                    }
                                                                                                    n25 = n30 & 0xF;
                                                                                                    n24 = n31 & 0xF;
                                                                                                    n22 = 0;
                                                                                                    d2 = 0.0;
                                                                                                    try {
                                                                                                        try {
                                                                                                            n26 = t9d2.vzz.qyc();
                                                                                                            if (n7 != 0) break block113;
                                                                                                            if (n26 == 0) break block114;
                                                                                                        }
                                                                                                        catch (oov oov21) {
                                                                                                            throw f58.a(oov21);
                                                                                                        }
                                                                                                        n26 = n30 + n31 * 231871;
                                                                                                    }
                                                                                                    catch (oov oov22) {
                                                                                                        throw f58.a(oov22);
                                                                                                    }
                                                                                                }
                                                                                                int n32 = n26;
                                                                                                n32 = n32 * n32 * 31287121 + n32 * 11;
                                                                                                try {
                                                                                                    int n30;
                                                                                                    block116: {
                                                                                                        try {
                                                                                                            try {
                                                                                                                n30 = n32 >> 20 & 1;
                                                                                                                if (n7 != 0) break block115;
                                                                                                                if (n30 != 0) break block116;
                                                                                                            }
                                                                                                            catch (oov oov23) {
                                                                                                                throw f58.a(oov23);
                                                                                                            }
                                                                                                            hashMultiset.add((Object)ox_.kqk.uoz(ox_.kqk.l4i().zvi(bx0.nln, (Comparable)((Object)bx0$b_z.rg3))), 10);
                                                                                                            if (n7 == 0) break block115;
                                                                                                        }
                                                                                                        catch (oov oov24) {
                                                                                                            throw f58.a(oov24);
                                                                                                        }
                                                                                                    }
                                                                                                    n30 = hashMultiset.add((Object)ox_.pu8.uoz(ox_.pu8.l4i().zvi(jcc.m9s, (Comparable)((Object)jcc$whg.aow))), 100);
                                                                                                }
                                                                                                catch (oov oov25) {
                                                                                                    throw f58.a(oov25);
                                                                                                }
                                                                                            }
                                                                                            d2 = 100.0;
                                                                                            if (n7 == 0) break block131;
                                                                                        }
                                                                                        mew$mix mew$mix = new mew$mix();
                                                                                        int n34 = 0;
                                                                                        block89: while (true) {
                                                                                            int n32 = n34;
                                                                                            n32 = n6;
                                                                                            block90: while (n31 < n32) {
                                                                                                n23 = 0;
                                                                                                if (n7 != 0) break block117;
                                                                                                block91: for (n17 = v1448468; n17 < n6; ++n17) {
                                                                                                    int n33;
                                                                                                    zfz zfz2;
                                                                                                    int n38;
                                                                                                    block118: {
                                                                                                        n38 = tts2.d0r(n34 + n25, n17 + n24) + 1;
                                                                                                        zfz2 = ox_.ibw.l4i();
                                                                                                        try {
                                                                                                            n33 = n38;
                                                                                                            if (n7 != 0) continue;
                                                                                                            n32 = 1;
                                                                                                            if (n7 != 0) continue block90;
                                                                                                        }
                                                                                                        catch (oov oov26) {
                                                                                                            throw f58.a(oov26);
                                                                                                        }
                                                                                                        if (n33 > n32) {
                                                                                                            while ((zfz2 = tts2.dk4(mew$mix.bj0(n34 + n25, --n38, n17 + n24))).r_y().uoz(zfz2) == _mi._b5 && n38 > 0) {
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        n33 = n38;
                                                                                                                        if (n7 != 0) continue;
                                                                                                                        if (n33 <= 0) break block118;
                                                                                                                    }
                                                                                                                    catch (oov oov27) {
                                                                                                                        throw f58.a(oov27);
                                                                                                                    }
                                                                                                                    n33 = zfz2.r_y().p1r().l7j() ? 1 : 0;
                                                                                                                    if (n7 != 0) continue;
                                                                                                                }
                                                                                                                catch (oov oov28) {
                                                                                                                    throw f58.a(oov28);
                                                                                                                }
                                                                                                                if (n33 == 0) break block118;
                                                                                                            }
                                                                                                            catch (oov oov29) {
                                                                                                                throw f58.a(oov29);
                                                                                                            }
                                                                                                            n16 = n38 - 1;
                                                                                                            do {
                                                                                                                e0x e0x2 = tts2.ygo(n34 + n25, n16--, n17 + n24);
                                                                                                                ++n22;
                                                                                                                if (n16 <= 0) break;
                                                                                                                try {
                                                                                                                    n33 = e0x2.p1r().l7j() ? 1 : 0;
                                                                                                                    if (n7 != 0) continue block91;
                                                                                                                    if (n33 != 0) continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                                catch (oov oov30) {
                                                                                                                    throw f58.a(oov30);
                                                                                                                }
                                                                                                            } while (n7 == 0);
                                                                                                        }
                                                                                                    }
                                                                                                    d2 += (double)n38 / (double)(n6 * n6);
                                                                                                    n33 = hashMultiset.add((Object)zfz2.r_y().uoz(zfz2)) ? 1 : 0;
                                                                                                    if (n7 == 0) continue;
                                                                                                }
                                                                                                ++n34;
                                                                                                if (n7 == 0) continue block89;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    n23 = n22 / (n6 * n6);
                                                                                }
                                                                                n22 = n23;
                                                                                d4 = (d2 - d) * 4.0 / (double)(n6 + 4) + ((double)(n11 + n14 & 1) - 0.5) * 0.4;
                                                                                n17 = 1;
                                                                                try {
                                                                                    double d5 = d4 - 0.6;
                                                                                    d5 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                                                                    if (n7 != 0) break block119;
                                                                                    if (d5 <= 0) break block120;
                                                                                }
                                                                                catch (oov oov31) {
                                                                                    throw f58.a(oov31);
                                                                                }
                                                                                n17 = 2;
                                                                            }
                                                                            d5 = (d6 = d4 - -0.6) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                                                        }
                                                                        try {
                                                                            if (n7 != 0) break block121;
                                                                            if (d5 >= 0) break block122;
                                                                        }
                                                                        catch (oov oov32) {
                                                                            throw f58.a(oov32);
                                                                        }
                                                                        d5 = 0.0;
                                                                    }
                                                                    n17 = (int)d5;
                                                                }
                                                                _mi2 = (_mi)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), (Object)_mi._b5);
                                                                try {
                                                                    if (n7 != 0) break block123;
                                                                    if (_mi2 != _mi.hvl) break block124;
                                                                }
                                                                catch (oov oov33) {
                                                                    throw f58.a(oov33);
                                                                }
                                                                d4 = (double)n22 * 0.1 + (double)(n11 + n14 & 1) * 0.2;
                                                                n17 = 1;
                                                                try {
                                                                    double d8 = d4 - 0.5;
                                                                    n18 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                                                    if (n7 != 0) break block125;
                                                                    if (n18 >= 0) break block126;
                                                                }
                                                                catch (oov oov34) {
                                                                    throw f58.a(oov34);
                                                                }
                                                                n17 = 2;
                                                            }
                                                            n18 = (d3 = d4 - 0.9) == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                                        }
                                                        try {
                                                            if (n7 != 0) break block127;
                                                            if (n18 <= 0) break block124;
                                                        }
                                                        catch (oov oov35) {
                                                            throw f58.a(oov35);
                                                        }
                                                        n17 = 0;
                                                    }
                                                    d = d2;
                                                }
                                                try {
                                                    if (n7 != 0) break block112;
                                                    n18 = n14;
                                                }
                                                catch (oov oov36) {
                                                    throw f58.a(oov36);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (n18 < 0) break block106;
                                                        n15 = n21 * n21 + n20 * n20;
                                                        if (n7 != 0) break block128;
                                                    }
                                                    catch (oov oov37) {
                                                        throw f58.a(oov37);
                                                    }
                                                    if (n15 >= n * n) break block106;
                                                }
                                                catch (oov oov38) {
                                                    throw f58.a(oov38);
                                                }
                                                n15 = n19;
                                            }
                                            catch (oov oov39) {
                                                throw f58.a(oov39);
                                            }
                                        }
                                        try {
                                            block130: {
                                                try {
                                                    try {
                                                        try {
                                                            if (n7 != 0) break block129;
                                                            if (n15 == 0) break block130;
                                                        }
                                                        catch (oov oov40) {
                                                            throw f58.a(oov40);
                                                        }
                                                        n15 = n11 + n14 & 1;
                                                        if (n7 != 0) break block129;
                                                    }
                                                    catch (oov oov41) {
                                                        throw f58.a(oov41);
                                                    }
                                                    if (n15 == 0) break block106;
                                                }
                                                catch (oov oov42) {
                                                    throw f58.a(oov42);
                                                }
                                            }
                                            n15 = ucr2.quz[n11 + n14 * 128];
                                        }
                                        catch (oov oov43) {
                                            throw f58.a(oov43);
                                        }
                                    }
                                    int n39 = n15;
                                    n16 = (byte)(_mi2.bav * 4 + n17);
                                    try {
                                        if (n7 != 0) break block112;
                                        if (n39 == n16) break block106;
                                    }
                                    catch (oov oov44) {
                                        throw f58.a(oov44);
                                    }
                                    ucr2.quz[n11 + n14 * 128] = n16;
                                    ucr2.zeq(n11, n14);
                                    n10 = 1;
                                }
                                ++n14;
                            }
                            if (n7 == 0) continue;
                        }
                    }
                    ++n11;
                    if (n7 == 0) continue block86;
                }
                break;
            }
        }
    }

    @Override
    public void u9o(erg erg2, t9d t9d2, i2h i2h2, int n, boolean bl) {
        int n2 = t9d.c();
        if (!t9d2.v0f) {
            boolean bl2;
            ucr ucr2;
            block6: {
                block7: {
                    ucr2 = this.h9y(erg2, t9d2);
                    try {
                        bl2 = i2h2 instanceof ha9;
                        if (n2 != 0) break block6;
                        if (!bl2) break block7;
                    }
                    catch (oov oov2) {
                        throw f58.a(oov2);
                    }
                    ha9 ha92 = (ha9)i2h2;
                    ucr2.obe(ha92, erg2);
                }
                bl2 = bl;
            }
            try {
                if (bl2) {
                    this.pzt(t9d2, i2h2, ucr2);
                }
            }
            catch (oov oov3) {
                throw f58.a(oov3);
            }
        }
    }

    @Override
    public mz2 bdn(erg erg2, t9d t9d2, ha9 ha92) {
        return this.h9y(erg2, t9d2).j0m(erg2, t9d2, ha92);
    }

    @Override
    public void zs1(erg erg2, t9d t9d2, ha9 ha92) {
        block10: {
            boolean bl;
            int n;
            long l;
            block9: {
                l = a ^ 0x349CC310807EL;
                n = t9d.b();
                try {
                    try {
                        bl = erg2.w8b();
                        if (n == 0) break block9;
                        if (!bl) break block10;
                    }
                    catch (oov oov2) {
                        throw f58.a(oov2);
                    }
                    bl = erg2.zso().dvl((String)((Object)f58.b("j", (int)27059, (long)(0x378B244780596F16L ^ l))));
                }
                catch (oov oov3) {
                    throw f58.a(oov3);
                }
            }
            if (bl) {
                ucr ucr2;
                ucr ucr3;
                block11: {
                    ucr ucr4;
                    block12: {
                        ucr4 = xbr.kdv.h9y(erg2, t9d2);
                        erg2.awe(t9d2.xbc((String)((Object)f58.b("j", (int)6078, (long)(0x12A483CF63F8911FL ^ l)))));
                        ucr3 = new ucr((String)((Object)f58.b("j", (int)15841, (long)(0x3E315E35E11FBB43L ^ l))) + erg2.j6_());
                        try {
                            try {
                                ucr3.rqi = (byte)(ucr4.rqi + 1);
                                ucr2 = ucr3;
                                if (n == 0) break block11;
                                if (ucr2.rqi <= 4) break block12;
                            }
                            catch (oov oov4) {
                                throw f58.a(oov4);
                            }
                            ucr3.rqi = (byte)4;
                        }
                        catch (oov oov5) {
                            throw f58.a(oov5);
                        }
                    }
                    ucr3.snl(ucr4.ukq, ucr4.od8, ucr3.rqi);
                    ucr3.d_r = ucr4.d_r;
                    ucr2 = ucr3;
                }
                ucr2.hcs();
                t9d2.m5k((String)((Object)f58.b("j", (int)15841, (long)(0x3E315E35E11FBB43L ^ l))) + erg2.j6_(), ucr3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void wra(erg erg2, ha9 ha92, List list, boolean bl) {
        long l = a ^ 0x652AD1DBC544L;
        int n = t9d.c();
        ucr ucr2 = this.h9y(erg2, ha92.oay);
        try {
            block6: {
                try {
                    try {
                        if (!bl) return;
                        if (ucr2 != null) break block6;
                    }
                    catch (oov oov2) {
                        throw f58.a(oov2);
                    }
                    list.add(f58.b("j", (int)20086, (long)(0x1A941F5E52AC0DEAL ^ l)));
                    if (n == 0) return;
                }
                catch (oov oov3) {
                    throw f58.a(oov3);
                }
            }
            list.add((String)((Object)f58.b("j", (int)15216, (long)(0x27EA95A00200F8EAL ^ l))) + (1 << ucr2.rqi));
            list.add((String)((Object)f58.b("j", (int)28683, (long)(0x514F171EA87F3395L ^ l))) + ucr2.rqi + "/" + 4 + ")");
            return;
        }
        catch (oov oov4) {
            throw f58.a(oov4);
        }
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

                f58.a = c.a(-3709808944047003674L, 5455254055924426903L, MethodHandles.lookup().lookupClass()).a(98590451228926L);
                f58.h = new HashMap<K, V>(13);
                var0 = f58.a ^ 89943673835049L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "d\u00bc\u00a1\u0000\u00bd\u00e1d\u000e\u0014N\u001e\u00f7\u008c\u00cc\u001812\u0094\u00f4;\u007f>M\u00fa\u0010\u0086\u0006\u001a\u001fC\u009f\u00d3\u00b8\u00fe\u00cc\u001c\u009as>\u00e2Z\u0010\u00e8V\u00e4\u001d\u00ee\u00c0\u000b\u00a1n\u0002.\u00ca\u00af\u009a\u001c\u008c\u0010\u00faK\u0015\u00c1\u00bc\u000b|p\u000fG\u00cd\u00bd_\t\u008c8\u0010\f\u00e0\u0018d\u00f2vZ\u00d7\u0005\u00a3\u00db@G\u00fewB\u0018\n\u001a\u000e\u0082\u00e7\u00e9\u00d3\u00fa\u00917LA\u0017\u0017\u0083vj\u00a8\u00e9\u001c$J\u00e9\u00b5";
                var8_6 = "d\u00bc\u00a1\u0000\u00bd\u00e1d\u000e\u0014N\u001e\u00f7\u008c\u00cc\u001812\u0094\u00f4;\u007f>M\u00fa\u0010\u0086\u0006\u001a\u001fC\u009f\u00d3\u00b8\u00fe\u00cc\u001c\u009as>\u00e2Z\u0010\u00e8V\u00e4\u001d\u00ee\u00c0\u000b\u00a1n\u0002.\u00ca\u00af\u009a\u001c\u008c\u0010\u00faK\u0015\u00c1\u00bc\u000b|p\u000fG\u00cd\u00bd_\t\u008c8\u0010\f\u00e0\u0018d\u00f2vZ\u00d7\u0005\u00a3\u00db@G\u00fewB\u0018\n\u001a\u000e\u0082\u00e7\u00e9\u00d3\u00fa\u00917LA\u0017\u0017\u0083vj\u00a8\u00e9\u001c$J\u00e9\u00b5".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = f58.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008bl+u\u009b\u00a7@e%\u001a\u00d3x\u00d3\u0080&\u008b+\u0086\u0089\u00eez\u00d5T\u0094\u0010\u00ce\u00d1\u00ec\u00a4\u00cegY\u00b1\u008e\u0002\u009b\u00b1hs\u0007\u00a9";
                    var8_6 = "\u008bl+u\u009b\u00a7@e%\u001a\u00d3x\u00d3\u0080&\u008b+\u0086\u0089\u00eez\u00d5T\u0094\u0010\u00ce\u00d1\u00ec\u00a4\u00cegY\u00b1\u008e\u0002\u009b\u00b1hs\u0007\u00a9".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = f58.b(var10_9).intern();
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
        f58.b = var9_3;
        f58.g = new String[8];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2758;
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
                throw new RuntimeException("f58", exception);
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
            f58.g[n2] = f58.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = f58.b(n, l);
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
            throw new RuntimeException("f58" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f58.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

