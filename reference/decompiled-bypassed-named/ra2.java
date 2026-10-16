import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ra2 extends zg9 {
   public rsi rs1;

   public ra2(jnq var1, rsi var2) {
      super(new d9m(var1, var2));
      this.vfv = var1;
      this.rs1 = var2;
   }

   @Override
   public void qw3(int var1, int var2) {
      String var3 = this.rs1.xyw().rnh();
      this.fex.eh6(var3, (float)(this.poy / 2 - this.fex.ezt(var3) / 2), 6.0F, 4210752);
      this.fex.eh6(this.vfv.xyw().rnh(), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
   }

   @Override
   public void cft(float var1, int var2, int var3) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(q75);
      int var4 = (this.dt7 - this.poy) / 2;
      int var5 = (this.o1e - this.g6l) / 2;
      this.mt4(var4, var5, 0, 0, this.poy, this.g6l);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-561472058631995384L, -6974781564072481030L, MethodHandles.lookup().lookupClass()).a(118850940810831L);
      // $VF: monitorexit
      long var4 = var10000 ^ 24257477065616L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¿}\u001eõ¤\u0001ü\u0015v\u008fûãÖq½iï\u008aùû2í?]Kd#ë±}Ùº\u008eWsp\u0012]ñË".getBytes("ISO-8859-1"));
      String var7 = d(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      q75 = new gdz(var0);
   }

   private static String d(byte[] var0) {
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
