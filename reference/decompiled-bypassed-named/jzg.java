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

public class jzg extends s0i implements n6g {
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public jzg(OpaquePredicate var1) {
      super(var1);
      int var10000 = OpaquePredicate.b();
      this.e90 = new wkr(this, 1.0, 20, 60, 15.0F);
      this.akp = new h2d(this, ha9.class, 1.2, false);
      this.r1d.tn8(1, new dnq(this));
      int var2 = var10000;

      label26: {
         try {
            this.r1d.tn8(2, new mi2(this));
            this.r1d.tn8(3, new _fn(this, 1.0));
            this.r1d.tn8(3, new ccm(this, gse.class, 6.0F, 1.0, 1.2));
            this.r1d.tn8(4, new _tb(this, 1.0));
            this.r1d.tn8(6, new bdq(this, ha9.class, 8.0F));
            this.r1d.tn8(6, new ov6(this));
            this.g9o.tn8(1, new z7z(this, false, new Class[0]));
            this.g9o.tn8(2, new s24(this, ha9.class, true));
            this.g9o.tn8(3, new s24(this, EntityIronGolem.class, true));
            var5 = var1;
            if (var2 == 0) {
               break label26;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var5 = var1;
      }

      try {
         if (!var5.v0f) {
            this.psi();
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.w7i).zf7(0.25);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(13, new Byte((byte)0));
   }

   @Override
   public String _n1() {
      long var1 = c ^ 88555537924201L;
      return e<"m">(20232, 2778091335436811825L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 81549536562961L;
      return e<"m">(19632, 955312210465764087L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 129046526114143L;
      return e<"m">(22394, 5135146333233913719L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = c ^ 1268574937107L;
      this.lhu(e<"m">(20625, 774368517397332438L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public boolean _nm(EntityLivingBase param1) {
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
      // 05: aload 1
      // 06: invokespecial s0i._nm (Li2h;)Z
      // 09: iload 2
      // 0a: ifeq 6b
      // 0d: ifeq 6a
      // 10: goto 17
      // 13: invokestatic jzg.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: invokevirtual jzg.su3 ()I
      // 1b: iload 2
      // 1c: ifeq 69
      // 1f: goto 26
      // 22: invokestatic jzg.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: if_icmpne 68
      // 2a: goto 31
      // 2d: invokestatic jzg.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: instanceof Entity
      // 35: iload 2
      // 36: ifeq 69
      // 39: goto 40
      // 3c: invokestatic jzg.a (Loov;)Loov;
      // 3f: athrow
      // 40: ifeq 68
      // 43: goto 4a
      // 46: invokestatic jzg.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 1
      // 4b: checkcast Entity
      // 4e: new sdj
      // 51: dup
      // 52: getstatic mcs.znt Lmcs;
      // 55: getfield mcs.zr9 I
      // 58: sipush 200
      // 5b: invokespecial sdj.<init> (II)V
      // 5e: invokevirtual Entity.gmn (Lsdj;)V
      // 61: goto 68
      // 64: invokestatic jzg.a (Loov;)Loov;
      // 67: athrow
      // 68: bipush 1
      // 69: ireturn
      // 6a: bipush 0
      // 6b: ireturn
   }

   @Override
   public n1e fhc() {
      return n1e.via;
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield jzg.oay Lt9d;
      // 008: invokevirtual OpaquePredicate.m40 ()Z
      // 00b: iload 1
      // 00c: ifeq 152
      // 00f: ifeq 140
      // 012: goto 019
      // 015: invokestatic jzg.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield jzg.oay Lt9d;
      // 01d: getfield OpaquePredicate.v0f Z
      // 020: iload 1
      // 021: ifeq 152
      // 024: goto 02b
      // 027: invokestatic jzg.a (Loov;)Loov;
      // 02a: athrow
      // 02b: ifne 140
      // 02e: goto 035
      // 031: invokestatic jzg.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: fconst_1
      // 037: invokevirtual jzg.xeu (F)F
      // 03a: fstore 2
      // 03b: new mew
      // 03e: dup
      // 03f: aload 0
      // 040: getfield jzg.o2v D
      // 043: aload 0
      // 044: getfield jzg.kfp D
      // 047: invokestatic java/lang/Math.round (D)J
      // 04a: l2d
      // 04b: aload 0
      // 04c: getfield jzg.vbd D
      // 04f: invokespecial mew.<init> (DDD)V
      // 052: astore 3
      // 053: fload 2
      // 054: ldc 0.5
      // 056: nop
      // 057: fcmpl
      // 058: iload 1
      // 059: ifeq 152
      // 05c: ifle 140
      // 05f: goto 066
      // 062: invokestatic jzg.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: getfield jzg.z2d Ljava/util/Random;
      // 06a: invokevirtual java/util/Random.nextFloat ()F
      // 06d: ldc 30.0
      // 06f: nop
      // 070: fmul
      // 071: fload 2
      // 072: ldc 0.4
      // 074: nop
      // 075: fsub
      // 076: fconst_2
      // 077: fmul
      // 078: fcmpg
      // 079: iload 1
      // 07a: ifeq 152
      // 07d: goto 084
      // 080: invokestatic jzg.a (Loov;)Loov;
      // 083: athrow
      // 084: ifge 140
      // 087: goto 08e
      // 08a: invokestatic jzg.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield jzg.oay Lt9d;
      // 092: aload 3
      // 093: invokevirtual OpaquePredicate.cfv (Lmew;)Z
      // 096: iload 1
      // 097: ifeq 152
      // 09a: goto 0a1
      // 09d: invokestatic jzg.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifeq 140
      // 0a4: goto 0ab
      // 0a7: invokestatic jzg.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: bipush 1
      // 0ac: istore 4
      // 0ae: aload 0
      // 0af: bipush 4
      // 0b0: invokevirtual jzg.rnq (I)Lerg;
      // 0b3: astore 5
      // 0b5: aload 5
      // 0b7: iload 1
      // 0b8: ifeq 0c7
      // 0bb: ifnull 123
      // 0be: goto 0c5
      // 0c1: invokestatic jzg.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 5
      // 0c7: invokevirtual erg.dw2 ()Z
      // 0ca: iload 1
      // 0cb: ifeq 121
      // 0ce: ifeq 120
      // 0d1: goto 0d8
      // 0d4: invokestatic jzg.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 5
      // 0da: aload 5
      // 0dc: invokevirtual erg.dzj ()I
      // 0df: aload 0
      // 0e0: getfield jzg.z2d Ljava/util/Random;
      // 0e3: bipush 2
      // 0e4: invokevirtual java/util/Random.nextInt (I)I
      // 0e7: iadd
      // 0e8: invokevirtual erg.awe (I)V
      // 0eb: aload 5
      // 0ed: invokevirtual erg.dzj ()I
      // 0f0: iload 1
      // 0f1: ifeq 121
      // 0f4: goto 0fb
      // 0f7: invokestatic jzg.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 5
      // 0fd: invokevirtual erg.mg5 ()I
      // 100: if_icmplt 120
      // 103: goto 10a
      // 106: invokestatic jzg.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: aload 5
      // 10d: invokevirtual jzg.xgx (Lerg;)V
      // 110: aload 0
      // 111: bipush 4
      // 112: aconst_null
      // 113: checkcast erg
      // 116: invokevirtual jzg.fga (ILerg;)V
      // 119: goto 120
      // 11c: invokestatic jzg.a (Loov;)Loov;
      // 11f: athrow
      // 120: bipush 0
      // 121: istore 4
      // 123: iload 4
      // 125: iload 1
      // 126: ifeq 152
      // 129: ifeq 140
      // 12c: goto 133
      // 12f: invokestatic jzg.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 0
      // 134: bipush 8
      // 136: invokevirtual jzg.k03 (I)V
      // 139: goto 140
      // 13c: invokestatic jzg.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 0
      // 141: iload 1
      // 142: ifeq 181
      // 145: getfield jzg.oay Lt9d;
      // 148: getfield OpaquePredicate.v0f Z
      // 14b: goto 152
      // 14e: invokestatic jzg.a (Loov;)Loov;
      // 151: athrow
      // 152: ifeq 180
      // 155: aload 0
      // 156: iload 1
      // 157: ifeq 181
      // 15a: goto 161
      // 15d: invokestatic jzg.a (Loov;)Loov;
      // 160: athrow
      // 161: invokevirtual jzg.su3 ()I
      // 164: bipush 1
      // 165: if_icmpne 180
      // 168: goto 16f
      // 16b: invokestatic jzg.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 0
      // 170: ldc 0.72
      // 172: nop
      // 173: ldc 2.535
      // 175: nop
      // 176: invokevirtual jzg.yxc (FF)V
      // 179: goto 180
      // 17c: invokestatic jzg.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: invokespecial s0i.e_a ()V
      // 184: return
   }

   @Override
   public void dm3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial s0i.dm3 ()V
      // 08: aload 0
      // 09: getfield jzg.hzp Li2h;
      // 0c: iload 1
      // 0d: ifeq 28
      // 10: instanceof EntityPlayer
      // 13: ifeq 34
      // 16: goto 1d
      // 19: invokestatic jzg.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield jzg.hzp Li2h;
      // 21: goto 28
      // 24: invokestatic jzg.a (Loov;)Loov;
      // 27: athrow
      // 28: checkcast EntityPlayer
      // 2b: astore 2
      // 2c: aload 0
      // 2d: aload 2
      // 2e: getfield EntityPlayer.ksw F
      // 31: putfield jzg.ksw F
      // 34: return
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: aload 1
      // 006: invokespecial s0i.owu (Lofh;)V
      // 009: aload 1
      // 00a: invokevirtual ofh.f8d ()Li2h;
      // 00d: instanceof hy9
      // 010: iload 2
      // 011: ifeq 08a
      // 014: ifeq 07c
      // 017: goto 01e
      // 01a: invokestatic jzg.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 1
      // 01f: invokevirtual ofh.nra ()Li2h;
      // 022: instanceof ha9
      // 025: iload 2
      // 026: ifeq 08a
      // 029: goto 030
      // 02c: invokestatic jzg.a (Loov;)Loov;
      // 02f: athrow
      // 030: ifeq 07c
      // 033: goto 03a
      // 036: invokestatic jzg.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 1
      // 03b: invokevirtual ofh.nra ()Li2h;
      // 03e: checkcast ha9
      // 041: astore 3
      // 042: aload 3
      // 043: getfield ha9.o2v D
      // 046: aload 0
      // 047: getfield jzg.o2v D
      // 04a: dsub
      // 04b: dstore 4
      // 04d: aload 3
      // 04e: getfield ha9.vbd D
      // 051: aload 0
      // 052: getfield jzg.vbd D
      // 055: dsub
      // 056: dstore 6
      // 058: dload 4
      // 05a: dload 4
      // 05c: dmul
      // 05d: dload 6
      // 05f: dload 6
      // 061: dmul
      // 062: dadd
      // 063: ldc2_w 2500.0
      // 066: dcmpl
      // 067: iflt 078
      // 06a: aload 3
      // 06b: getstatic y8d.h12 Ll7l;
      // 06e: invokevirtual ha9.aex (L_ss;)V
      // 071: goto 078
      // 074: invokestatic jzg.a (Loov;)Loov;
      // 077: athrow
      // 078: iload 2
      // 079: ifne 109
      // 07c: aload 1
      // 07d: invokevirtual ofh.nra ()Li2h;
      // 080: instanceof EntitySkeleton
      // 083: goto 08a
      // 086: invokestatic jzg.a (Loov;)Loov;
      // 089: athrow
      // 08a: iload 2
      // 08b: ifeq 0a9
      // 08e: ifeq 109
      // 091: goto 098
      // 094: invokestatic jzg.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 1
      // 099: invokevirtual ofh.nra ()Li2h;
      // 09c: checkcast EntitySkeleton
      // 09f: invokevirtual EntitySkeleton.pap ()Z
      // 0a2: goto 0a9
      // 0a5: invokestatic jzg.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: iload 2
      // 0aa: ifeq 0d3
      // 0ad: ifeq 109
      // 0b0: goto 0b7
      // 0b3: invokestatic jzg.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: invokevirtual ofh.nra ()Li2h;
      // 0bb: checkcast EntitySkeleton
      // 0be: iload 2
      // 0bf: ifeq 0e4
      // 0c2: goto 0c9
      // 0c5: invokestatic jzg.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: invokevirtual EntitySkeleton.wmh ()Z
      // 0cc: goto 0d3
      // 0cf: invokestatic jzg.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: ifeq 109
      // 0d6: aload 1
      // 0d7: invokevirtual ofh.nra ()Li2h;
      // 0da: checkcast EntitySkeleton
      // 0dd: goto 0e4
      // 0e0: invokestatic jzg.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: invokevirtual EntitySkeleton.tnz ()V
      // 0e7: aload 0
      // 0e8: new erg
      // 0eb: dup
      // 0ec: getstatic xbr.r9n Lu7m;
      // 0ef: bipush 1
      // 0f0: aload 0
      // 0f1: invokevirtual jzg.su3 ()I
      // 0f4: bipush 1
      // 0f5: if_icmpne 100
      // 0f8: bipush 1
      // 0f9: goto 101
      // 0fc: invokestatic jzg.a (Loov;)Loov;
      // 0ff: athrow
      // 100: bipush 0
      // 101: invokespecial erg.<init> (Lu7m;II)V
      // 104: fconst_0
      // 105: invokevirtual jzg.qji (Lerg;F)Lnvf;
      // 108: pop
      // 109: return
   }

   @Override
   public u7m q4n() {
      return xbr.tzx;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void ir3(boolean var1, int var2) {
      int var3 = OpaquePredicate.c();

      int var4;
      label89: {
         label83: {
            int var10000;
            label76: {
               label84: {
                  try {
                     var10000 = this.su3();
                     if (var3 != 0) {
                        break label76;
                     }

                     if (var10000 != 1) {
                        break label84;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  var4 = this.z2d.nextInt(3 + var2) - 1;
                  int var5 = 0;

                  while (var5 < var4) {
                     try {
                        this.e70(xbr.thr, 1);
                        var5++;
                        if (var3 != 0) {
                           break label89;
                        }

                        if (var3 != 0) {
                           break;
                        }
                     } catch (oov var9) {
                        throw a(var9);
                     }
                  }

                  try {
                     if (var3 == 0) {
                        break label83;
                     }
                  } catch (oov var8) {
                     boolean var10001 = false;
                     throw a(var8);
                  }
               }

               try {
                  var10000 = this.z2d.nextInt(3 + var2);
               } catch (oov var7) {
                  boolean var14 = false;
                  throw a(var7);
               }
            }

            var4 = var10000;
            int var11 = 0;

            while (var11 < var4) {
               try {
                  this.e70(xbr.tzx, 1);
                  var11++;
                  if (var3 != 0) {
                     break label89;
                  }

                  if (var3 != 0) {
                     break;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }
            }
         }

         var4 = this.z2d.nextInt(3 + var2);
      }

      int var12 = 0;

      while (var12 < var4) {
         this.e70(xbr.pl_, 1);
         var12++;
         if (var3 != 0) {
            break;
         }
      }
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1f
      // 09: invokevirtual jzg.su3 ()I
      // 0c: bipush 1
      // 0d: if_icmpne 30
      // 10: goto 17
      // 13: invokestatic jzg.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic jzg.a (Loov;)Loov;
      // 1e: athrow
      // 1f: new erg
      // 22: dup
      // 23: getstatic xbr.r9n Lu7m;
      // 26: bipush 1
      // 27: bipush 1
      // 28: invokespecial erg.<init> (Lu7m;II)V
      // 2b: fconst_0
      // 2c: invokevirtual jzg.qji (Lerg;F)Lnvf;
      // 2f: pop
      // 30: return
   }

   @Override
   public void _58(css var1) {
      super._58(var1);
      this.fga(0, new erg(xbr.okb));
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: aload 2
      // 007: invokespecial s0i.hx8 (Lcss;Lps6;)Lps6;
      // 00a: astore 2
      // 00b: aload 0
      // 00c: iload 3
      // 00d: ifeq 093
      // 010: getfield jzg.oay Lt9d;
      // 013: getfield OpaquePredicate.vzz Lupn;
      // 016: instanceof oi2
      // 019: ifeq 07a
      // 01c: goto 023
      // 01f: invokestatic jzg.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: iload 3
      // 025: ifeq 093
      // 028: goto 02f
      // 02b: invokestatic jzg.a (Loov;)Loov;
      // 02e: athrow
      // 02f: invokevirtual jzg.mbr ()Ljava/util/Random;
      // 032: bipush 5
      // 033: invokevirtual java/util/Random.nextInt (I)I
      // 036: ifle 07a
      // 039: goto 040
      // 03c: invokestatic jzg.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield jzg.r1d Ldak;
      // 044: bipush 4
      // 045: aload 0
      // 046: getfield jzg.akp Lh2d;
      // 049: invokevirtual dak.tn8 (ILcjm;)V
      // 04c: aload 0
      // 04d: bipush 1
      // 04e: invokevirtual jzg.kyg (I)V
      // 051: aload 0
      // 052: bipush 0
      // 053: new erg
      // 056: dup
      // 057: getstatic xbr.ivx Lu7m;
      // 05a: invokespecial erg.<init> (Lu7m;)V
      // 05d: invokevirtual jzg.fga (ILerg;)V
      // 060: aload 0
      // 061: getstatic m6d.y3f Lw9p;
      // 064: invokevirtual jzg.dgt (Lw9p;)L_4o;
      // 067: ldc2_w 4.0
      // 06a: invokeinterface _4o.zf7 (D)V 3
      // 06f: iload 3
      // 070: ifne 097
      // 073: goto 07a
      // 076: invokestatic jzg.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield jzg.r1d Ldak;
      // 07e: bipush 4
      // 07f: aload 0
      // 080: getfield jzg.e90 Lwkr;
      // 083: invokevirtual dak.tn8 (ILcjm;)V
      // 086: aload 0
      // 087: aload 1
      // 088: invokevirtual jzg._58 (Lcss;)V
      // 08b: aload 0
      // 08c: goto 093
      // 08f: invokestatic jzg.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: invokevirtual jzg.jng (Lcss;)V
      // 097: aload 0
      // 098: aload 0
      // 099: getfield jzg.z2d Ljava/util/Random;
      // 09c: invokevirtual java/util/Random.nextFloat ()F
      // 09f: ldc 0.55
      // 0a1: nop
      // 0a2: aload 1
      // 0a3: invokevirtual css.os2 ()F
      // 0a6: fmul
      // 0a7: fcmpg
      // 0a8: iload 3
      // 0a9: ifeq 0b7
      // 0ac: ifge 0ba
      // 0af: goto 0b6
      // 0b2: invokestatic jzg.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: bipush 1
      // 0b7: goto 0bb
      // 0ba: bipush 0
      // 0bb: invokevirtual jzg.onk (Z)V
      // 0be: aload 0
      // 0bf: iload 3
      // 0c0: ifeq 0d9
      // 0c3: bipush 4
      // 0c4: invokevirtual jzg.rnq (I)Lerg;
      // 0c7: ifnonnull 164
      // 0ca: goto 0d1
      // 0cd: invokestatic jzg.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: goto 0d9
      // 0d5: invokestatic jzg.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: getfield jzg.oay Lt9d;
      // 0dc: invokevirtual OpaquePredicate.mp6 ()Ljava/util/Calendar;
      // 0df: astore 4
      // 0e1: aload 4
      // 0e3: bipush 2
      // 0e4: invokevirtual java/util/Calendar.get (I)I
      // 0e7: bipush 1
      // 0e8: iadd
      // 0e9: bipush 10
      // 0eb: iload 3
      // 0ec: ifeq 113
      // 0ef: if_icmpne 164
      // 0f2: goto 0f9
      // 0f5: invokestatic jzg.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 4
      // 0fb: bipush 5
      // 0fc: invokevirtual java/util/Calendar.get (I)I
      // 0ff: iload 3
      // 100: ifeq 133
      // 103: goto 10a
      // 106: invokestatic jzg.a (Loov;)Loov;
      // 109: athrow
      // 10a: bipush 31
      // 10c: goto 113
      // 10f: invokestatic jzg.a (Loov;)Loov;
      // 112: athrow
      // 113: if_icmpne 164
      // 116: aload 0
      // 117: iload 3
      // 118: ifeq 137
      // 11b: goto 122
      // 11e: invokestatic jzg.a (Loov;)Loov;
      // 121: athrow
      // 122: getfield jzg.z2d Ljava/util/Random;
      // 125: invokevirtual java/util/Random.nextFloat ()F
      // 128: ldc 0.25
      // 12a: nop
      // 12b: fcmpg
      // 12c: goto 133
      // 12f: invokestatic jzg.a (Loov;)Loov;
      // 132: athrow
      // 133: ifge 164
      // 136: aload 0
      // 137: bipush 4
      // 138: new erg
      // 13b: dup
      // 13c: aload 0
      // 13d: getfield jzg.z2d Ljava/util/Random;
      // 140: invokevirtual java/util/Random.nextFloat ()F
      // 143: ldc 0.1
      // 145: nop
      // 146: fcmpg
      // 147: ifge 154
      // 14a: getstatic ox_.pj4 Le0x;
      // 14d: goto 157
      // 150: invokestatic jzg.a (Loov;)Loov;
      // 153: athrow
      // 154: getstatic ox_.jzx Le0x;
      // 157: invokespecial erg.<init> (Le0x;)V
      // 15a: invokevirtual jzg.fga (ILerg;)V
      // 15d: aload 0
      // 15e: getfield jzg.k92 [F
      // 161: bipush 4
      // 162: fconst_0
      // 163: fastore
      // 164: aload 2
      // 165: areturn
   }

   public void psi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield jzg.r1d Ldak;
      // 04: aload 0
      // 05: getfield jzg.akp Lh2d;
      // 08: invokevirtual dak.hmq (Lcjm;)V
      // 0b: aload 0
      // 0c: getfield jzg.r1d Ldak;
      // 0f: aload 0
      // 10: getfield jzg.e90 Lwkr;
      // 13: invokevirtual dak.hmq (Lcjm;)V
      // 16: invokestatic OpaquePredicate.b ()I
      // 19: aload 0
      // 1a: invokevirtual jzg.tsc ()Lerg;
      // 1d: astore 2
      // 1e: istore 1
      // 1f: aload 2
      // 20: iload 1
      // 21: ifeq 2f
      // 24: ifnull 4f
      // 27: goto 2e
      // 2a: invokestatic jzg.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual erg.gn1 ()Lu7m;
      // 32: getstatic xbr.okb Lr5m;
      // 35: if_acmpne 4f
      // 38: aload 0
      // 39: getfield jzg.r1d Ldak;
      // 3c: bipush 4
      // 3d: aload 0
      // 3e: getfield jzg.e90 Lwkr;
      // 41: invokevirtual dak.tn8 (ILcjm;)V
      // 44: iload 1
      // 45: ifne 62
      // 48: goto 4f
      // 4b: invokestatic jzg.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield jzg.r1d Ldak;
      // 53: bipush 4
      // 54: aload 0
      // 55: getfield jzg.akp Lh2d;
      // 58: invokevirtual dak.tn8 (ILcjm;)V
      // 5b: goto 62
      // 5e: invokestatic jzg.a (Loov;)Loov;
      // 61: athrow
      // 62: return
   }

   @Override
   public void mx4(Entity param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jzg.c J
      // 003: ldc2_w 81830546390576
      // 006: lxor
      // 007: lstore 3
      // 008: new hy9
      // 00b: dup
      // 00c: aload 0
      // 00d: getfield jzg.oay Lt9d;
      // 010: aload 0
      // 011: aload 1
      // 012: ldc 1.6
      // 014: nop
      // 015: bipush 14
      // 017: aload 0
      // 018: getfield jzg.oay Lt9d;
      // 01b: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 01e: invokevirtual v66.dzc ()I
      // 021: bipush 4
      // 022: imul
      // 023: isub
      // 024: i2f
      // 025: invokespecial hy9.<init> (Lt9d;Lg_3;Lg_3;FF)V
      // 028: astore 6
      // 02a: invokestatic OpaquePredicate.b ()I
      // 02d: getstatic vef.s61 Lvef;
      // 030: getfield vef.bbf I
      // 033: aload 0
      // 034: invokevirtual jzg.tsc ()Lerg;
      // 037: invokestatic hc0.qa_ (ILerg;)I
      // 03a: istore 7
      // 03c: istore 5
      // 03e: getstatic vef.t24 Lvef;
      // 041: getfield vef.bbf I
      // 044: aload 0
      // 045: invokevirtual jzg.tsc ()Lerg;
      // 048: invokestatic hc0.qa_ (ILerg;)I
      // 04b: istore 8
      // 04d: aload 6
      // 04f: fload 2
      // 050: fconst_2
      // 051: fmul
      // 052: f2d
      // 053: aload 0
      // 054: getfield jzg.z2d Ljava/util/Random;
      // 057: invokevirtual java/util/Random.nextGaussian ()D
      // 05a: ldc2_w 0.25
      // 05d: dmul
      // 05e: dadd
      // 05f: aload 0
      // 060: getfield jzg.oay Lt9d;
      // 063: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 066: invokevirtual v66.dzc ()I
      // 069: i2f
      // 06a: ldc 0.11
      // 06c: nop
      // 06d: fmul
      // 06e: f2d
      // 06f: dadd
      // 070: invokevirtual hy9.l4o (D)V
      // 073: iload 7
      // 075: iload 5
      // 077: ifeq 0a3
      // 07a: ifle 0a1
      // 07d: goto 084
      // 080: invokestatic jzg.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 6
      // 086: aload 6
      // 088: invokevirtual hy9.h1p ()D
      // 08b: iload 7
      // 08d: i2d
      // 08e: ldc2_w 0.5
      // 091: dmul
      // 092: dadd
      // 093: ldc2_w 0.5
      // 096: dadd
      // 097: invokevirtual hy9.l4o (D)V
      // 09a: goto 0a1
      // 09d: invokestatic jzg.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: iload 8
      // 0a3: iload 5
      // 0a5: ifeq 0cd
      // 0a8: ifle 0c0
      // 0ab: goto 0b2
      // 0ae: invokestatic jzg.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 6
      // 0b4: iload 8
      // 0b6: invokevirtual hy9.ilm (I)V
      // 0b9: goto 0c0
      // 0bc: invokestatic jzg.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: getstatic vef.pxu Lvef;
      // 0c3: getfield vef.bbf I
      // 0c6: aload 0
      // 0c7: invokevirtual jzg.tsc ()Lerg;
      // 0ca: invokestatic hc0.qa_ (ILerg;)I
      // 0cd: iload 5
      // 0cf: ifeq 0e7
      // 0d2: ifgt 0f7
      // 0d5: goto 0dc
      // 0d8: invokestatic jzg.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: invokevirtual jzg.su3 ()I
      // 0e0: goto 0e7
      // 0e3: invokestatic jzg.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 5
      // 0e9: ifeq 132
      // 0ec: bipush 1
      // 0ed: if_icmpne 105
      // 0f0: goto 0f7
      // 0f3: invokestatic jzg.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 6
      // 0f9: bipush 100
      // 0fb: invokevirtual hy9.k03 (I)V
      // 0fe: goto 105
      // 101: invokestatic jzg.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: sipush 2844
      // 109: ldc2_w 6022534143774966905
      // 10c: lload 3
      // 10d: lxor
      // 10e: invokedynamic m (IJ)Ljava/lang/String; bsm=jzg.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: nop
      // 114: fconst_1
      // 115: fconst_1
      // 116: aload 0
      // 117: invokevirtual jzg.mbr ()Ljava/util/Random;
      // 11a: invokevirtual java/util/Random.nextFloat ()F
      // 11d: ldc 0.4
      // 11f: nop
      // 120: fmul
      // 121: ldc 0.8
      // 123: nop
      // 124: fadd
      // 125: fdiv
      // 126: invokevirtual jzg.lhu (Ljava/lang/String;FF)V
      // 129: aload 0
      // 12a: getfield jzg.oay Lt9d;
      // 12d: aload 6
      // 12f: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 132: pop
      // 133: return
   }

   public int su3() {
      return this.oit.miz(13);
   }

   public void kyg(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield jzg.oit Lwl1;
      // 08: bipush 13
      // 0a: iload 1
      // 0b: i2b
      // 0c: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 0f: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 12: aload 0
      // 13: iload 1
      // 14: iload 2
      // 15: ifne 2b
      // 18: bipush 1
      // 19: if_icmpne 2e
      // 1c: goto 23
      // 1f: invokestatic jzg.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 1
      // 24: goto 2b
      // 27: invokestatic jzg.a (Loov;)Loov;
      // 2a: athrow
      // 2b: goto 2f
      // 2e: bipush 0
      // 2f: putfield jzg.cuj Z
      // 32: iload 2
      // 33: ifne 53
      // 36: iload 1
      // 37: bipush 1
      // 38: if_icmpne 57
      // 3b: goto 42
      // 3e: invokestatic jzg.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: ldc 0.72
      // 45: nop
      // 46: ldc 2.535
      // 48: nop
      // 49: invokevirtual jzg.yxc (FF)V
      // 4c: goto 53
      // 4f: invokestatic jzg.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 2
      // 54: ifeq 68
      // 57: aload 0
      // 58: ldc 0.6
      // 5a: nop
      // 5b: ldc 1.95
      // 5d: nop
      // 5e: invokevirtual jzg.yxc (FF)V
      // 61: goto 68
      // 64: invokestatic jzg.a (Loov;)Loov;
      // 67: athrow
      // 68: return
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 42994271639220L;
      int var4 = OpaquePredicate.c();

      label20: {
         try {
            super.cjb(var1);
            if (var4 != 0) {
               return;
            }

            if (!var1.inh(e<"m">(24584, 8991279862609135595L ^ var2), 99)) {
               break label20;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         byte var5 = var1.r_t(e<"m">(419, 303123260108285508L ^ var2));
         this.kyg(var5);
      }

      this.psi();
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 89834191763999L;
      super.srs(var1);
      var1.atr(e<"m">(419, 303041147896777455L ^ var2), (byte)this.su3());
   }

   @Override
   public void fga(int var1, erg var2) {
      int var3 = OpaquePredicate.c();

      int var10000;
      label26: {
         try {
            super.fga(var1, var2);
            var10000 = this.oay.v0f;
            if (var3 != 0) {
               break label26;
            }

            if (this.oay.v0f) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      try {
         if (var10000 == 0) {
            this.psi();
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   @Override
   public float c5y() {
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
      // 06: ifne 1f
      // 09: invokevirtual jzg.su3 ()I
      // 0c: bipush 1
      // 0d: if_icmpne 25
      // 10: goto 17
      // 13: invokestatic jzg.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic jzg.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokespecial s0i.c5y ()F
      // 22: goto 28
      // 25: ldc 1.74
      // 27: nop
      // 28: freturn
   }

   @Override
   public double g4y() {
      try {
         if (this.ejl()) {
            return 0.0;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return -0.35;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-634156644423578662L, 2394974874713276112L, MethodHandles.lookup().lookupClass()).a(24128083929578L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 26895769217682L;
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
      String var6 = "D<P\u0098\u008eAHD?\u0014Üx\u0003¥¨\u0096\u0094ë\u009a\u0006g\u0007Â&Ð\u0097¤\u00892\u001a\u0096É\u0092\u008aÐË³ÆM\u0088\u0018\u001ep¼·¨\u0096Ì<\u0006\u0092\u000b\u0080wÏ£\u00899Ñ\u0017{f\u0001\f.(+½ÈÉ×ûMVþ\u0090\u0086\u0099\u0006\u0082+i$\u001fIh»²RÅN\u008e\u0005ÿ5ha>\u0011Z\u000bTNE\u0084\u0099 \u0011ôg\u0095Î\u0017\u0014È\u0087ðcÐ¿kö%\u0016\u0094(\u0005½\u008eBµ-å\u0082\u0014\fc¦®0û»øü$4\u001dãÃh¼NuhTîC\u0081A\u0091-ûº¢\u0003±\u000bKq\u0080$_d»wI|O\u0090ï£\u000e\u000b|P;\u0096ª";
      int var8 = "D<P\u0098\u008eAHD?\u0014Üx\u0003¥¨\u0096\u0094ë\u009a\u0006g\u0007Â&Ð\u0097¤\u00892\u001a\u0096É\u0092\u008aÐË³ÆM\u0088\u0018\u001ep¼·¨\u0096Ì<\u0006\u0092\u000b\u0080wÏ£\u00899Ñ\u0017{f\u0001\f.(+½ÈÉ×ûMVþ\u0090\u0086\u0099\u0006\u0082+i$\u001fIh»²RÅN\u008e\u0005ÿ5ha>\u0011Z\u000bTNE\u0084\u0099 \u0011ôg\u0095Î\u0017\u0014È\u0087ðcÐ¿kö%\u0016\u0094(\u0005½\u008eBµ-å\u0082\u0014\fc¦®0û»øü$4\u001dãÃh¼NuhTîC\u0081A\u0091-ûº¢\u0003±\u000bKq\u0080$_d»wI|O\u0090ï£\u000e\u000b|P;\u0096ª"
         .length();
      char var5 = '(';
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

                  var6 = "\u001eHÖvô1Ëê\u008eº\u0096gmì\u0090'\u0014YÕ2\u0094\u0093§@t@4\u00806&\u0098T(L-9\u008d-rÿ×¾ÞzA\u0099oü\u001e¯ØlvÁJ'5\u0083%fM,\näÜø eÜ¼\u0007I\\";
                  var8 = "\u001eHÖvô1Ëê\u008eº\u0096gmì\u0090'\u0014YÕ2\u0094\u0093§@t@4\u00806&\u0098T(L-9\u008d-rÿ×¾ÞzA\u0099oü\u001e¯ØlvÁJ'5\u0083%fM,\näÜø eÜ¼\u0007I\\"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30501;
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
            throw new RuntimeException("jzg", var10);
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
         throw new RuntimeException("jzg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
