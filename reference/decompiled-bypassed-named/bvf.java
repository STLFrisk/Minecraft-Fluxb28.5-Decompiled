import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bvf {
   private static final long a;
   private static final String b;

   public bvf(int var1, e0x var2) {
      this(3, var1, var2);
   }

   public bvf(int var1, int var2, e0x var3) {
      this.iym = var1;
      this.nrf = var2;
      this.x_w = var3.l4i();
   }

   public bvf(int var1, int var2, e0x var3, int var4) {
      this(var1, var2, var3);
      this.x_w = var3.kig(var4);
   }

   public int pyz() {
      return this.nrf;
   }

   public zfz see() {
      return this.x_w;
   }

   private e0x v_h() {
      return this.x_w.r_y();
   }

   private int g2o() {
      return this.x_w.r_y().hvp(this.x_w);
   }

   public int b_3() {
      return this.r0w;
   }

   public void a7o(int var1) {
      this.r0w = var1;
   }

   @Override
   public String toString() {
      long var1 = a ^ 17670956613648L;
      String var3;
      if (this.iym >= 3) {
         gdz var4 = (gdz)e0x.db8.csx(this.v_h());

         String var10000;
         label29: {
            try {
               if (var4 == null) {
                  var10000 = b;
                  break label29;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10000 = var4.toString();
         }

         var3 = var10000;
         if (this.nrf > 1) {
            var3 = this.nrf + "*" + var3;
         }
      } else {
         var3 = Integer.toString(e0x.mxb(this.v_h()));
         if (this.nrf > 1) {
            var3 = this.nrf + "x" + var3;
         }
      }

      int var6 = this.g2o();
      if (var6 > 0) {
         var3 = var3 + ":" + var6;
      }

      return var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-744137026137023733L, -4816370056865871603L, MethodHandles.lookup().lookupClass()).a(145929199673692L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 79662950298517L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÛEº\u0002Ì\u001aDë".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
