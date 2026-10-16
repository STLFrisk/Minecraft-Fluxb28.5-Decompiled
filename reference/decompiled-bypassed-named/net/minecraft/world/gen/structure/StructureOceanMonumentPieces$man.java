package net.minecraft.world.gen.structure;

public class StructureOceanMonumentPieces$man {
   public int o8f;
   public StructureOceanMonumentPieces$man[] fpr = new StructureOceanMonumentPieces$man[6];
   public boolean[] _dl = new boolean[6];
   public boolean s0n;
   public boolean txj;
   public int kq1;

   public StructureOceanMonumentPieces$man(int var1) {
      this.o8f = var1;
   }

   public void di1(vt2 var1, StructureOceanMonumentPieces$man var2) {
      this.fpr[var1.c3s()] = var2;
      var2.fpr[var1.b4b().c3s()] = this;
   }

   public void mpp() {
      EntityLivingBase[] var1 = StructureStrongholdPieces$Stronghold.b();
      int var2 = 0;

      while (var2 < 6) {
         boolean[] var10000;
         int var10001;
         boolean var10002;
         label22: {
            try {
               var10000 = this._dl;
               var10001 = var2;
               if (this.fpr[var2] != null) {
                  var10002 = true;
                  break label22;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10002 = false;
         }

         var10000[var10001] = var10002;
         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   public boolean aru(int param1) {
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
      // 05: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.txj Z
      // 08: aload 2
      // 09: ifnull 22
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 1
      // 1e: putfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.kq1 I
      // 21: bipush 0
      // 22: istore 3
      // 23: iload 3
      // 24: bipush 6
      // 26: if_icmpge 98
      // 29: aload 0
      // 2a: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 2d: iload 3
      // 2e: aaload
      // 2f: aload 2
      // 30: ifnull 3e
      // 33: ifnull 91
      // 36: goto 3d
      // 39: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man._dl [Z
      // 41: iload 3
      // 42: baload
      // 43: aload 2
      // 44: ifnull 61
      // 47: ifeq 91
      // 4a: goto 51
      // 4d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 55: iload 3
      // 56: aaload
      // 57: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.kq1 I
      // 5a: goto 61
      // 5d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 2
      // 62: ifnull 81
      // 65: iload 1
      // 66: if_icmpeq 91
      // 69: goto 70
      // 6c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.fpr [Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$man;
      // 74: iload 3
      // 75: aaload
      // 76: iload 1
      // 77: invokevirtual net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.aru (I)Z
      // 7a: goto 81
      // 7d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 2
      // 82: ifnull 90
      // 85: ifeq 91
      // 88: goto 8f
      // 8b: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 8e: athrow
      // 8f: bipush 1
      // 90: ireturn
      // 91: iinc 3 1
      // 94: aload 2
      // 95: ifnonnull 23
      // 98: bipush 0
      // 99: ireturn
   }

   public boolean w5c() {
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
      // 05: getfield net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.o8f I
      // 08: aload 1
      // 09: ifnull 20
      // 0c: bipush 75
      // 0e: if_icmplt 23
      // 11: goto 18
      // 14: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 20
      // 1c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonumentPieces$man.a (Loov;)Loov;
      // 1f: athrow
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   public int eqz() {
      int var2 = 0;
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      int var3 = 0;
      EntityLivingBase[] var1 = var10000;

      while (true) {
         if (var3 < 6) {
            label23: {
               try {
                  var5 = this._dl[var3];
                  if (var1 == null) {
                     break;
                  }

                  if (var5 == 0) {
                     break label23;
                  }
               } catch (oov var4) {
                  throw a(var4);
               }

               var2++;
            }

            var3++;
            if (var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
