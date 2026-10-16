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

public class StructureMineshaftPieces$Cross extends xi1 {
   private vt2 pb0;
   private boolean zv5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);

   public StructureMineshaftPieces$Cross() {
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 7639072321532L;
      var1.zyu(b<"q">(16157, 8090596230219141198L ^ var2), this.zv5);
      var1.iin("D", this.pb0.tmy());
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 132633716156055L;
      this.zv5 = var1.dvl(b<"q">(2245, 3423506327437668092L ^ var2));
      this.pb0 = vt2.bm6(var1.uz7("D"));
   }

   public StructureMineshaftPieces$Cross(int param1, Random param2, yve param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokespecial xi1.<init> (I)V
      // 05: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 08: aload 0
      // 09: aload 4
      // 0b: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.pb0 Lvt2;
      // 0e: astore 5
      // 10: aload 0
      // 11: aload 3
      // 12: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 15: aload 0
      // 16: aload 3
      // 17: invokevirtual yve.v8b ()I
      // 1a: aload 5
      // 1c: ifnull 32
      // 1f: bipush 3
      // 20: if_icmple 35
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 31: athrow
      // 32: goto 36
      // 35: bipush 0
      // 36: putfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.zv5 Z
      // 39: return
   }

   public static yve hxa(List param0, Random param1, int param2, int param3, int param4, vt2 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 6
      // 005: new yve
      // 008: dup
      // 009: iload 2
      // 00a: iload 3
      // 00b: iload 4
      // 00d: iload 2
      // 00e: iload 3
      // 00f: bipush 2
      // 010: iadd
      // 011: iload 4
      // 013: invokespecial yve.<init> (IIIIII)V
      // 016: astore 7
      // 018: aload 1
      // 019: bipush 4
      // 01a: invokevirtual java/util/Random.nextInt (I)I
      // 01d: aload 6
      // 01f: ifnull 047
      // 022: ifne 03e
      // 025: goto 02c
      // 028: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 7
      // 02e: dup
      // 02f: getfield yve.ixv I
      // 032: bipush 4
      // 033: iadd
      // 034: putfield yve.ixv I
      // 037: goto 03e
      // 03a: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 03d: athrow
      // 03e: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$1.u_1 [I
      // 041: aload 5
      // 043: invokevirtual vt2.ordinal ()I
      // 046: iaload
      // 047: tableswitch 174 1 4 29 66 103 141
      // 064: aload 7
      // 066: iload 2
      // 067: bipush 1
      // 068: isub
      // 069: putfield yve.gdj I
      // 06c: aload 7
      // 06e: iload 2
      // 06f: bipush 3
      // 070: iadd
      // 071: putfield yve.kwp I
      // 074: aload 7
      // 076: iload 4
      // 078: bipush 4
      // 079: isub
      // 07a: putfield yve.ob0 I
      // 07d: aload 6
      // 07f: ifnonnull 0f5
      // 082: goto 089
      // 085: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 7
      // 08b: iload 2
      // 08c: bipush 1
      // 08d: isub
      // 08e: putfield yve.gdj I
      // 091: aload 7
      // 093: iload 2
      // 094: bipush 3
      // 095: iadd
      // 096: putfield yve.kwp I
      // 099: aload 7
      // 09b: iload 4
      // 09d: bipush 4
      // 09e: iadd
      // 09f: putfield yve.nwc I
      // 0a2: aload 6
      // 0a4: ifnonnull 0f5
      // 0a7: goto 0ae
      // 0aa: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 7
      // 0b0: iload 2
      // 0b1: bipush 4
      // 0b2: isub
      // 0b3: putfield yve.gdj I
      // 0b6: aload 7
      // 0b8: iload 4
      // 0ba: bipush 1
      // 0bb: isub
      // 0bc: putfield yve.ob0 I
      // 0bf: aload 7
      // 0c1: iload 4
      // 0c3: bipush 3
      // 0c4: iadd
      // 0c5: putfield yve.nwc I
      // 0c8: aload 6
      // 0ca: ifnonnull 0f5
      // 0cd: goto 0d4
      // 0d0: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 7
      // 0d6: iload 2
      // 0d7: bipush 4
      // 0d8: iadd
      // 0d9: putfield yve.kwp I
      // 0dc: aload 7
      // 0de: iload 4
      // 0e0: bipush 1
      // 0e1: isub
      // 0e2: putfield yve.ob0 I
      // 0e5: aload 7
      // 0e7: iload 4
      // 0e9: bipush 3
      // 0ea: iadd
      // 0eb: putfield yve.nwc I
      // 0ee: goto 0f5
      // 0f1: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: aload 7
      // 0f8: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 0fb: ifnull 106
      // 0fe: aconst_null
      // 0ff: goto 108
      // 102: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 7
      // 108: areturn
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
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gd3 ()I
      // 009: istore 5
      // 00b: getstatic net/minecraft/world/gen/structure/StructureMineshaftPieces$1.u_1 [I
      // 00e: aload 0
      // 00f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.pb0 Lvt2;
      // 012: invokevirtual vt2.ordinal ()I
      // 015: iaload
      // 016: aload 4
      // 018: ifnull 227
      // 01b: tableswitch 520 1 4 33 156 279 402
      // 038: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 1
      // 03d: aload 2
      // 03e: aload 3
      // 03f: aload 0
      // 040: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 043: getfield yve.gdj I
      // 046: bipush 1
      // 047: iadd
      // 048: aload 0
      // 049: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 04c: getfield yve._3o I
      // 04f: aload 0
      // 050: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 053: getfield yve.ob0 I
      // 056: bipush 1
      // 057: isub
      // 058: getstatic vt2.z9q Lvt2;
      // 05b: iload 5
      // 05d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 060: pop
      // 061: aload 1
      // 062: aload 2
      // 063: aload 3
      // 064: aload 0
      // 065: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 068: getfield yve.gdj I
      // 06b: bipush 1
      // 06c: isub
      // 06d: aload 0
      // 06e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 071: getfield yve._3o I
      // 074: aload 0
      // 075: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 078: getfield yve.ob0 I
      // 07b: bipush 1
      // 07c: iadd
      // 07d: getstatic vt2.te4 Lvt2;
      // 080: iload 5
      // 082: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 085: pop
      // 086: aload 1
      // 087: aload 2
      // 088: aload 3
      // 089: aload 0
      // 08a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 08d: getfield yve.kwp I
      // 090: bipush 1
      // 091: iadd
      // 092: aload 0
      // 093: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 096: getfield yve._3o I
      // 099: aload 0
      // 09a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 09d: getfield yve.ob0 I
      // 0a0: bipush 1
      // 0a1: iadd
      // 0a2: getstatic vt2.zk4 Lvt2;
      // 0a5: iload 5
      // 0a7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 0aa: pop
      // 0ab: aload 4
      // 0ad: ifnonnull 223
      // 0b0: goto 0b7
      // 0b3: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: aload 2
      // 0b9: aload 3
      // 0ba: aload 0
      // 0bb: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0be: getfield yve.gdj I
      // 0c1: bipush 1
      // 0c2: iadd
      // 0c3: aload 0
      // 0c4: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0c7: getfield yve._3o I
      // 0ca: aload 0
      // 0cb: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0ce: getfield yve.nwc I
      // 0d1: bipush 1
      // 0d2: iadd
      // 0d3: getstatic vt2.mxp Lvt2;
      // 0d6: iload 5
      // 0d8: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 0db: pop
      // 0dc: aload 1
      // 0dd: aload 2
      // 0de: aload 3
      // 0df: aload 0
      // 0e0: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0e3: getfield yve.gdj I
      // 0e6: bipush 1
      // 0e7: isub
      // 0e8: aload 0
      // 0e9: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0ec: getfield yve._3o I
      // 0ef: aload 0
      // 0f0: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0f3: getfield yve.ob0 I
      // 0f6: bipush 1
      // 0f7: iadd
      // 0f8: getstatic vt2.te4 Lvt2;
      // 0fb: iload 5
      // 0fd: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 100: pop
      // 101: aload 1
      // 102: aload 2
      // 103: aload 3
      // 104: aload 0
      // 105: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 108: getfield yve.kwp I
      // 10b: bipush 1
      // 10c: iadd
      // 10d: aload 0
      // 10e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 111: getfield yve._3o I
      // 114: aload 0
      // 115: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 118: getfield yve.ob0 I
      // 11b: bipush 1
      // 11c: iadd
      // 11d: getstatic vt2.zk4 Lvt2;
      // 120: iload 5
      // 122: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 125: pop
      // 126: aload 4
      // 128: ifnonnull 223
      // 12b: goto 132
      // 12e: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 1
      // 133: aload 2
      // 134: aload 3
      // 135: aload 0
      // 136: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 139: getfield yve.gdj I
      // 13c: bipush 1
      // 13d: iadd
      // 13e: aload 0
      // 13f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 142: getfield yve._3o I
      // 145: aload 0
      // 146: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 149: getfield yve.ob0 I
      // 14c: bipush 1
      // 14d: isub
      // 14e: getstatic vt2.z9q Lvt2;
      // 151: iload 5
      // 153: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 156: pop
      // 157: aload 1
      // 158: aload 2
      // 159: aload 3
      // 15a: aload 0
      // 15b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 15e: getfield yve.gdj I
      // 161: bipush 1
      // 162: iadd
      // 163: aload 0
      // 164: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 167: getfield yve._3o I
      // 16a: aload 0
      // 16b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 16e: getfield yve.nwc I
      // 171: bipush 1
      // 172: iadd
      // 173: getstatic vt2.mxp Lvt2;
      // 176: iload 5
      // 178: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 17b: pop
      // 17c: aload 1
      // 17d: aload 2
      // 17e: aload 3
      // 17f: aload 0
      // 180: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 183: getfield yve.gdj I
      // 186: bipush 1
      // 187: isub
      // 188: aload 0
      // 189: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 18c: getfield yve._3o I
      // 18f: aload 0
      // 190: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 193: getfield yve.ob0 I
      // 196: bipush 1
      // 197: iadd
      // 198: getstatic vt2.te4 Lvt2;
      // 19b: iload 5
      // 19d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1a0: pop
      // 1a1: aload 4
      // 1a3: ifnonnull 223
      // 1a6: goto 1ad
      // 1a9: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 1
      // 1ae: aload 2
      // 1af: aload 3
      // 1b0: aload 0
      // 1b1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1b4: getfield yve.gdj I
      // 1b7: bipush 1
      // 1b8: iadd
      // 1b9: aload 0
      // 1ba: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1bd: getfield yve._3o I
      // 1c0: aload 0
      // 1c1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1c4: getfield yve.ob0 I
      // 1c7: bipush 1
      // 1c8: isub
      // 1c9: getstatic vt2.z9q Lvt2;
      // 1cc: iload 5
      // 1ce: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1d1: pop
      // 1d2: aload 1
      // 1d3: aload 2
      // 1d4: aload 3
      // 1d5: aload 0
      // 1d6: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1d9: getfield yve.gdj I
      // 1dc: bipush 1
      // 1dd: iadd
      // 1de: aload 0
      // 1df: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1e2: getfield yve._3o I
      // 1e5: aload 0
      // 1e6: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1e9: getfield yve.nwc I
      // 1ec: bipush 1
      // 1ed: iadd
      // 1ee: getstatic vt2.mxp Lvt2;
      // 1f1: iload 5
      // 1f3: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 1f6: pop
      // 1f7: aload 1
      // 1f8: aload 2
      // 1f9: aload 3
      // 1fa: aload 0
      // 1fb: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1fe: getfield yve.kwp I
      // 201: bipush 1
      // 202: iadd
      // 203: aload 0
      // 204: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 207: getfield yve._3o I
      // 20a: aload 0
      // 20b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 20e: getfield yve.ob0 I
      // 211: bipush 1
      // 212: iadd
      // 213: getstatic vt2.zk4 Lvt2;
      // 216: iload 5
      // 218: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 21b: pop
      // 21c: goto 223
      // 21f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 222: athrow
      // 223: aload 0
      // 224: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.zv5 Z
      // 227: aload 4
      // 229: ifnull 241
      // 22c: ifeq 33d
      // 22f: goto 236
      // 232: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 235: athrow
      // 236: aload 3
      // 237: invokevirtual java/util/Random.nextBoolean ()Z
      // 23a: goto 241
      // 23d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 240: athrow
      // 241: aload 4
      // 243: ifnull 284
      // 246: ifeq 280
      // 249: goto 250
      // 24c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 24f: athrow
      // 250: aload 1
      // 251: aload 2
      // 252: aload 3
      // 253: aload 0
      // 254: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 257: getfield yve.gdj I
      // 25a: bipush 1
      // 25b: iadd
      // 25c: aload 0
      // 25d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 260: getfield yve._3o I
      // 263: bipush 3
      // 264: iadd
      // 265: bipush 1
      // 266: iadd
      // 267: aload 0
      // 268: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 26b: getfield yve.ob0 I
      // 26e: bipush 1
      // 26f: isub
      // 270: getstatic vt2.z9q Lvt2;
      // 273: iload 5
      // 275: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 278: pop
      // 279: goto 280
      // 27c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 27f: athrow
      // 280: aload 3
      // 281: invokevirtual java/util/Random.nextBoolean ()Z
      // 284: aload 4
      // 286: ifnull 2c7
      // 289: ifeq 2c3
      // 28c: goto 293
      // 28f: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 292: athrow
      // 293: aload 1
      // 294: aload 2
      // 295: aload 3
      // 296: aload 0
      // 297: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 29a: getfield yve.gdj I
      // 29d: bipush 1
      // 29e: isub
      // 29f: aload 0
      // 2a0: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2a3: getfield yve._3o I
      // 2a6: bipush 3
      // 2a7: iadd
      // 2a8: bipush 1
      // 2a9: iadd
      // 2aa: aload 0
      // 2ab: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2ae: getfield yve.ob0 I
      // 2b1: bipush 1
      // 2b2: iadd
      // 2b3: getstatic vt2.te4 Lvt2;
      // 2b6: iload 5
      // 2b8: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 2bb: pop
      // 2bc: goto 2c3
      // 2bf: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: aload 3
      // 2c4: invokevirtual java/util/Random.nextBoolean ()Z
      // 2c7: aload 4
      // 2c9: ifnull 30a
      // 2cc: ifeq 306
      // 2cf: goto 2d6
      // 2d2: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: aload 1
      // 2d7: aload 2
      // 2d8: aload 3
      // 2d9: aload 0
      // 2da: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2dd: getfield yve.kwp I
      // 2e0: bipush 1
      // 2e1: iadd
      // 2e2: aload 0
      // 2e3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2e6: getfield yve._3o I
      // 2e9: bipush 3
      // 2ea: iadd
      // 2eb: bipush 1
      // 2ec: iadd
      // 2ed: aload 0
      // 2ee: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2f1: getfield yve.ob0 I
      // 2f4: bipush 1
      // 2f5: iadd
      // 2f6: getstatic vt2.zk4 Lvt2;
      // 2f9: iload 5
      // 2fb: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 2fe: pop
      // 2ff: goto 306
      // 302: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 305: athrow
      // 306: aload 3
      // 307: invokevirtual java/util/Random.nextBoolean ()Z
      // 30a: ifeq 33d
      // 30d: aload 1
      // 30e: aload 2
      // 30f: aload 3
      // 310: aload 0
      // 311: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 314: getfield yve.gdj I
      // 317: bipush 1
      // 318: iadd
      // 319: aload 0
      // 31a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 31d: getfield yve._3o I
      // 320: bipush 3
      // 321: iadd
      // 322: bipush 1
      // 323: iadd
      // 324: aload 0
      // 325: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 328: getfield yve.nwc I
      // 32b: bipush 1
      // 32c: iadd
      // 32d: getstatic vt2.mxp Lvt2;
      // 330: iload 5
      // 332: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 335: pop
      // 336: goto 33d
      // 339: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 33c: athrow
      // 33d: return
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
      // 006: aload 1
      // 007: aload 3
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 030
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 4
      // 023: ifnull 1e1
      // 026: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.zv5 Z
      // 029: goto 030
      // 02c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 02f: athrow
      // 030: ifeq 198
      // 033: aload 0
      // 034: aload 1
      // 035: aload 3
      // 036: aload 0
      // 037: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 03a: getfield yve.gdj I
      // 03d: bipush 1
      // 03e: iadd
      // 03f: aload 0
      // 040: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 043: getfield yve._3o I
      // 046: aload 0
      // 047: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 04a: getfield yve.ob0 I
      // 04d: aload 0
      // 04e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 051: getfield yve.kwp I
      // 054: bipush 1
      // 055: isub
      // 056: aload 0
      // 057: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 05a: getfield yve._3o I
      // 05d: bipush 3
      // 05e: iadd
      // 05f: bipush 1
      // 060: isub
      // 061: aload 0
      // 062: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 065: getfield yve.nwc I
      // 068: getstatic ox_.ibw Le0x;
      // 06b: invokevirtual e0x.l4i ()Lzfz;
      // 06e: getstatic ox_.ibw Le0x;
      // 071: invokevirtual e0x.l4i ()Lzfz;
      // 074: bipush 0
      // 075: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 078: aload 0
      // 079: aload 1
      // 07a: aload 3
      // 07b: aload 0
      // 07c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 07f: getfield yve.gdj I
      // 082: aload 0
      // 083: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 086: getfield yve._3o I
      // 089: aload 0
      // 08a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 08d: getfield yve.ob0 I
      // 090: bipush 1
      // 091: iadd
      // 092: aload 0
      // 093: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 096: getfield yve.kwp I
      // 099: aload 0
      // 09a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 09d: getfield yve._3o I
      // 0a0: bipush 3
      // 0a1: iadd
      // 0a2: bipush 1
      // 0a3: isub
      // 0a4: aload 0
      // 0a5: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0a8: getfield yve.nwc I
      // 0ab: bipush 1
      // 0ac: isub
      // 0ad: getstatic ox_.ibw Le0x;
      // 0b0: invokevirtual e0x.l4i ()Lzfz;
      // 0b3: getstatic ox_.ibw Le0x;
      // 0b6: invokevirtual e0x.l4i ()Lzfz;
      // 0b9: bipush 0
      // 0ba: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: aload 3
      // 0c0: aload 0
      // 0c1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0c4: getfield yve.gdj I
      // 0c7: bipush 1
      // 0c8: iadd
      // 0c9: aload 0
      // 0ca: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0cd: getfield yve.ixv I
      // 0d0: bipush 2
      // 0d1: isub
      // 0d2: aload 0
      // 0d3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0d6: getfield yve.ob0 I
      // 0d9: aload 0
      // 0da: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0dd: getfield yve.kwp I
      // 0e0: bipush 1
      // 0e1: isub
      // 0e2: aload 0
      // 0e3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0e6: getfield yve.ixv I
      // 0e9: aload 0
      // 0ea: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 0ed: getfield yve.nwc I
      // 0f0: getstatic ox_.ibw Le0x;
      // 0f3: invokevirtual e0x.l4i ()Lzfz;
      // 0f6: getstatic ox_.ibw Le0x;
      // 0f9: invokevirtual e0x.l4i ()Lzfz;
      // 0fc: bipush 0
      // 0fd: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 100: aload 0
      // 101: aload 1
      // 102: aload 3
      // 103: aload 0
      // 104: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 107: getfield yve.gdj I
      // 10a: aload 0
      // 10b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 10e: getfield yve.ixv I
      // 111: bipush 2
      // 112: isub
      // 113: aload 0
      // 114: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 117: getfield yve.ob0 I
      // 11a: bipush 1
      // 11b: iadd
      // 11c: aload 0
      // 11d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 120: getfield yve.kwp I
      // 123: aload 0
      // 124: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 127: getfield yve.ixv I
      // 12a: aload 0
      // 12b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 12e: getfield yve.nwc I
      // 131: bipush 1
      // 132: isub
      // 133: getstatic ox_.ibw Le0x;
      // 136: invokevirtual e0x.l4i ()Lzfz;
      // 139: getstatic ox_.ibw Le0x;
      // 13c: invokevirtual e0x.l4i ()Lzfz;
      // 13f: bipush 0
      // 140: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 143: aload 0
      // 144: aload 1
      // 145: aload 3
      // 146: aload 0
      // 147: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 14a: getfield yve.gdj I
      // 14d: bipush 1
      // 14e: iadd
      // 14f: aload 0
      // 150: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 153: getfield yve._3o I
      // 156: bipush 3
      // 157: iadd
      // 158: aload 0
      // 159: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 15c: getfield yve.ob0 I
      // 15f: bipush 1
      // 160: iadd
      // 161: aload 0
      // 162: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 165: getfield yve.kwp I
      // 168: bipush 1
      // 169: isub
      // 16a: aload 0
      // 16b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 16e: getfield yve._3o I
      // 171: bipush 3
      // 172: iadd
      // 173: aload 0
      // 174: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 177: getfield yve.nwc I
      // 17a: bipush 1
      // 17b: isub
      // 17c: getstatic ox_.ibw Le0x;
      // 17f: invokevirtual e0x.l4i ()Lzfz;
      // 182: getstatic ox_.ibw Le0x;
      // 185: invokevirtual e0x.l4i ()Lzfz;
      // 188: bipush 0
      // 189: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 18c: aload 4
      // 18e: ifnonnull 221
      // 191: goto 198
      // 194: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: aload 1
      // 19a: aload 3
      // 19b: aload 0
      // 19c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 19f: getfield yve.gdj I
      // 1a2: bipush 1
      // 1a3: iadd
      // 1a4: aload 0
      // 1a5: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1a8: getfield yve._3o I
      // 1ab: aload 0
      // 1ac: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1af: getfield yve.ob0 I
      // 1b2: aload 0
      // 1b3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1b6: getfield yve.kwp I
      // 1b9: bipush 1
      // 1ba: isub
      // 1bb: aload 0
      // 1bc: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1bf: getfield yve.ixv I
      // 1c2: aload 0
      // 1c3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1c6: getfield yve.nwc I
      // 1c9: getstatic ox_.ibw Le0x;
      // 1cc: invokevirtual e0x.l4i ()Lzfz;
      // 1cf: getstatic ox_.ibw Le0x;
      // 1d2: invokevirtual e0x.l4i ()Lzfz;
      // 1d5: bipush 0
      // 1d6: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 1d9: aload 0
      // 1da: goto 1e1
      // 1dd: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: aload 1
      // 1e2: aload 3
      // 1e3: aload 0
      // 1e4: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1e7: getfield yve.gdj I
      // 1ea: aload 0
      // 1eb: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1ee: getfield yve._3o I
      // 1f1: aload 0
      // 1f2: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1f5: getfield yve.ob0 I
      // 1f8: bipush 1
      // 1f9: iadd
      // 1fa: aload 0
      // 1fb: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 1fe: getfield yve.kwp I
      // 201: aload 0
      // 202: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 205: getfield yve.ixv I
      // 208: aload 0
      // 209: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 20c: getfield yve.nwc I
      // 20f: bipush 1
      // 210: isub
      // 211: getstatic ox_.ibw Le0x;
      // 214: invokevirtual e0x.l4i ()Lzfz;
      // 217: getstatic ox_.ibw Le0x;
      // 21a: invokevirtual e0x.l4i ()Lzfz;
      // 21d: bipush 0
      // 21e: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 221: aload 0
      // 222: aload 1
      // 223: aload 3
      // 224: aload 0
      // 225: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 228: getfield yve.gdj I
      // 22b: bipush 1
      // 22c: iadd
      // 22d: aload 0
      // 22e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 231: getfield yve._3o I
      // 234: aload 0
      // 235: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 238: getfield yve.ob0 I
      // 23b: bipush 1
      // 23c: iadd
      // 23d: aload 0
      // 23e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 241: getfield yve.gdj I
      // 244: bipush 1
      // 245: iadd
      // 246: aload 0
      // 247: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 24a: getfield yve.ixv I
      // 24d: aload 0
      // 24e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 251: getfield yve.ob0 I
      // 254: bipush 1
      // 255: iadd
      // 256: getstatic ox_.wb7 Le0x;
      // 259: invokevirtual e0x.l4i ()Lzfz;
      // 25c: getstatic ox_.ibw Le0x;
      // 25f: invokevirtual e0x.l4i ()Lzfz;
      // 262: bipush 0
      // 263: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 266: aload 0
      // 267: aload 1
      // 268: aload 3
      // 269: aload 0
      // 26a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 26d: getfield yve.gdj I
      // 270: bipush 1
      // 271: iadd
      // 272: aload 0
      // 273: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 276: getfield yve._3o I
      // 279: aload 0
      // 27a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 27d: getfield yve.nwc I
      // 280: bipush 1
      // 281: isub
      // 282: aload 0
      // 283: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 286: getfield yve.gdj I
      // 289: bipush 1
      // 28a: iadd
      // 28b: aload 0
      // 28c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 28f: getfield yve.ixv I
      // 292: aload 0
      // 293: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 296: getfield yve.nwc I
      // 299: bipush 1
      // 29a: isub
      // 29b: getstatic ox_.wb7 Le0x;
      // 29e: invokevirtual e0x.l4i ()Lzfz;
      // 2a1: getstatic ox_.ibw Le0x;
      // 2a4: invokevirtual e0x.l4i ()Lzfz;
      // 2a7: bipush 0
      // 2a8: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2ab: aload 0
      // 2ac: aload 1
      // 2ad: aload 3
      // 2ae: aload 0
      // 2af: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2b2: getfield yve.kwp I
      // 2b5: bipush 1
      // 2b6: isub
      // 2b7: aload 0
      // 2b8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2bb: getfield yve._3o I
      // 2be: aload 0
      // 2bf: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2c2: getfield yve.ob0 I
      // 2c5: bipush 1
      // 2c6: iadd
      // 2c7: aload 0
      // 2c8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2cb: getfield yve.kwp I
      // 2ce: bipush 1
      // 2cf: isub
      // 2d0: aload 0
      // 2d1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2d4: getfield yve.ixv I
      // 2d7: aload 0
      // 2d8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2db: getfield yve.ob0 I
      // 2de: bipush 1
      // 2df: iadd
      // 2e0: getstatic ox_.wb7 Le0x;
      // 2e3: invokevirtual e0x.l4i ()Lzfz;
      // 2e6: getstatic ox_.ibw Le0x;
      // 2e9: invokevirtual e0x.l4i ()Lzfz;
      // 2ec: bipush 0
      // 2ed: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 2f0: aload 0
      // 2f1: aload 1
      // 2f2: aload 3
      // 2f3: aload 0
      // 2f4: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 2f7: getfield yve.kwp I
      // 2fa: bipush 1
      // 2fb: isub
      // 2fc: aload 0
      // 2fd: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 300: getfield yve._3o I
      // 303: aload 0
      // 304: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 307: getfield yve.nwc I
      // 30a: bipush 1
      // 30b: isub
      // 30c: aload 0
      // 30d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 310: getfield yve.kwp I
      // 313: bipush 1
      // 314: isub
      // 315: aload 0
      // 316: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 319: getfield yve.ixv I
      // 31c: aload 0
      // 31d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 320: getfield yve.nwc I
      // 323: bipush 1
      // 324: isub
      // 325: getstatic ox_.wb7 Le0x;
      // 328: invokevirtual e0x.l4i ()Lzfz;
      // 32b: getstatic ox_.ibw Le0x;
      // 32e: invokevirtual e0x.l4i ()Lzfz;
      // 331: bipush 0
      // 332: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 335: aload 0
      // 336: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 339: getfield yve.gdj I
      // 33c: istore 5
      // 33e: iload 5
      // 340: aload 0
      // 341: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 344: getfield yve.kwp I
      // 347: if_icmpgt 3c6
      // 34a: aload 0
      // 34b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 34e: getfield yve.ob0 I
      // 351: aload 4
      // 353: ifnull 3c7
      // 356: istore 6
      // 358: iload 6
      // 35a: aload 0
      // 35b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 35e: getfield yve.nwc I
      // 361: if_icmpgt 3be
      // 364: aload 0
      // 365: aload 4
      // 367: ifnull 34b
      // 36a: aload 1
      // 36b: aload 4
      // 36d: ifnull 39f
      // 370: iload 5
      // 372: aload 0
      // 373: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 376: getfield yve._3o I
      // 379: bipush 1
      // 37a: isub
      // 37b: iload 6
      // 37d: aload 3
      // 37e: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.t90 (Lt9d;IIILyve;)Lzfz;
      // 381: invokeinterface zfz.r_y ()Le0x; 1
      // 386: invokevirtual e0x.p1r ()Lp3y;
      // 389: getstatic p3y.cei Lp3y;
      // 38c: if_acmpne 3b6
      // 38f: goto 396
      // 392: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 395: athrow
      // 396: aload 0
      // 397: aload 1
      // 398: goto 39f
      // 39b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.a (Loov;)Loov;
      // 39e: athrow
      // 39f: getstatic ox_.wb7 Le0x;
      // 3a2: invokevirtual e0x.l4i ()Lzfz;
      // 3a5: iload 5
      // 3a7: aload 0
      // 3a8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.yqm Lyve;
      // 3ab: getfield yve._3o I
      // 3ae: bipush 1
      // 3af: isub
      // 3b0: iload 6
      // 3b2: aload 3
      // 3b3: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross.lzy (Lt9d;Lzfz;IIILyve;)V
      // 3b6: iinc 6 1
      // 3b9: aload 4
      // 3bb: ifnonnull 358
      // 3be: iinc 5 1
      // 3c1: aload 4
      // 3c3: ifnonnull 33e
      // 3c6: bipush 1
      // 3c7: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8382547897621444479L, 9004148933088736239L, MethodHandles.lookup().lookupClass()).a(257003471822154L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 59034836708252L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u001d\u007f\b4h\u0093R6W~µb[\fl»\u0010\b\"õ_=\u0092ÞM\u008c  Û?¿\u009fl";
      int var8 = "\u001d\u007f\b4h\u0093R6W~µb[\fl»\u0010\b\"õ_=\u0092ÞM\u008c  Û?¿\u009fl".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27156;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
