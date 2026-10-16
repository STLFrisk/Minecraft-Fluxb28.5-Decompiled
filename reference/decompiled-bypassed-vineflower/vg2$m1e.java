import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class vg2$m1e implements Comparator {
   private vg2$m1e() {
   }

   public int oge(hv2 var1, hv2 var2) {
      q2m var4 = var1.yym();
      int var10000 = t9d.b();
      q2m var5 = var2.yym();
      int var3 = var10000;

      boolean var10001;
      label67: {
         try {
            var10 = ComparisonChain.start();
            if (var1.j3n() != h50$f05.l18) {
               var10001 = true;
               break label67;
            }
         } catch (oov var9) {
            throw a(var9);
         }

         var10001 = false;
      }

      boolean var10002;
      label60: {
         try {
            if (var2.j3n() != h50$f05.l18) {
               var10002 = true;
               break label60;
            }
         } catch (oov var8) {
            throw a(var8);
         }

         var10002 = false;
      }

      label53: {
         label52: {
            label51: {
               try {
                  var11 = var10.compareTrueFirst(var10001, var10002);
                  var12 = var4;
                  if (var3 == 0) {
                     break label52;
                  }

                  if (var4 == null) {
                     break label51;
                  }
               } catch (oov var7) {
                  throw a(var7);
               }

               var12 = var4;
               break label52;
            }

            var13 = "";
            break label53;
         }

         var13 = var12.fm9();
      }

      try {
         if (var3 == 0) {
            return var11.compare(var13, var5.fm9()).compare(var1.pbs().getName(), var2.pbs().getName()).result();
         }

         if (var5 == null) {
            return var11.compare(var13, "").compare(var1.pbs().getName(), var2.pbs().getName()).result();
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var11.compare(var13, var5.fm9()).compare(var1.pbs().getName(), var2.pbs().getName()).result();
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.oge((hv2)var1, (hv2)var2);
   }

   public vg2$m1e(vg2$1 var1) {
      this();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
