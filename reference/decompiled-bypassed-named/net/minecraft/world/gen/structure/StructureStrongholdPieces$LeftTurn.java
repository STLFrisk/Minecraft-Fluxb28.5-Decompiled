package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureStrongholdPieces$LeftTurn extends StructureStrongholdPieces$Stronghold {
   public StructureStrongholdPieces$LeftTurn() {
   }

   public StructureStrongholdPieces$LeftTurn(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      this.yqm = var3;
   }

   @Override
   public void vxr(xi1 param1, List param2, Random param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 4
      // 08: ifnull 64
      // 0b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.p7m Lvt2;
      // 0e: getstatic vt2.z9q Lvt2;
      // 11: if_acmpeq 51
      // 14: goto 1b
      // 17: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 4
      // 1e: ifnull 64
      // 21: goto 28
      // 24: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 27: athrow
      // 28: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.p7m Lvt2;
      // 2b: getstatic vt2.zk4 Lvt2;
      // 2e: if_acmpeq 51
      // 31: goto 38
      // 34: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 3d: aload 2
      // 3e: aload 3
      // 3f: bipush 1
      // 40: bipush 1
      // 41: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.ywi (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 44: pop
      // 45: aload 4
      // 47: ifnonnull 65
      // 4a: goto 51
      // 4d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: aload 1
      // 53: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 56: aload 2
      // 57: aload 3
      // 58: bipush 1
      // 59: bipush 1
      // 5a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.go3 (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 5d: goto 64
      // 60: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 63: athrow
      // 64: pop
      // 65: return
   }

   public static StructureStrongholdPieces$LeftTurn ei8(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: iload 3
      // 02: iload 4
      // 04: bipush -1
      // 05: bipush -1
      // 06: bipush 0
      // 07: bipush 5
      // 08: bipush 5
      // 09: bipush 5
      // 0a: aload 5
      // 0c: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 0f: astore 7
      // 11: aload 7
      // 13: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.jty (Lyve;)Z
      // 16: ifeq 3e
      // 19: aload 0
      // 1a: aload 7
      // 1c: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 1f: ifnonnull 3e
      // 22: goto 29
      // 25: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 28: athrow
      // 29: new net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn
      // 2c: dup
      // 2d: iload 6
      // 2f: aload 1
      // 30: aload 7
      // 32: aload 5
      // 34: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 37: goto 3f
      // 3a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aconst_null
      // 3f: areturn
   }

   @Override
   public boolean d__(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 3
      // 08: aload 4
      // 0a: ifnull 23
      // 0d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.knc (Lt9d;Lyve;)Z
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 3
      // 23: bipush 0
      // 24: bipush 0
      // 25: bipush 0
      // 26: bipush 4
      // 27: bipush 4
      // 28: bipush 4
      // 29: bipush 1
      // 2a: aload 2
      // 2b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 2e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: aload 0
      // 36: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 39: bipush 1
      // 3a: bipush 1
      // 3b: bipush 0
      // 3c: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 3f: aload 0
      // 40: aload 4
      // 42: ifnull 9f
      // 45: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.p7m Lvt2;
      // 48: getstatic vt2.z9q Lvt2;
      // 4b: if_acmpeq 97
      // 4e: goto 55
      // 51: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: aload 4
      // 58: ifnull 9f
      // 5b: goto 62
      // 5e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 61: athrow
      // 62: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.p7m Lvt2;
      // 65: getstatic vt2.zk4 Lvt2;
      // 68: if_acmpeq 97
      // 6b: goto 72
      // 6e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: aload 1
      // 74: aload 3
      // 75: bipush 4
      // 76: bipush 1
      // 77: bipush 1
      // 78: bipush 4
      // 79: bipush 3
      // 7a: bipush 3
      // 7b: getstatic ox_.ibw Le0x;
      // 7e: invokevirtual e0x.l4i ()Lzfz;
      // 81: getstatic ox_.ibw Le0x;
      // 84: invokevirtual e0x.l4i ()Lzfz;
      // 87: bipush 0
      // 88: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 8b: aload 4
      // 8d: ifnonnull b7
      // 90: goto 97
      // 93: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: goto 9f
      // 9b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.a (Loov;)Loov;
      // 9e: athrow
      // 9f: aload 1
      // a0: aload 3
      // a1: bipush 0
      // a2: bipush 1
      // a3: bipush 1
      // a4: bipush 0
      // a5: bipush 3
      // a6: bipush 3
      // a7: getstatic ox_.ibw Le0x;
      // aa: invokevirtual e0x.l4i ()Lzfz;
      // ad: getstatic ox_.ibw Le0x;
      // b0: invokevirtual e0x.l4i ()Lzfz;
      // b3: bipush 0
      // b4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // b7: bipush 1
      // b8: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
