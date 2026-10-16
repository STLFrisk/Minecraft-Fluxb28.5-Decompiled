import com.google.common.collect.Lists;

public class iq7$3 implements Runnable {
   public final iq7 fdy;

   public iq7$3(iq7 var1) {
      this.fdy = var1;
   }

   @Override
   public void run() {
      int var1 = OpaquePredicate.b();

      for (z96 var3 : Lists.newArrayList(this.fdy.wh3().tjx())) {
         this.fdy.wh3().rs8(var3);
         if (var1 == 0) {
            break;
         }
      }
   }
}
