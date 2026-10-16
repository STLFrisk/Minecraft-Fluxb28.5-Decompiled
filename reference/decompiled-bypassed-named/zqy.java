import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class zqy extends liu {
   public zqy(hr_ var1) {
      super(var1);
   }

   public void cv0(hy9 var1, double var2, double var4, double var6, float var8, float var9) {
      this.sat(var1);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      int var10000 = OpaquePredicate.b();
      hzu.dp2();
      hzu.a4k((float)var2, (float)var4, (float)var6);
      hzu.a2h(var1.p3h + (var1.x5k - var1.p3h) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var1.j25 + (var1.y2i - var1.j25) * var9, 0.0F, 0.0F, 1.0F);
      jom var11 = jom.yut();
      q3g var12 = var11.zuq();
      byte var13 = 0;
      int var10 = var10000;
      float var14 = 0.0F;
      float var15 = 0.5F;
      float var16 = (float)(0 + var13 * 10) / 32.0F;
      float var17 = (float)(5 + var13 * 10) / 32.0F;
      float var18 = 0.0F;
      float var19 = 0.15625F;
      float var20 = (float)(5 + var13 * 10) / 32.0F;
      float var21 = (float)(10 + var13 * 10) / 32.0F;
      float var22 = 0.05625F;
      hzu.ixc();
      float var23 = (float)var1.db2 - var9;

      label39: {
         label38: {
            try {
               float var29;
               var10000 = (var29 = var23 - 0.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               if (var10 == 0) {
                  break label39;
               }

               if (var10000 <= 0) {
                  break label38;
               }
            } catch (oov var26) {
               throw a(var26);
            }

            float var24 = -fe6.rtn(var23 * 3.0F) * var23;
            hzu.a2h(var24, 0.0F, 0.0F, 1.0F);
         }

         hzu.a2h(45.0F, 1.0F, 0.0F, 0.0F);
         hzu.syc(var22, var22, var22);
         hzu.a4k(-4.0F, 0.0F, 0.0F);
         GL11.glNormal3f(var22, 0.0F, 0.0F);
         var12.ezr(7, gnl._r5);
         var12.g5o(-7.0, -2.0, -2.0).h0a((double)var18, (double)var20).pzw();
         var12.g5o(-7.0, -2.0, 2.0).h0a((double)var19, (double)var20).pzw();
         var12.g5o(-7.0, 2.0, 2.0).h0a((double)var19, (double)var21).pzw();
         var12.g5o(-7.0, 2.0, -2.0).h0a((double)var18, (double)var21).pzw();
         var11.q7g();
         GL11.glNormal3f(-var22, 0.0F, 0.0F);
         var12.ezr(7, gnl._r5);
         var12.g5o(-7.0, 2.0, -2.0).h0a((double)var18, (double)var20).pzw();
         var12.g5o(-7.0, 2.0, 2.0).h0a((double)var19, (double)var20).pzw();
         var12.g5o(-7.0, -2.0, 2.0).h0a((double)var19, (double)var21).pzw();
         var12.g5o(-7.0, -2.0, -2.0).h0a((double)var18, (double)var21).pzw();
         var11.q7g();
         var10000 = 0;
      }

      int var27 = var10000;

      while (true) {
         if (var27 < 4) {
            try {
               hzu.a2h(90.0F, 1.0F, 0.0F, 0.0F);
               GL11.glNormal3f(0.0F, 0.0F, var22);
               var12.ezr(7, gnl._r5);
               var12.g5o(-8.0, -2.0, 0.0).h0a((double)var14, (double)var16).pzw();
               var12.g5o(8.0, -2.0, 0.0).h0a((double)var15, (double)var16).pzw();
               var12.g5o(8.0, 2.0, 0.0).h0a((double)var15, (double)var17).pzw();
               var12.g5o(-8.0, 2.0, 0.0).h0a((double)var14, (double)var17).pzw();
               var11.q7g();
               var27++;
               if (var10 == 0) {
                  break;
               }

               if (var10 != 0) {
                  continue;
               }
            } catch (oov var25) {
               throw a(var25);
            }
         }

         hzu.eiq();
         hzu.x3w();
         super.apl(var1, var2, var4, var6, var8, var9);
         break;
      }
   }

   public gdz q79(hy9 var1) {
      return xth;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.q79((hy9)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.cv0((hy9)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1211806488265982195L, 2209301608801938843L, MethodHandles.lookup().lookupClass()).a(88997628009963L);
      // $VF: monitorexit
      long var4 = var10000 ^ 40902948689379L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("1\u009b\u0083V\u009e\u0007\u0002»¶pÆð\u0096\u0010$9}D\u008bZõ¤rV\u0001äâ\u0091z\r\u0097\u0093".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      xth = new gdz(var0);
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
