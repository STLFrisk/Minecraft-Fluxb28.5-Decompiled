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

public class ysf extends dms implements a7q, mbf {
   private int ty1;
   private boolean qrw;
   private boolean xac;
   public j7z omu;
   private ha9 jcl;
   private skn tx9;
   private int xya;
   private boolean tvr;
   private boolean ho4;
   private int op8;
   private String r9d;
   private int se7;
   private int jpo;
   private boolean bee;
   private boolean s97;
   private goq rxe;
   private static final ysf$rj4[][][][] js3;
   private static final long c;
   private static final String[] g;
   private static final String[] h;
   private static final Map v = new HashMap(13);

   public ysf(t9d var1) {
      this(var1, 0);
   }

   public ysf(t9d var1, int var2) {
      long var3 = c ^ 1140519319095L;
      super(var1);
      this.rxe = new goq(e<"y">(13317, 8671250513433120760L ^ var3), false, 8);
      this.nx9(var2);
      this.yxc(0.6F, 1.8F);
      ((zvv)this.zq2()).w2o(true);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(1, new ccm(this, we7.class, 8.0F, 0.6, 0.6));
      this.r1d.tn8(1, new yy5(this));
      this.r1d.tn8(1, new ga_(this));
      this.r1d.tn8(2, new o4j(this));
      this.r1d.tn8(3, new p8d(this));
      this.r1d.tn8(4, new ysc(this, true));
      this.r1d.tn8(5, new rap(this, 0.6));
      this.r1d.tn8(6, new enc(this));
      this.r1d.tn8(7, new zzo(this));
      this.r1d.tn8(9, new ugj(this, ha9.class, 3.0F, 1.0F));
      this.r1d.tn8(9, new lu_(this));
      this.r1d.tn8(9, new _tb(this, 0.6));
      this.r1d.tn8(10, new bdq(this, yqv.class, 8.0F));
      this.onk(true);
   }

   private void x3o() {
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
      // 05: getfield ysf.s97 Z
      // 08: iload 1
      // 09: ifne 26
      // 0c: ifne 80
      // 0f: goto 16
      // 12: invokestatic ysf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 1
      // 18: putfield ysf.s97 Z
      // 1b: aload 0
      // 1c: invokevirtual ysf.ejl ()Z
      // 1f: goto 26
      // 22: invokestatic ysf.a (Loov;)Loov;
      // 25: athrow
      // 26: iload 1
      // 27: ifne 69
      // 2a: ifeq 53
      // 2d: goto 34
      // 30: invokestatic ysf.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getfield ysf.r1d Ldak;
      // 38: bipush 8
      // 3a: new qig
      // 3d: dup
      // 3e: aload 0
      // 3f: ldc2_w 0.32
      // 42: invokespecial qig.<init> (Lysf;D)V
      // 45: invokevirtual dak.tn8 (ILcjm;)V
      // 48: iload 1
      // 49: ifeq 80
      // 4c: goto 53
      // 4f: invokestatic ysf.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: iload 1
      // 55: ifne 6d
      // 58: goto 5f
      // 5b: invokestatic ysf.a (Loov;)Loov;
      // 5e: athrow
      // 5f: invokevirtual ysf.y6a ()I
      // 62: goto 69
      // 65: invokestatic ysf.a (Loov;)Loov;
      // 68: athrow
      // 69: ifne 80
      // 6c: aload 0
      // 6d: getfield ysf.r1d Ldak;
      // 70: bipush 6
      // 72: new ldf
      // 75: dup
      // 76: aload 0
      // 77: ldc2_w 0.6
      // 7a: invokespecial ldf.<init> (Lysf;D)V
      // 7d: invokevirtual dak.tn8 (ILcjm;)V
      // 80: return
   }

   @Override
   public void qkm() {
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
      // 06: ifeq 32
      // 09: invokevirtual ysf.y6a ()I
      // 0c: ifne 31
      // 0f: goto 16
      // 12: invokestatic ysf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ysf.r1d Ldak;
      // 1a: bipush 8
      // 1c: new ldf
      // 1f: dup
      // 20: aload 0
      // 21: ldc2_w 0.6
      // 24: invokespecial ldf.<init> (Lysf;D)V
      // 27: invokevirtual dak.tn8 (ILcjm;)V
      // 2a: goto 31
      // 2d: invokestatic ysf.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: invokespecial dms.qkm ()V
      // 35: return
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.w7i).zf7(0.5);
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: dup
      // 006: getfield ysf.ty1 I
      // 009: bipush 1
      // 00a: isub
      // 00b: dup_x1
      // 00c: putfield ysf.ty1 I
      // 00f: iload 1
      // 010: ifne 0c7
      // 013: ifgt 0b8
      // 016: goto 01d
      // 019: invokestatic ysf.a (Loov;)Loov;
      // 01c: athrow
      // 01d: new mew
      // 020: dup
      // 021: aload 0
      // 022: invokespecial mew.<init> (Li2h;)V
      // 025: astore 2
      // 026: aload 0
      // 027: getfield ysf.oay Lt9d;
      // 02a: invokevirtual t9d.hd9 ()Lbg8;
      // 02d: aload 2
      // 02e: invokevirtual bg8.bgl (Lmew;)V
      // 031: aload 0
      // 032: bipush 70
      // 034: aload 0
      // 035: getfield ysf.z2d Ljava/util/Random;
      // 038: bipush 50
      // 03a: invokevirtual java/util/Random.nextInt (I)I
      // 03d: iadd
      // 03e: putfield ysf.ty1 I
      // 041: aload 0
      // 042: aload 0
      // 043: getfield ysf.oay Lt9d;
      // 046: invokevirtual t9d.hd9 ()Lbg8;
      // 049: aload 2
      // 04a: bipush 32
      // 04c: invokevirtual bg8.pom (Lmew;I)Lj7z;
      // 04f: putfield ysf.omu Lj7z;
      // 052: aload 0
      // 053: getfield ysf.omu Lj7z;
      // 056: iload 1
      // 057: ifne 07e
      // 05a: ifnonnull 073
      // 05d: goto 064
      // 060: invokestatic ysf.a (Loov;)Loov;
      // 063: athrow
      // 064: aload 0
      // 065: invokevirtual ysf.u_7 ()V
      // 068: iload 1
      // 069: ifeq 0b8
      // 06c: goto 073
      // 06f: invokestatic ysf.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield ysf.omu Lj7z;
      // 077: goto 07e
      // 07a: invokestatic ysf.a (Loov;)Loov;
      // 07d: athrow
      // 07e: invokevirtual j7z.n0h ()Lmew;
      // 081: astore 3
      // 082: aload 0
      // 083: aload 3
      // 084: aload 0
      // 085: getfield ysf.omu Lj7z;
      // 088: invokevirtual j7z.hk4 ()I
      // 08b: i2f
      // 08c: fconst_1
      // 08d: fmul
      // 08e: f2i
      // 08f: invokevirtual ysf.muf (Lmew;I)V
      // 092: aload 0
      // 093: getfield ysf.bee Z
      // 096: iload 1
      // 097: ifne 0c7
      // 09a: ifeq 0b8
      // 09d: goto 0a4
      // 0a0: invokestatic ysf.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: bipush 0
      // 0a6: putfield ysf.bee Z
      // 0a9: aload 0
      // 0aa: getfield ysf.omu Lj7z;
      // 0ad: bipush 5
      // 0ae: invokevirtual j7z.mjt (I)V
      // 0b1: goto 0b8
      // 0b4: invokestatic ysf.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: iload 1
      // 0ba: ifne 1dc
      // 0bd: invokevirtual ysf.qc9 ()Z
      // 0c0: goto 0c7
      // 0c3: invokestatic ysf.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: ifne 1db
      // 0ca: aload 0
      // 0cb: iload 1
      // 0cc: ifne 1dc
      // 0cf: goto 0d6
      // 0d2: invokestatic ysf.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: getfield ysf.xya I
      // 0d9: ifle 1db
      // 0dc: goto 0e3
      // 0df: invokestatic ysf.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: dup
      // 0e5: getfield ysf.xya I
      // 0e8: bipush 1
      // 0e9: isub
      // 0ea: putfield ysf.xya I
      // 0ed: aload 0
      // 0ee: iload 1
      // 0ef: ifne 1dc
      // 0f2: goto 0f9
      // 0f5: invokestatic ysf.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: getfield ysf.xya I
      // 0fc: ifgt 1db
      // 0ff: goto 106
      // 102: invokestatic ysf.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: iload 1
      // 108: ifne 1c7
      // 10b: goto 112
      // 10e: invokestatic ysf.a (Loov;)Loov;
      // 111: athrow
      // 112: getfield ysf.tvr Z
      // 115: ifeq 1c6
      // 118: goto 11f
      // 11b: invokestatic ysf.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield ysf.tx9 Lskn;
      // 123: invokevirtual skn.iterator ()Ljava/util/Iterator;
      // 126: astore 2
      // 127: aload 2
      // 128: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12d: ifeq 174
      // 130: aload 2
      // 131: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 136: checkcast xxb
      // 139: astore 3
      // 13a: aload 3
      // 13b: iload 1
      // 13c: ifne 158
      // 13f: invokevirtual xxb.f_e ()Z
      // 142: iload 1
      // 143: ifne 1c5
      // 146: goto 14d
      // 149: invokestatic ysf.a (Loov;)Loov;
      // 14c: athrow
      // 14d: ifeq 170
      // 150: goto 157
      // 153: invokestatic ysf.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 3
      // 158: aload 0
      // 159: getfield ysf.z2d Ljava/util/Random;
      // 15c: bipush 6
      // 15e: invokevirtual java/util/Random.nextInt (I)I
      // 161: aload 0
      // 162: getfield ysf.z2d Ljava/util/Random;
      // 165: bipush 6
      // 167: invokevirtual java/util/Random.nextInt (I)I
      // 16a: iadd
      // 16b: bipush 2
      // 16c: iadd
      // 16d: invokevirtual xxb.a04 (I)V
      // 170: iload 1
      // 171: ifeq 127
      // 174: aload 0
      // 175: invokespecial ysf.k2h ()V
      // 178: aload 0
      // 179: bipush 0
      // 17a: putfield ysf.tvr Z
      // 17d: aload 0
      // 17e: iload 1
      // 17f: ifne 1c7
      // 182: getfield ysf.omu Lj7z;
      // 185: ifnull 1c6
      // 188: goto 18f
      // 18b: invokestatic ysf.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: iload 1
      // 191: ifne 1c7
      // 194: goto 19b
      // 197: invokestatic ysf.a (Loov;)Loov;
      // 19a: athrow
      // 19b: getfield ysf.r9d Ljava/lang/String;
      // 19e: ifnull 1c6
      // 1a1: goto 1a8
      // 1a4: invokestatic ysf.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: getfield ysf.oay Lt9d;
      // 1ac: aload 0
      // 1ad: bipush 14
      // 1af: invokevirtual t9d.qyn (Li2h;B)V
      // 1b2: aload 0
      // 1b3: getfield ysf.omu Lj7z;
      // 1b6: aload 0
      // 1b7: getfield ysf.r9d Ljava/lang/String;
      // 1ba: bipush 1
      // 1bb: invokevirtual j7z.ec4 (Ljava/lang/String;I)I
      // 1be: goto 1c5
      // 1c1: invokestatic ysf.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: pop
      // 1c6: aload 0
      // 1c7: new sdj
      // 1ca: dup
      // 1cb: getstatic mcs.kkg Lmcs;
      // 1ce: getfield mcs.zr9 I
      // 1d1: sipush 200
      // 1d4: bipush 0
      // 1d5: invokespecial sdj.<init> (III)V
      // 1d8: invokevirtual ysf.gmn (Lsdj;)V
      // 1db: aload 0
      // 1dc: invokespecial dms.qar ()V
      // 1df: return
   }

   @Override
   public boolean hp6(ha9 param1) {
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
      // 05: getfield ha9.up_ Ljnq;
      // 08: invokevirtual jnq.dxs ()Lerg;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: iload 2
      // 0e: ifeq 1c
      // 11: ifnull 2d
      // 14: goto 1b
      // 17: invokestatic ysf.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: getstatic xbr.pb_ Lu7m;
      // 22: if_acmpne 2d
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic ysf.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: istore 4
      // 30: iload 4
      // 32: iload 2
      // 33: ifeq f4
      // 36: ifne ef
      // 39: goto 40
      // 3c: invokestatic ysf.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: invokevirtual ysf.gzr ()Z
      // 44: iload 2
      // 45: ifeq f4
      // 48: goto 4f
      // 4b: invokestatic ysf.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifeq ef
      // 52: goto 59
      // 55: invokestatic ysf.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: invokevirtual ysf.qc9 ()Z
      // 5d: iload 2
      // 5e: ifeq f4
      // 61: goto 68
      // 64: invokestatic ysf.a (Loov;)Loov;
      // 67: athrow
      // 68: ifne ef
      // 6b: goto 72
      // 6e: invokestatic ysf.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: invokevirtual ysf.ejl ()Z
      // 76: iload 2
      // 77: ifeq f4
      // 7a: goto 81
      // 7d: invokestatic ysf.a (Loov;)Loov;
      // 80: athrow
      // 81: ifne ef
      // 84: goto 8b
      // 87: invokestatic ysf.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield ysf.oay Lt9d;
      // 8f: getfield t9d.v0f Z
      // 92: iload 2
      // 93: ifeq ee
      // 96: goto 9d
      // 99: invokestatic ysf.a (Loov;)Loov;
      // 9c: athrow
      // 9d: ifne e6
      // a0: goto a7
      // a3: invokestatic ysf.a (Loov;)Loov;
      // a6: athrow
      // a7: aload 0
      // a8: iload 2
      // a9: ifeq dd
      // ac: goto b3
      // af: invokestatic ysf.a (Loov;)Loov;
      // b2: athrow
      // b3: getfield ysf.tx9 Lskn;
      // b6: ifnull dc
      // b9: goto c0
      // bc: invokestatic ysf.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: getfield ysf.tx9 Lskn;
      // c4: invokevirtual skn.size ()I
      // c7: iload 2
      // c8: ifeq ee
      // cb: goto d2
      // ce: invokestatic ysf.a (Loov;)Loov;
      // d1: athrow
      // d2: ifle e6
      // d5: goto dc
      // d8: invokestatic ysf.a (Loov;)Loov;
      // db: athrow
      // dc: aload 0
      // dd: aload 1
      // de: invokevirtual ysf.i2a (Lha9;)V
      // e1: aload 1
      // e2: aload 0
      // e3: invokevirtual ha9.vhi (La7q;)V
      // e6: aload 1
      // e7: getstatic l9p.a17 L_ss;
      // ea: invokevirtual ha9.aex (L_ss;)V
      // ed: bipush 1
      // ee: ireturn
      // ef: aload 0
      // f0: aload 1
      // f1: invokespecial dms.hp6 (Lha9;)Z
      // f4: ireturn
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, 0);
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
      // 000: getstatic ysf.c J
      // 003: ldc2_w 137698150321647
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial dms.srs (Lbdo;)V
      // 00d: invokestatic t9d.c ()I
      // 010: aload 1
      // 011: sipush 6707
      // 014: ldc2_w 7416719508971182615
      // 017: lload 2
      // 018: lxor
      // 019: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: nop
      // 01f: aload 0
      // 020: invokevirtual ysf.y6a ()I
      // 023: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 026: istore 4
      // 028: aload 1
      // 029: sipush 18237
      // 02c: ldc2_w 1774523057737762588
      // 02f: lload 2
      // 030: lxor
      // 031: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036: nop
      // 037: aload 0
      // 038: getfield ysf.op8 I
      // 03b: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 03e: aload 1
      // 03f: sipush 8730
      // 042: ldc2_w 4133203081020269097
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: aload 0
      // 04e: getfield ysf.se7 I
      // 051: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 054: aload 1
      // 055: sipush 31852
      // 058: ldc2_w 6995602697973414980
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: aload 0
      // 064: getfield ysf.jpo I
      // 067: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 06a: aload 1
      // 06b: sipush 24152
      // 06e: ldc2_w 2734383664094649961
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: aload 0
      // 07a: iload 4
      // 07c: ifne 0aa
      // 07f: getfield ysf.ho4 Z
      // 082: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 085: aload 0
      // 086: getfield ysf.tx9 Lskn;
      // 089: ifnull 0b3
      // 08c: goto 093
      // 08f: invokestatic ysf.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: sipush 20206
      // 097: ldc2_w 2805410911234330316
      // 09a: lload 2
      // 09b: lxor
      // 09c: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: aload 0
      // 0a3: goto 0aa
      // 0a6: invokestatic ysf.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: getfield ysf.tx9 Lskn;
      // 0ad: invokevirtual skn.dmw ()Lbdo;
      // 0b0: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 0b3: new qhg
      // 0b6: dup
      // 0b7: invokespecial qhg.<init> ()V
      // 0ba: astore 5
      // 0bc: bipush 0
      // 0bd: istore 6
      // 0bf: iload 6
      // 0c1: aload 0
      // 0c2: getfield ysf.rxe Lgoq;
      // 0c5: invokevirtual goq.opt ()I
      // 0c8: if_icmpge 113
      // 0cb: aload 0
      // 0cc: getfield ysf.rxe Lgoq;
      // 0cf: iload 6
      // 0d1: invokevirtual goq.ibn (I)Lerg;
      // 0d4: astore 7
      // 0d6: iload 4
      // 0d8: ifne 127
      // 0db: iload 4
      // 0dd: ifne 10e
      // 0e0: goto 0e7
      // 0e3: invokestatic ysf.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 7
      // 0e9: ifnull 10b
      // 0ec: goto 0f3
      // 0ef: invokestatic ysf.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 5
      // 0f5: aload 7
      // 0f7: new bdo
      // 0fa: dup
      // 0fb: invokespecial bdo.<init> ()V
      // 0fe: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 101: invokevirtual qhg.w2j (Lgdw;)V
      // 104: goto 10b
      // 107: invokestatic ysf.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iinc 6 1
      // 10e: iload 4
      // 110: ifeq 0bf
      // 113: aload 1
      // 114: sipush 4314
      // 117: ldc2_w 5421926314378055896
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: nop
      // 122: aload 5
      // 124: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 127: return
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
      // 000: getstatic ysf.c J
      // 003: ldc2_w 12722163507524
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial dms.cjb (Lbdo;)V
      // 00d: invokestatic t9d.c ()I
      // 010: aload 0
      // 011: aload 1
      // 012: sipush 28578
      // 015: ldc2_w 426492052138214181
      // 018: lload 2
      // 019: lxor
      // 01a: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: nop
      // 020: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 023: invokevirtual ysf.nx9 (I)V
      // 026: aload 0
      // 027: aload 1
      // 028: sipush 2221
      // 02b: ldc2_w 2618121261347546162
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 039: putfield ysf.op8 I
      // 03c: istore 4
      // 03e: aload 0
      // 03f: aload 1
      // 040: sipush 9329
      // 043: ldc2_w 6787339397277780208
      // 046: lload 2
      // 047: lxor
      // 048: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: nop
      // 04e: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 051: putfield ysf.se7 I
      // 054: aload 0
      // 055: aload 1
      // 056: sipush 17663
      // 059: ldc2_w 1521258144904833149
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: nop
      // 064: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 067: putfield ysf.jpo I
      // 06a: aload 0
      // 06b: aload 1
      // 06c: sipush 13368
      // 06f: ldc2_w 3872196755307239608
      // 072: lload 2
      // 073: lxor
      // 074: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: nop
      // 07a: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 07d: putfield ysf.ho4 Z
      // 080: aload 1
      // 081: sipush 6246
      // 084: ldc2_w 670895495353840874
      // 087: lload 2
      // 088: lxor
      // 089: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: nop
      // 08f: bipush 10
      // 091: iload 4
      // 093: ifne 0d5
      // 096: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 099: ifeq 0c4
      // 09c: goto 0a3
      // 09f: invokestatic ysf.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 1
      // 0a4: sipush 20206
      // 0a7: ldc2_w 2805360978940650087
      // 0aa: lload 2
      // 0ab: lxor
      // 0ac: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: nop
      // 0b2: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0b5: astore 5
      // 0b7: aload 0
      // 0b8: new skn
      // 0bb: dup
      // 0bc: aload 5
      // 0be: invokespecial skn.<init> (Lbdo;)V
      // 0c1: putfield ysf.tx9 Lskn;
      // 0c4: aload 1
      // 0c5: sipush 4310
      // 0c8: ldc2_w 8700928134727777363
      // 0cb: lload 2
      // 0cc: lxor
      // 0cd: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: nop
      // 0d3: bipush 10
      // 0d5: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 0d8: astore 5
      // 0da: bipush 0
      // 0db: istore 6
      // 0dd: iload 6
      // 0df: aload 5
      // 0e1: invokevirtual qhg.vek ()I
      // 0e4: if_icmpge 129
      // 0e7: aload 5
      // 0e9: iload 6
      // 0eb: invokevirtual qhg.kd6 (I)Lbdo;
      // 0ee: invokestatic erg.qog (Lbdo;)Lerg;
      // 0f1: astore 7
      // 0f3: iload 4
      // 0f5: ifne 132
      // 0f8: iload 4
      // 0fa: ifne 124
      // 0fd: goto 104
      // 100: invokestatic ysf.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 7
      // 106: ifnull 121
      // 109: goto 110
      // 10c: invokestatic ysf.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield ysf.rxe Lgoq;
      // 114: aload 7
      // 116: invokevirtual goq.vd1 (Lerg;)Lerg;
      // 119: pop
      // 11a: goto 121
      // 11d: invokestatic ysf.a (Loov;)Loov;
      // 120: athrow
      // 121: iinc 6 1
      // 124: iload 4
      // 126: ifeq 0dd
      // 129: aload 0
      // 12a: bipush 1
      // 12b: invokevirtual ysf.onk (Z)V
      // 12e: aload 0
      // 12f: invokespecial ysf.x3o ()V
      // 132: return
   }

   @Override
   public boolean kz3() {
      return false;
   }

   @Override
   public String _n1() {
      long var1 = c ^ 136348285613977L;

      try {
         if (this.qc9()) {
            return e<"y">(9102, 1023798877477034447L ^ var1);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return e<"y">(25936, 7104432872874778395L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 112851430160609L;
      return e<"y">(6037, 7455186108939559588L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 98773545619119L;
      return e<"y">(23172, 8213824752857618923L ^ var1);
   }

   public void nx9(int var1) {
      this.oit.c66(16, var1);
   }

   public int y6a() {
      return Math.max(this.oit.zwc(16) % 5, 0);
   }

   public boolean nfm() {
      return this.qrw;
   }

   public void _zd(boolean var1) {
      this.qrw = var1;
   }

   public void wnt(boolean var1) {
      this.xac = var1;
   }

   public boolean _mf() {
      return this.xac;
   }

   @Override
   public void iar(g_3 param1) {
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
      // 06: invokespecial dms.iar (Lg_3;)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 23
      // 0e: getfield ysf.omu Lj7z;
      // 11: ifnull 92
      // 14: goto 1b
      // 17: invokestatic ysf.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: goto 23
      // 1f: invokestatic ysf.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 2
      // 24: ifne 41
      // 27: ifnull 92
      // 2a: goto 31
      // 2d: invokestatic ysf.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield ysf.omu Lj7z;
      // 35: aload 1
      // 36: invokevirtual j7z.yvo (Lg_3;)V
      // 39: aload 1
      // 3a: goto 41
      // 3d: invokestatic ysf.a (Loov;)Loov;
      // 40: athrow
      // 41: instanceof ha9
      // 44: iload 2
      // 45: ifne 53
      // 48: ifeq 92
      // 4b: goto 52
      // 4e: invokestatic ysf.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush -1
      // 53: istore 3
      // 54: aload 0
      // 55: invokevirtual ysf.ejl ()Z
      // 58: iload 2
      // 59: ifne 85
      // 5c: ifeq 69
      // 5f: goto 66
      // 62: invokestatic ysf.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush -3
      // 68: istore 3
      // 69: aload 0
      // 6a: getfield ysf.omu Lj7z;
      // 6d: aload 1
      // 6e: invokevirtual g_3.noc ()Ljava/lang/String;
      // 71: iload 3
      // 72: invokevirtual j7z.ec4 (Ljava/lang/String;I)I
      // 75: pop
      // 76: aload 0
      // 77: iload 2
      // 78: ifne 89
      // 7b: invokevirtual ysf.gzr ()Z
      // 7e: goto 85
      // 81: invokestatic ysf.a (Loov;)Loov;
      // 84: athrow
      // 85: ifeq 92
      // 88: aload 0
      // 89: getfield ysf.oay Lt9d;
      // 8c: aload 0
      // 8d: bipush 13
      // 8f: invokevirtual t9d.qyn (Li2h;B)V
      // 92: return
   }

   @Override
   public void owu(ofh param1) {
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
      // 06: ifne a1
      // 09: getfield ysf.omu Lj7z;
      // 0c: ifnull a0
      // 0f: goto 16
      // 12: invokestatic ysf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual ofh.nra ()Li2h;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 2b
      // 20: ifnull 75
      // 23: goto 2a
      // 26: invokestatic ysf.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 3
      // 2b: instanceof ha9
      // 2e: iload 2
      // 2f: ifne 60
      // 32: ifeq 55
      // 35: goto 3c
      // 38: invokestatic ysf.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield ysf.omu Lj7z;
      // 40: aload 3
      // 41: invokevirtual i2h.noc ()Ljava/lang/String;
      // 44: bipush -2
      // 46: invokevirtual j7z.ec4 (Ljava/lang/String;I)I
      // 49: pop
      // 4a: iload 2
      // 4b: ifeq a0
      // 4e: goto 55
      // 51: invokestatic ysf.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 3
      // 56: instanceof uv0
      // 59: goto 60
      // 5c: invokestatic ysf.a (Loov;)Loov;
      // 5f: athrow
      // 60: ifeq a0
      // 63: aload 0
      // 64: getfield ysf.omu Lj7z;
      // 67: invokevirtual j7z.of2 ()V
      // 6a: iload 2
      // 6b: ifeq a0
      // 6e: goto 75
      // 71: invokestatic ysf.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 0
      // 76: getfield ysf.oay Lt9d;
      // 79: aload 0
      // 7a: ldc2_w 16.0
      // 7d: invokevirtual t9d.a_q (Li2h;D)Lha9;
      // 80: astore 4
      // 82: iload 2
      // 83: ifne a5
      // 86: aload 4
      // 88: ifnull a0
      // 8b: goto 92
      // 8e: invokestatic ysf.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 0
      // 93: getfield ysf.omu Lj7z;
      // 96: invokevirtual j7z.of2 ()V
      // 99: goto a0
      // 9c: invokestatic ysf.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 0
      // a1: aload 1
      // a2: invokespecial dms.owu (Lofh;)V
      // a5: return
   }

   @Override
   public void i2a(ha9 var1) {
      this.jcl = var1;
   }

   @Override
   public ha9 rbk() {
      return this.jcl;
   }

   public boolean qc9() {
      try {
         if (this.jcl != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean b19(boolean param1) {
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
      // 005: getfield ysf.ho4 Z
      // 008: iload 2
      // 009: ifeq 14b
      // 00c: ifne 147
      // 00f: goto 016
      // 012: invokestatic ysf.a (Loov;)Loov;
      // 015: athrow
      // 016: iload 1
      // 017: iload 2
      // 018: ifeq 14b
      // 01b: goto 022
      // 01e: invokestatic ysf.a (Loov;)Loov;
      // 021: athrow
      // 022: ifeq 147
      // 025: goto 02c
      // 028: invokestatic ysf.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokevirtual ysf.yg0 ()Z
      // 030: iload 2
      // 031: ifeq 14b
      // 034: goto 03b
      // 037: invokestatic ysf.a (Loov;)Loov;
      // 03a: athrow
      // 03b: ifeq 147
      // 03e: goto 045
      // 041: invokestatic ysf.a (Loov;)Loov;
      // 044: athrow
      // 045: bipush 0
      // 046: istore 3
      // 047: bipush 0
      // 048: istore 4
      // 04a: iload 4
      // 04c: aload 0
      // 04d: getfield ysf.rxe Lgoq;
      // 050: invokevirtual goq.opt ()I
      // 053: if_icmpge 147
      // 056: aload 0
      // 057: iload 2
      // 058: ifeq 148
      // 05b: getfield ysf.rxe Lgoq;
      // 05e: iload 4
      // 060: invokevirtual goq.ibn (I)Lerg;
      // 063: astore 5
      // 065: aload 5
      // 067: iload 2
      // 068: ifeq 077
      // 06b: ifnull 11b
      // 06e: goto 075
      // 071: invokestatic ysf.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 5
      // 077: invokevirtual erg.gn1 ()Lu7m;
      // 07a: getstatic xbr.nfb Lu7m;
      // 07d: iload 2
      // 07e: ifeq 0d1
      // 081: if_acmpne 0b7
      // 084: goto 08b
      // 087: invokestatic ysf.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 5
      // 08d: iload 2
      // 08e: ifeq 0c0
      // 091: goto 098
      // 094: invokestatic ysf.a (Loov;)Loov;
      // 097: athrow
      // 098: getfield erg.qd2 I
      // 09b: bipush 3
      // 09c: if_icmplt 0b7
      // 09f: goto 0a6
      // 0a2: invokestatic ysf.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: bipush 1
      // 0a7: istore 3
      // 0a8: aload 0
      // 0a9: getfield ysf.rxe Lgoq;
      // 0ac: iload 4
      // 0ae: bipush 3
      // 0af: invokevirtual goq.afc (II)Lerg;
      // 0b2: pop
      // 0b3: iload 2
      // 0b4: ifne 11b
      // 0b7: aload 5
      // 0b9: goto 0c0
      // 0bc: invokestatic ysf.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 2
      // 0c1: ifeq 0fa
      // 0c4: invokevirtual erg.gn1 ()Lu7m;
      // 0c7: getstatic xbr.dzx Lu7m;
      // 0ca: goto 0d1
      // 0cd: invokestatic ysf.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: if_acmpeq 0f1
      // 0d4: aload 5
      // 0d6: iload 2
      // 0d7: ifeq 0fa
      // 0da: goto 0e1
      // 0dd: invokestatic ysf.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: invokevirtual erg.gn1 ()Lu7m;
      // 0e4: getstatic xbr.aar Lu7m;
      // 0e7: if_acmpne 11b
      // 0ea: goto 0f1
      // 0ed: invokestatic ysf.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 5
      // 0f3: goto 0fa
      // 0f6: invokestatic ysf.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: getfield erg.qd2 I
      // 0fd: iload 2
      // 0fe: ifeq 11c
      // 101: bipush 12
      // 103: if_icmplt 11b
      // 106: goto 10d
      // 109: invokestatic ysf.a (Loov;)Loov;
      // 10c: athrow
      // 10d: bipush 1
      // 10e: istore 3
      // 10f: aload 0
      // 110: getfield ysf.rxe Lgoq;
      // 113: iload 4
      // 115: bipush 12
      // 117: invokevirtual goq.afc (II)Lerg;
      // 11a: pop
      // 11b: iload 3
      // 11c: ifeq 139
      // 11f: aload 0
      // 120: getfield ysf.oay Lt9d;
      // 123: aload 0
      // 124: bipush 18
      // 126: invokevirtual t9d.qyn (Li2h;B)V
      // 129: aload 0
      // 12a: bipush 1
      // 12b: putfield ysf.ho4 Z
      // 12e: iload 2
      // 12f: ifne 147
      // 132: goto 139
      // 135: invokestatic ysf.a (Loov;)Loov;
      // 138: athrow
      // 139: iinc 4 1
      // 13c: iload 2
      // 13d: ifne 04a
      // 140: goto 147
      // 143: invokestatic ysf.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 0
      // 148: getfield ysf.ho4 Z
      // 14b: ireturn
   }

   public void dim(boolean var1) {
      this.ho4 = var1;
   }

   @Override
   public void wyy(xxb param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ysf.c J
      // 003: ldc2_w 88551232340093
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: invokevirtual xxb.emv ()V
      // 00c: invokestatic t9d.c ()I
      // 00f: aload 0
      // 010: aload 0
      // 011: invokevirtual ysf.u8h ()I
      // 014: ineg
      // 015: putfield ysf._oz I
      // 018: aload 0
      // 019: sipush 12897
      // 01c: ldc2_w 5468862922754162625
      // 01f: lload 2
      // 020: lxor
      // 021: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: nop
      // 027: aload 0
      // 028: invokevirtual ysf.o23 ()F
      // 02b: aload 0
      // 02c: invokevirtual ysf.b33 ()F
      // 02f: invokevirtual ysf.lhu (Ljava/lang/String;FF)V
      // 032: istore 4
      // 034: bipush 3
      // 035: aload 0
      // 036: getfield ysf.z2d Ljava/util/Random;
      // 039: bipush 4
      // 03a: invokevirtual java/util/Random.nextInt (I)I
      // 03d: iadd
      // 03e: istore 5
      // 040: iload 4
      // 042: ifne 089
      // 045: aload 1
      // 046: invokevirtual xxb.iev ()I
      // 049: bipush 1
      // 04a: if_icmpeq 072
      // 04d: goto 054
      // 050: invokestatic ysf.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: iload 4
      // 057: ifne 08a
      // 05a: goto 061
      // 05d: invokestatic ysf.a (Loov;)Loov;
      // 060: athrow
      // 061: getfield ysf.z2d Ljava/util/Random;
      // 064: bipush 5
      // 065: invokevirtual java/util/Random.nextInt (I)I
      // 068: ifne 0c2
      // 06b: goto 072
      // 06e: invokestatic ysf.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: bipush 40
      // 075: putfield ysf.xya I
      // 078: aload 0
      // 079: bipush 1
      // 07a: putfield ysf.tvr Z
      // 07d: aload 0
      // 07e: bipush 1
      // 07f: putfield ysf.ho4 Z
      // 082: goto 089
      // 085: invokestatic ysf.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 0
      // 08a: iload 4
      // 08c: ifne 0bb
      // 08f: getfield ysf.jcl Lha9;
      // 092: ifnull 0b3
      // 095: goto 09c
      // 098: invokestatic ysf.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 0
      // 09e: getfield ysf.jcl Lha9;
      // 0a1: invokevirtual ha9.noc ()Ljava/lang/String;
      // 0a4: putfield ysf.r9d Ljava/lang/String;
      // 0a7: iload 4
      // 0a9: ifeq 0bf
      // 0ac: goto 0b3
      // 0af: invokestatic ysf.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: goto 0bb
      // 0b7: invokestatic ysf.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aconst_null
      // 0bc: putfield ysf.r9d Ljava/lang/String;
      // 0bf: iinc 5 5
      // 0c2: aload 1
      // 0c3: iload 4
      // 0c5: ifne 0f3
      // 0c8: invokevirtual xxb.k2s ()Lerg;
      // 0cb: invokevirtual erg.gn1 ()Lu7m;
      // 0ce: getstatic xbr.cu7 Lu7m;
      // 0d1: if_acmpne 0f2
      // 0d4: goto 0db
      // 0d7: invokestatic ysf.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: dup
      // 0dd: getfield ysf.op8 I
      // 0e0: aload 1
      // 0e1: invokevirtual xxb.k2s ()Lerg;
      // 0e4: getfield erg.qd2 I
      // 0e7: iadd
      // 0e8: putfield ysf.op8 I
      // 0eb: goto 0f2
      // 0ee: invokestatic ysf.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: invokevirtual xxb.z40 ()Z
      // 0f6: iload 4
      // 0f8: ifne 130
      // 0fb: ifeq 131
      // 0fe: goto 105
      // 101: invokestatic ysf.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: getfield ysf.oay Lt9d;
      // 109: new uno
      // 10c: dup
      // 10d: aload 0
      // 10e: getfield ysf.oay Lt9d;
      // 111: aload 0
      // 112: getfield ysf.o2v D
      // 115: aload 0
      // 116: getfield ysf.kfp D
      // 119: ldc2_w 0.5
      // 11c: dadd
      // 11d: aload 0
      // 11e: getfield ysf.vbd D
      // 121: iload 5
      // 123: invokespecial uno.<init> (Lt9d;DDDI)V
      // 126: invokevirtual t9d.xzq (Li2h;)Z
      // 129: goto 130
      // 12c: invokestatic ysf.a (Loov;)Loov;
      // 12f: athrow
      // 130: pop
      // 131: return
   }

   @Override
   public void uuf(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ysf.c J
      // 03: ldc2_w 24279853190874
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield ysf.oay Lt9d;
      // 11: getfield t9d.v0f Z
      // 14: iload 4
      // 16: ifeq 3a
      // 19: ifne ac
      // 1c: goto 23
      // 1f: invokestatic ysf.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: iload 4
      // 26: ifeq 4d
      // 29: goto 30
      // 2c: invokestatic ysf.a (Loov;)Loov;
      // 2f: athrow
      // 30: getfield ysf._oz I
      // 33: goto 3a
      // 36: invokestatic ysf.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: invokevirtual ysf.u8h ()I
      // 3e: ineg
      // 3f: bipush 20
      // 41: iadd
      // 42: if_icmple ac
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic ysf.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 4
      // 4f: ifeq 93
      // 52: aload 0
      // 53: invokevirtual ysf.u8h ()I
      // 56: ineg
      // 57: putfield ysf._oz I
      // 5a: aload 1
      // 5b: ifnull 8b
      // 5e: goto 65
      // 61: invokestatic ysf.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: sipush 31031
      // 69: ldc2_w 6947770054765673010
      // 6c: lload 2
      // 6d: lxor
      // 6e: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: aload 0
      // 75: invokevirtual ysf.o23 ()F
      // 78: aload 0
      // 79: invokevirtual ysf.b33 ()F
      // 7c: invokevirtual ysf.lhu (Ljava/lang/String;FF)V
      // 7f: iload 4
      // 81: ifne ac
      // 84: goto 8b
      // 87: invokestatic ysf.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: goto 93
      // 8f: invokestatic ysf.a (Loov;)Loov;
      // 92: athrow
      // 93: sipush 12604
      // 96: ldc2_w 5043828373554737714
      // 99: lload 2
      // 9a: lxor
      // 9b: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: nop
      // a1: aload 0
      // a2: invokevirtual ysf.o23 ()F
      // a5: aload 0
      // a6: invokevirtual ysf.b33 ()F
      // a9: invokevirtual ysf.lhu (Ljava/lang/String;FF)V
      // ac: return
   }

   @Override
   public skn zyi(ha9 param1) {
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
      // 05: getfield ysf.tx9 Lskn;
      // 08: iload 2
      // 09: ifne 25
      // 0c: ifnonnull 21
      // 0f: goto 16
      // 12: invokestatic ysf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial ysf.k2h ()V
      // 1a: goto 21
      // 1d: invokestatic ysf.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield ysf.tx9 Lskn;
      // 25: areturn
   }

   private void k2h() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: getstatic ysf.js3 [[[[Lysf$rj4;
      // 07: aload 0
      // 08: invokevirtual ysf.y6a ()I
      // 0b: aaload
      // 0c: astore 2
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifeq 64
      // 12: getfield ysf.se7 I
      // 15: ifeq 4d
      // 18: goto 1f
      // 1b: invokestatic ysf.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifeq 64
      // 24: goto 2b
      // 27: invokestatic ysf.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield ysf.jpo I
      // 2e: ifeq 4d
      // 31: goto 38
      // 34: invokestatic ysf.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: dup
      // 3a: getfield ysf.jpo I
      // 3d: bipush 1
      // 3e: iadd
      // 3f: putfield ysf.jpo I
      // 42: iload 1
      // 43: ifne 68
      // 46: goto 4d
      // 49: invokestatic ysf.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 0
      // 4f: getfield ysf.z2d Ljava/util/Random;
      // 52: aload 2
      // 53: arraylength
      // 54: invokevirtual java/util/Random.nextInt (I)I
      // 57: bipush 1
      // 58: iadd
      // 59: putfield ysf.se7 I
      // 5c: aload 0
      // 5d: goto 64
      // 60: invokestatic ysf.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: putfield ysf.jpo I
      // 68: aload 0
      // 69: iload 1
      // 6a: ifeq 8d
      // 6d: getfield ysf.tx9 Lskn;
      // 70: ifnonnull 8c
      // 73: goto 7a
      // 76: invokestatic ysf.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: new skn
      // 7e: dup
      // 7f: invokespecial skn.<init> ()V
      // 82: putfield ysf.tx9 Lskn;
      // 85: goto 8c
      // 88: invokestatic ysf.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield ysf.se7 I
      // 90: bipush 1
      // 91: isub
      // 92: istore 3
      // 93: aload 0
      // 94: getfield ysf.jpo I
      // 97: bipush 1
      // 98: isub
      // 99: istore 4
      // 9b: aload 2
      // 9c: iload 3
      // 9d: aaload
      // 9e: astore 5
      // a0: iload 4
      // a2: iload 1
      // a3: ifeq b2
      // a6: iflt ef
      // a9: goto b0
      // ac: invokestatic ysf.a (Loov;)Loov;
      // af: athrow
      // b0: iload 4
      // b2: aload 5
      // b4: arraylength
      // b5: if_icmpge ef
      // b8: aload 5
      // ba: iload 4
      // bc: aaload
      // bd: astore 6
      // bf: aload 6
      // c1: astore 7
      // c3: aload 7
      // c5: arraylength
      // c6: istore 8
      // c8: bipush 0
      // c9: istore 9
      // cb: iload 9
      // cd: iload 8
      // cf: if_icmpge ef
      // d2: aload 7
      // d4: iload 9
      // d6: aaload
      // d7: astore 10
      // d9: aload 10
      // db: aload 0
      // dc: getfield ysf.tx9 Lskn;
      // df: aload 0
      // e0: getfield ysf.z2d Ljava/util/Random;
      // e3: invokeinterface ysf$rj4.mu_ (Lskn;Ljava/util/Random;)V 3
      // e8: iinc 9 1
      // eb: iload 1
      // ec: ifne cb
      // ef: return
   }

   @Override
   public void sw4(skn var1) {
   }

   @Override
   public ekw xyw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ysf.c J
      // 003: ldc2_w 17495626626812
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokevirtual ysf.hei ()Ljava/lang/String;
      // 010: astore 4
      // 012: aload 4
      // 014: iload 3
      // 015: ifne 024
      // 018: ifnull 055
      // 01b: goto 022
      // 01e: invokestatic ysf.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 4
      // 024: invokevirtual java/lang/String.length ()I
      // 027: ifle 055
      // 02a: new tao
      // 02d: dup
      // 02e: aload 4
      // 030: invokespecial tao.<init> (Ljava/lang/String;)V
      // 033: astore 5
      // 035: aload 5
      // 037: invokevirtual tao.f4q ()Lpoy;
      // 03a: aload 0
      // 03b: invokevirtual ysf.c7n ()Lxq3;
      // 03e: invokevirtual poy.zn_ (Lxq3;)Lpoy;
      // 041: pop
      // 042: aload 5
      // 044: invokevirtual tao.f4q ()Lpoy;
      // 047: aload 0
      // 048: invokevirtual ysf.b_q ()Ljava/util/UUID;
      // 04b: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 04e: invokevirtual poy.o7m (Ljava/lang/String;)Lpoy;
      // 051: pop
      // 052: aload 5
      // 054: areturn
      // 055: aload 0
      // 056: iload 3
      // 057: ifne 06f
      // 05a: getfield ysf.tx9 Lskn;
      // 05d: ifnonnull 072
      // 060: goto 067
      // 063: invokestatic ysf.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: goto 06f
      // 06b: invokestatic ysf.a (Loov;)Loov;
      // 06e: athrow
      // 06f: invokespecial ysf.k2h ()V
      // 072: aconst_null
      // 073: astore 5
      // 075: aload 0
      // 076: invokevirtual ysf.y6a ()I
      // 079: iload 3
      // 07a: ifne 0af
      // 07d: tableswitch 390 0 4 39 187 206 225 328
      // 0a0: invokestatic ysf.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield ysf.se7 I
      // 0a8: goto 0af
      // 0ab: invokestatic ysf.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: bipush 1
      // 0b0: iload 3
      // 0b1: ifne 0d6
      // 0b4: if_icmpne 0d1
      // 0b7: goto 0be
      // 0ba: invokestatic ysf.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: sipush 10137
      // 0c1: ldc2_w 7843183610865278122
      // 0c4: lload 1
      // 0c5: lxor
      // 0c6: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: astore 5
      // 0ce: goto 203
      // 0d1: aload 0
      // 0d2: getfield ysf.se7 I
      // 0d5: bipush 2
      // 0d6: iload 3
      // 0d7: ifne 0fc
      // 0da: if_icmpne 0f7
      // 0dd: goto 0e4
      // 0e0: invokestatic ysf.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: sipush 551
      // 0e7: ldc2_w 3308175761612667146
      // 0ea: lload 1
      // 0eb: lxor
      // 0ec: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: nop
      // 0f2: astore 5
      // 0f4: goto 203
      // 0f7: aload 0
      // 0f8: getfield ysf.se7 I
      // 0fb: bipush 3
      // 0fc: iload 3
      // 0fd: ifne 122
      // 100: if_icmpne 11d
      // 103: goto 10a
      // 106: invokestatic ysf.a (Loov;)Loov;
      // 109: athrow
      // 10a: sipush 5997
      // 10d: ldc2_w 4578249502201441405
      // 110: lload 1
      // 111: lxor
      // 112: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: nop
      // 118: astore 5
      // 11a: goto 203
      // 11d: aload 0
      // 11e: getfield ysf.se7 I
      // 121: bipush 4
      // 122: if_icmpne 203
      // 125: sipush 19684
      // 128: ldc2_w 8247482046767937487
      // 12b: lload 1
      // 12c: lxor
      // 12d: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: nop
      // 133: astore 5
      // 135: goto 203
      // 138: sipush 32080
      // 13b: ldc2_w 6727445476748166757
      // 13e: lload 1
      // 13f: lxor
      // 140: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: nop
      // 146: astore 5
      // 148: goto 203
      // 14b: sipush 7541
      // 14e: ldc2_w 978940163402851930
      // 151: lload 1
      // 152: lxor
      // 153: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: astore 5
      // 15b: goto 203
      // 15e: aload 0
      // 15f: getfield ysf.se7 I
      // 162: bipush 1
      // 163: iload 3
      // 164: ifne 189
      // 167: if_icmpne 184
      // 16a: goto 171
      // 16d: invokestatic ysf.a (Loov;)Loov;
      // 170: athrow
      // 171: sipush 19788
      // 174: ldc2_w 3513137525146400358
      // 177: lload 1
      // 178: lxor
      // 179: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: nop
      // 17f: astore 5
      // 181: goto 203
      // 184: aload 0
      // 185: getfield ysf.se7 I
      // 188: bipush 2
      // 189: iload 3
      // 18a: ifne 1af
      // 18d: if_icmpne 1aa
      // 190: goto 197
      // 193: invokestatic ysf.a (Loov;)Loov;
      // 196: athrow
      // 197: sipush 22995
      // 19a: ldc2_w 4100598232975418102
      // 19d: lload 1
      // 19e: lxor
      // 19f: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: nop
      // 1a5: astore 5
      // 1a7: goto 203
      // 1aa: aload 0
      // 1ab: getfield ysf.se7 I
      // 1ae: bipush 3
      // 1af: if_icmpne 203
      // 1b2: sipush 21539
      // 1b5: ldc2_w 6080840559454891795
      // 1b8: lload 1
      // 1b9: lxor
      // 1ba: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: nop
      // 1c0: astore 5
      // 1c2: goto 203
      // 1c5: aload 0
      // 1c6: getfield ysf.se7 I
      // 1c9: bipush 1
      // 1ca: iload 3
      // 1cb: ifne 1f0
      // 1ce: if_icmpne 1eb
      // 1d1: goto 1d8
      // 1d4: invokestatic ysf.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: sipush 4188
      // 1db: ldc2_w 35716584094329698
      // 1de: lload 1
      // 1df: lxor
      // 1e0: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: nop
      // 1e6: astore 5
      // 1e8: goto 203
      // 1eb: aload 0
      // 1ec: getfield ysf.se7 I
      // 1ef: bipush 2
      // 1f0: if_icmpne 203
      // 1f3: sipush 26757
      // 1f6: ldc2_w 2697477159066866595
      // 1f9: lload 1
      // 1fa: lxor
      // 1fb: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: nop
      // 201: astore 5
      // 203: aload 5
      // 205: ifnull 255
      // 208: new hsu
      // 20b: dup
      // 20c: new java/lang/StringBuilder
      // 20f: dup
      // 210: invokespecial java/lang/StringBuilder.<init> ()V
      // 213: sipush 5460
      // 216: ldc2_w 8902919798702009981
      // 219: lload 1
      // 21a: lxor
      // 21b: invokedynamic y (IJ)Ljava/lang/String; bsm=ysf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: nop
      // 221: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 224: aload 5
      // 226: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 229: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22c: bipush 0
      // 22d: anewarray 726
      // 230: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 233: astore 6
      // 235: aload 6
      // 237: invokevirtual hsu.f4q ()Lpoy;
      // 23a: aload 0
      // 23b: invokevirtual ysf.c7n ()Lxq3;
      // 23e: invokevirtual poy.zn_ (Lxq3;)Lpoy;
      // 241: pop
      // 242: aload 6
      // 244: invokevirtual hsu.f4q ()Lpoy;
      // 247: aload 0
      // 248: invokevirtual ysf.b_q ()Ljava/util/UUID;
      // 24b: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 24e: invokevirtual poy.o7m (Ljava/lang/String;)Lpoy;
      // 251: pop
      // 252: aload 6
      // 254: areturn
      // 255: aload 0
      // 256: invokespecial dms.xyw ()Lekw;
      // 259: areturn
   }

   @Override
   public float c5y() {
      float var1 = 1.62F;
      if (this.ejl()) {
         var1 = (float)((double)var1 - 0.81);
      }

      return var1;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 12
      // 07: iload 2
      // 08: ifne 31
      // 0b: if_icmpne 27
      // 0e: goto 15
      // 11: invokestatic ysf.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: getstatic w_0.mwm Lw_0;
      // 19: invokespecial ysf.g54 (Lw_0;)V
      // 1c: iload 2
      // 1d: ifeq 7c
      // 20: goto 27
      // 23: invokestatic ysf.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 1
      // 28: bipush 13
      // 2a: goto 31
      // 2d: invokestatic ysf.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 2
      // 32: ifne 5b
      // 35: if_icmpne 51
      // 38: goto 3f
      // 3b: invokestatic ysf.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getstatic w_0.cyy Lw_0;
      // 43: invokespecial ysf.g54 (Lw_0;)V
      // 46: iload 2
      // 47: ifeq 7c
      // 4a: goto 51
      // 4d: invokestatic ysf.a (Loov;)Loov;
      // 50: athrow
      // 51: iload 1
      // 52: bipush 14
      // 54: goto 5b
      // 57: invokestatic ysf.a (Loov;)Loov;
      // 5a: athrow
      // 5b: if_icmpne 70
      // 5e: aload 0
      // 5f: getstatic w_0.z1q Lw_0;
      // 62: invokespecial ysf.g54 (Lw_0;)V
      // 65: iload 2
      // 66: ifeq 7c
      // 69: goto 70
      // 6c: invokestatic ysf.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: iload 1
      // 72: invokespecial dms.ptf (B)V
      // 75: goto 7c
      // 78: invokestatic ysf.a (Loov;)Loov;
      // 7b: athrow
      // 7c: return
   }

   private void g54(w_0 var1) {
      int var2 = t9d.b();
      int var3 = 0;

      while (var3 < 5) {
         double var4 = this.z2d.nextGaussian() * 0.02;
         double var6 = this.z2d.nextGaussian() * 0.02;
         double var8 = this.z2d.nextGaussian() * 0.02;
         this.oay
            .zvy(
               var1,
               this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
               this.kfp + 1.0 + (double)(this.z2d.nextFloat() * this.ikl),
               this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
               var4,
               var6,
               var8,
               new int[0]
            );
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public ps6 hx8(css var1, ps6 var2) {
      var2 = super.hx8(var1, var2);
      this.nx9(this.oay.fsy.nextInt(5));
      this.x3o();
      return var2;
   }

   public void yi0() {
      this.bee = true;
   }

   public ysf kv0(dms var1) {
      ysf var2 = new ysf(this.oay);
      var2.hx8(this.oay.sms(new mew(var2)), (ps6)null);
      return var2;
   }

   @Override
   public boolean _rn() {
      return false;
   }

   @Override
   public void nzg(_6b param1) {
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
      // 05: getfield ysf.oay Lt9d;
      // 08: getfield t9d.v0f Z
      // 0b: iload 2
      // 0c: ifeq 24
      // 0f: ifne a1
      // 12: goto 19
      // 15: invokestatic ysf.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield ysf.ma9 Z
      // 1d: goto 24
      // 20: invokestatic ysf.a (Loov;)Loov;
      // 23: athrow
      // 24: ifne a1
      // 27: new zty
      // 2a: dup
      // 2b: aload 0
      // 2c: getfield ysf.oay Lt9d;
      // 2f: invokespecial zty.<init> (Lt9d;)V
      // 32: astore 3
      // 33: aload 3
      // 34: aload 0
      // 35: getfield ysf.o2v D
      // 38: aload 0
      // 39: getfield ysf.kfp D
      // 3c: aload 0
      // 3d: getfield ysf.vbd D
      // 40: aload 0
      // 41: getfield ysf.x5k F
      // 44: aload 0
      // 45: getfield ysf.y2i F
      // 48: invokevirtual zty.x24 (DDDFF)V
      // 4b: aload 3
      // 4c: aload 0
      // 4d: getfield ysf.oay Lt9d;
      // 50: new mew
      // 53: dup
      // 54: aload 3
      // 55: invokespecial mew.<init> (Li2h;)V
      // 58: invokevirtual t9d.sms (Lmew;)Lcss;
      // 5b: aconst_null
      // 5c: checkcast ps6
      // 5f: invokevirtual zty.hx8 (Lcss;Lps6;)Lps6;
      // 62: pop
      // 63: aload 3
      // 64: aload 0
      // 65: invokevirtual ysf.r1t ()Z
      // 68: invokevirtual zty.x53 (Z)V
      // 6b: aload 0
      // 6c: invokevirtual ysf.qrh ()Z
      // 6f: iload 2
      // 70: ifeq 9c
      // 73: ifeq 94
      // 76: goto 7d
      // 79: invokestatic ysf.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 3
      // 7e: aload 0
      // 7f: invokevirtual ysf.hei ()Ljava/lang/String;
      // 82: invokevirtual zty.x84 (Ljava/lang/String;)V
      // 85: aload 3
      // 86: aload 0
      // 87: invokevirtual ysf.bpc ()Z
      // 8a: invokevirtual zty.krn (Z)V
      // 8d: goto 94
      // 90: invokestatic ysf.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: getfield ysf.oay Lt9d;
      // 98: aload 3
      // 99: invokevirtual t9d.xzq (Li2h;)Z
      // 9c: pop
      // 9d: aload 0
      // 9e: invokevirtual ysf._kl ()V
      // a1: return
   }

   public goq m2s() {
      return this.rxe;
   }

   @Override
   public void fij(nvf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual nvf.s7f ()Lerg;
      // 04: astore 3
      // 05: invokestatic t9d.c ()I
      // 08: aload 3
      // 09: invokevirtual erg.gn1 ()Lu7m;
      // 0c: astore 4
      // 0e: istore 2
      // 0f: aload 0
      // 10: iload 2
      // 11: ifne 2b
      // 14: aload 4
      // 16: invokespecial ysf.s99 (Lu7m;)Z
      // 19: ifeq 63
      // 1c: goto 23
      // 1f: invokestatic ysf.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: goto 2b
      // 27: invokestatic ysf.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield ysf.rxe Lgoq;
      // 2e: aload 3
      // 2f: invokevirtual goq.vd1 (Lerg;)Lerg;
      // 32: astore 5
      // 34: aload 5
      // 36: iload 2
      // 37: ifne 5b
      // 3a: ifnonnull 53
      // 3d: goto 44
      // 40: invokestatic ysf.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 1
      // 45: invokevirtual nvf._kl ()V
      // 48: iload 2
      // 49: ifeq 63
      // 4c: goto 53
      // 4f: invokestatic ysf.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 3
      // 54: goto 5b
      // 57: invokestatic ysf.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 5
      // 5d: getfield erg.qd2 I
      // 60: putfield erg.qd2 I
      // 63: return
   }

   private boolean s99(u7m param1) {
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
      // 05: getstatic xbr.nfb Lu7m;
      // 08: iload 2
      // 09: ifne 21
      // 0c: if_acmpeq 6f
      // 0f: goto 16
      // 12: invokestatic ysf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic xbr.dzx Lu7m;
      // 1a: goto 21
      // 1d: invokestatic ysf.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 3a
      // 25: if_acmpeq 6f
      // 28: goto 2f
      // 2b: invokestatic ysf.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic xbr.aar Lu7m;
      // 33: goto 3a
      // 36: invokestatic ysf.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 2
      // 3b: ifne 53
      // 3e: if_acmpeq 6f
      // 41: goto 48
      // 44: invokestatic ysf.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 1
      // 49: getstatic xbr.iqq Lu7m;
      // 4c: goto 53
      // 4f: invokestatic ysf.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 2
      // 54: ifne 6c
      // 57: if_acmpeq 6f
      // 5a: goto 61
      // 5d: invokestatic ysf.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 1
      // 62: getstatic xbr.gj8 Lu7m;
      // 65: goto 6c
      // 68: invokestatic ysf.a (Loov;)Loov;
      // 6b: athrow
      // 6c: if_acmpne 77
      // 6f: bipush 1
      // 70: goto 78
      // 73: invokestatic ysf.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 0
      // 78: ireturn
   }

   public boolean yg0() {
      return this.r6x(1);
   }

   public boolean n_2() {
      return this.r6x(2);
   }

   public boolean sus() {
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
      // 05: invokevirtual ysf.y6a ()I
      // 08: iload 1
      // 09: ifeq 17
      // 0c: ifne 1a
      // 0f: goto 16
      // 12: invokestatic ysf.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1b
      // 1a: bipush 0
      // 1b: istore 2
      // 1c: iload 2
      // 1d: iload 1
      // 1e: ifeq 56
      // 21: ifeq 51
      // 24: goto 2b
      // 27: invokestatic ysf.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: bipush 5
      // 2d: invokespecial ysf.r6x (I)Z
      // 30: iload 1
      // 31: ifeq 4e
      // 34: goto 3b
      // 37: invokestatic ysf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: ifne 4d
      // 3e: goto 45
      // 41: invokestatic ysf.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 69
      // 49: invokestatic ysf.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: goto 69
      // 51: aload 0
      // 52: bipush 1
      // 53: invokespecial ysf.r6x (I)Z
      // 56: iload 1
      // 57: ifeq 65
      // 5a: ifne 68
      // 5d: goto 64
      // 60: invokestatic ysf.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   private boolean r6x(int param1) {
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
      // 005: invokevirtual ysf.y6a ()I
      // 008: iload 2
      // 009: ifne 017
      // 00c: ifne 01a
      // 00f: goto 016
      // 012: invokestatic ysf.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 1
      // 017: goto 01b
      // 01a: bipush 0
      // 01b: istore 3
      // 01c: bipush 0
      // 01d: istore 4
      // 01f: iload 4
      // 021: aload 0
      // 022: getfield ysf.rxe Lgoq;
      // 025: invokevirtual goq.opt ()I
      // 028: if_icmpge 147
      // 02b: aload 0
      // 02c: getfield ysf.rxe Lgoq;
      // 02f: iload 4
      // 031: invokevirtual goq.ibn (I)Lerg;
      // 034: astore 5
      // 036: iload 2
      // 037: ifne 143
      // 03a: aload 5
      // 03c: ifnull 140
      // 03f: goto 046
      // 042: invokestatic ysf.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 5
      // 048: invokevirtual erg.gn1 ()Lu7m;
      // 04b: getstatic xbr.nfb Lu7m;
      // 04e: iload 2
      // 04f: ifne 08f
      // 052: goto 059
      // 055: invokestatic ysf.a (Loov;)Loov;
      // 058: athrow
      // 059: if_acmpne 080
      // 05c: goto 063
      // 05f: invokestatic ysf.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 5
      // 065: getfield erg.qd2 I
      // 068: iload 2
      // 069: ifne 0f7
      // 06c: goto 073
      // 06f: invokestatic ysf.a (Loov;)Loov;
      // 072: athrow
      // 073: bipush 3
      // 074: iload 1
      // 075: imul
      // 076: if_icmpge 0ef
      // 079: goto 080
      // 07c: invokestatic ysf.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 5
      // 082: invokevirtual erg.gn1 ()Lu7m;
      // 085: getstatic xbr.dzx Lu7m;
      // 088: goto 08f
      // 08b: invokestatic ysf.a (Loov;)Loov;
      // 08e: athrow
      // 08f: iload 2
      // 090: ifne 0d5
      // 093: if_acmpne 0bb
      // 096: goto 09d
      // 099: invokestatic ysf.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 5
      // 09f: getfield erg.qd2 I
      // 0a2: iload 2
      // 0a3: ifne 0f7
      // 0a6: goto 0ad
      // 0a9: invokestatic ysf.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: bipush 12
      // 0af: iload 1
      // 0b0: imul
      // 0b1: if_icmpge 0ef
      // 0b4: goto 0bb
      // 0b7: invokestatic ysf.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 5
      // 0bd: iload 2
      // 0be: ifne 0da
      // 0c1: goto 0c8
      // 0c4: invokestatic ysf.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: invokevirtual erg.gn1 ()Lu7m;
      // 0cb: getstatic xbr.aar Lu7m;
      // 0ce: goto 0d5
      // 0d1: invokestatic ysf.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: if_acmpne 0f8
      // 0d8: aload 5
      // 0da: getfield erg.qd2 I
      // 0dd: iload 2
      // 0de: ifne 0f9
      // 0e1: bipush 12
      // 0e3: iload 1
      // 0e4: imul
      // 0e5: if_icmplt 0f8
      // 0e8: goto 0ef
      // 0eb: invokestatic ysf.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: bipush 1
      // 0f0: goto 0f7
      // 0f3: invokestatic ysf.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: ireturn
      // 0f8: iload 3
      // 0f9: ifeq 140
      // 0fc: aload 5
      // 0fe: iload 2
      // 0ff: ifne 122
      // 102: goto 109
      // 105: invokestatic ysf.a (Loov;)Loov;
      // 108: athrow
      // 109: invokevirtual erg.gn1 ()Lu7m;
      // 10c: getstatic xbr.iqq Lu7m;
      // 10f: if_acmpne 140
      // 112: goto 119
      // 115: invokestatic ysf.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 5
      // 11b: goto 122
      // 11e: invokestatic ysf.a (Loov;)Loov;
      // 121: athrow
      // 122: getfield erg.qd2 I
      // 125: iload 2
      // 126: ifne 13f
      // 129: bipush 9
      // 12b: iload 1
      // 12c: imul
      // 12d: if_icmplt 140
      // 130: goto 137
      // 133: invokestatic ysf.a (Loov;)Loov;
      // 136: athrow
      // 137: bipush 1
      // 138: goto 13f
      // 13b: invokestatic ysf.a (Loov;)Loov;
      // 13e: athrow
      // 13f: ireturn
      // 140: iinc 4 1
      // 143: iload 2
      // 144: ifeq 01f
      // 147: bipush 0
      // 148: ireturn
   }

   public boolean bq7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield ysf.rxe Lgoq;
      // 0b: invokevirtual goq.opt ()I
      // 0e: if_icmpge 7f
      // 11: aload 0
      // 12: getfield ysf.rxe Lgoq;
      // 15: iload 2
      // 16: invokevirtual goq.ibn (I)Lerg;
      // 19: astore 3
      // 1a: iload 1
      // 1b: ifne 7b
      // 1e: aload 3
      // 1f: ifnull 78
      // 22: goto 29
      // 25: invokestatic ysf.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 3
      // 2a: invokevirtual erg.gn1 ()Lu7m;
      // 2d: getstatic xbr.gj8 Lu7m;
      // 30: iload 1
      // 31: ifne 53
      // 34: goto 3b
      // 37: invokestatic ysf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: if_acmpeq 72
      // 3e: goto 45
      // 41: invokestatic ysf.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 3
      // 46: invokevirtual erg.gn1 ()Lu7m;
      // 49: getstatic xbr.dzx Lu7m;
      // 4c: goto 53
      // 4f: invokestatic ysf.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 1
      // 54: ifne 6f
      // 57: if_acmpeq 72
      // 5a: goto 61
      // 5d: invokestatic ysf.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 3
      // 62: invokevirtual erg.gn1 ()Lu7m;
      // 65: getstatic xbr.aar Lu7m;
      // 68: goto 6f
      // 6b: invokestatic ysf.a (Loov;)Loov;
      // 6e: athrow
      // 6f: if_acmpne 78
      // 72: bipush 1
      // 73: ireturn
      // 74: invokestatic ysf.a (Loov;)Loov;
      // 77: athrow
      // 78: iinc 2 1
      // 7b: iload 1
      // 7c: ifeq 06
      // 7f: bipush 0
      // 80: ireturn
   }

   @Override
   public boolean ltx(int param1, erg param2) {
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
      // 05: iload 1
      // 06: aload 2
      // 07: invokespecial dms.ltx (ILerg;)Z
      // 0a: iload 3
      // 0b: ifeq 23
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic ysf.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic ysf.a (Loov;)Loov;
      // 1d: athrow
      // 1e: iload 1
      // 1f: sipush 300
      // 22: isub
      // 23: istore 4
      // 25: iload 4
      // 27: iload 3
      // 28: ifeq 64
      // 2b: iflt 63
      // 2e: goto 35
      // 31: invokestatic ysf.a (Loov;)Loov;
      // 34: athrow
      // 35: iload 4
      // 37: iload 3
      // 38: ifeq 64
      // 3b: goto 42
      // 3e: invokestatic ysf.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield ysf.rxe Lgoq;
      // 46: invokevirtual goq.opt ()I
      // 49: if_icmpge 63
      // 4c: goto 53
      // 4f: invokestatic ysf.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield ysf.rxe Lgoq;
      // 57: iload 4
      // 59: aload 2
      // 5a: invokevirtual goq.cxl (ILerg;)V
      // 5d: bipush 1
      // 5e: ireturn
      // 5f: invokestatic ysf.a (Loov;)Loov;
      // 62: athrow
      // 63: bipush 0
      // 64: ireturn
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1210850836006504726L, -8126595146775200044L, MethodHandles.lookup().lookupClass()).a(262661245066267L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 139461260880792L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[34];
      int var7 = 0;
      String var6 = "¡\u001d¼mw6Õ>¦1E\u0094Æc\u008aÇ\u0010Ö\u009c\\/1\u009a\u001a~\u0090\u0003î\u0004\u008a|\u000e½\u0010Ñ=\u001f\u000eòz!f0\u0007\u0004\rol\u0087/\u0010¼\u0014\u000eÍ\u009fÐað\u0012´ÿ+\u0006¨\u0099[  ÕöJÙû)À\u009aM¤f;÷O©w\u0015\u0082ü÷Þ¨wae\u0098`\\\u0098Ó\r\u0010\u0096\u0019ÐÅÿ<îfAÝÎN\u008a\u0096$\u001d\u0018i\u0085´k®ì\u000bó\u0017q\\\u0095ûKü\u009c\u0019\u0018#ý>0\u0099)\u0010tò%ô\u0080$4\u0098D×«\u0089p\u000f¯\u008d\u0010\tøïS5i³Þ\u009b5\u009cp\u001bü\u009d>\u0010Ì\u001eQFx\u001c\u001d\u001fçÇ'\u0016í\u009dd| ë\u00ad\u0010ÒyñêÔö0\u0016J\u0003\u0015È,ä\u0089\u0012\\\u0086\u008bZ\u001e\u0096\u0096I\u0015¿\u0017±\u0006 A!D\u0094\u008d°Æ{D9Þ^àJ&\u0010]\u0090åU\u0099-\u0080j\u00174mNC´¤\u001f\u0018Îã iÉ$Ì\u000b°\u000fÜA<Qîf\u0081\u00ad\u008bB/´Ì¬(Y6ßØÎ_W\u008b\u0001\u0003±\u0091\u0097\u009e¦ÌJ\"Çì·\u0087\u001b\u0091\u009e\u007f´\u007f-ÀÞ\u0000ìøLkJ\u0091Õ3 \u0095\u0010\u0010k@·l\u0084~ãâ\u009aòjf\u008d\u008a'/\u0098\u0099®§Ï'º'\u0000ºì~\u0011\u0010ò ¹îÄø\u0015$\u009e\u0000't´HèÖ0ºÍ\u0018¾\u0001\u0001K\u0097?4¿`\u0007ï.6/g.¾Wì\u0095ð=¹\u0091ãïdØ\u0089wÔ®¢:|\u0000W\u008emX},m\u0099\u008b\u0010uÏ\u0017fÅ![\u0002µ\u0014f.¹\u0082DÚ()ÇW\u008f¥þ\u009aHõ9Q\nHëâ\u009dpÔºWPS|ÉqÛn±{f\u009b¼\u001aý\u0082±0\u009eÆ¾\u0010kù\u0096 ²\u008bò#\u00079¢\u0013Éï»:\u0010\u0092\u0018\u0089Ý\u0015ê|ßzÒôöY\u008aøW(¯«Ð:}\u009eBr$5\r\u009cê)¾èÒ¢@;{õØrîg\u008fE\u0011¯Æyç\n\u0006;j~ª\u0001\u0010Gáå\u000b\u009c\u00161¤} u\u008c\u0002\u009bÇ¼\u0010\u0093\u0093{£>Î\u0002c\u00ad\u0002Ô\u001cï\u0089ºö(Êð\u0001\u0088\u0085öÎñ=Ð-*Jï\u009aÑ?Í2£D\u009e®t[ø\u00900^Äù =\u0097*9\u001eAû5 ïdt\u0003\u008aø\nÆê!Å%,¼Ö×\u0093M\u0082ÏO-¢\u0019Û\u009b5\u0089s±\f\"\u0018Å\u0081ið\u007f\u001dUí\u001f\u001e\u00015\u0096ãD\u0082\u0011R\u00054á \u000e\u001c\u0010\u0017i@\u0016rM\u001c:\u00ad©\rP\u000e)\u001f6 »£&ò¾\u00ad³â@\b\u0011ÒÂ£\u0013mj®ùÕE\u0080q\u00ad[å\rÌ3\u0093\u0015Ï(\u009eD9¯Ú\u0082ª¦!)³_Ö=è\u00822K¹\u0005£\u0097Ùo7n\u0005ªÂá³2:A½\u0097\rÀ)d\u0010,moFàH\u0010Íã±«+A\f\u0099z(yTNíi\u0011¨Ý\u0004R º\u008d\u009b:ï¬/*@Y\u001bçíè(ÑZt¬M=\u0094K\u007fr\u0086Ë\u0087i";
      int var8 = "¡\u001d¼mw6Õ>¦1E\u0094Æc\u008aÇ\u0010Ö\u009c\\/1\u009a\u001a~\u0090\u0003î\u0004\u008a|\u000e½\u0010Ñ=\u001f\u000eòz!f0\u0007\u0004\rol\u0087/\u0010¼\u0014\u000eÍ\u009fÐað\u0012´ÿ+\u0006¨\u0099[  ÕöJÙû)À\u009aM¤f;÷O©w\u0015\u0082ü÷Þ¨wae\u0098`\\\u0098Ó\r\u0010\u0096\u0019ÐÅÿ<îfAÝÎN\u008a\u0096$\u001d\u0018i\u0085´k®ì\u000bó\u0017q\\\u0095ûKü\u009c\u0019\u0018#ý>0\u0099)\u0010tò%ô\u0080$4\u0098D×«\u0089p\u000f¯\u008d\u0010\tøïS5i³Þ\u009b5\u009cp\u001bü\u009d>\u0010Ì\u001eQFx\u001c\u001d\u001fçÇ'\u0016í\u009dd| ë\u00ad\u0010ÒyñêÔö0\u0016J\u0003\u0015È,ä\u0089\u0012\\\u0086\u008bZ\u001e\u0096\u0096I\u0015¿\u0017±\u0006 A!D\u0094\u008d°Æ{D9Þ^àJ&\u0010]\u0090åU\u0099-\u0080j\u00174mNC´¤\u001f\u0018Îã iÉ$Ì\u000b°\u000fÜA<Qîf\u0081\u00ad\u008bB/´Ì¬(Y6ßØÎ_W\u008b\u0001\u0003±\u0091\u0097\u009e¦ÌJ\"Çì·\u0087\u001b\u0091\u009e\u007f´\u007f-ÀÞ\u0000ìøLkJ\u0091Õ3 \u0095\u0010\u0010k@·l\u0084~ãâ\u009aòjf\u008d\u008a'/\u0098\u0099®§Ï'º'\u0000ºì~\u0011\u0010ò ¹îÄø\u0015$\u009e\u0000't´HèÖ0ºÍ\u0018¾\u0001\u0001K\u0097?4¿`\u0007ï.6/g.¾Wì\u0095ð=¹\u0091ãïdØ\u0089wÔ®¢:|\u0000W\u008emX},m\u0099\u008b\u0010uÏ\u0017fÅ![\u0002µ\u0014f.¹\u0082DÚ()ÇW\u008f¥þ\u009aHõ9Q\nHëâ\u009dpÔºWPS|ÉqÛn±{f\u009b¼\u001aý\u0082±0\u009eÆ¾\u0010kù\u0096 ²\u008bò#\u00079¢\u0013Éï»:\u0010\u0092\u0018\u0089Ý\u0015ê|ßzÒôöY\u008aøW(¯«Ð:}\u009eBr$5\r\u009cê)¾èÒ¢@;{õØrîg\u008fE\u0011¯Æyç\n\u0006;j~ª\u0001\u0010Gáå\u000b\u009c\u00161¤} u\u008c\u0002\u009bÇ¼\u0010\u0093\u0093{£>Î\u0002c\u00ad\u0002Ô\u001cï\u0089ºö(Êð\u0001\u0088\u0085öÎñ=Ð-*Jï\u009aÑ?Í2£D\u009e®t[ø\u00900^Äù =\u0097*9\u001eAû5 ïdt\u0003\u008aø\nÆê!Å%,¼Ö×\u0093M\u0082ÏO-¢\u0019Û\u009b5\u0089s±\f\"\u0018Å\u0081ið\u007f\u001dUí\u001f\u001e\u00015\u0096ãD\u0082\u0011R\u00054á \u000e\u001c\u0010\u0017i@\u0016rM\u001c:\u00ad©\rP\u000e)\u001f6 »£&ò¾\u00ad³â@\b\u0011ÒÂ£\u0013mj®ùÕE\u0080q\u00ad[å\rÌ3\u0093\u0015Ï(\u009eD9¯Ú\u0082ª¦!)³_Ö=è\u00822K¹\u0005£\u0097Ùo7n\u0005ªÂá³2:A½\u0097\rÀ)d\u0010,moFàH\u0010Íã±«+A\f\u0099z(yTNíi\u0011¨Ý\u0004R º\u008d\u009b:ï¬/*@Y\u001bçíè(ÑZt¬M=\u0094K\u007fr\u0086Ë\u0087i"
         .length();
      char var5 = 16;
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
                     h = new String[34];
                     js3 = new ysf$rj4[][][][]{
                        {
                              {
                                    {
                                          new ysf$ef0(xbr.iqq, new ysf$czd(18, 22)),
                                          new ysf$ef0(xbr.dzx, new ysf$czd(15, 19)),
                                          new ysf$ef0(xbr.aar, new ysf$czd(15, 19)),
                                          new ysf$oa5(xbr.nfb, new ysf$czd(-4, -2))
                                    },
                                    {new ysf$ef0(u7m.gfm(ox_.jzx), new ysf$czd(8, 13)), new ysf$oa5(xbr.pb8, new ysf$czd(-3, -2))},
                                    {new ysf$ef0(u7m.gfm(ox_.gdb), new ysf$czd(7, 12)), new ysf$oa5(xbr.lym, new ysf$czd(-5, -7))},
                                    {new ysf$oa5(xbr.xth, new ysf$czd(-6, -10)), new ysf$oa5(xbr.bsd, new ysf$czd(1, 1))}
                              },
                              {
                                    {
                                          new ysf$ef0(xbr.eij, new ysf$czd(15, 20)),
                                          new ysf$ef0(xbr.thr, new ysf$czd(16, 24)),
                                          new ysf$co8(xbr.h_h, new ysf$czd(6, 6), xbr.lh3, new ysf$czd(6, 6))
                                    },
                                    {new ysf$uow(xbr.kru, new ysf$czd(7, 8))}
                              },
                              {
                                    {new ysf$ef0(u7m.gfm(ox_.lpo), new ysf$czd(16, 22)), new ysf$oa5(xbr.qsl, new ysf$czd(3, 4))},
                                    {
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 0), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 1), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 2), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 3), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 4), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 5), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 6), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 7), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 8), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 9), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 10), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 11), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 12), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 13), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 14), new ysf$czd(1, 2)),
                                          new ysf$oa5(new erg(u7m.gfm(ox_.lpo), 1, 15), new ysf$czd(1, 2))
                                    }
                              },
                              {
                                    {new ysf$ef0(xbr.eij, new ysf$czd(15, 20)), new ysf$oa5(xbr.tzx, new ysf$czd(-12, -8))},
                                    {new ysf$oa5(xbr.okb, new ysf$czd(2, 3)), new ysf$co8(u7m.gfm(ox_.bqn), new ysf$czd(10, 10), xbr.hgw, new ysf$czd(6, 10))}
                              }
                        },
                        {
                              {
                                    {new ysf$ef0(xbr.y8u, new ysf$czd(24, 36)), new ysf$j95()},
                                    {
                                          new ysf$ef0(xbr.rm0, new ysf$czd(8, 10)),
                                          new ysf$oa5(xbr.xdw, new ysf$czd(10, 12)),
                                          new ysf$oa5(u7m.gfm(ox_.kzr), new ysf$czd(3, 4))
                                    },
                                    {
                                          new ysf$ef0(xbr._h5, new ysf$czd(2, 2)),
                                          new ysf$oa5(xbr.x_4, new ysf$czd(10, 12)),
                                          new ysf$oa5(u7m.gfm(ox_.fzi), new ysf$czd(-5, -3))
                                    },
                                    {new ysf$j95()},
                                    {new ysf$j95()},
                                    {new ysf$oa5(xbr.uh6, new ysf$czd(20, 22))}
                              }
                        },
                        {
                              {
                                    {new ysf$ef0(xbr.ii5, new ysf$czd(36, 40)), new ysf$ef0(xbr.jtr, new ysf$czd(8, 10))},
                                    {new ysf$oa5(xbr.deg, new ysf$czd(-4, -1)), new ysf$oa5(new erg(xbr.nnn, 1, qvg.o71.b9d()), new ysf$czd(-2, -1))},
                                    {new ysf$oa5(xbr.rr5, new ysf$czd(7, 11)), new ysf$oa5(u7m.gfm(ox_.t7q), new ysf$czd(-3, -1))},
                                    {new ysf$oa5(xbr.ttz, new ysf$czd(3, 11))}
                              }
                        },
                        {
                              {
                                    {new ysf$ef0(xbr.thr, new ysf$czd(16, 24)), new ysf$oa5(xbr.c2v, new ysf$czd(4, 6))},
                                    {new ysf$ef0(xbr.icz, new ysf$czd(7, 9)), new ysf$oa5(xbr.w41, new ysf$czd(10, 14))},
                                    {new ysf$ef0(xbr.exg, new ysf$czd(3, 4)), new ysf$uow(xbr.r6g, new ysf$czd(16, 19))},
                                    {
                                          new ysf$oa5(xbr.axm, new ysf$czd(5, 7)),
                                          new ysf$oa5(xbr.q4a, new ysf$czd(9, 11)),
                                          new ysf$oa5(xbr.mtq, new ysf$czd(5, 7)),
                                          new ysf$oa5(xbr.o20, new ysf$czd(11, 15))
                                    }
                              },
                              {
                                    {new ysf$ef0(xbr.thr, new ysf$czd(16, 24)), new ysf$oa5(xbr.aec, new ysf$czd(6, 8))},
                                    {new ysf$ef0(xbr.icz, new ysf$czd(7, 9)), new ysf$uow(xbr.jfo, new ysf$czd(9, 10))},
                                    {
                                          new ysf$ef0(xbr.exg, new ysf$czd(3, 4)),
                                          new ysf$uow(xbr.eku, new ysf$czd(12, 15)),
                                          new ysf$uow(xbr.ki4, new ysf$czd(9, 12))
                                    }
                              },
                              {
                                    {new ysf$ef0(xbr.thr, new ysf$czd(16, 24)), new ysf$uow(xbr.p91, new ysf$czd(5, 7))},
                                    {new ysf$ef0(xbr.icz, new ysf$czd(7, 9)), new ysf$uow(xbr.l4f, new ysf$czd(9, 11))},
                                    {new ysf$ef0(xbr.exg, new ysf$czd(3, 4)), new ysf$uow(xbr.ihl, new ysf$czd(12, 15))}
                              }
                        },
                        {
                              {
                                    {new ysf$ef0(xbr.tf4, new ysf$czd(14, 18)), new ysf$ef0(xbr.o7i, new ysf$czd(14, 18))},
                                    {
                                          new ysf$ef0(xbr.thr, new ysf$czd(16, 24)),
                                          new ysf$oa5(xbr.li3, new ysf$czd(-7, -5)),
                                          new ysf$oa5(xbr.sg4, new ysf$czd(-8, -6))
                                    }
                              },
                              {
                                    {new ysf$ef0(xbr.i8v, new ysf$czd(9, 12)), new ysf$oa5(xbr.esc, new ysf$czd(2, 4))},
                                    {new ysf$uow(xbr.s9f, new ysf$czd(7, 12))},
                                    {new ysf$oa5(xbr.fpq, new ysf$czd(8, 10))}
                              }
                        }
                     };
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

                  var6 = "úr)í\u008aÞ¸\"<$\u0094)c|åÈ\u0083Û¥\u000b\u0011`ºÛÂF.\u008dLõ\u0002° \u008b\u0088,w±s)TêÁ<«\u007fÝ\u0092\u0090iã\"\u0099£ìy°äA§:\u008c¿[E";
                  var8 = "úr)í\u008aÞ¸\"<$\u0094)c|åÈ\u0083Û¥\u000b\u0011`ºÛÂF.\u008dLõ\u0002° \u008b\u0088,w±s)TêÁ<«\u007fÝ\u0092\u0090iã\"\u0099£ìy°äA§:\u008c¿[E"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31822;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ysf", var10);
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
         h[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("ysf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
