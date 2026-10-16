import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f35 extends e0x {
   public static final zb_ q4f;

   public f35() {
      super(p3y.zs8, pmc$s6y.tms.fds());
      this.y8l(this._8_.c32().zvi(q4f, f35$vyc.q6a));
      this.i3l(uja.mqu);
   }

   @Override
   public int crg(zfz var1) {
      return ((f35$vyc)var1.dil(q4f)).zks();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      f35$vyc[] var5 = f35$vyc.values();
      int var10000 = OpaquePredicate.c();
      int var6 = var5.length;
      int var4 = var10000;
      int var7 = 0;

      while (var7 < var6) {
         f35$vyc var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.zks()));
         var7++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(q4f, f35$vyc.vmt(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((f35$vyc)var1.dil(q4f)).zks();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{q4f});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-696151611478616584L, -3925575640191264602L, MethodHandles.lookup().lookupClass()).a(177667696031725L);
      // $VF: monitorexit
      long var4 = var10000 ^ 101729793333892L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("æO×àý7QG".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      q4f = zb_.pq4(var0, f35$vyc.class);
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
