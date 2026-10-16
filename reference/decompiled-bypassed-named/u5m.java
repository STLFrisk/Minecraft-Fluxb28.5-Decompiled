import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class u5m extends rrw {
   public zb_ lqx;
   private static final long b;
   private static final String d;

   public u5m() {
      this.y8l(this._8_.c32().zvi(this.h9e(), this.oj4() == u5m$bad.zvf ? u5m$cco.gye : u5m$cco.r1p));
   }

   @Override
   public int crg(zfz var1) {
      return ((u5m$cco)var1.dil(this.h9e())).uzp();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      u5m$cco[] var5 = u5m$cco.gp1(this.oj4());
      int var10000 = OpaquePredicate.c();
      int var6 = var5.length;
      int var4 = var10000;
      int var7 = 0;

      while (var7 < var6) {
         u5m$cco var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.uzp()));
         var7++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(this.h9e(), u5m$cco.ndf(this.oj4(), var1));
   }

   public abstract u5m$bad oj4();

   public xny h9e() {
      long var1 = b ^ 94565873918428L;

      try {
         if (this.lqx == null) {
            this.lqx = zb_._m6(d, u5m$cco.class, new u5m$1(this));
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return this.lqx;
   }

   @Override
   public int hvp(zfz var1) {
      return ((u5m$cco)var1.dil(this.h9e())).uzp();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{this.h9e()});
   }

   @Override
   public e0x$hep jkr() {
      return e0x$hep.xah;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3425272793300509159L, -9148838401553874878L, MethodHandles.lookup().lookupClass()).a(177767076113209L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 49658393335373L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¹VÏ\u0088\u000b@GG".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      d = var6;
   }

   private static oov a(oov var0) {
      return var0;
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
