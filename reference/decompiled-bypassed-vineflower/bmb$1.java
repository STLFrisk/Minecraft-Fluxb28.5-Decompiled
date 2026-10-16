import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bmb$1 implements e7r {
   public final i2h qjs;
   public final e7r a63;
   public final mew mje;
   public final double s1d;
   public final double r6l;
   public final double uyd;
   public final bmb ign;
   private static final long a;
   private static final String b;

   public bmb$1(bmb var1, i2h var2, e7r var3, mew var4, double var5, double var7, double var9) {
      this.ign = var1;
      this.qjs = var2;
      this.a63 = var3;
      this.mje = var4;
      this.s1d = var5;
      this.r6l = var7;
      this.uyd = var9;
   }

   @Override
   public String noc() {
      return this.qjs.noc();
   }

   @Override
   public ekw xyw() {
      return this.qjs.xyw();
   }

   @Override
   public void a0d(ekw var1) {
      this.a63.a0d(var1);
   }

   @Override
   public boolean ge4(int var1, String var2) {
      return this.a63.ge4(var1, var2);
   }

   @Override
   public mew d3d() {
      return this.mje;
   }

   @Override
   public fqr i15() {
      return new fqr(this.s1d, this.r6l, this.uyd);
   }

   @Override
   public t9d qha() {
      return this.qjs.oay;
   }

   @Override
   public i2h zyd() {
      return this.qjs;
   }

   @Override
   public boolean ofq() {
      long var1 = a ^ 52313358678920L;
      int var3 = t9d.c();
      vr1 var4 = vr1._0v();

      vr1 var10000;
      label33: {
         try {
            var10000 = var4;
            if (var3 != 0) {
               break label33;
            }

            if (var4 == null) {
               return true;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10000 = var4;
      }

      try {
         boolean var7 = var10000.p_y[0].eir()._s0(b);
         if (var3 != 0) {
            return var7;
         }

         if (var7) {
            return true;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return false;
   }

   @Override
   public void io9(n_k$pbp var1, int var2) {
      this.qjs.io9(var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3842385926211280596L, -6830807711198574974L, MethodHandles.lookup().lookupClass()).a(250284456782047L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 22171169898821L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("à¥*V\u008fÇ_zOxÆ®)UPT1\b¼?´\u009bÔK".getBytes("ISO-8859-1"));
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
