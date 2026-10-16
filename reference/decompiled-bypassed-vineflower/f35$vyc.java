import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum f35$vyc implements v4k {
   public static final f35$vyc q6a;
   public static final f35$vyc flm;
   public static final f35$vyc lwa;
   private static final f35$vyc[] bfy;
   private final int _p4;
   private final String and;
   private final String ot5;
   private static final f35$vyc[] k7u;

   private f35$vyc(int var3, String var4, String var5) {
      this._p4 = var3;
      this.and = var4;
      this.ot5 = var5;
   }

   public int zks() {
      return this._p4;
   }

   @Override
   public String toString() {
      return this.and;
   }

   public static f35$vyc vmt(int param0) {
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
      // 0f: invokestatic f35$vyc.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic f35$vyc.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic f35$vyc.bfy [Lf35$vyc;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic f35$vyc.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic f35$vyc.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic f35$vyc.bfy [Lf35$vyc;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.and;
   }

   public String bs_() {
      return this.ot5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-591704517963701804L, 3254060541618878312L, MethodHandles.lookup().lookupClass()).a(136480518238265L);
      // $VF: monitorexit
      long var10 = var10000 ^ 131528215314571L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[9];
      int var6 = 0;
      String var5 = "9X&ÿú.k8\u0018ÅAÈ;\u0016\u0087(s\fâåse\u0081ÜÎ\u000b°´\u00ad\u009f\u001f+î\u0010ÅAÈ;\u0016\u0087(s¶×¥Ã;|\u009aÔ\b\u0087;u;Ô\u001c9c\u0018s¹òÍwk¤Oa\u000f\u009dê\u00996K]x+@mÄ\u0016\u0001>\bð\u009ft¼©ðÄÅ\u0010.É\u0089Ïm\u001f±Òæ\u0087ïæ¥\u00840I";
      int var7 = "9X&ÿú.k8\u0018ÅAÈ;\u0016\u0087(s\fâåse\u0081ÜÎ\u000b°´\u00ad\u009f\u001f+î\u0010ÅAÈ;\u0016\u0087(s¶×¥Ã;|\u009aÔ\b\u0087;u;Ô\u001c9c\u0018s¹òÍwk¤Oa\u000f\u009dê\u00996K]x+@mÄ\u0016\u0001>\bð\u009ft¼©ðÄÅ\u0010.É\u0089Ïm\u001f±Òæ\u0087ïæ¥\u00840I"
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
                     q6a = new f35$vyc(0, var8[8], var8[3]);
                     flm = new f35$vyc(1, var8[1], var8[2]);
                     lwa = new f35$vyc(2, var8[4], var8[5]);
                     k7u = new f35$vyc[]{q6a, flm, lwa};
                     bfy = new f35$vyc[values().length];

                     for (f35$vyc var15 : values()) {
                        bfy[var15.zks()] = var15;
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

                  var5 = "\"æ8>=\u0015\u0084¢\u0010\u0002çX¾\u0089aÀ\u000b \u0089\u0014åÏyÄz";
                  var7 = "\"æ8>=\u0015\u0084¢\u0010\u0002çX¾\u0089aÀ\u000b \u0089\u0014åÏyÄz".length();
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
