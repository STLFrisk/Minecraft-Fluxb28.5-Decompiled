import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum sf8$hj6 {
   public static final sf8$hj6 kxa;
   public static final sf8$hj6 c2q;
   public static final sf8$hj6 lh2;
   public static final sf8$hj6 p46;
   private final vt2 jse;
   private final int we8;
   private final int pzc;
   private static final sf8$hj6[] asf;

   private sf8$hj6(vt2 var3, int var4, int var5) {
      this.jse = var3;
      this.we8 = var4;
      this.pzc = var5;
   }

   public vt2 hgq() {
      return this.jse;
   }

   public int imb() {
      return this.we8;
   }

   public int lpr() {
      return this.pzc;
   }

   private boolean tv5() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getstatic sf8$hj6.c2q Lsf8$hj6;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: if_acmpeq 24
      // 0f: goto 16
      // 12: invokestatic sf8$hj6.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic sf8$hj6.kxa Lsf8$hj6;
      // 1a: goto 21
      // 1d: invokestatic sf8$hj6.a (Loov;)Loov;
      // 20: athrow
      // 21: if_acmpne 2c
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic sf8$hj6.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   public static boolean ms3(sf8$hj6 var0) {
      return var0.tv5();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2727381662474157275L, -6506457372935129073L, MethodHandles.lookup().lookupClass()).a(264868281490270L);
      // $VF: monitorexit
      long var10 = var10000 ^ 83705467573363L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "C÷÷E\u008e ¤(\b;\u0092ªCt¹ê8";
      int var7 = "C÷÷E\u008e ¤(\b;\u0092ªCt¹ê8".length();
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
                     kxa = new sf8$hj6(vt2.rf3, 0, -1);
                     c2q = new sf8$hj6(vt2.m3r, 0, 1);
                     lh2 = new sf8$hj6(vt2.zk4, -1, 0);
                     p46 = new sf8$hj6(vt2.te4, 1, 0);
                     asf = new sf8$hj6[]{kxa, c2q, lh2, p46};
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

                  var5 = "\u0093ÜÊ[5\u001e0_\bæ\u009dòítG\u0003\u0005";
                  var7 = "\u0093ÜÊ[5\u001e0_\bæ\u009dòítG\u0003\u0005".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
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
