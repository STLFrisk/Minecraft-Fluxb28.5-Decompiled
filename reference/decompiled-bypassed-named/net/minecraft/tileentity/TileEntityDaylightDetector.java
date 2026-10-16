package net.minecraft.tileentity;

public class TileEntityDaylightDetector extends pyk implements xcy {
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
      // 05: getfield net/minecraft/tileentity/TileEntityDaylightDetector.yh_ Lt9d;
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: ifnull 91
      // 0f: goto 16
      // 12: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/tileentity/TileEntityDaylightDetector.yh_ Lt9d;
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 20: athrow
      // 21: getfield OpaquePredicate.v0f Z
      // 24: aload 1
      // 25: ifnonnull 46
      // 28: ifne 91
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield net/minecraft/tileentity/TileEntityDaylightDetector.yh_ Lt9d;
      // 36: invokevirtual OpaquePredicate.p2b ()J
      // 39: ldc2_w 20
      // 3c: lrem
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: goto 46
      // 42: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 1
      // 47: ifnonnull 75
      // 4a: ifne 91
      // 4d: goto 54
      // 50: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: aload 0
      // 56: invokevirtual net/minecraft/tileentity/TileEntityDaylightDetector.qwl ()Le0x;
      // 59: putfield net/minecraft/tileentity/TileEntityDaylightDetector.j8_ Le0x;
      // 5c: aload 0
      // 5d: getfield net/minecraft/tileentity/TileEntityDaylightDetector.j8_ Le0x;
      // 60: aload 1
      // 61: ifnonnull 83
      // 64: goto 6b
      // 67: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 6a: athrow
      // 6b: instanceof xq5
      // 6e: goto 75
      // 71: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 74: athrow
      // 75: ifeq 91
      // 78: aload 0
      // 79: getfield net/minecraft/tileentity/TileEntityDaylightDetector.j8_ Le0x;
      // 7c: goto 83
      // 7f: invokestatic net/minecraft/tileentity/TileEntityDaylightDetector.a (Loov;)Loov;
      // 82: athrow
      // 83: checkcast xq5
      // 86: aload 0
      // 87: getfield net/minecraft/tileentity/TileEntityDaylightDetector.yh_ Lt9d;
      // 8a: aload 0
      // 8b: getfield net/minecraft/tileentity/TileEntityDaylightDetector.al2 Lmew;
      // 8e: invokevirtual xq5.tde (Lt9d;Lmew;)V
      // 91: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
