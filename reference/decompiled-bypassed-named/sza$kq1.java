import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class sza$kq1 extends sza$ah7 {
   public List nvg = Lists.newArrayList();

   public sza$kq1(String var1) {
      this.b40 = var1;
   }

   @Override
   public gdw ley() {
      qhg var2 = new qhg();
      int var10000 = OpaquePredicate.b();
      Iterator var3 = this.nvg.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            sza$ah7 var4 = (sza$ah7)var3.next();

            try {
               var6 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.w2j(var4.ley());
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
