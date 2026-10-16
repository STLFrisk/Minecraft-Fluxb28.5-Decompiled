import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface z0w {
   Map wwc;
   z0w euo;
   z0w cq0;
   z0w a4z;
   z0w ghc;
   z0w g39;
   z0w hno;
   z0w[] iao;
   z0w[] aze;

   String ofv();

   int ubo(List var1);

   boolean nzz();

   z0w$enz yqn();

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4132123833848486255L, -3020701492052662459L, MethodHandles.lookup().lookupClass()).a(195686488575793L);
      // $VF: monitorexit
      long var10 = var10000 ^ 105270717695636L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[10];
      int var6 = 0;
      String var5 = "\u0095\u0017p\u0005\u0015KX\u001b\u0010ö¡Y9í\f±D\u0012î\u001fâb\u0016á¨\b\u0081\u0084~\u0013Ub\u0014æ\u0010§\u001b7\u0002QøÂè>\u0096¤\u008bX*0T\bK¿=\u0087¦\u007fqµ\u0010\u0096h³PÝZÉ\u009eÀÓÓ\u0080\u0096,\u0086§\u0010!$Äv6\u008d»Ñm\u009fÉ.\u009d¬\u0095\u008f\u0010\u0096h³PÝZÉ\u009eÀÓÓ\u0080\u0096,\u0086§";
      int var7 = "\u0095\u0017p\u0005\u0015KX\u001b\u0010ö¡Y9í\f±D\u0012î\u001fâb\u0016á¨\b\u0081\u0084~\u0013Ub\u0014æ\u0010§\u001b7\u0002QøÂè>\u0096¤\u008bX*0T\bK¿=\u0087¦\u007fqµ\u0010\u0096h³PÝZÉ\u009eÀÓÓ\u0080\u0096,\u0086§\u0010!$Äv6\u008d»Ñm\u009fÉ.\u009d¬\u0095\u008f\u0010\u0096h³PÝZÉ\u009eÀÓÓ\u0080\u0096,\u0086§"
         .length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     wwc = Maps.newHashMap();
                     euo = new e6d(var8[2]);
                     cq0 = new e6d(var8[4]);
                     a4z = new e6d(var8[9]);
                     ghc = new e6d(var8[6]);
                     g39 = new e6d(var8[3]);
                     hno = new tjj(var8[0]);
                     iao = new z0w[]{
                        new vdm(var8[1], syo.du0),
                        new vdm(var8[8], syo.jww),
                        new vdm(var8[8], syo.w9t),
                        new vdm(var8[8], syo.ffo),
                        new vdm(var8[8], syo.id3),
                        new vdm(var8[8], syo.iis),
                        new vdm(var8[8], syo.u4m),
                        new vdm(var8[8], syo.qiz),
                        new vdm(var8[8], syo.pgp),
                        new vdm(var8[8], syo.jkd),
                        new vdm(var8[8], syo.qjc),
                        new vdm(var8[8], syo.c8f),
                        new vdm(var8[8], syo.aez),
                        new vdm(var8[8], syo.niw),
                        new vdm(var8[8], syo.iyk),
                        new vdm(var8[8], syo.rl1)
                     };
                     aze = new z0w[]{
                        new vdm(var8[5], syo.du0),
                        new vdm(var8[7], syo.jww),
                        new vdm(var8[7], syo.w9t),
                        new vdm(var8[7], syo.ffo),
                        new vdm(var8[7], syo.id3),
                        new vdm(var8[7], syo.iis),
                        new vdm(var8[7], syo.u4m),
                        new vdm(var8[7], syo.qiz),
                        new vdm(var8[7], syo.pgp),
                        new vdm(var8[7], syo.jkd),
                        new vdm(var8[7], syo.qjc),
                        new vdm(var8[7], syo.c8f),
                        new vdm(var8[7], syo.aez),
                        new vdm(var8[7], syo.niw),
                        new vdm(var8[7], syo.iyk),
                        new vdm(var8[7], syo.rl1)
                     };
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "ö¡Y9í\f±D\u0012î\u001fâb\u0016á¨\u0010\u008b\u009eÑ\u0015\u0083%¸±åÞª¤lY1¤";
                  var7 = "ö¡Y9í\f±D\u0012î\u001fâb\u0016á¨\u0010\u008b\u009eÑ\u0015\u0083%¸±åÞª¤lY1¤".length();
                  var4 = 16;
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
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
