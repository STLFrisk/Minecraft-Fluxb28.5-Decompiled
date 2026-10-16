package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class S2BPacketChangeGameState implements mz2 {
   public static final String[] t56;

   public S2BPacketChangeGameState() {
   }

   public S2BPacketChangeGameState(int var1, float var2) {
      this.ibl = var1;
      this.tio = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.ibl = var1.readUnsignedByte();
      this.tio = var1.readFloat();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.ibl);
      var1.writeFloat(this.tio);
   }

   public void d69(jsv var1) {
      var1.fq1(this);
   }

   public int f50() {
      return this.ibl;
   }

   public float xs5() {
      return this.tio;
   }

   @Override
   public void ito(yw3 var1) {
      this.d69((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9039536855359767880L, 1710638279518247252L, MethodHandles.lookup().lookupClass()).a(260360826512961L);
      // $VF: monitorexit
      long var4 = var10000 ^ 121357052887043L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0088Ê~\u001f\u0095À\u009b\u001dK\u0086ëa$ü\u0018{µ°:Ø*zúà".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      t56 = new String[]{var0};
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
