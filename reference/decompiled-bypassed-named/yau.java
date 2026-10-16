import java.util.Random;

public class yau extends gyu {
   private static final h7i pdj = new h7i(false);

   public yau(int var1) {
      super(var1);
      this.c1d.add(new gyu$dwn(zfo.class, 1, 2, 6));
      this.dmv.c10 = 1;
      this.dmv.k9k = 4;
      this.dmv.qy9 = 20;
   }

   @Override
   public e9q jk9(Random var1) {
      try {
         if (var1.nextInt(5) > 0) {
            return pdj;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return this.zqo;
   }

   @Override
   public gyu hiq(int var1) {
      yau$m1x var2 = new yau$m1x(var1, this);
      var2.rm7 = (this.rm7 + 1.0F) * 0.5F;
      var2.f6x = this.f6x * 0.5F + 0.3F;
      var2.yeh = this.yeh * 0.5F + 1.2F;
      return var2;
   }

   @Override
   public void u0r(OpaquePredicate var1, Random var2, mew var3) {
      e_t.r91(ldj$vn8.h4k);
      int var10000 = OpaquePredicate.c();
      int var5 = 0;
      int var4 = var10000;

      while (true) {
         if (var5 < 7) {
            int var6 = var2.nextInt(16) + 8;
            int var7 = var2.nextInt(16) + 8;
            int var8 = var2.nextInt(var1.p9y(var3.ec4(var6, 0, var7)).getY() + 32);

            try {
               e_t.v3g(var1, var2, var3.ec4(var6, var8, var7));
               var5++;
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         super.u0r(var1, var2, var3);
         break;
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
