import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityBeacon$yv7;
import net.optifine.shaders.Shaders;
import org.lwjgl.opengl.GL11;

public class nah extends q9h {
   private static final gdz jhk;

   public void njz(TileEntityBeacon var1, double var2, double var4, double var6, float var8, int var9) {
      int var10 = t9d.c();
      float var11 = var1.ywb();

      int var10000;
      label74: {
         try {
            double var70;
            var10000 = (var70 = (double)var11 - 0.0) == 0.0 ? 0 : (var70 < 0.0 ? -1 : 1);
            if (var10 != 0) {
               break label74;
            }

            if (var10000 <= 0) {
               return;
            }
         } catch (oov var57) {
            throw a(var57);
         }

         var10000 = hxt.ly3();
      }

      label66: {
         label65: {
            try {
               if (var10 != 0) {
                  break label66;
               }

               if (var10000 == 0) {
                  break label65;
               }
            } catch (oov var56) {
               throw a(var56);
            }

            Shaders.beginBeacon();
         }

         hzu.fak(516, 0.1F);
         float var71;
         var10000 = (var71 = var11 - 0.0F) == 0.0F ? 0 : (var71 < 0.0F ? -1 : 1);
      }

      label57: {
         label80: {
            try {
               if (var10 != 0) {
                  break label57;
               }

               if (var10000 <= 0) {
                  break label80;
               }
            } catch (oov var55) {
               throw a(var55);
            }

            jom var12 = jom.yut();
            q3g var13 = var12.zuq();
            hzu.gcp();
            List var14 = var1.tsd();
            int var15 = 0;
            int var16 = 0;

            while (var16 < var14.size()) {
               TileEntityBeacon$yv7 var17 = (TileEntityBeacon$yv7)var14.get(var16);
               int var18 = var15 + var17.x8n();
               this.g3j(jhk);
               GL11.glTexParameterf(3553, 10242, 10497.0F);
               GL11.glTexParameterf(3553, 10243, 10497.0F);
               hzu.fpt();
               hzu.o1b();
               hzu.ux6();
               hzu.jun(true);
               hzu.u39(770, 1, 1, 0);
               double var19 = (double)var1.yi7().p2b() + (double)var8;
               double var21 = fe6.cnn(-var19 * 0.2 - (double)fe6.jqf(-var19 * 0.1));
               float var23 = var17.tow()[0];
               float var24 = var17.tow()[1];
               float var25 = var17.tow()[2];
               double var26 = var19 * 0.025 * -1.5;
               double var28 = 0.2;
               double var30 = 0.5 + Math.cos(var26 + (Math.PI * 3.0 / 4.0)) * 0.2;
               double var32 = 0.5 + Math.sin(var26 + (Math.PI * 3.0 / 4.0)) * 0.2;
               double var34 = 0.5 + Math.cos(var26 + (Math.PI / 4)) * 0.2;
               double var36 = 0.5 + Math.sin(var26 + (Math.PI / 4)) * 0.2;
               double var38 = 0.5 + Math.cos(var26 + (Math.PI * 5.0 / 4.0)) * 0.2;
               double var40 = 0.5 + Math.sin(var26 + (Math.PI * 5.0 / 4.0)) * 0.2;
               double var42 = 0.5 + Math.cos(var26 + (Math.PI * 7.0 / 4.0)) * 0.2;
               double var44 = 0.5 + Math.sin(var26 + (Math.PI * 7.0 / 4.0)) * 0.2;
               double var46 = 0.0;
               double var48 = 1.0;
               double var50 = -1.0 + var21;
               double var52 = (double)((float)var17.x8n() * var11) * 2.5 + var50;
               var13.ezr(7, gnl.rad);
               var13.g5o(var2 + var30, var4 + (double)var18, var6 + var32).h0a(1.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var30, var4 + (double)var15, var6 + var32).h0a(1.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var34, var4 + (double)var15, var6 + var36).h0a(0.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var34, var4 + (double)var18, var6 + var36).h0a(0.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var42, var4 + (double)var18, var6 + var44).h0a(1.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var42, var4 + (double)var15, var6 + var44).h0a(1.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var38, var4 + (double)var15, var6 + var40).h0a(0.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var38, var4 + (double)var18, var6 + var40).h0a(0.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var34, var4 + (double)var18, var6 + var36).h0a(1.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var34, var4 + (double)var15, var6 + var36).h0a(1.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var42, var4 + (double)var15, var6 + var44).h0a(0.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var42, var4 + (double)var18, var6 + var44).h0a(0.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var38, var4 + (double)var18, var6 + var40).h0a(1.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var38, var4 + (double)var15, var6 + var40).h0a(1.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var30, var4 + (double)var15, var6 + var32).h0a(0.0, var50).gs4(var23, var24, var25, 1.0F).pzw();
               var13.g5o(var2 + var30, var4 + (double)var18, var6 + var32).h0a(0.0, var52).gs4(var23, var24, var25, 1.0F).pzw();
               var12.q7g();
               hzu.spd();
               hzu.u39(770, 771, 1, 0);
               hzu.jun(false);
               var26 = 0.2;
               var28 = 0.2;
               var30 = 0.8;
               var32 = 0.2;
               var34 = 0.2;
               var36 = 0.8;
               var38 = 0.8;
               var40 = 0.8;
               var42 = 0.0;
               var44 = 1.0;
               var46 = -1.0 + var21;
               var48 = (double)((float)var17.x8n() * var11) + var46;
               var13.ezr(7, gnl.rad);
               var13.g5o(var2 + 0.2, var4 + (double)var18, var6 + 0.2).h0a(1.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var15, var6 + 0.2).h0a(1.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var15, var6 + 0.2).h0a(0.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var18, var6 + 0.2).h0a(0.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var18, var6 + 0.8).h0a(1.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var15, var6 + 0.8).h0a(1.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var15, var6 + 0.8).h0a(0.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var18, var6 + 0.8).h0a(0.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var18, var6 + 0.2).h0a(1.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var15, var6 + 0.2).h0a(1.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var15, var6 + 0.8).h0a(0.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.8, var4 + (double)var18, var6 + 0.8).h0a(0.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var18, var6 + 0.8).h0a(1.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var15, var6 + 0.8).h0a(1.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var15, var6 + 0.2).h0a(0.0, var46).gs4(var23, var24, var25, 0.125F).pzw();
               var13.g5o(var2 + 0.2, var4 + (double)var18, var6 + 0.2).h0a(0.0, var48).gs4(var23, var24, var25, 0.125F).pzw();
               var12.q7g();
               hzu.s7q();
               hzu.rqj();
               hzu.jun(true);
               var15 = var18;

               try {
                  var16++;
                  if (var10 != 0) {
                     break label80;
                  }

                  if (var10 != 0) {
                     break;
                  }
               } catch (oov var54) {
                  throw a(var54);
               }
            }

            hzu.xmh();
         }

         var10000 = hxt.ly3();
      }

      if (var10000 != 0) {
         Shaders.endBeacon();
      }
   }

   @Override
   public boolean ts0() {
      return true;
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.njz((TileEntityBeacon)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3763055782218716154L, 8325267147302399074L, MethodHandles.lookup().lookupClass()).a(172972780703656L);
      // $VF: monitorexit
      long var4 = var10000 ^ 138331659964369L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0089×#\u0082R;ÂSÂ¦-¨\u0090öhÞèþËû\u0004\f\u0090¿[\u0017\"/R:E\u0093".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      jhk = new gdz(var0);
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
