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

public abstract class _f3 extends i2h implements j9i {
   private boolean qas;
   private String gmn;
   private static final int[][][] nnc;
   private int sty;
   private double nmj;
   private double gpf;
   private double dx5;
   private double w2n;
   private double f68;
   private double hai;
   private double cry;
   private double hwp;
   private static final long b;
   private static final String[] e;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public _f3(t9d var1) {
      super(var1);
      this.gz8 = true;
      this.yxc(0.98F, 0.7F);
   }

   public static _f3 _cl(t9d var0, double var1, double var3, double var5, _f3$c3d var7) {
      try {
         switch (_f3$1.bqz[var7.ordinal()]) {
            case 1:
               return new txf(var0, var1, var3, var5);
            case 2:
               return new syt(var0, var1, var3, var5);
            case 3:
               return new dqh(var0, var1, var3, var5);
            case 4:
               return new wpl(var0, var1, var3, var5);
            case 5:
               return new jig(var0, var1, var3, var5);
            case 6:
               return new q2b(var0, var1, var3, var5);
         }
      } catch (oov var8) {
         throw a(var8);
      }

      return new ewt(var0, var1, var3, var5);
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
      this.oit.kp2(20, new Integer(0));
      this.oit.kp2(21, new Integer(6));
      this.oit.kp2(22, (byte)0);
   }

   @Override
   public nh4 tjo(i2h param1) {
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
      // 06: ifeq 1e
      // 09: invokevirtual i2h.tfh ()Z
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic _f3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic _f3.a (Loov;)Loov;
      // 1d: athrow
      // 1e: invokevirtual i2h.aaw ()Lnh4;
      // 21: goto 25
      // 24: aconst_null
      // 25: areturn
   }

   @Override
   public nh4 q3r() {
      return null;
   }

   @Override
   public boolean tfh() {
      return true;
   }

   public _f3(t9d var1, double var2, double var4, double var6) {
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
      return 0.0;
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
      // 005: getfield _f3.oay Lt9d;
      // 008: getfield t9d.v0f Z
      // 00b: iload 3
      // 00c: ifeq 150
      // 00f: ifne 14f
      // 012: goto 019
      // 015: invokestatic _f3.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield _f3.ma9 Z
      // 01d: iload 3
      // 01e: ifeq 150
      // 021: goto 028
      // 024: invokestatic _f3.a (Loov;)Loov;
      // 027: athrow
      // 028: ifne 14f
      // 02b: goto 032
      // 02e: invokestatic _f3.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: aload 1
      // 034: invokevirtual _f3.nss (Lofh;)Z
      // 037: iload 3
      // 038: ifeq 07a
      // 03b: goto 042
      // 03e: invokestatic _f3.a (Loov;)Loov;
      // 041: athrow
      // 042: ifeq 052
      // 045: goto 04c
      // 048: invokestatic _f3.a (Loov;)Loov;
      // 04b: athrow
      // 04c: bipush 0
      // 04d: ireturn
      // 04e: invokestatic _f3.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: aload 0
      // 054: invokevirtual _f3.ov7 ()I
      // 057: ineg
      // 058: invokevirtual _f3.leq (I)V
      // 05b: aload 0
      // 05c: bipush 10
      // 05e: invokevirtual _f3.iux (I)V
      // 061: aload 0
      // 062: invokevirtual _f3.dxm ()V
      // 065: aload 0
      // 066: aload 0
      // 067: invokevirtual _f3._3r ()F
      // 06a: fload 2
      // 06b: ldc 10.0
      // 06d: nop
      // 06e: fmul
      // 06f: fadd
      // 070: invokevirtual _f3.xbf (F)V
      // 073: aload 1
      // 074: invokevirtual ofh.nra ()Li2h;
      // 077: instanceof ha9
      // 07a: iload 3
      // 07b: ifeq 09c
      // 07e: ifeq 0ae
      // 081: goto 088
      // 084: invokestatic _f3.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 1
      // 089: invokevirtual ofh.nra ()Li2h;
      // 08c: checkcast ha9
      // 08f: getfield ha9.lls Lpj2;
      // 092: getfield pj2.g40 Z
      // 095: goto 09c
      // 098: invokestatic _f3.a (Loov;)Loov;
      // 09b: athrow
      // 09c: iload 3
      // 09d: ifeq 0ab
      // 0a0: ifeq 0ae
      // 0a3: goto 0aa
      // 0a6: invokestatic _f3.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: goto 0af
      // 0ae: bipush 0
      // 0af: istore 4
      // 0b1: iload 4
      // 0b3: iload 3
      // 0b4: ifeq 0d0
      // 0b7: ifne 0de
      // 0ba: goto 0c1
      // 0bd: invokestatic _f3.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: invokevirtual _f3._3r ()F
      // 0c5: ldc 40.0
      // 0c7: nop
      // 0c8: fcmpl
      // 0c9: goto 0d0
      // 0cc: invokestatic _f3.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: iload 3
      // 0d1: ifeq 14e
      // 0d4: ifle 14d
      // 0d7: goto 0de
      // 0da: invokestatic _f3.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield _f3.wgv Li2h;
      // 0e2: iload 3
      // 0e3: ifeq 102
      // 0e6: goto 0ed
      // 0e9: invokestatic _f3.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: ifnull 109
      // 0f0: goto 0f7
      // 0f3: invokestatic _f3.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield _f3.wgv Li2h;
      // 0fb: goto 102
      // 0fe: invokestatic _f3.a (Loov;)Loov;
      // 101: athrow
      // 102: aconst_null
      // 103: checkcast i2h
      // 106: invokevirtual i2h.nw9 (Li2h;)V
      // 109: iload 4
      // 10b: iload 3
      // 10c: ifeq 12f
      // 10f: ifeq 141
      // 112: goto 119
      // 115: invokestatic _f3.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 3
      // 11b: ifeq 149
      // 11e: goto 125
      // 121: invokestatic _f3.a (Loov;)Loov;
      // 124: athrow
      // 125: invokevirtual _f3.qrh ()Z
      // 128: goto 12f
      // 12b: invokestatic _f3.a (Loov;)Loov;
      // 12e: athrow
      // 12f: ifne 141
      // 132: aload 0
      // 133: invokevirtual _f3._kl ()V
      // 136: iload 3
      // 137: ifne 14d
      // 13a: goto 141
      // 13d: invokestatic _f3.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: goto 149
      // 145: invokestatic _f3.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 1
      // 14a: invokevirtual _f3.szd (Lofh;)V
      // 14d: bipush 1
      // 14e: ireturn
      // 14f: bipush 1
      // 150: ireturn
   }

   public void szd(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _f3.b J
      // 03: ldc2_w 35439377524353
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual _f3._kl ()V
      // 11: aload 0
      // 12: getfield _f3.oay Lt9d;
      // 15: invokevirtual t9d.eir ()Lef9;
      // 18: sipush 12560
      // 1b: ldc2_w 748154193639260620
      // 1e: lload 2
      // 1f: lxor
      // 20: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 29: ifeq 65
      // 2c: new erg
      // 2f: dup
      // 30: getstatic xbr.__n Lu7m;
      // 33: bipush 1
      // 34: invokespecial erg.<init> (Lu7m;I)V
      // 37: astore 5
      // 39: aload 0
      // 3a: iload 4
      // 3c: ifeq 5e
      // 3f: getfield _f3.gmn Ljava/lang/String;
      // 42: ifnull 5d
      // 45: goto 4c
      // 48: invokestatic _f3.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 5
      // 4e: aload 0
      // 4f: getfield _f3.gmn Ljava/lang/String;
      // 52: invokevirtual erg.dou (Ljava/lang/String;)Lerg;
      // 55: pop
      // 56: goto 5d
      // 59: invokestatic _f3.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 5
      // 60: fconst_0
      // 61: invokevirtual _f3.qji (Lerg;F)Lnvf;
      // 64: pop
      // 65: return
   }

   @Override
   public void h38() {
      this.leq(-this.ov7());
      this.iux(10);
      this.xbf(this._3r() + this._3r() * 10.0F);
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
         throw a(var2);
      }

      return false;
   }

   @Override
   public void _kl() {
      super._kl();
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
      // 000: getstatic _f3.b J
      // 003: ldc2_w 4587746649463
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokevirtual _f3.hg2 ()I
      // 010: iload 3
      // 011: ifeq 035
      // 014: ifle 02f
      // 017: goto 01e
      // 01a: invokestatic _f3.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 0
      // 020: invokevirtual _f3.hg2 ()I
      // 023: bipush 1
      // 024: isub
      // 025: invokevirtual _f3.iux (I)V
      // 028: goto 02f
      // 02b: invokestatic _f3.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokevirtual _f3._3r ()F
      // 033: fconst_0
      // 034: fcmpl
      // 035: iload 3
      // 036: ifeq 05c
      // 039: ifle 054
      // 03c: goto 043
      // 03f: invokestatic _f3.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: aload 0
      // 045: invokevirtual _f3._3r ()F
      // 048: fconst_1
      // 049: fsub
      // 04a: invokevirtual _f3.xbf (F)V
      // 04d: goto 054
      // 050: invokestatic _f3.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: getfield _f3.kfp D
      // 058: ldc2_w -64.0
      // 05b: dcmpg
      // 05c: iload 3
      // 05d: ifeq 07c
      // 060: ifge 075
      // 063: goto 06a
      // 066: invokestatic _f3.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 0
      // 06b: invokevirtual _f3.d0m ()V
      // 06e: goto 075
      // 071: invokestatic _f3.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: getfield _f3.oay Lt9d;
      // 079: getfield t9d.v0f Z
      // 07c: iload 3
      // 07d: ifeq 201
      // 080: ifne 1fa
      // 083: goto 08a
      // 086: invokestatic _f3.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield _f3.oay Lt9d;
      // 08e: instanceof dug
      // 091: iload 3
      // 092: ifeq 201
      // 095: goto 09c
      // 098: invokestatic _f3.a (Loov;)Loov;
      // 09b: athrow
      // 09c: ifeq 1fa
      // 09f: goto 0a6
      // 0a2: invokestatic _f3.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield _f3.oay Lt9d;
      // 0aa: getfield t9d.e8t Luan;
      // 0ad: sipush 3932
      // 0b0: ldc2_w 5376615455966641275
      // 0b3: lload 1
      // 0b4: lxor
      // 0b5: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0be: aload 0
      // 0bf: getfield _f3.oay Lt9d;
      // 0c2: checkcast dug
      // 0c5: invokevirtual dug.ve6 ()Lvr1;
      // 0c8: astore 4
      // 0ca: aload 0
      // 0cb: invokevirtual _f3.cu2 ()I
      // 0ce: istore 5
      // 0d0: aload 0
      // 0d1: getfield _f3.jjl Z
      // 0d4: iload 3
      // 0d5: ifeq 190
      // 0d8: ifeq 185
      // 0db: goto 0e2
      // 0de: invokestatic _f3.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 4
      // 0e4: invokevirtual vr1.ksh ()Z
      // 0e7: iload 3
      // 0e8: ifeq 1dc
      // 0eb: goto 0f2
      // 0ee: invokestatic _f3.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: ifeq 1cd
      // 0f5: goto 0fc
      // 0f8: invokestatic _f3.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: iload 3
      // 0fe: ifeq 17d
      // 101: goto 108
      // 104: invokestatic _f3.a (Loov;)Loov;
      // 107: athrow
      // 108: getfield _f3.hzp Li2h;
      // 10b: ifnonnull 17c
      // 10e: goto 115
      // 111: invokestatic _f3.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: dup
      // 117: getfield _f3.cyu I
      // 11a: iload 3
      // 11b: ifeq 17e
      // 11e: goto 125
      // 121: invokestatic _f3.a (Loov;)Loov;
      // 124: athrow
      // 125: dup_x1
      // 126: bipush 1
      // 127: iadd
      // 128: putfield _f3.cyu I
      // 12b: iload 5
      // 12d: if_icmplt 17c
      // 130: goto 137
      // 133: invokestatic _f3.a (Loov;)Loov;
      // 136: athrow
      // 137: aload 0
      // 138: iload 5
      // 13a: putfield _f3.cyu I
      // 13d: aload 0
      // 13e: aload 0
      // 13f: invokevirtual _f3.k0g ()I
      // 142: putfield _f3.rr6 I
      // 145: aload 0
      // 146: getfield _f3.oay Lt9d;
      // 149: getfield t9d.vzz Lupn;
      // 14c: invokevirtual upn.gs_ ()I
      // 14f: iload 3
      // 150: ifeq 174
      // 153: goto 15a
      // 156: invokestatic _f3.a (Loov;)Loov;
      // 159: athrow
      // 15a: bipush -1
      // 15b: if_icmpne 16c
      // 15e: goto 165
      // 161: invokestatic _f3.a (Loov;)Loov;
      // 164: athrow
      // 165: bipush 0
      // 166: istore 6
      // 168: iload 3
      // 169: ifne 176
      // 16c: bipush -1
      // 16d: goto 174
      // 170: invokestatic _f3.a (Loov;)Loov;
      // 173: athrow
      // 174: istore 6
      // 176: aload 0
      // 177: iload 6
      // 179: invokevirtual _f3.zye (I)V
      // 17c: aload 0
      // 17d: bipush 0
      // 17e: putfield _f3.jjl Z
      // 181: iload 3
      // 182: ifne 1cd
      // 185: aload 0
      // 186: getfield _f3.cyu I
      // 189: goto 190
      // 18c: invokestatic _f3.a (Loov;)Loov;
      // 18f: athrow
      // 190: iload 3
      // 191: ifeq 1b3
      // 194: ifle 1af
      // 197: goto 19e
      // 19a: invokestatic _f3.a (Loov;)Loov;
      // 19d: athrow
      // 19e: aload 0
      // 19f: dup
      // 1a0: getfield _f3.cyu I
      // 1a3: bipush 4
      // 1a4: isub
      // 1a5: putfield _f3.cyu I
      // 1a8: goto 1af
      // 1ab: invokestatic _f3.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: getfield _f3.cyu I
      // 1b3: iload 3
      // 1b4: ifeq 1dc
      // 1b7: ifge 1cd
      // 1ba: goto 1c1
      // 1bd: invokestatic _f3.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: bipush 0
      // 1c3: putfield _f3.cyu I
      // 1c6: goto 1cd
      // 1c9: invokestatic _f3.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: iload 3
      // 1cf: ifeq 1f1
      // 1d2: getfield _f3.rr6 I
      // 1d5: goto 1dc
      // 1d8: invokestatic _f3.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: ifle 1f0
      // 1df: aload 0
      // 1e0: dup
      // 1e1: getfield _f3.rr6 I
      // 1e4: bipush 1
      // 1e5: isub
      // 1e6: putfield _f3.rr6 I
      // 1e9: goto 1f0
      // 1ec: invokestatic _f3.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield _f3.oay Lt9d;
      // 1f4: getfield t9d.e8t Luan;
      // 1f7: invokevirtual uan.uio ()V
      // 1fa: aload 0
      // 1fb: getfield _f3.oay Lt9d;
      // 1fe: getfield t9d.v0f Z
      // 201: iload 3
      // 202: ifeq 324
      // 205: ifeq 2f2
      // 208: goto 20f
      // 20b: invokestatic _f3.a (Loov;)Loov;
      // 20e: athrow
      // 20f: aload 0
      // 210: iload 3
      // 211: ifeq 2e3
      // 214: goto 21b
      // 217: invokestatic _f3.a (Loov;)Loov;
      // 21a: athrow
      // 21b: getfield _f3.sty I
      // 21e: ifle 2cb
      // 221: goto 228
      // 224: invokestatic _f3.a (Loov;)Loov;
      // 227: athrow
      // 228: aload 0
      // 229: getfield _f3.o2v D
      // 22c: aload 0
      // 22d: getfield _f3.nmj D
      // 230: aload 0
      // 231: getfield _f3.o2v D
      // 234: dsub
      // 235: aload 0
      // 236: getfield _f3.sty I
      // 239: i2d
      // 23a: ddiv
      // 23b: dadd
      // 23c: dstore 4
      // 23e: aload 0
      // 23f: getfield _f3.kfp D
      // 242: aload 0
      // 243: getfield _f3.gpf D
      // 246: aload 0
      // 247: getfield _f3.kfp D
      // 24a: dsub
      // 24b: aload 0
      // 24c: getfield _f3.sty I
      // 24f: i2d
      // 250: ddiv
      // 251: dadd
      // 252: dstore 6
      // 254: aload 0
      // 255: getfield _f3.vbd D
      // 258: aload 0
      // 259: getfield _f3.dx5 D
      // 25c: aload 0
      // 25d: getfield _f3.vbd D
      // 260: dsub
      // 261: aload 0
      // 262: getfield _f3.sty I
      // 265: i2d
      // 266: ddiv
      // 267: dadd
      // 268: dstore 8
      // 26a: aload 0
      // 26b: getfield _f3.w2n D
      // 26e: aload 0
      // 26f: getfield _f3.x5k F
      // 272: f2d
      // 273: dsub
      // 274: invokestatic fe6.lrs (D)D
      // 277: dstore 10
      // 279: aload 0
      // 27a: aload 0
      // 27b: getfield _f3.x5k F
      // 27e: f2d
      // 27f: dload 10
      // 281: aload 0
      // 282: getfield _f3.sty I
      // 285: i2d
      // 286: ddiv
      // 287: dadd
      // 288: d2f
      // 289: putfield _f3.x5k F
      // 28c: aload 0
      // 28d: aload 0
      // 28e: getfield _f3.y2i F
      // 291: f2d
      // 292: aload 0
      // 293: getfield _f3.f68 D
      // 296: aload 0
      // 297: getfield _f3.y2i F
      // 29a: f2d
      // 29b: dsub
      // 29c: aload 0
      // 29d: getfield _f3.sty I
      // 2a0: i2d
      // 2a1: ddiv
      // 2a2: dadd
      // 2a3: d2f
      // 2a4: putfield _f3.y2i F
      // 2a7: aload 0
      // 2a8: dup
      // 2a9: getfield _f3.sty I
      // 2ac: bipush 1
      // 2ad: isub
      // 2ae: putfield _f3.sty I
      // 2b1: aload 0
      // 2b2: dload 4
      // 2b4: dload 6
      // 2b6: dload 8
      // 2b8: invokevirtual _f3.m6_ (DDD)V
      // 2bb: aload 0
      // 2bc: aload 0
      // 2bd: getfield _f3.x5k F
      // 2c0: aload 0
      // 2c1: getfield _f3.y2i F
      // 2c4: invokevirtual _f3.iym (FF)V
      // 2c7: iload 3
      // 2c8: ifne 5bc
      // 2cb: aload 0
      // 2cc: aload 0
      // 2cd: getfield _f3.o2v D
      // 2d0: aload 0
      // 2d1: getfield _f3.kfp D
      // 2d4: aload 0
      // 2d5: getfield _f3.vbd D
      // 2d8: invokevirtual _f3.m6_ (DDD)V
      // 2db: aload 0
      // 2dc: goto 2e3
      // 2df: invokestatic _f3.a (Loov;)Loov;
      // 2e2: athrow
      // 2e3: aload 0
      // 2e4: getfield _f3.x5k F
      // 2e7: aload 0
      // 2e8: getfield _f3.y2i F
      // 2eb: invokevirtual _f3.iym (FF)V
      // 2ee: iload 3
      // 2ef: ifne 5bc
      // 2f2: aload 0
      // 2f3: aload 0
      // 2f4: getfield _f3.o2v D
      // 2f7: putfield _f3.bc1 D
      // 2fa: aload 0
      // 2fb: aload 0
      // 2fc: getfield _f3.kfp D
      // 2ff: putfield _f3.o_z D
      // 302: aload 0
      // 303: aload 0
      // 304: getfield _f3.vbd D
      // 307: putfield _f3.a4d D
      // 30a: aload 0
      // 30b: dup
      // 30c: getfield _f3.mop D
      // 30f: ldc2_w 0.03999999910593033
      // 312: dsub
      // 313: putfield _f3.mop D
      // 316: aload 0
      // 317: getfield _f3.o2v D
      // 31a: invokestatic fe6.jqf (D)I
      // 31d: goto 324
      // 320: invokestatic _f3.a (Loov;)Loov;
      // 323: athrow
      // 324: istore 4
      // 326: aload 0
      // 327: getfield _f3.kfp D
      // 32a: invokestatic fe6.jqf (D)I
      // 32d: istore 5
      // 32f: aload 0
      // 330: getfield _f3.vbd D
      // 333: invokestatic fe6.jqf (D)I
      // 336: istore 6
      // 338: aload 0
      // 339: getfield _f3.oay Lt9d;
      // 33c: new mew
      // 33f: dup
      // 340: iload 4
      // 342: iload 5
      // 344: bipush 1
      // 345: isub
      // 346: iload 6
      // 348: invokespecial mew.<init> (III)V
      // 34b: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 34e: ifeq 35b
      // 351: iinc 5 -1
      // 354: goto 35b
      // 357: invokestatic _f3.a (Loov;)Loov;
      // 35a: athrow
      // 35b: new mew
      // 35e: dup
      // 35f: iload 4
      // 361: iload 5
      // 363: iload 6
      // 365: invokespecial mew.<init> (III)V
      // 368: astore 7
      // 36a: aload 0
      // 36b: getfield _f3.oay Lt9d;
      // 36e: aload 7
      // 370: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 373: astore 8
      // 375: aload 8
      // 377: iload 3
      // 378: ifeq 3a4
      // 37b: invokestatic y0y.al_ (Lzfz;)Z
      // 37e: ifeq 3d4
      // 381: goto 388
      // 384: invokestatic _f3.a (Loov;)Loov;
      // 387: athrow
      // 388: aload 0
      // 389: aload 7
      // 38b: aload 8
      // 38d: invokevirtual _f3.dfm (Lmew;Lzfz;)V
      // 390: iload 3
      // 391: ifeq 3e8
      // 394: goto 39b
      // 397: invokestatic _f3.a (Loov;)Loov;
      // 39a: athrow
      // 39b: aload 8
      // 39d: goto 3a4
      // 3a0: invokestatic _f3.a (Loov;)Loov;
      // 3a3: athrow
      // 3a4: invokeinterface zfz.r_y ()Le0x; 1
      // 3a9: getstatic ox_.c0r Le0x;
      // 3ac: if_acmpne 3df
      // 3af: aload 0
      // 3b0: iload 4
      // 3b2: iload 5
      // 3b4: iload 6
      // 3b6: aload 8
      // 3b8: getstatic gsz.t0z Lh76;
      // 3bb: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 3c0: checkcast java/lang/Boolean
      // 3c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3c6: invokevirtual _f3.xr9 (IIIZ)V
      // 3c9: iload 3
      // 3ca: ifne 3df
      // 3cd: goto 3d4
      // 3d0: invokestatic _f3.a (Loov;)Loov;
      // 3d3: athrow
      // 3d4: aload 0
      // 3d5: invokevirtual _f3.brq ()V
      // 3d8: goto 3df
      // 3db: invokestatic _f3.a (Loov;)Loov;
      // 3de: athrow
      // 3df: aload 0
      // 3e0: invokevirtual _f3.urw ()V
      // 3e3: aload 0
      // 3e4: fconst_0
      // 3e5: putfield _f3.y2i F
      // 3e8: aload 0
      // 3e9: getfield _f3.bc1 D
      // 3ec: aload 0
      // 3ed: getfield _f3.o2v D
      // 3f0: dsub
      // 3f1: dstore 9
      // 3f3: aload 0
      // 3f4: getfield _f3.a4d D
      // 3f7: aload 0
      // 3f8: getfield _f3.vbd D
      // 3fb: dsub
      // 3fc: dstore 11
      // 3fe: dload 9
      // 400: dload 9
      // 402: dmul
      // 403: dload 11
      // 405: dload 11
      // 407: dmul
      // 408: dadd
      // 409: iload 3
      // 40a: ifeq 468
      // 40d: ldc2_w 0.001
      // 410: dcmpl
      // 411: ifle 45b
      // 414: goto 41b
      // 417: invokestatic _f3.a (Loov;)Loov;
      // 41a: athrow
      // 41b: aload 0
      // 41c: dload 11
      // 41e: dload 9
      // 420: invokestatic fe6.yr8 (DD)D
      // 423: ldc2_w 180.0
      // 426: dmul
      // 427: ldc2_w 3.141592653589793
      // 42a: ddiv
      // 42b: d2f
      // 42c: putfield _f3.x5k F
      // 42f: aload 0
      // 430: iload 3
      // 431: ifeq 45c
      // 434: goto 43b
      // 437: invokestatic _f3.a (Loov;)Loov;
      // 43a: athrow
      // 43b: getfield _f3.qas Z
      // 43e: ifeq 45b
      // 441: goto 448
      // 444: invokestatic _f3.a (Loov;)Loov;
      // 447: athrow
      // 448: aload 0
      // 449: dup
      // 44a: getfield _f3.x5k F
      // 44d: ldc 180.0
      // 44f: nop
      // 450: fadd
      // 451: putfield _f3.x5k F
      // 454: goto 45b
      // 457: invokestatic _f3.a (Loov;)Loov;
      // 45a: athrow
      // 45b: aload 0
      // 45c: getfield _f3.x5k F
      // 45f: aload 0
      // 460: getfield _f3.p3h F
      // 463: fsub
      // 464: invokestatic fe6.qsy (F)F
      // 467: f2d
      // 468: dstore 13
      // 46a: iload 3
      // 46b: ifeq 4a1
      // 46e: dload 13
      // 470: ldc2_w -170.0
      // 473: dcmpg
      // 474: iflt 48e
      // 477: goto 47e
      // 47a: invokestatic _f3.a (Loov;)Loov;
      // 47d: athrow
      // 47e: dload 13
      // 480: ldc2_w 170.0
      // 483: dcmpl
      // 484: iflt 4bc
      // 487: goto 48e
      // 48a: invokestatic _f3.a (Loov;)Loov;
      // 48d: athrow
      // 48e: aload 0
      // 48f: dup
      // 490: getfield _f3.x5k F
      // 493: ldc 180.0
      // 495: nop
      // 496: fadd
      // 497: putfield _f3.x5k F
      // 49a: goto 4a1
      // 49d: invokestatic _f3.a (Loov;)Loov;
      // 4a0: athrow
      // 4a1: aload 0
      // 4a2: aload 0
      // 4a3: getfield _f3.qas Z
      // 4a6: iload 3
      // 4a7: ifeq 4b5
      // 4aa: ifne 4b8
      // 4ad: goto 4b4
      // 4b0: invokestatic _f3.a (Loov;)Loov;
      // 4b3: athrow
      // 4b4: bipush 1
      // 4b5: goto 4b9
      // 4b8: bipush 0
      // 4b9: putfield _f3.qas Z
      // 4bc: aload 0
      // 4bd: aload 0
      // 4be: getfield _f3.x5k F
      // 4c1: aload 0
      // 4c2: getfield _f3.y2i F
      // 4c5: invokevirtual _f3.iym (FF)V
      // 4c8: aload 0
      // 4c9: getfield _f3.oay Lt9d;
      // 4cc: aload 0
      // 4cd: aload 0
      // 4ce: invokevirtual _f3.aaw ()Lnh4;
      // 4d1: ldc2_w 0.20000000298023224
      // 4d4: dconst_0
      // 4d5: ldc2_w 0.20000000298023224
      // 4d8: invokevirtual nh4.c2h (DDD)Lnh4;
      // 4db: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 4de: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4e3: astore 15
      // 4e5: aload 15
      // 4e7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4ec: ifeq 558
      // 4ef: aload 15
      // 4f1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f6: checkcast i2h
      // 4f9: astore 16
      // 4fb: aload 16
      // 4fd: iload 3
      // 4fe: ifeq 523
      // 501: aload 0
      // 502: iload 3
      // 503: ifeq 5a0
      // 506: goto 50d
      // 509: invokestatic _f3.a (Loov;)Loov;
      // 50c: athrow
      // 50d: getfield _f3.wgv Li2h;
      // 510: if_acmpeq 554
      // 513: goto 51a
      // 516: invokestatic _f3.a (Loov;)Loov;
      // 519: athrow
      // 51a: aload 16
      // 51c: goto 523
      // 51f: invokestatic _f3.a (Loov;)Loov;
      // 522: athrow
      // 523: invokevirtual i2h.tfh ()Z
      // 526: iload 3
      // 527: ifeq 54b
      // 52a: ifeq 554
      // 52d: goto 534
      // 530: invokestatic _f3.a (Loov;)Loov;
      // 533: athrow
      // 534: aload 16
      // 536: iload 3
      // 537: ifeq 550
      // 53a: goto 541
      // 53d: invokestatic _f3.a (Loov;)Loov;
      // 540: athrow
      // 541: instanceof _f3
      // 544: goto 54b
      // 547: invokestatic _f3.a (Loov;)Loov;
      // 54a: athrow
      // 54b: ifeq 554
      // 54e: aload 16
      // 550: aload 0
      // 551: invokevirtual i2h.u_w (Li2h;)V
      // 554: iload 3
      // 555: ifne 4e5
      // 558: aload 0
      // 559: iload 3
      // 55a: ifeq 5b8
      // 55d: getfield _f3.wgv Li2h;
      // 560: ifnull 5b7
      // 563: goto 56a
      // 566: invokestatic _f3.a (Loov;)Loov;
      // 569: athrow
      // 56a: aload 0
      // 56b: getfield _f3.wgv Li2h;
      // 56e: getfield i2h.ma9 Z
      // 571: iload 3
      // 572: ifeq 5bb
      // 575: goto 57c
      // 578: invokestatic _f3.a (Loov;)Loov;
      // 57b: athrow
      // 57c: ifeq 5b7
      // 57f: goto 586
      // 582: invokestatic _f3.a (Loov;)Loov;
      // 585: athrow
      // 586: aload 0
      // 587: iload 3
      // 588: ifeq 5b3
      // 58b: goto 592
      // 58e: invokestatic _f3.a (Loov;)Loov;
      // 591: athrow
      // 592: getfield _f3.wgv Li2h;
      // 595: getfield i2h.hzp Li2h;
      // 598: aload 0
      // 599: goto 5a0
      // 59c: invokestatic _f3.a (Loov;)Loov;
      // 59f: athrow
      // 5a0: if_acmpne 5b2
      // 5a3: aload 0
      // 5a4: getfield _f3.wgv Li2h;
      // 5a7: aconst_null
      // 5a8: putfield i2h.hzp Li2h;
      // 5ab: goto 5b2
      // 5ae: invokestatic _f3.a (Loov;)Loov;
      // 5b1: athrow
      // 5b2: aload 0
      // 5b3: aconst_null
      // 5b4: putfield _f3.wgv Li2h;
      // 5b7: aload 0
      // 5b8: invokevirtual _f3.r24 ()Z
      // 5bb: pop
      // 5bc: return
   }

   public double db_() {
      return 0.4;
   }

   public void xr9(int var1, int var2, int var3, boolean var4) {
   }

   public void brq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual _f3.db_ ()D
      // 04: dstore 2
      // 05: aload 0
      // 06: aload 0
      // 07: getfield _f3.icv D
      // 0a: dload 2
      // 0b: dneg
      // 0c: dload 2
      // 0d: invokestatic fe6.lft (DDD)D
      // 10: putfield _f3.icv D
      // 13: invokestatic t9d.b ()I
      // 16: aload 0
      // 17: aload 0
      // 18: getfield _f3.bw4 D
      // 1b: dload 2
      // 1c: dneg
      // 1d: dload 2
      // 1e: invokestatic fe6.lft (DDD)D
      // 21: putfield _f3.bw4 D
      // 24: istore 1
      // 25: aload 0
      // 26: getfield _f3.lfk Z
      // 29: iload 1
      // 2a: ifeq 81
      // 2d: ifeq 62
      // 30: goto 37
      // 33: invokestatic _f3.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: dup
      // 39: getfield _f3.icv D
      // 3c: ldc2_w 0.5
      // 3f: dmul
      // 40: putfield _f3.icv D
      // 43: aload 0
      // 44: dup
      // 45: getfield _f3.mop D
      // 48: ldc2_w 0.5
      // 4b: dmul
      // 4c: putfield _f3.mop D
      // 4f: aload 0
      // 50: dup
      // 51: getfield _f3.bw4 D
      // 54: ldc2_w 0.5
      // 57: dmul
      // 58: putfield _f3.bw4 D
      // 5b: goto 62
      // 5e: invokestatic _f3.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: aload 0
      // 64: getfield _f3.icv D
      // 67: aload 0
      // 68: getfield _f3.mop D
      // 6b: aload 0
      // 6c: getfield _f3.bw4 D
      // 6f: invokevirtual _f3.vjj (DDD)V
      // 72: aload 0
      // 73: iload 1
      // 74: ifeq a4
      // 77: getfield _f3.lfk Z
      // 7a: goto 81
      // 7d: invokestatic _f3.a (Loov;)Loov;
      // 80: athrow
      // 81: ifne af
      // 84: aload 0
      // 85: dup
      // 86: getfield _f3.icv D
      // 89: ldc2_w 0.949999988079071
      // 8c: dmul
      // 8d: putfield _f3.icv D
      // 90: aload 0
      // 91: dup
      // 92: getfield _f3.mop D
      // 95: ldc2_w 0.949999988079071
      // 98: dmul
      // 99: putfield _f3.mop D
      // 9c: aload 0
      // 9d: goto a4
      // a0: invokestatic _f3.a (Loov;)Loov;
      // a3: athrow
      // a4: dup
      // a5: getfield _f3.bw4 D
      // a8: ldc2_w 0.949999988079071
      // ab: dmul
      // ac: putfield _f3.bw4 D
      // af: return
   }

   public void dfm(mew param1, zfz param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fconst_0
      // 002: putfield _f3.o_8 F
      // 005: invokestatic t9d.c ()I
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield _f3.o2v D
      // 00d: aload 0
      // 00e: getfield _f3.kfp D
      // 011: aload 0
      // 012: getfield _f3.vbd D
      // 015: invokevirtual _f3.vag (DDD)Lfqr;
      // 018: astore 4
      // 01a: aload 0
      // 01b: aload 1
      // 01c: invokevirtual mew.getY ()I
      // 01f: i2d
      // 020: putfield _f3.kfp D
      // 023: bipush 0
      // 024: istore 5
      // 026: bipush 0
      // 027: istore 6
      // 029: istore 3
      // 02a: aload 2
      // 02b: invokeinterface zfz.r_y ()Le0x; 1
      // 030: checkcast y0y
      // 033: astore 7
      // 035: iload 3
      // 036: ifne 059
      // 039: aload 7
      // 03b: getstatic ox_.ujf Le0x;
      // 03e: if_acmpne 070
      // 041: goto 048
      // 044: invokestatic _f3.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 2
      // 049: getstatic gsz.t0z Lh76;
      // 04c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 051: checkcast java/lang/Boolean
      // 054: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 057: istore 5
      // 059: iload 5
      // 05b: iload 3
      // 05c: ifne 06a
      // 05f: ifne 06d
      // 062: goto 069
      // 065: invokestatic _f3.a (Loov;)Loov;
      // 068: athrow
      // 069: bipush 1
      // 06a: goto 06e
      // 06d: bipush 0
      // 06e: istore 6
      // 070: ldc2_w 0.0078125
      // 073: dstore 8
      // 075: aload 2
      // 076: aload 7
      // 078: invokevirtual y0y.fvr ()Lxny;
      // 07b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 080: checkcast y0y$_zr
      // 083: astore 10
      // 085: iload 3
      // 086: ifne 0d1
      // 089: getstatic _f3$1.mbu [I
      // 08c: aload 10
      // 08e: invokevirtual y0y$_zr.ordinal ()I
      // 091: iaload
      // 092: tableswitch 162 1 4 34 67 100 133
      // 0b0: invokestatic _f3.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: dup
      // 0b6: getfield _f3.icv D
      // 0b9: ldc2_w 0.0078125
      // 0bc: dsub
      // 0bd: putfield _f3.icv D
      // 0c0: aload 0
      // 0c1: dup
      // 0c2: getfield _f3.kfp D
      // 0c5: dconst_1
      // 0c6: dadd
      // 0c7: putfield _f3.kfp D
      // 0ca: goto 0d1
      // 0cd: invokestatic _f3.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 3
      // 0d2: ifeq 134
      // 0d5: aload 0
      // 0d6: dup
      // 0d7: getfield _f3.icv D
      // 0da: ldc2_w 0.0078125
      // 0dd: dadd
      // 0de: putfield _f3.icv D
      // 0e1: aload 0
      // 0e2: dup
      // 0e3: getfield _f3.kfp D
      // 0e6: dconst_1
      // 0e7: dadd
      // 0e8: putfield _f3.kfp D
      // 0eb: iload 3
      // 0ec: ifeq 134
      // 0ef: goto 0f6
      // 0f2: invokestatic _f3.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: dup
      // 0f8: getfield _f3.bw4 D
      // 0fb: ldc2_w 0.0078125
      // 0fe: dadd
      // 0ff: putfield _f3.bw4 D
      // 102: aload 0
      // 103: dup
      // 104: getfield _f3.kfp D
      // 107: dconst_1
      // 108: dadd
      // 109: putfield _f3.kfp D
      // 10c: iload 3
      // 10d: ifeq 134
      // 110: goto 117
      // 113: invokestatic _f3.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: dup
      // 119: getfield _f3.bw4 D
      // 11c: ldc2_w 0.0078125
      // 11f: dsub
      // 120: putfield _f3.bw4 D
      // 123: aload 0
      // 124: dup
      // 125: getfield _f3.kfp D
      // 128: dconst_1
      // 129: dadd
      // 12a: putfield _f3.kfp D
      // 12d: goto 134
      // 130: invokestatic _f3.a (Loov;)Loov;
      // 133: athrow
      // 134: getstatic _f3.nnc [[[I
      // 137: aload 10
      // 139: invokevirtual y0y$_zr.g_6 ()I
      // 13c: aaload
      // 13d: astore 11
      // 13f: aload 11
      // 141: bipush 1
      // 142: aaload
      // 143: bipush 0
      // 144: iaload
      // 145: aload 11
      // 147: bipush 0
      // 148: aaload
      // 149: bipush 0
      // 14a: iaload
      // 14b: isub
      // 14c: i2d
      // 14d: dstore 12
      // 14f: aload 11
      // 151: bipush 1
      // 152: aaload
      // 153: bipush 2
      // 154: iaload
      // 155: aload 11
      // 157: bipush 0
      // 158: aaload
      // 159: bipush 2
      // 15a: iaload
      // 15b: isub
      // 15c: i2d
      // 15d: dstore 14
      // 15f: dload 12
      // 161: dload 12
      // 163: dmul
      // 164: dload 14
      // 166: dload 14
      // 168: dmul
      // 169: dadd
      // 16a: invokestatic java/lang/Math.sqrt (D)D
      // 16d: dstore 16
      // 16f: aload 0
      // 170: getfield _f3.icv D
      // 173: dload 12
      // 175: dmul
      // 176: aload 0
      // 177: getfield _f3.bw4 D
      // 17a: dload 14
      // 17c: dmul
      // 17d: dadd
      // 17e: dstore 18
      // 180: dload 18
      // 182: dconst_0
      // 183: iload 3
      // 184: ifne 1ae
      // 187: dcmpg
      // 188: ifge 19c
      // 18b: goto 192
      // 18e: invokestatic _f3.a (Loov;)Loov;
      // 191: athrow
      // 192: dload 12
      // 194: dneg
      // 195: dstore 12
      // 197: dload 14
      // 199: dneg
      // 19a: dstore 14
      // 19c: aload 0
      // 19d: getfield _f3.icv D
      // 1a0: aload 0
      // 1a1: getfield _f3.icv D
      // 1a4: dmul
      // 1a5: aload 0
      // 1a6: getfield _f3.bw4 D
      // 1a9: aload 0
      // 1aa: getfield _f3.bw4 D
      // 1ad: dmul
      // 1ae: dadd
      // 1af: invokestatic java/lang/Math.sqrt (D)D
      // 1b2: dstore 20
      // 1b4: dload 20
      // 1b6: ldc2_w 2.0
      // 1b9: dcmpl
      // 1ba: iload 3
      // 1bb: ifne 1ec
      // 1be: ifle 1cd
      // 1c1: goto 1c8
      // 1c4: invokestatic _f3.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: ldc2_w 2.0
      // 1cb: dstore 20
      // 1cd: aload 0
      // 1ce: dload 20
      // 1d0: dload 12
      // 1d2: dmul
      // 1d3: dload 16
      // 1d5: ddiv
      // 1d6: putfield _f3.icv D
      // 1d9: aload 0
      // 1da: dload 20
      // 1dc: dload 14
      // 1de: dmul
      // 1df: dload 16
      // 1e1: ddiv
      // 1e2: putfield _f3.bw4 D
      // 1e5: aload 0
      // 1e6: getfield _f3.wgv Li2h;
      // 1e9: instanceof g_3
      // 1ec: iload 3
      // 1ed: ifne 290
      // 1f0: ifeq 28e
      // 1f3: goto 1fa
      // 1f6: invokestatic _f3.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: getfield _f3.wgv Li2h;
      // 1fe: checkcast g_3
      // 201: getfield g_3.ooc F
      // 204: f2d
      // 205: dstore 22
      // 207: dload 22
      // 209: dconst_0
      // 20a: dcmpl
      // 20b: iload 3
      // 20c: ifne 290
      // 20f: ifle 28e
      // 212: goto 219
      // 215: invokestatic _f3.a (Loov;)Loov;
      // 218: athrow
      // 219: aload 0
      // 21a: getfield _f3.wgv Li2h;
      // 21d: getfield i2h.x5k F
      // 220: ldc 3.1415927
      // 222: nop
      // 223: fmul
      // 224: ldc 180.0
      // 226: nop
      // 227: fdiv
      // 228: f2d
      // 229: invokestatic java/lang/Math.sin (D)D
      // 22c: dneg
      // 22d: dstore 24
      // 22f: aload 0
      // 230: getfield _f3.wgv Li2h;
      // 233: getfield i2h.x5k F
      // 236: ldc 3.1415927
      // 238: nop
      // 239: fmul
      // 23a: ldc 180.0
      // 23c: nop
      // 23d: fdiv
      // 23e: f2d
      // 23f: invokestatic java/lang/Math.cos (D)D
      // 242: dstore 26
      // 244: aload 0
      // 245: getfield _f3.icv D
      // 248: aload 0
      // 249: getfield _f3.icv D
      // 24c: dmul
      // 24d: aload 0
      // 24e: getfield _f3.bw4 D
      // 251: aload 0
      // 252: getfield _f3.bw4 D
      // 255: dmul
      // 256: dadd
      // 257: dstore 28
      // 259: dload 28
      // 25b: ldc2_w 0.01
      // 25e: dcmpg
      // 25f: iload 3
      // 260: ifne 290
      // 263: ifge 28e
      // 266: goto 26d
      // 269: invokestatic _f3.a (Loov;)Loov;
      // 26c: athrow
      // 26d: aload 0
      // 26e: dup
      // 26f: getfield _f3.icv D
      // 272: dload 24
      // 274: ldc2_w 0.1
      // 277: dmul
      // 278: dadd
      // 279: putfield _f3.icv D
      // 27c: aload 0
      // 27d: dup
      // 27e: getfield _f3.bw4 D
      // 281: dload 26
      // 283: ldc2_w 0.1
      // 286: dmul
      // 287: dadd
      // 288: putfield _f3.bw4 D
      // 28b: bipush 0
      // 28c: istore 6
      // 28e: iload 6
      // 290: ifeq 311
      // 293: aload 0
      // 294: getfield _f3.icv D
      // 297: aload 0
      // 298: getfield _f3.icv D
      // 29b: dmul
      // 29c: aload 0
      // 29d: getfield _f3.bw4 D
      // 2a0: aload 0
      // 2a1: getfield _f3.bw4 D
      // 2a4: dmul
      // 2a5: dadd
      // 2a6: invokestatic java/lang/Math.sqrt (D)D
      // 2a9: dstore 22
      // 2ab: iload 3
      // 2ac: ifne 305
      // 2af: dload 22
      // 2b1: ldc2_w 0.03
      // 2b4: dcmpg
      // 2b5: ifge 2e8
      // 2b8: goto 2bf
      // 2bb: invokestatic _f3.a (Loov;)Loov;
      // 2be: athrow
      // 2bf: aload 0
      // 2c0: dup
      // 2c1: getfield _f3.icv D
      // 2c4: dconst_0
      // 2c5: dmul
      // 2c6: putfield _f3.icv D
      // 2c9: aload 0
      // 2ca: dup
      // 2cb: getfield _f3.mop D
      // 2ce: dconst_0
      // 2cf: dmul
      // 2d0: putfield _f3.mop D
      // 2d3: aload 0
      // 2d4: dup
      // 2d5: getfield _f3.bw4 D
      // 2d8: dconst_0
      // 2d9: dmul
      // 2da: putfield _f3.bw4 D
      // 2dd: iload 3
      // 2de: ifeq 311
      // 2e1: goto 2e8
      // 2e4: invokestatic _f3.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: aload 0
      // 2e9: dup
      // 2ea: getfield _f3.icv D
      // 2ed: ldc2_w 0.5
      // 2f0: dmul
      // 2f1: putfield _f3.icv D
      // 2f4: aload 0
      // 2f5: dup
      // 2f6: getfield _f3.mop D
      // 2f9: dconst_0
      // 2fa: dmul
      // 2fb: putfield _f3.mop D
      // 2fe: goto 305
      // 301: invokestatic _f3.a (Loov;)Loov;
      // 304: athrow
      // 305: aload 0
      // 306: dup
      // 307: getfield _f3.bw4 D
      // 30a: ldc2_w 0.5
      // 30d: dmul
      // 30e: putfield _f3.bw4 D
      // 311: dconst_0
      // 312: dstore 22
      // 314: aload 1
      // 315: invokevirtual mew.getX ()I
      // 318: i2d
      // 319: ldc2_w 0.5
      // 31c: dadd
      // 31d: aload 11
      // 31f: bipush 0
      // 320: aaload
      // 321: bipush 0
      // 322: iaload
      // 323: i2d
      // 324: ldc2_w 0.5
      // 327: dmul
      // 328: dadd
      // 329: dstore 24
      // 32b: aload 1
      // 32c: invokevirtual mew.getZ ()I
      // 32f: i2d
      // 330: ldc2_w 0.5
      // 333: dadd
      // 334: aload 11
      // 336: bipush 0
      // 337: aaload
      // 338: bipush 2
      // 339: iaload
      // 33a: i2d
      // 33b: ldc2_w 0.5
      // 33e: dmul
      // 33f: dadd
      // 340: dstore 26
      // 342: aload 1
      // 343: invokevirtual mew.getX ()I
      // 346: i2d
      // 347: ldc2_w 0.5
      // 34a: dadd
      // 34b: aload 11
      // 34d: bipush 1
      // 34e: aaload
      // 34f: bipush 0
      // 350: iaload
      // 351: i2d
      // 352: ldc2_w 0.5
      // 355: dmul
      // 356: dadd
      // 357: dstore 28
      // 359: aload 1
      // 35a: invokevirtual mew.getZ ()I
      // 35d: i2d
      // 35e: ldc2_w 0.5
      // 361: dadd
      // 362: aload 11
      // 364: bipush 1
      // 365: aaload
      // 366: bipush 2
      // 367: iaload
      // 368: i2d
      // 369: ldc2_w 0.5
      // 36c: dmul
      // 36d: dadd
      // 36e: dstore 30
      // 370: dload 28
      // 372: dload 24
      // 374: dsub
      // 375: dstore 12
      // 377: dload 30
      // 379: dload 26
      // 37b: dsub
      // 37c: dstore 14
      // 37e: dload 12
      // 380: dconst_0
      // 381: dcmpl
      // 382: iload 3
      // 383: ifne 3c3
      // 386: ifne 3ad
      // 389: goto 390
      // 38c: invokestatic _f3.a (Loov;)Loov;
      // 38f: athrow
      // 390: aload 0
      // 391: aload 1
      // 392: invokevirtual mew.getX ()I
      // 395: i2d
      // 396: ldc2_w 0.5
      // 399: dadd
      // 39a: putfield _f3.o2v D
      // 39d: aload 0
      // 39e: getfield _f3.vbd D
      // 3a1: aload 1
      // 3a2: invokevirtual mew.getZ ()I
      // 3a5: i2d
      // 3a6: dsub
      // 3a7: dstore 22
      // 3a9: iload 3
      // 3aa: ifeq 40d
      // 3ad: dload 14
      // 3af: dconst_0
      // 3b0: iload 3
      // 3b1: ifne 3f0
      // 3b4: goto 3bb
      // 3b7: invokestatic _f3.a (Loov;)Loov;
      // 3ba: athrow
      // 3bb: dcmpl
      // 3bc: goto 3c3
      // 3bf: invokestatic _f3.a (Loov;)Loov;
      // 3c2: athrow
      // 3c3: ifne 3e3
      // 3c6: aload 0
      // 3c7: aload 1
      // 3c8: invokevirtual mew.getZ ()I
      // 3cb: i2d
      // 3cc: ldc2_w 0.5
      // 3cf: dadd
      // 3d0: putfield _f3.vbd D
      // 3d3: aload 0
      // 3d4: getfield _f3.o2v D
      // 3d7: aload 1
      // 3d8: invokevirtual mew.getX ()I
      // 3db: i2d
      // 3dc: dsub
      // 3dd: dstore 22
      // 3df: iload 3
      // 3e0: ifeq 40d
      // 3e3: aload 0
      // 3e4: getfield _f3.o2v D
      // 3e7: dload 24
      // 3e9: goto 3f0
      // 3ec: invokestatic _f3.a (Loov;)Loov;
      // 3ef: athrow
      // 3f0: dsub
      // 3f1: dstore 32
      // 3f3: aload 0
      // 3f4: getfield _f3.vbd D
      // 3f7: dload 26
      // 3f9: dsub
      // 3fa: dstore 34
      // 3fc: dload 32
      // 3fe: dload 12
      // 400: dmul
      // 401: dload 34
      // 403: dload 14
      // 405: dmul
      // 406: dadd
      // 407: ldc2_w 2.0
      // 40a: dmul
      // 40b: dstore 22
      // 40d: aload 0
      // 40e: dload 24
      // 410: dload 12
      // 412: dload 22
      // 414: dmul
      // 415: dadd
      // 416: putfield _f3.o2v D
      // 419: aload 0
      // 41a: dload 26
      // 41c: dload 14
      // 41e: dload 22
      // 420: dmul
      // 421: dadd
      // 422: putfield _f3.vbd D
      // 425: aload 0
      // 426: aload 0
      // 427: getfield _f3.o2v D
      // 42a: aload 0
      // 42b: getfield _f3.kfp D
      // 42e: aload 0
      // 42f: getfield _f3.vbd D
      // 432: invokevirtual _f3.m6_ (DDD)V
      // 435: aload 0
      // 436: getfield _f3.icv D
      // 439: dstore 32
      // 43b: aload 0
      // 43c: getfield _f3.bw4 D
      // 43f: dstore 34
      // 441: aload 0
      // 442: iload 3
      // 443: ifne 464
      // 446: getfield _f3.wgv Li2h;
      // 449: ifnull 463
      // 44c: goto 453
      // 44f: invokestatic _f3.a (Loov;)Loov;
      // 452: athrow
      // 453: dload 32
      // 455: ldc2_w 0.75
      // 458: dmul
      // 459: dstore 32
      // 45b: dload 34
      // 45d: ldc2_w 0.75
      // 460: dmul
      // 461: dstore 34
      // 463: aload 0
      // 464: invokevirtual _f3.db_ ()D
      // 467: dstore 36
      // 469: dload 32
      // 46b: dload 36
      // 46d: dneg
      // 46e: dload 36
      // 470: invokestatic fe6.lft (DDD)D
      // 473: dstore 32
      // 475: dload 34
      // 477: dload 36
      // 479: dneg
      // 47a: dload 36
      // 47c: invokestatic fe6.lft (DDD)D
      // 47f: dstore 34
      // 481: aload 0
      // 482: dload 32
      // 484: dconst_0
      // 485: dload 34
      // 487: invokevirtual _f3.vjj (DDD)V
      // 48a: aload 11
      // 48c: bipush 0
      // 48d: aaload
      // 48e: bipush 1
      // 48f: iaload
      // 490: iload 3
      // 491: ifne 51c
      // 494: ifeq 50f
      // 497: goto 49e
      // 49a: invokestatic _f3.a (Loov;)Loov;
      // 49d: athrow
      // 49e: aload 0
      // 49f: getfield _f3.o2v D
      // 4a2: invokestatic fe6.jqf (D)I
      // 4a5: aload 1
      // 4a6: invokevirtual mew.getX ()I
      // 4a9: isub
      // 4aa: iload 3
      // 4ab: ifne 51c
      // 4ae: goto 4b5
      // 4b1: invokestatic _f3.a (Loov;)Loov;
      // 4b4: athrow
      // 4b5: aload 11
      // 4b7: bipush 0
      // 4b8: aaload
      // 4b9: bipush 0
      // 4ba: iaload
      // 4bb: if_icmpne 50f
      // 4be: goto 4c5
      // 4c1: invokestatic _f3.a (Loov;)Loov;
      // 4c4: athrow
      // 4c5: aload 0
      // 4c6: getfield _f3.vbd D
      // 4c9: invokestatic fe6.jqf (D)I
      // 4cc: aload 1
      // 4cd: invokevirtual mew.getZ ()I
      // 4d0: isub
      // 4d1: iload 3
      // 4d2: ifne 51c
      // 4d5: goto 4dc
      // 4d8: invokestatic _f3.a (Loov;)Loov;
      // 4db: athrow
      // 4dc: aload 11
      // 4de: bipush 0
      // 4df: aaload
      // 4e0: bipush 2
      // 4e1: iaload
      // 4e2: if_icmpne 50f
      // 4e5: goto 4ec
      // 4e8: invokestatic _f3.a (Loov;)Loov;
      // 4eb: athrow
      // 4ec: aload 0
      // 4ed: aload 0
      // 4ee: getfield _f3.o2v D
      // 4f1: aload 0
      // 4f2: getfield _f3.kfp D
      // 4f5: aload 11
      // 4f7: bipush 0
      // 4f8: aaload
      // 4f9: bipush 1
      // 4fa: iaload
      // 4fb: i2d
      // 4fc: dadd
      // 4fd: aload 0
      // 4fe: getfield _f3.vbd D
      // 501: invokevirtual _f3.m6_ (DDD)V
      // 504: iload 3
      // 505: ifeq 597
      // 508: goto 50f
      // 50b: invokestatic _f3.a (Loov;)Loov;
      // 50e: athrow
      // 50f: aload 11
      // 511: bipush 1
      // 512: aaload
      // 513: bipush 1
      // 514: iaload
      // 515: goto 51c
      // 518: invokestatic _f3.a (Loov;)Loov;
      // 51b: athrow
      // 51c: iload 3
      // 51d: ifne 548
      // 520: ifeq 597
      // 523: goto 52a
      // 526: invokestatic _f3.a (Loov;)Loov;
      // 529: athrow
      // 52a: aload 0
      // 52b: iload 3
      // 52c: ifne 59c
      // 52f: goto 536
      // 532: invokestatic _f3.a (Loov;)Loov;
      // 535: athrow
      // 536: getfield _f3.o2v D
      // 539: invokestatic fe6.jqf (D)I
      // 53c: aload 1
      // 53d: invokevirtual mew.getX ()I
      // 540: isub
      // 541: goto 548
      // 544: invokestatic _f3.a (Loov;)Loov;
      // 547: athrow
      // 548: aload 11
      // 54a: bipush 1
      // 54b: aaload
      // 54c: bipush 0
      // 54d: iaload
      // 54e: if_icmpne 597
      // 551: aload 0
      // 552: iload 3
      // 553: ifne 59c
      // 556: goto 55d
      // 559: invokestatic _f3.a (Loov;)Loov;
      // 55c: athrow
      // 55d: getfield _f3.vbd D
      // 560: invokestatic fe6.jqf (D)I
      // 563: aload 1
      // 564: invokevirtual mew.getZ ()I
      // 567: isub
      // 568: aload 11
      // 56a: bipush 1
      // 56b: aaload
      // 56c: bipush 2
      // 56d: iaload
      // 56e: if_icmpne 597
      // 571: goto 578
      // 574: invokestatic _f3.a (Loov;)Loov;
      // 577: athrow
      // 578: aload 0
      // 579: aload 0
      // 57a: getfield _f3.o2v D
      // 57d: aload 0
      // 57e: getfield _f3.kfp D
      // 581: aload 11
      // 583: bipush 1
      // 584: aaload
      // 585: bipush 1
      // 586: iaload
      // 587: i2d
      // 588: dadd
      // 589: aload 0
      // 58a: getfield _f3.vbd D
      // 58d: invokevirtual _f3.m6_ (DDD)V
      // 590: goto 597
      // 593: invokestatic _f3.a (Loov;)Loov;
      // 596: athrow
      // 597: aload 0
      // 598: invokevirtual _f3.zye ()V
      // 59b: aload 0
      // 59c: aload 0
      // 59d: getfield _f3.o2v D
      // 5a0: aload 0
      // 5a1: getfield _f3.kfp D
      // 5a4: aload 0
      // 5a5: getfield _f3.vbd D
      // 5a8: invokevirtual _f3.vag (DDD)Lfqr;
      // 5ab: astore 38
      // 5ad: aload 38
      // 5af: iload 3
      // 5b0: ifne 5bf
      // 5b3: ifnull 63b
      // 5b6: goto 5bd
      // 5b9: invokestatic _f3.a (Loov;)Loov;
      // 5bc: athrow
      // 5bd: aload 4
      // 5bf: iload 3
      // 5c0: ifne 5cf
      // 5c3: ifnull 63b
      // 5c6: goto 5cd
      // 5c9: invokestatic _f3.a (Loov;)Loov;
      // 5cc: athrow
      // 5cd: aload 4
      // 5cf: getfield fqr.gn5 D
      // 5d2: aload 38
      // 5d4: getfield fqr.gn5 D
      // 5d7: dsub
      // 5d8: ldc2_w 0.05
      // 5db: dmul
      // 5dc: dstore 39
      // 5de: aload 0
      // 5df: iload 3
      // 5e0: ifne 62b
      // 5e3: getfield _f3.icv D
      // 5e6: aload 0
      // 5e7: getfield _f3.icv D
      // 5ea: dmul
      // 5eb: aload 0
      // 5ec: getfield _f3.bw4 D
      // 5ef: aload 0
      // 5f0: getfield _f3.bw4 D
      // 5f3: dmul
      // 5f4: dadd
      // 5f5: invokestatic java/lang/Math.sqrt (D)D
      // 5f8: dstore 20
      // 5fa: dload 20
      // 5fc: dconst_0
      // 5fd: dcmpl
      // 5fe: ifle 62a
      // 601: aload 0
      // 602: aload 0
      // 603: getfield _f3.icv D
      // 606: dload 20
      // 608: ddiv
      // 609: dload 20
      // 60b: dload 39
      // 60d: dadd
      // 60e: dmul
      // 60f: putfield _f3.icv D
      // 612: aload 0
      // 613: aload 0
      // 614: getfield _f3.bw4 D
      // 617: dload 20
      // 619: ddiv
      // 61a: dload 20
      // 61c: dload 39
      // 61e: dadd
      // 61f: dmul
      // 620: putfield _f3.bw4 D
      // 623: goto 62a
      // 626: invokestatic _f3.a (Loov;)Loov;
      // 629: athrow
      // 62a: aload 0
      // 62b: aload 0
      // 62c: getfield _f3.o2v D
      // 62f: aload 38
      // 631: getfield fqr.gn5 D
      // 634: aload 0
      // 635: getfield _f3.vbd D
      // 638: invokevirtual _f3.m6_ (DDD)V
      // 63b: aload 0
      // 63c: getfield _f3.o2v D
      // 63f: invokestatic fe6.jqf (D)I
      // 642: istore 39
      // 644: aload 0
      // 645: getfield _f3.vbd D
      // 648: invokestatic fe6.jqf (D)I
      // 64b: istore 40
      // 64d: iload 3
      // 64e: ifne 6a3
      // 651: iload 39
      // 653: aload 1
      // 654: invokevirtual mew.getX ()I
      // 657: if_icmpne 67c
      // 65a: goto 661
      // 65d: invokestatic _f3.a (Loov;)Loov;
      // 660: athrow
      // 661: iload 40
      // 663: iload 3
      // 664: ifne 6b4
      // 667: goto 66e
      // 66a: invokestatic _f3.a (Loov;)Loov;
      // 66d: athrow
      // 66e: aload 1
      // 66f: invokevirtual mew.getZ ()I
      // 672: if_icmpeq 6b2
      // 675: goto 67c
      // 678: invokestatic _f3.a (Loov;)Loov;
      // 67b: athrow
      // 67c: aload 0
      // 67d: getfield _f3.icv D
      // 680: aload 0
      // 681: getfield _f3.icv D
      // 684: dmul
      // 685: aload 0
      // 686: getfield _f3.bw4 D
      // 689: aload 0
      // 68a: getfield _f3.bw4 D
      // 68d: dmul
      // 68e: dadd
      // 68f: invokestatic java/lang/Math.sqrt (D)D
      // 692: dstore 20
      // 694: aload 0
      // 695: dload 20
      // 697: iload 39
      // 699: aload 1
      // 69a: invokevirtual mew.getX ()I
      // 69d: isub
      // 69e: i2d
      // 69f: dmul
      // 6a0: putfield _f3.icv D
      // 6a3: aload 0
      // 6a4: dload 20
      // 6a6: iload 40
      // 6a8: aload 1
      // 6a9: invokevirtual mew.getZ ()I
      // 6ac: isub
      // 6ad: i2d
      // 6ae: dmul
      // 6af: putfield _f3.bw4 D
      // 6b2: iload 5
      // 6b4: ifeq 818
      // 6b7: aload 0
      // 6b8: getfield _f3.icv D
      // 6bb: aload 0
      // 6bc: getfield _f3.icv D
      // 6bf: dmul
      // 6c0: aload 0
      // 6c1: getfield _f3.bw4 D
      // 6c4: aload 0
      // 6c5: getfield _f3.bw4 D
      // 6c8: dmul
      // 6c9: dadd
      // 6ca: invokestatic java/lang/Math.sqrt (D)D
      // 6cd: dstore 41
      // 6cf: dload 41
      // 6d1: iload 3
      // 6d2: ifne 6ed
      // 6d5: ldc2_w 0.01
      // 6d8: dcmpl
      // 6d9: ifle 719
      // 6dc: goto 6e3
      // 6df: invokestatic _f3.a (Loov;)Loov;
      // 6e2: athrow
      // 6e3: ldc2_w 0.06
      // 6e6: goto 6ed
      // 6e9: invokestatic _f3.a (Loov;)Loov;
      // 6ec: athrow
      // 6ed: dstore 43
      // 6ef: aload 0
      // 6f0: dup
      // 6f1: getfield _f3.icv D
      // 6f4: aload 0
      // 6f5: getfield _f3.icv D
      // 6f8: dload 41
      // 6fa: ddiv
      // 6fb: dload 43
      // 6fd: dmul
      // 6fe: dadd
      // 6ff: putfield _f3.icv D
      // 702: aload 0
      // 703: dup
      // 704: getfield _f3.bw4 D
      // 707: aload 0
      // 708: getfield _f3.bw4 D
      // 70b: dload 41
      // 70d: ddiv
      // 70e: dload 43
      // 710: dmul
      // 711: dadd
      // 712: putfield _f3.bw4 D
      // 715: iload 3
      // 716: ifeq 818
      // 719: aload 10
      // 71b: getstatic y0y$_zr.jgb Ly0y$_zr;
      // 71e: iload 3
      // 71f: ifne 7ac
      // 722: goto 729
      // 725: invokestatic _f3.a (Loov;)Loov;
      // 728: athrow
      // 729: if_acmpne 7a0
      // 72c: goto 733
      // 72f: invokestatic _f3.a (Loov;)Loov;
      // 732: athrow
      // 733: aload 0
      // 734: getfield _f3.oay Lt9d;
      // 737: aload 1
      // 738: invokevirtual mew.y8e ()Lmew;
      // 73b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 73e: invokeinterface zfz.r_y ()Le0x; 1
      // 743: invokevirtual e0x.y0n ()Z
      // 746: iload 3
      // 747: ifne 792
      // 74a: goto 751
      // 74d: invokestatic _f3.a (Loov;)Loov;
      // 750: athrow
      // 751: ifeq 76d
      // 754: goto 75b
      // 757: invokestatic _f3.a (Loov;)Loov;
      // 75a: athrow
      // 75b: aload 0
      // 75c: ldc2_w 0.02
      // 75f: putfield _f3.icv D
      // 762: iload 3
      // 763: ifeq 818
      // 766: goto 76d
      // 769: invokestatic _f3.a (Loov;)Loov;
      // 76c: athrow
      // 76d: aload 0
      // 76e: iload 3
      // 76f: ifne 796
      // 772: goto 779
      // 775: invokestatic _f3.a (Loov;)Loov;
      // 778: athrow
      // 779: getfield _f3.oay Lt9d;
      // 77c: aload 1
      // 77d: invokevirtual mew.o_8 ()Lmew;
      // 780: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 783: invokeinterface zfz.r_y ()Le0x; 1
      // 788: invokevirtual e0x.y0n ()Z
      // 78b: goto 792
      // 78e: invokestatic _f3.a (Loov;)Loov;
      // 791: athrow
      // 792: ifeq 818
      // 795: aload 0
      // 796: ldc2_w -0.02
      // 799: putfield _f3.icv D
      // 79c: iload 3
      // 79d: ifeq 818
      // 7a0: aload 10
      // 7a2: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 7a5: goto 7ac
      // 7a8: invokestatic _f3.a (Loov;)Loov;
      // 7ab: athrow
      // 7ac: if_acmpne 818
      // 7af: aload 0
      // 7b0: getfield _f3.oay Lt9d;
      // 7b3: aload 1
      // 7b4: invokevirtual mew.idu ()Lmew;
      // 7b7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7ba: invokeinterface zfz.r_y ()Le0x; 1
      // 7bf: invokevirtual e0x.y0n ()Z
      // 7c2: iload 3
      // 7c3: ifne 80e
      // 7c6: goto 7cd
      // 7c9: invokestatic _f3.a (Loov;)Loov;
      // 7cc: athrow
      // 7cd: ifeq 7e9
      // 7d0: goto 7d7
      // 7d3: invokestatic _f3.a (Loov;)Loov;
      // 7d6: athrow
      // 7d7: aload 0
      // 7d8: ldc2_w 0.02
      // 7db: putfield _f3.bw4 D
      // 7de: iload 3
      // 7df: ifeq 818
      // 7e2: goto 7e9
      // 7e5: invokestatic _f3.a (Loov;)Loov;
      // 7e8: athrow
      // 7e9: aload 0
      // 7ea: iload 3
      // 7eb: ifne 812
      // 7ee: goto 7f5
      // 7f1: invokestatic _f3.a (Loov;)Loov;
      // 7f4: athrow
      // 7f5: getfield _f3.oay Lt9d;
      // 7f8: aload 1
      // 7f9: invokevirtual mew.z6x ()Lmew;
      // 7fc: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7ff: invokeinterface zfz.r_y ()Le0x; 1
      // 804: invokevirtual e0x.y0n ()Z
      // 807: goto 80e
      // 80a: invokestatic _f3.a (Loov;)Loov;
      // 80d: athrow
      // 80e: ifeq 818
      // 811: aload 0
      // 812: ldc2_w -0.02
      // 815: putfield _f3.bw4 D
      // 818: return
   }

   public void zye() {
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
      // 06: ifne 61
      // 09: getfield _f3.wgv Li2h;
      // 0c: ifnull 43
      // 0f: goto 16
      // 12: invokestatic _f3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: dup
      // 18: getfield _f3.icv D
      // 1b: ldc2_w 0.996999979019165
      // 1e: dmul
      // 1f: putfield _f3.icv D
      // 22: aload 0
      // 23: dup
      // 24: getfield _f3.mop D
      // 27: dconst_0
      // 28: dmul
      // 29: putfield _f3.mop D
      // 2c: aload 0
      // 2d: dup
      // 2e: getfield _f3.bw4 D
      // 31: ldc2_w 0.996999979019165
      // 34: dmul
      // 35: putfield _f3.bw4 D
      // 38: iload 1
      // 39: ifeq 6c
      // 3c: goto 43
      // 3f: invokestatic _f3.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: dup
      // 45: getfield _f3.icv D
      // 48: ldc2_w 0.9599999785423279
      // 4b: dmul
      // 4c: putfield _f3.icv D
      // 4f: aload 0
      // 50: dup
      // 51: getfield _f3.mop D
      // 54: dconst_0
      // 55: dmul
      // 56: putfield _f3.mop D
      // 59: aload 0
      // 5a: goto 61
      // 5d: invokestatic _f3.a (Loov;)Loov;
      // 60: athrow
      // 61: dup
      // 62: getfield _f3.bw4 D
      // 65: ldc2_w 0.9599999785423279
      // 68: dmul
      // 69: putfield _f3.bw4 D
      // 6c: return
   }

   @Override
   public void m6_(double var1, double var3, double var5) {
      this.o2v = var1;
      this.kfp = var3;
      this.vbd = var5;
      float var7 = this.uo6 / 2.0F;
      float var8 = this.ikl;
      this.qq7(new nh4(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7));
   }

   public fqr zou(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 1
      // 001: invokestatic fe6.jqf (D)I
      // 004: istore 10
      // 006: invokestatic t9d.c ()I
      // 009: dload 3
      // 00a: invokestatic fe6.jqf (D)I
      // 00d: istore 11
      // 00f: istore 9
      // 011: dload 5
      // 013: invokestatic fe6.jqf (D)I
      // 016: istore 12
      // 018: aload 0
      // 019: getfield _f3.oay Lt9d;
      // 01c: new mew
      // 01f: dup
      // 020: iload 10
      // 022: iload 11
      // 024: bipush 1
      // 025: isub
      // 026: iload 12
      // 028: invokespecial mew.<init> (III)V
      // 02b: iload 9
      // 02d: ifne 058
      // 030: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 033: ifeq 047
      // 036: goto 03d
      // 039: invokestatic _f3.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iinc 11 -1
      // 040: goto 047
      // 043: invokestatic _f3.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield _f3.oay Lt9d;
      // 04b: new mew
      // 04e: dup
      // 04f: iload 10
      // 051: iload 11
      // 053: iload 12
      // 055: invokespecial mew.<init> (III)V
      // 058: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05b: astore 13
      // 05d: aload 13
      // 05f: iload 9
      // 061: ifne 07a
      // 064: invokestatic y0y.al_ (Lzfz;)Z
      // 067: ifeq 1f9
      // 06a: goto 071
      // 06d: invokestatic _f3.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 13
      // 073: goto 07a
      // 076: invokestatic _f3.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 13
      // 07c: invokeinterface zfz.r_y ()Le0x; 1
      // 081: checkcast y0y
      // 084: invokevirtual y0y.fvr ()Lxny;
      // 087: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 08c: checkcast y0y$_zr
      // 08f: astore 14
      // 091: iload 11
      // 093: i2d
      // 094: dstore 3
      // 095: aload 14
      // 097: invokevirtual y0y$_zr.t1s ()Z
      // 09a: iload 9
      // 09c: ifne 0b4
      // 09f: ifeq 0b6
      // 0a2: goto 0a9
      // 0a5: invokestatic _f3.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: iload 11
      // 0ab: bipush 1
      // 0ac: iadd
      // 0ad: goto 0b4
      // 0b0: invokestatic _f3.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: i2d
      // 0b5: dstore 3
      // 0b6: getstatic _f3.nnc [[[I
      // 0b9: aload 14
      // 0bb: invokevirtual y0y$_zr.g_6 ()I
      // 0be: aaload
      // 0bf: astore 15
      // 0c1: aload 15
      // 0c3: bipush 1
      // 0c4: aaload
      // 0c5: bipush 0
      // 0c6: iaload
      // 0c7: aload 15
      // 0c9: bipush 0
      // 0ca: aaload
      // 0cb: bipush 0
      // 0cc: iaload
      // 0cd: isub
      // 0ce: i2d
      // 0cf: dstore 16
      // 0d1: aload 15
      // 0d3: bipush 1
      // 0d4: aaload
      // 0d5: bipush 2
      // 0d6: iaload
      // 0d7: aload 15
      // 0d9: bipush 0
      // 0da: aaload
      // 0db: bipush 2
      // 0dc: iaload
      // 0dd: isub
      // 0de: i2d
      // 0df: dstore 18
      // 0e1: dload 16
      // 0e3: dload 16
      // 0e5: dmul
      // 0e6: dload 18
      // 0e8: dload 18
      // 0ea: dmul
      // 0eb: dadd
      // 0ec: invokestatic java/lang/Math.sqrt (D)D
      // 0ef: dstore 20
      // 0f1: dload 16
      // 0f3: dload 20
      // 0f5: ddiv
      // 0f6: dstore 16
      // 0f8: dload 18
      // 0fa: dload 20
      // 0fc: ddiv
      // 0fd: dstore 18
      // 0ff: dload 1
      // 100: dload 16
      // 102: dload 7
      // 104: dmul
      // 105: dadd
      // 106: dstore 1
      // 107: dload 5
      // 109: dload 18
      // 10b: dload 7
      // 10d: dmul
      // 10e: dadd
      // 10f: dstore 5
      // 111: aload 15
      // 113: bipush 0
      // 114: aaload
      // 115: bipush 1
      // 116: iaload
      // 117: iload 9
      // 119: ifne 189
      // 11c: ifeq 17c
      // 11f: goto 126
      // 122: invokestatic _f3.a (Loov;)Loov;
      // 125: athrow
      // 126: dload 1
      // 127: invokestatic fe6.jqf (D)I
      // 12a: iload 10
      // 12c: isub
      // 12d: iload 9
      // 12f: ifne 189
      // 132: goto 139
      // 135: invokestatic _f3.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 15
      // 13b: bipush 0
      // 13c: aaload
      // 13d: bipush 0
      // 13e: iaload
      // 13f: if_icmpne 17c
      // 142: goto 149
      // 145: invokestatic _f3.a (Loov;)Loov;
      // 148: athrow
      // 149: dload 5
      // 14b: invokestatic fe6.jqf (D)I
      // 14e: iload 12
      // 150: isub
      // 151: iload 9
      // 153: ifne 189
      // 156: goto 15d
      // 159: invokestatic _f3.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 15
      // 15f: bipush 0
      // 160: aaload
      // 161: bipush 2
      // 162: iaload
      // 163: if_icmpne 17c
      // 166: goto 16d
      // 169: invokestatic _f3.a (Loov;)Loov;
      // 16c: athrow
      // 16d: dload 3
      // 16e: aload 15
      // 170: bipush 0
      // 171: aaload
      // 172: bipush 1
      // 173: iaload
      // 174: i2d
      // 175: dadd
      // 176: dstore 3
      // 177: iload 9
      // 179: ifeq 1f0
      // 17c: aload 15
      // 17e: bipush 1
      // 17f: aaload
      // 180: bipush 1
      // 181: iaload
      // 182: goto 189
      // 185: invokestatic _f3.a (Loov;)Loov;
      // 188: athrow
      // 189: iload 9
      // 18b: ifne 1a6
      // 18e: ifeq 1f0
      // 191: goto 198
      // 194: invokestatic _f3.a (Loov;)Loov;
      // 197: athrow
      // 198: dload 1
      // 199: invokestatic fe6.jqf (D)I
      // 19c: iload 10
      // 19e: isub
      // 19f: goto 1a6
      // 1a2: invokestatic _f3.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: aload 15
      // 1a8: bipush 1
      // 1a9: aaload
      // 1aa: bipush 0
      // 1ab: iaload
      // 1ac: iload 9
      // 1ae: ifne 1dc
      // 1b1: if_icmpne 1f0
      // 1b4: goto 1bb
      // 1b7: invokestatic _f3.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: dload 5
      // 1bd: iload 9
      // 1bf: ifne 1ef
      // 1c2: goto 1c9
      // 1c5: invokestatic _f3.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: invokestatic fe6.jqf (D)I
      // 1cc: iload 12
      // 1ce: isub
      // 1cf: aload 15
      // 1d1: bipush 1
      // 1d2: aaload
      // 1d3: bipush 2
      // 1d4: iaload
      // 1d5: goto 1dc
      // 1d8: invokestatic _f3.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: if_icmpne 1f0
      // 1df: dload 3
      // 1e0: aload 15
      // 1e2: bipush 1
      // 1e3: aaload
      // 1e4: bipush 1
      // 1e5: iaload
      // 1e6: i2d
      // 1e7: dadd
      // 1e8: goto 1ef
      // 1eb: invokestatic _f3.a (Loov;)Loov;
      // 1ee: athrow
      // 1ef: dstore 3
      // 1f0: aload 0
      // 1f1: dload 1
      // 1f2: dload 3
      // 1f3: dload 5
      // 1f5: invokevirtual _f3.vag (DDD)Lfqr;
      // 1f8: areturn
      // 1f9: aconst_null
      // 1fa: areturn
   }

   public fqr vag(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 1
      // 001: invokestatic fe6.jqf (D)I
      // 004: istore 8
      // 006: invokestatic t9d.b ()I
      // 009: dload 3
      // 00a: invokestatic fe6.jqf (D)I
      // 00d: istore 9
      // 00f: istore 7
      // 011: dload 5
      // 013: invokestatic fe6.jqf (D)I
      // 016: istore 10
      // 018: aload 0
      // 019: getfield _f3.oay Lt9d;
      // 01c: new mew
      // 01f: dup
      // 020: iload 8
      // 022: iload 9
      // 024: bipush 1
      // 025: isub
      // 026: iload 10
      // 028: invokespecial mew.<init> (III)V
      // 02b: iload 7
      // 02d: ifeq 058
      // 030: invokestatic y0y.slf (Lt9d;Lmew;)Z
      // 033: ifeq 047
      // 036: goto 03d
      // 039: invokestatic _f3.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iinc 9 -1
      // 040: goto 047
      // 043: invokestatic _f3.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield _f3.oay Lt9d;
      // 04b: new mew
      // 04e: dup
      // 04f: iload 8
      // 051: iload 9
      // 053: iload 10
      // 055: invokespecial mew.<init> (III)V
      // 058: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05b: astore 11
      // 05d: aload 11
      // 05f: iload 7
      // 061: ifeq 07a
      // 064: invokestatic y0y.al_ (Lzfz;)Z
      // 067: ifeq 211
      // 06a: goto 071
      // 06d: invokestatic _f3.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 11
      // 073: goto 07a
      // 076: invokestatic _f3.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 11
      // 07c: invokeinterface zfz.r_y ()Le0x; 1
      // 081: checkcast y0y
      // 084: invokevirtual y0y.fvr ()Lxny;
      // 087: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 08c: checkcast y0y$_zr
      // 08f: astore 12
      // 091: getstatic _f3.nnc [[[I
      // 094: aload 12
      // 096: invokevirtual y0y$_zr.g_6 ()I
      // 099: aaload
      // 09a: astore 13
      // 09c: dconst_0
      // 09d: dstore 14
      // 09f: iload 8
      // 0a1: i2d
      // 0a2: ldc2_w 0.5
      // 0a5: dadd
      // 0a6: aload 13
      // 0a8: bipush 0
      // 0a9: aaload
      // 0aa: bipush 0
      // 0ab: iaload
      // 0ac: i2d
      // 0ad: ldc2_w 0.5
      // 0b0: dmul
      // 0b1: dadd
      // 0b2: dstore 16
      // 0b4: iload 9
      // 0b6: i2d
      // 0b7: ldc2_w 0.0625
      // 0ba: dadd
      // 0bb: aload 13
      // 0bd: bipush 0
      // 0be: aaload
      // 0bf: bipush 1
      // 0c0: iaload
      // 0c1: i2d
      // 0c2: ldc2_w 0.5
      // 0c5: dmul
      // 0c6: dadd
      // 0c7: dstore 18
      // 0c9: iload 10
      // 0cb: i2d
      // 0cc: ldc2_w 0.5
      // 0cf: dadd
      // 0d0: aload 13
      // 0d2: bipush 0
      // 0d3: aaload
      // 0d4: bipush 2
      // 0d5: iaload
      // 0d6: i2d
      // 0d7: ldc2_w 0.5
      // 0da: dmul
      // 0db: dadd
      // 0dc: dstore 20
      // 0de: iload 8
      // 0e0: i2d
      // 0e1: ldc2_w 0.5
      // 0e4: dadd
      // 0e5: aload 13
      // 0e7: bipush 1
      // 0e8: aaload
      // 0e9: bipush 0
      // 0ea: iaload
      // 0eb: i2d
      // 0ec: ldc2_w 0.5
      // 0ef: dmul
      // 0f0: dadd
      // 0f1: dstore 22
      // 0f3: iload 9
      // 0f5: i2d
      // 0f6: ldc2_w 0.0625
      // 0f9: dadd
      // 0fa: aload 13
      // 0fc: bipush 1
      // 0fd: aaload
      // 0fe: bipush 1
      // 0ff: iaload
      // 100: i2d
      // 101: ldc2_w 0.5
      // 104: dmul
      // 105: dadd
      // 106: dstore 24
      // 108: iload 10
      // 10a: i2d
      // 10b: ldc2_w 0.5
      // 10e: dadd
      // 10f: aload 13
      // 111: bipush 1
      // 112: aaload
      // 113: bipush 2
      // 114: iaload
      // 115: i2d
      // 116: ldc2_w 0.5
      // 119: dmul
      // 11a: dadd
      // 11b: dstore 26
      // 11d: dload 22
      // 11f: dload 16
      // 121: dsub
      // 122: dstore 28
      // 124: dload 24
      // 126: dload 18
      // 128: dsub
      // 129: ldc2_w 2.0
      // 12c: dmul
      // 12d: dstore 30
      // 12f: dload 26
      // 131: dload 20
      // 133: dsub
      // 134: dstore 32
      // 136: dload 28
      // 138: dconst_0
      // 139: dcmpl
      // 13a: iload 7
      // 13c: ifeq 175
      // 13f: ifne 15e
      // 142: goto 149
      // 145: invokestatic _f3.a (Loov;)Loov;
      // 148: athrow
      // 149: iload 8
      // 14b: i2d
      // 14c: ldc2_w 0.5
      // 14f: dadd
      // 150: dstore 1
      // 151: dload 5
      // 153: iload 10
      // 155: i2d
      // 156: dsub
      // 157: dstore 14
      // 159: iload 7
      // 15b: ifne 1b2
      // 15e: dload 32
      // 160: dconst_0
      // 161: iload 7
      // 163: ifeq 197
      // 166: goto 16d
      // 169: invokestatic _f3.a (Loov;)Loov;
      // 16c: athrow
      // 16d: dcmpl
      // 16e: goto 175
      // 171: invokestatic _f3.a (Loov;)Loov;
      // 174: athrow
      // 175: ifne 18d
      // 178: iload 10
      // 17a: i2d
      // 17b: ldc2_w 0.5
      // 17e: dadd
      // 17f: dstore 5
      // 181: dload 1
      // 182: iload 8
      // 184: i2d
      // 185: dsub
      // 186: dstore 14
      // 188: iload 7
      // 18a: ifne 1b2
      // 18d: dload 1
      // 18e: dload 16
      // 190: goto 197
      // 193: invokestatic _f3.a (Loov;)Loov;
      // 196: athrow
      // 197: dsub
      // 198: dstore 34
      // 19a: dload 5
      // 19c: dload 20
      // 19e: dsub
      // 19f: dstore 36
      // 1a1: dload 34
      // 1a3: dload 28
      // 1a5: dmul
      // 1a6: dload 36
      // 1a8: dload 32
      // 1aa: dmul
      // 1ab: dadd
      // 1ac: ldc2_w 2.0
      // 1af: dmul
      // 1b0: dstore 14
      // 1b2: dload 16
      // 1b4: dload 28
      // 1b6: dload 14
      // 1b8: dmul
      // 1b9: dadd
      // 1ba: dstore 1
      // 1bb: dload 18
      // 1bd: dload 30
      // 1bf: dload 14
      // 1c1: dmul
      // 1c2: dadd
      // 1c3: dstore 3
      // 1c4: dload 20
      // 1c6: dload 32
      // 1c8: dload 14
      // 1ca: dmul
      // 1cb: dadd
      // 1cc: dstore 5
      // 1ce: dload 30
      // 1d0: dconst_0
      // 1d1: dcmpg
      // 1d2: iload 7
      // 1d4: ifeq 1f5
      // 1d7: ifge 1e5
      // 1da: goto 1e1
      // 1dd: invokestatic _f3.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: dload 3
      // 1e2: dconst_1
      // 1e3: dadd
      // 1e4: dstore 3
      // 1e5: dload 30
      // 1e7: dconst_0
      // 1e8: iload 7
      // 1ea: ifeq 203
      // 1ed: dcmpl
      // 1ee: goto 1f5
      // 1f1: invokestatic _f3.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: ifle 205
      // 1f8: dload 3
      // 1f9: ldc2_w 0.5
      // 1fc: goto 203
      // 1ff: invokestatic _f3.a (Loov;)Loov;
      // 202: athrow
      // 203: dadd
      // 204: dstore 3
      // 205: new fqr
      // 208: dup
      // 209: dload 1
      // 20a: dload 3
      // 20b: dload 5
      // 20d: invokespecial fqr.<init> (DDD)V
      // 210: areturn
      // 211: aconst_null
      // 212: areturn
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
      // 000: getstatic _f3.b J
      // 003: ldc2_w 114511510055154
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 16124
      // 011: ldc2_w 2303595920650092625
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 01f: iload 4
      // 021: ifne 13b
      // 024: ifeq 127
      // 027: goto 02e
      // 02a: invokestatic _f3.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 1
      // 02f: sipush 11476
      // 032: ldc2_w 6288157011055497841
      // 035: lload 2
      // 036: lxor
      // 037: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: nop
      // 03d: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 040: istore 5
      // 042: aload 1
      // 043: sipush 236
      // 046: ldc2_w 8082801712640949834
      // 049: lload 2
      // 04a: lxor
      // 04b: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: nop
      // 051: bipush 8
      // 053: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 056: iload 4
      // 058: ifne 0d3
      // 05b: ifeq 0ba
      // 05e: goto 065
      // 061: invokestatic _f3.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 1
      // 066: sipush 236
      // 069: ldc2_w 8082801712640949834
      // 06c: lload 2
      // 06d: lxor
      // 06e: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 077: invokestatic e0x.mdd (Ljava/lang/String;)Le0x;
      // 07a: astore 6
      // 07c: iload 4
      // 07e: ifne 09e
      // 081: aload 6
      // 083: ifnonnull 0a3
      // 086: goto 08d
      // 089: invokestatic _f3.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getstatic ox_.ibw Le0x;
      // 091: invokevirtual e0x.l4i ()Lzfz;
      // 094: invokevirtual _f3.t5j (Lzfz;)V
      // 097: goto 09e
      // 09a: invokestatic _f3.a (Loov;)Loov;
      // 09d: athrow
      // 09e: iload 4
      // 0a0: ifeq 0b5
      // 0a3: aload 0
      // 0a4: aload 6
      // 0a6: iload 5
      // 0a8: invokevirtual e0x.kig (I)Lzfz;
      // 0ab: invokevirtual _f3.t5j (Lzfz;)V
      // 0ae: goto 0b5
      // 0b1: invokestatic _f3.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: iload 4
      // 0b7: ifeq 111
      // 0ba: aload 1
      // 0bb: sipush 236
      // 0be: ldc2_w 8082801712640949834
      // 0c1: lload 2
      // 0c2: lxor
      // 0c3: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: nop
      // 0c9: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0cc: goto 0d3
      // 0cf: invokestatic _f3.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: invokestatic e0x.csc (I)Le0x;
      // 0d6: astore 6
      // 0d8: iload 4
      // 0da: ifne 0fa
      // 0dd: aload 6
      // 0df: ifnonnull 0ff
      // 0e2: goto 0e9
      // 0e5: invokestatic _f3.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: getstatic ox_.ibw Le0x;
      // 0ed: invokevirtual e0x.l4i ()Lzfz;
      // 0f0: invokevirtual _f3.t5j (Lzfz;)V
      // 0f3: goto 0fa
      // 0f6: invokestatic _f3.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 4
      // 0fc: ifeq 111
      // 0ff: aload 0
      // 100: aload 6
      // 102: iload 5
      // 104: invokevirtual e0x.kig (I)Lzfz;
      // 107: invokevirtual _f3.t5j (Lzfz;)V
      // 10a: goto 111
      // 10d: invokestatic _f3.a (Loov;)Loov;
      // 110: athrow
      // 111: aload 0
      // 112: aload 1
      // 113: sipush 9537
      // 116: ldc2_w 3037928665410132960
      // 119: lload 2
      // 11a: lxor
      // 11b: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 124: invokevirtual _f3.y69 (I)V
      // 127: aload 1
      // 128: sipush 32573
      // 12b: ldc2_w 6119865768790884766
      // 12e: lload 2
      // 12f: lxor
      // 130: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: nop
      // 136: bipush 8
      // 138: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 13b: iload 4
      // 13d: ifne 166
      // 140: ifeq 186
      // 143: goto 14a
      // 146: invokestatic _f3.a (Loov;)Loov;
      // 149: athrow
      // 14a: aload 1
      // 14b: sipush 32573
      // 14e: ldc2_w 6119865768790884766
      // 151: lload 2
      // 152: lxor
      // 153: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 15c: invokevirtual java/lang/String.length ()I
      // 15f: goto 166
      // 162: invokestatic _f3.a (Loov;)Loov;
      // 165: athrow
      // 166: ifle 186
      // 169: aload 0
      // 16a: aload 1
      // 16b: sipush 32573
      // 16e: ldc2_w 6119865768790884766
      // 171: lload 2
      // 172: lxor
      // 173: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: nop
      // 179: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 17c: putfield _f3.gmn Ljava/lang/String;
      // 17f: goto 186
      // 182: invokestatic _f3.a (Loov;)Loov;
      // 185: athrow
      // 186: return
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
      // 00: getstatic _f3.b J
      // 03: ldc2_w 33584710567001
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne b2
      // 13: invokevirtual _f3.v3h ()Z
      // 16: ifeq b1
      // 19: goto 20
      // 1c: invokestatic _f3.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: sipush 13077
      // 24: ldc2_w 3623245807709430032
      // 27: lload 2
      // 28: lxor
      // 29: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: bipush 1
      // 30: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 33: aload 0
      // 34: invokevirtual _f3.joa ()Lzfz;
      // 37: astore 5
      // 39: getstatic e0x.db8 Ljnv;
      // 3c: aload 5
      // 3e: invokeinterface zfz.r_y ()Le0x; 1
      // 43: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 46: checkcast gdz
      // 49: astore 6
      // 4b: aload 1
      // 4c: sipush 4201
      // 4f: ldc2_w 7445886824618164834
      // 52: lload 2
      // 53: lxor
      // 54: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: nop
      // 5a: aload 6
      // 5c: iload 4
      // 5e: ifne 77
      // 61: ifnonnull 75
      // 64: goto 6b
      // 67: invokestatic _f3.a (Loov;)Loov;
      // 6a: athrow
      // 6b: ldc ""
      // 6d: nop
      // 6e: goto 7a
      // 71: invokestatic _f3.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 6
      // 77: invokevirtual gdz.toString ()Ljava/lang/String;
      // 7a: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 7d: aload 1
      // 7e: sipush 30294
      // 81: ldc2_w 7510410434330485849
      // 84: lload 2
      // 85: lxor
      // 86: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: nop
      // 8c: aload 5
      // 8e: invokeinterface zfz.r_y ()Le0x; 1
      // 93: aload 5
      // 95: invokevirtual e0x.hvp (Lzfz;)I
      // 98: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 9b: aload 1
      // 9c: sipush 2643
      // 9f: ldc2_w 2618148736663033951
      // a2: lload 2
      // a3: lxor
      // a4: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: aload 0
      // ab: invokevirtual _f3.qxx ()I
      // ae: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // b1: aload 0
      // b2: getfield _f3.gmn Ljava/lang/String;
      // b5: iload 4
      // b7: ifne cf
      // ba: ifnull f2
      // bd: goto c4
      // c0: invokestatic _f3.a (Loov;)Loov;
      // c3: athrow
      // c4: aload 0
      // c5: getfield _f3.gmn Ljava/lang/String;
      // c8: goto cf
      // cb: invokestatic _f3.a (Loov;)Loov;
      // ce: athrow
      // cf: invokevirtual java/lang/String.length ()I
      // d2: ifle f2
      // d5: aload 1
      // d6: sipush 23016
      // d9: ldc2_w 9110275062881897455
      // dc: lload 2
      // dd: lxor
      // de: invokedynamic e (IJ)Ljava/lang/String; bsm=_f3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: nop
      // e4: aload 0
      // e5: getfield _f3.gmn Ljava/lang/String;
      // e8: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // eb: goto f2
      // ee: invokestatic _f3.a (Loov;)Loov;
      // f1: athrow
      // f2: return
   }

   @Override
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
      // 004: aload 0
      // 005: getfield _f3.oay Lt9d;
      // 008: getfield t9d.v0f Z
      // 00b: iload 2
      // 00c: ifeq 024
      // 00f: ifne 3fb
      // 012: goto 019
      // 015: invokestatic _f3.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 1
      // 01a: getfield i2h.kvx Z
      // 01d: goto 024
      // 020: invokestatic _f3.a (Loov;)Loov;
      // 023: athrow
      // 024: iload 2
      // 025: ifeq 048
      // 028: ifne 3fb
      // 02b: goto 032
      // 02e: invokestatic _f3.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: iload 2
      // 034: ifeq 04c
      // 037: goto 03e
      // 03a: invokestatic _f3.a (Loov;)Loov;
      // 03d: athrow
      // 03e: getfield _f3.kvx Z
      // 041: goto 048
      // 044: invokestatic _f3.a (Loov;)Loov;
      // 047: athrow
      // 048: ifne 3fb
      // 04b: aload 1
      // 04c: iload 2
      // 04d: ifeq 066
      // 050: aload 0
      // 051: getfield _f3.wgv Li2h;
      // 054: if_acmpeq 3fb
      // 057: goto 05e
      // 05a: invokestatic _f3.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 1
      // 05f: goto 066
      // 062: invokestatic _f3.a (Loov;)Loov;
      // 065: athrow
      // 066: iload 2
      // 067: ifeq 130
      // 06a: instanceof g_3
      // 06d: ifeq 12f
      // 070: goto 077
      // 073: invokestatic _f3.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 1
      // 078: iload 2
      // 079: ifeq 130
      // 07c: goto 083
      // 07f: invokestatic _f3.a (Loov;)Loov;
      // 082: athrow
      // 083: instanceof ha9
      // 086: ifne 12f
      // 089: goto 090
      // 08c: invokestatic _f3.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 1
      // 091: iload 2
      // 092: ifeq 130
      // 095: goto 09c
      // 098: invokestatic _f3.a (Loov;)Loov;
      // 09b: athrow
      // 09c: instanceof osf
      // 09f: ifne 12f
      // 0a2: goto 0a9
      // 0a5: invokestatic _f3.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: iload 2
      // 0ab: ifeq 130
      // 0ae: goto 0b5
      // 0b1: invokestatic _f3.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: invokevirtual _f3.x38 ()L_f3$c3d;
      // 0b8: getstatic _f3$c3d.g3j L_f3$c3d;
      // 0bb: if_acmpne 12f
      // 0be: goto 0c5
      // 0c1: invokestatic _f3.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield _f3.icv D
      // 0c9: aload 0
      // 0ca: getfield _f3.icv D
      // 0cd: dmul
      // 0ce: aload 0
      // 0cf: getfield _f3.bw4 D
      // 0d2: aload 0
      // 0d3: getfield _f3.bw4 D
      // 0d6: dmul
      // 0d7: dadd
      // 0d8: ldc2_w 0.01
      // 0db: iload 2
      // 0dc: ifeq 137
      // 0df: goto 0e6
      // 0e2: invokestatic _f3.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: dcmpl
      // 0e7: ifle 12f
      // 0ea: goto 0f1
      // 0ed: invokestatic _f3.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield _f3.wgv Li2h;
      // 0f5: iload 2
      // 0f6: ifeq 130
      // 0f9: goto 100
      // 0fc: invokestatic _f3.a (Loov;)Loov;
      // 0ff: athrow
      // 100: ifnonnull 12f
      // 103: goto 10a
      // 106: invokestatic _f3.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 1
      // 10b: getfield i2h.hzp Li2h;
      // 10e: iload 2
      // 10f: ifeq 130
      // 112: goto 119
      // 115: invokestatic _f3.a (Loov;)Loov;
      // 118: athrow
      // 119: ifnonnull 12f
      // 11c: goto 123
      // 11f: invokestatic _f3.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 1
      // 124: aload 0
      // 125: invokevirtual i2h.nw9 (Li2h;)V
      // 128: goto 12f
      // 12b: invokestatic _f3.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 1
      // 130: getfield i2h.o2v D
      // 133: aload 0
      // 134: getfield _f3.o2v D
      // 137: dsub
      // 138: dstore 3
      // 139: aload 1
      // 13a: getfield i2h.vbd D
      // 13d: aload 0
      // 13e: getfield _f3.vbd D
      // 141: dsub
      // 142: dstore 5
      // 144: dload 3
      // 145: dload 3
      // 146: dmul
      // 147: dload 5
      // 149: dload 5
      // 14b: dmul
      // 14c: dadd
      // 14d: dstore 7
      // 14f: dload 7
      // 151: ldc2_w 9.999999747378752E-5
      // 154: iload 2
      // 155: ifeq 17a
      // 158: dcmpl
      // 159: iflt 3fb
      // 15c: goto 163
      // 15f: invokestatic _f3.a (Loov;)Loov;
      // 162: athrow
      // 163: dload 7
      // 165: invokestatic fe6.dii (D)F
      // 168: f2d
      // 169: dstore 7
      // 16b: dload 3
      // 16c: dload 7
      // 16e: ddiv
      // 16f: dstore 3
      // 170: dload 5
      // 172: dload 7
      // 174: ddiv
      // 175: dstore 5
      // 177: dconst_1
      // 178: dload 7
      // 17a: ddiv
      // 17b: dstore 9
      // 17d: dload 9
      // 17f: dconst_1
      // 180: dcmpl
      // 181: iload 2
      // 182: ifeq 1df
      // 185: ifle 192
      // 188: goto 18f
      // 18b: invokestatic _f3.a (Loov;)Loov;
      // 18e: athrow
      // 18f: dconst_1
      // 190: dstore 9
      // 192: dload 3
      // 193: dload 9
      // 195: dmul
      // 196: dstore 3
      // 197: dload 5
      // 199: dload 9
      // 19b: dmul
      // 19c: dstore 5
      // 19e: dload 3
      // 19f: ldc2_w 0.10000000149011612
      // 1a2: dmul
      // 1a3: dstore 3
      // 1a4: dload 5
      // 1a6: ldc2_w 0.10000000149011612
      // 1a9: dmul
      // 1aa: dstore 5
      // 1ac: dload 3
      // 1ad: fconst_1
      // 1ae: aload 0
      // 1af: getfield _f3.u5z F
      // 1b2: fsub
      // 1b3: f2d
      // 1b4: dmul
      // 1b5: dstore 3
      // 1b6: dload 5
      // 1b8: fconst_1
      // 1b9: aload 0
      // 1ba: getfield _f3.u5z F
      // 1bd: fsub
      // 1be: f2d
      // 1bf: dmul
      // 1c0: dstore 5
      // 1c2: dload 3
      // 1c3: ldc2_w 0.5
      // 1c6: dmul
      // 1c7: dstore 3
      // 1c8: dload 5
      // 1ca: ldc2_w 0.5
      // 1cd: dmul
      // 1ce: dstore 5
      // 1d0: aload 1
      // 1d1: iload 2
      // 1d2: ifeq 3ec
      // 1d5: instanceof _f3
      // 1d8: goto 1df
      // 1db: invokestatic _f3.a (Loov;)Loov;
      // 1de: athrow
      // 1df: ifeq 3da
      // 1e2: aload 1
      // 1e3: getfield i2h.o2v D
      // 1e6: aload 0
      // 1e7: getfield _f3.o2v D
      // 1ea: dsub
      // 1eb: dstore 11
      // 1ed: aload 1
      // 1ee: getfield i2h.vbd D
      // 1f1: aload 0
      // 1f2: getfield _f3.vbd D
      // 1f5: dsub
      // 1f6: dstore 13
      // 1f8: new fqr
      // 1fb: dup
      // 1fc: dload 11
      // 1fe: dconst_0
      // 1ff: dload 13
      // 201: invokespecial fqr.<init> (DDD)V
      // 204: invokevirtual fqr.kec ()Lfqr;
      // 207: astore 15
      // 209: new fqr
      // 20c: dup
      // 20d: aload 0
      // 20e: getfield _f3.x5k F
      // 211: ldc 3.1415927
      // 213: nop
      // 214: fmul
      // 215: ldc 180.0
      // 217: nop
      // 218: fdiv
      // 219: invokestatic fe6.ssk (F)F
      // 21c: f2d
      // 21d: dconst_0
      // 21e: aload 0
      // 21f: getfield _f3.x5k F
      // 222: ldc 3.1415927
      // 224: nop
      // 225: fmul
      // 226: ldc 180.0
      // 228: nop
      // 229: fdiv
      // 22a: invokestatic fe6.rtn (F)F
      // 22d: f2d
      // 22e: invokespecial fqr.<init> (DDD)V
      // 231: invokevirtual fqr.kec ()Lfqr;
      // 234: astore 16
      // 236: aload 15
      // 238: aload 16
      // 23a: invokevirtual fqr.xvl (Lfqr;)D
      // 23d: invokestatic java/lang/Math.abs (D)D
      // 240: dstore 17
      // 242: dload 17
      // 244: ldc2_w 0.800000011920929
      // 247: iload 2
      // 248: ifeq 263
      // 24b: dcmpg
      // 24c: ifge 25b
      // 24f: goto 256
      // 252: invokestatic _f3.a (Loov;)Loov;
      // 255: athrow
      // 256: return
      // 257: invokestatic _f3.a (Loov;)Loov;
      // 25a: athrow
      // 25b: aload 1
      // 25c: getfield i2h.icv D
      // 25f: aload 0
      // 260: getfield _f3.icv D
      // 263: dadd
      // 264: dstore 19
      // 266: aload 1
      // 267: getfield i2h.bw4 D
      // 26a: aload 0
      // 26b: getfield _f3.bw4 D
      // 26e: dadd
      // 26f: dstore 21
      // 271: aload 1
      // 272: checkcast _f3
      // 275: invokevirtual _f3.x38 ()L_f3$c3d;
      // 278: getstatic _f3$c3d.j2j L_f3$c3d;
      // 27b: iload 2
      // 27c: ifeq 30e
      // 27f: if_acmpne 2f2
      // 282: goto 289
      // 285: invokestatic _f3.a (Loov;)Loov;
      // 288: athrow
      // 289: aload 0
      // 28a: invokevirtual _f3.x38 ()L_f3$c3d;
      // 28d: getstatic _f3$c3d.j2j L_f3$c3d;
      // 290: iload 2
      // 291: ifeq 30e
      // 294: goto 29b
      // 297: invokestatic _f3.a (Loov;)Loov;
      // 29a: athrow
      // 29b: if_acmpeq 2f2
      // 29e: goto 2a5
      // 2a1: invokestatic _f3.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: aload 0
      // 2a6: dup
      // 2a7: getfield _f3.icv D
      // 2aa: ldc2_w 0.20000000298023224
      // 2ad: dmul
      // 2ae: putfield _f3.icv D
      // 2b1: aload 0
      // 2b2: dup
      // 2b3: getfield _f3.bw4 D
      // 2b6: ldc2_w 0.20000000298023224
      // 2b9: dmul
      // 2ba: putfield _f3.bw4 D
      // 2bd: aload 0
      // 2be: aload 1
      // 2bf: getfield i2h.icv D
      // 2c2: dload 3
      // 2c3: dsub
      // 2c4: dconst_0
      // 2c5: aload 1
      // 2c6: getfield i2h.bw4 D
      // 2c9: dload 5
      // 2cb: dsub
      // 2cc: invokevirtual _f3.w7w (DDD)V
      // 2cf: aload 1
      // 2d0: dup
      // 2d1: getfield i2h.icv D
      // 2d4: ldc2_w 0.949999988079071
      // 2d7: dmul
      // 2d8: putfield i2h.icv D
      // 2db: aload 1
      // 2dc: dup
      // 2dd: getfield i2h.bw4 D
      // 2e0: ldc2_w 0.949999988079071
      // 2e3: dmul
      // 2e4: putfield i2h.bw4 D
      // 2e7: iload 2
      // 2e8: ifne 3d6
      // 2eb: goto 2f2
      // 2ee: invokestatic _f3.a (Loov;)Loov;
      // 2f1: athrow
      // 2f2: aload 1
      // 2f3: checkcast _f3
      // 2f6: iload 2
      // 2f7: ifeq 3c9
      // 2fa: goto 301
      // 2fd: invokestatic _f3.a (Loov;)Loov;
      // 300: athrow
      // 301: invokevirtual _f3.x38 ()L_f3$c3d;
      // 304: getstatic _f3$c3d.j2j L_f3$c3d;
      // 307: goto 30e
      // 30a: invokestatic _f3.a (Loov;)Loov;
      // 30d: athrow
      // 30e: if_acmpeq 37a
      // 311: aload 0
      // 312: iload 2
      // 313: ifeq 3c9
      // 316: goto 31d
      // 319: invokestatic _f3.a (Loov;)Loov;
      // 31c: athrow
      // 31d: invokevirtual _f3.x38 ()L_f3$c3d;
      // 320: getstatic _f3$c3d.j2j L_f3$c3d;
      // 323: if_acmpne 37a
      // 326: goto 32d
      // 329: invokestatic _f3.a (Loov;)Loov;
      // 32c: athrow
      // 32d: aload 1
      // 32e: dup
      // 32f: getfield i2h.icv D
      // 332: ldc2_w 0.20000000298023224
      // 335: dmul
      // 336: putfield i2h.icv D
      // 339: aload 1
      // 33a: dup
      // 33b: getfield i2h.bw4 D
      // 33e: ldc2_w 0.20000000298023224
      // 341: dmul
      // 342: putfield i2h.bw4 D
      // 345: aload 1
      // 346: aload 0
      // 347: getfield _f3.icv D
      // 34a: dload 3
      // 34b: dadd
      // 34c: dconst_0
      // 34d: aload 0
      // 34e: getfield _f3.bw4 D
      // 351: dload 5
      // 353: dadd
      // 354: invokevirtual i2h.w7w (DDD)V
      // 357: aload 0
      // 358: dup
      // 359: getfield _f3.icv D
      // 35c: ldc2_w 0.949999988079071
      // 35f: dmul
      // 360: putfield _f3.icv D
      // 363: aload 0
      // 364: dup
      // 365: getfield _f3.bw4 D
      // 368: ldc2_w 0.949999988079071
      // 36b: dmul
      // 36c: putfield _f3.bw4 D
      // 36f: iload 2
      // 370: ifne 3d6
      // 373: goto 37a
      // 376: invokestatic _f3.a (Loov;)Loov;
      // 379: athrow
      // 37a: dload 19
      // 37c: ldc2_w 2.0
      // 37f: ddiv
      // 380: dstore 19
      // 382: dload 21
      // 384: ldc2_w 2.0
      // 387: ddiv
      // 388: dstore 21
      // 38a: aload 0
      // 38b: dup
      // 38c: getfield _f3.icv D
      // 38f: ldc2_w 0.20000000298023224
      // 392: dmul
      // 393: putfield _f3.icv D
      // 396: aload 0
      // 397: dup
      // 398: getfield _f3.bw4 D
      // 39b: ldc2_w 0.20000000298023224
      // 39e: dmul
      // 39f: putfield _f3.bw4 D
      // 3a2: aload 0
      // 3a3: dload 19
      // 3a5: dload 3
      // 3a6: dsub
      // 3a7: dconst_0
      // 3a8: dload 21
      // 3aa: dload 5
      // 3ac: dsub
      // 3ad: invokevirtual _f3.w7w (DDD)V
      // 3b0: aload 1
      // 3b1: dup
      // 3b2: getfield i2h.icv D
      // 3b5: ldc2_w 0.20000000298023224
      // 3b8: dmul
      // 3b9: putfield i2h.icv D
      // 3bc: aload 1
      // 3bd: dup
      // 3be: getfield i2h.bw4 D
      // 3c1: ldc2_w 0.20000000298023224
      // 3c4: dmul
      // 3c5: putfield i2h.bw4 D
      // 3c8: aload 1
      // 3c9: dload 19
      // 3cb: dload 3
      // 3cc: dadd
      // 3cd: dconst_0
      // 3ce: dload 21
      // 3d0: dload 5
      // 3d2: dadd
      // 3d3: invokevirtual i2h.w7w (DDD)V
      // 3d6: iload 2
      // 3d7: ifne 3fb
      // 3da: aload 0
      // 3db: dload 3
      // 3dc: dneg
      // 3dd: dconst_0
      // 3de: dload 5
      // 3e0: dneg
      // 3e1: invokevirtual _f3.w7w (DDD)V
      // 3e4: aload 1
      // 3e5: goto 3ec
      // 3e8: invokestatic _f3.a (Loov;)Loov;
      // 3eb: athrow
      // 3ec: dload 3
      // 3ed: ldc2_w 4.0
      // 3f0: ddiv
      // 3f1: dconst_0
      // 3f2: dload 5
      // 3f4: ldc2_w 4.0
      // 3f7: ddiv
      // 3f8: invokevirtual i2h.w7w (DDD)V
      // 3fb: return
   }

   @Override
   public void ltu(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.nmj = var1;
      this.gpf = var3;
      this.dx5 = var5;
      this.w2n = (double)var7;
      this.f68 = (double)var8;
      this.sty = var9 + 2;
      this.icv = this.hai;
      this.mop = this.cry;
      this.bw4 = this.hwp;
   }

   @Override
   public void lmm(double var1, double var3, double var5) {
      this.hai = this.icv = var1;
      this.cry = this.mop = var3;
      this.hwp = this.bw4 = var5;
   }

   public void xbf(float var1) {
      this.oit.c66(19, var1);
   }

   public float _3r() {
      return this.oit.ig2(19);
   }

   public void iux(int var1) {
      this.oit.c66(17, var1);
   }

   public int hg2() {
      return this.oit.zwc(17);
   }

   public void leq(int var1) {
      this.oit.c66(18, var1);
   }

   public int ov7() {
      return this.oit.zwc(18);
   }

   public abstract _f3$c3d x38();

   public zfz joa() {
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
      // 05: invokevirtual _f3.v3h ()Z
      // 08: iload 1
      // 09: ifne 2a
      // 0c: ifne 21
      // 0f: goto 16
      // 12: invokestatic _f3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual _f3.hcw ()Lzfz;
      // 1a: goto 2d
      // 1d: invokestatic _f3.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual _f3.a0c ()Lwl1;
      // 25: bipush 20
      // 27: invokevirtual wl1.zwc (I)I
      // 2a: invokestatic e0x.v1b (I)Lzfz;
      // 2d: areturn
   }

   public zfz hcw() {
      return ox_.ibw.l4i();
   }

   public int qxx() {
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
      // 06: ifeq 22
      // 09: invokevirtual _f3.v3h ()Z
      // 0c: ifne 21
      // 0f: goto 16
      // 12: invokestatic _f3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual _f3.a45 ()I
      // 1a: goto 2a
      // 1d: invokestatic _f3.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual _f3.a0c ()Lwl1;
      // 25: bipush 21
      // 27: invokevirtual wl1.zwc (I)I
      // 2a: ireturn
   }

   public int a45() {
      return 6;
   }

   public void t5j(zfz var1) {
      this.a0c().c66(20, e0x.r2y(var1));
      this.gbv(true);
   }

   public void y69(int var1) {
      this.a0c().c66(21, var1);
      this.gbv(true);
   }

   public boolean v3h() {
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
      // 05: invokevirtual _f3.a0c ()Lwl1;
      // 08: bipush 22
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifeq 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic _f3.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic _f3.a (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public void gbv(boolean var1) {
      int var2 = t9d.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.a0c();
               var10001 = 22;
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

   @Override
   public void x84(String var1) {
      this.gmn = var1;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 22
      // 09: getfield _f3.gmn Ljava/lang/String;
      // 0c: ifnull 21
      // 0f: goto 16
      // 12: invokestatic _f3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield _f3.gmn Ljava/lang/String;
      // 1a: goto 25
      // 1d: invokestatic _f3.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokespecial i2h.noc ()Ljava/lang/String;
      // 25: areturn
   }

   @Override
   public boolean qrh() {
      try {
         if (this.gmn != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public String hei() {
      return this.gmn;
   }

   @Override
   public ekw xyw() {
      if (this.qrh()) {
         tao var2 = new tao(this.gmn);
         var2.f4q().zn_(this.c7n());
         var2.f4q().o7m(this.b_q().toString());
         return var2;
      } else {
         hsu var1 = new hsu(this.noc(), new Object[0]);
         var1.f4q().zn_(this.c7n());
         var1.f4q().o7m(this.b_q().toString());
         return var1;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(776480250156913939L, -432021612753520387L, MethodHandles.lookup().lookupClass()).a(258110839588814L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 55614933401647L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "{ôL7o\u0011Û\u0006¡Ô^\u0096·@Ò>£^\"1?\u0012Øá \n\bè¼\u009b\u000eª\u008dec&Û\u0095\u0017\b\\\u0007\u008e\u008di\u008cbÜ\u0083£\u008d²sXöX¢ ]½ºg\u008a\u009cÍHq\u0000ÁÆÃ4{²\u0091\u00027,·½I¤\u0093n\\D\u007fÉ°ð \u0098Ç\u000fb\u0017¤\u0015` \u0003¼\u0085Àz\u001e¯\u0098\u0091\u0015\u0095cÊ\u0007÷4çz¬\u001e/\u008ea \u000b\u00180èÔAÎÓ\u0000\u0012¨\bEÕ\u0091¸½\u0014\u007f®ëä\u00137\b\u0002)O9j×x\u0018$½v\u008cù§E±Á\u001a\fdû½ôËJÆÐ\u0094\u009fÇd\u0001\u0010úÊ+\u001a\u00ad&¼\u001e\u0010äZÌ\u008d\u0096\u001eñ A\u008a1Vygõ\u001c÷Öa¡Ì1iT\u0001I\u0007F'¶\b\u0001k.\u008c²ìî%ù Î\u0089\u0000\u0082æVªÊÝ\u0096óÅ¾ei\u000e\u0003cY÷qå\u0011[Ì\u0018D½ £\b\u0007(/B$\u0095\u009c\u0091Ê,ÄÝ\u0003ü\\÷Ý÷áÌù§\u007fl\u0095!ýóç\u0094\u001bqÝe-MæKÛ©]¡";
      int var8 = "{ôL7o\u0011Û\u0006¡Ô^\u0096·@Ò>£^\"1?\u0012Øá \n\bè¼\u009b\u000eª\u008dec&Û\u0095\u0017\b\\\u0007\u008e\u008di\u008cbÜ\u0083£\u008d²sXöX¢ ]½ºg\u008a\u009cÍHq\u0000ÁÆÃ4{²\u0091\u00027,·½I¤\u0093n\\D\u007fÉ°ð \u0098Ç\u000fb\u0017¤\u0015` \u0003¼\u0085Àz\u001e¯\u0098\u0091\u0015\u0095cÊ\u0007÷4çz¬\u001e/\u008ea \u000b\u00180èÔAÎÓ\u0000\u0012¨\bEÕ\u0091¸½\u0014\u007f®ëä\u00137\b\u0002)O9j×x\u0018$½v\u008cù§E±Á\u001a\fdû½ôËJÆÐ\u0094\u009fÇd\u0001\u0010úÊ+\u001a\u00ad&¼\u001e\u0010äZÌ\u008d\u0096\u001eñ A\u008a1Vygõ\u001c÷Öa¡Ì1iT\u0001I\u0007F'¶\b\u0001k.\u008c²ìî%ù Î\u0089\u0000\u0082æVªÊÝ\u0096óÅ¾ei\u000e\u0003cY÷qå\u0011[Ì\u0018D½ £\b\u0007(/B$\u0095\u009c\u0091Ê,ÄÝ\u0003ü\\÷Ý÷áÌù§\u007fl\u0095!ýóç\u0094\u001bqÝe-MæKÛ©]¡"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     e = var9;
                     g = new String[12];
                     nnc = new int[][][]{
                        {{0, 0, -1}, {0, 0, 1}},
                        {{-1, 0, 0}, {1, 0, 0}},
                        {{-1, -1, 0}, {1, 0, 0}},
                        {{-1, 0, 0}, {1, -1, 0}},
                        {{0, 0, -1}, {0, -1, 1}},
                        {{0, -1, -1}, {0, 0, 1}},
                        {{0, 0, 1}, {1, 0, 0}},
                        {{0, 0, 1}, {-1, 0, 0}},
                        {{0, 0, -1}, {-1, 0, 0}},
                        {{0, 0, -1}, {1, 0, 0}}
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

                  var6 = "\u008d(Ó1Á¶JÛx(\u0083m\u0019\u0080\u008bå>\u008a\u0001í\u008f&/Ü6è?f^¸;¤$²!\u009fó\u0087\u0011\u00ad \u0016,º\u0007Ë¦±î¡\",³%'¾p95²A\u009eOz\u0014½ÚäÉ5¸§b";
                  var8 = "\u008d(Ó1Á¶JÛx(\u0083m\u0019\u0080\u008bå>\u008a\u0001í\u008f&/Ü6è?f^¸;¤$²!\u009fó\u0087\u0011\u00ad \u0016,º\u0007Ë¦±î¡\",³%'¾p95²A\u009eOz\u0014½ÚäÉ5¸§b"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11875;
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
            throw new RuntimeException("_f3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("_f3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
