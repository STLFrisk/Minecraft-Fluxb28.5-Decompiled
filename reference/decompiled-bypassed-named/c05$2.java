public class c05$2 extends Thread {
   public final Minecraft l2s;

   public c05$2(Minecraft var1, String var2) {
      super(var2);
      this.l2s = var1;
   }

   @Override
   public void run() {
      int var1 = OpaquePredicate.b();

      label25:
      do {
         try {
            while (this.l2s.yq1) {
               try {
                  Thread.sleep(2147483647L);
               } catch (InterruptedException var3) {
                  continue label25;
               }
            }
            break;
         } catch (oov var4) {
            throw a(var4);
         }
      } while (var1 != 0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
