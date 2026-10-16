import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum x54$lti implements v4k {
   public static final x54$lti mdr;
   public static final x54$lti b4p;
   public static final x54$lti yk5;
   public static final x54$lti jnw;
   public static final x54$lti y2x;
   public static final x54$lti jtj;
   private static final x54$lti[] yl7;
   private final int plm;
   private final String jo8;
   private final String nbh;
   private final _mi jgb;
   private static final x54$lti[] mlx;

   private x54$lti(int var3, String var4, _mi var5) {
      this(var3, var4, var4, var5);
   }

   private x54$lti(int var3, String var4, String var5, _mi var6) {
      this.plm = var3;
      this.jo8 = var4;
      this.nbh = var5;
      this.jgb = var6;
   }

   public int h8z() {
      return this.plm;
   }

   public _mi _fn() {
      return this.jgb;
   }

   @Override
   public String toString() {
      return this.jo8;
   }

   public static x54$lti mhp(int param0) {
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
      // 0f: invokestatic x54$lti.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic x54$lti.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic x54$lti.yl7 [Lx54$lti;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic x54$lti.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic x54$lti.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic x54$lti.yl7 [Lx54$lti;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.jo8;
   }

   public String lfl() {
      return this.nbh;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6886434040605439550L, 6141048071255312688L, MethodHandles.lookup().lookupClass()).a(82415667143164L);
      // $VF: monitorexit
      long var10 = var10000 ^ 100242160509538L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[13];
      int var6 = 0;
      String var5 = "ó\u0018\u0088·¸ \u001f\u001b\bÖÇ-õVøø \b\u001b\u0011åâØdÎ\u0089\b`ùÍwý\u0082øf\bâr1\u0096*üÆh\u0010=\u0019&5à\u0090\u0083å:N¯M÷\u0088,\u009b\u0010öÐy\u0010«½AëMÉ\u000f\u009az|3\u009e\bgØM\u0082\u00058¢b\b¥7û°ßFZ:\bO\u009bÉPûbÓ¬\b¬j5¦i\u0083W\u001d";
      int var7 = "ó\u0018\u0088·¸ \u001f\u001b\bÖÇ-õVøø \b\u001b\u0011åâØdÎ\u0089\b`ùÍwý\u0082øf\bâr1\u0096*üÆh\u0010=\u0019&5à\u0090\u0083å:N¯M÷\u0088,\u009b\u0010öÐy\u0010«½AëMÉ\u000f\u009az|3\u009e\bgØM\u0082\u00058¢b\b¥7û°ßFZ:\bO\u009bÉPûbÓ¬\b¬j5¦i\u0083W\u001d"
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
                     mdr = new x54$lti(0, var8[4], _mi.uwd);
                     b4p = new x54$lti(1, var8[0], _mi._bd);
                     yk5 = new x54$lti(2, var8[12], _mi.e0k);
                     jnw = new x54$lti(3, var8[11], _mi.pzg);
                     y2x = new x54$lti(4, var8[10], _mi.vbr);
                     jtj = new x54$lti(5, var8[5], var8[3], _mi.c36);
                     mlx = new x54$lti[]{mdr, b4p, yk5, jnw, y2x, jtj};
                     yl7 = new x54$lti[values().length];

                     for (x54$lti var15 : values()) {
                        yl7[var15.h8z()] = var15;
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

                  var5 = "b¾\u0080.\u0088\u000b\u008aL\b·-\u0096ZyÏ3\u008f";
                  var7 = "b¾\u0080.\u0088\u000b\u008aL\b·-\u0096ZyÏ3\u008f".length();
                  var4 = '\b';
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
