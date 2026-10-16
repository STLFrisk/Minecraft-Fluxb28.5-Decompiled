import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum jpt$j4h {
   public static final jpt$j4h pdl;
   public static final jpt$j4h p5y;
   public static final jpt$j4h m22;
   public static final jpt$j4h ojl;
   public static final jpt$j4h _vv;
   private final String hph;
   private final int uft;
   private final int[] cvz;
   private final int mkv;
   private static final jpt$j4h[] d85;

   private jpt$j4h(String var3, int var4, int[] var5, int var6) {
      this.hph = var3;
      this.uft = var4;
      this.cvz = var5;
      this.mkv = var6;
   }

   public int bgt(int var1) {
      return jpt.al_()[var1] * this.uft;
   }

   public int dxj(int var1) {
      return this.cvz[var1];
   }

   public int f3e() {
      return this.mkv;
   }

   public u7m as1() {
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
      // 05: getstatic jpt$j4h.pdl Ljpt$j4h;
      // 08: iload 1
      // 09: ifne 24
      // 0c: if_acmpne 20
      // 0f: goto 16
      // 12: invokestatic jpt$j4h.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic xbr.i8v Lu7m;
      // 19: goto 86
      // 1c: invokestatic jpt$j4h.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getstatic jpt$j4h.p5y Ljpt$j4h;
      // 24: iload 1
      // 25: ifne 40
      // 28: if_acmpne 3c
      // 2b: goto 32
      // 2e: invokestatic jpt$j4h.a (Loov;)Loov;
      // 31: athrow
      // 32: getstatic xbr.icz Lu7m;
      // 35: goto 86
      // 38: invokestatic jpt$j4h.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getstatic jpt$j4h.ojl Ljpt$j4h;
      // 40: iload 1
      // 41: ifne 5c
      // 44: if_acmpne 58
      // 47: goto 4e
      // 4a: invokestatic jpt$j4h.a (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic xbr.jtr Lu7m;
      // 51: goto 86
      // 54: invokestatic jpt$j4h.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getstatic jpt$j4h.m22 Ljpt$j4h;
      // 5c: iload 1
      // 5d: ifne 78
      // 60: if_acmpne 74
      // 63: goto 6a
      // 66: invokestatic jpt$j4h.a (Loov;)Loov;
      // 69: athrow
      // 6a: getstatic xbr.icz Lu7m;
      // 6d: goto 86
      // 70: invokestatic jpt$j4h.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: getstatic jpt$j4h._vv Ljpt$j4h;
      // 78: if_acmpne 85
      // 7b: getstatic xbr.exg Lu7m;
      // 7e: goto 86
      // 81: invokestatic jpt$j4h.a (Loov;)Loov;
      // 84: athrow
      // 85: aconst_null
      // 86: areturn
   }

   public String oi6() {
      return this.hph;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4156145168939145406L, 6495833810529264634L, MethodHandles.lookup().lookupClass()).a(183637866272535L);
      // $VF: monitorexit
      long var10 = var10000 ^ 42437173446624L;
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
      String var5 = "àMÚ¿Ý·¿Á\bwÐ\u000f\u0089\u001b2\u0013X\u0010ºë|ö\u0099\rø¯Å¡à5|\u001f/Ó\bçKm½\u0091s\u0013\u000e\b}Ø3ØfÂ¡É\bÍ\u0091§-Ih¶\u0083\b\u0000fÎän\u0092\u009f\u0085\bÿÏi¨¨u¡1";
      int var7 = "àMÚ¿Ý·¿Á\bwÐ\u000f\u0089\u001b2\u0013X\u0010ºë|ö\u0099\rø¯Å¡à5|\u001f/Ó\bçKm½\u0091s\u0013\u000e\b}Ø3ØfÂ¡É\bÍ\u0091§-Ih¶\u0083\b\u0000fÎän\u0092\u009f\u0085\bÿÏi¨¨u¡1"
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
                     pdl = new jpt$j4h(var8[8], 5, new int[]{1, 3, 2, 1}, 15);
                     p5y = new jpt$j4h(var8[2], 15, new int[]{2, 5, 4, 1}, 12);
                     m22 = new jpt$j4h(var8[4], 15, new int[]{2, 6, 5, 2}, 9);
                     ojl = new jpt$j4h(var8[9], 7, new int[]{2, 5, 3, 1}, 25);
                     _vv = new jpt$j4h(var8[5], 33, new int[]{3, 8, 6, 3}, 10);
                     d85 = new jpt$j4h[]{pdl, p5y, m22, ojl, _vv};
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

                  var5 = "GÌk}ç\u0096BÚ\bÒ\u0081ðZ¿s\u0098|";
                  var7 = "GÌk}ç\u0096BÚ\bÒ\u0081ðZ¿s\u0098|".length();
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
