import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class rak {
   public static float u1m(float var0, float var1, float var2, float var3, float var4) {
      return (var0 - var1) / (var2 - var1) * (var4 - var3) + var3;
   }

   public static boolean c38(float param0, float param1, float param2, float param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: fload 0
      // 06: fload 2
      // 07: fcmpl
      // 08: iload 6
      // 0a: ifne 22
      // 0d: ifle 68
      // 10: goto 17
      // 13: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 16: athrow
      // 17: fload 0
      // 18: fload 4
      // 1a: fcmpg
      // 1b: goto 22
      // 1e: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 21: athrow
      // 22: iload 6
      // 24: ifne 3b
      // 27: ifge 68
      // 2a: goto 31
      // 2d: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 30: athrow
      // 31: fload 1
      // 32: fload 3
      // 33: fcmpl
      // 34: goto 3b
      // 37: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3a: athrow
      // 3b: iload 6
      // 3d: ifne 55
      // 40: ifle 68
      // 43: goto 4a
      // 46: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 49: athrow
      // 4a: fload 1
      // 4b: fload 5
      // 4d: fcmpg
      // 4e: goto 55
      // 51: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 54: athrow
      // 55: iload 6
      // 57: ifne 65
      // 5a: ifge 68
      // 5d: goto 64
      // 60: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   public static boolean j0d(float param0, float param1, gpo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: fload 0
      // 05: aload 2
      // 06: invokevirtual gpo.uw6 ()F
      // 09: fcmpl
      // 0a: iload 3
      // 0b: ifeq 2a
      // 0e: ifle 77
      // 11: goto 18
      // 14: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 17: athrow
      // 18: fload 0
      // 19: aload 2
      // 1a: invokevirtual gpo.uw6 ()F
      // 1d: aload 2
      // 1e: invokevirtual gpo._92 ()F
      // 21: fadd
      // 22: fcmpg
      // 23: goto 2a
      // 26: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 29: athrow
      // 2a: iload 3
      // 2b: ifeq 45
      // 2e: ifge 77
      // 31: goto 38
      // 34: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 37: athrow
      // 38: fload 1
      // 39: aload 2
      // 3a: invokevirtual gpo.fyx ()F
      // 3d: fcmpl
      // 3e: goto 45
      // 41: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 44: athrow
      // 45: iload 3
      // 46: ifeq 65
      // 49: ifle 77
      // 4c: goto 53
      // 4f: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 52: athrow
      // 53: fload 1
      // 54: aload 2
      // 55: invokevirtual gpo.fyx ()F
      // 58: aload 2
      // 59: invokevirtual gpo.zqn ()F
      // 5c: fadd
      // 5d: fcmpg
      // 5e: goto 65
      // 61: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 64: athrow
      // 65: iload 3
      // 66: ifeq 74
      // 69: ifge 77
      // 6c: goto 73
      // 6f: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 78
      // 77: bipush 0
      // 78: ireturn
   }

   public static boolean fip(String var0) {
      try {
         Integer.parseInt(var0);
         return true;
      } catch (NumberFormatException var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public static int t7v(int var0, int var1) {
      return (var0 + var1) / 2;
   }

   public static boolean fye(String var0) {
      try {
         Double.parseDouble(var0);
         return true;
      } catch (NumberFormatException var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public static boolean ril(String var0) {
      try {
         Float.parseFloat(var0);
         return true;
      } catch (NumberFormatException var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public static boolean s82(String var0) {
      try {
         Long.parseLong(var0);
         return true;
      } catch (NumberFormatException var2) {
         var2.printStackTrace();
         return false;
      }
   }

   public static Random eox() {
      return zsz;
   }

   public static double b5b(double var0, int var2) {
      try {
         if (var2 < 0) {
            throw new IllegalArgumentException();
         }
      } catch (NumberFormatException var4) {
         throw a(var4);
      }

      BigDecimal var3 = new BigDecimal(var0);
      var3 = var3.setScale(var2, RoundingMode.HALF_UP);
      return var3.doubleValue();
   }

   public static float x5f() {
      return zsz.nextFloat();
   }

   public static int lc5(int var0) {
      return zsz.nextInt(var0);
   }

   public static int dsf(int var0, int var1) {
      return var0 + zsz.nextInt(var1 - var0 + 1);
   }

   public static int tle(int var0, int var1) {
      return new Random().nextInt(var1 - var0 + 1) + var0;
   }

   public static float wtd(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: fload 0
      // 05: fload 1
      // 06: fcmpg
      // 07: iload 3
      // 08: ifne 29
      // 0b: ifge 1b
      // 0e: goto 15
      // 11: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 14: athrow
      // 15: fload 1
      // 16: freturn
      // 17: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1a: athrow
      // 1b: fload 0
      // 1c: iload 3
      // 1d: ifne 33
      // 20: fload 2
      // 21: fcmpl
      // 22: goto 29
      // 25: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 28: athrow
      // 29: ifle 32
      // 2c: fload 2
      // 2d: freturn
      // 2e: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 31: athrow
      // 32: fload 0
      // 33: freturn
   }

   public static float uzz(String param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/String.length ()I
      // 04: aload 1
      // 05: invokevirtual java/lang/String.length ()I
      // 08: invokestatic java/lang/Math.min (II)I
      // 0b: bipush 2
      // 0c: idiv
      // 0d: aload 0
      // 0e: invokevirtual java/lang/String.length ()I
      // 11: aload 1
      // 12: invokevirtual java/lang/String.length ()I
      // 15: invokestatic java/lang/Math.min (II)I
      // 18: bipush 2
      // 19: irem
      // 1a: iadd
      // 1b: istore 3
      // 1c: invokestatic t9d.c ()I
      // 1f: aload 0
      // 20: aload 1
      // 21: iload 3
      // 22: invokestatic rak.he2 (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuffer;
      // 25: astore 4
      // 27: istore 2
      // 28: aload 1
      // 29: aload 0
      // 2a: iload 3
      // 2b: invokestatic rak.he2 (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuffer;
      // 2e: astore 5
      // 30: aload 4
      // 32: invokevirtual java/lang/StringBuffer.length ()I
      // 35: iload 2
      // 36: ifne 4f
      // 39: ifeq 5d
      // 3c: goto 43
      // 3f: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 42: athrow
      // 43: aload 5
      // 45: invokevirtual java/lang/StringBuffer.length ()I
      // 48: goto 4f
      // 4b: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 4e: athrow
      // 4f: iload 2
      // 50: ifne 68
      // 53: ifne 63
      // 56: goto 5d
      // 59: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 5c: athrow
      // 5d: fconst_0
      // 5e: freturn
      // 5f: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 62: athrow
      // 63: aload 4
      // 65: invokevirtual java/lang/StringBuffer.length ()I
      // 68: iload 2
      // 69: ifne 82
      // 6c: aload 5
      // 6e: invokevirtual java/lang/StringBuffer.length ()I
      // 71: if_icmpeq 81
      // 74: goto 7b
      // 77: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7a: athrow
      // 7b: fconst_0
      // 7c: freturn
      // 7d: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 80: athrow
      // 81: bipush 0
      // 82: istore 6
      // 84: aload 4
      // 86: invokevirtual java/lang/StringBuffer.length ()I
      // 89: istore 7
      // 8b: bipush 0
      // 8c: istore 8
      // 8e: iload 8
      // 90: iload 7
      // 92: if_icmpge bb
      // 95: aload 4
      // 97: iload 8
      // 99: invokevirtual java/lang/StringBuffer.charAt (I)C
      // 9c: aload 5
      // 9e: iload 8
      // a0: invokevirtual java/lang/StringBuffer.charAt (I)C
      // a3: iload 2
      // a4: ifne e4
      // a7: if_icmpeq b4
      // aa: goto b1
      // ad: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // b0: athrow
      // b1: iinc 6 1
      // b4: iinc 8 1
      // b7: iload 2
      // b8: ifeq 8e
      // bb: iload 6
      // bd: bipush 2
      // be: idiv
      // bf: istore 6
      // c1: aload 4
      // c3: invokevirtual java/lang/StringBuffer.length ()I
      // c6: aload 0
      // c7: invokevirtual java/lang/String.length ()I
      // ca: idiv
      // cb: aload 5
      // cd: invokevirtual java/lang/StringBuffer.length ()I
      // d0: aload 1
      // d1: invokevirtual java/lang/String.length ()I
      // d4: idiv
      // d5: iadd
      // d6: aload 4
      // d8: invokevirtual java/lang/StringBuffer.length ()I
      // db: iload 6
      // dd: isub
      // de: aload 4
      // e0: invokevirtual java/lang/StringBuffer.length ()I
      // e3: idiv
      // e4: iadd
      // e5: i2f
      // e6: ldc 3.0
      // e8: nop
      // e9: fdiv
      // ea: freturn
   }

   private static StringBuffer he2(String param0, String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/lang/StringBuffer
      // 03: dup
      // 04: invokespecial java/lang/StringBuffer.<init> ()V
      // 07: astore 4
      // 09: invokestatic t9d.c ()I
      // 0c: new java/lang/StringBuffer
      // 0f: dup
      // 10: aload 1
      // 11: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 14: astore 5
      // 16: aload 0
      // 17: invokevirtual java/lang/String.length ()I
      // 1a: istore 6
      // 1c: istore 3
      // 1d: aload 1
      // 1e: invokevirtual java/lang/String.length ()I
      // 21: istore 7
      // 23: bipush 0
      // 24: istore 8
      // 26: iload 8
      // 28: iload 6
      // 2a: if_icmpge a5
      // 2d: aload 0
      // 2e: iload 8
      // 30: invokevirtual java/lang/String.charAt (I)C
      // 33: istore 9
      // 35: bipush 0
      // 36: istore 10
      // 38: bipush 0
      // 39: iload 8
      // 3b: iload 2
      // 3c: isub
      // 3d: invokestatic java/lang/Math.max (II)I
      // 40: istore 11
      // 42: iload 10
      // 44: ifne 9e
      // 47: iload 11
      // 49: iload 8
      // 4b: iload 2
      // 4c: iadd
      // 4d: iload 7
      // 4f: bipush 1
      // 50: isub
      // 51: invokestatic java/lang/Math.min (II)I
      // 54: iload 3
      // 55: ifne 2a
      // 58: iload 3
      // 59: ifne 81
      // 5c: if_icmpge 9e
      // 5f: goto 66
      // 62: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 65: athrow
      // 66: aload 5
      // 68: iload 11
      // 6a: invokevirtual java/lang/StringBuffer.charAt (I)C
      // 6d: iload 3
      // 6e: ifne 85
      // 71: goto 78
      // 74: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 77: athrow
      // 78: iload 9
      // 7a: goto 81
      // 7d: invokestatic rak.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 80: athrow
      // 81: if_icmpne 97
      // 84: bipush 1
      // 85: istore 10
      // 87: aload 4
      // 89: iload 9
      // 8b: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 8e: pop
      // 8f: aload 5
      // 91: iload 11
      // 93: bipush 0
      // 94: invokevirtual java/lang/StringBuffer.setCharAt (IC)V
      // 97: iinc 11 1
      // 9a: iload 3
      // 9b: ifeq 42
      // 9e: iinc 8 1
      // a1: iload 3
      // a2: ifeq 26
      // a5: aload 4
      // a7: areturn
   }

   public static double rzd(double var0, int var2) {
      try {
         if (var2 < 0) {
            throw new IllegalArgumentException();
         }
      } catch (NumberFormatException var4) {
         throw a(var4);
      }

      BigDecimal var3 = new BigDecimal(var0);
      var3 = var3.setScale(var2, RoundingMode.HALF_UP);
      return var3.doubleValue();
   }

   public static int z60(int var0, int var1) {
      return new Random().nextInt(var1 - var0 + 1) + var0;
   }

   public static double meb(double var0, int var2) {
      try {
         if (var2 < 0) {
            throw new IllegalArgumentException();
         }
      } catch (NumberFormatException var4) {
         throw a(var4);
      }

      BigDecimal var3 = new BigDecimal(var0);
      var3 = var3.setScale(var2, RoundingMode.HALF_UP);
      return var3.doubleValue();
   }

   public static double f0z(double var0, double var2) {
      double var4 = var0 - var2;
      return Math.sqrt(var4 * var4);
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
