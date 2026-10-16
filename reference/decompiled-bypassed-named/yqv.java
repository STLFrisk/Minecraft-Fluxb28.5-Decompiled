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
import net.optifine.reflect.Reflector;

public abstract class yqv extends Entity {
   public int _oz;
   public int dlk;
   private knw ctu;
   public bww i1n;
   public rr0 w6o;
   private ele d1c;
   public p8a f35;
   public final dak r1d;
   public final dak g9o;
   private Entity _nk;
   private d6l xls;
   private erg[] b8n;
   public float[] k92;
   private boolean vkj;
   private boolean qlb;
   private boolean tdx;
   private EntityLivingBase vu1;
   private bdo sum;
   private UUID o1p;
   private String iex;
   private static final long i;
   private static final String[] p;
   private static final String[] q;
   private static final Map r = new HashMap(13);

   public yqv(OpaquePredicate var1) {
      super(var1);
      int var10000 = OpaquePredicate.c();
      this.b8n = new erg[5];
      int var2 = var10000;

      dak var10001;
      dak var10002;
      uan var10003;
      label41: {
         label40: {
            try {
               this.k92 = new float[5];
               this.o1p = null;
               this.iex = null;
               var5 = this;
               var10001 = new dak;
               var10002 = var10001;
               if (var1 != null && var1.e8t != null) {
                  break label40;
               }
            } catch (oov var4) {
               throw g(var4);
            }

            var10003 = null;
            break label41;
         }

         var10003 = var1.e8t;
      }

      var10002./* $VF: Unable to resugar constructor */<init>(var10003);
      var5.r1d = var10001;
      this.g9o = new dak(var1 != null && var1.e8t != null ? var1.e8t : null);
      this.ctu = new knw(this);
      this.i1n = new bww(this);
      this.w6o = new rr0(this);
      this.d1c = new ele(this);
      this.f35 = this.ri_(var1);
      this.xls = new d6l(this);
      int var3 = 0;

      while (var3 < this.k92.length) {
         this.k92[var3] = 0.085F;
         var3++;
         if (var2 != 0) {
            break;
         }
      }
   }

   @Override
   public void nyy() {
      super.nyy();
      this.s_a().ylc(m6d.wg4).zf7(16.0);
   }

   public p8a ri_(OpaquePredicate var1) {
      return new zvv(this, var1);
   }

   public knw ph8() {
      return this.ctu;
   }

   public bww gvh() {
      return this.i1n;
   }

   public rr0 wzk() {
      return this.w6o;
   }

   public p8a zq2() {
      return this.f35;
   }

   public d6l dov() {
      return this.xls;
   }

   public Entity q4v() {
      return this._nk;
   }

   public void ux8(Entity var1) {
      this._nk = var1;
      Reflector.callVoid(Reflector.ForgeHooks_onLivingSetAttackTarget, new Object[]{this, var1});
   }

   public boolean toj(Class var1) {
      try {
         if (var1 != h_s.class) {
            return true;
         }
      } catch (oov var2) {
         throw g(var2);
      }

      return false;
   }

   public void jk2() {
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(15, (byte)0);
   }

   public int u8h() {
      return 80;
   }

   public void zi7() {
      String var1 = this._n1();

      try {
         if (var1 != null) {
            this.lhu(var1, this.o23(), this.b33());
         }
      } catch (oov var2) {
         throw g(var2);
      }
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
      // 00: getstatic yqv.i J
      // 03: ldc2_w 120988759058974
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: invokespecial Entity.mwr ()V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 0
      // 10: getfield yqv.oay Lt9d;
      // 13: getfield OpaquePredicate.e8t Luan;
      // 16: sipush 32718
      // 19: ldc2_w 8084411309662483390
      // 1c: lload 1
      // 1d: lxor
      // 1e: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: nop
      // 24: invokevirtual uan.qek (Ljava/lang/String;)V
      // 27: istore 3
      // 28: aload 0
      // 29: iload 3
      // 2a: ifeq 79
      // 2d: invokevirtual yqv.gzr ()Z
      // 30: ifeq 78
      // 33: goto 3a
      // 36: invokestatic yqv.g (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 3
      // 3c: ifeq 79
      // 3f: goto 46
      // 42: invokestatic yqv.g (Loov;)Loov;
      // 45: athrow
      // 46: getfield yqv.z2d Ljava/util/Random;
      // 49: sipush 1000
      // 4c: invokevirtual java/util/Random.nextInt (I)I
      // 4f: aload 0
      // 50: dup
      // 51: getfield yqv._oz I
      // 54: dup_x1
      // 55: bipush 1
      // 56: iadd
      // 57: putfield yqv._oz I
      // 5a: if_icmpge 78
      // 5d: goto 64
      // 60: invokestatic yqv.g (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: aload 0
      // 66: invokevirtual yqv.u8h ()I
      // 69: ineg
      // 6a: putfield yqv._oz I
      // 6d: aload 0
      // 6e: invokevirtual yqv.zi7 ()V
      // 71: goto 78
      // 74: invokestatic yqv.g (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: getfield yqv.oay Lt9d;
      // 7c: getfield OpaquePredicate.e8t Luan;
      // 7f: invokevirtual uan.uio ()V
      // 82: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield yqv.dlk I
      // 08: iload 2
      // 09: ifeq 73
      // 0c: ifle 6f
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield yqv.dlk I
      // 1a: istore 3
      // 1b: aload 0
      // 1c: invokevirtual yqv.n7a ()[Lerg;
      // 1f: astore 4
      // 21: bipush 0
      // 22: istore 5
      // 24: iload 5
      // 26: aload 4
      // 28: arraylength
      // 29: if_icmpge 6d
      // 2c: aload 4
      // 2e: iload 5
      // 30: aaload
      // 31: ifnull 66
      // 34: aload 0
      // 35: getfield yqv.k92 [F
      // 38: iload 5
      // 3a: faload
      // 3b: fconst_1
      // 3c: fcmpg
      // 3d: iload 2
      // 3e: ifeq 65
      // 41: goto 48
      // 44: invokestatic yqv.g (Loov;)Loov;
      // 47: athrow
      // 48: ifgt 66
      // 4b: goto 52
      // 4e: invokestatic yqv.g (Loov;)Loov;
      // 51: athrow
      // 52: iload 3
      // 53: bipush 1
      // 54: aload 0
      // 55: getfield yqv.z2d Ljava/util/Random;
      // 58: bipush 3
      // 59: invokevirtual java/util/Random.nextInt (I)I
      // 5c: iadd
      // 5d: iadd
      // 5e: goto 65
      // 61: invokestatic yqv.g (Loov;)Loov;
      // 64: athrow
      // 65: istore 3
      // 66: iinc 5 1
      // 69: iload 2
      // 6a: ifne 24
      // 6d: iload 3
      // 6e: ireturn
      // 6f: aload 0
      // 70: getfield yqv.dlk I
      // 73: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void guo() {
      int var1 = OpaquePredicate.b();

      OpaquePredicate var10000;
      label63: {
         label57: {
            try {
               var10000 = this.oay;
               if (var1 == 0) {
                  break label63;
               }

               if (!this.oay.v0f) {
                  break label57;
               }
            } catch (oov var13) {
               throw g(var13);
            }

            int var2 = 0;

            while (true) {
               if (var2 < 20) {
                  double var3 = this.z2d.nextGaussian() * 0.02;
                  double var5 = this.z2d.nextGaussian() * 0.02;
                  double var7 = this.z2d.nextGaussian() * 0.02;
                  double var9 = 10.0;

                  try {
                     this.oay
                        .zvy(
                           w_0.aiv,
                           this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6 - var3 * var9,
                           this.kfp + (double)(this.z2d.nextFloat() * this.ikl) - var5 * var9,
                           this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6 - var7 * var9,
                           var3,
                           var5,
                           var7,
                           new int[0]
                        );
                     var2++;
                     if (var1 == 0) {
                        return;
                     }

                     if (var1 != 0) {
                        continue;
                     }
                  } catch (oov var14) {
                     throw g(var14);
                  }
               }

               try {
                  if (var1 != 0) {
                     return;
                  }
                  break;
               } catch (oov var12) {
                  boolean var10001 = false;
                  throw g(var12);
               }
            }
         }

         try {
            var10000 = this.oay;
         } catch (oov var11) {
            boolean var16 = false;
            throw g(var11);
         }
      }

      var10000.qyn(this, (byte)20);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 20
      // 07: if_icmpne 19
      // 0a: aload 0
      // 0b: invokevirtual yqv.guo ()V
      // 0e: iload 2
      // 0f: ifeq 25
      // 12: goto 19
      // 15: invokestatic yqv.g (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: invokespecial Entity.ptf (B)V
      // 1e: goto 25
      // 21: invokestatic yqv.g (Loov;)Loov;
      // 24: athrow
      // 25: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic hxt.nib ()Z
      // 07: iload 1
      // 08: ifeq 5a
      // 0b: ifeq 3d
      // 0e: goto 15
      // 11: invokestatic yqv.g (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: invokespecial yqv.u36 ()Z
      // 19: iload 1
      // 1a: ifeq 5a
      // 1d: goto 24
      // 20: invokestatic yqv.g (Loov;)Loov;
      // 23: athrow
      // 24: ifeq 3d
      // 27: goto 2e
      // 2a: invokestatic yqv.g (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokespecial yqv.z_s ()V
      // 32: iload 1
      // 33: ifne 61
      // 36: goto 3d
      // 39: invokestatic yqv.g (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokespecial Entity.xx_ ()V
      // 41: aload 0
      // 42: iload 1
      // 43: ifeq 5e
      // 46: goto 4d
      // 49: invokestatic yqv.g (Loov;)Loov;
      // 4c: athrow
      // 4d: getfield yqv.oay Lt9d;
      // 50: getfield OpaquePredicate.v0f Z
      // 53: goto 5a
      // 56: invokestatic yqv.g (Loov;)Loov;
      // 59: athrow
      // 5a: ifne 61
      // 5d: aload 0
      // 5e: invokevirtual yqv.r7q ()V
      // 61: return
   }

   @Override
   public float _j7(float var1, float var2) {
      this.d1c.sui();
      return var2;
   }

   public String _n1() {
      return null;
   }

   public u7m q4n() {
      return null;
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var3 = OpaquePredicate.c();
      u7m var4 = this.q4n();
      if (var4 != null) {
         int var5 = this.z2d.nextInt(3);

         int var10000;
         label31: {
            label30: {
               try {
                  var10000 = var2;
                  if (var3 != 0) {
                     break label31;
                  }

                  if (var2 <= 0) {
                     break label30;
                  }
               } catch (oov var7) {
                  throw g(var7);
               }

               var5 += this.z2d.nextInt(var2 + 1);
            }

            var10000 = 0;
         }

         int var6 = var10000;

         while (var6 < var5) {
            this.e70(var4, 1);
            var6++;
            if (var3 != 0) {
               break;
            }
         }
      }
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
      // 000: getstatic yqv.i J
      // 003: ldc2_w 18679468239945
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial Entity.srs (Lbdo;)V
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: aload 1
      // 011: sipush 26746
      // 014: ldc2_w 8058408224445489759
      // 017: lload 2
      // 018: lxor
      // 019: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: nop
      // 01f: aload 0
      // 020: invokevirtual yqv.zrj ()Z
      // 023: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 026: aload 1
      // 027: sipush 31015
      // 02a: ldc2_w 183620418335517
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: nop
      // 035: aload 0
      // 036: getfield yqv.qlb Z
      // 039: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 03c: new qhg
      // 03f: dup
      // 040: invokespecial qhg.<init> ()V
      // 043: astore 5
      // 045: istore 4
      // 047: bipush 0
      // 048: istore 6
      // 04a: iload 6
      // 04c: aload 0
      // 04d: getfield yqv.b8n [Lerg;
      // 050: arraylength
      // 051: if_icmpge 0a2
      // 054: new bdo
      // 057: dup
      // 058: invokespecial bdo.<init> ()V
      // 05b: astore 7
      // 05d: iload 4
      // 05f: ifeq 0b6
      // 062: iload 4
      // 064: ifeq 09d
      // 067: goto 06e
      // 06a: invokestatic yqv.g (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield yqv.b8n [Lerg;
      // 072: iload 6
      // 074: aaload
      // 075: ifnull 093
      // 078: goto 07f
      // 07b: invokestatic yqv.g (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield yqv.b8n [Lerg;
      // 083: iload 6
      // 085: aaload
      // 086: aload 7
      // 088: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 08b: pop
      // 08c: goto 093
      // 08f: invokestatic yqv.g (Loov;)Loov;
      // 092: athrow
      // 093: aload 5
      // 095: aload 7
      // 097: invokevirtual qhg.w2j (Lgdw;)V
      // 09a: iinc 6 1
      // 09d: iload 4
      // 09f: ifne 04a
      // 0a2: aload 1
      // 0a3: sipush 8785
      // 0a6: ldc2_w 1007402800360925309
      // 0a9: lload 2
      // 0aa: lxor
      // 0ab: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: nop
      // 0b1: aload 5
      // 0b3: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 0b6: new qhg
      // 0b9: dup
      // 0ba: invokespecial qhg.<init> ()V
      // 0bd: astore 6
      // 0bf: bipush 0
      // 0c0: istore 7
      // 0c2: iload 7
      // 0c4: aload 0
      // 0c5: getfield yqv.k92 [F
      // 0c8: arraylength
      // 0c9: if_icmpge 0f3
      // 0cc: aload 6
      // 0ce: new n8i
      // 0d1: dup
      // 0d2: aload 0
      // 0d3: getfield yqv.k92 [F
      // 0d6: iload 7
      // 0d8: faload
      // 0d9: invokespecial n8i.<init> (F)V
      // 0dc: invokevirtual qhg.w2j (Lgdw;)V
      // 0df: iinc 7 1
      // 0e2: iload 4
      // 0e4: ifeq 11d
      // 0e7: iload 4
      // 0e9: ifne 0c2
      // 0ec: goto 0f3
      // 0ef: invokestatic yqv.g (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: sipush 30202
      // 0f7: ldc2_w 7683419009109295058
      // 0fa: lload 2
      // 0fb: lxor
      // 0fc: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: aload 6
      // 104: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 107: aload 1
      // 108: sipush 4199
      // 10b: ldc2_w 6556442530605832782
      // 10e: lload 2
      // 10f: lxor
      // 110: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: nop
      // 116: aload 0
      // 117: getfield yqv.tdx Z
      // 11a: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 11d: aload 0
      // 11e: iload 4
      // 120: ifeq 201
      // 123: getfield yqv.vu1 Li2h;
      // 126: ifnull 200
      // 129: goto 130
      // 12c: invokestatic yqv.g (Loov;)Loov;
      // 12f: athrow
      // 130: new bdo
      // 133: dup
      // 134: invokespecial bdo.<init> ()V
      // 137: astore 7
      // 139: aload 0
      // 13a: getfield yqv.vu1 Li2h;
      // 13d: instanceof Entity
      // 140: iload 4
      // 142: ifeq 1af
      // 145: ifeq 195
      // 148: goto 14f
      // 14b: invokestatic yqv.g (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 7
      // 151: sipush 6647
      // 154: ldc2_w 5386676000105403356
      // 157: lload 2
      // 158: lxor
      // 159: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: nop
      // 15f: aload 0
      // 160: getfield yqv.vu1 Li2h;
      // 163: invokevirtual EntityLivingBase.b_q ()Ljava/util/UUID;
      // 166: invokevirtual java/util/UUID.getMostSignificantBits ()J
      // 169: invokevirtual bdo.xw9 (Ljava/lang/String;J)V
      // 16c: aload 7
      // 16e: sipush 23068
      // 171: ldc2_w 7758942740295569455
      // 174: lload 2
      // 175: lxor
      // 176: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: nop
      // 17c: aload 0
      // 17d: getfield yqv.vu1 Li2h;
      // 180: invokevirtual EntityLivingBase.b_q ()Ljava/util/UUID;
      // 183: invokevirtual java/util/UUID.getLeastSignificantBits ()J
      // 186: invokevirtual bdo.xw9 (Ljava/lang/String;J)V
      // 189: iload 4
      // 18b: ifne 1ec
      // 18e: goto 195
      // 191: invokestatic yqv.g (Loov;)Loov;
      // 194: athrow
      // 195: aload 0
      // 196: getfield yqv.vu1 Li2h;
      // 199: iload 4
      // 19b: ifeq 1bd
      // 19e: goto 1a5
      // 1a1: invokestatic yqv.g (Loov;)Loov;
      // 1a4: athrow
      // 1a5: instanceof rdv
      // 1a8: goto 1af
      // 1ab: invokestatic yqv.g (Loov;)Loov;
      // 1ae: athrow
      // 1af: ifeq 1ec
      // 1b2: aload 0
      // 1b3: getfield yqv.vu1 Li2h;
      // 1b6: goto 1bd
      // 1b9: invokestatic yqv.g (Loov;)Loov;
      // 1bc: athrow
      // 1bd: checkcast rdv
      // 1c0: invokevirtual rdv.liv ()Lmew;
      // 1c3: astore 8
      // 1c5: aload 7
      // 1c7: ldc "X"
      // 1c9: nop
      // 1ca: aload 8
      // 1cc: invokevirtual mew.getX ()I
      // 1cf: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1d2: aload 7
      // 1d4: ldc "Y"
      // 1d6: nop
      // 1d7: aload 8
      // 1d9: invokevirtual mew.getY ()I
      // 1dc: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1df: aload 7
      // 1e1: ldc "Z"
      // 1e3: nop
      // 1e4: aload 8
      // 1e6: invokevirtual mew.getZ ()I
      // 1e9: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 1ec: aload 1
      // 1ed: sipush 15151
      // 1f0: ldc2_w 5098125211129655582
      // 1f3: lload 2
      // 1f4: lxor
      // 1f5: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: nop
      // 1fb: aload 7
      // 1fd: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 200: aload 0
      // 201: invokevirtual yqv.r1t ()Z
      // 204: ifeq 224
      // 207: aload 1
      // 208: sipush 29562
      // 20b: ldc2_w 3688840511612975444
      // 20e: lload 2
      // 20f: lxor
      // 210: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: nop
      // 216: aload 0
      // 217: invokevirtual yqv.r1t ()Z
      // 21a: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 21d: goto 224
      // 220: invokestatic yqv.g (Loov;)Loov;
      // 223: athrow
      // 224: return
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
      // 000: getstatic yqv.i J
      // 003: ldc2_w 112508317647074
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: aload 1
      // 00f: invokespecial Entity.cjb (Lbdo;)V
      // 012: aload 1
      // 013: sipush 13485
      // 016: ldc2_w 4311571680922194494
      // 019: lload 2
      // 01a: lxor
      // 01b: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: bipush 1
      // 022: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 025: iload 4
      // 027: ifne 07b
      // 02a: ifeq 051
      // 02d: goto 034
      // 030: invokestatic yqv.g (Loov;)Loov;
      // 033: athrow
      // 034: aload 0
      // 035: aload 1
      // 036: sipush 13485
      // 039: ldc2_w 4311571680922194494
      // 03c: lload 2
      // 03d: lxor
      // 03e: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: nop
      // 044: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 047: invokevirtual yqv.onk (Z)V
      // 04a: goto 051
      // 04d: invokestatic yqv.g (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: aload 1
      // 053: sipush 25151
      // 056: ldc2_w 4570287475073385662
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 064: putfield yqv.qlb Z
      // 067: aload 1
      // 068: sipush 1091
      // 06b: ldc2_w 647647596291220190
      // 06e: lload 2
      // 06f: lxor
      // 070: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: nop
      // 076: bipush 9
      // 078: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 07b: iload 4
      // 07d: ifne 0e6
      // 080: ifeq 0d2
      // 083: goto 08a
      // 086: invokestatic yqv.g (Loov;)Loov;
      // 089: athrow
      // 08a: aload 1
      // 08b: sipush 1091
      // 08e: ldc2_w 647647596291220190
      // 091: lload 2
      // 092: lxor
      // 093: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: nop
      // 099: bipush 10
      // 09b: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 09e: astore 5
      // 0a0: bipush 0
      // 0a1: istore 6
      // 0a3: iload 6
      // 0a5: aload 0
      // 0a6: getfield yqv.b8n [Lerg;
      // 0a9: arraylength
      // 0aa: if_icmpge 0d2
      // 0ad: aload 0
      // 0ae: getfield yqv.b8n [Lerg;
      // 0b1: iload 6
      // 0b3: aload 5
      // 0b5: iload 6
      // 0b7: invokevirtual qhg.kd6 (I)Lbdo;
      // 0ba: invokestatic erg.qog (Lbdo;)Lerg;
      // 0bd: aastore
      // 0be: iinc 6 1
      // 0c1: iload 4
      // 0c3: ifne 14f
      // 0c6: iload 4
      // 0c8: ifeq 0a3
      // 0cb: goto 0d2
      // 0ce: invokestatic yqv.g (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: sipush 4833
      // 0d6: ldc2_w 6874622254515844199
      // 0d9: lload 2
      // 0da: lxor
      // 0db: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: bipush 9
      // 0e3: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0e6: iload 4
      // 0e8: ifne 15f
      // 0eb: ifeq 139
      // 0ee: goto 0f5
      // 0f1: invokestatic yqv.g (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 1
      // 0f6: sipush 4833
      // 0f9: ldc2_w 6874622254515844199
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: bipush 5
      // 105: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 108: astore 5
      // 10a: bipush 0
      // 10b: istore 6
      // 10d: iload 6
      // 10f: aload 5
      // 111: invokevirtual qhg.vek ()I
      // 114: if_icmpge 139
      // 117: aload 0
      // 118: getfield yqv.k92 [F
      // 11b: iload 6
      // 11d: aload 5
      // 11f: iload 6
      // 121: invokevirtual qhg.ofd (I)F
      // 124: fastore
      // 125: iinc 6 1
      // 128: iload 4
      // 12a: ifne 14f
      // 12d: iload 4
      // 12f: ifeq 10d
      // 132: goto 139
      // 135: invokestatic yqv.g (Loov;)Loov;
      // 138: athrow
      // 139: aload 0
      // 13a: aload 1
      // 13b: sipush 23781
      // 13e: ldc2_w 7975012421730384503
      // 141: lload 2
      // 142: lxor
      // 143: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: nop
      // 149: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 14c: putfield yqv.tdx Z
      // 14f: aload 0
      // 150: iload 4
      // 152: ifne 19e
      // 155: getfield yqv.tdx Z
      // 158: goto 15f
      // 15b: invokestatic yqv.g (Loov;)Loov;
      // 15e: athrow
      // 15f: ifeq 19d
      // 162: aload 1
      // 163: sipush 5695
      // 166: ldc2_w 1264880926714261685
      // 169: lload 2
      // 16a: lxor
      // 16b: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: nop
      // 171: bipush 10
      // 173: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 176: ifeq 19d
      // 179: goto 180
      // 17c: invokestatic yqv.g (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: aload 1
      // 182: sipush 5695
      // 185: ldc2_w 1264880926714261685
      // 188: lload 2
      // 189: lxor
      // 18a: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: nop
      // 190: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 193: putfield yqv.sum Lbdo;
      // 196: goto 19d
      // 199: invokestatic yqv.g (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 0
      // 19e: aload 1
      // 19f: sipush 21334
      // 1a2: ldc2_w 3119320980927854041
      // 1a5: lload 2
      // 1a6: lxor
      // 1a7: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: nop
      // 1ad: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 1b0: invokevirtual yqv.x53 (Z)V
      // 1b3: return
   }

   public void x50(float var1) {
      this.ooc = var1;
   }

   @Override
   public void nak(float var1) {
      super.nak(var1);
      this.x50(var1);
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
      // 000: getstatic yqv.i J
      // 003: ldc2_w 140598096048336
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokespecial Entity.e_a ()V
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: aload 0
      // 010: getfield yqv.oay Lt9d;
      // 013: getfield OpaquePredicate.e8t Luan;
      // 016: sipush 3677
      // 019: ldc2_w 1922122414703155448
      // 01c: lload 1
      // 01d: lxor
      // 01e: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: invokevirtual uan.qek (Ljava/lang/String;)V
      // 027: istore 3
      // 028: aload 0
      // 029: getfield yqv.oay Lt9d;
      // 02c: iload 3
      // 02d: ifne 129
      // 030: getfield OpaquePredicate.v0f Z
      // 033: ifne 125
      // 036: goto 03d
      // 039: invokestatic yqv.g (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: iload 3
      // 03f: ifne 126
      // 042: goto 049
      // 045: invokestatic yqv.g (Loov;)Loov;
      // 048: athrow
      // 049: invokevirtual yqv.zrj ()Z
      // 04c: ifeq 125
      // 04f: goto 056
      // 052: invokestatic yqv.g (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: iload 3
      // 058: ifne 126
      // 05b: goto 062
      // 05e: invokestatic yqv.g (Loov;)Loov;
      // 061: athrow
      // 062: getfield yqv.pv7 Z
      // 065: ifne 125
      // 068: goto 06f
      // 06b: invokestatic yqv.g (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield yqv.oay Lt9d;
      // 073: iload 3
      // 074: ifne 129
      // 077: goto 07e
      // 07a: invokestatic yqv.g (Loov;)Loov;
      // 07d: athrow
      // 07e: invokevirtual OpaquePredicate.eir ()Lef9;
      // 081: sipush 21625
      // 084: ldc2_w 8690683656804156125
      // 087: lload 1
      // 088: lxor
      // 089: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: nop
      // 08f: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 092: ifeq 125
      // 095: goto 09c
      // 098: invokestatic yqv.g (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield yqv.oay Lt9d;
      // 0a0: ldc nvf
      // 0a2: nop
      // 0a3: aload 0
      // 0a4: invokevirtual yqv.aaw ()Lnh4;
      // 0a7: dconst_1
      // 0a8: dconst_0
      // 0a9: dconst_1
      // 0aa: invokevirtual nh4.c2h (DDD)Lnh4;
      // 0ad: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 0b0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b5: astore 4
      // 0b7: aload 4
      // 0b9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0be: ifeq 125
      // 0c1: aload 4
      // 0c3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c8: checkcast nvf
      // 0cb: astore 5
      // 0cd: iload 3
      // 0ce: ifne 12f
      // 0d1: aload 5
      // 0d3: iload 3
      // 0d4: ifne 0f4
      // 0d7: goto 0de
      // 0da: invokestatic yqv.g (Loov;)Loov;
      // 0dd: athrow
      // 0de: getfield nvf.ma9 Z
      // 0e1: ifne 121
      // 0e4: goto 0eb
      // 0e7: invokestatic yqv.g (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 5
      // 0ed: goto 0f4
      // 0f0: invokestatic yqv.g (Loov;)Loov;
      // 0f3: athrow
      // 0f4: iload 3
      // 0f5: ifne 10e
      // 0f8: invokevirtual nvf.s7f ()Lerg;
      // 0fb: ifnull 121
      // 0fe: goto 105
      // 101: invokestatic yqv.g (Loov;)Loov;
      // 104: athrow
      // 105: aload 5
      // 107: goto 10e
      // 10a: invokestatic yqv.g (Loov;)Loov;
      // 10d: athrow
      // 10e: invokevirtual nvf.yz5 ()Z
      // 111: ifne 121
      // 114: aload 0
      // 115: aload 5
      // 117: invokevirtual yqv.fij (Lnvf;)V
      // 11a: goto 121
      // 11d: invokestatic yqv.g (Loov;)Loov;
      // 120: athrow
      // 121: iload 3
      // 122: ifeq 0b7
      // 125: aload 0
      // 126: getfield yqv.oay Lt9d;
      // 129: getfield OpaquePredicate.e8t Luan;
      // 12c: invokevirtual uan.uio ()V
      // 12f: return
   }

   public void fij(nvf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual nvf.s7f ()Lerg;
      // 004: astore 3
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: aload 3
      // 009: invokestatic yqv.vu5 (Lerg;)I
      // 00c: istore 4
      // 00e: istore 2
      // 00f: iload 4
      // 011: iload 2
      // 012: ifne 028
      // 015: bipush -1
      // 016: if_icmple 414
      // 019: goto 020
      // 01c: invokestatic yqv.g (Loov;)Loov;
      // 01f: athrow
      // 020: bipush 1
      // 021: goto 028
      // 024: invokestatic yqv.g (Loov;)Loov;
      // 027: athrow
      // 028: istore 5
      // 02a: aload 0
      // 02b: iload 4
      // 02d: invokevirtual yqv.rnq (I)Lerg;
      // 030: astore 6
      // 032: aload 6
      // 034: ifnull 33a
      // 037: iload 4
      // 039: iload 2
      // 03a: ifne 20d
      // 03d: goto 044
      // 040: invokestatic yqv.g (Loov;)Loov;
      // 043: athrow
      // 044: ifne 1ff
      // 047: goto 04e
      // 04a: invokestatic yqv.g (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 3
      // 04f: invokevirtual erg.gn1 ()Lu7m;
      // 052: instanceof za6
      // 055: iload 2
      // 056: ifne 09c
      // 059: goto 060
      // 05c: invokestatic yqv.g (Loov;)Loov;
      // 05f: athrow
      // 060: ifeq 08e
      // 063: goto 06a
      // 066: invokestatic yqv.g (Loov;)Loov;
      // 069: athrow
      // 06a: aload 6
      // 06c: invokevirtual erg.gn1 ()Lu7m;
      // 06f: instanceof za6
      // 072: iload 2
      // 073: ifne 09c
      // 076: goto 07d
      // 079: invokestatic yqv.g (Loov;)Loov;
      // 07c: athrow
      // 07d: ifne 08e
      // 080: goto 087
      // 083: invokestatic yqv.g (Loov;)Loov;
      // 086: athrow
      // 087: bipush 1
      // 088: istore 5
      // 08a: iload 2
      // 08b: ifeq 33a
      // 08e: aload 3
      // 08f: invokevirtual erg.gn1 ()Lu7m;
      // 092: instanceof za6
      // 095: goto 09c
      // 098: invokestatic yqv.g (Loov;)Loov;
      // 09b: athrow
      // 09c: iload 2
      // 09d: ifne 188
      // 0a0: ifeq 17a
      // 0a3: goto 0aa
      // 0a6: invokestatic yqv.g (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 6
      // 0ac: invokevirtual erg.gn1 ()Lu7m;
      // 0af: instanceof za6
      // 0b2: iload 2
      // 0b3: ifne 188
      // 0b6: goto 0bd
      // 0b9: invokestatic yqv.g (Loov;)Loov;
      // 0bc: athrow
      // 0bd: ifeq 17a
      // 0c0: goto 0c7
      // 0c3: invokestatic yqv.g (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 3
      // 0c8: invokevirtual erg.gn1 ()Lu7m;
      // 0cb: checkcast za6
      // 0ce: astore 7
      // 0d0: aload 6
      // 0d2: invokevirtual erg.gn1 ()Lu7m;
      // 0d5: checkcast za6
      // 0d8: astore 8
      // 0da: aload 7
      // 0dc: invokevirtual za6.ngv ()F
      // 0df: aload 8
      // 0e1: invokevirtual za6.ngv ()F
      // 0e4: fcmpl
      // 0e5: iload 2
      // 0e6: ifne 129
      // 0e9: ifeq 11e
      // 0ec: goto 0f3
      // 0ef: invokestatic yqv.g (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 7
      // 0f5: invokevirtual za6.ngv ()F
      // 0f8: aload 8
      // 0fa: invokevirtual za6.ngv ()F
      // 0fd: fcmpl
      // 0fe: iload 2
      // 0ff: ifne 114
      // 102: goto 109
      // 105: invokestatic yqv.g (Loov;)Loov;
      // 108: athrow
      // 109: ifle 117
      // 10c: goto 113
      // 10f: invokestatic yqv.g (Loov;)Loov;
      // 112: athrow
      // 113: bipush 1
      // 114: goto 118
      // 117: bipush 0
      // 118: istore 5
      // 11a: iload 2
      // 11b: ifeq 176
      // 11e: aload 3
      // 11f: invokevirtual erg.j6_ ()I
      // 122: goto 129
      // 125: invokestatic yqv.g (Loov;)Loov;
      // 128: athrow
      // 129: iload 2
      // 12a: ifne 170
      // 12d: aload 6
      // 12f: invokevirtual erg.j6_ ()I
      // 132: if_icmpgt 16f
      // 135: goto 13c
      // 138: invokestatic yqv.g (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 3
      // 13d: invokevirtual erg.w8b ()Z
      // 140: iload 2
      // 141: ifne 161
      // 144: goto 14b
      // 147: invokestatic yqv.g (Loov;)Loov;
      // 14a: athrow
      // 14b: ifeq 173
      // 14e: goto 155
      // 151: invokestatic yqv.g (Loov;)Loov;
      // 154: athrow
      // 155: aload 6
      // 157: invokevirtual erg.w8b ()Z
      // 15a: goto 161
      // 15d: invokestatic yqv.g (Loov;)Loov;
      // 160: athrow
      // 161: iload 2
      // 162: ifne 170
      // 165: ifne 173
      // 168: goto 16f
      // 16b: invokestatic yqv.g (Loov;)Loov;
      // 16e: athrow
      // 16f: bipush 1
      // 170: goto 174
      // 173: bipush 0
      // 174: istore 5
      // 176: iload 2
      // 177: ifeq 33a
      // 17a: aload 3
      // 17b: invokevirtual erg.gn1 ()Lu7m;
      // 17e: instanceof r5m
      // 181: goto 188
      // 184: invokestatic yqv.g (Loov;)Loov;
      // 187: athrow
      // 188: iload 2
      // 189: ifne 1f9
      // 18c: ifeq 1f1
      // 18f: goto 196
      // 192: invokestatic yqv.g (Loov;)Loov;
      // 195: athrow
      // 196: aload 6
      // 198: invokevirtual erg.gn1 ()Lu7m;
      // 19b: instanceof r5m
      // 19e: iload 2
      // 19f: ifne 1f9
      // 1a2: goto 1a9
      // 1a5: invokestatic yqv.g (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ifeq 1f1
      // 1ac: goto 1b3
      // 1af: invokestatic yqv.g (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 3
      // 1b4: invokevirtual erg.w8b ()Z
      // 1b7: iload 2
      // 1b8: ifne 1d8
      // 1bb: goto 1c2
      // 1be: invokestatic yqv.g (Loov;)Loov;
      // 1c1: athrow
      // 1c2: ifeq 1ea
      // 1c5: goto 1cc
      // 1c8: invokestatic yqv.g (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 6
      // 1ce: invokevirtual erg.w8b ()Z
      // 1d1: goto 1d8
      // 1d4: invokestatic yqv.g (Loov;)Loov;
      // 1d7: athrow
      // 1d8: iload 2
      // 1d9: ifne 1e7
      // 1dc: ifne 1ea
      // 1df: goto 1e6
      // 1e2: invokestatic yqv.g (Loov;)Loov;
      // 1e5: athrow
      // 1e6: bipush 1
      // 1e7: goto 1eb
      // 1ea: bipush 0
      // 1eb: istore 5
      // 1ed: iload 2
      // 1ee: ifeq 33a
      // 1f1: bipush 0
      // 1f2: goto 1f9
      // 1f5: invokestatic yqv.g (Loov;)Loov;
      // 1f8: athrow
      // 1f9: istore 5
      // 1fb: iload 2
      // 1fc: ifeq 33a
      // 1ff: aload 3
      // 200: invokevirtual erg.gn1 ()Lu7m;
      // 203: instanceof jpt
      // 206: goto 20d
      // 209: invokestatic yqv.g (Loov;)Loov;
      // 20c: athrow
      // 20d: iload 2
      // 20e: ifne 24d
      // 211: ifeq 23f
      // 214: goto 21b
      // 217: invokestatic yqv.g (Loov;)Loov;
      // 21a: athrow
      // 21b: aload 6
      // 21d: invokevirtual erg.gn1 ()Lu7m;
      // 220: instanceof jpt
      // 223: iload 2
      // 224: ifne 24d
      // 227: goto 22e
      // 22a: invokestatic yqv.g (Loov;)Loov;
      // 22d: athrow
      // 22e: ifne 23f
      // 231: goto 238
      // 234: invokestatic yqv.g (Loov;)Loov;
      // 237: athrow
      // 238: bipush 1
      // 239: istore 5
      // 23b: iload 2
      // 23c: ifeq 33a
      // 23f: aload 3
      // 240: invokevirtual erg.gn1 ()Lu7m;
      // 243: instanceof jpt
      // 246: goto 24d
      // 249: invokestatic yqv.g (Loov;)Loov;
      // 24c: athrow
      // 24d: iload 2
      // 24e: ifne 338
      // 251: ifeq 330
      // 254: goto 25b
      // 257: invokestatic yqv.g (Loov;)Loov;
      // 25a: athrow
      // 25b: aload 6
      // 25d: invokevirtual erg.gn1 ()Lu7m;
      // 260: instanceof jpt
      // 263: iload 2
      // 264: ifne 338
      // 267: goto 26e
      // 26a: invokestatic yqv.g (Loov;)Loov;
      // 26d: athrow
      // 26e: ifeq 330
      // 271: goto 278
      // 274: invokestatic yqv.g (Loov;)Loov;
      // 277: athrow
      // 278: aload 3
      // 279: invokevirtual erg.gn1 ()Lu7m;
      // 27c: checkcast jpt
      // 27f: astore 7
      // 281: aload 6
      // 283: invokevirtual erg.gn1 ()Lu7m;
      // 286: checkcast jpt
      // 289: astore 8
      // 28b: aload 7
      // 28d: getfield jpt._wl I
      // 290: aload 8
      // 292: getfield jpt._wl I
      // 295: iload 2
      // 296: ifne 2ef
      // 299: if_icmpeq 2d4
      // 29c: goto 2a3
      // 29f: invokestatic yqv.g (Loov;)Loov;
      // 2a2: athrow
      // 2a3: aload 7
      // 2a5: getfield jpt._wl I
      // 2a8: iload 2
      // 2a9: ifne 2ca
      // 2ac: goto 2b3
      // 2af: invokestatic yqv.g (Loov;)Loov;
      // 2b2: athrow
      // 2b3: aload 8
      // 2b5: getfield jpt._wl I
      // 2b8: if_icmple 2cd
      // 2bb: goto 2c2
      // 2be: invokestatic yqv.g (Loov;)Loov;
      // 2c1: athrow
      // 2c2: bipush 1
      // 2c3: goto 2ca
      // 2c6: invokestatic yqv.g (Loov;)Loov;
      // 2c9: athrow
      // 2ca: goto 2ce
      // 2cd: bipush 0
      // 2ce: istore 5
      // 2d0: iload 2
      // 2d1: ifeq 32c
      // 2d4: aload 3
      // 2d5: invokevirtual erg.j6_ ()I
      // 2d8: iload 2
      // 2d9: ifne 326
      // 2dc: goto 2e3
      // 2df: invokestatic yqv.g (Loov;)Loov;
      // 2e2: athrow
      // 2e3: aload 6
      // 2e5: invokevirtual erg.j6_ ()I
      // 2e8: goto 2ef
      // 2eb: invokestatic yqv.g (Loov;)Loov;
      // 2ee: athrow
      // 2ef: if_icmpgt 325
      // 2f2: aload 3
      // 2f3: invokevirtual erg.w8b ()Z
      // 2f6: iload 2
      // 2f7: ifne 317
      // 2fa: goto 301
      // 2fd: invokestatic yqv.g (Loov;)Loov;
      // 300: athrow
      // 301: ifeq 329
      // 304: goto 30b
      // 307: invokestatic yqv.g (Loov;)Loov;
      // 30a: athrow
      // 30b: aload 6
      // 30d: invokevirtual erg.w8b ()Z
      // 310: goto 317
      // 313: invokestatic yqv.g (Loov;)Loov;
      // 316: athrow
      // 317: iload 2
      // 318: ifne 326
      // 31b: ifne 329
      // 31e: goto 325
      // 321: invokestatic yqv.g (Loov;)Loov;
      // 324: athrow
      // 325: bipush 1
      // 326: goto 32a
      // 329: bipush 0
      // 32a: istore 5
      // 32c: iload 2
      // 32d: ifeq 33a
      // 330: bipush 0
      // 331: goto 338
      // 334: invokestatic yqv.g (Loov;)Loov;
      // 337: athrow
      // 338: istore 5
      // 33a: iload 5
      // 33c: iload 2
      // 33d: ifne 356
      // 340: ifeq 414
      // 343: goto 34a
      // 346: invokestatic yqv.g (Loov;)Loov;
      // 349: athrow
      // 34a: aload 0
      // 34b: aload 3
      // 34c: invokevirtual yqv.a5l (Lerg;)Z
      // 34f: goto 356
      // 352: invokestatic yqv.g (Loov;)Loov;
      // 355: athrow
      // 356: ifeq 414
      // 359: aload 6
      // 35b: iload 2
      // 35c: ifne 3a8
      // 35f: goto 366
      // 362: invokestatic yqv.g (Loov;)Loov;
      // 365: athrow
      // 366: ifnull 3a7
      // 369: goto 370
      // 36c: invokestatic yqv.g (Loov;)Loov;
      // 36f: athrow
      // 370: aload 0
      // 371: iload 2
      // 372: ifne 3a0
      // 375: goto 37c
      // 378: invokestatic yqv.g (Loov;)Loov;
      // 37b: athrow
      // 37c: getfield yqv.z2d Ljava/util/Random;
      // 37f: invokevirtual java/util/Random.nextFloat ()F
      // 382: ldc 0.1
      // 384: nop
      // 385: fsub
      // 386: aload 0
      // 387: getfield yqv.k92 [F
      // 38a: iload 4
      // 38c: faload
      // 38d: fcmpg
      // 38e: ifge 3a7
      // 391: goto 398
      // 394: invokestatic yqv.g (Loov;)Loov;
      // 397: athrow
      // 398: aload 0
      // 399: goto 3a0
      // 39c: invokestatic yqv.g (Loov;)Loov;
      // 39f: athrow
      // 3a0: aload 6
      // 3a2: fconst_0
      // 3a3: invokevirtual yqv.qji (Lerg;F)Lnvf;
      // 3a6: pop
      // 3a7: aload 3
      // 3a8: invokevirtual erg.gn1 ()Lu7m;
      // 3ab: getstatic xbr.exg Lu7m;
      // 3ae: if_acmpne 3f6
      // 3b1: aload 1
      // 3b2: iload 2
      // 3b3: ifne 411
      // 3b6: goto 3bd
      // 3b9: invokestatic yqv.g (Loov;)Loov;
      // 3bc: athrow
      // 3bd: invokevirtual nvf.c_3 ()Ljava/lang/String;
      // 3c0: ifnull 3f6
      // 3c3: goto 3ca
      // 3c6: invokestatic yqv.g (Loov;)Loov;
      // 3c9: athrow
      // 3ca: aload 0
      // 3cb: getfield yqv.oay Lt9d;
      // 3ce: aload 1
      // 3cf: invokevirtual nvf.c_3 ()Ljava/lang/String;
      // 3d2: invokevirtual OpaquePredicate.aev (Ljava/lang/String;)Lha9;
      // 3d5: astore 7
      // 3d7: iload 2
      // 3d8: ifne 410
      // 3db: aload 7
      // 3dd: ifnull 3f6
      // 3e0: goto 3e7
      // 3e3: invokestatic yqv.g (Loov;)Loov;
      // 3e6: athrow
      // 3e7: aload 7
      // 3e9: getstatic y8d.y02 Ll7l;
      // 3ec: invokevirtual ha9.aex (L_ss;)V
      // 3ef: goto 3f6
      // 3f2: invokestatic yqv.g (Loov;)Loov;
      // 3f5: athrow
      // 3f6: aload 0
      // 3f7: iload 4
      // 3f9: aload 3
      // 3fa: invokevirtual yqv.fga (ILerg;)V
      // 3fd: aload 0
      // 3fe: getfield yqv.k92 [F
      // 401: iload 4
      // 403: fconst_2
      // 404: fastore
      // 405: aload 0
      // 406: bipush 1
      // 407: putfield yqv.qlb Z
      // 40a: aload 0
      // 40b: aload 1
      // 40c: bipush 1
      // 40d: invokevirtual yqv.p3n (Li2h;I)V
      // 410: aload 1
      // 411: invokevirtual nvf._kl ()V
      // 414: return
   }

   public boolean a5l(erg var1) {
      return true;
   }

   public boolean kz3() {
      return true;
   }

   public void oqm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 2
      // 002: invokestatic OpaquePredicate.c ()I
      // 005: getstatic net/optifine/reflect/Reflector.Event_Result_DEFAULT Lnet/optifine/reflect/ReflectorField;
      // 008: invokestatic net/optifine/reflect/Reflector.getFieldValue (Lnet/optifine/reflect/ReflectorField;)Ljava/lang/Object;
      // 00b: astore 3
      // 00c: getstatic net/optifine/reflect/Reflector.Event_Result_DENY Lnet/optifine/reflect/ReflectorField;
      // 00f: invokestatic net/optifine/reflect/Reflector.getFieldValue (Lnet/optifine/reflect/ReflectorField;)Ljava/lang/Object;
      // 012: astore 4
      // 014: istore 1
      // 015: aload 0
      // 016: getfield yqv.qlb Z
      // 019: iload 1
      // 01a: ifne 050
      // 01d: ifeq 037
      // 020: goto 027
      // 023: invokestatic yqv.g (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: bipush 0
      // 029: putfield yqv.dof I
      // 02c: iload 1
      // 02d: ifeq 1c6
      // 030: goto 037
      // 033: invokestatic yqv.g (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: iload 1
      // 039: ifne 06a
      // 03c: goto 043
      // 03f: invokestatic yqv.g (Loov;)Loov;
      // 042: athrow
      // 043: getfield yqv.dof I
      // 046: bipush 31
      // 048: iand
      // 049: goto 050
      // 04c: invokestatic yqv.g (Loov;)Loov;
      // 04f: athrow
      // 050: bipush 31
      // 052: if_icmpne 0a7
      // 055: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_canEntityDespawn Lnet/optifine/reflect/ReflectorMethod;
      // 058: bipush 1
      // 059: anewarray 188
      // 05c: dup
      // 05d: bipush 0
      // 05e: aload 0
      // 05f: aastore
      // 060: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 063: goto 06a
      // 066: invokestatic yqv.g (Loov;)Loov;
      // 069: athrow
      // 06a: dup
      // 06b: astore 2
      // 06c: aload 3
      // 06d: iload 1
      // 06e: ifne 085
      // 071: if_acmpeq 0a7
      // 074: goto 07b
      // 077: invokestatic yqv.g (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 2
      // 07c: aload 4
      // 07e: goto 085
      // 081: invokestatic yqv.g (Loov;)Loov;
      // 084: athrow
      // 085: if_acmpne 098
      // 088: aload 0
      // 089: bipush 0
      // 08a: putfield yqv.dof I
      // 08d: iload 1
      // 08e: ifeq 1c6
      // 091: goto 098
      // 094: invokestatic yqv.g (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: invokevirtual yqv._kl ()V
      // 09c: iload 1
      // 09d: ifeq 1c6
      // 0a0: goto 0a7
      // 0a3: invokestatic yqv.g (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield yqv.oay Lt9d;
      // 0ab: aload 0
      // 0ac: ldc2_w -1.0
      // 0af: invokevirtual OpaquePredicate.a_q (Li2h;D)Lha9;
      // 0b2: astore 5
      // 0b4: aload 5
      // 0b6: iload 1
      // 0b7: ifne 0c6
      // 0ba: ifnull 1c6
      // 0bd: goto 0c4
      // 0c0: invokestatic yqv.g (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 5
      // 0c6: getfield EntityLivingBase.o2v D
      // 0c9: aload 0
      // 0ca: getfield yqv.o2v D
      // 0cd: dsub
      // 0ce: dstore 6
      // 0d0: aload 5
      // 0d2: getfield EntityLivingBase.kfp D
      // 0d5: aload 0
      // 0d6: getfield yqv.kfp D
      // 0d9: dsub
      // 0da: dstore 8
      // 0dc: aload 5
      // 0de: getfield EntityLivingBase.vbd D
      // 0e1: aload 0
      // 0e2: getfield yqv.vbd D
      // 0e5: dsub
      // 0e6: dstore 10
      // 0e8: dload 6
      // 0ea: dload 6
      // 0ec: dmul
      // 0ed: dload 8
      // 0ef: dload 8
      // 0f1: dmul
      // 0f2: dadd
      // 0f3: dload 10
      // 0f5: dload 10
      // 0f7: dmul
      // 0f8: dadd
      // 0f9: dstore 12
      // 0fb: aload 0
      // 0fc: invokevirtual yqv.kz3 ()Z
      // 0ff: iload 1
      // 100: ifne 137
      // 103: ifeq 133
      // 106: goto 10d
      // 109: invokestatic yqv.g (Loov;)Loov;
      // 10c: athrow
      // 10d: dload 12
      // 10f: ldc2_w 16384.0
      // 112: dcmpl
      // 113: iload 1
      // 114: ifne 137
      // 117: goto 11e
      // 11a: invokestatic yqv.g (Loov;)Loov;
      // 11d: athrow
      // 11e: ifle 133
      // 121: goto 128
      // 124: invokestatic yqv.g (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: invokevirtual yqv._kl ()V
      // 12c: goto 133
      // 12f: invokestatic yqv.g (Loov;)Loov;
      // 132: athrow
      // 133: aload 0
      // 134: getfield yqv.dof I
      // 137: iload 1
      // 138: ifne 1b7
      // 13b: sipush 600
      // 13e: if_icmple 1aa
      // 141: goto 148
      // 144: invokestatic yqv.g (Loov;)Loov;
      // 147: athrow
      // 148: aload 0
      // 149: getfield yqv.z2d Ljava/util/Random;
      // 14c: sipush 800
      // 14f: invokevirtual java/util/Random.nextInt (I)I
      // 152: iload 1
      // 153: ifne 1b7
      // 156: goto 15d
      // 159: invokestatic yqv.g (Loov;)Loov;
      // 15c: athrow
      // 15d: ifne 1aa
      // 160: goto 167
      // 163: invokestatic yqv.g (Loov;)Loov;
      // 166: athrow
      // 167: dload 12
      // 169: ldc2_w 1024.0
      // 16c: dcmpl
      // 16d: iload 1
      // 16e: ifne 1b7
      // 171: goto 178
      // 174: invokestatic yqv.g (Loov;)Loov;
      // 177: athrow
      // 178: ifle 1aa
      // 17b: goto 182
      // 17e: invokestatic yqv.g (Loov;)Loov;
      // 181: athrow
      // 182: aload 0
      // 183: invokevirtual yqv.kz3 ()Z
      // 186: iload 1
      // 187: ifne 1b7
      // 18a: goto 191
      // 18d: invokestatic yqv.g (Loov;)Loov;
      // 190: athrow
      // 191: ifeq 1aa
      // 194: goto 19b
      // 197: invokestatic yqv.g (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 0
      // 19c: invokevirtual yqv._kl ()V
      // 19f: iload 1
      // 1a0: ifeq 1c6
      // 1a3: goto 1aa
      // 1a6: invokestatic yqv.g (Loov;)Loov;
      // 1a9: athrow
      // 1aa: dload 12
      // 1ac: ldc2_w 1024.0
      // 1af: dcmpg
      // 1b0: goto 1b7
      // 1b3: invokestatic yqv.g (Loov;)Loov;
      // 1b6: athrow
      // 1b7: ifge 1c6
      // 1ba: aload 0
      // 1bb: bipush 0
      // 1bc: putfield yqv.dof I
      // 1bf: goto 1c6
      // 1c2: invokestatic yqv.g (Loov;)Loov;
      // 1c5: athrow
      // 1c6: return
   }

   @Override
   public final void nd9() {
      long var1 = i ^ 93272679817285L;
      this.dof++;
      this.oay.e8t.qek(c<"v">(31046, 2742317651508952952L ^ var1));
      this.oqm();
      this.oay.e8t.uio();
      this.oay.e8t.qek(c<"v">(1212, 5751430662449234567L ^ var1));
      this.xls.ukb();
      this.oay.e8t.uio();
      this.oay.e8t.qek(c<"v">(2492, 7120967487102783376L ^ var1));
      this.g9o.eo0();
      this.oay.e8t.uio();
      this.oay.e8t.qek(c<"v">(24300, 5075429664544053442L ^ var1));
      this.r1d.eo0();
      this.oay.e8t.uio();
      this.oay.e8t.qek(c<"v">(18767, 1322571003525680997L ^ var1));
      this.f35.vr1();
      this.oay.e8t.uio();
      this.oay.e8t.qek(c<"v">(12941, 4581218101302604981L ^ var1));
      this.qar();
      this.oay.e8t.uio();
      this.oay.e8t.qek(c<"v">(25023, 2667922127072683907L ^ var1));
      this.oay.e8t.qek(c<"v">(26926, 6937502280222895897L ^ var1));
      this.i1n.nju();
      this.oay.e8t.v2l(c<"v">(13363, 2205834102758093313L ^ var1));
      this.ctu._9j();
      this.oay.e8t.v2l(c<"v">(32212, 8813813209726483447L ^ var1));
      this.w6o.fbz();
      this.oay.e8t.uio();
      this.oay.e8t.uio();
   }

   public void qar() {
   }

   public int d1r() {
      return 40;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void fm3(EntityLivingBase var1, float var2, float var3) {
      double var5 = var1.o2v - this.o2v;
      int var10000 = OpaquePredicate.c();
      double var7 = var1.vbd - this.vbd;
      int var4 = var10000;

      double var9;
      label37: {
         label44: {
            label41: {
               try {
                  var19 = var1;
                  if (var4 != 0) {
                     break label44;
                  }

                  if (!(var1 instanceof Entity)) {
                     break label41;
                  }
               } catch (oov var17) {
                  throw g(var17);
               }

               Entity var11 = (Entity)var1;
               var9 = var11.kfp + (double)var11.c5y() - (this.kfp + (double)this.c5y());

               try {
                  if (var4 == 0) {
                     break label37;
                  }
               } catch (oov var16) {
                  boolean var10001 = false;
                  throw g(var16);
               }
            }

            try {
               var19 = var1;
            } catch (oov var15) {
               boolean var21 = false;
               throw g(var15);
            }
         }

         var9 = (var19.aaw().bx_ + var1.aaw().i2c) / 2.0 - (this.kfp + (double)this.c5y());
      }

      double var18 = (double)fe6.dii(var5 * var5 + var7 * var7);
      float var13 = (float)(fe6.yr8(var7, var5) * 180.0 / Math.PI) - 90.0F;
      float var14 = (float)(-(fe6.yr8(var9, var18) * 180.0 / Math.PI));
      this.y2i = this.scw(this.y2i, var14, var3);
      this.x5k = this.scw(this.x5k, var13, var2);
   }

   private float scw(float var1, float var2, float var3) {
      int var4 = OpaquePredicate.b();
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
               throw g(var7);
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
            throw g(var6);
         }
      }

      if (var10000 < 0) {
         var5 = -var3;
      }

      return var1 + var5;
   }

   public boolean iaw() {
      return true;
   }

   public boolean m63() {
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
      // 05: getfield yqv.oay Lt9d;
      // 08: aload 0
      // 09: invokevirtual yqv.aaw ()Lnh4;
      // 0c: aload 0
      // 0d: invokevirtual OpaquePredicate.g17 (Lnh4;Li2h;)Z
      // 10: iload 1
      // 11: ifne 36
      // 14: ifeq 68
      // 17: goto 1e
      // 1a: invokestatic yqv.g (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield yqv.oay Lt9d;
      // 22: aload 0
      // 23: aload 0
      // 24: invokevirtual yqv.aaw ()Lnh4;
      // 27: invokevirtual OpaquePredicate.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 2a: invokeinterface java/util/List.isEmpty ()Z 1
      // 2f: goto 36
      // 32: invokestatic yqv.g (Loov;)Loov;
      // 35: athrow
      // 36: iload 1
      // 37: ifne 56
      // 3a: ifeq 68
      // 3d: goto 44
      // 40: invokestatic yqv.g (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield yqv.oay Lt9d;
      // 48: aload 0
      // 49: invokevirtual yqv.aaw ()Lnh4;
      // 4c: invokevirtual OpaquePredicate.hhd (Lnh4;)Z
      // 4f: goto 56
      // 52: invokestatic yqv.g (Loov;)Loov;
      // 55: athrow
      // 56: iload 1
      // 57: ifne 65
      // 5a: ifne 68
      // 5d: goto 64
      // 60: invokestatic yqv.g (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   public float ck4() {
      return 1.0F;
   }

   public int inu() {
      return 4;
   }

   @Override
   public int c4g() {
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
      // 05: iload 1
      // 06: ifeq 1d
      // 09: invokevirtual yqv.q4v ()Lg_3;
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: bipush 3
      // 17: ireturn
      // 18: invokestatic yqv.g (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual yqv.i55 ()F
      // 20: aload 0
      // 21: invokevirtual yqv.axb ()F
      // 24: ldc 0.33
      // 26: nop
      // 27: fmul
      // 28: fsub
      // 29: f2i
      // 2a: istore 2
      // 2b: iload 2
      // 2c: bipush 3
      // 2d: aload 0
      // 2e: getfield yqv.oay Lt9d;
      // 31: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 34: invokevirtual v66.dzc ()I
      // 37: isub
      // 38: bipush 4
      // 39: imul
      // 3a: isub
      // 3b: istore 2
      // 3c: iload 2
      // 3d: iload 1
      // 3e: ifeq 50
      // 41: ifge 4d
      // 44: goto 4b
      // 47: invokestatic yqv.g (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: istore 2
      // 4d: iload 2
      // 4e: bipush 3
      // 4f: iadd
      // 50: ireturn
   }

   @Override
   public erg tsc() {
      return this.b8n[0];
   }

   @Override
   public erg rnq(int var1) {
      return this.b8n[var1];
   }

   @Override
   public erg wfg(int var1) {
      return this.b8n[var1 + 1];
   }

   @Override
   public void fga(int var1, erg var2) {
      this.b8n[var1] = var2;
   }

   @Override
   public erg[] n7a() {
      return this.b8n;
   }

   @Override
   public void ly2(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: bipush 0
      // 005: istore 4
      // 007: iload 4
      // 009: aload 0
      // 00a: invokevirtual yqv.n7a ()[Lerg;
      // 00d: arraylength
      // 00e: if_icmpge 138
      // 011: aload 0
      // 012: iload 4
      // 014: invokevirtual yqv.rnq (I)Lerg;
      // 017: astore 5
      // 019: aload 0
      // 01a: getfield yqv.k92 [F
      // 01d: iload 4
      // 01f: faload
      // 020: fconst_1
      // 021: fcmpl
      // 022: iload 3
      // 023: ifeq 031
      // 026: ifle 034
      // 029: goto 030
      // 02c: invokestatic yqv.g (Loov;)Loov;
      // 02f: athrow
      // 030: bipush 1
      // 031: goto 035
      // 034: bipush 0
      // 035: istore 6
      // 037: iload 3
      // 038: ifeq 134
      // 03b: aload 5
      // 03d: ifnull 131
      // 040: goto 047
      // 043: invokestatic yqv.g (Loov;)Loov;
      // 046: athrow
      // 047: iload 1
      // 048: iload 3
      // 049: ifeq 091
      // 04c: goto 053
      // 04f: invokestatic yqv.g (Loov;)Loov;
      // 052: athrow
      // 053: ifne 074
      // 056: goto 05d
      // 059: invokestatic yqv.g (Loov;)Loov;
      // 05c: athrow
      // 05d: iload 6
      // 05f: iload 3
      // 060: ifeq 091
      // 063: goto 06a
      // 066: invokestatic yqv.g (Loov;)Loov;
      // 069: athrow
      // 06a: ifeq 131
      // 06d: goto 074
      // 070: invokestatic yqv.g (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: getfield yqv.z2d Ljava/util/Random;
      // 078: invokevirtual java/util/Random.nextFloat ()F
      // 07b: iload 2
      // 07c: i2f
      // 07d: ldc 0.01
      // 07f: nop
      // 080: fmul
      // 081: fsub
      // 082: aload 0
      // 083: getfield yqv.k92 [F
      // 086: iload 4
      // 088: faload
      // 089: fcmpg
      // 08a: goto 091
      // 08d: invokestatic yqv.g (Loov;)Loov;
      // 090: athrow
      // 091: iload 3
      // 092: ifeq 0a1
      // 095: ifge 131
      // 098: goto 09f
      // 09b: invokestatic yqv.g (Loov;)Loov;
      // 09e: athrow
      // 09f: iload 6
      // 0a1: iload 3
      // 0a2: ifeq 0bb
      // 0a5: ifne 129
      // 0a8: goto 0af
      // 0ab: invokestatic yqv.g (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 5
      // 0b1: invokevirtual erg.dw2 ()Z
      // 0b4: goto 0bb
      // 0b7: invokestatic yqv.g (Loov;)Loov;
      // 0ba: athrow
      // 0bb: iload 3
      // 0bc: ifeq 0dc
      // 0bf: ifeq 129
      // 0c2: goto 0c9
      // 0c5: invokestatic yqv.g (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 5
      // 0cb: invokevirtual erg.mg5 ()I
      // 0ce: bipush 25
      // 0d0: isub
      // 0d1: bipush 1
      // 0d2: invokestatic java/lang/Math.max (II)I
      // 0d5: goto 0dc
      // 0d8: invokestatic yqv.g (Loov;)Loov;
      // 0db: athrow
      // 0dc: istore 7
      // 0de: aload 5
      // 0e0: invokevirtual erg.mg5 ()I
      // 0e3: aload 0
      // 0e4: getfield yqv.z2d Ljava/util/Random;
      // 0e7: aload 0
      // 0e8: getfield yqv.z2d Ljava/util/Random;
      // 0eb: iload 7
      // 0ed: invokevirtual java/util/Random.nextInt (I)I
      // 0f0: bipush 1
      // 0f1: iadd
      // 0f2: invokevirtual java/util/Random.nextInt (I)I
      // 0f5: isub
      // 0f6: istore 8
      // 0f8: iload 8
      // 0fa: iload 7
      // 0fc: iload 3
      // 0fd: ifeq 11c
      // 100: if_icmple 10e
      // 103: goto 10a
      // 106: invokestatic yqv.g (Loov;)Loov;
      // 109: athrow
      // 10a: iload 7
      // 10c: istore 8
      // 10e: iload 8
      // 110: iload 3
      // 111: ifeq 120
      // 114: bipush 1
      // 115: goto 11c
      // 118: invokestatic yqv.g (Loov;)Loov;
      // 11b: athrow
      // 11c: if_icmpge 122
      // 11f: bipush 1
      // 120: istore 8
      // 122: aload 5
      // 124: iload 8
      // 126: invokevirtual erg.awe (I)V
      // 129: aload 0
      // 12a: aload 5
      // 12c: fconst_0
      // 12d: invokevirtual yqv.qji (Lerg;F)Lnvf;
      // 130: pop
      // 131: iinc 4 1
      // 134: iload 3
      // 135: ifne 007
      // 138: return
   }

   public void _58(css param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield yqv.z2d Ljava/util/Random;
      // 008: invokevirtual java/util/Random.nextFloat ()F
      // 00b: ldc 0.15
      // 00d: nop
      // 00e: aload 1
      // 00f: invokevirtual css.os2 ()F
      // 012: fmul
      // 013: fcmpg
      // 014: iload 2
      // 015: ifne 031
      // 018: ifge 118
      // 01b: goto 022
      // 01e: invokestatic yqv.g (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: getfield yqv.z2d Ljava/util/Random;
      // 026: bipush 2
      // 027: invokevirtual java/util/Random.nextInt (I)I
      // 02a: goto 031
      // 02d: invokestatic yqv.g (Loov;)Loov;
      // 030: athrow
      // 031: istore 3
      // 032: aload 0
      // 033: getfield yqv.oay Lt9d;
      // 036: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 039: getstatic v66.csg Lv66;
      // 03c: if_acmpne 049
      // 03f: ldc 0.1
      // 041: nop
      // 042: goto 04c
      // 045: invokestatic yqv.g (Loov;)Loov;
      // 048: athrow
      // 049: ldc 0.25
      // 04b: nop
      // 04c: fstore 4
      // 04e: aload 0
      // 04f: getfield yqv.z2d Ljava/util/Random;
      // 052: invokevirtual java/util/Random.nextFloat ()F
      // 055: ldc 0.095
      // 057: nop
      // 058: fcmpg
      // 059: iload 2
      // 05a: ifne 075
      // 05d: ifge 06a
      // 060: goto 067
      // 063: invokestatic yqv.g (Loov;)Loov;
      // 066: athrow
      // 067: iinc 3 1
      // 06a: aload 0
      // 06b: getfield yqv.z2d Ljava/util/Random;
      // 06e: invokevirtual java/util/Random.nextFloat ()F
      // 071: ldc 0.095
      // 073: nop
      // 074: fcmpg
      // 075: iload 2
      // 076: ifne 091
      // 079: ifge 086
      // 07c: goto 083
      // 07f: invokestatic yqv.g (Loov;)Loov;
      // 082: athrow
      // 083: iinc 3 1
      // 086: aload 0
      // 087: getfield yqv.z2d Ljava/util/Random;
      // 08a: invokevirtual java/util/Random.nextFloat ()F
      // 08d: ldc 0.095
      // 08f: nop
      // 090: fcmpg
      // 091: iload 2
      // 092: ifne 0a3
      // 095: ifge 0a2
      // 098: goto 09f
      // 09b: invokestatic yqv.g (Loov;)Loov;
      // 09e: athrow
      // 09f: iinc 3 1
      // 0a2: bipush 3
      // 0a3: istore 5
      // 0a5: iload 5
      // 0a7: iflt 118
      // 0aa: aload 0
      // 0ab: iload 5
      // 0ad: invokevirtual yqv.wfg (I)Lerg;
      // 0b0: astore 6
      // 0b2: iload 5
      // 0b4: iload 2
      // 0b5: ifne 0d4
      // 0b8: bipush 3
      // 0b9: if_icmpge 0da
      // 0bc: goto 0c3
      // 0bf: invokestatic yqv.g (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: getfield yqv.z2d Ljava/util/Random;
      // 0c7: invokevirtual java/util/Random.nextFloat ()F
      // 0ca: fload 4
      // 0cc: fcmpg
      // 0cd: goto 0d4
      // 0d0: invokestatic yqv.g (Loov;)Loov;
      // 0d3: athrow
      // 0d4: ifge 0da
      // 0d7: goto 118
      // 0da: aload 6
      // 0dc: ifnonnull 111
      // 0df: iload 5
      // 0e1: bipush 1
      // 0e2: iadd
      // 0e3: iload 3
      // 0e4: invokestatic yqv.gtb (II)Lu7m;
      // 0e7: astore 7
      // 0e9: iload 2
      // 0ea: ifne 114
      // 0ed: aload 7
      // 0ef: ifnull 111
      // 0f2: goto 0f9
      // 0f5: invokestatic yqv.g (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: iload 5
      // 0fc: bipush 1
      // 0fd: iadd
      // 0fe: new erg
      // 101: dup
      // 102: aload 7
      // 104: invokespecial erg.<init> (Lu7m;)V
      // 107: invokevirtual yqv.fga (ILerg;)V
      // 10a: goto 111
      // 10d: invokestatic yqv.g (Loov;)Loov;
      // 110: athrow
      // 111: iinc 5 -1
      // 114: iload 2
      // 115: ifeq 0a5
      // 118: return
   }

   public static int vu5(erg param0) {
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
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: getstatic ox_.jzx Le0x;
      // 0b: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0e: iload 1
      // 0f: ifeq 35
      // 12: if_acmpeq 9a
      // 15: goto 1c
      // 18: invokestatic yqv.g (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual erg.gn1 ()Lu7m;
      // 20: iload 1
      // 21: ifeq 43
      // 24: goto 2b
      // 27: invokestatic yqv.g (Loov;)Loov;
      // 2a: athrow
      // 2b: getstatic xbr.r9n Lu7m;
      // 2e: goto 35
      // 31: invokestatic yqv.g (Loov;)Loov;
      // 34: athrow
      // 35: if_acmpeq 9a
      // 38: aload 0
      // 39: invokevirtual erg.gn1 ()Lu7m;
      // 3c: goto 43
      // 3f: invokestatic yqv.g (Loov;)Loov;
      // 42: athrow
      // 43: instanceof jpt
      // 46: iload 1
      // 47: ifeq 99
      // 4a: ifeq 98
      // 4d: goto 54
      // 50: invokestatic yqv.g (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: invokevirtual erg.gn1 ()Lu7m;
      // 58: checkcast jpt
      // 5b: getfield jpt.nbs I
      // 5e: iload 1
      // 5f: ifeq 99
      // 62: goto 69
      // 65: invokestatic yqv.g (Loov;)Loov;
      // 68: athrow
      // 69: tableswitch 47 0 3 35 41 43 45
      // 88: invokestatic yqv.g (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 4
      // 8d: ireturn
      // 8e: invokestatic yqv.g (Loov;)Loov;
      // 91: athrow
      // 92: bipush 3
      // 93: ireturn
      // 94: bipush 2
      // 95: ireturn
      // 96: bipush 1
      // 97: ireturn
      // 98: bipush 0
      // 99: ireturn
      // 9a: bipush 4
      // 9b: ireturn
   }

   public static u7m gtb(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: iload 0
      // 005: iload 2
      // 006: ifeq 02d
      // 009: tableswitch 500 1 4 392 273 154 35
      // 028: invokestatic yqv.g (Loov;)Loov;
      // 02b: athrow
      // 02c: iload 1
      // 02d: iload 2
      // 02e: ifeq 044
      // 031: ifne 043
      // 034: goto 03b
      // 037: invokestatic yqv.g (Loov;)Loov;
      // 03a: athrow
      // 03b: getstatic xbr.pgw Ljpt;
      // 03e: areturn
      // 03f: invokestatic yqv.g (Loov;)Loov;
      // 042: athrow
      // 043: iload 1
      // 044: bipush 1
      // 045: iload 2
      // 046: ifeq 05d
      // 049: if_icmpne 05b
      // 04c: goto 053
      // 04f: invokestatic yqv.g (Loov;)Loov;
      // 052: athrow
      // 053: getstatic xbr.hrw Ljpt;
      // 056: areturn
      // 057: invokestatic yqv.g (Loov;)Loov;
      // 05a: athrow
      // 05b: iload 1
      // 05c: bipush 2
      // 05d: iload 2
      // 05e: ifeq 075
      // 061: if_icmpne 073
      // 064: goto 06b
      // 067: invokestatic yqv.g (Loov;)Loov;
      // 06a: athrow
      // 06b: getstatic xbr.mtq Ljpt;
      // 06e: areturn
      // 06f: invokestatic yqv.g (Loov;)Loov;
      // 072: athrow
      // 073: iload 1
      // 074: bipush 3
      // 075: iload 2
      // 076: ifeq 098
      // 079: if_icmpne 08b
      // 07c: goto 083
      // 07f: invokestatic yqv.g (Loov;)Loov;
      // 082: athrow
      // 083: getstatic xbr.c2v Ljpt;
      // 086: areturn
      // 087: invokestatic yqv.g (Loov;)Loov;
      // 08a: athrow
      // 08b: iload 1
      // 08c: iload 2
      // 08d: ifeq 0a4
      // 090: bipush 4
      // 091: goto 098
      // 094: invokestatic yqv.g (Loov;)Loov;
      // 097: athrow
      // 098: if_icmpne 0a3
      // 09b: getstatic xbr.z44 Ljpt;
      // 09e: areturn
      // 09f: invokestatic yqv.g (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 1
      // 0a4: iload 2
      // 0a5: ifeq 0bb
      // 0a8: ifne 0ba
      // 0ab: goto 0b2
      // 0ae: invokestatic yqv.g (Loov;)Loov;
      // 0b1: athrow
      // 0b2: getstatic xbr.s9f Ljpt;
      // 0b5: areturn
      // 0b6: invokestatic yqv.g (Loov;)Loov;
      // 0b9: athrow
      // 0ba: iload 1
      // 0bb: bipush 1
      // 0bc: iload 2
      // 0bd: ifeq 0d4
      // 0c0: if_icmpne 0d2
      // 0c3: goto 0ca
      // 0c6: invokestatic yqv.g (Loov;)Loov;
      // 0c9: athrow
      // 0ca: getstatic xbr.mmx Ljpt;
      // 0cd: areturn
      // 0ce: invokestatic yqv.g (Loov;)Loov;
      // 0d1: athrow
      // 0d2: iload 1
      // 0d3: bipush 2
      // 0d4: iload 2
      // 0d5: ifeq 0ec
      // 0d8: if_icmpne 0ea
      // 0db: goto 0e2
      // 0de: invokestatic yqv.g (Loov;)Loov;
      // 0e1: athrow
      // 0e2: getstatic xbr.o20 Ljpt;
      // 0e5: areturn
      // 0e6: invokestatic yqv.g (Loov;)Loov;
      // 0e9: athrow
      // 0ea: iload 1
      // 0eb: bipush 3
      // 0ec: iload 2
      // 0ed: ifeq 10f
      // 0f0: if_icmpne 102
      // 0f3: goto 0fa
      // 0f6: invokestatic yqv.g (Loov;)Loov;
      // 0f9: athrow
      // 0fa: getstatic xbr.w41 Ljpt;
      // 0fd: areturn
      // 0fe: invokestatic yqv.g (Loov;)Loov;
      // 101: athrow
      // 102: iload 1
      // 103: iload 2
      // 104: ifeq 11b
      // 107: bipush 4
      // 108: goto 10f
      // 10b: invokestatic yqv.g (Loov;)Loov;
      // 10e: athrow
      // 10f: if_icmpne 11a
      // 112: getstatic xbr.r6g Ljpt;
      // 115: areturn
      // 116: invokestatic yqv.g (Loov;)Loov;
      // 119: athrow
      // 11a: iload 1
      // 11b: iload 2
      // 11c: ifeq 132
      // 11f: ifne 131
      // 122: goto 129
      // 125: invokestatic yqv.g (Loov;)Loov;
      // 128: athrow
      // 129: getstatic xbr.esc Ljpt;
      // 12c: areturn
      // 12d: invokestatic yqv.g (Loov;)Loov;
      // 130: athrow
      // 131: iload 1
      // 132: bipush 1
      // 133: iload 2
      // 134: ifeq 14b
      // 137: if_icmpne 149
      // 13a: goto 141
      // 13d: invokestatic yqv.g (Loov;)Loov;
      // 140: athrow
      // 141: getstatic xbr.c8v Ljpt;
      // 144: areturn
      // 145: invokestatic yqv.g (Loov;)Loov;
      // 148: athrow
      // 149: iload 1
      // 14a: bipush 2
      // 14b: iload 2
      // 14c: ifeq 163
      // 14f: if_icmpne 161
      // 152: goto 159
      // 155: invokestatic yqv.g (Loov;)Loov;
      // 158: athrow
      // 159: getstatic xbr.q4a Ljpt;
      // 15c: areturn
      // 15d: invokestatic yqv.g (Loov;)Loov;
      // 160: athrow
      // 161: iload 1
      // 162: bipush 3
      // 163: iload 2
      // 164: ifeq 186
      // 167: if_icmpne 179
      // 16a: goto 171
      // 16d: invokestatic yqv.g (Loov;)Loov;
      // 170: athrow
      // 171: getstatic xbr.hfp Ljpt;
      // 174: areturn
      // 175: invokestatic yqv.g (Loov;)Loov;
      // 178: athrow
      // 179: iload 1
      // 17a: iload 2
      // 17b: ifeq 192
      // 17e: bipush 4
      // 17f: goto 186
      // 182: invokestatic yqv.g (Loov;)Loov;
      // 185: athrow
      // 186: if_icmpne 191
      // 189: getstatic xbr.rrf Ljpt;
      // 18c: areturn
      // 18d: invokestatic yqv.g (Loov;)Loov;
      // 190: athrow
      // 191: iload 1
      // 192: iload 2
      // 193: ifeq 1a9
      // 196: ifne 1a8
      // 199: goto 1a0
      // 19c: invokestatic yqv.g (Loov;)Loov;
      // 19f: athrow
      // 1a0: getstatic xbr._qk Ljpt;
      // 1a3: areturn
      // 1a4: invokestatic yqv.g (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 1
      // 1a9: bipush 1
      // 1aa: iload 2
      // 1ab: ifeq 1c2
      // 1ae: if_icmpne 1c0
      // 1b1: goto 1b8
      // 1b4: invokestatic yqv.g (Loov;)Loov;
      // 1b7: athrow
      // 1b8: getstatic xbr.lsz Ljpt;
      // 1bb: areturn
      // 1bc: invokestatic yqv.g (Loov;)Loov;
      // 1bf: athrow
      // 1c0: iload 1
      // 1c1: bipush 2
      // 1c2: iload 2
      // 1c3: ifeq 1da
      // 1c6: if_icmpne 1d8
      // 1c9: goto 1d0
      // 1cc: invokestatic yqv.g (Loov;)Loov;
      // 1cf: athrow
      // 1d0: getstatic xbr.axm Ljpt;
      // 1d3: areturn
      // 1d4: invokestatic yqv.g (Loov;)Loov;
      // 1d7: athrow
      // 1d8: iload 1
      // 1d9: bipush 3
      // 1da: iload 2
      // 1db: ifeq 1f2
      // 1de: if_icmpne 1f0
      // 1e1: goto 1e8
      // 1e4: invokestatic yqv.g (Loov;)Loov;
      // 1e7: athrow
      // 1e8: getstatic xbr.tfe Ljpt;
      // 1eb: areturn
      // 1ec: invokestatic yqv.g (Loov;)Loov;
      // 1ef: athrow
      // 1f0: iload 1
      // 1f1: bipush 4
      // 1f2: if_icmpne 1fd
      // 1f5: getstatic xbr.zrn Ljpt;
      // 1f8: areturn
      // 1f9: invokestatic yqv.g (Loov;)Loov;
      // 1fc: athrow
      // 1fd: aconst_null
      // 1fe: areturn
   }

   public void jng(css param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual css.os2 ()F
      // 08: fstore 3
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 23
      // 0e: invokevirtual yqv.tsc ()Lerg;
      // 11: ifnull 61
      // 14: goto 1b
      // 17: invokestatic yqv.g (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic yqv.g (Loov;)Loov;
      // 22: athrow
      // 23: getfield yqv.z2d Ljava/util/Random;
      // 26: invokevirtual java/util/Random.nextFloat ()F
      // 29: ldc 0.25
      // 2b: nop
      // 2c: fload 3
      // 2d: fmul
      // 2e: fcmpg
      // 2f: iload 2
      // 30: ifeq 62
      // 33: ifge 61
      // 36: goto 3d
      // 39: invokestatic yqv.g (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield yqv.z2d Ljava/util/Random;
      // 41: aload 0
      // 42: invokevirtual yqv.tsc ()Lerg;
      // 45: ldc 5.0
      // 47: nop
      // 48: fload 3
      // 49: aload 0
      // 4a: getfield yqv.z2d Ljava/util/Random;
      // 4d: bipush 18
      // 4f: invokevirtual java/util/Random.nextInt (I)I
      // 52: i2f
      // 53: fmul
      // 54: fadd
      // 55: f2i
      // 56: invokestatic hc0.xm8 (Ljava/util/Random;Lerg;I)Lerg;
      // 59: pop
      // 5a: goto 61
      // 5d: invokestatic yqv.g (Loov;)Loov;
      // 60: athrow
      // 61: bipush 0
      // 62: istore 4
      // 64: iload 4
      // 66: bipush 4
      // 67: if_icmpge cd
      // 6a: aload 0
      // 6b: iload 4
      // 6d: invokevirtual yqv.wfg (I)Lerg;
      // 70: astore 5
      // 72: iload 2
      // 73: ifeq c9
      // 76: aload 5
      // 78: ifnull c6
      // 7b: goto 82
      // 7e: invokestatic yqv.g (Loov;)Loov;
      // 81: athrow
      // 82: aload 0
      // 83: getfield yqv.z2d Ljava/util/Random;
      // 86: iload 2
      // 87: ifeq af
      // 8a: goto 91
      // 8d: invokestatic yqv.g (Loov;)Loov;
      // 90: athrow
      // 91: invokevirtual java/util/Random.nextFloat ()F
      // 94: ldc 0.5
      // 96: nop
      // 97: fload 3
      // 98: fmul
      // 99: fcmpg
      // 9a: ifge c6
      // 9d: goto a4
      // a0: invokestatic yqv.g (Loov;)Loov;
      // a3: athrow
      // a4: aload 0
      // a5: getfield yqv.z2d Ljava/util/Random;
      // a8: goto af
      // ab: invokestatic yqv.g (Loov;)Loov;
      // ae: athrow
      // af: aload 5
      // b1: ldc 5.0
      // b3: nop
      // b4: fload 3
      // b5: aload 0
      // b6: getfield yqv.z2d Ljava/util/Random;
      // b9: bipush 18
      // bb: invokevirtual java/util/Random.nextInt (I)I
      // be: i2f
      // bf: fmul
      // c0: fadd
      // c1: f2i
      // c2: invokestatic hc0.xm8 (Ljava/util/Random;Lerg;I)Lerg;
      // c5: pop
      // c6: iinc 4 1
      // c9: iload 2
      // ca: ifne 64
      // cd: return
   }

   public ps6 hx8(css var1, ps6 var2) {
      long var3 = i ^ 15681993211593L;
      this.dgt(m6d.wg4).vcr(new xk5(c<"v">(30156, 8277406830818700665L ^ var3), this.z2d.nextGaussian() * 0.05, 1));
      return var2;
   }

   public boolean t1g() {
      return false;
   }

   public void _92() {
      this.qlb = true;
   }

   public void kwm(int var1, float var2) {
      this.k92[var1] = var2;
   }

   public boolean zrj() {
      return this.vkj;
   }

   public void onk(boolean var1) {
      this.vkj = var1;
   }

   public boolean jx9() {
      return this.qlb;
   }

   @Override
   public final boolean k25(ha9 param1) {
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
      // 005: iload 2
      // 006: ifeq 02c
      // 009: invokevirtual yqv.hk3 ()Z
      // 00c: ifeq 058
      // 00f: goto 016
      // 012: invokestatic yqv.g (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: iload 2
      // 018: ifeq 038
      // 01b: goto 022
      // 01e: invokestatic yqv.g (Loov;)Loov;
      // 021: athrow
      // 022: invokevirtual yqv.ohg ()Li2h;
      // 025: goto 02c
      // 028: invokestatic yqv.g (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 1
      // 02d: if_acmpne 058
      // 030: aload 0
      // 031: goto 038
      // 034: invokestatic yqv.g (Loov;)Loov;
      // 037: athrow
      // 038: bipush 1
      // 039: aload 1
      // 03a: getfield ha9.lls Lpj2;
      // 03d: getfield pj2.g40 Z
      // 040: iload 2
      // 041: ifeq 04f
      // 044: ifne 052
      // 047: goto 04e
      // 04a: invokestatic yqv.g (Loov;)Loov;
      // 04d: athrow
      // 04e: bipush 1
      // 04f: goto 053
      // 052: bipush 0
      // 053: invokevirtual yqv.xqh (ZZ)V
      // 056: bipush 1
      // 057: ireturn
      // 058: aload 1
      // 059: getfield ha9.up_ Ljnq;
      // 05c: invokevirtual jnq.dxs ()Lerg;
      // 05f: astore 3
      // 060: aload 3
      // 061: iload 2
      // 062: ifeq 070
      // 065: ifnull 10c
      // 068: goto 06f
      // 06b: invokestatic yqv.g (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 3
      // 070: invokevirtual erg.gn1 ()Lu7m;
      // 073: getstatic xbr.tj6 Lu7m;
      // 076: if_acmpne 10c
      // 079: aload 0
      // 07a: invokevirtual yqv._rn ()Z
      // 07d: iload 2
      // 07e: ifeq 111
      // 081: goto 088
      // 084: invokestatic yqv.g (Loov;)Loov;
      // 087: athrow
      // 088: ifeq 10c
      // 08b: goto 092
      // 08e: invokestatic yqv.g (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: instanceof k9a
      // 096: iload 2
      // 097: ifeq 0df
      // 09a: goto 0a1
      // 09d: invokestatic yqv.g (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifeq 0c7
      // 0a4: goto 0ab
      // 0a7: invokestatic yqv.g (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: checkcast k9a
      // 0af: invokevirtual k9a.j1j ()Z
      // 0b2: iload 2
      // 0b3: ifeq 0e8
      // 0b6: goto 0bd
      // 0b9: invokestatic yqv.g (Loov;)Loov;
      // 0bc: athrow
      // 0bd: ifne 0e0
      // 0c0: goto 0c7
      // 0c3: invokestatic yqv.g (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: aload 1
      // 0c9: bipush 1
      // 0ca: invokevirtual yqv.dt4 (Li2h;Z)V
      // 0cd: aload 3
      // 0ce: dup
      // 0cf: getfield erg.qd2 I
      // 0d2: bipush 1
      // 0d3: isub
      // 0d4: putfield erg.qd2 I
      // 0d7: bipush 1
      // 0d8: goto 0df
      // 0db: invokestatic yqv.g (Loov;)Loov;
      // 0de: athrow
      // 0df: ireturn
      // 0e0: aload 0
      // 0e1: checkcast k9a
      // 0e4: aload 1
      // 0e5: invokevirtual k9a.j12 (Lg_3;)Z
      // 0e8: iload 2
      // 0e9: ifeq 111
      // 0ec: ifeq 10c
      // 0ef: goto 0f6
      // 0f2: invokestatic yqv.g (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: aload 1
      // 0f8: bipush 1
      // 0f9: invokevirtual yqv.dt4 (Li2h;Z)V
      // 0fc: aload 3
      // 0fd: dup
      // 0fe: getfield erg.qd2 I
      // 101: bipush 1
      // 102: isub
      // 103: putfield erg.qd2 I
      // 106: bipush 1
      // 107: ireturn
      // 108: invokestatic yqv.g (Loov;)Loov;
      // 10b: athrow
      // 10c: aload 0
      // 10d: aload 1
      // 10e: invokevirtual yqv.hp6 (Lha9;)Z
      // 111: iload 2
      // 112: ifeq 12a
      // 115: ifeq 125
      // 118: goto 11f
      // 11b: invokestatic yqv.g (Loov;)Loov;
      // 11e: athrow
      // 11f: bipush 1
      // 120: ireturn
      // 121: invokestatic yqv.g (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: aload 1
      // 127: invokespecial Entity.k25 (Lha9;)Z
      // 12a: ireturn
   }

   public boolean hp6(ha9 var1) {
      return false;
   }

   public void r7q() {
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
      // 06: ifne 22
      // 09: getfield yqv.sum Lbdo;
      // 0c: ifnull 21
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial yqv.hnd ()V
      // 1a: goto 21
      // 1d: invokestatic yqv.g (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield yqv.tdx Z
      // 25: iload 1
      // 26: ifne 49
      // 29: ifeq 94
      // 2c: goto 33
      // 2f: invokestatic yqv.g (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: iload 1
      // 35: ifne 68
      // 38: goto 3f
      // 3b: invokestatic yqv.g (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual yqv.gzr ()Z
      // 42: goto 49
      // 45: invokestatic yqv.g (Loov;)Loov;
      // 48: athrow
      // 49: ifne 59
      // 4c: aload 0
      // 4d: bipush 1
      // 4e: bipush 1
      // 4f: invokevirtual yqv.xqh (ZZ)V
      // 52: goto 59
      // 55: invokestatic yqv.g (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: iload 1
      // 5b: ifne 8f
      // 5e: getfield yqv.vu1 Li2h;
      // 61: goto 68
      // 64: invokestatic yqv.g (Loov;)Loov;
      // 67: athrow
      // 68: ifnull 87
      // 6b: aload 0
      // 6c: iload 1
      // 6d: ifne 8f
      // 70: goto 77
      // 73: invokestatic yqv.g (Loov;)Loov;
      // 76: athrow
      // 77: getfield yqv.vu1 Li2h;
      // 7a: getfield EntityLivingBase.ma9 Z
      // 7d: ifeq 94
      // 80: goto 87
      // 83: invokestatic yqv.g (Loov;)Loov;
      // 86: athrow
      // 87: aload 0
      // 88: goto 8f
      // 8b: invokestatic yqv.g (Loov;)Loov;
      // 8e: athrow
      // 8f: bipush 1
      // 90: bipush 1
      // 91: invokevirtual yqv.xqh (ZZ)V
      // 94: return
   }

   public void xqh(boolean param1, boolean param2) {
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
      // 05: getfield yqv.tdx Z
      // 08: iload 3
      // 09: ifeq 2e
      // 0c: ifeq c4
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 0
      // 18: putfield yqv.tdx Z
      // 1b: aload 0
      // 1c: aconst_null
      // 1d: putfield yqv.vu1 Li2h;
      // 20: aload 0
      // 21: getfield yqv.oay Lt9d;
      // 24: getfield OpaquePredicate.v0f Z
      // 27: goto 2e
      // 2a: invokestatic yqv.g (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 3
      // 2f: ifeq 69
      // 32: ifne 62
      // 35: goto 3c
      // 38: invokestatic yqv.g (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 2
      // 3d: iload 3
      // 3e: ifeq 69
      // 41: goto 48
      // 44: invokestatic yqv.g (Loov;)Loov;
      // 47: athrow
      // 48: ifeq 62
      // 4b: goto 52
      // 4e: invokestatic yqv.g (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getstatic xbr.tj6 Lu7m;
      // 56: bipush 1
      // 57: invokevirtual yqv.e70 (Lu7m;I)Lnvf;
      // 5a: pop
      // 5b: goto 62
      // 5e: invokestatic yqv.g (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: getfield yqv.oay Lt9d;
      // 66: getfield OpaquePredicate.v0f Z
      // 69: iload 3
      // 6a: ifeq 78
      // 6d: ifne c4
      // 70: goto 77
      // 73: invokestatic yqv.g (Loov;)Loov;
      // 76: athrow
      // 77: iload 1
      // 78: iload 3
      // 79: ifeq 9f
      // 7c: ifeq c4
      // 7f: goto 86
      // 82: invokestatic yqv.g (Loov;)Loov;
      // 85: athrow
      // 86: aload 0
      // 87: getfield yqv.oay Lt9d;
      // 8a: iload 3
      // 8b: ifeq ad
      // 8e: goto 95
      // 91: invokestatic yqv.g (Loov;)Loov;
      // 94: athrow
      // 95: instanceof dug
      // 98: goto 9f
      // 9b: invokestatic yqv.g (Loov;)Loov;
      // 9e: athrow
      // 9f: ifeq c4
      // a2: aload 0
      // a3: getfield yqv.oay Lt9d;
      // a6: goto ad
      // a9: invokestatic yqv.g (Loov;)Loov;
      // ac: athrow
      // ad: checkcast dug
      // b0: invokevirtual dug.fp4 ()Lqpc;
      // b3: aload 0
      // b4: new net/minecraft/network/play/server/S1BPacketEntityAttach
      // b7: dup
      // b8: bipush 1
      // b9: aload 0
      // ba: aconst_null
      // bb: checkcast EntityLivingBase
      // be: invokespecial net/minecraft/network/play/server/S1BPacketEntityAttach.<init> (ILi2h;Li2h;)V
      // c1: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // c4: return
   }

   public boolean _rn() {
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
      // 05: invokevirtual yqv.hk3 ()Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifne 33
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: instanceof uv0
      // 1a: goto 21
      // 1d: invokestatic yqv.g (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic yqv.g (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean hk3() {
      return this.tdx;
   }

   public EntityLivingBase ohg() {
      return this.vu1;
   }

   public void dt4(EntityLivingBase param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 1
      // 02: putfield yqv.tdx Z
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 0
      // 09: aload 1
      // 0a: putfield yqv.vu1 Li2h;
      // 0d: istore 3
      // 0e: aload 0
      // 0f: getfield yqv.oay Lt9d;
      // 12: getfield OpaquePredicate.v0f Z
      // 15: iload 3
      // 16: ifne 24
      // 19: ifne 70
      // 1c: goto 23
      // 1f: invokestatic yqv.g (Loov;)Loov;
      // 22: athrow
      // 23: iload 2
      // 24: iload 3
      // 25: ifne 4b
      // 28: ifeq 70
      // 2b: goto 32
      // 2e: invokestatic yqv.g (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield yqv.oay Lt9d;
      // 36: iload 3
      // 37: ifne 59
      // 3a: goto 41
      // 3d: invokestatic yqv.g (Loov;)Loov;
      // 40: athrow
      // 41: instanceof dug
      // 44: goto 4b
      // 47: invokestatic yqv.g (Loov;)Loov;
      // 4a: athrow
      // 4b: ifeq 70
      // 4e: aload 0
      // 4f: getfield yqv.oay Lt9d;
      // 52: goto 59
      // 55: invokestatic yqv.g (Loov;)Loov;
      // 58: athrow
      // 59: checkcast dug
      // 5c: invokevirtual dug.fp4 ()Lqpc;
      // 5f: aload 0
      // 60: new net/minecraft/network/play/server/S1BPacketEntityAttach
      // 63: dup
      // 64: bipush 1
      // 65: aload 0
      // 66: aload 0
      // 67: getfield yqv.vu1 Li2h;
      // 6a: invokespecial net/minecraft/network/play/server/S1BPacketEntityAttach.<init> (ILi2h;Li2h;)V
      // 6d: invokevirtual qpc.si9 (Li2h;Lmz2;)V
      // 70: return
   }

   private void hnd() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yqv.i J
      // 003: ldc2_w 38137296045225
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifeq 202
      // 011: getfield yqv.tdx Z
      // 014: ifeq 201
      // 017: goto 01e
      // 01a: invokestatic yqv.g (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 3
      // 020: ifeq 202
      // 023: goto 02a
      // 026: invokestatic yqv.g (Loov;)Loov;
      // 029: athrow
      // 02a: getfield yqv.sum Lbdo;
      // 02d: ifnull 201
      // 030: goto 037
      // 033: invokestatic yqv.g (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: getfield yqv.sum Lbdo;
      // 03b: sipush 5493
      // 03e: ldc2_w 7872911127170840502
      // 041: lload 1
      // 042: lxor
      // 043: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: bipush 4
      // 04a: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 04d: iload 3
      // 04e: ifeq 158
      // 051: goto 058
      // 054: invokestatic yqv.g (Loov;)Loov;
      // 057: athrow
      // 058: ifeq 13a
      // 05b: goto 062
      // 05e: invokestatic yqv.g (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: getfield yqv.sum Lbdo;
      // 066: sipush 23941
      // 069: ldc2_w 4921676237090537306
      // 06c: lload 1
      // 06d: lxor
      // 06e: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: bipush 4
      // 075: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 078: iload 3
      // 079: ifeq 158
      // 07c: goto 083
      // 07f: invokestatic yqv.g (Loov;)Loov;
      // 082: athrow
      // 083: ifeq 13a
      // 086: goto 08d
      // 089: invokestatic yqv.g (Loov;)Loov;
      // 08c: athrow
      // 08d: new java/util/UUID
      // 090: dup
      // 091: aload 0
      // 092: getfield yqv.sum Lbdo;
      // 095: sipush 6647
      // 098: ldc2_w 5386695596433079100
      // 09b: lload 1
      // 09c: lxor
      // 09d: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: invokevirtual bdo.yn0 (Ljava/lang/String;)J
      // 0a6: aload 0
      // 0a7: getfield yqv.sum Lbdo;
      // 0aa: sipush 23068
      // 0ad: ldc2_w 7758997383538784463
      // 0b0: lload 1
      // 0b1: lxor
      // 0b2: invokedynamic v (IJ)Ljava/lang/String; bsm=yqv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: nop
      // 0b8: invokevirtual bdo.yn0 (Ljava/lang/String;)J
      // 0bb: invokespecial java/util/UUID.<init> (JJ)V
      // 0be: astore 4
      // 0c0: aload 0
      // 0c1: getfield yqv.oay Lt9d;
      // 0c4: ldc Entity
      // 0c6: nop
      // 0c7: aload 0
      // 0c8: invokevirtual yqv.aaw ()Lnh4;
      // 0cb: ldc2_w 10.0
      // 0ce: ldc2_w 10.0
      // 0d1: ldc2_w 10.0
      // 0d4: invokevirtual nh4.c2h (DDD)Lnh4;
      // 0d7: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 0da: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0df: astore 5
      // 0e1: aload 5
      // 0e3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e8: ifeq 136
      // 0eb: aload 5
      // 0ed: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f2: checkcast Entity
      // 0f5: astore 6
      // 0f7: iload 3
      // 0f8: ifeq 206
      // 0fb: iload 3
      // 0fc: ifeq 127
      // 0ff: goto 106
      // 102: invokestatic yqv.g (Loov;)Loov;
      // 105: athrow
      // 106: aload 6
      // 108: invokevirtual Entity.b_q ()Ljava/util/UUID;
      // 10b: aload 4
      // 10d: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 110: ifeq 12b
      // 113: goto 11a
      // 116: invokestatic yqv.g (Loov;)Loov;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 6
      // 11d: putfield yqv.vu1 Li2h;
      // 120: goto 127
      // 123: invokestatic yqv.g (Loov;)Loov;
      // 126: athrow
      // 127: iload 3
      // 128: ifne 136
      // 12b: iload 3
      // 12c: ifne 0e1
      // 12f: goto 136
      // 132: invokestatic yqv.g (Loov;)Loov;
      // 135: athrow
      // 136: iload 3
      // 137: ifne 201
      // 13a: aload 0
      // 13b: iload 3
      // 13c: ifeq 1fc
      // 13f: goto 146
      // 142: invokestatic yqv.g (Loov;)Loov;
      // 145: athrow
      // 146: getfield yqv.sum Lbdo;
      // 149: ldc "X"
      // 14b: nop
      // 14c: bipush 99
      // 14e: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 151: goto 158
      // 154: invokestatic yqv.g (Loov;)Loov;
      // 157: athrow
      // 158: ifeq 1f4
      // 15b: aload 0
      // 15c: iload 3
      // 15d: ifeq 1fc
      // 160: goto 167
      // 163: invokestatic yqv.g (Loov;)Loov;
      // 166: athrow
      // 167: getfield yqv.sum Lbdo;
      // 16a: ldc "Y"
      // 16c: nop
      // 16d: bipush 99
      // 16f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 172: ifeq 1f4
      // 175: goto 17c
      // 178: invokestatic yqv.g (Loov;)Loov;
      // 17b: athrow
      // 17c: aload 0
      // 17d: iload 3
      // 17e: ifeq 1fc
      // 181: goto 188
      // 184: invokestatic yqv.g (Loov;)Loov;
      // 187: athrow
      // 188: getfield yqv.sum Lbdo;
      // 18b: ldc "Z"
      // 18d: nop
      // 18e: bipush 99
      // 190: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 193: ifeq 1f4
      // 196: goto 19d
      // 199: invokestatic yqv.g (Loov;)Loov;
      // 19c: athrow
      // 19d: new mew
      // 1a0: dup
      // 1a1: aload 0
      // 1a2: getfield yqv.sum Lbdo;
      // 1a5: ldc "X"
      // 1a7: nop
      // 1a8: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1ab: aload 0
      // 1ac: getfield yqv.sum Lbdo;
      // 1af: ldc "Y"
      // 1b1: nop
      // 1b2: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1b5: aload 0
      // 1b6: getfield yqv.sum Lbdo;
      // 1b9: ldc "Z"
      // 1bb: nop
      // 1bc: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1bf: invokespecial mew.<init> (III)V
      // 1c2: astore 4
      // 1c4: aload 0
      // 1c5: getfield yqv.oay Lt9d;
      // 1c8: aload 4
      // 1ca: invokestatic ugc.es0 (Lt9d;Lmew;)Lugc;
      // 1cd: astore 5
      // 1cf: iload 3
      // 1d0: ifeq 1f0
      // 1d3: aload 5
      // 1d5: ifnonnull 1ea
      // 1d8: goto 1df
      // 1db: invokestatic yqv.g (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 0
      // 1e0: getfield yqv.oay Lt9d;
      // 1e3: aload 4
      // 1e5: invokestatic ugc.dk5 (Lt9d;Lmew;)Lugc;
      // 1e8: astore 5
      // 1ea: aload 0
      // 1eb: aload 5
      // 1ed: putfield yqv.vu1 Li2h;
      // 1f0: iload 3
      // 1f1: ifne 201
      // 1f4: aload 0
      // 1f5: goto 1fc
      // 1f8: invokestatic yqv.g (Loov;)Loov;
      // 1fb: athrow
      // 1fc: bipush 0
      // 1fd: bipush 1
      // 1fe: invokevirtual yqv.xqh (ZZ)V
      // 201: aload 0
      // 202: aconst_null
      // 203: putfield yqv.sum Lbdo;
      // 206: return
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: bipush 99
      // 07: iload 3
      // 08: ifeq 28
      // 0b: if_icmpne 1c
      // 0e: goto 15
      // 11: invokestatic yqv.g (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: istore 4
      // 18: iload 3
      // 19: ifne 60
      // 1c: iload 1
      // 1d: bipush 100
      // 1f: isub
      // 20: bipush 1
      // 21: goto 28
      // 24: invokestatic yqv.g (Loov;)Loov;
      // 27: athrow
      // 28: iadd
      // 29: istore 4
      // 2b: iload 4
      // 2d: iload 3
      // 2e: ifeq 5f
      // 31: iflt 57
      // 34: goto 3b
      // 37: invokestatic yqv.g (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 4
      // 3d: iload 3
      // 3e: ifeq 5f
      // 41: goto 48
      // 44: invokestatic yqv.g (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield yqv.b8n [Lerg;
      // 4c: arraylength
      // 4d: if_icmplt 60
      // 50: goto 57
      // 53: invokestatic yqv.g (Loov;)Loov;
      // 56: athrow
      // 57: bipush 0
      // 58: goto 5f
      // 5b: invokestatic yqv.g (Loov;)Loov;
      // 5e: athrow
      // 5f: ireturn
      // 60: aload 2
      // 61: iload 3
      // 62: ifeq 70
      // 65: ifnull b7
      // 68: goto 6f
      // 6b: invokestatic yqv.g (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 2
      // 70: invokestatic yqv.vu5 (Lerg;)I
      // 73: iload 3
      // 74: ifeq c6
      // 77: iload 4
      // 79: if_icmpeq b7
      // 7c: goto 83
      // 7f: invokestatic yqv.g (Loov;)Loov;
      // 82: athrow
      // 83: iload 4
      // 85: iload 3
      // 86: ifeq c8
      // 89: goto 90
      // 8c: invokestatic yqv.g (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 4
      // 91: if_icmpne c7
      // 94: goto 9b
      // 97: invokestatic yqv.g (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 2
      // 9c: invokevirtual erg.gn1 ()Lu7m;
      // 9f: instanceof gun
      // a2: iload 3
      // a3: ifeq c8
      // a6: goto ad
      // a9: invokestatic yqv.g (Loov;)Loov;
      // ac: athrow
      // ad: ifeq c7
      // b0: goto b7
      // b3: invokestatic yqv.g (Loov;)Loov;
      // b6: athrow
      // b7: aload 0
      // b8: iload 4
      // ba: aload 2
      // bb: invokevirtual yqv.fga (ILerg;)V
      // be: bipush 1
      // bf: goto c6
      // c2: invokestatic yqv.g (Loov;)Loov;
      // c5: athrow
      // c6: ireturn
      // c7: bipush 0
      // c8: ireturn
   }

   @Override
   public boolean de5() {
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
      // 05: invokespecial Entity.de5 ()Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual yqv.r1t ()Z
      // 1a: goto 21
      // 1d: invokestatic yqv.g (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic yqv.g (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public void x53(boolean var1) {
      int var2 = OpaquePredicate.c();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.oit;
               var10001 = 15;
               var10002 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw g(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
   }

   public boolean r1t() {
      int var1 = OpaquePredicate.b();

      try {
         byte var10000 = this.oit.miz(15);
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw g(var2);
      }

      return (boolean)0;
   }

   private boolean u36() {
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
      // 05: invokevirtual yqv.ejl ()Z
      // 08: iload 1
      // 09: ifne 20
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic yqv.g (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic yqv.g (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield yqv.gx0 I
      // 20: iload 1
      // 21: ifne 43
      // 24: ifle 34
      // 27: goto 2e
      // 2a: invokestatic yqv.g (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic yqv.g (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: iload 1
      // 36: ifne 4f
      // 39: getfield yqv.g25 I
      // 3c: goto 43
      // 3f: invokestatic yqv.g (Loov;)Loov;
      // 42: athrow
      // 43: bipush 20
      // 45: if_icmpge 4e
      // 48: bipush 0
      // 49: ireturn
      // 4a: invokestatic yqv.g (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: invokevirtual yqv.qha ()Lt9d;
      // 52: astore 2
      // 53: aload 2
      // 54: iload 1
      // 55: ifne 69
      // 58: ifnonnull 68
      // 5b: goto 62
      // 5e: invokestatic yqv.g (Loov;)Loov;
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: invokestatic yqv.g (Loov;)Loov;
      // 67: athrow
      // 68: aload 2
      // 69: getfield OpaquePredicate.rpk Ljava/util/List;
      // 6c: iload 1
      // 6d: ifne 90
      // 70: invokeinterface java/util/List.size ()I 1
      // 75: bipush 1
      // 76: if_icmpeq 86
      // 79: goto 80
      // 7c: invokestatic yqv.g (Loov;)Loov;
      // 7f: athrow
      // 80: bipush 0
      // 81: ireturn
      // 82: invokestatic yqv.g (Loov;)Loov;
      // 85: athrow
      // 86: aload 2
      // 87: getfield OpaquePredicate.rpk Ljava/util/List;
      // 8a: bipush 0
      // 8b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 90: checkcast EntityLivingBase
      // 93: astore 3
      // 94: aload 0
      // 95: getfield yqv.o2v D
      // 98: aload 3
      // 99: getfield EntityLivingBase.o2v D
      // 9c: dsub
      // 9d: invokestatic java/lang/Math.abs (D)D
      // a0: ldc2_w 16.0
      // a3: dsub
      // a4: dconst_0
      // a5: invokestatic java/lang/Math.max (DD)D
      // a8: dstore 4
      // aa: aload 0
      // ab: getfield yqv.vbd D
      // ae: aload 3
      // af: getfield EntityLivingBase.vbd D
      // b2: dsub
      // b3: invokestatic java/lang/Math.abs (D)D
      // b6: ldc2_w 16.0
      // b9: dsub
      // ba: dconst_0
      // bb: invokestatic java/lang/Math.max (DD)D
      // be: dstore 6
      // c0: dload 4
      // c2: dload 4
      // c4: dmul
      // c5: dload 6
      // c7: dload 6
      // c9: dmul
      // ca: dadd
      // cb: dstore 8
      // cd: aload 0
      // ce: dload 8
      // d0: invokevirtual yqv.xvv (D)Z
      // d3: iload 1
      // d4: ifne e2
      // d7: ifne e5
      // da: goto e1
      // dd: invokestatic yqv.g (Loov;)Loov;
      // e0: athrow
      // e1: bipush 1
      // e2: goto e6
      // e5: bipush 0
      // e6: ireturn
   }

   private void z_s() {
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
      // 05: dup
      // 06: getfield yqv.dof I
      // 09: bipush 1
      // 0a: iadd
      // 0b: putfield yqv.dof I
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 4b
      // 13: instanceof s0i
      // 16: ifeq 4a
      // 19: goto 20
      // 1c: invokestatic yqv.g (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: fconst_1
      // 22: invokevirtual yqv.xeu (F)F
      // 25: fstore 2
      // 26: iload 1
      // 27: ifeq 4e
      // 2a: fload 2
      // 2b: ldc 0.5
      // 2d: nop
      // 2e: fcmpl
      // 2f: ifle 4a
      // 32: goto 39
      // 35: invokestatic yqv.g (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: dup
      // 3b: getfield yqv.dof I
      // 3e: bipush 2
      // 3f: iadd
      // 40: putfield yqv.dof I
      // 43: goto 4a
      // 46: invokestatic yqv.g (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: invokevirtual yqv.oqm ()V
      // 4e: return
   }

   @Override
   public n_0 ued() {
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
      // 05: invokevirtual yqv.b_q ()Ljava/util/UUID;
      // 08: astore 2
      // 09: aload 0
      // 0a: iload 1
      // 0b: ifeq 31
      // 0e: getfield yqv.o1p Ljava/util/UUID;
      // 11: aload 2
      // 12: if_acmpeq 30
      // 15: goto 1c
      // 18: invokestatic yqv.g (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 2
      // 1e: putfield yqv.o1p Ljava/util/UUID;
      // 21: aload 0
      // 22: aload 2
      // 23: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 26: putfield yqv.iex Ljava/lang/String;
      // 29: goto 30
      // 2c: invokestatic yqv.g (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield yqv.oay Lt9d;
      // 34: invokevirtual OpaquePredicate.fgp ()Luci;
      // 37: aload 0
      // 38: getfield yqv.iex Ljava/lang/String;
      // 3b: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 3e: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1404810724414181602L, 2844434943442144731L, MethodHandles.lookup().lookupClass()).a(184075341255764L);
      // $VF: monitorexit
      i = var10000;
      long var0 = i ^ 90783320599373L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[32];
      int var7 = 0;
      String var6 = "\u009dC\u001a\u00854ÜÚ/:<k =\nã+\u0084`2Ø£YUx*hýÎÁ\u001eW\"(.È¼_\u0018\u000b\u0018ö¡àq9K×Ø*Ð)d± \"`ò\u001e\u0092ß\u0000U}Ô\u0006µ.åº:]o` v@×åþíÆ\u0006ï÷ÍÁ\u0014\u00102ë\rïLá\u009d\\\u0081t¯É\u001cp\u009c\u001f\u0095©\u0010êîc}\u009dB\u0094·§V\u0005\u008bLÙ+B G[\u009f:?\u0094ðÚ]É\u00876\u0003\u0082s2ÈY\u008dCT÷~\u008f/\u009bÌUúEÐ\b\u0010\u0011\u009cj·Êç*×Íæa\u0010Â´\u0083¼ \u0015-Õ1Û\f¿\r\u009eàÏJ½»0\u008e\u009ciõ\r[¿\u000e8\u008aò\u00121ä\u009dd\u0015 4\u009fw2ª¢\u0095ÆÙÄ;OÏ\u0084íq÷ÖÑ+õÛ\r[Ãø´Ç\u0080rà»\u0010¯ò?øzmY??#i\u0004R\u009cóA 0Nú6´\u0087\u0005è\u0080\u00ad\u001e\u0013\u0099÷é\u0091X\u0082cú)æ\u0005ô\u001e:¹HPîx\u0080\u0010\u00192\u009a´ý\u0099\u007f\u001b0»Ê\u0017Ò\u00940\u0094 \u001b\u0091Ó\u00ad\u0004)\u00940ÒQ\u008b<¥BüÚ\u0005\u0018][ß\u0097ó\"\u009aßmÇc«<\u0010 ¸Þñ+N\u009bÉ\u0012I)Î|P~M\u009bh#ý²¤¹\u0091~ë\nµ²=µ`:\u0010\u0094\u001c&\u00ad\u0005.\u00901\u0002í¿!ÅÀ`\u00160»{qg\u0083gð\u0085}q·õl0îhjÙqe{ÙÝåG<bs.\b¨Xê\u008d³A%ÕB\u0018\u0019\u009d\u0091\u009dR/\u0098\u0091\u0010sm5\u009e\u009fDhUÆ\\\u001cù¥ÖÈ¬\u0010w \u001f\u007fè\u0019SûÐ\u0090Å´\u0004\u0093M\u0085\u00180 ¾B#{D\u0014Ûµ¢B\u009c°âá\u009aµ\u0080×3^Óª }A(^C\u007fËkýW\u0080«nIF\"^(nRð\u0014»=1\u008f\u0095\u0018\u0085«R\u0011 ¿\\á-\u0013\u0018èÝ\u007f\u00ad\u001ej\u0083²MóX¿cô.\u0011\föÞÞ\u009a(<\u0098zÔ\u0018ç\u0082\u009e|Ô)\nnÐ\fÑGjuL\u000en÷0R\u0086û`\u000e\u0010î\u001fâ\u0013¯»`\u0089t\u0005Á}ß×jÛ \u0000º5aØÎ<¨ÜÎ¾;¨±\u0011\u0097\u008bÁpe\u008cuY5\u0090\u0007Æå÷M+\u0001 ñ\u0084ÕwêU4Ãe|µø{\u0099\u000fâ5W.QD\u008e\u008aÂ\u0091½\u008aú\u008e\u0085dõ ×»¯qÛ\u0086\u001c\u001c¥\n\fõIÛö\u008a$WïWØ\u00adývd¼¯\u0017ñg\u0007·\u0018Ø\u0093êEß\u0096,Ý¤\u0083ab\u0089\u000f\u0001Á\u001búåGÖ\u0081ó¼\u0010:ï>èî(\u0087M8\f£¤n\u0098Dè\u0010O(gð²uøã'ÇY\u009b¥ ðÕ ãÓ¶è\u008bà}0¿A^ Â)3\u009eüÿ\u0098\u008crâAÂtkè7*gg\u009d\u0010:\u000bï\u0089d\u001a¸B\u0019sRÍE¤\t|";
      int var8 = "\u009dC\u001a\u00854ÜÚ/:<k =\nã+\u0084`2Ø£YUx*hýÎÁ\u001eW\"(.È¼_\u0018\u000b\u0018ö¡àq9K×Ø*Ð)d± \"`ò\u001e\u0092ß\u0000U}Ô\u0006µ.åº:]o` v@×åþíÆ\u0006ï÷ÍÁ\u0014\u00102ë\rïLá\u009d\\\u0081t¯É\u001cp\u009c\u001f\u0095©\u0010êîc}\u009dB\u0094·§V\u0005\u008bLÙ+B G[\u009f:?\u0094ðÚ]É\u00876\u0003\u0082s2ÈY\u008dCT÷~\u008f/\u009bÌUúEÐ\b\u0010\u0011\u009cj·Êç*×Íæa\u0010Â´\u0083¼ \u0015-Õ1Û\f¿\r\u009eàÏJ½»0\u008e\u009ciõ\r[¿\u000e8\u008aò\u00121ä\u009dd\u0015 4\u009fw2ª¢\u0095ÆÙÄ;OÏ\u0084íq÷ÖÑ+õÛ\r[Ãø´Ç\u0080rà»\u0010¯ò?øzmY??#i\u0004R\u009cóA 0Nú6´\u0087\u0005è\u0080\u00ad\u001e\u0013\u0099÷é\u0091X\u0082cú)æ\u0005ô\u001e:¹HPîx\u0080\u0010\u00192\u009a´ý\u0099\u007f\u001b0»Ê\u0017Ò\u00940\u0094 \u001b\u0091Ó\u00ad\u0004)\u00940ÒQ\u008b<¥BüÚ\u0005\u0018][ß\u0097ó\"\u009aßmÇc«<\u0010 ¸Þñ+N\u009bÉ\u0012I)Î|P~M\u009bh#ý²¤¹\u0091~ë\nµ²=µ`:\u0010\u0094\u001c&\u00ad\u0005.\u00901\u0002í¿!ÅÀ`\u00160»{qg\u0083gð\u0085}q·õl0îhjÙqe{ÙÝåG<bs.\b¨Xê\u008d³A%ÕB\u0018\u0019\u009d\u0091\u009dR/\u0098\u0091\u0010sm5\u009e\u009fDhUÆ\\\u001cù¥ÖÈ¬\u0010w \u001f\u007fè\u0019SûÐ\u0090Å´\u0004\u0093M\u0085\u00180 ¾B#{D\u0014Ûµ¢B\u009c°âá\u009aµ\u0080×3^Óª }A(^C\u007fËkýW\u0080«nIF\"^(nRð\u0014»=1\u008f\u0095\u0018\u0085«R\u0011 ¿\\á-\u0013\u0018èÝ\u007f\u00ad\u001ej\u0083²MóX¿cô.\u0011\föÞÞ\u009a(<\u0098zÔ\u0018ç\u0082\u009e|Ô)\nnÐ\fÑGjuL\u000en÷0R\u0086û`\u000e\u0010î\u001fâ\u0013¯»`\u0089t\u0005Á}ß×jÛ \u0000º5aØÎ<¨ÜÎ¾;¨±\u0011\u0097\u008bÁpe\u008cuY5\u0090\u0007Æå÷M+\u0001 ñ\u0084ÕwêU4Ãe|µø{\u0099\u000fâ5W.QD\u008e\u008aÂ\u0091½\u008aú\u008e\u0085dõ ×»¯qÛ\u0086\u001c\u001c¥\n\fõIÛö\u008a$WïWØ\u00adývd¼¯\u0017ñg\u0007·\u0018Ø\u0093êEß\u0096,Ý¤\u0083ab\u0089\u000f\u0001Á\u001búåGÖ\u0081ó¼\u0010:ï>èî(\u0087M8\f£¤n\u0098Dè\u0010O(gð²uøã'ÇY\u009b¥ ðÕ ãÓ¶è\u008bà}0¿A^ Â)3\u009eüÿ\u0098\u008crâAÂtkè7*gg\u009d\u0010:\u000bï\u0089d\u001a¸B\u0019sRÍE¤\t|"
         .length();
      char var5 = ' ';
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
                     p = var9;
                     q = new String[32];
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

                  var6 = "\nxbÙÎË \u000eÃ|)`Lßã\u0082»eM]Ón²\u0090F&úµöË\u009d\u009cm¨y\u008a|¤\u0081Ø T\u0007,\u0082Yc\u0005\u0017TÀXoB\u0097!ÆÏh%ÔN³\u001cÒ1Ñkc\u0003Lä«";
                  var8 = "\nxbÙÎË \u000eÃ|)`Lßã\u0082»eM]Ón²\u0090F&úµöË\u009d\u009cm¨y\u008a|¤\u0081Ø T\u0007,\u0082Yc\u0005\u0017TÀXoB\u0097!ÆÏh%ÔN³\u001cÒ1Ñkc\u0003Lä«"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov g(oov var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13912;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])r.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("yqv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = p[var5].getBytes("ISO-8859-1");
         q[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("yqv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
