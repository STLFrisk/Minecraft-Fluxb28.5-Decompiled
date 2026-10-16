import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class poy$1 extends poy {
   private static final long b;
   private static final String f;

   @Override
   public syo qgs() {
      return null;
   }

   @Override
   public boolean thm() {
      return false;
   }

   @Override
   public boolean u4p() {
      return false;
   }

   @Override
   public boolean o_v() {
      return false;
   }

   @Override
   public boolean k9f() {
      return false;
   }

   @Override
   public boolean km2() {
      return false;
   }

   @Override
   public tgr d6b() {
      return null;
   }

   @Override
   public xq3 rmx() {
      return null;
   }

   @Override
   public String r7b() {
      return null;
   }

   @Override
   public poy vyb(syo var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy vtk(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy e53(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy iob(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy zqw(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy fb0(Boolean var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy bpc(tgr var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy zn_(xq3 var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public poy dn3(poy var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public String toString() {
      long var1 = b ^ 125277432703999L;
      return f;
   }

   @Override
   public poy esg() {
      return this;
   }

   @Override
   public poy ivs() {
      return this;
   }

   @Override
   public String tmo() {
      return "";
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-153778561295015345L, 5148147460282754689L, MethodHandles.lookup().lookupClass()).a(129228753127450L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 114287042314377L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Þ}\u0010êGk\u000f\u0099Ð\u0088¼OwQ_×".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
