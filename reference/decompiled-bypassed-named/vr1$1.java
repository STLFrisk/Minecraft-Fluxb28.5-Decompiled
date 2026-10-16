import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vr1$1 implements sw6 {
   private long jdb;
   public final vr1 jn4;
   private static final long a;
   private static final String b;

   public vr1$1(vr1 var1) {
      this.jn4 = var1;
      this.jdb = System.currentTimeMillis();
   }

   @Override
   public void pg4(String var1) {
   }

   @Override
   public void qph(String var1) {
   }

   @Override
   public void e2w(int var1) {
      long var2 = a ^ 54417494548698L;

      try {
         if (System.currentTimeMillis() - this.jdb >= 1000L) {
            this.jdb = System.currentTimeMillis();
            vr1.k6q().info(b + var1 + "%");
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   @Override
   public void ij4() {
   }

   @Override
   public void an6(String var1) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1412744602370668480L, -8168016624110871113L, MethodHandles.lookup().lookupClass()).a(271484703349370L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 102969959153445L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0011§e\u0007ÏHºÏ\u001e2ÐÙßz \u0086".getBytes("ISO-8859-1"));
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
