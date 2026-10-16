/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.util.IteratorCache;

public class eqg
extends AbstractSet {
    private static final Set aw_;
    private final Map zem = Maps.newHashMap();
    private final Set hr3 = Sets.newIdentityHashSet();
    private final Class b76;
    private final List cdo = Lists.newArrayList();
    public boolean b16;
    private static final long a;
    private static final String b;

    public eqg(Class clazz) {
        boolean bl;
        this.b76 = clazz;
        this.hr3.add(clazz);
        this.zem.put(clazz, this.cdo);
        for (Class clazz2 : aw_) {
            this.e_q(clazz2);
        }
        try {
            eqg eqg2 = this;
            bl = this.cdo.size() == 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw eqg.a(illegalArgumentException);
        }
        eqg2.b16 = bl;
    }

    public void e_q(Class clazz) {
        aw_.add(clazz);
        int n = this.cdo.size();
        for (int i = 0; i < n; ++i) {
            Object e = this.cdo.get(i);
            try {
                if (!clazz.isAssignableFrom(e.getClass())) continue;
                this.js1(e, clazz);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw eqg.a(illegalArgumentException);
            }
        }
        this.hr3.add(clazz);
    }

    public Class aun(Class clazz) {
        block9: {
            block11: {
                eqg eqg2;
                block10: {
                    boolean bl;
                    block8: {
                        long l = a ^ 0x758126C2A8BCL;
                        int n = t9d.b();
                        try {
                            try {
                                try {
                                    bl = this.b76.isAssignableFrom(clazz);
                                    if (n == 0) break block8;
                                    if (!bl) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw eqg.a(illegalArgumentException);
                                }
                                eqg2 = this;
                                if (n == 0) break block10;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw eqg.a(illegalArgumentException);
                            }
                            bl = eqg2.hr3.contains(clazz);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw eqg.a(illegalArgumentException);
                        }
                    }
                    if (bl) break block11;
                    eqg2 = this;
                }
                eqg2.e_q(clazz);
            }
            return clazz;
        }
        throw new IllegalArgumentException(b + clazz);
    }

    @Override
    public boolean add(Object object) {
        boolean bl;
        block7: {
            int n;
            block9: {
                block10: {
                    int n2 = t9d.c();
                    for (Class clazz : this.hr3) {
                        block8: {
                            try {
                                try {
                                    bl = clazz.isAssignableFrom(object.getClass());
                                    if (n2 != 0) break block7;
                                    if (!bl) break block8;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw eqg.a(illegalArgumentException);
                                }
                                this.js1(object, clazz);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw eqg.a(illegalArgumentException);
                            }
                        }
                        if (n2 == 0) continue;
                    }
                    try {
                        eqg eqg2 = this;
                        n = this.cdo.size();
                        if (n2 != 0) break block9;
                        if (n != 0) break block10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw eqg.a(illegalArgumentException);
                    }
                    n = 1;
                    break block9;
                }
                n = 0;
            }
            eqg2.b16 = n;
            bl = true;
        }
        return bl;
    }

    private void js1(Object object, Class clazz) {
        boolean bl;
        block5: {
            List list;
            block4: {
                list = (List)this.zem.get(clazz);
                try {
                    if (list != null) break block4;
                    this.zem.put(clazz, Lists.newArrayList((Object[])new Object[]{object}));
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw eqg.a(illegalArgumentException);
                }
            }
            list.add(object);
        }
        try {
            eqg eqg2 = this;
            bl = this.cdo.size() == 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw eqg.a(illegalArgumentException);
        }
        eqg2.b16 = bl;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl;
        block14: {
            int n;
            boolean bl2;
            block17: {
                block18: {
                    Object object2 = object;
                    bl2 = false;
                    int n2 = t9d.c();
                    for (Class clazz : this.hr3) {
                        block15: {
                            boolean bl3;
                            List list;
                            block16: {
                                Class<Object> clazz2;
                                block13: {
                                    try {
                                        try {
                                            try {
                                                clazz2 = clazz;
                                                if (n2 != 0) break block13;
                                                bl = clazz2.isAssignableFrom(object2.getClass());
                                                if (n2 != 0) break block14;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw eqg.a(illegalArgumentException);
                                            }
                                            if (!bl) break block15;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw eqg.a(illegalArgumentException);
                                        }
                                        clazz2 = this.zem.get(clazz);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw eqg.a(illegalArgumentException);
                                    }
                                }
                                List list2 = (List)((Object)clazz2);
                                try {
                                    list = list2;
                                    if (n2 != 0) break block16;
                                    if (list == null) break block15;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw eqg.a(illegalArgumentException);
                                }
                                list = list2;
                            }
                            try {
                                bl3 = list.remove(object2);
                                if (n2 != 0 || !bl3) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw eqg.a(illegalArgumentException);
                            }
                            bl3 = bl2 = true;
                        }
                        if (n2 == 0) continue;
                    }
                    try {
                        eqg eqg2 = this;
                        n = this.cdo.size();
                        if (n2 != 0) break block17;
                        if (n != 0) break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw eqg.a(illegalArgumentException);
                    }
                    n = 1;
                    break block17;
                }
                n = 0;
            }
            eqg2.b16 = n;
            bl = bl2;
        }
        return bl;
    }

    @Override
    public boolean contains(Object object) {
        return Iterators.contains(this.x_n(object.getClass()).iterator(), (Object)object);
    }

    public Iterable x_n(Class clazz) {
        return new eqg$1(this, clazz);
    }

    @Override
    public Iterator iterator() {
        Iterator iterator;
        block6: {
            List list;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            list = this.cdo;
                            if (n != 0) break block4;
                            if (!list.isEmpty()) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw eqg.a(illegalArgumentException);
                        }
                        iterator = Iterators.emptyIterator();
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw eqg.a(illegalArgumentException);
                    }
                }
                list = this.cdo;
            }
            iterator = IteratorCache.getReadOnly(list);
        }
        return iterator;
    }

    @Override
    public int size() {
        return this.cdo.size();
    }

    @Override
    public boolean isEmpty() {
        return this.b16;
    }

    public static Map dd1(eqg eqg2) {
        return eqg2.zem;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        a = c.a(5945257652988335356L, 736663082485435391L, MethodHandles.lookup().lookupClass()).a(133853943313198L);
        long l = a ^ 0x6F2043AAF4AFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00fd\u00c5\u00c8\u0093\t 8}I\u00a3\u00cc\u00a5\u00b1\u00d1\u00f2RO\u00c8y\u00d2u\u00edY?\u00bb\u0093\u00f6X\u0080\u0005\u00f5\u0084".getBytes("ISO-8859-1"));
                b = eqg.a(byArray3).intern();
                aw_ = Collections.newSetFromMap(new ConcurrentHashMap());
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

