import java.util.Random;

public class ysf$j95 implements ysf$rj4 {
   @Override
   public void mu_(skn var1, Random var2) {
      vef var4 = vef.ql6[var2.nextInt(vef.ql6.length)];
      int var5 = fe6.pzp(var2, var4.s20(), var4.ehp());
      erg var6 = xbr.frz.upu(new npq(var4, var5));
      int var10000 = OpaquePredicate.b();
      int var7 = 2 + var2.nextInt(5 + var5 * 10) + 3 * var5;
      int var3 = var10000;

      label20: {
         try {
            if (var3 == 0) {
               return;
            }

            if (var7 <= 64) {
               break label20;
            }
         } catch (oov var8) {
            throw a(var8);
         }

         var7 = 64;
      }

      var1.add(new xxb(new erg(xbr.rm0), new erg(xbr.cu7, var7), var6));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
