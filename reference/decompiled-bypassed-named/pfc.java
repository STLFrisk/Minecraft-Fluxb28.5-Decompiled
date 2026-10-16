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

public class pfc extends sq9 {
   private r72 jn0;
   private r72 ha8;
   private r72 a9_;
   private r72 x6r;
   private static final Predicate izu;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public pfc() {
      super(p3y.clf, _mi.vbr);
      this.y8l(this._8_.c32().zvi(em9, vt2.z9q));
      this._p_(true);
      this.i3l(uja.mqu);
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      super.tfc(var1, var2, var3);
      this.s3e(var1, var2);
   }

   public boolean e1t(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: invokevirtual pfc.t6h ()Lr72;
      // 08: aload 1
      // 09: aload 2
      // 0a: invokevirtual r72.clx (Lt9d;Lmew;)Lr72$kqk;
      // 0d: iload 3
      // 0e: ifeq 2b
      // 11: ifnonnull 2e
      // 14: goto 1b
      // 17: invokestatic pfc.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual pfc._i9 ()Lr72;
      // 1f: aload 1
      // 20: aload 2
      // 21: invokevirtual r72.clx (Lt9d;Lmew;)Lr72$kqk;
      // 24: goto 2b
      // 27: invokestatic pfc.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifnull 36
      // 2e: bipush 1
      // 2f: goto 37
      // 32: invokestatic pfc.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
   }

   private void s3e(OpaquePredicate var1, mew var2) {
      int var3 = OpaquePredicate.b();
      r72$kqk var4;
      r72$kqk var10000 = var4 = this.ygz().clx(var1, var2);

      label160: {
         label165: {
            try {
               if (var3 == 0) {
                  break label160;
               }

               if (var10000 == null) {
                  break label165;
               }
            } catch (oov var16) {
               throw a(var16);
            }

            int var5 = 0;

            while (var5 < this.ygz().sy_()) {
               d2q var6 = var4.pfb(0, var5, 0);

               try {
                  var1.vct(var6.i4m(), ox_.ibw.l4i(), 2);
                  var5++;
                  if (var3 == 0) {
                     return;
                  }

                  if (var3 == 0) {
                     break;
                  }
               } catch (oov var15) {
                  throw a(var15);
               }
            }

            qpg var17 = new qpg(var1);
            mew var20 = var4.pfb(0, 2, 0).i4m();
            var17.x24((double)var20.getX() + 0.5, (double)var20.getY() + 0.05, (double)var20.getZ() + 0.5, 0.0F, 0.0F);
            var1.xzq(var17);
            int var7 = 0;

            label133: {
               while (var7 < 120) {
                  try {
                     var1.zvy(
                        w_0.spy,
                        (double)var20.getX() + var1.fsy.nextDouble(),
                        (double)var20.getY() + var1.fsy.nextDouble() * 2.5,
                        (double)var20.getZ() + var1.fsy.nextDouble(),
                        0.0,
                        0.0,
                        0.0,
                        new int[0]
                     );
                     var7++;
                     if (var3 == 0) {
                        break label133;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (oov var13) {
                     throw a(var13);
                  }
               }

               var7 = 0;
            }

            while (var7 < this.ygz().sy_()) {
               d2q var8 = var4.pfb(0, var7, 0);

               try {
                  var1.cdo(var8.i4m(), ox_.ibw);
                  var7++;
                  if (var3 == 0) {
                     return;
                  }

                  if (var3 == 0) {
                     break;
                  }
               } catch (oov var14) {
                  throw a(var14);
               }
            }

            if (var3 != 0) {
               return;
            }
         }

         var10000 = var4 = this.oj2().clx(var1, var2);
      }

      if (var10000 != null) {
         int var18 = 0;

         while (var18 < this.oj2().k3i()) {
            int var21 = 0;

            label111: {
               while (var21 < this.oj2().sy_()) {
                  try {
                     var1.vct(var4.pfb(var18, var21, 0).i4m(), ox_.ibw.l4i(), 2);
                     var21++;
                     if (var3 == 0) {
                        break label111;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (oov var12) {
                     throw a(var12);
                  }
               }

               var18++;
            }

            if (var3 == 0) {
               break;
            }
         }

         mew var19 = var4.pfb(1, 2, 0).i4m();
         EntityIronGolem var22 = new EntityIronGolem(var1);
         var22.hq8(true);
         var22.x24((double)var19.getX() + 0.5, (double)var19.getY() + 0.05, (double)var19.getZ() + 0.5, 0.0F, 0.0F);
         var1.xzq(var22);
         int var23 = 0;

         label77: {
            while (var23 < 120) {
               try {
                  var1.zvy(
                     w_0.t6l,
                     (double)var19.getX() + var1.fsy.nextDouble(),
                     (double)var19.getY() + var1.fsy.nextDouble() * 3.9,
                     (double)var19.getZ() + var1.fsy.nextDouble(),
                     0.0,
                     0.0,
                     0.0,
                     new int[0]
                  );
                  var23++;
                  if (var3 == 0) {
                     break label77;
                  }

                  if (var3 == 0) {
                     break;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }
            }

            var23 = 0;
         }

         while (var23 < this.oj2().k3i()) {
            int var24 = 0;

            label93: {
               while (var24 < this.oj2().sy_()) {
                  d2q var9 = var4.pfb(var23, var24, 0);

                  try {
                     var1.cdo(var9.i4m(), ox_.ibw);
                     var24++;
                     if (var3 == 0) {
                        break label93;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }
               }

               var23++;
            }

            if (var3 == 0) {
               break;
            }
         }
      }
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: getfield e0x.kgd Lp3y;
      // 11: invokevirtual p3y.gt9 ()Z
      // 14: iload 3
      // 15: ifeq 31
      // 18: ifeq 43
      // 1b: goto 22
      // 1e: invokestatic pfc.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual mew.eve ()Lmew;
      // 27: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 2a: goto 31
      // 2d: invokestatic pfc.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 3
      // 32: ifeq 40
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic pfc.a (Loov;)Loov;
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(em9, var8.u0f().b4b());
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(em9, vt2.bm6(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((vt2)var1.dil(em9)).tmy();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{em9});
   }

   public r72 t6h() {
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
      // 05: getfield pfc.jn0 Lr72;
      // 08: iload 1
      // 09: ifne 52
      // 0c: ifnonnull 4e
      // 0f: goto 16
      // 12: invokestatic pfc.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic kv4._54 ()Lkv4;
      // 1a: bipush 3
      // 1b: anewarray 1
      // 1e: dup
      // 1f: bipush 0
      // 20: ldc " "
      // 22: nop
      // 23: aastore
      // 24: dup
      // 25: bipush 1
      // 26: ldc "#"
      // 28: nop
      // 29: aastore
      // 2a: dup
      // 2b: bipush 2
      // 2c: ldc "#"
      // 2e: nop
      // 2f: aastore
      // 30: invokevirtual kv4._gi ([Ljava/lang/String;)Lkv4;
      // 33: bipush 35
      // 35: getstatic ox_._mc Le0x;
      // 38: invokestatic o9a.utk (Le0x;)Lo9a;
      // 3b: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 3e: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 41: invokevirtual kv4.m7f ()Lr72;
      // 44: putfield pfc.jn0 Lr72;
      // 47: goto 4e
      // 4a: invokestatic pfc.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield pfc.jn0 Lr72;
      // 52: areturn
   }

   public r72 ygz() {
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
      // 05: getfield pfc.ha8 Lr72;
      // 08: iload 1
      // 09: ifne 5d
      // 0c: ifnonnull 59
      // 0f: goto 16
      // 12: invokestatic pfc.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic kv4._54 ()Lkv4;
      // 1a: bipush 3
      // 1b: anewarray 1
      // 1e: dup
      // 1f: bipush 0
      // 20: ldc "^"
      // 22: nop
      // 23: aastore
      // 24: dup
      // 25: bipush 1
      // 26: ldc "#"
      // 28: nop
      // 29: aastore
      // 2a: dup
      // 2b: bipush 2
      // 2c: ldc "#"
      // 2e: nop
      // 2f: aastore
      // 30: invokevirtual kv4._gi ([Ljava/lang/String;)Lkv4;
      // 33: bipush 94
      // 35: getstatic pfc.izu Lcom/google/common/base/Predicate;
      // 38: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 3b: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 3e: bipush 35
      // 40: getstatic ox_._mc Le0x;
      // 43: invokestatic o9a.utk (Le0x;)Lo9a;
      // 46: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 49: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 4c: invokevirtual kv4.m7f ()Lr72;
      // 4f: putfield pfc.ha8 Lr72;
      // 52: goto 59
      // 55: invokestatic pfc.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield pfc.ha8 Lr72;
      // 5d: areturn
   }

   public r72 _i9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pfc.b J
      // 03: ldc2_w 102155840585497
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield pfc.a9_ Lr72;
      // 10: iload 3
      // 11: ifeq 89
      // 14: ifnonnull 85
      // 17: goto 1e
      // 1a: invokestatic pfc.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokestatic kv4._54 ()Lkv4;
      // 22: bipush 3
      // 23: anewarray 1
      // 26: dup
      // 27: bipush 0
      // 28: sipush 22097
      // 2b: ldc2_w 6849665218472391462
      // 2e: lload 1
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=pfc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: aastore
      // 37: dup
      // 38: bipush 1
      // 39: sipush 21813
      // 3c: ldc2_w 5074911031338709057
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic b (IJ)Ljava/lang/String; bsm=pfc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: aastore
      // 48: dup
      // 49: bipush 2
      // 4a: sipush 18624
      // 4d: ldc2_w 5064651463405645237
      // 50: lload 1
      // 51: lxor
      // 52: invokedynamic b (IJ)Ljava/lang/String; bsm=pfc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: nop
      // 58: aastore
      // 59: invokevirtual kv4._gi ([Ljava/lang/String;)Lkv4;
      // 5c: bipush 35
      // 5e: getstatic ox_.rq4 Le0x;
      // 61: invokestatic o9a.utk (Le0x;)Lo9a;
      // 64: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 67: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 6a: bipush 126
      // 6c: getstatic ox_.ibw Le0x;
      // 6f: invokestatic o9a.utk (Le0x;)Lo9a;
      // 72: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 75: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 78: invokevirtual kv4.m7f ()Lr72;
      // 7b: putfield pfc.a9_ Lr72;
      // 7e: goto 85
      // 81: invokestatic pfc.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: getfield pfc.a9_ Lr72;
      // 89: areturn
   }

   public r72 oj2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pfc.b J
      // 03: ldc2_w 50207251310301
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield pfc.x6r Lr72;
      // 10: iload 3
      // 11: ifeq 94
      // 14: ifnonnull 90
      // 17: goto 1e
      // 1a: invokestatic pfc.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokestatic kv4._54 ()Lkv4;
      // 22: bipush 3
      // 23: anewarray 1
      // 26: dup
      // 27: bipush 0
      // 28: sipush 8419
      // 2b: ldc2_w 2484050986762378321
      // 2e: lload 1
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=pfc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: aastore
      // 37: dup
      // 38: bipush 1
      // 39: sipush 13210
      // 3c: ldc2_w 6729832773849091887
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic b (IJ)Ljava/lang/String; bsm=pfc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: aastore
      // 48: dup
      // 49: bipush 2
      // 4a: sipush 7602
      // 4d: ldc2_w 1979059258552066310
      // 50: lload 1
      // 51: lxor
      // 52: invokedynamic b (IJ)Ljava/lang/String; bsm=pfc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: nop
      // 58: aastore
      // 59: invokevirtual kv4._gi ([Ljava/lang/String;)Lkv4;
      // 5c: bipush 94
      // 5e: getstatic pfc.izu Lcom/google/common/base/Predicate;
      // 61: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 64: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 67: bipush 35
      // 69: getstatic ox_.rq4 Le0x;
      // 6c: invokestatic o9a.utk (Le0x;)Lo9a;
      // 6f: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 72: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 75: bipush 126
      // 77: getstatic ox_.ibw Le0x;
      // 7a: invokestatic o9a.utk (Le0x;)Lo9a;
      // 7d: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 80: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 83: invokevirtual kv4.m7f ()Lr72;
      // 86: putfield pfc.x6r Lr72;
      // 89: goto 90
      // 8c: invokestatic pfc.a (Loov;)Loov;
      // 8f: athrow
      // 90: aload 0
      // 91: getfield pfc.x6r Lr72;
      // 94: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4221189484810811649L, -6002085816051887974L, MethodHandles.lookup().lookupClass()).a(264001856528276L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 130952946950210L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = ")Ýn£\u0018\rÈÜ=6èÐ\bÏBN\u0010\u009fqC]ìl+}\u0019cïÉoÆ\u0080\u0016\u0010õ8\u0085\u001f\u0090ÿ\u0085p 4v\u00174Ú\u008f`\u0010¨ËÕ\r\u0088\rë8_ýÄ\u0017Ã)2\u0089";
      int var8 = ")Ýn£\u0018\rÈÜ=6èÐ\bÏBN\u0010\u009fqC]ìl+}\u0019cïÉoÆ\u0080\u0016\u0010õ8\u0085\u001f\u0090ÿ\u0085p 4v\u00174Ú\u008f`\u0010¨ËÕ\r\u0088\rë8_ýÄ\u0017Ã)2\u0089"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     h = new String[6];
                     izu = new pfc$1();
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

                  var6 = " ;©aj\u000e\u00ad\u009cÚ\u0016ò¶\u001d\u001apú\u0010ÆZF\u0095^ê¤5y\u007f\u008bägÛ\u0094=";
                  var8 = " ;©aj\u000e\u00ad\u009cÚ\u0016ò¶\u001d\u001apú\u0010ÆZF\u0095^ê¤5y\u007f\u008bägÛ\u0094=".length();
                  var5 = 16;
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

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8965;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("pfc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("pfc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
