package net.minecraft.tileentity;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TileEntityHopper extends TileEntityLockable implements vtv, xcy {
   public int aww = -1;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void agl(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityHopper.a J
      // 03: ldc2_w 24927749377244
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial net/minecraft/tileentity/TileEntityLockable.agl (Lbdo;)V
      // 0d: aload 1
      // 0e: sipush 141
      // 11: ldc2_w 8408574684329791559
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityHopper.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: bipush 10
      // 1e: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 21: astore 5
      // 23: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 26: aload 0
      // 27: aload 0
      // 28: invokevirtual net/minecraft/tileentity/TileEntityHopper.opt ()I
      // 2b: anewarray 31
      // 2e: putfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 31: astore 4
      // 33: aload 1
      // 34: sipush 1894
      // 37: ldc2_w 2595021825248712609
      // 3a: lload 2
      // 3b: lxor
      // 3c: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityHopper.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: nop
      // 42: bipush 8
      // 44: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 47: aload 4
      // 49: ifnonnull 8a
      // 4c: ifeq 73
      // 4f: goto 56
      // 52: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: aload 1
      // 58: sipush 13593
      // 5b: ldc2_w 2267162929290503643
      // 5e: lload 2
      // 5f: lxor
      // 60: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityHopper.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: nop
      // 66: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 69: putfield net/minecraft/tileentity/TileEntityHopper.skp Ljava/lang/String;
      // 6c: goto 73
      // 6f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: aload 1
      // 75: sipush 10240
      // 78: ldc2_w 2846354526086330560
      // 7b: lload 2
      // 7c: lxor
      // 7d: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityHopper.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: nop
      // 83: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 86: putfield net/minecraft/tileentity/TileEntityHopper.aww I
      // 89: bipush 0
      // 8a: istore 6
      // 8c: iload 6
      // 8e: aload 5
      // 90: invokevirtual qhg.vek ()I
      // 93: if_icmpge f1
      // 96: aload 5
      // 98: iload 6
      // 9a: invokevirtual qhg.kd6 (I)Lbdo;
      // 9d: astore 7
      // 9f: aload 7
      // a1: sipush 2954
      // a4: ldc2_w 7149272702441511758
      // a7: lload 2
      // a8: lxor
      // a9: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityHopper.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: nop
      // af: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // b2: istore 8
      // b4: aload 4
      // b6: ifnonnull ec
      // b9: iload 8
      // bb: iflt e9
      // be: goto c5
      // c1: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // c4: athrow
      // c5: iload 8
      // c7: aload 0
      // c8: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // cb: arraylength
      // cc: if_icmpge e9
      // cf: goto d6
      // d2: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // d5: athrow
      // d6: aload 0
      // d7: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // da: iload 8
      // dc: aload 7
      // de: invokestatic erg.qog (Lbdo;)Lerg;
      // e1: aastore
      // e2: goto e9
      // e5: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // e8: athrow
      // e9: iinc 6 1
      // ec: aload 4
      // ee: ifnull 8c
      // f1: return
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 106745781348352L;
      super.m2a(var1);
      int[] var10000 = TileEntityBeacon$yv7.b();
      qhg var5 = new qhg();
      int[] var4 = var10000;
      int var6 = 0;

      String var10001;
      TileEntityHopper var10002;
      label46: {
         while (true) {
            if (var6 < this.s6z.length) {
               label41: {
                  try {
                     var11 = this;
                     if (var4 != null) {
                        break;
                     }

                     if (this.s6z[var6] == null) {
                        break label41;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  bdo var7 = new bdo();
                  var7.atr(b<"y">(4431, 749036401912653142L ^ var2), (byte)var6);
                  this.s6z[var6].zy4(var7);
                  var5.w2j(var7);
               }

               var6++;
               if (var4 == null) {
                  continue;
               }
            }

            try {
               var1.rzm(b<"y">(32427, 9915255211248305L ^ var2), var5);
               var12 = var1;
               var10001 = b<"y">(31729, 4408103395217100780L ^ var2);
               var10002 = this;
               if (var4 != null) {
                  break label46;
               }

               var1.iin(var10001, this.aww);
               var11 = this;
               break;
            } catch (oov var9) {
               throw a(var9);
            }
         }

         try {
            if (!var11.qrh()) {
               return;
            }

            var12 = var1;
            var10001 = b<"y">(13593, 2267249130379018503L ^ var2);
            var10002 = this;
         } catch (oov var8) {
            throw a(var8);
         }
      }

      var12.rjq(var10001, var10002.skp);
   }

   @Override
   public void r5t() {
      super.r5t();
   }

   @Override
   public int opt() {
      return this.s6z.length;
   }

   @Override
   public erg ibn(int var1) {
      return this.s6z[var1];
   }

   @Override
   public erg afc(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 3
      // 0b: ifnonnull 25
      // 0e: ifnull 7d
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 3
      // 26: ifnonnull 53
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 49
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 4
      // 48: areturn
      // 49: aload 0
      // 4a: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 4d: iload 1
      // 4e: aaload
      // 4f: iload 2
      // 50: invokevirtual erg.amj (I)Lerg;
      // 53: astore 4
      // 55: aload 0
      // 56: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 59: iload 1
      // 5a: aaload
      // 5b: aload 3
      // 5c: ifnonnull 7c
      // 5f: getfield erg.qd2 I
      // 62: ifne 7a
      // 65: goto 6c
      // 68: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 70: iload 1
      // 71: aconst_null
      // 72: aastore
      // 73: goto 7a
      // 76: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 4
      // 7c: areturn
      // 7d: aconst_null
      // 7e: areturn
   }

   @Override
   public erg yvk(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 2
      // 0b: ifnonnull 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 2a: iload 1
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public void cxl(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 08: iload 1
      // 09: aload 2
      // 0a: aastore
      // 0b: aload 2
      // 0c: aload 3
      // 0d: ifnonnull 1b
      // 10: ifnull 3f
      // 13: goto 1a
      // 16: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 3
      // 1c: ifnonnull 38
      // 1f: getfield erg.qd2 I
      // 22: aload 0
      // 23: invokevirtual net/minecraft/tileentity/TileEntityHopper.v6l ()I
      // 26: if_icmple 3f
      // 29: goto 30
      // 2c: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 2
      // 31: goto 38
      // 34: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: invokevirtual net/minecraft/tileentity/TileEntityHopper.v6l ()I
      // 3c: putfield erg.qd2 I
      // 3f: return
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
      // 00: getstatic net/minecraft/tileentity/TileEntityHopper.a J
      // 03: ldc2_w 139928343139969
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityHopper.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityHopper.skp Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 3969
      // 2f: ldc2_w 4884092446718166303
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityHopper.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: areturn
   }

   @Override
   public boolean qrh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.skp Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityHopper.skp Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void owa(String var1) {
      this.skp = var1;
   }

   @Override
   public int v6l() {
      return 64;
   }

   @Override
   public boolean dnv(ha9 var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      try {
         if (this.yh_.getTileEntity(this.al2) != this) {
            return (boolean)0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         double var5;
         int var10000 = (var5 = var1.p53((double)this.al2.getX() + 0.5, (double)this.al2.getY() + 0.5, (double)this.al2.getZ() + 0.5) - 64.0) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var2 != null) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.yh_ Lt9d;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 66
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityHopper.yh_ Lt9d;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 20: athrow
      // 21: getfield OpaquePredicate.v0f Z
      // 24: aload 1
      // 25: ifnonnull 47
      // 28: ifne 66
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: dup
      // 34: getfield net/minecraft/tileentity/TileEntityHopper.aww I
      // 37: bipush 1
      // 38: isub
      // 39: putfield net/minecraft/tileentity/TileEntityHopper.aww I
      // 3c: aload 0
      // 3d: invokevirtual net/minecraft/tileentity/TileEntityHopper.um2 ()Z
      // 40: goto 47
      // 43: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 1
      // 48: ifnonnull 65
      // 4b: ifne 66
      // 4e: goto 55
      // 51: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: bipush 0
      // 57: invokevirtual net/minecraft/tileentity/TileEntityHopper.k4i (I)V
      // 5a: aload 0
      // 5b: invokevirtual net/minecraft/tileentity/TileEntityHopper.gi1 ()Z
      // 5e: goto 65
      // 61: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 64: athrow
      // 65: pop
      // 66: return
   }

   public boolean gi1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.yh_ Lt9d;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull e8
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityHopper.yh_ Lt9d;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 20: athrow
      // 21: getfield OpaquePredicate.v0f Z
      // 24: aload 1
      // 25: ifnonnull e9
      // 28: ifne e8
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual net/minecraft/tileentity/TileEntityHopper.um2 ()Z
      // 36: aload 1
      // 37: ifnonnull e7
      // 3a: goto 41
      // 3d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 40: athrow
      // 41: ifne e6
      // 44: goto 4b
      // 47: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual net/minecraft/tileentity/TileEntityHopper.hvh ()I
      // 4f: invokestatic a4v.wu4 (I)Z
      // 52: aload 1
      // 53: ifnonnull e7
      // 56: goto 5d
      // 59: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 5c: athrow
      // 5d: ifeq e6
      // 60: goto 67
      // 63: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 66: athrow
      // 67: bipush 0
      // 68: istore 2
      // 69: aload 0
      // 6a: invokespecial net/minecraft/tileentity/TileEntityHopper._uw ()Z
      // 6d: aload 1
      // 6e: ifnonnull 84
      // 71: ifne 80
      // 74: goto 7b
      // 77: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: invokespecial net/minecraft/tileentity/TileEntityHopper.c6w ()Z
      // 7f: istore 2
      // 80: aload 0
      // 81: invokespecial net/minecraft/tileentity/TileEntityHopper.qle ()Z
      // 84: aload 1
      // 85: ifnonnull c8
      // 88: ifne c7
      // 8b: goto 92
      // 8e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 0
      // 93: invokestatic net/minecraft/tileentity/TileEntityHopper.m_l (Lvtv;)Z
      // 96: aload 1
      // 97: ifnonnull c2
      // 9a: goto a1
      // 9d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // a0: athrow
      // a1: ifne c1
      // a4: goto ab
      // a7: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // aa: athrow
      // ab: iload 2
      // ac: aload 1
      // ad: ifnonnull c2
      // b0: goto b7
      // b3: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // b6: athrow
      // b7: ifeq c5
      // ba: goto c1
      // bd: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // c0: athrow
      // c1: bipush 1
      // c2: goto c6
      // c5: bipush 0
      // c6: istore 2
      // c7: iload 2
      // c8: aload 1
      // c9: ifnonnull e7
      // cc: ifeq e6
      // cf: goto d6
      // d2: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // d5: athrow
      // d6: aload 0
      // d7: bipush 8
      // d9: invokevirtual net/minecraft/tileentity/TileEntityHopper.k4i (I)V
      // dc: aload 0
      // dd: invokevirtual net/minecraft/tileentity/TileEntityHopper.r5t ()V
      // e0: bipush 1
      // e1: ireturn
      // e2: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // e5: athrow
      // e6: bipush 0
      // e7: ireturn
      // e8: bipush 0
      // e9: ireturn
   }

   private boolean _uw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 04: astore 2
      // 05: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 08: aload 2
      // 09: arraylength
      // 0a: istore 3
      // 0b: astore 1
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: iload 3
      // 12: if_icmpge 38
      // 15: aload 2
      // 16: iload 4
      // 18: aaload
      // 19: astore 5
      // 1b: aload 1
      // 1c: ifnonnull 34
      // 1f: aload 5
      // 21: ifnull 31
      // 24: goto 2b
      // 27: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 30: athrow
      // 31: iinc 4 1
      // 34: aload 1
      // 35: ifnull 0f
      // 38: bipush 1
      // 39: ireturn
   }

   private boolean qle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/tileentity/TileEntityHopper.s6z [Lerg;
      // 04: astore 2
      // 05: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 08: aload 2
      // 09: arraylength
      // 0a: istore 3
      // 0b: astore 1
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: iload 3
      // 12: if_icmpge 53
      // 15: aload 2
      // 16: iload 4
      // 18: aaload
      // 19: astore 5
      // 1b: aload 5
      // 1d: aload 1
      // 1e: ifnonnull 2d
      // 21: ifnull 43
      // 24: goto 2b
      // 27: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 5
      // 2d: getfield erg.qd2 I
      // 30: aload 1
      // 31: ifnonnull 4b
      // 34: aload 5
      // 36: invokevirtual erg.h4s ()I
      // 39: if_icmpeq 4c
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 0
      // 44: goto 4b
      // 47: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ireturn
      // 4c: iinc 4 1
      // 4f: aload 1
      // 50: ifnull 0f
      // 53: bipush 1
      // 54: ireturn
   }

   private boolean c6w() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: invokespecial net/minecraft/tileentity/TileEntityHopper.cz1 ()Lrsi;
      // 08: astore 2
      // 09: aload 2
      // 0a: ifnonnull 13
      // 0d: bipush 0
      // 0e: ireturn
      // 0f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual net/minecraft/tileentity/TileEntityHopper.hvh ()I
      // 17: invokestatic a4v.fb4 (I)Lvt2;
      // 1a: invokevirtual vt2.b4b ()Lvt2;
      // 1d: astore 3
      // 1e: aload 0
      // 1f: aload 2
      // 20: aload 3
      // 21: invokespecial net/minecraft/tileentity/TileEntityHopper.ivn (Lrsi;Lvt2;)Z
      // 24: aload 1
      // 25: ifnonnull 39
      // 28: ifeq 38
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 0
      // 39: istore 4
      // 3b: iload 4
      // 3d: aload 0
      // 3e: invokevirtual net/minecraft/tileentity/TileEntityHopper.opt ()I
      // 41: if_icmpge c0
      // 44: aload 0
      // 45: iload 4
      // 47: invokevirtual net/minecraft/tileentity/TileEntityHopper.ibn (I)Lerg;
      // 4a: aload 1
      // 4b: ifnonnull 68
      // 4e: ifnull b9
      // 51: goto 58
      // 54: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: iload 4
      // 5b: invokevirtual net/minecraft/tileentity/TileEntityHopper.ibn (I)Lerg;
      // 5e: invokevirtual erg.yaq ()Lerg;
      // 61: goto 68
      // 64: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 67: athrow
      // 68: astore 5
      // 6a: aload 2
      // 6b: aload 0
      // 6c: iload 4
      // 6e: bipush 1
      // 6f: invokevirtual net/minecraft/tileentity/TileEntityHopper.afc (II)Lerg;
      // 72: aload 3
      // 73: invokestatic net/minecraft/tileentity/TileEntityHopper.sop (Lrsi;Lerg;Lvt2;)Lerg;
      // 76: astore 6
      // 78: aload 1
      // 79: ifnonnull af
      // 7c: aload 6
      // 7e: ifnull a2
      // 81: goto 88
      // 84: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 6
      // 8a: getfield erg.qd2 I
      // 8d: aload 1
      // 8e: ifnonnull b0
      // 91: goto 98
      // 94: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 97: athrow
      // 98: ifne b1
      // 9b: goto a2
      // 9e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 2
      // a3: invokeinterface rsi.r5t ()V 1
      // a8: goto af
      // ab: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // ae: athrow
      // af: bipush 1
      // b0: ireturn
      // b1: aload 0
      // b2: iload 4
      // b4: aload 5
      // b6: invokevirtual net/minecraft/tileentity/TileEntityHopper.cxl (ILerg;)V
      // b9: iinc 4 1
      // bc: aload 1
      // bd: ifnull 3b
      // c0: bipush 0
      // c1: ireturn
   }

   private boolean ivn(rsi param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: aload 1
      // 05: instanceof hjb
      // 08: aload 3
      // 09: ifnonnull 93
      // 0c: ifeq 86
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast hjb
      // 1a: astore 4
      // 1c: aload 4
      // 1e: aload 2
      // 1f: invokeinterface hjb.ik0 (Lvt2;)[I 2
      // 24: astore 5
      // 26: bipush 0
      // 27: istore 6
      // 29: iload 6
      // 2b: aload 5
      // 2d: arraylength
      // 2e: if_icmpge 82
      // 31: aload 4
      // 33: aload 5
      // 35: iload 6
      // 37: iaload
      // 38: invokeinterface hjb.ibn (I)Lerg; 2
      // 3d: astore 7
      // 3f: aload 3
      // 40: ifnonnull e1
      // 43: aload 7
      // 45: aload 3
      // 46: ifnonnull 5c
      // 49: goto 50
      // 4c: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 4f: athrow
      // 50: ifnull 72
      // 53: goto 5a
      // 56: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 7
      // 5c: getfield erg.qd2 I
      // 5f: aload 3
      // 60: ifnonnull 7a
      // 63: aload 7
      // 65: invokevirtual erg.h4s ()I
      // 68: if_icmpeq 7b
      // 6b: goto 72
      // 6e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 71: athrow
      // 72: bipush 0
      // 73: goto 7a
      // 76: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 79: athrow
      // 7a: ireturn
      // 7b: iinc 6 1
      // 7e: aload 3
      // 7f: ifnull 29
      // 82: aload 3
      // 83: ifnull e1
      // 86: aload 1
      // 87: invokeinterface rsi.opt ()I 1
      // 8c: goto 93
      // 8f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 92: athrow
      // 93: istore 4
      // 95: bipush 0
      // 96: istore 5
      // 98: iload 5
      // 9a: iload 4
      // 9c: if_icmpge e1
      // 9f: aload 1
      // a0: iload 5
      // a2: invokeinterface rsi.ibn (I)Lerg; 2
      // a7: astore 6
      // a9: aload 6
      // ab: aload 3
      // ac: ifnonnull bb
      // af: ifnull d1
      // b2: goto b9
      // b5: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 6
      // bb: getfield erg.qd2 I
      // be: aload 3
      // bf: ifnonnull d9
      // c2: aload 6
      // c4: invokevirtual erg.h4s ()I
      // c7: if_icmpeq da
      // ca: goto d1
      // cd: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // d0: athrow
      // d1: bipush 0
      // d2: goto d9
      // d5: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // d8: athrow
      // d9: ireturn
      // da: iinc 5 1
      // dd: aload 3
      // de: ifnull 98
      // e1: bipush 1
      // e2: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static boolean ie0(rsi var0, vt2 var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      int var10000;
      label77: {
         label71: {
            try {
               var10000 = var0 instanceof hjb;
               if (var2 != null) {
                  break label77;
               }

               if (var10000 == 0) {
                  break label71;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            hjb var3 = (hjb)var0;
            int[] var4 = var3.ik0(var1);
            int var5 = 0;

            while (true) {
               if (var5 < var4.length) {
                  try {
                     if (var3.ibn(var4[var5]) != null) {
                        return false;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }

                  var5++;
                  if (var2 == null) {
                     continue;
                  }
               }

               try {
                  if (var2 == null) {
                     return true;
                  }
                  break;
               } catch (oov var9) {
                  boolean var10001 = false;
                  throw a(var9);
               }
            }
         }

         try {
            var10000 = var0.opt();
         } catch (oov var8) {
            boolean var14 = false;
            throw a(var8);
         }
      }

      int var11 = var10000;
      int var12 = 0;

      while (var12 < var11) {
         try {
            if (var0.ibn(var12) != null) {
               return false;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var12++;
         if (var2 != null) {
            break;
         }
      }

      return true;
   }

   public static boolean m_l(vtv param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 1
      // 004: aload 0
      // 005: invokestatic net/minecraft/tileentity/TileEntityHopper.sss (Lvtv;)Lrsi;
      // 008: astore 2
      // 009: aload 2
      // 00a: ifnull 0cf
      // 00d: getstatic vt2.m3r Lvt2;
      // 010: astore 3
      // 011: aload 2
      // 012: aload 3
      // 013: invokestatic net/minecraft/tileentity/TileEntityHopper.ie0 (Lrsi;Lvt2;)Z
      // 016: aload 1
      // 017: ifnonnull 02e
      // 01a: ifeq 02a
      // 01d: goto 024
      // 020: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 2
      // 02b: instanceof hjb
      // 02e: aload 1
      // 02f: ifnonnull 095
      // 032: ifeq 088
      // 035: goto 03c
      // 038: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 2
      // 03d: checkcast hjb
      // 040: astore 4
      // 042: aload 4
      // 044: aload 3
      // 045: invokeinterface hjb.ik0 (Lvt2;)[I 2
      // 04a: astore 5
      // 04c: bipush 0
      // 04d: istore 6
      // 04f: iload 6
      // 051: aload 5
      // 053: arraylength
      // 054: if_icmpge 084
      // 057: aload 0
      // 058: aload 2
      // 059: aload 5
      // 05b: iload 6
      // 05d: iaload
      // 05e: aload 3
      // 05f: invokestatic net/minecraft/tileentity/TileEntityHopper.gpi (Lvtv;Lrsi;ILvt2;)Z
      // 062: aload 1
      // 063: ifnonnull 12c
      // 066: aload 1
      // 067: ifnonnull 07c
      // 06a: goto 071
      // 06d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 070: athrow
      // 071: ifeq 07d
      // 074: goto 07b
      // 077: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 07a: athrow
      // 07b: bipush 1
      // 07c: ireturn
      // 07d: iinc 6 1
      // 080: aload 1
      // 081: ifnull 04f
      // 084: aload 1
      // 085: ifnull 0cb
      // 088: aload 2
      // 089: invokeinterface rsi.opt ()I 1
      // 08e: goto 095
      // 091: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 094: athrow
      // 095: istore 4
      // 097: bipush 0
      // 098: istore 5
      // 09a: iload 5
      // 09c: iload 4
      // 09e: if_icmpge 0cb
      // 0a1: aload 0
      // 0a2: aload 2
      // 0a3: iload 5
      // 0a5: aload 3
      // 0a6: invokestatic net/minecraft/tileentity/TileEntityHopper.gpi (Lvtv;Lrsi;ILvt2;)Z
      // 0a9: aload 1
      // 0aa: ifnonnull 12c
      // 0ad: aload 1
      // 0ae: ifnonnull 0c3
      // 0b1: goto 0b8
      // 0b4: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: ifeq 0c4
      // 0bb: goto 0c2
      // 0be: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: bipush 1
      // 0c3: ireturn
      // 0c4: iinc 5 1
      // 0c7: aload 1
      // 0c8: ifnull 09a
      // 0cb: aload 1
      // 0cc: ifnull 12b
      // 0cf: aload 0
      // 0d0: invokeinterface vtv.yi7 ()Lt9d; 1
      // 0d5: aload 0
      // 0d6: invokeinterface vtv.dk4 ()D 1
      // 0db: aload 0
      // 0dc: invokeinterface vtv.j35 ()D 1
      // 0e1: dconst_1
      // 0e2: dadd
      // 0e3: aload 0
      // 0e4: invokeinterface vtv.bd2 ()D 1
      // 0e9: invokestatic net/minecraft/tileentity/TileEntityHopper._lt (Lt9d;DDD)Ljava/util/List;
      // 0ec: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f1: astore 3
      // 0f2: aload 3
      // 0f3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f8: ifeq 12b
      // 0fb: aload 3
      // 0fc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 101: checkcast nvf
      // 104: astore 4
      // 106: aload 0
      // 107: aload 4
      // 109: invokestatic net/minecraft/tileentity/TileEntityHopper.hm_ (Lrsi;Lnvf;)Z
      // 10c: aload 1
      // 10d: ifnonnull 12c
      // 110: aload 1
      // 111: ifnonnull 126
      // 114: goto 11b
      // 117: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifeq 127
      // 11e: goto 125
      // 121: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 124: athrow
      // 125: bipush 1
      // 126: ireturn
      // 127: aload 1
      // 128: ifnull 0f2
      // 12b: bipush 0
      // 12c: ireturn
   }

   private static boolean gpi(vtv param0, rsi param1, int param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 4
      // 05: aload 1
      // 06: iload 2
      // 07: invokeinterface rsi.ibn (I)Lerg; 2
      // 0c: astore 5
      // 0e: aload 5
      // 10: ifnull 8e
      // 13: aload 1
      // 14: aload 5
      // 16: iload 2
      // 17: aload 3
      // 18: invokestatic net/minecraft/tileentity/TileEntityHopper.rj7 (Lrsi;Lerg;ILvt2;)Z
      // 1b: aload 4
      // 1d: ifnonnull 8f
      // 20: goto 27
      // 23: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 26: athrow
      // 27: ifeq 8e
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 5
      // 33: invokevirtual erg.yaq ()Lerg;
      // 36: astore 6
      // 38: aload 0
      // 39: aload 1
      // 3a: iload 2
      // 3b: bipush 1
      // 3c: invokeinterface rsi.afc (II)Lerg; 3
      // 41: aconst_null
      // 42: checkcast vt2
      // 45: invokestatic net/minecraft/tileentity/TileEntityHopper.sop (Lrsi;Lerg;Lvt2;)Lerg;
      // 48: astore 7
      // 4a: aload 4
      // 4c: ifnonnull 83
      // 4f: aload 7
      // 51: ifnull 76
      // 54: goto 5b
      // 57: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 7
      // 5d: getfield erg.qd2 I
      // 60: aload 4
      // 62: ifnonnull 84
      // 65: goto 6c
      // 68: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 6b: athrow
      // 6c: ifne 85
      // 6f: goto 76
      // 72: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 1
      // 77: invokeinterface rsi.r5t ()V 1
      // 7c: goto 83
      // 7f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 82: athrow
      // 83: bipush 1
      // 84: ireturn
      // 85: aload 1
      // 86: iload 2
      // 87: aload 6
      // 89: invokeinterface rsi.cxl (ILerg;)V 3
      // 8e: bipush 0
      // 8f: ireturn
   }

   public static boolean hm_(rsi param0, nvf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: aload 1
      // 07: aload 2
      // 08: ifnonnull 1c
      // 0b: ifnonnull 1b
      // 0e: goto 15
      // 11: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: ireturn
      // 17: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual nvf.s7f ()Lerg;
      // 1f: invokevirtual erg.yaq ()Lerg;
      // 22: astore 4
      // 24: aload 0
      // 25: aload 4
      // 27: aconst_null
      // 28: checkcast vt2
      // 2b: invokestatic net/minecraft/tileentity/TileEntityHopper.sop (Lrsi;Lerg;Lvt2;)Lerg;
      // 2e: astore 5
      // 30: aload 2
      // 31: ifnonnull 74
      // 34: aload 5
      // 36: ifnull 6b
      // 39: goto 40
      // 3c: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 5
      // 42: getfield erg.qd2 I
      // 45: aload 2
      // 46: ifnonnull 73
      // 49: goto 50
      // 4c: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 4f: athrow
      // 50: ifeq 6b
      // 53: goto 5a
      // 56: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: aload 5
      // 5d: invokevirtual nvf.p5c (Lerg;)V
      // 60: aload 2
      // 61: ifnull 78
      // 64: goto 6b
      // 67: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 73
      // 6f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 72: athrow
      // 73: istore 3
      // 74: aload 1
      // 75: invokevirtual nvf._kl ()V
      // 78: iload 3
      // 79: ireturn
   }

   public static erg sop(rsi param0, erg param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 3
      // 004: aload 0
      // 005: instanceof hjb
      // 008: aload 3
      // 009: ifnonnull 093
      // 00c: ifeq 086
      // 00f: goto 016
      // 012: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 2
      // 017: ifnull 086
      // 01a: goto 021
      // 01d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: checkcast hjb
      // 025: astore 4
      // 027: aload 4
      // 029: aload 2
      // 02a: invokeinterface hjb.ik0 (Lvt2;)[I 2
      // 02f: astore 5
      // 031: bipush 0
      // 032: istore 6
      // 034: iload 6
      // 036: aload 5
      // 038: arraylength
      // 039: if_icmpge 082
      // 03c: aload 1
      // 03d: aload 3
      // 03e: ifnonnull 0e3
      // 041: aload 3
      // 042: ifnonnull 057
      // 045: goto 04c
      // 048: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 04b: athrow
      // 04c: ifnull 082
      // 04f: goto 056
      // 052: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 1
      // 057: aload 3
      // 058: ifnonnull 07a
      // 05b: getfield erg.qd2 I
      // 05e: ifle 082
      // 061: goto 068
      // 064: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: aload 1
      // 06a: aload 5
      // 06c: iload 6
      // 06e: iaload
      // 06f: aload 2
      // 070: invokestatic net/minecraft/tileentity/TileEntityHopper.hz6 (Lrsi;Lerg;ILvt2;)Lerg;
      // 073: goto 07a
      // 076: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 079: athrow
      // 07a: astore 1
      // 07b: iinc 6 1
      // 07e: aload 3
      // 07f: ifnull 034
      // 082: aload 3
      // 083: ifnull 0e2
      // 086: aload 0
      // 087: invokeinterface rsi.opt ()I 1
      // 08c: goto 093
      // 08f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 092: athrow
      // 093: istore 4
      // 095: bipush 0
      // 096: istore 5
      // 098: iload 5
      // 09a: iload 4
      // 09c: if_icmpge 0e2
      // 09f: aload 1
      // 0a0: aload 3
      // 0a1: ifnonnull 0e3
      // 0a4: aload 3
      // 0a5: ifnonnull 0e3
      // 0a8: goto 0af
      // 0ab: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: ifnull 0e2
      // 0b2: goto 0b9
      // 0b5: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: aload 3
      // 0bb: ifnonnull 0e3
      // 0be: goto 0c5
      // 0c1: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: getfield erg.qd2 I
      // 0c8: ifle 0e2
      // 0cb: goto 0d2
      // 0ce: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: aload 1
      // 0d4: iload 5
      // 0d6: aload 2
      // 0d7: invokestatic net/minecraft/tileentity/TileEntityHopper.hz6 (Lrsi;Lerg;ILvt2;)Lerg;
      // 0da: astore 1
      // 0db: iinc 5 1
      // 0de: aload 3
      // 0df: ifnull 098
      // 0e2: aload 1
      // 0e3: aload 3
      // 0e4: ifnonnull 10d
      // 0e7: ifnull 10c
      // 0ea: goto 0f1
      // 0ed: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: aload 3
      // 0f3: ifnonnull 10d
      // 0f6: goto 0fd
      // 0f9: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: getfield erg.qd2 I
      // 100: ifne 10c
      // 103: goto 10a
      // 106: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 109: athrow
      // 10a: aconst_null
      // 10b: astore 1
      // 10c: aload 1
      // 10d: areturn
   }

   private static boolean pz0(rsi param0, erg param1, int param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 4
      // 05: aload 0
      // 06: iload 2
      // 07: aload 1
      // 08: invokeinterface rsi.er2 (ILerg;)Z 3
      // 0d: aload 4
      // 0f: ifnonnull 28
      // 12: ifne 24
      // 15: goto 1c
      // 18: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: goto 5e
      // 20: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: instanceof hjb
      // 28: aload 4
      // 2a: ifnonnull 5a
      // 2d: ifeq 59
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: checkcast hjb
      // 3b: iload 2
      // 3c: aload 1
      // 3d: aload 3
      // 3e: invokeinterface hjb.dy9 (ILerg;Lvt2;)Z 4
      // 43: aload 4
      // 45: ifnonnull 5a
      // 48: goto 4f
      // 4b: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifeq 5d
      // 52: goto 59
      // 55: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   private static boolean rj7(rsi param0, erg param1, int param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 4
      // 05: aload 0
      // 06: instanceof hjb
      // 09: aload 4
      // 0b: ifnonnull 3b
      // 0e: ifeq 3a
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: checkcast hjb
      // 1c: iload 2
      // 1d: aload 1
      // 1e: aload 3
      // 1f: invokeinterface hjb.kfc (ILerg;Lvt2;)Z 4
      // 24: aload 4
      // 26: ifnonnull 3b
      // 29: goto 30
      // 2c: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifeq 3e
      // 33: goto 3a
      // 36: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   private static erg hz6(rsi param0, erg param1, int param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 4
      // 005: aload 0
      // 006: iload 2
      // 007: invokeinterface rsi.ibn (I)Lerg; 2
      // 00c: astore 5
      // 00e: aload 0
      // 00f: aload 1
      // 010: iload 2
      // 011: aload 3
      // 012: invokestatic net/minecraft/tileentity/TileEntityHopper.pz0 (Lrsi;Lerg;ILvt2;)Z
      // 015: aload 4
      // 017: ifnonnull 025
      // 01a: ifeq 102
      // 01d: goto 024
      // 020: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 023: athrow
      // 024: bipush 0
      // 025: istore 6
      // 027: aload 5
      // 029: aload 4
      // 02b: ifnonnull 04a
      // 02e: ifnonnull 048
      // 031: goto 038
      // 034: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: iload 2
      // 03a: aload 1
      // 03b: invokeinterface rsi.cxl (ILerg;)V 3
      // 040: aconst_null
      // 041: astore 1
      // 042: bipush 1
      // 043: istore 6
      // 045: goto 0a3
      // 048: aload 5
      // 04a: aload 1
      // 04b: invokestatic net/minecraft/tileentity/TileEntityHopper.d_n (Lerg;Lerg;)Z
      // 04e: aload 4
      // 050: ifnonnull 0a5
      // 053: ifeq 0a3
      // 056: goto 05d
      // 059: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 1
      // 05e: invokevirtual erg.h4s ()I
      // 061: aload 5
      // 063: getfield erg.qd2 I
      // 066: isub
      // 067: istore 7
      // 069: aload 1
      // 06a: getfield erg.qd2 I
      // 06d: iload 7
      // 06f: invokestatic java/lang/Math.min (II)I
      // 072: istore 8
      // 074: aload 1
      // 075: dup
      // 076: getfield erg.qd2 I
      // 079: iload 8
      // 07b: isub
      // 07c: putfield erg.qd2 I
      // 07f: aload 5
      // 081: dup
      // 082: getfield erg.qd2 I
      // 085: iload 8
      // 087: iadd
      // 088: putfield erg.qd2 I
      // 08b: iload 8
      // 08d: aload 4
      // 08f: ifnonnull 09d
      // 092: ifle 0a0
      // 095: goto 09c
      // 098: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 09b: athrow
      // 09c: bipush 1
      // 09d: goto 0a1
      // 0a0: bipush 0
      // 0a1: istore 6
      // 0a3: iload 6
      // 0a5: aload 4
      // 0a7: ifnonnull 0cb
      // 0aa: ifeq 102
      // 0ad: goto 0b4
      // 0b0: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: aload 4
      // 0b7: ifnonnull 0fd
      // 0ba: goto 0c1
      // 0bd: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: instanceof net/minecraft/tileentity/TileEntityHopper
      // 0c4: goto 0cb
      // 0c7: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: ifeq 0fc
      // 0ce: aload 0
      // 0cf: checkcast net/minecraft/tileentity/TileEntityHopper
      // 0d2: astore 7
      // 0d4: aload 7
      // 0d6: aload 4
      // 0d8: ifnonnull 0f7
      // 0db: invokevirtual net/minecraft/tileentity/TileEntityHopper.ahu ()Z
      // 0de: ifeq 0f6
      // 0e1: goto 0e8
      // 0e4: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 7
      // 0ea: bipush 8
      // 0ec: invokevirtual net/minecraft/tileentity/TileEntityHopper.k4i (I)V
      // 0ef: goto 0f6
      // 0f2: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: invokeinterface rsi.r5t ()V 1
      // 0fc: aload 0
      // 0fd: invokeinterface rsi.r5t ()V 1
      // 102: aload 1
      // 103: areturn
   }

   private rsi cz1() {
      vt2 var1 = a4v.fb4(this.hvh());
      return ows(this.yi7(), (double)(this.al2.getX() + var1.n67()), (double)(this.al2.getY() + var1.g5t()), (double)(this.al2.getZ() + var1.ozy()));
   }

   public static rsi sss(vtv var0) {
      return ows(var0.yi7(), var0.dk4(), var0.j35() + 1.0, var0.bd2());
   }

   public static List _lt(OpaquePredicate var0, double var1, double var3, double var5) {
      return var0.vie(nvf.class, new nh4(var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5), k0_.q01);
   }

   public static rsi ows(OpaquePredicate param0, double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 8
      // 003: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 006: dload 1
      // 007: invokestatic fe6.jqf (D)I
      // 00a: istore 9
      // 00c: astore 7
      // 00e: dload 3
      // 00f: invokestatic fe6.jqf (D)I
      // 012: istore 10
      // 014: dload 5
      // 016: invokestatic fe6.jqf (D)I
      // 019: istore 11
      // 01b: new mew
      // 01e: dup
      // 01f: iload 9
      // 021: iload 10
      // 023: iload 11
      // 025: invokespecial mew.<init> (III)V
      // 028: astore 12
      // 02a: aload 0
      // 02b: aload 12
      // 02d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 030: invokeinterface zfz.r_y ()Le0x; 1
      // 035: astore 13
      // 037: aload 13
      // 039: invokevirtual e0x.caz ()Z
      // 03c: ifeq 0ac
      // 03f: aload 0
      // 040: aload 12
      // 042: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 045: astore 14
      // 047: aload 14
      // 049: aload 7
      // 04b: ifnonnull 064
      // 04e: instanceof rsi
      // 051: ifeq 0ac
      // 054: goto 05b
      // 057: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 14
      // 05d: goto 064
      // 060: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 063: athrow
      // 064: checkcast rsi
      // 067: astore 8
      // 069: aload 8
      // 06b: aload 7
      // 06d: ifnonnull 0ae
      // 070: instanceof net/minecraft/tileentity/TileEntityChest
      // 073: ifeq 0ac
      // 076: goto 07d
      // 079: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 13
      // 07f: aload 7
      // 081: ifnonnull 0a1
      // 084: goto 08b
      // 087: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 08a: athrow
      // 08b: instanceof hrd
      // 08e: ifeq 0ac
      // 091: goto 098
      // 094: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 13
      // 09a: goto 0a1
      // 09d: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: checkcast hrd
      // 0a4: aload 0
      // 0a5: aload 12
      // 0a7: invokevirtual hrd.ffe (Lt9d;Lmew;)Lfl3;
      // 0aa: astore 8
      // 0ac: aload 8
      // 0ae: aload 7
      // 0b0: ifnonnull 12a
      // 0b3: ifnonnull 128
      // 0b6: goto 0bd
      // 0b9: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aconst_null
      // 0bf: checkcast EntityLivingBase
      // 0c2: new nh4
      // 0c5: dup
      // 0c6: dload 1
      // 0c7: ldc2_w 0.5
      // 0ca: dsub
      // 0cb: dload 3
      // 0cc: ldc2_w 0.5
      // 0cf: dsub
      // 0d0: dload 5
      // 0d2: ldc2_w 0.5
      // 0d5: dsub
      // 0d6: dload 1
      // 0d7: ldc2_w 0.5
      // 0da: dadd
      // 0db: dload 3
      // 0dc: ldc2_w 0.5
      // 0df: dadd
      // 0e0: dload 5
      // 0e2: ldc2_w 0.5
      // 0e5: dadd
      // 0e6: invokespecial nh4.<init> (DDDDDD)V
      // 0e9: getstatic k0_.vs7 Lcom/google/common/base/Predicate;
      // 0ec: invokevirtual OpaquePredicate.sr2 (Li2h;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 0ef: astore 14
      // 0f1: aload 14
      // 0f3: aload 7
      // 0f5: ifnonnull 123
      // 0f8: invokeinterface java/util/List.size ()I 1
      // 0fd: ifle 128
      // 100: goto 107
      // 103: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 14
      // 109: aload 0
      // 10a: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 10d: aload 14
      // 10f: invokeinterface java/util/List.size ()I 1
      // 114: invokevirtual java/util/Random.nextInt (I)I
      // 117: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11c: goto 123
      // 11f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 122: athrow
      // 123: checkcast rsi
      // 126: astore 8
      // 128: aload 8
      // 12a: areturn
   }

   private static boolean d_n(erg param0, erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 23
      // 09: invokevirtual erg.gn1 ()Lu7m;
      // 0c: aload 1
      // 0d: invokevirtual erg.gn1 ()Lu7m;
      // 10: if_acmpeq 22
      // 13: goto 1a
      // 16: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 0
      // 1b: goto 63
      // 1e: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual erg.j6_ ()I
      // 26: aload 1
      // 27: invokevirtual erg.j6_ ()I
      // 2a: aload 2
      // 2b: ifnonnull 53
      // 2e: if_icmpeq 40
      // 31: goto 38
      // 34: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 0
      // 39: goto 63
      // 3c: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 2
      // 42: ifnonnull 5f
      // 45: getfield erg.qd2 I
      // 48: aload 0
      // 49: invokevirtual erg.h4s ()I
      // 4c: goto 53
      // 4f: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 52: athrow
      // 53: if_icmple 5e
      // 56: bipush 0
      // 57: goto 63
      // 5a: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 1
      // 60: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 63: ireturn
   }

   @Override
   public double dk4() {
      return (double)this.al2.getX() + 0.5;
   }

   @Override
   public double j35() {
      return (double)this.al2.getY() + 0.5;
   }

   @Override
   public double bd2() {
      return (double)this.al2.getZ() + 0.5;
   }

   public void k4i(int var1) {
      this.aww = var1;
   }

   public boolean um2() {
      int[] var1 = TileEntityBeacon$yv7.b();

      try {
         if (var1 != null) {
            return (boolean)this.aww;
         }

         if (this.aww > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public boolean ahu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/tileentity/TileEntityHopper.aww I
      // 08: aload 1
      // 09: ifnonnull 1f
      // 0c: bipush 1
      // 0d: if_icmpgt 22
      // 10: goto 17
      // 13: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic net/minecraft/tileentity/TileEntityHopper.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @Override
   public String q4l() {
      long var1 = a ^ 130004950265158L;
      return b<"y">(4817, 4361482315775959936L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new i3n(var1, this, var2);
   }

   @Override
   public int czu(int var1) {
      return 0;
   }

   @Override
   public void r8i(int var1, int var2) {
   }

   @Override
   public int xa3() {
      return 0;
   }

   @Override
   public void nec() {
      int[] var1 = TileEntityBeacon$yv7.b();
      int var2 = 0;

      while (var2 < this.s6z.length) {
         this.s6z[var2] = null;
         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1259021603893999738L, -7892190103979256238L, MethodHandles.lookup().lookupClass()).a(248975868994538L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 122050734394838L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u0098N»\u0090\u0097N\u0093gö\u008fiß\u0088v\u0001X\u0086i4dG¡ù\u0003]Rý)Ct¸\u008a0\u0097nI\\\u0011É\u0099±\r¼ÃUp\u000b¯Ç\u0082$[Q÷ih\u0095p¸\u008167+X¾>ì\u001e\u0094{\u0014\u0091ª')o! *\u0089ÿ(\u0007»\u0091y¢\u0018\u0099\u009f\u0082+nÏ\u0099\u0000\n*ê*\u0013?]¶ÿ©Ò\u009aPÏei\t{`ç\u0083Úx8\u001e\u0011(ûC¬\u001a\u0088\fd\u0094ð\u00045Ò¶~ÛP³À\u009bf})~Êm-ç¿\\²Õ\u0010#E5_å\u009c\u009e\u0093\u0010¤\f\u0010=]æ6M\u0083æ\u0090n%Î\u0003Õ sq\u0017\u0087À\u0082Ù2\u0091Ôúa¤Ð\\<B!8{{»Æof\u001bIMÔ¥Àx\u0010ñ¶c,f\u008f`\u007fxl¾R\u0005ó\u009f\u009e\u0010\u0086P\u0084ú\u00adÉ\u0000Ëc\u0013\u0088×TÁ´¿";
      int var8 = "\u0098N»\u0090\u0097N\u0093gö\u008fiß\u0088v\u0001X\u0086i4dG¡ù\u0003]Rý)Ct¸\u008a0\u0097nI\\\u0011É\u0099±\r¼ÃUp\u000b¯Ç\u0082$[Q÷ih\u0095p¸\u008167+X¾>ì\u001e\u0094{\u0014\u0091ª')o! *\u0089ÿ(\u0007»\u0091y¢\u0018\u0099\u009f\u0082+nÏ\u0099\u0000\n*ê*\u0013?]¶ÿ©Ò\u009aPÏei\t{`ç\u0083Úx8\u001e\u0011(ûC¬\u001a\u0088\fd\u0094ð\u00045Ò¶~ÛP³À\u009bf})~Êm-ç¿\\²Õ\u0010#E5_å\u009c\u009e\u0093\u0010¤\f\u0010=]æ6M\u0083æ\u0090n%Î\u0003Õ sq\u0017\u0087À\u0082Ù2\u0091Ôúa¤Ð\\<B!8{{»Æof\u001bIMÔ¥Àx\u0010ñ¶c,f\u008f`\u007fxl¾R\u0005ó\u009f\u009e\u0010\u0086P\u0084ú\u00adÉ\u0000Ëc\u0013\u0088×TÁ´¿"
         .length();
      char var5 = ' ';
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
                     b = var9;
                     g = new String[10];
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

                  var6 = "ä\\\u009d- ²)Ý¨¾§13Xæ¯(\u0002¿.Ñ\b\tèØé·U¸ññèX}A\u0083\u009f¦p>Uu\u0001¡\u0097Ã\u009cíÕ\u008b¸\"ºuµ\u007fê";
                  var8 = "ä\\\u009d- ²)Ý¨¾§13Xæ¯(\u0002¿.Ñ\b\tèØé·U¸ññèX}A\u0083\u009f¦p>Uu\u0001¡\u0097Ã\u009cíÕ\u008b¸\"ºuµ\u007fê".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9708;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityHopper", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityHopper" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
