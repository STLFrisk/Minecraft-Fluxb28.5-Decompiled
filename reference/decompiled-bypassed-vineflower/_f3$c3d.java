import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _f3$c3d {
   public static final _f3$c3d g3j;
   public static final _f3$c3d bum;
   public static final _f3$c3d j2j;
   public static final _f3$c3d qut;
   public static final _f3$c3d bir;
   public static final _f3$c3d o4g;
   public static final _f3$c3d sfv;
   private static final Map leq;
   private final int q9c;
   private final String htg;
   private static final _f3$c3d[] vla;

   private _f3$c3d(int var3, String var4) {
      this.q9c = var3;
      this.htg = var4;
   }

   public int ydn() {
      return this.q9c;
   }

   public String eob() {
      return this.htg;
   }

   public static _f3$c3d ja1(int var0) {
      int var1 = t9d.b();
      _f3$c3d var2 = (_f3$c3d)leq.get(var0);

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 == null) {
            return g3j;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4647706949656548284L, 5121045512156551206L, MethodHandles.lookup().lookupClass()).a(197910225920246L);
      // $VF: monitorexit
      long var10 = var10000 ^ 78134112042316L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[14];
      int var6 = 0;
      String var5 = "\"\u008e:¹\u0093)%P\u009fÈAÍ\u000bÝ¢¨£LÏ\u0097\u0081\u0095\u001cù\u0010\"\u008e:¹\u0093)%P\u008eÇJ´\u009e#Þe\u0010J\u008c\u0081ðçÀ³êî\u0085FÏìfLü\b9\u0082Öç\u0080\u007f\u0015i\u0010¬Å\rA\u0015s0W+ÛV~,4\u007f½\b\u00955\" ¬DÊ]\u0010\"\u008e:¹\u0093)%PùË/È^\bb¯\u0010\"\u008e:¹\u0093)%P*\u0081\u0088\u008cG©ßl\b\u000eZ\u0098Ö?Ð\u001dá\u0010\"\u008e:¹\u0093)%PuY¬\u0001U±Æ!\bý¼ËKJäâç\u0018\"\u008e:¹\u0093)%Pðq\u001d Ó\u0014/LqN%CÄ\u008br¾";
      int var7 = "\"\u008e:¹\u0093)%P\u009fÈAÍ\u000bÝ¢¨£LÏ\u0097\u0081\u0095\u001cù\u0010\"\u008e:¹\u0093)%P\u008eÇJ´\u009e#Þe\u0010J\u008c\u0081ðçÀ³êî\u0085FÏìfLü\b9\u0082Öç\u0080\u007f\u0015i\u0010¬Å\rA\u0015s0W+ÛV~,4\u007f½\b\u00955\" ¬DÊ]\u0010\"\u008e:¹\u0093)%PùË/È^\bb¯\u0010\"\u008e:¹\u0093)%P*\u0081\u0088\u008cG©ßl\b\u000eZ\u0098Ö?Ð\u001dá\u0010\"\u008e:¹\u0093)%PuY¬\u0001U±Æ!\bý¼ËKJäâç\u0018\"\u008e:¹\u0093)%Pðq\u001d Ó\u0014/LqN%CÄ\u008br¾"
         .length();
      char var4 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var5.substring(++var17, var17 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var25;
                  if ((var17 += var4) >= var7) {
                     g3j = new _f3$c3d(0, var8[0]);
                     bum = new _f3$c3d(1, var8[1]);
                     j2j = new _f3$c3d(2, var8[7]);
                     qut = new _f3$c3d(3, var8[6]);
                     bir = new _f3$c3d(4, var8[9]);
                     o4g = new _f3$c3d(5, var8[12]);
                     sfv = new _f3$c3d(6, var8[11]);
                     vla = new _f3$c3d[]{g3j, bum, j2j, qut, bir, o4g, sfv};
                     leq = Maps.newHashMap();

                     for (_f3$c3d var15 : values()) {
                        leq.put(var15.ydn(), var15);
                     }

                     return;
                  }

                  var4 = var5.charAt(var17);
                  break;
               default:
                  var8[var6++] = var25;
                  if ((var17 += var4) < var7) {
                     var4 = var5.charAt(var17);
                     continue label37;
                  }

                  var5 = "\"\u008e:¹\u0093)%P;@\u009d`\u009a\u0098\u008c\u0095\b\u000f¿Âã¨¹e.";
                  var7 = "\"\u008e:¹\u0093)%P;@\u009d`\u009a\u0098\u008c\u0095\b\u000f¿Âã¨¹e.".length();
                  var4 = 16;
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
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
}
