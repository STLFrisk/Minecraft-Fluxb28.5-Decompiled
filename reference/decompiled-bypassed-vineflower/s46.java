import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s46 {
   private static final long a;
   private static final String b;

   public s46() {
   }

   public s46(byte[] var1) {
      long var2 = a ^ 126370629128552L;
      super();
      this.h3c = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException(b + var1.length);
      }
   }

   public int n3s(int var1, int var2, int var3) {
      return this.jmc(this.fgm(var1, var2, var3));
   }

   public void h4x(int var1, int var2, int var3, int var4) {
      this.wrm(this.fgm(var1, var2, var3), var4);
   }

   private int fgm(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }

   public int jmc(int param1) {
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
      // 05: iload 1
      // 06: invokespecial s46.i8p (I)I
      // 09: istore 3
      // 0a: aload 0
      // 0b: iload 1
      // 0c: invokespecial s46.nw9 (I)Z
      // 0f: iload 2
      // 10: ifne 35
      // 13: ifeq 2d
      // 16: goto 1d
      // 19: invokestatic s46.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield s46.h3c [B
      // 21: iload 3
      // 22: baload
      // 23: bipush 15
      // 25: iand
      // 26: goto 38
      // 29: invokestatic s46.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield s46.h3c [B
      // 31: iload 3
      // 32: baload
      // 33: bipush 4
      // 34: ishr
      // 35: bipush 15
      // 37: iand
      // 38: ireturn
   }

   public void wrm(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial s46.i8p (I)I
      // 09: istore 4
      // 0b: aload 0
      // 0c: iload 3
      // 0d: ifne 49
      // 10: iload 1
      // 11: invokespecial s46.nw9 (I)Z
      // 14: ifeq 41
      // 17: goto 1e
      // 1a: invokestatic s46.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield s46.h3c [B
      // 22: iload 4
      // 24: aload 0
      // 25: getfield s46.h3c [B
      // 28: iload 4
      // 2a: baload
      // 2b: sipush 240
      // 2e: iand
      // 2f: iload 2
      // 30: bipush 15
      // 32: iand
      // 33: ior
      // 34: i2b
      // 35: bastore
      // 36: iload 3
      // 37: ifeq 61
      // 3a: goto 41
      // 3d: invokestatic s46.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic s46.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: getfield s46.h3c [B
      // 4c: iload 4
      // 4e: aload 0
      // 4f: getfield s46.h3c [B
      // 52: iload 4
      // 54: baload
      // 55: bipush 15
      // 57: iand
      // 58: iload 2
      // 59: bipush 15
      // 5b: iand
      // 5c: bipush 4
      // 5d: ishl
      // 5e: ior
      // 5f: i2b
      // 60: bastore
      // 61: return
   }

   private boolean nw9(int var1) {
      int var2 = t9d.b();

      try {
         int var10000 = var1 & 1;
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   private int i8p(int var1) {
      return var1 >> 1;
   }

   public byte[] rl3() {
      return this.h3c;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2377493096222434746L, -7721375750037522347L, MethodHandles.lookup().lookupClass()).a(114454460815612L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123588564051395L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "d\u0011\u009f\u008aÒ\b\u0005\u000e\fæ\u0098Ä\u0005\u008fõ¤¼>ê<JÚ\u0011í¿Dê\f9Æï\u0097¥\u008aþ¹°rXKjç\u0084\u0007H\tÇ\u001d".getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
