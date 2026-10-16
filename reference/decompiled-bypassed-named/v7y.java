import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.optifine.BlockPosM;

public final class v7y {
   private static final int i82 = (int)Math.pow(17.0, 2.0);
   private final Set fw8 = Sets.newHashSet();
   private Map s67 = new HashMap();
   private int hyx = Integer.MAX_VALUE;
   private int q_6 = Integer.MAX_VALUE;
   private int k6y;

   public int pkz(dug param1, boolean param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: iload 2
      // 006: iload 5
      // 008: ifne 033
      // 00b: ifne 032
      // 00e: goto 015
      // 011: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: iload 3
      // 016: iload 5
      // 018: ifne 033
      // 01b: goto 022
      // 01e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: ifne 032
      // 025: goto 02c
      // 028: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: ireturn
      // 02e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: bipush 1
      // 033: istore 6
      // 035: aconst_null
      // 036: astore 7
      // 038: aload 1
      // 039: getfield dug.rpk Ljava/util/List;
      // 03c: iload 5
      // 03e: ifne 062
      // 041: invokeinterface java/util/List.size ()I 1
      // 046: bipush 1
      // 047: if_icmpne 0d1
      // 04a: goto 051
      // 04d: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 1
      // 052: getfield dug.rpk Ljava/util/List;
      // 055: bipush 0
      // 056: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05b: goto 062
      // 05e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: checkcast ha9
      // 065: astore 7
      // 067: aload 0
      // 068: getfield v7y.fw8 Ljava/util/Set;
      // 06b: invokeinterface java/util/Set.size ()I 1
      // 070: iload 5
      // 072: ifne 0d3
      // 075: ifle 0d1
      // 078: goto 07f
      // 07b: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 7
      // 081: iload 5
      // 083: ifne 099
      // 086: goto 08d
      // 089: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: ifnull 0d1
      // 090: goto 097
      // 093: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 7
      // 099: getfield ha9.jw4 I
      // 09c: iload 5
      // 09e: ifne 0d3
      // 0a1: aload 0
      // 0a2: getfield v7y.hyx I
      // 0a5: if_icmpne 0d1
      // 0a8: goto 0af
      // 0ab: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 7
      // 0b1: getfield ha9.e6l I
      // 0b4: iload 5
      // 0b6: ifne 0d3
      // 0b9: goto 0c0
      // 0bc: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield v7y.q_6 I
      // 0c4: if_icmpne 0d1
      // 0c7: goto 0ce
      // 0ca: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: bipush 0
      // 0cf: istore 6
      // 0d1: iload 6
      // 0d3: iload 5
      // 0d5: ifne 2a9
      // 0d8: ifeq 2a8
      // 0db: goto 0e2
      // 0de: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: getfield v7y.fw8 Ljava/util/Set;
      // 0e6: invokeinterface java/util/Set.clear ()V 1
      // 0eb: bipush 0
      // 0ec: istore 8
      // 0ee: aload 1
      // 0ef: getfield dug.rpk Ljava/util/List;
      // 0f2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f7: astore 9
      // 0f9: aload 9
      // 0fb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 100: ifeq 278
      // 103: aload 9
      // 105: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10a: checkcast ha9
      // 10d: astore 10
      // 10f: aload 10
      // 111: invokevirtual ha9.myu ()Z
      // 114: iload 5
      // 116: ifne 2a9
      // 119: iload 5
      // 11b: ifne 142
      // 11e: goto 125
      // 121: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: ifne 273
      // 128: goto 12f
      // 12b: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: aload 10
      // 131: getfield ha9.o2v D
      // 134: ldc2_w 16.0
      // 137: ddiv
      // 138: invokestatic fe6.jqf (D)I
      // 13b: goto 142
      // 13e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: istore 11
      // 144: aload 10
      // 146: getfield ha9.vbd D
      // 149: ldc2_w 16.0
      // 14c: ddiv
      // 14d: invokestatic fe6.jqf (D)I
      // 150: istore 12
      // 152: bipush 8
      // 154: istore 13
      // 156: iload 13
      // 158: ineg
      // 159: istore 14
      // 15b: iload 14
      // 15d: iload 13
      // 15f: if_icmpgt 273
      // 162: iload 13
      // 164: ineg
      // 165: iload 5
      // 167: ifne 100
      // 16a: istore 15
      // 16c: iload 15
      // 16e: iload 13
      // 170: if_icmpgt 26b
      // 173: iload 14
      // 175: iload 5
      // 177: ifne 1e3
      // 17a: iload 13
      // 17c: ineg
      // 17d: iload 5
      // 17f: ifne 15f
      // 182: goto 189
      // 185: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: if_icmpeq 1db
      // 18c: iload 14
      // 18e: iload 5
      // 190: ifne 1e3
      // 193: goto 19a
      // 196: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: iload 13
      // 19c: if_icmpeq 1db
      // 19f: goto 1a6
      // 1a2: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: iload 15
      // 1a8: iload 5
      // 1aa: ifne 1e3
      // 1ad: goto 1b4
      // 1b0: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: iload 13
      // 1b6: ineg
      // 1b7: if_icmpeq 1db
      // 1ba: goto 1c1
      // 1bd: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: iload 15
      // 1c3: iload 5
      // 1c5: ifne 1e3
      // 1c8: goto 1cf
      // 1cb: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: iload 13
      // 1d1: if_icmpne 1e6
      // 1d4: goto 1db
      // 1d7: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: bipush 1
      // 1dc: goto 1e3
      // 1df: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: goto 1e7
      // 1e6: bipush 0
      // 1e7: istore 16
      // 1e9: new h2f
      // 1ec: dup
      // 1ed: iload 14
      // 1ef: iload 11
      // 1f1: iadd
      // 1f2: iload 15
      // 1f4: iload 12
      // 1f6: iadd
      // 1f7: invokespecial h2f.<init> (II)V
      // 1fa: astore 17
      // 1fc: iload 5
      // 1fe: ifne 266
      // 201: aload 0
      // 202: getfield v7y.fw8 Ljava/util/Set;
      // 205: aload 17
      // 207: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 20c: ifne 263
      // 20f: goto 216
      // 212: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 215: athrow
      // 216: iinc 8 1
      // 219: iload 5
      // 21b: ifne 266
      // 21e: goto 225
      // 221: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: iload 16
      // 227: ifne 263
      // 22a: goto 231
      // 22d: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: aload 1
      // 232: invokevirtual dug.fve ()Lw5i;
      // 235: aload 17
      // 237: invokevirtual w5i.vza (Lh2f;)Z
      // 23a: iload 5
      // 23c: ifne 262
      // 23f: goto 246
      // 242: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: ifeq 263
      // 249: goto 250
      // 24c: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24f: athrow
      // 250: aload 0
      // 251: getfield v7y.fw8 Ljava/util/Set;
      // 254: aload 17
      // 256: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 25b: goto 262
      // 25e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: pop
      // 263: iinc 15 1
      // 266: iload 5
      // 268: ifeq 16c
      // 26b: iinc 14 1
      // 26e: iload 5
      // 270: ifeq 15b
      // 273: iload 5
      // 275: ifeq 0f9
      // 278: aload 0
      // 279: iload 8
      // 27b: putfield v7y.k6y I
      // 27e: iload 5
      // 280: ifne 2ab
      // 283: aload 7
      // 285: ifnull 2a8
      // 288: goto 28f
      // 28b: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28e: athrow
      // 28f: aload 0
      // 290: aload 7
      // 292: getfield ha9.jw4 I
      // 295: putfield v7y.hyx I
      // 298: aload 0
      // 299: aload 7
      // 29b: getfield ha9.e6l I
      // 29e: putfield v7y.q_6 I
      // 2a1: goto 2a8
      // 2a4: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: bipush 0
      // 2a9: istore 8
      // 2ab: aload 1
      // 2ac: invokevirtual dug.suq ()Lmew;
      // 2af: astore 9
      // 2b1: new net/optifine/BlockPosM
      // 2b4: dup
      // 2b5: bipush 0
      // 2b6: bipush 0
      // 2b7: bipush 0
      // 2b8: invokespecial net/optifine/BlockPosM.<init> (III)V
      // 2bb: astore 10
      // 2bd: new mew$mix
      // 2c0: dup
      // 2c1: invokespecial mew$mix.<init> ()V
      // 2c4: pop
      // 2c5: invokestatic ek6.values ()[Lek6;
      // 2c8: astore 11
      // 2ca: aload 11
      // 2cc: arraylength
      // 2cd: istore 12
      // 2cf: bipush 0
      // 2d0: istore 13
      // 2d2: iload 13
      // 2d4: iload 12
      // 2d6: if_icmpge 785
      // 2d9: aload 11
      // 2db: iload 13
      // 2dd: aaload
      // 2de: astore 14
      // 2e0: aload 14
      // 2e2: invokevirtual ek6.ygv ()Z
      // 2e5: iload 5
      // 2e7: ifne 787
      // 2ea: iload 5
      // 2ec: ifne 323
      // 2ef: goto 2f6
      // 2f2: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f5: athrow
      // 2f6: ifeq 317
      // 2f9: goto 300
      // 2fc: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ff: athrow
      // 300: iload 3
      // 301: iload 5
      // 303: ifne 323
      // 306: goto 30d
      // 309: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30c: athrow
      // 30d: ifeq 77d
      // 310: goto 317
      // 313: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 316: athrow
      // 317: aload 14
      // 319: invokevirtual ek6.ygv ()Z
      // 31c: goto 323
      // 31f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: iload 5
      // 325: ifne 355
      // 328: ifne 349
      // 32b: goto 332
      // 32e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: iload 2
      // 333: iload 5
      // 335: ifne 355
      // 338: goto 33f
      // 33b: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33e: athrow
      // 33f: ifeq 77d
      // 342: goto 349
      // 345: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: aload 14
      // 34b: invokevirtual ek6.ooh ()Z
      // 34e: goto 355
      // 351: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 354: athrow
      // 355: iload 5
      // 357: ifne 389
      // 35a: ifeq 37c
      // 35d: goto 364
      // 360: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 363: athrow
      // 364: iload 4
      // 366: iload 5
      // 368: ifne 389
      // 36b: goto 372
      // 36e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: ifeq 77d
      // 375: goto 37c
      // 378: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37b: athrow
      // 37c: getstatic net/optifine/reflect/Reflector.ForgeWorld_countEntities Lnet/optifine/reflect/ReflectorMethod;
      // 37f: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 382: goto 389
      // 385: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 388: athrow
      // 389: iload 5
      // 38b: ifne 3b6
      // 38e: ifeq 3b9
      // 391: goto 398
      // 394: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: aload 1
      // 399: getstatic net/optifine/reflect/Reflector.ForgeWorld_countEntities Lnet/optifine/reflect/ReflectorMethod;
      // 39c: bipush 2
      // 39d: anewarray 8
      // 3a0: dup
      // 3a1: bipush 0
      // 3a2: aload 14
      // 3a4: aastore
      // 3a5: dup
      // 3a6: bipush 1
      // 3a7: bipush 1
      // 3a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3ab: aastore
      // 3ac: invokestatic net/optifine/reflect/Reflector.callInt (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)I
      // 3af: goto 3b6
      // 3b2: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b5: athrow
      // 3b6: goto 3c2
      // 3b9: aload 1
      // 3ba: aload 14
      // 3bc: invokevirtual ek6.qjr ()Ljava/lang/Class;
      // 3bf: invokevirtual dug.j_p (Ljava/lang/Class;)I
      // 3c2: istore 15
      // 3c4: aload 14
      // 3c6: invokevirtual ek6.bm8 ()I
      // 3c9: aload 0
      // 3ca: getfield v7y.k6y I
      // 3cd: imul
      // 3ce: getstatic v7y.i82 I
      // 3d1: idiv
      // 3d2: istore 16
      // 3d4: iload 5
      // 3d6: ifne 780
      // 3d9: iload 15
      // 3db: iload 16
      // 3dd: if_icmpgt 77d
      // 3e0: goto 3e7
      // 3e3: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e6: athrow
      // 3e7: aload 0
      // 3e8: getfield v7y.fw8 Ljava/util/Set;
      // 3eb: astore 17
      // 3ed: getstatic net/optifine/reflect/Reflector.ForgeHooksClient Lnet/optifine/reflect/ReflectorClass;
      // 3f0: invokevirtual net/optifine/reflect/ReflectorClass.exists ()Z
      // 3f3: ifeq 406
      // 3f6: aload 17
      // 3f8: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 3fb: astore 18
      // 3fd: aload 18
      // 3ff: invokestatic java/util/Collections.shuffle (Ljava/util/List;)V
      // 402: aload 18
      // 404: astore 17
      // 406: aload 17
      // 408: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 40d: astore 18
      // 40f: aload 18
      // 411: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 416: ifeq 77d
      // 419: aload 18
      // 41b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 420: checkcast h2f
      // 423: astore 19
      // 425: aload 1
      // 426: aload 19
      // 428: getfield h2f.jnd I
      // 42b: aload 19
      // 42d: getfield h2f.km5 I
      // 430: aload 10
      // 432: invokestatic v7y.nr7 (Lt9d;IILnet/optifine/BlockPosM;)Lnet/optifine/BlockPosM;
      // 435: astore 20
      // 437: aload 20
      // 439: invokevirtual mew.getX ()I
      // 43c: istore 21
      // 43e: aload 20
      // 440: invokevirtual mew.getY ()I
      // 443: istore 22
      // 445: aload 20
      // 447: invokevirtual mew.getZ ()I
      // 44a: istore 23
      // 44c: aload 1
      // 44d: aload 20
      // 44f: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 452: invokeinterface zfz.r_y ()Le0x; 1
      // 457: astore 24
      // 459: aload 24
      // 45b: invokevirtual e0x.y0n ()Z
      // 45e: iload 5
      // 460: ifne 2d4
      // 463: iload 5
      // 465: ifne 473
      // 468: ifne 778
      // 46b: goto 472
      // 46e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 471: athrow
      // 472: bipush 0
      // 473: istore 25
      // 475: bipush 0
      // 476: istore 26
      // 478: iload 26
      // 47a: bipush 3
      // 47b: if_icmpge 778
      // 47e: iload 21
      // 480: istore 27
      // 482: iload 22
      // 484: istore 28
      // 486: iload 23
      // 488: istore 29
      // 48a: bipush 6
      // 48c: istore 30
      // 48e: aconst_null
      // 48f: astore 31
      // 491: aconst_null
      // 492: astore 32
      // 494: bipush 0
      // 495: iload 5
      // 497: ifne 416
      // 49a: istore 33
      // 49c: iload 33
      // 49e: bipush 4
      // 49f: if_icmpge 770
      // 4a2: iload 27
      // 4a4: aload 1
      // 4a5: getfield dug.fsy Ljava/util/Random;
      // 4a8: iload 30
      // 4aa: invokevirtual java/util/Random.nextInt (I)I
      // 4ad: aload 1
      // 4ae: getfield dug.fsy Ljava/util/Random;
      // 4b1: iload 30
      // 4b3: invokevirtual java/util/Random.nextInt (I)I
      // 4b6: isub
      // 4b7: iadd
      // 4b8: istore 27
      // 4ba: iload 28
      // 4bc: aload 1
      // 4bd: getfield dug.fsy Ljava/util/Random;
      // 4c0: bipush 1
      // 4c1: invokevirtual java/util/Random.nextInt (I)I
      // 4c4: aload 1
      // 4c5: getfield dug.fsy Ljava/util/Random;
      // 4c8: bipush 1
      // 4c9: invokevirtual java/util/Random.nextInt (I)I
      // 4cc: isub
      // 4cd: iadd
      // 4ce: istore 28
      // 4d0: iload 29
      // 4d2: aload 1
      // 4d3: getfield dug.fsy Ljava/util/Random;
      // 4d6: iload 30
      // 4d8: invokevirtual java/util/Random.nextInt (I)I
      // 4db: aload 1
      // 4dc: getfield dug.fsy Ljava/util/Random;
      // 4df: iload 30
      // 4e1: invokevirtual java/util/Random.nextInt (I)I
      // 4e4: isub
      // 4e5: iadd
      // 4e6: istore 29
      // 4e8: new mew
      // 4eb: dup
      // 4ec: iload 27
      // 4ee: iload 28
      // 4f0: iload 29
      // 4f2: invokespecial mew.<init> (III)V
      // 4f5: astore 34
      // 4f7: iload 27
      // 4f9: i2f
      // 4fa: ldc 0.5
      // 4fc: nop
      // 4fd: fadd
      // 4fe: fstore 35
      // 500: iload 29
      // 502: i2f
      // 503: ldc 0.5
      // 505: nop
      // 506: fadd
      // 507: fstore 36
      // 509: iload 5
      // 50b: ifne 76b
      // 50e: aload 1
      // 50f: fload 35
      // 511: f2d
      // 512: iload 28
      // 514: i2d
      // 515: fload 36
      // 517: f2d
      // 518: ldc2_w 24.0
      // 51b: invokevirtual dug.dig (DDDD)Z
      // 51e: iload 5
      // 520: ifne 47a
      // 523: goto 52a
      // 526: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 529: athrow
      // 52a: ifne 768
      // 52d: aload 9
      // 52f: fload 35
      // 531: f2d
      // 532: iload 28
      // 534: i2d
      // 535: fload 36
      // 537: f2d
      // 538: invokevirtual mew.p4e (DDD)D
      // 53b: ldc2_w 576.0
      // 53e: dcmpl
      // 53f: iflt 768
      // 542: goto 549
      // 545: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 548: athrow
      // 549: aload 31
      // 54b: iload 5
      // 54d: ifne 579
      // 550: goto 557
      // 553: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 556: athrow
      // 557: ifnonnull 57f
      // 55a: goto 561
      // 55d: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 560: athrow
      // 561: aload 1
      // 562: aload 14
      // 564: iload 5
      // 566: ifne 582
      // 569: goto 570
      // 56c: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56f: athrow
      // 570: aload 34
      // 572: invokevirtual dug.mso (Lek6;Lmew;)Lgyu$dwn;
      // 575: astore 31
      // 577: aload 31
      // 579: ifnonnull 57f
      // 57c: goto 770
      // 57f: aload 1
      // 580: aload 14
      // 582: aload 31
      // 584: aload 34
      // 586: invokevirtual dug.kjx (Lek6;Lgyu$dwn;Lmew;)Z
      // 589: iload 5
      // 58b: ifne 5b9
      // 58e: ifeq 768
      // 591: goto 598
      // 594: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 597: athrow
      // 598: aload 31
      // 59a: getfield gyu$dwn.w7j Ljava/lang/Class;
      // 59d: invokestatic p0y.i9c (Ljava/lang/Class;)Lyqv$b0p;
      // 5a0: iload 5
      // 5a2: ifne 5ca
      // 5a5: goto 5ac
      // 5a8: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ab: athrow
      // 5ac: aload 1
      // 5ad: aload 34
      // 5af: invokestatic v7y.nmh (Lyqv$b0p;Lt9d;Lmew;)Z
      // 5b2: goto 5b9
      // 5b5: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b8: athrow
      // 5b9: ifeq 768
      // 5bc: aload 0
      // 5bd: getfield v7y.s67 Ljava/util/Map;
      // 5c0: aload 31
      // 5c2: getfield gyu$dwn.w7j Ljava/lang/Class;
      // 5c5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5ca: checkcast yqv
      // 5cd: astore 37
      // 5cf: aload 37
      // 5d1: iload 5
      // 5d3: ifne 612
      // 5d6: ifnonnull 613
      // 5d9: goto 5e0
      // 5dc: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5df: athrow
      // 5e0: aload 31
      // 5e2: getfield gyu$dwn.w7j Ljava/lang/Class;
      // 5e5: bipush 1
      // 5e6: anewarray 311
      // 5e9: dup
      // 5ea: bipush 0
      // 5eb: ldc OpaquePredicate
      // 5ed: nop
      // 5ee: aastore
      // 5ef: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 5f2: bipush 1
      // 5f3: anewarray 8
      // 5f6: dup
      // 5f7: bipush 0
      // 5f8: aload 1
      // 5f9: aastore
      // 5fa: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 5fd: checkcast yqv
      // 600: astore 37
      // 602: aload 0
      // 603: getfield v7y.s67 Ljava/util/Map;
      // 606: aload 31
      // 608: getfield gyu$dwn.w7j Ljava/lang/Class;
      // 60b: aload 37
      // 60d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 612: pop
      // 613: goto 620
      // 616: astore 38
      // 618: aload 38
      // 61a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 61d: iload 8
      // 61f: ireturn
      // 620: aload 37
      // 622: fload 35
      // 624: f2d
      // 625: iload 28
      // 627: i2d
      // 628: fload 36
      // 62a: f2d
      // 62b: aload 1
      // 62c: getfield dug.fsy Ljava/util/Random;
      // 62f: invokevirtual java/util/Random.nextFloat ()F
      // 632: ldc 360.0
      // 634: nop
      // 635: fmul
      // 636: fconst_0
      // 637: invokevirtual yqv.x24 (DDDFF)V
      // 63a: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_canEntitySpawn Lnet/optifine/reflect/ReflectorMethod;
      // 63d: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 640: iload 5
      // 642: ifne 668
      // 645: ifeq 663
      // 648: goto 64f
      // 64b: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64e: athrow
      // 64f: aload 37
      // 651: aload 1
      // 652: fload 35
      // 654: iload 28
      // 656: i2f
      // 657: fload 36
      // 659: invokestatic net/optifine/reflect/ReflectorForge.canEntitySpawn (Lyqv;Lt9d;FFF)Z
      // 65c: goto 697
      // 65f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 662: athrow
      // 663: aload 37
      // 665: invokevirtual yqv.iaw ()Z
      // 668: iload 5
      // 66a: ifne 683
      // 66d: ifeq 696
      // 670: goto 677
      // 673: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 676: athrow
      // 677: aload 37
      // 679: invokevirtual yqv.m63 ()Z
      // 67c: goto 683
      // 67f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 682: athrow
      // 683: iload 5
      // 685: ifne 693
      // 688: ifeq 696
      // 68b: goto 692
      // 68e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 691: athrow
      // 692: bipush 1
      // 693: goto 697
      // 696: bipush 0
      // 697: istore 38
      // 699: iload 38
      // 69b: iload 5
      // 69d: ifne 766
      // 6a0: ifeq 761
      // 6a3: goto 6aa
      // 6a6: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a9: athrow
      // 6aa: aload 0
      // 6ab: getfield v7y.s67 Ljava/util/Map;
      // 6ae: aload 31
      // 6b0: getfield gyu$dwn.w7j Ljava/lang/Class;
      // 6b3: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6b8: pop
      // 6b9: aload 37
      // 6bb: aload 1
      // 6bc: fload 35
      // 6be: iload 28
      // 6c0: fload 36
      // 6c2: invokestatic net/optifine/reflect/ReflectorForge.doSpecialSpawn (Lyqv;Lt9d;FIF)Z
      // 6c5: iload 5
      // 6c7: ifne 6f6
      // 6ca: goto 6d1
      // 6cd: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d0: athrow
      // 6d1: ifne 6f1
      // 6d4: goto 6db
      // 6d7: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6da: athrow
      // 6db: aload 37
      // 6dd: aload 1
      // 6de: new mew
      // 6e1: dup
      // 6e2: aload 37
      // 6e4: invokespecial mew.<init> (Li2h;)V
      // 6e7: invokevirtual dug.sms (Lmew;)Lcss;
      // 6ea: aload 32
      // 6ec: invokevirtual yqv.hx8 (Lcss;Lps6;)Lps6;
      // 6ef: astore 32
      // 6f1: aload 37
      // 6f3: invokevirtual yqv.m63 ()Z
      // 6f6: iload 5
      // 6f8: ifne 71c
      // 6fb: ifeq 716
      // 6fe: goto 705
      // 701: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 704: athrow
      // 705: iinc 25 1
      // 708: aload 1
      // 709: aload 37
      // 70b: invokevirtual dug.xzq (Li2h;)Z
      // 70e: pop
      // 70f: goto 716
      // 712: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 715: athrow
      // 716: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_getMaxSpawnPackSize Lnet/optifine/reflect/ReflectorMethod;
      // 719: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 71c: iload 5
      // 71e: ifne 741
      // 721: ifeq 744
      // 724: goto 72b
      // 727: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72a: athrow
      // 72b: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_getMaxSpawnPackSize Lnet/optifine/reflect/ReflectorMethod;
      // 72e: bipush 1
      // 72f: anewarray 8
      // 732: dup
      // 733: bipush 0
      // 734: aload 37
      // 736: aastore
      // 737: invokestatic net/optifine/reflect/Reflector.callInt (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)I
      // 73a: goto 741
      // 73d: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 740: athrow
      // 741: goto 749
      // 744: aload 37
      // 746: invokevirtual yqv.inu ()I
      // 749: istore 39
      // 74b: iload 25
      // 74d: iload 39
      // 74f: iload 5
      // 751: ifne 765
      // 754: if_icmplt 761
      // 757: goto 75e
      // 75a: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75d: athrow
      // 75e: goto 40f
      // 761: iload 8
      // 763: iload 25
      // 765: iadd
      // 766: istore 8
      // 768: iinc 33 1
      // 76b: iload 5
      // 76d: ifeq 49c
      // 770: iinc 26 1
      // 773: iload 5
      // 775: ifeq 478
      // 778: iload 5
      // 77a: ifeq 40f
      // 77d: iinc 13 1
      // 780: iload 5
      // 782: ifeq 2d2
      // 785: iload 8
      // 787: ireturn
   }

   public static mew nbd(OpaquePredicate param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: invokevirtual OpaquePredicate.o5h (II)Ltts;
      // 06: astore 4
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: iload 1
      // 0c: bipush 16
      // 0e: imul
      // 0f: aload 0
      // 10: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 13: bipush 16
      // 15: invokevirtual java/util/Random.nextInt (I)I
      // 18: iadd
      // 19: istore 5
      // 1b: istore 3
      // 1c: iload 2
      // 1d: bipush 16
      // 1f: imul
      // 20: aload 0
      // 21: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 24: bipush 16
      // 26: invokevirtual java/util/Random.nextInt (I)I
      // 29: iadd
      // 2a: istore 6
      // 2c: aload 4
      // 2e: new mew
      // 31: dup
      // 32: iload 5
      // 34: bipush 0
      // 35: iload 6
      // 37: invokespecial mew.<init> (III)V
      // 3a: invokevirtual tts.hjk (Lmew;)I
      // 3d: bipush 1
      // 3e: iadd
      // 3f: bipush 16
      // 41: invokestatic fe6.v6y (II)I
      // 44: istore 7
      // 46: aload 0
      // 47: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 4a: iload 7
      // 4c: iload 3
      // 4d: ifne 6b
      // 50: ifle 63
      // 53: goto 5a
      // 56: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: iload 7
      // 5c: goto 6d
      // 5f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 4
      // 65: invokevirtual tts._u6 ()I
      // 68: bipush 16
      // 6a: iadd
      // 6b: bipush 1
      // 6c: isub
      // 6d: invokevirtual java/util/Random.nextInt (I)I
      // 70: istore 8
      // 72: new mew
      // 75: dup
      // 76: iload 5
      // 78: iload 8
      // 7a: iload 6
      // 7c: invokespecial mew.<init> (III)V
      // 7f: areturn
   }

   private static BlockPosM nr7(OpaquePredicate param0, int param1, int param2, BlockPosM param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: iload 2
      // 03: invokevirtual OpaquePredicate.o5h (II)Ltts;
      // 06: astore 5
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: iload 1
      // 0c: bipush 16
      // 0e: imul
      // 0f: aload 0
      // 10: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 13: bipush 16
      // 15: invokevirtual java/util/Random.nextInt (I)I
      // 18: iadd
      // 19: istore 6
      // 1b: iload 2
      // 1c: bipush 16
      // 1e: imul
      // 1f: aload 0
      // 20: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 23: bipush 16
      // 25: invokevirtual java/util/Random.nextInt (I)I
      // 28: iadd
      // 29: istore 7
      // 2b: istore 4
      // 2d: aload 5
      // 2f: iload 6
      // 31: bipush 15
      // 33: iand
      // 34: iload 7
      // 36: bipush 15
      // 38: iand
      // 39: invokevirtual tts.d0r (II)I
      // 3c: bipush 1
      // 3d: iadd
      // 3e: bipush 16
      // 40: invokestatic fe6.v6y (II)I
      // 43: istore 8
      // 45: aload 0
      // 46: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 49: iload 8
      // 4b: iload 4
      // 4d: ifne 6b
      // 50: ifle 63
      // 53: goto 5a
      // 56: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: iload 8
      // 5c: goto 6d
      // 5f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 5
      // 65: invokevirtual tts._u6 ()I
      // 68: bipush 16
      // 6a: iadd
      // 6b: bipush 1
      // 6c: isub
      // 6d: invokevirtual java/util/Random.nextInt (I)I
      // 70: istore 9
      // 72: aload 3
      // 73: iload 6
      // 75: iload 9
      // 77: iload 7
      // 79: invokevirtual net/optifine/BlockPosM.setXyz (III)V
      // 7c: aload 3
      // 7d: areturn
   }

   public static boolean nmh(yqv$b0p param0, OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: invokevirtual OpaquePredicate.fve ()Lw5i;
      // 008: aload 2
      // 009: invokevirtual w5i.hka (Lmew;)Z
      // 00c: iload 3
      // 00d: ifeq 01b
      // 010: ifne 01c
      // 013: goto 01a
      // 016: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: aload 0
      // 01d: ifnonnull 026
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 1
      // 027: aload 2
      // 028: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 02b: invokeinterface zfz.r_y ()Le0x; 1
      // 030: astore 4
      // 032: aload 0
      // 033: getstatic yqv$b0p.rb4 Lyqv$b0p;
      // 036: if_acmpne 0a9
      // 039: aload 4
      // 03b: invokevirtual e0x.p1r ()Lp3y;
      // 03e: invokevirtual p3y.l7j ()Z
      // 041: iload 3
      // 042: ifeq 070
      // 045: goto 04c
      // 048: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: ifeq 0a7
      // 04f: goto 056
      // 052: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 1
      // 057: aload 2
      // 058: invokevirtual mew.eve ()Lmew;
      // 05b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 05e: invokeinterface zfz.r_y ()Le0x; 1
      // 063: invokevirtual e0x.p1r ()Lp3y;
      // 066: invokevirtual p3y.l7j ()Z
      // 069: goto 070
      // 06c: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: iload 3
      // 071: ifeq 095
      // 074: ifeq 0a7
      // 077: goto 07e
      // 07a: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: aload 1
      // 07f: aload 2
      // 080: invokevirtual mew.nuv ()Lmew;
      // 083: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 086: invokeinterface zfz.r_y ()Le0x; 1
      // 08b: invokevirtual e0x.y0n ()Z
      // 08e: goto 095
      // 091: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: iload 3
      // 096: ifeq 0a4
      // 099: ifne 0a7
      // 09c: goto 0a3
      // 09f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: bipush 1
      // 0a4: goto 0a8
      // 0a7: bipush 0
      // 0a8: ireturn
      // 0a9: aload 2
      // 0aa: invokevirtual mew.eve ()Lmew;
      // 0ad: astore 5
      // 0af: aload 1
      // 0b0: aload 5
      // 0b2: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0b5: astore 6
      // 0b7: getstatic net/optifine/reflect/Reflector.ForgeBlock_canCreatureSpawn Lnet/optifine/reflect/ReflectorMethod;
      // 0ba: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0bd: iload 3
      // 0be: ifeq 0f0
      // 0c1: ifeq 0f3
      // 0c4: goto 0cb
      // 0c7: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 6
      // 0cd: invokeinterface zfz.r_y ()Le0x; 1
      // 0d2: getstatic net/optifine/reflect/Reflector.ForgeBlock_canCreatureSpawn Lnet/optifine/reflect/ReflectorMethod;
      // 0d5: bipush 3
      // 0d6: anewarray 8
      // 0d9: dup
      // 0da: bipush 0
      // 0db: aload 1
      // 0dc: aastore
      // 0dd: dup
      // 0de: bipush 1
      // 0df: aload 5
      // 0e1: aastore
      // 0e2: dup
      // 0e3: bipush 2
      // 0e4: aload 0
      // 0e5: aastore
      // 0e6: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 0e9: goto 0f0
      // 0ec: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: goto 0f9
      // 0f3: aload 1
      // 0f4: aload 5
      // 0f6: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 0f9: istore 7
      // 0fb: iload 7
      // 0fd: iload 3
      // 0fe: ifeq 10c
      // 101: ifne 10d
      // 104: goto 10b
      // 107: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: bipush 0
      // 10c: ireturn
      // 10d: aload 1
      // 10e: aload 5
      // 110: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 113: invokeinterface zfz.r_y ()Le0x; 1
      // 118: astore 8
      // 11a: aload 8
      // 11c: getstatic ox_.n6z Le0x;
      // 11f: iload 3
      // 120: ifeq 139
      // 123: if_acmpeq 144
      // 126: goto 12d
      // 129: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: aload 8
      // 12f: getstatic ox_.c28 Le0x;
      // 132: goto 139
      // 135: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: if_acmpeq 144
      // 13c: bipush 1
      // 13d: goto 145
      // 140: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: bipush 0
      // 145: istore 9
      // 147: iload 9
      // 149: iload 3
      // 14a: ifeq 163
      // 14d: ifeq 1b7
      // 150: goto 157
      // 153: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: aload 4
      // 159: invokevirtual e0x.y0n ()Z
      // 15c: goto 163
      // 15f: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: iload 3
      // 164: ifeq 180
      // 167: ifne 1b7
      // 16a: goto 171
      // 16d: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: aload 4
      // 173: invokevirtual e0x.p1r ()Lp3y;
      // 176: invokevirtual p3y.l7j ()Z
      // 179: goto 180
      // 17c: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: iload 3
      // 181: ifeq 1a5
      // 184: ifne 1b7
      // 187: goto 18e
      // 18a: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 1
      // 18f: aload 2
      // 190: invokevirtual mew.nuv ()Lmew;
      // 193: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 196: invokeinterface zfz.r_y ()Le0x; 1
      // 19b: invokevirtual e0x.y0n ()Z
      // 19e: goto 1a5
      // 1a1: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: iload 3
      // 1a6: ifeq 1b4
      // 1a9: ifne 1b7
      // 1ac: goto 1b3
      // 1af: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: bipush 1
      // 1b4: goto 1b8
      // 1b7: bipush 0
      // 1b8: ireturn
   }

   public static void zik(OpaquePredicate param0, gyu param1, int param2, int param3, int param4, int param5, Random param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 7
      // 005: aload 1
      // 006: getstatic ek6.gf1 Lek6;
      // 009: invokevirtual gyu.gzj (Lek6;)Ljava/util/List;
      // 00c: astore 8
      // 00e: aload 8
      // 010: invokeinterface java/util/List.isEmpty ()Z 1
      // 015: iload 7
      // 017: ifeq 035
      // 01a: ifne 26c
      // 01d: goto 024
      // 020: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 6
      // 026: invokevirtual java/util/Random.nextFloat ()F
      // 029: aload 1
      // 02a: invokevirtual gyu.uii ()F
      // 02d: fcmpg
      // 02e: goto 035
      // 031: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: ifge 26c
      // 038: aload 0
      // 039: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 03c: aload 8
      // 03e: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // 041: checkcast gyu$dwn
      // 044: astore 9
      // 046: aload 9
      // 048: getfield gyu$dwn.hpq I
      // 04b: aload 6
      // 04d: bipush 1
      // 04e: aload 9
      // 050: getfield gyu$dwn.fyi I
      // 053: iadd
      // 054: aload 9
      // 056: getfield gyu$dwn.hpq I
      // 059: isub
      // 05a: invokevirtual java/util/Random.nextInt (I)I
      // 05d: iadd
      // 05e: istore 10
      // 060: aconst_null
      // 061: astore 11
      // 063: iload 2
      // 064: aload 6
      // 066: iload 4
      // 068: invokevirtual java/util/Random.nextInt (I)I
      // 06b: iadd
      // 06c: istore 12
      // 06e: iload 3
      // 06f: aload 6
      // 071: iload 5
      // 073: invokevirtual java/util/Random.nextInt (I)I
      // 076: iadd
      // 077: istore 13
      // 079: iload 12
      // 07b: istore 14
      // 07d: iload 13
      // 07f: istore 15
      // 081: bipush 0
      // 082: istore 16
      // 084: iload 16
      // 086: iload 10
      // 088: if_icmpge 267
      // 08b: bipush 0
      // 08c: istore 17
      // 08e: bipush 0
      // 08f: iload 7
      // 091: ifeq 035
      // 094: istore 18
      // 096: iload 17
      // 098: ifne 25f
      // 09b: iload 18
      // 09d: bipush 4
      // 09e: iload 7
      // 0a0: ifeq 088
      // 0a3: if_icmpge 25f
      // 0a6: aload 0
      // 0a7: new mew
      // 0aa: dup
      // 0ab: iload 12
      // 0ad: bipush 0
      // 0ae: iload 13
      // 0b0: invokespecial mew.<init> (III)V
      // 0b3: invokevirtual OpaquePredicate.pnv (Lmew;)Lmew;
      // 0b6: astore 19
      // 0b8: getstatic yqv$b0p.tic Lyqv$b0p;
      // 0bb: aload 0
      // 0bc: aload 19
      // 0be: invokestatic v7y.nmh (Lyqv$b0p;Lt9d;Lmew;)Z
      // 0c1: iload 7
      // 0c3: ifeq 1d0
      // 0c6: ifeq 1ae
      // 0c9: goto 0d0
      // 0cc: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 9
      // 0d2: getfield gyu$dwn.w7j Ljava/lang/Class;
      // 0d5: bipush 1
      // 0d6: anewarray 311
      // 0d9: dup
      // 0da: bipush 0
      // 0db: ldc OpaquePredicate
      // 0dd: nop
      // 0de: aastore
      // 0df: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 0e2: bipush 1
      // 0e3: anewarray 8
      // 0e6: dup
      // 0e7: bipush 0
      // 0e8: aload 0
      // 0e9: aastore
      // 0ea: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 0ed: checkcast yqv
      // 0f0: astore 20
      // 0f2: goto 0ff
      // 0f5: astore 21
      // 0f7: aload 21
      // 0f9: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0fc: goto 257
      // 0ff: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_canEntitySpawn Lnet/optifine/reflect/ReflectorMethod;
      // 102: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 105: iload 7
      // 107: ifeq 1ac
      // 10a: ifeq 169
      // 10d: goto 114
      // 110: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_canEntitySpawn Lnet/optifine/reflect/ReflectorMethod;
      // 117: bipush 5
      // 118: anewarray 8
      // 11b: dup
      // 11c: bipush 0
      // 11d: aload 20
      // 11f: aastore
      // 120: dup
      // 121: bipush 1
      // 122: aload 0
      // 123: aastore
      // 124: dup
      // 125: bipush 2
      // 126: iload 12
      // 128: i2f
      // 129: ldc 0.5
      // 12b: nop
      // 12c: fadd
      // 12d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 130: aastore
      // 131: dup
      // 132: bipush 3
      // 133: aload 19
      // 135: invokevirtual mew.getY ()I
      // 138: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13b: aastore
      // 13c: dup
      // 13d: bipush 4
      // 13e: iload 13
      // 140: i2f
      // 141: ldc 0.5
      // 143: nop
      // 144: fadd
      // 145: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 148: aastore
      // 149: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 14c: astore 21
      // 14e: iload 7
      // 150: ifeq 1ab
      // 153: aload 21
      // 155: getstatic net/optifine/reflect/ReflectorForge.EVENT_RESULT_DENY Ljava/lang/Object;
      // 158: if_acmpne 169
      // 15b: goto 162
      // 15e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: goto 257
      // 165: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: aload 20
      // 16b: iload 12
      // 16d: i2f
      // 16e: ldc 0.5
      // 170: nop
      // 171: fadd
      // 172: f2d
      // 173: aload 19
      // 175: invokevirtual mew.getY ()I
      // 178: i2d
      // 179: iload 13
      // 17b: i2f
      // 17c: ldc 0.5
      // 17e: nop
      // 17f: fadd
      // 180: f2d
      // 181: aload 6
      // 183: invokevirtual java/util/Random.nextFloat ()F
      // 186: ldc 360.0
      // 188: nop
      // 189: fmul
      // 18a: fconst_0
      // 18b: invokevirtual yqv.x24 (DDDFF)V
      // 18e: aload 0
      // 18f: aload 20
      // 191: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 194: pop
      // 195: aload 20
      // 197: aload 0
      // 198: new mew
      // 19b: dup
      // 19c: aload 20
      // 19e: invokespecial mew.<init> (Li2h;)V
      // 1a1: invokevirtual OpaquePredicate.sms (Lmew;)Lcss;
      // 1a4: aload 11
      // 1a6: invokevirtual yqv.hx8 (Lcss;Lps6;)Lps6;
      // 1a9: astore 11
      // 1ab: bipush 1
      // 1ac: istore 17
      // 1ae: iload 12
      // 1b0: aload 6
      // 1b2: bipush 5
      // 1b3: invokevirtual java/util/Random.nextInt (I)I
      // 1b6: aload 6
      // 1b8: bipush 5
      // 1b9: invokevirtual java/util/Random.nextInt (I)I
      // 1bc: isub
      // 1bd: iadd
      // 1be: istore 12
      // 1c0: iload 13
      // 1c2: aload 6
      // 1c4: bipush 5
      // 1c5: invokevirtual java/util/Random.nextInt (I)I
      // 1c8: aload 6
      // 1ca: bipush 5
      // 1cb: invokevirtual java/util/Random.nextInt (I)I
      // 1ce: isub
      // 1cf: iadd
      // 1d0: istore 13
      // 1d2: iload 12
      // 1d4: iload 2
      // 1d5: if_icmplt 22e
      // 1d8: iload 12
      // 1da: iload 2
      // 1db: iload 4
      // 1dd: iadd
      // 1de: iload 7
      // 1e0: ifeq 24f
      // 1e3: iload 7
      // 1e5: ifeq 24f
      // 1e8: goto 1ef
      // 1eb: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: if_icmpge 22e
      // 1f2: goto 1f9
      // 1f5: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f8: athrow
      // 1f9: iload 13
      // 1fb: iload 3
      // 1fc: iload 7
      // 1fe: ifeq 24f
      // 201: goto 208
      // 204: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: if_icmplt 22e
      // 20b: goto 212
      // 20e: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 211: athrow
      // 212: iload 13
      // 214: iload 3
      // 215: iload 4
      // 217: iadd
      // 218: iload 7
      // 21a: ifeq 24f
      // 21d: goto 224
      // 220: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 223: athrow
      // 224: if_icmplt 257
      // 227: goto 22e
      // 22a: invokestatic v7y.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: iload 14
      // 230: aload 6
      // 232: bipush 5
      // 233: invokevirtual java/util/Random.nextInt (I)I
      // 236: iadd
      // 237: aload 6
      // 239: bipush 5
      // 23a: invokevirtual java/util/Random.nextInt (I)I
      // 23d: isub
      // 23e: istore 12
      // 240: iload 15
      // 242: aload 6
      // 244: bipush 5
      // 245: invokevirtual java/util/Random.nextInt (I)I
      // 248: iadd
      // 249: aload 6
      // 24b: bipush 5
      // 24c: invokevirtual java/util/Random.nextInt (I)I
      // 24f: isub
      // 250: istore 13
      // 252: iload 7
      // 254: ifne 1d2
      // 257: iinc 18 1
      // 25a: iload 7
      // 25c: ifne 096
      // 25f: iinc 16 1
      // 262: iload 7
      // 264: ifne 084
      // 267: iload 7
      // 269: ifne 024
      // 26c: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
