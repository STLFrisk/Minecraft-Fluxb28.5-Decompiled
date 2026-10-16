import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class HwidProvider {
   private String njx;
   private String ahx;
   private String[] mc0;
   public Minecraft rpq = Minecraft.vz1();
   private static final long b;
   private static final String c;

   public HwidProvider() {
      this.njx = this.getClass().getAnnotation(dr9$x0j.class).t2u();
      this.ahx = this.getClass().getAnnotation(dr9$x0j.class).hjc();
      this.mc0 = this.getClass().getAnnotation(dr9$x0j.class).io4();
   }

   public final String k1_() {
      return this.njx;
   }

   public final String clg() {
      return this.ahx;
   }

   public final String[] ndm() {
      return this.mc0;
   }

   public final void dhs() {
      long var1 = b ^ 123144400256698L;
      ncl.dob(syo.aez + c + syo.w29 + this.if3());
   }

   public native String if3();

   public abstract void xjl(String[] var1);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2354868411404917480L, 4159089223148394755L, MethodHandles.lookup().lookupClass()).a(59627916757250L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 69838312686171L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("vöbbòw¿\u0013\u0088çíf#Î\u0087@mýce\"ßÐà".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
      NativeLoader.verifyIntegrity(4);
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
