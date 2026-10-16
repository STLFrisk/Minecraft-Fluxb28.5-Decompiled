import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ywi extends liu {
   public ywi(hr_ var1) {
      super(var1);
   }

   public void fzu(sj_ param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.dp2 ()V
      // 003: dload 2
      // 004: d2f
      // 005: dload 4
      // 007: d2f
      // 008: dload 6
      // 00a: d2f
      // 00b: invokestatic hzu.a4k (FFF)V
      // 00e: invokestatic hzu.ixc ()V
      // 011: ldc 0.5
      // 013: nop
      // 014: ldc 0.5
      // 016: nop
      // 017: ldc 0.5
      // 019: nop
      // 01a: invokestatic hzu.syc (FFF)V
      // 01d: aload 0
      // 01e: aload 1
      // 01f: invokevirtual ywi.sat (Li2h;)Z
      // 022: pop
      // 023: invokestatic OpaquePredicate.b ()I
      // 026: invokestatic jom.yut ()Ljom;
      // 029: astore 11
      // 02b: aload 11
      // 02d: invokevirtual jom.zuq ()Lq3g;
      // 030: astore 12
      // 032: bipush 1
      // 033: istore 13
      // 035: bipush 2
      // 036: istore 14
      // 038: istore 10
      // 03a: ldc 0.0625
      // 03c: nop
      // 03d: fstore 15
      // 03f: ldc 0.125
      // 041: nop
      // 042: fstore 16
      // 044: ldc 0.125
      // 046: nop
      // 047: fstore 17
      // 049: ldc 0.1875
      // 04b: nop
      // 04c: fstore 18
      // 04e: fconst_1
      // 04f: fstore 19
      // 051: ldc 0.5
      // 053: nop
      // 054: fstore 20
      // 056: ldc 0.5
      // 058: nop
      // 059: fstore 21
      // 05b: ldc 180.0
      // 05d: nop
      // 05e: aload 0
      // 05f: getfield ywi.l0g Lhr_;
      // 062: getfield hr_.s7e F
      // 065: fsub
      // 066: fconst_0
      // 067: fconst_1
      // 068: fconst_0
      // 069: invokestatic hzu.a2h (FFFF)V
      // 06c: aload 0
      // 06d: getfield ywi.l0g Lhr_;
      // 070: getfield hr_.fw9 F
      // 073: fneg
      // 074: fconst_1
      // 075: fconst_0
      // 076: fconst_0
      // 077: invokestatic hzu.a2h (FFFF)V
      // 07a: aload 12
      // 07c: bipush 7
      // 07e: getstatic gnl.c03 Lbe7;
      // 081: invokevirtual q3g.ezr (ILbe7;)V
      // 084: aload 12
      // 086: ldc2_w -0.5
      // 089: ldc2_w -0.5
      // 08c: dconst_0
      // 08d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 090: ldc2_w 0.0625
      // 093: ldc2_w 0.1875
      // 096: invokevirtual q3g.h0a (DD)Lq3g;
      // 099: fconst_0
      // 09a: fconst_1
      // 09b: fconst_0
      // 09c: invokevirtual q3g.h3y (FFF)Lq3g;
      // 09f: invokevirtual q3g.pzw ()V
      // 0a2: aload 12
      // 0a4: ldc2_w 0.5
      // 0a7: ldc2_w -0.5
      // 0aa: dconst_0
      // 0ab: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0ae: ldc2_w 0.125
      // 0b1: ldc2_w 0.1875
      // 0b4: invokevirtual q3g.h0a (DD)Lq3g;
      // 0b7: fconst_0
      // 0b8: fconst_1
      // 0b9: fconst_0
      // 0ba: invokevirtual q3g.h3y (FFF)Lq3g;
      // 0bd: invokevirtual q3g.pzw ()V
      // 0c0: aload 12
      // 0c2: ldc2_w 0.5
      // 0c5: ldc2_w 0.5
      // 0c8: dconst_0
      // 0c9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0cc: ldc2_w 0.125
      // 0cf: ldc2_w 0.125
      // 0d2: invokevirtual q3g.h0a (DD)Lq3g;
      // 0d5: fconst_0
      // 0d6: fconst_1
      // 0d7: fconst_0
      // 0d8: invokevirtual q3g.h3y (FFF)Lq3g;
      // 0db: invokevirtual q3g.pzw ()V
      // 0de: aload 12
      // 0e0: ldc2_w -0.5
      // 0e3: ldc2_w 0.5
      // 0e6: dconst_0
      // 0e7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0ea: ldc2_w 0.0625
      // 0ed: ldc2_w 0.125
      // 0f0: invokevirtual q3g.h0a (DD)Lq3g;
      // 0f3: fconst_0
      // 0f4: fconst_1
      // 0f5: fconst_0
      // 0f6: invokevirtual q3g.h3y (FFF)Lq3g;
      // 0f9: invokevirtual q3g.pzw ()V
      // 0fc: aload 11
      // 0fe: invokevirtual jom.q7g ()V
      // 101: invokestatic hzu.eiq ()V
      // 104: invokestatic hzu.x3w ()V
      // 107: aload 1
      // 108: getfield sj_.iqf Lha9;
      // 10b: iload 10
      // 10d: ifeq 125
      // 110: ifnull 439
      // 113: goto 11a
      // 116: invokestatic ywi.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 1
      // 11b: getfield sj_.iqf Lha9;
      // 11e: goto 125
      // 121: invokestatic ywi.a (Loov;)Loov;
      // 124: athrow
      // 125: fload 9
      // 127: invokevirtual ha9.tcg (F)F
      // 12a: fstore 22
      // 12c: fload 22
      // 12e: invokestatic fe6.bug (F)F
      // 131: ldc 3.1415927
      // 133: nop
      // 134: fmul
      // 135: invokestatic fe6.rtn (F)F
      // 138: fstore 23
      // 13a: new fqr
      // 13d: dup
      // 13e: ldc2_w -0.36
      // 141: ldc2_w 0.03
      // 144: ldc2_w 0.35
      // 147: invokespecial fqr.<init> (DDD)V
      // 14a: astore 24
      // 14c: aload 24
      // 14e: aload 1
      // 14f: getfield sj_.iqf Lha9;
      // 152: getfield ha9.j25 F
      // 155: aload 1
      // 156: getfield sj_.iqf Lha9;
      // 159: getfield ha9.y2i F
      // 15c: aload 1
      // 15d: getfield sj_.iqf Lha9;
      // 160: getfield ha9.j25 F
      // 163: fsub
      // 164: fload 9
      // 166: fmul
      // 167: fadd
      // 168: fneg
      // 169: ldc 3.1415927
      // 16b: nop
      // 16c: fmul
      // 16d: ldc 180.0
      // 16f: nop
      // 170: fdiv
      // 171: invokevirtual fqr.mx1 (F)Lfqr;
      // 174: astore 24
      // 176: aload 24
      // 178: aload 1
      // 179: getfield sj_.iqf Lha9;
      // 17c: getfield ha9.p3h F
      // 17f: aload 1
      // 180: getfield sj_.iqf Lha9;
      // 183: getfield ha9.x5k F
      // 186: aload 1
      // 187: getfield sj_.iqf Lha9;
      // 18a: getfield ha9.p3h F
      // 18d: fsub
      // 18e: fload 9
      // 190: fmul
      // 191: fadd
      // 192: fneg
      // 193: ldc 3.1415927
      // 195: nop
      // 196: fmul
      // 197: ldc 180.0
      // 199: nop
      // 19a: fdiv
      // 19b: invokevirtual fqr.av2 (F)Lfqr;
      // 19e: astore 24
      // 1a0: aload 24
      // 1a2: fload 23
      // 1a4: ldc 0.5
      // 1a6: nop
      // 1a7: fmul
      // 1a8: invokevirtual fqr.av2 (F)Lfqr;
      // 1ab: astore 24
      // 1ad: aload 24
      // 1af: fload 23
      // 1b1: fneg
      // 1b2: ldc 0.7
      // 1b4: nop
      // 1b5: fmul
      // 1b6: invokevirtual fqr.mx1 (F)Lfqr;
      // 1b9: astore 24
      // 1bb: aload 1
      // 1bc: getfield sj_.iqf Lha9;
      // 1bf: getfield ha9.bc1 D
      // 1c2: aload 1
      // 1c3: getfield sj_.iqf Lha9;
      // 1c6: getfield ha9.o2v D
      // 1c9: aload 1
      // 1ca: getfield sj_.iqf Lha9;
      // 1cd: getfield ha9.bc1 D
      // 1d0: dsub
      // 1d1: fload 9
      // 1d3: f2d
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: aload 24
      // 1d8: getfield fqr.lvi D
      // 1db: dadd
      // 1dc: dstore 25
      // 1de: aload 1
      // 1df: getfield sj_.iqf Lha9;
      // 1e2: getfield ha9.o_z D
      // 1e5: aload 1
      // 1e6: getfield sj_.iqf Lha9;
      // 1e9: getfield ha9.kfp D
      // 1ec: aload 1
      // 1ed: getfield sj_.iqf Lha9;
      // 1f0: getfield ha9.o_z D
      // 1f3: dsub
      // 1f4: fload 9
      // 1f6: f2d
      // 1f7: dmul
      // 1f8: dadd
      // 1f9: aload 24
      // 1fb: getfield fqr.gn5 D
      // 1fe: dadd
      // 1ff: dstore 27
      // 201: aload 1
      // 202: getfield sj_.iqf Lha9;
      // 205: getfield ha9.a4d D
      // 208: aload 1
      // 209: getfield sj_.iqf Lha9;
      // 20c: getfield ha9.vbd D
      // 20f: aload 1
      // 210: getfield sj_.iqf Lha9;
      // 213: getfield ha9.a4d D
      // 216: dsub
      // 217: fload 9
      // 219: f2d
      // 21a: dmul
      // 21b: dadd
      // 21c: aload 24
      // 21e: getfield fqr.bn2 D
      // 221: dadd
      // 222: dstore 29
      // 224: aload 1
      // 225: getfield sj_.iqf Lha9;
      // 228: invokevirtual ha9.c5y ()F
      // 22b: f2d
      // 22c: dstore 31
      // 22e: aload 0
      // 22f: getfield ywi.l0g Lhr_;
      // 232: getfield hr_.p52 Lmoh;
      // 235: iload 10
      // 237: ifeq 252
      // 23a: ifnull 258
      // 23d: goto 244
      // 240: invokestatic ywi.a (Loov;)Loov;
      // 243: athrow
      // 244: aload 0
      // 245: getfield ywi.l0g Lhr_;
      // 248: getfield hr_.p52 Lmoh;
      // 24b: goto 252
      // 24e: invokestatic ywi.a (Loov;)Loov;
      // 251: athrow
      // 252: getfield moh.i_y I
      // 255: ifgt 278
      // 258: aload 1
      // 259: iload 10
      // 25b: ifeq 350
      // 25e: goto 265
      // 261: invokestatic ywi.a (Loov;)Loov;
      // 264: athrow
      // 265: getfield sj_.iqf Lha9;
      // 268: invokestatic Minecraft.vz1 ()Lc05;
      // 26b: getfield Minecraft.vg8 Ll86;
      // 26e: if_acmpeq 34f
      // 271: goto 278
      // 274: invokestatic ywi.a (Loov;)Loov;
      // 277: athrow
      // 278: aload 1
      // 279: getfield sj_.iqf Lha9;
      // 27c: getfield ha9.gsh F
      // 27f: aload 1
      // 280: getfield sj_.iqf Lha9;
      // 283: getfield ha9.ksw F
      // 286: aload 1
      // 287: getfield sj_.iqf Lha9;
      // 28a: getfield ha9.gsh F
      // 28d: fsub
      // 28e: fload 9
      // 290: fmul
      // 291: fadd
      // 292: ldc 3.1415927
      // 294: nop
      // 295: fmul
      // 296: ldc 180.0
      // 298: nop
      // 299: fdiv
      // 29a: fstore 33
      // 29c: fload 33
      // 29e: invokestatic fe6.rtn (F)F
      // 2a1: f2d
      // 2a2: dstore 34
      // 2a4: fload 33
      // 2a6: invokestatic fe6.ssk (F)F
      // 2a9: f2d
      // 2aa: dstore 36
      // 2ac: ldc2_w 0.35
      // 2af: dstore 38
      // 2b1: ldc2_w 0.8
      // 2b4: dstore 40
      // 2b6: aload 1
      // 2b7: getfield sj_.iqf Lha9;
      // 2ba: getfield ha9.bc1 D
      // 2bd: aload 1
      // 2be: getfield sj_.iqf Lha9;
      // 2c1: getfield ha9.o2v D
      // 2c4: aload 1
      // 2c5: getfield sj_.iqf Lha9;
      // 2c8: getfield ha9.bc1 D
      // 2cb: dsub
      // 2cc: fload 9
      // 2ce: f2d
      // 2cf: dmul
      // 2d0: dadd
      // 2d1: dload 36
      // 2d3: ldc2_w 0.35
      // 2d6: dmul
      // 2d7: dsub
      // 2d8: dload 34
      // 2da: ldc2_w 0.8
      // 2dd: dmul
      // 2de: dsub
      // 2df: dstore 25
      // 2e1: aload 1
      // 2e2: getfield sj_.iqf Lha9;
      // 2e5: getfield ha9.o_z D
      // 2e8: dload 31
      // 2ea: dadd
      // 2eb: aload 1
      // 2ec: getfield sj_.iqf Lha9;
      // 2ef: getfield ha9.kfp D
      // 2f2: aload 1
      // 2f3: getfield sj_.iqf Lha9;
      // 2f6: getfield ha9.o_z D
      // 2f9: dsub
      // 2fa: fload 9
      // 2fc: f2d
      // 2fd: dmul
      // 2fe: dadd
      // 2ff: ldc2_w 0.45
      // 302: dsub
      // 303: dstore 27
      // 305: aload 1
      // 306: getfield sj_.iqf Lha9;
      // 309: getfield ha9.a4d D
      // 30c: aload 1
      // 30d: getfield sj_.iqf Lha9;
      // 310: getfield ha9.vbd D
      // 313: aload 1
      // 314: getfield sj_.iqf Lha9;
      // 317: getfield ha9.a4d D
      // 31a: dsub
      // 31b: fload 9
      // 31d: f2d
      // 31e: dmul
      // 31f: dadd
      // 320: dload 34
      // 322: ldc2_w 0.35
      // 325: dmul
      // 326: dsub
      // 327: dload 36
      // 329: ldc2_w 0.8
      // 32c: dmul
      // 32d: dadd
      // 32e: iload 10
      // 330: ifeq 349
      // 333: dstore 29
      // 335: aload 1
      // 336: getfield sj_.iqf Lha9;
      // 339: invokevirtual ha9.hzv ()Z
      // 33c: ifeq 34c
      // 33f: ldc2_w -0.1875
      // 342: goto 349
      // 345: invokestatic ywi.a (Loov;)Loov;
      // 348: athrow
      // 349: goto 34d
      // 34c: dconst_0
      // 34d: dstore 31
      // 34f: aload 1
      // 350: getfield sj_.bc1 D
      // 353: aload 1
      // 354: getfield sj_.o2v D
      // 357: aload 1
      // 358: getfield sj_.bc1 D
      // 35b: dsub
      // 35c: fload 9
      // 35e: f2d
      // 35f: dmul
      // 360: dadd
      // 361: dstore 33
      // 363: aload 1
      // 364: getfield sj_.o_z D
      // 367: aload 1
      // 368: getfield sj_.kfp D
      // 36b: aload 1
      // 36c: getfield sj_.o_z D
      // 36f: dsub
      // 370: fload 9
      // 372: f2d
      // 373: dmul
      // 374: dadd
      // 375: ldc2_w 0.25
      // 378: dadd
      // 379: dstore 35
      // 37b: aload 1
      // 37c: getfield sj_.a4d D
      // 37f: aload 1
      // 380: getfield sj_.vbd D
      // 383: aload 1
      // 384: getfield sj_.a4d D
      // 387: dsub
      // 388: fload 9
      // 38a: f2d
      // 38b: dmul
      // 38c: dadd
      // 38d: dstore 37
      // 38f: dload 25
      // 391: dload 33
      // 393: dsub
      // 394: d2f
      // 395: f2d
      // 396: dstore 39
      // 398: dload 27
      // 39a: dload 35
      // 39c: dsub
      // 39d: d2f
      // 39e: f2d
      // 39f: dload 31
      // 3a1: dadd
      // 3a2: dstore 41
      // 3a4: dload 29
      // 3a6: dload 37
      // 3a8: dsub
      // 3a9: d2f
      // 3aa: f2d
      // 3ab: dstore 43
      // 3ad: invokestatic hzu.m_1 ()V
      // 3b0: invokestatic hzu.fpt ()V
      // 3b3: aload 12
      // 3b5: bipush 3
      // 3b6: getstatic gnl.gec Lbe7;
      // 3b9: invokevirtual q3g.ezr (ILbe7;)V
      // 3bc: bipush 16
      // 3be: istore 45
      // 3c0: bipush 0
      // 3c1: istore 46
      // 3c3: iload 46
      // 3c5: bipush 16
      // 3c7: if_icmpgt 420
      // 3ca: iload 46
      // 3cc: i2f
      // 3cd: ldc 16.0
      // 3cf: nop
      // 3d0: fdiv
      // 3d1: fstore 47
      // 3d3: aload 12
      // 3d5: dload 2
      // 3d6: dload 39
      // 3d8: fload 47
      // 3da: f2d
      // 3db: dmul
      // 3dc: dadd
      // 3dd: dload 4
      // 3df: dload 41
      // 3e1: fload 47
      // 3e3: fload 47
      // 3e5: fmul
      // 3e6: fload 47
      // 3e8: fadd
      // 3e9: f2d
      // 3ea: dmul
      // 3eb: ldc2_w 0.5
      // 3ee: dmul
      // 3ef: dadd
      // 3f0: ldc2_w 0.25
      // 3f3: dadd
      // 3f4: dload 6
      // 3f6: dload 43
      // 3f8: fload 47
      // 3fa: f2d
      // 3fb: dmul
      // 3fc: dadd
      // 3fd: invokevirtual q3g.g5o (DDD)Lq3g;
      // 400: bipush 0
      // 401: bipush 0
      // 402: bipush 0
      // 403: sipush 255
      // 406: invokevirtual q3g.fje (IIII)Lq3g;
      // 409: invokevirtual q3g.pzw ()V
      // 40c: iinc 46 1
      // 40f: iload 10
      // 411: ifeq 42b
      // 414: iload 10
      // 416: ifne 3c3
      // 419: goto 420
      // 41c: invokestatic ywi.a (Loov;)Loov;
      // 41f: athrow
      // 420: aload 11
      // 422: invokevirtual jom.q7g ()V
      // 425: invokestatic hzu.s7q ()V
      // 428: invokestatic hzu.rqj ()V
      // 42b: aload 0
      // 42c: aload 1
      // 42d: dload 2
      // 42e: dload 4
      // 430: dload 6
      // 432: fload 8
      // 434: fload 9
      // 436: invokespecial liu.apl (Li2h;DDDFF)V
      // 439: return
   }

   public gdz amw(sj_ var1) {
      return _k8;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.amw((sj_)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.fzu((sj_)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-382914483677089524L, 398658104685997702L, MethodHandles.lookup().lookupClass()).a(2000375597752L);
      // $VF: monitorexit
      long var4 = var10000 ^ 96553062601356L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("ºt>\u009e\u0085\tFØ\u0004^ÒB\u0086boü¥ºÖ\u009fÆ\u001bD\u000b\u0019Óß\u0098\u008f\u001a¡o".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      _k8 = new gdz(var0);
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
