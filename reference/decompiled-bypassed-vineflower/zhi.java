import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class zhi {
   public void kz9(e0x var1, k_d var2) {
      this.jrn.put(var1, var2);
   }

   public void xpf(e0x[] var1) {
      Collections.addAll(this.iz5, var1);
   }

   public Map coz() {
      IdentityHashMap var2 = Maps.newIdentityHashMap();
      int var10000 = t9d.b();
      Iterator var3 = e0x.db8.iterator();
      int var1 = var10000;

      while (var3.hasNext()) {
         e0x var4 = (e0x)var3.next();

         try {
            if (!this.iz5.contains(var4)) {
               var2.putAll(((k_d)Objects.firstNonNull(this.jrn.get(var4), new o4x())).q2s(var4));
            }
         } catch (oov var5) {
            throw a(var5);
         }

         if (var1 == 0) {
            break;
         }
      }

      return var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
