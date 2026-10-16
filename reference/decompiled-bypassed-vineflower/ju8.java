import com.google.common.base.Predicate;
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

public class ju8 extends s0i implements t6u, n6g {
   private float[] o06 = new float[2];
   private float[] em1 = new float[2];
   private float[] ks9 = new float[2];
   private float[] dq4 = new float[2];
   private int[] isk = new int[2];
   private int[] zx3 = new int[2];
   private int nal;
   private static final Predicate y4x;
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public ju8(t9d var1) {
      super(var1);
      this.uh3(this.axb());
      this.yxc(0.9F, 3.5F);
      this.cuj = true;
      ((zvv)this.zq2()).wxx(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(2, new wkr(this, 1.0, 40, 20.0F));
      this.r1d.tn8(5, new _tb(this, 1.0));
      this.r1d.tn8(6, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(7, new ov6(this));
      this.g9o.tn8(1, new z7z(this, false, new Class[0]));
      this.g9o.tn8(2, new s24(this, yqv.class, 0, false, false, y4x));
      this.dlk = 50;
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(17, new Integer(0));
      this.oit.kp2(18, new Integer(0));
      this.oit.kp2(19, new Integer(0));
      this.oit.kp2(20, new Integer(0));
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 34378345180223L;
      super.srs(var1);
      var1.iin(e<"w">(26, 987320524898046462L ^ var2), this.vhe());
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 116454017073300L;
      super.cjb(var1);
      this.gnw(var1.uz7(e<"w">(18817, 2176994971970319563L ^ var2)));
   }

   @Override
   public String _n1() {
      long var1 = c ^ 33509393192521L;
      return e<"w">(3239, 1502223189444175671L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 5339872450865L;
      return e<"w">(8954, 5629033999613462035L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 65616602132351L;
      return e<"w">(15745, 4147848429238333218L ^ var1);
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: dup
      // 006: getfield ju8.mop D
      // 009: ldc2_w 0.6000000238418579
      // 00c: dmul
      // 00d: putfield ju8.mop D
      // 010: aload 0
      // 011: getfield ju8.oay Lt9d;
      // 014: getfield t9d.v0f Z
      // 017: iload 1
      // 018: ifeq 178
      // 01b: ifne 161
      // 01e: goto 025
      // 021: invokestatic ju8.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 0
      // 026: bipush 0
      // 027: invokevirtual ju8.efr (I)I
      // 02a: iload 1
      // 02b: ifeq 178
      // 02e: goto 035
      // 031: invokestatic ju8.a (Loov;)Loov;
      // 034: athrow
      // 035: ifle 161
      // 038: goto 03f
      // 03b: invokestatic ju8.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: iload 1
      // 041: ifeq 162
      // 044: goto 04b
      // 047: invokestatic ju8.a (Loov;)Loov;
      // 04a: athrow
      // 04b: getfield ju8.oay Lt9d;
      // 04e: aload 0
      // 04f: bipush 0
      // 050: invokevirtual ju8.efr (I)I
      // 053: invokevirtual t9d.oks (I)Li2h;
      // 056: astore 2
      // 057: aload 2
      // 058: ifnull 161
      // 05b: aload 0
      // 05c: getfield ju8.kfp D
      // 05f: aload 2
      // 060: getfield i2h.kfp D
      // 063: dcmpg
      // 064: iload 1
      // 065: ifeq 0cc
      // 068: goto 06f
      // 06b: invokestatic ju8.a (Loov;)Loov;
      // 06e: athrow
      // 06f: iflt 0b4
      // 072: goto 079
      // 075: invokestatic ju8.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: iload 1
      // 07b: ifeq 0f1
      // 07e: goto 085
      // 081: invokestatic ju8.a (Loov;)Loov;
      // 084: athrow
      // 085: invokevirtual ju8.kvl ()Z
      // 088: ifne 0f0
      // 08b: goto 092
      // 08e: invokestatic ju8.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: getfield ju8.kfp D
      // 096: aload 2
      // 097: getfield i2h.kfp D
      // 09a: ldc2_w 5.0
      // 09d: dadd
      // 09e: iload 1
      // 09f: ifeq 0f8
      // 0a2: goto 0a9
      // 0a5: invokestatic ju8.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: dcmpg
      // 0aa: ifge 0f0
      // 0ad: goto 0b4
      // 0b0: invokestatic ju8.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: iload 1
      // 0b6: ifeq 0dc
      // 0b9: goto 0c0
      // 0bc: invokestatic ju8.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: getfield ju8.mop D
      // 0c3: dconst_0
      // 0c4: dcmpg
      // 0c5: goto 0cc
      // 0c8: invokestatic ju8.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: ifge 0db
      // 0cf: aload 0
      // 0d0: dconst_0
      // 0d1: putfield ju8.mop D
      // 0d4: goto 0db
      // 0d7: invokestatic ju8.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: dup
      // 0dd: getfield ju8.mop D
      // 0e0: ldc2_w 0.5
      // 0e3: aload 0
      // 0e4: getfield ju8.mop D
      // 0e7: dsub
      // 0e8: ldc2_w 0.6000000238418579
      // 0eb: dmul
      // 0ec: dadd
      // 0ed: putfield ju8.mop D
      // 0f0: aload 2
      // 0f1: getfield i2h.o2v D
      // 0f4: aload 0
      // 0f5: getfield ju8.o2v D
      // 0f8: dsub
      // 0f9: dstore 3
      // 0fa: aload 2
      // 0fb: getfield i2h.vbd D
      // 0fe: aload 0
      // 0ff: getfield ju8.vbd D
      // 102: dsub
      // 103: dstore 5
      // 105: dload 3
      // 106: dload 3
      // 107: dmul
      // 108: dload 5
      // 10a: dload 5
      // 10c: dmul
      // 10d: dadd
      // 10e: dstore 7
      // 110: dload 7
      // 112: ldc2_w 9.0
      // 115: dcmpl
      // 116: iload 1
      // 117: ifeq 178
      // 11a: ifle 161
      // 11d: goto 124
      // 120: invokestatic ju8.a (Loov;)Loov;
      // 123: athrow
      // 124: dload 7
      // 126: invokestatic fe6.dii (D)F
      // 129: f2d
      // 12a: dstore 9
      // 12c: aload 0
      // 12d: dup
      // 12e: getfield ju8.icv D
      // 131: dload 3
      // 132: dload 9
      // 134: ddiv
      // 135: ldc2_w 0.5
      // 138: dmul
      // 139: aload 0
      // 13a: getfield ju8.icv D
      // 13d: dsub
      // 13e: ldc2_w 0.6000000238418579
      // 141: dmul
      // 142: dadd
      // 143: putfield ju8.icv D
      // 146: aload 0
      // 147: dup
      // 148: getfield ju8.bw4 D
      // 14b: dload 5
      // 14d: dload 9
      // 14f: ddiv
      // 150: ldc2_w 0.5
      // 153: dmul
      // 154: aload 0
      // 155: getfield ju8.bw4 D
      // 158: dsub
      // 159: ldc2_w 0.6000000238418579
      // 15c: dmul
      // 15d: dadd
      // 15e: putfield ju8.bw4 D
      // 161: aload 0
      // 162: getfield ju8.icv D
      // 165: aload 0
      // 166: getfield ju8.icv D
      // 169: dmul
      // 16a: aload 0
      // 16b: getfield ju8.bw4 D
      // 16e: aload 0
      // 16f: getfield ju8.bw4 D
      // 172: dmul
      // 173: dadd
      // 174: ldc2_w 0.05000000074505806
      // 177: dcmpl
      // 178: iload 1
      // 179: ifeq 1aa
      // 17c: ifle 1a5
      // 17f: goto 186
      // 182: invokestatic ju8.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 0
      // 187: aload 0
      // 188: getfield ju8.bw4 D
      // 18b: aload 0
      // 18c: getfield ju8.icv D
      // 18f: invokestatic fe6.yr8 (DD)D
      // 192: d2f
      // 193: ldc 57.295776
      // 195: nop
      // 196: fmul
      // 197: ldc 90.0
      // 199: nop
      // 19a: fsub
      // 19b: putfield ju8.x5k F
      // 19e: goto 1a5
      // 1a1: invokestatic ju8.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: invokespecial s0i.e_a ()V
      // 1a9: bipush 0
      // 1aa: istore 2
      // 1ab: iload 2
      // 1ac: bipush 2
      // 1ad: if_icmpge 1da
      // 1b0: aload 0
      // 1b1: getfield ju8.dq4 [F
      // 1b4: iload 2
      // 1b5: aload 0
      // 1b6: getfield ju8.em1 [F
      // 1b9: iload 2
      // 1ba: faload
      // 1bb: fastore
      // 1bc: aload 0
      // 1bd: getfield ju8.ks9 [F
      // 1c0: iload 2
      // 1c1: aload 0
      // 1c2: getfield ju8.o06 [F
      // 1c5: iload 2
      // 1c6: faload
      // 1c7: fastore
      // 1c8: iinc 2 1
      // 1cb: iload 1
      // 1cc: ifeq 1dc
      // 1cf: iload 1
      // 1d0: ifne 1ab
      // 1d3: goto 1da
      // 1d6: invokestatic ju8.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: bipush 0
      // 1db: istore 2
      // 1dc: iload 2
      // 1dd: bipush 2
      // 1de: if_icmpge 2d7
      // 1e1: aload 0
      // 1e2: iload 2
      // 1e3: bipush 1
      // 1e4: iadd
      // 1e5: invokevirtual ju8.efr (I)I
      // 1e8: istore 3
      // 1e9: aconst_null
      // 1ea: astore 4
      // 1ec: iload 3
      // 1ed: iload 1
      // 1ee: ifeq 2dd
      // 1f1: ifle 205
      // 1f4: goto 1fb
      // 1f7: invokestatic ju8.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: getfield ju8.oay Lt9d;
      // 1ff: iload 3
      // 200: invokevirtual t9d.oks (I)Li2h;
      // 203: astore 4
      // 205: aload 4
      // 207: ifnull 2b2
      // 20a: aload 0
      // 20b: iload 2
      // 20c: bipush 1
      // 20d: iadd
      // 20e: invokespecial ju8.n_6 (I)D
      // 211: dstore 5
      // 213: aload 0
      // 214: iload 2
      // 215: bipush 1
      // 216: iadd
      // 217: invokespecial ju8.rc_ (I)D
      // 21a: dstore 7
      // 21c: aload 0
      // 21d: iload 2
      // 21e: bipush 1
      // 21f: iadd
      // 220: invokespecial ju8.tl1 (I)D
      // 223: dstore 9
      // 225: aload 4
      // 227: getfield i2h.o2v D
      // 22a: dload 5
      // 22c: dsub
      // 22d: dstore 11
      // 22f: aload 4
      // 231: getfield i2h.kfp D
      // 234: aload 4
      // 236: invokevirtual i2h.c5y ()F
      // 239: f2d
      // 23a: dadd
      // 23b: dload 7
      // 23d: dsub
      // 23e: dstore 13
      // 240: aload 4
      // 242: getfield i2h.vbd D
      // 245: dload 9
      // 247: dsub
      // 248: dstore 15
      // 24a: dload 11
      // 24c: dload 11
      // 24e: dmul
      // 24f: dload 15
      // 251: dload 15
      // 253: dmul
      // 254: dadd
      // 255: invokestatic fe6.dii (D)F
      // 258: f2d
      // 259: dstore 17
      // 25b: dload 15
      // 25d: dload 11
      // 25f: invokestatic fe6.yr8 (DD)D
      // 262: ldc2_w 180.0
      // 265: dmul
      // 266: ldc2_w 3.141592653589793
      // 269: ddiv
      // 26a: d2f
      // 26b: ldc 90.0
      // 26d: nop
      // 26e: fsub
      // 26f: fstore 19
      // 271: dload 13
      // 273: dload 17
      // 275: invokestatic fe6.yr8 (DD)D
      // 278: ldc2_w 180.0
      // 27b: dmul
      // 27c: ldc2_w 3.141592653589793
      // 27f: ddiv
      // 280: dneg
      // 281: d2f
      // 282: fstore 20
      // 284: aload 0
      // 285: getfield ju8.o06 [F
      // 288: iload 2
      // 289: aload 0
      // 28a: aload 0
      // 28b: getfield ju8.o06 [F
      // 28e: iload 2
      // 28f: faload
      // 290: fload 20
      // 292: ldc 40.0
      // 294: nop
      // 295: invokespecial ju8.i2k (FFF)F
      // 298: fastore
      // 299: aload 0
      // 29a: getfield ju8.em1 [F
      // 29d: iload 2
      // 29e: aload 0
      // 29f: aload 0
      // 2a0: getfield ju8.em1 [F
      // 2a3: iload 2
      // 2a4: faload
      // 2a5: fload 19
      // 2a7: ldc 10.0
      // 2a9: nop
      // 2aa: invokespecial ju8.i2k (FFF)F
      // 2ad: fastore
      // 2ae: iload 1
      // 2af: ifne 2d0
      // 2b2: aload 0
      // 2b3: getfield ju8.em1 [F
      // 2b6: iload 2
      // 2b7: aload 0
      // 2b8: aload 0
      // 2b9: getfield ju8.em1 [F
      // 2bc: iload 2
      // 2bd: faload
      // 2be: aload 0
      // 2bf: getfield ju8.ksw F
      // 2c2: ldc 10.0
      // 2c4: nop
      // 2c5: invokespecial ju8.i2k (FFF)F
      // 2c8: fastore
      // 2c9: goto 2d0
      // 2cc: invokestatic ju8.a (Loov;)Loov;
      // 2cf: athrow
      // 2d0: iinc 2 1
      // 2d3: iload 1
      // 2d4: ifne 1dc
      // 2d7: aload 0
      // 2d8: invokevirtual ju8.kvl ()Z
      // 2db: istore 2
      // 2dc: bipush 0
      // 2dd: istore 3
      // 2de: iload 3
      // 2df: bipush 3
      // 2e0: if_icmpge 3ba
      // 2e3: aload 0
      // 2e4: iload 3
      // 2e5: invokespecial ju8.n_6 (I)D
      // 2e8: dstore 4
      // 2ea: aload 0
      // 2eb: iload 3
      // 2ec: invokespecial ju8.rc_ (I)D
      // 2ef: dstore 6
      // 2f1: aload 0
      // 2f2: iload 3
      // 2f3: invokespecial ju8.tl1 (I)D
      // 2f6: dstore 8
      // 2f8: aload 0
      // 2f9: getfield ju8.oay Lt9d;
      // 2fc: getstatic w_0.bac Lw_0;
      // 2ff: dload 4
      // 301: aload 0
      // 302: getfield ju8.z2d Ljava/util/Random;
      // 305: invokevirtual java/util/Random.nextGaussian ()D
      // 308: ldc2_w 0.30000001192092896
      // 30b: dmul
      // 30c: dadd
      // 30d: dload 6
      // 30f: aload 0
      // 310: getfield ju8.z2d Ljava/util/Random;
      // 313: invokevirtual java/util/Random.nextGaussian ()D
      // 316: ldc2_w 0.30000001192092896
      // 319: dmul
      // 31a: dadd
      // 31b: dload 8
      // 31d: aload 0
      // 31e: getfield ju8.z2d Ljava/util/Random;
      // 321: invokevirtual java/util/Random.nextGaussian ()D
      // 324: ldc2_w 0.30000001192092896
      // 327: dmul
      // 328: dadd
      // 329: dconst_0
      // 32a: dconst_0
      // 32b: dconst_0
      // 32c: bipush 0
      // 32d: newarray 10
      // 32f: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 332: iload 1
      // 333: ifeq 3b6
      // 336: iload 2
      // 337: iload 1
      // 338: ifeq 3be
      // 33b: goto 342
      // 33e: invokestatic ju8.a (Loov;)Loov;
      // 341: athrow
      // 342: ifeq 3b3
      // 345: goto 34c
      // 348: invokestatic ju8.a (Loov;)Loov;
      // 34b: athrow
      // 34c: aload 0
      // 34d: getfield ju8.oay Lt9d;
      // 350: iload 1
      // 351: ifeq 377
      // 354: goto 35b
      // 357: invokestatic ju8.a (Loov;)Loov;
      // 35a: athrow
      // 35b: getfield t9d.fsy Ljava/util/Random;
      // 35e: bipush 4
      // 35f: invokevirtual java/util/Random.nextInt (I)I
      // 362: ifne 3b3
      // 365: goto 36c
      // 368: invokestatic ju8.a (Loov;)Loov;
      // 36b: athrow
      // 36c: aload 0
      // 36d: getfield ju8.oay Lt9d;
      // 370: goto 377
      // 373: invokestatic ju8.a (Loov;)Loov;
      // 376: athrow
      // 377: getstatic w_0.hg8 Lw_0;
      // 37a: dload 4
      // 37c: aload 0
      // 37d: getfield ju8.z2d Ljava/util/Random;
      // 380: invokevirtual java/util/Random.nextGaussian ()D
      // 383: ldc2_w 0.30000001192092896
      // 386: dmul
      // 387: dadd
      // 388: dload 6
      // 38a: aload 0
      // 38b: getfield ju8.z2d Ljava/util/Random;
      // 38e: invokevirtual java/util/Random.nextGaussian ()D
      // 391: ldc2_w 0.30000001192092896
      // 394: dmul
      // 395: dadd
      // 396: dload 8
      // 398: aload 0
      // 399: getfield ju8.z2d Ljava/util/Random;
      // 39c: invokevirtual java/util/Random.nextGaussian ()D
      // 39f: ldc2_w 0.30000001192092896
      // 3a2: dmul
      // 3a3: dadd
      // 3a4: ldc2_w 0.699999988079071
      // 3a7: ldc2_w 0.699999988079071
      // 3aa: ldc2_w 0.5
      // 3ad: bipush 0
      // 3ae: newarray 10
      // 3b0: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 3b3: iinc 3 1
      // 3b6: iload 1
      // 3b7: ifne 2de
      // 3ba: aload 0
      // 3bb: invokevirtual ju8.vhe ()I
      // 3be: iload 1
      // 3bf: ifeq 3cd
      // 3c2: ifle 41d
      // 3c5: goto 3cc
      // 3c8: invokestatic ju8.a (Loov;)Loov;
      // 3cb: athrow
      // 3cc: bipush 0
      // 3cd: istore 3
      // 3ce: iload 3
      // 3cf: bipush 3
      // 3d0: if_icmpge 41d
      // 3d3: aload 0
      // 3d4: getfield ju8.oay Lt9d;
      // 3d7: getstatic w_0.hg8 Lw_0;
      // 3da: aload 0
      // 3db: getfield ju8.o2v D
      // 3de: aload 0
      // 3df: getfield ju8.z2d Ljava/util/Random;
      // 3e2: invokevirtual java/util/Random.nextGaussian ()D
      // 3e5: dconst_1
      // 3e6: dmul
      // 3e7: dadd
      // 3e8: aload 0
      // 3e9: getfield ju8.kfp D
      // 3ec: aload 0
      // 3ed: getfield ju8.z2d Ljava/util/Random;
      // 3f0: invokevirtual java/util/Random.nextFloat ()F
      // 3f3: ldc 3.3
      // 3f5: nop
      // 3f6: fmul
      // 3f7: f2d
      // 3f8: dadd
      // 3f9: aload 0
      // 3fa: getfield ju8.vbd D
      // 3fd: aload 0
      // 3fe: getfield ju8.z2d Ljava/util/Random;
      // 401: invokevirtual java/util/Random.nextGaussian ()D
      // 404: dconst_1
      // 405: dmul
      // 406: dadd
      // 407: ldc2_w 0.699999988079071
      // 40a: ldc2_w 0.699999988079071
      // 40d: ldc2_w 0.8999999761581421
      // 410: bipush 0
      // 411: newarray 10
      // 413: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 416: iinc 3 1
      // 419: iload 1
      // 41a: ifne 3ce
      // 41d: return
   }

   @Override
   public void qar() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ju8.c J
      // 003: ldc2_w 23405829406330
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokevirtual ju8.vhe ()I
      // 010: iload 3
      // 011: ifne 0b9
      // 014: ifle 0ad
      // 017: goto 01e
      // 01a: invokestatic ju8.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: invokevirtual ju8.vhe ()I
      // 022: bipush 1
      // 023: isub
      // 024: istore 4
      // 026: iload 4
      // 028: iload 3
      // 029: ifne 09f
      // 02c: ifgt 087
      // 02f: goto 036
      // 032: invokestatic ju8.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: getfield ju8.oay Lt9d;
      // 03a: aload 0
      // 03b: aload 0
      // 03c: getfield ju8.o2v D
      // 03f: aload 0
      // 040: getfield ju8.kfp D
      // 043: aload 0
      // 044: invokevirtual ju8.c5y ()F
      // 047: f2d
      // 048: dadd
      // 049: aload 0
      // 04a: getfield ju8.vbd D
      // 04d: ldc 7.0
      // 04f: nop
      // 050: bipush 0
      // 051: aload 0
      // 052: getfield ju8.oay Lt9d;
      // 055: invokevirtual t9d.eir ()Lef9;
      // 058: sipush 24660
      // 05b: ldc2_w 3292597535438316531
      // 05e: lload 1
      // 05f: lxor
      // 060: invokedynamic w (IJ)Ljava/lang/String; bsm=ju8.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: nop
      // 066: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 069: invokevirtual t9d.dta (Li2h;DDDFZZ)Lvu6;
      // 06c: pop
      // 06d: aload 0
      // 06e: getfield ju8.oay Lt9d;
      // 071: sipush 1013
      // 074: new mew
      // 077: dup
      // 078: aload 0
      // 079: invokespecial mew.<init> (Li2h;)V
      // 07c: bipush 0
      // 07d: invokevirtual t9d.jpe (ILmew;I)V
      // 080: goto 087
      // 083: invokestatic ju8.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: iload 4
      // 08a: invokevirtual ju8.gnw (I)V
      // 08d: aload 0
      // 08e: iload 3
      // 08f: ifne 0a3
      // 092: getfield ju8.g25 I
      // 095: bipush 10
      // 097: irem
      // 098: goto 09f
      // 09b: invokestatic ju8.a (Loov;)Loov;
      // 09e: athrow
      // 09f: ifne 0a9
      // 0a2: aload 0
      // 0a3: ldc 10.0
      // 0a5: nop
      // 0a6: invokevirtual ju8.rwd (F)V
      // 0a9: iload 3
      // 0aa: ifeq 5f1
      // 0ad: aload 0
      // 0ae: invokespecial s0i.qar ()V
      // 0b1: bipush 1
      // 0b2: goto 0b9
      // 0b5: invokestatic ju8.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: istore 4
      // 0bb: iload 4
      // 0bd: bipush 3
      // 0be: if_icmpge 40f
      // 0c1: aload 0
      // 0c2: iload 3
      // 0c3: ifne 109
      // 0c6: getfield ju8.g25 I
      // 0c9: aload 0
      // 0ca: getfield ju8.isk [I
      // 0cd: iload 4
      // 0cf: bipush 1
      // 0d0: isub
      // 0d1: iaload
      // 0d2: iload 3
      // 0d3: ifne 5e8
      // 0d6: goto 0dd
      // 0d9: invokestatic ju8.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: if_icmplt 408
      // 0e0: goto 0e7
      // 0e3: invokestatic ju8.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield ju8.isk [I
      // 0eb: iload 4
      // 0ed: bipush 1
      // 0ee: isub
      // 0ef: aload 0
      // 0f0: getfield ju8.g25 I
      // 0f3: bipush 10
      // 0f5: iadd
      // 0f6: aload 0
      // 0f7: getfield ju8.z2d Ljava/util/Random;
      // 0fa: bipush 10
      // 0fc: invokevirtual java/util/Random.nextInt (I)I
      // 0ff: iadd
      // 100: iastore
      // 101: aload 0
      // 102: goto 109
      // 105: invokestatic ju8.a (Loov;)Loov;
      // 108: athrow
      // 109: getfield ju8.oay Lt9d;
      // 10c: invokevirtual t9d.rbk ()Lv66;
      // 10f: getstatic v66.b_4 Lv66;
      // 112: iload 3
      // 113: ifne 13c
      // 116: if_acmpeq 13f
      // 119: goto 120
      // 11c: invokestatic ju8.a (Loov;)Loov;
      // 11f: athrow
      // 120: aload 0
      // 121: iload 3
      // 122: ifne 1e3
      // 125: goto 12c
      // 128: invokestatic ju8.a (Loov;)Loov;
      // 12b: athrow
      // 12c: getfield ju8.oay Lt9d;
      // 12f: invokevirtual t9d.rbk ()Lv66;
      // 132: getstatic v66.csg Lv66;
      // 135: goto 13c
      // 138: invokestatic ju8.a (Loov;)Loov;
      // 13b: athrow
      // 13c: if_acmpne 1e2
      // 13f: iload 4
      // 141: bipush 1
      // 142: isub
      // 143: istore 5
      // 145: aload 0
      // 146: getfield ju8.zx3 [I
      // 149: iload 4
      // 14b: bipush 1
      // 14c: isub
      // 14d: iaload
      // 14e: istore 6
      // 150: aload 0
      // 151: getfield ju8.zx3 [I
      // 154: iload 5
      // 156: aload 0
      // 157: getfield ju8.zx3 [I
      // 15a: iload 4
      // 15c: bipush 1
      // 15d: isub
      // 15e: iaload
      // 15f: bipush 1
      // 160: iadd
      // 161: iastore
      // 162: iload 6
      // 164: iload 3
      // 165: ifne 1ec
      // 168: bipush 15
      // 16a: if_icmple 1e2
      // 16d: goto 174
      // 170: invokestatic ju8.a (Loov;)Loov;
      // 173: athrow
      // 174: ldc 10.0
      // 176: nop
      // 177: fstore 7
      // 179: ldc 5.0
      // 17b: nop
      // 17c: fstore 8
      // 17e: aload 0
      // 17f: getfield ju8.z2d Ljava/util/Random;
      // 182: aload 0
      // 183: getfield ju8.o2v D
      // 186: fload 7
      // 188: f2d
      // 189: dsub
      // 18a: aload 0
      // 18b: getfield ju8.o2v D
      // 18e: fload 7
      // 190: f2d
      // 191: dadd
      // 192: invokestatic fe6.x16 (Ljava/util/Random;DD)D
      // 195: dstore 9
      // 197: aload 0
      // 198: getfield ju8.z2d Ljava/util/Random;
      // 19b: aload 0
      // 19c: getfield ju8.kfp D
      // 19f: fload 8
      // 1a1: f2d
      // 1a2: dsub
      // 1a3: aload 0
      // 1a4: getfield ju8.kfp D
      // 1a7: fload 8
      // 1a9: f2d
      // 1aa: dadd
      // 1ab: invokestatic fe6.x16 (Ljava/util/Random;DD)D
      // 1ae: dstore 11
      // 1b0: aload 0
      // 1b1: getfield ju8.z2d Ljava/util/Random;
      // 1b4: aload 0
      // 1b5: getfield ju8.vbd D
      // 1b8: fload 7
      // 1ba: f2d
      // 1bb: dsub
      // 1bc: aload 0
      // 1bd: getfield ju8.vbd D
      // 1c0: fload 7
      // 1c2: f2d
      // 1c3: dadd
      // 1c4: invokestatic fe6.x16 (Ljava/util/Random;DD)D
      // 1c7: dstore 13
      // 1c9: aload 0
      // 1ca: iload 4
      // 1cc: bipush 1
      // 1cd: iadd
      // 1ce: dload 9
      // 1d0: dload 11
      // 1d2: dload 13
      // 1d4: bipush 1
      // 1d5: invokespecial ju8.p4g (IDDDZ)V
      // 1d8: aload 0
      // 1d9: getfield ju8.zx3 [I
      // 1dc: iload 4
      // 1de: bipush 1
      // 1df: isub
      // 1e0: bipush 0
      // 1e1: iastore
      // 1e2: aload 0
      // 1e3: iload 4
      // 1e5: invokevirtual ju8.efr (I)I
      // 1e8: istore 5
      // 1ea: iload 5
      // 1ec: ifle 2e6
      // 1ef: aload 0
      // 1f0: getfield ju8.oay Lt9d;
      // 1f3: iload 5
      // 1f5: invokevirtual t9d.oks (I)Li2h;
      // 1f8: astore 6
      // 1fa: aload 6
      // 1fc: iload 3
      // 1fd: ifne 20c
      // 200: ifnull 2d4
      // 203: goto 20a
      // 206: invokestatic ju8.a (Loov;)Loov;
      // 209: athrow
      // 20a: aload 6
      // 20c: invokevirtual i2h.gzr ()Z
      // 20f: iload 3
      // 210: ifne 239
      // 213: ifeq 2d4
      // 216: goto 21d
      // 219: invokestatic ju8.a (Loov;)Loov;
      // 21c: athrow
      // 21d: aload 0
      // 21e: iload 3
      // 21f: ifne 2dc
      // 222: goto 229
      // 225: invokestatic ju8.a (Loov;)Loov;
      // 228: athrow
      // 229: aload 6
      // 22b: invokevirtual ju8.wxg (Li2h;)D
      // 22e: ldc2_w 900.0
      // 231: dcmpg
      // 232: goto 239
      // 235: invokestatic ju8.a (Loov;)Loov;
      // 238: athrow
      // 239: ifgt 2d4
      // 23c: aload 0
      // 23d: iload 3
      // 23e: ifne 2dc
      // 241: goto 248
      // 244: invokestatic ju8.a (Loov;)Loov;
      // 247: athrow
      // 248: aload 6
      // 24a: invokevirtual ju8.gq6 (Li2h;)Z
      // 24d: ifeq 2d4
      // 250: goto 257
      // 253: invokestatic ju8.a (Loov;)Loov;
      // 256: athrow
      // 257: aload 6
      // 259: instanceof ha9
      // 25c: iload 3
      // 25d: ifne 283
      // 260: goto 267
      // 263: invokestatic ju8.a (Loov;)Loov;
      // 266: athrow
      // 267: ifeq 298
      // 26a: goto 271
      // 26d: invokestatic ju8.a (Loov;)Loov;
      // 270: athrow
      // 271: aload 6
      // 273: checkcast ha9
      // 276: getfield ha9.lls Lpj2;
      // 279: getfield pj2.lez Z
      // 27c: goto 283
      // 27f: invokestatic ju8.a (Loov;)Loov;
      // 282: athrow
      // 283: ifeq 298
      // 286: aload 0
      // 287: iload 4
      // 289: bipush 0
      // 28a: invokevirtual ju8.ynt (II)V
      // 28d: iload 3
      // 28e: ifeq 2e2
      // 291: goto 298
      // 294: invokestatic ju8.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 0
      // 299: iload 4
      // 29b: bipush 1
      // 29c: iadd
      // 29d: aload 6
      // 29f: checkcast g_3
      // 2a2: invokespecial ju8.m30 (ILg_3;)V
      // 2a5: aload 0
      // 2a6: getfield ju8.isk [I
      // 2a9: iload 4
      // 2ab: bipush 1
      // 2ac: isub
      // 2ad: aload 0
      // 2ae: getfield ju8.g25 I
      // 2b1: bipush 40
      // 2b3: iadd
      // 2b4: aload 0
      // 2b5: getfield ju8.z2d Ljava/util/Random;
      // 2b8: bipush 20
      // 2ba: invokevirtual java/util/Random.nextInt (I)I
      // 2bd: iadd
      // 2be: iastore
      // 2bf: aload 0
      // 2c0: getfield ju8.zx3 [I
      // 2c3: iload 4
      // 2c5: bipush 1
      // 2c6: isub
      // 2c7: bipush 0
      // 2c8: iastore
      // 2c9: iload 3
      // 2ca: ifeq 2e2
      // 2cd: goto 2d4
      // 2d0: invokestatic ju8.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: aload 0
      // 2d5: goto 2dc
      // 2d8: invokestatic ju8.a (Loov;)Loov;
      // 2db: athrow
      // 2dc: iload 4
      // 2de: bipush 0
      // 2df: invokevirtual ju8.ynt (II)V
      // 2e2: iload 3
      // 2e3: ifeq 408
      // 2e6: aload 0
      // 2e7: getfield ju8.oay Lt9d;
      // 2ea: ldc g_3
      // 2ec: nop
      // 2ed: aload 0
      // 2ee: invokevirtual ju8.aaw ()Lnh4;
      // 2f1: ldc2_w 20.0
      // 2f4: ldc2_w 8.0
      // 2f7: ldc2_w 20.0
      // 2fa: invokevirtual nh4.c2h (DDD)Lnh4;
      // 2fd: getstatic ju8.y4x Lcom/google/common/base/Predicate;
      // 300: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 303: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 306: invokevirtual t9d.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 309: astore 6
      // 30b: bipush 0
      // 30c: istore 7
      // 30e: iload 7
      // 310: bipush 10
      // 312: if_icmpge 408
      // 315: aload 6
      // 317: iload 3
      // 318: ifne 34a
      // 31b: invokeinterface java/util/List.isEmpty ()Z 1
      // 320: iload 3
      // 321: ifne 0bd
      // 324: goto 32b
      // 327: invokestatic ju8.a (Loov;)Loov;
      // 32a: athrow
      // 32b: ifne 408
      // 32e: aload 6
      // 330: aload 0
      // 331: getfield ju8.z2d Ljava/util/Random;
      // 334: aload 6
      // 336: invokeinterface java/util/List.size ()I 1
      // 33b: invokevirtual java/util/Random.nextInt (I)I
      // 33e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 343: goto 34a
      // 346: invokestatic ju8.a (Loov;)Loov;
      // 349: athrow
      // 34a: checkcast g_3
      // 34d: astore 8
      // 34f: iload 3
      // 350: ifne 404
      // 353: aload 8
      // 355: aload 0
      // 356: if_acmpeq 3f0
      // 359: goto 360
      // 35c: invokestatic ju8.a (Loov;)Loov;
      // 35f: athrow
      // 360: aload 8
      // 362: invokevirtual g_3.gzr ()Z
      // 365: iload 3
      // 366: ifne 400
      // 369: goto 370
      // 36c: invokestatic ju8.a (Loov;)Loov;
      // 36f: athrow
      // 370: ifeq 3f0
      // 373: goto 37a
      // 376: invokestatic ju8.a (Loov;)Loov;
      // 379: athrow
      // 37a: aload 0
      // 37b: aload 8
      // 37d: invokevirtual ju8.gq6 (Li2h;)Z
      // 380: iload 3
      // 381: ifne 400
      // 384: goto 38b
      // 387: invokestatic ju8.a (Loov;)Loov;
      // 38a: athrow
      // 38b: ifeq 3f0
      // 38e: goto 395
      // 391: invokestatic ju8.a (Loov;)Loov;
      // 394: athrow
      // 395: aload 8
      // 397: instanceof ha9
      // 39a: iload 3
      // 39b: ifne 3c1
      // 39e: goto 3a5
      // 3a1: invokestatic ju8.a (Loov;)Loov;
      // 3a4: athrow
      // 3a5: ifeq 3da
      // 3a8: goto 3af
      // 3ab: invokestatic ju8.a (Loov;)Loov;
      // 3ae: athrow
      // 3af: aload 8
      // 3b1: checkcast ha9
      // 3b4: getfield ha9.lls Lpj2;
      // 3b7: getfield pj2.lez Z
      // 3ba: goto 3c1
      // 3bd: invokestatic ju8.a (Loov;)Loov;
      // 3c0: athrow
      // 3c1: ifne 408
      // 3c4: aload 0
      // 3c5: iload 4
      // 3c7: aload 8
      // 3c9: invokevirtual g_3.jwu ()I
      // 3cc: invokevirtual ju8.ynt (II)V
      // 3cf: iload 3
      // 3d0: ifeq 408
      // 3d3: goto 3da
      // 3d6: invokestatic ju8.a (Loov;)Loov;
      // 3d9: athrow
      // 3da: aload 0
      // 3db: iload 4
      // 3dd: aload 8
      // 3df: invokevirtual g_3.jwu ()I
      // 3e2: invokevirtual ju8.ynt (II)V
      // 3e5: iload 3
      // 3e6: ifeq 408
      // 3e9: goto 3f0
      // 3ec: invokestatic ju8.a (Loov;)Loov;
      // 3ef: athrow
      // 3f0: aload 6
      // 3f2: aload 8
      // 3f4: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 3f9: goto 400
      // 3fc: invokestatic ju8.a (Loov;)Loov;
      // 3ff: athrow
      // 400: pop
      // 401: iinc 7 1
      // 404: iload 3
      // 405: ifeq 30e
      // 408: iinc 4 1
      // 40b: iload 3
      // 40c: ifeq 0bb
      // 40f: aload 0
      // 410: iload 3
      // 411: ifne 440
      // 414: invokevirtual ju8.q4v ()Lg_3;
      // 417: ifnull 438
      // 41a: goto 421
      // 41d: invokestatic ju8.a (Loov;)Loov;
      // 420: athrow
      // 421: aload 0
      // 422: bipush 0
      // 423: aload 0
      // 424: invokevirtual ju8.q4v ()Lg_3;
      // 427: invokevirtual g_3.jwu ()I
      // 42a: invokevirtual ju8.ynt (II)V
      // 42d: iload 3
      // 42e: ifeq 445
      // 431: goto 438
      // 434: invokestatic ju8.a (Loov;)Loov;
      // 437: athrow
      // 438: aload 0
      // 439: goto 440
      // 43c: invokestatic ju8.a (Loov;)Loov;
      // 43f: athrow
      // 440: bipush 0
      // 441: bipush 0
      // 442: invokevirtual ju8.ynt (II)V
      // 445: aload 0
      // 446: getfield ju8.nal I
      // 449: iload 3
      // 44a: ifne 5e9
      // 44d: ifle 5d7
      // 450: goto 457
      // 453: invokestatic ju8.a (Loov;)Loov;
      // 456: athrow
      // 457: aload 0
      // 458: dup
      // 459: getfield ju8.nal I
      // 45c: bipush 1
      // 45d: isub
      // 45e: putfield ju8.nal I
      // 461: aload 0
      // 462: getfield ju8.nal I
      // 465: iload 3
      // 466: ifne 5e9
      // 469: goto 470
      // 46c: invokestatic ju8.a (Loov;)Loov;
      // 46f: athrow
      // 470: ifne 5d7
      // 473: goto 47a
      // 476: invokestatic ju8.a (Loov;)Loov;
      // 479: athrow
      // 47a: aload 0
      // 47b: getfield ju8.oay Lt9d;
      // 47e: invokevirtual t9d.eir ()Lef9;
      // 481: sipush 24151
      // 484: ldc2_w 8145447793152957938
      // 487: lload 1
      // 488: lxor
      // 489: invokedynamic w (IJ)Ljava/lang/String; bsm=ju8.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48e: nop
      // 48f: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 492: iload 3
      // 493: ifne 5e9
      // 496: goto 49d
      // 499: invokestatic ju8.a (Loov;)Loov;
      // 49c: athrow
      // 49d: ifeq 5d7
      // 4a0: goto 4a7
      // 4a3: invokestatic ju8.a (Loov;)Loov;
      // 4a6: athrow
      // 4a7: aload 0
      // 4a8: getfield ju8.kfp D
      // 4ab: invokestatic fe6.jqf (D)I
      // 4ae: istore 4
      // 4b0: aload 0
      // 4b1: getfield ju8.o2v D
      // 4b4: invokestatic fe6.jqf (D)I
      // 4b7: istore 5
      // 4b9: aload 0
      // 4ba: getfield ju8.vbd D
      // 4bd: invokestatic fe6.jqf (D)I
      // 4c0: istore 6
      // 4c2: bipush 0
      // 4c3: istore 7
      // 4c5: bipush -1
      // 4c6: istore 8
      // 4c8: iload 8
      // 4ca: bipush 1
      // 4cb: if_icmpgt 5a9
      // 4ce: bipush -1
      // 4cf: iload 3
      // 4d0: ifne 5ab
      // 4d3: istore 9
      // 4d5: iload 9
      // 4d7: bipush 1
      // 4d8: if_icmpgt 5a2
      // 4db: bipush 0
      // 4dc: iload 3
      // 4dd: ifne 4ca
      // 4e0: istore 10
      // 4e2: iload 10
      // 4e4: bipush 3
      // 4e5: if_icmpgt 59b
      // 4e8: iload 5
      // 4ea: iload 8
      // 4ec: iadd
      // 4ed: istore 11
      // 4ef: iload 4
      // 4f1: iload 10
      // 4f3: iadd
      // 4f4: istore 12
      // 4f6: iload 6
      // 4f8: iload 9
      // 4fa: iadd
      // 4fb: istore 13
      // 4fd: new mew
      // 500: dup
      // 501: iload 11
      // 503: iload 12
      // 505: iload 13
      // 507: invokespecial mew.<init> (III)V
      // 50a: astore 14
      // 50c: aload 0
      // 50d: getfield ju8.oay Lt9d;
      // 510: aload 14
      // 512: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 515: invokeinterface zfz.r_y ()Le0x; 1
      // 51a: astore 15
      // 51c: iload 3
      // 51d: ifne 59e
      // 520: iload 3
      // 521: ifne 597
      // 524: goto 52b
      // 527: invokestatic ju8.a (Loov;)Loov;
      // 52a: athrow
      // 52b: aload 15
      // 52d: invokevirtual e0x.p1r ()Lp3y;
      // 530: getstatic p3y.cei Lp3y;
      // 533: if_acmpeq 594
      // 536: goto 53d
      // 539: invokestatic ju8.a (Loov;)Loov;
      // 53c: athrow
      // 53d: aload 15
      // 53f: invokestatic ju8.wo1 (Le0x;)Z
      // 542: iload 3
      // 543: ifne 568
      // 546: goto 54d
      // 549: invokestatic ju8.a (Loov;)Loov;
      // 54c: athrow
      // 54d: ifeq 594
      // 550: goto 557
      // 553: invokestatic ju8.a (Loov;)Loov;
      // 556: athrow
      // 557: aload 0
      // 558: getfield ju8.oay Lt9d;
      // 55b: aload 14
      // 55d: bipush 1
      // 55e: invokevirtual t9d.yir (Lmew;Z)Z
      // 561: goto 568
      // 564: invokestatic ju8.a (Loov;)Loov;
      // 567: athrow
      // 568: iload 3
      // 569: ifne 58e
      // 56c: ifne 58d
      // 56f: goto 576
      // 572: invokestatic ju8.a (Loov;)Loov;
      // 575: athrow
      // 576: iload 7
      // 578: iload 3
      // 579: ifne 58e
      // 57c: goto 583
      // 57f: invokestatic ju8.a (Loov;)Loov;
      // 582: athrow
      // 583: ifeq 591
      // 586: goto 58d
      // 589: invokestatic ju8.a (Loov;)Loov;
      // 58c: athrow
      // 58d: bipush 1
      // 58e: goto 592
      // 591: bipush 0
      // 592: istore 7
      // 594: iinc 10 1
      // 597: iload 3
      // 598: ifeq 4e2
      // 59b: iinc 9 1
      // 59e: iload 3
      // 59f: ifeq 4d5
      // 5a2: iinc 8 1
      // 5a5: iload 3
      // 5a6: ifeq 4c8
      // 5a9: iload 7
      // 5ab: iload 3
      // 5ac: ifne 5e9
      // 5af: ifeq 5d7
      // 5b2: goto 5b9
      // 5b5: invokestatic ju8.a (Loov;)Loov;
      // 5b8: athrow
      // 5b9: aload 0
      // 5ba: getfield ju8.oay Lt9d;
      // 5bd: aconst_null
      // 5be: checkcast ha9
      // 5c1: sipush 1012
      // 5c4: new mew
      // 5c7: dup
      // 5c8: aload 0
      // 5c9: invokespecial mew.<init> (Li2h;)V
      // 5cc: bipush 0
      // 5cd: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 5d0: goto 5d7
      // 5d3: invokestatic ju8.a (Loov;)Loov;
      // 5d6: athrow
      // 5d7: aload 0
      // 5d8: iload 3
      // 5d9: ifne 5ed
      // 5dc: getfield ju8.g25 I
      // 5df: bipush 20
      // 5e1: goto 5e8
      // 5e4: invokestatic ju8.a (Loov;)Loov;
      // 5e7: athrow
      // 5e8: irem
      // 5e9: ifne 5f1
      // 5ec: aload 0
      // 5ed: fconst_1
      // 5ee: invokevirtual ju8.rwd (F)V
      // 5f1: return
   }

   public static boolean wo1(e0x param0) {
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
      // 05: getstatic ox_.n6z Le0x;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: if_acmpeq 77
      // 0f: goto 16
      // 12: invokestatic ju8.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic ox_.ce3 Le0x;
      // 1a: goto 21
      // 1d: invokestatic ju8.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 3a
      // 25: if_acmpeq 77
      // 28: goto 2f
      // 2b: invokestatic ju8.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getstatic ox_.e0w Le0x;
      // 33: goto 3a
      // 36: invokestatic ju8.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 1
      // 3b: ifeq 53
      // 3e: if_acmpeq 77
      // 41: goto 48
      // 44: invokestatic ju8.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getstatic ox_.pol Le0x;
      // 4c: goto 53
      // 4f: invokestatic ju8.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 1
      // 54: ifeq 6c
      // 57: if_acmpeq 77
      // 5a: goto 61
      // 5d: invokestatic ju8.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: getstatic ox_.c28 Le0x;
      // 65: goto 6c
      // 68: invokestatic ju8.a (Loov;)Loov;
      // 6b: athrow
      // 6c: if_acmpeq 77
      // 6f: bipush 1
      // 70: goto 78
      // 73: invokestatic ju8.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 0
      // 78: ireturn
   }

   public void jc1() {
      this.gnw(220);
      this.uh3(this.axb() / 3.0F);
   }

   @Override
   public void wx3() {
   }

   @Override
   public int y5z() {
      return 4;
   }

   private double n_6(int var1) {
      try {
         if (var1 <= 0) {
            return this.o2v;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      float var2 = (this.ksw + (float)(180 * (var1 - 1))) / 180.0F * (float) Math.PI;
      float var3 = fe6.ssk(var2);
      return this.o2v + (double)var3 * 1.3;
   }

   private double rc_(int var1) {
      try {
         if (var1 <= 0) {
            return this.kfp + 3.0;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return this.kfp + 2.2;
   }

   private double tl1(int var1) {
      try {
         if (var1 <= 0) {
            return this.vbd;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      float var2 = (this.ksw + (float)(180 * (var1 - 1))) / 180.0F * (float) Math.PI;
      float var3 = fe6.rtn(var2);
      return this.vbd + (double)var3 * 1.3;
   }

   private float i2k(float var1, float var2, float var3) {
      int var4 = t9d.b();
      float var5 = fe6.qsy(var2 - var1);

      int var10000;
      label34: {
         label33: {
            try {
               float var9;
               var10000 = (var9 = var5 - var3) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               if (var4 == 0) {
                  break label34;
               }

               if (var10000 <= 0) {
                  break label33;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var5 = var3;
         }

         try {
            float var10001 = -var3;
            if (var4 == 0) {
               return var5 + var10001;
            }

            float var10;
            var10000 = (var10 = var5 - var10001) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         } catch (oov var6) {
            throw a(var6);
         }
      }

      if (var10000 < 0) {
         var5 = -var3;
      }

      return var1 + var5;
   }

   private void m30(int param1, g_3 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: aload 2
      // 07: getfield g_3.o2v D
      // 0a: aload 2
      // 0b: getfield g_3.kfp D
      // 0e: aload 2
      // 0f: invokevirtual g_3.c5y ()F
      // 12: f2d
      // 13: ldc2_w 0.5
      // 16: dmul
      // 17: dadd
      // 18: aload 2
      // 19: getfield g_3.vbd D
      // 1c: iload 1
      // 1d: iload 3
      // 1e: ifne 3d
      // 21: ifne 4f
      // 24: goto 2b
      // 27: invokestatic ju8.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield ju8.z2d Ljava/util/Random;
      // 2f: invokevirtual java/util/Random.nextFloat ()F
      // 32: ldc 0.001
      // 34: nop
      // 35: fcmpg
      // 36: goto 3d
      // 39: invokestatic ju8.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 3
      // 3e: ifne 4c
      // 41: ifge 4f
      // 44: goto 4b
      // 47: invokestatic ju8.a (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: invokespecial ju8.p4g (IDDDZ)V
      // 53: return
   }

   private void p4g(int param1, double param2, double param4, double param6, boolean param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield ju8.oay Lt9d;
      // 04: aconst_null
      // 05: checkcast ha9
      // 08: sipush 1014
      // 0b: new mew
      // 0e: dup
      // 0f: aload 0
      // 10: invokespecial mew.<init> (Li2h;)V
      // 13: bipush 0
      // 14: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 17: invokestatic t9d.b ()I
      // 1a: aload 0
      // 1b: iload 1
      // 1c: invokespecial ju8.n_6 (I)D
      // 1f: dstore 10
      // 21: istore 9
      // 23: aload 0
      // 24: iload 1
      // 25: invokespecial ju8.rc_ (I)D
      // 28: dstore 12
      // 2a: aload 0
      // 2b: iload 1
      // 2c: invokespecial ju8.tl1 (I)D
      // 2f: dstore 14
      // 31: dload 2
      // 32: dload 10
      // 34: dsub
      // 35: dstore 16
      // 37: dload 4
      // 39: dload 12
      // 3b: dsub
      // 3c: dstore 18
      // 3e: dload 6
      // 40: dload 14
      // 42: dsub
      // 43: dstore 20
      // 45: new k7p
      // 48: dup
      // 49: aload 0
      // 4a: getfield ju8.oay Lt9d;
      // 4d: aload 0
      // 4e: dload 16
      // 50: dload 18
      // 52: dload 20
      // 54: invokespecial k7p.<init> (Lt9d;Lg_3;DDD)V
      // 57: astore 22
      // 59: iload 8
      // 5b: iload 9
      // 5d: ifeq 95
      // 60: ifeq 77
      // 63: goto 6a
      // 66: invokestatic ju8.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 22
      // 6c: bipush 1
      // 6d: invokevirtual k7p.fuq (Z)V
      // 70: goto 77
      // 73: invokestatic ju8.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 22
      // 79: dload 12
      // 7b: putfield k7p.kfp D
      // 7e: aload 22
      // 80: dload 10
      // 82: putfield k7p.o2v D
      // 85: aload 22
      // 87: dload 14
      // 89: putfield k7p.vbd D
      // 8c: aload 0
      // 8d: getfield ju8.oay Lt9d;
      // 90: aload 22
      // 92: invokevirtual t9d.xzq (Li2h;)Z
      // 95: pop
      // 96: return
   }

   @Override
   public void mx4(g_3 var1, float var2) {
      this.m30(0, var1);
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual ju8.nss (Lofh;)Z
      // 009: iload 3
      // 00a: ifne 018
      // 00d: ifeq 019
      // 010: goto 017
      // 013: invokestatic ju8.a (Loov;)Loov;
      // 016: athrow
      // 017: bipush 0
      // 018: ireturn
      // 019: aload 1
      // 01a: iload 3
      // 01b: ifne 033
      // 01e: getstatic ofh.e7v Lofh;
      // 021: if_acmpeq 154
      // 024: goto 02b
      // 027: invokestatic ju8.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 1
      // 02c: goto 033
      // 02f: invokestatic ju8.a (Loov;)Loov;
      // 032: athrow
      // 033: invokevirtual ofh.nra ()Li2h;
      // 036: instanceof ju8
      // 039: iload 3
      // 03a: ifne 155
      // 03d: ifne 154
      // 040: goto 047
      // 043: invokestatic ju8.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: invokevirtual ju8.vhe ()I
      // 04b: iload 3
      // 04c: ifne 083
      // 04f: goto 056
      // 052: invokestatic ju8.a (Loov;)Loov;
      // 055: athrow
      // 056: ifle 074
      // 059: goto 060
      // 05c: invokestatic ju8.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 1
      // 061: getstatic ofh.r2b Lofh;
      // 064: if_acmpeq 074
      // 067: goto 06e
      // 06a: invokestatic ju8.a (Loov;)Loov;
      // 06d: athrow
      // 06e: bipush 0
      // 06f: ireturn
      // 070: invokestatic ju8.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: iload 3
      // 076: ifne 0a9
      // 079: invokevirtual ju8.kvl ()Z
      // 07c: goto 083
      // 07f: invokestatic ju8.a (Loov;)Loov;
      // 082: athrow
      // 083: ifeq 0a5
      // 086: aload 1
      // 087: invokevirtual ofh.f8d ()Li2h;
      // 08a: astore 4
      // 08c: aload 4
      // 08e: iload 3
      // 08f: ifne 0ad
      // 092: instanceof hy9
      // 095: ifeq 0a5
      // 098: goto 09f
      // 09b: invokestatic ju8.a (Loov;)Loov;
      // 09e: athrow
      // 09f: bipush 0
      // 0a0: ireturn
      // 0a1: invokestatic ju8.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 1
      // 0a6: invokevirtual ofh.nra ()Li2h;
      // 0a9: astore 4
      // 0ab: aload 4
      // 0ad: iload 3
      // 0ae: ifne 0bd
      // 0b1: ifnull 104
      // 0b4: goto 0bb
      // 0b7: invokestatic ju8.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 4
      // 0bd: instanceof ha9
      // 0c0: iload 3
      // 0c1: ifne 108
      // 0c4: ifne 104
      // 0c7: goto 0ce
      // 0ca: invokestatic ju8.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 4
      // 0d0: instanceof g_3
      // 0d3: iload 3
      // 0d4: ifne 108
      // 0d7: goto 0de
      // 0da: invokestatic ju8.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: ifeq 104
      // 0e1: goto 0e8
      // 0e4: invokestatic ju8.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 4
      // 0ea: checkcast g_3
      // 0ed: invokevirtual g_3.fhc ()Ln1e;
      // 0f0: aload 0
      // 0f1: invokevirtual ju8.fhc ()Ln1e;
      // 0f4: if_acmpne 104
      // 0f7: goto 0fe
      // 0fa: invokestatic ju8.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: bipush 0
      // 0ff: ireturn
      // 100: invokestatic ju8.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: getfield ju8.nal I
      // 108: iload 3
      // 109: ifne 124
      // 10c: ifgt 123
      // 10f: goto 116
      // 112: invokestatic ju8.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: bipush 20
      // 119: putfield ju8.nal I
      // 11c: goto 123
      // 11f: invokestatic ju8.a (Loov;)Loov;
      // 122: athrow
      // 123: bipush 0
      // 124: istore 5
      // 126: iload 5
      // 128: aload 0
      // 129: getfield ju8.zx3 [I
      // 12c: arraylength
      // 12d: if_icmpge 14d
      // 130: aload 0
      // 131: iload 3
      // 132: ifne 14e
      // 135: getfield ju8.zx3 [I
      // 138: iload 5
      // 13a: dup2
      // 13b: iaload
      // 13c: bipush 3
      // 13d: iadd
      // 13e: iastore
      // 13f: iinc 5 1
      // 142: iload 3
      // 143: ifeq 126
      // 146: goto 14d
      // 149: invokestatic ju8.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: aload 1
      // 14f: fload 2
      // 150: invokespecial s0i.m1t (Lofh;F)Z
      // 153: ireturn
      // 154: bipush 0
      // 155: ireturn
   }

   @Override
   public void ir3(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getstatic xbr.ctl Lu7m;
      // 08: bipush 1
      // 09: invokevirtual ju8.e70 (Lu7m;I)Lnvf;
      // 0c: astore 4
      // 0e: aload 4
      // 10: iload 3
      // 11: ifeq 20
      // 14: ifnull 23
      // 17: goto 1e
      // 1a: invokestatic ju8.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 4
      // 20: invokevirtual nvf.moh ()V
      // 23: aload 0
      // 24: getfield ju8.oay Lt9d;
      // 27: iload 3
      // 28: ifeq 43
      // 2b: getfield t9d.v0f Z
      // 2e: ifne 82
      // 31: goto 38
      // 34: invokestatic ju8.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield ju8.oay Lt9d;
      // 3c: goto 43
      // 3f: invokestatic ju8.a (Loov;)Loov;
      // 42: athrow
      // 43: ldc ha9
      // 45: nop
      // 46: aload 0
      // 47: invokevirtual ju8.aaw ()Lnh4;
      // 4a: ldc2_w 50.0
      // 4d: ldc2_w 100.0
      // 50: ldc2_w 50.0
      // 53: invokevirtual nh4.c2h (DDD)Lnh4;
      // 56: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 59: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5e: astore 5
      // 60: aload 5
      // 62: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 67: ifeq 82
      // 6a: aload 5
      // 6c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 71: checkcast ha9
      // 74: astore 6
      // 76: aload 6
      // 78: getstatic y8d.cv6 Ll7l;
      // 7b: invokevirtual ha9.aex (L_ss;)V
      // 7e: iload 3
      // 7f: ifne 60
      // 82: return
   }

   @Override
   public void oqm() {
      this.dof = 0;
   }

   @Override
   public int azk(float var1) {
      return 15728880;
   }

   @Override
   public void ibc(float var1, float var2) {
   }

   @Override
   public void gmn(sdj var1) {
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(300.0);
      this.dgt(m6d.w7i).zf7(0.6F);
      this.dgt(m6d.wg4).zf7(40.0);
   }

   public float qpw(int var1) {
      return this.em1[var1];
   }

   public float mu2(int var1) {
      return this.o06[var1];
   }

   public int vhe() {
      return this.oit.zwc(20);
   }

   public void gnw(int var1) {
      this.oit.c66(20, var1);
   }

   public int efr(int var1) {
      return this.oit.zwc(17 + var1);
   }

   public void ynt(int var1, int var2) {
      this.oit.c66(17 + var1, var2);
   }

   public boolean kvl() {
      int var1 = t9d.c();

      try {
         float var3;
         int var10000 = (var3 = this.i55() - this.axb() / 2.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public n1e fhc() {
      return n1e.via;
   }

   @Override
   public void nw9(i2h var1) {
      this.hzp = null;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6506177006560512429L, -3606214940693625560L, MethodHandles.lookup().lookupClass()).a(144620165099090L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 18988254175320L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "¤Uø¶²Ws¿T`ô\u001bö\u0015ð&Ö\u0093é.à(í³¿?(ÃS°¨ä(ø\u0001;³\u000fw²êÍIrÀÂ|k7\u0091\u0014\u0093[2ÇµÜü/l,\u0017A\f¦W%v»i\u0005æD ô\rò¤nÖ~+d\u001e\u0084\u00930\u0013¬×0l\u0016Ù\u008b<aÜ'\u0005\u0080·R¬!Ì\u0010à\u009dq¹èKÔ\u0099ñGÐ¸\u0012ÏåÀ `å\u001cR\u0093¼\u0006\bTÁ\u008e\u0087)\u0094¾?\u008c\u009c\u001cª\u0092G\u0083\u001e×\u0002\u009d³riø\u009c";
      int var8 = "¤Uø¶²Ws¿T`ô\u001bö\u0015ð&Ö\u0093é.à(í³¿?(ÃS°¨ä(ø\u0001;³\u000fw²êÍIrÀÂ|k7\u0091\u0014\u0093[2ÇµÜü/l,\u0017A\f¦W%v»i\u0005æD ô\rò¤nÖ~+d\u001e\u0084\u00930\u0013¬×0l\u0016Ù\u008b<aÜ'\u0005\u0080·R¬!Ì\u0010à\u009dq¹èKÔ\u0099ñGÐ¸\u0012ÏåÀ `å\u001cR\u0093¼\u0006\bTÁ\u008e\u0087)\u0094¾?\u008c\u009c\u001cª\u0092G\u0083\u001e×\u0002\u009d³riø\u009c"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     u = new String[7];
                     y4x = new ju8$1();
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

                  var6 = "\u0095¢\u0095åV\u000f\u008d©AÒÓÏ-\u0095|ôµGË<vL²7\u0005\u007f\u009c*\u007fü§\u0005\u0010\u0012&\u0092u¢6\u0087\u0083\u0085-Ë\u0083Ü^F\u000f";
                  var8 = "\u0095¢\u0095åV\u000f\u008d©AÒÓÏ-\u0095|ôµGË<vL²7\u0005\u007f\u009c*\u007fü§\u0005\u0010\u0012&\u0092u¢6\u0087\u0083\u0085-Ë\u0083Ü^F\u000f"
                     .length();
                  var5 = ' ';
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

   private static String f(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11662;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ju8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         u[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("ju8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
