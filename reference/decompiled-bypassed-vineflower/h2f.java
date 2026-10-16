import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h2f {
   public final int jnd;
   public final int km5;
   private static final long a;
   private static final String b;

   public h2f(int var1, int var2) {
      this.jnd = var1;
      this.km5 = var2;
   }

   public static long fcz(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   @Override
   public int hashCode() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return this.zpf;
         }

         if (this.zpf != 0) {
            return this.zpf;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      int var2 = 1664525 * this.jnd + 1013904223;
      int var3 = 1664525 * (this.km5 ^ -559038737) + 1013904223;
      this.zpf = var2 ^ var3;
      return this.zpf;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic h2f.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic h2f.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof h2f
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic h2f.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic h2f.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast h2f
      // 36: astore 3
      // 37: aload 0
      // 38: getfield h2f.jnd I
      // 3b: aload 3
      // 3c: getfield h2f.jnd I
      // 3f: iload 2
      // 40: ifne 67
      // 43: if_icmpne 6e
      // 46: goto 4d
      // 49: invokestatic h2f.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield h2f.km5 I
      // 51: iload 2
      // 52: ifne 6b
      // 55: goto 5c
      // 58: invokestatic h2f.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 3
      // 5d: getfield h2f.km5 I
      // 60: goto 67
      // 63: invokestatic h2f.a (Loov;)Loov;
      // 66: athrow
      // 67: if_icmpne 6e
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: ireturn
   }

   public int dz9() {
      return (this.jnd << 4) + 8;
   }

   public int rl1() {
      return (this.km5 << 4) + 8;
   }

   public int enc() {
      return this.jnd << 4;
   }

   public int w6k() {
      return this.km5 << 4;
   }

   public int d5v() {
      return (this.jnd << 4) + 15;
   }

   public int btn() {
      return (this.km5 << 4) + 15;
   }

   public mew kpy(int var1, int var2, int var3) {
      return new mew((this.jnd << 4) + var1, var2, (this.km5 << 4) + var3);
   }

   public mew ct7(int var1) {
      return new mew(this.dz9(), var1, this.rl1());
   }

   @Override
   public String toString() {
      long var1 = a ^ 9480340345077L;
      return "[" + this.jnd + b + this.km5 + "]";
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4775810488954254378L, 7413214907489377203L, MethodHandles.lookup().lookupClass()).a(245511851660179L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 97820168806889L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\"óx\u008b jïZ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
