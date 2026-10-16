import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class bpf {
   public static Map pwj(Iterable var0, Iterable var1) {
      return baj(var0, var1, Maps.newLinkedHashMap());
   }

   public static Map baj(Iterable var0, Iterable var1, Map var2) {
      Iterator var4 = var1.iterator();
      int var10000 = OpaquePredicate.b();
      Iterator var5 = var0.iterator();
      int var3 = var10000;

      while (true) {
         if (var5.hasNext()) {
            Object var6 = var5.next();

            try {
               var2.put(var6, var4.next());
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (NoSuchElementException var8) {
               throw a(var8);
            }
         }

         try {
            if (var4.hasNext()) {
               throw new NoSuchElementException();
            }
            break;
         } catch (NoSuchElementException var7) {
            throw a(var7);
         }
      }

      return var2;
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
      return var0;
   }
}
