import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_t extends s0i {
   private static final UUID ud4;
   private static final xk5 uab;
   private static final Set nqi;
   private boolean dt5;
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public a_t(t9d var1) {
      super(var1);
      this.yxc(0.6F, 2.9F);
      this.nr7 = 1.0F;
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(2, new h2d(this, 1.0, false));
      this.r1d.tn8(7, new _tb(this, 1.0));
      this.r1d.tn8(8, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(8, new ov6(this));
      this.r1d.tn8(10, new a_t$vbq(this));
      this.r1d.tn8(11, new a_t$vef(this));
      this.g9o.tn8(1, new z7z(this, false, new Class[0]));
      this.g9o.tn8(2, new a_t$f0b(this));
      this.g9o.tn8(3, new s24(this, tl9.class, 10, true, false, new a_t$1(this)));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(40.0);
      this.dgt(m6d.w7i).zf7(0.3F);
      this.dgt(m6d.y3f).zf7(7.0);
      this.dgt(m6d.wg4).zf7(64.0);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, new Short((short)0));
      this.oit.kp2(17, new Byte((byte)0));
      this.oit.kp2(18, new Byte((byte)0));
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 42164344209615L;
      super.srs(var1);
      zfz var4 = this.ejt();
      var1.ge7(e<"x">(16411, 5067904819106960299L ^ var2), (short)e0x.mxb(var4.r_y()));
      var1.ge7(e<"x">(7798, 4116026132407029191L ^ var2), (short)var4.r_y().hvp(var4));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 89023458389092L;
      int var4 = t9d.b();

      zfz var5;
      label37: {
         short var10000;
         label44: {
            label41: {
               try {
                  super.cjb(var1);
                  var10000 = var1.inh(e<"x">(18602, 4542445074798950322L ^ var2), 8);
                  if (var4 == 0) {
                     break label44;
                  }

                  if (var10000 == 0) {
                     break label41;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var5 = e0x.mdd(var1.u14(e<"x">(16411, 5067858254223326976L ^ var2))).kig(var1.hp9(e<"x">(10002, 31162487792883715L ^ var2)) & '\uffff');

               try {
                  if (var4 != 0) {
                     break label37;
                  }
               } catch (oov var7) {
                  boolean var10001 = false;
                  throw a(var7);
               }
            }

            try {
               var10000 = var1.hp9(e<"x">(16411, 5067858254223326976L ^ var2));
            } catch (oov var6) {
               boolean var10 = false;
               throw a(var6);
            }
         }

         var5 = e0x.csc(var10000).kig(var1.hp9(e<"x">(7798, 4116142020232733036L ^ var2)) & '\uffff');
      }

      this.y4i(var5);
   }

   private boolean y5t(ha9 param1) {
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
      // 05: getfield ha9.up_ Ljnq;
      // 08: getfield jnq._dn [Lerg;
      // 0b: bipush 3
      // 0c: aaload
      // 0d: astore 3
      // 0e: aload 3
      // 0f: iload 2
      // 10: ifne 1e
      // 13: ifnull 30
      // 16: goto 1d
      // 19: invokestatic a_t.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 3
      // 1e: invokevirtual erg.gn1 ()Lu7m;
      // 21: getstatic ox_.jzx Le0x;
      // 24: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 27: if_acmpne 30
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: invokestatic a_t.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: fconst_1
      // 32: invokevirtual ha9.wej (F)Lfqr;
      // 35: invokevirtual fqr.kec ()Lfqr;
      // 38: astore 4
      // 3a: new fqr
      // 3d: dup
      // 3e: aload 0
      // 3f: getfield a_t.o2v D
      // 42: aload 1
      // 43: getfield ha9.o2v D
      // 46: dsub
      // 47: aload 0
      // 48: invokevirtual a_t.aaw ()Lnh4;
      // 4b: getfield nh4.bx_ D
      // 4e: aload 0
      // 4f: getfield a_t.ikl F
      // 52: fconst_2
      // 53: fdiv
      // 54: f2d
      // 55: dadd
      // 56: aload 1
      // 57: getfield ha9.kfp D
      // 5a: aload 1
      // 5b: invokevirtual ha9.c5y ()F
      // 5e: f2d
      // 5f: dadd
      // 60: dsub
      // 61: aload 0
      // 62: getfield a_t.vbd D
      // 65: aload 1
      // 66: getfield ha9.vbd D
      // 69: dsub
      // 6a: invokespecial fqr.<init> (DDD)V
      // 6d: astore 5
      // 6f: aload 5
      // 71: invokevirtual fqr.vtb ()D
      // 74: dstore 6
      // 76: aload 5
      // 78: invokevirtual fqr.kec ()Lfqr;
      // 7b: astore 5
      // 7d: aload 4
      // 7f: aload 5
      // 81: invokevirtual fqr.xvl (Lfqr;)D
      // 84: dstore 8
      // 86: dload 8
      // 88: dconst_1
      // 89: ldc2_w 0.025
      // 8c: dload 6
      // 8e: ddiv
      // 8f: dsub
      // 90: dcmpl
      // 91: iload 2
      // 92: ifne ab
      // 95: ifle ae
      // 98: goto 9f
      // 9b: invokestatic a_t.a (Loov;)Loov;
      // 9e: athrow
      // 9f: aload 1
      // a0: aload 0
      // a1: invokevirtual ha9.gq6 (Li2h;)Z
      // a4: goto ab
      // a7: invokestatic a_t.a (Loov;)Loov;
      // aa: athrow
      // ab: goto af
      // ae: bipush 0
      // af: ireturn
   }

   @Override
   public float c5y() {
      return 2.55F;
   }

   @Override
   public void e_a() {
      int var1 = t9d.c();

      a_t var10000;
      label38: {
         label43: {
            try {
               var10000 = this;
               if (var1 != 0) {
                  break label38;
               }

               if (!this.oay.v0f) {
                  break label43;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            int var2 = 0;

            while (var2 < 2) {
               try {
                  this.oay
                     .zvy(
                        w_0.t9k,
                        this.o2v + (this.z2d.nextDouble() - 0.5) * (double)this.uo6,
                        this.kfp + this.z2d.nextDouble() * (double)this.ikl - 0.25,
                        this.vbd + (this.z2d.nextDouble() - 0.5) * (double)this.uo6,
                        (this.z2d.nextDouble() - 0.5) * 2.0,
                        -this.z2d.nextDouble(),
                        (this.z2d.nextDouble() - 0.5) * 2.0,
                        new int[0]
                     );
                  var2++;
                  if (var1 != 0) {
                     return;
                  }

                  if (var1 != 0) {
                     break;
                  }
               } catch (oov var3) {
                  throw a(var3);
               }
            }
         }

         this.e1f = false;
         var10000 = this;
      }

      var10000.e_a();
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokevirtual a_t.n08 ()Z
      // 008: iload 1
      // 009: ifeq 02a
      // 00c: ifeq 026
      // 00f: goto 016
      // 012: invokestatic a_t.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getstatic ofh.e7v Lofh;
      // 01a: fconst_1
      // 01b: invokevirtual a_t.m1t (Lofh;F)Z
      // 01e: pop
      // 01f: goto 026
      // 022: invokestatic a_t.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 0
      // 027: invokevirtual a_t._ah ()Z
      // 02a: iload 1
      // 02b: ifeq 08d
      // 02e: ifeq 07b
      // 031: goto 038
      // 034: invokestatic a_t.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: getfield a_t.dt5 Z
      // 03c: iload 1
      // 03d: ifeq 08d
      // 040: goto 047
      // 043: invokestatic a_t.a (Loov;)Loov;
      // 046: athrow
      // 047: ifne 07b
      // 04a: goto 051
      // 04d: invokestatic a_t.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: getfield a_t.z2d Ljava/util/Random;
      // 055: bipush 100
      // 057: invokevirtual java/util/Random.nextInt (I)I
      // 05a: iload 1
      // 05b: ifeq 08d
      // 05e: goto 065
      // 061: invokestatic a_t.a (Loov;)Loov;
      // 064: athrow
      // 065: ifne 07b
      // 068: goto 06f
      // 06b: invokestatic a_t.a (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: bipush 0
      // 071: invokevirtual a_t.tjx (Z)V
      // 074: goto 07b
      // 077: invokestatic a_t.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 0
      // 07c: iload 1
      // 07d: ifeq 114
      // 080: getfield a_t.oay Lt9d;
      // 083: invokevirtual t9d.m40 ()Z
      // 086: goto 08d
      // 089: invokestatic a_t.a (Loov;)Loov;
      // 08c: athrow
      // 08d: ifeq 113
      // 090: aload 0
      // 091: fconst_1
      // 092: invokevirtual a_t.xeu (F)F
      // 095: fstore 2
      // 096: iload 1
      // 097: ifeq 117
      // 09a: fload 2
      // 09b: ldc 0.5
      // 09d: nop
      // 09e: fcmpl
      // 09f: ifle 113
      // 0a2: goto 0a9
      // 0a5: invokestatic a_t.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: iload 1
      // 0ab: ifeq 114
      // 0ae: goto 0b5
      // 0b1: invokestatic a_t.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: getfield a_t.oay Lt9d;
      // 0b8: new mew
      // 0bb: dup
      // 0bc: aload 0
      // 0bd: invokespecial mew.<init> (Li2h;)V
      // 0c0: invokevirtual t9d.cfv (Lmew;)Z
      // 0c3: ifeq 113
      // 0c6: goto 0cd
      // 0c9: invokestatic a_t.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: iload 1
      // 0cf: ifeq 114
      // 0d2: goto 0d9
      // 0d5: invokestatic a_t.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: getfield a_t.z2d Ljava/util/Random;
      // 0dc: invokevirtual java/util/Random.nextFloat ()F
      // 0df: ldc 30.0
      // 0e1: nop
      // 0e2: fmul
      // 0e3: fload 2
      // 0e4: ldc 0.4
      // 0e6: nop
      // 0e7: fsub
      // 0e8: fconst_2
      // 0e9: fmul
      // 0ea: fcmpg
      // 0eb: ifge 113
      // 0ee: goto 0f5
      // 0f1: invokestatic a_t.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: aconst_null
      // 0f7: checkcast g_3
      // 0fa: invokevirtual a_t.ux8 (Lg_3;)V
      // 0fd: aload 0
      // 0fe: bipush 0
      // 0ff: invokevirtual a_t.tjx (Z)V
      // 102: aload 0
      // 103: bipush 0
      // 104: putfield a_t.dt5 Z
      // 107: aload 0
      // 108: invokevirtual a_t.plc ()Z
      // 10b: pop
      // 10c: goto 113
      // 10f: invokestatic a_t.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: invokespecial s0i.qar ()V
      // 117: return
   }

   public boolean plc() {
      double var1 = this.o2v + (this.z2d.nextDouble() - 0.5) * 64.0;
      double var3 = this.kfp + (double)(this.z2d.nextInt(64) - 32);
      double var5 = this.vbd + (this.z2d.nextDouble() - 0.5) * 64.0;
      return this.u5q(var1, var3, var5);
   }

   public boolean i2r(i2h var1) {
      fqr var2 = new fqr(this.o2v - var1.o2v, this.aaw().bx_ + (double)(this.ikl / 2.0F) - var1.kfp + (double)var1.c5y(), this.vbd - var1.vbd);
      var2 = var2.kec();
      double var3 = 16.0;
      double var5 = this.o2v + (this.z2d.nextDouble() - 0.5) * 8.0 - var2.lvi * var3;
      double var7 = this.kfp + (double)(this.z2d.nextInt(16) - 8) - var2.gn5 * var3;
      double var9 = this.vbd + (this.z2d.nextDouble() - 0.5) * 8.0 - var2.bn2 * var3;
      return this.u5q(var5, var7, var9);
   }

   public boolean u5q(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a_t.c J
      // 003: ldc2_w 95469159937886
      // 006: lxor
      // 007: lstore 7
      // 009: aload 0
      // 00a: getfield a_t.o2v D
      // 00d: dstore 10
      // 00f: aload 0
      // 010: getfield a_t.kfp D
      // 013: dstore 12
      // 015: aload 0
      // 016: getfield a_t.vbd D
      // 019: dstore 14
      // 01b: aload 0
      // 01c: dload 1
      // 01d: putfield a_t.o2v D
      // 020: aload 0
      // 021: dload 3
      // 022: putfield a_t.kfp D
      // 025: invokestatic t9d.c ()I
      // 028: aload 0
      // 029: dload 5
      // 02b: putfield a_t.vbd D
      // 02e: bipush 0
      // 02f: istore 16
      // 031: istore 9
      // 033: new mew
      // 036: dup
      // 037: aload 0
      // 038: getfield a_t.o2v D
      // 03b: aload 0
      // 03c: getfield a_t.kfp D
      // 03f: aload 0
      // 040: getfield a_t.vbd D
      // 043: invokespecial mew.<init> (DDD)V
      // 046: astore 17
      // 048: aload 0
      // 049: getfield a_t.oay Lt9d;
      // 04c: aload 17
      // 04e: invokevirtual t9d.xjm (Lmew;)Z
      // 051: iload 9
      // 053: ifne 146
      // 056: ifeq 144
      // 059: goto 060
      // 05c: invokestatic a_t.a (Loov;)Loov;
      // 05f: athrow
      // 060: bipush 0
      // 061: istore 18
      // 063: iload 18
      // 065: ifne 0d8
      // 068: aload 17
      // 06a: invokevirtual mew.getY ()I
      // 06d: iload 9
      // 06f: ifne 0da
      // 072: iload 9
      // 074: ifne 0da
      // 077: goto 07e
      // 07a: invokestatic a_t.a (Loov;)Loov;
      // 07d: athrow
      // 07e: ifle 0d8
      // 081: goto 088
      // 084: invokestatic a_t.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 17
      // 08a: invokevirtual mew.eve ()Lmew;
      // 08d: astore 19
      // 08f: aload 0
      // 090: getfield a_t.oay Lt9d;
      // 093: aload 19
      // 095: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 098: invokeinterface zfz.r_y ()Le0x; 1
      // 09d: astore 20
      // 09f: iload 9
      // 0a1: ifne 0cf
      // 0a4: aload 20
      // 0a6: invokevirtual e0x.p1r ()Lp3y;
      // 0a9: invokevirtual p3y.c3t ()Z
      // 0ac: ifeq 0be
      // 0af: goto 0b6
      // 0b2: invokestatic a_t.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: bipush 1
      // 0b7: istore 18
      // 0b9: iload 9
      // 0bb: ifeq 0d3
      // 0be: aload 0
      // 0bf: dup
      // 0c0: getfield a_t.kfp D
      // 0c3: dconst_1
      // 0c4: dsub
      // 0c5: putfield a_t.kfp D
      // 0c8: goto 0cf
      // 0cb: invokestatic a_t.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 19
      // 0d1: astore 17
      // 0d3: iload 9
      // 0d5: ifeq 063
      // 0d8: iload 18
      // 0da: iload 9
      // 0dc: ifne 146
      // 0df: ifeq 144
      // 0e2: goto 0e9
      // 0e5: invokestatic a_t.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: aload 0
      // 0eb: getfield a_t.o2v D
      // 0ee: aload 0
      // 0ef: getfield a_t.kfp D
      // 0f2: aload 0
      // 0f3: getfield a_t.vbd D
      // 0f6: invokespecial s0i.clj (DDD)V
      // 0f9: aload 0
      // 0fa: getfield a_t.oay Lt9d;
      // 0fd: aload 0
      // 0fe: aload 0
      // 0ff: invokevirtual a_t.aaw ()Lnh4;
      // 102: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 105: invokeinterface java/util/List.isEmpty ()Z 1
      // 10a: iload 9
      // 10c: ifne 146
      // 10f: goto 116
      // 112: invokestatic a_t.a (Loov;)Loov;
      // 115: athrow
      // 116: ifeq 144
      // 119: goto 120
      // 11c: invokestatic a_t.a (Loov;)Loov;
      // 11f: athrow
      // 120: aload 0
      // 121: getfield a_t.oay Lt9d;
      // 124: aload 0
      // 125: invokevirtual a_t.aaw ()Lnh4;
      // 128: invokevirtual t9d.hhd (Lnh4;)Z
      // 12b: iload 9
      // 12d: ifne 146
      // 130: goto 137
      // 133: invokestatic a_t.a (Loov;)Loov;
      // 136: athrow
      // 137: ifne 144
      // 13a: goto 141
      // 13d: invokestatic a_t.a (Loov;)Loov;
      // 140: athrow
      // 141: bipush 1
      // 142: istore 16
      // 144: iload 16
      // 146: iload 9
      // 148: ifne 168
      // 14b: ifne 165
      // 14e: goto 155
      // 151: invokestatic a_t.a (Loov;)Loov;
      // 154: athrow
      // 155: aload 0
      // 156: dload 10
      // 158: dload 12
      // 15a: dload 14
      // 15c: invokevirtual a_t.m6_ (DDD)V
      // 15f: bipush 0
      // 160: ireturn
      // 161: invokestatic a_t.a (Loov;)Loov;
      // 164: athrow
      // 165: sipush 128
      // 168: istore 18
      // 16a: bipush 0
      // 16b: istore 19
      // 16d: iload 19
      // 16f: iload 18
      // 171: if_icmpge 249
      // 174: iload 19
      // 176: i2d
      // 177: iload 18
      // 179: i2d
      // 17a: dconst_1
      // 17b: dsub
      // 17c: ddiv
      // 17d: dstore 20
      // 17f: aload 0
      // 180: getfield a_t.z2d Ljava/util/Random;
      // 183: invokevirtual java/util/Random.nextFloat ()F
      // 186: ldc 0.5
      // 188: nop
      // 189: fsub
      // 18a: ldc 0.2
      // 18c: nop
      // 18d: fmul
      // 18e: fstore 22
      // 190: aload 0
      // 191: getfield a_t.z2d Ljava/util/Random;
      // 194: invokevirtual java/util/Random.nextFloat ()F
      // 197: ldc 0.5
      // 199: nop
      // 19a: fsub
      // 19b: ldc 0.2
      // 19d: nop
      // 19e: fmul
      // 19f: fstore 23
      // 1a1: aload 0
      // 1a2: getfield a_t.z2d Ljava/util/Random;
      // 1a5: invokevirtual java/util/Random.nextFloat ()F
      // 1a8: ldc 0.5
      // 1aa: nop
      // 1ab: fsub
      // 1ac: ldc 0.2
      // 1ae: nop
      // 1af: fmul
      // 1b0: fstore 24
      // 1b2: dload 10
      // 1b4: aload 0
      // 1b5: getfield a_t.o2v D
      // 1b8: dload 10
      // 1ba: dsub
      // 1bb: dload 20
      // 1bd: dmul
      // 1be: dadd
      // 1bf: aload 0
      // 1c0: getfield a_t.z2d Ljava/util/Random;
      // 1c3: invokevirtual java/util/Random.nextDouble ()D
      // 1c6: ldc2_w 0.5
      // 1c9: dsub
      // 1ca: aload 0
      // 1cb: getfield a_t.uo6 F
      // 1ce: f2d
      // 1cf: dmul
      // 1d0: ldc2_w 2.0
      // 1d3: dmul
      // 1d4: dadd
      // 1d5: dstore 25
      // 1d7: dload 12
      // 1d9: aload 0
      // 1da: getfield a_t.kfp D
      // 1dd: dload 12
      // 1df: dsub
      // 1e0: dload 20
      // 1e2: dmul
      // 1e3: dadd
      // 1e4: aload 0
      // 1e5: getfield a_t.z2d Ljava/util/Random;
      // 1e8: invokevirtual java/util/Random.nextDouble ()D
      // 1eb: aload 0
      // 1ec: getfield a_t.ikl F
      // 1ef: f2d
      // 1f0: dmul
      // 1f1: dadd
      // 1f2: dstore 27
      // 1f4: dload 14
      // 1f6: aload 0
      // 1f7: getfield a_t.vbd D
      // 1fa: dload 14
      // 1fc: dsub
      // 1fd: dload 20
      // 1ff: dmul
      // 200: dadd
      // 201: aload 0
      // 202: getfield a_t.z2d Ljava/util/Random;
      // 205: invokevirtual java/util/Random.nextDouble ()D
      // 208: ldc2_w 0.5
      // 20b: dsub
      // 20c: aload 0
      // 20d: getfield a_t.uo6 F
      // 210: f2d
      // 211: dmul
      // 212: ldc2_w 2.0
      // 215: dmul
      // 216: dadd
      // 217: dstore 29
      // 219: aload 0
      // 21a: getfield a_t.oay Lt9d;
      // 21d: getstatic w_0.t9k Lw_0;
      // 220: dload 25
      // 222: dload 27
      // 224: dload 29
      // 226: fload 22
      // 228: f2d
      // 229: fload 23
      // 22b: f2d
      // 22c: fload 24
      // 22e: f2d
      // 22f: bipush 0
      // 230: newarray 10
      // 232: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 235: iinc 19 1
      // 238: iload 9
      // 23a: ifne 27c
      // 23d: iload 9
      // 23f: ifeq 16d
      // 242: goto 249
      // 245: invokestatic a_t.a (Loov;)Loov;
      // 248: athrow
      // 249: aload 0
      // 24a: getfield a_t.oay Lt9d;
      // 24d: dload 10
      // 24f: dload 12
      // 251: dload 14
      // 253: sipush 12917
      // 256: ldc2_w 5091762762583479900
      // 259: lload 7
      // 25b: lxor
      // 25c: invokedynamic x (IJ)Ljava/lang/String; bsm=a_t.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: nop
      // 262: fconst_1
      // 263: fconst_1
      // 264: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 267: aload 0
      // 268: sipush 13611
      // 26b: ldc2_w 3333386507668001039
      // 26e: lload 7
      // 270: lxor
      // 271: invokedynamic x (IJ)Ljava/lang/String; bsm=a_t.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: nop
      // 277: fconst_1
      // 278: fconst_1
      // 279: invokevirtual a_t.lhu (Ljava/lang/String;FF)V
      // 27c: bipush 1
      // 27d: ireturn
   }

   @Override
   public String _n1() {
      long var1 = c ^ 43325226056377L;

      try {
         if (this._ah()) {
            return e<"x">(18456, 3016400312441135577L ^ var1);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return e<"x">(7813, 7536751682432186184L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 67921602442689L;
      return e<"x">(29994, 1816734493209056146L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 2959191425935L;
      return e<"x">(24731, 985807100825661551L ^ var1);
   }

   @Override
   public u7m q4n() {
      return xbr.odc;
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var3 = t9d.b();
      u7m var4 = this.q4n();
      if (var4 != null) {
         int var5 = this.z2d.nextInt(2 + var2);
         int var6 = 0;

         while (var6 < var5) {
            this.e70(var4, 1);
            var6++;
            if (var3 == 0) {
               break;
            }
         }
      }
   }

   public void y4i(zfz var1) {
      this.oit.c66(16, (short)(e0x.r2y(var1) & 65535));
   }

   public zfz ejt() {
      return e0x.v1b(this.oit.vxp(16) & '\uffff');
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
      // 005: iload 3
      // 006: ifne 021
      // 009: aload 1
      // 00a: invokevirtual a_t.nss (Lofh;)Z
      // 00d: ifeq 01d
      // 010: goto 017
      // 013: invokestatic a_t.a (Loov;)Loov;
      // 016: athrow
      // 017: bipush 0
      // 018: ireturn
      // 019: invokestatic a_t.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 1
      // 01e: invokevirtual ofh.nra ()Li2h;
      // 021: iload 3
      // 022: ifne 03a
      // 025: ifnull 04b
      // 028: goto 02f
      // 02b: invokestatic a_t.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 1
      // 030: invokevirtual ofh.nra ()Li2h;
      // 033: goto 03a
      // 036: invokestatic a_t.a (Loov;)Loov;
      // 039: athrow
      // 03a: instanceof tl9
      // 03d: iload 3
      // 03e: ifne 13f
      // 041: ifne 139
      // 044: goto 04b
      // 047: invokestatic a_t.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield a_t.oay Lt9d;
      // 04f: getfield t9d.v0f Z
      // 052: iload 3
      // 053: ifne 077
      // 056: goto 05d
      // 059: invokestatic a_t.a (Loov;)Loov;
      // 05c: athrow
      // 05d: ifne 073
      // 060: goto 067
      // 063: invokestatic a_t.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: bipush 1
      // 069: invokevirtual a_t.tjx (Z)V
      // 06c: goto 073
      // 06f: invokestatic a_t.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 1
      // 074: instanceof c7o
      // 077: iload 3
      // 078: ifne 0f4
      // 07b: ifeq 0f0
      // 07e: goto 085
      // 081: invokestatic a_t.a (Loov;)Loov;
      // 084: athrow
      // 085: aload 1
      // 086: invokevirtual ofh.nra ()Li2h;
      // 089: instanceof ha9
      // 08c: iload 3
      // 08d: ifne 0f4
      // 090: goto 097
      // 093: invokestatic a_t.a (Loov;)Loov;
      // 096: athrow
      // 097: ifeq 0f0
      // 09a: goto 0a1
      // 09d: invokestatic a_t.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: invokevirtual ofh.nra ()Li2h;
      // 0a5: instanceof z96
      // 0a8: iload 3
      // 0a9: ifne 0d1
      // 0ac: goto 0b3
      // 0af: invokestatic a_t.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: ifeq 0e4
      // 0b6: goto 0bd
      // 0b9: invokestatic a_t.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 1
      // 0be: invokevirtual ofh.nra ()Li2h;
      // 0c1: checkcast z96
      // 0c4: getfield z96._am Lrsh;
      // 0c7: invokevirtual rsh.u7c ()Z
      // 0ca: goto 0d1
      // 0cd: invokestatic a_t.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: ifeq 0e4
      // 0d4: aload 0
      // 0d5: bipush 0
      // 0d6: invokevirtual a_t.tjx (Z)V
      // 0d9: iload 3
      // 0da: ifeq 0f0
      // 0dd: goto 0e4
      // 0e0: invokestatic a_t.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: bipush 1
      // 0e6: putfield a_t.dt5 Z
      // 0e9: goto 0f0
      // 0ec: invokestatic a_t.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 1
      // 0f1: instanceof nhv
      // 0f4: iload 3
      // 0f5: ifne 13f
      // 0f8: ifeq 139
      // 0fb: goto 102
      // 0fe: invokestatic a_t.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: bipush 0
      // 104: putfield a_t.dt5 Z
      // 107: bipush 0
      // 108: istore 4
      // 10a: iload 4
      // 10c: bipush 64
      // 10e: if_icmpge 137
      // 111: aload 0
      // 112: invokevirtual a_t.plc ()Z
      // 115: iload 3
      // 116: ifne 138
      // 119: iload 3
      // 11a: ifne 12f
      // 11d: goto 124
      // 120: invokestatic a_t.a (Loov;)Loov;
      // 123: athrow
      // 124: ifeq 130
      // 127: goto 12e
      // 12a: invokestatic a_t.a (Loov;)Loov;
      // 12d: athrow
      // 12e: bipush 1
      // 12f: ireturn
      // 130: iinc 4 1
      // 133: iload 3
      // 134: ifeq 10a
      // 137: bipush 0
      // 138: ireturn
      // 139: aload 0
      // 13a: aload 1
      // 13b: fload 2
      // 13c: invokespecial s0i.m1t (Lofh;F)Z
      // 13f: istore 4
      // 141: aload 1
      // 142: invokevirtual ofh.e8m ()Z
      // 145: iload 3
      // 146: ifne 17f
      // 149: ifeq 17d
      // 14c: goto 153
      // 14f: invokestatic a_t.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: getfield a_t.z2d Ljava/util/Random;
      // 157: bipush 10
      // 159: invokevirtual java/util/Random.nextInt (I)I
      // 15c: iload 3
      // 15d: ifne 17f
      // 160: goto 167
      // 163: invokestatic a_t.a (Loov;)Loov;
      // 166: athrow
      // 167: ifeq 17d
      // 16a: goto 171
      // 16d: invokestatic a_t.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 0
      // 172: invokevirtual a_t.plc ()Z
      // 175: pop
      // 176: goto 17d
      // 179: invokestatic a_t.a (Loov;)Loov;
      // 17c: athrow
      // 17d: iload 4
      // 17f: ireturn
   }

   public boolean _ah() {
      int var1 = t9d.c();

      try {
         byte var10000 = this.oit.miz(18);
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

   public void tjx(boolean var1) {
      int var2 = t9d.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.oit;
               var10001 = 18;
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

   public static xk5 s6z() {
      return uab;
   }

   public static boolean hm1(a_t var0, ha9 var1) {
      return var0.y5t(var1);
   }

   public static boolean vwt(a_t var0, boolean var1) {
      return var0.dt5 = var1;
   }

   public static Set mek() {
      return nqi;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-929405094003269918L, 5578958289356791447L, MethodHandles.lookup().lookupClass()).a(241755260457447L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 107284018579442L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[12];
      int var5 = 0;
      String var4 = "Ø3\b&\u009c\u001a\tÒJ\u00942\u008c!14\to½8\u001c¸&\u0002î®=\u0092A-\u0000\u0092Hò;\u009exÕá\u000ep\u0010¼N~Z:@\u0085Á\u000eN±\u0096ô¥ñ\u009c\u0010%7ÜÞ_æ\u0007W\u0090\u0092\u0088ö_\u000bÈ) .\u0089êEhä\u009dÏ\u007f@íOø\u0001 *ÉC\u00062[;³!NJñ^\u001d»¿}(\u0096[Ø6\u000eÎP\u001c¡³5jÞ=9d\bú÷ì´W\u001aàÝ6-ÀÈÿ¨¹°ë\u00adá\u007fOfm0ÌMÌ<8\u0005\"í5!¡*k\u008b\u0085)F\u009dP\u0097ô\u0099U°\u008c\u001esÒe\u0084\u0014t²±à\u009f!\u001b\u0088ð\u0086\u001aÛ\u0089\u0086#\u007fÛ(\u008cõæ\u0086\u009chfv\u0082e\u0088Ò\"P\u001a¸áb¬|M\u0007\u008c\u0004Ð\u009dû\u0006ëúªÖ®q\u008b7¸pÊ$(>rþTÿ*m\u0005\u0019/p\u0010\u0090Le&\u0017\u0006{úk0uggM$\näÁd\u0089TSSN\u008eE¹¤ \u0098ròÛ/#j\u009du\u0092±.TV\u0013®\u001b\u0002ê\u0000û\u0090}\u008d ½oM\u0005\u001b\u008eÅ(ä¼FE\u0018nEyïdØ\u0092\u0098c³\u001aL*\u0095\u0001Ü\u0084õõzR\u00176\u0098SÃÇà\u001aDv¤\u0084ì«";
      int var6 = "Ø3\b&\u009c\u001a\tÒJ\u00942\u008c!14\to½8\u001c¸&\u0002î®=\u0092A-\u0000\u0092Hò;\u009exÕá\u000ep\u0010¼N~Z:@\u0085Á\u000eN±\u0096ô¥ñ\u009c\u0010%7ÜÞ_æ\u0007W\u0090\u0092\u0088ö_\u000bÈ) .\u0089êEhä\u009dÏ\u007f@íOø\u0001 *ÉC\u00062[;³!NJñ^\u001d»¿}(\u0096[Ø6\u000eÎP\u001c¡³5jÞ=9d\bú÷ì´W\u001aàÝ6-ÀÈÿ¨¹°ë\u00adá\u007fOfm0ÌMÌ<8\u0005\"í5!¡*k\u008b\u0085)F\u009dP\u0097ô\u0099U°\u008c\u001esÒe\u0084\u0014t²±à\u009f!\u001b\u0088ð\u0086\u001aÛ\u0089\u0086#\u007fÛ(\u008cõæ\u0086\u009chfv\u0082e\u0088Ò\"P\u001a¸áb¬|M\u0007\u008c\u0004Ð\u009dû\u0006ëúªÖ®q\u008b7¸pÊ$(>rþTÿ*m\u0005\u0019/p\u0010\u0090Le&\u0017\u0006{úk0uggM$\näÁd\u0089TSSN\u008eE¹¤ \u0098ròÛ/#j\u009du\u0092±.TV\u0013®\u001b\u0002ê\u0000û\u0090}\u008d ½oM\u0005\u001b\u008eÅ(ä¼FE\u0018nEyïdØ\u0092\u0098c³\u001aL*\u0095\u0001Ü\u0084õõzR\u00176\u0098SÃÇà\u001aDv¤\u0084ì«"
         .length();
      char var3 = '(';
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
                     g = var7;
                     u = new String[12];
                     ud4 = UUID.fromString(e<"x">(16694, 3738081958135158194L ^ var9));
                     uab = new xk5(ud4, e<"x">(23295, 1347685601549602416L ^ var9), 0.15F, 0).d2_(false);
                     nqi = Sets.newIdentityHashSet();
                     nqi.add(ox_.l11);
                     nqi.add(ox_.kqk);
                     nqi.add(ox_.vd0);
                     nqi.add(ox_.bqn);
                     nqi.add(ox_.qmk);
                     nqi.add(ox_.xq2);
                     nqi.add(ox_.zml);
                     nqi.add(ox_.ae9);
                     nqi.add(ox_.od1);
                     nqi.add(ox_.hio);
                     nqi.add(ox_.rs4);
                     nqi.add(ox_.jzx);
                     nqi.add(ox_.gdb);
                     nqi.add(ox_.pl8);
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

                  var4 = "\u0013¦\u001c\u0017°Þ-Õ6\u00adÝÒWFÓ\u0014¿0\u0011\u008aSÓ\u0005x-zm\n\rö\u009b^C\u0091*úÄe®6Hs_Xðeë·È m,K&¹a\u0019Sò»\u008cêþ\u009eGta\u001dñkÒ\u001dõR\nx\u00009¢\u0016\f¥Ô\u0018.Ð\u007fÔ-O \u009c¸ÈP\u0090\u0093\u00adëDX\u0099\u0011\u009aÓurR\u0083Ëf«\u0086";
                  var6 = "\u0013¦\u001c\u0017°Þ-Õ6\u00adÝÒWFÓ\u0014¿0\u0011\u008aSÓ\u0005x-zm\n\rö\u009b^C\u0091*úÄe®6Hs_Xðeë·È m,K&¹a\u0019Sò»\u008cêþ\u009eGta\u001dñkÒ\u001dõR\nx\u00009¢\u0016\f¥Ô\u0018.Ð\u007fÔ-O \u009c¸ÈP\u0090\u0093\u00adëDX\u0099\u0011\u009aÓurR\u0083Ëf«\u0086"
                     .length();
                  var3 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12254;
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
            throw new RuntimeException("a_t", var10);
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
         throw new RuntimeException("a_t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
