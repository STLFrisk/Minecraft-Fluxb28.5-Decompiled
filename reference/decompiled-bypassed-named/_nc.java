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

public class _nc extends sdu {
   public Module lu7;
   private static final long a;
   private static final String[] h;
   private static final String[] i;
   private static final Map j = new HashMap(13);

   public _nc(nm6 param1, int param2, int param3, String param4, String param5, Module param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _nc.a J
      // 03: ldc2_w 42529298341042
      // 06: lxor
      // 07: lstore 7
      // 09: aload 0
      // 0a: aload 1
      // 0b: iload 2
      // 0c: iload 3
      // 0d: aload 4
      // 0f: invokespecial sdu.<init> (Lnm6;IILjava/lang/String;)V
      // 12: invokestatic OpaquePredicate.c ()I
      // 15: aload 0
      // 16: new sbi
      // 19: dup
      // 1a: bipush 15
      // 1c: invokespecial sbi.<init> (I)V
      // 1f: putfield _nc.lv3 Lsbi;
      // 22: istore 9
      // 24: aload 0
      // 25: aload 6
      // 27: invokevirtual Module.gbf ()Z
      // 2a: iload 9
      // 2c: ifne 5d
      // 2f: ifne 5c
      // 32: goto 39
      // 35: invokestatic _nc.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 6
      // 3b: invokevirtual Module.m2d ()Ljava/lang/String;
      // 3e: invokestatic SettingRegistry.hgl (Ljava/lang/String;)Ljava/util/List;
      // 41: invokeinterface java/util/List.isEmpty ()Z 1
      // 46: iload 9
      // 48: ifne 5d
      // 4b: goto 52
      // 4e: invokestatic _nc.a (Loov;)Loov;
      // 51: athrow
      // 52: ifne 60
      // 55: goto 5c
      // 58: invokestatic _nc.a (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 61
      // 60: bipush 0
      // 61: putfield _nc.qwd Z
      // 64: aload 0
      // 65: getstatic jvy.s15 I
      // 68: aload 1
      // 69: getfield nm6.oe7 I
      // 6c: invokestatic java/lang/Math.max (II)I
      // 6f: putfield _nc.vms I
      // 72: aload 0
      // 73: getstatic jvy.cec I
      // 76: putfield _nc.c1c I
      // 79: aload 0
      // 7a: aload 6
      // 7c: putfield _nc.lu7 Lar7;
      // 7f: aload 0
      // 80: sipush 26490
      // 83: ldc2_w 7989610443271327078
      // 86: lload 7
      // 88: lxor
      // 89: invokedynamic m (IJ)Ljava/lang/String; bsm=_nc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: putfield _nc.bqh Ljava/lang/String;
      // 92: return
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _nc.a J
      // 003: ldc2_w 109610681534824
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: getstatic jvy.ck5 Z
      // 010: iload 5
      // 012: ifne 039
      // 015: ifeq 03c
      // 018: goto 01f
      // 01b: invokestatic _nc.a (Loov;)Loov;
      // 01e: athrow
      // 01f: new java/awt/Color
      // 022: dup
      // 023: getstatic z7e.kks Lz7e;
      // 026: getfield z7e.k0y I
      // 029: invokespecial java/awt/Color.<init> (I)V
      // 02c: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
      // 02f: invokevirtual java/awt/Color.getRGB ()I
      // 032: goto 039
      // 035: invokestatic _nc.a (Loov;)Loov;
      // 038: athrow
      // 039: goto 049
      // 03c: new java/awt/Color
      // 03f: dup
      // 040: ldc 14013909
      // 042: nop
      // 043: invokespecial java/awt/Color.<init> (I)V
      // 046: invokevirtual java/awt/Color.getRGB ()I
      // 049: istore 6
      // 04b: aload 0
      // 04c: getfield _nc.lv3 Lsbi;
      // 04f: getstatic ClientState.qkk Lzwr;
      // 052: invokevirtual ClientState.e6d ()Ljvy;
      // 055: new java/lang/StringBuilder
      // 058: dup
      // 059: invokespecial java/lang/StringBuilder.<init> ()V
      // 05c: aload 0
      // 05d: getfield _nc.lu7 Lar7;
      // 060: invokevirtual Module.m2d ()Ljava/lang/String;
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: sipush 15169
      // 069: ldc2_w 3226015015513703558
      // 06c: lload 3
      // 06d: lxor
      // 06e: invokedynamic m (IJ)Ljava/lang/String; bsm=_nc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 077: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07a: invokevirtual jvy.k7u (Ljava/lang/String;)Z
      // 07d: invokevirtual sbi.qtk (Z)V
      // 080: aload 0
      // 081: getfield _nc.qwd Z
      // 084: iload 5
      // 086: ifne 129
      // 089: ifeq 122
      // 08c: goto 093
      // 08f: invokestatic _nc.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: getfield _nc.slj Z
      // 097: iload 5
      // 099: ifne 0bb
      // 09c: goto 0a3
      // 09f: invokestatic _nc.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ifeq 0be
      // 0a6: goto 0ad
      // 0a9: invokestatic _nc.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: iload 6
      // 0af: bipush 30
      // 0b1: invokestatic mkt.kgs (II)I
      // 0b4: goto 0bb
      // 0b7: invokestatic _nc.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: goto 0c0
      // 0be: iload 6
      // 0c0: istore 6
      // 0c2: aload 0
      // 0c3: getfield _nc.koa I
      // 0c6: i2f
      // 0c7: ldc 6.5
      // 0c9: nop
      // 0ca: fadd
      // 0cb: fstore 7
      // 0cd: aload 0
      // 0ce: getfield _nc.mff I
      // 0d1: i2f
      // 0d2: aload 0
      // 0d3: getfield _nc.c1c I
      // 0d6: i2f
      // 0d7: fconst_2
      // 0d8: fdiv
      // 0d9: fadd
      // 0da: fstore 8
      // 0dc: invokestatic hzu.dp2 ()V
      // 0df: fload 7
      // 0e1: fload 8
      // 0e3: fconst_0
      // 0e4: invokestatic hzu.a4k (FFF)V
      // 0e7: aload 0
      // 0e8: getfield _nc.lv3 Lsbi;
      // 0eb: invokevirtual sbi.ds7 ()D
      // 0ee: d2f
      // 0ef: ldc 90.0
      // 0f1: nop
      // 0f2: fmul
      // 0f3: fconst_0
      // 0f4: fconst_0
      // 0f5: fconst_1
      // 0f6: invokestatic hzu.a2h (FFFF)V
      // 0f9: ldc2_w -1.0
      // 0fc: ldc2_w -2.0
      // 0ff: dconst_1
      // 100: dconst_0
      // 101: fconst_1
      // 102: iload 6
      // 104: invokestatic mkt.dit (DDDDFI)V
      // 107: ldc2_w -1.0
      // 10a: ldc2_w 2.0
      // 10d: dconst_1
      // 10e: dconst_0
      // 10f: fconst_1
      // 110: iload 6
      // 112: invokestatic mkt.dit (DDDDFI)V
      // 115: fload 7
      // 117: fneg
      // 118: fload 8
      // 11a: fneg
      // 11b: fconst_0
      // 11c: invokestatic hzu.a4k (FFF)V
      // 11f: invokestatic hzu.x3w ()V
      // 122: aload 0
      // 123: getfield _nc.lu7 Lar7;
      // 126: invokevirtual Module.klu ()Z
      // 129: iload 5
      // 12b: ifne 173
      // 12e: ifeq 170
      // 131: goto 138
      // 134: invokestatic _nc.a (Loov;)Loov;
      // 137: athrow
      // 138: getstatic jvy.ck5 Z
      // 13b: iload 5
      // 13d: ifne 16d
      // 140: goto 147
      // 143: invokestatic _nc.a (Loov;)Loov;
      // 146: athrow
      // 147: ifeq 15b
      // 14a: goto 151
      // 14d: invokestatic _nc.a (Loov;)Loov;
      // 150: athrow
      // 151: getstatic jvy.ts6 I
      // 154: goto 192
      // 157: invokestatic _nc.a (Loov;)Loov;
      // 15a: athrow
      // 15b: new java/awt/Color
      // 15e: dup
      // 15f: sipush 206
      // 162: bipush 89
      // 164: sipush 255
      // 167: invokespecial java/awt/Color.<init> (III)V
      // 16a: invokevirtual java/awt/Color.getRGB ()I
      // 16d: goto 192
      // 170: getstatic jvy.ck5 Z
      // 173: iload 5
      // 175: ifne 191
      // 178: ifeq 18f
      // 17b: goto 182
      // 17e: invokestatic _nc.a (Loov;)Loov;
      // 181: athrow
      // 182: getstatic z7e.kks Lz7e;
      // 185: getfield z7e.k0y I
      // 188: goto 192
      // 18b: invokestatic _nc.a (Loov;)Loov;
      // 18e: athrow
      // 18f: ldc 16777215
      // 191: nop
      // 192: istore 7
      // 194: iload 7
      // 196: invokestatic mkt.v_1 (I)V
      // 199: getstatic jsr.eum Lcyb;
      // 19c: aload 0
      // 19d: getfield _nc.vy4 Ljava/lang/String;
      // 1a0: aload 0
      // 1a1: getfield _nc.koa I
      // 1a4: bipush 12
      // 1a6: iadd
      // 1a7: i2f
      // 1a8: aload 0
      // 1a9: getfield _nc.mff I
      // 1ac: aload 0
      // 1ad: getfield _nc.c1c I
      // 1b0: bipush 2
      // 1b1: idiv
      // 1b2: iadd
      // 1b3: i2f
      // 1b4: getstatic jsr.eum Lcyb;
      // 1b7: aload 0
      // 1b8: getfield _nc.vy4 Ljava/lang/String;
      // 1bb: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 1be: fconst_2
      // 1bf: fdiv
      // 1c0: fsub
      // 1c1: fconst_1
      // 1c2: fadd
      // 1c3: iload 7
      // 1c5: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1c8: pop
      // 1c9: return
   }

   @Override
   public void c2n(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial sdu.c2n (II)V
      // 0a: aload 0
      // 0b: iload 3
      // 0c: ifeq 3a
      // 0f: getfield _nc.lu7 Lar7;
      // 12: ifnull 32
      // 15: goto 1c
      // 18: invokestatic _nc.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 0
      // 1e: getfield _nc.lu7 Lar7;
      // 21: invokevirtual Module.klu ()Z
      // 24: putfield _nc.umr Z
      // 27: iload 3
      // 28: ifne 3e
      // 2b: goto 32
      // 2e: invokestatic _nc.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: goto 3a
      // 36: invokestatic _nc.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 0
      // 3b: putfield _nc.umr Z
      // 3e: return
   }

   @Override
   public void p4o() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _nc.a J
      // 003: ldc2_w 9603309131826
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield _nc.sq7 Z
      // 010: iload 3
      // 011: ifne 079
      // 014: ifeq 075
      // 017: goto 01e
      // 01a: invokestatic _nc.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 3
      // 020: ifne 076
      // 023: goto 02a
      // 026: invokestatic _nc.a (Loov;)Loov;
      // 029: athrow
      // 02a: getfield _nc.lu7 Lar7;
      // 02d: ifnull 075
      // 030: goto 037
      // 033: invokestatic _nc.a (Loov;)Loov;
      // 036: athrow
      // 037: bipush 1
      // 038: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 03b: ifeq 067
      // 03e: goto 045
      // 041: invokestatic _nc.a (Loov;)Loov;
      // 044: athrow
      // 045: invokestatic Minecraft.vz1 ()Lc05;
      // 048: new cdv
      // 04b: dup
      // 04c: aload 0
      // 04d: getfield _nc.lu7 Lar7;
      // 050: getstatic ClientState.qkk Lzwr;
      // 053: invokevirtual ClientState.e6d ()Ljvy;
      // 056: invokespecial cdv.<init> (Lar7;Lgbe;)V
      // 059: invokevirtual Minecraft.z2i (Lgbe;)V
      // 05c: iload 3
      // 05d: ifeq 075
      // 060: goto 067
      // 063: invokestatic _nc.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: getfield _nc.lu7 Lar7;
      // 06b: invokevirtual Module.toggle ()V
      // 06e: goto 075
      // 071: invokestatic _nc.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: getfield _nc.slj Z
      // 079: iload 3
      // 07a: ifne 092
      // 07d: ifeq 15a
      // 080: goto 087
      // 083: invokestatic _nc.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: getfield _nc.qwd Z
      // 08b: goto 092
      // 08e: invokestatic _nc.a (Loov;)Loov;
      // 091: athrow
      // 092: iload 3
      // 093: ifne 0e0
      // 096: ifeq 15a
      // 099: goto 0a0
      // 09c: invokestatic _nc.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: getstatic ClientState.qkk Lzwr;
      // 0a3: invokevirtual ClientState.e6d ()Ljvy;
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: aload 0
      // 0ae: getfield _nc.lu7 Lar7;
      // 0b1: invokevirtual Module.m2d ()Ljava/lang/String;
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: sipush 13249
      // 0ba: ldc2_w 4507829772050668894
      // 0bd: lload 1
      // 0be: lxor
      // 0bf: invokedynamic m (IJ)Ljava/lang/String; bsm=_nc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: nop
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: iload 3
      // 0cc: ifne 14f
      // 0cf: goto 0d6
      // 0d2: invokestatic _nc.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: invokevirtual jvy.k7u (Ljava/lang/String;)Z
      // 0d9: goto 0e0
      // 0dc: invokestatic _nc.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: ifne 11d
      // 0e3: getstatic ClientState.qkk Lzwr;
      // 0e6: invokevirtual ClientState.e6d ()Ljvy;
      // 0e9: new java/lang/StringBuilder
      // 0ec: dup
      // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f0: aload 0
      // 0f1: getfield _nc.lu7 Lar7;
      // 0f4: invokevirtual Module.m2d ()Ljava/lang/String;
      // 0f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fa: sipush 15169
      // 0fd: ldc2_w 3226108520037193180
      // 100: lload 1
      // 101: lxor
      // 102: invokedynamic m (IJ)Ljava/lang/String; bsm=_nc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: nop
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10e: bipush 1
      // 10f: invokevirtual jvy.ia8 (Ljava/lang/String;Z)V
      // 112: iload 3
      // 113: ifeq 153
      // 116: goto 11d
      // 119: invokestatic _nc.a (Loov;)Loov;
      // 11c: athrow
      // 11d: getstatic ClientState.qkk Lzwr;
      // 120: invokevirtual ClientState.e6d ()Ljvy;
      // 123: new java/lang/StringBuilder
      // 126: dup
      // 127: invokespecial java/lang/StringBuilder.<init> ()V
      // 12a: aload 0
      // 12b: getfield _nc.lu7 Lar7;
      // 12e: invokevirtual Module.m2d ()Ljava/lang/String;
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: sipush 15169
      // 137: ldc2_w 3226108520037193180
      // 13a: lload 1
      // 13b: lxor
      // 13c: invokedynamic m (IJ)Ljava/lang/String; bsm=_nc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: nop
      // 142: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 145: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 148: goto 14f
      // 14b: invokestatic _nc.a (Loov;)Loov;
      // 14e: athrow
      // 14f: bipush 0
      // 150: invokevirtual jvy.ia8 (Ljava/lang/String;Z)V
      // 153: aload 0
      // 154: getfield _nc.loa Lnm6;
      // 157: invokevirtual nm6.met ()V
      // 15a: return
   }

   @Override
   public void x6o(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 0
      // 07: iload 1
      // 08: iload 2
      // 09: invokespecial _nc.p4h (II)Z
      // 0c: iload 4
      // 0e: ifeq 2b
      // 11: ifeq 58
      // 14: goto 1b
      // 17: invokestatic _nc.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield _nc.loa Lnm6;
      // 1f: iload 1
      // 20: iload 2
      // 21: invokevirtual nm6.au1 (II)Z
      // 24: goto 2b
      // 27: invokestatic _nc.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: ifeq 45
      // 30: ifeq 58
      // 33: goto 3a
      // 36: invokestatic _nc.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield _nc.yu6 Z
      // 3e: goto 45
      // 41: invokestatic _nc.a (Loov;)Loov;
      // 44: athrow
      // 45: iload 4
      // 47: ifeq 55
      // 4a: ifeq 58
      // 4d: goto 54
      // 50: invokestatic _nc.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: putfield _nc.sq7 Z
      // 5c: aload 0
      // 5d: aload 0
      // 5e: iload 1
      // 5f: iload 2
      // 60: invokespecial _nc.tzd (II)Z
      // 63: iload 4
      // 65: ifeq 82
      // 68: ifeq af
      // 6b: goto 72
      // 6e: invokestatic _nc.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getfield _nc.loa Lnm6;
      // 76: iload 1
      // 77: iload 2
      // 78: invokevirtual nm6.au1 (II)Z
      // 7b: goto 82
      // 7e: invokestatic _nc.a (Loov;)Loov;
      // 81: athrow
      // 82: iload 4
      // 84: ifeq 9c
      // 87: ifeq af
      // 8a: goto 91
      // 8d: invokestatic _nc.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: getfield _nc.yu6 Z
      // 95: goto 9c
      // 98: invokestatic _nc.a (Loov;)Loov;
      // 9b: athrow
      // 9c: iload 4
      // 9e: ifeq ac
      // a1: ifeq af
      // a4: goto ab
      // a7: invokestatic _nc.a (Loov;)Loov;
      // aa: athrow
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: putfield _nc.slj Z
      // b3: aload 0
      // b4: iload 1
      // b5: iload 2
      // b6: iload 3
      // b7: invokespecial sdu.x6o (IIZ)V
      // ba: return
   }

   private boolean p4h(int var1, int var2) {
      return rak.c38((float)var1, (float)var2, (float)(this.koa + 11), (float)this.mff, (float)(this.koa + this.vms), (float)(this.mff + this.c1c));
   }

   private boolean tzd(int var1, int var2) {
      return rak.c38((float)var1, (float)var2, (float)this.koa, (float)this.mff, (float)(this.koa + 10), (float)(this.mff + this.c1c));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1141194151631307593L, -3329862134794245523L, MethodHandles.lookup().lookupClass()).a(58588447940604L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 127869417796143L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "Æ=HÚSkxDZk-}îÜË\u00adUt\u0013Þº4\u0099\f\u0018\u0000-Ý+\u00ad^\tØÉT\u0084+à¡]·\u0099fgß\u001c©\u0019\u001b\u0018\u00adc?a\u0094\u0006H¼â\u0011È\u000b1è\u0097üÞh1O\u0016.\u008f·";
      int var8 = "Æ=HÚSkxDZk-}îÜË\u00adUt\u0013Þº4\u0099\f\u0018\u0000-Ý+\u00ad^\tØÉT\u0084+à¡]·\u0099fgß\u001c©\u0019\u001b\u0018\u00adc?a\u0094\u0006H¼â\u0011È\u000b1è\u0097üÞh1O\u0016.\u008f·"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            h = var9;
            i = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23100;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("_nc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("_nc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
