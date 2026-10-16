import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v1n {
   private static final long a;
   private static final String b;

   public v1n() {
      long var1 = a ^ 123013429941471L;
      super();
      this.qpy = new Random();
      this.h22 = b.split(" ");
   }

   public static v1n zwd() {
      return c_7;
   }

   public String oww() {
      int var2 = this.qpy.nextInt(2) + 3;
      int var10000 = t9d.c();
      String var3 = "";
      int var4 = 0;
      int var1 = var10000;

      while (var4 < var2) {
         if (var4 > 0) {
            var3 = var3 + " ";
         }

         var3 = var3 + this.h22[this.qpy.nextInt(this.h22.length)];
         var4++;
         if (var1 != 0) {
            break;
         }
      }

      return var3;
   }

   public void fnf(long var1) {
      this.qpy.setSeed(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4568491304221515523L, 3864414568669500408L, MethodHandles.lookup().lookupClass()).a(236037464839813L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 122218269531407L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\u001bt\u001d$_>\u001f½ÐöIy§åè¤Ê+:÷°\u000fÞCþÔUÀù¹;\u0007\u0085ë«ã_%»Ký\u001a!¨\u001c¾¢\\K°T×!¢i\u0015GÊm\u008f\u008aXÊó\u000brù\u0090µÖøÏ=J'\u0088+Ë©zÎÂ«¥\u001c'Ø>âÊ²í´C;5hø\u0012@à\u0089 ðF\\GöH\\fÜ\u0086\u0091gUMm\u009d\u009aF¢ëÌÙË¶«Ñ³ÛÂÑ\u0080\u0084\u0014®-oÚ\u0082¼ñU\fv¤\u009e\u001bx\u0011Ui\u0019\u007f5¥dxi\u0082û¯Aªû\u0000¼k\u0005ì\u00075§`kÄ{\u001bÍ3¯ì\u0002s0\u0094zäc¢¼áw¸þÓ3'©È\t½\u0094\u0015.L/øÔè\u007fø³¤¹õ\n&\u0096\u0096Ð¥ÙBI·~À\u00149ÜÇÈ\u0015R\u0092ÝÍ¦ýpå\u0084)\rÑa\u009dEd\f;d\u009eÿ|W\u0018 Àª+\u008c\u009cDI-éøø\u009b:Y\u008aÕHÌ^\u009f\u009b+é3§k¥\u008c\u008a;_-\u0014\n\u008cEl\u0092\u009cD \u0089UÔ±\u0085\u0002^<\u007f1ª=Î¿ï,\u0001æ~')\u0092ëËÔCv¿Ên¹Å\u0006\u009b¸ùp¿\u009179%z\u009cv*\u008dW\u000ff¶\u001eÖ¬ì\u000b÷§<"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      c_7 = new v1n();
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
