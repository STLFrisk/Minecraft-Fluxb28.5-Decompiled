/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 */
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;

public class eqg$1
implements Iterable {
    public final Class t_a;
    public final eqg vec;

    public eqg$1(eqg eqg2, Class clazz) {
        this.vec = eqg2;
        this.t_a = clazz;
    }

    public Iterator iterator() {
        List list;
        block4: {
            List list2;
            block5: {
                int n = t9d.b();
                list2 = (List)eqg.dd1(this.vec).get(this.vec.aun(this.t_a));
                try {
                    try {
                        list = list2;
                        if (n == 0) break block4;
                        if (list != null) break block5;
                    }
                    catch (oov oov2) {
                        throw eqg$1.a(oov2);
                    }
                    return Iterators.emptyIterator();
                }
                catch (oov oov3) {
                    throw eqg$1.a(oov3);
                }
            }
            list = list2;
        }
        Iterator iterator = list.iterator();
        return Iterators.filter(iterator, (Class)this.t_a);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

