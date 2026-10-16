import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class t57 implements e7r {
   private static final t57 b39;
   private StringBuffer qkj = new StringBuffer();
   private static final long a;
   private static final String b;

   @Override
   public String noc() {
      long var1 = a ^ 96924065381645L;
      return b;
   }

   @Override
   public ekw xyw() {
      return new tao(this.noc());
   }

   @Override
   public void a0d(ekw var1) {
      this.qkj.append(var1.rnh());
   }

   @Override
   public boolean ge4(int var1, String var2) {
      return true;
   }

   @Override
   public mew d3d() {
      return new mew(0, 0, 0);
   }

   @Override
   public fqr i15() {
      return new fqr(0.0, 0.0, 0.0);
   }

   @Override
   public OpaquePredicate qha() {
      return vr1._0v().qha();
   }

   @Override
   public EntityLivingBase zyd() {
      return null;
   }

   @Override
   public boolean ofq() {
      return true;
   }

   @Override
   public void io9(n_k$pbp var1, int var2) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-644669601066127776L, 8022116247099232532L, MethodHandles.lookup().lookupClass()).a(210930063837638L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51806942822393L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¿OÕ\t[ßã\u0017".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      b39 = new t57();
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
