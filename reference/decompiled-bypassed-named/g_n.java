import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g_n extends ak9 {
   private static final long a;
   private static final String c;

   public g_n(nm6 var1, int var2, int var3) {
      long var4 = a ^ 121910447366166L;
      super(var1, var2, var3, "");
      this.vms = jvy.ypj;
      this.c1c = 1;
      this.bqh = c;
   }

   @Override
   public void g1p(int var1, int var2) {
      int var3 = OpaquePredicate.c();

      float var10000;
      float var10001;
      int var10002;
      int var10003;
      label39: {
         label38: {
            try {
               var10000 = (float)this.koa;
               var10001 = (float)this.mff;
               var10002 = this.vms;
               var10003 = this.loa.yg5;
               if (var3 != 0) {
                  break label39;
               }

               if (this.loa.yg5) {
                  break label38;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10003 = 0;
            break label39;
         }

         var10003 = jvy.ynu;
      }

      label30: {
         label29: {
            try {
               mkt.uk7(var10000, var10001, (float)(var10002 - var10003), 1.0F, jvy.ogc);
               var10000 = (float)(this.koa + 2);
               var10001 = (float)this.mff;
               var10002 = this.vms;
               var10003 = this.loa.yg5;
               if (var3 != 0) {
                  break label30;
               }

               if (this.loa.yg5) {
                  break label29;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10003 = 0;
            break label30;
         }

         var10003 = jvy.ynu;
      }

      mkt.uk7(var10000, var10001, (float)(var10002 - var10003 - 4), 1.0F, jvy.cnm);
   }

   @Override
   public void x6o(int var1, int var2, boolean var3) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2457090645631203079L, -220514657064197803L, MethodHandles.lookup().lookupClass()).a(254762766733433L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 93058426164581L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ó#ÿg¦Óµ\u0018\u0094¶2¥\u0011l7´".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      c = var6;
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
