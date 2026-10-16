import java.util.Random;

public class uk2 {
   public int oa6 = 8;
   public Random a0f = new Random();
   public OpaquePredicate pr9;

   public void vyh(g6k var1, OpaquePredicate var2, int var3, int var4, lno var5) {
      int var7 = this.oa6;
      this.pr9 = var2;
      this.a0f.setSeed(var2.x2p());
      int var10000 = OpaquePredicate.b();
      long var8 = this.a0f.nextLong();
      long var10 = this.a0f.nextLong();
      int var6 = var10000;
      int var12 = var3 - var7;

      while (var12 <= var3 + var7) {
         int var13 = var4 - var7;

         while (true) {
            if (var13 <= var4 + var7) {
               long var14 = (long)var12 * var8;
               long var16 = (long)var13 * var10;

               try {
                  this.a0f.setSeed(var14 ^ var16 ^ var2.x2p());
                  this.bjr(var2, var12, var13, var3, var4, var5);
                  var13++;
                  if (var6 == 0) {
                     break;
                  }

                  if (var6 != 0) {
                     continue;
                  }
               } catch (oov var18) {
                  throw b(var18);
               }
            }

            var12++;
            break;
         }

         if (var6 == 0) {
            break;
         }
      }
   }

   public void bjr(OpaquePredicate var1, int var2, int var3, int var4, int var5, lno var6) {
   }

   private static oov b(oov var0) {
      return var0;
   }
}
