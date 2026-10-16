import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ywl$iai implements v4k {
   public static final ywl$iai o86;
   public static final ywl$iai r24;
   public static final ywl$iai vo4;
   public static final ywl$iai fy_;
   public static final ywl$iai xhn;
   private static final ywl$iai[] dn5;
   private final int zrm;
   private final String kvy;
   private final String kl0;
   private static final ywl$iai[] gxo;

   private ywl$iai(int var3, String var4, String var5) {
      this.zrm = var3;
      this.kvy = var4;
      this.kl0 = var5;
   }

   public int ofo() {
      return this.zrm;
   }

   @Override
   public String toString() {
      return this.kl0;
   }

   public static ywl$iai s0h(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic ywl$iai.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic ywl$iai.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic ywl$iai.dn5 [Lywl$iai;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic ywl$iai.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic ywl$iai.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic ywl$iai.dn5 [Lywl$iai;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.kvy;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3964843862617966934L, -4641562573303003106L, MethodHandles.lookup().lookupClass()).a(178405401729553L);
      // $VF: monitorexit
      long var10 = var10000 ^ 84769729596871L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[14];
      int var6 = 0;
      String var5 = "¸ÄÄI\u001acº\u0084\b%:£\u0019ÁæFÜ\bÎ!jkÉVS \b\u0018\u0088\b'9¡ÕÊ\bwÂF,_«\"Ü\bÎ!jkÉVS \b¼SGÉöà\u008c¾\u0010\u009b\u0087)Ï,uj3gD¯ÿ$B5#\b|º\u0091wö©ü´\béó,È}A·\t\u0010©\u008e*«\u0006\u0092¹Ôö3\u0097ÜIB\u0005{\b|º\u0091wö©ü´";
      int var7 = "¸ÄÄI\u001acº\u0084\b%:£\u0019ÁæFÜ\bÎ!jkÉVS \b\u0018\u0088\b'9¡ÕÊ\bwÂF,_«\"Ü\bÎ!jkÉVS \b¼SGÉöà\u008c¾\u0010\u009b\u0087)Ï,uj3gD¯ÿ$B5#\b|º\u0091wö©ü´\béó,È}A·\t\u0010©\u008e*«\u0006\u0092¹Ôö3\u0097ÜIB\u0005{\b|º\u0091wö©ü´"
         .length();
      char var4 = '\b';
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var5.substring(++var17, var17 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var25;
                  if ((var17 += var4) >= var7) {
                     o86 = new ywl$iai(0, var8[8], var8[11]);
                     r24 = new ywl$iai(1, var8[12], var8[7]);
                     vo4 = new ywl$iai(2, var8[6], var8[5]);
                     fy_ = new ywl$iai(3, var8[4], var8[2]);
                     xhn = new ywl$iai(4, var8[3], var8[2]);
                     gxo = new ywl$iai[]{o86, r24, vo4, fy_, xhn};
                     dn5 = new ywl$iai[values().length];

                     for (ywl$iai var15 : values()) {
                        dn5[var15.ofo()] = var15;
                     }

                     return;
                  }

                  var4 = var5.charAt(var17);
                  break;
               default:
                  var8[var6++] = var25;
                  if ((var17 += var4) < var7) {
                     var4 = var5.charAt(var17);
                     continue label37;
                  }

                  var5 = "\u009b\u0087)Ï,uj3gD¯ÿ$B5#\bÒ\u0016\u001cù\u0017}\u00950";
                  var7 = "\u009b\u0087)Ï,uj3gD¯ÿ$B5#\bÒ\u0016\u001cù\u0017}\u00950".length();
                  var4 = 16;
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
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
