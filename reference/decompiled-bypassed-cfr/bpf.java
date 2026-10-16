/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class bpf {
    public static Map pwj(Iterable iterable, Iterable iterable2) {
        return bpf.baj(iterable, iterable2, Maps.newLinkedHashMap());
    }

    public static Map baj(Iterable iterable, Iterable iterable2, Map map) {
        block7: {
            Iterator iterator = iterable2.iterator();
            Iterator iterator2 = iterable.iterator();
            int n = t9d.b();
            while (iterator2.hasNext()) {
                Object t = iterator2.next();
                try {
                    map.put(t, iterator.next());
                    if (n != 0) {
                        if (n != 0) continue;
                        break;
                    }
                    break block7;
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw bpf.a(noSuchElementException);
                }
            }
            try {
                if (iterator.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            catch (NoSuchElementException noSuchElementException) {
                throw bpf.a(noSuchElementException);
            }
        }
        return map;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}

