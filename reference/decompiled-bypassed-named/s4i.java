import java.util.Iterator;

public class s4i {
   private static final s4i$tjr f5v = new s4i$1();
   private static final s4i$tjr h3f = new s4i$2();
   private static final s4i$tjr yqo = new s4i$3();

   private static int evd(m5n var0, mew var1, s4i$tjr var2) {
      int var4 = 0;
      int var10000 = OpaquePredicate.c();
      int var5 = 0;
      int var6 = 0;
      int var3 = var10000;
      Iterator var7 = mew.getAllInBoxMutable(var1.ec4(-1, 0, -1), var1.ec4(1, 0, 1)).iterator();

      while (true) {
         if (var7.hasNext()) {
            mew$mix var8 = (mew$mix)var7.next();
            int var9 = var2.ozy(var0.getBiomeGenForCoords(var8), var8);
            var4 += (var9 & 0xFF0000) >> 16;
            var5 += (var9 & 0xFF00) >> 8;
            var10000 = var6 + (var9 & 0xFF);
            if (var3 != 0) {
               break;
            }

            var6 = var10000;
            if (var3 == 0) {
               continue;
            }
         }

         var10000 = (var4 / 9 & 0xFF) << 16 | (var5 / 9 & 0xFF) << 8 | var6 / 9 & 0xFF;
         break;
      }

      return var10000;
   }

   public static int mq6(m5n var0, mew var1) {
      return evd(var0, var1, f5v);
   }

   public static int uqp(m5n var0, mew var1) {
      return evd(var0, var1, h3f);
   }

   public static int ex1(m5n var0, mew var1) {
      return evd(var0, var1, yqo);
   }
}
