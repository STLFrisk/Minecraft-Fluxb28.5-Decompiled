import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum g_x$lo3 {
   public static final g_x$lo3 lbk;
   public static final g_x$lo3 t86;
   public static final g_x$lo3 yql;
   public static final g_x$lo3 ivg;
   public static final g_x$lo3 em2;
   public static final g_x$lo3 k4o;
   public final vt2[] uy6;
   public final float _8f;
   public final boolean kxr;
   public final g_x$pi5[] x6f;
   public final g_x$pi5[] jpu;
   public final g_x$pi5[] iot;
   public final g_x$pi5[] shb;
   private static final g_x$lo3[] zqu;
   private static final g_x$lo3[] oqf;

   private g_x$lo3(vt2[] var3, float var4, boolean var5, g_x$pi5[] var6, g_x$pi5[] var7, g_x$pi5[] var8, g_x$pi5[] var9) {
      this.uy6 = var3;
      this._8f = var4;
      this.kxr = var5;
      this.x6f = var6;
      this.jpu = var7;
      this.iot = var8;
      this.shb = var9;
   }

   public static g_x$lo3 cnv(vt2 var0) {
      return zqu[var0.c3s()];
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7391845622703677259L, -4106930306843922825L, MethodHandles.lookup().lookupClass()).a(199215380582696L);
      // $VF: monitorexit
      long var10 = var10000 ^ 50170214618931L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[6];
      int var6 = 0;
      String var5 = "\u009bBú°\u0017õI\u009d\b\u0086Ö\u0087xÇÅ\u0098%\b\rgí¯Û¶÷\u0093\bx¤\u009cCîþo²";
      int var7 = "\u009bBú°\u0017õI\u009d\b\u0086Ö\u0087xÇÅ\u0098%\b\rgí¯Û¶÷\u0093\bx¤\u009cCîþo²".length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     lbk = new g_x$lo3(
                        new vt2[]{vt2.te4, vt2.zk4, vt2.z9q, vt2.mxp}, 0.5F, false, new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0]
                     );
                     t86 = new g_x$lo3(
                        new vt2[]{vt2.zk4, vt2.te4, vt2.z9q, vt2.mxp}, 1.0F, false, new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0]
                     );
                     yql = new g_x$lo3(
                        new vt2[]{vt2.rf3, vt2.m3r, vt2.zk4, vt2.te4},
                        0.8F,
                        true,
                        new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.tbc, g_x$pi5.r4c, g_x$pi5.woi, g_x$pi5.wiv, g_x$pi5.woi, g_x$pi5.wiv, g_x$pi5.tbc},
                        new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5._g3, g_x$pi5.r4c, g_x$pi5.e80, g_x$pi5.wiv, g_x$pi5.e80, g_x$pi5.wiv, g_x$pi5._g3},
                        new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5._g3, g_x$pi5.wyb, g_x$pi5.e80, g_x$pi5.hxa, g_x$pi5.e80, g_x$pi5.hxa, g_x$pi5._g3},
                        new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.tbc, g_x$pi5.wyb, g_x$pi5.woi, g_x$pi5.hxa, g_x$pi5.woi, g_x$pi5.hxa, g_x$pi5.tbc}
                     );
                     ivg = new g_x$lo3(
                        new vt2[]{vt2.te4, vt2.zk4, vt2.m3r, vt2.rf3},
                        0.8F,
                        true,
                        new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.tbc, g_x$pi5.wiv, g_x$pi5.tbc, g_x$pi5.wiv, g_x$pi5.woi, g_x$pi5.r4c, g_x$pi5.woi},
                        new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.tbc, g_x$pi5.hxa, g_x$pi5.tbc, g_x$pi5.hxa, g_x$pi5.woi, g_x$pi5.wyb, g_x$pi5.woi},
                        new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5._g3, g_x$pi5.hxa, g_x$pi5._g3, g_x$pi5.hxa, g_x$pi5.e80, g_x$pi5.wyb, g_x$pi5.e80},
                        new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5._g3, g_x$pi5.wiv, g_x$pi5._g3, g_x$pi5.wiv, g_x$pi5.e80, g_x$pi5.r4c, g_x$pi5.e80}
                     );
                     em2 = new g_x$lo3(
                        new vt2[]{vt2.rf3, vt2.m3r, vt2.z9q, vt2.mxp},
                        0.6F,
                        true,
                        new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.up3, g_x$pi5.r4c, g_x$pi5.eqf, g_x$pi5.wiv, g_x$pi5.eqf, g_x$pi5.wiv, g_x$pi5.up3},
                        new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.qvp, g_x$pi5.r4c, g_x$pi5.m8h, g_x$pi5.wiv, g_x$pi5.m8h, g_x$pi5.wiv, g_x$pi5.qvp},
                        new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.qvp, g_x$pi5.wyb, g_x$pi5.m8h, g_x$pi5.hxa, g_x$pi5.m8h, g_x$pi5.hxa, g_x$pi5.qvp},
                        new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.up3, g_x$pi5.wyb, g_x$pi5.eqf, g_x$pi5.hxa, g_x$pi5.eqf, g_x$pi5.hxa, g_x$pi5.up3}
                     );
                     k4o = new g_x$lo3(
                        new vt2[]{vt2.m3r, vt2.rf3, vt2.z9q, vt2.mxp},
                        0.6F,
                        true,
                        new g_x$pi5[]{g_x$pi5.hxa, g_x$pi5.up3, g_x$pi5.hxa, g_x$pi5.eqf, g_x$pi5.wyb, g_x$pi5.eqf, g_x$pi5.wyb, g_x$pi5.up3},
                        new g_x$pi5[]{g_x$pi5.hxa, g_x$pi5.qvp, g_x$pi5.hxa, g_x$pi5.m8h, g_x$pi5.wyb, g_x$pi5.m8h, g_x$pi5.wyb, g_x$pi5.qvp},
                        new g_x$pi5[]{g_x$pi5.wiv, g_x$pi5.qvp, g_x$pi5.wiv, g_x$pi5.m8h, g_x$pi5.r4c, g_x$pi5.m8h, g_x$pi5.r4c, g_x$pi5.qvp},
                        new g_x$pi5[]{g_x$pi5.wiv, g_x$pi5.up3, g_x$pi5.wiv, g_x$pi5.eqf, g_x$pi5.r4c, g_x$pi5.eqf, g_x$pi5.r4c, g_x$pi5.up3}
                     );
                     oqf = new g_x$lo3[]{lbk, t86, yql, ivg, em2, k4o};
                     zqu = new g_x$lo3[6];
                     zqu[vt2.m3r.c3s()] = lbk;
                     zqu[vt2.rf3.c3s()] = t86;
                     zqu[vt2.z9q.c3s()] = yql;
                     zqu[vt2.mxp.c3s()] = ivg;
                     zqu[vt2.te4.c3s()] = em2;
                     zqu[vt2.zk4.c3s()] = k4o;
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "Ñì3,®×-æ\bÁ\u00804N¢Î\\s";
                  var7 = "Ñì3,®×-æ\bÁ\u00804N¢Î\\s".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
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
}
