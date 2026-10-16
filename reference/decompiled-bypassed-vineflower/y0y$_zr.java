import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum y0y$_zr implements v4k {
   public static final y0y$_zr ipg;
   public static final y0y$_zr jgb;
   public static final y0y$_zr gt1;
   public static final y0y$_zr xew;
   public static final y0y$_zr f3v;
   public static final y0y$_zr gh0;
   public static final y0y$_zr cgq;
   public static final y0y$_zr fm2;
   public static final y0y$_zr iy8;
   public static final y0y$_zr miv;
   private static final y0y$_zr[] coj;
   private final int lb8;
   private final String hm9;
   private static final y0y$_zr[] uof;

   private y0y$_zr(int var3, String var4) {
      this.lb8 = var3;
      this.hm9 = var4;
   }

   public int g_6() {
      return this.lb8;
   }

   @Override
   public String toString() {
      return this.hm9;
   }

   public boolean t1s() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getstatic y0y$_zr.f3v Ly0y$_zr;
      // 08: iload 1
      // 09: ifne 21
      // 0c: if_acmpeq 56
      // 0f: goto 16
      // 12: invokestatic y0y$_zr.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic y0y$_zr.gt1 Ly0y$_zr;
      // 1a: goto 21
      // 1d: invokestatic y0y$_zr.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 3a
      // 25: if_acmpeq 56
      // 28: goto 2f
      // 2b: invokestatic y0y$_zr.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getstatic y0y$_zr.gh0 Ly0y$_zr;
      // 33: goto 3a
      // 36: invokestatic y0y$_zr.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 1
      // 3b: ifne 53
      // 3e: if_acmpeq 56
      // 41: goto 48
      // 44: invokestatic y0y$_zr.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getstatic y0y$_zr.xew Ly0y$_zr;
      // 4c: goto 53
      // 4f: invokestatic y0y$_zr.a (Loov;)Loov;
      // 52: athrow
      // 53: if_acmpne 5e
      // 56: bipush 1
      // 57: goto 5f
      // 5a: invokestatic y0y$_zr.a (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: ireturn
   }

   public static y0y$_zr ai5(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic y0y$_zr.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic y0y$_zr.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic y0y$_zr.coj [Ly0y$_zr;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic y0y$_zr.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic y0y$_zr.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic y0y$_zr.coj [Ly0y$_zr;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.hm9;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8898075690410032088L, 389829245467484346L, MethodHandles.lookup().lookupClass()).a(133218084469171L);
      // $VF: monitorexit
      long var10 = var10000 ^ 82260154391247L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[20];
      int var6 = 0;
      String var5 = "åyË4¯·U]XdÞ\u0082a\rv\u009d\u0010§äC\u008f\u0087<2{Èb\u0004Òy\u0096u\u0015\u0010÷Ó:\u001a>&Êê½>ï\u0001Ï9\u009d}\u0010BUùøsÀG\u0015\u001coÏ\fS\u0099MÙ\u0010åyË4¯·U]¸\u0095öù8\u0092äÀ\u0010P{D\u001fqu2gTÍ,\u0092\f4\u001c±\u0010^È\u0093ÑCe\u0013Êõ\u0019$.·A²\\\u0010÷Ó:\u001a>&Êê\u009cø$O+o\u009e[\u0010E¸µ¾*^ÇÞof±\u00036;£U\u0010åyË4¯·U]³Áº%Ç\u001b\u000f*\u0010-Ó\u001e7³\u009d\u008e\u0015U\u009d«Ö×.ûV\u0010a\u009bw¬µÝ\u0010\tW\u0090».\u0006\u0018\u001cú\u0010~\u0007+4WÜ:2AÕÓ1öa7¿\u0010ï$\u0097\u009f Ý\u008aÁ \u0082Å)}x\u008f¥\u0010÷Ó:\u001a>&ÊêÐ^*ª\u009fæc<\u0010åyË4¯·U]Îv¡|_e}^\u0010½(Â\u009c\u0082eoW\rF\u007f\u001f´m\u0003l\u0010p\u0096©Ý Ý®¤\u008aä±tYÝL¾";
      int var7 = "åyË4¯·U]XdÞ\u0082a\rv\u009d\u0010§äC\u008f\u0087<2{Èb\u0004Òy\u0096u\u0015\u0010÷Ó:\u001a>&Êê½>ï\u0001Ï9\u009d}\u0010BUùøsÀG\u0015\u001coÏ\fS\u0099MÙ\u0010åyË4¯·U]¸\u0095öù8\u0092äÀ\u0010P{D\u001fqu2gTÍ,\u0092\f4\u001c±\u0010^È\u0093ÑCe\u0013Êõ\u0019$.·A²\\\u0010÷Ó:\u001a>&Êê\u009cø$O+o\u009e[\u0010E¸µ¾*^ÇÞof±\u00036;£U\u0010åyË4¯·U]³Áº%Ç\u001b\u000f*\u0010-Ó\u001e7³\u009d\u008e\u0015U\u009d«Ö×.ûV\u0010a\u009bw¬µÝ\u0010\tW\u0090».\u0006\u0018\u001cú\u0010~\u0007+4WÜ:2AÕÓ1öa7¿\u0010ï$\u0097\u009f Ý\u008aÁ \u0082Å)}x\u008f¥\u0010÷Ó:\u001a>&ÊêÐ^*ª\u009fæc<\u0010åyË4¯·U]Îv¡|_e}^\u0010½(Â\u009c\u0082eoW\rF\u007f\u001f´m\u0003l\u0010p\u0096©Ý Ý®¤\u008aä±tYÝL¾"
         .length();
      char var4 = 16;
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
                     ipg = new y0y$_zr(0, var8[8]);
                     jgb = new y0y$_zr(1, var8[1]);
                     gt1 = new y0y$_zr(2, var8[9]);
                     xew = new y0y$_zr(3, var8[4]);
                     f3v = new y0y$_zr(4, var8[0]);
                     gh0 = new y0y$_zr(5, var8[15]);
                     cgq = new y0y$_zr(6, var8[13]);
                     fm2 = new y0y$_zr(7, var8[3]);
                     iy8 = new y0y$_zr(8, var8[18]);
                     miv = new y0y$_zr(9, var8[10]);
                     uof = new y0y$_zr[]{ipg, jgb, gt1, xew, f3v, gh0, cgq, fm2, iy8, miv};
                     coj = new y0y$_zr[values().length];

                     for (y0y$_zr var15 : values()) {
                        coj[var15.g_6()] = var15;
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

                  var5 = "\u001a/.SµJæw\"x\u000bfp\u0011\u0093E\u0010÷Ó:\u001a>&ÊêÙëÄ\u0096uÈfÿ";
                  var7 = "\u001a/.SµJæw\"x\u000bfp\u0011\u0093E\u0010÷Ó:\u001a>&ÊêÙëÄ\u0096uÈfÿ".length();
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
