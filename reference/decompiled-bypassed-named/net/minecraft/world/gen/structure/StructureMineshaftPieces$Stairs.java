package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureMineshaftPieces$Stairs extends xi1 {
   public StructureMineshaftPieces$Stairs() {
   }

   public StructureMineshaftPieces$Stairs(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void z0d(bdo var1) {
   }

   @Override
   public void oqf(bdo var1) {
   }

   public static yve p2i(List param0, Random param1, int param2, int param3, int param4, vt2 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 6
      // 05: new yve
      // 08: dup
      // 09: iload 2
      // 0a: iload 3
      // 0b: bipush 5
      // 0c: isub
      // 0d: iload 4
      // 0f: iload 2
      // 10: iload 3
      // 11: bipush 2
      // 12: iadd
      // 13: iload 4
      // 15: invokespecial yve.<init> (IIIIII)V
      // 18: astore 7
      // 1a: aload 6
      // 1c: ifnull 65
      // 1f: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$1.u_1 [I
      // 22: aload 5
      // 24: invokevirtual vt2.ordinal ()I
      // 27: iaload
      // 28: tableswitch 151 1 4 36 66 96 126
      // 48: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 7
      // 4e: iload 2
      // 4f: bipush 2
      // 50: iadd
      // 51: putfield yve.kwp I
      // 54: aload 7
      // 56: iload 4
      // 58: bipush 8
      // 5a: isub
      // 5b: putfield yve.ob0 I
      // 5e: goto 65
      // 61: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 6
      // 67: ifnonnull bf
      // 6a: aload 7
      // 6c: iload 2
      // 6d: bipush 2
      // 6e: iadd
      // 6f: putfield yve.kwp I
      // 72: aload 7
      // 74: iload 4
      // 76: bipush 8
      // 78: iadd
      // 79: putfield yve.nwc I
      // 7c: aload 6
      // 7e: ifnonnull bf
      // 81: goto 88
      // 84: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 7
      // 8a: iload 2
      // 8b: bipush 8
      // 8d: isub
      // 8e: putfield yve.gdj I
      // 91: aload 7
      // 93: iload 4
      // 95: bipush 2
      // 96: iadd
      // 97: putfield yve.nwc I
      // 9a: aload 6
      // 9c: ifnonnull bf
      // 9f: goto a6
      // a2: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // a5: athrow
      // a6: aload 7
      // a8: iload 2
      // a9: bipush 8
      // ab: iadd
      // ac: putfield yve.kwp I
      // af: aload 7
      // b1: iload 4
      // b3: bipush 2
      // b4: iadd
      // b5: putfield yve.nwc I
      // b8: goto bf
      // bb: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // be: athrow
      // bf: aload 0
      // c0: aload 7
      // c2: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // c5: ifnull d0
      // c8: aconst_null
      // c9: goto d2
      // cc: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // cf: athrow
      // d0: aload 7
      // d2: areturn
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
      // 06: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.gd3 ()I
      // 09: istore 5
      // 0b: aload 0
      // 0c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.p7m Lvt2;
      // 0f: ifnull f7
      // 12: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$1.u_1 [I
      // 15: aload 0
      // 16: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.p7m Lvt2;
      // 19: invokevirtual vt2.ordinal ()I
      // 1c: iaload
      // 1d: tableswitch 218 1 4 35 82 129 176
      // 3c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: aload 2
      // 42: aload 3
      // 43: aload 0
      // 44: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // 47: getfield yve.gdj I
      // 4a: aload 0
      // 4b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // 4e: getfield yve._3o I
      // 51: aload 0
      // 52: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // 55: getfield yve.ob0 I
      // 58: bipush 1
      // 59: isub
      // 5a: getstatic vt2.z9q Lvt2;
      // 5d: iload 5
      // 5f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 62: pop
      // 63: aload 4
      // 65: ifnonnull f7
      // 68: goto 6f
      // 6b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 1
      // 70: aload 2
      // 71: aload 3
      // 72: aload 0
      // 73: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // 76: getfield yve.gdj I
      // 79: aload 0
      // 7a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // 7d: getfield yve._3o I
      // 80: aload 0
      // 81: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // 84: getfield yve.nwc I
      // 87: bipush 1
      // 88: iadd
      // 89: getstatic vt2.mxp Lvt2;
      // 8c: iload 5
      // 8e: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 91: pop
      // 92: aload 4
      // 94: ifnonnull f7
      // 97: goto 9e
      // 9a: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 1
      // 9f: aload 2
      // a0: aload 3
      // a1: aload 0
      // a2: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // a5: getfield yve.gdj I
      // a8: bipush 1
      // a9: isub
      // aa: aload 0
      // ab: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // ae: getfield yve._3o I
      // b1: aload 0
      // b2: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // b5: getfield yve.ob0 I
      // b8: getstatic vt2.te4 Lvt2;
      // bb: iload 5
      // bd: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // c0: pop
      // c1: aload 4
      // c3: ifnonnull f7
      // c6: goto cd
      // c9: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // cc: athrow
      // cd: aload 1
      // ce: aload 2
      // cf: aload 3
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // d4: getfield yve.kwp I
      // d7: bipush 1
      // d8: iadd
      // d9: aload 0
      // da: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // dd: getfield yve._3o I
      // e0: aload 0
      // e1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.yqm Lyve;
      // e4: getfield yve.ob0 I
      // e7: getstatic vt2.zk4 Lvt2;
      // ea: iload 5
      // ec: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // ef: pop
      // f0: goto f7
      // f3: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // f6: athrow
      // f7: return
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
      // 08: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.knc (Lt9d;Lyve;)Z
      // 0b: aload 4
      // 0d: ifnull 56
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 3
      // 23: bipush 0
      // 24: bipush 5
      // 25: bipush 0
      // 26: bipush 2
      // 27: bipush 7
      // 29: bipush 1
      // 2a: getstatic ox_.ibw Le0x;
      // 2d: invokevirtual e0x.l4i ()Lzfz;
      // 30: getstatic ox_.ibw Le0x;
      // 33: invokevirtual e0x.l4i ()Lzfz;
      // 36: bipush 0
      // 37: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 3
      // 3d: bipush 0
      // 3e: bipush 0
      // 3f: bipush 7
      // 41: bipush 2
      // 42: bipush 2
      // 43: bipush 8
      // 45: getstatic ox_.ibw Le0x;
      // 48: invokevirtual e0x.l4i ()Lzfz;
      // 4b: getstatic ox_.ibw Le0x;
      // 4e: invokevirtual e0x.l4i ()Lzfz;
      // 51: bipush 0
      // 52: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 55: bipush 0
      // 56: istore 5
      // 58: iload 5
      // 5a: bipush 5
      // 5b: if_icmpge ab
      // 5e: aload 0
      // 5f: aload 1
      // 60: aload 3
      // 61: bipush 0
      // 62: bipush 5
      // 63: iload 5
      // 65: isub
      // 66: iload 5
      // 68: aload 4
      // 6a: ifnull 80
      // 6d: bipush 4
      // 6e: if_icmpge 83
      // 71: goto 78
      // 74: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 77: athrow
      // 78: bipush 1
      // 79: goto 80
      // 7c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.a (Loov;)Loov;
      // 7f: athrow
      // 80: goto 84
      // 83: bipush 0
      // 84: isub
      // 85: bipush 2
      // 86: iload 5
      // 88: iadd
      // 89: bipush 2
      // 8a: bipush 7
      // 8c: iload 5
      // 8e: isub
      // 8f: bipush 2
      // 90: iload 5
      // 92: iadd
      // 93: getstatic ox_.ibw Le0x;
      // 96: invokevirtual e0x.l4i ()Lzfz;
      // 99: getstatic ox_.ibw Le0x;
      // 9c: invokevirtual e0x.l4i ()Lzfz;
      // 9f: bipush 0
      // a0: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Stairs.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // a3: iinc 5 1
      // a6: aload 4
      // a8: ifnonnull 58
      // ab: bipush 1
      // ac: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
