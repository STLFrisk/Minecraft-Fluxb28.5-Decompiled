import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ksn {
   public static final String ei0;
   public static final String d4k;
   public static final String lvq;
   public static final String ye4;
   public static final String c5c;
   public static final String w9k;
   public static final String ng_;
   public static final String euk;
   public static final String zk0;
   public static final String shs;
   public static final String qtg;
   public static final String omc;
   public static final String zvb;
   public static final String a97;

   public static boolean a43(int var0, int var1) {
      int var2 = OpaquePredicate.c();

      try {
         int var10000 = var0 & 1 << var1;
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   private static int xl_(int var0, int var1) {
      int var2 = OpaquePredicate.b();

      try {
         byte var10000 = a43(var0, var1);
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 0;
   }

   private static int kq7(int var0, int var1) {
      int var2 = OpaquePredicate.c();

      try {
         byte var10000 = a43(var0, var1);
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 0;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 1;
   }

   public static int fku(int var0) {
      return egu(var0, 5, 4, 3, 2, 1);
   }

   public static int aln(Collection param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: ldc 3694022
      // 006: nop
      // 007: istore 2
      // 008: aload 0
      // 009: iload 1
      // 00a: ifeq 018
      // 00d: ifnull 144
      // 010: goto 017
      // 013: invokestatic ksn.a (Loov;)Loov;
      // 016: athrow
      // 017: aload 0
      // 018: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 01d: iload 1
      // 01e: ifeq 147
      // 021: ifne 144
      // 024: goto 02b
      // 027: invokestatic ksn.a (Loov;)Loov;
      // 02a: athrow
      // 02b: fconst_0
      // 02c: fstore 3
      // 02d: fconst_0
      // 02e: fstore 4
      // 030: fconst_0
      // 031: fstore 5
      // 033: fconst_0
      // 034: fstore 6
      // 036: aload 0
      // 037: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 03c: astore 7
      // 03e: aload 7
      // 040: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 045: ifeq 0fc
      // 048: aload 7
      // 04a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04f: checkcast sdj
      // 052: astore 8
      // 054: aload 8
      // 056: invokevirtual sdj.ixu ()Z
      // 059: iload 1
      // 05a: ifeq 100
      // 05d: iload 1
      // 05e: ifeq 085
      // 061: goto 068
      // 064: invokestatic ksn.a (Loov;)Loov;
      // 067: athrow
      // 068: ifeq 0f8
      // 06b: goto 072
      // 06e: invokestatic ksn.a (Loov;)Loov;
      // 071: athrow
      // 072: getstatic mcs.ip9 [Lmcs;
      // 075: aload 8
      // 077: invokevirtual sdj._na ()I
      // 07a: aaload
      // 07b: invokevirtual mcs.zwf ()I
      // 07e: goto 085
      // 081: invokestatic ksn.a (Loov;)Loov;
      // 084: athrow
      // 085: istore 9
      // 087: invokestatic hxt.xe2 ()Z
      // 08a: iload 1
      // 08b: ifeq 0a5
      // 08e: ifeq 0a4
      // 091: goto 098
      // 094: invokestatic ksn.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 8
      // 09a: invokevirtual sdj._na ()I
      // 09d: iload 9
      // 09f: invokestatic net/optifine/CustomColors.getPotionColor (II)I
      // 0a2: istore 9
      // 0a4: bipush 0
      // 0a5: istore 10
      // 0a7: iload 10
      // 0a9: aload 8
      // 0ab: invokevirtual sdj.tus ()I
      // 0ae: if_icmpgt 0f8
      // 0b1: fload 3
      // 0b2: iload 9
      // 0b4: bipush 16
      // 0b6: ishr
      // 0b7: sipush 255
      // 0ba: iand
      // 0bb: i2f
      // 0bc: ldc 255.0
      // 0be: nop
      // 0bf: fdiv
      // 0c0: fadd
      // 0c1: fstore 3
      // 0c2: fload 4
      // 0c4: iload 9
      // 0c6: bipush 8
      // 0c8: ishr
      // 0c9: sipush 255
      // 0cc: iand
      // 0cd: i2f
      // 0ce: ldc 255.0
      // 0d0: nop
      // 0d1: fdiv
      // 0d2: fadd
      // 0d3: fstore 4
      // 0d5: fload 5
      // 0d7: iload 9
      // 0d9: bipush 0
      // 0da: ishr
      // 0db: sipush 255
      // 0de: iand
      // 0df: i2f
      // 0e0: ldc 255.0
      // 0e2: nop
      // 0e3: fdiv
      // 0e4: fadd
      // 0e5: fstore 5
      // 0e7: fload 6
      // 0e9: fconst_1
      // 0ea: fadd
      // 0eb: fstore 6
      // 0ed: iinc 10 1
      // 0f0: iload 1
      // 0f1: ifeq 03e
      // 0f4: iload 1
      // 0f5: ifne 0a7
      // 0f8: iload 1
      // 0f9: ifne 03e
      // 0fc: fload 6
      // 0fe: fconst_0
      // 0ff: fcmpl
      // 100: iload 1
      // 101: ifeq 143
      // 104: ifne 114
      // 107: goto 10e
      // 10a: invokestatic ksn.a (Loov;)Loov;
      // 10d: athrow
      // 10e: bipush 0
      // 10f: ireturn
      // 110: invokestatic ksn.a (Loov;)Loov;
      // 113: athrow
      // 114: fload 3
      // 115: fload 6
      // 117: fdiv
      // 118: ldc 255.0
      // 11a: nop
      // 11b: fmul
      // 11c: fstore 3
      // 11d: fload 4
      // 11f: fload 6
      // 121: fdiv
      // 122: ldc 255.0
      // 124: nop
      // 125: fmul
      // 126: fstore 4
      // 128: fload 5
      // 12a: fload 6
      // 12c: fdiv
      // 12d: ldc 255.0
      // 12f: nop
      // 130: fmul
      // 131: fstore 5
      // 133: fload 3
      // 134: f2i
      // 135: bipush 16
      // 137: ishl
      // 138: fload 4
      // 13a: f2i
      // 13b: bipush 8
      // 13d: ishl
      // 13e: ior
      // 13f: fload 5
      // 141: f2i
      // 142: ior
      // 143: ireturn
      // 144: invokestatic hxt.xe2 ()Z
      // 147: iload 1
      // 148: ifeq 161
      // 14b: ifeq 164
      // 14e: goto 155
      // 151: invokestatic ksn.a (Loov;)Loov;
      // 154: athrow
      // 155: bipush 0
      // 156: iload 2
      // 157: invokestatic net/optifine/CustomColors.getPotionColor (II)I
      // 15a: goto 161
      // 15d: invokestatic ksn.a (Loov;)Loov;
      // 160: athrow
      // 161: goto 165
      // 164: iload 2
      // 165: ireturn
   }

   public static boolean ze_(Collection param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0a: astore 2
      // 0b: aload 2
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 41
      // 14: aload 2
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast sdj
      // 1d: astore 3
      // 1e: aload 3
      // 1f: invokevirtual sdj.ku0 ()Z
      // 22: iload 1
      // 23: ifeq 42
      // 26: iload 1
      // 27: ifeq 3c
      // 2a: goto 31
      // 2d: invokestatic ksn.a (Loov;)Loov;
      // 30: athrow
      // 31: ifne 3d
      // 34: goto 3b
      // 37: invokestatic ksn.a (Loov;)Loov;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
      // 3d: iload 1
      // 3e: ifne 0b
      // 41: bipush 1
      // 42: ireturn
   }

   public static int qkv(int param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 0
      // 05: invokestatic p0z.cng (I)Ljava/lang/Integer;
      // 08: astore 3
      // 09: iload 1
      // 0a: iload 2
      // 0b: ifeq 74
      // 0e: ifne 69
      // 11: goto 18
      // 14: invokestatic ksn.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic ksn.qbd Ljava/util/Map;
      // 1b: aload 3
      // 1c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 21: iload 2
      // 22: ifeq 55
      // 25: goto 2c
      // 28: invokestatic ksn.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifeq 4a
      // 2f: goto 36
      // 32: invokestatic ksn.a (Loov;)Loov;
      // 35: athrow
      // 36: getstatic ksn.qbd Ljava/util/Map;
      // 39: aload 3
      // 3a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3f: checkcast java/lang/Integer
      // 42: invokevirtual java/lang/Integer.intValue ()I
      // 45: ireturn
      // 46: invokestatic ksn.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 3
      // 4b: invokevirtual java/lang/Integer.intValue ()I
      // 4e: bipush 0
      // 4f: invokestatic ksn.b_j (IZ)Ljava/util/List;
      // 52: invokestatic ksn.aln (Ljava/util/Collection;)I
      // 55: istore 4
      // 57: getstatic ksn.qbd Ljava/util/Map;
      // 5a: aload 3
      // 5b: iload 4
      // 5d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 60: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 65: pop
      // 66: iload 4
      // 68: ireturn
      // 69: aload 3
      // 6a: invokevirtual java/lang/Integer.intValue ()I
      // 6d: bipush 1
      // 6e: invokestatic ksn.b_j (IZ)Ljava/util/List;
      // 71: invokestatic ksn.aln (Ljava/util/Collection;)I
      // 74: ireturn
   }

   public static String zvo(int var0) {
      int var1 = fku(var0);
      return m97[var1];
   }

   private static int en9(boolean param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 7
      // 005: bipush 0
      // 006: istore 8
      // 008: iload 0
      // 009: iload 7
      // 00b: ifne 02e
      // 00e: ifeq 026
      // 011: goto 018
      // 014: invokestatic ksn.a (Loov;)Loov;
      // 017: athrow
      // 018: iload 6
      // 01a: iload 4
      // 01c: invokestatic ksn.kq7 (II)I
      // 01f: istore 8
      // 021: iload 7
      // 023: ifeq 104
      // 026: iload 3
      // 027: goto 02e
      // 02a: invokestatic ksn.a (Loov;)Loov;
      // 02d: athrow
      // 02e: bipush -1
      // 02f: iload 7
      // 031: ifne 0ff
      // 034: if_icmpeq 0f4
      // 037: goto 03e
      // 03a: invokestatic ksn.a (Loov;)Loov;
      // 03d: athrow
      // 03e: iload 3
      // 03f: iload 7
      // 041: ifne 082
      // 044: goto 04b
      // 047: invokestatic ksn.a (Loov;)Loov;
      // 04a: athrow
      // 04b: ifne 07a
      // 04e: goto 055
      // 051: invokestatic ksn.a (Loov;)Loov;
      // 054: athrow
      // 055: iload 6
      // 057: invokestatic ksn.ztn (I)I
      // 05a: iload 4
      // 05c: iload 7
      // 05e: ifne 083
      // 061: goto 068
      // 064: invokestatic ksn.a (Loov;)Loov;
      // 067: athrow
      // 068: if_icmpne 07a
      // 06b: goto 072
      // 06e: invokestatic ksn.a (Loov;)Loov;
      // 071: athrow
      // 072: bipush 1
      // 073: istore 8
      // 075: iload 7
      // 077: ifeq 104
      // 07a: iload 3
      // 07b: goto 082
      // 07e: invokestatic ksn.a (Loov;)Loov;
      // 081: athrow
      // 082: bipush 1
      // 083: iload 7
      // 085: ifne 0cc
      // 088: if_icmpne 0b7
      // 08b: goto 092
      // 08e: invokestatic ksn.a (Loov;)Loov;
      // 091: athrow
      // 092: iload 6
      // 094: invokestatic ksn.ztn (I)I
      // 097: iload 4
      // 099: iload 7
      // 09b: ifne 0cc
      // 09e: goto 0a5
      // 0a1: invokestatic ksn.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: if_icmple 0b7
      // 0a8: goto 0af
      // 0ab: invokestatic ksn.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: bipush 1
      // 0b0: istore 8
      // 0b2: iload 7
      // 0b4: ifeq 104
      // 0b7: iload 3
      // 0b8: iload 7
      // 0ba: ifne 105
      // 0bd: goto 0c4
      // 0c0: invokestatic ksn.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: bipush 2
      // 0c5: goto 0cc
      // 0c8: invokestatic ksn.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: if_icmpne 104
      // 0cf: iload 6
      // 0d1: invokestatic ksn.ztn (I)I
      // 0d4: iload 7
      // 0d6: ifne 105
      // 0d9: goto 0e0
      // 0dc: invokestatic ksn.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 4
      // 0e2: if_icmpge 104
      // 0e5: goto 0ec
      // 0e8: invokestatic ksn.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: bipush 1
      // 0ed: istore 8
      // 0ef: iload 7
      // 0f1: ifeq 104
      // 0f4: iload 6
      // 0f6: iload 4
      // 0f8: goto 0ff
      // 0fb: invokestatic ksn.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: invokestatic ksn.xl_ (II)I
      // 102: istore 8
      // 104: iload 1
      // 105: iload 7
      // 107: ifne 11c
      // 10a: ifeq 11b
      // 10d: goto 114
      // 110: invokestatic ksn.a (Loov;)Loov;
      // 113: athrow
      // 114: iload 8
      // 116: iload 5
      // 118: imul
      // 119: istore 8
      // 11b: iload 2
      // 11c: iload 7
      // 11e: ifne 133
      // 121: ifeq 131
      // 124: goto 12b
      // 127: invokestatic ksn.a (Loov;)Loov;
      // 12a: athrow
      // 12b: iload 8
      // 12d: bipush -1
      // 12e: imul
      // 12f: istore 8
      // 131: iload 8
      // 133: ireturn
   }

   private static int ztn(int var0) {
      int var1 = OpaquePredicate.b();
      int var2 = 0;

      int var10000;
      while (true) {
         if (var0 > 0) {
            var10000 = var0 & var0 - 1;
            if (var1 == 0) {
               break;
            }

            var0 = var10000;
            var2++;
            if (var1 != 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   private static int p8f(String param0, int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: iload 1
      // 006: iload 4
      // 008: ifeq 47f
      // 00b: aload 0
      // 00c: invokevirtual java/lang/String.length ()I
      // 00f: if_icmpge 47e
      // 012: goto 019
      // 015: invokestatic ksn.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 2
      // 01a: iload 4
      // 01c: ifeq 47f
      // 01f: goto 026
      // 022: invokestatic ksn.a (Loov;)Loov;
      // 025: athrow
      // 026: iflt 47e
      // 029: goto 030
      // 02c: invokestatic ksn.a (Loov;)Loov;
      // 02f: athrow
      // 030: iload 1
      // 031: iload 4
      // 033: ifeq 47f
      // 036: goto 03d
      // 039: invokestatic ksn.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 2
      // 03e: if_icmpge 47e
      // 041: goto 048
      // 044: invokestatic ksn.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: bipush 124
      // 04b: iload 1
      // 04c: invokevirtual java/lang/String.indexOf (II)I
      // 04f: istore 5
      // 051: iload 5
      // 053: iload 4
      // 055: ifeq 0ca
      // 058: iflt 0c3
      // 05b: goto 062
      // 05e: invokestatic ksn.a (Loov;)Loov;
      // 061: athrow
      // 062: iload 5
      // 064: iload 4
      // 066: ifeq 0ca
      // 069: goto 070
      // 06c: invokestatic ksn.a (Loov;)Loov;
      // 06f: athrow
      // 070: iload 2
      // 071: if_icmpge 0c3
      // 074: goto 07b
      // 077: invokestatic ksn.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 0
      // 07c: iload 1
      // 07d: iload 5
      // 07f: bipush 1
      // 080: isub
      // 081: iload 3
      // 082: invokestatic ksn.p8f (Ljava/lang/String;III)I
      // 085: istore 6
      // 087: iload 6
      // 089: iload 4
      // 08b: ifeq 0a9
      // 08e: ifle 09f
      // 091: goto 098
      // 094: invokestatic ksn.a (Loov;)Loov;
      // 097: athrow
      // 098: iload 6
      // 09a: ireturn
      // 09b: invokestatic ksn.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: iload 5
      // 0a2: bipush 1
      // 0a3: iadd
      // 0a4: iload 2
      // 0a5: iload 3
      // 0a6: invokestatic ksn.p8f (Ljava/lang/String;III)I
      // 0a9: istore 7
      // 0ab: iload 7
      // 0ad: iload 4
      // 0af: ifeq 0be
      // 0b2: ifle 0c1
      // 0b5: goto 0bc
      // 0b8: invokestatic ksn.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: iload 7
      // 0be: goto 0c2
      // 0c1: bipush 0
      // 0c2: ireturn
      // 0c3: aload 0
      // 0c4: bipush 38
      // 0c6: iload 1
      // 0c7: invokevirtual java/lang/String.indexOf (II)I
      // 0ca: istore 6
      // 0cc: iload 6
      // 0ce: iload 4
      // 0d0: ifeq 161
      // 0d3: iflt 160
      // 0d6: goto 0dd
      // 0d9: invokestatic ksn.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: iload 6
      // 0df: iload 4
      // 0e1: ifeq 161
      // 0e4: goto 0eb
      // 0e7: invokestatic ksn.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: iload 2
      // 0ec: if_icmpge 160
      // 0ef: goto 0f6
      // 0f2: invokestatic ksn.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: iload 1
      // 0f8: iload 6
      // 0fa: bipush 1
      // 0fb: isub
      // 0fc: iload 3
      // 0fd: invokestatic ksn.p8f (Ljava/lang/String;III)I
      // 100: istore 7
      // 102: iload 7
      // 104: iload 4
      // 106: ifeq 123
      // 109: ifgt 119
      // 10c: goto 113
      // 10f: invokestatic ksn.a (Loov;)Loov;
      // 112: athrow
      // 113: bipush 0
      // 114: ireturn
      // 115: invokestatic ksn.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 6
      // 11c: bipush 1
      // 11d: iadd
      // 11e: iload 2
      // 11f: iload 3
      // 120: invokestatic ksn.p8f (Ljava/lang/String;III)I
      // 123: istore 8
      // 125: iload 8
      // 127: iload 4
      // 129: ifeq 140
      // 12c: ifgt 13e
      // 12f: goto 136
      // 132: invokestatic ksn.a (Loov;)Loov;
      // 135: athrow
      // 136: bipush 0
      // 137: goto 15f
      // 13a: invokestatic ksn.a (Loov;)Loov;
      // 13d: athrow
      // 13e: iload 7
      // 140: iload 4
      // 142: ifeq 15a
      // 145: iload 8
      // 147: if_icmple 15d
      // 14a: goto 151
      // 14d: invokestatic ksn.a (Loov;)Loov;
      // 150: athrow
      // 151: iload 7
      // 153: goto 15a
      // 156: invokestatic ksn.a (Loov;)Loov;
      // 159: athrow
      // 15a: goto 15f
      // 15d: iload 8
      // 15f: ireturn
      // 160: bipush 0
      // 161: istore 7
      // 163: bipush 0
      // 164: istore 8
      // 166: bipush 0
      // 167: istore 9
      // 169: bipush 0
      // 16a: istore 10
      // 16c: bipush 0
      // 16d: istore 11
      // 16f: bipush -1
      // 170: istore 12
      // 172: bipush 0
      // 173: istore 13
      // 175: bipush 0
      // 176: istore 14
      // 178: bipush 0
      // 179: istore 15
      // 17b: iload 1
      // 17c: istore 16
      // 17e: iload 16
      // 180: iload 2
      // 181: if_icmpge 44e
      // 184: aload 0
      // 185: iload 16
      // 187: invokevirtual java/lang/String.charAt (I)C
      // 18a: istore 17
      // 18c: iload 17
      // 18e: bipush 48
      // 190: iload 4
      // 192: ifeq 478
      // 195: iload 4
      // 197: ifeq 210
      // 19a: goto 1a1
      // 19d: invokestatic ksn.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: if_icmplt 205
      // 1a4: goto 1ab
      // 1a7: invokestatic ksn.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: iload 17
      // 1ad: bipush 57
      // 1af: iload 4
      // 1b1: ifeq 210
      // 1b4: goto 1bb
      // 1b7: invokestatic ksn.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: if_icmpgt 205
      // 1be: goto 1c5
      // 1c1: invokestatic ksn.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: iload 7
      // 1c7: iload 4
      // 1c9: ifeq 1fe
      // 1cc: goto 1d3
      // 1cf: invokestatic ksn.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: ifeq 1ec
      // 1d6: goto 1dd
      // 1d9: invokestatic ksn.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: iload 17
      // 1df: bipush 48
      // 1e1: isub
      // 1e2: istore 14
      // 1e4: bipush 1
      // 1e5: istore 8
      // 1e7: iload 4
      // 1e9: ifne 446
      // 1ec: iload 13
      // 1ee: bipush 10
      // 1f0: imul
      // 1f1: istore 13
      // 1f3: iload 13
      // 1f5: iload 17
      // 1f7: bipush 48
      // 1f9: isub
      // 1fa: iadd
      // 1fb: istore 13
      // 1fd: bipush 1
      // 1fe: istore 9
      // 200: iload 4
      // 202: ifne 446
      // 205: iload 17
      // 207: bipush 42
      // 209: goto 210
      // 20c: invokestatic ksn.a (Loov;)Loov;
      // 20f: athrow
      // 210: iload 4
      // 212: ifeq 232
      // 215: if_icmpne 227
      // 218: goto 21f
      // 21b: invokestatic ksn.a (Loov;)Loov;
      // 21e: athrow
      // 21f: bipush 1
      // 220: istore 7
      // 222: iload 4
      // 224: ifne 446
      // 227: iload 17
      // 229: bipush 33
      // 22b: goto 232
      // 22e: invokestatic ksn.a (Loov;)Loov;
      // 231: athrow
      // 232: iload 4
      // 234: ifeq 299
      // 237: if_icmpne 28e
      // 23a: goto 241
      // 23d: invokestatic ksn.a (Loov;)Loov;
      // 240: athrow
      // 241: iload 9
      // 243: iload 4
      // 245: ifeq 287
      // 248: goto 24f
      // 24b: invokestatic ksn.a (Loov;)Loov;
      // 24e: athrow
      // 24f: ifeq 286
      // 252: goto 259
      // 255: invokestatic ksn.a (Loov;)Loov;
      // 258: athrow
      // 259: iload 15
      // 25b: iload 10
      // 25d: iload 8
      // 25f: iload 11
      // 261: iload 12
      // 263: iload 13
      // 265: iload 14
      // 267: iload 3
      // 268: invokestatic ksn.en9 (ZZZIIII)I
      // 26b: iadd
      // 26c: istore 15
      // 26e: bipush 0
      // 26f: istore 10
      // 271: bipush 0
      // 272: istore 11
      // 274: bipush 0
      // 275: istore 7
      // 277: bipush 0
      // 278: istore 8
      // 27a: bipush 0
      // 27b: istore 9
      // 27d: bipush 0
      // 27e: istore 14
      // 280: bipush 0
      // 281: istore 13
      // 283: bipush -1
      // 284: istore 12
      // 286: bipush 1
      // 287: istore 10
      // 289: iload 4
      // 28b: ifne 446
      // 28e: iload 17
      // 290: bipush 45
      // 292: goto 299
      // 295: invokestatic ksn.a (Loov;)Loov;
      // 298: athrow
      // 299: iload 4
      // 29b: ifeq 30c
      // 29e: if_icmpne 2f5
      // 2a1: goto 2a8
      // 2a4: invokestatic ksn.a (Loov;)Loov;
      // 2a7: athrow
      // 2a8: iload 9
      // 2aa: iload 4
      // 2ac: ifeq 2ee
      // 2af: goto 2b6
      // 2b2: invokestatic ksn.a (Loov;)Loov;
      // 2b5: athrow
      // 2b6: ifeq 2ed
      // 2b9: goto 2c0
      // 2bc: invokestatic ksn.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: iload 15
      // 2c2: iload 10
      // 2c4: iload 8
      // 2c6: iload 11
      // 2c8: iload 12
      // 2ca: iload 13
      // 2cc: iload 14
      // 2ce: iload 3
      // 2cf: invokestatic ksn.en9 (ZZZIIII)I
      // 2d2: iadd
      // 2d3: istore 15
      // 2d5: bipush 0
      // 2d6: istore 10
      // 2d8: bipush 0
      // 2d9: istore 11
      // 2db: bipush 0
      // 2dc: istore 7
      // 2de: bipush 0
      // 2df: istore 8
      // 2e1: bipush 0
      // 2e2: istore 9
      // 2e4: bipush 0
      // 2e5: istore 14
      // 2e7: bipush 0
      // 2e8: istore 13
      // 2ea: bipush -1
      // 2eb: istore 12
      // 2ed: bipush 1
      // 2ee: istore 11
      // 2f0: iload 4
      // 2f2: ifne 446
      // 2f5: iload 17
      // 2f7: iload 4
      // 2f9: ifeq 3b0
      // 2fc: goto 303
      // 2ff: invokestatic ksn.a (Loov;)Loov;
      // 302: athrow
      // 303: bipush 61
      // 305: goto 30c
      // 308: invokestatic ksn.a (Loov;)Loov;
      // 30b: athrow
      // 30c: if_icmpeq 3a7
      // 30f: iload 17
      // 311: iload 4
      // 313: ifeq 3b0
      // 316: goto 31d
      // 319: invokestatic ksn.a (Loov;)Loov;
      // 31c: athrow
      // 31d: bipush 60
      // 31f: if_icmpeq 3a7
      // 322: goto 329
      // 325: invokestatic ksn.a (Loov;)Loov;
      // 328: athrow
      // 329: iload 17
      // 32b: iload 4
      // 32d: ifeq 3b0
      // 330: goto 337
      // 333: invokestatic ksn.a (Loov;)Loov;
      // 336: athrow
      // 337: bipush 62
      // 339: if_icmpeq 3a7
      // 33c: goto 343
      // 33f: invokestatic ksn.a (Loov;)Loov;
      // 342: athrow
      // 343: iload 17
      // 345: iload 4
      // 347: ifeq 366
      // 34a: goto 351
      // 34d: invokestatic ksn.a (Loov;)Loov;
      // 350: athrow
      // 351: bipush 43
      // 353: if_icmpne 446
      // 356: goto 35d
      // 359: invokestatic ksn.a (Loov;)Loov;
      // 35c: athrow
      // 35d: iload 9
      // 35f: goto 366
      // 362: invokestatic ksn.a (Loov;)Loov;
      // 365: athrow
      // 366: iload 4
      // 368: ifeq 3a0
      // 36b: ifeq 446
      // 36e: goto 375
      // 371: invokestatic ksn.a (Loov;)Loov;
      // 374: athrow
      // 375: iload 15
      // 377: iload 10
      // 379: iload 8
      // 37b: iload 11
      // 37d: iload 12
      // 37f: iload 13
      // 381: iload 14
      // 383: iload 3
      // 384: invokestatic ksn.en9 (ZZZIIII)I
      // 387: iadd
      // 388: istore 15
      // 38a: bipush 0
      // 38b: istore 10
      // 38d: bipush 0
      // 38e: istore 11
      // 390: bipush 0
      // 391: istore 7
      // 393: bipush 0
      // 394: istore 8
      // 396: bipush 0
      // 397: istore 9
      // 399: bipush 0
      // 39a: istore 14
      // 39c: bipush 0
      // 39d: istore 13
      // 39f: bipush -1
      // 3a0: istore 12
      // 3a2: iload 4
      // 3a4: ifne 446
      // 3a7: iload 9
      // 3a9: goto 3b0
      // 3ac: invokestatic ksn.a (Loov;)Loov;
      // 3af: athrow
      // 3b0: iload 4
      // 3b2: ifeq 3ee
      // 3b5: ifeq 3ec
      // 3b8: goto 3bf
      // 3bb: invokestatic ksn.a (Loov;)Loov;
      // 3be: athrow
      // 3bf: iload 15
      // 3c1: iload 10
      // 3c3: iload 8
      // 3c5: iload 11
      // 3c7: iload 12
      // 3c9: iload 13
      // 3cb: iload 14
      // 3cd: iload 3
      // 3ce: invokestatic ksn.en9 (ZZZIIII)I
      // 3d1: iadd
      // 3d2: istore 15
      // 3d4: bipush 0
      // 3d5: istore 10
      // 3d7: bipush 0
      // 3d8: istore 11
      // 3da: bipush 0
      // 3db: istore 7
      // 3dd: bipush 0
      // 3de: istore 8
      // 3e0: bipush 0
      // 3e1: istore 9
      // 3e3: bipush 0
      // 3e4: istore 14
      // 3e6: bipush 0
      // 3e7: istore 13
      // 3e9: bipush -1
      // 3ea: istore 12
      // 3ec: iload 17
      // 3ee: bipush 61
      // 3f0: iload 4
      // 3f2: ifeq 412
      // 3f5: if_icmpne 407
      // 3f8: goto 3ff
      // 3fb: invokestatic ksn.a (Loov;)Loov;
      // 3fe: athrow
      // 3ff: bipush 0
      // 400: istore 12
      // 402: iload 4
      // 404: ifne 446
      // 407: iload 17
      // 409: bipush 60
      // 40b: goto 412
      // 40e: invokestatic ksn.a (Loov;)Loov;
      // 411: athrow
      // 412: iload 4
      // 414: ifeq 440
      // 417: if_icmpne 429
      // 41a: goto 421
      // 41d: invokestatic ksn.a (Loov;)Loov;
      // 420: athrow
      // 421: bipush 2
      // 422: istore 12
      // 424: iload 4
      // 426: ifne 446
      // 429: iload 17
      // 42b: iload 4
      // 42d: ifeq 444
      // 430: goto 437
      // 433: invokestatic ksn.a (Loov;)Loov;
      // 436: athrow
      // 437: bipush 62
      // 439: goto 440
      // 43c: invokestatic ksn.a (Loov;)Loov;
      // 43f: athrow
      // 440: if_icmpne 446
      // 443: bipush 1
      // 444: istore 12
      // 446: iinc 16 1
      // 449: iload 4
      // 44b: ifne 17e
      // 44e: iload 9
      // 450: iload 4
      // 452: ifeq 47d
      // 455: ifeq 47b
      // 458: goto 45f
      // 45b: invokestatic ksn.a (Loov;)Loov;
      // 45e: athrow
      // 45f: iload 15
      // 461: iload 10
      // 463: iload 8
      // 465: iload 11
      // 467: iload 12
      // 469: iload 13
      // 46b: iload 14
      // 46d: iload 3
      // 46e: invokestatic ksn.en9 (ZZZIIII)I
      // 471: goto 478
      // 474: invokestatic ksn.a (Loov;)Loov;
      // 477: athrow
      // 478: iadd
      // 479: istore 15
      // 47b: iload 15
      // 47d: ireturn
      // 47e: bipush 0
      // 47f: ireturn
   }

   public static List b_j(int param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 3
      // 002: invokestatic OpaquePredicate.c ()I
      // 005: getstatic mcs.ip9 [Lmcs;
      // 008: astore 4
      // 00a: istore 2
      // 00b: aload 4
      // 00d: arraylength
      // 00e: istore 5
      // 010: bipush 0
      // 011: istore 6
      // 013: iload 6
      // 015: iload 5
      // 017: if_icmpge 1aa
      // 01a: aload 4
      // 01c: iload 6
      // 01e: aaload
      // 01f: astore 7
      // 021: iload 2
      // 022: ifne 1a6
      // 025: aload 7
      // 027: ifnull 1a3
      // 02a: goto 031
      // 02d: invokestatic ksn.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 7
      // 033: iload 2
      // 034: ifne 06d
      // 037: goto 03e
      // 03a: invokestatic ksn.a (Loov;)Loov;
      // 03d: athrow
      // 03e: invokevirtual mcs.ppq ()Z
      // 041: ifeq 056
      // 044: goto 04b
      // 047: invokestatic ksn.a (Loov;)Loov;
      // 04a: athrow
      // 04b: iload 1
      // 04c: ifeq 1a3
      // 04f: goto 056
      // 052: invokestatic ksn.a (Loov;)Loov;
      // 055: athrow
      // 056: getstatic ksn.bhl Ljava/util/Map;
      // 059: aload 7
      // 05b: invokevirtual mcs.wj9 ()I
      // 05e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 061: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 066: goto 06d
      // 069: invokestatic ksn.a (Loov;)Loov;
      // 06c: athrow
      // 06d: checkcast java/lang/String
      // 070: astore 8
      // 072: iload 2
      // 073: ifne 1a6
      // 076: aload 8
      // 078: ifnull 1a3
      // 07b: goto 082
      // 07e: invokestatic ksn.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 8
      // 084: bipush 0
      // 085: aload 8
      // 087: invokevirtual java/lang/String.length ()I
      // 08a: iload 0
      // 08b: invokestatic ksn.p8f (Ljava/lang/String;III)I
      // 08e: istore 9
      // 090: iload 2
      // 091: ifne 1a6
      // 094: iload 9
      // 096: ifle 1a3
      // 099: goto 0a0
      // 09c: invokestatic ksn.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: bipush 0
      // 0a1: istore 10
      // 0a3: getstatic ksn.ngn Ljava/util/Map;
      // 0a6: aload 7
      // 0a8: invokevirtual mcs.wj9 ()I
      // 0ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ae: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0b3: checkcast java/lang/String
      // 0b6: astore 11
      // 0b8: aload 11
      // 0ba: iload 2
      // 0bb: ifne 0ca
      // 0be: ifnull 0e9
      // 0c1: goto 0c8
      // 0c4: invokestatic ksn.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 11
      // 0ca: bipush 0
      // 0cb: aload 11
      // 0cd: invokevirtual java/lang/String.length ()I
      // 0d0: iload 0
      // 0d1: invokestatic ksn.p8f (Ljava/lang/String;III)I
      // 0d4: istore 10
      // 0d6: iload 10
      // 0d8: iload 2
      // 0d9: ifne 0ee
      // 0dc: ifge 0e9
      // 0df: goto 0e6
      // 0e2: invokestatic ksn.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: bipush 0
      // 0e7: istore 10
      // 0e9: aload 7
      // 0eb: invokevirtual mcs.jee ()Z
      // 0ee: iload 2
      // 0ef: ifne 12f
      // 0f2: ifeq 103
      // 0f5: goto 0fc
      // 0f8: invokestatic ksn.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: bipush 1
      // 0fd: istore 9
      // 0ff: iload 2
      // 100: ifeq 155
      // 103: sipush 1200
      // 106: iload 9
      // 108: bipush 3
      // 109: imul
      // 10a: iload 9
      // 10c: bipush 1
      // 10d: isub
      // 10e: bipush 2
      // 10f: imul
      // 110: iadd
      // 111: imul
      // 112: istore 9
      // 114: iload 9
      // 116: iload 10
      // 118: ishr
      // 119: istore 9
      // 11b: iload 9
      // 11d: i2d
      // 11e: aload 7
      // 120: invokevirtual mcs.cto ()D
      // 123: dmul
      // 124: invokestatic java/lang/Math.round (D)J
      // 127: l2i
      // 128: istore 9
      // 12a: iload 0
      // 12b: sipush 16384
      // 12e: iand
      // 12f: iload 2
      // 130: ifne 153
      // 133: ifeq 155
      // 136: goto 13d
      // 139: invokestatic ksn.a (Loov;)Loov;
      // 13c: athrow
      // 13d: iload 9
      // 13f: i2d
      // 140: ldc2_w 0.75
      // 143: dmul
      // 144: ldc2_w 0.5
      // 147: dadd
      // 148: invokestatic java/lang/Math.round (D)J
      // 14b: l2i
      // 14c: goto 153
      // 14f: invokestatic ksn.a (Loov;)Loov;
      // 152: athrow
      // 153: istore 9
      // 155: aload 3
      // 156: iload 2
      // 157: ifne 167
      // 15a: ifnonnull 168
      // 15d: goto 164
      // 160: invokestatic ksn.a (Loov;)Loov;
      // 163: athrow
      // 164: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 167: astore 3
      // 168: new sdj
      // 16b: dup
      // 16c: aload 7
      // 16e: invokevirtual mcs.wj9 ()I
      // 171: iload 9
      // 173: iload 10
      // 175: invokespecial sdj.<init> (III)V
      // 178: astore 12
      // 17a: iload 0
      // 17b: sipush 16384
      // 17e: iand
      // 17f: iload 2
      // 180: ifne 1a2
      // 183: ifeq 19a
      // 186: goto 18d
      // 189: invokestatic ksn.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 12
      // 18f: bipush 1
      // 190: invokevirtual sdj.iv3 (Z)V
      // 193: goto 19a
      // 196: invokestatic ksn.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 3
      // 19b: aload 12
      // 19d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a2: pop
      // 1a3: iinc 6 1
      // 1a6: iload 2
      // 1a7: ifeq 013
      // 1aa: aload 3
      // 1ab: areturn
   }

   private static int sid(int param0, int param1, boolean param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: iload 4
      // 07: iload 5
      // 09: ifeq 38
      // 0c: ifeq 37
      // 0f: goto 16
      // 12: invokestatic ksn.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 0
      // 17: iload 1
      // 18: invokestatic ksn.a43 (II)Z
      // 1b: iload 5
      // 1d: ifeq b3
      // 20: goto 27
      // 23: invokestatic ksn.a (Loov;)Loov;
      // 26: athrow
      // 27: ifne b2
      // 2a: goto 31
      // 2d: invokestatic ksn.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: invokestatic ksn.a (Loov;)Loov;
      // 36: athrow
      // 37: iload 2
      // 38: iload 5
      // 3a: ifeq 5c
      // 3d: ifeq 54
      // 40: goto 47
      // 43: invokestatic ksn.a (Loov;)Loov;
      // 46: athrow
      // 47: iload 0
      // 48: bipush 1
      // 49: iload 1
      // 4a: ishl
      // 4b: bipush -1
      // 4c: ixor
      // 4d: iand
      // 4e: istore 0
      // 4f: iload 5
      // 51: ifne b2
      // 54: iload 3
      // 55: goto 5c
      // 58: invokestatic ksn.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 5
      // 5e: ifeq b1
      // 61: ifeq a5
      // 64: goto 6b
      // 67: invokestatic ksn.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 0
      // 6c: bipush 1
      // 6d: iload 1
      // 6e: ishl
      // 6f: iand
      // 70: iload 5
      // 72: ifeq 9f
      // 75: goto 7c
      // 78: invokestatic ksn.a (Loov;)Loov;
      // 7b: athrow
      // 7c: ifne 91
      // 7f: goto 86
      // 82: invokestatic ksn.a (Loov;)Loov;
      // 85: athrow
      // 86: iload 0
      // 87: bipush 1
      // 88: iload 1
      // 89: ishl
      // 8a: ior
      // 8b: istore 0
      // 8c: iload 5
      // 8e: ifne b2
      // 91: iload 0
      // 92: bipush 1
      // 93: iload 1
      // 94: ishl
      // 95: bipush -1
      // 96: ixor
      // 97: iand
      // 98: goto 9f
      // 9b: invokestatic ksn.a (Loov;)Loov;
      // 9e: athrow
      // 9f: istore 0
      // a0: iload 5
      // a2: ifne b2
      // a5: iload 0
      // a6: bipush 1
      // a7: iload 1
      // a8: ishl
      // a9: ior
      // aa: goto b1
      // ad: invokestatic ksn.a (Loov;)Loov;
      // b0: athrow
      // b1: istore 0
      // b2: iload 0
      // b3: ireturn
   }

   public static int l18(int param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 3
      // 002: aload 1
      // 003: invokevirtual java/lang/String.length ()I
      // 006: istore 4
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: bipush 0
      // 00c: istore 5
      // 00e: bipush 0
      // 00f: istore 6
      // 011: istore 2
      // 012: bipush 0
      // 013: istore 7
      // 015: bipush 0
      // 016: istore 8
      // 018: bipush 0
      // 019: istore 9
      // 01b: iload 3
      // 01c: istore 10
      // 01e: iload 10
      // 020: iload 4
      // 022: if_icmpge 1c0
      // 025: aload 1
      // 026: iload 10
      // 028: invokevirtual java/lang/String.charAt (I)C
      // 02b: istore 11
      // 02d: iload 11
      // 02f: bipush 48
      // 031: iload 2
      // 032: ifne 1e1
      // 035: iload 2
      // 036: ifne 086
      // 039: goto 040
      // 03c: invokestatic ksn.a (Loov;)Loov;
      // 03f: athrow
      // 040: if_icmplt 07b
      // 043: goto 04a
      // 046: invokestatic ksn.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 11
      // 04c: bipush 57
      // 04e: iload 2
      // 04f: ifne 086
      // 052: goto 059
      // 055: invokestatic ksn.a (Loov;)Loov;
      // 058: athrow
      // 059: if_icmpgt 07b
      // 05c: goto 063
      // 05f: invokestatic ksn.a (Loov;)Loov;
      // 062: athrow
      // 063: iload 9
      // 065: bipush 10
      // 067: imul
      // 068: istore 9
      // 06a: iload 9
      // 06c: iload 11
      // 06e: bipush 48
      // 070: isub
      // 071: iadd
      // 072: istore 9
      // 074: bipush 1
      // 075: istore 5
      // 077: iload 2
      // 078: ifeq 1b9
      // 07b: iload 11
      // 07d: bipush 33
      // 07f: goto 086
      // 082: invokestatic ksn.a (Loov;)Loov;
      // 085: athrow
      // 086: iload 2
      // 087: ifne 0d9
      // 08a: if_icmpne 0ce
      // 08d: goto 094
      // 090: invokestatic ksn.a (Loov;)Loov;
      // 093: athrow
      // 094: iload 5
      // 096: iload 2
      // 097: ifne 0c8
      // 09a: goto 0a1
      // 09d: invokestatic ksn.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifeq 0c7
      // 0a4: goto 0ab
      // 0a7: invokestatic ksn.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: iload 0
      // 0ac: iload 9
      // 0ae: iload 7
      // 0b0: iload 6
      // 0b2: iload 8
      // 0b4: invokestatic ksn.sid (IIZZZ)I
      // 0b7: istore 0
      // 0b8: bipush 0
      // 0b9: istore 8
      // 0bb: bipush 0
      // 0bc: istore 6
      // 0be: bipush 0
      // 0bf: istore 7
      // 0c1: bipush 0
      // 0c2: istore 5
      // 0c4: bipush 0
      // 0c5: istore 9
      // 0c7: bipush 1
      // 0c8: istore 6
      // 0ca: iload 2
      // 0cb: ifeq 1b9
      // 0ce: iload 11
      // 0d0: bipush 45
      // 0d2: goto 0d9
      // 0d5: invokestatic ksn.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: ifne 12c
      // 0dd: if_icmpne 121
      // 0e0: goto 0e7
      // 0e3: invokestatic ksn.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 5
      // 0e9: iload 2
      // 0ea: ifne 11b
      // 0ed: goto 0f4
      // 0f0: invokestatic ksn.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ifeq 11a
      // 0f7: goto 0fe
      // 0fa: invokestatic ksn.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: iload 0
      // 0ff: iload 9
      // 101: iload 7
      // 103: iload 6
      // 105: iload 8
      // 107: invokestatic ksn.sid (IIZZZ)I
      // 10a: istore 0
      // 10b: bipush 0
      // 10c: istore 8
      // 10e: bipush 0
      // 10f: istore 6
      // 111: bipush 0
      // 112: istore 7
      // 114: bipush 0
      // 115: istore 5
      // 117: bipush 0
      // 118: istore 9
      // 11a: bipush 1
      // 11b: istore 7
      // 11d: iload 2
      // 11e: ifeq 1b9
      // 121: iload 11
      // 123: bipush 43
      // 125: goto 12c
      // 128: invokestatic ksn.a (Loov;)Loov;
      // 12b: athrow
      // 12c: iload 2
      // 12d: ifne 187
      // 130: if_icmpne 171
      // 133: goto 13a
      // 136: invokestatic ksn.a (Loov;)Loov;
      // 139: athrow
      // 13a: iload 5
      // 13c: iload 2
      // 13d: ifne 16b
      // 140: goto 147
      // 143: invokestatic ksn.a (Loov;)Loov;
      // 146: athrow
      // 147: ifeq 1b9
      // 14a: goto 151
      // 14d: invokestatic ksn.a (Loov;)Loov;
      // 150: athrow
      // 151: iload 0
      // 152: iload 9
      // 154: iload 7
      // 156: iload 6
      // 158: iload 8
      // 15a: invokestatic ksn.sid (IIZZZ)I
      // 15d: istore 0
      // 15e: bipush 0
      // 15f: istore 8
      // 161: bipush 0
      // 162: istore 6
      // 164: bipush 0
      // 165: istore 7
      // 167: bipush 0
      // 168: istore 5
      // 16a: bipush 0
      // 16b: istore 9
      // 16d: iload 2
      // 16e: ifeq 1b9
      // 171: iload 11
      // 173: iload 2
      // 174: ifne 18c
      // 177: goto 17e
      // 17a: invokestatic ksn.a (Loov;)Loov;
      // 17d: athrow
      // 17e: bipush 38
      // 180: goto 187
      // 183: invokestatic ksn.a (Loov;)Loov;
      // 186: athrow
      // 187: if_icmpne 1b9
      // 18a: iload 5
      // 18c: iload 2
      // 18d: ifne 1b7
      // 190: ifeq 1b6
      // 193: goto 19a
      // 196: invokestatic ksn.a (Loov;)Loov;
      // 199: athrow
      // 19a: iload 0
      // 19b: iload 9
      // 19d: iload 7
      // 19f: iload 6
      // 1a1: iload 8
      // 1a3: invokestatic ksn.sid (IIZZZ)I
      // 1a6: istore 0
      // 1a7: bipush 0
      // 1a8: istore 8
      // 1aa: bipush 0
      // 1ab: istore 6
      // 1ad: bipush 0
      // 1ae: istore 7
      // 1b0: bipush 0
      // 1b1: istore 5
      // 1b3: bipush 0
      // 1b4: istore 9
      // 1b6: bipush 1
      // 1b7: istore 8
      // 1b9: iinc 10 1
      // 1bc: iload 2
      // 1bd: ifeq 01e
      // 1c0: iload 5
      // 1c2: iload 2
      // 1c3: ifne 1e2
      // 1c6: ifeq 1dd
      // 1c9: goto 1d0
      // 1cc: invokestatic ksn.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: iload 0
      // 1d1: iload 9
      // 1d3: iload 7
      // 1d5: iload 6
      // 1d7: iload 8
      // 1d9: invokestatic ksn.sid (IIZZZ)I
      // 1dc: istore 0
      // 1dd: iload 0
      // 1de: sipush 32767
      // 1e1: iand
      // 1e2: ireturn
   }

   public static int egu(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = OpaquePredicate.c();

      byte var10000;
      label90: {
         label89: {
            try {
               var10000 = a43(var0, var1);
               if (var6 != 0) {
                  break label90;
               }

               if (var10000 != 0) {
                  break label89;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var10000 = 0;
            break label90;
         }

         var10000 = 16;
      }

      byte var10001;
      label81: {
         label80: {
            try {
               var10001 = a43(var0, var2);
               if (var6 != 0) {
                  break label81;
               }

               if (var10001 != 0) {
                  break label80;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var10001 = 0;
            break label81;
         }

         var10001 = 8;
      }

      label72: {
         label71: {
            try {
               var10000 |= var10001;
               var10001 = a43(var0, var3);
               if (var6 != 0) {
                  break label72;
               }

               if (var10001 != 0) {
                  break label71;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var10001 = 0;
            break label72;
         }

         var10001 = 4;
      }

      label63: {
         label62: {
            try {
               var10000 |= var10001;
               var10001 = a43(var0, var4);
               if (var6 != 0) {
                  break label63;
               }

               if (var10001 != 0) {
                  break label62;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var10001 = 0;
            break label63;
         }

         var10001 = 2;
      }

      try {
         var10000 |= var10001;
         var10001 = a43(var0, var5);
         if (var6 != 0) {
            return var10000 | var10001;
         }

         if (var10001 != 0) {
            return var10000 | 1;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      return var10000 | 0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3740276821985984322L, 8953668396484013488L, MethodHandles.lookup().lookupClass()).a(13760625727775L);
      // $VF: monitorexit
      long var10 = var10000 ^ 60430220714027L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[58];
      int var6 = 0;
      String var5 = "bì\u0080\u009ca-I\u00971£\u0098\u0012K<±îÉã¹zA\u0012âi\u0018\u000e\u0086ä\u0013½\u0007o*1ù\u009eµýÄÍ\u0005·/Gg\u0095\u0010ä¾\u0018\u000e\u0086ä\u0013½\u0007o*\u0091\u009eÖøY\u0019¯?£ç2\u008f\u001eG¸ÿ\u0018\u000e\u0086ä\u0013½\u0007o*÷ì3æ\"o$øxËÁ\u007f\u0080Ü\u000e0\u0018\u000e\u0086ä\u0013½\u0007o*\u009d\u001cë\u0006\u0099OÈBá\u000fê»\u007fâv\u0015\u0018\u000e\u0086ä\u0013½\u0007o*\u0017l\u008b\u0083\u0090pÐª\u0098úÃ\u0085ÅvÖp\u0010bßcPº¹\u0001^g\u0080ØPì\u008b~Ä\u0010¦\u0083º+ðÎ\u0093Ý#OPÃ×Ý\u007f\u009b\u0018\u000e\u0086ä\u0013½\u0007o*Î.Äv\u0084¨fy#\"æÑeØ¨²\u0018È\u0011µwd\bì\u0089Yù©ÑX{¥¢4B&¥ús`à\u0018Ì\u0014\u0080Óß^RÄA9æì2·\u0087Ö\u009a\u0016\u0003\u0081\u000f°ù:\u0018\u000e\u0086ä\u0013½\u0007o*;×û\u008bÇ\u0090sæfÒÃÖÕr£\u008c\u0018\u000e\u0086ä\u0013½\u0007o*Êê\n3DDÇ(Kmi«sp<\u001e\u00103¡]¬ã\u000eã\u0093\u0093\u0005È\u009eá?:* \u000e\u0086ä\u0013½\u0007o*ùéµf~¸ \u001af\u0011Ùæ\u001a8ò÷\u0013µÐQx\u0006Êu\u0018\u000e\u0086ä\u0013½\u0007o*L\u009d\u001a(\u00075|\u0007kËCq«\u00ad\u0085Ê\u0018\u000e\u0086ä\u0013½\u0007o*¨ªÄ\u008aæ·ýs÷È\u0080\u0000r:\u009b¯\u00183³P>pç\u001b\u009cÌnÔLxKK\u0018Ñt\u0091É\u001b_G/\u0018\u000e\u0086ä\u0013½\u0007o*)\u0089Ó\u000f\u009cBdkÕ\u0093î\u0000Ï\n¦Ú\bHmguè¨c¬\u0018\u000e\u0086ä\u0013½\u0007o*7ÔÈ°\u000fEâ¾öÉ4z\u0007\fÃ7\u0018\u000e\u0086ä\u0013½\u0007o*ñª51å¤V\u007fz\u000bÑ-Ú+5\u0018\u00183³P>pç\u001b\u009c¶êm\u0001oÂãá6jy\u000eÎ\u001d³é\u0018\u000e\u0086ä\u0013½\u0007o*=wîÊ\u001e\u0084\u009c,úàJ«uØMá\u0010È\u0011µwd\bì\u0089q\u0005¢Ååò\u00136\u0018\u000e\u0086ä\u0013½\u0007o*E.LPbz)Hb´4\u001b-\rF&\u0010bì\u0080\u009ca-I\u0097«\u009cM÷Û\u009dqò\u0018\u000e\u0086ä\u0013½\u0007o*\u009d\u001cë\u0006\u0099OÈB±?ô\u001dRp*&\u0018\u000e\u0086ä\u0013½\u0007o*ßy}\u0000õOû\u001bÉ|\u0093é\u0084á;¹\u0018\u000e\u0086ä\u0013½\u0007o*\bèÿt6Ø\u0085P#§ÝY¼\u0098_Ù\u0010ðk·]1\u000bbºbÜ'vÏ£\u0003©\u00183³P>pç\u001b\u009czeëÖqpÉZKí\u0014øÓÙ¦a\u001012%\u007fq\u009f\u008a\u0091ä£©õ9xÚÆ\u0010\u00adåLý8g\u001b\u009b°Ð\u0090fqä> \u0018\u000e\u0086ä\u0013½\u0007o*É^n½Á«\u0097k-HQ\u0006\u001cË^\\\bØëU¶ÆÛ÷5\u0018\u000e\u0086ä\u0013½\u0007o*\u0005cË\f$´føÝ?(0,\u0098JI\u0018\u000e\u0086ä\u0013½\u0007o*íW\"sgB½KÂ\u000b}Z-¯åñ\u0018\u000e\u0086ä\u0013½\u0007o*+Ég\u0086ý¼M¤.OóÉo\u009aI\u0001\u0018\u000e\u0086ä\u0013½\u0007o*WÂ±WÀ¹ð\u0011º\r\u009e\u0085\u0098l\u0017j\u0018\u000e\u0086ä\u0013½\u0007o*¼ \u0001Ðî\"A\u0003»#\u0099~Ã\u009d<\u001a\u00183³P>pç\u001b\u009cl\u008f\u009c]ñTu¦^¦\u0091\u001f°å[\u0081\u0010Q&$s8\u0095Wh\nÎ®{\u009aÁ\f\u008e\u0010é\u0090L\u0085\u009bÁ\u0082ÏÃ\u0011%H\u001djvÿ\u0018È\u0011µwd\bì\u0089N\u008f\u0085pÙÒYôu\u0096¶þ!¨\u00ad7\u0010?èq\u0096î_»ÅÅw\u0002\u001f\u009eyã°\u0018\u000e\u0086ä\u0013½\u0007o*À\u0010´¯\u008f@ÍQ+\u0095þ¶<{n\u0085\u0010g\u0091\u0081<N'Svc\u0006Uúpè{Q\u0018\u000e\u0086ä\u0013½\u0007o*¡À\u001b=ÏÞÔZÎ=à¥ã(\u0007¯\u0010PÜ´\u0000óÑj\u0087\u0092WmÇ¥Êô\u0097\u0018\u000e\u0086ä\u0013½\u0007o*ß£*\u0002\u0012\u00ad£#\u0090\u009dùk\u0083gì\u0005\u0018bì\u0080\u009ca-I\u0097*ø²¹^\u0013Ï\r$I§ctö×Ç\u0018\u000e\u0086ä\u0013½\u0007o*\u009d\u001cë\u0006\u0099OÈBì6®vé\u000b1y\u0018\u000e\u0086ä\u0013½\u0007o*À\u0010´¯\u008f@ÍQ£\u0099\u008f\u0082\\Gy¿\u0018È\u0011µwd\bì\u0089ïTÈ6\u0081.%\u0089\u0018ãmòËL<\u0090\u0018\u000e\u0086ä\u0013½\u0007o*ÆF1üL,\u0083òF\u001cØ)Ò \u0003¸";
      int var7 = "bì\u0080\u009ca-I\u00971£\u0098\u0012K<±îÉã¹zA\u0012âi\u0018\u000e\u0086ä\u0013½\u0007o*1ù\u009eµýÄÍ\u0005·/Gg\u0095\u0010ä¾\u0018\u000e\u0086ä\u0013½\u0007o*\u0091\u009eÖøY\u0019¯?£ç2\u008f\u001eG¸ÿ\u0018\u000e\u0086ä\u0013½\u0007o*÷ì3æ\"o$øxËÁ\u007f\u0080Ü\u000e0\u0018\u000e\u0086ä\u0013½\u0007o*\u009d\u001cë\u0006\u0099OÈBá\u000fê»\u007fâv\u0015\u0018\u000e\u0086ä\u0013½\u0007o*\u0017l\u008b\u0083\u0090pÐª\u0098úÃ\u0085ÅvÖp\u0010bßcPº¹\u0001^g\u0080ØPì\u008b~Ä\u0010¦\u0083º+ðÎ\u0093Ý#OPÃ×Ý\u007f\u009b\u0018\u000e\u0086ä\u0013½\u0007o*Î.Äv\u0084¨fy#\"æÑeØ¨²\u0018È\u0011µwd\bì\u0089Yù©ÑX{¥¢4B&¥ús`à\u0018Ì\u0014\u0080Óß^RÄA9æì2·\u0087Ö\u009a\u0016\u0003\u0081\u000f°ù:\u0018\u000e\u0086ä\u0013½\u0007o*;×û\u008bÇ\u0090sæfÒÃÖÕr£\u008c\u0018\u000e\u0086ä\u0013½\u0007o*Êê\n3DDÇ(Kmi«sp<\u001e\u00103¡]¬ã\u000eã\u0093\u0093\u0005È\u009eá?:* \u000e\u0086ä\u0013½\u0007o*ùéµf~¸ \u001af\u0011Ùæ\u001a8ò÷\u0013µÐQx\u0006Êu\u0018\u000e\u0086ä\u0013½\u0007o*L\u009d\u001a(\u00075|\u0007kËCq«\u00ad\u0085Ê\u0018\u000e\u0086ä\u0013½\u0007o*¨ªÄ\u008aæ·ýs÷È\u0080\u0000r:\u009b¯\u00183³P>pç\u001b\u009cÌnÔLxKK\u0018Ñt\u0091É\u001b_G/\u0018\u000e\u0086ä\u0013½\u0007o*)\u0089Ó\u000f\u009cBdkÕ\u0093î\u0000Ï\n¦Ú\bHmguè¨c¬\u0018\u000e\u0086ä\u0013½\u0007o*7ÔÈ°\u000fEâ¾öÉ4z\u0007\fÃ7\u0018\u000e\u0086ä\u0013½\u0007o*ñª51å¤V\u007fz\u000bÑ-Ú+5\u0018\u00183³P>pç\u001b\u009c¶êm\u0001oÂãá6jy\u000eÎ\u001d³é\u0018\u000e\u0086ä\u0013½\u0007o*=wîÊ\u001e\u0084\u009c,úàJ«uØMá\u0010È\u0011µwd\bì\u0089q\u0005¢Ååò\u00136\u0018\u000e\u0086ä\u0013½\u0007o*E.LPbz)Hb´4\u001b-\rF&\u0010bì\u0080\u009ca-I\u0097«\u009cM÷Û\u009dqò\u0018\u000e\u0086ä\u0013½\u0007o*\u009d\u001cë\u0006\u0099OÈB±?ô\u001dRp*&\u0018\u000e\u0086ä\u0013½\u0007o*ßy}\u0000õOû\u001bÉ|\u0093é\u0084á;¹\u0018\u000e\u0086ä\u0013½\u0007o*\bèÿt6Ø\u0085P#§ÝY¼\u0098_Ù\u0010ðk·]1\u000bbºbÜ'vÏ£\u0003©\u00183³P>pç\u001b\u009czeëÖqpÉZKí\u0014øÓÙ¦a\u001012%\u007fq\u009f\u008a\u0091ä£©õ9xÚÆ\u0010\u00adåLý8g\u001b\u009b°Ð\u0090fqä> \u0018\u000e\u0086ä\u0013½\u0007o*É^n½Á«\u0097k-HQ\u0006\u001cË^\\\bØëU¶ÆÛ÷5\u0018\u000e\u0086ä\u0013½\u0007o*\u0005cË\f$´føÝ?(0,\u0098JI\u0018\u000e\u0086ä\u0013½\u0007o*íW\"sgB½KÂ\u000b}Z-¯åñ\u0018\u000e\u0086ä\u0013½\u0007o*+Ég\u0086ý¼M¤.OóÉo\u009aI\u0001\u0018\u000e\u0086ä\u0013½\u0007o*WÂ±WÀ¹ð\u0011º\r\u009e\u0085\u0098l\u0017j\u0018\u000e\u0086ä\u0013½\u0007o*¼ \u0001Ðî\"A\u0003»#\u0099~Ã\u009d<\u001a\u00183³P>pç\u001b\u009cl\u008f\u009c]ñTu¦^¦\u0091\u001f°å[\u0081\u0010Q&$s8\u0095Wh\nÎ®{\u009aÁ\f\u008e\u0010é\u0090L\u0085\u009bÁ\u0082ÏÃ\u0011%H\u001djvÿ\u0018È\u0011µwd\bì\u0089N\u008f\u0085pÙÒYôu\u0096¶þ!¨\u00ad7\u0010?èq\u0096î_»ÅÅw\u0002\u001f\u009eyã°\u0018\u000e\u0086ä\u0013½\u0007o*À\u0010´¯\u008f@ÍQ+\u0095þ¶<{n\u0085\u0010g\u0091\u0081<N'Svc\u0006Uúpè{Q\u0018\u000e\u0086ä\u0013½\u0007o*¡À\u001b=ÏÞÔZÎ=à¥ã(\u0007¯\u0010PÜ´\u0000óÑj\u0087\u0092WmÇ¥Êô\u0097\u0018\u000e\u0086ä\u0013½\u0007o*ß£*\u0002\u0012\u00ad£#\u0090\u009dùk\u0083gì\u0005\u0018bì\u0080\u009ca-I\u0097*ø²¹^\u0013Ï\r$I§ctö×Ç\u0018\u000e\u0086ä\u0013½\u0007o*\u009d\u001cë\u0006\u0099OÈBì6®vé\u000b1y\u0018\u000e\u0086ä\u0013½\u0007o*À\u0010´¯\u008f@ÍQ£\u0099\u008f\u0082\\Gy¿\u0018È\u0011µwd\bì\u0089ïTÈ6\u0081.%\u0089\u0018ãmòËL<\u0090\u0018\u000e\u0086ä\u0013½\u0007o*ÆF1üL,\u0083òF\u001cØ)Ò \u0003¸"
         .length();
      char var4 = 24;
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
                     lvq = var8[13];
                     zk0 = var8[19];
                     d4k = var8[49];
                     a97 = var8[45];
                     c5c = var8[43];
                     w9k = var8[7];
                     zvb = var8[42];
                     ng_ = var8[33];
                     ye4 = var8[6];
                     euk = var8[30];
                     omc = var8[47];
                     qtg = var8[32];
                     shs = var8[35];
                     ei0 = null;
                     bhl = Maps.newHashMap();
                     ngn = Maps.newHashMap();
                     qbd = Maps.newHashMap();
                     m97 = new String[]{
                        var8[29],
                        var8[14],
                        var8[37],
                        var8[48],
                        var8[3],
                        var8[20],
                        var8[39],
                        var8[46],
                        var8[38],
                        var8[36],
                        var8[4],
                        var8[27],
                        var8[52],
                        var8[18],
                        var8[56],
                        var8[5],
                        var8[53],
                        var8[16],
                        var8[1],
                        var8[28],
                        var8[25],
                        var8[12],
                        var8[15],
                        var8[21],
                        var8[23],
                        var8[11],
                        var8[50],
                        var8[8],
                        var8[55],
                        var8[2],
                        var8[34],
                        var8[40]
                     };
                     bhl.put(mcs.kkg.wj9(), var8[44]);
                     bhl.put(mcs.uwx.wj9(), var8[22]);
                     bhl.put(mcs.sw1.wj9(), var8[10]);
                     bhl.put(mcs.az0.wj9(), var8[24]);
                     bhl.put(mcs.veq.wj9(), var8[51]);
                     bhl.put(mcs.fhc.wj9(), var8[0]);
                     bhl.put(mcs.zlo.wj9(), var8[26]);
                     bhl.put(mcs.j2p.wj9(), var8[17]);
                     bhl.put(mcs.faz.wj9(), var8[9]);
                     bhl.put(mcs.lu2.wj9(), var8[31]);
                     bhl.put(mcs.zgt.wj9(), var8[41]);
                     bhl.put(mcs.h8d.wj9(), var8[54]);
                     bhl.put(mcs.y0p.wj9(), var8[57]);
                     ngn.put(mcs.uwx.wj9(), "5");
                     ngn.put(mcs.izk.wj9(), "5");
                     ngn.put(mcs.faz.wj9(), "5");
                     ngn.put(mcs.kkg.wj9(), "5");
                     ngn.put(mcs.zlo.wj9(), "5");
                     ngn.put(mcs.az0.wj9(), "5");
                     ngn.put(mcs.y3z.wj9(), "5");
                     ngn.put(mcs.veq.wj9(), "5");
                     ngn.put(mcs.y0p.wj9(), "5");
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

                  var5 = "\u000e\u0086ä\u0013½\u0007o*¡î\u0084\u0090eéÂüS{Éqoi÷\u009f\u0018Ì\u0014\u0080Óß^RÄ\ni\u0094ëþÎ=^\u009fâ\u008fóÄ]\u008bÚ";
                  var7 = "\u000e\u0086ä\u0013½\u0007o*¡î\u0084\u0090eéÂüS{Éqoi÷\u009f\u0018Ì\u0014\u0080Óß^RÄ\ni\u0094ëþÎ=^\u009fâ\u008fóÄ]\u008bÚ".length();
                  var4 = 24;
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
