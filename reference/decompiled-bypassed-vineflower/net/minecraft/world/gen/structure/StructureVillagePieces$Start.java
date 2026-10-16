package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class StructureVillagePieces$Start extends StructureVillagePieces$Well {
   public cdp jih;
   public boolean l_l;
   public int qru;
   public StructureVillagePieces$y3u onk;
   public List fl_;
   public List t48 = Lists.newArrayList();
   public List bc_ = Lists.newArrayList();

   public StructureVillagePieces$Start() {
   }

   public StructureVillagePieces$Start(cdp param1, int param2, Random param3, int param4, int param5, List param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aconst_null
      // 02: checkcast net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 05: bipush 0
      // 06: aload 3
      // 07: iload 4
      // 09: iload 5
      // 0b: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Well.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;II)V
      // 0e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 11: aload 0
      // 12: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 15: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.t48 Ljava/util/List;
      // 18: astore 8
      // 1a: aload 0
      // 1b: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 1e: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.bc_ Ljava/util/List;
      // 21: aload 0
      // 22: aload 1
      // 23: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.jih Lcdp;
      // 26: aload 0
      // 27: aload 6
      // 29: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.fl_ Ljava/util/List;
      // 2c: aload 0
      // 2d: iload 7
      // 2f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.qru I
      // 32: aload 1
      // 33: new mew
      // 36: dup
      // 37: iload 4
      // 39: bipush 0
      // 3a: iload 5
      // 3c: invokespecial mew.<init> (III)V
      // 3f: getstatic gyu.bt0 Lgyu;
      // 42: invokevirtual cdp.gwg (Lmew;Lgyu;)Lgyu;
      // 45: astore 9
      // 47: aload 0
      // 48: aload 9
      // 4a: getstatic gyu._cz Lgyu;
      // 4d: aload 8
      // 4f: ifnull 68
      // 52: if_acmpeq 6b
      // 55: goto 5c
      // 58: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Start.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 9
      // 5e: getstatic gyu.txo Lgyu;
      // 61: goto 68
      // 64: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Start.a (Loov;)Loov;
      // 67: athrow
      // 68: if_acmpne 73
      // 6b: bipush 1
      // 6c: goto 74
      // 6f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Start.a (Loov;)Loov;
      // 72: athrow
      // 73: bipush 0
      // 74: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.l_l Z
      // 77: aload 0
      // 78: aload 0
      // 79: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.l_l Z
      // 7c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.t5w (Z)V
      // 7f: return
   }

   public cdp adb() {
      return this.jih;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
