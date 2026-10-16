import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o2n extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 112600996588908L;
      return b<"e">(14248, 797846452781382714L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 114996506817002L;
      return b<"e">(21266, 1453330148016309253L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic o2n.a J
      // 003: ldc2_w 108212970772521
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifne 03f
      // 014: bipush 6
      // 016: if_icmpge 03e
      // 019: goto 020
      // 01c: invokestatic o2n.a (Loov;)Loov;
      // 01f: athrow
      // 020: new w57
      // 023: dup
      // 024: sipush 20309
      // 027: ldc2_w 5610312726377066883
      // 02a: lload 3
      // 02b: lxor
      // 02c: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: bipush 0
      // 033: anewarray 37
      // 036: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 039: athrow
      // 03a: invokestatic o2n.a (Loov;)Loov;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: istore 6
      // 041: aload 1
      // 042: invokeinterface e7r.d3d ()Lmew; 1
      // 047: astore 7
      // 049: aload 7
      // 04b: invokevirtual mew.getX ()I
      // 04e: i2d
      // 04f: aload 2
      // 050: iload 6
      // 052: iinc 6 1
      // 055: aaload
      // 056: bipush 1
      // 057: invokestatic o2n.d80 (DLjava/lang/String;Z)D
      // 05a: dstore 8
      // 05c: aload 7
      // 05e: invokevirtual mew.getZ ()I
      // 061: i2d
      // 062: aload 2
      // 063: iload 6
      // 065: iinc 6 1
      // 068: aaload
      // 069: bipush 1
      // 06a: invokestatic o2n.d80 (DLjava/lang/String;Z)D
      // 06d: dstore 10
      // 06f: aload 2
      // 070: iload 6
      // 072: iinc 6 1
      // 075: aaload
      // 076: dconst_0
      // 077: invokestatic o2n.s5i (Ljava/lang/String;D)D
      // 07a: dstore 12
      // 07c: aload 2
      // 07d: iload 6
      // 07f: iinc 6 1
      // 082: aaload
      // 083: dload 12
      // 085: dconst_1
      // 086: dadd
      // 087: invokestatic o2n.s5i (Ljava/lang/String;D)D
      // 08a: dstore 14
      // 08c: aload 2
      // 08d: iload 6
      // 08f: iinc 6 1
      // 092: aaload
      // 093: invokestatic o2n.c8r (Ljava/lang/String;)Z
      // 096: istore 16
      // 098: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 09b: astore 17
      // 09d: iload 6
      // 09f: aload 2
      // 0a0: arraylength
      // 0a1: if_icmpge 12a
      // 0a4: aload 2
      // 0a5: iload 6
      // 0a7: iinc 6 1
      // 0aa: aaload
      // 0ab: astore 18
      // 0ad: aload 18
      // 0af: invokestatic z83.lhf (Ljava/lang/String;)Z
      // 0b2: iload 5
      // 0b4: ifne 14d
      // 0b7: ifeq 0fd
      // 0ba: goto 0c1
      // 0bd: invokestatic o2n.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 1
      // 0c2: aload 18
      // 0c4: ldc EntityLivingBase
      // 0c6: nop
      // 0c7: invokestatic z83.mib (Le7r;Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
      // 0ca: astore 19
      // 0cc: aload 19
      // 0ce: invokeinterface java/util/List.size ()I 1
      // 0d3: iload 5
      // 0d5: ifne 0f7
      // 0d8: ifne 0ee
      // 0db: goto 0e2
      // 0de: invokestatic o2n.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: new uac
      // 0e5: dup
      // 0e6: invokespecial uac.<init> ()V
      // 0e9: athrow
      // 0ea: invokestatic o2n.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 17
      // 0f0: aload 19
      // 0f2: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 0f7: pop
      // 0f8: iload 5
      // 0fa: ifeq 125
      // 0fd: invokestatic vr1._0v ()Lvr1;
      // 100: invokevirtual vr1.wh3 ()Lwlx;
      // 103: aload 18
      // 105: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 108: astore 19
      // 10a: aload 19
      // 10c: ifnonnull 11b
      // 10f: new iez
      // 112: dup
      // 113: invokespecial iez.<init> ()V
      // 116: athrow
      // 117: invokestatic o2n.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 17
      // 11d: aload 19
      // 11f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 124: pop
      // 125: iload 5
      // 127: ifeq 09d
      // 12a: aload 1
      // 12b: iload 5
      // 12d: ifne 15d
      // 130: getstatic n_k$pbp.byu Ln_k$pbp;
      // 133: aload 17
      // 135: invokeinterface java/util/List.size ()I 1
      // 13a: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 13f: aload 17
      // 141: invokeinterface java/util/List.isEmpty ()Z 1
      // 146: goto 14d
      // 149: invokestatic o2n.a (Loov;)Loov;
      // 14c: athrow
      // 14d: ifeq 15c
      // 150: new uac
      // 153: dup
      // 154: invokespecial uac.<init> ()V
      // 157: athrow
      // 158: invokestatic o2n.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 1
      // 15d: new hsu
      // 160: dup
      // 161: new java/lang/StringBuilder
      // 164: dup
      // 165: invokespecial java/lang/StringBuilder.<init> ()V
      // 168: sipush 14732
      // 16b: ldc2_w 3332165771982899030
      // 16e: lload 3
      // 16f: lxor
      // 170: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: nop
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 179: iload 16
      // 17b: ifeq 193
      // 17e: sipush 32508
      // 181: ldc2_w 3630257128331886637
      // 184: lload 3
      // 185: lxor
      // 186: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: nop
      // 18c: goto 1a1
      // 18f: invokestatic o2n.a (Loov;)Loov;
      // 192: athrow
      // 193: sipush 4147
      // 196: ldc2_w 8657540981534076646
      // 199: lload 3
      // 19a: lxor
      // 19b: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: nop
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a7: bipush 5
      // 1a8: anewarray 37
      // 1ab: dup
      // 1ac: bipush 0
      // 1ad: aload 17
      // 1af: invokeinterface java/util/List.size ()I 1
      // 1b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b7: aastore
      // 1b8: dup
      // 1b9: bipush 1
      // 1ba: dload 14
      // 1bc: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1bf: aastore
      // 1c0: dup
      // 1c1: bipush 2
      // 1c2: dload 8
      // 1c4: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1c7: aastore
      // 1c8: dup
      // 1c9: bipush 3
      // 1ca: dload 10
      // 1cc: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1cf: aastore
      // 1d0: dup
      // 1d1: bipush 4
      // 1d2: dload 12
      // 1d4: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1d7: aastore
      // 1d8: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1db: invokeinterface e7r.a0d (Lekw;)V 2
      // 1e0: aload 0
      // 1e1: aload 1
      // 1e2: aload 17
      // 1e4: new o2n$wma
      // 1e7: dup
      // 1e8: dload 8
      // 1ea: dload 10
      // 1ec: invokespecial o2n$wma.<init> (DD)V
      // 1ef: dload 12
      // 1f1: dload 14
      // 1f3: aload 17
      // 1f5: bipush 0
      // 1f6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1fb: checkcast EntityLivingBase
      // 1fe: getfield EntityLivingBase.oay Lt9d;
      // 201: iload 16
      // 203: invokespecial o2n.eux (Le7r;Ljava/util/List;Lo2n$wma;DDLt9d;Z)V
      // 206: return
   }

   private void eux(e7r param1, List param2, o2n$wma param3, double param4, double param6, OpaquePredicate param8, boolean param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic o2n.a J
      // 003: ldc2_w 105629263580487
      // 006: lxor
      // 007: lstore 10
      // 009: new java/util/Random
      // 00c: dup
      // 00d: invokespecial java/util/Random.<init> ()V
      // 010: astore 13
      // 012: aload 3
      // 013: getfield o2n$wma.qs5 D
      // 016: dload 6
      // 018: dsub
      // 019: dstore 14
      // 01b: aload 3
      // 01c: getfield o2n$wma.smh D
      // 01f: dload 6
      // 021: dsub
      // 022: dstore 16
      // 024: invokestatic OpaquePredicate.b ()I
      // 027: aload 3
      // 028: getfield o2n$wma.qs5 D
      // 02b: dload 6
      // 02d: dadd
      // 02e: dstore 18
      // 030: istore 12
      // 032: aload 3
      // 033: getfield o2n$wma.smh D
      // 036: dload 6
      // 038: dadd
      // 039: dstore 20
      // 03b: aload 0
      // 03c: aload 13
      // 03e: iload 9
      // 040: iload 12
      // 042: ifeq 05b
      // 045: ifeq 05e
      // 048: goto 04f
      // 04b: invokestatic o2n.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: aload 2
      // 051: invokespecial o2n.l0i (Ljava/util/List;)I
      // 054: goto 05b
      // 057: invokestatic o2n.a (Loov;)Loov;
      // 05a: athrow
      // 05b: goto 064
      // 05e: aload 2
      // 05f: invokeinterface java/util/List.size ()I 1
      // 064: dload 14
      // 066: dload 16
      // 068: dload 18
      // 06a: dload 20
      // 06c: invokespecial o2n.x6a (Ljava/util/Random;IDDDD)[Lo2n$wma;
      // 06f: astore 22
      // 071: aload 0
      // 072: aload 3
      // 073: dload 4
      // 075: aload 8
      // 077: aload 13
      // 079: dload 14
      // 07b: dload 16
      // 07d: dload 18
      // 07f: dload 20
      // 081: aload 22
      // 083: iload 9
      // 085: invokespecial o2n.tcg (Lo2n$wma;DLt9d;Ljava/util/Random;DDDD[Lo2n$wma;Z)I
      // 088: istore 23
      // 08a: aload 0
      // 08b: aload 2
      // 08c: aload 8
      // 08e: aload 22
      // 090: iload 9
      // 092: invokespecial o2n.ipn (Ljava/util/List;Lt9d;[Lo2n$wma;Z)D
      // 095: dstore 24
      // 097: aload 1
      // 098: aload 0
      // 099: new java/lang/StringBuilder
      // 09c: dup
      // 09d: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a0: sipush 3952
      // 0a3: ldc2_w 6516387442566603970
      // 0a6: lload 10
      // 0a8: lxor
      // 0a9: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: nop
      // 0af: iload 12
      // 0b1: ifeq 0e7
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: iload 9
      // 0b9: ifeq 0d9
      // 0bc: goto 0c3
      // 0bf: invokestatic o2n.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: sipush 14273
      // 0c6: ldc2_w 1616100353095605367
      // 0c9: lload 10
      // 0cb: lxor
      // 0cc: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: goto 0e8
      // 0d5: invokestatic o2n.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: sipush 3628
      // 0dc: ldc2_w 3619977593416656285
      // 0df: lload 10
      // 0e1: lxor
      // 0e2: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: nop
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ee: bipush 3
      // 0ef: anewarray 37
      // 0f2: dup
      // 0f3: bipush 0
      // 0f4: aload 22
      // 0f6: arraylength
      // 0f7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fa: aastore
      // 0fb: dup
      // 0fc: bipush 1
      // 0fd: aload 3
      // 0fe: getfield o2n$wma.qs5 D
      // 101: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 104: aastore
      // 105: dup
      // 106: bipush 2
      // 107: aload 3
      // 108: getfield o2n$wma.smh D
      // 10b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 10e: aastore
      // 10f: invokestatic o2n.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 112: aload 22
      // 114: arraylength
      // 115: bipush 1
      // 116: if_icmple 1a3
      // 119: aload 1
      // 11a: new hsu
      // 11d: dup
      // 11e: new java/lang/StringBuilder
      // 121: dup
      // 122: invokespecial java/lang/StringBuilder.<init> ()V
      // 125: sipush 21429
      // 128: ldc2_w 5662318590760482821
      // 12b: lload 10
      // 12d: lxor
      // 12e: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: nop
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: iload 9
      // 139: ifeq 159
      // 13c: goto 143
      // 13f: invokestatic o2n.a (Loov;)Loov;
      // 142: athrow
      // 143: sipush 14273
      // 146: ldc2_w 1616100353095605367
      // 149: lload 10
      // 14b: lxor
      // 14c: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: nop
      // 152: goto 168
      // 155: invokestatic o2n.a (Loov;)Loov;
      // 158: athrow
      // 159: sipush 3628
      // 15c: ldc2_w 3619977593416656285
      // 15f: lload 10
      // 161: lxor
      // 162: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: nop
      // 168: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16e: bipush 2
      // 16f: anewarray 37
      // 172: dup
      // 173: bipush 0
      // 174: sipush 5299
      // 177: ldc2_w 8192366246888259332
      // 17a: lload 10
      // 17c: lxor
      // 17d: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: nop
      // 183: bipush 1
      // 184: anewarray 37
      // 187: dup
      // 188: bipush 0
      // 189: dload 24
      // 18b: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 18e: aastore
      // 18f: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 192: aastore
      // 193: dup
      // 194: bipush 1
      // 195: iload 23
      // 197: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19a: aastore
      // 19b: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 19e: invokeinterface e7r.a0d (Lekw;)V 2
      // 1a3: return
   }

   private int l0i(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 03: astore 3
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 1
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 4
      // 0f: istore 2
      // 10: aload 4
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq 74
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast EntityLivingBase
      // 24: astore 5
      // 26: aload 5
      // 28: instanceof ha9
      // 2b: iload 2
      // 2c: ifne 7a
      // 2f: iload 2
      // 30: ifne 6f
      // 33: goto 3a
      // 36: invokestatic o2n.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifeq 5e
      // 3d: goto 44
      // 40: invokestatic o2n.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 3
      // 45: aload 5
      // 47: checkcast ha9
      // 4a: invokevirtual ha9.ued ()Ln_0;
      // 4d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 52: pop
      // 53: iload 2
      // 54: ifeq 70
      // 57: goto 5e
      // 5a: invokestatic o2n.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 3
      // 5f: aconst_null
      // 60: checkcast n_0
      // 63: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 68: goto 6f
      // 6b: invokestatic o2n.a (Loov;)Loov;
      // 6e: athrow
      // 6f: pop
      // 70: iload 2
      // 71: ifeq 10
      // 74: aload 3
      // 75: invokeinterface java/util/Set.size ()I 1
      // 7a: ireturn
   }

   private int tcg(
      o2n$wma param1,
      double param2,
      OpaquePredicate param4,
      Random param5,
      double param6,
      double param8,
      double param10,
      double param12,
      o2n$wma[] param14,
      boolean param15
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic o2n.a J
      // 003: ldc2_w 127125158238180
      // 006: lxor
      // 007: lstore 16
      // 009: bipush 1
      // 00a: istore 19
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: ldc2_w 3.4028234663852886E38
      // 012: dstore 20
      // 014: bipush 0
      // 015: istore 22
      // 017: istore 18
      // 019: iload 22
      // 01b: sipush 10000
      // 01e: if_icmpge 1e2
      // 021: iload 19
      // 023: iload 18
      // 025: ifne 1e4
      // 028: iload 18
      // 02a: ifne 1e4
      // 02d: goto 034
      // 030: invokestatic o2n.a (Loov;)Loov;
      // 033: athrow
      // 034: ifeq 1e2
      // 037: goto 03e
      // 03a: invokestatic o2n.a (Loov;)Loov;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: istore 19
      // 041: ldc2_w 3.4028234663852886E38
      // 044: dstore 20
      // 046: bipush 0
      // 047: istore 23
      // 049: iload 23
      // 04b: aload 14
      // 04d: arraylength
      // 04e: if_icmpge 186
      // 051: aload 14
      // 053: iload 23
      // 055: aaload
      // 056: astore 24
      // 058: bipush 0
      // 059: istore 25
      // 05b: new o2n$wma
      // 05e: dup
      // 05f: invokespecial o2n$wma.<init> ()V
      // 062: astore 26
      // 064: bipush 0
      // 065: iload 18
      // 067: ifne 188
      // 06a: istore 27
      // 06c: iload 27
      // 06e: aload 14
      // 070: arraylength
      // 071: if_icmpge 0e8
      // 074: iload 23
      // 076: iload 27
      // 078: iload 18
      // 07a: ifne 04e
      // 07d: if_icmpeq 0e0
      // 080: aload 14
      // 082: iload 27
      // 084: aaload
      // 085: astore 28
      // 087: aload 24
      // 089: aload 28
      // 08b: invokevirtual o2n$wma.kfm (Lo2n$wma;)D
      // 08e: dstore 29
      // 090: dload 29
      // 092: dload 20
      // 094: invokestatic java/lang/Math.min (DD)D
      // 097: dstore 20
      // 099: iload 18
      // 09b: ifne 0e3
      // 09e: dload 29
      // 0a0: dload 2
      // 0a1: dcmpg
      // 0a2: ifge 0e0
      // 0a5: goto 0ac
      // 0a8: invokestatic o2n.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iinc 25 1
      // 0af: aload 26
      // 0b1: dup
      // 0b2: getfield o2n$wma.qs5 D
      // 0b5: aload 28
      // 0b7: getfield o2n$wma.qs5 D
      // 0ba: aload 24
      // 0bc: getfield o2n$wma.qs5 D
      // 0bf: dsub
      // 0c0: dadd
      // 0c1: putfield o2n$wma.qs5 D
      // 0c4: aload 26
      // 0c6: dup
      // 0c7: getfield o2n$wma.smh D
      // 0ca: aload 28
      // 0cc: getfield o2n$wma.smh D
      // 0cf: aload 24
      // 0d1: getfield o2n$wma.smh D
      // 0d4: dsub
      // 0d5: dadd
      // 0d6: putfield o2n$wma.smh D
      // 0d9: goto 0e0
      // 0dc: invokestatic o2n.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: iinc 27 1
      // 0e3: iload 18
      // 0e5: ifeq 06c
      // 0e8: iload 25
      // 0ea: iload 18
      // 0ec: ifne 16c
      // 0ef: ifle 15f
      // 0f2: goto 0f9
      // 0f5: invokestatic o2n.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 26
      // 0fb: dup
      // 0fc: getfield o2n$wma.qs5 D
      // 0ff: iload 25
      // 101: i2d
      // 102: ddiv
      // 103: putfield o2n$wma.qs5 D
      // 106: aload 26
      // 108: dup
      // 109: getfield o2n$wma.smh D
      // 10c: iload 25
      // 10e: i2d
      // 10f: ddiv
      // 110: putfield o2n$wma.smh D
      // 113: aload 26
      // 115: invokevirtual o2n$wma.bqi ()F
      // 118: f2d
      // 119: dstore 27
      // 11b: iload 18
      // 11d: ifne 141
      // 120: dload 27
      // 122: dconst_0
      // 123: dcmpl
      // 124: ifle 146
      // 127: goto 12e
      // 12a: invokestatic o2n.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 26
      // 130: invokevirtual o2n$wma.r48 ()V
      // 133: aload 24
      // 135: aload 26
      // 137: invokevirtual o2n$wma.ec4 (Lo2n$wma;)V
      // 13a: goto 141
      // 13d: invokestatic o2n.a (Loov;)Loov;
      // 140: athrow
      // 141: iload 18
      // 143: ifeq 15c
      // 146: aload 24
      // 148: aload 5
      // 14a: dload 6
      // 14c: dload 8
      // 14e: dload 10
      // 150: dload 12
      // 152: invokevirtual o2n$wma.el3 (Ljava/util/Random;DDDD)V
      // 155: goto 15c
      // 158: invokestatic o2n.a (Loov;)Loov;
      // 15b: athrow
      // 15c: bipush 1
      // 15d: istore 19
      // 15f: aload 24
      // 161: dload 6
      // 163: dload 8
      // 165: dload 10
      // 167: dload 12
      // 169: invokevirtual o2n$wma.e09 (DDDD)Z
      // 16c: iload 18
      // 16e: ifne 17c
      // 171: ifeq 17e
      // 174: goto 17b
      // 177: invokestatic o2n.a (Loov;)Loov;
      // 17a: athrow
      // 17b: bipush 1
      // 17c: istore 19
      // 17e: iinc 23 1
      // 181: iload 18
      // 183: ifeq 049
      // 186: iload 19
      // 188: ifne 1da
      // 18b: aload 14
      // 18d: astore 23
      // 18f: aload 23
      // 191: arraylength
      // 192: istore 24
      // 194: bipush 0
      // 195: istore 25
      // 197: iload 25
      // 199: iload 24
      // 19b: if_icmpge 1da
      // 19e: aload 23
      // 1a0: iload 25
      // 1a2: aaload
      // 1a3: astore 26
      // 1a5: iload 18
      // 1a7: ifne 1d5
      // 1aa: aload 26
      // 1ac: aload 4
      // 1ae: invokevirtual o2n$wma.v6k (Lt9d;)Z
      // 1b1: iload 18
      // 1b3: ifne 01b
      // 1b6: goto 1bd
      // 1b9: invokestatic o2n.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: ifne 1d2
      // 1c0: aload 26
      // 1c2: aload 5
      // 1c4: dload 6
      // 1c6: dload 8
      // 1c8: dload 10
      // 1ca: dload 12
      // 1cc: invokevirtual o2n$wma.el3 (Ljava/util/Random;DDDD)V
      // 1cf: bipush 1
      // 1d0: istore 19
      // 1d2: iinc 25 1
      // 1d5: iload 18
      // 1d7: ifeq 197
      // 1da: iinc 22 1
      // 1dd: iload 18
      // 1df: ifeq 019
      // 1e2: iload 22
      // 1e4: iload 18
      // 1e6: ifne 292
      // 1e9: sipush 10000
      // 1ec: if_icmplt 290
      // 1ef: goto 1f6
      // 1f2: invokestatic o2n.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: new uvb
      // 1f9: dup
      // 1fa: new java/lang/StringBuilder
      // 1fd: dup
      // 1fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 201: sipush 4769
      // 204: ldc2_w 775555498257671095
      // 207: lload 16
      // 209: lxor
      // 20a: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: nop
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: iload 15
      // 215: ifeq 235
      // 218: goto 21f
      // 21b: invokestatic o2n.a (Loov;)Loov;
      // 21e: athrow
      // 21f: sipush 14273
      // 222: ldc2_w 1616116317578348244
      // 225: lload 16
      // 227: lxor
      // 228: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: nop
      // 22e: goto 244
      // 231: invokestatic o2n.a (Loov;)Loov;
      // 234: athrow
      // 235: sipush 3628
      // 238: ldc2_w 3619959507152863038
      // 23b: lload 16
      // 23d: lxor
      // 23e: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: nop
      // 244: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 247: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24a: bipush 4
      // 24b: anewarray 37
      // 24e: dup
      // 24f: bipush 0
      // 250: aload 14
      // 252: arraylength
      // 253: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 256: aastore
      // 257: dup
      // 258: bipush 1
      // 259: aload 1
      // 25a: getfield o2n$wma.qs5 D
      // 25d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 260: aastore
      // 261: dup
      // 262: bipush 2
      // 263: aload 1
      // 264: getfield o2n$wma.smh D
      // 267: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 26a: aastore
      // 26b: dup
      // 26c: bipush 3
      // 26d: sipush 5506
      // 270: ldc2_w 4629882240228091026
      // 273: lload 16
      // 275: lxor
      // 276: invokedynamic e (IJ)Ljava/lang/String; bsm=o2n.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: nop
      // 27c: bipush 1
      // 27d: anewarray 37
      // 280: dup
      // 281: bipush 0
      // 282: dload 20
      // 284: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 287: aastore
      // 288: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 28b: aastore
      // 28c: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 28f: athrow
      // 290: iload 22
      // 292: ireturn
   }

   private double ipn(List param1, OpaquePredicate param2, o2n$wma[] param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dconst_0
      // 001: dstore 6
      // 003: bipush 0
      // 004: istore 8
      // 006: invokestatic OpaquePredicate.c ()I
      // 009: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 00c: astore 9
      // 00e: bipush 0
      // 00f: istore 10
      // 011: istore 5
      // 013: iload 10
      // 015: aload 1
      // 016: invokeinterface java/util/List.size ()I 1
      // 01b: if_icmpge 138
      // 01e: aload 1
      // 01f: iload 10
      // 021: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 026: checkcast EntityLivingBase
      // 029: astore 11
      // 02b: iload 5
      // 02d: ifne 144
      // 030: iload 4
      // 032: iload 5
      // 034: ifne 059
      // 037: ifeq 0ad
      // 03a: goto 041
      // 03d: invokestatic o2n.a (Loov;)Loov;
      // 040: athrow
      // 041: aload 11
      // 043: iload 5
      // 045: ifne 05e
      // 048: goto 04f
      // 04b: invokestatic o2n.a (Loov;)Loov;
      // 04e: athrow
      // 04f: instanceof ha9
      // 052: goto 059
      // 055: invokestatic o2n.a (Loov;)Loov;
      // 058: athrow
      // 059: ifeq 067
      // 05c: aload 11
      // 05e: checkcast ha9
      // 061: invokevirtual ha9.ued ()Ln_0;
      // 064: goto 068
      // 067: aconst_null
      // 068: astore 13
      // 06a: aload 9
      // 06c: aload 13
      // 06e: iload 5
      // 070: ifne 09e
      // 073: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 078: ifne 09a
      // 07b: goto 082
      // 07e: invokestatic o2n.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 9
      // 084: aload 13
      // 086: aload 3
      // 087: iload 8
      // 089: iinc 8 1
      // 08c: aaload
      // 08d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 092: pop
      // 093: goto 09a
      // 096: invokestatic o2n.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 9
      // 09c: aload 13
      // 09e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a3: checkcast o2n$wma
      // 0a6: astore 12
      // 0a8: iload 5
      // 0aa: ifeq 0b6
      // 0ad: aload 3
      // 0ae: iload 8
      // 0b0: iinc 8 1
      // 0b3: aaload
      // 0b4: astore 12
      // 0b6: aload 11
      // 0b8: aload 12
      // 0ba: getfield o2n$wma.qs5 D
      // 0bd: invokestatic fe6.jqf (D)I
      // 0c0: i2f
      // 0c1: ldc 0.5
      // 0c3: nop
      // 0c4: fadd
      // 0c5: f2d
      // 0c6: aload 12
      // 0c8: aload 2
      // 0c9: invokevirtual o2n$wma.cmm (Lt9d;)I
      // 0cc: i2d
      // 0cd: aload 12
      // 0cf: getfield o2n$wma.smh D
      // 0d2: invokestatic fe6.jqf (D)I
      // 0d5: i2d
      // 0d6: ldc2_w 0.5
      // 0d9: dadd
      // 0da: invokevirtual EntityLivingBase.clj (DDD)V
      // 0dd: ldc2_w 1.7976931348623157E308
      // 0e0: dstore 13
      // 0e2: bipush 0
      // 0e3: istore 15
      // 0e5: iload 15
      // 0e7: aload 3
      // 0e8: arraylength
      // 0e9: if_icmpge 129
      // 0ec: aload 12
      // 0ee: iload 5
      // 0f0: ifne 026
      // 0f3: aload 3
      // 0f4: iload 15
      // 0f6: aaload
      // 0f7: iload 5
      // 0f9: ifne 113
      // 0fc: if_acmpeq 121
      // 0ff: goto 106
      // 102: invokestatic o2n.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 12
      // 108: aload 3
      // 109: iload 15
      // 10b: aaload
      // 10c: goto 113
      // 10f: invokestatic o2n.a (Loov;)Loov;
      // 112: athrow
      // 113: invokevirtual o2n$wma.kfm (Lo2n$wma;)D
      // 116: dstore 16
      // 118: dload 16
      // 11a: dload 13
      // 11c: invokestatic java/lang/Math.min (DD)D
      // 11f: dstore 13
      // 121: iinc 15 1
      // 124: iload 5
      // 126: ifeq 0e5
      // 129: dload 6
      // 12b: dload 13
      // 12d: dadd
      // 12e: dstore 6
      // 130: iinc 10 1
      // 133: iload 5
      // 135: ifeq 013
      // 138: dload 6
      // 13a: aload 1
      // 13b: invokeinterface java/util/List.size ()I 1
      // 140: i2d
      // 141: ddiv
      // 142: dstore 6
      // 144: dload 6
      // 146: dreturn
   }

   private o2n$wma[] x6a(Random var1, int var2, double var3, double var5, double var7, double var9) {
      o2n$wma[] var12 = new o2n$wma[var2];
      int var10000 = OpaquePredicate.b();
      int var13 = 0;
      int var11 = var10000;

      while (true) {
         if (var13 < var12.length) {
            o2n$wma var14 = new o2n$wma();

            try {
               var14.el3(var1, var3, var5, var7, var9);
               var16 = var12;
               if (var11 == 0) {
                  break;
               }

               var12[var13] = var14;
               var13++;
               if (var11 != 0) {
                  continue;
               }
            } catch (oov var15) {
               throw a(var15);
            }
         }

         var16 = var12;
         break;
      }

      return var16;
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: bipush 1
      // 08: iload 4
      // 0a: ifeq 2d
      // 0d: if_icmplt 39
      // 10: goto 17
      // 13: invokestatic o2n.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: iload 4
      // 1a: ifeq 31
      // 1d: goto 24
      // 20: invokestatic o2n.a (Loov;)Loov;
      // 23: athrow
      // 24: arraylength
      // 25: bipush 2
      // 26: goto 2d
      // 29: invokestatic o2n.a (Loov;)Loov;
      // 2c: athrow
      // 2d: if_icmpgt 39
      // 30: aload 2
      // 31: bipush 0
      // 32: aload 3
      // 33: invokestatic o2n._5o ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 36: goto 3a
      // 39: aconst_null
      // 3a: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8064858110074068905L, -1947433258471081573L, MethodHandles.lookup().lookupClass()).a(89618931172582L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 77481525070946L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "Ð@ÏîoÖC~&ô¶6b\f\u0094ð8\u009fËøë&Lï\u0081>\u0093\u0017g\u0082\u008càÂG´=Ü.¼\u009e?4\u000eÅá\u001aè¸\u0019ü¯h'Y\u0000\u0012a\u001a\u0087ÇÌ®øO\u000e¡e[õ£]Ä/\u0010Xõ@L¥=À\u0087aUä\u009cY\u009bO\u0090044\b\u008cfsîÂ';ZS$\u0007Ó\u009a\u0084\u0093\n£ë²8êSÄ,}ñÑ/UR\u0082¬\u0000pÞò^\u0083¸ÙxFÈ\u0012Ù\u0010QÏ\u0086¼\u001eHS-cÞ\u0012C²gek\u0010p7hCGô}i\u0013µ_&\u0087V\u0099r8Á2¾ò²f\\jî\u00ad·ü\u0016\b¼ÀåBnitc|z\u0012ßp× \u0083P^SÃ@\u0083^:¢\u0093AP\u0012Ñ¶AÉCµPyZêo§\u009dHÌßpE%ÛQ¿²\u008ce¿7X\u0091ýÿr±ø¤õæ\t\u009dj.Õ>áE»)NàÝ\u009dk\u001em\f\u0011\n¬U\u009dõkô¨z$W#sM\u0011\u001d\u000fDgÛ>+ÅÄ\u0018®ýñ\u0083ñ\u0010~»o\u0018T\u001c¾'¿ÅÿFÕ÷ëÑ0\u009a#D(ã¡,\u0094+\t%{\u0013gZÊÞp¦\f\u0003þ%\u001bû\u0098U\u00adQ(]ù¾\u009fCíÛr\u008c?¨Y\u009cQÂ³\u0083È\u0018ÝmV#g\u0080¤æI]X\u0004û9\u0091ã-Ê\u0018¦\u0004YmÚ";
      int var8 = "Ð@ÏîoÖC~&ô¶6b\f\u0094ð8\u009fËøë&Lï\u0081>\u0093\u0017g\u0082\u008càÂG´=Ü.¼\u009e?4\u000eÅá\u001aè¸\u0019ü¯h'Y\u0000\u0012a\u001a\u0087ÇÌ®øO\u000e¡e[õ£]Ä/\u0010Xõ@L¥=À\u0087aUä\u009cY\u009bO\u0090044\b\u008cfsîÂ';ZS$\u0007Ó\u009a\u0084\u0093\n£ë²8êSÄ,}ñÑ/UR\u0082¬\u0000pÞò^\u0083¸ÙxFÈ\u0012Ù\u0010QÏ\u0086¼\u001eHS-cÞ\u0012C²gek\u0010p7hCGô}i\u0013µ_&\u0087V\u0099r8Á2¾ò²f\\jî\u00ad·ü\u0016\b¼ÀåBnitc|z\u0012ßp× \u0083P^SÃ@\u0083^:¢\u0093AP\u0012Ñ¶AÉCµPyZêo§\u009dHÌßpE%ÛQ¿²\u008ce¿7X\u0091ýÿr±ø¤õæ\t\u009dj.Õ>áE»)NàÝ\u009dk\u001em\f\u0011\n¬U\u009dõkô¨z$W#sM\u0011\u001d\u000fDgÛ>+ÅÄ\u0018®ýñ\u0083ñ\u0010~»o\u0018T\u001c¾'¿ÅÿFÕ÷ëÑ0\u009a#D(ã¡,\u0094+\t%{\u0013gZÊÞp¦\f\u0003þ%\u001bû\u0098U\u00adQ(]ù¾\u009fCíÛr\u008c?¨Y\u009cQÂ³\u0083È\u0018ÝmV#g\u0080¤æI]X\u0004û9\u0091ã-Ê\u0018¦\u0004YmÚ"
         .length();
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
                     c = var9;
                     g = new String[13];
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

                  var6 = "\u0015êkC3À\u0098:\u009a{\u0017áÔ2:\nÖ¬iï\u001cý¯Òó~\u008d#HQÏ¤D\u0003ÿå<\u009a)8KA0P\u0001kñ\u008b\u0010,~TÓª<\u0082\u000f&{uQê¹fë";
                  var8 = "\u0015êkC3À\u0098:\u009a{\u0017áÔ2:\nÖ¬iï\u001cý¯Òó~\u008d#HQÏ¤D\u0003ÿå<\u009a)8KA0P\u0001kñ\u008b\u0010,~TÓª<\u0082\u000f&{uQê¹fë"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4739;
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
            throw new RuntimeException("o2n", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("o2n" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
