import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v3i$4 implements Callable {
   public final eka bi8;
   public final v3i gn2;
   private static final long a;
   private static final String b;

   public v3i$4(v3i var1, eka var2) {
      this.gn2 = var1;
      this.bi8 = var2;
   }

   public String call() {
      long var1 = a ^ 90738315524209L;
      return String.format(b, this.bi8.x05(), this.bi8.lrx(), v3i.m3l(this.gn2).pfr, v3i.m3l(this.gn2).ry7, this.bi8._0s());
   }

   @Override
   public Object call() {
      return this.call();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3487229819630100075L, 3744954280929986135L, MethodHandles.lookup().lookupClass()).a(235913480363362L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 28823283761461L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\"!à}$õ\u0082\u0016#3±Iêö\u0000\u008føy>\u0086¯\u0017o¹\u0007\u0019rG¸a³ø\u0017äw\u00053¬±!c\u00aduAm%\u009ax+¢tz\u000e*³E\u0095L`?Ç\u0017h\f"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
