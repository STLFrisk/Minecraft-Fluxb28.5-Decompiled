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
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C09PacketHeldItemChange;

public class q98 extends ar7 {
   public static c_3 v20;
   public double wcy;
   public C03PacketPlayer ycm;
   private nhs ig7;
   public static cn7 pid;
   private boolean mtl;
   private nhs k5n;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public q98() {
      long var1 = a ^ 135528756897606L;
      super(b<"f">(24923, 7749687136281995756L ^ var1), _aj._lm, v20);
      this.wcy = 0.0;
      this.ig7 = new nhs();
      this.k5n = new nhs();
   }

   @jev
   public void yrf(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic q98.a J
      // 03: ldc2_w 14938698828657
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: getstatic q98.v20 Lc_3;
      // 10: sipush 10950
      // 13: ldc2_w 3388043782561320514
      // 16: lload 2
      // 17: lxor
      // 18: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: nop
      // 1e: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 21: iload 4
      // 23: ifne 3e
      // 26: ifeq 53
      // 29: goto 30
      // 2c: invokestatic q98.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: invokevirtual ihr.bbi ()Lmz2;
      // 34: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 37: goto 3e
      // 3a: invokestatic q98.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 53
      // 41: aload 0
      // 42: aload 1
      // 43: invokevirtual ihr.bbi ()Lmz2;
      // 46: checkcast net/minecraft/network/play/client/C03PacketPlayer
      // 49: putfield q98.ycm Lnet/minecraft/network/play/client/C03PacketPlayer;
      // 4c: goto 53
      // 4f: invokestatic q98.a (Loov;)Loov;
      // 52: athrow
      // 53: return
   }

   public static boolean zkd() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic q98.ek1 Lc05;
      // 07: getfield c05.vg8 Ll86;
      // 0a: getfield l86.kfp D
      // 0d: dconst_0
      // 0e: dcmpg
      // 0f: iload 0
      // 10: ifne 24
      // 13: ifge 23
      // 16: goto 1d
      // 19: invokestatic q98.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic q98.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 0
      // 24: istore 1
      // 25: iload 1
      // 26: getstatic q98.ek1 Lc05;
      // 29: getfield c05.vg8 Ll86;
      // 2c: getfield l86.kfp D
      // 2f: d2i
      // 30: bipush 2
      // 31: iadd
      // 32: if_icmplt 3b
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic q98.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getstatic q98.ek1 Lc05;
      // 3e: getfield c05.vg8 Ll86;
      // 41: invokevirtual l86.aaw ()Lnh4;
      // 44: dconst_0
      // 45: iload 1
      // 46: ineg
      // 47: i2d
      // 48: dconst_0
      // 49: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 4c: astore 2
      // 4d: iload 0
      // 4e: ifne 79
      // 51: getstatic q98.ek1 Lc05;
      // 54: getfield c05.tij Lkh3;
      // 57: getstatic q98.ek1 Lc05;
      // 5a: getfield c05.vg8 Ll86;
      // 5d: aload 2
      // 5e: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 61: invokeinterface java/util/List.isEmpty ()Z 1
      // 66: ifne 76
      // 69: goto 70
      // 6c: invokestatic q98.a (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: ireturn
      // 72: invokestatic q98.a (Loov;)Loov;
      // 75: athrow
      // 76: iinc 1 2
      // 79: goto 25
   }

   @jev
   public void e20(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic q98.a J
      // 003: ldc2_w 57726260090380
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic q98.v20 Lc_3;
      // 010: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 013: sipush 25514
      // 016: ldc2_w 3213751992532949586
      // 019: lload 2
      // 01a: lxor
      // 01b: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024: iload 4
      // 026: ifne 0a2
      // 029: ifeq 084
      // 02c: goto 033
      // 02f: invokestatic q98.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: pop
      // 035: iload 4
      // 037: ifne 07f
      // 03a: goto 041
      // 03d: invokestatic q98.a (Loov;)Loov;
      // 040: athrow
      // 041: getstatic q98.ek1 Lc05;
      // 044: getfield c05.vg8 Ll86;
      // 047: getfield l86.o_8 F
      // 04a: fconst_2
      // 04b: fcmpl
      // 04c: ifgt 073
      // 04f: goto 056
      // 052: invokestatic q98.a (Loov;)Loov;
      // 055: athrow
      // 056: invokestatic q0r.gax ()D
      // 059: ldc2_w 2.0
      // 05c: dcmpl
      // 05d: iload 4
      // 05f: ifne 0fd
      // 062: goto 069
      // 065: invokestatic q98.a (Loov;)Loov;
      // 068: athrow
      // 069: ifle 0e9
      // 06c: goto 073
      // 06f: invokestatic q98.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 1
      // 074: bipush 1
      // 075: putfield fz2.p3t Z
      // 078: goto 07f
      // 07b: invokestatic q98.a (Loov;)Loov;
      // 07e: athrow
      // 07f: iload 4
      // 081: ifeq 0e9
      // 084: getstatic q98.v20 Lc_3;
      // 087: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 08a: sipush 2428
      // 08d: ldc2_w 8147359996664787079
      // 090: lload 2
      // 091: lxor
      // 092: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09b: goto 0a2
      // 09e: invokestatic q98.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: iload 4
      // 0a4: ifne 0fd
      // 0a7: ifeq 0e9
      // 0aa: goto 0b1
      // 0ad: invokestatic q98.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: pop
      // 0b3: getstatic q98.ek1 Lc05;
      // 0b6: getfield c05.vg8 Ll86;
      // 0b9: getfield l86.o_8 F
      // 0bc: ldc 5.0
      // 0be: nop
      // 0bf: fcmpl
      // 0c0: iload 4
      // 0c2: ifne 0fd
      // 0c5: goto 0cc
      // 0c8: invokestatic q98.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: ifle 0e9
      // 0cf: goto 0d6
      // 0d2: invokestatic q98.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: dup
      // 0d8: getfield fz2.w2f D
      // 0db: ldc2_w 0.2
      // 0de: dadd
      // 0df: putfield fz2.w2f D
      // 0e2: goto 0e9
      // 0e5: invokestatic q98.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: getstatic q98.v20 Lc_3;
      // 0ec: sipush 28102
      // 0ef: ldc2_w 5953245905309193272
      // 0f2: lload 2
      // 0f3: lxor
      // 0f4: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: nop
      // 0fa: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 0fd: iload 4
      // 0ff: ifne 230
      // 102: ifeq 21c
      // 105: goto 10c
      // 108: invokestatic q98.a (Loov;)Loov;
      // 10b: athrow
      // 10c: getstatic q98.ek1 Lc05;
      // 10f: getfield c05.vg8 Ll86;
      // 112: getfield l86.lfk Z
      // 115: iload 4
      // 117: ifne 138
      // 11a: goto 121
      // 11d: invokestatic q98.a (Loov;)Loov;
      // 120: athrow
      // 121: ifne 147
      // 124: goto 12b
      // 127: invokestatic q98.a (Loov;)Loov;
      // 12a: athrow
      // 12b: getstatic kgt.obu Li4o;
      // 12e: invokevirtual i4o.klu ()Z
      // 131: goto 138
      // 134: invokestatic q98.a (Loov;)Loov;
      // 137: athrow
      // 138: iload 4
      // 13a: ifne 16a
      // 13d: ifeq 158
      // 140: goto 147
      // 143: invokestatic q98.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 0
      // 148: dconst_0
      // 149: putfield q98.wcy D
      // 14c: iload 4
      // 14e: ifeq 21c
      // 151: goto 158
      // 154: invokestatic q98.a (Loov;)Loov;
      // 157: athrow
      // 158: getstatic q98.ek1 Lc05;
      // 15b: getfield c05.vg8 Ll86;
      // 15e: getfield l86.mop D
      // 161: dconst_0
      // 162: dcmpg
      // 163: goto 16a
      // 166: invokestatic q98.a (Loov;)Loov;
      // 169: athrow
      // 16a: iload 4
      // 16c: ifne 230
      // 16f: ifge 21c
      // 172: goto 179
      // 175: invokestatic q98.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: dup
      // 17b: getfield q98.wcy D
      // 17e: getstatic q98.ek1 Lc05;
      // 181: getfield c05.vg8 Ll86;
      // 184: getfield l86.mop D
      // 187: dsub
      // 188: putfield q98.wcy D
      // 18b: aload 0
      // 18c: getfield q98.wcy D
      // 18f: invokestatic java/lang/Math.abs (D)D
      // 192: ldc2_w 2.5
      // 195: invokestatic p_c.vmu ()I
      // 198: i2d
      // 199: dadd
      // 19a: dcmpl
      // 19b: iload 4
      // 19d: ifne 230
      // 1a0: goto 1a7
      // 1a3: invokestatic q98.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: iflt 21c
      // 1aa: goto 1b1
      // 1ad: invokestatic q98.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: getstatic gnq.hkj Lq6h;
      // 1b4: getstatic gnq.bhu Lcrk;
      // 1b7: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 1ba: invokevirtual java/lang/Float.floatValue ()F
      // 1bd: f2d
      // 1be: invokevirtual q6h.hqu (D)Z
      // 1c1: iload 4
      // 1c3: ifne 1da
      // 1c6: goto 1cd
      // 1c9: invokestatic q98.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: ifne 1e9
      // 1d0: goto 1d7
      // 1d3: invokestatic q98.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: invokestatic gnq.y7v ()Z
      // 1da: iload 4
      // 1dc: ifne 230
      // 1df: ifne 21c
      // 1e2: goto 1e9
      // 1e5: invokestatic q98.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: getfield q98.ycm Lnet/minecraft/network/play/client/C03PacketPlayer;
      // 1ed: bipush 1
      // 1ee: putfield net/minecraft/network/play/client/C03PacketPlayer.er7 Z
      // 1f1: sipush 12553
      // 1f4: getstatic q98.ek1 Lc05;
      // 1f7: getfield c05.vg8 Ll86;
      // 1fa: getfield l86.lq7 Lp_k;
      // 1fd: invokevirtual p_k._m3 ()Lhv0;
      // 200: aload 0
      // 201: getfield q98.ycm Lnet/minecraft/network/play/client/C03PacketPlayer;
      // 204: invokevirtual hv0.r92 (Lmz2;)V
      // 207: ldc2_w 8186919963939113206
      // 20a: lload 2
      // 20b: lxor
      // 20c: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: nop
      // 212: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 215: goto 21c
      // 218: invokestatic q98.a (Loov;)Loov;
      // 21b: athrow
      // 21c: getstatic q98.v20 Lc_3;
      // 21f: sipush 24613
      // 222: ldc2_w 7828425049982360018
      // 225: lload 2
      // 226: lxor
      // 227: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: nop
      // 22d: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 230: iload 4
      // 232: ifne 335
      // 235: ifeq 32c
      // 238: goto 23f
      // 23b: invokestatic q98.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 0
      // 240: getfield q98.wcy D
      // 243: getstatic q98.ek1 Lc05;
      // 246: getfield c05.vg8 Ll86;
      // 249: getfield l86.o_8 F
      // 24c: f2d
      // 24d: dcmpl
      // 24e: iload 4
      // 250: ifne 27b
      // 253: goto 25a
      // 256: invokestatic q98.a (Loov;)Loov;
      // 259: athrow
      // 25a: ifle 270
      // 25d: goto 264
      // 260: invokestatic q98.a (Loov;)Loov;
      // 263: athrow
      // 264: aload 0
      // 265: dconst_0
      // 266: putfield q98.wcy D
      // 269: goto 270
      // 26c: invokestatic q98.a (Loov;)Loov;
      // 26f: athrow
      // 270: getstatic q98.ek1 Lc05;
      // 273: getfield c05.vg8 Ll86;
      // 276: getfield l86.mop D
      // 279: dconst_0
      // 27a: dcmpg
      // 27b: iload 4
      // 27d: ifne 335
      // 280: ifge 32c
      // 283: goto 28a
      // 286: invokestatic q98.a (Loov;)Loov;
      // 289: athrow
      // 28a: getstatic q98.ek1 Lc05;
      // 28d: getfield c05.vg8 Ll86;
      // 290: getfield l86.o_8 F
      // 293: f2d
      // 294: ldc2_w 2.124
      // 297: dcmpl
      // 298: iload 4
      // 29a: ifne 335
      // 29d: goto 2a4
      // 2a0: invokestatic q98.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: ifle 32c
      // 2a7: goto 2ae
      // 2aa: invokestatic q98.a (Loov;)Loov;
      // 2ad: athrow
      // 2ae: getstatic q98.ek1 Lc05;
      // 2b1: getfield c05.vg8 Ll86;
      // 2b4: getfield l86.mop D
      // 2b7: dstore 5
      // 2b9: getstatic q98.ek1 Lc05;
      // 2bc: getfield c05.vg8 Ll86;
      // 2bf: getfield l86.o_8 F
      // 2c2: f2d
      // 2c3: aload 0
      // 2c4: getfield q98.wcy D
      // 2c7: dsub
      // 2c8: dstore 7
      // 2ca: dload 7
      // 2cc: dload 5
      // 2ce: ldc2_w 0.08
      // 2d1: dsub
      // 2d2: ldc2_w 0.9800000190734863
      // 2d5: dmul
      // 2d6: dneg
      // 2d7: dadd
      // 2d8: dstore 9
      // 2da: dload 9
      // 2dc: ldc2_w 2.8
      // 2df: dcmpl
      // 2e0: iload 4
      // 2e2: ifne 335
      // 2e5: iflt 32c
      // 2e8: goto 2ef
      // 2eb: invokestatic q98.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: sipush 12060
      // 2f2: ldc2_w 3349082845005551336
      // 2f5: lload 2
      // 2f6: lxor
      // 2f7: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: nop
      // 2fd: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 300: getstatic q98.ek1 Lc05;
      // 303: getfield c05.vg8 Ll86;
      // 306: getfield l86.lq7 Lp_k;
      // 309: invokevirtual p_k._m3 ()Lhv0;
      // 30c: new net/minecraft/network/play/client/C03PacketPlayer
      // 30f: dup
      // 310: bipush 1
      // 311: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 314: invokevirtual hv0.r92 (Lmz2;)V
      // 317: aload 0
      // 318: getstatic q98.ek1 Lc05;
      // 31b: getfield c05.vg8 Ll86;
      // 31e: getfield l86.o_8 F
      // 321: f2d
      // 322: putfield q98.wcy D
      // 325: goto 32c
      // 328: invokestatic q98.a (Loov;)Loov;
      // 32b: athrow
      // 32c: getstatic q98.pid Lcn7;
      // 32f: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 332: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 335: iload 4
      // 337: ifne 35a
      // 33a: ifeq 3f6
      // 33d: goto 344
      // 340: invokestatic q98.a (Loov;)Loov;
      // 343: athrow
      // 344: aload 0
      // 345: pop
      // 346: getstatic q98.ek1 Lc05;
      // 349: getfield c05.vg8 Ll86;
      // 34c: getfield l86.o_8 F
      // 34f: ldc 4.0
      // 351: nop
      // 352: fcmpl
      // 353: goto 35a
      // 356: invokestatic q98.a (Loov;)Loov;
      // 359: athrow
      // 35a: iload 4
      // 35c: ifne 3c6
      // 35f: ifle 3bb
      // 362: goto 369
      // 365: invokestatic q98.a (Loov;)Loov;
      // 368: athrow
      // 369: invokestatic bk4.w8a ()D
      // 36c: ldc2_w 10.0
      // 36f: dcmpg
      // 370: iload 4
      // 372: ifne 3c6
      // 375: goto 37c
      // 378: invokestatic q98.a (Loov;)Loov;
      // 37b: athrow
      // 37c: ifge 3bb
      // 37f: goto 386
      // 382: invokestatic q98.a (Loov;)Loov;
      // 385: athrow
      // 386: aload 0
      // 387: invokespecial q98.x7g ()I
      // 38a: iload 4
      // 38c: ifne 3c6
      // 38f: goto 396
      // 392: invokestatic q98.a (Loov;)Loov;
      // 395: athrow
      // 396: bipush -1
      // 397: if_icmpeq 3bb
      // 39a: goto 3a1
      // 39d: invokestatic q98.a (Loov;)Loov;
      // 3a0: athrow
      // 3a1: aload 0
      // 3a2: invokespecial q98.a0_ ()Z
      // 3a5: iload 4
      // 3a7: ifne 3ec
      // 3aa: goto 3b1
      // 3ad: invokestatic q98.a (Loov;)Loov;
      // 3b0: athrow
      // 3b1: ifne 3d5
      // 3b4: goto 3bb
      // 3b7: invokestatic q98.a (Loov;)Loov;
      // 3ba: athrow
      // 3bb: aload 0
      // 3bc: getfield q98.mtl Z
      // 3bf: goto 3c6
      // 3c2: invokestatic q98.a (Loov;)Loov;
      // 3c5: athrow
      // 3c6: iload 4
      // 3c8: ifne 3ec
      // 3cb: ifeq 3f6
      // 3ce: goto 3d5
      // 3d1: invokestatic q98.a (Loov;)Loov;
      // 3d4: athrow
      // 3d5: aload 1
      // 3d6: iload 4
      // 3d8: ifne 3f0
      // 3db: goto 3e2
      // 3de: invokestatic q98.a (Loov;)Loov;
      // 3e1: athrow
      // 3e2: invokevirtual fz2.lhw ()Z
      // 3e5: goto 3ec
      // 3e8: invokestatic q98.a (Loov;)Loov;
      // 3eb: athrow
      // 3ec: ifne 3f6
      // 3ef: aload 1
      // 3f0: ldc 90.0
      // 3f2: nop
      // 3f3: invokevirtual fz2.ni7 (F)V
      // 3f6: return
   }

   @jev
   public void gfq(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic q98.pid Lcn7;
      // 07: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifne 31
      // 11: ifeq ad
      // 14: goto 1b
      // 17: invokestatic q98.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: pop
      // 1d: getstatic q98.ek1 Lc05;
      // 20: getfield c05.vg8 Ll86;
      // 23: getfield l86.o_8 F
      // 26: ldc 4.0
      // 28: nop
      // 29: fcmpl
      // 2a: goto 31
      // 2d: invokestatic q98.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 2
      // 32: ifne 99
      // 35: ifle 8e
      // 38: goto 3f
      // 3b: invokestatic q98.a (Loov;)Loov;
      // 3e: athrow
      // 3f: invokestatic bk4.w8a ()D
      // 42: ldc2_w 10.0
      // 45: dcmpg
      // 46: iload 2
      // 47: ifne 99
      // 4a: goto 51
      // 4d: invokestatic q98.a (Loov;)Loov;
      // 50: athrow
      // 51: ifge 8e
      // 54: goto 5b
      // 57: invokestatic q98.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: invokespecial q98.x7g ()I
      // 5f: iload 2
      // 60: ifne 99
      // 63: goto 6a
      // 66: invokestatic q98.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush -1
      // 6b: if_icmpeq 8e
      // 6e: goto 75
      // 71: invokestatic q98.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 0
      // 76: invokespecial q98.a0_ ()Z
      // 79: iload 2
      // 7a: ifne 99
      // 7d: goto 84
      // 80: invokestatic q98.a (Loov;)Loov;
      // 83: athrow
      // 84: ifne 9c
      // 87: goto 8e
      // 8a: invokestatic q98.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield q98.mtl Z
      // 92: goto 99
      // 95: invokestatic q98.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq ad
      // 9c: aload 1
      // 9d: dconst_0
      // 9e: invokevirtual _qa.oz6 (D)V
      // a1: aload 1
      // a2: dconst_0
      // a3: invokevirtual _qa.sqi (D)V
      // a6: goto ad
      // a9: invokestatic q98.a (Loov;)Loov;
      // ac: athrow
      // ad: return
   }

   @jev
   public void zk4(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: getstatic q98.pid Lcn7;
      // 007: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 00a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00d: iload 2
      // 00e: ifne 01e
      // 011: ifeq 262
      // 014: goto 01b
      // 017: invokestatic q98.a (Loov;)Loov;
      // 01a: athrow
      // 01b: invokestatic bk4.icg ()Z
      // 01e: iload 2
      // 01f: ifne 12f
      // 022: ifeq 11e
      // 025: goto 02c
      // 028: invokestatic q98.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: iload 2
      // 02e: ifne 126
      // 031: goto 038
      // 034: invokestatic q98.a (Loov;)Loov;
      // 037: athrow
      // 038: pop
      // 039: getstatic q98.ek1 Lc05;
      // 03c: getfield c05.vg8 Ll86;
      // 03f: getfield l86.up_ Ljnq;
      // 042: invokevirtual jnq.dxs ()Lerg;
      // 045: ifnull 11e
      // 048: goto 04f
      // 04b: invokestatic q98.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: pop
      // 051: getstatic q98.ek1 Lc05;
      // 054: getfield c05.vg8 Ll86;
      // 057: getfield l86.up_ Ljnq;
      // 05a: invokevirtual jnq.dxs ()Lerg;
      // 05d: invokevirtual erg.gn1 ()Lu7m;
      // 060: instanceof ayg
      // 063: iload 2
      // 064: ifne 12f
      // 067: goto 06e
      // 06a: invokestatic q98.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ifeq 11e
      // 071: goto 078
      // 074: invokestatic q98.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 0
      // 079: getfield q98.ig7 Lnhs;
      // 07c: ldc2_w 1000.0
      // 07f: invokevirtual nhs.yrv (D)Z
      // 082: iload 2
      // 083: ifne 12f
      // 086: goto 08d
      // 089: invokestatic q98.a (Loov;)Loov;
      // 08c: athrow
      // 08d: ifne 11e
      // 090: goto 097
      // 093: invokestatic q98.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: getfield q98.mtl Z
      // 09b: iload 2
      // 09c: ifne 12f
      // 09f: goto 0a6
      // 0a2: invokestatic q98.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: ifeq 11e
      // 0a9: goto 0b0
      // 0ac: invokestatic q98.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: pop
      // 0b2: getstatic q98.ek1 Lc05;
      // 0b5: getfield c05.vg8 Ll86;
      // 0b8: iload 2
      // 0b9: ifne 16a
      // 0bc: goto 0c3
      // 0bf: invokestatic q98.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: getfield l86.up_ Ljnq;
      // 0c6: invokevirtual jnq.dxs ()Lerg;
      // 0c9: invokevirtual erg.gn1 ()Lu7m;
      // 0cc: checkcast ayg
      // 0cf: invokevirtual ayg.k1c ()Le0x;
      // 0d2: invokevirtual e0x.p1r ()Lp3y;
      // 0d5: getstatic p3y.cei Lp3y;
      // 0d8: if_acmpne 162
      // 0db: goto 0e2
      // 0de: invokestatic q98.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: new mew
      // 0e5: dup
      // 0e6: aload 0
      // 0e7: pop
      // 0e8: getstatic q98.ek1 Lc05;
      // 0eb: getfield c05.vg8 Ll86;
      // 0ee: getfield l86.o2v D
      // 0f1: aload 0
      // 0f2: pop
      // 0f3: getstatic q98.ek1 Lc05;
      // 0f6: getfield c05.vg8 Ll86;
      // 0f9: getfield l86.kfp D
      // 0fc: dconst_1
      // 0fd: dsub
      // 0fe: aload 0
      // 0ff: pop
      // 100: getstatic q98.ek1 Lc05;
      // 103: getfield c05.vg8 Ll86;
      // 106: getfield l86.vbd D
      // 109: invokespecial mew.<init> (DDD)V
      // 10c: astore 3
      // 10d: aload 0
      // 10e: aload 3
      // 10f: getstatic vt2.rf3 Lvt2;
      // 112: invokespecial q98.zvp (Lmew;Lvt2;)V
      // 115: aload 0
      // 116: bipush 0
      // 117: putfield q98.mtl Z
      // 11a: iload 2
      // 11b: ifeq 162
      // 11e: aload 0
      // 11f: goto 126
      // 122: invokestatic q98.a (Loov;)Loov;
      // 125: athrow
      // 126: getfield q98.k5n Lnhs;
      // 129: ldc2_w 1500.0
      // 12c: invokevirtual nhs.yrv (D)Z
      // 12f: iload 2
      // 130: ifne 171
      // 133: ifeq 162
      // 136: goto 13d
      // 139: invokestatic q98.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield q98.mtl Z
      // 141: iload 2
      // 142: ifne 171
      // 145: goto 14c
      // 148: invokestatic q98.a (Loov;)Loov;
      // 14b: athrow
      // 14c: ifeq 162
      // 14f: goto 156
      // 152: invokestatic q98.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 0
      // 157: bipush 0
      // 158: putfield q98.mtl Z
      // 15b: goto 162
      // 15e: invokestatic q98.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 0
      // 163: pop
      // 164: getstatic q98.ek1 Lc05;
      // 167: getfield c05.vg8 Ll86;
      // 16a: getfield l86.o_8 F
      // 16d: ldc 4.0
      // 16f: nop
      // 170: fcmpl
      // 171: iload 2
      // 172: ifne 18d
      // 175: ifle 262
      // 178: goto 17f
      // 17b: invokestatic q98.a (Loov;)Loov;
      // 17e: athrow
      // 17f: invokestatic bk4.w8a ()D
      // 182: ldc2_w 10.0
      // 185: dcmpg
      // 186: goto 18d
      // 189: invokestatic q98.a (Loov;)Loov;
      // 18c: athrow
      // 18d: iload 2
      // 18e: ifne 1a6
      // 191: ifge 262
      // 194: goto 19b
      // 197: invokestatic q98.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 0
      // 19c: invokespecial q98.x7g ()I
      // 19f: goto 1a6
      // 1a2: invokestatic q98.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: iload 2
      // 1a7: ifne 1c0
      // 1aa: bipush -1
      // 1ab: if_icmpeq 262
      // 1ae: goto 1b5
      // 1b1: invokestatic q98.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: invokespecial q98.a0_ ()Z
      // 1b9: goto 1c0
      // 1bc: invokestatic q98.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: iload 2
      // 1c1: ifne 1dc
      // 1c4: ifeq 262
      // 1c7: goto 1ce
      // 1ca: invokestatic q98.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: invokestatic bk4.w8a ()D
      // 1d1: ldc2_w 3.0
      // 1d4: dcmpg
      // 1d5: goto 1dc
      // 1d8: invokestatic q98.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: iload 2
      // 1dd: ifne 206
      // 1e0: ifge 262
      // 1e3: goto 1ea
      // 1e6: invokestatic q98.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 0
      // 1eb: getfield q98.ig7 Lnhs;
      // 1ee: iload 2
      // 1ef: ifne 214
      // 1f2: goto 1f9
      // 1f5: invokestatic q98.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: ldc2_w 500.0
      // 1fc: invokevirtual nhs.yrv (D)Z
      // 1ff: goto 206
      // 202: invokestatic q98.a (Loov;)Loov;
      // 205: athrow
      // 206: ifeq 262
      // 209: aload 0
      // 20a: getfield q98.ig7 Lnhs;
      // 20d: goto 214
      // 210: invokestatic q98.a (Loov;)Loov;
      // 213: athrow
      // 214: invokevirtual nhs.zay ()V
      // 217: aload 0
      // 218: aload 0
      // 219: invokespecial q98.x7g ()I
      // 21c: invokespecial q98.sk6 (I)V
      // 21f: new mew
      // 222: dup
      // 223: aload 0
      // 224: pop
      // 225: getstatic q98.ek1 Lc05;
      // 228: getfield c05.vg8 Ll86;
      // 22b: getfield l86.o2v D
      // 22e: aload 0
      // 22f: pop
      // 230: getstatic q98.ek1 Lc05;
      // 233: getfield c05.vg8 Ll86;
      // 236: getfield l86.kfp D
      // 239: invokestatic bk4.w8a ()D
      // 23c: dsub
      // 23d: dconst_1
      // 23e: dsub
      // 23f: aload 0
      // 240: pop
      // 241: getstatic q98.ek1 Lc05;
      // 244: getfield c05.vg8 Ll86;
      // 247: getfield l86.vbd D
      // 24a: invokespecial mew.<init> (DDD)V
      // 24d: astore 3
      // 24e: aload 0
      // 24f: aload 3
      // 250: getstatic vt2.rf3 Lvt2;
      // 253: invokespecial q98.zvp (Lmew;Lvt2;)V
      // 256: aload 0
      // 257: bipush 1
      // 258: putfield q98.mtl Z
      // 25b: aload 0
      // 25c: getfield q98.k5n Lnhs;
      // 25f: invokevirtual nhs.zay ()V
      // 262: return
   }

   private void zvp(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: pop
      // 02: invokestatic t9d.c ()I
      // 05: getstatic q98.ek1 Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: getfield l86.up_ Ljnq;
      // 0e: invokevirtual jnq.dxs ()Lerg;
      // 11: astore 4
      // 13: istore 3
      // 14: aload 0
      // 15: pop
      // 16: getstatic q98.ek1 Lc05;
      // 19: getfield c05.l7q Lhh6;
      // 1c: aload 0
      // 1d: pop
      // 1e: getstatic q98.ek1 Lc05;
      // 21: getfield c05.vg8 Ll86;
      // 24: aload 0
      // 25: pop
      // 26: getstatic q98.ek1 Lc05;
      // 29: getfield c05.tij Lkh3;
      // 2c: aload 0
      // 2d: pop
      // 2e: getstatic q98.ek1 Lc05;
      // 31: getfield c05.vg8 Ll86;
      // 34: getfield l86.up_ Ljnq;
      // 37: invokevirtual jnq.dxs ()Lerg;
      // 3a: aload 1
      // 3b: aload 2
      // 3c: new fqr
      // 3f: dup
      // 40: aload 1
      // 41: invokevirtual mew.getX ()I
      // 44: i2d
      // 45: ldc2_w 0.5
      // 48: dadd
      // 49: aload 1
      // 4a: invokevirtual mew.getY ()I
      // 4d: i2d
      // 4e: dconst_1
      // 4f: dadd
      // 50: aload 1
      // 51: invokevirtual mew.getZ ()I
      // 54: i2d
      // 55: ldc2_w 0.5
      // 58: dadd
      // 59: invokespecial fqr.<init> (DDD)V
      // 5c: invokevirtual hh6.onPlayerRightClick (Ll86;Lkh3;Lerg;Lmew;Lvt2;Lfqr;)Z
      // 5f: pop
      // 60: iload 3
      // 61: ifne 97
      // 64: aload 4
      // 66: ifnull a3
      // 69: goto 70
      // 6c: invokestatic q98.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: pop
      // 72: getstatic q98.ek1 Lc05;
      // 75: getfield c05.l7q Lhh6;
      // 78: aload 0
      // 79: pop
      // 7a: getstatic q98.ek1 Lc05;
      // 7d: getfield c05.vg8 Ll86;
      // 80: aload 0
      // 81: pop
      // 82: getstatic q98.ek1 Lc05;
      // 85: getfield c05.tij Lkh3;
      // 88: aload 4
      // 8a: invokevirtual hh6.sendUseItem (Lha9;Lt9d;Lerg;)Z
      // 8d: pop
      // 8e: aload 0
      // 8f: pop
      // 90: goto 97
      // 93: invokestatic q98.a (Loov;)Loov;
      // 96: athrow
      // 97: getstatic q98.ek1 Lc05;
      // 9a: getfield c05.x0p Lv3i;
      // 9d: getfield v3i._ld Lmlb;
      // a0: invokevirtual mlb.hsl ()V
      // a3: return
   }

   private void sk6(int var1) {
      ek1.vg8.up_.nb5 = var1;
      ek1.vg8.lq7._m3().k7f(new C09PacketHeldItemChange(var1));
   }

   private int x7g() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic q98.a J
      // 03: ldc2_w 88359994935271
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: bipush 8
      // 13: if_icmpge 80
      // 16: aload 0
      // 17: pop
      // 18: iload 3
      // 19: ifne 7c
      // 1c: getstatic q98.ek1 Lc05;
      // 1f: getfield c05.vg8 Ll86;
      // 22: getfield l86.up_ Ljnq;
      // 25: getfield jnq.c41 [Lerg;
      // 28: iload 4
      // 2a: aaload
      // 2b: ifnull 79
      // 2e: goto 35
      // 31: invokestatic q98.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: pop
      // 37: iload 3
      // 38: ifne 7c
      // 3b: goto 42
      // 3e: invokestatic q98.a (Loov;)Loov;
      // 41: athrow
      // 42: getstatic q98.ek1 Lc05;
      // 45: getfield c05.vg8 Ll86;
      // 48: getfield l86.up_ Ljnq;
      // 4b: getfield jnq.c41 [Lerg;
      // 4e: iload 4
      // 50: aaload
      // 51: invokevirtual erg.gn1 ()Lu7m;
      // 54: invokevirtual u7m.ayn ()Ljava/lang/String;
      // 57: sipush 6982
      // 5a: ldc2_w 8877927811823694686
      // 5d: lload 1
      // 5e: lxor
      // 5f: invokedynamic f (IJ)Ljava/lang/String; bsm=q98.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: nop
      // 65: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 68: ifeq 79
      // 6b: goto 72
      // 6e: invokestatic q98.a (Loov;)Loov;
      // 71: athrow
      // 72: iload 4
      // 74: ireturn
      // 75: invokestatic q98.a (Loov;)Loov;
      // 78: athrow
      // 79: iinc 4 1
      // 7c: iload 3
      // 7d: ifeq 0f
      // 80: bipush -1
      // 81: ireturn
   }

   private boolean a0_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: pop
      // 006: getstatic q98.ek1 Lc05;
      // 009: getfield c05.l7q Lhh6;
      // 00c: invokevirtual hh6.fdl ()Lh50$f05;
      // 00f: getstatic h50$f05._nr Lh50$f05;
      // 012: iload 1
      // 013: ifeq 040
      // 016: if_acmpeq 089
      // 019: goto 020
      // 01c: invokestatic q98.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: pop
      // 022: getstatic q98.ek1 Lc05;
      // 025: iload 1
      // 026: ifeq 04f
      // 029: goto 030
      // 02c: invokestatic q98.a (Loov;)Loov;
      // 02f: athrow
      // 030: getfield c05.l7q Lhh6;
      // 033: invokevirtual hh6.fdl ()Lh50$f05;
      // 036: getstatic h50$f05.l18 Lh50$f05;
      // 039: goto 040
      // 03c: invokestatic q98.a (Loov;)Loov;
      // 03f: athrow
      // 040: if_acmpeq 089
      // 043: aload 0
      // 044: pop
      // 045: getstatic q98.ek1 Lc05;
      // 048: goto 04f
      // 04b: invokestatic q98.a (Loov;)Loov;
      // 04e: athrow
      // 04f: getfield c05.vg8 Ll86;
      // 052: getfield l86.lls Lpj2;
      // 055: getfield pj2.wzx Z
      // 058: iload 1
      // 059: ifeq 08a
      // 05c: ifne 089
      // 05f: goto 066
      // 062: invokestatic q98.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: pop
      // 068: getstatic q98.ek1 Lc05;
      // 06b: getfield c05.vg8 Ll86;
      // 06e: getfield l86.lls Lpj2;
      // 071: getfield pj2.wvp Z
      // 074: iload 1
      // 075: ifeq 091
      // 078: goto 07f
      // 07b: invokestatic q98.a (Loov;)Loov;
      // 07e: athrow
      // 07f: ifeq 08b
      // 082: goto 089
      // 085: invokestatic q98.a (Loov;)Loov;
      // 088: athrow
      // 089: bipush 0
      // 08a: ireturn
      // 08b: getstatic kgt.obu Li4o;
      // 08e: invokevirtual i4o.klu ()Z
      // 091: iload 1
      // 092: ifeq 0a0
      // 095: ifeq 0a1
      // 098: goto 09f
      // 09b: invokestatic q98.a (Loov;)Loov;
      // 09e: athrow
      // 09f: bipush 0
      // 0a0: ireturn
      // 0a1: getstatic q98.ek1 Lc05;
      // 0a4: pop
      // 0a5: invokestatic c05.vz1 ()Lc05;
      // 0a8: getfield c05.vg8 Ll86;
      // 0ab: getfield l86.kfp D
      // 0ae: dstore 2
      // 0af: dload 2
      // 0b0: dconst_0
      // 0b1: dcmpl
      // 0b2: ifle 129
      // 0b5: new mew
      // 0b8: dup
      // 0b9: getstatic q98.ek1 Lc05;
      // 0bc: pop
      // 0bd: invokestatic c05.vz1 ()Lc05;
      // 0c0: getfield c05.vg8 Ll86;
      // 0c3: getfield l86.o2v D
      // 0c6: dload 2
      // 0c7: getstatic q98.ek1 Lc05;
      // 0ca: pop
      // 0cb: invokestatic c05.vz1 ()Lc05;
      // 0ce: getfield c05.vg8 Ll86;
      // 0d1: getfield l86.vbd D
      // 0d4: invokespecial mew.<init> (DDD)V
      // 0d7: invokestatic bk4._82 (Lmew;)Le0x;
      // 0da: astore 4
      // 0dc: aload 4
      // 0de: invokevirtual e0x.p1r ()Lp3y;
      // 0e1: getstatic p3y.six Lp3y;
      // 0e4: iload 1
      // 0e5: ifeq 100
      // 0e8: if_acmpne 0f8
      // 0eb: goto 0f2
      // 0ee: invokestatic q98.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: bipush 0
      // 0f3: ireturn
      // 0f4: invokestatic q98.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 4
      // 0fa: invokevirtual e0x.p1r ()Lp3y;
      // 0fd: getstatic p3y.cei Lp3y;
      // 100: if_acmpeq 109
      // 103: bipush 1
      // 104: ireturn
      // 105: invokestatic q98.a (Loov;)Loov;
      // 108: athrow
      // 109: dload 2
      // 10a: dconst_0
      // 10b: iload 1
      // 10c: ifeq 123
      // 10f: dcmpg
      // 110: ifge 121
      // 113: goto 11a
      // 116: invokestatic q98.a (Loov;)Loov;
      // 119: athrow
      // 11a: goto 129
      // 11d: invokestatic q98.a (Loov;)Loov;
      // 120: athrow
      // 121: dload 2
      // 122: dconst_1
      // 123: dsub
      // 124: dstore 2
      // 125: iload 1
      // 126: ifne 0af
      // 129: bipush 1
      // 12a: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5900987483802096379L, 8320788235767375757L, MethodHandles.lookup().lookupClass()).a(249452040071514L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 35840991693570L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[14];
      int var5 = 0;
      String var4 = "\u000fp]Ú\u001f\f\u008eË\u0018ý½\u009b$^¬»X¤® þg\u0081\u001b\u0010¸R= Áë\u000f\u0099»Ú[g\u0097\nÎY\u001037Â¥\u0000¶ÑoÝ\fÂxI\u008cÅn ä£ô\u0004\u00119 {\u001f\u0001\u0091\f\u0091´Á\"¶\u008b\u0014M;\u0004+q©¥Xñ,ÐO\u0001\u0010ø\u0007[O\u0083\u001bo!´r\u00ad9óåÒÇ\u0010EÐ¯\n\u0011u\u0000ú2Û\u0085\u0087úvªp\u0010\u0017\"N\u0090L:T$p\u0093½\rÚ\u008e©\u0086\u0010tª\u009dßÛ\u008còÀkx*¸ö)X¥\u0018\u008dbùbU¯ûÕd\u0092x\u00ad\u0092\u0015.áöZóüêE\u0091æ\u0010\u0095\u008aþ8SQ«]\u0083E\u0085\u0004f\u001dZe\u0010&ª}\u009f*Týû\rÌWîHv)\u0081 \u008fbÓ\u0007Àâ<!Àó®sülpá¬Fw\u0015uÔ\u0090\u0006«L³gè\u0098Õ\u000f";
      int var6 = "\u000fp]Ú\u001f\f\u008eË\u0018ý½\u009b$^¬»X¤® þg\u0081\u001b\u0010¸R= Áë\u000f\u0099»Ú[g\u0097\nÎY\u001037Â¥\u0000¶ÑoÝ\fÂxI\u008cÅn ä£ô\u0004\u00119 {\u001f\u0001\u0091\f\u0091´Á\"¶\u008b\u0014M;\u0004+q©¥Xñ,ÐO\u0001\u0010ø\u0007[O\u0083\u001bo!´r\u00ad9óåÒÇ\u0010EÐ¯\n\u0011u\u0000ú2Û\u0085\u0087úvªp\u0010\u0017\"N\u0090L:T$p\u0093½\rÚ\u008e©\u0086\u0010tª\u009dßÛ\u008còÀkx*¸ö)X¥\u0018\u008dbùbU¯ûÕd\u0092x\u00ad\u0092\u0015.áöZóüêE\u0091æ\u0010\u0095\u008aþ8SQ«]\u0083E\u0085\u0004f\u001dZe\u0010&ª}\u009f*Týû\rÌWîHv)\u0081 \u008fbÓ\u0007Àâ<!Àó®sülpá¬Fw\u0015uÔ\u0090\u0006«L³gè\u0098Õ\u000f"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[14];
                     v20 = new c_3(
                        b<"f">(9612, 2516791305836003704L ^ var9),
                        b<"f">(18424, 8885834751154742020L ^ var9),
                        b<"f">(28102, 5953258993948215606L ^ var9),
                        new String[]{
                           b<"f">(20966, 7861515370141119774L ^ var9), b<"f">(28102, 5953258993948215606L ^ var9), b<"f">(20830, 7025601799240480165L ^ var9)
                        }
                     );
                     pid = new cn7(b<"f">(24923, 7749622659192571304L ^ var9), b<"f">(11888, 2820059679329618562L ^ var9), false);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "J\u00069¡b}«¾ôÙ7ó#à\u0010\ný¿\u0019³òÞØ\u0019\u0099ÕÖ9wà\u009b\u0093\u0010i®/\u0098¡»¬yjU&\u000bú\u0018þó";
                  var6 = "J\u00069¡b}«¾ôÙ7ó#à\u0010\ný¿\u0019³òÞØ\u0019\u0099ÕÖ9wà\u009b\u0093\u0010i®/\u0098¡»¬yjU&\u000bú\u0018þó".length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7875;
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
            throw new RuntimeException("q98", var10);
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
         throw new RuntimeException("q98" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
