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

public class rqh extends ShaderHelper {
   private static final moh$_ru[] pik;
   private ShaderHelper mab;
   public String dbe;
   private moh v30;
   public m7l s7s;
   public long j3i;
   private off quy;
   private gt4 bov;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public rqh(ShaderHelper var1, moh var2) {
      long var3 = a ^ 66993909389086L;
      super();
      this.dbe = b<"j">(6355, 2615657885066964939L ^ var3);
      this.s7s = null;
      this.mab = var1;
      this.v30 = var2;
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rqh.a J
      // 003: ldc2_w 136754472360037
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: new off
      // 00c: dup
      // 00d: aload 0
      // 00e: aload 0
      // 00f: getfield rqh.f41 Lc05;
      // 012: invokespecial off.<init> (Lrqh;Lc05;)V
      // 015: putfield rqh.quy Loff;
      // 018: invokestatic OpaquePredicate.b ()I
      // 01b: aload 0
      // 01c: getfield rqh.khf Ljava/util/List;
      // 01f: new gt4
      // 022: dup
      // 023: sipush 200
      // 026: aload 0
      // 027: getfield rqh.dt7 I
      // 02a: bipush 2
      // 02b: idiv
      // 02c: sipush 155
      // 02f: isub
      // 030: aload 0
      // 031: getfield rqh.o1e I
      // 034: bipush 29
      // 036: isub
      // 037: sipush 150
      // 03a: bipush 20
      // 03c: sipush 17821
      // 03f: ldc2_w 2572599768678645247
      // 042: lload 1
      // 043: lxor
      // 044: invokedynamic j (IJ)Ljava/lang/String; bsm=rqh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: nop
      // 04a: bipush 0
      // 04b: anewarray 76
      // 04e: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 051: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 054: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 059: pop
      // 05a: aload 0
      // 05b: getfield rqh.khf Ljava/util/List;
      // 05e: aload 0
      // 05f: new gt4
      // 062: dup
      // 063: sipush 201
      // 066: aload 0
      // 067: getfield rqh.dt7 I
      // 06a: bipush 2
      // 06b: idiv
      // 06c: sipush 155
      // 06f: isub
      // 070: sipush 160
      // 073: iadd
      // 074: aload 0
      // 075: getfield rqh.o1e I
      // 078: bipush 29
      // 07a: isub
      // 07b: sipush 150
      // 07e: bipush 20
      // 080: sipush 13409
      // 083: ldc2_w 3172606283247045632
      // 086: lload 1
      // 087: lxor
      // 088: invokedynamic j (IJ)Ljava/lang/String; bsm=rqh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: nop
      // 08e: bipush 0
      // 08f: anewarray 76
      // 092: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 095: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 098: dup_x1
      // 099: putfield rqh.bov Lgt4;
      // 09c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a1: pop
      // 0a2: aload 0
      // 0a3: sipush 4562
      // 0a6: ldc2_w 8899748878143318450
      // 0a9: lload 1
      // 0aa: lxor
      // 0ab: invokedynamic j (IJ)Ljava/lang/String; bsm=rqh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: nop
      // 0b1: bipush 0
      // 0b2: anewarray 76
      // 0b5: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0b8: putfield rqh.dbe Ljava/lang/String;
      // 0bb: bipush 0
      // 0bc: istore 4
      // 0be: getstatic rqh.pik [Lmoh$_ru;
      // 0c1: astore 5
      // 0c3: aload 5
      // 0c5: arraylength
      // 0c6: istore 6
      // 0c8: istore 3
      // 0c9: bipush 0
      // 0ca: istore 7
      // 0cc: iload 7
      // 0ce: iload 6
      // 0d0: if_icmpge 17c
      // 0d3: aload 5
      // 0d5: iload 7
      // 0d7: aaload
      // 0d8: astore 8
      // 0da: aload 8
      // 0dc: invokevirtual moh$_ru.on0 ()Z
      // 0df: iload 3
      // 0e0: ifeq 171
      // 0e3: ifeq 12d
      // 0e6: goto 0ed
      // 0e9: invokestatic rqh.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield rqh.khf Ljava/util/List;
      // 0f1: new kkh
      // 0f4: dup
      // 0f5: aload 8
      // 0f7: invokevirtual moh$_ru.ehz ()I
      // 0fa: aload 0
      // 0fb: getfield rqh.dt7 I
      // 0fe: bipush 2
      // 0ff: idiv
      // 100: sipush 155
      // 103: isub
      // 104: iload 4
      // 106: bipush 2
      // 107: irem
      // 108: sipush 160
      // 10b: imul
      // 10c: iadd
      // 10d: bipush 18
      // 10f: bipush 24
      // 111: iload 4
      // 113: bipush 1
      // 114: ishr
      // 115: imul
      // 116: iadd
      // 117: aload 8
      // 119: invokespecial kkh.<init> (IIILmoh$_ru;)V
      // 11c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 121: pop
      // 122: iload 3
      // 123: ifne 172
      // 126: goto 12d
      // 129: invokestatic rqh.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield rqh.khf Ljava/util/List;
      // 131: new cm_
      // 134: dup
      // 135: aload 8
      // 137: invokevirtual moh$_ru.ehz ()I
      // 13a: aload 0
      // 13b: getfield rqh.dt7 I
      // 13e: bipush 2
      // 13f: idiv
      // 140: sipush 155
      // 143: isub
      // 144: iload 4
      // 146: bipush 2
      // 147: irem
      // 148: sipush 160
      // 14b: imul
      // 14c: iadd
      // 14d: bipush 18
      // 14f: bipush 24
      // 151: iload 4
      // 153: bipush 1
      // 154: ishr
      // 155: imul
      // 156: iadd
      // 157: aload 8
      // 159: aload 0
      // 15a: getfield rqh.v30 Lmoh;
      // 15d: aload 8
      // 15f: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 162: invokespecial cm_.<init> (IIILmoh$_ru;Ljava/lang/String;)V
      // 165: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16a: goto 171
      // 16d: invokestatic rqh.a (Loov;)Loov;
      // 170: athrow
      // 171: pop
      // 172: iinc 4 1
      // 175: iinc 7 1
      // 178: iload 3
      // 179: ifne 0cc
      // 17c: return
   }

   @Override
   public void handleMouseInput() {
      super.handleMouseInput();
      this.quy.gzb();
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4._me I
      // 08: sipush 200
      // 0b: iload 2
      // 0c: ifeq 3d
      // 0f: if_icmpne 2f
      // 12: goto 19
      // 15: invokestatic rqh.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield rqh.f41 Lc05;
      // 1d: aload 0
      // 1e: getfield rqh.mab Lgbe;
      // 21: invokevirtual Minecraft.z2i (Lgbe;)V
      // 24: iload 2
      // 25: ifne e9
      // 28: goto 2f
      // 2b: invokestatic rqh.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getfield gt4._me I
      // 33: sipush 201
      // 36: goto 3d
      // 39: invokestatic rqh.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 2
      // 3e: ifeq a5
      // 41: if_icmpne 8d
      // 44: goto 4b
      // 47: invokestatic rqh.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield rqh.f41 Lc05;
      // 4f: getfield Minecraft.oxn Lmoh;
      // 52: getfield moh.wf7 [Lm7l;
      // 55: astore 3
      // 56: aload 3
      // 57: arraylength
      // 58: istore 4
      // 5a: bipush 0
      // 5b: istore 5
      // 5d: iload 5
      // 5f: iload 4
      // 61: if_icmpge 86
      // 64: aload 3
      // 65: iload 5
      // 67: aaload
      // 68: astore 6
      // 6a: aload 6
      // 6c: aload 6
      // 6e: invokevirtual m7l.g2s ()I
      // 71: invokevirtual m7l.m15 (I)V
      // 74: iinc 5 1
      // 77: iload 2
      // 78: ifeq 89
      // 7b: iload 2
      // 7c: ifne 5d
      // 7f: goto 86
      // 82: invokestatic rqh.a (Loov;)Loov;
      // 85: athrow
      // 86: invokestatic m7l.r3g ()V
      // 89: iload 2
      // 8a: ifne e9
      // 8d: aload 1
      // 8e: getfield gt4._me I
      // 91: iload 2
      // 92: ifeq be
      // 95: goto 9c
      // 98: invokestatic rqh.a (Loov;)Loov;
      // 9b: athrow
      // 9c: bipush 100
      // 9e: goto a5
      // a1: invokestatic rqh.a (Loov;)Loov;
      // a4: athrow
      // a5: if_icmpge e9
      // a8: aload 1
      // a9: iload 2
      // aa: ifeq d8
      // ad: goto b4
      // b0: invokestatic rqh.a (Loov;)Loov;
      // b3: athrow
      // b4: instanceof cm_
      // b7: goto be
      // ba: invokestatic rqh.a (Loov;)Loov;
      // bd: athrow
      // be: ifeq e9
      // c1: aload 0
      // c2: getfield rqh.v30 Lmoh;
      // c5: aload 1
      // c6: checkcast cm_
      // c9: invokevirtual cm_.t4j ()Lmoh$_ru;
      // cc: bipush 1
      // cd: invokevirtual moh.d13 (Lmoh$_ru;I)V
      // d0: aload 1
      // d1: goto d8
      // d4: invokestatic rqh.a (Loov;)Loov;
      // d7: athrow
      // d8: aload 0
      // d9: getfield rqh.v30 Lmoh;
      // dc: aload 1
      // dd: getfield gt4._me I
      // e0: invokestatic moh$_ru.jit (I)Lmoh$_ru;
      // e3: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // e6: putfield gt4.frg Ljava/lang/String;
      // e9: return
   }

   @Override
   public void mouseClicked(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 2f
      // 0b: getfield rqh.s7s Lm7l;
      // 0e: ifnull 3b
      // 11: goto 18
      // 14: invokestatic rqh.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield rqh.v30 Lmoh;
      // 1c: aload 0
      // 1d: getfield rqh.s7s Lm7l;
      // 20: bipush -100
      // 22: iload 3
      // 23: iadd
      // 24: invokevirtual moh.e4u (Lm7l;I)V
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic rqh.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aconst_null
      // 30: putfield rqh.s7s Lm7l;
      // 33: invokestatic m7l.r3g ()V
      // 36: iload 4
      // 38: ifeq 79
      // 3b: iload 3
      // 3c: iload 4
      // 3e: ifne 6f
      // 41: goto 48
      // 44: invokestatic rqh.a (Loov;)Loov;
      // 47: athrow
      // 48: ifne 72
      // 4b: goto 52
      // 4e: invokestatic rqh.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: iload 4
      // 55: ifne 73
      // 58: goto 5f
      // 5b: invokestatic rqh.a (Loov;)Loov;
      // 5e: athrow
      // 5f: getfield rqh.quy Loff;
      // 62: iload 1
      // 63: iload 2
      // 64: iload 3
      // 65: invokevirtual off.dsd (III)Z
      // 68: goto 6f
      // 6b: invokestatic rqh.a (Loov;)Loov;
      // 6e: athrow
      // 6f: ifne 79
      // 72: aload 0
      // 73: iload 1
      // 74: iload 2
      // 75: iload 3
      // 76: invokespecial ShaderHelper.mouseClicked (III)V
      // 79: return
   }

   @Override
   public void w1m(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: iload 3
      // 06: iload 4
      // 08: ifeq 32
      // 0b: ifne 35
      // 0e: goto 15
      // 11: invokestatic rqh.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: iload 4
      // 18: ifeq 36
      // 1b: goto 22
      // 1e: invokestatic rqh.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield rqh.quy Loff;
      // 25: iload 1
      // 26: iload 2
      // 27: iload 3
      // 28: invokevirtual off.qsz (III)Z
      // 2b: goto 32
      // 2e: invokestatic rqh.a (Loov;)Loov;
      // 31: athrow
      // 32: ifne 3c
      // 35: aload 0
      // 36: iload 1
      // 37: iload 2
      // 38: iload 3
      // 39: invokespecial ShaderHelper.w1m (III)V
      // 3c: return
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne ae
      // 09: getfield rqh.s7s Lm7l;
      // 0c: ifnull a6
      // 0f: goto 16
      // 12: invokestatic rqh.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 2
      // 17: iload 3
      // 18: ifne 4c
      // 1b: goto 22
      // 1e: invokestatic rqh.a (Loov;)Loov;
      // 21: athrow
      // 22: bipush 1
      // 23: if_icmpne 44
      // 26: goto 2d
      // 29: invokestatic rqh.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield rqh.v30 Lmoh;
      // 31: aload 0
      // 32: getfield rqh.s7s Lm7l;
      // 35: bipush 0
      // 36: invokevirtual moh.e4u (Lm7l;I)V
      // 39: iload 3
      // 3a: ifeq 93
      // 3d: goto 44
      // 40: invokestatic rqh.a (Loov;)Loov;
      // 43: athrow
      // 44: iload 2
      // 45: goto 4c
      // 48: invokestatic rqh.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 3
      // 4d: ifne 79
      // 50: ifeq 71
      // 53: goto 5a
      // 56: invokestatic rqh.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield rqh.v30 Lmoh;
      // 5e: aload 0
      // 5f: getfield rqh.s7s Lm7l;
      // 62: iload 2
      // 63: invokevirtual moh.e4u (Lm7l;I)V
      // 66: iload 3
      // 67: ifeq 93
      // 6a: goto 71
      // 6d: invokestatic rqh.a (Loov;)Loov;
      // 70: athrow
      // 71: iload 1
      // 72: goto 79
      // 75: invokestatic rqh.a (Loov;)Loov;
      // 78: athrow
      // 79: ifle 93
      // 7c: aload 0
      // 7d: getfield rqh.v30 Lmoh;
      // 80: aload 0
      // 81: getfield rqh.s7s Lm7l;
      // 84: iload 1
      // 85: sipush 256
      // 88: iadd
      // 89: invokevirtual moh.e4u (Lm7l;I)V
      // 8c: goto 93
      // 8f: invokestatic rqh.a (Loov;)Loov;
      // 92: athrow
      // 93: aload 0
      // 94: aconst_null
      // 95: putfield rqh.s7s Lm7l;
      // 98: aload 0
      // 99: invokestatic Minecraft.qgs ()J
      // 9c: putfield rqh.j3i J
      // 9f: invokestatic m7l.r3g ()V
      // a2: iload 3
      // a3: ifeq b3
      // a6: aload 0
      // a7: goto ae
      // aa: invokestatic rqh.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 1
      // af: iload 2
      // b0: invokespecial ShaderHelper.dig (CI)V
      // b3: return
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
      // 00: aload 0
      // 01: invokevirtual rqh.xmz ()V
      // 04: aload 0
      // 05: getfield rqh.quy Loff;
      // 08: iload 1
      // 09: iload 2
      // 0a: fload 3
      // 0b: invokevirtual off.j46 (IIF)V
      // 0e: invokestatic OpaquePredicate.b ()I
      // 11: aload 0
      // 12: aload 0
      // 13: getfield rqh.fex Lowt;
      // 16: aload 0
      // 17: getfield rqh.dbe Ljava/lang/String;
      // 1a: aload 0
      // 1b: getfield rqh.dt7 I
      // 1e: bipush 2
      // 1f: idiv
      // 20: bipush 8
      // 22: ldc 16777215
      // 24: nop
      // 25: invokevirtual rqh.poi (Lowt;Ljava/lang/String;III)V
      // 28: bipush 1
      // 29: istore 5
      // 2b: aload 0
      // 2c: getfield rqh.v30 Lmoh;
      // 2f: getfield moh.wf7 [Lm7l;
      // 32: astore 6
      // 34: istore 4
      // 36: aload 6
      // 38: arraylength
      // 39: istore 7
      // 3b: bipush 0
      // 3c: istore 8
      // 3e: iload 8
      // 40: iload 7
      // 42: if_icmpge 88
      // 45: aload 6
      // 47: iload 8
      // 49: aaload
      // 4a: astore 9
      // 4c: iload 4
      // 4e: ifeq ac
      // 51: iload 4
      // 53: ifeq 83
      // 56: goto 5d
      // 59: invokestatic rqh.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 9
      // 5f: invokevirtual m7l.xbs ()I
      // 62: aload 9
      // 64: invokevirtual m7l.g2s ()I
      // 67: if_icmpeq 79
      // 6a: goto 71
      // 6d: invokestatic rqh.a (Loov;)Loov;
      // 70: athrow
      // 71: bipush 0
      // 72: istore 5
      // 74: iload 4
      // 76: ifne 88
      // 79: iinc 8 1
      // 7c: goto 83
      // 7f: invokestatic rqh.a (Loov;)Loov;
      // 82: athrow
      // 83: iload 4
      // 85: ifne 3e
      // 88: aload 0
      // 89: getfield rqh.bov Lgt4;
      // 8c: iload 5
      // 8e: iload 4
      // 90: ifeq 9e
      // 93: ifne a1
      // 96: goto 9d
      // 99: invokestatic rqh.a (Loov;)Loov;
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto a2
      // a1: bipush 0
      // a2: putfield gt4.c9a Z
      // a5: aload 0
      // a6: iload 1
      // a7: iload 2
      // a8: fload 3
      // a9: invokespecial ShaderHelper.drawScreen (IIF)V
      // ac: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5125478328830228101L, 9190134027988516280L, MethodHandles.lookup().lookupClass()).a(107698950615282L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29116697628114L;
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
      String var6 = "V ò\u0094EgF5÷\u0086Ôí\u008e\u001fä\f¢ûfáqH¼©ç\u009d1\u0086\u0087åÓ) \u0090ñY|Oô¥>Áò\u001b+`Ì¼\u007fÑªi§f\u008f\u0095¨ñ\u001fC?¤Ý\u0017\u001c";
      int var8 = "V ò\u0094EgF5÷\u0086Ôí\u008e\u001fä\f¢ûfáqH¼©ç\u009d1\u0086\u0087åÓ) \u0090ñY|Oô¥>Áò\u001b+`Ì¼\u007fÑªi§f\u008f\u0095¨ñ\u001fC?¤Ý\u0017\u001c"
         .length();
      char var5 = ' ';
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
                     g = new String[4];
                     pik = new moh$_ru[]{moh$_ru.m2v, moh$_ru._m3, moh$_ru.c29};
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

                  var6 = "Õö\u000b\u001cLK#Í·\u000bý6N\u0016ÈÎ ¡a}a\u0013SR\u009d\u0091¶  Eé¹\u0018Õh÷2\u009f¿C=\u0091÷µ\u0087\u00068á\b)äG\u008e3Å\u0082Ú";
                  var8 = "Õö\u000b\u001cLK#Í·\u000bý6N\u0016ÈÎ ¡a}a\u0013SR\u009d\u0091¶  Eé¹\u0018Õh÷2\u009f¿C=\u0091÷µ\u0087\u00068á\b)äG\u008e3Å\u0082Ú"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 878;
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
            throw new RuntimeException("rqh", var10);
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
         throw new RuntimeException("rqh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
