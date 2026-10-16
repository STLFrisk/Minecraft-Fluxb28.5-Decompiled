package net.minecraft.tileentity;

public abstract class TileEntityLockable extends pyk implements _83, fl3 {
   @Override
   public void agl(bdo var1) {
      super.agl(var1);
      this.ks2 = axk.yq_(var1);
   }

   @Override
   public void m2a(bdo param1) {
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
      // 06: invokespecial pyk.m2a (Lbdo;)V
      // 09: aload 0
      // 0a: getfield net/minecraft/tileentity/TileEntityLockable.ks2 Laxk;
      // 0d: aload 2
      // 0e: ifnonnull 26
      // 11: ifnull 2a
      // 14: goto 1b
      // 17: invokestatic net/minecraft/tileentity/TileEntityLockable.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield net/minecraft/tileentity/TileEntityLockable.ks2 Laxk;
      // 1f: goto 26
      // 22: invokestatic net/minecraft/tileentity/TileEntityLockable.c (Loov;)Loov;
      // 25: athrow
      // 26: aload 1
      // 27: invokevirtual axk.fze (Lbdo;)V
      // 2a: return
   }

   @Override
   public boolean plq() {
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
      // 05: getfield net/minecraft/tileentity/TileEntityLockable.ks2 Laxk;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityLockable.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityLockable.ks2 Laxk;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityLockable.c (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual axk.vol ()Z
      // 24: aload 1
      // 25: ifnonnull 33
      // 28: ifne 36
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityLockable.c (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   @Override
   public axk q2q() {
      return this.ks2;
   }

   @Override
   public void w8c(axk var1) {
      this.ks2 = var1;
   }

   @Override
   public ekw xyw() {
      try {
         if (this.qrh()) {
            return new tao(this.noc());
         }
      } catch (oov var1) {
         throw c(var1);
      }

      return new hsu(this.noc(), new Object[0]);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
