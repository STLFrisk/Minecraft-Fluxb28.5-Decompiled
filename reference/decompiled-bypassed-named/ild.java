import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.CustomColors;

public class ild extends liu {
   public ild(hr_ var1) {
      super(var1);
      this.o2u = 0.15F;
      this.xeb = 0.75F;
   }

   public void uf8(uno var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.dp2();
      hzu.a4k((float)var2, (float)var4, (float)var6);
      this.sat(var1);
      int var11 = var1.pan();
      float var12 = (float)(var11 % 4 * 16 + 0) / 64.0F;
      float var13 = (float)(var11 % 4 * 16 + 16) / 64.0F;
      int var10000 = OpaquePredicate.c();
      float var14 = (float)(var11 / 4 * 16 + 0) / 64.0F;
      float var15 = (float)(var11 / 4 * 16 + 16) / 64.0F;
      float var16 = 1.0F;
      float var17 = 0.5F;
      float var18 = 0.25F;
      int var19 = var1.azk(var9);
      int var20 = var19 % 65536;
      int var21 = var19 / 65536;
      gis.w9e(gis.exn, (float)var20 / 1.0F, (float)var21 / 1.0F);
      int var10 = var10000;
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      float var22 = 255.0F;
      float var23 = ((float)var1.bkh + var9) / 2.0F;

      label52: {
         label51: {
            try {
               boolean var36 = hxt.xe2();
               if (var10 != 0) {
                  break label52;
               }

               if (!var36) {
                  break label51;
               }
            } catch (oov var35) {
               throw a(var35);
            }

            var23 = CustomColors.getXpOrbTimer(var23);
         }

         var21 = (int)((fe6.rtn(var23 + 0.0F) + 1.0F) * 0.5F * 255.0F);
         short var37 = 255;
      }

      int var25 = (int)((fe6.rtn(var23 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      hzu.a2h(180.0F - this.l0g.s7e, 0.0F, 1.0F, 0.0F);
      hzu.a2h(-this.l0g.fw9, 1.0F, 0.0F, 0.0F);
      float var26 = 0.3F;
      hzu.syc(0.3F, 0.3F, 0.3F);
      jom var27 = jom.yut();
      q3g var28 = var27.zuq();
      var28.ezr(7, gnl.vql);
      int var29 = var21;
      int var30 = 255;
      int var31 = var25;

      label56: {
         try {
            if (var10 != 0) {
               return;
            }

            if (!hxt.xe2()) {
               break label56;
            }
         } catch (oov var34) {
            throw a(var34);
         }

         int var32 = CustomColors.getXpOrbColor(var23);

         try {
            if (var10 != 0) {
               return;
            }

            if (var32 < 0) {
               break label56;
            }
         } catch (oov var33) {
            throw a(var33);
         }

         var29 = var32 >> 16 & 0xFF;
         var30 = var32 >> 8 & 0xFF;
         var31 = var32 >> 0 & 0xFF;
      }

      var28.g5o((double)(0.0F - var17), (double)(0.0F - var18), 0.0)
         .h0a((double)var12, (double)var15)
         .fje(var29, var30, var31, 128)
         .h3y(0.0F, 1.0F, 0.0F)
         .pzw();
      var28.g5o((double)(var16 - var17), (double)(0.0F - var18), 0.0)
         .h0a((double)var13, (double)var15)
         .fje(var29, var30, var31, 128)
         .h3y(0.0F, 1.0F, 0.0F)
         .pzw();
      var28.g5o((double)(var16 - var17), (double)(1.0F - var18), 0.0)
         .h0a((double)var13, (double)var14)
         .fje(var29, var30, var31, 128)
         .h3y(0.0F, 1.0F, 0.0F)
         .pzw();
      var28.g5o((double)(0.0F - var17), (double)(1.0F - var18), 0.0)
         .h0a((double)var12, (double)var14)
         .fje(var29, var30, var31, 128)
         .h3y(0.0F, 1.0F, 0.0F)
         .pzw();
      var27.q7g();
      hzu.ux6();
      hzu.eiq();
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public gdz pjr(uno var1) {
      return kay;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.pjr((uno)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.uf8((uno)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4042770538190397688L, 8467230049380028506L, MethodHandles.lookup().lookupClass()).a(40342185140185L);
      // $VF: monitorexit
      long var4 = var10000 ^ 107611704075633L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("Âÿ\u0091\u0013âæ.,N4\u0083Mc*L]N±\u0084¦\u000eR!\u008e\u009dZ©gÔj\u008fB*Füü\n!Ò¬".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      kay = new gdz(var0);
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
