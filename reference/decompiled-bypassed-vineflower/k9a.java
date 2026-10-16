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

public abstract class k9a extends j37 implements ipt {
   public n3z adl = new n3z(this);
   private static final long h;
   private static final String[] y;
   private static final String[] z;
   private static final Map A = new HashMap(13);

   public k9a(t9d var1) {
      super(var1);
      this.pe8();
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)0);
      this.oit.kp2(17, "");
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
      // 00: getstatic k9a.h J
      // 03: ldc2_w 133417938976213
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial j37.srs (Lbdo;)V
      // 12: iload 4
      // 14: ifne 41
      // 17: aload 0
      // 18: invokevirtual k9a.g6v ()Ljava/lang/String;
      // 1b: ifnonnull 46
      // 1e: goto 25
      // 21: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 1
      // 26: sipush 15201
      // 29: ldc2_w 2358168772639585531
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic m (IJ)Ljava/lang/String; bsm=k9a.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: ldc ""
      // 36: nop
      // 37: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 3a: goto 41
      // 3d: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: iload 4
      // 43: ifeq 63
      // 46: aload 1
      // 47: sipush 12486
      // 4a: ldc2_w 4762649713577328477
      // 4d: lload 2
      // 4e: lxor
      // 4f: invokedynamic m (IJ)Ljava/lang/String; bsm=k9a.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: nop
      // 55: aload 0
      // 56: invokevirtual k9a.g6v ()Ljava/lang/String;
      // 59: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 5c: goto 63
      // 5f: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: aload 1
      // 64: sipush 13351
      // 67: ldc2_w 6472781867289508798
      // 6a: lload 2
      // 6b: lxor
      // 6c: invokedynamic m (IJ)Ljava/lang/String; bsm=k9a.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: nop
      // 72: aload 0
      // 73: invokevirtual k9a.ird ()Z
      // 76: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 79: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void cjb(bdo var1) {
      long var2 = h ^ 17564495548798L;
      super.cjb(var1);
      int var10000 = t9d.c();
      String var5 = "";
      int var4 = var10000;

      label47: {
         String var10001;
         label54: {
            label51: {
               try {
                  var12 = var1;
                  var10001 = f<"m">(12486, 4762593989511287798L ^ var2);
                  if (var4 != 0) {
                     break label54;
                  }

                  if (!var1.inh(var10001, 8)) {
                     break label51;
                  }
               } catch (IllegalArgumentException var10) {
                  throw a(var10);
               }

               var5 = var1.u14(f<"m">(12486, 4762593989511287798L ^ var2));

               try {
                  if (var4 == 0) {
                     break label47;
                  }
               } catch (IllegalArgumentException var9) {
                  boolean var14 = false;
                  throw a(var9);
               }
            }

            try {
               var12 = var1;
               var10001 = f<"m">(5483, 2561358309675939416L ^ var2);
            } catch (IllegalArgumentException var8) {
               boolean var15 = false;
               throw a(var8);
            }
         }

         String var6 = var12.u14(var10001);
         var5 = is3.mb9(var6);
      }

      try {
         if (var5.length() > 0) {
            this.gv6(var5);
            this.j9h(true);
         }
      } catch (IllegalArgumentException var7) {
         throw a(var7);
      }

      this.adl.spo(var1.dvl(f<"m">(9283, 7230006846922393462L ^ var2)));
      this.xxq(var1.dvl(f<"m">(9283, 7230006846922393462L ^ var2)));
   }

   public void skd(boolean var1) {
      int var2 = t9d.b();
      w_0 var3 = w_0.mwm;

      byte var10000;
      label31: {
         label30: {
            try {
               var10000 = var1;
               if (var2 == 0) {
                  break label31;
               }

               if (var1 != 0) {
                  break label30;
               }
            } catch (IllegalArgumentException var11) {
               throw a(var11);
            }

            var3 = w_0.bac;
         }

         var10000 = 0;
      }

      int var4 = var10000;

      while (var4 < 7) {
         double var5 = this.z2d.nextGaussian() * 0.02;
         double var7 = this.z2d.nextGaussian() * 0.02;
         double var9 = this.z2d.nextGaussian() * 0.02;
         this.oay
            .zvy(
               var3,
               this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
               this.kfp + 0.5 + (double)(this.z2d.nextFloat() * this.ikl),
               this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
               var5,
               var7,
               var9,
               new int[0]
            );
         var4++;
         if (var2 == 0) {
            break;
         }
      }
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
      // 05: bipush 7
      // 07: iload 2
      // 08: ifne 2f
      // 0b: if_icmpne 25
      // 0e: goto 15
      // 11: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14: athrow
      // 15: aload 0
      // 16: bipush 1
      // 17: invokevirtual k9a.skd (Z)V
      // 1a: iload 2
      // 1b: ifeq 4e
      // 1e: goto 25
      // 21: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: iload 1
      // 26: bipush 6
      // 28: goto 2f
      // 2b: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e: athrow
      // 2f: if_icmpne 42
      // 32: aload 0
      // 33: bipush 0
      // 34: invokevirtual k9a.skd (Z)V
      // 37: iload 2
      // 38: ifeq 4e
      // 3b: goto 42
      // 3e: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aload 0
      // 43: iload 1
      // 44: invokespecial j37.ptf (B)V
      // 47: goto 4e
      // 4a: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: return
   }

   public boolean j1j() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(16) & 4;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void j9h(boolean param1) {
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
      // 05: getfield k9a.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: istore 3
      // 0e: iload 2
      // 0f: ifeq 34
      // 12: iload 1
      // 13: ifeq 38
      // 16: goto 1d
      // 19: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield k9a.oit Lwl1;
      // 21: bipush 16
      // 23: iload 3
      // 24: bipush 4
      // 25: ior
      // 26: i2b
      // 27: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2a: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2d: goto 34
      // 30: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: iload 2
      // 35: ifne 50
      // 38: aload 0
      // 39: getfield k9a.oit Lwl1;
      // 3c: bipush 16
      // 3e: iload 3
      // 3f: bipush -5
      // 41: iand
      // 42: i2b
      // 43: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 46: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 49: goto 50
      // 4c: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: aload 0
      // 51: invokevirtual k9a.pe8 ()V
      // 54: return
   }

   public void pe8() {
   }

   public boolean ird() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void xxq(boolean param1) {
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
      // 05: getfield k9a.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: istore 3
      // 0e: iload 2
      // 0f: ifne 34
      // 12: iload 1
      // 13: ifeq 38
      // 16: goto 1d
      // 19: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield k9a.oit Lwl1;
      // 21: bipush 16
      // 23: iload 3
      // 24: bipush 1
      // 25: ior
      // 26: i2b
      // 27: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2a: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2d: goto 34
      // 30: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: iload 2
      // 35: ifeq 50
      // 38: aload 0
      // 39: getfield k9a.oit Lwl1;
      // 3c: bipush 16
      // 3e: iload 3
      // 3f: bipush -2
      // 41: iand
      // 42: i2b
      // 43: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 46: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 49: goto 50
      // 4c: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: return
   }

   @Override
   public String g6v() {
      return this.oit.bsd(17);
   }

   public void gv6(String var1) {
      this.oit.c66(17, var1);
   }

   public g_3 ifk() {
      try {
         UUID var1 = UUID.fromString(this.g6v());

         try {
            if (var1 == null) {
               return null;
            }
         } catch (IllegalArgumentException var2) {
            throw a(var2);
         }

         return this.oay.hlz(var1);
      } catch (IllegalArgumentException var3) {
         return null;
      }
   }

   public boolean j12(g_3 var1) {
      try {
         if (var1 == this.ifk()) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return false;
   }

   public n3z f_j() {
      return this.adl;
   }

   public boolean ssb(g_3 var1, g_3 var2) {
      return true;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 34
      // 09: invokevirtual k9a.j1j ()Z
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 34
      // 1b: goto 22
      // 1e: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: invokevirtual k9a.ifk ()Lg_3;
      // 25: astore 2
      // 26: aload 2
      // 27: ifnull 33
      // 2a: aload 2
      // 2b: invokevirtual g_3.ued ()Ln_0;
      // 2e: areturn
      // 2f: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 0
      // 34: invokespecial j37.ued ()Ln_0;
      // 37: areturn
   }

   @Override
   public boolean g7h(g_3 param1) {
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
      // 05: invokevirtual k9a.j1j ()Z
      // 08: iload 2
      // 09: ifne 4b
      // 0c: ifeq 46
      // 0f: goto 16
      // 12: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual k9a.ifk ()Lg_3;
      // 1a: astore 3
      // 1b: aload 1
      // 1c: iload 2
      // 1d: ifne 32
      // 20: aload 3
      // 21: if_acmpne 31
      // 24: goto 2b
      // 27: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: bipush 1
      // 2c: ireturn
      // 2d: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: aload 3
      // 32: iload 2
      // 33: ifne 41
      // 36: ifnull 46
      // 39: goto 40
      // 3c: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: aload 3
      // 41: aload 1
      // 42: invokevirtual g_3.g7h (Lg_3;)Z
      // 45: ireturn
      // 46: aload 0
      // 47: aload 1
      // 48: invokespecial j37.g7h (Lg_3;)Z
      // 4b: ireturn
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
      // 00: getstatic k9a.h J
      // 03: ldc2_w 42180376682818
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne a1
      // 13: getfield k9a.oay Lt9d;
      // 16: getfield t9d.v0f Z
      // 19: ifne a0
      // 1c: goto 23
      // 1f: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: aload 0
      // 24: iload 4
      // 26: ifne a1
      // 29: goto 30
      // 2c: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f: athrow
      // 30: getfield k9a.oay Lt9d;
      // 33: invokevirtual t9d.eir ()Lef9;
      // 36: sipush 32708
      // 39: ldc2_w 3209735383449447628
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic m (IJ)Ljava/lang/String; bsm=k9a.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: nop
      // 44: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 47: ifeq a0
      // 4a: goto 51
      // 4d: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 50: athrow
      // 51: aload 0
      // 52: iload 4
      // 54: ifne a1
      // 57: goto 5e
      // 5a: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: invokevirtual k9a.qrh ()Z
      // 61: ifeq a0
      // 64: goto 6b
      // 67: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: iload 4
      // 6e: ifne a1
      // 71: goto 78
      // 74: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77: athrow
      // 78: invokevirtual k9a.ifk ()Lg_3;
      // 7b: instanceof z96
      // 7e: ifeq a0
      // 81: goto 88
      // 84: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 87: athrow
      // 88: aload 0
      // 89: invokevirtual k9a.ifk ()Lg_3;
      // 8c: checkcast z96
      // 8f: aload 0
      // 90: invokevirtual k9a.ii6 ()Lw0s;
      // 93: invokevirtual w0s.bus ()Lekw;
      // 96: invokevirtual z96.a0d (Lekw;)V
      // 99: goto a0
      // 9c: invokestatic k9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9f: athrow
      // a0: aload 0
      // a1: aload 1
      // a2: invokespecial j37.owu (Lofh;)V
      // a5: return
   }

   @Override
   public i2h ifk() {
      return this.ifk();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8125691432504139428L, 1136305669435069093L, MethodHandles.lookup().lookupClass()).a(233662299442349L);
      // $VF: monitorexit
      h = var10000;
      long var0 = h ^ 114425357329618L;
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
      String var6 = "´ï¸Í§\u00981\u0093.\u0084\u001dÌk\u0011ë\u008az-IaÃ\u0098p5oÇ¤|\u0018j\u0080é qÌüÖ\u001eË¬ëÊ\u000e\u0089\u0005\\emcQw¥\u009c\u0002\u0004\u008c¢\u000f\u0081Oóé\u0098Ãn\u0010Ö\n\u009ff\tÓ\t=\u0081_n\u0084\u0096èkM\u0010\u000fÇ\u008aL[Õõt\u0000Àýz½I¸I";
      int var8 = "´ï¸Í§\u00981\u0093.\u0084\u001dÌk\u0011ë\u008az-IaÃ\u0098p5oÇ¤|\u0018j\u0080é qÌüÖ\u001eË¬ëÊ\u000e\u0089\u0005\\emcQw¥\u009c\u0002\u0004\u008c¢\u000f\u0081Oóé\u0098Ãn\u0010Ö\n\u009ff\tÓ\t=\u0081_n\u0084\u0096èkM\u0010\u000fÇ\u008aL[Õõt\u0000Àýz½I¸I"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = g(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     y = var9;
                     z = new String[6];
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

                  var6 = "A]\u0083M\u0005ËPâÅã1ëå\u009e\u0084\u0081(HFÑvo®òUú\u001cÝÆù×iF\u000b\u008e^ã\b£DB\rè¹õ3g¾VÜ®\u001fK\u0018äcR";
                  var8 = "A]\u0083M\u0005ËPâÅã1ëå\u009e\u0084\u0081(HFÑvo®òUú\u001cÝÆù×iF\u000b\u008e^ã\b£DB\rè¹õ3g¾VÜ®\u001fK\u0018äcR".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private static String g(byte[] var0) {
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

   private static String f(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29686;
      if (z[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])A.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               A.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("k9a", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = y[var5].getBytes("ISO-8859-1");
         z[var5] = g(((Cipher)var4[0]).doFinal(var9));
      }

      return z[var5];
   }

   private static Object f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("k9a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
