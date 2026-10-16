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

public class c7a extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 14008724996895L;
      return b<"c">(21803, 8210018509412406800L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 2490720624537L;
      return b<"c">(8908, 7313665519905815925L ^ var2);
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
      // 000: getstatic c7a.a J
      // 003: ldc2_w 9612486653530
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifeq 03e
      // 014: bipush 1
      // 015: if_icmpge 03d
      // 018: goto 01f
      // 01b: invokestatic c7a.a (Loov;)Loov;
      // 01e: athrow
      // 01f: new w57
      // 022: dup
      // 023: sipush 3218
      // 026: ldc2_w 2806065367099357929
      // 029: lload 3
      // 02a: lxor
      // 02b: invokedynamic c (IJ)Ljava/lang/String; bsm=c7a.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: bipush 0
      // 032: anewarray 39
      // 035: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 038: athrow
      // 039: invokestatic c7a.a (Loov;)Loov;
      // 03c: athrow
      // 03d: bipush 0
      // 03e: istore 6
      // 040: aload 2
      // 041: arraylength
      // 042: bipush 2
      // 043: iload 5
      // 045: ifeq 05c
      // 048: if_icmpeq 084
      // 04b: goto 052
      // 04e: invokestatic c7a.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 2
      // 053: arraylength
      // 054: bipush 4
      // 055: goto 05c
      // 058: invokestatic c7a.a (Loov;)Loov;
      // 05b: athrow
      // 05c: iload 5
      // 05e: ifeq 076
      // 061: if_icmpeq 084
      // 064: goto 06b
      // 067: invokestatic c7a.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 2
      // 06c: arraylength
      // 06d: bipush 6
      // 06f: goto 076
      // 072: invokestatic c7a.a (Loov;)Loov;
      // 075: athrow
      // 076: if_icmpeq 084
      // 079: aload 1
      // 07a: invokestatic c7a.cfc (Le7r;)Lz96;
      // 07d: astore 7
      // 07f: iload 5
      // 081: ifne 090
      // 084: aload 1
      // 085: aload 2
      // 086: bipush 0
      // 087: aaload
      // 088: invokestatic c7a.kot (Le7r;Ljava/lang/String;)Li2h;
      // 08b: astore 7
      // 08d: bipush 1
      // 08e: istore 6
      // 090: aload 2
      // 091: arraylength
      // 092: bipush 1
      // 093: iload 5
      // 095: ifeq 0ac
      // 098: if_icmpeq 3e0
      // 09b: goto 0a2
      // 09e: invokestatic c7a.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 2
      // 0a3: arraylength
      // 0a4: bipush 2
      // 0a5: goto 0ac
      // 0a8: invokestatic c7a.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 5
      // 0ae: ifeq 0c8
      // 0b1: if_icmpeq 3e0
      // 0b4: goto 0bb
      // 0b7: invokestatic c7a.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 2
      // 0bc: arraylength
      // 0bd: iload 6
      // 0bf: bipush 3
      // 0c0: iadd
      // 0c1: goto 0c8
      // 0c4: invokestatic c7a.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: if_icmpge 0e9
      // 0cb: new w57
      // 0ce: dup
      // 0cf: sipush 8908
      // 0d2: ldc2_w 7313659940984100022
      // 0d5: lload 3
      // 0d6: lxor
      // 0d7: invokedynamic c (IJ)Ljava/lang/String; bsm=c7a.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: nop
      // 0dd: bipush 0
      // 0de: anewarray 39
      // 0e1: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0e4: athrow
      // 0e5: invokestatic c7a.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 7
      // 0eb: getfield i2h.oay Lt9d;
      // 0ee: ifnull 4bc
      // 0f1: iload 6
      // 0f3: bipush 1
      // 0f4: iadd
      // 0f5: istore 8
      // 0f7: aload 7
      // 0f9: getfield i2h.o2v D
      // 0fc: aload 2
      // 0fd: iload 6
      // 0ff: aaload
      // 100: bipush 1
      // 101: invokestatic c7a.x3v (DLjava/lang/String;Z)Lbc_$fod;
      // 104: astore 9
      // 106: aload 7
      // 108: getfield i2h.kfp D
      // 10b: aload 2
      // 10c: iload 8
      // 10e: iinc 8 1
      // 111: aaload
      // 112: bipush 0
      // 113: bipush 0
      // 114: bipush 0
      // 115: invokestatic c7a.xz0 (DLjava/lang/String;IIZ)Lbc_$fod;
      // 118: astore 10
      // 11a: aload 7
      // 11c: getfield i2h.vbd D
      // 11f: aload 2
      // 120: iload 8
      // 122: iinc 8 1
      // 125: aaload
      // 126: bipush 1
      // 127: invokestatic c7a.x3v (DLjava/lang/String;Z)Lbc_$fod;
      // 12a: astore 11
      // 12c: aload 7
      // 12e: getfield i2h.x5k F
      // 131: f2d
      // 132: aload 2
      // 133: iload 5
      // 135: ifeq 14d
      // 138: arraylength
      // 139: iload 8
      // 13b: if_icmple 156
      // 13e: goto 145
      // 141: invokestatic c7a.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 2
      // 146: goto 14d
      // 149: invokestatic c7a.a (Loov;)Loov;
      // 14c: athrow
      // 14d: iload 8
      // 14f: iinc 8 1
      // 152: aaload
      // 153: goto 159
      // 156: ldc "~"
      // 158: nop
      // 159: bipush 0
      // 15a: invokestatic c7a.x3v (DLjava/lang/String;Z)Lbc_$fod;
      // 15d: astore 12
      // 15f: aload 7
      // 161: getfield i2h.y2i F
      // 164: f2d
      // 165: aload 2
      // 166: iload 5
      // 168: ifeq 180
      // 16b: arraylength
      // 16c: iload 8
      // 16e: if_icmple 186
      // 171: goto 178
      // 174: invokestatic c7a.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 2
      // 179: goto 180
      // 17c: invokestatic c7a.a (Loov;)Loov;
      // 17f: athrow
      // 180: iload 8
      // 182: aaload
      // 183: goto 189
      // 186: ldc "~"
      // 188: nop
      // 189: bipush 0
      // 18a: invokestatic c7a.x3v (DLjava/lang/String;Z)Lbc_$fod;
      // 18d: astore 13
      // 18f: aload 7
      // 191: instanceof z96
      // 194: ifeq 31f
      // 197: ldc net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv
      // 199: nop
      // 19a: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 19d: astore 14
      // 19f: aload 9
      // 1a1: invokevirtual bc_$fod.yee ()Z
      // 1a4: iload 5
      // 1a6: ifeq 1ca
      // 1a9: ifeq 1c5
      // 1ac: goto 1b3
      // 1af: invokestatic c7a.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 14
      // 1b5: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.uws Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 1b8: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1bd: pop
      // 1be: goto 1c5
      // 1c1: invokestatic c7a.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 10
      // 1c7: invokevirtual bc_$fod.yee ()Z
      // 1ca: iload 5
      // 1cc: ifeq 1f0
      // 1cf: ifeq 1eb
      // 1d2: goto 1d9
      // 1d5: invokestatic c7a.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 14
      // 1db: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.yu5 Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 1de: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1e3: pop
      // 1e4: goto 1eb
      // 1e7: invokestatic c7a.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: aload 11
      // 1ed: invokevirtual bc_$fod.yee ()Z
      // 1f0: iload 5
      // 1f2: ifeq 216
      // 1f5: ifeq 211
      // 1f8: goto 1ff
      // 1fb: invokestatic c7a.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: aload 14
      // 201: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.qh1 Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 204: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 209: pop
      // 20a: goto 211
      // 20d: invokestatic c7a.a (Loov;)Loov;
      // 210: athrow
      // 211: aload 13
      // 213: invokevirtual bc_$fod.yee ()Z
      // 216: iload 5
      // 218: ifeq 248
      // 21b: ifeq 237
      // 21e: goto 225
      // 221: invokestatic c7a.a (Loov;)Loov;
      // 224: athrow
      // 225: aload 14
      // 227: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.ybj Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 22a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 22f: pop
      // 230: goto 237
      // 233: invokestatic c7a.a (Loov;)Loov;
      // 236: athrow
      // 237: aload 12
      // 239: iload 5
      // 23b: ifeq 25f
      // 23e: invokevirtual bc_$fod.yee ()Z
      // 241: goto 248
      // 244: invokestatic c7a.a (Loov;)Loov;
      // 247: athrow
      // 248: ifeq 25d
      // 24b: aload 14
      // 24d: getstatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.a76 Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 250: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 255: pop
      // 256: goto 25d
      // 259: invokestatic c7a.a (Loov;)Loov;
      // 25c: athrow
      // 25d: aload 12
      // 25f: invokevirtual bc_$fod.mqk ()D
      // 262: d2f
      // 263: fstore 15
      // 265: aload 12
      // 267: iload 5
      // 269: ifeq 282
      // 26c: invokevirtual bc_$fod.yee ()Z
      // 26f: ifne 280
      // 272: goto 279
      // 275: invokestatic c7a.a (Loov;)Loov;
      // 278: athrow
      // 279: fload 15
      // 27b: invokestatic fe6.qsy (F)F
      // 27e: fstore 15
      // 280: aload 13
      // 282: invokevirtual bc_$fod.mqk ()D
      // 285: d2f
      // 286: fstore 16
      // 288: aload 13
      // 28a: invokevirtual bc_$fod.yee ()Z
      // 28d: iload 5
      // 28f: ifeq 2b5
      // 292: ifne 2a3
      // 295: goto 29c
      // 298: invokestatic c7a.a (Loov;)Loov;
      // 29b: athrow
      // 29c: fload 16
      // 29e: invokestatic fe6.qsy (F)F
      // 2a1: fstore 16
      // 2a3: fload 16
      // 2a5: ldc 90.0
      // 2a7: nop
      // 2a8: iload 5
      // 2aa: ifeq 2e4
      // 2ad: fcmpl
      // 2ae: goto 2b5
      // 2b1: invokestatic c7a.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: ifgt 2d4
      // 2b8: fload 16
      // 2ba: ldc -90.0
      // 2bc: nop
      // 2bd: iload 5
      // 2bf: ifeq 2e4
      // 2c2: goto 2c9
      // 2c5: invokestatic c7a.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: fcmpg
      // 2ca: ifge 2ea
      // 2cd: goto 2d4
      // 2d0: invokestatic c7a.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: ldc 180.0
      // 2d6: nop
      // 2d7: fload 16
      // 2d9: fsub
      // 2da: invokestatic fe6.qsy (F)F
      // 2dd: fstore 16
      // 2df: fload 15
      // 2e1: ldc 180.0
      // 2e3: nop
      // 2e4: fadd
      // 2e5: invokestatic fe6.qsy (F)F
      // 2e8: fstore 15
      // 2ea: aload 7
      // 2ec: aconst_null
      // 2ed: checkcast i2h
      // 2f0: invokevirtual i2h.nw9 (Li2h;)V
      // 2f3: aload 7
      // 2f5: checkcast z96
      // 2f8: getfield z96.rhh Lmlk;
      // 2fb: aload 9
      // 2fd: invokevirtual bc_$fod.mqk ()D
      // 300: aload 10
      // 302: invokevirtual bc_$fod.mqk ()D
      // 305: aload 11
      // 307: invokevirtual bc_$fod.mqk ()D
      // 30a: fload 15
      // 30c: fload 16
      // 30e: aload 14
      // 310: invokevirtual mlk.imd (DDDFFLjava/util/Set;)V
      // 313: aload 7
      // 315: fload 15
      // 317: invokevirtual i2h.jo1 (F)V
      // 31a: iload 5
      // 31c: ifne 39b
      // 31f: aload 12
      // 321: invokevirtual bc_$fod.bz1 ()D
      // 324: invokestatic fe6.lrs (D)D
      // 327: d2f
      // 328: fstore 14
      // 32a: aload 13
      // 32c: invokevirtual bc_$fod.bz1 ()D
      // 32f: invokestatic fe6.lrs (D)D
      // 332: d2f
      // 333: fstore 15
      // 335: fload 15
      // 337: ldc 90.0
      // 339: nop
      // 33a: iload 5
      // 33c: ifeq 376
      // 33f: fcmpl
      // 340: ifgt 366
      // 343: goto 34a
      // 346: invokestatic c7a.a (Loov;)Loov;
      // 349: athrow
      // 34a: fload 15
      // 34c: ldc -90.0
      // 34e: nop
      // 34f: iload 5
      // 351: ifeq 376
      // 354: goto 35b
      // 357: invokestatic c7a.a (Loov;)Loov;
      // 35a: athrow
      // 35b: fcmpg
      // 35c: ifge 37c
      // 35f: goto 366
      // 362: invokestatic c7a.a (Loov;)Loov;
      // 365: athrow
      // 366: ldc 180.0
      // 368: nop
      // 369: fload 15
      // 36b: fsub
      // 36c: invokestatic fe6.qsy (F)F
      // 36f: fstore 15
      // 371: fload 14
      // 373: ldc 180.0
      // 375: nop
      // 376: fadd
      // 377: invokestatic fe6.qsy (F)F
      // 37a: fstore 14
      // 37c: aload 7
      // 37e: aload 9
      // 380: invokevirtual bc_$fod.bz1 ()D
      // 383: aload 10
      // 385: invokevirtual bc_$fod.bz1 ()D
      // 388: aload 11
      // 38a: invokevirtual bc_$fod.bz1 ()D
      // 38d: fload 14
      // 38f: fload 15
      // 391: invokevirtual i2h.x24 (DDDFF)V
      // 394: aload 7
      // 396: fload 14
      // 398: invokevirtual i2h.jo1 (F)V
      // 39b: aload 1
      // 39c: aload 0
      // 39d: sipush 29078
      // 3a0: ldc2_w 6906464252359362537
      // 3a3: lload 3
      // 3a4: lxor
      // 3a5: invokedynamic c (IJ)Ljava/lang/String; bsm=c7a.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3aa: nop
      // 3ab: bipush 4
      // 3ac: anewarray 39
      // 3af: dup
      // 3b0: bipush 0
      // 3b1: aload 7
      // 3b3: invokevirtual i2h.noc ()Ljava/lang/String;
      // 3b6: aastore
      // 3b7: dup
      // 3b8: bipush 1
      // 3b9: aload 9
      // 3bb: invokevirtual bc_$fod.bz1 ()D
      // 3be: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3c1: aastore
      // 3c2: dup
      // 3c3: bipush 2
      // 3c4: aload 10
      // 3c6: invokevirtual bc_$fod.bz1 ()D
      // 3c9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3cc: aastore
      // 3cd: dup
      // 3ce: bipush 3
      // 3cf: aload 11
      // 3d1: invokevirtual bc_$fod.bz1 ()D
      // 3d4: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 3d7: aastore
      // 3d8: invokestatic c7a.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 3db: iload 5
      // 3dd: ifne 4bc
      // 3e0: aload 1
      // 3e1: aload 2
      // 3e2: aload 2
      // 3e3: arraylength
      // 3e4: bipush 1
      // 3e5: isub
      // 3e6: aaload
      // 3e7: invokestatic c7a.kot (Le7r;Ljava/lang/String;)Li2h;
      // 3ea: astore 8
      // 3ec: aload 8
      // 3ee: iload 5
      // 3f0: ifeq 42e
      // 3f3: getfield i2h.oay Lt9d;
      // 3f6: aload 7
      // 3f8: getfield i2h.oay Lt9d;
      // 3fb: if_acmpeq 423
      // 3fe: goto 405
      // 401: invokestatic c7a.a (Loov;)Loov;
      // 404: athrow
      // 405: new uvb
      // 408: dup
      // 409: sipush 32376
      // 40c: ldc2_w 3401816276452755460
      // 40f: lload 3
      // 410: lxor
      // 411: invokedynamic c (IJ)Ljava/lang/String; bsm=c7a.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 416: nop
      // 417: bipush 0
      // 418: anewarray 39
      // 41b: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 41e: athrow
      // 41f: invokestatic c7a.a (Loov;)Loov;
      // 422: athrow
      // 423: aload 7
      // 425: aconst_null
      // 426: checkcast i2h
      // 429: invokevirtual i2h.nw9 (Li2h;)V
      // 42c: aload 7
      // 42e: iload 5
      // 430: ifeq 479
      // 433: instanceof z96
      // 436: ifeq 470
      // 439: goto 440
      // 43c: invokestatic c7a.a (Loov;)Loov;
      // 43f: athrow
      // 440: aload 7
      // 442: checkcast z96
      // 445: getfield z96.rhh Lmlk;
      // 448: aload 8
      // 44a: getfield i2h.o2v D
      // 44d: aload 8
      // 44f: getfield i2h.kfp D
      // 452: aload 8
      // 454: getfield i2h.vbd D
      // 457: aload 8
      // 459: getfield i2h.x5k F
      // 45c: aload 8
      // 45e: getfield i2h.y2i F
      // 461: invokevirtual mlk.ymx (DDDFF)V
      // 464: iload 5
      // 466: ifne 495
      // 469: goto 470
      // 46c: invokestatic c7a.a (Loov;)Loov;
      // 46f: athrow
      // 470: aload 7
      // 472: goto 479
      // 475: invokestatic c7a.a (Loov;)Loov;
      // 478: athrow
      // 479: aload 8
      // 47b: getfield i2h.o2v D
      // 47e: aload 8
      // 480: getfield i2h.kfp D
      // 483: aload 8
      // 485: getfield i2h.vbd D
      // 488: aload 8
      // 48a: getfield i2h.x5k F
      // 48d: aload 8
      // 48f: getfield i2h.y2i F
      // 492: invokevirtual i2h.x24 (DDDFF)V
      // 495: aload 1
      // 496: aload 0
      // 497: sipush 20794
      // 49a: ldc2_w 4508831476733077319
      // 49d: lload 3
      // 49e: lxor
      // 49f: invokedynamic c (IJ)Ljava/lang/String; bsm=c7a.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a4: nop
      // 4a5: bipush 2
      // 4a6: anewarray 39
      // 4a9: dup
      // 4aa: bipush 0
      // 4ab: aload 7
      // 4ad: invokevirtual i2h.noc ()Ljava/lang/String;
      // 4b0: aastore
      // 4b1: dup
      // 4b2: bipush 1
      // 4b3: aload 8
      // 4b5: invokevirtual i2h.noc ()Ljava/lang/String;
      // 4b8: aastore
      // 4b9: invokestatic c7a.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 4bc: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifeq 39
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpeq 38
      // 10: goto 17
      // 13: invokestatic c7a.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: iload 4
      // 1a: ifeq 39
      // 1d: goto 24
      // 20: invokestatic c7a.a (Loov;)Loov;
      // 23: athrow
      // 24: arraylength
      // 25: bipush 2
      // 26: if_icmpeq 38
      // 29: goto 30
      // 2c: invokestatic c7a.a (Loov;)Loov;
      // 2f: athrow
      // 30: aconst_null
      // 31: goto 42
      // 34: invokestatic c7a.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 2
      // 39: invokestatic vr1._0v ()Lvr1;
      // 3c: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 3f: invokestatic c7a.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 42: areturn
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2442408963741847649L, 7315376809407608480L, MethodHandles.lookup().lookupClass()).a(82836020605505L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 63184835507692L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "d\"o\u0011ßÍä\u0094b\u0005Å\r%þN¤ Á±hÅ\u001dE\u009e¦CTSe\u008ab\u008aLX\u008dnq\u009e<cåt\u001d\u0016T^KD\u0010\u000eÐ\u0094ïÌ\u009b\u0010áóÐéB\u0007Ú>9(=\u0002\u0085Z^\u007fA\u0000\u0001\u0006Q\u001e¤\u0090µô\u009dV 0´è¼S!\u0090ddÈ2\u0004Ì\u0010z/À/½^R0\u0085û\u0096å\"*ë\u008e4´·\u0084`1\u0016\u008cæD\u0091P@ÞÃâA\u00056\u0002\u0080\u0003k+\u0011\u0016\u0099JÐ²{¶Ø\u008e½Ä¬eÇp";
      int var8 = "d\"o\u0011ßÍä\u0094b\u0005Å\r%þN¤ Á±hÅ\u001dE\u009e¦CTSe\u008ab\u008aLX\u008dnq\u009e<cåt\u001d\u0016T^KD\u0010\u000eÐ\u0094ïÌ\u009b\u0010áóÐéB\u0007Ú>9(=\u0002\u0085Z^\u007fA\u0000\u0001\u0006Q\u001e¤\u0090µô\u009dV 0´è¼S!\u0090ddÈ2\u0004Ì\u0010z/À/½^R0\u0085û\u0096å\"*ë\u008e4´·\u0084`1\u0016\u008cæD\u0091P@ÞÃâA\u00056\u0002\u0080\u0003k+\u0011\u0016\u0099JÐ²{¶Ø\u008e½Ä¬eÇp"
         .length();
      char var5 = '0';
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
                     g = new String[6];
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

                  var6 = "\u0082\u009f¯¾\u0093Ò\râ3?\u001a\u0083JÀ\u0095éð\u000b\u0094ÛÃç\u0002\u009aÃ«cv\u0001\u008a\u0086`ü$N\u0081ù\u009d<º(\u008b2Ê\rÒó¿\u0081îl£4ýpjþMdÏöÂòU=¬ýÐî¯\u000fëÒ¢0ï\u0090³\u0014¶X";
                  var8 = "\u0082\u009f¯¾\u0093Ò\râ3?\u001a\u0083JÀ\u0095éð\u000b\u0094ÛÃç\u0002\u009aÃ«cv\u0001\u008a\u0086`ü$N\u0081ù\u009d<º(\u008b2Ê\rÒó¿\u0081îl£4ýpjþMdÏöÂòU=¬ýÐî¯\u000fëÒ¢0ï\u0090³\u0014¶X"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6689;
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
            throw new RuntimeException("c7a", var10);
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
         throw new RuntimeException("c7a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
