package net.minecraft.world.gen.structure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MapGenStronghold extends fln {
   private List iu_;
   private boolean _a4;
   private h2f[] pgd;
   private double _u0;
   private int kxo;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public MapGenStronghold() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial fln.<init> ()V
      // 04: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 07: aload 0
      // 08: bipush 3
      // 09: anewarray 39
      // 0c: putfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 0f: aload 0
      // 10: ldc2_w 32.0
      // 13: putfield net/minecraft/world/gen/structure/MapGenStronghold._u0 D
      // 16: aload 0
      // 17: bipush 3
      // 18: putfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 1b: aload 0
      // 1c: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 1f: putfield net/minecraft/world/gen/structure/MapGenStronghold.iu_ Ljava/util/List;
      // 22: invokestatic gyu.x0c ()[Lgyu;
      // 25: astore 2
      // 26: aload 2
      // 27: arraylength
      // 28: istore 3
      // 29: astore 1
      // 2a: bipush 0
      // 2b: istore 4
      // 2d: iload 4
      // 2f: iload 3
      // 30: if_icmpge 7f
      // 33: aload 2
      // 34: iload 4
      // 36: aaload
      // 37: astore 5
      // 39: aload 1
      // 3a: ifnull 7b
      // 3d: aload 5
      // 3f: ifnull 78
      // 42: goto 49
      // 45: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 5
      // 4b: getfield gyu.f6x F
      // 4e: fconst_0
      // 4f: fcmpl
      // 50: aload 1
      // 51: ifnull 77
      // 54: goto 5b
      // 57: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 5a: athrow
      // 5b: ifle 78
      // 5e: goto 65
      // 61: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: getfield net/minecraft/world/gen/structure/MapGenStronghold.iu_ Ljava/util/List;
      // 69: aload 5
      // 6b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 70: goto 77
      // 73: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 76: athrow
      // 77: pop
      // 78: iinc 4 1
      // 7b: aload 1
      // 7c: ifnonnull 2d
      // 7f: return
   }

   public MapGenStronghold(Map param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/minecraft/world/gen/structure/MapGenStronghold.b J
      // 003: ldc2_w 128639286826425
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: invokespecial net/minecraft/world/gen/structure/MapGenStronghold.<init> ()V
      // 00c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 00f: aload 1
      // 010: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 015: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 01a: astore 5
      // 01c: astore 4
      // 01e: aload 5
      // 020: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 025: ifeq 11e
      // 028: aload 5
      // 02a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02f: checkcast java/util/Map$Entry
      // 032: astore 6
      // 034: aload 6
      // 036: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 03b: checkcast java/lang/String
      // 03e: sipush 18257
      // 041: ldc2_w 4328963749834869639
      // 044: lload 2
      // 045: lxor
      // 046: invokedynamic q (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/MapGenStronghold.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: nop
      // 04c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04f: aload 4
      // 051: ifnull 0a2
      // 054: ifeq 080
      // 057: goto 05e
      // 05a: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 6
      // 061: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 066: checkcast java/lang/String
      // 069: aload 0
      // 06a: getfield net/minecraft/world/gen/structure/MapGenStronghold._u0 D
      // 06d: dconst_1
      // 06e: invokestatic fe6.s2_ (Ljava/lang/String;DD)D
      // 071: putfield net/minecraft/world/gen/structure/MapGenStronghold._u0 D
      // 074: aload 4
      // 076: ifnonnull 119
      // 079: goto 080
      // 07c: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 6
      // 082: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 087: checkcast java/lang/String
      // 08a: sipush 17948
      // 08d: ldc2_w 5640428423965625035
      // 090: lload 2
      // 091: lxor
      // 092: invokedynamic q (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/MapGenStronghold.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09b: goto 0a2
      // 09e: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 4
      // 0a4: ifnull 0f9
      // 0a7: ifeq 0d7
      // 0aa: goto 0b1
      // 0ad: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: aload 6
      // 0b4: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0b9: checkcast java/lang/String
      // 0bc: aload 0
      // 0bd: getfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 0c0: arraylength
      // 0c1: bipush 1
      // 0c2: invokestatic fe6.rfv (Ljava/lang/String;II)I
      // 0c5: anewarray 39
      // 0c8: putfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 0cb: aload 4
      // 0cd: ifnonnull 119
      // 0d0: goto 0d7
      // 0d3: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 6
      // 0d9: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0de: checkcast java/lang/String
      // 0e1: sipush 10695
      // 0e4: ldc2_w 8935958328242939154
      // 0e7: lload 2
      // 0e8: lxor
      // 0e9: invokedynamic q (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/MapGenStronghold.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: nop
      // 0ef: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f2: goto 0f9
      // 0f5: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: ifeq 119
      // 0fc: aload 0
      // 0fd: aload 6
      // 0ff: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 104: checkcast java/lang/String
      // 107: aload 0
      // 108: getfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 10b: bipush 1
      // 10c: invokestatic fe6.rfv (Ljava/lang/String;II)I
      // 10f: putfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 112: goto 119
      // 115: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 4
      // 11b: ifnonnull 01e
      // 11e: return
   }

   @Override
   public String tqd() {
      long var1 = b ^ 135099676368336L;
      return b<"q">(26375, 770015390378042298L ^ var1);
   }

   @Override
   public boolean ary(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 3
      // 004: aload 0
      // 005: aload 3
      // 006: ifnull 130
      // 009: getfield net/minecraft/world/gen/structure/MapGenStronghold._a4 Z
      // 00c: ifne 12f
      // 00f: goto 016
      // 012: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 015: athrow
      // 016: new java/util/Random
      // 019: dup
      // 01a: invokespecial java/util/Random.<init> ()V
      // 01d: astore 4
      // 01f: aload 4
      // 021: aload 0
      // 022: getfield net/minecraft/world/gen/structure/MapGenStronghold.pr9 Lt9d;
      // 025: invokevirtual OpaquePredicate.x2p ()J
      // 028: invokevirtual java/util/Random.setSeed (J)V
      // 02b: aload 4
      // 02d: invokevirtual java/util/Random.nextDouble ()D
      // 030: ldc2_w 3.141592653589793
      // 033: dmul
      // 034: ldc2_w 2.0
      // 037: dmul
      // 038: dstore 5
      // 03a: bipush 1
      // 03b: istore 7
      // 03d: bipush 0
      // 03e: istore 8
      // 040: iload 8
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 046: arraylength
      // 047: if_icmpge 12a
      // 04a: ldc2_w 1.25
      // 04d: iload 7
      // 04f: i2d
      // 050: dmul
      // 051: aload 4
      // 053: invokevirtual java/util/Random.nextDouble ()D
      // 056: dadd
      // 057: aload 0
      // 058: getfield net/minecraft/world/gen/structure/MapGenStronghold._u0 D
      // 05b: dmul
      // 05c: iload 7
      // 05e: i2d
      // 05f: dmul
      // 060: dstore 9
      // 062: dload 5
      // 064: invokestatic java/lang/Math.cos (D)D
      // 067: dload 9
      // 069: dmul
      // 06a: invokestatic java/lang/Math.round (D)J
      // 06d: l2i
      // 06e: istore 11
      // 070: dload 5
      // 072: invokestatic java/lang/Math.sin (D)D
      // 075: dload 9
      // 077: dmul
      // 078: invokestatic java/lang/Math.round (D)J
      // 07b: l2i
      // 07c: istore 12
      // 07e: aload 0
      // 07f: getfield net/minecraft/world/gen/structure/MapGenStronghold.pr9 Lt9d;
      // 082: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 085: iload 11
      // 087: bipush 4
      // 088: ishl
      // 089: bipush 8
      // 08b: iadd
      // 08c: iload 12
      // 08e: bipush 4
      // 08f: ishl
      // 090: bipush 8
      // 092: iadd
      // 093: bipush 112
      // 095: aload 0
      // 096: getfield net/minecraft/world/gen/structure/MapGenStronghold.iu_ Ljava/util/List;
      // 099: aload 4
      // 09b: invokevirtual cdp.rc6 (IIILjava/util/List;Ljava/util/Random;)Lmew;
      // 09e: astore 13
      // 0a0: aload 3
      // 0a1: ifnull 12f
      // 0a4: aload 3
      // 0a5: ifnull 0f1
      // 0a8: goto 0af
      // 0ab: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 13
      // 0b1: ifnull 0cd
      // 0b4: goto 0bb
      // 0b7: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 13
      // 0bd: invokevirtual mew.getX ()I
      // 0c0: bipush 4
      // 0c1: ishr
      // 0c2: istore 11
      // 0c4: aload 13
      // 0c6: invokevirtual mew.getZ ()I
      // 0c9: bipush 4
      // 0ca: ishr
      // 0cb: istore 12
      // 0cd: aload 0
      // 0ce: getfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 0d1: iload 8
      // 0d3: new h2f
      // 0d6: dup
      // 0d7: iload 11
      // 0d9: iload 12
      // 0db: invokespecial h2f.<init> (II)V
      // 0de: aastore
      // 0df: dload 5
      // 0e1: ldc2_w 6.283185307179586
      // 0e4: iload 7
      // 0e6: i2d
      // 0e7: dmul
      // 0e8: aload 0
      // 0e9: getfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 0ec: i2d
      // 0ed: ddiv
      // 0ee: dadd
      // 0ef: dstore 5
      // 0f1: aload 3
      // 0f2: ifnull 126
      // 0f5: iload 8
      // 0f7: aload 0
      // 0f8: getfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 0fb: if_icmpne 123
      // 0fe: goto 105
      // 101: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 104: athrow
      // 105: iload 7
      // 107: bipush 2
      // 108: aload 4
      // 10a: bipush 5
      // 10b: invokevirtual java/util/Random.nextInt (I)I
      // 10e: iadd
      // 10f: iadd
      // 110: istore 7
      // 112: aload 0
      // 113: dup
      // 114: getfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 117: bipush 1
      // 118: aload 4
      // 11a: bipush 2
      // 11b: invokevirtual java/util/Random.nextInt (I)I
      // 11e: iadd
      // 11f: iadd
      // 120: putfield net/minecraft/world/gen/structure/MapGenStronghold.kxo I
      // 123: iinc 8 1
      // 126: aload 3
      // 127: ifnonnull 040
      // 12a: aload 0
      // 12b: bipush 1
      // 12c: putfield net/minecraft/world/gen/structure/MapGenStronghold._a4 Z
      // 12f: aload 0
      // 130: getfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 133: astore 4
      // 135: aload 4
      // 137: arraylength
      // 138: istore 5
      // 13a: bipush 0
      // 13b: istore 6
      // 13d: iload 6
      // 13f: iload 5
      // 141: if_icmpge 195
      // 144: aload 4
      // 146: iload 6
      // 148: aaload
      // 149: astore 7
      // 14b: aload 3
      // 14c: ifnull 191
      // 14f: iload 1
      // 150: aload 3
      // 151: ifnull 196
      // 154: goto 15b
      // 157: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 7
      // 15d: getfield h2f.jnd I
      // 160: if_icmpne 18e
      // 163: goto 16a
      // 166: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 169: athrow
      // 16a: iload 2
      // 16b: aload 3
      // 16c: ifnull 18d
      // 16f: goto 176
      // 172: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 7
      // 178: getfield h2f.km5 I
      // 17b: if_icmpne 18e
      // 17e: goto 185
      // 181: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 184: athrow
      // 185: bipush 1
      // 186: goto 18d
      // 189: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 18c: athrow
      // 18d: ireturn
      // 18e: iinc 6 1
      // 191: aload 3
      // 192: ifnonnull 13d
      // 195: bipush 0
      // 196: ireturn
   }

   @Override
   public List f_m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 2
      // 04: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 07: aload 0
      // 08: getfield net/minecraft/world/gen/structure/MapGenStronghold.pgd [Lh2f;
      // 0b: astore 3
      // 0c: astore 1
      // 0d: aload 3
      // 0e: arraylength
      // 0f: istore 4
      // 11: bipush 0
      // 12: istore 5
      // 14: iload 5
      // 16: iload 4
      // 18: if_icmpge 4d
      // 1b: aload 3
      // 1c: iload 5
      // 1e: aaload
      // 1f: astore 6
      // 21: aload 1
      // 22: ifnull 49
      // 25: aload 6
      // 27: ifnull 46
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 2
      // 32: aload 6
      // 34: bipush 64
      // 36: invokevirtual h2f.ct7 (I)Lmew;
      // 39: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3e: pop
      // 3f: goto 46
      // 42: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 45: athrow
      // 46: iinc 5 1
      // 49: aload 1
      // 4a: ifnonnull 14
      // 4d: aload 2
      // 4e: areturn
   }

   @Override
   public ijb sph(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 3
      // 04: new net/minecraft/world/gen/structure/MapGenStronghold$Start
      // 07: dup
      // 08: aload 0
      // 09: getfield net/minecraft/world/gen/structure/MapGenStronghold.pr9 Lt9d;
      // 0c: aload 0
      // 0d: getfield net/minecraft/world/gen/structure/MapGenStronghold.a0f Ljava/util/Random;
      // 10: iload 1
      // 11: iload 2
      // 12: invokespecial net/minecraft/world/gen/structure/MapGenStronghold$Start.<init> (Lt9d;Ljava/util/Random;II)V
      // 15: astore 4
      // 17: aload 4
      // 19: invokevirtual net/minecraft/world/gen/structure/MapGenStronghold$Start.fd9 ()Ljava/util/LinkedList;
      // 1c: invokevirtual java/util/LinkedList.isEmpty ()Z
      // 1f: ifne 4a
      // 22: aload 4
      // 24: aload 3
      // 25: ifnull 62
      // 28: aload 3
      // 29: ifnull 6a
      // 2c: goto 33
      // 2f: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual net/minecraft/world/gen/structure/MapGenStronghold$Start.fd9 ()Ljava/util/LinkedList;
      // 36: bipush 0
      // 37: invokevirtual java/util/LinkedList.get (I)Ljava/lang/Object;
      // 3a: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 3d: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.oo1 Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom;
      // 40: ifnonnull 68
      // 43: goto 4a
      // 46: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 49: athrow
      // 4a: new net/minecraft/world/gen/structure/MapGenStronghold$Start
      // 4d: dup
      // 4e: aload 0
      // 4f: getfield net/minecraft/world/gen/structure/MapGenStronghold.pr9 Lt9d;
      // 52: aload 0
      // 53: getfield net/minecraft/world/gen/structure/MapGenStronghold.a0f Ljava/util/Random;
      // 56: iload 1
      // 57: iload 2
      // 58: invokespecial net/minecraft/world/gen/structure/MapGenStronghold$Start.<init> (Lt9d;Ljava/util/Random;II)V
      // 5b: goto 62
      // 5e: invokestatic net/minecraft/world/gen/structure/MapGenStronghold.a (Loov;)Loov;
      // 61: athrow
      // 62: astore 4
      // 64: aload 3
      // 65: ifnonnull 17
      // 68: aload 4
      // 6a: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7148366491745396092L, -7928309895631013388L, MethodHandles.lookup().lookupClass()).a(136328113979043L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 22621236498991L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "ÉwObÙÜ\u0006çh\u0092\u008c\u009fzî'°\u0018\u0017\u0086\r¹Aß¿£\u008aÞûÉ»\u0005\u0095\u0007\u0092\u0092p4o\fKà";
      int var8 = "ÉwObÙÜ\u0006çh\u0092\u008c\u009fzî'°\u0018\u0017\u0086\r¹Aß¿£\u008aÞûÉ»\u0005\u0095\u0007\u0092\u0092p4o\fKà".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[4];
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

                  var6 = "H \u0005´£\u008fR\u0083õPÊ\u0013\u0081ÜÏy T¦\u000eù#ÔrH+¡\u0097h\u009dl÷\u0013ç¸Ä\u008f´]rìÍ®\u0012\u001cz\u009bPe";
                  var8 = "H \u0005´£\u008fR\u0083õPÊ\u0013\u0081ÜÏy T¦\u000eù#ÔrH+¡\u0097h\u009dl÷\u0013ç¸Ä\u008f´]rìÍ®\u0012\u001cz\u009bPe".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32076;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/MapGenStronghold", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/minecraft/world/gen/structure/MapGenStronghold" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
