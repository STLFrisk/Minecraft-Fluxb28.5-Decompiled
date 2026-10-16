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

public class cia extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 60379696497773L;
      return b<"i">(25259, 2561486278331493973L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 61660661012715L;
      return b<"i">(29981, 46853421662283130L ^ var2);
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
      // 000: getstatic cia.a J
      // 003: ldc2_w 55978516377896
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 9
      // 011: if_icmpge 032
      // 014: new w57
      // 017: dup
      // 018: sipush 31940
      // 01b: ldc2_w 4602136334850884964
      // 01e: lload 3
      // 01f: lxor
      // 020: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: nop
      // 026: bipush 0
      // 027: anewarray 39
      // 02a: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02d: athrow
      // 02e: invokestatic cia.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 1
      // 033: getstatic n_k$pbp.f1s Ln_k$pbp;
      // 036: bipush 0
      // 037: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 03c: aload 1
      // 03d: aload 2
      // 03e: bipush 0
      // 03f: bipush 0
      // 040: invokestatic cia.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 043: astore 6
      // 045: aload 1
      // 046: aload 2
      // 047: bipush 3
      // 048: bipush 0
      // 049: invokestatic cia.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 04c: astore 7
      // 04e: aload 1
      // 04f: aload 2
      // 050: bipush 6
      // 052: bipush 0
      // 053: invokestatic cia.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 056: astore 8
      // 058: new yve
      // 05b: dup
      // 05c: aload 6
      // 05e: aload 7
      // 060: invokespecial yve.<init> (Lwgo;Lwgo;)V
      // 063: astore 9
      // 065: new yve
      // 068: dup
      // 069: aload 8
      // 06b: aload 8
      // 06d: aload 9
      // 06f: invokevirtual yve.mtu ()Lwgo;
      // 072: invokevirtual mew.m2c (Lwgo;)Lmew;
      // 075: invokespecial yve.<init> (Lwgo;Lwgo;)V
      // 078: astore 10
      // 07a: aload 9
      // 07c: invokevirtual yve.num ()I
      // 07f: aload 9
      // 081: invokevirtual yve.v8b ()I
      // 084: imul
      // 085: aload 9
      // 087: invokevirtual yve.ut6 ()I
      // 08a: imul
      // 08b: istore 11
      // 08d: iload 11
      // 08f: iload 5
      // 091: ifeq 0d1
      // 094: ldc 32768
      // 096: nop
      // 097: if_icmple 0d0
      // 09a: goto 0a1
      // 09d: invokestatic cia.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: new uvb
      // 0a4: dup
      // 0a5: sipush 3042
      // 0a8: ldc2_w 5925143872723186253
      // 0ab: lload 3
      // 0ac: lxor
      // 0ad: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: bipush 2
      // 0b4: anewarray 39
      // 0b7: dup
      // 0b8: bipush 0
      // 0b9: iload 11
      // 0bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0be: aastore
      // 0bf: dup
      // 0c0: bipush 1
      // 0c1: ldc 32768
      // 0c3: nop
      // 0c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c7: aastore
      // 0c8: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0cb: athrow
      // 0cc: invokestatic cia.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: bipush 0
      // 0d1: istore 12
      // 0d3: aconst_null
      // 0d4: astore 13
      // 0d6: bipush -1
      // 0d7: istore 14
      // 0d9: aload 2
      // 0da: arraylength
      // 0db: iload 5
      // 0dd: ifeq 150
      // 0e0: bipush 11
      // 0e2: if_icmplt 142
      // 0e5: goto 0ec
      // 0e8: invokestatic cia.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 2
      // 0ed: bipush 10
      // 0ef: aaload
      // 0f0: sipush 13504
      // 0f3: ldc2_w 3230780499139448169
      // 0f6: lload 3
      // 0f7: lxor
      // 0f8: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: nop
      // 0fe: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 101: iload 5
      // 103: ifeq 17f
      // 106: goto 10d
      // 109: invokestatic cia.a (Loov;)Loov;
      // 10c: athrow
      // 10d: ifne 17d
      // 110: goto 117
      // 113: invokestatic cia.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 2
      // 118: bipush 10
      // 11a: aaload
      // 11b: sipush 2128
      // 11e: ldc2_w 524266778821751286
      // 121: lload 3
      // 122: lxor
      // 123: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: nop
      // 129: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12c: iload 5
      // 12e: ifeq 17f
      // 131: goto 138
      // 134: invokestatic cia.a (Loov;)Loov;
      // 137: athrow
      // 138: ifne 17d
      // 13b: goto 142
      // 13e: invokestatic cia.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 9
      // 144: aload 10
      // 146: invokevirtual yve.fsa (Lyve;)Z
      // 149: goto 150
      // 14c: invokestatic cia.a (Loov;)Loov;
      // 14f: athrow
      // 150: iload 5
      // 152: ifeq 17f
      // 155: ifeq 17d
      // 158: goto 15f
      // 15b: invokestatic cia.a (Loov;)Loov;
      // 15e: athrow
      // 15f: new uvb
      // 162: dup
      // 163: sipush 22646
      // 166: ldc2_w 5985833327008555480
      // 169: lload 3
      // 16a: lxor
      // 16b: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: nop
      // 171: bipush 0
      // 172: anewarray 39
      // 175: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 178: athrow
      // 179: invokestatic cia.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 2
      // 17e: arraylength
      // 17f: iload 5
      // 181: ifeq 1c3
      // 184: bipush 11
      // 186: if_icmplt 1be
      // 189: goto 190
      // 18c: invokestatic cia.a (Loov;)Loov;
      // 18f: athrow
      // 190: aload 2
      // 191: bipush 10
      // 193: aaload
      // 194: sipush 2128
      // 197: ldc2_w 524266778821751286
      // 19a: lload 3
      // 19b: lxor
      // 19c: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a5: iload 5
      // 1a7: ifeq 1c3
      // 1aa: goto 1b1
      // 1ad: invokestatic cia.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: ifeq 1be
      // 1b4: goto 1bb
      // 1b7: invokestatic cia.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: bipush 1
      // 1bc: istore 12
      // 1be: aload 9
      // 1c0: getfield yve._3o I
      // 1c3: iload 5
      // 1c5: ifeq 1de
      // 1c8: iflt 8b3
      // 1cb: goto 1d2
      // 1ce: invokestatic cia.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: aload 9
      // 1d4: getfield yve.ixv I
      // 1d7: goto 1de
      // 1da: invokestatic cia.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: iload 5
      // 1e0: ifeq 1fc
      // 1e3: sipush 256
      // 1e6: if_icmpge 8b3
      // 1e9: goto 1f0
      // 1ec: invokestatic cia.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 10
      // 1f2: getfield yve._3o I
      // 1f5: goto 1fc
      // 1f8: invokestatic cia.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: iload 5
      // 1fe: ifeq 217
      // 201: iflt 8b3
      // 204: goto 20b
      // 207: invokestatic cia.a (Loov;)Loov;
      // 20a: athrow
      // 20b: aload 10
      // 20d: getfield yve.ixv I
      // 210: goto 217
      // 213: invokestatic cia.a (Loov;)Loov;
      // 216: athrow
      // 217: sipush 256
      // 21a: if_icmpge 8b3
      // 21d: aload 1
      // 21e: invokeinterface e7r.qha ()Lt9d; 1
      // 223: astore 15
      // 225: aload 15
      // 227: aload 9
      // 229: invokevirtual OpaquePredicate.zz0 (Lyve;)Z
      // 22c: iload 5
      // 22e: ifeq 249
      // 231: ifeq 896
      // 234: goto 23b
      // 237: invokestatic cia.a (Loov;)Loov;
      // 23a: athrow
      // 23b: aload 15
      // 23d: aload 10
      // 23f: invokevirtual OpaquePredicate.zz0 (Lyve;)Z
      // 242: goto 249
      // 245: invokestatic cia.a (Loov;)Loov;
      // 248: athrow
      // 249: iload 5
      // 24b: ifeq 259
      // 24e: ifeq 896
      // 251: goto 258
      // 254: invokestatic cia.a (Loov;)Loov;
      // 257: athrow
      // 258: bipush 0
      // 259: istore 16
      // 25b: aload 2
      // 25c: arraylength
      // 25d: iload 5
      // 25f: ifeq 28a
      // 262: bipush 10
      // 264: if_icmplt 328
      // 267: goto 26e
      // 26a: invokestatic cia.a (Loov;)Loov;
      // 26d: athrow
      // 26e: aload 2
      // 26f: bipush 9
      // 271: aaload
      // 272: sipush 18394
      // 275: ldc2_w 7186715236860280440
      // 278: lload 3
      // 279: lxor
      // 27a: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: nop
      // 280: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 283: goto 28a
      // 286: invokestatic cia.a (Loov;)Loov;
      // 289: athrow
      // 28a: iload 5
      // 28c: ifeq 2bd
      // 28f: ifeq 2a1
      // 292: goto 299
      // 295: invokestatic cia.a (Loov;)Loov;
      // 298: athrow
      // 299: bipush 1
      // 29a: istore 16
      // 29c: iload 5
      // 29e: ifne 328
      // 2a1: aload 2
      // 2a2: bipush 9
      // 2a4: aaload
      // 2a5: sipush 21056
      // 2a8: ldc2_w 8156957092242828268
      // 2ab: lload 3
      // 2ac: lxor
      // 2ad: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: nop
      // 2b3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b6: goto 2bd
      // 2b9: invokestatic cia.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: iload 5
      // 2bf: ifeq 2d5
      // 2c2: ifeq 328
      // 2c5: goto 2cc
      // 2c8: invokestatic cia.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 2
      // 2cd: arraylength
      // 2ce: goto 2d5
      // 2d1: invokestatic cia.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: bipush 12
      // 2d7: if_icmpge 2f8
      // 2da: new w57
      // 2dd: dup
      // 2de: sipush 31940
      // 2e1: ldc2_w 4602136334850884964
      // 2e4: lload 3
      // 2e5: lxor
      // 2e6: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: nop
      // 2ec: bipush 0
      // 2ed: anewarray 39
      // 2f0: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 2f3: athrow
      // 2f4: invokestatic cia.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: aload 1
      // 2f9: aload 2
      // 2fa: bipush 11
      // 2fc: aaload
      // 2fd: invokestatic cia.dde (Le7r;Ljava/lang/String;)Le0x;
      // 300: astore 13
      // 302: aload 2
      // 303: arraylength
      // 304: iload 5
      // 306: ifeq 326
      // 309: bipush 13
      // 30b: if_icmplt 328
      // 30e: goto 315
      // 311: invokestatic cia.a (Loov;)Loov;
      // 314: athrow
      // 315: aload 2
      // 316: bipush 12
      // 318: aaload
      // 319: bipush 0
      // 31a: bipush 15
      // 31c: invokestatic cia.fzm (Ljava/lang/String;II)I
      // 31f: goto 326
      // 322: invokestatic cia.a (Loov;)Loov;
      // 325: athrow
      // 326: istore 14
      // 328: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 32b: astore 17
      // 32d: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 330: astore 18
      // 332: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 335: astore 19
      // 337: invokestatic com/google/common/collect/Lists.newLinkedList ()Ljava/util/LinkedList;
      // 33a: astore 20
      // 33c: new mew
      // 33f: dup
      // 340: aload 10
      // 342: getfield yve.gdj I
      // 345: aload 9
      // 347: getfield yve.gdj I
      // 34a: isub
      // 34b: aload 10
      // 34d: getfield yve._3o I
      // 350: aload 9
      // 352: getfield yve._3o I
      // 355: isub
      // 356: aload 10
      // 358: getfield yve.ob0 I
      // 35b: aload 9
      // 35d: getfield yve.ob0 I
      // 360: isub
      // 361: invokespecial mew.<init> (III)V
      // 364: astore 21
      // 366: aload 9
      // 368: getfield yve.ob0 I
      // 36b: istore 22
      // 36d: iload 22
      // 36f: aload 9
      // 371: getfield yve.nwc I
      // 374: if_icmpgt 52f
      // 377: aload 9
      // 379: getfield yve._3o I
      // 37c: iload 5
      // 37e: ifeq 531
      // 381: istore 23
      // 383: iload 23
      // 385: aload 9
      // 387: getfield yve.ixv I
      // 38a: if_icmpgt 527
      // 38d: aload 9
      // 38f: getfield yve.gdj I
      // 392: iload 5
      // 394: ifeq 36f
      // 397: istore 24
      // 399: iload 24
      // 39b: aload 9
      // 39d: getfield yve.kwp I
      // 3a0: if_icmpgt 51f
      // 3a3: new mew
      // 3a6: dup
      // 3a7: iload 24
      // 3a9: iload 23
      // 3ab: iload 22
      // 3ad: invokespecial mew.<init> (III)V
      // 3b0: astore 25
      // 3b2: aload 25
      // 3b4: aload 21
      // 3b6: invokevirtual mew.m2c (Lwgo;)Lmew;
      // 3b9: astore 26
      // 3bb: aload 15
      // 3bd: aload 25
      // 3bf: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3c2: astore 27
      // 3c4: iload 16
      // 3c6: iload 5
      // 3c8: ifeq 385
      // 3cb: ifeq 3ee
      // 3ce: aload 27
      // 3d0: invokeinterface zfz.r_y ()Le0x; 1
      // 3d5: iload 5
      // 3d7: ifeq 3f7
      // 3da: goto 3e1
      // 3dd: invokestatic cia.a (Loov;)Loov;
      // 3e0: athrow
      // 3e1: getstatic ox_.ibw Le0x;
      // 3e4: if_acmpeq 517
      // 3e7: goto 3ee
      // 3ea: invokestatic cia.a (Loov;)Loov;
      // 3ed: athrow
      // 3ee: aload 13
      // 3f0: goto 3f7
      // 3f3: invokestatic cia.a (Loov;)Loov;
      // 3f6: athrow
      // 3f7: iload 5
      // 3f9: ifeq 414
      // 3fc: ifnull 449
      // 3ff: goto 406
      // 402: invokestatic cia.a (Loov;)Loov;
      // 405: athrow
      // 406: aload 27
      // 408: invokeinterface zfz.r_y ()Le0x; 1
      // 40d: goto 414
      // 410: invokestatic cia.a (Loov;)Loov;
      // 413: athrow
      // 414: aload 13
      // 416: if_acmpne 517
      // 419: iload 14
      // 41b: iload 5
      // 41d: ifeq 444
      // 420: goto 427
      // 423: invokestatic cia.a (Loov;)Loov;
      // 426: athrow
      // 427: iflt 449
      // 42a: goto 431
      // 42d: invokestatic cia.a (Loov;)Loov;
      // 430: athrow
      // 431: aload 27
      // 433: invokeinterface zfz.r_y ()Le0x; 1
      // 438: aload 27
      // 43a: invokevirtual e0x.hvp (Lzfz;)I
      // 43d: goto 444
      // 440: invokestatic cia.a (Loov;)Loov;
      // 443: athrow
      // 444: iload 14
      // 446: if_icmpne 517
      // 449: aload 15
      // 44b: aload 25
      // 44d: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 450: astore 28
      // 452: aload 28
      // 454: ifnull 488
      // 457: new bdo
      // 45a: dup
      // 45b: invokespecial bdo.<init> ()V
      // 45e: astore 29
      // 460: aload 28
      // 462: aload 29
      // 464: invokevirtual pyk.m2a (Lbdo;)V
      // 467: aload 18
      // 469: new cia$trw
      // 46c: dup
      // 46d: aload 26
      // 46f: aload 27
      // 471: aload 29
      // 473: invokespecial cia$trw.<init> (Lmew;Lzfz;Lbdo;)V
      // 476: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 47b: pop
      // 47c: aload 20
      // 47e: aload 25
      // 480: invokevirtual java/util/LinkedList.addLast (Ljava/lang/Object;)V
      // 483: iload 5
      // 485: ifne 517
      // 488: aload 27
      // 48a: invokeinterface zfz.r_y ()Le0x; 1
      // 48f: invokevirtual e0x.z4c ()Z
      // 492: iload 5
      // 494: ifeq 50f
      // 497: goto 49e
      // 49a: invokestatic cia.a (Loov;)Loov;
      // 49d: athrow
      // 49e: ifne 4f2
      // 4a1: goto 4a8
      // 4a4: invokestatic cia.a (Loov;)Loov;
      // 4a7: athrow
      // 4a8: aload 27
      // 4aa: invokeinterface zfz.r_y ()Le0x; 1
      // 4af: invokevirtual e0x.gck ()Z
      // 4b2: iload 5
      // 4b4: ifeq 50f
      // 4b7: goto 4be
      // 4ba: invokestatic cia.a (Loov;)Loov;
      // 4bd: athrow
      // 4be: ifne 4f2
      // 4c1: goto 4c8
      // 4c4: invokestatic cia.a (Loov;)Loov;
      // 4c7: athrow
      // 4c8: aload 19
      // 4ca: new cia$trw
      // 4cd: dup
      // 4ce: aload 26
      // 4d0: aload 27
      // 4d2: aconst_null
      // 4d3: checkcast bdo
      // 4d6: invokespecial cia$trw.<init> (Lmew;Lzfz;Lbdo;)V
      // 4d9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4de: pop
      // 4df: aload 20
      // 4e1: aload 25
      // 4e3: invokevirtual java/util/LinkedList.addFirst (Ljava/lang/Object;)V
      // 4e6: iload 5
      // 4e8: ifne 517
      // 4eb: goto 4f2
      // 4ee: invokestatic cia.a (Loov;)Loov;
      // 4f1: athrow
      // 4f2: aload 17
      // 4f4: new cia$trw
      // 4f7: dup
      // 4f8: aload 26
      // 4fa: aload 27
      // 4fc: aconst_null
      // 4fd: checkcast bdo
      // 500: invokespecial cia$trw.<init> (Lmew;Lzfz;Lbdo;)V
      // 503: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 508: goto 50f
      // 50b: invokestatic cia.a (Loov;)Loov;
      // 50e: athrow
      // 50f: pop
      // 510: aload 20
      // 512: aload 25
      // 514: invokevirtual java/util/LinkedList.addLast (Ljava/lang/Object;)V
      // 517: iinc 24 1
      // 51a: iload 5
      // 51c: ifne 399
      // 51f: iinc 23 1
      // 522: iload 5
      // 524: ifne 383
      // 527: iinc 22 1
      // 52a: iload 5
      // 52c: ifne 36d
      // 52f: iload 12
      // 531: ifeq 5d0
      // 534: aload 20
      // 536: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
      // 539: astore 22
      // 53b: aload 22
      // 53d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 542: ifeq 59f
      // 545: aload 22
      // 547: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54c: checkcast mew
      // 54f: astore 23
      // 551: aload 15
      // 553: aload 23
      // 555: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 558: astore 24
      // 55a: aload 24
      // 55c: instanceof rsi
      // 55f: iload 5
      // 561: ifeq 5ad
      // 564: iload 5
      // 566: ifeq 599
      // 569: goto 570
      // 56c: invokestatic cia.a (Loov;)Loov;
      // 56f: athrow
      // 570: ifeq 58b
      // 573: goto 57a
      // 576: invokestatic cia.a (Loov;)Loov;
      // 579: athrow
      // 57a: aload 24
      // 57c: checkcast rsi
      // 57f: invokeinterface rsi.nec ()V 1
      // 584: goto 58b
      // 587: invokestatic cia.a (Loov;)Loov;
      // 58a: athrow
      // 58b: aload 15
      // 58d: aload 23
      // 58f: getstatic ox_.c28 Le0x;
      // 592: invokevirtual e0x.l4i ()Lzfz;
      // 595: bipush 2
      // 596: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 599: pop
      // 59a: iload 5
      // 59c: ifne 53b
      // 59f: aload 20
      // 5a1: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
      // 5a4: astore 22
      // 5a6: aload 22
      // 5a8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5ad: ifeq 5d0
      // 5b0: aload 22
      // 5b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5b7: checkcast mew
      // 5ba: astore 23
      // 5bc: aload 15
      // 5be: aload 23
      // 5c0: getstatic ox_.ibw Le0x;
      // 5c3: invokevirtual e0x.l4i ()Lzfz;
      // 5c6: bipush 3
      // 5c7: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 5ca: pop
      // 5cb: iload 5
      // 5cd: ifne 5a6
      // 5d0: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 5d3: astore 22
      // 5d5: aload 22
      // 5d7: aload 17
      // 5d9: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 5de: pop
      // 5df: aload 22
      // 5e1: aload 18
      // 5e3: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 5e8: pop
      // 5e9: aload 22
      // 5eb: aload 19
      // 5ed: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 5f2: pop
      // 5f3: aload 22
      // 5f5: invokestatic com/google/common/collect/Lists.reverse (Ljava/util/List;)Ljava/util/List;
      // 5f8: astore 23
      // 5fa: aload 23
      // 5fc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 601: astore 24
      // 603: aload 24
      // 605: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 60a: ifeq 66d
      // 60d: aload 24
      // 60f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 614: checkcast cia$trw
      // 617: astore 25
      // 619: aload 15
      // 61b: aload 25
      // 61d: getfield cia$trw.iqu Lmew;
      // 620: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 623: astore 26
      // 625: aload 26
      // 627: instanceof rsi
      // 62a: iload 5
      // 62c: ifeq 66e
      // 62f: iload 5
      // 631: ifeq 667
      // 634: goto 63b
      // 637: invokestatic cia.a (Loov;)Loov;
      // 63a: athrow
      // 63b: ifeq 656
      // 63e: goto 645
      // 641: invokestatic cia.a (Loov;)Loov;
      // 644: athrow
      // 645: aload 26
      // 647: checkcast rsi
      // 64a: invokeinterface rsi.nec ()V 1
      // 64f: goto 656
      // 652: invokestatic cia.a (Loov;)Loov;
      // 655: athrow
      // 656: aload 15
      // 658: aload 25
      // 65a: getfield cia$trw.iqu Lmew;
      // 65d: getstatic ox_.c28 Le0x;
      // 660: invokevirtual e0x.l4i ()Lzfz;
      // 663: bipush 2
      // 664: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 667: pop
      // 668: iload 5
      // 66a: ifne 603
      // 66d: bipush 0
      // 66e: istore 11
      // 670: aload 22
      // 672: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 677: astore 24
      // 679: aload 24
      // 67b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 680: ifeq 6b6
      // 683: aload 24
      // 685: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 68a: checkcast cia$trw
      // 68d: astore 25
      // 68f: aload 15
      // 691: aload 25
      // 693: getfield cia$trw.iqu Lmew;
      // 696: aload 25
      // 698: getfield cia$trw.l6n Lzfz;
      // 69b: bipush 2
      // 69c: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 69f: iload 5
      // 6a1: ifeq 6c6
      // 6a4: ifeq 6b1
      // 6a7: goto 6ae
      // 6aa: invokestatic cia.a (Loov;)Loov;
      // 6ad: athrow
      // 6ae: iinc 11 1
      // 6b1: iload 5
      // 6b3: ifne 679
      // 6b6: aload 18
      // 6b8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 6bd: astore 24
      // 6bf: aload 24
      // 6c1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6c6: ifeq 77e
      // 6c9: aload 24
      // 6cb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6d0: checkcast cia$trw
      // 6d3: astore 25
      // 6d5: aload 15
      // 6d7: aload 25
      // 6d9: getfield cia$trw.iqu Lmew;
      // 6dc: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 6df: astore 26
      // 6e1: iload 5
      // 6e3: ifeq 779
      // 6e6: aload 25
      // 6e8: getfield cia$trw.d28 Lbdo;
      // 6eb: iload 5
      // 6ed: ifeq 798
      // 6f0: goto 6f7
      // 6f3: invokestatic cia.a (Loov;)Loov;
      // 6f6: athrow
      // 6f7: ifnull 768
      // 6fa: goto 701
      // 6fd: invokestatic cia.a (Loov;)Loov;
      // 700: athrow
      // 701: aload 26
      // 703: iload 5
      // 705: ifeq 765
      // 708: goto 70f
      // 70b: invokestatic cia.a (Loov;)Loov;
      // 70e: athrow
      // 70f: ifnull 768
      // 712: goto 719
      // 715: invokestatic cia.a (Loov;)Loov;
      // 718: athrow
      // 719: aload 25
      // 71b: getfield cia$trw.d28 Lbdo;
      // 71e: ldc "x"
      // 720: nop
      // 721: aload 25
      // 723: getfield cia$trw.iqu Lmew;
      // 726: invokevirtual mew.getX ()I
      // 729: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 72c: aload 25
      // 72e: getfield cia$trw.d28 Lbdo;
      // 731: ldc "y"
      // 733: nop
      // 734: aload 25
      // 736: getfield cia$trw.iqu Lmew;
      // 739: invokevirtual mew.getY ()I
      // 73c: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 73f: aload 25
      // 741: getfield cia$trw.d28 Lbdo;
      // 744: ldc "z"
      // 746: nop
      // 747: aload 25
      // 749: getfield cia$trw.iqu Lmew;
      // 74c: invokevirtual mew.getZ ()I
      // 74f: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 752: aload 26
      // 754: aload 25
      // 756: getfield cia$trw.d28 Lbdo;
      // 759: invokevirtual pyk.agl (Lbdo;)V
      // 75c: aload 26
      // 75e: goto 765
      // 761: invokestatic cia.a (Loov;)Loov;
      // 764: athrow
      // 765: invokevirtual pyk.r5t ()V
      // 768: aload 15
      // 76a: aload 25
      // 76c: getfield cia$trw.iqu Lmew;
      // 76f: aload 25
      // 771: getfield cia$trw.l6n Lzfz;
      // 774: bipush 2
      // 775: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 778: pop
      // 779: iload 5
      // 77b: ifne 6bf
      // 77e: aload 23
      // 780: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 785: astore 24
      // 787: aload 24
      // 789: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 78e: ifeq 7c2
      // 791: aload 24
      // 793: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 798: checkcast cia$trw
      // 79b: astore 25
      // 79d: aload 15
      // 79f: iload 5
      // 7a1: ifeq 7c4
      // 7a4: aload 25
      // 7a6: getfield cia$trw.iqu Lmew;
      // 7a9: aload 25
      // 7ab: getfield cia$trw.l6n Lzfz;
      // 7ae: invokeinterface zfz.r_y ()Le0x; 1
      // 7b3: invokevirtual OpaquePredicate.cdo (Lmew;Le0x;)V
      // 7b6: iload 5
      // 7b8: ifne 787
      // 7bb: goto 7c2
      // 7be: invokestatic cia.a (Loov;)Loov;
      // 7c1: athrow
      // 7c2: aload 15
      // 7c4: aload 9
      // 7c6: bipush 0
      // 7c7: invokevirtual OpaquePredicate.m9p (Lyve;Z)Ljava/util/List;
      // 7ca: astore 24
      // 7cc: aload 24
      // 7ce: iload 5
      // 7d0: ifeq 7df
      // 7d3: ifnull 846
      // 7d6: goto 7dd
      // 7d9: invokestatic cia.a (Loov;)Loov;
      // 7dc: athrow
      // 7dd: aload 24
      // 7df: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 7e4: astore 25
      // 7e6: aload 25
      // 7e8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7ed: ifeq 846
      // 7f0: aload 25
      // 7f2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7f7: checkcast rty
      // 7fa: astore 26
      // 7fc: aload 9
      // 7fe: aload 26
      // 800: getfield rty.weq Lmew;
      // 803: invokevirtual yve.vwy (Lwgo;)Z
      // 806: iload 5
      // 808: ifeq 848
      // 80b: ifeq 841
      // 80e: goto 815
      // 811: invokestatic cia.a (Loov;)Loov;
      // 814: athrow
      // 815: aload 26
      // 817: getfield rty.weq Lmew;
      // 81a: aload 21
      // 81c: invokevirtual mew.m2c (Lwgo;)Lmew;
      // 81f: astore 27
      // 821: aload 15
      // 823: aload 27
      // 825: aload 26
      // 827: invokevirtual rty.qny ()Le0x;
      // 82a: aload 26
      // 82c: getfield rty.pjb J
      // 82f: aload 15
      // 831: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 834: invokevirtual cog.zex ()J
      // 837: lsub
      // 838: l2i
      // 839: aload 26
      // 83b: getfield rty.afq I
      // 83e: invokevirtual OpaquePredicate.jf5 (Lmew;Le0x;II)V
      // 841: iload 5
      // 843: ifne 7e6
      // 846: iload 11
      // 848: ifgt 869
      // 84b: new uvb
      // 84e: dup
      // 84f: sipush 8713
      // 852: ldc2_w 7653908488494832554
      // 855: lload 3
      // 856: lxor
      // 857: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85c: nop
      // 85d: bipush 0
      // 85e: anewarray 39
      // 861: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 864: athrow
      // 865: invokestatic cia.a (Loov;)Loov;
      // 868: athrow
      // 869: aload 1
      // 86a: getstatic n_k$pbp.f1s Ln_k$pbp;
      // 86d: iload 11
      // 86f: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 874: aload 1
      // 875: aload 0
      // 876: sipush 20089
      // 879: ldc2_w 8830809137555388355
      // 87c: lload 3
      // 87d: lxor
      // 87e: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 883: nop
      // 884: bipush 1
      // 885: anewarray 39
      // 888: dup
      // 889: bipush 0
      // 88a: iload 11
      // 88c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 88f: aastore
      // 890: invokestatic cia.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 893: goto 8b0
      // 896: new uvb
      // 899: dup
      // 89a: sipush 29366
      // 89d: ldc2_w 1238997406695721758
      // 8a0: lload 3
      // 8a1: lxor
      // 8a2: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a7: nop
      // 8a8: bipush 0
      // 8a9: anewarray 39
      // 8ac: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 8af: athrow
      // 8b0: goto 8cd
      // 8b3: new uvb
      // 8b6: dup
      // 8b7: sipush 15446
      // 8ba: ldc2_w 2862948851585500655
      // 8bd: lload 3
      // 8be: lxor
      // 8bf: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c4: nop
      // 8c5: bipush 0
      // 8c6: anewarray 39
      // 8c9: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 8cc: athrow
      // 8cd: return
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
      // 000: getstatic cia.a J
      // 003: ldc2_w 33118523239640
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 6
      // 00e: aload 2
      // 00f: arraylength
      // 010: iload 6
      // 012: ifeq 047
      // 015: ifle 045
      // 018: goto 01f
      // 01b: invokestatic cia.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 2
      // 020: arraylength
      // 021: bipush 3
      // 022: iload 6
      // 024: ifeq 048
      // 027: goto 02e
      // 02a: invokestatic cia.a (Loov;)Loov;
      // 02d: athrow
      // 02e: if_icmpgt 045
      // 031: goto 038
      // 034: invokestatic cia.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 2
      // 039: bipush 0
      // 03a: aload 3
      // 03b: invokestatic cia.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 03e: goto 1ae
      // 041: invokestatic cia.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 2
      // 046: arraylength
      // 047: bipush 3
      // 048: iload 6
      // 04a: ifeq 082
      // 04d: if_icmple 07e
      // 050: goto 057
      // 053: invokestatic cia.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 2
      // 058: arraylength
      // 059: bipush 6
      // 05b: iload 6
      // 05d: ifeq 082
      // 060: goto 067
      // 063: invokestatic cia.a (Loov;)Loov;
      // 066: athrow
      // 067: if_icmpgt 07e
      // 06a: goto 071
      // 06d: invokestatic cia.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 2
      // 072: bipush 3
      // 073: aload 3
      // 074: invokestatic cia.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 077: goto 1ae
      // 07a: invokestatic cia.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 2
      // 07f: arraylength
      // 080: bipush 6
      // 082: iload 6
      // 084: ifeq 0bd
      // 087: if_icmple 0b9
      // 08a: goto 091
      // 08d: invokestatic cia.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 2
      // 092: arraylength
      // 093: bipush 9
      // 095: iload 6
      // 097: ifeq 0bd
      // 09a: goto 0a1
      // 09d: invokestatic cia.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: if_icmpgt 0b9
      // 0a4: goto 0ab
      // 0a7: invokestatic cia.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 2
      // 0ac: bipush 6
      // 0ae: aload 3
      // 0af: invokestatic cia.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 0b2: goto 1ae
      // 0b5: invokestatic cia.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 2
      // 0ba: arraylength
      // 0bb: bipush 10
      // 0bd: iload 6
      // 0bf: ifeq 115
      // 0c2: if_icmpne 111
      // 0c5: goto 0cc
      // 0c8: invokestatic cia.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 2
      // 0cd: bipush 3
      // 0ce: anewarray 2
      // 0d1: dup
      // 0d2: bipush 0
      // 0d3: sipush 13498
      // 0d6: ldc2_w 2407019449152344301
      // 0d9: lload 4
      // 0db: lxor
      // 0dc: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: nop
      // 0e2: aastore
      // 0e3: dup
      // 0e4: bipush 1
      // 0e5: sipush 1063
      // 0e8: ldc2_w 2938145853790822525
      // 0eb: lload 4
      // 0ed: lxor
      // 0ee: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: nop
      // 0f4: aastore
      // 0f5: dup
      // 0f6: bipush 2
      // 0f7: sipush 6998
      // 0fa: ldc2_w 4797784504186257155
      // 0fd: lload 4
      // 0ff: lxor
      // 100: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: nop
      // 106: aastore
      // 107: invokestatic cia.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 10a: goto 1ae
      // 10d: invokestatic cia.a (Loov;)Loov;
      // 110: athrow
      // 111: aload 2
      // 112: arraylength
      // 113: bipush 11
      // 115: iload 6
      // 117: ifeq 179
      // 11a: if_icmpne 169
      // 11d: goto 124
      // 120: invokestatic cia.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 2
      // 125: bipush 3
      // 126: anewarray 2
      // 129: dup
      // 12a: bipush 0
      // 12b: sipush 30752
      // 12e: ldc2_w 811219552083303547
      // 131: lload 4
      // 133: lxor
      // 134: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: nop
      // 13a: aastore
      // 13b: dup
      // 13c: bipush 1
      // 13d: sipush 4144
      // 140: ldc2_w 7094085305767867489
      // 143: lload 4
      // 145: lxor
      // 146: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: nop
      // 14c: aastore
      // 14d: dup
      // 14e: bipush 2
      // 14f: sipush 26179
      // 152: ldc2_w 4393304249815843358
      // 155: lload 4
      // 157: lxor
      // 158: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: nop
      // 15e: aastore
      // 15f: invokestatic cia.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 162: goto 1ae
      // 165: invokestatic cia.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 2
      // 16a: arraylength
      // 16b: iload 6
      // 16d: ifeq 199
      // 170: bipush 12
      // 172: goto 179
      // 175: invokestatic cia.a (Loov;)Loov;
      // 178: athrow
      // 179: if_icmpne 1ad
      // 17c: sipush 21056
      // 17f: ldc2_w 8156997166405645852
      // 182: lload 4
      // 184: lxor
      // 185: invokedynamic i (IJ)Ljava/lang/String; bsm=cia.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: nop
      // 18b: aload 2
      // 18c: bipush 9
      // 18e: aaload
      // 18f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 192: goto 199
      // 195: invokestatic cia.a (Loov;)Loov;
      // 198: athrow
      // 199: ifeq 1ad
      // 19c: aload 2
      // 19d: getstatic e0x.db8 Ljnv;
      // 1a0: invokevirtual jnv.kqi ()Ljava/util/Set;
      // 1a3: invokestatic cia.d79 ([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
      // 1a6: goto 1ae
      // 1a9: invokestatic cia.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aconst_null
      // 1ae: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4798527723890993953L, -1241547208770451524L, MethodHandles.lookup().lookupClass()).a(60637152074143L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 65628633633389L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "Ø\u007fä£Õbû`p#\u007f\u001bêíªë\u0010Í0\u001d.§Y\u001eÆwW\n÷À«þF\u0010ê(\u000eYsÅ×Xb\u008f±,7°\u0098Þ8\u007f:\u0098ô:,\u00ad4öñ\u001e¿\u008aî\u0019çà\u001a\u009a/u¨ÊEE!j&=s]I%\u0018#×¡¸\u0085\u001a@c]Û?@k#\u008b¡Çüöfûs0$ïtZIi\u001b¤\u0005Oò´þ\u0084uè´\u0095Ê»ÿ¿Üë\u0013ÏÌa]\u0004B/\bHßÚ\bì¨zû3\u001eø\u0085\u0082\u0005à8m®ò¢\u001b\b¼Ü\u0004\u009e/Åa±7<áe\u0018aý5\u008f\u0003#\u0090\u0081\u008cÇ\"6\u0016;ðÍ»~Ú\"g\u001a·f\u0087\u00194\"'nçI\u000ejJS§\u0010ü\u009fFí\u0013øÞ\rïÏÄ\u0089\u008e\u0006Îa ÃÚþ6+aÝ/Ã£\u001e¸³\u0091mÞ)È\u0096¾\u007fÂ±f¶D\u009cx¸qÐ,(y§\u0083ïô®ow\u0014Ë|dÖ\u0088l½ÄÀì\u0000+ª\u0000.µS;ÄÈ¤ä»\u0004à\u0002ð\u001e\u000f^¼\u0010÷\u007fCwÏí>2°\u0007¨9\u0016ÒqÌ\u0010á\\\u0088=¨Õ_0\u0085\u007f\u008eþ&AúÁ(·\u0017h\u001bô\u0081ý/¶Bo\u008eäº\u008bîe¶\u0005ÂD\u0003* \b<+Ð+ÝØê±\u0018\u0080\u000bt¬á©\u0010O%%w\f`\u0086À\u001fåÙ\nX\b\u007fÚ\u0010¨ÝF\u000f*\u008a\u009c|¸Ù\u0004v=0.»\u0018\u0004\u008fTa©'ª5A ó\u009b§r\u0012ò\u0001Ua>¸þb\u00150Óß}·«öJ\u008c=\\Îó\u009c+\u001eh·²8ò\u0006a\b2f\u009d·´FÁ\u009c\u0012ÚSì\u0090z V~\u0005_\u0098\u0092\u0005ÍW\u000e\u0010]j4(\u0084\u0088¹æ\u0003\u0012Ü\u00ad\u0006ô\u001cÍ";
      int var8 = "Ø\u007fä£Õbû`p#\u007f\u001bêíªë\u0010Í0\u001d.§Y\u001eÆwW\n÷À«þF\u0010ê(\u000eYsÅ×Xb\u008f±,7°\u0098Þ8\u007f:\u0098ô:,\u00ad4öñ\u001e¿\u008aî\u0019çà\u001a\u009a/u¨ÊEE!j&=s]I%\u0018#×¡¸\u0085\u001a@c]Û?@k#\u008b¡Çüöfûs0$ïtZIi\u001b¤\u0005Oò´þ\u0084uè´\u0095Ê»ÿ¿Üë\u0013ÏÌa]\u0004B/\bHßÚ\bì¨zû3\u001eø\u0085\u0082\u0005à8m®ò¢\u001b\b¼Ü\u0004\u009e/Åa±7<áe\u0018aý5\u008f\u0003#\u0090\u0081\u008cÇ\"6\u0016;ðÍ»~Ú\"g\u001a·f\u0087\u00194\"'nçI\u000ejJS§\u0010ü\u009fFí\u0013øÞ\rïÏÄ\u0089\u008e\u0006Îa ÃÚþ6+aÝ/Ã£\u001e¸³\u0091mÞ)È\u0096¾\u007fÂ±f¶D\u009cx¸qÐ,(y§\u0083ïô®ow\u0014Ë|dÖ\u0088l½ÄÀì\u0000+ª\u0000.µS;ÄÈ¤ä»\u0004à\u0002ð\u001e\u000f^¼\u0010÷\u007fCwÏí>2°\u0007¨9\u0016ÒqÌ\u0010á\\\u0088=¨Õ_0\u0085\u007f\u008eþ&AúÁ(·\u0017h\u001bô\u0081ý/¶Bo\u008eäº\u008bîe¶\u0005ÂD\u0003* \b<+Ð+ÝØê±\u0018\u0080\u000bt¬á©\u0010O%%w\f`\u0086À\u001fåÙ\nX\b\u007fÚ\u0010¨ÝF\u000f*\u008a\u009c|¸Ù\u0004v=0.»\u0018\u0004\u008fTa©'ª5A ó\u009b§r\u0012ò\u0001Ua>¸þb\u00150Óß}·«öJ\u008c=\\Îó\u009c+\u001eh·²8ò\u0006a\b2f\u009d·´FÁ\u009c\u0012ÚSì\u0090z V~\u0005_\u0098\u0092\u0005ÍW\u000e\u0010]j4(\u0084\u0088¹æ\u0003\u0012Ü\u00ad\u0006ô\u001cÍ"
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
                     g = new String[19];
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

                  var6 = "\u0093¤w¡´¢\u0017+â¨ÆÝÐ+*¢\b}\u000e¦6 94\u0090³\f=ÌIFÕ_GÍ<\u0017,áË8³½Äx»È¦@#háø\u0001ýl\bDGo\"Ñ'+\u009bØ\u0014Ü[\u001e6\f¥H®\u0089Æà\u0019 -á\b\u001f¨8x\u009cÓ\u0096\u001a_v!ÆéÂ";
                  var8 = "\u0093¤w¡´¢\u0017+â¨ÆÝÐ+*¢\b}\u000e¦6 94\u0090³\f=ÌIFÕ_GÍ<\u0017,áË8³½Äx»È¦@#háø\u0001ýl\bDGo\"Ñ'+\u009bØ\u0014Ü[\u001e6\f¥H®\u0089Æà\u0019 -á\b\u001f¨8x\u009cÓ\u0096\u001a_v!ÆéÂ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22005;
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
            throw new RuntimeException("cia", var10);
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
         throw new RuntimeException("cia" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
