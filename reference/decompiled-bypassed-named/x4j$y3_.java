import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum x4j$y3_ implements v4k {
   public static final x4j$y3_ i43;
   public static final x4j$y3_ nwn;
   public static final x4j$y3_ lbr;
   public static final x4j$y3_ luc;
   public static final x4j$y3_ s5w;
   public static final x4j$y3_ qil;
   private static final x4j$y3_[] v6d;
   private final int _u9;
   private final String wpw;
   private final String xk5;
   private static final x4j$y3_[] unp;

   private x4j$y3_(int var3, String var4) {
      this(var3, var4, var4);
   }

   private x4j$y3_(int var3, String var4, String var5) {
      this._u9 = var3;
      this.wpw = var4;
      this.xk5 = var5;
   }

   public int x_e() {
      return this._u9;
   }

   @Override
   public String toString() {
      return this.wpw;
   }

   public static x4j$y3_ yw_(int param0) {
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
      // 0f: invokestatic x4j$y3_.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic x4j$y3_.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic x4j$y3_.v6d [Lx4j$y3_;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic x4j$y3_.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic x4j$y3_.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic x4j$y3_.v6d [Lx4j$y3_;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.wpw;
   }

   public String fct() {
      return this.xk5;
   }

   public abstract zfz k80();

   public static x4j$y3_ f7p(zfz param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic x4j$y3_.values ()[Lx4j$y3_;
      // 03: astore 2
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: istore 1
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 40
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: iload 1
      // 19: ifeq 43
      // 1c: astore 5
      // 1e: iload 1
      // 1f: ifeq 3c
      // 22: aload 0
      // 23: aload 5
      // 25: invokevirtual x4j$y3_.k80 ()Lzfz;
      // 28: if_acmpne 39
      // 2b: goto 32
      // 2e: invokestatic x4j$y3_.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 5
      // 34: areturn
      // 35: invokestatic x4j$y3_.a (Loov;)Loov;
      // 38: athrow
      // 39: iinc 4 1
      // 3c: iload 1
      // 3d: ifne 0e
      // 40: getstatic x4j$y3_.i43 Lx4j$y3_;
      // 43: areturn
   }

   public x4j$y3_(int var3, String var4, x4j$1 var5) {
      this(var3, var4);
   }

   public x4j$y3_(int var3, String var4, String var5, x4j$1 var6) {
      this(var3, var4, var5);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7371509239408044294L, 7974897658020022689L, MethodHandles.lookup().lookupClass()).a(263384081464865L);
      // $VF: monitorexit
      long var10 = var10000 ^ 1727100298796L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[17];
      int var6 = 0;
      String var5 = "ë\u009fÆS¯¯#¹\u0007\t`·ùÍ%\u0084-\u000fçG`\u0098vü\u0018a\u009eâ&Y#Ô×¿ï\u0006Ñxõ\u001fë\u0018y¸_ÁkÚ?\u0010K\u0004\u0000\t\u0018X9Àá)Q#·(Þb\u0010\u001az¹\u001bX;Ø\u0007g>PÁg\u0095v\u0015\u0010[\u0018\u0092ÖR\u001e\u000b\u0011*q~\u0012T¤\u0019\u008a\bL\u0017æ¢0(0\u0003\b\u0081ûéû®ÿý\u0085\u0010!¥xÃÆHÐð\u0093\u0013ÐbÂs\u0086¨\u0010ê3õFs/°'foéà\u00932\u0007$\u0018\büðº\u0080³Rñ³¤3Ý÷w¹m\u0007\u001fèÉ}[¦ç\u0010[\u0018\u0092ÖR\u001e\u000b\u0011; @¢è¸ä¨\u0010o\u009eJè\u000baäk/V¥\u009aü0²&\u0010\u0089ýêÔ\u0093×KÎuöMÖw\u0092]Ç\u0010¸p½ëF=Ì\u0099;ªAq©|üD\bøÓn\u008b\u0006ææ'";
      int var7 = "ë\u009fÆS¯¯#¹\u0007\t`·ùÍ%\u0084-\u000fçG`\u0098vü\u0018a\u009eâ&Y#Ô×¿ï\u0006Ñxõ\u001fë\u0018y¸_ÁkÚ?\u0010K\u0004\u0000\t\u0018X9Àá)Q#·(Þb\u0010\u001az¹\u001bX;Ø\u0007g>PÁg\u0095v\u0015\u0010[\u0018\u0092ÖR\u001e\u000b\u0011*q~\u0012T¤\u0019\u008a\bL\u0017æ¢0(0\u0003\b\u0081ûéû®ÿý\u0085\u0010!¥xÃÆHÐð\u0093\u0013ÐbÂs\u0086¨\u0010ê3õFs/°'foéà\u00932\u0007$\u0018\büðº\u0080³Rñ³¤3Ý÷w¹m\u0007\u001fèÉ}[¦ç\u0010[\u0018\u0092ÖR\u001e\u000b\u0011; @¢è¸ä¨\u0010o\u009eJè\u000baäk/V¥\u009aü0²&\u0010\u0089ýêÔ\u0093×KÎuöMÖw\u0092]Ç\u0010¸p½ëF=Ì\u0099;ªAq©|üD\bøÓn\u008b\u0006ææ'"
         .length();
      char var4 = 24;
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
                     i43 = new x4j$y3_$1(0, var8[5]);
                     nwn = new x4j$y3_$2(1, var8[13], var8[14]);
                     lbr = new x4j$y3_$3(2, var8[7], var8[6]);
                     luc = new x4j$y3_$4(3, var8[2], var8[3]);
                     s5w = new x4j$y3_$5(4, var8[15], var8[11]);
                     qil = new x4j$y3_$6(5, var8[10], var8[4]);
                     unp = new x4j$y3_[]{i43, nwn, lbr, luc, s5w, qil};
                     v6d = new x4j$y3_[values().length];

                     for (x4j$y3_ var15 : values()) {
                        v6d[var15.x_e()] = var15;
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

                  var5 = "Äwñwü$tÚ\u000eY\u0097ZÖï\u0002\u0097\bÜ\t&µ\u0002áLÎ";
                  var7 = "Äwñwü$tÚ\u000eY\u0097ZÖï\u0002\u0097\bÜ\t&µ\u0002áLÎ".length();
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
