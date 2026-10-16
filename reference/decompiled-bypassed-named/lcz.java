import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.util.vector.Vector3f;

public class lcz {
   public final Vector3f h5x;
   public final Vector3f jr5;
   public final Map uat;
   public final qoi nn3;
   public final boolean c5c;

   public lcz(Vector3f var1, Vector3f var2, Map var3, qoi var4, boolean var5) {
      this.h5x = var1;
      this.jr5 = var2;
      this.uat = var3;
      this.nn3 = var4;
      this.c5c = var5;
      this.r6n();
   }

   private void r6n() {
      int var1 = OpaquePredicate.b();

      for (Entry var3 : this.uat.entrySet()) {
         float[] var4 = this.ok6((vt2)var3.getKey());
         ((e97)var3.getValue()).hi7.p71(var4);
         if (var1 == 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private float[] ok6(vt2 var1) {
      int var2 = OpaquePredicate.b();

      label53: {
         label46: {
            label45: {
               int var10000;
               label44: {
                  try {
                     var10000 = lcz$1.aup[var1.ordinal()];
                     if (var2 == 0) {
                        break label44;
                     }

                     switch (var10000) {
                        case 1:
                        case 2:
                           break;
                        case 3:
                        case 4:
                           break label45;
                        case 5:
                        case 6:
                           break label46;
                        default:
                           break label53;
                     }
                  } catch (NullPointerException var6) {
                     throw a(var6);
                  }

                  var10000 = 4;
               }

               float[] var7 = new float[var10000];
               var7[0] = this.h5x.x;
               var7[1] = this.h5x.z;
               var7[2] = this.jr5.x;
               var7[3] = this.jr5.z;
               float[] var3 = var7;
               if (var2 != 0) {
                  return var3;
               }
            }

            float[] var10 = new float[]{this.h5x.x, 16.0F - this.jr5.y, this.jr5.x, 16.0F - this.h5x.y};
            if (var2 != 0) {
               return var10;
            }
         }

         float[] var11 = new float[]{this.h5x.z, 16.0F - this.jr5.y, this.jr5.z, 16.0F - this.h5x.y};

         try {
            if (var2 != 0) {
               return var11;
            }
         } catch (NullPointerException var5) {
            boolean var10001 = false;
            throw a(var5);
         }
      }

      try {
         throw new NullPointerException();
      } catch (NullPointerException var4) {
         boolean var9 = false;
         throw a(var4);
      }
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
