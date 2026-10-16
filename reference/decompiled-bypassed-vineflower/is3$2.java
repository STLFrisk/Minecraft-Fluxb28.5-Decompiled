import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class is3$2 implements ProfileLookupCallback {
   public final vr1 b9d;
   public final List oru;
   private static final long a;
   private static final String b;

   public is3$2(vr1 var1, List var2) {
      this.b9d = var1;
      this.oru = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.b9d.y71().h5y(var1);
      this.oru.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      long var3 = a ^ 66571403778543L;
      is3.qeq().warn(b + var1.getName(), var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3603143080679840227L, 6473215134718430946L, MethodHandles.lookup().lookupClass()).a(68135195246280L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1260097249152L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "ROÁuÛ\nB\u0088ïÙÈ±UL\u0001¤äE®\u0080Ë\u00ad\u0016jÜ\u0014ú[n1VHk\u0094\u008e)*|çCº\u008d\u0015i\u0093õ\u008e\u0084".getBytes("ISO-8859-1")
      );
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
