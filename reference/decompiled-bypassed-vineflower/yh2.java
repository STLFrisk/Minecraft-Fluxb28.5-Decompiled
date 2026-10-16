import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Cylinder;

public class yh2 extends ar7 {
   private static final long a;
   private static final String f;

   public yh2() {
      long var1 = a ^ 5887553659409L;
      super(f, _aj.sxc, false, new j1s[0]);
   }

   @jev
   public void sq8(b5k param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 3
      // 002: fconst_0
      // 003: fstore 4
      // 005: invokestatic t9d.c ()I
      // 008: ldc 1.5
      // 00a: nop
      // 00b: fstore 5
      // 00d: istore 2
      // 00e: ldc 0.99
      // 010: nop
      // 011: fstore 6
      // 013: aload 0
      // 014: pop
      // 015: getstatic yh2.ek1 Lc05;
      // 018: getfield c05.vg8 Ll86;
      // 01b: invokevirtual l86.b5z ()Lerg;
      // 01e: iload 2
      // 01f: ifne 03e
      // 022: ifnull 6cd
      // 025: goto 02c
      // 028: invokestatic yh2.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: pop
      // 02e: getstatic yh2.ek1 Lc05;
      // 031: getfield c05.vg8 Ll86;
      // 034: invokevirtual l86.b5z ()Lerg;
      // 037: goto 03e
      // 03a: invokestatic yh2.a (Loov;)Loov;
      // 03d: athrow
      // 03e: invokevirtual erg.gn1 ()Lu7m;
      // 041: astore 7
      // 043: aload 7
      // 045: instanceof r5m
      // 048: iload 2
      // 049: ifne 0c7
      // 04c: ifeq 0bb
      // 04f: goto 056
      // 052: invokestatic yh2.a (Loov;)Loov;
      // 055: athrow
      // 056: bipush 1
      // 057: istore 3
      // 058: ldc 0.05
      // 05a: nop
      // 05b: fstore 8
      // 05d: ldc 0.3
      // 05f: nop
      // 060: fstore 9
      // 062: aload 0
      // 063: pop
      // 064: getstatic yh2.ek1 Lc05;
      // 067: getfield c05.vg8 Ll86;
      // 06a: invokevirtual l86.bbq ()I
      // 06d: i2f
      // 06e: ldc 20.0
      // 070: nop
      // 071: fdiv
      // 072: fstore 10
      // 074: fload 10
      // 076: fload 10
      // 078: fmul
      // 079: fload 10
      // 07b: fconst_2
      // 07c: fmul
      // 07d: fadd
      // 07e: ldc 3.0
      // 080: nop
      // 081: fdiv
      // 082: fstore 10
      // 084: fload 10
      // 086: f2d
      // 087: ldc2_w 0.1
      // 08a: dcmpg
      // 08b: iload 2
      // 08c: ifne 0a9
      // 08f: ifge 09a
      // 092: goto 099
      // 095: invokestatic yh2.a (Loov;)Loov;
      // 098: athrow
      // 099: return
      // 09a: fload 10
      // 09c: fconst_1
      // 09d: iload 2
      // 09e: ifne 0b4
      // 0a1: fcmpl
      // 0a2: goto 0a9
      // 0a5: invokestatic yh2.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifle 0af
      // 0ac: fconst_1
      // 0ad: fstore 10
      // 0af: fload 10
      // 0b1: ldc 3.0
      // 0b3: nop
      // 0b4: fmul
      // 0b5: fstore 5
      // 0b7: iload 2
      // 0b8: ifeq 174
      // 0bb: aload 7
      // 0bd: instanceof yab
      // 0c0: goto 0c7
      // 0c3: invokestatic yh2.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: iload 2
      // 0c8: ifne 100
      // 0cb: ifeq 0e8
      // 0ce: goto 0d5
      // 0d1: invokestatic yh2.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: ldc 0.04
      // 0d7: nop
      // 0d8: fstore 8
      // 0da: ldc 0.25
      // 0dc: nop
      // 0dd: fstore 9
      // 0df: ldc 0.92
      // 0e1: nop
      // 0e2: fstore 6
      // 0e4: iload 2
      // 0e5: ifeq 174
      // 0e8: aload 0
      // 0e9: pop
      // 0ea: getstatic yh2.ek1 Lc05;
      // 0ed: getfield c05.vg8 Ll86;
      // 0f0: invokevirtual l86.b5z ()Lerg;
      // 0f3: invokevirtual erg.j6_ ()I
      // 0f6: invokestatic dgn.rri (I)Z
      // 0f9: goto 100
      // 0fc: invokestatic yh2.a (Loov;)Loov;
      // 0ff: athrow
      // 100: iload 2
      // 101: ifne 132
      // 104: ifeq 126
      // 107: goto 10e
      // 10a: invokestatic yh2.a (Loov;)Loov;
      // 10d: athrow
      // 10e: ldc 0.05
      // 110: nop
      // 111: fstore 8
      // 113: ldc 0.25
      // 115: nop
      // 116: fstore 9
      // 118: ldc -20.0
      // 11a: nop
      // 11b: fstore 4
      // 11d: ldc 0.5
      // 11f: nop
      // 120: fstore 5
      // 122: iload 2
      // 123: ifeq 174
      // 126: aload 7
      // 128: instanceof t4j
      // 12b: goto 132
      // 12e: invokestatic yh2.a (Loov;)Loov;
      // 131: athrow
      // 132: iload 2
      // 133: ifne 14c
      // 136: ifne 16a
      // 139: goto 140
      // 13c: invokestatic yh2.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 7
      // 142: instanceof yuq
      // 145: goto 14c
      // 148: invokestatic yh2.a (Loov;)Loov;
      // 14b: athrow
      // 14c: iload 2
      // 14d: ifne 166
      // 150: ifne 16a
      // 153: goto 15a
      // 156: invokestatic yh2.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 7
      // 15c: instanceof ckl
      // 15f: goto 166
      // 162: invokestatic yh2.a (Loov;)Loov;
      // 165: athrow
      // 166: ifne 16a
      // 169: return
      // 16a: ldc 0.03
      // 16c: nop
      // 16d: fstore 8
      // 16f: ldc 0.25
      // 171: nop
      // 172: fstore 9
      // 174: aload 0
      // 175: pop
      // 176: getstatic yh2.ek1 Lc05;
      // 179: invokevirtual c05.ibs ()Lhr_;
      // 17c: invokevirtual hr_.yky ()D
      // 17f: aload 0
      // 180: pop
      // 181: getstatic yh2.ek1 Lc05;
      // 184: getfield c05.vg8 Ll86;
      // 187: getfield l86.x5k F
      // 18a: ldc 180.0
      // 18c: nop
      // 18d: fdiv
      // 18e: ldc 3.1415927
      // 190: nop
      // 191: fmul
      // 192: invokestatic fe6.ssk (F)F
      // 195: ldc 0.16
      // 197: nop
      // 198: fmul
      // 199: f2d
      // 19a: dsub
      // 19b: dstore 10
      // 19d: aload 0
      // 19e: pop
      // 19f: getstatic yh2.ek1 Lc05;
      // 1a2: invokevirtual c05.ibs ()Lhr_;
      // 1a5: invokevirtual hr_.fxk ()D
      // 1a8: aload 0
      // 1a9: pop
      // 1aa: getstatic yh2.ek1 Lc05;
      // 1ad: getfield c05.vg8 Ll86;
      // 1b0: invokevirtual l86.c5y ()F
      // 1b3: f2d
      // 1b4: dadd
      // 1b5: ldc2_w 0.10000000149011612
      // 1b8: dsub
      // 1b9: dstore 12
      // 1bb: aload 0
      // 1bc: pop
      // 1bd: getstatic yh2.ek1 Lc05;
      // 1c0: invokevirtual c05.ibs ()Lhr_;
      // 1c3: invokevirtual hr_.kux ()D
      // 1c6: aload 0
      // 1c7: pop
      // 1c8: getstatic yh2.ek1 Lc05;
      // 1cb: getfield c05.vg8 Ll86;
      // 1ce: getfield l86.x5k F
      // 1d1: ldc 180.0
      // 1d3: nop
      // 1d4: fdiv
      // 1d5: ldc 3.1415927
      // 1d7: nop
      // 1d8: fmul
      // 1d9: invokestatic fe6.rtn (F)F
      // 1dc: ldc 0.16
      // 1de: nop
      // 1df: fmul
      // 1e0: f2d
      // 1e1: dsub
      // 1e2: dstore 14
      // 1e4: aload 0
      // 1e5: pop
      // 1e6: getstatic yh2.ek1 Lc05;
      // 1e9: getfield c05.vg8 Ll86;
      // 1ec: getfield l86.x5k F
      // 1ef: ldc 180.0
      // 1f1: nop
      // 1f2: fdiv
      // 1f3: ldc 3.1415927
      // 1f5: nop
      // 1f6: fmul
      // 1f7: invokestatic fe6.rtn (F)F
      // 1fa: fneg
      // 1fb: aload 0
      // 1fc: pop
      // 1fd: getstatic yh2.ek1 Lc05;
      // 200: getfield c05.vg8 Ll86;
      // 203: getfield l86.y2i F
      // 206: ldc 180.0
      // 208: nop
      // 209: fdiv
      // 20a: ldc 3.1415927
      // 20c: nop
      // 20d: fmul
      // 20e: invokestatic fe6.ssk (F)F
      // 211: fmul
      // 212: f2d
      // 213: iload 3
      // 214: ifeq 21f
      // 217: dconst_1
      // 218: goto 222
      // 21b: invokestatic yh2.a (Loov;)Loov;
      // 21e: athrow
      // 21f: ldc2_w 0.4
      // 222: dmul
      // 223: dstore 16
      // 225: aload 0
      // 226: pop
      // 227: getstatic yh2.ek1 Lc05;
      // 22a: getfield c05.vg8 Ll86;
      // 22d: getfield l86.y2i F
      // 230: fload 4
      // 232: fadd
      // 233: ldc 180.0
      // 235: nop
      // 236: fdiv
      // 237: ldc 3.1415927
      // 239: nop
      // 23a: fmul
      // 23b: invokestatic fe6.rtn (F)F
      // 23e: fneg
      // 23f: f2d
      // 240: iload 3
      // 241: ifeq 24c
      // 244: dconst_1
      // 245: goto 24f
      // 248: invokestatic yh2.a (Loov;)Loov;
      // 24b: athrow
      // 24c: ldc2_w 0.4
      // 24f: dmul
      // 250: dstore 18
      // 252: aload 0
      // 253: pop
      // 254: getstatic yh2.ek1 Lc05;
      // 257: getfield c05.vg8 Ll86;
      // 25a: getfield l86.x5k F
      // 25d: ldc 180.0
      // 25f: nop
      // 260: fdiv
      // 261: ldc 3.1415927
      // 263: nop
      // 264: fmul
      // 265: invokestatic fe6.ssk (F)F
      // 268: aload 0
      // 269: pop
      // 26a: getstatic yh2.ek1 Lc05;
      // 26d: getfield c05.vg8 Ll86;
      // 270: getfield l86.y2i F
      // 273: ldc 180.0
      // 275: nop
      // 276: fdiv
      // 277: ldc 3.1415927
      // 279: nop
      // 27a: fmul
      // 27b: invokestatic fe6.ssk (F)F
      // 27e: fmul
      // 27f: f2d
      // 280: iload 3
      // 281: ifeq 28c
      // 284: dconst_1
      // 285: goto 28f
      // 288: invokestatic yh2.a (Loov;)Loov;
      // 28b: athrow
      // 28c: ldc2_w 0.4
      // 28f: dmul
      // 290: dstore 20
      // 292: dload 16
      // 294: dload 16
      // 296: dmul
      // 297: dload 18
      // 299: dload 18
      // 29b: dmul
      // 29c: dadd
      // 29d: dload 20
      // 29f: dload 20
      // 2a1: dmul
      // 2a2: dadd
      // 2a3: invokestatic fe6.dii (D)F
      // 2a6: fstore 22
      // 2a8: dload 16
      // 2aa: fload 22
      // 2ac: f2d
      // 2ad: ddiv
      // 2ae: dstore 16
      // 2b0: dload 18
      // 2b2: fload 22
      // 2b4: f2d
      // 2b5: ddiv
      // 2b6: dstore 18
      // 2b8: dload 20
      // 2ba: fload 22
      // 2bc: f2d
      // 2bd: ddiv
      // 2be: dstore 20
      // 2c0: dload 16
      // 2c2: fload 5
      // 2c4: f2d
      // 2c5: dmul
      // 2c6: dstore 16
      // 2c8: dload 18
      // 2ca: fload 5
      // 2cc: f2d
      // 2cd: dmul
      // 2ce: dstore 18
      // 2d0: dload 20
      // 2d2: fload 5
      // 2d4: f2d
      // 2d5: dmul
      // 2d6: dstore 20
      // 2d8: aconst_null
      // 2d9: astore 23
      // 2db: bipush 0
      // 2dc: istore 24
      // 2de: bipush 0
      // 2df: istore 25
      // 2e1: bipush 1
      // 2e2: invokestatic mkt.bta (Z)V
      // 2e5: new java/awt/Color
      // 2e8: dup
      // 2e9: sipush 206
      // 2ec: bipush 89
      // 2ee: sipush 255
      // 2f1: sipush 255
      // 2f4: invokespecial java/awt/Color.<init> (IIII)V
      // 2f7: invokevirtual java/awt/Color.getRGB ()I
      // 2fa: invokestatic mkt.v_1 (I)V
      // 2fd: fconst_2
      // 2fe: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 301: bipush 3
      // 302: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 305: iload 24
      // 307: ifne 555
      // 30a: dload 12
      // 30c: dconst_0
      // 30d: iload 2
      // 30e: ifne 577
      // 311: dcmpl
      // 312: iload 2
      // 313: ifne 6ca
      // 316: goto 31d
      // 319: invokestatic yh2.a (Loov;)Loov;
      // 31c: athrow
      // 31d: ifle 555
      // 320: goto 327
      // 323: invokestatic yh2.a (Loov;)Loov;
      // 326: athrow
      // 327: new fqr
      // 32a: dup
      // 32b: dload 10
      // 32d: dload 12
      // 32f: dload 14
      // 331: invokespecial fqr.<init> (DDD)V
      // 334: astore 26
      // 336: new fqr
      // 339: dup
      // 33a: dload 10
      // 33c: dload 16
      // 33e: dadd
      // 33f: dload 12
      // 341: dload 18
      // 343: dadd
      // 344: dload 14
      // 346: dload 20
      // 348: dadd
      // 349: invokespecial fqr.<init> (DDD)V
      // 34c: astore 27
      // 34e: aload 0
      // 34f: pop
      // 350: getstatic yh2.ek1 Lc05;
      // 353: getfield c05.tij Lkh3;
      // 356: aload 26
      // 358: aload 27
      // 35a: bipush 0
      // 35b: bipush 1
      // 35c: bipush 0
      // 35d: invokevirtual kh3.xjc (Lfqr;Lfqr;ZZZ)Lakm;
      // 360: astore 23
      // 362: new fqr
      // 365: dup
      // 366: dload 10
      // 368: dload 12
      // 36a: dload 14
      // 36c: invokespecial fqr.<init> (DDD)V
      // 36f: astore 26
      // 371: new fqr
      // 374: dup
      // 375: dload 10
      // 377: dload 16
      // 379: dadd
      // 37a: dload 12
      // 37c: dload 18
      // 37e: dadd
      // 37f: dload 14
      // 381: dload 20
      // 383: dadd
      // 384: invokespecial fqr.<init> (DDD)V
      // 387: astore 27
      // 389: iload 2
      // 38a: ifne 39c
      // 38d: aload 23
      // 38f: ifnull 3bd
      // 392: goto 399
      // 395: invokestatic yh2.a (Loov;)Loov;
      // 398: athrow
      // 399: bipush 1
      // 39a: istore 24
      // 39c: new fqr
      // 39f: dup
      // 3a0: aload 23
      // 3a2: getfield akm.jhn Lfqr;
      // 3a5: getfield fqr.lvi D
      // 3a8: aload 23
      // 3aa: getfield akm.jhn Lfqr;
      // 3ad: getfield fqr.gn5 D
      // 3b0: aload 23
      // 3b2: getfield akm.jhn Lfqr;
      // 3b5: getfield fqr.bn2 D
      // 3b8: invokespecial fqr.<init> (DDD)V
      // 3bb: astore 27
      // 3bd: new nh4
      // 3c0: dup
      // 3c1: dload 10
      // 3c3: fload 9
      // 3c5: f2d
      // 3c6: dsub
      // 3c7: dload 12
      // 3c9: fload 9
      // 3cb: f2d
      // 3cc: dsub
      // 3cd: dload 14
      // 3cf: fload 9
      // 3d1: f2d
      // 3d2: dsub
      // 3d3: dload 10
      // 3d5: fload 9
      // 3d7: f2d
      // 3d8: dadd
      // 3d9: dload 12
      // 3db: fload 9
      // 3dd: f2d
      // 3de: dadd
      // 3df: dload 14
      // 3e1: fload 9
      // 3e3: f2d
      // 3e4: dadd
      // 3e5: invokespecial nh4.<init> (DDDDDD)V
      // 3e8: astore 28
      // 3ea: aload 0
      // 3eb: aload 28
      // 3ed: dload 16
      // 3ef: dload 18
      // 3f1: dload 20
      // 3f3: invokevirtual nh4.z9h (DDD)Lnh4;
      // 3f6: dconst_1
      // 3f7: dconst_1
      // 3f8: dconst_1
      // 3f9: invokevirtual nh4.c2h (DDD)Lnh4;
      // 3fc: invokespecial yh2.fmp (Lnh4;)Ljava/util/List;
      // 3ff: astore 29
      // 401: bipush 0
      // 402: istore 30
      // 404: iload 30
      // 406: aload 29
      // 408: invokeinterface java/util/List.size ()I 1
      // 40d: if_icmpge 49a
      // 410: aload 29
      // 412: iload 30
      // 414: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 419: checkcast i2h
      // 41c: astore 31
      // 41e: iload 2
      // 41f: ifne 496
      // 422: aload 31
      // 424: invokevirtual i2h.mzu ()Z
      // 427: iload 2
      // 428: ifne 307
      // 42b: goto 432
      // 42e: invokestatic yh2.a (Loov;)Loov;
      // 431: athrow
      // 432: ifeq 493
      // 435: aload 31
      // 437: aload 0
      // 438: pop
      // 439: iload 2
      // 43a: ifne 45d
      // 43d: goto 444
      // 440: invokestatic yh2.a (Loov;)Loov;
      // 443: athrow
      // 444: getstatic yh2.ek1 Lc05;
      // 447: getfield c05.vg8 Ll86;
      // 44a: if_acmpeq 493
      // 44d: goto 454
      // 450: invokestatic yh2.a (Loov;)Loov;
      // 453: athrow
      // 454: aload 31
      // 456: goto 45d
      // 459: invokestatic yh2.a (Loov;)Loov;
      // 45c: athrow
      // 45d: invokevirtual i2h.aaw ()Lnh4;
      // 460: fload 9
      // 462: f2d
      // 463: fload 9
      // 465: f2d
      // 466: fload 9
      // 468: f2d
      // 469: invokevirtual nh4.c2h (DDD)Lnh4;
      // 46c: astore 32
      // 46e: aload 32
      // 470: aload 26
      // 472: aload 27
      // 474: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 477: astore 33
      // 479: iload 2
      // 47a: ifne 496
      // 47d: aload 33
      // 47f: ifnull 493
      // 482: goto 489
      // 485: invokestatic yh2.a (Loov;)Loov;
      // 488: athrow
      // 489: bipush 1
      // 48a: istore 25
      // 48c: bipush 1
      // 48d: istore 24
      // 48f: aload 33
      // 491: astore 23
      // 493: iinc 30 1
      // 496: iload 2
      // 497: ifeq 404
      // 49a: dload 10
      // 49c: dload 16
      // 49e: dadd
      // 49f: dstore 10
      // 4a1: dload 12
      // 4a3: dload 18
      // 4a5: dadd
      // 4a6: dstore 12
      // 4a8: dload 14
      // 4aa: dload 20
      // 4ac: dadd
      // 4ad: dstore 14
      // 4af: new mew
      // 4b2: dup
      // 4b3: dload 10
      // 4b5: dload 12
      // 4b7: dload 14
      // 4b9: invokespecial mew.<init> (DDD)V
      // 4bc: astore 30
      // 4be: aload 0
      // 4bf: pop
      // 4c0: getstatic yh2.ek1 Lc05;
      // 4c3: getfield c05.tij Lkh3;
      // 4c6: aload 30
      // 4c8: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 4cb: invokeinterface zfz.r_y ()Le0x; 1
      // 4d0: astore 31
      // 4d2: iload 2
      // 4d3: ifne 514
      // 4d6: aload 31
      // 4d8: invokevirtual e0x.p1r ()Lp3y;
      // 4db: getstatic p3y.six Lp3y;
      // 4de: if_acmpne 504
      // 4e1: goto 4e8
      // 4e4: invokestatic yh2.a (Loov;)Loov;
      // 4e7: athrow
      // 4e8: dload 16
      // 4ea: ldc2_w 0.6
      // 4ed: dmul
      // 4ee: dstore 16
      // 4f0: dload 18
      // 4f2: ldc2_w 0.6
      // 4f5: dmul
      // 4f6: dstore 18
      // 4f8: dload 20
      // 4fa: ldc2_w 0.6
      // 4fd: dmul
      // 4fe: dstore 20
      // 500: iload 2
      // 501: ifeq 51c
      // 504: dload 16
      // 506: fload 6
      // 508: f2d
      // 509: dmul
      // 50a: dstore 16
      // 50c: dload 18
      // 50e: fload 6
      // 510: f2d
      // 511: dmul
      // 512: dstore 18
      // 514: dload 20
      // 516: fload 6
      // 518: f2d
      // 519: dmul
      // 51a: dstore 20
      // 51c: dload 18
      // 51e: fload 8
      // 520: f2d
      // 521: dsub
      // 522: dstore 18
      // 524: dload 10
      // 526: aload 0
      // 527: pop
      // 528: getstatic yh2.ek1 Lc05;
      // 52b: invokevirtual c05.ibs ()Lhr_;
      // 52e: invokevirtual hr_.yky ()D
      // 531: dsub
      // 532: dload 12
      // 534: aload 0
      // 535: pop
      // 536: getstatic yh2.ek1 Lc05;
      // 539: invokevirtual c05.ibs ()Lhr_;
      // 53c: invokevirtual hr_.fxk ()D
      // 53f: dsub
      // 540: dload 14
      // 542: aload 0
      // 543: pop
      // 544: getstatic yh2.ek1 Lc05;
      // 547: invokevirtual c05.ibs ()Lhr_;
      // 54a: invokevirtual hr_.kux ()D
      // 54d: dsub
      // 54e: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 551: iload 2
      // 552: ifeq 305
      // 555: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 558: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 55b: dload 10
      // 55d: aload 0
      // 55e: pop
      // 55f: getstatic yh2.ek1 Lc05;
      // 562: invokevirtual c05.ibs ()Lhr_;
      // 565: invokevirtual hr_.yky ()D
      // 568: dsub
      // 569: dload 12
      // 56b: aload 0
      // 56c: pop
      // 56d: getstatic yh2.ek1 Lc05;
      // 570: invokevirtual c05.ibs ()Lhr_;
      // 573: invokevirtual hr_.fxk ()D
      // 576: dsub
      // 577: dload 14
      // 579: aload 0
      // 57a: pop
      // 57b: getstatic yh2.ek1 Lc05;
      // 57e: invokevirtual c05.ibs ()Lhr_;
      // 581: invokevirtual hr_.kux ()D
      // 584: dsub
      // 585: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 588: iload 2
      // 589: ifne 6c9
      // 58c: aload 23
      // 58e: ifnull 6c2
      // 591: goto 598
      // 594: invokestatic yh2.a (Loov;)Loov;
      // 597: athrow
      // 598: aload 23
      // 59a: getfield akm.m_f Lvt2;
      // 59d: invokevirtual vt2.c3s ()I
      // 5a0: istore 26
      // 5a2: iload 26
      // 5a4: bipush 1
      // 5a5: iload 2
      // 5a6: ifne 5f2
      // 5a9: if_icmpne 5ef
      // 5ac: goto 5b3
      // 5af: invokestatic yh2.a (Loov;)Loov;
      // 5b2: athrow
      // 5b3: aload 7
      // 5b5: instanceof yuq
      // 5b8: iload 2
      // 5b9: ifne 5f1
      // 5bc: goto 5c3
      // 5bf: invokestatic yh2.a (Loov;)Loov;
      // 5c2: athrow
      // 5c3: ifeq 5ef
      // 5c6: goto 5cd
      // 5c9: invokestatic yh2.a (Loov;)Loov;
      // 5cc: athrow
      // 5cd: new java/awt/Color
      // 5d0: dup
      // 5d1: sipush 255
      // 5d4: sipush 248
      // 5d7: bipush 0
      // 5d8: sipush 255
      // 5db: invokespecial java/awt/Color.<init> (IIII)V
      // 5de: invokevirtual java/awt/Color.getRGB ()I
      // 5e1: invokestatic mkt.v_1 (I)V
      // 5e4: iload 2
      // 5e5: ifeq 694
      // 5e8: goto 5ef
      // 5eb: invokestatic yh2.a (Loov;)Loov;
      // 5ee: athrow
      // 5ef: iload 26
      // 5f1: bipush 2
      // 5f2: iload 2
      // 5f3: ifne 61e
      // 5f6: if_icmpne 614
      // 5f9: goto 600
      // 5fc: invokestatic yh2.a (Loov;)Loov;
      // 5ff: athrow
      // 600: ldc 90.0
      // 602: nop
      // 603: fconst_1
      // 604: fconst_0
      // 605: fconst_0
      // 606: invokestatic hzu.a2h (FFFF)V
      // 609: iload 2
      // 60a: ifeq 694
      // 60d: goto 614
      // 610: invokestatic yh2.a (Loov;)Loov;
      // 613: athrow
      // 614: iload 26
      // 616: bipush 3
      // 617: goto 61e
      // 61a: invokestatic yh2.a (Loov;)Loov;
      // 61d: athrow
      // 61e: iload 2
      // 61f: ifne 64a
      // 622: if_icmpne 640
      // 625: goto 62c
      // 628: invokestatic yh2.a (Loov;)Loov;
      // 62b: athrow
      // 62c: ldc 90.0
      // 62e: nop
      // 62f: fconst_1
      // 630: fconst_0
      // 631: fconst_0
      // 632: invokestatic hzu.a2h (FFFF)V
      // 635: iload 2
      // 636: ifeq 694
      // 639: goto 640
      // 63c: invokestatic yh2.a (Loov;)Loov;
      // 63f: athrow
      // 640: iload 26
      // 642: bipush 4
      // 643: goto 64a
      // 646: invokestatic yh2.a (Loov;)Loov;
      // 649: athrow
      // 64a: iload 2
      // 64b: ifne 681
      // 64e: if_icmpne 66c
      // 651: goto 658
      // 654: invokestatic yh2.a (Loov;)Loov;
      // 657: athrow
      // 658: ldc 90.0
      // 65a: nop
      // 65b: fconst_0
      // 65c: fconst_0
      // 65d: fconst_1
      // 65e: invokestatic hzu.a2h (FFFF)V
      // 661: iload 2
      // 662: ifeq 694
      // 665: goto 66c
      // 668: invokestatic yh2.a (Loov;)Loov;
      // 66b: athrow
      // 66c: iload 26
      // 66e: iload 2
      // 66f: ifne 696
      // 672: goto 679
      // 675: invokestatic yh2.a (Loov;)Loov;
      // 678: athrow
      // 679: bipush 5
      // 67a: goto 681
      // 67d: invokestatic yh2.a (Loov;)Loov;
      // 680: athrow
      // 681: if_icmpne 694
      // 684: ldc 90.0
      // 686: nop
      // 687: fconst_0
      // 688: fconst_0
      // 689: fconst_1
      // 68a: invokestatic hzu.a2h (FFFF)V
      // 68d: goto 694
      // 690: invokestatic yh2.a (Loov;)Loov;
      // 693: athrow
      // 694: iload 25
      // 696: iload 2
      // 697: ifne 6ca
      // 69a: ifeq 6c2
      // 69d: goto 6a4
      // 6a0: invokestatic yh2.a (Loov;)Loov;
      // 6a3: athrow
      // 6a4: new java/awt/Color
      // 6a7: dup
      // 6a8: sipush 255
      // 6ab: sipush 248
      // 6ae: bipush 0
      // 6af: sipush 255
      // 6b2: invokespecial java/awt/Color.<init> (IIII)V
      // 6b5: invokevirtual java/awt/Color.getRGB ()I
      // 6b8: invokestatic mkt.v_1 (I)V
      // 6bb: goto 6c2
      // 6be: invokestatic yh2.a (Loov;)Loov;
      // 6c1: athrow
      // 6c2: aload 0
      // 6c3: invokespecial yh2.e5a ()V
      // 6c6: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 6c9: bipush 1
      // 6ca: invokestatic mkt.fba (Z)V
      // 6cd: return
   }

   private void e5a() {
      GL11.glBegin(1);
      GL11.glVertex3d(-0.5, 0.0, 0.0);
      GL11.glVertex3d(0.0, 0.0, 0.0);
      GL11.glVertex3d(0.0, 0.0, -0.5);
      GL11.glVertex3d(0.0, 0.0, 0.0);
      GL11.glVertex3d(0.5, 0.0, 0.0);
      GL11.glVertex3d(0.0, 0.0, 0.0);
      GL11.glVertex3d(0.0, 0.0, 0.5);
      GL11.glVertex3d(0.0, 0.0, 0.0);
      GL11.glEnd();
      Cylinder var1 = new Cylinder();
      hzu.a2h(90.0F, 1.0F, 0.0F, 0.0F);
      var1.setDrawStyle(100011);
      var1.draw(0.5F, 0.5F, 0.0F, 256, 27);
   }

   private List fmp(nh4 var1) {
      ArrayList var3 = new ArrayList();
      int var4 = fe6.jqf((var1.rlc - 2.0) / 16.0);
      int var10000 = t9d.c();
      int var5 = fe6.jqf((var1.t_2 + 2.0) / 16.0);
      int var6 = fe6.jqf((var1.t8n - 2.0) / 16.0);
      int var7 = fe6.jqf((var1.oqj + 2.0) / 16.0);
      int var8 = var4;
      int var2 = var10000;

      label50:
      while (true) {
         var10000 = var8;

         label48:
         while (var10000 <= var5) {
            int var9 = var6;

            while (var9 <= var7) {
               label56: {
                  try {
                     if (var2 != 0) {
                        break label56;
                     }

                     var10000 = ek1.tij.sj7().pnt(var8, var9);
                     if (var2 != 0) {
                        continue label48;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }

                  try {
                     if (var10000 != 0) {
                        ek1.tij.o5h(var8, var9).ett(ek1.vg8, var1, var3, k0_.q01);
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  var9++;
               }

               if (var2 != 0) {
                  break;
               }
            }

            var8++;
            if (var2 != 0) {
               return var3;
            }
            continue label50;
         }

         return var3;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5788543345569794064L, 7959116554686878495L, MethodHandles.lookup().lookupClass()).a(108242020601561L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 58042487082193L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0088ÀÔ¨g\n¶é8½Øm½sBJ".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
}
