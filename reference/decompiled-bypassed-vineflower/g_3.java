import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class g_3 extends i2h {
   private static final UUID dmv;
   private static final xk5 mo6;
   private osd kpa;
   private final w0s sgr = new w0s(this);
   private final Map mwt = Maps.newHashMap();
   private final erg[] wjy = new erg[5];
   public boolean prr;
   public int aw1;
   public int zni;
   public int gx0;
   public int x_3;
   public float rth;
   public int qur;
   public float laq;
   public float sti;
   public float p1w;
   public float zzf;
   public float pcb;
   public int g9w = 20;
   public float vz1;
   public float sep;
   public float aks;
   public float t3c;
   public float ksw;
   public float gsh;
   public float q6c;
   public float h82;
   public float _ge = 0.02F;
   public ha9 mxp;
   public int gig;
   public boolean pv7;
   public int dof;
   public float hdw;
   public float zt3;
   public float z35;
   public float t2t;
   public float zwr;
   public int yv8;
   public float g0x;
   public boolean e1f;
   public float z66;
   public float ooc;
   public float czx;
   public int a1q;
   public double sz4;
   public double _y0;
   public double hb4;
   public double e7t;
   public double bxw;
   private boolean f5u = true;
   private g_3 _7v;
   private int kqj;
   private g_3 ihk;
   private int yru;
   private float poe;
   private int vwx;
   private float a0f;
   public float za0 = -1.0F;
   private static String[] b;
   private static final long e;
   private static final String[] m;
   private static final String[] n;
   private static final Map o = new HashMap(13);

   @Override
   public void aqu() {
      this.m1t(ofh.r2b, Float.MAX_VALUE);
   }

   public g_3(t9d var1) {
      super(var1);
      this.nyy();
      this.uh3(this.axb());
      this.gz8 = true;
      this.t3c = (float)((Math.random() + 1.0) * 0.01F);
      this.m6_(this.o2v, this.kfp, this.vbd);
      this.aks = (float)Math.random() * 12398.0F;
      this.x5k = (float)(Math.random() * Math.PI * 2.0);
      this.q6c = this.x5k;
      this.nr7 = 0.6F;
   }

   public boolean z_9(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: invokestatic c05.vz1 ()Lc05;
      // 07: getfield c05.tij Lkh3;
      // 0a: aload 0
      // 0b: aload 0
      // 0c: invokevirtual g_3.aaw ()Lnh4;
      // 0f: dconst_0
      // 10: dload 1
      // 11: dneg
      // 12: dconst_0
      // 13: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 16: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 19: invokeinterface java/util/List.isEmpty ()Z 1
      // 1e: iload 3
      // 1f: ifne 33
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic g_3.c (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
      // 2e: invokestatic g_3.c (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   @Override
   public void tbj() {
      this.oit.kp2(7, 0);
      this.oit.kp2(8, (byte)0);
      this.oit.kp2(9, (byte)0);
      this.oit.kp2(6, 1.0F);
   }

   public void nyy() {
      this.s_a().ylc(m6d.t9k);
      this.s_a().ylc(m6d.nen);
      this.s_a().ylc(m6d.w7i);
   }

   @Override
   public void ihp(double param1, boolean param3, e0x param4, mew param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 6
      // 005: aload 0
      // 006: invokevirtual g_3.mwv ()Z
      // 009: iload 6
      // 00b: ifne 037
      // 00e: ifne 024
      // 011: goto 018
      // 014: invokestatic g_3.c (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: invokevirtual g_3.r24 ()Z
      // 01c: pop
      // 01d: goto 024
      // 020: invokestatic g_3.c (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: iload 6
      // 027: ifne 0ff
      // 02a: getfield g_3.oay Lt9d;
      // 02d: getfield t9d.v0f Z
      // 030: goto 037
      // 033: invokestatic g_3.c (Loov;)Loov;
      // 036: athrow
      // 037: ifne 0fe
      // 03a: aload 0
      // 03b: iload 6
      // 03d: ifne 0ff
      // 040: goto 047
      // 043: invokestatic g_3.c (Loov;)Loov;
      // 046: athrow
      // 047: getfield g_3.o_8 F
      // 04a: ldc 3.0
      // 04c: nop
      // 04d: fcmpl
      // 04e: ifle 0fe
      // 051: goto 058
      // 054: invokestatic g_3.c (Loov;)Loov;
      // 057: athrow
      // 058: iload 3
      // 059: ifeq 0fe
      // 05c: goto 063
      // 05f: invokestatic g_3.c (Loov;)Loov;
      // 062: athrow
      // 063: aload 0
      // 064: getfield g_3.oay Lt9d;
      // 067: aload 5
      // 069: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 06c: astore 7
      // 06e: aload 7
      // 070: invokeinterface zfz.r_y ()Le0x; 1
      // 075: astore 8
      // 077: aload 0
      // 078: getfield g_3.o_8 F
      // 07b: ldc 3.0
      // 07d: nop
      // 07e: fsub
      // 07f: invokestatic fe6.v1i (F)I
      // 082: i2f
      // 083: fstore 9
      // 085: iload 6
      // 087: ifne 108
      // 08a: aload 8
      // 08c: invokevirtual e0x.p1r ()Lp3y;
      // 08f: getstatic p3y.cei Lp3y;
      // 092: if_acmpeq 0fe
      // 095: goto 09c
      // 098: invokestatic g_3.c (Loov;)Loov;
      // 09b: athrow
      // 09c: ldc 0.2
      // 09e: nop
      // 09f: fload 9
      // 0a1: ldc 15.0
      // 0a3: nop
      // 0a4: fdiv
      // 0a5: fadd
      // 0a6: ldc 10.0
      // 0a8: nop
      // 0a9: invokestatic java/lang/Math.min (FF)F
      // 0ac: f2d
      // 0ad: dstore 10
      // 0af: dload 10
      // 0b1: ldc2_w 2.5
      // 0b4: dcmpl
      // 0b5: iload 6
      // 0b7: ifne 0d0
      // 0ba: ifle 0c9
      // 0bd: goto 0c4
      // 0c0: invokestatic g_3.c (Loov;)Loov;
      // 0c3: athrow
      // 0c4: ldc2_w 2.5
      // 0c7: dstore 10
      // 0c9: ldc2_w 150.0
      // 0cc: dload 10
      // 0ce: dmul
      // 0cf: d2i
      // 0d0: istore 12
      // 0d2: aload 0
      // 0d3: getfield g_3.oay Lt9d;
      // 0d6: checkcast dug
      // 0d9: getstatic w_0.jxl Lw_0;
      // 0dc: aload 0
      // 0dd: getfield g_3.o2v D
      // 0e0: aload 0
      // 0e1: getfield g_3.kfp D
      // 0e4: aload 0
      // 0e5: getfield g_3.vbd D
      // 0e8: iload 12
      // 0ea: dconst_0
      // 0eb: dconst_0
      // 0ec: dconst_0
      // 0ed: ldc2_w 0.15000000596046448
      // 0f0: bipush 1
      // 0f1: newarray 10
      // 0f3: dup
      // 0f4: bipush 0
      // 0f5: aload 7
      // 0f7: invokestatic e0x.r2y (Lzfz;)I
      // 0fa: iastore
      // 0fb: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // 0fe: aload 0
      // 0ff: dload 1
      // 100: iload 3
      // 101: aload 4
      // 103: aload 5
      // 105: invokespecial i2h.ihp (DZLe0x;Lmew;)V
      // 108: return
   }

   public boolean s53() {
      return false;
   }

   @Override
   public void mwr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 99382787530563
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield g_3.sti F
      // 00d: putfield g_3.laq F
      // 010: aload 0
      // 011: invokespecial i2h.mwr ()V
      // 014: invokestatic t9d.c ()I
      // 017: aload 0
      // 018: getfield g_3.oay Lt9d;
      // 01b: getfield t9d.e8t Luan;
      // 01e: sipush 29867
      // 021: ldc2_w 8879536574349514468
      // 024: lload 1
      // 025: lxor
      // 026: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: nop
      // 02c: invokevirtual uan.qek (Ljava/lang/String;)V
      // 02f: istore 3
      // 030: aload 0
      // 031: instanceof ha9
      // 034: istore 4
      // 036: aload 0
      // 037: invokevirtual g_3.gzr ()Z
      // 03a: iload 3
      // 03b: ifne 10d
      // 03e: ifeq 0fe
      // 041: goto 048
      // 044: invokestatic g_3.c (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: invokevirtual g_3.sqy ()Z
      // 04c: iload 3
      // 04d: ifne 07e
      // 050: goto 057
      // 053: invokestatic g_3.c (Loov;)Loov;
      // 056: athrow
      // 057: ifeq 075
      // 05a: goto 061
      // 05d: invokestatic g_3.c (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getstatic ofh._st Lofh;
      // 065: fconst_1
      // 066: invokevirtual g_3.m1t (Lofh;F)Z
      // 069: pop
      // 06a: iload 3
      // 06b: ifeq 0fe
      // 06e: goto 075
      // 071: invokestatic g_3.c (Loov;)Loov;
      // 074: athrow
      // 075: iload 4
      // 077: goto 07e
      // 07a: invokestatic g_3.c (Loov;)Loov;
      // 07d: athrow
      // 07e: iload 3
      // 07f: ifne 10d
      // 082: ifeq 0fe
      // 085: goto 08c
      // 088: invokestatic g_3.c (Loov;)Loov;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield g_3.oay Lt9d;
      // 090: invokevirtual t9d.fve ()Lw5i;
      // 093: aload 0
      // 094: invokevirtual g_3.aaw ()Lnh4;
      // 097: invokevirtual w5i.aei (Lnh4;)Z
      // 09a: iload 3
      // 09b: ifne 10d
      // 09e: goto 0a5
      // 0a1: invokestatic g_3.c (Loov;)Loov;
      // 0a4: athrow
      // 0a5: ifne 0fe
      // 0a8: goto 0af
      // 0ab: invokestatic g_3.c (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield g_3.oay Lt9d;
      // 0b3: invokevirtual t9d.fve ()Lw5i;
      // 0b6: aload 0
      // 0b7: invokevirtual w5i.uhq (Li2h;)D
      // 0ba: aload 0
      // 0bb: getfield g_3.oay Lt9d;
      // 0be: invokevirtual t9d.fve ()Lw5i;
      // 0c1: invokevirtual w5i.x5x ()D
      // 0c4: dadd
      // 0c5: dstore 5
      // 0c7: dload 5
      // 0c9: dconst_0
      // 0ca: dcmpg
      // 0cb: iload 3
      // 0cc: ifne 10d
      // 0cf: ifge 0fe
      // 0d2: goto 0d9
      // 0d5: invokestatic g_3.c (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getstatic ofh._st Lofh;
      // 0dd: bipush 1
      // 0de: dload 5
      // 0e0: dneg
      // 0e1: aload 0
      // 0e2: getfield g_3.oay Lt9d;
      // 0e5: invokevirtual t9d.fve ()Lw5i;
      // 0e8: invokevirtual w5i.k98 ()D
      // 0eb: dmul
      // 0ec: invokestatic fe6.jqf (D)I
      // 0ef: invokestatic java/lang/Math.max (II)I
      // 0f2: i2f
      // 0f3: invokevirtual g_3.m1t (Lofh;F)Z
      // 0f6: pop
      // 0f7: goto 0fe
      // 0fa: invokestatic g_3.c (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: iload 3
      // 100: ifne 12d
      // 103: invokevirtual g_3.xgj ()Z
      // 106: goto 10d
      // 109: invokestatic g_3.c (Loov;)Loov;
      // 10c: athrow
      // 10d: ifne 12c
      // 110: aload 0
      // 111: getfield g_3.oay Lt9d;
      // 114: getfield t9d.v0f Z
      // 117: iload 3
      // 118: ifne 132
      // 11b: goto 122
      // 11e: invokestatic g_3.c (Loov;)Loov;
      // 121: athrow
      // 122: ifeq 130
      // 125: goto 12c
      // 128: invokestatic g_3.c (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: invokevirtual g_3.utb ()V
      // 130: iload 4
      // 132: iload 3
      // 133: ifne 151
      // 136: ifeq 163
      // 139: goto 140
      // 13c: invokestatic g_3.c (Loov;)Loov;
      // 13f: athrow
      // 140: aload 0
      // 141: checkcast ha9
      // 144: getfield ha9.lls Lpj2;
      // 147: getfield pj2.lez Z
      // 14a: goto 151
      // 14d: invokestatic g_3.c (Loov;)Loov;
      // 150: athrow
      // 151: iload 3
      // 152: ifne 160
      // 155: ifeq 163
      // 158: goto 15f
      // 15b: invokestatic g_3.c (Loov;)Loov;
      // 15e: athrow
      // 15f: bipush 1
      // 160: goto 164
      // 163: bipush 0
      // 164: istore 5
      // 166: aload 0
      // 167: invokevirtual g_3.gzr ()Z
      // 16a: iload 3
      // 16b: ifne 307
      // 16e: ifeq 303
      // 171: goto 178
      // 174: invokestatic g_3.c (Loov;)Loov;
      // 177: athrow
      // 178: aload 0
      // 179: iload 3
      // 17a: ifne 2fd
      // 17d: goto 184
      // 180: invokestatic g_3.c (Loov;)Loov;
      // 183: athrow
      // 184: getstatic p3y.six Lp3y;
      // 187: invokevirtual g_3.v0c (Lp3y;)Z
      // 18a: ifeq 2f5
      // 18d: goto 194
      // 190: invokestatic g_3.c (Loov;)Loov;
      // 193: athrow
      // 194: aload 0
      // 195: invokevirtual g_3.s53 ()Z
      // 198: iload 3
      // 199: ifne 29f
      // 19c: goto 1a3
      // 19f: invokestatic g_3.c (Loov;)Loov;
      // 1a2: athrow
      // 1a3: ifne 298
      // 1a6: goto 1ad
      // 1a9: invokestatic g_3.c (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: getstatic mcs.h8d Lmcs;
      // 1b1: getfield mcs.zr9 I
      // 1b4: invokevirtual g_3.vx3 (I)Z
      // 1b7: iload 3
      // 1b8: ifne 29f
      // 1bb: goto 1c2
      // 1be: invokestatic g_3.c (Loov;)Loov;
      // 1c1: athrow
      // 1c2: ifne 298
      // 1c5: goto 1cc
      // 1c8: invokestatic g_3.c (Loov;)Loov;
      // 1cb: athrow
      // 1cc: iload 5
      // 1ce: iload 3
      // 1cf: ifne 29f
      // 1d2: goto 1d9
      // 1d5: invokestatic g_3.c (Loov;)Loov;
      // 1d8: athrow
      // 1d9: ifne 298
      // 1dc: goto 1e3
      // 1df: invokestatic g_3.c (Loov;)Loov;
      // 1e2: athrow
      // 1e3: aload 0
      // 1e4: aload 0
      // 1e5: aload 0
      // 1e6: invokevirtual g_3.n5m ()I
      // 1e9: invokevirtual g_3.g2u (I)I
      // 1ec: invokevirtual g_3.yoc (I)V
      // 1ef: aload 0
      // 1f0: invokevirtual g_3.n5m ()I
      // 1f3: iload 3
      // 1f4: ifne 29f
      // 1f7: goto 1fe
      // 1fa: invokestatic g_3.c (Loov;)Loov;
      // 1fd: athrow
      // 1fe: bipush -20
      // 200: if_icmpne 298
      // 203: goto 20a
      // 206: invokestatic g_3.c (Loov;)Loov;
      // 209: athrow
      // 20a: aload 0
      // 20b: bipush 0
      // 20c: invokevirtual g_3.yoc (I)V
      // 20f: bipush 0
      // 210: istore 6
      // 212: iload 6
      // 214: bipush 8
      // 216: if_icmpge 28f
      // 219: aload 0
      // 21a: getfield g_3.z2d Ljava/util/Random;
      // 21d: invokevirtual java/util/Random.nextFloat ()F
      // 220: aload 0
      // 221: getfield g_3.z2d Ljava/util/Random;
      // 224: invokevirtual java/util/Random.nextFloat ()F
      // 227: fsub
      // 228: fstore 7
      // 22a: aload 0
      // 22b: getfield g_3.z2d Ljava/util/Random;
      // 22e: invokevirtual java/util/Random.nextFloat ()F
      // 231: aload 0
      // 232: getfield g_3.z2d Ljava/util/Random;
      // 235: invokevirtual java/util/Random.nextFloat ()F
      // 238: fsub
      // 239: fstore 8
      // 23b: aload 0
      // 23c: getfield g_3.z2d Ljava/util/Random;
      // 23f: invokevirtual java/util/Random.nextFloat ()F
      // 242: aload 0
      // 243: getfield g_3.z2d Ljava/util/Random;
      // 246: invokevirtual java/util/Random.nextFloat ()F
      // 249: fsub
      // 24a: fstore 9
      // 24c: aload 0
      // 24d: getfield g_3.oay Lt9d;
      // 250: getstatic w_0.w_h Lw_0;
      // 253: aload 0
      // 254: getfield g_3.o2v D
      // 257: fload 7
      // 259: f2d
      // 25a: dadd
      // 25b: aload 0
      // 25c: getfield g_3.kfp D
      // 25f: fload 8
      // 261: f2d
      // 262: dadd
      // 263: aload 0
      // 264: getfield g_3.vbd D
      // 267: fload 9
      // 269: f2d
      // 26a: dadd
      // 26b: aload 0
      // 26c: getfield g_3.icv D
      // 26f: aload 0
      // 270: getfield g_3.mop D
      // 273: aload 0
      // 274: getfield g_3.bw4 D
      // 277: bipush 0
      // 278: newarray 10
      // 27a: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 27d: iinc 6 1
      // 280: iload 3
      // 281: ifne 298
      // 284: iload 3
      // 285: ifeq 212
      // 288: goto 28f
      // 28b: invokestatic g_3.c (Loov;)Loov;
      // 28e: athrow
      // 28f: aload 0
      // 290: getstatic ofh.e7v Lofh;
      // 293: fconst_2
      // 294: invokevirtual g_3.m1t (Lofh;F)Z
      // 297: pop
      // 298: aload 0
      // 299: getfield g_3.oay Lt9d;
      // 29c: getfield t9d.v0f Z
      // 29f: iload 3
      // 2a0: ifne 307
      // 2a3: ifne 303
      // 2a6: goto 2ad
      // 2a9: invokestatic g_3.c (Loov;)Loov;
      // 2ac: athrow
      // 2ad: aload 0
      // 2ae: invokevirtual g_3.i0e ()Z
      // 2b1: iload 3
      // 2b2: ifne 307
      // 2b5: goto 2bc
      // 2b8: invokestatic g_3.c (Loov;)Loov;
      // 2bb: athrow
      // 2bc: ifeq 303
      // 2bf: goto 2c6
      // 2c2: invokestatic g_3.c (Loov;)Loov;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: getfield g_3.hzp Li2h;
      // 2ca: instanceof g_3
      // 2cd: iload 3
      // 2ce: ifne 307
      // 2d1: goto 2d8
      // 2d4: invokestatic g_3.c (Loov;)Loov;
      // 2d7: athrow
      // 2d8: ifeq 303
      // 2db: goto 2e2
      // 2de: invokestatic g_3.c (Loov;)Loov;
      // 2e1: athrow
      // 2e2: aload 0
      // 2e3: aconst_null
      // 2e4: checkcast i2h
      // 2e7: invokevirtual g_3.nw9 (Li2h;)V
      // 2ea: iload 3
      // 2eb: ifeq 303
      // 2ee: goto 2f5
      // 2f1: invokestatic g_3.c (Loov;)Loov;
      // 2f4: athrow
      // 2f5: aload 0
      // 2f6: goto 2fd
      // 2f9: invokestatic g_3.c (Loov;)Loov;
      // 2fc: athrow
      // 2fd: sipush 300
      // 300: invokevirtual g_3.yoc (I)V
      // 303: aload 0
      // 304: invokevirtual g_3.gzr ()Z
      // 307: iload 3
      // 308: ifne 345
      // 30b: ifeq 339
      // 30e: goto 315
      // 311: invokestatic g_3.c (Loov;)Loov;
      // 314: athrow
      // 315: aload 0
      // 316: invokevirtual g_3.n08 ()Z
      // 319: iload 3
      // 31a: ifne 345
      // 31d: goto 324
      // 320: invokestatic g_3.c (Loov;)Loov;
      // 323: athrow
      // 324: ifeq 339
      // 327: goto 32e
      // 32a: invokestatic g_3.c (Loov;)Loov;
      // 32d: athrow
      // 32e: aload 0
      // 32f: invokevirtual g_3.utb ()V
      // 332: goto 339
      // 335: invokestatic g_3.c (Loov;)Loov;
      // 338: athrow
      // 339: aload 0
      // 33a: aload 0
      // 33b: getfield g_3.sep F
      // 33e: putfield g_3.vz1 F
      // 341: aload 0
      // 342: getfield g_3.gx0 I
      // 345: iload 3
      // 346: ifne 368
      // 349: ifle 364
      // 34c: goto 353
      // 34f: invokestatic g_3.c (Loov;)Loov;
      // 352: athrow
      // 353: aload 0
      // 354: dup
      // 355: getfield g_3.gx0 I
      // 358: bipush 1
      // 359: isub
      // 35a: putfield g_3.gx0 I
      // 35d: goto 364
      // 360: invokestatic g_3.c (Loov;)Loov;
      // 363: athrow
      // 364: aload 0
      // 365: getfield g_3.qqi I
      // 368: iload 3
      // 369: ifne 3a6
      // 36c: ifle 3a0
      // 36f: goto 376
      // 372: invokestatic g_3.c (Loov;)Loov;
      // 375: athrow
      // 376: aload 0
      // 377: instanceof z96
      // 37a: iload 3
      // 37b: ifne 3a6
      // 37e: goto 385
      // 381: invokestatic g_3.c (Loov;)Loov;
      // 384: athrow
      // 385: ifne 3a0
      // 388: goto 38f
      // 38b: invokestatic g_3.c (Loov;)Loov;
      // 38e: athrow
      // 38f: aload 0
      // 390: dup
      // 391: getfield g_3.qqi I
      // 394: bipush 1
      // 395: isub
      // 396: putfield g_3.qqi I
      // 399: goto 3a0
      // 39c: invokestatic g_3.c (Loov;)Loov;
      // 39f: athrow
      // 3a0: aload 0
      // 3a1: invokevirtual g_3.i55 ()F
      // 3a4: fconst_0
      // 3a5: fcmpg
      // 3a6: iload 3
      // 3a7: ifne 3ce
      // 3aa: ifgt 3bf
      // 3ad: goto 3b4
      // 3b0: invokestatic g_3.c (Loov;)Loov;
      // 3b3: athrow
      // 3b4: aload 0
      // 3b5: invokevirtual g_3.xkp ()V
      // 3b8: goto 3bf
      // 3bb: invokestatic g_3.c (Loov;)Loov;
      // 3be: athrow
      // 3bf: aload 0
      // 3c0: iload 3
      // 3c1: ifne 3ee
      // 3c4: getfield g_3.gig I
      // 3c7: goto 3ce
      // 3ca: invokestatic g_3.c (Loov;)Loov;
      // 3cd: athrow
      // 3ce: ifle 3e6
      // 3d1: aload 0
      // 3d2: dup
      // 3d3: getfield g_3.gig I
      // 3d6: bipush 1
      // 3d7: isub
      // 3d8: putfield g_3.gig I
      // 3db: iload 3
      // 3dc: ifeq 3f2
      // 3df: goto 3e6
      // 3e2: invokestatic g_3.c (Loov;)Loov;
      // 3e5: athrow
      // 3e6: aload 0
      // 3e7: goto 3ee
      // 3ea: invokestatic g_3.c (Loov;)Loov;
      // 3ed: athrow
      // 3ee: aconst_null
      // 3ef: putfield g_3.mxp Lha9;
      // 3f2: aload 0
      // 3f3: getfield g_3.ihk Lg_3;
      // 3f6: iload 3
      // 3f7: ifne 430
      // 3fa: ifnull 42c
      // 3fd: goto 404
      // 400: invokestatic g_3.c (Loov;)Loov;
      // 403: athrow
      // 404: aload 0
      // 405: getfield g_3.ihk Lg_3;
      // 408: iload 3
      // 409: ifne 430
      // 40c: goto 413
      // 40f: invokestatic g_3.c (Loov;)Loov;
      // 412: athrow
      // 413: invokevirtual g_3.gzr ()Z
      // 416: ifne 42c
      // 419: goto 420
      // 41c: invokestatic g_3.c (Loov;)Loov;
      // 41f: athrow
      // 420: aload 0
      // 421: aconst_null
      // 422: putfield g_3.ihk Lg_3;
      // 425: goto 42c
      // 428: invokestatic g_3.c (Loov;)Loov;
      // 42b: athrow
      // 42c: aload 0
      // 42d: getfield g_3._7v Lg_3;
      // 430: iload 3
      // 431: ifne 4c9
      // 434: ifnull 49c
      // 437: goto 43e
      // 43a: invokestatic g_3.c (Loov;)Loov;
      // 43d: athrow
      // 43e: aload 0
      // 43f: getfield g_3._7v Lg_3;
      // 442: invokevirtual g_3.gzr ()Z
      // 445: iload 3
      // 446: ifne 488
      // 449: goto 450
      // 44c: invokestatic g_3.c (Loov;)Loov;
      // 44f: athrow
      // 450: ifne 46d
      // 453: goto 45a
      // 456: invokestatic g_3.c (Loov;)Loov;
      // 459: athrow
      // 45a: aload 0
      // 45b: aconst_null
      // 45c: checkcast g_3
      // 45f: invokevirtual g_3.iar (Lg_3;)V
      // 462: iload 3
      // 463: ifeq 49c
      // 466: goto 46d
      // 469: invokestatic g_3.c (Loov;)Loov;
      // 46c: athrow
      // 46d: aload 0
      // 46e: iload 3
      // 46f: ifne 4c9
      // 472: goto 479
      // 475: invokestatic g_3.c (Loov;)Loov;
      // 478: athrow
      // 479: getfield g_3.g25 I
      // 47c: aload 0
      // 47d: getfield g_3.kqj I
      // 480: isub
      // 481: goto 488
      // 484: invokestatic g_3.c (Loov;)Loov;
      // 487: athrow
      // 488: bipush 100
      // 48a: if_icmple 49c
      // 48d: aload 0
      // 48e: aconst_null
      // 48f: checkcast g_3
      // 492: invokevirtual g_3.iar (Lg_3;)V
      // 495: goto 49c
      // 498: invokestatic g_3.c (Loov;)Loov;
      // 49b: athrow
      // 49c: aload 0
      // 49d: invokevirtual g_3.fzd ()V
      // 4a0: aload 0
      // 4a1: aload 0
      // 4a2: getfield g_3.z35 F
      // 4a5: putfield g_3.t2t F
      // 4a8: aload 0
      // 4a9: aload 0
      // 4aa: getfield g_3.ksw F
      // 4ad: putfield g_3.gsh F
      // 4b0: aload 0
      // 4b1: aload 0
      // 4b2: getfield g_3.q6c F
      // 4b5: putfield g_3.h82 F
      // 4b8: aload 0
      // 4b9: aload 0
      // 4ba: getfield g_3.x5k F
      // 4bd: putfield g_3.p3h F
      // 4c0: aload 0
      // 4c1: aload 0
      // 4c2: getfield g_3.y2i F
      // 4c5: putfield g_3.j25 F
      // 4c8: aload 0
      // 4c9: getfield g_3.oay Lt9d;
      // 4cc: getfield t9d.e8t Luan;
      // 4cf: invokevirtual uan.uio ()V
      // 4d2: new z6x
      // 4d5: dup
      // 4d6: aload 0
      // 4d7: invokespecial z6x.<init> (Lg_3;)V
      // 4da: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 4dd: pop
      // 4de: return
   }

   public boolean ejl() {
      return false;
   }

   public void xkp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 132721315204973
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: dup
      // 00e: getfield g_3.qur I
      // 011: bipush 1
      // 012: iadd
      // 013: putfield g_3.qur I
      // 016: aload 0
      // 017: getfield g_3.qur I
      // 01a: iload 3
      // 01b: ifeq 038
      // 01e: bipush 20
      // 020: if_icmpne 1a0
      // 023: goto 02a
      // 026: invokestatic g_3.c (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield g_3.oay Lt9d;
      // 02e: getfield t9d.v0f Z
      // 031: goto 038
      // 034: invokestatic g_3.c (Loov;)Loov;
      // 037: athrow
      // 038: iload 3
      // 039: ifeq 110
      // 03c: ifne 10b
      // 03f: goto 046
      // 042: invokestatic g_3.c (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: getfield g_3.gig I
      // 04a: iload 3
      // 04b: ifeq 083
      // 04e: goto 055
      // 051: invokestatic g_3.c (Loov;)Loov;
      // 054: athrow
      // 055: ifgt 078
      // 058: goto 05f
      // 05b: invokestatic g_3.c (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: invokevirtual g_3.pwr ()Z
      // 063: iload 3
      // 064: ifeq 110
      // 067: goto 06e
      // 06a: invokestatic g_3.c (Loov;)Loov;
      // 06d: athrow
      // 06e: ifeq 10b
      // 071: goto 078
      // 074: invokestatic g_3.c (Loov;)Loov;
      // 077: athrow
      // 078: aload 0
      // 079: invokevirtual g_3.cz_ ()Z
      // 07c: goto 083
      // 07f: invokestatic g_3.c (Loov;)Loov;
      // 082: athrow
      // 083: iload 3
      // 084: ifeq 110
      // 087: ifeq 10b
      // 08a: goto 091
      // 08d: invokestatic g_3.c (Loov;)Loov;
      // 090: athrow
      // 091: aload 0
      // 092: getfield g_3.oay Lt9d;
      // 095: invokevirtual t9d.eir ()Lef9;
      // 098: sipush 1197
      // 09b: ldc2_w 7402687319700109000
      // 09e: lload 1
      // 09f: lxor
      // 0a0: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0a9: iload 3
      // 0aa: ifeq 110
      // 0ad: goto 0b4
      // 0b0: invokestatic g_3.c (Loov;)Loov;
      // 0b3: athrow
      // 0b4: ifeq 10b
      // 0b7: goto 0be
      // 0ba: invokestatic g_3.c (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: getfield g_3.mxp Lha9;
      // 0c3: invokevirtual g_3._96 (Lha9;)I
      // 0c6: istore 4
      // 0c8: iload 4
      // 0ca: ifle 10b
      // 0cd: iload 4
      // 0cf: invokestatic uno.di5 (I)I
      // 0d2: istore 5
      // 0d4: iload 4
      // 0d6: iload 5
      // 0d8: isub
      // 0d9: istore 4
      // 0db: aload 0
      // 0dc: getfield g_3.oay Lt9d;
      // 0df: new uno
      // 0e2: dup
      // 0e3: aload 0
      // 0e4: getfield g_3.oay Lt9d;
      // 0e7: aload 0
      // 0e8: getfield g_3.o2v D
      // 0eb: aload 0
      // 0ec: getfield g_3.kfp D
      // 0ef: aload 0
      // 0f0: getfield g_3.vbd D
      // 0f3: iload 5
      // 0f5: invokespecial uno.<init> (Lt9d;DDDI)V
      // 0f8: invokevirtual t9d.xzq (Li2h;)Z
      // 0fb: pop
      // 0fc: iload 3
      // 0fd: ifeq 10f
      // 100: iload 3
      // 101: ifne 0c8
      // 104: goto 10b
      // 107: invokestatic g_3.c (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: invokevirtual g_3._kl ()V
      // 10f: bipush 0
      // 110: istore 4
      // 112: iload 4
      // 114: bipush 20
      // 116: if_icmpge 1a0
      // 119: aload 0
      // 11a: getfield g_3.z2d Ljava/util/Random;
      // 11d: invokevirtual java/util/Random.nextGaussian ()D
      // 120: ldc2_w 0.02
      // 123: dmul
      // 124: dstore 5
      // 126: aload 0
      // 127: getfield g_3.z2d Ljava/util/Random;
      // 12a: invokevirtual java/util/Random.nextGaussian ()D
      // 12d: ldc2_w 0.02
      // 130: dmul
      // 131: dstore 7
      // 133: aload 0
      // 134: getfield g_3.z2d Ljava/util/Random;
      // 137: invokevirtual java/util/Random.nextGaussian ()D
      // 13a: ldc2_w 0.02
      // 13d: dmul
      // 13e: dstore 9
      // 140: aload 0
      // 141: getfield g_3.oay Lt9d;
      // 144: getstatic w_0.aiv Lw_0;
      // 147: aload 0
      // 148: getfield g_3.o2v D
      // 14b: aload 0
      // 14c: getfield g_3.z2d Ljava/util/Random;
      // 14f: invokevirtual java/util/Random.nextFloat ()F
      // 152: aload 0
      // 153: getfield g_3.uo6 F
      // 156: fmul
      // 157: fconst_2
      // 158: fmul
      // 159: f2d
      // 15a: dadd
      // 15b: aload 0
      // 15c: getfield g_3.uo6 F
      // 15f: f2d
      // 160: dsub
      // 161: aload 0
      // 162: getfield g_3.kfp D
      // 165: aload 0
      // 166: getfield g_3.z2d Ljava/util/Random;
      // 169: invokevirtual java/util/Random.nextFloat ()F
      // 16c: aload 0
      // 16d: getfield g_3.ikl F
      // 170: fmul
      // 171: f2d
      // 172: dadd
      // 173: aload 0
      // 174: getfield g_3.vbd D
      // 177: aload 0
      // 178: getfield g_3.z2d Ljava/util/Random;
      // 17b: invokevirtual java/util/Random.nextFloat ()F
      // 17e: aload 0
      // 17f: getfield g_3.uo6 F
      // 182: fmul
      // 183: fconst_2
      // 184: fmul
      // 185: f2d
      // 186: dadd
      // 187: aload 0
      // 188: getfield g_3.uo6 F
      // 18b: f2d
      // 18c: dsub
      // 18d: dload 5
      // 18f: dload 7
      // 191: dload 9
      // 193: bipush 0
      // 194: newarray 10
      // 196: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 199: iinc 4 1
      // 19c: iload 3
      // 19d: ifne 112
      // 1a0: return
   }

   public boolean cz_() {
      int var1 = t9d.b();

      try {
         boolean var10000 = this.ejl();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return false;
   }

   public int g2u(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokestatic hc0.v1a (Li2h;)I
      // 08: istore 3
      // 09: iload 3
      // 0a: iload 2
      // 0b: ifne 40
      // 0e: ifle 3f
      // 11: goto 18
      // 14: invokestatic g_3.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield g_3.z2d Ljava/util/Random;
      // 1c: iload 3
      // 1d: bipush 1
      // 1e: iadd
      // 1f: invokevirtual java/util/Random.nextInt (I)I
      // 22: iload 2
      // 23: ifne 40
      // 26: goto 2d
      // 29: invokestatic g_3.c (Loov;)Loov;
      // 2c: athrow
      // 2d: ifle 3f
      // 30: goto 37
      // 33: invokestatic g_3.c (Loov;)Loov;
      // 36: athrow
      // 37: iload 1
      // 38: goto 42
      // 3b: invokestatic g_3.c (Loov;)Loov;
      // 3e: athrow
      // 3f: iload 1
      // 40: bipush 1
      // 41: isub
      // 42: ireturn
   }

   public int _96(ha9 var1) {
      return 0;
   }

   public boolean pwr() {
      return false;
   }

   public Random mbr() {
      return this.z2d;
   }

   public g_3 myo() {
      return this._7v;
   }

   public int ii0() {
      return this.kqj;
   }

   public void iar(g_3 var1) {
      this._7v = var1;
      this.kqj = this.g25;
   }

   public g_3 vg5() {
      return this.ihk;
   }

   public int xqk() {
      return this.yru;
   }

   public void upe(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof g_3
      // 08: ifeq 1e
      // 0b: aload 0
      // 0c: aload 1
      // 0d: checkcast g_3
      // 10: putfield g_3.ihk Lg_3;
      // 13: iload 2
      // 14: ifeq 2a
      // 17: goto 1e
      // 1a: invokestatic g_3.c (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aconst_null
      // 20: putfield g_3.ihk Lg_3;
      // 23: goto 2a
      // 26: invokestatic g_3.c (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 0
      // 2c: getfield g_3.g25 I
      // 2f: putfield g_3.yru I
      // 32: return
   }

   public int c67() {
      return this.dof;
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 40233520306452
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: sipush 17599
      // 00c: ldc2_w 7081304796019351716
      // 00f: lload 2
      // 010: lxor
      // 011: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: aload 0
      // 018: invokevirtual g_3.i55 ()F
      // 01b: invokevirtual bdo._i9 (Ljava/lang/String;F)V
      // 01e: aload 1
      // 01f: sipush 25923
      // 022: ldc2_w 12799366816317769
      // 025: lload 2
      // 026: lxor
      // 027: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: nop
      // 02d: aload 0
      // 02e: invokevirtual g_3.i55 ()F
      // 031: f2d
      // 032: invokestatic java/lang/Math.ceil (D)D
      // 035: d2i
      // 036: i2s
      // 037: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 03a: aload 1
      // 03b: sipush 29577
      // 03e: ldc2_w 4015636114442934163
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: aload 0
      // 04a: getfield g_3.gx0 I
      // 04d: i2s
      // 04e: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 051: aload 1
      // 052: sipush 14206
      // 055: ldc2_w 4200612588881908590
      // 058: lload 2
      // 059: lxor
      // 05a: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: nop
      // 060: aload 0
      // 061: getfield g_3.kqj I
      // 064: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 067: invokestatic t9d.b ()I
      // 06a: aload 1
      // 06b: sipush 23852
      // 06e: ldc2_w 3194788904258435386
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: aload 0
      // 07a: getfield g_3.qur I
      // 07d: i2s
      // 07e: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 081: aload 1
      // 082: sipush 24205
      // 085: ldc2_w 1413175687888992898
      // 088: lload 2
      // 089: lxor
      // 08a: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: nop
      // 090: aload 0
      // 091: invokevirtual g_3._xk ()F
      // 094: invokevirtual bdo._i9 (Ljava/lang/String;F)V
      // 097: istore 4
      // 099: aload 0
      // 09a: invokevirtual g_3.n7a ()[Lerg;
      // 09d: astore 5
      // 09f: aload 5
      // 0a1: arraylength
      // 0a2: istore 6
      // 0a4: bipush 0
      // 0a5: istore 7
      // 0a7: iload 7
      // 0a9: iload 6
      // 0ab: if_icmpge 0ed
      // 0ae: aload 5
      // 0b0: iload 7
      // 0b2: aaload
      // 0b3: astore 8
      // 0b5: iload 4
      // 0b7: ifeq 0e8
      // 0ba: aload 8
      // 0bc: iload 4
      // 0be: ifeq 13c
      // 0c1: goto 0c8
      // 0c4: invokestatic g_3.c (Loov;)Loov;
      // 0c7: athrow
      // 0c8: ifnull 0e5
      // 0cb: goto 0d2
      // 0ce: invokestatic g_3.c (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield g_3.kpa Losd;
      // 0d6: aload 8
      // 0d8: invokevirtual erg.s15 ()Lcom/google/common/collect/Multimap;
      // 0db: invokevirtual osd.l05 (Lcom/google/common/collect/Multimap;)V
      // 0de: goto 0e5
      // 0e1: invokestatic g_3.c (Loov;)Loov;
      // 0e4: athrow
      // 0e5: iinc 7 1
      // 0e8: iload 4
      // 0ea: ifne 0a7
      // 0ed: aload 1
      // 0ee: sipush 21530
      // 0f1: ldc2_w 1817347409392136212
      // 0f4: lload 2
      // 0f5: lxor
      // 0f6: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: nop
      // 0fc: aload 0
      // 0fd: invokevirtual g_3.s_a ()Losd;
      // 100: invokestatic m6d.sng (Losd;)Lqhg;
      // 103: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 106: aload 0
      // 107: invokevirtual g_3.n7a ()[Lerg;
      // 10a: astore 5
      // 10c: aload 5
      // 10e: arraylength
      // 10f: istore 6
      // 111: bipush 0
      // 112: istore 7
      // 114: iload 7
      // 116: iload 6
      // 118: if_icmpge 15a
      // 11b: aload 5
      // 11d: iload 7
      // 11f: aaload
      // 120: astore 8
      // 122: iload 4
      // 124: ifeq 1cb
      // 127: iload 4
      // 129: ifeq 155
      // 12c: goto 133
      // 12f: invokestatic g_3.c (Loov;)Loov;
      // 132: athrow
      // 133: aload 8
      // 135: goto 13c
      // 138: invokestatic g_3.c (Loov;)Loov;
      // 13b: athrow
      // 13c: ifnull 152
      // 13f: aload 0
      // 140: getfield g_3.kpa Losd;
      // 143: aload 8
      // 145: invokevirtual erg.s15 ()Lcom/google/common/collect/Multimap;
      // 148: invokevirtual osd.fdu (Lcom/google/common/collect/Multimap;)V
      // 14b: goto 152
      // 14e: invokestatic g_3.c (Loov;)Loov;
      // 151: athrow
      // 152: iinc 7 1
      // 155: iload 4
      // 157: ifne 114
      // 15a: aload 0
      // 15b: getfield g_3.mwt Ljava/util/Map;
      // 15e: invokeinterface java/util/Map.isEmpty ()Z 1
      // 163: ifne 1cb
      // 166: new qhg
      // 169: dup
      // 16a: invokespecial qhg.<init> ()V
      // 16d: astore 5
      // 16f: aload 0
      // 170: getfield g_3.mwt Ljava/util/Map;
      // 173: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 178: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 17d: astore 6
      // 17f: aload 6
      // 181: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 186: ifeq 1b7
      // 189: aload 6
      // 18b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 190: checkcast sdj
      // 193: astore 7
      // 195: aload 5
      // 197: aload 7
      // 199: new bdo
      // 19c: dup
      // 19d: invokespecial bdo.<init> ()V
      // 1a0: invokevirtual sdj.acr (Lbdo;)Lbdo;
      // 1a3: invokevirtual qhg.w2j (Lgdw;)V
      // 1a6: iload 4
      // 1a8: ifeq 1cb
      // 1ab: iload 4
      // 1ad: ifne 17f
      // 1b0: goto 1b7
      // 1b3: invokestatic g_3.c (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 1
      // 1b8: sipush 23566
      // 1bb: ldc2_w 8908681533772232710
      // 1be: lload 2
      // 1bf: lxor
      // 1c0: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: nop
      // 1c6: aload 5
      // 1c8: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1cb: return
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 90408490169791
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: aload 1
      // 00f: sipush 28913
      // 012: ldc2_w 8666810902308468831
      // 015: lload 2
      // 016: lxor
      // 017: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01c: nop
      // 01d: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 020: invokevirtual g_3.pr9 (F)V
      // 023: aload 1
      // 024: sipush 29506
      // 027: ldc2_w 614364086865214445
      // 02a: lload 2
      // 02b: lxor
      // 02c: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: bipush 9
      // 034: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 037: iload 4
      // 039: ifne 0b3
      // 03c: ifeq 09f
      // 03f: goto 046
      // 042: invokestatic g_3.c (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: getfield g_3.oay Lt9d;
      // 04a: iload 4
      // 04c: ifne 06b
      // 04f: goto 056
      // 052: invokestatic g_3.c (Loov;)Loov;
      // 055: athrow
      // 056: ifnull 09f
      // 059: goto 060
      // 05c: invokestatic g_3.c (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield g_3.oay Lt9d;
      // 064: goto 06b
      // 067: invokestatic g_3.c (Loov;)Loov;
      // 06a: athrow
      // 06b: getfield t9d.v0f Z
      // 06e: iload 4
      // 070: ifne 0b3
      // 073: ifne 09f
      // 076: goto 07d
      // 079: invokestatic g_3.c (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 0
      // 07e: invokevirtual g_3.s_a ()Losd;
      // 081: aload 1
      // 082: sipush 21530
      // 085: ldc2_w 1817472351144778943
      // 088: lload 2
      // 089: lxor
      // 08a: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: nop
      // 090: bipush 10
      // 092: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 095: invokestatic m6d.zig (Losd;Lqhg;)V
      // 098: goto 09f
      // 09b: invokestatic g_3.c (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: sipush 30545
      // 0a3: ldc2_w 8941425700416045028
      // 0a6: lload 2
      // 0a7: lxor
      // 0a8: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: nop
      // 0ae: bipush 9
      // 0b0: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0b3: iload 4
      // 0b5: ifne 155
      // 0b8: ifeq 135
      // 0bb: goto 0c2
      // 0be: invokestatic g_3.c (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: sipush 23566
      // 0c6: ldc2_w 8908551113788888237
      // 0c9: lload 2
      // 0ca: lxor
      // 0cb: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: bipush 10
      // 0d3: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 0d6: astore 5
      // 0d8: bipush 0
      // 0d9: istore 6
      // 0db: iload 6
      // 0dd: aload 5
      // 0df: invokevirtual qhg.vek ()I
      // 0e2: if_icmpge 135
      // 0e5: aload 5
      // 0e7: iload 6
      // 0e9: invokevirtual qhg.kd6 (I)Lbdo;
      // 0ec: astore 7
      // 0ee: aload 7
      // 0f0: invokestatic sdj.a1a (Lbdo;)Lsdj;
      // 0f3: astore 8
      // 0f5: iload 4
      // 0f7: ifne 195
      // 0fa: iload 4
      // 0fc: ifne 130
      // 0ff: goto 106
      // 102: invokestatic g_3.c (Loov;)Loov;
      // 105: athrow
      // 106: aload 8
      // 108: ifnull 12d
      // 10b: goto 112
      // 10e: invokestatic g_3.c (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: getfield g_3.mwt Ljava/util/Map;
      // 116: aload 8
      // 118: invokevirtual sdj._na ()I
      // 11b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11e: aload 8
      // 120: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 125: pop
      // 126: goto 12d
      // 129: invokestatic g_3.c (Loov;)Loov;
      // 12c: athrow
      // 12d: iinc 6 1
      // 130: iload 4
      // 132: ifeq 0db
      // 135: aload 1
      // 136: sipush 24631
      // 139: ldc2_w 5576734035477538961
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: nop
      // 144: iload 4
      // 146: ifne 190
      // 149: bipush 99
      // 14b: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 14e: goto 155
      // 151: invokestatic g_3.c (Loov;)Loov;
      // 154: athrow
      // 155: ifeq 17a
      // 158: aload 0
      // 159: aload 1
      // 15a: sipush 17599
      // 15d: ldc2_w 7081259090107665423
      // 160: lload 2
      // 161: lxor
      // 162: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: nop
      // 168: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 16b: invokevirtual g_3.uh3 (F)V
      // 16e: iload 4
      // 170: ifeq 212
      // 173: goto 17a
      // 176: invokestatic g_3.c (Loov;)Loov;
      // 179: athrow
      // 17a: aload 1
      // 17b: sipush 17553
      // 17e: ldc2_w 6577371855410203708
      // 181: lload 2
      // 182: lxor
      // 183: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: nop
      // 189: goto 190
      // 18c: invokestatic g_3.c (Loov;)Loov;
      // 18f: athrow
      // 190: invokevirtual bdo.e2o (Ljava/lang/String;)Lgdw;
      // 193: astore 5
      // 195: aload 5
      // 197: iload 4
      // 199: ifne 1c3
      // 19c: ifnonnull 1ba
      // 19f: goto 1a6
      // 1a2: invokestatic g_3.c (Loov;)Loov;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: aload 0
      // 1a8: invokevirtual g_3.axb ()F
      // 1ab: invokevirtual g_3.uh3 (F)V
      // 1ae: iload 4
      // 1b0: ifeq 212
      // 1b3: goto 1ba
      // 1b6: invokestatic g_3.c (Loov;)Loov;
      // 1b9: athrow
      // 1ba: aload 5
      // 1bc: goto 1c3
      // 1bf: invokestatic g_3.c (Loov;)Loov;
      // 1c2: athrow
      // 1c3: invokevirtual gdw.ky0 ()B
      // 1c6: bipush 5
      // 1c7: iload 4
      // 1c9: ifne 1fb
      // 1cc: if_icmpne 1ee
      // 1cf: goto 1d6
      // 1d2: invokestatic g_3.c (Loov;)Loov;
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: aload 5
      // 1d9: checkcast n8i
      // 1dc: invokevirtual n8i.qaj ()F
      // 1df: invokevirtual g_3.uh3 (F)V
      // 1e2: iload 4
      // 1e4: ifeq 212
      // 1e7: goto 1ee
      // 1ea: invokestatic g_3.c (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 5
      // 1f0: invokevirtual gdw.ky0 ()B
      // 1f3: bipush 2
      // 1f4: goto 1fb
      // 1f7: invokestatic g_3.c (Loov;)Loov;
      // 1fa: athrow
      // 1fb: if_icmpne 212
      // 1fe: aload 0
      // 1ff: aload 5
      // 201: checkcast wmr
      // 204: invokevirtual wmr.sgm ()S
      // 207: i2f
      // 208: invokevirtual g_3.uh3 (F)V
      // 20b: goto 212
      // 20e: invokestatic g_3.c (Loov;)Loov;
      // 211: athrow
      // 212: aload 0
      // 213: aload 1
      // 214: sipush 24497
      // 217: ldc2_w 3044519757481023259
      // 21a: lload 2
      // 21b: lxor
      // 21c: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: nop
      // 222: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 225: putfield g_3.gx0 I
      // 228: aload 0
      // 229: aload 1
      // 22a: sipush 21462
      // 22d: ldc2_w 6129657039409650540
      // 230: lload 2
      // 231: lxor
      // 232: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: nop
      // 238: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 23b: putfield g_3.qur I
      // 23e: aload 0
      // 23f: aload 1
      // 240: sipush 16786
      // 243: ldc2_w 2572312618887907634
      // 246: lload 2
      // 247: lxor
      // 248: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: nop
      // 24e: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 251: putfield g_3.kqj I
      // 254: return
   }

   public void fzd() {
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
      // 005: getfield g_3.mwt Ljava/util/Map;
      // 008: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 00d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 012: astore 2
      // 013: aload 2
      // 014: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 019: ifeq 0ac
      // 01c: aload 2
      // 01d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 022: checkcast java/lang/Integer
      // 025: astore 3
      // 026: aload 0
      // 027: getfield g_3.mwt Ljava/util/Map;
      // 02a: aload 3
      // 02b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 030: checkcast sdj
      // 033: astore 4
      // 035: aload 4
      // 037: aload 0
      // 038: invokevirtual sdj.g7f (Lg_3;)Z
      // 03b: iload 1
      // 03c: ifeq 0b0
      // 03f: iload 1
      // 040: ifeq 097
      // 043: goto 04a
      // 046: invokestatic g_3.c (Loov;)Loov;
      // 049: athrow
      // 04a: ifne 087
      // 04d: goto 054
      // 050: invokestatic g_3.c (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: iload 1
      // 056: ifeq 07e
      // 059: goto 060
      // 05c: invokestatic g_3.c (Loov;)Loov;
      // 05f: athrow
      // 060: getfield g_3.oay Lt9d;
      // 063: getfield t9d.v0f Z
      // 066: ifne 0a8
      // 069: goto 070
      // 06c: invokestatic g_3.c (Loov;)Loov;
      // 06f: athrow
      // 070: aload 2
      // 071: invokeinterface java/util/Iterator.remove ()V 1
      // 076: aload 0
      // 077: goto 07e
      // 07a: invokestatic g_3.c (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 4
      // 080: invokevirtual g_3.rua (Lsdj;)V
      // 083: iload 1
      // 084: ifne 0a8
      // 087: aload 4
      // 089: invokevirtual sdj.ltp ()I
      // 08c: sipush 600
      // 08f: irem
      // 090: goto 097
      // 093: invokestatic g_3.c (Loov;)Loov;
      // 096: athrow
      // 097: ifne 0a8
      // 09a: aload 0
      // 09b: aload 4
      // 09d: bipush 0
      // 09e: invokevirtual g_3.lyx (Lsdj;Z)V
      // 0a1: goto 0a8
      // 0a4: invokestatic g_3.c (Loov;)Loov;
      // 0a7: athrow
      // 0a8: iload 1
      // 0a9: ifne 013
      // 0ac: aload 0
      // 0ad: getfield g_3.f5u Z
      // 0b0: iload 1
      // 0b1: ifeq 0f3
      // 0b4: ifeq 0ea
      // 0b7: goto 0be
      // 0ba: invokestatic g_3.c (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: iload 1
      // 0c0: ifeq 0e6
      // 0c3: goto 0ca
      // 0c6: invokestatic g_3.c (Loov;)Loov;
      // 0c9: athrow
      // 0ca: getfield g_3.oay Lt9d;
      // 0cd: getfield t9d.v0f Z
      // 0d0: ifne 0e5
      // 0d3: goto 0da
      // 0d6: invokestatic g_3.c (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: invokevirtual g_3.k0f ()V
      // 0de: goto 0e5
      // 0e1: invokestatic g_3.c (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: bipush 0
      // 0e7: putfield g_3.f5u Z
      // 0ea: aload 0
      // 0eb: getfield g_3.oit Lwl1;
      // 0ee: bipush 7
      // 0f0: invokevirtual wl1.zwc (I)I
      // 0f3: istore 3
      // 0f4: aload 0
      // 0f5: getfield g_3.oit Lwl1;
      // 0f8: bipush 8
      // 0fa: invokevirtual wl1.miz (I)B
      // 0fd: iload 1
      // 0fe: ifeq 10c
      // 101: ifle 10f
      // 104: goto 10b
      // 107: invokestatic g_3.c (Loov;)Loov;
      // 10a: athrow
      // 10b: bipush 1
      // 10c: goto 110
      // 10f: bipush 0
      // 110: istore 4
      // 112: iload 3
      // 113: iload 1
      // 114: ifeq 122
      // 117: ifle 251
      // 11a: goto 121
      // 11d: invokestatic g_3.c (Loov;)Loov;
      // 120: athrow
      // 121: bipush 0
      // 122: istore 5
      // 124: aload 0
      // 125: invokevirtual g_3.h5u ()Z
      // 128: iload 1
      // 129: ifeq 153
      // 12c: ifne 143
      // 12f: goto 136
      // 132: invokestatic g_3.c (Loov;)Loov;
      // 135: athrow
      // 136: aload 0
      // 137: getfield g_3.z2d Ljava/util/Random;
      // 13a: invokevirtual java/util/Random.nextBoolean ()Z
      // 13d: istore 5
      // 13f: iload 1
      // 140: ifne 168
      // 143: aload 0
      // 144: getfield g_3.z2d Ljava/util/Random;
      // 147: bipush 15
      // 149: invokevirtual java/util/Random.nextInt (I)I
      // 14c: goto 153
      // 14f: invokestatic g_3.c (Loov;)Loov;
      // 152: athrow
      // 153: iload 1
      // 154: ifeq 162
      // 157: ifne 165
      // 15a: goto 161
      // 15d: invokestatic g_3.c (Loov;)Loov;
      // 160: athrow
      // 161: bipush 1
      // 162: goto 166
      // 165: bipush 0
      // 166: istore 5
      // 168: iload 4
      // 16a: iload 1
      // 16b: ifeq 1a1
      // 16e: ifeq 19f
      // 171: goto 178
      // 174: invokestatic g_3.c (Loov;)Loov;
      // 177: athrow
      // 178: iload 5
      // 17a: aload 0
      // 17b: getfield g_3.z2d Ljava/util/Random;
      // 17e: bipush 5
      // 17f: invokevirtual java/util/Random.nextInt (I)I
      // 182: iload 1
      // 183: ifeq 198
      // 186: goto 18d
      // 189: invokestatic g_3.c (Loov;)Loov;
      // 18c: athrow
      // 18d: ifne 19b
      // 190: goto 197
      // 193: invokestatic g_3.c (Loov;)Loov;
      // 196: athrow
      // 197: bipush 1
      // 198: goto 19c
      // 19b: bipush 0
      // 19c: iand
      // 19d: istore 5
      // 19f: iload 5
      // 1a1: iload 1
      // 1a2: ifeq 1b0
      // 1a5: ifeq 251
      // 1a8: goto 1af
      // 1ab: invokestatic g_3.c (Loov;)Loov;
      // 1ae: athrow
      // 1af: iload 3
      // 1b0: iload 1
      // 1b1: ifeq 1cd
      // 1b4: ifle 251
      // 1b7: goto 1be
      // 1ba: invokestatic g_3.c (Loov;)Loov;
      // 1bd: athrow
      // 1be: iload 3
      // 1bf: bipush 16
      // 1c1: ishr
      // 1c2: sipush 255
      // 1c5: iand
      // 1c6: goto 1cd
      // 1c9: invokestatic g_3.c (Loov;)Loov;
      // 1cc: athrow
      // 1cd: i2d
      // 1ce: ldc2_w 255.0
      // 1d1: ddiv
      // 1d2: dstore 6
      // 1d4: iload 3
      // 1d5: bipush 8
      // 1d7: ishr
      // 1d8: sipush 255
      // 1db: iand
      // 1dc: i2d
      // 1dd: ldc2_w 255.0
      // 1e0: ddiv
      // 1e1: dstore 8
      // 1e3: iload 3
      // 1e4: bipush 0
      // 1e5: ishr
      // 1e6: sipush 255
      // 1e9: iand
      // 1ea: i2d
      // 1eb: ldc2_w 255.0
      // 1ee: ddiv
      // 1ef: dstore 10
      // 1f1: aload 0
      // 1f2: getfield g_3.oay Lt9d;
      // 1f5: iload 4
      // 1f7: ifeq 204
      // 1fa: getstatic w_0.s7d Lw_0;
      // 1fd: goto 207
      // 200: invokestatic g_3.c (Loov;)Loov;
      // 203: athrow
      // 204: getstatic w_0.hg8 Lw_0;
      // 207: aload 0
      // 208: getfield g_3.o2v D
      // 20b: aload 0
      // 20c: getfield g_3.z2d Ljava/util/Random;
      // 20f: invokevirtual java/util/Random.nextDouble ()D
      // 212: ldc2_w 0.5
      // 215: dsub
      // 216: aload 0
      // 217: getfield g_3.uo6 F
      // 21a: f2d
      // 21b: dmul
      // 21c: dadd
      // 21d: aload 0
      // 21e: getfield g_3.kfp D
      // 221: aload 0
      // 222: getfield g_3.z2d Ljava/util/Random;
      // 225: invokevirtual java/util/Random.nextDouble ()D
      // 228: aload 0
      // 229: getfield g_3.ikl F
      // 22c: f2d
      // 22d: dmul
      // 22e: dadd
      // 22f: aload 0
      // 230: getfield g_3.vbd D
      // 233: aload 0
      // 234: getfield g_3.z2d Ljava/util/Random;
      // 237: invokevirtual java/util/Random.nextDouble ()D
      // 23a: ldc2_w 0.5
      // 23d: dsub
      // 23e: aload 0
      // 23f: getfield g_3.uo6 F
      // 242: f2d
      // 243: dmul
      // 244: dadd
      // 245: dload 6
      // 247: dload 8
      // 249: dload 10
      // 24b: bipush 0
      // 24c: newarray 10
      // 24e: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 251: return
   }

   public void k0f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield g_3.mwt Ljava/util/Map;
      // 08: invokeinterface java/util/Map.isEmpty ()Z 1
      // 0d: iload 1
      // 0e: ifne 42
      // 11: ifeq 2f
      // 14: goto 1b
      // 17: invokestatic g_3.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual g_3.__q ()V
      // 1f: aload 0
      // 20: bipush 0
      // 21: invokevirtual g_3.icv (Z)V
      // 24: iload 1
      // 25: ifeq 8a
      // 28: goto 2f
      // 2b: invokestatic g_3.c (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield g_3.mwt Ljava/util/Map;
      // 33: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 38: invokestatic ksn.aln (Ljava/util/Collection;)I
      // 3b: goto 42
      // 3e: invokestatic g_3.c (Loov;)Loov;
      // 41: athrow
      // 42: istore 2
      // 43: aload 0
      // 44: getfield g_3.oit Lwl1;
      // 47: bipush 8
      // 49: aload 0
      // 4a: getfield g_3.mwt Ljava/util/Map;
      // 4d: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 52: invokestatic ksn.ze_ (Ljava/util/Collection;)Z
      // 55: iload 1
      // 56: ifne 64
      // 59: ifeq 67
      // 5c: goto 63
      // 5f: invokestatic g_3.c (Loov;)Loov;
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: bipush 0
      // 68: i2b
      // 69: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 6c: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 6f: aload 0
      // 70: getfield g_3.oit Lwl1;
      // 73: bipush 7
      // 75: iload 2
      // 76: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 7c: aload 0
      // 7d: aload 0
      // 7e: getstatic mcs.zgt Lmcs;
      // 81: getfield mcs.zr9 I
      // 84: invokevirtual g_3.vx3 (I)Z
      // 87: invokevirtual g_3.icv (Z)V
      // 8a: return
   }

   public void __q() {
      this.oit.c66(8, (byte)0);
      this.oit.c66(7, 0);
   }

   public void ldj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield g_3.mwt Ljava/util/Map;
      // 08: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 0d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12: astore 2
      // 13: aload 2
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 61
      // 1c: aload 2
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast java/lang/Integer
      // 25: astore 3
      // 26: aload 0
      // 27: getfield g_3.mwt Ljava/util/Map;
      // 2a: aload 3
      // 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 30: checkcast sdj
      // 33: astore 4
      // 35: aload 0
      // 36: iload 1
      // 37: ifne 58
      // 3a: getfield g_3.oay Lt9d;
      // 3d: getfield t9d.v0f Z
      // 40: ifne 5d
      // 43: goto 4a
      // 46: invokestatic g_3.c (Loov;)Loov;
      // 49: athrow
      // 4a: aload 2
      // 4b: invokeinterface java/util/Iterator.remove ()V 1
      // 50: aload 0
      // 51: goto 58
      // 54: invokestatic g_3.c (Loov;)Loov;
      // 57: athrow
      // 58: aload 4
      // 5a: invokevirtual g_3.rua (Lsdj;)V
      // 5d: iload 1
      // 5e: ifeq 13
      // 61: return
   }

   public Collection g5i() {
      return this.mwt.values();
   }

   public boolean vx3(int var1) {
      return this.mwt.containsKey(var1);
   }

   public boolean cab(mcs var1) {
      return this.mwt.containsKey(var1.zr9);
   }

   public sdj dhd(mcs var1) {
      return (sdj)this.mwt.get(var1.zr9);
   }

   public void gmn(sdj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual g_3.xav (Lsdj;)Z
      // 09: iload 2
      // 0a: ifne 39
      // 0d: ifeq 94
      // 10: goto 17
      // 13: invokestatic g_3.c (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield g_3.mwt Ljava/util/Map;
      // 1b: aload 1
      // 1c: invokevirtual sdj._na ()I
      // 1f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 22: iload 2
      // 23: ifne 88
      // 26: goto 2d
      // 29: invokestatic g_3.c (Loov;)Loov;
      // 2c: athrow
      // 2d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 32: goto 39
      // 35: invokestatic g_3.c (Loov;)Loov;
      // 38: athrow
      // 39: ifeq 76
      // 3c: aload 0
      // 3d: getfield g_3.mwt Ljava/util/Map;
      // 40: aload 1
      // 41: invokevirtual sdj._na ()I
      // 44: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 47: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4c: checkcast sdj
      // 4f: aload 1
      // 50: invokevirtual sdj.mzf (Lsdj;)V
      // 53: aload 0
      // 54: aload 0
      // 55: getfield g_3.mwt Ljava/util/Map;
      // 58: aload 1
      // 59: invokevirtual sdj._na ()I
      // 5c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 64: checkcast sdj
      // 67: bipush 1
      // 68: invokevirtual g_3.lyx (Lsdj;Z)V
      // 6b: iload 2
      // 6c: ifeq 94
      // 6f: goto 76
      // 72: invokestatic g_3.c (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: getfield g_3.mwt Ljava/util/Map;
      // 7a: aload 1
      // 7b: invokevirtual sdj._na ()I
      // 7e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 81: goto 88
      // 84: invokestatic g_3.c (Loov;)Loov;
      // 87: athrow
      // 88: aload 1
      // 89: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 8e: pop
      // 8f: aload 0
      // 90: aload 1
      // 91: invokevirtual g_3.dft (Lsdj;)V
      // 94: return
   }

   public boolean xav(sdj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual g_3.fhc ()Ln1e;
      // 08: getstatic n1e.via Ln1e;
      // 0b: if_acmpne 4d
      // 0e: aload 1
      // 0f: invokevirtual sdj._na ()I
      // 12: istore 3
      // 13: iload 3
      // 14: iload 2
      // 15: ifne 4c
      // 18: getstatic mcs.kkg Lmcs;
      // 1b: getfield mcs.zr9 I
      // 1e: if_icmpeq 44
      // 21: goto 28
      // 24: invokestatic g_3.c (Loov;)Loov;
      // 27: athrow
      // 28: iload 3
      // 29: iload 2
      // 2a: ifne 4e
      // 2d: goto 34
      // 30: invokestatic g_3.c (Loov;)Loov;
      // 33: athrow
      // 34: getstatic mcs.veq Lmcs;
      // 37: getfield mcs.zr9 I
      // 3a: if_icmpne 4d
      // 3d: goto 44
      // 40: invokestatic g_3.c (Loov;)Loov;
      // 43: athrow
      // 44: bipush 0
      // 45: goto 4c
      // 48: invokestatic g_3.c (Loov;)Loov;
      // 4b: athrow
      // 4c: ireturn
      // 4d: bipush 1
      // 4e: ireturn
   }

   public boolean nor() {
      try {
         if (this.fhc() == n1e.via) {
            return true;
         }
      } catch (oov var1) {
         throw c(var1);
      }

      return false;
   }

   public void zrt(int var1) {
      this.mwt.remove(var1);
   }

   public void zu8(int var1) {
      sdj var2 = (sdj)this.mwt.remove(var1);

      try {
         if (var2 != null) {
            this.rua(var2);
         }
      } catch (oov var3) {
         throw c(var3);
      }
   }

   public void dft(sdj var1) {
      try {
         this.f5u = true;
         if (!this.oay.v0f) {
            mcs.ip9[var1._na()].na_(this, this.s_a(), var1.tus());
         }
      } catch (oov var2) {
         throw c(var2);
      }
   }

   public void lyx(sdj param1, boolean param2) {
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
      // 05: bipush 1
      // 06: putfield g_3.f5u Z
      // 09: iload 2
      // 0a: iload 3
      // 0b: ifeq 26
      // 0e: ifeq 58
      // 11: goto 18
      // 14: invokestatic g_3.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield g_3.oay Lt9d;
      // 1c: getfield t9d.v0f Z
      // 1f: goto 26
      // 22: invokestatic g_3.c (Loov;)Loov;
      // 25: athrow
      // 26: ifne 58
      // 29: getstatic mcs.ip9 [Lmcs;
      // 2c: aload 1
      // 2d: invokevirtual sdj._na ()I
      // 30: aaload
      // 31: aload 0
      // 32: aload 0
      // 33: invokevirtual g_3.s_a ()Losd;
      // 36: aload 1
      // 37: invokevirtual sdj.tus ()I
      // 3a: invokevirtual mcs.iqt (Lg_3;Losd;I)V
      // 3d: getstatic mcs.ip9 [Lmcs;
      // 40: aload 1
      // 41: invokevirtual sdj._na ()I
      // 44: aaload
      // 45: aload 0
      // 46: aload 0
      // 47: invokevirtual g_3.s_a ()Losd;
      // 4a: aload 1
      // 4b: invokevirtual sdj.tus ()I
      // 4e: invokevirtual mcs.na_ (Lg_3;Losd;I)V
      // 51: goto 58
      // 54: invokestatic g_3.c (Loov;)Loov;
      // 57: athrow
      // 58: return
   }

   public void rua(sdj var1) {
      try {
         this.f5u = true;
         if (!this.oay.v0f) {
            mcs.ip9[var1._na()].iqt(this, this.s_a(), var1.tus());
         }
      } catch (oov var2) {
         throw c(var2);
      }
   }

   public void rwd(float var1) {
      float var2 = this.i55();

      try {
         if (var2 > 0.0F) {
            this.uh3(var2 + var1);
         }
      } catch (oov var3) {
         throw c(var3);
      }
   }

   public final float i55() {
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
      // 05: getfield g_3.oit Lwl1;
      // 08: bipush 6
      // 0a: invokevirtual wl1.ig2 (I)F
      // 0d: fstore 2
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 49
      // 13: getfield g_3.gx0 I
      // 16: aload 0
      // 17: getfield g_3.x_3 I
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic g_3.c (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield g_3.za0 F
      // 28: iload 1
      // 29: ifeq 4e
      // 2c: goto 33
      // 2f: invokestatic g_3.c (Loov;)Loov;
      // 32: athrow
      // 33: ldc -1.0
      // 35: nop
      // 36: fcmpl
      // 37: ifne 4d
      // 3a: goto 41
      // 3d: invokestatic g_3.c (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic g_3.c (Loov;)Loov;
      // 48: athrow
      // 49: fload 2
      // 4a: putfield g_3.za0 F
      // 4d: fload 2
      // 4e: freturn
   }

   public void uh3(float var1) {
      this.oit.c66(6, fe6._f3(var1, 0.0F, this.axb()));
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual g_3.nss (Lofh;)Z
      // 009: iload 3
      // 00a: ifeq 024
      // 00d: ifeq 01d
      // 010: goto 017
      // 013: invokestatic g_3.c (Loov;)Loov;
      // 016: athrow
      // 017: bipush 0
      // 018: ireturn
      // 019: invokestatic g_3.c (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield g_3.oay Lt9d;
      // 021: getfield t9d.v0f Z
      // 024: iload 3
      // 025: ifeq 043
      // 028: ifeq 038
      // 02b: goto 032
      // 02e: invokestatic g_3.c (Loov;)Loov;
      // 031: athrow
      // 032: bipush 0
      // 033: ireturn
      // 034: invokestatic g_3.c (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: bipush 0
      // 03a: putfield g_3.dof I
      // 03d: aload 0
      // 03e: invokevirtual g_3.i55 ()F
      // 041: fconst_0
      // 042: fcmpg
      // 043: iload 3
      // 044: ifeq 066
      // 047: ifgt 057
      // 04a: goto 051
      // 04d: invokestatic g_3.c (Loov;)Loov;
      // 050: athrow
      // 051: bipush 0
      // 052: ireturn
      // 053: invokestatic g_3.c (Loov;)Loov;
      // 056: athrow
      // 057: aload 1
      // 058: iload 3
      // 059: ifeq 088
      // 05c: invokevirtual ofh.i0l ()Z
      // 05f: goto 066
      // 062: invokestatic g_3.c (Loov;)Loov;
      // 065: athrow
      // 066: ifeq 087
      // 069: aload 0
      // 06a: getstatic mcs.sw1 Lmcs;
      // 06d: invokevirtual g_3.cab (Lmcs;)Z
      // 070: iload 3
      // 071: ifeq 086
      // 074: goto 07b
      // 077: invokestatic g_3.c (Loov;)Loov;
      // 07a: athrow
      // 07b: ifeq 087
      // 07e: goto 085
      // 081: invokestatic g_3.c (Loov;)Loov;
      // 084: athrow
      // 085: bipush 0
      // 086: ireturn
      // 087: aload 1
      // 088: getstatic ofh.cw1 Lofh;
      // 08b: iload 3
      // 08c: ifeq 0a4
      // 08f: if_acmpeq 0a7
      // 092: goto 099
      // 095: invokestatic g_3.c (Loov;)Loov;
      // 098: athrow
      // 099: aload 1
      // 09a: getstatic ofh.__h Lofh;
      // 09d: goto 0a4
      // 0a0: invokestatic g_3.c (Loov;)Loov;
      // 0a3: athrow
      // 0a4: if_acmpne 0e2
      // 0a7: aload 0
      // 0a8: iload 3
      // 0a9: ifeq 0e3
      // 0ac: goto 0b3
      // 0af: invokestatic g_3.c (Loov;)Loov;
      // 0b2: athrow
      // 0b3: bipush 4
      // 0b4: invokevirtual g_3.rnq (I)Lerg;
      // 0b7: ifnull 0e2
      // 0ba: goto 0c1
      // 0bd: invokestatic g_3.c (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: bipush 4
      // 0c3: invokevirtual g_3.rnq (I)Lerg;
      // 0c6: fload 2
      // 0c7: ldc 4.0
      // 0c9: nop
      // 0ca: fmul
      // 0cb: aload 0
      // 0cc: getfield g_3.z2d Ljava/util/Random;
      // 0cf: invokevirtual java/util/Random.nextFloat ()F
      // 0d2: fload 2
      // 0d3: fmul
      // 0d4: fconst_2
      // 0d5: fmul
      // 0d6: fadd
      // 0d7: f2i
      // 0d8: aload 0
      // 0d9: invokevirtual erg.ybw (ILg_3;)V
      // 0dc: fload 2
      // 0dd: ldc 0.75
      // 0df: nop
      // 0e0: fmul
      // 0e1: fstore 2
      // 0e2: aload 0
      // 0e3: ldc 1.5
      // 0e5: nop
      // 0e6: putfield g_3.zzf F
      // 0e9: bipush 1
      // 0ea: istore 4
      // 0ec: aload 0
      // 0ed: iload 3
      // 0ee: ifeq 15a
      // 0f1: getfield g_3.qqi I
      // 0f4: i2f
      // 0f5: aload 0
      // 0f6: getfield g_3.g9w I
      // 0f9: i2f
      // 0fa: fconst_2
      // 0fb: fdiv
      // 0fc: fcmpl
      // 0fd: ifle 13f
      // 100: goto 107
      // 103: invokestatic g_3.c (Loov;)Loov;
      // 106: athrow
      // 107: fload 2
      // 108: aload 0
      // 109: getfield g_3.g0x F
      // 10c: fcmpg
      // 10d: iload 3
      // 10e: ifeq 139
      // 111: goto 118
      // 114: invokestatic g_3.c (Loov;)Loov;
      // 117: athrow
      // 118: ifgt 128
      // 11b: goto 122
      // 11e: invokestatic g_3.c (Loov;)Loov;
      // 121: athrow
      // 122: bipush 0
      // 123: ireturn
      // 124: invokestatic g_3.c (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: aload 1
      // 12a: fload 2
      // 12b: aload 0
      // 12c: getfield g_3.g0x F
      // 12f: fsub
      // 130: invokevirtual g_3.vza (Lofh;F)V
      // 133: aload 0
      // 134: fload 2
      // 135: putfield g_3.g0x F
      // 138: bipush 0
      // 139: istore 4
      // 13b: iload 3
      // 13c: ifne 164
      // 13f: aload 0
      // 140: fload 2
      // 141: putfield g_3.g0x F
      // 144: aload 0
      // 145: aload 0
      // 146: getfield g_3.g9w I
      // 149: putfield g_3.qqi I
      // 14c: aload 0
      // 14d: aload 1
      // 14e: fload 2
      // 14f: invokevirtual g_3.vza (Lofh;F)V
      // 152: aload 0
      // 153: goto 15a
      // 156: invokestatic g_3.c (Loov;)Loov;
      // 159: athrow
      // 15a: aload 0
      // 15b: bipush 10
      // 15d: dup_x1
      // 15e: putfield g_3.x_3 I
      // 161: putfield g_3.gx0 I
      // 164: aload 0
      // 165: fconst_0
      // 166: putfield g_3.rth F
      // 169: aload 1
      // 16a: invokevirtual ofh.nra ()Li2h;
      // 16d: astore 5
      // 16f: aload 5
      // 171: iload 3
      // 172: ifeq 181
      // 175: ifnull 215
      // 178: goto 17f
      // 17b: invokestatic g_3.c (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 5
      // 181: instanceof g_3
      // 184: iload 3
      // 185: ifeq 1a7
      // 188: ifeq 1a2
      // 18b: goto 192
      // 18e: invokestatic g_3.c (Loov;)Loov;
      // 191: athrow
      // 192: aload 0
      // 193: aload 5
      // 195: checkcast g_3
      // 198: invokevirtual g_3.iar (Lg_3;)V
      // 19b: goto 1a2
      // 19e: invokestatic g_3.c (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 5
      // 1a4: instanceof ha9
      // 1a7: iload 3
      // 1a8: ifeq 1db
      // 1ab: ifeq 1cf
      // 1ae: goto 1b5
      // 1b1: invokestatic g_3.c (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: bipush 100
      // 1b8: putfield g_3.gig I
      // 1bb: aload 0
      // 1bc: aload 5
      // 1be: checkcast ha9
      // 1c1: putfield g_3.mxp Lha9;
      // 1c4: iload 3
      // 1c5: ifne 215
      // 1c8: goto 1cf
      // 1cb: invokestatic g_3.c (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 5
      // 1d1: instanceof gse
      // 1d4: goto 1db
      // 1d7: invokestatic g_3.c (Loov;)Loov;
      // 1da: athrow
      // 1db: iload 3
      // 1dc: ifeq 217
      // 1df: ifeq 215
      // 1e2: goto 1e9
      // 1e5: invokestatic g_3.c (Loov;)Loov;
      // 1e8: athrow
      // 1e9: aload 5
      // 1eb: checkcast gse
      // 1ee: astore 6
      // 1f0: aload 6
      // 1f2: invokevirtual gse.j1j ()Z
      // 1f5: iload 3
      // 1f6: ifeq 217
      // 1f9: ifeq 215
      // 1fc: goto 203
      // 1ff: invokestatic g_3.c (Loov;)Loov;
      // 202: athrow
      // 203: aload 0
      // 204: bipush 100
      // 206: putfield g_3.gig I
      // 209: aload 0
      // 20a: aconst_null
      // 20b: putfield g_3.mxp Lha9;
      // 20e: goto 215
      // 211: invokestatic g_3.c (Loov;)Loov;
      // 214: athrow
      // 215: iload 4
      // 217: iload 3
      // 218: ifeq 307
      // 21b: ifeq 2f6
      // 21e: goto 225
      // 221: invokestatic g_3.c (Loov;)Loov;
      // 224: athrow
      // 225: aload 0
      // 226: iload 3
      // 227: ifeq 254
      // 22a: goto 231
      // 22d: invokestatic g_3.c (Loov;)Loov;
      // 230: athrow
      // 231: getfield g_3.oay Lt9d;
      // 234: aload 0
      // 235: bipush 2
      // 236: invokevirtual t9d.qyn (Li2h;B)V
      // 239: aload 1
      // 23a: getstatic ofh.e7v Lofh;
      // 23d: if_acmpeq 252
      // 240: goto 247
      // 243: invokestatic g_3.c (Loov;)Loov;
      // 246: athrow
      // 247: aload 0
      // 248: invokevirtual g_3.dxm ()V
      // 24b: goto 252
      // 24e: invokestatic g_3.c (Loov;)Loov;
      // 251: athrow
      // 252: aload 5
      // 254: iload 3
      // 255: ifeq 264
      // 258: ifnull 2de
      // 25b: goto 262
      // 25e: invokestatic g_3.c (Loov;)Loov;
      // 261: athrow
      // 262: aload 5
      // 264: getfield i2h.o2v D
      // 267: aload 0
      // 268: getfield g_3.o2v D
      // 26b: dsub
      // 26c: dstore 6
      // 26e: aload 5
      // 270: getfield i2h.vbd D
      // 273: aload 0
      // 274: getfield g_3.vbd D
      // 277: dsub
      // 278: dstore 8
      // 27a: dload 6
      // 27c: dload 6
      // 27e: dmul
      // 27f: dload 8
      // 281: dload 8
      // 283: dmul
      // 284: dadd
      // 285: ldc2_w 1.0E-4
      // 288: dcmpg
      // 289: ifge 2b5
      // 28c: invokestatic java/lang/Math.random ()D
      // 28f: invokestatic java/lang/Math.random ()D
      // 292: dsub
      // 293: ldc2_w 0.01
      // 296: dmul
      // 297: dstore 6
      // 299: invokestatic java/lang/Math.random ()D
      // 29c: invokestatic java/lang/Math.random ()D
      // 29f: dsub
      // 2a0: ldc2_w 0.01
      // 2a3: dmul
      // 2a4: dstore 8
      // 2a6: iload 3
      // 2a7: ifeq 2da
      // 2aa: iload 3
      // 2ab: ifne 27a
      // 2ae: goto 2b5
      // 2b1: invokestatic g_3.c (Loov;)Loov;
      // 2b4: athrow
      // 2b5: aload 0
      // 2b6: dload 8
      // 2b8: dload 6
      // 2ba: invokestatic fe6.yr8 (DD)D
      // 2bd: ldc2_w 180.0
      // 2c0: dmul
      // 2c1: ldc2_w 3.141592653589793
      // 2c4: ddiv
      // 2c5: aload 0
      // 2c6: getfield g_3.x5k F
      // 2c9: f2d
      // 2ca: dsub
      // 2cb: d2f
      // 2cc: putfield g_3.rth F
      // 2cf: aload 0
      // 2d0: aload 5
      // 2d2: fload 2
      // 2d3: dload 6
      // 2d5: dload 8
      // 2d7: invokevirtual g_3.w4h (Li2h;FDD)V
      // 2da: iload 3
      // 2db: ifne 2f6
      // 2de: aload 0
      // 2df: invokestatic java/lang/Math.random ()D
      // 2e2: ldc2_w 2.0
      // 2e5: dmul
      // 2e6: d2i
      // 2e7: sipush 180
      // 2ea: imul
      // 2eb: i2f
      // 2ec: putfield g_3.rth F
      // 2ef: goto 2f6
      // 2f2: invokestatic g_3.c (Loov;)Loov;
      // 2f5: athrow
      // 2f6: aload 0
      // 2f7: iload 3
      // 2f8: ifeq 352
      // 2fb: invokevirtual g_3.i55 ()F
      // 2fe: fconst_0
      // 2ff: fcmpg
      // 300: goto 307
      // 303: invokestatic g_3.c (Loov;)Loov;
      // 306: athrow
      // 307: ifgt 34a
      // 30a: aload 0
      // 30b: invokevirtual g_3.ix6 ()Ljava/lang/String;
      // 30e: astore 6
      // 310: iload 3
      // 311: ifeq 346
      // 314: iload 4
      // 316: ifeq 341
      // 319: goto 320
      // 31c: invokestatic g_3.c (Loov;)Loov;
      // 31f: athrow
      // 320: aload 6
      // 322: ifnull 341
      // 325: goto 32c
      // 328: invokestatic g_3.c (Loov;)Loov;
      // 32b: athrow
      // 32c: aload 0
      // 32d: aload 6
      // 32f: aload 0
      // 330: invokevirtual g_3.o23 ()F
      // 333: aload 0
      // 334: invokevirtual g_3.b33 ()F
      // 337: invokevirtual g_3.lhu (Ljava/lang/String;FF)V
      // 33a: goto 341
      // 33d: invokestatic g_3.c (Loov;)Loov;
      // 340: athrow
      // 341: aload 0
      // 342: aload 1
      // 343: invokevirtual g_3.owu (Lofh;)V
      // 346: iload 3
      // 347: ifne 388
      // 34a: aload 0
      // 34b: goto 352
      // 34e: invokestatic g_3.c (Loov;)Loov;
      // 351: athrow
      // 352: invokevirtual g_3.wcg ()Ljava/lang/String;
      // 355: astore 6
      // 357: iload 4
      // 359: iload 3
      // 35a: ifeq 389
      // 35d: ifeq 388
      // 360: goto 367
      // 363: invokestatic g_3.c (Loov;)Loov;
      // 366: athrow
      // 367: aload 6
      // 369: ifnull 388
      // 36c: goto 373
      // 36f: invokestatic g_3.c (Loov;)Loov;
      // 372: athrow
      // 373: aload 0
      // 374: aload 6
      // 376: aload 0
      // 377: invokevirtual g_3.o23 ()F
      // 37a: aload 0
      // 37b: invokevirtual g_3.b33 ()F
      // 37e: invokevirtual g_3.lhu (Ljava/lang/String;FF)V
      // 381: goto 388
      // 384: invokestatic g_3.c (Loov;)Loov;
      // 387: athrow
      // 388: bipush 1
      // 389: ireturn
   }

   public void xgx(erg var1) {
      long var2 = e ^ 47788037730013L;
      this.lhu(b<"q">(25566, 6777279242018631682L ^ var2), 0.8F, 0.8F + this.oay.fsy.nextFloat() * 0.4F);
      int var10000 = t9d.c();
      int var5 = 0;
      int var4 = var10000;

      while (var5 < 5) {
         fqr var6 = new fqr(((double)this.z2d.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         var6 = var6.mx1(-this.y2i * (float) Math.PI / 180.0F);
         var6 = var6.av2(-this.x5k * (float) Math.PI / 180.0F);
         double var7 = (double)(-this.z2d.nextFloat()) * 0.6 - 0.3;
         fqr var9 = new fqr(((double)this.z2d.nextFloat() - 0.5) * 0.3, var7, 0.6);
         var9 = var9.mx1(-this.y2i * (float) Math.PI / 180.0F);
         var9 = var9.av2(-this.x5k * (float) Math.PI / 180.0F);
         var9 = var9.r2x(this.o2v, this.kfp + (double)this.c5y(), this.vbd);
         this.oay.zvy(w_0.ips, var9.lvi, var9.gn5, var9.bn2, var6.lvi, var6.gn5 + 0.05, var6.bn2, new int[]{u7m._lo(var1.gn1())});
         var5++;
         if (var4 != 0) {
            break;
         }
      }
   }

   public void owu(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 135912934212995
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: invokevirtual ofh.nra ()Li2h;
      // 00c: astore 5
      // 00e: invokestatic t9d.b ()I
      // 011: aload 0
      // 012: invokevirtual g_3.gy0 ()Lg_3;
      // 015: astore 6
      // 017: istore 4
      // 019: aload 0
      // 01a: iload 4
      // 01c: ifeq 057
      // 01f: getfield g_3.yv8 I
      // 022: iflt 055
      // 025: goto 02c
      // 028: invokestatic g_3.c (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 6
      // 02e: iload 4
      // 030: ifeq 057
      // 033: goto 03a
      // 036: invokestatic g_3.c (Loov;)Loov;
      // 039: athrow
      // 03a: ifnull 055
      // 03d: goto 044
      // 040: invokestatic g_3.c (Loov;)Loov;
      // 043: athrow
      // 044: aload 6
      // 046: aload 0
      // 047: aload 0
      // 048: getfield g_3.yv8 I
      // 04b: invokevirtual g_3.lfi (Li2h;I)V
      // 04e: goto 055
      // 051: invokestatic g_3.c (Loov;)Loov;
      // 054: athrow
      // 055: aload 5
      // 057: iload 4
      // 059: ifeq 068
      // 05c: ifnull 06c
      // 05f: goto 066
      // 062: invokestatic g_3.c (Loov;)Loov;
      // 065: athrow
      // 066: aload 5
      // 068: aload 0
      // 069: invokevirtual i2h.s5f (Lg_3;)V
      // 06c: aload 0
      // 06d: bipush 1
      // 06e: putfield g_3.pv7 Z
      // 071: aload 0
      // 072: invokevirtual g_3.ii6 ()Lw0s;
      // 075: invokevirtual w0s.llu ()V
      // 078: aload 0
      // 079: getfield g_3.oay Lt9d;
      // 07c: iload 4
      // 07e: ifeq 17e
      // 081: getfield t9d.v0f Z
      // 084: ifne 17a
      // 087: goto 08e
      // 08a: invokestatic g_3.c (Loov;)Loov;
      // 08d: athrow
      // 08e: bipush 0
      // 08f: istore 7
      // 091: aload 5
      // 093: instanceof ha9
      // 096: iload 4
      // 098: ifeq 0bf
      // 09b: ifeq 0af
      // 09e: goto 0a5
      // 0a1: invokestatic g_3.c (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 5
      // 0a7: checkcast g_3
      // 0aa: invokestatic hc0.h55 (Lg_3;)I
      // 0ad: istore 7
      // 0af: aload 0
      // 0b0: iload 4
      // 0b2: ifeq 17b
      // 0b5: invokevirtual g_3.cz_ ()Z
      // 0b8: goto 0bf
      // 0bb: invokestatic g_3.c (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifeq 17a
      // 0c2: aload 0
      // 0c3: getfield g_3.oay Lt9d;
      // 0c6: iload 4
      // 0c8: ifeq 17e
      // 0cb: goto 0d2
      // 0ce: invokestatic g_3.c (Loov;)Loov;
      // 0d1: athrow
      // 0d2: invokevirtual t9d.eir ()Lef9;
      // 0d5: sipush 2689
      // 0d8: ldc2_w 1148367375995810325
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0e6: ifeq 17a
      // 0e9: goto 0f0
      // 0ec: invokestatic g_3.c (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: aload 0
      // 0f2: getfield g_3.gig I
      // 0f5: iload 4
      // 0f7: ifeq 10c
      // 0fa: goto 101
      // 0fd: invokestatic g_3.c (Loov;)Loov;
      // 100: athrow
      // 101: ifle 10f
      // 104: goto 10b
      // 107: invokestatic g_3.c (Loov;)Loov;
      // 10a: athrow
      // 10b: bipush 1
      // 10c: goto 110
      // 10f: bipush 0
      // 110: iload 7
      // 112: invokevirtual g_3.ir3 (ZI)V
      // 115: aload 0
      // 116: aload 0
      // 117: getfield g_3.gig I
      // 11a: iload 4
      // 11c: ifeq 12a
      // 11f: ifle 12d
      // 122: goto 129
      // 125: invokestatic g_3.c (Loov;)Loov;
      // 128: athrow
      // 129: bipush 1
      // 12a: goto 12e
      // 12d: bipush 0
      // 12e: iload 7
      // 130: invokevirtual g_3.ly2 (ZI)V
      // 133: aload 0
      // 134: iload 4
      // 136: ifeq 17b
      // 139: getfield g_3.gig I
      // 13c: ifle 17a
      // 13f: goto 146
      // 142: invokestatic g_3.c (Loov;)Loov;
      // 145: athrow
      // 146: aload 0
      // 147: iload 4
      // 149: ifeq 17b
      // 14c: goto 153
      // 14f: invokestatic g_3.c (Loov;)Loov;
      // 152: athrow
      // 153: getfield g_3.z2d Ljava/util/Random;
      // 156: invokevirtual java/util/Random.nextFloat ()F
      // 159: ldc 0.025
      // 15b: nop
      // 15c: iload 7
      // 15e: i2f
      // 15f: ldc 0.01
      // 161: nop
      // 162: fmul
      // 163: fadd
      // 164: fcmpg
      // 165: ifge 17a
      // 168: goto 16f
      // 16b: invokestatic g_3.c (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 0
      // 170: invokevirtual g_3.z3m ()V
      // 173: goto 17a
      // 176: invokestatic g_3.c (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield g_3.oay Lt9d;
      // 17e: aload 0
      // 17f: bipush 3
      // 180: invokevirtual t9d.qyn (Li2h;B)V
      // 183: return
   }

   public void ly2(boolean var1, int var2) {
   }

   public void w4h(i2h param1, float param2, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 7
      // 05: aload 0
      // 06: getfield g_3.z2d Ljava/util/Random;
      // 09: invokevirtual java/util/Random.nextDouble ()D
      // 0c: aload 0
      // 0d: getstatic m6d.nen Lw9p;
      // 10: invokevirtual g_3.dgt (Lw9p;)L_4o;
      // 13: invokeinterface _4o.nz5 ()D 1
      // 18: iload 7
      // 1a: ifeq 3c
      // 1d: dcmpl
      // 1e: iflt c1
      // 21: goto 28
      // 24: invokestatic g_3.c (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: bipush 1
      // 2a: putfield g_3.u19 Z
      // 2d: dload 3
      // 2e: dload 3
      // 2f: dmul
      // 30: dload 5
      // 32: dload 5
      // 34: dmul
      // 35: goto 3c
      // 38: invokestatic g_3.c (Loov;)Loov;
      // 3b: athrow
      // 3c: dadd
      // 3d: invokestatic fe6.dii (D)F
      // 40: fstore 8
      // 42: ldc 0.4
      // 44: nop
      // 45: fstore 9
      // 47: aload 0
      // 48: dup
      // 49: getfield g_3.icv D
      // 4c: ldc2_w 2.0
      // 4f: ddiv
      // 50: putfield g_3.icv D
      // 53: aload 0
      // 54: dup
      // 55: getfield g_3.mop D
      // 58: ldc2_w 2.0
      // 5b: ddiv
      // 5c: putfield g_3.mop D
      // 5f: aload 0
      // 60: dup
      // 61: getfield g_3.bw4 D
      // 64: ldc2_w 2.0
      // 67: ddiv
      // 68: putfield g_3.bw4 D
      // 6b: aload 0
      // 6c: dup
      // 6d: getfield g_3.icv D
      // 70: dload 3
      // 71: fload 8
      // 73: f2d
      // 74: ddiv
      // 75: fload 9
      // 77: f2d
      // 78: dmul
      // 79: dsub
      // 7a: putfield g_3.icv D
      // 7d: aload 0
      // 7e: dup
      // 7f: getfield g_3.mop D
      // 82: fload 9
      // 84: f2d
      // 85: dadd
      // 86: putfield g_3.mop D
      // 89: aload 0
      // 8a: dup
      // 8b: getfield g_3.bw4 D
      // 8e: dload 5
      // 90: fload 8
      // 92: f2d
      // 93: ddiv
      // 94: fload 9
      // 96: f2d
      // 97: dmul
      // 98: dsub
      // 99: putfield g_3.bw4 D
      // 9c: aload 0
      // 9d: iload 7
      // 9f: ifeq bb
      // a2: getfield g_3.mop D
      // a5: ldc2_w 0.4000000059604645
      // a8: dcmpl
      // a9: ifle c1
      // ac: goto b3
      // af: invokestatic g_3.c (Loov;)Loov;
      // b2: athrow
      // b3: aload 0
      // b4: goto bb
      // b7: invokestatic g_3.c (Loov;)Loov;
      // ba: athrow
      // bb: ldc2_w 0.4000000059604645
      // be: putfield g_3.mop D
      // c1: return
   }

   public String wcg() {
      long var1 = e ^ 69305816427546L;
      return b<"q">(2960, 8050651009332910721L ^ var1);
   }

   public String ix6() {
      long var1 = e ^ 542304639572L;
      return b<"q">(502, 2118226004541941409L ^ var1);
   }

   public void z3m() {
   }

   public void ir3(boolean var1, int var2) {
   }

   public boolean z2m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield g_3.o2v D
      // 04: invokestatic fe6.jqf (D)I
      // 07: istore 2
      // 08: aload 0
      // 09: invokevirtual g_3.aaw ()Lnh4;
      // 0c: getfield nh4.bx_ D
      // 0f: invokestatic fe6.jqf (D)I
      // 12: istore 3
      // 13: aload 0
      // 14: getfield g_3.vbd D
      // 17: invokestatic fe6.jqf (D)I
      // 1a: istore 4
      // 1c: invokestatic t9d.b ()I
      // 1f: aload 0
      // 20: getfield g_3.oay Lt9d;
      // 23: new mew
      // 26: dup
      // 27: iload 2
      // 28: iload 3
      // 29: iload 4
      // 2b: invokespecial mew.<init> (III)V
      // 2e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 31: invokeinterface zfz.r_y ()Le0x; 1
      // 36: astore 5
      // 38: istore 1
      // 39: aload 5
      // 3b: getstatic ox_.h49 Le0x;
      // 3e: iload 1
      // 3f: ifeq 58
      // 42: if_acmpeq 5b
      // 45: goto 4c
      // 48: invokestatic g_3.c (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 5
      // 4e: getstatic ox_.s25 Le0x;
      // 51: goto 58
      // 54: invokestatic g_3.c (Loov;)Loov;
      // 57: athrow
      // 58: if_acmpne 94
      // 5b: aload 0
      // 5c: instanceof ha9
      // 5f: iload 1
      // 60: ifeq 91
      // 63: goto 6a
      // 66: invokestatic g_3.c (Loov;)Loov;
      // 69: athrow
      // 6a: ifeq 90
      // 6d: goto 74
      // 70: invokestatic g_3.c (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: checkcast ha9
      // 78: invokevirtual ha9.myu ()Z
      // 7b: iload 1
      // 7c: ifeq 91
      // 7f: goto 86
      // 82: invokestatic g_3.c (Loov;)Loov;
      // 85: athrow
      // 86: ifne 94
      // 89: goto 90
      // 8c: invokestatic g_3.c (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 1
      // 91: goto 95
      // 94: bipush 0
      // 95: ireturn
   }

   @Override
   public boolean gzr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield g_3.ma9 Z
      // 08: iload 1
      // 09: ifne 23
      // 0c: ifne 35
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual g_3.i55 ()F
      // 1a: fconst_0
      // 1b: fcmpl
      // 1c: goto 23
      // 1f: invokestatic g_3.c (Loov;)Loov;
      // 22: athrow
      // 23: iload 1
      // 24: ifne 32
      // 27: ifle 35
      // 2a: goto 31
      // 2d: invokestatic g_3.c (Loov;)Loov;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   @Override
   public void ibc(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: fload 1
      // 02: fload 2
      // 03: invokespecial i2h.ibc (FF)V
      // 06: invokestatic t9d.b ()I
      // 09: aload 0
      // 0a: getstatic mcs.y0p Lmcs;
      // 0d: invokevirtual g_3.dhd (Lmcs;)Lsdj;
      // 10: astore 4
      // 12: istore 3
      // 13: aload 4
      // 15: iload 3
      // 16: ifeq 25
      // 19: ifnull 2e
      // 1c: goto 23
      // 1f: invokestatic g_3.c (Loov;)Loov;
      // 22: athrow
      // 23: aload 4
      // 25: invokevirtual sdj.tus ()I
      // 28: bipush 1
      // 29: iadd
      // 2a: i2f
      // 2b: goto 2f
      // 2e: fconst_0
      // 2f: fstore 5
      // 31: fload 1
      // 32: ldc 3.0
      // 34: nop
      // 35: fsub
      // 36: fload 5
      // 38: fsub
      // 39: fload 2
      // 3a: fmul
      // 3b: invokestatic fe6.v1i (F)I
      // 3e: istore 6
      // 40: iload 6
      // 42: iload 3
      // 43: ifeq 75
      // 46: ifle e7
      // 49: goto 50
      // 4c: invokestatic g_3.c (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 0
      // 52: iload 6
      // 54: invokevirtual g_3.rz6 (I)Ljava/lang/String;
      // 57: fconst_1
      // 58: fconst_1
      // 59: invokevirtual g_3.lhu (Ljava/lang/String;FF)V
      // 5c: aload 0
      // 5d: getstatic ofh.m8d Lofh;
      // 60: iload 6
      // 62: i2f
      // 63: invokevirtual g_3.m1t (Lofh;F)Z
      // 66: pop
      // 67: aload 0
      // 68: getfield g_3.o2v D
      // 6b: invokestatic fe6.jqf (D)I
      // 6e: goto 75
      // 71: invokestatic g_3.c (Loov;)Loov;
      // 74: athrow
      // 75: istore 7
      // 77: aload 0
      // 78: getfield g_3.kfp D
      // 7b: ldc2_w 0.20000000298023224
      // 7e: dsub
      // 7f: invokestatic fe6.jqf (D)I
      // 82: istore 8
      // 84: aload 0
      // 85: getfield g_3.vbd D
      // 88: invokestatic fe6.jqf (D)I
      // 8b: istore 9
      // 8d: aload 0
      // 8e: getfield g_3.oay Lt9d;
      // 91: new mew
      // 94: dup
      // 95: iload 7
      // 97: iload 8
      // 99: iload 9
      // 9b: invokespecial mew.<init> (III)V
      // 9e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // a1: invokeinterface zfz.r_y ()Le0x; 1
      // a6: astore 10
      // a8: aload 10
      // aa: iload 3
      // ab: ifeq c7
      // ae: invokevirtual e0x.p1r ()Lp3y;
      // b1: getstatic p3y.cei Lp3y;
      // b4: if_acmpeq e7
      // b7: goto be
      // ba: invokestatic g_3.c (Loov;)Loov;
      // bd: athrow
      // be: aload 10
      // c0: goto c7
      // c3: invokestatic g_3.c (Loov;)Loov;
      // c6: athrow
      // c7: getfield e0x.zu6 Le0x$zvv;
      // ca: astore 11
      // cc: aload 0
      // cd: aload 11
      // cf: invokevirtual e0x$zvv.i3r ()Ljava/lang/String;
      // d2: aload 11
      // d4: invokevirtual e0x$zvv.dnt ()F
      // d7: ldc 0.5
      // d9: nop
      // da: fmul
      // db: aload 11
      // dd: invokevirtual e0x$zvv.kjj ()F
      // e0: ldc 0.75
      // e2: nop
      // e3: fmul
      // e4: invokevirtual g_3.lhu (Ljava/lang/String;FF)V
      // e7: return
   }

   public String rz6(int var1) {
      long var2 = e ^ 46938323352764L;

      try {
         if (var1 > 4) {
            return b<"q">(10258, 412396489804343736L ^ var2);
         }
      } catch (oov var4) {
         throw c(var4);
      }

      return b<"q">(25938, 1550661697089905897L ^ var2);
   }

   @Override
   public void h38() {
      this.gx0 = this.x_3 = 10;
      this.rth = 0.0F;
   }

   public int y5z() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic t9d.b ()I
      // 05: aload 0
      // 06: invokevirtual g_3.n7a ()[Lerg;
      // 09: astore 3
      // 0a: istore 1
      // 0b: aload 3
      // 0c: arraylength
      // 0d: istore 4
      // 0f: bipush 0
      // 10: istore 5
      // 12: iload 5
      // 14: iload 4
      // 16: if_icmpge 6c
      // 19: aload 3
      // 1a: iload 5
      // 1c: aaload
      // 1d: astore 6
      // 1f: iload 1
      // 20: ifeq 68
      // 23: aload 6
      // 25: ifnull 65
      // 28: goto 2f
      // 2b: invokestatic g_3.c (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 6
      // 31: invokevirtual erg.gn1 ()Lu7m;
      // 34: instanceof jpt
      // 37: iload 1
      // 38: ifeq 5e
      // 3b: goto 42
      // 3e: invokestatic g_3.c (Loov;)Loov;
      // 41: athrow
      // 42: ifeq 65
      // 45: goto 4c
      // 48: invokestatic g_3.c (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 6
      // 4e: invokevirtual erg.gn1 ()Lu7m;
      // 51: checkcast jpt
      // 54: getfield jpt._wl I
      // 57: goto 5e
      // 5a: invokestatic g_3.c (Loov;)Loov;
      // 5d: athrow
      // 5e: istore 7
      // 60: iload 2
      // 61: iload 7
      // 63: iadd
      // 64: istore 2
      // 65: iinc 5 1
      // 68: iload 1
      // 69: ifne 12
      // 6c: iload 2
      // 6d: ireturn
   }

   public void puw(float var1) {
   }

   public float phv(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual ofh.e8m ()Z
      // 08: iload 3
      // 09: ifne 24
      // 0c: ifne 39
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: bipush 25
      // 18: aload 0
      // 19: invokevirtual g_3.y5z ()I
      // 1c: isub
      // 1d: goto 24
      // 20: invokestatic g_3.c (Loov;)Loov;
      // 23: athrow
      // 24: istore 4
      // 26: fload 2
      // 27: iload 4
      // 29: i2f
      // 2a: fmul
      // 2b: fstore 5
      // 2d: aload 0
      // 2e: fload 2
      // 2f: invokevirtual g_3.puw (F)V
      // 32: fload 5
      // 34: ldc 25.0
      // 36: nop
      // 37: fdiv
      // 38: fstore 2
      // 39: fload 2
      // 3a: freturn
   }

   public float yef(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual ofh.nk0 ()Z
      // 08: iload 3
      // 09: ifne 23
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: fload 2
      // 17: freturn
      // 18: invokestatic g_3.c (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getstatic mcs.y3z Lmcs;
      // 20: invokevirtual g_3.cab (Lmcs;)Z
      // 23: iload 3
      // 24: ifne 67
      // 27: ifeq 64
      // 2a: goto 31
      // 2d: invokestatic g_3.c (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: getstatic ofh.r2b Lofh;
      // 35: if_acmpeq 64
      // 38: goto 3f
      // 3b: invokestatic g_3.c (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getstatic mcs.y3z Lmcs;
      // 43: invokevirtual g_3.dhd (Lmcs;)Lsdj;
      // 46: invokevirtual sdj.tus ()I
      // 49: bipush 1
      // 4a: iadd
      // 4b: bipush 5
      // 4c: imul
      // 4d: istore 4
      // 4f: bipush 25
      // 51: iload 4
      // 53: isub
      // 54: istore 5
      // 56: fload 2
      // 57: iload 5
      // 59: i2f
      // 5a: fmul
      // 5b: fstore 6
      // 5d: fload 6
      // 5f: ldc 25.0
      // 61: nop
      // 62: fdiv
      // 63: fstore 2
      // 64: fload 2
      // 65: fconst_0
      // 66: fcmpg
      // 67: iload 3
      // 68: ifne 83
      // 6b: ifgt 7b
      // 6e: goto 75
      // 71: invokestatic g_3.c (Loov;)Loov;
      // 74: athrow
      // 75: fconst_0
      // 76: freturn
      // 77: invokestatic g_3.c (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: invokevirtual g_3.n7a ()[Lerg;
      // 7f: aload 1
      // 80: invokestatic hc0.x2d ([Lerg;Lofh;)I
      // 83: istore 4
      // 85: iload 4
      // 87: iload 3
      // 88: ifne 9d
      // 8b: bipush 20
      // 8d: if_icmple 9b
      // 90: goto 97
      // 93: invokestatic g_3.c (Loov;)Loov;
      // 96: athrow
      // 97: bipush 20
      // 99: istore 4
      // 9b: iload 4
      // 9d: iload 3
      // 9e: ifne ad
      // a1: ifle d9
      // a4: goto ab
      // a7: invokestatic g_3.c (Loov;)Loov;
      // aa: athrow
      // ab: iload 4
      // ad: bipush 20
      // af: iload 3
      // b0: ifne c8
      // b3: if_icmpgt d9
      // b6: goto bd
      // b9: invokestatic g_3.c (Loov;)Loov;
      // bc: athrow
      // bd: bipush 25
      // bf: iload 4
      // c1: goto c8
      // c4: invokestatic g_3.c (Loov;)Loov;
      // c7: athrow
      // c8: isub
      // c9: istore 5
      // cb: fload 2
      // cc: iload 5
      // ce: i2f
      // cf: fmul
      // d0: fstore 6
      // d2: fload 6
      // d4: ldc 25.0
      // d6: nop
      // d7: fdiv
      // d8: fstore 2
      // d9: fload 2
      // da: freturn
   }

   public void vza(ofh param1, float param2) {
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
      // 05: aload 1
      // 06: iload 3
      // 07: ifne 20
      // 0a: invokevirtual g_3.nss (Lofh;)Z
      // 0d: ifne 7b
      // 10: goto 17
      // 13: invokestatic g_3.c (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: fload 2
      // 1a: invokevirtual g_3.phv (Lofh;F)F
      // 1d: fstore 2
      // 1e: aload 0
      // 1f: aload 1
      // 20: fload 2
      // 21: invokevirtual g_3.yef (Lofh;F)F
      // 24: fstore 2
      // 25: fload 2
      // 26: fstore 4
      // 28: fload 2
      // 29: aload 0
      // 2a: invokevirtual g_3._xk ()F
      // 2d: fsub
      // 2e: fconst_0
      // 2f: invokestatic java/lang/Math.max (FF)F
      // 32: fstore 2
      // 33: aload 0
      // 34: aload 0
      // 35: invokevirtual g_3._xk ()F
      // 38: fload 4
      // 3a: fload 2
      // 3b: fsub
      // 3c: fsub
      // 3d: invokevirtual g_3.pr9 (F)V
      // 40: fload 2
      // 41: iload 3
      // 42: ifne 5c
      // 45: fconst_0
      // 46: fcmpl
      // 47: ifeq 7b
      // 4a: goto 51
      // 4d: invokestatic g_3.c (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: invokevirtual g_3.i55 ()F
      // 55: goto 5c
      // 58: invokestatic g_3.c (Loov;)Loov;
      // 5b: athrow
      // 5c: fstore 5
      // 5e: aload 0
      // 5f: fload 5
      // 61: fload 2
      // 62: fsub
      // 63: invokevirtual g_3.uh3 (F)V
      // 66: aload 0
      // 67: invokevirtual g_3.ii6 ()Lw0s;
      // 6a: aload 1
      // 6b: fload 5
      // 6d: fload 2
      // 6e: invokevirtual w0s.dp2 (Lofh;FF)V
      // 71: aload 0
      // 72: aload 0
      // 73: invokevirtual g_3._xk ()F
      // 76: fload 2
      // 77: fsub
      // 78: invokevirtual g_3.pr9 (F)V
      // 7b: return
   }

   public w0s ii6() {
      return this.sgr;
   }

   public g_3 gy0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield g_3.sgr Lw0s;
      // 08: invokevirtual w0s.bnc ()Lg_3;
      // 0b: iload 1
      // 0c: ifne 28
      // 0f: ifnull 27
      // 12: goto 19
      // 15: invokestatic g_3.c (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield g_3.sgr Lw0s;
      // 1d: invokevirtual w0s.bnc ()Lg_3;
      // 20: goto 65
      // 23: invokestatic g_3.c (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield g_3.mxp Lha9;
      // 2b: iload 1
      // 2c: ifne 48
      // 2f: ifnull 44
      // 32: goto 39
      // 35: invokestatic g_3.c (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield g_3.mxp Lha9;
      // 3d: goto 65
      // 40: invokestatic g_3.c (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield g_3._7v Lg_3;
      // 48: iload 1
      // 49: ifne 61
      // 4c: ifnull 64
      // 4f: goto 56
      // 52: invokestatic g_3.c (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: getfield g_3._7v Lg_3;
      // 5a: goto 61
      // 5d: invokestatic g_3.c (Loov;)Loov;
      // 60: athrow
      // 61: goto 65
      // 64: aconst_null
      // 65: areturn
   }

   public final float axb() {
      return (float)this.dgt(m6d.t9k).nz5();
   }

   public final int jj5() {
      return this.oit.miz(9);
   }

   public final void dk9(int var1) {
      this.oit.c66(9, (byte)var1);
   }

   private int w8p() {
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
      // 05: getstatic mcs.izk Lmcs;
      // 08: invokevirtual g_3.cab (Lmcs;)Z
      // 0b: iload 1
      // 0c: ifeq 38
      // 0f: ifeq 31
      // 12: goto 19
      // 15: invokestatic g_3.c (Loov;)Loov;
      // 18: athrow
      // 19: bipush 6
      // 1b: bipush 1
      // 1c: aload 0
      // 1d: getstatic mcs.izk Lmcs;
      // 20: invokevirtual g_3.dhd (Lmcs;)Lsdj;
      // 23: invokevirtual sdj.tus ()I
      // 26: iadd
      // 27: bipush 1
      // 28: imul
      // 29: isub
      // 2a: goto 63
      // 2d: invokestatic g_3.c (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getstatic mcs._es Lmcs;
      // 35: invokevirtual g_3.cab (Lmcs;)Z
      // 38: iload 1
      // 39: ifeq 5e
      // 3c: ifeq 61
      // 3f: goto 46
      // 42: invokestatic g_3.c (Loov;)Loov;
      // 45: athrow
      // 46: bipush 6
      // 48: bipush 1
      // 49: aload 0
      // 4a: getstatic mcs._es Lmcs;
      // 4d: invokevirtual g_3.dhd (Lmcs;)Lsdj;
      // 50: invokevirtual sdj.tus ()I
      // 53: iadd
      // 54: bipush 2
      // 55: imul
      // 56: iadd
      // 57: goto 5e
      // 5a: invokestatic g_3.c (Loov;)Loov;
      // 5d: athrow
      // 5e: goto 63
      // 61: bipush 6
      // 63: ireturn
   }

   public void hgb() {
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
      // 05: getfield g_3.prr Z
      // 08: iload 1
      // 09: ifeq 71
      // 0c: ifeq 4e
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield g_3.aw1 I
      // 1a: iload 1
      // 1b: ifeq 71
      // 1e: goto 25
      // 21: invokestatic g_3.c (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: invokespecial g_3.w8p ()I
      // 29: bipush 2
      // 2a: idiv
      // 2b: if_icmpge 4e
      // 2e: goto 35
      // 31: invokestatic g_3.c (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield g_3.aw1 I
      // 39: iload 1
      // 3a: ifeq 71
      // 3d: goto 44
      // 40: invokestatic g_3.c (Loov;)Loov;
      // 43: athrow
      // 44: ifge 92
      // 47: goto 4e
      // 4a: invokestatic g_3.c (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: bipush -1
      // 50: putfield g_3.aw1 I
      // 53: aload 0
      // 54: bipush 1
      // 55: putfield g_3.prr Z
      // 58: aload 0
      // 59: getfield g_3.oay Lt9d;
      // 5c: iload 1
      // 5d: ifeq 7f
      // 60: goto 67
      // 63: invokestatic g_3.c (Loov;)Loov;
      // 66: athrow
      // 67: instanceof dug
      // 6a: goto 71
      // 6d: invokestatic g_3.c (Loov;)Loov;
      // 70: athrow
      // 71: ifeq 92
      // 74: aload 0
      // 75: getfield g_3.oay Lt9d;
      // 78: goto 7f
      // 7b: invokestatic g_3.c (Loov;)Loov;
      // 7e: athrow
      // 7f: checkcast dug
      // 82: invokevirtual dug.fp4 ()Lqpc;
      // 85: aload 0
      // 86: new net/minecraft/network/play/server/S0BPacketAnimation
      // 89: dup
      // 8a: aload 0
      // 8b: bipush 0
      // 8c: invokespecial net/minecraft/network/play/server/S0BPacketAnimation.<init> (Li2h;I)V
      // 8f: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // 92: return
   }

   @Override
   public void ptf(byte param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 2
      // 06: iload 2
      // 07: ifeq 85
      // 0a: if_icmpne 7c
      // 0d: goto 14
      // 10: invokestatic g_3.c (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: ldc 1.5
      // 17: nop
      // 18: putfield g_3.zzf F
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield g_3.g9w I
      // 20: putfield g_3.qqi I
      // 23: aload 0
      // 24: aload 0
      // 25: bipush 10
      // 27: dup_x1
      // 28: putfield g_3.x_3 I
      // 2b: putfield g_3.gx0 I
      // 2e: aload 0
      // 2f: fconst_0
      // 30: putfield g_3.rth F
      // 33: aload 0
      // 34: invokevirtual g_3.wcg ()Ljava/lang/String;
      // 37: astore 3
      // 38: iload 2
      // 39: ifeq 78
      // 3c: aload 3
      // 3d: ifnull 6f
      // 40: goto 47
      // 43: invokestatic g_3.c (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: aload 0
      // 49: invokevirtual g_3.wcg ()Ljava/lang/String;
      // 4c: aload 0
      // 4d: invokevirtual g_3.o23 ()F
      // 50: aload 0
      // 51: getfield g_3.z2d Ljava/util/Random;
      // 54: invokevirtual java/util/Random.nextFloat ()F
      // 57: aload 0
      // 58: getfield g_3.z2d Ljava/util/Random;
      // 5b: invokevirtual java/util/Random.nextFloat ()F
      // 5e: fsub
      // 5f: ldc 0.2
      // 61: nop
      // 62: fmul
      // 63: fconst_1
      // 64: fadd
      // 65: invokevirtual g_3.lhu (Ljava/lang/String;FF)V
      // 68: goto 6f
      // 6b: invokestatic g_3.c (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: getstatic ofh.f27 Lofh;
      // 73: fconst_0
      // 74: invokevirtual g_3.m1t (Lofh;F)Z
      // 77: pop
      // 78: iload 2
      // 79: ifne e0
      // 7c: iload 1
      // 7d: bipush 3
      // 7e: goto 85
      // 81: invokestatic g_3.c (Loov;)Loov;
      // 84: athrow
      // 85: if_icmpne d4
      // 88: aload 0
      // 89: invokevirtual g_3.ix6 ()Ljava/lang/String;
      // 8c: astore 3
      // 8d: iload 2
      // 8e: ifeq d0
      // 91: aload 3
      // 92: ifnull c4
      // 95: goto 9c
      // 98: invokestatic g_3.c (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: aload 0
      // 9e: invokevirtual g_3.ix6 ()Ljava/lang/String;
      // a1: aload 0
      // a2: invokevirtual g_3.o23 ()F
      // a5: aload 0
      // a6: getfield g_3.z2d Ljava/util/Random;
      // a9: invokevirtual java/util/Random.nextFloat ()F
      // ac: aload 0
      // ad: getfield g_3.z2d Ljava/util/Random;
      // b0: invokevirtual java/util/Random.nextFloat ()F
      // b3: fsub
      // b4: ldc 0.2
      // b6: nop
      // b7: fmul
      // b8: fconst_1
      // b9: fadd
      // ba: invokevirtual g_3.lhu (Ljava/lang/String;FF)V
      // bd: goto c4
      // c0: invokestatic g_3.c (Loov;)Loov;
      // c3: athrow
      // c4: aload 0
      // c5: fconst_0
      // c6: invokevirtual g_3.uh3 (F)V
      // c9: aload 0
      // ca: getstatic ofh.f27 Lofh;
      // cd: invokevirtual g_3.owu (Lofh;)V
      // d0: iload 2
      // d1: ifne e0
      // d4: aload 0
      // d5: iload 1
      // d6: invokespecial i2h.ptf (B)V
      // d9: goto e0
      // dc: invokestatic g_3.c (Loov;)Loov;
      // df: athrow
      // e0: return
   }

   @Override
   public void d0m() {
      this.m1t(ofh.r2b, 4.0F);
   }

   public void inv() {
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
      // 05: invokespecial g_3.w8p ()I
      // 08: istore 2
      // 09: aload 0
      // 0a: iload 1
      // 0b: ifeq 5c
      // 0e: getfield g_3.prr Z
      // 11: ifeq 54
      // 14: goto 1b
      // 17: invokestatic g_3.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: dup
      // 1d: getfield g_3.aw1 I
      // 20: bipush 1
      // 21: iadd
      // 22: putfield g_3.aw1 I
      // 25: aload 0
      // 26: iload 1
      // 27: ifeq 61
      // 2a: goto 31
      // 2d: invokestatic g_3.c (Loov;)Loov;
      // 30: athrow
      // 31: getfield g_3.aw1 I
      // 34: iload 2
      // 35: if_icmplt 60
      // 38: goto 3f
      // 3b: invokestatic g_3.c (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 0
      // 41: putfield g_3.aw1 I
      // 44: aload 0
      // 45: bipush 0
      // 46: putfield g_3.prr Z
      // 49: iload 1
      // 4a: ifne 60
      // 4d: goto 54
      // 50: invokestatic g_3.c (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: goto 5c
      // 58: invokestatic g_3.c (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush 0
      // 5d: putfield g_3.aw1 I
      // 60: aload 0
      // 61: aload 0
      // 62: getfield g_3.aw1 I
      // 65: i2f
      // 66: iload 2
      // 67: i2f
      // 68: fdiv
      // 69: putfield g_3.sti F
      // 6c: return
   }

   public _4o dgt(w9p var1) {
      return this.s_a().d3k(var1);
   }

   public osd s_a() {
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
      // 05: getfield g_3.kpa Losd;
      // 08: iload 1
      // 09: ifeq 2c
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new uya
      // 1a: dup
      // 1b: invokespecial uya.<init> ()V
      // 1e: putfield g_3.kpa Losd;
      // 21: goto 28
      // 24: invokestatic g_3.c (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield g_3.kpa Losd;
      // 2c: areturn
   }

   public n1e fhc() {
      return n1e.y3x;
   }

   public abstract erg tsc();

   public abstract erg rnq(int var1);

   public abstract erg wfg(int var1);

   @Override
   public abstract void fga(int var1, erg var2);

   @Override
   public void fqc(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokespecial i2h.fqc (Z)V
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: getstatic m6d.w7i Lw9p;
      // 0c: invokevirtual g_3.dgt (Lw9p;)L_4o;
      // 0f: astore 3
      // 10: istore 2
      // 11: aload 3
      // 12: iload 2
      // 13: ifne 30
      // 16: getstatic g_3.dmv Ljava/util/UUID;
      // 19: invokeinterface _4o.aq3 (Ljava/util/UUID;)Lxk5; 2
      // 1e: ifnull 38
      // 21: goto 28
      // 24: invokestatic g_3.c (Loov;)Loov;
      // 27: athrow
      // 28: aload 3
      // 29: goto 30
      // 2c: invokestatic g_3.c (Loov;)Loov;
      // 2f: athrow
      // 30: getstatic g_3.mo6 Lxk5;
      // 33: invokeinterface _4o.se8 (Lxk5;)V 2
      // 38: iload 1
      // 39: ifeq 4c
      // 3c: aload 3
      // 3d: getstatic g_3.mo6 Lxk5;
      // 40: invokeinterface _4o.vcr (Lxk5;)V 2
      // 45: goto 4c
      // 48: invokestatic g_3.c (Loov;)Loov;
      // 4b: athrow
      // 4c: return
   }

   @Override
   public abstract erg[] n7a();

   public float o23() {
      return 1.0F;
   }

   public float b33() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 35
      // 09: invokevirtual g_3.ejl ()Z
      // 0c: ifeq 34
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield g_3.z2d Ljava/util/Random;
      // 1a: invokevirtual java/util/Random.nextFloat ()F
      // 1d: aload 0
      // 1e: getfield g_3.z2d Ljava/util/Random;
      // 21: invokevirtual java/util/Random.nextFloat ()F
      // 24: fsub
      // 25: ldc 0.2
      // 27: nop
      // 28: fmul
      // 29: ldc 1.5
      // 2b: nop
      // 2c: fadd
      // 2d: goto 49
      // 30: invokestatic g_3.c (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getfield g_3.z2d Ljava/util/Random;
      // 38: invokevirtual java/util/Random.nextFloat ()F
      // 3b: aload 0
      // 3c: getfield g_3.z2d Ljava/util/Random;
      // 3f: invokevirtual java/util/Random.nextFloat ()F
      // 42: fsub
      // 43: ldc 0.2
      // 45: nop
      // 46: fmul
      // 47: fconst_1
      // 48: fadd
      // 49: freturn
   }

   public boolean a81() {
      int var1 = t9d.c();

      try {
         float var3;
         int var10000 = (var3 = this.i55() - 0.0F) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return (boolean)0;
   }

   public void vux(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield i2h.o2v D
      // 004: dstore 3
      // 005: aload 1
      // 006: invokevirtual i2h.aaw ()Lnh4;
      // 009: getfield nh4.bx_ D
      // 00c: aload 1
      // 00d: getfield i2h.ikl F
      // 010: f2d
      // 011: dadd
      // 012: dstore 5
      // 014: invokestatic t9d.b ()I
      // 017: aload 1
      // 018: getfield i2h.vbd D
      // 01b: dstore 7
      // 01d: istore 2
      // 01e: bipush 1
      // 01f: istore 9
      // 021: iload 9
      // 023: ineg
      // 024: istore 10
      // 026: iload 10
      // 028: iload 9
      // 02a: if_icmpgt 181
      // 02d: iload 9
      // 02f: ineg
      // 030: istore 11
      // 032: iload 11
      // 034: iload 9
      // 036: if_icmpge 17a
      // 039: iload 10
      // 03b: iload 2
      // 03c: ifeq 028
      // 03f: iload 2
      // 040: ifeq 074
      // 043: ifne 064
      // 046: goto 04d
      // 049: invokestatic g_3.c (Loov;)Loov;
      // 04c: athrow
      // 04d: iload 11
      // 04f: iload 2
      // 050: ifeq 074
      // 053: goto 05a
      // 056: invokestatic g_3.c (Loov;)Loov;
      // 059: athrow
      // 05a: ifeq 173
      // 05d: goto 064
      // 060: invokestatic g_3.c (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: getfield g_3.o2v D
      // 068: iload 10
      // 06a: i2d
      // 06b: dadd
      // 06c: d2i
      // 06d: goto 074
      // 070: invokestatic g_3.c (Loov;)Loov;
      // 073: athrow
      // 074: istore 12
      // 076: aload 0
      // 077: getfield g_3.vbd D
      // 07a: iload 11
      // 07c: i2d
      // 07d: dadd
      // 07e: d2i
      // 07f: istore 13
      // 081: aload 0
      // 082: invokevirtual g_3.aaw ()Lnh4;
      // 085: iload 10
      // 087: i2d
      // 088: dconst_1
      // 089: iload 11
      // 08b: i2d
      // 08c: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 08f: astore 14
      // 091: iload 2
      // 092: ifeq 176
      // 095: aload 0
      // 096: getfield g_3.oay Lt9d;
      // 099: aload 14
      // 09b: invokevirtual t9d.d_0 (Lnh4;)Ljava/util/List;
      // 09e: invokeinterface java/util/List.isEmpty ()Z 1
      // 0a3: ifeq 173
      // 0a6: goto 0ad
      // 0a9: invokestatic g_3.c (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield g_3.oay Lt9d;
      // 0b1: new mew
      // 0b4: dup
      // 0b5: iload 12
      // 0b7: aload 0
      // 0b8: getfield g_3.kfp D
      // 0bb: d2i
      // 0bc: iload 13
      // 0be: invokespecial mew.<init> (III)V
      // 0c1: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 0c4: iload 2
      // 0c5: ifeq 11c
      // 0c8: goto 0cf
      // 0cb: invokestatic g_3.c (Loov;)Loov;
      // 0ce: athrow
      // 0cf: ifeq 0f8
      // 0d2: goto 0d9
      // 0d5: invokestatic g_3.c (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: aload 0
      // 0db: getfield g_3.o2v D
      // 0de: iload 10
      // 0e0: i2d
      // 0e1: dadd
      // 0e2: aload 0
      // 0e3: getfield g_3.kfp D
      // 0e6: dconst_1
      // 0e7: dadd
      // 0e8: aload 0
      // 0e9: getfield g_3.vbd D
      // 0ec: iload 11
      // 0ee: i2d
      // 0ef: dadd
      // 0f0: invokevirtual g_3.clj (DDD)V
      // 0f3: return
      // 0f4: invokestatic g_3.c (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: iload 2
      // 0fa: ifeq 16a
      // 0fd: getfield g_3.oay Lt9d;
      // 100: new mew
      // 103: dup
      // 104: iload 12
      // 106: aload 0
      // 107: getfield g_3.kfp D
      // 10a: d2i
      // 10b: bipush 1
      // 10c: isub
      // 10d: iload 13
      // 10f: invokespecial mew.<init> (III)V
      // 112: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 115: goto 11c
      // 118: invokestatic g_3.c (Loov;)Loov;
      // 11b: athrow
      // 11c: ifne 158
      // 11f: aload 0
      // 120: iload 2
      // 121: ifeq 16a
      // 124: goto 12b
      // 127: invokestatic g_3.c (Loov;)Loov;
      // 12a: athrow
      // 12b: getfield g_3.oay Lt9d;
      // 12e: new mew
      // 131: dup
      // 132: iload 12
      // 134: aload 0
      // 135: getfield g_3.kfp D
      // 138: d2i
      // 139: bipush 1
      // 13a: isub
      // 13b: iload 13
      // 13d: invokespecial mew.<init> (III)V
      // 140: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 143: invokeinterface zfz.r_y ()Le0x; 1
      // 148: invokevirtual e0x.p1r ()Lp3y;
      // 14b: getstatic p3y.six Lp3y;
      // 14e: if_acmpne 173
      // 151: goto 158
      // 154: invokestatic g_3.c (Loov;)Loov;
      // 157: athrow
      // 158: aload 0
      // 159: getfield g_3.o2v D
      // 15c: iload 10
      // 15e: i2d
      // 15f: dadd
      // 160: dstore 3
      // 161: aload 0
      // 162: getfield g_3.kfp D
      // 165: dconst_1
      // 166: dadd
      // 167: dstore 5
      // 169: aload 0
      // 16a: getfield g_3.vbd D
      // 16d: iload 11
      // 16f: i2d
      // 170: dadd
      // 171: dstore 7
      // 173: iinc 11 1
      // 176: iload 2
      // 177: ifne 032
      // 17a: iinc 10 1
      // 17d: iload 2
      // 17e: ifne 026
      // 181: aload 0
      // 182: dload 3
      // 183: dload 5
      // 185: dload 7
      // 187: invokevirtual g_3.clj (DDD)V
      // 18a: return
   }

   @Override
   public boolean x1t() {
      return false;
   }

   public float rvh() {
      return 0.42F;
   }

   public void xv1() {
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
      // 05: invokestatic c05.vz1 ()Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: iload 1
      // 0c: ifeq 3b
      // 0f: if_acmpne 39
      // 12: goto 19
      // 15: invokestatic g_3.c (Loov;)Loov;
      // 18: athrow
      // 19: new yc_
      // 1c: dup
      // 1d: invokespecial yc_.<init> ()V
      // 20: astore 2
      // 21: aload 2
      // 22: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 25: pop
      // 26: aload 2
      // 27: invokevirtual yc_.elp ()Z
      // 2a: iload 1
      // 2b: ifeq 49
      // 2e: ifeq 39
      // 31: goto 38
      // 34: invokestatic g_3.c (Loov;)Loov;
      // 37: athrow
      // 38: return
      // 39: aload 0
      // 3a: aload 0
      // 3b: invokevirtual g_3.rvh ()F
      // 3e: f2d
      // 3f: putfield g_3.mop D
      // 42: aload 0
      // 43: getstatic mcs.y0p Lmcs;
      // 46: invokevirtual g_3.cab (Lmcs;)Z
      // 49: iload 1
      // 4a: ifeq 88
      // 4d: ifeq 79
      // 50: goto 57
      // 53: invokestatic g_3.c (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: dup
      // 59: getfield g_3.mop D
      // 5c: aload 0
      // 5d: getstatic mcs.y0p Lmcs;
      // 60: invokevirtual g_3.dhd (Lmcs;)Lsdj;
      // 63: invokevirtual sdj.tus ()I
      // 66: bipush 1
      // 67: iadd
      // 68: i2f
      // 69: ldc 0.1
      // 6b: nop
      // 6c: fmul
      // 6d: f2d
      // 6e: dadd
      // 6f: putfield g_3.mop D
      // 72: goto 79
      // 75: invokestatic g_3.c (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: iload 1
      // 7b: ifeq b9
      // 7e: invokevirtual g_3.ew1 ()Z
      // 81: goto 88
      // 84: invokestatic g_3.c (Loov;)Loov;
      // 87: athrow
      // 88: ifeq b8
      // 8b: aload 0
      // 8c: getfield g_3.x5k F
      // 8f: ldc 0.017453292
      // 91: nop
      // 92: fmul
      // 93: fstore 2
      // 94: aload 0
      // 95: dup
      // 96: getfield g_3.icv D
      // 99: fload 2
      // 9a: invokestatic fe6.rtn (F)F
      // 9d: ldc 0.2
      // 9f: nop
      // a0: fmul
      // a1: f2d
      // a2: dsub
      // a3: putfield g_3.icv D
      // a6: aload 0
      // a7: dup
      // a8: getfield g_3.bw4 D
      // ab: fload 2
      // ac: invokestatic fe6.ssk (F)F
      // af: ldc 0.2
      // b1: nop
      // b2: fmul
      // b3: f2d
      // b4: dadd
      // b5: putfield g_3.bw4 D
      // b8: aload 0
      // b9: bipush 1
      // ba: putfield g_3.u19 Z
      // bd: return
   }

   public void ojw() {
      this.mop += 0.04F;
   }

   public void q6x() {
      this.mop += 0.04F;
   }

   public void ge2(float param1, float param2) {
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
      // 005: iload 3
      // 006: ifne 574
      // 009: invokevirtual g_3.de5 ()Z
      // 00c: ifeq 56b
      // 00f: goto 016
      // 012: invokestatic g_3.c (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual g_3.mwv ()Z
      // 01a: iload 3
      // 01b: ifne 072
      // 01e: goto 025
      // 021: invokestatic g_3.c (Loov;)Loov;
      // 024: athrow
      // 025: ifeq 067
      // 028: goto 02f
      // 02b: invokestatic g_3.c (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: iload 3
      // 031: ifne 450
      // 034: goto 03b
      // 037: invokestatic g_3.c (Loov;)Loov;
      // 03a: athrow
      // 03b: instanceof ha9
      // 03e: ifeq 448
      // 041: goto 048
      // 044: invokestatic g_3.c (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: checkcast ha9
      // 04c: iload 3
      // 04d: ifne 450
      // 050: goto 057
      // 053: invokestatic g_3.c (Loov;)Loov;
      // 056: athrow
      // 057: getfield ha9.lls Lpj2;
      // 05a: getfield pj2.wzx Z
      // 05d: ifeq 448
      // 060: goto 067
      // 063: invokestatic g_3.c (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: invokevirtual g_3.b2u ()Z
      // 06b: goto 072
      // 06e: invokestatic g_3.c (Loov;)Loov;
      // 071: athrow
      // 072: iload 3
      // 073: ifne 096
      // 076: ifeq 0b8
      // 079: goto 080
      // 07c: invokestatic g_3.c (Loov;)Loov;
      // 07f: athrow
      // 080: aload 0
      // 081: iload 3
      // 082: ifne 3a5
      // 085: goto 08c
      // 088: invokestatic g_3.c (Loov;)Loov;
      // 08b: athrow
      // 08c: instanceof ha9
      // 08f: goto 096
      // 092: invokestatic g_3.c (Loov;)Loov;
      // 095: athrow
      // 096: ifeq 39d
      // 099: aload 0
      // 09a: checkcast ha9
      // 09d: iload 3
      // 09e: ifne 3a5
      // 0a1: goto 0a8
      // 0a4: invokestatic g_3.c (Loov;)Loov;
      // 0a7: athrow
      // 0a8: getfield ha9.lls Lpj2;
      // 0ab: getfield pj2.wzx Z
      // 0ae: ifeq 39d
      // 0b1: goto 0b8
      // 0b4: invokestatic g_3.c (Loov;)Loov;
      // 0b7: athrow
      // 0b8: ldc 0.91
      // 0ba: nop
      // 0bb: fstore 4
      // 0bd: aload 0
      // 0be: iload 3
      // 0bf: ifne 0d7
      // 0c2: getfield g_3.lfk Z
      // 0c5: ifeq 10c
      // 0c8: goto 0cf
      // 0cb: invokestatic g_3.c (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: goto 0d7
      // 0d3: invokestatic g_3.c (Loov;)Loov;
      // 0d6: athrow
      // 0d7: getfield g_3.oay Lt9d;
      // 0da: new mew
      // 0dd: dup
      // 0de: aload 0
      // 0df: getfield g_3.o2v D
      // 0e2: invokestatic fe6.jqf (D)I
      // 0e5: aload 0
      // 0e6: invokevirtual g_3.aaw ()Lnh4;
      // 0e9: getfield nh4.bx_ D
      // 0ec: invokestatic fe6.jqf (D)I
      // 0ef: bipush 1
      // 0f0: isub
      // 0f1: aload 0
      // 0f2: getfield g_3.vbd D
      // 0f5: invokestatic fe6.jqf (D)I
      // 0f8: invokespecial mew.<init> (III)V
      // 0fb: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0fe: invokeinterface zfz.r_y ()Le0x; 1
      // 103: getfield e0x.t50 F
      // 106: ldc 0.91
      // 108: nop
      // 109: fmul
      // 10a: fstore 4
      // 10c: ldc 0.16277136
      // 10e: nop
      // 10f: fload 4
      // 111: fload 4
      // 113: fmul
      // 114: fload 4
      // 116: fmul
      // 117: fdiv
      // 118: fstore 5
      // 11a: aload 0
      // 11b: iload 3
      // 11c: ifne 141
      // 11f: getfield g_3.lfk Z
      // 122: ifeq 139
      // 125: goto 12c
      // 128: invokestatic g_3.c (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: invokevirtual g_3.ldh ()F
      // 130: fload 5
      // 132: fmul
      // 133: fstore 6
      // 135: iload 3
      // 136: ifeq 146
      // 139: aload 0
      // 13a: goto 141
      // 13d: invokestatic g_3.c (Loov;)Loov;
      // 140: athrow
      // 141: getfield g_3._ge F
      // 144: fstore 6
      // 146: aload 0
      // 147: fload 1
      // 148: fload 2
      // 149: fload 6
      // 14b: invokevirtual g_3.r4r (FFF)V
      // 14e: ldc 0.91
      // 150: nop
      // 151: fstore 4
      // 153: aload 0
      // 154: getfield g_3.lfk Z
      // 157: iload 3
      // 158: ifne 19f
      // 15b: ifeq 19b
      // 15e: goto 165
      // 161: invokestatic g_3.c (Loov;)Loov;
      // 164: athrow
      // 165: aload 0
      // 166: getfield g_3.oay Lt9d;
      // 169: new mew
      // 16c: dup
      // 16d: aload 0
      // 16e: getfield g_3.o2v D
      // 171: invokestatic fe6.jqf (D)I
      // 174: aload 0
      // 175: invokevirtual g_3.aaw ()Lnh4;
      // 178: getfield nh4.bx_ D
      // 17b: invokestatic fe6.jqf (D)I
      // 17e: bipush 1
      // 17f: isub
      // 180: aload 0
      // 181: getfield g_3.vbd D
      // 184: invokestatic fe6.jqf (D)I
      // 187: invokespecial mew.<init> (III)V
      // 18a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 18d: invokeinterface zfz.r_y ()Le0x; 1
      // 192: getfield e0x.t50 F
      // 195: ldc 0.91
      // 197: nop
      // 198: fmul
      // 199: fstore 4
      // 19b: aload 0
      // 19c: invokevirtual g_3.z2m ()Z
      // 19f: iload 3
      // 1a0: ifne 27c
      // 1a3: ifeq 268
      // 1a6: goto 1ad
      // 1a9: invokestatic g_3.c (Loov;)Loov;
      // 1ac: athrow
      // 1ad: ldc 0.15
      // 1af: nop
      // 1b0: fstore 7
      // 1b2: aload 0
      // 1b3: aload 0
      // 1b4: getfield g_3.icv D
      // 1b7: fload 7
      // 1b9: fneg
      // 1ba: f2d
      // 1bb: fload 7
      // 1bd: f2d
      // 1be: invokestatic fe6.lft (DDD)D
      // 1c1: putfield g_3.icv D
      // 1c4: aload 0
      // 1c5: aload 0
      // 1c6: getfield g_3.bw4 D
      // 1c9: fload 7
      // 1cb: fneg
      // 1cc: f2d
      // 1cd: fload 7
      // 1cf: f2d
      // 1d0: invokestatic fe6.lft (DDD)D
      // 1d3: putfield g_3.bw4 D
      // 1d6: aload 0
      // 1d7: fconst_0
      // 1d8: putfield g_3.o_8 F
      // 1db: aload 0
      // 1dc: getfield g_3.mop D
      // 1df: ldc2_w -0.15
      // 1e2: dcmpg
      // 1e3: iload 3
      // 1e4: ifne 203
      // 1e7: ifge 1ff
      // 1ea: goto 1f1
      // 1ed: invokestatic g_3.c (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: ldc2_w -0.15
      // 1f5: putfield g_3.mop D
      // 1f8: goto 1ff
      // 1fb: invokestatic g_3.c (Loov;)Loov;
      // 1fe: athrow
      // 1ff: aload 0
      // 200: invokevirtual g_3.hzv ()Z
      // 203: iload 3
      // 204: ifne 21c
      // 207: ifeq 22e
      // 20a: goto 211
      // 20d: invokestatic g_3.c (Loov;)Loov;
      // 210: athrow
      // 211: aload 0
      // 212: instanceof ha9
      // 215: goto 21c
      // 218: invokestatic g_3.c (Loov;)Loov;
      // 21b: athrow
      // 21c: iload 3
      // 21d: ifne 22b
      // 220: ifeq 22e
      // 223: goto 22a
      // 226: invokestatic g_3.c (Loov;)Loov;
      // 229: athrow
      // 22a: bipush 1
      // 22b: goto 22f
      // 22e: bipush 0
      // 22f: istore 8
      // 231: iload 8
      // 233: iload 3
      // 234: ifne 27c
      // 237: ifeq 268
      // 23a: goto 241
      // 23d: invokestatic g_3.c (Loov;)Loov;
      // 240: athrow
      // 241: aload 0
      // 242: getfield g_3.mop D
      // 245: dconst_0
      // 246: dcmpg
      // 247: iload 3
      // 248: ifne 27c
      // 24b: goto 252
      // 24e: invokestatic g_3.c (Loov;)Loov;
      // 251: athrow
      // 252: ifge 268
      // 255: goto 25c
      // 258: invokestatic g_3.c (Loov;)Loov;
      // 25b: athrow
      // 25c: aload 0
      // 25d: dconst_0
      // 25e: putfield g_3.mop D
      // 261: goto 268
      // 264: invokestatic g_3.c (Loov;)Loov;
      // 267: athrow
      // 268: aload 0
      // 269: aload 0
      // 26a: getfield g_3.icv D
      // 26d: aload 0
      // 26e: getfield g_3.mop D
      // 271: aload 0
      // 272: getfield g_3.bw4 D
      // 275: invokevirtual g_3.vjj (DDD)V
      // 278: aload 0
      // 279: getfield g_3.cbi Z
      // 27c: iload 3
      // 27d: ifne 2c3
      // 280: ifeq 2b1
      // 283: goto 28a
      // 286: invokestatic g_3.c (Loov;)Loov;
      // 289: athrow
      // 28a: aload 0
      // 28b: invokevirtual g_3.z2m ()Z
      // 28e: iload 3
      // 28f: ifne 2c3
      // 292: goto 299
      // 295: invokestatic g_3.c (Loov;)Loov;
      // 298: athrow
      // 299: ifeq 2b1
      // 29c: goto 2a3
      // 29f: invokestatic g_3.c (Loov;)Loov;
      // 2a2: athrow
      // 2a3: aload 0
      // 2a4: ldc2_w 0.2
      // 2a7: putfield g_3.mop D
      // 2aa: goto 2b1
      // 2ad: invokestatic g_3.c (Loov;)Loov;
      // 2b0: athrow
      // 2b1: aload 0
      // 2b2: iload 3
      // 2b3: ifne 36a
      // 2b6: getfield g_3.oay Lt9d;
      // 2b9: getfield t9d.v0f Z
      // 2bc: goto 2c3
      // 2bf: invokestatic g_3.c (Loov;)Loov;
      // 2c2: athrow
      // 2c3: ifeq 362
      // 2c6: aload 0
      // 2c7: getfield g_3.oay Lt9d;
      // 2ca: new mew
      // 2cd: dup
      // 2ce: aload 0
      // 2cf: getfield g_3.o2v D
      // 2d2: d2i
      // 2d3: bipush 0
      // 2d4: aload 0
      // 2d5: getfield g_3.vbd D
      // 2d8: d2i
      // 2d9: invokespecial mew.<init> (III)V
      // 2dc: invokevirtual t9d.xjm (Lmew;)Z
      // 2df: iload 3
      // 2e0: ifne 33d
      // 2e3: goto 2ea
      // 2e6: invokestatic g_3.c (Loov;)Loov;
      // 2e9: athrow
      // 2ea: ifeq 325
      // 2ed: goto 2f4
      // 2f0: invokestatic g_3.c (Loov;)Loov;
      // 2f3: athrow
      // 2f4: aload 0
      // 2f5: iload 3
      // 2f6: ifne 36a
      // 2f9: goto 300
      // 2fc: invokestatic g_3.c (Loov;)Loov;
      // 2ff: athrow
      // 300: getfield g_3.oay Lt9d;
      // 303: new mew
      // 306: dup
      // 307: aload 0
      // 308: getfield g_3.o2v D
      // 30b: d2i
      // 30c: bipush 0
      // 30d: aload 0
      // 30e: getfield g_3.vbd D
      // 311: d2i
      // 312: invokespecial mew.<init> (III)V
      // 315: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 318: invokevirtual tts.yx3 ()Z
      // 31b: ifne 362
      // 31e: goto 325
      // 321: invokestatic g_3.c (Loov;)Loov;
      // 324: athrow
      // 325: aload 0
      // 326: iload 3
      // 327: ifne 35a
      // 32a: goto 331
      // 32d: invokestatic g_3.c (Loov;)Loov;
      // 330: athrow
      // 331: getfield g_3.kfp D
      // 334: dconst_0
      // 335: dcmpl
      // 336: goto 33d
      // 339: invokestatic g_3.c (Loov;)Loov;
      // 33c: athrow
      // 33d: ifle 352
      // 340: aload 0
      // 341: ldc2_w -0.1
      // 344: putfield g_3.mop D
      // 347: iload 3
      // 348: ifeq 375
      // 34b: goto 352
      // 34e: invokestatic g_3.c (Loov;)Loov;
      // 351: athrow
      // 352: aload 0
      // 353: goto 35a
      // 356: invokestatic g_3.c (Loov;)Loov;
      // 359: athrow
      // 35a: dconst_0
      // 35b: putfield g_3.mop D
      // 35e: iload 3
      // 35f: ifeq 375
      // 362: aload 0
      // 363: goto 36a
      // 366: invokestatic g_3.c (Loov;)Loov;
      // 369: athrow
      // 36a: dup
      // 36b: getfield g_3.mop D
      // 36e: ldc2_w 0.08
      // 371: dsub
      // 372: putfield g_3.mop D
      // 375: aload 0
      // 376: dup
      // 377: getfield g_3.mop D
      // 37a: ldc2_w 0.9800000190734863
      // 37d: dmul
      // 37e: putfield g_3.mop D
      // 381: aload 0
      // 382: dup
      // 383: getfield g_3.icv D
      // 386: fload 4
      // 388: f2d
      // 389: dmul
      // 38a: putfield g_3.icv D
      // 38d: aload 0
      // 38e: dup
      // 38f: getfield g_3.bw4 D
      // 392: fload 4
      // 394: f2d
      // 395: dmul
      // 396: putfield g_3.bw4 D
      // 399: iload 3
      // 39a: ifeq 56b
      // 39d: aload 0
      // 39e: goto 3a5
      // 3a1: invokestatic g_3.c (Loov;)Loov;
      // 3a4: athrow
      // 3a5: getfield g_3.kfp D
      // 3a8: dstore 4
      // 3aa: aload 0
      // 3ab: fload 1
      // 3ac: fload 2
      // 3ad: ldc 0.02
      // 3af: nop
      // 3b0: invokevirtual g_3.r4r (FFF)V
      // 3b3: aload 0
      // 3b4: aload 0
      // 3b5: getfield g_3.icv D
      // 3b8: aload 0
      // 3b9: getfield g_3.mop D
      // 3bc: aload 0
      // 3bd: getfield g_3.bw4 D
      // 3c0: invokevirtual g_3.vjj (DDD)V
      // 3c3: aload 0
      // 3c4: dup
      // 3c5: getfield g_3.icv D
      // 3c8: ldc2_w 0.5
      // 3cb: dmul
      // 3cc: putfield g_3.icv D
      // 3cf: aload 0
      // 3d0: dup
      // 3d1: getfield g_3.mop D
      // 3d4: ldc2_w 0.5
      // 3d7: dmul
      // 3d8: putfield g_3.mop D
      // 3db: aload 0
      // 3dc: dup
      // 3dd: getfield g_3.bw4 D
      // 3e0: ldc2_w 0.5
      // 3e3: dmul
      // 3e4: putfield g_3.bw4 D
      // 3e7: aload 0
      // 3e8: dup
      // 3e9: getfield g_3.mop D
      // 3ec: ldc2_w 0.02
      // 3ef: dsub
      // 3f0: putfield g_3.mop D
      // 3f3: aload 0
      // 3f4: getfield g_3.cbi Z
      // 3f7: iload 3
      // 3f8: ifne 433
      // 3fb: ifeq 444
      // 3fe: goto 405
      // 401: invokestatic g_3.c (Loov;)Loov;
      // 404: athrow
      // 405: aload 0
      // 406: aload 0
      // 407: getfield g_3.icv D
      // 40a: iload 3
      // 40b: ifne 441
      // 40e: goto 415
      // 411: invokestatic g_3.c (Loov;)Loov;
      // 414: athrow
      // 415: aload 0
      // 416: getfield g_3.mop D
      // 419: ldc2_w 0.6000000238418579
      // 41c: dadd
      // 41d: aload 0
      // 41e: getfield g_3.kfp D
      // 421: dsub
      // 422: dload 4
      // 424: dadd
      // 425: aload 0
      // 426: getfield g_3.bw4 D
      // 429: invokevirtual g_3.nin (DDD)Z
      // 42c: goto 433
      // 42f: invokestatic g_3.c (Loov;)Loov;
      // 432: athrow
      // 433: ifeq 444
      // 436: aload 0
      // 437: ldc2_w 0.30000001192092896
      // 43a: goto 441
      // 43d: invokestatic g_3.c (Loov;)Loov;
      // 440: athrow
      // 441: putfield g_3.mop D
      // 444: iload 3
      // 445: ifeq 56b
      // 448: aload 0
      // 449: goto 450
      // 44c: invokestatic g_3.c (Loov;)Loov;
      // 44f: athrow
      // 450: getfield g_3.kfp D
      // 453: dstore 4
      // 455: ldc 0.8
      // 457: nop
      // 458: fstore 6
      // 45a: ldc 0.02
      // 45c: nop
      // 45d: fstore 7
      // 45f: aload 0
      // 460: invokestatic hc0.uur (Li2h;)I
      // 463: i2f
      // 464: fstore 8
      // 466: fload 8
      // 468: ldc 3.0
      // 46a: nop
      // 46b: fcmpl
      // 46c: iload 3
      // 46d: ifne 483
      // 470: ifle 47f
      // 473: goto 47a
      // 476: invokestatic g_3.c (Loov;)Loov;
      // 479: athrow
      // 47a: ldc 3.0
      // 47c: nop
      // 47d: fstore 8
      // 47f: aload 0
      // 480: getfield g_3.lfk Z
      // 483: iload 3
      // 484: ifne 49d
      // 487: ifne 499
      // 48a: goto 491
      // 48d: invokestatic g_3.c (Loov;)Loov;
      // 490: athrow
      // 491: fload 8
      // 493: ldc 0.5
      // 495: nop
      // 496: fmul
      // 497: fstore 8
      // 499: fload 8
      // 49b: fconst_0
      // 49c: fcmpl
      // 49d: iload 3
      // 49e: ifne 529
      // 4a1: ifle 4d2
      // 4a4: goto 4ab
      // 4a7: invokestatic g_3.c (Loov;)Loov;
      // 4aa: athrow
      // 4ab: fload 6
      // 4ad: ldc 0.54600006
      // 4af: nop
      // 4b0: fload 6
      // 4b2: fsub
      // 4b3: fload 8
      // 4b5: fmul
      // 4b6: ldc 3.0
      // 4b8: nop
      // 4b9: fdiv
      // 4ba: fadd
      // 4bb: fstore 6
      // 4bd: fload 7
      // 4bf: aload 0
      // 4c0: invokevirtual g_3.ldh ()F
      // 4c3: fconst_1
      // 4c4: fmul
      // 4c5: fload 7
      // 4c7: fsub
      // 4c8: fload 8
      // 4ca: fmul
      // 4cb: ldc 3.0
      // 4cd: nop
      // 4ce: fdiv
      // 4cf: fadd
      // 4d0: fstore 7
      // 4d2: aload 0
      // 4d3: fload 1
      // 4d4: fload 2
      // 4d5: fload 7
      // 4d7: invokevirtual g_3.r4r (FFF)V
      // 4da: aload 0
      // 4db: aload 0
      // 4dc: getfield g_3.icv D
      // 4df: aload 0
      // 4e0: getfield g_3.mop D
      // 4e3: aload 0
      // 4e4: getfield g_3.bw4 D
      // 4e7: invokevirtual g_3.vjj (DDD)V
      // 4ea: aload 0
      // 4eb: dup
      // 4ec: getfield g_3.icv D
      // 4ef: fload 6
      // 4f1: f2d
      // 4f2: dmul
      // 4f3: putfield g_3.icv D
      // 4f6: aload 0
      // 4f7: dup
      // 4f8: getfield g_3.mop D
      // 4fb: ldc2_w 0.800000011920929
      // 4fe: dmul
      // 4ff: putfield g_3.mop D
      // 502: aload 0
      // 503: dup
      // 504: getfield g_3.bw4 D
      // 507: fload 6
      // 509: f2d
      // 50a: dmul
      // 50b: putfield g_3.bw4 D
      // 50e: aload 0
      // 50f: dup
      // 510: getfield g_3.mop D
      // 513: ldc2_w 0.02
      // 516: dsub
      // 517: putfield g_3.mop D
      // 51a: aload 0
      // 51b: iload 3
      // 51c: ifne 57f
      // 51f: getfield g_3.cbi Z
      // 522: goto 529
      // 525: invokestatic g_3.c (Loov;)Loov;
      // 528: athrow
      // 529: ifeq 56b
      // 52c: aload 0
      // 52d: aload 0
      // 52e: iload 3
      // 52f: ifne 56d
      // 532: goto 539
      // 535: invokestatic g_3.c (Loov;)Loov;
      // 538: athrow
      // 539: getfield g_3.icv D
      // 53c: aload 0
      // 53d: getfield g_3.mop D
      // 540: ldc2_w 0.6000000238418579
      // 543: dadd
      // 544: aload 0
      // 545: getfield g_3.kfp D
      // 548: dsub
      // 549: dload 4
      // 54b: dadd
      // 54c: aload 0
      // 54d: getfield g_3.bw4 D
      // 550: invokevirtual g_3.nin (DDD)Z
      // 553: ifeq 56b
      // 556: goto 55d
      // 559: invokestatic g_3.c (Loov;)Loov;
      // 55c: athrow
      // 55d: aload 0
      // 55e: ldc2_w 0.30000001192092896
      // 561: putfield g_3.mop D
      // 564: goto 56b
      // 567: invokestatic g_3.c (Loov;)Loov;
      // 56a: athrow
      // 56b: aload 0
      // 56c: aload 0
      // 56d: getfield g_3.zzf F
      // 570: putfield g_3.p1w F
      // 573: aload 0
      // 574: getfield g_3.o2v D
      // 577: aload 0
      // 578: getfield g_3.bc1 D
      // 57b: dsub
      // 57c: dstore 4
      // 57e: aload 0
      // 57f: getfield g_3.vbd D
      // 582: aload 0
      // 583: getfield g_3.a4d D
      // 586: dsub
      // 587: dstore 6
      // 589: dload 4
      // 58b: dload 4
      // 58d: dmul
      // 58e: dload 6
      // 590: dload 6
      // 592: dmul
      // 593: dadd
      // 594: invokestatic fe6.dii (D)F
      // 597: ldc 4.0
      // 599: nop
      // 59a: fmul
      // 59b: fstore 8
      // 59d: iload 3
      // 59e: ifne 5d3
      // 5a1: fload 8
      // 5a3: fconst_1
      // 5a4: fcmpl
      // 5a5: ifle 5b2
      // 5a8: goto 5af
      // 5ab: invokestatic g_3.c (Loov;)Loov;
      // 5ae: athrow
      // 5af: fconst_1
      // 5b0: fstore 8
      // 5b2: aload 0
      // 5b3: dup
      // 5b4: getfield g_3.zzf F
      // 5b7: fload 8
      // 5b9: aload 0
      // 5ba: getfield g_3.zzf F
      // 5bd: fsub
      // 5be: ldc 0.4
      // 5c0: nop
      // 5c1: fmul
      // 5c2: fadd
      // 5c3: putfield g_3.zzf F
      // 5c6: aload 0
      // 5c7: dup
      // 5c8: getfield g_3.pcb F
      // 5cb: aload 0
      // 5cc: getfield g_3.zzf F
      // 5cf: fadd
      // 5d0: putfield g_3.pcb F
      // 5d3: return
   }

   public float ldh() {
      return this.poe;
   }

   public void nak(float var1) {
      this.poe = var1;
   }

   public boolean _nm(i2h var1) {
      this.upe(var1);
      return false;
   }

   public boolean ofg() {
      return false;
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 68376937609274
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial i2h.xx_ ()V
      // 010: aload 0
      // 011: iload 3
      // 012: ifne 17e
      // 015: getfield g_3.oay Lt9d;
      // 018: getfield t9d.v0f Z
      // 01b: ifne 179
      // 01e: goto 025
      // 021: invokestatic g_3.c (Loov;)Loov;
      // 024: athrow
      // 025: aload 0
      // 026: invokevirtual g_3.jj5 ()I
      // 029: istore 4
      // 02b: iload 4
      // 02d: iload 3
      // 02e: ifne 093
      // 031: ifle 092
      // 034: goto 03b
      // 037: invokestatic g_3.c (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield g_3.zni I
      // 03f: iload 3
      // 040: ifne 075
      // 043: goto 04a
      // 046: invokestatic g_3.c (Loov;)Loov;
      // 049: athrow
      // 04a: ifgt 067
      // 04d: goto 054
      // 050: invokestatic g_3.c (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: bipush 20
      // 057: bipush 30
      // 059: iload 4
      // 05b: isub
      // 05c: imul
      // 05d: putfield g_3.zni I
      // 060: goto 067
      // 063: invokestatic g_3.c (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: dup
      // 069: getfield g_3.zni I
      // 06c: bipush 1
      // 06d: isub
      // 06e: putfield g_3.zni I
      // 071: aload 0
      // 072: getfield g_3.zni I
      // 075: iload 3
      // 076: ifne 093
      // 079: ifgt 092
      // 07c: goto 083
      // 07f: invokestatic g_3.c (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: iload 4
      // 086: bipush 1
      // 087: isub
      // 088: invokevirtual g_3.dk9 (I)V
      // 08b: goto 092
      // 08e: invokestatic g_3.c (Loov;)Loov;
      // 091: athrow
      // 092: bipush 0
      // 093: istore 5
      // 095: iload 5
      // 097: bipush 5
      // 098: if_icmpge 156
      // 09b: aload 0
      // 09c: getfield g_3.wjy [Lerg;
      // 09f: iload 5
      // 0a1: aaload
      // 0a2: astore 6
      // 0a4: aload 0
      // 0a5: iload 5
      // 0a7: invokevirtual g_3.rnq (I)Lerg;
      // 0aa: astore 7
      // 0ac: iload 3
      // 0ad: ifne 152
      // 0b0: aload 7
      // 0b2: aload 6
      // 0b4: invokestatic erg.c6l (Lerg;Lerg;)Z
      // 0b7: iload 3
      // 0b8: ifne 168
      // 0bb: goto 0c2
      // 0be: invokestatic g_3.c (Loov;)Loov;
      // 0c1: athrow
      // 0c2: ifne 14f
      // 0c5: goto 0cc
      // 0c8: invokestatic g_3.c (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield g_3.oay Lt9d;
      // 0d0: checkcast dug
      // 0d3: invokevirtual dug.fp4 ()Lqpc;
      // 0d6: aload 0
      // 0d7: new net/minecraft/network/play/server/S04PacketEntityEquipment
      // 0da: dup
      // 0db: aload 0
      // 0dc: invokevirtual g_3.jwu ()I
      // 0df: iload 5
      // 0e1: aload 7
      // 0e3: invokespecial net/minecraft/network/play/server/S04PacketEntityEquipment.<init> (IILerg;)V
      // 0e6: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // 0e9: aload 6
      // 0eb: iload 3
      // 0ec: ifne 115
      // 0ef: goto 0f6
      // 0f2: invokestatic g_3.c (Loov;)Loov;
      // 0f5: athrow
      // 0f6: ifnull 113
      // 0f9: goto 100
      // 0fc: invokestatic g_3.c (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 0
      // 101: getfield g_3.kpa Losd;
      // 104: aload 6
      // 106: invokevirtual erg.s15 ()Lcom/google/common/collect/Multimap;
      // 109: invokevirtual osd.l05 (Lcom/google/common/collect/Multimap;)V
      // 10c: goto 113
      // 10f: invokestatic g_3.c (Loov;)Loov;
      // 112: athrow
      // 113: aload 7
      // 115: ifnull 12b
      // 118: aload 0
      // 119: getfield g_3.kpa Losd;
      // 11c: aload 7
      // 11e: invokevirtual erg.s15 ()Lcom/google/common/collect/Multimap;
      // 121: invokevirtual osd.fdu (Lcom/google/common/collect/Multimap;)V
      // 124: goto 12b
      // 127: invokestatic g_3.c (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield g_3.wjy [Lerg;
      // 12f: iload 5
      // 131: aload 7
      // 133: iload 3
      // 134: ifne 14b
      // 137: ifnonnull 149
      // 13a: goto 141
      // 13d: invokestatic g_3.c (Loov;)Loov;
      // 140: athrow
      // 141: aconst_null
      // 142: goto 14e
      // 145: invokestatic g_3.c (Loov;)Loov;
      // 148: athrow
      // 149: aload 7
      // 14b: invokevirtual erg.yaq ()Lerg;
      // 14e: aastore
      // 14f: iinc 5 1
      // 152: iload 3
      // 153: ifeq 095
      // 156: aload 0
      // 157: iload 3
      // 158: ifne 17e
      // 15b: getfield g_3.g25 I
      // 15e: bipush 20
      // 160: irem
      // 161: goto 168
      // 164: invokestatic g_3.c (Loov;)Loov;
      // 167: athrow
      // 168: ifne 179
      // 16b: aload 0
      // 16c: invokevirtual g_3.ii6 ()Lw0s;
      // 16f: invokevirtual w0s.llu ()V
      // 172: goto 179
      // 175: invokestatic g_3.c (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: invokevirtual g_3.e_a ()V
      // 17d: aload 0
      // 17e: getfield g_3.o2v D
      // 181: aload 0
      // 182: getfield g_3.bc1 D
      // 185: dsub
      // 186: dstore 4
      // 188: aload 0
      // 189: getfield g_3.vbd D
      // 18c: aload 0
      // 18d: getfield g_3.a4d D
      // 190: dsub
      // 191: dstore 6
      // 193: dload 4
      // 195: dload 4
      // 197: dmul
      // 198: dload 6
      // 19a: dload 6
      // 19c: dmul
      // 19d: dadd
      // 19e: d2f
      // 19f: fstore 8
      // 1a1: aload 0
      // 1a2: getfield g_3.ksw F
      // 1a5: fstore 9
      // 1a7: fconst_0
      // 1a8: fstore 10
      // 1aa: aload 0
      // 1ab: aload 0
      // 1ac: getfield g_3.zt3 F
      // 1af: putfield g_3.hdw F
      // 1b2: fconst_0
      // 1b3: fstore 11
      // 1b5: fload 8
      // 1b7: ldc 0.0025000002
      // 1b9: nop
      // 1ba: fcmpl
      // 1bb: iload 3
      // 1bc: ifne 1f5
      // 1bf: ifle 1ef
      // 1c2: goto 1c9
      // 1c5: invokestatic g_3.c (Loov;)Loov;
      // 1c8: athrow
      // 1c9: fconst_1
      // 1ca: fstore 11
      // 1cc: fload 8
      // 1ce: f2d
      // 1cf: invokestatic java/lang/Math.sqrt (D)D
      // 1d2: d2f
      // 1d3: ldc 3.0
      // 1d5: nop
      // 1d6: fmul
      // 1d7: fstore 10
      // 1d9: dload 6
      // 1db: dload 4
      // 1dd: invokestatic fe6.yr8 (DD)D
      // 1e0: d2f
      // 1e1: ldc 180.0
      // 1e3: nop
      // 1e4: fmul
      // 1e5: ldc 3.1415927
      // 1e7: nop
      // 1e8: fdiv
      // 1e9: ldc 90.0
      // 1eb: nop
      // 1ec: fsub
      // 1ed: fstore 9
      // 1ef: aload 0
      // 1f0: getfield g_3.sti F
      // 1f3: fconst_0
      // 1f4: fcmpl
      // 1f5: iload 3
      // 1f6: ifne 218
      // 1f9: ifle 209
      // 1fc: goto 203
      // 1ff: invokestatic g_3.c (Loov;)Loov;
      // 202: athrow
      // 203: aload 0
      // 204: getfield g_3.x5k F
      // 207: fstore 9
      // 209: aload 0
      // 20a: iload 3
      // 20b: ifne 25f
      // 20e: getfield g_3.lfk Z
      // 211: goto 218
      // 214: invokestatic g_3.c (Loov;)Loov;
      // 217: athrow
      // 218: ifne 21e
      // 21b: fconst_0
      // 21c: fstore 11
      // 21e: aload 0
      // 21f: dup
      // 220: getfield g_3.zt3 F
      // 223: fload 11
      // 225: aload 0
      // 226: getfield g_3.zt3 F
      // 229: fsub
      // 22a: ldc 0.3
      // 22c: nop
      // 22d: fmul
      // 22e: fadd
      // 22f: putfield g_3.zt3 F
      // 232: aload 0
      // 233: getfield g_3.oay Lt9d;
      // 236: getfield t9d.e8t Luan;
      // 239: sipush 16274
      // 23c: ldc2_w 9158152022934698664
      // 23f: lload 1
      // 240: lxor
      // 241: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: nop
      // 247: invokevirtual uan.qek (Ljava/lang/String;)V
      // 24a: aload 0
      // 24b: fload 9
      // 24d: fload 10
      // 24f: invokevirtual g_3._j7 (FF)F
      // 252: fstore 10
      // 254: aload 0
      // 255: getfield g_3.oay Lt9d;
      // 258: getfield t9d.e8t Luan;
      // 25b: invokevirtual uan.uio ()V
      // 25e: aload 0
      // 25f: getfield g_3.oay Lt9d;
      // 262: getfield t9d.e8t Luan;
      // 265: sipush 26206
      // 268: ldc2_w 2648544048785679213
      // 26b: lload 1
      // 26c: lxor
      // 26d: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: nop
      // 273: invokevirtual uan.qek (Ljava/lang/String;)V
      // 276: aload 0
      // 277: getfield g_3.x5k F
      // 27a: aload 0
      // 27b: getfield g_3.p3h F
      // 27e: fsub
      // 27f: ldc -180.0
      // 281: nop
      // 282: fcmpg
      // 283: ifge 2a1
      // 286: aload 0
      // 287: dup
      // 288: getfield g_3.p3h F
      // 28b: ldc 360.0
      // 28d: nop
      // 28e: fsub
      // 28f: putfield g_3.p3h F
      // 292: iload 3
      // 293: ifne 2cc
      // 296: iload 3
      // 297: ifeq 276
      // 29a: goto 2a1
      // 29d: invokestatic g_3.c (Loov;)Loov;
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: getfield g_3.x5k F
      // 2a5: aload 0
      // 2a6: getfield g_3.p3h F
      // 2a9: fsub
      // 2aa: ldc 180.0
      // 2ac: nop
      // 2ad: fcmpl
      // 2ae: iflt 2cc
      // 2b1: aload 0
      // 2b2: dup
      // 2b3: getfield g_3.p3h F
      // 2b6: ldc 360.0
      // 2b8: nop
      // 2b9: fadd
      // 2ba: putfield g_3.p3h F
      // 2bd: iload 3
      // 2be: ifne 2fe
      // 2c1: iload 3
      // 2c2: ifeq 2a1
      // 2c5: goto 2cc
      // 2c8: invokestatic g_3.c (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 0
      // 2cd: getfield g_3.ksw F
      // 2d0: aload 0
      // 2d1: getfield g_3.gsh F
      // 2d4: fsub
      // 2d5: ldc -180.0
      // 2d7: nop
      // 2d8: fcmpg
      // 2d9: ifge 2fe
      // 2dc: aload 0
      // 2dd: dup
      // 2de: getfield g_3.gsh F
      // 2e1: ldc 360.0
      // 2e3: nop
      // 2e4: fsub
      // 2e5: putfield g_3.gsh F
      // 2e8: iload 3
      // 2e9: ifne 330
      // 2ec: goto 2f3
      // 2ef: invokestatic g_3.c (Loov;)Loov;
      // 2f2: athrow
      // 2f3: iload 3
      // 2f4: ifeq 2cc
      // 2f7: goto 2fe
      // 2fa: invokestatic g_3.c (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield g_3.ksw F
      // 302: aload 0
      // 303: getfield g_3.gsh F
      // 306: fsub
      // 307: ldc 180.0
      // 309: nop
      // 30a: fcmpl
      // 30b: iflt 330
      // 30e: aload 0
      // 30f: dup
      // 310: getfield g_3.gsh F
      // 313: ldc 360.0
      // 315: nop
      // 316: fadd
      // 317: putfield g_3.gsh F
      // 31a: iload 3
      // 31b: ifne 362
      // 31e: goto 325
      // 321: invokestatic g_3.c (Loov;)Loov;
      // 324: athrow
      // 325: iload 3
      // 326: ifeq 2fe
      // 329: goto 330
      // 32c: invokestatic g_3.c (Loov;)Loov;
      // 32f: athrow
      // 330: aload 0
      // 331: getfield g_3.y2i F
      // 334: aload 0
      // 335: getfield g_3.j25 F
      // 338: fsub
      // 339: ldc -180.0
      // 33b: nop
      // 33c: fcmpg
      // 33d: ifge 362
      // 340: aload 0
      // 341: dup
      // 342: getfield g_3.j25 F
      // 345: ldc 360.0
      // 347: nop
      // 348: fsub
      // 349: putfield g_3.j25 F
      // 34c: iload 3
      // 34d: ifne 394
      // 350: goto 357
      // 353: invokestatic g_3.c (Loov;)Loov;
      // 356: athrow
      // 357: iload 3
      // 358: ifeq 330
      // 35b: goto 362
      // 35e: invokestatic g_3.c (Loov;)Loov;
      // 361: athrow
      // 362: aload 0
      // 363: getfield g_3.y2i F
      // 366: aload 0
      // 367: getfield g_3.j25 F
      // 36a: fsub
      // 36b: ldc 180.0
      // 36d: nop
      // 36e: fcmpl
      // 36f: iflt 394
      // 372: aload 0
      // 373: dup
      // 374: getfield g_3.j25 F
      // 377: ldc 360.0
      // 379: nop
      // 37a: fadd
      // 37b: putfield g_3.j25 F
      // 37e: iload 3
      // 37f: ifne 3c6
      // 382: goto 389
      // 385: invokestatic g_3.c (Loov;)Loov;
      // 388: athrow
      // 389: iload 3
      // 38a: ifeq 362
      // 38d: goto 394
      // 390: invokestatic g_3.c (Loov;)Loov;
      // 393: athrow
      // 394: aload 0
      // 395: getfield g_3.q6c F
      // 398: aload 0
      // 399: getfield g_3.h82 F
      // 39c: fsub
      // 39d: ldc -180.0
      // 39f: nop
      // 3a0: fcmpg
      // 3a1: ifge 3c6
      // 3a4: aload 0
      // 3a5: dup
      // 3a6: getfield g_3.h82 F
      // 3a9: ldc 360.0
      // 3ab: nop
      // 3ac: fsub
      // 3ad: putfield g_3.h82 F
      // 3b0: iload 3
      // 3b1: ifne 40d
      // 3b4: goto 3bb
      // 3b7: invokestatic g_3.c (Loov;)Loov;
      // 3ba: athrow
      // 3bb: iload 3
      // 3bc: ifeq 394
      // 3bf: goto 3c6
      // 3c2: invokestatic g_3.c (Loov;)Loov;
      // 3c5: athrow
      // 3c6: aload 0
      // 3c7: getfield g_3.q6c F
      // 3ca: aload 0
      // 3cb: getfield g_3.h82 F
      // 3ce: fsub
      // 3cf: ldc 180.0
      // 3d1: nop
      // 3d2: fcmpl
      // 3d3: iflt 3f8
      // 3d6: aload 0
      // 3d7: dup
      // 3d8: getfield g_3.h82 F
      // 3db: ldc 360.0
      // 3dd: nop
      // 3de: fadd
      // 3df: putfield g_3.h82 F
      // 3e2: iload 3
      // 3e3: ifne 40d
      // 3e6: goto 3ed
      // 3e9: invokestatic g_3.c (Loov;)Loov;
      // 3ec: athrow
      // 3ed: iload 3
      // 3ee: ifeq 3c6
      // 3f1: goto 3f8
      // 3f4: invokestatic g_3.c (Loov;)Loov;
      // 3f7: athrow
      // 3f8: aload 0
      // 3f9: getfield g_3.oay Lt9d;
      // 3fc: getfield t9d.e8t Luan;
      // 3ff: invokevirtual uan.uio ()V
      // 402: aload 0
      // 403: dup
      // 404: getfield g_3.z35 F
      // 407: fload 10
      // 409: fadd
      // 40a: putfield g_3.z35 F
      // 40d: return
   }

   public float _j7(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 1
      // 01: aload 0
      // 02: getfield g_3.ksw F
      // 05: fsub
      // 06: invokestatic fe6.qsy (F)F
      // 09: fstore 4
      // 0b: aload 0
      // 0c: dup
      // 0d: getfield g_3.ksw F
      // 10: fload 4
      // 12: ldc 0.3
      // 14: nop
      // 15: fmul
      // 16: fadd
      // 17: putfield g_3.ksw F
      // 1a: invokestatic t9d.b ()I
      // 1d: aload 0
      // 1e: getfield g_3.x5k F
      // 21: aload 0
      // 22: getfield g_3.ksw F
      // 25: fsub
      // 26: invokestatic fe6.qsy (F)F
      // 29: fstore 5
      // 2b: istore 3
      // 2c: fload 5
      // 2e: ldc -90.0
      // 30: nop
      // 31: fcmpg
      // 32: iload 3
      // 33: ifeq 5c
      // 36: iflt 5b
      // 39: goto 40
      // 3c: invokestatic g_3.c (Loov;)Loov;
      // 3f: athrow
      // 40: fload 5
      // 42: ldc 90.0
      // 44: nop
      // 45: fcmpl
      // 46: iload 3
      // 47: ifeq 5c
      // 4a: goto 51
      // 4d: invokestatic g_3.c (Loov;)Loov;
      // 50: athrow
      // 51: iflt 5f
      // 54: goto 5b
      // 57: invokestatic g_3.c (Loov;)Loov;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 60
      // 5f: bipush 0
      // 60: istore 6
      // 62: fload 5
      // 64: ldc -75.0
      // 66: nop
      // 67: fcmpg
      // 68: iload 3
      // 69: ifeq 81
      // 6c: ifge 7b
      // 6f: goto 76
      // 72: invokestatic g_3.c (Loov;)Loov;
      // 75: athrow
      // 76: ldc -75.0
      // 78: nop
      // 79: fstore 5
      // 7b: fload 5
      // 7d: ldc 75.0
      // 7f: nop
      // 80: fcmpl
      // 81: iload 3
      // 82: ifeq a8
      // 85: iflt 94
      // 88: goto 8f
      // 8b: invokestatic g_3.c (Loov;)Loov;
      // 8e: athrow
      // 8f: ldc 75.0
      // 91: nop
      // 92: fstore 5
      // 94: aload 0
      // 95: aload 0
      // 96: getfield g_3.x5k F
      // 99: fload 5
      // 9b: fsub
      // 9c: putfield g_3.ksw F
      // 9f: fload 5
      // a1: fload 5
      // a3: fmul
      // a4: ldc 2500.0
      // a6: nop
      // a7: fcmpl
      // a8: iload 3
      // a9: ifeq ce
      // ac: ifle cc
      // af: goto b6
      // b2: invokestatic g_3.c (Loov;)Loov;
      // b5: athrow
      // b6: aload 0
      // b7: dup
      // b8: getfield g_3.ksw F
      // bb: fload 5
      // bd: ldc 0.2
      // bf: nop
      // c0: fmul
      // c1: fadd
      // c2: putfield g_3.ksw F
      // c5: goto cc
      // c8: invokestatic g_3.c (Loov;)Loov;
      // cb: athrow
      // cc: iload 6
      // ce: ifeq d7
      // d1: fload 2
      // d2: ldc -1.0
      // d4: nop
      // d5: fmul
      // d6: fstore 2
      // d7: fload 2
      // d8: freturn
   }

   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_3.e J
      // 003: ldc2_w 83241636464013
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield g_3.vwx I
      // 010: iload 3
      // 011: ifeq 033
      // 014: ifle 02f
      // 017: goto 01e
      // 01a: invokestatic g_3.c (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: dup
      // 020: getfield g_3.vwx I
      // 023: bipush 1
      // 024: isub
      // 025: putfield g_3.vwx I
      // 028: goto 02f
      // 02b: invokestatic g_3.c (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield g_3.a1q I
      // 033: iload 3
      // 034: ifeq 0ef
      // 037: ifle 0e4
      // 03a: goto 041
      // 03d: invokestatic g_3.c (Loov;)Loov;
      // 040: athrow
      // 041: aload 0
      // 042: getfield g_3.o2v D
      // 045: aload 0
      // 046: getfield g_3.sz4 D
      // 049: aload 0
      // 04a: getfield g_3.o2v D
      // 04d: dsub
      // 04e: aload 0
      // 04f: getfield g_3.a1q I
      // 052: i2d
      // 053: ddiv
      // 054: dadd
      // 055: dstore 4
      // 057: aload 0
      // 058: getfield g_3.kfp D
      // 05b: aload 0
      // 05c: getfield g_3._y0 D
      // 05f: aload 0
      // 060: getfield g_3.kfp D
      // 063: dsub
      // 064: aload 0
      // 065: getfield g_3.a1q I
      // 068: i2d
      // 069: ddiv
      // 06a: dadd
      // 06b: dstore 6
      // 06d: aload 0
      // 06e: getfield g_3.vbd D
      // 071: aload 0
      // 072: getfield g_3.hb4 D
      // 075: aload 0
      // 076: getfield g_3.vbd D
      // 079: dsub
      // 07a: aload 0
      // 07b: getfield g_3.a1q I
      // 07e: i2d
      // 07f: ddiv
      // 080: dadd
      // 081: dstore 8
      // 083: aload 0
      // 084: getfield g_3.e7t D
      // 087: aload 0
      // 088: getfield g_3.x5k F
      // 08b: f2d
      // 08c: dsub
      // 08d: invokestatic fe6.lrs (D)D
      // 090: dstore 10
      // 092: aload 0
      // 093: aload 0
      // 094: getfield g_3.x5k F
      // 097: f2d
      // 098: dload 10
      // 09a: aload 0
      // 09b: getfield g_3.a1q I
      // 09e: i2d
      // 09f: ddiv
      // 0a0: dadd
      // 0a1: d2f
      // 0a2: putfield g_3.x5k F
      // 0a5: aload 0
      // 0a6: aload 0
      // 0a7: getfield g_3.y2i F
      // 0aa: f2d
      // 0ab: aload 0
      // 0ac: getfield g_3.bxw D
      // 0af: aload 0
      // 0b0: getfield g_3.y2i F
      // 0b3: f2d
      // 0b4: dsub
      // 0b5: aload 0
      // 0b6: getfield g_3.a1q I
      // 0b9: i2d
      // 0ba: ddiv
      // 0bb: dadd
      // 0bc: d2f
      // 0bd: putfield g_3.y2i F
      // 0c0: aload 0
      // 0c1: dup
      // 0c2: getfield g_3.a1q I
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: putfield g_3.a1q I
      // 0ca: aload 0
      // 0cb: dload 4
      // 0cd: dload 6
      // 0cf: dload 8
      // 0d1: invokevirtual g_3.m6_ (DDD)V
      // 0d4: aload 0
      // 0d5: aload 0
      // 0d6: getfield g_3.x5k F
      // 0d9: aload 0
      // 0da: getfield g_3.y2i F
      // 0dd: invokevirtual g_3.iym (FF)V
      // 0e0: iload 3
      // 0e1: ifne 128
      // 0e4: aload 0
      // 0e5: invokevirtual g_3.de5 ()Z
      // 0e8: goto 0ef
      // 0eb: invokestatic g_3.c (Loov;)Loov;
      // 0ee: athrow
      // 0ef: iload 3
      // 0f0: ifeq 133
      // 0f3: ifne 128
      // 0f6: goto 0fd
      // 0f9: invokestatic g_3.c (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: dup
      // 0ff: getfield g_3.icv D
      // 102: ldc2_w 0.98
      // 105: dmul
      // 106: putfield g_3.icv D
      // 109: aload 0
      // 10a: dup
      // 10b: getfield g_3.mop D
      // 10e: ldc2_w 0.98
      // 111: dmul
      // 112: putfield g_3.mop D
      // 115: aload 0
      // 116: dup
      // 117: getfield g_3.bw4 D
      // 11a: ldc2_w 0.98
      // 11d: dmul
      // 11e: putfield g_3.bw4 D
      // 121: goto 128
      // 124: invokestatic g_3.c (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: getfield g_3.icv D
      // 12c: invokestatic java/lang/Math.abs (D)D
      // 12f: ldc2_w 0.005
      // 132: dcmpg
      // 133: iload 3
      // 134: ifeq 158
      // 137: ifge 14d
      // 13a: goto 141
      // 13d: invokestatic g_3.c (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: dconst_0
      // 143: putfield g_3.icv D
      // 146: goto 14d
      // 149: invokestatic g_3.c (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield g_3.mop D
      // 151: invokestatic java/lang/Math.abs (D)D
      // 154: ldc2_w 0.005
      // 157: dcmpg
      // 158: iload 3
      // 159: ifeq 17d
      // 15c: ifge 172
      // 15f: goto 166
      // 162: invokestatic g_3.c (Loov;)Loov;
      // 165: athrow
      // 166: aload 0
      // 167: dconst_0
      // 168: putfield g_3.mop D
      // 16b: goto 172
      // 16e: invokestatic g_3.c (Loov;)Loov;
      // 171: athrow
      // 172: aload 0
      // 173: getfield g_3.bw4 D
      // 176: invokestatic java/lang/Math.abs (D)D
      // 179: ldc2_w 0.005
      // 17c: dcmpg
      // 17d: iload 3
      // 17e: ifeq 1b3
      // 181: ifge 197
      // 184: goto 18b
      // 187: invokestatic g_3.c (Loov;)Loov;
      // 18a: athrow
      // 18b: aload 0
      // 18c: dconst_0
      // 18d: putfield g_3.bw4 D
      // 190: goto 197
      // 193: invokestatic g_3.c (Loov;)Loov;
      // 196: athrow
      // 197: aload 0
      // 198: getfield g_3.oay Lt9d;
      // 19b: getfield t9d.e8t Luan;
      // 19e: sipush 2487
      // 1a1: ldc2_w 1929827049715249468
      // 1a4: lload 1
      // 1a5: lxor
      // 1a6: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: nop
      // 1ac: invokevirtual uan.qek (Ljava/lang/String;)V
      // 1af: aload 0
      // 1b0: invokevirtual g_3.a81 ()Z
      // 1b3: iload 3
      // 1b4: ifeq 1eb
      // 1b7: ifeq 1e0
      // 1ba: goto 1c1
      // 1bd: invokestatic g_3.c (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: bipush 0
      // 1c3: putfield g_3.e1f Z
      // 1c6: aload 0
      // 1c7: fconst_0
      // 1c8: putfield g_3.z66 F
      // 1cb: aload 0
      // 1cc: fconst_0
      // 1cd: putfield g_3.ooc F
      // 1d0: aload 0
      // 1d1: fconst_0
      // 1d2: putfield g_3.czx F
      // 1d5: iload 3
      // 1d6: ifne 226
      // 1d9: goto 1e0
      // 1dc: invokestatic g_3.c (Loov;)Loov;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: invokevirtual g_3.de5 ()Z
      // 1e4: goto 1eb
      // 1e7: invokestatic g_3.c (Loov;)Loov;
      // 1ea: athrow
      // 1eb: iload 3
      // 1ec: ifeq 257
      // 1ef: ifeq 226
      // 1f2: goto 1f9
      // 1f5: invokestatic g_3.c (Loov;)Loov;
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: getfield g_3.oay Lt9d;
      // 1fd: getfield t9d.e8t Luan;
      // 200: sipush 25078
      // 203: ldc2_w 7529119150246222182
      // 206: lload 1
      // 207: lxor
      // 208: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: nop
      // 20e: invokevirtual uan.qek (Ljava/lang/String;)V
      // 211: aload 0
      // 212: invokevirtual g_3.nd9 ()V
      // 215: aload 0
      // 216: getfield g_3.oay Lt9d;
      // 219: getfield t9d.e8t Luan;
      // 21c: invokevirtual uan.uio ()V
      // 21f: goto 226
      // 222: invokestatic g_3.c (Loov;)Loov;
      // 225: athrow
      // 226: aload 0
      // 227: getfield g_3.oay Lt9d;
      // 22a: getfield t9d.e8t Luan;
      // 22d: invokevirtual uan.uio ()V
      // 230: aload 0
      // 231: getfield g_3.oay Lt9d;
      // 234: getfield t9d.e8t Luan;
      // 237: sipush 23481
      // 23a: ldc2_w 916370511895061292
      // 23d: lload 1
      // 23e: lxor
      // 23f: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: nop
      // 245: invokevirtual uan.qek (Ljava/lang/String;)V
      // 248: aload 0
      // 249: iload 3
      // 24a: ifeq 2f9
      // 24d: getfield g_3.e1f Z
      // 250: goto 257
      // 253: invokestatic g_3.c (Loov;)Loov;
      // 256: athrow
      // 257: ifeq 2f1
      // 25a: aload 0
      // 25b: invokevirtual g_3.mwv ()Z
      // 25e: iload 3
      // 25f: ifeq 28d
      // 262: goto 269
      // 265: invokestatic g_3.c (Loov;)Loov;
      // 268: athrow
      // 269: ifeq 282
      // 26c: goto 273
      // 26f: invokestatic g_3.c (Loov;)Loov;
      // 272: athrow
      // 273: aload 0
      // 274: invokevirtual g_3.ojw ()V
      // 277: iload 3
      // 278: ifne 2fd
      // 27b: goto 282
      // 27e: invokestatic g_3.c (Loov;)Loov;
      // 281: athrow
      // 282: aload 0
      // 283: invokevirtual g_3.b2u ()Z
      // 286: goto 28d
      // 289: invokestatic g_3.c (Loov;)Loov;
      // 28c: athrow
      // 28d: iload 3
      // 28e: ifeq 2b5
      // 291: ifeq 2aa
      // 294: goto 29b
      // 297: invokestatic g_3.c (Loov;)Loov;
      // 29a: athrow
      // 29b: aload 0
      // 29c: invokevirtual g_3.q6x ()V
      // 29f: iload 3
      // 2a0: ifne 2fd
      // 2a3: goto 2aa
      // 2a6: invokestatic g_3.c (Loov;)Loov;
      // 2a9: athrow
      // 2aa: aload 0
      // 2ab: getfield g_3.lfk Z
      // 2ae: goto 2b5
      // 2b1: invokestatic g_3.c (Loov;)Loov;
      // 2b4: athrow
      // 2b5: iload 3
      // 2b6: ifeq 383
      // 2b9: ifeq 2fd
      // 2bc: goto 2c3
      // 2bf: invokestatic g_3.c (Loov;)Loov;
      // 2c2: athrow
      // 2c3: aload 0
      // 2c4: getfield g_3.vwx I
      // 2c7: iload 3
      // 2c8: ifeq 383
      // 2cb: goto 2d2
      // 2ce: invokestatic g_3.c (Loov;)Loov;
      // 2d1: athrow
      // 2d2: ifne 2fd
      // 2d5: goto 2dc
      // 2d8: invokestatic g_3.c (Loov;)Loov;
      // 2db: athrow
      // 2dc: aload 0
      // 2dd: invokevirtual g_3.xv1 ()V
      // 2e0: aload 0
      // 2e1: bipush 10
      // 2e3: putfield g_3.vwx I
      // 2e6: iload 3
      // 2e7: ifne 2fd
      // 2ea: goto 2f1
      // 2ed: invokestatic g_3.c (Loov;)Loov;
      // 2f0: athrow
      // 2f1: aload 0
      // 2f2: goto 2f9
      // 2f5: invokestatic g_3.c (Loov;)Loov;
      // 2f8: athrow
      // 2f9: bipush 0
      // 2fa: putfield g_3.vwx I
      // 2fd: aload 0
      // 2fe: getfield g_3.oay Lt9d;
      // 301: getfield t9d.e8t Luan;
      // 304: invokevirtual uan.uio ()V
      // 307: aload 0
      // 308: getfield g_3.oay Lt9d;
      // 30b: getfield t9d.e8t Luan;
      // 30e: sipush 2998
      // 311: ldc2_w 1164400051242578742
      // 314: lload 1
      // 315: lxor
      // 316: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: nop
      // 31c: invokevirtual uan.qek (Ljava/lang/String;)V
      // 31f: aload 0
      // 320: dup
      // 321: getfield g_3.z66 F
      // 324: ldc 0.98
      // 326: nop
      // 327: fmul
      // 328: putfield g_3.z66 F
      // 32b: aload 0
      // 32c: dup
      // 32d: getfield g_3.ooc F
      // 330: ldc 0.98
      // 332: nop
      // 333: fmul
      // 334: putfield g_3.ooc F
      // 337: aload 0
      // 338: dup
      // 339: getfield g_3.czx F
      // 33c: ldc 0.9
      // 33e: nop
      // 33f: fmul
      // 340: putfield g_3.czx F
      // 343: aload 0
      // 344: aload 0
      // 345: getfield g_3.z66 F
      // 348: aload 0
      // 349: getfield g_3.ooc F
      // 34c: invokevirtual g_3.ge2 (FF)V
      // 34f: aload 0
      // 350: getfield g_3.oay Lt9d;
      // 353: getfield t9d.e8t Luan;
      // 356: invokevirtual uan.uio ()V
      // 359: aload 0
      // 35a: getfield g_3.oay Lt9d;
      // 35d: getfield t9d.e8t Luan;
      // 360: sipush 32014
      // 363: ldc2_w 8211977090883306903
      // 366: lload 1
      // 367: lxor
      // 368: invokedynamic q (IJ)Ljava/lang/String; bsm=g_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: nop
      // 36e: invokevirtual uan.qek (Ljava/lang/String;)V
      // 371: aload 0
      // 372: getfield g_3.oay Lt9d;
      // 375: iload 3
      // 376: ifeq 395
      // 379: getfield t9d.v0f Z
      // 37c: goto 383
      // 37f: invokestatic g_3.c (Loov;)Loov;
      // 382: athrow
      // 383: ifne 391
      // 386: aload 0
      // 387: invokevirtual g_3._v7 ()V
      // 38a: goto 391
      // 38d: invokestatic g_3.c (Loov;)Loov;
      // 390: athrow
      // 391: aload 0
      // 392: getfield g_3.oay Lt9d;
      // 395: getfield t9d.e8t Luan;
      // 398: invokevirtual uan.uio ()V
      // 39b: return
   }

   public void nd9() {
   }

   public void _v7() {
      int var1 = t9d.c();
      List var2 = this.oay.sr2(this, this.aaw().c2h(0.2F, 0.0, 0.2F), Predicates.and(k0_.t1f, new g_3$1(this)));

      byte var10000;
      label28: {
         try {
            var10000 = var2.isEmpty();
            if (var1 != 0) {
               break label28;
            }

            if (var10000 != 0) {
               return;
            }
         } catch (oov var5) {
            throw c(var5);
         }

         var10000 = 0;
      }

      int var3 = var10000;

      while (var3 < var2.size()) {
         i2h var4 = (i2h)var2.get(var3);
         this.v4n(var4);
         var3++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public void v4n(i2h var1) {
      var1.u_w(this);
   }

   @Override
   public void nw9(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 7e
      // 09: getfield g_3.hzp Li2h;
      // 0c: ifnull 76
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: ifnonnull 76
      // 1a: goto 21
      // 1d: invokestatic g_3.c (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: iload 2
      // 23: ifne 5b
      // 26: goto 2d
      // 29: invokestatic g_3.c (Loov;)Loov;
      // 2c: athrow
      // 2d: getfield g_3.oay Lt9d;
      // 30: getfield t9d.v0f Z
      // 33: ifne 4c
      // 36: goto 3d
      // 39: invokestatic g_3.c (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 0
      // 3f: getfield g_3.hzp Li2h;
      // 42: invokevirtual g_3.vux (Li2h;)V
      // 45: goto 4c
      // 48: invokestatic g_3.c (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: iload 2
      // 4e: ifne 6e
      // 51: getfield g_3.hzp Li2h;
      // 54: goto 5b
      // 57: invokestatic g_3.c (Loov;)Loov;
      // 5a: athrow
      // 5b: ifnull 6d
      // 5e: aload 0
      // 5f: getfield g_3.hzp Li2h;
      // 62: aconst_null
      // 63: putfield i2h.wgv Li2h;
      // 66: goto 6d
      // 69: invokestatic g_3.c (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aconst_null
      // 6f: putfield g_3.hzp Li2h;
      // 72: iload 2
      // 73: ifeq 82
      // 76: aload 0
      // 77: goto 7e
      // 7a: invokestatic g_3.c (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 1
      // 7f: invokespecial i2h.nw9 (Li2h;)V
      // 82: return
   }

   @Override
   public void dm3() {
      super.dm3();
      this.hdw = this.zt3;
      this.zt3 = 0.0F;
      this.o_8 = 0.0F;
   }

   @Override
   public void ltu(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.sz4 = var1;
      this._y0 = var3;
      this.hb4 = var5;
      this.e7t = (double)var7;
      this.bxw = (double)var8;
      this.a1q = var9;
   }

   public void k5k(boolean var1) {
      this.e1f = var1;
   }

   public void p3n(i2h param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: getfield i2h.ma9 Z
      // 08: iload 3
      // 09: ifne 2f
      // 0c: ifne c4
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield g_3.oay Lt9d;
      // 1a: iload 3
      // 1b: ifne 3d
      // 1e: goto 25
      // 21: invokestatic g_3.c (Loov;)Loov;
      // 24: athrow
      // 25: getfield t9d.v0f Z
      // 28: goto 2f
      // 2b: invokestatic g_3.c (Loov;)Loov;
      // 2e: athrow
      // 2f: ifne c4
      // 32: aload 0
      // 33: getfield g_3.oay Lt9d;
      // 36: goto 3d
      // 39: invokestatic g_3.c (Loov;)Loov;
      // 3c: athrow
      // 3d: checkcast dug
      // 40: invokevirtual dug.fp4 ()Lqpc;
      // 43: astore 4
      // 45: aload 1
      // 46: instanceof nvf
      // 49: iload 3
      // 4a: ifne 77
      // 4d: ifeq 73
      // 50: goto 57
      // 53: invokestatic g_3.c (Loov;)Loov;
      // 56: athrow
      // 57: aload 4
      // 59: aload 1
      // 5a: new net/minecraft/network/play/server/S0DPacketCollectItem
      // 5d: dup
      // 5e: aload 1
      // 5f: invokevirtual i2h.jwu ()I
      // 62: aload 0
      // 63: invokevirtual g_3.jwu ()I
      // 66: invokespecial net/minecraft/network/play/server/S0DPacketCollectItem.<init> (II)V
      // 69: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // 6c: goto 73
      // 6f: invokestatic g_3.c (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: instanceof hy9
      // 77: iload 3
      // 78: ifne a5
      // 7b: ifeq a1
      // 7e: goto 85
      // 81: invokestatic g_3.c (Loov;)Loov;
      // 84: athrow
      // 85: aload 4
      // 87: aload 1
      // 88: new net/minecraft/network/play/server/S0DPacketCollectItem
      // 8b: dup
      // 8c: aload 1
      // 8d: invokevirtual i2h.jwu ()I
      // 90: aload 0
      // 91: invokevirtual g_3.jwu ()I
      // 94: invokespecial net/minecraft/network/play/server/S0DPacketCollectItem.<init> (II)V
      // 97: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // 9a: goto a1
      // 9d: invokestatic g_3.c (Loov;)Loov;
      // a0: athrow
      // a1: aload 1
      // a2: instanceof uno
      // a5: ifeq c4
      // a8: aload 4
      // aa: aload 1
      // ab: new net/minecraft/network/play/server/S0DPacketCollectItem
      // ae: dup
      // af: aload 1
      // b0: invokevirtual i2h.jwu ()I
      // b3: aload 0
      // b4: invokevirtual g_3.jwu ()I
      // b7: invokespecial net/minecraft/network/play/server/S0DPacketCollectItem.<init> (II)V
      // ba: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // bd: goto c4
      // c0: invokestatic g_3.c (Loov;)Loov;
      // c3: athrow
      // c4: return
   }

   public boolean gq6(i2h var1) {
      try {
         if (this.oay.caq(new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd), new fqr(var1.o2v, var1.kfp + (double)var1.c5y(), var1.vbd)) == null) {
            return true;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return false;
   }

   public boolean m3j(mew var1) {
      try {
         if (this.oay.caq(new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd), new fqr((double)var1.getX(), (double)var1.getY(), (double)var1.getZ()))
            == null) {
            return true;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return false;
   }

   public boolean e7y(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield g_3.oay Lt9d;
      // 08: new fqr
      // 0b: dup
      // 0c: aload 0
      // 0d: getfield g_3.o2v D
      // 10: aload 0
      // 11: getfield g_3.kfp D
      // 14: aload 0
      // 15: invokevirtual g_3.c5y ()F
      // 18: f2d
      // 19: dadd
      // 1a: aload 0
      // 1b: getfield g_3.vbd D
      // 1e: invokespecial fqr.<init> (DDD)V
      // 21: new fqr
      // 24: dup
      // 25: aload 1
      // 26: getfield i2h.o2v D
      // 29: aload 1
      // 2a: getfield i2h.kfp D
      // 2d: aload 1
      // 2e: invokevirtual i2h.c5y ()F
      // 31: f2d
      // 32: dadd
      // 33: aload 1
      // 34: getfield i2h.vbd D
      // 37: invokespecial fqr.<init> (DDD)V
      // 3a: invokevirtual t9d.caq (Lfqr;Lfqr;)Lakm;
      // 3d: iload 2
      // 3e: ifne 85
      // 41: ifnull 88
      // 44: goto 4b
      // 47: invokestatic g_3.c (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield g_3.oay Lt9d;
      // 4f: new fqr
      // 52: dup
      // 53: aload 0
      // 54: getfield g_3.o2v D
      // 57: aload 0
      // 58: getfield g_3.kfp D
      // 5b: aload 0
      // 5c: invokevirtual g_3.c5y ()F
      // 5f: f2d
      // 60: dadd
      // 61: aload 0
      // 62: getfield g_3.vbd D
      // 65: invokespecial fqr.<init> (DDD)V
      // 68: new fqr
      // 6b: dup
      // 6c: aload 1
      // 6d: getfield i2h.o2v D
      // 70: aload 1
      // 71: getfield i2h.kfp D
      // 74: aload 1
      // 75: getfield i2h.vbd D
      // 78: invokespecial fqr.<init> (DDD)V
      // 7b: invokevirtual t9d.caq (Lfqr;Lfqr;)Lakm;
      // 7e: goto 85
      // 81: invokestatic g_3.c (Loov;)Loov;
      // 84: athrow
      // 85: ifnonnull 90
      // 88: bipush 1
      // 89: goto 91
      // 8c: invokestatic g_3.c (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 0
      // 91: ireturn
   }

   @Override
   public fqr m77() {
      return this.wej(1.0F);
   }

   @Override
   public fqr wej(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic zwr.cu6 Lcn7;
      // 07: invokevirtual cn7.g7m ()Z
      // 0a: iload 2
      // 0b: ifne 49
      // 0e: ifeq 3b
      // 11: goto 18
      // 14: invokestatic g_3.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: instanceof l86
      // 1c: iload 2
      // 1d: ifne 49
      // 20: goto 27
      // 23: invokestatic g_3.c (Loov;)Loov;
      // 26: athrow
      // 27: ifeq 3b
      // 2a: goto 31
      // 2d: invokestatic g_3.c (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: fload 1
      // 33: invokespecial i2h.wej (F)Lfqr;
      // 36: areturn
      // 37: invokestatic g_3.c (Loov;)Loov;
      // 3a: athrow
      // 3b: fload 1
      // 3c: fconst_1
      // 3d: iload 2
      // 3e: ifne 6c
      // 41: fcmpl
      // 42: goto 49
      // 45: invokestatic g_3.c (Loov;)Loov;
      // 48: athrow
      // 49: ifne 5d
      // 4c: aload 0
      // 4d: aload 0
      // 4e: getfield g_3.y2i F
      // 51: aload 0
      // 52: getfield g_3.q6c F
      // 55: invokevirtual g_3.kpk (FF)Lfqr;
      // 58: areturn
      // 59: invokestatic g_3.c (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield g_3.j25 F
      // 61: aload 0
      // 62: getfield g_3.y2i F
      // 65: aload 0
      // 66: getfield g_3.j25 F
      // 69: fsub
      // 6a: fload 1
      // 6b: fmul
      // 6c: fadd
      // 6d: fstore 3
      // 6e: aload 0
      // 6f: getfield g_3.h82 F
      // 72: aload 0
      // 73: getfield g_3.q6c F
      // 76: aload 0
      // 77: getfield g_3.h82 F
      // 7a: fsub
      // 7b: fload 1
      // 7c: fmul
      // 7d: fadd
      // 7e: fstore 4
      // 80: aload 0
      // 81: fload 3
      // 82: fload 4
      // 84: invokevirtual g_3.kpk (FF)Lfqr;
      // 87: areturn
   }

   public float tcg(float var1) {
      int var2 = t9d.c();
      float var3 = this.sti - this.laq;

      try {
         if (var2 != 0) {
            return var3 + 0.0F;
         }

         if (!(var3 < 0.0F)) {
            return this.laq + var3 * var1;
         }
      } catch (oov var4) {
         throw c(var4);
      }

      var3++;
      return this.laq + var3 * var1;
   }

   public boolean de5() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.oay.v0f;
         }

         if (!this.oay.v0f) {
            return true;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return false;
   }

   @Override
   public boolean mzu() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return this.ma9;
         }

         if (!this.ma9) {
            return true;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return false;
   }

   @Override
   public boolean tfh() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return this.ma9;
         }

         if (!this.ma9) {
            return true;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return false;
   }

   @Override
   public void dxm() {
      int var1 = t9d.c();

      g_3 var10000;
      int var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               double var3;
               var10001 = (var3 = this.z2d.nextDouble() - this.dgt(m6d.nen).nz5()) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
               if (var1 != 0) {
                  break label22;
               }

               if (var10001 >= 0) {
                  break label21;
               }
            } catch (oov var2) {
               throw c(var2);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var10000.t8d = (boolean)var10001;
   }

   @Override
   public float t9t() {
      return this.q6c;
   }

   @Override
   public void jo1(float var1) {
      this.q6c = var1;
   }

   @Override
   public void w1u(float var1) {
      this.ksw = var1;
   }

   public float _xk() {
      return this.a0f;
   }

   public void pr9(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: fload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: fconst_0
      // 0a: fcmpg
      // 0b: ifge 1e
      // 0e: goto 15
      // 11: invokestatic g_3.c (Loov;)Loov;
      // 14: athrow
      // 15: fconst_0
      // 16: goto 1d
      // 19: invokestatic g_3.c (Loov;)Loov;
      // 1c: athrow
      // 1d: fstore 1
      // 1e: aload 0
      // 1f: fload 1
      // 20: putfield g_3.a0f F
      // 23: return
   }

   public n_0 ued() {
      return this.oay.fgp().zov(this.b_q().toString());
   }

   public boolean g7h(g_3 var1) {
      return this.zhc(var1.ued());
   }

   public boolean zhc(n_0 param1) {
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
      // 05: invokevirtual g_3.ued ()Ln_0;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic g_3.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual g_3.ued ()Ln_0;
      // 1a: goto 21
      // 1d: invokestatic g_3.c (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: invokevirtual n_0.msm (Ln_0;)Z
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
   }

   public void hub() {
   }

   public void ypu() {
   }

   public void k04() {
      this.f5u = true;
   }

   public float ek2() {
      return this.za0;
   }

   public void dgi(float var1) {
      this.za0 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1588744082391618059L, -2735417231007582967L, MethodHandles.lookup().lookupClass()).a(58829995792362L);
      // $VF: monitorexit
      e = var10000;
      long var9 = e ^ 19974159555908L;
      String[] var13 = new String[5];
      b(var13);
      Cipher var0;
      Cipher var14 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[33];
      int var5 = 0;
      String var4 = "\u000e1\u0095èXh\u0000°a!\u000e%÷\u0093%B'/W\u0092âúë\u009d§©Å/½ª\u008c\b òFu$\u0087ËÛ~\u000f\fpý×\u0003?V&GWQ\u0096\u00185}?\u0090Ð\u001e\u008e\u0091\u0099'(f\u0095¥Èsë¨¢\u0086/âÖg«±$}\"it\u00124E\u0003å¥V¸á\u0011Ç\u009aãÒÑ\u00904-\u0098× ¡±8%¯\nzSfu?\u0094hÌ\u008f\u001a¨\ra0\u0004Ld\bäÜ4¾>=Po a2÷\u0015¼B~XïÞ\u0087>ÏÔ+éD_Ëü\u0081Êö\b\u009dFêE\u008a\u0096 \u0098 ÷÷tþyø±\u009b^\u009fñg(R&ýw}Hlâ9ÔvóÒ$w²\u0001Ì\u00038`ßÏ_wU6\u0005Mè'\u0087d Ô\u008f\u0014òUÄOØÈ_¨ß´Àd\t-É\u009b8\u0007\u0003w(\u0094f\fW\f³Ó\u009f¸\u0019\u00ad\u009d\u009f6f\u000edM\u0010äb0Ö\u000eÜ¸\\9ó¯as»ì/\u0018Ë\u0006\u0095ñ\u0082g)ßÇo¦|sÊ\u0004\u0001Á·¢\u0011½År\u008a ßÈkñÅIÈÆçÈú÷Îb|&ðÄeýY\u0097Óa/8¬¿i&\u0012¿(\u008b\u008d\u0000è3½^ø\u0097\u0018Y%~éÐÆ\u0011hðC\u0084¢¤mº×>$+çMçgÏz7<Ï\u0014p ·\u001e\u009aÿ·v¨Ð@ãþzP\u0085ö\\ùâA²À»\u0018V\u0010\u00914\b\u0017L\u0097\u0084\u0010g@²;\u0091\u009c}\u0089i`í\u0001¾*\u009a\\(Ã\u0016\u0019#ÉB\u0001Ä5\u001cf¡\u0002Ý¦ùx\u0097E\u0013½.¼ö\u001b\u0006¢úÝØ'\u0090\u001bo\"\u001b8L[º\u0010\u00164ß\u009fÀ¨*ç#\u000b #7\u008eº¡ \u0013L`ø>ÏoLh[ÈÆ³i\u0004ç*!\u0000\u0004'lö\u007f!9¼ÑÙ\u0096»Ð(1¯l£¬'¹äò\u009fJ\u00186\u0093_\u0002\u0097ÿ\u008eÃ\u00945\u008e:s5\u0080ªö\n©X\u008a¤þ\u0082÷ÑiÔ\u0018]ó\u0005\u0098\u001a\u00939wÖô9(\u009fõîÌ\u0095»Y/ÙÔl|(=\u0097Íï\u009cG'\u001a©\u0096\u0080°ÛF\u001bNÆímÇxE\u0091Lá£\u0011\u0018¯\u0095ËòMÀÎ'.Â7¯\u0010n\u001aÑ\u0082Ôn!\u0004ÂH®\u009d|Dîh ©\u0083xh\u0013ÚL\u009d,ïéÂðÔ'üR\u0096Üx\u0010\u009biÇ¨BàÉá¦E-\u0010ÞY\u0001M)ó\u000b{Ï]mQ_h\u008a² XUj\u0001l\u0005öÅ\u0099Oû\u0000\u0097ç\u0084g]ØD\u008dá¢ý÷è\u008aWÊ8\tkC8\u00ad\u0016®¼°\"w\u0004ë;f0\u0098\u008fàð\u009f\u008a2üÎ\u0086ORÄ%É\u0084!>JÐ@¯!GõG\u0088¼rÓþò¾[ÊÏ{\u009e\u001bÌáÐµÏ\u0010áãI®a\u0012\u0088:W+\u000f«þds\u0095\u0010\u0089\u0084ÁH\u008aNB¹\u009c\u009b±\u00ad\rá²À0\u0007ÄY\u00886p×¦:&û\u001f¥¹èµ¡\u000b¡òùÿÏ{\u007fözÃ\u008bë+#ÇË³\u0013=x\u0002Æ5\u0096\\\u009eÉ\u008d\u0095³ Ù:ÃÝ¶ò¹ A}`\u009cå±\u008bk\u009a5\ry±§Gþ\u0092\u0004\u0098\u008cêï%J\u0010 _¶Bz'2\u009a¯GÑ'ÊIP© §²a<îÞ%ý÷vØt\u0080GËR\u0012ÿ\u0088P\u0090E\u001dX\u009c%î0`çVM 6¾ø»?ÃD=7»Áí\u000eUð\u0019\u001e\u0087jÅ#»\\M>£*ÍM\u0018*u";
      int var6 = "\u000e1\u0095èXh\u0000°a!\u000e%÷\u0093%B'/W\u0092âúë\u009d§©Å/½ª\u008c\b òFu$\u0087ËÛ~\u000f\fpý×\u0003?V&GWQ\u0096\u00185}?\u0090Ð\u001e\u008e\u0091\u0099'(f\u0095¥Èsë¨¢\u0086/âÖg«±$}\"it\u00124E\u0003å¥V¸á\u0011Ç\u009aãÒÑ\u00904-\u0098× ¡±8%¯\nzSfu?\u0094hÌ\u008f\u001a¨\ra0\u0004Ld\bäÜ4¾>=Po a2÷\u0015¼B~XïÞ\u0087>ÏÔ+éD_Ëü\u0081Êö\b\u009dFêE\u008a\u0096 \u0098 ÷÷tþyø±\u009b^\u009fñg(R&ýw}Hlâ9ÔvóÒ$w²\u0001Ì\u00038`ßÏ_wU6\u0005Mè'\u0087d Ô\u008f\u0014òUÄOØÈ_¨ß´Àd\t-É\u009b8\u0007\u0003w(\u0094f\fW\f³Ó\u009f¸\u0019\u00ad\u009d\u009f6f\u000edM\u0010äb0Ö\u000eÜ¸\\9ó¯as»ì/\u0018Ë\u0006\u0095ñ\u0082g)ßÇo¦|sÊ\u0004\u0001Á·¢\u0011½År\u008a ßÈkñÅIÈÆçÈú÷Îb|&ðÄeýY\u0097Óa/8¬¿i&\u0012¿(\u008b\u008d\u0000è3½^ø\u0097\u0018Y%~éÐÆ\u0011hðC\u0084¢¤mº×>$+çMçgÏz7<Ï\u0014p ·\u001e\u009aÿ·v¨Ð@ãþzP\u0085ö\\ùâA²À»\u0018V\u0010\u00914\b\u0017L\u0097\u0084\u0010g@²;\u0091\u009c}\u0089i`í\u0001¾*\u009a\\(Ã\u0016\u0019#ÉB\u0001Ä5\u001cf¡\u0002Ý¦ùx\u0097E\u0013½.¼ö\u001b\u0006¢úÝØ'\u0090\u001bo\"\u001b8L[º\u0010\u00164ß\u009fÀ¨*ç#\u000b #7\u008eº¡ \u0013L`ø>ÏoLh[ÈÆ³i\u0004ç*!\u0000\u0004'lö\u007f!9¼ÑÙ\u0096»Ð(1¯l£¬'¹äò\u009fJ\u00186\u0093_\u0002\u0097ÿ\u008eÃ\u00945\u008e:s5\u0080ªö\n©X\u008a¤þ\u0082÷ÑiÔ\u0018]ó\u0005\u0098\u001a\u00939wÖô9(\u009fõîÌ\u0095»Y/ÙÔl|(=\u0097Íï\u009cG'\u001a©\u0096\u0080°ÛF\u001bNÆímÇxE\u0091Lá£\u0011\u0018¯\u0095ËòMÀÎ'.Â7¯\u0010n\u001aÑ\u0082Ôn!\u0004ÂH®\u009d|Dîh ©\u0083xh\u0013ÚL\u009d,ïéÂðÔ'üR\u0096Üx\u0010\u009biÇ¨BàÉá¦E-\u0010ÞY\u0001M)ó\u000b{Ï]mQ_h\u008a² XUj\u0001l\u0005öÅ\u0099Oû\u0000\u0097ç\u0084g]ØD\u008dá¢ý÷è\u008aWÊ8\tkC8\u00ad\u0016®¼°\"w\u0004ë;f0\u0098\u008fàð\u009f\u008a2üÎ\u0086ORÄ%É\u0084!>JÐ@¯!GõG\u0088¼rÓþò¾[ÊÏ{\u009e\u001bÌáÐµÏ\u0010áãI®a\u0012\u0088:W+\u000f«þds\u0095\u0010\u0089\u0084ÁH\u008aNB¹\u009c\u009b±\u00ad\rá²À0\u0007ÄY\u00886p×¦:&û\u001f¥¹èµ¡\u000b¡òùÿÏ{\u007fözÃ\u008bë+#ÇË³\u0013=x\u0002Æ5\u0096\\\u009eÉ\u008d\u0095³ Ù:ÃÝ¶ò¹ A}`\u009cå±\u008bk\u009a5\ry±§Gþ\u0092\u0004\u0098\u008cêï%J\u0010 _¶Bz'2\u009a¯GÑ'ÊIP© §²a<îÞ%ý÷vØt\u0080GËR\u0012ÿ\u0088P\u0090E\u001dX\u009c%î0`çVM 6¾ø»?ÃD=7»Áí\u000eUð\u0019\u001e\u0087jÅ#»\\M>£*ÍM\u0018*u"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var12 += var3) >= var6) {
                     m = var7;
                     n = new String[33];
                     dmv = UUID.fromString(b<"q">(21387, 1486887958903370734L ^ var9));
                     mo6 = new xk5(dmv, b<"q">(17493, 5794276141158245378L ^ var9), 0.3F, 2).d2_(false);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "¾Ï\"Ï÷uu\u0080X\u008dùÉS¹N\u0080@\u0015;\u0081\u0015\u009e 3öWæ\u0016D»LW|Y\u009dT-·Þ\u0085Ú\u0088\u008c\u008f\u00ad§}}\u0000Iï\u0096r\u008el\u0096½oTø¸ÑÌ³PF[5¼*\u009b\u009eÍÿÍ\u0006·\u0096\u001ew¦";
                  var6 = "¾Ï\"Ï÷uu\u0080X\u008dùÉS¹N\u0080@\u0015;\u0081\u0015\u009e 3öWæ\u0016D»LW|Y\u009dT-·Þ\u0085Ú\u0088\u008c\u008f\u00ad§}}\u0000Iï\u0096r\u008el\u0096½oTø¸ÑÌ³PF[5¼*\u009b\u009eÍÿÍ\u0006·\u0096\u001ew¦"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var15 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public static void b(String[] var0) {
      b = var0;
   }

   public static String[] a() {
      return b;
   }

   private static oov c(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6265;
      if (n[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])o.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("g_3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = m[var5].getBytes("ISO-8859-1");
         n[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return n[var5];
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
         throw new RuntimeException("g_3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
