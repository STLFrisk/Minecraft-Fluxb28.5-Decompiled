package net.minecraft.tileentity;

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

public class TileEntityChest extends TileEntityLockable implements xcy, rsi {
   private erg[] hwn = new erg[27];
   public boolean hd9;
   public TileEntityChest sgw;
   public TileEntityChest xdt;
   public TileEntityChest af8;
   public TileEntityChest bbu;
   public float g2m;
   public float mac;
   public int y5u;
   private int oqu;
   private int ylx;
   private String s8i;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public TileEntityChest() {
      this.ylx = -1;
   }

   public TileEntityChest(int var1) {
      this.ylx = var1;
   }

   @Override
   public int opt() {
      return 27;
   }

   @Override
   public erg ibn(int var1) {
      return this.hwn[var1];
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 3
      // 0b: ifnonnull 25
      // 0e: ifnull 85
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 3
      // 26: ifnonnull 57
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 4d
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 0
      // 47: invokevirtual net/minecraft/tileentity/TileEntityChest.r5t ()V
      // 4a: aload 4
      // 4c: areturn
      // 4d: aload 0
      // 4e: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 51: iload 1
      // 52: aaload
      // 53: iload 2
      // 54: invokevirtual erg.amj (I)Lerg;
      // 57: astore 4
      // 59: aload 0
      // 5a: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 5d: iload 1
      // 5e: aaload
      // 5f: aload 3
      // 60: ifnonnull 84
      // 63: getfield erg.qd2 I
      // 66: ifne 7e
      // 69: goto 70
      // 6c: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 74: iload 1
      // 75: aconst_null
      // 76: aastore
      // 77: goto 7e
      // 7a: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: invokevirtual net/minecraft/tileentity/TileEntityChest.r5t ()V
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 2
      // 0b: ifnonnull 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 08: iload 1
      // 09: aload 2
      // 0a: aastore
      // 0b: aload 3
      // 0c: ifnonnull 4a
      // 0f: aload 2
      // 10: ifnull 46
      // 13: goto 1a
      // 16: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 3
      // 1c: ifnonnull 3f
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield erg.qd2 I
      // 29: aload 0
      // 2a: invokevirtual net/minecraft/tileentity/TileEntityChest.v6l ()I
      // 2d: if_icmple 46
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 2
      // 38: goto 3f
      // 3b: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual net/minecraft/tileentity/TileEntityChest.v6l ()I
      // 43: putfield erg.qd2 I
      // 46: aload 0
      // 47: invokevirtual net/minecraft/tileentity/TileEntityChest.r5t ()V
      // 4a: return
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
      // 00: getstatic net/minecraft/tileentity/TileEntityChest.a J
      // 03: ldc2_w 80509583942711
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityChest.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityChest.s8i Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 20213
      // 2f: ldc2_w 1433581760491368677
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.s8i Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityChest.s8i Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void id8(String var1) {
      this.s8i = var1;
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
      // 00: getstatic net/minecraft/tileentity/TileEntityChest.a J
      // 03: ldc2_w 36083960954474
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial net/minecraft/tileentity/TileEntityLockable.agl (Lbdo;)V
      // 0d: aload 1
      // 0e: sipush 31727
      // 11: ldc2_w 2215614772812603302
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: bipush 10
      // 1e: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 21: astore 5
      // 23: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 26: aload 0
      // 27: aload 0
      // 28: invokevirtual net/minecraft/tileentity/TileEntityChest.opt ()I
      // 2b: anewarray 49
      // 2e: putfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // 31: astore 4
      // 33: aload 1
      // 34: bipush 44
      // 36: ldc2_w 3747261317977056354
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: bipush 8
      // 43: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 46: aload 4
      // 48: ifnonnull 73
      // 4b: ifeq 72
      // 4e: goto 55
      // 51: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: aload 1
      // 57: sipush 30597
      // 5a: ldc2_w 6826750679961785283
      // 5d: lload 2
      // 5e: lxor
      // 5f: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: nop
      // 65: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 68: putfield net/minecraft/tileentity/TileEntityChest.s8i Ljava/lang/String;
      // 6b: goto 72
      // 6e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 71: athrow
      // 72: bipush 0
      // 73: istore 6
      // 75: iload 6
      // 77: aload 5
      // 79: invokevirtual qhg.vek ()I
      // 7c: if_icmpge de
      // 7f: aload 5
      // 81: iload 6
      // 83: invokevirtual qhg.kd6 (I)Lbdo;
      // 86: astore 7
      // 88: aload 7
      // 8a: sipush 20695
      // 8d: ldc2_w 7705046828392445087
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 9b: sipush 255
      // 9e: iand
      // 9f: istore 8
      // a1: aload 4
      // a3: ifnonnull d9
      // a6: iload 8
      // a8: iflt d6
      // ab: goto b2
      // ae: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // b1: athrow
      // b2: iload 8
      // b4: aload 0
      // b5: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // b8: arraylength
      // b9: if_icmpge d6
      // bc: goto c3
      // bf: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // c2: athrow
      // c3: aload 0
      // c4: getfield net/minecraft/tileentity/TileEntityChest.hwn [Lerg;
      // c7: iload 8
      // c9: aload 7
      // cb: invokestatic erg.qog (Lbdo;)Lerg;
      // ce: aastore
      // cf: goto d6
      // d2: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // d5: athrow
      // d6: iinc 6 1
      // d9: aload 4
      // db: ifnull 75
      // de: return
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 96135098784438L;
      super.m2a(var1);
      qhg var5 = new qhg();
      int[] var10000 = TileEntityBeacon$yv7.b();
      int var6 = 0;
      int[] var4 = var10000;

      String var10001;
      label46: {
         while (true) {
            if (var6 < this.hwn.length) {
               label41: {
                  try {
                     var11 = this;
                     if (var4 != null) {
                        break;
                     }

                     if (this.hwn[var6] == null) {
                        break label41;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  bdo var7 = new bdo();
                  var7.atr(b<"b">(2045, 914885090314962795L ^ var2), (byte)var6);
                  this.hwn[var6].zy4(var7);
                  var5.w2j(var7);
               }

               var6++;
               if (var4 == null) {
                  continue;
               }
            }

            try {
               var12 = var1;
               var10001 = b<"b">(20172, 5288887945336720991L ^ var2);
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
            var10001 = b<"b">(30597, 6826623796951267103L ^ var2);
         } catch (oov var8) {
            throw a(var8);
         }
      }

      var12.rjq(var10001, this.s8i);
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
   public void xur() {
      super.xur();
      this.hd9 = false;
   }

   private void kgn(TileEntityChest param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 003: astore 3
      // 004: aload 1
      // 005: invokevirtual net/minecraft/tileentity/TileEntityChest.fyn ()Z
      // 008: aload 3
      // 009: ifnonnull 031
      // 00c: ifeq 026
      // 00f: goto 016
      // 012: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: bipush 0
      // 018: putfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 01b: aload 3
      // 01c: ifnull 110
      // 01f: goto 026
      // 022: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 0
      // 027: getfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 02a: goto 031
      // 02d: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 3
      // 032: ifnonnull 04e
      // 035: ifeq 110
      // 038: goto 03f
      // 03b: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 03e: athrow
      // 03f: getstatic net/minecraft/tileentity/TileEntityChest$1.bkw [I
      // 042: aload 2
      // 043: invokevirtual vt2.ordinal ()I
      // 046: iaload
      // 047: goto 04e
      // 04a: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 04d: athrow
      // 04e: tableswitch 194 1 4 30 72 114 156
      // 06c: aload 0
      // 06d: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 070: aload 3
      // 071: ifnonnull 08e
      // 074: goto 07b
      // 077: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 1
      // 07c: if_acmpeq 110
      // 07f: goto 086
      // 082: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 0
      // 087: goto 08e
      // 08a: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 08d: athrow
      // 08e: bipush 0
      // 08f: putfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 092: aload 3
      // 093: ifnull 110
      // 096: aload 0
      // 097: getfield net/minecraft/tileentity/TileEntityChest.bbu Lnet/minecraft/tileentity/TileEntityChest;
      // 09a: aload 3
      // 09b: ifnonnull 0b8
      // 09e: goto 0a5
      // 0a1: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 1
      // 0a6: if_acmpeq 110
      // 0a9: goto 0b0
      // 0ac: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: goto 0b8
      // 0b4: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: bipush 0
      // 0b9: putfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 0bc: aload 3
      // 0bd: ifnull 110
      // 0c0: aload 0
      // 0c1: getfield net/minecraft/tileentity/TileEntityChest.xdt Lnet/minecraft/tileentity/TileEntityChest;
      // 0c4: aload 3
      // 0c5: ifnonnull 0e2
      // 0c8: goto 0cf
      // 0cb: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: if_acmpeq 110
      // 0d3: goto 0da
      // 0d6: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: goto 0e2
      // 0de: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: bipush 0
      // 0e3: putfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 0e6: aload 3
      // 0e7: ifnull 110
      // 0ea: aload 0
      // 0eb: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 0ee: aload 3
      // 0ef: ifnonnull 10c
      // 0f2: goto 0f9
      // 0f5: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: if_acmpeq 110
      // 0fd: goto 104
      // 100: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: goto 10c
      // 108: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 10b: athrow
      // 10c: bipush 0
      // 10d: putfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 110: return
   }

   public void hc1() {
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
      // 05: aload 1
      // 06: ifnonnull 44
      // 09: getfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 0c: ifne 4e
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 1
      // 18: putfield net/minecraft/tileentity/TileEntityChest.hd9 Z
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getstatic vt2.te4 Lvt2;
      // 20: invokevirtual net/minecraft/tileentity/TileEntityChest.sl6 (Lvt2;)Lnet/minecraft/tileentity/TileEntityChest;
      // 23: putfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 26: aload 0
      // 27: aload 0
      // 28: getstatic vt2.zk4 Lvt2;
      // 2b: invokevirtual net/minecraft/tileentity/TileEntityChest.sl6 (Lvt2;)Lnet/minecraft/tileentity/TileEntityChest;
      // 2e: putfield net/minecraft/tileentity/TileEntityChest.xdt Lnet/minecraft/tileentity/TileEntityChest;
      // 31: aload 0
      // 32: aload 0
      // 33: getstatic vt2.z9q Lvt2;
      // 36: invokevirtual net/minecraft/tileentity/TileEntityChest.sl6 (Lvt2;)Lnet/minecraft/tileentity/TileEntityChest;
      // 39: putfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getstatic vt2.mxp Lvt2;
      // 48: invokevirtual net/minecraft/tileentity/TileEntityChest.sl6 (Lvt2;)Lnet/minecraft/tileentity/TileEntityChest;
      // 4b: putfield net/minecraft/tileentity/TileEntityChest.bbu Lnet/minecraft/tileentity/TileEntityChest;
      // 4e: return
   }

   public TileEntityChest sl6(vt2 param1) {
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 08: aload 1
      // 09: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0c: astore 3
      // 0d: aload 0
      // 0e: aload 2
      // 0f: ifnonnull 2f
      // 12: aload 3
      // 13: invokespecial net/minecraft/tileentity/TileEntityChest.mcc (Lmew;)Z
      // 16: ifeq 5f
      // 19: goto 20
      // 1c: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 24: aload 3
      // 25: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2e: athrow
      // 2f: astore 4
      // 31: aload 4
      // 33: aload 2
      // 34: ifnonnull 4d
      // 37: instanceof net/minecraft/tileentity/TileEntityChest
      // 3a: ifeq 5f
      // 3d: goto 44
      // 40: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 4
      // 46: goto 4d
      // 49: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 4c: athrow
      // 4d: checkcast net/minecraft/tileentity/TileEntityChest
      // 50: astore 5
      // 52: aload 5
      // 54: aload 0
      // 55: aload 1
      // 56: invokevirtual vt2.b4b ()Lvt2;
      // 59: invokespecial net/minecraft/tileentity/TileEntityChest.kgn (Lnet/minecraft/tileentity/TileEntityChest;Lvt2;)V
      // 5c: aload 5
      // 5e: areturn
      // 5f: aconst_null
      // 60: areturn
   }

   private boolean mcc(mew param1) {
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 08: aload 2
      // 09: ifnonnull 20
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 20: aload 1
      // 21: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 24: invokeinterface zfz.r_y ()Le0x; 1
      // 29: astore 3
      // 2a: aload 3
      // 2b: instanceof hrd
      // 2e: aload 2
      // 2f: ifnonnull 4a
      // 32: ifeq 67
      // 35: goto 3c
      // 38: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 3
      // 3d: checkcast hrd
      // 40: getfield hrd.whs I
      // 43: goto 4a
      // 46: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 2
      // 4b: ifnonnull 64
      // 4e: aload 0
      // 4f: invokevirtual net/minecraft/tileentity/TileEntityChest.cen ()I
      // 52: if_icmpne 67
      // 55: goto 5c
      // 58: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 64
      // 60: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 63: athrow
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
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
      // 000: getstatic net/minecraft/tileentity/TileEntityChest.a J
      // 003: ldc2_w 98116475833086
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokevirtual net/minecraft/tileentity/TileEntityChest.hc1 ()V
      // 00c: aload 0
      // 00d: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 010: invokevirtual mew.getX ()I
      // 013: istore 4
      // 015: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 018: aload 0
      // 019: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 01c: invokevirtual mew.getY ()I
      // 01f: istore 5
      // 021: aload 0
      // 022: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 025: invokevirtual mew.getZ ()I
      // 028: istore 6
      // 02a: aload 0
      // 02b: dup
      // 02c: getfield net/minecraft/tileentity/TileEntityChest.oqu I
      // 02f: bipush 1
      // 030: iadd
      // 031: putfield net/minecraft/tileentity/TileEntityChest.oqu I
      // 034: astore 3
      // 035: aload 0
      // 036: aload 3
      // 037: ifnonnull 17a
      // 03a: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 03d: getfield OpaquePredicate.v0f Z
      // 040: ifne 179
      // 043: goto 04a
      // 046: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: aload 3
      // 04c: ifnonnull 17a
      // 04f: goto 056
      // 052: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 055: athrow
      // 056: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 059: ifeq 179
      // 05c: goto 063
      // 05f: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 0
      // 064: aload 3
      // 065: ifnonnull 17a
      // 068: goto 06f
      // 06b: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 06e: athrow
      // 06f: getfield net/minecraft/tileentity/TileEntityChest.oqu I
      // 072: iload 4
      // 074: iadd
      // 075: iload 5
      // 077: iadd
      // 078: iload 6
      // 07a: iadd
      // 07b: sipush 200
      // 07e: irem
      // 07f: ifne 179
      // 082: goto 089
      // 085: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 0
      // 08a: bipush 0
      // 08b: putfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 08e: ldc 5.0
      // 090: nop
      // 091: fstore 7
      // 093: aload 0
      // 094: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 097: ldc ha9
      // 099: nop
      // 09a: new nh4
      // 09d: dup
      // 09e: iload 4
      // 0a0: i2f
      // 0a1: fload 7
      // 0a3: fsub
      // 0a4: f2d
      // 0a5: iload 5
      // 0a7: i2f
      // 0a8: fload 7
      // 0aa: fsub
      // 0ab: f2d
      // 0ac: iload 6
      // 0ae: i2f
      // 0af: fload 7
      // 0b1: fsub
      // 0b2: f2d
      // 0b3: iload 4
      // 0b5: bipush 1
      // 0b6: iadd
      // 0b7: i2f
      // 0b8: fload 7
      // 0ba: fadd
      // 0bb: f2d
      // 0bc: iload 5
      // 0be: bipush 1
      // 0bf: iadd
      // 0c0: i2f
      // 0c1: fload 7
      // 0c3: fadd
      // 0c4: f2d
      // 0c5: iload 6
      // 0c7: bipush 1
      // 0c8: iadd
      // 0c9: i2f
      // 0ca: fload 7
      // 0cc: fadd
      // 0cd: f2d
      // 0ce: invokespecial nh4.<init> (DDDDDD)V
      // 0d1: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 0d4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d9: astore 8
      // 0db: aload 8
      // 0dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e2: ifeq 179
      // 0e5: aload 8
      // 0e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ec: checkcast ha9
      // 0ef: astore 9
      // 0f1: aload 9
      // 0f3: getfield ha9.daw L_jc;
      // 0f6: aload 3
      // 0f7: ifnonnull 11e
      // 0fa: instanceof j_9
      // 0fd: aload 3
      // 0fe: ifnonnull 18a
      // 101: goto 108
      // 104: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 107: athrow
      // 108: ifeq 175
      // 10b: goto 112
      // 10e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 9
      // 114: getfield ha9.daw L_jc;
      // 117: goto 11e
      // 11a: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 11d: athrow
      // 11e: checkcast j_9
      // 121: invokevirtual j_9.giu ()Lrsi;
      // 124: astore 10
      // 126: aload 10
      // 128: aload 3
      // 129: ifnonnull 140
      // 12c: aload 0
      // 12d: if_acmpeq 164
      // 130: goto 137
      // 133: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 136: athrow
      // 137: aload 10
      // 139: goto 140
      // 13c: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 13f: athrow
      // 140: instanceof xd0
      // 143: aload 3
      // 144: ifnonnull 161
      // 147: ifeq 175
      // 14a: goto 151
      // 14d: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 150: athrow
      // 151: aload 10
      // 153: checkcast xd0
      // 156: aload 0
      // 157: invokevirtual xd0.ymi (Lrsi;)Z
      // 15a: goto 161
      // 15d: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 160: athrow
      // 161: ifeq 175
      // 164: aload 0
      // 165: dup
      // 166: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 169: bipush 1
      // 16a: iadd
      // 16b: putfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 16e: goto 175
      // 171: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 174: athrow
      // 175: aload 3
      // 176: ifnull 0db
      // 179: aload 0
      // 17a: aload 0
      // 17b: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 17e: putfield net/minecraft/tileentity/TileEntityChest.mac F
      // 181: ldc 0.1
      // 183: nop
      // 184: fstore 7
      // 186: aload 0
      // 187: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 18a: aload 3
      // 18b: ifnonnull 264
      // 18e: ifle 260
      // 191: goto 198
      // 194: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 19c: fconst_0
      // 19d: fcmpl
      // 19e: aload 3
      // 19f: ifnonnull 264
      // 1a2: goto 1a9
      // 1a5: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ifne 260
      // 1ac: goto 1b3
      // 1af: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 1b7: aload 3
      // 1b8: ifnonnull 261
      // 1bb: goto 1c2
      // 1be: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: ifnonnull 260
      // 1c5: goto 1cc
      // 1c8: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 1d0: aload 3
      // 1d1: ifnonnull 261
      // 1d4: goto 1db
      // 1d7: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1da: athrow
      // 1db: ifnonnull 260
      // 1de: goto 1e5
      // 1e1: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: iload 4
      // 1e7: i2d
      // 1e8: ldc2_w 0.5
      // 1eb: dadd
      // 1ec: dstore 8
      // 1ee: iload 6
      // 1f0: i2d
      // 1f1: ldc2_w 0.5
      // 1f4: dadd
      // 1f5: dstore 10
      // 1f7: aload 0
      // 1f8: getfield net/minecraft/tileentity/TileEntityChest.bbu Lnet/minecraft/tileentity/TileEntityChest;
      // 1fb: aload 3
      // 1fc: ifnonnull 215
      // 1ff: ifnull 211
      // 202: goto 209
      // 205: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 208: athrow
      // 209: dload 10
      // 20b: ldc2_w 0.5
      // 20e: dadd
      // 20f: dstore 10
      // 211: aload 0
      // 212: getfield net/minecraft/tileentity/TileEntityChest.xdt Lnet/minecraft/tileentity/TileEntityChest;
      // 215: aload 3
      // 216: ifnonnull 22c
      // 219: ifnull 22b
      // 21c: goto 223
      // 21f: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 222: athrow
      // 223: dload 8
      // 225: ldc2_w 0.5
      // 228: dadd
      // 229: dstore 8
      // 22b: aload 0
      // 22c: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 22f: dload 8
      // 231: iload 5
      // 233: i2d
      // 234: ldc2_w 0.5
      // 237: dadd
      // 238: dload 10
      // 23a: sipush 23313
      // 23d: ldc2_w 4283118422435367886
      // 240: lload 1
      // 241: lxor
      // 242: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: nop
      // 248: ldc 0.5
      // 24a: nop
      // 24b: aload 0
      // 24c: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 24f: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 252: invokevirtual java/util/Random.nextFloat ()F
      // 255: ldc 0.1
      // 257: nop
      // 258: fmul
      // 259: ldc 0.9
      // 25b: nop
      // 25c: fadd
      // 25d: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 260: aload 0
      // 261: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 264: aload 3
      // 265: ifnonnull 298
      // 268: ifne 28d
      // 26b: goto 272
      // 26e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 271: athrow
      // 272: aload 0
      // 273: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 276: aload 3
      // 277: ifnonnull 2cc
      // 27a: goto 281
      // 27d: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 280: athrow
      // 281: fconst_0
      // 282: fcmpl
      // 283: ifgt 2c1
      // 286: goto 28d
      // 289: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 291: goto 298
      // 294: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 3
      // 299: ifnonnull 2be
      // 29c: ifle 422
      // 29f: goto 2a6
      // 2a2: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 2aa: aload 3
      // 2ab: ifnonnull 2cc
      // 2ae: goto 2b5
      // 2b1: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: fconst_1
      // 2b6: fcmpg
      // 2b7: goto 2be
      // 2ba: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: ifge 422
      // 2c1: aload 0
      // 2c2: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 2c5: goto 2cc
      // 2c8: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: fstore 8
      // 2ce: aload 0
      // 2cf: aload 3
      // 2d0: ifnonnull 2fe
      // 2d3: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 2d6: ifle 2f6
      // 2d9: goto 2e0
      // 2dc: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2df: athrow
      // 2e0: aload 0
      // 2e1: dup
      // 2e2: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 2e5: fload 7
      // 2e7: fadd
      // 2e8: putfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 2eb: aload 3
      // 2ec: ifnull 308
      // 2ef: goto 2f6
      // 2f2: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2f5: athrow
      // 2f6: aload 0
      // 2f7: goto 2fe
      // 2fa: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: dup
      // 2ff: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 302: fload 7
      // 304: fsub
      // 305: putfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 308: aload 0
      // 309: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 30c: aload 3
      // 30d: ifnonnull 32b
      // 310: fconst_1
      // 311: fcmpl
      // 312: ifle 328
      // 315: goto 31c
      // 318: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 31b: athrow
      // 31c: aload 0
      // 31d: fconst_1
      // 31e: putfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 321: goto 328
      // 324: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 327: athrow
      // 328: ldc 0.5
      // 32a: nop
      // 32b: fstore 9
      // 32d: aload 0
      // 32e: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 331: fload 9
      // 333: fcmpg
      // 334: aload 3
      // 335: ifnonnull 41a
      // 338: ifge 409
      // 33b: goto 342
      // 33e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 341: athrow
      // 342: fload 8
      // 344: fload 9
      // 346: fcmpl
      // 347: aload 3
      // 348: ifnonnull 41a
      // 34b: goto 352
      // 34e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 351: athrow
      // 352: iflt 409
      // 355: goto 35c
      // 358: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 35b: athrow
      // 35c: aload 0
      // 35d: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 360: aload 3
      // 361: ifnonnull 40a
      // 364: goto 36b
      // 367: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 36a: athrow
      // 36b: ifnonnull 409
      // 36e: goto 375
      // 371: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 374: athrow
      // 375: aload 0
      // 376: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 379: aload 3
      // 37a: ifnonnull 40a
      // 37d: goto 384
      // 380: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 383: athrow
      // 384: ifnonnull 409
      // 387: goto 38e
      // 38a: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 38d: athrow
      // 38e: iload 4
      // 390: i2d
      // 391: ldc2_w 0.5
      // 394: dadd
      // 395: dstore 10
      // 397: iload 6
      // 399: i2d
      // 39a: ldc2_w 0.5
      // 39d: dadd
      // 39e: dstore 12
      // 3a0: aload 0
      // 3a1: getfield net/minecraft/tileentity/TileEntityChest.bbu Lnet/minecraft/tileentity/TileEntityChest;
      // 3a4: aload 3
      // 3a5: ifnonnull 3be
      // 3a8: ifnull 3ba
      // 3ab: goto 3b2
      // 3ae: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 3b1: athrow
      // 3b2: dload 12
      // 3b4: ldc2_w 0.5
      // 3b7: dadd
      // 3b8: dstore 12
      // 3ba: aload 0
      // 3bb: getfield net/minecraft/tileentity/TileEntityChest.xdt Lnet/minecraft/tileentity/TileEntityChest;
      // 3be: aload 3
      // 3bf: ifnonnull 3d5
      // 3c2: ifnull 3d4
      // 3c5: goto 3cc
      // 3c8: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 3cb: athrow
      // 3cc: dload 10
      // 3ce: ldc2_w 0.5
      // 3d1: dadd
      // 3d2: dstore 10
      // 3d4: aload 0
      // 3d5: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 3d8: dload 10
      // 3da: iload 5
      // 3dc: i2d
      // 3dd: ldc2_w 0.5
      // 3e0: dadd
      // 3e1: dload 12
      // 3e3: sipush 19648
      // 3e6: ldc2_w 2193531357633223704
      // 3e9: lload 1
      // 3ea: lxor
      // 3eb: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: nop
      // 3f1: ldc 0.5
      // 3f3: nop
      // 3f4: aload 0
      // 3f5: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 3f8: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 3fb: invokevirtual java/util/Random.nextFloat ()F
      // 3fe: ldc 0.1
      // 400: nop
      // 401: fmul
      // 402: ldc 0.9
      // 404: nop
      // 405: fadd
      // 406: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 409: aload 0
      // 40a: aload 3
      // 40b: ifnonnull 41e
      // 40e: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 411: fconst_0
      // 412: fcmpg
      // 413: goto 41a
      // 416: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 419: athrow
      // 41a: ifge 422
      // 41d: aload 0
      // 41e: fconst_0
      // 41f: putfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 422: return
   }

   @Override
   public boolean hjo(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 25
      // 09: bipush 1
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: iload 2
      // 16: putfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 19: bipush 1
      // 1a: ireturn
      // 1b: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: iload 2
      // 22: invokespecial net/minecraft/tileentity/TileEntityLockable.hjo (II)Z
      // 25: ireturn
   }

   @Override
   public void dk0(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual ha9.myu ()Z
      // 08: aload 2
      // 09: ifnonnull 2c
      // 0c: ifne 7a
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 2
      // 18: ifnonnull 69
      // 1b: goto 22
      // 1e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 25: goto 2c
      // 28: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifge 3b
      // 2f: aload 0
      // 30: bipush 0
      // 31: putfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 34: goto 3b
      // 37: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: dup
      // 3d: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 40: bipush 1
      // 41: iadd
      // 42: putfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 45: aload 0
      // 46: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 49: aload 0
      // 4a: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 4d: aload 0
      // 4e: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 51: bipush 1
      // 52: aload 0
      // 53: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 56: invokevirtual OpaquePredicate.dfj (Lmew;Le0x;II)V
      // 59: aload 0
      // 5a: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 5d: aload 0
      // 5e: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 61: aload 0
      // 62: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 65: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 68: aload 0
      // 69: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 6c: aload 0
      // 6d: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 70: invokevirtual mew.eve ()Lmew;
      // 73: aload 0
      // 74: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 77: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 7a: return
   }

   @Override
   public void vhz(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 1
      // 05: invokevirtual ha9.myu ()Z
      // 08: aload 2
      // 09: ifnonnull 2f
      // 0c: ifne 78
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 2
      // 18: ifnonnull 67
      // 1b: goto 22
      // 1e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 21: athrow
      // 22: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 25: instanceof hrd
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 78
      // 32: aload 0
      // 33: dup
      // 34: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 37: bipush 1
      // 38: isub
      // 39: putfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 3c: aload 0
      // 3d: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 40: aload 0
      // 41: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 44: aload 0
      // 45: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 48: bipush 1
      // 49: aload 0
      // 4a: getfield net/minecraft/tileentity/TileEntityChest.y5u I
      // 4d: invokevirtual OpaquePredicate.dfj (Lmew;Le0x;II)V
      // 50: aload 0
      // 51: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 54: aload 0
      // 55: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 58: aload 0
      // 59: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 5c: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 5f: aload 0
      // 60: goto 67
      // 63: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 66: athrow
      // 67: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 6a: aload 0
      // 6b: getfield net/minecraft/tileentity/TileEntityChest.al2 Lmew;
      // 6e: invokevirtual mew.eve ()Lmew;
      // 71: aload 0
      // 72: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 75: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 78: return
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
   }

   @Override
   public void whd() {
      super.whd();
      this.xur();
      this.hc1();
   }

   public int cen() {
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
      // 05: getfield net/minecraft/tileentity/TileEntityChest.ylx I
      // 08: aload 1
      // 09: ifnonnull 64
      // 0c: bipush -1
      // 0d: if_icmpne 60
      // 10: goto 17
      // 13: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: ifnonnull 38
      // 1c: goto 23
      // 1f: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 22: athrow
      // 23: getfield net/minecraft/tileentity/TileEntityChest.yh_ Lt9d;
      // 26: ifnull 4c
      // 29: goto 30
      // 2c: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: ifnonnull 53
      // 3c: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 3f: instanceof hrd
      // 42: ifne 52
      // 45: goto 4c
      // 48: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: invokestatic net/minecraft/tileentity/TileEntityChest.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: aload 0
      // 54: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 57: checkcast hrd
      // 5a: getfield hrd.whs I
      // 5d: putfield net/minecraft/tileentity/TileEntityChest.ylx I
      // 60: aload 0
      // 61: getfield net/minecraft/tileentity/TileEntityChest.ylx I
      // 64: ireturn
   }

   @Override
   public String q4l() {
      long var1 = a ^ 70676386422768L;
      return b<"b">(11696, 1629922942398933101L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new j_9(var1, this, var2);
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

      while (var2 < this.hwn.length) {
         this.hwn[var2] = null;
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
      long var10000 = c.a(4541207359530150357L, -1856606084131134662L, MethodHandles.lookup().lookupClass()).a(213643980668337L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 33430231887994L;
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
      String var6 = "\u008f\u0093¾µ ý@\u0012\u0080xÑ{C \u0018Ãp\u0096Ã|ot»PÈð\"\u008fÚ\u00054\u001b\u0010Î0ç©ãBØ¥hÃ\t\u0003²M\n>(ÇØæ²\u009e\u008b8#Råf°jÏ¤1O\u0088-\u0099\u000e\u0000Òµ\\[j9g}Ââl\u0012\rìtÚ0\u0001 çj=\u0099\u0098][÷\r\u001aÉÆ\u0097\u0017{\u001fí×zyb\rÆÈ<ä^MB¶{â\u0010B¤\u0080\u009bz\u0002t\u009b\u0096\u000b\rARñîó(W?»\"\u001bvî\u009f«\"\n\bþÇë¤¶³\u0090çú\u0085=~9ª\u001e£\u008f½\rJz1È%PQ\u0014²\u0010ü\u001a-Åj\u0000Ë[¡ÈÇ7\u0089¯\u001b¯\u0010'i\u0085\f\u00972#2\u0084ï\u0006VÄ\u0099]\u0003";
      int var8 = "\u008f\u0093¾µ ý@\u0012\u0080xÑ{C \u0018Ãp\u0096Ã|ot»PÈð\"\u008fÚ\u00054\u001b\u0010Î0ç©ãBØ¥hÃ\t\u0003²M\n>(ÇØæ²\u009e\u008b8#Råf°jÏ¤1O\u0088-\u0099\u000e\u0000Òµ\\[j9g}Ââl\u0012\rìtÚ0\u0001 çj=\u0099\u0098][÷\r\u001aÉÆ\u0097\u0017{\u001fí×zyb\rÆÈ<ä^MB¶{â\u0010B¤\u0080\u009bz\u0002t\u009b\u0096\u000b\rARñîó(W?»\"\u001bvî\u009f«\"\n\bþÇë¤¶³\u0090çú\u0085=~9ª\u001e£\u008f½\rJz1È%PQ\u0014²\u0010ü\u001a-Åj\u0000Ë[¡ÈÇ7\u0089¯\u001b¯\u0010'i\u0085\f\u00972#2\u0084ï\u0006VÄ\u0099]\u0003"
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

                  var6 = "YbÞoE`Q\u0017àÕi?^ì¡¨ãEy6Ò3²À\u0018¹'\u0090ñK¨p\u0095õ¶£MµZ|XÅ\\]Ç\u0001\u0089µt";
                  var8 = "YbÞoE`Q\u0017àÕi?^ì¡¨ãEy6Ò3²À\u0018¹'\u0090ñK¨p\u0095õ¶£MµZ|XÅ\\]Ç\u0001\u0089µt".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20832;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityChest", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityChest" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
