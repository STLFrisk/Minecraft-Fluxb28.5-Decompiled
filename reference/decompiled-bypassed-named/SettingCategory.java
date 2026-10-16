public class SettingCategory {
   public float lls;
   public float by9 = 0.3F;

   public SettingCategory(float var1) {
      this.lls = var1;
   }

   public SettingCategory(float var1, float var2) {
      this.lls = var1;
      this.by9 = var2;
   }

   public boolean ry0(boolean var1) {
      int var2 = OpaquePredicate.b();

      SettingCategory var10000;
      float var10001;
      float var10002;
      label46: {
         try {
            var10000 = this;
            var10001 = this.kgi;
            if (var1) {
               var10002 = this.lls;
               break label46;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10002 = 0.0F;
      }

      float var10003;
      float var10004;
      float var10005;
      label39: {
         try {
            var10003 = 10.0F;
            var10004 = this.kgi;
            if (var1) {
               var10005 = this.lls;
               break label39;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10005 = 0.0F;
      }

      try {
         var10000.kgi = InputState.lvf(var10001, var10002, Math.max(var10003, Math.abs(var10004 - var10005) * 40.0F) * this.by9);
         float var7;
         int var6 = (var7 = this.kgi - this.lls) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
         if (var2 == 0) {
            return (boolean)var6;
         }

         if (!var6) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public float els() {
      return this.lls;
   }

   public void vej(float var1) {
      this.lls = var1;
   }

   public float gos() {
      return this.by9;
   }

   public void lg2(float var1) {
      this.by9 = var1;
   }

   public float o7r() {
      return this.kgi;
   }

   public void lna(float var1) {
      this.kgi = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
