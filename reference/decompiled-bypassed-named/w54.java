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

public class w54 extends EntityLivingBase {
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public w54(OpaquePredicate var1) {
      super(var1);
      this.gz8 = true;
      this.yxc(1.5F, 0.6F);
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public void tbj() {
      this.oit.kp2(17, new Integer(0));
      this.oit.kp2(18, new Integer(1));
      this.oit.kp2(19, new Float(0.0F));
   }

   @Override
   public nh4 tjo(EntityLivingBase var1) {
      return var1.aaw();
   }

   @Override
   public nh4 q3r() {
      return this.aaw();
   }

   @Override
   public boolean tfh() {
      return true;
   }

   public w54(OpaquePredicate var1, double var2, double var4, double var6) {
      this(var1);
      this.m6_(var2, var4, var6);
      this.icv = 0.0;
      this.mop = 0.0;
      this.bw4 = 0.0;
      this.bc1 = var2;
      this.o_z = var4;
      this.a4d = var6;
   }

   @Override
   public double yyb() {
      return -0.3;
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
      // 000: getstatic w54.b J
      // 003: ldc2_w 89500940085341
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: aload 1
      // 00f: invokevirtual w54.nss (Lofh;)Z
      // 012: iload 5
      // 014: ifeq 02e
      // 017: ifeq 027
      // 01a: goto 021
      // 01d: invokestatic w54.a (Loov;)Loov;
      // 020: athrow
      // 021: bipush 0
      // 022: ireturn
      // 023: invokestatic w54.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: getfield w54.oay Lt9d;
      // 02b: getfield OpaquePredicate.v0f Z
      // 02e: iload 5
      // 030: ifeq 1bf
      // 033: ifne 1be
      // 036: goto 03d
      // 039: invokestatic w54.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield w54.ma9 Z
      // 041: iload 5
      // 043: ifeq 1bf
      // 046: goto 04d
      // 049: invokestatic w54.a (Loov;)Loov;
      // 04c: athrow
      // 04d: ifne 1be
      // 050: goto 057
      // 053: invokestatic w54.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: getfield w54.wgv Li2h;
      // 05b: iload 5
      // 05d: ifeq 0d4
      // 060: goto 067
      // 063: invokestatic w54.a (Loov;)Loov;
      // 066: athrow
      // 067: ifnull 0af
      // 06a: goto 071
      // 06d: invokestatic w54.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 0
      // 072: getfield w54.wgv Li2h;
      // 075: iload 5
      // 077: ifeq 0d4
      // 07a: goto 081
      // 07d: invokestatic w54.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 1
      // 082: invokevirtual ofh.nra ()Li2h;
      // 085: if_acmpne 0af
      // 088: goto 08f
      // 08b: invokestatic w54.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 1
      // 090: instanceof nhv
      // 093: iload 5
      // 095: ifeq 0d7
      // 098: goto 09f
      // 09b: invokestatic w54.a (Loov;)Loov;
      // 09e: athrow
      // 09f: ifeq 0af
      // 0a2: goto 0a9
      // 0a5: invokestatic w54.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: bipush 0
      // 0aa: ireturn
      // 0ab: invokestatic w54.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: aload 0
      // 0b1: invokevirtual w54.epc ()I
      // 0b4: ineg
      // 0b5: invokevirtual w54.jdb (I)V
      // 0b8: aload 0
      // 0b9: bipush 10
      // 0bb: invokevirtual w54.q87 (I)V
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: invokevirtual w54.r9s ()F
      // 0c3: fload 2
      // 0c4: ldc 10.0
      // 0c6: nop
      // 0c7: fmul
      // 0c8: fadd
      // 0c9: invokevirtual w54.pve (F)V
      // 0cc: aload 0
      // 0cd: invokevirtual w54.dxm ()V
      // 0d0: aload 1
      // 0d1: invokevirtual ofh.nra ()Li2h;
      // 0d4: instanceof ha9
      // 0d7: iload 5
      // 0d9: ifeq 0fa
      // 0dc: ifeq 10d
      // 0df: goto 0e6
      // 0e2: invokestatic w54.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: aload 1
      // 0e7: invokevirtual ofh.nra ()Li2h;
      // 0ea: checkcast ha9
      // 0ed: getfield ha9.lls Lpj2;
      // 0f0: getfield pj2.g40 Z
      // 0f3: goto 0fa
      // 0f6: invokestatic w54.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 5
      // 0fc: ifeq 10a
      // 0ff: ifeq 10d
      // 102: goto 109
      // 105: invokestatic w54.a (Loov;)Loov;
      // 108: athrow
      // 109: bipush 1
      // 10a: goto 10e
      // 10d: bipush 0
      // 10e: istore 6
      // 110: iload 6
      // 112: iload 5
      // 114: ifeq 130
      // 117: ifne 13f
      // 11a: goto 121
      // 11d: invokestatic w54.a (Loov;)Loov;
      // 120: athrow
      // 121: aload 0
      // 122: invokevirtual w54.r9s ()F
      // 125: ldc 40.0
      // 127: nop
      // 128: fcmpl
      // 129: goto 130
      // 12c: invokestatic w54.a (Loov;)Loov;
      // 12f: athrow
      // 130: iload 5
      // 132: ifeq 1bd
      // 135: ifle 1bc
      // 138: goto 13f
      // 13b: invokestatic w54.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: getfield w54.wgv Li2h;
      // 143: iload 5
      // 145: ifeq 164
      // 148: goto 14f
      // 14b: invokestatic w54.a (Loov;)Loov;
      // 14e: athrow
      // 14f: ifnull 168
      // 152: goto 159
      // 155: invokestatic w54.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: getfield w54.wgv Li2h;
      // 15d: goto 164
      // 160: invokestatic w54.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 0
      // 165: invokevirtual EntityLivingBase.nw9 (Li2h;)V
      // 168: iload 6
      // 16a: iload 5
      // 16c: ifeq 1a4
      // 16f: ifne 1b8
      // 172: goto 179
      // 175: invokestatic w54.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: iload 5
      // 17c: ifeq 1b9
      // 17f: goto 186
      // 182: invokestatic w54.a (Loov;)Loov;
      // 185: athrow
      // 186: getfield w54.oay Lt9d;
      // 189: invokevirtual OpaquePredicate.eir ()Lef9;
      // 18c: sipush 17423
      // 18f: ldc2_w 3549068782423757422
      // 192: lload 3
      // 193: lxor
      // 194: invokedynamic v (IJ)Ljava/lang/String; bsm=w54.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: nop
      // 19a: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 19d: goto 1a4
      // 1a0: invokestatic w54.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: ifeq 1b8
      // 1a7: aload 0
      // 1a8: getstatic xbr.suy Lu7m;
      // 1ab: bipush 1
      // 1ac: fconst_0
      // 1ad: invokevirtual w54.bhk (Lu7m;IF)Lnvf;
      // 1b0: pop
      // 1b1: goto 1b8
      // 1b4: invokestatic w54.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: invokevirtual w54._kl ()V
      // 1bc: bipush 1
      // 1bd: ireturn
      // 1be: bipush 1
      // 1bf: ireturn
   }

   @Override
   public void h38() {
      this.jdb(-this.epc());
      this.q87(10);
      this.pve(this.r9s() * 11.0F);
   }

   @Override
   public boolean mzu() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
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

   @Override
   public void ltu(double param1, double param3, double param5, float param7, float param8, int param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 11
      // 005: iload 10
      // 007: iload 11
      // 009: ifeq 0a9
      // 00c: ifeq 092
      // 00f: goto 016
      // 012: invokestatic w54.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: iload 11
      // 019: ifeq 09a
      // 01c: goto 023
      // 01f: invokestatic w54.a (Loov;)Loov;
      // 022: athrow
      // 023: getfield w54.wgv Li2h;
      // 026: ifnull 092
      // 029: goto 030
      // 02c: invokestatic w54.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: aload 0
      // 032: dload 1
      // 033: dup2_x1
      // 034: putfield w54.o2v D
      // 037: putfield w54.bc1 D
      // 03a: aload 0
      // 03b: aload 0
      // 03c: dload 3
      // 03d: dup2_x1
      // 03e: putfield w54.kfp D
      // 041: putfield w54.o_z D
      // 044: aload 0
      // 045: aload 0
      // 046: dload 5
      // 048: dup2_x1
      // 049: putfield w54.vbd D
      // 04c: putfield w54.a4d D
      // 04f: aload 0
      // 050: fload 7
      // 052: putfield w54.x5k F
      // 055: aload 0
      // 056: fload 8
      // 058: putfield w54.y2i F
      // 05b: aload 0
      // 05c: bipush 0
      // 05d: putfield w54._pt I
      // 060: aload 0
      // 061: dload 1
      // 062: dload 3
      // 063: dload 5
      // 065: invokevirtual w54.m6_ (DDD)V
      // 068: aload 0
      // 069: aload 0
      // 06a: dconst_0
      // 06b: dup2_x1
      // 06c: putfield w54.zgs D
      // 06f: putfield w54.icv D
      // 072: aload 0
      // 073: aload 0
      // 074: dconst_0
      // 075: dup2_x1
      // 076: putfield w54.hge D
      // 079: putfield w54.mop D
      // 07c: aload 0
      // 07d: aload 0
      // 07e: dconst_0
      // 07f: dup2_x1
      // 080: putfield w54.d8f D
      // 083: putfield w54.bw4 D
      // 086: iload 11
      // 088: ifne 12c
      // 08b: goto 092
      // 08e: invokestatic w54.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: goto 09a
      // 096: invokestatic w54.a (Loov;)Loov;
      // 099: athrow
      // 09a: iload 11
      // 09c: ifeq 0ad
      // 09f: getfield w54.wrh Z
      // 0a2: goto 0a9
      // 0a5: invokestatic w54.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifeq 0b9
      // 0ac: aload 0
      // 0ad: iload 9
      // 0af: bipush 5
      // 0b0: iadd
      // 0b1: putfield w54._pt I
      // 0b4: iload 11
      // 0b6: ifne 0f6
      // 0b9: dload 1
      // 0ba: aload 0
      // 0bb: getfield w54.o2v D
      // 0be: dsub
      // 0bf: dstore 12
      // 0c1: dload 3
      // 0c2: aload 0
      // 0c3: getfield w54.kfp D
      // 0c6: dsub
      // 0c7: dstore 14
      // 0c9: dload 5
      // 0cb: aload 0
      // 0cc: getfield w54.vbd D
      // 0cf: dsub
      // 0d0: dstore 16
      // 0d2: dload 12
      // 0d4: dload 12
      // 0d6: dmul
      // 0d7: dload 14
      // 0d9: dload 14
      // 0db: dmul
      // 0dc: dadd
      // 0dd: dload 16
      // 0df: dload 16
      // 0e1: dmul
      // 0e2: dadd
      // 0e3: dstore 18
      // 0e5: dload 18
      // 0e7: dconst_1
      // 0e8: dcmpg
      // 0e9: ifgt 0f1
      // 0ec: return
      // 0ed: invokestatic w54.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: bipush 3
      // 0f3: putfield w54._pt I
      // 0f6: aload 0
      // 0f7: dload 1
      // 0f8: putfield w54.bal D
      // 0fb: aload 0
      // 0fc: dload 3
      // 0fd: putfield w54._tn D
      // 100: aload 0
      // 101: dload 5
      // 103: putfield w54.brh D
      // 106: aload 0
      // 107: fload 7
      // 109: f2d
      // 10a: putfield w54.uyl D
      // 10d: aload 0
      // 10e: fload 8
      // 110: f2d
      // 111: putfield w54.lzb D
      // 114: aload 0
      // 115: aload 0
      // 116: getfield w54.zgs D
      // 119: putfield w54.icv D
      // 11c: aload 0
      // 11d: aload 0
      // 11e: getfield w54.hge D
      // 121: putfield w54.mop D
      // 124: aload 0
      // 125: aload 0
      // 126: getfield w54.d8f D
      // 129: putfield w54.bw4 D
      // 12c: return
   }

   @Override
   public void lmm(double var1, double var3, double var5) {
      this.zgs = this.icv = var1;
      this.hge = this.mop = var3;
      this.d8f = this.bw4 = var5;
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
      // 000: getstatic w54.b J
      // 003: ldc2_w 27395072912995
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial EntityLivingBase.xx_ ()V
      // 010: aload 0
      // 011: invokevirtual w54.pbj ()I
      // 014: iload 3
      // 015: ifeq 039
      // 018: ifle 033
      // 01b: goto 022
      // 01e: invokestatic w54.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: aload 0
      // 024: invokevirtual w54.pbj ()I
      // 027: bipush 1
      // 028: isub
      // 029: invokevirtual w54.q87 (I)V
      // 02c: goto 033
      // 02f: invokestatic w54.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: invokevirtual w54.r9s ()F
      // 037: fconst_0
      // 038: fcmpl
      // 039: iload 3
      // 03a: ifeq 071
      // 03d: ifle 058
      // 040: goto 047
      // 043: invokestatic w54.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: aload 0
      // 049: invokevirtual w54.r9s ()F
      // 04c: fconst_1
      // 04d: fsub
      // 04e: invokevirtual w54.pve (F)V
      // 051: goto 058
      // 054: invokestatic w54.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 0
      // 059: aload 0
      // 05a: getfield w54.o2v D
      // 05d: putfield w54.bc1 D
      // 060: aload 0
      // 061: aload 0
      // 062: getfield w54.kfp D
      // 065: putfield w54.o_z D
      // 068: aload 0
      // 069: aload 0
      // 06a: getfield w54.vbd D
      // 06d: putfield w54.a4d D
      // 070: bipush 5
      // 071: istore 4
      // 073: dconst_0
      // 074: dstore 5
      // 076: bipush 0
      // 077: istore 7
      // 079: iload 7
      // 07b: iload 4
      // 07d: if_icmpge 12d
      // 080: aload 0
      // 081: invokevirtual w54.aaw ()Lnh4;
      // 084: getfield nh4.bx_ D
      // 087: aload 0
      // 088: invokevirtual w54.aaw ()Lnh4;
      // 08b: getfield nh4.i2c D
      // 08e: aload 0
      // 08f: invokevirtual w54.aaw ()Lnh4;
      // 092: getfield nh4.bx_ D
      // 095: dsub
      // 096: iload 7
      // 098: bipush 0
      // 099: iadd
      // 09a: i2d
      // 09b: dmul
      // 09c: iload 4
      // 09e: i2d
      // 09f: ddiv
      // 0a0: dadd
      // 0a1: ldc2_w 0.125
      // 0a4: dsub
      // 0a5: dstore 8
      // 0a7: aload 0
      // 0a8: invokevirtual w54.aaw ()Lnh4;
      // 0ab: getfield nh4.bx_ D
      // 0ae: aload 0
      // 0af: invokevirtual w54.aaw ()Lnh4;
      // 0b2: getfield nh4.i2c D
      // 0b5: aload 0
      // 0b6: invokevirtual w54.aaw ()Lnh4;
      // 0b9: getfield nh4.bx_ D
      // 0bc: dsub
      // 0bd: iload 7
      // 0bf: bipush 1
      // 0c0: iadd
      // 0c1: i2d
      // 0c2: dmul
      // 0c3: iload 4
      // 0c5: i2d
      // 0c6: ddiv
      // 0c7: dadd
      // 0c8: ldc2_w 0.125
      // 0cb: dsub
      // 0cc: dstore 10
      // 0ce: new nh4
      // 0d1: dup
      // 0d2: aload 0
      // 0d3: invokevirtual w54.aaw ()Lnh4;
      // 0d6: getfield nh4.rlc D
      // 0d9: dload 8
      // 0db: aload 0
      // 0dc: invokevirtual w54.aaw ()Lnh4;
      // 0df: getfield nh4.t8n D
      // 0e2: aload 0
      // 0e3: invokevirtual w54.aaw ()Lnh4;
      // 0e6: getfield nh4.t_2 D
      // 0e9: dload 10
      // 0eb: aload 0
      // 0ec: invokevirtual w54.aaw ()Lnh4;
      // 0ef: getfield nh4.oqj D
      // 0f2: invokespecial nh4.<init> (DDDDDD)V
      // 0f5: astore 12
      // 0f7: iload 3
      // 0f8: ifeq 129
      // 0fb: aload 0
      // 0fc: iload 3
      // 0fd: ifeq 12e
      // 100: goto 107
      // 103: invokestatic w54.a (Loov;)Loov;
      // 106: athrow
      // 107: getfield w54.oay Lt9d;
      // 10a: aload 12
      // 10c: getstatic p3y.six Lp3y;
      // 10f: invokevirtual OpaquePredicate.b8h (Lnh4;Lp3y;)Z
      // 112: ifeq 126
      // 115: goto 11c
      // 118: invokestatic w54.a (Loov;)Loov;
      // 11b: athrow
      // 11c: dload 5
      // 11e: dconst_1
      // 11f: iload 4
      // 121: i2d
      // 122: ddiv
      // 123: dadd
      // 124: dstore 5
      // 126: iinc 7 1
      // 129: iload 3
      // 12a: ifne 079
      // 12d: aload 0
      // 12e: getfield w54.icv D
      // 131: aload 0
      // 132: getfield w54.icv D
      // 135: dmul
      // 136: aload 0
      // 137: getfield w54.bw4 D
      // 13a: aload 0
      // 13b: getfield w54.bw4 D
      // 13e: dmul
      // 13f: dadd
      // 140: invokestatic java/lang/Math.sqrt (D)D
      // 143: dstore 7
      // 145: dload 7
      // 147: ldc2_w 0.2975
      // 14a: dcmpl
      // 14b: iload 3
      // 14c: ifeq 285
      // 14f: ifle 27e
      // 152: goto 159
      // 155: invokestatic w54.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: getfield w54.x5k F
      // 15d: f2d
      // 15e: ldc2_w 3.141592653589793
      // 161: dmul
      // 162: ldc2_w 180.0
      // 165: ddiv
      // 166: invokestatic java/lang/Math.cos (D)D
      // 169: dstore 9
      // 16b: aload 0
      // 16c: getfield w54.x5k F
      // 16f: f2d
      // 170: ldc2_w 3.141592653589793
      // 173: dmul
      // 174: ldc2_w 180.0
      // 177: ddiv
      // 178: invokestatic java/lang/Math.sin (D)D
      // 17b: dstore 11
      // 17d: bipush 0
      // 17e: istore 13
      // 180: iload 13
      // 182: i2d
      // 183: dconst_1
      // 184: dload 7
      // 186: ldc2_w 60.0
      // 189: dmul
      // 18a: dadd
      // 18b: dcmpg
      // 18c: ifge 27e
      // 18f: aload 0
      // 190: getfield w54.z2d Ljava/util/Random;
      // 193: invokevirtual java/util/Random.nextFloat ()F
      // 196: fconst_2
      // 197: fmul
      // 198: fconst_1
      // 199: fsub
      // 19a: f2d
      // 19b: dstore 14
      // 19d: aload 0
      // 19e: getfield w54.z2d Ljava/util/Random;
      // 1a1: bipush 2
      // 1a2: invokevirtual java/util/Random.nextInt (I)I
      // 1a5: bipush 2
      // 1a6: imul
      // 1a7: bipush 1
      // 1a8: isub
      // 1a9: i2d
      // 1aa: ldc2_w 0.7
      // 1ad: dmul
      // 1ae: dstore 16
      // 1b0: aload 0
      // 1b1: iload 3
      // 1b2: ifeq 22d
      // 1b5: getfield w54.z2d Ljava/util/Random;
      // 1b8: invokevirtual java/util/Random.nextBoolean ()Z
      // 1bb: iload 3
      // 1bc: ifeq 285
      // 1bf: goto 1c6
      // 1c2: invokestatic w54.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: ifeq 225
      // 1c9: goto 1d0
      // 1cc: invokestatic w54.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: getfield w54.o2v D
      // 1d4: dload 9
      // 1d6: dload 14
      // 1d8: dmul
      // 1d9: ldc2_w 0.8
      // 1dc: dmul
      // 1dd: dsub
      // 1de: dload 11
      // 1e0: dload 16
      // 1e2: dmul
      // 1e3: dadd
      // 1e4: dstore 18
      // 1e6: aload 0
      // 1e7: getfield w54.vbd D
      // 1ea: dload 11
      // 1ec: dload 14
      // 1ee: dmul
      // 1ef: ldc2_w 0.8
      // 1f2: dmul
      // 1f3: dsub
      // 1f4: dload 9
      // 1f6: dload 16
      // 1f8: dmul
      // 1f9: dsub
      // 1fa: dstore 20
      // 1fc: aload 0
      // 1fd: getfield w54.oay Lt9d;
      // 200: getstatic w_0.eiu Lw_0;
      // 203: dload 18
      // 205: aload 0
      // 206: getfield w54.kfp D
      // 209: ldc2_w 0.125
      // 20c: dsub
      // 20d: dload 20
      // 20f: aload 0
      // 210: getfield w54.icv D
      // 213: aload 0
      // 214: getfield w54.mop D
      // 217: aload 0
      // 218: getfield w54.bw4 D
      // 21b: bipush 0
      // 21c: newarray 10
      // 21e: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 221: iload 3
      // 222: ifne 277
      // 225: aload 0
      // 226: goto 22d
      // 229: invokestatic w54.a (Loov;)Loov;
      // 22c: athrow
      // 22d: getfield w54.o2v D
      // 230: dload 9
      // 232: dadd
      // 233: dload 11
      // 235: dload 14
      // 237: dmul
      // 238: ldc2_w 0.7
      // 23b: dmul
      // 23c: dadd
      // 23d: dstore 18
      // 23f: aload 0
      // 240: getfield w54.vbd D
      // 243: dload 11
      // 245: dadd
      // 246: dload 9
      // 248: dload 14
      // 24a: dmul
      // 24b: ldc2_w 0.7
      // 24e: dmul
      // 24f: dsub
      // 250: dstore 20
      // 252: aload 0
      // 253: getfield w54.oay Lt9d;
      // 256: getstatic w_0.eiu Lw_0;
      // 259: dload 18
      // 25b: aload 0
      // 25c: getfield w54.kfp D
      // 25f: ldc2_w 0.125
      // 262: dsub
      // 263: dload 20
      // 265: aload 0
      // 266: getfield w54.icv D
      // 269: aload 0
      // 26a: getfield w54.mop D
      // 26d: aload 0
      // 26e: getfield w54.bw4 D
      // 271: bipush 0
      // 272: newarray 10
      // 274: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 277: iinc 13 1
      // 27a: iload 3
      // 27b: ifne 180
      // 27e: aload 0
      // 27f: getfield w54.oay Lt9d;
      // 282: getfield OpaquePredicate.v0f Z
      // 285: iload 3
      // 286: ifeq 40a
      // 289: ifeq 3ff
      // 28c: goto 293
      // 28f: invokestatic w54.a (Loov;)Loov;
      // 292: athrow
      // 293: aload 0
      // 294: getfield w54.wrh Z
      // 297: iload 3
      // 298: ifeq 40a
      // 29b: goto 2a2
      // 29e: invokestatic w54.a (Loov;)Loov;
      // 2a1: athrow
      // 2a2: ifeq 3ff
      // 2a5: goto 2ac
      // 2a8: invokestatic w54.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: aload 0
      // 2ad: iload 3
      // 2ae: ifeq 370
      // 2b1: goto 2b8
      // 2b4: invokestatic w54.a (Loov;)Loov;
      // 2b7: athrow
      // 2b8: getfield w54._pt I
      // 2bb: ifle 368
      // 2be: goto 2c5
      // 2c1: invokestatic w54.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: aload 0
      // 2c6: getfield w54.o2v D
      // 2c9: aload 0
      // 2ca: getfield w54.bal D
      // 2cd: aload 0
      // 2ce: getfield w54.o2v D
      // 2d1: dsub
      // 2d2: aload 0
      // 2d3: getfield w54._pt I
      // 2d6: i2d
      // 2d7: ddiv
      // 2d8: dadd
      // 2d9: dstore 9
      // 2db: aload 0
      // 2dc: getfield w54.kfp D
      // 2df: aload 0
      // 2e0: getfield w54._tn D
      // 2e3: aload 0
      // 2e4: getfield w54.kfp D
      // 2e7: dsub
      // 2e8: aload 0
      // 2e9: getfield w54._pt I
      // 2ec: i2d
      // 2ed: ddiv
      // 2ee: dadd
      // 2ef: dstore 11
      // 2f1: aload 0
      // 2f2: getfield w54.vbd D
      // 2f5: aload 0
      // 2f6: getfield w54.brh D
      // 2f9: aload 0
      // 2fa: getfield w54.vbd D
      // 2fd: dsub
      // 2fe: aload 0
      // 2ff: getfield w54._pt I
      // 302: i2d
      // 303: ddiv
      // 304: dadd
      // 305: dstore 13
      // 307: aload 0
      // 308: getfield w54.uyl D
      // 30b: aload 0
      // 30c: getfield w54.x5k F
      // 30f: f2d
      // 310: dsub
      // 311: invokestatic fe6.lrs (D)D
      // 314: dstore 15
      // 316: aload 0
      // 317: aload 0
      // 318: getfield w54.x5k F
      // 31b: f2d
      // 31c: dload 15
      // 31e: aload 0
      // 31f: getfield w54._pt I
      // 322: i2d
      // 323: ddiv
      // 324: dadd
      // 325: d2f
      // 326: putfield w54.x5k F
      // 329: aload 0
      // 32a: aload 0
      // 32b: getfield w54.y2i F
      // 32e: f2d
      // 32f: aload 0
      // 330: getfield w54.lzb D
      // 333: aload 0
      // 334: getfield w54.y2i F
      // 337: f2d
      // 338: dsub
      // 339: aload 0
      // 33a: getfield w54._pt I
      // 33d: i2d
      // 33e: ddiv
      // 33f: dadd
      // 340: d2f
      // 341: putfield w54.y2i F
      // 344: aload 0
      // 345: dup
      // 346: getfield w54._pt I
      // 349: bipush 1
      // 34a: isub
      // 34b: putfield w54._pt I
      // 34e: aload 0
      // 34f: dload 9
      // 351: dload 11
      // 353: dload 13
      // 355: invokevirtual w54.m6_ (DDD)V
      // 358: aload 0
      // 359: aload 0
      // 35a: getfield w54.x5k F
      // 35d: aload 0
      // 35e: getfield w54.y2i F
      // 361: invokevirtual w54.iym (FF)V
      // 364: iload 3
      // 365: ifne 9eb
      // 368: aload 0
      // 369: goto 370
      // 36c: invokestatic w54.a (Loov;)Loov;
      // 36f: athrow
      // 370: getfield w54.o2v D
      // 373: aload 0
      // 374: getfield w54.icv D
      // 377: dadd
      // 378: dstore 9
      // 37a: aload 0
      // 37b: getfield w54.kfp D
      // 37e: aload 0
      // 37f: getfield w54.mop D
      // 382: dadd
      // 383: dstore 11
      // 385: aload 0
      // 386: getfield w54.vbd D
      // 389: aload 0
      // 38a: getfield w54.bw4 D
      // 38d: dadd
      // 38e: dstore 13
      // 390: aload 0
      // 391: dload 9
      // 393: dload 11
      // 395: dload 13
      // 397: invokevirtual w54.m6_ (DDD)V
      // 39a: aload 0
      // 39b: iload 3
      // 39c: ifeq 3f0
      // 39f: getfield w54.lfk Z
      // 3a2: ifeq 3d7
      // 3a5: goto 3ac
      // 3a8: invokestatic w54.a (Loov;)Loov;
      // 3ab: athrow
      // 3ac: aload 0
      // 3ad: dup
      // 3ae: getfield w54.icv D
      // 3b1: ldc2_w 0.5
      // 3b4: dmul
      // 3b5: putfield w54.icv D
      // 3b8: aload 0
      // 3b9: dup
      // 3ba: getfield w54.mop D
      // 3bd: ldc2_w 0.5
      // 3c0: dmul
      // 3c1: putfield w54.mop D
      // 3c4: aload 0
      // 3c5: dup
      // 3c6: getfield w54.bw4 D
      // 3c9: ldc2_w 0.5
      // 3cc: dmul
      // 3cd: putfield w54.bw4 D
      // 3d0: goto 3d7
      // 3d3: invokestatic w54.a (Loov;)Loov;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: dup
      // 3d9: getfield w54.icv D
      // 3dc: ldc2_w 0.9900000095367432
      // 3df: dmul
      // 3e0: putfield w54.icv D
      // 3e3: aload 0
      // 3e4: dup
      // 3e5: getfield w54.mop D
      // 3e8: ldc2_w 0.949999988079071
      // 3eb: dmul
      // 3ec: putfield w54.mop D
      // 3ef: aload 0
      // 3f0: dup
      // 3f1: getfield w54.bw4 D
      // 3f4: ldc2_w 0.9900000095367432
      // 3f7: dmul
      // 3f8: putfield w54.bw4 D
      // 3fb: iload 3
      // 3fc: ifne 9eb
      // 3ff: dload 5
      // 401: dconst_1
      // 402: dcmpg
      // 403: goto 40a
      // 406: invokestatic w54.a (Loov;)Loov;
      // 409: athrow
      // 40a: iload 3
      // 40b: ifeq 44d
      // 40e: ifge 435
      // 411: goto 418
      // 414: invokestatic w54.a (Loov;)Loov;
      // 417: athrow
      // 418: dload 5
      // 41a: ldc2_w 2.0
      // 41d: dmul
      // 41e: dconst_1
      // 41f: dsub
      // 420: dstore 9
      // 422: aload 0
      // 423: dup
      // 424: getfield w54.mop D
      // 427: ldc2_w 0.03999999910593033
      // 42a: dload 9
      // 42c: dmul
      // 42d: dadd
      // 42e: putfield w54.mop D
      // 431: iload 3
      // 432: ifne 46f
      // 435: aload 0
      // 436: iload 3
      // 437: ifeq 464
      // 43a: goto 441
      // 43d: invokestatic w54.a (Loov;)Loov;
      // 440: athrow
      // 441: getfield w54.mop D
      // 444: dconst_0
      // 445: dcmpg
      // 446: goto 44d
      // 449: invokestatic w54.a (Loov;)Loov;
      // 44c: athrow
      // 44d: ifge 463
      // 450: aload 0
      // 451: dup
      // 452: getfield w54.mop D
      // 455: ldc2_w 2.0
      // 458: ddiv
      // 459: putfield w54.mop D
      // 45c: goto 463
      // 45f: invokestatic w54.a (Loov;)Loov;
      // 462: athrow
      // 463: aload 0
      // 464: dup
      // 465: getfield w54.mop D
      // 468: ldc2_w 0.007000000216066837
      // 46b: dadd
      // 46c: putfield w54.mop D
      // 46f: aload 0
      // 470: iload 3
      // 471: ifeq 4f1
      // 474: getfield w54.wgv Li2h;
      // 477: instanceof Entity
      // 47a: ifeq 4f0
      // 47d: goto 484
      // 480: invokestatic w54.a (Loov;)Loov;
      // 483: athrow
      // 484: aload 0
      // 485: getfield w54.wgv Li2h;
      // 488: checkcast Entity
      // 48b: astore 9
      // 48d: aload 0
      // 48e: getfield w54.wgv Li2h;
      // 491: getfield EntityLivingBase.x5k F
      // 494: aload 9
      // 496: getfield Entity.z66 F
      // 499: fneg
      // 49a: ldc 90.0
      // 49c: nop
      // 49d: fmul
      // 49e: fadd
      // 49f: fstore 10
      // 4a1: aload 0
      // 4a2: dup
      // 4a3: getfield w54.icv D
      // 4a6: fload 10
      // 4a8: ldc 3.1415927
      // 4aa: nop
      // 4ab: fmul
      // 4ac: ldc 180.0
      // 4ae: nop
      // 4af: fdiv
      // 4b0: f2d
      // 4b1: invokestatic java/lang/Math.sin (D)D
      // 4b4: dneg
      // 4b5: aload 0
      // 4b6: getfield w54.blb D
      // 4b9: dmul
      // 4ba: aload 9
      // 4bc: getfield Entity.ooc F
      // 4bf: f2d
      // 4c0: dmul
      // 4c1: ldc2_w 0.05000000074505806
      // 4c4: dmul
      // 4c5: dadd
      // 4c6: putfield w54.icv D
      // 4c9: aload 0
      // 4ca: dup
      // 4cb: getfield w54.bw4 D
      // 4ce: fload 10
      // 4d0: ldc 3.1415927
      // 4d2: nop
      // 4d3: fmul
      // 4d4: ldc 180.0
      // 4d6: nop
      // 4d7: fdiv
      // 4d8: f2d
      // 4d9: invokestatic java/lang/Math.cos (D)D
      // 4dc: aload 0
      // 4dd: getfield w54.blb D
      // 4e0: dmul
      // 4e1: aload 9
      // 4e3: getfield Entity.ooc F
      // 4e6: f2d
      // 4e7: dmul
      // 4e8: ldc2_w 0.05000000074505806
      // 4eb: dmul
      // 4ec: dadd
      // 4ed: putfield w54.bw4 D
      // 4f0: aload 0
      // 4f1: getfield w54.icv D
      // 4f4: aload 0
      // 4f5: getfield w54.icv D
      // 4f8: dmul
      // 4f9: aload 0
      // 4fa: getfield w54.bw4 D
      // 4fd: aload 0
      // 4fe: getfield w54.bw4 D
      // 501: dmul
      // 502: dadd
      // 503: invokestatic java/lang/Math.sqrt (D)D
      // 506: dstore 9
      // 508: dload 9
      // 50a: ldc2_w 0.35
      // 50d: dcmpl
      // 50e: iload 3
      // 50f: ifeq 544
      // 512: ifle 53f
      // 515: goto 51c
      // 518: invokestatic w54.a (Loov;)Loov;
      // 51b: athrow
      // 51c: ldc2_w 0.35
      // 51f: dload 9
      // 521: ddiv
      // 522: dstore 11
      // 524: aload 0
      // 525: dup
      // 526: getfield w54.icv D
      // 529: dload 11
      // 52b: dmul
      // 52c: putfield w54.icv D
      // 52f: aload 0
      // 530: dup
      // 531: getfield w54.bw4 D
      // 534: dload 11
      // 536: dmul
      // 537: putfield w54.bw4 D
      // 53a: ldc2_w 0.35
      // 53d: dstore 9
      // 53f: dload 9
      // 541: dload 7
      // 543: dcmpl
      // 544: iload 3
      // 545: ifeq 5d7
      // 548: ifle 5b3
      // 54b: goto 552
      // 54e: invokestatic w54.a (Loov;)Loov;
      // 551: athrow
      // 552: aload 0
      // 553: getfield w54.blb D
      // 556: ldc2_w 0.35
      // 559: dcmpg
      // 55a: iload 3
      // 55b: ifeq 5d7
      // 55e: goto 565
      // 561: invokestatic w54.a (Loov;)Loov;
      // 564: athrow
      // 565: ifge 5b3
      // 568: goto 56f
      // 56b: invokestatic w54.a (Loov;)Loov;
      // 56e: athrow
      // 56f: aload 0
      // 570: dup
      // 571: getfield w54.blb D
      // 574: ldc2_w 0.35
      // 577: aload 0
      // 578: getfield w54.blb D
      // 57b: dsub
      // 57c: ldc2_w 35.0
      // 57f: ddiv
      // 580: dadd
      // 581: putfield w54.blb D
      // 584: aload 0
      // 585: getfield w54.blb D
      // 588: ldc2_w 0.35
      // 58b: dcmpl
      // 58c: iload 3
      // 58d: ifeq 5f4
      // 590: goto 597
      // 593: invokestatic w54.a (Loov;)Loov;
      // 596: athrow
      // 597: ifle 5f3
      // 59a: goto 5a1
      // 59d: invokestatic w54.a (Loov;)Loov;
      // 5a0: athrow
      // 5a1: aload 0
      // 5a2: ldc2_w 0.35
      // 5a5: putfield w54.blb D
      // 5a8: iload 3
      // 5a9: ifne 5f3
      // 5ac: goto 5b3
      // 5af: invokestatic w54.a (Loov;)Loov;
      // 5b2: athrow
      // 5b3: aload 0
      // 5b4: dup
      // 5b5: getfield w54.blb D
      // 5b8: aload 0
      // 5b9: getfield w54.blb D
      // 5bc: ldc2_w 0.07
      // 5bf: dsub
      // 5c0: ldc2_w 35.0
      // 5c3: ddiv
      // 5c4: dsub
      // 5c5: putfield w54.blb D
      // 5c8: aload 0
      // 5c9: getfield w54.blb D
      // 5cc: ldc2_w 0.07
      // 5cf: dcmpg
      // 5d0: goto 5d7
      // 5d3: invokestatic w54.a (Loov;)Loov;
      // 5d6: athrow
      // 5d7: iload 3
      // 5d8: ifeq 5f4
      // 5db: ifge 5f3
      // 5de: goto 5e5
      // 5e1: invokestatic w54.a (Loov;)Loov;
      // 5e4: athrow
      // 5e5: aload 0
      // 5e6: ldc2_w 0.07
      // 5e9: putfield w54.blb D
      // 5ec: goto 5f3
      // 5ef: invokestatic w54.a (Loov;)Loov;
      // 5f2: athrow
      // 5f3: bipush 0
      // 5f4: istore 11
      // 5f6: iload 11
      // 5f8: bipush 4
      // 5f9: if_icmpge 6ce
      // 5fc: aload 0
      // 5fd: getfield w54.o2v D
      // 600: iload 11
      // 602: bipush 2
      // 603: irem
      // 604: i2d
      // 605: ldc2_w 0.5
      // 608: dsub
      // 609: ldc2_w 0.8
      // 60c: dmul
      // 60d: dadd
      // 60e: invokestatic fe6.jqf (D)I
      // 611: istore 12
      // 613: aload 0
      // 614: getfield w54.vbd D
      // 617: iload 11
      // 619: bipush 2
      // 61a: idiv
      // 61b: i2d
      // 61c: ldc2_w 0.5
      // 61f: dsub
      // 620: ldc2_w 0.8
      // 623: dmul
      // 624: dadd
      // 625: invokestatic fe6.jqf (D)I
      // 628: istore 13
      // 62a: bipush 0
      // 62b: iload 3
      // 62c: ifeq 6d2
      // 62f: istore 14
      // 631: iload 14
      // 633: bipush 2
      // 634: if_icmpge 6c7
      // 637: aload 0
      // 638: getfield w54.kfp D
      // 63b: invokestatic fe6.jqf (D)I
      // 63e: iload 14
      // 640: iadd
      // 641: istore 15
      // 643: new mew
      // 646: dup
      // 647: iload 12
      // 649: iload 15
      // 64b: iload 13
      // 64d: invokespecial mew.<init> (III)V
      // 650: astore 16
      // 652: aload 0
      // 653: getfield w54.oay Lt9d;
      // 656: aload 16
      // 658: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 65b: invokeinterface zfz.r_y ()Le0x; 1
      // 660: astore 17
      // 662: iload 3
      // 663: ifeq 6ca
      // 666: aload 17
      // 668: getstatic ox_.dxo Le0x;
      // 66b: iload 3
      // 66c: ifeq 6a6
      // 66f: goto 676
      // 672: invokestatic w54.a (Loov;)Loov;
      // 675: athrow
      // 676: if_acmpne 69a
      // 679: goto 680
      // 67c: invokestatic w54.a (Loov;)Loov;
      // 67f: athrow
      // 680: aload 0
      // 681: getfield w54.oay Lt9d;
      // 684: aload 16
      // 686: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 689: pop
      // 68a: aload 0
      // 68b: bipush 0
      // 68c: putfield w54.cbi Z
      // 68f: iload 3
      // 690: ifne 6c0
      // 693: goto 69a
      // 696: invokestatic w54.a (Loov;)Loov;
      // 699: athrow
      // 69a: aload 17
      // 69c: getstatic ox_.r67 Le0x;
      // 69f: goto 6a6
      // 6a2: invokestatic w54.a (Loov;)Loov;
      // 6a5: athrow
      // 6a6: if_acmpne 6c0
      // 6a9: aload 0
      // 6aa: getfield w54.oay Lt9d;
      // 6ad: aload 16
      // 6af: bipush 1
      // 6b0: invokevirtual OpaquePredicate.yir (Lmew;Z)Z
      // 6b3: pop
      // 6b4: aload 0
      // 6b5: bipush 0
      // 6b6: putfield w54.cbi Z
      // 6b9: goto 6c0
      // 6bc: invokestatic w54.a (Loov;)Loov;
      // 6bf: athrow
      // 6c0: iinc 14 1
      // 6c3: iload 3
      // 6c4: ifne 631
      // 6c7: iinc 11 1
      // 6ca: iload 3
      // 6cb: ifne 5f6
      // 6ce: aload 0
      // 6cf: getfield w54.lfk Z
      // 6d2: iload 3
      // 6d3: ifeq 72a
      // 6d6: ifeq 70b
      // 6d9: goto 6e0
      // 6dc: invokestatic w54.a (Loov;)Loov;
      // 6df: athrow
      // 6e0: aload 0
      // 6e1: dup
      // 6e2: getfield w54.icv D
      // 6e5: ldc2_w 0.5
      // 6e8: dmul
      // 6e9: putfield w54.icv D
      // 6ec: aload 0
      // 6ed: dup
      // 6ee: getfield w54.mop D
      // 6f1: ldc2_w 0.5
      // 6f4: dmul
      // 6f5: putfield w54.mop D
      // 6f8: aload 0
      // 6f9: dup
      // 6fa: getfield w54.bw4 D
      // 6fd: ldc2_w 0.5
      // 700: dmul
      // 701: putfield w54.bw4 D
      // 704: goto 70b
      // 707: invokestatic w54.a (Loov;)Loov;
      // 70a: athrow
      // 70b: aload 0
      // 70c: aload 0
      // 70d: getfield w54.icv D
      // 710: aload 0
      // 711: getfield w54.mop D
      // 714: aload 0
      // 715: getfield w54.bw4 D
      // 718: invokevirtual w54.vjj (DDD)V
      // 71b: aload 0
      // 71c: iload 3
      // 71d: ifeq 826
      // 720: getfield w54.cbi Z
      // 723: goto 72a
      // 726: invokestatic w54.a (Loov;)Loov;
      // 729: athrow
      // 72a: ifeq 806
      // 72d: dload 7
      // 72f: ldc2_w 0.2975
      // 732: dcmpl
      // 733: iload 3
      // 734: ifeq 761
      // 737: goto 73e
      // 73a: invokestatic w54.a (Loov;)Loov;
      // 73d: athrow
      // 73e: ifle 806
      // 741: goto 748
      // 744: invokestatic w54.a (Loov;)Loov;
      // 747: athrow
      // 748: aload 0
      // 749: iload 3
      // 74a: ifeq 837
      // 74d: goto 754
      // 750: invokestatic w54.a (Loov;)Loov;
      // 753: athrow
      // 754: getfield w54.oay Lt9d;
      // 757: getfield OpaquePredicate.v0f Z
      // 75a: goto 761
      // 75d: invokestatic w54.a (Loov;)Loov;
      // 760: athrow
      // 761: ifne 831
      // 764: aload 0
      // 765: iload 3
      // 766: ifeq 837
      // 769: goto 770
      // 76c: invokestatic w54.a (Loov;)Loov;
      // 76f: athrow
      // 770: getfield w54.ma9 Z
      // 773: ifne 831
      // 776: goto 77d
      // 779: invokestatic w54.a (Loov;)Loov;
      // 77c: athrow
      // 77d: aload 0
      // 77e: invokevirtual w54._kl ()V
      // 781: aload 0
      // 782: iload 3
      // 783: ifeq 837
      // 786: goto 78d
      // 789: invokestatic w54.a (Loov;)Loov;
      // 78c: athrow
      // 78d: getfield w54.oay Lt9d;
      // 790: invokevirtual OpaquePredicate.eir ()Lef9;
      // 793: sipush 2637
      // 796: ldc2_w 4342994781091551763
      // 799: lload 1
      // 79a: lxor
      // 79b: invokedynamic v (IJ)Ljava/lang/String; bsm=w54.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a0: nop
      // 7a1: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 7a4: ifeq 831
      // 7a7: goto 7ae
      // 7aa: invokestatic w54.a (Loov;)Loov;
      // 7ad: athrow
      // 7ae: bipush 0
      // 7af: istore 11
      // 7b1: iload 11
      // 7b3: bipush 3
      // 7b4: if_icmpge 7d6
      // 7b7: aload 0
      // 7b8: getstatic ox_.wb7 Le0x;
      // 7bb: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 7be: bipush 1
      // 7bf: fconst_0
      // 7c0: invokevirtual w54.bhk (Lu7m;IF)Lnvf;
      // 7c3: pop
      // 7c4: iinc 11 1
      // 7c7: iload 3
      // 7c8: ifeq 7d9
      // 7cb: iload 3
      // 7cc: ifne 7b1
      // 7cf: goto 7d6
      // 7d2: invokestatic w54.a (Loov;)Loov;
      // 7d5: athrow
      // 7d6: bipush 0
      // 7d7: istore 11
      // 7d9: iload 11
      // 7db: bipush 2
      // 7dc: if_icmpge 802
      // 7df: aload 0
      // 7e0: getstatic xbr.t1j Lu7m;
      // 7e3: bipush 1
      // 7e4: fconst_0
      // 7e5: invokevirtual w54.bhk (Lu7m;IF)Lnvf;
      // 7e8: pop
      // 7e9: iinc 11 1
      // 7ec: iload 3
      // 7ed: ifeq 836
      // 7f0: goto 7f7
      // 7f3: invokestatic w54.a (Loov;)Loov;
      // 7f6: athrow
      // 7f7: iload 3
      // 7f8: ifne 7d9
      // 7fb: goto 802
      // 7fe: invokestatic w54.a (Loov;)Loov;
      // 801: athrow
      // 802: iload 3
      // 803: ifne 831
      // 806: aload 0
      // 807: dup
      // 808: getfield w54.icv D
      // 80b: ldc2_w 0.9900000095367432
      // 80e: dmul
      // 80f: putfield w54.icv D
      // 812: aload 0
      // 813: dup
      // 814: getfield w54.mop D
      // 817: ldc2_w 0.949999988079071
      // 81a: dmul
      // 81b: putfield w54.mop D
      // 81e: aload 0
      // 81f: goto 826
      // 822: invokestatic w54.a (Loov;)Loov;
      // 825: athrow
      // 826: dup
      // 827: getfield w54.bw4 D
      // 82a: ldc2_w 0.9900000095367432
      // 82d: dmul
      // 82e: putfield w54.bw4 D
      // 831: aload 0
      // 832: fconst_0
      // 833: putfield w54.y2i F
      // 836: aload 0
      // 837: getfield w54.x5k F
      // 83a: f2d
      // 83b: dstore 11
      // 83d: aload 0
      // 83e: getfield w54.bc1 D
      // 841: aload 0
      // 842: getfield w54.o2v D
      // 845: dsub
      // 846: dstore 13
      // 848: aload 0
      // 849: getfield w54.a4d D
      // 84c: aload 0
      // 84d: getfield w54.vbd D
      // 850: dsub
      // 851: dstore 15
      // 853: dload 13
      // 855: dload 13
      // 857: dmul
      // 858: dload 15
      // 85a: dload 15
      // 85c: dmul
      // 85d: dadd
      // 85e: ldc2_w 0.001
      // 861: iload 3
      // 862: ifeq 88a
      // 865: dcmpl
      // 866: ifle 883
      // 869: goto 870
      // 86c: invokestatic w54.a (Loov;)Loov;
      // 86f: athrow
      // 870: dload 15
      // 872: dload 13
      // 874: invokestatic fe6.yr8 (DD)D
      // 877: ldc2_w 180.0
      // 87a: dmul
      // 87b: ldc2_w 3.141592653589793
      // 87e: ddiv
      // 87f: d2f
      // 880: f2d
      // 881: dstore 11
      // 883: dload 11
      // 885: aload 0
      // 886: getfield w54.x5k F
      // 889: f2d
      // 88a: dsub
      // 88b: invokestatic fe6.lrs (D)D
      // 88e: dstore 17
      // 890: dload 17
      // 892: ldc2_w 20.0
      // 895: dcmpl
      // 896: iload 3
      // 897: ifeq 8af
      // 89a: ifle 8a9
      // 89d: goto 8a4
      // 8a0: invokestatic w54.a (Loov;)Loov;
      // 8a3: athrow
      // 8a4: ldc2_w 20.0
      // 8a7: dstore 17
      // 8a9: dload 17
      // 8ab: ldc2_w -20.0
      // 8ae: dcmpg
      // 8af: iload 3
      // 8b0: ifeq 8ed
      // 8b3: ifge 8c2
      // 8b6: goto 8bd
      // 8b9: invokestatic w54.a (Loov;)Loov;
      // 8bc: athrow
      // 8bd: ldc2_w -20.0
      // 8c0: dstore 17
      // 8c2: aload 0
      // 8c3: aload 0
      // 8c4: getfield w54.x5k F
      // 8c7: f2d
      // 8c8: dload 17
      // 8ca: dadd
      // 8cb: d2f
      // 8cc: putfield w54.x5k F
      // 8cf: aload 0
      // 8d0: aload 0
      // 8d1: getfield w54.x5k F
      // 8d4: aload 0
      // 8d5: getfield w54.y2i F
      // 8d8: invokevirtual w54.iym (FF)V
      // 8db: aload 0
      // 8dc: getfield w54.oay Lt9d;
      // 8df: iload 3
      // 8e0: ifeq 8fb
      // 8e3: getfield OpaquePredicate.v0f Z
      // 8e6: goto 8ed
      // 8e9: invokestatic w54.a (Loov;)Loov;
      // 8ec: athrow
      // 8ed: ifne 9eb
      // 8f0: aload 0
      // 8f1: getfield w54.oay Lt9d;
      // 8f4: goto 8fb
      // 8f7: invokestatic w54.a (Loov;)Loov;
      // 8fa: athrow
      // 8fb: aload 0
      // 8fc: aload 0
      // 8fd: invokevirtual w54.aaw ()Lnh4;
      // 900: ldc2_w 0.20000000298023224
      // 903: dconst_0
      // 904: ldc2_w 0.20000000298023224
      // 907: invokevirtual nh4.c2h (DDD)Lnh4;
      // 90a: invokevirtual OpaquePredicate.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 90d: astore 19
      // 90f: aload 19
      // 911: iload 3
      // 912: ifeq 921
      // 915: ifnull 9b1
      // 918: goto 91f
      // 91b: invokestatic w54.a (Loov;)Loov;
      // 91e: athrow
      // 91f: aload 19
      // 921: invokeinterface java/util/List.isEmpty ()Z 1
      // 926: iload 3
      // 927: ifeq 935
      // 92a: ifne 9b1
      // 92d: goto 934
      // 930: invokestatic w54.a (Loov;)Loov;
      // 933: athrow
      // 934: bipush 0
      // 935: istore 20
      // 937: iload 20
      // 939: aload 19
      // 93b: invokeinterface java/util/List.size ()I 1
      // 940: if_icmpge 9b1
      // 943: aload 19
      // 945: iload 20
      // 947: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 94c: checkcast EntityLivingBase
      // 94f: astore 21
      // 951: iload 3
      // 952: ifeq 9ad
      // 955: aload 21
      // 957: iload 3
      // 958: ifeq 9b5
      // 95b: goto 962
      // 95e: invokestatic w54.a (Loov;)Loov;
      // 961: athrow
      // 962: aload 0
      // 963: getfield w54.wgv Li2h;
      // 966: if_acmpeq 9aa
      // 969: goto 970
      // 96c: invokestatic w54.a (Loov;)Loov;
      // 96f: athrow
      // 970: aload 21
      // 972: invokevirtual EntityLivingBase.tfh ()Z
      // 975: iload 3
      // 976: ifeq 9a1
      // 979: goto 980
      // 97c: invokestatic w54.a (Loov;)Loov;
      // 97f: athrow
      // 980: ifeq 9aa
      // 983: goto 98a
      // 986: invokestatic w54.a (Loov;)Loov;
      // 989: athrow
      // 98a: aload 21
      // 98c: iload 3
      // 98d: ifeq 9a6
      // 990: goto 997
      // 993: invokestatic w54.a (Loov;)Loov;
      // 996: athrow
      // 997: instanceof w54
      // 99a: goto 9a1
      // 99d: invokestatic w54.a (Loov;)Loov;
      // 9a0: athrow
      // 9a1: ifeq 9aa
      // 9a4: aload 21
      // 9a6: aload 0
      // 9a7: invokevirtual EntityLivingBase.u_w (Li2h;)V
      // 9aa: iinc 20 1
      // 9ad: iload 3
      // 9ae: ifne 937
      // 9b1: aload 0
      // 9b2: getfield w54.wgv Li2h;
      // 9b5: iload 3
      // 9b6: ifeq 9d9
      // 9b9: ifnull 9eb
      // 9bc: goto 9c3
      // 9bf: invokestatic w54.a (Loov;)Loov;
      // 9c2: athrow
      // 9c3: aload 0
      // 9c4: iload 3
      // 9c5: ifeq 9e7
      // 9c8: goto 9cf
      // 9cb: invokestatic w54.a (Loov;)Loov;
      // 9ce: athrow
      // 9cf: getfield w54.wgv Li2h;
      // 9d2: goto 9d9
      // 9d5: invokestatic w54.a (Loov;)Loov;
      // 9d8: athrow
      // 9d9: getfield EntityLivingBase.ma9 Z
      // 9dc: ifeq 9eb
      // 9df: aload 0
      // 9e0: goto 9e7
      // 9e3: invokestatic w54.a (Loov;)Loov;
      // 9e6: athrow
      // 9e7: aconst_null
      // 9e8: putfield w54.wgv Li2h;
      // 9eb: return
   }

   @Override
   public void dsu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: getfield w54.wgv Li2h;
      // 0c: ifnull 6d
      // 0f: goto 16
      // 12: invokestatic w54.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic w54.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getfield w54.x5k F
      // 21: f2d
      // 22: ldc2_w 3.141592653589793
      // 25: dmul
      // 26: ldc2_w 180.0
      // 29: ddiv
      // 2a: invokestatic java/lang/Math.cos (D)D
      // 2d: ldc2_w 0.4
      // 30: dmul
      // 31: dstore 2
      // 32: aload 0
      // 33: getfield w54.x5k F
      // 36: f2d
      // 37: ldc2_w 3.141592653589793
      // 3a: dmul
      // 3b: ldc2_w 180.0
      // 3e: ddiv
      // 3f: invokestatic java/lang/Math.sin (D)D
      // 42: ldc2_w 0.4
      // 45: dmul
      // 46: dstore 4
      // 48: aload 0
      // 49: getfield w54.wgv Li2h;
      // 4c: aload 0
      // 4d: getfield w54.o2v D
      // 50: dload 2
      // 51: dadd
      // 52: aload 0
      // 53: getfield w54.kfp D
      // 56: aload 0
      // 57: invokevirtual w54.yyb ()D
      // 5a: dadd
      // 5b: aload 0
      // 5c: getfield w54.wgv Li2h;
      // 5f: invokevirtual EntityLivingBase.g4y ()D
      // 62: dadd
      // 63: aload 0
      // 64: getfield w54.vbd D
      // 67: dload 4
      // 69: dadd
      // 6a: invokevirtual EntityLivingBase.m6_ (DDD)V
      // 6d: return
   }

   @Override
   public void srs(bdo var1) {
   }

   @Override
   public void cjb(bdo var1) {
   }

   @Override
   public boolean k25(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 53
      // 09: getfield w54.wgv Li2h;
      // 0c: ifnull 52
      // 0f: goto 16
      // 12: invokestatic w54.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield w54.wgv Li2h;
      // 1a: instanceof ha9
      // 1d: iload 2
      // 1e: ifeq 59
      // 21: goto 28
      // 24: invokestatic w54.a (Loov;)Loov;
      // 27: athrow
      // 28: ifeq 52
      // 2b: goto 32
      // 2e: invokestatic w54.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: iload 2
      // 34: ifeq 53
      // 37: goto 3e
      // 3a: invokestatic w54.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getfield w54.wgv Li2h;
      // 41: aload 1
      // 42: if_acmpeq 52
      // 45: goto 4c
      // 48: invokestatic w54.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: ireturn
      // 4e: invokestatic w54.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield w54.oay Lt9d;
      // 56: getfield OpaquePredicate.v0f Z
      // 59: iload 2
      // 5a: ifeq 74
      // 5d: ifne 73
      // 60: goto 67
      // 63: invokestatic w54.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 1
      // 68: aload 0
      // 69: invokevirtual ha9.nw9 (Li2h;)V
      // 6c: goto 73
      // 6f: invokestatic w54.a (Loov;)Loov;
      // 72: athrow
      // 73: bipush 1
      // 74: ireturn
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
      // 000: getstatic w54.b J
      // 003: ldc2_w 15778486377510
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 8
      // 00e: iload 3
      // 00f: iload 8
      // 011: ifeq 02d
      // 014: ifeq 111
      // 017: goto 01e
      // 01a: invokestatic w54.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield w54.o_8 F
      // 022: ldc 3.0
      // 024: nop
      // 025: fcmpl
      // 026: goto 02d
      // 029: invokestatic w54.a (Loov;)Loov;
      // 02c: athrow
      // 02d: iload 8
      // 02f: ifeq 05f
      // 032: ifle 158
      // 035: goto 03c
      // 038: invokestatic w54.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 0
      // 03d: aload 0
      // 03e: getfield w54.o_8 F
      // 041: fconst_1
      // 042: invokevirtual w54.ibc (FF)V
      // 045: aload 0
      // 046: iload 8
      // 048: ifeq 108
      // 04b: goto 052
      // 04e: invokestatic w54.a (Loov;)Loov;
      // 051: athrow
      // 052: getfield w54.oay Lt9d;
      // 055: getfield OpaquePredicate.v0f Z
      // 058: goto 05f
      // 05b: invokestatic w54.a (Loov;)Loov;
      // 05e: athrow
      // 05f: ifne 107
      // 062: aload 0
      // 063: iload 8
      // 065: ifeq 108
      // 068: goto 06f
      // 06b: invokestatic w54.a (Loov;)Loov;
      // 06e: athrow
      // 06f: getfield w54.ma9 Z
      // 072: ifne 107
      // 075: goto 07c
      // 078: invokestatic w54.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: invokevirtual w54._kl ()V
      // 080: aload 0
      // 081: iload 8
      // 083: ifeq 108
      // 086: goto 08d
      // 089: invokestatic w54.a (Loov;)Loov;
      // 08c: athrow
      // 08d: getfield w54.oay Lt9d;
      // 090: invokevirtual OpaquePredicate.eir ()Lef9;
      // 093: sipush 2637
      // 096: ldc2_w 4343013813542709334
      // 099: lload 6
      // 09b: lxor
      // 09c: invokedynamic v (IJ)Ljava/lang/String; bsm=w54.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0a5: ifeq 107
      // 0a8: goto 0af
      // 0ab: invokestatic w54.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: bipush 0
      // 0b0: istore 9
      // 0b2: iload 9
      // 0b4: bipush 3
      // 0b5: if_icmpge 0d9
      // 0b8: aload 0
      // 0b9: getstatic ox_.wb7 Le0x;
      // 0bc: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0bf: bipush 1
      // 0c0: fconst_0
      // 0c1: invokevirtual w54.bhk (Lu7m;IF)Lnvf;
      // 0c4: pop
      // 0c5: iinc 9 1
      // 0c8: iload 8
      // 0ca: ifeq 0dc
      // 0cd: iload 8
      // 0cf: ifne 0b2
      // 0d2: goto 0d9
      // 0d5: invokestatic w54.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: bipush 0
      // 0da: istore 9
      // 0dc: iload 9
      // 0de: bipush 2
      // 0df: if_icmpge 107
      // 0e2: aload 0
      // 0e3: getstatic xbr.t1j Lu7m;
      // 0e6: bipush 1
      // 0e7: fconst_0
      // 0e8: invokevirtual w54.bhk (Lu7m;IF)Lnvf;
      // 0eb: pop
      // 0ec: iinc 9 1
      // 0ef: iload 8
      // 0f1: ifeq 10c
      // 0f4: goto 0fb
      // 0f7: invokestatic w54.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: iload 8
      // 0fd: ifne 0dc
      // 100: goto 107
      // 103: invokestatic w54.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 0
      // 108: fconst_0
      // 109: putfield w54.o_8 F
      // 10c: iload 8
      // 10e: ifne 158
      // 111: aload 0
      // 112: getfield w54.oay Lt9d;
      // 115: new mew
      // 118: dup
      // 119: aload 0
      // 11a: invokespecial mew.<init> (Li2h;)V
      // 11d: invokevirtual mew.eve ()Lmew;
      // 120: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 123: invokeinterface zfz.r_y ()Le0x; 1
      // 128: invokevirtual e0x.p1r ()Lp3y;
      // 12b: getstatic p3y.six Lp3y;
      // 12e: if_acmpeq 158
      // 131: goto 138
      // 134: invokestatic w54.a (Loov;)Loov;
      // 137: athrow
      // 138: dload 1
      // 139: dconst_0
      // 13a: dcmpg
      // 13b: ifge 158
      // 13e: goto 145
      // 141: invokestatic w54.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 0
      // 146: aload 0
      // 147: getfield w54.o_8 F
      // 14a: f2d
      // 14b: dload 1
      // 14c: dsub
      // 14d: d2f
      // 14e: putfield w54.o_8 F
      // 151: goto 158
      // 154: invokestatic w54.a (Loov;)Loov;
      // 157: athrow
      // 158: return
   }

   public void pve(float var1) {
      this.oit.c66(19, var1);
   }

   public float r9s() {
      return this.oit.ig2(19);
   }

   public void q87(int var1) {
      this.oit.c66(17, var1);
   }

   public int pbj() {
      return this.oit.zwc(17);
   }

   public void jdb(int var1) {
      this.oit.c66(18, var1);
   }

   public int epc() {
      return this.oit.zwc(18);
   }

   public void w8z(boolean var1) {
      this.wrh = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1705493261013736011L, 7251959306016849631L, MethodHandles.lookup().lookupClass()).a(9606426770974L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 18465377024660L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Yâ\u000f\u007fHî\u0081ç\u0093\f\u0003n\u009dî\u0017\u009bøòú3¨Ú\u0017ÏUµð\u009fGã%%\u0018¢g\u007f´\u008fV\u0099\roÂË¿°\u000e\u0002Þ'J£±2Ñ½Ý";
      int var8 = "Yâ\u000f\u007fHî\u0081ç\u0093\f\u0003n\u009dî\u0017\u009bøòú3¨Ú\u0017ÏUµð\u009fGã%%\u0018¢g\u007f´\u008fV\u0099\roÂË¿°\u000e\u0002Þ'J£±2Ñ½Ý"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19741;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("w54", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("w54" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
