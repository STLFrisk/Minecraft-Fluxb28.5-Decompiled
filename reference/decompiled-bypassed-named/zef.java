import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Random;

public class zef {
   public static boolean j48(String var0) {
      try {
         Integer.parseInt(var0);
         return true;
      } catch (NumberFormatException var2) {
         return false;
      } catch (NullPointerException var3) {
         return false;
      }
   }

   public static Double y8h(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 6
      // 05: dload 0
      // 06: dload 2
      // 07: dcmpg
      // 08: iload 6
      // 0a: ifeq 30
      // 0d: ifge 20
      // 10: goto 17
      // 13: invokestatic zef.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 16: athrow
      // 17: dload 2
      // 18: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1b: areturn
      // 1c: invokestatic zef.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1f: athrow
      // 20: dload 0
      // 21: iload 6
      // 23: ifeq 3e
      // 26: dload 4
      // 28: dcmpl
      // 29: goto 30
      // 2c: invokestatic zef.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2f: athrow
      // 30: ifle 3d
      // 33: dload 4
      // 35: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 38: areturn
      // 39: invokestatic zef.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 3c: athrow
      // 3d: dload 0
      // 3e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 41: areturn
   }

   public static Double lql(double var0, double var2) {
      int var4 = OpaquePredicate.b();

      try {
         if (var4 == 0) {
            return var0 - var2;
         }

         if (!(var0 > var2)) {
            return var2 - var0;
         }
      } catch (NumberFormatException var7) {
         throw a(var7);
      }

      return var0 - var2;
   }

   public static float vyq(long var0) {
      var0 = System.currentTimeMillis() + var0;
      return 0.4F + (float)new Random(var0).nextInt(80000000) / 1.0E9F + 1.45E-9F;
   }

   public static float cpy(float var0, float var1) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextFloat() * (var1 - var0) + var0;
   }

   public static int a61(int var0, int var1) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextInt() * (var1 - var0) + var0;
   }

   public static double ndk(double var0, double var2) {
      SecureRandom var4 = new SecureRandom();
      return var4.nextDouble() * (var2 - var0) + var0;
   }

   public static float l5u(float param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: fload 1
      // 05: fload 0
      // 06: fsub
      // 07: invokestatic java/lang/Math.abs (F)F
      // 0a: ldc 360.0
      // 0c: nop
      // 0d: frem
      // 0e: fstore 3
      // 0f: fload 3
      // 10: ldc 180.0
      // 12: nop
      // 13: iload 2
      // 14: ifeq 2d
      // 17: fcmpl
      // 18: ifle 31
      // 1b: goto 22
      // 1e: invokestatic zef.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 21: athrow
      // 22: ldc 360.0
      // 24: nop
      // 25: fload 3
      // 26: goto 2d
      // 29: invokestatic zef.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2c: athrow
      // 2d: fsub
      // 2e: goto 32
      // 31: fload 3
      // 32: fstore 4
      // 34: fload 4
      // 36: freturn
   }

   public static double dw5(double var0, double var2) {
      return (var0 + var2) / 2.0;
   }

   public static float xwe(float var0, float var1) {
      return (var0 + var1) / 2.0F;
   }

   public static double h1h(double var0, double var2) {
      return (var0 + var2) / 2.0;
   }

   public static int mqt(int var0, int var1) {
      return var0 + a39.nextInt(var1 - var0 + 1);
   }

   public static double sab(double var0, double var2) {
      return var0 + (double)a39.nextInt((int)(var2 - var0 + 1.0));
   }

   public static double iiv(double var0, double var2) {
      Random var5 = new Random();
      double var6 = var2 - var0;
      int var10000 = OpaquePredicate.b();
      double var8 = var5.nextDouble() * var6;
      int var4 = var10000;

      double var10001;
      label39: {
         label38: {
            try {
               var14 = var8;
               var10001 = var2;
               if (var4 == 0) {
                  break label39;
               }

               if (!(var8 > var2)) {
                  break label38;
               }
            } catch (NumberFormatException var13) {
               throw a(var13);
            }

            var8 = var2;
         }

         var14 = var8;
         var10001 = var0;
      }

      double var10 = var14 + var10001;

      try {
         if (var4 == 0) {
            return var10;
         }

         if (!(var10 > var2)) {
            return var10;
         }
      } catch (NumberFormatException var12) {
         throw a(var12);
      }

      return var2;
   }

   public static float d44(float var0, float var1) {
      Random var2 = new Random();
      float var3 = var1 - var0;
      float var4 = var2.nextFloat() * var3;
      return var4 + var0;
   }

   public static int uol(int var0, int var1) {
      Random var2 = new Random();
      return var2.nextInt(var1 - var0 + 1) + var0;
   }

   public static double _ct(double var0, int var2) {
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

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
