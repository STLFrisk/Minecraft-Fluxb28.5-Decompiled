public class s0k extends bq2 {
   public s0k() {
      super(p3y.ftb, _mi._qi);
      this.y8l(this._8_.c32().zvi(vrr, vt2$y0s.abn));
      this.i3l(uja.mqu);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public zfz kig(int var1) {
      vt2$y0s var3 = vt2$y0s.abn;
      int var10000 = t9d.c();
      int var4 = var1 & 12;
      int var2 = var10000;

      byte var10001;
      label48: {
         label43: {
            try {
               var10000 = var4;
               var10001 = 4;
               if (var2 != 0) {
                  break label48;
               }

               if (var4 != 4) {
                  break label43;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var3 = vt2$y0s.wvd;

            try {
               if (var2 == 0) {
                  return this.l4i().zvi(vrr, var3);
               }
            } catch (oov var6) {
               boolean var10 = false;
               throw a(var6);
            }
         }

         try {
            var10000 = var4;
            var10001 = 8;
         } catch (oov var5) {
            boolean var11 = false;
            throw a(var5);
         }
      }

      if (var10000 == var10001) {
         var3 = vt2$y0s.zty;
      }

      return this.l4i().zvi(vrr, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public int hvp(zfz var1) {
      byte var3 = 0;
      int var10000 = t9d.b();
      vt2$y0s var4 = (vt2$y0s)var1.dil(vrr);
      int var2 = var10000;

      vt2$y0s var10001;
      label48: {
         label43: {
            try {
               var8 = var4;
               var10001 = vt2$y0s.wvd;
               if (var2 == 0) {
                  break label48;
               }

               if (var4 != vt2$y0s.wvd) {
                  break label43;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var3 |= 4;

            try {
               if (var2 != 0) {
                  return var3;
               }
            } catch (oov var6) {
               boolean var10 = false;
               throw a(var6);
            }
         }

         try {
            var8 = var4;
            var10001 = vt2$y0s.zty;
         } catch (oov var5) {
            boolean var11 = false;
            throw a(var5);
         }
      }

      if (var8 == var10001) {
         var3 |= 8;
      }

      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{vrr});
   }

   @Override
   public erg b4a(zfz var1) {
      return new erg(u7m.gfm(this), 1, 0);
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return super.qk_(var1, var2, var3, var4, var5, var6, var7, var8).zvi(vrr, var3.e30());
   }

   private static oov a(oov var0) {
      return var0;
   }
}
