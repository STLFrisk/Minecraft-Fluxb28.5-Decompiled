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

public class StructureStrongholdPieces$Crossing extends StructureStrongholdPieces$Stronghold {
   private boolean cxq;
   private boolean shw;
   private boolean vvr;
   private boolean hd4;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$Crossing() {
   }

   public StructureStrongholdPieces$Crossing(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.ppu = this.i2t(var2);
      this.yqm = var3;
      EntityLivingBase[] var5 = var10000;

      int var10001;
      label22: {
         label21: {
            try {
               this.cxq = var2.nextBoolean();
               this.shw = var2.nextBoolean();
               this.vvr = var2.nextBoolean();
               var7 = this;
               var10001 = var2.nextInt(3);
               if (var5 == null) {
                  break label22;
               }

               if (var10001 > 0) {
                  break label21;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var7.hd4 = (boolean)var10001;
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 47560881126573L;
      super.z0d(var1);
      var1.zyu(c<"f">(28793, 6329147754558573076L ^ var2), this.cxq);
      var1.zyu(c<"f">(29448, 7474803140733618529L ^ var2), this.shw);
      var1.zyu(c<"f">(215, 87620999328479928L ^ var2), this.vvr);
      var1.zyu(c<"f">(21433, 2554614808756349399L ^ var2), this.hd4);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 93536013055430L;
      super.oqf(var1);
      this.cxq = var1.dvl(c<"f">(1671, 256770256597579136L ^ var2));
      this.shw = var1.dvl(c<"f">(4906, 5910576153161949225L ^ var2));
      this.vvr = var1.dvl(c<"f">(20846, 3988929989314159214L ^ var2));
      this.hd4 = var1.dvl(c<"f">(6465, 14882709609638464L ^ var2));
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
      // 05: bipush 3
      // 06: istore 5
      // 08: bipush 5
      // 09: istore 6
      // 0b: aload 4
      // 0d: ifnull 45
      // 10: aload 0
      // 11: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.p7m Lvt2;
      // 14: getstatic vt2.te4 Lvt2;
      // 17: if_acmpeq 3e
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: aload 4
      // 24: ifnull 5a
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.p7m Lvt2;
      // 31: getstatic vt2.z9q Lvt2;
      // 34: if_acmpne 4c
      // 37: goto 3e
      // 3a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 8
      // 40: iload 5
      // 42: isub
      // 43: istore 5
      // 45: bipush 8
      // 47: iload 6
      // 49: isub
      // 4a: istore 6
      // 4c: aload 0
      // 4d: aload 1
      // 4e: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 51: aload 2
      // 52: aload 3
      // 53: bipush 5
      // 54: bipush 1
      // 55: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.bmb (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 58: pop
      // 59: aload 0
      // 5a: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.cxq Z
      // 5d: aload 4
      // 5f: ifnull 85
      // 62: ifeq 81
      // 65: goto 6c
      // 68: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 1
      // 6e: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 71: aload 2
      // 72: aload 3
      // 73: iload 5
      // 75: bipush 1
      // 76: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.go3 (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 79: pop
      // 7a: goto 81
      // 7d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 0
      // 82: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.shw Z
      // 85: aload 4
      // 87: ifnull ae
      // 8a: ifeq aa
      // 8d: goto 94
      // 90: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: aload 1
      // 96: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 99: aload 2
      // 9a: aload 3
      // 9b: iload 6
      // 9d: bipush 7
      // 9f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.go3 (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // a2: pop
      // a3: goto aa
      // a6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // a9: athrow
      // aa: aload 0
      // ab: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.vvr Z
      // ae: aload 4
      // b0: ifnull e2
      // b3: ifeq d2
      // b6: goto bd
      // b9: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 0
      // be: aload 1
      // bf: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // c2: aload 2
      // c3: aload 3
      // c4: iload 5
      // c6: bipush 1
      // c7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.ywi (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // ca: pop
      // cb: goto d2
      // ce: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // d1: athrow
      // d2: aload 0
      // d3: aload 4
      // d5: ifnull fa
      // d8: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.hd4 Z
      // db: goto e2
      // de: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // e1: athrow
      // e2: ifeq fb
      // e5: aload 0
      // e6: aload 1
      // e7: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // ea: aload 2
      // eb: aload 3
      // ec: iload 6
      // ee: bipush 7
      // f0: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.ywi (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // f3: goto fa
      // f6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // f9: athrow
      // fa: pop
      // fb: return
   }

   public static StructureStrongholdPieces$Crossing lzc(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 04: bipush -4
      // 06: bipush -3
      // 08: bipush 0
      // 09: bipush 10
      // 0b: bipush 9
      // 0d: bipush 11
      // 0f: aload 5
      // 11: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 14: astore 7
      // 16: aload 7
      // 18: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.jty (Lyve;)Z
      // 1b: ifeq 43
      // 1e: aload 0
      // 1f: aload 7
      // 21: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 24: ifnonnull 43
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 2d: athrow
      // 2e: new net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing
      // 31: dup
      // 32: iload 6
      // 34: aload 1
      // 35: aload 7
      // 37: aload 5
      // 39: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3c: goto 44
      // 3f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 42: athrow
      // 43: aconst_null
      // 44: areturn
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
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 1
      // 007: aload 3
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 046
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 0
      // 026: bipush 9
      // 028: bipush 8
      // 02a: bipush 10
      // 02c: bipush 1
      // 02d: aload 2
      // 02e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 031: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 034: aload 0
      // 035: aload 1
      // 036: aload 2
      // 037: aload 3
      // 038: aload 0
      // 039: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03c: bipush 4
      // 03d: bipush 3
      // 03e: bipush 0
      // 03f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.cxq Z
      // 046: aload 4
      // 048: ifnull 079
      // 04b: ifeq 075
      // 04e: goto 055
      // 051: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 0
      // 056: aload 1
      // 057: aload 3
      // 058: bipush 0
      // 059: bipush 3
      // 05a: bipush 1
      // 05b: bipush 0
      // 05c: bipush 5
      // 05d: bipush 3
      // 05e: getstatic ox_.ibw Le0x;
      // 061: invokevirtual e0x.l4i ()Lzfz;
      // 064: getstatic ox_.ibw Le0x;
      // 067: invokevirtual e0x.l4i ()Lzfz;
      // 06a: bipush 0
      // 06b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 06e: goto 075
      // 071: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.vvr Z
      // 079: aload 4
      // 07b: ifnull 0ae
      // 07e: ifeq 0aa
      // 081: goto 088
      // 084: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: aload 1
      // 08a: aload 3
      // 08b: bipush 9
      // 08d: bipush 3
      // 08e: bipush 1
      // 08f: bipush 9
      // 091: bipush 5
      // 092: bipush 3
      // 093: getstatic ox_.ibw Le0x;
      // 096: invokevirtual e0x.l4i ()Lzfz;
      // 099: getstatic ox_.ibw Le0x;
      // 09c: invokevirtual e0x.l4i ()Lzfz;
      // 09f: bipush 0
      // 0a0: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0a3: goto 0aa
      // 0a6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.shw Z
      // 0ae: aload 4
      // 0b0: ifnull 0e4
      // 0b3: ifeq 0e0
      // 0b6: goto 0bd
      // 0b9: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: aload 3
      // 0c0: bipush 0
      // 0c1: bipush 5
      // 0c2: bipush 7
      // 0c4: bipush 0
      // 0c5: bipush 7
      // 0c7: bipush 9
      // 0c9: getstatic ox_.ibw Le0x;
      // 0cc: invokevirtual e0x.l4i ()Lzfz;
      // 0cf: getstatic ox_.ibw Le0x;
      // 0d2: invokevirtual e0x.l4i ()Lzfz;
      // 0d5: bipush 0
      // 0d6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0d9: goto 0e0
      // 0dc: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.hd4 Z
      // 0e4: aload 4
      // 0e6: ifnull 278
      // 0e9: ifeq 118
      // 0ec: goto 0f3
      // 0ef: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: aload 3
      // 0f6: bipush 9
      // 0f8: bipush 5
      // 0f9: bipush 7
      // 0fb: bipush 9
      // 0fd: bipush 7
      // 0ff: bipush 9
      // 101: getstatic ox_.ibw Le0x;
      // 104: invokevirtual e0x.l4i ()Lzfz;
      // 107: getstatic ox_.ibw Le0x;
      // 10a: invokevirtual e0x.l4i ()Lzfz;
      // 10d: bipush 0
      // 10e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 111: goto 118
      // 114: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: aload 1
      // 11a: aload 3
      // 11b: bipush 5
      // 11c: bipush 1
      // 11d: bipush 10
      // 11f: bipush 7
      // 121: bipush 3
      // 122: bipush 10
      // 124: getstatic ox_.ibw Le0x;
      // 127: invokevirtual e0x.l4i ()Lzfz;
      // 12a: getstatic ox_.ibw Le0x;
      // 12d: invokevirtual e0x.l4i ()Lzfz;
      // 130: bipush 0
      // 131: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 134: aload 0
      // 135: aload 1
      // 136: aload 3
      // 137: bipush 1
      // 138: bipush 2
      // 139: bipush 1
      // 13a: bipush 8
      // 13c: bipush 2
      // 13d: bipush 6
      // 13f: bipush 0
      // 140: aload 2
      // 141: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 144: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 147: aload 0
      // 148: aload 1
      // 149: aload 3
      // 14a: bipush 4
      // 14b: bipush 1
      // 14c: bipush 5
      // 14d: bipush 4
      // 14e: bipush 4
      // 14f: bipush 9
      // 151: bipush 0
      // 152: aload 2
      // 153: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 156: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 159: aload 0
      // 15a: aload 1
      // 15b: aload 3
      // 15c: bipush 8
      // 15e: bipush 1
      // 15f: bipush 5
      // 160: bipush 8
      // 162: bipush 4
      // 163: bipush 9
      // 165: bipush 0
      // 166: aload 2
      // 167: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 16a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 16d: aload 0
      // 16e: aload 1
      // 16f: aload 3
      // 170: bipush 1
      // 171: bipush 4
      // 172: bipush 7
      // 174: bipush 3
      // 175: bipush 4
      // 176: bipush 9
      // 178: bipush 0
      // 179: aload 2
      // 17a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 17d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 180: aload 0
      // 181: aload 1
      // 182: aload 3
      // 183: bipush 1
      // 184: bipush 3
      // 185: bipush 5
      // 186: bipush 3
      // 187: bipush 3
      // 188: bipush 6
      // 18a: bipush 0
      // 18b: aload 2
      // 18c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 18f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 192: aload 0
      // 193: aload 1
      // 194: aload 3
      // 195: bipush 1
      // 196: bipush 3
      // 197: bipush 4
      // 198: bipush 3
      // 199: bipush 3
      // 19a: bipush 4
      // 19b: getstatic ox_.bj8 Lizd;
      // 19e: invokevirtual izd.l4i ()Lzfz;
      // 1a1: getstatic ox_.bj8 Lizd;
      // 1a4: invokevirtual izd.l4i ()Lzfz;
      // 1a7: bipush 0
      // 1a8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1ab: aload 0
      // 1ac: aload 1
      // 1ad: aload 3
      // 1ae: bipush 1
      // 1af: bipush 4
      // 1b0: bipush 6
      // 1b2: bipush 3
      // 1b3: bipush 4
      // 1b4: bipush 6
      // 1b6: getstatic ox_.bj8 Lizd;
      // 1b9: invokevirtual izd.l4i ()Lzfz;
      // 1bc: getstatic ox_.bj8 Lizd;
      // 1bf: invokevirtual izd.l4i ()Lzfz;
      // 1c2: bipush 0
      // 1c3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1c6: aload 0
      // 1c7: aload 1
      // 1c8: aload 3
      // 1c9: bipush 5
      // 1ca: bipush 1
      // 1cb: bipush 7
      // 1cd: bipush 7
      // 1cf: bipush 1
      // 1d0: bipush 8
      // 1d2: bipush 0
      // 1d3: aload 2
      // 1d4: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 1d7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 1da: aload 0
      // 1db: aload 1
      // 1dc: aload 3
      // 1dd: bipush 5
      // 1de: bipush 1
      // 1df: bipush 9
      // 1e1: bipush 7
      // 1e3: bipush 1
      // 1e4: bipush 9
      // 1e6: getstatic ox_.bj8 Lizd;
      // 1e9: invokevirtual izd.l4i ()Lzfz;
      // 1ec: getstatic ox_.bj8 Lizd;
      // 1ef: invokevirtual izd.l4i ()Lzfz;
      // 1f2: bipush 0
      // 1f3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1f6: aload 0
      // 1f7: aload 1
      // 1f8: aload 3
      // 1f9: bipush 5
      // 1fa: bipush 2
      // 1fb: bipush 7
      // 1fd: bipush 7
      // 1ff: bipush 2
      // 200: bipush 7
      // 202: getstatic ox_.bj8 Lizd;
      // 205: invokevirtual izd.l4i ()Lzfz;
      // 208: getstatic ox_.bj8 Lizd;
      // 20b: invokevirtual izd.l4i ()Lzfz;
      // 20e: bipush 0
      // 20f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 212: aload 0
      // 213: aload 1
      // 214: aload 3
      // 215: bipush 4
      // 216: bipush 5
      // 217: bipush 7
      // 219: bipush 4
      // 21a: bipush 5
      // 21b: bipush 9
      // 21d: getstatic ox_.bj8 Lizd;
      // 220: invokevirtual izd.l4i ()Lzfz;
      // 223: getstatic ox_.bj8 Lizd;
      // 226: invokevirtual izd.l4i ()Lzfz;
      // 229: bipush 0
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 22d: aload 0
      // 22e: aload 1
      // 22f: aload 3
      // 230: bipush 8
      // 232: bipush 5
      // 233: bipush 7
      // 235: bipush 8
      // 237: bipush 5
      // 238: bipush 9
      // 23a: getstatic ox_.bj8 Lizd;
      // 23d: invokevirtual izd.l4i ()Lzfz;
      // 240: getstatic ox_.bj8 Lizd;
      // 243: invokevirtual izd.l4i ()Lzfz;
      // 246: bipush 0
      // 247: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 24a: aload 0
      // 24b: aload 1
      // 24c: aload 3
      // 24d: bipush 5
      // 24e: bipush 5
      // 24f: bipush 7
      // 251: bipush 7
      // 253: bipush 5
      // 254: bipush 9
      // 256: getstatic ox_.yvz Lizd;
      // 259: invokevirtual izd.l4i ()Lzfz;
      // 25c: getstatic ox_.yvz Lizd;
      // 25f: invokevirtual izd.l4i ()Lzfz;
      // 262: bipush 0
      // 263: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 266: aload 0
      // 267: aload 1
      // 268: getstatic ox_.gt8 Le0x;
      // 26b: invokevirtual e0x.l4i ()Lzfz;
      // 26e: bipush 6
      // 270: bipush 5
      // 271: bipush 6
      // 273: aload 3
      // 274: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing.lzy (Lt9d;Lzfz;IIILyve;)V
      // 277: bipush 1
      // 278: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1566616780429290946L, 1006559581737851893L, MethodHandles.lookup().lookupClass()).a(29988178164077L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 80523609819864L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u0014ñ¿_\f\u009ez\u0001D^.í\u0096\u008d$\u0095\u0010Ly\u0091\u0090¦\u0084E½ëªú\u0084]\b°ã \u001cÁ\u000f¿T\"wÝGYÙÒÿÃÅÜ§V¾o]]±íUl\u0080\u0090üÉ25 G))¥¨Ó}y\u009cáç5ÏJ§í\u0081J\u0082\u0003.\u0006\u001dd\u0002¼q\u009eèá\u009c\" \u008aSú·%%/Oã¨\u0096\rG(møË&Gïáuö\u0089+H?y;ì\u0092H\u0018[ ¢\u00159\u0001f1ð7Îâup\u008dKÊ,\u0019÷´Å\u0001O";
      int var8 = "\u0014ñ¿_\f\u009ez\u0001D^.í\u0096\u008d$\u0095\u0010Ly\u0091\u0090¦\u0084E½ëªú\u0084]\b°ã \u001cÁ\u000f¿T\"wÝGYÙÒÿÃÅÜ§V¾o]]±íUl\u0080\u0090üÉ25 G))¥¨Ó}y\u009cáç5ÏJ§í\u0081J\u0082\u0003.\u0006\u001dd\u0002¼q\u009eèá\u009c\" \u008aSú·%%/Oã¨\u0096\rG(møË&Gïáuö\u0089+H?y;ì\u0092H\u0018[ ¢\u00159\u0001f1ð7Îâup\u008dKÊ,\u0019÷´Å\u0001O"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     k = var9;
                     l = new String[8];
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

                  var6 = "Û ¹DÈ&º\u0085üYX©<¼ô\u009d-§4T&i^n gO©Ù\n6W\u0002õAmÁÖ\u009a0\u0093tþÝu½#ø-Ô\u00987\u0086\t\u0086¬ð";
                  var8 = "Û ¹DÈ&º\u0085üYX©<¼ô\u009d-§4T&i^n gO©Ù\n6W\u0002õAmÁÖ\u009a0\u0093tþÝu½#ø-Ô\u00987\u0086\t\u0086¬ð".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32554;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
