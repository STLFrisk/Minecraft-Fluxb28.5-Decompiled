import java.util.Random;
import net.minecraft.tileentity.TileEntitySign;

public class m54 extends rw8 {
   public m54() {
      super(p3y.fdu);
      float var1 = 0.25F;
      float var2 = 1.0F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var2, 0.5F + var1);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public nh4 j54(OpaquePredicate var1, mew var2) {
      this.c7i(var1, var2);
      return super.j54(var1, var2);
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      return true;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean jdk() {
      return true;
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntitySign();
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.oww;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.oww;
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
      // 14: invokestatic m54.b (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic m54.b (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntitySign
      // 2a: iload 9
      // 2c: ifne 4a
      // 2f: ifeq 4d
      // 32: goto 39
      // 35: invokestatic m54.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 10
      // 3b: checkcast net/minecraft/tileentity/TileEntitySign
      // 3e: aload 4
      // 40: invokevirtual net/minecraft/tileentity/TileEntitySign.krq (Lha9;)Z
      // 43: goto 4a
      // 46: invokestatic m54.b (Loov;)Loov;
      // 49: athrow
      // 4a: goto 4e
      // 4d: bipush 0
      // 4e: ireturn
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual m54.vpo (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifne 37
      // 11: goto 18
      // 14: invokestatic m54.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokespecial rw8.ctq (Lt9d;Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic m54.b (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifeq 34
      // 29: ifeq 37
      // 2c: goto 33
      // 2f: invokestatic m54.b (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
