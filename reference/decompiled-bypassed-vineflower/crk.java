public class crk extends dzm {
   public lva pf0 = new lva(1.0F);
   public boolean lw6;

   public crk(String var1, String var2, float var3, float var4, float var5, float var6) {
      this.rn2 = var1;
      this.h4c = var2;
      this.ktv = var3;
      this.vwq = var4;
      this.exx = var5;
      this.o2l = var6;
      this.lw6 = false;
      _x3.wig.add(this);
   }

   public crk(String var1, String var2, float var3, float var4, float var5, float var6, boolean var7) {
      this(var1, var2, var3, var4, var5, var6);
      this.lw6 = var7;
   }

   public crk(String var1, String var2, float var3, float var4, float var5, float var6, String var7) {
      this(var1, var2, var3, var4, var5, var6);
      this.xab = var7;
   }

   public Float d7c() {
      return (Float)this.ktv;
   }

   public void ms1(float var1) {
      int var2 = t9d.b();

      label49: {
         float var7;
         label48: {
            label47: {
               label46: {
                  try {
                     float var8;
                     var10000 = (var8 = var1 - this.vwq) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
                     if (var2 == 0) {
                        break label47;
                     }

                     if (var10000 >= 0) {
                        break label46;
                     }
                  } catch (oov var6) {
                     throw a(var6);
                  }

                  var1 = this.vwq;
               }

               try {
                  var7 = var1;
                  if (var2 == 0) {
                     break label48;
                  }

                  float var9;
                  var10000 = (var9 = var1 - this.exx) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               } catch (oov var5) {
                  throw a(var5);
               }
            }

            try {
               if (var10000 <= 0) {
                  break label49;
               }

               var7 = this.exx;
            } catch (oov var4) {
               throw a(var4);
            }
         }

         var1 = var7;
      }

      try {
         this.ktv = var1;
         if (this == zwr.o04) {
            n_l.wvk((int)var1, false);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public double u7t() {
      return (double)this.d7c().floatValue();
   }

   public lva rpv() {
      return this.pf0;
   }

   public float q9v() {
      return this.vwq;
   }

   public float uof() {
      return this.exx;
   }

   public float t99() {
      return this.o2l;
   }

   public String fht() {
      return this.xab;
   }

   @Override
   public Object d7c() {
      return this.d7c();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
