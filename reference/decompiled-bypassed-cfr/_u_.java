/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _u_
implements _4o {
    private final /* synthetic */ osd czf;
    private final /* synthetic */ w9p e9k;
    private final /* synthetic */ Map ywi;
    private final /* synthetic */ Map _2g;
    private final /* synthetic */ Map cv7;
    private /* synthetic */ double hu1;
    private /* synthetic */ boolean yhy;
    private /* synthetic */ double qpr;
    private static final long a = c.a(3278662069135692963L, 7266896529338512619L, MethodHandles.lookup().lookupClass()).a(64780591528803L);
    private static final String b;

    public _u_(osd osd2, w9p w9p2) {
        this.ywi = Maps.newHashMap();
        this._2g = Maps.newHashMap();
        this.cv7 = Maps.newHashMap();
        this.yhy = true;
        this.czf = osd2;
        int n = t9d.b();
        this.e9k = w9p2;
        this.hu1 = w9p2.o3r();
        for (int i = 0; i < 3; ++i) {
            this.ywi.put(i, Sets.newHashSet());
            if (n != 0) continue;
        }
    }

    @Override
    public w9p vyz() {
        return this.e9k;
    }

    @Override
    public double zdx() {
        return this.hu1;
    }

    @Override
    public void zf7(double d) {
        try {
            if (d != this.zdx()) {
                this.hu1 = d;
                this.t30();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _u_.a(illegalArgumentException);
        }
    }

    @Override
    public Collection n2v(int n) {
        return (Collection)this.ywi.get(n);
    }

    @Override
    public Collection mid() {
        HashSet hashSet;
        block4: {
            HashSet hashSet2 = Sets.newHashSet();
            int n = t9d.b();
            for (int i = 0; i < 3; ++i) {
                try {
                    hashSet = hashSet2;
                    if (n != 0) {
                        hashSet.addAll(this.n2v(i));
                        if (n != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _u_.a(illegalArgumentException);
                }
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    @Override
    public xk5 aq3(UUID uUID) {
        return (xk5)this.cv7.get(uUID);
    }

    @Override
    public boolean zaq(xk5 xk52) {
        boolean bl;
        try {
            bl = this.cv7.get(xk52.gac()) != null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw _u_.a(illegalArgumentException);
        }
        return bl;
    }

    @Override
    public void vcr(xk5 xk52) {
        block9: {
            Object object;
            Set set;
            block10: {
                xk5 xk53;
                int n;
                block7: {
                    block8: {
                        long l = a ^ 0x55F7C2B31C5AL;
                        n = t9d.c();
                        try {
                            try {
                                xk53 = this.aq3(xk52.gac());
                                if (n != 0) break block7;
                                if (xk53 != null) {
                                }
                                break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw _u_.a(illegalArgumentException);
                            }
                            throw new IllegalArgumentException(b);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _u_.a(illegalArgumentException);
                        }
                    }
                    xk53 = this._2g.get(xk52.jhj());
                }
                set = (Set)((Object)xk53);
                try {
                    object = set;
                    if (n != 0) break block9;
                    if (object != null) break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _u_.a(illegalArgumentException);
                }
                set = Sets.newHashSet();
                this._2g.put(xk52.jhj(), set);
            }
            ((Set)this.ywi.get(xk52.zdp())).add(xk52);
            set.add(xk52);
            object = this.cv7.put(xk52.gac(), xk52);
        }
        this.t30();
    }

    public void t30() {
        this.yhy = true;
        this.czf.d8j(this);
    }

    @Override
    public void se8(xk5 xk52) {
        block13: {
            Set<Object> set;
            block14: {
                Set set2;
                int n;
                block12: {
                    n = t9d.c();
                    for (int i = 0; i < 3; ++i) {
                        Set set3 = (Set)this.ywi.get(i);
                        try {
                            set2 = set3;
                            if (n == 0) {
                                set2.remove(xk52);
                                if (n == 0) continue;
                                break;
                            }
                            break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _u_.a(illegalArgumentException);
                        }
                    }
                    set2 = (Set)this._2g.get(xk52.jhj());
                }
                Set set4 = set2;
                try {
                    try {
                        try {
                            try {
                                set = set4;
                                if (n != 0) break block13;
                                if (set == null) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw _u_.a(illegalArgumentException);
                            }
                            set4.remove(xk52);
                            set = set4;
                            if (n != 0) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _u_.a(illegalArgumentException);
                        }
                        if (!set.isEmpty()) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw _u_.a(illegalArgumentException);
                    }
                    this._2g.remove(xk52.jhj());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _u_.a(illegalArgumentException);
                }
            }
            set = this.cv7.remove(xk52.gac());
        }
        this.t30();
    }

    @Override
    public void inp() {
        block4: {
            Collection collection;
            int n;
            block3: {
                n = t9d.c();
                Collection collection2 = this.mid();
                try {
                    collection = collection2;
                    if (n != 0) break block3;
                    if (collection == null) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _u_.a(illegalArgumentException);
                }
                collection = collection2;
            }
            for (xk5 xk52 : Lists.newArrayList((Iterable)collection)) {
                this.se8(xk52);
                if (n == 0) continue;
            }
        }
    }

    @Override
    public double nz5() {
        _u_ _u_2;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        _u_2 = this;
                        if (n != 0) break block4;
                        if (!_u_2.yhy) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw _u_.a(illegalArgumentException);
                    }
                    this.qpr = this.pdl();
                    this.yhy = false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw _u_.a(illegalArgumentException);
                }
            }
            _u_2 = this;
        }
        return _u_2.qpr;
    }

    private double pdl() {
        double d;
        block10: {
            xk5 xk52;
            Iterator iterator;
            double d2;
            int n;
            block9: {
                double d3;
                double d4;
                block8: {
                    d4 = this.zdx();
                    Iterator iterator2 = this.z0t(0).iterator();
                    n = t9d.c();
                    while (iterator2.hasNext()) {
                        xk5 xk53 = (xk5)iterator2.next();
                        d3 = d4 + xk53._2u();
                        if (n == 0) {
                            d4 = d3;
                            if (n == 0) continue;
                        }
                        break block8;
                    }
                    d3 = d4;
                }
                d2 = d3;
                iterator = this.z0t(1).iterator();
                while (iterator.hasNext()) {
                    xk52 = (xk5)iterator.next();
                    d2 += d4 * xk52._2u();
                    try {
                        if (n == 0) {
                            if (n == 0) continue;
                            break;
                        }
                        break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw _u_.a(illegalArgumentException);
                    }
                }
                iterator = this.z0t(2).iterator();
            }
            while (iterator.hasNext()) {
                xk52 = (xk5)iterator.next();
                d = d2 * (1.0 + xk52._2u());
                if (n == 0) {
                    d2 = d;
                    if (n == 0) continue;
                }
                break block10;
            }
            d = this.e9k.qot(d2);
        }
        return d;
    }

    private Collection z0t(int n) {
        HashSet hashSet = Sets.newHashSet((Iterable)this.n2v(n));
        w9p w9p2 = this.e9k.z1n();
        int n2 = t9d.c();
        while (w9p2 != null) {
            block5: {
                block6: {
                    _4o _4o2 = this.czf.d3k(w9p2);
                    try {
                        try {
                            if (n2 != 0) break block5;
                            if (_4o2 == null) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw _u_.a(illegalArgumentException);
                        }
                        hashSet.addAll(_4o2.n2v(n));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw _u_.a(illegalArgumentException);
                    }
                }
                w9p2 = w9p2.z1n();
            }
            if (n2 == 0) continue;
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x355B2087A46CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("vj-\u009b\u00f4\u00da\u00ba\u00d0\u00b5\u00de\f4`3i?Q\u0016Ts;\u00fdjt\u00d6\u00f9\u001e\u009d\u0004+P/\u00ad\u00e8\u00a3q\u00f1\u00fa\u0001\u00f3\b1\u00c2\u00ab\u008a\u0095\u001a\u0090".getBytes("ISO-8859-1"));
                b = _u_.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
}

