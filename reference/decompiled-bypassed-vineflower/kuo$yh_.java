import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum kuo$yh_ implements v4k {
   public static final kuo$yh_ q8v;
   public static final kuo$yh_ ljm;
   public static final kuo$yh_ hk4;
   public static final kuo$yh_ ud9;
   private static final kuo$yh_[] wf6;
   private final int oks;
   private final String i2n;
   private final String biw;
   private static final kuo$yh_[] d61;

   private kuo$yh_(int var3, String var4, String var5) {
      this.oks = var3;
      this.i2n = var4;
      this.biw = var5;
   }

   public int yi5() {
      return this.oks;
   }

   @Override
   public String toString() {
      return this.i2n;
   }

   public static kuo$yh_ p2f(int param0) {
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
      // 0f: invokestatic kuo$yh_.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic kuo$yh_.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic kuo$yh_.wf6 [Lkuo$yh_;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic kuo$yh_.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic kuo$yh_.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic kuo$yh_.wf6 [Lkuo$yh_;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.i2n;
   }

   public String yz9() {
      return this.biw;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2297103431788589356L, -2436215092162286257L, MethodHandles.lookup().lookupClass()).a(196305414586680L);
      // $VF: monitorexit
      long var10 = var10000 ^ 111312275064872L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[12];
      int var6 = 0;
      String var5 = "tàR\u008dNÐ\u0011&\b\u0092\u0088\u0019\u007f\u0088\u000fÔ^\b»ñ\u0092:Ã&gs\u0010çq0|n¡\u0090´  qvWh\u0003,\u0018Â\u00873\u001aCZñùâu¥tN\u0004<Xm³ª\u0086¹ÂsÍ\u0018\u0093ó\u000b\u008c¾\u001böë\tâ±¤ûÐq\u00868\u0088\nm\f\u0096\\v\bG\u0016\u0081\b\u008dÂy;\b\u0012~¼\u0091\u0099\u009c¼ü\u0018z\u008cßfû<l\u0091éoÀï\u0090¤Ï,\u009e\u001cñ\u0012ù\u000f{¡\u0010z\u008cßfû<l\u0091\u0094§:ÏZÿ\u008d,";
      int var7 = "tàR\u008dNÐ\u0011&\b\u0092\u0088\u0019\u007f\u0088\u000fÔ^\b»ñ\u0092:Ã&gs\u0010çq0|n¡\u0090´  qvWh\u0003,\u0018Â\u00873\u001aCZñùâu¥tN\u0004<Xm³ª\u0086¹ÂsÍ\u0018\u0093ó\u000b\u008c¾\u001böë\tâ±¤ûÐq\u00868\u0088\nm\f\u0096\\v\bG\u0016\u0081\b\u008dÂy;\b\u0012~¼\u0091\u0099\u009c¼ü\u0018z\u008cßfû<l\u0091éoÀï\u0090¤Ï,\u009e\u001cñ\u0012ù\u000f{¡\u0010z\u008cßfû<l\u0091\u0094§:ÏZÿ\u008d,"
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
                     q8v = new kuo$yh_(0, var8[3], var8[10]);
                     ljm = new kuo$yh_(1, var8[4], var8[1]);
                     hk4 = new kuo$yh_(2, var8[5], var8[7]);
                     ud9 = new kuo$yh_(3, var8[8], var8[9]);
                     d61 = new kuo$yh_[]{q8v, ljm, hk4, ud9};
                     wf6 = new kuo$yh_[values().length];

                     for (kuo$yh_ var15 : values()) {
                        wf6[var15.yi5()] = var15;
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

                  var5 = "ßÃ«Ú\u0088æ\u0012\u001e\u0010\u00adò\u0082\u0007}°\u0091C1\u0016FÞÌj§\u001e";
                  var7 = "ßÃ«Ú\u0088æ\u0012\u001e\u0010\u00adò\u0082\u0007}°\u0091C1\u0016FÞÌj§\u001e".length();
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
