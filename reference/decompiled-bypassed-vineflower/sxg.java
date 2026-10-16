import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class sxg extends b0t {
   private static final Logger nk1;
   private final c05 ogb;
   private final List cqo = Lists.newArrayList();
   private final List ng2 = Lists.newArrayList();
   private final List rcp = Lists.newArrayList();
   private int mtm;
   private boolean kgp;
   private static final long a;
   private static final String b;

   public sxg(c05 var1) {
      this.ogb = var1;
   }

   public void v_k(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: getstatic kgt.irb Lf5k;
      // 007: invokevirtual f5k.klu ()Z
      // 00a: iload 2
      // 00b: ifeq 040
      // 00e: ifeq 037
      // 011: goto 018
      // 014: invokestatic sxg.a (Loov;)Loov;
      // 017: athrow
      // 018: getstatic f5k.rzn Lcn7;
      // 01b: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 01e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 021: iload 2
      // 022: ifeq 040
      // 025: goto 02c
      // 028: invokestatic sxg.a (Loov;)Loov;
      // 02b: athrow
      // 02c: ifeq 037
      // 02f: goto 036
      // 032: invokestatic sxg.a (Loov;)Loov;
      // 035: athrow
      // 036: return
      // 037: getstatic zwr.gr7 Lcn7;
      // 03a: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 03d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 040: ifeq 04d
      // 043: aload 0
      // 044: iload 1
      // 045: invokevirtual sxg.hgk (I)V
      // 048: return
      // 049: invokestatic sxg.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: iload 2
      // 04f: ifeq 070
      // 052: getfield sxg.ogb Lc05;
      // 055: getfield c05.oxn Lmoh;
      // 058: getfield moh.v13 Lha9$c4q;
      // 05b: getstatic ha9$c4q.ulg Lha9$c4q;
      // 05e: if_acmpeq 334
      // 061: goto 068
      // 064: invokestatic sxg.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: goto 070
      // 06c: invokestatic sxg.a (Loov;)Loov;
      // 06f: athrow
      // 070: invokevirtual sxg.gij ()I
      // 073: istore 3
      // 074: bipush 0
      // 075: istore 4
      // 077: bipush 0
      // 078: istore 5
      // 07a: aload 0
      // 07b: getfield sxg.rcp Ljava/util/List;
      // 07e: invokeinterface java/util/List.size ()I 1
      // 083: istore 6
      // 085: aload 0
      // 086: getfield sxg.ogb Lc05;
      // 089: getfield c05.oxn Lmoh;
      // 08c: getfield moh.z4g F
      // 08f: ldc 0.9
      // 091: nop
      // 092: fmul
      // 093: ldc 0.1
      // 095: nop
      // 096: fadd
      // 097: fstore 7
      // 099: iload 6
      // 09b: iload 2
      // 09c: ifeq 0bf
      // 09f: ifle 334
      // 0a2: goto 0a9
      // 0a5: invokestatic sxg.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: iload 2
      // 0ab: ifeq 0c6
      // 0ae: goto 0b5
      // 0b1: invokestatic sxg.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: invokevirtual sxg.b5_ ()Z
      // 0b8: goto 0bf
      // 0bb: invokestatic sxg.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifeq 0c5
      // 0c2: bipush 1
      // 0c3: istore 4
      // 0c5: aload 0
      // 0c6: invokevirtual sxg.in4 ()F
      // 0c9: fstore 8
      // 0cb: aload 0
      // 0cc: invokevirtual sxg.x7a ()I
      // 0cf: i2f
      // 0d0: fload 8
      // 0d2: fdiv
      // 0d3: invokestatic fe6.v1i (F)I
      // 0d6: istore 9
      // 0d8: invokestatic hzu.dp2 ()V
      // 0db: fconst_2
      // 0dc: ldc 20.0
      // 0de: nop
      // 0df: fconst_0
      // 0e0: invokestatic hzu.a4k (FFF)V
      // 0e3: fload 8
      // 0e5: fload 8
      // 0e7: fconst_1
      // 0e8: invokestatic hzu.syc (FFF)V
      // 0eb: bipush 0
      // 0ec: istore 10
      // 0ee: iload 10
      // 0f0: aload 0
      // 0f1: getfield sxg.mtm I
      // 0f4: iadd
      // 0f5: aload 0
      // 0f6: getfield sxg.rcp Ljava/util/List;
      // 0f9: invokeinterface java/util/List.size ()I 1
      // 0fe: if_icmpge 268
      // 101: iload 10
      // 103: iload 2
      // 104: ifeq 26a
      // 107: iload 2
      // 108: ifeq 26a
      // 10b: goto 112
      // 10e: invokestatic sxg.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 3
      // 113: if_icmpge 268
      // 116: goto 11d
      // 119: invokestatic sxg.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield sxg.rcp Ljava/util/List;
      // 121: iload 10
      // 123: aload 0
      // 124: getfield sxg.mtm I
      // 127: iadd
      // 128: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 12d: checkcast dj1
      // 130: astore 11
      // 132: iload 2
      // 133: ifeq 264
      // 136: aload 11
      // 138: ifnull 261
      // 13b: goto 142
      // 13e: invokestatic sxg.a (Loov;)Loov;
      // 141: athrow
      // 142: iload 1
      // 143: aload 11
      // 145: invokevirtual dj1.gl0 ()I
      // 148: isub
      // 149: istore 12
      // 14b: iload 12
      // 14d: iload 2
      // 14e: ifeq 177
      // 151: sipush 200
      // 154: if_icmplt 175
      // 157: goto 15e
      // 15a: invokestatic sxg.a (Loov;)Loov;
      // 15d: athrow
      // 15e: iload 4
      // 160: iload 2
      // 161: ifeq 177
      // 164: goto 16b
      // 167: invokestatic sxg.a (Loov;)Loov;
      // 16a: athrow
      // 16b: ifeq 261
      // 16e: goto 175
      // 171: invokestatic sxg.a (Loov;)Loov;
      // 174: athrow
      // 175: iload 12
      // 177: i2d
      // 178: ldc2_w 200.0
      // 17b: ddiv
      // 17c: dstore 13
      // 17e: dconst_1
      // 17f: dload 13
      // 181: dsub
      // 182: dstore 13
      // 184: dload 13
      // 186: ldc2_w 10.0
      // 189: dmul
      // 18a: dstore 13
      // 18c: dload 13
      // 18e: dconst_0
      // 18f: dconst_1
      // 190: invokestatic fe6.lft (DDD)D
      // 193: dstore 13
      // 195: dload 13
      // 197: dload 13
      // 199: dmul
      // 19a: dstore 13
      // 19c: ldc2_w 255.0
      // 19f: dload 13
      // 1a1: dmul
      // 1a2: d2i
      // 1a3: istore 15
      // 1a5: iload 4
      // 1a7: iload 2
      // 1a8: ifeq 1d3
      // 1ab: ifeq 1ba
      // 1ae: goto 1b5
      // 1b1: invokestatic sxg.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: sipush 255
      // 1b8: istore 15
      // 1ba: iload 15
      // 1bc: i2f
      // 1bd: fload 7
      // 1bf: fmul
      // 1c0: f2i
      // 1c1: istore 15
      // 1c3: iinc 5 1
      // 1c6: iload 2
      // 1c7: ifeq 264
      // 1ca: iload 15
      // 1cc: goto 1d3
      // 1cf: invokestatic sxg.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: bipush 3
      // 1d4: if_icmple 261
      // 1d7: bipush 0
      // 1d8: istore 16
      // 1da: iload 10
      // 1dc: ineg
      // 1dd: bipush 9
      // 1df: imul
      // 1e0: istore 17
      // 1e2: getstatic zwr.ivp Lcn7;
      // 1e5: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 1e8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1eb: iload 2
      // 1ec: ifeq 1fb
      // 1ef: ifne 217
      // 1f2: goto 1f9
      // 1f5: invokestatic sxg.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: iload 16
      // 1fb: i2f
      // 1fc: iload 17
      // 1fe: bipush 9
      // 200: isub
      // 201: i2f
      // 202: iload 16
      // 204: iload 9
      // 206: iadd
      // 207: bipush 4
      // 208: iadd
      // 209: i2f
      // 20a: iload 17
      // 20c: i2f
      // 20d: iload 15
      // 20f: bipush 2
      // 210: idiv
      // 211: bipush 24
      // 213: ishl
      // 214: invokestatic sxg.df9 (FFFFI)V
      // 217: aload 11
      // 219: invokevirtual dj1.hmd ()Lekw;
      // 21c: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 221: astore 18
      // 223: new s60
      // 226: dup
      // 227: aload 18
      // 229: invokespecial s60.<init> (Ljava/lang/String;)V
      // 22c: astore 19
      // 22e: aload 19
      // 230: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 233: pop
      // 234: aload 19
      // 236: getfield s60.jcg Ljava/lang/String;
      // 239: astore 18
      // 23b: invokestatic hzu.spd ()V
      // 23e: getstatic jsr.yk7 Lcyb;
      // 241: aload 18
      // 243: iload 16
      // 245: i2f
      // 246: fconst_1
      // 247: fadd
      // 248: iload 17
      // 24a: bipush 10
      // 24c: isub
      // 24d: i2f
      // 24e: ldc 16777215
      // 250: nop
      // 251: iload 15
      // 253: bipush 24
      // 255: ishl
      // 256: iadd
      // 257: invokevirtual cyb.kkl (Ljava/lang/String;FFI)I
      // 25a: pop
      // 25b: invokestatic hzu.vtj ()V
      // 25e: invokestatic hzu.ux6 ()V
      // 261: iinc 10 1
      // 264: iload 2
      // 265: ifne 0ee
      // 268: iload 4
      // 26a: ifeq 331
      // 26d: getstatic jsr.yk7 Lcyb;
      // 270: getfield cyb.jek F
      // 273: fstore 10
      // 275: ldc -3.0
      // 277: nop
      // 278: fconst_0
      // 279: fconst_0
      // 27a: invokestatic hzu.a4k (FFF)V
      // 27d: iload 6
      // 27f: i2f
      // 280: fload 10
      // 282: fmul
      // 283: iload 6
      // 285: i2f
      // 286: fadd
      // 287: fstore 11
      // 289: iload 5
      // 28b: i2f
      // 28c: fload 10
      // 28e: fmul
      // 28f: iload 5
      // 291: i2f
      // 292: fadd
      // 293: fstore 12
      // 295: aload 0
      // 296: getfield sxg.mtm I
      // 299: i2f
      // 29a: fload 12
      // 29c: fmul
      // 29d: iload 6
      // 29f: i2f
      // 2a0: fdiv
      // 2a1: fstore 13
      // 2a3: fload 12
      // 2a5: fload 12
      // 2a7: fmul
      // 2a8: fload 11
      // 2aa: fdiv
      // 2ab: fstore 14
      // 2ad: fload 11
      // 2af: fload 12
      // 2b1: fcmpl
      // 2b2: iload 2
      // 2b3: ifeq 2cb
      // 2b6: ifeq 331
      // 2b9: goto 2c0
      // 2bc: invokestatic sxg.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: fload 13
      // 2c2: fconst_0
      // 2c3: fcmpl
      // 2c4: goto 2cb
      // 2c7: invokestatic sxg.a (Loov;)Loov;
      // 2ca: athrow
      // 2cb: iload 2
      // 2cc: ifeq 2dc
      // 2cf: ifle 2df
      // 2d2: goto 2d9
      // 2d5: invokestatic sxg.a (Loov;)Loov;
      // 2d8: athrow
      // 2d9: sipush 170
      // 2dc: goto 2e1
      // 2df: bipush 96
      // 2e1: istore 15
      // 2e3: aload 0
      // 2e4: getfield sxg.kgp Z
      // 2e7: iload 2
      // 2e8: ifeq 301
      // 2eb: ifeq 2ff
      // 2ee: goto 2f5
      // 2f1: invokestatic sxg.a (Loov;)Loov;
      // 2f4: athrow
      // 2f5: ldc 13382451
      // 2f7: nop
      // 2f8: goto 302
      // 2fb: invokestatic sxg.a (Loov;)Loov;
      // 2fe: athrow
      // 2ff: ldc 3355562
      // 301: nop
      // 302: istore 16
      // 304: fconst_0
      // 305: fload 13
      // 307: fneg
      // 308: fconst_2
      // 309: fload 13
      // 30b: fneg
      // 30c: fload 14
      // 30e: fsub
      // 30f: iload 16
      // 311: iload 15
      // 313: bipush 24
      // 315: ishl
      // 316: iadd
      // 317: invokestatic sxg.df9 (FFFFI)V
      // 31a: fconst_2
      // 31b: fload 13
      // 31d: fneg
      // 31e: fconst_1
      // 31f: fload 13
      // 321: fneg
      // 322: fload 14
      // 324: fsub
      // 325: ldc 13421772
      // 327: nop
      // 328: iload 15
      // 32a: bipush 24
      // 32c: ishl
      // 32d: iadd
      // 32e: invokestatic sxg.df9 (FFFFI)V
      // 331: invokestatic hzu.x3w ()V
      // 334: return
   }

   public void hgk(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 027
      // 009: getfield sxg.ogb Lc05;
      // 00c: getfield c05.oxn Lmoh;
      // 00f: getfield moh.v13 Lha9$c4q;
      // 012: getstatic ha9$c4q.ulg Lha9$c4q;
      // 015: if_acmpeq 491
      // 018: goto 01f
      // 01b: invokestatic sxg.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: goto 027
      // 023: invokestatic sxg.a (Loov;)Loov;
      // 026: athrow
      // 027: invokevirtual sxg.gij ()I
      // 02a: bipush 1
      // 02b: iadd
      // 02c: istore 3
      // 02d: bipush 0
      // 02e: istore 4
      // 030: bipush 0
      // 031: istore 5
      // 033: aload 0
      // 034: getfield sxg.rcp Ljava/util/List;
      // 037: invokeinterface java/util/List.size ()I 1
      // 03c: istore 6
      // 03e: aload 0
      // 03f: getfield sxg.ogb Lc05;
      // 042: getfield c05.oxn Lmoh;
      // 045: getfield moh.z4g F
      // 048: ldc 0.9
      // 04a: nop
      // 04b: fmul
      // 04c: ldc 0.1
      // 04e: nop
      // 04f: fadd
      // 050: fstore 7
      // 052: iload 6
      // 054: iload 2
      // 055: ifeq 078
      // 058: ifle 491
      // 05b: goto 062
      // 05e: invokestatic sxg.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: iload 2
      // 064: ifeq 07f
      // 067: goto 06e
      // 06a: invokestatic sxg.a (Loov;)Loov;
      // 06d: athrow
      // 06e: invokevirtual sxg.b5_ ()Z
      // 071: goto 078
      // 074: invokestatic sxg.a (Loov;)Loov;
      // 077: athrow
      // 078: ifeq 07e
      // 07b: bipush 1
      // 07c: istore 4
      // 07e: aload 0
      // 07f: invokevirtual sxg.in4 ()F
      // 082: fstore 8
      // 084: aload 0
      // 085: invokevirtual sxg.x7a ()I
      // 088: i2f
      // 089: fload 8
      // 08b: fdiv
      // 08c: invokestatic fe6.v1i (F)I
      // 08f: istore 9
      // 091: invokestatic hzu.dp2 ()V
      // 094: fconst_2
      // 095: ldc 20.0
      // 097: nop
      // 098: fconst_0
      // 099: invokestatic hzu.a4k (FFF)V
      // 09c: fload 8
      // 09e: fload 8
      // 0a0: fconst_1
      // 0a1: invokestatic hzu.syc (FFF)V
      // 0a4: bipush 0
      // 0a5: istore 10
      // 0a7: iload 10
      // 0a9: aload 0
      // 0aa: getfield sxg.mtm I
      // 0ad: iadd
      // 0ae: aload 0
      // 0af: getfield sxg.rcp Ljava/util/List;
      // 0b2: invokeinterface java/util/List.size ()I 1
      // 0b7: if_icmpge 3c5
      // 0ba: iload 10
      // 0bc: iload 2
      // 0bd: ifeq 3c7
      // 0c0: iload 2
      // 0c1: ifeq 3c7
      // 0c4: goto 0cb
      // 0c7: invokestatic sxg.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: iload 3
      // 0cc: if_icmpge 3c5
      // 0cf: goto 0d6
      // 0d2: invokestatic sxg.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield sxg.rcp Ljava/util/List;
      // 0da: iload 10
      // 0dc: aload 0
      // 0dd: getfield sxg.mtm I
      // 0e0: iadd
      // 0e1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e6: checkcast dj1
      // 0e9: astore 11
      // 0eb: iload 2
      // 0ec: ifeq 3c1
      // 0ef: aload 11
      // 0f1: ifnull 3be
      // 0f4: goto 0fb
      // 0f7: invokestatic sxg.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: iload 1
      // 0fc: aload 11
      // 0fe: invokevirtual dj1.gl0 ()I
      // 101: isub
      // 102: istore 12
      // 104: iload 4
      // 106: iload 2
      // 107: ifeq 12f
      // 10a: ifeq 12d
      // 10d: goto 114
      // 110: invokestatic sxg.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 11
      // 116: getfield dj1.t05 Llva;
      // 119: fconst_1
      // 11a: invokevirtual lva.lna (F)V
      // 11d: aload 11
      // 11f: getfield dj1.e71 Llva;
      // 122: fconst_1
      // 123: invokevirtual lva.lna (F)V
      // 126: goto 12d
      // 129: invokestatic sxg.a (Loov;)Loov;
      // 12c: athrow
      // 12d: iload 12
      // 12f: sipush 200
      // 132: iload 2
      // 133: ifeq 175
      // 136: if_icmpge 165
      // 139: goto 140
      // 13c: invokestatic sxg.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 11
      // 142: getfield dj1.t05 Llva;
      // 145: bipush 1
      // 146: invokevirtual lva.ry0 (Z)Z
      // 149: pop
      // 14a: aload 11
      // 14c: getfield dj1.e71 Llva;
      // 14f: bipush 1
      // 150: invokevirtual lva.ry0 (Z)Z
      // 153: pop
      // 154: aload 11
      // 156: getfield dj1.az4 Llva;
      // 159: bipush 1
      // 15a: invokevirtual lva.ry0 (Z)Z
      // 15d: pop
      // 15e: goto 165
      // 161: invokestatic sxg.a (Loov;)Loov;
      // 164: athrow
      // 165: iload 12
      // 167: iload 2
      // 168: ifeq 191
      // 16b: sipush 200
      // 16e: goto 175
      // 171: invokestatic sxg.a (Loov;)Loov;
      // 174: athrow
      // 175: if_icmplt 18f
      // 178: iload 4
      // 17a: iload 2
      // 17b: ifeq 191
      // 17e: goto 185
      // 181: invokestatic sxg.a (Loov;)Loov;
      // 184: athrow
      // 185: ifeq 3be
      // 188: goto 18f
      // 18b: invokestatic sxg.a (Loov;)Loov;
      // 18e: athrow
      // 18f: iload 12
      // 191: i2d
      // 192: ldc2_w 200.0
      // 195: ddiv
      // 196: dstore 13
      // 198: dconst_1
      // 199: dload 13
      // 19b: dsub
      // 19c: dstore 13
      // 19e: dload 13
      // 1a0: ldc2_w 10.0
      // 1a3: dmul
      // 1a4: dstore 13
      // 1a6: dload 13
      // 1a8: dconst_0
      // 1a9: dconst_1
      // 1aa: invokestatic fe6.lft (DDD)D
      // 1ad: dstore 13
      // 1af: dload 13
      // 1b1: dload 13
      // 1b3: dmul
      // 1b4: dstore 13
      // 1b6: ldc2_w 255.0
      // 1b9: dload 13
      // 1bb: dmul
      // 1bc: d2i
      // 1bd: istore 15
      // 1bf: iload 4
      // 1c1: iload 2
      // 1c2: ifeq 1ed
      // 1c5: ifeq 1d4
      // 1c8: goto 1cf
      // 1cb: invokestatic sxg.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: sipush 255
      // 1d2: istore 15
      // 1d4: iload 15
      // 1d6: i2f
      // 1d7: fload 7
      // 1d9: fmul
      // 1da: f2i
      // 1db: istore 15
      // 1dd: iinc 5 1
      // 1e0: iload 2
      // 1e1: ifeq 3c1
      // 1e4: iload 15
      // 1e6: goto 1ed
      // 1e9: invokestatic sxg.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: bipush 3
      // 1ee: if_icmple 3be
      // 1f1: bipush 0
      // 1f2: istore 16
      // 1f4: iload 10
      // 1f6: ineg
      // 1f7: bipush 9
      // 1f9: imul
      // 1fa: istore 17
      // 1fc: getstatic zwr.ivp Lcn7;
      // 1ff: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 202: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 205: iload 2
      // 206: ifeq 215
      // 209: ifne 29a
      // 20c: goto 213
      // 20f: invokestatic sxg.a (Loov;)Loov;
      // 212: athrow
      // 213: iload 16
      // 215: i2f
      // 216: iload 4
      // 218: ifeq 223
      // 21b: fconst_1
      // 21c: goto 22b
      // 21f: invokestatic sxg.a (Loov;)Loov;
      // 222: athrow
      // 223: aload 11
      // 225: getfield dj1.t05 Llva;
      // 228: invokevirtual lva.o7r ()F
      // 22b: fsub
      // 22c: iload 17
      // 22e: bipush 9
      // 230: isub
      // 231: i2f
      // 232: iload 4
      // 234: ifeq 23f
      // 237: fconst_1
      // 238: goto 247
      // 23b: invokestatic sxg.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 11
      // 241: getfield dj1.az4 Llva;
      // 244: invokevirtual lva.o7r ()F
      // 247: fsub
      // 248: iload 16
      // 24a: iload 9
      // 24c: iadd
      // 24d: bipush 4
      // 24e: iadd
      // 24f: i2f
      // 250: iload 4
      // 252: ifeq 25d
      // 255: fconst_1
      // 256: goto 265
      // 259: invokestatic sxg.a (Loov;)Loov;
      // 25c: athrow
      // 25d: aload 11
      // 25f: getfield dj1.t05 Llva;
      // 262: invokevirtual lva.o7r ()F
      // 265: fsub
      // 266: iload 17
      // 268: i2f
      // 269: iload 4
      // 26b: ifeq 276
      // 26e: fconst_1
      // 26f: goto 27e
      // 272: invokestatic sxg.a (Loov;)Loov;
      // 275: athrow
      // 276: aload 11
      // 278: getfield dj1.az4 Llva;
      // 27b: invokevirtual lva.o7r ()F
      // 27e: fsub
      // 27f: bipush 0
      // 280: aload 11
      // 282: getfield dj1.e71 Llva;
      // 285: invokevirtual lva.o7r ()F
      // 288: fconst_2
      // 289: fdiv
      // 28a: ldc 0.1
      // 28c: nop
      // 28d: invokestatic java/lang/Math.max (FF)F
      // 290: ldc 0.1
      // 292: nop
      // 293: fsub
      // 294: invokestatic hhf.kjo (IF)I
      // 297: invokestatic sxg.df9 (FFFFI)V
      // 29a: aload 11
      // 29c: invokevirtual dj1.hmd ()Lekw;
      // 29f: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 2a4: astore 18
      // 2a6: new s60
      // 2a9: dup
      // 2aa: aload 18
      // 2ac: invokespecial s60.<init> (Ljava/lang/String;)V
      // 2af: astore 19
      // 2b1: aload 19
      // 2b3: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 2b6: pop
      // 2b7: aload 19
      // 2b9: getfield s60.jcg Ljava/lang/String;
      // 2bc: astore 18
      // 2be: iload 12
      // 2c0: bipush 1
      // 2c1: iload 2
      // 2c2: ifeq 2fa
      // 2c5: if_icmpne 2f5
      // 2c8: goto 2cf
      // 2cb: invokestatic sxg.a (Loov;)Loov;
      // 2ce: athrow
      // 2cf: aload 11
      // 2d1: getfield dj1.t05 Llva;
      // 2d4: getstatic jsr.yk7 Lcyb;
      // 2d7: aload 18
      // 2d9: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 2dc: ldc 3.0
      // 2de: nop
      // 2df: fadd
      // 2e0: invokevirtual lva.lna (F)V
      // 2e3: aload 11
      // 2e5: getfield dj1.az4 Llva;
      // 2e8: ldc -10.0
      // 2ea: nop
      // 2eb: invokevirtual lva.lna (F)V
      // 2ee: goto 2f5
      // 2f1: invokestatic sxg.a (Loov;)Loov;
      // 2f4: athrow
      // 2f5: iload 12
      // 2f7: sipush 190
      // 2fa: iload 2
      // 2fb: ifeq 315
      // 2fe: if_icmpgt 318
      // 301: goto 308
      // 304: invokestatic sxg.a (Loov;)Loov;
      // 307: athrow
      // 308: iload 10
      // 30a: aload 0
      // 30b: invokevirtual sxg.gij ()I
      // 30e: goto 315
      // 311: invokestatic sxg.a (Loov;)Loov;
      // 314: athrow
      // 315: if_icmpne 340
      // 318: aload 11
      // 31a: getfield dj1.t05 Llva;
      // 31d: getstatic jsr.yk7 Lcyb;
      // 320: aload 18
      // 322: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 325: ldc 3.0
      // 327: nop
      // 328: fadd
      // 329: invokevirtual lva.vej (F)V
      // 32c: aload 11
      // 32e: getfield dj1.e71 Llva;
      // 331: fconst_0
      // 332: invokevirtual lva.vej (F)V
      // 335: iload 2
      // 336: ifne 359
      // 339: goto 340
      // 33c: invokestatic sxg.a (Loov;)Loov;
      // 33f: athrow
      // 340: aload 11
      // 342: getfield dj1.t05 Llva;
      // 345: fconst_0
      // 346: invokevirtual lva.vej (F)V
      // 349: aload 11
      // 34b: getfield dj1.az4 Llva;
      // 34e: fconst_0
      // 34f: invokevirtual lva.vej (F)V
      // 352: goto 359
      // 355: invokestatic sxg.a (Loov;)Loov;
      // 358: athrow
      // 359: invokestatic hzu.spd ()V
      // 35c: iload 16
      // 35e: bipush 1
      // 35f: iadd
      // 360: i2f
      // 361: iload 4
      // 363: ifeq 36e
      // 366: fconst_1
      // 367: goto 376
      // 36a: invokestatic sxg.a (Loov;)Loov;
      // 36d: athrow
      // 36e: aload 11
      // 370: getfield dj1.t05 Llva;
      // 373: invokevirtual lva.o7r ()F
      // 376: fsub
      // 377: fstore 20
      // 379: iload 17
      // 37b: bipush 10
      // 37d: isub
      // 37e: i2f
      // 37f: iload 4
      // 381: ifeq 38c
      // 384: fconst_1
      // 385: goto 394
      // 388: invokestatic sxg.a (Loov;)Loov;
      // 38b: athrow
      // 38c: aload 11
      // 38e: getfield dj1.az4 Llva;
      // 391: invokevirtual lva.o7r ()F
      // 394: fsub
      // 395: fstore 21
      // 397: getstatic jsr.yk7 Lcyb;
      // 39a: aload 18
      // 39c: fload 20
      // 39e: fload 21
      // 3a0: ldc 16777215
      // 3a2: nop
      // 3a3: iload 15
      // 3a5: bipush 24
      // 3a7: ishl
      // 3a8: iadd
      // 3a9: aload 11
      // 3ab: getfield dj1.e71 Llva;
      // 3ae: invokevirtual lva.o7r ()F
      // 3b1: invokestatic hhf.kjo (IF)I
      // 3b4: invokevirtual cyb.unm (Ljava/lang/String;FFI)I
      // 3b7: pop
      // 3b8: invokestatic hzu.vtj ()V
      // 3bb: invokestatic hzu.ux6 ()V
      // 3be: iinc 10 1
      // 3c1: iload 2
      // 3c2: ifne 0a7
      // 3c5: iload 4
      // 3c7: ifeq 48e
      // 3ca: getstatic jsr.yk7 Lcyb;
      // 3cd: getfield cyb.jek F
      // 3d0: fstore 10
      // 3d2: ldc -3.0
      // 3d4: nop
      // 3d5: fconst_0
      // 3d6: fconst_0
      // 3d7: invokestatic hzu.a4k (FFF)V
      // 3da: iload 6
      // 3dc: i2f
      // 3dd: fload 10
      // 3df: fmul
      // 3e0: iload 6
      // 3e2: i2f
      // 3e3: fadd
      // 3e4: fstore 11
      // 3e6: iload 5
      // 3e8: i2f
      // 3e9: fload 10
      // 3eb: fmul
      // 3ec: iload 5
      // 3ee: i2f
      // 3ef: fadd
      // 3f0: fstore 12
      // 3f2: aload 0
      // 3f3: getfield sxg.mtm I
      // 3f6: i2f
      // 3f7: fload 12
      // 3f9: fmul
      // 3fa: iload 6
      // 3fc: i2f
      // 3fd: fdiv
      // 3fe: fstore 13
      // 400: fload 12
      // 402: fload 12
      // 404: fmul
      // 405: fload 11
      // 407: fdiv
      // 408: fstore 14
      // 40a: fload 11
      // 40c: fload 12
      // 40e: fcmpl
      // 40f: iload 2
      // 410: ifeq 428
      // 413: ifeq 48e
      // 416: goto 41d
      // 419: invokestatic sxg.a (Loov;)Loov;
      // 41c: athrow
      // 41d: fload 13
      // 41f: fconst_0
      // 420: fcmpl
      // 421: goto 428
      // 424: invokestatic sxg.a (Loov;)Loov;
      // 427: athrow
      // 428: iload 2
      // 429: ifeq 439
      // 42c: ifle 43c
      // 42f: goto 436
      // 432: invokestatic sxg.a (Loov;)Loov;
      // 435: athrow
      // 436: sipush 170
      // 439: goto 43e
      // 43c: bipush 96
      // 43e: istore 15
      // 440: aload 0
      // 441: getfield sxg.kgp Z
      // 444: iload 2
      // 445: ifeq 45e
      // 448: ifeq 45c
      // 44b: goto 452
      // 44e: invokestatic sxg.a (Loov;)Loov;
      // 451: athrow
      // 452: ldc 13382451
      // 454: nop
      // 455: goto 45f
      // 458: invokestatic sxg.a (Loov;)Loov;
      // 45b: athrow
      // 45c: ldc 3355562
      // 45e: nop
      // 45f: istore 16
      // 461: fconst_0
      // 462: fload 13
      // 464: fneg
      // 465: fconst_2
      // 466: fload 13
      // 468: fneg
      // 469: fload 14
      // 46b: fsub
      // 46c: iload 16
      // 46e: iload 15
      // 470: bipush 24
      // 472: ishl
      // 473: iadd
      // 474: invokestatic sxg.df9 (FFFFI)V
      // 477: fconst_2
      // 478: fload 13
      // 47a: fneg
      // 47b: fconst_1
      // 47c: fload 13
      // 47e: fneg
      // 47f: fload 14
      // 481: fsub
      // 482: ldc 13421772
      // 484: nop
      // 485: iload 15
      // 487: bipush 24
      // 489: ishl
      // 48a: iadd
      // 48b: invokestatic sxg.df9 (FFFFI)V
      // 48e: invokestatic hzu.x3w ()V
      // 491: return
   }

   public static void df9(float var0, float var1, float var2, float var3, int var4) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glPushMatrix();
      hhf.rs_(var4);
      GL11.glBegin(7);
      GL11.glVertex2d((double)var2, (double)var1);
      GL11.glVertex2d((double)var0, (double)var1);
      GL11.glVertex2d((double)var0, (double)var3);
      GL11.glVertex2d((double)var2, (double)var3);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glPopMatrix();
   }

   public void sk7() {
      this.rcp.clear();
      this.ng2.clear();
      this.cqo.clear();
   }

   public void obg(ekw var1) {
      this.xkx(var1, 0);
   }

   public void xkx(ekw var1, int var2) {
      long var3 = a ^ 17953417396113L;
      this.lca(var1, var2, this.ogb.t43._ti(), false);
      nk1.info(b + var1.rnh());
   }

   private void lca(ekw param1, int param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: iload 2
      // 006: iload 5
      // 008: ifne 02e
      // 00b: ifeq 021
      // 00e: goto 015
      // 011: invokestatic sxg.a (Loov;)Loov;
      // 014: athrow
      // 015: aload 0
      // 016: iload 2
      // 017: invokevirtual sxg.teh (I)V
      // 01a: goto 021
      // 01d: invokestatic sxg.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: invokevirtual sxg.x7a ()I
      // 025: i2f
      // 026: aload 0
      // 027: invokevirtual sxg.in4 ()F
      // 02a: fdiv
      // 02b: invokestatic fe6.tpk (F)I
      // 02e: istore 6
      // 030: aload 1
      // 031: iload 6
      // 033: aload 0
      // 034: getfield sxg.ogb Lc05;
      // 037: getfield c05.tx1 Lowt;
      // 03a: bipush 0
      // 03b: bipush 0
      // 03c: invokestatic p_i.vtz (Lekw;ILowt;ZZ)Ljava/util/List;
      // 03f: astore 7
      // 041: aload 0
      // 042: invokevirtual sxg.b5_ ()Z
      // 045: istore 8
      // 047: aload 7
      // 049: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 04e: astore 9
      // 050: aload 9
      // 052: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 057: ifeq 0c8
      // 05a: aload 9
      // 05c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 061: checkcast ekw
      // 064: astore 10
      // 066: iload 5
      // 068: ifne 0c3
      // 06b: iload 8
      // 06d: iload 5
      // 06f: ifne 0d1
      // 072: goto 079
      // 075: invokestatic sxg.a (Loov;)Loov;
      // 078: athrow
      // 079: ifeq 0ae
      // 07c: goto 083
      // 07f: invokestatic sxg.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: iload 5
      // 086: ifne 0af
      // 089: goto 090
      // 08c: invokestatic sxg.a (Loov;)Loov;
      // 08f: athrow
      // 090: getfield sxg.mtm I
      // 093: ifle 0ae
      // 096: goto 09d
      // 099: invokestatic sxg.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: bipush 1
      // 09f: putfield sxg.kgp Z
      // 0a2: aload 0
      // 0a3: bipush 1
      // 0a4: invokevirtual sxg.bmo (I)V
      // 0a7: goto 0ae
      // 0aa: invokestatic sxg.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield sxg.rcp Ljava/util/List;
      // 0b2: bipush 0
      // 0b3: new dj1
      // 0b6: dup
      // 0b7: iload 3
      // 0b8: aload 10
      // 0ba: iload 2
      // 0bb: invokespecial dj1.<init> (ILekw;I)V
      // 0be: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 0c3: iload 5
      // 0c5: ifeq 050
      // 0c8: aload 0
      // 0c9: getfield sxg.rcp Ljava/util/List;
      // 0cc: invokeinterface java/util/List.size ()I 1
      // 0d1: bipush 100
      // 0d3: if_icmple 103
      // 0d6: aload 0
      // 0d7: getfield sxg.rcp Ljava/util/List;
      // 0da: aload 0
      // 0db: getfield sxg.rcp Ljava/util/List;
      // 0de: invokeinterface java/util/List.size ()I 1
      // 0e3: bipush 1
      // 0e4: isub
      // 0e5: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0ea: pop
      // 0eb: iload 5
      // 0ed: ifne 14b
      // 0f0: goto 0f7
      // 0f3: invokestatic sxg.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: iload 5
      // 0f9: ifeq 0c8
      // 0fc: goto 103
      // 0ff: invokestatic sxg.a (Loov;)Loov;
      // 102: athrow
      // 103: iload 4
      // 105: ifne 14b
      // 108: aload 0
      // 109: getfield sxg.ng2 Ljava/util/List;
      // 10c: bipush 0
      // 10d: new dj1
      // 110: dup
      // 111: iload 3
      // 112: aload 1
      // 113: iload 2
      // 114: invokespecial dj1.<init> (ILekw;I)V
      // 117: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 11c: goto 123
      // 11f: invokestatic sxg.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 0
      // 124: getfield sxg.ng2 Ljava/util/List;
      // 127: invokeinterface java/util/List.size ()I 1
      // 12c: bipush 100
      // 12e: if_icmple 14b
      // 131: aload 0
      // 132: getfield sxg.ng2 Ljava/util/List;
      // 135: aload 0
      // 136: getfield sxg.ng2 Ljava/util/List;
      // 139: invokeinterface java/util/List.size ()I 1
      // 13e: bipush 1
      // 13f: isub
      // 140: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 145: pop
      // 146: iload 5
      // 148: ifeq 123
      // 14b: return
   }

   public void zrl() {
      this.rcp.clear();
      int var10000 = t9d.b();
      this.f7w();
      int var2 = this.ng2.size() - 1;
      int var1 = var10000;

      while (var2 >= 0) {
         dj1 var3 = (dj1)this.ng2.get(var2);
         this.lca(var3.hmd(), var3.ye1(), var3.gl0(), true);
         var2--;
         if (var1 == 0) {
            break;
         }
      }
   }

   public List nt9() {
      return this.cqo;
   }

   public void k3x(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield sxg.cqo Ljava/util/List;
      // 08: invokeinterface java/util/List.isEmpty ()Z 1
      // 0d: iload 2
      // 0e: ifeq 5c
      // 11: ifne 4b
      // 14: goto 1b
      // 17: invokestatic sxg.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield sxg.cqo Ljava/util/List;
      // 1f: aload 0
      // 20: getfield sxg.cqo Ljava/util/List;
      // 23: invokeinterface java/util/List.size ()I 1
      // 28: bipush 1
      // 29: isub
      // 2a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2f: checkcast java/lang/String
      // 32: aload 1
      // 33: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 36: iload 2
      // 37: ifeq 5c
      // 3a: goto 41
      // 3d: invokestatic sxg.a (Loov;)Loov;
      // 40: athrow
      // 41: ifne 5d
      // 44: goto 4b
      // 47: invokestatic sxg.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield sxg.cqo Ljava/util/List;
      // 4f: aload 1
      // 50: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 55: goto 5c
      // 58: invokestatic sxg.a (Loov;)Loov;
      // 5b: athrow
      // 5c: pop
      // 5d: return
   }

   public void f7w() {
      this.mtm = 0;
      this.kgp = false;
   }

   public void bmo(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield sxg.mtm I
      // 05: iload 1
      // 06: iadd
      // 07: putfield sxg.mtm I
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: getfield sxg.rcp Ljava/util/List;
      // 11: invokeinterface java/util/List.size ()I 1
      // 16: istore 3
      // 17: istore 2
      // 18: aload 0
      // 19: getfield sxg.mtm I
      // 1c: iload 2
      // 1d: ifeq 50
      // 20: iload 3
      // 21: aload 0
      // 22: invokevirtual sxg.gij ()I
      // 25: isub
      // 26: if_icmple 41
      // 29: goto 30
      // 2c: invokestatic sxg.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: iload 3
      // 32: aload 0
      // 33: invokevirtual sxg.gij ()I
      // 36: isub
      // 37: putfield sxg.mtm I
      // 3a: goto 41
      // 3d: invokestatic sxg.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: iload 2
      // 43: ifeq 60
      // 46: getfield sxg.mtm I
      // 49: goto 50
      // 4c: invokestatic sxg.a (Loov;)Loov;
      // 4f: athrow
      // 50: ifgt 64
      // 53: aload 0
      // 54: bipush 0
      // 55: putfield sxg.mtm I
      // 58: aload 0
      // 59: goto 60
      // 5c: invokestatic sxg.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush 0
      // 61: putfield sxg.kgp Z
      // 64: return
   }

   public ekw r7v(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: invokevirtual sxg.b5_ ()Z
      // 008: ifne 011
      // 00b: aconst_null
      // 00c: areturn
      // 00d: invokestatic sxg.a (Loov;)Loov;
      // 010: athrow
      // 011: new eka
      // 014: dup
      // 015: aload 0
      // 016: getfield sxg.ogb Lc05;
      // 019: invokespecial eka.<init> (Lc05;)V
      // 01c: astore 4
      // 01e: aload 4
      // 020: invokevirtual eka._0s ()I
      // 023: istore 5
      // 025: aload 0
      // 026: invokevirtual sxg.in4 ()F
      // 029: fstore 6
      // 02b: iload 1
      // 02c: iload 5
      // 02e: idiv
      // 02f: bipush 3
      // 030: isub
      // 031: istore 7
      // 033: iload 2
      // 034: iload 5
      // 036: idiv
      // 037: bipush 29
      // 039: isub
      // 03a: istore 8
      // 03c: iload 7
      // 03e: i2f
      // 03f: fload 6
      // 041: fdiv
      // 042: invokestatic fe6.tpk (F)I
      // 045: istore 7
      // 047: iload 8
      // 049: i2f
      // 04a: fload 6
      // 04c: fdiv
      // 04d: invokestatic fe6.tpk (F)I
      // 050: istore 8
      // 052: iload 7
      // 054: iload 3
      // 055: ifeq 064
      // 058: iflt 18c
      // 05b: goto 062
      // 05e: invokestatic sxg.a (Loov;)Loov;
      // 061: athrow
      // 062: iload 8
      // 064: iload 3
      // 065: ifeq 089
      // 068: iflt 18c
      // 06b: goto 072
      // 06e: invokestatic sxg.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: invokevirtual sxg.gij ()I
      // 076: aload 0
      // 077: getfield sxg.rcp Ljava/util/List;
      // 07a: invokeinterface java/util/List.size ()I 1
      // 07f: invokestatic java/lang/Math.min (II)I
      // 082: goto 089
      // 085: invokestatic sxg.a (Loov;)Loov;
      // 088: athrow
      // 089: istore 9
      // 08b: iload 7
      // 08d: aload 0
      // 08e: invokevirtual sxg.x7a ()I
      // 091: i2f
      // 092: aload 0
      // 093: invokevirtual sxg.in4 ()F
      // 096: fdiv
      // 097: invokestatic fe6.tpk (F)I
      // 09a: iload 3
      // 09b: ifeq 0c1
      // 09e: if_icmpgt 18a
      // 0a1: goto 0a8
      // 0a4: invokestatic sxg.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: iload 8
      // 0aa: aload 0
      // 0ab: getfield sxg.ogb Lc05;
      // 0ae: getfield c05.tx1 Lowt;
      // 0b1: getfield owt.rr7 I
      // 0b4: iload 9
      // 0b6: imul
      // 0b7: iload 9
      // 0b9: iadd
      // 0ba: goto 0c1
      // 0bd: invokestatic sxg.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iload 3
      // 0c2: ifeq 0e7
      // 0c5: if_icmpge 18a
      // 0c8: goto 0cf
      // 0cb: invokestatic sxg.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 8
      // 0d1: aload 0
      // 0d2: getfield sxg.ogb Lc05;
      // 0d5: getfield c05.tx1 Lowt;
      // 0d8: getfield owt.rr7 I
      // 0db: idiv
      // 0dc: aload 0
      // 0dd: getfield sxg.mtm I
      // 0e0: goto 0e7
      // 0e3: invokestatic sxg.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iadd
      // 0e8: i2f
      // 0e9: fstore 10
      // 0eb: fload 10
      // 0ed: fconst_0
      // 0ee: fcmpl
      // 0ef: iload 3
      // 0f0: ifeq 111
      // 0f3: iflt 188
      // 0f6: goto 0fd
      // 0f9: invokestatic sxg.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: fload 10
      // 0ff: aload 0
      // 100: getfield sxg.rcp Ljava/util/List;
      // 103: invokeinterface java/util/List.size ()I 1
      // 108: i2f
      // 109: fcmpg
      // 10a: goto 111
      // 10d: invokestatic sxg.a (Loov;)Loov;
      // 110: athrow
      // 111: ifge 188
      // 114: aload 0
      // 115: getfield sxg.rcp Ljava/util/List;
      // 118: fload 10
      // 11a: f2i
      // 11b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 120: checkcast dj1
      // 123: astore 11
      // 125: bipush 0
      // 126: istore 12
      // 128: aload 11
      // 12a: invokevirtual dj1.hmd ()Lekw;
      // 12d: invokeinterface ekw.iterator ()Ljava/util/Iterator; 1
      // 132: astore 13
      // 134: aload 13
      // 136: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13b: ifeq 188
      // 13e: aload 13
      // 140: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 145: checkcast ekw
      // 148: astore 14
      // 14a: aload 14
      // 14c: instanceof tao
      // 14f: iload 3
      // 150: ifeq 178
      // 153: ifeq 184
      // 156: goto 15d
      // 159: invokestatic sxg.a (Loov;)Loov;
      // 15c: athrow
      // 15d: iload 12
      // 15f: i2f
      // 160: getstatic jsr.yk7 Lcyb;
      // 163: aload 14
      // 165: checkcast tao
      // 168: invokevirtual tao.rcd ()Ljava/lang/String;
      // 16b: bipush 0
      // 16c: invokestatic p_i.bty (Ljava/lang/String;Z)Ljava/lang/String;
      // 16f: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 172: fadd
      // 173: f2i
      // 174: istore 12
      // 176: iload 12
      // 178: iload 7
      // 17a: if_icmple 184
      // 17d: aload 14
      // 17f: areturn
      // 180: invokestatic sxg.a (Loov;)Loov;
      // 183: athrow
      // 184: iload 3
      // 185: ifne 134
      // 188: aconst_null
      // 189: areturn
      // 18a: aconst_null
      // 18b: areturn
      // 18c: aconst_null
      // 18d: areturn
   }

   public boolean b5_() {
      return this.ogb.u0y instanceof _ov;
   }

   public void teh(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield sxg.rcp Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 47
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast dj1
      // 20: astore 4
      // 22: aload 4
      // 24: invokevirtual dj1.ye1 ()I
      // 27: iload 1
      // 28: iload 2
      // 29: ifeq 76
      // 2c: if_icmpne 43
      // 2f: goto 36
      // 32: invokestatic sxg.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 3
      // 37: invokeinterface java/util/Iterator.remove ()V 1
      // 3c: goto 43
      // 3f: invokestatic sxg.a (Loov;)Loov;
      // 42: athrow
      // 43: iload 2
      // 44: ifne 0e
      // 47: aload 0
      // 48: getfield sxg.ng2 Ljava/util/List;
      // 4b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 50: astore 3
      // 51: aload 3
      // 52: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 57: ifeq 95
      // 5a: aload 3
      // 5b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 60: checkcast dj1
      // 63: astore 4
      // 65: iload 2
      // 66: ifeq 86
      // 69: aload 4
      // 6b: invokevirtual dj1.ye1 ()I
      // 6e: iload 1
      // 6f: goto 76
      // 72: invokestatic sxg.a (Loov;)Loov;
      // 75: athrow
      // 76: if_icmpne 8a
      // 79: aload 3
      // 7a: invokeinterface java/util/Iterator.remove ()V 1
      // 7f: goto 86
      // 82: invokestatic sxg.a (Loov;)Loov;
      // 85: athrow
      // 86: iload 2
      // 87: ifne 95
      // 8a: iload 2
      // 8b: ifne 51
      // 8e: goto 95
      // 91: invokestatic sxg.a (Loov;)Loov;
      // 94: athrow
      // 95: return
   }

   public int x7a() {
      return g0p(this.ogb.oxn.n_m);
   }

   public int e2c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 28
      // 09: invokevirtual sxg.b5_ ()Z
      // 0c: ifeq 27
      // 0f: goto 16
      // 12: invokestatic sxg.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield sxg.ogb Lc05;
      // 1a: getfield c05.oxn Lmoh;
      // 1d: getfield moh.yvt F
      // 20: goto 31
      // 23: invokestatic sxg.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield sxg.ogb Lc05;
      // 2b: getfield c05.oxn Lmoh;
      // 2e: getfield moh.iah F
      // 31: invokestatic sxg.pab (F)I
      // 34: ireturn
   }

   public float in4() {
      return this.ogb.oxn.rpu;
   }

   public static int g0p(float var0) {
      short var1 = 320;
      byte var2 = 40;
      return fe6.tpk(var0 * (float)(var1 - var2) + (float)var2);
   }

   public static int pab(float var0) {
      short var1 = 180;
      byte var2 = 20;
      return fe6.tpk(var0 * (float)(var1 - var2) + (float)var2);
   }

   public int gij() {
      return this.e2c() / 9;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6687402821565137582L, -8617193338516851141L, MethodHandles.lookup().lookupClass()).a(146610635214149L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 81650212525464L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("$½üÙÒí\u008aa".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      nk1 = LogManager.getLogger();
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
}
