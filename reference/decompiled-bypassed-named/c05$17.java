public class c05$17 implements ha_ {
   public final Minecraft h5b;

   public c05$17(Minecraft var1) {
      this.h5b = var1;
   }

   @Override
   public void confirmClicked(boolean var1, int var2) {
      try {
         if (var1) {
            this.h5b.vnk().ywg();
         }
      } catch (oov var3) {
         throw a(var3);
      }

      this.h5b.z2i((ShaderHelper)null);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
