import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.lang.invoke.MethodHandles;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rh0 {
   private final String f51;
   private final String d4b;
   private final String vya;
   private final rh0$dzx si7;
   private static final long a;
   private static final String b;

   public rh0(String var1, String var2, String var3, String var4) {
      this.f51 = var1;
      this.d4b = var2;
      this.vya = var3;
      this.si7 = rh0$dzx.jha(var4);
   }

   public String ykf() {
      long var1 = a ^ 21076713664841L;
      return b + this.vya + ":" + this.d4b;
   }

   public String ysa() {
      return this.d4b;
   }

   public String z2u() {
      return this.f51;
   }

   public String au6() {
      return this.vya;
   }

   public GameProfile ghh() {
      try {
         UUID var1 = UUIDTypeAdapter.fromString(this.ysa());
         return new GameProfile(var1, this.z2u());
      } catch (IllegalArgumentException var2) {
         return new GameProfile((UUID)null, this.z2u());
      }
   }

   public rh0$dzx hlp() {
      return this.si7;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1282841594876623447L, -6470210599416129734L, MethodHandles.lookup().lookupClass()).a(84778741603849L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 116065963316699L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ry§d±W\u008a ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
