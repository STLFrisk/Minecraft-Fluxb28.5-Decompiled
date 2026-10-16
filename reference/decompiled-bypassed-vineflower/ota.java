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

public class ota extends g6r {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ota(float var1) {
      long var2 = a ^ 100155157947134L;
      super();
      this.dsx = 256;
      this.apc = 256;
      this.o15(a<"t">(27482, 2690241661564323184L ^ var2), 0, 0);
      this.o15(a<"t">(18705, 3668170784858646308L ^ var2), -56, 88);
      this.o15(a<"t">(11347, 9097968607440159324L ^ var2), -56, 144);
      this.o15(a<"t">(3268, 6359235241739707107L ^ var2), 0, 0);
      this.o15(a<"t">(19194, 5762981600110650608L ^ var2), 112, 0);
      this.o15(a<"t">(21561, 8210855094584326666L ^ var2), 196, 0);
      this.o15(a<"t">(28936, 4820232371882073909L ^ var2), 112, 30);
      this.o15(a<"t">(24087, 4452911540586000416L ^ var2), 112, 88);
      this.o15(a<"t">(28472, 5683891559623655696L ^ var2), 176, 44);
      this.o15(a<"t">(28001, 8222117802559472450L ^ var2), 176, 65);
      this.o15(a<"t">(14623, 2455505541105964859L ^ var2), 112, 104);
      this.o15(a<"t">(5616, 6927125770795023323L ^ var2), 112, 136);
      this.o15(a<"t">(11198, 948632883666470284L ^ var2), 144, 104);
      this.o15(a<"t">(21557, 4068698918530693647L ^ var2), 192, 104);
      this.o15(a<"t">(3732, 1535953307341807794L ^ var2), 226, 138);
      this.o15(a<"t">(7855, 4080680358717190310L ^ var2), 220, 53);
      this.o15(a<"t">(6740, 8239681049781007450L ^ var2), 0, 0);
      this.o15(a<"t">(9041, 7789566803262393681L ^ var2), 48, 0);
      this.o15(a<"t">(12852, 5393023739692997653L ^ var2), 112, 0);
      float var4 = -16.0F;
      this.ayi = new tf8(this, a<"t">(24085, 3353331656069165116L ^ var2));
      this.ayi.de4(a<"t">(5636, 7257182079578667023L ^ var2), -6.0F, -1.0F, -8.0F + var4, 12, 5, 16);
      this.ayi.de4(a<"t">(17082, 1497109198707961021L ^ var2), -8.0F, -8.0F, 6.0F + var4, 16, 16, 16);
      this.ayi.hsi = true;
      this.ayi.de4(a<"t">(11796, 6092138780904308764L ^ var2), -5.0F, -12.0F, 12.0F + var4, 2, 4, 6);
      this.ayi.de4(a<"t">(17092, 7312497117709872381L ^ var2), -5.0F, -3.0F, -6.0F + var4, 2, 2, 4);
      this.ayi.hsi = false;
      this.ayi.de4(a<"t">(20490, 6803754434176794119L ^ var2), 3.0F, -12.0F, 12.0F + var4, 2, 4, 6);
      this.ayi.de4(a<"t">(1652, 8566266041257420920L ^ var2), 3.0F, -3.0F, -6.0F + var4, 2, 2, 4);
      this.o0k = new tf8(this, a<"t">(6106, 6736597014997006837L ^ var2));
      this.o0k.i50(0.0F, 4.0F, 8.0F + var4);
      this.o0k.de4(a<"t">(8738, 99169415982763010L ^ var2), -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.ayi.i_6(this.o0k);
      this.aco = new tf8(this, a<"t">(12523, 7166777165712809684L ^ var2));
      this.aco.de4(a<"t">(8795, 9193086701437799525L ^ var2), -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.aco.de4(a<"t">(20490, 6803754434176794119L ^ var2), -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.abc = new tf8(this, a<"t">(19218, 3035172642540037436L ^ var2));
      this.abc.i50(0.0F, 4.0F, 8.0F);
      this.abc.de4(a<"t">(20320, 1114207807580578117L ^ var2), -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.abc.de4(a<"t">(20490, 6803754434176794119L ^ var2), -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.abc.de4(a<"t">(20490, 6803754434176794119L ^ var2), -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.abc.de4(a<"t">(20490, 6803754434176794119L ^ var2), -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.wi5 = new tf8(this, a<"t">(23199, 3366331484214539435L ^ var2));
      this.wi5.i50(-12.0F, 5.0F, 2.0F);
      this.wi5.de4(a<"t">(12235, 3203991756555960781L ^ var2), -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.wi5.de4(a<"t">(27264, 3524692805125932209L ^ var2), -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.muc = new tf8(this, a<"t">(409, 7014203303726378932L ^ var2));
      this.muc.i50(-56.0F, 0.0F, 0.0F);
      this.muc.de4(a<"t">(4772, 695868119380262034L ^ var2), -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.muc.de4(a<"t">(1509, 1390447203925978073L ^ var2), -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.wi5.i_6(this.muc);
      this.uht = new tf8(this, a<"t">(29965, 321088586839530287L ^ var2));
      this.uht.i50(-12.0F, 20.0F, 2.0F);
      this.uht.de4(a<"t">(14743, 5756006004314658710L ^ var2), -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.l3y = new tf8(this, a<"t">(922, 4900079958024580514L ^ var2));
      this.l3y.i50(0.0F, 20.0F, -1.0F);
      this.l3y.de4(a<"t">(3305, 6579410377724322538L ^ var2), -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.uht.i_6(this.l3y);
      this.gbb = new tf8(this, a<"t">(32137, 525087236896166795L ^ var2));
      this.gbb.i50(0.0F, 23.0F, 0.0F);
      this.gbb.de4(a<"t">(3305, 6579410377724322538L ^ var2), -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.l3y.i_6(this.gbb);
      this.bgw = new tf8(this, a<"t">(20999, 3876845564219276331L ^ var2));
      this.bgw.i50(-16.0F, 16.0F, 42.0F);
      this.bgw.de4(a<"t">(3305, 6579410377724322538L ^ var2), -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.s7a = new tf8(this, a<"t">(28172, 6856498704746840124L ^ var2));
      this.s7a.i50(0.0F, 32.0F, -4.0F);
      this.s7a.de4(a<"t">(3305, 6579410377724322538L ^ var2), -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.bgw.i_6(this.s7a);
      this.kwa = new tf8(this, a<"t">(21270, 6453303011020881197L ^ var2));
      this.kwa.i50(0.0F, 31.0F, 4.0F);
      this.kwa.de4(a<"t">(3305, 6579410377724322538L ^ var2), -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.s7a.i_6(this.kwa);
   }

   @Override
   public void v3g(g_3 var1, float var2, float var3, float var4) {
      this._j0 = var4;
   }

   @Override
   public void s_q(i2h param1, float param2, float param3, float param4, float param5, float param6, float param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.dp2 ()V
      // 003: aload 1
      // 004: checkcast fcs
      // 007: astore 9
      // 009: invokestatic t9d.c ()I
      // 00c: aload 9
      // 00e: getfield fcs.z1a F
      // 011: aload 9
      // 013: getfield fcs.djj F
      // 016: aload 9
      // 018: getfield fcs.z1a F
      // 01b: fsub
      // 01c: aload 0
      // 01d: getfield ota._j0 F
      // 020: fmul
      // 021: fadd
      // 022: fstore 10
      // 024: aload 0
      // 025: getfield ota.o0k Ltf8;
      // 028: fload 10
      // 02a: ldc 3.1415927
      // 02c: nop
      // 02d: fmul
      // 02e: fconst_2
      // 02f: fmul
      // 030: f2d
      // 031: invokestatic java/lang/Math.sin (D)D
      // 034: dconst_1
      // 035: dadd
      // 036: d2f
      // 037: ldc 0.2
      // 039: nop
      // 03a: fmul
      // 03b: putfield tf8.pod F
      // 03e: fload 10
      // 040: ldc 3.1415927
      // 042: nop
      // 043: fmul
      // 044: fconst_2
      // 045: fmul
      // 046: fconst_1
      // 047: fsub
      // 048: f2d
      // 049: invokestatic java/lang/Math.sin (D)D
      // 04c: dconst_1
      // 04d: dadd
      // 04e: d2f
      // 04f: fstore 11
      // 051: fload 11
      // 053: fload 11
      // 055: fmul
      // 056: fconst_1
      // 057: fmul
      // 058: fload 11
      // 05a: fconst_2
      // 05b: fmul
      // 05c: fadd
      // 05d: ldc 0.05
      // 05f: nop
      // 060: fmul
      // 061: fstore 11
      // 063: fconst_0
      // 064: fload 11
      // 066: fconst_2
      // 067: fsub
      // 068: ldc -3.0
      // 06a: nop
      // 06b: invokestatic hzu.a4k (FFF)V
      // 06e: fload 11
      // 070: fconst_2
      // 071: fmul
      // 072: fconst_1
      // 073: fconst_0
      // 074: fconst_0
      // 075: invokestatic hzu.a2h (FFFF)V
      // 078: ldc -30.0
      // 07a: nop
      // 07b: fstore 12
      // 07d: fconst_0
      // 07e: fstore 13
      // 080: ldc 1.5
      // 082: nop
      // 083: fstore 14
      // 085: aload 9
      // 087: bipush 6
      // 089: aload 0
      // 08a: getfield ota._j0 F
      // 08d: invokevirtual fcs.gv2 (IF)[D
      // 090: astore 15
      // 092: aload 0
      // 093: aload 9
      // 095: bipush 5
      // 096: aload 0
      // 097: getfield ota._j0 F
      // 09a: invokevirtual fcs.gv2 (IF)[D
      // 09d: bipush 0
      // 09e: daload
      // 09f: aload 9
      // 0a1: bipush 10
      // 0a3: aload 0
      // 0a4: getfield ota._j0 F
      // 0a7: invokevirtual fcs.gv2 (IF)[D
      // 0aa: bipush 0
      // 0ab: daload
      // 0ac: dsub
      // 0ad: invokespecial ota.kyg (D)F
      // 0b0: fstore 16
      // 0b2: aload 0
      // 0b3: aload 9
      // 0b5: bipush 5
      // 0b6: aload 0
      // 0b7: getfield ota._j0 F
      // 0ba: invokevirtual fcs.gv2 (IF)[D
      // 0bd: bipush 0
      // 0be: daload
      // 0bf: fload 16
      // 0c1: fconst_2
      // 0c2: fdiv
      // 0c3: f2d
      // 0c4: dadd
      // 0c5: invokespecial ota.kyg (D)F
      // 0c8: fstore 17
      // 0ca: istore 8
      // 0cc: fload 12
      // 0ce: fconst_2
      // 0cf: fadd
      // 0d0: fstore 12
      // 0d2: fload 10
      // 0d4: ldc 3.1415927
      // 0d6: nop
      // 0d7: fmul
      // 0d8: fconst_2
      // 0d9: fmul
      // 0da: fstore 18
      // 0dc: ldc 20.0
      // 0de: nop
      // 0df: fstore 12
      // 0e1: ldc -12.0
      // 0e3: nop
      // 0e4: fstore 19
      // 0e6: bipush 0
      // 0e7: istore 20
      // 0e9: iload 20
      // 0eb: bipush 5
      // 0ec: if_icmpge 206
      // 0ef: aload 9
      // 0f1: bipush 5
      // 0f2: iload 20
      // 0f4: isub
      // 0f5: aload 0
      // 0f6: getfield ota._j0 F
      // 0f9: invokevirtual fcs.gv2 (IF)[D
      // 0fc: astore 21
      // 0fe: iload 20
      // 100: i2f
      // 101: ldc 0.45
      // 103: nop
      // 104: fmul
      // 105: fload 18
      // 107: fadd
      // 108: f2d
      // 109: invokestatic java/lang/Math.cos (D)D
      // 10c: d2f
      // 10d: ldc 0.15
      // 10f: nop
      // 110: fmul
      // 111: fstore 22
      // 113: aload 0
      // 114: getfield ota.aco Ltf8;
      // 117: aload 0
      // 118: aload 21
      // 11a: bipush 0
      // 11b: daload
      // 11c: aload 15
      // 11e: bipush 0
      // 11f: daload
      // 120: dsub
      // 121: invokespecial ota.kyg (D)F
      // 124: ldc 3.1415927
      // 126: nop
      // 127: fmul
      // 128: ldc 180.0
      // 12a: nop
      // 12b: fdiv
      // 12c: fload 14
      // 12e: fmul
      // 12f: putfield tf8.r80 F
      // 132: aload 0
      // 133: getfield ota.aco Ltf8;
      // 136: fload 22
      // 138: aload 21
      // 13a: bipush 1
      // 13b: daload
      // 13c: aload 15
      // 13e: bipush 1
      // 13f: daload
      // 140: dsub
      // 141: d2f
      // 142: ldc 3.1415927
      // 144: nop
      // 145: fmul
      // 146: ldc 180.0
      // 148: nop
      // 149: fdiv
      // 14a: fload 14
      // 14c: fmul
      // 14d: ldc 5.0
      // 14f: nop
      // 150: fmul
      // 151: fadd
      // 152: putfield tf8.pod F
      // 155: aload 0
      // 156: getfield ota.aco Ltf8;
      // 159: aload 0
      // 15a: aload 21
      // 15c: bipush 0
      // 15d: daload
      // 15e: fload 17
      // 160: f2d
      // 161: dsub
      // 162: invokespecial ota.kyg (D)F
      // 165: fneg
      // 166: ldc 3.1415927
      // 168: nop
      // 169: fmul
      // 16a: ldc 180.0
      // 16c: nop
      // 16d: fdiv
      // 16e: fload 14
      // 170: fmul
      // 171: putfield tf8.oo7 F
      // 174: aload 0
      // 175: getfield ota.aco Ltf8;
      // 178: fload 12
      // 17a: putfield tf8.ca7 F
      // 17d: aload 0
      // 17e: getfield ota.aco Ltf8;
      // 181: fload 19
      // 183: putfield tf8.kit F
      // 186: aload 0
      // 187: getfield ota.aco Ltf8;
      // 18a: fload 13
      // 18c: putfield tf8._ki F
      // 18f: fload 12
      // 191: f2d
      // 192: aload 0
      // 193: getfield ota.aco Ltf8;
      // 196: getfield tf8.pod F
      // 199: f2d
      // 19a: invokestatic java/lang/Math.sin (D)D
      // 19d: ldc2_w 10.0
      // 1a0: dmul
      // 1a1: dadd
      // 1a2: d2f
      // 1a3: fstore 12
      // 1a5: fload 19
      // 1a7: f2d
      // 1a8: aload 0
      // 1a9: getfield ota.aco Ltf8;
      // 1ac: getfield tf8.r80 F
      // 1af: f2d
      // 1b0: invokestatic java/lang/Math.cos (D)D
      // 1b3: aload 0
      // 1b4: getfield ota.aco Ltf8;
      // 1b7: getfield tf8.pod F
      // 1ba: f2d
      // 1bb: invokestatic java/lang/Math.cos (D)D
      // 1be: dmul
      // 1bf: ldc2_w 10.0
      // 1c2: dmul
      // 1c3: dsub
      // 1c4: d2f
      // 1c5: fstore 19
      // 1c7: fload 13
      // 1c9: f2d
      // 1ca: aload 0
      // 1cb: getfield ota.aco Ltf8;
      // 1ce: getfield tf8.r80 F
      // 1d1: f2d
      // 1d2: invokestatic java/lang/Math.sin (D)D
      // 1d5: aload 0
      // 1d6: getfield ota.aco Ltf8;
      // 1d9: getfield tf8.pod F
      // 1dc: f2d
      // 1dd: invokestatic java/lang/Math.cos (D)D
      // 1e0: dmul
      // 1e1: ldc2_w 10.0
      // 1e4: dmul
      // 1e5: dsub
      // 1e6: d2f
      // 1e7: fstore 13
      // 1e9: aload 0
      // 1ea: getfield ota.aco Ltf8;
      // 1ed: fload 7
      // 1ef: invokevirtual tf8.vca (F)V
      // 1f2: iinc 20 1
      // 1f5: iload 8
      // 1f7: ifne 221
      // 1fa: iload 8
      // 1fc: ifeq 0e9
      // 1ff: goto 206
      // 202: invokestatic ota.a (Loov;)Loov;
      // 205: athrow
      // 206: aload 0
      // 207: getfield ota.ayi Ltf8;
      // 20a: fload 12
      // 20c: putfield tf8.ca7 F
      // 20f: aload 0
      // 210: getfield ota.ayi Ltf8;
      // 213: fload 19
      // 215: putfield tf8.kit F
      // 218: aload 0
      // 219: getfield ota.ayi Ltf8;
      // 21c: fload 13
      // 21e: putfield tf8._ki F
      // 221: aload 9
      // 223: bipush 0
      // 224: aload 0
      // 225: getfield ota._j0 F
      // 228: invokevirtual fcs.gv2 (IF)[D
      // 22b: astore 20
      // 22d: aload 0
      // 22e: getfield ota.ayi Ltf8;
      // 231: aload 0
      // 232: aload 20
      // 234: bipush 0
      // 235: daload
      // 236: aload 15
      // 238: bipush 0
      // 239: daload
      // 23a: dsub
      // 23b: invokespecial ota.kyg (D)F
      // 23e: ldc 3.1415927
      // 240: nop
      // 241: fmul
      // 242: ldc 180.0
      // 244: nop
      // 245: fdiv
      // 246: fconst_1
      // 247: fmul
      // 248: putfield tf8.r80 F
      // 24b: aload 0
      // 24c: getfield ota.ayi Ltf8;
      // 24f: aload 0
      // 250: aload 20
      // 252: bipush 0
      // 253: daload
      // 254: fload 17
      // 256: f2d
      // 257: dsub
      // 258: invokespecial ota.kyg (D)F
      // 25b: fneg
      // 25c: ldc 3.1415927
      // 25e: nop
      // 25f: fmul
      // 260: ldc 180.0
      // 262: nop
      // 263: fdiv
      // 264: fconst_1
      // 265: fmul
      // 266: putfield tf8.oo7 F
      // 269: aload 0
      // 26a: getfield ota.ayi Ltf8;
      // 26d: fload 7
      // 26f: invokevirtual tf8.vca (F)V
      // 272: invokestatic hzu.dp2 ()V
      // 275: fconst_0
      // 276: fconst_1
      // 277: fconst_0
      // 278: invokestatic hzu.a4k (FFF)V
      // 27b: fload 16
      // 27d: fneg
      // 27e: fload 14
      // 280: fmul
      // 281: fconst_1
      // 282: fmul
      // 283: fconst_0
      // 284: fconst_0
      // 285: fconst_1
      // 286: invokestatic hzu.a2h (FFFF)V
      // 289: fconst_0
      // 28a: ldc -1.0
      // 28c: nop
      // 28d: fconst_0
      // 28e: invokestatic hzu.a4k (FFF)V
      // 291: aload 0
      // 292: getfield ota.abc Ltf8;
      // 295: fconst_0
      // 296: putfield tf8.oo7 F
      // 299: aload 0
      // 29a: getfield ota.abc Ltf8;
      // 29d: fload 7
      // 29f: invokevirtual tf8.vca (F)V
      // 2a2: bipush 0
      // 2a3: istore 21
      // 2a5: iload 21
      // 2a7: bipush 2
      // 2a8: if_icmpge 3c0
      // 2ab: invokestatic hzu.gp4 ()V
      // 2ae: fload 10
      // 2b0: ldc 3.1415927
      // 2b2: nop
      // 2b3: fmul
      // 2b4: fconst_2
      // 2b5: fmul
      // 2b6: fstore 22
      // 2b8: aload 0
      // 2b9: getfield ota.wi5 Ltf8;
      // 2bc: ldc 0.125
      // 2be: nop
      // 2bf: fload 22
      // 2c1: f2d
      // 2c2: invokestatic java/lang/Math.cos (D)D
      // 2c5: d2f
      // 2c6: ldc 0.2
      // 2c8: nop
      // 2c9: fmul
      // 2ca: fsub
      // 2cb: putfield tf8.pod F
      // 2ce: aload 0
      // 2cf: getfield ota.wi5 Ltf8;
      // 2d2: ldc 0.25
      // 2d4: nop
      // 2d5: putfield tf8.r80 F
      // 2d8: aload 0
      // 2d9: getfield ota.wi5 Ltf8;
      // 2dc: fload 22
      // 2de: f2d
      // 2df: invokestatic java/lang/Math.sin (D)D
      // 2e2: ldc2_w 0.125
      // 2e5: dadd
      // 2e6: d2f
      // 2e7: ldc 0.8
      // 2e9: nop
      // 2ea: fmul
      // 2eb: putfield tf8.oo7 F
      // 2ee: aload 0
      // 2ef: getfield ota.muc Ltf8;
      // 2f2: fload 22
      // 2f4: fconst_2
      // 2f5: fadd
      // 2f6: f2d
      // 2f7: invokestatic java/lang/Math.sin (D)D
      // 2fa: ldc2_w 0.5
      // 2fd: dadd
      // 2fe: d2f
      // 2ff: fneg
      // 300: ldc 0.75
      // 302: nop
      // 303: fmul
      // 304: putfield tf8.oo7 F
      // 307: aload 0
      // 308: getfield ota.bgw Ltf8;
      // 30b: fconst_1
      // 30c: fload 11
      // 30e: ldc 0.1
      // 310: nop
      // 311: fmul
      // 312: fadd
      // 313: putfield tf8.pod F
      // 316: aload 0
      // 317: getfield ota.s7a Ltf8;
      // 31a: ldc 0.5
      // 31c: nop
      // 31d: fload 11
      // 31f: ldc 0.1
      // 321: nop
      // 322: fmul
      // 323: fadd
      // 324: putfield tf8.pod F
      // 327: aload 0
      // 328: getfield ota.kwa Ltf8;
      // 32b: ldc 0.75
      // 32d: nop
      // 32e: fload 11
      // 330: ldc 0.1
      // 332: nop
      // 333: fmul
      // 334: fadd
      // 335: putfield tf8.pod F
      // 338: aload 0
      // 339: getfield ota.uht Ltf8;
      // 33c: ldc 1.3
      // 33e: nop
      // 33f: fload 11
      // 341: ldc 0.1
      // 343: nop
      // 344: fmul
      // 345: fadd
      // 346: putfield tf8.pod F
      // 349: aload 0
      // 34a: getfield ota.l3y Ltf8;
      // 34d: ldc -0.5
      // 34f: nop
      // 350: fload 11
      // 352: ldc 0.1
      // 354: nop
      // 355: fmul
      // 356: fsub
      // 357: putfield tf8.pod F
      // 35a: aload 0
      // 35b: getfield ota.gbb Ltf8;
      // 35e: ldc 0.75
      // 360: nop
      // 361: fload 11
      // 363: ldc 0.1
      // 365: nop
      // 366: fmul
      // 367: fadd
      // 368: putfield tf8.pod F
      // 36b: aload 0
      // 36c: getfield ota.wi5 Ltf8;
      // 36f: fload 7
      // 371: invokevirtual tf8.vca (F)V
      // 374: aload 0
      // 375: getfield ota.uht Ltf8;
      // 378: fload 7
      // 37a: invokevirtual tf8.vca (F)V
      // 37d: aload 0
      // 37e: getfield ota.bgw Ltf8;
      // 381: fload 7
      // 383: invokevirtual tf8.vca (F)V
      // 386: ldc -1.0
      // 388: nop
      // 389: fconst_1
      // 38a: fconst_1
      // 38b: invokestatic hzu.syc (FFF)V
      // 38e: iload 8
      // 390: ifne 3bb
      // 393: iload 21
      // 395: iload 8
      // 397: ifne 3c6
      // 39a: goto 3a1
      // 39d: invokestatic ota.a (Loov;)Loov;
      // 3a0: athrow
      // 3a1: ifne 3b8
      // 3a4: goto 3ab
      // 3a7: invokestatic ota.a (Loov;)Loov;
      // 3aa: athrow
      // 3ab: sipush 1028
      // 3ae: invokestatic hzu.cf8 (I)V
      // 3b1: goto 3b8
      // 3b4: invokestatic ota.a (Loov;)Loov;
      // 3b7: athrow
      // 3b8: iinc 21 1
      // 3bb: iload 8
      // 3bd: ifeq 2a5
      // 3c0: invokestatic hzu.x3w ()V
      // 3c3: sipush 1029
      // 3c6: invokestatic hzu.cf8 (I)V
      // 3c9: invokestatic hzu.o1b ()V
      // 3cc: fload 10
      // 3ce: ldc 3.1415927
      // 3d0: nop
      // 3d1: fmul
      // 3d2: fconst_2
      // 3d3: fmul
      // 3d4: f2d
      // 3d5: invokestatic java/lang/Math.sin (D)D
      // 3d8: d2f
      // 3d9: fneg
      // 3da: fconst_0
      // 3db: fmul
      // 3dc: fstore 21
      // 3de: fload 10
      // 3e0: ldc 3.1415927
      // 3e2: nop
      // 3e3: fmul
      // 3e4: fconst_2
      // 3e5: fmul
      // 3e6: fstore 18
      // 3e8: ldc 10.0
      // 3ea: nop
      // 3eb: fstore 12
      // 3ed: ldc 60.0
      // 3ef: nop
      // 3f0: fstore 19
      // 3f2: fconst_0
      // 3f3: fstore 13
      // 3f5: aload 9
      // 3f7: bipush 11
      // 3f9: aload 0
      // 3fa: getfield ota._j0 F
      // 3fd: invokevirtual fcs.gv2 (IF)[D
      // 400: astore 15
      // 402: bipush 0
      // 403: istore 22
      // 405: iload 22
      // 407: bipush 12
      // 409: if_icmpge 52b
      // 40c: aload 9
      // 40e: bipush 12
      // 410: iload 22
      // 412: iadd
      // 413: aload 0
      // 414: getfield ota._j0 F
      // 417: invokevirtual fcs.gv2 (IF)[D
      // 41a: astore 20
      // 41c: fload 21
      // 41e: f2d
      // 41f: iload 22
      // 421: i2f
      // 422: ldc 0.45
      // 424: nop
      // 425: fmul
      // 426: fload 18
      // 428: fadd
      // 429: f2d
      // 42a: invokestatic java/lang/Math.sin (D)D
      // 42d: ldc2_w 0.05000000074505806
      // 430: dmul
      // 431: dadd
      // 432: d2f
      // 433: fstore 21
      // 435: aload 0
      // 436: getfield ota.aco Ltf8;
      // 439: aload 0
      // 43a: aload 20
      // 43c: bipush 0
      // 43d: daload
      // 43e: aload 15
      // 440: bipush 0
      // 441: daload
      // 442: dsub
      // 443: invokespecial ota.kyg (D)F
      // 446: fload 14
      // 448: fmul
      // 449: ldc 180.0
      // 44b: nop
      // 44c: fadd
      // 44d: ldc 3.1415927
      // 44f: nop
      // 450: fmul
      // 451: ldc 180.0
      // 453: nop
      // 454: fdiv
      // 455: putfield tf8.r80 F
      // 458: aload 0
      // 459: getfield ota.aco Ltf8;
      // 45c: fload 21
      // 45e: aload 20
      // 460: bipush 1
      // 461: daload
      // 462: aload 15
      // 464: bipush 1
      // 465: daload
      // 466: dsub
      // 467: d2f
      // 468: ldc 3.1415927
      // 46a: nop
      // 46b: fmul
      // 46c: ldc 180.0
      // 46e: nop
      // 46f: fdiv
      // 470: fload 14
      // 472: fmul
      // 473: ldc 5.0
      // 475: nop
      // 476: fmul
      // 477: fadd
      // 478: putfield tf8.pod F
      // 47b: aload 0
      // 47c: getfield ota.aco Ltf8;
      // 47f: aload 0
      // 480: aload 20
      // 482: bipush 0
      // 483: daload
      // 484: fload 17
      // 486: f2d
      // 487: dsub
      // 488: invokespecial ota.kyg (D)F
      // 48b: ldc 3.1415927
      // 48d: nop
      // 48e: fmul
      // 48f: ldc 180.0
      // 491: nop
      // 492: fdiv
      // 493: fload 14
      // 495: fmul
      // 496: putfield tf8.oo7 F
      // 499: aload 0
      // 49a: getfield ota.aco Ltf8;
      // 49d: fload 12
      // 49f: putfield tf8.ca7 F
      // 4a2: aload 0
      // 4a3: getfield ota.aco Ltf8;
      // 4a6: fload 19
      // 4a8: putfield tf8.kit F
      // 4ab: aload 0
      // 4ac: getfield ota.aco Ltf8;
      // 4af: fload 13
      // 4b1: putfield tf8._ki F
      // 4b4: fload 12
      // 4b6: f2d
      // 4b7: aload 0
      // 4b8: getfield ota.aco Ltf8;
      // 4bb: getfield tf8.pod F
      // 4be: f2d
      // 4bf: invokestatic java/lang/Math.sin (D)D
      // 4c2: ldc2_w 10.0
      // 4c5: dmul
      // 4c6: dadd
      // 4c7: d2f
      // 4c8: fstore 12
      // 4ca: fload 19
      // 4cc: f2d
      // 4cd: aload 0
      // 4ce: getfield ota.aco Ltf8;
      // 4d1: getfield tf8.r80 F
      // 4d4: f2d
      // 4d5: invokestatic java/lang/Math.cos (D)D
      // 4d8: aload 0
      // 4d9: getfield ota.aco Ltf8;
      // 4dc: getfield tf8.pod F
      // 4df: f2d
      // 4e0: invokestatic java/lang/Math.cos (D)D
      // 4e3: dmul
      // 4e4: ldc2_w 10.0
      // 4e7: dmul
      // 4e8: dsub
      // 4e9: d2f
      // 4ea: fstore 19
      // 4ec: fload 13
      // 4ee: f2d
      // 4ef: aload 0
      // 4f0: getfield ota.aco Ltf8;
      // 4f3: getfield tf8.r80 F
      // 4f6: f2d
      // 4f7: invokestatic java/lang/Math.sin (D)D
      // 4fa: aload 0
      // 4fb: getfield ota.aco Ltf8;
      // 4fe: getfield tf8.pod F
      // 501: f2d
      // 502: invokestatic java/lang/Math.cos (D)D
      // 505: dmul
      // 506: ldc2_w 10.0
      // 509: dmul
      // 50a: dsub
      // 50b: d2f
      // 50c: fstore 13
      // 50e: aload 0
      // 50f: getfield ota.aco Ltf8;
      // 512: fload 7
      // 514: invokevirtual tf8.vca (F)V
      // 517: iinc 22 1
      // 51a: iload 8
      // 51c: ifne 52e
      // 51f: iload 8
      // 521: ifeq 405
      // 524: goto 52b
      // 527: invokestatic ota.a (Loov;)Loov;
      // 52a: athrow
      // 52b: invokestatic hzu.x3w ()V
      // 52e: return
   }

   private float kyg(double var1) {
      int var3 = t9d.c();

      while (var1 >= 180.0) {
         var1 -= 360.0;

         try {
            if (var3 != 0) {
               return (float)var1;
            }

            if (var3 != 0) {
               break;
            }
         } catch (oov var4) {
            throw a(var4);
         }
      }

      while (var1 < -180.0) {
         double var10000 = var1 + 360.0;
         if (var3 != 0) {
            return (float)var10000;
         }

         var1 = var10000;
         if (var3 != 0) {
            return (float)var1;
         }
      }

      return (float)var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8032985546001862451L, 5670192017018878653L, MethodHandles.lookup().lookupClass()).a(251392784308396L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 18108623262464L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[46];
      int var7 = 0;
      String var6 = "\r$:i5Ç¦á¡ó?\u0099`\"¥äáÈ)a \u0091tÌ\u00951ÏL{\u009aÿk bô\t\u0084\u0013)P=\u008díW\u0090ÿl\u009dÑØ'\u0088Pp\u0011\u0014\u008a,m&\u0097ød\u007fd\u0010¬¶ÕA\u008alYó®Öÿ{\u00830Áê \u001b@+Hr-º¤' \u0016T\u008aÌ\u001ds\\oçÏmmdiÎé\u00001\u001a\u0097\u001c±\u0010Oá<y*Ï\u0099¥ê°\u009d[f\rüî\u0010«\u0003a¡jã\u00164ðTÇ\u0084xV·=\u0010èu},l\u008cZ\u0005ä\u00006äDüïV\u0010@cÊ»rhQ\u0089\t\u0094#Ù»\u000eÇ\u001b\u0010µ_¡Ó\u0007¼Ü\u0005\u0017>\u001c\u009am\u009eÂ¬\u0018ç¬Â:àngñ7\u0015ß¬ñ\u008fH\u0096\u0016¯]»;\u0003\u008b\u007f\u0018¬\u008c\fàá\u0013\u0001®ôO\u0001Ò¯\u0089\u0000\u0089¤ÁöÐ\u009b\u0081\u0095\u0013\u0010\u0091E\u009co§T\u008f/è^\"f'\u0085<\u001f #»\u0084@\u0004s\u0083\u001b\u0016\u0080m5/ë&\u0016\u0084\f\u007fn´}´f\u0099¾\u0093¢BI\u0016¹(Ô<×Ã\u0010\u0098p\u000bÈR\bI4Êy?\u0094C²C\u0002æcüß}ýW±õÓàöÙQ£I\u0095ÙF\u0010S[;]hx\u009aÓ\u0095 \u0096Ë2[9× \u0017\u0005\u0087±ºíº§\u009dÇ]\"\u001e^\u0082'\u0003G \u008cP9À%¡\"!b`nó\b Æ\u0017$©ú\u001c{Û\u001a\u0006óú\u009f«¦ñ\u0012g0!(\f\u008bì\u008a«A\u0082 ÖG\u0002  c°É\u00ad§þ\u0014_Í:\bÃÒÃ\u0091D\u0087qÓx\u0086I¶4î\u0080[7ÌÒ\u008f\u00109\u0019\u0004äÌæX6\u008dþG[ÃýS\u0097 ½¦hx¹by \u0003Í\u0013^ í\u009aüñ\u0018ÝÓà\u0086éS \\E/¹\u0013!â\u0010>þý\u001c(³\u0084\u0019k@`\u001bþ\u001c[®\u0010}k~Tü¬T\u0099\u0013¾\u009e7\u0083\u0003\u0097\r\u0018Q\u008bê,4Û¢N\u0098\u0003ø~_\u0019\u0007Ák\u0015È-\u0084ÆÜ\u0082\u0010à\u00146\u008a\u0016ÏRI\u001bÔj×Mó\u0006À «âYK\u00020\u0013\u0084ÀxªY¾Waá\u008c±rÃ\u0086ïEÐ\u0015Qê\u000eÔïèè ÚF1\u009cyÌ\u001e Q\u0017õ»ÑöóòÄW¸\u008c~Pò5¹\u0001\u0088Bc¸/\u008b\u0010 ðJ\u0005\b8~¦/-$Ç¢\u0086¦L ó\u001f\u0016$Cã0üÁ\u0097éì\u009d¾\u001fä\u001a¸!\u000b×ê\u0007×\u0018è\u008eôS\u009a\u0085\u0014 \u0085¸\u000bûlRUË¦\u0013l)[\u009eNì*d;Û&\u0080ù9¾$\u0094X\u008e5\u0015\u0000\u0010}Ï}7õj\u0011\u001c%\u001fÕ~Ý\u0010\u008bø ¼àÂå8F-vÁ\u0014rYÅ>ër´¿\u009b:\u0019\u0006q£ç¦\u0001Ê!VªÙ\u0010èyï \u0082\u0090¬.9áÅ\u001cXk\u001d\u008b \u0007:)3ÒûãÝ\u0002\u0091c\u007f\u0007ÀeêN\u001dµ\u001d¦í6\u008dZºRúNA\u009f\u0019\u0018ØÂ\u0086õ\u0095\u0004(\u0019\"½\n«\u0085\bt8\u0083ß\u0014T¡4\u0087A\u0018\"f2\u0095\u0081÷àÔ\u00adLQçWBi\u0010\u0097\u0000êc·Rqz\u0010U\u009eU\u0097á,R¸½.Î\u008eÃÃÆ\u009c ÝiaõJÛ±ÆÙ\u000eQ,üD®\u0098\u001dÊÏ\u000f/Çí\u0010Ø<xþ\u0005/ZÙ Ý)\u009f\u009e\u0083\u0002* Ö(¾\u0005Ëêl¬n2ì}b\u008eã\u0081Öè\u0015]\u008a\u000eÜÄ\u0010Òé\u0004øÒÍ\u0095\u001bÊ\u0089ÁCgþ[±\u0010þÓ0ÿ;\u00ad`Ì\u000bÚé_\u001eÝ=û\u0010\u001fõÙhf2\rçV\u008af\u001a¿ße1 ï\u0015\u0006Zµ\u0014=Ëã\f¿÷\u0084+ö¦\u0086(F\u0099Ä¡_£\u008f\u0083³\u0012\"Àå%\u0010+Èlöè\u009eÝ\u0082²\u0090\u000b\u0014Oi\u0001, Ñ¤\u001f!{\u0097\u008eQ\u001eîs9CJÿ~¼û>¶\t\u0007\u009bç_\u008f¤;R\u000b¬µ";
      int var8 = "\r$:i5Ç¦á¡ó?\u0099`\"¥äáÈ)a \u0091tÌ\u00951ÏL{\u009aÿk bô\t\u0084\u0013)P=\u008díW\u0090ÿl\u009dÑØ'\u0088Pp\u0011\u0014\u008a,m&\u0097ød\u007fd\u0010¬¶ÕA\u008alYó®Öÿ{\u00830Áê \u001b@+Hr-º¤' \u0016T\u008aÌ\u001ds\\oçÏmmdiÎé\u00001\u001a\u0097\u001c±\u0010Oá<y*Ï\u0099¥ê°\u009d[f\rüî\u0010«\u0003a¡jã\u00164ðTÇ\u0084xV·=\u0010èu},l\u008cZ\u0005ä\u00006äDüïV\u0010@cÊ»rhQ\u0089\t\u0094#Ù»\u000eÇ\u001b\u0010µ_¡Ó\u0007¼Ü\u0005\u0017>\u001c\u009am\u009eÂ¬\u0018ç¬Â:àngñ7\u0015ß¬ñ\u008fH\u0096\u0016¯]»;\u0003\u008b\u007f\u0018¬\u008c\fàá\u0013\u0001®ôO\u0001Ò¯\u0089\u0000\u0089¤ÁöÐ\u009b\u0081\u0095\u0013\u0010\u0091E\u009co§T\u008f/è^\"f'\u0085<\u001f #»\u0084@\u0004s\u0083\u001b\u0016\u0080m5/ë&\u0016\u0084\f\u007fn´}´f\u0099¾\u0093¢BI\u0016¹(Ô<×Ã\u0010\u0098p\u000bÈR\bI4Êy?\u0094C²C\u0002æcüß}ýW±õÓàöÙQ£I\u0095ÙF\u0010S[;]hx\u009aÓ\u0095 \u0096Ë2[9× \u0017\u0005\u0087±ºíº§\u009dÇ]\"\u001e^\u0082'\u0003G \u008cP9À%¡\"!b`nó\b Æ\u0017$©ú\u001c{Û\u001a\u0006óú\u009f«¦ñ\u0012g0!(\f\u008bì\u008a«A\u0082 ÖG\u0002  c°É\u00ad§þ\u0014_Í:\bÃÒÃ\u0091D\u0087qÓx\u0086I¶4î\u0080[7ÌÒ\u008f\u00109\u0019\u0004äÌæX6\u008dþG[ÃýS\u0097 ½¦hx¹by \u0003Í\u0013^ í\u009aüñ\u0018ÝÓà\u0086éS \\E/¹\u0013!â\u0010>þý\u001c(³\u0084\u0019k@`\u001bþ\u001c[®\u0010}k~Tü¬T\u0099\u0013¾\u009e7\u0083\u0003\u0097\r\u0018Q\u008bê,4Û¢N\u0098\u0003ø~_\u0019\u0007Ák\u0015È-\u0084ÆÜ\u0082\u0010à\u00146\u008a\u0016ÏRI\u001bÔj×Mó\u0006À «âYK\u00020\u0013\u0084ÀxªY¾Waá\u008c±rÃ\u0086ïEÐ\u0015Qê\u000eÔïèè ÚF1\u009cyÌ\u001e Q\u0017õ»ÑöóòÄW¸\u008c~Pò5¹\u0001\u0088Bc¸/\u008b\u0010 ðJ\u0005\b8~¦/-$Ç¢\u0086¦L ó\u001f\u0016$Cã0üÁ\u0097éì\u009d¾\u001fä\u001a¸!\u000b×ê\u0007×\u0018è\u008eôS\u009a\u0085\u0014 \u0085¸\u000bûlRUË¦\u0013l)[\u009eNì*d;Û&\u0080ù9¾$\u0094X\u008e5\u0015\u0000\u0010}Ï}7õj\u0011\u001c%\u001fÕ~Ý\u0010\u008bø ¼àÂå8F-vÁ\u0014rYÅ>ër´¿\u009b:\u0019\u0006q£ç¦\u0001Ê!VªÙ\u0010èyï \u0082\u0090¬.9áÅ\u001cXk\u001d\u008b \u0007:)3ÒûãÝ\u0002\u0091c\u007f\u0007ÀeêN\u001dµ\u001d¦í6\u008dZºRúNA\u009f\u0019\u0018ØÂ\u0086õ\u0095\u0004(\u0019\"½\n«\u0085\bt8\u0083ß\u0014T¡4\u0087A\u0018\"f2\u0095\u0081÷àÔ\u00adLQçWBi\u0010\u0097\u0000êc·Rqz\u0010U\u009eU\u0097á,R¸½.Î\u008eÃÃÆ\u009c ÝiaõJÛ±ÆÙ\u000eQ,üD®\u0098\u001dÊÏ\u000f/Çí\u0010Ø<xþ\u0005/ZÙ Ý)\u009f\u009e\u0083\u0002* Ö(¾\u0005Ëêl¬n2ì}b\u008eã\u0081Öè\u0015]\u008a\u000eÜÄ\u0010Òé\u0004øÒÍ\u0095\u001bÊ\u0089ÁCgþ[±\u0010þÓ0ÿ;\u00ad`Ì\u000bÚé_\u001eÝ=û\u0010\u001fõÙhf2\rçV\u008af\u001a¿ße1 ï\u0015\u0006Zµ\u0014=Ëã\f¿÷\u0084+ö¦\u0086(F\u0099Ä¡_£\u008f\u0083³\u0012\"Àå%\u0010+Èlöè\u009eÝ\u0082²\u0090\u000b\u0014Oi\u0001, Ñ¤\u001f!{\u0097\u008eQ\u001eîs9CJÿ~¼û>¶\t\u0007\u009bç_\u008f¤;R\u000b¬µ"
         .length();
      char var5 = ' ';
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
                     c = new String[46];
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

                  var6 = "\u008f\u001bÊCIþik,#\u0083'C7ª\u0012$\u0003÷{³z8\u00ad\u0010\u0016\u001fr\u008c\u0006\t§\u0012+>yvx\u0005×\u0080";
                  var8 = "\u008f\u001bÊCIþik,#\u0083'C7ª\u0012$\u0003÷{³z8\u00ad\u0010\u0016\u001fr\u008c\u0006\t§\u0012+>yvx\u0005×\u0080".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2763;
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
            throw new RuntimeException("ota", var10);
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
         throw new RuntimeException("ota" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
