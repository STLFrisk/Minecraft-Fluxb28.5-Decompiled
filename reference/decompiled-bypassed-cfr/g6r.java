/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class g6r {
    public float _5e;
    public boolean ete;
    public boolean _a0 = true;
    public List uik = Lists.newArrayList();
    private /* synthetic */ Map nx7;
    public int dsx = 64;
    public int apc = 32;

    public g6r() {
        this.nx7 = Maps.newHashMap();
    }

    public void s_q(i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
    }

    public void v3g(g_3 g_32, float f, float f2, float f3) {
    }

    public tf8 bm8(Random random) {
        return (tf8)this.uik.get(random.nextInt(this.uik.size()));
    }

    public void o15(String string, int n, int n2) {
        this.nx7.put(string, new jts(n, n2));
    }

    public jts bx0(String string) {
        return (jts)this.nx7.get(string);
    }

    public static void ibo(tf8 tf82, tf8 tf83) {
        tf83.pod = tf82.pod;
        tf83.r80 = tf82.r80;
        tf83.oo7 = tf82.oo7;
        tf83._ki = tf82._ki;
        tf83.ca7 = tf82.ca7;
        tf83.kit = tf82.kit;
    }

    public void jxr(g6r g6r2) {
        this._5e = g6r2._5e;
        this.ete = g6r2.ete;
        this._a0 = g6r2._a0;
    }
}

