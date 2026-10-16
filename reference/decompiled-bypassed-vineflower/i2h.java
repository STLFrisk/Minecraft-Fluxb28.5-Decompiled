import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class i2h implements e7r {
   private static final nh4 lin;
   private static int cah;
   private int x0s;
   public double y33;
   public boolean gz8;
   public i2h wgv;
   public i2h hzp;
   public boolean dg4;
   public t9d oay;
   public double bc1;
   public double o_z;
   public double a4d;
   public double o2v;
   public double kfp;
   public double vbd;
   public double icv;
   public double mop;
   public double bw4;
   public float x5k;
   public float y2i;
   public float p3h;
   public float j25;
   public nh4 l29;
   public boolean lfk;
   public boolean cbi;
   public boolean fcv;
   public boolean nop;
   public boolean t8d;
   public boolean r1h;
   private boolean jf5;
   public boolean ma9;
   public float uo6;
   public float ikl;
   public float c9u;
   public float odd;
   public float bb8;
   public float o_8;
   private int tsv;
   public double ivp;
   public double c54;
   public double e2b;
   public float nr7;
   public boolean kvx;
   public float u5z;
   public Random z2d;
   public int g25;
   public int m29;
   private int bry;
   public boolean x7a;
   public int qqi;
   public boolean jwh;
   public boolean cuj;
   public wl1 oit;
   private double baf;
   private double yc4;
   public boolean qok;
   public int jw4;
   public int cub;
   public int e6l;
   public int w12;
   public int hsa;
   public int mvw;
   public boolean k50;
   public boolean u19;
   public int rr6;
   public boolean jjl;
   public int cyu;
   public int ohd;
   public mew tzh;
   public fqr r4s;
   public vt2 src;
   private boolean i7j;
   public UUID vqf;
   private final n_k rj4;
   private static i2h[] a;
   private static final long f;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public int jwu() {
      return this.x0s;
   }

   public void i6d(int var1) {
      this.x0s = var1;
   }

   public void aqu() {
      this._kl();
   }

   public i2h(t9d param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: getstatic i2h.cah I
      // 08: dup
      // 09: bipush 1
      // 0a: iadd
      // 0b: putstatic i2h.cah I
      // 0e: putfield i2h.x0s I
      // 11: aload 0
      // 12: dconst_1
      // 13: putfield i2h.y33 D
      // 16: aload 0
      // 17: getstatic i2h.lin Lnh4;
      // 1a: putfield i2h.l29 Lnh4;
      // 1d: invokestatic t9d.b ()I
      // 20: aload 0
      // 21: ldc 0.6
      // 23: nop
      // 24: putfield i2h.uo6 F
      // 27: aload 0
      // 28: ldc 1.8
      // 2a: nop
      // 2b: putfield i2h.ikl F
      // 2e: aload 0
      // 2f: bipush 1
      // 30: putfield i2h.tsv I
      // 33: aload 0
      // 34: new java/util/Random
      // 37: dup
      // 38: invokespecial java/util/Random.<init> ()V
      // 3b: putfield i2h.z2d Ljava/util/Random;
      // 3e: istore 2
      // 3f: aload 0
      // 40: bipush 1
      // 41: putfield i2h.m29 I
      // 44: aload 0
      // 45: bipush 1
      // 46: putfield i2h.jwh Z
      // 49: aload 0
      // 4a: aload 0
      // 4b: getfield i2h.z2d Ljava/util/Random;
      // 4e: invokestatic fe6._g4 (Ljava/util/Random;)Ljava/util/UUID;
      // 51: putfield i2h.vqf Ljava/util/UUID;
      // 54: aload 0
      // 55: new n_k
      // 58: dup
      // 59: invokespecial n_k.<init> ()V
      // 5c: putfield i2h.rj4 Ln_k;
      // 5f: aload 0
      // 60: aload 1
      // 61: putfield i2h.oay Lt9d;
      // 64: aload 0
      // 65: dconst_0
      // 66: dconst_0
      // 67: dconst_0
      // 68: invokevirtual i2h.m6_ (DDD)V
      // 6b: iload 2
      // 6c: ifeq d9
      // 6f: aload 1
      // 70: ifnull 8c
      // 73: goto 7a
      // 76: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: aload 1
      // 7c: getfield t9d.vzz Lupn;
      // 7f: invokevirtual upn.gs_ ()I
      // 82: putfield i2h.ohd I
      // 85: goto 8c
      // 88: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: aload 0
      // 8d: new wl1
      // 90: dup
      // 91: aload 0
      // 92: invokespecial wl1.<init> (Li2h;)V
      // 95: putfield i2h.oit Lwl1;
      // 98: aload 0
      // 99: getfield i2h.oit Lwl1;
      // 9c: bipush 0
      // 9d: bipush 0
      // 9e: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // a1: invokevirtual wl1.kp2 (ILjava/lang/Object;)V
      // a4: aload 0
      // a5: getfield i2h.oit Lwl1;
      // a8: bipush 1
      // a9: sipush 300
      // ac: invokestatic java/lang/Short.valueOf (S)Ljava/lang/Short;
      // af: invokevirtual wl1.kp2 (ILjava/lang/Object;)V
      // b2: aload 0
      // b3: getfield i2h.oit Lwl1;
      // b6: bipush 3
      // b7: bipush 0
      // b8: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // bb: invokevirtual wl1.kp2 (ILjava/lang/Object;)V
      // be: aload 0
      // bf: getfield i2h.oit Lwl1;
      // c2: bipush 2
      // c3: ldc ""
      // c5: nop
      // c6: invokevirtual wl1.kp2 (ILjava/lang/Object;)V
      // c9: aload 0
      // ca: getfield i2h.oit Lwl1;
      // cd: bipush 4
      // ce: bipush 0
      // cf: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // d2: invokevirtual wl1.kp2 (ILjava/lang/Object;)V
      // d5: aload 0
      // d6: invokevirtual i2h.tbj ()V
      // d9: return
   }

   public abstract void tbj();

   public wl1 a0c() {
      return this.oit;
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: instanceof i2h
      // 08: iload 2
      // 09: ifne 24
      // 0c: ifeq 42
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast i2h
      // 1a: getfield i2h.x0s I
      // 1d: goto 24
      // 20: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: iload 2
      // 25: ifne 3f
      // 28: aload 0
      // 29: getfield i2h.x0s I
      // 2c: if_icmpne 3e
      // 2f: goto 36
      // 32: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 43
      // 3a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   @Override
   public int hashCode() {
      return this.x0s;
   }

   public void prv() {
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
      // 06: ifne 1e
      // 09: getfield i2h.oay Lt9d;
      // 0c: ifnull ad
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: getfield i2h.kfp D
      // 21: dconst_0
      // 22: dcmpl
      // 23: ifle 99
      // 26: aload 0
      // 27: iload 1
      // 28: ifne a9
      // 2b: goto 32
      // 2e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: iload 1
      // 33: ifne a9
      // 36: goto 3d
      // 39: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: getfield i2h.kfp D
      // 40: ldc2_w 256.0
      // 43: dcmpg
      // 44: ifge 99
      // 47: goto 4e
      // 4a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 0
      // 50: getfield i2h.o2v D
      // 53: aload 0
      // 54: getfield i2h.kfp D
      // 57: aload 0
      // 58: getfield i2h.vbd D
      // 5b: invokevirtual i2h.m6_ (DDD)V
      // 5e: aload 0
      // 5f: iload 1
      // 60: ifne 8c
      // 63: goto 6a
      // 66: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: getfield i2h.oay Lt9d;
      // 6d: aload 0
      // 6e: aload 0
      // 6f: invokevirtual i2h.aaw ()Lnh4;
      // 72: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 75: invokeinterface java/util/List.isEmpty ()Z 1
      // 7a: ifeq 8b
      // 7d: goto 84
      // 80: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: goto 99
      // 87: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: aload 0
      // 8c: dup
      // 8d: getfield i2h.kfp D
      // 90: dconst_1
      // 91: dadd
      // 92: putfield i2h.kfp D
      // 95: iload 1
      // 96: ifeq 16
      // 99: aload 0
      // 9a: aload 0
      // 9b: aload 0
      // 9c: dconst_0
      // 9d: dup2_x1
      // 9e: putfield i2h.bw4 D
      // a1: dup2_x1
      // a2: putfield i2h.mop D
      // a5: putfield i2h.icv D
      // a8: aload 0
      // a9: fconst_0
      // aa: putfield i2h.y2i F
      // ad: return
   }

   public void _kl() {
      this.ma9 = true;
   }

   public void yxc(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: fload 1
      // 05: iload 3
      // 06: ifne 3e
      // 09: aload 0
      // 0a: getfield i2h.uo6 F
      // 0d: fcmpl
      // 0e: ifne 33
      // 11: goto 18
      // 14: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: fload 2
      // 19: iload 3
      // 1a: ifne 3e
      // 1d: goto 24
      // 20: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: getfield i2h.ikl F
      // 28: fcmpl
      // 29: ifeq f0
      // 2c: goto 33
      // 2f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: getfield i2h.uo6 F
      // 37: goto 3e
      // 3a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: fstore 4
      // 40: aload 0
      // 41: fload 1
      // 42: putfield i2h.uo6 F
      // 45: aload 0
      // 46: fload 2
      // 47: putfield i2h.ikl F
      // 4a: aload 0
      // 4b: new nh4
      // 4e: dup
      // 4f: aload 0
      // 50: invokevirtual i2h.aaw ()Lnh4;
      // 53: getfield nh4.rlc D
      // 56: aload 0
      // 57: invokevirtual i2h.aaw ()Lnh4;
      // 5a: getfield nh4.bx_ D
      // 5d: aload 0
      // 5e: invokevirtual i2h.aaw ()Lnh4;
      // 61: getfield nh4.t8n D
      // 64: aload 0
      // 65: invokevirtual i2h.aaw ()Lnh4;
      // 68: getfield nh4.rlc D
      // 6b: aload 0
      // 6c: getfield i2h.uo6 F
      // 6f: f2d
      // 70: dadd
      // 71: aload 0
      // 72: invokevirtual i2h.aaw ()Lnh4;
      // 75: getfield nh4.bx_ D
      // 78: aload 0
      // 79: getfield i2h.ikl F
      // 7c: f2d
      // 7d: dadd
      // 7e: aload 0
      // 7f: invokevirtual i2h.aaw ()Lnh4;
      // 82: getfield nh4.t8n D
      // 85: aload 0
      // 86: getfield i2h.uo6 F
      // 89: f2d
      // 8a: dadd
      // 8b: invokespecial nh4.<init> (DDDDDD)V
      // 8e: invokevirtual i2h.qq7 (Lnh4;)V
      // 91: aload 0
      // 92: getfield i2h.uo6 F
      // 95: fload 4
      // 97: fcmpl
      // 98: iload 3
      // 99: ifne b1
      // 9c: ifle f0
      // 9f: goto a6
      // a2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: aload 0
      // a7: getfield i2h.jwh Z
      // aa: goto b1
      // ad: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: iload 3
      // b2: ifne d8
      // b5: ifne f0
      // b8: goto bf
      // bb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be: athrow
      // bf: aload 0
      // c0: iload 3
      // c1: ifne dc
      // c4: goto cb
      // c7: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ca: athrow
      // cb: getfield i2h.oay Lt9d;
      // ce: getfield t9d.v0f Z
      // d1: goto d8
      // d4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d7: athrow
      // d8: ifne f0
      // db: aload 0
      // dc: fload 4
      // de: aload 0
      // df: getfield i2h.uo6 F
      // e2: fsub
      // e3: f2d
      // e4: dconst_0
      // e5: fload 4
      // e7: aload 0
      // e8: getfield i2h.uo6 F
      // eb: fsub
      // ec: f2d
      // ed: invokevirtual i2h.vjj (DDD)V
      // f0: return
   }

   public void iym(float var1, float var2) {
      this.x5k = var1 % 360.0F;
      this.y2i = var2 % 360.0F;
   }

   public void m6_(double var1, double var3, double var5) {
      this.o2v = var1;
      this.kfp = var3;
      this.vbd = var5;
      float var7 = this.uo6 / 2.0F;
      float var8 = this.ikl;
      this.qq7(new nh4(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   public void zwi(float var1, float var2) {
      float var3 = this.y2i;
      float var4 = this.x5k;
      this.x5k = (float)((double)this.x5k + (double)var1 * 0.15);
      this.y2i = (float)((double)this.y2i - (double)var2 * 0.15);
      this.y2i = fe6._f3(this.y2i, -90.0F, 90.0F);
      this.j25 = this.j25 + (this.y2i - var3);
      this.p3h = this.p3h + (this.x5k - var4);
   }

   public void xx_() {
      this.mwr();
   }

   public void mwr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i2h.f J
      // 003: ldc2_w 136502374967737
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield i2h.oay Lt9d;
      // 010: getfield t9d.e8t Luan;
      // 013: sipush 1287
      // 016: ldc2_w 3051106760613532920
      // 019: lload 1
      // 01a: lxor
      // 01b: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual uan.qek (Ljava/lang/String;)V
      // 024: aload 0
      // 025: getfield i2h.hzp Li2h;
      // 028: iload 3
      // 029: ifne 08f
      // 02c: ifnull 05e
      // 02f: goto 036
      // 032: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 0
      // 037: getfield i2h.hzp Li2h;
      // 03a: getfield i2h.ma9 Z
      // 03d: iload 3
      // 03e: ifne 095
      // 041: goto 048
      // 044: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: ifeq 05e
      // 04b: goto 052
      // 04e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 0
      // 053: aconst_null
      // 054: putfield i2h.hzp Li2h;
      // 057: goto 05e
      // 05a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield i2h.odd F
      // 063: putfield i2h.c9u F
      // 066: aload 0
      // 067: aload 0
      // 068: getfield i2h.o2v D
      // 06b: putfield i2h.bc1 D
      // 06e: aload 0
      // 06f: aload 0
      // 070: getfield i2h.kfp D
      // 073: putfield i2h.o_z D
      // 076: aload 0
      // 077: aload 0
      // 078: getfield i2h.vbd D
      // 07b: putfield i2h.a4d D
      // 07e: aload 0
      // 07f: aload 0
      // 080: getfield i2h.y2i F
      // 083: putfield i2h.j25 F
      // 086: aload 0
      // 087: aload 0
      // 088: getfield i2h.x5k F
      // 08b: putfield i2h.p3h F
      // 08e: aload 0
      // 08f: getfield i2h.oay Lt9d;
      // 092: getfield t9d.v0f Z
      // 095: iload 3
      // 096: ifne 223
      // 099: ifne 213
      // 09c: goto 0a3
      // 09f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield i2h.oay Lt9d;
      // 0a7: instanceof dug
      // 0aa: iload 3
      // 0ab: ifne 223
      // 0ae: goto 0b5
      // 0b1: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: ifeq 213
      // 0b8: goto 0bf
      // 0bb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield i2h.oay Lt9d;
      // 0c3: getfield t9d.e8t Luan;
      // 0c6: sipush 6100
      // 0c9: ldc2_w 7262722282834003502
      // 0cc: lload 1
      // 0cd: lxor
      // 0ce: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: nop
      // 0d4: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0d7: aload 0
      // 0d8: getfield i2h.oay Lt9d;
      // 0db: checkcast dug
      // 0de: invokevirtual dug.ve6 ()Lvr1;
      // 0e1: astore 4
      // 0e3: aload 0
      // 0e4: invokevirtual i2h.cu2 ()I
      // 0e7: istore 5
      // 0e9: aload 0
      // 0ea: getfield i2h.jjl Z
      // 0ed: iload 3
      // 0ee: ifne 1a9
      // 0f1: ifeq 19e
      // 0f4: goto 0fb
      // 0f7: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: aload 4
      // 0fd: invokevirtual vr1.ksh ()Z
      // 100: iload 3
      // 101: ifne 1f5
      // 104: goto 10b
      // 107: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: ifeq 1e6
      // 10e: goto 115
      // 111: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 114: athrow
      // 115: aload 0
      // 116: getfield i2h.hzp Li2h;
      // 119: iload 3
      // 11a: ifne 196
      // 11d: goto 124
      // 120: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: ifnonnull 195
      // 127: goto 12e
      // 12a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12d: athrow
      // 12e: aload 0
      // 12f: dup
      // 130: getfield i2h.cyu I
      // 133: iload 3
      // 134: ifne 197
      // 137: goto 13e
      // 13a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: dup_x1
      // 13f: bipush 1
      // 140: iadd
      // 141: putfield i2h.cyu I
      // 144: iload 5
      // 146: if_icmplt 195
      // 149: goto 150
      // 14c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: aload 0
      // 151: iload 5
      // 153: putfield i2h.cyu I
      // 156: aload 0
      // 157: aload 0
      // 158: invokevirtual i2h.k0g ()I
      // 15b: putfield i2h.rr6 I
      // 15e: aload 0
      // 15f: getfield i2h.oay Lt9d;
      // 162: getfield t9d.vzz Lupn;
      // 165: invokevirtual upn.gs_ ()I
      // 168: iload 3
      // 169: ifne 18d
      // 16c: goto 173
      // 16f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 172: athrow
      // 173: bipush -1
      // 174: if_icmpne 185
      // 177: goto 17e
      // 17a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: bipush 0
      // 17f: istore 6
      // 181: iload 3
      // 182: ifeq 18f
      // 185: bipush -1
      // 186: goto 18d
      // 189: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: istore 6
      // 18f: aload 0
      // 190: iload 6
      // 192: invokevirtual i2h.zye (I)V
      // 195: aload 0
      // 196: bipush 0
      // 197: putfield i2h.jjl Z
      // 19a: iload 3
      // 19b: ifeq 1e6
      // 19e: aload 0
      // 19f: getfield i2h.cyu I
      // 1a2: goto 1a9
      // 1a5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: iload 3
      // 1aa: ifne 1cc
      // 1ad: ifle 1c8
      // 1b0: goto 1b7
      // 1b3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: dup
      // 1b9: getfield i2h.cyu I
      // 1bc: bipush 4
      // 1bd: isub
      // 1be: putfield i2h.cyu I
      // 1c1: goto 1c8
      // 1c4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: getfield i2h.cyu I
      // 1cc: iload 3
      // 1cd: ifne 1f5
      // 1d0: ifge 1e6
      // 1d3: goto 1da
      // 1d6: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d9: athrow
      // 1da: aload 0
      // 1db: bipush 0
      // 1dc: putfield i2h.cyu I
      // 1df: goto 1e6
      // 1e2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: aload 0
      // 1e7: iload 3
      // 1e8: ifne 20a
      // 1eb: getfield i2h.rr6 I
      // 1ee: goto 1f5
      // 1f1: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f4: athrow
      // 1f5: ifle 209
      // 1f8: aload 0
      // 1f9: dup
      // 1fa: getfield i2h.rr6 I
      // 1fd: bipush 1
      // 1fe: isub
      // 1ff: putfield i2h.rr6 I
      // 202: goto 209
      // 205: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield i2h.oay Lt9d;
      // 20d: getfield t9d.e8t Luan;
      // 210: invokevirtual uan.uio ()V
      // 213: aload 0
      // 214: invokevirtual i2h.i6m ()V
      // 217: aload 0
      // 218: invokevirtual i2h.r24 ()Z
      // 21b: pop
      // 21c: aload 0
      // 21d: getfield i2h.oay Lt9d;
      // 220: getfield t9d.v0f Z
      // 223: iload 3
      // 224: ifne 24c
      // 227: ifeq 241
      // 22a: goto 231
      // 22d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 230: athrow
      // 231: aload 0
      // 232: bipush 0
      // 233: putfield i2h.bry I
      // 236: iload 3
      // 237: ifeq 2dc
      // 23a: goto 241
      // 23d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: aload 0
      // 242: getfield i2h.bry I
      // 245: goto 24c
      // 248: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24b: athrow
      // 24c: iload 3
      // 24d: ifne 2e0
      // 250: ifle 2dc
      // 253: goto 25a
      // 256: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 259: athrow
      // 25a: aload 0
      // 25b: getfield i2h.cuj Z
      // 25e: iload 3
      // 25f: ifne 2bf
      // 262: goto 269
      // 265: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 268: athrow
      // 269: ifeq 2a6
      // 26c: goto 273
      // 26f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 272: athrow
      // 273: aload 0
      // 274: dup
      // 275: getfield i2h.bry I
      // 278: bipush 4
      // 279: isub
      // 27a: putfield i2h.bry I
      // 27d: aload 0
      // 27e: getfield i2h.bry I
      // 281: iload 3
      // 282: ifne 2e0
      // 285: goto 28c
      // 288: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28b: athrow
      // 28c: ifge 2dc
      // 28f: goto 296
      // 292: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 295: athrow
      // 296: aload 0
      // 297: bipush 0
      // 298: putfield i2h.bry I
      // 29b: iload 3
      // 29c: ifeq 2dc
      // 29f: goto 2a6
      // 2a2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: iload 3
      // 2a8: ifne 2d3
      // 2ab: goto 2b2
      // 2ae: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b1: athrow
      // 2b2: getfield i2h.bry I
      // 2b5: bipush 20
      // 2b7: irem
      // 2b8: goto 2bf
      // 2bb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: ifne 2d2
      // 2c2: aload 0
      // 2c3: getstatic ofh.rpg Lofh;
      // 2c6: fconst_1
      // 2c7: invokevirtual i2h.m1t (Lofh;F)Z
      // 2ca: pop
      // 2cb: goto 2d2
      // 2ce: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d1: athrow
      // 2d2: aload 0
      // 2d3: dup
      // 2d4: getfield i2h.bry I
      // 2d7: bipush 1
      // 2d8: isub
      // 2d9: putfield i2h.bry I
      // 2dc: aload 0
      // 2dd: invokevirtual i2h.b2u ()Z
      // 2e0: iload 3
      // 2e1: ifne 30d
      // 2e4: ifeq 305
      // 2e7: goto 2ee
      // 2ea: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ed: athrow
      // 2ee: aload 0
      // 2ef: invokevirtual i2h.ckh ()V
      // 2f2: aload 0
      // 2f3: dup
      // 2f4: getfield i2h.o_8 F
      // 2f7: ldc 0.5
      // 2f9: nop
      // 2fa: fmul
      // 2fb: putfield i2h.o_8 F
      // 2fe: goto 305
      // 301: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 304: athrow
      // 305: aload 0
      // 306: getfield i2h.kfp D
      // 309: ldc2_w -64.0
      // 30c: dcmpg
      // 30d: iload 3
      // 30e: ifne 338
      // 311: ifge 326
      // 314: goto 31b
      // 317: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: aload 0
      // 31c: invokevirtual i2h.d0m ()V
      // 31f: goto 326
      // 322: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 325: athrow
      // 326: aload 0
      // 327: getfield i2h.oay Lt9d;
      // 32a: iload 3
      // 32b: ifne 367
      // 32e: getfield t9d.v0f Z
      // 331: goto 338
      // 334: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 337: athrow
      // 338: ifne 35e
      // 33b: aload 0
      // 33c: bipush 0
      // 33d: aload 0
      // 33e: getfield i2h.bry I
      // 341: iload 3
      // 342: ifne 357
      // 345: goto 34c
      // 348: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34b: athrow
      // 34c: ifle 35a
      // 34f: goto 356
      // 352: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 355: athrow
      // 356: bipush 1
      // 357: goto 35b
      // 35a: bipush 0
      // 35b: invokevirtual i2h.lqm (IZ)V
      // 35e: aload 0
      // 35f: bipush 0
      // 360: putfield i2h.jwh Z
      // 363: aload 0
      // 364: getfield i2h.oay Lt9d;
      // 367: getfield t9d.e8t Luan;
      // 36a: invokevirtual uan.uio ()V
      // 36d: return
   }

   public int cu2() {
      return 0;
   }

   public void ckh() {
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
      // 05: getfield i2h.cuj Z
      // 08: iload 1
      // 09: ifne 27
      // 0c: ifne 2e
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic ofh.w5u Lofh;
      // 1a: ldc 4.0
      // 1c: nop
      // 1d: invokevirtual i2h.m1t (Lofh;F)Z
      // 20: goto 27
      // 23: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: pop
      // 28: aload 0
      // 29: bipush 15
      // 2b: invokevirtual i2h.k03 (I)V
      // 2e: return
   }

   public void k03(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: bipush 20
      // 03: imul
      // 04: istore 3
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: iload 3
      // 0a: invokestatic a1s.vrg (Li2h;I)I
      // 0d: istore 3
      // 0e: istore 2
      // 0f: aload 0
      // 10: iload 2
      // 11: ifne 2a
      // 14: getfield i2h.bry I
      // 17: iload 3
      // 18: if_icmpge 2e
      // 1b: goto 22
      // 1e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: goto 2a
      // 26: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: iload 3
      // 2b: putfield i2h.bry I
      // 2e: return
   }

   public void utb() {
      this.bry = 0;
   }

   public void d0m() {
      this._kl();
   }

   public boolean nin(double var1, double var3, double var5) {
      nh4 var7 = this.aaw().sy_(var1, var3, var5);
      return this.cv7(var7);
   }

   private boolean cv7(nh4 param1) {
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
      // 05: getfield i2h.oay Lt9d;
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 0d: invokeinterface java/util/List.isEmpty ()Z 1
      // 12: iload 2
      // 13: ifeq 2f
      // 16: ifeq 41
      // 19: goto 20
      // 1c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield i2h.oay Lt9d;
      // 24: aload 1
      // 25: invokevirtual t9d.hhd (Lnh4;)Z
      // 28: goto 2f
      // 2b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: iload 2
      // 30: ifeq 3e
      // 33: ifne 41
      // 36: goto 3d
      // 39: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   public void vjj(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i2h.f J
      // 003: ldc2_w 51563744711406
      // 006: lxor
      // 007: lstore 7
      // 009: bipush 0
      // 00a: istore 10
      // 00c: invokestatic t9d.c ()I
      // 00f: bipush 0
      // 010: istore 12
      // 012: istore 9
      // 014: aload 0
      // 015: iload 9
      // 017: ifne 060
      // 01a: invokestatic c05.vz1 ()Lc05;
      // 01d: getfield c05.vg8 Ll86;
      // 020: if_acmpne 05f
      // 023: goto 02a
      // 026: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: new _qa
      // 02d: dup
      // 02e: aconst_null
      // 02f: dload 1
      // 030: dload 3
      // 031: dload 5
      // 033: invokespecial _qa.<init> (Lm2j;DDD)V
      // 036: astore 11
      // 038: aload 11
      // 03a: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 03d: pop
      // 03e: aload 11
      // 040: invokevirtual _qa.cc5 ()Z
      // 043: istore 10
      // 045: aload 11
      // 047: invokevirtual _qa.rum ()D
      // 04a: dstore 1
      // 04b: aload 11
      // 04d: invokevirtual _qa.op7 ()D
      // 050: dstore 3
      // 051: aload 11
      // 053: invokevirtual _qa.tbf ()D
      // 056: dstore 5
      // 058: aload 11
      // 05a: invokevirtual _qa.djc ()Z
      // 05d: istore 12
      // 05f: aload 0
      // 060: iload 9
      // 062: ifne 0b2
      // 065: getfield i2h.kvx Z
      // 068: ifeq 091
      // 06b: goto 072
      // 06e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 0
      // 073: aload 0
      // 074: invokevirtual i2h.aaw ()Lnh4;
      // 077: dload 1
      // 078: dload 3
      // 079: dload 5
      // 07b: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 07e: invokevirtual i2h.qq7 (Lnh4;)V
      // 081: aload 0
      // 082: invokespecial i2h.y3m ()V
      // 085: iload 9
      // 087: ifeq e40
      // 08a: goto 091
      // 08d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 0
      // 092: getfield i2h.oay Lt9d;
      // 095: getfield t9d.e8t Luan;
      // 098: sipush 23983
      // 09b: ldc2_w 4112788844918322993
      // 09e: lload 7
      // 0a0: lxor
      // 0a1: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: nop
      // 0a7: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0aa: aload 0
      // 0ab: goto 0b2
      // 0ae: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: getfield i2h.o2v D
      // 0b5: dstore 13
      // 0b7: aload 0
      // 0b8: getfield i2h.kfp D
      // 0bb: dstore 15
      // 0bd: aload 0
      // 0be: getfield i2h.vbd D
      // 0c1: dstore 17
      // 0c3: aload 0
      // 0c4: iload 9
      // 0c6: ifne 0fa
      // 0c9: getfield i2h.r1h Z
      // 0cc: ifeq 0fe
      // 0cf: goto 0d6
      // 0d2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: bipush 0
      // 0d8: putfield i2h.r1h Z
      // 0db: dload 1
      // 0dc: ldc2_w 0.25
      // 0df: dmul
      // 0e0: dstore 1
      // 0e1: dload 3
      // 0e2: ldc2_w 0.05000000074505806
      // 0e5: dmul
      // 0e6: dstore 3
      // 0e7: dload 5
      // 0e9: ldc2_w 0.25
      // 0ec: dmul
      // 0ed: dstore 5
      // 0ef: aload 0
      // 0f0: dconst_0
      // 0f1: putfield i2h.icv D
      // 0f4: aload 0
      // 0f5: dconst_0
      // 0f6: putfield i2h.mop D
      // 0f9: aload 0
      // 0fa: dconst_0
      // 0fb: putfield i2h.bw4 D
      // 0fe: dload 1
      // 0ff: dstore 19
      // 101: dload 3
      // 102: dstore 21
      // 104: dload 5
      // 106: dstore 23
      // 108: aload 0
      // 109: getfield i2h.lfk Z
      // 10c: iload 9
      // 10e: ifne 126
      // 111: ifeq 16b
      // 114: goto 11b
      // 117: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: aload 0
      // 11c: invokevirtual i2h.hzv ()Z
      // 11f: goto 126
      // 122: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: iload 9
      // 128: ifne 158
      // 12b: ifne 14d
      // 12e: goto 135
      // 131: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: iload 10
      // 137: iload 9
      // 139: ifne 158
      // 13c: goto 143
      // 13f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: ifeq 16b
      // 146: goto 14d
      // 149: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 0
      // 14e: instanceof ha9
      // 151: goto 158
      // 154: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: iload 9
      // 15a: ifne 168
      // 15d: ifeq 16b
      // 160: goto 167
      // 163: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: bipush 1
      // 168: goto 16c
      // 16b: bipush 0
      // 16c: istore 25
      // 16e: iload 25
      // 170: ifeq 417
      // 173: ldc2_w 0.05
      // 176: dstore 26
      // 178: dload 1
      // 179: dconst_0
      // 17a: dcmpl
      // 17b: ifeq 225
      // 17e: aload 0
      // 17f: getfield i2h.oay Lt9d;
      // 182: aload 0
      // 183: aload 0
      // 184: invokevirtual i2h.aaw ()Lnh4;
      // 187: dload 1
      // 188: ldc2_w -1.0
      // 18b: dconst_0
      // 18c: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 18f: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 192: invokeinterface java/util/List.isEmpty ()Z 1
      // 197: iload 9
      // 199: ifne 229
      // 19c: iload 9
      // 19e: ifne 229
      // 1a1: goto 1a8
      // 1a4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: ifeq 225
      // 1ab: goto 1b2
      // 1ae: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b1: athrow
      // 1b2: dload 1
      // 1b3: dload 26
      // 1b5: dcmpg
      // 1b6: iload 9
      // 1b8: ifne 204
      // 1bb: goto 1c2
      // 1be: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: ifge 1ee
      // 1c5: goto 1cc
      // 1c8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: dload 1
      // 1cd: dload 26
      // 1cf: dneg
      // 1d0: dcmpl
      // 1d1: iload 9
      // 1d3: ifne 204
      // 1d6: goto 1dd
      // 1d9: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: iflt 1ee
      // 1e0: goto 1e7
      // 1e3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: dconst_0
      // 1e8: dstore 1
      // 1e9: iload 9
      // 1eb: ifeq 21d
      // 1ee: dload 1
      // 1ef: dconst_0
      // 1f0: iload 9
      // 1f2: ifne 21b
      // 1f5: goto 1fc
      // 1f8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: dcmpl
      // 1fd: goto 204
      // 200: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 203: athrow
      // 204: ifle 211
      // 207: dload 1
      // 208: dload 26
      // 20a: dsub
      // 20b: dstore 1
      // 20c: iload 9
      // 20e: ifeq 21d
      // 211: dload 1
      // 212: dload 26
      // 214: goto 21b
      // 217: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: dadd
      // 21c: dstore 1
      // 21d: dload 1
      // 21e: dstore 19
      // 220: iload 9
      // 222: ifeq 178
      // 225: dload 5
      // 227: dconst_0
      // 228: dcmpl
      // 229: ifeq 2e4
      // 22c: aload 0
      // 22d: getfield i2h.oay Lt9d;
      // 230: aload 0
      // 231: aload 0
      // 232: invokevirtual i2h.aaw ()Lnh4;
      // 235: dconst_0
      // 236: ldc2_w -1.0
      // 239: dload 5
      // 23b: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 23e: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 241: invokeinterface java/util/List.isEmpty ()Z 1
      // 246: iload 9
      // 248: ifne 2e7
      // 24b: goto 252
      // 24e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 251: athrow
      // 252: iload 9
      // 254: ifne 2e7
      // 257: goto 25e
      // 25a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: ifeq 2e4
      // 261: goto 268
      // 264: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 267: athrow
      // 268: dload 5
      // 26a: dload 26
      // 26c: dcmpg
      // 26d: iload 9
      // 26f: ifne 2be
      // 272: goto 279
      // 275: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 278: athrow
      // 279: ifge 2a7
      // 27c: goto 283
      // 27f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: dload 5
      // 285: dload 26
      // 287: dneg
      // 288: dcmpl
      // 289: iload 9
      // 28b: ifne 2be
      // 28e: goto 295
      // 291: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 294: athrow
      // 295: iflt 2a7
      // 298: goto 29f
      // 29b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29e: athrow
      // 29f: dconst_0
      // 2a0: dstore 5
      // 2a2: iload 9
      // 2a4: ifeq 2db
      // 2a7: dload 5
      // 2a9: dconst_0
      // 2aa: iload 9
      // 2ac: ifne 2d8
      // 2af: goto 2b6
      // 2b2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: dcmpl
      // 2b7: goto 2be
      // 2ba: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bd: athrow
      // 2be: ifle 2cd
      // 2c1: dload 5
      // 2c3: dload 26
      // 2c5: dsub
      // 2c6: dstore 5
      // 2c8: iload 9
      // 2ca: ifeq 2db
      // 2cd: dload 5
      // 2cf: dload 26
      // 2d1: goto 2d8
      // 2d4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d7: athrow
      // 2d8: dadd
      // 2d9: dstore 5
      // 2db: dload 5
      // 2dd: dstore 23
      // 2df: iload 9
      // 2e1: ifeq 225
      // 2e4: dload 1
      // 2e5: dconst_0
      // 2e6: dcmpl
      // 2e7: ifeq 417
      // 2ea: dload 5
      // 2ec: dconst_0
      // 2ed: dcmpl
      // 2ee: iload 9
      // 2f0: ifne 331
      // 2f3: goto 2fa
      // 2f6: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f9: athrow
      // 2fa: ifeq 417
      // 2fd: goto 304
      // 300: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 303: athrow
      // 304: aload 0
      // 305: getfield i2h.oay Lt9d;
      // 308: aload 0
      // 309: aload 0
      // 30a: invokevirtual i2h.aaw ()Lnh4;
      // 30d: dload 1
      // 30e: ldc2_w -1.0
      // 311: dload 5
      // 313: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 316: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 319: iload 9
      // 31b: ifne 42a
      // 31e: goto 325
      // 321: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 324: athrow
      // 325: invokeinterface java/util/List.isEmpty ()Z 1
      // 32a: goto 331
      // 32d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 330: athrow
      // 331: ifeq 417
      // 334: dload 1
      // 335: dload 26
      // 337: dcmpg
      // 338: iload 9
      // 33a: ifne 386
      // 33d: goto 344
      // 340: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 343: athrow
      // 344: ifge 370
      // 347: goto 34e
      // 34a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34d: athrow
      // 34e: dload 1
      // 34f: dload 26
      // 351: dneg
      // 352: dcmpl
      // 353: iload 9
      // 355: ifne 386
      // 358: goto 35f
      // 35b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35e: athrow
      // 35f: iflt 370
      // 362: goto 369
      // 365: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 368: athrow
      // 369: dconst_0
      // 36a: dstore 1
      // 36b: iload 9
      // 36d: ifeq 39f
      // 370: dload 1
      // 371: dconst_0
      // 372: iload 9
      // 374: ifne 39d
      // 377: goto 37e
      // 37a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37d: athrow
      // 37e: dcmpl
      // 37f: goto 386
      // 382: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 385: athrow
      // 386: ifle 393
      // 389: dload 1
      // 38a: dload 26
      // 38c: dsub
      // 38d: dstore 1
      // 38e: iload 9
      // 390: ifeq 39f
      // 393: dload 1
      // 394: dload 26
      // 396: goto 39d
      // 399: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: dadd
      // 39e: dstore 1
      // 39f: dload 1
      // 3a0: dstore 19
      // 3a2: dload 5
      // 3a4: dload 26
      // 3a6: dcmpg
      // 3a7: iload 9
      // 3a9: ifne 3f1
      // 3ac: ifge 3da
      // 3af: goto 3b6
      // 3b2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b5: athrow
      // 3b6: dload 5
      // 3b8: dload 26
      // 3ba: dneg
      // 3bb: dcmpl
      // 3bc: iload 9
      // 3be: ifne 3f1
      // 3c1: goto 3c8
      // 3c4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c7: athrow
      // 3c8: iflt 3da
      // 3cb: goto 3d2
      // 3ce: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d1: athrow
      // 3d2: dconst_0
      // 3d3: dstore 5
      // 3d5: iload 9
      // 3d7: ifeq 40e
      // 3da: dload 5
      // 3dc: dconst_0
      // 3dd: iload 9
      // 3df: ifne 40b
      // 3e2: goto 3e9
      // 3e5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e8: athrow
      // 3e9: dcmpl
      // 3ea: goto 3f1
      // 3ed: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f0: athrow
      // 3f1: ifle 400
      // 3f4: dload 5
      // 3f6: dload 26
      // 3f8: dsub
      // 3f9: dstore 5
      // 3fb: iload 9
      // 3fd: ifeq 40e
      // 400: dload 5
      // 402: dload 26
      // 404: goto 40b
      // 407: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40a: athrow
      // 40b: dadd
      // 40c: dstore 5
      // 40e: dload 5
      // 410: dstore 23
      // 412: iload 9
      // 414: ifeq 2e4
      // 417: aload 0
      // 418: getfield i2h.oay Lt9d;
      // 41b: aload 0
      // 41c: aload 0
      // 41d: invokevirtual i2h.aaw ()Lnh4;
      // 420: dload 1
      // 421: dload 3
      // 422: dload 5
      // 424: invokevirtual nh4.z9h (DDD)Lnh4;
      // 427: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 42a: astore 26
      // 42c: aload 0
      // 42d: invokevirtual i2h.aaw ()Lnh4;
      // 430: astore 27
      // 432: aload 26
      // 434: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 439: astore 28
      // 43b: aload 28
      // 43d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 442: ifeq 46d
      // 445: aload 28
      // 447: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44c: checkcast nh4
      // 44f: astore 29
      // 451: aload 29
      // 453: aload 0
      // 454: invokevirtual i2h.aaw ()Lnh4;
      // 457: dload 3
      // 458: invokevirtual nh4.tf9 (Lnh4;D)D
      // 45b: dstore 3
      // 45c: iload 9
      // 45e: ifne 47b
      // 461: iload 9
      // 463: ifeq 43b
      // 466: goto 46d
      // 469: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46c: athrow
      // 46d: aload 0
      // 46e: aload 0
      // 46f: invokevirtual i2h.aaw ()Lnh4;
      // 472: dconst_0
      // 473: dload 3
      // 474: dconst_0
      // 475: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 478: invokevirtual i2h.qq7 (Lnh4;)V
      // 47b: aload 0
      // 47c: getfield i2h.lfk Z
      // 47f: iload 9
      // 481: ifne 4c3
      // 484: ifne 4c2
      // 487: goto 48e
      // 48a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48d: athrow
      // 48e: dload 21
      // 490: dload 3
      // 491: dcmpl
      // 492: iload 9
      // 494: ifne 4b3
      // 497: goto 49e
      // 49a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49d: athrow
      // 49e: ifeq 4c6
      // 4a1: goto 4a8
      // 4a4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a7: athrow
      // 4a8: dload 21
      // 4aa: dconst_0
      // 4ab: dcmpg
      // 4ac: goto 4b3
      // 4af: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b2: athrow
      // 4b3: iload 9
      // 4b5: ifne 4c3
      // 4b8: ifge 4c6
      // 4bb: goto 4c2
      // 4be: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c1: athrow
      // 4c2: bipush 1
      // 4c3: goto 4c7
      // 4c6: bipush 0
      // 4c7: istore 28
      // 4c9: aload 26
      // 4cb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4d0: astore 29
      // 4d2: aload 29
      // 4d4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4d9: ifeq 504
      // 4dc: aload 29
      // 4de: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e3: checkcast nh4
      // 4e6: astore 30
      // 4e8: aload 30
      // 4ea: aload 0
      // 4eb: invokevirtual i2h.aaw ()Lnh4;
      // 4ee: dload 1
      // 4ef: invokevirtual nh4.fni (Lnh4;D)D
      // 4f2: dstore 1
      // 4f3: iload 9
      // 4f5: ifne 512
      // 4f8: iload 9
      // 4fa: ifeq 4d2
      // 4fd: goto 504
      // 500: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 503: athrow
      // 504: aload 0
      // 505: aload 0
      // 506: invokevirtual i2h.aaw ()Lnh4;
      // 509: dload 1
      // 50a: dconst_0
      // 50b: dconst_0
      // 50c: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 50f: invokevirtual i2h.qq7 (Lnh4;)V
      // 512: aload 26
      // 514: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 519: astore 29
      // 51b: aload 29
      // 51d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 522: ifeq 54f
      // 525: aload 29
      // 527: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 52c: checkcast nh4
      // 52f: astore 30
      // 531: aload 30
      // 533: aload 0
      // 534: invokevirtual i2h.aaw ()Lnh4;
      // 537: dload 5
      // 539: invokevirtual nh4.wld (Lnh4;D)D
      // 53c: dstore 5
      // 53e: iload 9
      // 540: ifne 55e
      // 543: iload 9
      // 545: ifeq 51b
      // 548: goto 54f
      // 54b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54e: athrow
      // 54f: aload 0
      // 550: aload 0
      // 551: invokevirtual i2h.aaw ()Lnh4;
      // 554: dconst_0
      // 555: dconst_0
      // 556: dload 5
      // 558: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 55b: invokevirtual i2h.qq7 (Lnh4;)V
      // 55e: new gnk
      // 561: dup
      // 562: bipush 1
      // 563: aload 0
      // 564: getfield i2h.nr7 F
      // 567: f2d
      // 568: invokespecial gnk.<init> (ZD)V
      // 56b: astore 29
      // 56d: aload 0
      // 56e: invokestatic c05.vz1 ()Lc05;
      // 571: getfield c05.vg8 Ll86;
      // 574: if_acmpne 584
      // 577: aload 29
      // 579: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 57c: pop
      // 57d: goto 584
      // 580: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 583: athrow
      // 584: dload 1
      // 585: dstore 30
      // 587: dload 3
      // 588: dstore 32
      // 58a: dload 5
      // 58c: dstore 34
      // 58e: iload 9
      // 590: ifne 936
      // 593: dload 1
      // 594: dload 1
      // 595: dmul
      // 596: dload 5
      // 598: dload 5
      // 59a: dmul
      // 59b: dadd
      // 59c: dload 1
      // 59d: dload 1
      // 59e: dmul
      // 59f: dload 5
      // 5a1: dload 5
      // 5a3: dmul
      // 5a4: dadd
      // 5a5: dcmpl
      // 5a6: iflt 90f
      // 5a9: goto 5b0
      // 5ac: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5af: athrow
      // 5b0: aload 29
      // 5b2: invokevirtual gnk.spj ()D
      // 5b5: dconst_0
      // 5b6: dcmpl
      // 5b7: iload 9
      // 5b9: ifne 5cf
      // 5bc: goto 5c3
      // 5bf: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c2: athrow
      // 5c3: ifle 90f
      // 5c6: goto 5cd
      // 5c9: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5cc: athrow
      // 5cd: iload 28
      // 5cf: iload 9
      // 5d1: ifne 5e9
      // 5d4: ifeq 90f
      // 5d7: goto 5de
      // 5da: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5dd: athrow
      // 5de: dload 19
      // 5e0: dload 1
      // 5e1: dcmpl
      // 5e2: goto 5e9
      // 5e5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e8: athrow
      // 5e9: iload 9
      // 5eb: ifne 604
      // 5ee: ifne 607
      // 5f1: goto 5f8
      // 5f4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f7: athrow
      // 5f8: dload 23
      // 5fa: dload 5
      // 5fc: dcmpl
      // 5fd: goto 604
      // 600: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 603: athrow
      // 604: ifeq 90f
      // 607: aload 0
      // 608: invokevirtual i2h.aaw ()Lnh4;
      // 60b: astore 36
      // 60d: aload 0
      // 60e: aload 27
      // 610: invokevirtual i2h.qq7 (Lnh4;)V
      // 613: aload 29
      // 615: invokevirtual gnk.spj ()D
      // 618: dstore 3
      // 619: aload 0
      // 61a: getfield i2h.oay Lt9d;
      // 61d: aload 0
      // 61e: aload 0
      // 61f: invokevirtual i2h.aaw ()Lnh4;
      // 622: dload 19
      // 624: dload 3
      // 625: dload 23
      // 627: invokevirtual nh4.z9h (DDD)Lnh4;
      // 62a: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 62d: astore 37
      // 62f: aload 0
      // 630: invokevirtual i2h.aaw ()Lnh4;
      // 633: astore 38
      // 635: aload 38
      // 637: dload 19
      // 639: dconst_0
      // 63a: dload 23
      // 63c: invokevirtual nh4.z9h (DDD)Lnh4;
      // 63f: astore 39
      // 641: dload 3
      // 642: dstore 40
      // 644: aload 37
      // 646: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 64b: astore 42
      // 64d: aload 42
      // 64f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 654: ifeq 67f
      // 657: aload 42
      // 659: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 65e: checkcast nh4
      // 661: astore 43
      // 663: aload 43
      // 665: aload 39
      // 667: dload 40
      // 669: invokevirtual nh4.tf9 (Lnh4;D)D
      // 66c: dstore 40
      // 66e: iload 9
      // 670: ifne 68a
      // 673: iload 9
      // 675: ifeq 64d
      // 678: goto 67f
      // 67b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67e: athrow
      // 67f: aload 38
      // 681: dconst_0
      // 682: dload 40
      // 684: dconst_0
      // 685: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 688: astore 38
      // 68a: dload 19
      // 68c: dstore 42
      // 68e: aload 37
      // 690: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 695: astore 44
      // 697: aload 44
      // 699: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 69e: ifeq 6c9
      // 6a1: aload 44
      // 6a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6a8: checkcast nh4
      // 6ab: astore 45
      // 6ad: aload 45
      // 6af: aload 38
      // 6b1: dload 42
      // 6b3: invokevirtual nh4.fni (Lnh4;D)D
      // 6b6: dstore 42
      // 6b8: iload 9
      // 6ba: ifne 6d4
      // 6bd: iload 9
      // 6bf: ifeq 697
      // 6c2: goto 6c9
      // 6c5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c8: athrow
      // 6c9: aload 38
      // 6cb: dload 42
      // 6cd: dconst_0
      // 6ce: dconst_0
      // 6cf: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 6d2: astore 38
      // 6d4: dload 23
      // 6d6: dstore 44
      // 6d8: aload 37
      // 6da: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 6df: astore 46
      // 6e1: aload 46
      // 6e3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6e8: ifeq 713
      // 6eb: aload 46
      // 6ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6f2: checkcast nh4
      // 6f5: astore 47
      // 6f7: aload 47
      // 6f9: aload 38
      // 6fb: dload 44
      // 6fd: invokevirtual nh4.wld (Lnh4;D)D
      // 700: dstore 44
      // 702: iload 9
      // 704: ifne 71e
      // 707: iload 9
      // 709: ifeq 6e1
      // 70c: goto 713
      // 70f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 712: athrow
      // 713: aload 38
      // 715: dconst_0
      // 716: dconst_0
      // 717: dload 44
      // 719: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 71c: astore 38
      // 71e: aload 0
      // 71f: invokevirtual i2h.aaw ()Lnh4;
      // 722: astore 46
      // 724: dload 3
      // 725: dstore 47
      // 727: aload 37
      // 729: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 72e: astore 49
      // 730: aload 49
      // 732: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 737: ifeq 762
      // 73a: aload 49
      // 73c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 741: checkcast nh4
      // 744: astore 50
      // 746: aload 50
      // 748: aload 46
      // 74a: dload 47
      // 74c: invokevirtual nh4.tf9 (Lnh4;D)D
      // 74f: dstore 47
      // 751: iload 9
      // 753: ifne 76d
      // 756: iload 9
      // 758: ifeq 730
      // 75b: goto 762
      // 75e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 761: athrow
      // 762: aload 46
      // 764: dconst_0
      // 765: dload 47
      // 767: dconst_0
      // 768: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 76b: astore 46
      // 76d: dload 19
      // 76f: dstore 49
      // 771: aload 37
      // 773: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 778: astore 51
      // 77a: aload 51
      // 77c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 781: ifeq 7ac
      // 784: aload 51
      // 786: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 78b: checkcast nh4
      // 78e: astore 52
      // 790: aload 52
      // 792: aload 46
      // 794: dload 49
      // 796: invokevirtual nh4.fni (Lnh4;D)D
      // 799: dstore 49
      // 79b: iload 9
      // 79d: ifne 7b7
      // 7a0: iload 9
      // 7a2: ifeq 77a
      // 7a5: goto 7ac
      // 7a8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ab: athrow
      // 7ac: aload 46
      // 7ae: dload 49
      // 7b0: dconst_0
      // 7b1: dconst_0
      // 7b2: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 7b5: astore 46
      // 7b7: dload 23
      // 7b9: dstore 51
      // 7bb: aload 37
      // 7bd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 7c2: astore 53
      // 7c4: aload 53
      // 7c6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7cb: ifeq 7f6
      // 7ce: aload 53
      // 7d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7d5: checkcast nh4
      // 7d8: astore 54
      // 7da: aload 54
      // 7dc: aload 46
      // 7de: dload 51
      // 7e0: invokevirtual nh4.wld (Lnh4;D)D
      // 7e3: dstore 51
      // 7e5: iload 9
      // 7e7: ifne 801
      // 7ea: iload 9
      // 7ec: ifeq 7c4
      // 7ef: goto 7f6
      // 7f2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f5: athrow
      // 7f6: aload 46
      // 7f8: dconst_0
      // 7f9: dconst_0
      // 7fa: dload 51
      // 7fc: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 7ff: astore 46
      // 801: dload 42
      // 803: dload 42
      // 805: dmul
      // 806: dload 44
      // 808: dload 44
      // 80a: dmul
      // 80b: dadd
      // 80c: dstore 53
      // 80e: dload 49
      // 810: dload 49
      // 812: dmul
      // 813: dload 51
      // 815: dload 51
      // 817: dmul
      // 818: dadd
      // 819: dstore 55
      // 81b: dload 53
      // 81d: iload 9
      // 81f: ifne 846
      // 822: dload 55
      // 824: dcmpl
      // 825: ifle 841
      // 828: goto 82f
      // 82b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82e: athrow
      // 82f: dload 42
      // 831: dstore 1
      // 832: dload 44
      // 834: dstore 5
      // 836: aload 0
      // 837: aload 38
      // 839: invokevirtual i2h.qq7 (Lnh4;)V
      // 83c: iload 9
      // 83e: ifeq 84e
      // 841: dload 49
      // 843: dstore 1
      // 844: dload 51
      // 846: dstore 5
      // 848: aload 0
      // 849: aload 46
      // 84b: invokevirtual i2h.qq7 (Lnh4;)V
      // 84e: aload 29
      // 850: invokevirtual gnk.spj ()D
      // 853: dneg
      // 854: dstore 3
      // 855: aload 37
      // 857: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 85c: astore 57
      // 85e: aload 57
      // 860: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 865: ifeq 890
      // 868: aload 57
      // 86a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 86f: checkcast nh4
      // 872: astore 58
      // 874: aload 58
      // 876: aload 0
      // 877: invokevirtual i2h.aaw ()Lnh4;
      // 87a: dload 3
      // 87b: invokevirtual nh4.tf9 (Lnh4;D)D
      // 87e: dstore 3
      // 87f: iload 9
      // 881: ifne 8aa
      // 884: iload 9
      // 886: ifeq 85e
      // 889: goto 890
      // 88c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88f: athrow
      // 890: aload 0
      // 891: iload 9
      // 893: ifne 8df
      // 896: aload 0
      // 897: invokevirtual i2h.aaw ()Lnh4;
      // 89a: dconst_0
      // 89b: dload 3
      // 89c: dconst_0
      // 89d: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 8a0: invokevirtual i2h.qq7 (Lnh4;)V
      // 8a3: goto 8aa
      // 8a6: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a9: athrow
      // 8aa: dload 30
      // 8ac: dload 30
      // 8ae: dmul
      // 8af: dload 34
      // 8b1: dload 34
      // 8b3: dmul
      // 8b4: dadd
      // 8b5: dload 1
      // 8b6: dload 1
      // 8b7: dmul
      // 8b8: dload 5
      // 8ba: dload 5
      // 8bc: dmul
      // 8bd: dadd
      // 8be: dcmpl
      // 8bf: iflt 8d7
      // 8c2: dload 30
      // 8c4: dstore 1
      // 8c5: dload 32
      // 8c7: dstore 3
      // 8c8: dload 34
      // 8ca: dstore 5
      // 8cc: aload 0
      // 8cd: aload 36
      // 8cf: invokevirtual i2h.qq7 (Lnh4;)V
      // 8d2: iload 9
      // 8d4: ifeq 90f
      // 8d7: aload 0
      // 8d8: goto 8df
      // 8db: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8de: athrow
      // 8df: iload 9
      // 8e1: ifne 937
      // 8e4: invokestatic c05.vz1 ()Lc05;
      // 8e7: getfield c05.vg8 Ll86;
      // 8ea: if_acmpne 90f
      // 8ed: goto 8f4
      // 8f0: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f3: athrow
      // 8f4: new gnk
      // 8f7: dup
      // 8f8: bipush 0
      // 8f9: aload 0
      // 8fa: getfield i2h.nr7 F
      // 8fd: f2d
      // 8fe: dconst_1
      // 8ff: dload 3
      // 900: dadd
      // 901: invokespecial gnk.<init> (ZDD)V
      // 904: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 907: pop
      // 908: goto 90f
      // 90b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90e: athrow
      // 90f: aload 0
      // 910: getfield i2h.oay Lt9d;
      // 913: getfield t9d.e8t Luan;
      // 916: invokevirtual uan.uio ()V
      // 919: aload 0
      // 91a: getfield i2h.oay Lt9d;
      // 91d: getfield t9d.e8t Luan;
      // 920: sipush 8897
      // 923: ldc2_w 7928139348435323005
      // 926: lload 7
      // 928: lxor
      // 929: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92e: nop
      // 92f: invokevirtual uan.qek (Ljava/lang/String;)V
      // 932: aload 0
      // 933: invokespecial i2h.y3m ()V
      // 936: aload 0
      // 937: dload 19
      // 939: dload 1
      // 93a: dcmpl
      // 93b: iload 9
      // 93d: ifne 966
      // 940: ifne 965
      // 943: goto 94a
      // 946: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 949: athrow
      // 94a: dload 23
      // 94c: dload 5
      // 94e: dcmpl
      // 94f: iload 9
      // 951: ifne 966
      // 954: goto 95b
      // 957: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95a: athrow
      // 95b: ifeq 969
      // 95e: goto 965
      // 961: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 964: athrow
      // 965: bipush 1
      // 966: goto 96a
      // 969: bipush 0
      // 96a: putfield i2h.cbi Z
      // 96d: aload 0
      // 96e: dload 21
      // 970: dload 3
      // 971: dcmpl
      // 972: iload 9
      // 974: ifne 982
      // 977: ifeq 985
      // 97a: goto 981
      // 97d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 980: athrow
      // 981: bipush 1
      // 982: goto 986
      // 985: bipush 0
      // 986: putfield i2h.fcv Z
      // 989: aload 0
      // 98a: aload 0
      // 98b: getfield i2h.fcv Z
      // 98e: iload 9
      // 990: ifne 9a8
      // 993: ifeq 9bb
      // 996: goto 99d
      // 999: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99c: athrow
      // 99d: dload 21
      // 99f: dconst_0
      // 9a0: dcmpg
      // 9a1: goto 9a8
      // 9a4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9a7: athrow
      // 9a8: iload 9
      // 9aa: ifne 9b8
      // 9ad: ifge 9bb
      // 9b0: goto 9b7
      // 9b3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b6: athrow
      // 9b7: bipush 1
      // 9b8: goto 9bc
      // 9bb: bipush 0
      // 9bc: putfield i2h.lfk Z
      // 9bf: aload 0
      // 9c0: aload 0
      // 9c1: getfield i2h.cbi Z
      // 9c4: iload 9
      // 9c6: ifne 9ee
      // 9c9: ifne 9ed
      // 9cc: goto 9d3
      // 9cf: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d2: athrow
      // 9d3: aload 0
      // 9d4: getfield i2h.fcv Z
      // 9d7: iload 9
      // 9d9: ifne 9ee
      // 9dc: goto 9e3
      // 9df: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e2: athrow
      // 9e3: ifeq 9f1
      // 9e6: goto 9ed
      // 9e9: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9ec: athrow
      // 9ed: bipush 1
      // 9ee: goto 9f2
      // 9f1: bipush 0
      // 9f2: putfield i2h.nop Z
      // 9f5: iload 12
      // 9f7: iload 9
      // 9f9: ifne a19
      // 9fc: ifeq a12
      // 9ff: goto a06
      // a02: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a05: athrow
      // a06: aload 0
      // a07: bipush 1
      // a08: putfield i2h.lfk Z
      // a0b: goto a12
      // a0e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a11: athrow
      // a12: aload 0
      // a13: getfield i2h.o2v D
      // a16: invokestatic fe6.jqf (D)I
      // a19: istore 36
      // a1b: aload 0
      // a1c: getfield i2h.kfp D
      // a1f: ldc2_w 0.20000000298023224
      // a22: dsub
      // a23: invokestatic fe6.jqf (D)I
      // a26: istore 37
      // a28: aload 0
      // a29: getfield i2h.vbd D
      // a2c: invokestatic fe6.jqf (D)I
      // a2f: istore 38
      // a31: new mew
      // a34: dup
      // a35: iload 36
      // a37: iload 37
      // a39: iload 38
      // a3b: invokespecial mew.<init> (III)V
      // a3e: astore 39
      // a40: aload 0
      // a41: getfield i2h.oay Lt9d;
      // a44: aload 39
      // a46: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // a49: invokeinterface zfz.r_y ()Le0x; 1
      // a4e: astore 40
      // a50: iload 9
      // a52: ifne adc
      // a55: aload 40
      // a57: invokevirtual e0x.p1r ()Lp3y;
      // a5a: getstatic p3y.cei Lp3y;
      // a5d: if_acmpne acf
      // a60: goto a67
      // a63: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a66: athrow
      // a67: aload 0
      // a68: getfield i2h.oay Lt9d;
      // a6b: aload 39
      // a6d: invokevirtual mew.eve ()Lmew;
      // a70: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // a73: invokeinterface zfz.r_y ()Le0x; 1
      // a78: astore 41
      // a7a: aload 41
      // a7c: iload 9
      // a7e: ifne ac6
      // a81: instanceof dqt
      // a84: ifne ac4
      // a87: goto a8e
      // a8a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8d: athrow
      // a8e: aload 41
      // a90: iload 9
      // a92: ifne ac6
      // a95: goto a9c
      // a98: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9b: athrow
      // a9c: instanceof f86
      // a9f: ifne ac4
      // aa2: goto aa9
      // aa5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa8: athrow
      // aa9: aload 41
      // aab: instanceof u98
      // aae: iload 9
      // ab0: ifne ae0
      // ab3: goto aba
      // ab6: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab9: athrow
      // aba: ifeq acf
      // abd: goto ac4
      // ac0: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac3: athrow
      // ac4: aload 41
      // ac6: astore 40
      // ac8: aload 39
      // aca: invokevirtual mew.eve ()Lmew;
      // acd: astore 39
      // acf: aload 0
      // ad0: dload 3
      // ad1: aload 0
      // ad2: getfield i2h.lfk Z
      // ad5: aload 40
      // ad7: aload 39
      // ad9: invokevirtual i2h.ihp (DZLe0x;Lmew;)V
      // adc: dload 19
      // ade: dload 1
      // adf: dcmpl
      // ae0: iload 9
      // ae2: ifne b00
      // ae5: ifeq afb
      // ae8: goto aef
      // aeb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aee: athrow
      // aef: aload 0
      // af0: dconst_0
      // af1: putfield i2h.icv D
      // af4: goto afb
      // af7: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // afa: athrow
      // afb: dload 23
      // afd: dload 5
      // aff: dcmpl
      // b00: iload 9
      // b02: ifne b1f
      // b05: ifeq b1b
      // b08: goto b0f
      // b0b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0e: athrow
      // b0f: aload 0
      // b10: dconst_0
      // b11: putfield i2h.bw4 D
      // b14: goto b1b
      // b17: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1a: athrow
      // b1b: dload 21
      // b1d: dload 3
      // b1e: dcmpl
      // b1f: iload 9
      // b21: ifne b4f
      // b24: ifeq b3f
      // b27: goto b2e
      // b2a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b2d: athrow
      // b2e: aload 40
      // b30: aload 0
      // b31: getfield i2h.oay Lt9d;
      // b34: aload 0
      // b35: invokevirtual e0x.r2j (Lt9d;Li2h;)V
      // b38: goto b3f
      // b3b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3e: athrow
      // b3f: aload 0
      // b40: iload 9
      // b42: ifne ce1
      // b45: invokevirtual i2h._p9 ()Z
      // b48: goto b4f
      // b4b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b4e: athrow
      // b4f: ifeq ce0
      // b52: iload 25
      // b54: ifne ce0
      // b57: goto b5e
      // b5a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b5d: athrow
      // b5e: aload 0
      // b5f: getfield i2h.hzp Li2h;
      // b62: iload 9
      // b64: ifne ce1
      // b67: goto b6e
      // b6a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6d: athrow
      // b6e: ifnonnull ce0
      // b71: goto b78
      // b74: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b77: athrow
      // b78: aload 0
      // b79: getfield i2h.o2v D
      // b7c: dload 13
      // b7e: dsub
      // b7f: dstore 41
      // b81: aload 0
      // b82: getfield i2h.kfp D
      // b85: dload 15
      // b87: dsub
      // b88: dstore 43
      // b8a: aload 0
      // b8b: getfield i2h.vbd D
      // b8e: dload 17
      // b90: dsub
      // b91: dstore 45
      // b93: aload 40
      // b95: iload 9
      // b97: ifne bac
      // b9a: getstatic ox_.h49 Le0x;
      // b9d: if_acmpeq baa
      // ba0: goto ba7
      // ba3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba6: athrow
      // ba7: dconst_0
      // ba8: dstore 43
      // baa: aload 40
      // bac: ifnull bdc
      // baf: aload 0
      // bb0: getfield i2h.lfk Z
      // bb3: iload 9
      // bb5: ifne c34
      // bb8: goto bbf
      // bbb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bbe: athrow
      // bbf: ifeq bdc
      // bc2: goto bc9
      // bc5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc8: athrow
      // bc9: aload 40
      // bcb: aload 0
      // bcc: getfield i2h.oay Lt9d;
      // bcf: aload 39
      // bd1: aload 0
      // bd2: invokevirtual e0x.xqy (Lt9d;Lmew;Li2h;)V
      // bd5: goto bdc
      // bd8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bdb: athrow
      // bdc: aload 0
      // bdd: aload 0
      // bde: getfield i2h.odd F
      // be1: f2d
      // be2: dload 41
      // be4: dload 41
      // be6: dmul
      // be7: dload 45
      // be9: dload 45
      // beb: dmul
      // bec: dadd
      // bed: invokestatic fe6.dii (D)F
      // bf0: f2d
      // bf1: ldc2_w 0.6
      // bf4: dmul
      // bf5: dadd
      // bf6: d2f
      // bf7: putfield i2h.odd F
      // bfa: aload 0
      // bfb: aload 0
      // bfc: getfield i2h.bb8 F
      // bff: f2d
      // c00: dload 41
      // c02: dload 41
      // c04: dmul
      // c05: dload 43
      // c07: dload 43
      // c09: dmul
      // c0a: dadd
      // c0b: dload 45
      // c0d: dload 45
      // c0f: dmul
      // c10: dadd
      // c11: invokestatic fe6.dii (D)F
      // c14: f2d
      // c15: ldc2_w 0.6
      // c18: dmul
      // c19: dadd
      // c1a: d2f
      // c1b: putfield i2h.bb8 F
      // c1e: aload 0
      // c1f: iload 9
      // c21: ifne ce1
      // c24: getfield i2h.bb8 F
      // c27: aload 0
      // c28: getfield i2h.tsv I
      // c2b: i2f
      // c2c: fcmpl
      // c2d: goto c34
      // c30: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c33: athrow
      // c34: ifle ce0
      // c37: aload 40
      // c39: invokevirtual e0x.p1r ()Lp3y;
      // c3c: getstatic p3y.cei Lp3y;
      // c3f: if_acmpeq ce0
      // c42: goto c49
      // c45: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c48: athrow
      // c49: aload 0
      // c4a: aload 0
      // c4b: getfield i2h.bb8 F
      // c4e: f2i
      // c4f: bipush 1
      // c50: iadd
      // c51: putfield i2h.tsv I
      // c54: aload 0
      // c55: iload 9
      // c57: ifne cd9
      // c5a: goto c61
      // c5d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c60: athrow
      // c61: invokevirtual i2h.mwv ()Z
      // c64: ifeq cd8
      // c67: goto c6e
      // c6a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c6d: athrow
      // c6e: aload 0
      // c6f: getfield i2h.icv D
      // c72: aload 0
      // c73: getfield i2h.icv D
      // c76: dmul
      // c77: ldc2_w 0.20000000298023224
      // c7a: dmul
      // c7b: aload 0
      // c7c: getfield i2h.mop D
      // c7f: aload 0
      // c80: getfield i2h.mop D
      // c83: dmul
      // c84: dadd
      // c85: aload 0
      // c86: getfield i2h.bw4 D
      // c89: aload 0
      // c8a: getfield i2h.bw4 D
      // c8d: dmul
      // c8e: ldc2_w 0.20000000298023224
      // c91: dmul
      // c92: dadd
      // c93: invokestatic fe6.dii (D)F
      // c96: ldc 0.35
      // c98: nop
      // c99: fmul
      // c9a: fstore 47
      // c9c: fload 47
      // c9e: iload 9
      // ca0: ifne cb7
      // ca3: fconst_1
      // ca4: fcmpl
      // ca5: ifle cb9
      // ca8: goto caf
      // cab: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cae: athrow
      // caf: fconst_1
      // cb0: goto cb7
      // cb3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cb6: athrow
      // cb7: fstore 47
      // cb9: aload 0
      // cba: aload 0
      // cbb: invokevirtual i2h.ors ()Ljava/lang/String;
      // cbe: fload 47
      // cc0: fconst_1
      // cc1: aload 0
      // cc2: getfield i2h.z2d Ljava/util/Random;
      // cc5: invokevirtual java/util/Random.nextFloat ()F
      // cc8: aload 0
      // cc9: getfield i2h.z2d Ljava/util/Random;
      // ccc: invokevirtual java/util/Random.nextFloat ()F
      // ccf: fsub
      // cd0: ldc 0.4
      // cd2: nop
      // cd3: fmul
      // cd4: fadd
      // cd5: invokevirtual i2h.lhu (Ljava/lang/String;FF)V
      // cd8: aload 0
      // cd9: aload 39
      // cdb: aload 40
      // cdd: invokevirtual i2h.cmh (Lmew;Le0x;)V
      // ce0: aload 0
      // ce1: invokevirtual i2h.urw ()V
      // ce4: goto d25
      // ce7: astore 41
      // ce9: aload 41
      // ceb: sipush 27005
      // cee: ldc2_w 6089651491811460069
      // cf1: lload 7
      // cf3: lxor
      // cf4: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf9: nop
      // cfa: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // cfd: astore 42
      // cff: aload 42
      // d01: sipush 16482
      // d04: ldc2_w 1207122310592965340
      // d07: lload 7
      // d09: lxor
      // d0a: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0f: nop
      // d10: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // d13: astore 43
      // d15: aload 0
      // d16: aload 43
      // d18: invokevirtual i2h.gfa (Lwsc;)V
      // d1b: new oov
      // d1e: dup
      // d1f: aload 42
      // d21: invokespecial oov.<init> (Le1i;)V
      // d24: athrow
      // d25: aload 0
      // d26: invokevirtual i2h.n08 ()Z
      // d29: istore 41
      // d2b: aload 0
      // d2c: getfield i2h.oay Lt9d;
      // d2f: aload 0
      // d30: invokevirtual i2h.aaw ()Lnh4;
      // d33: ldc2_w 0.001
      // d36: ldc2_w 0.001
      // d39: ldc2_w 0.001
      // d3c: invokevirtual nh4.va6 (DDD)Lnh4;
      // d3f: invokevirtual t9d.g5g (Lnh4;)Z
      // d42: iload 9
      // d44: ifne daf
      // d47: ifeq da4
      // d4a: goto d51
      // d4d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d50: athrow
      // d51: aload 0
      // d52: bipush 1
      // d53: invokevirtual i2h.esk (I)V
      // d56: iload 41
      // d58: iload 9
      // d5a: ifne dd0
      // d5d: goto d64
      // d60: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d63: athrow
      // d64: ifne dce
      // d67: goto d6e
      // d6a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d6d: athrow
      // d6e: aload 0
      // d6f: dup
      // d70: getfield i2h.bry I
      // d73: bipush 1
      // d74: iadd
      // d75: putfield i2h.bry I
      // d78: aload 0
      // d79: getfield i2h.bry I
      // d7c: iload 9
      // d7e: ifne dd0
      // d81: goto d88
      // d84: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d87: athrow
      // d88: ifne dce
      // d8b: goto d92
      // d8e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d91: athrow
      // d92: aload 0
      // d93: bipush 8
      // d95: invokevirtual i2h.k03 (I)V
      // d98: iload 9
      // d9a: ifeq dce
      // d9d: goto da4
      // da0: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // da3: athrow
      // da4: aload 0
      // da5: getfield i2h.bry I
      // da8: goto daf
      // dab: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dae: athrow
      // daf: iload 9
      // db1: ifne dd0
      // db4: ifgt dce
      // db7: goto dbe
      // dba: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dbd: athrow
      // dbe: aload 0
      // dbf: aload 0
      // dc0: getfield i2h.m29 I
      // dc3: ineg
      // dc4: putfield i2h.bry I
      // dc7: goto dce
      // dca: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dcd: athrow
      // dce: iload 41
      // dd0: iload 9
      // dd2: ifne df6
      // dd5: ifeq e36
      // dd8: goto ddf
      // ddb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dde: athrow
      // ddf: aload 0
      // de0: iload 9
      // de2: ifne e37
      // de5: goto dec
      // de8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // deb: athrow
      // dec: getfield i2h.bry I
      // def: goto df6
      // df2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // df5: athrow
      // df6: ifle e36
      // df9: aload 0
      // dfa: sipush 20133
      // dfd: ldc2_w 1761806686945387557
      // e00: lload 7
      // e02: lxor
      // e03: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e08: nop
      // e09: ldc 0.7
      // e0b: nop
      // e0c: ldc 1.6
      // e0e: nop
      // e0f: aload 0
      // e10: getfield i2h.z2d Ljava/util/Random;
      // e13: invokevirtual java/util/Random.nextFloat ()F
      // e16: aload 0
      // e17: getfield i2h.z2d Ljava/util/Random;
      // e1a: invokevirtual java/util/Random.nextFloat ()F
      // e1d: fsub
      // e1e: ldc 0.4
      // e20: nop
      // e21: fmul
      // e22: fadd
      // e23: invokevirtual i2h.lhu (Ljava/lang/String;FF)V
      // e26: aload 0
      // e27: aload 0
      // e28: getfield i2h.m29 I
      // e2b: ineg
      // e2c: putfield i2h.bry I
      // e2f: goto e36
      // e32: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e35: athrow
      // e36: aload 0
      // e37: getfield i2h.oay Lt9d;
      // e3a: getfield t9d.e8t Luan;
      // e3d: invokevirtual uan.uio ()V
      // e40: return
   }

   private void y3m() {
      this.o2v = (this.aaw().rlc + this.aaw().t_2) / 2.0;
      this.kfp = this.aaw().bx_;
      this.vbd = (this.aaw().t8n + this.aaw().oqj) / 2.0;
   }

   public String ors() {
      long var1 = f ^ 12683578897302L;
      return a<"p">(20829, 4554479049022249611L ^ var1);
   }

   public void urw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i2h.f J
      // 003: ldc2_w 61841894240350
      // 006: lxor
      // 007: lstore 1
      // 008: new mew
      // 00b: dup
      // 00c: aload 0
      // 00d: invokevirtual i2h.aaw ()Lnh4;
      // 010: getfield nh4.rlc D
      // 013: ldc2_w 0.001
      // 016: dadd
      // 017: aload 0
      // 018: invokevirtual i2h.aaw ()Lnh4;
      // 01b: getfield nh4.bx_ D
      // 01e: ldc2_w 0.001
      // 021: dadd
      // 022: aload 0
      // 023: invokevirtual i2h.aaw ()Lnh4;
      // 026: getfield nh4.t8n D
      // 029: ldc2_w 0.001
      // 02c: dadd
      // 02d: invokespecial mew.<init> (DDD)V
      // 030: astore 4
      // 032: invokestatic t9d.b ()I
      // 035: new mew
      // 038: dup
      // 039: aload 0
      // 03a: invokevirtual i2h.aaw ()Lnh4;
      // 03d: getfield nh4.t_2 D
      // 040: ldc2_w 0.001
      // 043: dsub
      // 044: aload 0
      // 045: invokevirtual i2h.aaw ()Lnh4;
      // 048: getfield nh4.i2c D
      // 04b: ldc2_w 0.001
      // 04e: dsub
      // 04f: aload 0
      // 050: invokevirtual i2h.aaw ()Lnh4;
      // 053: getfield nh4.oqj D
      // 056: ldc2_w 0.001
      // 059: dsub
      // 05a: invokespecial mew.<init> (DDD)V
      // 05d: astore 5
      // 05f: istore 3
      // 060: aload 0
      // 061: getfield i2h.oay Lt9d;
      // 064: aload 4
      // 066: aload 5
      // 068: invokevirtual t9d.o2i (Lmew;Lmew;)Z
      // 06b: iload 3
      // 06c: ifeq 085
      // 06f: ifeq 13f
      // 072: goto 079
      // 075: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: aload 4
      // 07b: invokevirtual mew.getX ()I
      // 07e: goto 085
      // 081: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: istore 6
      // 087: iload 6
      // 089: aload 5
      // 08b: invokevirtual mew.getX ()I
      // 08e: if_icmpgt 13f
      // 091: aload 4
      // 093: invokevirtual mew.getY ()I
      // 096: istore 7
      // 098: iload 7
      // 09a: aload 5
      // 09c: invokevirtual mew.getY ()I
      // 09f: if_icmpgt 138
      // 0a2: aload 4
      // 0a4: invokevirtual mew.getZ ()I
      // 0a7: iload 3
      // 0a8: ifeq 089
      // 0ab: istore 8
      // 0ad: iload 8
      // 0af: aload 5
      // 0b1: invokevirtual mew.getZ ()I
      // 0b4: if_icmpgt 131
      // 0b7: new mew
      // 0ba: dup
      // 0bb: iload 6
      // 0bd: iload 7
      // 0bf: iload 8
      // 0c1: invokespecial mew.<init> (III)V
      // 0c4: astore 9
      // 0c6: aload 0
      // 0c7: getfield i2h.oay Lt9d;
      // 0ca: aload 9
      // 0cc: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0cf: astore 10
      // 0d1: aload 10
      // 0d3: invokeinterface zfz.r_y ()Le0x; 1
      // 0d8: aload 0
      // 0d9: getfield i2h.oay Lt9d;
      // 0dc: aload 9
      // 0de: aload 10
      // 0e0: aload 0
      // 0e1: invokevirtual e0x.n9e (Lt9d;Lmew;Lzfz;Li2h;)V
      // 0e4: iload 3
      // 0e5: ifeq 134
      // 0e8: goto 12a
      // 0eb: astore 11
      // 0ed: aload 11
      // 0ef: sipush 3561
      // 0f2: ldc2_w 8647792524502353346
      // 0f5: lload 1
      // 0f6: lxor
      // 0f7: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: nop
      // 0fd: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 100: astore 12
      // 102: aload 12
      // 104: sipush 28360
      // 107: ldc2_w 285817547388462757
      // 10a: lload 1
      // 10b: lxor
      // 10c: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: nop
      // 112: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 115: astore 13
      // 117: aload 13
      // 119: aload 9
      // 11b: aload 10
      // 11d: invokestatic wsc.uxq (Lwsc;Lmew;Lzfz;)V
      // 120: new oov
      // 123: dup
      // 124: aload 12
      // 126: invokespecial oov.<init> (Le1i;)V
      // 129: athrow
      // 12a: iinc 8 1
      // 12d: iload 3
      // 12e: ifne 0ad
      // 131: iinc 7 1
      // 134: iload 3
      // 135: ifne 098
      // 138: iinc 6 1
      // 13b: iload 3
      // 13c: ifne 087
      // 13f: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void cmh(mew var1, e0x var2) {
      int var3 = t9d.b();
      e0x$zvv var4 = var2.zu6;

      e0x var10000;
      label52: {
         label47: {
            try {
               var10000 = this.oay.getBlockState(var1.nuv()).r_y();
               if (var3 == 0) {
                  break label52;
               }

               if (var10000 != ox_.dxo) {
                  break label47;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var4 = ox_.dxo.zu6;

            try {
               this.lhu(var4.i3r(), var4.dnt() * 0.15F, var4.kjj());
               if (var3 != 0) {
                  return;
               }
            } catch (oov var7) {
               boolean var10001 = false;
               throw a(var7);
            }
         }

         try {
            var10000 = var2;
         } catch (oov var6) {
            boolean var10 = false;
            throw a(var6);
         }
      }

      try {
         if (!var10000.p1r().l7j()) {
            this.lhu(var4.i3r(), var4.dnt() * 0.15F, var4.kjj());
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   public void lhu(String param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifeq 20
      // 0b: invokevirtual i2h.o3x ()Z
      // 0e: ifne 2a
      // 11: goto 18
      // 14: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getfield i2h.oay Lt9d;
      // 23: aload 0
      // 24: aload 1
      // 25: fload 2
      // 26: fload 3
      // 27: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 2a: return
   }

   public boolean o3x() {
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
      // 05: getfield i2h.oit Lwl1;
      // 08: bipush 4
      // 09: invokevirtual wl1.miz (I)B
      // 0c: iload 1
      // 0d: ifeq 23
      // 10: bipush 1
      // 11: if_icmpne 26
      // 14: goto 1b
      // 17: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: goto 23
      // 1f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: goto 27
      // 26: bipush 0
      // 27: ireturn
   }

   public void i11(boolean var1) {
      int var2 = t9d.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.oit;
               var10001 = 4;
               var10002 = var1;
               if (var2 == 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
   }

   public boolean _p9() {
      return true;
   }

   public void ihp(double param1, boolean param3, e0x param4, mew param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: iload 3
      // 06: iload 6
      // 08: ifne 76
      // 0b: ifeq 6c
      // 0e: goto 15
      // 11: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: getfield i2h.o_8 F
      // 19: fconst_0
      // 1a: fcmpl
      // 1b: ifle 8c
      // 1e: goto 25
      // 21: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 4
      // 27: iload 6
      // 29: ifne 3f
      // 2c: goto 33
      // 2f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: ifnull 52
      // 36: goto 3d
      // 39: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 4
      // 3f: aload 0
      // 40: getfield i2h.oay Lt9d;
      // 43: aload 5
      // 45: aload 0
      // 46: aload 0
      // 47: getfield i2h.o_8 F
      // 4a: invokevirtual e0x.b2c (Lt9d;Lmew;Li2h;F)V
      // 4d: iload 6
      // 4f: ifeq 62
      // 52: aload 0
      // 53: aload 0
      // 54: getfield i2h.o_8 F
      // 57: fconst_1
      // 58: invokevirtual i2h.ibc (FF)V
      // 5b: goto 62
      // 5e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 0
      // 63: fconst_0
      // 64: putfield i2h.o_8 F
      // 67: iload 6
      // 69: ifeq 8c
      // 6c: dload 1
      // 6d: dconst_0
      // 6e: dcmpg
      // 6f: goto 76
      // 72: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: ifge 8c
      // 79: aload 0
      // 7a: aload 0
      // 7b: getfield i2h.o_8 F
      // 7e: f2d
      // 7f: dload 1
      // 80: dsub
      // 81: d2f
      // 82: putfield i2h.o_8 F
      // 85: goto 8c
      // 88: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: return
   }

   public nh4 q3r() {
      return null;
   }

   public void esk(int param1) {
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
      // 05: getfield i2h.cuj Z
      // 08: iload 2
      // 09: ifne 26
      // 0c: ifne 27
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic ofh.pho Lofh;
      // 1a: iload 1
      // 1b: i2f
      // 1c: invokevirtual i2h.m1t (Lofh;F)Z
      // 1f: goto 26
      // 22: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: pop
      // 27: return
   }

   public final boolean xgj() {
      return this.cuj;
   }

   public void ibc(float param1, float param2) {
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
      // 05: getfield i2h.wgv Li2h;
      // 08: iload 3
      // 09: ifeq 21
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield i2h.wgv Li2h;
      // 1a: goto 21
      // 1d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: fload 1
      // 22: fload 2
      // 23: invokevirtual i2h.ibc (FF)V
      // 26: return
   }

   public boolean n08() {
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
      // 05: getfield i2h.x7a Z
      // 08: iload 1
      // 09: ifeq 7b
      // 0c: ifne 7a
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield i2h.oay Lt9d;
      // 1a: new mew
      // 1d: dup
      // 1e: aload 0
      // 1f: getfield i2h.o2v D
      // 22: aload 0
      // 23: getfield i2h.kfp D
      // 26: aload 0
      // 27: getfield i2h.vbd D
      // 2a: invokespecial mew.<init> (DDD)V
      // 2d: invokevirtual t9d.eyz (Lmew;)Z
      // 30: iload 1
      // 31: ifeq 7b
      // 34: goto 3b
      // 37: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: ifne 7a
      // 3e: goto 45
      // 41: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 0
      // 46: getfield i2h.oay Lt9d;
      // 49: new mew
      // 4c: dup
      // 4d: aload 0
      // 4e: getfield i2h.o2v D
      // 51: aload 0
      // 52: getfield i2h.kfp D
      // 55: aload 0
      // 56: getfield i2h.ikl F
      // 59: f2d
      // 5a: dadd
      // 5b: aload 0
      // 5c: getfield i2h.vbd D
      // 5f: invokespecial mew.<init> (DDD)V
      // 62: invokevirtual t9d.eyz (Lmew;)Z
      // 65: iload 1
      // 66: ifeq 7b
      // 69: goto 70
      // 6c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: ifeq 7e
      // 73: goto 7a
      // 76: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: bipush 1
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
   }

   public boolean mwv() {
      return this.x7a;
   }

   public boolean r24() {
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
      // 06: ifne 8d
      // 09: getfield i2h.oay Lt9d;
      // 0c: aload 0
      // 0d: invokevirtual i2h.aaw ()Lnh4;
      // 10: dconst_0
      // 11: ldc2_w -0.4000000059604645
      // 14: dconst_0
      // 15: invokevirtual nh4.c2h (DDD)Lnh4;
      // 18: ldc2_w 0.001
      // 1b: ldc2_w 0.001
      // 1e: ldc2_w 0.001
      // 21: invokevirtual nh4.va6 (DDD)Lnh4;
      // 24: getstatic p3y.six Lp3y;
      // 27: aload 0
      // 28: invokevirtual t9d.jqj (Lnh4;Lp3y;Li2h;)Z
      // 2b: ifeq 85
      // 2e: goto 35
      // 31: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 0
      // 36: iload 1
      // 37: ifne 7d
      // 3a: goto 41
      // 3d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: getfield i2h.x7a Z
      // 44: ifne 72
      // 47: goto 4e
      // 4a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 0
      // 4f: iload 1
      // 50: ifne 7d
      // 53: goto 5a
      // 56: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: getfield i2h.jwh Z
      // 5d: ifne 72
      // 60: goto 67
      // 63: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 0
      // 68: invokevirtual i2h.qw8 ()V
      // 6b: goto 72
      // 6e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: fconst_0
      // 74: putfield i2h.o_8 F
      // 77: aload 0
      // 78: bipush 1
      // 79: putfield i2h.x7a Z
      // 7c: aload 0
      // 7d: bipush 0
      // 7e: putfield i2h.bry I
      // 81: iload 1
      // 82: ifeq 91
      // 85: aload 0
      // 86: goto 8d
      // 89: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: bipush 0
      // 8e: putfield i2h.x7a Z
      // 91: aload 0
      // 92: getfield i2h.x7a Z
      // 95: ireturn
   }

   public void qw8() {
      int var1 = t9d.b();
      float var2 = fe6.dii(this.icv * this.icv * 0.2F + this.mop * this.mop + this.bw4 * this.bw4 * 0.2F) * 0.2F;

      int var10000;
      label49: {
         label48: {
            try {
               float var11;
               var10000 = (var11 = var2 - 1.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
               if (var1 == 0) {
                  break label49;
               }

               if (var10000 <= 0) {
                  break label48;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var2 = 1.0F;
         }

         this.lhu(this.hux(), var2, 1.0F + (this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.4F);
         var10000 = fe6.jqf(this.aaw().bx_);
      }

      float var3 = (float)var10000;
      int var4 = 0;

      while (true) {
         if ((float)var4 < 1.0F + this.uo6 * 20.0F) {
            float var5 = (this.z2d.nextFloat() * 2.0F - 1.0F) * this.uo6;
            float var6 = (this.z2d.nextFloat() * 2.0F - 1.0F) * this.uo6;

            try {
               this.oay
                  .zvy(
                     w_0.w_h,
                     this.o2v + (double)var5,
                     (double)(var3 + 1.0F),
                     this.vbd + (double)var6,
                     this.icv,
                     this.mop - (double)(this.z2d.nextFloat() * 0.2F),
                     this.bw4,
                     new int[0]
                  );
               var4++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         var4 = 0;
         break;
      }

      while ((float)var4 < 1.0F + this.uo6 * 20.0F) {
         float var9 = (this.z2d.nextFloat() * 2.0F - 1.0F) * this.uo6;
         float var10 = (this.z2d.nextFloat() * 2.0F - 1.0F) * this.uo6;
         this.oay.zvy(w_0.eiu, this.o2v + (double)var9, (double)(var3 + 1.0F), this.vbd + (double)var10, this.icv, this.mop, this.bw4, new int[0]);
         var4++;
         if (var1 == 0) {
            break;
         }
      }
   }

   public void i6m() {
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
      // 05: invokevirtual i2h.ew1 ()Z
      // 08: iload 1
      // 09: ifne 2c
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 30
      // 1b: goto 22
      // 1e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual i2h.mwv ()Z
      // 25: goto 2c
      // 28: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: ifne 33
      // 2f: aload 0
      // 30: invokevirtual i2h.ghx ()V
      // 33: return
   }

   public void ghx() {
      int var1 = fe6.jqf(this.o2v);
      int var2 = fe6.jqf(this.kfp - 0.2F);
      int var3 = fe6.jqf(this.vbd);
      mew var4 = new mew(var1, var2, var3);
      zfz var5 = this.oay.getBlockState(var4);
      e0x var6 = var5.r_y();

      try {
         if (var6.kfj() != -1) {
            this.oay
               .zvy(
                  w_0.uuz,
                  this.o2v + ((double)this.z2d.nextFloat() - 0.5) * (double)this.uo6,
                  this.aaw().bx_ + 0.1,
                  this.vbd + ((double)this.z2d.nextFloat() - 0.5) * (double)this.uo6,
                  -this.icv * 4.0,
                  1.5,
                  -this.bw4 * 4.0,
                  new int[]{e0x.r2y(var5)}
               );
         }
      } catch (oov var7) {
         throw a(var7);
      }
   }

   public String hux() {
      long var1 = f ^ 108717822547547L;
      return a<"p">(18459, 7568362834719401504L ^ var1);
   }

   public boolean v0c(p3y param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield i2h.kfp D
      // 04: aload 0
      // 05: invokevirtual i2h.c5y ()F
      // 08: f2d
      // 09: dadd
      // 0a: dstore 3
      // 0b: invokestatic t9d.b ()I
      // 0e: new mew
      // 11: dup
      // 12: aload 0
      // 13: getfield i2h.o2v D
      // 16: dload 3
      // 17: aload 0
      // 18: getfield i2h.vbd D
      // 1b: invokespecial mew.<init> (DDD)V
      // 1e: astore 5
      // 20: aload 0
      // 21: getfield i2h.oay Lt9d;
      // 24: aload 5
      // 26: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 29: astore 6
      // 2b: aload 6
      // 2d: invokeinterface zfz.r_y ()Le0x; 1
      // 32: astore 7
      // 34: istore 2
      // 35: aload 7
      // 37: iload 2
      // 38: ifeq 57
      // 3b: invokevirtual e0x.p1r ()Lp3y;
      // 3e: aload 1
      // 3f: if_acmpne bc
      // 42: goto 49
      // 45: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 6
      // 4b: invokeinterface zfz.r_y ()Le0x; 1
      // 50: goto 57
      // 53: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: aload 6
      // 59: invokevirtual e0x.hvp (Lzfz;)I
      // 5c: invokestatic hmv.jou (I)F
      // 5f: ldc 0.11111111
      // 61: nop
      // 62: fsub
      // 63: fstore 8
      // 65: aload 5
      // 67: invokevirtual mew.getY ()I
      // 6a: bipush 1
      // 6b: iadd
      // 6c: i2f
      // 6d: fload 8
      // 6f: fsub
      // 70: fstore 9
      // 72: dload 3
      // 73: fload 9
      // 75: f2d
      // 76: dcmpg
      // 77: iload 2
      // 78: ifeq 86
      // 7b: ifge 89
      // 7e: goto 85
      // 81: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: bipush 0
      // 8a: istore 10
      // 8c: iload 10
      // 8e: iload 2
      // 8f: ifeq a7
      // 92: ifne b9
      // 95: goto 9c
      // 98: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: aload 0
      // 9d: instanceof ha9
      // a0: goto a7
      // a3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: iload 2
      // a8: ifeq b6
      // ab: ifeq b9
      // ae: goto b5
      // b1: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b4: athrow
      // b5: bipush 0
      // b6: goto bb
      // b9: iload 10
      // bb: ireturn
      // bc: bipush 0
      // bd: ireturn
   }

   public boolean ept(p3y param1) {
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
      // 05: iload 2
      // 06: ifeq 1e
      // 09: aload 1
      // 0a: invokevirtual i2h.v0c (Lp3y;)Z
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield i2h.kfp D
      // 21: dstore 3
      // 22: new mew
      // 25: dup
      // 26: aload 0
      // 27: getfield i2h.o2v D
      // 2a: dload 3
      // 2b: aload 0
      // 2c: getfield i2h.vbd D
      // 2f: invokespecial mew.<init> (DDD)V
      // 32: astore 5
      // 34: aload 0
      // 35: getfield i2h.oay Lt9d;
      // 38: aload 5
      // 3a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3d: astore 6
      // 3f: aload 6
      // 41: invokeinterface zfz.r_y ()Le0x; 1
      // 46: astore 7
      // 48: aload 7
      // 4a: iload 2
      // 4b: ifeq 6a
      // 4e: invokevirtual e0x.p1r ()Lp3y;
      // 51: aload 1
      // 52: if_acmpne cf
      // 55: goto 5c
      // 58: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 6
      // 5e: invokeinterface zfz.r_y ()Le0x; 1
      // 63: goto 6a
      // 66: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 6
      // 6c: invokevirtual e0x.hvp (Lzfz;)I
      // 6f: invokestatic hmv.jou (I)F
      // 72: ldc 0.11111111
      // 74: nop
      // 75: fsub
      // 76: fstore 8
      // 78: aload 5
      // 7a: invokevirtual mew.getY ()I
      // 7d: bipush 1
      // 7e: iadd
      // 7f: i2f
      // 80: fload 8
      // 82: fsub
      // 83: fstore 9
      // 85: dload 3
      // 86: fload 9
      // 88: f2d
      // 89: dcmpg
      // 8a: iload 2
      // 8b: ifeq 99
      // 8e: ifge 9c
      // 91: goto 98
      // 94: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 97: athrow
      // 98: bipush 1
      // 99: goto 9d
      // 9c: bipush 0
      // 9d: istore 10
      // 9f: iload 10
      // a1: iload 2
      // a2: ifeq ba
      // a5: ifne cc
      // a8: goto af
      // ab: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: aload 0
      // b0: instanceof ha9
      // b3: goto ba
      // b6: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b9: athrow
      // ba: iload 2
      // bb: ifeq c9
      // be: ifeq cc
      // c1: goto c8
      // c4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7: athrow
      // c8: bipush 0
      // c9: goto ce
      // cc: iload 10
      // ce: ireturn
      // cf: bipush 0
      // d0: ireturn
   }

   public boolean b2u() {
      return this.oay._qv(this.aaw().c2h(-0.1F, -0.4F, -0.1F), p3y.e1s);
   }

   public void r4r(float var1, float var2, float var3) {
      int var4 = t9d.b();
      float var5 = var1 * var1 + var2 * var2;

      float var11;
      float var10001;
      label41: {
         label42: {
            try {
               float var12;
               var10000 = (var12 = var5 - 1.0E-4F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
               if (var4 == 0) {
                  break label42;
               }

               if (var10000 < 0) {
                  return;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var5 = fe6.bug(var5);

            try {
               var11 = var5;
               var10001 = 1.0F;
               if (var4 == 0) {
                  break label41;
               }

               float var13;
               var10000 = (var13 = var5 - 1.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            } catch (oov var8) {
               throw a(var8);
            }
         }

         if (var10000 < 0) {
            var5 = 1.0F;
         }

         var5 = var3 / var5;
         var1 *= var5;
         var2 *= var5;
         var11 = this.x5k * (float) Math.PI;
         var10001 = 180.0F;
      }

      float var6 = fe6.rtn(var11 / var10001);
      float var7 = fe6.ssk(this.x5k * (float) Math.PI / 180.0F);
      this.icv += (double)(var1 * var7 - var2 * var6);
      this.bw4 += (double)(var2 * var7 + var1 * var6);
   }

   public int azk(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: new mew
      // 07: dup
      // 08: aload 0
      // 09: getfield i2h.o2v D
      // 0c: aload 0
      // 0d: getfield i2h.kfp D
      // 10: aload 0
      // 11: invokevirtual i2h.c5y ()F
      // 14: f2d
      // 15: dadd
      // 16: aload 0
      // 17: getfield i2h.vbd D
      // 1a: invokespecial mew.<init> (DDD)V
      // 1d: astore 3
      // 1e: aload 0
      // 1f: getfield i2h.oay Lt9d;
      // 22: aload 3
      // 23: invokevirtual t9d.xjm (Lmew;)Z
      // 26: iload 2
      // 27: ifeq 44
      // 2a: ifeq 47
      // 2d: goto 34
      // 30: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: getfield i2h.oay Lt9d;
      // 38: aload 3
      // 39: bipush 0
      // 3a: invokevirtual t9d.getCombinedLight (Lmew;I)I
      // 3d: goto 44
      // 40: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
   }

   public float xeu(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: new mew
      // 07: dup
      // 08: aload 0
      // 09: getfield i2h.o2v D
      // 0c: aload 0
      // 0d: getfield i2h.kfp D
      // 10: aload 0
      // 11: invokevirtual i2h.c5y ()F
      // 14: f2d
      // 15: dadd
      // 16: aload 0
      // 17: getfield i2h.vbd D
      // 1a: invokespecial mew.<init> (DDD)V
      // 1d: astore 3
      // 1e: aload 0
      // 1f: getfield i2h.oay Lt9d;
      // 22: aload 3
      // 23: iload 2
      // 24: ifne 40
      // 27: invokevirtual t9d.xjm (Lmew;)Z
      // 2a: ifeq 46
      // 2d: goto 34
      // 30: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: getfield i2h.oay Lt9d;
      // 38: aload 3
      // 39: goto 40
      // 3c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: invokevirtual t9d.rgh (Lmew;)F
      // 43: goto 47
      // 46: fconst_0
      // 47: freturn
   }

   public void gj3(t9d var1) {
      this.oay = var1;
   }

   public void xe8(double param1, double param3, double param5, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 0
      // 02: dload 1
      // 03: dup2_x1
      // 04: putfield i2h.o2v D
      // 07: putfield i2h.bc1 D
      // 0a: aload 0
      // 0b: aload 0
      // 0c: dload 3
      // 0d: dup2_x1
      // 0e: putfield i2h.kfp D
      // 11: putfield i2h.o_z D
      // 14: invokestatic t9d.b ()I
      // 17: aload 0
      // 18: aload 0
      // 19: dload 5
      // 1b: dup2_x1
      // 1c: putfield i2h.vbd D
      // 1f: putfield i2h.a4d D
      // 22: aload 0
      // 23: aload 0
      // 24: fload 7
      // 26: dup_x1
      // 27: putfield i2h.x5k F
      // 2a: putfield i2h.p3h F
      // 2d: aload 0
      // 2e: aload 0
      // 2f: fload 8
      // 31: dup_x1
      // 32: putfield i2h.y2i F
      // 35: putfield i2h.j25 F
      // 38: aload 0
      // 39: getfield i2h.p3h F
      // 3c: fload 7
      // 3e: fsub
      // 3f: f2d
      // 40: dstore 10
      // 42: istore 9
      // 44: dload 10
      // 46: ldc2_w -180.0
      // 49: dcmpg
      // 4a: iload 9
      // 4c: ifeq 72
      // 4f: ifge 6c
      // 52: goto 59
      // 55: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 0
      // 5a: dup
      // 5b: getfield i2h.p3h F
      // 5e: ldc 360.0
      // 60: nop
      // 61: fadd
      // 62: putfield i2h.p3h F
      // 65: goto 6c
      // 68: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: dload 10
      // 6e: ldc2_w 180.0
      // 71: dcmpl
      // 72: iflt 88
      // 75: aload 0
      // 76: dup
      // 77: getfield i2h.p3h F
      // 7a: ldc 360.0
      // 7c: nop
      // 7d: fsub
      // 7e: putfield i2h.p3h F
      // 81: goto 88
      // 84: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: aload 0
      // 89: aload 0
      // 8a: getfield i2h.o2v D
      // 8d: aload 0
      // 8e: getfield i2h.kfp D
      // 91: aload 0
      // 92: getfield i2h.vbd D
      // 95: invokevirtual i2h.m6_ (DDD)V
      // 98: aload 0
      // 99: fload 7
      // 9b: fload 8
      // 9d: invokevirtual i2h.iym (FF)V
      // a0: return
   }

   public void kva(mew var1, float var2, float var3) {
      this.x24((double)var1.getX() + 0.5, (double)var1.getY(), (double)var1.getZ() + 0.5, var2, var3);
   }

   public void x24(double var1, double var3, double var5, float var7, float var8) {
      this.ivp = this.bc1 = this.o2v = var1;
      this.c54 = this.o_z = this.kfp = var3;
      this.e2b = this.a4d = this.vbd = var5;
      this.x5k = var7;
      this.y2i = var8;
      this.m6_(this.o2v, this.kfp, this.vbd);
   }

   public float tm6(i2h var1) {
      float var2 = (float)(this.o2v - var1.o2v);
      float var3 = (float)(this.kfp - var1.kfp);
      float var4 = (float)(this.vbd - var1.vbd);
      return fe6.bug(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double p53(double var1, double var3, double var5) {
      double var7 = this.o2v - var1;
      double var9 = this.kfp - var3;
      double var11 = this.vbd - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double csm(mew var1) {
      return var1.p4e(this.o2v, this.kfp, this.vbd);
   }

   public double x4g(mew var1) {
      return var1.yib(this.o2v, this.kfp, this.vbd);
   }

   public double qww(double var1, double var3, double var5) {
      double var7 = this.o2v - var1;
      double var9 = this.kfp - var3;
      double var11 = this.vbd - var5;
      return (double)fe6.dii(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double wxg(i2h var1) {
      double var2 = this.o2v - var1.o2v;
      double var4 = this.kfp - var1.kfp;
      double var6 = this.vbd - var1.vbd;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void bzm(ha9 var1) {
   }

   public void u_w(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield i2h.wgv Li2h;
      // 008: aload 0
      // 009: iload 2
      // 00a: ifeq 02e
      // 00d: if_acmpeq 129
      // 010: goto 017
      // 013: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 1
      // 018: getfield i2h.hzp Li2h;
      // 01b: iload 2
      // 01c: ifeq 032
      // 01f: goto 026
      // 022: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 0
      // 027: goto 02e
      // 02a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: if_acmpeq 129
      // 031: aload 1
      // 032: getfield i2h.kvx Z
      // 035: iload 2
      // 036: ifeq 059
      // 039: ifne 129
      // 03c: goto 043
      // 03f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 0
      // 044: iload 2
      // 045: ifeq 05d
      // 048: goto 04f
      // 04b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: getfield i2h.kvx Z
      // 052: goto 059
      // 055: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: ifne 129
      // 05c: aload 1
      // 05d: getfield i2h.o2v D
      // 060: aload 0
      // 061: getfield i2h.o2v D
      // 064: dsub
      // 065: dstore 3
      // 066: aload 1
      // 067: getfield i2h.vbd D
      // 06a: aload 0
      // 06b: getfield i2h.vbd D
      // 06e: dsub
      // 06f: dstore 5
      // 071: dload 3
      // 072: dload 5
      // 074: invokestatic fe6.g8w (DD)D
      // 077: dstore 7
      // 079: dload 7
      // 07b: ldc2_w 0.009999999776482582
      // 07e: iload 2
      // 07f: ifeq 0a4
      // 082: dcmpl
      // 083: iflt 129
      // 086: goto 08d
      // 089: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: dload 7
      // 08f: invokestatic fe6.dii (D)F
      // 092: f2d
      // 093: dstore 7
      // 095: dload 3
      // 096: dload 7
      // 098: ddiv
      // 099: dstore 3
      // 09a: dload 5
      // 09c: dload 7
      // 09e: ddiv
      // 09f: dstore 5
      // 0a1: dconst_1
      // 0a2: dload 7
      // 0a4: ddiv
      // 0a5: dstore 9
      // 0a7: dload 9
      // 0a9: dconst_1
      // 0aa: iload 2
      // 0ab: ifeq 0e9
      // 0ae: dcmpl
      // 0af: ifle 0bc
      // 0b2: goto 0b9
      // 0b5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: dconst_1
      // 0ba: dstore 9
      // 0bc: dload 3
      // 0bd: dload 9
      // 0bf: dmul
      // 0c0: dstore 3
      // 0c1: dload 5
      // 0c3: dload 9
      // 0c5: dmul
      // 0c6: dstore 5
      // 0c8: dload 3
      // 0c9: ldc2_w 0.05000000074505806
      // 0cc: dmul
      // 0cd: dstore 3
      // 0ce: dload 5
      // 0d0: ldc2_w 0.05000000074505806
      // 0d3: dmul
      // 0d4: dstore 5
      // 0d6: dload 3
      // 0d7: fconst_1
      // 0d8: aload 0
      // 0d9: getfield i2h.u5z F
      // 0dc: fsub
      // 0dd: f2d
      // 0de: dmul
      // 0df: dstore 3
      // 0e0: dload 5
      // 0e2: fconst_1
      // 0e3: aload 0
      // 0e4: getfield i2h.u5z F
      // 0e7: fsub
      // 0e8: f2d
      // 0e9: dmul
      // 0ea: dstore 5
      // 0ec: aload 0
      // 0ed: getfield i2h.wgv Li2h;
      // 0f0: iload 2
      // 0f1: ifeq 113
      // 0f4: ifnonnull 10f
      // 0f7: goto 0fe
      // 0fa: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: dload 3
      // 100: dneg
      // 101: dconst_0
      // 102: dload 5
      // 104: dneg
      // 105: invokevirtual i2h.w7w (DDD)V
      // 108: goto 10f
      // 10b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: aload 1
      // 110: getfield i2h.wgv Li2h;
      // 113: iload 2
      // 114: ifeq 122
      // 117: ifnonnull 129
      // 11a: goto 121
      // 11d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 1
      // 122: dload 3
      // 123: dconst_0
      // 124: dload 5
      // 126: invokevirtual i2h.w7w (DDD)V
      // 129: return
   }

   public void w7w(double var1, double var3, double var5) {
      this.icv += var1;
      this.mop += var3;
      this.bw4 += var5;
      this.u19 = true;
   }

   public void dxm() {
      this.t8d = true;
   }

   public boolean m1t(ofh param1, float param2) {
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
      // 06: invokevirtual i2h.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifne 22
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual i2h.dxm ()V
      // 21: bipush 0
      // 22: ireturn
   }

   public fqr wej(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: fload 1
      // 05: fconst_1
      // 06: iload 2
      // 07: ifeq 35
      // 0a: fcmpl
      // 0b: ifne 26
      // 0e: goto 15
      // 11: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: aload 0
      // 17: getfield i2h.y2i F
      // 1a: aload 0
      // 1b: getfield i2h.x5k F
      // 1e: invokevirtual i2h.kpk (FF)Lfqr;
      // 21: areturn
      // 22: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: getfield i2h.j25 F
      // 2a: aload 0
      // 2b: getfield i2h.y2i F
      // 2e: aload 0
      // 2f: getfield i2h.j25 F
      // 32: fsub
      // 33: fload 1
      // 34: fmul
      // 35: fadd
      // 36: fstore 3
      // 37: aload 0
      // 38: getfield i2h.p3h F
      // 3b: aload 0
      // 3c: getfield i2h.x5k F
      // 3f: aload 0
      // 40: getfield i2h.p3h F
      // 43: fsub
      // 44: fload 1
      // 45: fmul
      // 46: fadd
      // 47: fstore 4
      // 49: aload 0
      // 4a: fload 3
      // 4b: fload 4
      // 4d: invokevirtual i2h.kpk (FF)Lfqr;
      // 50: areturn
   }

   public final fqr kpk(float var1, float var2) {
      float var3 = fe6.ssk(-var2 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var4 = fe6.rtn(-var2 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var5 = -fe6.ssk(-var1 * (float) (Math.PI / 180.0));
      float var6 = fe6.rtn(-var1 * (float) (Math.PI / 180.0));
      return new fqr((double)(var4 * var5), (double)var6, (double)(var3 * var5));
   }

   public fqr tib(float var1) {
      try {
         if (var1 == 1.0F) {
            return new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd);
         }
      } catch (oov var8) {
         throw a(var8);
      }

      double var2 = this.bc1 + (this.o2v - this.bc1) * (double)var1;
      double var4 = this.o_z + (this.kfp - this.o_z) * (double)var1 + (double)this.c5y();
      double var6 = this.a4d + (this.vbd - this.a4d) * (double)var1;
      return new fqr(var2, var4, var6);
   }

   public akm mcz(double var1, float var3) {
      fqr var4 = this.tib(var3);
      fqr var5 = this.wej(var3);
      fqr var6 = var4.r2x(var5.lvi * var1, var5.gn5 * var1, var5.bn2 * var1);
      return this.oay.xjc(var4, var6, false, false, true);
   }

   public boolean mzu() {
      return false;
   }

   public boolean tfh() {
      return false;
   }

   public void lfi(i2h var1, int var2) {
   }

   public boolean e4f(double var1, double var3, double var5) {
      double var7 = this.o2v - var1;
      double var9 = this.kfp - var3;
      double var11 = this.vbd - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.xvv(var13);
   }

   public boolean xvv(double var1) {
      int var3 = t9d.b();
      double var4 = this.aaw().liq();

      int var10000;
      label38: {
         label37: {
            try {
               var10000 = Double.isNaN(var4);
               if (var3 == 0) {
                  break label38;
               }

               if (var10000 == 0) {
                  break label37;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var4 = 1.0;
         }

         var4 = var4 * 64.0 * this.y33;
         double var9;
         var10000 = (var9 = var1 - var4 * var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      try {
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return (boolean)0;
   }

   public boolean tt6(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i2h.f J
      // 03: ldc2_w 86102216345992
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual i2h.xbu ()Ljava/lang/String;
      // 11: astore 5
      // 13: aload 0
      // 14: getfield i2h.ma9 Z
      // 17: iload 4
      // 19: ifne 52
      // 1c: ifne 51
      // 1f: goto 26
      // 22: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 5
      // 28: ifnull 51
      // 2b: goto 32
      // 2e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 1
      // 33: sipush 10198
      // 36: ldc2_w 7736129591976662580
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: aload 5
      // 43: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 46: aload 0
      // 47: aload 1
      // 48: invokevirtual i2h.c97 (Lbdo;)V
      // 4b: bipush 1
      // 4c: ireturn
      // 4d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: bipush 0
      // 52: ireturn
   }

   public boolean qqt(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i2h.f J
      // 03: ldc2_w 63491800541850
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual i2h.xbu ()Ljava/lang/String;
      // 11: astore 5
      // 13: aload 0
      // 14: getfield i2h.ma9 Z
      // 17: iload 4
      // 19: ifne 6f
      // 1c: ifne 6e
      // 1f: goto 26
      // 22: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 5
      // 28: ifnull 6e
      // 2b: goto 32
      // 2e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getfield i2h.wgv Li2h;
      // 36: iload 4
      // 38: ifne 68
      // 3b: goto 42
      // 3e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: ifnonnull 6e
      // 45: goto 4c
      // 48: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 1
      // 4d: sipush 27471
      // 50: ldc2_w 8531356735996623271
      // 53: lload 2
      // 54: lxor
      // 55: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: nop
      // 5b: aload 5
      // 5d: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 60: aload 0
      // 61: goto 68
      // 64: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 1
      // 69: invokevirtual i2h.c97 (Lbdo;)V
      // 6c: bipush 1
      // 6d: ireturn
      // 6e: bipush 0
      // 6f: ireturn
   }

   public void c97(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i2h.f J
      // 003: ldc2_w 58970784022993
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 3854
      // 011: ldc2_w 3772312704581400197
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: aload 0
      // 01d: bipush 3
      // 01e: newarray 7
      // 020: dup
      // 021: bipush 0
      // 022: aload 0
      // 023: getfield i2h.o2v D
      // 026: dastore
      // 027: dup
      // 028: bipush 1
      // 029: aload 0
      // 02a: getfield i2h.kfp D
      // 02d: dastore
      // 02e: dup
      // 02f: bipush 2
      // 030: aload 0
      // 031: getfield i2h.vbd D
      // 034: dastore
      // 035: invokevirtual i2h.r0b ([D)Lqhg;
      // 038: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 03b: aload 1
      // 03c: sipush 10909
      // 03f: ldc2_w 1877071235632681770
      // 042: lload 2
      // 043: lxor
      // 044: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: nop
      // 04a: aload 0
      // 04b: bipush 3
      // 04c: newarray 7
      // 04e: dup
      // 04f: bipush 0
      // 050: aload 0
      // 051: getfield i2h.icv D
      // 054: dastore
      // 055: dup
      // 056: bipush 1
      // 057: aload 0
      // 058: getfield i2h.mop D
      // 05b: dastore
      // 05c: dup
      // 05d: bipush 2
      // 05e: aload 0
      // 05f: getfield i2h.bw4 D
      // 062: dastore
      // 063: invokevirtual i2h.r0b ([D)Lqhg;
      // 066: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 069: aload 1
      // 06a: sipush 12951
      // 06d: ldc2_w 8243407620829760282
      // 070: lload 2
      // 071: lxor
      // 072: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: aload 0
      // 079: bipush 2
      // 07a: newarray 6
      // 07c: dup
      // 07d: bipush 0
      // 07e: aload 0
      // 07f: getfield i2h.x5k F
      // 082: fastore
      // 083: dup
      // 084: bipush 1
      // 085: aload 0
      // 086: getfield i2h.y2i F
      // 089: fastore
      // 08a: invokevirtual i2h.trb ([F)Lqhg;
      // 08d: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 090: aload 1
      // 091: sipush 31031
      // 094: ldc2_w 8661186814832246940
      // 097: lload 2
      // 098: lxor
      // 099: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: nop
      // 09f: aload 0
      // 0a0: getfield i2h.o_8 F
      // 0a3: invokevirtual bdo._i9 (Ljava/lang/String;F)V
      // 0a6: aload 1
      // 0a7: sipush 31035
      // 0aa: ldc2_w 2492793995214258395
      // 0ad: lload 2
      // 0ae: lxor
      // 0af: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: nop
      // 0b5: aload 0
      // 0b6: getfield i2h.bry I
      // 0b9: i2s
      // 0ba: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 0bd: aload 1
      // 0be: sipush 7866
      // 0c1: ldc2_w 8353386780054644530
      // 0c4: lload 2
      // 0c5: lxor
      // 0c6: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: aload 0
      // 0cd: invokevirtual i2h.n5m ()I
      // 0d0: i2s
      // 0d1: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 0d4: aload 1
      // 0d5: sipush 3728
      // 0d8: ldc2_w 1619149396265924352
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: aload 0
      // 0e4: getfield i2h.lfk Z
      // 0e7: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 0ea: aload 1
      // 0eb: sipush 10071
      // 0ee: ldc2_w 4166257215599894249
      // 0f1: lload 2
      // 0f2: lxor
      // 0f3: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: nop
      // 0f9: aload 0
      // 0fa: getfield i2h.ohd I
      // 0fd: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 100: aload 1
      // 101: sipush 2297
      // 104: ldc2_w 4062131546781544803
      // 107: lload 2
      // 108: lxor
      // 109: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: nop
      // 10f: aload 0
      // 110: getfield i2h.i7j Z
      // 113: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 116: aload 1
      // 117: sipush 32467
      // 11a: ldc2_w 3006223676464203647
      // 11d: lload 2
      // 11e: lxor
      // 11f: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: nop
      // 125: aload 0
      // 126: getfield i2h.rr6 I
      // 129: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 12c: aload 1
      // 12d: sipush 13203
      // 130: ldc2_w 4158790931330517622
      // 133: lload 2
      // 134: lxor
      // 135: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: nop
      // 13b: aload 0
      // 13c: invokevirtual i2h.b_q ()Ljava/util/UUID;
      // 13f: invokevirtual java/util/UUID.getMostSignificantBits ()J
      // 142: invokevirtual bdo.xw9 (Ljava/lang/String;J)V
      // 145: aload 1
      // 146: sipush 3542
      // 149: ldc2_w 712728046454633527
      // 14c: lload 2
      // 14d: lxor
      // 14e: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: nop
      // 154: aload 0
      // 155: invokevirtual i2h.b_q ()Ljava/util/UUID;
      // 158: invokevirtual java/util/UUID.getLeastSignificantBits ()J
      // 15b: invokevirtual bdo.xw9 (Ljava/lang/String;J)V
      // 15e: aload 0
      // 15f: iload 4
      // 161: ifne 1ca
      // 164: invokevirtual i2h.hei ()Ljava/lang/String;
      // 167: ifnull 1c1
      // 16a: goto 171
      // 16d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 0
      // 172: invokevirtual i2h.hei ()Ljava/lang/String;
      // 175: invokevirtual java/lang/String.length ()I
      // 178: iload 4
      // 17a: ifne 1d9
      // 17d: goto 184
      // 180: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: ifle 1c1
      // 187: goto 18e
      // 18a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: aload 1
      // 18f: sipush 19198
      // 192: ldc2_w 986447353849426802
      // 195: lload 2
      // 196: lxor
      // 197: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: nop
      // 19d: aload 0
      // 19e: invokevirtual i2h.hei ()Ljava/lang/String;
      // 1a1: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 1a4: aload 1
      // 1a5: sipush 12734
      // 1a8: ldc2_w 9210537171194103850
      // 1ab: lload 2
      // 1ac: lxor
      // 1ad: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: nop
      // 1b3: aload 0
      // 1b4: invokevirtual i2h.bpc ()Z
      // 1b7: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 1ba: goto 1c1
      // 1bd: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: getfield i2h.rj4 Ln_k;
      // 1c5: aload 1
      // 1c6: invokevirtual n_k.xmn (Lbdo;)V
      // 1c9: aload 0
      // 1ca: iload 4
      // 1cc: ifne 202
      // 1cf: invokevirtual i2h.o3x ()Z
      // 1d2: goto 1d9
      // 1d5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: ifeq 1f9
      // 1dc: aload 1
      // 1dd: sipush 2984
      // 1e0: ldc2_w 6179564555740312080
      // 1e3: lload 2
      // 1e4: lxor
      // 1e5: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: nop
      // 1eb: aload 0
      // 1ec: invokevirtual i2h.o3x ()Z
      // 1ef: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 1f2: goto 1f9
      // 1f5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: aload 1
      // 1fb: invokevirtual i2h.srs (Lbdo;)V
      // 1fe: aload 0
      // 1ff: getfield i2h.hzp Li2h;
      // 202: ifnull 235
      // 205: new bdo
      // 208: dup
      // 209: invokespecial bdo.<init> ()V
      // 20c: astore 5
      // 20e: aload 0
      // 20f: getfield i2h.hzp Li2h;
      // 212: aload 5
      // 214: invokevirtual i2h.tt6 (Lbdo;)Z
      // 217: ifeq 235
      // 21a: aload 1
      // 21b: sipush 15313
      // 21e: ldc2_w 6823242778488029787
      // 221: lload 2
      // 222: lxor
      // 223: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: nop
      // 229: aload 5
      // 22b: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 22e: goto 235
      // 231: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 234: athrow
      // 235: goto 274
      // 238: astore 5
      // 23a: aload 5
      // 23c: sipush 18353
      // 23f: ldc2_w 8344683554270395908
      // 242: lload 2
      // 243: lxor
      // 244: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: nop
      // 24a: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 24d: astore 6
      // 24f: aload 6
      // 251: sipush 24386
      // 254: ldc2_w 5393890293209278203
      // 257: lload 2
      // 258: lxor
      // 259: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: nop
      // 25f: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 262: astore 7
      // 264: aload 0
      // 265: aload 7
      // 267: invokevirtual i2h.gfa (Lwsc;)V
      // 26a: new oov
      // 26d: dup
      // 26e: aload 6
      // 270: invokespecial oov.<init> (Le1i;)V
      // 273: athrow
      // 274: return
   }

   public void a1f(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i2h.f J
      // 003: ldc2_w 101616231403267
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 11972
      // 011: ldc2_w 6003726316931144074
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: bipush 6
      // 01e: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 021: astore 5
      // 023: aload 1
      // 024: sipush 8741
      // 027: ldc2_w 4110286107615417690
      // 02a: lload 2
      // 02b: lxor
      // 02c: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: bipush 6
      // 034: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 037: astore 6
      // 039: aload 1
      // 03a: sipush 27925
      // 03d: ldc2_w 372488745904937583
      // 040: lload 2
      // 041: lxor
      // 042: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: nop
      // 048: bipush 5
      // 049: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 04c: astore 7
      // 04e: aload 0
      // 04f: aload 6
      // 051: bipush 0
      // 052: invokevirtual qhg.ho9 (I)D
      // 055: putfield i2h.icv D
      // 058: aload 0
      // 059: aload 6
      // 05b: bipush 1
      // 05c: invokevirtual qhg.ho9 (I)D
      // 05f: putfield i2h.mop D
      // 062: aload 0
      // 063: aload 6
      // 065: bipush 2
      // 066: invokevirtual qhg.ho9 (I)D
      // 069: putfield i2h.bw4 D
      // 06c: aload 0
      // 06d: getfield i2h.icv D
      // 070: invokestatic java/lang/Math.abs (D)D
      // 073: ldc2_w 10.0
      // 076: dcmpl
      // 077: iload 4
      // 079: ifne 09d
      // 07c: ifle 092
      // 07f: goto 086
      // 082: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 0
      // 087: dconst_0
      // 088: putfield i2h.icv D
      // 08b: goto 092
      // 08e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: aload 0
      // 093: getfield i2h.mop D
      // 096: invokestatic java/lang/Math.abs (D)D
      // 099: ldc2_w 10.0
      // 09c: dcmpl
      // 09d: iload 4
      // 09f: ifne 0c3
      // 0a2: ifle 0b8
      // 0a5: goto 0ac
      // 0a8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: dconst_0
      // 0ae: putfield i2h.mop D
      // 0b1: goto 0b8
      // 0b4: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: getfield i2h.bw4 D
      // 0bc: invokestatic java/lang/Math.abs (D)D
      // 0bf: ldc2_w 10.0
      // 0c2: dcmpl
      // 0c3: iload 4
      // 0c5: ifne 1f5
      // 0c8: ifle 0de
      // 0cb: goto 0d2
      // 0ce: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: dconst_0
      // 0d4: putfield i2h.bw4 D
      // 0d7: goto 0de
      // 0da: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: aload 0
      // 0e0: aload 0
      // 0e1: aload 5
      // 0e3: bipush 0
      // 0e4: invokevirtual qhg.ho9 (I)D
      // 0e7: dup2_x1
      // 0e8: putfield i2h.o2v D
      // 0eb: dup2_x1
      // 0ec: putfield i2h.ivp D
      // 0ef: putfield i2h.bc1 D
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: aload 0
      // 0f5: aload 5
      // 0f7: bipush 1
      // 0f8: invokevirtual qhg.ho9 (I)D
      // 0fb: dup2_x1
      // 0fc: putfield i2h.kfp D
      // 0ff: dup2_x1
      // 100: putfield i2h.c54 D
      // 103: putfield i2h.o_z D
      // 106: aload 0
      // 107: aload 0
      // 108: aload 0
      // 109: aload 5
      // 10b: bipush 2
      // 10c: invokevirtual qhg.ho9 (I)D
      // 10f: dup2_x1
      // 110: putfield i2h.vbd D
      // 113: dup2_x1
      // 114: putfield i2h.e2b D
      // 117: putfield i2h.a4d D
      // 11a: aload 0
      // 11b: aload 0
      // 11c: aload 7
      // 11e: bipush 0
      // 11f: invokevirtual qhg.ofd (I)F
      // 122: dup_x1
      // 123: putfield i2h.x5k F
      // 126: putfield i2h.p3h F
      // 129: aload 0
      // 12a: aload 0
      // 12b: aload 7
      // 12d: bipush 1
      // 12e: invokevirtual qhg.ofd (I)F
      // 131: dup_x1
      // 132: putfield i2h.y2i F
      // 135: putfield i2h.j25 F
      // 138: aload 0
      // 139: aload 0
      // 13a: getfield i2h.x5k F
      // 13d: invokevirtual i2h.jo1 (F)V
      // 140: aload 0
      // 141: aload 0
      // 142: getfield i2h.x5k F
      // 145: invokevirtual i2h.w1u (F)V
      // 148: aload 0
      // 149: aload 1
      // 14a: sipush 7144
      // 14d: ldc2_w 7360575523318197436
      // 150: lload 2
      // 151: lxor
      // 152: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: nop
      // 158: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 15b: putfield i2h.o_8 F
      // 15e: aload 0
      // 15f: aload 1
      // 160: sipush 13947
      // 163: ldc2_w 3403425992768373047
      // 166: lload 2
      // 167: lxor
      // 168: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 171: putfield i2h.bry I
      // 174: aload 0
      // 175: aload 1
      // 176: sipush 18292
      // 179: ldc2_w 567504727270436921
      // 17c: lload 2
      // 17d: lxor
      // 17e: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: nop
      // 184: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 187: invokevirtual i2h.yoc (I)V
      // 18a: aload 0
      // 18b: aload 1
      // 18c: sipush 5370
      // 18f: ldc2_w 2243839343861261198
      // 192: lload 2
      // 193: lxor
      // 194: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: nop
      // 19a: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 19d: putfield i2h.lfk Z
      // 1a0: aload 0
      // 1a1: aload 1
      // 1a2: sipush 12625
      // 1a5: ldc2_w 3859977477215012397
      // 1a8: lload 2
      // 1a9: lxor
      // 1aa: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: nop
      // 1b0: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1b3: putfield i2h.ohd I
      // 1b6: aload 0
      // 1b7: aload 1
      // 1b8: sipush 21715
      // 1bb: ldc2_w 2886805223960945576
      // 1be: lload 2
      // 1bf: lxor
      // 1c0: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: nop
      // 1c6: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 1c9: putfield i2h.i7j Z
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: sipush 4512
      // 1d1: ldc2_w 7590812308394764018
      // 1d4: lload 2
      // 1d5: lxor
      // 1d6: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: nop
      // 1dc: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1df: putfield i2h.rr6 I
      // 1e2: aload 1
      // 1e3: sipush 24372
      // 1e6: ldc2_w 7443907550774044758
      // 1e9: lload 2
      // 1ea: lxor
      // 1eb: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: nop
      // 1f1: bipush 4
      // 1f2: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1f5: iload 4
      // 1f7: ifne 283
      // 1fa: ifeq 268
      // 1fd: goto 204
      // 200: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 203: athrow
      // 204: aload 1
      // 205: sipush 26612
      // 208: ldc2_w 8650530327085486255
      // 20b: lload 2
      // 20c: lxor
      // 20d: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: nop
      // 213: bipush 4
      // 214: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 217: iload 4
      // 219: ifne 283
      // 21c: goto 223
      // 21f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 222: athrow
      // 223: ifeq 268
      // 226: goto 22d
      // 229: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: aload 0
      // 22e: new java/util/UUID
      // 231: dup
      // 232: aload 1
      // 233: sipush 24372
      // 236: ldc2_w 7443907550774044758
      // 239: lload 2
      // 23a: lxor
      // 23b: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: nop
      // 241: invokevirtual bdo.yn0 (Ljava/lang/String;)J
      // 244: aload 1
      // 245: sipush 26612
      // 248: ldc2_w 8650530327085486255
      // 24b: lload 2
      // 24c: lxor
      // 24d: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: nop
      // 253: invokevirtual bdo.yn0 (Ljava/lang/String;)J
      // 256: invokespecial java/util/UUID.<init> (JJ)V
      // 259: putfield i2h.vqf Ljava/util/UUID;
      // 25c: iload 4
      // 25e: ifeq 2b2
      // 261: goto 268
      // 264: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 267: athrow
      // 268: aload 1
      // 269: sipush 16622
      // 26c: ldc2_w 2002660805668976554
      // 26f: lload 2
      // 270: lxor
      // 271: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: nop
      // 277: bipush 8
      // 279: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 27c: goto 283
      // 27f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: iload 4
      // 285: ifne 2e2
      // 288: ifeq 2b2
      // 28b: goto 292
      // 28e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 291: athrow
      // 292: aload 0
      // 293: aload 1
      // 294: sipush 1955
      // 297: ldc2_w 2088456157118197965
      // 29a: lload 2
      // 29b: lxor
      // 29c: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: nop
      // 2a2: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 2a5: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 2a8: putfield i2h.vqf Ljava/util/UUID;
      // 2ab: goto 2b2
      // 2ae: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b1: athrow
      // 2b2: aload 0
      // 2b3: aload 0
      // 2b4: getfield i2h.o2v D
      // 2b7: aload 0
      // 2b8: getfield i2h.kfp D
      // 2bb: aload 0
      // 2bc: getfield i2h.vbd D
      // 2bf: invokevirtual i2h.m6_ (DDD)V
      // 2c2: aload 0
      // 2c3: aload 0
      // 2c4: getfield i2h.x5k F
      // 2c7: aload 0
      // 2c8: getfield i2h.y2i F
      // 2cb: invokevirtual i2h.iym (FF)V
      // 2ce: aload 1
      // 2cf: sipush 18134
      // 2d2: ldc2_w 2070023913045963186
      // 2d5: lload 2
      // 2d6: lxor
      // 2d7: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: nop
      // 2dd: bipush 8
      // 2df: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2e2: iload 4
      // 2e4: ifne 382
      // 2e7: ifeq 339
      // 2ea: goto 2f1
      // 2ed: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f0: athrow
      // 2f1: aload 1
      // 2f2: sipush 18134
      // 2f5: ldc2_w 2070023913045963186
      // 2f8: lload 2
      // 2f9: lxor
      // 2fa: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: nop
      // 300: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 303: invokevirtual java/lang/String.length ()I
      // 306: iload 4
      // 308: ifne 382
      // 30b: goto 312
      // 30e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 311: athrow
      // 312: ifle 339
      // 315: goto 31c
      // 318: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31b: athrow
      // 31c: aload 0
      // 31d: aload 1
      // 31e: sipush 18134
      // 321: ldc2_w 2070023913045963186
      // 324: lload 2
      // 325: lxor
      // 326: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: nop
      // 32c: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 32f: invokevirtual i2h.x84 (Ljava/lang/String;)V
      // 332: goto 339
      // 335: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 338: athrow
      // 339: aload 0
      // 33a: aload 1
      // 33b: sipush 5491
      // 33e: ldc2_w 3145698891854438931
      // 341: lload 2
      // 342: lxor
      // 343: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: nop
      // 349: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 34c: invokevirtual i2h.krn (Z)V
      // 34f: aload 0
      // 350: getfield i2h.rj4 Ln_k;
      // 353: aload 1
      // 354: invokevirtual n_k.irz (Lbdo;)V
      // 357: aload 0
      // 358: aload 1
      // 359: sipush 27097
      // 35c: ldc2_w 5646007737718054561
      // 35f: lload 2
      // 360: lxor
      // 361: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: nop
      // 367: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 36a: invokevirtual i2h.i11 (Z)V
      // 36d: aload 0
      // 36e: aload 1
      // 36f: invokevirtual i2h.cjb (Lbdo;)V
      // 372: aload 0
      // 373: iload 4
      // 375: ifne 386
      // 378: invokevirtual i2h.h6z ()Z
      // 37b: goto 382
      // 37e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 381: athrow
      // 382: ifeq 395
      // 385: aload 0
      // 386: aload 0
      // 387: getfield i2h.o2v D
      // 38a: aload 0
      // 38b: getfield i2h.kfp D
      // 38e: aload 0
      // 38f: getfield i2h.vbd D
      // 392: invokevirtual i2h.m6_ (DDD)V
      // 395: goto 3d4
      // 398: astore 5
      // 39a: aload 5
      // 39c: sipush 19793
      // 39f: ldc2_w 2029466597682952748
      // 3a2: lload 2
      // 3a3: lxor
      // 3a4: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a9: nop
      // 3aa: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 3ad: astore 6
      // 3af: aload 6
      // 3b1: sipush 21643
      // 3b4: ldc2_w 62993855327773644
      // 3b7: lload 2
      // 3b8: lxor
      // 3b9: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: nop
      // 3bf: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 3c2: astore 7
      // 3c4: aload 0
      // 3c5: aload 7
      // 3c7: invokevirtual i2h.gfa (Lwsc;)V
      // 3ca: new oov
      // 3cd: dup
      // 3ce: aload 6
      // 3d0: invokespecial oov.<init> (Le1i;)V
      // 3d3: athrow
      // 3d4: return
   }

   public boolean h6z() {
      return true;
   }

   public final String xbu() {
      return y65.dzl(this);
   }

   public abstract void cjb(bdo var1);

   public abstract void srs(bdo var1);

   public void cte() {
   }

   public qhg r0b(double[] var1) {
      qhg var3 = new qhg();
      int var10000 = t9d.b();
      double[] var4 = var1;
      int var2 = var10000;
      int var5 = var1.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            double var7 = var4[var6];

            try {
               var10 = var3;
               if (var2 == 0) {
                  break;
               }

               var3.w2j(new ok6(var7));
               var6++;
               if (var2 != 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         var10 = var3;
         break;
      }

      return var10;
   }

   public qhg trb(float[] var1) {
      qhg var3 = new qhg();
      float[] var4 = var1;
      int var10000 = t9d.c();
      int var5 = var1.length;
      int var2 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            float var7 = var4[var6];

            try {
               var9 = var3;
               if (var2 != 0) {
                  break;
               }

               var3.w2j(new n8i(var7));
               var6++;
               if (var2 == 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   public nvf e70(u7m var1, int var2) {
      return this.bhk(var1, var2, 0.0F);
   }

   public nvf bhk(u7m var1, int var2, float var3) {
      return this.qji(new erg(var1, var2, 0), var3);
   }

   public nvf qji(erg param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifeq 1e
      // 09: getfield erg.qd2 I
      // 0c: ifeq 53
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: invokevirtual erg.gn1 ()Lu7m;
      // 21: ifnull 53
      // 24: new nvf
      // 27: dup
      // 28: aload 0
      // 29: getfield i2h.oay Lt9d;
      // 2c: aload 0
      // 2d: getfield i2h.o2v D
      // 30: aload 0
      // 31: getfield i2h.kfp D
      // 34: fload 2
      // 35: f2d
      // 36: dadd
      // 37: aload 0
      // 38: getfield i2h.vbd D
      // 3b: aload 1
      // 3c: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 3f: astore 4
      // 41: aload 4
      // 43: invokevirtual nvf.zc4 ()V
      // 46: aload 0
      // 47: getfield i2h.oay Lt9d;
      // 4a: aload 4
      // 4c: invokevirtual t9d.xzq (Li2h;)Z
      // 4f: pop
      // 50: aload 4
      // 52: areturn
      // 53: aconst_null
      // 54: areturn
   }

   public boolean gzr() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.ma9;
         }

         if (!this.ma9) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public boolean sqy() {
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
      // 005: getfield i2h.kvx Z
      // 008: iload 1
      // 009: ifeq 017
      // 00c: ifeq 018
      // 00f: goto 016
      // 012: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: new mew$mix
      // 01b: dup
      // 01c: ldc -2147483648
      // 01e: nop
      // 01f: ldc -2147483648
      // 021: nop
      // 022: ldc -2147483648
      // 024: nop
      // 025: invokespecial mew$mix.<init> (III)V
      // 028: astore 2
      // 029: bipush 0
      // 02a: istore 3
      // 02b: iload 3
      // 02c: bipush 8
      // 02e: if_icmpge 11e
      // 031: aload 0
      // 032: getfield i2h.kfp D
      // 035: iload 3
      // 036: bipush 0
      // 037: ishr
      // 038: bipush 2
      // 039: irem
      // 03a: i2f
      // 03b: ldc 0.5
      // 03d: nop
      // 03e: fsub
      // 03f: ldc 0.1
      // 041: nop
      // 042: fmul
      // 043: f2d
      // 044: dadd
      // 045: aload 0
      // 046: invokevirtual i2h.c5y ()F
      // 049: f2d
      // 04a: dadd
      // 04b: invokestatic fe6.jqf (D)I
      // 04e: istore 4
      // 050: aload 0
      // 051: getfield i2h.o2v D
      // 054: iload 3
      // 055: bipush 1
      // 056: ishr
      // 057: bipush 2
      // 058: irem
      // 059: i2f
      // 05a: ldc 0.5
      // 05c: nop
      // 05d: fsub
      // 05e: aload 0
      // 05f: getfield i2h.uo6 F
      // 062: fmul
      // 063: ldc 0.8
      // 065: nop
      // 066: fmul
      // 067: f2d
      // 068: dadd
      // 069: invokestatic fe6.jqf (D)I
      // 06c: istore 5
      // 06e: aload 0
      // 06f: getfield i2h.vbd D
      // 072: iload 3
      // 073: bipush 2
      // 074: ishr
      // 075: bipush 2
      // 076: irem
      // 077: i2f
      // 078: ldc 0.5
      // 07a: nop
      // 07b: fsub
      // 07c: aload 0
      // 07d: getfield i2h.uo6 F
      // 080: fmul
      // 081: ldc 0.8
      // 083: nop
      // 084: fmul
      // 085: f2d
      // 086: dadd
      // 087: invokestatic fe6.jqf (D)I
      // 08a: istore 6
      // 08c: aload 2
      // 08d: invokevirtual mew$mix.getX ()I
      // 090: iload 1
      // 091: ifeq 11f
      // 094: iload 1
      // 095: ifeq 10e
      // 098: goto 09f
      // 09b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: iload 5
      // 0a1: if_icmpne 0e1
      // 0a4: goto 0ab
      // 0a7: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: aload 2
      // 0ac: invokevirtual mew$mix.getY ()I
      // 0af: iload 1
      // 0b0: ifeq 10e
      // 0b3: goto 0ba
      // 0b6: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: iload 4
      // 0bc: if_icmpne 0e1
      // 0bf: goto 0c6
      // 0c2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 2
      // 0c7: invokevirtual mew$mix.getZ ()I
      // 0ca: iload 1
      // 0cb: ifeq 10e
      // 0ce: goto 0d5
      // 0d1: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: iload 6
      // 0d7: if_icmpeq 117
      // 0da: goto 0e1
      // 0dd: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 2
      // 0e2: iload 5
      // 0e4: iload 4
      // 0e6: iload 6
      // 0e8: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0eb: pop
      // 0ec: iload 1
      // 0ed: ifeq 11a
      // 0f0: goto 0f7
      // 0f3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield i2h.oay Lt9d;
      // 0fb: aload 2
      // 0fc: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0ff: invokeinterface zfz.r_y ()Le0x; 1
      // 104: invokevirtual e0x.zrr ()Z
      // 107: goto 10e
      // 10a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: ifeq 117
      // 111: bipush 1
      // 112: ireturn
      // 113: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: iinc 3 1
      // 11a: iload 1
      // 11b: ifne 02b
      // 11e: bipush 0
      // 11f: ireturn
   }

   public boolean k25(ha9 var1) {
      return false;
   }

   public nh4 tjo(i2h var1) {
      return null;
   }

   public void dm3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield i2h.hzp Li2h;
      // 008: iload 1
      // 009: ifne 047
      // 00c: getfield i2h.ma9 Z
      // 00f: ifeq 029
      // 012: goto 019
      // 015: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: aconst_null
      // 01b: putfield i2h.hzp Li2h;
      // 01e: iload 1
      // 01f: ifeq 1d3
      // 022: goto 029
      // 025: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 0
      // 02a: dconst_0
      // 02b: putfield i2h.icv D
      // 02e: aload 0
      // 02f: dconst_0
      // 030: putfield i2h.mop D
      // 033: aload 0
      // 034: dconst_0
      // 035: putfield i2h.bw4 D
      // 038: aload 0
      // 039: invokevirtual i2h.xx_ ()V
      // 03c: aload 0
      // 03d: getfield i2h.hzp Li2h;
      // 040: goto 047
      // 043: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: iload 1
      // 048: ifne 07d
      // 04b: ifnull 1d3
      // 04e: goto 055
      // 051: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 0
      // 056: getfield i2h.hzp Li2h;
      // 059: invokevirtual i2h.dsu ()V
      // 05c: aload 0
      // 05d: dup
      // 05e: getfield i2h.yc4 D
      // 061: aload 0
      // 062: getfield i2h.hzp Li2h;
      // 065: getfield i2h.x5k F
      // 068: aload 0
      // 069: getfield i2h.hzp Li2h;
      // 06c: getfield i2h.p3h F
      // 06f: fsub
      // 070: f2d
      // 071: dadd
      // 072: putfield i2h.yc4 D
      // 075: aload 0
      // 076: goto 07d
      // 079: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: dup
      // 07e: getfield i2h.baf D
      // 081: aload 0
      // 082: getfield i2h.hzp Li2h;
      // 085: getfield i2h.y2i F
      // 088: aload 0
      // 089: getfield i2h.hzp Li2h;
      // 08c: getfield i2h.j25 F
      // 08f: fsub
      // 090: f2d
      // 091: dadd
      // 092: putfield i2h.baf D
      // 095: aload 0
      // 096: getfield i2h.yc4 D
      // 099: ldc2_w 180.0
      // 09c: dcmpl
      // 09d: iflt 0bb
      // 0a0: aload 0
      // 0a1: dup
      // 0a2: getfield i2h.yc4 D
      // 0a5: ldc2_w 360.0
      // 0a8: dsub
      // 0a9: putfield i2h.yc4 D
      // 0ac: iload 1
      // 0ad: ifne 0e1
      // 0b0: iload 1
      // 0b1: ifeq 095
      // 0b4: goto 0bb
      // 0b7: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield i2h.yc4 D
      // 0bf: ldc2_w -180.0
      // 0c2: dcmpg
      // 0c3: ifge 0e1
      // 0c6: aload 0
      // 0c7: dup
      // 0c8: getfield i2h.yc4 D
      // 0cb: ldc2_w 360.0
      // 0ce: dadd
      // 0cf: putfield i2h.yc4 D
      // 0d2: iload 1
      // 0d3: ifne 10e
      // 0d6: iload 1
      // 0d7: ifeq 0bb
      // 0da: goto 0e1
      // 0dd: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield i2h.baf D
      // 0e5: ldc2_w 180.0
      // 0e8: dcmpl
      // 0e9: iflt 10e
      // 0ec: aload 0
      // 0ed: dup
      // 0ee: getfield i2h.baf D
      // 0f1: ldc2_w 360.0
      // 0f4: dsub
      // 0f5: putfield i2h.baf D
      // 0f8: iload 1
      // 0f9: ifne 13b
      // 0fc: goto 103
      // 0ff: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: iload 1
      // 104: ifeq 0e1
      // 107: goto 10e
      // 10a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield i2h.baf D
      // 112: ldc2_w -180.0
      // 115: dcmpg
      // 116: ifge 13b
      // 119: aload 0
      // 11a: dup
      // 11b: getfield i2h.baf D
      // 11e: ldc2_w 360.0
      // 121: dadd
      // 122: putfield i2h.baf D
      // 125: iload 1
      // 126: ifne 1d3
      // 129: goto 130
      // 12c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: iload 1
      // 131: ifeq 10e
      // 134: goto 13b
      // 137: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: aload 0
      // 13c: getfield i2h.yc4 D
      // 13f: ldc2_w 0.5
      // 142: dmul
      // 143: dstore 2
      // 144: aload 0
      // 145: getfield i2h.baf D
      // 148: ldc2_w 0.5
      // 14b: dmul
      // 14c: dstore 4
      // 14e: ldc 10.0
      // 150: nop
      // 151: fstore 6
      // 153: dload 2
      // 154: fload 6
      // 156: f2d
      // 157: dcmpl
      // 158: iload 1
      // 159: ifne 170
      // 15c: ifle 16a
      // 15f: goto 166
      // 162: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 165: athrow
      // 166: fload 6
      // 168: f2d
      // 169: dstore 2
      // 16a: dload 2
      // 16b: fload 6
      // 16d: fneg
      // 16e: f2d
      // 16f: dcmpg
      // 170: iload 1
      // 171: ifne 189
      // 174: ifge 183
      // 177: goto 17e
      // 17a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17d: athrow
      // 17e: fload 6
      // 180: fneg
      // 181: f2d
      // 182: dstore 2
      // 183: dload 4
      // 185: fload 6
      // 187: f2d
      // 188: dcmpl
      // 189: iload 1
      // 18a: ifne 1ae
      // 18d: ifle 19c
      // 190: goto 197
      // 193: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: fload 6
      // 199: f2d
      // 19a: dstore 4
      // 19c: dload 4
      // 19e: iload 1
      // 19f: ifne 1bc
      // 1a2: fload 6
      // 1a4: fneg
      // 1a5: f2d
      // 1a6: dcmpg
      // 1a7: goto 1ae
      // 1aa: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ad: athrow
      // 1ae: ifge 1be
      // 1b1: fload 6
      // 1b3: fneg
      // 1b4: f2d
      // 1b5: goto 1bc
      // 1b8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: dstore 4
      // 1be: aload 0
      // 1bf: dup
      // 1c0: getfield i2h.yc4 D
      // 1c3: dload 2
      // 1c4: dsub
      // 1c5: putfield i2h.yc4 D
      // 1c8: aload 0
      // 1c9: dup
      // 1ca: getfield i2h.baf D
      // 1cd: dload 4
      // 1cf: dsub
      // 1d0: putfield i2h.baf D
      // 1d3: return
   }

   public void dsu() {
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
      // 05: getfield i2h.wgv Li2h;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 3d
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield i2h.wgv Li2h;
      // 1a: goto 21
      // 1d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 0
      // 22: getfield i2h.o2v D
      // 25: aload 0
      // 26: getfield i2h.kfp D
      // 29: aload 0
      // 2a: invokevirtual i2h.yyb ()D
      // 2d: dadd
      // 2e: aload 0
      // 2f: getfield i2h.wgv Li2h;
      // 32: invokevirtual i2h.g4y ()D
      // 35: dadd
      // 36: aload 0
      // 37: getfield i2h.vbd D
      // 3a: invokevirtual i2h.m6_ (DDD)V
      // 3d: return
   }

   public double g4y() {
      return 0.0;
   }

   public double yyb() {
      return (double)this.ikl * 0.75;
   }

   public void nw9(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dconst_0
      // 02: putfield i2h.baf D
      // 05: invokestatic t9d.b ()I
      // 08: aload 0
      // 09: dconst_0
      // 0a: putfield i2h.yc4 D
      // 0d: istore 2
      // 0e: aload 1
      // 0f: iload 2
      // 10: ifeq 86
      // 13: ifnonnull 7b
      // 16: goto 1d
      // 19: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield i2h.hzp Li2h;
      // 21: iload 2
      // 22: ifeq 73
      // 25: goto 2c
      // 28: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: ifnull 72
      // 2f: goto 36
      // 32: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 0
      // 37: aload 0
      // 38: getfield i2h.hzp Li2h;
      // 3b: getfield i2h.o2v D
      // 3e: aload 0
      // 3f: getfield i2h.hzp Li2h;
      // 42: invokevirtual i2h.aaw ()Lnh4;
      // 45: getfield nh4.bx_ D
      // 48: aload 0
      // 49: getfield i2h.hzp Li2h;
      // 4c: getfield i2h.ikl F
      // 4f: f2d
      // 50: dadd
      // 51: aload 0
      // 52: getfield i2h.hzp Li2h;
      // 55: getfield i2h.vbd D
      // 58: aload 0
      // 59: getfield i2h.x5k F
      // 5c: aload 0
      // 5d: getfield i2h.y2i F
      // 60: invokevirtual i2h.x24 (DDDFF)V
      // 63: aload 0
      // 64: getfield i2h.hzp Li2h;
      // 67: aconst_null
      // 68: putfield i2h.wgv Li2h;
      // 6b: goto 72
      // 6e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield i2h.hzp Li2h;
      // 77: iload 2
      // 78: ifne ea
      // 7b: aload 0
      // 7c: getfield i2h.hzp Li2h;
      // 7f: goto 86
      // 82: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: iload 2
      // 87: ifeq a4
      // 8a: ifnull a3
      // 8d: goto 94
      // 90: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 0
      // 95: getfield i2h.hzp Li2h;
      // 98: aconst_null
      // 99: putfield i2h.wgv Li2h;
      // 9c: goto a3
      // 9f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2: athrow
      // a3: aload 1
      // a4: iload 2
      // a5: ifeq e6
      // a8: ifnull e0
      // ab: goto b2
      // ae: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: aload 1
      // b3: getfield i2h.hzp Li2h;
      // b6: astore 3
      // b7: aload 3
      // b8: ifnull e0
      // bb: aload 3
      // bc: iload 2
      // bd: ifeq db
      // c0: aload 0
      // c1: iload 2
      // c2: ifeq e7
      // c5: goto cc
      // c8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cb: athrow
      // cc: if_acmpne d7
      // cf: goto d6
      // d2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d5: athrow
      // d6: return
      // d7: aload 3
      // d8: getfield i2h.hzp Li2h;
      // db: astore 3
      // dc: iload 2
      // dd: ifne b7
      // e0: aload 0
      // e1: aload 1
      // e2: putfield i2h.hzp Li2h;
      // e5: aload 1
      // e6: aload 0
      // e7: putfield i2h.wgv Li2h;
      // ea: return
   }

   public void ltu(double param1, double param3, double param5, float param7, float param8, int param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dload 1
      // 02: dload 3
      // 03: dload 5
      // 05: invokevirtual i2h.m6_ (DDD)V
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: fload 7
      // 0e: fload 8
      // 10: invokevirtual i2h.iym (FF)V
      // 13: istore 11
      // 15: aload 0
      // 16: getfield i2h.oay Lt9d;
      // 19: aload 0
      // 1a: aload 0
      // 1b: invokevirtual i2h.aaw ()Lnh4;
      // 1e: ldc2_w 0.03125
      // 21: dconst_0
      // 22: ldc2_w 0.03125
      // 25: invokevirtual nh4.va6 (DDD)Lnh4;
      // 28: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 2b: astore 12
      // 2d: aload 12
      // 2f: invokeinterface java/util/List.isEmpty ()Z 1
      // 34: ifne a4
      // 37: dconst_0
      // 38: dstore 13
      // 3a: aload 12
      // 3c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 41: astore 15
      // 43: aload 15
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifeq 8f
      // 4d: aload 15
      // 4f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54: checkcast nh4
      // 57: astore 16
      // 59: aload 16
      // 5b: getfield nh4.i2c D
      // 5e: iload 11
      // 60: ifeq 88
      // 63: dload 13
      // 65: iload 11
      // 67: ifeq 9a
      // 6a: goto 71
      // 6d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: dcmpl
      // 72: ifle 8a
      // 75: goto 7c
      // 78: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 16
      // 7e: getfield nh4.i2c D
      // 81: goto 88
      // 84: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: dstore 13
      // 8a: iload 11
      // 8c: ifne 43
      // 8f: dload 3
      // 90: dload 13
      // 92: aload 0
      // 93: invokevirtual i2h.aaw ()Lnh4;
      // 96: getfield nh4.bx_ D
      // 99: dsub
      // 9a: dadd
      // 9b: dstore 3
      // 9c: aload 0
      // 9d: dload 1
      // 9e: dload 3
      // 9f: dload 5
      // a1: invokevirtual i2h.m6_ (DDD)V
      // a4: return
   }

   public float npl() {
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
      // 05: instanceof ha9
      // 08: iload 1
      // 09: ifeq 23
      // 0c: ifeq 34
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: getstatic kgt.zh4 Lm57;
      // 19: invokevirtual m57.klu ()Z
      // 1c: goto 23
      // 1f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: ifeq 34
      // 26: getstatic m57.hoy Lcrk;
      // 29: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 2c: invokevirtual java/lang/Float.floatValue ()F
      // 2f: freturn
      // 30: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: ldc 0.1
      // 36: nop
      // 37: freturn
   }

   public fqr m77() {
      return null;
   }

   public void oie(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield i2h.rr6 I
      // 008: iload 2
      // 009: ifne 042
      // 00c: ifle 029
      // 00f: goto 016
      // 012: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: aload 0
      // 018: invokevirtual i2h.k0g ()I
      // 01b: putfield i2h.rr6 I
      // 01e: iload 2
      // 01f: ifeq 123
      // 022: goto 029
      // 025: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 0
      // 02a: iload 2
      // 02b: ifne 11f
      // 02e: goto 035
      // 031: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: getfield i2h.oay Lt9d;
      // 038: getfield t9d.v0f Z
      // 03b: goto 042
      // 03e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: ifne 11e
      // 045: aload 1
      // 046: aload 0
      // 047: getfield i2h.tzh Lmew;
      // 04a: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 04d: ifne 11e
      // 050: goto 057
      // 053: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: aload 0
      // 058: aload 1
      // 059: putfield i2h.tzh Lmew;
      // 05c: getstatic ox_.mly Luw1;
      // 05f: aload 0
      // 060: getfield i2h.oay Lt9d;
      // 063: aload 1
      // 064: invokevirtual uw1.wwx (Lt9d;Lmew;)Lr72$kqk;
      // 067: astore 3
      // 068: aload 3
      // 069: iload 2
      // 06a: ifne 090
      // 06d: invokevirtual r72$kqk.r97 ()Lvt2;
      // 070: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 073: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 076: if_acmpne 08f
      // 079: goto 080
      // 07c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: aload 3
      // 081: invokevirtual r72$kqk.in1 ()Lmew;
      // 084: invokevirtual mew.getZ ()I
      // 087: i2d
      // 088: goto 097
      // 08b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: aload 3
      // 090: invokevirtual r72$kqk.in1 ()Lmew;
      // 093: invokevirtual mew.getX ()I
      // 096: i2d
      // 097: dstore 4
      // 099: aload 3
      // 09a: invokevirtual r72$kqk.r97 ()Lvt2;
      // 09d: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0a0: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 0a3: if_acmpne 0b1
      // 0a6: aload 0
      // 0a7: getfield i2h.vbd D
      // 0aa: goto 0b5
      // 0ad: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield i2h.o2v D
      // 0b5: dstore 6
      // 0b7: dload 6
      // 0b9: aload 3
      // 0ba: invokevirtual r72$kqk.r97 ()Lvt2;
      // 0bd: invokevirtual vt2.drv ()Lvt2;
      // 0c0: invokevirtual vt2.uqa ()Lvt2$_l8;
      // 0c3: getstatic vt2$_l8.v40 Lvt2$_l8;
      // 0c6: if_acmpne 0d1
      // 0c9: bipush 1
      // 0ca: goto 0d2
      // 0cd: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: i2d
      // 0d3: dsub
      // 0d4: dload 4
      // 0d6: dload 4
      // 0d8: aload 3
      // 0d9: invokevirtual r72$kqk.io7 ()I
      // 0dc: i2d
      // 0dd: dsub
      // 0de: invokestatic fe6.hx5 (DDD)D
      // 0e1: invokestatic java/lang/Math.abs (D)D
      // 0e4: dstore 6
      // 0e6: aload 0
      // 0e7: getfield i2h.kfp D
      // 0ea: dconst_1
      // 0eb: dsub
      // 0ec: aload 3
      // 0ed: invokevirtual r72$kqk.in1 ()Lmew;
      // 0f0: invokevirtual mew.getY ()I
      // 0f3: i2d
      // 0f4: aload 3
      // 0f5: invokevirtual r72$kqk.in1 ()Lmew;
      // 0f8: invokevirtual mew.getY ()I
      // 0fb: aload 3
      // 0fc: invokevirtual r72$kqk.xrv ()I
      // 0ff: isub
      // 100: i2d
      // 101: invokestatic fe6.hx5 (DDD)D
      // 104: dstore 8
      // 106: aload 0
      // 107: new fqr
      // 10a: dup
      // 10b: dload 6
      // 10d: dload 8
      // 10f: dconst_0
      // 110: invokespecial fqr.<init> (DDD)V
      // 113: putfield i2h.r4s Lfqr;
      // 116: aload 0
      // 117: aload 3
      // 118: invokevirtual r72$kqk.r97 ()Lvt2;
      // 11b: putfield i2h.src Lvt2;
      // 11e: aload 0
      // 11f: bipush 1
      // 120: putfield i2h.jjl Z
      // 123: return
   }

   public int k0g() {
      return 300;
   }

   public void lmm(double var1, double var3, double var5) {
      this.icv = var1;
      this.mop = var3;
      this.bw4 = var5;
   }

   public void ptf(byte var1) {
   }

   public void h38() {
   }

   public erg[] n7a() {
      return null;
   }

   public void fga(int var1, erg var2) {
   }

   public boolean agj() {
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
      // 05: getfield i2h.oay Lt9d;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield i2h.oay Lt9d;
      // 1a: goto 21
      // 1d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: getfield t9d.v0f Z
      // 24: iload 1
      // 25: ifeq 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: istore 2
      // 38: aload 0
      // 39: getfield i2h.cuj Z
      // 3c: iload 1
      // 3d: ifeq 55
      // 40: ifne 97
      // 43: goto 4a
      // 46: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield i2h.bry I
      // 4e: goto 55
      // 51: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: iload 1
      // 56: ifeq 94
      // 59: ifgt 93
      // 5c: goto 63
      // 5f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: iload 2
      // 64: iload 1
      // 65: ifeq 85
      // 68: goto 6f
      // 6b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: ifeq 97
      // 72: goto 79
      // 75: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: aload 0
      // 7a: bipush 0
      // 7b: invokevirtual i2h.ibd (I)Z
      // 7e: goto 85
      // 81: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: iload 1
      // 86: ifeq 94
      // 89: ifeq 97
      // 8c: goto 93
      // 8f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: bipush 1
      // 94: goto 98
      // 97: bipush 0
      // 98: ireturn
   }

   public boolean i0e() {
      try {
         if (this.hzp != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean hzv() {
      return this.ibd(1);
   }

   public void rh_(boolean var1) {
      this.lqm(1, var1);
   }

   public boolean ew1() {
      return this.ibd(3);
   }

   public void fqc(boolean var1) {
      this.lqm(3, var1);
   }

   public boolean h5u() {
      return this.ibd(5);
   }

   public boolean fiy(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1f
      // 09: invokevirtual ha9.myu ()Z
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 22
      // 1a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual i2h.h5u ()Z
      // 22: ireturn
   }

   public void icv(boolean var1) {
      this.lqm(5, var1);
   }

   public boolean mwq() {
      return this.ibd(4);
   }

   public void _a5(boolean var1) {
      this.lqm(4, var1);
   }

   public boolean ibd(int var1) {
      int var2 = t9d.c();

      try {
         int var10000 = this.oit.miz(0) & 1 << var1;
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public void lqm(int param1, boolean param2) {
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
      // 05: getfield i2h.oit Lwl1;
      // 08: bipush 0
      // 09: invokevirtual wl1.miz (I)B
      // 0c: istore 4
      // 0e: iload 3
      // 0f: ifne 36
      // 12: iload 2
      // 13: ifeq 3a
      // 16: goto 1d
      // 19: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield i2h.oit Lwl1;
      // 21: bipush 0
      // 22: iload 4
      // 24: bipush 1
      // 25: iload 1
      // 26: ishl
      // 27: ior
      // 28: i2b
      // 29: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2c: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2f: goto 36
      // 32: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: iload 3
      // 37: ifeq 55
      // 3a: aload 0
      // 3b: getfield i2h.oit Lwl1;
      // 3e: bipush 0
      // 3f: iload 4
      // 41: bipush 1
      // 42: iload 1
      // 43: ishl
      // 44: bipush -1
      // 45: ixor
      // 46: iand
      // 47: i2b
      // 48: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 4b: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 4e: goto 55
      // 51: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: return
   }

   public int n5m() {
      return this.oit.vxp(1);
   }

   public void yoc(int var1) {
      this.oit.c66(1, (short)var1);
   }

   public void nzg(_6b param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic ofh.w8h Lofh;
      // 04: ldc 5.0
      // 06: nop
      // 07: invokevirtual i2h.m1t (Lofh;F)Z
      // 0a: pop
      // 0b: invokestatic t9d.b ()I
      // 0e: aload 0
      // 0f: dup
      // 10: getfield i2h.bry I
      // 13: bipush 1
      // 14: iadd
      // 15: putfield i2h.bry I
      // 18: istore 2
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifeq 33
      // 1e: getfield i2h.bry I
      // 21: ifne 38
      // 24: goto 2b
      // 27: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: bipush 8
      // 35: invokevirtual i2h.k03 (I)V
      // 38: return
   }

   public void s5f(g_3 var1) {
   }

   public boolean vwl(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new mew
      // 003: dup
      // 004: dload 1
      // 005: dload 3
      // 006: dload 5
      // 008: invokespecial mew.<init> (DDD)V
      // 00b: astore 8
      // 00d: invokestatic t9d.b ()I
      // 010: dload 1
      // 011: aload 8
      // 013: invokevirtual mew.getX ()I
      // 016: i2d
      // 017: dsub
      // 018: dstore 9
      // 01a: dload 3
      // 01b: aload 8
      // 01d: invokevirtual mew.getY ()I
      // 020: i2d
      // 021: dsub
      // 022: dstore 11
      // 024: dload 5
      // 026: aload 8
      // 028: invokevirtual mew.getZ ()I
      // 02b: i2d
      // 02c: dsub
      // 02d: dstore 13
      // 02f: istore 7
      // 031: aload 0
      // 032: getfield i2h.oay Lt9d;
      // 035: aload 0
      // 036: invokevirtual i2h.aaw ()Lnh4;
      // 039: invokevirtual t9d.d_0 (Lnh4;)Ljava/util/List;
      // 03c: astore 15
      // 03e: aload 15
      // 040: invokeinterface java/util/List.isEmpty ()Z 1
      // 045: iload 7
      // 047: ifeq 07a
      // 04a: ifeq 079
      // 04d: goto 054
      // 050: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 0
      // 055: getfield i2h.oay Lt9d;
      // 058: aload 8
      // 05a: invokevirtual t9d.zd3 (Lmew;)Z
      // 05d: iload 7
      // 05f: ifeq 07a
      // 062: goto 069
      // 065: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: ifne 079
      // 06c: goto 073
      // 06f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: bipush 0
      // 074: ireturn
      // 075: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: bipush 3
      // 07a: istore 16
      // 07c: ldc2_w 9999.0
      // 07f: dstore 17
      // 081: aload 0
      // 082: getfield i2h.oay Lt9d;
      // 085: aload 8
      // 087: invokevirtual mew.y8e ()Lmew;
      // 08a: invokevirtual t9d.zd3 (Lmew;)Z
      // 08d: iload 7
      // 08f: ifeq 0ca
      // 092: ifne 0be
      // 095: goto 09c
      // 098: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: dload 9
      // 09e: dload 17
      // 0a0: dcmpg
      // 0a1: iload 7
      // 0a3: ifeq 0ca
      // 0a6: goto 0ad
      // 0a9: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: ifge 0be
      // 0b0: goto 0b7
      // 0b3: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: dload 9
      // 0b9: dstore 17
      // 0bb: bipush 0
      // 0bc: istore 16
      // 0be: aload 0
      // 0bf: getfield i2h.oay Lt9d;
      // 0c2: aload 8
      // 0c4: invokevirtual mew.o_8 ()Lmew;
      // 0c7: invokevirtual t9d.zd3 (Lmew;)Z
      // 0ca: iload 7
      // 0cc: ifeq 10b
      // 0cf: ifne 0ff
      // 0d2: goto 0d9
      // 0d5: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: dconst_1
      // 0da: dload 9
      // 0dc: dsub
      // 0dd: dload 17
      // 0df: dcmpg
      // 0e0: iload 7
      // 0e2: ifeq 10b
      // 0e5: goto 0ec
      // 0e8: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: ifge 0ff
      // 0ef: goto 0f6
      // 0f2: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: dconst_1
      // 0f7: dload 9
      // 0f9: dsub
      // 0fa: dstore 17
      // 0fc: bipush 1
      // 0fd: istore 16
      // 0ff: aload 0
      // 100: getfield i2h.oay Lt9d;
      // 103: aload 8
      // 105: invokevirtual mew.nuv ()Lmew;
      // 108: invokevirtual t9d.zd3 (Lmew;)Z
      // 10b: iload 7
      // 10d: ifeq 14c
      // 110: ifne 140
      // 113: goto 11a
      // 116: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: dconst_1
      // 11b: dload 11
      // 11d: dsub
      // 11e: dload 17
      // 120: dcmpg
      // 121: iload 7
      // 123: ifeq 14c
      // 126: goto 12d
      // 129: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: ifge 140
      // 130: goto 137
      // 133: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: dconst_1
      // 138: dload 11
      // 13a: dsub
      // 13b: dstore 17
      // 13d: bipush 3
      // 13e: istore 16
      // 140: aload 0
      // 141: getfield i2h.oay Lt9d;
      // 144: aload 8
      // 146: invokevirtual mew.idu ()Lmew;
      // 149: invokevirtual t9d.zd3 (Lmew;)Z
      // 14c: iload 7
      // 14e: ifeq 195
      // 151: ifne 17d
      // 154: goto 15b
      // 157: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: dload 13
      // 15d: dload 17
      // 15f: dcmpg
      // 160: iload 7
      // 162: ifeq 195
      // 165: goto 16c
      // 168: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: ifge 17d
      // 16f: goto 176
      // 172: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: dload 13
      // 178: dstore 17
      // 17a: bipush 4
      // 17b: istore 16
      // 17d: aload 0
      // 17e: iload 7
      // 180: ifeq 1bf
      // 183: getfield i2h.oay Lt9d;
      // 186: aload 8
      // 188: invokevirtual mew.z6x ()Lmew;
      // 18b: invokevirtual t9d.zd3 (Lmew;)Z
      // 18e: goto 195
      // 191: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 194: athrow
      // 195: ifne 1be
      // 198: dconst_1
      // 199: dload 13
      // 19b: dsub
      // 19c: dload 17
      // 19e: dcmpg
      // 19f: iload 7
      // 1a1: ifeq 1bc
      // 1a4: goto 1ab
      // 1a7: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1aa: athrow
      // 1ab: ifge 1be
      // 1ae: goto 1b5
      // 1b1: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: dconst_1
      // 1b6: dload 13
      // 1b8: dsub
      // 1b9: dstore 17
      // 1bb: bipush 5
      // 1bc: istore 16
      // 1be: aload 0
      // 1bf: getfield i2h.z2d Ljava/util/Random;
      // 1c2: invokevirtual java/util/Random.nextFloat ()F
      // 1c5: ldc 0.2
      // 1c7: nop
      // 1c8: fmul
      // 1c9: ldc 0.1
      // 1cb: nop
      // 1cc: fadd
      // 1cd: fstore 19
      // 1cf: iload 16
      // 1d1: iload 7
      // 1d3: ifeq 1f1
      // 1d6: ifne 1ef
      // 1d9: goto 1e0
      // 1dc: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: fload 19
      // 1e3: fneg
      // 1e4: f2d
      // 1e5: putfield i2h.icv D
      // 1e8: goto 1ef
      // 1eb: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: iload 16
      // 1f1: bipush 1
      // 1f2: iload 7
      // 1f4: ifeq 212
      // 1f7: if_icmpne 20f
      // 1fa: goto 201
      // 1fd: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 200: athrow
      // 201: aload 0
      // 202: fload 19
      // 204: f2d
      // 205: putfield i2h.icv D
      // 208: goto 20f
      // 20b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20e: athrow
      // 20f: iload 16
      // 211: bipush 3
      // 212: iload 7
      // 214: ifeq 232
      // 217: if_icmpne 22f
      // 21a: goto 221
      // 21d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 220: athrow
      // 221: aload 0
      // 222: fload 19
      // 224: f2d
      // 225: putfield i2h.mop D
      // 228: goto 22f
      // 22b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22e: athrow
      // 22f: iload 16
      // 231: bipush 4
      // 232: iload 7
      // 234: ifeq 25f
      // 237: if_icmpne 250
      // 23a: goto 241
      // 23d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: aload 0
      // 242: fload 19
      // 244: fneg
      // 245: f2d
      // 246: putfield i2h.bw4 D
      // 249: goto 250
      // 24c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24f: athrow
      // 250: iload 16
      // 252: iload 7
      // 254: ifeq 271
      // 257: bipush 5
      // 258: goto 25f
      // 25b: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25e: athrow
      // 25f: if_icmpne 270
      // 262: aload 0
      // 263: fload 19
      // 265: f2d
      // 266: putfield i2h.bw4 D
      // 269: goto 270
      // 26c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26f: athrow
      // 270: bipush 1
      // 271: ireturn
   }

   public void wx3() {
      this.r1h = true;
      this.o_8 = 0.0F;
   }

   @Override
   public String noc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i2h.f J
      // 03: ldc2_w 17603264806129
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 28
      // 11: invokevirtual i2h.qrh ()Z
      // 14: ifeq 27
      // 17: goto 1e
      // 1a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual i2h.hei ()Ljava/lang/String;
      // 22: areturn
      // 23: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: invokestatic y65.dzl (Li2h;)Ljava/lang/String;
      // 2b: astore 4
      // 2d: aload 4
      // 2f: iload 3
      // 30: ifne 81
      // 33: ifnonnull 4d
      // 36: goto 3d
      // 39: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: sipush 7059
      // 40: ldc2_w 6345257765403877152
      // 43: lload 1
      // 44: lxor
      // 45: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: nop
      // 4b: astore 4
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: sipush 21335
      // 57: ldc2_w 3077764592467351492
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: aload 4
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: sipush 1181
      // 6d: ldc2_w 9184137778474270777
      // 70: lload 1
      // 71: lxor
      // 72: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 81: areturn
   }

   public i2h[] u_g() {
      return null;
   }

   public boolean ipr(i2h var1) {
      try {
         if (this == var1) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public float t9t() {
      return 0.0F;
   }

   public void jo1(float var1) {
   }

   public void w1u(float var1) {
   }

   public boolean qvl() {
      return true;
   }

   public boolean s_r(i2h var1) {
      return false;
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i2h.f J
      // 03: ldc2_w 79647511682058
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: sipush 8567
      // 0f: ldc2_w 5924464957740844312
      // 12: lload 1
      // 13: lxor
      // 14: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: nop
      // 1a: bipush 7
      // 1c: anewarray 40
      // 1f: dup
      // 20: bipush 0
      // 21: aload 0
      // 22: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 25: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 28: aastore
      // 29: dup
      // 2a: bipush 1
      // 2b: aload 0
      // 2c: invokevirtual i2h.noc ()Ljava/lang/String;
      // 2f: aastore
      // 30: dup
      // 31: bipush 2
      // 32: aload 0
      // 33: getfield i2h.x0s I
      // 36: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 39: aastore
      // 3a: dup
      // 3b: bipush 3
      // 3c: aload 0
      // 3d: getfield i2h.oay Lt9d;
      // 40: iload 3
      // 41: ifne 67
      // 44: ifnonnull 63
      // 47: goto 4e
      // 4a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: sipush 4471
      // 51: ldc2_w 7396678947583767820
      // 54: lload 1
      // 55: lxor
      // 56: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: nop
      // 5c: goto 6d
      // 5f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: getfield i2h.oay Lt9d;
      // 67: invokevirtual t9d.r7d ()Lcog;
      // 6a: invokevirtual cog.fln ()Ljava/lang/String;
      // 6d: aastore
      // 6e: dup
      // 6f: bipush 4
      // 70: aload 0
      // 71: getfield i2h.o2v D
      // 74: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 77: aastore
      // 78: dup
      // 79: bipush 5
      // 7a: aload 0
      // 7b: getfield i2h.kfp D
      // 7e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 81: aastore
      // 82: dup
      // 83: bipush 6
      // 85: aload 0
      // 86: getfield i2h.vbd D
      // 89: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 8c: aastore
      // 8d: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 90: areturn
   }

   public boolean nss(ofh param1) {
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
      // 05: getfield i2h.i7j Z
      // 08: ifeq 41
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifeq 2c
      // 10: goto 17
      // 13: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: getstatic ofh.r2b Lofh;
      // 1a: if_acmpeq 41
      // 1d: goto 24
      // 20: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 1
      // 25: goto 2c
      // 28: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: invokevirtual ofh.neg ()Z
      // 2f: iload 2
      // 30: ifeq 3e
      // 33: ifne 41
      // 36: goto 3d
      // 39: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   public void nyk(i2h var1) {
      this.x24(var1.o2v, var1.kfp, var1.vbd, var1.x5k, var1.y2i);
   }

   public void oyu(i2h var1) {
      bdo var2 = new bdo();
      var1.c97(var2);
      this.a1f(var2);
      this.rr6 = var1.rr6;
      this.tzh = var1.tzh;
      this.r4s = var1.r4s;
      this.src = var1.src;
   }

   public void zye(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic i2h.f J
      // 003: ldc2_w 124429930541617
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield i2h.oay Lt9d;
      // 011: getfield t9d.v0f Z
      // 014: iload 4
      // 016: ifne 03a
      // 019: ifne 18a
      // 01c: goto 023
      // 01f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: iload 4
      // 026: ifne 03e
      // 029: goto 030
      // 02c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: getfield i2h.ma9 Z
      // 033: goto 03a
      // 036: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: ifne 18a
      // 03d: aload 0
      // 03e: getfield i2h.oay Lt9d;
      // 041: getfield t9d.e8t Luan;
      // 044: sipush 18491
      // 047: ldc2_w 2671784581538562627
      // 04a: lload 2
      // 04b: lxor
      // 04c: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: nop
      // 052: invokevirtual uan.qek (Ljava/lang/String;)V
      // 055: invokestatic vr1._0v ()Lvr1;
      // 058: astore 5
      // 05a: aload 0
      // 05b: getfield i2h.ohd I
      // 05e: istore 6
      // 060: aload 5
      // 062: iload 6
      // 064: invokevirtual vr1.hrw (I)Ldug;
      // 067: astore 7
      // 069: aload 5
      // 06b: iload 1
      // 06c: invokevirtual vr1.hrw (I)Ldug;
      // 06f: astore 8
      // 071: aload 0
      // 072: iload 1
      // 073: putfield i2h.ohd I
      // 076: iload 4
      // 078: ifne 0ed
      // 07b: iload 6
      // 07d: bipush 1
      // 07e: if_icmpne 0a1
      // 081: goto 088
      // 084: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: iload 1
      // 089: bipush 1
      // 08a: if_icmpne 0a1
      // 08d: goto 094
      // 090: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: aload 5
      // 096: bipush 0
      // 097: invokevirtual vr1.hrw (I)Ldug;
      // 09a: astore 8
      // 09c: aload 0
      // 09d: bipush 0
      // 09e: putfield i2h.ohd I
      // 0a1: aload 0
      // 0a2: getfield i2h.oay Lt9d;
      // 0a5: aload 0
      // 0a6: invokevirtual t9d.rqa (Li2h;)V
      // 0a9: aload 0
      // 0aa: bipush 0
      // 0ab: putfield i2h.ma9 Z
      // 0ae: aload 0
      // 0af: getfield i2h.oay Lt9d;
      // 0b2: getfield t9d.e8t Luan;
      // 0b5: sipush 14794
      // 0b8: ldc2_w 3235403660815348644
      // 0bb: lload 2
      // 0bc: lxor
      // 0bd: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: nop
      // 0c3: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0c6: aload 5
      // 0c8: invokevirtual vr1.wh3 ()Lwlx;
      // 0cb: aload 0
      // 0cc: iload 6
      // 0ce: aload 7
      // 0d0: aload 8
      // 0d2: invokevirtual wlx._dn (Li2h;ILdug;Ldug;)V
      // 0d5: aload 0
      // 0d6: getfield i2h.oay Lt9d;
      // 0d9: getfield t9d.e8t Luan;
      // 0dc: sipush 30474
      // 0df: ldc2_w 8083735683281976655
      // 0e2: lload 2
      // 0e3: lxor
      // 0e4: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: nop
      // 0ea: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 0ed: aload 0
      // 0ee: invokestatic y65.dzl (Li2h;)Ljava/lang/String;
      // 0f1: aload 8
      // 0f3: invokestatic y65.k71 (Ljava/lang/String;Lt9d;)Li2h;
      // 0f6: astore 9
      // 0f8: aload 9
      // 0fa: iload 4
      // 0fc: ifne 181
      // 0ff: ifnull 167
      // 102: goto 109
      // 105: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: aload 9
      // 10b: aload 0
      // 10c: invokevirtual i2h.oyu (Li2h;)V
      // 10f: iload 6
      // 111: iload 4
      // 113: ifne 166
      // 116: goto 11d
      // 119: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: bipush 1
      // 11e: if_icmpne 15f
      // 121: goto 128
      // 124: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: iload 1
      // 129: iload 4
      // 12b: ifne 166
      // 12e: goto 135
      // 131: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: bipush 1
      // 136: if_icmpne 15f
      // 139: goto 140
      // 13c: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: aload 0
      // 141: getfield i2h.oay Lt9d;
      // 144: aload 8
      // 146: invokevirtual dug.suq ()Lmew;
      // 149: invokevirtual t9d.pnv (Lmew;)Lmew;
      // 14c: astore 10
      // 14e: aload 9
      // 150: aload 10
      // 152: aload 9
      // 154: getfield i2h.x5k F
      // 157: aload 9
      // 159: getfield i2h.y2i F
      // 15c: invokevirtual i2h.kva (Lmew;FF)V
      // 15f: aload 8
      // 161: aload 9
      // 163: invokevirtual dug.xzq (Li2h;)Z
      // 166: pop
      // 167: aload 0
      // 168: bipush 1
      // 169: putfield i2h.ma9 Z
      // 16c: aload 0
      // 16d: getfield i2h.oay Lt9d;
      // 170: getfield t9d.e8t Luan;
      // 173: invokevirtual uan.uio ()V
      // 176: aload 7
      // 178: invokevirtual dug.ko8 ()V
      // 17b: aload 8
      // 17d: invokevirtual dug.ko8 ()V
      // 180: aload 0
      // 181: getfield i2h.oay Lt9d;
      // 184: getfield t9d.e8t Luan;
      // 187: invokevirtual uan.uio ()V
      // 18a: return
   }

   public float sx1(vu6 var1, t9d var2, mew var3, zfz var4) {
      return var4.r_y().aok(this);
   }

   public boolean kli(vu6 var1, t9d var2, mew var3, zfz var4, float var5) {
      return true;
   }

   public int c4g() {
      return 3;
   }

   public fqr nly() {
      return this.r4s;
   }

   public vt2 zcu() {
      return this.src;
   }

   public boolean l__() {
      return false;
   }

   public void gfa(wsc var1) {
      long var2 = f ^ 31426813769910L;
      var1.h1o(a<"p">(17236, 2909483623607780284L ^ var2), new i2h$1(this));
      var1._0p(a<"p">(9018, 341740963671221208L ^ var2), this.x0s);
      var1.h1o(a<"p">(30791, 5052817371599403170L ^ var2), new i2h$2(this));
      var1._0p(a<"p">(27527, 3558646677208394599L ^ var2), String.format(a<"p">(17775, 4456454802411898290L ^ var2), this.o2v, this.kfp, this.vbd));
      var1._0p(a<"p">(5366, 7571108040741426188L ^ var2), wsc.elx((double)fe6.jqf(this.o2v), (double)fe6.jqf(this.kfp), (double)fe6.jqf(this.vbd)));
      var1._0p(a<"p">(8551, 8013346005581799835L ^ var2), String.format(a<"p">(5590, 1260283188951881042L ^ var2), this.icv, this.mop, this.bw4));
      var1.h1o(a<"p">(31392, 5554912737178810974L ^ var2), new i2h$3(this));
      var1.h1o(a<"p">(30067, 6935186033192498672L ^ var2), new i2h$4(this));
   }

   public boolean zex() {
      return this.agj();
   }

   public UUID b_q() {
      return this.vqf;
   }

   public boolean ycw() {
      return true;
   }

   @Override
   public ekw xyw() {
      tao var1 = new tao(this.noc());
      var1.f4q().zn_(this.c7n());
      var1.f4q().o7m(this.b_q().toString());
      return var1;
   }

   public void x84(String var1) {
      this.oit.c66(2, var1);
   }

   public String hei() {
      return this.oit.bsd(2);
   }

   public boolean qrh() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.bsd(2).length();
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void krn(boolean var1) {
      int var2 = t9d.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.oit;
               var10001 = 3;
               var10002 = var1;
               if (var2 == 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
   }

   public boolean bpc() {
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
      // 05: getfield i2h.oit Lwl1;
      // 08: bipush 3
      // 09: invokevirtual wl1.miz (I)B
      // 0c: iload 1
      // 0d: ifeq 23
      // 10: bipush 1
      // 11: if_icmpne 26
      // 14: goto 1b
      // 17: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: goto 23
      // 1f: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: goto 27
      // 26: bipush 0
      // 27: ireturn
   }

   public void clj(double var1, double var3, double var5) {
      this.x24(var1, var3, var5, this.x5k, this.y2i);
   }

   public boolean x1t() {
      return this.bpc();
   }

   public void jcg(int var1) {
   }

   public vt2 u0f() {
      return vt2.bm6(fe6.jqf((double)(this.x5k * 4.0F / 360.0F) + 0.5) & 3);
   }

   public xq3 c7n() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i2h.f J
      // 03: ldc2_w 85754267280784
      // 06: lxor
      // 07: lstore 1
      // 08: new bdo
      // 0b: dup
      // 0c: invokespecial bdo.<init> ()V
      // 0f: astore 4
      // 11: invokestatic t9d.c ()I
      // 14: aload 0
      // 15: invokestatic y65.dzl (Li2h;)Ljava/lang/String;
      // 18: astore 5
      // 1a: istore 3
      // 1b: aload 4
      // 1d: sipush 27471
      // 20: ldc2_w 8531228921635731117
      // 23: lload 1
      // 24: lxor
      // 25: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: nop
      // 2b: aload 0
      // 2c: invokevirtual i2h.b_q ()Ljava/util/UUID;
      // 2f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 32: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 35: iload 3
      // 36: ifne 78
      // 39: aload 5
      // 3b: ifnull 61
      // 3e: goto 45
      // 41: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 4
      // 47: sipush 20186
      // 4a: ldc2_w 4567482782366290745
      // 4d: lload 1
      // 4e: lxor
      // 4f: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: nop
      // 55: aload 5
      // 57: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 5a: goto 61
      // 5d: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 4
      // 63: sipush 7124
      // 66: ldc2_w 1489460021234435624
      // 69: lload 1
      // 6a: lxor
      // 6b: invokedynamic p (IJ)Ljava/lang/String; bsm=i2h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: aload 0
      // 72: invokevirtual i2h.noc ()Ljava/lang/String;
      // 75: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 78: new xq3
      // 7b: dup
      // 7c: getstatic xq3$e6b.p4n Lxq3$e6b;
      // 7f: new tao
      // 82: dup
      // 83: aload 4
      // 85: invokevirtual bdo.toString ()Ljava/lang/String;
      // 88: invokespecial tao.<init> (Ljava/lang/String;)V
      // 8b: invokespecial xq3.<init> (Lxq3$e6b;Lekw;)V
      // 8e: areturn
   }

   public boolean xak(z96 var1) {
      return true;
   }

   public nh4 aaw() {
      return this.l29;
   }

   public void qq7(nh4 var1) {
      this.l29 = var1;
   }

   public float c5y() {
      return this.ikl * 0.85F;
   }

   public boolean hh5() {
      return this.jf5;
   }

   public void jy1(boolean var1) {
      this.jf5 = var1;
   }

   public boolean ltx(int var1, erg var2) {
      return false;
   }

   @Override
   public void a0d(ekw var1) {
   }

   @Override
   public boolean ge4(int var1, String var2) {
      return true;
   }

   @Override
   public mew d3d() {
      return new mew(this.o2v, this.kfp + 0.5, this.vbd);
   }

   @Override
   public fqr i15() {
      return new fqr(this.o2v, this.kfp, this.vbd);
   }

   @Override
   public t9d qha() {
      return this.oay;
   }

   @Override
   public i2h zyd() {
      return this;
   }

   @Override
   public boolean ofq() {
      return false;
   }

   @Override
   public void io9(n_k$pbp var1, int var2) {
      this.rj4.ix7(this, var1, var2);
   }

   public n_k sr3() {
      return this.rj4;
   }

   public void kj_(i2h var1) {
      this.rj4.dbs(var1.sr3());
   }

   public bdo szx() {
      return null;
   }

   public void yhf(bdo var1) {
   }

   public boolean rc1(ha9 var1, fqr var2) {
      return false;
   }

   public boolean zsp() {
      return false;
   }

   public void wm5(g_3 param1, i2h param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 1e
      // 09: instanceof g_3
      // 0c: ifeq 25
      // 0f: goto 16
      // 12: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 2
      // 17: goto 1e
      // 1a: invokestatic i2h.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: checkcast g_3
      // 21: aload 1
      // 22: invokestatic hc0.eay (Lg_3;Li2h;)V
      // 25: aload 1
      // 26: aload 2
      // 27: invokestatic hc0.rzk (Lg_3;Li2h;)V
      // 2a: return
   }

   public nh4 rhs() {
      return this.l29;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-437824298743693215L, -2115240356361193801L, MethodHandles.lookup().lookupClass()).a(80199576112545L);
      // $VF: monitorexit
      f = var10000;
      long var0 = f ^ 110242882630342L;
      b(null);
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[70];
      int var7 = 0;
      String var6 = "1v#\u0094]\u0089íò+Yé\u009cíú>¨\u0010µ~\u0082ý\u009dÎû\u0090FFºØ\u008f\u0080³Ò\u0010\u0013ç\u0004\u008a·\u009bVó\u0010s\"\u000e©®TÐ\u0010\u0004£öÒí\u001eð\u000fq¹ÿ\u001c³Y\u001bV8Ê\u0086ùËVQN³mëxÄ_5Mh1\"l\u0095ùH¶*\u008e×G_Á\u001f\u0014bB\u001dÿk\u008e¡SÐ\u0096\u000b§Bï9\u00902½HÞ&[h®k \u009fãR\u0002Î@39¦¡ûÎ÷Fgv90êë\u0096\u0000%_\u0015¹û9JÜkÓ àsóY.¦,ÔïPy \u0089êt\u001f\u0089\u0083[@Û\u0017°\u000f=)\u0013ºíIN\u001b0çy¾óALØ \u0090×¨8³Ã\u0004ø\u009f\\\u0092\u009eá§\u001cÞ.Y\u0006ÄmÃ\u008c1Ú\u0085Í÷ZµC»%ñ:\u0010%Áú\u0010 \u0090ò$Ò¼¬h,\u00ad\u0085\"\u008dÆ \u0096Dëú/Z«\u0005ú\u0011«\u007fq±EíUa\u0018]*#\u009aô ÃÍ\u0099ûçûiå\u009aS¶\u000fe'möG\u0007\u0010©H7\b.Âºæ¢ã\u0095\u0098\u0086\u009c¶× 3B\u008fRd]\u001b\u0018?VdQo¤0®\u0015$Æ÷~lÏ>¼N\u008d\r\u00901m+ p<\u0092ýñRW¦\u00114\u001d5\nU.oFOÌü»K\u0014À\u0005Y«¡è3\u0011V\u0010~j³:v\u007fVâZå\u0014\u0005býµ, À\u0096\u000f@?\u0096ü\u007ff\u0080&¼\u0001\u001f¼ÂÓZ\u000en\u00ad×é#\u0010N\u0081\u000eÃ\u008e¾z(ÑR\u0084WYòÆö\u000füÎ¢p\u0004>\u008cÎ{ÁKì\u008c\u0084×£4§ä¡|Êû}ÎÄîÜ°Øa Wâj\u00adî7ª\u001aâH|äÏd!ÒÌPq\u0099\n¬\u0085Ö½.Àq´\u0002¹i8\u0090qzíßÁ@Àÿ«p½ÍU¢£Üïj[îñÀ'\u008e¿v-On·Ôá¶úwWa\u0010þµ¿F,÷û5P;¦\u001d©=Äç.(¯\u001b\u0080;;=Àí\u000f\u008fÅ\u001fÏN¬'»gÛ\r_ðJb\u0011ñ²]\u0092±\u0002\u0017Ò]\u001b/.±]«\u0010áþ#\u009a[\u0007ü²ÝÞ%¡ÔòB\u009cPZ\u008b/vUþ_B\u0019Û@\u0013&\u0001`ÝgÝ\n@ ËcU\u008177|\u0017°ùÃ<\"?i\u0098Á\u008d;ùT-Ò\u0010£iÿá\u0089tz\u0095èÑ\u009dí¾ù\u008eó°\f\u0094Wï[\tHÕY\u007f Ö\u0088\u00ad\u0085ÚLÑ(\u008d\u009b\u0016ç\u009eU_B¥\u0090µ}\u0016½\u0097Ô¤ç~Có\u0090\u0016\u008a¹:³2\nC«Q\u0015lÿ,SÕùÇ »£ý\u0096y\u0010<r`â$ôìk[õÁ\u008aähÐ\u0002\u0014ðhcºÞÝÀ]H\u0010ïæÅá¬\u001aûÏ£û\u009dÊCttê\u0010$Î\u0084`¶¯¨\u0000ÉQ+v-\u0085\u0085\u0081(\u0083hr\u0019\u009b\u0084Å~WÃ\u0003Qõ\u009a[÷NLÿô\u0081T\n¦cüa\u0018õr\u0012P¹Éo¾\u0010ö\u0087Q(Õ\u000e }G%\u001bËúñ\u0086\u0006\fÙb¬F×BUÚ·-\u001eâWD_\u0091Ï\u008eG\rø\u0019ÍÇM\\{\u0010]F\u001bâ6\u001f\u0000î\u009bê§:g¾\u0098ä\u0010Í\u0017¼±ühÿ¢\u000eÝ\r\u009cm`s\u0096\u0010\u0015T\\q¶·n3i\f5\u0082·å^\u0011 @'½|ñ\u0013¹\u0004ã¨ùÖ£'s½Oí¡+\u0086¬9¹\bÜ\u009f¦MÃ3\u008f\u0018\u0096y\u0018¸\u0016µp%\u0015J\u008fÀ\"\u0081\u0019\u008f\u0002¹ýIõ¶\t± Y*~õ¸É¿\u0089\u0001!´ßÿIÚJ2^¶y\u0017\u0089m\u0015Ê¸ï\u008c@©\u00043@`\u0084BÆûØu\u0086¯\u0012ek\u0006\u0096=\u0085\u0017\u0096³;ðÏ{¥h\u0000G æI>ç©ºÏ\u0006\u009a¶ï®öø\u0090Cnp=\u0083h\u0016\u0001(!Êh&ÖhÔÐ¶<µh a¬/\u0091àºÄ\u007fÍx¦E\u0011Tí¹üèb\u0093d(\u0086ÿ¤ \u0000\u0097Þs\u0085Ù\u0010ÄðìsÜZ_\u0085\u0088-³Yü(6B\u0010\u0006H}$\u008cúýTÜ;¦}¤¹nñ\u0018vJ\u0090\u0088ÌÞ\u0013¨wµ\u0014·*6_\u0000KØêQ+-§\u008b \u00adp#»tk9¬\u0098|ÈAI«,\u0019,Q§NÜF¾1\u009c/\u0098=e\u008cLÁ(\u0000¬i\u000ehW\u0014X\u0094ÈmL¸\"5M+-û\u0005\u009dìTVÁ?\u009fÊùÇ\u0016¶-ßîÛ·ãËj\u0010M=Ë\u000e\u008bR7\u001dcm/¯ãN)\u000e w\u0094ÏweÌ\u001eOìè3;´u\u0083;\u009c\u008f\u0007|o\u0088H³vE3Ñ\u0083øx(\u0010§9\u0083\u0007²~\u008d\u008c\\s L\u008b\u0099W\u0003\u0010\u0089AÄÆÎ\u0093§\u008btÙªú0þû+\u0018ÈñR\u0087\u0003Cky¤ôJr\u0084\t&ô\u001f\u001eòG F¤Ê\u0018\u001c\fálnÒ\u007fÞ\u001càÛîK\u00001\u0013k\u009bD54\u008b<k\u0018i\u0096á>)Î\tV\u00921$\u008b¯CHadh\u0084Ú\u009cinÓ\u0018!1Ú>ÝRYÇ\u0016\u0010\u00ad\f\u001dZ>l\u0014\u0083N\u0093èøí« V°¯&I,ñ\u009c\u0013Rý|9_\n\u0099c\u0083¸Ù^¶\b\\¯!Q\u0080\u0011\u0090\u001f\u0011(\u0094Üü\u0014\u001a\u00806ý¿drðáât7ö\u009cb÷\u0003\u008a!\u0098g\u009dÝi\u0093T^X\u0090¤Uñï?.å\u0010Mt\"¨ü¡Fì\"Ç\u0087e\tdBR\u0010Kþf\u0000n\u0096/¶\u0086FßQræ<j(Kö§W\u009fZw\u001em}4Á¾\u0080\u0087<ÁkÏ\u0098ÐÕ¡a\u0084úºÉBÚRîL4\tqtõ\u009cM(ð\u0019Ã\u0000óÄsù\u0080\u0002Ü®\u001fKå<\u0013-Ñ4üùÖ®¶ð9\u0019#ZÛ\u0087à\u0006Têq\u008fy\u0003\u0010pþ\u0011¾â®5\u0090IÆ\u009e\u009fJ\u0098@Þ Ôôç+\u00ad¡\"\u001d'\u0018JqyÜÒ×\u008bÚ\u00adÕîo9¯a\u009a±ó\u0018é\u0010ã ºjëÊA/\u001csj']N¯\u0092Âsá\u008dÙ\u0017\u00ad\u0085j\u000f\u000f\u0082\u0098&\u0004\u0010þæ m\u009f\u007f\u0088¼uù¾oÿòöÂ\u0002¨\u0091\b\u008aÎ\u0083AÝ]\u008djÖ\u009f[Vm\u00066 Õ\u009dGZjÁ(\u0082Z\u001b\bÈ`\u0096Þ:Ñ\u0013T\u00878\u009c\u009c2\u00175HVa\u001cÛ[(î$Ù\u0082C¦TE\u001a\u0016\u0000\\\u008c!2Ä\u0099\u0085'\u0004Þ\u009898R/\u0000°\u0003\rµ,£ªë \u0006ì}Ì\u0010\u0097ðbÞ\"\u000eî`Nn¼$®³Ö\u000b(>\u0098ã\u0092æbY#\u0007Ó!Éü\u0006/×?}±W²£\u009d\u008b*q\u0085\u007f\u0093\u0087\u009fÆ.Ö¶n1õÁ\u0015\u0010\u0087eÛaÁ\u000eÞç\u001d¯¹¥\u008bÓ\\i\u0010\u0099\u0088Î¬?\u001bOÄ\u0006\u0001\u001c2µ;\u008aW\u0010_¥`¶\u0096\u009an\u0089\u001cý\u009c\u0003on\u0090¦\u0018\u000f\u009c\u0097r!\u0016_\u0097\"L\u0080ý\u008dXAºr\u0095ss3\u007fµ=0\u00888ïcC{Iý<AÆ;®ÿ\u0006Ð\u009dÂ\u000e)¦^;RhÒ8âktÆ\u0094åo¦tà5\u001fc\u0005*ÏR\u0085>u¨(Ú\u0014\u0086ÕÐ\u0092ú\u0089Á[ý\u009du\u0094.à%L\u0097\u0006UË¥ç8ó°\u0092§\u008bÃAËjzGãûoò";
      int var8 = "1v#\u0094]\u0089íò+Yé\u009cíú>¨\u0010µ~\u0082ý\u009dÎû\u0090FFºØ\u008f\u0080³Ò\u0010\u0013ç\u0004\u008a·\u009bVó\u0010s\"\u000e©®TÐ\u0010\u0004£öÒí\u001eð\u000fq¹ÿ\u001c³Y\u001bV8Ê\u0086ùËVQN³mëxÄ_5Mh1\"l\u0095ùH¶*\u008e×G_Á\u001f\u0014bB\u001dÿk\u008e¡SÐ\u0096\u000b§Bï9\u00902½HÞ&[h®k \u009fãR\u0002Î@39¦¡ûÎ÷Fgv90êë\u0096\u0000%_\u0015¹û9JÜkÓ àsóY.¦,ÔïPy \u0089êt\u001f\u0089\u0083[@Û\u0017°\u000f=)\u0013ºíIN\u001b0çy¾óALØ \u0090×¨8³Ã\u0004ø\u009f\\\u0092\u009eá§\u001cÞ.Y\u0006ÄmÃ\u008c1Ú\u0085Í÷ZµC»%ñ:\u0010%Áú\u0010 \u0090ò$Ò¼¬h,\u00ad\u0085\"\u008dÆ \u0096Dëú/Z«\u0005ú\u0011«\u007fq±EíUa\u0018]*#\u009aô ÃÍ\u0099ûçûiå\u009aS¶\u000fe'möG\u0007\u0010©H7\b.Âºæ¢ã\u0095\u0098\u0086\u009c¶× 3B\u008fRd]\u001b\u0018?VdQo¤0®\u0015$Æ÷~lÏ>¼N\u008d\r\u00901m+ p<\u0092ýñRW¦\u00114\u001d5\nU.oFOÌü»K\u0014À\u0005Y«¡è3\u0011V\u0010~j³:v\u007fVâZå\u0014\u0005býµ, À\u0096\u000f@?\u0096ü\u007ff\u0080&¼\u0001\u001f¼ÂÓZ\u000en\u00ad×é#\u0010N\u0081\u000eÃ\u008e¾z(ÑR\u0084WYòÆö\u000füÎ¢p\u0004>\u008cÎ{ÁKì\u008c\u0084×£4§ä¡|Êû}ÎÄîÜ°Øa Wâj\u00adî7ª\u001aâH|äÏd!ÒÌPq\u0099\n¬\u0085Ö½.Àq´\u0002¹i8\u0090qzíßÁ@Àÿ«p½ÍU¢£Üïj[îñÀ'\u008e¿v-On·Ôá¶úwWa\u0010þµ¿F,÷û5P;¦\u001d©=Äç.(¯\u001b\u0080;;=Àí\u000f\u008fÅ\u001fÏN¬'»gÛ\r_ðJb\u0011ñ²]\u0092±\u0002\u0017Ò]\u001b/.±]«\u0010áþ#\u009a[\u0007ü²ÝÞ%¡ÔòB\u009cPZ\u008b/vUþ_B\u0019Û@\u0013&\u0001`ÝgÝ\n@ ËcU\u008177|\u0017°ùÃ<\"?i\u0098Á\u008d;ùT-Ò\u0010£iÿá\u0089tz\u0095èÑ\u009dí¾ù\u008eó°\f\u0094Wï[\tHÕY\u007f Ö\u0088\u00ad\u0085ÚLÑ(\u008d\u009b\u0016ç\u009eU_B¥\u0090µ}\u0016½\u0097Ô¤ç~Có\u0090\u0016\u008a¹:³2\nC«Q\u0015lÿ,SÕùÇ »£ý\u0096y\u0010<r`â$ôìk[õÁ\u008aähÐ\u0002\u0014ðhcºÞÝÀ]H\u0010ïæÅá¬\u001aûÏ£û\u009dÊCttê\u0010$Î\u0084`¶¯¨\u0000ÉQ+v-\u0085\u0085\u0081(\u0083hr\u0019\u009b\u0084Å~WÃ\u0003Qõ\u009a[÷NLÿô\u0081T\n¦cüa\u0018õr\u0012P¹Éo¾\u0010ö\u0087Q(Õ\u000e }G%\u001bËúñ\u0086\u0006\fÙb¬F×BUÚ·-\u001eâWD_\u0091Ï\u008eG\rø\u0019ÍÇM\\{\u0010]F\u001bâ6\u001f\u0000î\u009bê§:g¾\u0098ä\u0010Í\u0017¼±ühÿ¢\u000eÝ\r\u009cm`s\u0096\u0010\u0015T\\q¶·n3i\f5\u0082·å^\u0011 @'½|ñ\u0013¹\u0004ã¨ùÖ£'s½Oí¡+\u0086¬9¹\bÜ\u009f¦MÃ3\u008f\u0018\u0096y\u0018¸\u0016µp%\u0015J\u008fÀ\"\u0081\u0019\u008f\u0002¹ýIõ¶\t± Y*~õ¸É¿\u0089\u0001!´ßÿIÚJ2^¶y\u0017\u0089m\u0015Ê¸ï\u008c@©\u00043@`\u0084BÆûØu\u0086¯\u0012ek\u0006\u0096=\u0085\u0017\u0096³;ðÏ{¥h\u0000G æI>ç©ºÏ\u0006\u009a¶ï®öø\u0090Cnp=\u0083h\u0016\u0001(!Êh&ÖhÔÐ¶<µh a¬/\u0091àºÄ\u007fÍx¦E\u0011Tí¹üèb\u0093d(\u0086ÿ¤ \u0000\u0097Þs\u0085Ù\u0010ÄðìsÜZ_\u0085\u0088-³Yü(6B\u0010\u0006H}$\u008cúýTÜ;¦}¤¹nñ\u0018vJ\u0090\u0088ÌÞ\u0013¨wµ\u0014·*6_\u0000KØêQ+-§\u008b \u00adp#»tk9¬\u0098|ÈAI«,\u0019,Q§NÜF¾1\u009c/\u0098=e\u008cLÁ(\u0000¬i\u000ehW\u0014X\u0094ÈmL¸\"5M+-û\u0005\u009dìTVÁ?\u009fÊùÇ\u0016¶-ßîÛ·ãËj\u0010M=Ë\u000e\u008bR7\u001dcm/¯ãN)\u000e w\u0094ÏweÌ\u001eOìè3;´u\u0083;\u009c\u008f\u0007|o\u0088H³vE3Ñ\u0083øx(\u0010§9\u0083\u0007²~\u008d\u008c\\s L\u008b\u0099W\u0003\u0010\u0089AÄÆÎ\u0093§\u008btÙªú0þû+\u0018ÈñR\u0087\u0003Cky¤ôJr\u0084\t&ô\u001f\u001eòG F¤Ê\u0018\u001c\fálnÒ\u007fÞ\u001càÛîK\u00001\u0013k\u009bD54\u008b<k\u0018i\u0096á>)Î\tV\u00921$\u008b¯CHadh\u0084Ú\u009cinÓ\u0018!1Ú>ÝRYÇ\u0016\u0010\u00ad\f\u001dZ>l\u0014\u0083N\u0093èøí« V°¯&I,ñ\u009c\u0013Rý|9_\n\u0099c\u0083¸Ù^¶\b\\¯!Q\u0080\u0011\u0090\u001f\u0011(\u0094Üü\u0014\u001a\u00806ý¿drðáât7ö\u009cb÷\u0003\u008a!\u0098g\u009dÝi\u0093T^X\u0090¤Uñï?.å\u0010Mt\"¨ü¡Fì\"Ç\u0087e\tdBR\u0010Kþf\u0000n\u0096/¶\u0086FßQræ<j(Kö§W\u009fZw\u001em}4Á¾\u0080\u0087<ÁkÏ\u0098ÐÕ¡a\u0084úºÉBÚRîL4\tqtõ\u009cM(ð\u0019Ã\u0000óÄsù\u0080\u0002Ü®\u001fKå<\u0013-Ñ4üùÖ®¶ð9\u0019#ZÛ\u0087à\u0006Têq\u008fy\u0003\u0010pþ\u0011¾â®5\u0090IÆ\u009e\u009fJ\u0098@Þ Ôôç+\u00ad¡\"\u001d'\u0018JqyÜÒ×\u008bÚ\u00adÕîo9¯a\u009a±ó\u0018é\u0010ã ºjëÊA/\u001csj']N¯\u0092Âsá\u008dÙ\u0017\u00ad\u0085j\u000f\u000f\u0082\u0098&\u0004\u0010þæ m\u009f\u007f\u0088¼uù¾oÿòöÂ\u0002¨\u0091\b\u008aÎ\u0083AÝ]\u008djÖ\u009f[Vm\u00066 Õ\u009dGZjÁ(\u0082Z\u001b\bÈ`\u0096Þ:Ñ\u0013T\u00878\u009c\u009c2\u00175HVa\u001cÛ[(î$Ù\u0082C¦TE\u001a\u0016\u0000\\\u008c!2Ä\u0099\u0085'\u0004Þ\u009898R/\u0000°\u0003\rµ,£ªë \u0006ì}Ì\u0010\u0097ðbÞ\"\u000eî`Nn¼$®³Ö\u000b(>\u0098ã\u0092æbY#\u0007Ó!Éü\u0006/×?}±W²£\u009d\u008b*q\u0085\u007f\u0093\u0087\u009fÆ.Ö¶n1õÁ\u0015\u0010\u0087eÛaÁ\u000eÞç\u001d¯¹¥\u008bÓ\\i\u0010\u0099\u0088Î¬?\u001bOÄ\u0006\u0001\u001c2µ;\u008aW\u0010_¥`¶\u0096\u009an\u0089\u001cý\u009c\u0003on\u0090¦\u0018\u000f\u009c\u0097r!\u0016_\u0097\"L\u0080ý\u008dXAºr\u0095ss3\u007fµ=0\u00888ïcC{Iý<AÆ;®ÿ\u0006Ð\u009dÂ\u000e)¦^;RhÒ8âktÆ\u0094åo¦tà5\u001fc\u0005*ÏR\u0085>u¨(Ú\u0014\u0086ÕÐ\u0092ú\u0089Á[ý\u009du\u0094.à%L\u0097\u0006UË¥ç8ó°\u0092§\u008bÃAËjzGãûoò"
         .length();
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
                     j = var9;
                     k = new String[70];
                     lin = new nh4(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
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

                  var6 = "P\u008b4Q\u0011³r\u0000®pãbâç3Ðö\u008a¥\u0092\u0086},u8¾°ãp®O\u009c\u0016;\u009bÞ{\u000f$C\u0018\t\u0091²Kúåå\u008aÇ\u0086äËöçËkYÔQ»ã£EÍ";
                  var8 = "P\u008b4Q\u0011³r\u0000®pãbâç3Ðö\u008a¥\u0092\u0086},u8¾°ãp®O\u009c\u0016;\u009bÞ{\u000f$C\u0018\t\u0091²Kúåå\u008aÇ\u0086äËöçËkYÔQ»ã£EÍ"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   public static void b(i2h[] var0) {
      a = var0;
   }

   public static i2h[] b() {
      return a;
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27635;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("i2h", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("i2h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
