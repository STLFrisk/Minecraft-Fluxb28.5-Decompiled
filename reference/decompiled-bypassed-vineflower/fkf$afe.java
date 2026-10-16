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

public class fkf$afe {
   public boolean lwk;
   public crk jq6;
   public _aj f4b;
   public float fe1;
   public float jxt;
   public float wp4;
   public float gad;
   public lva bh1;
   public final fkf qxv;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public fkf$afe(fkf var1, _aj var2) {
      this.qxv = var1;
      this.lwk = true;
      this.jq6 = null;
      this.wp4 = -100.0F;
      this.gad = 0.0F;
      this.bh1 = new lva(0.0F);
      this.f4b = var2;
   }

   public void g71(float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fkf$afe.a J
      // 003: ldc2_w 26919166951218
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.b ()I
      // 00c: istore 7
      // 00e: getstatic zwr.qkk Lzwr;
      // 011: pop
      // 012: getstatic zwr.gki Lc_3;
      // 015: sipush 10736
      // 018: ldc2_w 3745860852619242450
      // 01b: lload 5
      // 01d: lxor
      // 01e: invokedynamic o (IJ)Ljava/lang/String; bsm=fkf$afe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 027: istore 8
      // 029: iload 7
      // 02b: ifeq 048
      // 02e: bipush 0
      // 02f: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 032: ifne 04d
      // 035: goto 03c
      // 038: invokestatic fkf$afe.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 0
      // 03d: aconst_null
      // 03e: putfield fkf$afe.jq6 Lcrk;
      // 041: goto 048
      // 044: invokestatic fkf$afe.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: bipush 1
      // 04a: putfield fkf$afe.lwk Z
      // 04d: getstatic jsr.rs4 Lcyb;
      // 050: astore 9
      // 052: aload 0
      // 053: fload 1
      // 054: putfield fkf$afe.fe1 F
      // 057: aload 0
      // 058: fload 2
      // 059: putfield fkf$afe.jxt F
      // 05c: fload 3
      // 05d: fload 4
      // 05f: fload 1
      // 060: fload 2
      // 061: fload 1
      // 062: aload 0
      // 063: getfield fkf$afe.qxv Lfkf;
      // 066: getfield fkf.ipy F
      // 069: ldc 100.0
      // 06b: nop
      // 06c: fsub
      // 06d: fadd
      // 06e: fload 2
      // 06f: aload 0
      // 070: getfield fkf$afe.qxv Lfkf;
      // 073: getfield fkf.bf9 F
      // 076: fadd
      // 077: invokestatic hhf.md3 (FFFFFF)Z
      // 07a: iload 7
      // 07c: ifeq 12b
      // 07f: ifeq 121
      // 082: goto 089
      // 085: invokestatic fkf$afe.a (Loov;)Loov;
      // 088: athrow
      // 089: invokestatic org/lwjgl/input/Mouse.getDWheel ()I
      // 08c: bipush 2
      // 08d: idiv
      // 08e: istore 10
      // 090: aload 0
      // 091: dup
      // 092: getfield fkf$afe.gad F
      // 095: iload 10
      // 097: i2f
      // 098: fadd
      // 099: putfield fkf$afe.gad F
      // 09c: aload 0
      // 09d: getfield fkf$afe.gad F
      // 0a0: aload 0
      // 0a1: getfield fkf$afe.wp4 F
      // 0a4: fcmpg
      // 0a5: iload 7
      // 0a7: ifeq 0c9
      // 0aa: ifgt 0c3
      // 0ad: goto 0b4
      // 0b0: invokestatic fkf$afe.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: aload 0
      // 0b6: getfield fkf$afe.wp4 F
      // 0b9: putfield fkf$afe.gad F
      // 0bc: goto 0c3
      // 0bf: invokestatic fkf$afe.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: getfield fkf$afe.gad F
      // 0c7: fconst_0
      // 0c8: fcmpl
      // 0c9: iload 7
      // 0cb: ifeq 106
      // 0ce: iflt 0e4
      // 0d1: goto 0d8
      // 0d4: invokestatic fkf$afe.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: fconst_0
      // 0da: putfield fkf$afe.gad F
      // 0dd: goto 0e4
      // 0e0: invokestatic fkf$afe.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: aload 0
      // 0e6: getfield fkf$afe.qxv Lfkf;
      // 0e9: getfield fkf.bf9 F
      // 0ec: ldc 10.0
      // 0ee: nop
      // 0ef: fsub
      // 0f0: putfield fkf$afe.wp4 F
      // 0f3: aload 0
      // 0f4: getfield fkf$afe.bh1 Llva;
      // 0f7: aload 0
      // 0f8: getfield fkf$afe.gad F
      // 0fb: invokevirtual lva.vej (F)V
      // 0fe: aload 0
      // 0ff: getfield fkf$afe.bh1 Llva;
      // 102: bipush 1
      // 103: invokevirtual lva.ry0 (Z)Z
      // 106: iload 7
      // 108: ifeq 116
      // 10b: ifne 119
      // 10e: goto 115
      // 111: invokestatic fkf$afe.a (Loov;)Loov;
      // 114: athrow
      // 115: bipush 1
      // 116: goto 11a
      // 119: bipush 0
      // 11a: istore 11
      // 11c: iload 7
      // 11e: ifne 12c
      // 121: invokestatic org/lwjgl/input/Mouse.getDWheel ()I
      // 124: goto 12b
      // 127: invokestatic fkf$afe.a (Loov;)Loov;
      // 12a: athrow
      // 12b: pop
      // 12c: fload 1
      // 12d: ldc 30.0
      // 12f: nop
      // 130: fadd
      // 131: fstore 1
      // 132: fload 2
      // 133: ldc 25.0
      // 135: nop
      // 136: aload 0
      // 137: getfield fkf$afe.bh1 Llva;
      // 13a: invokevirtual lva.o7r ()F
      // 13d: fadd
      // 13e: fadd
      // 13f: fstore 2
      // 140: getstatic kgt.vuo Ljava/util/ArrayList;
      // 143: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 146: astore 10
      // 148: aload 10
      // 14a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14f: ifeq fff
      // 152: aload 10
      // 154: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 159: checkcast ar7
      // 15c: astore 11
      // 15e: aload 11
      // 160: invokevirtual ar7.oxx ()L_aj;
      // 163: aload 0
      // 164: getfield fkf$afe.f4b L_aj;
      // 167: iload 7
      // 169: ifeq 190
      // 16c: if_acmpeq 193
      // 16f: goto 176
      // 172: invokestatic fkf$afe.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: iload 7
      // 179: ifeq 194
      // 17c: goto 183
      // 17f: invokestatic fkf$afe.a (Loov;)Loov;
      // 182: athrow
      // 183: getfield fkf$afe.f4b L_aj;
      // 186: getstatic _aj.il8 L_aj;
      // 189: goto 190
      // 18c: invokestatic fkf$afe.a (Loov;)Loov;
      // 18f: athrow
      // 190: if_acmpne ffa
      // 193: aload 0
      // 194: getfield fkf$afe.qxv Lfkf;
      // 197: fload 3
      // 198: fload 4
      // 19a: fload 1
      // 19b: ldc 10.0
      // 19d: nop
      // 19e: fsub
      // 19f: fload 2
      // 1a0: ldc 12.5
      // 1a2: nop
      // 1a3: fsub
      // 1a4: fload 1
      // 1a5: aload 0
      // 1a6: getfield fkf$afe.qxv Lfkf;
      // 1a9: getfield fkf.ipy F
      // 1ac: fadd
      // 1ad: ldc 150.0
      // 1af: nop
      // 1b0: fsub
      // 1b1: fload 2
      // 1b2: ldc 12.5
      // 1b4: nop
      // 1b5: fadd
      // 1b6: invokevirtual fkf.imv (FFFFFF)Z
      // 1b9: iload 7
      // 1bb: ifeq 205
      // 1be: ifeq 30b
      // 1c1: goto 1c8
      // 1c4: invokestatic fkf$afe.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: getfield fkf$afe.qxv Lfkf;
      // 1cc: fload 3
      // 1cd: fload 4
      // 1cf: fload 1
      // 1d0: aload 0
      // 1d1: getfield fkf$afe.qxv Lfkf;
      // 1d4: getfield fkf.ipy F
      // 1d7: fadd
      // 1d8: ldc 400.0
      // 1da: nop
      // 1db: fsub
      // 1dc: ldc 216.0
      // 1de: nop
      // 1df: fadd
      // 1e0: fload 2
      // 1e1: ldc 5.0
      // 1e3: nop
      // 1e4: fsub
      // 1e5: fload 1
      // 1e6: aload 0
      // 1e7: getfield fkf$afe.qxv Lfkf;
      // 1ea: getfield fkf.ipy F
      // 1ed: fadd
      // 1ee: ldc 400.0
      // 1f0: nop
      // 1f1: fsub
      // 1f2: ldc 232.0
      // 1f4: nop
      // 1f5: fadd
      // 1f6: fload 2
      // 1f7: ldc 5.0
      // 1f9: nop
      // 1fa: fadd
      // 1fb: invokevirtual fkf.imv (FFFFFF)Z
      // 1fe: goto 205
      // 201: invokestatic fkf$afe.a (Loov;)Loov;
      // 204: athrow
      // 205: iload 7
      // 207: ifeq 21f
      // 20a: ifne 30b
      // 20d: goto 214
      // 210: invokestatic fkf$afe.a (Loov;)Loov;
      // 213: athrow
      // 214: bipush 0
      // 215: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 218: goto 21f
      // 21b: invokestatic fkf$afe.a (Loov;)Loov;
      // 21e: athrow
      // 21f: iload 7
      // 221: ifeq 245
      // 224: ifeq 30b
      // 227: goto 22e
      // 22a: invokestatic fkf$afe.a (Loov;)Loov;
      // 22d: athrow
      // 22e: aload 0
      // 22f: iload 7
      // 231: ifeq 249
      // 234: goto 23b
      // 237: invokestatic fkf$afe.a (Loov;)Loov;
      // 23a: athrow
      // 23b: getfield fkf$afe.lwk Z
      // 23e: goto 245
      // 241: invokestatic fkf$afe.a (Loov;)Loov;
      // 244: athrow
      // 245: ifeq 30b
      // 248: aload 0
      // 249: getfield fkf$afe.qxv Lfkf;
      // 24c: getfield fkf.vi0 Lar7;
      // 24f: aload 11
      // 251: iload 7
      // 253: ifeq 30f
      // 256: if_acmpeq 30b
      // 259: goto 260
      // 25c: invokestatic fkf$afe.a (Loov;)Loov;
      // 25f: athrow
      // 260: aload 0
      // 261: iload 7
      // 263: ifeq 293
      // 266: goto 26d
      // 269: invokestatic fkf$afe.a (Loov;)Loov;
      // 26c: athrow
      // 26d: getfield fkf$afe.f4b L_aj;
      // 270: getstatic _aj.il8 L_aj;
      // 273: if_acmpeq 30b
      // 276: goto 27d
      // 279: invokestatic fkf$afe.a (Loov;)Loov;
      // 27c: athrow
      // 27d: aload 0
      // 27e: bipush 0
      // 27f: putfield fkf$afe.lwk Z
      // 282: aload 0
      // 283: getfield fkf$afe.qxv Lfkf;
      // 286: aload 11
      // 288: putfield fkf.vi0 Lar7;
      // 28b: aload 0
      // 28c: goto 293
      // 28f: invokestatic fkf$afe.a (Loov;)Loov;
      // 292: athrow
      // 293: getfield fkf$afe.qxv Lfkf;
      // 296: getfield fkf.vi0 Lar7;
      // 299: invokevirtual ar7.smu ()Lc_3;
      // 29c: iload 7
      // 29e: ifeq 2bc
      // 2a1: ifnull 2c3
      // 2a4: goto 2ab
      // 2a7: invokestatic fkf$afe.a (Loov;)Loov;
      // 2aa: athrow
      // 2ab: aload 0
      // 2ac: getfield fkf$afe.qxv Lfkf;
      // 2af: getfield fkf.vi0 Lar7;
      // 2b2: invokevirtual ar7.smu ()Lc_3;
      // 2b5: goto 2bc
      // 2b8: invokestatic fkf$afe.a (Loov;)Loov;
      // 2bb: athrow
      // 2bc: invokevirtual c_3.rxi ()Llva;
      // 2bf: fconst_0
      // 2c0: invokevirtual lva.lna (F)V
      // 2c3: getstatic _x3.wig Ljava/util/ArrayList;
      // 2c6: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2c9: astore 12
      // 2cb: aload 12
      // 2cd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d2: ifeq 30b
      // 2d5: aload 12
      // 2d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2dc: checkcast dzm
      // 2df: astore 13
      // 2e1: aload 13
      // 2e3: iload 7
      // 2e5: ifeq 2fc
      // 2e8: instanceof crk
      // 2eb: iload 7
      // 2ed: ifeq 14f
      // 2f0: goto 2f7
      // 2f3: invokestatic fkf$afe.a (Loov;)Loov;
      // 2f6: athrow
      // 2f7: ifeq 306
      // 2fa: aload 13
      // 2fc: checkcast crk
      // 2ff: invokevirtual crk.rpv ()Llva;
      // 302: fconst_0
      // 303: invokevirtual lva.lna (F)V
      // 306: iload 7
      // 308: ifne 2cb
      // 30b: aload 11
      // 30d: aload 11
      // 30f: getfield ar7.l7d F
      // 312: aload 11
      // 314: invokevirtual ar7.klu ()Z
      // 317: ifeq 324
      // 31a: ldc 222.0
      // 31c: nop
      // 31d: goto 327
      // 320: invokestatic fkf$afe.a (Loov;)Loov;
      // 323: athrow
      // 324: ldc 218.0
      // 326: nop
      // 327: ldc 10.0
      // 329: nop
      // 32a: aload 11
      // 32c: getfield ar7.l7d F
      // 32f: aload 11
      // 331: invokevirtual ar7.klu ()Z
      // 334: ifeq 341
      // 337: ldc 222.0
      // 339: nop
      // 33a: goto 344
      // 33d: invokestatic fkf$afe.a (Loov;)Loov;
      // 340: athrow
      // 341: ldc 218.0
      // 343: nop
      // 344: fsub
      // 345: invokestatic java/lang/Math.abs (F)F
      // 348: ldc 35.0
      // 34a: nop
      // 34b: fmul
      // 34c: invokestatic java/lang/Math.max (FF)F
      // 34f: f2d
      // 350: ldc2_w 0.3
      // 353: dmul
      // 354: d2f
      // 355: invokestatic ybv.lvf (FFF)F
      // 358: putfield ar7.l7d F
      // 35b: aload 11
      // 35d: aload 0
      // 35e: getfield fkf$afe.qxv Lfkf;
      // 361: getfield fkf.vi0 Lar7;
      // 364: if_acmpeq 378
      // 367: aload 0
      // 368: getfield fkf$afe.f4b L_aj;
      // 36b: getstatic _aj.il8 L_aj;
      // 36e: if_acmpne df6
      // 371: goto 378
      // 374: invokestatic fkf$afe.a (Loov;)Loov;
      // 377: athrow
      // 378: fconst_0
      // 379: fstore 12
      // 37b: iload 7
      // 37d: ifeq 3d6
      // 380: aload 11
      // 382: aload 0
      // 383: getfield fkf$afe.qxv Lfkf;
      // 386: getfield fkf.sin Lar7;
      // 389: if_acmpeq 3ab
      // 38c: goto 393
      // 38f: invokestatic fkf$afe.a (Loov;)Loov;
      // 392: athrow
      // 393: aload 0
      // 394: getfield fkf$afe.qxv Lfkf;
      // 397: fconst_0
      // 398: putfield fkf.nh5 F
      // 39b: aload 0
      // 39c: getfield fkf$afe.qxv Lfkf;
      // 39f: aload 11
      // 3a1: putfield fkf.sin Lar7;
      // 3a4: goto 3ab
      // 3a7: invokestatic fkf$afe.a (Loov;)Loov;
      // 3aa: athrow
      // 3ab: fload 1
      // 3ac: ldc 10.5
      // 3ae: nop
      // 3af: fsub
      // 3b0: fload 2
      // 3b1: ldc 13.0
      // 3b3: nop
      // 3b4: fsub
      // 3b5: fload 1
      // 3b6: aload 0
      // 3b7: getfield fkf$afe.qxv Lfkf;
      // 3ba: getfield fkf.ipy F
      // 3bd: fadd
      // 3be: ldc 149.5
      // 3c0: nop
      // 3c1: fsub
      // 3c2: fload 2
      // 3c3: ldc 13.0
      // 3c5: nop
      // 3c6: fadd
      // 3c7: aload 11
      // 3c9: getfield ar7.abe Llva;
      // 3cc: invokevirtual lva.o7r ()F
      // 3cf: fadd
      // 3d0: ldc -12417291
      // 3d2: nop
      // 3d3: invokestatic hhf.hxa (FFFFI)V
      // 3d6: fload 1
      // 3d7: ldc 10.0
      // 3d9: nop
      // 3da: fsub
      // 3db: fload 2
      // 3dc: ldc 12.5
      // 3de: nop
      // 3df: fsub
      // 3e0: fload 1
      // 3e1: aload 0
      // 3e2: getfield fkf$afe.qxv Lfkf;
      // 3e5: getfield fkf.ipy F
      // 3e8: fadd
      // 3e9: ldc 150.0
      // 3eb: nop
      // 3ec: fsub
      // 3ed: fload 2
      // 3ee: ldc 12.5
      // 3f0: nop
      // 3f1: fadd
      // 3f2: aload 11
      // 3f4: getfield ar7.abe Llva;
      // 3f7: invokevirtual lva.o7r ()F
      // 3fa: fadd
      // 3fb: iload 8
      // 3fd: iload 7
      // 3ff: ifeq 416
      // 402: ifeq 419
      // 405: goto 40c
      // 408: invokestatic fkf$afe.a (Loov;)Loov;
      // 40b: athrow
      // 40c: ldc -12565429
      // 40e: nop
      // 40f: goto 416
      // 412: invokestatic fkf$afe.a (Loov;)Loov;
      // 415: athrow
      // 416: goto 41a
      // 419: bipush -1
      // 41a: invokestatic hhf.hxa (FFFFI)V
      // 41d: getstatic jsr.q6n Lcyb;
      // 420: ldc "n"
      // 422: nop
      // 423: iload 7
      // 425: ifeq 45e
      // 428: fload 1
      // 429: fload 2
      // 42a: ldc 3.0
      // 42c: nop
      // 42d: fsub
      // 42e: ldc -12417291
      // 430: nop
      // 431: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 434: pop
      // 435: aload 9
      // 437: aload 0
      // 438: getfield fkf$afe.f4b L_aj;
      // 43b: getstatic _aj.il8 L_aj;
      // 43e: if_acmpne 461
      // 441: goto 448
      // 444: invokestatic fkf$afe.a (Loov;)Loov;
      // 447: athrow
      // 448: sipush 14024
      // 44b: ldc2_w 7483235625284924648
      // 44e: lload 5
      // 450: lxor
      // 451: invokedynamic o (IJ)Ljava/lang/String; bsm=fkf$afe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: nop
      // 457: goto 45e
      // 45a: invokestatic fkf$afe.a (Loov;)Loov;
      // 45d: athrow
      // 45e: goto 466
      // 461: aload 11
      // 463: invokevirtual ar7.m2d ()Ljava/lang/String;
      // 466: fload 1
      // 467: ldc 10.0
      // 469: nop
      // 46a: fadd
      // 46b: fload 2
      // 46c: ldc 6.0
      // 46e: nop
      // 46f: fsub
      // 470: ldc -12417291
      // 472: nop
      // 473: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 476: pop
      // 477: getstatic jsr.mxa Lcyb;
      // 47a: ldc "h"
      // 47c: nop
      // 47d: fload 1
      // 47e: aload 0
      // 47f: getfield fkf$afe.qxv Lfkf;
      // 482: getfield fkf.ipy F
      // 485: fadd
      // 486: ldc 150.0
      // 488: nop
      // 489: fsub
      // 48a: ldc 12.0
      // 48c: nop
      // 48d: fsub
      // 48e: fload 2
      // 48f: ldc 4.0
      // 491: nop
      // 492: fsub
      // 493: ldc -12417291
      // 495: nop
      // 496: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 499: iload 7
      // 49b: ifeq 5f8
      // 49e: pop
      // 49f: aload 0
      // 4a0: getfield fkf$afe.f4b L_aj;
      // 4a3: getstatic _aj.il8 L_aj;
      // 4a6: if_acmpeq 5f7
      // 4a9: goto 4b0
      // 4ac: invokestatic fkf$afe.a (Loov;)Loov;
      // 4af: athrow
      // 4b0: fload 1
      // 4b1: aload 0
      // 4b2: getfield fkf$afe.qxv Lfkf;
      // 4b5: getfield fkf.ipy F
      // 4b8: fadd
      // 4b9: ldc 400.0
      // 4bb: nop
      // 4bc: fsub
      // 4bd: ldc 218.0
      // 4bf: nop
      // 4c0: fadd
      // 4c1: fload 2
      // 4c2: ldc 3.0
      // 4c4: nop
      // 4c5: fsub
      // 4c6: fload 1
      // 4c7: aload 0
      // 4c8: getfield fkf$afe.qxv Lfkf;
      // 4cb: getfield fkf.ipy F
      // 4ce: fadd
      // 4cf: ldc 400.0
      // 4d1: nop
      // 4d2: fsub
      // 4d3: ldc 230.0
      // 4d5: nop
      // 4d6: fadd
      // 4d7: fload 2
      // 4d8: ldc 3.0
      // 4da: nop
      // 4db: fadd
      // 4dc: ldc 2.5
      // 4de: nop
      // 4df: ldc -1710619
      // 4e1: nop
      // 4e2: invokestatic hhf.htg (FFFFFI)V
      // 4e5: fload 1
      // 4e6: aload 0
      // 4e7: getfield fkf$afe.qxv Lfkf;
      // 4ea: getfield fkf.ipy F
      // 4ed: fadd
      // 4ee: ldc 400.0
      // 4f0: nop
      // 4f1: fsub
      // 4f2: aload 11
      // 4f4: getfield ar7.l7d F
      // 4f7: fadd
      // 4f8: fload 2
      // 4f9: ldc 4.0
      // 4fb: nop
      // 4fc: fsub
      // 4fd: ldc 8.0
      // 4ff: nop
      // 500: ldc 8.0
      // 502: nop
      // 503: ldc 360.0
      // 505: nop
      // 506: aload 11
      // 508: invokevirtual ar7.klu ()Z
      // 50b: iload 7
      // 50d: ifeq 52b
      // 510: goto 517
      // 513: invokestatic fkf$afe.a (Loov;)Loov;
      // 516: athrow
      // 517: ifeq 52e
      // 51a: goto 521
      // 51d: invokestatic fkf$afe.a (Loov;)Loov;
      // 520: athrow
      // 521: ldc -12417291
      // 523: nop
      // 524: goto 52b
      // 527: invokestatic fkf$afe.a (Loov;)Loov;
      // 52a: athrow
      // 52b: goto 52f
      // 52e: bipush -1
      // 52f: fconst_1
      // 530: aload 11
      // 532: invokevirtual ar7.klu ()Z
      // 535: iload 7
      // 537: ifeq 550
      // 53a: ifeq 54e
      // 53d: goto 544
      // 540: invokestatic fkf$afe.a (Loov;)Loov;
      // 543: athrow
      // 544: ldc -12417291
      // 546: nop
      // 547: goto 551
      // 54a: invokestatic fkf$afe.a (Loov;)Loov;
      // 54d: athrow
      // 54e: ldc -6316129
      // 550: nop
      // 551: invokestatic mkt.o8m (FFFFFIFI)V
      // 554: aload 0
      // 555: getfield fkf$afe.qxv Lfkf;
      // 558: fload 3
      // 559: fload 4
      // 55b: fload 1
      // 55c: aload 0
      // 55d: getfield fkf$afe.qxv Lfkf;
      // 560: getfield fkf.ipy F
      // 563: fadd
      // 564: ldc 400.0
      // 566: nop
      // 567: fsub
      // 568: ldc 216.0
      // 56a: nop
      // 56b: fadd
      // 56c: fload 2
      // 56d: ldc 5.0
      // 56f: nop
      // 570: fsub
      // 571: fload 1
      // 572: aload 0
      // 573: getfield fkf$afe.qxv Lfkf;
      // 576: getfield fkf.ipy F
      // 579: fadd
      // 57a: ldc 400.0
      // 57c: nop
      // 57d: fsub
      // 57e: ldc 232.0
      // 580: nop
      // 581: fadd
      // 582: fload 2
      // 583: ldc 5.0
      // 585: nop
      // 586: fadd
      // 587: invokevirtual fkf.imv (FFFFFF)Z
      // 58a: iload 7
      // 58c: ifeq 5f8
      // 58f: ifeq 5f7
      // 592: goto 599
      // 595: invokestatic fkf$afe.a (Loov;)Loov;
      // 598: athrow
      // 599: bipush 0
      // 59a: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 59d: iload 7
      // 59f: ifeq 5f8
      // 5a2: goto 5a9
      // 5a5: invokestatic fkf$afe.a (Loov;)Loov;
      // 5a8: athrow
      // 5a9: ifeq 5f7
      // 5ac: goto 5b3
      // 5af: invokestatic fkf$afe.a (Loov;)Loov;
      // 5b2: athrow
      // 5b3: aload 0
      // 5b4: getfield fkf$afe.lwk Z
      // 5b7: iload 7
      // 5b9: ifeq 5f8
      // 5bc: goto 5c3
      // 5bf: invokestatic fkf$afe.a (Loov;)Loov;
      // 5c2: athrow
      // 5c3: ifeq 5f7
      // 5c6: goto 5cd
      // 5c9: invokestatic fkf$afe.a (Loov;)Loov;
      // 5cc: athrow
      // 5cd: aload 0
      // 5ce: bipush 0
      // 5cf: putfield fkf$afe.lwk Z
      // 5d2: aload 11
      // 5d4: aload 11
      // 5d6: invokevirtual ar7.klu ()Z
      // 5d9: iload 7
      // 5db: ifeq 5f0
      // 5de: goto 5e5
      // 5e1: invokestatic fkf$afe.a (Loov;)Loov;
      // 5e4: athrow
      // 5e5: ifne 5f3
      // 5e8: goto 5ef
      // 5eb: invokestatic fkf$afe.a (Loov;)Loov;
      // 5ee: athrow
      // 5ef: bipush 1
      // 5f0: goto 5f4
      // 5f3: bipush 0
      // 5f4: invokevirtual ar7.yse (Z)V
      // 5f7: bipush 0
      // 5f8: istore 13
      // 5fa: bipush 0
      // 5fb: istore 14
      // 5fd: bipush 0
      // 5fe: istore 15
      // 600: bipush 5
      // 601: istore 16
      // 603: aload 0
      // 604: getfield fkf$afe.f4b L_aj;
      // 607: getstatic _aj.il8 L_aj;
      // 60a: if_acmpne 623
      // 60d: sipush 15802
      // 610: ldc2_w 1911448011957763993
      // 613: lload 5
      // 615: lxor
      // 616: invokedynamic o (IJ)Ljava/lang/String; bsm=fkf$afe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61b: nop
      // 61c: goto 628
      // 61f: invokestatic fkf$afe.a (Loov;)Loov;
      // 622: athrow
      // 623: aload 11
      // 625: invokevirtual ar7.m2d ()Ljava/lang/String;
      // 628: invokestatic _x3.faw (Ljava/lang/String;)Ljava/util/List;
      // 62b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 630: astore 17
      // 632: aload 17
      // 634: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 639: ifeq 888
      // 63c: aload 17
      // 63e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 643: checkcast dzm
      // 646: astore 18
      // 648: bipush 5
      // 649: istore 19
      // 64b: bipush 0
      // 64c: istore 20
      // 64e: aload 18
      // 650: iload 7
      // 652: ifeq 678
      // 655: instanceof c_3
      // 658: iload 7
      // 65a: ifeq 8be
      // 65d: goto 664
      // 660: invokestatic fkf$afe.a (Loov;)Loov;
      // 663: athrow
      // 664: ifeq 883
      // 667: goto 66e
      // 66a: invokestatic fkf$afe.a (Loov;)Loov;
      // 66d: athrow
      // 66e: fload 12
      // 670: ldc 10.0
      // 672: nop
      // 673: fadd
      // 674: fstore 12
      // 676: aload 18
      // 678: checkcast c_3
      // 67b: astore 21
      // 67d: aload 9
      // 67f: aload 18
      // 681: invokevirtual dzm.o7h ()Ljava/lang/String;
      // 684: fload 1
      // 685: fconst_1
      // 686: fsub
      // 687: fload 2
      // 688: fload 12
      // 68a: fadd
      // 68b: ldc -12417291
      // 68d: nop
      // 68e: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 691: pop
      // 692: aload 21
      // 694: invokevirtual c_3.dyh ()[Ljava/lang/String;
      // 697: astore 22
      // 699: aload 22
      // 69b: arraylength
      // 69c: istore 23
      // 69e: bipush 0
      // 69f: istore 24
      // 6a1: iload 24
      // 6a3: iload 23
      // 6a5: if_icmpge 875
      // 6a8: aload 22
      // 6aa: iload 24
      // 6ac: aaload
      // 6ad: astore 25
      // 6af: aload 21
      // 6b1: aload 25
      // 6b3: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 6b6: istore 26
      // 6b8: iload 19
      // 6ba: i2f
      // 6bb: aload 9
      // 6bd: aload 25
      // 6bf: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 6c2: fadd
      // 6c3: ldc 20.0
      // 6c5: nop
      // 6c6: fadd
      // 6c7: aload 0
      // 6c8: getfield fkf$afe.qxv Lfkf;
      // 6cb: getfield fkf.ipy F
      // 6ce: ldc 140.0
      // 6d0: nop
      // 6d1: fsub
      // 6d2: fcmpl
      // 6d3: iload 7
      // 6d5: ifeq 877
      // 6d8: iload 7
      // 6da: ifeq 730
      // 6dd: goto 6e4
      // 6e0: invokestatic fkf$afe.a (Loov;)Loov;
      // 6e3: athrow
      // 6e4: iflt 6fc
      // 6e7: goto 6ee
      // 6ea: invokestatic fkf$afe.a (Loov;)Loov;
      // 6ed: athrow
      // 6ee: bipush 5
      // 6ef: istore 19
      // 6f1: fload 12
      // 6f3: ldc 15.0
      // 6f5: nop
      // 6f6: fadd
      // 6f7: fstore 12
      // 6f9: bipush 0
      // 6fa: istore 20
      // 6fc: aload 0
      // 6fd: getfield fkf$afe.qxv Lfkf;
      // 700: fload 3
      // 701: fload 4
      // 703: fload 1
      // 704: iload 19
      // 706: i2f
      // 707: fadd
      // 708: ldc 3.0
      // 70a: nop
      // 70b: fsub
      // 70c: fload 2
      // 70d: fload 12
      // 70f: fadd
      // 710: ldc 8.0
      // 712: nop
      // 713: fadd
      // 714: fload 1
      // 715: iload 19
      // 717: i2f
      // 718: fadd
      // 719: aload 9
      // 71b: aload 25
      // 71d: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 720: fadd
      // 721: ldc 5.0
      // 723: nop
      // 724: fadd
      // 725: fload 2
      // 726: fload 12
      // 728: fadd
      // 729: ldc 23.0
      // 72b: nop
      // 72c: fadd
      // 72d: invokevirtual fkf.imv (FFFFFF)Z
      // 730: iload 7
      // 732: ifeq 7b0
      // 735: ifeq 7a7
      // 738: goto 73f
      // 73b: invokestatic fkf$afe.a (Loov;)Loov;
      // 73e: athrow
      // 73f: bipush 0
      // 740: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 743: iload 7
      // 745: ifeq 7b0
      // 748: goto 74f
      // 74b: invokestatic fkf$afe.a (Loov;)Loov;
      // 74e: athrow
      // 74f: ifeq 7a7
      // 752: goto 759
      // 755: invokestatic fkf$afe.a (Loov;)Loov;
      // 758: athrow
      // 759: aload 0
      // 75a: getfield fkf$afe.lwk Z
      // 75d: iload 7
      // 75f: ifeq 7b0
      // 762: goto 769
      // 765: invokestatic fkf$afe.a (Loov;)Loov;
      // 768: athrow
      // 769: ifeq 7a7
      // 76c: goto 773
      // 76f: invokestatic fkf$afe.a (Loov;)Loov;
      // 772: athrow
      // 773: iload 26
      // 775: iload 7
      // 777: ifeq 7b0
      // 77a: goto 781
      // 77d: invokestatic fkf$afe.a (Loov;)Loov;
      // 780: athrow
      // 781: ifne 7a7
      // 784: goto 78b
      // 787: invokestatic fkf$afe.a (Loov;)Loov;
      // 78a: athrow
      // 78b: aload 0
      // 78c: bipush 0
      // 78d: putfield fkf$afe.lwk Z
      // 790: aload 21
      // 792: aload 25
      // 794: invokevirtual c_3.n1j (Ljava/lang/String;)V
      // 797: aload 21
      // 799: invokevirtual c_3.rxi ()Llva;
      // 79c: fconst_0
      // 79d: invokevirtual lva.lna (F)V
      // 7a0: goto 7a7
      // 7a3: invokestatic fkf$afe.a (Loov;)Loov;
      // 7a6: athrow
      // 7a7: aload 21
      // 7a9: invokevirtual c_3.rxi ()Llva;
      // 7ac: bipush 1
      // 7ad: invokevirtual lva.ry0 (Z)Z
      // 7b0: pop
      // 7b1: fload 1
      // 7b2: iload 19
      // 7b4: i2f
      // 7b5: fadd
      // 7b6: fstore 27
      // 7b8: fload 2
      // 7b9: fload 12
      // 7bb: fadd
      // 7bc: fstore 28
      // 7be: getstatic jsr.mxa Lcyb;
      // 7c1: ldc "n"
      // 7c3: nop
      // 7c4: fload 27
      // 7c6: ldc 6.0
      // 7c8: nop
      // 7c9: fsub
      // 7ca: fload 28
      // 7cc: ldc 12.0
      // 7ce: nop
      // 7cf: fadd
      // 7d0: ldc -12417291
      // 7d2: nop
      // 7d3: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 7d6: pop
      // 7d7: iload 26
      // 7d9: iload 7
      // 7db: ifeq 86b
      // 7de: ifeq 83c
      // 7e1: goto 7e8
      // 7e4: invokestatic fkf$afe.a (Loov;)Loov;
      // 7e7: athrow
      // 7e8: aload 0
      // 7e9: getfield fkf$afe.qxv Lfkf;
      // 7ec: aload 0
      // 7ed: getfield fkf$afe.qxv Lfkf;
      // 7f0: getfield fkf.nh5 F
      // 7f3: ldc 2.1
      // 7f5: nop
      // 7f6: fconst_1
      // 7f7: aload 0
      // 7f8: getfield fkf$afe.qxv Lfkf;
      // 7fb: getfield fkf.nh5 F
      // 7fe: ldc 2.1
      // 800: nop
      // 801: fsub
      // 802: invokestatic java/lang/Math.abs (F)F
      // 805: ldc 25.0
      // 807: nop
      // 808: fmul
      // 809: invokestatic java/lang/Math.max (FF)F
      // 80c: f2d
      // 80d: ldc2_w 0.3
      // 810: dmul
      // 811: d2f
      // 812: invokestatic ybv.lvf (FFF)F
      // 815: putfield fkf.nh5 F
      // 818: fload 27
      // 81a: ldc 2.2
      // 81c: nop
      // 81d: fsub
      // 81e: fload 28
      // 820: ldc 16.1
      // 822: nop
      // 823: fadd
      // 824: bipush 0
      // 825: sipush 360
      // 828: aload 0
      // 829: getfield fkf$afe.qxv Lfkf;
      // 82c: getfield fkf.nh5 F
      // 82f: ldc -12417291
      // 831: nop
      // 832: invokestatic hhf.kvl (FFIIFI)V
      // 835: goto 83c
      // 838: invokestatic fkf$afe.a (Loov;)Loov;
      // 83b: athrow
      // 83c: aload 9
      // 83e: aload 25
      // 840: fload 1
      // 841: iload 19
      // 843: i2f
      // 844: fadd
      // 845: ldc 4.0
      // 847: nop
      // 848: fadd
      // 849: fload 2
      // 84a: fload 12
      // 84c: fadd
      // 84d: ldc 10.0
      // 84f: nop
      // 850: fadd
      // 851: ldc -12417291
      // 853: nop
      // 854: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 857: pop
      // 858: iinc 20 1
      // 85b: iload 19
      // 85d: i2f
      // 85e: aload 9
      // 860: aload 25
      // 862: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 865: ldc 20.0
      // 867: nop
      // 868: fadd
      // 869: fadd
      // 86a: f2i
      // 86b: istore 19
      // 86d: iinc 24 1
      // 870: iload 7
      // 872: ifne 6a1
      // 875: iload 20
      // 877: bipush 1
      // 878: if_icmplt 883
      // 87b: fload 12
      // 87d: ldc 15.0
      // 87f: nop
      // 880: fadd
      // 881: fstore 12
      // 883: iload 7
      // 885: ifne 632
      // 888: aload 0
      // 889: getfield fkf$afe.f4b L_aj;
      // 88c: getstatic _aj.il8 L_aj;
      // 88f: if_acmpne 8a8
      // 892: sipush 15802
      // 895: ldc2_w 1911448011957763993
      // 898: lload 5
      // 89a: lxor
      // 89b: invokedynamic o (IJ)Ljava/lang/String; bsm=fkf$afe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a0: nop
      // 8a1: goto 8ad
      // 8a4: invokestatic fkf$afe.a (Loov;)Loov;
      // 8a7: athrow
      // 8a8: aload 11
      // 8aa: invokevirtual ar7.m2d ()Ljava/lang/String;
      // 8ad: invokestatic _x3.faw (Ljava/lang/String;)Ljava/util/List;
      // 8b0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8b5: astore 17
      // 8b7: aload 17
      // 8b9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8be: ifeq b77
      // 8c1: aload 17
      // 8c3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8c8: checkcast dzm
      // 8cb: astore 18
      // 8cd: aload 18
      // 8cf: iload 7
      // 8d1: ifeq 8ef
      // 8d4: instanceof crk
      // 8d7: iload 7
      // 8d9: ifeq b79
      // 8dc: goto 8e3
      // 8df: invokestatic fkf$afe.a (Loov;)Loov;
      // 8e2: athrow
      // 8e3: ifeq b72
      // 8e6: goto 8ed
      // 8e9: invokestatic fkf$afe.a (Loov;)Loov;
      // 8ec: athrow
      // 8ed: aload 18
      // 8ef: checkcast crk
      // 8f2: astore 19
      // 8f4: fload 1
      // 8f5: iload 14
      // 8f7: i2f
      // 8f8: fadd
      // 8f9: fstore 20
      // 8fb: ldc 110.0
      // 8fd: nop
      // 8fe: fstore 21
      // 900: aload 19
      // 902: invokevirtual crk.u7t ()D
      // 905: aload 19
      // 907: invokevirtual crk.q9v ()F
      // 90a: f2d
      // 90b: dsub
      // 90c: aload 19
      // 90e: invokevirtual crk.uof ()F
      // 911: aload 19
      // 913: invokevirtual crk.q9v ()F
      // 916: fsub
      // 917: f2d
      // 918: ddiv
      // 919: d2f
      // 91a: fstore 22
      // 91c: aload 19
      // 91e: invokevirtual crk.rpv ()Llva;
      // 921: fload 22
      // 923: ldc 10.0
      // 925: nop
      // 926: fmul
      // 927: invokevirtual lva.vej (F)V
      // 92a: aload 19
      // 92c: invokevirtual crk.rpv ()Llva;
      // 92f: bipush 1
      // 930: invokevirtual lva.ry0 (Z)Z
      // 933: pop
      // 934: aload 19
      // 936: invokevirtual crk.rpv ()Llva;
      // 939: invokevirtual lva.o7r ()F
      // 93c: ldc 10.0
      // 93e: nop
      // 93f: fdiv
      // 940: fstore 23
      // 942: fload 2
      // 943: fload 12
      // 945: fadd
      // 946: ldc 23.0
      // 948: nop
      // 949: fadd
      // 94a: fstore 24
      // 94c: fload 2
      // 94d: fload 12
      // 94f: fadd
      // 950: ldc 24.0
      // 952: nop
      // 953: fadd
      // 954: fstore 25
      // 956: aload 9
      // 958: aload 18
      // 95a: invokevirtual dzm.o7h ()Ljava/lang/String;
      // 95d: fload 1
      // 95e: iload 14
      // 960: i2f
      // 961: fadd
      // 962: fload 2
      // 963: ldc 9.0
      // 965: nop
      // 966: fadd
      // 967: fload 12
      // 969: fadd
      // 96a: ldc -6447715
      // 96c: nop
      // 96d: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 970: pop
      // 971: new java/lang/StringBuilder
      // 974: dup
      // 975: invokespecial java/lang/StringBuilder.<init> ()V
      // 978: aload 19
      // 97a: invokevirtual crk.u7t ()D
      // 97d: ldc2_w 100.0
      // 980: dmul
      // 981: invokestatic java/lang/Math.round (D)J
      // 984: l2f
      // 985: ldc 100.0
      // 987: nop
      // 988: fdiv
      // 989: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 98c: ldc ""
      // 98e: nop
      // 98f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 992: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 995: astore 26
      // 997: aload 9
      // 999: new java/lang/StringBuilder
      // 99c: dup
      // 99d: invokespecial java/lang/StringBuilder.<init> ()V
      // 9a0: aload 26
      // 9a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a5: aload 19
      // 9a7: iload 7
      // 9a9: ifeq 9c5
      // 9ac: invokevirtual crk.fht ()Ljava/lang/String;
      // 9af: ifnonnull 9c3
      // 9b2: goto 9b9
      // 9b5: invokestatic fkf$afe.a (Loov;)Loov;
      // 9b8: athrow
      // 9b9: ldc ""
      // 9bb: nop
      // 9bc: goto 9c8
      // 9bf: invokestatic fkf$afe.a (Loov;)Loov;
      // 9c2: athrow
      // 9c3: aload 19
      // 9c5: invokevirtual crk.fht ()Ljava/lang/String;
      // 9c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9ce: fload 1
      // 9cf: iload 14
      // 9d1: i2f
      // 9d2: fadd
      // 9d3: fload 21
      // 9d5: fadd
      // 9d6: aload 9
      // 9d8: new java/lang/StringBuilder
      // 9db: dup
      // 9dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 9df: aload 26
      // 9e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e4: aload 19
      // 9e6: iload 7
      // 9e8: ifeq a04
      // 9eb: invokevirtual crk.fht ()Ljava/lang/String;
      // 9ee: ifnonnull a02
      // 9f1: goto 9f8
      // 9f4: invokestatic fkf$afe.a (Loov;)Loov;
      // 9f7: athrow
      // 9f8: ldc ""
      // 9fa: nop
      // 9fb: goto a07
      // 9fe: invokestatic fkf$afe.a (Loov;)Loov;
      // a01: athrow
      // a02: aload 19
      // a04: invokevirtual crk.fht ()Ljava/lang/String;
      // a07: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a0a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a0d: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // a10: fsub
      // a11: fload 2
      // a12: ldc 9.0
      // a14: nop
      // a15: fadd
      // a16: fload 12
      // a18: fadd
      // a19: ldc -6447715
      // a1b: nop
      // a1c: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // a1f: pop
      // a20: fload 20
      // a22: fload 24
      // a24: fload 20
      // a26: fload 21
      // a28: fadd
      // a29: fload 25
      // a2b: ldc -1842205
      // a2d: nop
      // a2e: invokestatic hhf.cuu (FFFFI)V
      // a31: fload 20
      // a33: fload 24
      // a35: fload 20
      // a37: fload 21
      // a39: fload 23
      // a3b: fmul
      // a3c: fadd
      // a3d: fload 25
      // a3f: ldc -12417291
      // a41: nop
      // a42: invokestatic hhf.cuu (FFFFI)V
      // a45: fload 20
      // a47: fload 21
      // a49: fload 23
      // a4b: fmul
      // a4c: fadd
      // a4d: fload 24
      // a4f: fload 25
      // a51: fadd
      // a52: fconst_2
      // a53: fdiv
      // a54: fconst_2
      // a55: ldc -12417291
      // a57: nop
      // a58: invokestatic hhf.fdt (FFFI)V
      // a5b: aload 0
      // a5c: iload 7
      // a5e: ifeq ace
      // a61: getfield fkf$afe.qxv Lfkf;
      // a64: fload 3
      // a65: fload 4
      // a67: fload 20
      // a69: fload 24
      // a6b: ldc 4.0
      // a6d: nop
      // a6e: fsub
      // a6f: fload 20
      // a71: fload 21
      // a73: fadd
      // a74: fload 25
      // a76: ldc 4.0
      // a78: nop
      // a79: fadd
      // a7a: invokevirtual fkf.imv (FFFFFF)Z
      // a7d: ifeq acd
      // a80: goto a87
      // a83: invokestatic fkf$afe.a (Loov;)Loov;
      // a86: athrow
      // a87: bipush 0
      // a88: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // a8b: iload 7
      // a8d: ifeq ab8
      // a90: goto a97
      // a93: invokestatic fkf$afe.a (Loov;)Loov;
      // a96: athrow
      // a97: ifeq acd
      // a9a: goto aa1
      // a9d: invokestatic fkf$afe.a (Loov;)Loov;
      // aa0: athrow
      // aa1: aload 0
      // aa2: iload 7
      // aa4: ifeq ace
      // aa7: goto aae
      // aaa: invokestatic fkf$afe.a (Loov;)Loov;
      // aad: athrow
      // aae: getfield fkf$afe.lwk Z
      // ab1: goto ab8
      // ab4: invokestatic fkf$afe.a (Loov;)Loov;
      // ab7: athrow
      // ab8: ifeq acd
      // abb: aload 0
      // abc: bipush 0
      // abd: putfield fkf$afe.lwk Z
      // ac0: aload 0
      // ac1: aload 19
      // ac3: putfield fkf$afe.jq6 Lcrk;
      // ac6: goto acd
      // ac9: invokestatic fkf$afe.a (Loov;)Loov;
      // acc: athrow
      // acd: aload 0
      // ace: getfield fkf$afe.jq6 Lcrk;
      // ad1: aload 19
      // ad3: if_acmpne b3d
      // ad6: fload 3
      // ad7: fload 20
      // ad9: fsub
      // ada: fstore 27
      // adc: fload 27
      // ade: ldc 110.0
      // ae0: nop
      // ae1: fcmpl
      // ae2: iload 7
      // ae4: ifeq afa
      // ae7: ifle af6
      // aea: goto af1
      // aed: invokestatic fkf$afe.a (Loov;)Loov;
      // af0: athrow
      // af1: ldc 110.0
      // af3: nop
      // af4: fstore 27
      // af6: fload 27
      // af8: fconst_0
      // af9: fcmpg
      // afa: iload 7
      // afc: ifeq b2d
      // aff: ifge b0c
      // b02: goto b09
      // b05: invokestatic fkf$afe.a (Loov;)Loov;
      // b08: athrow
      // b09: fconst_0
      // b0a: fstore 27
      // b0c: fload 27
      // b0e: ldc 110.0
      // b10: nop
      // b11: fdiv
      // b12: aload 19
      // b14: invokevirtual crk.uof ()F
      // b17: aload 19
      // b19: invokevirtual crk.q9v ()F
      // b1c: fsub
      // b1d: fmul
      // b1e: aload 19
      // b20: invokevirtual crk.q9v ()F
      // b23: fadd
      // b24: aload 19
      // b26: invokevirtual crk.t99 ()F
      // b29: fdiv
      // b2a: invokestatic java/lang/Math.round (F)I
      // b2d: i2f
      // b2e: aload 19
      // b30: invokevirtual crk.t99 ()F
      // b33: fmul
      // b34: fstore 28
      // b36: aload 19
      // b38: fload 28
      // b3a: invokevirtual crk.ms1 (F)V
      // b3d: iinc 14 125
      // b40: iinc 13 1
      // b43: iload 14
      // b45: i2f
      // b46: fload 21
      // b48: fadd
      // b49: aload 0
      // b4a: getfield fkf$afe.qxv Lfkf;
      // b4d: getfield fkf.ipy F
      // b50: ldc 150.0
      // b52: nop
      // b53: fsub
      // b54: fcmpl
      // b55: iload 7
      // b57: ifeq b70
      // b5a: iflt b72
      // b5d: goto b64
      // b60: invokestatic fkf$afe.a (Loov;)Loov;
      // b63: athrow
      // b64: fload 12
      // b66: ldc 20.0
      // b68: nop
      // b69: fadd
      // b6a: fstore 12
      // b6c: bipush 0
      // b6d: istore 13
      // b6f: bipush 0
      // b70: istore 14
      // b72: iload 7
      // b74: ifne 8b7
      // b77: iload 13
      // b79: ifle b84
      // b7c: fload 12
      // b7e: ldc 25.0
      // b80: nop
      // b81: fadd
      // b82: fstore 12
      // b84: aload 0
      // b85: getfield fkf$afe.f4b L_aj;
      // b88: getstatic _aj.il8 L_aj;
      // b8b: if_acmpne ba4
      // b8e: sipush 15802
      // b91: ldc2_w 1911448011957763993
      // b94: lload 5
      // b96: lxor
      // b97: invokedynamic o (IJ)Ljava/lang/String; bsm=fkf$afe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9c: nop
      // b9d: goto ba9
      // ba0: invokestatic fkf$afe.a (Loov;)Loov;
      // ba3: athrow
      // ba4: aload 11
      // ba6: invokevirtual ar7.m2d ()Ljava/lang/String;
      // ba9: invokestatic _x3.faw (Ljava/lang/String;)Ljava/util/List;
      // bac: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // bb1: astore 17
      // bb3: aload 17
      // bb5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // bba: ifeq d62
      // bbd: aload 17
      // bbf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // bc4: checkcast dzm
      // bc7: astore 18
      // bc9: aload 18
      // bcb: iload 7
      // bcd: ifeq beb
      // bd0: instanceof cn7
      // bd3: iload 7
      // bd5: ifeq d64
      // bd8: goto bdf
      // bdb: invokestatic fkf$afe.a (Loov;)Loov;
      // bde: athrow
      // bdf: ifeq d5d
      // be2: goto be9
      // be5: invokestatic fkf$afe.a (Loov;)Loov;
      // be8: athrow
      // be9: aload 18
      // beb: checkcast cn7
      // bee: astore 19
      // bf0: iload 16
      // bf2: i2f
      // bf3: aload 9
      // bf5: aload 19
      // bf7: invokevirtual cn7.o7h ()Ljava/lang/String;
      // bfa: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // bfd: fadd
      // bfe: ldc 20.0
      // c00: nop
      // c01: fadd
      // c02: aload 0
      // c03: getfield fkf$afe.qxv Lfkf;
      // c06: getfield fkf.ipy F
      // c09: ldc 140.0
      // c0b: nop
      // c0c: fsub
      // c0d: fcmpl
      // c0e: iload 7
      // c10: ifeq c30
      // c13: iflt c2b
      // c16: goto c1d
      // c19: invokestatic fkf$afe.a (Loov;)Loov;
      // c1c: athrow
      // c1d: bipush 5
      // c1e: istore 16
      // c20: fload 12
      // c22: ldc 15.0
      // c24: nop
      // c25: fadd
      // c26: fstore 12
      // c28: bipush 0
      // c29: istore 15
      // c2b: aload 19
      // c2d: invokevirtual cn7.g7m ()Z
      // c30: istore 20
      // c32: aload 0
      // c33: getfield fkf$afe.qxv Lfkf;
      // c36: fload 3
      // c37: fload 4
      // c39: fload 1
      // c3a: iload 16
      // c3c: i2f
      // c3d: fadd
      // c3e: ldc 3.0
      // c40: nop
      // c41: fsub
      // c42: fload 2
      // c43: fload 12
      // c45: fadd
      // c46: ldc 8.0
      // c48: nop
      // c49: fadd
      // c4a: fload 1
      // c4b: iload 16
      // c4d: i2f
      // c4e: fadd
      // c4f: aload 9
      // c51: aload 19
      // c53: invokevirtual cn7.o7h ()Ljava/lang/String;
      // c56: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // c59: fadd
      // c5a: ldc 5.0
      // c5c: nop
      // c5d: fadd
      // c5e: fload 2
      // c5f: fload 12
      // c61: fadd
      // c62: ldc 23.0
      // c64: nop
      // c65: fadd
      // c66: invokevirtual fkf.imv (FFFFFF)Z
      // c69: iload 7
      // c6b: ifeq c83
      // c6e: ifeq cd2
      // c71: goto c78
      // c74: invokestatic fkf$afe.a (Loov;)Loov;
      // c77: athrow
      // c78: bipush 0
      // c79: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // c7c: goto c83
      // c7f: invokestatic fkf$afe.a (Loov;)Loov;
      // c82: athrow
      // c83: iload 7
      // c85: ifeq ca9
      // c88: ifeq cd2
      // c8b: goto c92
      // c8e: invokestatic fkf$afe.a (Loov;)Loov;
      // c91: athrow
      // c92: aload 0
      // c93: iload 7
      // c95: ifeq cad
      // c98: goto c9f
      // c9b: invokestatic fkf$afe.a (Loov;)Loov;
      // c9e: athrow
      // c9f: getfield fkf$afe.lwk Z
      // ca2: goto ca9
      // ca5: invokestatic fkf$afe.a (Loov;)Loov;
      // ca8: athrow
      // ca9: ifeq cd2
      // cac: aload 0
      // cad: bipush 0
      // cae: putfield fkf$afe.lwk Z
      // cb1: aload 19
      // cb3: aload 19
      // cb5: invokevirtual cn7.g7m ()Z
      // cb8: iload 7
      // cba: ifeq cc8
      // cbd: ifne ccb
      // cc0: goto cc7
      // cc3: invokestatic fkf$afe.a (Loov;)Loov;
      // cc6: athrow
      // cc7: bipush 1
      // cc8: goto ccc
      // ccb: bipush 0
      // ccc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ccf: invokevirtual cn7.aze (Ljava/lang/Object;)V
      // cd2: getstatic jsr.mxa Lcyb;
      // cd5: ldc "j"
      // cd7: nop
      // cd8: fload 1
      // cd9: iload 16
      // cdb: i2f
      // cdc: fadd
      // cdd: ldc 5.0
      // cdf: nop
      // ce0: fsub
      // ce1: fload 2
      // ce2: fload 12
      // ce4: fadd
      // ce5: ldc 11.5
      // ce7: nop
      // ce8: fadd
      // ce9: iload 20
      // ceb: iload 7
      // ced: ifeq d06
      // cf0: ifeq d04
      // cf3: goto cfa
      // cf6: invokestatic fkf$afe.a (Loov;)Loov;
      // cf9: athrow
      // cfa: ldc -12417291
      // cfc: nop
      // cfd: goto d07
      // d00: invokestatic fkf$afe.a (Loov;)Loov;
      // d03: athrow
      // d04: ldc -3289651
      // d06: nop
      // d07: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // d0a: pop
      // d0b: aload 9
      // d0d: aload 19
      // d0f: invokevirtual cn7.o7h ()Ljava/lang/String;
      // d12: fload 1
      // d13: iload 16
      // d15: i2f
      // d16: fadd
      // d17: ldc 4.0
      // d19: nop
      // d1a: fadd
      // d1b: fload 2
      // d1c: ldc 10.0
      // d1e: nop
      // d1f: fadd
      // d20: fload 12
      // d22: fadd
      // d23: iload 20
      // d25: iload 7
      // d27: ifeq d40
      // d2a: ifeq d3e
      // d2d: goto d34
      // d30: invokestatic fkf$afe.a (Loov;)Loov;
      // d33: athrow
      // d34: ldc -12417291
      // d36: nop
      // d37: goto d41
      // d3a: invokestatic fkf$afe.a (Loov;)Loov;
      // d3d: athrow
      // d3e: ldc -6513508
      // d40: nop
      // d41: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // d44: pop
      // d45: iinc 15 1
      // d48: iload 16
      // d4a: i2f
      // d4b: aload 9
      // d4d: aload 19
      // d4f: invokevirtual cn7.o7h ()Ljava/lang/String;
      // d52: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // d55: ldc 20.0
      // d57: nop
      // d58: fadd
      // d59: fadd
      // d5a: f2i
      // d5b: istore 16
      // d5d: iload 7
      // d5f: ifne bb3
      // d62: iload 15
      // d64: iload 7
      // d66: ifeq d80
      // d69: bipush 1
      // d6a: if_icmplt d7c
      // d6d: goto d74
      // d70: invokestatic fkf$afe.a (Loov;)Loov;
      // d73: athrow
      // d74: fload 12
      // d76: ldc 15.0
      // d78: nop
      // d79: fadd
      // d7a: fstore 12
      // d7c: fload 12
      // d7e: fconst_0
      // d7f: fcmpl
      // d80: iload 7
      // d82: ifeq dc5
      // d85: ifne db2
      // d88: goto d8f
      // d8b: invokestatic fkf$afe.a (Loov;)Loov;
      // d8e: athrow
      // d8f: ldc 15.0
      // d91: nop
      // d92: fstore 12
      // d94: aload 9
      // d96: sipush 31622
      // d99: ldc2_w 7853932709856983463
      // d9c: lload 5
      // d9e: lxor
      // d9f: invokedynamic o (IJ)Ljava/lang/String; bsm=fkf$afe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da4: nop
      // da5: fload 1
      // da6: fload 2
      // da7: ldc 12.0
      // da9: nop
      // daa: fadd
      // dab: ldc -6447715
      // dad: nop
      // dae: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // db1: pop
      // db2: aload 11
      // db4: getfield ar7.abe Llva;
      // db7: fload 12
      // db9: invokevirtual lva.vej (F)V
      // dbc: aload 11
      // dbe: getfield ar7.abe Llva;
      // dc1: bipush 1
      // dc2: invokevirtual lva.ry0 (Z)Z
      // dc5: pop
      // dc6: fload 2
      // dc7: aload 11
      // dc9: getfield ar7.abe Llva;
      // dcc: invokevirtual lva.o7r ()F
      // dcf: fadd
      // dd0: fstore 2
      // dd1: aload 0
      // dd2: dup
      // dd3: getfield fkf$afe.wp4 F
      // dd6: fload 12
      // dd8: ldc 40.0
      // dda: nop
      // ddb: fadd
      // ddc: fsub
      // ddd: putfield fkf$afe.wp4 F
      // de0: aload 0
      // de1: getfield fkf$afe.f4b L_aj;
      // de4: getstatic _aj.il8 L_aj;
      // de7: if_acmpne df1
      // dea: goto fff
      // ded: invokestatic fkf$afe.a (Loov;)Loov;
      // df0: athrow
      // df1: iload 7
      // df3: ifne ff4
      // df6: fload 1
      // df7: ldc 10.0
      // df9: nop
      // dfa: fsub
      // dfb: fload 2
      // dfc: ldc 12.5
      // dfe: nop
      // dff: fsub
      // e00: fload 1
      // e01: aload 0
      // e02: getfield fkf$afe.qxv Lfkf;
      // e05: getfield fkf.ipy F
      // e08: fadd
      // e09: ldc 150.0
      // e0b: nop
      // e0c: fsub
      // e0d: fload 2
      // e0e: ldc 12.5
      // e10: nop
      // e11: fadd
      // e12: aload 11
      // e14: getfield ar7.abe Llva;
      // e17: invokevirtual lva.o7r ()F
      // e1a: fadd
      // e1b: iload 8
      // e1d: iload 7
      // e1f: ifeq e3d
      // e22: goto e29
      // e25: invokestatic fkf$afe.a (Loov;)Loov;
      // e28: athrow
      // e29: ifeq e40
      // e2c: goto e33
      // e2f: invokestatic fkf$afe.a (Loov;)Loov;
      // e32: athrow
      // e33: ldc -12565429
      // e35: nop
      // e36: goto e3d
      // e39: invokestatic fkf$afe.a (Loov;)Loov;
      // e3c: athrow
      // e3d: goto e41
      // e40: bipush -1
      // e41: invokestatic hhf.hxa (FFFFI)V
      // e44: getstatic jsr.q6n Lcyb;
      // e47: ldc "k"
      // e49: nop
      // e4a: fload 1
      // e4b: fload 2
      // e4c: ldc 3.0
      // e4e: nop
      // e4f: fsub
      // e50: ldc -2960686
      // e52: nop
      // e53: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // e56: pop
      // e57: getstatic jsr.rs4 Lcyb;
      // e5a: aload 11
      // e5c: invokevirtual ar7.m2d ()Ljava/lang/String;
      // e5f: fload 1
      // e60: ldc 10.0
      // e62: nop
      // e63: fadd
      // e64: fload 2
      // e65: ldc 6.0
      // e67: nop
      // e68: fsub
      // e69: ldc -6447715
      // e6b: nop
      // e6c: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // e6f: pop
      // e70: getstatic jsr.mxa Lcyb;
      // e73: ldc "i"
      // e75: nop
      // e76: fload 1
      // e77: aload 0
      // e78: getfield fkf$afe.qxv Lfkf;
      // e7b: getfield fkf.ipy F
      // e7e: fadd
      // e7f: ldc 150.0
      // e81: nop
      // e82: fsub
      // e83: ldc 12.0
      // e85: nop
      // e86: fsub
      // e87: fload 2
      // e88: ldc 4.0
      // e8a: nop
      // e8b: fsub
      // e8c: ldc -6447715
      // e8e: nop
      // e8f: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // e92: pop
      // e93: fload 1
      // e94: aload 0
      // e95: getfield fkf$afe.qxv Lfkf;
      // e98: getfield fkf.ipy F
      // e9b: fadd
      // e9c: ldc 400.0
      // e9e: nop
      // e9f: fsub
      // ea0: ldc 218.0
      // ea2: nop
      // ea3: fadd
      // ea4: fload 2
      // ea5: ldc 3.0
      // ea7: nop
      // ea8: fsub
      // ea9: fload 1
      // eaa: aload 0
      // eab: getfield fkf$afe.qxv Lfkf;
      // eae: getfield fkf.ipy F
      // eb1: fadd
      // eb2: ldc 400.0
      // eb4: nop
      // eb5: fsub
      // eb6: ldc 230.0
      // eb8: nop
      // eb9: fadd
      // eba: fload 2
      // ebb: ldc 3.0
      // ebd: nop
      // ebe: fadd
      // ebf: ldc 2.5
      // ec1: nop
      // ec2: ldc -1710619
      // ec4: nop
      // ec5: invokestatic hhf.htg (FFFFFI)V
      // ec8: fload 1
      // ec9: aload 0
      // eca: getfield fkf$afe.qxv Lfkf;
      // ecd: getfield fkf.ipy F
      // ed0: fadd
      // ed1: ldc 400.0
      // ed3: nop
      // ed4: fsub
      // ed5: aload 11
      // ed7: getfield ar7.l7d F
      // eda: fadd
      // edb: fload 2
      // edc: ldc 4.0
      // ede: nop
      // edf: fsub
      // ee0: ldc 8.0
      // ee2: nop
      // ee3: ldc 8.0
      // ee5: nop
      // ee6: ldc 360.0
      // ee8: nop
      // ee9: aload 11
      // eeb: invokevirtual ar7.klu ()Z
      // eee: iload 7
      // ef0: ifeq f07
      // ef3: ifeq f0a
      // ef6: goto efd
      // ef9: invokestatic fkf$afe.a (Loov;)Loov;
      // efc: athrow
      // efd: ldc -12417291
      // eff: nop
      // f00: goto f07
      // f03: invokestatic fkf$afe.a (Loov;)Loov;
      // f06: athrow
      // f07: goto f0b
      // f0a: bipush -1
      // f0b: fconst_1
      // f0c: aload 11
      // f0e: invokevirtual ar7.klu ()Z
      // f11: iload 7
      // f13: ifeq f2c
      // f16: ifeq f2a
      // f19: goto f20
      // f1c: invokestatic fkf$afe.a (Loov;)Loov;
      // f1f: athrow
      // f20: ldc -12417291
      // f22: nop
      // f23: goto f2d
      // f26: invokestatic fkf$afe.a (Loov;)Loov;
      // f29: athrow
      // f2a: ldc -6316129
      // f2c: nop
      // f2d: invokestatic mkt.o8m (FFFFFIFI)V
      // f30: aload 0
      // f31: getfield fkf$afe.qxv Lfkf;
      // f34: fload 3
      // f35: fload 4
      // f37: fload 1
      // f38: aload 0
      // f39: getfield fkf$afe.qxv Lfkf;
      // f3c: getfield fkf.ipy F
      // f3f: fadd
      // f40: ldc 400.0
      // f42: nop
      // f43: fsub
      // f44: ldc 216.0
      // f46: nop
      // f47: fadd
      // f48: fload 2
      // f49: ldc 5.0
      // f4b: nop
      // f4c: fsub
      // f4d: fload 1
      // f4e: aload 0
      // f4f: getfield fkf$afe.qxv Lfkf;
      // f52: getfield fkf.ipy F
      // f55: fadd
      // f56: ldc 400.0
      // f58: nop
      // f59: fsub
      // f5a: ldc 232.0
      // f5c: nop
      // f5d: fadd
      // f5e: fload 2
      // f5f: ldc 5.0
      // f61: nop
      // f62: fadd
      // f63: invokevirtual fkf.imv (FFFFFF)Z
      // f66: iload 7
      // f68: ifeq fdc
      // f6b: ifeq fd3
      // f6e: goto f75
      // f71: invokestatic fkf$afe.a (Loov;)Loov;
      // f74: athrow
      // f75: bipush 0
      // f76: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // f79: iload 7
      // f7b: ifeq fdc
      // f7e: goto f85
      // f81: invokestatic fkf$afe.a (Loov;)Loov;
      // f84: athrow
      // f85: ifeq fd3
      // f88: goto f8f
      // f8b: invokestatic fkf$afe.a (Loov;)Loov;
      // f8e: athrow
      // f8f: aload 0
      // f90: getfield fkf$afe.lwk Z
      // f93: iload 7
      // f95: ifeq fdc
      // f98: goto f9f
      // f9b: invokestatic fkf$afe.a (Loov;)Loov;
      // f9e: athrow
      // f9f: ifeq fd3
      // fa2: goto fa9
      // fa5: invokestatic fkf$afe.a (Loov;)Loov;
      // fa8: athrow
      // fa9: aload 0
      // faa: bipush 0
      // fab: putfield fkf$afe.lwk Z
      // fae: aload 11
      // fb0: aload 11
      // fb2: invokevirtual ar7.klu ()Z
      // fb5: iload 7
      // fb7: ifeq fcc
      // fba: goto fc1
      // fbd: invokestatic fkf$afe.a (Loov;)Loov;
      // fc0: athrow
      // fc1: ifne fcf
      // fc4: goto fcb
      // fc7: invokestatic fkf$afe.a (Loov;)Loov;
      // fca: athrow
      // fcb: bipush 1
      // fcc: goto fd0
      // fcf: bipush 0
      // fd0: invokevirtual ar7.yse (Z)V
      // fd3: aload 11
      // fd5: getfield ar7.abe Llva;
      // fd8: bipush 0
      // fd9: invokevirtual lva.ry0 (Z)Z
      // fdc: pop
      // fdd: fload 2
      // fde: aload 11
      // fe0: getfield ar7.abe Llva;
      // fe3: invokevirtual lva.o7r ()F
      // fe6: fadd
      // fe7: fstore 2
      // fe8: aload 0
      // fe9: dup
      // fea: getfield fkf$afe.wp4 F
      // fed: ldc 40.0
      // fef: nop
      // ff0: fsub
      // ff1: putfield fkf$afe.wp4 F
      // ff4: fload 2
      // ff5: ldc 40.0
      // ff7: nop
      // ff8: fadd
      // ff9: fstore 2
      // ffa: iload 7
      // ffc: ifne 148
      // fff: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2990855124322036977L, 4500743027797919699L, MethodHandles.lookup().lookupClass()).a(241164265759014L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 19171114426417L;
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
      String var6 = "\u0083zÏ\u001a\b½\u000b¸xl\u0006îO¨)\"\u0010\tå»fB÷|)\u0002\u009a4¶Þ¬\u0019%";
      int var8 = "\u0083zÏ\u001a\b½\u000b¸xl\u0006îO¨)\"\u0010\tå»fB÷|)\u0002\u009a4¶Þ¬\u0019%".length();
      char var5 = 16;
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
                     c = new String[4];
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

                  var6 = "læMuÌ×Oò¥`\u0091dgqù\u008b Ö\u0090{I\u0010XçEýÙâ\u0094X\u009d\u007f£ì¼0éì×i\u0096\u001eæ*\u0000âT%ó";
                  var8 = "læMuÌ×Oò¥`\u0091dgqù\u008b Ö\u0090{I\u0010XçEýÙâ\u0094X\u009d\u007f£ì¼0éì×i\u0096\u001eæ*\u0000âT%ó".length();
                  var5 = 16;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11233;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("fkf$afe", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("fkf$afe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
