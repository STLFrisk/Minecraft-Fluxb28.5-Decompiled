package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StructureMineshaftPieces$Room extends xi1 {
   private List yqo = Lists.newLinkedList();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);

   public StructureMineshaftPieces$Room() {
   }

   public StructureMineshaftPieces$Room(int var1, Random var2, int var3, int var4) {
      super(var1);
      this.yqm = new yve(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
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
      // 000: aload 0
      // 001: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.gd3 ()I
      // 004: istore 5
      // 006: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 009: aload 0
      // 00a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 00d: invokevirtual yve.v8b ()I
      // 010: bipush 3
      // 011: isub
      // 012: bipush 1
      // 013: isub
      // 014: istore 6
      // 016: astore 4
      // 018: iload 6
      // 01a: aload 4
      // 01c: ifnull 02d
      // 01f: ifgt 02c
      // 022: goto 029
      // 025: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 028: athrow
      // 029: bipush 1
      // 02a: istore 6
      // 02c: bipush 0
      // 02d: istore 7
      // 02f: iload 7
      // 031: aload 0
      // 032: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 035: invokevirtual yve.num ()I
      // 038: if_icmpge 0f0
      // 03b: iload 7
      // 03d: aload 3
      // 03e: aload 0
      // 03f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 042: invokevirtual yve.num ()I
      // 045: invokevirtual java/util/Random.nextInt (I)I
      // 048: iadd
      // 049: istore 7
      // 04b: iload 7
      // 04d: bipush 3
      // 04e: iadd
      // 04f: aload 0
      // 050: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 053: invokevirtual yve.num ()I
      // 056: aload 4
      // 058: ifnull 0fc
      // 05b: if_icmple 068
      // 05e: goto 065
      // 061: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 064: athrow
      // 065: goto 0f0
      // 068: aload 1
      // 069: aload 2
      // 06a: aload 3
      // 06b: aload 0
      // 06c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 06f: getfield yve.gdj I
      // 072: iload 7
      // 074: iadd
      // 075: aload 0
      // 076: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 079: getfield yve._3o I
      // 07c: aload 3
      // 07d: iload 6
      // 07f: invokevirtual java/util/Random.nextInt (I)I
      // 082: iadd
      // 083: bipush 1
      // 084: iadd
      // 085: aload 0
      // 086: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 089: getfield yve.ob0 I
      // 08c: bipush 1
      // 08d: isub
      // 08e: getstatic vt2.z9q Lvt2;
      // 091: iload 5
      // 093: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 096: astore 8
      // 098: aload 4
      // 09a: ifnull 0eb
      // 09d: aload 8
      // 09f: ifnull 0e5
      // 0a2: goto 0a9
      // 0a5: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 8
      // 0ab: invokevirtual xi1.q1q ()Lyve;
      // 0ae: astore 9
      // 0b0: aload 0
      // 0b1: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqo Ljava/util/List;
      // 0b4: new yve
      // 0b7: dup
      // 0b8: aload 9
      // 0ba: getfield yve.gdj I
      // 0bd: aload 9
      // 0bf: getfield yve._3o I
      // 0c2: aload 0
      // 0c3: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 0c6: getfield yve.ob0 I
      // 0c9: aload 9
      // 0cb: getfield yve.kwp I
      // 0ce: aload 9
      // 0d0: getfield yve.ixv I
      // 0d3: aload 0
      // 0d4: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 0d7: getfield yve.ob0 I
      // 0da: bipush 1
      // 0db: iadd
      // 0dc: invokespecial yve.<init> (IIIIII)V
      // 0df: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e4: pop
      // 0e5: iload 7
      // 0e7: bipush 4
      // 0e8: iadd
      // 0e9: istore 7
      // 0eb: aload 4
      // 0ed: ifnonnull 02f
      // 0f0: bipush 0
      // 0f1: istore 7
      // 0f3: iload 7
      // 0f5: aload 0
      // 0f6: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 0f9: invokevirtual yve.num ()I
      // 0fc: if_icmpge 1b4
      // 0ff: iload 7
      // 101: aload 3
      // 102: aload 0
      // 103: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 106: invokevirtual yve.num ()I
      // 109: invokevirtual java/util/Random.nextInt (I)I
      // 10c: iadd
      // 10d: istore 7
      // 10f: iload 7
      // 111: bipush 3
      // 112: iadd
      // 113: aload 0
      // 114: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 117: invokevirtual yve.num ()I
      // 11a: aload 4
      // 11c: ifnull 1c0
      // 11f: if_icmple 12c
      // 122: goto 129
      // 125: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 128: athrow
      // 129: goto 1b4
      // 12c: aload 1
      // 12d: aload 2
      // 12e: aload 3
      // 12f: aload 0
      // 130: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 133: getfield yve.gdj I
      // 136: iload 7
      // 138: iadd
      // 139: aload 0
      // 13a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 13d: getfield yve._3o I
      // 140: aload 3
      // 141: iload 6
      // 143: invokevirtual java/util/Random.nextInt (I)I
      // 146: iadd
      // 147: bipush 1
      // 148: iadd
      // 149: aload 0
      // 14a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 14d: getfield yve.nwc I
      // 150: bipush 1
      // 151: iadd
      // 152: getstatic vt2.mxp Lvt2;
      // 155: iload 5
      // 157: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 15a: astore 8
      // 15c: aload 4
      // 15e: ifnull 1af
      // 161: aload 8
      // 163: ifnull 1a9
      // 166: goto 16d
      // 169: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aload 8
      // 16f: invokevirtual xi1.q1q ()Lyve;
      // 172: astore 9
      // 174: aload 0
      // 175: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqo Ljava/util/List;
      // 178: new yve
      // 17b: dup
      // 17c: aload 9
      // 17e: getfield yve.gdj I
      // 181: aload 9
      // 183: getfield yve._3o I
      // 186: aload 0
      // 187: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 18a: getfield yve.nwc I
      // 18d: bipush 1
      // 18e: isub
      // 18f: aload 9
      // 191: getfield yve.kwp I
      // 194: aload 9
      // 196: getfield yve.ixv I
      // 199: aload 0
      // 19a: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 19d: getfield yve.nwc I
      // 1a0: invokespecial yve.<init> (IIIIII)V
      // 1a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a8: pop
      // 1a9: iload 7
      // 1ab: bipush 4
      // 1ac: iadd
      // 1ad: istore 7
      // 1af: aload 4
      // 1b1: ifnonnull 0f3
      // 1b4: bipush 0
      // 1b5: istore 7
      // 1b7: iload 7
      // 1b9: aload 0
      // 1ba: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 1bd: invokevirtual yve.ut6 ()I
      // 1c0: if_icmpge 278
      // 1c3: iload 7
      // 1c5: aload 3
      // 1c6: aload 0
      // 1c7: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 1ca: invokevirtual yve.ut6 ()I
      // 1cd: invokevirtual java/util/Random.nextInt (I)I
      // 1d0: iadd
      // 1d1: istore 7
      // 1d3: iload 7
      // 1d5: bipush 3
      // 1d6: iadd
      // 1d7: aload 0
      // 1d8: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 1db: invokevirtual yve.ut6 ()I
      // 1de: aload 4
      // 1e0: ifnull 284
      // 1e3: if_icmple 1f0
      // 1e6: goto 1ed
      // 1e9: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: goto 278
      // 1f0: aload 1
      // 1f1: aload 2
      // 1f2: aload 3
      // 1f3: aload 0
      // 1f4: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 1f7: getfield yve.gdj I
      // 1fa: bipush 1
      // 1fb: isub
      // 1fc: aload 0
      // 1fd: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 200: getfield yve._3o I
      // 203: aload 3
      // 204: iload 6
      // 206: invokevirtual java/util/Random.nextInt (I)I
      // 209: iadd
      // 20a: bipush 1
      // 20b: iadd
      // 20c: aload 0
      // 20d: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 210: getfield yve.ob0 I
      // 213: iload 7
      // 215: iadd
      // 216: getstatic vt2.te4 Lvt2;
      // 219: iload 5
      // 21b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 21e: astore 8
      // 220: aload 4
      // 222: ifnull 273
      // 225: aload 8
      // 227: ifnull 26d
      // 22a: goto 231
      // 22d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 230: athrow
      // 231: aload 8
      // 233: invokevirtual xi1.q1q ()Lyve;
      // 236: astore 9
      // 238: aload 0
      // 239: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqo Ljava/util/List;
      // 23c: new yve
      // 23f: dup
      // 240: aload 0
      // 241: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 244: getfield yve.gdj I
      // 247: aload 9
      // 249: getfield yve._3o I
      // 24c: aload 9
      // 24e: getfield yve.ob0 I
      // 251: aload 0
      // 252: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 255: getfield yve.gdj I
      // 258: bipush 1
      // 259: iadd
      // 25a: aload 9
      // 25c: getfield yve.ixv I
      // 25f: aload 9
      // 261: getfield yve.nwc I
      // 264: invokespecial yve.<init> (IIIIII)V
      // 267: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 26c: pop
      // 26d: iload 7
      // 26f: bipush 4
      // 270: iadd
      // 271: istore 7
      // 273: aload 4
      // 275: ifnonnull 1b7
      // 278: bipush 0
      // 279: istore 7
      // 27b: iload 7
      // 27d: aload 0
      // 27e: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 281: invokevirtual yve.ut6 ()I
      // 284: if_icmpge 334
      // 287: iload 7
      // 289: aload 3
      // 28a: aload 0
      // 28b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 28e: invokevirtual yve.ut6 ()I
      // 291: invokevirtual java/util/Random.nextInt (I)I
      // 294: iadd
      // 295: istore 7
      // 297: iload 7
      // 299: bipush 3
      // 29a: iadd
      // 29b: aload 0
      // 29c: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 29f: invokevirtual yve.ut6 ()I
      // 2a2: if_icmple 2ac
      // 2a5: goto 334
      // 2a8: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: aload 1
      // 2ad: aload 2
      // 2ae: aload 3
      // 2af: aload 0
      // 2b0: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 2b3: getfield yve.kwp I
      // 2b6: bipush 1
      // 2b7: iadd
      // 2b8: aload 0
      // 2b9: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 2bc: getfield yve._3o I
      // 2bf: aload 3
      // 2c0: iload 6
      // 2c2: invokevirtual java/util/Random.nextInt (I)I
      // 2c5: iadd
      // 2c6: bipush 1
      // 2c7: iadd
      // 2c8: aload 0
      // 2c9: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 2cc: getfield yve.ob0 I
      // 2cf: iload 7
      // 2d1: iadd
      // 2d2: getstatic vt2.zk4 Lvt2;
      // 2d5: iload 5
      // 2d7: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.tba (Lxi1;Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 2da: astore 8
      // 2dc: aload 4
      // 2de: ifnull 32f
      // 2e1: aload 8
      // 2e3: ifnull 329
      // 2e6: goto 2ed
      // 2e9: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: aload 8
      // 2ef: invokevirtual xi1.q1q ()Lyve;
      // 2f2: astore 9
      // 2f4: aload 0
      // 2f5: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqo Ljava/util/List;
      // 2f8: new yve
      // 2fb: dup
      // 2fc: aload 0
      // 2fd: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 300: getfield yve.kwp I
      // 303: bipush 1
      // 304: isub
      // 305: aload 9
      // 307: getfield yve._3o I
      // 30a: aload 9
      // 30c: getfield yve.ob0 I
      // 30f: aload 0
      // 310: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 313: getfield yve.kwp I
      // 316: aload 9
      // 318: getfield yve.ixv I
      // 31b: aload 9
      // 31d: getfield yve.nwc I
      // 320: invokespecial yve.<init> (IIIIII)V
      // 323: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 328: pop
      // 329: iload 7
      // 32b: bipush 4
      // 32c: iadd
      // 32d: istore 7
      // 32f: aload 4
      // 331: ifnonnull 27b
      // 334: return
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
      // 008: aload 4
      // 00a: ifnull 060
      // 00d: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.knc (Lt9d;Lyve;)Z
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: aload 0
      // 024: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 027: getfield yve.gdj I
      // 02a: aload 0
      // 02b: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 02e: getfield yve._3o I
      // 031: aload 0
      // 032: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 035: getfield yve.ob0 I
      // 038: aload 0
      // 039: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 03c: getfield yve.kwp I
      // 03f: aload 0
      // 040: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 043: getfield yve._3o I
      // 046: aload 0
      // 047: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 04a: getfield yve.nwc I
      // 04d: getstatic ox_.kqk Le0x;
      // 050: invokevirtual e0x.l4i ()Lzfz;
      // 053: getstatic ox_.ibw Le0x;
      // 056: invokevirtual e0x.l4i ()Lzfz;
      // 059: bipush 1
      // 05a: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 05d: aload 0
      // 05e: aload 1
      // 05f: aload 3
      // 060: aload 0
      // 061: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 064: getfield yve.gdj I
      // 067: aload 0
      // 068: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 06b: getfield yve._3o I
      // 06e: bipush 1
      // 06f: iadd
      // 070: aload 0
      // 071: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 074: getfield yve.ob0 I
      // 077: aload 0
      // 078: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 07b: getfield yve.kwp I
      // 07e: aload 0
      // 07f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 082: getfield yve._3o I
      // 085: bipush 3
      // 086: iadd
      // 087: aload 0
      // 088: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 08b: getfield yve.ixv I
      // 08e: invokestatic java/lang/Math.min (II)I
      // 091: aload 0
      // 092: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 095: getfield yve.nwc I
      // 098: getstatic ox_.ibw Le0x;
      // 09b: invokevirtual e0x.l4i ()Lzfz;
      // 09e: getstatic ox_.ibw Le0x;
      // 0a1: invokevirtual e0x.l4i ()Lzfz;
      // 0a4: bipush 0
      // 0a5: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0a8: aload 0
      // 0a9: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqo Ljava/util/List;
      // 0ac: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b1: astore 5
      // 0b3: aload 5
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 10d
      // 0bd: aload 5
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: checkcast yve
      // 0c7: astore 6
      // 0c9: aload 0
      // 0ca: aload 1
      // 0cb: aload 3
      // 0cc: aload 6
      // 0ce: getfield yve.gdj I
      // 0d1: aload 6
      // 0d3: getfield yve.ixv I
      // 0d6: bipush 2
      // 0d7: isub
      // 0d8: aload 6
      // 0da: getfield yve.ob0 I
      // 0dd: aload 6
      // 0df: getfield yve.kwp I
      // 0e2: aload 6
      // 0e4: getfield yve.ixv I
      // 0e7: aload 6
      // 0e9: getfield yve.nwc I
      // 0ec: getstatic ox_.ibw Le0x;
      // 0ef: invokevirtual e0x.l4i ()Lzfz;
      // 0f2: getstatic ox_.ibw Le0x;
      // 0f5: invokevirtual e0x.l4i ()Lzfz;
      // 0f8: bipush 0
      // 0f9: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0fc: aload 4
      // 0fe: ifnull 146
      // 101: aload 4
      // 103: ifnonnull 0b3
      // 106: goto 10d
      // 109: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 0
      // 10e: aload 1
      // 10f: aload 3
      // 110: aload 0
      // 111: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 114: getfield yve.gdj I
      // 117: aload 0
      // 118: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 11b: getfield yve._3o I
      // 11e: bipush 4
      // 11f: iadd
      // 120: aload 0
      // 121: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 124: getfield yve.ob0 I
      // 127: aload 0
      // 128: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 12b: getfield yve.kwp I
      // 12e: aload 0
      // 12f: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 132: getfield yve.ixv I
      // 135: aload 0
      // 136: getfield net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.yqm Lyve;
      // 139: getfield yve.nwc I
      // 13c: getstatic ox_.ibw Le0x;
      // 13f: invokevirtual e0x.l4i ()Lzfz;
      // 142: bipush 0
      // 143: invokevirtual net/minecraft/world/gen/structure/StructureMineshaftPieces$Room.iep (Lt9d;Lyve;IIIIIILzfz;Z)V
      // 146: bipush 1
      // 147: ireturn
   }

   @Override
   public void zqi(int var1, int var2, int var3) {
      super.zqi(var1, var2, var3);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      Iterator var5 = this.yqo.iterator();
      i2h[] var4 = var10000;

      while (var5.hasNext()) {
         yve var6 = (yve)var5.next();
         var6.gbw(var1, var2, var3);
         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 72796704807388L;
      qhg var5 = new qhg();
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      Iterator var6 = this.yqo.iterator();
      i2h[] var4 = var10000;

      while (true) {
         if (var6.hasNext()) {
            yve var7 = (yve)var6.next();

            try {
               var5.w2j(var7.ubs());
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         var1.rzm(b<"y">(482, 4008550266215242013L ^ var2), var5);
         break;
      }
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 66412542644407L;
      qhg var5 = var1.bzb(b<"y">(6539, 887024410194561054L ^ var2), 11);
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      int var6 = 0;
      i2h[] var4 = var10000;

      while (var6 < var5.vek()) {
         this.yqo.add(new yve(var5.y90(var6)));
         var6++;
         if (var4 == null) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8977461382086856603L, 7459185815773221946L, MethodHandles.lookup().lookupClass()).a(247560848399359L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 122313526464168L;
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
      String var6 = "Ø!\\5\\øÚrÇD{\u0016ó^\u0083XÞêIÓûkã\u001d\u0099'æ¥Ò«íö \u0095^O\u0013S\u0095\u008cÓ¡\u0087Y\u0082oe`Ük½\u0081Æ¬Ï\u009bïUr¦\u0003\u0017\u0094QZ";
      int var8 = "Ø!\\5\\øÚrÇD{\u0016ó^\u0083XÞêIÓûkã\u001d\u0099'æ¥Ò«íö \u0095^O\u0013S\u0095\u008cÓ¡\u0087Y\u0082oe`Ük½\u0081Æ¬Ï\u009bïUr¦\u0003\u0017\u0094QZ"
         .length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23993;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces$Room", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces$Room" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
