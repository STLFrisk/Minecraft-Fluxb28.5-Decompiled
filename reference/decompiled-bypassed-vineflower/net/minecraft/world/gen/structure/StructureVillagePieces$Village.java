package net.minecraft.world.gen.structure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class StructureVillagePieces$Village extends xi1 {
   public int e_j;
   private int ljr;
   private boolean lk4;
   private static final long b;
   private static final String[] c;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public StructureVillagePieces$Village() {
      this.e_j = -1;
   }

   public StructureVillagePieces$Village(StructureVillagePieces$Start var1, int var2) {
      super(var2);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.e_j = -1;
      i2h[] var3 = var10000;

      label20: {
         try {
            var5 = var1;
            if (var3 == null) {
               break label20;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var5 = this;
      }

      ((StructureVillagePieces$Village)var5).lk4 = var1.l_l;
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 46597734866601L;
      var1.iin(b<"m">(8327, 4948684978932583147L ^ var2), this.e_j);
      var1.iin(b<"m">(18857, 7013650606619976646L ^ var2), this.ljr);
      var1.zyu(b<"m">(30270, 426006460733119573L ^ var2), this.lk4);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 92577161762754L;
      this.e_j = var1.uz7(b<"m">(10179, 4028708472490280134L ^ var2));
      this.ljr = var1.uz7(b<"m">(12374, 5391754676829573968L ^ var2));
      this.lk4 = var1.dvl(b<"m">(22750, 6631891045136514015L ^ var2));
   }

   public xi1 a3p(StructureVillagePieces$Start param1, List param2, Random param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.p7m Lvt2;
      // 04: ifnull e4
      // 07: getstatic net/minecraft/world/gen/structure/StructureVillagePieces$1.wgx [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 210 1 4 34 81 124 167
      // 30: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 2
      // 36: aload 3
      // 37: aload 0
      // 38: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 3b: getfield yve.gdj I
      // 3e: bipush 1
      // 3f: isub
      // 40: aload 0
      // 41: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 44: getfield yve._3o I
      // 47: iload 4
      // 49: iadd
      // 4a: aload 0
      // 4b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 4e: getfield yve.ob0 I
      // 51: iload 5
      // 53: iadd
      // 54: getstatic vt2.te4 Lvt2;
      // 57: aload 0
      // 58: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // 5b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 5e: areturn
      // 5f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 2
      // 65: aload 3
      // 66: aload 0
      // 67: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 6a: getfield yve.gdj I
      // 6d: bipush 1
      // 6e: isub
      // 6f: aload 0
      // 70: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 73: getfield yve._3o I
      // 76: iload 4
      // 78: iadd
      // 79: aload 0
      // 7a: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 7d: getfield yve.ob0 I
      // 80: iload 5
      // 82: iadd
      // 83: getstatic vt2.te4 Lvt2;
      // 86: aload 0
      // 87: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // 8a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 8d: areturn
      // 8e: aload 1
      // 8f: aload 2
      // 90: aload 3
      // 91: aload 0
      // 92: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 95: getfield yve.gdj I
      // 98: iload 5
      // 9a: iadd
      // 9b: aload 0
      // 9c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 9f: getfield yve._3o I
      // a2: iload 4
      // a4: iadd
      // a5: aload 0
      // a6: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // a9: getfield yve.ob0 I
      // ac: bipush 1
      // ad: isub
      // ae: getstatic vt2.z9q Lvt2;
      // b1: aload 0
      // b2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // b5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // b8: areturn
      // b9: aload 1
      // ba: aload 2
      // bb: aload 3
      // bc: aload 0
      // bd: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // c0: getfield yve.gdj I
      // c3: iload 5
      // c5: iadd
      // c6: aload 0
      // c7: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // ca: getfield yve._3o I
      // cd: iload 4
      // cf: iadd
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // d4: getfield yve.ob0 I
      // d7: bipush 1
      // d8: isub
      // d9: getstatic vt2.z9q Lvt2;
      // dc: aload 0
      // dd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // e0: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // e3: areturn
      // e4: aconst_null
      // e5: areturn
   }

   public xi1 x8y(StructureVillagePieces$Start param1, List param2, Random param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.p7m Lvt2;
      // 04: ifnull e4
      // 07: getstatic net/minecraft/world/gen/structure/StructureVillagePieces$1.wgx [I
      // 0a: aload 0
      // 0b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.p7m Lvt2;
      // 0e: invokevirtual vt2.ordinal ()I
      // 11: iaload
      // 12: tableswitch 210 1 4 34 81 124 167
      // 30: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 2
      // 36: aload 3
      // 37: aload 0
      // 38: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 3b: getfield yve.kwp I
      // 3e: bipush 1
      // 3f: iadd
      // 40: aload 0
      // 41: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 44: getfield yve._3o I
      // 47: iload 4
      // 49: iadd
      // 4a: aload 0
      // 4b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 4e: getfield yve.ob0 I
      // 51: iload 5
      // 53: iadd
      // 54: getstatic vt2.zk4 Lvt2;
      // 57: aload 0
      // 58: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // 5b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 5e: areturn
      // 5f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 2
      // 65: aload 3
      // 66: aload 0
      // 67: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 6a: getfield yve.kwp I
      // 6d: bipush 1
      // 6e: iadd
      // 6f: aload 0
      // 70: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 73: getfield yve._3o I
      // 76: iload 4
      // 78: iadd
      // 79: aload 0
      // 7a: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 7d: getfield yve.ob0 I
      // 80: iload 5
      // 82: iadd
      // 83: getstatic vt2.zk4 Lvt2;
      // 86: aload 0
      // 87: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // 8a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 8d: areturn
      // 8e: aload 1
      // 8f: aload 2
      // 90: aload 3
      // 91: aload 0
      // 92: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 95: getfield yve.gdj I
      // 98: iload 5
      // 9a: iadd
      // 9b: aload 0
      // 9c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 9f: getfield yve._3o I
      // a2: iload 4
      // a4: iadd
      // a5: aload 0
      // a6: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // a9: getfield yve.nwc I
      // ac: bipush 1
      // ad: iadd
      // ae: getstatic vt2.mxp Lvt2;
      // b1: aload 0
      // b2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // b5: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // b8: areturn
      // b9: aload 1
      // ba: aload 2
      // bb: aload 3
      // bc: aload 0
      // bd: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // c0: getfield yve.gdj I
      // c3: iload 5
      // c5: iadd
      // c6: aload 0
      // c7: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // ca: getfield yve._3o I
      // cd: iload 4
      // cf: iadd
      // d0: aload 0
      // d1: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // d4: getfield yve.nwc I
      // d7: bipush 1
      // d8: iadd
      // d9: getstatic vt2.mxp Lvt2;
      // dc: aload 0
      // dd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.gd3 ()I
      // e0: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.ds_ (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // e3: areturn
      // e4: aconst_null
      // e5: areturn
   }

   public int rh3(t9d param1, yve param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 4
      // 03: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 06: bipush 0
      // 07: istore 5
      // 09: new mew$mix
      // 0c: dup
      // 0d: invokespecial mew$mix.<init> ()V
      // 10: astore 6
      // 12: aload 0
      // 13: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 16: getfield yve.ob0 I
      // 19: istore 7
      // 1b: astore 3
      // 1c: iload 7
      // 1e: aload 0
      // 1f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 22: getfield yve.nwc I
      // 25: if_icmpgt 8e
      // 28: aload 0
      // 29: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 2c: getfield yve.gdj I
      // 2f: aload 3
      // 30: ifnull 90
      // 33: istore 8
      // 35: iload 8
      // 37: aload 0
      // 38: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.yqm Lyve;
      // 3b: getfield yve.kwp I
      // 3e: if_icmpgt 87
      // 41: aload 6
      // 43: iload 8
      // 45: bipush 64
      // 47: iload 7
      // 49: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 4c: pop
      // 4d: aload 3
      // 4e: ifnull 83
      // 51: aload 2
      // 52: aload 6
      // 54: invokevirtual yve.vwy (Lwgo;)Z
      // 57: aload 3
      // 58: ifnull 1e
      // 5b: goto 62
      // 5e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 61: athrow
      // 62: ifeq 80
      // 65: iload 4
      // 67: aload 1
      // 68: aload 6
      // 6a: invokevirtual t9d.pnv (Lmew;)Lmew;
      // 6d: invokevirtual mew.getY ()I
      // 70: aload 1
      // 71: getfield t9d.vzz Lupn;
      // 74: invokevirtual upn.z9e ()I
      // 77: invokestatic java/lang/Math.max (II)I
      // 7a: iadd
      // 7b: istore 4
      // 7d: iinc 5 1
      // 80: iinc 8 1
      // 83: aload 3
      // 84: ifnonnull 35
      // 87: iinc 7 1
      // 8a: aload 3
      // 8b: ifnonnull 1c
      // 8e: iload 5
      // 90: aload 3
      // 91: ifnull a9
      // 94: ifne a4
      // 97: goto 9e
      // 9a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 9d: athrow
      // 9e: bipush -1
      // 9f: ireturn
      // a0: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // a3: athrow
      // a4: iload 4
      // a6: iload 5
      // a8: idiv
      // a9: ireturn
   }

   public static boolean r60(yve param0) {
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
      // 06: ifnull 14
      // 09: ifnull 32
      // 0c: goto 13
      // 0f: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield yve._3o I
      // 17: aload 1
      // 18: ifnull 2f
      // 1b: bipush 10
      // 1d: if_icmple 32
      // 20: goto 27
      // 23: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 2e: athrow
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   public void pil(t9d param1, yve param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 7
      // 05: aload 0
      // 06: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.ljr I
      // 09: aload 7
      // 0b: ifnull 25
      // 0e: iload 6
      // 10: if_icmpge d7
      // 13: goto 1a
      // 16: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.ljr I
      // 1e: goto 25
      // 21: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 24: athrow
      // 25: istore 8
      // 27: iload 8
      // 29: iload 6
      // 2b: if_icmpge d7
      // 2e: aload 0
      // 2f: iload 3
      // 30: iload 8
      // 32: iadd
      // 33: iload 5
      // 35: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.q__ (II)I
      // 38: istore 9
      // 3a: aload 0
      // 3b: iload 4
      // 3d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village._tw (I)I
      // 40: istore 10
      // 42: aload 0
      // 43: iload 3
      // 44: iload 8
      // 46: iadd
      // 47: iload 5
      // 49: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village._ye (II)I
      // 4c: istore 11
      // 4e: aload 7
      // 50: ifnull 7f
      // 53: aload 2
      // 54: new mew
      // 57: dup
      // 58: iload 9
      // 5a: iload 10
      // 5c: iload 11
      // 5e: invokespecial mew.<init> (III)V
      // 61: invokevirtual yve.vwy (Lwgo;)Z
      // 64: ifne 75
      // 67: goto 6e
      // 6a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 6d: athrow
      // 6e: goto d7
      // 71: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 0
      // 76: dup
      // 77: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.ljr I
      // 7a: bipush 1
      // 7b: iadd
      // 7c: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.ljr I
      // 7f: new ysf
      // 82: dup
      // 83: aload 1
      // 84: invokespecial ysf.<init> (Lt9d;)V
      // 87: astore 12
      // 89: aload 12
      // 8b: iload 9
      // 8d: i2d
      // 8e: ldc2_w 0.5
      // 91: dadd
      // 92: iload 10
      // 94: i2d
      // 95: iload 11
      // 97: i2d
      // 98: ldc2_w 0.5
      // 9b: dadd
      // 9c: fconst_0
      // 9d: fconst_0
      // 9e: invokevirtual ysf.x24 (DDDFF)V
      // a1: aload 12
      // a3: aload 1
      // a4: new mew
      // a7: dup
      // a8: aload 12
      // aa: invokespecial mew.<init> (Li2h;)V
      // ad: invokevirtual t9d.sms (Lmew;)Lcss;
      // b0: aconst_null
      // b1: checkcast ps6
      // b4: invokevirtual ysf.hx8 (Lcss;Lps6;)Lps6;
      // b7: pop
      // b8: aload 12
      // ba: aload 0
      // bb: iload 8
      // bd: aload 12
      // bf: invokevirtual ysf.y6a ()I
      // c2: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Village.e0x (II)I
      // c5: invokevirtual ysf.nx9 (I)V
      // c8: aload 1
      // c9: aload 12
      // cb: invokevirtual t9d.xzq (Li2h;)Z
      // ce: pop
      // cf: iinc 8 1
      // d2: aload 7
      // d4: ifnonnull 27
      // d7: return
   }

   public int e0x(int var1, int var2) {
      return var2;
   }

   public zfz wrt(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Village.lk4 Z
      // 008: ifeq 126
      // 00b: aload 1
      // 00c: invokeinterface zfz.r_y ()Le0x; 1
      // 011: aload 2
      // 012: ifnull 04a
      // 015: goto 01c
      // 018: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 01b: athrow
      // 01c: getstatic ox_.uom Le0x;
      // 01f: if_acmpeq 047
      // 022: goto 029
      // 025: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 028: athrow
      // 029: aload 1
      // 02a: invokeinterface zfz.r_y ()Le0x; 1
      // 02f: getstatic ox_.a4y Le0x;
      // 032: aload 2
      // 033: ifnull 057
      // 036: goto 03d
      // 039: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 03c: athrow
      // 03d: if_acmpne 04e
      // 040: goto 047
      // 043: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 046: athrow
      // 047: getstatic ox_.umb Le0x;
      // 04a: invokevirtual e0x.l4i ()Lzfz;
      // 04d: areturn
      // 04e: aload 1
      // 04f: invokeinterface zfz.r_y ()Le0x; 1
      // 054: getstatic ox_.a3_ Le0x;
      // 057: aload 2
      // 058: ifnull 07f
      // 05b: if_acmpne 076
      // 05e: goto 065
      // 061: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 064: athrow
      // 065: getstatic ox_.umb Le0x;
      // 068: getstatic cp8$vxz.bpt Lcp8$vxz;
      // 06b: invokevirtual cp8$vxz.a1g ()I
      // 06e: invokevirtual e0x.kig (I)Lzfz;
      // 071: areturn
      // 072: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 075: athrow
      // 076: aload 1
      // 077: invokeinterface zfz.r_y ()Le0x; 1
      // 07c: getstatic ox_.wb7 Le0x;
      // 07f: aload 2
      // 080: ifnull 0a7
      // 083: if_acmpne 09e
      // 086: goto 08d
      // 089: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 08c: athrow
      // 08d: getstatic ox_.umb Le0x;
      // 090: getstatic cp8$vxz.i7j Lcp8$vxz;
      // 093: invokevirtual cp8$vxz.a1g ()I
      // 096: invokevirtual e0x.kig (I)Lzfz;
      // 099: areturn
      // 09a: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 1
      // 09f: invokeinterface zfz.r_y ()Le0x; 1
      // 0a4: getstatic ox_.olk Le0x;
      // 0a7: aload 2
      // 0a8: ifnull 0da
      // 0ab: if_acmpne 0d1
      // 0ae: goto 0b5
      // 0b1: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 0b4: athrow
      // 0b5: getstatic ox_.qci Le0x;
      // 0b8: invokevirtual e0x.l4i ()Lzfz;
      // 0bb: getstatic g7u.sxt Lqx_;
      // 0be: aload 1
      // 0bf: getstatic g7u.sxt Lqx_;
      // 0c2: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0c7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0cc: areturn
      // 0cd: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 1
      // 0d2: invokeinterface zfz.r_y ()Le0x; 1
      // 0d7: getstatic ox_.l3f Le0x;
      // 0da: aload 2
      // 0db: ifnull 118
      // 0de: if_acmpne 104
      // 0e1: goto 0e8
      // 0e4: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 0e7: athrow
      // 0e8: getstatic ox_.qci Le0x;
      // 0eb: invokevirtual e0x.l4i ()Lzfz;
      // 0ee: getstatic g7u.sxt Lqx_;
      // 0f1: aload 1
      // 0f2: getstatic g7u.sxt Lqx_;
      // 0f5: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0fa: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0ff: areturn
      // 100: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 103: athrow
      // 104: aload 1
      // 105: aload 2
      // 106: ifnull 127
      // 109: invokeinterface zfz.r_y ()Le0x; 1
      // 10e: getstatic ox_.bqn Le0x;
      // 111: goto 118
      // 114: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 117: athrow
      // 118: if_acmpne 126
      // 11b: getstatic ox_.umb Le0x;
      // 11e: invokevirtual e0x.l4i ()Lzfz;
      // 121: areturn
      // 122: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Village.b (Loov;)Loov;
      // 125: athrow
      // 126: aload 1
      // 127: areturn
   }

   @Override
   public void lzy(t9d var1, zfz var2, int var3, int var4, int var5, yve var6) {
      zfz var7 = this.wrt(var2);
      super.lzy(var1, var7, var3, var4, var5, var6);
   }

   @Override
   public void gys(t9d var1, yve var2, int var3, int var4, int var5, int var6, int var7, int var8, zfz var9, zfz var10, boolean var11) {
      zfz var12 = this.wrt(var9);
      zfz var13 = this.wrt(var10);
      super.gys(var1, var2, var3, var4, var5, var6, var7, var8, var12, var13, var11);
   }

   @Override
   public void doc(t9d var1, zfz var2, int var3, int var4, int var5, yve var6) {
      zfz var7 = this.wrt(var2);
      super.doc(var1, var7, var3, var4, var5, var6);
   }

   public void t5w(boolean var1) {
      this.lk4 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1120571115598275439L, -4162429842281441598L, MethodHandles.lookup().lookupClass()).a(61804960083537L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 84115535890499L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "<#£\u009a÷¸Ìì¥ZéßÓ8\rá\u0010 Öx/g#£LÔý¶üÓÚ¬x\u0010\u008f\tnT\u0084\ne\u0091\u008d\b\u009f\u0081;\fä\u0002\u0010\\\u0007û\u00173ÌÁ#\u0098÷\u001bïàÛ\u0017ç";
      int var8 = "<#£\u009a÷¸Ìì¥ZéßÓ8\rá\u0010 Öx/g#£LÔý¶üÓÚ¬x\u0010\u008f\tnT\u0084\ne\u0091\u008d\b\u009f\u0081;\fä\u0002\u0010\\\u0007û\u00173ÌÁ#\u0098÷\u001bïàÛ\u0017ç"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     h = new String[6];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¡c\u000f\u001d\u001c¼ÈU]FÀÐ\u0000×I\u0093\u00102\u0083Y¥\u008fc¸·ä\fï\u0090[w\u00adä";
                  var8 = "¡c\u000f\u001d\u001c¼ÈU]FÀÐ\u0000×I\u0093\u00102\u0083Y¥\u008fc¸·ä\fï\u0090[w\u00adä".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28457;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Village", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Village" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
