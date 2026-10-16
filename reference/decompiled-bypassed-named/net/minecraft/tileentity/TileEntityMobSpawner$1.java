package net.minecraft.tileentity;

public class TileEntityMobSpawner$1 extends aih {
   public final TileEntityMobSpawner awh;

   public TileEntityMobSpawner$1(TileEntityMobSpawner var1) {
      this.awh = var1;
   }

   @Override
   public void jn0(int var1) {
      this.awh.yh_.dfj(this.awh.al2, ox_.jvm, var1, 0);
   }

   @Override
   public OpaquePredicate c4e() {
      return this.awh.yh_;
   }

   @Override
   public mew fwc() {
      return this.awh.al2;
   }

   @Override
   public void yv6(aih$vir param1) {
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
      // 05: aload 1
      // 06: invokespecial aih.yv6 (Laih$vir;)V
      // 09: aload 0
      // 0a: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner$1.c4e ()Lt9d;
      // 0d: aload 2
      // 0e: ifnonnull 26
      // 11: ifnull 30
      // 14: goto 1b
      // 17: invokestatic net/minecraft/tileentity/TileEntityMobSpawner$1.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner$1.c4e ()Lt9d;
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityMobSpawner$1.b (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield net/minecraft/tileentity/TileEntityMobSpawner$1.awh Lnet/minecraft/tileentity/TileEntityMobSpawner;
      // 2a: getfield net/minecraft/tileentity/TileEntityMobSpawner.al2 Lmew;
      // 2d: invokevirtual OpaquePredicate.nfo (Lmew;)V
      // 30: return
   }

   private static oov b(oov var0) {
      return var0;
   }
}
