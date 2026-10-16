import net.minecraft.tileentity.TileEntityBeacon;

public class yk4 extends rw8 {
   public yk4() {
      super(p3y.mg6, _mi.zfs);
      this.q6h(3.0F);
      this.i3l(uja.kdm);
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityBeacon();
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
      // 14: invokestatic yk4.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic yk4.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityBeacon
      // 2a: iload 9
      // 2c: ifne 53
      // 2f: ifeq 52
      // 32: goto 39
      // 35: invokestatic yk4.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: aload 10
      // 3d: checkcast net/minecraft/tileentity/TileEntityBeacon
      // 40: invokevirtual ha9.a_o (Lrsi;)V
      // 43: aload 4
      // 45: getstatic l9p.rhz L_ss;
      // 48: invokevirtual ha9.aex (L_ss;)V
      // 4b: goto 52
      // 4e: invokestatic yk4.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public int kfj() {
      return 3;
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
      // 00: invokestatic OpaquePredicate.b ()I
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
      // 1a: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 1d: astore 7
      // 1f: aload 7
      // 21: iload 6
      // 23: ifeq 3c
      // 26: instanceof net/minecraft/tileentity/TileEntityBeacon
      // 29: ifeq 47
      // 2c: goto 33
      // 2f: invokestatic yk4.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 7
      // 35: goto 3c
      // 38: invokestatic yk4.a (Loov;)Loov;
      // 3b: athrow
      // 3c: checkcast net/minecraft/tileentity/TileEntityBeacon
      // 3f: aload 5
      // 41: invokevirtual erg.zow ()Ljava/lang/String;
      // 44: invokevirtual net/minecraft/tileentity/TileEntityBeacon.p4t (Ljava/lang/String;)V
      // 47: return
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 6
      // 0c: aload 6
      // 0e: iload 5
      // 10: ifne 29
      // 13: instanceof net/minecraft/tileentity/TileEntityBeacon
      // 16: ifeq 37
      // 19: goto 20
      // 1c: invokestatic yk4.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 6
      // 22: goto 29
      // 25: invokestatic yk4.a (Loov;)Loov;
      // 28: athrow
      // 29: checkcast net/minecraft/tileentity/TileEntityBeacon
      // 2c: invokevirtual net/minecraft/tileentity/TileEntityBeacon.l8u ()V
      // 2f: aload 1
      // 30: aload 2
      // 31: aload 0
      // 32: bipush 1
      // 33: bipush 0
      // 34: invokevirtual OpaquePredicate.dfj (Lmew;Le0x;II)V
      // 37: return
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   public static void taa(OpaquePredicate var0, mew var1) {
      crb.wki.submit(new yk4$1(var0, var1));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
