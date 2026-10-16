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

public class wo8 extends liu {
   private static final gdz tj6;
   private final Minecraft iva;
   private final zlz dga;
   private final zlz _5y;
   private y1w fxy;
   private static double qx4;
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public wo8(hr_ var1, y1w var2) {
      long var3 = a ^ 128721237910304L;
      super(var1);
      this.iva = Minecraft.vz1();
      this.dga = new zlz(b<"u">(14130, 5100438795360509022L ^ var3), b<"u">(21883, 2667321453521927701L ^ var3));
      this._5y = new zlz(b<"u">(29046, 8390741672049957401L ^ var3), b<"u">(30579, 715628549088992286L ^ var3));
      this.fxy = var2;
   }

   public void ctw(co7 param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.dp2 ()V
      // 003: aload 1
      // 004: invokevirtual co7.liv ()Lmew;
      // 007: astore 11
      // 009: aload 11
      // 00b: invokevirtual mew.getX ()I
      // 00e: i2d
      // 00f: aload 1
      // 010: getfield co7.o2v D
      // 013: dsub
      // 014: dload 2
      // 015: dadd
      // 016: dstore 12
      // 018: aload 11
      // 01a: invokevirtual mew.getY ()I
      // 01d: i2d
      // 01e: aload 1
      // 01f: getfield co7.kfp D
      // 022: dsub
      // 023: dload 4
      // 025: dadd
      // 026: dstore 14
      // 028: invokestatic OpaquePredicate.c ()I
      // 02b: aload 11
      // 02d: invokevirtual mew.getZ ()I
      // 030: i2d
      // 031: aload 1
      // 032: getfield co7.vbd D
      // 035: dsub
      // 036: dload 6
      // 038: dadd
      // 039: dstore 16
      // 03b: dload 12
      // 03d: ldc2_w 0.5
      // 040: dadd
      // 041: dload 14
      // 043: ldc2_w 0.5
      // 046: dadd
      // 047: dload 16
      // 049: ldc2_w 0.5
      // 04c: dadd
      // 04d: invokestatic hzu.hsv (DDD)V
      // 050: ldc 180.0
      // 052: nop
      // 053: aload 1
      // 054: getfield co7.x5k F
      // 057: fsub
      // 058: fconst_0
      // 059: fconst_1
      // 05a: fconst_0
      // 05b: invokestatic hzu.a2h (FFFF)V
      // 05e: aload 0
      // 05f: getfield wo8.l0g Lhr_;
      // 062: getfield hr_.ewh Llc5;
      // 065: getstatic yu2.nu_ Lgdz;
      // 068: invokevirtual lc5.anl (Lgdz;)V
      // 06b: istore 10
      // 06d: aload 0
      // 06e: getfield wo8.iva Lc05;
      // 071: invokevirtual Minecraft.dwz ()Lqfn;
      // 074: astore 18
      // 076: aload 18
      // 078: invokevirtual qfn.icl ()Lyig;
      // 07b: invokevirtual yig.fek ()Lv58;
      // 07e: astore 19
      // 080: aload 1
      // 081: invokevirtual co7.t9o ()Lerg;
      // 084: iload 10
      // 086: ifne 09e
      // 089: ifnull 0b7
      // 08c: goto 093
      // 08f: invokestatic wo8.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: invokevirtual co7.t9o ()Lerg;
      // 097: goto 09e
      // 09a: invokestatic wo8.a (Loov;)Loov;
      // 09d: athrow
      // 09e: invokevirtual erg.gn1 ()Lu7m;
      // 0a1: getstatic xbr.kdv Lf58;
      // 0a4: if_acmpne 0b7
      // 0a7: aload 19
      // 0a9: aload 0
      // 0aa: getfield wo8._5y Lzlz;
      // 0ad: invokevirtual v58.a92 (Lzlz;)Ldbw;
      // 0b0: astore 20
      // 0b2: iload 10
      // 0b4: ifeq 0c2
      // 0b7: aload 19
      // 0b9: aload 0
      // 0ba: getfield wo8.dga Lzlz;
      // 0bd: invokevirtual v58.a92 (Lzlz;)Ldbw;
      // 0c0: astore 20
      // 0c2: invokestatic hzu.dp2 ()V
      // 0c5: ldc -0.5
      // 0c7: nop
      // 0c8: ldc -0.5
      // 0ca: nop
      // 0cb: ldc -0.5
      // 0cd: nop
      // 0ce: invokestatic hzu.a4k (FFF)V
      // 0d1: aload 18
      // 0d3: invokevirtual qfn.mpi ()Lg_x;
      // 0d6: aload 20
      // 0d8: fconst_1
      // 0d9: fconst_1
      // 0da: fconst_1
      // 0db: fconst_1
      // 0dc: invokevirtual g_x.w5w (Ldbw;FFFF)V
      // 0df: invokestatic hzu.x3w ()V
      // 0e2: fconst_0
      // 0e3: fconst_0
      // 0e4: ldc 0.4375
      // 0e6: nop
      // 0e7: invokestatic hzu.a4k (FFF)V
      // 0ea: aload 0
      // 0eb: aload 1
      // 0ec: invokespecial wo8.x8q (Lco7;)V
      // 0ef: invokestatic hzu.x3w ()V
      // 0f2: aload 0
      // 0f3: aload 1
      // 0f4: dload 2
      // 0f5: aload 1
      // 0f6: getfield co7.vv_ Lvt2;
      // 0f9: invokevirtual vt2.n67 ()I
      // 0fc: i2f
      // 0fd: ldc 0.3
      // 0ff: nop
      // 100: fmul
      // 101: f2d
      // 102: dadd
      // 103: dload 4
      // 105: ldc2_w 0.25
      // 108: dsub
      // 109: dload 6
      // 10b: aload 1
      // 10c: getfield co7.vv_ Lvt2;
      // 10f: invokevirtual vt2.ozy ()I
      // 112: i2f
      // 113: ldc 0.3
      // 115: nop
      // 116: fmul
      // 117: f2d
      // 118: dadd
      // 119: invokevirtual wo8.apg (Lco7;DDD)V
      // 11c: return
   }

   public gdz ujs(co7 var1) {
      return null;
   }

   private void x8q(co7 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual co7.t9o ()Lerg;
      // 008: astore 3
      // 009: aload 3
      // 00a: ifnull 28b
      // 00d: aload 0
      // 00e: aload 1
      // 00f: invokespecial wo8.qwb (Lco7;)Z
      // 012: iload 2
      // 013: ifeq 02b
      // 016: goto 01d
      // 019: invokestatic wo8.a (Loov;)Loov;
      // 01c: athrow
      // 01d: ifne 028
      // 020: goto 027
      // 023: invokestatic wo8.a (Loov;)Loov;
      // 026: athrow
      // 027: return
      // 028: getstatic hxt.shm Z
      // 02b: ifne 05a
      // 02e: aload 0
      // 02f: getfield wo8.iva Lc05;
      // 032: getfield Minecraft.vg8 Ll86;
      // 035: astore 4
      // 037: aload 1
      // 038: aload 4
      // 03a: getfield EntityLivingBase.o2v D
      // 03d: aload 4
      // 03f: getfield EntityLivingBase.kfp D
      // 042: aload 4
      // 044: getfield EntityLivingBase.vbd D
      // 047: invokevirtual co7.p53 (DDD)D
      // 04a: dstore 5
      // 04c: dload 5
      // 04e: ldc2_w 4096.0
      // 051: dcmpl
      // 052: ifle 05a
      // 055: return
      // 056: invokestatic wo8.a (Loov;)Loov;
      // 059: athrow
      // 05a: new nvf
      // 05d: dup
      // 05e: aload 1
      // 05f: getfield co7.oay Lt9d;
      // 062: dconst_0
      // 063: dconst_0
      // 064: dconst_0
      // 065: aload 3
      // 066: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 069: astore 4
      // 06b: aload 4
      // 06d: invokevirtual nvf.s7f ()Lerg;
      // 070: invokevirtual erg.gn1 ()Lu7m;
      // 073: astore 5
      // 075: aload 4
      // 077: invokevirtual nvf.s7f ()Lerg;
      // 07a: bipush 1
      // 07b: putfield erg.qd2 I
      // 07e: aload 4
      // 080: fconst_0
      // 081: putfield nvf._19 F
      // 084: invokestatic hzu.dp2 ()V
      // 087: invokestatic hzu.fpt ()V
      // 08a: aload 1
      // 08b: invokevirtual co7.fsp ()I
      // 08e: istore 6
      // 090: aload 5
      // 092: instanceof f58
      // 095: iload 2
      // 096: ifeq 0d9
      // 099: ifeq 0ab
      // 09c: goto 0a3
      // 09f: invokestatic wo8.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 6
      // 0a5: bipush 4
      // 0a6: irem
      // 0a7: bipush 2
      // 0a8: imul
      // 0a9: istore 6
      // 0ab: iload 6
      // 0ad: i2f
      // 0ae: ldc 360.0
      // 0b0: nop
      // 0b1: fmul
      // 0b2: ldc 8.0
      // 0b4: nop
      // 0b5: fdiv
      // 0b6: fconst_0
      // 0b7: fconst_0
      // 0b8: fconst_1
      // 0b9: invokestatic hzu.a2h (FFFF)V
      // 0bc: iload 2
      // 0bd: ifeq 288
      // 0c0: getstatic net/optifine/reflect/Reflector.RenderItemInFrameEvent_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 0c3: bipush 2
      // 0c4: anewarray 282
      // 0c7: dup
      // 0c8: bipush 0
      // 0c9: aload 1
      // 0ca: aastore
      // 0cb: dup
      // 0cc: bipush 1
      // 0cd: aload 0
      // 0ce: aastore
      // 0cf: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 0d2: goto 0d9
      // 0d5: invokestatic wo8.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: ifne 285
      // 0dc: aload 5
      // 0de: instanceof f58
      // 0e1: ifeq 152
      // 0e4: goto 0eb
      // 0e7: invokestatic wo8.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield wo8.l0g Lhr_;
      // 0ef: getfield hr_.ewh Llc5;
      // 0f2: getstatic wo8.tj6 Lgdz;
      // 0f5: invokevirtual lc5.anl (Lgdz;)V
      // 0f8: ldc 180.0
      // 0fa: nop
      // 0fb: fconst_0
      // 0fc: fconst_0
      // 0fd: fconst_1
      // 0fe: invokestatic hzu.a2h (FFFF)V
      // 101: ldc 0.0078125
      // 103: nop
      // 104: fstore 7
      // 106: fload 7
      // 108: fload 7
      // 10a: fload 7
      // 10c: invokestatic hzu.syc (FFF)V
      // 10f: ldc -64.0
      // 111: nop
      // 112: ldc -64.0
      // 114: nop
      // 115: fconst_0
      // 116: invokestatic hzu.a4k (FFF)V
      // 119: getstatic xbr.kdv Lf58;
      // 11c: aload 4
      // 11e: invokevirtual nvf.s7f ()Lerg;
      // 121: aload 1
      // 122: getfield co7.oay Lt9d;
      // 125: invokevirtual f58.h9y (Lerg;Lt9d;)Lucr;
      // 128: astore 8
      // 12a: fconst_0
      // 12b: fconst_0
      // 12c: ldc -1.0
      // 12e: nop
      // 12f: invokestatic hzu.a4k (FFF)V
      // 132: aload 8
      // 134: ifnull 14e
      // 137: aload 0
      // 138: getfield wo8.iva Lc05;
      // 13b: getfield Minecraft.x0p Lv3i;
      // 13e: invokevirtual v3i.g16 ()Lf5a;
      // 141: aload 8
      // 143: bipush 1
      // 144: invokevirtual f5a.wzl (Lucr;Z)V
      // 147: goto 14e
      // 14a: invokestatic wo8.a (Loov;)Loov;
      // 14d: athrow
      // 14e: iload 2
      // 14f: ifne 285
      // 152: aconst_null
      // 153: astore 7
      // 155: aload 5
      // 157: getstatic xbr.xdw Lu7m;
      // 15a: if_acmpne 1ef
      // 15d: aload 0
      // 15e: getfield wo8.iva Lc05;
      // 161: invokevirtual Minecraft.dd_ ()Lyu2;
      // 164: getstatic o3w.zf_ Ljava/lang/String;
      // 167: invokevirtual yu2.brw (Ljava/lang/String;)Lsla;
      // 16a: astore 7
      // 16c: aload 0
      // 16d: getfield wo8.iva Lc05;
      // 170: invokevirtual Minecraft.l22 ()Llc5;
      // 173: getstatic yu2.nu_ Lgdz;
      // 176: invokevirtual lc5.anl (Lgdz;)V
      // 179: aload 7
      // 17b: iload 2
      // 17c: ifeq 195
      // 17f: instanceof o3w
      // 182: ifeq 1ec
      // 185: goto 18c
      // 188: invokestatic wo8.a (Loov;)Loov;
      // 18b: athrow
      // 18c: aload 7
      // 18e: goto 195
      // 191: invokestatic wo8.a (Loov;)Loov;
      // 194: athrow
      // 195: checkcast o3w
      // 198: astore 8
      // 19a: aload 8
      // 19c: getfield o3w.dgl D
      // 19f: dstore 9
      // 1a1: aload 8
      // 1a3: getfield o3w.z7d D
      // 1a6: dstore 11
      // 1a8: aload 8
      // 1aa: dconst_0
      // 1ab: putfield o3w.dgl D
      // 1ae: aload 8
      // 1b0: dconst_0
      // 1b1: putfield o3w.z7d D
      // 1b4: aload 8
      // 1b6: aload 1
      // 1b7: getfield co7.oay Lt9d;
      // 1ba: aload 1
      // 1bb: getfield co7.o2v D
      // 1be: aload 1
      // 1bf: getfield co7.vbd D
      // 1c2: sipush 180
      // 1c5: aload 1
      // 1c6: getfield co7.vv_ Lvt2;
      // 1c9: invokevirtual vt2.tmy ()I
      // 1cc: bipush 90
      // 1ce: imul
      // 1cf: iadd
      // 1d0: i2f
      // 1d1: invokestatic fe6.qsy (F)F
      // 1d4: f2d
      // 1d5: bipush 0
      // 1d6: bipush 1
      // 1d7: invokevirtual o3w.jiz (Lt9d;DDDZZ)V
      // 1da: aload 8
      // 1dc: dload 9
      // 1de: putfield o3w.dgl D
      // 1e1: aload 8
      // 1e3: dload 11
      // 1e5: putfield o3w.z7d D
      // 1e8: iload 2
      // 1e9: ifne 1ef
      // 1ec: aconst_null
      // 1ed: astore 7
      // 1ef: ldc 0.5
      // 1f1: nop
      // 1f2: ldc 0.5
      // 1f4: nop
      // 1f5: ldc 0.5
      // 1f7: nop
      // 1f8: iload 2
      // 1f9: ifeq 230
      // 1fc: invokestatic hzu.syc (FFF)V
      // 1ff: aload 0
      // 200: getfield wo8.fxy Ly1w;
      // 203: aload 4
      // 205: invokevirtual nvf.s7f ()Lerg;
      // 208: invokevirtual y1w.g60 (Lerg;)Z
      // 20b: ifeq 224
      // 20e: goto 215
      // 211: invokestatic wo8.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 5
      // 217: instanceof ljv
      // 21a: ifeq 234
      // 21d: goto 224
      // 220: invokestatic wo8.a (Loov;)Loov;
      // 223: athrow
      // 224: ldc 180.0
      // 226: nop
      // 227: fconst_0
      // 228: fconst_1
      // 229: goto 230
      // 22c: invokestatic wo8.a (Loov;)Loov;
      // 22f: athrow
      // 230: fconst_0
      // 231: invokestatic hzu.a2h (FFFF)V
      // 234: invokestatic hzu.kxu ()V
      // 237: invokestatic qpm.ne_ ()V
      // 23a: aload 0
      // 23b: getfield wo8.fxy Ly1w;
      // 23e: aload 4
      // 240: invokevirtual nvf.s7f ()Lerg;
      // 243: getstatic flk$gbm.e3w Lflk$gbm;
      // 246: invokevirtual y1w.ag9 (Lerg;Lflk$gbm;)V
      // 249: invokestatic qpm.cng ()V
      // 24c: invokestatic hzu.ich ()V
      // 24f: iload 2
      // 250: ifeq 288
      // 253: aload 7
      // 255: ifnull 285
      // 258: goto 25f
      // 25b: invokestatic wo8.a (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 7
      // 261: iload 2
      // 262: ifeq 282
      // 265: goto 26c
      // 268: invokestatic wo8.a (Loov;)Loov;
      // 26b: athrow
      // 26c: invokevirtual sla.d3x ()I
      // 26f: ifle 285
      // 272: goto 279
      // 275: invokestatic wo8.a (Loov;)Loov;
      // 278: athrow
      // 279: aload 7
      // 27b: goto 282
      // 27e: invokestatic wo8.a (Loov;)Loov;
      // 281: athrow
      // 282: invokevirtual sla.jke ()V
      // 285: invokestatic hzu.s7q ()V
      // 288: invokestatic hzu.x3w ()V
      // 28b: return
   }

   public void apg(co7 param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 8
      // 005: invokestatic Minecraft.d_6 ()Z
      // 008: ifeq 1e4
      // 00b: aload 1
      // 00c: invokevirtual co7.t9o ()Lerg;
      // 00f: iload 8
      // 011: ifeq 03c
      // 014: goto 01b
      // 017: invokestatic wo8.a (Loov;)Loov;
      // 01a: athrow
      // 01b: ifnull 1e4
      // 01e: goto 025
      // 021: invokestatic wo8.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 1
      // 026: iload 8
      // 028: ifeq 050
      // 02b: goto 032
      // 02e: invokestatic wo8.a (Loov;)Loov;
      // 031: athrow
      // 032: invokevirtual co7.t9o ()Lerg;
      // 035: goto 03c
      // 038: invokestatic wo8.a (Loov;)Loov;
      // 03b: athrow
      // 03c: invokevirtual erg.x4w ()Z
      // 03f: ifeq 1e4
      // 042: aload 0
      // 043: getfield wo8.l0g Lhr_;
      // 046: getfield hr_.k7u Li2h;
      // 049: goto 050
      // 04c: invokestatic wo8.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 1
      // 051: if_acmpne 1e4
      // 054: ldc 1.6
      // 056: nop
      // 057: fstore 9
      // 059: ldc 0.016666668
      // 05b: nop
      // 05c: fload 9
      // 05e: fmul
      // 05f: fstore 10
      // 061: aload 1
      // 062: aload 0
      // 063: getfield wo8.l0g Lhr_;
      // 066: getfield hr_.mok Li2h;
      // 069: invokevirtual co7.wxg (Li2h;)D
      // 06c: dstore 11
      // 06e: aload 1
      // 06f: invokevirtual co7.hzv ()Z
      // 072: ifeq 07f
      // 075: ldc 32.0
      // 077: nop
      // 078: goto 082
      // 07b: invokestatic wo8.a (Loov;)Loov;
      // 07e: athrow
      // 07f: ldc 64.0
      // 081: nop
      // 082: fstore 13
      // 084: dload 11
      // 086: fload 13
      // 088: fload 13
      // 08a: fmul
      // 08b: f2d
      // 08c: dcmpg
      // 08d: ifge 1e4
      // 090: aload 1
      // 091: invokevirtual co7.t9o ()Lerg;
      // 094: invokevirtual erg.zow ()Ljava/lang/String;
      // 097: astore 14
      // 099: aload 1
      // 09a: invokevirtual co7.hzv ()Z
      // 09d: ifeq 1cf
      // 0a0: aload 0
      // 0a1: invokevirtual wo8.r3f ()Lowt;
      // 0a4: astore 15
      // 0a6: invokestatic hzu.dp2 ()V
      // 0a9: dload 2
      // 0aa: d2f
      // 0ab: fconst_0
      // 0ac: fadd
      // 0ad: dload 4
      // 0af: d2f
      // 0b0: aload 1
      // 0b1: getfield co7.ikl F
      // 0b4: fadd
      // 0b5: ldc 0.5
      // 0b7: nop
      // 0b8: fadd
      // 0b9: dload 6
      // 0bb: d2f
      // 0bc: invokestatic hzu.a4k (FFF)V
      // 0bf: fconst_0
      // 0c0: fconst_1
      // 0c1: fconst_0
      // 0c2: invokestatic org/lwjgl/opengl/GL11.glNormal3f (FFF)V
      // 0c5: aload 0
      // 0c6: getfield wo8.l0g Lhr_;
      // 0c9: getfield hr_.s7e F
      // 0cc: fneg
      // 0cd: fconst_0
      // 0ce: fconst_1
      // 0cf: fconst_0
      // 0d0: invokestatic hzu.a2h (FFFF)V
      // 0d3: aload 0
      // 0d4: getfield wo8.l0g Lhr_;
      // 0d7: getfield hr_.fw9 F
      // 0da: fconst_1
      // 0db: fconst_0
      // 0dc: fconst_0
      // 0dd: invokestatic hzu.a2h (FFFF)V
      // 0e0: fload 10
      // 0e2: fneg
      // 0e3: fload 10
      // 0e5: fneg
      // 0e6: fload 10
      // 0e8: invokestatic hzu.syc (FFF)V
      // 0eb: invokestatic hzu.fpt ()V
      // 0ee: fconst_0
      // 0ef: ldc 0.25
      // 0f1: nop
      // 0f2: fload 10
      // 0f4: fdiv
      // 0f5: fconst_0
      // 0f6: invokestatic hzu.a4k (FFF)V
      // 0f9: bipush 0
      // 0fa: invokestatic hzu.jun (Z)V
      // 0fd: invokestatic hzu.spd ()V
      // 100: sipush 770
      // 103: sipush 771
      // 106: invokestatic hzu.ru7 (II)V
      // 109: invokestatic jom.yut ()Ljom;
      // 10c: astore 16
      // 10e: aload 16
      // 110: invokevirtual jom.zuq ()Lq3g;
      // 113: astore 17
      // 115: aload 15
      // 117: aload 14
      // 119: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 11c: bipush 2
      // 11d: idiv
      // 11e: istore 18
      // 120: invokestatic hzu.m_1 ()V
      // 123: aload 17
      // 125: bipush 7
      // 127: getstatic gnl.gec Lbe7;
      // 12a: invokevirtual q3g.ezr (ILbe7;)V
      // 12d: aload 17
      // 12f: iload 18
      // 131: ineg
      // 132: bipush 1
      // 133: isub
      // 134: i2d
      // 135: ldc2_w -1.0
      // 138: dconst_0
      // 139: invokevirtual q3g.g5o (DDD)Lq3g;
      // 13c: fconst_0
      // 13d: fconst_0
      // 13e: fconst_0
      // 13f: ldc 0.25
      // 141: nop
      // 142: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 145: invokevirtual q3g.pzw ()V
      // 148: aload 17
      // 14a: iload 18
      // 14c: ineg
      // 14d: bipush 1
      // 14e: isub
      // 14f: i2d
      // 150: ldc2_w 8.0
      // 153: dconst_0
      // 154: invokevirtual q3g.g5o (DDD)Lq3g;
      // 157: fconst_0
      // 158: fconst_0
      // 159: fconst_0
      // 15a: ldc 0.25
      // 15c: nop
      // 15d: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 160: invokevirtual q3g.pzw ()V
      // 163: aload 17
      // 165: iload 18
      // 167: bipush 1
      // 168: iadd
      // 169: i2d
      // 16a: ldc2_w 8.0
      // 16d: dconst_0
      // 16e: invokevirtual q3g.g5o (DDD)Lq3g;
      // 171: fconst_0
      // 172: fconst_0
      // 173: fconst_0
      // 174: ldc 0.25
      // 176: nop
      // 177: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 17a: invokevirtual q3g.pzw ()V
      // 17d: aload 17
      // 17f: iload 18
      // 181: bipush 1
      // 182: iadd
      // 183: i2d
      // 184: ldc2_w -1.0
      // 187: dconst_0
      // 188: invokevirtual q3g.g5o (DDD)Lq3g;
      // 18b: fconst_0
      // 18c: fconst_0
      // 18d: fconst_0
      // 18e: ldc 0.25
      // 190: nop
      // 191: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 194: invokevirtual q3g.pzw ()V
      // 197: aload 16
      // 199: invokevirtual jom.q7g ()V
      // 19c: invokestatic hzu.rqj ()V
      // 19f: bipush 1
      // 1a0: invokestatic hzu.jun (Z)V
      // 1a3: aload 15
      // 1a5: aload 14
      // 1a7: aload 15
      // 1a9: aload 14
      // 1ab: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 1ae: ineg
      // 1af: bipush 2
      // 1b0: idiv
      // 1b1: i2f
      // 1b2: fconst_0
      // 1b3: ldc 553648127
      // 1b5: nop
      // 1b6: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1b9: pop
      // 1ba: invokestatic hzu.s7q ()V
      // 1bd: invokestatic hzu.ux6 ()V
      // 1c0: fconst_1
      // 1c1: fconst_1
      // 1c2: fconst_1
      // 1c3: fconst_1
      // 1c4: invokestatic hzu.wn0 (FFFF)V
      // 1c7: invokestatic hzu.x3w ()V
      // 1ca: iload 8
      // 1cc: ifne 1e4
      // 1cf: aload 0
      // 1d0: aload 1
      // 1d1: aload 14
      // 1d3: dload 2
      // 1d4: dload 4
      // 1d6: dload 6
      // 1d8: bipush 64
      // 1da: invokevirtual wo8.dlr (Li2h;Ljava/lang/String;DDDI)V
      // 1dd: goto 1e4
      // 1e0: invokestatic wo8.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: return
   }

   private boolean qwb(co7 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 07: iload 2
      // 08: ifne 1e
      // 0b: ifeq 1b
      // 0e: goto 15
      // 11: invokestatic wo8.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: ireturn
      // 17: invokestatic wo8.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic hxt.shm Z
      // 1e: iload 2
      // 1f: ifne 61
      // 22: ifne 60
      // 25: goto 2c
      // 28: invokestatic wo8.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield wo8.iva Lc05;
      // 30: invokevirtual Minecraft.nsd ()Li2h;
      // 33: astore 3
      // 34: aload 1
      // 35: aload 3
      // 36: getfield EntityLivingBase.o2v D
      // 39: aload 3
      // 3a: getfield EntityLivingBase.kfp D
      // 3d: aload 3
      // 3e: getfield EntityLivingBase.vbd D
      // 41: invokevirtual co7.p53 (DDD)D
      // 44: dstore 4
      // 46: dload 4
      // 48: getstatic wo8.qx4 D
      // 4b: dcmpl
      // 4c: iload 2
      // 4d: ifne 61
      // 50: ifle 60
      // 53: goto 5a
      // 56: invokestatic wo8.a (Loov;)Loov;
      // 59: athrow
      // 5a: bipush 0
      // 5b: ireturn
      // 5c: invokestatic wo8.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush 1
      // 61: ireturn
   }

   public static void adh() {
      Minecraft var0 = hxt.a59();
      double var1 = (double)hxt.zkb(var0.oxn.bpa, 1.0F, 120.0F);
      double var3 = Math.max(6.0 * (double)var0.ry7 / var1, 16.0);
      qx4 = var3 * var3;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.ujs((co7)var1);
   }

   @Override
   public void ix5(EntityLivingBase var1, double var2, double var4, double var6) {
      this.apg((co7)var1, var2, var4, var6);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.ctw((co7)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5858189029213607471L, -3147599692880376196L, MethodHandles.lookup().lookupClass()).a(74193790642312L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 133085442098491L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "\u000e\u0093\u001aB0-¬RüðùD\t\u0005ó«\u0018\u0000Å\u0006u,\u0001Êpü·\u0010\tg<cùïô2Û\u000f´b^ Ûàc\u0016\u00adEóA\u008c¢W\néÍ\u001fÃ\u0080\u0004\r\\¢§¥ÐØÁÔ\u0090OÂsÍ";
      int var6 = "\u000e\u0093\u001aB0-¬RüðùD\t\u0005ó«\u0018\u0000Å\u0006u,\u0001Êpü·\u0010\tg<cùïô2Û\u000f´b^ Ûàc\u0016\u00adEóA\u008c¢W\néÍ\u001fÃ\u0080\u0004\r\\¢§¥ÐØÁÔ\u0090OÂsÍ"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     c = var7;
                     g = new String[5];
                     tj6 = new gdz(b<"u">(11450, 8161568794421584331L ^ var9));
                     qx4 = 4096.0;
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = ".ýÇQ¸B\u001c¬\u0012@f\u000bÏ\u0007xh8m\r]\u0081ðjÀ¢¢\u0013%6»ÃUå\u0097`¤¿\u00886Ä1\u0082f\u0013E\u0090Ñ?òA|\u0087\"Àjg@\u009c\u0002dÕÌ4·\u0017\b\u0092{A^âË?";
                  var6 = ".ýÇQ¸B\u001c¬\u0012@f\u000bÏ\u0007xh8m\r]\u0081ðjÀ¢¢\u0013%6»ÃUå\u0097`¤¿\u00886Ä1\u0082f\u0013E\u0090Ñ?òA|\u0087\"Àjg@\u009c\u0002dÕÌ4·\u0017\b\u0092{A^âË?"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22073;
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
            throw new RuntimeException("wo8", var10);
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
         throw new RuntimeException("wo8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
