import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum u7m$vz9 {
   public static final u7m$vz9 dsi;
   public static final u7m$vz9 vp0;
   public static final u7m$vz9 mht;
   public static final u7m$vz9 ywk;
   public static final u7m$vz9 xax;
   private final int mqf;
   private final int _6z;
   private final float sv1;
   private final float t5o;
   private final int fqx;
   private static final u7m$vz9[] w6u;

   private u7m$vz9(int var3, int var4, float var5, float var6, int var7) {
      this.mqf = var3;
      this._6z = var4;
      this.sv1 = var5;
      this.t5o = var6;
      this.fqx = var7;
   }

   public int sqv() {
      return this._6z;
   }

   public float kv9() {
      return this.sv1;
   }

   public float zua() {
      return this.t5o;
   }

   public int lph() {
      return this.mqf;
   }

   public int pmc() {
      return this.fqx;
   }

   public u7m jw6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getstatic u7m$vz9.dsi Lu7m$vz9;
      // 08: iload 1
      // 09: ifne 27
      // 0c: if_acmpne 23
      // 0f: goto 16
      // 12: invokestatic u7m$vz9.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic ox_.wb7 Le0x;
      // 19: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 1c: goto 8c
      // 1f: invokestatic u7m$vz9.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getstatic u7m$vz9.vp0 Lu7m$vz9;
      // 27: iload 1
      // 28: ifne 46
      // 2b: if_acmpne 42
      // 2e: goto 35
      // 31: invokestatic u7m$vz9.a (Loov;)Loov;
      // 34: athrow
      // 35: getstatic ox_.a3_ Le0x;
      // 38: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 3b: goto 8c
      // 3e: invokestatic u7m$vz9.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getstatic u7m$vz9.xax Lu7m$vz9;
      // 46: iload 1
      // 47: ifne 62
      // 4a: if_acmpne 5e
      // 4d: goto 54
      // 50: invokestatic u7m$vz9.a (Loov;)Loov;
      // 53: athrow
      // 54: getstatic xbr.jtr Lu7m;
      // 57: goto 8c
      // 5a: invokestatic u7m$vz9.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getstatic u7m$vz9.mht Lu7m$vz9;
      // 62: iload 1
      // 63: ifne 7e
      // 66: if_acmpne 7a
      // 69: goto 70
      // 6c: invokestatic u7m$vz9.a (Loov;)Loov;
      // 6f: athrow
      // 70: getstatic xbr.icz Lu7m;
      // 73: goto 8c
      // 76: invokestatic u7m$vz9.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getstatic u7m$vz9.ywk Lu7m$vz9;
      // 7e: if_acmpne 8b
      // 81: getstatic xbr.exg Lu7m;
      // 84: goto 8c
      // 87: invokestatic u7m$vz9.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aconst_null
      // 8c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2571924010679224771L, -5630584435963168485L, MethodHandles.lookup().lookupClass()).a(278133177233987L);
      // $VF: monitorexit
      long var10 = var10000 ^ 79343026212624L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[5];
      int var6 = 0;
      String var5 = "¨QÐYîÛâ°\b\u001asi\u0013°å¨\b\b@)q\u009f\u001a« \u001a";
      int var7 = "¨QÐYîÛâ°\b\u001asi\u0013°å¨\b\b@)q\u009f\u001a« \u001a".length();
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
                     dsi = new u7m$vz9(0, 59, 2.0F, 0.0F, 15);
                     vp0 = new u7m$vz9(1, 131, 4.0F, 1.0F, 5);
                     mht = new u7m$vz9(2, 250, 6.0F, 2.0F, 14);
                     ywk = new u7m$vz9(3, 1561, 8.0F, 3.0F, 10);
                     xax = new u7m$vz9(0, 32, 12.0F, 0.0F, 22);
                     w6u = new u7m$vz9[]{dsi, vp0, mht, ywk, xax};
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

                  var5 = "\u0087\u0082\fÉGt«\u0000\bAJ`\"åöXÐ";
                  var7 = "\u0087\u0082\fÉGt«\u0000\bAJ`\"åöXÐ".length();
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
