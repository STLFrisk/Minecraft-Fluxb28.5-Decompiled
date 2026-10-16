package net.minecraft.tileentity;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TileEntitySign$1 implements e7r {
   public final TileEntitySign sk1;
   private static final long a;
   private static final String b;

   public TileEntitySign$1(TileEntitySign var1) {
      this.sk1 = var1;
   }

   @Override
   public String noc() {
      long var1 = a ^ 86041410134290L;
      return b;
   }

   @Override
   public ekw xyw() {
      return new tao(this.noc());
   }

   @Override
   public void a0d(ekw var1) {
   }

   @Override
   public boolean ge4(int var1, String var2) {
      return true;
   }

   @Override
   public mew d3d() {
      return this.sk1.al2;
   }

   @Override
   public fqr i15() {
      return new fqr((double)this.sk1.al2.getX() + 0.5, (double)this.sk1.al2.getY() + 0.5, (double)this.sk1.al2.getZ() + 0.5);
   }

   @Override
   public OpaquePredicate qha() {
      return this.sk1.yh_;
   }

   @Override
   public EntityLivingBase zyd() {
      return null;
   }

   @Override
   public boolean ofq() {
      return false;
   }

   @Override
   public void io9(n_k$pbp var1, int var2) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(91508516605335260L, -4987247069099426490L, MethodHandles.lookup().lookupClass()).a(91916305699292L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 13745144020199L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Qì\u0092bø\u0091¿7".getBytes("ISO-8859-1"));
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
