import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum cp8$vxz implements v4k {
   public static final cp8$vxz bpt;
   public static final cp8$vxz jxy;
   public static final cp8$vxz i7j;
   private static final cp8$vxz[] e5h;
   private final int qw5;
   private final String v2d;
   private final String tth;
   private static final cp8$vxz[] ith;

   private cp8$vxz(int var3, String var4, String var5) {
      this.qw5 = var3;
      this.v2d = var4;
      this.tth = var5;
   }

   public int a1g() {
      return this.qw5;
   }

   @Override
   public String toString() {
      return this.v2d;
   }

   public static cp8$vxz ydq(int param0) {
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
      // 0f: invokestatic cp8$vxz.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic cp8$vxz.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic cp8$vxz.e5h [Lcp8$vxz;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic cp8$vxz.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic cp8$vxz.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic cp8$vxz.e5h [Lcp8$vxz;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.v2d;
   }

   public String _u_() {
      return this.tth;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(268119113421030557L, -6776665536027759074L, MethodHandles.lookup().lookupClass()).a(74393998231556L);
      // $VF: monitorexit
      long var10 = var10000 ^ 29952659655714L;
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
      String var5 = "Ù¦\u0097ýCm½ì\u0018¢\u0006÷?!ô]ñ»\u008b¹\u000eÞF}f»\u0098jqÀ\u0083{ä\b½¢\u0018z\u0007~Îq\b;ì\bm\u0099`\t\u000e\u0018-Û|M\u0003Ä°\u0085\u001b«ÜG\u0006öÙ\u001aíO\u0087½ß¡\u0092Á\u0010¥Ï-6°Þ:èíUÒ\u008eÿ\u009c\u00179\u0010-Û|M\u0003Ä°\u0085Ò|DÁÐJOs";
      int var7 = "Ù¦\u0097ýCm½ì\u0018¢\u0006÷?!ô]ñ»\u008b¹\u000eÞF}f»\u0098jqÀ\u0083{ä\b½¢\u0018z\u0007~Îq\b;ì\bm\u0099`\t\u000e\u0018-Û|M\u0003Ä°\u0085\u001b«ÜG\u0006öÙ\u001aíO\u0087½ß¡\u0092Á\u0010¥Ï-6°Þ:èíUÒ\u008eÿ\u009c\u00179\u0010-Û|M\u0003Ä°\u0085Ò|DÁÐJOs"
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
                     bpt = new cp8$vxz(0, var8[5], var8[3]);
                     jxy = new cp8$vxz(1, var8[4], var8[6]);
                     i7j = new cp8$vxz(2, var8[1], var8[8]);
                     ith = new cp8$vxz[]{bpt, jxy, i7j};
                     e5h = new cp8$vxz[values().length];

                     for (cp8$vxz var15 : values()) {
                        e5h[var15.a1g()] = var15;
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

                  var5 = "bð*Æ4Nñq6\u0089+1â\"®Ó\b\u0084ù8P(TØ°";
                  var7 = "bð*Æ4Nñq6\u0089+1â\"®Ó\b\u0084ù8P(TØ°".length();
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
