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

public class _6b extends s1e {
   public long _ud;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public _6b(OpaquePredicate param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _6b.b J
      // 003: ldc2_w 102258199550751
      // 006: lxor
      // 007: lstore 8
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokespecial s1e.<init> (Lt9d;)V
      // 00e: aload 0
      // 00f: dload 2
      // 010: dload 4
      // 012: dload 6
      // 014: fconst_0
      // 015: fconst_0
      // 016: invokevirtual _6b.x24 (DDDFF)V
      // 019: aload 0
      // 01a: bipush 2
      // 01b: putfield _6b.ouj I
      // 01e: aload 0
      // 01f: aload 0
      // 020: getfield _6b.z2d Ljava/util/Random;
      // 023: invokevirtual java/util/Random.nextLong ()J
      // 026: putfield _6b._ud J
      // 029: invokestatic OpaquePredicate.b ()I
      // 02c: aload 0
      // 02d: aload 0
      // 02e: getfield _6b.z2d Ljava/util/Random;
      // 031: bipush 3
      // 032: invokevirtual java/util/Random.nextInt (I)I
      // 035: bipush 1
      // 036: iadd
      // 037: putfield _6b.cf8 I
      // 03a: new mew
      // 03d: dup
      // 03e: aload 0
      // 03f: invokespecial mew.<init> (Li2h;)V
      // 042: astore 11
      // 044: istore 10
      // 046: aload 1
      // 047: getfield OpaquePredicate.v0f Z
      // 04a: iload 10
      // 04c: ifeq 082
      // 04f: ifne 1ad
      // 052: goto 059
      // 055: invokestatic _6b.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 1
      // 05a: iload 10
      // 05c: ifeq 086
      // 05f: goto 066
      // 062: invokestatic _6b.a (Loov;)Loov;
      // 065: athrow
      // 066: invokevirtual OpaquePredicate.eir ()Lef9;
      // 069: sipush 28605
      // 06c: ldc2_w 8592458478306114903
      // 06f: lload 8
      // 071: lxor
      // 072: invokedynamic d (IJ)Ljava/lang/String; bsm=_6b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 07b: goto 082
      // 07e: invokestatic _6b.a (Loov;)Loov;
      // 081: athrow
      // 082: ifeq 1ad
      // 085: aload 1
      // 086: iload 10
      // 088: ifeq 0c0
      // 08b: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 08e: getstatic v66.b_4 Lv66;
      // 091: if_acmpeq 0b8
      // 094: goto 09b
      // 097: invokestatic _6b.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 1
      // 09c: iload 10
      // 09e: ifeq 0c0
      // 0a1: goto 0a8
      // 0a4: invokestatic _6b.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 0ab: getstatic v66.csg Lv66;
      // 0ae: if_acmpne 1ad
      // 0b1: goto 0b8
      // 0b4: invokestatic _6b.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: goto 0c0
      // 0bc: invokestatic _6b.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 11
      // 0c2: iload 10
      // 0c4: ifeq 0e0
      // 0c7: bipush 10
      // 0c9: invokevirtual OpaquePredicate.hrj (Lmew;I)Z
      // 0cc: ifeq 1ad
      // 0cf: goto 0d6
      // 0d2: invokestatic _6b.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: aload 11
      // 0d9: goto 0e0
      // 0dc: invokestatic _6b.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0e3: invokeinterface zfz.r_y ()Le0x; 1
      // 0e8: invokevirtual e0x.p1r ()Lp3y;
      // 0eb: getstatic p3y.cei Lp3y;
      // 0ee: if_acmpne 124
      // 0f1: getstatic ox_._0u Lwuo;
      // 0f4: aload 1
      // 0f5: aload 11
      // 0f7: invokevirtual wuo.ctq (Lt9d;Lmew;)Z
      // 0fa: iload 10
      // 0fc: ifeq 125
      // 0ff: goto 106
      // 102: invokestatic _6b.a (Loov;)Loov;
      // 105: athrow
      // 106: ifeq 124
      // 109: goto 110
      // 10c: invokestatic _6b.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 1
      // 111: aload 11
      // 113: getstatic ox_._0u Lwuo;
      // 116: invokevirtual wuo.l4i ()Lzfz;
      // 119: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 11c: pop
      // 11d: goto 124
      // 120: invokestatic _6b.a (Loov;)Loov;
      // 123: athrow
      // 124: bipush 0
      // 125: istore 12
      // 127: iload 12
      // 129: bipush 4
      // 12a: if_icmpge 1ad
      // 12d: aload 11
      // 12f: aload 0
      // 130: getfield _6b.z2d Ljava/util/Random;
      // 133: bipush 3
      // 134: invokevirtual java/util/Random.nextInt (I)I
      // 137: bipush 1
      // 138: isub
      // 139: aload 0
      // 13a: getfield _6b.z2d Ljava/util/Random;
      // 13d: bipush 3
      // 13e: invokevirtual java/util/Random.nextInt (I)I
      // 141: bipush 1
      // 142: isub
      // 143: aload 0
      // 144: getfield _6b.z2d Ljava/util/Random;
      // 147: bipush 3
      // 148: invokevirtual java/util/Random.nextInt (I)I
      // 14b: bipush 1
      // 14c: isub
      // 14d: invokevirtual mew.ec4 (III)Lmew;
      // 150: astore 13
      // 152: iload 10
      // 154: ifeq 1a8
      // 157: aload 1
      // 158: aload 13
      // 15a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 15d: invokeinterface zfz.r_y ()Le0x; 1
      // 162: invokevirtual e0x.p1r ()Lp3y;
      // 165: getstatic p3y.cei Lp3y;
      // 168: if_acmpne 1a5
      // 16b: goto 172
      // 16e: invokestatic _6b.a (Loov;)Loov;
      // 171: athrow
      // 172: getstatic ox_._0u Lwuo;
      // 175: aload 1
      // 176: aload 13
      // 178: invokevirtual wuo.ctq (Lt9d;Lmew;)Z
      // 17b: iload 10
      // 17d: ifeq 1a4
      // 180: goto 187
      // 183: invokestatic _6b.a (Loov;)Loov;
      // 186: athrow
      // 187: ifeq 1a5
      // 18a: goto 191
      // 18d: invokestatic _6b.a (Loov;)Loov;
      // 190: athrow
      // 191: aload 1
      // 192: aload 13
      // 194: getstatic ox_._0u Lwuo;
      // 197: invokevirtual wuo.l4i ()Lzfz;
      // 19a: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 19d: goto 1a4
      // 1a0: invokestatic _6b.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: pop
      // 1a5: iinc 12 1
      // 1a8: iload 10
      // 1aa: ifne 127
      // 1ad: return
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _6b.b J
      // 003: ldc2_w 41398244325206
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial s1e.xx_ ()V
      // 010: aload 0
      // 011: getfield _6b.ouj I
      // 014: iload 3
      // 015: ifne 09c
      // 018: bipush 2
      // 019: if_icmpne 08e
      // 01c: goto 023
      // 01f: invokestatic _6b.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: getfield _6b.oay Lt9d;
      // 027: aload 0
      // 028: getfield _6b.o2v D
      // 02b: aload 0
      // 02c: getfield _6b.kfp D
      // 02f: aload 0
      // 030: getfield _6b.vbd D
      // 033: sipush 13490
      // 036: ldc2_w 3058755961043323411
      // 039: lload 1
      // 03a: lxor
      // 03b: invokedynamic d (IJ)Ljava/lang/String; bsm=_6b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: nop
      // 041: ldc 10000.0
      // 043: nop
      // 044: ldc 0.8
      // 046: nop
      // 047: aload 0
      // 048: getfield _6b.z2d Ljava/util/Random;
      // 04b: invokevirtual java/util/Random.nextFloat ()F
      // 04e: ldc 0.2
      // 050: nop
      // 051: fmul
      // 052: fadd
      // 053: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 056: aload 0
      // 057: getfield _6b.oay Lt9d;
      // 05a: aload 0
      // 05b: getfield _6b.o2v D
      // 05e: aload 0
      // 05f: getfield _6b.kfp D
      // 062: aload 0
      // 063: getfield _6b.vbd D
      // 066: sipush 26187
      // 069: ldc2_w 2705818347800615145
      // 06c: lload 1
      // 06d: lxor
      // 06e: invokedynamic d (IJ)Ljava/lang/String; bsm=_6b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: fconst_2
      // 075: ldc 0.5
      // 077: nop
      // 078: aload 0
      // 079: getfield _6b.z2d Ljava/util/Random;
      // 07c: invokevirtual java/util/Random.nextFloat ()F
      // 07f: ldc 0.2
      // 081: nop
      // 082: fmul
      // 083: fadd
      // 084: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 087: goto 08e
      // 08a: invokestatic _6b.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: dup
      // 090: getfield _6b.ouj I
      // 093: bipush 1
      // 094: isub
      // 095: putfield _6b.ouj I
      // 098: aload 0
      // 099: getfield _6b.ouj I
      // 09c: iload 3
      // 09d: ifne 1e0
      // 0a0: ifge 1dc
      // 0a3: goto 0aa
      // 0a6: invokestatic _6b.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield _6b.cf8 I
      // 0ae: iload 3
      // 0af: ifne 0dd
      // 0b2: goto 0b9
      // 0b5: invokestatic _6b.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: ifne 0d2
      // 0bc: goto 0c3
      // 0bf: invokestatic _6b.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: invokevirtual _6b._kl ()V
      // 0c7: iload 3
      // 0c8: ifeq 1dc
      // 0cb: goto 0d2
      // 0ce: invokestatic _6b.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield _6b.ouj I
      // 0d6: goto 0dd
      // 0d9: invokestatic _6b.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: iload 3
      // 0de: ifne 1e0
      // 0e1: aload 0
      // 0e2: getfield _6b.z2d Ljava/util/Random;
      // 0e5: bipush 10
      // 0e7: invokevirtual java/util/Random.nextInt (I)I
      // 0ea: ineg
      // 0eb: if_icmpge 1dc
      // 0ee: goto 0f5
      // 0f1: invokestatic _6b.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: dup
      // 0f7: getfield _6b.cf8 I
      // 0fa: bipush 1
      // 0fb: isub
      // 0fc: putfield _6b.cf8 I
      // 0ff: aload 0
      // 100: bipush 1
      // 101: putfield _6b.ouj I
      // 104: aload 0
      // 105: aload 0
      // 106: getfield _6b.z2d Ljava/util/Random;
      // 109: invokevirtual java/util/Random.nextLong ()J
      // 10c: putfield _6b._ud J
      // 10f: new mew
      // 112: dup
      // 113: aload 0
      // 114: invokespecial mew.<init> (Li2h;)V
      // 117: astore 4
      // 119: aload 0
      // 11a: getfield _6b.oay Lt9d;
      // 11d: getfield OpaquePredicate.v0f Z
      // 120: iload 3
      // 121: ifne 1e0
      // 124: ifne 1dc
      // 127: goto 12e
      // 12a: invokestatic _6b.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield _6b.oay Lt9d;
      // 132: invokevirtual OpaquePredicate.eir ()Lef9;
      // 135: sipush 27128
      // 138: ldc2_w 7226860730932549464
      // 13b: lload 1
      // 13c: lxor
      // 13d: invokedynamic d (IJ)Ljava/lang/String; bsm=_6b.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: nop
      // 143: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 146: iload 3
      // 147: ifne 1e0
      // 14a: goto 151
      // 14d: invokestatic _6b.a (Loov;)Loov;
      // 150: athrow
      // 151: ifeq 1dc
      // 154: goto 15b
      // 157: invokestatic _6b.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: getfield _6b.oay Lt9d;
      // 15f: aload 4
      // 161: bipush 10
      // 163: invokevirtual OpaquePredicate.hrj (Lmew;I)Z
      // 166: iload 3
      // 167: ifne 1e0
      // 16a: goto 171
      // 16d: invokestatic _6b.a (Loov;)Loov;
      // 170: athrow
      // 171: ifeq 1dc
      // 174: goto 17b
      // 177: invokestatic _6b.a (Loov;)Loov;
      // 17a: athrow
      // 17b: aload 0
      // 17c: iload 3
      // 17d: ifne 1dd
      // 180: goto 187
      // 183: invokestatic _6b.a (Loov;)Loov;
      // 186: athrow
      // 187: getfield _6b.oay Lt9d;
      // 18a: aload 4
      // 18c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 18f: invokeinterface zfz.r_y ()Le0x; 1
      // 194: invokevirtual e0x.p1r ()Lp3y;
      // 197: getstatic p3y.cei Lp3y;
      // 19a: if_acmpne 1dc
      // 19d: goto 1a4
      // 1a0: invokestatic _6b.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: getstatic ox_._0u Lwuo;
      // 1a7: aload 0
      // 1a8: getfield _6b.oay Lt9d;
      // 1ab: aload 4
      // 1ad: invokevirtual wuo.ctq (Lt9d;Lmew;)Z
      // 1b0: iload 3
      // 1b1: ifne 1e0
      // 1b4: goto 1bb
      // 1b7: invokestatic _6b.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: ifeq 1dc
      // 1be: goto 1c5
      // 1c1: invokestatic _6b.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: getfield _6b.oay Lt9d;
      // 1c9: aload 4
      // 1cb: getstatic ox_._0u Lwuo;
      // 1ce: invokevirtual wuo.l4i ()Lzfz;
      // 1d1: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 1d4: pop
      // 1d5: goto 1dc
      // 1d8: invokestatic _6b.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield _6b.ouj I
      // 1e0: iload 3
      // 1e1: ifne 207
      // 1e4: iflt 28b
      // 1e7: goto 1ee
      // 1ea: invokestatic _6b.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: getfield _6b.oay Lt9d;
      // 1f2: iload 3
      // 1f3: ifne 215
      // 1f6: goto 1fd
      // 1f9: invokestatic _6b.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: getfield OpaquePredicate.v0f Z
      // 200: goto 207
      // 203: invokestatic _6b.a (Loov;)Loov;
      // 206: athrow
      // 207: ifeq 21d
      // 20a: aload 0
      // 20b: getfield _6b.oay Lt9d;
      // 20e: goto 215
      // 211: invokestatic _6b.a (Loov;)Loov;
      // 214: athrow
      // 215: bipush 2
      // 216: invokevirtual OpaquePredicate.wj6 (I)V
      // 219: iload 3
      // 21a: ifeq 28b
      // 21d: ldc2_w 3.0
      // 220: dstore 4
      // 222: aload 0
      // 223: getfield _6b.oay Lt9d;
      // 226: aload 0
      // 227: new nh4
      // 22a: dup
      // 22b: aload 0
      // 22c: getfield _6b.o2v D
      // 22f: dload 4
      // 231: dsub
      // 232: aload 0
      // 233: getfield _6b.kfp D
      // 236: dload 4
      // 238: dsub
      // 239: aload 0
      // 23a: getfield _6b.vbd D
      // 23d: dload 4
      // 23f: dsub
      // 240: aload 0
      // 241: getfield _6b.o2v D
      // 244: dload 4
      // 246: dadd
      // 247: aload 0
      // 248: getfield _6b.kfp D
      // 24b: ldc2_w 6.0
      // 24e: dadd
      // 24f: dload 4
      // 251: dadd
      // 252: aload 0
      // 253: getfield _6b.vbd D
      // 256: dload 4
      // 258: dadd
      // 259: invokespecial nh4.<init> (DDDDDD)V
      // 25c: invokevirtual OpaquePredicate.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 25f: astore 6
      // 261: bipush 0
      // 262: istore 7
      // 264: iload 7
      // 266: aload 6
      // 268: invokeinterface java/util/List.size ()I 1
      // 26d: if_icmpge 28b
      // 270: aload 6
      // 272: iload 7
      // 274: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 279: checkcast EntityLivingBase
      // 27c: astore 8
      // 27e: aload 8
      // 280: aload 0
      // 281: invokevirtual EntityLivingBase.nzg (L_6b;)V
      // 284: iinc 7 1
      // 287: iload 3
      // 288: ifeq 264
      // 28b: return
   }

   @Override
   public void tbj() {
   }

   @Override
   public void cjb(bdo var1) {
   }

   @Override
   public void srs(bdo var1) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5842754658894085146L, -3135254021302127923L, MethodHandles.lookup().lookupClass()).a(150133361067298L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 138430583462299L;
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
      String var6 = "Ú!xÝ%3ðß[q\u000b}T<û$M'ÌiF\u001aÃ\u009e°Ù\u0005@à]â\u001a\u0098´TT>>\rÏ  A\u0002¦µ·!ß&öVÆ¾\u0086ö¾Ñ7\u0091Jì¼_Ò¯µ![>\u0090\u008bè";
      int var8 = "Ú!xÝ%3ðß[q\u000b}T<û$M'ÌiF\u001aÃ\u009e°Ù\u0005@à]â\u001a\u0098´TT>>\rÏ  A\u0002¦µ·!ß&öVÆ¾\u0086ö¾Ñ7\u0091Jì¼_Ò¯µ![>\u0090\u008bè".length();
      char var5 = '(';
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
                     d = new String[4];
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

                  var6 = "e#Ç\u0007Q+Á\\\u008a¶=6y\u00ad+'\u0087²\u008cmN\u0013*_ \u0001x\u0015¢Öµi;/vé\u0099ÐlbT\u009d¥\u009buPC\u0015 »&\u0097½´\u0006 \u0016";
                  var8 = "e#Ç\u0007Q+Á\\\u008a¶=6y\u00ad+'\u0087²\u008cmN\u0013*_ \u0001x\u0015¢Öµi;/vé\u0099ÐlbT\u009d¥\u009buPC\u0015 »&\u0097½´\u0006 \u0016"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9187;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("_6b", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("_6b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
