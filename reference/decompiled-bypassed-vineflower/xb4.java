import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xb4 extends gmu {
   public static final gdz b32;

   public xb4(hr_ var1) {
      super(var1, new kz7(), 0.0F);
      xb4$1 var2 = new xb4$1(this, this);
      this.d4f(var2);
      this.d4f(new rr8(this));
      this.d4f(new mlv(this.fy4().wtl));
   }

   public gdz mx1(h67 var1) {
      return b32;
   }

   public kz7 fy4() {
      return (kz7)super.fy4();
   }

   public void c8f(h67 var1, float var2, float var3, float var4) {
      hzu.a2h(180.0F - var3, 0.0F, 1.0F, 0.0F);
   }

   public boolean fsf(h67 var1) {
      return var1.bpc();
   }

   @Override
   public boolean ia5(g_3 var1) {
      return this.fsf((h67)var1);
   }

   @Override
   public void ur9(g_3 var1, float var2, float var3, float var4) {
      this.c8f((h67)var1, var2, var3, var4);
   }

   @Override
   public g6r fy4() {
      return this.fy4();
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.mx1((h67)var1);
   }

   @Override
   public boolean daa(i2h var1) {
      return this.fsf((h67)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2347175934628341100L, 3883749906406230165L, MethodHandles.lookup().lookupClass()).a(106731053461819L);
      // $VF: monitorexit
      long var4 = var10000 ^ 3451558258337L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("u`ÜÃ±\u0007\u0096\u000b¯\u0099ÆQ\u0014(uÄü~Ç\u0018\u0090\u008d\u0007G\n,`BY\fÔ\u001f«¬\u009dÕWÁµÀ".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      b32 = new gdz(var0);
   }

   private static String c(byte[] var0) {
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
