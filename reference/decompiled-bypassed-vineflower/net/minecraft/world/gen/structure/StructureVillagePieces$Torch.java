package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;

public class StructureVillagePieces$Torch extends StructureVillagePieces$Village {
   public StructureVillagePieces$Torch() {
   }

   public StructureVillagePieces$Torch(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
   }

   public static yve bgc(StructureVillagePieces$Start var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6) {
      yve var7 = yve.sgq(var3, var4, var5, 0, 0, 0, 3, 4, 2, var6);

      try {
         if (xi1.qvo(var1, var7) != null) {
            return null;
         }
      } catch (oov var8) {
         throw a(var8);
      }

      return var7;
   }

   @Override
   public boolean d__(t9d param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 4
      // 008: ifnull 0b7
      // 00b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.e_j I
      // 00e: ifge 05b
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 4
      // 054: iadd
      // 055: bipush 1
      // 056: isub
      // 057: bipush 0
      // 058: invokevirtual yve.gbw (III)V
      // 05b: aload 0
      // 05c: aload 1
      // 05d: aload 3
      // 05e: bipush 0
      // 05f: bipush 0
      // 060: bipush 0
      // 061: bipush 2
      // 062: bipush 3
      // 063: bipush 1
      // 064: getstatic ox_.ibw Le0x;
      // 067: invokevirtual e0x.l4i ()Lzfz;
      // 06a: getstatic ox_.ibw Le0x;
      // 06d: invokevirtual e0x.l4i ()Lzfz;
      // 070: bipush 0
      // 071: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 074: aload 0
      // 075: aload 1
      // 076: getstatic ox_.j5b Le0x;
      // 079: invokevirtual e0x.l4i ()Lzfz;
      // 07c: bipush 1
      // 07d: bipush 0
      // 07e: bipush 0
      // 07f: aload 3
      // 080: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 083: aload 0
      // 084: aload 1
      // 085: getstatic ox_.j5b Le0x;
      // 088: invokevirtual e0x.l4i ()Lzfz;
      // 08b: bipush 1
      // 08c: bipush 1
      // 08d: bipush 0
      // 08e: aload 3
      // 08f: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 092: aload 0
      // 093: aload 1
      // 094: getstatic ox_.j5b Le0x;
      // 097: invokevirtual e0x.l4i ()Lzfz;
      // 09a: bipush 1
      // 09b: bipush 2
      // 09c: bipush 0
      // 09d: aload 3
      // 09e: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a1: aload 0
      // 0a2: aload 1
      // 0a3: getstatic ox_.lpo Le0x;
      // 0a6: getstatic qvg.ft3 Lqvg;
      // 0a9: invokevirtual qvg.b9d ()I
      // 0ac: invokevirtual e0x.kig (I)Lzfz;
      // 0af: bipush 1
      // 0b0: bipush 3
      // 0b1: bipush 0
      // 0b2: aload 3
      // 0b3: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0b6: aload 0
      // 0b7: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.p7m Lvt2;
      // 0ba: getstatic vt2.zk4 Lvt2;
      // 0bd: aload 4
      // 0bf: ifnull 0da
      // 0c2: if_acmpeq 0dd
      // 0c5: goto 0cc
      // 0c8: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.p7m Lvt2;
      // 0d0: getstatic vt2.z9q Lvt2;
      // 0d3: goto 0da
      // 0d6: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: if_acmpne 0e5
      // 0dd: bipush 1
      // 0de: goto 0e6
      // 0e1: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: bipush 0
      // 0e6: istore 5
      // 0e8: aload 0
      // 0e9: aload 1
      // 0ea: getstatic ox_.gt8 Le0x;
      // 0ed: invokevirtual e0x.l4i ()Lzfz;
      // 0f0: getstatic um3.go7 Lqx_;
      // 0f3: aload 0
      // 0f4: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.p7m Lvt2;
      // 0f7: invokevirtual vt2.drv ()Lvt2;
      // 0fa: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0ff: iload 5
      // 101: aload 4
      // 103: ifnull 111
      // 106: ifeq 114
      // 109: goto 110
      // 10c: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 10f: athrow
      // 110: bipush 2
      // 111: goto 115
      // 114: bipush 0
      // 115: bipush 3
      // 116: bipush 0
      // 117: aload 3
      // 118: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 11b: aload 0
      // 11c: aload 1
      // 11d: getstatic ox_.gt8 Le0x;
      // 120: invokevirtual e0x.l4i ()Lzfz;
      // 123: getstatic um3.go7 Lqx_;
      // 126: aload 0
      // 127: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.p7m Lvt2;
      // 12a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 12f: bipush 1
      // 130: bipush 3
      // 131: bipush 1
      // 132: aload 3
      // 133: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 136: aload 0
      // 137: aload 1
      // 138: getstatic ox_.gt8 Le0x;
      // 13b: invokevirtual e0x.l4i ()Lzfz;
      // 13e: getstatic um3.go7 Lqx_;
      // 141: aload 0
      // 142: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.p7m Lvt2;
      // 145: invokevirtual vt2.tgw ()Lvt2;
      // 148: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 14d: iload 5
      // 14f: aload 4
      // 151: ifnull 15f
      // 154: ifeq 162
      // 157: goto 15e
      // 15a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Torch.a (Loov;)Loov;
      // 15d: athrow
      // 15e: bipush 0
      // 15f: goto 163
      // 162: bipush 2
      // 163: bipush 3
      // 164: bipush 0
      // 165: aload 3
      // 166: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 169: aload 0
      // 16a: aload 1
      // 16b: getstatic ox_.gt8 Le0x;
      // 16e: invokevirtual e0x.l4i ()Lzfz;
      // 171: getstatic um3.go7 Lqx_;
      // 174: aload 0
      // 175: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Torch.p7m Lvt2;
      // 178: invokevirtual vt2.b4b ()Lvt2;
      // 17b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 180: bipush 1
      // 181: bipush 3
      // 182: bipush -1
      // 183: aload 3
      // 184: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Torch.lzy (Lt9d;Lzfz;IIILyve;)V
      // 187: bipush 1
      // 188: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
