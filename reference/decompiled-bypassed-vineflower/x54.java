import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x54 extends e0x {
   public static final zb_ ub7;

   public x54() {
      super(p3y.fdu);
      this.y8l(this._8_.c32().zvi(ub7, x54$lti.mdr));
      this.i3l(uja.mqu);
   }

   @Override
   public int crg(zfz var1) {
      return ((x54$lti)var1.dil(ub7)).h8z();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      x54$lti[] var5 = x54$lti.values();
      int var10000 = t9d.c();
      int var6 = var5.length;
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6) {
         x54$lti var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.h8z()));
         var7++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(ub7, x54$lti.mhp(var1));
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((x54$lti)var1.dil(ub7))._fn();
   }

   @Override
   public int hvp(zfz var1) {
      return ((x54$lti)var1.dil(ub7)).h8z();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{ub7});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3661474154620642278L, 6870703463150369469L, MethodHandles.lookup().lookupClass()).a(25867133969262L);
      // $VF: monitorexit
      long var4 = var10000 ^ 32516344585220L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u001a¥T¡'C,c".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      ub7 = zb_.pq4(var0, x54$lti.class);
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
