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
import net.optifine.gui.GuiScreenOF;
import net.optifine.gui.TooltipManager;
import net.optifine.gui.TooltipProviderOptions;

public class b_q extends GuiScreenOF {
   private ShaderHelper ooc;
   public String b4c;
   private moh hj3;
   private static moh$_ru[] EntityAnimal;
   private TooltipManager kbl;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public b_q(ShaderHelper var1, moh var2) {
      long var3 = a ^ 101745625163809L;
      super();
      this.b4c = b<"n">(31994, 7727256316980206155L ^ var3);
      this.kbl = new TooltipManager(this, new TooltipProviderOptions());
      this.ooc = var1;
      this.hj3 = var2;
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
      // 000: getstatic b_q.a J
      // 003: ldc2_w 50499865879291
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: sipush 4713
      // 00c: ldc2_w 7684518235165736461
      // 00f: lload 1
      // 010: lxor
      // 011: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: bipush 0
      // 018: anewarray 56
      // 01b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 01e: putfield b_q.b4c Ljava/lang/String;
      // 021: invokestatic OpaquePredicate.b ()I
      // 024: aload 0
      // 025: getfield b_q.khf Ljava/util/List;
      // 028: invokeinterface java/util/List.clear ()V 1
      // 02d: istore 3
      // 02e: bipush 0
      // 02f: istore 4
      // 031: iload 4
      // 033: getstatic b_q.l5f [Lmoh$_ru;
      // 036: arraylength
      // 037: if_icmpge 0f3
      // 03a: getstatic b_q.l5f [Lmoh$_ru;
      // 03d: iload 4
      // 03f: aaload
      // 040: astore 5
      // 042: iload 3
      // 043: ifeq 109
      // 046: iload 3
      // 047: ifeq 0ef
      // 04a: goto 051
      // 04d: invokestatic b_q.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 5
      // 053: ifnull 0ec
      // 056: goto 05d
      // 059: invokestatic b_q.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield b_q.dt7 I
      // 061: bipush 2
      // 062: idiv
      // 063: sipush 155
      // 066: isub
      // 067: iload 4
      // 069: bipush 2
      // 06a: irem
      // 06b: sipush 160
      // 06e: imul
      // 06f: iadd
      // 070: istore 6
      // 072: aload 0
      // 073: getfield b_q.o1e I
      // 076: bipush 6
      // 078: idiv
      // 079: bipush 21
      // 07b: iload 4
      // 07d: bipush 2
      // 07e: idiv
      // 07f: imul
      // 080: iadd
      // 081: bipush 12
      // 083: isub
      // 084: istore 7
      // 086: aload 5
      // 088: invokevirtual moh$_ru.on0 ()Z
      // 08b: iload 3
      // 08c: ifeq 0eb
      // 08f: ifeq 0c0
      // 092: goto 099
      // 095: invokestatic b_q.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield b_q.khf Ljava/util/List;
      // 09d: new net/optifine/gui/GuiOptionSliderOF
      // 0a0: dup
      // 0a1: aload 5
      // 0a3: invokevirtual moh$_ru.ehz ()I
      // 0a6: iload 6
      // 0a8: iload 7
      // 0aa: aload 5
      // 0ac: invokespecial net/optifine/gui/GuiOptionSliderOF.<init> (IIILmoh$_ru;)V
      // 0af: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b4: pop
      // 0b5: iload 3
      // 0b6: ifne 0ec
      // 0b9: goto 0c0
      // 0bc: invokestatic b_q.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield b_q.khf Ljava/util/List;
      // 0c4: new net/optifine/gui/GuiOptionButtonOF
      // 0c7: dup
      // 0c8: aload 5
      // 0ca: invokevirtual moh$_ru.ehz ()I
      // 0cd: iload 6
      // 0cf: iload 7
      // 0d1: aload 5
      // 0d3: aload 0
      // 0d4: getfield b_q.hj3 Lmoh;
      // 0d7: aload 5
      // 0d9: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 0dc: invokespecial net/optifine/gui/GuiOptionButtonOF.<init> (IIILmoh$_ru;Ljava/lang/String;)V
      // 0df: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e4: goto 0eb
      // 0e7: invokestatic b_q.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: pop
      // 0ec: iinc 4 1
      // 0ef: iload 3
      // 0f0: ifne 031
      // 0f3: aload 0
      // 0f4: getfield b_q.o1e I
      // 0f7: bipush 6
      // 0f9: idiv
      // 0fa: bipush 21
      // 0fc: getstatic b_q.l5f [Lmoh$_ru;
      // 0ff: arraylength
      // 100: bipush 2
      // 101: idiv
      // 102: imul
      // 103: iadd
      // 104: bipush 12
      // 106: isub
      // 107: istore 4
      // 109: bipush 0
      // 10a: istore 5
      // 10c: aload 0
      // 10d: getfield b_q.dt7 I
      // 110: bipush 2
      // 111: idiv
      // 112: sipush 155
      // 115: isub
      // 116: bipush 0
      // 117: iadd
      // 118: istore 5
      // 11a: aload 0
      // 11b: getfield b_q.khf Ljava/util/List;
      // 11e: new cm_
      // 121: dup
      // 122: sipush 231
      // 125: iload 5
      // 127: iload 4
      // 129: sipush 15481
      // 12c: ldc2_w 1743310360248127519
      // 12f: lload 1
      // 130: lxor
      // 131: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: nop
      // 137: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 13a: invokespecial cm_.<init> (IIILjava/lang/String;)V
      // 13d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 142: pop
      // 143: aload 0
      // 144: getfield b_q.dt7 I
      // 147: bipush 2
      // 148: idiv
      // 149: sipush 155
      // 14c: isub
      // 14d: sipush 160
      // 150: iadd
      // 151: istore 5
      // 153: aload 0
      // 154: getfield b_q.khf Ljava/util/List;
      // 157: new cm_
      // 15a: dup
      // 15b: sipush 202
      // 15e: iload 5
      // 160: iload 4
      // 162: sipush 25495
      // 165: ldc2_w 4354755066620661757
      // 168: lload 1
      // 169: lxor
      // 16a: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: nop
      // 170: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 173: invokespecial cm_.<init> (IIILjava/lang/String;)V
      // 176: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17b: pop
      // 17c: iload 4
      // 17e: bipush 21
      // 180: iadd
      // 181: istore 4
      // 183: aload 0
      // 184: getfield b_q.dt7 I
      // 187: bipush 2
      // 188: idiv
      // 189: sipush 155
      // 18c: isub
      // 18d: bipush 0
      // 18e: iadd
      // 18f: istore 5
      // 191: aload 0
      // 192: getfield b_q.khf Ljava/util/List;
      // 195: new cm_
      // 198: dup
      // 199: sipush 201
      // 19c: iload 5
      // 19e: iload 4
      // 1a0: sipush 24064
      // 1a3: ldc2_w 8983279077133873761
      // 1a6: lload 1
      // 1a7: lxor
      // 1a8: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: nop
      // 1ae: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 1b1: invokespecial cm_.<init> (IIILjava/lang/String;)V
      // 1b4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b9: pop
      // 1ba: aload 0
      // 1bb: getfield b_q.dt7 I
      // 1be: bipush 2
      // 1bf: idiv
      // 1c0: sipush 155
      // 1c3: isub
      // 1c4: sipush 160
      // 1c7: iadd
      // 1c8: istore 5
      // 1ca: aload 0
      // 1cb: getfield b_q.khf Ljava/util/List;
      // 1ce: new cm_
      // 1d1: dup
      // 1d2: sipush 212
      // 1d5: iload 5
      // 1d7: iload 4
      // 1d9: sipush 20886
      // 1dc: ldc2_w 4447788485928549887
      // 1df: lload 1
      // 1e0: lxor
      // 1e1: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: nop
      // 1e7: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 1ea: invokespecial cm_.<init> (IIILjava/lang/String;)V
      // 1ed: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1f2: pop
      // 1f3: iload 4
      // 1f5: bipush 21
      // 1f7: iadd
      // 1f8: istore 4
      // 1fa: aload 0
      // 1fb: getfield b_q.dt7 I
      // 1fe: bipush 2
      // 1ff: idiv
      // 200: sipush 155
      // 203: isub
      // 204: bipush 0
      // 205: iadd
      // 206: istore 5
      // 208: aload 0
      // 209: getfield b_q.khf Ljava/util/List;
      // 20c: new cm_
      // 20f: dup
      // 210: sipush 211
      // 213: iload 5
      // 215: iload 4
      // 217: sipush 6279
      // 21a: ldc2_w 5826680208741840111
      // 21d: lload 1
      // 21e: lxor
      // 21f: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: nop
      // 225: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 228: invokespecial cm_.<init> (IIILjava/lang/String;)V
      // 22b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 230: pop
      // 231: aload 0
      // 232: getfield b_q.dt7 I
      // 235: bipush 2
      // 236: idiv
      // 237: sipush 155
      // 23a: isub
      // 23b: sipush 160
      // 23e: iadd
      // 23f: istore 5
      // 241: aload 0
      // 242: getfield b_q.khf Ljava/util/List;
      // 245: new cm_
      // 248: dup
      // 249: sipush 222
      // 24c: iload 5
      // 24e: iload 4
      // 250: sipush 15486
      // 253: ldc2_w 4213655190317174801
      // 256: lload 1
      // 257: lxor
      // 258: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: nop
      // 25e: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 261: invokespecial cm_.<init> (IIILjava/lang/String;)V
      // 264: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 269: pop
      // 26a: iload 4
      // 26c: bipush 21
      // 26e: iadd
      // 26f: istore 4
      // 271: aload 0
      // 272: getfield b_q.khf Ljava/util/List;
      // 275: new gt4
      // 278: dup
      // 279: sipush 200
      // 27c: aload 0
      // 27d: getfield b_q.dt7 I
      // 280: bipush 2
      // 281: idiv
      // 282: bipush 100
      // 284: isub
      // 285: aload 0
      // 286: getfield b_q.o1e I
      // 289: bipush 6
      // 28b: idiv
      // 28c: sipush 168
      // 28f: iadd
      // 290: bipush 11
      // 292: iadd
      // 293: sipush 15288
      // 296: ldc2_w 6064153243927680971
      // 299: lload 1
      // 29a: lxor
      // 29b: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: nop
      // 2a1: bipush 0
      // 2a2: anewarray 56
      // 2a5: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 2a8: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 2ab: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2b0: pop
      // 2b1: return
   }

   @Override
   public void actionPerformed(gt4 var1) {
      this.t7z(var1, 1);
   }

   @Override
   public void actionPerformedRightClick(gt4 var1) {
      try {
         if (var1._me == moh$_ru.daj.ordinal()) {
            this.t7z(var1, -1);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   private void t7z(gt4 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic b_q.a J
      // 003: ldc2_w 102189617524026
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: getfield gt4.c9a Z
      // 011: iload 5
      // 013: ifne 02e
      // 016: ifeq 348
      // 019: goto 020
      // 01c: invokestatic b_q.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield b_q.hj3 Lmoh;
      // 024: getfield moh.ysd I
      // 027: goto 02e
      // 02a: invokestatic b_q.a (Loov;)Loov;
      // 02d: athrow
      // 02e: istore 6
      // 030: aload 1
      // 031: getfield gt4._me I
      // 034: sipush 200
      // 037: iload 5
      // 039: ifne 08f
      // 03c: if_icmpge 088
      // 03f: goto 046
      // 042: invokestatic b_q.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 1
      // 047: instanceof cm_
      // 04a: iload 5
      // 04c: ifne 08c
      // 04f: goto 056
      // 052: invokestatic b_q.a (Loov;)Loov;
      // 055: athrow
      // 056: ifeq 088
      // 059: goto 060
      // 05c: invokestatic b_q.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield b_q.hj3 Lmoh;
      // 064: aload 1
      // 065: checkcast cm_
      // 068: invokevirtual cm_.t4j ()Lmoh$_ru;
      // 06b: iload 2
      // 06c: invokevirtual moh.d13 (Lmoh$_ru;I)V
      // 06f: aload 1
      // 070: aload 0
      // 071: getfield b_q.hj3 Lmoh;
      // 074: aload 1
      // 075: getfield gt4._me I
      // 078: invokestatic moh$_ru.jit (I)Lmoh$_ru;
      // 07b: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 07e: putfield gt4.frg Ljava/lang/String;
      // 081: goto 088
      // 084: invokestatic b_q.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 1
      // 089: getfield gt4._me I
      // 08c: sipush 200
      // 08f: iload 5
      // 091: ifne 0c3
      // 094: if_icmpne 0ba
      // 097: goto 09e
      // 09a: invokestatic b_q.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield b_q.f41 Lc05;
      // 0a2: getfield Minecraft.oxn Lmoh;
      // 0a5: invokevirtual moh.cmo ()V
      // 0a8: aload 0
      // 0a9: getfield b_q.f41 Lc05;
      // 0ac: aload 0
      // 0ad: getfield b_q.ooc Lgbe;
      // 0b0: invokevirtual Minecraft.z2i (Lgbe;)V
      // 0b3: goto 0ba
      // 0b6: invokestatic b_q.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield b_q.hj3 Lmoh;
      // 0be: getfield moh.ysd I
      // 0c1: iload 6
      // 0c3: iload 5
      // 0c5: ifne 100
      // 0c8: if_icmpeq 0f9
      // 0cb: goto 0d2
      // 0ce: invokestatic b_q.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: new eka
      // 0d5: dup
      // 0d6: aload 0
      // 0d7: getfield b_q.f41 Lc05;
      // 0da: invokespecial eka.<init> (Lc05;)V
      // 0dd: astore 7
      // 0df: aload 7
      // 0e1: invokevirtual eka.x05 ()I
      // 0e4: istore 8
      // 0e6: aload 7
      // 0e8: invokevirtual eka.lrx ()I
      // 0eb: istore 9
      // 0ed: aload 0
      // 0ee: aload 0
      // 0ef: getfield b_q.f41 Lc05;
      // 0f2: iload 8
      // 0f4: iload 9
      // 0f6: invokevirtual b_q.kky (Lc05;II)V
      // 0f9: aload 1
      // 0fa: getfield gt4._me I
      // 0fd: sipush 201
      // 100: iload 5
      // 102: ifne 137
      // 105: if_icmpne 130
      // 108: goto 10f
      // 10b: invokestatic b_q.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield b_q.f41 Lc05;
      // 113: getfield Minecraft.oxn Lmoh;
      // 116: invokevirtual moh.cmo ()V
      // 119: new net/optifine/gui/GuiDetailSettingsOF
      // 11c: dup
      // 11d: aload 0
      // 11e: aload 0
      // 11f: getfield b_q.hj3 Lmoh;
      // 122: invokespecial net/optifine/gui/GuiDetailSettingsOF.<init> (Lgbe;Lmoh;)V
      // 125: astore 7
      // 127: aload 0
      // 128: getfield b_q.f41 Lc05;
      // 12b: aload 7
      // 12d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 130: aload 1
      // 131: getfield gt4._me I
      // 134: sipush 202
      // 137: iload 5
      // 139: ifne 16e
      // 13c: if_icmpne 167
      // 13f: goto 146
      // 142: invokestatic b_q.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 0
      // 147: getfield b_q.f41 Lc05;
      // 14a: getfield Minecraft.oxn Lmoh;
      // 14d: invokevirtual moh.cmo ()V
      // 150: new net/optifine/gui/GuiQualitySettingsOF
      // 153: dup
      // 154: aload 0
      // 155: aload 0
      // 156: getfield b_q.hj3 Lmoh;
      // 159: invokespecial net/optifine/gui/GuiQualitySettingsOF.<init> (Lgbe;Lmoh;)V
      // 15c: astore 7
      // 15e: aload 0
      // 15f: getfield b_q.f41 Lc05;
      // 162: aload 7
      // 164: invokevirtual Minecraft.z2i (Lgbe;)V
      // 167: aload 1
      // 168: getfield gt4._me I
      // 16b: sipush 211
      // 16e: iload 5
      // 170: ifne 1a5
      // 173: if_icmpne 19e
      // 176: goto 17d
      // 179: invokestatic b_q.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: getfield b_q.f41 Lc05;
      // 181: getfield Minecraft.oxn Lmoh;
      // 184: invokevirtual moh.cmo ()V
      // 187: new net/optifine/gui/GuiAnimationSettingsOF
      // 18a: dup
      // 18b: aload 0
      // 18c: aload 0
      // 18d: getfield b_q.hj3 Lmoh;
      // 190: invokespecial net/optifine/gui/GuiAnimationSettingsOF.<init> (Lgbe;Lmoh;)V
      // 193: astore 7
      // 195: aload 0
      // 196: getfield b_q.f41 Lc05;
      // 199: aload 7
      // 19b: invokevirtual Minecraft.z2i (Lgbe;)V
      // 19e: aload 1
      // 19f: getfield gt4._me I
      // 1a2: sipush 212
      // 1a5: iload 5
      // 1a7: ifne 1dc
      // 1aa: if_icmpne 1d5
      // 1ad: goto 1b4
      // 1b0: invokestatic b_q.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: getfield b_q.f41 Lc05;
      // 1b8: getfield Minecraft.oxn Lmoh;
      // 1bb: invokevirtual moh.cmo ()V
      // 1be: new net/optifine/gui/GuiPerformanceSettingsOF
      // 1c1: dup
      // 1c2: aload 0
      // 1c3: aload 0
      // 1c4: getfield b_q.hj3 Lmoh;
      // 1c7: invokespecial net/optifine/gui/GuiPerformanceSettingsOF.<init> (Lgbe;Lmoh;)V
      // 1ca: astore 7
      // 1cc: aload 0
      // 1cd: getfield b_q.f41 Lc05;
      // 1d0: aload 7
      // 1d2: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1d5: aload 1
      // 1d6: getfield gt4._me I
      // 1d9: sipush 222
      // 1dc: iload 5
      // 1de: ifne 21f
      // 1e1: if_icmpne 20c
      // 1e4: goto 1eb
      // 1e7: invokestatic b_q.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: getfield b_q.f41 Lc05;
      // 1ef: getfield Minecraft.oxn Lmoh;
      // 1f2: invokevirtual moh.cmo ()V
      // 1f5: new net/optifine/gui/GuiOtherSettingsOF
      // 1f8: dup
      // 1f9: aload 0
      // 1fa: aload 0
      // 1fb: getfield b_q.hj3 Lmoh;
      // 1fe: invokespecial net/optifine/gui/GuiOtherSettingsOF.<init> (Lgbe;Lmoh;)V
      // 201: astore 7
      // 203: aload 0
      // 204: getfield b_q.f41 Lc05;
      // 207: aload 7
      // 209: invokevirtual Minecraft.z2i (Lgbe;)V
      // 20c: aload 1
      // 20d: getfield gt4._me I
      // 210: iload 5
      // 212: ifne 225
      // 215: sipush 231
      // 218: goto 21f
      // 21b: invokestatic b_q.a (Loov;)Loov;
      // 21e: athrow
      // 21f: if_icmpne 348
      // 222: invokestatic hxt.b4a ()Z
      // 225: iload 5
      // 227: ifne 237
      // 22a: ifne 246
      // 22d: goto 234
      // 230: invokestatic b_q.a (Loov;)Loov;
      // 233: athrow
      // 234: invokestatic hxt.yfx ()Z
      // 237: iload 5
      // 239: ifne 273
      // 23c: ifeq 270
      // 23f: goto 246
      // 242: invokestatic b_q.a (Loov;)Loov;
      // 245: athrow
      // 246: sipush 31783
      // 249: ldc2_w 2198814030674124688
      // 24c: lload 3
      // 24d: lxor
      // 24e: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: nop
      // 254: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 257: sipush 16113
      // 25a: ldc2_w 829398260627742046
      // 25d: lload 3
      // 25e: lxor
      // 25f: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: nop
      // 265: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 268: invokestatic hxt.vuo (Ljava/lang/String;Ljava/lang/String;)V
      // 26b: return
      // 26c: invokestatic b_q.a (Loov;)Loov;
      // 26f: athrow
      // 270: invokestatic hxt.y_u ()Z
      // 273: iload 5
      // 275: ifne 2af
      // 278: ifeq 2ac
      // 27b: goto 282
      // 27e: invokestatic b_q.a (Loov;)Loov;
      // 281: athrow
      // 282: sipush 6870
      // 285: ldc2_w 4491985778282019191
      // 288: lload 3
      // 289: lxor
      // 28a: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: nop
      // 290: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 293: sipush 3818
      // 296: ldc2_w 6252347033931197788
      // 299: lload 3
      // 29a: lxor
      // 29b: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: nop
      // 2a1: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 2a4: invokestatic hxt.vuo (Ljava/lang/String;Ljava/lang/String;)V
      // 2a7: return
      // 2a8: invokestatic b_q.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: invokestatic hxt.veb ()Z
      // 2af: iload 5
      // 2b1: ifne 2fa
      // 2b4: ifeq 2e8
      // 2b7: goto 2be
      // 2ba: invokestatic b_q.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: sipush 15938
      // 2c1: ldc2_w 7947009070507892209
      // 2c4: lload 3
      // 2c5: lxor
      // 2c6: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: nop
      // 2cc: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 2cf: sipush 23622
      // 2d2: ldc2_w 6337003829128200162
      // 2d5: lload 3
      // 2d6: lxor
      // 2d7: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: nop
      // 2dd: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 2e0: invokestatic hxt.vuo (Ljava/lang/String;Ljava/lang/String;)V
      // 2e3: return
      // 2e4: invokestatic b_q.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: invokestatic hxt.d9p ()Lmoh;
      // 2eb: iload 5
      // 2ed: ifne 32e
      // 2f0: getfield moh.rdb Z
      // 2f3: goto 2fa
      // 2f6: invokestatic b_q.a (Loov;)Loov;
      // 2f9: athrow
      // 2fa: ifeq 327
      // 2fd: sipush 25460
      // 300: ldc2_w 4895002223825502401
      // 303: lload 3
      // 304: lxor
      // 305: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: nop
      // 30b: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 30e: sipush 8576
      // 311: ldc2_w 15924939194860067
      // 314: lload 3
      // 315: lxor
      // 316: invokedynamic n (IJ)Ljava/lang/String; bsm=b_q.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: nop
      // 31c: invokestatic net/optifine/Lang.get (Ljava/lang/String;)Ljava/lang/String;
      // 31f: invokestatic hxt.vuo (Ljava/lang/String;Ljava/lang/String;)V
      // 322: return
      // 323: invokestatic b_q.a (Loov;)Loov;
      // 326: athrow
      // 327: aload 0
      // 328: getfield b_q.f41 Lc05;
      // 32b: getfield Minecraft.oxn Lmoh;
      // 32e: invokevirtual moh.cmo ()V
      // 331: new net/optifine/shaders/gui/GuiShaders
      // 334: dup
      // 335: aload 0
      // 336: aload 0
      // 337: getfield b_q.hj3 Lmoh;
      // 33a: invokespecial net/optifine/shaders/gui/GuiShaders.<init> (Lgbe;Lmoh;)V
      // 33d: astore 7
      // 33f: aload 0
      // 340: getfield b_q.f41 Lc05;
      // 343: aload 7
      // 345: invokevirtual Minecraft.z2i (Lgbe;)V
      // 348: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 59063128684996L;
      this.xmz();
      this.poi(this.fex, this.b4c, this.dt7 / 2, 15, 16777215);
      int var10000 = OpaquePredicate.b();
      String var7 = hxt._yw();
      String var8 = b<"n">(21533, 7589636935349019470L ^ var4);
      int var6 = var10000;

      label51: {
         label50: {
            try {
               var14 = var8.equals(b<"n">(11588, 825600038278453784L ^ var4));
               if (var6 == 0) {
                  break label51;
               }

               if (!var14) {
                  break label50;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var7 = b<"n">(28457, 7051385753447635046L ^ var4);
         }

         var14 = var8.equals(b<"n">(16746, 1608690505471964728L ^ var4));
      }

      label55: {
         label41: {
            label40: {
               try {
                  if (var6 == 0) {
                     break label41;
                  }

                  if (!var14) {
                     break label40;
                  }
               } catch (oov var12) {
                  throw a(var12);
               }

               var7 = b<"n">(12147, 4261088646501750827L ^ var4);
            }

            try {
               var15 = var8;
               if (var6 == 0) {
                  break label55;
               }

               var14 = var8.equals("L");
            } catch (oov var11) {
               throw a(var11);
            }
         }

         if (var14) {
            var7 = b<"n">(27915, 260534377890486853L ^ var4);
         }

         this.c_t(this.fex, var7, 2, this.o1e - 10, 8421504);
         var15 = b<"n">(9136, 5602685626003641594L ^ var4);
      }

      String var9 = var15;
      int var10 = this.fex.ezt(var9);
      this.c_t(this.fex, var9, this.dt7 - var10 - 2, this.o1e - 10, 8421504);
      super.drawScreen(var1, var2, var3);
      this.kbl.drawTooltips(var1, var2, this.khf);
   }

   public static int v0j(gt4 var0) {
      return var0.s22;
   }

   public static int qp0(gt4 var0) {
      return var0.gqs;
   }

   public static void lml(ShaderHelper var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.flp(var1, var2, var3, var4, var5, var6);
   }

   public static String ah3(_ov var0) {
      return var0.i7w.xct();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-157528345057441998L, -7527442082948655745L, MethodHandles.lookup().lookupClass()).a(233003976279610L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 98823510473585L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[24];
      int var7 = 0;
      String var6 = "!bB£ïÂ¨äï\u0080¿|Ù1¿\"Ö4¢Õ¬s«Hû\u00925hÏûÝ6÷Ú\u00adPz\u009e¨u\u0010¾ôõ6v}\u00920\u0089|\u009a¢\u0089¸\u009b£(«lE\u0085\rÏ\u0092Ð\u0083\u0017-è«KÃ<ÛÅó©F\u0081\u008dhL{Ýõ¢Í\u000f\u0088ü\u0081Ç*tNåè \u0095?mX§HöaÅB%áð_îoÊÁ¾¯w2\u009a}0\u001e\u0012ÄÒ\u0092«\u0019 ÙÔä9 Ü\u009aööîð\u0096\u0018\b¬ \u009bx\u0087°`zBPý/-ÓÜ#@p(-¯Æ\u001bPë\u001eô\u0014_\u008f\u0014øB)8¹'\f2&'¸l\u0097®u\u0095×tÛ³;\u001bå) Ä:\u0093(Òc\u000ep\u0093ÔÄí\u0090üÖ\u0005ø\u0005F9\u008fÚ+¤\u0002\u008dV¼\u0012SsZ\u001aÖHØ\u0099\u0019u©\u0089{:*(\u0087\u0013ó9:ça5¼\u0096ÉxMeÂ¯yIÑ>$\u001bwÿ\u00ad,lJ\u001dC|\f\u0093ë³´ø¥\u0013\u0089(\u0004O´\u0087Ñ\u008b\u001a\u0098PÜûf\u0082c\u0015¿n\u0000ÚÔo\u0084ó8FuÃß\u0018µ\u0087\u0011gyXá£RD, çP\u00908K\u001f\u001e¬\u0018[»Éy\u0084WÕÜ\bQºB\u001e{ò×R\u0011\u0083iÌK¯0±ÇTÔ¿©\u0089Q-µ)ûýø6¿¶Edö\u0005pkªÝµ\u0098\u008b\u0012Yy\u009fç`Ò\u0093^\u001fÁqÁg\u0081Q\u0018\u008a\u001cm(Uãd!Ä\u0087?\u001eRµ\u0002Kú=\u008e\u0081\u0014\u0005\u0010ÏÙ\u0080\u0091\u008d\u0013W4/S\u009að?&×\u0081b4\u0099êk0iñÄ`KIKäF`´æ\u001f\u0014IË§ü¡\u0005ëÌ\u0086}\u0090ýÛ\u000fÓ\u0018\u0087\u009cUüxÆÏ@\u0087Ø\u0082rmÅ\u0085fËK(¾ÖãÝ\u0092Wþ\u0017\u001d`\u009eûçûß\u009a¨mË\u009dZ®ê\u008eê`z¡v¥¢v\bn\u0000©\u0087Q\u0011ç\u0010Ô·éÖá\u0016Í\u0017¢\u0088\u001c\u009a\u0089\u001eÊ\n\u00104µT_ç]\u0092\u008aÚßPÍk\u0090\u009aE(sUV5R\u0006\u001d=í\u0087ï\u0000\u0003Æ)\u0086SF}þä¶f:*\tËow2×ÿË\u0095´Ï|x[æ Z¡st\u0003\u008dm\u0018îèè¸Zz\u0018&½~¶Ll¼ðt\u001cù\u008e)á\u009bÄE\u0018°~·w§óÅLÿµ\u009e\u0007ÌÐpm?ß\u00ad\b$8b³(ùÒÄçÈn¿\u0011\u009e\u008dÂ\u0088¿ä\u0013\u0087=;]\u0095\u00034)\u0003jíçJÉÅ\u0093ÿqQ9\u001d©u\u008bä(-\u001bD\u0096v¶QÕ\u008fÀLØ\r\u0080\u0014¡>\u0002ËL\u000e5Ä\u0090\u0006?¥öf\u0011ø\u0087\u0000ëq\u007fÅÔ6H(¡L²#F¥\u0000¸Ø\u0081\u0016Á¨%`|¶Ô\u0080è¢yR\u00822O\u0090R\u0012F\b\"XÊrdY8c9";
      int var8 = "!bB£ïÂ¨äï\u0080¿|Ù1¿\"Ö4¢Õ¬s«Hû\u00925hÏûÝ6÷Ú\u00adPz\u009e¨u\u0010¾ôõ6v}\u00920\u0089|\u009a¢\u0089¸\u009b£(«lE\u0085\rÏ\u0092Ð\u0083\u0017-è«KÃ<ÛÅó©F\u0081\u008dhL{Ýõ¢Í\u000f\u0088ü\u0081Ç*tNåè \u0095?mX§HöaÅB%áð_îoÊÁ¾¯w2\u009a}0\u001e\u0012ÄÒ\u0092«\u0019 ÙÔä9 Ü\u009aööîð\u0096\u0018\b¬ \u009bx\u0087°`zBPý/-ÓÜ#@p(-¯Æ\u001bPë\u001eô\u0014_\u008f\u0014øB)8¹'\f2&'¸l\u0097®u\u0095×tÛ³;\u001bå) Ä:\u0093(Òc\u000ep\u0093ÔÄí\u0090üÖ\u0005ø\u0005F9\u008fÚ+¤\u0002\u008dV¼\u0012SsZ\u001aÖHØ\u0099\u0019u©\u0089{:*(\u0087\u0013ó9:ça5¼\u0096ÉxMeÂ¯yIÑ>$\u001bwÿ\u00ad,lJ\u001dC|\f\u0093ë³´ø¥\u0013\u0089(\u0004O´\u0087Ñ\u008b\u001a\u0098PÜûf\u0082c\u0015¿n\u0000ÚÔo\u0084ó8FuÃß\u0018µ\u0087\u0011gyXá£RD, çP\u00908K\u001f\u001e¬\u0018[»Éy\u0084WÕÜ\bQºB\u001e{ò×R\u0011\u0083iÌK¯0±ÇTÔ¿©\u0089Q-µ)ûýø6¿¶Edö\u0005pkªÝµ\u0098\u008b\u0012Yy\u009fç`Ò\u0093^\u001fÁqÁg\u0081Q\u0018\u008a\u001cm(Uãd!Ä\u0087?\u001eRµ\u0002Kú=\u008e\u0081\u0014\u0005\u0010ÏÙ\u0080\u0091\u008d\u0013W4/S\u009að?&×\u0081b4\u0099êk0iñÄ`KIKäF`´æ\u001f\u0014IË§ü¡\u0005ëÌ\u0086}\u0090ýÛ\u000fÓ\u0018\u0087\u009cUüxÆÏ@\u0087Ø\u0082rmÅ\u0085fËK(¾ÖãÝ\u0092Wþ\u0017\u001d`\u009eûçûß\u009a¨mË\u009dZ®ê\u008eê`z¡v¥¢v\bn\u0000©\u0087Q\u0011ç\u0010Ô·éÖá\u0016Í\u0017¢\u0088\u001c\u009a\u0089\u001eÊ\n\u00104µT_ç]\u0092\u008aÚßPÍk\u0090\u009aE(sUV5R\u0006\u001d=í\u0087ï\u0000\u0003Æ)\u0086SF}þä¶f:*\tËow2×ÿË\u0095´Ï|x[æ Z¡st\u0003\u008dm\u0018îèè¸Zz\u0018&½~¶Ll¼ðt\u001cù\u008e)á\u009bÄE\u0018°~·w§óÅLÿµ\u009e\u0007ÌÐpm?ß\u00ad\b$8b³(ùÒÄçÈn¿\u0011\u009e\u008dÂ\u0088¿ä\u0013\u0087=;]\u0095\u00034)\u0003jíçJÉÅ\u0093ÿqQ9\u001d©u\u008bä(-\u001bD\u0096v¶QÕ\u008fÀLØ\r\u0080\u0014¡>\u0002ËL\u000e5Ä\u0090\u0006?¥öf\u0011ø\u0087\u0000ëq\u007fÅÔ6H(¡L²#F¥\u0000¸Ø\u0081\u0016Á¨%`|¶Ô\u0080è¢yR\u00822O\u0090R\u0012F\b\"XÊrdY8c9"
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
                     g = new String[24];
                     EntityAnimal = new moh$_ru[]{
                        moh$_ru.yeb,
                        moh$_ru.xby,
                        moh$_ru.trw,
                        moh$_ru.w6a,
                        moh$_ru.b8t,
                        moh$_ru.ql7,
                        moh$_ru.daj,
                        moh$_ru.x1y,
                        moh$_ru.jfu,
                        moh$_ru.jgg,
                        moh$_ru._ll,
                        moh$_ru.oes
                     };
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

                  var6 = "\u008cÍ¤]Ê]íx'D\u001fëYÍ\u009a_)×\u008b,\u0082\u0087Rù\u0081YÈ\u0005~ø::Ëuq03,¼^ Ør\u0098¦\t<\u0007\u008eâÁvH!ÉCKa{®\u0096+¬ûR(í\u0087B\u0012Ö£I";
                  var8 = "\u008cÍ¤]Ê]íx'D\u001fëYÍ\u009a_)×\u008b,\u0082\u0087Rù\u0081YÈ\u0005~ø::Ëuq03,¼^ Ør\u0098¦\t<\u0007\u008eâÁvH!ÉCKa{®\u0096+¬ûR(í\u0087B\u0012Ö£I"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22383;
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
            throw new RuntimeException("b_q", var10);
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
         throw new RuntimeException("b_q" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
