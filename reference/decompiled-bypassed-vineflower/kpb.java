import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;

public class kpb extends m75 {
   private final xny zh_;
   private final String i22;
   private final List _6i;

   private kpb(xny var1, String var2, List var3) {
      this.zh_ = var1;
      this.i22 = var2;
      this._6i = var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public zlz htt(zfz var1) {
      int var2 = t9d.c();
      LinkedHashMap var3 = Maps.newLinkedHashMap(var1.q2y());

      String var4;
      label63: {
         xny var10000;
         label70: {
            label67: {
               try {
                  var10000 = this.zh_;
                  if (var2 != 0) {
                     break label70;
                  }

                  if (this.zh_ != null) {
                     break label67;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               var4 = ((gdz)e0x.db8.csx(var1.r_y())).toString();

               try {
                  if (var2 == 0) {
                     break label63;
                  }
               } catch (oov var9) {
                  boolean var10001 = false;
                  throw a(var9);
               }
            }

            try {
               var10000 = this.zh_;
            } catch (oov var8) {
               boolean var13 = false;
               throw a(var8);
            }
         }

         var4 = var10000._lf((Comparable)var3.remove(this.zh_));
      }

      kpb var12;
      label45: {
         label44: {
            try {
               var12 = this;
               if (var2 != 0) {
                  break label45;
               }

               if (this.i22 == null) {
                  break label44;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var4 = var4 + this.i22;
         }

         var12 = this;
      }

      for (xny var6 : var12._6i) {
         var3.remove(var6);
         if (var2 != 0) {
            break;
         }
      }

      return new zlz(var4, this.iir(var3));
   }

   public kpb(xny var1, String var2, List var3, kpb$1 var4) {
      this(var1, var2, var3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
