package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class S48PacketResourcePackSend implements mz2 {
   private static final long a;
   private static final String b;

   public S48PacketResourcePackSend() {
   }

   public S48PacketResourcePackSend(String var1, String var2) {
      long var3 = a ^ 99038554476989L;
      super();
      this.lwa = var1;
      this.gdk = var2;
      if (var2.length() > 40) {
         throw new IllegalArgumentException(b + var2.length() + ")");
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.lwa = var1.oa5(32767);
      this.gdk = var1.oa5(40);
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.lwa);
      var1.p3z(this.gdk);
   }

   public void e01(jsv var1) {
      var1.ei2(this);
   }

   public String ota() {
      return this.lwa;
   }

   public String noh() {
      return this.gdk;
   }

   @Override
   public void ito(yw3 var1) {
      this.e01((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2368077774795186201L, 6601238378143173418L, MethodHandles.lookup().lookupClass()).a(123881363265424L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 53963403039467L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ä\u0090©\u0095H%RMTík\nÔ]Õ¬ñL\u0010áÆÁïCM\u0007F\fÎp·r".getBytes("ISO-8859-1"));
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
