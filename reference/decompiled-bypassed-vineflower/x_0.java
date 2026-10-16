import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Iterator;

public class x_0 implements gjv {
   public void gzd(Object var1, int var2) {
      int var3 = t9d.c();
      this._gs.put(var1, var2);

      while (true) {
         if (this.o00.size() <= var2) {
            try {
               this.o00.add(null);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         this.o00.set(var2, var1);
         break;
      }
   }

   public int zt5(Object var1) {
      Integer var2 = (Integer)this._gs.get(var1);

      try {
         if (var2 == null) {
            return -1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var2;
   }

   public final Object gcd(int var1) {
      int var2 = t9d.c();

      int var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 < 0) {
               return null;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000 < this.o00.size()) {
            return this.o00.get(var1);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return null;
   }

   @Override
   public Iterator iterator() {
      return Iterators.filter(this.o00.iterator(), Predicates.notNull());
   }

   private static oov a(oov var0) {
      return var0;
   }
}
