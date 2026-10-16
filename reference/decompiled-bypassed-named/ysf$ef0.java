import java.util.Random;

public class ysf$ef0 implements ysf$rj4 {
   public u7m qz4;
   public ysf$czd o3b;

   public ysf$ef0(u7m var1, ysf$czd var2) {
      this.qz4 = var1;
      this.o3b = var2;
   }

   @Override
   public void mu_(skn var1, Random var2) {
      int var3 = OpaquePredicate.c();
      int var4 = 1;

      label20: {
         try {
            if (var3 != 0) {
               return;
            }

            if (this.o3b == null) {
               break label20;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var4 = this.o3b.l5_(var2);
      }

      var1.add(new xxb(new erg(this.qz4, var4, 0), xbr.cu7));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
