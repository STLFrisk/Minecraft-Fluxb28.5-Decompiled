import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class hdl {
   public static Iterable nvf(Class var0, Iterable var1) {
      return new hdl$i7d(var0, (Iterable[])q8w(Iterable.class, var1), null);
   }

   public static Iterable ud4(Iterable var0) {
      return w7_(nvf(Object.class, var0));
   }

   private static Iterable w7_(Iterable var0) {
      return Iterables.transform(var0, new hdl$kfk(null));
   }

   private static Object[] q8w(Class var0, Iterable var1) {
      ArrayList var3 = Lists.newArrayList();
      int var10000 = t9d.b();
      Iterator var4 = var1.iterator();
      int var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            Object var5 = var4.next();

            try {
               var7 = var3;
               if (var2 == 0) {
                  break;
               }

               var3.add(var5);
               if (var2 != 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var7 = var3;
         break;
      }

      return var7.toArray(rjm(var0, var3.size()));
   }

   private static Object[] rjm(Class var0, int var1) {
      return (Object[])Array.newInstance(var0, var1);
   }

   public static Object[] w5z(Class var0, int var1) {
      return rjm(var0, var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
