import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class aby extends liu {
   private static final gdz aye;

   public aby(hr_ var1) {
      super(var1);
   }

   public void u7d(n0_ var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.dp2();
      hzu.hsv(var2, var4, var6);
      hzu.a2h(180.0F - var8, 0.0F, 1.0F, 0.0F);
      hzu.ixc();
      this.sat(var1);
      n0_$kmh var10 = var1.u16;
      float var11 = 0.0625F;
      hzu.syc(var11, var11, var11);
      this.bxs(var1, var10.ons, var10.zbf, var10.bol, var10.pe5);
      hzu.eiq();
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public gdz edr(n0_ var1) {
      return aye;
   }

   private void bxs(n0_ var1, int var2, int var3, int var4, int var5) {
      float var7 = (float)(-var2) / 2.0F;
      float var8 = (float)(-var3) / 2.0F;
      int var10000 = OpaquePredicate.b();
      float var9 = 0.5F;
      float var10 = 0.75F;
      float var11 = 0.8125F;
      float var12 = 0.0F;
      float var13 = 0.0625F;
      float var14 = 0.75F;
      float var15 = 0.8125F;
      int var6 = var10000;
      float var16 = 0.001953125F;
      float var17 = 0.001953125F;
      float var18 = 0.7519531F;
      float var19 = 0.7519531F;
      float var20 = 0.0F;
      float var21 = 0.0625F;
      int var22 = 0;

      while (var22 < var2 / 16) {
         int var23 = 0;

         while (true) {
            if (var23 < var3 / 16) {
               float var24 = var7 + (float)((var22 + 1) * 16);
               float var25 = var7 + (float)(var22 * 16);
               float var26 = var8 + (float)((var23 + 1) * 16);
               float var27 = var8 + (float)(var23 * 16);
               this.s3a(var1, (var24 + var25) / 2.0F, (var26 + var27) / 2.0F);
               float var28 = (float)(var4 + var2 - var22 * 16) / 256.0F;
               float var29 = (float)(var4 + var2 - (var22 + 1) * 16) / 256.0F;
               float var30 = (float)(var5 + var3 - var23 * 16) / 256.0F;
               float var31 = (float)(var5 + var3 - (var23 + 1) * 16) / 256.0F;
               jom var32 = jom.yut();
               q3g var33 = var32.zuq();

               try {
                  var33.ezr(7, gnl.c03);
                  var33.g5o((double)var24, (double)var27, (double)(-var9)).h0a((double)var29, (double)var30).h3y(0.0F, 0.0F, -1.0F).pzw();
                  var33.g5o((double)var25, (double)var27, (double)(-var9)).h0a((double)var28, (double)var30).h3y(0.0F, 0.0F, -1.0F).pzw();
                  var33.g5o((double)var25, (double)var26, (double)(-var9)).h0a((double)var28, (double)var31).h3y(0.0F, 0.0F, -1.0F).pzw();
                  var33.g5o((double)var24, (double)var26, (double)(-var9)).h0a((double)var29, (double)var31).h3y(0.0F, 0.0F, -1.0F).pzw();
                  var33.g5o((double)var24, (double)var26, (double)var9).h0a((double)var10, (double)var12).h3y(0.0F, 0.0F, 1.0F).pzw();
                  var33.g5o((double)var25, (double)var26, (double)var9).h0a((double)var11, (double)var12).h3y(0.0F, 0.0F, 1.0F).pzw();
                  var33.g5o((double)var25, (double)var27, (double)var9).h0a((double)var11, (double)var13).h3y(0.0F, 0.0F, 1.0F).pzw();
                  var33.g5o((double)var24, (double)var27, (double)var9).h0a((double)var10, (double)var13).h3y(0.0F, 0.0F, 1.0F).pzw();
                  var33.g5o((double)var24, (double)var26, (double)(-var9)).h0a((double)var14, (double)var16).h3y(0.0F, 1.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var26, (double)(-var9)).h0a((double)var15, (double)var16).h3y(0.0F, 1.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var26, (double)var9).h0a((double)var15, (double)var17).h3y(0.0F, 1.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var26, (double)var9).h0a((double)var14, (double)var17).h3y(0.0F, 1.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var27, (double)var9).h0a((double)var14, (double)var16).h3y(0.0F, -1.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var27, (double)var9).h0a((double)var15, (double)var16).h3y(0.0F, -1.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var27, (double)(-var9)).h0a((double)var15, (double)var17).h3y(0.0F, -1.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var27, (double)(-var9)).h0a((double)var14, (double)var17).h3y(0.0F, -1.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var26, (double)var9).h0a((double)var19, (double)var20).h3y(-1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var27, (double)var9).h0a((double)var19, (double)var21).h3y(-1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var27, (double)(-var9)).h0a((double)var18, (double)var21).h3y(-1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var24, (double)var26, (double)(-var9)).h0a((double)var18, (double)var20).h3y(-1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var26, (double)(-var9)).h0a((double)var19, (double)var20).h3y(1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var27, (double)(-var9)).h0a((double)var19, (double)var21).h3y(1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var27, (double)var9).h0a((double)var18, (double)var21).h3y(1.0F, 0.0F, 0.0F).pzw();
                  var33.g5o((double)var25, (double)var26, (double)var9).h0a((double)var18, (double)var20).h3y(1.0F, 0.0F, 0.0F).pzw();
                  var32.q7g();
                  var23++;
                  if (var6 == 0) {
                     break;
                  }

                  if (var6 != 0) {
                     continue;
                  }
               } catch (oov var34) {
                  throw a(var34);
               }
            }

            var22++;
            break;
         }

         if (var6 == 0) {
            break;
         }
      }
   }

   private void s3a(n0_ var1, float var2, float var3) {
      int var5 = fe6.jqf(var1.o2v);
      int var6 = fe6.jqf(var1.kfp + (double)(var3 / 16.0F));
      int var10000 = OpaquePredicate.c();
      int var7 = fe6.jqf(var1.vbd);
      vt2 var8 = var1.vv_;
      int var4 = var10000;

      vt2 var10001;
      label57: {
         label56: {
            try {
               var15 = var8;
               var10001 = vt2.z9q;
               if (var4 != 0) {
                  break label57;
               }

               if (var8 != vt2.z9q) {
                  break label56;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var5 = fe6.jqf(var1.o2v + (double)(var2 / 16.0F));
         }

         var15 = var8;
         var10001 = vt2.te4;
      }

      label48: {
         label47: {
            try {
               if (var4 != 0) {
                  break label48;
               }

               if (var15 != var10001) {
                  break label47;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var7 = fe6.jqf(var1.vbd - (double)(var2 / 16.0F));
         }

         var15 = var8;
         var10001 = vt2.mxp;
      }

      label39: {
         label38: {
            try {
               if (var4 != 0) {
                  break label39;
               }

               if (var15 != var10001) {
                  break label38;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            var5 = fe6.jqf(var1.o2v - (double)(var2 / 16.0F));
         }

         var15 = var8;
         var10001 = vt2.zk4;
      }

      if (var15 == var10001) {
         var7 = fe6.jqf(var1.vbd + (double)(var2 / 16.0F));
      }

      int var9 = this.l0g.kzr.getCombinedLight(new mew(var5, var6, var7), 0);
      int var10 = var9 % 65536;
      int var11 = var9 / 65536;
      gis.w9e(gis.exn, (float)var10, (float)var11);
      hzu.oxa(1.0F, 1.0F, 1.0F);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.edr((n0_)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.u7d((n0_)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7883152829296092361L, -5765452482038249375L, MethodHandles.lookup().lookupClass()).a(267450906376163L);
      // $VF: monitorexit
      long var4 = var10000 ^ 71571666187014L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "P\u0092\u0086ÑùÌ\u000eCÖ\\°¯ ¬\u001e¬\u0093ÕHÈOßÖ,\u0081Ä<×¸ú\u0013`\u0088O&\u008dë\u0019Ñ±ÑD}\u008dËQ6\u0012ÑåP\u00ada\u001fò¶"
            .getBytes("ISO-8859-1")
      );
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      aye = new gdz(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
