import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum b7b$op3 implements v4k {
   public static final b7b$op3 sm3;
   private static final b7b$op3[] ptc;
   private final int k32;
   private final String xyc;
   private final _mi o1z;
   private static final b7b$op3[] xkp;

   private b7b$op3(int var3, String var4, _mi var5) {
      this.k32 = var3;
      this.xyc = var4;
      this.o1z = var5;
   }

   public int tn1() {
      return this.k32;
   }

   public _mi lk1() {
      return this.o1z;
   }

   @Override
   public String toString() {
      return this.xyc;
   }

   public static b7b$op3 wc8(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic b7b$op3.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifeq 35
      // 18: goto 1f
      // 1b: invokestatic b7b$op3.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic b7b$op3.ptc [Lb7b$op3;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic b7b$op3.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic b7b$op3.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic b7b$op3.ptc [Lb7b$op3;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.xyc;
   }

   public String usc() {
      return this.xyc;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4435492745797380156L, -535761407662743910L, MethodHandles.lookup().lookupClass()).a(214145936691329L);
      // $VF: monitorexit
      long var10 = var10000 ^ 54527235100897L;
      Cipher var1;
      Cipher var17 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "µ\u0005\u001dwTå\u0096k{\u008e\u008e\u0002r¨ÑÍ\u0010\u009büôß#/\"Áå\u00196f9½ä\u0081";
      int var7 = "µ\u0005\u001dwTå\u0096k{\u008e\u008e\u0002r¨ÑÍ\u0010\u009büôß#/\"Áå\u00196f9½ä\u0081".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var19 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var19;
         if ((var3 += var4) >= var7) {
            sm3 = new b7b$op3(0, var8[0], pmc$s6y.tms.fds());
            xkp = new b7b$op3[]{sm3};
            ptc = new b7b$op3[values().length];

            for (b7b$op3 var15 : values()) {
               ptc[var15.tn1()] = var15;
            }

            return;
         }

         var4 = var5.charAt(var3);
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
