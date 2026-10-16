package net.minecraft.world.gen.structure;

public final class StructureStrongholdPieces$2 extends StructureStrongholdPieces$rlz {
   public StructureStrongholdPieces$2(Class var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean mix(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$rlz.mix (I)Z
      // 09: aload 2
      // 0a: ifnull 18
      // 0d: ifeq 32
      // 10: goto 17
      // 13: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$2.a (Loov;)Loov;
      // 16: athrow
      // 17: iload 1
      // 18: aload 2
      // 19: ifnull 2f
      // 1c: bipush 5
      // 1d: if_icmple 32
      // 20: goto 27
      // 23: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$2.a (Loov;)Loov;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$2.a (Loov;)Loov;
      // 2e: athrow
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
