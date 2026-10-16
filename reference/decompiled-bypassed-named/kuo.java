import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kuo extends e0x {
   public static final zb_ gp8;
   public static final int hu2;
   public static final int mp9;
   public static final int kdv;
   public static final int s3w;

   public kuo() {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(gp8, kuo$yh_.q8v));
      this.i3l(uja.mqu);
   }

   @Override
   public int crg(zfz var1) {
      return ((kuo$yh_)var1.dil(gp8)).yi5();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      kuo$yh_[] var5 = kuo$yh_.values();
      int var10000 = OpaquePredicate.c();
      int var6 = var5.length;
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6) {
         kuo$yh_ var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.yi5()));
         var7++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(gp8, kuo$yh_.p2f(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((kuo$yh_)var1.dil(gp8)).yi5();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{gp8});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8362247417777882175L, 8472790689735957466L, MethodHandles.lookup().lookupClass()).a(1324410437273L);
      // $VF: monitorexit
      long var4 = var10000 ^ 111872171386281L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("Ì(ù\u009at=A¿".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      gp8 = zb_.pq4(var0, kuo$yh_.class);
      hu2 = kuo$yh_.q8v.yi5();
      mp9 = kuo$yh_.ljm.yi5();
      kdv = kuo$yh_.hk4.yi5();
      s3w = kuo$yh_.ud9.yi5();
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
