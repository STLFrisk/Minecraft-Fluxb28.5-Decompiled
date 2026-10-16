package net.minecraft.tileentity;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class TileEntityDispenser extends TileEntityLockable implements rsi {
   public String l5f;
   private static final long a;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   @Override
   public int opt() {
      return 9;
   }

   @Override
   public erg ibn(int var1) {
      return this.av1[var1];
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
      // 05: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 3
      // 0b: ifnonnull 25
      // 0e: ifnull 85
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 3
      // 26: ifnonnull 57
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 4d
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 0
      // 47: invokevirtual net/minecraft/tileentity/TileEntityDispenser.r5t ()V
      // 4a: aload 4
      // 4c: areturn
      // 4d: aload 0
      // 4e: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 51: iload 1
      // 52: aaload
      // 53: iload 2
      // 54: invokevirtual erg.amj (I)Lerg;
      // 57: astore 4
      // 59: aload 0
      // 5a: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 5d: iload 1
      // 5e: aaload
      // 5f: aload 3
      // 60: ifnonnull 84
      // 63: getfield erg.qd2 I
      // 66: ifne 7e
      // 69: goto 70
      // 6c: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 74: iload 1
      // 75: aconst_null
      // 76: aastore
      // 77: goto 7e
      // 7a: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: invokevirtual net/minecraft/tileentity/TileEntityDispenser.r5t ()V
      // 82: aload 4
      // 84: areturn
      // 85: aconst_null
      // 86: areturn
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
      // 05: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 2
      // 0b: ifnonnull 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 2a: iload 1
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   public int _ob() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush -1
      // 01: istore 2
      // 02: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 05: bipush 1
      // 06: istore 3
      // 07: astore 1
      // 08: bipush 0
      // 09: istore 4
      // 0b: iload 4
      // 0d: aload 0
      // 0e: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 11: arraylength
      // 12: if_icmpge 48
      // 15: aload 0
      // 16: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 19: iload 4
      // 1b: aaload
      // 1c: ifnull 41
      // 1f: getstatic net/minecraft/tileentity/TileEntityDispenser.qkt Ljava/util/Random;
      // 22: iload 3
      // 23: iinc 3 1
      // 26: invokevirtual java/util/Random.nextInt (I)I
      // 29: aload 1
      // 2a: ifnonnull 40
      // 2d: goto 34
      // 30: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 33: athrow
      // 34: ifne 41
      // 37: goto 3e
      // 3a: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 4
      // 40: istore 2
      // 41: iinc 4 1
      // 44: aload 1
      // 45: ifnull 0b
      // 48: iload 2
      // 49: ireturn
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
      // 05: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 08: iload 1
      // 09: aload 2
      // 0a: aastore
      // 0b: aload 3
      // 0c: ifnonnull 4a
      // 0f: aload 2
      // 10: ifnull 46
      // 13: goto 1a
      // 16: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 3
      // 1c: ifnonnull 3f
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield erg.qd2 I
      // 29: aload 0
      // 2a: invokevirtual net/minecraft/tileentity/TileEntityDispenser.v6l ()I
      // 2d: if_icmple 46
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 2
      // 38: goto 3f
      // 3b: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual net/minecraft/tileentity/TileEntityDispenser.v6l ()I
      // 43: putfield erg.qd2 I
      // 46: aload 0
      // 47: invokevirtual net/minecraft/tileentity/TileEntityDispenser.r5t ()V
      // 4a: return
   }

   public int oz8(erg param1) {
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
      // 06: iload 3
      // 07: aload 0
      // 08: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 0b: arraylength
      // 0c: if_icmpge 57
      // 0f: aload 0
      // 10: aload 2
      // 11: ifnonnull 49
      // 14: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 17: iload 3
      // 18: aaload
      // 19: ifnull 41
      // 1c: goto 23
      // 1f: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: aload 2
      // 25: ifnonnull 49
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 2e: athrow
      // 2f: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 32: iload 3
      // 33: aaload
      // 34: invokevirtual erg.gn1 ()Lu7m;
      // 37: ifnonnull 50
      // 3a: goto 41
      // 3d: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 48: athrow
      // 49: iload 3
      // 4a: aload 1
      // 4b: invokevirtual net/minecraft/tileentity/TileEntityDispenser.cxl (ILerg;)V
      // 4e: iload 3
      // 4f: ireturn
      // 50: iinc 3 1
      // 53: aload 2
      // 54: ifnull 06
      // 57: bipush -1
      // 58: ireturn
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
      // 00: getstatic net/minecraft/tileentity/TileEntityDispenser.a J
      // 03: ldc2_w 43159588175294
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityDispenser.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityDispenser.l5f Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 25584
      // 2f: ldc2_w 4311965663191991219
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityDispenser.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: areturn
   }

   public void rww(String var1) {
      this.l5f = var1;
   }

   @Override
   public boolean qrh() {
      try {
         if (this.l5f != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public void agl(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityDispenser.a J
      // 03: ldc2_w 86486504548323
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial net/minecraft/tileentity/TileEntityLockable.agl (Lbdo;)V
      // 0d: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 10: aload 1
      // 11: sipush 15496
      // 14: ldc2_w 6473877885121889938
      // 17: lload 2
      // 18: lxor
      // 19: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityDispenser.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: nop
      // 1f: bipush 10
      // 21: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 24: astore 5
      // 26: aload 0
      // 27: aload 0
      // 28: invokevirtual net/minecraft/tileentity/TileEntityDispenser.opt ()I
      // 2b: anewarray 28
      // 2e: putfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 31: bipush 0
      // 32: istore 6
      // 34: astore 4
      // 36: iload 6
      // 38: aload 5
      // 3a: invokevirtual qhg.vek ()I
      // 3d: if_icmpge ab
      // 40: aload 5
      // 42: iload 6
      // 44: invokevirtual qhg.kd6 (I)Lbdo;
      // 47: astore 7
      // 49: aload 7
      // 4b: sipush 31828
      // 4e: ldc2_w 7102666258933040712
      // 51: lload 2
      // 52: lxor
      // 53: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityDispenser.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 5c: sipush 255
      // 5f: iand
      // 60: istore 8
      // 62: aload 4
      // 64: ifnonnull a6
      // 67: iload 8
      // 69: aload 4
      // 6b: ifnonnull bf
      // 6e: goto 75
      // 71: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 74: athrow
      // 75: iflt a3
      // 78: goto 7f
      // 7b: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 7e: athrow
      // 7f: iload 8
      // 81: aload 0
      // 82: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 85: arraylength
      // 86: if_icmpge a3
      // 89: goto 90
      // 8c: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // 8f: athrow
      // 90: aload 0
      // 91: getfield net/minecraft/tileentity/TileEntityDispenser.av1 [Lerg;
      // 94: iload 8
      // 96: aload 7
      // 98: invokestatic erg.qog (Lbdo;)Lerg;
      // 9b: aastore
      // 9c: goto a3
      // 9f: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // a2: athrow
      // a3: iinc 6 1
      // a6: aload 4
      // a8: ifnull 36
      // ab: aload 1
      // ac: sipush 19239
      // af: ldc2_w 9178500943456366911
      // b2: lload 2
      // b3: lxor
      // b4: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityDispenser.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: nop
      // ba: bipush 8
      // bc: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // bf: ifeq df
      // c2: aload 0
      // c3: aload 1
      // c4: sipush 19239
      // c7: ldc2_w 9178500943456366911
      // ca: lload 2
      // cb: lxor
      // cc: invokedynamic k (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityDispenser.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: nop
      // d2: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // d5: putfield net/minecraft/tileentity/TileEntityDispenser.l5f Ljava/lang/String;
      // d8: goto df
      // db: invokestatic net/minecraft/tileentity/TileEntityDispenser.a (Loov;)Loov;
      // de: athrow
      // df: return
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 62770756502335L;
      super.m2a(var1);
      int[] var10000 = TileEntityBeacon$yv7.b();
      qhg var5 = new qhg();
      int[] var4 = var10000;
      int var6 = 0;

      String var10001;
      label46: {
         while (true) {
            if (var6 < this.av1.length) {
               label41: {
                  try {
                     var11 = this;
                     if (var4 != null) {
                        break;
                     }

                     if (this.av1[var6] == null) {
                        break label41;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  bdo var7 = new bdo();
                  var7.atr(b<"k">(13637, 7602465296819317634L ^ var2), (byte)var6);
                  this.av1[var6].zy4(var7);
                  var5.w2j(var7);
               }

               var6++;
               if (var4 == null) {
                  continue;
               }
            }

            try {
               var12 = var1;
               var10001 = b<"k">(7417, 2034769418583228984L ^ var2);
               if (var4 != null) {
                  break label46;
               }

               var1.rzm(var10001, var5);
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
            var10001 = b<"k">(25072, 4236290814848614195L ^ var2);
         } catch (oov var8) {
            throw a(var8);
         }
      }

      var12.rjq(var10001, this.l5f);
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
   public String q4l() {
      long var1 = a ^ 50845536552569L;
      return b<"k">(8283, 5389818732088146904L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new d9m(var1, this);
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

      while (var2 < this.av1.length) {
         this.av1[var2] = null;
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
      long var10000 = c.a(1377381721223239624L, -5878954702763862803L, MethodHandles.lookup().lookupClass()).a(30708325648202L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 53015145994486L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "9\u001f=ÐÃÙ\u0001\\»r'tëàUä\u0010\u00061Á\u0097Ä¿â\u009b\u0095>Ú Á0¾N\u0018\u0089;â\u007f5\u000fFüªk¾@ÙGp\u0097ø ûáü¹Îá0ç\u0092ØwÞM \u001cF\u009fRbtgE%Ä\u009bÒW# Æ½à=êW\u001c\"æl(j¾³»y}\u0012uù\u0084DU\u00138Ê(\u0010bòF¿µo\u0006þÖáÒù?~Y\u0084J¡³Ï\u0011?>\u0014\u000e:\u0080{-\tv¹1zgºé%É í\u0001ÖKô«¶éÒ\u009d\rÙÜ#¢¹8¶áAã\u009d\bZßÔVìË\u0089èF";
      int var8 = "9\u001f=ÐÃÙ\u0001\\»r'tëàUä\u0010\u00061Á\u0097Ä¿â\u009b\u0095>Ú Á0¾N\u0018\u0089;â\u007f5\u000fFüªk¾@ÙGp\u0097ø ûáü¹Îá0ç\u0092ØwÞM \u001cF\u009fRbtgE%Ä\u009bÒW# Æ½à=êW\u001c\"æl(j¾³»y}\u0012uù\u0084DU\u00138Ê(\u0010bòF¿µo\u0006þÖáÒù?~Y\u0084J¡³Ï\u0011?>\u0014\u000e:\u0080{-\tv¹1zgºé%É í\u0001ÖKô«¶éÒ\u009d\rÙÜ#¢¹8¶áAã\u009d\bZßÔVìË\u0089èF"
         .length();
      char var5 = 16;
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
                     g = var9;
                     h = new String[8];
                     qkt = new Random();
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

                  var6 = "Åc\u0094åzæI±^Óù5~>¼e\u0010©§*\u00019\u0087º\u0006\u0085¿\u0000*\fg\u0004\u0083";
                  var8 = "Åc\u0094åzæI±^Óù5~>¼e\u0010©§*\u00019\u0087º\u0006\u0085¿\u0000*\fg\u0004\u0083".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20276;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityDispenser", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityDispenser" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
