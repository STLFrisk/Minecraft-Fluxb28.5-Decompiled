import java.util.Random;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

public class asg extends rw8 {
   public asg() {
      super(p3y.zs8, _mi.v0s);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.opa(0);
      this.i3l(uja.qqf);
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public void kyo(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: aload 3
      // 004: aload 4
      // 006: invokespecial rw8.kyo (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 009: invokestatic t9d.c ()I
      // 00c: bipush -2
      // 00e: istore 6
      // 010: istore 5
      // 012: iload 6
      // 014: bipush 2
      // 015: if_icmpgt 156
      // 018: bipush -2
      // 01a: istore 7
      // 01c: iload 7
      // 01e: bipush 2
      // 01f: if_icmpgt 14e
      // 022: iload 6
      // 024: iload 5
      // 026: ifne 076
      // 029: bipush -2
      // 02b: iload 5
      // 02d: ifne 015
      // 030: goto 037
      // 033: invokestatic asg.a (Loov;)Loov;
      // 036: athrow
      // 037: if_icmple 06f
      // 03a: iload 6
      // 03c: iload 5
      // 03e: ifne 076
      // 041: goto 048
      // 044: invokestatic asg.a (Loov;)Loov;
      // 047: athrow
      // 048: bipush 2
      // 049: if_icmpge 06f
      // 04c: goto 053
      // 04f: invokestatic asg.a (Loov;)Loov;
      // 052: athrow
      // 053: iload 7
      // 055: iload 5
      // 057: ifne 076
      // 05a: goto 061
      // 05d: invokestatic asg.a (Loov;)Loov;
      // 060: athrow
      // 061: bipush -1
      // 062: if_icmpne 06f
      // 065: goto 06c
      // 068: invokestatic asg.a (Loov;)Loov;
      // 06b: athrow
      // 06c: bipush 2
      // 06d: istore 7
      // 06f: aload 4
      // 071: bipush 16
      // 073: invokevirtual java/util/Random.nextInt (I)I
      // 076: iload 5
      // 078: ifne 086
      // 07b: ifne 146
      // 07e: goto 085
      // 081: invokestatic asg.a (Loov;)Loov;
      // 084: athrow
      // 085: bipush 0
      // 086: istore 8
      // 088: iload 8
      // 08a: bipush 1
      // 08b: if_icmpgt 146
      // 08e: aload 2
      // 08f: iload 6
      // 091: iload 8
      // 093: iload 7
      // 095: invokevirtual mew.ec4 (III)Lmew;
      // 098: astore 9
      // 09a: iload 5
      // 09c: ifne 149
      // 09f: iload 5
      // 0a1: ifne 141
      // 0a4: goto 0ab
      // 0a7: invokestatic asg.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 1
      // 0ac: aload 9
      // 0ae: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b1: invokeinterface zfz.r_y ()Le0x; 1
      // 0b6: getstatic ox_.kzr Le0x;
      // 0b9: if_acmpne 13e
      // 0bc: goto 0c3
      // 0bf: invokestatic asg.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: iload 5
      // 0c6: ifne 0f2
      // 0c9: goto 0d0
      // 0cc: invokestatic asg.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 2
      // 0d1: iload 6
      // 0d3: bipush 2
      // 0d4: idiv
      // 0d5: bipush 0
      // 0d6: iload 7
      // 0d8: bipush 2
      // 0d9: idiv
      // 0da: invokevirtual mew.ec4 (III)Lmew;
      // 0dd: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 0e0: ifne 0f1
      // 0e3: goto 0ea
      // 0e6: invokestatic asg.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: goto 146
      // 0ed: invokestatic asg.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: getstatic w_0.ygx Lw_0;
      // 0f5: aload 2
      // 0f6: invokevirtual mew.getX ()I
      // 0f9: i2d
      // 0fa: ldc2_w 0.5
      // 0fd: dadd
      // 0fe: aload 2
      // 0ff: invokevirtual mew.getY ()I
      // 102: i2d
      // 103: ldc2_w 2.0
      // 106: dadd
      // 107: aload 2
      // 108: invokevirtual mew.getZ ()I
      // 10b: i2d
      // 10c: ldc2_w 0.5
      // 10f: dadd
      // 110: iload 6
      // 112: i2f
      // 113: aload 4
      // 115: invokevirtual java/util/Random.nextFloat ()F
      // 118: fadd
      // 119: f2d
      // 11a: ldc2_w 0.5
      // 11d: dsub
      // 11e: iload 8
      // 120: i2f
      // 121: aload 4
      // 123: invokevirtual java/util/Random.nextFloat ()F
      // 126: fsub
      // 127: fconst_1
      // 128: fsub
      // 129: f2d
      // 12a: iload 7
      // 12c: i2f
      // 12d: aload 4
      // 12f: invokevirtual java/util/Random.nextFloat ()F
      // 132: fadd
      // 133: f2d
      // 134: ldc2_w 0.5
      // 137: dsub
      // 138: bipush 0
      // 139: newarray 10
      // 13b: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 13e: iinc 8 1
      // 141: iload 5
      // 143: ifeq 088
      // 146: iinc 7 1
      // 149: iload 5
      // 14b: ifeq 01c
      // 14e: iinc 6 1
      // 151: iload 5
      // 153: ifeq 012
      // 156: return
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityEnchantmentTable();
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: iload 9
      // 08: ifne 1f
      // 0b: getfield t9d.v0f Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic asg.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic asg.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityEnchantmentTable
      // 2a: iload 9
      // 2c: ifne 4b
      // 2f: ifeq 4a
      // 32: goto 39
      // 35: invokestatic asg.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: aload 10
      // 3d: checkcast net/minecraft/tileentity/TileEntityEnchantmentTable
      // 40: invokevirtual ha9.xz_ (L_83;)V
      // 43: goto 4a
      // 46: invokestatic asg.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 1
      // 4b: ireturn
   }

   @Override
   public void qh0(t9d param1, mew param2, zfz param3, g_3 param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: aload 4
      // 0b: aload 5
      // 0d: invokespecial rw8.qh0 (Lt9d;Lmew;Lzfz;Lg_3;Lerg;)V
      // 10: aload 5
      // 12: invokevirtual erg.x4w ()Z
      // 15: ifeq 47
      // 18: aload 1
      // 19: aload 2
      // 1a: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 1d: astore 7
      // 1f: aload 7
      // 21: iload 6
      // 23: ifne 3c
      // 26: instanceof net/minecraft/tileentity/TileEntityEnchantmentTable
      // 29: ifeq 47
      // 2c: goto 33
      // 2f: invokestatic asg.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 7
      // 35: goto 3c
      // 38: invokestatic asg.a (Loov;)Loov;
      // 3b: athrow
      // 3c: checkcast net/minecraft/tileentity/TileEntityEnchantmentTable
      // 3f: aload 5
      // 41: invokevirtual erg.zow ()Ljava/lang/String;
      // 44: invokevirtual net/minecraft/tileentity/TileEntityEnchantmentTable.nai (Ljava/lang/String;)V
      // 47: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
