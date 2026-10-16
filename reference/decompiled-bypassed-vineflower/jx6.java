import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jx6 extends e0x {
   public static final zb_ w29;
   private final e0x axz;

   public jx6(p3y var1, _mi var2, e0x var3) {
      super(var1, var2);
      this.y8l(this._8_.c32().zvi(w29, jx6$t6o.ize));
      this.axz = var3;
   }

   @Override
   public int bzr(Random var1) {
      return Math.max(0, var1.nextInt(10) - 7);
   }

   @Override
   public _mi uoz(zfz var1) {
      try {
         switch (jx6$1.t71[((jx6$t6o)var1.dil(w29)).ordinal()]) {
            case 1:
               return _mi.cjr;
            case 2:
               return _mi.e0k;
            case 3:
               return _mi.e0k;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return super.uoz(var1);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(this.axz);
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return u7m.gfm(this.axz);
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return this.l4i();
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(w29, jx6$t6o.ycn(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((jx6$t6o)var1.dil(w29)).ovk();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{w29});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3578066778797644011L, -2142488426568538725L, MethodHandles.lookup().lookupClass()).a(55393623165615L);
      // $VF: monitorexit
      long var4 = var10000 ^ 60522640900702L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("{\nºÇ^í¶¬".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      w29 = zb_.pq4(var0, jx6$t6o.class);
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
