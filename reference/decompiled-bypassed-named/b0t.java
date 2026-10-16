import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b0t {
   public static final gdz yby;
   public static final gdz p24;
   public static final gdz rt2;
   public float o3s;

   public void yaj(int var1, int var2, int var3, int var4) {
      int var5 = OpaquePredicate.b();

      int var10000;
      label21: {
         label20: {
            try {
               var10000 = var2;
               if (var5 == 0) {
                  break label21;
               }

               if (var2 >= var1) {
                  break label20;
               }
            } catch (oov var7) {
               throw b(var7);
            }

            int var6 = var1;
            var1 = var2;
            var2 = var6;
         }

         var10000 = var1;
      }

      df9((float)var10000, (float)var3, (float)(var2 + 1), (float)(var3 + 1), var4);
   }

   public void x3f(int var1, int var2, int var3, int var4) {
      int var5 = OpaquePredicate.b();

      int var10000;
      label21: {
         label20: {
            try {
               var10000 = var3;
               if (var5 == 0) {
                  break label21;
               }

               if (var3 >= var2) {
                  break label20;
               }
            } catch (oov var7) {
               throw b(var7);
            }

            int var6 = var2;
            var2 = var3;
            var3 = var6;
         }

         var10000 = var1;
      }

      df9((float)var10000, (float)(var2 + 1), (float)(var1 + 1), (float)var3, var4);
   }

   public static void df9(float var0, float var1, float var2, float var3, int var4) {
      int var5 = OpaquePredicate.c();

      int var10000;
      label37: {
         label36: {
            try {
               float var16;
               var10000 = (var16 = var0 - var2) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
               if (var5 != 0) {
                  break label37;
               }

               if (var10000 >= 0) {
                  break label36;
               }
            } catch (oov var13) {
               throw b(var13);
            }

            float var6 = var0;
            var0 = var2;
            var2 = var6;
         }

         float var17;
         var10000 = (var17 = var1 - var3) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
      }

      label28: {
         label27: {
            try {
               if (var5 != 0) {
                  break label28;
               }

               if (var10000 >= 0) {
                  break label27;
               }
            } catch (oov var12) {
               throw b(var12);
            }

            float var14 = var1;
            var1 = var3;
            var3 = var14;
         }

         var10000 = var4 >> 24 & 0xFF;
      }

      float var15 = (float)var10000 / 255.0F;
      float var7 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var4 & 0xFF) / 255.0F;
      jom var10 = jom.yut();
      q3g var11 = var10.zuq();
      hzu.spd();
      hzu.m_1();
      hzu.u39(770, 771, 1, 0);
      hzu.wn0(var7, var8, var9, var15);
      var11.ezr(7, gnl.gx3);
      var11.g5o((double)var0, (double)var3, 0.0).pzw();
      var11.g5o((double)var2, (double)var3, 0.0).pzw();
      var11.g5o((double)var2, (double)var1, 0.0).pzw();
      var11.g5o((double)var0, (double)var1, 0.0).pzw();
      var10.q7g();
      hzu.rqj();
      hzu.ux6();
   }

   public void flp(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var5 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var6 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var15 = jom.yut();
      q3g var16 = var15.zuq();
      var16.ezr(7, gnl.gec);
      var16.g5o((double)var3, (double)var2, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var2, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var4, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var16.g5o((double)var3, (double)var4, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var15.q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   public void ls_(float var1, float var2, float var3, float var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var5 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var6 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var15 = jom.yut();
      q3g var16 = var15.zuq();
      var16.ezr(7, gnl.gec);
      var16.g5o((double)var3, (double)var2, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var2, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var4, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var16.g5o((double)var3, (double)var4, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var15.q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   public void poi(owt var1, String var2, int var3, int var4, int var5) {
      var1.km1(var2, (float)(var3 - var1.ezt(var2) / 2), (float)var4, var5);
   }

   public void c_t(owt var1, String var2, int var3, int var4, int var5) {
      var1.km1(var2, (float)var3, (float)var4, var5);
   }

   public void mt4(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      jom var9 = jom.yut();
      q3g var10 = var9.zuq();
      var10.ezr(7, gnl._r5);
      var10.g5o((double)(var1 + 0), (double)(var2 + var6), (double)this.o3s)
         .h0a((double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8))
         .pzw();
      var10.g5o((double)(var1 + var5), (double)(var2 + var6), (double)this.o3s)
         .h0a((double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8))
         .pzw();
      var10.g5o((double)(var1 + var5), (double)(var2 + 0), (double)this.o3s)
         .h0a((double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8))
         .pzw();
      var10.g5o((double)(var1 + 0), (double)(var2 + 0), (double)this.o3s).h0a((double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8)).pzw();
      var9.q7g();
   }

   public void j7o(float var1, float var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      jom var9 = jom.yut();
      q3g var10 = var9.zuq();
      var10.ezr(7, gnl._r5);
      var10.g5o((double)(var1 + 0.0F), (double)(var2 + (float)var6), (double)this.o3s)
         .h0a((double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8))
         .pzw();
      var10.g5o((double)(var1 + (float)var5), (double)(var2 + (float)var6), (double)this.o3s)
         .h0a((double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8))
         .pzw();
      var10.g5o((double)(var1 + (float)var5), (double)(var2 + 0.0F), (double)this.o3s)
         .h0a((double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8))
         .pzw();
      var10.g5o((double)(var1 + 0.0F), (double)(var2 + 0.0F), (double)this.o3s)
         .h0a((double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8))
         .pzw();
      var9.q7g();
   }

   public void _29(int var1, int var2, sla var3, int var4, int var5) {
      jom var6 = jom.yut();
      q3g var7 = var6.zuq();
      var7.ezr(7, gnl._r5);
      var7.g5o((double)(var1 + 0), (double)(var2 + var5), (double)this.o3s).h0a((double)var3.l3u(), (double)var3.e8_()).pzw();
      var7.g5o((double)(var1 + var4), (double)(var2 + var5), (double)this.o3s).h0a((double)var3.w2b(), (double)var3.e8_()).pzw();
      var7.g5o((double)(var1 + var4), (double)(var2 + 0), (double)this.o3s).h0a((double)var3.w2b(), (double)var3.bhi()).pzw();
      var7.g5o((double)(var1 + 0), (double)(var2 + 0), (double)this.o3s).h0a((double)var3.l3u(), (double)var3.bhi()).pzw();
      var6.q7g();
   }

   public static void vfo(int var0, int var1, float var2, float var3, int var4, int var5, float var6, float var7) {
      float var8 = 1.0F / var6;
      float var9 = 1.0F / var7;
      jom var10 = jom.yut();
      q3g var11 = var10.zuq();
      var11.ezr(7, gnl._r5);
      var11.g5o((double)var0, (double)(var1 + var5), 0.0).h0a((double)(var2 * var8), (double)((var3 + (float)var5) * var9)).pzw();
      var11.g5o((double)(var0 + var4), (double)(var1 + var5), 0.0).h0a((double)((var2 + (float)var4) * var8), (double)((var3 + (float)var5) * var9)).pzw();
      var11.g5o((double)(var0 + var4), (double)var1, 0.0).h0a((double)((var2 + (float)var4) * var8), (double)(var3 * var9)).pzw();
      var11.g5o((double)var0, (double)var1, 0.0).h0a((double)(var2 * var8), (double)(var3 * var9)).pzw();
      var10.q7g();
   }

   public static void byz(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = 1.0F / var6;
      float var9 = 1.0F / var7;
      jom var10 = jom.yut();
      q3g var11 = var10.zuq();
      var11.ezr(7, gnl._r5);
      var11.g5o((double)var0, (double)(var1 + var5), 0.0).h0a((double)(var2 * var8), (double)((var3 + var5) * var9)).pzw();
      var11.g5o((double)(var0 + var4), (double)(var1 + var5), 0.0).h0a((double)((var2 + var4) * var8), (double)((var3 + var5) * var9)).pzw();
      var11.g5o((double)(var0 + var4), (double)var1, 0.0).h0a((double)((var2 + var4) * var8), (double)(var3 * var9)).pzw();
      var11.g5o((double)var0, (double)var1, 0.0).h0a((double)(var2 * var8), (double)(var3 * var9)).pzw();
      var10.q7g();
   }

   public static void oc3(float var0, float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9) {
      float var10 = 1.0F / var8;
      float var11 = 1.0F / var9;
      jom var12 = jom.yut();
      q3g var13 = var12.zuq();
      var13.ezr(7, gnl._r5);
      var13.g5o((double)var0, (double)(var1 + (float)var7), 0.0).h0a((double)(var2 * var10), (double)((var3 + (float)var5) * var11)).pzw();
      var13.g5o((double)(var0 + (float)var6), (double)(var1 + (float)var7), 0.0)
         .h0a((double)((var2 + (float)var4) * var10), (double)((var3 + (float)var5) * var11))
         .pzw();
      var13.g5o((double)(var0 + (float)var6), (double)var1, 0.0).h0a((double)((var2 + (float)var4) * var10), (double)(var3 * var11)).pzw();
      var13.g5o((double)var0, (double)var1, 0.0).h0a((double)(var2 * var10), (double)(var3 * var11)).pzw();
      var12.q7g();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4487797001734764875L, 6324518574576053292L, MethodHandles.lookup().lookupClass()).a(60856023376279L);
      // $VF: monitorexit
      long var10 = var10000 ^ 20875251997518L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "\f\u009a\u0083\u000f\u000f\u0014\u0000«\u000e\u0099%ÓÎs@qIÙ\u008c¾Ø+ö \u0097g7»\u008e½¤\u008exéEbs®·\u0091\u0018\f\u009a\u0083\u000f\u000f\u0014\u0000«ÛÍG\u001aö¶Gñ\u0084¤ÝNØ\b#[(\f\u009a\u0083\u000f\u000f\u0014\u0000«¦ ¡`\u0091«}\u0087û?g®@\u0006\u0019:a®{\u008b\u0083ÿ\u008cÌ\u0093é¶S%\u0097yf";
      int var7 = "\f\u009a\u0083\u000f\u000f\u0014\u0000«\u000e\u0099%ÓÎs@qIÙ\u008c¾Ø+ö \u0097g7»\u008e½¤\u008exéEbs®·\u0091\u0018\f\u009a\u0083\u000f\u000f\u0014\u0000«ÛÍG\u001aö¶Gñ\u0084¤ÝNØ\b#[(\f\u009a\u0083\u000f\u000f\u0014\u0000«¦ ¡`\u0091«}\u0087û?g®@\u0006\u0019:a®{\u008b\u0083ÿ\u008cÌ\u0093é¶S%\u0097yf"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            yby = new gdz(var8[2]);
            p24 = new gdz(var8[0]);
            rt2 = new gdz(var8[1]);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov b(oov var0) {
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
