import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityFurnace;

public class ovv extends rw8 {
   public static final qx_ lnz;
   private final boolean xcq;
   private static boolean ufj;

   public ovv(boolean var1) {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(lnz, vt2.z9q));
      this.xcq = var1;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.o16);
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      this.gdp(var1, var2, var3);
   }

   private void gdp(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: iload 4
      // 008: ifne 020
      // 00b: getfield OpaquePredicate.v0f Z
      // 00e: ifne 1ab
      // 011: goto 018
      // 014: invokestatic ovv.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: goto 020
      // 01c: invokestatic ovv.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 2
      // 021: invokevirtual mew.idu ()Lmew;
      // 024: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 027: invokeinterface zfz.r_y ()Le0x; 1
      // 02c: astore 5
      // 02e: aload 1
      // 02f: aload 2
      // 030: invokevirtual mew.z6x ()Lmew;
      // 033: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 036: invokeinterface zfz.r_y ()Le0x; 1
      // 03b: astore 6
      // 03d: aload 1
      // 03e: aload 2
      // 03f: invokevirtual mew.y8e ()Lmew;
      // 042: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 045: invokeinterface zfz.r_y ()Le0x; 1
      // 04a: astore 7
      // 04c: aload 1
      // 04d: aload 2
      // 04e: invokevirtual mew.o_8 ()Lmew;
      // 051: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 054: invokeinterface zfz.r_y ()Le0x; 1
      // 059: astore 8
      // 05b: aload 3
      // 05c: getstatic ovv.lnz Lqx_;
      // 05f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 064: checkcast vt2
      // 067: astore 9
      // 069: aload 9
      // 06b: getstatic vt2.z9q Lvt2;
      // 06e: iload 4
      // 070: ifne 0bd
      // 073: if_acmpne 0b1
      // 076: goto 07d
      // 079: invokestatic ovv.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 5
      // 07f: invokevirtual e0x.z4c ()Z
      // 082: iload 4
      // 084: ifne 0a4
      // 087: goto 08e
      // 08a: invokestatic ovv.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ifeq 0b1
      // 091: goto 098
      // 094: invokestatic ovv.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 6
      // 09a: invokevirtual e0x.z4c ()Z
      // 09d: goto 0a4
      // 0a0: invokestatic ovv.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: ifne 0b1
      // 0a7: getstatic vt2.mxp Lvt2;
      // 0aa: astore 9
      // 0ac: iload 4
      // 0ae: ifeq 199
      // 0b1: aload 9
      // 0b3: getstatic vt2.mxp Lvt2;
      // 0b6: goto 0bd
      // 0b9: invokestatic ovv.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: iload 4
      // 0bf: ifne 10c
      // 0c2: if_acmpne 100
      // 0c5: goto 0cc
      // 0c8: invokestatic ovv.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 6
      // 0ce: invokevirtual e0x.z4c ()Z
      // 0d1: iload 4
      // 0d3: ifne 0f3
      // 0d6: goto 0dd
      // 0d9: invokestatic ovv.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: ifeq 100
      // 0e0: goto 0e7
      // 0e3: invokestatic ovv.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 5
      // 0e9: invokevirtual e0x.z4c ()Z
      // 0ec: goto 0f3
      // 0ef: invokestatic ovv.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: ifne 100
      // 0f6: getstatic vt2.z9q Lvt2;
      // 0f9: astore 9
      // 0fb: iload 4
      // 0fd: ifeq 199
      // 100: aload 9
      // 102: getstatic vt2.te4 Lvt2;
      // 105: goto 10c
      // 108: invokestatic ovv.a (Loov;)Loov;
      // 10b: athrow
      // 10c: iload 4
      // 10e: ifne 15b
      // 111: if_acmpne 14f
      // 114: goto 11b
      // 117: invokestatic ovv.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 7
      // 11d: invokevirtual e0x.z4c ()Z
      // 120: iload 4
      // 122: ifne 142
      // 125: goto 12c
      // 128: invokestatic ovv.a (Loov;)Loov;
      // 12b: athrow
      // 12c: ifeq 14f
      // 12f: goto 136
      // 132: invokestatic ovv.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 8
      // 138: invokevirtual e0x.z4c ()Z
      // 13b: goto 142
      // 13e: invokestatic ovv.a (Loov;)Loov;
      // 141: athrow
      // 142: ifne 14f
      // 145: getstatic vt2.zk4 Lvt2;
      // 148: astore 9
      // 14a: iload 4
      // 14c: ifeq 199
      // 14f: aload 9
      // 151: getstatic vt2.zk4 Lvt2;
      // 154: goto 15b
      // 157: invokestatic ovv.a (Loov;)Loov;
      // 15a: athrow
      // 15b: if_acmpne 199
      // 15e: aload 8
      // 160: invokevirtual e0x.z4c ()Z
      // 163: iload 4
      // 165: ifne 1aa
      // 168: goto 16f
      // 16b: invokestatic ovv.a (Loov;)Loov;
      // 16e: athrow
      // 16f: ifeq 199
      // 172: goto 179
      // 175: invokestatic ovv.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 7
      // 17b: invokevirtual e0x.z4c ()Z
      // 17e: iload 4
      // 180: ifne 1aa
      // 183: goto 18a
      // 186: invokestatic ovv.a (Loov;)Loov;
      // 189: athrow
      // 18a: ifne 199
      // 18d: goto 194
      // 190: invokestatic ovv.a (Loov;)Loov;
      // 193: athrow
      // 194: getstatic vt2.te4 Lvt2;
      // 197: astore 9
      // 199: aload 1
      // 19a: aload 2
      // 19b: aload 3
      // 19c: getstatic ovv.lnz Lqx_;
      // 19f: aload 9
      // 1a1: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1a6: bipush 2
      // 1a7: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1aa: pop
      // 1ab: return
   }

   @Override
   public void kyo(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: aload 0
      // 006: getfield ovv.xcq Z
      // 009: ifeq 17b
      // 00c: aload 3
      // 00d: getstatic ovv.lnz Lqx_;
      // 010: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 015: checkcast vt2
      // 018: astore 6
      // 01a: aload 2
      // 01b: invokevirtual mew.getX ()I
      // 01e: i2d
      // 01f: ldc2_w 0.5
      // 022: dadd
      // 023: dstore 7
      // 025: aload 2
      // 026: invokevirtual mew.getY ()I
      // 029: i2d
      // 02a: aload 4
      // 02c: invokevirtual java/util/Random.nextDouble ()D
      // 02f: ldc2_w 6.0
      // 032: dmul
      // 033: ldc2_w 16.0
      // 036: ddiv
      // 037: dadd
      // 038: dstore 9
      // 03a: aload 2
      // 03b: invokevirtual mew.getZ ()I
      // 03e: i2d
      // 03f: ldc2_w 0.5
      // 042: dadd
      // 043: dstore 11
      // 045: ldc2_w 0.52
      // 048: dstore 13
      // 04a: aload 4
      // 04c: invokevirtual java/util/Random.nextDouble ()D
      // 04f: ldc2_w 0.6
      // 052: dmul
      // 053: ldc2_w 0.3
      // 056: dsub
      // 057: dstore 15
      // 059: iload 5
      // 05b: ifeq 0c1
      // 05e: getstatic ovv$1.ogb [I
      // 061: aload 6
      // 063: invokevirtual vt2.ordinal ()I
      // 066: iaload
      // 067: tableswitch 276 1 4 33 95 157 219
      // 084: invokestatic ovv.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 1
      // 089: getstatic w_0.bac Lw_0;
      // 08c: dload 7
      // 08e: dload 13
      // 090: dsub
      // 091: dload 9
      // 093: dload 11
      // 095: dload 15
      // 097: dadd
      // 098: dconst_0
      // 099: dconst_0
      // 09a: dconst_0
      // 09b: bipush 0
      // 09c: newarray 10
      // 09e: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 0a1: aload 1
      // 0a2: getstatic w_0.jnp Lw_0;
      // 0a5: dload 7
      // 0a7: dload 13
      // 0a9: dsub
      // 0aa: dload 9
      // 0ac: dload 11
      // 0ae: dload 15
      // 0b0: dadd
      // 0b1: dconst_0
      // 0b2: dconst_0
      // 0b3: dconst_0
      // 0b4: bipush 0
      // 0b5: newarray 10
      // 0b7: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 0ba: goto 0c1
      // 0bd: invokestatic ovv.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iload 5
      // 0c3: ifne 17b
      // 0c6: aload 1
      // 0c7: getstatic w_0.bac Lw_0;
      // 0ca: dload 7
      // 0cc: dload 13
      // 0ce: dadd
      // 0cf: dload 9
      // 0d1: dload 11
      // 0d3: dload 15
      // 0d5: dadd
      // 0d6: dconst_0
      // 0d7: dconst_0
      // 0d8: dconst_0
      // 0d9: bipush 0
      // 0da: newarray 10
      // 0dc: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 0df: aload 1
      // 0e0: getstatic w_0.jnp Lw_0;
      // 0e3: dload 7
      // 0e5: dload 13
      // 0e7: dadd
      // 0e8: dload 9
      // 0ea: dload 11
      // 0ec: dload 15
      // 0ee: dadd
      // 0ef: dconst_0
      // 0f0: dconst_0
      // 0f1: dconst_0
      // 0f2: bipush 0
      // 0f3: newarray 10
      // 0f5: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 0f8: iload 5
      // 0fa: ifne 17b
      // 0fd: goto 104
      // 100: invokestatic ovv.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 1
      // 105: getstatic w_0.bac Lw_0;
      // 108: dload 7
      // 10a: dload 15
      // 10c: dadd
      // 10d: dload 9
      // 10f: dload 11
      // 111: dload 13
      // 113: dsub
      // 114: dconst_0
      // 115: dconst_0
      // 116: dconst_0
      // 117: bipush 0
      // 118: newarray 10
      // 11a: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 11d: aload 1
      // 11e: getstatic w_0.jnp Lw_0;
      // 121: dload 7
      // 123: dload 15
      // 125: dadd
      // 126: dload 9
      // 128: dload 11
      // 12a: dload 13
      // 12c: dsub
      // 12d: dconst_0
      // 12e: dconst_0
      // 12f: dconst_0
      // 130: bipush 0
      // 131: newarray 10
      // 133: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 136: iload 5
      // 138: ifne 17b
      // 13b: goto 142
      // 13e: invokestatic ovv.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 1
      // 143: getstatic w_0.bac Lw_0;
      // 146: dload 7
      // 148: dload 15
      // 14a: dadd
      // 14b: dload 9
      // 14d: dload 11
      // 14f: dload 13
      // 151: dadd
      // 152: dconst_0
      // 153: dconst_0
      // 154: dconst_0
      // 155: bipush 0
      // 156: newarray 10
      // 158: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 15b: aload 1
      // 15c: getstatic w_0.jnp Lw_0;
      // 15f: dload 7
      // 161: dload 15
      // 163: dadd
      // 164: dload 9
      // 166: dload 11
      // 168: dload 13
      // 16a: dadd
      // 16b: dconst_0
      // 16c: dconst_0
      // 16d: dconst_0
      // 16e: bipush 0
      // 16f: newarray 10
      // 171: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 174: goto 17b
      // 177: invokestatic ovv.a (Loov;)Loov;
      // 17a: athrow
      // 17b: return
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: iload 9
      // 08: ifne 1f
      // 0b: getfield OpaquePredicate.v0f Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic ovv.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic ovv.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityFurnace
      // 2a: iload 9
      // 2c: ifne 53
      // 2f: ifeq 52
      // 32: goto 39
      // 35: invokestatic ovv.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: aload 10
      // 3d: checkcast net/minecraft/tileentity/TileEntityFurnace
      // 40: invokevirtual ha9.a_o (Lrsi;)V
      // 43: aload 4
      // 45: getstatic l9p.yhd L_ss;
      // 48: invokevirtual ha9.aex (L_ss;)V
      // 4b: goto 52
      // 4e: invokestatic ovv.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
   }

   public static void hl4(boolean param0, OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 05: astore 4
      // 07: invokestatic OpaquePredicate.c ()I
      // 0a: aload 1
      // 0b: aload 2
      // 0c: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 0f: astore 5
      // 11: bipush 1
      // 12: putstatic ovv.ufj Z
      // 15: istore 3
      // 16: iload 0
      // 17: iload 3
      // 18: ifne b2
      // 1b: ifeq 6e
      // 1e: goto 25
      // 21: invokestatic ovv.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: getstatic ox_.mqy Le0x;
      // 2a: invokevirtual e0x.l4i ()Lzfz;
      // 2d: getstatic ovv.lnz Lqx_;
      // 30: aload 4
      // 32: getstatic ovv.lnz Lqx_;
      // 35: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 3a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3f: bipush 3
      // 40: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 43: pop
      // 44: aload 1
      // 45: aload 2
      // 46: getstatic ox_.mqy Le0x;
      // 49: invokevirtual e0x.l4i ()Lzfz;
      // 4c: getstatic ovv.lnz Lqx_;
      // 4f: aload 4
      // 51: getstatic ovv.lnz Lqx_;
      // 54: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 59: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 5e: bipush 3
      // 5f: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 62: pop
      // 63: iload 3
      // 64: ifeq b3
      // 67: goto 6e
      // 6a: invokestatic ovv.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: aload 2
      // 70: getstatic ox_.o16 Le0x;
      // 73: invokevirtual e0x.l4i ()Lzfz;
      // 76: getstatic ovv.lnz Lqx_;
      // 79: aload 4
      // 7b: getstatic ovv.lnz Lqx_;
      // 7e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 83: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 88: bipush 3
      // 89: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 8c: pop
      // 8d: aload 1
      // 8e: aload 2
      // 8f: getstatic ox_.o16 Le0x;
      // 92: invokevirtual e0x.l4i ()Lzfz;
      // 95: getstatic ovv.lnz Lqx_;
      // 98: aload 4
      // 9a: getstatic ovv.lnz Lqx_;
      // 9d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // a2: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // a7: bipush 3
      // a8: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // ab: goto b2
      // ae: invokestatic ovv.a (Loov;)Loov;
      // b1: athrow
      // b2: pop
      // b3: bipush 0
      // b4: putstatic ovv.ufj Z
      // b7: aload 5
      // b9: iload 3
      // ba: ifne c9
      // bd: ifnull d3
      // c0: goto c7
      // c3: invokestatic ovv.a (Loov;)Loov;
      // c6: athrow
      // c7: aload 5
      // c9: invokevirtual pyk.o26 ()V
      // cc: aload 1
      // cd: aload 2
      // ce: aload 5
      // d0: invokevirtual OpaquePredicate.a_h (Lmew;Lpyk;)V
      // d3: return
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityFurnace();
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(lnz, var8.u0f().b4b());
   }

   @Override
   public void qh0(OpaquePredicate param1, mew param2, zfz param3, Entity param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 1
      // 06: aload 2
      // 07: iload 6
      // 09: ifne 3a
      // 0c: aload 3
      // 0d: getstatic ovv.lnz Lqx_;
      // 10: aload 4
      // 12: invokevirtual Entity.u0f ()Lvt2;
      // 15: invokevirtual vt2.b4b ()Lvt2;
      // 18: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1d: bipush 2
      // 1e: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 21: pop
      // 22: aload 5
      // 24: invokevirtual erg.x4w ()Z
      // 27: ifeq 67
      // 2a: goto 31
      // 2d: invokestatic ovv.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: aload 2
      // 33: goto 3a
      // 36: invokestatic ovv.a (Loov;)Loov;
      // 39: athrow
      // 3a: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 3d: astore 7
      // 3f: aload 7
      // 41: iload 6
      // 43: ifne 5c
      // 46: instanceof net/minecraft/tileentity/TileEntityFurnace
      // 49: ifeq 67
      // 4c: goto 53
      // 4f: invokestatic ovv.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 7
      // 55: goto 5c
      // 58: invokestatic ovv.a (Loov;)Loov;
      // 5b: athrow
      // 5c: checkcast net/minecraft/tileentity/TileEntityFurnace
      // 5f: aload 5
      // 61: invokevirtual erg.zow ()Ljava/lang/String;
      // 64: invokevirtual net/minecraft/tileentity/TileEntityFurnace.zwx (Ljava/lang/String;)V
      // 67: return
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: getstatic ovv.ufj Z
      // 08: ifne 3d
      // 0b: aload 1
      // 0c: aload 2
      // 0d: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 10: astore 5
      // 12: iload 4
      // 14: ifeq 44
      // 17: aload 5
      // 19: instanceof net/minecraft/tileentity/TileEntityFurnace
      // 1c: ifeq 3d
      // 1f: goto 26
      // 22: invokestatic ovv.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 1
      // 27: aload 2
      // 28: aload 5
      // 2a: checkcast net/minecraft/tileentity/TileEntityFurnace
      // 2d: invokestatic py1.hkj (Lt9d;Lmew;Lrsi;)V
      // 30: aload 1
      // 31: aload 2
      // 32: aload 0
      // 33: invokevirtual OpaquePredicate.lw8 (Lmew;Le0x;)V
      // 36: goto 3d
      // 39: invokestatic ovv.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 1
      // 3f: aload 2
      // 40: aload 3
      // 41: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 44: return
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(OpaquePredicate var1, mew var2) {
      return _jc.nuj(var1.getTileEntity(var2));
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return u7m.gfm(ox_.o16);
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public zfz v1x(zfz var1) {
      return this.l4i().zvi(lnz, vt2.mxp);
   }

   @Override
   public zfz kig(int param1) {
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
      // 05: invokestatic vt2.jw6 (I)Lvt2;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 28
      // 0e: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 11: getstatic vt2$y0s.abn Lvt2$y0s;
      // 14: if_acmpne 29
      // 17: goto 1e
      // 1a: invokestatic ovv.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic vt2.z9q Lvt2;
      // 21: goto 28
      // 24: invokestatic ovv.a (Loov;)Loov;
      // 27: athrow
      // 28: astore 3
      // 29: aload 0
      // 2a: invokevirtual ovv.l4i ()Lzfz;
      // 2d: getstatic ovv.lnz Lqx_;
      // 30: aload 3
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: areturn
   }

   @Override
   public int hvp(zfz var1) {
      return ((vt2)var1.dil(lnz)).c3s();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{lnz});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3225013670624744058L, 7810584377927035988L, MethodHandles.lookup().lookupClass()).a(235218019776985L);
      // $VF: monitorexit
      long var4 = var10000 ^ 102715960626447L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("ó¶\u001eÀ\u0089F\u0093½".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      lnz = qx_.q0o(var0, vt2$unz.fzl);
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
}
