/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class b4o {
    private static List k1w = new ArrayList();

    public static void xcu(String string, boolean bl, boolean bl2, boolean bl3) {
        block16: {
            boolean bl4;
            hrs hrs2;
            block17: {
                int n;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                n = t9d.b();
                                hrs2 = new hrs(string.replace("#", ""));
                                try {
                                    try {
                                        bl4 = bl;
                                        if (n == 0) break block12;
                                        if (!bl4) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw b4o.a(oov2);
                                    }
                                    hrs2.fcq().addAll(zwr.qkk.zj2().wau().stream().filter(ar7::klu).map(ar7::m2d).collect(Collectors.toList()));
                                }
                                catch (oov oov3) {
                                    throw b4o.a(oov3);
                                }
                            }
                            bl4 = bl2;
                        }
                        try {
                            try {
                                if (n == 0) break block14;
                                if (!bl4) break block15;
                            }
                            catch (oov oov4) {
                                throw b4o.a(oov4);
                            }
                            hrs2.rww().putAll(zwr.qkk.zj2().wau().stream().collect(Collectors.toMap(ar7::m2d, ar7::x_i)));
                        }
                        catch (oov oov5) {
                            throw b4o.a(oov5);
                        }
                    }
                    bl4 = bl3;
                }
                try {
                    try {
                        if (n == 0) break block16;
                        if (!bl4) break block17;
                    }
                    catch (oov oov6) {
                        throw b4o.a(oov6);
                    }
                    hrs2.zgp().addAll(_x3.wig.stream().map(b4o::sc3).collect(Collectors.toList()));
                }
                catch (oov oov7) {
                    throw b4o.a(oov7);
                }
            }
            bl4 = k1w.add(hrs2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void u4c(hrs var0) {
        block40: {
            block39: {
                block37: {
                    block38: {
                        block35: {
                            block36: {
                                block33: {
                                    block34: {
                                        var1_1 = t9d.b();
                                        v0 = var0.fcq().size();
                                        if (var1_1 == 0) break block33;
                                        try {
                                            block47: {
                                                if (v0 <= 0) break block34;
                                                break block47;
                                                catch (Exception v1) {
                                                    throw b4o.a(v1);
                                                }
                                            }
                                            zwr.qkk.zj2().wau().stream().filter((Predicate<ar7>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, klu(), (Lar7;)Z)()).forEach((Consumer<ar7>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, kkj(), (Lar7;)V)());
                                            var0.fcq().forEach((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, xc9(java.lang.String ), (Ljava/lang/String;)V)());
                                        }
                                        catch (Exception v2) {
                                            throw b4o.a(v2);
                                        }
                                    }
                                    v0 = var0.v35().size();
                                }
                                if (var1_1 == 0) break block35;
                                try {
                                    block48: {
                                        if (v0 <= 0) break block36;
                                        break block48;
                                        catch (Exception v3) {
                                            throw b4o.a(v3);
                                        }
                                    }
                                    var0.v35().forEach((Consumer<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, zh4(java.lang.String ), (Ljava/lang/String;)V)());
                                }
                                catch (Exception v4) {
                                    throw b4o.a(v4);
                                }
                            }
                            v0 = var0.rww().size();
                        }
                        if (var1_1 == 0) break block37;
                        try {
                            block49: {
                                if (v0 <= 0) break block38;
                                break block49;
                                catch (Exception v5) {
                                    throw b4o.a(v5);
                                }
                            }
                            zwr.qkk.zj2().wau().forEach((Consumer<ar7>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, j2b(ar7 ), (Lar7;)V)());
                            var0.rww().forEach((BiConsumer<String, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, y88(java.lang.String java.lang.Integer ), (Ljava/lang/String;Ljava/lang/Integer;)V)());
                        }
                        catch (Exception v6) {
                            throw b4o.a(v6);
                        }
                    }
                    try {
                        v7 = var0.zgp();
                        if (var1_1 == 0) break block39;
                        v0 = v7.size();
                    }
                    catch (Exception v8) {
                        throw b4o.a(v8);
                    }
                }
                try {
                    if (v0 <= 0) break block40;
                    v7 = var0.zgp();
                }
                catch (Exception v9) {
                    throw b4o.a(v9);
                }
            }
            for (String var3_3 : v7) {
                block41: {
                    var4_4 = var3_3.split(":")[0];
                    var5_5 = var3_3.split(":")[1];
                    var6_6 = var3_3.split(":")[2];
                    var7_7 = _x3.fv0(var4_4, var5_5);
                    try {
                        v10 = var7_7;
                        if (var1_1 != 0) {
                            if (v10 == null) break block41;
                        }
                        ** GOTO lbl82
                    }
                    catch (Exception v11) {
                        throw b4o.a(v11);
                    }
                    try {
                        block46: {
                            block44: {
                                block45: {
                                    block42: {
                                        block43: {
                                            v10 = var7_7;
lbl82:
                                            // 3 sources

                                            v12 = v10 instanceof crk;
                                            if (var1_1 == 0) break block42;
                                            try {
                                                block50: {
                                                    if (!v12) break block43;
                                                    break block50;
                                                    catch (Exception v13) {
                                                        throw b4o.a(v13);
                                                    }
                                                }
                                                ((crk)var7_7).ms1(Float.parseFloat(var6_6));
                                            }
                                            catch (Exception v14) {
                                                throw b4o.a(v14);
                                            }
                                        }
                                        v12 = var7_7 instanceof cn7;
                                    }
                                    if (var1_1 == 0) break block44;
                                    try {
                                        block51: {
                                            if (!v12) break block45;
                                            break block51;
                                            catch (Exception v15) {
                                                throw b4o.a(v15);
                                            }
                                        }
                                        var7_7.aze(Boolean.parseBoolean(var6_6));
                                    }
                                    catch (Exception v16) {
                                        throw b4o.a(v16);
                                    }
                                }
                                try {
                                    v17 = var7_7;
                                    if (var1_1 == 0) break block46;
                                    v12 = v17 instanceof c_3;
                                }
                                catch (Exception v18) {
                                    throw b4o.a(v18);
                                }
                            }
                            if (!v12) break block41;
                            v17 = var7_7;
                        }
                        ((c_3)v17).n1j(var6_6);
                    }
                    catch (Exception var8_8) {
                        var8_8.printStackTrace();
                    }
                }
                if (var1_1 != 0) continue;
            }
        }
    }

    public static boolean xim(String string) {
        try {
            if (b4o.d2s(string) == null) {
                return false;
            }
        }
        catch (oov oov2) {
            throw b4o.a(oov2);
        }
        k1w.remove(b4o.d2s(string));
        zwr.qkk.up0().ulq(string);
        return true;
    }

    public static boolean c1p(String string) {
        Object object;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        object = k1w.stream().filter(arg_0 -> b4o.isy(string, arg_0));
                        if (n != 0) break block4;
                        if (object.count() > 0L) break block5;
                    }
                    catch (oov oov2) {
                        throw b4o.a(oov2);
                    }
                    return false;
                }
                catch (oov oov3) {
                    throw b4o.a(oov3);
                }
            }
            object = k1w.stream().filter(arg_0 -> b4o.mp2(string, arg_0)).findFirst().get();
        }
        hrs hrs2 = (hrs)object;
        b4o.u4c(hrs2);
        return true;
    }

    public static hrs d2s(String string) {
        hrs hrs2;
        block6: {
            Predicate<hrs> predicate;
            Stream stream;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            stream = k1w.stream();
                            predicate = arg_0 -> b4o.klp(string, arg_0);
                            if (n != 0) break block4;
                            if (!stream.noneMatch(predicate)) break block5;
                        }
                        catch (oov oov2) {
                            throw b4o.a(oov2);
                        }
                        hrs2 = null;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw b4o.a(oov3);
                    }
                }
                stream = k1w.stream();
                predicate = arg_0 -> b4o.zd1(string, arg_0);
            }
            hrs2 = stream.filter(predicate).findFirst().get();
        }
        return hrs2;
    }

    public static List zq1() {
        return k1w;
    }

    private static boolean zd1(String string, hrs hrs2) {
        return hrs2.thb().equalsIgnoreCase(string);
    }

    private static boolean klp(String string, hrs hrs2) {
        return hrs2.thb().equalsIgnoreCase(string);
    }

    private static boolean mp2(String string, hrs hrs2) {
        return hrs2.thb().equalsIgnoreCase(string);
    }

    private static boolean isy(String string, hrs hrs2) {
        return hrs2.thb().equalsIgnoreCase(string);
    }

    private static void y88(String string, Integer n) {
        block5: {
            ar7 ar72;
            block4: {
                int n2 = t9d.c();
                try {
                    try {
                        ar72 = zwr.qkk.zj2().wv4(string);
                        if (n2 != 0) break block4;
                        if (ar72 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw b4o.a(oov2);
                    }
                    ar72 = zwr.qkk.zj2().wv4(string);
                }
                catch (oov oov3) {
                    throw b4o.a(oov3);
                }
            }
            ar72.nm8(n);
        }
    }

    private static void j2b(ar7 ar72) {
        ar72.nm8(0);
    }

    private static void zh4(String string) {
        block5: {
            ar7 ar72;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        ar72 = zwr.qkk.zj2().wv4(string);
                        if (n == 0) break block4;
                        if (ar72 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw b4o.a(oov2);
                    }
                    ar72 = zwr.qkk.zj2().wv4(string);
                }
                catch (oov oov3) {
                    throw b4o.a(oov3);
                }
            }
            ar72.kkj();
        }
    }

    private static void xc9(String string) {
        block5: {
            ar7 ar72;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        ar72 = zwr.qkk.zj2().wv4(string);
                        if (n == 0) break block4;
                        if (ar72 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw b4o.a(oov2);
                    }
                    ar72 = zwr.qkk.zj2().wv4(string);
                }
                catch (oov oov3) {
                    throw b4o.a(oov3);
                }
            }
            ar72.z5z();
        }
    }

    private static String sc3(dzm dzm2) {
        return dzm2.l08() + ":" + dzm2.o7h() + ":" + dzm2.d7c();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

