import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class we7 extends s0i {
   public static final w9p vsc;
   private static final UUID y8d;
   private static final xk5 e7v;
   private final tn9 s5m = new tn9(this);
   private int t1u;
   private boolean qfw = false;
   private float w0c = -1.0F;
   private float vos;
   private static final long g;
   private static final String[] u;
   private static final String[] v;
   private static final Map w = new HashMap(13);

   public we7(t9d var1) {
      super(var1);
      ((zvv)this.zq2()).w2o(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(2, new h2d(this, ha9.class, 1.0, false));
      this.r1d.tn8(5, new rap(this, 1.0));
      this.r1d.tn8(7, new _tb(this, 1.0));
      this.r1d.tn8(8, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(8, new ov6(this));
      this.ch4();
      this.yxc(0.6F, 1.95F);
   }

   public void ch4() {
      this.r1d.tn8(4, new h2d(this, ysf.class, 1.0, true));
      this.r1d.tn8(4, new h2d(this, osf.class, 1.0, true));
      this.r1d.tn8(6, new zvn(this, 1.0, false));
      this.g9o.tn8(1, new z7z(this, true, new Class[]{v9i.class}));
      this.g9o.tn8(2, new s24(this, ha9.class, true));
      this.g9o.tn8(2, new s24(this, ysf.class, false));
      this.g9o.tn8(2, new s24(this, osf.class, true));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.wg4).zf7(35.0);
      this.dgt(m6d.w7i).zf7(0.23F);
      this.dgt(m6d.y3f).zf7(3.0);
      this.s_a().ylc(vsc).zf7(this.z2d.nextDouble() * 0.1F);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.a0c().kp2(12, (byte)0);
      this.a0c().kp2(13, (byte)0);
      this.a0c().kp2(14, (byte)0);
   }

   @Override
   public int y5z() {
      int var1 = t9d.c();
      int var2 = super.y5z() + 2;

      try {
         if (var1 != 0) {
            return var2;
         }

         if (var2 <= 20) {
            return var2;
         }
      } catch (oov var3) {
         throw d(var3);
      }

      return 20;
   }

   public boolean wpx() {
      return this.qfw;
   }

   public void s7_(boolean param1) {
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
      // 05: getfield we7.qfw Z
      // 08: iload 2
      // 09: ifeq 2f
      // 0c: iload 1
      // 0d: if_icmpeq 5b
      // 10: goto 17
      // 13: invokestatic we7.d (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: ifeq 51
      // 1c: goto 23
      // 1f: invokestatic we7.d (Loov;)Loov;
      // 22: athrow
      // 23: iload 1
      // 24: putfield we7.qfw Z
      // 27: iload 1
      // 28: goto 2f
      // 2b: invokestatic we7.d (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 49
      // 32: aload 0
      // 33: getfield we7.r1d Ldak;
      // 36: bipush 1
      // 37: aload 0
      // 38: getfield we7.s5m Ltn9;
      // 3b: invokevirtual dak.tn8 (ILcjm;)V
      // 3e: iload 2
      // 3f: ifne 5b
      // 42: goto 49
      // 45: invokestatic we7.d (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: goto 51
      // 4d: invokestatic we7.d (Loov;)Loov;
      // 50: athrow
      // 51: getfield we7.r1d Ldak;
      // 54: aload 0
      // 55: getfield we7.s5m Ltn9;
      // 58: invokevirtual dak.hmq (Lcjm;)V
      // 5b: return
   }

   @Override
   public boolean ejl() {
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
      // 05: invokevirtual we7.a0c ()Lwl1;
      // 08: bipush 12
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifne 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic we7.d (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic we7.d (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   @Override
   public int _96(ha9 param1) {
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
      // 05: invokevirtual we7.ejl ()Z
      // 08: iload 2
      // 09: ifeq 30
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic we7.d (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield we7.dlk I
      // 1b: i2f
      // 1c: ldc 2.5
      // 1e: nop
      // 1f: fmul
      // 20: f2i
      // 21: putfield we7.dlk I
      // 24: goto 2b
      // 27: invokestatic we7.d (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokespecial s0i._96 (Lha9;)I
      // 30: ireturn
   }

   public void j5i(boolean param1) {
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
      // 05: invokevirtual we7.a0c ()Lwl1;
      // 08: bipush 12
      // 0a: iload 1
      // 0b: iload 2
      // 0c: ifne 1a
      // 0f: ifeq 1d
      // 12: goto 19
      // 15: invokestatic we7.d (Loov;)Loov;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 1e
      // 1d: bipush 0
      // 1e: i2b
      // 1f: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 22: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 25: aload 0
      // 26: iload 2
      // 27: ifne 84
      // 2a: getfield we7.oay Lt9d;
      // 2d: ifnull 83
      // 30: goto 37
      // 33: invokestatic we7.d (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: iload 2
      // 39: ifne 84
      // 3c: goto 43
      // 3f: invokestatic we7.d (Loov;)Loov;
      // 42: athrow
      // 43: getfield we7.oay Lt9d;
      // 46: getfield t9d.v0f Z
      // 49: ifne 83
      // 4c: goto 53
      // 4f: invokestatic we7.d (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getstatic m6d.w7i Lw9p;
      // 57: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 5a: astore 3
      // 5b: aload 3
      // 5c: getstatic we7.e7v Lxk5;
      // 5f: invokeinterface _4o.se8 (Lxk5;)V 2
      // 64: iload 2
      // 65: ifne 88
      // 68: iload 1
      // 69: ifeq 83
      // 6c: goto 73
      // 6f: invokestatic we7.d (Loov;)Loov;
      // 72: athrow
      // 73: aload 3
      // 74: getstatic we7.e7v Lxk5;
      // 77: invokeinterface _4o.vcr (Lxk5;)V 2
      // 7c: goto 83
      // 7f: invokestatic we7.d (Loov;)Loov;
      // 82: athrow
      // 83: aload 0
      // 84: iload 1
      // 85: invokevirtual we7.o62 (Z)V
      // 88: return
   }

   public boolean okv() {
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
      // 05: invokevirtual we7.a0c ()Lwl1;
      // 08: bipush 13
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifne 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic we7.d (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic we7.d (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public void tgp(boolean var1) {
      int var2 = t9d.c();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.a0c();
               var10001 = 13;
               var10002 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw d(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
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
      // 005: getfield we7.oay Lt9d;
      // 008: invokevirtual t9d.m40 ()Z
      // 00b: iload 1
      // 00c: ifeq 168
      // 00f: ifeq 159
      // 012: goto 019
      // 015: invokestatic we7.d (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield we7.oay Lt9d;
      // 01d: getfield t9d.v0f Z
      // 020: iload 1
      // 021: ifeq 168
      // 024: goto 02b
      // 027: invokestatic we7.d (Loov;)Loov;
      // 02a: athrow
      // 02b: ifne 159
      // 02e: goto 035
      // 031: invokestatic we7.d (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: invokevirtual we7.ejl ()Z
      // 039: iload 1
      // 03a: ifeq 168
      // 03d: goto 044
      // 040: invokestatic we7.d (Loov;)Loov;
      // 043: athrow
      // 044: ifne 159
      // 047: goto 04e
      // 04a: invokestatic we7.d (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: fconst_1
      // 050: invokevirtual we7.xeu (F)F
      // 053: fstore 2
      // 054: new mew
      // 057: dup
      // 058: aload 0
      // 059: getfield we7.o2v D
      // 05c: aload 0
      // 05d: getfield we7.kfp D
      // 060: invokestatic java/lang/Math.round (D)J
      // 063: l2d
      // 064: aload 0
      // 065: getfield we7.vbd D
      // 068: invokespecial mew.<init> (DDD)V
      // 06b: astore 3
      // 06c: fload 2
      // 06d: ldc 0.5
      // 06f: nop
      // 070: fcmpl
      // 071: iload 1
      // 072: ifeq 168
      // 075: ifle 159
      // 078: goto 07f
      // 07b: invokestatic we7.d (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield we7.z2d Ljava/util/Random;
      // 083: invokevirtual java/util/Random.nextFloat ()F
      // 086: ldc 30.0
      // 088: nop
      // 089: fmul
      // 08a: fload 2
      // 08b: ldc 0.4
      // 08d: nop
      // 08e: fsub
      // 08f: fconst_2
      // 090: fmul
      // 091: fcmpg
      // 092: iload 1
      // 093: ifeq 168
      // 096: goto 09d
      // 099: invokestatic we7.d (Loov;)Loov;
      // 09c: athrow
      // 09d: ifge 159
      // 0a0: goto 0a7
      // 0a3: invokestatic we7.d (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield we7.oay Lt9d;
      // 0ab: aload 3
      // 0ac: invokevirtual t9d.cfv (Lmew;)Z
      // 0af: iload 1
      // 0b0: ifeq 168
      // 0b3: goto 0ba
      // 0b6: invokestatic we7.d (Loov;)Loov;
      // 0b9: athrow
      // 0ba: ifeq 159
      // 0bd: goto 0c4
      // 0c0: invokestatic we7.d (Loov;)Loov;
      // 0c3: athrow
      // 0c4: bipush 1
      // 0c5: istore 4
      // 0c7: aload 0
      // 0c8: bipush 4
      // 0c9: invokevirtual we7.rnq (I)Lerg;
      // 0cc: astore 5
      // 0ce: aload 5
      // 0d0: iload 1
      // 0d1: ifeq 0e0
      // 0d4: ifnull 13c
      // 0d7: goto 0de
      // 0da: invokestatic we7.d (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 5
      // 0e0: invokevirtual erg.dw2 ()Z
      // 0e3: iload 1
      // 0e4: ifeq 13a
      // 0e7: ifeq 139
      // 0ea: goto 0f1
      // 0ed: invokestatic we7.d (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 5
      // 0f3: aload 5
      // 0f5: invokevirtual erg.dzj ()I
      // 0f8: aload 0
      // 0f9: getfield we7.z2d Ljava/util/Random;
      // 0fc: bipush 2
      // 0fd: invokevirtual java/util/Random.nextInt (I)I
      // 100: iadd
      // 101: invokevirtual erg.awe (I)V
      // 104: aload 5
      // 106: invokevirtual erg.dzj ()I
      // 109: iload 1
      // 10a: ifeq 13a
      // 10d: goto 114
      // 110: invokestatic we7.d (Loov;)Loov;
      // 113: athrow
      // 114: aload 5
      // 116: invokevirtual erg.mg5 ()I
      // 119: if_icmplt 139
      // 11c: goto 123
      // 11f: invokestatic we7.d (Loov;)Loov;
      // 122: athrow
      // 123: aload 0
      // 124: aload 5
      // 126: invokevirtual we7.xgx (Lerg;)V
      // 129: aload 0
      // 12a: bipush 4
      // 12b: aconst_null
      // 12c: checkcast erg
      // 12f: invokevirtual we7.fga (ILerg;)V
      // 132: goto 139
      // 135: invokestatic we7.d (Loov;)Loov;
      // 138: athrow
      // 139: bipush 0
      // 13a: istore 4
      // 13c: iload 4
      // 13e: iload 1
      // 13f: ifeq 168
      // 142: ifeq 159
      // 145: goto 14c
      // 148: invokestatic we7.d (Loov;)Loov;
      // 14b: athrow
      // 14c: aload 0
      // 14d: bipush 8
      // 14f: invokevirtual we7.k03 (I)V
      // 152: goto 159
      // 155: invokestatic we7.d (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: iload 1
      // 15b: ifeq 1c0
      // 15e: invokevirtual we7.i0e ()Z
      // 161: goto 168
      // 164: invokestatic we7.d (Loov;)Loov;
      // 167: athrow
      // 168: ifeq 1bf
      // 16b: aload 0
      // 16c: iload 1
      // 16d: ifeq 1c0
      // 170: goto 177
      // 173: invokestatic we7.d (Loov;)Loov;
      // 176: athrow
      // 177: invokevirtual we7.q4v ()Lg_3;
      // 17a: ifnull 1bf
      // 17d: goto 184
      // 180: invokestatic we7.d (Loov;)Loov;
      // 183: athrow
      // 184: aload 0
      // 185: iload 1
      // 186: ifeq 1c0
      // 189: goto 190
      // 18c: invokestatic we7.d (Loov;)Loov;
      // 18f: athrow
      // 190: getfield we7.hzp Li2h;
      // 193: instanceof n78
      // 196: ifeq 1bf
      // 199: goto 1a0
      // 19c: invokestatic we7.d (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield we7.hzp Li2h;
      // 1a4: checkcast yqv
      // 1a7: invokevirtual yqv.zq2 ()Lp8a;
      // 1aa: aload 0
      // 1ab: invokevirtual we7.zq2 ()Lp8a;
      // 1ae: invokevirtual p8a.v_4 ()Lt_2;
      // 1b1: ldc2_w 1.5
      // 1b4: invokevirtual p8a.sh7 (Lt_2;D)Z
      // 1b7: pop
      // 1b8: goto 1bf
      // 1bb: invokestatic we7.d (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: invokespecial s0i.e_a ()V
      // 1c3: return
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
      // 000: getstatic we7.g J
      // 003: ldc2_w 22195147422589
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: aload 1
      // 00f: fload 2
      // 010: invokespecial s0i.m1t (Lofh;F)Z
      // 013: iload 5
      // 015: ifeq 2cd
      // 018: ifeq 2cc
      // 01b: goto 022
      // 01e: invokestatic we7.d (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: invokevirtual we7.q4v ()Lg_3;
      // 026: astore 6
      // 028: aload 6
      // 02a: iload 5
      // 02c: ifeq 068
      // 02f: ifnonnull 066
      // 032: goto 039
      // 035: invokestatic we7.d (Loov;)Loov;
      // 038: athrow
      // 039: aload 1
      // 03a: invokevirtual ofh.nra ()Li2h;
      // 03d: iload 5
      // 03f: ifeq 061
      // 042: goto 049
      // 045: invokestatic we7.d (Loov;)Loov;
      // 048: athrow
      // 049: instanceof g_3
      // 04c: ifeq 066
      // 04f: goto 056
      // 052: invokestatic we7.d (Loov;)Loov;
      // 055: athrow
      // 056: aload 1
      // 057: invokevirtual ofh.nra ()Li2h;
      // 05a: goto 061
      // 05d: invokestatic we7.d (Loov;)Loov;
      // 060: athrow
      // 061: checkcast g_3
      // 064: astore 6
      // 066: aload 6
      // 068: ifnull 2ca
      // 06b: aload 0
      // 06c: iload 5
      // 06e: ifeq 093
      // 071: goto 078
      // 074: invokestatic we7.d (Loov;)Loov;
      // 077: athrow
      // 078: getfield we7.oay Lt9d;
      // 07b: invokevirtual t9d.rbk ()Lv66;
      // 07e: getstatic v66.csg Lv66;
      // 081: if_acmpne 2ca
      // 084: goto 08b
      // 087: invokestatic we7.d (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 0
      // 08c: goto 093
      // 08f: invokestatic we7.d (Loov;)Loov;
      // 092: athrow
      // 093: getfield we7.z2d Ljava/util/Random;
      // 096: invokevirtual java/util/Random.nextFloat ()F
      // 099: f2d
      // 09a: aload 0
      // 09b: getstatic we7.vsc Lw9p;
      // 09e: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 0a1: invokeinterface _4o.nz5 ()D 1
      // 0a6: dcmpg
      // 0a7: iload 5
      // 0a9: ifeq 2cb
      // 0ac: ifge 2ca
      // 0af: goto 0b6
      // 0b2: invokestatic we7.d (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield we7.o2v D
      // 0ba: invokestatic fe6.jqf (D)I
      // 0bd: istore 7
      // 0bf: aload 0
      // 0c0: getfield we7.kfp D
      // 0c3: invokestatic fe6.jqf (D)I
      // 0c6: istore 8
      // 0c8: aload 0
      // 0c9: getfield we7.vbd D
      // 0cc: invokestatic fe6.jqf (D)I
      // 0cf: istore 9
      // 0d1: new we7
      // 0d4: dup
      // 0d5: aload 0
      // 0d6: getfield we7.oay Lt9d;
      // 0d9: invokespecial we7.<init> (Lt9d;)V
      // 0dc: astore 10
      // 0de: bipush 0
      // 0df: istore 11
      // 0e1: iload 11
      // 0e3: bipush 50
      // 0e5: if_icmpge 2ca
      // 0e8: iload 7
      // 0ea: aload 0
      // 0eb: getfield we7.z2d Ljava/util/Random;
      // 0ee: bipush 7
      // 0f0: bipush 40
      // 0f2: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 0f5: aload 0
      // 0f6: getfield we7.z2d Ljava/util/Random;
      // 0f9: bipush -1
      // 0fa: bipush 1
      // 0fb: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 0fe: imul
      // 0ff: iadd
      // 100: istore 12
      // 102: iload 8
      // 104: aload 0
      // 105: getfield we7.z2d Ljava/util/Random;
      // 108: bipush 7
      // 10a: bipush 40
      // 10c: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 10f: aload 0
      // 110: getfield we7.z2d Ljava/util/Random;
      // 113: bipush -1
      // 114: bipush 1
      // 115: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 118: imul
      // 119: iadd
      // 11a: istore 13
      // 11c: iload 9
      // 11e: aload 0
      // 11f: getfield we7.z2d Ljava/util/Random;
      // 122: bipush 7
      // 124: bipush 40
      // 126: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 129: aload 0
      // 12a: getfield we7.z2d Ljava/util/Random;
      // 12d: bipush -1
      // 12e: bipush 1
      // 12f: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 132: imul
      // 133: iadd
      // 134: istore 14
      // 136: iload 5
      // 138: ifeq 2c5
      // 13b: aload 0
      // 13c: getfield we7.oay Lt9d;
      // 13f: new mew
      // 142: dup
      // 143: iload 12
      // 145: iload 13
      // 147: bipush 1
      // 148: isub
      // 149: iload 14
      // 14b: invokespecial mew.<init> (III)V
      // 14e: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 151: iload 5
      // 153: ifeq 2cb
      // 156: goto 15d
      // 159: invokestatic we7.d (Loov;)Loov;
      // 15c: athrow
      // 15d: ifeq 2bb
      // 160: goto 167
      // 163: invokestatic we7.d (Loov;)Loov;
      // 166: athrow
      // 167: aload 0
      // 168: getfield we7.oay Lt9d;
      // 16b: new mew
      // 16e: dup
      // 16f: iload 12
      // 171: iload 13
      // 173: iload 14
      // 175: invokespecial mew.<init> (III)V
      // 178: invokevirtual t9d.rts (Lmew;)I
      // 17b: iload 5
      // 17d: ifeq 1c7
      // 180: goto 187
      // 183: invokestatic we7.d (Loov;)Loov;
      // 186: athrow
      // 187: bipush 10
      // 189: if_icmpge 2bb
      // 18c: goto 193
      // 18f: invokestatic we7.d (Loov;)Loov;
      // 192: athrow
      // 193: aload 10
      // 195: iload 12
      // 197: i2d
      // 198: iload 13
      // 19a: i2d
      // 19b: iload 14
      // 19d: i2d
      // 19e: invokevirtual we7.m6_ (DDD)V
      // 1a1: iload 5
      // 1a3: ifeq 2c5
      // 1a6: goto 1ad
      // 1a9: invokestatic we7.d (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: getfield we7.oay Lt9d;
      // 1b1: iload 12
      // 1b3: i2d
      // 1b4: iload 13
      // 1b6: i2d
      // 1b7: iload 14
      // 1b9: i2d
      // 1ba: ldc2_w 7.0
      // 1bd: invokevirtual t9d.dig (DDDD)Z
      // 1c0: goto 1c7
      // 1c3: invokestatic we7.d (Loov;)Loov;
      // 1c6: athrow
      // 1c7: ifne 2bb
      // 1ca: aload 0
      // 1cb: getfield we7.oay Lt9d;
      // 1ce: aload 10
      // 1d0: invokevirtual we7.aaw ()Lnh4;
      // 1d3: aload 10
      // 1d5: invokevirtual t9d.g17 (Lnh4;Li2h;)Z
      // 1d8: iload 5
      // 1da: ifeq 208
      // 1dd: goto 1e4
      // 1e0: invokestatic we7.d (Loov;)Loov;
      // 1e3: athrow
      // 1e4: ifeq 2bb
      // 1e7: goto 1ee
      // 1ea: invokestatic we7.d (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: getfield we7.oay Lt9d;
      // 1f2: aload 10
      // 1f4: aload 10
      // 1f6: invokevirtual we7.aaw ()Lnh4;
      // 1f9: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 1fc: invokeinterface java/util/List.isEmpty ()Z 1
      // 201: goto 208
      // 204: invokestatic we7.d (Loov;)Loov;
      // 207: athrow
      // 208: iload 5
      // 20a: ifeq 22a
      // 20d: ifeq 2bb
      // 210: goto 217
      // 213: invokestatic we7.d (Loov;)Loov;
      // 216: athrow
      // 217: aload 0
      // 218: getfield we7.oay Lt9d;
      // 21b: aload 10
      // 21d: invokevirtual we7.aaw ()Lnh4;
      // 220: invokevirtual t9d.hhd (Lnh4;)Z
      // 223: goto 22a
      // 226: invokestatic we7.d (Loov;)Loov;
      // 229: athrow
      // 22a: iload 5
      // 22c: ifeq 249
      // 22f: ifne 2bb
      // 232: goto 239
      // 235: invokestatic we7.d (Loov;)Loov;
      // 238: athrow
      // 239: aload 0
      // 23a: getfield we7.oay Lt9d;
      // 23d: aload 10
      // 23f: invokevirtual t9d.xzq (Li2h;)Z
      // 242: goto 249
      // 245: invokestatic we7.d (Loov;)Loov;
      // 248: athrow
      // 249: pop
      // 24a: aload 10
      // 24c: aload 6
      // 24e: invokevirtual we7.ux8 (Lg_3;)V
      // 251: aload 10
      // 253: aload 0
      // 254: getfield we7.oay Lt9d;
      // 257: new mew
      // 25a: dup
      // 25b: aload 10
      // 25d: invokespecial mew.<init> (Li2h;)V
      // 260: invokevirtual t9d.sms (Lmew;)Lcss;
      // 263: aconst_null
      // 264: checkcast ps6
      // 267: invokevirtual we7.hx8 (Lcss;Lps6;)Lps6;
      // 26a: pop
      // 26b: aload 0
      // 26c: getstatic we7.vsc Lw9p;
      // 26f: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 272: new xk5
      // 275: dup
      // 276: sipush 15823
      // 279: ldc2_w 67960755080429151
      // 27c: lload 3
      // 27d: lxor
      // 27e: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: nop
      // 284: ldc2_w -0.05000000074505806
      // 287: bipush 0
      // 288: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 28b: invokeinterface _4o.vcr (Lxk5;)V 2
      // 290: aload 10
      // 292: getstatic we7.vsc Lw9p;
      // 295: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 298: new xk5
      // 29b: dup
      // 29c: sipush 6562
      // 29f: ldc2_w 5787794431704029756
      // 2a2: lload 3
      // 2a3: lxor
      // 2a4: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: nop
      // 2aa: ldc2_w -0.05000000074505806
      // 2ad: bipush 0
      // 2ae: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 2b1: invokeinterface _4o.vcr (Lxk5;)V 2
      // 2b6: iload 5
      // 2b8: ifne 2ca
      // 2bb: iinc 11 1
      // 2be: goto 2c5
      // 2c1: invokestatic we7.d (Loov;)Loov;
      // 2c4: athrow
      // 2c5: iload 5
      // 2c7: ifne 0e1
      // 2ca: bipush 1
      // 2cb: ireturn
      // 2cc: bipush 0
      // 2cd: ireturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 5f
      // 09: getfield we7.oay Lt9d;
      // 0c: getfield t9d.v0f Z
      // 0f: ifne 5e
      // 12: goto 19
      // 15: invokestatic we7.d (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifeq 5f
      // 1e: goto 25
      // 21: invokestatic we7.d (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual we7.th2 ()Z
      // 28: ifeq 5e
      // 2b: goto 32
      // 2e: invokestatic we7.d (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual we7.q5s ()I
      // 36: istore 2
      // 37: aload 0
      // 38: dup
      // 39: getfield we7.t1u I
      // 3c: iload 2
      // 3d: isub
      // 3e: putfield we7.t1u I
      // 41: aload 0
      // 42: iload 1
      // 43: ifeq 5f
      // 46: getfield we7.t1u I
      // 49: ifgt 5e
      // 4c: goto 53
      // 4f: invokestatic we7.d (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: invokevirtual we7.exu ()V
      // 57: goto 5e
      // 5a: invokestatic we7.d (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokespecial s0i.xx_ ()V
      // 62: return
   }

   @Override
   public boolean _nm(i2h param1) {
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
      // 05: aload 1
      // 06: invokespecial s0i._nm (Li2h;)Z
      // 09: istore 3
      // 0a: iload 3
      // 0b: iload 2
      // 0c: ifeq 84
      // 0f: ifeq 83
      // 12: goto 19
      // 15: invokestatic we7.d (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield we7.oay Lt9d;
      // 1d: invokevirtual t9d.rbk ()Lv66;
      // 20: invokevirtual v66.dzc ()I
      // 23: iload 2
      // 24: ifeq 84
      // 27: goto 2e
      // 2a: invokestatic we7.d (Loov;)Loov;
      // 2d: athrow
      // 2e: istore 4
      // 30: aload 0
      // 31: invokevirtual we7.tsc ()Lerg;
      // 34: ifnonnull 83
      // 37: aload 0
      // 38: invokevirtual we7.agj ()Z
      // 3b: iload 2
      // 3c: ifeq 84
      // 3f: goto 46
      // 42: invokestatic we7.d (Loov;)Loov;
      // 45: athrow
      // 46: ifeq 83
      // 49: goto 50
      // 4c: invokestatic we7.d (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield we7.z2d Ljava/util/Random;
      // 54: invokevirtual java/util/Random.nextFloat ()F
      // 57: iload 4
      // 59: i2f
      // 5a: ldc 0.3
      // 5c: nop
      // 5d: fmul
      // 5e: fcmpg
      // 5f: iload 2
      // 60: ifeq 84
      // 63: goto 6a
      // 66: invokestatic we7.d (Loov;)Loov;
      // 69: athrow
      // 6a: ifge 83
      // 6d: goto 74
      // 70: invokestatic we7.d (Loov;)Loov;
      // 73: athrow
      // 74: aload 1
      // 75: bipush 2
      // 76: iload 4
      // 78: imul
      // 79: invokevirtual i2h.k03 (I)V
      // 7c: goto 83
      // 7f: invokestatic we7.d (Loov;)Loov;
      // 82: athrow
      // 83: iload 3
      // 84: ireturn
   }

   @Override
   public String _n1() {
      long var1 = g ^ 77217640015387L;
      return e<"z">(8666, 2060883226985316133L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = g ^ 101824686844259L;
      return e<"z">(27095, 3840163540826159175L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = g ^ 109870350622509L;
      return e<"z">(30132, 3450093057554993783L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = g ^ 25939716343393L;
      this.lhu(e<"z">(10458, 8056927041364874830L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public u7m q4n() {
      return xbr.ii5;
   }

   @Override
   public n1e fhc() {
      return n1e.via;
   }

   @Override
   public void z3m() {
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
      // 06: ifeq 38
      // 09: getfield we7.z2d Ljava/util/Random;
      // 0c: bipush 3
      // 0d: invokevirtual java/util/Random.nextInt (I)I
      // 10: tableswitch 88 0 2 32 52 72
      // 2c: invokestatic we7.d (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic we7.d (Loov;)Loov;
      // 37: athrow
      // 38: getstatic xbr.icz Lu7m;
      // 3b: bipush 1
      // 3c: invokevirtual we7.e70 (Lu7m;I)Lnvf;
      // 3f: pop
      // 40: iload 1
      // 41: ifne 68
      // 44: aload 0
      // 45: getstatic xbr.aar Lu7m;
      // 48: bipush 1
      // 49: invokevirtual we7.e70 (Lu7m;I)Lnvf;
      // 4c: pop
      // 4d: iload 1
      // 4e: ifne 68
      // 51: goto 58
      // 54: invokestatic we7.d (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getstatic xbr.dzx Lu7m;
      // 5c: bipush 1
      // 5d: invokevirtual we7.e70 (Lu7m;I)Lnvf;
      // 60: pop
      // 61: goto 68
      // 64: invokestatic we7.d (Loov;)Loov;
      // 67: athrow
      // 68: return
   }

   @Override
   public void _58(css param1) {
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
      // 05: aload 1
      // 06: invokespecial s0i._58 (Lcss;)V
      // 09: aload 0
      // 0a: getfield we7.z2d Ljava/util/Random;
      // 0d: invokevirtual java/util/Random.nextFloat ()F
      // 10: aload 0
      // 11: getfield we7.oay Lt9d;
      // 14: invokevirtual t9d.rbk ()Lv66;
      // 17: getstatic v66.csg Lv66;
      // 1a: if_acmpne 27
      // 1d: ldc 0.05
      // 1f: nop
      // 20: goto 2a
      // 23: invokestatic we7.d (Loov;)Loov;
      // 26: athrow
      // 27: ldc 0.01
      // 29: nop
      // 2a: fcmpg
      // 2b: iload 2
      // 2c: ifeq 48
      // 2f: ifge 88
      // 32: goto 39
      // 35: invokestatic we7.d (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield we7.z2d Ljava/util/Random;
      // 3d: bipush 3
      // 3e: invokevirtual java/util/Random.nextInt (I)I
      // 41: goto 48
      // 44: invokestatic we7.d (Loov;)Loov;
      // 47: athrow
      // 48: istore 3
      // 49: iload 2
      // 4a: ifeq 6e
      // 4d: iload 3
      // 4e: ifne 72
      // 51: goto 58
      // 54: invokestatic we7.d (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: bipush 0
      // 5a: new erg
      // 5d: dup
      // 5e: getstatic xbr.jfo Lu7m;
      // 61: invokespecial erg.<init> (Lu7m;)V
      // 64: invokevirtual we7.fga (ILerg;)V
      // 67: goto 6e
      // 6a: invokestatic we7.d (Loov;)Loov;
      // 6d: athrow
      // 6e: iload 2
      // 6f: ifne 88
      // 72: aload 0
      // 73: bipush 0
      // 74: new erg
      // 77: dup
      // 78: getstatic xbr.p91 Lu7m;
      // 7b: invokespecial erg.<init> (Lu7m;)V
      // 7e: invokevirtual we7.fga (ILerg;)V
      // 81: goto 88
      // 84: invokestatic we7.d (Loov;)Loov;
      // 87: athrow
      // 88: return
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
      // 00: getstatic we7.g J
      // 03: ldc2_w 78086606937197
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial s0i.srs (Lbdo;)V
      // 12: aload 0
      // 13: invokevirtual we7.ejl ()Z
      // 16: iload 4
      // 18: ifeq 43
      // 1b: ifeq 3f
      // 1e: goto 25
      // 21: invokestatic we7.d (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: sipush 17021
      // 29: ldc2_w 7853184301229816
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: bipush 1
      // 35: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 38: goto 3f
      // 3b: invokestatic we7.d (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual we7.okv ()Z
      // 43: ifeq 60
      // 46: aload 1
      // 47: sipush 29574
      // 4a: ldc2_w 9065855772415088385
      // 4d: lload 2
      // 4e: lxor
      // 4f: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: nop
      // 55: bipush 1
      // 56: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 59: goto 60
      // 5c: invokestatic we7.d (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: sipush 14807
      // 64: ldc2_w 5987846204078660947
      // 67: lload 2
      // 68: lxor
      // 69: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: nop
      // 6f: aload 0
      // 70: invokevirtual we7.th2 ()Z
      // 73: iload 4
      // 75: ifeq 8d
      // 78: ifeq 90
      // 7b: goto 82
      // 7e: invokestatic we7.d (Loov;)Loov;
      // 81: athrow
      // 82: aload 0
      // 83: getfield we7.t1u I
      // 86: goto 8d
      // 89: invokestatic we7.d (Loov;)Loov;
      // 8c: athrow
      // 8d: goto 91
      // 90: bipush -1
      // 91: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 94: aload 1
      // 95: sipush 12298
      // 98: ldc2_w 4260601888885740678
      // 9b: lload 2
      // 9c: lxor
      // 9d: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: nop
      // a3: aload 0
      // a4: invokevirtual we7.wpx ()Z
      // a7: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // aa: return
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
      // 00: getstatic we7.g J
      // 03: ldc2_w 54609186435270
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial s0i.cjb (Lbdo;)V
      // 12: aload 1
      // 13: sipush 10855
      // 16: ldc2_w 4635977850516955728
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 24: iload 4
      // 26: ifeq 51
      // 29: ifeq 3f
      // 2c: goto 33
      // 2f: invokestatic we7.d (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: bipush 1
      // 35: invokevirtual we7.j5i (Z)V
      // 38: goto 3f
      // 3b: invokestatic we7.d (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: sipush 20894
      // 43: ldc2_w 1171877003801598398
      // 46: lload 2
      // 47: lxor
      // 48: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: nop
      // 4e: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 51: iload 4
      // 53: ifeq 80
      // 56: ifeq 6c
      // 59: goto 60
      // 5c: invokestatic we7.d (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: bipush 1
      // 62: invokevirtual we7.tgp (Z)V
      // 65: goto 6c
      // 68: invokestatic we7.d (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 1
      // 6d: sipush 3131
      // 70: ldc2_w 7368384856989811736
      // 73: lload 2
      // 74: lxor
      // 75: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: bipush 99
      // 7d: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 80: iload 4
      // 82: ifeq a8
      // 85: ifeq c9
      // 88: goto 8f
      // 8b: invokestatic we7.d (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 1
      // 90: sipush 3131
      // 93: ldc2_w 7368384856989811736
      // 96: lload 2
      // 97: lxor
      // 98: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: nop
      // 9e: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // a1: goto a8
      // a4: invokestatic we7.d (Loov;)Loov;
      // a7: athrow
      // a8: bipush -1
      // a9: if_icmple c9
      // ac: aload 0
      // ad: aload 1
      // ae: sipush 3131
      // b1: ldc2_w 7368384856989811736
      // b4: lload 2
      // b5: lxor
      // b6: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: nop
      // bc: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // bf: invokevirtual we7.lvt (I)V
      // c2: goto c9
      // c5: invokestatic we7.d (Loov;)Loov;
      // c8: athrow
      // c9: aload 0
      // ca: aload 1
      // cb: sipush 5429
      // ce: ldc2_w 8692463748100152600
      // d1: lload 2
      // d2: lxor
      // d3: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: nop
      // d9: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // dc: invokevirtual we7.s7_ (Z)V
      // df: return
   }

   @Override
   public void s5f(g_3 param1) {
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
      // 005: aload 1
      // 006: invokespecial s0i.s5f (Lg_3;)V
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 048
      // 00e: getfield we7.oay Lt9d;
      // 011: invokevirtual t9d.rbk ()Lv66;
      // 014: getstatic v66.b_4 Lv66;
      // 017: if_acmpeq 040
      // 01a: goto 021
      // 01d: invokestatic we7.d (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: iload 2
      // 023: ifne 048
      // 026: goto 02d
      // 029: invokestatic we7.d (Loov;)Loov;
      // 02c: athrow
      // 02d: getfield we7.oay Lt9d;
      // 030: invokevirtual t9d.rbk ()Lv66;
      // 033: getstatic v66.csg Lv66;
      // 036: if_acmpne 150
      // 039: goto 040
      // 03c: invokestatic we7.d (Loov;)Loov;
      // 03f: athrow
      // 040: aload 1
      // 041: goto 048
      // 044: invokestatic we7.d (Loov;)Loov;
      // 047: athrow
      // 048: instanceof ysf
      // 04b: ifeq 150
      // 04e: aload 0
      // 04f: iload 2
      // 050: ifne 092
      // 053: goto 05a
      // 056: invokestatic we7.d (Loov;)Loov;
      // 059: athrow
      // 05a: getfield we7.oay Lt9d;
      // 05d: invokevirtual t9d.rbk ()Lv66;
      // 060: getstatic v66.csg Lv66;
      // 063: if_acmpeq 08e
      // 066: goto 06d
      // 069: invokestatic we7.d (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 0
      // 06e: iload 2
      // 06f: ifne 092
      // 072: goto 079
      // 075: invokestatic we7.d (Loov;)Loov;
      // 078: athrow
      // 079: getfield we7.z2d Ljava/util/Random;
      // 07c: invokevirtual java/util/Random.nextBoolean ()Z
      // 07f: ifeq 08e
      // 082: goto 089
      // 085: invokestatic we7.d (Loov;)Loov;
      // 088: athrow
      // 089: return
      // 08a: invokestatic we7.d (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 1
      // 08f: checkcast yqv
      // 092: astore 3
      // 093: new we7
      // 096: dup
      // 097: aload 0
      // 098: getfield we7.oay Lt9d;
      // 09b: invokespecial we7.<init> (Lt9d;)V
      // 09e: astore 4
      // 0a0: aload 4
      // 0a2: aload 1
      // 0a3: invokevirtual we7.nyk (Li2h;)V
      // 0a6: aload 0
      // 0a7: getfield we7.oay Lt9d;
      // 0aa: aload 1
      // 0ab: invokevirtual t9d.rqa (Li2h;)V
      // 0ae: aload 4
      // 0b0: aload 0
      // 0b1: getfield we7.oay Lt9d;
      // 0b4: new mew
      // 0b7: dup
      // 0b8: aload 4
      // 0ba: invokespecial mew.<init> (Li2h;)V
      // 0bd: invokevirtual t9d.sms (Lmew;)Lcss;
      // 0c0: aconst_null
      // 0c1: checkcast ps6
      // 0c4: invokevirtual we7.hx8 (Lcss;Lps6;)Lps6;
      // 0c7: pop
      // 0c8: aload 4
      // 0ca: bipush 1
      // 0cb: invokevirtual we7.tgp (Z)V
      // 0ce: aload 1
      // 0cf: invokevirtual g_3.ejl ()Z
      // 0d2: iload 2
      // 0d3: ifne 0fa
      // 0d6: ifeq 0ed
      // 0d9: goto 0e0
      // 0dc: invokestatic we7.d (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 4
      // 0e2: bipush 1
      // 0e3: invokevirtual we7.j5i (Z)V
      // 0e6: goto 0ed
      // 0e9: invokestatic we7.d (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 4
      // 0ef: aload 3
      // 0f0: invokevirtual yqv.r1t ()Z
      // 0f3: invokevirtual we7.x53 (Z)V
      // 0f6: aload 3
      // 0f7: invokevirtual yqv.qrh ()Z
      // 0fa: iload 2
      // 0fb: ifne 12a
      // 0fe: ifeq 121
      // 101: goto 108
      // 104: invokestatic we7.d (Loov;)Loov;
      // 107: athrow
      // 108: aload 4
      // 10a: aload 3
      // 10b: invokevirtual yqv.hei ()Ljava/lang/String;
      // 10e: invokevirtual we7.x84 (Ljava/lang/String;)V
      // 111: aload 4
      // 113: aload 3
      // 114: invokevirtual yqv.bpc ()Z
      // 117: invokevirtual we7.krn (Z)V
      // 11a: goto 121
      // 11d: invokestatic we7.d (Loov;)Loov;
      // 120: athrow
      // 121: aload 0
      // 122: getfield we7.oay Lt9d;
      // 125: aload 4
      // 127: invokevirtual t9d.xzq (Li2h;)Z
      // 12a: pop
      // 12b: aload 0
      // 12c: getfield we7.oay Lt9d;
      // 12f: aconst_null
      // 130: checkcast ha9
      // 133: sipush 1016
      // 136: new mew
      // 139: dup
      // 13a: aload 0
      // 13b: getfield we7.o2v D
      // 13e: d2i
      // 13f: aload 0
      // 140: getfield we7.kfp D
      // 143: d2i
      // 144: aload 0
      // 145: getfield we7.vbd D
      // 148: d2i
      // 149: invokespecial mew.<init> (III)V
      // 14c: bipush 0
      // 14d: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 150: return
   }

   @Override
   public float c5y() {
      float var1 = 1.74F;
      if (this.ejl()) {
         var1 = (float)((double)var1 - 0.81);
      }

      return var1;
   }

   @Override
   public boolean a5l(erg param1) {
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
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: getstatic xbr.ipl Lu7m;
      // 0b: if_acmpne 48
      // 0e: aload 0
      // 0f: iload 2
      // 10: ifeq 49
      // 13: goto 1a
      // 16: invokestatic we7.d (Loov;)Loov;
      // 19: athrow
      // 1a: invokevirtual we7.ejl ()Z
      // 1d: ifeq 48
      // 20: goto 27
      // 23: invokestatic we7.d (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: iload 2
      // 29: ifeq 49
      // 2c: goto 33
      // 2f: invokestatic we7.d (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual we7.i0e ()Z
      // 36: ifeq 48
      // 39: goto 40
      // 3c: invokestatic we7.d (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 0
      // 41: goto 4d
      // 44: invokestatic we7.d (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 1
      // 4a: invokespecial s0i.a5l (Lerg;)Z
      // 4d: ireturn
   }

   @Override
   public ps6 hx8(css param1, ps6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic we7.g J
      // 003: ldc2_w 98659371060973
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: aload 1
      // 00a: aload 2
      // 00b: invokespecial s0i.hx8 (Lcss;Lps6;)Lps6;
      // 00e: astore 2
      // 00f: invokestatic t9d.c ()I
      // 012: aload 1
      // 013: invokevirtual css.os2 ()F
      // 016: fstore 6
      // 018: istore 5
      // 01a: aload 0
      // 01b: aload 0
      // 01c: getfield we7.z2d Ljava/util/Random;
      // 01f: invokevirtual java/util/Random.nextFloat ()F
      // 022: ldc 0.55
      // 024: nop
      // 025: fload 6
      // 027: fmul
      // 028: fcmpg
      // 029: iload 5
      // 02b: ifne 039
      // 02e: ifge 03c
      // 031: goto 038
      // 034: invokestatic we7.d (Loov;)Loov;
      // 037: athrow
      // 038: bipush 1
      // 039: goto 03d
      // 03c: bipush 0
      // 03d: invokevirtual we7.onk (Z)V
      // 040: aload 2
      // 041: iload 5
      // 043: ifne 092
      // 046: ifnonnull 091
      // 049: goto 050
      // 04c: invokestatic we7.d (Loov;)Loov;
      // 04f: athrow
      // 050: new we7$nyh
      // 053: dup
      // 054: aload 0
      // 055: aload 0
      // 056: getfield we7.oay Lt9d;
      // 059: getfield t9d.fsy Ljava/util/Random;
      // 05c: invokevirtual java/util/Random.nextFloat ()F
      // 05f: ldc 0.05
      // 061: nop
      // 062: fcmpg
      // 063: ifge 075
      // 066: goto 06d
      // 069: invokestatic we7.d (Loov;)Loov;
      // 06c: athrow
      // 06d: bipush 1
      // 06e: goto 076
      // 071: invokestatic we7.d (Loov;)Loov;
      // 074: athrow
      // 075: bipush 0
      // 076: aload 0
      // 077: getfield we7.oay Lt9d;
      // 07a: getfield t9d.fsy Ljava/util/Random;
      // 07d: invokevirtual java/util/Random.nextFloat ()F
      // 080: ldc 0.05
      // 082: nop
      // 083: fcmpg
      // 084: ifge 08b
      // 087: bipush 1
      // 088: goto 08c
      // 08b: bipush 0
      // 08c: aconst_null
      // 08d: invokespecial we7$nyh.<init> (Lwe7;ZZLwe7$1;)V
      // 090: astore 2
      // 091: aload 2
      // 092: iload 5
      // 094: ifne 0ac
      // 097: instanceof we7$nyh
      // 09a: ifeq 1d2
      // 09d: goto 0a4
      // 0a0: invokestatic we7.d (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 2
      // 0a5: goto 0ac
      // 0a8: invokestatic we7.d (Loov;)Loov;
      // 0ab: athrow
      // 0ac: checkcast we7$nyh
      // 0af: astore 7
      // 0b1: aload 7
      // 0b3: getfield we7$nyh.ga9 Z
      // 0b6: iload 5
      // 0b8: ifne 0d6
      // 0bb: ifeq 0d1
      // 0be: goto 0c5
      // 0c1: invokestatic we7.d (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: bipush 1
      // 0c7: invokevirtual we7.tgp (Z)V
      // 0ca: goto 0d1
      // 0cd: invokestatic we7.d (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 7
      // 0d3: getfield we7$nyh.nu7 Z
      // 0d6: iload 5
      // 0d8: ifne 100
      // 0db: ifeq 1d2
      // 0de: goto 0e5
      // 0e1: invokestatic we7.d (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: bipush 1
      // 0e7: invokevirtual we7.j5i (Z)V
      // 0ea: aload 0
      // 0eb: getfield we7.oay Lt9d;
      // 0ee: getfield t9d.fsy Ljava/util/Random;
      // 0f1: invokevirtual java/util/Random.nextFloat ()F
      // 0f4: f2d
      // 0f5: ldc2_w 0.05
      // 0f8: dcmpg
      // 0f9: goto 100
      // 0fc: invokestatic we7.d (Loov;)Loov;
      // 0ff: athrow
      // 100: iload 5
      // 102: ifne 18b
      // 105: ifge 169
      // 108: goto 10f
      // 10b: invokestatic we7.d (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield we7.oay Lt9d;
      // 113: ldc n78
      // 115: nop
      // 116: aload 0
      // 117: invokevirtual we7.aaw ()Lnh4;
      // 11a: ldc2_w 5.0
      // 11d: ldc2_w 3.0
      // 120: ldc2_w 5.0
      // 123: invokevirtual nh4.c2h (DDD)Lnh4;
      // 126: getstatic k0_.bxu Lcom/google/common/base/Predicate;
      // 129: invokevirtual t9d.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 12c: astore 8
      // 12e: aload 8
      // 130: iload 5
      // 132: ifne 153
      // 135: invokeinterface java/util/List.isEmpty ()Z 1
      // 13a: ifne 164
      // 13d: goto 144
      // 140: invokestatic we7.d (Loov;)Loov;
      // 143: athrow
      // 144: aload 8
      // 146: bipush 0
      // 147: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 14c: goto 153
      // 14f: invokestatic we7.d (Loov;)Loov;
      // 152: athrow
      // 153: checkcast n78
      // 156: astore 9
      // 158: aload 9
      // 15a: bipush 1
      // 15b: invokevirtual n78.igl (Z)V
      // 15e: aload 0
      // 15f: aload 9
      // 161: invokevirtual we7.nw9 (Li2h;)V
      // 164: iload 5
      // 166: ifeq 1d2
      // 169: aload 0
      // 16a: iload 5
      // 16c: ifne 1d3
      // 16f: goto 176
      // 172: invokestatic we7.d (Loov;)Loov;
      // 175: athrow
      // 176: getfield we7.oay Lt9d;
      // 179: getfield t9d.fsy Ljava/util/Random;
      // 17c: invokevirtual java/util/Random.nextFloat ()F
      // 17f: f2d
      // 180: ldc2_w 0.05
      // 183: dcmpg
      // 184: goto 18b
      // 187: invokestatic we7.d (Loov;)Loov;
      // 18a: athrow
      // 18b: ifge 1d2
      // 18e: new n78
      // 191: dup
      // 192: aload 0
      // 193: getfield we7.oay Lt9d;
      // 196: invokespecial n78.<init> (Lt9d;)V
      // 199: astore 8
      // 19b: aload 8
      // 19d: aload 0
      // 19e: getfield we7.o2v D
      // 1a1: aload 0
      // 1a2: getfield we7.kfp D
      // 1a5: aload 0
      // 1a6: getfield we7.vbd D
      // 1a9: aload 0
      // 1aa: getfield we7.x5k F
      // 1ad: fconst_0
      // 1ae: invokevirtual n78.x24 (DDDFF)V
      // 1b1: aload 8
      // 1b3: aload 1
      // 1b4: aconst_null
      // 1b5: checkcast ps6
      // 1b8: invokevirtual n78.hx8 (Lcss;Lps6;)Lps6;
      // 1bb: pop
      // 1bc: aload 8
      // 1be: bipush 1
      // 1bf: invokevirtual n78.igl (Z)V
      // 1c2: aload 0
      // 1c3: getfield we7.oay Lt9d;
      // 1c6: aload 8
      // 1c8: invokevirtual t9d.xzq (Li2h;)Z
      // 1cb: pop
      // 1cc: aload 0
      // 1cd: aload 8
      // 1cf: invokevirtual we7.nw9 (Li2h;)V
      // 1d2: aload 0
      // 1d3: aload 0
      // 1d4: getfield we7.z2d Ljava/util/Random;
      // 1d7: invokevirtual java/util/Random.nextFloat ()F
      // 1da: fload 6
      // 1dc: ldc 0.1
      // 1de: nop
      // 1df: fmul
      // 1e0: fcmpg
      // 1e1: iload 5
      // 1e3: ifne 1f1
      // 1e6: ifge 1f4
      // 1e9: goto 1f0
      // 1ec: invokestatic we7.d (Loov;)Loov;
      // 1ef: athrow
      // 1f0: bipush 1
      // 1f1: goto 1f5
      // 1f4: bipush 0
      // 1f5: invokevirtual we7.s7_ (Z)V
      // 1f8: aload 0
      // 1f9: aload 1
      // 1fa: invokevirtual we7._58 (Lcss;)V
      // 1fd: aload 0
      // 1fe: aload 1
      // 1ff: invokevirtual we7.jng (Lcss;)V
      // 202: aload 0
      // 203: iload 5
      // 205: ifne 2da
      // 208: bipush 4
      // 209: invokevirtual we7.rnq (I)Lerg;
      // 20c: ifnonnull 2ac
      // 20f: goto 216
      // 212: invokestatic we7.d (Loov;)Loov;
      // 215: athrow
      // 216: aload 0
      // 217: getfield we7.oay Lt9d;
      // 21a: invokevirtual t9d.mp6 ()Ljava/util/Calendar;
      // 21d: astore 7
      // 21f: iload 5
      // 221: ifne 2d9
      // 224: aload 7
      // 226: bipush 2
      // 227: invokevirtual java/util/Calendar.get (I)I
      // 22a: bipush 1
      // 22b: iadd
      // 22c: bipush 10
      // 22e: if_icmpne 2ac
      // 231: goto 238
      // 234: invokestatic we7.d (Loov;)Loov;
      // 237: athrow
      // 238: aload 7
      // 23a: bipush 5
      // 23b: invokevirtual java/util/Calendar.get (I)I
      // 23e: iload 5
      // 240: ifne 274
      // 243: goto 24a
      // 246: invokestatic we7.d (Loov;)Loov;
      // 249: athrow
      // 24a: bipush 31
      // 24c: if_icmpne 2ac
      // 24f: goto 256
      // 252: invokestatic we7.d (Loov;)Loov;
      // 255: athrow
      // 256: aload 0
      // 257: getfield we7.z2d Ljava/util/Random;
      // 25a: iload 5
      // 25c: ifne 2dd
      // 25f: goto 266
      // 262: invokestatic we7.d (Loov;)Loov;
      // 265: athrow
      // 266: invokevirtual java/util/Random.nextFloat ()F
      // 269: ldc 0.25
      // 26b: nop
      // 26c: fcmpg
      // 26d: goto 274
      // 270: invokestatic we7.d (Loov;)Loov;
      // 273: athrow
      // 274: ifge 2ac
      // 277: aload 0
      // 278: bipush 4
      // 279: new erg
      // 27c: dup
      // 27d: aload 0
      // 27e: getfield we7.z2d Ljava/util/Random;
      // 281: invokevirtual java/util/Random.nextFloat ()F
      // 284: ldc 0.1
      // 286: nop
      // 287: fcmpg
      // 288: ifge 29c
      // 28b: goto 292
      // 28e: invokestatic we7.d (Loov;)Loov;
      // 291: athrow
      // 292: getstatic ox_.pj4 Le0x;
      // 295: goto 29f
      // 298: invokestatic we7.d (Loov;)Loov;
      // 29b: athrow
      // 29c: getstatic ox_.jzx Le0x;
      // 29f: invokespecial erg.<init> (Le0x;)V
      // 2a2: invokevirtual we7.fga (ILerg;)V
      // 2a5: aload 0
      // 2a6: getfield we7.k92 [F
      // 2a9: bipush 4
      // 2aa: fconst_0
      // 2ab: fastore
      // 2ac: aload 0
      // 2ad: getstatic m6d.nen Lw9p;
      // 2b0: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 2b3: new xk5
      // 2b6: dup
      // 2b7: sipush 17955
      // 2ba: ldc2_w 3591463634351829052
      // 2bd: lload 3
      // 2be: lxor
      // 2bf: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: nop
      // 2c5: aload 0
      // 2c6: getfield we7.z2d Ljava/util/Random;
      // 2c9: invokevirtual java/util/Random.nextDouble ()D
      // 2cc: ldc2_w 0.05000000074505806
      // 2cf: dmul
      // 2d0: bipush 0
      // 2d1: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 2d4: invokeinterface _4o.vcr (Lxk5;)V 2
      // 2d9: aload 0
      // 2da: getfield we7.z2d Ljava/util/Random;
      // 2dd: invokevirtual java/util/Random.nextDouble ()D
      // 2e0: ldc2_w 1.5
      // 2e3: dmul
      // 2e4: fload 6
      // 2e6: f2d
      // 2e7: dmul
      // 2e8: dstore 7
      // 2ea: dload 7
      // 2ec: dconst_1
      // 2ed: dcmpl
      // 2ee: iload 5
      // 2f0: ifne 342
      // 2f3: ifle 328
      // 2f6: goto 2fd
      // 2f9: invokestatic we7.d (Loov;)Loov;
      // 2fc: athrow
      // 2fd: aload 0
      // 2fe: getstatic m6d.wg4 Lw9p;
      // 301: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 304: new xk5
      // 307: dup
      // 308: sipush 3672
      // 30b: ldc2_w 5298417984195557465
      // 30e: lload 3
      // 30f: lxor
      // 310: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: nop
      // 316: dload 7
      // 318: bipush 2
      // 319: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 31c: invokeinterface _4o.vcr (Lxk5;)V 2
      // 321: goto 328
      // 324: invokestatic we7.d (Loov;)Loov;
      // 327: athrow
      // 328: aload 0
      // 329: iload 5
      // 32b: ifne 3ad
      // 32e: getfield we7.z2d Ljava/util/Random;
      // 331: invokevirtual java/util/Random.nextFloat ()F
      // 334: fload 6
      // 336: ldc 0.05
      // 338: nop
      // 339: fmul
      // 33a: fcmpg
      // 33b: goto 342
      // 33e: invokestatic we7.d (Loov;)Loov;
      // 341: athrow
      // 342: ifge 3b1
      // 345: aload 0
      // 346: getstatic we7.vsc Lw9p;
      // 349: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 34c: new xk5
      // 34f: dup
      // 350: sipush 24424
      // 353: ldc2_w 5447658373194819943
      // 356: lload 3
      // 357: lxor
      // 358: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35d: nop
      // 35e: aload 0
      // 35f: getfield we7.z2d Ljava/util/Random;
      // 362: invokevirtual java/util/Random.nextDouble ()D
      // 365: ldc2_w 0.25
      // 368: dmul
      // 369: ldc2_w 0.5
      // 36c: dadd
      // 36d: bipush 0
      // 36e: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 371: invokeinterface _4o.vcr (Lxk5;)V 2
      // 376: aload 0
      // 377: getstatic m6d.t9k Lw9p;
      // 37a: invokevirtual we7.dgt (Lw9p;)L_4o;
      // 37d: new xk5
      // 380: dup
      // 381: sipush 24940
      // 384: ldc2_w 6003511970297845622
      // 387: lload 3
      // 388: lxor
      // 389: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: nop
      // 38f: aload 0
      // 390: getfield we7.z2d Ljava/util/Random;
      // 393: invokevirtual java/util/Random.nextDouble ()D
      // 396: ldc2_w 3.0
      // 399: dmul
      // 39a: dconst_1
      // 39b: dadd
      // 39c: bipush 2
      // 39d: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 3a0: invokeinterface _4o.vcr (Lxk5;)V 2
      // 3a5: aload 0
      // 3a6: goto 3ad
      // 3a9: invokestatic we7.d (Loov;)Loov;
      // 3ac: athrow
      // 3ad: bipush 1
      // 3ae: invokevirtual we7.s7_ (Z)V
      // 3b1: aload 2
      // 3b2: areturn
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual ha9.b5z ()Lerg;
      // 008: astore 3
      // 009: aload 3
      // 00a: iload 2
      // 00b: ifne 019
      // 00e: ifnull 103
      // 011: goto 018
      // 014: invokestatic we7.d (Loov;)Loov;
      // 017: athrow
      // 018: aload 3
      // 019: iload 2
      // 01a: ifne 035
      // 01d: invokevirtual erg.gn1 ()Lu7m;
      // 020: getstatic xbr.yyh Lu7m;
      // 023: if_acmpne 103
      // 026: goto 02d
      // 029: invokestatic we7.d (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 3
      // 02e: goto 035
      // 031: invokestatic we7.d (Loov;)Loov;
      // 034: athrow
      // 035: invokevirtual erg.j6_ ()I
      // 038: iload 2
      // 039: ifne 104
      // 03c: ifne 103
      // 03f: goto 046
      // 042: invokestatic we7.d (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: invokevirtual we7.okv ()Z
      // 04a: iload 2
      // 04b: ifne 104
      // 04e: goto 055
      // 051: invokestatic we7.d (Loov;)Loov;
      // 054: athrow
      // 055: ifeq 103
      // 058: goto 05f
      // 05b: invokestatic we7.d (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getstatic mcs.fhc Lmcs;
      // 063: invokevirtual we7.cab (Lmcs;)Z
      // 066: iload 2
      // 067: ifne 104
      // 06a: goto 071
      // 06d: invokestatic we7.d (Loov;)Loov;
      // 070: athrow
      // 071: ifeq 103
      // 074: goto 07b
      // 077: invokestatic we7.d (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 1
      // 07c: getfield ha9.lls Lpj2;
      // 07f: getfield pj2.g40 Z
      // 082: iload 2
      // 083: ifne 0ac
      // 086: goto 08d
      // 089: invokestatic we7.d (Loov;)Loov;
      // 08c: athrow
      // 08d: ifne 0a8
      // 090: goto 097
      // 093: invokestatic we7.d (Loov;)Loov;
      // 096: athrow
      // 097: aload 3
      // 098: dup
      // 099: getfield erg.qd2 I
      // 09c: bipush 1
      // 09d: isub
      // 09e: putfield erg.qd2 I
      // 0a1: goto 0a8
      // 0a4: invokestatic we7.d (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: getfield erg.qd2 I
      // 0ac: iload 2
      // 0ad: ifne 0da
      // 0b0: ifgt 0d3
      // 0b3: goto 0ba
      // 0b6: invokestatic we7.d (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 1
      // 0bb: getfield ha9.up_ Ljnq;
      // 0be: aload 1
      // 0bf: getfield ha9.up_ Ljnq;
      // 0c2: getfield jnq.nb5 I
      // 0c5: aconst_null
      // 0c6: checkcast erg
      // 0c9: invokevirtual jnq.cxl (ILerg;)V
      // 0cc: goto 0d3
      // 0cf: invokestatic we7.d (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield we7.oay Lt9d;
      // 0d7: getfield t9d.v0f Z
      // 0da: iload 2
      // 0db: ifne 102
      // 0de: ifne 101
      // 0e1: goto 0e8
      // 0e4: invokestatic we7.d (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: aload 0
      // 0ea: getfield we7.z2d Ljava/util/Random;
      // 0ed: sipush 2401
      // 0f0: invokevirtual java/util/Random.nextInt (I)I
      // 0f3: sipush 3600
      // 0f6: iadd
      // 0f7: invokevirtual we7.lvt (I)V
      // 0fa: goto 101
      // 0fd: invokestatic we7.d (Loov;)Loov;
      // 100: athrow
      // 101: bipush 1
      // 102: ireturn
      // 103: bipush 0
      // 104: ireturn
   }

   public void lvt(int var1) {
      this.t1u = var1;
      this.a0c().c66(14, (byte)1);
      this.zu8(mcs.fhc.zr9);
      this.gmn(new sdj(mcs.faz.zr9, var1, Math.min(this.oay.rbk().dzc() - 1, 0)));
      this.oay.qyn(this, (byte)16);
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
      // 00: getstatic we7.g J
      // 03: ldc2_w 85948717899369
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: iload 1
      // 0e: iload 4
      // 10: ifeq 36
      // 13: bipush 16
      // 15: if_icmpne 84
      // 18: goto 1f
      // 1b: invokestatic we7.d (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 4
      // 22: ifeq 3a
      // 25: goto 2c
      // 28: invokestatic we7.d (Loov;)Loov;
      // 2b: athrow
      // 2c: invokevirtual we7.o3x ()Z
      // 2f: goto 36
      // 32: invokestatic we7.d (Loov;)Loov;
      // 35: athrow
      // 36: ifne 90
      // 39: aload 0
      // 3a: getfield we7.oay Lt9d;
      // 3d: aload 0
      // 3e: getfield we7.o2v D
      // 41: ldc2_w 0.5
      // 44: dadd
      // 45: aload 0
      // 46: getfield we7.kfp D
      // 49: ldc2_w 0.5
      // 4c: dadd
      // 4d: aload 0
      // 4e: getfield we7.vbd D
      // 51: ldc2_w 0.5
      // 54: dadd
      // 55: sipush 24019
      // 58: ldc2_w 4104678753408858973
      // 5b: lload 2
      // 5c: lxor
      // 5d: invokedynamic z (IJ)Ljava/lang/String; bsm=we7.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: nop
      // 63: fconst_1
      // 64: aload 0
      // 65: getfield we7.z2d Ljava/util/Random;
      // 68: invokevirtual java/util/Random.nextFloat ()F
      // 6b: fadd
      // 6c: aload 0
      // 6d: getfield we7.z2d Ljava/util/Random;
      // 70: invokevirtual java/util/Random.nextFloat ()F
      // 73: ldc 0.7
      // 75: nop
      // 76: fmul
      // 77: ldc 0.3
      // 79: nop
      // 7a: fadd
      // 7b: bipush 0
      // 7c: invokevirtual t9d.wd_ (DDDLjava/lang/String;FFZ)V
      // 7f: iload 4
      // 81: ifne 90
      // 84: aload 0
      // 85: iload 1
      // 86: invokespecial s0i.ptf (B)V
      // 89: goto 90
      // 8c: invokestatic we7.d (Loov;)Loov;
      // 8f: athrow
      // 90: return
   }

   @Override
   public boolean kz3() {
      int var1 = t9d.b();

      try {
         boolean var10000 = this.th2();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw d(var2);
      }

      return false;
   }

   public boolean th2() {
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
      // 05: invokevirtual we7.a0c ()Lwl1;
      // 08: bipush 14
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifeq 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic we7.d (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic we7.d (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public void exu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new ysf
      // 03: dup
      // 04: aload 0
      // 05: getfield we7.oay Lt9d;
      // 08: invokespecial ysf.<init> (Lt9d;)V
      // 0b: astore 2
      // 0c: invokestatic t9d.c ()I
      // 0f: aload 2
      // 10: aload 0
      // 11: invokevirtual ysf.nyk (Li2h;)V
      // 14: istore 1
      // 15: aload 2
      // 16: aload 0
      // 17: getfield we7.oay Lt9d;
      // 1a: new mew
      // 1d: dup
      // 1e: aload 2
      // 1f: invokespecial mew.<init> (Li2h;)V
      // 22: invokevirtual t9d.sms (Lmew;)Lcss;
      // 25: aconst_null
      // 26: checkcast ps6
      // 29: invokevirtual ysf.hx8 (Lcss;Lps6;)Lps6;
      // 2c: pop
      // 2d: aload 2
      // 2e: invokevirtual ysf.yi0 ()V
      // 31: aload 0
      // 32: invokevirtual we7.ejl ()Z
      // 35: iload 1
      // 36: ifne 65
      // 39: ifeq 51
      // 3c: goto 43
      // 3f: invokestatic we7.d (Loov;)Loov;
      // 42: athrow
      // 43: aload 2
      // 44: sipush -24000
      // 47: invokevirtual ysf.mr2 (I)V
      // 4a: goto 51
      // 4d: invokestatic we7.d (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield we7.oay Lt9d;
      // 55: aload 0
      // 56: invokevirtual t9d.rqa (Li2h;)V
      // 59: aload 2
      // 5a: aload 0
      // 5b: invokevirtual we7.r1t ()Z
      // 5e: invokevirtual ysf.x53 (Z)V
      // 61: aload 0
      // 62: invokevirtual we7.qrh ()Z
      // 65: iload 1
      // 66: ifne 92
      // 69: ifeq 8a
      // 6c: goto 73
      // 6f: invokestatic we7.d (Loov;)Loov;
      // 72: athrow
      // 73: aload 2
      // 74: aload 0
      // 75: invokevirtual we7.hei ()Ljava/lang/String;
      // 78: invokevirtual ysf.x84 (Ljava/lang/String;)V
      // 7b: aload 2
      // 7c: aload 0
      // 7d: invokevirtual we7.bpc ()Z
      // 80: invokevirtual ysf.krn (Z)V
      // 83: goto 8a
      // 86: invokestatic we7.d (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: getfield we7.oay Lt9d;
      // 8e: aload 2
      // 8f: invokevirtual t9d.xzq (Li2h;)Z
      // 92: pop
      // 93: aload 2
      // 94: new sdj
      // 97: dup
      // 98: getstatic mcs.bla Lmcs;
      // 9b: getfield mcs.zr9 I
      // 9e: sipush 200
      // a1: bipush 0
      // a2: invokespecial sdj.<init> (III)V
      // a5: invokevirtual ysf.gmn (Lsdj;)V
      // a8: aload 0
      // a9: getfield we7.oay Lt9d;
      // ac: aconst_null
      // ad: checkcast ha9
      // b0: sipush 1017
      // b3: new mew
      // b6: dup
      // b7: aload 0
      // b8: getfield we7.o2v D
      // bb: d2i
      // bc: aload 0
      // bd: getfield we7.kfp D
      // c0: d2i
      // c1: aload 0
      // c2: getfield we7.vbd D
      // c5: d2i
      // c6: invokespecial mew.<init> (III)V
      // c9: bipush 0
      // ca: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // cd: return
   }

   public int q5s() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: bipush 1
      // 005: istore 2
      // 006: aload 0
      // 007: getfield we7.z2d Ljava/util/Random;
      // 00a: invokevirtual java/util/Random.nextFloat ()F
      // 00d: ldc 0.01
      // 00f: nop
      // 010: fcmpg
      // 011: iload 1
      // 012: ifne 11e
      // 015: ifge 11d
      // 018: goto 01f
      // 01b: invokestatic we7.d (Loov;)Loov;
      // 01e: athrow
      // 01f: bipush 0
      // 020: istore 3
      // 021: new mew$mix
      // 024: dup
      // 025: invokespecial mew$mix.<init> ()V
      // 028: astore 4
      // 02a: aload 0
      // 02b: getfield we7.o2v D
      // 02e: d2i
      // 02f: bipush 4
      // 030: isub
      // 031: istore 5
      // 033: iload 5
      // 035: aload 0
      // 036: getfield we7.o2v D
      // 039: d2i
      // 03a: bipush 4
      // 03b: iadd
      // 03c: if_icmpge 11d
      // 03f: iload 3
      // 040: iload 1
      // 041: ifne 11e
      // 044: iload 1
      // 045: ifne 11e
      // 048: goto 04f
      // 04b: invokestatic we7.d (Loov;)Loov;
      // 04e: athrow
      // 04f: bipush 14
      // 051: if_icmpge 11d
      // 054: goto 05b
      // 057: invokestatic we7.d (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 0
      // 05c: getfield we7.kfp D
      // 05f: d2i
      // 060: bipush 4
      // 061: isub
      // 062: istore 6
      // 064: iload 6
      // 066: aload 0
      // 067: getfield we7.kfp D
      // 06a: d2i
      // 06b: bipush 4
      // 06c: iadd
      // 06d: if_icmpge 116
      // 070: iload 3
      // 071: bipush 14
      // 073: iload 1
      // 074: ifne 03c
      // 077: iload 1
      // 078: ifne 092
      // 07b: if_icmpge 116
      // 07e: goto 085
      // 081: invokestatic we7.d (Loov;)Loov;
      // 084: athrow
      // 085: aload 0
      // 086: getfield we7.vbd D
      // 089: d2i
      // 08a: bipush 4
      // 08b: goto 092
      // 08e: invokestatic we7.d (Loov;)Loov;
      // 091: athrow
      // 092: isub
      // 093: istore 7
      // 095: iload 7
      // 097: aload 0
      // 098: getfield we7.vbd D
      // 09b: d2i
      // 09c: bipush 4
      // 09d: iadd
      // 09e: if_icmpge 10f
      // 0a1: iload 3
      // 0a2: bipush 14
      // 0a4: iload 1
      // 0a5: ifne 06d
      // 0a8: if_icmpge 10f
      // 0ab: aload 0
      // 0ac: getfield we7.oay Lt9d;
      // 0af: aload 4
      // 0b1: iload 5
      // 0b3: iload 6
      // 0b5: iload 7
      // 0b7: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0ba: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0bd: invokeinterface zfz.r_y ()Le0x; 1
      // 0c2: astore 8
      // 0c4: aload 8
      // 0c6: getstatic ox_.ytr Le0x;
      // 0c9: iload 1
      // 0ca: ifne 0e3
      // 0cd: if_acmpeq 0e6
      // 0d0: goto 0d7
      // 0d3: invokestatic we7.d (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 8
      // 0d9: getstatic ox_.a6l Le0x;
      // 0dc: goto 0e3
      // 0df: invokestatic we7.d (Loov;)Loov;
      // 0e2: athrow
      // 0e3: if_acmpne 108
      // 0e6: aload 0
      // 0e7: getfield we7.z2d Ljava/util/Random;
      // 0ea: invokevirtual java/util/Random.nextFloat ()F
      // 0ed: ldc 0.3
      // 0ef: nop
      // 0f0: fcmpg
      // 0f1: ifge 105
      // 0f4: goto 0fb
      // 0f7: invokestatic we7.d (Loov;)Loov;
      // 0fa: athrow
      // 0fb: iinc 2 1
      // 0fe: goto 105
      // 101: invokestatic we7.d (Loov;)Loov;
      // 104: athrow
      // 105: iinc 3 1
      // 108: iinc 7 1
      // 10b: iload 1
      // 10c: ifeq 095
      // 10f: iinc 6 1
      // 112: iload 1
      // 113: ifeq 064
      // 116: iinc 5 1
      // 119: iload 1
      // 11a: ifeq 033
      // 11d: iload 2
      // 11e: ireturn
   }

   public void o62(boolean var1) {
      we7 var10000;
      float var10001;
      label16: {
         try {
            var10000 = this;
            if (var1) {
               var10001 = 0.5F;
               break label16;
            }
         } catch (oov var2) {
            throw d(var2);
         }

         var10001 = 1.0F;
      }

      var10000.k81(var10001);
   }

   @Override
   public final void yxc(float param1, float param2) {
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
      // 05: getfield we7.w0c F
      // 08: fconst_0
      // 09: fcmpl
      // 0a: iload 3
      // 0b: ifne 25
      // 0e: ifle 37
      // 11: goto 18
      // 14: invokestatic we7.d (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield we7.vos F
      // 1c: fconst_0
      // 1d: fcmpl
      // 1e: goto 25
      // 21: invokestatic we7.d (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifne 34
      // 29: ifle 37
      // 2c: goto 33
      // 2f: invokestatic we7.d (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: istore 4
      // 3a: aload 0
      // 3b: fload 1
      // 3c: putfield we7.w0c F
      // 3f: aload 0
      // 40: fload 2
      // 41: iload 3
      // 42: ifne 5d
      // 45: putfield we7.vos F
      // 48: iload 4
      // 4a: ifne 60
      // 4d: goto 54
      // 50: invokestatic we7.d (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: fconst_1
      // 56: goto 5d
      // 59: invokestatic we7.d (Loov;)Loov;
      // 5c: athrow
      // 5d: invokevirtual we7.k81 (F)V
      // 60: return
   }

   public final void k81(float var1) {
      super.yxc(this.w0c * var1, this.vos * var1);
   }

   @Override
   public double g4y() {
      try {
         if (this.ejl()) {
            return 0.0;
         }
      } catch (oov var1) {
         throw d(var1);
      }

      return -0.35;
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
      // 05: aload 1
      // 06: invokespecial s0i.owu (Lofh;)V
      // 09: aload 1
      // 0a: invokevirtual ofh.nra ()Li2h;
      // 0d: instanceof gze
      // 10: iload 2
      // 11: ifne 29
      // 14: ifeq 98
      // 17: goto 1e
      // 1a: invokestatic we7.d (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: instanceof v9i
      // 22: goto 29
      // 25: invokestatic we7.d (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: ifne 48
      // 2d: ifne 98
      // 30: goto 37
      // 33: invokestatic we7.d (Loov;)Loov;
      // 36: athrow
      // 37: aload 1
      // 38: invokevirtual ofh.nra ()Li2h;
      // 3b: checkcast gze
      // 3e: invokevirtual gze.pap ()Z
      // 41: goto 48
      // 44: invokestatic we7.d (Loov;)Loov;
      // 47: athrow
      // 48: iload 2
      // 49: ifne 72
      // 4c: ifeq 98
      // 4f: goto 56
      // 52: invokestatic we7.d (Loov;)Loov;
      // 55: athrow
      // 56: aload 1
      // 57: invokevirtual ofh.nra ()Li2h;
      // 5a: checkcast gze
      // 5d: iload 2
      // 5e: ifne 83
      // 61: goto 68
      // 64: invokestatic we7.d (Loov;)Loov;
      // 67: athrow
      // 68: invokevirtual gze.wmh ()Z
      // 6b: goto 72
      // 6e: invokestatic we7.d (Loov;)Loov;
      // 71: athrow
      // 72: ifeq 98
      // 75: aload 1
      // 76: invokevirtual ofh.nra ()Li2h;
      // 79: checkcast gze
      // 7c: goto 83
      // 7f: invokestatic we7.d (Loov;)Loov;
      // 82: athrow
      // 83: invokevirtual gze.tnz ()V
      // 86: aload 0
      // 87: new erg
      // 8a: dup
      // 8b: getstatic xbr.r9n Lu7m;
      // 8e: bipush 1
      // 8f: bipush 2
      // 90: invokespecial erg.<init> (Lu7m;II)V
      // 93: fconst_0
      // 94: invokevirtual we7.qji (Lerg;F)Lnvf;
      // 97: pop
      // 98: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6318604829403316793L, 1715289532313260745L, MethodHandles.lookup().lookupClass()).a(249597322850999L);
      // $VF: monitorexit
      g = var10000;
      long var9 = g ^ 62598318867088L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[23];
      int var5 = 0;
      String var4 = "]¹\u0090°Ú\u0094I\u0090©òôè\u0090\u0002÷>\bÙ\u001f\u001dÄê¼ù\u0098\u009cîU\u0007ê,{øð\u0018\u009f$î#%õûKøë\u0017¢\u0086ÿg\u000fÅ\u0087d\n\u0081üDeÆ\u009f\u0096\u0005\u000e(}þ\u0090L\u0004VwÑ\u0019\u0080Ê±¤PóM\u009ebèd²óRð³2\u001dk\u000f[ÔO¯\u0082åÄ9\u001fß²\u0018ZO¸ËtøÆ;\u009fë!ÖB$µ\bÙ!¬\u0013÷pp<@Örm|¾¯4\u00182C\r\u0095éfgö|^\u001dDòÏ/*\t¸L\u0015Ki\u0001Ã\u0004Ô\u0092\u0090\u0004í\u001e\u0019:\u0081ÍuJ\u000b\f£P\u000eÎùp,z\u001e\u0004:\u008a\u0095\u0094H-º(\u001b\u008c!%Þ\u0001}Õü\u0010±ûi\u001f!óË\u001béux\u0004°å9oXòæ\u0099T+\r\u0095\u001eV\u001d×þ¿\u0018\u0081D9\u0088\u0093=\u008d\tØÐf\u007f\u0090\u00842Ø§riíË!+é l\r¹l®Ê\u0010;\u0089H¦öþ¯t\u0082¬÷_«\u008aGI\u0091m*9\u0010_á¨Ð\u0018c>\u001b\u0093ª\u009b·6¡Ez? \u0095\u0005ú,\u0013\u0001\u008c\u009f_\u007f. \"Òý\u0014\u0090d9)\u00ad\u009d \u000b§Zu®.Z,\u0081W\u0083=bÄÖÎnÔ\u001fj= \u001cÊ\u008aßã³KDH&ÅÂ15¨\u001cëRìk§òvjÂa\u009aZ5h^! \u0014Z6;fÕ¸åÛ|\u0007\u0010ep\u0014d5¬»5!\\\u008dó\u0018»\u0016>Ê\u0089\u0084^\u0010\u0087É:¯\u0011ÍÓÁA÷²²\u0002Á<`8È\u0080P\u0099éìÊ=z\u0002TlúÌ\u009e\u000f;á\u001abm\u0003\u0011òþDÜR\u0092(Nßù\u0097\u0089¼²\u001e®dq%\u0087±úâÀáH¦\u000bÅÉ³R\u0001(éåJF\u0087OH\u008d\u001d\u0091\u0006\u0001Ô\u0015\u001cï¼ü\"\u009e\u0013q\"`Bä[àå\u009cF:-h§\u0015¬Ò`v@©{Âãm\u009b§9o\u0014\"\u009aZÓFû&ªCí\u0001\u0089ÞÒ\\I{U_\u0011x\u001b\u0089JË\u008f~×öw\u000e4jÜ¡n¨ÌÍÖï\u0004È\u001e\u0097\u001d´¹\u001e(\u0003q¯å0û\u0085\u001b\u009dí¹-´Éàû[\u009c6µ¢!\u00adÚ\u001d*A\u0098ú9¶\u001cHírÛéÙz\u0002å\u008aç³æ|\u0083f.·\u001b\u001am =@ð¾\u0087z\u009eÿ\u0018-}Ýv+§ågÖ$Ãç¾yK\u0087d:KÞSªÁ(\u0018Ì\u0001ý×<n\n@\u0086\u0082D§ëÏ\u0093H/\u0084õ/F}\u0091®æs\u00ad\u001f\u009dÕ=$Q/6ÇÖFÓ\u0010\u0098\u001dûé*¤dÔª\u001ctÈD¯2x8GLí\u008a;T±iÃ£æMè¿\u0087\u0005\u0094ÔÁ{@Tùr\u0003V\u001aª\u008b°Kfö÷Á\u00175\u0086ù\u0097¼C5æêÕ\u0083¯föPàJS\u009c\u0094(M\u0019qã\\ô\u0002\u0018ÝÏ\u00ad²RjÌ\u001fA¸Sh\t\u001dJ7\u009c!Ö21\u0002Î2\u007fP¶¾\u009bi\u0082}";
      int var6 = "]¹\u0090°Ú\u0094I\u0090©òôè\u0090\u0002÷>\bÙ\u001f\u001dÄê¼ù\u0098\u009cîU\u0007ê,{øð\u0018\u009f$î#%õûKøë\u0017¢\u0086ÿg\u000fÅ\u0087d\n\u0081üDeÆ\u009f\u0096\u0005\u000e(}þ\u0090L\u0004VwÑ\u0019\u0080Ê±¤PóM\u009ebèd²óRð³2\u001dk\u000f[ÔO¯\u0082åÄ9\u001fß²\u0018ZO¸ËtøÆ;\u009fë!ÖB$µ\bÙ!¬\u0013÷pp<@Örm|¾¯4\u00182C\r\u0095éfgö|^\u001dDòÏ/*\t¸L\u0015Ki\u0001Ã\u0004Ô\u0092\u0090\u0004í\u001e\u0019:\u0081ÍuJ\u000b\f£P\u000eÎùp,z\u001e\u0004:\u008a\u0095\u0094H-º(\u001b\u008c!%Þ\u0001}Õü\u0010±ûi\u001f!óË\u001béux\u0004°å9oXòæ\u0099T+\r\u0095\u001eV\u001d×þ¿\u0018\u0081D9\u0088\u0093=\u008d\tØÐf\u007f\u0090\u00842Ø§riíË!+é l\r¹l®Ê\u0010;\u0089H¦öþ¯t\u0082¬÷_«\u008aGI\u0091m*9\u0010_á¨Ð\u0018c>\u001b\u0093ª\u009b·6¡Ez? \u0095\u0005ú,\u0013\u0001\u008c\u009f_\u007f. \"Òý\u0014\u0090d9)\u00ad\u009d \u000b§Zu®.Z,\u0081W\u0083=bÄÖÎnÔ\u001fj= \u001cÊ\u008aßã³KDH&ÅÂ15¨\u001cëRìk§òvjÂa\u009aZ5h^! \u0014Z6;fÕ¸åÛ|\u0007\u0010ep\u0014d5¬»5!\\\u008dó\u0018»\u0016>Ê\u0089\u0084^\u0010\u0087É:¯\u0011ÍÓÁA÷²²\u0002Á<`8È\u0080P\u0099éìÊ=z\u0002TlúÌ\u009e\u000f;á\u001abm\u0003\u0011òþDÜR\u0092(Nßù\u0097\u0089¼²\u001e®dq%\u0087±úâÀáH¦\u000bÅÉ³R\u0001(éåJF\u0087OH\u008d\u001d\u0091\u0006\u0001Ô\u0015\u001cï¼ü\"\u009e\u0013q\"`Bä[àå\u009cF:-h§\u0015¬Ò`v@©{Âãm\u009b§9o\u0014\"\u009aZÓFû&ªCí\u0001\u0089ÞÒ\\I{U_\u0011x\u001b\u0089JË\u008f~×öw\u000e4jÜ¡n¨ÌÍÖï\u0004È\u001e\u0097\u001d´¹\u001e(\u0003q¯å0û\u0085\u001b\u009dí¹-´Éàû[\u009c6µ¢!\u00adÚ\u001d*A\u0098ú9¶\u001cHírÛéÙz\u0002å\u008aç³æ|\u0083f.·\u001b\u001am =@ð¾\u0087z\u009eÿ\u0018-}Ýv+§ågÖ$Ãç¾yK\u0087d:KÞSªÁ(\u0018Ì\u0001ý×<n\n@\u0086\u0082D§ëÏ\u0093H/\u0084õ/F}\u0091®æs\u00ad\u001f\u009dÕ=$Q/6ÇÖFÓ\u0010\u0098\u001dûé*¤dÔª\u001ctÈD¯2x8GLí\u008a;T±iÃ£æMè¿\u0087\u0005\u0094ÔÁ{@Tùr\u0003V\u001aª\u008b°Kfö÷Á\u00175\u0086ù\u0097¼C5æêÕ\u0083¯föPàJS\u009c\u0094(M\u0019qã\\ô\u0002\u0018ÝÏ\u00ad²RjÌ\u001fA¸Sh\t\u001dJ7\u009c!Ö21\u0002Î2\u007fP¶¾\u009bi\u0082}"
         .length();
      char var3 = '@';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     u = var7;
                     v = new String[23];
                     vsc = new oik((w9p)null, e<"z">(14045, 8118506574394330274L ^ var9), 0.0, 0.0, 1.0).c3y(e<"z">(30420, 895855190472150196L ^ var9));
                     y8d = UUID.fromString(e<"z">(17087, 6265394433347025103L ^ var9));
                     e7v = new xk5(y8d, e<"z">(8302, 3562761653275826696L ^ var9), 0.5, 1);
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

                  var4 = "\tý\u0086\u008b\u009e¤ÙÅ\u0014ÛÎ8N¨Þ|Ì«\u0086õÉ\u0003\u0088®i\nm½Ç\u0016\u0084QÎ±Õ*`k\u0012n \u008bð\u009et\t_äá\u0084ñ$\u0086Ü\u009dï`¨\u0082\u0093\u0015K\u0007\u0002\u001b«÷ªÏ\u008a\u0012\u0091D";
                  var6 = "\tý\u0086\u008b\u009e¤ÙÅ\u0014ÛÎ8N¨Þ|Ì«\u0086õÉ\u0003\u0088®i\nm½Ç\u0016\u0084QÎ±Õ*`k\u0012n \u008bð\u009et\t_äá\u0084ñ$\u0086Ü\u009dï`¨\u0082\u0093\u0015K\u0007\u0002\u001b«÷ªÏ\u008a\u0012\u0091D"
                     .length();
                  var3 = '(';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov d(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6370;
      if (v[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])w.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               w.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("we7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = u[var5].getBytes("ISO-8859-1");
         v[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return v[var5];
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
         throw new RuntimeException("we7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
