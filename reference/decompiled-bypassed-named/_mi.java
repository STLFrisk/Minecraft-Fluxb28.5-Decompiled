import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _mi {
   public static final _mi[] ijo;
   public static final _mi _b5;
   public static final _mi g21;
   public static final _mi e0k;
   public static final _mi cjr;
   public static final _mi e38;
   public static final _mi w3f;
   public static final _mi niv;
   public static final _mi inj;
   public static final _mi e5e;
   public static final _mi qji;
   public static final _mi pzg;
   public static final _mi eo9;
   public static final _mi hvl;
   public static final _mi uwd;
   public static final _mi xxi;
   public static final _mi vbr;
   public static final _mi hkk;
   public static final _mi l7h;
   public static final _mi _qi;
   public static final _mi ipp;
   public static final _mi en2;
   public static final _mi qjf;
   public static final _mi v97;
   public static final _mi p8k;
   public static final _mi bzo;
   public static final _mi xyu;
   public static final _mi c36;
   public static final _mi oxf;
   public static final _mi v0s;
   public static final _mi xas;
   public static final _mi bm2;
   public static final _mi zfs;
   public static final _mi d8h;
   public static final _mi atg;
   public static final _mi _bd;
   public static final _mi l5z;
   public int eon;
   public final int bav;
   private static final long a;
   private static final String b;

   public int ghu(int var1) {
      int var2 = OpaquePredicate.b();
      short var3 = 220;

      int var10000;
      byte var10001;
      label67: {
         label66: {
            try {
               var10000 = var1;
               var10001 = 3;
               if (var2 == 0) {
                  break label67;
               }

               if (var1 != 3) {
                  break label66;
               }
            } catch (IndexOutOfBoundsException var10) {
               throw a(var10);
            }

            var3 = 135;
         }

         var10000 = var1;
         var10001 = 2;
      }

      label71: {
         label57: {
            label56: {
               try {
                  if (var2 == 0) {
                     break label57;
                  }

                  if (var10000 != var10001) {
                     break label56;
                  }
               } catch (IndexOutOfBoundsException var9) {
                  throw a(var9);
               }

               var3 = 255;
            }

            try {
               var10000 = var1;
               if (var2 == 0) {
                  break label71;
               }

               var10001 = 1;
            } catch (IndexOutOfBoundsException var8) {
               throw a(var8);
            }
         }

         if (var10000 == var10001) {
            var3 = 220;
         }

         var10000 = var1;
      }

      label44: {
         label43: {
            try {
               if (var2 == 0) {
                  break label44;
               }

               if (var10000 != 0) {
                  break label43;
               }
            } catch (IndexOutOfBoundsException var7) {
               throw a(var7);
            }

            var3 = 180;
         }

         var10000 = (this.eon >> 16 & 0xFF) * var3 / 255;
      }

      int var4 = var10000;
      int var5 = (this.eon >> 8 & 0xFF) * var3 / 255;
      int var6 = (this.eon & 0xFF) * var3 / 255;
      return 0xFF000000 | var4 << 16 | var5 << 8 | var6;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2565757287743061976L, -6547064256699060334L, MethodHandles.lookup().lookupClass()).a(13289520211362L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 46555575086920L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÙÛúî\u009bñìFù6\u0084\u009dïþv\u008cKsþÝ¸BÌ,\u0015\u000fÔìi¡U~°3h oåá\\\u0099\u007f.²£){û²\f§ úç¢þ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      ijo = new _mi[64];
      _b5 = new _mi(0, 0);
      g21 = new _mi(1, 8368696);
      e0k = new _mi(2, 16247203);
      cjr = new _mi(3, 13092807);
      e38 = new _mi(4, 16711680);
      w3f = new _mi(5, 10526975);
      niv = new _mi(6, 10987431);
      inj = new _mi(7, 31744);
      e5e = new _mi(8, 16777215);
      qji = new _mi(9, 10791096);
      pzg = new _mi(10, 9923917);
      eo9 = new _mi(11, 7368816);
      hvl = new _mi(12, 4210943);
      uwd = new _mi(13, 9402184);
      xxi = new _mi(14, 16776437);
      vbr = new _mi(15, 14188339);
      hkk = new _mi(16, 11685080);
      l7h = new _mi(17, 6724056);
      _qi = new _mi(18, 15066419);
      ipp = new _mi(19, 8375321);
      en2 = new _mi(20, 15892389);
      qjf = new _mi(21, 5000268);
      v97 = new _mi(22, 10066329);
      p8k = new _mi(23, 5013401);
      bzo = new _mi(24, 8339378);
      xyu = new _mi(25, 3361970);
      c36 = new _mi(26, 6704179);
      oxf = new _mi(27, 6717235);
      v0s = new _mi(28, 10040115);
      xas = new _mi(29, 1644825);
      bm2 = new _mi(30, 16445005);
      zfs = new _mi(31, 6085589);
      d8h = new _mi(32, 4882687);
      atg = new _mi(33, 55610);
      _bd = new _mi(34, 8476209);
      l5z = new _mi(35, 7340544);
   }

   private static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
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
}
