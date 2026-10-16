import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cw1 extends g6r {
   public tf8 rhi;
   public tf8 mqk;
   public tf8 bpp;
   public tf8 ah3;
   public tf8 _1u;
   public tf8 tan;
   public tf8 bsn;
   public tf8 _yu;
   public tf8 o4g;
   public tf8 nqp;
   public tf8 u0o;
   public tf8 z37;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public cw1() {
      long var1 = a ^ 69034778566766L;
      super();
      this.s1s = 0.0F;
      this.ep5 = 0.0F;
      this.o15(a<"h">(25089, 3944219189709294157L ^ var1), 0, 0);
      this.o15(a<"h">(22461, 7334352049107501043L ^ var1), 0, 24);
      this.o15(a<"h">(9134, 6671472506612485089L ^ var1), 0, 10);
      this.o15(a<"h">(32754, 5619434542810421183L ^ var1), 6, 10);
      this.rhi = new tf8(this, 26, 24);
      this.rhi.ge4(-1.0F, 5.5F, -3.7F, 2, 1, 7);
      this.rhi.i50(3.0F, 17.5F, 3.7F);
      this.rhi.hsi = true;
      this.cf6(this.rhi, 0.0F, 0.0F, 0.0F);
      this.mqk = new tf8(this, 8, 24);
      this.mqk.ge4(-1.0F, 5.5F, -3.7F, 2, 1, 7);
      this.mqk.i50(-3.0F, 17.5F, 3.7F);
      this.mqk.hsi = true;
      this.cf6(this.mqk, 0.0F, 0.0F, 0.0F);
      this.bpp = new tf8(this, 30, 15);
      this.bpp.ge4(-1.0F, 0.0F, 0.0F, 2, 4, 5);
      this.bpp.i50(3.0F, 17.5F, 3.7F);
      this.bpp.hsi = true;
      this.cf6(this.bpp, (float) (-Math.PI / 9), 0.0F, 0.0F);
      this.ah3 = new tf8(this, 16, 15);
      this.ah3.ge4(-1.0F, 0.0F, 0.0F, 2, 4, 5);
      this.ah3.i50(-3.0F, 17.5F, 3.7F);
      this.ah3.hsi = true;
      this.cf6(this.ah3, (float) (-Math.PI / 9), 0.0F, 0.0F);
      this._1u = new tf8(this, 0, 0);
      this._1u.ge4(-3.0F, -2.0F, -10.0F, 6, 5, 10);
      this._1u.i50(0.0F, 19.0F, 8.0F);
      this._1u.hsi = true;
      this.cf6(this._1u, (float) (-Math.PI / 9), 0.0F, 0.0F);
      this.tan = new tf8(this, 8, 15);
      this.tan.ge4(-1.0F, 0.0F, -1.0F, 2, 7, 2);
      this.tan.i50(3.0F, 17.0F, -1.0F);
      this.tan.hsi = true;
      this.cf6(this.tan, (float) (-Math.PI / 18), 0.0F, 0.0F);
      this.bsn = new tf8(this, 0, 15);
      this.bsn.ge4(-1.0F, 0.0F, -1.0F, 2, 7, 2);
      this.bsn.i50(-3.0F, 17.0F, -1.0F);
      this.bsn.hsi = true;
      this.cf6(this.bsn, (float) (-Math.PI / 18), 0.0F, 0.0F);
      this._yu = new tf8(this, 32, 0);
      this._yu.ge4(-2.5F, -4.0F, -5.0F, 5, 4, 5);
      this._yu.i50(0.0F, 16.0F, -1.0F);
      this._yu.hsi = true;
      this.cf6(this._yu, 0.0F, 0.0F, 0.0F);
      this.o4g = new tf8(this, 52, 0);
      this.o4g.ge4(-2.5F, -9.0F, -1.0F, 2, 5, 1);
      this.o4g.i50(0.0F, 16.0F, -1.0F);
      this.o4g.hsi = true;
      this.cf6(this.o4g, 0.0F, (float) (-Math.PI / 12), 0.0F);
      this.nqp = new tf8(this, 58, 0);
      this.nqp.ge4(0.5F, -9.0F, -1.0F, 2, 5, 1);
      this.nqp.i50(0.0F, 16.0F, -1.0F);
      this.nqp.hsi = true;
      this.cf6(this.nqp, 0.0F, (float) (Math.PI / 12), 0.0F);
      this.u0o = new tf8(this, 52, 6);
      this.u0o.ge4(-1.5F, -1.5F, 0.0F, 3, 3, 2);
      this.u0o.i50(0.0F, 20.0F, 7.0F);
      this.u0o.hsi = true;
      this.cf6(this.u0o, -0.3490659F, 0.0F, 0.0F);
      this.z37 = new tf8(this, 32, 9);
      this.z37.ge4(-0.5F, -2.5F, -5.5F, 1, 1, 1);
      this.z37.i50(0.0F, 16.0F, -1.0F);
      this.z37.hsi = true;
      this.cf6(this.z37, 0.0F, 0.0F, 0.0F);
   }

   private void cf6(tf8 var1, float var2, float var3, float var4) {
      var1.pod = var2;
      var1.r80 = var3;
      var1.oo7 = var4;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = t9d.c();

      cw1 var10000;
      label46: {
         label41: {
            try {
               this.ltd(var2, var3, var4, var5, var6, var7, var1);
               var10000 = this;
               if (var8 != 0) {
                  break label46;
               }

               if (!this._a0) {
                  break label41;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            float var9 = 2.0F;

            try {
               hzu.dp2();
               hzu.a4k(0.0F, 5.0F * var7, 2.0F * var7);
               this._yu.vca(var7);
               this.nqp.vca(var7);
               this.o4g.vca(var7);
               this.z37.vca(var7);
               hzu.x3w();
               hzu.dp2();
               hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
               hzu.a4k(0.0F, 24.0F * var7, 0.0F);
               this.rhi.vca(var7);
               this.mqk.vca(var7);
               this.bpp.vca(var7);
               this.ah3.vca(var7);
               this._1u.vca(var7);
               this.tan.vca(var7);
               this.bsn.vca(var7);
               this.u0o.vca(var7);
               hzu.x3w();
               if (var8 == 0) {
                  return;
               }
            } catch (oov var11) {
               boolean var10001 = false;
               throw a(var11);
            }
         }

         try {
            this.rhi.vca(var7);
            this.mqk.vca(var7);
            this.bpp.vca(var7);
            this.ah3.vca(var7);
            this._1u.vca(var7);
            this.tan.vca(var7);
            this.bsn.vca(var7);
            this._yu.vca(var7);
            this.o4g.vca(var7);
            this.nqp.vca(var7);
            this.u0o.vca(var7);
            var10000 = this;
         } catch (oov var10) {
            boolean var14 = false;
            throw a(var10);
         }
      }

      var10000.z37.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      float var8 = var3 - (float)var7.g25;
      kxi var9 = (kxi)var7;
      this.z37.pod = this._yu.pod = this.o4g.pod = this.nqp.pod = var5 * (float) (Math.PI / 180.0);
      this.z37.r80 = this._yu.r80 = var4 * (float) (Math.PI / 180.0);
      this.o4g.r80 = this.z37.r80 - (float) (Math.PI / 12);
      this.nqp.r80 = this.z37.r80 + (float) (Math.PI / 12);
      this.s1s = fe6.rtn(var9.wz4(var8) * (float) Math.PI);
      this.bpp.pod = this.ah3.pod = (this.s1s * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.rhi.pod = this.mqk.pod = this.s1s * 50.0F * (float) (Math.PI / 180.0);
      this.tan.pod = this.bsn.pod = (this.s1s * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
   }

   @Override
   public void v3g(g_3 var1, float var2, float var3, float var4) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8410751851838047478L, 7003250285507059612L, MethodHandles.lookup().lookupClass()).a(12430813482422L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 117557875924942L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u0010V\u0085`Ó8P\u000eÒcÕ§\u009cÈËãìH©ßa0ýB\u0018=Í\u0094TËÝGýo°sPÅ¥@zÚÀ³Îr o°";
      int var8 = "\u0010V\u0085`Ó8P\u000eÒcÕ§\u009cÈËãìH©ßa0ýB\u0018=Í\u0094TËÝGýo°sPÅ¥@zÚÀ³Îr o°".length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "sæ¿_;óÆÆsb±(5ïLÒ\u0088£\u0081\u000b1K\u0010{¢#\u0005Ô\u0015\u0006\ba\u0018Ó\u0096\u0090\u0094ËU\u0080\u0089\bñp\u000fg¿¢¹v\u0004\u009aPÈÀZä";
                  var8 = "sæ¿_;óÆÆsb±(5ïLÒ\u0088£\u0081\u000b1K\u0010{¢#\u0005Ô\u0015\u0006\ba\u0018Ó\u0096\u0090\u0094ËU\u0080\u0089\bñp\u000fg¿¢¹v\u0004\u009aPÈÀZä"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27220;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cw1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cw1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
