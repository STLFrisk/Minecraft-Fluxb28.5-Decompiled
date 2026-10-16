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

public class hqj {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hqj() {
      this.z05();
   }

   public void z05() {
      long var1 = a ^ 58682149602444L;
      yu2 var3 = c05.vz1().dd_();
      this.pvw[0] = var3.brw(a<"r">(29835, 2550979319971342634L ^ var1));
      this.pvw[1] = var3.brw(a<"r">(2475, 4910164937256145929L ^ var1));
      this._3u[0] = var3.brw(a<"r">(14569, 239634820796294474L ^ var1));
      this._3u[1] = var3.brw(a<"r">(20922, 1491057543624084506L ^ var1));
   }

   public boolean q5q(m5n param1, zfz param2, mew param3, q3g param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: invokestatic hxt.ly3 ()Z
      // 008: ifeq 01a
      // 00b: aload 2
      // 00c: aload 3
      // 00d: aload 1
      // 00e: aload 4
      // 010: invokestatic net/optifine/shaders/SVertexBuilder.pushEntity (Lzfz;Lmew;Lm5n;Lq3g;)V
      // 013: goto 01a
      // 016: invokestatic hqj.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 2
      // 01b: invokeinterface zfz.r_y ()Le0x; 1
      // 020: checkcast hmv
      // 023: astore 7
      // 025: aload 7
      // 027: aload 1
      // 028: aload 3
      // 029: invokevirtual hmv.c7i (Lm5n;Lmew;)V
      // 02c: aload 7
      // 02e: invokevirtual hmv.p1r ()Lp3y;
      // 031: getstatic p3y.e1s Lp3y;
      // 034: if_acmpne 042
      // 037: aload 0
      // 038: getfield hqj.pvw [Lsla;
      // 03b: goto 046
      // 03e: invokestatic hqj.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield hqj._3u [Lsla;
      // 046: astore 8
      // 048: aload 4
      // 04a: aload 2
      // 04b: aload 3
      // 04c: invokevirtual q3g.xgm (Lzfz;Lmew;)Lnet/optifine/render/RenderEnv;
      // 04f: astore 9
      // 051: aload 1
      // 052: aload 2
      // 053: aload 3
      // 054: aload 9
      // 056: invokestatic net/optifine/CustomColors.getFluidColor (Lm5n;Lzfz;Lmew;Lnet/optifine/render/RenderEnv;)I
      // 059: istore 10
      // 05b: iload 10
      // 05d: bipush 16
      // 05f: ishr
      // 060: sipush 255
      // 063: iand
      // 064: i2f
      // 065: ldc 255.0
      // 067: nop
      // 068: fdiv
      // 069: fstore 11
      // 06b: iload 10
      // 06d: bipush 8
      // 06f: ishr
      // 070: sipush 255
      // 073: iand
      // 074: i2f
      // 075: ldc 255.0
      // 077: nop
      // 078: fdiv
      // 079: fstore 12
      // 07b: iload 10
      // 07d: sipush 255
      // 080: iand
      // 081: i2f
      // 082: ldc 255.0
      // 084: nop
      // 085: fdiv
      // 086: fstore 13
      // 088: aload 7
      // 08a: aload 1
      // 08b: aload 3
      // 08c: invokevirtual mew.nuv ()Lmew;
      // 08f: getstatic vt2.rf3 Lvt2;
      // 092: invokevirtual hmv.ron (Lm5n;Lmew;Lvt2;)Z
      // 095: istore 14
      // 097: aload 7
      // 099: aload 1
      // 09a: aload 3
      // 09b: invokevirtual mew.eve ()Lmew;
      // 09e: getstatic vt2.m3r Lvt2;
      // 0a1: invokevirtual hmv.ron (Lm5n;Lmew;Lvt2;)Z
      // 0a4: istore 15
      // 0a6: aload 9
      // 0a8: invokevirtual net/optifine/render/RenderEnv.getBorderFlags ()[Z
      // 0ab: astore 16
      // 0ad: aload 16
      // 0af: bipush 0
      // 0b0: aload 7
      // 0b2: aload 1
      // 0b3: aload 3
      // 0b4: invokevirtual mew.idu ()Lmew;
      // 0b7: getstatic vt2.z9q Lvt2;
      // 0ba: invokevirtual hmv.ron (Lm5n;Lmew;Lvt2;)Z
      // 0bd: bastore
      // 0be: aload 16
      // 0c0: bipush 1
      // 0c1: aload 7
      // 0c3: aload 1
      // 0c4: aload 3
      // 0c5: invokevirtual mew.z6x ()Lmew;
      // 0c8: getstatic vt2.mxp Lvt2;
      // 0cb: invokevirtual hmv.ron (Lm5n;Lmew;Lvt2;)Z
      // 0ce: bastore
      // 0cf: aload 16
      // 0d1: bipush 2
      // 0d2: aload 7
      // 0d4: aload 1
      // 0d5: aload 3
      // 0d6: invokevirtual mew.y8e ()Lmew;
      // 0d9: getstatic vt2.te4 Lvt2;
      // 0dc: invokevirtual hmv.ron (Lm5n;Lmew;Lvt2;)Z
      // 0df: bastore
      // 0e0: aload 16
      // 0e2: bipush 3
      // 0e3: aload 7
      // 0e5: aload 1
      // 0e6: aload 3
      // 0e7: invokevirtual mew.o_8 ()Lmew;
      // 0ea: getstatic vt2.zk4 Lvt2;
      // 0ed: invokevirtual hmv.ron (Lm5n;Lmew;Lvt2;)Z
      // 0f0: bastore
      // 0f1: iload 14
      // 0f3: iload 5
      // 0f5: ifne 183
      // 0f8: ifne 182
      // 0fb: goto 102
      // 0fe: invokestatic hqj.a (Loov;)Loov;
      // 101: athrow
      // 102: iload 15
      // 104: iload 5
      // 106: ifne 183
      // 109: goto 110
      // 10c: invokestatic hqj.a (Loov;)Loov;
      // 10f: athrow
      // 110: ifne 182
      // 113: goto 11a
      // 116: invokestatic hqj.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 16
      // 11c: bipush 0
      // 11d: baload
      // 11e: iload 5
      // 120: ifne 183
      // 123: goto 12a
      // 126: invokestatic hqj.a (Loov;)Loov;
      // 129: athrow
      // 12a: ifne 182
      // 12d: goto 134
      // 130: invokestatic hqj.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 16
      // 136: bipush 1
      // 137: baload
      // 138: iload 5
      // 13a: ifne 183
      // 13d: goto 144
      // 140: invokestatic hqj.a (Loov;)Loov;
      // 143: athrow
      // 144: ifne 182
      // 147: goto 14e
      // 14a: invokestatic hqj.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 16
      // 150: bipush 2
      // 151: baload
      // 152: iload 5
      // 154: ifne 183
      // 157: goto 15e
      // 15a: invokestatic hqj.a (Loov;)Loov;
      // 15d: athrow
      // 15e: ifne 182
      // 161: goto 168
      // 164: invokestatic hqj.a (Loov;)Loov;
      // 167: athrow
      // 168: aload 16
      // 16a: bipush 3
      // 16b: baload
      // 16c: iload 5
      // 16e: ifne a0a
      // 171: goto 178
      // 174: invokestatic hqj.a (Loov;)Loov;
      // 177: athrow
      // 178: ifeq a09
      // 17b: goto 182
      // 17e: invokestatic hqj.a (Loov;)Loov;
      // 181: athrow
      // 182: bipush 0
      // 183: istore 6
      // 185: ldc 0.5
      // 187: nop
      // 188: fstore 17
      // 18a: fconst_1
      // 18b: fstore 18
      // 18d: ldc 0.8
      // 18f: nop
      // 190: fstore 19
      // 192: ldc 0.6
      // 194: nop
      // 195: fstore 20
      // 197: aload 7
      // 199: invokevirtual hmv.p1r ()Lp3y;
      // 19c: astore 21
      // 19e: aload 0
      // 19f: aload 1
      // 1a0: aload 3
      // 1a1: aload 21
      // 1a3: invokespecial hqj._6u (Lm5n;Lmew;Lp3y;)F
      // 1a6: fstore 22
      // 1a8: aload 0
      // 1a9: aload 1
      // 1aa: aload 3
      // 1ab: invokevirtual mew.z6x ()Lmew;
      // 1ae: aload 21
      // 1b0: invokespecial hqj._6u (Lm5n;Lmew;Lp3y;)F
      // 1b3: fstore 23
      // 1b5: aload 0
      // 1b6: aload 1
      // 1b7: aload 3
      // 1b8: invokevirtual mew.o_8 ()Lmew;
      // 1bb: invokevirtual mew.z6x ()Lmew;
      // 1be: aload 21
      // 1c0: invokespecial hqj._6u (Lm5n;Lmew;Lp3y;)F
      // 1c3: fstore 24
      // 1c5: aload 0
      // 1c6: aload 1
      // 1c7: aload 3
      // 1c8: invokevirtual mew.o_8 ()Lmew;
      // 1cb: aload 21
      // 1cd: invokespecial hqj._6u (Lm5n;Lmew;Lp3y;)F
      // 1d0: fstore 25
      // 1d2: aload 3
      // 1d3: invokevirtual mew.getX ()I
      // 1d6: i2d
      // 1d7: dstore 26
      // 1d9: aload 3
      // 1da: invokevirtual mew.getY ()I
      // 1dd: i2d
      // 1de: dstore 28
      // 1e0: aload 3
      // 1e1: invokevirtual mew.getZ ()I
      // 1e4: i2d
      // 1e5: dstore 30
      // 1e7: ldc 0.001
      // 1e9: nop
      // 1ea: fstore 32
      // 1ec: iload 14
      // 1ee: iload 5
      // 1f0: ifne 53d
      // 1f3: ifeq 53b
      // 1f6: goto 1fd
      // 1f9: invokestatic hqj.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: bipush 1
      // 1fe: istore 6
      // 200: aload 8
      // 202: bipush 0
      // 203: aaload
      // 204: astore 33
      // 206: aload 1
      // 207: aload 3
      // 208: aload 21
      // 20a: invokestatic hmv._47 (Lm5n;Lmew;Lp3y;)D
      // 20d: d2f
      // 20e: fstore 34
      // 210: fload 34
      // 212: ldc -999.0
      // 214: nop
      // 215: fcmpl
      // 216: iload 5
      // 218: ifne 260
      // 21b: ifle 22b
      // 21e: goto 225
      // 221: invokestatic hqj.a (Loov;)Loov;
      // 224: athrow
      // 225: aload 8
      // 227: bipush 1
      // 228: aaload
      // 229: astore 33
      // 22b: aload 4
      // 22d: aload 33
      // 22f: invokevirtual q3g.z_s (Lsla;)V
      // 232: fload 22
      // 234: fload 32
      // 236: fsub
      // 237: fstore 22
      // 239: fload 23
      // 23b: fload 32
      // 23d: fsub
      // 23e: fstore 23
      // 240: fload 24
      // 242: fload 32
      // 244: fsub
      // 245: fstore 24
      // 247: fload 25
      // 249: fload 32
      // 24b: fsub
      // 24c: fstore 25
      // 24e: fload 34
      // 250: ldc -999.0
      // 252: nop
      // 253: iload 5
      // 255: ifne 2ab
      // 258: fcmpg
      // 259: goto 260
      // 25c: invokestatic hqj.a (Loov;)Loov;
      // 25f: athrow
      // 260: ifge 29c
      // 263: aload 33
      // 265: dconst_0
      // 266: invokevirtual sla.oon (D)F
      // 269: fstore 35
      // 26b: aload 33
      // 26d: dconst_0
      // 26e: invokevirtual sla.h0c (D)F
      // 271: fstore 39
      // 273: fload 35
      // 275: fstore 36
      // 277: aload 33
      // 279: ldc2_w 16.0
      // 27c: invokevirtual sla.h0c (D)F
      // 27f: fstore 40
      // 281: aload 33
      // 283: ldc2_w 16.0
      // 286: invokevirtual sla.oon (D)F
      // 289: fstore 37
      // 28b: fload 40
      // 28d: fstore 41
      // 28f: fload 37
      // 291: fstore 38
      // 293: fload 39
      // 295: fstore 42
      // 297: iload 5
      // 299: ifeq 36a
      // 29c: fload 34
      // 29e: invokestatic fe6.rtn (F)F
      // 2a1: ldc 0.25
      // 2a3: nop
      // 2a4: goto 2ab
      // 2a7: invokestatic hqj.a (Loov;)Loov;
      // 2aa: athrow
      // 2ab: fmul
      // 2ac: fstore 43
      // 2ae: fload 34
      // 2b0: invokestatic fe6.ssk (F)F
      // 2b3: ldc 0.25
      // 2b5: nop
      // 2b6: fmul
      // 2b7: fstore 44
      // 2b9: ldc 8.0
      // 2bb: nop
      // 2bc: fstore 45
      // 2be: aload 33
      // 2c0: ldc 8.0
      // 2c2: nop
      // 2c3: fload 44
      // 2c5: fneg
      // 2c6: fload 43
      // 2c8: fsub
      // 2c9: ldc 16.0
      // 2cb: nop
      // 2cc: fmul
      // 2cd: fadd
      // 2ce: f2d
      // 2cf: invokevirtual sla.oon (D)F
      // 2d2: fstore 35
      // 2d4: aload 33
      // 2d6: ldc 8.0
      // 2d8: nop
      // 2d9: fload 44
      // 2db: fneg
      // 2dc: fload 43
      // 2de: fadd
      // 2df: ldc 16.0
      // 2e1: nop
      // 2e2: fmul
      // 2e3: fadd
      // 2e4: f2d
      // 2e5: invokevirtual sla.h0c (D)F
      // 2e8: fstore 39
      // 2ea: aload 33
      // 2ec: ldc 8.0
      // 2ee: nop
      // 2ef: fload 44
      // 2f1: fneg
      // 2f2: fload 43
      // 2f4: fadd
      // 2f5: ldc 16.0
      // 2f7: nop
      // 2f8: fmul
      // 2f9: fadd
      // 2fa: f2d
      // 2fb: invokevirtual sla.oon (D)F
      // 2fe: fstore 36
      // 300: aload 33
      // 302: ldc 8.0
      // 304: nop
      // 305: fload 44
      // 307: fload 43
      // 309: fadd
      // 30a: ldc 16.0
      // 30c: nop
      // 30d: fmul
      // 30e: fadd
      // 30f: f2d
      // 310: invokevirtual sla.h0c (D)F
      // 313: fstore 40
      // 315: aload 33
      // 317: ldc 8.0
      // 319: nop
      // 31a: fload 44
      // 31c: fload 43
      // 31e: fadd
      // 31f: ldc 16.0
      // 321: nop
      // 322: fmul
      // 323: fadd
      // 324: f2d
      // 325: invokevirtual sla.oon (D)F
      // 328: fstore 37
      // 32a: aload 33
      // 32c: ldc 8.0
      // 32e: nop
      // 32f: fload 44
      // 331: fload 43
      // 333: fsub
      // 334: ldc 16.0
      // 336: nop
      // 337: fmul
      // 338: fadd
      // 339: f2d
      // 33a: invokevirtual sla.h0c (D)F
      // 33d: fstore 41
      // 33f: aload 33
      // 341: ldc 8.0
      // 343: nop
      // 344: fload 44
      // 346: fload 43
      // 348: fsub
      // 349: ldc 16.0
      // 34b: nop
      // 34c: fmul
      // 34d: fadd
      // 34e: f2d
      // 34f: invokevirtual sla.oon (D)F
      // 352: fstore 38
      // 354: aload 33
      // 356: ldc 8.0
      // 358: nop
      // 359: fload 44
      // 35b: fneg
      // 35c: fload 43
      // 35e: fsub
      // 35f: ldc 16.0
      // 361: nop
      // 362: fmul
      // 363: fadd
      // 364: f2d
      // 365: invokevirtual sla.h0c (D)F
      // 368: fstore 42
      // 36a: aload 7
      // 36c: aload 1
      // 36d: aload 3
      // 36e: invokevirtual hmv.pil (Lm5n;Lmew;)I
      // 371: istore 43
      // 373: iload 43
      // 375: bipush 16
      // 377: ishr
      // 378: ldc 65535
      // 37a: nop
      // 37b: iand
      // 37c: istore 44
      // 37e: iload 43
      // 380: ldc 65535
      // 382: nop
      // 383: iand
      // 384: istore 45
      // 386: fload 18
      // 388: fload 11
      // 38a: fmul
      // 38b: fstore 46
      // 38d: fload 18
      // 38f: fload 12
      // 391: fmul
      // 392: fstore 47
      // 394: fload 18
      // 396: fload 13
      // 398: fmul
      // 399: fstore 48
      // 39b: aload 4
      // 39d: dload 26
      // 39f: dconst_0
      // 3a0: dadd
      // 3a1: dload 28
      // 3a3: fload 22
      // 3a5: f2d
      // 3a6: dadd
      // 3a7: dload 30
      // 3a9: dconst_0
      // 3aa: dadd
      // 3ab: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3ae: fload 46
      // 3b0: fload 47
      // 3b2: fload 48
      // 3b4: fconst_1
      // 3b5: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 3b8: fload 35
      // 3ba: f2d
      // 3bb: fload 39
      // 3bd: f2d
      // 3be: invokevirtual q3g.h0a (DD)Lq3g;
      // 3c1: iload 44
      // 3c3: iload 45
      // 3c5: invokevirtual q3g.iu0 (II)Lq3g;
      // 3c8: invokevirtual q3g.pzw ()V
      // 3cb: aload 4
      // 3cd: dload 26
      // 3cf: dconst_0
      // 3d0: dadd
      // 3d1: dload 28
      // 3d3: fload 23
      // 3d5: f2d
      // 3d6: dadd
      // 3d7: dload 30
      // 3d9: dconst_1
      // 3da: dadd
      // 3db: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3de: fload 46
      // 3e0: fload 47
      // 3e2: fload 48
      // 3e4: fconst_1
      // 3e5: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 3e8: fload 36
      // 3ea: f2d
      // 3eb: fload 40
      // 3ed: f2d
      // 3ee: invokevirtual q3g.h0a (DD)Lq3g;
      // 3f1: iload 44
      // 3f3: iload 45
      // 3f5: invokevirtual q3g.iu0 (II)Lq3g;
      // 3f8: invokevirtual q3g.pzw ()V
      // 3fb: aload 4
      // 3fd: dload 26
      // 3ff: dconst_1
      // 400: dadd
      // 401: dload 28
      // 403: fload 24
      // 405: f2d
      // 406: dadd
      // 407: dload 30
      // 409: dconst_1
      // 40a: dadd
      // 40b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 40e: fload 46
      // 410: fload 47
      // 412: fload 48
      // 414: fconst_1
      // 415: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 418: fload 37
      // 41a: f2d
      // 41b: fload 41
      // 41d: f2d
      // 41e: invokevirtual q3g.h0a (DD)Lq3g;
      // 421: iload 44
      // 423: iload 45
      // 425: invokevirtual q3g.iu0 (II)Lq3g;
      // 428: invokevirtual q3g.pzw ()V
      // 42b: aload 4
      // 42d: dload 26
      // 42f: dconst_1
      // 430: dadd
      // 431: dload 28
      // 433: fload 25
      // 435: f2d
      // 436: dadd
      // 437: dload 30
      // 439: dconst_0
      // 43a: dadd
      // 43b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 43e: fload 46
      // 440: fload 47
      // 442: fload 48
      // 444: fconst_1
      // 445: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 448: fload 38
      // 44a: f2d
      // 44b: fload 42
      // 44d: f2d
      // 44e: invokevirtual q3g.h0a (DD)Lq3g;
      // 451: iload 44
      // 453: iload 45
      // 455: invokevirtual q3g.iu0 (II)Lq3g;
      // 458: invokevirtual q3g.pzw ()V
      // 45b: aload 7
      // 45d: aload 1
      // 45e: aload 3
      // 45f: invokevirtual mew.nuv ()Lmew;
      // 462: invokevirtual hmv.m98 (Lm5n;Lmew;)Z
      // 465: iload 5
      // 467: ifne 53d
      // 46a: ifeq 53b
      // 46d: goto 474
      // 470: invokestatic hqj.a (Loov;)Loov;
      // 473: athrow
      // 474: aload 4
      // 476: dload 26
      // 478: dconst_0
      // 479: dadd
      // 47a: dload 28
      // 47c: fload 22
      // 47e: f2d
      // 47f: dadd
      // 480: dload 30
      // 482: dconst_0
      // 483: dadd
      // 484: invokevirtual q3g.g5o (DDD)Lq3g;
      // 487: fload 46
      // 489: fload 47
      // 48b: fload 48
      // 48d: fconst_1
      // 48e: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 491: fload 35
      // 493: f2d
      // 494: fload 39
      // 496: f2d
      // 497: invokevirtual q3g.h0a (DD)Lq3g;
      // 49a: iload 44
      // 49c: iload 45
      // 49e: invokevirtual q3g.iu0 (II)Lq3g;
      // 4a1: invokevirtual q3g.pzw ()V
      // 4a4: aload 4
      // 4a6: dload 26
      // 4a8: dconst_1
      // 4a9: dadd
      // 4aa: dload 28
      // 4ac: fload 25
      // 4ae: f2d
      // 4af: dadd
      // 4b0: dload 30
      // 4b2: dconst_0
      // 4b3: dadd
      // 4b4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4b7: fload 46
      // 4b9: fload 47
      // 4bb: fload 48
      // 4bd: fconst_1
      // 4be: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 4c1: fload 38
      // 4c3: f2d
      // 4c4: fload 42
      // 4c6: f2d
      // 4c7: invokevirtual q3g.h0a (DD)Lq3g;
      // 4ca: iload 44
      // 4cc: iload 45
      // 4ce: invokevirtual q3g.iu0 (II)Lq3g;
      // 4d1: invokevirtual q3g.pzw ()V
      // 4d4: aload 4
      // 4d6: dload 26
      // 4d8: dconst_1
      // 4d9: dadd
      // 4da: dload 28
      // 4dc: fload 24
      // 4de: f2d
      // 4df: dadd
      // 4e0: dload 30
      // 4e2: dconst_1
      // 4e3: dadd
      // 4e4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4e7: fload 46
      // 4e9: fload 47
      // 4eb: fload 48
      // 4ed: fconst_1
      // 4ee: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 4f1: fload 37
      // 4f3: f2d
      // 4f4: fload 41
      // 4f6: f2d
      // 4f7: invokevirtual q3g.h0a (DD)Lq3g;
      // 4fa: iload 44
      // 4fc: iload 45
      // 4fe: invokevirtual q3g.iu0 (II)Lq3g;
      // 501: invokevirtual q3g.pzw ()V
      // 504: aload 4
      // 506: dload 26
      // 508: dconst_0
      // 509: dadd
      // 50a: dload 28
      // 50c: fload 23
      // 50e: f2d
      // 50f: dadd
      // 510: dload 30
      // 512: dconst_1
      // 513: dadd
      // 514: invokevirtual q3g.g5o (DDD)Lq3g;
      // 517: fload 46
      // 519: fload 47
      // 51b: fload 48
      // 51d: fconst_1
      // 51e: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 521: fload 36
      // 523: f2d
      // 524: fload 40
      // 526: f2d
      // 527: invokevirtual q3g.h0a (DD)Lq3g;
      // 52a: iload 44
      // 52c: iload 45
      // 52e: invokevirtual q3g.iu0 (II)Lq3g;
      // 531: invokevirtual q3g.pzw ()V
      // 534: goto 53b
      // 537: invokestatic hqj.a (Loov;)Loov;
      // 53a: athrow
      // 53b: iload 15
      // 53d: iload 5
      // 53f: ifne 670
      // 542: ifeq 66f
      // 545: goto 54c
      // 548: invokestatic hqj.a (Loov;)Loov;
      // 54b: athrow
      // 54c: aload 4
      // 54e: aload 8
      // 550: bipush 0
      // 551: aaload
      // 552: invokevirtual q3g.z_s (Lsla;)V
      // 555: aload 8
      // 557: bipush 0
      // 558: aaload
      // 559: invokevirtual sla.l3u ()F
      // 55c: fstore 33
      // 55e: aload 8
      // 560: bipush 0
      // 561: aaload
      // 562: invokevirtual sla.w2b ()F
      // 565: fstore 34
      // 567: aload 8
      // 569: bipush 0
      // 56a: aaload
      // 56b: invokevirtual sla.bhi ()F
      // 56e: fstore 35
      // 570: aload 8
      // 572: bipush 0
      // 573: aaload
      // 574: invokevirtual sla.e8_ ()F
      // 577: fstore 36
      // 579: aload 7
      // 57b: aload 1
      // 57c: aload 3
      // 57d: invokevirtual mew.eve ()Lmew;
      // 580: invokevirtual hmv.pil (Lm5n;Lmew;)I
      // 583: istore 37
      // 585: iload 37
      // 587: bipush 16
      // 589: ishr
      // 58a: ldc 65535
      // 58c: nop
      // 58d: iand
      // 58e: istore 38
      // 590: iload 37
      // 592: ldc 65535
      // 594: nop
      // 595: iand
      // 596: istore 39
      // 598: getstatic vt2.m3r Lvt2;
      // 59b: invokestatic atg.o3p (Lvt2;)F
      // 59e: fstore 40
      // 5a0: aload 4
      // 5a2: dload 26
      // 5a4: dload 28
      // 5a6: dload 30
      // 5a8: dconst_1
      // 5a9: dadd
      // 5aa: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5ad: fload 11
      // 5af: fload 40
      // 5b1: fmul
      // 5b2: fload 12
      // 5b4: fload 40
      // 5b6: fmul
      // 5b7: fload 13
      // 5b9: fload 40
      // 5bb: fmul
      // 5bc: fconst_1
      // 5bd: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 5c0: fload 33
      // 5c2: f2d
      // 5c3: fload 36
      // 5c5: f2d
      // 5c6: invokevirtual q3g.h0a (DD)Lq3g;
      // 5c9: iload 38
      // 5cb: iload 39
      // 5cd: invokevirtual q3g.iu0 (II)Lq3g;
      // 5d0: invokevirtual q3g.pzw ()V
      // 5d3: aload 4
      // 5d5: dload 26
      // 5d7: dload 28
      // 5d9: dload 30
      // 5db: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5de: fload 11
      // 5e0: fload 40
      // 5e2: fmul
      // 5e3: fload 12
      // 5e5: fload 40
      // 5e7: fmul
      // 5e8: fload 13
      // 5ea: fload 40
      // 5ec: fmul
      // 5ed: fconst_1
      // 5ee: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 5f1: fload 33
      // 5f3: f2d
      // 5f4: fload 35
      // 5f6: f2d
      // 5f7: invokevirtual q3g.h0a (DD)Lq3g;
      // 5fa: iload 38
      // 5fc: iload 39
      // 5fe: invokevirtual q3g.iu0 (II)Lq3g;
      // 601: invokevirtual q3g.pzw ()V
      // 604: aload 4
      // 606: dload 26
      // 608: dconst_1
      // 609: dadd
      // 60a: dload 28
      // 60c: dload 30
      // 60e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 611: fload 11
      // 613: fload 40
      // 615: fmul
      // 616: fload 12
      // 618: fload 40
      // 61a: fmul
      // 61b: fload 13
      // 61d: fload 40
      // 61f: fmul
      // 620: fconst_1
      // 621: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 624: fload 34
      // 626: f2d
      // 627: fload 35
      // 629: f2d
      // 62a: invokevirtual q3g.h0a (DD)Lq3g;
      // 62d: iload 38
      // 62f: iload 39
      // 631: invokevirtual q3g.iu0 (II)Lq3g;
      // 634: invokevirtual q3g.pzw ()V
      // 637: aload 4
      // 639: dload 26
      // 63b: dconst_1
      // 63c: dadd
      // 63d: dload 28
      // 63f: dload 30
      // 641: dconst_1
      // 642: dadd
      // 643: invokevirtual q3g.g5o (DDD)Lq3g;
      // 646: fload 11
      // 648: fload 40
      // 64a: fmul
      // 64b: fload 12
      // 64d: fload 40
      // 64f: fmul
      // 650: fload 13
      // 652: fload 40
      // 654: fmul
      // 655: fconst_1
      // 656: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 659: fload 34
      // 65b: f2d
      // 65c: fload 36
      // 65e: f2d
      // 65f: invokevirtual q3g.h0a (DD)Lq3g;
      // 662: iload 38
      // 664: iload 39
      // 666: invokevirtual q3g.iu0 (II)Lq3g;
      // 669: invokevirtual q3g.pzw ()V
      // 66c: bipush 1
      // 66d: istore 6
      // 66f: bipush 0
      // 670: istore 33
      // 672: iload 33
      // 674: bipush 4
      // 675: if_icmpge 9d7
      // 678: bipush 0
      // 679: istore 34
      // 67b: bipush 0
      // 67c: istore 35
      // 67e: iload 33
      // 680: iload 5
      // 682: ifne 9eb
      // 685: iload 5
      // 687: ifne 6a0
      // 68a: goto 691
      // 68d: invokestatic hqj.a (Loov;)Loov;
      // 690: athrow
      // 691: ifne 69e
      // 694: goto 69b
      // 697: invokestatic hqj.a (Loov;)Loov;
      // 69a: athrow
      // 69b: iinc 35 -1
      // 69e: iload 33
      // 6a0: bipush 1
      // 6a1: iload 5
      // 6a3: ifne 6b6
      // 6a6: if_icmpne 6b3
      // 6a9: goto 6b0
      // 6ac: invokestatic hqj.a (Loov;)Loov;
      // 6af: athrow
      // 6b0: iinc 35 1
      // 6b3: iload 33
      // 6b5: bipush 2
      // 6b6: iload 5
      // 6b8: ifne 6cb
      // 6bb: if_icmpne 6c8
      // 6be: goto 6c5
      // 6c1: invokestatic hqj.a (Loov;)Loov;
      // 6c4: athrow
      // 6c5: iinc 34 -1
      // 6c8: iload 33
      // 6ca: bipush 3
      // 6cb: if_icmpne 6d1
      // 6ce: iinc 34 1
      // 6d1: aload 3
      // 6d2: iload 34
      // 6d4: bipush 0
      // 6d5: iload 35
      // 6d7: invokevirtual mew.ec4 (III)Lmew;
      // 6da: astore 36
      // 6dc: aload 8
      // 6de: bipush 1
      // 6df: aaload
      // 6e0: astore 37
      // 6e2: aload 4
      // 6e4: aload 37
      // 6e6: invokevirtual q3g.z_s (Lsla;)V
      // 6e9: iload 5
      // 6eb: ifne 9d2
      // 6ee: aload 16
      // 6f0: iload 33
      // 6f2: baload
      // 6f3: ifeq 9cf
      // 6f6: goto 6fd
      // 6f9: invokestatic hqj.a (Loov;)Loov;
      // 6fc: athrow
      // 6fd: iload 33
      // 6ff: iload 5
      // 701: ifne 745
      // 704: goto 70b
      // 707: invokestatic hqj.a (Loov;)Loov;
      // 70a: athrow
      // 70b: ifne 73c
      // 70e: goto 715
      // 711: invokestatic hqj.a (Loov;)Loov;
      // 714: athrow
      // 715: fload 22
      // 717: fstore 38
      // 719: fload 25
      // 71b: fstore 39
      // 71d: dload 26
      // 71f: dstore 40
      // 721: dload 26
      // 723: dconst_1
      // 724: dadd
      // 725: dstore 44
      // 727: dload 30
      // 729: fload 32
      // 72b: f2d
      // 72c: dadd
      // 72d: dstore 42
      // 72f: dload 30
      // 731: fload 32
      // 733: f2d
      // 734: dadd
      // 735: dstore 46
      // 737: iload 5
      // 739: ifeq 7da
      // 73c: iload 33
      // 73e: goto 745
      // 741: invokestatic hqj.a (Loov;)Loov;
      // 744: athrow
      // 745: bipush 1
      // 746: iload 5
      // 748: ifne 78a
      // 74b: if_icmpne 780
      // 74e: goto 755
      // 751: invokestatic hqj.a (Loov;)Loov;
      // 754: athrow
      // 755: fload 24
      // 757: fstore 38
      // 759: fload 23
      // 75b: fstore 39
      // 75d: dload 26
      // 75f: dconst_1
      // 760: dadd
      // 761: dstore 40
      // 763: dload 26
      // 765: dstore 44
      // 767: dload 30
      // 769: dconst_1
      // 76a: dadd
      // 76b: fload 32
      // 76d: f2d
      // 76e: dsub
      // 76f: dstore 42
      // 771: dload 30
      // 773: dconst_1
      // 774: dadd
      // 775: fload 32
      // 777: f2d
      // 778: dsub
      // 779: dstore 46
      // 77b: iload 5
      // 77d: ifeq 7da
      // 780: iload 33
      // 782: bipush 2
      // 783: goto 78a
      // 786: invokestatic hqj.a (Loov;)Loov;
      // 789: athrow
      // 78a: if_icmpne 7b4
      // 78d: fload 23
      // 78f: fstore 38
      // 791: fload 22
      // 793: fstore 39
      // 795: dload 26
      // 797: fload 32
      // 799: f2d
      // 79a: dadd
      // 79b: dstore 40
      // 79d: dload 26
      // 79f: fload 32
      // 7a1: f2d
      // 7a2: dadd
      // 7a3: dstore 44
      // 7a5: dload 30
      // 7a7: dconst_1
      // 7a8: dadd
      // 7a9: dstore 42
      // 7ab: dload 30
      // 7ad: dstore 46
      // 7af: iload 5
      // 7b1: ifeq 7da
      // 7b4: fload 25
      // 7b6: fstore 38
      // 7b8: fload 24
      // 7ba: fstore 39
      // 7bc: dload 26
      // 7be: dconst_1
      // 7bf: dadd
      // 7c0: fload 32
      // 7c2: f2d
      // 7c3: dsub
      // 7c4: dstore 40
      // 7c6: dload 26
      // 7c8: dconst_1
      // 7c9: dadd
      // 7ca: fload 32
      // 7cc: f2d
      // 7cd: dsub
      // 7ce: dstore 44
      // 7d0: dload 30
      // 7d2: dstore 42
      // 7d4: dload 30
      // 7d6: dconst_1
      // 7d7: dadd
      // 7d8: dstore 46
      // 7da: bipush 1
      // 7db: istore 6
      // 7dd: aload 37
      // 7df: dconst_0
      // 7e0: invokevirtual sla.oon (D)F
      // 7e3: fstore 48
      // 7e5: aload 37
      // 7e7: ldc2_w 8.0
      // 7ea: invokevirtual sla.oon (D)F
      // 7ed: fstore 49
      // 7ef: aload 37
      // 7f1: fconst_1
      // 7f2: fload 38
      // 7f4: fsub
      // 7f5: ldc 16.0
      // 7f7: nop
      // 7f8: fmul
      // 7f9: ldc 0.5
      // 7fb: nop
      // 7fc: fmul
      // 7fd: f2d
      // 7fe: invokevirtual sla.h0c (D)F
      // 801: fstore 50
      // 803: aload 37
      // 805: fconst_1
      // 806: fload 39
      // 808: fsub
      // 809: ldc 16.0
      // 80b: nop
      // 80c: fmul
      // 80d: ldc 0.5
      // 80f: nop
      // 810: fmul
      // 811: f2d
      // 812: invokevirtual sla.h0c (D)F
      // 815: fstore 51
      // 817: aload 37
      // 819: ldc2_w 8.0
      // 81c: invokevirtual sla.h0c (D)F
      // 81f: fstore 52
      // 821: aload 7
      // 823: aload 1
      // 824: aload 36
      // 826: invokevirtual hmv.pil (Lm5n;Lmew;)I
      // 829: istore 53
      // 82b: iload 53
      // 82d: bipush 16
      // 82f: ishr
      // 830: ldc 65535
      // 832: nop
      // 833: iand
      // 834: istore 54
      // 836: iload 53
      // 838: ldc 65535
      // 83a: nop
      // 83b: iand
      // 83c: istore 55
      // 83e: iload 33
      // 840: bipush 2
      // 841: if_icmpge 851
      // 844: getstatic vt2.z9q Lvt2;
      // 847: invokestatic atg.o3p (Lvt2;)F
      // 84a: goto 857
      // 84d: invokestatic hqj.a (Loov;)Loov;
      // 850: athrow
      // 851: getstatic vt2.te4 Lvt2;
      // 854: invokestatic atg.o3p (Lvt2;)F
      // 857: fstore 56
      // 859: fload 18
      // 85b: fload 56
      // 85d: fmul
      // 85e: fload 11
      // 860: fmul
      // 861: fstore 57
      // 863: fload 18
      // 865: fload 56
      // 867: fmul
      // 868: fload 12
      // 86a: fmul
      // 86b: fstore 58
      // 86d: fload 18
      // 86f: fload 56
      // 871: fmul
      // 872: fload 13
      // 874: fmul
      // 875: fstore 59
      // 877: aload 4
      // 879: dload 40
      // 87b: dload 28
      // 87d: fload 38
      // 87f: f2d
      // 880: dadd
      // 881: dload 42
      // 883: invokevirtual q3g.g5o (DDD)Lq3g;
      // 886: fload 57
      // 888: fload 58
      // 88a: fload 59
      // 88c: fconst_1
      // 88d: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 890: fload 48
      // 892: f2d
      // 893: fload 50
      // 895: f2d
      // 896: invokevirtual q3g.h0a (DD)Lq3g;
      // 899: iload 54
      // 89b: iload 55
      // 89d: invokevirtual q3g.iu0 (II)Lq3g;
      // 8a0: invokevirtual q3g.pzw ()V
      // 8a3: aload 4
      // 8a5: dload 44
      // 8a7: dload 28
      // 8a9: fload 39
      // 8ab: f2d
      // 8ac: dadd
      // 8ad: dload 46
      // 8af: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8b2: fload 57
      // 8b4: fload 58
      // 8b6: fload 59
      // 8b8: fconst_1
      // 8b9: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 8bc: fload 49
      // 8be: f2d
      // 8bf: fload 51
      // 8c1: f2d
      // 8c2: invokevirtual q3g.h0a (DD)Lq3g;
      // 8c5: iload 54
      // 8c7: iload 55
      // 8c9: invokevirtual q3g.iu0 (II)Lq3g;
      // 8cc: invokevirtual q3g.pzw ()V
      // 8cf: aload 4
      // 8d1: dload 44
      // 8d3: dload 28
      // 8d5: dconst_0
      // 8d6: dadd
      // 8d7: dload 46
      // 8d9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 8dc: fload 57
      // 8de: fload 58
      // 8e0: fload 59
      // 8e2: fconst_1
      // 8e3: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 8e6: fload 49
      // 8e8: f2d
      // 8e9: fload 52
      // 8eb: f2d
      // 8ec: invokevirtual q3g.h0a (DD)Lq3g;
      // 8ef: iload 54
      // 8f1: iload 55
      // 8f3: invokevirtual q3g.iu0 (II)Lq3g;
      // 8f6: invokevirtual q3g.pzw ()V
      // 8f9: aload 4
      // 8fb: dload 40
      // 8fd: dload 28
      // 8ff: dconst_0
      // 900: dadd
      // 901: dload 42
      // 903: invokevirtual q3g.g5o (DDD)Lq3g;
      // 906: fload 57
      // 908: fload 58
      // 90a: fload 59
      // 90c: fconst_1
      // 90d: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 910: fload 48
      // 912: f2d
      // 913: fload 52
      // 915: f2d
      // 916: invokevirtual q3g.h0a (DD)Lq3g;
      // 919: iload 54
      // 91b: iload 55
      // 91d: invokevirtual q3g.iu0 (II)Lq3g;
      // 920: invokevirtual q3g.pzw ()V
      // 923: aload 4
      // 925: dload 40
      // 927: dload 28
      // 929: dconst_0
      // 92a: dadd
      // 92b: dload 42
      // 92d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 930: fload 57
      // 932: fload 58
      // 934: fload 59
      // 936: fconst_1
      // 937: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 93a: fload 48
      // 93c: f2d
      // 93d: fload 52
      // 93f: f2d
      // 940: invokevirtual q3g.h0a (DD)Lq3g;
      // 943: iload 54
      // 945: iload 55
      // 947: invokevirtual q3g.iu0 (II)Lq3g;
      // 94a: invokevirtual q3g.pzw ()V
      // 94d: aload 4
      // 94f: dload 44
      // 951: dload 28
      // 953: dconst_0
      // 954: dadd
      // 955: dload 46
      // 957: invokevirtual q3g.g5o (DDD)Lq3g;
      // 95a: fload 57
      // 95c: fload 58
      // 95e: fload 59
      // 960: fconst_1
      // 961: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 964: fload 49
      // 966: f2d
      // 967: fload 52
      // 969: f2d
      // 96a: invokevirtual q3g.h0a (DD)Lq3g;
      // 96d: iload 54
      // 96f: iload 55
      // 971: invokevirtual q3g.iu0 (II)Lq3g;
      // 974: invokevirtual q3g.pzw ()V
      // 977: aload 4
      // 979: dload 44
      // 97b: dload 28
      // 97d: fload 39
      // 97f: f2d
      // 980: dadd
      // 981: dload 46
      // 983: invokevirtual q3g.g5o (DDD)Lq3g;
      // 986: fload 57
      // 988: fload 58
      // 98a: fload 59
      // 98c: fconst_1
      // 98d: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 990: fload 49
      // 992: f2d
      // 993: fload 51
      // 995: f2d
      // 996: invokevirtual q3g.h0a (DD)Lq3g;
      // 999: iload 54
      // 99b: iload 55
      // 99d: invokevirtual q3g.iu0 (II)Lq3g;
      // 9a0: invokevirtual q3g.pzw ()V
      // 9a3: aload 4
      // 9a5: dload 40
      // 9a7: dload 28
      // 9a9: fload 38
      // 9ab: f2d
      // 9ac: dadd
      // 9ad: dload 42
      // 9af: invokevirtual q3g.g5o (DDD)Lq3g;
      // 9b2: fload 57
      // 9b4: fload 58
      // 9b6: fload 59
      // 9b8: fconst_1
      // 9b9: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 9bc: fload 48
      // 9be: f2d
      // 9bf: fload 50
      // 9c1: f2d
      // 9c2: invokevirtual q3g.h0a (DD)Lq3g;
      // 9c5: iload 54
      // 9c7: iload 55
      // 9c9: invokevirtual q3g.iu0 (II)Lq3g;
      // 9cc: invokevirtual q3g.pzw ()V
      // 9cf: iinc 33 1
      // 9d2: iload 5
      // 9d4: ifeq 672
      // 9d7: aload 4
      // 9d9: aconst_null
      // 9da: checkcast sla
      // 9dd: invokevirtual q3g.z_s (Lsla;)V
      // 9e0: iload 6
      // 9e2: istore 33
      // 9e4: iload 33
      // 9e6: istore 34
      // 9e8: invokestatic hxt.ly3 ()Z
      // 9eb: iload 5
      // 9ed: ifne a08
      // 9f0: ifeq a06
      // 9f3: goto 9fa
      // 9f6: invokestatic hqj.a (Loov;)Loov;
      // 9f9: athrow
      // 9fa: aload 4
      // 9fc: invokestatic net/optifine/shaders/SVertexBuilder.popEntity (Lq3g;)V
      // 9ff: goto a06
      // a02: invokestatic hqj.a (Loov;)Loov;
      // a05: athrow
      // a06: iload 34
      // a08: ireturn
      // a09: bipush 0
      // a0a: istore 6
      // a0c: invokestatic hxt.ly3 ()Z
      // a0f: iload 5
      // a11: ifne a43
      // a14: ifeq a41
      // a17: goto a1e
      // a1a: invokestatic hqj.a (Loov;)Loov;
      // a1d: athrow
      // a1e: aload 4
      // a20: invokestatic net/optifine/shaders/SVertexBuilder.popEntity (Lq3g;)V
      // a23: goto a41
      // a26: invokestatic hqj.a (Loov;)Loov;
      // a29: athrow
      // a2a: astore 60
      // a2c: invokestatic hxt.ly3 ()Z
      // a2f: ifeq a3e
      // a32: aload 4
      // a34: invokestatic net/optifine/shaders/SVertexBuilder.popEntity (Lq3g;)V
      // a37: goto a3e
      // a3a: invokestatic hqj.a (Loov;)Loov;
      // a3d: athrow
      // a3e: aload 60
      // a40: athrow
      // a41: iload 6
      // a43: ireturn
   }

   private float _6u(m5n param1, mew param2, p3y param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 5
      // 03: invokestatic t9d.b ()I
      // 06: fconst_0
      // 07: fstore 6
      // 09: istore 4
      // 0b: bipush 0
      // 0c: istore 7
      // 0e: iload 7
      // 10: bipush 4
      // 11: if_icmpge ec
      // 14: aload 2
      // 15: iload 7
      // 17: bipush 1
      // 18: iand
      // 19: ineg
      // 1a: bipush 0
      // 1b: iload 7
      // 1d: bipush 1
      // 1e: ishr
      // 1f: bipush 1
      // 20: iand
      // 21: ineg
      // 22: invokevirtual mew.ec4 (III)Lmew;
      // 25: astore 8
      // 27: aload 1
      // 28: aload 8
      // 2a: invokevirtual mew.nuv ()Lmew;
      // 2d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 32: iload 4
      // 34: ifeq 58
      // 37: invokeinterface zfz.r_y ()Le0x; 1
      // 3c: invokevirtual e0x.p1r ()Lp3y;
      // 3f: aload 3
      // 40: if_acmpne 50
      // 43: goto 4a
      // 46: invokestatic hqj.a (Loov;)Loov;
      // 49: athrow
      // 4a: fconst_1
      // 4b: freturn
      // 4c: invokestatic hqj.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: aload 8
      // 53: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 58: astore 9
      // 5a: aload 9
      // 5c: invokeinterface zfz.r_y ()Le0x; 1
      // 61: invokevirtual e0x.p1r ()Lp3y;
      // 64: astore 10
      // 66: aload 10
      // 68: iload 4
      // 6a: ifeq 81
      // 6d: aload 3
      // 6e: if_acmpeq 95
      // 71: goto 78
      // 74: invokestatic hqj.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 10
      // 7a: goto 81
      // 7d: invokestatic hqj.a (Loov;)Loov;
      // 80: athrow
      // 81: invokevirtual p3y.gk6 ()Z
      // 84: ifne e4
      // 87: fload 6
      // 89: fconst_1
      // 8a: fadd
      // 8b: fstore 6
      // 8d: iinc 5 1
      // 90: iload 4
      // 92: ifne e4
      // 95: aload 9
      // 97: getstatic hmv.nfg L_ku;
      // 9a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 9f: checkcast java/lang/Integer
      // a2: invokevirtual java/lang/Integer.intValue ()I
      // a5: istore 11
      // a7: iload 4
      // a9: ifeq d4
      // ac: iload 11
      // ae: bipush 8
      // b0: if_icmpge c6
      // b3: goto ba
      // b6: invokestatic hqj.a (Loov;)Loov;
      // b9: athrow
      // ba: iload 11
      // bc: ifne d7
      // bf: goto c6
      // c2: invokestatic hqj.a (Loov;)Loov;
      // c5: athrow
      // c6: fload 6
      // c8: iload 11
      // ca: invokestatic hmv.jou (I)F
      // cd: ldc 10.0
      // cf: nop
      // d0: fmul
      // d1: fadd
      // d2: fstore 6
      // d4: iinc 5 10
      // d7: fload 6
      // d9: iload 11
      // db: invokestatic hmv.jou (I)F
      // de: fadd
      // df: fstore 6
      // e1: iinc 5 1
      // e4: iinc 7 1
      // e7: iload 4
      // e9: ifne 0e
      // ec: fconst_1
      // ed: fload 6
      // ef: iload 5
      // f1: i2f
      // f2: fdiv
      // f3: fsub
      // f4: freturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6377380053654369125L, 2996567114126964768L, MethodHandles.lookup().lookupClass()).a(111524653720488L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 14209355980045L;
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
      String var6 = "%õüÏÊzþÅÌn\u0084Q\bæ\u0098\u0098\u0019\u0099{7@\u0080²7iÙ±É³\u009fÚ\u0092<-*»Êe\u001f\u0015Í\u0000Ù\u001f\u000b\bP\u0013ñ\u0004\u007f\u0019\u0007+-ï8º×#ØØ¸¡>Å>\u009a\u0082\u0099\u0013W,À\u00077û4}Üt¹\u0004 GA$¤·\u0019\u0085\u001e\u0014±\u00072÷\u0010Ä\u001d¸n\u0091\u008b¼®B§n\u0007\u008d\n2";
      int var8 = "%õüÏÊzþÅÌn\u0084Q\bæ\u0098\u0098\u0019\u0099{7@\u0080²7iÙ±É³\u009fÚ\u0092<-*»Êe\u001f\u0015Í\u0000Ù\u001f\u000b\bP\u0013ñ\u0004\u007f\u0019\u0007+-ï8º×#ØØ¸¡>Å>\u009a\u0082\u0099\u0013W,À\u00077û4}Üt¹\u0004 GA$¤·\u0019\u0085\u001e\u0014±\u00072÷\u0010Ä\u001d¸n\u0091\u008b¼®B§n\u0007\u008d\n2"
         .length();
      char var5 = '8';
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

                  var6 = "KÌÍY\u00902\u001dó\u00ad?\u0006\u0095\u008cjõÕÃÍ&kípSl\u0019\u009e¾å|tµÝ\n\u008fY§õ\u001a\"\u009e\u001e\u0089Åï0@\u0091µ8\u0018aþ \u000eÄÑ\br*\"ÝÈ\u000bÙâ\u0095\u008e{Ø¨Âí¾uÇÍnT}hÈ¦ª\u0004u-òxË¢]ÑTöá ½®TN9®\u001e\u009e\u008f";
                  var8 = "KÌÍY\u00902\u001dó\u00ad?\u0006\u0095\u008cjõÕÃÍ&kípSl\u0019\u009e¾å|tµÝ\n\u008fY§õ\u001a\"\u009e\u001e\u0089Åï0@\u0091µ8\u0018aþ \u000eÄÑ\br*\"ÝÈ\u000bÙâ\u0095\u008e{Ø¨Âí¾uÇÍnT}hÈ¦ª\u0004u-òxË¢]ÑTöá ½®TN9®\u001e\u009e\u008f"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4345;
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
            throw new RuntimeException("hqj", var10);
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
         throw new RuntimeException("hqj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
