package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class StructureStrongholdPieces$Stairs2 extends StructureStrongholdPieces$Stairs {
   public StructureStrongholdPieces$rlz i5u;
   public StructureStrongholdPieces$PortalRoom oo1;
   public List z8j = Lists.newArrayList();

   public StructureStrongholdPieces$Stairs2() {
   }

   public StructureStrongholdPieces$Stairs2(int var1, Random var2, int var3, int var4) {
      super(0, var2, var3, var4);
   }

   @Override
   public mew xqt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 25
      // 09: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.oo1 Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.oo1 Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom;
      // 1a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xqt ()Lmew;
      // 1d: goto 28
      // 20: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2.b (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs.xqt ()Lmew;
      // 28: areturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
