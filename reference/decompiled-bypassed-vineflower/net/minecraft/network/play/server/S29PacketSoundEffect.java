package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.Validate;

public class S29PacketSoundEffect implements mz2 {
   private static final long a;
   private static final String b;

   public S29PacketSoundEffect() {
   }

   public S29PacketSoundEffect(String var1, double var2, double var4, double var6, float var8, float var9) {
      long var10 = a ^ 2850993713535L;
      super();
      this.x29 = Integer.MAX_VALUE;
      Validate.notNull(var1, b, new Object[0]);
      this.grq = var1;
      this.w3f = (int)(var2 * 8.0);
      this.x29 = (int)(var4 * 8.0);
      this.mx9 = (int)(var6 * 8.0);
      this.us_ = var8;
      this.cqq = (int)(var9 * 63.0F);
      var9 = fe6._f3(var9, 0.0F, 255.0F);
   }

   @Override
   public void ajj(nfj var1) {
      this.grq = var1.oa5(256);
      this.w3f = var1.readInt();
      this.x29 = var1.readInt();
      this.mx9 = var1.readInt();
      this.us_ = var1.readFloat();
      this.cqq = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.grq);
      var1.writeInt(this.w3f);
      var1.writeInt(this.x29);
      var1.writeInt(this.mx9);
      var1.writeFloat(this.us_);
      var1.writeByte(this.cqq);
   }

   public String lio() {
      return this.grq;
   }

   public double jxh() {
      return (double)((float)this.w3f / 8.0F);
   }

   public double gd3() {
      return (double)((float)this.x29 / 8.0F);
   }

   public double gjx() {
      return (double)((float)this.mx9 / 8.0F);
   }

   public float grx() {
      return this.us_;
   }

   public float nrl() {
      return (float)this.cqq / 63.0F;
   }

   public void l35(jsv var1) {
      var1.ouw(this);
   }

   @Override
   public void ito(yw3 var1) {
      this.l35((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-561823496135084072L, 6674596486420903731L, MethodHandles.lookup().lookupClass()).a(84316933503441L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 71135155999992L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Þ{×.ü?(â".getBytes("ISO-8859-1"));
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
