import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class eln implements Map {
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
   public boolean containsKey(Object var1) {
      return this.d5c.containsKey(var1.toString().toLowerCase());
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.d5c.containsKey(var1);
   }

   @Override
   public Object get(Object var1) {
      return this.d5c.get(var1.toString().toLowerCase());
   }

   public Object i1k(String var1, Object var2) {
      return this.d5c.put(var1.toLowerCase(), var2);
   }

   @Override
   public Object remove(Object var1) {
      return this.d5c.remove(var1.toString().toLowerCase());
   }

   @Override
   public void putAll(Map var1) {
      int var2 = t9d.b();

      for (Entry var4 : var1.entrySet()) {
         this.i1k((String)var4.getKey(), var4.getValue());
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public void clear() {
      this.d5c.clear();
   }

   @Override
   public Set keySet() {
      return this.d5c.keySet();
   }

   @Override
   public Collection values() {
      return this.d5c.values();
   }

   @Override
   public Set entrySet() {
      return this.d5c.entrySet();
   }

   @Override
   public Object put(Object var1, Object var2) {
      return this.i1k((String)var1, var2);
   }
}
