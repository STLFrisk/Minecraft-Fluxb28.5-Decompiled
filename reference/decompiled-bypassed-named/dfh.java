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

public class dfh extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 110243874047329L;
      return b<"t">(9463, 4939655051736756693L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 117348797569511L;
      return b<"t">(30661, 6146473854383013484L ^ var2);
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
      // 000: getstatic dfh.a J
      // 003: ldc2_w 105860663242788
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 9
      // 011: if_icmpge 032
      // 014: new w57
      // 017: dup
      // 018: sipush 8274
      // 01b: ldc2_w 2217427101419913276
      // 01e: lload 3
      // 01f: lxor
      // 020: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: nop
      // 026: bipush 0
      // 027: anewarray 41
      // 02a: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02d: athrow
      // 02e: invokestatic dfh.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 1
      // 033: getstatic n_k$pbp.f1s Ln_k$pbp;
      // 036: bipush 0
      // 037: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 03c: aload 1
      // 03d: aload 2
      // 03e: bipush 0
      // 03f: bipush 0
      // 040: invokestatic dfh.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 043: astore 6
      // 045: aload 1
      // 046: aload 2
      // 047: bipush 3
      // 048: bipush 0
      // 049: invokestatic dfh.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 04c: astore 7
      // 04e: aload 1
      // 04f: aload 2
      // 050: bipush 6
      // 052: bipush 0
      // 053: invokestatic dfh.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
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
      // 091: ifne 0d5
      // 094: ldc 524288
      // 096: nop
      // 097: if_icmple 0d0
      // 09a: goto 0a1
      // 09d: invokestatic dfh.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: new uvb
      // 0a4: dup
      // 0a5: sipush 28767
      // 0a8: ldc2_w 8865399907455799348
      // 0ab: lload 3
      // 0ac: lxor
      // 0ad: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: bipush 2
      // 0b4: anewarray 41
      // 0b7: dup
      // 0b8: bipush 0
      // 0b9: iload 11
      // 0bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0be: aastore
      // 0bf: dup
      // 0c0: bipush 1
      // 0c1: ldc 524288
      // 0c3: nop
      // 0c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c7: aastore
      // 0c8: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0cb: athrow
      // 0cc: invokestatic dfh.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 9
      // 0d2: getfield yve._3o I
      // 0d5: iload 5
      // 0d7: ifne 0f0
      // 0da: iflt 3f4
      // 0dd: goto 0e4
      // 0e0: invokestatic dfh.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 9
      // 0e6: getfield yve.ixv I
      // 0e9: goto 0f0
      // 0ec: invokestatic dfh.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: iload 5
      // 0f2: ifne 10e
      // 0f5: sipush 256
      // 0f8: if_icmpge 3f4
      // 0fb: goto 102
      // 0fe: invokestatic dfh.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 10
      // 104: getfield yve._3o I
      // 107: goto 10e
      // 10a: invokestatic dfh.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 5
      // 110: ifne 129
      // 113: iflt 3f4
      // 116: goto 11d
      // 119: invokestatic dfh.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 10
      // 11f: getfield yve.ixv I
      // 122: goto 129
      // 125: invokestatic dfh.a (Loov;)Loov;
      // 128: athrow
      // 129: sipush 256
      // 12c: if_icmpge 3f4
      // 12f: aload 1
      // 130: invokeinterface e7r.qha ()Lt9d; 1
      // 135: astore 12
      // 137: aload 12
      // 139: aload 9
      // 13b: invokevirtual OpaquePredicate.zz0 (Lyve;)Z
      // 13e: iload 5
      // 140: ifne 15b
      // 143: ifeq 3d1
      // 146: goto 14d
      // 149: invokestatic dfh.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 12
      // 14f: aload 10
      // 151: invokevirtual OpaquePredicate.zz0 (Lyve;)Z
      // 154: goto 15b
      // 157: invokestatic dfh.a (Loov;)Loov;
      // 15a: athrow
      // 15b: iload 5
      // 15d: ifne 16b
      // 160: ifeq 3d1
      // 163: goto 16a
      // 166: invokestatic dfh.a (Loov;)Loov;
      // 169: athrow
      // 16a: bipush 0
      // 16b: istore 13
      // 16d: aload 2
      // 16e: arraylength
      // 16f: iload 5
      // 171: ifne 1af
      // 174: bipush 9
      // 176: if_icmple 1ae
      // 179: goto 180
      // 17c: invokestatic dfh.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 2
      // 181: bipush 9
      // 183: aaload
      // 184: sipush 12662
      // 187: ldc2_w 8489037712257011999
      // 18a: lload 3
      // 18b: lxor
      // 18c: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: nop
      // 192: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 195: iload 5
      // 197: ifne 1af
      // 19a: goto 1a1
      // 19d: invokestatic dfh.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: ifeq 1ae
      // 1a4: goto 1ab
      // 1a7: invokestatic dfh.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: bipush 1
      // 1ac: istore 13
      // 1ae: bipush 0
      // 1af: istore 11
      // 1b1: new mew
      // 1b4: dup
      // 1b5: aload 10
      // 1b7: getfield yve.gdj I
      // 1ba: aload 9
      // 1bc: getfield yve.gdj I
      // 1bf: isub
      // 1c0: aload 10
      // 1c2: getfield yve._3o I
      // 1c5: aload 9
      // 1c7: getfield yve._3o I
      // 1ca: isub
      // 1cb: aload 10
      // 1cd: getfield yve.ob0 I
      // 1d0: aload 9
      // 1d2: getfield yve.ob0 I
      // 1d5: isub
      // 1d6: invokespecial mew.<init> (III)V
      // 1d9: astore 14
      // 1db: new mew$mix
      // 1de: dup
      // 1df: invokespecial mew$mix.<init> ()V
      // 1e2: astore 15
      // 1e4: new mew$mix
      // 1e7: dup
      // 1e8: invokespecial mew$mix.<init> ()V
      // 1eb: astore 16
      // 1ed: aload 9
      // 1ef: getfield yve.ob0 I
      // 1f2: istore 17
      // 1f4: iload 17
      // 1f6: aload 9
      // 1f8: getfield yve.nwc I
      // 1fb: if_icmpgt 3a2
      // 1fe: aload 9
      // 200: getfield yve._3o I
      // 203: istore 18
      // 205: iload 18
      // 207: aload 9
      // 209: getfield yve.ixv I
      // 20c: if_icmpgt 39a
      // 20f: aload 9
      // 211: getfield yve.gdj I
      // 214: iload 5
      // 216: ifne 1f6
      // 219: istore 19
      // 21b: iload 19
      // 21d: aload 9
      // 21f: getfield yve.kwp I
      // 222: if_icmpgt 392
      // 225: aload 15
      // 227: iload 19
      // 229: iload 18
      // 22b: iload 17
      // 22d: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 230: pop
      // 231: aload 16
      // 233: iload 19
      // 235: aload 14
      // 237: invokevirtual mew.getX ()I
      // 23a: iadd
      // 23b: iload 18
      // 23d: aload 14
      // 23f: invokevirtual mew.getY ()I
      // 242: iadd
      // 243: iload 17
      // 245: aload 14
      // 247: invokevirtual mew.getZ ()I
      // 24a: iadd
      // 24b: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 24e: pop
      // 24f: bipush 0
      // 250: istore 20
      // 252: aload 12
      // 254: aload 15
      // 256: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 259: astore 21
      // 25b: iload 13
      // 25d: iload 5
      // 25f: ifne 207
      // 262: ifeq 285
      // 265: aload 21
      // 267: iload 5
      // 269: ifne 28e
      // 26c: goto 273
      // 26f: invokestatic dfh.a (Loov;)Loov;
      // 272: athrow
      // 273: invokeinterface zfz.r_y ()Le0x; 1
      // 278: getstatic ox_.ibw Le0x;
      // 27b: if_acmpeq 38a
      // 27e: goto 285
      // 281: invokestatic dfh.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 21
      // 287: goto 28e
      // 28a: invokestatic dfh.a (Loov;)Loov;
      // 28d: athrow
      // 28e: aload 12
      // 290: aload 16
      // 292: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 295: if_acmpne 355
      // 298: aload 12
      // 29a: aload 15
      // 29c: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 29f: astore 22
      // 2a1: aload 12
      // 2a3: aload 16
      // 2a5: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 2a8: astore 23
      // 2aa: aload 22
      // 2ac: iload 5
      // 2ae: ifne 34a
      // 2b1: ifnull 341
      // 2b4: goto 2bb
      // 2b7: invokestatic dfh.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: aload 23
      // 2bd: iload 5
      // 2bf: ifne 34a
      // 2c2: goto 2c9
      // 2c5: invokestatic dfh.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: ifnull 341
      // 2cc: goto 2d3
      // 2cf: invokestatic dfh.a (Loov;)Loov;
      // 2d2: athrow
      // 2d3: new bdo
      // 2d6: dup
      // 2d7: invokespecial bdo.<init> ()V
      // 2da: astore 24
      // 2dc: aload 22
      // 2de: aload 24
      // 2e0: invokevirtual pyk.m2a (Lbdo;)V
      // 2e3: aload 24
      // 2e5: ldc "x"
      // 2e7: nop
      // 2e8: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 2eb: aload 24
      // 2ed: ldc "y"
      // 2ef: nop
      // 2f0: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 2f3: aload 24
      // 2f5: ldc "z"
      // 2f7: nop
      // 2f8: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 2fb: new bdo
      // 2fe: dup
      // 2ff: invokespecial bdo.<init> ()V
      // 302: astore 25
      // 304: aload 23
      // 306: aload 25
      // 308: invokevirtual pyk.m2a (Lbdo;)V
      // 30b: aload 25
      // 30d: ldc "x"
      // 30f: nop
      // 310: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 313: aload 25
      // 315: ldc "y"
      // 317: nop
      // 318: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 31b: aload 25
      // 31d: ldc "z"
      // 31f: nop
      // 320: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 323: aload 24
      // 325: aload 25
      // 327: invokevirtual bdo.equals (Ljava/lang/Object;)Z
      // 32a: iload 5
      // 32c: ifne 33a
      // 32f: ifne 33c
      // 332: goto 339
      // 335: invokestatic dfh.a (Loov;)Loov;
      // 338: athrow
      // 339: bipush 1
      // 33a: istore 20
      // 33c: iload 5
      // 33e: ifeq 350
      // 341: aload 22
      // 343: goto 34a
      // 346: invokestatic dfh.a (Loov;)Loov;
      // 349: athrow
      // 34a: ifnull 350
      // 34d: bipush 1
      // 34e: istore 20
      // 350: iload 5
      // 352: ifeq 358
      // 355: bipush 1
      // 356: istore 20
      // 358: iinc 11 1
      // 35b: iload 5
      // 35d: ifne 38d
      // 360: iload 20
      // 362: ifeq 38a
      // 365: goto 36c
      // 368: invokestatic dfh.a (Loov;)Loov;
      // 36b: athrow
      // 36c: new uvb
      // 36f: dup
      // 370: sipush 22509
      // 373: ldc2_w 1593933515264374664
      // 376: lload 3
      // 377: lxor
      // 378: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: nop
      // 37e: bipush 0
      // 37f: anewarray 41
      // 382: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 385: athrow
      // 386: invokestatic dfh.a (Loov;)Loov;
      // 389: athrow
      // 38a: iinc 19 1
      // 38d: iload 5
      // 38f: ifeq 21b
      // 392: iinc 18 1
      // 395: iload 5
      // 397: ifeq 205
      // 39a: iinc 17 1
      // 39d: iload 5
      // 39f: ifeq 1f4
      // 3a2: aload 1
      // 3a3: getstatic n_k$pbp.f1s Ln_k$pbp;
      // 3a6: iload 11
      // 3a8: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 3ad: aload 1
      // 3ae: aload 0
      // 3af: sipush 13620
      // 3b2: ldc2_w 3881344058808718674
      // 3b5: lload 3
      // 3b6: lxor
      // 3b7: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bc: nop
      // 3bd: bipush 1
      // 3be: anewarray 41
      // 3c1: dup
      // 3c2: bipush 0
      // 3c3: iload 11
      // 3c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c8: aastore
      // 3c9: invokestatic dfh.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 3cc: iload 5
      // 3ce: ifeq 3ef
      // 3d1: new uvb
      // 3d4: dup
      // 3d5: sipush 18846
      // 3d8: ldc2_w 1703473184361163249
      // 3db: lload 3
      // 3dc: lxor
      // 3dd: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: nop
      // 3e3: bipush 0
      // 3e4: anewarray 41
      // 3e7: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 3ea: athrow
      // 3eb: invokestatic dfh.a (Loov;)Loov;
      // 3ee: athrow
      // 3ef: iload 5
      // 3f1: ifeq 412
      // 3f4: new uvb
      // 3f7: dup
      // 3f8: sipush 23989
      // 3fb: ldc2_w 5056811693335494109
      // 3fe: lload 3
      // 3ff: lxor
      // 400: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 405: nop
      // 406: bipush 0
      // 407: anewarray 41
      // 40a: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 40d: athrow
      // 40e: invokestatic dfh.a (Loov;)Loov;
      // 411: athrow
      // 412: return
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
      // 00: getstatic dfh.a J
      // 03: ldc2_w 84323520687572
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: arraylength
      // 10: iload 6
      // 12: ifne 47
      // 15: ifle 45
      // 18: goto 1f
      // 1b: invokestatic dfh.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: arraylength
      // 21: bipush 3
      // 22: iload 6
      // 24: ifne 48
      // 27: goto 2e
      // 2a: invokestatic dfh.a (Loov;)Loov;
      // 2d: athrow
      // 2e: if_icmpgt 45
      // 31: goto 38
      // 34: invokestatic dfh.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 2
      // 39: bipush 0
      // 3a: aload 3
      // 3b: invokestatic dfh.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 3e: goto fc
      // 41: invokestatic dfh.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 2
      // 46: arraylength
      // 47: bipush 3
      // 48: iload 6
      // 4a: ifne 82
      // 4d: if_icmple 7e
      // 50: goto 57
      // 53: invokestatic dfh.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 2
      // 58: arraylength
      // 59: bipush 6
      // 5b: iload 6
      // 5d: ifne 82
      // 60: goto 67
      // 63: invokestatic dfh.a (Loov;)Loov;
      // 66: athrow
      // 67: if_icmpgt 7e
      // 6a: goto 71
      // 6d: invokestatic dfh.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 2
      // 72: bipush 3
      // 73: aload 3
      // 74: invokestatic dfh.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 77: goto fc
      // 7a: invokestatic dfh.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 2
      // 7f: arraylength
      // 80: bipush 6
      // 82: iload 6
      // 84: ifne c9
      // 87: if_icmple b9
      // 8a: goto 91
      // 8d: invokestatic dfh.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 2
      // 92: arraylength
      // 93: bipush 9
      // 95: iload 6
      // 97: ifne c9
      // 9a: goto a1
      // 9d: invokestatic dfh.a (Loov;)Loov;
      // a0: athrow
      // a1: if_icmpgt b9
      // a4: goto ab
      // a7: invokestatic dfh.a (Loov;)Loov;
      // aa: athrow
      // ab: aload 2
      // ac: bipush 6
      // ae: aload 3
      // af: invokestatic dfh.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // b2: goto fc
      // b5: invokestatic dfh.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 2
      // ba: iload 6
      // bc: ifne cd
      // bf: arraylength
      // c0: bipush 10
      // c2: goto c9
      // c5: invokestatic dfh.a (Loov;)Loov;
      // c8: athrow
      // c9: if_icmpne fb
      // cc: aload 2
      // cd: bipush 2
      // ce: anewarray 2
      // d1: dup
      // d2: bipush 0
      // d3: sipush 5826
      // d6: ldc2_w 3884644179593243487
      // d9: lload 4
      // db: lxor
      // dc: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e1: nop
      // e2: aastore
      // e3: dup
      // e4: bipush 1
      // e5: sipush 3890
      // e8: ldc2_w 6037248641512190638
      // eb: lload 4
      // ed: lxor
      // ee: invokedynamic t (IJ)Ljava/lang/String; bsm=dfh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f3: nop
      // f4: aastore
      // f5: invokestatic dfh.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // f8: goto fc
      // fb: aconst_null
      // fc: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6452998973030517638L, -7990098659924062739L, MethodHandles.lookup().lookupClass()).a(203989289781091L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 39041190053660L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "3Ä«¤õ4\u0018\u001a\tÆ*È\r¯³ßÑ\f×î¦½B\u009bì´\u0081ö\u007fã\u0015{1Ñr\u0080æt yTÒ\u001e,\u008f\u008b[\u0087\u0001k¶\u009a±\u0083]\u009e(\\üëÊ\u009f\u001a'aÕ®Ègº\u0097<G¶¸R¶ú¡þ\u0000<A\u009fÙ!x\u00006ðçCõ \u001c`\u0098\u0010Æ©\u0097êP¾\u0013\u0086sÆ°èé\u009ew¶\u0010QB¥Ò\u009f~R´µÌÕLÔîC;0k\u008eSH£Fç\\\u0082îw\u008e\u000b`\u00876\u0012kÆ\u009eI\u000bã\u0084\u008eGÉõ¼\u008aãGg\\\u0098K^a\fýpX<Am{\u0016\u000f(\u0087B÷àn\u000f\bés\u008aÎík]\u009eÚR[\u000fI¬\u000f\u0097õX\u0006.\u0014ÃQ\u0016L\u009cw[aÉH1E\u0010áã\u0086\u0004Weèö=fë\b Râ\u00168ís\u0002ksHµâ\u008e½µKÌ°C\u0012X\u0015)·\u001b\u0086\u0082úúñ,zj\u0086\u009aI¼¸\nZûV¯\u0003\u0081L\u0082MI)õ\u0094]n\u0084g\u0085\r\\\u009d\u0018ê\u0012\u0014\u009aq\u008fª\u009cL\u009eA\u0085Î\u001cÕ\u001c_Þ êCúIÍ";
      int var8 = "3Ä«¤õ4\u0018\u001a\tÆ*È\r¯³ßÑ\f×î¦½B\u009bì´\u0081ö\u007fã\u0015{1Ñr\u0080æt yTÒ\u001e,\u008f\u008b[\u0087\u0001k¶\u009a±\u0083]\u009e(\\üëÊ\u009f\u001a'aÕ®Ègº\u0097<G¶¸R¶ú¡þ\u0000<A\u009fÙ!x\u00006ðçCõ \u001c`\u0098\u0010Æ©\u0097êP¾\u0013\u0086sÆ°èé\u009ew¶\u0010QB¥Ò\u009f~R´µÌÕLÔîC;0k\u008eSH£Fç\\\u0082îw\u008e\u000b`\u00876\u0012kÆ\u009eI\u000bã\u0084\u008eGÉõ¼\u008aãGg\\\u0098K^a\fýpX<Am{\u0016\u000f(\u0087B÷àn\u000f\bés\u008aÎík]\u009eÚR[\u000fI¬\u000f\u0097õX\u0006.\u0014ÃQ\u0016L\u009cw[aÉH1E\u0010áã\u0086\u0004Weèö=fë\b Râ\u00168ís\u0002ksHµâ\u008e½µKÌ°C\u0012X\u0015)·\u001b\u0086\u0082úúñ,zj\u0086\u009aI¼¸\nZûV¯\u0003\u0081L\u0082MI)õ\u0094]n\u0084g\u0085\r\\\u009d\u0018ê\u0012\u0014\u009aq\u008fª\u009cL\u009eA\u0085Î\u001cÕ\u001c_Þ êCúIÍ"
         .length();
      char var5 = '8';
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
                     g = new String[11];
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

                  var6 = "ã·÷8cX¤\u0018k.\u0096ñò\u007frÄÆô\u0087âÕûTKø¼5\u009eö\u001a¥_XÞïg\u0088C¶FÑÔ\u0088Ö\u0085ó\"°(XÏ\u00815ü]OO\u0002ÚÙ±$ìx0\u0082\b@\u008e±7\u0085\u0016õÑ+çjrr¿\u0098UïZ\u0098ãïÐ";
                  var8 = "ã·÷8cX¤\u0018k.\u0096ñò\u007frÄÆô\u0087âÕûTKø¼5\u009eö\u001a¥_XÞïg\u0088C¶FÑÔ\u0088Ö\u0085ó\"°(XÏ\u00815ü]OO\u0002ÚÙ±$ìx0\u0082\b@\u008e±7\u0085\u0016õÑ+çjrr¿\u0098UïZ\u0098ãïÐ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19505;
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
            throw new RuntimeException("dfh", var10);
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
         throw new RuntimeException("dfh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
