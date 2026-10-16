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

public class TileEntityFurnace extends TileEntityLockable implements xcy, hjb {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public int opt() {
      return this.m4l.length;
   }

   @Override
   public erg ibn(int var1) {
      return this.m4l[var1];
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
      // 05: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 3
      // 0b: ifnonnull 25
      // 0e: ifnull 7d
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 3
      // 26: ifnonnull 53
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 49
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 4
      // 48: areturn
      // 49: aload 0
      // 4a: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 4d: iload 1
      // 4e: aaload
      // 4f: iload 2
      // 50: invokevirtual erg.amj (I)Lerg;
      // 53: astore 4
      // 55: aload 0
      // 56: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 59: iload 1
      // 5a: aaload
      // 5b: aload 3
      // 5c: ifnonnull 7c
      // 5f: getfield erg.qd2 I
      // 62: ifne 7a
      // 65: goto 6c
      // 68: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 70: iload 1
      // 71: aconst_null
      // 72: aastore
      // 73: goto 7a
      // 76: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
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
      // 05: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: aload 2
      // 0b: ifnonnull 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
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
      // 04: aload 2
      // 05: aload 3
      // 06: ifnonnull 14
      // 09: ifnull 4e
      // 0c: goto 13
      // 0f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 2
      // 14: aload 0
      // 15: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 18: iload 1
      // 19: aaload
      // 1a: invokevirtual erg.efv (Lerg;)Z
      // 1d: aload 3
      // 1e: ifnonnull 3c
      // 21: ifeq 4e
      // 24: goto 2b
      // 27: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 2
      // 2c: aload 0
      // 2d: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 30: iload 1
      // 31: aaload
      // 32: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 35: goto 3c
      // 38: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 3
      // 3d: ifnonnull 4b
      // 40: ifeq 4e
      // 43: goto 4a
      // 46: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: istore 4
      // 51: aload 0
      // 52: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 55: iload 1
      // 56: aload 2
      // 57: aastore
      // 58: aload 2
      // 59: aload 3
      // 5a: ifnonnull 68
      // 5d: ifnull 8c
      // 60: goto 67
      // 63: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 2
      // 68: getfield erg.qd2 I
      // 6b: aload 3
      // 6c: ifnonnull 8d
      // 6f: aload 0
      // 70: invokevirtual net/minecraft/tileentity/TileEntityFurnace.v6l ()I
      // 73: if_icmple 8c
      // 76: goto 7d
      // 79: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 2
      // 7e: aload 0
      // 7f: invokevirtual net/minecraft/tileentity/TileEntityFurnace.v6l ()I
      // 82: putfield erg.qd2 I
      // 85: goto 8c
      // 88: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 8b: athrow
      // 8c: iload 1
      // 8d: aload 3
      // 8e: ifnonnull 9d
      // 91: ifne b9
      // 94: goto 9b
      // 97: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 9a: athrow
      // 9b: iload 4
      // 9d: ifne b9
      // a0: aload 0
      // a1: aload 0
      // a2: aload 2
      // a3: invokevirtual net/minecraft/tileentity/TileEntityFurnace.mu7 (Lerg;)I
      // a6: putfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // a9: aload 0
      // aa: bipush 0
      // ab: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // ae: aload 0
      // af: invokevirtual net/minecraft/tileentity/TileEntityFurnace.r5t ()V
      // b2: goto b9
      // b5: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // b8: athrow
      // b9: return
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
      // 00: getstatic net/minecraft/tileentity/TileEntityFurnace.a J
      // 03: ldc2_w 85065916211989
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull 26
      // 11: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 25: athrow
      // 26: getfield net/minecraft/tileentity/TileEntityFurnace.is2 Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 32032
      // 2f: ldc2_w 1315045785207418000
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 05: getfield net/minecraft/tileentity/TileEntityFurnace.is2 Ljava/lang/String;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityFurnace.is2 Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.length ()I
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifle 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void zwx(String var1) {
      this.is2 = var1;
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
      // 000: getstatic net/minecraft/tileentity/TileEntityFurnace.a J
      // 003: ldc2_w 40362378639688
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial net/minecraft/tileentity/TileEntityLockable.agl (Lbdo;)V
      // 00d: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 010: aload 1
      // 011: sipush 1490
      // 014: ldc2_w 4135102429823077946
      // 017: lload 2
      // 018: lxor
      // 019: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: nop
      // 01f: bipush 10
      // 021: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 024: astore 5
      // 026: aload 0
      // 027: aload 0
      // 028: invokevirtual net/minecraft/tileentity/TileEntityFurnace.opt ()I
      // 02b: anewarray 37
      // 02e: putfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 031: bipush 0
      // 032: istore 6
      // 034: astore 4
      // 036: iload 6
      // 038: aload 5
      // 03a: invokevirtual qhg.vek ()I
      // 03d: if_icmpge 0a7
      // 040: aload 5
      // 042: iload 6
      // 044: invokevirtual qhg.kd6 (I)Lbdo;
      // 047: astore 7
      // 049: aload 7
      // 04b: sipush 15203
      // 04e: ldc2_w 6380027319965134984
      // 051: lload 2
      // 052: lxor
      // 053: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: nop
      // 059: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 05c: istore 8
      // 05e: aload 4
      // 060: ifnonnull 0a2
      // 063: iload 8
      // 065: aload 4
      // 067: ifnonnull 116
      // 06a: goto 071
      // 06d: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 070: athrow
      // 071: iflt 09f
      // 074: goto 07b
      // 077: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 07a: athrow
      // 07b: iload 8
      // 07d: aload 0
      // 07e: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 081: arraylength
      // 082: if_icmpge 09f
      // 085: goto 08c
      // 088: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 090: iload 8
      // 092: aload 7
      // 094: invokestatic erg.qog (Lbdo;)Lerg;
      // 097: aastore
      // 098: goto 09f
      // 09b: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 09e: athrow
      // 09f: iinc 6 1
      // 0a2: aload 4
      // 0a4: ifnull 036
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: sipush 8825
      // 0ac: ldc2_w 4581807743965276575
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 0ba: putfield net/minecraft/tileentity/TileEntityFurnace.swk I
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: sipush 20944
      // 0c2: ldc2_w 6082596591594887729
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: nop
      // 0cd: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 0d0: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 0d3: aload 0
      // 0d4: aload 1
      // 0d5: sipush 13809
      // 0d8: ldc2_w 7698816801145241115
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 0e6: putfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // 0e9: aload 0
      // 0ea: aload 4
      // 0ec: ifnonnull 11a
      // 0ef: aload 0
      // 0f0: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 0f3: bipush 1
      // 0f4: aaload
      // 0f5: invokestatic net/minecraft/tileentity/TileEntityFurnace.lxv (Lerg;)I
      // 0f8: putfield net/minecraft/tileentity/TileEntityFurnace.xio I
      // 0fb: aload 1
      // 0fc: sipush 24202
      // 0ff: ldc2_w 8789280346093835629
      // 102: lload 2
      // 103: lxor
      // 104: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: nop
      // 10a: bipush 8
      // 10c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 10f: goto 116
      // 112: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 115: athrow
      // 116: ifeq 12f
      // 119: aload 0
      // 11a: aload 1
      // 11b: sipush 24202
      // 11e: ldc2_w 8789280346093835629
      // 121: lload 2
      // 122: lxor
      // 123: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: nop
      // 129: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 12c: putfield net/minecraft/tileentity/TileEntityFurnace.is2 Ljava/lang/String;
      // 12f: invokestatic EntityLivingBase.b ()[Li2h;
      // 132: ifnull 142
      // 135: bipush 1
      // 136: newarray 10
      // 138: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ([I)V
      // 13b: goto 142
      // 13e: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 141: athrow
      // 142: return
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 91310349933972L;
      super.m2a(var1);
      var1.ge7(b<"e">(31331, 3347241438092301659L ^ var2), (short)this.swk);
      int[] var10000 = TileEntityBeacon$yv7.b();
      var1.ge7(b<"e">(4528, 7309464761673449103L ^ var2), (short)this.rhk);
      var1.ge7(b<"e">(4261, 128551373637386133L ^ var2), (short)this.xkj);
      qhg var5 = new qhg();
      int[] var4 = var10000;
      int var6 = 0;

      String var10001;
      label46: {
         while (true) {
            if (var6 < this.m4l.length) {
               label41: {
                  try {
                     var11 = this;
                     if (var4 != null) {
                        break;
                     }

                     if (this.m4l[var6] == null) {
                        break label41;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  bdo var7 = new bdo();
                  var7.atr(b<"e">(18000, 4820281607128557923L ^ var2), (byte)var6);
                  this.m4l[var6].zy4(var7);
                  var5.w2j(var7);
               }

               var6++;
               if (var4 == null) {
                  continue;
               }
            }

            try {
               var12 = var1;
               var10001 = b<"e">(23049, 8099714349965587771L ^ var2);
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
            var10001 = b<"e">(10890, 1918446378044442038L ^ var2);
         } catch (oov var8) {
            throw a(var8);
         }
      }

      var12.rjq(var10001, this.is2);
   }

   @Override
   public int v6l() {
      return 64;
   }

   public boolean qgi() {
      int[] var1 = TileEntityBeacon$yv7.b();

      try {
         if (var1 != null) {
            return (boolean)this.swk;
         }

         if (this.swk > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public static boolean wql(rsi var0) {
      int[] var1 = TileEntityBeacon$yv7.b();

      try {
         int var10000 = var0.czu(0);
         if (var1 != null) {
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

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 004: istore 2
      // 005: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 008: bipush 0
      // 009: istore 3
      // 00a: astore 1
      // 00b: aload 0
      // 00c: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 00f: aload 1
      // 010: ifnonnull 035
      // 013: ifeq 02e
      // 016: goto 01d
      // 019: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: dup
      // 01f: getfield net/minecraft/tileentity/TileEntityFurnace.swk I
      // 022: bipush 1
      // 023: isub
      // 024: putfield net/minecraft/tileentity/TileEntityFurnace.swk I
      // 027: goto 02e
      // 02a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield net/minecraft/tileentity/TileEntityFurnace.yh_ Lt9d;
      // 032: getfield OpaquePredicate.v0f Z
      // 035: aload 1
      // 036: ifnonnull 24b
      // 039: ifne 24a
      // 03c: goto 043
      // 03f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 047: aload 1
      // 048: ifnonnull 09d
      // 04b: goto 052
      // 04e: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 051: athrow
      // 052: ifne 092
      // 055: goto 05c
      // 058: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 05b: athrow
      // 05c: aload 0
      // 05d: aload 1
      // 05e: ifnonnull 1e3
      // 061: goto 068
      // 064: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 06b: bipush 1
      // 06c: aaload
      // 06d: ifnull 1db
      // 070: goto 077
      // 073: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: aload 1
      // 079: ifnonnull 1e3
      // 07c: goto 083
      // 07f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 082: athrow
      // 083: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 086: bipush 0
      // 087: aaload
      // 088: ifnull 1db
      // 08b: goto 092
      // 08e: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 096: goto 09d
      // 099: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 1
      // 09e: ifnonnull 16b
      // 0a1: ifne 15c
      // 0a4: goto 0ab
      // 0a7: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: invokespecial net/minecraft/tileentity/TileEntityFurnace.u5c ()Z
      // 0af: aload 1
      // 0b0: ifnonnull 16b
      // 0b3: goto 0ba
      // 0b6: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: ifeq 15c
      // 0bd: goto 0c4
      // 0c0: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 0
      // 0c6: aload 0
      // 0c7: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 0ca: bipush 1
      // 0cb: aaload
      // 0cc: invokestatic net/minecraft/tileentity/TileEntityFurnace.lxv (Lerg;)I
      // 0cf: dup_x1
      // 0d0: putfield net/minecraft/tileentity/TileEntityFurnace.swk I
      // 0d3: putfield net/minecraft/tileentity/TileEntityFurnace.xio I
      // 0d6: aload 0
      // 0d7: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 0da: aload 1
      // 0db: ifnonnull 16b
      // 0de: goto 0e5
      // 0e1: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: ifeq 15c
      // 0e8: goto 0ef
      // 0eb: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: bipush 1
      // 0f0: istore 3
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: ifnonnull 15d
      // 0f6: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 0f9: bipush 1
      // 0fa: aaload
      // 0fb: ifnull 15c
      // 0fe: goto 105
      // 101: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 109: bipush 1
      // 10a: aaload
      // 10b: dup
      // 10c: getfield erg.qd2 I
      // 10f: bipush 1
      // 110: isub
      // 111: putfield erg.qd2 I
      // 114: aload 0
      // 115: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 118: bipush 1
      // 119: aaload
      // 11a: getfield erg.qd2 I
      // 11d: aload 1
      // 11e: ifnonnull 16b
      // 121: goto 128
      // 124: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 127: athrow
      // 128: ifne 15c
      // 12b: goto 132
      // 12e: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 0
      // 133: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 136: bipush 1
      // 137: aaload
      // 138: invokevirtual erg.gn1 ()Lu7m;
      // 13b: invokevirtual u7m.cqe ()Lu7m;
      // 13e: astore 4
      // 140: aload 0
      // 141: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 144: bipush 1
      // 145: aload 4
      // 147: ifnull 15a
      // 14a: new erg
      // 14d: dup
      // 14e: aload 4
      // 150: invokespecial erg.<init> (Lu7m;)V
      // 153: goto 15b
      // 156: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 159: athrow
      // 15a: aconst_null
      // 15b: aastore
      // 15c: aload 0
      // 15d: aload 1
      // 15e: ifnonnull 1d3
      // 161: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 164: goto 16b
      // 167: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 16a: athrow
      // 16b: ifeq 1cb
      // 16e: aload 0
      // 16f: aload 1
      // 170: ifnonnull 1d3
      // 173: goto 17a
      // 176: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 179: athrow
      // 17a: invokespecial net/minecraft/tileentity/TileEntityFurnace.u5c ()Z
      // 17d: ifeq 1cb
      // 180: goto 187
      // 183: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 186: athrow
      // 187: aload 0
      // 188: dup
      // 189: getfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 18c: bipush 1
      // 18d: iadd
      // 18e: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 191: aload 0
      // 192: getfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 195: aload 0
      // 196: getfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // 199: aload 1
      // 19a: ifnonnull 236
      // 19d: goto 1a4
      // 1a0: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: if_icmpne 226
      // 1a7: goto 1ae
      // 1aa: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: bipush 0
      // 1b0: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 1b3: aload 0
      // 1b4: aload 0
      // 1b5: aload 0
      // 1b6: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 1b9: bipush 0
      // 1ba: aaload
      // 1bb: invokevirtual net/minecraft/tileentity/TileEntityFurnace.mu7 (Lerg;)I
      // 1be: putfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // 1c1: aload 0
      // 1c2: invokevirtual net/minecraft/tileentity/TileEntityFurnace.hh5 ()V
      // 1c5: bipush 1
      // 1c6: istore 3
      // 1c7: aload 1
      // 1c8: ifnull 226
      // 1cb: aload 0
      // 1cc: goto 1d3
      // 1cf: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: bipush 0
      // 1d4: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 1d7: aload 1
      // 1d8: ifnull 226
      // 1db: aload 0
      // 1dc: goto 1e3
      // 1df: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 1e6: aload 1
      // 1e7: ifnonnull 227
      // 1ea: ifne 226
      // 1ed: goto 1f4
      // 1f0: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: getfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 1f8: aload 1
      // 1f9: ifnonnull 227
      // 1fc: goto 203
      // 1ff: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 202: athrow
      // 203: ifle 226
      // 206: goto 20d
      // 209: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 20c: athrow
      // 20d: aload 0
      // 20e: aload 0
      // 20f: getfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 212: bipush 2
      // 213: isub
      // 214: bipush 0
      // 215: aload 0
      // 216: getfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // 219: invokestatic fe6.faa (III)I
      // 21c: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 21f: goto 226
      // 222: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 225: athrow
      // 226: iload 2
      // 227: aload 1
      // 228: ifnonnull 24b
      // 22b: aload 0
      // 22c: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 22f: goto 236
      // 232: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 235: athrow
      // 236: if_icmpeq 24a
      // 239: bipush 1
      // 23a: istore 3
      // 23b: aload 0
      // 23c: invokevirtual net/minecraft/tileentity/TileEntityFurnace.qgi ()Z
      // 23f: aload 0
      // 240: getfield net/minecraft/tileentity/TileEntityFurnace.yh_ Lt9d;
      // 243: aload 0
      // 244: getfield net/minecraft/tileentity/TileEntityFurnace.al2 Lmew;
      // 247: invokestatic ovv.hl4 (ZLt9d;Lmew;)V
      // 24a: iload 3
      // 24b: ifeq 259
      // 24e: aload 0
      // 24f: invokevirtual net/minecraft/tileentity/TileEntityFurnace.r5t ()V
      // 252: goto 259
      // 255: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 258: athrow
      // 259: return
   }

   public int mu7(erg var1) {
      return 200;
   }

   private boolean u5c() {
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
      // 05: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 08: bipush 0
      // 09: aaload
      // 0a: aload 1
      // 0b: ifnonnull 2a
      // 0e: ifnonnull 1e
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1d: athrow
      // 1e: invokestatic x65.eor ()Lx65;
      // 21: aload 0
      // 22: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 25: bipush 0
      // 26: aaload
      // 27: invokevirtual x65.jsl (Lerg;)Lerg;
      // 2a: astore 2
      // 2b: aload 2
      // 2c: aload 1
      // 2d: ifnonnull 48
      // 30: ifnonnull 42
      // 33: goto 3a
      // 36: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 0
      // 3b: goto e8
      // 3e: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 46: bipush 2
      // 47: aaload
      // 48: aload 1
      // 49: ifnonnull 64
      // 4c: ifnonnull 5e
      // 4f: goto 56
      // 52: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 55: athrow
      // 56: bipush 1
      // 57: goto e8
      // 5a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 62: bipush 2
      // 63: aaload
      // 64: aload 2
      // 65: invokevirtual erg.efv (Lerg;)Z
      // 68: aload 1
      // 69: ifnonnull 87
      // 6c: ifne 7e
      // 6f: goto 76
      // 72: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 75: athrow
      // 76: bipush 0
      // 77: goto e8
      // 7a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 82: bipush 2
      // 83: aaload
      // 84: getfield erg.qd2 I
      // 87: aload 0
      // 88: invokevirtual net/minecraft/tileentity/TileEntityFurnace.v6l ()I
      // 8b: aload 1
      // 8c: ifnonnull e0
      // 8f: if_icmpge c8
      // 92: goto 99
      // 95: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 9d: bipush 2
      // 9e: aaload
      // 9f: getfield erg.qd2 I
      // a2: aload 0
      // a3: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // a6: bipush 2
      // a7: aaload
      // a8: invokevirtual erg.h4s ()I
      // ab: aload 1
      // ac: ifnonnull e0
      // af: goto b6
      // b2: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // b5: athrow
      // b6: if_icmpge c8
      // b9: goto c0
      // bc: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // bf: athrow
      // c0: bipush 1
      // c1: goto e8
      // c4: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // c7: athrow
      // c8: aload 0
      // c9: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // cc: bipush 2
      // cd: aaload
      // ce: getfield erg.qd2 I
      // d1: aload 1
      // d2: ifnonnull e4
      // d5: aload 2
      // d6: invokevirtual erg.h4s ()I
      // d9: goto e0
      // dc: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // df: athrow
      // e0: if_icmpge e7
      // e3: bipush 1
      // e4: goto e8
      // e7: bipush 0
      // e8: ireturn
   }

   public void hh5() {
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
      // 005: invokespecial net/minecraft/tileentity/TileEntityFurnace.u5c ()Z
      // 008: ifeq 13c
      // 00b: invokestatic x65.eor ()Lx65;
      // 00e: aload 0
      // 00f: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 012: bipush 0
      // 013: aaload
      // 014: invokevirtual x65.jsl (Lerg;)Lerg;
      // 017: astore 2
      // 018: aload 0
      // 019: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 01c: bipush 2
      // 01d: aaload
      // 01e: aload 1
      // 01f: ifnonnull 04e
      // 022: ifnonnull 041
      // 025: goto 02c
      // 028: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 030: bipush 2
      // 031: aload 2
      // 032: invokevirtual erg.yaq ()Lerg;
      // 035: aastore
      // 036: aload 1
      // 037: ifnull 079
      // 03a: goto 041
      // 03d: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 040: athrow
      // 041: aload 0
      // 042: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 045: bipush 2
      // 046: aaload
      // 047: goto 04e
      // 04a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 04d: athrow
      // 04e: invokevirtual erg.gn1 ()Lu7m;
      // 051: aload 2
      // 052: invokevirtual erg.gn1 ()Lu7m;
      // 055: aload 1
      // 056: ifnonnull 093
      // 059: if_acmpne 079
      // 05c: goto 063
      // 05f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 0
      // 064: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 067: bipush 2
      // 068: aaload
      // 069: dup
      // 06a: getfield erg.qd2 I
      // 06d: bipush 1
      // 06e: iadd
      // 06f: putfield erg.qd2 I
      // 072: goto 079
      // 075: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 07d: bipush 0
      // 07e: aaload
      // 07f: aload 1
      // 080: ifnonnull 128
      // 083: invokevirtual erg.gn1 ()Lu7m;
      // 086: getstatic ox_.u7i Le0x;
      // 089: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 08c: goto 093
      // 08f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 092: athrow
      // 093: if_acmpne 108
      // 096: aload 0
      // 097: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 09a: bipush 0
      // 09b: aaload
      // 09c: invokevirtual erg.j6_ ()I
      // 09f: aload 1
      // 0a0: ifnonnull 12b
      // 0a3: goto 0aa
      // 0a6: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: if_icmpne 108
      // 0ae: goto 0b5
      // 0b1: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 0b9: bipush 1
      // 0ba: aaload
      // 0bb: aload 1
      // 0bc: ifnonnull 128
      // 0bf: goto 0c6
      // 0c2: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: ifnull 108
      // 0c9: goto 0d0
      // 0cc: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 0d4: bipush 1
      // 0d5: aaload
      // 0d6: aload 1
      // 0d7: ifnonnull 128
      // 0da: goto 0e1
      // 0dd: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: invokevirtual erg.gn1 ()Lu7m;
      // 0e4: getstatic xbr.xxz Lu7m;
      // 0e7: if_acmpne 108
      // 0ea: goto 0f1
      // 0ed: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 0f5: bipush 1
      // 0f6: new erg
      // 0f9: dup
      // 0fa: getstatic xbr.lqp Lu7m;
      // 0fd: invokespecial erg.<init> (Lu7m;)V
      // 100: aastore
      // 101: goto 108
      // 104: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 10c: bipush 0
      // 10d: aaload
      // 10e: dup
      // 10f: getfield erg.qd2 I
      // 112: bipush 1
      // 113: isub
      // 114: putfield erg.qd2 I
      // 117: aload 0
      // 118: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 11b: bipush 0
      // 11c: aload 1
      // 11d: ifnonnull 13a
      // 120: aaload
      // 121: goto 128
      // 124: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 127: athrow
      // 128: getfield erg.qd2 I
      // 12b: ifgt 13c
      // 12e: aload 0
      // 12f: getfield net/minecraft/tileentity/TileEntityFurnace.m4l [Lerg;
      // 132: bipush 0
      // 133: goto 13a
      // 136: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 139: athrow
      // 13a: aconst_null
      // 13b: aastore
      // 13c: return
   }

   public static int lxv(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/minecraft/tileentity/TileEntityFurnace.a J
      // 003: ldc2_w 24151688997459
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 00b: astore 3
      // 00c: aload 0
      // 00d: aload 3
      // 00e: ifnonnull 022
      // 011: ifnonnull 021
      // 014: goto 01b
      // 017: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 01a: athrow
      // 01b: bipush 0
      // 01c: ireturn
      // 01d: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: invokevirtual erg.gn1 ()Lu7m;
      // 025: astore 4
      // 027: aload 4
      // 029: instanceof gun
      // 02c: aload 3
      // 02d: ifnonnull 0ac
      // 030: ifeq 0a7
      // 033: goto 03a
      // 036: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 4
      // 03c: aload 3
      // 03d: ifnonnull 0a9
      // 040: goto 047
      // 043: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 046: athrow
      // 047: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 04a: getstatic ox_.ibw Le0x;
      // 04d: if_acmpeq 0a7
      // 050: goto 057
      // 053: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 4
      // 059: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 05c: astore 5
      // 05e: aload 5
      // 060: aload 3
      // 061: ifnonnull 07b
      // 064: getstatic ox_.jp3 Lizd;
      // 067: if_acmpne 079
      // 06a: goto 071
      // 06d: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 070: athrow
      // 071: sipush 150
      // 074: ireturn
      // 075: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 5
      // 07b: aload 3
      // 07c: ifnonnull 099
      // 07f: invokevirtual e0x.p1r ()Lp3y;
      // 082: getstatic p3y.fdu Lp3y;
      // 085: if_acmpne 097
      // 088: goto 08f
      // 08b: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 08e: athrow
      // 08f: sipush 300
      // 092: ireturn
      // 093: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 5
      // 099: getstatic ox_.orh Le0x;
      // 09c: if_acmpne 0a7
      // 09f: sipush 16000
      // 0a2: ireturn
      // 0a3: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 4
      // 0a9: instanceof arf
      // 0ac: aload 3
      // 0ad: ifnonnull 0f7
      // 0b0: ifeq 0f2
      // 0b3: goto 0ba
      // 0b6: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 4
      // 0bc: checkcast arf
      // 0bf: invokevirtual arf.y5n ()Ljava/lang/String;
      // 0c2: sipush 31976
      // 0c5: ldc2_w 5960714763393606682
      // 0c8: lload 1
      // 0c9: lxor
      // 0ca: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d3: aload 3
      // 0d4: ifnonnull 0f7
      // 0d7: goto 0de
      // 0da: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: ifeq 0f2
      // 0e1: goto 0e8
      // 0e4: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: sipush 200
      // 0eb: goto 210
      // 0ee: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 4
      // 0f4: instanceof za6
      // 0f7: aload 3
      // 0f8: ifnonnull 14d
      // 0fb: ifeq 13d
      // 0fe: goto 105
      // 101: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 4
      // 107: checkcast za6
      // 10a: invokevirtual za6.h6t ()Ljava/lang/String;
      // 10d: sipush 12449
      // 110: ldc2_w 5270745670487894104
      // 113: lload 1
      // 114: lxor
      // 115: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11e: aload 3
      // 11f: ifnonnull 14d
      // 122: goto 129
      // 125: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 128: athrow
      // 129: ifeq 13d
      // 12c: goto 133
      // 12f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 132: athrow
      // 133: sipush 200
      // 136: goto 210
      // 139: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 4
      // 13f: aload 3
      // 140: ifnonnull 18a
      // 143: instanceof d1x
      // 146: goto 14d
      // 149: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 14c: athrow
      // 14d: ifeq 188
      // 150: aload 4
      // 152: checkcast d1x
      // 155: aload 3
      // 156: ifnonnull 18a
      // 159: goto 160
      // 15c: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 15f: athrow
      // 160: invokevirtual d1x.zjw ()Ljava/lang/String;
      // 163: sipush 12449
      // 166: ldc2_w 5270745670487894104
      // 169: lload 1
      // 16a: lxor
      // 16b: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFurnace.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: nop
      // 171: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 174: ifeq 188
      // 177: goto 17e
      // 17a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 17d: athrow
      // 17e: sipush 200
      // 181: goto 210
      // 184: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 4
      // 18a: getstatic xbr.t1j Lu7m;
      // 18d: aload 3
      // 18e: ifnonnull 1a9
      // 191: if_acmpne 1a4
      // 194: goto 19b
      // 197: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 19a: athrow
      // 19b: bipush 100
      // 19d: goto 210
      // 1a0: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: aload 4
      // 1a6: getstatic xbr.thr Lu7m;
      // 1a9: aload 3
      // 1aa: ifnonnull 1c6
      // 1ad: if_acmpne 1c1
      // 1b0: goto 1b7
      // 1b3: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: sipush 1600
      // 1ba: goto 210
      // 1bd: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 4
      // 1c3: getstatic xbr.miu Lu7m;
      // 1c6: aload 3
      // 1c7: ifnonnull 1e6
      // 1ca: if_acmpne 1de
      // 1cd: goto 1d4
      // 1d0: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: sipush 20000
      // 1d7: goto 210
      // 1da: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: aload 4
      // 1e0: getstatic ox_.t_k Le0x;
      // 1e3: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 1e6: aload 3
      // 1e7: ifnonnull 202
      // 1ea: if_acmpne 1fd
      // 1ed: goto 1f4
      // 1f0: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: bipush 100
      // 1f6: goto 210
      // 1f9: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: aload 4
      // 1ff: getstatic xbr.nh7 Lu7m;
      // 202: if_acmpne 20f
      // 205: sipush 2400
      // 208: goto 210
      // 20b: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 20e: athrow
      // 20f: bipush 0
      // 210: ireturn
   }

   public static boolean wlb(erg var0) {
      int[] var1 = TileEntityBeacon$yv7.b();

      try {
         int var10000 = lxv(var0);
         if (var1 != null) {
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
   public boolean er2(int param1, erg param2) {
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
      // 05: bipush 2
      // 06: aload 3
      // 07: ifnonnull 29
      // 0a: if_icmpne 1c
      // 0d: goto 14
      // 10: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 0
      // 15: goto 64
      // 18: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1b: athrow
      // 1c: iload 1
      // 1d: aload 3
      // 1e: ifnonnull 38
      // 21: bipush 1
      // 22: goto 29
      // 25: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 28: athrow
      // 29: if_icmpeq 34
      // 2c: bipush 1
      // 2d: goto 64
      // 30: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 2
      // 35: invokestatic net/minecraft/tileentity/TileEntityFurnace.wlb (Lerg;)Z
      // 38: aload 3
      // 39: ifnonnull 60
      // 3c: ifne 5f
      // 3f: goto 46
      // 42: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 2
      // 47: invokestatic a0r.zeg (Lerg;)Z
      // 4a: aload 3
      // 4b: ifnonnull 60
      // 4e: goto 55
      // 51: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 54: athrow
      // 55: ifeq 63
      // 58: goto 5f
      // 5b: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 64
      // 63: bipush 0
      // 64: ireturn
   }

   @Override
   public int[] ik0(vt2 param1) {
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
      // 05: getstatic vt2.m3r Lvt2;
      // 08: aload 2
      // 09: ifnonnull 24
      // 0c: if_acmpne 20
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 15: athrow
      // 16: getstatic net/minecraft/tileentity/TileEntityFurnace.mnm [I
      // 19: goto 34
      // 1c: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: getstatic vt2.rf3 Lvt2;
      // 24: if_acmpne 31
      // 27: getstatic net/minecraft/tileentity/TileEntityFurnace.k2v [I
      // 2a: goto 34
      // 2d: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 30: athrow
      // 31: getstatic net/minecraft/tileentity/TileEntityFurnace.u2f [I
      // 34: areturn
   }

   @Override
   public boolean dy9(int var1, erg var2, vt2 var3) {
      return this.er2(var1, var2);
   }

   @Override
   public boolean kfc(int param1, erg param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 4
      // 05: aload 3
      // 06: getstatic vt2.m3r Lvt2;
      // 09: if_acmpne 53
      // 0c: iload 1
      // 0d: aload 4
      // 0f: ifnonnull 54
      // 12: goto 19
      // 15: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 1
      // 1a: if_icmpne 53
      // 1d: goto 24
      // 20: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: invokevirtual erg.gn1 ()Lu7m;
      // 28: astore 5
      // 2a: aload 5
      // 2c: getstatic xbr.lqp Lu7m;
      // 2f: aload 4
      // 31: ifnonnull 4a
      // 34: if_acmpeq 53
      // 37: goto 3e
      // 3a: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 5
      // 40: getstatic xbr.xxz Lu7m;
      // 43: goto 4a
      // 46: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 49: athrow
      // 4a: if_acmpeq 53
      // 4d: bipush 0
      // 4e: ireturn
      // 4f: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 1
      // 54: ireturn
   }

   @Override
   public String q4l() {
      long var1 = a ^ 74918363994322L;
      return b<"e">(16273, 1265527350773388782L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new q7x(var1, this);
   }

   @Override
   public int czu(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: iload 1
      // 05: aload 2
      // 06: ifnonnull 45
      // 09: tableswitch 59 0 3 35 44 49 54
      // 28: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield net/minecraft/tileentity/TileEntityFurnace.swk I
      // 30: ireturn
      // 31: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield net/minecraft/tileentity/TileEntityFurnace.xio I
      // 39: ireturn
      // 3a: aload 0
      // 3b: getfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 3e: ireturn
      // 3f: aload 0
      // 40: getfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // 43: ireturn
      // 44: bipush 0
      // 45: ireturn
   }

   @Override
   public void r8i(int param1, int param2) {
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
      // 05: tableswitch 91 0 3 31 47 63 79
      // 24: aload 0
      // 25: iload 2
      // 26: putfield net/minecraft/tileentity/TileEntityFurnace.swk I
      // 29: aload 3
      // 2a: ifnull 60
      // 2d: goto 34
      // 30: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: iload 2
      // 36: putfield net/minecraft/tileentity/TileEntityFurnace.xio I
      // 39: aload 3
      // 3a: ifnull 60
      // 3d: goto 44
      // 40: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: iload 2
      // 46: putfield net/minecraft/tileentity/TileEntityFurnace.rhk I
      // 49: aload 3
      // 4a: ifnull 60
      // 4d: goto 54
      // 50: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: iload 2
      // 56: putfield net/minecraft/tileentity/TileEntityFurnace.xkj I
      // 59: goto 60
      // 5c: invokestatic net/minecraft/tileentity/TileEntityFurnace.a (Loov;)Loov;
      // 5f: athrow
      // 60: return
   }

   @Override
   public int xa3() {
      return 4;
   }

   @Override
   public void nec() {
      int[] var1 = TileEntityBeacon$yv7.b();
      int var2 = 0;

      while (var2 < this.m4l.length) {
         this.m4l[var2] = null;
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
      long var10000 = c.a(7018971951098143997L, 1685627160074465668L, MethodHandles.lookup().lookupClass()).a(92909122261325L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11479399565626L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = ":òòÎôf\u008c=\u008fc!9»fgG\u0010æËQëë®%]«\u0010T8=ä\u0087\u008b ·uMgÓ½\u0012ôg\u001c}gÚ£M×´.\u0095\tÞÏàP\u0000ð\u00ad\u0086x»ë\u0014 E\u0081`#ZVd\báÇè\u0090ª\u000f>\fU_?Ðý\u0011æ^>|±Þê¸$j û0Ù\n´rô\u0080ë\u0016u$r\u0098\u0002s\u000f7N/WêhÅÅÿ.@NwÅ\u0001\u0010\bó\u0010\u001c\u0093\u0018\u00126<DSH; ¹s\u0010;\u008d<2>Úò#ÙS'¿Þ¥:\u008d\u0010\u009fS\rÏx\u001d\u001dã§\u000b.\u0093Á\bI\u0000\u0018³ê.\u0019Ý.ñTM\u008dÌ\u0095Ù=jeë\tâå¯}\u0099é\u0018\u000b·ôÊdiÈØ\u0090í\u009aXTNßr_k\u001dò½\u008el\u000f\u0018«§½ûÓ<nÜ\u0099oH\u00067\u0006$©+\u0094\n\u000b¯\u0007rº0\u0005{\u009cÓM\u0092îû)ÃºË\u0086ð}\n]î\u001fq(\u0080ålÈÂÉ\u000ek$ê\u0086÷Z?u)L\u0003ö\u0085\"¦âd\r@M\u0010¹ì\u0090\n¯I©\u0019¾$\u009dL*ü\u0088Ë\u0018wôÙê+\u0085ÿµ\u0016Û#\u0084\u0013ÊO\u0002,\ta|»¸eb";
      int var8 = ":òòÎôf\u008c=\u008fc!9»fgG\u0010æËQëë®%]«\u0010T8=ä\u0087\u008b ·uMgÓ½\u0012ôg\u001c}gÚ£M×´.\u0095\tÞÏàP\u0000ð\u00ad\u0086x»ë\u0014 E\u0081`#ZVd\báÇè\u0090ª\u000f>\fU_?Ðý\u0011æ^>|±Þê¸$j û0Ù\n´rô\u0080ë\u0016u$r\u0098\u0002s\u000f7N/WêhÅÅÿ.@NwÅ\u0001\u0010\bó\u0010\u001c\u0093\u0018\u00126<DSH; ¹s\u0010;\u008d<2>Úò#ÙS'¿Þ¥:\u008d\u0010\u009fS\rÏx\u001d\u001dã§\u000b.\u0093Á\bI\u0000\u0018³ê.\u0019Ý.ñTM\u008dÌ\u0095Ù=jeë\tâå¯}\u0099é\u0018\u000b·ôÊdiÈØ\u0090í\u009aXTNßr_k\u001dò½\u008el\u000f\u0018«§½ûÓ<nÜ\u0099oH\u00067\u0006$©+\u0094\n\u000b¯\u0007rº0\u0005{\u009cÓM\u0092îû)ÃºË\u0086ð}\n]î\u001fq(\u0080ålÈÂÉ\u000ek$ê\u0086÷Z?u)L\u0003ö\u0085\"¦âd\r@M\u0010¹ì\u0090\n¯I©\u0019¾$\u009dL*ü\u0088Ë\u0018wôÙê+\u0085ÿµ\u0016Û#\u0084\u0013ÊO\u0002,\ta|»¸eb"
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
                     b = var9;
                     g = new String[16];
                     k2v = new int[]{0};
                     mnm = new int[]{2, 1};
                     u2f = new int[]{1};
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

                  var6 = "\u0082t ª\u0082\u0005[#pÈ\u0093\u0082B|ç¾ÔË\u0093rÃ\u00055\u001e²¨¬p\u0083\u0018\u0097~\u0018aö4+w\u0096¨mÍ\u0085\u0004p!\r\u0003\u0094å6lå¿\u009aû\u008a";
                  var8 = "\u0082t ª\u0082\u0005[#pÈ\u0093\u0082B|ç¾ÔË\u0093rÃ\u00055\u001e²¨¬p\u0083\u0018\u0097~\u0018aö4+w\u0096¨mÍ\u0085\u0004p!\r\u0003\u0094å6lå¿\u009aû\u008a"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32448;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityFurnace", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityFurnace" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
