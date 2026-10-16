import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class npf extends ShaderHelper implements ha_ {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic npf.a J
      // 003: ldc2_w 22137400999281
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield npf.khf Ljava/util/List;
      // 010: invokeinterface java/util/List.clear ()V 1
      // 015: aload 0
      // 016: getfield npf.f41 Lc05;
      // 019: getfield Minecraft.tij Lkh3;
      // 01c: invokevirtual WorldClient.r7d ()Lcog;
      // 01f: invokevirtual cog.lce ()Z
      // 022: iload 3
      // 023: ifeq 14c
      // 026: ifeq 0d4
      // 029: goto 030
      // 02c: invokestatic npf.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield npf.f41 Lc05;
      // 034: invokevirtual Minecraft.y8_ ()Z
      // 037: iload 3
      // 038: ifeq 0cf
      // 03b: goto 042
      // 03e: invokestatic npf.a (Loov;)Loov;
      // 041: athrow
      // 042: ifeq 090
      // 045: goto 04c
      // 048: invokestatic npf.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield npf.khf Ljava/util/List;
      // 050: new gt4
      // 053: dup
      // 054: bipush 1
      // 055: aload 0
      // 056: getfield npf.dt7 I
      // 059: bipush 2
      // 05a: idiv
      // 05b: bipush 100
      // 05d: isub
      // 05e: aload 0
      // 05f: getfield npf.o1e I
      // 062: bipush 4
      // 063: idiv
      // 064: bipush 96
      // 066: iadd
      // 067: sipush 2785
      // 06a: ldc2_w 1726318113907020877
      // 06d: lload 1
      // 06e: lxor
      // 06f: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: nop
      // 075: bipush 0
      // 076: anewarray 75
      // 079: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 07c: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 07f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 084: pop
      // 085: iload 3
      // 086: ifne 17a
      // 089: goto 090
      // 08c: invokestatic npf.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield npf.khf Ljava/util/List;
      // 094: new gt4
      // 097: dup
      // 098: bipush 1
      // 099: aload 0
      // 09a: getfield npf.dt7 I
      // 09d: bipush 2
      // 09e: idiv
      // 09f: bipush 100
      // 0a1: isub
      // 0a2: aload 0
      // 0a3: getfield npf.o1e I
      // 0a6: bipush 4
      // 0a7: idiv
      // 0a8: bipush 96
      // 0aa: iadd
      // 0ab: sipush 16762
      // 0ae: ldc2_w 2545614159647072217
      // 0b1: lload 1
      // 0b2: lxor
      // 0b3: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: bipush 0
      // 0ba: anewarray 75
      // 0bd: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0c0: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 0c3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c8: goto 0cf
      // 0cb: invokestatic npf.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: pop
      // 0d0: iload 3
      // 0d1: ifne 17a
      // 0d4: aload 0
      // 0d5: getfield npf.khf Ljava/util/List;
      // 0d8: new gt4
      // 0db: dup
      // 0dc: bipush 0
      // 0dd: aload 0
      // 0de: getfield npf.dt7 I
      // 0e1: bipush 2
      // 0e2: idiv
      // 0e3: bipush 100
      // 0e5: isub
      // 0e6: aload 0
      // 0e7: getfield npf.o1e I
      // 0ea: bipush 4
      // 0eb: idiv
      // 0ec: bipush 72
      // 0ee: iadd
      // 0ef: sipush 17410
      // 0f2: ldc2_w 6582267613595196067
      // 0f5: lload 1
      // 0f6: lxor
      // 0f7: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: nop
      // 0fd: bipush 0
      // 0fe: anewarray 75
      // 101: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 104: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 107: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 10c: pop
      // 10d: aload 0
      // 10e: getfield npf.khf Ljava/util/List;
      // 111: new gt4
      // 114: dup
      // 115: bipush 1
      // 116: aload 0
      // 117: getfield npf.dt7 I
      // 11a: bipush 2
      // 11b: idiv
      // 11c: bipush 100
      // 11e: isub
      // 11f: aload 0
      // 120: getfield npf.o1e I
      // 123: bipush 4
      // 124: idiv
      // 125: bipush 96
      // 127: iadd
      // 128: sipush 31021
      // 12b: ldc2_w 2075188503602325391
      // 12e: lload 1
      // 12f: lxor
      // 130: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: nop
      // 136: bipush 0
      // 137: anewarray 75
      // 13a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 13d: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 140: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 145: goto 14c
      // 148: invokestatic npf.a (Loov;)Loov;
      // 14b: athrow
      // 14c: pop
      // 14d: aload 0
      // 14e: iload 3
      // 14f: ifeq 17b
      // 152: getfield npf.f41 Lc05;
      // 155: invokevirtual Minecraft.ee0 ()Lrh0;
      // 158: ifnonnull 17a
      // 15b: goto 162
      // 15e: invokestatic npf.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 0
      // 163: getfield npf.khf Ljava/util/List;
      // 166: bipush 1
      // 167: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 16c: checkcast gt4
      // 16f: bipush 0
      // 170: putfield gt4.c9a Z
      // 173: goto 17a
      // 176: invokestatic npf.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield npf.khf Ljava/util/List;
      // 17e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 183: astore 4
      // 185: aload 4
      // 187: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18c: ifeq 1a5
      // 18f: aload 4
      // 191: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 196: checkcast gt4
      // 199: astore 5
      // 19b: aload 5
      // 19d: bipush 0
      // 19e: putfield gt4.c9a Z
      // 1a1: iload 3
      // 1a2: ifne 185
      // 1a5: return
   }

   @Override
   public void dig(char var1, int var2) {
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic npf.a J
      // 03: ldc2_w 130331779015914
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getfield gt4._me I
      // 11: lookupswitch 214 2 0 27 1 60
      // 2c: aload 0
      // 2d: getfield npf.f41 Lc05;
      // 30: getfield Minecraft.vg8 Ll86;
      // 33: invokevirtual EntityPlayerSP.iau ()V
      // 36: aload 0
      // 37: getfield npf.f41 Lc05;
      // 3a: aconst_null
      // 3b: checkcast ShaderHelper
      // 3e: invokevirtual Minecraft.z2i (Lgbe;)V
      // 41: iload 4
      // 43: ifne e7
      // 46: goto 4d
      // 49: invokestatic npf.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield npf.f41 Lc05;
      // 51: iload 4
      // 53: ifeq 7b
      // 56: goto 5d
      // 59: invokestatic npf.a (Loov;)Loov;
      // 5c: athrow
      // 5d: getfield Minecraft.tij Lkh3;
      // 60: invokevirtual WorldClient.r7d ()Lcog;
      // 63: invokevirtual cog.lce ()Z
      // 66: ifeq 8a
      // 69: goto 70
      // 6c: invokestatic npf.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield npf.f41 Lc05;
      // 74: goto 7b
      // 77: invokestatic npf.a (Loov;)Loov;
      // 7a: athrow
      // 7b: new MainMenuScreen
      // 7e: dup
      // 7f: invokespecial MainMenuScreen.<init> ()V
      // 82: invokevirtual Minecraft.z2i (Lgbe;)V
      // 85: iload 4
      // 87: ifne e7
      // 8a: new kf9
      // 8d: dup
      // 8e: aload 0
      // 8f: sipush 28420
      // 92: ldc2_w 533739398124955706
      // 95: lload 2
      // 96: lxor
      // 97: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: bipush 0
      // 9e: anewarray 75
      // a1: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // a4: ldc ""
      // a6: nop
      // a7: sipush 233
      // aa: ldc2_w 779747421079472084
      // ad: lload 2
      // ae: lxor
      // af: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: nop
      // b5: bipush 0
      // b6: anewarray 75
      // b9: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // bc: sipush 10241
      // bf: ldc2_w 1239982464639971130
      // c2: lload 2
      // c3: lxor
      // c4: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: nop
      // ca: bipush 0
      // cb: anewarray 75
      // ce: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // d1: bipush 0
      // d2: invokespecial kf9.<init> (Lha_;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
      // d5: astore 5
      // d7: aload 0
      // d8: getfield npf.f41 Lc05;
      // db: aload 5
      // dd: invokevirtual Minecraft.z2i (Lgbe;)V
      // e0: aload 5
      // e2: bipush 20
      // e4: invokevirtual kf9.g_0 (I)V
      // e7: return
   }

   @Override
   public void confirmClicked(boolean param1, int param2) {
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
      // 05: ifeq 36
      // 08: aload 0
      // 09: getfield npf.f41 Lc05;
      // 0c: getfield Minecraft.tij Lkh3;
      // 0f: invokevirtual WorldClient.ci8 ()V
      // 12: aload 0
      // 13: getfield npf.f41 Lc05;
      // 16: aconst_null
      // 17: checkcast WorldClient
      // 1a: invokevirtual Minecraft.jk1 (Lkh3;)V
      // 1d: aload 0
      // 1e: getfield npf.f41 Lc05;
      // 21: new MainMenuScreen
      // 24: dup
      // 25: invokespecial MainMenuScreen.<init> ()V
      // 28: invokevirtual Minecraft.z2i (Lgbe;)V
      // 2b: iload 3
      // 2c: ifne 52
      // 2f: goto 36
      // 32: invokestatic npf.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: getfield npf.f41 Lc05;
      // 3a: getfield Minecraft.vg8 Ll86;
      // 3d: invokevirtual EntityPlayerSP.iau ()V
      // 40: aload 0
      // 41: getfield npf.f41 Lc05;
      // 44: aconst_null
      // 45: checkcast ShaderHelper
      // 48: invokevirtual Minecraft.z2i (Lgbe;)V
      // 4b: goto 52
      // 4e: invokestatic npf.a (Loov;)Loov;
      // 51: athrow
      // 52: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic npf.a J
      // 003: ldc2_w 13710033741390
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: bipush 0
      // 00b: bipush 0
      // 00c: aload 0
      // 00d: getfield npf.dt7 I
      // 010: aload 0
      // 011: getfield npf.o1e I
      // 014: ldc 1615855616
      // 016: nop
      // 017: ldc -1602211792
      // 019: nop
      // 01a: invokevirtual npf.flp (IIIIII)V
      // 01d: invokestatic OpaquePredicate.b ()I
      // 020: invokestatic hzu.dp2 ()V
      // 023: fconst_2
      // 024: fconst_2
      // 025: fconst_2
      // 026: invokestatic hzu.syc (FFF)V
      // 029: aload 0
      // 02a: getfield npf.f41 Lc05;
      // 02d: getfield Minecraft.tij Lkh3;
      // 030: invokevirtual WorldClient.r7d ()Lcog;
      // 033: invokevirtual cog.lce ()Z
      // 036: istore 7
      // 038: istore 6
      // 03a: iload 7
      // 03c: ifeq 05c
      // 03f: sipush 18014
      // 042: ldc2_w 1917808829317874638
      // 045: lload 4
      // 047: lxor
      // 048: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: nop
      // 04e: bipush 0
      // 04f: anewarray 75
      // 052: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 055: goto 072
      // 058: invokestatic npf.a (Loov;)Loov;
      // 05b: athrow
      // 05c: sipush 22509
      // 05f: ldc2_w 7525918732685349503
      // 062: lload 4
      // 064: lxor
      // 065: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: nop
      // 06b: bipush 0
      // 06c: anewarray 75
      // 06f: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 072: astore 8
      // 074: aload 0
      // 075: aload 0
      // 076: getfield npf.fex Lowt;
      // 079: aload 8
      // 07b: aload 0
      // 07c: getfield npf.dt7 I
      // 07f: bipush 2
      // 080: idiv
      // 081: bipush 2
      // 082: idiv
      // 083: bipush 30
      // 085: ldc 16777215
      // 087: nop
      // 088: invokevirtual npf.poi (Lowt;Ljava/lang/String;III)V
      // 08b: invokestatic hzu.x3w ()V
      // 08e: iload 6
      // 090: ifeq 132
      // 093: iload 7
      // 095: ifeq 0d0
      // 098: goto 09f
      // 09b: invokestatic npf.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: aload 0
      // 0a1: getfield npf.fex Lowt;
      // 0a4: sipush 15912
      // 0a7: ldc2_w 83501468649323440
      // 0aa: lload 4
      // 0ac: lxor
      // 0ad: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: bipush 0
      // 0b4: anewarray 75
      // 0b7: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0ba: aload 0
      // 0bb: getfield npf.dt7 I
      // 0be: bipush 2
      // 0bf: idiv
      // 0c0: sipush 144
      // 0c3: ldc 16777215
      // 0c5: nop
      // 0c6: invokevirtual npf.poi (Lowt;Ljava/lang/String;III)V
      // 0c9: goto 0d0
      // 0cc: invokestatic npf.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: aload 0
      // 0d2: getfield npf.fex Lowt;
      // 0d5: new java/lang/StringBuilder
      // 0d8: dup
      // 0d9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0dc: sipush 15178
      // 0df: ldc2_w 4874200739696869073
      // 0e2: lload 4
      // 0e4: lxor
      // 0e5: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: nop
      // 0eb: bipush 0
      // 0ec: anewarray 75
      // 0ef: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: sipush 30032
      // 0f8: ldc2_w 673920554406129857
      // 0fb: lload 4
      // 0fd: lxor
      // 0fe: invokedynamic o (IJ)Ljava/lang/String; bsm=npf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: getstatic syo.iyk Lsyo;
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10d: aload 0
      // 10e: getfield npf.f41 Lc05;
      // 111: getfield Minecraft.vg8 Ll86;
      // 114: invokevirtual EntityPlayerSP.zy2 ()I
      // 117: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11d: aload 0
      // 11e: getfield npf.dt7 I
      // 121: bipush 2
      // 122: idiv
      // 123: bipush 100
      // 125: ldc 16777215
      // 127: nop
      // 128: invokevirtual npf.poi (Lowt;Ljava/lang/String;III)V
      // 12b: aload 0
      // 12c: iload 1
      // 12d: iload 2
      // 12e: fload 3
      // 12f: invokespecial ShaderHelper.drawScreen (IIF)V
      // 132: return
   }

   @Override
   public boolean a99() {
      return false;
   }

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial ShaderHelper.updateScreen ()V
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 0
      // 08: dup
      // 09: getfield npf.d42 I
      // 0c: bipush 1
      // 0d: iadd
      // 0e: putfield npf.d42 I
      // 11: istore 1
      // 12: aload 0
      // 13: iload 1
      // 14: ifeq 2e
      // 17: getfield npf.d42 I
      // 1a: bipush 20
      // 1c: if_icmpne 53
      // 1f: goto 26
      // 22: invokestatic npf.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic npf.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getfield npf.khf Ljava/util/List;
      // 31: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 36: astore 2
      // 37: aload 2
      // 38: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3d: ifeq 53
      // 40: aload 2
      // 41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 46: checkcast gt4
      // 49: astore 3
      // 4a: aload 3
      // 4b: bipush 1
      // 4c: putfield gt4.c9a Z
      // 4f: iload 1
      // 50: ifne 37
      // 53: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(650736369683569809L, -5658720872005568812L, MethodHandles.lookup().lookupClass()).a(236723496998664L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 18723040815602L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "!\u0095\u009cPVªÀ\u001dÀ¥\u0016m:\u001f\"êd(ò({Ä^×\u0015S×«c5ïÔÔÎF\u00838¨W88µ^â\\\u0014Ä©Åwã\u0012#¶\u008aNÿ[0Ã©\rp\u0083b³Æº5\u009bZ\u0005-Æ\"*\t×Y¸\u0013e·TÇ_Ûm¤\u0005\u001fÇ\u0006r\u008b\u009cM(ªðú8ñÊ#\u0082¡¤|>\u00147\u001dÏ\u008dKV-á4øí×S\u0081ÈUMò«\u0087Ï\u008dê\u008d?R\u008c8\u0087\fDª,Ð\u007fUº\u0082f\u001fw\u008f©ÔC\u0015*¶\u008dt\u0016.hÔ\u009b|£E\u000fPHÚRrf6ÏFÓg^I\u0011M2É§1¦I'T«\u007f(ß;0'X\u0011k\u0098TÓ\u0000ÏàfpÈ\u0019¿t>\u001a\u0098<®\u000e\u008cð]5eBéc\u0080½\u0011a¶'\u001801/:\u001c;¡¨A\u0090E/\u008e\u000bH±BÇ\u000bÚD6bb6éÉ\u0093\u001bã\u001f)\u0099'~¬\u0082\u0097\u0093÷ß<\u0090`Ý\u0090ß¹k(?\u0012\u00ad£pÖ\u0010Á\u008eD\u001cÄØj6Ú\u000bË\u008dI\u000e¹yÿ\u001d\u0087\u000fr&B<0¹¢;BeFb\u0002(\u0007\u0011\u001eýU\u00ad}üu\u000f·\u0095w¿ë\u0089º\u009e©G\u0007W¤~¾§AÕ%\u0001xfk\u007f%W¼ù(Å0\u001b\u0001¦í3ª.Á-\u001cSáÇ^¨¶ÎFðJ\rrz&Üz\u000bÔ\u001a{ÖË(\u0082TÓMß\u0004ß)\u0082Þ\u0097M®\u0085V0Ë0\u0016ÖÉ¨\u009e\u000fOe¨\r\u0014e\u0080¶\u00959g\u0095\u0013^4\u008e\u001e\u0015³h\u0012¦h\u009fÐXÌ\u0093\u00066f{\u001eÏ\u0003?A\u0092KÁ";
      int var8 = "!\u0095\u009cPVªÀ\u001dÀ¥\u0016m:\u001f\"êd(ò({Ä^×\u0015S×«c5ïÔÔÎF\u00838¨W88µ^â\\\u0014Ä©Åwã\u0012#¶\u008aNÿ[0Ã©\rp\u0083b³Æº5\u009bZ\u0005-Æ\"*\t×Y¸\u0013e·TÇ_Ûm¤\u0005\u001fÇ\u0006r\u008b\u009cM(ªðú8ñÊ#\u0082¡¤|>\u00147\u001dÏ\u008dKV-á4øí×S\u0081ÈUMò«\u0087Ï\u008dê\u008d?R\u008c8\u0087\fDª,Ð\u007fUº\u0082f\u001fw\u008f©ÔC\u0015*¶\u008dt\u0016.hÔ\u009b|£E\u000fPHÚRrf6ÏFÓg^I\u0011M2É§1¦I'T«\u007f(ß;0'X\u0011k\u0098TÓ\u0000ÏàfpÈ\u0019¿t>\u001a\u0098<®\u000e\u008cð]5eBéc\u0080½\u0011a¶'\u001801/:\u001c;¡¨A\u0090E/\u008e\u000bH±BÇ\u000bÚD6bb6éÉ\u0093\u001bã\u001f)\u0099'~¬\u0082\u0097\u0093÷ß<\u0090`Ý\u0090ß¹k(?\u0012\u00ad£pÖ\u0010Á\u008eD\u001cÄØj6Ú\u000bË\u008dI\u000e¹yÿ\u001d\u0087\u000fr&B<0¹¢;BeFb\u0002(\u0007\u0011\u001eýU\u00ad}üu\u000f·\u0095w¿ë\u0089º\u009e©G\u0007W¤~¾§AÕ%\u0001xfk\u007f%W¼ù(Å0\u001b\u0001¦í3ª.Á-\u001cSáÇ^¨¶ÎFðJ\rrz&Üz\u000bÔ\u001a{ÖË(\u0082TÓMß\u0004ß)\u0082Þ\u0097M®\u0085V0Ë0\u0016ÖÉ¨\u009e\u000fOe¨\r\u0014e\u0080¶\u00959g\u0095\u0013^4\u008e\u001e\u0015³h\u0012¦h\u009fÐXÌ\u0093\u00066f{\u001eÏ\u0003?A\u0092KÁ"
         .length();
      char var5 = '(';
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
                     b = var9;
                     g = new String[12];
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

                  var6 = "\bÏ?³\u0019ñÄç\u0012û\u0081\u0001Gv\u0086®8g%XPxiýPÁ§\u0085\u00037bÀ\u0096ÂÐ<ëúãl¦URNÝÏ|\u0006vsaxl\u009fD\t\u00admÏ\u0085DÐxðVK¼\u0001½\u0006àÄÙ";
                  var8 = "\bÏ?³\u0019ñÄç\u0012û\u0081\u0001Gv\u0086®8g%XPxiýPÁ§\u0085\u00037bÀ\u0096ÂÐ<ëúãl¦URNÝÏ|\u0006vsaxl\u009fD\t\u00admÏ\u0085DÐxðVK¼\u0001½\u0006àÄÙ"
                     .length();
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26025;
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
            throw new RuntimeException("npf", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("npf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
