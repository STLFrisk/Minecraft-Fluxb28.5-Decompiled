import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.util.MathUtils;

public class fe6 {
   public static final float lud;
   public static final float dss;
   public static final float gda;
   public static final float zp6;
   public static final float war;
   public static boolean gge;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static float rtn(float var0) {
      try {
         if (gge) {
            return ClientState[(int)(var0 * ns8) & 4095];
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return qt6[(int)(var0 * 10430.378F) & 65535];
   }

   public static float ssk(float var0) {
      try {
         if (gge) {
            return ClientState[(int)(var0 * ns8 + 1024.0F) & 4095];
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return qt6[(int)(var0 * 10430.378F + 16384.0F) & 65535];
   }

   public static float bug(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   public static float dii(double var0) {
      return (float)Math.sqrt(var0);
   }

   public static int tpk(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: fload 0
      // 05: f2i
      // 06: istore 2
      // 07: fload 0
      // 08: iload 2
      // 09: i2f
      // 0a: fcmpg
      // 0b: iload 1
      // 0c: ifne 23
      // 0f: ifge 26
      // 12: goto 19
      // 15: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: iload 2
      // 1a: bipush 1
      // 1b: isub
      // 1c: goto 23
      // 1f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: goto 27
      // 26: iload 2
      // 27: ireturn
   }

   public static int n61(double var0) {
      return (int)(var0 + 1024.0) - 1024;
   }

   public static int jqf(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: dload 0
      // 05: d2i
      // 06: istore 3
      // 07: dload 0
      // 08: iload 3
      // 09: i2d
      // 0a: dcmpg
      // 0b: iload 2
      // 0c: ifeq 23
      // 0f: ifge 26
      // 12: goto 19
      // 15: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: iload 3
      // 1a: bipush 1
      // 1b: isub
      // 1c: goto 23
      // 1f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: goto 27
      // 26: iload 3
      // 27: ireturn
   }

   public static long lfr(double var0) {
      long var2 = (long)var0;

      try {
         if (var0 < (double)var2) {
            return var2 - 1L;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return var2;
   }

   public static int qqq(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: dload 0
      // 05: dconst_0
      // 06: iload 2
      // 07: ifeq 20
      // 0a: dcmpl
      // 0b: iflt 1d
      // 0e: goto 15
      // 11: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: dload 0
      // 16: goto 21
      // 19: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: dload 0
      // 1e: dneg
      // 1f: dconst_1
      // 20: dadd
      // 21: d2i
      // 22: ireturn
   }

   public static float sqg(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: fload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: fconst_0
      // 0a: fcmpl
      // 0b: iflt 1d
      // 0e: goto 15
      // 11: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: fload 0
      // 16: goto 1f
      // 19: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: fload 0
      // 1e: fneg
      // 1f: freturn
   }

   public static int z1m(int var0) {
      try {
         if (var0 >= 0) {
            return var0;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return -var0;
   }

   public static int v1i(float var0) {
      int var1 = (int)var0;

      try {
         if (var0 > (float)var1) {
            return var1 + 1;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      return var1;
   }

   public static int hxe(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: dload 0
      // 05: d2i
      // 06: istore 3
      // 07: dload 0
      // 08: iload 3
      // 09: i2d
      // 0a: dcmpl
      // 0b: iload 2
      // 0c: ifeq 23
      // 0f: ifle 26
      // 12: goto 19
      // 15: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: iload 3
      // 1a: bipush 1
      // 1b: iadd
      // 1c: goto 23
      // 1f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: goto 27
      // 26: iload 3
      // 27: ireturn
   }

   public static int faa(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 0
      // 05: iload 1
      // 06: iload 3
      // 07: ifeq 29
      // 0a: if_icmpge 1c
      // 0d: goto 14
      // 10: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: iload 1
      // 15: goto 31
      // 18: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: iload 0
      // 1d: iload 3
      // 1e: ifeq 2d
      // 21: iload 2
      // 22: goto 29
      // 25: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 28: athrow
      // 29: if_icmple 30
      // 2c: iload 2
      // 2d: goto 31
      // 30: iload 0
      // 31: ireturn
   }

   public static float _f3(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: fload 0
      // 05: fload 1
      // 06: fcmpg
      // 07: iload 3
      // 08: ifne 2b
      // 0b: ifge 1d
      // 0e: goto 15
      // 11: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: fload 1
      // 16: goto 33
      // 19: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: fload 0
      // 1e: iload 3
      // 1f: ifne 2f
      // 22: fload 2
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: ifle 32
      // 2e: fload 2
      // 2f: goto 33
      // 32: fload 0
      // 33: freturn
   }

   public static double lft(double param0, double param2, double param4) {
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
      // 0a: ifeq 2f
      // 0d: ifge 1f
      // 10: goto 17
      // 13: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: dload 2
      // 18: goto 38
      // 1b: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: dload 0
      // 20: iload 6
      // 22: ifeq 34
      // 25: dload 4
      // 27: dcmpl
      // 28: goto 2f
      // 2b: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: ifle 37
      // 32: dload 4
      // 34: goto 38
      // 37: dload 0
      // 38: dreturn
   }

   public static double ldq(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: dload 4
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 6
      // 0b: ifne 30
      // 0e: ifge 20
      // 11: goto 18
      // 14: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: dload 0
      // 19: goto 43
      // 1c: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: dload 4
      // 22: dconst_1
      // 23: iload 6
      // 25: ifne 42
      // 28: dcmpl
      // 29: goto 30
      // 2c: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: ifle 3b
      // 33: dload 2
      // 34: goto 43
      // 37: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a: athrow
      // 3b: dload 0
      // 3c: dload 2
      // 3d: dload 0
      // 3e: dsub
      // 3f: dload 4
      // 41: dmul
      // 42: dadd
      // 43: dreturn
   }

   public static double g8w(double var0, double var2) {
      int var4 = OpaquePredicate.b();

      int var10000;
      label51: {
         label50: {
            try {
               double var9;
               var10000 = (var9 = var0 - 0.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
               if (var4 == 0) {
                  break label51;
               }

               if (var10000 >= 0) {
                  break label50;
               }
            } catch (RuntimeException var7) {
               throw a(var7);
            }

            var0 = -var0;
         }

         double var10;
         var10000 = (var10 = var2 - 0.0) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
      }

      label40: {
         try {
            if (var4 == 0) {
               return var10000 > 0 ? var0 : var2;
            }

            if (var10000 >= 0) {
               break label40;
            }
         } catch (RuntimeException var6) {
            throw a(var6);
         }

         var2 = -var2;
      }

      try {
         if (var4 == 0) {
            return var0;
         }

         double var11;
         var10000 = (var11 = var0 - var2) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
      } catch (RuntimeException var5) {
         throw a(var5);
      }

      return var10000 > 0 ? var0 : var2;
   }

   public static int zji(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 0
      // 05: iload 2
      // 06: ifne 24
      // 09: ifge 23
      // 0c: goto 13
      // 0f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: iload 0
      // 14: ineg
      // 15: bipush 1
      // 16: isub
      // 17: iload 1
      // 18: idiv
      // 19: ineg
      // 1a: bipush 1
      // 1b: isub
      // 1c: goto 26
      // 1f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: iload 0
      // 24: iload 1
      // 25: idiv
      // 26: ireturn
   }

   public static int pzp(Random param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 2
      // 06: iload 3
      // 07: ifeq 26
      // 0a: if_icmplt 1c
      // 0d: goto 14
      // 10: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: iload 1
      // 15: goto 27
      // 18: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 2
      // 1e: iload 1
      // 1f: isub
      // 20: bipush 1
      // 21: iadd
      // 22: invokevirtual java/util/Random.nextInt (I)I
      // 25: iload 1
      // 26: iadd
      // 27: ireturn
   }

   public static float m_l(Random param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: fload 1
      // 05: fload 2
      // 06: iload 3
      // 07: ifne 26
      // 0a: fcmpl
      // 0b: iflt 1d
      // 0e: goto 15
      // 11: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: fload 1
      // 16: goto 27
      // 19: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual java/util/Random.nextFloat ()F
      // 21: fload 2
      // 22: fload 1
      // 23: fsub
      // 24: fmul
      // 25: fload 1
      // 26: fadd
      // 27: freturn
   }

   public static double x16(Random param0, double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: dload 1
      // 06: dload 3
      // 07: iload 5
      // 09: ifeq 28
      // 0c: dcmpl
      // 0d: iflt 1f
      // 10: goto 17
      // 13: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: dload 1
      // 18: goto 29
      // 1b: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual java/util/Random.nextDouble ()D
      // 23: dload 3
      // 24: dload 1
      // 25: dsub
      // 26: dmul
      // 27: dload 1
      // 28: dadd
      // 29: dreturn
   }

   public static double i76(long[] var0) {
      long var2 = 0L;
      long[] var4 = var0;
      int var10000 = OpaquePredicate.b();
      int var5 = var0.length;
      int var6 = 0;
      int var1 = var10000;

      while (true) {
         if (var6 < var5) {
            long var7 = var4[var6];
            var9 = var2 + var7;
            if (var1 == 0) {
               break;
            }

            var2 = var9;
            var6++;
            if (var1 != 0) {
               continue;
            }
         }

         var9 = var2;
         break;
      }

      return (double)var9 / (double)var0.length;
   }

   public static boolean fa2(float var0, float var1) {
      int var2 = OpaquePredicate.b();

      try {
         float var4;
         int var10000 = (var4 = sqg(var1 - var0) - 1.0E-5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public static int ba6(int var0, int var1) {
      return (var0 % var1 + var1) % var1;
   }

   public static float qsy(float var0) {
      int var1 = OpaquePredicate.c();
      var0 %= 360.0F;

      int var10000;
      label34: {
         label33: {
            try {
               float var6;
               var10000 = (var6 = var0 - 180.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
               if (var1 != 0) {
                  break label34;
               }

               if (var10000 < 0) {
                  break label33;
               }
            } catch (RuntimeException var3) {
               throw a(var3);
            }

            var0 -= 360.0F;
         }

         try {
            if (var1 != 0) {
               return var0;
            }

            float var7;
            var10000 = (var7 = var0 - -180.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
         } catch (RuntimeException var2) {
            throw a(var2);
         }
      }

      if (var10000 < 0) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static double lrs(double var0) {
      int var2 = OpaquePredicate.c();
      var0 %= 360.0;

      int var10000;
      label34: {
         label33: {
            try {
               double var7;
               var10000 = (var7 = var0 - 180.0) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
               if (var2 != 0) {
                  break label34;
               }

               if (var10000 < 0) {
                  break label33;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }

            var0 -= 360.0;
         }

         try {
            if (var2 != 0) {
               return var0;
            }

            double var8;
            var10000 = (var8 = var0 - -180.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
         } catch (RuntimeException var3) {
            throw a(var3);
         }
      }

      if (var10000 < 0) {
         var0 += 360.0;
      }

      return var0;
   }

   public static int e9x(String var0, int var1) {
      try {
         return Integer.parseInt(var0);
      } catch (Throwable var3) {
         return var1;
      }
   }

   public static int rfv(String var0, int var1, int var2) {
      return Math.max(var2, e9x(var0, var1));
   }

   public static double v6n(String var0, double var1) {
      try {
         return Double.parseDouble(var0);
      } catch (Throwable var4) {
         return var1;
      }
   }

   public static double s2_(String var0, double var1, double var3) {
      return Math.max(var3, v6n(var0, var1));
   }

   public static int l0o(int var0) {
      int var1 = var0 - 1;
      var1 |= var1 >> 1;
      var1 |= var1 >> 2;
      var1 |= var1 >> 4;
      var1 |= var1 >> 8;
      var1 |= var1 >> 16;
      return var1 + 1;
   }

   private static boolean rzs(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 0
      // 01: ifeq 1b
      // 04: iload 0
      // 05: iload 0
      // 06: bipush 1
      // 07: isub
      // 08: iand
      // 09: ifne 1b
      // 0c: goto 13
      // 0f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 1c
      // 17: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
   }

   private static int sn0(int var0) {
      int var10000;
      label16: {
         try {
            if (rzs(var0)) {
               var10000 = var0;
               break label16;
            }
         } catch (RuntimeException var1) {
            throw a(var1);
         }

         var10000 = l0o(var0);
      }

      var0 = var10000;
      return xk_[(int)((long)var0 * 125613361L >> 27) & 31];
   }

   public static int xjr(int var0) {
      int var10000;
      try {
         var10000 = sn0(var0);
         if (rzs(var0)) {
            return var10000 - 0;
         }
      } catch (RuntimeException var1) {
         throw a(var1);
      }

      return var10000 - 1;
   }

   public static int v6y(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 1a
      // 09: ifne 19
      // 0c: goto 13
      // 0f: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: iload 0
      // 1a: iload 2
      // 1b: ifne 2f
      // 1e: ifne 2e
      // 21: goto 28
      // 24: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: iload 1
      // 29: ireturn
      // 2a: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: iload 0
      // 2f: iload 2
      // 30: ifne 44
      // 33: ifge 41
      // 36: goto 3d
      // 39: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: iload 1
      // 3e: bipush -1
      // 3f: imul
      // 40: istore 1
      // 41: iload 0
      // 42: iload 1
      // 43: irem
      // 44: istore 3
      // 45: iload 3
      // 46: iload 2
      // 47: ifne 5f
      // 4a: ifne 5c
      // 4d: goto 54
      // 50: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: iload 0
      // 55: goto 61
      // 58: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: iload 0
      // 5d: iload 1
      // 5e: iadd
      // 5f: iload 3
      // 60: isub
      // 61: ireturn
   }

   public static int __u(float var0, float var1, float var2) {
      return i0s(tpk(var0 * 255.0F), tpk(var1 * 255.0F), tpk(var2 * 255.0F));
   }

   public static int i0s(int var0, int var1, int var2) {
      int var3 = (var0 << 8) + var1;
      return (var3 << 8) + var2;
   }

   public static int rsi(int var0, int var1) {
      int var2 = (var0 & 0xFF0000) >> 16;
      int var3 = (var1 & 0xFF0000) >> 16;
      int var4 = (var0 & 0xFF00) >> 8;
      int var5 = (var1 & 0xFF00) >> 8;
      int var6 = (var0 & 0xFF) >> 0;
      int var7 = (var1 & 0xFF) >> 0;
      int var8 = (int)((float)var2 * (float)var3 / 255.0F);
      int var9 = (int)((float)var4 * (float)var5 / 255.0F);
      int var10 = (int)((float)var6 * (float)var7 / 255.0F);
      return var0 & 0xFF000000 | var8 << 16 | var9 << 8 | var10;
   }

   public static double cnn(double var0) {
      return var0 - Math.floor(var0);
   }

   public static long n88(wgo var0) {
      return u98(var0.getX(), var0.getY(), var0.getZ());
   }

   public static long u98(int var0, int var1, int var2) {
      long var3 = (long)(var0 * 3129871) ^ (long)var2 * 116129781L ^ (long)var1;
      return var3 * var3 * 42317861L + var3 * 11L;
   }

   public static UUID _g4(Random var0) {
      long var1 = var0.nextLong() & -61441L | 16384L;
      long var3 = var0.nextLong() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(var1, var3);
   }

   public static double hx5(double var0, double var2, double var4) {
      return (var0 - var2) / (var4 - var2);
   }

   public static double yr8(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: dload 2
      // 006: dload 2
      // 007: dmul
      // 008: dload 0
      // 009: dload 0
      // 00a: dmul
      // 00b: dadd
      // 00c: dstore 5
      // 00e: dload 5
      // 010: invokestatic java/lang/Double.isNaN (D)Z
      // 013: iload 4
      // 015: ifeq 02d
      // 018: ifeq 02a
      // 01b: goto 022
      // 01e: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 021: athrow
      // 022: ldc2_w NaN
      // 025: dreturn
      // 026: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 029: athrow
      // 02a: dload 0
      // 02b: dconst_0
      // 02c: dcmpg
      // 02d: iload 4
      // 02f: ifeq 03d
      // 032: ifge 040
      // 035: goto 03c
      // 038: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: goto 041
      // 040: bipush 0
      // 041: istore 7
      // 043: iload 7
      // 045: iload 4
      // 047: ifeq 05a
      // 04a: ifeq 057
      // 04d: goto 054
      // 050: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 053: athrow
      // 054: dload 0
      // 055: dneg
      // 056: dstore 0
      // 057: dload 2
      // 058: dconst_0
      // 059: dcmpg
      // 05a: iload 4
      // 05c: ifeq 06a
      // 05f: ifge 06d
      // 062: goto 069
      // 065: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 068: athrow
      // 069: bipush 1
      // 06a: goto 06e
      // 06d: bipush 0
      // 06e: istore 8
      // 070: iload 8
      // 072: iload 4
      // 074: ifeq 087
      // 077: ifeq 084
      // 07a: goto 081
      // 07d: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 080: athrow
      // 081: dload 2
      // 082: dneg
      // 083: dstore 2
      // 084: dload 0
      // 085: dload 2
      // 086: dcmpl
      // 087: iload 4
      // 089: ifeq 097
      // 08c: ifle 09a
      // 08f: goto 096
      // 092: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 095: athrow
      // 096: bipush 1
      // 097: goto 09b
      // 09a: bipush 0
      // 09b: istore 9
      // 09d: iload 9
      // 09f: ifeq 0aa
      // 0a2: dload 2
      // 0a3: dstore 10
      // 0a5: dload 0
      // 0a6: dstore 2
      // 0a7: dload 10
      // 0a9: dstore 0
      // 0aa: dload 5
      // 0ac: invokestatic fe6.lg6 (D)D
      // 0af: dstore 10
      // 0b1: dload 2
      // 0b2: dload 10
      // 0b4: dmul
      // 0b5: dstore 2
      // 0b6: dload 0
      // 0b7: dload 10
      // 0b9: dmul
      // 0ba: dstore 0
      // 0bb: getstatic fe6.y33 D
      // 0be: dload 0
      // 0bf: dadd
      // 0c0: dstore 12
      // 0c2: dload 12
      // 0c4: invokestatic java/lang/Double.doubleToRawLongBits (D)J
      // 0c7: l2i
      // 0c8: istore 14
      // 0ca: getstatic fe6.r0x [D
      // 0cd: iload 14
      // 0cf: daload
      // 0d0: dstore 15
      // 0d2: getstatic fe6.pwt [D
      // 0d5: iload 14
      // 0d7: daload
      // 0d8: dstore 17
      // 0da: dload 12
      // 0dc: getstatic fe6.y33 D
      // 0df: dsub
      // 0e0: dstore 19
      // 0e2: dload 0
      // 0e3: dload 17
      // 0e5: dmul
      // 0e6: dload 2
      // 0e7: dload 19
      // 0e9: dmul
      // 0ea: dsub
      // 0eb: dstore 21
      // 0ed: ldc2_w 6.0
      // 0f0: dload 21
      // 0f2: dload 21
      // 0f4: dmul
      // 0f5: dadd
      // 0f6: dload 21
      // 0f8: dmul
      // 0f9: ldc2_w 0.16666666666666666
      // 0fc: dmul
      // 0fd: dstore 23
      // 0ff: dload 15
      // 101: dload 23
      // 103: dadd
      // 104: dstore 25
      // 106: iload 9
      // 108: iload 4
      // 10a: ifeq 121
      // 10d: ifeq 11f
      // 110: goto 117
      // 113: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 116: athrow
      // 117: ldc2_w 1.5707963267948966
      // 11a: dload 25
      // 11c: dsub
      // 11d: dstore 25
      // 11f: iload 8
      // 121: iload 4
      // 123: ifeq 13a
      // 126: ifeq 138
      // 129: goto 130
      // 12c: invokestatic fe6.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12f: athrow
      // 130: ldc2_w 3.141592653589793
      // 133: dload 25
      // 135: dsub
      // 136: dstore 25
      // 138: iload 7
      // 13a: ifeq 142
      // 13d: dload 25
      // 13f: dneg
      // 140: dstore 25
      // 142: dload 25
      // 144: dreturn
   }

   public static double lg6(double var0) {
      double var2 = 0.5 * var0;
      long var4 = Double.doubleToRawLongBits(var0);
      var4 = 6910469410427058090L - (var4 >> 1);
      var0 = Double.longBitsToDouble(var4);
      return var0 * (1.5 - var2 * var0 * var0);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int zgt(float var0, float var1, float var2) {
      float var11;
      float var12;
      float var13;
      label32: {
         long var3 = a ^ 71473979221240L;
         int var6 = (int)(var0 * 6.0F) % 6;
         float var7 = var0 * 6.0F - (float)var6;
         int var10000 = OpaquePredicate.c();
         float var8 = var2 * (1.0F - var1);
         float var9 = var2 * (1.0F - var7 * var1);
         float var10 = var2 * (1.0F - (1.0F - var7) * var1);
         int var5 = var10000;
         RuntimeException var19;
         switch (var6) {
            case 0:
               var11 = var2;
               var12 = var10;
               var13 = var8;
               if (var5 == 0) {
                  break label32;
               }
            case 1:
               var11 = var9;
               var12 = var2;
               var13 = var8;
               if (var5 == 0) {
                  break label32;
               }
            case 2:
               var11 = var8;
               var12 = var2;
               var13 = var10;
               if (var5 == 0) {
                  break label32;
               }
            case 3:
               var11 = var8;
               var12 = var9;
               var13 = var2;
               if (var5 == 0) {
                  break label32;
               }
            case 4:
               var11 = var10;
               var12 = var8;
               var13 = var2;
               if (var5 == 0) {
                  break label32;
               }
            case 5:
               var11 = var2;
               var12 = var8;
               var13 = var9;

               try {
                  if (var5 == 0) {
                     break label32;
                  }
               } catch (RuntimeException var18) {
                  var19 = var18;
                  boolean var10001 = false;
                  break;
               }
            default:
               try {
                  throw new RuntimeException(
                     a<"k">(15947, 3731907406502608594L ^ var3)
                        + var0
                        + a<"k">(28295, 2640727113052548637L ^ var3)
                        + var1
                        + a<"k">(28611, 8832454880494645083L ^ var3)
                        + var2
                  );
               } catch (RuntimeException var17) {
                  var19 = var17;
                  boolean var20 = false;
               }
         }

         throw a(var19);
      }

      int var14 = faa((int)(var11 * 255.0F), 0, 255);
      int var15 = faa((int)(var12 * 255.0F), 0, 255);
      int var16 = faa((int)(var13 * 255.0F), 0, 255);
      return var14 << 16 | var15 << 8 | var16;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5159419232445078062L, 283982269229323836L, MethodHandles.lookup().lookupClass()).a(262798614639315L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 122343988955733L;
      Cipher var2;
      Cipher var21 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var21.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0091¯\u0082±G\u0094\u0019\u0083Í¤%Ô&s@|xÚçõú\u000e\"my-+Ïa?q2UÑ:=\u000b*\u0015\u0099\u0092\u008a¥Y\u0017\u0084G&T7\u0087¤py¢+q¬Ä+\u0080\u00ad]\u008e-\u000e^ÁÍIæçs 'ÔT½\u0093D!J¾hPKcð\"N\u0012\u0018&¨õ\u0018\u001f\\%³¾\u009eN\u000b\u008b.¸\rÞ¢\u008f\u008e\u000fù`ÀÍT¹íêÊL\u0094d²!\u007f´Á%7eýË¸r\u0010\fgî8\u0015(\u008a\u008bíBÆr:¶j\u000e";
      int var8 = "\u0091¯\u0082±G\u0094\u0019\u0083Í¤%Ô&s@|xÚçõú\u000e\"my-+Ïa?q2UÑ:=\u000b*\u0015\u0099\u0092\u008a¥Y\u0017\u0084G&T7\u0087¤py¢+q¬Ä+\u0080\u00ad]\u008e-\u000e^ÁÍIæçs 'ÔT½\u0093D!J¾hPKcð\"N\u0012\u0018&¨õ\u0018\u001f\\%³¾\u009eN\u000b\u008b.¸\rÞ¢\u008f\u008e\u000fù`ÀÍT¹íêÊL\u0094d²!\u007f´Á%7eýË¸r\u0010\fgî8\u0015(\u008a\u008bíBÆr:¶j\u000e"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var23 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var23;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            lud = bug(2.0F);
            dss = MathUtils.roundToFloat(Math.PI);
            gda = MathUtils.roundToFloat(Math.PI * 2);
            zp6 = MathUtils.roundToFloat(Math.PI / 2);
            ns8 = MathUtils.roundToFloat(651.8986469044033);
            war = MathUtils.roundToFloat(Math.PI / 180.0);
            ClientState = new float[4096];
            gge = false;
            qt6 = new float[65536];
            int var11 = 0;

            try {
               while (var11 < 65536) {
                  qt6[var11] = (float)Math.sin((double)var11 * Math.PI * 2.0 / 65536.0);
                  var11++;
               }
            } catch (RuntimeException var17) {
               throw a(var17);
            }

            var11 = 0;

            try {
               while (var11 < ClientState.length) {
                  ClientState[var11] = MathUtils.roundToFloat(Math.sin((double)var11 * Math.PI * 2.0 / 4096.0));
                  var11++;
               }
            } catch (RuntimeException var16) {
               throw a(var16);
            }

            xk_ = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
            y33 = Double.longBitsToDouble(4805340802404319232L);
            r0x = new double[257];
            pwt = new double[257];

            for (int var20 = 0; var20 < 257; var20++) {
               double var12 = (double)var20 / 256.0;
               double var14 = Math.asin(var12);
               pwt[var20] = Math.cos(var14);
               r0x[var20] = var14;
            }

            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11836;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("fe6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("fe6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
