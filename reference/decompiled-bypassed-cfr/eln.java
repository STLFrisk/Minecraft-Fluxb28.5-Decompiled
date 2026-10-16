/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class eln
implements Map {
    private final Map d5c = Maps.newLinkedHashMap();

    @Override
    public int size() {
        return this.d5c.size();
    }

    @Override
    public boolean isEmpty() {
        return this.d5c.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.d5c.containsKey(object.toString().toLowerCase());
    }

    @Override
    public boolean containsValue(Object object) {
        return this.d5c.containsKey(object);
    }

    public Object get(Object object) {
        return this.d5c.get(object.toString().toLowerCase());
    }

    public Object i1k(String string, Object object) {
        return this.d5c.put(string.toLowerCase(), object);
    }

    public Object remove(Object object) {
        return this.d5c.remove(object.toString().toLowerCase());
    }

    public void putAll(Map map) {
        int n = t9d.b();
        for (Map.Entry entry : map.entrySet()) {
            this.i1k((String)entry.getKey(), entry.getValue());
            if (n != 0) continue;
        }
    }

    @Override
    public void clear() {
        this.d5c.clear();
    }

    public Set keySet() {
        return this.d5c.keySet();
    }

    public Collection values() {
        return this.d5c.values();
    }

    public Set entrySet() {
        return this.d5c.entrySet();
    }

    public Object put(Object object, Object object2) {
        return this.i1k((String)object, object2);
    }
}

