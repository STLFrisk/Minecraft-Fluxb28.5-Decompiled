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

public class StructureStrongholdPieces$PortalRoom extends StructureStrongholdPieces$Stronghold {
   private boolean b6o;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$PortalRoom() {
   }

   public StructureStrongholdPieces$PortalRoom(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 28323112486927L;
      super.z0d(var1);
      var1.zyu(c<"p">(5387, 641703134166545518L ^ var2), this.b6o);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 113875969589604L;
      super.oqf(var1);
      this.b6o = var1.dvl(c<"p">(27605, 3155759558344524762L ^ var2));
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      EntityLivingBase[] var4 = StructureStrongholdPieces$Stronghold.b();

      xi1 var10000;
      label20: {
         try {
            var10000 = var1;
            if (var4 == null) {
               break label20;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      ((StructureStrongholdPieces$Stairs2)var10000).oo1 = this;
   }

   public static StructureStrongholdPieces$PortalRoom b_y(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 06: bipush -1
      // 07: bipush 0
      // 08: bipush 11
      // 0a: bipush 8
      // 0c: bipush 16
      // 0e: aload 5
      // 10: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 13: astore 7
      // 15: aload 7
      // 17: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.jty (Lyve;)Z
      // 1a: ifeq 42
      // 1d: aload 0
      // 1e: aload 7
      // 20: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 23: ifnonnull 42
      // 26: goto 2d
      // 29: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 2c: athrow
      // 2d: new net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom
      // 30: dup
      // 31: iload 6
      // 33: aload 1
      // 34: aload 7
      // 36: aload 5
      // 38: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
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
      // 000: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.b J
      // 003: ldc2_w 9133185552012
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: aload 1
      // 00b: aload 3
      // 00c: bipush 0
      // 00d: bipush 0
      // 00e: bipush 0
      // 00f: bipush 10
      // 011: bipush 7
      // 013: bipush 15
      // 015: bipush 0
      // 016: aload 2
      // 017: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 01a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 01d: aload 0
      // 01e: aload 1
      // 01f: aload 2
      // 020: aload 3
      // 021: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.r67 Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 024: bipush 4
      // 025: bipush 1
      // 026: bipush 0
      // 027: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 02a: bipush 6
      // 02c: istore 7
      // 02e: aload 0
      // 02f: aload 1
      // 030: aload 3
      // 031: bipush 1
      // 032: iload 7
      // 034: bipush 1
      // 035: bipush 1
      // 036: iload 7
      // 038: bipush 14
      // 03a: bipush 0
      // 03b: aload 2
      // 03c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 03f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 042: aload 0
      // 043: aload 1
      // 044: aload 3
      // 045: bipush 9
      // 047: iload 7
      // 049: bipush 1
      // 04a: bipush 9
      // 04c: iload 7
      // 04e: bipush 14
      // 050: bipush 0
      // 051: aload 2
      // 052: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 055: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 058: aload 0
      // 059: aload 1
      // 05a: aload 3
      // 05b: bipush 2
      // 05c: iload 7
      // 05e: bipush 1
      // 05f: bipush 8
      // 061: iload 7
      // 063: bipush 2
      // 064: bipush 0
      // 065: aload 2
      // 066: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 069: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 06c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 06f: aload 0
      // 070: aload 1
      // 071: aload 3
      // 072: bipush 2
      // 073: iload 7
      // 075: bipush 14
      // 077: bipush 8
      // 079: iload 7
      // 07b: bipush 14
      // 07d: bipush 0
      // 07e: aload 2
      // 07f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 082: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 085: aload 0
      // 086: aload 1
      // 087: aload 3
      // 088: bipush 1
      // 089: bipush 1
      // 08a: bipush 1
      // 08b: bipush 2
      // 08c: bipush 1
      // 08d: bipush 4
      // 08e: bipush 0
      // 08f: aload 2
      // 090: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 093: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 096: aload 0
      // 097: aload 1
      // 098: aload 3
      // 099: bipush 8
      // 09b: bipush 1
      // 09c: bipush 1
      // 09d: bipush 9
      // 09f: bipush 1
      // 0a0: bipush 4
      // 0a1: bipush 0
      // 0a2: aload 2
      // 0a3: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 0a6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0a9: aload 0
      // 0aa: aload 1
      // 0ab: aload 3
      // 0ac: bipush 1
      // 0ad: bipush 1
      // 0ae: bipush 1
      // 0af: bipush 1
      // 0b0: bipush 1
      // 0b1: bipush 3
      // 0b2: getstatic ox_.dr2 L_13;
      // 0b5: invokevirtual _13.l4i ()Lzfz;
      // 0b8: getstatic ox_.dr2 L_13;
      // 0bb: invokevirtual _13.l4i ()Lzfz;
      // 0be: bipush 0
      // 0bf: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c2: aload 0
      // 0c3: aload 1
      // 0c4: aload 3
      // 0c5: bipush 9
      // 0c7: bipush 1
      // 0c8: bipush 1
      // 0c9: bipush 9
      // 0cb: bipush 1
      // 0cc: bipush 3
      // 0cd: getstatic ox_.dr2 L_13;
      // 0d0: invokevirtual _13.l4i ()Lzfz;
      // 0d3: getstatic ox_.dr2 L_13;
      // 0d6: invokevirtual _13.l4i ()Lzfz;
      // 0d9: bipush 0
      // 0da: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0dd: aload 0
      // 0de: aload 1
      // 0df: aload 3
      // 0e0: bipush 3
      // 0e1: bipush 1
      // 0e2: bipush 8
      // 0e4: bipush 7
      // 0e6: bipush 1
      // 0e7: bipush 12
      // 0e9: bipush 0
      // 0ea: aload 2
      // 0eb: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 0ee: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 0f1: aload 0
      // 0f2: aload 1
      // 0f3: aload 3
      // 0f4: bipush 4
      // 0f5: bipush 1
      // 0f6: bipush 9
      // 0f8: bipush 6
      // 0fa: bipush 1
      // 0fb: bipush 11
      // 0fd: getstatic ox_.dr2 L_13;
      // 100: invokevirtual _13.l4i ()Lzfz;
      // 103: getstatic ox_.dr2 L_13;
      // 106: invokevirtual _13.l4i ()Lzfz;
      // 109: bipush 0
      // 10a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 10d: bipush 3
      // 10e: istore 8
      // 110: astore 6
      // 112: iload 8
      // 114: bipush 14
      // 116: if_icmpge 165
      // 119: aload 0
      // 11a: aload 1
      // 11b: aload 3
      // 11c: bipush 0
      // 11d: bipush 3
      // 11e: iload 8
      // 120: bipush 0
      // 121: bipush 4
      // 122: iload 8
      // 124: getstatic ox_.ytr Le0x;
      // 127: invokevirtual e0x.l4i ()Lzfz;
      // 12a: getstatic ox_.ytr Le0x;
      // 12d: invokevirtual e0x.l4i ()Lzfz;
      // 130: bipush 0
      // 131: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 134: aload 0
      // 135: aload 1
      // 136: aload 3
      // 137: bipush 10
      // 139: bipush 3
      // 13a: iload 8
      // 13c: bipush 10
      // 13e: bipush 4
      // 13f: iload 8
      // 141: getstatic ox_.ytr Le0x;
      // 144: invokevirtual e0x.l4i ()Lzfz;
      // 147: getstatic ox_.ytr Le0x;
      // 14a: invokevirtual e0x.l4i ()Lzfz;
      // 14d: bipush 0
      // 14e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 151: iinc 8 2
      // 154: aload 6
      // 156: ifnull 168
      // 159: aload 6
      // 15b: ifnonnull 112
      // 15e: goto 165
      // 161: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 164: athrow
      // 165: bipush 2
      // 166: istore 8
      // 168: iload 8
      // 16a: bipush 9
      // 16c: if_icmpge 1a7
      // 16f: aload 0
      // 170: aload 1
      // 171: aload 3
      // 172: iload 8
      // 174: bipush 3
      // 175: bipush 15
      // 177: iload 8
      // 179: bipush 4
      // 17a: bipush 15
      // 17c: getstatic ox_.ytr Le0x;
      // 17f: invokevirtual e0x.l4i ()Lzfz;
      // 182: getstatic ox_.ytr Le0x;
      // 185: invokevirtual e0x.l4i ()Lzfz;
      // 188: bipush 0
      // 189: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 18c: iinc 8 2
      // 18f: aload 6
      // 191: ifnull 1ec
      // 194: goto 19b
      // 197: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 6
      // 19d: ifnonnull 168
      // 1a0: goto 1a7
      // 1a3: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: getstatic ox_.clp Le0x;
      // 1ab: bipush 3
      // 1ac: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.ujv (Le0x;I)I
      // 1af: istore 8
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: aload 3
      // 1b4: bipush 4
      // 1b5: bipush 1
      // 1b6: bipush 5
      // 1b7: bipush 6
      // 1b9: bipush 1
      // 1ba: bipush 7
      // 1bc: bipush 0
      // 1bd: aload 2
      // 1be: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 1c1: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 1c4: aload 0
      // 1c5: aload 1
      // 1c6: aload 3
      // 1c7: bipush 4
      // 1c8: bipush 2
      // 1c9: bipush 6
      // 1cb: bipush 6
      // 1cd: bipush 2
      // 1ce: bipush 7
      // 1d0: bipush 0
      // 1d1: aload 2
      // 1d2: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 1d5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 1d8: aload 0
      // 1d9: aload 1
      // 1da: aload 3
      // 1db: bipush 4
      // 1dc: bipush 3
      // 1dd: bipush 7
      // 1df: bipush 6
      // 1e1: bipush 3
      // 1e2: bipush 7
      // 1e4: bipush 0
      // 1e5: aload 2
      // 1e6: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 1e9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 1ec: bipush 4
      // 1ed: istore 9
      // 1ef: iload 9
      // 1f1: bipush 6
      // 1f3: if_icmpgt 241
      // 1f6: aload 0
      // 1f7: aload 1
      // 1f8: getstatic ox_.clp Le0x;
      // 1fb: iload 8
      // 1fd: invokevirtual e0x.kig (I)Lzfz;
      // 200: iload 9
      // 202: bipush 1
      // 203: bipush 4
      // 204: aload 3
      // 205: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 208: aload 0
      // 209: aload 1
      // 20a: getstatic ox_.clp Le0x;
      // 20d: iload 8
      // 20f: invokevirtual e0x.kig (I)Lzfz;
      // 212: iload 9
      // 214: bipush 2
      // 215: bipush 5
      // 216: aload 3
      // 217: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 21a: aload 0
      // 21b: aload 1
      // 21c: getstatic ox_.clp Le0x;
      // 21f: iload 8
      // 221: invokevirtual e0x.kig (I)Lzfz;
      // 224: iload 9
      // 226: bipush 3
      // 227: bipush 6
      // 229: aload 3
      // 22a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 22d: iinc 9 1
      // 230: aload 6
      // 232: ifnull 249
      // 235: aload 6
      // 237: ifnonnull 1ef
      // 23a: goto 241
      // 23d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 240: athrow
      // 241: getstatic vt2.z9q Lvt2;
      // 244: invokevirtual vt2.tmy ()I
      // 247: istore 9
      // 249: getstatic vt2.mxp Lvt2;
      // 24c: invokevirtual vt2.tmy ()I
      // 24f: istore 10
      // 251: getstatic vt2.zk4 Lvt2;
      // 254: invokevirtual vt2.tmy ()I
      // 257: istore 11
      // 259: getstatic vt2.te4 Lvt2;
      // 25c: invokevirtual vt2.tmy ()I
      // 25f: istore 12
      // 261: aload 0
      // 262: aload 6
      // 264: ifnull 303
      // 267: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.p7m Lvt2;
      // 26a: ifnull 302
      // 26d: goto 274
      // 270: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 273: athrow
      // 274: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$3.dds [I
      // 277: aload 0
      // 278: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.p7m Lvt2;
      // 27b: invokevirtual vt2.ordinal ()I
      // 27e: iaload
      // 27f: aload 6
      // 281: ifnull 2b6
      // 284: goto 28b
      // 287: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 28a: athrow
      // 28b: tableswitch 119 1 3 29 50 87
      // 2a4: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 2a7: athrow
      // 2a8: getstatic vt2.mxp Lvt2;
      // 2ab: invokevirtual vt2.tmy ()I
      // 2ae: istore 9
      // 2b0: getstatic vt2.z9q Lvt2;
      // 2b3: invokevirtual vt2.tmy ()I
      // 2b6: istore 10
      // 2b8: aload 6
      // 2ba: ifnonnull 302
      // 2bd: getstatic vt2.te4 Lvt2;
      // 2c0: invokevirtual vt2.tmy ()I
      // 2c3: istore 9
      // 2c5: getstatic vt2.zk4 Lvt2;
      // 2c8: invokevirtual vt2.tmy ()I
      // 2cb: istore 10
      // 2cd: getstatic vt2.mxp Lvt2;
      // 2d0: invokevirtual vt2.tmy ()I
      // 2d3: istore 11
      // 2d5: getstatic vt2.z9q Lvt2;
      // 2d8: invokevirtual vt2.tmy ()I
      // 2db: istore 12
      // 2dd: aload 6
      // 2df: ifnonnull 302
      // 2e2: getstatic vt2.zk4 Lvt2;
      // 2e5: invokevirtual vt2.tmy ()I
      // 2e8: istore 9
      // 2ea: getstatic vt2.te4 Lvt2;
      // 2ed: invokevirtual vt2.tmy ()I
      // 2f0: istore 10
      // 2f2: getstatic vt2.mxp Lvt2;
      // 2f5: invokevirtual vt2.tmy ()I
      // 2f8: istore 11
      // 2fa: getstatic vt2.z9q Lvt2;
      // 2fd: invokevirtual vt2.tmy ()I
      // 300: istore 12
      // 302: aload 0
      // 303: aload 1
      // 304: getstatic ox_.e0w Le0x;
      // 307: iload 9
      // 309: invokevirtual e0x.kig (I)Lzfz;
      // 30c: getstatic bjx.i1i Lh76;
      // 30f: aload 2
      // 310: invokevirtual java/util/Random.nextFloat ()F
      // 313: ldc 0.9
      // 315: nop
      // 316: fcmpl
      // 317: aload 6
      // 319: ifnull 327
      // 31c: ifle 32a
      // 31f: goto 326
      // 322: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 325: athrow
      // 326: bipush 1
      // 327: goto 32b
      // 32a: bipush 0
      // 32b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 32e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 333: bipush 4
      // 334: bipush 3
      // 335: bipush 8
      // 337: aload 3
      // 338: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 33b: aload 0
      // 33c: aload 1
      // 33d: getstatic ox_.e0w Le0x;
      // 340: iload 9
      // 342: invokevirtual e0x.kig (I)Lzfz;
      // 345: getstatic bjx.i1i Lh76;
      // 348: aload 2
      // 349: invokevirtual java/util/Random.nextFloat ()F
      // 34c: ldc 0.9
      // 34e: nop
      // 34f: fcmpl
      // 350: aload 6
      // 352: ifnull 360
      // 355: ifle 363
      // 358: goto 35f
      // 35b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 35e: athrow
      // 35f: bipush 1
      // 360: goto 364
      // 363: bipush 0
      // 364: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 367: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36c: bipush 5
      // 36d: bipush 3
      // 36e: bipush 8
      // 370: aload 3
      // 371: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 374: aload 0
      // 375: aload 1
      // 376: getstatic ox_.e0w Le0x;
      // 379: iload 9
      // 37b: invokevirtual e0x.kig (I)Lzfz;
      // 37e: getstatic bjx.i1i Lh76;
      // 381: aload 2
      // 382: invokevirtual java/util/Random.nextFloat ()F
      // 385: ldc 0.9
      // 387: nop
      // 388: fcmpl
      // 389: aload 6
      // 38b: ifnull 399
      // 38e: ifle 39c
      // 391: goto 398
      // 394: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 397: athrow
      // 398: bipush 1
      // 399: goto 39d
      // 39c: bipush 0
      // 39d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3a0: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3a5: bipush 6
      // 3a7: bipush 3
      // 3a8: bipush 8
      // 3aa: aload 3
      // 3ab: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3ae: aload 0
      // 3af: aload 1
      // 3b0: getstatic ox_.e0w Le0x;
      // 3b3: iload 10
      // 3b5: invokevirtual e0x.kig (I)Lzfz;
      // 3b8: getstatic bjx.i1i Lh76;
      // 3bb: aload 2
      // 3bc: invokevirtual java/util/Random.nextFloat ()F
      // 3bf: ldc 0.9
      // 3c1: nop
      // 3c2: fcmpl
      // 3c3: aload 6
      // 3c5: ifnull 3d3
      // 3c8: ifle 3d6
      // 3cb: goto 3d2
      // 3ce: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 3d1: athrow
      // 3d2: bipush 1
      // 3d3: goto 3d7
      // 3d6: bipush 0
      // 3d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3da: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3df: bipush 4
      // 3e0: bipush 3
      // 3e1: bipush 12
      // 3e3: aload 3
      // 3e4: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3e7: aload 0
      // 3e8: aload 1
      // 3e9: getstatic ox_.e0w Le0x;
      // 3ec: iload 10
      // 3ee: invokevirtual e0x.kig (I)Lzfz;
      // 3f1: getstatic bjx.i1i Lh76;
      // 3f4: aload 2
      // 3f5: invokevirtual java/util/Random.nextFloat ()F
      // 3f8: ldc 0.9
      // 3fa: nop
      // 3fb: fcmpl
      // 3fc: aload 6
      // 3fe: ifnull 40c
      // 401: ifle 40f
      // 404: goto 40b
      // 407: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 40a: athrow
      // 40b: bipush 1
      // 40c: goto 410
      // 40f: bipush 0
      // 410: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 413: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 418: bipush 5
      // 419: bipush 3
      // 41a: bipush 12
      // 41c: aload 3
      // 41d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 420: aload 0
      // 421: aload 1
      // 422: getstatic ox_.e0w Le0x;
      // 425: iload 10
      // 427: invokevirtual e0x.kig (I)Lzfz;
      // 42a: getstatic bjx.i1i Lh76;
      // 42d: aload 2
      // 42e: invokevirtual java/util/Random.nextFloat ()F
      // 431: ldc 0.9
      // 433: nop
      // 434: fcmpl
      // 435: aload 6
      // 437: ifnull 445
      // 43a: ifle 448
      // 43d: goto 444
      // 440: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 443: athrow
      // 444: bipush 1
      // 445: goto 449
      // 448: bipush 0
      // 449: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 451: bipush 6
      // 453: bipush 3
      // 454: bipush 12
      // 456: aload 3
      // 457: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 45a: aload 0
      // 45b: aload 1
      // 45c: getstatic ox_.e0w Le0x;
      // 45f: iload 11
      // 461: invokevirtual e0x.kig (I)Lzfz;
      // 464: getstatic bjx.i1i Lh76;
      // 467: aload 2
      // 468: invokevirtual java/util/Random.nextFloat ()F
      // 46b: ldc 0.9
      // 46d: nop
      // 46e: fcmpl
      // 46f: aload 6
      // 471: ifnull 47f
      // 474: ifle 482
      // 477: goto 47e
      // 47a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 47d: athrow
      // 47e: bipush 1
      // 47f: goto 483
      // 482: bipush 0
      // 483: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 486: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 48b: bipush 3
      // 48c: bipush 3
      // 48d: bipush 9
      // 48f: aload 3
      // 490: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 493: aload 0
      // 494: aload 1
      // 495: getstatic ox_.e0w Le0x;
      // 498: iload 11
      // 49a: invokevirtual e0x.kig (I)Lzfz;
      // 49d: getstatic bjx.i1i Lh76;
      // 4a0: aload 2
      // 4a1: invokevirtual java/util/Random.nextFloat ()F
      // 4a4: ldc 0.9
      // 4a6: nop
      // 4a7: fcmpl
      // 4a8: aload 6
      // 4aa: ifnull 4b8
      // 4ad: ifle 4bb
      // 4b0: goto 4b7
      // 4b3: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 4b6: athrow
      // 4b7: bipush 1
      // 4b8: goto 4bc
      // 4bb: bipush 0
      // 4bc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4bf: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4c4: bipush 3
      // 4c5: bipush 3
      // 4c6: bipush 10
      // 4c8: aload 3
      // 4c9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 4cc: aload 0
      // 4cd: aload 1
      // 4ce: getstatic ox_.e0w Le0x;
      // 4d1: iload 11
      // 4d3: invokevirtual e0x.kig (I)Lzfz;
      // 4d6: getstatic bjx.i1i Lh76;
      // 4d9: aload 2
      // 4da: invokevirtual java/util/Random.nextFloat ()F
      // 4dd: ldc 0.9
      // 4df: nop
      // 4e0: fcmpl
      // 4e1: aload 6
      // 4e3: ifnull 4f1
      // 4e6: ifle 4f4
      // 4e9: goto 4f0
      // 4ec: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 4ef: athrow
      // 4f0: bipush 1
      // 4f1: goto 4f5
      // 4f4: bipush 0
      // 4f5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4f8: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4fd: bipush 3
      // 4fe: bipush 3
      // 4ff: bipush 11
      // 501: aload 3
      // 502: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 505: aload 0
      // 506: aload 1
      // 507: getstatic ox_.e0w Le0x;
      // 50a: iload 12
      // 50c: invokevirtual e0x.kig (I)Lzfz;
      // 50f: getstatic bjx.i1i Lh76;
      // 512: aload 2
      // 513: invokevirtual java/util/Random.nextFloat ()F
      // 516: ldc 0.9
      // 518: nop
      // 519: fcmpl
      // 51a: aload 6
      // 51c: ifnull 52a
      // 51f: ifle 52d
      // 522: goto 529
      // 525: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 528: athrow
      // 529: bipush 1
      // 52a: goto 52e
      // 52d: bipush 0
      // 52e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 531: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 536: bipush 7
      // 538: bipush 3
      // 539: bipush 9
      // 53b: aload 3
      // 53c: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 53f: aload 0
      // 540: aload 1
      // 541: getstatic ox_.e0w Le0x;
      // 544: iload 12
      // 546: invokevirtual e0x.kig (I)Lzfz;
      // 549: getstatic bjx.i1i Lh76;
      // 54c: aload 2
      // 54d: invokevirtual java/util/Random.nextFloat ()F
      // 550: ldc 0.9
      // 552: nop
      // 553: fcmpl
      // 554: aload 6
      // 556: ifnull 564
      // 559: ifle 567
      // 55c: goto 563
      // 55f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 562: athrow
      // 563: bipush 1
      // 564: goto 568
      // 567: bipush 0
      // 568: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 56b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 570: bipush 7
      // 572: bipush 3
      // 573: bipush 10
      // 575: aload 3
      // 576: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 579: aload 0
      // 57a: aload 1
      // 57b: getstatic ox_.e0w Le0x;
      // 57e: iload 12
      // 580: invokevirtual e0x.kig (I)Lzfz;
      // 583: getstatic bjx.i1i Lh76;
      // 586: aload 2
      // 587: invokevirtual java/util/Random.nextFloat ()F
      // 58a: ldc 0.9
      // 58c: nop
      // 58d: fcmpl
      // 58e: aload 6
      // 590: ifnull 59e
      // 593: ifle 5a1
      // 596: goto 59d
      // 599: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 59c: athrow
      // 59d: bipush 1
      // 59e: goto 5a2
      // 5a1: bipush 0
      // 5a2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5a5: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 5aa: bipush 7
      // 5ac: bipush 3
      // 5ad: bipush 11
      // 5af: aload 3
      // 5b0: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.lzy (Lt9d;Lzfz;IIILyve;)V
      // 5b3: aload 0
      // 5b4: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.b6o Z
      // 5b7: aload 6
      // 5b9: ifnull 64c
      // 5bc: ifne 64b
      // 5bf: goto 5c6
      // 5c2: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 5c5: athrow
      // 5c6: aload 0
      // 5c7: bipush 3
      // 5c8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom._tw (I)I
      // 5cb: istore 7
      // 5cd: new mew
      // 5d0: dup
      // 5d1: aload 0
      // 5d2: bipush 5
      // 5d3: bipush 6
      // 5d5: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.q__ (II)I
      // 5d8: iload 7
      // 5da: aload 0
      // 5db: bipush 5
      // 5dc: bipush 6
      // 5de: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom._ye (II)I
      // 5e1: invokespecial mew.<init> (III)V
      // 5e4: astore 13
      // 5e6: aload 3
      // 5e7: aload 13
      // 5e9: invokevirtual yve.vwy (Lwgo;)Z
      // 5ec: aload 6
      // 5ee: ifnull 64c
      // 5f1: ifeq 64b
      // 5f4: goto 5fb
      // 5f7: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 5fa: athrow
      // 5fb: aload 0
      // 5fc: bipush 1
      // 5fd: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.b6o Z
      // 600: aload 1
      // 601: aload 13
      // 603: getstatic ox_.jvm Le0x;
      // 606: invokevirtual e0x.l4i ()Lzfz;
      // 609: bipush 2
      // 60a: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 60d: pop
      // 60e: aload 1
      // 60f: aload 13
      // 611: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 614: astore 14
      // 616: aload 14
      // 618: instanceof net/minecraft/tileentity/TileEntityMobSpawner
      // 61b: aload 6
      // 61d: ifnull 64c
      // 620: ifeq 64b
      // 623: goto 62a
      // 626: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 629: athrow
      // 62a: aload 14
      // 62c: checkcast net/minecraft/tileentity/TileEntityMobSpawner
      // 62f: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner.ebe ()Laih;
      // 632: sipush 23293
      // 635: ldc2_w 7947843563286625560
      // 638: lload 4
      // 63a: lxor
      // 63b: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 640: nop
      // 641: invokevirtual aih.ugq (Ljava/lang/String;)V
      // 644: goto 64b
      // 647: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom.a (Loov;)Loov;
      // 64a: athrow
      // 64b: bipush 1
      // 64c: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4572357188878229667L, 8224950121901659328L, MethodHandles.lookup().lookupClass()).a(233586333718803L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 71710936458528L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "àÖ\u008dÔÄ«p\u0099z½\fì_6xØ\u0010\u0080\u0014UY=î\u001d;Ê\u008a=%s;É\u0097\u0018Ì2:¤|ãHO\\^(\u0085Î\u0085f\\e\r\n\u00adËD\u0018(";
      int var8 = "àÖ\u008dÔÄ«p\u0099z½\fì_6xØ\u0010\u0080\u0014UY=î\u001d;Ê\u008a=%s;É\u0097\u0018Ì2:¤|ãHO\\^(\u0085Î\u0085f\\e\r\n\u00adËD\u0018(".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            k = var9;
            l = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9250;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$PortalRoom" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
