import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class bc_ implements on1 {
   private static q11 awz;
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public int bag() {
      return 4;
   }

   @Override
   public List dnz() {
      return Collections.emptyList();
   }

   @Override
   public boolean m6l(e7r var1) {
      return var1.ge4(this.bag(), this.xue());
   }

   @Override
   public List ggu(e7r var1, String[] var2, mew var3) {
      return null;
   }

   public static int ll_(String var0) {
      long var1 = b ^ 113106122138532L;

      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var4) {
         throw new cco(a<"c">(31831, 8511694874887816646L ^ var1), new Object[]{var0});
      }
   }

   public static int o_t(String var0, int var1) {
      return fzm(var0, var1, Integer.MAX_VALUE);
   }

   public static int fzm(String param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 94242635606651
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: invokestatic bc_.ll_ (Ljava/lang/String;)I
      // 11: istore 6
      // 13: iload 6
      // 15: iload 1
      // 16: iload 5
      // 18: ifeq 61
      // 1b: if_icmpge 52
      // 1e: goto 25
      // 21: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new cco
      // 28: dup
      // 29: sipush 26997
      // 2c: ldc2_w 965683508284922149
      // 2f: lload 3
      // 30: lxor
      // 31: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: bipush 2
      // 38: anewarray 24
      // 3b: dup
      // 3c: bipush 0
      // 3d: iload 6
      // 3f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 42: aastore
      // 43: dup
      // 44: bipush 1
      // 45: iload 1
      // 46: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 49: aastore
      // 4a: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 4d: athrow
      // 4e: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: iload 6
      // 54: iload 5
      // 56: ifeq 93
      // 59: iload 2
      // 5a: goto 61
      // 5d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: if_icmple 91
      // 64: new cco
      // 67: dup
      // 68: sipush 30617
      // 6b: ldc2_w 959721237010646994
      // 6e: lload 3
      // 6f: lxor
      // 70: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: nop
      // 76: bipush 2
      // 77: anewarray 24
      // 7a: dup
      // 7b: bipush 0
      // 7c: iload 6
      // 7e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 81: aastore
      // 82: dup
      // 83: bipush 1
      // 84: iload 2
      // 85: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 88: aastore
      // 89: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 8c: athrow
      // 8d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: iload 6
      // 93: ireturn
   }

   public static long iy4(String var0) {
      long var1 = b ^ 112670562077159L;

      try {
         return Long.parseLong(var0);
      } catch (NumberFormatException var4) {
         throw new cco(a<"c">(11330, 8966332028340010889L ^ var1), new Object[]{var0});
      }
   }

   public static long n4o(String param0, long param1, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 52266289827530
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 7
      // 0e: aload 0
      // 0f: invokestatic bc_.iy4 (Ljava/lang/String;)J
      // 12: lstore 8
      // 14: lload 8
      // 16: lload 1
      // 17: lcmp
      // 18: iload 7
      // 1a: ifne 65
      // 1d: ifge 55
      // 20: goto 27
      // 23: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: new cco
      // 2a: dup
      // 2b: sipush 1576
      // 2e: ldc2_w 8498884902044963537
      // 31: lload 5
      // 33: lxor
      // 34: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: bipush 2
      // 3b: anewarray 24
      // 3e: dup
      // 3f: bipush 0
      // 40: lload 8
      // 42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45: aastore
      // 46: dup
      // 47: bipush 1
      // 48: lload 1
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: aastore
      // 4d: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 50: athrow
      // 51: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: lload 8
      // 57: iload 7
      // 59: ifne 98
      // 5c: lload 3
      // 5d: lcmp
      // 5e: goto 65
      // 61: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ifle 96
      // 68: new cco
      // 6b: dup
      // 6c: sipush 17230
      // 6f: ldc2_w 6311532866042648502
      // 72: lload 5
      // 74: lxor
      // 75: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: bipush 2
      // 7c: anewarray 24
      // 7f: dup
      // 80: bipush 0
      // 81: lload 8
      // 83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 86: aastore
      // 87: dup
      // 88: bipush 1
      // 89: lload 3
      // 8a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8d: aastore
      // 8e: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 91: athrow
      // 92: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: lload 8
      // 98: lreturn
   }

   public static mew tiq(e7r var0, String[] var1, int var2, boolean var3) {
      mew var4 = var0.d3d();
      return new mew(
         bll((double)var4.getX(), var1[var2], -30000000, 30000000, var3),
         bll((double)var4.getY(), var1[var2 + 1], 0, 256, false),
         bll((double)var4.getZ(), var1[var2 + 2], -30000000, 30000000, var3)
      );
   }

   public static double gdo(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 60841452731234
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokestatic java/lang/Double.parseDouble (Ljava/lang/String;)D
      // 10: dstore 4
      // 12: dload 4
      // 14: iload 3
      // 15: ifne 49
      // 18: invokestatic com/google/common/primitives/Doubles.isFinite (D)Z
      // 1b: ifne 47
      // 1e: goto 25
      // 21: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new cco
      // 28: dup
      // 29: sipush 11330
      // 2c: ldc2_w 8966277999113587980
      // 2f: lload 1
      // 30: lxor
      // 31: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: bipush 1
      // 38: anewarray 24
      // 3b: dup
      // 3c: bipush 0
      // 3d: aload 0
      // 3e: aastore
      // 3f: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 42: athrow
      // 43: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: dload 4
      // 49: dreturn
      // 4a: astore 4
      // 4c: new cco
      // 4f: dup
      // 50: sipush 11330
      // 53: ldc2_w 8966277999113587980
      // 56: lload 1
      // 57: lxor
      // 58: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: nop
      // 5e: bipush 1
      // 5f: anewarray 24
      // 62: dup
      // 63: bipush 0
      // 64: aload 0
      // 65: aastore
      // 66: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 69: athrow
   }

   public static double s5i(String var0, double var1) {
      return mfx(var0, var1, Double.MAX_VALUE);
   }

   public static double mfx(String param0, double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 44072564578026
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 7
      // 0e: aload 0
      // 0f: invokestatic bc_.gdo (Ljava/lang/String;)D
      // 12: dstore 8
      // 14: dload 8
      // 16: dload 1
      // 17: dcmpg
      // 18: iload 7
      // 1a: ifeq 65
      // 1d: ifge 55
      // 20: goto 27
      // 23: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: new cco
      // 2a: dup
      // 2b: sipush 12552
      // 2e: ldc2_w 5520154874138131919
      // 31: lload 5
      // 33: lxor
      // 34: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: bipush 2
      // 3b: anewarray 24
      // 3e: dup
      // 3f: bipush 0
      // 40: dload 8
      // 42: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 45: aastore
      // 46: dup
      // 47: bipush 1
      // 48: dload 1
      // 49: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 4c: aastore
      // 4d: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 50: athrow
      // 51: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: dload 8
      // 57: iload 7
      // 59: ifeq 98
      // 5c: dload 3
      // 5d: dcmpl
      // 5e: goto 65
      // 61: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ifle 96
      // 68: new cco
      // 6b: dup
      // 6c: sipush 2490
      // 6f: ldc2_w 6005078665108833653
      // 72: lload 5
      // 74: lxor
      // 75: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: bipush 2
      // 7c: anewarray 24
      // 7f: dup
      // 80: bipush 0
      // 81: dload 8
      // 83: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 86: aastore
      // 87: dup
      // 88: bipush 1
      // 89: dload 3
      // 8a: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 8d: aastore
      // 8e: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 91: athrow
      // 92: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: dload 8
      // 98: dreturn
   }

   public static boolean c8r(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 79404098250312
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: sipush 3307
      // 10: ldc2_w 4860152274150912140
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e: iload 3
      // 1f: ifne b0
      // 22: ifne af
      // 25: goto 2c
      // 28: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: ldc "1"
      // 2f: nop
      // 30: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33: iload 3
      // 34: ifne b0
      // 37: goto 3e
      // 3a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: ifne af
      // 41: goto 48
      // 44: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 0
      // 49: sipush 22270
      // 4c: ldc2_w 2384439035515906712
      // 4f: lload 1
      // 50: lxor
      // 51: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: nop
      // 57: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5a: iload 3
      // 5b: ifne ae
      // 5e: goto 65
      // 61: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ifne ad
      // 68: goto 6f
      // 6b: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: aload 0
      // 70: ldc "0"
      // 72: nop
      // 73: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 76: iload 3
      // 77: ifne ae
      // 7a: goto 81
      // 7d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: ifne ad
      // 84: goto 8b
      // 87: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: new uvb
      // 8e: dup
      // 8f: sipush 11210
      // 92: ldc2_w 7541998049853462435
      // 95: lload 1
      // 96: lxor
      // 97: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: bipush 1
      // 9e: anewarray 24
      // a1: dup
      // a2: bipush 0
      // a3: aload 0
      // a4: aastore
      // a5: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // a8: athrow
      // a9: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: bipush 0
      // ae: ireturn
      // af: bipush 1
      // b0: ireturn
   }

   public static z96 cfc(e7r param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 135795796626142
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 26
      // 11: instanceof z96
      // 14: ifeq 2a
      // 17: goto 1e
      // 1a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: checkcast z96
      // 29: areturn
      // 2a: new iez
      // 2d: dup
      // 2e: sipush 15315
      // 31: ldc2_w 6444356000372452138
      // 34: lload 1
      // 35: lxor
      // 36: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: nop
      // 3c: bipush 0
      // 3d: anewarray 24
      // 40: invokespecial iez.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 43: athrow
   }

   public static z96 h32(e7r param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokestatic z83.gwq (Le7r;Ljava/lang/String;)Lz96;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 2d
      // 0f: ifnonnull 2c
      // 12: goto 19
      // 15: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: invokestatic vr1._0v ()Lvr1;
      // 1c: invokevirtual vr1.wh3 ()Lwlx;
      // 1f: aload 1
      // 20: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 23: invokevirtual wlx.fm4 (Ljava/util/UUID;)Lz96;
      // 26: astore 3
      // 27: goto 2c
      // 2a: astore 4
      // 2c: aload 3
      // 2d: iload 2
      // 2e: ifeq 47
      // 31: ifnonnull 46
      // 34: goto 3b
      // 37: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: invokestatic vr1._0v ()Lvr1;
      // 3e: invokevirtual vr1.wh3 ()Lwlx;
      // 41: aload 1
      // 42: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 45: astore 3
      // 46: aload 3
      // 47: iload 2
      // 48: ifeq 62
      // 4b: ifnonnull 61
      // 4e: goto 55
      // 51: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: new iez
      // 58: dup
      // 59: invokespecial iez.<init> ()V
      // 5c: athrow
      // 5d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 3
      // 62: areturn
   }

   public static EntityLivingBase kot(e7r var0, String var1) {
      return arm(var0, var1, EntityLivingBase.class);
   }

   public static EntityLivingBase arm(e7r param0, String param1, Class param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 4077972787505
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: aload 1
      // 0a: aload 2
      // 0b: invokestatic z83.we4 (Le7r;Ljava/lang/String;Ljava/lang/Class;)Li2h;
      // 0e: astore 6
      // 10: invokestatic OpaquePredicate.c ()I
      // 13: invokestatic vr1._0v ()Lvr1;
      // 16: astore 7
      // 18: istore 5
      // 1a: aload 6
      // 1c: iload 5
      // 1e: ifne 38
      // 21: ifnonnull 36
      // 24: goto 2b
      // 27: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 7
      // 2d: invokevirtual vr1.wh3 ()Lwlx;
      // 30: aload 1
      // 31: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 34: astore 6
      // 36: aload 6
      // 38: iload 5
      // 3a: ifne 94
      // 3d: ifnonnull 92
      // 40: goto 47
      // 43: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 1
      // 48: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 4b: astore 8
      // 4d: aload 7
      // 4f: iload 5
      // 51: ifne 69
      // 54: aload 8
      // 56: invokevirtual vr1.tbk (Ljava/util/UUID;)Li2h;
      // 59: astore 6
      // 5b: aload 6
      // 5d: ifnonnull 73
      // 60: aload 7
      // 62: goto 69
      // 65: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: invokevirtual vr1.wh3 ()Lwlx;
      // 6c: aload 8
      // 6e: invokevirtual wlx.fm4 (Ljava/util/UUID;)Lz96;
      // 71: astore 6
      // 73: goto 92
      // 76: astore 8
      // 78: new uac
      // 7b: dup
      // 7c: sipush 11298
      // 7f: ldc2_w 8535014867268740919
      // 82: lload 3
      // 83: lxor
      // 84: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: nop
      // 8a: bipush 0
      // 8b: anewarray 24
      // 8e: invokespecial uac.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 91: athrow
      // 92: aload 6
      // 94: ifnull b1
      // 97: aload 2
      // 98: aload 6
      // 9a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 9d: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // a0: ifeq b1
      // a3: goto aa
      // a6: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: aload 6
      // ac: areturn
      // ad: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: new uac
      // b4: dup
      // b5: invokespecial uac.<init> ()V
      // b8: athrow
   }

   public static List ouc(e7r param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic z83.lhf (Ljava/lang/String;)Z
      // 08: iload 2
      // 09: ifne 26
      // 0c: ifeq 25
      // 0f: goto 16
      // 12: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: ldc EntityLivingBase
      // 1a: nop
      // 1b: invokestatic z83.mib (Le7r;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
      // 1e: goto 34
      // 21: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: bipush 1
      // 26: anewarray 7
      // 29: dup
      // 2a: bipush 0
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokestatic bc_.kot (Le7r;Ljava/lang/String;)Li2h;
      // 30: aastore
      // 31: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 34: areturn
   }

   public static String jmj(e7r param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokestatic bc_.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 09: invokevirtual z96.noc ()Ljava/lang/String;
      // 0c: areturn
      // 0d: astore 3
      // 0e: aload 1
      // 0f: iload 2
      // 10: ifeq 27
      // 13: invokestatic z83.lhf (Ljava/lang/String;)Z
      // 16: ifeq 26
      // 19: goto 20
      // 1c: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 3
      // 21: athrow
      // 22: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 1
      // 27: areturn
   }

   public static String hi8(e7r param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokestatic bc_.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 09: invokevirtual z96.noc ()Ljava/lang/String;
      // 0c: areturn
      // 0d: astore 3
      // 0e: aload 0
      // 0f: aload 1
      // 10: invokestatic bc_.kot (Le7r;Ljava/lang/String;)Li2h;
      // 13: invokevirtual EntityLivingBase.b_q ()Ljava/util/UUID;
      // 16: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 19: areturn
      // 1a: astore 4
      // 1c: aload 1
      // 1d: iload 2
      // 1e: ifne 36
      // 21: invokestatic z83.lhf (Ljava/lang/String;)Z
      // 24: ifeq 35
      // 27: goto 2e
      // 2a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 4
      // 30: athrow
      // 31: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 1
      // 36: areturn
   }

   public static ekw as_(e7r var0, String[] var1, int var2) {
      return h1l(var0, var1, var2, false);
   }

   public static ekw h1l(e7r param0, String[] param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new tao
      // 03: dup
      // 04: ldc ""
      // 06: nop
      // 07: invokespecial tao.<init> (Ljava/lang/String;)V
      // 0a: astore 5
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: iload 2
      // 10: istore 6
      // 12: istore 4
      // 14: iload 6
      // 16: aload 1
      // 17: arraylength
      // 18: if_icmpge 9e
      // 1b: iload 6
      // 1d: iload 2
      // 1e: if_icmple 33
      // 21: aload 5
      // 23: ldc " "
      // 25: nop
      // 26: invokeinterface ekw.lt8 (Ljava/lang/String;)Lekw; 2
      // 2b: pop
      // 2c: goto 33
      // 2f: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: new tao
      // 36: dup
      // 37: aload 1
      // 38: iload 6
      // 3a: aaload
      // 3b: invokespecial tao.<init> (Ljava/lang/String;)V
      // 3e: astore 7
      // 40: iload 4
      // 42: ifeq 99
      // 45: iload 3
      // 46: ifeq 8c
      // 49: goto 50
      // 4c: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 1
      // 52: iload 6
      // 54: aaload
      // 55: invokestatic z83.o6f (Le7r;Ljava/lang/String;)Lekw;
      // 58: astore 8
      // 5a: aload 8
      // 5c: iload 4
      // 5e: ifeq 8a
      // 61: ifnonnull 88
      // 64: goto 6b
      // 67: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 1
      // 6c: iload 6
      // 6e: aaload
      // 6f: invokestatic z83.lhf (Ljava/lang/String;)Z
      // 72: ifeq 8c
      // 75: goto 7c
      // 78: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: new iez
      // 7f: dup
      // 80: invokespecial iez.<init> ()V
      // 83: athrow
      // 84: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: aload 8
      // 8a: astore 7
      // 8c: aload 5
      // 8e: aload 7
      // 90: invokeinterface ekw.vha (Lekw;)Lekw; 2
      // 95: pop
      // 96: iinc 6 1
      // 99: iload 4
      // 9b: ifne 14
      // 9e: aload 5
      // a0: areturn
   }

   public static String cai(String[] var0, int var1) {
      StringBuilder var3 = new StringBuilder();
      int var10000 = OpaquePredicate.b();
      int var4 = var1;
      int var2 = var10000;

      while (var4 < var0.length) {
         try {
            if (var4 > var1) {
               var3.append(" ");
            }
         } catch (NumberFormatException var6) {
            throw b(var6);
         }

         String var5 = var0[var4];
         var3.append(var5);
         var4++;
         if (var2 == 0) {
            break;
         }
      }

      return var3.toString();
   }

   public static bc_$fod x3v(double var0, String var2, boolean var3) {
      return xz0(var0, var2, -30000000, 30000000, var3);
   }

   public static bc_$fod xz0(double param0, String param2, int param3, int param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bc_.b J
      // 003: ldc2_w 86431237199874
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 8
      // 00e: aload 2
      // 00f: ldc "~"
      // 011: nop
      // 012: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 015: istore 9
      // 017: iload 9
      // 019: iload 8
      // 01b: ifne 03f
      // 01e: ifeq 068
      // 021: goto 028
      // 024: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: dload 0
      // 029: iload 8
      // 02b: ifne 069
      // 02e: goto 035
      // 031: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: invokestatic java/lang/Double.isNaN (D)Z
      // 038: goto 03f
      // 03b: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: ifeq 068
      // 042: new cco
      // 045: dup
      // 046: sipush 11330
      // 049: ldc2_w 8966358563740806764
      // 04c: lload 6
      // 04e: lxor
      // 04f: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: nop
      // 055: bipush 1
      // 056: anewarray 24
      // 059: dup
      // 05a: bipush 0
      // 05b: dload 0
      // 05c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 05f: aastore
      // 060: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 063: athrow
      // 064: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: dconst_0
      // 069: dstore 10
      // 06b: iload 9
      // 06d: iload 8
      // 06f: ifne 0a5
      // 072: ifeq 097
      // 075: goto 07c
      // 078: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 2
      // 07d: invokevirtual java/lang/String.length ()I
      // 080: iload 8
      // 082: ifne 111
      // 085: goto 08c
      // 088: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: bipush 1
      // 08d: if_icmple 110
      // 090: goto 097
      // 093: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 2
      // 098: ldc "."
      // 09a: nop
      // 09b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 09e: goto 0a5
      // 0a1: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: istore 12
      // 0a7: iload 9
      // 0a9: iload 8
      // 0ab: ifne 0c9
      // 0ae: ifeq 0be
      // 0b1: goto 0b8
      // 0b4: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: aload 2
      // 0b9: bipush 1
      // 0ba: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0bd: astore 2
      // 0be: dload 10
      // 0c0: aload 2
      // 0c1: invokestatic bc_.gdo (Ljava/lang/String;)D
      // 0c4: dadd
      // 0c5: dstore 10
      // 0c7: iload 12
      // 0c9: iload 8
      // 0cb: ifne 111
      // 0ce: ifne 110
      // 0d1: goto 0d8
      // 0d4: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: iload 9
      // 0da: iload 8
      // 0dc: ifne 111
      // 0df: goto 0e6
      // 0e2: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: ifne 110
      // 0e9: goto 0f0
      // 0ec: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: iload 5
      // 0f2: iload 8
      // 0f4: ifne 111
      // 0f7: goto 0fe
      // 0fa: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: ifeq 110
      // 101: goto 108
      // 104: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: dload 10
      // 10a: ldc2_w 0.5
      // 10d: dadd
      // 10e: dstore 10
      // 110: iload 3
      // 111: iload 8
      // 113: ifne 144
      // 116: ifne 138
      // 119: goto 120
      // 11c: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: iload 4
      // 122: iload 8
      // 124: ifne 144
      // 127: goto 12e
      // 12a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: ifeq 1b9
      // 131: goto 138
      // 134: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: dload 10
      // 13a: iload 3
      // 13b: i2d
      // 13c: dcmpg
      // 13d: goto 144
      // 140: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: iload 8
      // 146: ifne 187
      // 149: ifge 181
      // 14c: goto 153
      // 14f: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: new cco
      // 156: dup
      // 157: sipush 12552
      // 15a: ldc2_w 5520253239131009831
      // 15d: lload 6
      // 15f: lxor
      // 160: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: nop
      // 166: bipush 2
      // 167: anewarray 24
      // 16a: dup
      // 16b: bipush 0
      // 16c: dload 10
      // 16e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 171: aastore
      // 172: dup
      // 173: bipush 1
      // 174: iload 3
      // 175: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 178: aastore
      // 179: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 17c: athrow
      // 17d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: dload 10
      // 183: iload 4
      // 185: i2d
      // 186: dcmpl
      // 187: ifle 1b9
      // 18a: new cco
      // 18d: dup
      // 18e: sipush 2490
      // 191: ldc2_w 6005046202178489245
      // 194: lload 6
      // 196: lxor
      // 197: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: nop
      // 19d: bipush 2
      // 19e: anewarray 24
      // 1a1: dup
      // 1a2: bipush 0
      // 1a3: dload 10
      // 1a5: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1a8: aastore
      // 1a9: dup
      // 1aa: bipush 1
      // 1ab: iload 4
      // 1ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b0: aastore
      // 1b1: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1b4: athrow
      // 1b5: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: new bc_$fod
      // 1bc: dup
      // 1bd: dload 10
      // 1bf: iload 9
      // 1c1: ifeq 1cc
      // 1c4: dload 0
      // 1c5: goto 1cd
      // 1c8: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: dconst_0
      // 1cd: dadd
      // 1ce: dload 10
      // 1d0: iload 9
      // 1d2: invokespecial bc_$fod.<init> (DDZ)V
      // 1d5: areturn
   }

   public static double d80(double var0, String var2, boolean var3) {
      return bll(var0, var2, -30000000, 30000000, var3);
   }

   public static double bll(double param0, String param2, int param3, int param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bc_.b J
      // 003: ldc2_w 59810142281496
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 8
      // 00e: aload 2
      // 00f: ldc "~"
      // 011: nop
      // 012: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 015: istore 9
      // 017: iload 9
      // 019: iload 8
      // 01b: ifeq 06a
      // 01e: ifeq 068
      // 021: goto 028
      // 024: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: dload 0
      // 029: invokestatic java/lang/Double.isNaN (D)Z
      // 02c: iload 8
      // 02e: ifeq 06a
      // 031: goto 038
      // 034: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: ifeq 068
      // 03b: goto 042
      // 03e: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: new cco
      // 045: dup
      // 046: sipush 11330
      // 049: ldc2_w 8966279167871379830
      // 04c: lload 6
      // 04e: lxor
      // 04f: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: nop
      // 055: bipush 1
      // 056: anewarray 24
      // 059: dup
      // 05a: bipush 0
      // 05b: dload 0
      // 05c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 05f: aastore
      // 060: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 063: athrow
      // 064: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: iload 9
      // 06a: ifeq 075
      // 06d: dload 0
      // 06e: goto 076
      // 071: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: dconst_0
      // 076: dstore 10
      // 078: iload 9
      // 07a: iload 8
      // 07c: ifeq 0b2
      // 07f: ifeq 0a4
      // 082: goto 089
      // 085: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 2
      // 08a: invokevirtual java/lang/String.length ()I
      // 08d: iload 8
      // 08f: ifeq 11e
      // 092: goto 099
      // 095: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: bipush 1
      // 09a: if_icmple 11d
      // 09d: goto 0a4
      // 0a0: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 2
      // 0a5: ldc "."
      // 0a7: nop
      // 0a8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0ab: goto 0b2
      // 0ae: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: istore 12
      // 0b4: iload 9
      // 0b6: iload 8
      // 0b8: ifeq 0d6
      // 0bb: ifeq 0cb
      // 0be: goto 0c5
      // 0c1: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 2
      // 0c6: bipush 1
      // 0c7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ca: astore 2
      // 0cb: dload 10
      // 0cd: aload 2
      // 0ce: invokestatic bc_.gdo (Ljava/lang/String;)D
      // 0d1: dadd
      // 0d2: dstore 10
      // 0d4: iload 12
      // 0d6: iload 8
      // 0d8: ifeq 11e
      // 0db: ifne 11d
      // 0de: goto 0e5
      // 0e1: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: iload 9
      // 0e7: iload 8
      // 0e9: ifeq 11e
      // 0ec: goto 0f3
      // 0ef: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: ifne 11d
      // 0f6: goto 0fd
      // 0f9: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: iload 5
      // 0ff: iload 8
      // 101: ifeq 11e
      // 104: goto 10b
      // 107: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: ifeq 11d
      // 10e: goto 115
      // 111: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: dload 10
      // 117: ldc2_w 0.5
      // 11a: dadd
      // 11b: dstore 10
      // 11d: iload 3
      // 11e: iload 8
      // 120: ifeq 151
      // 123: ifne 145
      // 126: goto 12d
      // 129: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: iload 4
      // 12f: iload 8
      // 131: ifeq 151
      // 134: goto 13b
      // 137: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: ifeq 1d2
      // 13e: goto 145
      // 141: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: dload 10
      // 147: iload 3
      // 148: i2d
      // 149: dcmpg
      // 14a: goto 151
      // 14d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: iload 8
      // 153: ifeq 1a0
      // 156: ifge 18e
      // 159: goto 160
      // 15c: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: new cco
      // 163: dup
      // 164: sipush 13086
      // 167: ldc2_w 8955755168679294501
      // 16a: lload 6
      // 16c: lxor
      // 16d: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: bipush 2
      // 174: anewarray 24
      // 177: dup
      // 178: bipush 0
      // 179: dload 10
      // 17b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 17e: aastore
      // 17f: dup
      // 180: bipush 1
      // 181: iload 3
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: aastore
      // 186: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 189: athrow
      // 18a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: dload 10
      // 190: iload 8
      // 192: ifeq 1d4
      // 195: iload 4
      // 197: i2d
      // 198: dcmpl
      // 199: goto 1a0
      // 19c: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: ifle 1d2
      // 1a3: new cco
      // 1a6: dup
      // 1a7: sipush 1484
      // 1aa: ldc2_w 6367176328393736445
      // 1ad: lload 6
      // 1af: lxor
      // 1b0: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: nop
      // 1b6: bipush 2
      // 1b7: anewarray 24
      // 1ba: dup
      // 1bb: bipush 0
      // 1bc: dload 10
      // 1be: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1c1: aastore
      // 1c2: dup
      // 1c3: bipush 1
      // 1c4: iload 4
      // 1c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c9: aastore
      // 1ca: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1cd: athrow
      // 1ce: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: dload 10
      // 1d4: dreturn
   }

   public static u7m ue7(e7r param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 109346588453728
      // 06: lxor
      // 07: lstore 2
      // 08: new gdz
      // 0b: dup
      // 0c: aload 1
      // 0d: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 10: astore 5
      // 12: invokestatic OpaquePredicate.b ()I
      // 15: getstatic u7m.p5w Lnga;
      // 18: aload 5
      // 1a: invokevirtual nga._gz (Ljava/lang/Object;)Ljava/lang/Object;
      // 1d: checkcast u7m
      // 20: astore 6
      // 22: istore 4
      // 24: aload 6
      // 26: iload 4
      // 28: ifeq 5a
      // 2b: ifnonnull 58
      // 2e: goto 35
      // 31: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: new cco
      // 38: dup
      // 39: sipush 32074
      // 3c: ldc2_w 6389856105098644507
      // 3f: lload 2
      // 40: lxor
      // 41: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: bipush 1
      // 48: anewarray 24
      // 4b: dup
      // 4c: bipush 0
      // 4d: aload 5
      // 4f: aastore
      // 50: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 53: athrow
      // 54: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 6
      // 5a: areturn
   }

   public static e0x dde(e7r param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 15280704284573
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: new gdz
      // 10: dup
      // 11: aload 1
      // 12: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 15: astore 5
      // 17: getstatic e0x.db8 Ljnv;
      // 1a: aload 5
      // 1c: iload 4
      // 1e: ifeq 56
      // 21: invokevirtual jnv.vqt (Ljava/lang/Object;)Z
      // 24: ifne 51
      // 27: goto 2e
      // 2a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: new cco
      // 31: dup
      // 32: sipush 20389
      // 35: ldc2_w 4314538117781598750
      // 38: lload 2
      // 39: lxor
      // 3a: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: nop
      // 40: bipush 1
      // 41: anewarray 24
      // 44: dup
      // 45: bipush 0
      // 46: aload 5
      // 48: aastore
      // 49: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 4c: athrow
      // 4d: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: getstatic e0x.db8 Ljnv;
      // 54: aload 5
      // 56: invokevirtual jnv._gz (Ljava/lang/Object;)Ljava/lang/Object;
      // 59: checkcast e0x
      // 5c: astore 6
      // 5e: aload 6
      // 60: iload 4
      // 62: ifeq 94
      // 65: ifnonnull 92
      // 68: goto 6f
      // 6b: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: new cco
      // 72: dup
      // 73: sipush 31984
      // 76: ldc2_w 3088166586962411845
      // 79: lload 2
      // 7a: lxor
      // 7b: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: nop
      // 81: bipush 1
      // 82: anewarray 24
      // 85: dup
      // 86: bipush 0
      // 87: aload 5
      // 89: aastore
      // 8a: invokespecial cco.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 8d: athrow
      // 8e: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: aload 6
      // 94: areturn
   }

   public static String fgi(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 7307643549044
      // 06: lxor
      // 07: lstore 1
      // 08: new java/lang/StringBuilder
      // 0b: dup
      // 0c: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f: astore 4
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: bipush 0
      // 15: istore 5
      // 17: istore 3
      // 18: iload 5
      // 1a: aload 0
      // 1b: arraylength
      // 1c: if_icmpge 95
      // 1f: aload 0
      // 20: iload 5
      // 22: aaload
      // 23: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 26: iload 3
      // 27: ifne 9a
      // 2a: astore 6
      // 2c: iload 3
      // 2d: ifne 91
      // 30: iload 5
      // 32: ifle 86
      // 35: goto 3c
      // 38: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: iload 5
      // 3e: aload 0
      // 3f: arraylength
      // 40: bipush 1
      // 41: isub
      // 42: if_icmpne 6b
      // 45: goto 4c
      // 48: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 4
      // 4e: sipush 8633
      // 51: ldc2_w 7828634715532513017
      // 54: lload 1
      // 55: lxor
      // 56: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: nop
      // 5c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f: pop
      // 60: iload 3
      // 61: ifeq 86
      // 64: goto 6b
      // 67: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 4
      // 6d: sipush 27928
      // 70: ldc2_w 7431811975037289038
      // 73: lload 1
      // 74: lxor
      // 75: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: pop
      // 7f: goto 86
      // 82: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 4
      // 88: aload 6
      // 8a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d: pop
      // 8e: iinc 5 1
      // 91: iload 3
      // 92: ifeq 18
      // 95: aload 4
      // 97: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9a: areturn
   }

   public static ekw sov(List param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bc_.b J
      // 03: ldc2_w 6446198142710
      // 06: lxor
      // 07: lstore 1
      // 08: new tao
      // 0b: dup
      // 0c: ldc ""
      // 0e: nop
      // 0f: invokespecial tao.<init> (Ljava/lang/String;)V
      // 12: astore 4
      // 14: invokestatic OpaquePredicate.b ()I
      // 17: bipush 0
      // 18: istore 5
      // 1a: istore 3
      // 1b: iload 5
      // 1d: aload 0
      // 1e: invokeinterface java/util/List.size ()I 1
      // 23: if_icmpge b2
      // 26: iload 5
      // 28: iload 3
      // 29: ifeq 38
      // 2c: ifle 98
      // 2f: goto 36
      // 32: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: iload 5
      // 38: iload 3
      // 39: ifeq 78
      // 3c: aload 0
      // 3d: invokeinterface java/util/List.size ()I 1
      // 42: bipush 1
      // 43: isub
      // 44: if_icmpne 6f
      // 47: goto 4e
      // 4a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 4
      // 50: sipush 25715
      // 53: ldc2_w 6077655879791134885
      // 56: lload 1
      // 57: lxor
      // 58: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: nop
      // 5e: invokeinterface ekw.lt8 (Ljava/lang/String;)Lekw; 2
      // 63: pop
      // 64: iload 3
      // 65: ifne 98
      // 68: goto 6f
      // 6b: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: iload 5
      // 71: goto 78
      // 74: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: ifle 98
      // 7b: aload 4
      // 7d: sipush 27824
      // 80: ldc2_w 7947792347000291436
      // 83: lload 1
      // 84: lxor
      // 85: invokedynamic c (IJ)Ljava/lang/String; bsm=bc_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: nop
      // 8b: invokeinterface ekw.lt8 (Ljava/lang/String;)Lekw; 2
      // 90: pop
      // 91: goto 98
      // 94: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: aload 4
      // 9a: aload 0
      // 9b: iload 5
      // 9d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a2: checkcast ekw
      // a5: invokeinterface ekw.vha (Lekw;)Lekw; 2
      // aa: pop
      // ab: iinc 5 1
      // ae: iload 3
      // af: ifne 1b
      // b2: aload 4
      // b4: areturn
   }

   public static String t97(Collection var0) {
      return fgi(var0.toArray(new String[var0.size()]));
   }

   public static List aqt(String[] param0, int param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: aload 0
      // 0f: arraylength
      // 10: bipush 1
      // 11: isub
      // 12: istore 4
      // 14: iload 4
      // 16: iload 1
      // 17: iload 3
      // 18: ifeq 3e
      // 1b: if_icmpne 32
      // 1e: goto 25
      // 21: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual mew.getX ()I
      // 29: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 2c: astore 5
      // 2e: iload 3
      // 2f: ifne 82
      // 32: iload 4
      // 34: iload 1
      // 35: bipush 1
      // 36: iadd
      // 37: goto 3e
      // 3a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: iload 3
      // 3f: ifeq 70
      // 42: if_icmpne 59
      // 45: goto 4c
      // 48: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 2
      // 4d: invokevirtual mew.getY ()I
      // 50: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 53: astore 5
      // 55: iload 3
      // 56: ifne 82
      // 59: iload 4
      // 5b: iload 3
      // 5c: ifeq 7d
      // 5f: goto 66
      // 62: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: iload 1
      // 67: bipush 2
      // 68: iadd
      // 69: goto 70
      // 6c: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: if_icmpeq 79
      // 73: aconst_null
      // 74: areturn
      // 75: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: aload 2
      // 7a: invokevirtual mew.getZ ()I
      // 7d: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 80: astore 5
      // 82: bipush 1
      // 83: anewarray 4
      // 86: dup
      // 87: bipush 0
      // 88: aload 5
      // 8a: aastore
      // 8b: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 8e: areturn
   }

   public static List _5o(String[] param0, int param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: aload 0
      // 0f: arraylength
      // 10: bipush 1
      // 11: isub
      // 12: istore 4
      // 14: iload 4
      // 16: iload 1
      // 17: iload 3
      // 18: ifne 49
      // 1b: if_icmpne 32
      // 1e: goto 25
      // 21: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual mew.getX ()I
      // 29: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 2c: astore 5
      // 2e: iload 3
      // 2f: ifeq 5b
      // 32: iload 4
      // 34: iload 3
      // 35: ifne 56
      // 38: goto 3f
      // 3b: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: iload 1
      // 40: bipush 1
      // 41: iadd
      // 42: goto 49
      // 45: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: if_icmpeq 52
      // 4c: aconst_null
      // 4d: areturn
      // 4e: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: aload 2
      // 53: invokevirtual mew.getZ ()I
      // 56: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 59: astore 5
      // 5b: bipush 1
      // 5c: anewarray 4
      // 5f: dup
      // 60: bipush 0
      // 61: aload 5
      // 63: aastore
      // 64: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 67: areturn
   }

   public static boolean ufz(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   public static List cqo(String[] var0, String[] var1) {
      return d79(var0, Arrays.asList(var1));
   }

   public static List d79(String[] param0, Collection param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: arraylength
      // 003: bipush 1
      // 004: isub
      // 005: aaload
      // 006: astore 3
      // 007: invokestatic OpaquePredicate.c ()I
      // 00a: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 00d: astore 4
      // 00f: istore 2
      // 010: aload 1
      // 011: iload 2
      // 012: ifne 032
      // 015: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 01a: ifne 0ff
      // 01d: goto 024
      // 020: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 1
      // 025: invokestatic com/google/common/base/Functions.toStringFunction ()Lcom/google/common/base/Function;
      // 028: invokestatic com/google/common/collect/Iterables.transform (Ljava/lang/Iterable;Lcom/google/common/base/Function;)Ljava/lang/Iterable;
      // 02b: goto 032
      // 02e: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 037: astore 5
      // 039: aload 5
      // 03b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 040: ifeq 083
      // 043: aload 5
      // 045: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04a: checkcast java/lang/String
      // 04d: astore 6
      // 04f: aload 3
      // 050: aload 6
      // 052: invokestatic bc_.ufz (Ljava/lang/String;Ljava/lang/String;)Z
      // 055: iload 2
      // 056: ifne 095
      // 059: iload 2
      // 05a: ifne 07e
      // 05d: goto 064
      // 060: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: ifeq 07f
      // 067: goto 06e
      // 06a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 4
      // 070: aload 6
      // 072: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 077: goto 07e
      // 07a: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: pop
      // 07f: iload 2
      // 080: ifeq 039
      // 083: aload 4
      // 085: iload 2
      // 086: ifne 101
      // 089: invokeinterface java/util/List.isEmpty ()Z 1
      // 08e: goto 095
      // 091: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: ifeq 0ff
      // 098: aload 1
      // 099: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 09e: astore 5
      // 0a0: aload 5
      // 0a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a7: ifeq 0ff
      // 0aa: aload 5
      // 0ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b1: astore 6
      // 0b3: aload 6
      // 0b5: instanceof gdz
      // 0b8: iload 2
      // 0b9: ifne 0d9
      // 0bc: ifeq 0fb
      // 0bf: goto 0c6
      // 0c2: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 3
      // 0c7: aload 6
      // 0c9: checkcast gdz
      // 0cc: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 0cf: invokestatic bc_.ufz (Ljava/lang/String;Ljava/lang/String;)Z
      // 0d2: goto 0d9
      // 0d5: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: ifne 0fa
      // 0dd: ifeq 0fb
      // 0e0: goto 0e7
      // 0e3: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 4
      // 0e9: aload 6
      // 0eb: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0ee: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f3: goto 0fa
      // 0f6: invokestatic bc_.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: pop
      // 0fb: iload 2
      // 0fc: ifeq 0a0
      // 0ff: aload 4
      // 101: areturn
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      return false;
   }

   public static void wxl(e7r var0, on1 var1, String var2, Object[] var3) {
      wcf(var0, var1, 0, var2, var3);
   }

   public static void wcf(e7r var0, on1 var1, int var2, String var3, Object[] var4) {
      int var5 = OpaquePredicate.c();

      q11 var10000;
      label20: {
         try {
            var10000 = awz;
            if (var5 != 0) {
               break label20;
            }

            if (awz == null) {
               return;
            }
         } catch (NumberFormatException var6) {
            throw b(var6);
         }

         var10000 = awz;
      }

      var10000.blv(var0, var1, var2, var3, var4);
   }

   public static void t_w(q11 var0) {
      awz = var0;
   }

   public int wet(on1 var1) {
      return this.xue().compareTo(var1.xue());
   }

   @Override
   public int compareTo(Object var1) {
      return this.wet((on1)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4679594067515770708L, 5139007445791272252L, MethodHandles.lookup().lookupClass()).a(236945134743292L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 35062948042172L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[22];
      int var7 = 0;
      String var6 = "\u0084\u009a¬\u000fz\u001b\u0016î»1dý\u0099=\u0007-@^\f<\n'[\u0007ô\u0082\t -©¢\u0083â\u008dà\u0086\u001cÎÓsöR\u0094Jâ¨ØëÔò&m 9¥\u0012\u0099¡\u0098¦UXLsüã\u0000góm°V³ \\\u0011\u000eÖÐb:\u00108\u0083 4\u0095EúTK\u0091&Äm\u0087ñ\u0001@!qd}îsØÜzßuÛ«\u0000\u0011\u009dqá\u0019§h²AÊ £\u0012¿}ÐG\u001bAb\u0081a³ò\u0011E]÷W\u0083Æ³\b\u000f\b\u0098Â\u0016\u0004¼°~2Ý[S\u0080];k8þqYBoS\u0010Ö \u009aþätÖÊæÀëÅ\n\\\u0092$MÚp\u00adf¹b4ÑÒPFìi¾\u0094I-\u0011ª\u001fïm\u001d¨âÀ¶;\u007føµ§8\u000e\u0000;ÂoP«\u0082Íà¼g\u0014\u0017Ø\u001e¿¡`\u009dÀ¼\u0097Û\u0090t\u0017\r¤§°ñ\u0016#¯%¯\u0001zÁ\u0093\u0007Ñ·Z%{\nLþÑð|h,^0\u001c\u0018õ\u008dJ©\u0019#!DãDÑ\u0096 Áá\u000e«k£\fCú\u0014p\u001d\u0003¸xY/\u00ad|Ô\u0085ª\u0085\u009b~tÆ>\u0011î\u000b\u008a\bp},\rÊjµC»(\"À\u0090,\u0013½Og<Jçhö®±&3¡6ãÁEGÓe\u0001\u001f¹è\u0080\u0089ö`Ë¨þ£\u001a\u001e(¥B*\u0098,\u0085F²\u008dÔìÞ§©m\u0086AÕß+67ÕÀ[ÝF§\u000e0\u0086O:j\u0018Ç¢\u000b\u0093\u00adüü(Aæ\u007f\u009bTW$Bè\u000f\u0092¥x4Ç¹\u0097\u008b2¼8îjK\u0089\u000b\u001e3À\u0087'Ùo\u0083n\u0019ËªýX3þ\u009fåÏ4\u0082û\u0015o\u0086IaËyØ r\u0090Ì\fÑÀ\u0010é\\>ñ<S\u0084õ6\"TßÚ8\u0088Ó\t\u001e7\u0019\u001b\u009ao1M£p\u0018£\u0082ø±\u00064\u001aª*9ª3\u0096\u001cÞr·=èTMR¥`^\b.\u0082·¦º:¯ûv\u0005Áe£q3\u0097\u0010\u0015¤ðyÔ¥\u007f!¿ÔAY©ùÝ¦8¯,\u009d]Ò\u008a»\u000e\u000bÇ4y£»ã\u009f\nÆ9Î?!¾ï,=ÞÎ²g~\u0085·4\u0014^ä\u0005ÔH6H)\u0091\u0096GÅ\u0001z+Sû(báý0l\u00069Ò\u0087:\u0006§4µr^ôr$Â\u0006\u009c\"\r ÖLdM©\u008c\u0093·\u008bÍDP\u009f\u0096í\u00adB\u009e¨]yü;éeµ:@u*\u00825h\u000b\u001dæUñì\u00069ÏvÙí(è\u008döfrâ¢\u0087ÿi>çÉC\u001f\u0083¨ïöÀ\u001e°Î\bZû5àÀ`v\u0011\u0015F\u009a\u0097\u009a\u0019ånÛC\u009aû»Ã\u0010]\u0015y&qç@Ôñù\u009fó>ÉÐ\r\u0010m>Q\u00917\u009fi\u0091Þ\u0098ÂÒ·Ã\u009c~0Q\u0010#\u0083¸ÉtacSÁþ\u009e\u0004\u0098þÀS´\u0006;\u008d\u000ekr\u0019úéÓø\u00014<rNDqÁú\u0089/ÞK\u0007\\\u0081uÀ0(_ÄÃ`'§~\u008fâ1U\u0019ÈhýnT\u0019Î\u008aãÿ\u007f'å\u0091:\u0080\u0092\u0017Ûß.)\u001dãèÂKÞcb\u009e\u000617+8\u0096\\\u009e\u0003¨\u001a\u0092²§w4Ôú¯^äxO1N3Bêë¾t,\u0001%y¬\u001cõ±\u008a\u0088\u0090¡\u009a¯Liwn\u00ad^ñ[µG\u001e\u0002\u0081\u0091\u008eª8\u009cûó\u0007\rÏ/4\u0084¢E\u0080\r(ä9&>\u0094ÜÉm^°À]\u000f0\u001bnd\u0005\u009bC®sÛÖñC@f®8\u001eÀ¹P©gÍ¿7=\u008bÃ";
      int var8 = "\u0084\u009a¬\u000fz\u001b\u0016î»1dý\u0099=\u0007-@^\f<\n'[\u0007ô\u0082\t -©¢\u0083â\u008dà\u0086\u001cÎÓsöR\u0094Jâ¨ØëÔò&m 9¥\u0012\u0099¡\u0098¦UXLsüã\u0000góm°V³ \\\u0011\u000eÖÐb:\u00108\u0083 4\u0095EúTK\u0091&Äm\u0087ñ\u0001@!qd}îsØÜzßuÛ«\u0000\u0011\u009dqá\u0019§h²AÊ £\u0012¿}ÐG\u001bAb\u0081a³ò\u0011E]÷W\u0083Æ³\b\u000f\b\u0098Â\u0016\u0004¼°~2Ý[S\u0080];k8þqYBoS\u0010Ö \u009aþätÖÊæÀëÅ\n\\\u0092$MÚp\u00adf¹b4ÑÒPFìi¾\u0094I-\u0011ª\u001fïm\u001d¨âÀ¶;\u007føµ§8\u000e\u0000;ÂoP«\u0082Íà¼g\u0014\u0017Ø\u001e¿¡`\u009dÀ¼\u0097Û\u0090t\u0017\r¤§°ñ\u0016#¯%¯\u0001zÁ\u0093\u0007Ñ·Z%{\nLþÑð|h,^0\u001c\u0018õ\u008dJ©\u0019#!DãDÑ\u0096 Áá\u000e«k£\fCú\u0014p\u001d\u0003¸xY/\u00ad|Ô\u0085ª\u0085\u009b~tÆ>\u0011î\u000b\u008a\bp},\rÊjµC»(\"À\u0090,\u0013½Og<Jçhö®±&3¡6ãÁEGÓe\u0001\u001f¹è\u0080\u0089ö`Ë¨þ£\u001a\u001e(¥B*\u0098,\u0085F²\u008dÔìÞ§©m\u0086AÕß+67ÕÀ[ÝF§\u000e0\u0086O:j\u0018Ç¢\u000b\u0093\u00adüü(Aæ\u007f\u009bTW$Bè\u000f\u0092¥x4Ç¹\u0097\u008b2¼8îjK\u0089\u000b\u001e3À\u0087'Ùo\u0083n\u0019ËªýX3þ\u009fåÏ4\u0082û\u0015o\u0086IaËyØ r\u0090Ì\fÑÀ\u0010é\\>ñ<S\u0084õ6\"TßÚ8\u0088Ó\t\u001e7\u0019\u001b\u009ao1M£p\u0018£\u0082ø±\u00064\u001aª*9ª3\u0096\u001cÞr·=èTMR¥`^\b.\u0082·¦º:¯ûv\u0005Áe£q3\u0097\u0010\u0015¤ðyÔ¥\u007f!¿ÔAY©ùÝ¦8¯,\u009d]Ò\u008a»\u000e\u000bÇ4y£»ã\u009f\nÆ9Î?!¾ï,=ÞÎ²g~\u0085·4\u0014^ä\u0005ÔH6H)\u0091\u0096GÅ\u0001z+Sû(báý0l\u00069Ò\u0087:\u0006§4µr^ôr$Â\u0006\u009c\"\r ÖLdM©\u008c\u0093·\u008bÍDP\u009f\u0096í\u00adB\u009e¨]yü;éeµ:@u*\u00825h\u000b\u001dæUñì\u00069ÏvÙí(è\u008döfrâ¢\u0087ÿi>çÉC\u001f\u0083¨ïöÀ\u001e°Î\bZû5àÀ`v\u0011\u0015F\u009a\u0097\u009a\u0019ånÛC\u009aû»Ã\u0010]\u0015y&qç@Ôñù\u009fó>ÉÐ\r\u0010m>Q\u00917\u009fi\u0091Þ\u0098ÂÒ·Ã\u009c~0Q\u0010#\u0083¸ÉtacSÁþ\u009e\u0004\u0098þÀS´\u0006;\u008d\u000ekr\u0019úéÓø\u00014<rNDqÁú\u0089/ÞK\u0007\\\u0081uÀ0(_ÄÃ`'§~\u008fâ1U\u0019ÈhýnT\u0019Î\u008aãÿ\u007f'å\u0091:\u0080\u0092\u0017Ûß.)\u001dãèÂKÞcb\u009e\u000617+8\u0096\\\u009e\u0003¨\u001a\u0092²§w4Ôú¯^äxO1N3Bêë¾t,\u0001%y¬\u001cõ±\u008a\u0088\u0090¡\u009a¯Liwn\u00ad^ñ[µG\u001e\u0002\u0081\u0091\u008eª8\u009cûó\u0007\rÏ/4\u0084¢E\u0080\r(ä9&>\u0094ÜÉm^°À]\u000f0\u001bnd\u0005\u009bC®sÛÖñC@f®8\u001eÀ¹P©gÍ¿7=\u008bÃ"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[22];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "i\u000b¬Í\u009bj¾)y\u0018³æ\u0096Ùø\u00880dö\u0083@GE¥\"\u0010³\u0098\rW«3÷\u0015vû\u009a\\\u000f_\u0080\"e\u0017V\u009c§5VÉ3M\u0018~q\u008d[i\u0094Õ¹\u0017§<\u0091";
                  var8 = "i\u000b¬Í\u009bj¾)y\u0018³æ\u0096Ùø\u00880dö\u0083@GE¥\"\u0010³\u0098\rW«3÷\u0015vû\u009a\\\u000f_\u0080\"e\u0017V\u009c§5VÉ3M\u0018~q\u008d[i\u0094Õ¹\u0017§<\u0091"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception b(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6098;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("bc_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("bc_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
